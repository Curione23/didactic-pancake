package androidx.activity;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0017¨\u0006\u000f"}, d2 = {"Landroidx/activity/EdgeToEdgeApi23;", "Landroidx/activity/EdgeToEdgeImpl;", "()V", "setUp", "", "statusBarStyle", "Landroidx/activity/SystemBarStyle;", "navigationBarStyle", "window", "Landroid/view/Window;", "view", "Landroid/view/View;", "statusBarIsDark", "", "navigationBarIsDark", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class EdgeToEdgeApi23 implements androidx.activity.EdgeToEdgeImpl {
    public EdgeToEdgeApi23() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(androidx.activity.SystemBarStyle r1, androidx.activity.SystemBarStyle r2, android.view.Window r3, android.view.View r4, boolean r5, boolean r6) {
            r0 = this;
            java.lang.String r6 = "statusBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r6)
            java.lang.String r6 = "navigationBarStyle"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r6)
            java.lang.String r6 = "window"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            r6 = 0
            androidx.core.view.WindowCompat.setDecorFitsSystemWindows(r3, r6)
            int r1 = r1.getScrim$activity_release(r5)
            r3.setStatusBarColor(r1)
            int r1 = r2.getDarkScrim$activity_release()
            r3.setNavigationBarColor(r1)
            androidx.core.view.WindowInsetsControllerCompat r1 = new androidx.core.view.WindowInsetsControllerCompat
            r1.<init>(r3, r4)
            r2 = r5 ^ 1
            r1.setAppearanceLightStatusBars(r2)
            return
    }
}
