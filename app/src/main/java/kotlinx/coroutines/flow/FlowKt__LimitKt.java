package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aV\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000323\b\u0004\u0010\u0004\u001a-\b\u0001\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005H\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\f\u001a$\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aH\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a+\u0010\u0012\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00132\u0006\u0010\b\u001a\u0002H\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000f\u001aH\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\"\u0010\u0004\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0005ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001ap\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00190\u0003\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0019*\b\u0012\u0004\u0012\u0002H\u00020\u00032D\b\u0001\u0010\u001a\u001a>\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00190\u0013\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u001b¢\u0006\u0002\b\u001cø\u0001\u0000¢\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"collectWhile", "", "T", "Lkotlinx/coroutines/flow/Flow;", "predicate", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "value", "Lkotlin/coroutines/Continuation;", "", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "drop", "count", "", "dropWhile", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;", "emitAbort", "Lkotlinx/coroutines/flow/FlowCollector;", "emitAbort$FlowKt__LimitKt", "(Lkotlinx/coroutines/flow/FlowCollector;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "take", "takeWhile", "transformWhile", "R", "transform", "Lkotlin/Function3;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1, reason: invalid class name */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", i = {0}, l = {136}, m = "collectWhile", n = {"collector"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                r1.result = r2
                int r2 = r1.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.label = r2
                r2 = 0
                r0 = r1
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt__LimitKt.collectWhile(r2, r2, r0)
                return r2
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: Limit.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", i = {0}, l = {152}, m = "invokeSuspend", n = {"collector$iv"}, s = {"L$0"})
    static final class C01351<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_transformWhile;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> $transform;
        private /* synthetic */ java.lang.Object L$0;
        int label;

        C01351(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__LimitKt.C01351> r3) {
                r0 = this;
                r0.$this_transformWhile = r1
                r0.$transform = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1
                kotlinx.coroutines.flow.Flow<T> r1 = r3.$this_transformWhile
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r2 = r3.$transform
                r0.<init>(r1, r2, r5)
                r0.L$0 = r4
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

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r1 = (kotlinx.coroutines.flow.FlowKt__LimitKt.C01351) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r0
                kotlin.ResultKt.throwOnFailure(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L13
                goto L45
            L13:
                r6 = move-exception
                goto L40
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                kotlin.ResultKt.throwOnFailure(r6)
                java.lang.Object r6 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                kotlinx.coroutines.flow.Flow<T> r1 = r5.$this_transformWhile
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> r3 = r5.$transform
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r4 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
                r4.<init>(r3, r6)
                r6 = r4
                kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3e
                r3 = r5
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3e
                r5.L$0 = r4     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3e
                r5.label = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3e
                java.lang.Object r6 = r1.collect(r6, r3)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L3e
                if (r6 != r0) goto L45
                return r0
            L3e:
                r6 = move-exception
                r0 = r4
            L40:
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r6, r0)
            L45:
                kotlin.Unit r6 = kotlin.Unit.INSTANCE
                return r6
        }
    }

    public static final /* synthetic */ java.lang.Object access$emitAbort$FlowKt__LimitKt(kotlinx.coroutines.flow.FlowCollector r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = emitAbort$FlowKt__LimitKt(r0, r1, r2)
            return r0
    }

    public static final <T> java.lang.Object collectWhile(kotlinx.coroutines.flow.Flow<? extends T> r4, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r4 = (kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1) r4
            kotlin.ResultKt.throwOnFailure(r6)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2e
            goto L55
        L2e:
            r5 = move-exception
            goto L50
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r6 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r6.<init>(r5)
            r5 = r6
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.L$0 = r6     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            r0.label = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            java.lang.Object r4 = r4.collect(r5, r0)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4e
            if (r4 != r1) goto L55
            return r1
        L4e:
            r5 = move-exception
            r4 = r6
        L50:
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r5, r4)
        L55:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }

    private static final <T> java.lang.Object collectWhile$$forInline(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$collector$1
            r0.<init>(r3)
            r3 = r0
            kotlinx.coroutines.flow.FlowCollector r3 = (kotlinx.coroutines.flow.FlowCollector) r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L14
            r1 = 0
            kotlin.jvm.internal.InlineMarker.mark(r1)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L14
            r2.collect(r3, r4)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L14
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L14
            goto L1a
        L14:
            r2 = move-exception
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r2, r0)
        L1a:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> drop(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2) {
            if (r2 < 0) goto La
            kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Drop count should be non-negative, but had "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> dropWhile(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    private static final <T> java.lang.Object emitAbort$FlowKt__LimitKt(kotlinx.coroutines.flow.FlowCollector<? super T> r4, T r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            if (r0 == 0) goto L14
            r0 = r6
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r6 = r0.label
            int r6 = r6 - r2
            r0.label = r6
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$emitAbort$1
            r0.<init>(r6)
        L19:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 == r3) goto L2e
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2e:
            java.lang.Object r4 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            kotlin.ResultKt.throwOnFailure(r6)
            goto L44
        L36:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.L$0 = r4
            r0.label = r3
            java.lang.Object r5 = r4.emit(r5, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> take(kotlinx.coroutines.flow.Flow<? extends T> r1, int r2) {
            if (r2 <= 0) goto La
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "Requested element count "
            r1.<init>(r0)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " should be positive"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> takeWhile(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r2) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1
            r0.<init>(r1, r2)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    public static final <T, R> kotlinx.coroutines.flow.Flow<R> transformWhile(kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T, ? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1
            r1 = 0
            r0.<init>(r2, r3, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.Flow r2 = kotlinx.coroutines.flow.FlowKt.flow(r0)
            return r2
    }
}
