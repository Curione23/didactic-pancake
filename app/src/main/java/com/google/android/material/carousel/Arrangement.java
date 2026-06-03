package com.google.android.material.carousel;

/* JADX INFO: loaded from: classes.dex */
final class Arrangement {
    private static final float MEDIUM_ITEM_FLEX_PERCENTAGE = 0.1f;
    final float cost;
    final int largeCount;
    float largeSize;
    int mediumCount;
    float mediumSize;
    final int priority;
    int smallCount;
    float smallSize;

    Arrangement(int r1, float r2, float r3, float r4, int r5, float r6, int r7, float r8, int r9, float r10) {
            r0 = this;
            r0.<init>()
            r0.priority = r1
            float r1 = androidx.core.math.MathUtils.clamp(r2, r3, r4)
            r0.smallSize = r1
            r0.smallCount = r5
            r0.mediumSize = r6
            r0.mediumCount = r7
            r0.largeSize = r8
            r0.largeCount = r9
            r0.fit(r10, r3, r4, r8)
            float r1 = r0.cost(r8)
            r0.cost = r1
            return
    }

    private float calculateLargeSize(float r2, int r3, float r4, int r5, int r6) {
            r1 = this;
            if (r3 <= 0) goto L3
            goto L4
        L3:
            r4 = 0
        L4:
            float r3 = (float) r3
            float r5 = (float) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r5 = r5 / r0
            float r3 = r3 + r5
            float r3 = r3 * r4
            float r2 = r2 - r3
            float r3 = (float) r6
            float r3 = r3 + r5
            float r2 = r2 / r3
            return r2
    }

    private float cost(float r2) {
            r1 = this;
            boolean r0 = r1.isValid()
            if (r0 != 0) goto La
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            return r2
        La:
            float r0 = r1.largeSize
            float r2 = r2 - r0
            float r2 = java.lang.Math.abs(r2)
            int r0 = r1.priority
            float r0 = (float) r0
            float r2 = r2 * r0
            return r2
    }

