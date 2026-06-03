package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
public final class RelativeCornerSize implements com.google.android.material.shape.CornerSize {
    private final float percent;

    public RelativeCornerSize(float r1) {
            r0 = this;
            r0.<init>()
            r0.percent = r1
            return
    }

    public static com.google.android.material.shape.RelativeCornerSize createFromCornerSize(android.graphics.RectF r1, com.google.android.material.shape.CornerSize r2) {
            boolean r0 = r2 instanceof com.google.android.material.shape.RelativeCornerSize
            if (r0 == 0) goto L7
            com.google.android.material.shape.RelativeCornerSize r2 = (com.google.android.material.shape.RelativeCornerSize) r2
            goto L16
        L7:
            com.google.android.material.shape.RelativeCornerSize r0 = new com.google.android.material.shape.RelativeCornerSize
            float r2 = r2.getCornerSize(r1)
            float r1 = getMaxCornerSize(r1)
            float r2 = r2 / r1
            r0.<init>(r2)
            r2 = r0
        L16:
            return r2
    }

    private static float getMaxCornerSize(android.graphics.RectF r1) {
            float r0 = r1.width()
            float r1 = r1.height()
            float r1 = java.lang.Math.min(r0, r1)
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof com.google.android.material.shape.RelativeCornerSize
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.material.shape.RelativeCornerSize r4 = (com.google.android.material.shape.RelativeCornerSize) r4
            float r1 = r3.percent
            float r4 = r4.percent
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
            float r0 = r1.percent
            float r2 = getMaxCornerSize(r2)
            float r0 = r0 * r2
            return r0
    }

    public float getRelativePercent() {
            r1 = this;
            float r0 = r1.percent
            return r0
    }

    public int hashCode() {
            r1 = this;
            float r0 = r1.percent
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }
}
