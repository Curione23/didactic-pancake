package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: Zip.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H\u008a@¨\u0006\u0005"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3", f = "Zip.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
public final class FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3<R> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.FlowCollector<? super R>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow[] $flows;
    final /* synthetic */ kotlin.jvm.functions.Function5 $transform$inlined;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: Zip.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u008a@¨\u0006\u0007"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__ZipKt$combineTransformUnsafe$1$1"}, k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1", f = "Zip.kt", i = {}, l = {333}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.flow.FlowCollector<? super R>, java.lang.Object[], kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function5 $transform$inlined;
        private /* synthetic */ java.lang.Object L$0;
        /* synthetic */ java.lang.Object L$1;
        int label;

        public AnonymousClass1(kotlin.coroutines.Continuation r1, kotlin.jvm.functions.Function5 r2) {
                r0 = this;
                r0.$transform$inlined = r2
                r2 = 3
                r0.<init>(r2, r1)
                return
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object[] r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r0 = this;
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object[] r2 = (java.lang.Object[]) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r1 = r0.invoke(r1, r2, r3)
                return r1
        }

        public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r3, java.lang.Object[] r4, kotlin.coroutines.Continuation<? super kotlin.Unit> r5) {
                r2 = this;
                kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1
                kotlin.jvm.functions.Function5 r1 = r2.$transform$inlined
                r0.<init>(r5, r1)
                r0.L$0 = r3
                r0.L$1 = r4
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                java.lang.Object r3 = r0.invokeSuspend(r3)
                return r3
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.throwOnFailure(r10)
                goto L42
            Lf:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L17:
                kotlin.ResultKt.throwOnFailure(r10)
                java.lang.Object r10 = r9.L$0
                r4 = r10
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                java.lang.Object r10 = r9.L$1
                java.lang.Object[] r10 = (java.lang.Object[]) r10
                r1 = r9
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                kotlin.jvm.functions.Function5 r3 = r9.$transform$inlined
                r1 = 0
                r5 = r10[r1]
                r6 = r10[r2]
                r1 = 2
                r7 = r10[r1]
                r9.label = r2
                r10 = 6
                kotlin.jvm.internal.InlineMarker.mark(r10)
                r8 = r9
                java.lang.Object r10 = r3.invoke(r4, r5, r6, r7, r8)
                r1 = 7
                kotlin.jvm.internal.InlineMarker.mark(r1)
                if (r10 != r0) goto L42
                return r0
            L42:
                kotlin.Unit r10 = kotlin.Unit.INSTANCE
                return r10
        }
    }

    public FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(kotlinx.coroutines.flow.Flow[] r1, kotlin.coroutines.Continuation r2, kotlin.jvm.functions.Function5 r3) {
            r0 = this;
            r0.$flows = r1
            r0.$transform$inlined = r3
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 r0 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3
            kotlinx.coroutines.flow.Flow[] r1 = r3.$flows
            kotlin.jvm.functions.Function5 r2 = r3.$transform$inlined
            r0.<init>(r1, r5, r2)
            r0.L$0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.flow.FlowCollector<? super R> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3 r1 = (kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r8)
            goto L3a
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.Object r8 = r7.L$0
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            kotlinx.coroutines.flow.Flow[] r1 = r7.$flows
            kotlin.jvm.functions.Function0 r3 = kotlinx.coroutines.flow.FlowKt__ZipKt.access$nullArrayFactory()
            kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1 r4 = new kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3$1
            r5 = 0
            kotlin.jvm.functions.Function5 r6 = r7.$transform$inlined
            r4.<init>(r5, r6)
            kotlin.jvm.functions.Function3 r4 = (kotlin.jvm.functions.Function3) r4
            r5 = r7
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r7.label = r2
            java.lang.Object r8 = kotlinx.coroutines.flow.internal.CombineKt.combineInternal(r8, r1, r3, r4, r5)
            if (r8 != r0) goto L3a
            return r0
        L3a:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
