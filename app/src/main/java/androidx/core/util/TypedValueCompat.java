package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
public class TypedValueCompat {
    private static final float INCHES_PER_MM = 0.03937008f;
    private static final float INCHES_PER_PT = 0.013888889f;

    private static class Api34Impl {
        private Api34Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        public static float deriveDimension(int r0, float r1, android.util.DisplayMetrics r2) {
                float r0 = android.util.TypedValue.deriveDimension(r0, r1, r2)
                return r0
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ComplexDimensionUnit {
    }

    private TypedValueCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static float deriveDimension(int r2, float r3, android.util.DisplayMetrics r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto Lb
            float r2 = androidx.core.util.TypedValueCompat.Api34Impl.deriveDimension(r2, r3, r4)
            return r2
        Lb:
            if (r2 == 0) goto L6d
            r0 = 1
            r1 = 0
            if (r2 == r0) goto L63
            r0 = 2
            if (r2 == r0) goto L59
            r0 = 3
            if (r2 == r0) goto L4b
            r0 = 4
            if (r2 == r0) goto L41
            r0 = 5
            if (r2 != r0) goto L2c
            float r2 = r4.xdpi
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L24
            return r1
        L24:
            float r2 = r4.xdpi
            float r3 = r3 / r2
            r2 = 1025589893(0x3d214285, float:0.03937008)
        L2a:
            float r3 = r3 / r2
            return r3
        L2c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Invalid unitToConvertTo "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L41:
            float r2 = r4.xdpi
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L48
            return r1
        L48:
            float r2 = r4.xdpi
            goto L2a
        L4b:
            float r2 = r4.xdpi
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L52
            return r1
        L52:
            float r2 = r4.xdpi
            float r3 = r3 / r2
            r2 = 1013157433(0x3c638e39, float:0.013888889)
            goto L2a
        L59:
            float r2 = r4.scaledDensity
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L60
            return r1
        L60:
            float r2 = r4.scaledDensity
            goto L2a
        L63:
            float r2 = r4.density
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 != 0) goto L6a
            return r1
        L6a:
            float r2 = r4.density
            goto L2a
        L6d:
            return r3
    }

    public static float dpToPx(float r1, android.util.DisplayMetrics r2) {
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r1
    }

    public static int getUnitFromComplexDimension(int r0) {
            r0 = r0 & 15
            return r0
    }

    public static float pxToDp(float r1, android.util.DisplayMetrics r2) {
            r0 = 1
            float r1 = deriveDimension(r0, r1, r2)
            return r1
    }

    public static float pxToSp(float r1, android.util.DisplayMetrics r2) {
            r0 = 2
            float r1 = deriveDimension(r0, r1, r2)
            return r1
    }

    public static float spToPx(float r1, android.util.DisplayMetrics r2) {
            r0 = 2
            float r1 = android.util.TypedValue.applyDimension(r0, r1, r2)
            return r1
    }
}
