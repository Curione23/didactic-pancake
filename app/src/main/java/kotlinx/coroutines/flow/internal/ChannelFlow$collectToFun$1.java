package kotlinx.coroutines.flow.internal;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: ChannelFlow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "it", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
final class ChannelFlow$collectToFun$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ProducerScope<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlow<T> this$0;

    ChannelFlow$collectToFun$1(kotlinx.coroutines.flow.internal.ChannelFlow<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1
            kotlinx.coroutines.flow.internal.ChannelFlow<T> r1 = r2.this$0
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

    public final java.lang.Object invoke(kotlinx.coroutines.channels.ProducerScope<? super T> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1 r1 = (kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1) r1
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
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ProducerScope r5 = (kotlinx.coroutines.channels.ProducerScope) r5
            kotlinx.coroutines.flow.internal.ChannelFlow<T> r1 = r4.this$0
            r3 = r4
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4.label = r2
            java.lang.Object r5 = r1.collectTo(r5, r3)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
