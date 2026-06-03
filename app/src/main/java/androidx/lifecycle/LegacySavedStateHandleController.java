package androidx.lifecycle;

/* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J,\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController;", "", "()V", "TAG_SAVED_STATE_HANDLE_CONTROLLER", "", "attachHandleIfNeeded", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "create", "Landroidx/lifecycle/SavedStateHandleController;", "key", "defaultArgs", "Landroid/os/Bundle;", "tryToAddRecreator", "OnRecreation", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LegacySavedStateHandleController {
    public static final androidx.lifecycle.LegacySavedStateHandleController INSTANCE = null;
    public static final java.lang.String TAG_SAVED_STATE_HANDLE_CONTROLLER = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: compiled from: LegacySavedStateHandleController.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/LegacySavedStateHandleController$OnRecreation;", "Landroidx/savedstate/SavedStateRegistry$AutoRecreated;", "()V", "onRecreated", "", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OnRecreation implements androidx.savedstate.SavedStateRegistry.AutoRecreated {
        public OnRecreation() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.AutoRecreated
        public void onRecreated(androidx.savedstate.SavedStateRegistryOwner r6) {
                r5 = this;
                java.lang.String r0 = "owner"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
                boolean r0 = r6 instanceof androidx.lifecycle.ViewModelStoreOwner
                if (r0 == 0) goto L49
                r0 = r6
                androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
                androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
                androidx.savedstate.SavedStateRegistry r1 = r6.getSavedStateRegistry()
                java.util.Set r2 = r0.keys()
                java.util.Iterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L37
                java.lang.Object r3 = r2.next()
                java.lang.String r3 = (java.lang.String) r3
                androidx.lifecycle.ViewModel r3 = r0.get(r3)
                kotlin.jvm.internal.Intrinsics.checkNotNull(r3)
                androidx.lifecycle.Lifecycle r4 = r6.getLifecycle()
                androidx.lifecycle.LegacySavedStateHandleController.attachHandleIfNeeded(r3, r1, r4)
                goto L1c
            L37:
                java.util.Set r6 = r0.keys()
                java.util.Collection r6 = (java.util.Collection) r6
                boolean r6 = r6.isEmpty()
                if (r6 != 0) goto L48
                java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r6 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
                r1.runOnNextRecreation(r6)
            L48:
                return
            L49:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner"
                java.lang.String r0 = r0.toString()
                r6.<init>(r0)
                throw r6
        }
    }


    static {
            androidx.lifecycle.LegacySavedStateHandleController r0 = new androidx.lifecycle.LegacySavedStateHandleController
            r0.<init>()
            androidx.lifecycle.LegacySavedStateHandleController.INSTANCE = r0
            return
    }

    private LegacySavedStateHandleController() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    public static final void attachHandleIfNeeded(androidx.lifecycle.ViewModel r1, androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3) {
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "androidx.lifecycle.savedstate.vm.tag"
            java.lang.Object r1 = r1.getTag(r0)
            androidx.lifecycle.SavedStateHandleController r1 = (androidx.lifecycle.SavedStateHandleController) r1
            if (r1 == 0) goto L27
            boolean r0 = r1.isAttached()
            if (r0 != 0) goto L27
            r1.attachToLifecycle(r2, r3)
            androidx.lifecycle.LegacySavedStateHandleController r1 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r1.tryToAddRecreator(r2, r3)
        L27:
            return
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.SavedStateHandleController create(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.Lifecycle r3, java.lang.String r4, android.os.Bundle r5) {
            java.lang.String r0 = "registry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "lifecycle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r4)
            android.os.Bundle r0 = r2.consumeRestoredStateForKey(r4)
            androidx.lifecycle.SavedStateHandle$Companion r1 = androidx.lifecycle.SavedStateHandle.Companion
            androidx.lifecycle.SavedStateHandle r5 = r1.createHandle(r0, r5)
            androidx.lifecycle.SavedStateHandleController r0 = new androidx.lifecycle.SavedStateHandleController
            r0.<init>(r4, r5)
            r0.attachToLifecycle(r2, r3)
            androidx.lifecycle.LegacySavedStateHandleController r4 = androidx.lifecycle.LegacySavedStateHandleController.INSTANCE
            r4.tryToAddRecreator(r2, r3)
            return r0
    }

    private final void tryToAddRecreator(androidx.savedstate.SavedStateRegistry r3, androidx.lifecycle.Lifecycle r4) {
            r2 = this;
            androidx.lifecycle.Lifecycle$State r0 = r4.getCurrentState()
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.INITIALIZED
            if (r0 == r1) goto L1c
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.STARTED
            boolean r0 = r0.isAtLeast(r1)
            if (r0 == 0) goto L11
            goto L1c
        L11:
            androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1 r0 = new androidx.lifecycle.LegacySavedStateHandleController$tryToAddRecreator$1
            r0.<init>(r4, r3)
            androidx.lifecycle.LifecycleObserver r0 = (androidx.lifecycle.LifecycleObserver) r0
            r4.addObserver(r0)
            goto L21
        L1c:
            java.lang.Class<androidx.lifecycle.LegacySavedStateHandleController$OnRecreation> r4 = androidx.lifecycle.LegacySavedStateHandleController.OnRecreation.class
            r3.runOnNextRecreation(r4)
        L21:
            return
    }
}
