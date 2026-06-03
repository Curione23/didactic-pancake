package kotlinx.coroutines.android;

/* JADX INFO: compiled from: HandlerDispatcher.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a\u0011\u0010\b\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a\u0016\u0010\u000e\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0002\u001a\u001d\u0010\u000f\u001a\u00020\u0003*\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007¢\u0006\u0002\b\u0013\u001a\u0014\u0010\u0014\u001a\u00020\u0010*\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0004\u0010\u0005\"\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"MAX_DELAY", "", "Main", "Lkotlinx/coroutines/android/HandlerDispatcher;", "getMain$annotations", "()V", "choreographer", "Landroid/view/Choreographer;", "awaitFrame", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFrameCallback", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "updateChoreographerAndPostFrameCallback", "asCoroutineDispatcher", "Landroid/os/Handler;", "name", "", "from", "asHandler", "Landroid/os/Looper;", "async", "", "kotlinx-coroutines-android"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final kotlinx.coroutines.android.HandlerDispatcher Main = null;
    private static volatile android.view.Choreographer choreographer;

    public static /* synthetic */ void $r8$lambda$gp6JLGBkWOxUeE1_JLllkAXyyxM(kotlinx.coroutines.CancellableContinuation r0, long r1) {
            m2268postFrameCallback$lambda6(r0, r1)
            return
    }

    static {
            r0 = 0
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            kotlinx.coroutines.android.HandlerContext r1 = new kotlinx.coroutines.android.HandlerContext     // Catch: java.lang.Throwable -> L17
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L17
            r3 = 1
            android.os.Handler r2 = asHandler(r2, r3)     // Catch: java.lang.Throwable -> L17
            r3 = 2
            r1.<init>(r2, r0, r3, r0)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = kotlin.Result.m767constructorimpl(r1)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m767constructorimpl(r1)
        L22:
            boolean r2 = kotlin.Result.m773isFailureimpl(r1)
            if (r2 == 0) goto L29
            goto L2a
        L29:
            r0 = r1
        L2a:
            kotlinx.coroutines.android.HandlerDispatcher r0 = (kotlinx.coroutines.android.HandlerDispatcher) r0
            kotlinx.coroutines.android.HandlerDispatcherKt.Main = r0
            return
    }

    public static final /* synthetic */ void access$postFrameCallback(android.view.Choreographer r0, kotlinx.coroutines.CancellableContinuation r1) {
            postFrameCallback(r0, r1)
            return
    }

    public static final /* synthetic */ void access$updateChoreographerAndPostFrameCallback(kotlinx.coroutines.CancellableContinuation r0) {
            updateChoreographerAndPostFrameCallback(r0)
            return
    }

    public static final android.os.Handler asHandler(android.os.Looper r5, boolean r6) {
            if (r6 == 0) goto L59
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            r1 = 0
            r2 = 0
            r3 = 1
            if (r6 < r0) goto L2e
            java.lang.Class<android.os.Handler> r6 = android.os.Handler.class
            java.lang.Class[] r0 = new java.lang.Class[r3]
            java.lang.Class<android.os.Looper> r3 = android.os.Looper.class
            r0[r2] = r3
            java.lang.String r2 = "createAsync"
            java.lang.reflect.Method r6 = r6.getDeclaredMethod(r2, r0)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.Object r5 = r6.invoke(r1, r5)
            if (r5 == 0) goto L26
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L26:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type android.os.Handler"
            r5.<init>(r6)
            throw r5
        L2e:
            java.lang.Class<android.os.Handler> r6 = android.os.Handler.class
            r0 = 3
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L53
            java.lang.Class<android.os.Looper> r4 = android.os.Looper.class
            r0[r2] = r4     // Catch: java.lang.NoSuchMethodException -> L53
            java.lang.Class<android.os.Handler$Callback> r2 = android.os.Handler.Callback.class
            r0[r3] = r2     // Catch: java.lang.NoSuchMethodException -> L53
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> L53
            r4 = 2
            r0[r4] = r2     // Catch: java.lang.NoSuchMethodException -> L53
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L53
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r1, r0}
            java.lang.Object r5 = r6.newInstance(r5)
            android.os.Handler r5 = (android.os.Handler) r5
            return r5
        L53:
            android.os.Handler r6 = new android.os.Handler
            r6.<init>(r5)
            return r6
        L59:
            android.os.Handler r6 = new android.os.Handler
            r6.<init>(r5)
            return r6
    }

    public static final java.lang.Object awaitFrame(kotlin.coroutines.Continuation<? super java.lang.Long> r5) {
            android.view.Choreographer r0 = kotlinx.coroutines.android.HandlerDispatcherKt.choreographer
            r1 = 1
            if (r0 == 0) goto L25
            kotlinx.coroutines.CancellableContinuationImpl r2 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r2.<init>(r3, r1)
            r2.initCancellability()
            r1 = r2
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            access$postFrameCallback(r0, r1)
            java.lang.Object r0 = r2.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L24
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L24:
            return r0
        L25:
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r0.<init>(r2, r1)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            kotlinx.coroutines.MainCoroutineDispatcher r2 = kotlinx.coroutines.Dispatchers.getMain()
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r3 = (kotlin.coroutines.CoroutineContext) r3
            kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrame$lambda-3$$inlined$Runnable$1 r4 = new kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrame$lambda-3$$inlined$Runnable$1
            r4.<init>(r1)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r2.mo2318dispatch(r3, r4)
            java.lang.Object r0 = r0.getResult()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L53
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L53:
            return r0
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler r2) {
            r0 = 0
            r1 = 1
            kotlinx.coroutines.android.HandlerDispatcher r2 = from$default(r2, r0, r1, r0)
            return r2
    }

    public static final kotlinx.coroutines.android.HandlerDispatcher from(android.os.Handler r1, java.lang.String r2) {
            kotlinx.coroutines.android.HandlerContext r0 = new kotlinx.coroutines.android.HandlerContext
            r0.<init>(r1, r2)
            kotlinx.coroutines.android.HandlerDispatcher r0 = (kotlinx.coroutines.android.HandlerDispatcher) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.android.HandlerDispatcher from$default(android.os.Handler r0, java.lang.String r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.android.HandlerDispatcher r0 = from(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Use Dispatchers.Main instead")
    public static /* synthetic */ void getMain$annotations() {
            return
    }

    private static final void postFrameCallback(android.view.Choreographer r1, kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> r2) {
            kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0 r0 = new kotlinx.coroutines.android.HandlerDispatcherKt$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.postFrameCallback(r0)
            return
    }

    /* JADX INFO: renamed from: postFrameCallback$lambda-6, reason: not valid java name */
    private static final void m2268postFrameCallback$lambda6(kotlinx.coroutines.CancellableContinuation r1, long r2) {
            kotlinx.coroutines.MainCoroutineDispatcher r0 = kotlinx.coroutines.Dispatchers.getMain()
            kotlinx.coroutines.CoroutineDispatcher r0 = (kotlinx.coroutines.CoroutineDispatcher) r0
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.resumeUndispatched(r0, r2)
            return
    }

    private static final void updateChoreographerAndPostFrameCallback(kotlinx.coroutines.CancellableContinuation<? super java.lang.Long> r1) {
            android.view.Choreographer r0 = kotlinx.coroutines.android.HandlerDispatcherKt.choreographer
            if (r0 != 0) goto Ld
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            kotlinx.coroutines.android.HandlerDispatcherKt.choreographer = r0
        Ld:
            postFrameCallback(r0, r1)
            return
    }
}
