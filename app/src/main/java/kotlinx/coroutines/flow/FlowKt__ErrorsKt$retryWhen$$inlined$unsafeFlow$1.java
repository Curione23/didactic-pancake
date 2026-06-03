package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements kotlinx.coroutines.flow.Flow<T> {
    final /* synthetic */ kotlin.jvm.functions.Function4 $predicate$inlined;
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_retryWhen$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SafeCollector.common.kt */
    @kotlin.Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {117, 119}, m = "collect", n = {"this", "$this$retryWhen_u24lambda_u2d2", "attempt", "shallRetry", "this", "$this$retryWhen_u24lambda_u2d2", "cause", "attempt"}, s = {"L$0", "L$1", "J$0", "I$0", "L$0", "L$1", "L$2", "J$0"})
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        long J$0;
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;
        final /* synthetic */ kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 this$0;

        public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r1, kotlin.coroutines.Continuation r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r3 = r2.label
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r3 | r0
                r2.label = r3
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r3 = r2.this$0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r3 = r3.collect(r0, r1)
                return r3
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function4 r2) {
            r0 = this;
            r0.$this_retryWhen$inlined = r1
            r0.$predicate$inlined = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
            r11 = this;
            boolean r0 = r13 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L14
            r0 = r13
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r13 = r0.label
            int r13 = r13 - r2
            r0.label = r13
            goto L19
        L14:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r11, r13)
        L19:
            java.lang.Object r13 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L53
            if (r2 == r4) goto L43
            if (r2 != r3) goto L3b
            long r5 = r0.J$0
            java.lang.Object r12 = r0.L$2
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.ResultKt.throwOnFailure(r13)
            goto L9e
        L3b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L43:
            int r12 = r0.I$0
            long r5 = r0.J$0
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.ResultKt.throwOnFailure(r13)
            goto L78
        L53:
            kotlin.ResultKt.throwOnFailure(r13)
            r13 = r0
            kotlin.coroutines.Continuation r13 = (kotlin.coroutines.Continuation) r13
            r5 = 0
            r13 = r11
        L5c:
            kotlinx.coroutines.flow.Flow r2 = r13.$this_retryWhen$inlined
            r0.L$0 = r13
            r0.L$1 = r12
            r7 = 0
            r0.L$2 = r7
            r0.J$0 = r5
            r7 = 0
            r0.I$0 = r7
            r0.label = r4
            java.lang.Object r2 = kotlinx.coroutines.flow.FlowKt.catchImpl(r2, r12, r0)
            if (r2 != r1) goto L73
            return r1
        L73:
            r10 = r2
            r2 = r12
            r12 = r7
            r7 = r13
            r13 = r10
        L78:
            java.lang.Throwable r13 = (java.lang.Throwable) r13
            if (r13 == 0) goto Lac
            kotlin.jvm.functions.Function4 r12 = r7.$predicate$inlined
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r5)
            r0.L$0 = r7
            r0.L$1 = r2
            r0.L$2 = r13
            r0.J$0 = r5
            r0.label = r3
            r9 = 6
            kotlin.jvm.internal.InlineMarker.mark(r9)
            java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
            r8 = 7
            kotlin.jvm.internal.InlineMarker.mark(r8)
            if (r12 != r1) goto L9b
            return r1
        L9b:
            r10 = r13
            r13 = r12
            r12 = r10
        L9e:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto Lab
            r12 = 1
            long r5 = r5 + r12
            r12 = r4
            goto Lac
        Lab:
            throw r12
        Lac:
            r13 = r7
            if (r12 != 0) goto Lb2
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        Lb2:
            r12 = r2
            goto L5c
    }
}
