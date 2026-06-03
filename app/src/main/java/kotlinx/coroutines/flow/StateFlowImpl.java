package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u0010062\b\u0012\u0004\u0012\u00028\u0000072\b\u0012\u0004\u0012\u00028\u0000082\b\u0012\u0004\u0012\u00028\u000009B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010\u000fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00008V@VX\u0096\u000e¢\u0006\u0012\u0012\u0004\b4\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/StateFlowSlot;", "createSlot", "()Lkotlinx/coroutines/flow/StateFlowSlot;", "", "size", "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "resetReplayCache", "()V", "tryEmit", "(Ljava/lang/Object;)Z", "expectedState", "newState", "updateState", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "sequence", "I", "getValue", "()Ljava/lang/Object;", "setValue", "getValue$annotations", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StateFlowImpl<T> extends kotlinx.coroutines.flow.internal.AbstractSharedFlow<kotlinx.coroutines.flow.StateFlowSlot> implements kotlinx.coroutines.flow.MutableStateFlow<T>, kotlinx.coroutines.flow.CancellableFlow<T>, kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    private volatile /* synthetic */ java.lang.Object _state;
    private int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: StateFlow.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {386, 398, 403}, m = "collect", n = {"this", "collector", "slot", "this", "collector", "slot", "collectorJob", "newState", "this", "collector", "slot", "collectorJob", "oldState"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.StateFlowImpl<T> this$0;

        AnonymousClass1(kotlinx.coroutines.flow.StateFlowImpl<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r3 = r2.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r3 | r0
                r2.label = r3
                kotlinx.coroutines.flow.StateFlowImpl<T> r3 = r2.this$0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r3 = r3.collect(r0, r1)
                return r3
        }
    }

    public StateFlowImpl(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0._state = r1
            return
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    private final boolean updateState(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            r6.getSlots()
            monitor-enter(r6)
            java.lang.Object r0 = r6._state     // Catch: java.lang.Throwable -> L5c
            r1 = 0
            if (r7 == 0) goto L11
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r7)     // Catch: java.lang.Throwable -> L5c
            if (r7 != 0) goto L11
            monitor-exit(r6)
            return r1
        L11:
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r8)     // Catch: java.lang.Throwable -> L5c
            r0 = 1
            if (r7 == 0) goto L1a
            monitor-exit(r6)
            return r0
        L1a:
            r6._state = r8     // Catch: java.lang.Throwable -> L5c
            int r7 = r6.sequence     // Catch: java.lang.Throwable -> L5c
            r8 = r7 & 1
            if (r8 != 0) goto L56
            int r7 = r7 + r0
            r6.sequence = r7     // Catch: java.lang.Throwable -> L5c
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r8 = r6.getSlots()     // Catch: java.lang.Throwable -> L5c
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r6)
        L2c:
            kotlinx.coroutines.flow.StateFlowSlot[] r8 = (kotlinx.coroutines.flow.StateFlowSlot[]) r8
            if (r8 == 0) goto L3e
            int r2 = r8.length
            r3 = r1
        L32:
            if (r3 >= r2) goto L3e
            r4 = r8[r3]
            if (r4 == 0) goto L3b
            r4.makePending()
        L3b:
            int r3 = r3 + 1
            goto L32
        L3e:
            monitor-enter(r6)
            int r8 = r6.sequence     // Catch: java.lang.Throwable -> L53
            if (r8 != r7) goto L48
            int r7 = r7 + r0
            r6.sequence = r7     // Catch: java.lang.Throwable -> L53
            monitor-exit(r6)
            return r0
        L48:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r7 = r6.getSlots()     // Catch: java.lang.Throwable -> L53
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L53
            monitor-exit(r6)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L2c
        L53:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L56:
            int r7 = r7 + 2
            r6.sequence = r7     // Catch: java.lang.Throwable -> L5c
            monitor-exit(r6)
            return r0
        L5c:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.Continuation<?> r12) {
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L19
        L14:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L19:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L77
            if (r2 == r6) goto L62
            if (r2 == r5) goto L4b
            if (r2 != r4) goto L43
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L74
            goto La9
        L43:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L4b:
            java.lang.Object r11 = r0.L$4
            java.lang.Object r2 = r0.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r6 = r0.L$2
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r7 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
            java.lang.Object r8 = r0.L$0
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L74
            goto Ld3
        L62:
            java.lang.Object r11 = r0.L$2
            r6 = r11
            kotlinx.coroutines.flow.StateFlowSlot r6 = (kotlinx.coroutines.flow.StateFlowSlot) r6
            java.lang.Object r11 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r2 = r0.L$0
            r8 = r2
            kotlinx.coroutines.flow.StateFlowImpl r8 = (kotlinx.coroutines.flow.StateFlowImpl) r8
            kotlin.ResultKt.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L74
            goto L98
        L74:
            r11 = move-exception
            goto Lef
        L77:
            kotlin.ResultKt.throwOnFailure(r12)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r12 = r10.allocateSlot()
            kotlinx.coroutines.flow.StateFlowSlot r12 = (kotlinx.coroutines.flow.StateFlowSlot) r12
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch: java.lang.Throwable -> Lec
            if (r2 == 0) goto L96
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch: java.lang.Throwable -> Lec
            r0.L$0 = r10     // Catch: java.lang.Throwable -> Lec
            r0.L$1 = r11     // Catch: java.lang.Throwable -> Lec
            r0.L$2 = r12     // Catch: java.lang.Throwable -> Lec
            r0.label = r6     // Catch: java.lang.Throwable -> Lec
            java.lang.Object r2 = r2.onSubscription(r0)     // Catch: java.lang.Throwable -> Lec
            if (r2 != r1) goto L96
            return r1
        L96:
            r8 = r10
            r6 = r12
        L98:
            kotlin.coroutines.CoroutineContext r12 = r0.getContext()     // Catch: java.lang.Throwable -> L74
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> L74
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2     // Catch: java.lang.Throwable -> L74
            kotlin.coroutines.CoroutineContext$Element r12 = r12.get(r2)     // Catch: java.lang.Throwable -> L74
            kotlinx.coroutines.Job r12 = (kotlinx.coroutines.Job) r12     // Catch: java.lang.Throwable -> L74
            r7 = r11
            r2 = r12
            r11 = r3
        La9:
            java.lang.Object r12 = r8._state     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto Lb0
            kotlinx.coroutines.JobKt.ensureActive(r2)     // Catch: java.lang.Throwable -> L74
        Lb0:
            if (r11 == 0) goto Lb8
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r12)     // Catch: java.lang.Throwable -> L74
            if (r9 != 0) goto Ld3
        Lb8:
            kotlinx.coroutines.internal.Symbol r11 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL     // Catch: java.lang.Throwable -> L74
            if (r12 != r11) goto Lbe
            r11 = r3
            goto Lbf
        Lbe:
            r11 = r12
        Lbf:
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L74
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L74
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L74
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L74
            r0.L$4 = r12     // Catch: java.lang.Throwable -> L74
            r0.label = r5     // Catch: java.lang.Throwable -> L74
            java.lang.Object r11 = r7.emit(r11, r0)     // Catch: java.lang.Throwable -> L74
            if (r11 != r1) goto Ld2
            return r1
        Ld2:
            r11 = r12
        Ld3:
            boolean r12 = r6.takePending()     // Catch: java.lang.Throwable -> L74
            if (r12 != 0) goto La9
            r0.L$0 = r8     // Catch: java.lang.Throwable -> L74
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L74
            r0.L$2 = r6     // Catch: java.lang.Throwable -> L74
            r0.L$3 = r2     // Catch: java.lang.Throwable -> L74
            r0.L$4 = r11     // Catch: java.lang.Throwable -> L74
            r0.label = r4     // Catch: java.lang.Throwable -> L74
            java.lang.Object r12 = r6.awaitPending(r0)     // Catch: java.lang.Throwable -> L74
            if (r12 != r1) goto La9
            return r1
        Lec:
            r11 = move-exception
            r8 = r10
            r6 = r12
        Lef:
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r6 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r6
            r8.freeSlot(r6)
            throw r11
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T r1, T r2) {
            r0 = this;
            if (r1 != 0) goto L4
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L4:
            if (r2 != 0) goto L8
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L8:
            boolean r1 = r0.updateState(r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = new kotlinx.coroutines.flow.StateFlowSlot
            r0.<init>()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot createSlot() {
            r1 = this;
            kotlinx.coroutines.flow.StateFlowSlot r0 = r1.createSlot()
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r0 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    protected kotlinx.coroutines.flow.StateFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r1 = new kotlinx.coroutines.flow.StateFlowSlot[r1]
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public /* bridge */ /* synthetic */ kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] createSlotArray(int r1) {
            r0 = this;
            kotlinx.coroutines.flow.StateFlowSlot[] r1 = r0.createSlotArray(r1)
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[]) r1
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public java.lang.Object emit(T r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            r0.setValue(r1)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.flow.StateFlow r0 = (kotlinx.coroutines.flow.StateFlow) r0
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.StateFlowKt.fuseStateFlow(r0, r2, r3, r4)
            return r2
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public java.util.List<T> getReplayCache() {
            r1 = this;
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = kotlin.collections.CollectionsKt.listOf(r0)
            return r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
            r2 = this;
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            java.lang.Object r1 = r2._state
            if (r1 != r0) goto L7
            r1 = 0
        L7:
            return r1
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "MutableStateFlow.resetReplayCache is not supported"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T r2) {
            r1 = this;
            if (r2 != 0) goto L4
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
        L4:
            r0 = 0
            r1.updateState(r0, r2)
            return
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T r1) {
            r0 = this;
            r0.setValue(r1)
            r1 = 1
            return r1
    }
}
