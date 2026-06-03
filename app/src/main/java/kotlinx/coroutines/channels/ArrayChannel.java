package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ArrayChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000BB9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012 \u0010\t\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u00020\u00172\u0006\u0010\r\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0012H\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010%\u001a\u0004\u0018\u00010\u0017H\u0014¢\u0006\u0004\b%\u0010&J\u001d\u0010'\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0014¢\u0006\u0004\b'\u0010(J\u0019\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+R\u001e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00102\u001a\u00020/8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00103R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b7\u00106R\u0014\u00108\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b8\u00106R\u0014\u00109\u001a\u00020\u00128DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b9\u00106R\u0014\u0010:\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u00106R\u0014\u0010;\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b;\u00106R\u0018\u0010>\u001a\u00060<j\u0002`=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@¨\u0006A"}, d2 = {"Lkotlinx/coroutines/channels/ArrayChannel;", "E", "", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILkotlinx/coroutines/channels/BufferOverflow;Lkotlin/jvm/functions/Function1;)V", "currentSize", "element", "enqueueElement", "(ILjava/lang/Object;)V", "Lkotlinx/coroutines/channels/Receive;", "receive", "", "enqueueReceiveInternal", "(Lkotlinx/coroutines/channels/Receive;)Z", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "ensureCapacity", "(I)V", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "wasClosed", "onCancelIdempotent", "(Z)V", "pollInternal", "()Ljava/lang/Object;", "pollSelectInternal", "(Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "updateBufferSize", "(I)Lkotlinx/coroutines/internal/Symbol;", "", "buffer", "[Ljava/lang/Object;", "", "getBufferDebugString", "()Ljava/lang/String;", "bufferDebugString", "I", "head", "isBufferAlwaysEmpty", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isClosedForReceive", "isEmpty", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/channels/BufferOverflow;", "kotlinx-coroutines-core", "Lkotlinx/coroutines/channels/AbstractChannel;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ArrayChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    private java.lang.Object[] buffer;
    private final int capacity;
    private int head;
    private final java.util.concurrent.locks.ReentrantLock lock;
    private final kotlinx.coroutines.channels.BufferOverflow onBufferOverflow;
    private volatile /* synthetic */ int size;

    /* JADX INFO: compiled from: ArrayChannel.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlinx.coroutines.channels.BufferOverflow[] r0 = kotlinx.coroutines.channels.BufferOverflow.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
                int r1 = r1.ordinal()
                r2 = 1
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
                int r1 = r1.ordinal()
                r2 = 2
                r0[r1] = r2
                kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
                int r1 = r1.ordinal()
                r2 = 3
                r0[r1] = r2
                kotlinx.coroutines.channels.ArrayChannel.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public ArrayChannel(int r7, kotlinx.coroutines.channels.BufferOverflow r8, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r9) {
            r6 = this;
            r6.<init>(r9)
            r6.capacity = r7
            r6.onBufferOverflow = r8
            r8 = 1
            if (r7 < r8) goto L29
            java.util.concurrent.locks.ReentrantLock r8 = new java.util.concurrent.locks.ReentrantLock
            r8.<init>()
            r6.lock = r8
            r8 = 8
            int r7 = java.lang.Math.min(r7, r8)
            java.lang.Object[] r7 = new java.lang.Object[r7]
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r4 = 6
            r5 = 0
            r2 = 0
            r3 = 0
            r0 = r7
            kotlin.collections.ArraysKt.fill$default(r0, r1, r2, r3, r4, r5)
            r6.buffer = r7
            r7 = 0
            r6.size = r7
            return
        L29:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ArrayChannel capacity must be at least 1, but "
            r8.<init>(r9)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = " was specified"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }

    private final void enqueueElement(int r5, E r6) {
            r4 = this;
            int r0 = r4.capacity
            if (r5 >= r0) goto L11
            r4.ensureCapacity(r5)
            java.lang.Object[] r0 = r4.buffer
            int r1 = r4.head
            int r1 = r1 + r5
            int r5 = r0.length
            int r1 = r1 % r5
            r0[r1] = r6
            goto L39
        L11:
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L24
            kotlinx.coroutines.channels.BufferOverflow r0 = r4.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r0 != r1) goto L1e
            goto L24
        L1e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L24:
            java.lang.Object[] r0 = r4.buffer
            int r1 = r4.head
            int r2 = r0.length
            int r2 = r1 % r2
            r3 = 0
            r0[r2] = r3
            int r5 = r5 + r1
            int r2 = r0.length
            int r5 = r5 % r2
            r0[r5] = r6
            int r1 = r1 + 1
            int r5 = r0.length
            int r1 = r1 % r5
            r4.head = r1
        L39:
            return
    }

    private final void ensureCapacity(int r8) {
            r7 = this;
            java.lang.Object[] r0 = r7.buffer
            int r1 = r0.length
            if (r8 < r1) goto L2b
            int r0 = r0.length
            int r0 = r0 * 2
            int r1 = r7.capacity
            int r0 = java.lang.Math.min(r0, r1)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
            r3 = r2
        L12:
            if (r3 >= r8) goto L22
            java.lang.Object[] r4 = r7.buffer
            int r5 = r7.head
            int r5 = r5 + r3
            int r6 = r4.length
            int r5 = r5 % r6
            r4 = r4[r5]
            r1[r3] = r4
            int r3 = r3 + 1
            goto L12
        L22:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            kotlin.collections.ArraysKt.fill(r1, r3, r8, r0)
            r7.buffer = r1
            r7.head = r2
        L2b:
            return
    }

    private final kotlinx.coroutines.internal.Symbol updateBufferSize(int r4) {
            r3 = this;
            int r0 = r3.capacity
            r1 = 0
            r2 = 1
            if (r4 >= r0) goto La
            int r4 = r4 + r2
            r3.size = r4
            return r1
        La:
            kotlinx.coroutines.channels.BufferOverflow r4 = r3.onBufferOverflow
            int[] r0 = kotlinx.coroutines.channels.ArrayChannel.WhenMappings.$EnumSwitchMapping$0
            int r4 = r4.ordinal()
            r4 = r0[r4]
            if (r4 == r2) goto L26
            r0 = 2
            if (r4 == r0) goto L23
            r0 = 3
            if (r4 != r0) goto L1d
            goto L28
        L1d:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L23:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            goto L28
        L26:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
        L28:
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected boolean enqueueReceiveInternal(kotlinx.coroutines.channels.Receive<? super E> r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r2 = super.enqueueReceiveInternal(r2)     // Catch: java.lang.Throwable -> Lf
            r0.unlock()
            return r2
        Lf:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object enqueueSend(kotlinx.coroutines.channels.Send r2) {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            java.lang.Object r2 = super.enqueueSend(r2)     // Catch: java.lang.Throwable -> Lf
            r0.unlock()
            return r2
        Lf:
            r2 = move-exception
            r0.unlock()
            throw r2
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.String getBufferDebugString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "(buffer:capacity="
            r0.<init>(r1)
            int r1 = r2.capacity
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",size="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.size
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferAlwaysEmpty() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferAlwaysFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
            r2 = this;
            int r0 = r2.size
            int r1 = r2.capacity
            if (r0 != r1) goto Le
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.onBufferOverflow
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = super.isClosedForReceive()     // Catch: java.lang.Throwable -> Lf
            r0.unlock()
            return r1
        Lf:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel, kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            boolean r1 = r2.isEmptyImpl()     // Catch: java.lang.Throwable -> Lf
            r0.unlock()
            return r1
        Lf:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E r6) {
            r5 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r5.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            int r1 = r5.size     // Catch: java.lang.Throwable -> L63
            kotlinx.coroutines.channels.Closed r2 = r5.getClosedForSend()     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L13
            r0.unlock()
            return r2
        L13:
            kotlinx.coroutines.internal.Symbol r2 = r5.updateBufferSize(r1)     // Catch: java.lang.Throwable -> L63
            if (r2 == 0) goto L1d
            r0.unlock()
            return r2
        L1d:
            if (r1 != 0) goto L5a
        L1f:
            kotlinx.coroutines.channels.ReceiveOrClosed r2 = r5.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L63
            if (r2 != 0) goto L26
            goto L5a
        L26:
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L30
            r5.size = r1     // Catch: java.lang.Throwable -> L63
            r0.unlock()
            return r2
        L30:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2)     // Catch: java.lang.Throwable -> L63
            r3 = 0
            kotlinx.coroutines.internal.Symbol r3 = r2.tryResumeReceive(r6, r3)     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L1f
            boolean r4 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L63
            if (r4 == 0) goto L4b
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L63
            if (r3 != r4) goto L45
            goto L4b
        L45:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L63
            r6.<init>()     // Catch: java.lang.Throwable -> L63
            throw r6     // Catch: java.lang.Throwable -> L63
        L4b:
            r5.size = r1     // Catch: java.lang.Throwable -> L63
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L63
            r0.unlock()
            r2.completeResumeReceive(r6)
            java.lang.Object r6 = r2.getOfferResult()
            return r6
        L5a:
            r5.enqueueElement(r1, r6)     // Catch: java.lang.Throwable -> L63
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L63
            r0.unlock()
            return r6
        L63:
            r6 = move-exception
            r0.unlock()
            throw r6
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r5, kotlinx.coroutines.selects.SelectInstance<?> r6) {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            int r1 = r4.size     // Catch: java.lang.Throwable -> L93
            kotlinx.coroutines.channels.Closed r2 = r4.getClosedForSend()     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L13
            r0.unlock()
            return r2
        L13:
            kotlinx.coroutines.internal.Symbol r2 = r4.updateBufferSize(r1)     // Catch: java.lang.Throwable -> L93
            if (r2 == 0) goto L1d
            r0.unlock()
            return r2
        L1d:
            if (r1 != 0) goto L7a
        L1f:
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r2 = r4.describeTryOffer(r5)     // Catch: java.lang.Throwable -> L93
            r3 = r2
            kotlinx.coroutines.internal.AtomicDesc r3 = (kotlinx.coroutines.internal.AtomicDesc) r3     // Catch: java.lang.Throwable -> L93
            java.lang.Object r3 = r6.performAtomicTrySelect(r3)     // Catch: java.lang.Throwable -> L93
            if (r3 != 0) goto L44
            r4.size = r1     // Catch: java.lang.Throwable -> L93
            java.lang.Object r6 = r2.getResult()     // Catch: java.lang.Throwable -> L93
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L93
            r0.unlock()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            kotlinx.coroutines.channels.ReceiveOrClosed r6 = (kotlinx.coroutines.channels.ReceiveOrClosed) r6
            r6.completeResumeReceive(r5)
            java.lang.Object r5 = r6.getOfferResult()
            return r5
        L44:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L93
            if (r3 == r2) goto L7a
            java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> L93
            if (r3 == r2) goto L1f
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L93
            if (r3 == r5) goto L74
            boolean r5 = r3 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L93
            if (r5 == 0) goto L57
            goto L74
        L57:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L93
            r6.<init>()     // Catch: java.lang.Throwable -> L93
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.StringBuilder r6 = r6.append(r1)     // Catch: java.lang.Throwable -> L93
            java.lang.StringBuilder r6 = r6.append(r3)     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L93
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L93
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L93
            throw r5     // Catch: java.lang.Throwable -> L93
        L74:
            r4.size = r1     // Catch: java.lang.Throwable -> L93
            r0.unlock()
            return r3
        L7a:
            boolean r6 = r6.trySelect()     // Catch: java.lang.Throwable -> L93
            if (r6 != 0) goto L8a
            r4.size = r1     // Catch: java.lang.Throwable -> L93
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L93
            r0.unlock()
            return r5
        L8a:
            r4.enqueueElement(r1, r5)     // Catch: java.lang.Throwable -> L93
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L93
            r0.unlock()
            return r5
        L93:
            r5 = move-exception
            r0.unlock()
            throw r5
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void onCancelIdempotent(boolean r10) {
            r9 = this;
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r9.onUndeliveredElement
            java.util.concurrent.locks.ReentrantLock r1 = r9.lock
            java.util.concurrent.locks.Lock r1 = (java.util.concurrent.locks.Lock) r1
            r1.lock()
            int r2 = r9.size     // Catch: java.lang.Throwable -> L43
            r3 = 0
            r4 = 0
            r5 = r3
        Le:
            if (r5 >= r2) goto L35
            java.lang.Object[] r6 = r9.buffer     // Catch: java.lang.Throwable -> L43
            int r7 = r9.head     // Catch: java.lang.Throwable -> L43
            r6 = r6[r7]     // Catch: java.lang.Throwable -> L43
            if (r0 == 0) goto L20
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L43
            if (r6 == r7) goto L20
            kotlinx.coroutines.internal.UndeliveredElementException r4 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r0, r6, r4)     // Catch: java.lang.Throwable -> L43
        L20:
            java.lang.Object[] r6 = r9.buffer     // Catch: java.lang.Throwable -> L43
            int r7 = r9.head     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.internal.Symbol r8 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L43
            r6[r7] = r8     // Catch: java.lang.Throwable -> L43
            int r6 = r9.head     // Catch: java.lang.Throwable -> L43
            int r6 = r6 + 1
            java.lang.Object[] r7 = r9.buffer     // Catch: java.lang.Throwable -> L43
            int r7 = r7.length     // Catch: java.lang.Throwable -> L43
            int r6 = r6 % r7
            r9.head = r6     // Catch: java.lang.Throwable -> L43
            int r5 = r5 + 1
            goto Le
        L35:
            r9.size = r3     // Catch: java.lang.Throwable -> L43
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L43
            r1.unlock()
            super.onCancelIdempotent(r10)
            if (r4 != 0) goto L42
            return
        L42:
            throw r4
        L43:
            r10 = move-exception
            r1.unlock()
            throw r10
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollInternal() {
            r9 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r9.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            int r1 = r9.size     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L17
            kotlinx.coroutines.channels.Closed r1 = r9.getClosedForSend()     // Catch: java.lang.Throwable -> L85
            if (r1 != 0) goto L13
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L85
        L13:
            r0.unlock()
            return r1
        L17:
            java.lang.Object[] r2 = r9.buffer     // Catch: java.lang.Throwable -> L85
            int r3 = r9.head     // Catch: java.lang.Throwable -> L85
            r4 = r2[r3]     // Catch: java.lang.Throwable -> L85
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> L85
            int r2 = r1 + (-1)
            r9.size = r2     // Catch: java.lang.Throwable -> L85
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L85
            int r3 = r9.capacity     // Catch: java.lang.Throwable -> L85
            r6 = 1
            r7 = 0
            if (r1 != r3) goto L5b
            r3 = r5
        L2d:
            kotlinx.coroutines.channels.Send r8 = r9.takeFirstSendOrPeekClosed()     // Catch: java.lang.Throwable -> L85
            if (r8 != 0) goto L35
            r5 = r3
            goto L5b
        L35:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Throwable -> L85
            kotlinx.coroutines.internal.Symbol r3 = r8.tryResumeSend(r5)     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L56
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L85
            if (r2 == 0) goto L4f
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L85
            if (r3 != r2) goto L49
            goto L4f
        L49:
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L85
            r1.<init>()     // Catch: java.lang.Throwable -> L85
            throw r1     // Catch: java.lang.Throwable -> L85
        L4f:
            java.lang.Object r2 = r8.getPollResult()     // Catch: java.lang.Throwable -> L85
            r7 = r6
            r5 = r8
            goto L5b
        L56:
            r8.undeliveredElement()     // Catch: java.lang.Throwable -> L85
            r3 = r8
            goto L2d
        L5b:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L85
            if (r2 == r3) goto L6e
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L85
            if (r3 != 0) goto L6e
            r9.size = r1     // Catch: java.lang.Throwable -> L85
            java.lang.Object[] r3 = r9.buffer     // Catch: java.lang.Throwable -> L85
            int r8 = r9.head     // Catch: java.lang.Throwable -> L85
            int r8 = r8 + r1
            int r1 = r3.length     // Catch: java.lang.Throwable -> L85
            int r8 = r8 % r1
            r3[r8] = r2     // Catch: java.lang.Throwable -> L85
        L6e:
            int r1 = r9.head     // Catch: java.lang.Throwable -> L85
            int r1 = r1 + r6
            java.lang.Object[] r2 = r9.buffer     // Catch: java.lang.Throwable -> L85
            int r2 = r2.length     // Catch: java.lang.Throwable -> L85
            int r1 = r1 % r2
            r9.head = r1     // Catch: java.lang.Throwable -> L85
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L85
            r0.unlock()
            if (r7 == 0) goto L84
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            r5.completeResumeSend()
        L84:
            return r4
        L85:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r9) {
            r8 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r8.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            int r1 = r8.size     // Catch: java.lang.Throwable -> Lcb
            if (r1 != 0) goto L17
            kotlinx.coroutines.channels.Closed r9 = r8.getClosedForSend()     // Catch: java.lang.Throwable -> Lcb
            if (r9 != 0) goto L13
            kotlinx.coroutines.internal.Symbol r9 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lcb
        L13:
            r0.unlock()
            return r9
        L17:
            java.lang.Object[] r2 = r8.buffer     // Catch: java.lang.Throwable -> Lcb
            int r3 = r8.head     // Catch: java.lang.Throwable -> Lcb
            r4 = r2[r3]     // Catch: java.lang.Throwable -> Lcb
            r5 = 0
            r2[r3] = r5     // Catch: java.lang.Throwable -> Lcb
            int r2 = r1 + (-1)
            r8.size = r2     // Catch: java.lang.Throwable -> Lcb
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lcb
            int r3 = r8.capacity     // Catch: java.lang.Throwable -> Lcb
            r6 = 1
            if (r1 != r3) goto L87
        L2b:
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r3 = r8.describeTryPoll()     // Catch: java.lang.Throwable -> Lcb
            r7 = r3
            kotlinx.coroutines.internal.AtomicDesc r7 = (kotlinx.coroutines.internal.AtomicDesc) r7     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r7 = r9.performAtomicTrySelect(r7)     // Catch: java.lang.Throwable -> Lcb
            if (r7 != 0) goto L48
            java.lang.Object r5 = r3.getResult()     // Catch: java.lang.Throwable -> Lcb
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)     // Catch: java.lang.Throwable -> Lcb
            r2 = r5
            kotlinx.coroutines.channels.Send r2 = (kotlinx.coroutines.channels.Send) r2     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r2 = r2.getPollResult()     // Catch: java.lang.Throwable -> Lcb
            r3 = r6
            goto L88
        L48:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lcb
            if (r7 == r3) goto L87
            java.lang.Object r3 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> Lcb
            if (r7 == r3) goto L2b
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> Lcb
            if (r7 != r2) goto L62
            r8.size = r1     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lcb
            int r1 = r8.head     // Catch: java.lang.Throwable -> Lcb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lcb
            r0.unlock()
            return r7
        L62:
            boolean r2 = r7 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto L6a
            r3 = r6
            r2 = r7
            r5 = r2
            goto L88
        L6a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            r1.<init>()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r2 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r1 = r1.append(r7)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lcb
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lcb
            throw r9     // Catch: java.lang.Throwable -> Lcb
        L87:
            r3 = 0
        L88:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> Lcb
            if (r2 == r7) goto L9c
            boolean r7 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> Lcb
            if (r7 != 0) goto L9c
            r8.size = r1     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lcb
            int r7 = r8.head     // Catch: java.lang.Throwable -> Lcb
            int r7 = r7 + r1
            int r1 = r9.length     // Catch: java.lang.Throwable -> Lcb
            int r7 = r7 % r1
            r9[r7] = r2     // Catch: java.lang.Throwable -> Lcb
            goto Lb2
        L9c:
            boolean r9 = r9.trySelect()     // Catch: java.lang.Throwable -> Lcb
            if (r9 != 0) goto Lb2
            r8.size = r1     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object[] r9 = r8.buffer     // Catch: java.lang.Throwable -> Lcb
            int r1 = r8.head     // Catch: java.lang.Throwable -> Lcb
            r9[r1] = r4     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object r9 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> Lcb
            r0.unlock()
            return r9
        Lb2:
            int r9 = r8.head     // Catch: java.lang.Throwable -> Lcb
            int r9 = r9 + r6
            java.lang.Object[] r1 = r8.buffer     // Catch: java.lang.Throwable -> Lcb
            int r1 = r1.length     // Catch: java.lang.Throwable -> Lcb
            int r9 = r9 % r1
            r8.head = r9     // Catch: java.lang.Throwable -> Lcb
            kotlin.Unit r9 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lcb
            r0.unlock()
            if (r3 == 0) goto Lca
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlinx.coroutines.channels.Send r5 = (kotlinx.coroutines.channels.Send) r5
            r5.completeResumeSend()
        Lca:
            return r4
        Lcb:
            r9 = move-exception
            r0.unlock()
            throw r9
    }
}
