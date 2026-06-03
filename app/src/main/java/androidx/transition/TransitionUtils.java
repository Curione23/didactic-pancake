package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
class TransitionUtils {
    private static final boolean HAS_PICTURE_BITMAP = false;
    private static final int MAX_IMAGE_SIZE = 1048576;

    static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.graphics.Bitmap createBitmap(android.graphics.Picture r0) {
                android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0)
                return r0
        }
    }

    static class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
        final float[] mTempEndValues;
        final android.graphics.Matrix mTempMatrix;
        final float[] mTempStartValues;

        MatrixEvaluator() {
                r2 = this;
                r2.<init>()
                r0 = 9
                float[] r1 = new float[r0]
                r2.mTempStartValues = r1
                float[] r0 = new float[r0]
                r2.mTempEndValues = r0
                android.graphics.Matrix r0 = new android.graphics.Matrix
                r0.<init>()
                r2.mTempMatrix = r0
                return
        }

        /* JADX INFO: renamed from: evaluate, reason: avoid collision after fix types in other method */
        public android.graphics.Matrix evaluate2(float r3, android.graphics.Matrix r4, android.graphics.Matrix r5) {
                r2 = this;
                float[] r0 = r2.mTempStartValues
                r4.getValues(r0)
                float[] r4 = r2.mTempEndValues
                r5.getValues(r4)
                r4 = 0
            Lb:
                r5 = 9
                if (r4 >= r5) goto L1f
                float[] r5 = r2.mTempEndValues
                r0 = r5[r4]
                float[] r1 = r2.mTempStartValues
                r1 = r1[r4]
                float r0 = r0 - r1
                float r0 = r0 * r3
                float r1 = r1 + r0
                r5[r4] = r1
                int r4 = r4 + 1
                goto Lb
            L1f:
                android.graphics.Matrix r3 = r2.mTempMatrix
                float[] r4 = r2.mTempEndValues
                r3.setValues(r4)
                android.graphics.Matrix r3 = r2.mTempMatrix
                return r3
        }

        @Override // android.animation.TypeEvaluator
        public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
                r0 = this;
                android.graphics.Matrix r2 = (android.graphics.Matrix) r2
                android.graphics.Matrix r3 = (android.graphics.Matrix) r3
                android.graphics.Matrix r1 = r0.evaluate2(r1, r2, r3)
                return r1
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.transition.TransitionUtils.HAS_PICTURE_BITMAP = r0
            return
    }

    private TransitionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.view.View copyViewImage(android.view.ViewGroup r7, android.view.View r8, android.view.View r9) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            int r1 = r9.getScrollX()
            int r1 = -r1
            float r1 = (float) r1
            int r9 = r9.getScrollY()
            int r9 = -r9
            float r9 = (float) r9
            r0.setTranslate(r1, r9)
            androidx.transition.ViewUtils.transformMatrixToGlobal(r8, r0)
            androidx.transition.ViewUtils.transformMatrixToLocal(r7, r0)
            android.graphics.RectF r9 = new android.graphics.RectF
            int r1 = r8.getWidth()
            float r1 = (float) r1
            int r2 = r8.getHeight()
            float r2 = (float) r2
            r3 = 0
            r9.<init>(r3, r3, r1, r2)
            r0.mapRect(r9)
            float r1 = r9.left
            int r1 = java.lang.Math.round(r1)
            float r2 = r9.top
            int r2 = java.lang.Math.round(r2)
            float r3 = r9.right
            int r3 = java.lang.Math.round(r3)
            float r4 = r9.bottom
            int r4 = java.lang.Math.round(r4)
            android.widget.ImageView r5 = new android.widget.ImageView
            android.content.Context r6 = r8.getContext()
            r5.<init>(r6)
            android.widget.ImageView$ScaleType r6 = android.widget.ImageView.ScaleType.CENTER_CROP
            r5.setScaleType(r6)
            android.graphics.Bitmap r7 = createViewBitmap(r8, r0, r9, r7)
            if (r7 == 0) goto L5c
            r5.setImageBitmap(r7)
        L5c:
            int r7 = r3 - r1
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r9 = r4 - r2
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r8)
            r5.measure(r7, r8)
            r5.layout(r1, r2, r3, r4)
            return r5
    }

    private static android.graphics.Bitmap createViewBitmap(android.view.View r7, android.graphics.Matrix r8, android.graphics.RectF r9, android.view.ViewGroup r10) {
            boolean r0 = r7.isAttachedToWindow()
            r1 = 0
            if (r10 == 0) goto Lf
            boolean r2 = r10.isAttachedToWindow()
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = r1
        L10:
            r3 = 0
            if (r0 != 0) goto L28
            if (r2 != 0) goto L16
            return r3
        L16:
            android.view.ViewParent r1 = r7.getParent()
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = r1.indexOfChild(r7)
            android.view.ViewGroupOverlay r4 = r10.getOverlay()
            r4.add(r7)
            goto L2a
        L28:
            r2 = r1
            r1 = r3
        L2a:
            float r4 = r9.width()
            int r4 = java.lang.Math.round(r4)
            float r5 = r9.height()
            int r5 = java.lang.Math.round(r5)
            if (r4 <= 0) goto L8e
            if (r5 <= 0) goto L8e
            int r3 = r4 * r5
            float r3 = (float) r3
            r6 = 1233125376(0x49800000, float:1048576.0)
            float r6 = r6 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = java.lang.Math.min(r3, r6)
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = java.lang.Math.round(r4)
            float r5 = (float) r5
            float r5 = r5 * r3
            int r5 = java.lang.Math.round(r5)
            float r6 = r9.left
            float r6 = -r6
            float r9 = r9.top
            float r9 = -r9
            r8.postTranslate(r6, r9)
            r8.postScale(r3, r3)
            boolean r9 = androidx.transition.TransitionUtils.HAS_PICTURE_BITMAP
            if (r9 == 0) goto L7d
            android.graphics.Picture r9 = new android.graphics.Picture
            r9.<init>()
            android.graphics.Canvas r3 = r9.beginRecording(r4, r5)
            r3.concat(r8)
            r7.draw(r3)
            r9.endRecording()
            android.graphics.Bitmap r3 = androidx.transition.TransitionUtils.Api28Impl.createBitmap(r9)
            goto L8e
        L7d:
            android.graphics.Bitmap$Config r9 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r4, r5, r9)
            android.graphics.Canvas r9 = new android.graphics.Canvas
            r9.<init>(r3)
            r9.concat(r8)
            r7.draw(r9)
        L8e:
            if (r0 != 0) goto L9a
            android.view.ViewGroupOverlay r8 = r10.getOverlay()
            r8.remove(r7)
            r1.addView(r7, r2)
        L9a:
            return r3
    }

    static android.animation.Animator mergeAnimators(android.animation.Animator r3, android.animation.Animator r4) {
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            return r3
        L6:
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r1 = 2
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r2 = 0
            r1[r2] = r3
            r3 = 1
            r1[r3] = r4
            r0.playTogether(r1)
            return r0
    }
}
