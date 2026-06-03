package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: LinkedListChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class LinkedListChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    public LinkedListChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferAlwaysEmpty() {
            r1 = this;
            r0 = 1
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
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = super.offerInternal(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto Lb
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r4
        Lb:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r1) goto L1d
            kotlinx.coroutines.channels.ReceiveOrClosed r0 = r3.sendBuffered(r4)
            if (r0 != 0) goto L18
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r4
        L18:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L0
            return r0
        L1d:
            boolean r4 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r4 == 0) goto L22
            return r0
        L22:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid offerInternal result "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r3, kotlinx.coroutines.selects.SelectInstance<?> r4) {
            r2 = this;
        L0:
            boolean r0 = r2.getHasReceiveOrClosed()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = super.offerSelectInternal(r3, r4)
            goto L19
        Lb:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc r0 = r2.describeSendBuffered(r3)
            kotlinx.coroutines.internal.AtomicDesc r0 = (kotlinx.coroutines.internal.AtomicDesc) r0
            java.lang.Object r0 = r4.performAtomicTrySelect(r0)
            if (r0 != 0) goto L19
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
        L19:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L24
            java.lang.Object r3 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            return r3
        L24:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L2b
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r3
        L2b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 == r1) goto L0
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 == r1) goto L0
            boolean r3 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r3 == 0) goto L38
            return r0
        L38:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid result "
            r4.<init>(r1)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: onCancelIdempotentList-w-w6eGU */
    protected void mo2269onCancelIdempotentListww6eGU(java.lang.Object r6, kotlinx.coroutines.channels.Closed<?> r7) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L59
            boolean r1 = r6 instanceof java.util.ArrayList
            if (r1 != 0) goto L22
            kotlinx.coroutines.channels.Send r6 = (kotlinx.coroutines.channels.Send) r6
            boolean r1 = r6 instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered
            if (r1 == 0) goto L1e
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r7 = r5.onUndeliveredElement
            if (r7 == 0) goto L59
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r6 = (kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered) r6
            E r6 = r6.element
            r1 = r0
            kotlinx.coroutines.internal.UndeliveredElementException r1 = (kotlinx.coroutines.internal.UndeliveredElementException) r1
            kotlinx.coroutines.internal.UndeliveredElementException r6 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r7, r6, r0)
            r0 = r6
            goto L59
        L1e:
            r6.resumeSendClosed(r7)
            goto L59
        L22:
            if (r6 == 0) goto L51
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r1 = r6.size()
            int r1 = r1 + (-1)
            r2 = r0
        L2d:
            r3 = -1
            if (r3 >= r1) goto L4f
            java.lang.Object r3 = r6.get(r1)
            kotlinx.coroutines.channels.Send r3 = (kotlinx.coroutines.channels.Send) r3
            boolean r4 = r3 instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered
            if (r4 == 0) goto L49
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r4 = r5.onUndeliveredElement
            if (r4 == 0) goto L47
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r3 = (kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered) r3
            E r3 = r3.element
            kotlinx.coroutines.internal.UndeliveredElementException r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r4, r3, r2)
            goto L4c
        L47:
            r2 = r0
            goto L4c
        L49:
            r3.resumeSendClosed(r7)
        L4c:
            int r1 = r1 + (-1)
            goto L2d
        L4f:
            r0 = r2
            goto L59
        L51:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.String r7 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r6.<init>(r7)
            throw r6
        L59:
            if (r0 != 0) goto L5c
            return
        L5c:
            throw r0
    }
}
