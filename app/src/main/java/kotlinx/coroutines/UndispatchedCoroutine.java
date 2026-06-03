package kotlinx.coroutines;

/* JADX INFO: compiled from: CoroutineContext.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0014J\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bR\"\u0010\b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n0\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "threadStateToRecover", "Ljava/lang/ThreadLocal;", "Lkotlin/Pair;", "", "afterResume", "", "state", "clearThreadContext", "", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class UndispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> threadStateToRecover;

    public UndispatchedCoroutine(kotlin.coroutines.CoroutineContext r2, kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r0 = r2.get(r0)
            if (r0 != 0) goto L13
            kotlinx.coroutines.UndispatchedMarker r0 = kotlinx.coroutines.UndispatchedMarker.INSTANCE
            kotlin.coroutines.CoroutineContext r0 = (kotlin.coroutines.CoroutineContext) r0
            kotlin.coroutines.CoroutineContext r0 = r2.plus(r0)
            goto L14
        L13:
            r0 = r2
        L14:
            r1.<init>(r0, r3)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r1.threadStateToRecover = r0
            kotlin.coroutines.CoroutineContext r3 = r3.getContext()
            kotlin.coroutines.ContinuationInterceptor$Key r0 = kotlin.coroutines.ContinuationInterceptor.Key
            kotlin.coroutines.CoroutineContext$Key r0 = (kotlin.coroutines.CoroutineContext.Key) r0
            kotlin.coroutines.CoroutineContext$Element r3 = r3.get(r0)
            boolean r3 = r3 instanceof kotlinx.coroutines.CoroutineDispatcher
            if (r3 != 0) goto L39
            r3 = 0
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r2, r3)
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r3)
            r1.saveThreadContext(r2, r3)
        L39:
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r6) {
            r5 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r5.threadStateToRecover
            java.lang.Object r0 = r0.get()
            kotlin.Pair r0 = (kotlin.Pair) r0
            r1 = 0
            if (r0 == 0) goto L1d
            java.lang.Object r2 = r0.component1()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            java.lang.Object r0 = r0.component2()
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r0)
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r5.threadStateToRecover
            r0.set(r1)
        L1d:
            kotlin.coroutines.Continuation<T> r0 = r5.uCont
            java.lang.Object r6 = kotlinx.coroutines.CompletionStateKt.recoverResult(r6, r0)
            kotlin.coroutines.Continuation<T> r0 = r5.uCont
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r2, r1)
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r3 == r4) goto L36
            kotlinx.coroutines.UndispatchedCoroutine r1 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r2, r3)
            goto L39
        L36:
            r0 = r1
            kotlinx.coroutines.UndispatchedCoroutine r0 = (kotlinx.coroutines.UndispatchedCoroutine) r0
        L39:
            kotlin.coroutines.Continuation<T> r0 = r5.uCont     // Catch: java.lang.Throwable -> L4c
            r0.resumeWith(r6)     // Catch: java.lang.Throwable -> L4c
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L4c
            if (r1 == 0) goto L48
            boolean r6 = r1.clearThreadContext()
            if (r6 == 0) goto L4b
        L48:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r3)
        L4b:
            return
        L4c:
            r6 = move-exception
            if (r1 == 0) goto L55
            boolean r0 = r1.clearThreadContext()
            if (r0 == 0) goto L58
        L55:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r3)
        L58:
            throw r6
    }

    public final boolean clearThreadContext() {
            r2 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r2.threadStateToRecover
            r1 = 0
            r0.set(r1)
            r0 = 1
            return r0
    }

    public final void saveThreadContext(kotlin.coroutines.CoroutineContext r2, java.lang.Object r3) {
            r1 = this;
            java.lang.ThreadLocal<kotlin.Pair<kotlin.coroutines.CoroutineContext, java.lang.Object>> r0 = r1.threadStateToRecover
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            r0.set(r2)
            return
    }
}
