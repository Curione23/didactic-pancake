package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", i = {}, l = {340}, m = "invokeSuspend", n = {}, s = {})
final class FlowKt__ShareKt$launchSharingDeferred$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> $result;
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $upstream;
    private /* synthetic */ java.lang.Object L$0;
    int label;


    FlowKt__ShareKt$launchSharingDeferred$1(kotlinx.coroutines.flow.Flow<? extends T> r1, kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1> r3) {
            r0 = this;
            r0.$upstream = r1
            r0.$result = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r0 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1
            kotlinx.coroutines.flow.Flow<T> r1 = r3.$upstream
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r2 = r3.$result
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
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
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 r1 = (kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1) r1
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
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.throwOnFailure(r7)     // Catch: java.lang.Throwable -> Lf
            goto L3c
        Lf:
            r7 = move-exception
            goto L3f
        L11:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L19:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.Flow<T> r3 = r6.$upstream     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1 r4 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r5 = r6.$result     // Catch: java.lang.Throwable -> Lf
            r4.<init>(r1, r7, r5)     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4     // Catch: java.lang.Throwable -> Lf
            r7 = r6
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Throwable -> Lf
            r6.label = r2     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r7 = r3.collect(r4, r7)     // Catch: java.lang.Throwable -> Lf
            if (r7 != r0) goto L3c
            return r0
        L3c:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L3f:
            kotlinx.coroutines.CompletableDeferred<kotlinx.coroutines.flow.StateFlow<T>> r0 = r6.$result
            r0.completeExceptionally(r7)
            throw r7
    }
}
