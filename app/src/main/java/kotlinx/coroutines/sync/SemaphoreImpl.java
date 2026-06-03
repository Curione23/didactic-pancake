package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0002\u0018\u00002\u00020\u001eB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\t\u001a\u00020\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\f*\b\u0012\u0004\u0012\u00020\u00060\nH\u0002¢\u0006\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreImpl;", "", "permits", "acquiredPermits", "<init>", "(II)V", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "Lkotlinx/coroutines/CancellableContinuation;", "cont", "", "addAcquireToQueue", "(Lkotlinx/coroutines/CancellableContinuation;)Z", "release", "()V", "tryAcquire", "()Z", "tryResumeNextFromQueue", "tryResumeAcquire", "getAvailablePermits", "()I", "availablePermits", "Lkotlin/Function1;", "", "onCancellationRelease", "Lkotlin/jvm/functions/Function1;", "I", "kotlinx-coroutines-core", "Lkotlinx/coroutines/sync/Semaphore;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class SemaphoreImpl implements kotlinx.coroutines.sync.Semaphore {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _availablePermits$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater deqIdx$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicLongFieldUpdater enqIdx$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater head$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater tail$FU = null;
    volatile /* synthetic */ int _availablePermits;
    private volatile /* synthetic */ long deqIdx;
    private volatile /* synthetic */ long enqIdx;
    private volatile /* synthetic */ java.lang.Object head;
    private final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ java.lang.Object tail;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "head"
            java.lang.Class<kotlinx.coroutines.sync.SemaphoreImpl> r2 = kotlinx.coroutines.sync.SemaphoreImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.SemaphoreImpl.head$FU = r0
            java.lang.String r0 = "deqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "tail"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.sync.SemaphoreImpl.tail$FU = r0
            java.lang.String r0 = "enqIdx"
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = java.util.concurrent.atomic.AtomicLongFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU = r0
            java.lang.String r0 = "_availablePermits"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU = r0
            return
    }

    public SemaphoreImpl(int r6, int r7) {
            r5 = this;
            r5.<init>()
            r5.permits = r6
            r0 = 0
            r5.deqIdx = r0
            r5.enqIdx = r0
            if (r6 <= 0) goto L42
            if (r7 < 0) goto L29
            if (r7 > r6) goto L29
            kotlinx.coroutines.sync.SemaphoreSegment r2 = new kotlinx.coroutines.sync.SemaphoreSegment
            r3 = 0
            r4 = 2
            r2.<init>(r0, r3, r4)
            r5.head = r2
            r5.tail = r2
            int r6 = r6 - r7
            r5._availablePermits = r6
            kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1 r6 = new kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            r6.<init>(r5)
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            r5.onCancellationRelease = r6
            return
        L29:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "The number of acquired permits should be in 0.."
            r7.<init>(r0)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L42:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Semaphore should have at least 1 permit, but had "
            r7.<init>(r0)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    public static final /* synthetic */ java.lang.Object access$acquireSlowPath(kotlinx.coroutines.sync.SemaphoreImpl r0, kotlin.coroutines.Continuation r1) {
            java.lang.Object r0 = r0.acquireSlowPath(r1)
            return r0
    }

    public static final /* synthetic */ boolean access$addAcquireToQueue(kotlinx.coroutines.sync.SemaphoreImpl r0, kotlinx.coroutines.CancellableContinuation r1) {
            boolean r0 = r0.addAcquireToQueue(r1)
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$getOnCancellationRelease$p(kotlinx.coroutines.sync.SemaphoreImpl r0) {
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r0.onCancellationRelease
            return r0
    }

    private final java.lang.Object acquireSlowPath(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r4 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
        Lb:
            boolean r2 = access$addAcquireToQueue(r4, r1)
            if (r2 != 0) goto L22
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r2 = r2.getAndDecrement(r4)
            if (r2 <= 0) goto Lb
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1 r3 = access$getOnCancellationRelease$p(r4)
            r1.resume(r2, r3)
        L22:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L2f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L2f:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L36
            return r0
        L36:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    private final boolean addAcquireToQueue(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r13) {
            r12 = this;
            java.lang.Object r0 = r12.tail
            kotlinx.coroutines.sync.SemaphoreSegment r0 = (kotlinx.coroutines.sync.SemaphoreSegment) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl.enqIdx$FU
            long r1 = r1.getAndIncrement(r12)
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r3 = (long) r3
            long r3 = r1 / r3
        L11:
            r5 = r0
            kotlinx.coroutines.internal.Segment r5 = (kotlinx.coroutines.internal.Segment) r5
        L14:
            long r6 = r5.getId()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 < 0) goto L28
            boolean r6 = r5.getRemoved()
            if (r6 == 0) goto L23
            goto L28
        L23:
            java.lang.Object r5 = kotlinx.coroutines.internal.SegmentOrClosed.m2321constructorimpl(r5)
            goto L3d
        L28:
            r6 = r5
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r6 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r6
            java.lang.Object r6 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r6)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r6 != r7) goto Ld2
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            java.lang.Object r5 = kotlinx.coroutines.internal.SegmentOrClosed.m2321constructorimpl(r5)
        L3d:
            boolean r6 = kotlinx.coroutines.internal.SegmentOrClosed.m2326isClosedimpl(r5)
            if (r6 != 0) goto L7b
            kotlinx.coroutines.internal.Segment r6 = kotlinx.coroutines.internal.SegmentOrClosed.m2324getSegmentimpl(r5)
        L47:
            java.lang.Object r7 = r12.tail
            kotlinx.coroutines.internal.Segment r7 = (kotlinx.coroutines.internal.Segment) r7
            long r8 = r7.getId()
            long r10 = r6.getId()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L58
            goto L7b
        L58:
            boolean r8 = r6.tryIncPointers$kotlinx_coroutines_core()
            if (r8 != 0) goto L5f
            goto L11
        L5f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.sync.SemaphoreImpl.tail$FU
            boolean r8 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r8, r12, r7, r6)
            if (r8 == 0) goto L71
            boolean r0 = r7.decPointers$kotlinx_coroutines_core()
            if (r0 == 0) goto L7b
            r7.remove()
            goto L7b
        L71:
            boolean r7 = r6.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto L47
            r6.remove()
            goto L47
        L7b:
            kotlinx.coroutines.internal.Segment r0 = kotlinx.coroutines.internal.SegmentOrClosed.m2324getSegmentimpl(r5)
            kotlinx.coroutines.sync.SemaphoreSegment r0 = (kotlinx.coroutines.sync.SemaphoreSegment) r0
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r3 = (long) r3
            long r1 = r1 % r3
            int r1 = (int) r1
            r2 = 0
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r0.acquirers
            boolean r2 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$$ExternalSyntheticBackportWithForwarding0.m(r3, r1, r2, r13)
            r3 = 1
            if (r2 == 0) goto L9f
            kotlinx.coroutines.sync.CancelSemaphoreAcquisitionHandler r2 = new kotlinx.coroutines.sync.CancelSemaphoreAcquisitionHandler
            r2.<init>(r0, r1)
            kotlinx.coroutines.CancelHandlerBase r2 = (kotlinx.coroutines.CancelHandlerBase) r2
            kotlin.jvm.functions.Function1 r2 = (kotlin.jvm.functions.Function1) r2
            r13.invokeOnCancellation(r2)
            return r3
        L9f:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r0.acquirers
            boolean r2 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$$ExternalSyntheticBackportWithForwarding0.m(r5, r1, r2, r4)
            if (r2 == 0) goto Lb7
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r12.onCancellationRelease
            r13.resume(r0, r1)
            return r3
        Lb7:
            boolean r13 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r13 == 0) goto Ld0
            java.util.concurrent.atomic.AtomicReferenceArray r13 = r0.acquirers
            java.lang.Object r13 = r13.get(r1)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            if (r13 != r0) goto Lca
            goto Ld0
        Lca:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            r13.<init>()
            throw r13
        Ld0:
            r13 = 0
            return r13
        Ld2:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r6 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r6
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            if (r6 == 0) goto Ldb
        Ld8:
            r5 = r6
            goto L14
        Ldb:
            long r6 = r5.getId()
            r8 = 1
            long r6 = r6 + r8
            r8 = r5
            kotlinx.coroutines.sync.SemaphoreSegment r8 = (kotlinx.coroutines.sync.SemaphoreSegment) r8
            kotlinx.coroutines.sync.SemaphoreSegment r6 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r6, r8)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            r7 = r6
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r7 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r7
            boolean r7 = r5.trySetNext(r7)
            if (r7 == 0) goto L14
            boolean r7 = r5.getRemoved()
            if (r7 == 0) goto Ld8
            r5.remove()
            goto Ld8
    }

    private final boolean tryResumeAcquire(kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r4) {
            r3 = this;
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r1 = 0
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r3.onCancellationRelease
            java.lang.Object r0 = r4.tryResume(r0, r1, r2)
            if (r0 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            r4.completeResume(r0)
            r4 = 1
            return r4
    }

    private final boolean tryResumeNextFromQueue() {
            r12 = this;
            java.lang.Object r0 = r12.head
            kotlinx.coroutines.sync.SemaphoreSegment r0 = (kotlinx.coroutines.sync.SemaphoreSegment) r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl.deqIdx$FU
            long r1 = r1.getAndIncrement(r12)
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r3 = (long) r3
            long r3 = r1 / r3
        L11:
            r5 = r0
            kotlinx.coroutines.internal.Segment r5 = (kotlinx.coroutines.internal.Segment) r5
        L14:
            long r6 = r5.getId()
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 < 0) goto L28
            boolean r6 = r5.getRemoved()
            if (r6 == 0) goto L23
            goto L28
        L23:
            java.lang.Object r5 = kotlinx.coroutines.internal.SegmentOrClosed.m2321constructorimpl(r5)
            goto L3d
        L28:
            r6 = r5
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r6 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r6
            java.lang.Object r6 = kotlinx.coroutines.internal.ConcurrentLinkedListNode.access$getNextOrClosed(r6)
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            if (r6 != r7) goto Ld6
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ConcurrentLinkedListKt.access$getCLOSED$p()
            java.lang.Object r5 = kotlinx.coroutines.internal.SegmentOrClosed.m2321constructorimpl(r5)
        L3d:
            boolean r6 = kotlinx.coroutines.internal.SegmentOrClosed.m2326isClosedimpl(r5)
            if (r6 != 0) goto L7b
            kotlinx.coroutines.internal.Segment r6 = kotlinx.coroutines.internal.SegmentOrClosed.m2324getSegmentimpl(r5)
        L47:
            java.lang.Object r7 = r12.head
            kotlinx.coroutines.internal.Segment r7 = (kotlinx.coroutines.internal.Segment) r7
            long r8 = r7.getId()
            long r10 = r6.getId()
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 < 0) goto L58
            goto L7b
        L58:
            boolean r8 = r6.tryIncPointers$kotlinx_coroutines_core()
            if (r8 != 0) goto L5f
            goto L11
        L5f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.sync.SemaphoreImpl.head$FU
            boolean r8 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r8, r12, r7, r6)
            if (r8 == 0) goto L71
            boolean r0 = r7.decPointers$kotlinx_coroutines_core()
            if (r0 == 0) goto L7b
            r7.remove()
            goto L7b
        L71:
            boolean r7 = r6.decPointers$kotlinx_coroutines_core()
            if (r7 == 0) goto L47
            r6.remove()
            goto L47
        L7b:
            kotlinx.coroutines.internal.Segment r0 = kotlinx.coroutines.internal.SegmentOrClosed.m2324getSegmentimpl(r5)
            kotlinx.coroutines.sync.SemaphoreSegment r0 = (kotlinx.coroutines.sync.SemaphoreSegment) r0
            r0.cleanPrev()
            long r5 = r0.getId()
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r4 = 0
            if (r3 <= 0) goto L8e
            return r4
        L8e:
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.access$getSEGMENT_SIZE$p()
            long r5 = (long) r3
            long r1 = r1 % r5
            int r1 = (int) r1
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            java.util.concurrent.atomic.AtomicReferenceArray r3 = r0.acquirers
            java.lang.Object r2 = r3.getAndSet(r1, r2)
            if (r2 != 0) goto Lc8
            int r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getMAX_SPIN_CYCLES$p()
        La5:
            r3 = 1
            if (r4 >= r2) goto Lb8
            java.util.concurrent.atomic.AtomicReferenceArray r5 = r0.acquirers
            java.lang.Object r5 = r5.get(r1)
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.sync.SemaphoreKt.access$getTAKEN$p()
            if (r5 != r6) goto Lb5
            return r3
        Lb5:
            int r4 = r4 + 1
            goto La5
        Lb8:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.sync.SemaphoreKt.access$getPERMIT$p()
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.sync.SemaphoreKt.access$getBROKEN$p()
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.acquirers
            boolean r0 = kotlinx.coroutines.debug.internal.ConcurrentWeakMap$Core$$ExternalSyntheticBackportWithForwarding0.m(r0, r1, r2, r4)
            r0 = r0 ^ r3
            return r0
        Lc8:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.SemaphoreKt.access$getCANCELLED$p()
            if (r2 != r0) goto Lcf
            return r4
        Lcf:
            kotlinx.coroutines.CancellableContinuation r2 = (kotlinx.coroutines.CancellableContinuation) r2
            boolean r0 = r12.tryResumeAcquire(r2)
            return r0
        Ld6:
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r6 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r6
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            if (r6 == 0) goto Ldf
        Ldc:
            r5 = r6
            goto L14
        Ldf:
            long r6 = r5.getId()
            r8 = 1
            long r6 = r6 + r8
            r8 = r5
            kotlinx.coroutines.sync.SemaphoreSegment r8 = (kotlinx.coroutines.sync.SemaphoreSegment) r8
            kotlinx.coroutines.sync.SemaphoreSegment r6 = kotlinx.coroutines.sync.SemaphoreKt.access$createSegment(r6, r8)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            r7 = r6
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r7 = (kotlinx.coroutines.internal.ConcurrentLinkedListNode) r7
            boolean r7 = r5.trySetNext(r7)
            if (r7 == 0) goto L14
            boolean r7 = r5.getRemoved()
            if (r7 == 0) goto Ldc
            r5.remove()
            goto Ldc
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public java.lang.Object acquire(kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r0 = r0.getAndDecrement(r1)
            if (r0 <= 0) goto Lb
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
        Lb:
            java.lang.Object r2 = r1.acquireSlowPath(r2)
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r0) goto L16
            return r2
        L16:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public int getAvailablePermits() {
            r2 = this;
            int r0 = r2._availablePermits
            r1 = 0
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public void release() {
            r3 = this;
        L0:
            int r0 = r3._availablePermits
            int r1 = r3.permits
            if (r0 >= r1) goto L1a
            int r1 = r0 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            boolean r1 = r2.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L0
            if (r0 < 0) goto L13
            return
        L13:
            boolean r0 = r3.tryResumeNextFromQueue()
            if (r0 == 0) goto L0
            return
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The number of released permits cannot be greater than "
            r0.<init>(r1)
            int r1 = r3.permits
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.sync.Semaphore
    public boolean tryAcquire() {
            r3 = this;
        L0:
            int r0 = r3._availablePermits
            if (r0 > 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.sync.SemaphoreImpl._availablePermits$FU
            int r2 = r0 + (-1)
            boolean r0 = r1.compareAndSet(r3, r0, r2)
            if (r0 == 0) goto L0
            r0 = 1
            return r0
    }
}
