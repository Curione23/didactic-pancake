package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0007STUVWXYB'\u0012 \u0010\u0004\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0007J\u0016\u0010\u0019\u001a\u00020\u00062\u000e\u0010\u001a\u001a\n\u0018\u00010\u001cj\u0004\u0018\u0001`\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0002\b\u001fJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000!H\u0004J\u0016\u0010\"\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0002J\u0016\u0010%\u001a\u00020\n2\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000$H\u0014JR\u0010&\u001a\u00020\n\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\u0006\u0010.\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0002\u00100J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0086\u0002J\u0010\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\nH\u0014J/\u00105\u001a\u00020\u00062\f\u00106\u001a\b\u0012\u0004\u0012\u000208072\n\u00109\u001a\u0006\u0012\u0002\b\u00030:H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b;\u0010<J\b\u0010=\u001a\u00020\u0006H\u0014J\b\u0010>\u001a\u00020\u0006H\u0014J\n\u0010?\u001a\u0004\u0018\u00010,H\u0014J\u0016\u0010@\u001a\u0004\u0018\u00010,2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0014J\u0011\u0010#\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\"\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0086@ø\u0001\u0000ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bC\u0010AJ\u001f\u0010D\u001a\u0002H'\"\u0004\b\u0001\u0010'2\u0006\u0010.\u001a\u00020/H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010EJR\u0010F\u001a\u00020\u0006\"\u0004\b\u0001\u0010'2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2$\u0010*\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0002ø\u0001\u0000¢\u0006\u0002\u0010GJ \u0010H\u001a\u00020\u00062\n\u0010I\u001a\u0006\u0012\u0002\b\u00030J2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030$H\u0002J\u0010\u0010K\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010LH\u0014J\u001c\u0010M\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017ø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\bN\u0010OJX\u0010P\u001a\u00020\u0006\"\u0004\b\u0001\u0010'* \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010,\u0012\n\u0012\b\u0012\u0004\u0012\u0002H'0-\u0012\u0006\u0012\u0004\u0018\u00010,0+2\f\u0010(\u001a\b\u0012\u0004\u0012\u0002H'0)2\u0006\u0010.\u001a\u00020/2\b\u0010Q\u001a\u0004\u0018\u00010,H\u0002ø\u0001\u0000¢\u0006\u0002\u0010RR\u0014\u0010\t\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0012\u0010\u000e\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u00138Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel;", "E", "Lkotlinx/coroutines/channels/AbstractSendChannel;", "Lkotlinx/coroutines/channels/Channel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "hasReceiveOrClosed", "", "getHasReceiveOrClosed", "()Z", "isBufferAlwaysEmpty", "isBufferEmpty", "isClosedForReceive", "isEmpty", "isEmptyImpl", "onReceive", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnReceive", "()Lkotlinx/coroutines/selects/SelectClause1;", "onReceiveCatching", "Lkotlinx/coroutines/channels/ChannelResult;", "getOnReceiveCatching", "cancel", "cause", "", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cancelInternal", "cancelInternal$kotlinx_coroutines_core", "describeTryPoll", "Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "enqueueReceive", "receive", "Lkotlinx/coroutines/channels/Receive;", "enqueueReceiveInternal", "enqueueReceiveSelect", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)Z", "iterator", "Lkotlinx/coroutines/channels/ChannelIterator;", "onCancelIdempotent", "wasClosed", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "onReceiveDequeued", "onReceiveEnqueued", "pollInternal", "pollSelectInternal", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "receiveCatching", "receiveCatching-JP2dKIU", "receiveSuspend", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerSelectReceiveMode", "(Lkotlinx/coroutines/selects/SelectInstance;ILkotlin/jvm/functions/Function2;)V", "removeReceiveOnCancel", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "takeFirstReceiveOrPeekClosed", "Lkotlinx/coroutines/channels/ReceiveOrClosed;", "tryReceive", "tryReceive-PtdJZtk", "()Ljava/lang/Object;", "tryStartBlockUnintercepted", "value", "(Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/selects/SelectInstance;ILjava/lang/Object;)V", "Itr", "ReceiveElement", "ReceiveElementWithUndeliveredHandler", "ReceiveHasNext", "ReceiveSelect", "RemoveReceiveOnCancel", "TryPollDesc", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class AbstractChannel<E> extends kotlinx.coroutines.channels.AbstractSendChannel<E> implements kotlinx.coroutines.channels.Channel<E> {

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0011\u0010\f\u001a\u00020\rH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0002J\u0011\u0010\u0010\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0011\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0002\u0010\tR\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "E", "Lkotlinx/coroutines/channels/ChannelIterator;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "(Lkotlinx/coroutines/channels/AbstractChannel;)V", "result", "", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "hasNext", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "hasNextResult", "hasNextSuspend", "next", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class Itr<E> implements kotlinx.coroutines.channels.ChannelIterator<E> {
        public final kotlinx.coroutines.channels.AbstractChannel<E> channel;
        private java.lang.Object result;

        public Itr(kotlinx.coroutines.channels.AbstractChannel<E> r1) {
                r0 = this;
                r0.<init>()
                r0.channel = r1
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                r0.result = r1
                return
        }

        public static final /* synthetic */ java.lang.Object access$hasNextSuspend(kotlinx.coroutines.channels.AbstractChannel.Itr r0, kotlin.coroutines.Continuation r1) {
                java.lang.Object r0 = r0.hasNextSuspend(r1)
                return r0
        }

        private final boolean hasNextResult(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L15
                kotlinx.coroutines.channels.Closed r2 = (kotlinx.coroutines.channels.Closed) r2
                java.lang.Throwable r0 = r2.closeCause
                if (r0 != 0) goto Lc
                r2 = 0
                return r2
            Lc:
                java.lang.Throwable r2 = r2.getReceiveException()
                java.lang.Throwable r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r2)
                throw r2
            L15:
                r2 = 1
                return r2
        }

        private final java.lang.Object hasNextSuspend(kotlin.coroutines.Continuation<? super java.lang.Boolean> r7) {
                r6 = this;
                kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r7)
                kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
                r1 = r0
                kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
                kotlinx.coroutines.channels.AbstractChannel$ReceiveHasNext r2 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveHasNext
                r2.<init>(r6, r1)
            L10:
                kotlinx.coroutines.channels.AbstractChannel<E> r3 = r6.channel
                r4 = r2
                kotlinx.coroutines.channels.Receive r4 = (kotlinx.coroutines.channels.Receive) r4
                boolean r3 = kotlinx.coroutines.channels.AbstractChannel.access$enqueueReceive(r3, r4)
                if (r3 == 0) goto L21
                kotlinx.coroutines.channels.AbstractChannel<E> r2 = r6.channel
                kotlinx.coroutines.channels.AbstractChannel.access$removeReceiveOnCancel(r2, r1, r4)
                goto L75
            L21:
                kotlinx.coroutines.channels.AbstractChannel<E> r3 = r6.channel
                java.lang.Object r3 = r3.pollInternal()
                r6.setResult(r3)
                boolean r4 = r3 instanceof kotlinx.coroutines.channels.Closed
                if (r4 == 0) goto L59
                kotlinx.coroutines.channels.Closed r3 = (kotlinx.coroutines.channels.Closed) r3
                java.lang.Throwable r2 = r3.closeCause
                if (r2 != 0) goto L45
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                r2 = 0
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                java.lang.Object r2 = kotlin.Result.m767constructorimpl(r2)
                r1.resumeWith(r2)
                goto L75
            L45:
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                kotlin.Result$Companion r2 = kotlin.Result.Companion
                java.lang.Throwable r2 = r3.getReceiveException()
                java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
                java.lang.Object r2 = kotlin.Result.m767constructorimpl(r2)
                r1.resumeWith(r2)
                goto L75
            L59:
                kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r3 == r4) goto L10
                r2 = 1
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                kotlinx.coroutines.channels.AbstractChannel<E> r4 = r6.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r4.onUndeliveredElement
                if (r4 == 0) goto L71
                kotlin.coroutines.CoroutineContext r5 = r1.getContext()
                kotlin.jvm.functions.Function1 r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r4, r3, r5)
                goto L72
            L71:
                r3 = 0
            L72:
                r1.resume(r2, r3)
            L75:
                java.lang.Object r0 = r0.getResult()
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto L82
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
            L82:
                return r0
        }

        public final java.lang.Object getResult() {
                r1 = this;
                java.lang.Object r0 = r1.result
                return r0
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public java.lang.Object hasNext(kotlin.coroutines.Continuation<? super java.lang.Boolean> r3) {
                r2 = this;
                java.lang.Object r0 = r2.result
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto L11
                java.lang.Object r3 = r2.result
                boolean r3 = r2.hasNextResult(r3)
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r3
            L11:
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r2.channel
                java.lang.Object r0 = r0.pollInternal()
                r2.result = r0
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto L28
                java.lang.Object r3 = r2.result
                boolean r3 = r2.hasNextResult(r3)
                java.lang.Boolean r3 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
                return r3
            L28:
                java.lang.Object r3 = r2.hasNextSuspend(r3)
                return r3
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() {
                r2 = this;
                java.lang.Object r0 = r2.result
                boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
                if (r1 != 0) goto L17
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                if (r0 == r1) goto Lf
                kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                r2.result = r1
                return r0
            Lf:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "'hasNext' should be called prior to 'next' invocation"
                r0.<init>(r1)
                throw r0
            L17:
                kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
                java.lang.Throwable r0 = r0.getReceiveException()
                java.lang.Throwable r0 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r0)
                throw r0
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.3.0, binary compatibility with versions <= 1.2.x")
        public /* synthetic */ java.lang.Object next(kotlin.coroutines.Continuation r1) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(r0, r1)
                return r1
        }

        public final void setResult(java.lang.Object r1) {
                r0 = this;
                r0.result = r1
                return
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u00020\n2\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u000fH\u0016J\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J!\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "E", "Lkotlinx/coroutines/channels/Receive;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "(Lkotlinx/coroutines/CancellableContinuation;I)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "resumeValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static class ReceiveElement<E> extends kotlinx.coroutines.channels.Receive<E> {
        public final kotlinx.coroutines.CancellableContinuation<java.lang.Object> cont;
        public final int receiveMode;

        public ReceiveElement(kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.cont = r1
                r0.receiveMode = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r2) {
                r1 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r2 = r1.cont
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r2.completeResume(r0)
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> r3) {
                r2 = this;
                int r0 = r2.receiveMode
                r1 = 1
                if (r0 != r1) goto L1f
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r2.cont
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r3 = r3.closeCause
                java.lang.Object r3 = r1.m2290closedJP2dKIU(r3)
                kotlinx.coroutines.channels.ChannelResult r3 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r3)
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Object r3 = kotlin.Result.m767constructorimpl(r3)
                r0.resumeWith(r3)
                goto L34
            L1f:
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r2.cont
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                kotlin.Result$Companion r1 = kotlin.Result.Companion
                java.lang.Throwable r3 = r3.getReceiveException()
                java.lang.Object r3 = kotlin.ResultKt.createFailure(r3)
                java.lang.Object r3 = kotlin.Result.m767constructorimpl(r3)
                r0.resumeWith(r3)
            L34:
                return
        }

        public final java.lang.Object resumeValue(E r3) {
                r2 = this;
                int r0 = r2.receiveMode
                r1 = 1
                if (r0 != r1) goto Lf
                kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Object r3 = r0.m2292successJP2dKIU(r3)
                kotlinx.coroutines.channels.ChannelResult r3 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r3)
            Lf:
                return r3
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ReceiveElement@"
                r0.<init>(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "[receiveMode="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.receiveMode
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r5, kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r6) {
                r4 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r0 = r4.cont
                java.lang.Object r1 = r4.resumeValue(r5)
                r2 = 0
                if (r6 == 0) goto Lc
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r3 = r6.desc
                goto Ld
            Lc:
                r3 = r2
            Ld:
                kotlin.jvm.functions.Function1 r5 = r4.resumeOnCancellationFun(r5)
                java.lang.Object r5 = r0.tryResume(r1, r3, r5)
                if (r5 != 0) goto L18
                return r2
            L18:
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L29
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r5 != r0) goto L23
                goto L29
            L23:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
            L29:
                if (r6 == 0) goto L2e
                r6.finishPrepare()
            L2e:
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                return r5
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B;\u0012\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u001c\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0006\u0010\u000f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010R&\u0010\b\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00028\u0001`\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElementWithUndeliveredHandler;", "E", "Lkotlinx/coroutines/channels/AbstractChannel$ReceiveElement;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "receiveMode", "", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlinx/coroutines/CancellableContinuation;ILkotlin/jvm/functions/Function1;)V", "resumeOnCancellationFun", "", "value", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class ReceiveElementWithUndeliveredHandler<E> extends kotlinx.coroutines.channels.AbstractChannel.ReceiveElement<E> {
        public final kotlin.jvm.functions.Function1<E, kotlin.Unit> onUndeliveredElement;

        public ReceiveElementWithUndeliveredHandler(kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1, int r2, kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.onUndeliveredElement = r3
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r2.onUndeliveredElement
                kotlinx.coroutines.CancellableContinuation<java.lang.Object> r1 = r2.cont
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
                return r3
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B!\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ#\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\n2\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J!\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u000b\u001a\u00028\u00012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0002\u0010\u001aR\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext;", "E", "Lkotlinx/coroutines/channels/Receive;", "iterator", "Lkotlinx/coroutines/channels/AbstractChannel$Itr;", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/channels/AbstractChannel$Itr;Lkotlinx/coroutines/CancellableContinuation;)V", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static class ReceiveHasNext<E> extends kotlinx.coroutines.channels.Receive<E> {
        public final kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> cont;
        public final kotlinx.coroutines.channels.AbstractChannel.Itr<E> iterator;

        public ReceiveHasNext(kotlinx.coroutines.channels.AbstractChannel.Itr<E> r1, kotlinx.coroutines.CancellableContinuation<? super java.lang.Boolean> r2) {
                r0 = this;
                r0.<init>()
                r0.iterator = r1
                r0.cont = r2
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r2) {
                r1 = this;
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r0 = r1.iterator
                r0.setResult(r2)
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r2 = r1.cont
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                r2.completeResume(r0)
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r0 = r2.iterator
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r0.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 == 0) goto L13
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r1 = r2.cont
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
                goto L14
            L13:
                r3 = 0
            L14:
                return r3
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> r5) {
                r4 = this;
                java.lang.Throwable r0 = r5.closeCause
                if (r0 != 0) goto L12
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                r1 = 0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 2
                r3 = 0
                java.lang.Object r0 = kotlinx.coroutines.CancellableContinuation.DefaultImpls.tryResume$default(r0, r1, r3, r2, r3)
                goto L1c
            L12:
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                java.lang.Throwable r1 = r5.getReceiveException()
                java.lang.Object r0 = r0.tryResumeWithException(r1)
            L1c:
                if (r0 == 0) goto L28
                kotlinx.coroutines.channels.AbstractChannel$Itr<E> r1 = r4.iterator
                r1.setResult(r5)
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r5 = r4.cont
                r5.completeResume(r0)
            L28:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ReceiveHasNext@"
                r0.<init>(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r5, kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r6) {
                r4 = this;
                kotlinx.coroutines.CancellableContinuation<java.lang.Boolean> r0 = r4.cont
                r1 = 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r2 = 0
                if (r6 == 0) goto Ld
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r3 = r6.desc
                goto Le
            Ld:
                r3 = r2
            Le:
                kotlin.jvm.functions.Function1 r5 = r4.resumeOnCancellationFun(r5)
                java.lang.Object r5 = r0.tryResume(r1, r3, r5)
                if (r5 != 0) goto L19
                return r2
            L19:
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L2a
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r5 != r0) goto L24
                goto L2a
            L24:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                r5.<init>()
                throw r5
            L2a:
                if (r6 == 0) goto L2f
                r6.finishPrepare()
            L2f:
                kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                return r5
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\b\u0012\u0004\u0012\u0002H\u00020\u00032\u00020\u0004BR\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b\u0012$\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0016J#\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00172\u0006\u0010\u0013\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001a\u001a\u00020\u00122\n\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016J!\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u0013\u001a\u00028\u00022\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0002\u0010#R3\u0010\t\u001a \b\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n8\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\u0010R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$ReceiveSelect;", "R", "E", "Lkotlinx/coroutines/channels/Receive;", "Lkotlinx/coroutines/DisposableHandle;", "channel", "Lkotlinx/coroutines/channels/AbstractChannel;", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "block", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "receiveMode", "", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/selects/SelectInstance;Lkotlin/jvm/functions/Function2;I)V", "Lkotlin/jvm/functions/Function2;", "completeResumeReceive", "", "value", "(Ljava/lang/Object;)V", "dispose", "resumeOnCancellationFun", "Lkotlin/Function1;", "", "(Ljava/lang/Object;)Lkotlin/jvm/functions/Function1;", "resumeReceiveClosed", "closed", "Lkotlinx/coroutines/channels/Closed;", "toString", "", "tryResumeReceive", "Lkotlinx/coroutines/internal/Symbol;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Ljava/lang/Object;Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Lkotlinx/coroutines/internal/Symbol;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private static final class ReceiveSelect<R, E> extends kotlinx.coroutines.channels.Receive<E> implements kotlinx.coroutines.DisposableHandle {
        public final kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> block;
        public final kotlinx.coroutines.channels.AbstractChannel<E> channel;
        public final int receiveMode;
        public final kotlinx.coroutines.selects.SelectInstance<R> select;

        public ReceiveSelect(kotlinx.coroutines.channels.AbstractChannel<E> r1, kotlinx.coroutines.selects.SelectInstance<? super R> r2, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.channel = r1
                r0.select = r2
                r0.block = r3
                r0.receiveMode = r4
                return
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public void completeResumeReceive(E r4) {
                r3 = this;
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r0 = r3.block
                int r1 = r3.receiveMode
                r2 = 1
                if (r1 != r2) goto L12
                kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Object r1 = r1.m2292successJP2dKIU(r4)
                kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r1)
                goto L13
            L12:
                r1 = r4
            L13:
                kotlinx.coroutines.selects.SelectInstance<R> r2 = r3.select
                kotlin.coroutines.Continuation r2 = r2.getCompletion()
                kotlin.jvm.functions.Function1 r4 = r3.resumeOnCancellationFun(r4)
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1, r2, r4)
                return
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
                r1 = this;
                boolean r0 = r1.mo2317remove()
                if (r0 == 0) goto Lb
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r1.channel
                r0.onReceiveDequeued()
            Lb:
                return
        }

        @Override // kotlinx.coroutines.channels.Receive
        public kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> resumeOnCancellationFun(E r3) {
                r2 = this;
                kotlinx.coroutines.channels.AbstractChannel<E> r0 = r2.channel
                kotlin.jvm.functions.Function1<E, kotlin.Unit> r0 = r0.onUndeliveredElement
                if (r0 == 0) goto L15
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                kotlin.coroutines.Continuation r1 = r1.getCompletion()
                kotlin.coroutines.CoroutineContext r1 = r1.getContext()
                kotlin.jvm.functions.Function1 r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.bindCancellationFun(r0, r3, r1)
                goto L16
            L15:
                r3 = 0
            L16:
                return r3
        }

        @Override // kotlinx.coroutines.channels.Receive
        public void resumeReceiveClosed(kotlinx.coroutines.channels.Closed<?> r9) {
                r8 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r8.select
                boolean r0 = r0.trySelect()
                if (r0 != 0) goto L9
                return
            L9:
                int r0 = r8.receiveMode
                if (r0 == 0) goto L2c
                r1 = 1
                if (r0 == r1) goto L11
                goto L35
            L11:
                kotlin.jvm.functions.Function2<java.lang.Object, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r2 = r8.block
                kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
                java.lang.Throwable r9 = r9.closeCause
                java.lang.Object r9 = r0.m2290closedJP2dKIU(r9)
                kotlinx.coroutines.channels.ChannelResult r3 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r9)
                kotlinx.coroutines.selects.SelectInstance<R> r9 = r8.select
                kotlin.coroutines.Continuation r4 = r9.getCompletion()
                r6 = 4
                r7 = 0
                r5 = 0
                kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r2, r3, r4, r5, r6, r7)
                goto L35
            L2c:
                kotlinx.coroutines.selects.SelectInstance<R> r0 = r8.select
                java.lang.Throwable r9 = r9.getReceiveException()
                r0.resumeSelectWithException(r9)
            L35:
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "ReceiveSelect@"
                r0.<init>(r1)
                java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getHexAddress(r2)
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 91
                java.lang.StringBuilder r0 = r0.append(r1)
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r2.select
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ",receiveMode="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.receiveMode
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // kotlinx.coroutines.channels.ReceiveOrClosed
        public kotlinx.coroutines.internal.Symbol tryResumeReceive(E r1, kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r0 = this;
                kotlinx.coroutines.selects.SelectInstance<R> r1 = r0.select
                java.lang.Object r1 = r1.trySelectOther(r2)
                kotlinx.coroutines.internal.Symbol r1 = (kotlinx.coroutines.internal.Symbol) r1
                return r1
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\t\u001a\u00020\nH\u0016R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$RemoveReceiveOnCancel;", "Lkotlinx/coroutines/BeforeResumeCancelHandler;", "receive", "Lkotlinx/coroutines/channels/Receive;", "(Lkotlinx/coroutines/channels/AbstractChannel;Lkotlinx/coroutines/channels/Receive;)V", "invoke", "", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    private final class RemoveReceiveOnCancel extends kotlinx.coroutines.BeforeResumeCancelHandler {
        private final kotlinx.coroutines.channels.Receive<?> receive;
        final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel<E> this$0;

        public RemoveReceiveOnCancel(kotlinx.coroutines.channels.AbstractChannel r1, kotlinx.coroutines.channels.Receive<?> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.receive = r2
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.invoke2(r1)
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }

        @Override // kotlinx.coroutines.CancelHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r1) {
                r0 = this;
                kotlinx.coroutines.channels.Receive<?> r1 = r0.receive
                boolean r1 = r1.mo2317remove()
                if (r1 == 0) goto Ld
                kotlinx.coroutines.channels.AbstractChannel<E> r1 = r0.this$0
                r1.onReceiveDequeued()
            Ld:
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "RemoveReceiveOnCancel["
                r0.<init>(r1)
                kotlinx.coroutines.channels.Receive<?> r1 = r2.receive
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 93
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: AbstractChannel.kt */
    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u0012\u0012\u0004\u0012\u00020\u00030\u0002j\b\u0012\u0004\u0012\u00020\u0003`\u0004B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0014J\u0016\u0010\f\u001a\u0004\u0018\u00010\t2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/channels/AbstractChannel$TryPollDesc;", "E", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$RemoveFirstDesc;", "Lkotlinx/coroutines/channels/Send;", "Lkotlinx/coroutines/internal/RemoveFirstDesc;", "queue", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListHead;)V", "failure", "", "affected", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "onPrepare", "prepareOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "Lkotlinx/coroutines/internal/PrepareOp;", "onRemoved", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
    protected static final class TryPollDesc<E> extends kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc<kotlinx.coroutines.channels.Send> {
        public TryPollDesc(kotlinx.coroutines.internal.LockFreeLinkedListHead r1) {
                r0 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
                r0.<init>(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.RemoveFirstDesc, kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        protected java.lang.Object failure(kotlinx.coroutines.internal.LockFreeLinkedListNode r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.Closed
                if (r0 == 0) goto L5
                goto Ld
            L5:
                boolean r2 = r2 instanceof kotlinx.coroutines.channels.Send
                if (r2 != 0) goto Lc
                kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public java.lang.Object onPrepare(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r2) {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r2.affected
                kotlinx.coroutines.channels.Send r0 = (kotlinx.coroutines.channels.Send) r0
                kotlinx.coroutines.internal.Symbol r2 = r0.tryResumeSend(r2)
                if (r2 != 0) goto Ld
                java.lang.Object r2 = kotlinx.coroutines.internal.LockFreeLinkedList_commonKt.REMOVE_PREPARED
                return r2
            Ld:
                java.lang.Object r0 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                if (r2 != r0) goto L14
                java.lang.Object r2 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
                return r2
            L14:
                boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
                if (r0 == 0) goto L25
                kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
                if (r2 != r0) goto L1f
                goto L25
            L1f:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L25:
                r2 = 0
                return r2
        }

        @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode.AbstractAtomicDesc
        public void onRemoved(kotlinx.coroutines.internal.LockFreeLinkedListNode r1) {
                r0 = this;
                kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
                r1.undeliveredElement()
                return
        }
    }

    public AbstractChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ boolean access$enqueueReceive(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.channels.Receive r1) {
            boolean r0 = r0.enqueueReceive(r1)
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$receiveSuspend(kotlinx.coroutines.channels.AbstractChannel r0, int r1, kotlin.coroutines.Continuation r2) {
            java.lang.Object r0 = r0.receiveSuspend(r1, r2)
            return r0
    }

    public static final /* synthetic */ void access$registerSelectReceiveMode(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.selects.SelectInstance r1, int r2, kotlin.jvm.functions.Function2 r3) {
            r0.registerSelectReceiveMode(r1, r2, r3)
            return
    }

    public static final /* synthetic */ void access$removeReceiveOnCancel(kotlinx.coroutines.channels.AbstractChannel r0, kotlinx.coroutines.CancellableContinuation r1, kotlinx.coroutines.channels.Receive r2) {
            r0.removeReceiveOnCancel(r1, r2)
            return
    }

    private final boolean enqueueReceive(kotlinx.coroutines.channels.Receive<? super E> r1) {
            r0 = this;
            boolean r1 = r0.enqueueReceiveInternal(r1)
            if (r1 == 0) goto L9
            r0.onReceiveEnqueued()
        L9:
            return r1
    }

    private final <R> boolean enqueueReceiveSelect(kotlinx.coroutines.selects.SelectInstance<? super R> r2, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, int r4) {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$ReceiveSelect r0 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveSelect
            r0.<init>(r1, r2, r3, r4)
            r3 = r0
            kotlinx.coroutines.channels.Receive r3 = (kotlinx.coroutines.channels.Receive) r3
            boolean r3 = r1.enqueueReceive(r3)
            if (r3 == 0) goto L13
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            r2.disposeOnSelect(r0)
        L13:
            return r3
    }

    private final <R> java.lang.Object receiveSuspend(int r5, kotlin.coroutines.Continuation<? super R> r6) {
            r4 = this;
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            kotlinx.coroutines.CancellableContinuationImpl r0 = kotlinx.coroutines.CancellableContinuationKt.getOrCreateCancellableContinuation(r0)
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r2 = r4.onUndeliveredElement
            if (r2 != 0) goto L15
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElement r2 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElement
            r2.<init>(r1, r5)
            goto L1e
        L15:
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler r2 = new kotlinx.coroutines.channels.AbstractChannel$ReceiveElementWithUndeliveredHandler
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r3 = r4.onUndeliveredElement
            r2.<init>(r1, r5, r3)
            kotlinx.coroutines.channels.AbstractChannel$ReceiveElement r2 = (kotlinx.coroutines.channels.AbstractChannel.ReceiveElement) r2
        L1e:
            r5 = r2
            kotlinx.coroutines.channels.Receive r5 = (kotlinx.coroutines.channels.Receive) r5
            boolean r3 = access$enqueueReceive(r4, r5)
            if (r3 == 0) goto L2b
            access$removeReceiveOnCancel(r4, r1, r5)
            goto L48
        L2b:
            java.lang.Object r5 = r4.pollInternal()
            boolean r3 = r5 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L39
            kotlinx.coroutines.channels.Closed r5 = (kotlinx.coroutines.channels.Closed) r5
            r2.resumeReceiveClosed(r5)
            goto L48
        L39:
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r5 == r3) goto L1e
            java.lang.Object r3 = r2.resumeValue(r5)
            kotlin.jvm.functions.Function1 r5 = r2.resumeOnCancellationFun(r5)
            r1.resume(r3, r5)
        L48:
            java.lang.Object r5 = r0.getResult()
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r5 != r0) goto L55
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L55:
            return r5
    }

    private final <R> void registerSelectReceiveMode(kotlinx.coroutines.selects.SelectInstance<? super R> r3, int r4, kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
        L0:
            boolean r0 = r3.isSelected()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.isEmptyImpl()
            if (r0 == 0) goto L14
            boolean r0 = r2.enqueueReceiveSelect(r3, r5, r4)
            if (r0 == 0) goto L0
            return
        L14:
            java.lang.Object r0 = r2.pollSelectInternal(r3)
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L1f
            return
        L1f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 == r1) goto L0
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 == r1) goto L0
            r2.tryStartBlockUnintercepted(r5, r3, r4, r0)
            goto L0
    }

    private final void removeReceiveOnCancel(kotlinx.coroutines.CancellableContinuation<?> r2, kotlinx.coroutines.channels.Receive<?> r3) {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel r0 = new kotlinx.coroutines.channels.AbstractChannel$RemoveReceiveOnCancel
            r0.<init>(r1, r3)
            kotlinx.coroutines.CancelHandlerBase r0 = (kotlinx.coroutines.CancelHandlerBase) r0
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            r2.invokeOnCancellation(r0)
            return
    }

    private final <R> void tryStartBlockUnintercepted(kotlin.jvm.functions.Function2<java.lang.Object, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3, kotlinx.coroutines.selects.SelectInstance<? super R> r4, int r5, java.lang.Object r6) {
            r2 = this;
            boolean r0 = r6 instanceof kotlinx.coroutines.channels.Closed
            r1 = 1
            if (r0 == 0) goto L32
            if (r5 == 0) goto L27
            if (r5 == r1) goto La
            goto L58
        La:
            boolean r5 = r4.trySelect()
            if (r5 != 0) goto L11
            return
        L11:
            kotlinx.coroutines.channels.ChannelResult$Companion r5 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r6 = (kotlinx.coroutines.channels.Closed) r6
            java.lang.Throwable r6 = r6.closeCause
            java.lang.Object r5 = r5.m2290closedJP2dKIU(r6)
            kotlinx.coroutines.channels.ChannelResult r5 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r5)
            kotlin.coroutines.Continuation r4 = r4.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r3, r5, r4)
            goto L58
        L27:
            kotlinx.coroutines.channels.Closed r6 = (kotlinx.coroutines.channels.Closed) r6
            java.lang.Throwable r3 = r6.getReceiveException()
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.recoverStackTrace(r3)
            throw r3
        L32:
            if (r5 != r1) goto L51
            kotlinx.coroutines.channels.ChannelResult$Companion r5 = kotlinx.coroutines.channels.ChannelResult.Companion
            if (r0 == 0) goto L41
            kotlinx.coroutines.channels.Closed r6 = (kotlinx.coroutines.channels.Closed) r6
            java.lang.Throwable r6 = r6.closeCause
            java.lang.Object r5 = r5.m2290closedJP2dKIU(r6)
            goto L45
        L41:
            java.lang.Object r5 = r5.m2292successJP2dKIU(r6)
        L45:
            kotlinx.coroutines.channels.ChannelResult r5 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r5)
            kotlin.coroutines.Continuation r4 = r4.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r3, r5, r4)
            goto L58
        L51:
            kotlin.coroutines.Continuation r4 = r4.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r3, r6, r4)
        L58:
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r0 = this;
            kotlinx.coroutines.channels.Channel.DefaultImpls.cancel(r0)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(java.util.concurrent.CancellationException r3) {
            r2 = this;
            boolean r0 = r2.isClosedForReceive()
            if (r0 == 0) goto L7
            return
        L7:
            if (r3 != 0) goto L25
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.getClassSimpleName(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " was cancelled"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
        L25:
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r2.cancelInternal$kotlinx_coroutines_core(r3)
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean cancel(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.cancelInternal$kotlinx_coroutines_core(r1)
            return r1
    }

    public final boolean cancelInternal$kotlinx_coroutines_core(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = r0.close(r1)
            r0.onCancelIdempotent(r1)
            return r1
    }

    protected final kotlinx.coroutines.channels.AbstractChannel.TryPollDesc<E> describeTryPoll() {
            r2 = this;
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r0 = new kotlinx.coroutines.channels.AbstractChannel$TryPollDesc
            kotlinx.coroutines.internal.LockFreeLinkedListHead r1 = r2.getQueue()
            r0.<init>(r1)
            return r0
    }

    protected boolean enqueueReceiveInternal(kotlinx.coroutines.channels.Receive<? super E> r7) {
            r6 = this;
            boolean r0 = r6.isBufferAlwaysEmpty()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L21
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r6.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        Le:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r3 = r0.getPrevNode()
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.Send
            if (r4 == 0) goto L17
            goto L44
        L17:
            r4 = r7
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r4
            boolean r3 = r3.addNext(r4, r0)
            if (r3 == 0) goto Le
            goto L43
        L21:
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r6.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1 r3 = new kotlinx.coroutines.channels.AbstractChannel$enqueueReceiveInternal$$inlined$addLastIfPrevAndIf$1
            kotlinx.coroutines.internal.LockFreeLinkedListNode r7 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r7
            r3.<init>(r7, r6)
            kotlinx.coroutines.internal.LockFreeLinkedListNode$CondAddOp r3 = (kotlinx.coroutines.internal.LockFreeLinkedListNode.CondAddOp) r3
        L30:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r4 = r0.getPrevNode()
            boolean r5 = r4 instanceof kotlinx.coroutines.channels.Send
            if (r5 == 0) goto L39
            goto L44
        L39:
            int r4 = r4.tryCondAddNext(r7, r0, r3)
            if (r4 == r2) goto L43
            r5 = 2
            if (r4 == r5) goto L44
            goto L30
        L43:
            r1 = r2
        L44:
            return r1
    }

    protected final boolean getHasReceiveOrClosed() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.ReceiveOrClosed
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.selects.SelectClause1<E> getOnReceive() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$onReceive$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$onReceive$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.selects.SelectClause1<kotlinx.coroutines.channels.ChannelResult<E>> getOnReceiveCatching() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$onReceiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$onReceiveCatching$1
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectClause1 r0 = (kotlinx.coroutines.selects.SelectClause1) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public kotlinx.coroutines.selects.SelectClause1<E> getOnReceiveOrNull() {
            r1 = this;
            kotlinx.coroutines.selects.SelectClause1 r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.getOnReceiveOrNull(r1)
            return r0
    }

    protected abstract boolean isBufferAlwaysEmpty();

    protected abstract boolean isBufferEmpty();

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
            r1 = this;
            kotlinx.coroutines.channels.Closed r0 = r1.getClosedForReceive()
            if (r0 == 0) goto Le
            boolean r0 = r1.isBufferEmpty()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
            r1 = this;
            boolean r0 = r1.isEmptyImpl()
            return r0
    }

    protected final boolean isEmptyImpl() {
            r1 = this;
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = r1.getQueue()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.Send
            if (r0 != 0) goto L14
            boolean r0 = r1.isBufferEmpty()
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final kotlinx.coroutines.channels.ChannelIterator<E> iterator() {
            r1 = this;
            kotlinx.coroutines.channels.AbstractChannel$Itr r0 = new kotlinx.coroutines.channels.AbstractChannel$Itr
            r0.<init>(r1)
            kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
            return r0
    }

    protected void onCancelIdempotent(boolean r4) {
            r3 = this;
            kotlinx.coroutines.channels.Closed r4 = r3.getClosedForSend()
            if (r4 == 0) goto L3a
            r0 = 1
            r1 = 0
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m2309constructorimpl$default(r1, r0, r1)
        Lc:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = r4.getPrevNode()
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.LockFreeLinkedListHead
            if (r2 == 0) goto L18
            r3.mo2269onCancelIdempotentListww6eGU(r0, r4)
            return
        L18:
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L29
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.Send
            if (r2 == 0) goto L23
            goto L29
        L23:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L29:
            boolean r2 = r1.mo2317remove()
            if (r2 != 0) goto L33
            r1.helpRemove()
            goto Lc
        L33:
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            java.lang.Object r0 = kotlinx.coroutines.internal.InlineList.m2314plusFjFbRPM(r0, r1)
            goto Lc
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen"
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: onCancelIdempotentList-w-w6eGU, reason: not valid java name */
    protected void mo2269onCancelIdempotentListww6eGU(java.lang.Object r3, kotlinx.coroutines.channels.Closed<?> r4) {
            r2 = this;
            if (r3 == 0) goto L2d
            boolean r0 = r3 instanceof java.util.ArrayList
            if (r0 != 0) goto Lc
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            r3.resumeSendClosed(r4)
            goto L2d
        Lc:
            if (r3 == 0) goto L25
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r0 = r3.size()
            int r0 = r0 + (-1)
        L16:
            r1 = -1
            if (r1 >= r0) goto L2d
            java.lang.Object r1 = r3.get(r0)
            kotlinx.coroutines.channels.Send r1 = (kotlinx.coroutines.channels.Send) r1
            r1.resumeSendClosed(r4)
            int r0 = r0 + (-1)
            goto L16
        L25:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r3.<init>(r4)
            throw r3
        L2d:
            return
    }

    protected void onReceiveDequeued() {
            r0 = this;
            return
    }

    protected void onReceiveEnqueued() {
            r0 = this;
            return
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    public E poll() {
            r1 = this;
            java.lang.Object r0 = kotlinx.coroutines.channels.Channel.DefaultImpls.poll(r1)
            return r0
    }

    protected java.lang.Object pollInternal() {
            r3 = this;
        L0:
            kotlinx.coroutines.channels.Send r0 = r3.takeFirstSendOrPeekClosed()
            if (r0 != 0) goto L9
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            return r0
        L9:
            r1 = 0
            kotlinx.coroutines.internal.Symbol r1 = r0.tryResumeSend(r1)
            if (r1 == 0) goto L29
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L21
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r1 != r2) goto L1b
            goto L21
        L1b:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L21:
            r0.completeResumeSend()
            java.lang.Object r0 = r0.getPollResult()
            return r0
        L29:
            r0.undeliveredElement()
            goto L0
    }

    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r3) {
            r2 = this;
            kotlinx.coroutines.channels.AbstractChannel$TryPollDesc r0 = r2.describeTryPoll()
            r1 = r0
            kotlinx.coroutines.internal.AtomicDesc r1 = (kotlinx.coroutines.internal.AtomicDesc) r1
            java.lang.Object r3 = r3.performAtomicTrySelect(r1)
            if (r3 == 0) goto Le
            return r3
        Le:
            java.lang.Object r3 = r0.getResult()
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            r3.completeResumeSend()
            java.lang.Object r3 = r0.getResult()
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            java.lang.Object r3 = r3.getPollResult()
            return r3
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final java.lang.Object receive(kotlin.coroutines.Continuation<? super E> r3) {
            r2 = this;
            java.lang.Object r0 = r2.pollInternal()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 == r1) goto Ld
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 != 0) goto Ld
            return r0
        Ld:
            r0 = 0
            java.lang.Object r3 = r2.receiveSuspend(r0, r3)
            return r3
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public final java.lang.Object mo2270receiveCatchingJP2dKIU(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelResult<? extends E>> r5) {
            r4 = this;
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            if (r0 == 0) goto L14
            r0 = r5
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = (kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r5 = r0.label
            int r5 = r5 - r2
            r0.label = r5
            goto L19
        L14:
            kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1 r0 = new kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1
            r0.<init>(r4, r5)
        L19:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r5)
            goto L5c
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L32:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.pollInternal()
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r5 == r2) goto L53
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.Closed
            if (r0 == 0) goto L4c
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r5 = (kotlinx.coroutines.channels.Closed) r5
            java.lang.Throwable r5 = r5.closeCause
            java.lang.Object r5 = r0.m2290closedJP2dKIU(r5)
            goto L52
        L4c:
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r5 = r0.m2292successJP2dKIU(r5)
        L52:
            return r5
        L53:
            r0.label = r3
            java.lang.Object r5 = r4.receiveSuspend(r3, r0)
            if (r5 != r1) goto L5c
            return r1
        L5c:
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.m2289unboximpl()
            return r5
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    public java.lang.Object receiveOrNull(kotlin.coroutines.Continuation<? super E> r1) {
            r0 = this;
            java.lang.Object r1 = kotlinx.coroutines.channels.Channel.DefaultImpls.receiveOrNull(r0, r1)
            return r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected kotlinx.coroutines.channels.ReceiveOrClosed<E> takeFirstReceiveOrPeekClosed() {
            r2 = this;
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = super.takeFirstReceiveOrPeekClosed()
            if (r0 == 0) goto Ld
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 != 0) goto Ld
            r2.onReceiveDequeued()
        Ld:
            return r0
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public final java.lang.Object mo2271tryReceivePtdJZtk() {
            r2 = this;
            java.lang.Object r0 = r2.pollInternal()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED
            if (r0 != r1) goto Lf
            kotlinx.coroutines.channels.ChannelResult$Companion r0 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r0.m2291failurePtdJZtk()
            return r0
        Lf:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L1e
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            kotlinx.coroutines.channels.Closed r0 = (kotlinx.coroutines.channels.Closed) r0
            java.lang.Throwable r0 = r0.closeCause
            java.lang.Object r0 = r1.m2290closedJP2dKIU(r0)
            return r0
        L1e:
            kotlinx.coroutines.channels.ChannelResult$Companion r1 = kotlinx.coroutines.channels.ChannelResult.Companion
            java.lang.Object r0 = r1.m2292successJP2dKIU(r0)
            return r0
    }
}
