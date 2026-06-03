package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
class ShapeableDelegateV14 extends com.google.android.material.shape.ShapeableDelegate {
    ShapeableDelegateV14() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    void invalidateClippingMethod(android.view.View r2) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.shapeAppearanceModel
            if (r0 == 0) goto L16
            android.graphics.RectF r0 = r1.maskBounds
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L16
        Ld:
            boolean r0 = r1.shouldUseCompatClipping()
            if (r0 == 0) goto L16
            r2.invalidate()
        L16:
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    boolean shouldUseCompatClipping() {
            r1 = this;
            r0 = 1
            return r0
    }
}
