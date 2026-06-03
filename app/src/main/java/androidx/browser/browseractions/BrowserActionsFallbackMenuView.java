package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class BrowserActionsFallbackMenuView extends android.widget.LinearLayout {
    private final int mBrowserActionsMenuMaxWidthPx;
    private final int mBrowserActionsMenuMinPaddingPx;

    public BrowserActionsFallbackMenuView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.content.res.Resources r1 = r0.getResources()
            int r2 = androidx.browser.R.dimen.browser_actions_context_menu_min_padding
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.mBrowserActionsMenuMinPaddingPx = r1
            android.content.res.Resources r1 = r0.getResources()
            int r2 = androidx.browser.R.dimen.browser_actions_context_menu_max_width
            int r1 = r1.getDimensionPixelOffset(r2)
            r0.mBrowserActionsMenuMaxWidthPx = r1
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            android.content.res.Resources r2 = r1.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.widthPixels
            int r0 = r1.mBrowserActionsMenuMinPaddingPx
            int r0 = r0 * 2
            int r2 = r2 - r0
            int r0 = r1.mBrowserActionsMenuMaxWidthPx
            int r2 = java.lang.Math.min(r2, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            super.onMeasure(r2, r3)
            return
    }
}
