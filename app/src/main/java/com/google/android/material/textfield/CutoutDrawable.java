package com.google.android.material.textfield;

/* JADX INFO: loaded from: classes.dex */
class CutoutDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
    com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState drawableState;

    /* JADX INFO: renamed from: com.google.android.material.textfield.CutoutDrawable$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    private static final class CutoutDrawableState extends com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState {
        private final android.graphics.RectF cutoutBounds;

        private CutoutDrawableState(com.google.android.material.shape.ShapeAppearanceModel r2, android.graphics.RectF r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                r1.cutoutBounds = r3
                return
        }

        /* synthetic */ CutoutDrawableState(com.google.android.material.shape.ShapeAppearanceModel r1, android.graphics.RectF r2, com.google.android.material.textfield.CutoutDrawable.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private CutoutDrawableState(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r1) {
                r0 = this;
                r0.<init>(r1)
                android.graphics.RectF r1 = r1.cutoutBounds
                r0.cutoutBounds = r1
                return
        }

        /* synthetic */ CutoutDrawableState(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r1, com.google.android.material.textfield.CutoutDrawable.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ android.graphics.RectF access$200(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r0) {
                android.graphics.RectF r0 = r0.cutoutBounds
                return r0
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
                r1 = this;
                com.google.android.material.textfield.CutoutDrawable r0 = com.google.android.material.textfield.CutoutDrawable.access$400(r1)
                r0.invalidateSelf()
                return r0
        }
    }

    private static class ImplApi14 extends com.google.android.material.textfield.CutoutDrawable {
        private android.graphics.Paint cutoutPaint;
        private int savedLayer;

        ImplApi14(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        private android.graphics.Paint getCutoutPaint() {
                r3 = this;
                android.graphics.Paint r0 = r3.cutoutPaint
                if (r0 != 0) goto L23
                android.graphics.Paint r0 = new android.graphics.Paint
                r1 = 1
                r0.<init>(r1)
                r3.cutoutPaint = r0
                android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
                r0.setStyle(r1)
                android.graphics.Paint r0 = r3.cutoutPaint
                r1 = -1
                r0.setColor(r1)
                android.graphics.Paint r0 = r3.cutoutPaint
                android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
                android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
                r1.<init>(r2)
                r0.setXfermode(r1)
            L23:
                android.graphics.Paint r0 = r3.cutoutPaint
                return r0
        }

        private void postDraw(android.graphics.Canvas r2) {
                r1 = this;
                android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
                boolean r0 = r1.useHardwareLayer(r0)
                if (r0 != 0) goto Lf
                int r0 = r1.savedLayer
                r2.restoreToCount(r0)
            Lf:
                return
        }

        private void preDraw(android.graphics.Canvas r3) {
                r2 = this;
                android.graphics.drawable.Drawable$Callback r0 = r2.getCallback()
                boolean r1 = r2.useHardwareLayer(r0)
                if (r1 == 0) goto L18
                android.view.View r0 = (android.view.View) r0
                int r3 = r0.getLayerType()
                r1 = 2
                if (r3 == r1) goto L1b
                r3 = 0
                r0.setLayerType(r1, r3)
                goto L1b
            L18:
                r2.saveCanvasLayer(r3)
            L1b:
                return
        }

        private void saveCanvasLayer(android.graphics.Canvas r8) {
                r7 = this;
                int r0 = r8.getWidth()
                float r4 = (float) r0
                int r0 = r8.getHeight()
                float r5 = (float) r0
                r6 = 0
                r2 = 0
                r3 = 0
                r1 = r8
                int r8 = r1.saveLayer(r2, r3, r4, r5, r6)
                r7.savedLayer = r8
                return
        }

        private boolean useHardwareLayer(android.graphics.drawable.Drawable.Callback r1) {
                r0 = this;
                boolean r1 = r1 instanceof android.view.View
                return r1
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
        public void draw(android.graphics.Canvas r1) {
                r0 = this;
                r0.preDraw(r1)
                super.draw(r1)
                r0.postDraw(r1)
                return
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        protected void drawStrokeShape(android.graphics.Canvas r3) {
                r2 = this;
                super.drawStrokeShape(r3)
                com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r2.drawableState
                android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
                android.graphics.Paint r1 = r2.getCutoutPaint()
                r3.drawRect(r0, r1)
                return
        }
    }

    private static class ImplApi18 extends com.google.android.material.textfield.CutoutDrawable {
        ImplApi18(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // com.google.android.material.shape.MaterialShapeDrawable
        protected void drawStrokeShape(android.graphics.Canvas r2) {
                r1 = this;
                com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
                android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L10
                super.drawStrokeShape(r2)
                goto L22
            L10:
                r2.save()
                com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
                android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
                r2.clipOutRect(r0)
                super.drawStrokeShape(r2)
                r2.restore()
            L22:
                return
        }
    }

    private CutoutDrawable(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r1) {
            r0 = this;
            r0.<init>(r1)
            r0.drawableState = r1
            return
    }

    /* synthetic */ CutoutDrawable(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r1, com.google.android.material.textfield.CutoutDrawable.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ com.google.android.material.textfield.CutoutDrawable access$400(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r0) {
            com.google.android.material.textfield.CutoutDrawable r0 = create(r0)
            return r0
    }

    static com.google.android.material.textfield.CutoutDrawable create(com.google.android.material.shape.ShapeAppearanceModel r3) {
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = new com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState
            if (r3 == 0) goto L5
            goto La
        L5:
            com.google.android.material.shape.ShapeAppearanceModel r3 = new com.google.android.material.shape.ShapeAppearanceModel
            r3.<init>()
        La:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r2 = 0
            r0.<init>(r3, r1, r2)
            com.google.android.material.textfield.CutoutDrawable r3 = create(r0)
            return r3
    }

    private static com.google.android.material.textfield.CutoutDrawable create(com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState r1) {
            com.google.android.material.textfield.CutoutDrawable$ImplApi18 r0 = new com.google.android.material.textfield.CutoutDrawable$ImplApi18
            r0.<init>(r1)
            return r0
    }

    boolean hasCutout() {
            r1 = this;
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
            android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r3 = this;
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = new com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r1 = r3.drawableState
            r2 = 0
            r0.<init>(r1, r2)
            r3.drawableState = r0
            return r3
    }

    void removeCutout() {
            r1 = this;
            r0 = 0
            r1.setCutout(r0, r0, r0, r0)
            return
    }

    void setCutout(float r2, float r3, float r4, float r5) {
            r1 = this;
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
            android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
            float r0 = r0.left
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L30
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
            android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
            float r0 = r0.top
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L30
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
            android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
            float r0 = r0.right
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L30
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
            android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
            float r0 = r0.bottom
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L3c
        L30:
            com.google.android.material.textfield.CutoutDrawable$CutoutDrawableState r0 = r1.drawableState
            android.graphics.RectF r0 = com.google.android.material.textfield.CutoutDrawable.CutoutDrawableState.access$200(r0)
            r0.set(r2, r3, r4, r5)
            r1.invalidateSelf()
        L3c:
            return
    }

    void setCutout(android.graphics.RectF r4) {
            r3 = this;
            float r0 = r4.left
            float r1 = r4.top
            float r2 = r4.right
            float r4 = r4.bottom
            r3.setCutout(r0, r1, r2, r4)
            return
    }
}
