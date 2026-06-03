package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0014\u0012\u0004\u0012\u0002H\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u0003BM\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012-\u0010\t\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\n¢\u0006\u0002\b\u000fø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0015\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\rH\u0014JV\u0010\u001d\u001a\u00020\r\"\u0004\b\u0001\u0010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u0002H\u001e0 2\u0006\u0010!\u001a\u00028\u00002(\u0010\t\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u001e0\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\nH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\"J\u0019\u0010#\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010$J&\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0&2\u0006\u0010\u001a\u001a\u00028\u0000H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lkotlinx/coroutines/channels/LazyActorCoroutine;", "E", "Lkotlinx/coroutines/channels/ActorCoroutine;", "Lkotlinx/coroutines/selects/SelectClause2;", "Lkotlinx/coroutines/channels/SendChannel;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "channel", "Lkotlinx/coroutines/channels/Channel;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/channels/Channel;Lkotlin/jvm/functions/Function2;)V", "continuation", "onSend", "getOnSend", "()Lkotlinx/coroutines/selects/SelectClause2;", "close", "", "cause", "", "offer", "element", "(Ljava/lang/Object;)Z", "onStart", "registerSelectClause2", "R", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "param", "(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "send", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trySend", "Lkotlinx/coroutines/channels/ChannelResult;", "trySend-JP2dKIU", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class LazyActorCoroutine<E> extends kotlinx.coroutines.channels.ActorCoroutine<E> implements kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<? super E>> {
    private kotlin.coroutines.Continuation<? super kotlin.Unit> continuation;

    public LazyActorCoroutine(kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.channels.Channel<E> r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ActorScope<E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.createCoroutineUnintercepted(r4, r1, r2)
            r1.continuation = r2
            return
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public boolean close(java.lang.Throwable r1) {
            r0 = this;
            boolean r1 = super.close(r1)
            r0.start()
            return r1
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public kotlinx.coroutines.selects.SelectClause2<E, kotlinx.coroutines.channels.SendChannel<E>> getOnSend() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectClause2 r0 = (kotlinx.coroutines.selects.SelectClause2) r0
            return r0
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public boolean offer(E r1) {
            r0 = this;
            r0.start()
            boolean r1 = super.offer(r1)
            return r1
    }

    @Override // kotlinx.coroutines.JobSupport
    protected void onStart() {
            r2 = this;
            kotlin.coroutines.Continuation<? super kotlin.Unit> r0 = r2.continuation
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable(r0, r1)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectClause2
    public <R> void registerSelectClause2(kotlinx.coroutines.selects.SelectInstance<? super R> r2, E r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.SendChannel<? super E>, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r1 = this;
            r1.start()
            kotlinx.coroutines.selects.SelectClause2 r0 = super.getOnSend()
            r0.registerSelectClause2(r2, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    public java.lang.Object send(E r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            r0.start()
            java.lang.Object r1 = super.send(r1, r2)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Le
            return r1
        Le:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    @Override // kotlinx.coroutines.channels.ChannelCoroutine, kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public java.lang.Object mo2272trySendJP2dKIU(E r1) {
            r0 = this;
            r0.start()
            java.lang.Object r1 = super.mo2272trySendJP2dKIU(r1)
            return r1
    }
}
