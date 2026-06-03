package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\n\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u001f\u0010\u0017\u001a\u00020\u000e2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u000e2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\fH¤@ø\u0001\u0000¢\u0006\u0002\u0010\u001dJ&\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH$J\u0010\u0010\u001f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 H\u0016J&\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u001c\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0016H\u0016R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R9\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000b8@X\u0080\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00068@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lkotlinx/coroutines/flow/internal/ChannelFlow;", "T", "Lkotlinx/coroutines/flow/internal/FusibleFlow;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "onBufferOverflow", "Lkotlinx/coroutines/channels/BufferOverflow;", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "collectToFun", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "", "getCollectToFun$kotlinx_coroutines_core", "()Lkotlin/jvm/functions/Function2;", "produceCapacity", "getProduceCapacity$kotlinx_coroutines_core", "()I", "additionalToStringProps", "", "collect", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "collectTo", "scope", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "dropChannelOperators", "Lkotlinx/coroutines/flow/Flow;", "fuse", "produceImpl", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/CoroutineScope;", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class ChannelFlow<T> implements kotlinx.coroutines.flow.internal.FusibleFlow<T> {
    public final int capacity;
    public final kotlin.coroutines.CoroutineContext context;
    public final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: ChannelFlow.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", i = {}, l = {123}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $collector;
        private /* synthetic */ java.lang.Object L$0;
        int label;
        final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlow<T> this$0;

        AnonymousClass2(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlinx.coroutines.flow.internal.ChannelFlow<T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlow.AnonymousClass2> r3) {
                r0 = this;
                r0.$collector = r1
                r0.this$0 = r2
                r1 = 2
                r0.<init>(r1, r3)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
                r3 = this;
                kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collect$2
                kotlinx.coroutines.flow.FlowCollector<T> r1 = r3.$collector
                kotlinx.coroutines.flow.internal.ChannelFlow<T> r2 = r3.this$0
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
                kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 r1 = (kotlinx.coroutines.flow.internal.ChannelFlow.AnonymousClass2) r1
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
                goto L32
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.throwOnFailure(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                kotlinx.coroutines.flow.FlowCollector<T> r1 = r4.$collector
                kotlinx.coroutines.flow.internal.ChannelFlow<T> r3 = r4.this$0
                kotlinx.coroutines.channels.ReceiveChannel r5 = r3.produceImpl(r5)
                r3 = r4
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r4.label = r2
                java.lang.Object r5 = kotlinx.coroutines.flow.FlowKt.emitAll(r1, r5, r3)
                if (r5 != r0) goto L32
                return r0
            L32:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    public ChannelFlow(kotlin.coroutines.CoroutineContext r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.capacity = r2
            r0.onBufferOverflow = r3
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L19
            r1 = -1
            if (r2 == r1) goto L13
            goto L19
        L13:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L19:
            return
    }

    static /* synthetic */ java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.internal.ChannelFlow r2, kotlinx.coroutines.flow.FlowCollector r3, kotlin.coroutines.Continuation r4) {
            kotlinx.coroutines.flow.internal.ChannelFlow$collect$2 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collect$2
            r1 = 0
            r0.<init>(r3, r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.lang.Object r2 = kotlinx.coroutines.CoroutineScopeKt.coroutineScope(r0, r4)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L13
            return r2
        L13:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            return r2
    }

    protected java.lang.String additionalToStringProps() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            java.lang.Object r1 = collect$suspendImpl(r0, r1, r2)
            return r1
    }

    protected abstract java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2);

    protected abstract kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext r1, int r2, kotlinx.coroutines.channels.BufferOverflow r3);

    public kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public kotlinx.coroutines.flow.Flow<T> fuse(kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.channels.BufferOverflow r4) {
            r1 = this;
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L10
            r0 = -1
            if (r3 == r0) goto La
            goto L10
        La:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L10:
            kotlin.coroutines.CoroutineContext r0 = r1.context
            kotlin.coroutines.CoroutineContext r2 = r2.plus(r0)
            kotlinx.coroutines.channels.BufferOverflow r0 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r4 == r0) goto L1b
            goto L57
        L1b:
            int r4 = r1.capacity
            r0 = -3
            if (r4 != r0) goto L21
            goto L55
        L21:
            if (r3 != r0) goto L25
        L23:
            r3 = r4
            goto L55
        L25:
            r0 = -2
            if (r4 != r0) goto L29
            goto L55
        L29:
            if (r3 != r0) goto L2c
            goto L23
        L2c:
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L3d
            int r4 = r1.capacity
            if (r4 < 0) goto L37
            goto L3d
        L37:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L3d:
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r4 == 0) goto L4c
            if (r3 < 0) goto L46
            goto L4c
        L46:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L4c:
            int r4 = r1.capacity
            int r4 = r4 + r3
            if (r4 < 0) goto L52
            goto L23
        L52:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L55:
            kotlinx.coroutines.channels.BufferOverflow r4 = r1.onBufferOverflow
        L57:
            kotlin.coroutines.CoroutineContext r0 = r1.context
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r0 == 0) goto L6b
            int r0 = r1.capacity
            if (r3 != r0) goto L6b
            kotlinx.coroutines.channels.BufferOverflow r0 = r1.onBufferOverflow
            if (r4 != r0) goto L6b
            r2 = r1
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            return r2
        L6b:
            kotlinx.coroutines.flow.internal.ChannelFlow r2 = r1.create(r2, r3, r4)
            kotlinx.coroutines.flow.Flow r2 = (kotlinx.coroutines.flow.Flow) r2
            return r2
    }

    public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getCollectToFun$kotlinx_coroutines_core() {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            return r0
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
            r2 = this;
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto L6
            r0 = -2
        L6:
            return r0
    }

    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope r10) {
            r9 = this;
            kotlin.coroutines.CoroutineContext r1 = r9.context
            int r2 = r9.getProduceCapacity$kotlinx_coroutines_core()
            kotlinx.coroutines.channels.BufferOverflow r3 = r9.onBufferOverflow
            kotlinx.coroutines.CoroutineStart r4 = kotlinx.coroutines.CoroutineStart.ATOMIC
            kotlin.jvm.functions.Function2 r6 = r9.getCollectToFun$kotlinx_coroutines_core()
            r7 = 16
            r8 = 0
            r5 = 0
            r0 = r10
            kotlinx.coroutines.channels.ReceiveChannel r10 = kotlinx.coroutines.channels.ProduceKt.produce$default(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
    }

    public java.lang.String toString() {
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 4
            r0.<init>(r1)
            java.lang.String r1 = r11.additionalToStringProps()
            if (r1 == 0) goto Lf
            r0.add(r1)
        Lf:
            kotlin.coroutines.CoroutineContext r1 = r11.context
            kotlin.coroutines.EmptyCoroutineContext r2 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r1 == r2) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "context="
            r1.<init>(r2)
            kotlin.coroutines.CoroutineContext r2 = r11.context
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L29:
            int r1 = r11.capacity
            r2 = -3
            if (r1 == r2) goto L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "capacity="
            r1.<init>(r2)
            int r2 = r11.capacity
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L42:
            kotlinx.coroutines.channels.BufferOverflow r1 = r11.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r1 == r2) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "onBufferOverflow="
            r1.<init>(r2)
            kotlinx.coroutines.channels.BufferOverflow r2 = r11.onBufferOverflow
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.add(r1)
        L5c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r11)
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = 91
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r0
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.String r0 = ", "
            r3 = r0
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            r9 = 62
            r10 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r0 = kotlin.collections.CollectionsKt.joinToString$default(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.StringBuilder r0 = r1.append(r0)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
