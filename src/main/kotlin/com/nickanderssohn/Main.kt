package com.nickanderssohn

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Semaphore
import kotlin.concurrent.thread

val numPermits = 1
val javaSemaphore = Semaphore(numPermits)

fun main(args: Array<String>) {
    println("Semaphore w/try-finally:\n")

    // This one should give you (but potentially different thread IDs):
    // Thread 14: Starting!
    // Thread 14: Ending!
    // Thread 15: Starting!
    // Thread 15: Ending!
    testJavaSemaphoreTryFinally()

    Thread.sleep(500)

    println("\nsynchronized suspend func:\n")

    // This one will give you:
    // Thread 16: Starting!
    // Thread 17: Starting!
    // Thread 17: Ending!
    // Thread 16: Ending!
    runBlocking {
        testSynchronizedSeparateThreads()
    }

    Thread.sleep(500)

    println(
        """
            
            Well hey, @Synchronized didn't work even when
            the coroutines were in separate thread. Looks
            like Dan is the man :D (drums/my jokes are the best/you 
            probably have never heard that one before/lol)
        """.trimIndent()
    )

    // Turns out try-finally w/ semaphore is not sufficient
    // to simulate a non-reentrant synchronized function.
    // Kotlin coroutines will handle try-finallys in a nice manner
    // (thank goodness lol), but does not handle the monitor
    // for the synchronized lock in the same manner. If you are
    // curious on how the try-finally is handled, I used intellij
    // to decompile the kotlin bytecode into java for
    // testJavaSemaphoreTryFinally and javaSemaphoreWithDelay
    // and stuck the output in decompiled/Main.decompiled.java.
    // In the decompiled code, you can also see the labels as
    // well as the state machine (look for Continuation var0)
    // that are mentioned in one of the videos Dan has linked
    // in his blog. Here is the video:
    // https://www.youtube.com/watch?v=YrrUCSi72E8
}

fun testJavaSemaphoreTryFinally() {
    repeat(2) {
        thread {
            runBlocking {
                launch { javaSemaphoreWithDelay() }
            }
        }
    }
}

suspend fun javaSemaphoreWithDelay() {
    javaSemaphore.acquire()
    try {
        println("Thread ${Thread.currentThread().id}: Starting!")
        delay(100)
        println("Thread ${Thread.currentThread().id}: Ending!")
    } finally {
        javaSemaphore.release()
    }
}

fun testSynchronizedSeparateThreads() {
    repeat(2) {
        thread {
            runBlocking {
                launch { synchronizedSuspendFunction() }
            }
        }
    }
}

@Synchronized
suspend fun synchronizedSuspendFunction() {
    println("Thread ${Thread.currentThread().id}: Starting!")
    delay(100)
    println("Thread ${Thread.currentThread().id}: Ending!")
}
