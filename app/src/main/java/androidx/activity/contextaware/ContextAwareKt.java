package androidx.activity.contextaware;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a@\u0010\u0000\u001a\u0007H\u0001¢\u0006\u0002\b\u0002\"\u0004\b\u0000\u0010\u0001*\u00020\u00032\u001e\b\u0004\u0010\u0004\u001a\u0018\u0012\t\u0012\u00070\u0006¢\u0006\u0002\b\u0002\u0012\t\u0012\u0007H\u0001¢\u0006\u0002\b\u00020\u0005H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"withContextAvailable", "R", "Lkotlin/jvm/JvmSuppressWildcards;", "Landroidx/activity/contextaware/ContextAware;", "onContextAvailable", "Lkotlin/Function1;", "Landroid/content/Context;", "(Landroidx/activity/contextaware/ContextAware;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ContextAwareKt {
    public static final <R> java.lang.Object withContextAvailable(androidx.activity.contextaware.ContextAware r3, kotlin.jvm.functions.Function1<android.content.Context, R> r4, kotlin.coroutines.Continuation<R> r5) {
            android.content.Context r0 = r3.peekAvailableContext()
            if (r0 == 0) goto Lb
            java.lang.Object r3 = r4.invoke(r0)
            return r3
        Lb:
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r5)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r2 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1
            r2.<init>(r1, r4)
            r4 = r2
            androidx.activity.contextaware.OnContextAvailableListener r4 = (androidx.activity.contextaware.OnContextAvailableListener) r4
            r3.addOnContextAvailableListener(r4)
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1 r4 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1
            r4.<init>(r3, r2)
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r1.invokeOnCancellation(r4)
            java.lang.Object r3 = r0.getResult()
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L3d
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L3d:
            return r3
    }

    private static final <R> java.lang.Object withContextAvailable$$forInline(androidx.activity.contextaware.ContextAware r4, kotlin.jvm.functions.Function1<android.content.Context, R> r5, kotlin.coroutines.Continuation<R> r6) {
            android.content.Context r0 = r4.peekAvailableContext()
            if (r0 == 0) goto Lb
            java.lang.Object r4 = r5.invoke(r0)
            return r4
        Lb:
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.CancellableContinuationImpl r0 = new kotlinx.coroutines.CancellableContinuationImpl
            kotlin.coroutines.Continuation r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r6)
            r2 = 1
            r0.<init>(r1, r2)
            r0.initCancellability()
            r1 = r0
            kotlinx.coroutines.CancellableContinuation r1 = (kotlinx.coroutines.CancellableContinuation) r1
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1 r3 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$listener$1
            r3.<init>(r1, r5)
            r5 = r3
            androidx.activity.contextaware.OnContextAvailableListener r5 = (androidx.activity.contextaware.OnContextAvailableListener) r5
            r4.addOnContextAvailableListener(r5)
            androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1 r5 = new androidx.activity.contextaware.ContextAwareKt$withContextAvailable$2$1
            r5.<init>(r4, r3)
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r1.invokeOnCancellation(r5)
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            java.lang.Object r4 = r0.getResult()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L43
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L43:
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r4
    }
}
