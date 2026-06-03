package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B?\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0014J\u001f\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\u0006\u0010\u0011\u001a\u00020\u0017H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlowMerge;", "T", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "flow", "Lkotlinx/coroutines/flow/Flow;", "concurrency", "", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlinx/coroutines/flow/Flow;ILkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "additionalToStringProps", "", "collectTo", "", "scope", "Lkotlinx/coroutines/channels/ProducerScope;", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ChannelFlowMerge<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private final int concurrency;
    private final kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "T", "inner", "Lkotlinx/coroutines/flow/Flow;", "emit", "(Lkotlinx/coroutines/flow/Flow;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {
        final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
        final /* synthetic */ kotlinx.coroutines.Job $job;
        final /* synthetic */ kotlinx.coroutines.channels.ProducerScope<T> $scope;
        final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
        static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
            final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
            final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $inner;
            final /* synthetic */ kotlinx.coroutines.sync.Semaphore $semaphore;
            int label;

            AnonymousClass1(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.internal.SendingCollector<T> r2, kotlinx.coroutines.sync.Semaphore r3, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1> r4) {
                    r0 = this;
                    r0.$inner = r1
                    r0.$collector = r2
                    r0.$semaphore = r3
                    r1 = 2
                    r0.<init>(r1, r4)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                    r3 = this;
                    kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                    kotlinx.coroutines.flow.Flow<T> r0 = r3.$inner
                    kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r3.$collector
                    kotlinx.coroutines.sync.Semaphore r2 = r3.$semaphore
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
                    kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r1 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2.AnonymousClass1) r1
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
                    if (r1 == 0) goto L19
                    if (r1 != r2) goto L11
                    kotlin.ResultKt.throwOnFailure(r5)     // Catch: java.lang.Throwable -> Lf
                    goto L2e
                Lf:
                    r5 = move-exception
                    goto L36
                L11:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L19:
                    kotlin.ResultKt.throwOnFailure(r5)
                    kotlinx.coroutines.flow.Flow<T> r5 = r4.$inner     // Catch: java.lang.Throwable -> Lf
                    kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r4.$collector     // Catch: java.lang.Throwable -> Lf
                    kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1     // Catch: java.lang.Throwable -> Lf
                    r3 = r4
                    kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3     // Catch: java.lang.Throwable -> Lf
                    r4.label = r2     // Catch: java.lang.Throwable -> Lf
                    java.lang.Object r5 = r5.collect(r1, r3)     // Catch: java.lang.Throwable -> Lf
                    if (r5 != r0) goto L2e
                    return r0
                L2e:
                    kotlinx.coroutines.sync.Semaphore r5 = r4.$semaphore
                    r5.release()
                    kotlin.Unit r5 = kotlin.Unit.INSTANCE
                    return r5
                L36:
                    kotlinx.coroutines.sync.Semaphore r0 = r4.$semaphore
                    r0.release()
                    throw r5
            }
        }

        AnonymousClass2(kotlinx.coroutines.Job r1, kotlinx.coroutines.sync.Semaphore r2, kotlinx.coroutines.channels.ProducerScope<? super T> r3, kotlinx.coroutines.flow.internal.SendingCollector<T> r4) {
                r0 = this;
                r0.$job = r1
                r0.$semaphore = r2
                r0.$scope = r3
                r0.$collector = r4
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ java.lang.Object emit(java.lang.Object r1, kotlin.coroutines.Continuation r2) {
                r0 = this;
                kotlinx.coroutines.flow.Flow r1 = (kotlinx.coroutines.flow.Flow) r1
                java.lang.Object r1 = r0.emit(r1, r2)
                return r1
        }

        public final java.lang.Object emit(kotlinx.coroutines.flow.Flow<? extends T> r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                if (r0 == 0) goto L14
                r0 = r9
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$emit$1
                r0.<init>(r7, r9)
            L19:
                java.lang.Object r9 = r0.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.label
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r8 = r0.L$1
                kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
                java.lang.Object r0 = r0.L$0
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowMerge.AnonymousClass2) r0
                kotlin.ResultKt.throwOnFailure(r9)
                goto L54
            L32:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L3a:
                kotlin.ResultKt.throwOnFailure(r9)
                kotlinx.coroutines.Job r9 = r7.$job
                if (r9 == 0) goto L44
                kotlinx.coroutines.JobKt.ensureActive(r9)
            L44:
                kotlinx.coroutines.sync.Semaphore r9 = r7.$semaphore
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r9 = r9.acquire(r0)
                if (r9 != r1) goto L53
                return r1
            L53:
                r0 = r7
            L54:
                kotlinx.coroutines.channels.ProducerScope<T> r9 = r0.$scope
                r1 = r9
                kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1 r9 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1
                kotlinx.coroutines.flow.internal.SendingCollector<T> r2 = r0.$collector
                kotlinx.coroutines.sync.Semaphore r0 = r0.$semaphore
                r3 = 0
                r9.<init>(r8, r2, r0, r3)
                r4 = r9
                kotlin.jvm.functions.Function2 r4 = (kotlin.jvm.functions.Function2) r4
                r5 = 3
                r6 = 0
                r2 = 0
                kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    public ChannelFlowMerge(kotlinx.coroutines.flow.Flow<? extends kotlinx.coroutines.flow.Flow<? extends T>> r1, int r2, kotlin.coroutines.CoroutineContext r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.flow = r1
            r0.concurrency = r2
            return
    }

    public /* synthetic */ ChannelFlowMerge(kotlinx.coroutines.flow.Flow r7, int r8, kotlin.coroutines.CoroutineContext r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
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

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.String additionalToStringProps() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "concurrency="
            r0.<init>(r1)
            int r1 = r2.concurrency
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r5 = this;
            int r0 = r5.concurrency
            r1 = 2
            r2 = 0
            r3 = 0
            kotlinx.coroutines.sync.Semaphore r0 = kotlinx.coroutines.sync.SemaphoreKt.Semaphore$default(r0, r3, r1, r2)
            kotlinx.coroutines.flow.internal.SendingCollector r1 = new kotlinx.coroutines.flow.internal.SendingCollector
            r2 = r6
            kotlinx.coroutines.channels.SendChannel r2 = (kotlinx.coroutines.channels.SendChannel) r2
            r1.<init>(r2)
            kotlin.coroutines.CoroutineContext r2 = r7.getContext()
            kotlinx.coroutines.Job$Key r3 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r3 = (kotlin.coroutines.CoroutineContext.Key) r3
            kotlin.coroutines.CoroutineContext$Element r2 = r2.get(r3)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> r3 = r5.flow
            kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2
            r4.<init>(r2, r0, r6, r1)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r6 = r3.collect(r4, r7)
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r6 != r7) goto L33
            return r6
        L33:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext r8, int r9, kotlinx.coroutines.channels.BufferOverflow r10) {
            r7 = this;
            kotlinx.coroutines.flow.internal.ChannelFlowMerge r6 = new kotlinx.coroutines.flow.internal.ChannelFlowMerge
            kotlinx.coroutines.flow.Flow<kotlinx.coroutines.flow.Flow<T>> r1 = r7.flow
            int r2 = r7.concurrency
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.internal.ChannelFlow r6 = (kotlinx.coroutines.flow.internal.ChannelFlow) r6
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope r4) {
            r3 = this;
            kotlin.coroutines.CoroutineContext r0 = r3.context
            int r1 = r3.capacity
            kotlin.jvm.functions.Function2 r2 = r3.getCollectToFun$kotlinx_coroutines_core()
            kotlinx.coroutines.channels.ReceiveChannel r4 = kotlinx.coroutines.channels.ProduceKt.produce(r4, r0, r1, r2)
            return r4
    }
}
