package kotlinx.coroutines;

/* JADX INFO: compiled from: EventLoop.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0016¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0014\u00103\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class EventLoopImplBase extends kotlinx.coroutines.EventLoopImplPlatform implements kotlinx.coroutines.Delay {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _delayed$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _queue$FU = null;
    private volatile /* synthetic */ java.lang.Object _delayed;
    private volatile /* synthetic */ int _isCompleted;
    private volatile /* synthetic */ java.lang.Object _queue;

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class DelayedResumeTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final kotlinx.coroutines.CancellableContinuation<kotlin.Unit> cont;
        final /* synthetic */ kotlinx.coroutines.EventLoopImplBase this$0;

        public DelayedResumeTask(kotlinx.coroutines.EventLoopImplBase r1, long r2, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                r0.cont = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r0 = r3.cont
                kotlinx.coroutines.EventLoopImplBase r1 = r3.this$0
                kotlinx.coroutines.CoroutineDispatcher r1 = (kotlinx.coroutines.CoroutineDispatcher) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                r0.resumeUndispatched(r1, r2)
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.CancellableContinuation<kotlin.Unit> r1 = r2.cont
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedRunnableTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "(JLjava/lang/Runnable;)V", "run", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class DelayedRunnableTask extends kotlinx.coroutines.EventLoopImplBase.DelayedTask {
        private final java.lang.Runnable block;

        public DelayedRunnableTask(long r1, java.lang.Runnable r3) {
                r0 = this;
                r0.<init>(r1)
                r0.block = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.Runnable r0 = r1.block
                r0.run()
                return
        }

        @Override // kotlinx.coroutines.EventLoopImplBase.DelayedTask
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = super.toString()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Runnable r1 = r2.block
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static abstract class DelayedTask implements java.lang.Runnable, java.lang.Comparable<kotlinx.coroutines.EventLoopImplBase.DelayedTask>, kotlinx.coroutines.DisposableHandle, kotlinx.coroutines.internal.ThreadSafeHeapNode {
        private volatile java.lang.Object _heap;
        private int index;
        public long nanoTime;

        public DelayedTask(long r1) {
                r0 = this;
                r0.<init>()
                r0.nanoTime = r1
                r1 = -1
                r0.index = r1
                return
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(kotlinx.coroutines.EventLoopImplBase.DelayedTask r1) {
                r0 = this;
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r1
                int r1 = r0.compareTo2(r1)
                return r1
        }

        /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
        public int compareTo2(kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
                r4 = this;
                long r0 = r4.nanoTime
                long r2 = r5.nanoTime
                long r0 = r0 - r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 <= 0) goto Ld
                r5 = 1
                goto L12
            Ld:
                if (r5 >= 0) goto L11
                r5 = -1
                goto L12
            L11:
                r5 = 0
            L12:
                return r5
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public final synchronized void dispose() {
                r2 = this;
                monitor-enter(r2)
                java.lang.Object r0 = r2._heap     // Catch: java.lang.Throwable -> L23
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L23
                if (r0 != r1) goto Lb
                monitor-exit(r2)
                return
            Lb:
                boolean r1 = r0 instanceof kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue     // Catch: java.lang.Throwable -> L23
                if (r1 == 0) goto L12
                kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0     // Catch: java.lang.Throwable -> L23
                goto L13
            L12:
                r0 = 0
            L13:
                if (r0 == 0) goto L1b
                r1 = r2
                kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r1     // Catch: java.lang.Throwable -> L23
                r0.remove(r1)     // Catch: java.lang.Throwable -> L23
            L1b:
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L23
                r2._heap = r0     // Catch: java.lang.Throwable -> L23
                monitor-exit(r2)
                return
            L23:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L23
                throw r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public kotlinx.coroutines.internal.ThreadSafeHeap<?> getHeap() {
                r2 = this;
                java.lang.Object r0 = r2._heap
                boolean r1 = r0 instanceof kotlinx.coroutines.internal.ThreadSafeHeap
                if (r1 == 0) goto L9
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        public final synchronized int scheduleTask(long r9, kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue r11, kotlinx.coroutines.EventLoopImplBase r12) {
                r8 = this;
                monitor-enter(r8)
                java.lang.Object r0 = r8._heap     // Catch: java.lang.Throwable -> L55
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()     // Catch: java.lang.Throwable -> L55
                if (r0 != r1) goto Lc
                monitor-exit(r8)
                r9 = 2
                return r9
            Lc:
                r0 = r11
                kotlinx.coroutines.internal.ThreadSafeHeap r0 = (kotlinx.coroutines.internal.ThreadSafeHeap) r0     // Catch: java.lang.Throwable -> L55
                monitor-enter(r0)     // Catch: java.lang.Throwable -> L55
                kotlinx.coroutines.internal.ThreadSafeHeapNode r1 = r0.firstImpl()     // Catch: java.lang.Throwable -> L52
                kotlinx.coroutines.EventLoopImplBase$DelayedTask r1 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r1     // Catch: java.lang.Throwable -> L52
                boolean r12 = kotlinx.coroutines.EventLoopImplBase.access$isCompleted(r12)     // Catch: java.lang.Throwable -> L52
                if (r12 == 0) goto L20
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
                monitor-exit(r8)
                r9 = 1
                return r9
            L20:
                r2 = 0
                if (r1 != 0) goto L27
                r11.timeNow = r9     // Catch: java.lang.Throwable -> L52
                goto L3b
            L27:
                long r4 = r1.nanoTime     // Catch: java.lang.Throwable -> L52
                long r6 = r4 - r9
                int r12 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
                if (r12 < 0) goto L30
                goto L31
            L30:
                r9 = r4
            L31:
                long r4 = r11.timeNow     // Catch: java.lang.Throwable -> L52
                long r4 = r9 - r4
                int r12 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r12 <= 0) goto L3b
                r11.timeNow = r9     // Catch: java.lang.Throwable -> L52
            L3b:
                long r9 = r8.nanoTime     // Catch: java.lang.Throwable -> L52
                long r4 = r11.timeNow     // Catch: java.lang.Throwable -> L52
                long r9 = r9 - r4
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L48
                long r9 = r11.timeNow     // Catch: java.lang.Throwable -> L52
                r8.nanoTime = r9     // Catch: java.lang.Throwable -> L52
            L48:
                r9 = r8
                kotlinx.coroutines.internal.ThreadSafeHeapNode r9 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r9     // Catch: java.lang.Throwable -> L52
                r0.addImpl(r9)     // Catch: java.lang.Throwable -> L52
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
                monitor-exit(r8)
                r9 = 0
                return r9
            L52:
                r9 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
                throw r9     // Catch: java.lang.Throwable -> L55
            L55:
                r9 = move-exception
                monitor-exit(r8)     // Catch: java.lang.Throwable -> L55
                throw r9
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setHeap(kotlinx.coroutines.internal.ThreadSafeHeap<?> r3) {
                r2 = this;
                java.lang.Object r0 = r2._heap
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getDISPOSED_TASK$p()
                if (r0 == r1) goto Lb
                r2._heap = r3
                return
            Lb:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Failed requirement."
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
        public void setIndex(int r1) {
                r0 = this;
                r0.index = r1
                return
        }

        public final boolean timeToExecute(long r3) {
                r2 = this;
                long r0 = r2.nanoTime
                long r3 = r3 - r0
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 < 0) goto Lb
                r3 = 1
                goto Lc
            Lb:
                r3 = 0
            Lc:
                return r3
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Delayed[nanos="
                r0.<init>(r1)
                long r1 = r3.nanoTime
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: EventLoop.common.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class DelayedTaskQueue extends kotlinx.coroutines.internal.ThreadSafeHeap<kotlinx.coroutines.EventLoopImplBase.DelayedTask> {
        public long timeNow;

        public DelayedTaskQueue(long r1) {
                r0 = this;
                r0.<init>()
                r0.timeNow = r1
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_queue"
            java.lang.Class<kotlinx.coroutines.EventLoopImplBase> r2 = kotlinx.coroutines.EventLoopImplBase.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.EventLoopImplBase._queue$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_delayed"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.EventLoopImplBase._delayed$FU = r0
            return
    }

    public EventLoopImplBase() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            r0 = 0
            r1._isCompleted = r0
            return
    }

    public static final /* synthetic */ boolean access$isCompleted(kotlinx.coroutines.EventLoopImplBase r0) {
            boolean r0 = r0.isCompleted()
            return r0
    }

    private final void closeQueue() {
            r4 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            boolean r0 = r4.isCompleted()
            if (r0 == 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L13:
            java.lang.Object r0 = r4._queue
            if (r0 != 0) goto L25
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r1 = 0
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r4, r1, r2)
            if (r0 == 0) goto L13
            return
        L25:
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r1 == 0) goto L2f
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            r0.close()
            return
        L2f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r1) goto L36
            return
        L36:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r2 = 8
            r3 = 1
            r1.<init>(r2, r3)
            if (r0 == 0) goto L4f
            r2 = r0
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r1.addLast(r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r1)
            if (r0 == 0) goto L13
            return
        L4f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Runnable dequeue() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._queue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r2 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r2 == 0) goto L2c
            if (r0 == 0) goto L24
            r1 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r1
            java.lang.Object r2 = r1.removeFirstOrNull()
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.LockFreeTaskQueueCore.REMOVE_FROZEN
            if (r2 == r3) goto L1a
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            return r2
        L1a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r1 = r1.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r1)
            goto L0
        L24:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            r0.<init>(r1)
            throw r0
        L2c:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r2) goto L33
            return r1
        L33:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r1)
            if (r1 == 0) goto L0
            if (r0 == 0) goto L40
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            return r0
        L40:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r0.<init>(r1)
            throw r0
    }

    private final boolean enqueueImpl(java.lang.Runnable r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = r5._queue
            boolean r1 = r5.isCompleted()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            r1 = 1
            if (r0 != 0) goto L17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            r2 = 0
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r5, r2, r6)
            if (r0 == 0) goto L0
            return r1
        L17:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L40
            if (r0 == 0) goto L38
            r3 = r0
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r3 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r3
            int r4 = r3.addLast(r6)
            if (r4 == 0) goto L37
            if (r4 == r1) goto L2d
            r0 = 2
            if (r4 == r0) goto L2c
            goto L0
        L2c:
            return r2
        L2d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = r3.next()
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r5, r0, r2)
            goto L0
        L37:
            return r1
        L38:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            r6.<init>(r0)
            throw r6
        L40:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r3) goto L47
            return r2
        L47:
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r2 = new kotlinx.coroutines.internal.LockFreeTaskQueueCore
            r3 = 8
            r2.<init>(r3, r1)
            if (r0 == 0) goto L62
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.addLast(r3)
            r2.addLast(r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.EventLoopImplBase._queue$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r5, r0, r2)
            if (r0 == 0) goto L0
            return r1
        L62:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r6.<init>(r0)
            throw r6
    }

    private final boolean isCompleted() {
            r1 = this;
            int r0 = r1._isCompleted
            return r0
    }

    private final void rescheduleAllDelayed() {
            r3 = this;
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto Lb
            long r0 = r0.nanoTime()
            goto Lf
        Lb:
            long r0 = java.lang.System.nanoTime()
        Lf:
            java.lang.Object r2 = r3._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r2 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r2
            if (r2 == 0) goto L22
            kotlinx.coroutines.internal.ThreadSafeHeapNode r2 = r2.removeFirstOrNull()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r2 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r2
            if (r2 != 0) goto L1e
            goto L22
        L1e:
            r3.reschedule(r0, r2)
            goto Lf
        L22:
            return
    }

    private final int scheduleImpl(long r4, kotlinx.coroutines.EventLoopImplBase.DelayedTask r6) {
            r3 = this;
            boolean r0 = r3.isCompleted()
            if (r0 == 0) goto L8
            r4 = 1
            return r4
        L8:
            java.lang.Object r0 = r3._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 != 0) goto L23
            r0 = r3
            kotlinx.coroutines.EventLoopImplBase r0 = (kotlinx.coroutines.EventLoopImplBase) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.EventLoopImplBase._delayed$FU
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r1 = new kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue
            r1.<init>(r4)
            r2 = 0
            androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r2, r1)
            java.lang.Object r0 = r3._delayed
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
        L23:
            int r4 = r6.scheduleTask(r4, r0, r3)
            return r4
    }

    private final void setCompleted(boolean r1) {
            r0 = this;
            r0._isCompleted = r1
            return
    }

    private final boolean shouldUnpark(kotlinx.coroutines.EventLoopImplBase.DelayedTask r2) {
            r1 = this;
            java.lang.Object r0 = r1._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto Ld
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 != r2) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @Override // kotlinx.coroutines.Delay
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    public java.lang.Object delay(long r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.Delay.DefaultImpls.delay(r0, r1, r3)
            return r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo2318dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            r0.enqueue(r2)
            return
    }

    public void enqueue(java.lang.Runnable r2) {
            r1 = this;
            boolean r0 = r1.enqueueImpl(r2)
            if (r0 == 0) goto La
            r1.unpark()
            goto Lf
        La:
            kotlinx.coroutines.DefaultExecutor r0 = kotlinx.coroutines.DefaultExecutor.INSTANCE
            r0.enqueue(r2)
        Lf:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    protected long getNextTime() {
            r6 = this;
            long r0 = super.getNextTime()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lb
            return r2
        Lb:
            java.lang.Object r0 = r6._queue
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L29
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r1 == 0) goto L21
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L29
            return r2
        L21:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r1) goto L28
            return r4
        L28:
            return r2
        L29:
            java.lang.Object r0 = r6._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L4f
            kotlinx.coroutines.internal.ThreadSafeHeapNode r0 = r0.peek()
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r0
            if (r0 != 0) goto L38
            goto L4f
        L38:
            long r0 = r0.nanoTime
            kotlinx.coroutines.AbstractTimeSource r4 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r4 == 0) goto L45
            long r4 = r4.nanoTime()
            goto L49
        L45:
            long r4 = java.lang.System.nanoTime()
        L49:
            long r0 = r0 - r4
            long r0 = kotlin.ranges.RangesKt.coerceAtLeast(r0, r2)
            return r0
        L4f:
            return r4
    }

    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, java.lang.Runnable r3, kotlin.coroutines.CoroutineContext r4) {
            r0 = this;
            kotlinx.coroutines.DisposableHandle r1 = kotlinx.coroutines.Delay.DefaultImpls.invokeOnTimeout(r0, r1, r3, r4)
            return r1
    }

    @Override // kotlinx.coroutines.EventLoop
    protected boolean isEmpty() {
            r4 = this;
            boolean r0 = r4.isUnconfinedQueueEmpty()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Object r0 = r4._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L15
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L15
            return r1
        L15:
            java.lang.Object r0 = r4._queue
            r2 = 1
            if (r0 != 0) goto L1c
        L1a:
            r1 = r2
            goto L2e
        L1c:
            boolean r3 = r0 instanceof kotlinx.coroutines.internal.LockFreeTaskQueueCore
            if (r3 == 0) goto L27
            kotlinx.coroutines.internal.LockFreeTaskQueueCore r0 = (kotlinx.coroutines.internal.LockFreeTaskQueueCore) r0
            boolean r1 = r0.isEmpty()
            goto L2e
        L27:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.EventLoop_commonKt.access$getCLOSED_EMPTY$p()
            if (r0 != r3) goto L2e
            goto L1a
        L2e:
            return r1
    }

    @Override // kotlinx.coroutines.EventLoop
    public long processNextEvent() {
            r10 = this;
            boolean r0 = r10.processUnconfinedEvent()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r10._delayed
            kotlinx.coroutines.EventLoopImplBase$DelayedTaskQueue r0 = (kotlinx.coroutines.EventLoopImplBase.DelayedTaskQueue) r0
            if (r0 == 0) goto L56
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L56
            kotlinx.coroutines.AbstractTimeSource r3 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r3 == 0) goto L20
            long r3 = r3.nanoTime()
            goto L24
        L20:
            long r3 = java.lang.System.nanoTime()
        L24:
            r5 = r0
            kotlinx.coroutines.internal.ThreadSafeHeap r5 = (kotlinx.coroutines.internal.ThreadSafeHeap) r5
            monitor-enter(r5)
            kotlinx.coroutines.internal.ThreadSafeHeapNode r6 = r5.firstImpl()     // Catch: java.lang.Throwable -> L53
            r7 = 0
            if (r6 != 0) goto L31
            monitor-exit(r5)
            goto L4e
        L31:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r6 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r6     // Catch: java.lang.Throwable -> L53
            boolean r8 = r6.timeToExecute(r3)     // Catch: java.lang.Throwable -> L53
            r9 = 0
            if (r8 == 0) goto L41
            java.lang.Runnable r6 = (java.lang.Runnable) r6     // Catch: java.lang.Throwable -> L53
            boolean r6 = r10.enqueueImpl(r6)     // Catch: java.lang.Throwable -> L53
            goto L42
        L41:
            r6 = r9
        L42:
            if (r6 == 0) goto L4a
            kotlinx.coroutines.internal.ThreadSafeHeapNode r6 = r5.removeAtImpl(r9)     // Catch: java.lang.Throwable -> L53
            r7 = r6
            goto L4d
        L4a:
            r6 = r7
            kotlinx.coroutines.internal.ThreadSafeHeapNode r6 = (kotlinx.coroutines.internal.ThreadSafeHeapNode) r6     // Catch: java.lang.Throwable -> L53
        L4d:
            monitor-exit(r5)
        L4e:
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r7 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r7
            if (r7 != 0) goto L24
            goto L56
        L53:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L56:
            java.lang.Runnable r0 = r10.dequeue()
            if (r0 == 0) goto L60
            r0.run()
            return r1
        L60:
            long r0 = r10.getNextTime()
            return r0
    }

    protected final void resetAll() {
            r1 = this;
            r0 = 0
            r1._queue = r0
            r1._delayed = r0
            return
    }

    public final void schedule(long r3, kotlinx.coroutines.EventLoopImplBase.DelayedTask r5) {
            r2 = this;
            int r0 = r2.scheduleImpl(r3, r5)
            if (r0 == 0) goto L1d
            r1 = 1
            if (r0 == r1) goto L19
            r3 = 2
            if (r0 != r3) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "unexpected result"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L19:
            r2.reschedule(r3, r5)
            goto L26
        L1d:
            boolean r3 = r2.shouldUnpark(r5)
            if (r3 == 0) goto L26
            r2.unpark()
        L26:
            return
    }

    protected final kotlinx.coroutines.DisposableHandle scheduleInvokeOnTimeout(long r4, java.lang.Runnable r6) {
            r3 = this;
            long r4 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r4)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2b
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L18
            long r0 = r0.nanoTime()
            goto L1c
        L18:
            long r0 = java.lang.System.nanoTime()
        L1c:
            kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask r2 = new kotlinx.coroutines.EventLoopImplBase$DelayedRunnableTask
            long r4 = r4 + r0
            r2.<init>(r4, r6)
            r4 = r2
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r4 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r4
            r3.schedule(r0, r4)
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
            goto L30
        L2b:
            kotlinx.coroutines.NonDisposableHandle r4 = kotlinx.coroutines.NonDisposableHandle.INSTANCE
            r2 = r4
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
        L30:
            return r2
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo2319scheduleResumeAfterDelay(long r4, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r6) {
            r3 = this;
            long r4 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r4)
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L2d
            kotlinx.coroutines.AbstractTimeSource r0 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r0 == 0) goto L18
            long r0 = r0.nanoTime()
            goto L1c
        L18:
            long r0 = java.lang.System.nanoTime()
        L1c:
            kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask r2 = new kotlinx.coroutines.EventLoopImplBase$DelayedResumeTask
            long r4 = r4 + r0
            r2.<init>(r3, r4, r6)
            r4 = r2
            kotlinx.coroutines.EventLoopImplBase$DelayedTask r4 = (kotlinx.coroutines.EventLoopImplBase.DelayedTask) r4
            r3.schedule(r0, r4)
            kotlinx.coroutines.DisposableHandle r2 = (kotlinx.coroutines.DisposableHandle) r2
            kotlinx.coroutines.CancellableContinuationKt.disposeOnCancellation(r6, r2)
        L2d:
            return
    }

    @Override // kotlinx.coroutines.EventLoop
    public void shutdown() {
            r4 = this;
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            r0.resetEventLoop$kotlinx_coroutines_core()
            r0 = 1
            r4.setCompleted(r0)
            r4.closeQueue()
        Lc:
            long r0 = r4.processNextEvent()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r4.rescheduleAllDelayed()
            return
    }
}
