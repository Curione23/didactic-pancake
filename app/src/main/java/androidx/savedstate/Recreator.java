package androidx.savedstate;

/* JADX INFO: compiled from: Recreator.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "reflectiveNew", "className", "", "Companion", "SavedStateProvider", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Recreator implements androidx.lifecycle.LifecycleEventObserver {
    public static final java.lang.String CLASSES_KEY = "classes_to_restore";
    public static final java.lang.String COMPONENT_KEY = "androidx.savedstate.Restarter";
    public static final androidx.savedstate.Recreator.Companion Companion = null;
    private final androidx.savedstate.SavedStateRegistryOwner owner;

    /* JADX INFO: compiled from: Recreator.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/Recreator$Companion;", "", "()V", "CLASSES_KEY", "", "COMPONENT_KEY", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: compiled from: Recreator.kt */
    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/savedstate/Recreator$SavedStateProvider;", "Landroidx/savedstate/SavedStateRegistry$SavedStateProvider;", "registry", "Landroidx/savedstate/SavedStateRegistry;", "(Landroidx/savedstate/SavedStateRegistry;)V", "classes", "", "", "add", "", "className", "saveState", "Landroid/os/Bundle;", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class SavedStateProvider implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
        private final java.util.Set<java.lang.String> classes;

        public SavedStateProvider(androidx.savedstate.SavedStateRegistry r3) {
                r2 = this;
                java.lang.String r0 = "registry"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                r2.<init>()
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                java.util.Set r0 = (java.util.Set) r0
                r2.classes = r0
                java.lang.String r0 = "androidx.savedstate.Restarter"
                r1 = r2
                androidx.savedstate.SavedStateRegistry$SavedStateProvider r1 = (androidx.savedstate.SavedStateRegistry.SavedStateProvider) r1
                r3.registerSavedStateProvider(r0, r1)
                return
        }

        public final void add(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                java.util.Set<java.lang.String> r0 = r1.classes
                r0.add(r2)
                return
        }

        @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
        public android.os.Bundle saveState() {
                r3 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.Set<java.lang.String> r2 = r3.classes
                java.util.Collection r2 = (java.util.Collection) r2
                r1.<init>(r2)
                java.lang.String r2 = "classes_to_restore"
                r0.putStringArrayList(r2, r1)
                return r0
        }
    }

    static {
            androidx.savedstate.Recreator$Companion r0 = new androidx.savedstate.Recreator$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.savedstate.Recreator.Companion = r0
            return
    }

    public Recreator(androidx.savedstate.SavedStateRegistryOwner r2) {
            r1 = this;
            java.lang.String r0 = "owner"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.owner = r2
            return
    }

    private final void reflectiveNew(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "Class "
            java.lang.Class<androidx.savedstate.Recreator> r1 = androidx.savedstate.Recreator.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.ClassNotFoundException -> L6d
            r2 = 0
            java.lang.Class r1 = java.lang.Class.forName(r5, r2, r1)     // Catch: java.lang.ClassNotFoundException -> L6d
            java.lang.Class<androidx.savedstate.SavedStateRegistry$AutoRecreated> r3 = androidx.savedstate.SavedStateRegistry.AutoRecreated.class
            java.lang.Class r1 = r1.asSubclass(r3)     // Catch: java.lang.ClassNotFoundException -> L6d
            java.lang.String r3 = "{\n                Class.…class.java)\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)     // Catch: java.lang.ClassNotFoundException -> L6d
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L4d
            java.lang.reflect.Constructor r0 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L4d
            r1 = 1
            r0.setAccessible(r1)
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L35
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L35
            java.lang.String r1 = "{\n                constr…wInstance()\n            }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch: java.lang.Exception -> L35
            androidx.savedstate.SavedStateRegistry$AutoRecreated r0 = (androidx.savedstate.SavedStateRegistry.AutoRecreated) r0     // Catch: java.lang.Exception -> L35
            androidx.savedstate.SavedStateRegistryOwner r5 = r4.owner
            r0.onRecreated(r5)
            return
        L35:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to instantiate "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r1.<init>(r5, r0)
            throw r1
        L4d:
            r5 = move-exception
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.String r0 = r1.getSimpleName()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r1 = " must have default constructor in order to be automatically recreated"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.Throwable r5 = (java.lang.Throwable) r5
            r2.<init>(r0, r5)
            throw r2
        L6d:
            r1 = move-exception
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            java.lang.StringBuilder r5 = r3.append(r5)
            java.lang.String r0 = " wasn't found"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r2.<init>(r5, r1)
            throw r2
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r2, androidx.lifecycle.Lifecycle.Event r3) {
            r1 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_CREATE
            if (r3 != r0) goto L4e
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            r3 = r1
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3
            r2.removeObserver(r3)
            androidx.savedstate.SavedStateRegistryOwner r2 = r1.owner
            androidx.savedstate.SavedStateRegistry r2 = r2.getSavedStateRegistry()
            java.lang.String r3 = "androidx.savedstate.Restarter"
            android.os.Bundle r2 = r2.consumeRestoredStateForKey(r3)
            if (r2 != 0) goto L27
            return
        L27:
            java.lang.String r3 = "classes_to_restore"
            java.util.ArrayList r2 = r2.getStringArrayList(r3)
            if (r2 == 0) goto L46
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L35:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r1.reflectiveNew(r3)
            goto L35
        L45:
            return
        L46:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""
            r2.<init>(r3)
            throw r2
        L4e:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "Next event must be ON_CREATE"
            r2.<init>(r3)
            throw r2
    }
}
