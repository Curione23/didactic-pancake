package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: MainDispatchers.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u001c\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0016J$\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u000e2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\fH\u0002J\u001e\u0010 \u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlinx/coroutines/internal/MissingMainCoroutineDispatcher;", "Lkotlinx/coroutines/MainCoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "cause", "", "errorHint", "", "(Ljava/lang/Throwable;Ljava/lang/String;)V", "immediate", "getImmediate", "()Lkotlinx/coroutines/MainCoroutineDispatcher;", "delay", "", "time", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "isDispatchNeeded", "", "limitedParallelism", "Lkotlinx/coroutines/CoroutineDispatcher;", "parallelism", "", "missing", "scheduleResumeAfterDelay", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class MissingMainCoroutineDispatcher extends kotlinx.coroutines.MainCoroutineDispatcher implements kotlinx.coroutines.Delay {
    private final java.lang.Throwable cause;
    private final java.lang.String errorHint;

    public MissingMainCoroutineDispatcher(java.lang.Throwable r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.cause = r1
            r0.errorHint = r2
            return
    }

    public /* synthetic */ MissingMainCoroutineDispatcher(java.lang.Throwable r1, java.lang.String r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            r0.<init>(r1, r2)
            return
    }

    private final java.lang.Void missing() {
            r4 = this;
            java.lang.Throwable r0 = r4.cause
            if (r0 == 0) goto L32
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Module with the Main dispatcher had failed to initialize"
            r0.<init>(r1)
            java.lang.String r1 = r4.errorHint
            if (r1 == 0) goto L20
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ". "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L22
        L20:
            java.lang.String r1 = ""
        L22:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.Throwable r2 = r4.cause
            r1.<init>(r0, r2)
            throw r1
        L32:
            kotlinx.coroutines.internal.MainDispatchersKt.throwMissingMainDispatcherException()
            kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
            r0.<init>()
            throw r0
    }

    @Override // kotlinx.coroutines.Delay
    public java.lang.Object delay(long r1, kotlin.coroutines.Continuation<?> r3) {
            r0 = this;
            r0.missing()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public java.lang.Void dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            r0.missing()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo2318dispatch(kotlin.coroutines.CoroutineContext r1, java.lang.Runnable r2) {
            r0 = this;
            r0.dispatch(r1, r2)
            return
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher
    public kotlinx.coroutines.MainCoroutineDispatcher getImmediate() {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.MainCoroutineDispatcher r0 = (kotlinx.coroutines.MainCoroutineDispatcher) r0
            return r0
    }

    @Override // kotlinx.coroutines.Delay
    public kotlinx.coroutines.DisposableHandle invokeOnTimeout(long r1, java.lang.Runnable r3, kotlin.coroutines.CoroutineContext r4) {
            r0 = this;
            r0.missing()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(kotlin.coroutines.CoroutineContext r1) {
            r0 = this;
            r0.missing()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public kotlinx.coroutines.CoroutineDispatcher limitedParallelism(int r1) {
            r0 = this;
            r0.missing()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public java.lang.Void scheduleResumeAfterDelay(long r1, kotlinx.coroutines.CancellableContinuation<? super kotlin.Unit> r3) {
            r0 = this;
            r0.missing()
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ void mo2319scheduleResumeAfterDelay(long r1, kotlinx.coroutines.CancellableContinuation r3) {
            r0 = this;
            r0.scheduleResumeAfterDelay(r1, r3)
            return
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Dispatchers.Main[missing"
            r0.<init>(r1)
            java.lang.Throwable r1 = r3.cause
            if (r1 == 0) goto L1d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", cause="
            r1.<init>(r2)
            java.lang.Throwable r2 = r3.cause
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L1f
        L1d:
            java.lang.String r1 = ""
        L1f:
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
