package org.apache.commons.lang3.math;

/* JADX INFO: loaded from: classes2.dex */
public class IEEE754rUtils {
    @java.lang.Deprecated
    public IEEE754rUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static double max(double r1, double r3) {
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto Le
            return r1
        Le:
            double r1 = java.lang.Math.max(r1, r3)
            return r1
    }

    public static double max(double r0, double r2, double r4) {
            double r0 = max(r0, r2)
            double r0 = max(r0, r4)
            return r0
    }

    public static double max(double... r6) {
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r6, r0)
            int r0 = r6.length
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            java.lang.String r3 = "Array cannot be empty."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r4)
            r2 = r6[r2]
        L16:
            int r0 = r6.length
            if (r1 >= r0) goto L22
            r4 = r6[r1]
            double r2 = max(r4, r2)
            int r1 = r1 + 1
            goto L16
        L22:
            return r2
    }

    public static float max(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Le
            return r1
        Le:
            float r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    public static float max(float r0, float r1, float r2) {
            float r0 = max(r0, r1)
            float r0 = max(r0, r2)
            return r0
    }

    public static float max(float... r5) {
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            java.lang.String r3 = "Array cannot be empty."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r4)
            r0 = r5[r2]
        L16:
            int r2 = r5.length
            if (r1 >= r2) goto L22
            r2 = r5[r1]
            float r0 = max(r2, r0)
            int r1 = r1 + 1
            goto L16
        L22:
            return r0
    }

    public static double min(double r1, double r3) {
            boolean r0 = java.lang.Double.isNaN(r1)
            if (r0 == 0) goto L7
            return r3
        L7:
            boolean r0 = java.lang.Double.isNaN(r3)
            if (r0 == 0) goto Le
            return r1
        Le:
            double r1 = java.lang.Math.min(r1, r3)
            return r1
    }

    public static double min(double r0, double r2, double r4) {
            double r0 = min(r0, r2)
            double r0 = min(r0, r4)
            return r0
    }

    public static double min(double... r6) {
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r6, r0)
            int r0 = r6.length
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            java.lang.String r3 = "Array cannot be empty."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r4)
            r2 = r6[r2]
        L16:
            int r0 = r6.length
            if (r1 >= r0) goto L22
            r4 = r6[r1]
            double r2 = min(r4, r2)
            int r1 = r1 + 1
            goto L16
        L22:
            return r2
    }

    public static float min(float r1, float r2) {
            boolean r0 = java.lang.Float.isNaN(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            boolean r0 = java.lang.Float.isNaN(r2)
            if (r0 == 0) goto Le
            return r1
        Le:
            float r1 = java.lang.Math.min(r1, r2)
            return r1
    }

    public static float min(float r0, float r1, float r2) {
            float r0 = min(r0, r1)
            float r0 = min(r0, r2)
            return r0
    }

    public static float min(float... r5) {
            java.lang.String r0 = "array"
            java.util.Objects.requireNonNull(r5, r0)
            int r0 = r5.length
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lc
            r0 = r1
            goto Ld
        Lc:
            r0 = r2
        Ld:
            java.lang.String r3 = "Array cannot be empty."
            java.lang.Object[] r4 = new java.lang.Object[r2]
            org.apache.commons.lang3.Validate.isTrue(r0, r3, r4)
            r0 = r5[r2]
        L16:
            int r2 = r5.length
            if (r1 >= r2) goto L22
            r2 = r5[r1]
            float r0 = min(r2, r0)
            int r1 = r1 + 1
            goto L16
        L22:
            return r0
    }
}
