package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", "T", "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class BlockingCoroutine<T> extends kotlinx.coroutines.AbstractCoroutine<T> {
    private final java.lang.Thread blockedThread;
    private final kotlinx.coroutines.EventLoop eventLoop;

    public BlockingCoroutine(kotlin.coroutines.CoroutineContext r2, java.lang.Thread r3, kotlinx.coroutines.EventLoop r4) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0, r0)
            r1.blockedThread = r3
            r1.eventLoop = r4
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r2) {
            r1 = this;
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.Thread r0 = r1.blockedThread
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r2 != 0) goto L20
            java.lang.Thread r2 = r1.blockedThread
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L1a
            r0.unpark(r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L20
            java.util.concurrent.locks.LockSupport.unpark(r2)
        L20:
            return
    }

    @Override // kotlinx.coroutines.JobSupport
    protected boolean isScopedCoroutine() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final T joinBlocking() {
            r6 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L9
            r0.registerTimeLoopThread()
        L9:
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L7c
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L13
            kotlinx.coroutines.EventLoop.incrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L7c
        L13:
            boolean r0 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L65
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L22
            long r4 = r0.processNextEvent()     // Catch: java.lang.Throwable -> L73
            goto L27
        L22:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L27:
            boolean r0 = r6.isCompleted()     // Catch: java.lang.Throwable -> L73
            if (r0 != 0) goto L40
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()     // Catch: java.lang.Throwable -> L73
            if (r0 == 0) goto L39
            r0.parkNanos(r6, r4)     // Catch: java.lang.Throwable -> L73
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L73
            goto L3a
        L39:
            r0 = r3
        L3a:
            if (r0 != 0) goto L13
            java.util.concurrent.locks.LockSupport.parkNanos(r6, r4)     // Catch: java.lang.Throwable -> L73
            goto L13
        L40:
            kotlinx.coroutines.EventLoop r0 = r6.eventLoop     // Catch: java.lang.Throwable -> L7c
            if (r0 == 0) goto L47
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r0, r2, r1, r3)     // Catch: java.lang.Throwable -> L7c
        L47:
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L50
            r0.unregisterTimeLoopThread()
        L50:
            java.lang.Object r0 = r6.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L5f
            r3 = r0
            kotlinx.coroutines.CompletedExceptionally r3 = (kotlinx.coroutines.CompletedExceptionally) r3
        L5f:
            if (r3 != 0) goto L62
            return r0
        L62:
            java.lang.Throwable r0 = r3.cause
            throw r0
        L65:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.Throwable -> L73
            r0.<init>()     // Catch: java.lang.Throwable -> L73
            r4 = r0
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> L73
            r6.cancelCoroutine(r4)     // Catch: java.lang.Throwable -> L73
            java.lang.Throwable r0 = (java.lang.Throwable) r0     // Catch: java.lang.Throwable -> L73
            throw r0     // Catch: java.lang.Throwable -> L73
        L73:
            r0 = move-exception
            kotlinx.coroutines.EventLoop r4 = r6.eventLoop     // Catch: java.lang.Throwable -> L7c
            if (r4 == 0) goto L7b
            kotlinx.coroutines.EventLoop.decrementUseCount$default(r4, r2, r1, r3)     // Catch: java.lang.Throwable -> L7c
        L7b:
            throw r0     // Catch: java.lang.Throwable -> L7c
        L7c:
            r0 = move-exception
            kotlinx.coroutines.AbstractTimeSource r1 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r1 == 0) goto L86
            r1.unregisterTimeLoopThread()
        L86:
            throw r0
    }
}
