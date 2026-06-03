package androidx.core.app;

/* JADX INFO: compiled from: ComponentActivity.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001)B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J'\u0010\u0016\u001a\u0004\u0018\u0001H\u0017\"\b\b\u0000\u0010\u0017*\u00020\b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u0002H\u00170\u0007H\u0017¢\u0006\u0002\u0010\u0019J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\u0010\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001dH\u0015J\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\bH\u0017J\u001d\u0010\"\u001a\u00020\u00122\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0004¢\u0006\u0002\u0010&J\u001d\u0010'\u001a\u00020\u00122\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0002¢\u0006\u0002\u0010&J\u0010\u0010(\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0017R(\u0010\u0005\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0004¨\u0006*"}, d2 = {"Landroidx/core/app/ComponentActivity;", "Landroid/app/Activity;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/core/view/KeyEventDispatcher$Component;", "()V", "extraDataMap", "Landroidx/collection/SimpleArrayMap;", "Ljava/lang/Class;", "Landroidx/core/app/ComponentActivity$ExtraData;", "getExtraDataMap$annotations", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycleRegistry", "Landroidx/lifecycle/LifecycleRegistry;", "getLifecycleRegistry$annotations", "dispatchKeyEvent", "", "event", "Landroid/view/KeyEvent;", "dispatchKeyShortcutEvent", "getExtraData", "T", "extraDataClass", "(Ljava/lang/Class;)Landroidx/core/app/ComponentActivity$ExtraData;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onSaveInstanceState", "outState", "putExtraData", "extraData", "shouldDumpInternalState", "args", "", "", "([Ljava/lang/String;)Z", "shouldSkipDump", "superDispatchKeyEvent", "ExtraData", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ComponentActivity extends android.app.Activity implements androidx.lifecycle.LifecycleOwner, androidx.core.view.KeyEventDispatcher.Component {
    private final androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity.ExtraData>, androidx.core.app.ComponentActivity.ExtraData> extraDataMap;
    private final androidx.lifecycle.LifecycleRegistry lifecycleRegistry;

    /* JADX INFO: compiled from: ComponentActivity.kt */
    @kotlin.Deprecated(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Landroidx/core/app/ComponentActivity$ExtraData;", "", "()V", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class ExtraData {
        public ExtraData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public ComponentActivity() {
            r2 = this;
            r2.<init>()
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            r2.extraDataMap = r0
            androidx.lifecycle.LifecycleRegistry r0 = new androidx.lifecycle.LifecycleRegistry
            r1 = r2
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            r0.<init>(r1)
            r2.lifecycleRegistry = r0
            return
    }

    private static /* synthetic */ void getExtraDataMap$annotations() {
            return
    }

    private static /* synthetic */ void getLifecycleRegistry$annotations() {
            return
    }

    private final boolean shouldSkipDump(java.lang.String[] r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L57
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L57
        L7:
            r4 = r4[r0]
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -645125871: goto L47;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1c;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L57
        L12:
            java.lang.String r1 = "--autofill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            goto L57
        L1b:
            return r2
        L1c:
            java.lang.String r1 = "--contentcapture"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L25
            goto L57
        L25:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L2c
            r0 = r2
        L2c:
            return r0
        L2d:
            java.lang.String r1 = "--list-dumpables"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3f
            goto L57
        L36:
            java.lang.String r1 = "--dump-dumpable"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L3f
            goto L57
        L3f:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L46
            r0 = r2
        L46:
            return r0
        L47:
            java.lang.String r1 = "--translation"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L50
            goto L57
        L50:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L57
            r0 = r2
        L57:
            return r0
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            android.view.Window r0 = r3.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r1 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r4)
            if (r1 == 0) goto L1a
            r4 = 1
            goto L24
        L1a:
            r1 = r3
            androidx.core.view.KeyEventDispatcher$Component r1 = (androidx.core.view.KeyEventDispatcher.Component) r1
            r2 = r3
            android.view.Window$Callback r2 = (android.view.Window.Callback) r2
            boolean r4 = androidx.core.view.KeyEventDispatcher.dispatchKeyEvent(r1, r0, r2, r4)
        L24:
            return r4
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(android.view.KeyEvent r3) {
            r2 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.Window r0 = r2.getWindow()
            android.view.View r0 = r0.getDecorView()
            java.lang.String r1 = "window.decorView"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = androidx.core.view.KeyEventDispatcher.dispatchBeforeHierarchy(r0, r3)
            if (r0 == 0) goto L1a
            r3 = 1
            goto L1e
        L1a:
            boolean r3 = super.dispatchKeyShortcutEvent(r3)
        L1e:
            return r3
    }

    @kotlin.Deprecated(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends androidx.core.app.ComponentActivity.ExtraData> T getExtraData(java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "extraDataClass"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r1.extraDataMap
            java.lang.Object r2 = r0.get(r2)
            androidx.core.app.ComponentActivity$ExtraData r2 = (androidx.core.app.ComponentActivity.ExtraData) r2
            return r2
    }

    public androidx.lifecycle.Lifecycle getLifecycle() {
            r1 = this;
            androidx.lifecycle.LifecycleRegistry r0 = r1.lifecycleRegistry
            androidx.lifecycle.Lifecycle r0 = (androidx.lifecycle.Lifecycle) r0
            return r0
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r2) {
            r1 = this;
            super.onCreate(r2)
            androidx.lifecycle.ReportFragment$Companion r2 = androidx.lifecycle.ReportFragment.Companion
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            r2.injectIfNeededIn(r0)
            return
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            java.lang.String r0 = "outState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.lifecycle.LifecycleRegistry r0 = r2.lifecycleRegistry
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.CREATED
            r0.setCurrentState(r1)
            super.onSaveInstanceState(r3)
            return
    }

    @kotlin.Deprecated(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void putExtraData(androidx.core.app.ComponentActivity.ExtraData r3) {
            r2 = this;
            java.lang.String r0 = "extraData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            androidx.collection.SimpleArrayMap<java.lang.Class<? extends androidx.core.app.ComponentActivity$ExtraData>, androidx.core.app.ComponentActivity$ExtraData> r0 = r2.extraDataMap
            java.lang.Class r1 = r3.getClass()
            r0.put(r1, r3)
            return
    }

    protected final boolean shouldDumpInternalState(java.lang.String[] r1) {
            r0 = this;
            boolean r1 = r0.shouldSkipDump(r1)
            r1 = r1 ^ 1
            return r1
    }

    @Override // androidx.core.view.KeyEventDispatcher.Component
    public boolean superDispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r2 = super.dispatchKeyEvent(r2)
            return r2
    }
}
