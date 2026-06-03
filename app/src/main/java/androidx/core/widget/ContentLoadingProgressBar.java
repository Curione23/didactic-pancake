package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends android.widget.ProgressBar {
    private static final int MIN_DELAY_MS = 500;
    private static final int MIN_SHOW_TIME_MS = 500;
    private final java.lang.Runnable mDelayedHide;
    private final java.lang.Runnable mDelayedShow;
    boolean mDismissed;
    boolean mPostedHide;
    boolean mPostedShow;
    long mStartTime;

    /* JADX INFO: renamed from: $r8$lambda$-QLbnDmeB_t0R62xLMJCkjyagZI, reason: not valid java name */
    public static /* synthetic */ void m47$r8$lambda$QLbnDmeB_t0R62xLMJCkjyagZI(androidx.core.widget.ContentLoadingProgressBar r0) {
            r0.showOnUiThread()
            return
    }

    /* JADX INFO: renamed from: $r8$lambda$LzWHroRwziRn4m5pH-wlpZWokBw, reason: not valid java name */
    public static /* synthetic */ void m48$r8$lambda$LzWHroRwziRn4m5pHwlpZWokBw(androidx.core.widget.ContentLoadingProgressBar r0) {
            r0.hideOnUiThread()
            return
    }

    public ContentLoadingProgressBar(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ContentLoadingProgressBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            r2 = -1
            r1.mStartTime = r2
            r1.mPostedHide = r0
            r1.mPostedShow = r0
            r1.mDismissed = r0
            androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0 r2 = new androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda0
            r2.<init>(r1)
            r1.mDelayedHide = r2
            androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda1 r2 = new androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda1
            r2.<init>(r1)
            r1.mDelayedShow = r2
            return
    }

    private void hideOnUiThread() {
            r9 = this;
            r0 = 1
            r9.mDismissed = r0
            java.lang.Runnable r1 = r9.mDelayedShow
            r9.removeCallbacks(r1)
            r1 = 0
            r9.mPostedShow = r1
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r9.mStartTime
            long r1 = r1 - r3
            r5 = 500(0x1f4, double:2.47E-321)
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 >= 0) goto L2c
            r7 = -1
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 != 0) goto L1f
            goto L2c
        L1f:
            boolean r3 = r9.mPostedHide
            if (r3 != 0) goto L31
            java.lang.Runnable r3 = r9.mDelayedHide
            long r5 = r5 - r1
            r9.postDelayed(r3, r5)
            r9.mPostedHide = r0
            goto L31
        L2c:
            r0 = 8
            r9.setVisibility(r0)
        L31:
            return
    }

    private void removeCallbacks() {
            r1 = this;
            java.lang.Runnable r0 = r1.mDelayedHide
            r1.removeCallbacks(r0)
            java.lang.Runnable r0 = r1.mDelayedShow
            r1.removeCallbacks(r0)
            return
    }

    private void showOnUiThread() {
            r3 = this;
            r0 = -1
            r3.mStartTime = r0
            r0 = 0
            r3.mDismissed = r0
            java.lang.Runnable r1 = r3.mDelayedHide
            r3.removeCallbacks(r1)
            r3.mPostedHide = r0
            boolean r0 = r3.mPostedShow
            if (r0 != 0) goto L1c
            java.lang.Runnable r0 = r3.mDelayedShow
            r1 = 500(0x1f4, double:2.47E-321)
            r3.postDelayed(r0, r1)
            r0 = 1
            r3.mPostedShow = r0
        L1c:
            return
    }

    public void hide() {
            r1 = this;
            androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda3 r0 = new androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda3
            r0.<init>(r1)
            r1.post(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-core-widget-ContentLoadingProgressBar, reason: not valid java name */
    /* synthetic */ void m49lambda$new$0$androidxcorewidgetContentLoadingProgressBar() {
            r2 = this;
            r0 = 0
            r2.mPostedHide = r0
            r0 = -1
            r2.mStartTime = r0
            r0 = 8
            r2.setVisibility(r0)
            return
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-core-widget-ContentLoadingProgressBar, reason: not valid java name */
    /* synthetic */ void m50lambda$new$1$androidxcorewidgetContentLoadingProgressBar() {
            r3 = this;
            r0 = 0
            r3.mPostedShow = r0
            boolean r1 = r3.mDismissed
            if (r1 != 0) goto L10
            long r1 = java.lang.System.currentTimeMillis()
            r3.mStartTime = r1
            r3.setVisibility(r0)
        L10:
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.removeCallbacks()
            return
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.removeCallbacks()
            return
    }

    public void show() {
            r1 = this;
            androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda2 r0 = new androidx.core.widget.ContentLoadingProgressBar$$ExternalSyntheticLambda2
            r0.<init>(r1)
            r1.post(r0)
            return
    }
}
