package com.google.android.material.progressindicator;

/* JADX INFO: loaded from: classes.dex */
final class LinearDrawingDelegate extends com.google.android.material.progressindicator.DrawingDelegate<com.google.android.material.progressindicator.LinearProgressIndicatorSpec> {
    private float displayedCornerRadius;
    private float displayedTrackThickness;
    private float totalTrackLengthFraction;
    private float trackLength;
    private boolean useStrokeCap;

    LinearDrawingDelegate(com.google.android.material.progressindicator.LinearProgressIndicatorSpec r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 1133903872(0x43960000, float:300.0)
            r0.trackLength = r1
            return
    }

    private void drawLine(android.graphics.Canvas r15, android.graphics.Paint r16, float r17, float r18, int r19, int r20, int r21) {
            r14 = this;
            r7 = r14
            r6 = r16
            r8 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = r17
            float r1 = androidx.core.math.MathUtils.clamp(r1, r8, r0)
            r2 = r18
            float r2 = androidx.core.math.MathUtils.clamp(r2, r8, r0)
            float r3 = r7.totalTrackLengthFraction
            float r3 = r0 - r3
            float r1 = com.google.android.material.math.MathUtils.lerp(r3, r0, r1)
            float r3 = r7.totalTrackLengthFraction
            float r3 = r0 - r3
            float r2 = com.google.android.material.math.MathUtils.lerp(r3, r0, r2)
            r3 = r20
            float r3 = (float) r3
            r4 = 1008981770(0x3c23d70a, float:0.01)
            float r5 = androidx.core.math.MathUtils.clamp(r1, r8, r4)
            float r3 = r3 * r5
            float r3 = r3 / r4
            int r3 = (int) r3
            r5 = r21
            float r5 = (float) r5
            r9 = 1065185444(0x3f7d70a4, float:0.99)
            float r9 = androidx.core.math.MathUtils.clamp(r2, r9, r0)
            float r0 = r0 - r9
            float r5 = r5 * r0
            float r5 = r5 / r4
            int r0 = (int) r5
            float r4 = r7.trackLength
            float r1 = r1 * r4
            float r3 = (float) r3
            float r1 = r1 + r3
            int r1 = (int) r1
            float r2 = r2 * r4
            float r0 = (float) r0
            float r2 = r2 - r0
            int r0 = (int) r2
            float r2 = -r4
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            if (r1 > r0) goto Ld7
            float r1 = (float) r1
            float r4 = r7.displayedCornerRadius
            float r9 = r1 + r4
            float r0 = (float) r0
            float r10 = r0 - r4
            float r11 = r4 * r3
            r0 = r19
            r6.setColor(r0)
            r0 = 1
            r6.setAntiAlias(r0)
            float r0 = r7.displayedTrackThickness
            r6.setStrokeWidth(r0)
            int r0 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r0 < 0) goto L81
            android.graphics.PointF r3 = new android.graphics.PointF
            float r9 = r9 + r2
            r3.<init>(r9, r8)
            android.graphics.PointF r4 = new android.graphics.PointF
            float r10 = r10 + r2
            r4.<init>(r10, r8)
            float r8 = r7.displayedTrackThickness
            r0 = r14
            r1 = r15
            r2 = r16
            r5 = r11
            r6 = r8
            r0.drawRoundedBlock(r1, r2, r3, r4, r5, r6)
            goto Ld7
        L81:
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r6.setStyle(r0)
            boolean r0 = r7.useStrokeCap
            if (r0 == 0) goto L8d
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            goto L8f
        L8d:
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.BUTT
        L8f:
            r6.setStrokeCap(r0)
            float r12 = r9 + r2
            float r13 = r10 + r2
            r4 = 0
            r2 = 0
            r0 = r15
            r1 = r12
            r3 = r13
            r5 = r16
            r0.drawLine(r1, r2, r3, r4, r5)
            boolean r0 = r7.useStrokeCap
            if (r0 != 0) goto Ld7
            float r0 = r7.displayedCornerRadius
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto Ld7
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r6.setStyle(r0)
            int r0 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lc2
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r12, r8)
            float r5 = r7.displayedTrackThickness
            r0 = r14
            r1 = r15
            r2 = r16
            r4 = r11
            r0.drawRoundedBlock(r1, r2, r3, r4, r5)
        Lc2:
            float r0 = r7.trackLength
            int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r0 >= 0) goto Ld7
            android.graphics.PointF r3 = new android.graphics.PointF
            r3.<init>(r13, r8)
            float r5 = r7.displayedTrackThickness
            r0 = r14
            r1 = r15
            r2 = r16
            r4 = r11
            r0.drawRoundedBlock(r1, r2, r3, r4, r5)
        Ld7:
            return
    }

    private void drawRoundedBlock(android.graphics.Canvas r8, android.graphics.Paint r9, android.graphics.PointF r10, float r11, float r12) {
            r7 = this;
            r4 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r6 = r12
            r0.drawRoundedBlock(r1, r2, r3, r4, r5, r6)
            return
    }

    private void drawRoundedBlock(android.graphics.Canvas r6, android.graphics.Paint r7, android.graphics.PointF r8, android.graphics.PointF r9, float r10, float r11) {
            r5 = this;
            float r0 = r5.displayedTrackThickness
            float r11 = java.lang.Math.min(r11, r0)
            float r0 = r5.displayedCornerRadius
            float r0 = r0 * r11
            float r1 = r5.displayedTrackThickness
            float r0 = r0 / r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r2 = r10 / r1
            float r0 = java.lang.Math.min(r2, r0)
            android.graphics.RectF r3 = new android.graphics.RectF
            float r10 = -r10
            float r10 = r10 / r1
            float r4 = -r11
            float r4 = r4 / r1
            float r11 = r11 / r1
            r3.<init>(r10, r4, r2, r11)
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r7.setStyle(r10)
            r6.save()
            if (r9 == 0) goto L45
            float r10 = r9.x
            float r11 = r9.y
            r6.translate(r10, r11)
            android.graphics.Path r10 = new android.graphics.Path
            r10.<init>()
            android.graphics.Path$Direction r11 = android.graphics.Path.Direction.CCW
            r10.addRoundRect(r3, r0, r0, r11)
            r6.clipPath(r10)
            float r10 = r9.x
            float r10 = -r10
            float r9 = r9.y
            float r9 = -r9
            r6.translate(r10, r9)
        L45:
            float r9 = r8.x
            float r8 = r8.y
            r6.translate(r9, r8)
            r6.drawRoundRect(r3, r0, r0, r7)
            r6.restore()
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void adjustCanvas(android.graphics.Canvas r8, android.graphics.Rect r9, float r10, boolean r11, boolean r12) {
            r7 = this;
            int r0 = r9.width()
            float r0 = (float) r0
            r7.trackLength = r0
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackThickness
            float r0 = (float) r0
            int r1 = r9.left
            float r1 = (float) r1
            int r2 = r9.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 + r2
            int r2 = r9.top
            float r2 = (float) r2
            int r4 = r9.height()
            float r4 = (float) r4
            float r4 = r4 / r3
            float r2 = r2 + r4
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 - r0
            float r9 = r9 / r3
            r4 = 0
            float r9 = java.lang.Math.max(r4, r9)
            float r2 = r2 + r9
            r8.translate(r1, r2)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r9 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r9
            boolean r9 = r9.drawHorizontallyInverse
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r9 == 0) goto L43
            r8.scale(r1, r2)
        L43:
            float r9 = r7.trackLength
            float r9 = r9 / r3
            float r0 = r0 / r3
            float r5 = -r9
            float r6 = -r0
            r8.clipRect(r5, r6, r9, r0)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r9 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r9
            int r9 = r9.trackThickness
            r0 = 2
            int r9 = r9 / r0
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r5
            int r5 = r5.trackCornerRadius
            r6 = 1
            if (r9 != r5) goto L5f
            r9 = r6
            goto L60
        L5f:
            r9 = 0
        L60:
            r7.useStrokeCap = r9
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r9 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r9
            int r9 = r9.trackThickness
            float r9 = (float) r9
            float r9 = r9 * r10
            r7.displayedTrackThickness = r9
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r9 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r9
            int r9 = r9.trackThickness
            int r9 = r9 / r0
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r5
            int r5 = r5.trackCornerRadius
            int r9 = java.lang.Math.min(r9, r5)
            float r9 = (float) r9
            float r9 = r9 * r10
            r7.displayedCornerRadius = r9
            r9 = 3
            if (r11 != 0) goto L86
            if (r12 == 0) goto Lb7
        L86:
            if (r11 == 0) goto L90
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r5 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r5 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r5
            int r5 = r5.showAnimationBehavior
            if (r5 == r0) goto L9a
        L90:
            if (r12 == 0) goto L9d
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.hideAnimationBehavior
            if (r0 != r6) goto L9d
        L9a:
            r8.scale(r2, r1)
        L9d:
            if (r11 != 0) goto La9
            if (r12 == 0) goto Lb7
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r11 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r11 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r11
            int r11 = r11.hideAnimationBehavior
            if (r11 == r9) goto Lb7
        La9:
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r11 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r11 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r11
            int r11 = r11.trackThickness
            float r11 = (float) r11
            float r0 = r2 - r10
            float r11 = r11 * r0
            float r11 = r11 / r3
            r8.translate(r4, r11)
        Lb7:
            if (r12 == 0) goto Lc4
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r8 = r7.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r8 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r8
            int r8 = r8.hideAnimationBehavior
            if (r8 != r9) goto Lc4
            r7.totalTrackLengthFraction = r10
            goto Lc6
        Lc4:
            r7.totalTrackLengthFraction = r2
        Lc6:
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    void drawStopIndicator(android.graphics.Canvas r7, android.graphics.Paint r8, int r9, int r10) {
            r6 = this;
            int r9 = com.google.android.material.color.MaterialColors.compositeARGBWithAlpha(r9, r10)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r10 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r10 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r10
            int r10 = r10.trackStopIndicatorSize
            if (r10 <= 0) goto L39
            if (r9 == 0) goto L39
            android.graphics.Paint$Style r10 = android.graphics.Paint.Style.FILL
            r8.setStyle(r10)
            r8.setColor(r9)
            android.graphics.PointF r3 = new android.graphics.PointF
            float r9 = r6.trackLength
            r10 = 1073741824(0x40000000, float:2.0)
            float r9 = r9 / r10
            float r0 = r6.displayedTrackThickness
            float r0 = r0 / r10
            float r9 = r9 - r0
            r10 = 0
            r3.<init>(r9, r10)
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r9 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r9
            int r9 = r9.trackStopIndicatorSize
            float r4 = (float) r9
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r9 = r6.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r9 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r9
            int r9 = r9.trackStopIndicatorSize
            float r5 = (float) r9
            r0 = r6
            r1 = r7
            r2 = r8
            r0.drawRoundedBlock(r1, r2, r3, r4, r5)
        L39:
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
            r1.drawLine(r2, r3, r4, r5, r6, r7, r8)
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
            r0.drawLine(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredHeight() {
            r1 = this;
            S extends com.google.android.material.progressindicator.BaseProgressIndicatorSpec r0 = r1.spec
            com.google.android.material.progressindicator.LinearProgressIndicatorSpec r0 = (com.google.android.material.progressindicator.LinearProgressIndicatorSpec) r0
            int r0 = r0.trackThickness
            return r0
    }

    @Override // com.google.android.material.progressindicator.DrawingDelegate
    int getPreferredWidth() {
            r1 = this;
            r0 = -1
            return r0
    }
}
