package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Channels.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final /* synthetic */ java.lang.Object access$emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector r0, kotlinx.coroutines.channels.ReceiveChannel r1, boolean r2, kotlin.coroutines.Continuation r3) {
            java.lang.Object r0 = emitAllImpl$FlowKt__ChannelsKt(r0, r1, r2, r3)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> kotlinx.coroutines.flow.Flow<T> asFlow(kotlinx.coroutines.channels.BroadcastChannel<T> r1) {
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1
            r0.<init>(r1)
            kotlinx.coroutines.flow.Flow r0 = (kotlinx.coroutines.flow.Flow) r0
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> consumeAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r9) {
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            r6 = 28
            r7 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            return r8
    }

    public static final <T> java.lang.Object emitAll(kotlinx.coroutines.flow.FlowCollector<? super T> r1, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = 1
            java.lang.Object r1 = emitAllImpl$FlowKt__ChannelsKt(r1, r2, r0, r3)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto Lc
            return r1
        Lc:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }

    private static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L19:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L59
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L57
        L37:
            r6 = r9
            r9 = r7
            r7 = r6
            goto L5f
        L3b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L43:
            boolean r7 = r0.Z$0
            java.lang.Object r8 = r0.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L57
            kotlinx.coroutines.channels.ChannelResult r10 = (kotlinx.coroutines.channels.ChannelResult) r10     // Catch: java.lang.Throwable -> L57
            java.lang.Object r10 = r10.m2289unboximpl()     // Catch: java.lang.Throwable -> L57
            goto L71
        L57:
            r9 = move-exception
            goto L9d
        L59:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.flow.FlowKt.ensureActive(r7)
        L5f:
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L99
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L99
            r0.Z$0 = r9     // Catch: java.lang.Throwable -> L99
            r0.label = r4     // Catch: java.lang.Throwable -> L99
            java.lang.Object r10 = r8.mo2270receiveCatchingJP2dKIU(r0)     // Catch: java.lang.Throwable -> L99
            if (r10 != r1) goto L6e
            return r1
        L6e:
            r6 = r9
            r9 = r7
            r7 = r6
        L71:
            boolean r2 = kotlinx.coroutines.channels.ChannelResult.m2285isClosedimpl(r10)     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L86
            java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m2281exceptionOrNullimpl(r10)     // Catch: java.lang.Throwable -> L57
            if (r9 != 0) goto L85
            if (r7 == 0) goto L82
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r5)
        L82:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L85:
            throw r9     // Catch: java.lang.Throwable -> L57
        L86:
            java.lang.Object r10 = kotlinx.coroutines.channels.ChannelResult.m2283getOrThrowimpl(r10)     // Catch: java.lang.Throwable -> L57
            r0.L$0 = r9     // Catch: java.lang.Throwable -> L57
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L57
            r0.Z$0 = r7     // Catch: java.lang.Throwable -> L57
            r0.label = r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r10 = r9.emit(r10, r0)     // Catch: java.lang.Throwable -> L57
            if (r10 != r1) goto L37
            return r1
        L99:
            r7 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
        L9d:
            throw r9     // Catch: java.lang.Throwable -> L9e
        L9e:
            r10 = move-exception
            if (r7 == 0) goto La4
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r8, r9)
        La4:
            throw r10
    }

    public static final <T> kotlinx.coroutines.channels.ReceiveChannel<T> produceIn(kotlinx.coroutines.flow.Flow<? extends T> r0, kotlinx.coroutines.CoroutineScope r1) {
            kotlinx.coroutines.flow.internal.ChannelFlow r0 = kotlinx.coroutines.flow.internal.ChannelFlowKt.asChannelFlow(r0)
            kotlinx.coroutines.channels.ReceiveChannel r0 = r0.produceImpl(r1)
            return r0
    }

    public static final <T> kotlinx.coroutines.flow.Flow<T> receiveAsFlow(kotlinx.coroutines.channels.ReceiveChannel<? extends T> r9) {
            kotlinx.coroutines.flow.ChannelAsFlow r8 = new kotlinx.coroutines.flow.ChannelAsFlow
            r6 = 28
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.flow.Flow r8 = (kotlinx.coroutines.flow.Flow) r8
            return r8
    }
}
