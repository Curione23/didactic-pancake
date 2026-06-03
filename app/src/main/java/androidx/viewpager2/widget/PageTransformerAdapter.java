package androidx.viewpager2.widget;

/* JADX INFO: loaded from: classes.dex */
final class PageTransformerAdapter extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
    private final androidx.recyclerview.widget.LinearLayoutManager mLayoutManager;
    private androidx.viewpager2.widget.ViewPager2.PageTransformer mPageTransformer;

    PageTransformerAdapter(androidx.recyclerview.widget.LinearLayoutManager r1) {
            r0 = this;
            r0.<init>()
            r0.mLayoutManager = r1
            return
    }

    androidx.viewpager2.widget.ViewPager2.PageTransformer getPageTransformer() {
            r1 = this;
            androidx.viewpager2.widget.ViewPager2$PageTransformer r0 = r1.mPageTransformer
            return r0
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int r1) {
            r0 = this;
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int r4, float r5, int r6) {
            r3 = this;
            androidx.viewpager2.widget.ViewPager2$PageTransformer r6 = r3.mPageTransformer
            if (r6 != 0) goto L5
            return
        L5:
            float r5 = -r5
            r6 = 0
        L7:
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.mLayoutManager
            int r0 = r0.getChildCount()
            if (r6 >= r0) goto L48
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.mLayoutManager
            android.view.View r0 = r0.getChildAt(r6)
            if (r0 == 0) goto L28
            androidx.recyclerview.widget.LinearLayoutManager r1 = r3.mLayoutManager
            int r1 = r1.getPosition(r0)
            int r1 = r1 - r4
            float r1 = (float) r1
            float r1 = r1 + r5
            androidx.viewpager2.widget.ViewPager2$PageTransformer r2 = r3.mPageTransformer
            r2.transformPage(r0, r1)
            int r6 = r6 + 1
            goto L7
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.util.Locale r5 = java.util.Locale.US
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            androidx.recyclerview.widget.LinearLayoutManager r0 = r3.mLayoutManager
            int r0 = r0.getChildCount()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r0}
            java.lang.String r0 = "LayoutManager returned a null child at pos %d/%d while transforming pages"
            java.lang.String r5 = java.lang.String.format(r5, r0, r6)
            r4.<init>(r5)
            throw r4
        L48:
            return
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int r1) {
            r0 = this;
            return
    }

    void setPageTransformer(androidx.viewpager2.widget.ViewPager2.PageTransformer r1) {
            r0 = this;
            r0.mPageTransformer = r1
            return
    }
}
