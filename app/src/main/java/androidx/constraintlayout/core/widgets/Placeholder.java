package androidx.constraintlayout.core.widgets;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends androidx.constraintlayout.core.widgets.VirtualLayout {
    public Placeholder() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    public void addToSolver(androidx.constraintlayout.core.LinearSystem r2, boolean r3) {
            r1 = this;
            super.addToSolver(r2, r3)
            int r2 = r1.mWidgetsCount
            if (r2 <= 0) goto L2b
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r2 = r1.mWidgets
            r3 = 0
            r2 = r2[r3]
            r2.resetAllConstraints()
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.LEFT
            r2.connect(r3, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.RIGHT
            r2.connect(r3, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.TOP
            r2.connect(r3, r1, r0)
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.core.widgets.ConstraintAnchor$Type r0 = androidx.constraintlayout.core.widgets.ConstraintAnchor.Type.BOTTOM
            r2.connect(r3, r1, r0)
        L2b:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.VirtualLayout
    public void measure(int r6, int r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.getPaddingLeft()
            int r1 = r5.getPaddingRight()
            int r2 = r5.getPaddingTop()
            int r3 = r5.getPaddingBottom()
            int r0 = r0 + r1
            int r2 = r2 + r3
            int r1 = r5.mWidgetsCount
            r3 = 0
            if (r1 <= 0) goto L29
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r5.mWidgets
            r1 = r1[r3]
            int r1 = r1.getWidth()
            int r0 = r0 + r1
            androidx.constraintlayout.core.widgets.ConstraintWidget[] r1 = r5.mWidgets
            r1 = r1[r3]
            int r1 = r1.getHeight()
            int r2 = r2 + r1
        L29:
            int r1 = r5.getMinWidth()
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r5.getMinHeight()
            int r1 = java.lang.Math.max(r1, r2)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 != r4) goto L40
            goto L4c
        L40:
            if (r6 != r2) goto L47
            int r7 = java.lang.Math.min(r0, r7)
            goto L4c
        L47:
            if (r6 != 0) goto L4b
            r7 = r0
            goto L4c
        L4b:
            r7 = r3
        L4c:
            if (r8 != r4) goto L4f
            goto L5b
        L4f:
            if (r8 != r2) goto L56
            int r9 = java.lang.Math.min(r1, r9)
            goto L5b
        L56:
            if (r8 != 0) goto L5a
            r9 = r1
            goto L5b
        L5a:
            r9 = r3
        L5b:
            r5.setMeasure(r7, r9)
            r5.setWidth(r7)
            r5.setHeight(r9)
            int r6 = r5.mWidgetsCount
            if (r6 <= 0) goto L69
            r3 = 1
        L69:
            r5.needsCallbackFromSolver(r3)
            return
    }
}
