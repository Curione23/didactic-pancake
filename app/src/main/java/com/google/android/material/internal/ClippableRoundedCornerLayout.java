package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
public class ClippableRoundedCornerLayout extends android.widget.FrameLayout {
    private float cornerRadius;
    private android.graphics.Path path;

    public ClippableRoundedCornerLayout(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public ClippableRoundedCornerLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public ClippableRoundedCornerLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.Path r0 = r2.path
            if (r0 != 0) goto L8
            super.dispatchDraw(r3)
            return
        L8:
            int r0 = r3.save()
            android.graphics.Path r1 = r2.path
            r3.clipPath(r1)
            super.dispatchDraw(r3)
            r3.restoreToCount(r0)
            return
    }

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.cornerRadius
            return r0
    }

    public void resetClipBoundsAndCornerRadius() {
            r1 = this;
            r0 = 0
            r1.path = r0
            r0 = 0
            r1.cornerRadius = r0
            r1.invalidate()
            return
    }

    public void updateClipBoundsAndCornerRadius(float r2, float r3, float r4, float r5, float r6) {
            r1 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r2, r3, r4, r5)
            r1.updateClipBoundsAndCornerRadius(r0, r6)
            return
    }

    public void updateClipBoundsAndCornerRadius(android.graphics.Rect r8, float r9) {
            r7 = this;
            int r0 = r8.left
            float r2 = (float) r0
            int r0 = r8.top
            float r3 = (float) r0
            int r0 = r8.right
            float r4 = (float) r0
            int r8 = r8.bottom
            float r5 = (float) r8
            r1 = r7
            r6 = r9
            r1.updateClipBoundsAndCornerRadius(r2, r3, r4, r5, r6)
            return
    }

    public void updateClipBoundsAndCornerRadius(android.graphics.RectF r3, float r4) {
            r2 = this;
            android.graphics.Path r0 = r2.path
            if (r0 != 0) goto Lb
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.path = r0
        Lb:
            r2.cornerRadius = r4
            android.graphics.Path r0 = r2.path
            r0.reset()
            android.graphics.Path r0 = r2.path
            android.graphics.Path$Direction r1 = android.graphics.Path.Direction.CW
            r0.addRoundRect(r3, r4, r4, r1)
            android.graphics.Path r3 = r2.path
            r3.close()
            r2.invalidate()
            return
    }

    public void updateCornerRadius(float r8) {
            r7 = this;
            int r0 = r7.getLeft()
            float r2 = (float) r0
            int r0 = r7.getTop()
            float r3 = (float) r0
            int r0 = r7.getRight()
            float r4 = (float) r0
            int r0 = r7.getBottom()
            float r5 = (float) r0
            r1 = r7
            r6 = r8
            r1.updateClipBoundsAndCornerRadius(r2, r3, r4, r5, r6)
            return
    }
}
