package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: ConflatedChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0016\u0010\u0018\u001a\u00020\r2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0014J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u001dJ!\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00028\u00002\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\rH\u0014J\n\u0010$\u001a\u0004\u0018\u00010\u0017H\u0014J\u0016\u0010%\u001a\u0004\u0018\u00010\u00172\n\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030 H\u0014J\u0014\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0012\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lkotlinx/coroutines/channels/ConflatedChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "bufferDebugString", "", "getBufferDebugString", "()Ljava/lang/String;", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "isEmpty", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "Lkotlinx/coroutines/internal/ReentrantLock;", "value", "", "enqueueReceiveInternal", "receive", "Lkotlinx/coroutines/channels/Receive;", "offerInternal", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotent", "wasClosed", "pollInternal", "pollSelectInternal", "updateValueLocked", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class ConflatedChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    private final java.util.concurrent.locks.ReentrantLock lock;
    private java.lang.Object value;

    public ConflatedChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r1.<init>()
            r0.lock = r1
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r0.value = r1
            return
    }

    private final kotlinx.coroutines.internal.UndeliveredElementException updateValueLocked(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.value
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY
            r2 = 0
            if (r0 != r1) goto L8
            goto L11
        L8:
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r1 = r4.onUndeliveredElement
            if (r1 == 0) goto L11
            r3 = 2
            kotlinx.coroutines.internal.UndeliveredElementException r2 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(r1, r0, r2, r3, r2)
        L11:
            r4.value = r5
            return r2
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
    protected java.lang.String getBufferDebugString() {
            r3 = this;
            java.lang.String r0 = "(value="
            java.util.concurrent.locks.ReentrantLock r1 = r3.lock
            java.util.concurrent.locks.Lock r1 = (java.util.concurrent.locks.Lock) r1
            r1.lock()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L22
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r3.value     // Catch: java.lang.Throwable -> L22
            java.lang.StringBuilder r0 = r2.append(r0)     // Catch: java.lang.Throwable -> L22
            r2 = 41
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L22
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L22
            r1.unlock()
            return r0
        L22:
            r0 = move-exception
            r1.unlock()
            throw r0
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
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L14
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L14
            if (r1 != r2) goto Lf
            r1 = 1
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.unlock()
            return r1
        L14:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
            r1 = this;
            r0 = 0
            return r0
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
    protected java.lang.Object offerInternal(E r5) {
            r4 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r4.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r4.getClosedForSend()     // Catch: java.lang.Throwable -> L5b
            if (r1 == 0) goto L11
            r0.unlock()
            return r1
        L11:
            java.lang.Object r1 = r4.value     // Catch: java.lang.Throwable -> L5b
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L5b
            if (r1 != r2) goto L4e
        L17:
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = r4.takeFirstReceiveOrPeekClosed()     // Catch: java.lang.Throwable -> L5b
            if (r1 != 0) goto L1e
            goto L4e
        L1e:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L26
            r0.unlock()
            return r1
        L26:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)     // Catch: java.lang.Throwable -> L5b
            r2 = 0
            kotlinx.coroutines.internal.Symbol r2 = r1.tryResumeReceive(r5, r2)     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L17
            boolean r3 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L41
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN     // Catch: java.lang.Throwable -> L5b
            if (r2 != r3) goto L3b
            goto L41
        L3b:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L5b
            r5.<init>()     // Catch: java.lang.Throwable -> L5b
            throw r5     // Catch: java.lang.Throwable -> L5b
        L41:
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5b
            r0.unlock()
            r1.completeResumeReceive(r5)
            java.lang.Object r5 = r1.getOfferResult()
            return r5
        L4e:
            kotlinx.coroutines.internal.UndeliveredElementException r5 = r4.updateValueLocked(r5)     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L5a
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L5b
            r0.unlock()
            return r5
        L5a:
            throw r5     // Catch: java.lang.Throwable -> L5b
        L5b:
            r5 = move-exception
            r0.unlock()
            throw r5
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r4, kotlinx.coroutines.selects.SelectInstance<?> r5) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            kotlinx.coroutines.channels.Closed r1 = r3.getClosedForSend()     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L11
            r0.unlock()
            return r1
        L11:
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L89
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L89
            if (r1 != r2) goto L6e
        L17:
            kotlinx.coroutines.channels.AbstractSendChannel$TryOfferDesc r1 = r3.describeTryOffer(r4)     // Catch: java.lang.Throwable -> L89
            r2 = r1
            kotlinx.coroutines.internal.AtomicDesc r2 = (kotlinx.coroutines.internal.AtomicDesc) r2     // Catch: java.lang.Throwable -> L89
            java.lang.Object r2 = r5.performAtomicTrySelect(r2)     // Catch: java.lang.Throwable -> L89
            if (r2 != 0) goto L3a
            java.lang.Object r5 = r1.getResult()     // Catch: java.lang.Throwable -> L89
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L89
            r0.unlock()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            kotlinx.coroutines.channels.ReceiveOrClosed r5 = (kotlinx.coroutines.channels.ReceiveOrClosed) r5
            r5.completeResumeReceive(r4)
            java.lang.Object r4 = r5.getOfferResult()
            return r4
        L3a:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED     // Catch: java.lang.Throwable -> L89
            if (r2 == r1) goto L6e
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC     // Catch: java.lang.Throwable -> L89
            if (r2 == r1) goto L17
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L89
            if (r2 == r4) goto L6a
            boolean r4 = r2 instanceof kotlinx.coroutines.channels.Closed     // Catch: java.lang.Throwable -> L89
            if (r4 == 0) goto L4d
            goto L6a
        L4d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89
            r5.<init>()     // Catch: java.lang.Throwable -> L89
            java.lang.String r1 = "performAtomicTrySelect(describeTryOffer) returned "
            java.lang.StringBuilder r5 = r5.append(r1)     // Catch: java.lang.Throwable -> L89
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L89
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L89
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L89
            throw r4     // Catch: java.lang.Throwable -> L89
        L6a:
            r0.unlock()
            return r2
        L6e:
            boolean r5 = r5.trySelect()     // Catch: java.lang.Throwable -> L89
            if (r5 != 0) goto L7c
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L89
            r0.unlock()
            return r4
        L7c:
            kotlinx.coroutines.internal.UndeliveredElementException r4 = r3.updateValueLocked(r4)     // Catch: java.lang.Throwable -> L89
            if (r4 != 0) goto L88
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS     // Catch: java.lang.Throwable -> L89
            r0.unlock()
            return r4
        L88:
            throw r4     // Catch: java.lang.Throwable -> L89
        L89:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected void onCancelIdempotent(boolean r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L19
            kotlinx.coroutines.internal.UndeliveredElementException r1 = r3.updateValueLocked(r1)     // Catch: java.lang.Throwable -> L19
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L19
            r0.unlock()
            super.onCancelIdempotent(r4)
            if (r1 != 0) goto L18
            return
        L18:
            throw r1
        L19:
            r4 = move-exception
            r0.unlock()
            throw r4
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollInternal() {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L25
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L25
            if (r1 != r2) goto L19
            kotlinx.coroutines.channels.Closed r1 = r3.getClosedForSend()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L15
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L25
        L15:
            r0.unlock()
            return r1
        L19:
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L25
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L25
            r3.value = r2     // Catch: java.lang.Throwable -> L25
            kotlin.Unit r2 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L25
            r0.unlock()
            return r1
        L25:
            r1 = move-exception
            r0.unlock()
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected java.lang.Object pollSelectInternal(kotlinx.coroutines.selects.SelectInstance<?> r4) {
            r3 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r3.lock
            java.util.concurrent.locks.Lock r0 = (java.util.concurrent.locks.Lock) r0
            r0.lock()
            java.lang.Object r1 = r3.value     // Catch: java.lang.Throwable -> L33
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L33
            if (r1 != r2) goto L19
            kotlinx.coroutines.channels.Closed r4 = r3.getClosedForSend()     // Catch: java.lang.Throwable -> L33
            if (r4 != 0) goto L15
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.channels.AbstractChannelKt.POLL_FAILED     // Catch: java.lang.Throwable -> L33
        L15:
            r0.unlock()
            return r4
        L19:
            boolean r4 = r4.trySelect()     // Catch: java.lang.Throwable -> L33
            if (r4 != 0) goto L27
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()     // Catch: java.lang.Throwable -> L33
            r0.unlock()
            return r4
        L27:
            java.lang.Object r4 = r3.value     // Catch: java.lang.Throwable -> L33
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.EMPTY     // Catch: java.lang.Throwable -> L33
            r3.value = r1     // Catch: java.lang.Throwable -> L33
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L33
            r0.unlock()
            return r4
        L33:
            r4 = move-exception
            r0.unlock()
            throw r4
    }
}
