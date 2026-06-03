package kotlinx.coroutines.channels;

/* JADX INFO: Add missing generic type declarations: [R, E] */
/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\b\u0004\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0006\b\u0001\u0010\u0002 \u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "R", "E", "it", "Lkotlinx/coroutines/channels/ChannelResult;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1", f = "Channel.kt", i = {}, l = {375}, m = "invokeSuspend", n = {}, s = {})
final class ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1<E, R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends E>, kotlin.coroutines.Continuation<? super R>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> $block;
    /* synthetic */ java.lang.Object L$0;
    int label;

    ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1(kotlin.jvm.functions.Function2<? super E, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1> r2) {
            r0 = this;
            r0.$block = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 r0 = new kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1
            kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$block
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.m2289unboximpl()
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.m2293invokeWpGqRn0(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m2293invokeWpGqRn0(java.lang.Object r1, kotlin.coroutines.Continuation<? super R> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m2277boximpl(r1)
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1 r1 = (kotlinx.coroutines.channels.ReceiveChannel$onReceiveOrNull$1$registerSelectClause1$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r4)
            goto L37
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.channels.ChannelResult r4 = (kotlinx.coroutines.channels.ChannelResult) r4
            java.lang.Object r4 = r4.m2289unboximpl()
            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m2281exceptionOrNullimpl(r4)
            if (r1 != 0) goto L38
            kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r3.$block
            java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m2282getOrNullimpl(r4)
            r3.label = r2
            java.lang.Object r4 = r1.invoke(r4, r3)
            if (r4 != r0) goto L37
            return r0
        L37:
            return r4
        L38:
            throw r1
    }
}
