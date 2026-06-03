package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", i = {}, l = {214, 218, 219, 225}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__ShareKt$launchSharing$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ T $initialValue;
    final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> $shared;
    final /* synthetic */ kotlinx.coroutines.flow.SharingStarted $started;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<java.lang.Integer, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ int I$0;
        int label;

        AnonymousClass1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
                r0.<init>(r3)
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                r0.I$0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        public final java.lang.Object invoke(int r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass1) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Integer r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r1.label
                if (r0 != 0) goto L16
                kotlin.ResultKt.throwOnFailure(r2)
                int r2 = r1.I$0
                if (r2 <= 0) goto L10
                r2 = 1
                goto L11
            L10:
                r2 = 0
            L11:
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r2
            L16:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Share.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", i = {}, l = {227}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ T $initialValue;
        final /* synthetic */ kotlinx.coroutines.flow.MutableSharedFlow<T> $shared;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
        /* synthetic */ java.lang.Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2$WhenMappings */
        /* JADX INFO: compiled from: Share.kt */
        @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

            static {
                    kotlinx.coroutines.flow.SharingCommand[] r0 = kotlinx.coroutines.flow.SharingCommand.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.START
                    int r1 = r1.ordinal()
                    r2 = 1
                    r0[r1] = r2
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP
                    int r1 = r1.ordinal()
                    r2 = 2
                    r0[r1] = r2
                    kotlinx.coroutines.flow.SharingCommand r1 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                    int r1 = r1.ordinal()
                    r2 = 3
                    r0[r1] = r2
                    kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0 = r0
                    return
            }
        }

        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.MutableSharedFlow<T> r2, T r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2> r4) {
                r0 = this;
                r0.$upstream = r1
                r0.$shared = r2
                r0.$initialValue = r3
                r1 = 2
                r0.<init>(r1, r4)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
                kotlinx.coroutines.flow.Flow<T> r1 = r4.$upstream
                kotlinx.coroutines.flow.MutableSharedFlow<T> r2 = r4.$shared
                T r3 = r4.$initialValue
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2) r1
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
                goto L52
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.flow.SharingCommand r5 = (kotlinx.coroutines.flow.SharingCommand) r5
                int[] r1 = kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1.AnonymousClass2.WhenMappings.$EnumSwitchMapping$0
                int r5 = r5.ordinal()
                r5 = r1[r5]
                if (r5 == r2) goto L40
                r0 = 3
                if (r5 == r0) goto L2c
                goto L52
            L2c:
                T r5 = r4.$initialValue
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.SharedFlowKt.NO_VALUE
                if (r5 != r0) goto L38
                kotlinx.coroutines.flow.MutableSharedFlow<T> r5 = r4.$shared
                r5.resetReplayCache()
                goto L52
            L38:
                kotlinx.coroutines.flow.MutableSharedFlow<T> r5 = r4.$shared
                T r0 = r4.$initialValue
                r5.tryEmit(r0)
                goto L52
            L40:
                kotlinx.coroutines.flow.Flow<T> r5 = r4.$upstream
                kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r4.$shared
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                r3 = r4
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r3)
                if (r5 != r0) goto L52
                return r0
            L52:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    FlowKt__ShareKt$launchSharing$1(kotlinx.coroutines.flow.SharingStarted r1, kotlinx.coroutines.flow.Flow<? extends T> r2, kotlinx.coroutines.flow.MutableSharedFlow<T> r3, T r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1> r5) {
            r0 = this;
            r0.$started = r1
            r0.$upstream = r2
            r0.$shared = r3
            r0.$initialValue = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
            r6 = this;
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r7 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1
            kotlinx.coroutines.flow.SharingStarted r1 = r6.$started
            kotlinx.coroutines.flow.Flow<T> r2 = r6.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r3 = r6.$shared
            T r4 = r6.$initialValue
            r0 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            return r7
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
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L26
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 == r3) goto L21
            if (r1 != r2) goto L15
            goto L21
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L6b
        L21:
            kotlin.ResultKt.throwOnFailure(r8)
            goto La6
        L26:
            kotlin.ResultKt.throwOnFailure(r8)
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.SharingStarted$Companion r1 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r1 = r1.getEagerly()
            if (r8 != r1) goto L45
            kotlinx.coroutines.flow.Flow<T> r8 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r7.$shared
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r2 = r7
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r7.label = r5
            java.lang.Object r8 = r8.collect(r1, r2)
            if (r8 != r0) goto La6
            return r0
        L45:
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.SharingStarted$Companion r1 = kotlinx.coroutines.flow.SharingStarted.Companion
            kotlinx.coroutines.flow.SharingStarted r1 = r1.getLazily()
            r5 = 0
            if (r8 != r1) goto L7d
            kotlinx.coroutines.flow.MutableSharedFlow<T> r8 = r7.$shared
            kotlinx.coroutines.flow.StateFlow r8 = r8.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1
            r1.<init>(r5)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r2 = r7
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r7.label = r4
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.first(r8, r1, r2)
            if (r8 != r0) goto L6b
            return r0
        L6b:
            kotlinx.coroutines.flow.Flow<T> r8 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r7.$shared
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r2 = r7
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r7.label = r3
            java.lang.Object r8 = r8.collect(r1, r2)
            if (r8 != r0) goto La6
            return r0
        L7d:
            kotlinx.coroutines.flow.SharingStarted r8 = r7.$started
            kotlinx.coroutines.flow.MutableSharedFlow<T> r1 = r7.$shared
            kotlinx.coroutines.flow.StateFlow r1 = r1.getSubscriptionCount()
            kotlinx.coroutines.flow.Flow r8 = r8.command(r1)
            kotlinx.coroutines.flow.Flow r8 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r8)
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2 r1 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2
            kotlinx.coroutines.flow.Flow<T> r3 = r7.$upstream
            kotlinx.coroutines.flow.MutableSharedFlow<T> r4 = r7.$shared
            T r6 = r7.$initialValue
            r1.<init>(r3, r4, r6, r5)
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r3 = r7
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.collectLatest(r8, r1, r3)
            if (r8 != r0) goto La6
            return r0
        La6:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
