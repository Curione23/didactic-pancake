package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Broadcast.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u009e\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112/\b\u0001\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a2\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"broadcast", "Lkotlinx/coroutines/channels/BroadcastChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ProducerScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/BroadcastChannel;", "Lkotlinx/coroutines/channels/ReceiveChannel;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class BroadcastKt {


    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BroadcastKt$broadcast$2, reason: invalid class name */
    /* JADX INFO: compiled from: Broadcast.kt */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "E", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.BroadcastKt$broadcast$2", f = "Broadcast.kt", i = {0, 1}, l = {53, 54}, m = "invokeSuspend", n = {"$this$broadcast", "$this$broadcast"}, s = {"L$0", "L$0"})
    static final class AnonymousClass2<E> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<E> $this_broadcast;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        int label;

        AnonymousClass2(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2> r2) {
                r0 = this;
                r0.$this_broadcast = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                kotlinx.coroutines.channels.BroadcastKt$broadcast$2 r0 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$2
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r2.$this_broadcast
                r0.<init>(r1, r4)
                r0.L$0 = r3
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
                kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super E> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                kotlinx.coroutines.channels.BroadcastKt$broadcast$2 r1 = (kotlinx.coroutines.channels.BroadcastKt.AnonymousClass2) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2f
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r8)
            L19:
                r8 = r4
                goto L3c
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                java.lang.Object r1 = r7.L$1
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r4 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
                kotlin.ResultKt.throwOnFailure(r8)
                goto L4f
            L2f:
                kotlin.ResultKt.throwOnFailure(r8)
                java.lang.Object r8 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
                kotlinx.coroutines.channels.ReceiveChannel<E> r1 = r7.$this_broadcast
                kotlinx.coroutines.channels.ChannelIterator r1 = r1.iterator()
            L3c:
                r4 = r7
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r7.L$0 = r8
                r7.L$1 = r1
                r7.label = r3
                java.lang.Object r4 = r1.hasNext(r4)
                if (r4 != r0) goto L4c
                return r0
            L4c:
                r6 = r4
                r4 = r8
                r8 = r6
            L4f:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 == 0) goto L6b
                java.lang.Object r8 = r1.next()
                r5 = r7
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r2
                java.lang.Object r8 = r4.send(r8, r5)
                if (r8 != r0) goto L19
                return r0
            L6b:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }
    }

    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2, int r3, kotlinx.coroutines.CoroutineStart r4, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r5, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ProducerScope<? super E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r6) {
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r1, r2)
            kotlinx.coroutines.channels.BroadcastChannel r2 = kotlinx.coroutines.channels.BroadcastChannelKt.BroadcastChannel(r3)
            boolean r3 = r4.isLazy()
            if (r3 == 0) goto L16
            kotlinx.coroutines.channels.LazyBroadcastCoroutine r3 = new kotlinx.coroutines.channels.LazyBroadcastCoroutine
            r3.<init>(r1, r2, r6)
            kotlinx.coroutines.channels.BroadcastCoroutine r3 = (kotlinx.coroutines.channels.BroadcastCoroutine) r3
            goto L1c
        L16:
            kotlinx.coroutines.channels.BroadcastCoroutine r3 = new kotlinx.coroutines.channels.BroadcastCoroutine
            r0 = 1
            r3.<init>(r1, r2, r0)
        L1c:
            if (r5 == 0) goto L21
            r3.invokeOnCompletion(r5)
        L21:
            r3.start(r4, r3, r6)
            kotlinx.coroutines.channels.BroadcastChannel r3 = (kotlinx.coroutines.channels.BroadcastChannel) r3
            return r3
    }

    public static final <E> kotlinx.coroutines.channels.BroadcastChannel<E> broadcast(kotlinx.coroutines.channels.ReceiveChannel<? extends E> r11, int r12, kotlinx.coroutines.CoroutineStart r13) {
            kotlinx.coroutines.GlobalScope r0 = kotlinx.coroutines.GlobalScope.INSTANCE
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            kotlinx.coroutines.CoroutineDispatcher r1 = kotlinx.coroutines.Dispatchers.getUnconfined()
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            kotlinx.coroutines.CoroutineScope r0 = kotlinx.coroutines.CoroutineScopeKt.plus(r0, r1)
            kotlinx.coroutines.CoroutineExceptionHandler$Key r1 = kotlinx.coroutines.CoroutineExceptionHandler.Key
            kotlinx.coroutines.channels.BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1 r2 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$$inlined$CoroutineExceptionHandler$1
            r2.<init>(r1)
            kotlinx.coroutines.CoroutineExceptionHandler r2 = (kotlinx.coroutines.CoroutineExceptionHandler) r2
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            kotlinx.coroutines.CoroutineScope r3 = kotlinx.coroutines.CoroutineScopeKt.plus(r0, r2)
            kotlinx.coroutines.channels.BroadcastKt$broadcast$1 r0 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$1
            r0.<init>(r11)
            r7 = r0
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            kotlinx.coroutines.channels.BroadcastKt$broadcast$2 r0 = new kotlinx.coroutines.channels.BroadcastKt$broadcast$2
            r1 = 0
            r0.<init>(r11, r1)
            r8 = r0
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            r9 = 1
            r10 = 0
            r4 = 0
            r5 = r12
            r6 = r13
            kotlinx.coroutines.channels.BroadcastChannel r11 = broadcast$default(r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
    }

    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.CoroutineScope r6, kotlin.coroutines.CoroutineContext r7, int r8, kotlinx.coroutines.CoroutineStart r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function2 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
        L8:
            r1 = r7
            r7 = r12 & 2
            if (r7 == 0) goto Le
            r8 = 1
        Le:
            r2 = r8
            r7 = r12 & 4
            if (r7 == 0) goto L15
            kotlinx.coroutines.CoroutineStart r9 = kotlinx.coroutines.CoroutineStart.LAZY
        L15:
            r3 = r9
            r7 = r12 & 8
            if (r7 == 0) goto L1b
            r10 = 0
        L1b:
            r4 = r10
            r0 = r6
            r5 = r11
            kotlinx.coroutines.channels.BroadcastChannel r6 = broadcast(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static /* synthetic */ kotlinx.coroutines.channels.BroadcastChannel broadcast$default(kotlinx.coroutines.channels.ReceiveChannel r0, int r1, kotlinx.coroutines.CoroutineStart r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 1
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.LAZY
        Lb:
            kotlinx.coroutines.channels.BroadcastChannel r0 = broadcast(r0, r1, r2)
            return r0
    }
}
