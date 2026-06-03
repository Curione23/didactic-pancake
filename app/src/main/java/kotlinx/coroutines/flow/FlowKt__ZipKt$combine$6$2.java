package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", ""}, k = 3, mv = {1, 6, 0}, xi = 176)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2", f = "Zip.kt", i = {}, l = {292, 292}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combine$6$2<R, T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, T[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> $transform;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    int label;

    public FlowKt__ZipKt$combine$6$2(kotlin.jvm.functions.Function2<? super T[], ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2> r2) {
            r0 = this;
            r0.$transform = r1
            r1 = 3
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r1 = r0.invoke(r1, r2, r3)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, T[] r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
            r2 = this;
            kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combine$6$2
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r2.$transform
            r0.<init>(r1, r5)
            r0.L$0 = r3
            r0.L$1 = r4
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            java.lang.Object r3 = r0.invokeSuspend(r3)
            return r3
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r6)
            goto L4a
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            java.lang.Object r1 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3b
        L22:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r6 = r5.L$1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> r4 = r5.$transform
            r5.L$0 = r1
            r5.label = r3
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r0) goto L3b
            return r0
        L3b:
            r3 = r5
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r4 = 0
            r5.L$0 = r4
            r5.label = r2
            java.lang.Object r6 = r1.emit(r6, r3)
            if (r6 != r0) goto L4a
            return r0
        L4a:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
            r3 = this;
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r0 = r3.L$1
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            kotlin.jvm.functions.Function2<T[], kotlin.coroutines.Continuation<? super R>, java.lang.Object> r1 = r3.$transform
            java.lang.Object r0 = r1.invoke(r0, r3)
            r1 = r3
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r2 = 0
            kotlin.jvm.internal.InlineMarker.mark(r2)
            r4.emit(r0, r1)
            r4 = 1
            kotlin.jvm.internal.InlineMarker.mark(r4)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
