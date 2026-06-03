package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "result", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__DelayKt$sample$2$1$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    final /* synthetic */ kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> $ticker;
    /* synthetic */ java.lang.Object L$0;
    int label;

    FlowKt__DelayKt$sample$2$1$1(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1> r3) {
            r0 = this;
            r0.$lastValue = r1
            r0.$ticker = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.$lastValue
            kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r2 = r3.$ticker
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.m2289unboximpl()
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.m2302invokeWpGqRn0(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m2302invokeWpGqRn0(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r1)
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r3.label
            if (r0 != 0) goto L39
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.channels.ChannelResult r4 = (kotlinx.coroutines.channels.ChannelResult) r4
            java.lang.Object r4 = r4.m2289unboximpl()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r0 = r3.$lastValue
            boolean r1 = r4 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r1 != 0) goto L1a
            r0.element = r4
        L1a:
            kotlinx.coroutines.channels.ReceiveChannel<kotlin.Unit> r0 = r3.$ticker
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r2 = r3.$lastValue
            if (r1 == 0) goto L36
            java.lang.Throwable r4 = kotlinx.coroutines.channels.ChannelResult.m2281exceptionOrNullimpl(r4)
            if (r4 != 0) goto L35
            kotlinx.coroutines.flow.internal.ChildCancelledException r4 = new kotlinx.coroutines.flow.internal.ChildCancelledException
            r4.<init>()
            java.util.concurrent.CancellationException r4 = (java.util.concurrent.CancellationException) r4
            r0.cancel(r4)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            r2.element = r4
            goto L36
        L35:
            throw r4
        L36:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L39:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
    }
}
