// MainKt$testJavaSemaphoreTryFinally$1$1$1.java
package com.nickanderssohn;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(
        f = "Main.kt",
        l = {},
        i = {},
        s = {},
        n = {},
        m = "invokeSuspend",
        c = "com.nickanderssohn.MainKt$testJavaSemaphoreTryFinally$1$1$1"
)
@Metadata(
        mv = {1, 5, 1},
        k = 3,
        d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"},
        d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}
)
final class MainKt$testJavaSemaphoreTryFinally$1$1$1 extends SuspendLambda implements Function2 {
    // $FF: synthetic field
    private Object L$0;
    int label;

    @Nullable
    public final Object invokeSuspend(@NotNull Object var1) {
        Object var3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0:
                ResultKt.throwOnFailure(var1);
                CoroutineScope $this$runBlocking = (CoroutineScope)this.L$0;
                BuildersKt.launch$default($this$runBlocking, (CoroutineContext)null, (CoroutineStart)null, (Function2)(new MainKt$testJavaSemaphoreTryFinally$1$1$1$1((Continuation)null)), 3, (Object)null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    MainKt$testJavaSemaphoreTryFinally$1$1$1(Continuation var1) {
        super(2, var1);
    }

    @NotNull
    public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        MainKt$testJavaSemaphoreTryFinally$1$1$1 var3 = new MainKt$testJavaSemaphoreTryFinally$1$1$1(completion);
        var3.L$0 = value;
        return var3;
    }

    public final Object invoke(Object var1, Object var2) {
        return ((MainKt$testJavaSemaphoreTryFinally$1$1$1)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
    }
}
// MainKt$testJavaSemaphoreTryFinally$1$1$1$1.java
package com.nickanderssohn;

        import kotlin.Metadata;
        import kotlin.ResultKt;
        import kotlin.Unit;
        import kotlin.coroutines.Continuation;
        import kotlin.coroutines.intrinsics.IntrinsicsKt;
        import kotlin.coroutines.jvm.internal.DebugMetadata;
        import kotlin.coroutines.jvm.internal.SuspendLambda;
        import kotlin.jvm.functions.Function2;
        import kotlin.jvm.internal.Intrinsics;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@DebugMetadata(
        f = "Main.kt",
        l = {20},
        i = {},
        s = {},
        n = {},
        m = "invokeSuspend",
        c = "com.nickanderssohn.MainKt$testJavaSemaphoreTryFinally$1$1$1$1"
)
@Metadata(
        mv = {1, 5, 1},
        k = 3,
        d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"},
        d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}
)
final class MainKt$testJavaSemaphoreTryFinally$1$1$1$1 extends SuspendLambda implements Function2 {
    int label;

    @Nullable
    public final Object invokeSuspend(@NotNull Object $result) {
        Object var2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch(this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                this.label = 1;
                if (MainKt.javaSemaphoreWithDelay(this) == var2) {
                    return var2;
                }
                break;
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        return Unit.INSTANCE;
    }

    MainKt$testJavaSemaphoreTryFinally$1$1$1$1(Continuation var1) {
        super(2, var1);
    }

    @NotNull
    public final Continuation create(@Nullable Object value, @NotNull Continuation completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        MainKt$testJavaSemaphoreTryFinally$1$1$1$1 var3 = new MainKt$testJavaSemaphoreTryFinally$1$1$1$1(completion);
        return var3;
    }

    public final Object invoke(Object var1, Object var2) {
        return ((MainKt$testJavaSemaphoreTryFinally$1$1$1$1)this.create(var1, (Continuation)var2)).invokeSuspend(Unit.INSTANCE);
    }
}
// MainKt.java
package com.nickanderssohn;

        import java.util.concurrent.Semaphore;
        import kotlin.Metadata;
        import kotlin.ResultKt;
        import kotlin.Unit;
        import kotlin.concurrent.ThreadsKt;
        import kotlin.coroutines.Continuation;
        import kotlin.coroutines.intrinsics.IntrinsicsKt;
        import kotlin.coroutines.jvm.internal.ContinuationImpl;
        import kotlin.jvm.functions.Function0;
        import kotlin.jvm.internal.Intrinsics;
        import kotlinx.coroutines.DelayKt;
        import org.jetbrains.annotations.NotNull;
        import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 5, 1},
        k = 2,
        d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\b\u001a\u00020\tH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000f\u001a\u0006\u0010\u0010\u001a\u00020\t\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"},
        d2 = {"javaSemaphore", "Ljava/util/concurrent/Semaphore;", "getJavaSemaphore", "()Ljava/util/concurrent/Semaphore;", "numPermits", "", "getNumPermits", "()I", "javaSemaphoreWithDelay", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "main", "args", "", "", "([Ljava/lang/String;)V", "testJavaSemaphoreTryFinally", "suspension-point-investigation"}
)
public final class MainKt {
    private static final int numPermits = 1;
    @NotNull
    private static final Semaphore javaSemaphore;

