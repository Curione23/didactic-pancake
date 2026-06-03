package kotlinx.coroutines;

/* JADX INFO: compiled from: DefaultExecutor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010\u001f\u001a\u00020\u0011H\u0002J\u0014\u0010 \u001a\u00020\u001e2\n\u0010!\u001a\u00060\u0002j\u0002`\u0003H\u0016J\r\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0002\b#J$\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\n\u0010'\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\u0015H\u0002J\u0018\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\b2\u0006\u0010-\u001a\u00020.H\u0014J\b\u0010/\u001a\u00020\u001eH\u0016J\b\u00100\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\u001eH\u0002J\u000e\u00102\u001a\u00020\u001e2\u0006\u00103\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0004R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u00064"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE_MS", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "debugStatus", "isShutDown", "", "()Z", "isShutdownRequested", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "enqueue", "task", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "context", "Lkotlin/coroutines/CoroutineContext;", "notifyStartup", "reschedule", "now", "delayedTask", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "run", "shutdown", "shutdownError", "shutdownForTests", "timeout", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DefaultExecutor extends kotlinx.coroutines.EventLoopImplBase implements java.lang.Runnable {
    private static final int ACTIVE = 1;
    private static final long DEFAULT_KEEP_ALIVE_MS = 1000;
    private static final int FRESH = 0;
    public static final kotlinx.coroutines.DefaultExecutor INSTANCE = null;
    private static final long KEEP_ALIVE_NANOS = 0;
    private static final int SHUTDOWN = 4;
    private static final int SHUTDOWN_ACK = 3;
    private static final int SHUTDOWN_REQ = 2;
    public static final java.lang.String THREAD_NAME = "kotlinx.coroutines.DefaultExecutor";
    private static volatile java.lang.Thread _thread;
    private static volatile int debugStatus;

    static {
            kotlinx.coroutines.DefaultExecutor r0 = new kotlinx.coroutines.DefaultExecutor
            r0.<init>()
            kotlinx.coroutines.DefaultExecutor.INSTANCE = r0
            kotlinx.coroutines.EventLoop r0 = (kotlinx.coroutines.EventLoop) r0
            r1 = 1
            r2 = 0
            r3 = 0
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r3, r1, r2)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r3 = "kotlinx.coroutines.DefaultExecutor.keepAlive"
            java.lang.Long r1 = java.lang.Long.getLong(r3, r1)     // Catch: java.lang.SecurityException -> L1a
            goto L1e
        L1a:
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
        L1e:
            long r1 = r1.longValue()
            long r0 = r0.toNanos(r1)
            kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS = r0
            return
    }

    private DefaultExecutor() {
            r0 = this;
            r0.<init>()
            return
    }

    private final synchronized void acknowledgeShutdownIfNeeded() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.isShutdownRequested()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            r0 = 3
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L17
            r1.resetAll()     // Catch: java.lang.Throwable -> L17
            r0 = r1
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.Throwable -> L17
            r0.notifyAll()     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    private final synchronized java.lang.Thread createThreadSync() {
            r3 = this;
            monitor-enter(r3)
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L18
            java.lang.Thread r0 = new java.lang.Thread     // Catch: java.lang.Throwable -> L1a
            r1 = r3
            java.lang.Runnable r1 = (java.lang.Runnable) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "kotlinx.coroutines.DefaultExecutor"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L1a
            kotlinx.coroutines.DefaultExecutor._thread = r0     // Catch: java.lang.Throwable -> L1a
            r1 = 1
            r0.setDaemon(r1)     // Catch: java.lang.Throwable -> L1a
            r0.start()     // Catch: java.lang.Throwable -> L1a
        L18:
            monitor-exit(r3)
            return r0
        L1a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1a
            throw r0
    }

    private static /* synthetic */ void get_thread$annotations() {
            return
    }

    private final boolean isShutDown() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 4
            if (r0 != r1) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private final boolean isShutdownRequested() {
            r2 = this;
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus
            r1 = 2
            if (r0 == r1) goto Lb
            r1 = 3
            if (r0 != r1) goto L9
            goto Lb
        L9:
            r0 = 0
            goto Lc
        Lb:
            r0 = 1
        Lc:
            return r0
    }

    private final synchronized boolean notifyStartup() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.isShutdownRequested()     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto La
            monitor-exit(r2)
            r0 = 0
            return r0
        La:
            r0 = 1
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L15
            r1 = r2
            java.lang.Object r1 = (java.lang.Object) r1     // Catch: java.lang.Throwable -> L15
            r1.notifyAll()     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    private final void shutdownError() {
            r2 = this;
            java.util.concurrent.RejectedExecutionException r0 = new java.util.concurrent.RejectedExecutionException
            java.lang.String r1 = "DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase
    public void enqueue(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.isShutDown()
            if (r0 == 0) goto L9
            r1.shutdownError()
        L9:
            super.enqueue(r2)
            return
    }

    public final synchronized void ensureStarted$kotlinx_coroutines_core() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L12
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto Lc
            goto L12
        Lc:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L12:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L28
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L3b
            if (r0 == 0) goto L28
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L3b
            r1 = 3
            if (r0 != r1) goto L22
            goto L28
        L22:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L3b
            r0.<init>()     // Catch: java.lang.Throwable -> L3b
            throw r0     // Catch: java.lang.Throwable -> L3b
        L28:
            r0 = 0
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0     // Catch: java.lang.Throwable -> L3b
            r2.createThreadSync()     // Catch: java.lang.Throwable -> L3b
        L2e:
            int r0 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L3b
            if (r0 != 0) goto L39
            r0 = r2
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.Throwable -> L3b
            r0.wait()     // Catch: java.lang.Throwable -> L3b
            goto L2e
        L39:
            monitor-exit(r2)
            return
        L3b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r0
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected java.lang.Thread getThread() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread
            if (r0 != 0) goto L8
            java.lang.Thread r0 = r1.createThreadSync()
        L8:
            return r0
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, java.lang.Runnable r3, kotlin.coroutines.CoroutineContext r4) {
            r0 = this;
            kotlinx.coroutines.DisposableHandle r1 = r0.scheduleInvokeOnTimeout(r1, r3)
            return r1
    }

    public final boolean isThreadPresent$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Thread r0 = kotlinx.coroutines.DefaultExecutor._thread
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    protected void reschedule(long r1, kotlinx.coroutines.EventLoopImplBase.DelayedTask r3) {
            r0 = this;
            r0.shutdownError()
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r12 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r1 = r12
            kotlinx.coroutines.EventLoop r1 = (kotlinx.coroutines.EventLoop) r1
            r0.setEventLoop$kotlinx_coroutines_core(r1)
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L11
            r0.registerTimeLoopThread()
        L11:
            r0 = 0
            boolean r1 = r12.notifyStartup()     // Catch: java.lang.Throwable -> Lb2
            if (r1 != 0) goto L30
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L26
            r0.unregisterTimeLoopThread()
        L26:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L2f
            r12.getThread()
        L2f:
            return
        L30:
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = r1
        L36:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Lb2
            long r5 = r12.processNextEvent()     // Catch: java.lang.Throwable -> Lb2
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L7c
            kotlinx.coroutines.AbstractTimeSource r7 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> Lb2
            if (r7 == 0) goto L4e
            long r10 = r7.nanoTime()     // Catch: java.lang.Throwable -> Lb2
            goto L52
        L4e:
            long r10 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lb2
        L52:
            int r7 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r7 != 0) goto L59
            long r3 = kotlinx.coroutines.DefaultExecutor.KEEP_ALIVE_NANOS     // Catch: java.lang.Throwable -> Lb2
            long r3 = r3 + r10
        L59:
            long r10 = r3 - r10
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 > 0) goto L77
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L6d
            r0.unregisterTimeLoopThread()
        L6d:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L76
            r12.getThread()
        L76:
            return
        L77:
            long r5 = kotlin.ranges.RangesKt.coerceAtMost(r5, r10)     // Catch: java.lang.Throwable -> Lb2
            goto L7d
        L7c:
            r3 = r1
        L7d:
            int r7 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r7 <= 0) goto L36
            boolean r7 = r12.isShutdownRequested()     // Catch: java.lang.Throwable -> Lb2
            if (r7 == 0) goto L9f
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L95
            r0.unregisterTimeLoopThread()
        L95:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L9e
            r12.getThread()
        L9e:
            return
        L9f:
            kotlinx.coroutines.AbstractTimeSource r7 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> Lb2
            if (r7 == 0) goto Lab
            r7.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> Lb2
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb2
            goto Lac
        Lab:
            r7 = r0
        Lac:
            if (r7 != 0) goto L36
            java.util.concurrent.locks.LockSupport.parkNanos(r12, r5)     // Catch: java.lang.Throwable -> Lb2
            goto L36
        Lb2:
            r1 = move-exception
            kotlinx.coroutines.DefaultExecutor._thread = r0
            r12.acknowledgeShutdownIfNeeded()
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto Lc1
            r0.unregisterTimeLoopThread()
        Lc1:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto Lca
            r12.getThread()
        Lca:
            throw r1
    }

    @Override // kotlinx.coroutines.EventLoopImplBase, kotlinx.coroutines.EventLoop
    public void shutdown() {
            r1 = this;
            r0 = 4
            kotlinx.coroutines.DefaultExecutor.debugStatus = r0
            super.shutdown()
            return
    }

    public final synchronized void shutdownForTests(long r7) {
            r6 = this;
            monitor-enter(r6)
            long r0 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L46
            long r0 = r0 + r7
            boolean r2 = r6.isShutdownRequested()     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto Lf
            r2 = 2
            kotlinx.coroutines.DefaultExecutor.debugStatus = r2     // Catch: java.lang.Throwable -> L46
        Lf:
            int r2 = kotlinx.coroutines.DefaultExecutor.debugStatus     // Catch: java.lang.Throwable -> L46
            r3 = 3
            if (r2 == r3) goto L41
            java.lang.Thread r2 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L41
            java.lang.Thread r2 = kotlinx.coroutines.DefaultExecutor._thread     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L2e
            kotlinx.coroutines.AbstractTimeSource r3 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L28
            r3.unpark(r2)     // Catch: java.lang.Throwable -> L46
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L46
            goto L29
        L28:
            r3 = 0
        L29:
            if (r3 != 0) goto L2e
            java.util.concurrent.locks.LockSupport.unpark(r2)     // Catch: java.lang.Throwable -> L46
        L2e:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L46
            long r2 = r0 - r2
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 <= 0) goto L41
            r2 = r6
            java.lang.Object r2 = (java.lang.Object) r2     // Catch: java.lang.Throwable -> L46
            r2.wait(r7)     // Catch: java.lang.Throwable -> L46
            goto Lf
        L41:
            r7 = 0
            kotlinx.coroutines.DefaultExecutor.debugStatus = r7     // Catch: java.lang.Throwable -> L46
            monitor-exit(r6)
            return
        L46:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L46
            throw r7
    }
}
