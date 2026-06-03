package kotlinx.coroutines;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class ThreadPoolDispatcherKt {
    public static /* synthetic */ java.lang.Thread $r8$lambda$Hvo_A1RS2PU7rVE9OhBtvm0S7Js(int r0, java.lang.String r1, java.util.concurrent.atomic.AtomicInteger r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = m2264newFixedThreadPoolContext$lambda1(r0, r1, r2, r3)
            return r0
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newFixedThreadPoolContext(int r2, java.lang.String r3) {
            r0 = 1
            if (r2 < r0) goto L18
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>()
            kotlinx.coroutines.ThreadPoolDispatcherKt$$ExternalSyntheticLambda0 r1 = new kotlinx.coroutines.ThreadPoolDispatcherKt$$ExternalSyntheticLambda0
            r1.<init>(r2, r3, r0)
            java.util.concurrent.ScheduledExecutorService r2 = java.util.concurrent.Executors.newScheduledThreadPool(r2, r1)
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2
            kotlinx.coroutines.ExecutorCoroutineDispatcher r2 = kotlinx.coroutines.ExecutorsKt.from(r2)
            return r2
        L18:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Expected at least one thread, but "
            r3.<init>(r0)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " specified"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    /* JADX INFO: renamed from: newFixedThreadPoolContext$lambda-1, reason: not valid java name */
    private static final java.lang.Thread m2264newFixedThreadPoolContext$lambda1(int r2, java.lang.String r3, java.util.concurrent.atomic.AtomicInteger r4, java.lang.Runnable r5) {
            java.lang.Thread r0 = new java.lang.Thread
            r1 = 1
            if (r2 != r1) goto L6
            goto L21
        L6:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 45
            java.lang.StringBuilder r2 = r2.append(r3)
            int r3 = r4.incrementAndGet()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r2.toString()
        L21:
            r0.<init>(r5, r3)
            r0.setDaemon(r1)
            return r0
    }

    public static final kotlinx.coroutines.ExecutorCoroutineDispatcher newSingleThreadContext(java.lang.String r1) {
            r0 = 1
            kotlinx.coroutines.ExecutorCoroutineDispatcher r1 = newFixedThreadPoolContext(r0, r1)
            return r1
    }
}
