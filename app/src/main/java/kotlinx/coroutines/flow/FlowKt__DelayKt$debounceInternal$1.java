package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;", "downstream", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {222, 355}, m = "invokeSuspend", n = {"downstream", "values", "lastValue", "timeoutMillis", "downstream", "values", "lastValue", "timeoutMillis"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
final class FlowKt__DelayKt$debounceInternal$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<kotlinx.coroutines.CoroutineScope, kotlinx.coroutines.flow.FlowCollector<? super T>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow<T> $this_debounceInternal;
    final /* synthetic */ kotlin.jvm.functions.Function1<T, java.lang.Long> $timeoutMillisSelector;
    private /* synthetic */ java.lang.Object L$0;
    /* synthetic */ java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    FlowKt__DelayKt$debounceInternal$1(kotlin.jvm.functions.Function1<? super T, java.lang.Long> r1, kotlinx.coroutines.flow.Flow<? extends T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1> r3) {
            r0 = this;
            r0.$timeoutMillisSelector = r1
            r0.$this_debounceInternal = r2
            r1 = 3
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r1, java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r0 = this;
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r1 = r0.invoke(r1, r2, r3)
            return r1
    }

    public final java.lang.Object invoke(kotlinx.coroutines.CoroutineScope r4, kotlinx.coroutines.flow.FlowCollector<? super T> r5, kotlin.coroutines.Continuation<? super kotlin.Unit> r6) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1
            kotlin.jvm.functions.Function1<T, java.lang.Long> r1 = r3.$timeoutMillisSelector
            kotlinx.coroutines.flow.Flow<T> r2 = r3.$this_debounceInternal
            r0.<init>(r1, r2, r6)
            r0.L$0 = r4
            r0.L$1 = r5
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r0.invokeSuspend(r4)
            return r4
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.label
            r2 = 2
            r3 = 1
            r4 = 0
            r6 = 0
            if (r1 == 0) goto L45
            if (r1 == r3) goto L30
            if (r1 != r2) goto L28
            java.lang.Object r1 = r14.L$3
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref.LongRef) r1
            java.lang.Object r1 = r14.L$2
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
            java.lang.Object r7 = r14.L$1
            kotlinx.coroutines.channels.ReceiveChannel r7 = (kotlinx.coroutines.channels.ReceiveChannel) r7
            java.lang.Object r8 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r8 = (kotlinx.coroutines.flow.FlowCollector) r8
            kotlin.ResultKt.throwOnFailure(r15)
        L24:
            r9 = r8
            r8 = r7
            r7 = r1
            goto L6a
        L28:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L30:
            java.lang.Object r1 = r14.L$3
            kotlin.jvm.internal.Ref$LongRef r1 = (kotlin.jvm.internal.Ref.LongRef) r1
            java.lang.Object r7 = r14.L$2
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r14.L$1
            kotlinx.coroutines.channels.ReceiveChannel r8 = (kotlinx.coroutines.channels.ReceiveChannel) r8
            java.lang.Object r9 = r14.L$0
            kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
            kotlin.ResultKt.throwOnFailure(r15)
            goto Lb5
        L45:
            kotlin.ResultKt.throwOnFailure(r15)
            java.lang.Object r15 = r14.L$0
            r7 = r15
            kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
            java.lang.Object r15 = r14.L$1
            kotlinx.coroutines.flow.FlowCollector r15 = (kotlinx.coroutines.flow.FlowCollector) r15
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 r1 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1
            kotlinx.coroutines.flow.Flow<T> r8 = r14.$this_debounceInternal
            r1.<init>(r8, r6)
            r10 = r1
            kotlin.jvm.functions.Function2 r10 = (kotlin.jvm.functions.Function2) r10
            r11 = 3
            r12 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.channels.ReceiveChannel r1 = kotlinx.coroutines.channels.ProduceKt.produce$default(r7, r8, r9, r10, r11, r12)
            kotlin.jvm.internal.Ref$ObjectRef r7 = new kotlin.jvm.internal.Ref$ObjectRef
            r7.<init>()
            r9 = r15
            r8 = r1
        L6a:
            T r15 = r7.element
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            if (r15 == r1) goto L127
            kotlin.jvm.internal.Ref$LongRef r1 = new kotlin.jvm.internal.Ref$LongRef
            r1.<init>()
            T r15 = r7.element
            if (r15 == 0) goto Lb7
            kotlin.jvm.functions.Function1<T, java.lang.Long> r15 = r14.$timeoutMillisSelector
            kotlinx.coroutines.internal.Symbol r10 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r11 = r7.element
            if (r11 != r10) goto L82
            r11 = r6
        L82:
            java.lang.Object r15 = r15.invoke(r11)
            java.lang.Number r15 = (java.lang.Number) r15
            long r10 = r15.longValue()
            r1.element = r10
            long r10 = r1.element
            int r15 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r15 < 0) goto Lbc
            long r10 = r1.element
            int r15 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r15 != 0) goto Lb7
            kotlinx.coroutines.internal.Symbol r15 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            T r10 = r7.element
            if (r10 != r15) goto La1
            r10 = r6
        La1:
            r15 = r14
            kotlin.coroutines.Continuation r15 = (kotlin.coroutines.Continuation) r15
            r14.L$0 = r9
            r14.L$1 = r8
            r14.L$2 = r7
            r14.L$3 = r1
            r14.label = r3
            java.lang.Object r15 = r9.emit(r10, r15)
            if (r15 != r0) goto Lb5
            return r0
        Lb5:
            r7.element = r6
        Lb7:
            r15 = r1
            r1 = r7
            r7 = r8
            r8 = r9
            goto Lc8
        Lbc:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Debounce timeout should not be negative"
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        Lc8:
            boolean r9 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r9 == 0) goto Ldf
            T r9 = r1.element
            if (r9 == 0) goto Ldf
            long r9 = r15.element
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto Ld9
            goto Ldf
        Ld9:
            java.lang.AssertionError r15 = new java.lang.AssertionError
            r15.<init>()
            throw r15
        Ldf:
            r14.L$0 = r8
            r14.L$1 = r7
            r14.L$2 = r1
            r14.L$3 = r15
            r14.label = r2
            r9 = r14
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            kotlinx.coroutines.selects.SelectBuilderImpl r10 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r10.<init>(r9)
            r11 = r10
            kotlinx.coroutines.selects.SelectBuilder r11 = (kotlinx.coroutines.selects.SelectBuilder) r11     // Catch: java.lang.Throwable -> L113
            T r12 = r1.element     // Catch: java.lang.Throwable -> L113
            if (r12 == 0) goto L104
            long r12 = r15.element     // Catch: java.lang.Throwable -> L113
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 r15 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1     // Catch: java.lang.Throwable -> L113
            r15.<init>(r8, r1, r6)     // Catch: java.lang.Throwable -> L113
            kotlin.jvm.functions.Function1 r15 = (kotlin.jvm.functions.Function1) r15     // Catch: java.lang.Throwable -> L113
            r11.onTimeout(r12, r15)     // Catch: java.lang.Throwable -> L113
        L104:
            kotlinx.coroutines.selects.SelectClause1 r15 = r7.getOnReceiveCatching()     // Catch: java.lang.Throwable -> L113
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r12 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2     // Catch: java.lang.Throwable -> L113
            r12.<init>(r1, r8, r6)     // Catch: java.lang.Throwable -> L113
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12     // Catch: java.lang.Throwable -> L113
            r11.invoke(r15, r12)     // Catch: java.lang.Throwable -> L113
            goto L117
        L113:
            r15 = move-exception
            r10.handleBuilderException(r15)
        L117:
            java.lang.Object r15 = r10.getResult()
            java.lang.Object r10 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r15 != r10) goto L124
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r9)
        L124:
            if (r15 != r0) goto L24
            return r0
        L127:
            kotlin.Unit r15 = kotlin.Unit.INSTANCE
            return r15
    }
}
