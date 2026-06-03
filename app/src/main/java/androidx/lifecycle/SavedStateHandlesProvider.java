package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateHandleSupport.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0017"}, d2 = {"Landroidx/lifecycle/SavedStateHandlesProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/savedstate/SavedStateRegistry;Landroidx/lifecycle/ViewModelStoreOwner;)V", "restored", "", "restoredState", "Landroid/os/Bundle;", "viewModel", "Landroidx/lifecycle/SavedStateHandlesVM;", "getViewModel", "()Landroidx/lifecycle/SavedStateHandlesVM;", "viewModel$delegate", "Lkotlin/Lazy;", "consumeRestoredStateForKey", "key", "", "performRestore", "", "saveState", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SavedStateHandlesProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
    private boolean restored;
    private android.os.Bundle restoredState;
    private final androidx.savedstate.SavedStateRegistry savedStateRegistry;
    private final kotlin.Lazy viewModel$delegate;

    public SavedStateHandlesProvider(androidx.savedstate.SavedStateRegistry r2, androidx.lifecycle.ViewModelStoreOwner r3) {
            r1 = this;
            java.lang.String r0 = "savedStateRegistry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "viewModelStoreOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r1.<init>()
            r1.savedStateRegistry = r2
            androidx.lifecycle.SavedStateHandlesProvider$viewModel$2 r2 = new androidx.lifecycle.SavedStateHandlesProvider$viewModel$2
            r2.<init>(r3)
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            kotlin.Lazy r2 = kotlin.LazyKt.lazy(r2)
            r1.viewModel$delegate = r2
            return
    }

    private final androidx.lifecycle.SavedStateHandlesVM getViewModel() {
            r1 = this;
            kotlin.Lazy r0 = r1.viewModel$delegate
            java.lang.Object r0 = r0.getValue()
            androidx.lifecycle.SavedStateHandlesVM r0 = (androidx.lifecycle.SavedStateHandlesVM) r0
            return r0
    }

    public final android.os.Bundle consumeRestoredStateForKey(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r3.performRestore()
            android.os.Bundle r0 = r3.restoredState
            r1 = 0
            if (r0 == 0) goto L12
            android.os.Bundle r0 = r0.getBundle(r4)
            goto L13
        L12:
            r0 = r1
        L13:
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L1a
            r2.remove(r4)
        L1a:
            android.os.Bundle r4 = r3.restoredState
            if (r4 == 0) goto L27
            boolean r4 = r4.isEmpty()
            r2 = 1
            if (r4 != r2) goto L27
            r3.restoredState = r1
        L27:
            return r0
    }

    public final void performRestore() {
            r3 = this;
            boolean r0 = r3.restored
            if (r0 != 0) goto L25
            androidx.savedstate.SavedStateRegistry r0 = r3.savedStateRegistry
            java.lang.String r1 = "androidx.lifecycle.internal.SavedStateHandlesProvider"
            android.os.Bundle r0 = r0.consumeRestoredStateForKey(r1)
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            android.os.Bundle r2 = r3.restoredState
            if (r2 == 0) goto L18
            r1.putAll(r2)
        L18:
            if (r0 == 0) goto L1d
            r1.putAll(r0)
        L1d:
            r3.restoredState = r1
            r0 = 1
            r3.restored = r0
            r3.getViewModel()
        L25:
            return
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public android.os.Bundle saveState() {
            r5 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r5.restoredState
            if (r1 == 0) goto Lc
            r0.putAll(r1)
        Lc:
            androidx.lifecycle.SavedStateHandlesVM r1 = r5.getViewModel()
            java.util.Map r1 = r1.getHandles()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            androidx.lifecycle.SavedStateHandle r2 = (androidx.lifecycle.SavedStateHandle) r2
            androidx.savedstate.SavedStateRegistry$SavedStateProvider r2 = r2.savedStateProvider()
            android.os.Bundle r2 = r2.saveState()
            android.os.Bundle r4 = android.os.Bundle.EMPTY
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
            if (r4 != 0) goto L1c
            r0.putBundle(r3, r2)
            goto L1c
        L48:
            r1 = 0
            r5.restored = r1
            return r0
    }
}
