package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0013B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\f0\u000b2\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0002J\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowSlot;", "<init>", "()V", "Lkotlinx/coroutines/flow/StateFlowImpl;", "flow", "", "allocateLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "awaitPending", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lkotlin/coroutines/Continuation;", "freeLocked", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "makePending", "takePending", "()Z", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlowSlot;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StateFlowSlot extends kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlinx.coroutines.flow.StateFlowImpl<?>> {
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    volatile /* synthetic */ java.lang.Object _state;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.flow.StateFlowSlot> r2 = kotlinx.coroutines.flow.StateFlowSlot.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.flow.StateFlowSlot._state$FU = r0
            return
    }

    public StateFlowSlot() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1._state = r0
            return
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ boolean allocateLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowImpl r1 = (kotlinx.coroutines.flow.StateFlowImpl) r1
            boolean r1 = r0.allocateLocked2(r1)
            return r1
    }

    /* JADX INFO: renamed from: allocateLocked, reason: avoid collision after fix types in other method */
    public boolean allocateLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            java.lang.Object r1 = r0._state
            if (r1 == 0) goto L6
            r1 = 0
            return r1
        L6:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            r0._state = r1
            r1 = 1
            return r1
    }

    public final java.lang.Object awaitPending(kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r4 = this;
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r4._state
            boolean r2 = r2 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r2 != 0) goto L1d
            goto L23
        L1d:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r2 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r3, r1)
            if (r2 != 0) goto L51
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L44
            java.lang.Object r2 = r4._state
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r2 != r3) goto L3e
            goto L44
        L3e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L44:
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = kotlin.Result.m767constructorimpl(r2)
            r1.resumeWith(r2)
        L51:
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L5e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L5e:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r5) goto L65
            return r0
        L65:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public /* bridge */ /* synthetic */ kotlin.coroutines.Continuation[] freeLocked(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowImpl r1 = (kotlinx.coroutines.flow.StateFlowImpl) r1
            kotlin.coroutines.Continuation[] r1 = r0.freeLocked2(r1)
            return r1
    }

    /* JADX INFO: renamed from: freeLocked, reason: avoid collision after fix types in other method */
    public kotlin.coroutines.Continuation<kotlin.Unit>[] freeLocked2(kotlinx.coroutines.flow.StateFlowImpl<?> r1) {
            r0 = this;
            r1 = 0
            r0._state = r1
            kotlin.coroutines.Continuation<kotlin.Unit>[] r1 = kotlinx.coroutines.flow.internal.AbstractSharedFlowKt.EMPTY_RESUMES
            return r1
    }

    public final void makePending() {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._state
            if (r0 != 0) goto L5
            return
        L5:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r0 != r1) goto Lc
            return
        Lc:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            if (r0 != r1) goto L1f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r0, r2)
            if (r0 == 0) goto L0
            return
        L1f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r0, r2)
            if (r1 == 0) goto L0
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = kotlin.Result.m767constructorimpl(r1)
            r0.resumeWith(r1)
            return
    }

    public final boolean takePending() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.StateFlowSlot._state$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getNONE$p()
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L1e
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 != 0) goto L18
            goto L1e
        L18:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L1e:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.StateFlowKt.access$getPENDING$p()
            if (r0 != r1) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
    }
}
