package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u000006:\u0004defgB)\u0012 \u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\u000e\u0012\u0002\b\u00030\u0011j\u0006\u0012\u0002\b\u0003`\u00122\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00032\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010!\u001a\u00020\b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\b!\u0010#J)\u0010&\u001a\u00020\u00032\u0018\u0010%\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`$H\u0016¢\u0006\u0004\b&\u0010\u0007J\u0019\u0010'\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0004\b+\u0010,J#\u0010/\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010.\u001a\u0006\u0012\u0002\b\u00030-H\u0014¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u000201H\u0014¢\u0006\u0004\b2\u00103JX\u00109\u001a\u00020\u0003\"\u0004\b\u0001\u001042\f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00010-2\u0006\u0010\u0010\u001a\u00028\u00002(\u00108\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000107\u0012\u0006\u0012\u0004\u0018\u00010\u001a05H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u001b\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010;J\u001d\u0010=\u001a\b\u0012\u0002\b\u0003\u0018\u00010<2\u0006\u0010\u0010\u001a\u00028\u0000H\u0004¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00028\u0000H\u0082@ø\u0001\u0000¢\u0006\u0004\b?\u0010;J\u0017\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010<H\u0014¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u0004\u0018\u00010\u0018H\u0004¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ$\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00030G2\u0006\u0010\u0010\u001a\u00028\u0000ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\bH\u0010,J+\u0010J\u001a\u00020\u0003*\u0006\u0012\u0002\b\u0003072\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0002¢\u0006\u0004\bJ\u0010KR\u0014\u0010M\u001a\u00020D8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\bL\u0010FR\u001a\u0010P\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010S\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\bU\u0010TR\u0011\u0010V\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bW\u0010TR#\u0010[\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000060X8F¢\u0006\u0006\u001a\u0004\bY\u0010ZR.\u0010\u0005\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00048\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\\R\u001a\u0010^\u001a\u00020]8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010c\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006h"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel;", "E", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "cause", "", "close", "(Ljava/lang/Throwable;)Z", "", "countQueueSize", "()I", "element", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/internal/AddLastDesc;", "describeSendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "describeTryOffer", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "Lkotlinx/coroutines/channels/Send;", "send", "", "enqueueSend", "(Lkotlinx/coroutines/channels/Send;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/Closed;", "closed", "helpClose", "(Lkotlinx/coroutines/channels/Closed;)V", "helpCloseAndGetSendException", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "(Lkotlinx/coroutines/channels/Closed;)Ljava/lang/Throwable;", "Lkotlinx/coroutines/channels/Handler;", "handler", "invokeOnClose", "invokeOnCloseHandler", "(Ljava/lang/Throwable;)V", "offer", "(Ljava/lang/Object;)Z", "offerInternal", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectInstance;", "select", "offerSelectInternal", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onClosedIdempotent", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode;)V", "R", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "block", "registerSelectSend", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendBuffered", "(Ljava/lang/Object;)Lkotlinx/coroutines/channels/ReceiveOrClosed;", "sendSuspend", "takeFirstReceiveOrPeekClosed", "()Lkotlinx/coroutines/channels/ReceiveOrClosed;", "takeFirstSendOrPeekClosed", "()Lkotlinx/coroutines/channels/Send;", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "trySend", "helpCloseAndResumeWithSendException", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "getBufferDebugString", "bufferDebugString", "getClosedForReceive", "()Lkotlinx/coroutines/channels/Closed;", "closedForReceive", "getClosedForSend", "closedForSend", "isBufferAlwaysFull", "()Z", "isBufferFull", "isClosedForSend", "isFullImpl", "Lkotlinx/coroutines/selects/SelectClause2;", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "onSend", "Lkotlin/jvm/functions/Function1;", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueue", "()Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "getQueueDebugStateString", "queueDebugStateString", "SendBuffered", "SendBufferedDesc", "SendSelect", "TryOfferDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractSendChannel<E> implements kotlinx.coroutines.channels.SendChannel<E> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater onCloseHandler$FU = null;
    private volatile /* synthetic */ java.lang.Object onCloseHandler;
    protected final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;
    private final kotlinx.coroutines.internal.LockFreeLinkedListHead queue;

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0014\u0010\f\u001a\u00020\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016R\u0012\u0010\u0003\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "E", "Lkotlinx/coroutines/channels/Send;", "element", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "pollResult", "", "getPollResult", "()Ljava/lang/Object;", "completeResumeSend", "", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class SendBuffered<E> extends kotlinx.coroutines.channels.Send {
        public final E element;

        public SendBuffered(E r1) {
                r0 = this;
                r0.<init>()
                r0.element = r1
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend() {
                r0 = this;
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public java.lang.Object getPollResult() {
                r1 = this;
                E r0 = r1.element
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public void resumeSendClosed(kotlinx.coroutines.channels.Closed<?> r1) {
                r0 = this;
                boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r1 != 0) goto L7
                return
            L7:
                java.lang.AssertionError r1 = new java.lang.AssertionError
                r1.<init>()
                throw r1
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SendBuffered@"
                r0.<init>(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 40
                java.lang.StringBuilder r0 = r0.append(r1)
                E r1 = r2.element
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public kotlinx.coroutines.internal.Symbol tryResumeSend(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r1 = this;
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r2 == 0) goto L7
                r2.finishPrepare()
            L7:
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendBufferedDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$AddLastDesc;", "Lkotlinx/coroutines/channels/AbstractSendChannel$SendBuffered;", "Lkotlinx/coroutines/internal/AddLastDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "element", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;Ljava/lang/Object;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static class SendBufferedDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered<? extends E>> {
        public SendBufferedDesc(kotlinx.coroutines.internal.LockFreeLinkedListHead r2, E r3) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
                kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered
                r0.<init>(r3)
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
                r1.<init>(r2, r0)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
                if (r2 == 0) goto Lc
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u00032\u00020\u0004BV\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t\u0012(\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0014\u0010\u0017\u001a\u00020\u00152\n\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010 \u001a\u00020\u0015H\u0016R7\u0010\n\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\u00028\u0001X\u0096\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$SendSelect;", "E", "R", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/DisposableHandle;", "pollResult", "channel", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/SendChannel;", "Lkotlin/coroutines/Continuation;", "", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/AbstractSendChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/jvm/functions/Function2;", "getPollResult", "()Ljava/lang/Object;", "Ljava/lang/Object;", "completeResumeSend", "", "dispose", "resumeSendClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeSend", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "undeliveredElement", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class SendSelect<E, R> extends kotlinx.coroutines.channels.Send implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.SendChannel<? super E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.channels.AbstractSendChannel<E> channel;
        private final E pollResult;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        public SendSelect(E r1, kotlinx.coroutines.channels.AbstractSendChannel<E> r2, kotlinx.coroutines.selects.SelectInstance<? super R> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
                r0 = this;
                r0.<init>()
                r0.pollResult = r1
                r0.channel = r2
                r0.select = r3
                r0.block = r4
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public void completeResumeSend() {
                r6 = this;
                kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.SendChannel<? super E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r6.block
                kotlinx.coroutines.channels.AbstractSendChannel<E> r1 = r6.channel
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r6.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                r4 = 4
                r5 = 0
                r3 = 0
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r0, r1, r2, r3, r4, r5)
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                boolean r0 = r1.mo2317remove()
                if (r0 != 0) goto L7
                return
            L7:
                r1.undeliveredElement()
                return
        }

        @Override // kotlinx.coroutines.channels.Send
        public E getPollResult() {
                r1 = this;
                E r0 = r1.pollResult
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public void resumeSendClosed(kotlinx.coroutines.channels.Closed<?> r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                boolean r0 = r0.trySelect()
                if (r0 == 0) goto L11
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                java.lang.Throwable r2 = r2.getSendException()
                r0.resumeSelectWithException(r2)
            L11:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "SendSelect@"
                r0.<init>(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 40
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.Object r1 = r2.getPollResult()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ")["
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.channels.AbstractSendChannel<E> r1 = r2.channel
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", "
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.Send
        public kotlinx.coroutines.internal.Symbol tryResumeSend(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r1 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r1.select
                java.lang.Object r2 = r0.trySelectOther(r2)
                kotlinx.coroutines.internal.Symbol r2 = (kotlinx.coroutines.internal.Symbol) r2
                return r2
        }

        @Override // kotlinx.coroutines.channels.Send
        public void undeliveredElement() {
                r3 = this;
                kotlinx.coroutines.channels.AbstractSendChannel<E> r0 = r3.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 == 0) goto L17
                java.lang.Object r1 = r3.getPollResult()
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r3.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlin.coroutines.CoroutineContext r2 = r2.getContext()
                kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElement(r0, r1, r2)
            L17:
                return
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0003`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014J\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u00060\u0010j\u0002`\u0011H\u0016R\u0012\u0010\u0005\u001a\u00028\u00018\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractSendChannel$TryOfferDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "element", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "Ljava/lang/Object;", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    protected static final class TryOfferDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.ReceiveOrClosed<? super E>> {
        public final E element;

        public TryOfferDesc(E r1, kotlinx.coroutines.internal.LockFreeLinkedListHead r2) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
                r0.<init>(r2)
                r0.element = r1
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
                if (r2 != 0) goto Lc
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r3) {
                r2 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r3.affected
                kotlinx.coroutines.channels.ReceiveOrClosed r0 = (kotlinx.coroutines.channels.ReceiveOrClosed) r0
                E r1 = r2.element
                kotlinx.coroutines.internal.Symbol r3 = r0.tryResumeReceive(r1, r3)
                if (r3 != 0) goto Lf
                java.lang.Object r3 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r3
            Lf:
                java.lang.Object r0 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                if (r3 != r0) goto L16
                java.lang.Object r3 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r3
            L16:
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L27
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r3 != r0) goto L21
                goto L27
            L21:
                java.lang.AssertionError r3 = new java.lang.AssertionError
                r3.<init>()
                throw r3
            L27:
                r3 = 0
                return r3
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "onCloseHandler"
            java.lang.Class<kotlinx.coroutines.channels.AbstractSendChannel> r2 = kotlinx.coroutines.channels.AbstractSendChannel.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU = r0
            return
    }

    public AbstractSendChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>()
            r0.onUndeliveredElement = r1
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = new kotlinx.coroutines.internal.LockFreeLinkedListHead
            r1.<init>()
            r0.queue = r1
            r1 = 0
            r0.onCloseHandler = r1
            return
    }

    public static final /* synthetic */ void access$helpCloseAndResumeWithSendException(kotlinx.coroutines.channels.AbstractSendChannel r0, kotlin.coroutines.Continuation r1, java.lang.Object r2, kotlinx.coroutines.channels.Closed r3) {
            r0.helpCloseAndResumeWithSendException(r1, r2, r3)
            return
    }

    public static final /* synthetic */ boolean access$isFullImpl(kotlinx.coroutines.channels.AbstractSendChannel r0) {
            boolean r0 = r0.isFullImpl()
            return r0
    }

    public static final /* synthetic */ void access$registerSelectSend(kotlinx.coroutines.channels.AbstractSendChannel r0, kotlinx.coroutines.selects.SelectInstance r1, java.lang.Object r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectSend(r1, r2, r3)
            return
    }

    public static final /* synthetic */ java.lang.Object access$sendSuspend(kotlinx.coroutines.channels.AbstractSendChannel r0, java.lang.Object r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.sendSuspend(r1, r2)
            return r0
    }

    private final int countQueueSize() {
            r4 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            java.lang.Object r1 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
        L9:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r3 != 0) goto L1a
            boolean r3 = r1 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r3 == 0) goto L15
            int r2 = r2 + 1
        L15:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r1.getNextNode()
            goto L9
        L1a:
            return r2
    }

    private final java.lang.String getQueueDebugStateString() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r3.queue
            if (r0 != r1) goto Ld
            java.lang.String r0 = "EmptyQueue"
            return r0
        Ld:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L16
            java.lang.String r1 = r0.toString()
            goto L33
        L16:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Receive
            if (r1 == 0) goto L1d
            java.lang.String r1 = "ReceiveQueued"
            goto L33
        L1d:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Send
            if (r1 == 0) goto L24
            java.lang.String r1 = "SendQueued"
            goto L33
        L24:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "UNEXPECTED:"
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r1 = r1.toString()
        L33:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r2 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getPrevNode()
            if (r2 == r0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",queueSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.countQueueSize()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r0.toString()
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L71
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ",closedForSend="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r1 = r0.toString()
        L71:
            return r1
    }

    private final void helpClose(kotlinx.coroutines.channels.Closed<?> r6) {
            r5 = this;
            r0 = 0
            r1 = 1
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m2309constructorimpl$default(r0, r1, r0)
        L6:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r6.getPrevNode()
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.Receive
            if (r4 == 0) goto L11
            kotlinx.coroutines.channels.Receive r3 = (kotlinx.coroutines.channels.Receive) r3
            goto L12
        L11:
            r3 = r0
        L12:
            if (r3 != 0) goto L46
            if (r2 == 0) goto L40
            boolean r0 = r2 instanceof java.util.ArrayList
            if (r0 != 0) goto L20
            kotlinx.coroutines.channels.Receive r2 = (kotlinx.coroutines.channels.Receive) r2
            r2.resumeReceiveClosed(r6)
            goto L40
        L20:
            if (r2 == 0) goto L38
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            int r0 = r0 - r1
        L29:
            r1 = -1
            if (r1 >= r0) goto L40
            java.lang.Object r1 = r2.get(r0)
            kotlinx.coroutines.channels.Receive r1 = (kotlinx.coroutines.channels.Receive) r1
            r1.resumeReceiveClosed(r6)
            int r0 = r0 + (-1)
            goto L29
        L38:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r6.<init>(r0)
            throw r6
        L40:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r6 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r6
            r5.onClosedIdempotent(r6)
            return
        L46:
            boolean r4 = r3.mo2317remove()
            if (r4 != 0) goto L50
            r3.helpRemove()
            goto L6
        L50:
            java.lang.Object r2 = kotlinx.coroutines.internal.InlineList.m2314plusFjFbRPM(r2, r3)
            goto L6
    }

    private final java.lang.Throwable helpCloseAndGetSendException(E r4, kotlinx.coroutines.channels.Closed<?> r5) {
            r3 = this;
            r3.helpClose(r5)
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r3.onUndeliveredElement
            if (r0 == 0) goto L1b
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r4 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r0, r4, r2, r1, r2)
            if (r4 != 0) goto L10
            goto L1b
        L10:
            r0 = r4
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r5 = r5.getSendException()
            kotlin.ExceptionsKt.addSuppressed(r0, r5)
            throw r4
        L1b:
            java.lang.Throwable r4 = r5.getSendException()
            return r4
    }

    private final java.lang.Throwable helpCloseAndGetSendException(kotlinx.coroutines.channels.Closed<?> r1) {
            r0 = this;
            r0.helpClose(r1)
            java.lang.Throwable r1 = r1.getSendException()
            return r1
    }

    private final void helpCloseAndResumeWithSendException(kotlin.coroutines.Continuation<?> r4, E r5, kotlinx.coroutines.channels.Closed<?> r6) {
            r3 = this;
            r3.helpClose(r6)
            java.lang.Throwable r6 = r6.getSendException()
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r3.onUndeliveredElement
            if (r0 == 0) goto L26
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r5 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r0, r5, r2, r1, r2)
            if (r5 == 0) goto L26
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            kotlin.ExceptionsKt.addSuppressed(r5, r6)
            kotlin.Result$Companion r6 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r5 = kotlin.Result.m767constructorimpl(r5)
            r4.resumeWith(r5)
            return
        L26:
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            java.lang.Object r5 = kotlin.ResultKt.createFailure(r6)
            java.lang.Object r5 = kotlin.Result.m767constructorimpl(r5)
            r4.resumeWith(r5)
            return
    }

    private final void invokeOnCloseHandler(java.lang.Throwable r4) {
            r3 = this;
            java.lang.Object r0 = r3.onCloseHandler
            if (r0 == 0) goto L1c
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            if (r0 == r1) goto L1c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
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

    private final boolean isFullImpl() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r0 != 0) goto L12
            boolean r0 = r1.isBufferFull()
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private final <R> void registerSelectSend(kotlinx.coroutines.selects.SelectInstance<? super R> r3, E r4, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.isFullImpl()
            if (r0 == 0) goto L58
            kotlinx.coroutines.channels.AbstractSendChannel$SendSelect r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendSelect
            r0.<init>(r4, r2, r3, r5)
            r1 = r0
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            java.lang.Object r1 = r2.enqueueSend(r1)
            if (r1 != 0) goto L21
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            r3.disposeOnSelect(r0)
            return
        L21:
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r0 != 0) goto L4d
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            if (r1 == r0) goto L58
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.Receive
            if (r0 == 0) goto L2e
            goto L58
        L2e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "enqueueSend returned "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            r5 = 32
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L4d:
            kotlinx.coroutines.channels.Closed r1 = (kotlinx.coroutines.channels.Closed) r1
            java.lang.Throwable r3 = r2.helpCloseAndGetSendException(r4, r1)
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r3)
            throw r3
        L58:
            java.lang.Object r0 = r2.offerSelectInternal(r4, r3)
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L63
            return
        L63:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 == r1) goto L0
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 == r1) goto L0
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L77
            kotlin.coroutines.Continuation r3 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r5, r2, r3)
            return
        L77:
            boolean r3 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L86
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            java.lang.Throwable r3 = r2.helpCloseAndGetSendException(r4, r0)
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r3)
            throw r3
        L86:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "offerSelectInternal returned "
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    private final java.lang.Object sendSuspend(E r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r4 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
        Lb:
            boolean r2 = access$isFullImpl(r4)
            if (r2 == 0) goto L61
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r4.onUndeliveredElement
            if (r2 != 0) goto L1b
            kotlinx.coroutines.channels.SendElement r2 = new kotlinx.coroutines.channels.SendElement
            r2.<init>(r5, r1)
            goto L24
        L1b:
            kotlinx.coroutines.channels.SendElementWithUndeliveredHandler r2 = new kotlinx.coroutines.channels.SendElementWithUndeliveredHandler
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r3 = r4.onUndeliveredElement
            r2.<init>(r5, r1, r3)
            kotlinx.coroutines.channels.SendElement r2 = (kotlinx.coroutines.channels.SendElement) r2
        L24:
            r3 = r2
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            java.lang.Object r3 = r4.enqueueSend(r3)
            if (r3 != 0) goto L33
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            kotlinx.coroutines.CancellableContinuationKt.removeOnCancellation(r1, r2)
            goto L86
        L33:
            boolean r2 = r3 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L3f
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlinx.coroutines.channels.Closed r3 = (kotlinx.coroutines.channels.Closed) r3
            access$helpCloseAndResumeWithSendException(r4, r1, r5, r3)
            goto L86
        L3f:
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            if (r3 == r2) goto L61
            boolean r2 = r3 instanceof kotlinx.coroutines.channels.Receive
            if (r2 == 0) goto L48
            goto L61
        L48:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "enqueueSend returned "
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L61:
            java.lang.Object r2 = r4.offerInternal(r5)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r2 != r3) goto L77
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlin.Result$Companion r5 = kotlin.Result.Companion
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            java.lang.Object r5 = kotlin.Result.m767constructorimpl(r5)
            r1.resumeWith(r5)
            goto L86
        L77:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r2 == r3) goto Lb
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L9d
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
            access$helpCloseAndResumeWithSendException(r4, r1, r5, r2)
        L86:
            java.lang.Object r5 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L93
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L93:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r6) goto L9a
            return r5
        L9a:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L9d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "offerInternal returned "
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.channels.Closed r0 = new kotlinx.coroutines.channels.Closed
            r0.<init>(r5)
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r4.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
        L9:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.getPrevNode()
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L13
            r1 = 0
            goto L1d
        L13:
            r3 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r3
            boolean r2 = r2.addNext(r3, r1)
            if (r2 == 0) goto L9
            r1 = 1
        L1d:
            if (r1 == 0) goto L20
            goto L28
        L20:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getPrevNode()
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
        L28:
            r4.helpClose(r0)
            if (r1 == 0) goto L30
            r4.invokeOnCloseHandler(r5)
        L30:
            return r1
    }

    protected final kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc<?> describeSendBuffered(E r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$SendBufferedDesc r0 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBufferedDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.queue
            r0.<init>(r1, r3)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.AddLastDesc) r0
            return r0
    }

    protected final kotlinx.coroutines.channels.AbstractSendChannel.TryOfferDesc<E> describeTryOffer(E r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r0 = new kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.queue
            r0.<init>(r3, r1)
            return r0
    }

    protected java.lang.Object enqueueSend(kotlinx.coroutines.channels.Send r5) {
            r4 = this;
            boolean r0 = r4.isBufferAlwaysFull()
            if (r0 == 0) goto L1d
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        La:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r0.getPrevNode()
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r2 == 0) goto L13
            return r1
        L13:
            r2 = r5
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
            boolean r1 = r1.addNext(r2, r0)
            if (r1 == 0) goto La
            goto L41
        L1d:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1 r1 = new kotlinx.coroutines.channels.AbstractSendChannel$enqueueSend$$inlined$addLastIfPrevAndIf$1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r5 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r5
            r1.<init>(r5, r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r1
        L2a:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.getPrevNode()
            boolean r3 = r2 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2.tryCondAddNext(r5, r0, r1)
            r3 = 1
            if (r2 == r3) goto L41
            r3 = 2
            if (r2 == r3) goto L3e
            goto L2a
        L3e:
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.ENQUEUE_FAILED
            return r5
        L41:
            r5 = 0
            return r5
    }

    protected java.lang.String getBufferDebugString() {
            r1 = this;
            java.lang.String r0 = ""
            return r0
    }

    protected final kotlinx.coroutines.channels.Closed<?> getClosedForReceive() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            r2 = 0
            if (r1 == 0) goto Le
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L15
            r3.helpClose(r0)
            r2 = r0
        L15:
            return r2
    }

    protected final kotlinx.coroutines.channels.Closed<?> getClosedForSend() {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getPrevNode()
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            r2 = 0
            if (r1 == 0) goto Le
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L15
            r3.helpClose(r0)
            r2 = r0
        L15:
            return r2
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$onSend$1 r0 = new kotlinx.coroutines.channels.AbstractSendChannel$onSend$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    protected final kotlinx.coroutines.internal.LockFreeLinkedListHead getQueue() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.queue
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.AbstractSendChannel.onCloseHandler$FU
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
            kotlinx.coroutines.channels.Closed r1 = r3.getClosedForSend()
            if (r1 == 0) goto L3f
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.HANDLER_INVOKED
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r4, r2)
            if (r0 == 0) goto L3f
            java.lang.Throwable r0 = r1.closeCause
            r4.invoke(r0)
        L3f:
            return
    }

    protected abstract boolean isBufferAlwaysFull();

    protected abstract boolean isBufferFull();

    @Override // kotlinx.coroutines.channels.SendChannel
    public final boolean isClosedForSend() {
            r1 = this;
            kotlinx.coroutines.channels.Closed r0 = r1.getClosedForSend()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean offer(E r5) {
            r4 = this;
            boolean r5 = kotlinx.coroutines.channels.SendChannel.DefaultImpls.offer(r4, r5)     // Catch: java.lang.Throwable -> L5
            return r5
        L5:
            r0 = move-exception
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 == 0) goto L19
            r2 = 2
            r3 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r5 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r5, r3, r2, r3)
            if (r5 == 0) goto L19
            r1 = r5
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            kotlin.ExceptionsKt.addSuppressed(r1, r0)
            throw r5
        L19:
            throw r0
    }

    protected java.lang.Object offerInternal(E r4) {
            r3 = this;
        L0:
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = r3.takeFirstReceiveOrPeekClosed()
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            return r4
        L9:
            r1 = 0
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeReceive(r4, r1)
            if (r1 == 0) goto L0
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L21
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r1 != r2) goto L1b
            goto L21
        L1b:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L21:
            r0.completeResumeReceive(r4)
            java.lang.Object r4 = r0.getOfferResult()
            return r4
    }

    protected java.lang.Object offerSelectInternal(E r3, kotlinx.coroutines.selects.SelectInstance<?> r4) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r0 = r2.describeTryOffer(r3)
            r1 = r0
            kotlinx.coroutines.internal.AtomicDesc r1 = (kotlinx.coroutines.internal.AtomicDesc) r1
            java.lang.Object r4 = r4.performAtomicTrySelect(r1)
            if (r4 == 0) goto Le
            return r4
        Le:
            java.lang.Object r4 = r0.getResult()
            kotlinx.coroutines.channels.ReceiveOrClosed r4 = (kotlinx.coroutines.channels.ReceiveOrClosed) r4
            r4.completeResumeReceive(r3)
            java.lang.Object r3 = r4.getOfferResult()
            return r3
    }

    protected void onClosedIdempotent(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public final java.lang.Object send(E r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            java.lang.Object r0 = r2.offerInternal(r3)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto Lb
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        Lb:
            java.lang.Object r3 = r2.sendSuspend(r3, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L16
            return r3
        L16:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
    }

    protected final kotlinx.coroutines.channels.ReceiveOrClosed<?> sendBuffered(E r4) {
            r3 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r3.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r1 = new kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered
            r1.<init>(r4)
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
        Lb:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r0.getPrevNode()
            boolean r2 = r4 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r2 == 0) goto L16
            kotlinx.coroutines.channels.ReceiveOrClosed r4 = (kotlinx.coroutines.channels.ReceiveOrClosed) r4
            return r4
        L16:
            boolean r4 = r4.addNext(r1, r0)
            if (r4 == 0) goto Lb
            r4 = 0
            return r4
    }

    protected kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
            r4 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        L4:
            java.lang.Object r1 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            if (r1 != r0) goto Lf
        Ld:
            r1 = r2
            goto L28
        Lf:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            if (r3 != 0) goto L14
            goto Ld
        L14:
            r2 = r1
            kotlinx.coroutines.channels.ReceiveOrClosed r2 = (kotlinx.coroutines.channels.ReceiveOrClosed) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L22
            boolean r2 = r1.isRemoved()
            if (r2 != 0) goto L22
            goto L28
        L22:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.removeOrNext()
            if (r2 != 0) goto L2b
        L28:
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = (kotlinx.coroutines.channels.ReceiveOrClosed) r1
            return r1
        L2b:
            r2.helpRemovePrev()
            goto L4
    }

    protected final kotlinx.coroutines.channels.Send takeFirstSendOrPeekClosed() {
            r4 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r4.queue
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        L4:
            java.lang.Object r1 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2 = 0
            if (r1 != r0) goto Lf
        Ld:
            r1 = r2
            goto L28
        Lf:
            boolean r3 = r1 instanceof kotlinx.coroutines.channels.Send
            if (r3 != 0) goto L14
            goto Ld
        L14:
            r2 = r1
            kotlinx.coroutines.channels.Send r2 = (kotlinx.coroutines.channels.Send) r2
            boolean r2 = r2 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L22
            boolean r2 = r1.isRemoved()
            if (r2 != 0) goto L22
            goto L28
        L22:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r1.removeOrNext()
            if (r2 != 0) goto L2b
        L28:
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            return r1
        L2b:
            r2.helpRemovePrev()
            goto L4
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 64
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 123(0x7b, float:1.72E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getQueueDebugStateString()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r2.getBufferDebugString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU, reason: not valid java name */
    public final java.lang.Object mo2272trySendJP2dKIU(E r4) {
            r3 = this;
            java.lang.Object r4 = r3.offerInternal(r4)
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r4 != r0) goto L11
            kotlinx.coroutines.channels.ChannelResult$Companion r4 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r4.m2292successJP2dKIU(r0)
            goto L3d
        L11:
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r4 != r0) goto L2d
            kotlinx.coroutines.channels.Closed r4 = r3.getClosedForSend()
            if (r4 != 0) goto L22
            kotlinx.coroutines.channels.ChannelResult$Companion r4 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r4 = r4.m2291failurePtdJZtk()
            return r4
        L22:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Throwable r4 = r3.helpCloseAndGetSendException(r4)
            java.lang.Object r4 = r0.m2290closedJP2dKIU(r4)
            goto L3d
        L2d:
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L3e
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r4 = (kotlinx.coroutines.channels.Closed) r4
            java.lang.Throwable r4 = r3.helpCloseAndGetSendException(r4)
            java.lang.Object r4 = r0.m2290closedJP2dKIU(r4)
        L3d:
            return r4
        L3e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "trySend returned "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
