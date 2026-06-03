package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
final class ChannelLimitedFlowMerge$collectTo$2$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.internal.SendingCollector<T> $collector;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $flow;
    int label;

    ChannelLimitedFlowMerge$collectTo$2$1(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.flow.internal.SendingCollector<T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1> r3) {
            r0 = this;
            r0.$flow = r1
            r0.$collector = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r3 = new kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1
            kotlinx.coroutines.flow.Flow<T> r0 = r2.$flow
            kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r2.$collector
            r3.<init>(r0, r1, r4)
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            return r3
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1 r1 = (kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2c
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.flow.Flow<T> r5 = r4.$flow
            kotlinx.coroutines.flow.internal.SendingCollector<T> r1 = r4.$collector
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            r3 = r4
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r3)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
