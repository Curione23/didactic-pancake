package com.google.android.material.color.utilities;

/* JADX INFO: loaded from: classes.dex */
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
            r1 = this;
            r1.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    public static com.google.android.material.color.utilities.Hct fixIfDisliked(com.google.android.material.color.utilities.Hct r7) {
            boolean r0 = isDisliked(r7)
            if (r0 == 0) goto L17
            double r1 = r7.getHue()
            double r3 = r7.getChroma()
            r5 = 4634626229029306368(0x4051800000000000, double:70.0)
            com.google.android.material.color.utilities.Hct r7 = com.google.android.material.color.utilities.Hct.from(r1, r3, r5)
        L17:
            return r7
    }

    public static boolean isDisliked(com.google.android.material.color.utilities.Hct r8) {
            double r0 = r8.getHue()
            long r0 = java.lang.Math.round(r0)
            double r0 = (double) r0
            r2 = 4636033603912859648(0x4056800000000000, double:90.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 < 0) goto L28
            double r3 = r8.getHue()
            long r3 = java.lang.Math.round(r3)
            double r3 = (double) r3
            r5 = 4637511347540590592(0x405bc00000000000, double:111.0)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L28
            r0 = r1
            goto L29
        L28:
            r0 = r2
        L29:
            double r3 = r8.getChroma()
            long r3 = java.lang.Math.round(r3)
            double r3 = (double) r3
            r5 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L3a
            r3 = r1
            goto L3b
        L3a:
            r3 = r2
        L3b:
            double r4 = r8.getTone()
            long r4 = java.lang.Math.round(r4)
            double r4 = (double) r4
            r6 = 4634274385308418048(0x4050400000000000, double:65.0)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L4f
            r8 = r1
            goto L50
        L4f:
            r8 = r2
        L50:
            if (r0 == 0) goto L57
            if (r3 == 0) goto L57
            if (r8 == 0) goto L57
            goto L58
        L57:
            r1 = r2
        L58:
            return r1
    }
}
