package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000O2\u00060?j\u0002`@2\b\u0012\u0004\u0012\u00028\u00000\u0004B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0011\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0010¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\b¢\u0006\u0004\b$\u0010\nJH\u0010+\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%2%\b\b\u0010*\u001a\u001f\u0012\u0013\u0012\u00110\r¢\u0006\f\b(\u0012\b\b)\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010'H\u0086\bø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u001f2\b\u0010-\u001a\u0004\u0018\u00010\u000bH\u0086\b¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0086\bø\u0001\u0000¢\u0006\u0004\b0\u00101J \u00102\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0016ø\u0001\u0000¢\u0006\u0004\b2\u00101J\u0011\u00105\u001a\u0004\u0018\u00010\u000bH\u0010¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u001b\u0010:\u001a\u0004\u0018\u00010\r2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u000309¢\u0006\u0004\b:\u0010;R\u001e\u0010<\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b<\u0010=\u0012\u0004\b>\u0010\nR\u001c\u0010C\u001a\n\u0018\u00010?j\u0004\u0018\u0001`@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010FR\u0014\u0010G\u001a\u00020\u000b8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bG\u0010=R\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010KR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lkotlin/coroutines/Continuation;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "", "awaitReusability", "()V", "", "takenState", "", "cause", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "Lkotlinx/coroutines/CancellableContinuationImpl;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "Lkotlin/coroutines/CoroutineContext;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "dispatchYield", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable", "()Z", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "release", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onCancellation", "resumeCancellableWith", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "state", "resumeCancelled", "(Ljava/lang/Object;)Z", "resumeUndispatchedWith", "(Ljava/lang/Object;)V", "resumeWith", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation", "(Lkotlinx/coroutines/CancellableContinuation;)Ljava/lang/Throwable;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "countOrElement", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/coroutines/CoroutineDispatcher;", "getReusableCancellableContinuation", "reusableCancellableContinuation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DispatchedContinuation<T> extends kotlinx.coroutines.DispatchedTask<T> implements kotlin.coroutines.jvm.internal.CoroutineStackFrame, kotlin.coroutines.Continuation<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _reusableCancellableContinuation$FU = null;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation;
    public java.lang.Object _state;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.CoroutineDispatcher dispatcher;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation"
            java.lang.Class<kotlinx.coroutines.internal.DispatchedContinuation> r2 = kotlinx.coroutines.internal.DispatchedContinuation.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU = r0
            return
    }

    public DispatchedContinuation(kotlinx.coroutines.CoroutineDispatcher r2, kotlin.coroutines.Continuation<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.dispatcher = r2
            r1.continuation = r3
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r1._state = r2
            kotlin.coroutines.CoroutineContext r2 = r1.getContext()
            java.lang.Object r2 = kotlinx.coroutines.internal.ThreadContextKt.threadContextElements(r2)
            r1.countOrElement = r2
            r2 = 0
            r1._reusableCancellableContinuation = r2
            return
    }

    private final kotlinx.coroutines.CancellableContinuationImpl<?> getReusableCancellableContinuation() {
            r2 = this;
            java.lang.Object r0 = r2._reusableCancellableContinuation
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 == 0) goto L9
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
            return
    }

    public final void awaitReusability() {
            r2 = this;
        L0:
            java.lang.Object r0 = r2._reusableCancellableContinuation
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r0 == r1) goto L0
            return
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object r2, java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.CompletedWithCancellation
            if (r0 == 0) goto Lb
            kotlinx.coroutines.CompletedWithCancellation r2 = (kotlinx.coroutines.CompletedWithCancellation) r2
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r2.onCancellation
            r2.invoke(r3)
        Lb:
            return
    }

    public final kotlinx.coroutines.CancellableContinuationImpl<T> claimReusableCancellableContinuation() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4._reusableCancellableContinuation
            if (r0 != 0) goto La
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r4._reusableCancellableContinuation = r0
            r0 = 0
            return r0
        La:
            boolean r1 = r0 instanceof kotlinx.coroutines.CancellableContinuationImpl
            if (r1 == 0) goto L1b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r1 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r4, r0, r2)
            if (r1 == 0) goto L0
            kotlinx.coroutines.CancellableContinuationImpl r0 = (kotlinx.coroutines.CancellableContinuationImpl) r0
            return r0
        L1b:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            if (r0 == r1) goto L0
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L24
            goto L0
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Inconsistent state "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
    }

    public final void dispatchYield$kotlinx_coroutines_core(kotlin.coroutines.CoroutineContext r2, T r3) {
            r1 = this;
            r1._state = r3
            r3 = 1
            r1.resumeMode = r3
            kotlinx.coroutines.CoroutineDispatcher r3 = r1.dispatcher
            r0 = r1
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r3.dispatchYield(r2, r0)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<T> r0 = r2.continuation
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<T> r0 = r1.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
            r1 = this;
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isReusable() {
            r1 = this;
            java.lang.Object r0 = r1._reusableCancellableContinuation
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public final boolean postponeCancellation(java.lang.Throwable r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._reusableCancellableContinuation
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            r2 = 1
            if (r1 == 0) goto L16
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r4)
            if (r0 == 0) goto L0
            return r2
        L16:
            boolean r1 = r0 instanceof java.lang.Throwable
            if (r1 == 0) goto L1b
            return r2
        L1b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            r2 = 0
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r1, r3, r0, r2)
            if (r0 == 0) goto L0
            r4 = 0
            return r4
    }

    public final void release() {
            r1 = this;
            r1.awaitReusability()
            kotlinx.coroutines.CancellableContinuationImpl r0 = r1.getReusableCancellableContinuation()
            if (r0 == 0) goto Lc
            r0.detachChild$kotlinx_coroutines_core()
        Lc:
            return
    }

    public final void resumeCancellableWith(java.lang.Object r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9) {
            r7 = this;
            java.lang.Object r9 = kotlinx.coroutines.CompletionStateKt.toState(r8, r9)
            kotlinx.coroutines.CoroutineDispatcher r0 = r7.dispatcher
            kotlin.coroutines.CoroutineContext r1 = r7.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L23
            r7._state = r9
            r7.resumeMode = r1
            kotlinx.coroutines.CoroutineDispatcher r8 = r7.dispatcher
            kotlin.coroutines.CoroutineContext r9 = r7.getContext()
            r0 = r7
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r8.mo2318dispatch(r9, r0)
            goto Ld3
        L23:
            kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L3e
            r7._state = r9
            r7.resumeMode = r1
            r8 = r7
            kotlinx.coroutines.DispatchedTask r8 = (kotlinx.coroutines.DispatchedTask) r8
            r0.dispatchUnconfined(r8)
            goto Ld3
        L3e:
            r2 = r7
            kotlinx.coroutines.DispatchedTask r2 = (kotlinx.coroutines.DispatchedTask) r2
            r0.incrementUseCount(r1)
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r7.getContext()     // Catch: java.lang.Throwable -> Lc6
            kotlinx.coroutines.Job$Key r5 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lc6
            kotlin.coroutines.CoroutineContext$Key r5 = (kotlin.coroutines.CoroutineContext.Key) r5     // Catch: java.lang.Throwable -> Lc6
            kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r5)     // Catch: java.lang.Throwable -> Lc6
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4     // Catch: java.lang.Throwable -> Lc6
            if (r4 == 0) goto L78
            boolean r5 = r4.isActive()     // Catch: java.lang.Throwable -> Lc6
            if (r5 != 0) goto L78
            java.util.concurrent.CancellationException r8 = r4.getCancellationException()     // Catch: java.lang.Throwable -> Lc6
            r4 = r8
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> Lc6
            r7.cancelCompletedResult$kotlinx_coroutines_core(r9, r4)     // Catch: java.lang.Throwable -> Lc6
            r9 = r7
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9     // Catch: java.lang.Throwable -> Lc6
            kotlin.Result$Companion r4 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lc6
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r8 = kotlin.Result.m767constructorimpl(r8)     // Catch: java.lang.Throwable -> Lc6
            r9.resumeWith(r8)     // Catch: java.lang.Throwable -> Lc6
            goto La9
        L78:
            kotlin.coroutines.Continuation<T> r9 = r7.continuation     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = r7.countOrElement     // Catch: java.lang.Throwable -> Lc6
            kotlin.coroutines.CoroutineContext r5 = r9.getContext()     // Catch: java.lang.Throwable -> Lc6
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r5, r4)     // Catch: java.lang.Throwable -> Lc6
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> Lc6
            if (r4 == r6) goto L8d
            kotlinx.coroutines.UndispatchedCoroutine r9 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r9, r5, r4)     // Catch: java.lang.Throwable -> Lc6
            goto L91
        L8d:
            r9 = r3
            kotlinx.coroutines.UndispatchedCoroutine r9 = (kotlinx.coroutines.UndispatchedCoroutine) r9     // Catch: java.lang.Throwable -> Lc6
            r9 = r3
        L91:
            kotlin.coroutines.Continuation<T> r6 = r7.continuation     // Catch: java.lang.Throwable -> Lb3
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> Lb3
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lb3
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto La3
            boolean r8 = r9.clearThreadContext()     // Catch: java.lang.Throwable -> Lc6
            if (r8 == 0) goto La6
        La3:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r4)     // Catch: java.lang.Throwable -> Lc6
        La6:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Throwable -> Lc6
        La9:
            boolean r8 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> Lc6
            if (r8 != 0) goto La9
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            goto Lcd
        Lb3:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto Lbf
            boolean r9 = r9.clearThreadContext()     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto Lc2
        Lbf:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r4)     // Catch: java.lang.Throwable -> Lc6
        Lc2:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)     // Catch: java.lang.Throwable -> Lc6
            throw r8     // Catch: java.lang.Throwable -> Lc6
        Lc6:
            r8 = move-exception
            r2.handleFatalException(r8, r3)     // Catch: java.lang.Throwable -> Ld4
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
        Lcd:
            r0.decrementUseCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
        Ld3:
            return
        Ld4:
            r8 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r0.decrementUseCount(r1)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r8
    }

    public final boolean resumeCancelled(java.lang.Object r3) {
            r2 = this;
            kotlin.coroutines.CoroutineContext r0 = r2.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            kotlinx.coroutines.Job r0 = (kotlinx.coroutines.Job) r0
            if (r0 == 0) goto L31
            boolean r1 = r0.isActive()
            if (r1 != 0) goto L31
            java.util.concurrent.CancellationException r0 = r0.getCancellationException()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r2.cancelCompletedResult$kotlinx_coroutines_core(r3, r0)
            r3 = r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m767constructorimpl(r0)
            r3.resumeWith(r0)
            r3 = 1
            return r3
        L31:
            r3 = 0
            return r3
    }

    public final void resumeUndispatchedWith(java.lang.Object r6) {
            r5 = this;
            kotlin.coroutines.Continuation<T> r0 = r5.continuation
            java.lang.Object r1 = r5.countOrElement
            kotlin.coroutines.CoroutineContext r2 = r0.getContext()
            java.lang.Object r1 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r2, r1)
            kotlinx.coroutines.internal.Symbol r3 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS
            if (r1 == r3) goto L15
            kotlinx.coroutines.UndispatchedCoroutine r0 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r0, r2, r1)
            goto L19
        L15:
            r0 = 0
            r3 = r0
            kotlinx.coroutines.UndispatchedCoroutine r3 = (kotlinx.coroutines.UndispatchedCoroutine) r3
        L19:
            r3 = 1
            kotlin.coroutines.Continuation<T> r4 = r5.continuation     // Catch: java.lang.Throwable -> L33
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L33
            kotlin.Unit r6 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L33
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L2c
            boolean r6 = r0.clearThreadContext()
            if (r6 == 0) goto L2f
        L2c:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r1)
        L2f:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return
        L33:
            r6 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            if (r0 == 0) goto L3f
            boolean r0 = r0.clearThreadContext()
            if (r0 == 0) goto L42
        L3f:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r2, r1)
        L42:
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r6
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r8) {
            r7 = this;
            kotlin.coroutines.Continuation<T> r0 = r7.continuation
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.CompletionStateKt.toState$default(r8, r1, r2, r1)
            kotlinx.coroutines.CoroutineDispatcher r4 = r7.dispatcher
            boolean r4 = r4.isDispatchNeeded(r0)
            r5 = 0
            if (r4 == 0) goto L22
            r7._state = r3
            r7.resumeMode = r5
            kotlinx.coroutines.CoroutineDispatcher r8 = r7.dispatcher
            r1 = r7
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r8.mo2318dispatch(r0, r1)
            goto L69
        L22:
            kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r4 = r0.isUnconfinedLoopActive()
            if (r4 == 0) goto L3c
            r7._state = r3
            r7.resumeMode = r5
            r8 = r7
            kotlinx.coroutines.DispatchedTask r8 = (kotlinx.coroutines.DispatchedTask) r8
            r0.dispatchUnconfined(r8)
            goto L69
        L3c:
            r3 = r7
            kotlinx.coroutines.DispatchedTask r3 = (kotlinx.coroutines.DispatchedTask) r3
            r0.incrementUseCount(r2)
            kotlin.coroutines.CoroutineContext r4 = r7.getContext()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r7.countOrElement     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L62
            kotlin.coroutines.Continuation<T> r6 = r7.continuation     // Catch: java.lang.Throwable -> L5d
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> L5d
            kotlin.Unit r8 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L5d
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L62
        L56:
            boolean r8 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L62
            if (r8 != 0) goto L56
            goto L66
        L5d:
            r8 = move-exception
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r5)     // Catch: java.lang.Throwable -> L62
            throw r8     // Catch: java.lang.Throwable -> L62
        L62:
            r8 = move-exception
            r3.handleFatalException(r8, r1)     // Catch: java.lang.Throwable -> L6a
        L66:
            r0.decrementUseCount(r2)
        L69:
            return
        L6a:
            r8 = move-exception
            r0.decrementUseCount(r2)
            throw r8
    }

    @Override // kotlinx.coroutines.DispatchedTask
    public java.lang.Object takeState$kotlinx_coroutines_core() {
            r2 = this;
            java.lang.Object r0 = r2._state
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L15
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            if (r0 == r1) goto Lf
            goto L15
        Lf:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L15:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.access$getUNDEFINED$p()
            r2._state = r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DispatchedContinuation["
            r0.<init>(r1)
            kotlinx.coroutines.CoroutineDispatcher r1 = r2.dispatcher
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            kotlin.coroutines.Continuation<T> r1 = r2.continuation
            java.lang.String r1 = kotlinx.coroutines.DebugStringsKt.toDebugString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final java.lang.Throwable tryReleaseClaimedContinuation(kotlinx.coroutines.CancellableContinuation<?> r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3._reusableCancellableContinuation
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            r2 = 0
            if (r0 != r1) goto L12
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED
            boolean r0 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r0, r3, r1, r4)
            if (r0 == 0) goto L0
            return r2
        L12:
            boolean r4 = r0 instanceof java.lang.Throwable
            if (r4 == 0) goto L2d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.DispatchedContinuation._reusableCancellableContinuation$FU
            boolean r4 = androidx.concurrent.futures.AbstractResolvableFuture$SafeAtomicHelper$$ExternalSyntheticBackportWithForwarding0.m(r4, r3, r0, r2)
            if (r4 == 0) goto L21
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Inconsistent state "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
    }
}
