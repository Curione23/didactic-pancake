package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u001aB;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u00020\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0094@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0017\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlinx/coroutines/flow/ChannelAsFlow;", "T", "Lkotlinx/coroutines/channels/ReceiveChannel;", "channel", "", "consume", "Lkotlin/coroutines/CoroutineContext;", "context", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "<init>", "(Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)V", "", "additionalToStringProps", "()Ljava/lang/String;", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ProducerScope;", "scope", "collectTo", "(Lkotlinx/coroutines/channels/ProducerScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/internal/ChannelFlow;", "create", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/internal/ChannelFlow;", "Lkotlinx/coroutines/flow/Flow;", "dropChannelOperators", "()Lkotlinx/coroutines/flow/Flow;", "markConsumed", "()V", "Lkotlinx/coroutines/CoroutineScope;", "produceImpl", "(Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "Z", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class ChannelAsFlow<T> extends kotlinx.coroutines.flow.internal.ChannelFlow<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater consumed$FU = null;
    private final kotlinx.coroutines.channels.ReceiveChannel<T> channel;
    private final boolean consume;
    private volatile /* synthetic */ int consumed;

    static {
            java.lang.Class<kotlinx.coroutines.flow.ChannelAsFlow> r0 = kotlinx.coroutines.flow.ChannelAsFlow.class
            java.lang.String r1 = "consumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.flow.ChannelAsFlow.consumed$FU = r0
            return
    }

    public ChannelAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r1, boolean r2, kotlin.coroutines.CoroutineContext r3, int r4, kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.channel = r1
            r0.consume = r2
            r1 = 0
            r0.consumed = r1
            return
    }

    public /* synthetic */ ChannelAsFlow(kotlinx.coroutines.channels.ReceiveChannel r7, boolean r8, kotlin.coroutines.CoroutineContext r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r9 = (kotlin.coroutines.CoroutineContext) r9
        L8:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = -3
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

    private final void markConsumed() {
            r2 = this;
            boolean r0 = r2.consume
            if (r0 == 0) goto L1a
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.flow.ChannelAsFlow.consumed$FU
            r1 = 1
            int r0 = r0.getAndSet(r2, r1)
            if (r0 != 0) goto Le
            goto L1a
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ReceiveChannel.consumeAsFlow can be collected just once"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L1a:
            return
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.String additionalToStringProps() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "channel="
            r0.<init>(r1)
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r2.channel
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto L1a
            r2.markConsumed()
            kotlinx.coroutines.channels.ReceiveChannel<T> r0 = r2.channel
            boolean r1 = r2.consume
            java.lang.Object r3 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r3, r0, r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L17
            return r3
        L17:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        L1a:
            java.lang.Object r3 = super.collect(r3, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L25
            return r3
        L25:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected java.lang.Object collectTo(kotlinx.coroutines.channels.ProducerScope<? super T> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.SendingCollector r0 = new kotlinx.coroutines.flow.internal.SendingCollector
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            r0.<init>(r3)
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlinx.coroutines.channels.ReceiveChannel<T> r3 = r2.channel
            boolean r1 = r2.consume
            java.lang.Object r3 = kotlinx.coroutines.flow.FlowKt__ChannelsKt.access$emitAllImpl$FlowKt__ChannelsKt(r0, r3, r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L18
            return r3
        L18:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    protected kotlinx.coroutines.flow.internal.ChannelFlow<T> create(kotlin.coroutines.CoroutineContext r8, int r9, kotlinx.coroutines.channels.BufferOverflow r10) {
            r7 = this;
            kotlinx.coroutines.flow.ChannelAsFlow r6 = new kotlinx.coroutines.flow.ChannelAsFlow
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r7.channel
            boolean r2 = r7.consume
            r0 = r6
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            kotlinx.coroutines.flow.internal.ChannelFlow r6 = (kotlinx.coroutines.flow.internal.ChannelFlow) r6
            return r6
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.flow.Flow<T> dropChannelOperators() {
            r9 = this;
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            kotlinx.coroutines.channels.ReceiveChannel<T> r1 = r9.channel
            boolean r2 = r9.consume
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            return r8
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public kotlinx.coroutines.channels.ReceiveChannel<T> produceImpl(kotlinx.coroutines.CoroutineScope r3) {
            r2 = this;
            r2.markConsumed()
            int r0 = r2.capacity
            r1 = -3
            if (r0 != r1) goto Lb
            kotlinx.coroutines.channels.ReceiveChannel<T> r3 = r2.channel
            goto Lf
        Lb:
            kotlinx.coroutines.channels.ReceiveChannel r3 = super.produceImpl(r3)
        Lf:
            return r3
    }
}
