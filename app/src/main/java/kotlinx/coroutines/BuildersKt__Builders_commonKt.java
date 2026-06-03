package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aU\u0010\u0004\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086@ø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u000e\u001a[\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0010\"\u0004\b\u0000\u0010\u0005*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001aF\u0010\u0014\u001a\u0002H\u0005\"\u0004\b\u0000\u0010\u0005*\u00020\u00152)\b\b\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00050\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rH\u0086Jø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001aO\u0010\u0017\u001a\u00020\u0018*\u00020\n2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122'\u0010\b\u001a#\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\t¢\u0006\u0002\b\rø\u0001\u0000¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, d2 = {"RESUMED", "", "SUSPENDED", "UNDECIDED", "withContext", "T", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "async", "Lkotlinx/coroutines/Deferred;", "start", "Lkotlinx/coroutines/CoroutineStart;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Deferred;", "invoke", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "Lkotlinx/coroutines/Job;", "", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/BuildersKt")
final /* synthetic */ class BuildersKt__Builders_commonKt {
    private static final int RESUMED = 2;
    private static final int SUSPENDED = 1;
    private static final int UNDECIDED = 0;

    public static final <T> kotlinx.coroutines.Deferred<T> async(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r4) {
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L12
            kotlinx.coroutines.LazyDeferredCoroutine r2 = new kotlinx.coroutines.LazyDeferredCoroutine
            r2.<init>(r1, r4)
            kotlinx.coroutines.DeferredCoroutine r2 = (kotlinx.coroutines.DeferredCoroutine) r2
            goto L18
        L12:
            kotlinx.coroutines.DeferredCoroutine r2 = new kotlinx.coroutines.DeferredCoroutine
            r0 = 1
            r2.<init>(r1, r0)
        L18:
            r2.start(r3, r2, r4)
            kotlinx.coroutines.Deferred r2 = (kotlinx.coroutines.Deferred) r2
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Deferred async$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Le:
            kotlinx.coroutines.Deferred r0 = kotlinx.coroutines.BuildersKt.async(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object invoke(kotlinx.coroutines.CoroutineDispatcher r0, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super T> r2) {
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            java.lang.Object r0 = kotlinx.coroutines.BuildersKt.withContext(r0, r1, r2)
            return r0
    }

    private static final <T> java.lang.Object invoke$$forInline(kotlinx.coroutines.CoroutineDispatcher r1, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super T> r3) {
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r1, r2, r3)
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }

    public static final kotlinx.coroutines.Job launch(kotlinx.coroutines.CoroutineScope r1, kotlin.coroutines.CoroutineContext r2, kotlinx.coroutines.CoroutineStart r3, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r4) {
            kotlin.coroutines.CoroutineContext r1 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r1, r2)
            boolean r2 = r3.isLazy()
            if (r2 == 0) goto L12
            kotlinx.coroutines.LazyStandaloneCoroutine r2 = new kotlinx.coroutines.LazyStandaloneCoroutine
            r2.<init>(r1, r4)
            kotlinx.coroutines.StandaloneCoroutine r2 = (kotlinx.coroutines.StandaloneCoroutine) r2
            goto L18
        L12:
            kotlinx.coroutines.StandaloneCoroutine r2 = new kotlinx.coroutines.StandaloneCoroutine
            r0 = 1
            r2.<init>(r1, r0)
        L18:
            r2.start(r3, r2, r4)
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            return r2
    }

    public static /* synthetic */ kotlinx.coroutines.Job launch$default(kotlinx.coroutines.CoroutineScope r0, kotlin.coroutines.CoroutineContext r1, kotlinx.coroutines.CoroutineStart r2, kotlin.jvm.functions.Function2 r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r1 = (kotlin.coroutines.CoroutineContext) r1
        L8:
            r4 = r4 & 2
            if (r4 == 0) goto Le
            kotlinx.coroutines.CoroutineStart r2 = kotlinx.coroutines.CoroutineStart.DEFAULT
        Le:
            kotlinx.coroutines.Job r0 = kotlinx.coroutines.BuildersKt.launch(r0, r1, r2, r3)
            return r0
    }

    public static final <T> java.lang.Object withContext(kotlin.coroutines.CoroutineContext r8, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r9, kotlin.coroutines.Continuation<? super T> r10) {
            kotlin.coroutines.CoroutineContext r0 = r10.getContext()
            kotlin.coroutines.CoroutineContext r8 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r0, r8)
            kotlinx.coroutines.JobKt.ensureActive(r8)
            if (r8 != r0) goto L17
            kotlinx.coroutines.internal.ScopeCoroutine r0 = new kotlinx.coroutines.internal.ScopeCoroutine
            r0.<init>(r8, r10)
            java.lang.Object r8 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r0, r0, r9)
            goto L5c
        L17:
            kotlin.coroutines.ContinuationInterceptor$Key r1 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r1 = r8.get(r1)
            kotlin.coroutines.ContinuationInterceptor$Key r2 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r2)
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r0)
            if (r0 == 0) goto L48
            kotlinx.coroutines.UndispatchedCoroutine r0 = new kotlinx.coroutines.UndispatchedCoroutine
            r0.<init>(r8, r10)
            r1 = 0
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r8, r1)
            r2 = r0
            kotlinx.coroutines.internal.ScopeCoroutine r2 = (kotlinx.coroutines.internal.ScopeCoroutine) r2     // Catch: java.lang.Throwable -> L43
            java.lang.Object r9 = kotlinx.coroutines.intrinsics.UndispatchedKt.startUndispatchedOrReturn(r2, r0, r9)     // Catch: java.lang.Throwable -> L43
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r1)
            r8 = r9
            goto L5c
        L43:
            r9 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r8, r1)
            throw r9
        L48:
            kotlinx.coroutines.DispatchedCoroutine r0 = new kotlinx.coroutines.DispatchedCoroutine
            r0.<init>(r8, r10)
            r4 = r0
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r6 = 4
            r7 = 0
            r5 = 0
            r2 = r9
            r3 = r0
            kotlinx.coroutines.intrinsics.CancellableKt.startCoroutineCancellable$default(r2, r3, r4, r5, r6, r7)
            java.lang.Object r8 = r0.getResult()
        L5c:
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L65
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r10)
        L65:
            return r8
    }
}
