package androidx.activity;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0017¨\u0006\u000f"}, d2 = {"Landroidx/activity/EdgeToEdgeApi29;", "Landroidx/activity/EdgeToEdgeImpl;", "()V", "setUp", "", "statusBarStyle", "Landroidx/activity/SystemBarStyle;", "navigationBarStyle", "window", "Landroid/view/Window;", "view", "Landroid/view/View;", "statusBarIsDark", "", "navigationBarIsDark", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class EdgeToEdgeApi29 implements androidx.activity.EdgeToEdgeImpl {
    public EdgeToEdgeApi29() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(androidx.activity.SystemBarStyle r2, androidx.activity.SystemBarStyle r3, android.view.Window r4, android.view.View r5, boolean r6, boolean r7) {
            r1 = this;
            java.lang.String r0 = "statusBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "navigationBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "window"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r4, r0)
            int r2 = r2.getScrimWithEnforcedContrast$activity_release(r6)
            r4.setStatusBarColor(r2)
            int r2 = r3.getScrimWithEnforcedContrast$activity_release(r7)
            r4.setNavigationBarColor(r2)
            r4.setStatusBarContrastEnforced(r0)
            int r2 = r3.getNightMode$activity_release()
            r3 = 1
            if (r2 != 0) goto L31
            r0 = r3
        L31:
            r4.setNavigationBarContrastEnforced(r0)
            androidx.core.view.WindowInsetsControllerCompat r2 = new androidx.core.view.WindowInsetsControllerCompat
            r2.<init>(r4, r5)
            r4 = r6 ^ 1
            r2.setAppearanceLightStatusBars(r4)
            r3 = r3 ^ r7
            r2.setAppearanceLightNavigationBars(r3)
            return
    }
}
