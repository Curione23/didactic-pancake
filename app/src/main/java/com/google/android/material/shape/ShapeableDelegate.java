package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
public abstract class ShapeableDelegate {
    boolean forceCompatClippingEnabled;
    android.graphics.RectF maskBounds;
    boolean offsetZeroCornerEdgeBoundsEnabled;
    com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModel;
    final android.graphics.Path shapePath;

    public ShapeableDelegate() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.forceCompatClippingEnabled = r0
            r1.offsetZeroCornerEdgeBoundsEnabled = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.maskBounds = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.shapePath = r0
            return
    }

    public static com.google.android.material.shape.ShapeableDelegate create(android.view.View r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto Lc
            com.google.android.material.shape.ShapeableDelegateV33 r0 = new com.google.android.material.shape.ShapeableDelegateV33
            r0.<init>(r2)
            return r0
        Lc:
            com.google.android.material.shape.ShapeableDelegateV22 r0 = new com.google.android.material.shape.ShapeableDelegateV22
            r0.<init>(r2)
            return r0
    }

    private boolean isMaskBoundsValid() {
            r2 = this;
            android.graphics.RectF r0 = r2.maskBounds
            float r0 = r0.left
            android.graphics.RectF r1 = r2.maskBounds
            float r1 = r1.right
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L1a
            android.graphics.RectF r0 = r2.maskBounds
            float r0 = r0.top
            android.graphics.RectF r1 = r2.maskBounds
            float r1 = r1.bottom
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    private void updateShapePath() {
            r5 = this;
            boolean r0 = r5.isMaskBoundsValid()
            if (r0 == 0) goto L19
            com.google.android.material.shape.ShapeAppearanceModel r0 = r5.shapeAppearanceModel
            if (r0 == 0) goto L19
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            com.google.android.material.shape.ShapeAppearanceModel r1 = r5.shapeAppearanceModel
            android.graphics.RectF r2 = r5.maskBounds
            android.graphics.Path r3 = r5.shapePath
            r4 = 1065353216(0x3f800000, float:1.0)
            r0.calculatePath(r1, r4, r2, r3)
        L19:
            return
    }

    abstract void invalidateClippingMethod(android.view.View r1);

    public boolean isForceCompatClippingEnabled() {
            r1 = this;
            boolean r0 = r1.forceCompatClippingEnabled
            return r0
    }

    public void maybeClip(android.graphics.Canvas r2, com.google.android.material.canvas.CanvasCompat.CanvasOperation r3) {
            r1 = this;
            boolean r0 = r1.shouldUseCompatClipping()
            if (r0 == 0) goto L1d
            android.graphics.Path r0 = r1.shapePath
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            r2.save()
            android.graphics.Path r0 = r1.shapePath
            r2.clipPath(r0)
            r3.run(r2)
            r2.restore()
            goto L20
        L1d:
            r3.run(r2)
        L20:
            return
    }

    public void onMaskChanged(android.view.View r1, android.graphics.RectF r2) {
            r0 = this;
            r0.maskBounds = r2
            r0.updateShapePath()
            r0.invalidateClippingMethod(r1)
            return
    }

    public void onShapeAppearanceChanged(android.view.View r1, com.google.android.material.shape.ShapeAppearanceModel r2) {
            r0 = this;
            r0.shapeAppearanceModel = r2
            r0.updateShapePath()
            r0.invalidateClippingMethod(r1)
            return
    }

    public void setForceCompatClippingEnabled(android.view.View r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.forceCompatClippingEnabled
            if (r3 == r0) goto L9
            r1.forceCompatClippingEnabled = r3
            r1.invalidateClippingMethod(r2)
        L9:
            return
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(android.view.View r1, boolean r2) {
            r0 = this;
            r0.offsetZeroCornerEdgeBoundsEnabled = r2
            r0.invalidateClippingMethod(r1)
            return
    }

    abstract boolean shouldUseCompatClipping();
}
