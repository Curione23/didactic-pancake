package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u0004*\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {"second"}, s = {"L$0"})
final class CombineKt$zipImpl$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T2> $flow2;
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    int label;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.lang.Object $cnt;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T1> $flow;
        final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.FlowCollector {
            final /* synthetic */ java.lang.Object $cnt;
            final /* synthetic */ kotlin.coroutines.CoroutineContext $scopeContext;
            final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
            final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003\"\u0004\b\u0002\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "", "T1", "T2", "R", "it"}, k = 3, mv = {1, 6, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
            static final class C00171 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlin.Unit, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> $second;
                final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
                final /* synthetic */ T1 $value;
                java.lang.Object L$0;
                int label;

                C00171(kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r1, kotlinx.coroutines.flow.FlowCollector<? super R> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, T1 r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00171> r5) {
                        r0 = this;
                        r0.$second = r1
                        r0.$this_unsafeFlow = r2
                        r0.$transform = r3
                        r0.$value = r4
                        r1 = 2
                        r0.<init>(r1, r5)
                        return
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                        r6 = this;
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r7 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r1 = r6.$second
                        kotlinx.coroutines.flow.FlowCollector<R> r2 = r6.$this_unsafeFlow
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r3 = r6.$transform
                        T1 r4 = r6.$value
                        r0 = r7
                        r5 = r8
                        r0.<init>(r1, r2, r3, r4, r5)
                        kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                        return r7
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlin.Unit r1 = (kotlin.Unit) r1
                        kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                        java.lang.Object r1 = r0.invoke2(r1, r2)
                        return r1
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final java.lang.Object invoke2(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                        r0 = this;
                        kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                        kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00171) r1
                        kotlin.Unit r2 = kotlin.Unit.INSTANCE
                        java.lang.Object r1 = r1.invokeSuspend(r2)
                        return r1
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                        r8 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r8.label
                        r2 = 0
                        r3 = 3
                        r4 = 2
                        r5 = 1
                        if (r1 == 0) goto L30
                        if (r1 == r5) goto L26
                        if (r1 == r4) goto L1e
                        if (r1 != r3) goto L16
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L77
                    L16:
                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r9.<init>(r0)
                        throw r9
                    L1e:
                        java.lang.Object r1 = r8.L$0
                        kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                        kotlin.ResultKt.throwOnFailure(r9)
                        goto L69
                    L26:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                        java.lang.Object r9 = r9.m2289unboximpl()
                        goto L41
                    L30:
                        kotlin.ResultKt.throwOnFailure(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.$second
                        r1 = r8
                        kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                        r8.label = r5
                        java.lang.Object r9 = r9.mo2270receiveCatchingJP2dKIU(r1)
                        if (r9 != r0) goto L41
                        return r0
                    L41:
                        kotlinx.coroutines.flow.FlowCollector<R> r1 = r8.$this_unsafeFlow
                        boolean r5 = r9 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r5 == 0) goto L55
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m2281exceptionOrNullimpl(r9)
                        if (r9 != 0) goto L54
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r1)
                        java.lang.Throwable r9 = (java.lang.Throwable) r9
                    L54:
                        throw r9
                    L55:
                        kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r5 = r8.$transform
                        T1 r6 = r8.$value
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                        if (r9 != r7) goto L5e
                        r9 = r2
                    L5e:
                        r8.L$0 = r1
                        r8.label = r4
                        java.lang.Object r9 = r5.invoke(r6, r9, r8)
                        if (r9 != r0) goto L69
                        return r0
                    L69:
                        r4 = r8
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        r8.L$0 = r2
                        r8.label = r3
                        java.lang.Object r9 = r1.emit(r9, r4)
                        if (r9 != r0) goto L77
                        return r0
                    L77:
                        kotlin.Unit r9 = kotlin.Unit.INSTANCE
                        return r9
                }
            }

            AnonymousClass1(kotlin.coroutines.CoroutineContext r1, java.lang.Object r2, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
                    r0 = this;
                    r0.$scopeContext = r1
                    r0.$cnt = r2
                    r0.$second = r3
                    r0.$this_unsafeFlow = r4
                    r0.$transform = r5
                    r0.<init>()
                    return
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final java.lang.Object emit(T1 r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
                    r12 = this;
                    boolean r0 = r14 instanceof kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    if (r0 == 0) goto L14
                    r0 = r14
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1) r0
                    int r1 = r0.label
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r14 = r0.label
                    int r14 = r14 - r2
                    r0.label = r14
                    goto L19
                L14:
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$emit$1
                    r0.<init>(r12, r14)
                L19:
                    java.lang.Object r14 = r0.result
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.label
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.ResultKt.throwOnFailure(r14)
                    goto L54
                L2a:
                    java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                    java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                    r13.<init>(r14)
                    throw r13
                L32:
                    kotlin.ResultKt.throwOnFailure(r14)
                    kotlin.coroutines.CoroutineContext r14 = r12.$scopeContext
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    java.lang.Object r4 = r12.$cnt
                    kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1 r11 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1
                    kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r12.$second
                    kotlinx.coroutines.flow.FlowCollector<R> r7 = r12.$this_unsafeFlow
                    kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r12.$transform
                    r10 = 0
                    r5 = r11
                    r9 = r13
                    r5.<init>(r6, r7, r8, r9, r10)
                    kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
                    r0.label = r3
                    java.lang.Object r13 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched(r14, r2, r4, r11, r0)
                    if (r13 != r1) goto L54
                    return r1
                L54:
                    kotlin.Unit r13 = kotlin.Unit.INSTANCE
                    return r13
            }
        }

        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlin.coroutines.CoroutineContext r2, java.lang.Object r3, kotlinx.coroutines.channels.ReceiveChannel<? extends java.lang.Object> r4, kotlinx.coroutines.flow.FlowCollector<? super R> r5, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2> r7) {
                r0 = this;
                r0.$flow = r1
                r0.$scopeContext = r2
                r0.$cnt = r3
                r0.$second = r4
                r0.$this_unsafeFlow = r5
                r0.$transform = r6
                r1 = 2
                r0.<init>(r1, r7)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r9, kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r9 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2
                kotlinx.coroutines.flow.Flow<T1> r1 = r8.$flow
                kotlin.coroutines.CoroutineContext r2 = r8.$scopeContext
                java.lang.Object r3 = r8.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r4 = r8.$second
                kotlinx.coroutines.flow.FlowCollector<R> r5 = r8.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r8.$transform
                r0 = r9
                r7 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                return r9
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.Unit r1 = (kotlin.Unit) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.Unit r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r10)
                goto L3a
            Lf:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L17:
                kotlin.ResultKt.throwOnFailure(r10)
                kotlinx.coroutines.flow.Flow<T1> r10 = r9.$flow
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.CoroutineContext r4 = r9.$scopeContext
                java.lang.Object r5 = r9.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r9.$second
                kotlinx.coroutines.flow.FlowCollector<R> r7 = r9.$this_unsafeFlow
                kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r8 = r9.$transform
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                r3 = r9
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r9.label = r2
                java.lang.Object r10 = r10.collect(r1, r3)
                if (r10 != r0) goto L3a
                return r0
            L3a:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.FlowCollector<? super R> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlinx.coroutines.flow.Flow<? extends T1> r3, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1> r5) {
            r0 = this;
            r0.$this_unsafeFlow = r1
            r0.$flow2 = r2
            r0.$flow = r3
            r0.$transform = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
            r7 = this;
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1
            kotlinx.coroutines.flow.FlowCollector<R> r1 = r7.$this_unsafeFlow
            kotlinx.coroutines.flow.Flow<T2> r2 = r7.$flow2
            kotlinx.coroutines.flow.Flow<T1> r3 = r7.$flow
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r7.$transform
            r0 = r6
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            r6.L$0 = r8
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            return r6
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
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
            r22 = this;
            r1 = r22
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r1.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L26
            if (r2 != r3) goto L1e
            java.lang.Object r0 = r1.L$0
            r2 = r0
            kotlinx.coroutines.channels.ReceiveChannel r2 = (kotlinx.coroutines.channels.ReceiveChannel) r2
            kotlin.ResultKt.throwOnFailure(r23)     // Catch: java.lang.Throwable -> L18 kotlinx.coroutines.flow.internal.AbortFlowException -> L1b
            goto L97
        L18:
            r0 = move-exception
            goto La9
        L1b:
            r0 = move-exception
            goto La0
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L26:
            kotlin.ResultKt.throwOnFailure(r23)
            java.lang.Object r2 = r1.L$0
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1 r5 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$second$1
            kotlinx.coroutines.flow.Flow<T2> r6 = r1.$flow2
            r5.<init>(r6, r4)
            r8 = r5
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            r5 = r2
            kotlinx.coroutines.channels.ReceiveChannel r5 = kotlinx.coroutines.channels.ProduceKt.produce$default(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.CompletableJob r6 = kotlinx.coroutines.JobKt.Job$default(r4, r3, r4)
            r7 = r5
            kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1 r8 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$1
            kotlinx.coroutines.flow.FlowCollector<R> r9 = r1.$this_unsafeFlow
            r8.<init>(r6, r9)
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            r7.invokeOnClose(r8)
            kotlin.coroutines.CoroutineContext r13 = r2.getCoroutineContext()     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            java.lang.Object r14 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r13)     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlin.coroutines.CoroutineContext r2 = r2.getCoroutineContext()     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlin.coroutines.CoroutineContext r6 = (kotlin.coroutines.CoroutineContext) r6     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r6)     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 r7 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlinx.coroutines.flow.Flow<T1> r12 = r1.$flow     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlinx.coroutines.flow.FlowCollector<R> r8 = r1.$this_unsafeFlow     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            kotlin.jvm.functions.Function3<T1, T2, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r9 = r1.$transform     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            r18 = 0
            r11 = r7
            r15 = r5
            r16 = r8
            r17 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            r18 = r7
            kotlin.jvm.functions.Function2 r18 = (kotlin.jvm.functions.Function2) r18     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            r19 = r1
            kotlin.coroutines.Continuation r19 = (kotlin.coroutines.Continuation) r19     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            r1.L$0 = r5     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            r1.label = r3     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            r17 = 0
            r20 = 4
            r21 = 0
            r15 = r2
            r16 = r6
            java.lang.Object r2 = kotlinx.coroutines.flow.internal.ChannelFlowKt.withContextUndispatched$default(r15, r16, r17, r18, r19, r20, r21)     // Catch: java.lang.Throwable -> L9b kotlinx.coroutines.flow.internal.AbortFlowException -> L9e
            if (r2 != r0) goto L96
            return r0
        L96:
            r2 = r5
        L97:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r2, r4, r3, r4)
            goto La6
        L9b:
            r0 = move-exception
            r2 = r5
            goto La9
        L9e:
            r0 = move-exception
            r2 = r5
        La0:
            kotlinx.coroutines.flow.FlowCollector<R> r5 = r1.$this_unsafeFlow     // Catch: java.lang.Throwable -> L18
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r0, r5)     // Catch: java.lang.Throwable -> L18
            goto L97
        La6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        La9:
            kotlinx.coroutines.channels.ReceiveChannel.DefaultImpls.cancel$default(r2, r4, r3, r4)
            throw r0
    }
}
