package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
final class FadeThroughUtils {
    static final float THRESHOLD_ALPHA = 0.5f;

    private FadeThroughUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static void calculateFadeOutAndInAlphas(float r6, float[] r7) {
            r0 = 1056964608(0x3f000000, float:0.5)
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1073741824(0x40000000, float:2.0)
            r3 = 1
            r4 = 0
            r5 = 0
            if (r0 > 0) goto L14
            float r6 = r6 * r2
            float r1 = r1 - r6
            r7[r5] = r1
            r7[r3] = r4
            goto L1a
        L14:
            r7[r5] = r4
            float r6 = r6 * r2
            float r6 = r6 - r1
            r7[r3] = r6
        L1a:
            return
    }
}
