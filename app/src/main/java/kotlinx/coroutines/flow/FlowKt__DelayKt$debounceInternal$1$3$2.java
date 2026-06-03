package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u008a@"}, d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", i = {0}, l = {243}, m = "invokeSuspend", n = {"$this$onFailure_u2dWpGqRn0$iv"}, s = {"L$0"})
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.FlowCollector<T> $downstream;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    FlowKt__DelayKt$debounceInternal$1$3$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlinx.coroutines.flow.FlowCollector<? super T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2> r3) {
            r0 = this;
            r0.$lastValue = r1
            r0.$downstream = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.$lastValue
            kotlinx.coroutines.flow.FlowCollector<T> r2 = r3.$downstream
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
            java.lang.Object r1 = r0.m2301invokeWpGqRn0(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m2301invokeWpGqRn0(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r1)
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L53
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ChannelResult r7 = (kotlinx.coroutines.channels.ChannelResult) r7
            java.lang.Object r7 = r7.m2289unboximpl()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.$lastValue
            boolean r3 = r7 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r3 != 0) goto L2e
            r1.element = r7
        L2e:
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.$lastValue
            kotlinx.coroutines.flow.FlowCollector<T> r4 = r6.$downstream
            if (r3 == 0) goto L5a
            java.lang.Throwable r3 = kotlinx.coroutines.channels.ChannelResult.m2281exceptionOrNullimpl(r7)
            if (r3 != 0) goto L59
            T r3 = r1.element
            if (r3 == 0) goto L54
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r5 = r1.element
            if (r5 != r3) goto L45
            r5 = 0
        L45:
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r4.emit(r5, r6)
            if (r7 != r0) goto L52
            return r0
        L52:
            r0 = r1
        L53:
            r1 = r0
        L54:
            kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            r1.element = r7
            goto L5a
        L59:
            throw r3
        L5a:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
