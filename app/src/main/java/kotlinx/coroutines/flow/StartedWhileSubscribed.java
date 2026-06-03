package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0017J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/flow/StartedWhileSubscribed;", "Lkotlinx/coroutines/flow/SharingStarted;", "stopTimeout", "", "replayExpiration", "(JJ)V", "command", "Lkotlinx/coroutines/flow/Flow;", "Lkotlinx/coroutines/flow/SharingCommand;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "equals", "", "other", "", "hashCode", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class StartedWhileSubscribed implements kotlinx.coroutines.flow.SharingStarted {
    private final long replayExpiration;
    private final long stopTimeout;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$1, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lkotlinx/coroutines/flow/SharingCommand;", "count", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", i = {1, 2, 3}, l = {178, 180, 182, 183, 185}, m = "invokeSuspend", n = {"$this$transformLatest", "$this$transformLatest", "$this$transformLatest"}, s = {"L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand>, java.lang.Integer, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ int I$0;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.flow.StartedWhileSubscribed this$0;

        AnonymousClass1(kotlinx.coroutines.flow.StartedWhileSubscribed r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass1> r2) {
                r0 = this;
                r0.this$0 = r1
                r1 = 3
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r1, java.lang.Integer r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Number r2 = (java.lang.Number) r2
                int r2 = r2.intValue()
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super kotlinx.coroutines.flow.SharingCommand> r3, int r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1
                kotlinx.coroutines.flow.StartedWhileSubscribed r1 = r2.this$0
                r0.<init>(r1, r5)
                r0.L$0 = r3
                r0.I$0 = r4
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                if (r1 == 0) goto L3d
                if (r1 == r6) goto L39
                if (r1 == r5) goto L31
                if (r1 == r4) goto L29
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L39
            L18:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L20:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L9b
            L29:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L87
            L31:
                java.lang.Object r1 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.ResultKt.throwOnFailure(r10)
                goto L6b
            L39:
                kotlin.ResultKt.throwOnFailure(r10)
                goto Lac
            L3d:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r1 = r10
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                int r10 = r9.I$0
                if (r10 <= 0) goto L57
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.START
                r2 = r9
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                r9.label = r6
                java.lang.Object r10 = r1.emit(r10, r2)
                if (r10 != r0) goto Lac
                return r0
            L57:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
                long r6 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getStopTimeout$p(r10)
                r10 = r9
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r9.L$0 = r1
                r9.label = r5
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r6, r10)
                if (r10 != r0) goto L6b
                return r0
            L6b:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
                long r5 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r7 = 0
                int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r10 <= 0) goto L9b
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP
                r5 = r9
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r9.L$0 = r1
                r9.label = r4
                java.lang.Object r10 = r1.emit(r10, r5)
                if (r10 != r0) goto L87
                return r0
            L87:
                kotlinx.coroutines.flow.StartedWhileSubscribed r10 = r9.this$0
                long r4 = kotlinx.coroutines.flow.StartedWhileSubscribed.access$getReplayExpiration$p(r10)
                r10 = r9
                kotlin.coroutines.Continuation r10 = (kotlin.coroutines.Continuation) r10
                r9.L$0 = r1
                r9.label = r3
                java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r4, r10)
                if (r10 != r0) goto L9b
                return r0
            L9b:
                kotlinx.coroutines.flow.SharingCommand r10 = kotlinx.coroutines.flow.SharingCommand.STOP_AND_RESET_REPLAY_CACHE
                r3 = r9
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4 = 0
                r9.L$0 = r4
                r9.label = r2
                java.lang.Object r10 = r1.emit(r10, r3)
                if (r10 != r0) goto Lac
                return r0
            Lac:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StartedWhileSubscribed$command$2, reason: invalid class name */
    /* JADX INFO: compiled from: SharingStarted.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lkotlinx/coroutines/flow/SharingCommand;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.SharingCommand, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
        /* synthetic */ java.lang.Object L$0;
        int label;

        AnonymousClass2(kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2> r2) {
                r1 = this;
                r0 = 2
                r1.<init>(r0, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r2, kotlin.coroutines.Continuation<?> r3) {
                r1 = this;
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$2
                r0.<init>(r3)
                r0.L$0 = r2
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlinx.coroutines.flow.SharingCommand r1 = (kotlinx.coroutines.flow.SharingCommand) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlinx.coroutines.flow.SharingCommand r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r1 = (kotlinx.coroutines.flow.StartedWhileSubscribed.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r0 = r1.label
                if (r0 != 0) goto L1a
                kotlin.ResultKt.throwOnFailure(r2)
                java.lang.Object r2 = r1.L$0
                kotlinx.coroutines.flow.SharingCommand r2 = (kotlinx.coroutines.flow.SharingCommand) r2
                kotlinx.coroutines.flow.SharingCommand r0 = kotlinx.coroutines.flow.SharingCommand.START
                if (r2 == r0) goto L14
                r2 = 1
                goto L15
            L14:
                r2 = 0
            L15:
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                return r2
            L1a:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public StartedWhileSubscribed(long r5, long r7) {
            r4 = this;
            r4.<init>()
            r4.stopTimeout = r5
            r4.replayExpiration = r7
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            java.lang.String r3 = " ms) cannot be negative"
            if (r2 < 0) goto L31
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 < 0) goto L14
            return
        L14:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "replayExpiration("
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L31:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "stopTimeout("
            r7.<init>(r8)
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static final /* synthetic */ long access$getReplayExpiration$p(kotlinx.coroutines.flow.StartedWhileSubscribed r2) {
            long r0 = r2.replayExpiration
            return r0
    }

    public static final /* synthetic */ long access$getStopTimeout$p(kotlinx.coroutines.flow.StartedWhileSubscribed r2) {
            long r0 = r2.stopTimeout
            return r0
    }

    @Override // kotlinx.coroutines.flow.SharingStarted
    public kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.SharingCommand> command(kotlinx.coroutines.flow.StateFlow<java.lang.Integer> r3) {
            r2 = this;
            kotlinx.coroutines.flow.Flow r3 = (kotlinx.coroutines.flow.Flow) r3
            kotlinx.coroutines.flow.StartedWhileSubscribed$command$1 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function3 r0 = (kotlin.jvm.functions.Function3) r0
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.transformLatest(r3, r0)
            kotlinx.coroutines.flow.StartedWhileSubscribed$command$2 r0 = new kotlinx.coroutines.flow.StartedWhileSubscribed$command$2
            r0.<init>(r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.dropWhile(r3, r0)
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.distinctUntilChanged(r3)
            return r3
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.StartedWhileSubscribed
            if (r0 == 0) goto L18
            long r0 = r4.stopTimeout
            kotlinx.coroutines.flow.StartedWhileSubscribed r5 = (kotlinx.coroutines.flow.StartedWhileSubscribed) r5
            long r2 = r5.stopTimeout
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L18
            long r0 = r4.replayExpiration
            long r2 = r5.replayExpiration
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            return r5
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.stopTimeout
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.replayExpiration
            int r1 = java.lang.Long.hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r12 = this;
            r0 = 2
            java.util.List r0 = kotlin.collections.CollectionsKt.createListBuilder(r0)
            long r1 = r12.stopTimeout
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r2 = "ms"
            if (r1 <= 0) goto L27
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "stopTimeout="
            r1.<init>(r3)
            long r3 = r12.stopTimeout
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L27:
            long r3 = r12.replayExpiration
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L4a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "replayExpiration="
            r1.<init>(r3)
            long r3 = r12.replayExpiration
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L4a:
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SharingStarted.WhileSubscribed("
            r1.<init>(r2)
            r3 = r0
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            r10 = 63
            r11 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r0 = r1.append(r0)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
