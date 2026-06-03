package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000L2\b\u0012\u0004\u0012\u00028\u00000M:\u0001JB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\r2\u000e\u0010\u0007\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\t\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0016¢\u0006\u0004\b\"\u0010#J4\u0010'\u001a\u00020\r2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010$H\u0082\u0010¢\u0006\u0004\b'\u0010(R\u001c\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010/\u001a\u00020,8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0018\u00102\u001a\u000600j\u0002`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R$\u0010;\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b8\u0010\u0015\"\u0004\b9\u0010:R\u0014\u0010<\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b>\u0010=R$\u0010A\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b?\u00106\"\u0004\b@\u0010\u0005R6\u0010D\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$0Bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000$`C8\u0002X\u0082\u0004¢\u0006\f\n\u0004\bD\u0010E\u0012\u0004\bF\u0010\u0011R$\u0010I\u001a\u00020\u00132\u0006\u00107\u001a\u00020\u00138B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bG\u0010\u0015\"\u0004\bH\u0010:¨\u0006K"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "E", "", "capacity", "<init>", "(I)V", "", "cause", "", "cancel", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "", "(Ljava/util/concurrent/CancellationException;)V", "cancelInternal", "checkSubOffers", "()V", "close", "", "computeMinHead", "()J", "index", "elementAt", "(J)Ljava/lang/Object;", "element", "", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "openSubscription", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "addSub", "removeSub", "updateHead", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;)V", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "bufferLock", "Ljava/util/concurrent/locks/ReentrantLock;", "I", "getCapacity", "()I", "value", "getHead", "setHead", "(J)V", "head", "isBufferAlwaysFull", "()Z", "isBufferFull", "getSize", "setSize", "size", "", "Lkotlinx/coroutines/internal/SubscribersList;", "subscribers", "Ljava/util/List;", "getSubscribers$annotations", "getTail", "setTail", "tail", "Subscriber", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/BroadcastChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class ArrayBroadcastChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.BroadcastChannel<E> {
    private volatile /* synthetic */ long _head;
    private volatile /* synthetic */ int _size;
    private volatile /* synthetic */ long _tail;
    private final java.lang.Object[] buffer;
    private final java.util.concurrent.locks.ReentrantLock bufferLock;
    private final int capacity;
    private final java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E>> subscribers;

    /* JADX INFO: compiled from: ArrayBroadcastChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u00028\u00010'2\b\u0012\u0004\u0012\u00028\u00010(B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\bR\u0014\u0010\u0018\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\bR\u0014\u0010\u0019\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\bR\u0014\u0010\u001a\u001a\u00020\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\bR$\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0018\u0010$\u001a\u00060\"j\u0002`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lkotlinx/coroutines/channels/ArrayBroadcastChannel$Subscriber;", "E", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "broadcastChannel", "<init>", "(Lkotlinx/coroutines/channels/ArrayBroadcastChannel;)V", "", "checkOffer", "()Z", "", "cause", "close", "(Ljava/lang/Throwable;)Z", "needsToCheckOfferWithoutLock", "", "peekUnderLock", "()Ljava/lang/Object;", "pollInternal", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ArrayBroadcastChannel;", "isBufferAlwaysEmpty", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "", "value", "getSubHead", "()J", "setSubHead", "(J)V", "subHead", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "subLock", "Ljava/util/concurrent/locks/ReentrantLock;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Subscriber<E> extends kotlinx.coroutines.channels.AbstractChannel<E> implements kotlinx.coroutines.channels.ReceiveChannel<E> {
        private volatile /* synthetic */ long _subHead;
        private final kotlinx.coroutines.channels.ArrayBroadcastChannel<E> broadcastChannel;
        private final java.util.concurrent.locks.ReentrantLock subLock;

        public Subscriber(kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r3) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.broadcastChannel = r3
                java.util.concurrent.locks.ReentrantLock r3 = new java.util.concurrent.locks.ReentrantLock
                r3.<init>()
                r2.subLock = r3
                r0 = 0
                r2._subHead = r0
                return
        }

        private final boolean needsToCheckOfferWithoutLock() {
                r2 = this;
                kotlinx.coroutines.channels.Closed r0 = r2.getClosedForReceive()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r2.isBufferEmpty()
                if (r0 == 0) goto L17
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r2.broadcastChannel
                kotlinx.coroutines.channels.Closed r0 = r0.getClosedForReceive()
                if (r0 != 0) goto L17
                return r1
            L17:
                r0 = 1
                return r0
        }

        private final java.lang.Object peekUnderLock() {
                r5 = this;
                long r0 = r5.getSubHead()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r5.broadcastChannel
                kotlinx.coroutines.channels.Closed r2 = r2.getClosedForReceive()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r3 = r5.broadcastChannel
                long r3 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r3)
                int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r3 < 0) goto L1f
                if (r2 != 0) goto L1e
                kotlinx.coroutines.channels.Closed r2 = r5.getClosedForReceive()
                if (r2 != 0) goto L1e
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            L1e:
                return r2
            L1f:
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r5.broadcastChannel
                java.lang.Object r0 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$elementAt(r2, r0)
                kotlinx.coroutines.channels.Closed r1 = r5.getClosedForReceive()
                if (r1 == 0) goto L2c
                return r1
            L2c:
                return r0
        }

        public final boolean checkOffer() {
                r8 = this;
                r0 = 0
            L1:
                boolean r1 = r8.needsToCheckOfferWithoutLock()
                r2 = 0
                if (r1 == 0) goto L6a
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                boolean r1 = r1.tryLock()
                if (r1 == 0) goto L6a
                java.lang.Object r1 = r8.peekUnderLock()     // Catch: java.lang.Throwable -> L63
                kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L63
                if (r1 != r3) goto L1e
            L18:
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                goto L1
            L1e:
                boolean r3 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L63
                if (r3 == 0) goto L2b
                r2 = r1
                kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2     // Catch: java.lang.Throwable -> L63
            L25:
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                goto L6a
            L2b:
                kotlinx.coroutines.channels.ReceiveOrClosed r3 = r8.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L63
                if (r3 != 0) goto L32
                goto L25
            L32:
                boolean r4 = r3 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L63
                if (r4 == 0) goto L37
                goto L25
            L37:
                kotlinx.coroutines.internal.Symbol r2 = r3.tryResumeReceive(r1, r2)     // Catch: java.lang.Throwable -> L63
                if (r2 != 0) goto L3e
                goto L18
            L3e:
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L63
                if (r0 == 0) goto L4f
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L63
                if (r2 != r0) goto L49
                goto L4f
            L49:
                java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L63
                r0.<init>()     // Catch: java.lang.Throwable -> L63
                throw r0     // Catch: java.lang.Throwable -> L63
            L4f:
                long r4 = r8.getSubHead()     // Catch: java.lang.Throwable -> L63
                r6 = 1
                long r4 = r4 + r6
                r8.setSubHead(r4)     // Catch: java.lang.Throwable -> L63
                java.util.concurrent.locks.ReentrantLock r0 = r8.subLock
                r0.unlock()
                r3.completeResumeReceive(r1)
                r0 = 1
                goto L1
            L63:
                r0 = move-exception
                java.util.concurrent.locks.ReentrantLock r1 = r8.subLock
                r1.unlock()
                throw r0
            L6a:
                if (r2 == 0) goto L71
                java.lang.Throwable r1 = r2.closeCause
                r8.close(r1)
            L71:
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
        public boolean close(java.lang.Throwable r4) {
                r3 = this;
                boolean r4 = super.close(r4)
                if (r4 == 0) goto L28
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r3.broadcastChannel
                r1 = 1
                r2 = 0
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r0, r2, r3, r1, r2)
                java.util.concurrent.locks.ReentrantLock r0 = r3.subLock
                java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
                r0.lock()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r1 = r3.broadcastChannel     // Catch: java.lang.Throwable -> L23
                long r1 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r1)     // Catch: java.lang.Throwable -> L23
                r3.setSubHead(r1)     // Catch: java.lang.Throwable -> L23
                kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L23
                r0.unlock()
                goto L28
            L23:
                r4 = move-exception
                r0.unlock()
                throw r4
            L28:
                return r4
        }

        public final long getSubHead() {
                r2 = this;
                long r0 = r2._subHead
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferAlwaysEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferAlwaysFull() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected boolean isBufferEmpty() {
                r4 = this;
                long r0 = r4.getSubHead()
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r2 = r4.broadcastChannel
                long r2 = kotlinx.coroutines.channels.ArrayBroadcastChannel.access$getTail(r2)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 < 0) goto L10
                r0 = 1
                goto L11
            L10:
                r0 = 0
            L11:
                return r0
        }

        @Override // kotlinx.coroutines.channels.AbstractSendChannel
        protected boolean isBufferFull() {
                r2 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Should not be used"
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected java.lang.Object pollInternal() {
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.subLock
                java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
                r0.lock()
                java.lang.Object r1 = r8.peekUnderLock()     // Catch: java.lang.Throwable -> L46
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L46
                r3 = 1
                if (r2 != 0) goto L20
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L46
                if (r1 == r2) goto L20
                long r4 = r8.getSubHead()     // Catch: java.lang.Throwable -> L46
                r6 = 1
                long r4 = r4 + r6
                r8.setSubHead(r4)     // Catch: java.lang.Throwable -> L46
                r2 = r3
                goto L21
            L20:
                r2 = 0
            L21:
                r0.unlock()
                boolean r0 = r1 instanceof kotlinx.coroutines.channels.Closed
                r4 = 0
                if (r0 == 0) goto L2d
                r0 = r1
                kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
                goto L2e
            L2d:
                r0 = r4
            L2e:
                if (r0 == 0) goto L35
                java.lang.Throwable r0 = r0.closeCause
                r8.close(r0)
            L35:
                boolean r0 = r8.checkOffer()
                if (r0 == 0) goto L3c
                goto L3d
            L3c:
                r3 = r2
            L3d:
                if (r3 == 0) goto L45
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r0 = r8.broadcastChannel
                r2 = 3
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r0, r4, r4, r2, r4)
            L45:
                return r1
            L46:
                r1 = move-exception
                r0.unlock()
                throw r1
        }

        @Override // kotlinx.coroutines.channels.AbstractChannel
        protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r9) {
                r8 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r8.subLock
                java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
                r0.lock()
                java.lang.Object r1 = r8.peekUnderLock()     // Catch: java.lang.Throwable -> L50
                boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L50
                r3 = 1
                r4 = 0
                if (r2 != 0) goto L2b
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L50
                if (r1 == r2) goto L2b
                boolean r9 = r9.trySelect()     // Catch: java.lang.Throwable -> L50
                if (r9 != 0) goto L20
                java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L50
                goto L2b
            L20:
                long r4 = r8.getSubHead()     // Catch: java.lang.Throwable -> L50
                r6 = 1
                long r4 = r4 + r6
                r8.setSubHead(r4)     // Catch: java.lang.Throwable -> L50
                r4 = r3
            L2b:
                r0.unlock()
                boolean r9 = r1 instanceof kotlinx.coroutines.channels.Closed
                r0 = 0
                if (r9 == 0) goto L37
                r9 = r1
                kotlinx.coroutines.channels.Closed r9 = (kotlinx.coroutines.channels.Closed) r9
                goto L38
            L37:
                r9 = r0
            L38:
                if (r9 == 0) goto L3f
                java.lang.Throwable r9 = r9.closeCause
                r8.close(r9)
            L3f:
                boolean r9 = r8.checkOffer()
                if (r9 == 0) goto L46
                goto L47
            L46:
                r3 = r4
            L47:
                if (r3 == 0) goto L4f
                kotlinx.coroutines.channels.ArrayBroadcastChannel<E> r9 = r8.broadcastChannel
                r2 = 3
                kotlinx.coroutines.channels.ArrayBroadcastChannel.updateHead$default(r9, r0, r0, r2, r0)
            L4f:
                return r1
            L50:
                r9 = move-exception
                r0.unlock()
                throw r9
        }

        public final void setSubHead(long r1) {
                r0 = this;
                r0._subHead = r1
                return
        }
    }

    public ArrayBroadcastChannel(int r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r0)
            r2.capacity = r3
            r0 = 1
            if (r3 < r0) goto L24
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r0.<init>()
            r2.bufferLock = r0
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.buffer = r3
            r0 = 0
            r2._head = r0
            r2._tail = r0
            r3 = 0
            r2._size = r3
            java.util.List r3 = kotlinx.coroutines.internal.ConcurrentKt.subscriberList()
            r2.subscribers = r3
            return
        L24:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ArrayBroadcastChannel capacity must be at least 1, but "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " was specified"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final /* synthetic */ java.lang.Object access$elementAt(kotlinx.coroutines.channels.ArrayBroadcastChannel r0, long r1) {
            java.lang.Object r0 = r0.elementAt(r1)
            return r0
    }

    public static final /* synthetic */ long access$getTail(kotlinx.coroutines.channels.ArrayBroadcastChannel r2) {
            long r0 = r2.getTail()
            return r0
    }

    private final boolean cancelInternal(java.lang.Throwable r4) {
            r3 = this;
            boolean r0 = r3.close(r4)
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r1 = r3.subscribers
            java.util.Iterator r1 = r1.iterator()
        La:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1a
            java.lang.Object r2 = r1.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r2 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r2
            r2.cancelInternal$kotlinx_coroutines_core(r4)
            goto La
        L1a:
            return r0
    }

    private final void checkSubOffers() {
            r4 = this;
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r0 = r4.subscribers
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1f
            java.lang.Object r2 = r0.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r2 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r2
            boolean r2 = r2.checkOffer()
            r3 = 1
            if (r2 == 0) goto L1d
            r1 = r3
            goto L7
        L1d:
            r2 = r3
            goto L8
        L1f:
            if (r1 != 0) goto L23
            if (r2 != 0) goto L28
        L23:
            r0 = 3
            r1 = 0
            updateHead$default(r4, r1, r1, r0, r1)
        L28:
            return
    }

    private final long computeMinHead() {
            r5 = this;
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r0 = r5.subscribers
            java.util.Iterator r0 = r0.iterator()
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        Lb:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L20
            java.lang.Object r3 = r0.next()
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r3 = (kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber) r3
            long r3 = r3.getSubHead()
            long r1 = kotlin.ranges.RangesKt.coerceAtMost(r1, r3)
            goto Lb
        L20:
            return r1
    }

    private final E elementAt(long r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.buffer
            int r1 = r3.capacity
            long r1 = (long) r1
            long r4 = r4 % r1
            int r4 = (int) r4
            r4 = r0[r4]
            return r4
    }

    private final long getHead() {
            r2 = this;
            long r0 = r2._head
            return r0
    }

    private final int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    private static /* synthetic */ void getSubscribers$annotations() {
            return
    }

    private final long getTail() {
            r2 = this;
            long r0 = r2._tail
            return r0
    }

    private final void setHead(long r1) {
            r0 = this;
            r0._head = r1
            return
    }

    private final void setSize(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    private final void setTail(long r1) {
            r0 = this;
            r0._tail = r1
            return
    }

    private final void updateHead(kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> r13, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber<E> r14) {
            r12 = this;
        L0:
            java.util.concurrent.locks.ReentrantLock r0 = r12.bufferLock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            if (r13 == 0) goto L24
            long r1 = r12.getTail()     // Catch: java.lang.Throwable -> L21
            r13.setSubHead(r1)     // Catch: java.lang.Throwable -> L21
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r1 = r12.subscribers     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L21
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r2 = r12.subscribers     // Catch: java.lang.Throwable -> L21
            r2.add(r13)     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L24
            r0.unlock()
            return
        L21:
            r13 = move-exception
            goto Lc7
        L24:
            if (r14 == 0) goto L3b
            java.util.List<kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber<E>> r13 = r12.subscribers     // Catch: java.lang.Throwable -> L21
            r13.remove(r14)     // Catch: java.lang.Throwable -> L21
            long r1 = r12.getHead()     // Catch: java.lang.Throwable -> L21
            long r13 = r14.getSubHead()     // Catch: java.lang.Throwable -> L21
            int r13 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r13 == 0) goto L3b
            r0.unlock()
            return
        L3b:
            long r13 = r12.computeMinHead()     // Catch: java.lang.Throwable -> L21
            long r1 = r12.getTail()     // Catch: java.lang.Throwable -> L21
            long r3 = r12.getHead()     // Catch: java.lang.Throwable -> L21
            long r13 = kotlin.ranges.RangesKt.coerceAtMost(r13, r1)     // Catch: java.lang.Throwable -> L21
            int r5 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r5 > 0) goto L53
            r0.unlock()
            return
        L53:
            int r5 = r12.getSize()     // Catch: java.lang.Throwable -> L21
        L57:
            int r6 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r6 >= 0) goto Lc3
            java.lang.Object[] r6 = r12.buffer     // Catch: java.lang.Throwable -> L21
            int r7 = r12.capacity     // Catch: java.lang.Throwable -> L21
            long r8 = (long) r7     // Catch: java.lang.Throwable -> L21
            long r8 = r3 % r8
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L21
            r9 = 0
            r6[r8] = r9     // Catch: java.lang.Throwable -> L21
            if (r5 < r7) goto L6a
            r6 = 1
            goto L6b
        L6a:
            r6 = 0
        L6b:
            r7 = 1
            long r3 = r3 + r7
            r12.setHead(r3)     // Catch: java.lang.Throwable -> L21
            int r10 = r5 + (-1)
            r12.setSize(r10)     // Catch: java.lang.Throwable -> L21
            if (r6 == 0) goto Lc1
        L78:
            kotlinx.coroutines.channels.Send r6 = r12.takeFirstSendOrPeekClosed()     // Catch: java.lang.Throwable -> L21
            if (r6 != 0) goto L7f
            goto Lc1
        L7f:
            boolean r11 = r6 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L21
            if (r11 != 0) goto Lc1
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)     // Catch: java.lang.Throwable -> L21
            kotlinx.coroutines.internal.Symbol r11 = r6.tryResumeSend(r9)     // Catch: java.lang.Throwable -> L21
            if (r11 == 0) goto L78
            boolean r13 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L21
            if (r13 == 0) goto L9d
            kotlinx.coroutines.internal.Symbol r13 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L21
            if (r11 != r13) goto L97
            goto L9d
        L97:
            java.lang.AssertionError r13 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L21
            r13.<init>()     // Catch: java.lang.Throwable -> L21
            throw r13     // Catch: java.lang.Throwable -> L21
        L9d:
            java.lang.Object[] r13 = r12.buffer     // Catch: java.lang.Throwable -> L21
            int r14 = r12.capacity     // Catch: java.lang.Throwable -> L21
            long r3 = (long) r14     // Catch: java.lang.Throwable -> L21
            long r3 = r1 % r3
            int r14 = (int) r3     // Catch: java.lang.Throwable -> L21
            java.lang.Object r3 = r6.getPollResult()     // Catch: java.lang.Throwable -> L21
            r13[r14] = r3     // Catch: java.lang.Throwable -> L21
            r12.setSize(r5)     // Catch: java.lang.Throwable -> L21
            long r1 = r1 + r7
            r12.setTail(r1)     // Catch: java.lang.Throwable -> L21
            kotlin.Unit r13 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L21
            r0.unlock()
            r6.completeResumeSend()
            r12.checkSubOffers()
            r13 = r9
            r14 = r13
            goto L0
        Lc1:
            r5 = r10
            goto L57
        Lc3:
            r0.unlock()
            return
        Lc7:
            r0.unlock()
            throw r13
    }

    static /* synthetic */ void updateHead$default(kotlinx.coroutines.channels.ArrayBroadcastChannel r1, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber r2, kotlinx.coroutines.channels.ArrayBroadcastChannel.Subscriber r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            r0 = 0
            if (r5 == 0) goto L6
            r2 = r0
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lb
            r3 = r0
        Lb:
            r1.updateHead(r2, r3)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public void cancel(java.util.concurrent.CancellationException r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.cancelInternal(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ boolean cancel(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.cancelInternal(r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.close(r1)
            if (r1 != 0) goto L8
            r1 = 0
            return r1
        L8:
            r0.checkSubOffers()
            r1 = 1
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.String getBufferDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "(buffer:capacity="
            r0.<init>(r1)
            java.lang.Object[] r1 = r2.buffer
            int r1 = r1.length
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",size="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.getSize()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final int getCapacity() {
            r1 = this;
            int r0 = r1.capacity
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferAlwaysFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected boolean isBufferFull() {
            r2 = this;
            int r0 = r2.getSize()
            int r1 = r2.capacity
            if (r0 < r1) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E r8) {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.bufferLock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r7.getClosedForSend()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L11
            r0.unlock()
            return r1
        L11:
            int r1 = r7.getSize()     // Catch: java.lang.Throwable -> L43
            int r2 = r7.capacity     // Catch: java.lang.Throwable -> L43
            if (r1 < r2) goto L1f
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L43
            r0.unlock()
            return r8
        L1f:
            long r2 = r7.getTail()     // Catch: java.lang.Throwable -> L43
            java.lang.Object[] r4 = r7.buffer     // Catch: java.lang.Throwable -> L43
            int r5 = r7.capacity     // Catch: java.lang.Throwable -> L43
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L43
            long r5 = r2 % r5
            int r5 = (int) r5     // Catch: java.lang.Throwable -> L43
            r4[r5] = r8     // Catch: java.lang.Throwable -> L43
            int r1 = r1 + 1
            r7.setSize(r1)     // Catch: java.lang.Throwable -> L43
            r4 = 1
            long r2 = r2 + r4
            r7.setTail(r2)     // Catch: java.lang.Throwable -> L43
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L43
            r0.unlock()
            r7.checkSubOffers()
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r8
        L43:
            r8 = move-exception
            r0.unlock()
            throw r8
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r7, kotlinx.coroutines.selects.SelectInstance<?> r8) {
            r6 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r6.bufferLock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r6.getClosedForSend()     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L11
            r0.unlock()
            return r1
        L11:
            int r1 = r6.getSize()     // Catch: java.lang.Throwable -> L51
            int r2 = r6.capacity     // Catch: java.lang.Throwable -> L51
            if (r1 < r2) goto L1f
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L51
            r0.unlock()
            return r7
        L1f:
            boolean r8 = r8.trySelect()     // Catch: java.lang.Throwable -> L51
            if (r8 != 0) goto L2d
            java.lang.Object r7 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L51
            r0.unlock()
            return r7
        L2d:
            long r2 = r6.getTail()     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r8 = r6.buffer     // Catch: java.lang.Throwable -> L51
            int r4 = r6.capacity     // Catch: java.lang.Throwable -> L51
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L51
            long r4 = r2 % r4
            int r4 = (int) r4     // Catch: java.lang.Throwable -> L51
            r8[r4] = r7     // Catch: java.lang.Throwable -> L51
            int r1 = r1 + 1
            r6.setSize(r1)     // Catch: java.lang.Throwable -> L51
            r7 = 1
            long r2 = r2 + r7
            r6.setTail(r2)     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L51
            r0.unlock()
            r6.checkSubOffers()
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r7
        L51:
            r7 = move-exception
            r0.unlock()
            throw r7
    }

    @Override // kotlinx.coroutines.channels.BroadcastChannel
    public kotlinx.coroutines.channels.ReceiveChannel<E> openSubscription() {
            r3 = this;
            kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber r0 = new kotlinx.coroutines.channels.ArrayBroadcastChannel$Subscriber
            r0.<init>(r3)
            r1 = 0
            r2 = 2
            updateHead$default(r3, r0, r1, r2, r1)
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            return r0
    }
}
