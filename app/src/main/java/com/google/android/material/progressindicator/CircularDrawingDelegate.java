package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
final class CircularDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.CircularProgressIndicatorSpec> {
    private static final float ROUND_CAP_RAMP_DOWN_THRESHHOLD = 0.01f;
    private float adjustedRadius;
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private boolean useStrokeCap;

    CircularDrawingDelegate(com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void drawArc(android.graphics.Canvas r15, android.graphics.Paint r16, float r17, float r18, int r19, int r20, int r21) {
            r14 = this;
            r8 = r14
            r9 = r16
            int r0 = (r18 > r17 ? 1 : (r18 == r17 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 < 0) goto Lc
            float r0 = r18 - r17
            goto L10
        Lc:
            float r0 = r18 + r1
            float r0 = r0 - r17
        L10:
            float r3 = r17 % r1
            float r2 = r8.totalTrackLengthFraction
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 >= 0) goto L36
            float r10 = r3 + r0
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 <= 0) goto L36
            r4 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r5 = r19
            r6 = r20
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7)
            r3 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r4 = r10
            r7 = r21
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7)
            return
        L36:
            float r2 = r8.displayedCornerRadius
            float r4 = r8.adjustedRadius
            float r2 = r2 / r4
            double r4 = (double) r2
            double r4 = java.lang.Math.toDegrees(r4)
            float r6 = (float) r4
            r7 = 0
            int r2 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            r4 = 1135869952(0x43b40000, float:360.0)
            r10 = 1073741824(0x40000000, float:2.0)
            if (r2 != 0) goto L5c
            r2 = 1065185444(0x3f7d70a4, float:0.99)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L5c
            float r2 = r0 - r2
            float r5 = r6 * r10
            float r5 = r5 / r4
            float r2 = r2 * r5
            r5 = 1008981770(0x3c23d70a, float:0.01)
            float r2 = r2 / r5
            float r0 = r0 + r2
        L5c:
            float r2 = r8.totalTrackLengthFraction
            float r2 = r1 - r2
            float r1 = com.google.android.material.math.MathUtils.lerp(r2, r1, r3)
            float r2 = r8.totalTrackLengthFraction
            float r0 = com.google.android.material.math.MathUtils.lerp(r7, r2, r0)
            r2 = r20
            float r2 = (float) r2
            float r3 = r8.adjustedRadius
            float r2 = r2 / r3
            double r2 = (double) r2
            double r2 = java.lang.Math.toDegrees(r2)
            float r2 = (float) r2
            r3 = r21
            float r3 = (float) r3
            float r5 = r8.adjustedRadius
            float r3 = r3 / r5
            double r11 = (double) r3
            double r11 = java.lang.Math.toDegrees(r11)
            float r3 = (float) r11
            float r0 = r0 * r4
            float r0 = r0 - r2
            float r11 = r0 - r3
            float r1 = r1 * r4
            float r12 = r1 + r2
            int r0 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r0 > 0) goto L8e
            return
        L8e:
            r0 = 1
            r9.setAntiAlias(r0)
            r0 = r19
            r9.setColor(r0)
            float r0 = r8.displayedTrackThickness
            r9.setStrokeWidth(r0)
            float r0 = r6 * r10
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lbb
            float r7 = r11 / r0
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r9.setStyle(r0)
            float r6 = r6 * r7
            float r3 = r12 + r6
            float r0 = r8.displayedCornerRadius
            float r4 = r0 * r10
            float r5 = r8.displayedTrackThickness
            r0 = r14
            r1 = r15
            r2 = r16
            r6 = r7
            r0.drawRoundedBlock(r1, r2, r3, r4, r5, r6)
            goto L10b
        Lbb:
            android.graphics.RectF r1 = new android.graphics.RectF
            float r2 = r8.adjustedRadius
            float r3 = -r2
            float r4 = -r2
            r1.<init>(r3, r4, r2, r2)
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r9.setStyle(r2)
            boolean r2 = r8.useStrokeCap
            if (r2 == 0) goto Ld0
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.ROUND
            goto Ld2
        Ld0:
            android.graphics.Paint$Cap r2 = android.graphics.Paint.Cap.BUTT
        Ld2:
            r9.setStrokeCap(r2)
            float r13 = r12 + r6
            float r3 = r11 - r0
            r4 = 0
            r0 = r15
            r2 = r13
            r5 = r16
            r0.drawArc(r1, r2, r3, r4, r5)
            boolean r0 = r8.useStrokeCap
            if (r0 != 0) goto L10b
            float r0 = r8.displayedCornerRadius
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 <= 0) goto L10b
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r9.setStyle(r0)
            float r0 = r8.displayedCornerRadius
            float r4 = r0 * r10
            float r5 = r8.displayedTrackThickness
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r13
            r0.drawRoundedBlock(r1, r2, r3, r4, r5)
            float r12 = r12 + r11
            float r3 = r12 - r6
            float r0 = r8.displayedCornerRadius
            float r4 = r0 * r10
            float r5 = r8.displayedTrackThickness
            r0 = r14
            r0.drawRoundedBlock(r1, r2, r3, r4, r5)
        L10b:
            return
    }

    private void drawRoundedBlock(android.graphics.Canvas r8, android.graphics.Paint r9, float r10, float r11, float r12) {
            r7 = this;
            r6 = 1065353216(0x3f800000, float:1.0)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.drawRoundedBlock(r1, r2, r3, r4, r5, r6)
            return
    }

    private void drawRoundedBlock(android.graphics.Canvas r7, android.graphics.Paint r8, float r9, float r10, float r11, float r12) {
            r6 = this;
            float r0 = r6.displayedTrackThickness
            float r11 = java.lang.Math.min(r11, r0)
            int r11 = (int) r11
            float r11 = (float) r11
            float r0 = r6.displayedCornerRadius
            float r0 = r0 * r11
            float r1 = r6.displayedTrackThickness
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r1
            float r0 = java.lang.Math.min(r2, r0)
            android.graphics.RectF r3 = new android.graphics.RectF
            float r4 = -r11
            float r4 = r4 / r1
            float r10 = -r10
            float r10 = r10 / r1
            float r11 = r11 / r1
            r3.<init>(r4, r10, r11, r2)
            r7.save()
            float r10 = r6.adjustedRadius
            double r10 = (double) r10
            double r1 = (double) r9
            double r4 = java.lang.Math.toRadians(r1)
            double r4 = java.lang.Math.cos(r4)
            double r10 = r10 * r4
            float r10 = (float) r10
            float r11 = r6.adjustedRadius
            double r4 = (double) r11
            double r1 = java.lang.Math.toRadians(r1)
            double r1 = java.lang.Math.sin(r1)
            double r4 = r4 * r1
            float r11 = (float) r4
            r7.translate(r10, r11)
            r7.rotate(r9)
            r7.scale(r12, r12)
            r7.drawRoundRect(r3, r0, r0, r8)
            r7.restore()
            return
    }

    private int getSize() {
            r2 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r0
            int r0 = r0.indicatorSize
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r2.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.indicatorInset
            int r1 = r1 * 2
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(android.graphics.Canvas r8, android.graphics.Rect r9, float r10, boolean r11, boolean r12) {
            r7 = this;
            int r0 = r9.width()
            float r0 = (float) r0
            int r1 = r7.getPreferredWidth()
            float r1 = (float) r1
            float r0 = r0 / r1
            int r1 = r9.height()
            float r1 = (float) r1
            int r2 = r7.getPreferredHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r2 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r2 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r2
            int r2 = r2.indicatorSize
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r4 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r4 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r4
            int r4 = r4.indicatorInset
            float r4 = (float) r4
            float r2 = r2 + r4
            float r4 = r2 * r0
            float r5 = r2 * r1
            int r6 = r9.left
            float r6 = (float) r6
            float r4 = r4 + r6
            int r9 = r9.top
            float r9 = (float) r9
            float r5 = r5 + r9
            r8.translate(r4, r5)
            r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
            r8.rotate(r9)
            r8.scale(r0, r1)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r9 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r9
            int r9 = r9.indicatorDirection
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L4e
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.scale(r0, r9)
        L4e:
            float r9 = -r2
            r8.clipRect(r9, r9, r2, r2)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.trackThickness
            r9 = 2
            int r8 = r8 / r9
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.trackCornerRadius
            r2 = 1
            if (r8 > r1) goto L65
            r8 = r2
            goto L66
        L65:
            r8 = 0
        L66:
            r7.useStrokeCap = r8
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.trackThickness
            float r8 = (float) r8
            float r8 = r8 * r10
            r7.displayedTrackThickness = r8
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.trackThickness
            int r8 = r8 / r9
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.trackCornerRadius
            int r8 = java.lang.Math.min(r8, r1)
            float r8 = (float) r8
            float r8 = r8 * r10
            r7.displayedCornerRadius = r8
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.indicatorSize
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r1 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r1 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r1
            int r1 = r1.trackThickness
            int r8 = r8 - r1
            float r8 = (float) r8
            float r8 = r8 / r3
            r7.adjustedRadius = r8
            if (r11 != 0) goto L9c
            if (r12 == 0) goto Le5
        L9c:
            if (r11 == 0) goto La6
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.showAnimationBehavior
            if (r8 == r9) goto Lb0
        La6:
            if (r12 == 0) goto Lc1
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.hideAnimationBehavior
            if (r8 != r2) goto Lc1
        Lb0:
            float r8 = r7.adjustedRadius
            float r9 = r0 - r10
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r11 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r11 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r11
            int r11 = r11.trackThickness
            float r11 = (float) r11
            float r9 = r9 * r11
            float r9 = r9 / r3
            float r8 = r8 + r9
            r7.adjustedRadius = r8
            goto Le5
        Lc1:
            if (r11 == 0) goto Lcb
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.showAnimationBehavior
            if (r8 == r2) goto Ld5
        Lcb:
            if (r12 == 0) goto Le5
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.hideAnimationBehavior
            if (r8 != r9) goto Le5
        Ld5:
            float r8 = r7.adjustedRadius
            float r9 = r0 - r10
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r11 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r11 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r11
            int r11 = r11.trackThickness
            float r11 = (float) r11
            float r9 = r9 * r11
            float r9 = r9 / r3
            float r8 = r8 - r9
            r7.adjustedRadius = r8
        Le5:
            if (r12 == 0) goto Lf3
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.CircularProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.CircularProgressIndicatorSpec) r8
            int r8 = r8.hideAnimationBehavior
            r9 = 3
            if (r8 != r9) goto Lf3
            r7.totalTrackLengthFraction = r10
            goto Lf5
        Lf3:
            r7.totalTrackLengthFraction = r0
        Lf5:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void drawStopIndicator(android.graphics.Canvas r1, android.graphics.Paint r2, int r3, int r4) {
            r0 = this;
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillIndicator(android.graphics.Canvas r10, android.graphics.Paint r11, com.google.android.material.progressindicator.DrawingDelegate.ActiveIndicator r12, int r13) {
            r9 = this;
            int r0 = r12.color
            int r6 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r0, r13)
            float r4 = r12.startFraction
            float r5 = r12.endFraction
            int r7 = r12.gapSize
            int r8 = r12.gapSize
            r1 = r9
            r2 = r10
            r3 = r11
            r1.drawArc(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void fillTrack(android.graphics.Canvas r9, android.graphics.Paint r10, float r11, float r12, int r13, int r14, int r15) {
            r8 = this;
            int r5 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r13, r14)
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r15
            r7 = r15
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredHeight() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredWidth() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }
}
