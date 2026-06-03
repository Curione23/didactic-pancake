package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\b \u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u0003B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000e2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0017\u001a\u00020\u0007H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010H¤@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0085\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "S", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectWithContextUndispatched", "newContext", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "flowCollect", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ChannelFlowOperator<S, T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    protected final kotlinx.coroutines.flow.Flow<S> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2, reason: invalid class name */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0005H\u008a@"}, d2 = {"<anonymous>", "", "S", "T", "it", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2", f = "ChannelFlow.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> this$0;

        AnonymousClass2(kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowOperator.AnonymousClass2> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
                kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r2.this$0
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowOperator.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2c
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlinx.coroutines.flow.internal.ChannelFlowOperator<S, T> r1 = r4.this$0
                r3 = r4
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4.label = r2
                java.lang.Object r5 = r1.flowCollect(r5, r3)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    public ChannelFlowOperator(kotlinx.coroutines.flow.Flow<? extends S> r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r0 = this;
            r0.<init>(r2, r3, r4)
            r0.flow = r1
            return
    }

    public static final /* synthetic */ java.lang.Object access$collectWithContextUndispatched(kotlinx.coroutines.flow.internal.ChannelFlowOperator r0, kotlinx.coroutines.flow.FlowCollector r1, kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = r0.collectWithContextUndispatched(r1, r2, r3)
            return r0
    }

    static /* synthetic */ java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator r4, kotlinx.coroutines.flow.FlowCollector r5, kotlin.coroutines.Continuation r6) {
            int r0 = r4.capacity
            r1 = -3
            if (r0 != r1) goto L47
            kotlin.coroutines.CoroutineContext r0 = r6.getContext()
            kotlin.coroutines.CoroutineContext r1 = r4.context
            kotlin.coroutines.CoroutineContext r1 = r0.plus(r1)
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r2 == 0) goto L23
            java.lang.Object r4 = r4.flowCollect(r5, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L20
            return r4
        L20:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L23:
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r2 = r1.get(r2)
            kotlin.coroutines.ContinuationInterceptor$Key r3 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r3)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L47
            java.lang.Object r4 = r4.collectWithContextUndispatched(r5, r1, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L44
            return r4
        L44:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L47:
            java.lang.Object r4 = super.collect(r5, r6)
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L52
            return r4
        L52:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    static /* synthetic */ java.lang.Object collectTo$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlowOperator r1, kotlinx.coroutines.channels.ProducerScope r2, kotlin.coroutines.Continuation r3) {
            kotlinx.coroutines.flow.internal.SendingCollector r0 = new kotlinx.coroutines.flow.internal.SendingCollector
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            r0.<init>(r2)
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r1 = r1.flowCollect(r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L14
            return r1
        L14:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private final java.lang.Object collectWithContextUndispatched(kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.CoroutineContext r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            r8 = this;
            kotlin.coroutines.CoroutineContext r0 = r11.getContext()
            kotlinx.coroutines.flow.FlowCollector r2 = kotlinx.coroutines.flow.internal.ChannelFlowKt.access$withUndispatchedContextCollector(r9, r0)
            kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2 r9 = new kotlinx.coroutines.flow.internal.ChannelFlowOperator$collectWithContextUndispatched$2
            r0 = 0
            r9.<init>(r8, r0)
            r4 = r9
            kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
            r6 = 4
            r7 = 0
            r3 = 0
            r1 = r10
            r5 = r11
            java.lang.Object r9 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r9 != r10) goto L21
            return r9
        L21:
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = collect$suspendImpl(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = collectTo$suspendImpl(r0, r1, r2)
            return r1
    }

    protected abstract java.lang.Object flowCollect(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.flow.Flow<S> r1 = r2.flow
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " -> "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
