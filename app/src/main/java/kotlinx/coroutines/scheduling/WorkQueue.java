package kotlinx.coroutines.scheduling;

/* JADX INFO: compiled from: WorkQueue.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020*B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\r*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "fair", "add", "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "addLast", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "pollBuffer", "queue", "pollTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "victim", "", "tryStealBlockingFrom", "(Lkotlinx/coroutines/scheduling/WorkQueue;)J", "tryStealFrom", "blockingOnly", "tryStealLastScheduled", "(Lkotlinx/coroutines/scheduling/WorkQueue;Z)J", "decrementIfBlocking", "(Lkotlinx/coroutines/scheduling/Task;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "", "getBufferSize$kotlinx_coroutines_core", "()I", "bufferSize", "getSize$kotlinx_coroutines_core", "size", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WorkQueue {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater blockingTasksInBuffer$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumerIndex$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater lastScheduledTask$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater producerIndex$FU = null;
    private volatile /* synthetic */ int blockingTasksInBuffer;
    private final java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> buffer;
    private volatile /* synthetic */ int consumerIndex;
    private volatile /* synthetic */ java.lang.Object lastScheduledTask;
    private volatile /* synthetic */ int producerIndex;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "lastScheduledTask"
            java.lang.Class<kotlinx.coroutines.scheduling.WorkQueue> r2 = kotlinx.coroutines.scheduling.WorkQueue.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU = r0
            java.lang.String r0 = "producerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU = r0
            java.lang.String r0 = "consumerIndex"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU = r0
            java.lang.String r0 = "blockingTasksInBuffer"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU = r0
            return
    }

    public WorkQueue() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = new java.util.concurrent.atomic.AtomicReferenceArray
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.buffer = r0
            r0 = 0
            r2.lastScheduledTask = r0
            r0 = 0
            r2.producerIndex = r0
            r2.consumerIndex = r0
            r2.blockingTasksInBuffer = r0
            return
    }

    public static /* synthetic */ kotlinx.coroutines.scheduling.Task add$default(kotlinx.coroutines.scheduling.WorkQueue r0, kotlinx.coroutines.scheduling.Task r1, boolean r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.scheduling.Task r0 = r0.add(r1, r2)
            return r0
    }

    private final kotlinx.coroutines.scheduling.Task addLast(kotlinx.coroutines.scheduling.Task r3) {
            r2 = this;
            kotlinx.coroutines.scheduling.TaskContext r0 = r3.taskContext
            int r0 = r0.getTaskMode()
            r1 = 1
            if (r0 != r1) goto Le
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            r0.incrementAndGet(r2)
        Le:
            int r0 = r2.getBufferSize$kotlinx_coroutines_core()
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 != r1) goto L17
            return r3
        L17:
            int r0 = r2.producerIndex
            r0 = r0 & r1
        L1a:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r1 = r2.buffer
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L26
            java.lang.Thread.yield()
            goto L1a
        L26:
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r1 = r2.buffer
            r1.lazySet(r0, r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.scheduling.WorkQueue.producerIndex$FU
            r3.incrementAndGet(r2)
            r3 = 0
            return r3
    }

    private final void decrementIfBlocking(kotlinx.coroutines.scheduling.Task r2) {
            r1 = this;
            if (r2 == 0) goto L20
            kotlinx.coroutines.scheduling.TaskContext r2 = r2.taskContext
            int r2 = r2.getTaskMode()
            r0 = 1
            if (r2 != r0) goto L20
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            int r2 = r2.decrementAndGet(r1)
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L20
            if (r2 < 0) goto L1a
            goto L20
        L1a:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L20:
            return
    }

    private final kotlinx.coroutines.scheduling.Task pollBuffer() {
            r5 = this;
        L0:
            int r0 = r5.consumerIndex
            int r1 = r5.producerIndex
            int r1 = r0 - r1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r0 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.scheduling.WorkQueue.consumerIndex$FU
            int r4 = r0 + 1
            boolean r0 = r3.compareAndSet(r5, r0, r4)
            if (r0 == 0) goto L0
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r0 = r5.buffer
            java.lang.Object r0 = r0.getAndSet(r1, r2)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto L21
            goto L0
        L21:
            r5.decrementIfBlocking(r0)
            return r0
    }

    private final boolean pollTo(kotlinx.coroutines.scheduling.GlobalQueue r2) {
            r1 = this;
            kotlinx.coroutines.scheduling.Task r0 = r1.pollBuffer()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r2.addLast(r0)
            r2 = 1
            return r2
    }

    private final long tryStealLastScheduled(kotlinx.coroutines.scheduling.WorkQueue r6, boolean r7) {
            r5 = this;
        L0:
            java.lang.Object r0 = r6.lastScheduledTask
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            r1 = -2
            if (r0 != 0) goto L9
            return r1
        L9:
            if (r7 == 0) goto L16
            kotlinx.coroutines.scheduling.TaskContext r3 = r0.taskContext
            int r3 = r3.getTaskMode()
            r4 = 1
            if (r3 != r4) goto L15
            goto L16
        L15:
            return r1
        L16:
            kotlinx.coroutines.scheduling.SchedulerTimeSource r1 = kotlinx.coroutines.scheduling.TasksKt.schedulerTimeSource
            long r1 = r1.nanoTime()
            long r3 = r0.submissionTime
            long r1 = r1 - r3
            long r3 = kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 >= 0) goto L29
            long r6 = kotlinx.coroutines.scheduling.TasksKt.WORK_STEALING_TIME_RESOLUTION_NS
            long r6 = r6 - r1
            return r6
        L29:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            r2 = 0
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r6, r0, r2)
            if (r1 == 0) goto L0
            r6 = 0
            r7 = 2
            add$default(r5, r0, r6, r7, r2)
            r6 = -1
            return r6
    }

    public final kotlinx.coroutines.scheduling.Task add(kotlinx.coroutines.scheduling.Task r1, boolean r2) {
            r0 = this;
            if (r2 == 0) goto L7
            kotlinx.coroutines.scheduling.Task r1 = r0.addLast(r1)
            return r1
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            java.lang.Object r1 = r2.getAndSet(r0, r1)
            kotlinx.coroutines.scheduling.Task r1 = (kotlinx.coroutines.scheduling.Task) r1
            if (r1 != 0) goto L13
            r1 = 0
            return r1
        L13:
            kotlinx.coroutines.scheduling.Task r1 = r0.addLast(r1)
            return r1
    }

    public final int getBufferSize$kotlinx_coroutines_core() {
            r2 = this;
            int r0 = r2.producerIndex
            int r1 = r2.consumerIndex
            int r0 = r0 - r1
            return r0
    }

    public final int getSize$kotlinx_coroutines_core() {
            r1 = this;
            java.lang.Object r0 = r1.lastScheduledTask
            if (r0 == 0) goto Lb
            int r0 = r1.getBufferSize$kotlinx_coroutines_core()
            int r0 = r0 + 1
            goto Lf
        Lb:
            int r0 = r1.getBufferSize$kotlinx_coroutines_core()
        Lf:
            return r0
    }

    public final void offloadAllWorkTo(kotlinx.coroutines.scheduling.GlobalQueue r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 == 0) goto Le
            r3.addLast(r0)
        Le:
            boolean r0 = r2.pollTo(r3)
            if (r0 != 0) goto Le
            return
    }

    public final kotlinx.coroutines.scheduling.Task poll() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.lastScheduledTask$FU
            r1 = 0
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlinx.coroutines.scheduling.Task r0 = (kotlinx.coroutines.scheduling.Task) r0
            if (r0 != 0) goto Lf
            kotlinx.coroutines.scheduling.Task r0 = r2.pollBuffer()
        Lf:
            return r0
    }

    public final long tryStealBlockingFrom(kotlinx.coroutines.scheduling.WorkQueue r8) {
            r7 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            int r0 = r7.getBufferSize$kotlinx_coroutines_core()
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            r8.<init>()
            throw r8
        L13:
            int r0 = r8.consumerIndex
            int r1 = r8.producerIndex
            java.util.concurrent.atomic.AtomicReferenceArray<kotlinx.coroutines.scheduling.Task> r2 = r8.buffer
        L19:
            r3 = 1
            if (r0 == r1) goto L49
            r4 = r0 & 127(0x7f, float:1.78E-43)
            int r5 = r8.blockingTasksInBuffer
            if (r5 == 0) goto L49
            java.lang.Object r5 = r2.get(r4)
            kotlinx.coroutines.scheduling.Task r5 = (kotlinx.coroutines.scheduling.Task) r5
            if (r5 == 0) goto L46
            kotlinx.coroutines.scheduling.TaskContext r6 = r5.taskContext
            int r6 = r6.getTaskMode()
            if (r6 != r3) goto L46
            r3 = 0
            boolean r4 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r5, r3)
            if (r4 == 0) goto L46
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.scheduling.WorkQueue.blockingTasksInBuffer$FU
            r0.decrementAndGet(r8)
            r8 = 0
            r0 = 2
            add$default(r7, r5, r8, r0, r3)
            r0 = -1
            return r0
        L46:
            int r0 = r0 + 1
            goto L19
        L49:
            long r0 = r7.tryStealLastScheduled(r8, r3)
            return r0
    }

    public final long tryStealFrom(kotlinx.coroutines.scheduling.WorkQueue r4) {
            r3 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L13
            int r0 = r3.getBufferSize$kotlinx_coroutines_core()
            if (r0 != 0) goto Ld
            goto L13
        Ld:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L13:
            kotlinx.coroutines.scheduling.Task r0 = r4.pollBuffer()
            r1 = 0
            if (r0 == 0) goto L32
            r4 = 2
            r2 = 0
            kotlinx.coroutines.scheduling.Task r4 = add$default(r3, r0, r1, r4, r2)
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L2f
            if (r4 != 0) goto L29
            goto L2f
        L29:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L2f:
            r0 = -1
            return r0
        L32:
            long r0 = r3.tryStealLastScheduled(r4, r1)
            return r0
    }
}
