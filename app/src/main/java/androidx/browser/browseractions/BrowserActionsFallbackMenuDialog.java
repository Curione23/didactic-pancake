package androidx.browser.browseractions;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
class BrowserActionsFallbackMenuDialog extends android.app.Dialog {
    private static final long ENTER_ANIMATION_DURATION_MS = 250;
    private static final long EXIT_ANIMATION_DURATION_MS = 150;
    private final android.view.View mContentView;


    BrowserActionsFallbackMenuDialog(android.content.Context r1, android.view.View r2) {
            r0 = this;
            r0.<init>(r1)
            r0.mContentView = r2
            return
    }

    static /* synthetic */ void access$001(androidx.browser.browseractions.BrowserActionsFallbackMenuDialog r0) {
            super.dismiss()
            return
    }

    private void startAnimation(boolean r6) {
            r5 = this;
            r0 = 0
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L7
            r2 = r0
            goto L8
        L7:
            r2 = r1
        L8:
            if (r6 == 0) goto Lb
            r0 = r1
        Lb:
            if (r6 == 0) goto L10
            r3 = 250(0xfa, double:1.235E-321)
            goto L12
        L10:
            r3 = 150(0x96, double:7.4E-322)
        L12:
            android.view.View r1 = r5.mContentView
            r1.setScaleX(r2)
            android.view.View r1 = r5.mContentView
            r1.setScaleY(r2)
            android.view.View r1 = r5.mContentView
            android.view.ViewPropertyAnimator r1 = r1.animate()
            android.view.ViewPropertyAnimator r1 = r1.scaleX(r0)
            android.view.ViewPropertyAnimator r0 = r1.scaleY(r0)
            android.view.ViewPropertyAnimator r0 = r0.setDuration(r3)
            androidx.interpolator.view.animation.LinearOutSlowInInterpolator r1 = new androidx.interpolator.view.animation.LinearOutSlowInInterpolator
            r1.<init>()
            android.view.ViewPropertyAnimator r0 = r0.setInterpolator(r1)
            androidx.browser.browseractions.BrowserActionsFallbackMenuDialog$1 r1 = new androidx.browser.browseractions.BrowserActionsFallbackMenuDialog$1
            r1.<init>(r5, r6)
            android.view.ViewPropertyAnimator r6 = r0.setListener(r1)
            r6.start()
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
            r1 = this;
            r0 = 0
            r1.startAnimation(r0)
            return
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(android.view.MotionEvent r1) {
            r0 = this;
            int r1 = r1.getAction()
            if (r1 != 0) goto Lb
            r0.dismiss()
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // android.app.Dialog
    public void show() {
            r3 = this;
            android.view.Window r0 = r3.getWindow()
            android.graphics.drawable.ColorDrawable r1 = new android.graphics.drawable.ColorDrawable
            r2 = 0
            r1.<init>(r2)
            r0.setBackgroundDrawable(r1)
            r0 = 1
            r3.startAnimation(r0)
            super.show()
            return
    }
}
