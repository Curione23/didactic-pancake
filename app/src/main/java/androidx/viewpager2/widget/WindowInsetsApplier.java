package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsApplier implements androidx.core.view.OnApplyWindowInsetsListener {
    private WindowInsetsApplier() {
            r0 = this;
            r0.<init>()
            return
    }

    private androidx.core.view.WindowInsetsCompat consumeAllInsets(androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            androidx.core.view.WindowInsetsCompat r0 = androidx.core.view.WindowInsetsCompat.CONSUMED
            android.view.WindowInsets r0 = r0.toWindowInsets()
            if (r0 == 0) goto Lb
            androidx.core.view.WindowInsetsCompat r2 = androidx.core.view.WindowInsetsCompat.CONSUMED
            return r2
        Lb:
            androidx.core.view.WindowInsetsCompat r2 = r2.consumeSystemWindowInsets()
            androidx.core.view.WindowInsetsCompat r2 = r2.consumeStableInsets()
            return r2
    }

    public static boolean install(androidx.viewpager2.widget.ViewPager2 r3) {
            android.content.Context r0 = r3.getContext()
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 < r2) goto L14
            int r0 = r0.targetSdkVersion
            if (r0 < r2) goto L14
            r3 = 0
            return r3
        L14:
            androidx.viewpager2.widget.WindowInsetsApplier r0 = new androidx.viewpager2.widget.WindowInsetsApplier
            r0.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r3, r0)
            r3 = 1
            return r3
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public androidx.core.view.WindowInsetsCompat onApplyWindowInsets(android.view.View r5, androidx.core.view.WindowInsetsCompat r6) {
            r4 = this;
            androidx.viewpager2.widget.ViewPager2 r5 = (androidx.viewpager2.widget.ViewPager2) r5
            androidx.core.view.WindowInsetsCompat r6 = androidx.core.view.ViewCompat.onApplyWindowInsets(r5, r6)
            boolean r0 = r6.isConsumed()
            if (r0 == 0) goto Ld
            return r6
        Ld:
            androidx.recyclerview.widget.RecyclerView r5 = r5.mRecyclerView
            int r0 = r5.getChildCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L25
            android.view.View r2 = r5.getChildAt(r1)
            androidx.core.view.WindowInsetsCompat r3 = new androidx.core.view.WindowInsetsCompat
            r3.<init>(r6)
            androidx.core.view.ViewCompat.dispatchApplyWindowInsets(r2, r3)
            int r1 = r1 + 1
            goto L14
        L25:
            androidx.core.view.WindowInsetsCompat r5 = r4.consumeAllInsets(r6)
            return r5
    }
}
