package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\b\u0007\u0018\u0000 B*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000G:\u0004CBDEB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0003\u0010\u0004B\u0007¢\u0006\u0004\b\u0003\u0010\u0005J?\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000f\u001a\u00020\u00132\u000e\u0010\r\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0016¢\u0006\u0004\b\u000f\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u001b\u001a\u00020\u00132\u0018\u0010\u001a\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00130\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#H\u0016¢\u0006\u0004\b$\u0010%JX\u0010.\u001a\u00020\u0013\"\u0004\b\u0001\u0010&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010'2\u0006\u0010\u001f\u001a\u00028\u00002(\u0010-\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010+\u0012\u0006\u0012\u0004\u0018\u00010,0)H\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J?\u00100\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0007\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0002¢\u0006\u0004\b0\u0010\u000bJ\u001b\u00101\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u00102J&\u00106\u001a\b\u0012\u0004\u0012\u00020\u0013032\u0006\u0010\u001f\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b4\u00105R\u0014\u00107\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R&\u0010<\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000*098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0017\u0010\u0002\u001a\u00028\u00008F¢\u0006\f\u0012\u0004\b?\u0010\u0005\u001a\u0004\b=\u0010>R\u0013\u0010A\u001a\u0004\u0018\u00018\u00008F¢\u0006\u0006\u001a\u0004\b@\u0010>\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006F"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "E", "value", "<init>", "(Ljava/lang/Object;)V", "()V", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "list", "subscriber", "addSubscriber", "([Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "close", "closeSubscriber", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "Lkotlin/Function1;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "element", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "offerInternal", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "R", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "removeSubscriber", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "trySend", "isClosedForSend", "()Z", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "getValue", "()Ljava/lang/Object;", "getValue$annotations", "getValueOrNull", "valueOrNull", "Companion", "Closed", "State", "Subscriber", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/BroadcastChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ConflatedBroadcastChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {

    @java.lang.Deprecated
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed CLOSED = null;
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Companion Companion = null;

    @java.lang.Deprecated
    private static final kotlinx.coroutines.channels.ConflatedBroadcastChannel.State<java.lang.Object> INITIAL_STATE = null;

    @java.lang.Deprecated
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _updating$FU = null;
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater onCloseHandler$FU = null;
    private volatile /* synthetic */ java.lang.Object _state;
    private volatile /* synthetic */ int _updating;
    private volatile /* synthetic */ java.lang.Object onCloseHandler;

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "", "closeCause", "", "(Ljava/lang/Throwable;)V", "sendException", "getSendException", "()Ljava/lang/Throwable;", "valueException", "getValueException", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Closed {
        public final java.lang.Throwable closeCause;

        public Closed(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.closeCause = r1
                return
        }

        public final java.lang.Throwable getSendException() {
                r2 = this;
                java.lang.Throwable r0 = r2.closeCause
                if (r0 != 0) goto Ld
                kotlinx.coroutines.channels.ClosedSendChannelException r0 = new kotlinx.coroutines.channels.ClosedSendChannelException
                java.lang.String r1 = "Channel was closed"
                r0.<init>(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
            Ld:
                return r0
        }

        public final java.lang.Throwable getValueException() {
                r2 = this;
                java.lang.Throwable r0 = r2.closeCause
                if (r0 != 0) goto Ld
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Channel was closed"
                r0.<init>(r1)
                java.lang.Throwable r0 = (java.lang.Throwable) r0
            Ld:
                return r0
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Companion;", "", "()V", "CLOSED", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Closed;", "INITIAL_STATE", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u0005¢\u0006\u0002\u0010\u0007R \u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\bR\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$State;", "E", "", "value", "subscribers", "", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "(Ljava/lang/Object;[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;)V", "[Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class State<E> {
        public final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] subscribers;
        public final java.lang.Object value;

        public State(java.lang.Object r1, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.subscribers = r2
                return
        }
    }

    /* JADX INFO: compiled from: ConflatedBroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0014R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlinx/coroutines/channels/ConflatedBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ConflatedChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "broadcastChannel", "Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;", "(Lkotlinx/coroutines/channels/ConflatedBroadcastChannel;)V", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "onCancelIdempotent", "", "wasClosed", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Subscriber<E> extends kotlinx.coroutines.channels.ConflatedChannel<E> implements kotlinx.coroutines.channels.ReceiveChannel<E> {
        private final kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> broadcastChannel;

        public Subscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.broadcastChannel = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractSendChannel
        public java.lang.Object offerInternal(E r1) {
                r0 = this;
                java.lang.Object r1 = super.offerInternal(r1)
                return r1
        }

        @Override // kotlinx.coroutines.channels.ConflatedChannel, kotlinx.coroutines.channels.AbstractChannel
        protected void onCancelIdempotent(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L7
                kotlinx.coroutines.channels.ConflatedBroadcastChannel<E> r1 = r0.broadcastChannel
                kotlinx.coroutines.channels.ConflatedBroadcastChannel.access$closeSubscriber(r1, r0)
            L7:
                return
        }
    }

    static {
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Companion r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Companion
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.Companion = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed
            r0.<init>(r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.CLOSED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r2 = "UNDEFINED"
            r0.<init>(r2)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r2 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            r2.<init>(r0, r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.INITIAL_STATE = r2
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.channels.ConflatedBroadcastChannel> r2 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU = r0
            java.lang.String r0 = "_updating"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r2, r0)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel._updating$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "onCloseHandler"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel.onCloseHandler$FU = r0
            return
    }

    public ConflatedBroadcastChannel() {
            r1 = this;
            r1.<init>()
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State<java.lang.Object> r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.INITIAL_STATE
            r1._state = r0
            r0 = 0
            r1._updating = r0
            r0 = 0
            r1.onCloseHandler = r0
            return
    }

    public ConflatedBroadcastChannel(E r4) {
            r3 = this;
            r3.<init>()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r1 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            r2 = 0
            r1.<init>(r4, r2)
            r0.lazySet(r3, r1)
            return
    }

    public static final /* synthetic */ void access$closeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel r0, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber r1) {
            r0.closeSubscriber(r1)
            return
    }

    public static final /* synthetic */ void access$registerSelectSend(kotlinx.coroutines.channels.ConflatedBroadcastChannel r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectSend(r1, r2, r3)
            return
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] addSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] r2, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> r3) {
            r1 = this;
            if (r2 != 0) goto L9
            r2 = 1
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r2 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[r2]
            r0 = 0
            r2[r0] = r3
            return r2
        L9:
            java.lang.Object[] r2 = kotlin.collections.ArraysKt.plus(r2, r3)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r2 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[]) r2
            return r2
    }

    private final void closeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r1 == 0) goto L7
            return
        L7:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r1 == 0) goto L27
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r1 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            r2 = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r2 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r2
            java.lang.Object r3 = r2.value
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r2 = r2.subscribers
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r2 = r4.removeSubscriber(r2, r5)
            r1.<init>(r3, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r4, r0, r1)
            if (r0 == 0) goto L0
            return
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid state "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    public static /* synthetic */ void getValue$annotations() {
            return
    }

    private final void invokeOnCloseHandler(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.onCloseHandler
            if (r0 == 0) goto L1c
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r0 == r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.onCloseHandler$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r0, r2)
            if (r1 == 0) goto L1c
            r1 = 1
            java.lang.Object r0 = kotlin.jvm.internal.TypeIntrinsics.beforeCheckcastToFunctionOfArity(r0, r1)
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r0.invoke(r4)
        L1c:
            return
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed offerInternal(E r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._updating$FU
            r1 = 1
            r2 = 0
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Object r0 = r6._state     // Catch: java.lang.Throwable -> L5f
            boolean r3 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L17
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r0     // Catch: java.lang.Throwable -> L5f
            r6._updating = r2
            return r0
        L17:
            boolean r3 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto L42
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r3 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State     // Catch: java.lang.Throwable -> L5f
            r4 = r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r4 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r4     // Catch: java.lang.Throwable -> L5f
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r4 = r4.subscribers     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r7, r4)     // Catch: java.lang.Throwable -> L5f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU     // Catch: java.lang.Throwable -> L5f
            boolean r3 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r6, r0, r3)     // Catch: java.lang.Throwable -> L5f
            if (r3 == 0) goto Lc
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r0     // Catch: java.lang.Throwable -> L5f
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r0 = r0.subscribers     // Catch: java.lang.Throwable -> L5f
            if (r0 == 0) goto L3f
            int r3 = r0.length     // Catch: java.lang.Throwable -> L5f
            r4 = r2
        L35:
            if (r4 >= r3) goto L3f
            r5 = r0[r4]     // Catch: java.lang.Throwable -> L5f
            r5.offerInternal(r7)     // Catch: java.lang.Throwable -> L5f
            int r4 = r4 + 1
            goto L35
        L3f:
            r6._updating = r2
            return r1
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r1.<init>()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "Invalid state "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            throw r7     // Catch: java.lang.Throwable -> L5f
        L5f:
            r7 = move-exception
            r6._updating = r2
            throw r7
    }

    private final <R> void registerSelectSend(kotlinx.coroutines.selects.SelectInstance<? super R> r2, E r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r1 = this;
            boolean r0 = r2.trySelect()
            if (r0 != 0) goto L7
            return
        L7:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r3 = r1.offerInternal(r3)
            if (r3 == 0) goto L15
            java.lang.Throwable r3 = r3.getSendException()
            r2.resumeSelectWithException(r3)
            return
        L15:
            kotlin.coroutines.Continuation r2 = r2.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r4, r1, r2)
            return
    }

    private final kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] removeSubscriber(kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E>[] r9, kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber<E> r10) {
            r8 = this;
            int r0 = r9.length
            int r10 = kotlin.collections.ArraysKt.indexOf(r9, r10)
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L14
            if (r10 < 0) goto Le
            goto L14
        Le:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L14:
            r1 = 1
            if (r0 != r1) goto L19
            r9 = 0
            return r9
        L19:
            int r0 = r0 - r1
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel.Subscriber[r0]
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            r1 = r9
            r2 = r0
            r5 = r10
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            int r4 = r10 + 1
            r6 = 8
            r5 = 0
            r3 = r10
            kotlin.collections.ArraysKt.copyInto$default(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(java.util.concurrent.CancellationException r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.close(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.close(r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r5) {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            r2 = 0
            if (r1 == 0) goto L8
            return r2
        L8:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r1 == 0) goto L34
            if (r5 != 0) goto L11
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r1 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.CLOSED
            goto L16
        L11:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r1 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed
            r1.<init>(r5)
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r3, r4, r0, r1)
            if (r1 == 0) goto L0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r0
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r0 = r0.subscribers
            if (r0 == 0) goto L2f
            int r1 = r0.length
        L25:
            if (r2 >= r1) goto L2f
            r3 = r0[r2]
            r3.close(r5)
            int r2 = r2 + 1
            goto L25
        L2f:
            r4.invokeOnCloseHandler(r5)
            r5 = 1
            return r5
        L34:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid state "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$onSend$1 r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$onSend$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    public final E getValue() {
            r4 = this;
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r1 != 0) goto L36
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r1 == 0) goto L1d
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r0
            java.lang.Object r1 = r0.value
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED
            if (r1 == r2) goto L15
            java.lang.Object r0 = r0.value
            return r0
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No value"
            r0.<init>(r1)
            throw r0
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid state "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L36:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r0
            java.lang.Throwable r0 = r0.getValueException()
            throw r0
    }

    public final E getValueOrNull() {
            r4 = this;
            java.lang.Object r0 = r4._state
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            r2 = 0
            if (r1 == 0) goto L8
            goto L16
        L8:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r1 == 0) goto L17
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r0 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r0
            java.lang.Object r0 = r0.value
            if (r0 != r1) goto L15
            goto L16
        L15:
            r2 = r0
        L16:
            return r2
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid state "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.onCloseHandler$FU
            r1 = 0
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r4)
            if (r1 != 0) goto L2c
            java.lang.Object r4 = r3.onCloseHandler
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r4 != r0) goto L17
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Another handler was already registered and successfully invoked"
            r4.<init>(r0)
            throw r4
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Another handler was already registered: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2c:
            java.lang.Object r1 = r3._state
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r2 == 0) goto L41
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r4, r2)
            if (r0 == 0) goto L41
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r1 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r1
            java.lang.Throwable r0 = r1.closeCause
            r4.invoke(r0)
        L41:
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
            r1 = this;
            java.lang.Object r0 = r1._state
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r1) {
            r0 = this;
            boolean r1 = kotlinx.coroutines.channels.BroadcastChannel.DefaultImpls.offer(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r5 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber r0 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber
            r0.<init>(r5)
        L5:
            java.lang.Object r1 = r5._state
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed
            if (r2 == 0) goto L15
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r1 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.Closed) r1
            java.lang.Throwable r1 = r1.closeCause
            r0.close(r1)
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            return r0
        L15:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ConflatedBroadcastChannel.State
            if (r2 == 0) goto L3f
            r2 = r1
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r2 = (kotlinx.coroutines.channels.ConflatedBroadcastChannel.State) r2
            java.lang.Object r3 = r2.value
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.ConflatedBroadcastChannel.UNDEFINED
            if (r3 == r4) goto L27
            java.lang.Object r3 = r2.value
            r0.offerInternal(r3)
        L27:
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$State r3 = new kotlinx.coroutines.channels.ConflatedBroadcastChannel$State
            java.lang.Object r4 = r2.value
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber<E>[] r2 = r2.subscribers
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Subscriber[] r2 = r5.addSubscriber(r2, r0)
            r3.<init>(r4, r2)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.channels.ConflatedBroadcastChannel._state$FU
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r2, r5, r1, r3)
            if (r1 == 0) goto L5
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            return r0
        L3f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid state "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r1 = r0.offerInternal(r1)
            if (r1 != 0) goto L11
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != 0) goto Le
            r1 = 0
            return r1
        Le:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        L11:
            java.lang.Throwable r1 = r1.getSendException()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo2272trySendJP2dKIU(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.ConflatedBroadcastChannel$Closed r2 = r1.offerInternal(r2)
            if (r2 == 0) goto L11
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r2 = r2.getSendException()
            java.lang.Object r2 = r0.m2290closedJP2dKIU(r2)
            return r2
        L11:
            kotlinx.coroutines.channels.ChannelResult$Companion r2 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r2 = r2.m2292successJP2dKIU(r0)
            return r2
    }
}
