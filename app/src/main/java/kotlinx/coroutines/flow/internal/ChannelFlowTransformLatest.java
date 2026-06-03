package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003Bx\u0012B\u0010\u0004\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0002\b\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0002\u0010\u0016J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0014J\u001f\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u001cRO\u0010\u0004\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0005¢\u0006\u0002\b\rX\u0082\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowTransformLatest;", "T", "R", "Lkotlinx/coroutines/flow/internal/ChannelFlowOperator;", "transform", "Lkotlin/Function3;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "flow", "Lkotlinx/coroutines/flow/Flow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/jvm/functions/Function3;Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "Lkotlin/jvm/functions/Function3;", "create", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flowCollect", "collector", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ChannelFlowTransformLatest<T, R> extends kotlinx.coroutines.flow.internal.ChannelFlowOperator<T, R> {
    private final kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> transform;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $collector;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> this$0;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ kotlinx.coroutines.CoroutineScope $$this$coroutineScope;
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $collector;
            final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> $previousFlow;
            final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> this$0;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Merge.kt */
            @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
            static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> this$0;

                AnonymousClass2(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r1, kotlinx.coroutines.flow.FlowCollector<? super R> r2, T r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3.AnonymousClass1.AnonymousClass2> r4) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.$collector = r2
                        r0.$value = r3
                        r1 = 2
                        r0.<init>(r1, r4)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                        r3 = this;
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r0 = r3.this$0
                        kotlinx.coroutines.flow.FlowCollector<R> r1 = r3.$collector
                        T r2 = r3.$value
                        r4.<init>(r0, r1, r2, r5)
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        return r4
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        java.lang.Object r1 = r0.invoke2(r1, r2)
                        return r1
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3.AnonymousClass1.AnonymousClass2) r1
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
                        goto L2d
                    Lf:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L17:
                        kotlin.ResultKt.throwOnFailure(r5)
                        kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r5 = r4.this$0
                        kotlin.jvm.functions.Function3 r5 = kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.access$getTransform$p(r5)
                        kotlinx.coroutines.flow.FlowCollector<R> r1 = r4.$collector
                        T r3 = r4.$value
                        r4.label = r2
                        java.lang.Object r5 = r5.invoke(r1, r3, r4)
                        if (r5 != r0) goto L2d
                        return r0
                    L2d:
                        kotlin.Unit r5 = kotlin.Unit.INSTANCE
                        return r5
                }
            }

            AnonymousClass1(kotlin.jvm.internal.Ref.ObjectRef<kotlinx.coroutines.Job> r1, kotlinx.coroutines.CoroutineScope r2, kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4) {
                    r0 = this;
                    r0.$previousFlow = r1
                    r0.$$this$coroutineScope = r2
                    r0.this$0 = r3
                    r0.$collector = r4
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                    r7 = this;
                    boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                    if (r0 == 0) goto L14
                    r0 = r9
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r9 = r0.label
                    int r9 = r9 - r2
                    r0.label = r9
                    goto L19
                L14:
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                    r0.<init>(r7, r9)
                L19:
                    java.lang.Object r9 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L3c
                    if (r2 != r3) goto L34
                    java.lang.Object r8 = r0.L$2
                    kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
                    java.lang.Object r8 = r0.L$1
                    java.lang.Object r0 = r0.L$0
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3.AnonymousClass1) r0
                    kotlin.ResultKt.throwOnFailure(r9)
                    goto L61
                L34:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3c:
                    kotlin.ResultKt.throwOnFailure(r9)
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r9 = r7.$previousFlow
                    T r9 = r9.element
                    kotlinx.coroutines.Job r9 = (kotlinx.coroutines.Job) r9
                    if (r9 == 0) goto L60
                    kotlinx.coroutines.flow.internal.ChildCancelledException r2 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                    r2.<init>()
                    java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
                    r9.cancel(r2)
                    r0.L$0 = r7
                    r0.L$1 = r8
                    r0.L$2 = r9
                    r0.label = r3
                    java.lang.Object r9 = r9.join(r0)
                    if (r9 != r1) goto L60
                    return r1
                L60:
                    r0 = r7
                L61:
                    kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r9 = r0.$previousFlow
                    kotlinx.coroutines.CoroutineScope r1 = r0.$$this$coroutineScope
                    kotlinx.coroutines.CoroutineStart r3 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r2 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                    kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r4 = r0.this$0
                    kotlinx.coroutines.flow.FlowCollector<R> r0 = r0.$collector
                    r5 = 0
                    r2.<init>(r4, r0, r8, r5)
                    r4 = r2
                    kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                    r5 = 1
                    r6 = 0
                    r2 = 0
                    kotlinx.coroutines.Job r8 = kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                    r9.element = r8
                    kotlin.Unit r8 = kotlin.Unit.INSTANCE
                    return r8
            }
        }

        AnonymousClass3(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r1, kotlinx.coroutines.flow.FlowCollector<? super R> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3> r3) {
                r0 = this;
                r0.this$0 = r1
                r0.$collector = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r1 = r3.this$0
                kotlinx.coroutines.flow.FlowCollector<R> r2 = r3.$collector
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r8)
                goto L3e
            Lf:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L17:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
                kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                r1.<init>()
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.this$0
                kotlinx.coroutines.flow.Flow<S> r3 = r3.flow
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r5 = r7.this$0
                kotlinx.coroutines.flow.FlowCollector<R> r6 = r7.$collector
                r4.<init>(r1, r8, r5, r6)
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                r8 = r7
                kotlin.coroutines.Continuation r8 = (kotlin.coroutines.Continuation) r8
                r7.label = r2
                java.lang.Object r8 = r3.collect(r4, r8)
                if (r8 != r0) goto L3e
                return r0
            L3e:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    public ChannelFlowTransformLatest(kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.coroutines.CoroutineContext r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r2, r3, r4, r5)
            r0.transform = r1
            return
    }

    public /* synthetic */ ChannelFlowTransformLatest(kotlin.jvm.functions.Function3 r7, kotlinx.coroutines.flow.Flow r8, kotlin.coroutines.CoroutineContext r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
        L8:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = -2
        Le:
            r4 = r10
            r9 = r12 & 16
            if (r9 == 0) goto L15
            kotlinx.coroutines.channels.BufferOverflow r11 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L15:
            r5 = r11
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 access$getTransform$p(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r0) {
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r0.transform
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<R> create(kotlin.coroutines.CoroutineContext r8, int r9, kotlinx.coroutines.channels.BufferOverflow r10) {
            r7 = this;
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest r6 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest
            kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r7.transform
            kotlinx.coroutines.flow.Flow<S> r2 = r7.flow
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.internal.ChannelFlow r6 = (kotlinx.coroutines.flow.internal.ChannelFlow) r6
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    protected java.lang.Object flowCollect(kotlinx.coroutines.flow.FlowCollector<? super R> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L11
            boolean r0 = r3 instanceof kotlinx.coroutines.flow.internal.SendingCollector
            if (r0 == 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L11:
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r3 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L24
            return r3
        L24:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }
}
