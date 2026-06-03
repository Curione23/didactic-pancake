package androidx.lifecycle;

/* JADX INFO: compiled from: LifecycleController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0007J\u0011\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0082\bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/LifecycleController;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minState", "Landroidx/lifecycle/Lifecycle$State;", "dispatchQueue", "Landroidx/lifecycle/DispatchQueue;", "parentJob", "Lkotlinx/coroutines/Job;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Landroidx/lifecycle/DispatchQueue;Lkotlinx/coroutines/Job;)V", "observer", "Landroidx/lifecycle/LifecycleEventObserver;", "finish", "", "handleDestroy", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LifecycleController {
    private final androidx.lifecycle.DispatchQueue dispatchQueue;
    private final androidx.lifecycle.Lifecycle lifecycle;
    private final androidx.lifecycle.Lifecycle.State minState;
    private final androidx.lifecycle.LifecycleEventObserver observer;

    /* JADX INFO: renamed from: $r8$lambda$oWRpCg8vH8nSBgktHTqCr-ANl8M, reason: not valid java name */
    public static /* synthetic */ void m65$r8$lambda$oWRpCg8vH8nSBgktHTqCrANl8M(androidx.lifecycle.LifecycleController r0, kotlinx.coroutines.Job r1, androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            observer$lambda$0(r0, r1, r2, r3)
            return
    }

    public LifecycleController(androidx.lifecycle.Lifecycle r2, androidx.lifecycle.Lifecycle.State r3, androidx.lifecycle.DispatchQueue r4, kotlinx.coroutines.Job r5) {
            r1 = this;
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "minState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "dispatchQueue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "parentJob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r1.<init>()
            r1.lifecycle = r2
            r1.minState = r3
            r1.dispatchQueue = r4
            androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0 r3 = new androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0
            r3.<init>(r1, r5)
            r1.observer = r3
            androidx.lifecycle.Lifecycle$State r4 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 != r0) goto L35
            r2 = 1
            r3 = 0
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r5, r3, r2, r3)
            r1.finish()
            goto L3a
        L35:
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3
            r2.addObserver(r3)
        L3a:
            return
    }

    private final void handleDestroy(kotlinx.coroutines.Job r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r3, r0, r1, r0)
            r2.finish()
            return
    }

    private static final void observer$lambda$0(androidx.lifecycle.LifecycleController r1, kotlinx.coroutines.Job r2, androidx.lifecycle.LifecycleOwner r3, androidx.lifecycle.Lifecycle.Event r4) {
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "$parentJob"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "<anonymous parameter 1>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            androidx.lifecycle.Lifecycle r4 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r4 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r4 != r0) goto L29
            r3 = 1
            r4 = 0
            kotlinx.coroutines.Job.DefaultImpls.cancel$default(r2, r4, r3, r4)
            r1.finish()
            goto L46
        L29:
            androidx.lifecycle.Lifecycle r2 = r3.getLifecycle()
            androidx.lifecycle.Lifecycle$State r2 = r2.getCurrentState()
            androidx.lifecycle.Lifecycle$State r3 = r1.minState
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r2 = r2.compareTo(r3)
            if (r2 >= 0) goto L41
            androidx.lifecycle.DispatchQueue r1 = r1.dispatchQueue
            r1.pause()
            goto L46
        L41:
            androidx.lifecycle.DispatchQueue r1 = r1.dispatchQueue
            r1.resume()
        L46:
            return
    }

    public final void finish() {
            r2 = this;
            androidx.lifecycle.Lifecycle r0 = r2.lifecycle
            androidx.lifecycle.LifecycleEventObserver r1 = r2.observer
            androidx.lifecycle.LifecycleObserver r1 = (androidx.lifecycle.LifecycleObserver) r1
            r0.removeObserver(r1)
            androidx.lifecycle.DispatchQueue r0 = r2.dispatchQueue
            r0.finish()
            return
    }
}
