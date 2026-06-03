package androidx.core.text.method;

/* JADX INFO: loaded from: classes.dex */
public class LinkMovementMethodCompat extends android.text.method.LinkMovementMethod {
    private static androidx.core.text.method.LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.text.method.LinkMovementMethodCompat getInstance() {
            androidx.core.text.method.LinkMovementMethodCompat r0 = androidx.core.text.method.LinkMovementMethodCompat.sInstance
            if (r0 != 0) goto Lb
            androidx.core.text.method.LinkMovementMethodCompat r0 = new androidx.core.text.method.LinkMovementMethodCompat
            r0.<init>()
            androidx.core.text.method.LinkMovementMethodCompat.sInstance = r0
        Lb:
            androidx.core.text.method.LinkMovementMethodCompat r0 = androidx.core.text.method.LinkMovementMethodCompat.sInstance
            return r0
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public boolean onTouchEvent(android.widget.TextView r5, android.text.Spannable r6, android.view.MotionEvent r7) {
            r4 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastV()
            if (r0 != 0) goto L57
            int r0 = r7.getAction()
            r1 = 1
            if (r0 == r1) goto Lf
            if (r0 != 0) goto L57
        Lf:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            int r2 = r5.getTotalPaddingLeft()
            int r0 = r0 - r2
            int r2 = r5.getTotalPaddingTop()
            int r1 = r1 - r2
            int r2 = r5.getScrollX()
            int r0 = r0 + r2
            int r2 = r5.getScrollY()
            int r1 = r1 + r2
            android.text.Layout r2 = r5.getLayout()
            if (r1 < 0) goto L4f
            int r3 = r2.getHeight()
            if (r1 <= r3) goto L3a
            goto L4f
        L3a:
            int r1 = r2.getLineForVertical(r1)
            float r0 = (float) r0
            float r3 = r2.getLineLeft(r1)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 < 0) goto L4f
            float r1 = r2.getLineRight(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L57
        L4f:
            android.text.Selection.removeSelection(r6)
            boolean r5 = android.text.method.Touch.onTouchEvent(r5, r6, r7)
            return r5
        L57:
            boolean r5 = super.onTouchEvent(r5, r6, r7)
            return r5
    }
}
