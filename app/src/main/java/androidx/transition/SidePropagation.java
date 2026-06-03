package androidx.transition;

/* JADX INFO: loaded from: classes.dex */
public class SidePropagation extends androidx.transition.VisibilityPropagation {
    private float mPropagationSpeed;
    private int mSide;

    public SidePropagation() {
            r1 = this;
            r1.<init>()
            r0 = 1077936128(0x40400000, float:3.0)
            r1.mPropagationSpeed = r0
            r0 = 80
            r1.mSide = r0
            return
    }

    private int distance(android.view.View r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14) {
            r5 = this;
            int r0 = r5.mSide
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 1
            r3 = 5
            r4 = 3
            if (r0 != r1) goto L14
            int r6 = r6.getLayoutDirection()
            if (r6 != r2) goto L12
        L10:
            r0 = r3
            goto L20
        L12:
            r0 = r4
            goto L20
        L14:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L20
            int r6 = r6.getLayoutDirection()
            if (r6 != r2) goto L10
            goto L12
        L20:
            if (r0 == r4) goto L46
            if (r0 == r3) goto L3e
            r6 = 48
            if (r0 == r6) goto L36
            r6 = 80
            if (r0 == r6) goto L2e
            r6 = 0
            goto L4d
        L2e:
            int r8 = r8 - r12
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r8
            goto L4d
        L36:
            int r14 = r14 - r8
            int r9 = r9 - r7
            int r6 = java.lang.Math.abs(r9)
            int r6 = r6 + r14
            goto L4d
        L3e:
            int r7 = r7 - r11
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r7
            goto L4d
        L46:
            int r13 = r13 - r7
            int r10 = r10 - r8
            int r6 = java.lang.Math.abs(r10)
            int r6 = r6 + r13
        L4d:
            return r6
    }

    private int getMaxDistance(android.view.ViewGroup r3) {
            r2 = this;
            int r0 = r2.mSide
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 5
            if (r0 == r1) goto L17
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == r1) goto L17
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r1) goto L17
            int r3 = r3.getHeight()
            return r3
        L17:
            int r3 = r3.getWidth()
            return r3
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(android.view.ViewGroup r17, androidx.transition.Transition r18, androidx.transition.TransitionValues r19, androidx.transition.TransitionValues r20) {
            r16 = this;
            r10 = r16
            r0 = r19
            r11 = 0
            if (r0 != 0) goto Lb
            if (r20 != 0) goto Lb
            return r11
        Lb:
            android.graphics.Rect r1 = r18.getEpicenter()
            r2 = 1
            if (r20 == 0) goto L1d
            int r3 = r10.getViewVisibility(r0)
            if (r3 != 0) goto L19
            goto L1d
        L19:
            r0 = r20
            r13 = r2
            goto L1f
        L1d:
            r3 = -1
            r13 = r3
        L1f:
            int r3 = r10.getViewX(r0)
            int r4 = r10.getViewY(r0)
            r0 = 2
            int[] r5 = new int[r0]
            r14 = r17
            r14.getLocationOnScreen(r5)
            r6 = 0
            r6 = r5[r6]
            float r7 = r17.getTranslationX()
            int r7 = java.lang.Math.round(r7)
            int r6 = r6 + r7
            r2 = r5[r2]
            float r5 = r17.getTranslationY()
            int r5 = java.lang.Math.round(r5)
            int r7 = r2 + r5
            int r2 = r17.getWidth()
            int r8 = r6 + r2
            int r2 = r17.getHeight()
            int r9 = r7 + r2
            if (r1 == 0) goto L60
            int r0 = r1.centerX()
            int r1 = r1.centerY()
            r5 = r0
            r15 = r1
            goto L68
        L60:
            int r1 = r6 + r8
            int r1 = r1 / r0
            int r2 = r7 + r9
            int r2 = r2 / r0
            r5 = r1
            r15 = r2
        L68:
            r0 = r16
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r15
            int r0 = r0.distance(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r0 = (float) r0
            int r1 = r16.getMaxDistance(r17)
            float r1 = (float) r1
            float r0 = r0 / r1
            long r1 = r18.getDuration()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 >= 0) goto L85
            r1 = 300(0x12c, double:1.48E-321)
        L85:
            long r3 = (long) r13
            long r1 = r1 * r3
            float r1 = (float) r1
            float r2 = r10.mPropagationSpeed
            float r1 = r1 / r2
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            long r0 = (long) r0
            return r0
    }

    public void setPropagationSpeed(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L8
            r1.mPropagationSpeed = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "propagationSpeed may not be 0"
            r2.<init>(r0)
            throw r2
    }

    public void setSide(int r1) {
            r0 = this;
            r0.mSide = r1
            return
    }
}