    public static final int getNumPermits() {
        return numPermits;
    }

    @NotNull
    public static final Semaphore getJavaSemaphore() {
        return javaSemaphore;
    }

    public static final void main(@NotNull String[] args) {
        Intrinsics.checkNotNullParameter(args, "args");
        testJavaSemaphoreTryFinally();
    }

    public static final void testJavaSemaphoreTryFinally() {
        byte var0 = 2;
        boolean var1 = false;
        boolean var2 = false;
        int var6 = 0;

        for(byte var3 = var0; var6 < var3; ++var6) {
            int var5 = false;
            ThreadsKt.thread$default(false, false, (ClassLoader)null, (String)null, 0, (Function0)MainKt$testJavaSemaphoreTryFinally$1$1.INSTANCE, 31, (Object)null);
        }

    }

    @Nullable
    public static final Object javaSemaphoreWithDelay(@NotNull Continuation var0) {
        Object $continuation;
        label181: {
            if (var0 instanceof <undefinedtype>) {
                $continuation = (<undefinedtype>)var0;
                if ((((<undefinedtype>)$continuation).label & Integer.MIN_VALUE) != 0) {
                    ((<undefinedtype>)$continuation).label -= Integer.MIN_VALUE;
                    break label181;
                }
            }

            $continuation = new ContinuationImpl(var0) {
                // $FF: synthetic field
                Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainKt.javaSemaphoreWithDelay(this);
                }
            };
        }

        Throwable var10000;
        label184: {
            Object $result = ((<undefinedtype>)$continuation).result;
            Object var5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            String var1;
            boolean var2;
            boolean var10001;
            StringBuilder var19;
            Thread var21;
            switch(((<undefinedtype>)$continuation).label) {
                case 0:
                    ResultKt.throwOnFailure($result);
                    javaSemaphore.acquire();

                    Object var20;
                    try {
                        var19 = (new StringBuilder()).append("Thread ");
                        var21 = Thread.currentThread();
                        Intrinsics.checkNotNullExpressionValue(var21, "Thread.currentThread()");
                        var1 = var19.append(var21.getId()).append(": Starting!").toString();
                        var2 = false;
                        System.out.println(var1);
                        ((<undefinedtype>)$continuation).label = 1;
                        var20 = DelayKt.delay(500L, (Continuation)$continuation);
                    } catch (Throwable var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label184;
                    }

                    if (var20 == var5) {
                        return var5;
                    }
                    break;
                case 1:
                    try {
                        ResultKt.throwOnFailure($result);
                        break;
                    } catch (Throwable var17) {
                        var10000 = var17;
                        var10001 = false;
                        break label184;
                    }
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            try {
                var19 = (new StringBuilder()).append("Thread ");
                var21 = Thread.currentThread();
                Intrinsics.checkNotNullExpressionValue(var21, "Thread.currentThread()");
                var1 = var19.append(var21.getId()).append(": Ending!").toString();
                var2 = false;
                System.out.println(var1);
            } catch (Throwable var15) {
                var10000 = var15;
                var10001 = false;
                break label184;
            }

            javaSemaphore.release();
            return Unit.INSTANCE;
        }

        Throwable var18 = var10000;
        javaSemaphore.release();
        throw var18;
    }

    static {
        javaSemaphore = new Semaphore(numPermits);
    }
}
// MainKt$testJavaSemaphoreTryFinally$1$1.java
package com.nickanderssohn;

        import kotlin.Metadata;
        import kotlin.Unit;
        import kotlin.coroutines.Continuation;
        import kotlin.coroutines.CoroutineContext;
        import kotlin.jvm.functions.Function0;
        import kotlin.jvm.functions.Function2;
        import kotlin.jvm.internal.Lambda;
        import kotlinx.coroutines.BuildersKt;

@Metadata(
        mv = {1, 5, 1},
        k = 3,
        d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"},
        d2 = {"<anonymous>", "", "invoke"}
)
final class MainKt$testJavaSemaphoreTryFinally$1$1 extends Lambda implements Function0 {
    public static final MainKt$testJavaSemaphoreTryFinally$1$1 INSTANCE = new MainKt$testJavaSemaphoreTryFinally$1$1();

    // $FF: synthetic method
    // $FF: bridge method
    public Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }

    public final void invoke() {
        BuildersKt.runBlocking$default((CoroutineContext)null, (Function2)(new MainKt$testJavaSemaphoreTryFinally$1$1$1((Continuation)null)), 1, (Object)null);
    }

    MainKt$testJavaSemaphoreTryFinally$1$1() {
        super(0);
    }
}
