package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b\u001aU\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "getREUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "getUNDEFINED$annotations", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", "T", "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class DispatchedContinuationKt {
    public static final kotlinx.coroutines.internal.Symbol REUSABLE_CLAIMED = null;
    private static final kotlinx.coroutines.internal.Symbol UNDEFINED = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNDEFINED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.DispatchedContinuationKt.REUSABLE_CLAIMED = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNDEFINED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.internal.DispatchedContinuationKt.UNDEFINED
            return r0
    }

    private static final boolean executeUnconfined(kotlinx.coroutines.internal.DispatchedContinuation<?> r3, java.lang.Object r4, int r5, boolean r6, kotlin.jvm.functions.Function0<kotlin.Unit> r7) {
            boolean r0 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r0 == 0) goto L10
            r0 = -1
            if (r5 == r0) goto La
            goto L10
        La:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L10:
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            r1 = 0
            if (r6 == 0) goto L20
            boolean r6 = r0.isUnconfinedQueueEmpty()
            if (r6 == 0) goto L20
            return r1
        L20:
            boolean r6 = r0.isUnconfinedLoopActive()
            r2 = 1
            if (r6 == 0) goto L32
            r3._state = r4
            r3.resumeMode = r5
            kotlinx.coroutines.DispatchedTask r3 = (kotlinx.coroutines.DispatchedTask) r3
            r0.dispatchUnconfined(r3)
            r1 = r2
            goto L52
        L32:
            kotlinx.coroutines.DispatchedTask r3 = (kotlinx.coroutines.DispatchedTask) r3
            r0.incrementUseCount(r2)
            r7.invoke()     // Catch: java.lang.Throwable -> L44
        L3a:
            boolean r4 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L44
            if (r4 != 0) goto L3a
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            goto L4c
        L44:
            r4 = move-exception
            r5 = 0
            r3.handleFatalException(r4, r5)     // Catch: java.lang.Throwable -> L53
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
        L4c:
            r0.decrementUseCount(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
        L52:
            return r1
        L53:
            r3 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r2)
            r0.decrementUseCount(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r2)
            throw r3
    }

    static /* synthetic */ boolean executeUnconfined$default(kotlinx.coroutines.internal.DispatchedContinuation r1, java.lang.Object r2, int r3, boolean r4, kotlin.jvm.functions.Function0 r5, int r6, java.lang.Object r7) {
            r6 = r6 & 4
            r7 = 0
            if (r6 == 0) goto L6
            r4 = r7
        L6:
            boolean r6 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r6 == 0) goto L16
            r6 = -1
            if (r3 == r6) goto L10
            goto L16
        L10:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L16:
            kotlinx.coroutines.ThreadLocalEventLoop r6 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r6 = r6.getEventLoop$kotlinx_coroutines_core()
            if (r4 == 0) goto L25
            boolean r4 = r6.isUnconfinedQueueEmpty()
            if (r4 == 0) goto L25
            return r7
        L25:
            boolean r4 = r6.isUnconfinedLoopActive()
            r0 = 1
            if (r4 == 0) goto L37
            r1._state = r2
            r1.resumeMode = r3
            kotlinx.coroutines.DispatchedTask r1 = (kotlinx.coroutines.DispatchedTask) r1
            r6.dispatchUnconfined(r1)
            r7 = r0
            goto L57
        L37:
            kotlinx.coroutines.DispatchedTask r1 = (kotlinx.coroutines.DispatchedTask) r1
            r6.incrementUseCount(r0)
            r5.invoke()     // Catch: java.lang.Throwable -> L49
        L3f:
            boolean r2 = r6.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L3f
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            goto L51
        L49:
            r2 = move-exception
            r3 = 0
            r1.handleFatalException(r2, r3)     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
        L51:
            r6.decrementUseCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
        L57:
            return r7
        L58:
            r1 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r0)
            r6.decrementUseCount(r0)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r0)
            throw r1
    }

    public static /* synthetic */ void getREUSABLE_CLAIMED$annotations() {
            return
    }

    private static /* synthetic */ void getUNDEFINED$annotations() {
            return
    }

    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> r7, java.lang.Object r8, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r9) {
            boolean r0 = r7 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto Lc7
            kotlinx.coroutines.internal.DispatchedContinuation r7 = (kotlinx.coroutines.internal.DispatchedContinuation) r7
            java.lang.Object r9 = kotlinx.coroutines.CompletionStateKt.toState(r8, r9)
            kotlinx.coroutines.CoroutineDispatcher r0 = r7.dispatcher
            kotlin.coroutines.CoroutineContext r1 = r7.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L28
            r7._state = r9
            r7.resumeMode = r1
            kotlinx.coroutines.CoroutineDispatcher r8 = r7.dispatcher
            kotlin.coroutines.CoroutineContext r9 = r7.getContext()
            java.lang.Runnable r7 = (java.lang.Runnable) r7
            r8.mo2318dispatch(r9, r7)
            goto Lca
        L28:
            kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            kotlinx.coroutines.ThreadLocalEventLoop r0 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r0 = r0.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r0.isUnconfinedLoopActive()
            if (r2 == 0) goto L42
            r7._state = r9
            r7.resumeMode = r1
            kotlinx.coroutines.DispatchedTask r7 = (kotlinx.coroutines.DispatchedTask) r7
            r0.dispatchUnconfined(r7)
            goto Lca
        L42:
            r2 = r7
            kotlinx.coroutines.DispatchedTask r2 = (kotlinx.coroutines.DispatchedTask) r2
            r0.incrementUseCount(r1)
            r3 = 0
            kotlin.coroutines.CoroutineContext r4 = r7.getContext()     // Catch: java.lang.Throwable -> Lba
            kotlinx.coroutines.Job$Key r5 = kotlinx.coroutines.Job.Key     // Catch: java.lang.Throwable -> Lba
            kotlin.coroutines.CoroutineContext$Key r5 = (kotlin.coroutines.CoroutineContext.Key) r5     // Catch: java.lang.Throwable -> Lba
            kotlin.coroutines.CoroutineContext$Element r4 = r4.get(r5)     // Catch: java.lang.Throwable -> Lba
            kotlinx.coroutines.Job r4 = (kotlinx.coroutines.Job) r4     // Catch: java.lang.Throwable -> Lba
            if (r4 == 0) goto L7b
            boolean r5 = r4.isActive()     // Catch: java.lang.Throwable -> Lba
            if (r5 != 0) goto L7b
            java.util.concurrent.CancellationException r8 = r4.getCancellationException()     // Catch: java.lang.Throwable -> Lba
            r4 = r8
            java.lang.Throwable r4 = (java.lang.Throwable) r4     // Catch: java.lang.Throwable -> Lba
            r7.cancelCompletedResult$kotlinx_coroutines_core(r9, r4)     // Catch: java.lang.Throwable -> Lba
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7     // Catch: java.lang.Throwable -> Lba
            kotlin.Result$Companion r9 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lba
            java.lang.Throwable r8 = (java.lang.Throwable) r8     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r8 = kotlin.Result.m767constructorimpl(r8)     // Catch: java.lang.Throwable -> Lba
            r7.resumeWith(r8)     // Catch: java.lang.Throwable -> Lba
            goto La6
        L7b:
            kotlin.coroutines.Continuation<T> r9 = r7.continuation     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r4 = r7.countOrElement     // Catch: java.lang.Throwable -> Lba
            kotlin.coroutines.CoroutineContext r5 = r9.getContext()     // Catch: java.lang.Throwable -> Lba
            java.lang.Object r4 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r5, r4)     // Catch: java.lang.Throwable -> Lba
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> Lba
            if (r4 == r6) goto L90
            kotlinx.coroutines.UndispatchedCoroutine r9 = kotlinx.coroutines.CoroutineContextKt.updateUndispatchedCompletion(r9, r5, r4)     // Catch: java.lang.Throwable -> Lba
            goto L94
        L90:
            r9 = r3
            kotlinx.coroutines.UndispatchedCoroutine r9 = (kotlinx.coroutines.UndispatchedCoroutine) r9     // Catch: java.lang.Throwable -> Lba
            r9 = r3
        L94:
            kotlin.coroutines.Continuation<T> r7 = r7.continuation     // Catch: java.lang.Throwable -> Lad
            r7.resumeWith(r8)     // Catch: java.lang.Throwable -> Lad
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> Lad
            if (r9 == 0) goto La3
            boolean r7 = r9.clearThreadContext()     // Catch: java.lang.Throwable -> Lba
            if (r7 == 0) goto La6
        La3:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r4)     // Catch: java.lang.Throwable -> Lba
        La6:
            boolean r7 = r0.processUnconfinedEvent()     // Catch: java.lang.Throwable -> Lba
            if (r7 != 0) goto La6
            goto Lbe
        Lad:
            r7 = move-exception
            if (r9 == 0) goto Lb6
            boolean r8 = r9.clearThreadContext()     // Catch: java.lang.Throwable -> Lba
            if (r8 == 0) goto Lb9
        Lb6:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r5, r4)     // Catch: java.lang.Throwable -> Lba
        Lb9:
            throw r7     // Catch: java.lang.Throwable -> Lba
        Lba:
            r7 = move-exception
            r2.handleFatalException(r7, r3)     // Catch: java.lang.Throwable -> Lc2
        Lbe:
            r0.decrementUseCount(r1)
            goto Lca
        Lc2:
            r7 = move-exception
            r0.decrementUseCount(r1)
            throw r7
        Lc7:
            r7.resumeWith(r8)
        Lca:
            return
    }

    public static /* synthetic */ void resumeCancellableWith$default(kotlin.coroutines.Continuation r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            resumeCancellableWith(r0, r1, r2)
            return
    }

    public static final boolean yieldUndispatched(kotlinx.coroutines.internal.DispatchedContinuation<? super kotlin.Unit> r5) {
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            kotlinx.coroutines.ThreadLocalEventLoop r1 = kotlinx.coroutines.ThreadLocalEventLoop.INSTANCE
            kotlinx.coroutines.EventLoop r1 = r1.getEventLoop$kotlinx_coroutines_core()
            boolean r2 = r1.isUnconfinedQueueEmpty()
            r3 = 0
            if (r2 == 0) goto L13
            goto L3d
        L13:
            boolean r2 = r1.isUnconfinedLoopActive()
            r4 = 1
            if (r2 == 0) goto L25
            r5._state = r0
            r5.resumeMode = r4
            kotlinx.coroutines.DispatchedTask r5 = (kotlinx.coroutines.DispatchedTask) r5
            r1.dispatchUnconfined(r5)
            r3 = r4
            goto L3d
        L25:
            r0 = r5
            kotlinx.coroutines.DispatchedTask r0 = (kotlinx.coroutines.DispatchedTask) r0
            r1.incrementUseCount(r4)
            r5.run()     // Catch: java.lang.Throwable -> L35
        L2e:
            boolean r5 = r1.processUnconfinedEvent()     // Catch: java.lang.Throwable -> L35
            if (r5 != 0) goto L2e
            goto L3a
        L35:
            r5 = move-exception
            r2 = 0
            r0.handleFatalException(r5, r2)     // Catch: java.lang.Throwable -> L3e
        L3a:
            r1.decrementUseCount(r4)
        L3d:
            return r3
        L3e:
            r5 = move-exception
            r1.decrementUseCount(r4)
            throw r5
    }
}