    static com.google.android.material.carousel.Arrangement findLowestCostArrangement(float r25, float r26, float r27, float r28, int[] r29, float r30, int[] r31, float r32, int[] r33) {
            r0 = r29
            r1 = r31
            r2 = r33
            int r3 = r2.length
            r4 = 0
            r5 = 1
            r7 = 0
        La:
            if (r7 >= r3) goto L64
            r19 = r2[r7]
            int r15 = r1.length
            r14 = 0
        L10:
            if (r14 >= r15) goto L61
            r20 = r1[r14]
            int r13 = r0.length
            r12 = 0
        L16:
            if (r12 >= r13) goto L5a
            r16 = r0[r12]
            com.google.android.material.carousel.Arrangement r11 = new com.google.android.material.carousel.Arrangement
            r8 = r11
            r9 = r5
            r10 = r26
            r6 = r11
            r11 = r27
            r21 = r12
            r12 = r28
            r22 = r13
            r13 = r16
            r23 = r14
            r14 = r30
            r24 = r15
            r15 = r20
            r16 = r32
            r17 = r19
            r18 = r25
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r4 == 0) goto L46
            float r8 = r6.cost
            float r9 = r4.cost
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 >= 0) goto L4f
        L46:
            float r4 = r6.cost
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L4e
            return r6
        L4e:
            r4 = r6
        L4f:
            int r5 = r5 + 1
            int r12 = r21 + 1
            r13 = r22
            r14 = r23
            r15 = r24
            goto L16
        L5a:
            r23 = r14
            r24 = r15
            int r14 = r23 + 1
            goto L10
        L61:
            int r7 = r7 + 1
            goto La
        L64:
            return r4
    }

    private void fit(float r10, float r11, float r12, float r13) {
            r9 = this;
            float r0 = r9.getSpace()
            float r0 = r10 - r0
            int r1 = r9.smallCount
            r2 = 0
            if (r1 <= 0) goto L1c
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 <= 0) goto L1c
            float r11 = r9.smallSize
            float r1 = (float) r1
            float r0 = r0 / r1
            float r12 = r12 - r11
            float r12 = java.lang.Math.min(r0, r12)
            float r11 = r11 + r12
            r9.smallSize = r11
            goto L2e
        L1c:
            if (r1 <= 0) goto L2e
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 >= 0) goto L2e
            float r12 = r9.smallSize
            float r1 = (float) r1
            float r0 = r0 / r1
            float r11 = r11 - r12
            float r11 = java.lang.Math.max(r0, r11)
            float r12 = r12 + r11
            r9.smallSize = r12
        L2e:
            int r5 = r9.smallCount
            if (r5 <= 0) goto L36
            float r11 = r9.smallSize
            r6 = r11
            goto L37
        L36:
            r6 = r2
        L37:
            r9.smallSize = r6
            int r7 = r9.mediumCount
            int r8 = r9.largeCount
            r3 = r9
            r4 = r10
            float r10 = r3.calculateLargeSize(r4, r5, r6, r7, r8)
            r9.largeSize = r10
            float r11 = r9.smallSize
            float r11 = r11 + r10
            r12 = 1073741824(0x40000000, float:2.0)
            float r11 = r11 / r12
            r9.mediumSize = r11
            int r12 = r9.mediumCount
            if (r12 <= 0) goto L93
            int r0 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r0 == 0) goto L93
            float r13 = r13 - r10
            int r10 = r9.largeCount
            float r10 = (float) r10
            float r13 = r13 * r10
            r10 = 1036831949(0x3dcccccd, float:0.1)
            float r11 = r11 * r10
            float r10 = (float) r12
            float r11 = r11 * r10
            float r10 = java.lang.Math.abs(r13)
            float r10 = java.lang.Math.min(r10, r11)
            int r11 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r11 <= 0) goto L80
            float r11 = r9.mediumSize
            int r12 = r9.mediumCount
            float r12 = (float) r12
            float r12 = r10 / r12
            float r11 = r11 - r12
            r9.mediumSize = r11
            float r11 = r9.largeSize
            int r12 = r9.largeCount
            float r12 = (float) r12
            float r10 = r10 / r12
            float r11 = r11 + r10
            r9.largeSize = r11
            goto L93
        L80:
            float r11 = r9.mediumSize
            int r12 = r9.mediumCount
            float r12 = (float) r12
            float r12 = r10 / r12
            float r11 = r11 + r12
            r9.mediumSize = r11
            float r11 = r9.largeSize
            int r12 = r9.largeCount
            float r12 = (float) r12
            float r10 = r10 / r12
            float r11 = r11 - r10
            r9.largeSize = r11
        L93:
            return
    }

    private float getSpace() {
            r3 = this;
            float r0 = r3.largeSize
            int r1 = r3.largeCount
            float r1 = (float) r1
            float r0 = r0 * r1
            float r1 = r3.mediumSize
            int r2 = r3.mediumCount
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            float r1 = r3.smallSize
            int r2 = r3.smallCount
            float r2 = (float) r2
            float r1 = r1 * r2
            float r0 = r0 + r1
            return r0
    }

    private boolean isValid() {
            r4 = this;
            int r0 = r4.largeCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L1e
            int r3 = r4.smallCount
            if (r3 <= 0) goto L1e
            int r3 = r4.mediumCount
            if (r3 <= 0) goto L1e
            float r0 = r4.largeSize
            float r3 = r4.mediumSize
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L1d
            float r0 = r4.smallSize
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1d
            r1 = r2
        L1d:
            return r1
        L1e:
            if (r0 <= 0) goto L2e
            int r0 = r4.smallCount
            if (r0 <= 0) goto L2e
            float r0 = r4.largeSize
            float r3 = r4.smallSize
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2d
            r1 = r2
        L2d:
            return r1
        L2e:
            return r2
    }

    int getItemCount() {
            r2 = this;
            int r0 = r2.smallCount
            int r1 = r2.mediumCount
            int r0 = r0 + r1
            int r1 = r2.largeCount
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Arrangement [priority="
            r0.<init>(r1)
            int r1 = r2.priority
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", smallCount="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.smallCount
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", smallSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.smallSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mediumCount="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.mediumCount
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", mediumSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.mediumSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", largeCount="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.largeCount
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", largeSize="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.largeSize
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", cost="
            java.lang.StringBuilder r0 = r0.append(r1)
            float r1 = r2.cost
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
