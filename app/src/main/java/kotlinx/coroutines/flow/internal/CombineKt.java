package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001an\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u00012(\u0010\u0007\u001a$\b\u0001\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\bH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u0090\u0001\u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u00010\u00112\u0016\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u0001H\u000e\u0018\u00010\u00110\u001329\u0010\u0007\u001a5\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\b¢\u0006\u0002\b\u0014H\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u0015*\u001c\b\u0002\u0010\u0016\"\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00172\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0017\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"zipImpl", "Lkotlinx/coroutines/flow/Flow;", "R", "T1", "T2", "flow", "flow2", "transform", "Lkotlin/Function3;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/flow/Flow;", "combineInternal", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;", "flows", "", "arrayFactory", "Lkotlin/Function0;", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/flow/FlowCollector;[Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Update", "Lkotlin/collections/IndexedValue;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class CombineKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {57, 79, 82}, m = "invokeSuspend", n = {"latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch", "latestValues", "resultChannel", "lastReceivedEpoch", "remainingAbsentValues", "currentEpoch"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2", "I$0", "I$1"})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function0<T[]> $arrayFactory;
        final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<R> $this_combineInternal;
        final /* synthetic */ kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $transform;
        int I$0;
        int I$1;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "R", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ java.util.concurrent.atomic.AtomicInteger $nonClosed;
            final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "R", "T", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
            static final class C00161<T> implements kotlinx.coroutines.flow.FlowCollector {
                final /* synthetic */ int $i;
                final /* synthetic */ kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> $resultChannel;

                C00161(kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r1, int r2) {
                        r0 = this;
                        r0.$resultChannel = r1
                        r0.$i = r2
                        r0.<init>()
                        return
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final java.lang.Object emit(T r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        if (r0 == 0) goto L14
                        r0 = r8
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r1 = r1 & r2
                        if (r1 == 0) goto L14
                        int r8 = r0.label
                        int r8 = r8 - r2
                        r0.label = r8
                        goto L19
                    L14:
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        r0.<init>(r6, r8)
                    L19:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        if (r2 == 0) goto L39
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L57
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        kotlin.ResultKt.throwOnFailure(r8)
                        goto L4e
                    L39:
                        kotlin.ResultKt.throwOnFailure(r8)
                        kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r8 = r6.$resultChannel
                        kotlin.collections.IndexedValue r2 = new kotlin.collections.IndexedValue
                        int r5 = r6.$i
                        r2.<init>(r5, r7)
                        r0.label = r4
                        java.lang.Object r7 = r8.send(r2, r0)
                        if (r7 != r1) goto L4e
                        return r1
                    L4e:
                        r0.label = r3
                        java.lang.Object r7 = kotlinx.coroutines.YieldKt.yield(r0)
                        if (r7 != r1) goto L57
                        return r1
                    L57:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                }
            }

            AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T>[] r1, int r2, java.util.concurrent.atomic.AtomicInteger r3, kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1> r5) {
                    r0 = this;
                    r0.$flows = r1
                    r0.$i = r2
                    r0.$nonClosed = r3
                    r0.$resultChannel = r4
                    r1 = 2
                    r0.<init>(r1, r5)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r7, kotlin.coroutines.Continuation<?> r8) {
                    r6 = this;
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r7 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
                    kotlinx.coroutines.flow.Flow<T>[] r1 = r6.$flows
                    int r2 = r6.$i
                    java.util.concurrent.atomic.AtomicInteger r3 = r6.$nonClosed
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r4 = r6.$resultChannel
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
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r1 = (kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1) r1
                    kotlin.Unit r2 = kotlin.Unit.INSTANCE
                    java.lang.Object r1 = r1.invokeSuspend(r2)
                    return r1
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r6.label
                    r2 = 0
                    r3 = 1
                    if (r1 == 0) goto L1a
                    if (r1 != r3) goto L12
                    kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> L10
                    goto L3a
                L10:
                    r7 = move-exception
                    goto L4c
                L12:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L1a:
                    kotlin.ResultKt.throwOnFailure(r7)
                    kotlinx.coroutines.flow.Flow<T>[] r7 = r6.$flows     // Catch: java.lang.Throwable -> L10
                    int r1 = r6.$i     // Catch: java.lang.Throwable -> L10
                    r7 = r7[r1]     // Catch: java.lang.Throwable -> L10
                    kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1 r1 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1     // Catch: java.lang.Throwable -> L10
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r4 = r6.$resultChannel     // Catch: java.lang.Throwable -> L10
                    int r5 = r6.$i     // Catch: java.lang.Throwable -> L10
                    r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L10
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1     // Catch: java.lang.Throwable -> L10
                    r4 = r6
                    kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4     // Catch: java.lang.Throwable -> L10
                    r6.label = r3     // Catch: java.lang.Throwable -> L10
                    java.lang.Object r7 = r7.collect(r1, r4)     // Catch: java.lang.Throwable -> L10
                    if (r7 != r0) goto L3a
                    return r0
                L3a:
                    java.util.concurrent.atomic.AtomicInteger r7 = r6.$nonClosed
                    int r7 = r7.decrementAndGet()
                    if (r7 != 0) goto L49
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r7 = r6.$resultChannel
                    kotlinx.coroutines.channels.SendChannel r7 = (kotlinx.coroutines.channels.SendChannel) r7
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r7, r2, r3, r2)
                L49:
                    kotlin.Unit r7 = kotlin.Unit.INSTANCE
                    return r7
                L4c:
                    java.util.concurrent.atomic.AtomicInteger r0 = r6.$nonClosed
                    int r0 = r0.decrementAndGet()
                    if (r0 != 0) goto L5b
                    kotlinx.coroutines.channels.Channel<kotlin.collections.IndexedValue<java.lang.Object>> r0 = r6.$resultChannel
                    kotlinx.coroutines.channels.SendChannel r0 = (kotlinx.coroutines.channels.SendChannel) r0
                    kotlinx.coroutines.channels.SendChannel.DefaultImpls.close$default(r0, r2, r3, r2)
                L5b:
                    throw r7
            }
        }

        AnonymousClass2(kotlinx.coroutines.flow.Flow<? extends T>[] r1, kotlin.jvm.functions.Function0<T[]> r2, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r3, kotlinx.coroutines.flow.FlowCollector<? super R> r4, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2> r5) {
                r0 = this;
                r0.$flows = r1
                r0.$arrayFactory = r2
                r0.$transform = r3
                r0.$this_combineInternal = r4
                r1 = 2
                r0.<init>(r1, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r8, kotlin.coroutines.Continuation<?> r9) {
                r7 = this;
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r6 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2
                kotlinx.coroutines.flow.Flow<T>[] r1 = r7.$flows
                kotlin.jvm.functions.Function0<T[]> r2 = r7.$arrayFactory
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r7.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r4 = r7.$this_combineInternal
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
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r1 = (kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r24) {
                r23 = this;
                r0 = r23
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L58
                if (r2 == r5) goto L35
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1c:
                int r2 = r0.I$1
                int r6 = r0.I$0
                java.lang.Object r7 = r0.L$2
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.channels.Channel r8 = (kotlinx.coroutines.channels.Channel) r8
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                kotlin.ResultKt.throwOnFailure(r24)
                r21 = r2
                r2 = r7
                r7 = r8
                goto L13d
            L35:
                int r2 = r0.I$1
                int r6 = r0.I$0
                java.lang.Object r7 = r0.L$2
                byte[] r7 = (byte[]) r7
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.channels.Channel r8 = (kotlinx.coroutines.channels.Channel) r8
                java.lang.Object r9 = r0.L$0
                java.lang.Object[] r9 = (java.lang.Object[]) r9
                kotlin.ResultKt.throwOnFailure(r24)
                r10 = r24
                kotlinx.coroutines.channels.ChannelResult r10 = (kotlinx.coroutines.channels.ChannelResult) r10
                java.lang.Object r10 = r10.m2289unboximpl()
                r22 = r8
                r8 = r2
                r2 = r7
                r7 = r22
                goto Lc5
            L58:
                kotlin.ResultKt.throwOnFailure(r24)
                java.lang.Object r2 = r0.L$0
                kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
                kotlinx.coroutines.flow.Flow<T>[] r6 = r0.$flows
                int r12 = r6.length
                if (r12 != 0) goto L67
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            L67:
                java.lang.Object[] r13 = new java.lang.Object[r12]
                kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED
                r10 = 6
                r11 = 0
                r8 = 0
                r9 = 0
                r6 = r13
                kotlin.collections.ArraysKt.fill$default(r6, r7, r8, r9, r10, r11)
                r6 = 6
                r7 = 0
                kotlinx.coroutines.channels.Channel r20 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r12, r7, r7, r6, r7)
                java.util.concurrent.atomic.AtomicInteger r11 = new java.util.concurrent.atomic.AtomicInteger
                r11.<init>(r12)
                r21 = 0
                r10 = r21
            L82:
                if (r10 >= r12) goto La6
                kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1 r6 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1
                kotlinx.coroutines.flow.Flow<T>[] r15 = r0.$flows
                r19 = 0
                r14 = r6
                r16 = r10
                r17 = r11
                r18 = r20
                r14.<init>(r15, r16, r17, r18, r19)
                r9 = r6
                kotlin.jvm.functions.Function2 r9 = (kotlin.jvm.functions.Function2) r9
                r14 = 3
                r15 = 0
                r7 = 0
                r8 = 0
                r6 = r2
                r10 = r14
                r14 = r11
                r11 = r15
                kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                int r10 = r16 + 1
                r11 = r14
                goto L82
            La6:
                byte[] r2 = new byte[r12]
                r6 = r12
                r7 = r20
            Lab:
                int r8 = r21 + 1
                byte r8 = (byte) r8
                r9 = r0
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r0.L$0 = r13
                r0.L$1 = r7
                r0.L$2 = r2
                r0.I$0 = r6
                r0.I$1 = r8
                r0.label = r5
                java.lang.Object r10 = r7.mo2270receiveCatchingJP2dKIU(r9)
                if (r10 != r1) goto Lc4
                return r1
            Lc4:
                r9 = r13
            Lc5:
                java.lang.Object r10 = kotlinx.coroutines.channels.ChannelResult.m2282getOrNullimpl(r10)
                kotlin.collections.IndexedValue r10 = (kotlin.collections.IndexedValue) r10
                if (r10 != 0) goto Ld0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
            Ld0:
                int r11 = r10.getIndex()
                r12 = r9[r11]
                java.lang.Object r10 = r10.getValue()
                r9[r11] = r10
                kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.flow.internal.NullSurrogateKt.UNINITIALIZED
                if (r12 != r10) goto Le2
                int r6 = r6 + (-1)
            Le2:
                r10 = r2[r11]
                if (r10 == r8) goto Lf5
                byte r10 = (byte) r8
                r2[r11] = r10
                java.lang.Object r10 = r7.mo2271tryReceivePtdJZtk()
                java.lang.Object r10 = kotlinx.coroutines.channels.ChannelResult.m2282getOrNullimpl(r10)
                kotlin.collections.IndexedValue r10 = (kotlin.collections.IndexedValue) r10
                if (r10 != 0) goto Ld0
            Lf5:
                if (r6 != 0) goto L13b
                kotlin.jvm.functions.Function0<T[]> r10 = r0.$arrayFactory
                java.lang.Object r10 = r10.invoke()
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                if (r10 != 0) goto L118
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r10 = r0.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r11 = r0.$this_combineInternal
                r0.L$0 = r9
                r0.L$1 = r7
                r0.L$2 = r2
                r0.I$0 = r6
                r0.I$1 = r8
                r0.label = r4
                java.lang.Object r10 = r10.invoke(r11, r9, r0)
                if (r10 != r1) goto L13b
                return r1
            L118:
                r16 = 14
                r17 = 0
                r13 = 0
                r14 = 0
                r15 = 0
                r11 = r9
                r12 = r10
                kotlin.collections.ArraysKt.copyInto$default(r11, r12, r13, r14, r15, r16, r17)
                kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r11 = r0.$transform
                kotlinx.coroutines.flow.FlowCollector<R> r12 = r0.$this_combineInternal
                r0.L$0 = r9
                r0.L$1 = r7
                r0.L$2 = r2
                r0.I$0 = r6
                r0.I$1 = r8
                r0.label = r3
                java.lang.Object r10 = r11.invoke(r12, r10, r0)
                if (r10 != r1) goto L13b
                return r1
            L13b:
                r21 = r8
            L13d:
                r13 = r9
                goto Lab
        }
    }

    public static final <R, T> java.lang.Object combineInternal(kotlinx.coroutines.flow.FlowCollector<? super R> r7, kotlinx.coroutines.flow.Flow<? extends T>[] r8, kotlin.jvm.functions.Function0<T[]> r9, kotlin.jvm.functions.Function3<? super kotlinx.coroutines.flow.FlowCollector<? super R>, ? super T[], ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
            kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2 r6 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2
            r5 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
            java.lang.Object r7 = kotlinx.coroutines.flow.internal.FlowCoroutineKt.flowScope(r6, r11)
            java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r7 != r8) goto L18
            return r7
        L18:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }

    public static final <T1, T2, R> kotlinx.coroutines.flow.Flow<R> zipImpl(kotlinx.coroutines.flow.Flow<? extends T1> r1, kotlinx.coroutines.flow.Flow<? extends T2> r2, kotlin.jvm.functions.Function3<? super T1, ? super T2, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            r0.<init>(r2, r1, r3)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }
}
