package kotlinx.coroutines;

/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0015B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "state", "", "afterCompletion", "(Ljava/lang/Object;)V", "afterResume", "getResult", "()Ljava/lang/Object;", "", "tryResume", "()Z", "trySuspend", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/ScopeCoroutine;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DispatchedCoroutine<T> extends kotlinx.coroutines.internal.ScopeCoroutine<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater _decision$FU = null;
    private volatile /* synthetic */ int _decision;

    static {
            java.lang.Class<kotlinx.coroutines.DispatchedCoroutine> r0 = kotlinx.coroutines.DispatchedCoroutine.class
            java.lang.String r1 = "_decision"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.DispatchedCoroutine._decision$FU = r0
            return
    }

    public DispatchedCoroutine(kotlin.coroutines.CoroutineContext r1, kotlin.coroutines.Continuation<? super T> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0._decision = r1
            return
    }

    private final boolean tryResume() {
            r4 = this;
        L0:
            int r0 = r4._decision
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.DispatchedCoroutine._decision$FU
            r3 = 2
            boolean r0 = r0.compareAndSet(r4, r1, r3)
            if (r0 == 0) goto L0
            return r2
    }

    private final boolean trySuspend() {
            r3 = this;
        L0:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L15
            r2 = 2
            if (r0 != r2) goto L9
            return r1
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.DispatchedCoroutine._decision$FU
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L0
            return r2
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.JobSupport
    protected void afterCompletion(java.lang.Object r1) {
            r0 = this;
            r0.afterResume(r1)
            return
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    protected void afterResume(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r3.tryResume()
            if (r0 == 0) goto L7
            return
        L7:
            kotlin.coroutines.Continuation<T> r0 = r3.uCont
            kotlin.coroutines.Continuation r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r0)
            kotlin.coroutines.Continuation<T> r1 = r3.uCont
            java.lang.Object r4 = kotlinx.coroutines.CompletionStateKt.recoverResult(r4, r1)
            r1 = 2
            r2 = 0
            kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith$default(r0, r4, r2, r1, r2)
            return
    }

    public final java.lang.Object getResult() {
            r2 = this;
            boolean r0 = r2.trySuspend()
            if (r0 == 0) goto Lb
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r0
        Lb:
            java.lang.Object r0 = r2.getState$kotlinx_coroutines_core()
            java.lang.Object r0 = kotlinx.coroutines.JobSupportKt.unboxState(r0)
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L18
            return r0
        L18:
            kotlinx.coroutines.CompletedExceptionally r0 = (kotlinx.coroutines.CompletedExceptionally) r0
            java.lang.Throwable r0 = r0.cause
            throw r0
    }
}
