package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
public final class ClampedCornerSize implements com.google.android.material.shape.CornerSize {
    private final float target;

    public ClampedCornerSize(float r1) {
            r0 = this;
            r0.<init>()
            r0.target = r1
            return
    }

    public static com.google.android.material.shape.ClampedCornerSize createFromCornerSize(com.google.android.material.shape.AbsoluteCornerSize r1) {
            com.google.android.material.shape.ClampedCornerSize r0 = new com.google.android.material.shape.ClampedCornerSize
            float r1 = r1.getCornerSize()
            r0.<init>(r1)
            return r0
    }

    private static float getMaxCornerSize(android.graphics.RectF r2) {
            float r0 = r2.width()
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = r2.height()
            float r2 = r2 / r1
            float r2 = java.lang.Math.min(r0, r2)
            return r2
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.material.shape.ClampedCornerSize
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.shape.ClampedCornerSize r4 = (com.google.android.material.shape.ClampedCornerSize) r4
            float r1 = r3.target
            float r4 = r4.target
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 != 0) goto L15
            goto L16
        L15:
            r0 = r2
        L16:
            return r0
    }

    @Override // com.google.android.material.shape.CornerSize
    public float getCornerSize(android.graphics.RectF r2) {
            r1 = this;
            float r0 = r1.target
            float r2 = getMaxCornerSize(r2)
            float r2 = java.lang.Math.min(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            float r0 = r1.target
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
