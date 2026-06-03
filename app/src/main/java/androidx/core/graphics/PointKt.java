package androidx.core.graphics;

/* JADX INFO: compiled from: Point.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0005\u001a\u00020\u0003*\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0006\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\n\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\n\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0003H\u0086\n\u001a\r\u0010\r\u001a\u00020\u0002*\u00020\u0004H\u0086\b\u001a\r\u0010\u000e\u001a\u00020\u0004*\u00020\u0002H\u0086\b\u001a\r\u0010\u000f\u001a\u00020\u0002*\u00020\u0002H\u0086\n\u001a\r\u0010\u000f\u001a\u00020\u0004*\u00020\u0004H\u0086\n¨\u0006\u0010"}, d2 = {"component1", "", "Landroid/graphics/Point;", "", "Landroid/graphics/PointF;", "component2", "div", "scalar", "minus", "p", "xy", "plus", "times", "toPoint", "toPointF", "unaryMinus", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PointKt {
    public static final float component1(android.graphics.PointF r0) {
            float r0 = r0.x
            return r0
    }

    public static final int component1(android.graphics.Point r0) {
            int r0 = r0.x
            return r0
    }

    public static final float component2(android.graphics.PointF r0) {
            float r0 = r0.y
            return r0
    }

    public static final int component2(android.graphics.Point r0) {
            int r0 = r0.y
            return r0
    }

    public static final android.graphics.Point div(android.graphics.Point r2, float r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            float r1 = (float) r1
            float r1 = r1 / r3
            int r1 = java.lang.Math.round(r1)
            int r2 = r2.y
            float r2 = (float) r2
            float r2 = r2 / r3
            int r2 = java.lang.Math.round(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static final android.graphics.PointF div(android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r1 = r1 / r3
            float r2 = r2.y
            float r2 = r2 / r3
            r0.<init>(r1, r2)
            return r0
    }

    public static final android.graphics.Point minus(android.graphics.Point r2, int r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = -r3
            r0.offset(r2, r2)
            return r0
    }

    public static final android.graphics.Point minus(android.graphics.Point r2, android.graphics.Point r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = r3.x
            int r2 = -r2
            int r3 = r3.y
            int r3 = -r3
            r0.offset(r2, r3)
            return r0
    }

    public static final android.graphics.PointF minus(android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = -r3
            r0.offset(r2, r2)
            return r0
    }

    public static final android.graphics.PointF minus(android.graphics.PointF r2, android.graphics.PointF r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = r3.x
            float r2 = -r2
            float r3 = r3.y
            float r3 = -r3
            r0.offset(r2, r3)
            return r0
    }

    public static final android.graphics.Point plus(android.graphics.Point r2, int r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            r0.offset(r3, r3)
            return r0
    }

    public static final android.graphics.Point plus(android.graphics.Point r2, android.graphics.Point r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r2 = r2.y
            r0.<init>(r1, r2)
            int r2 = r3.x
            int r3 = r3.y
            r0.offset(r2, r3)
            return r0
    }

    public static final android.graphics.PointF plus(android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            r0.offset(r3, r3)
            return r0
    }

    public static final android.graphics.PointF plus(android.graphics.PointF r2, android.graphics.PointF r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r2 = r2.y
            r0.<init>(r1, r2)
            float r2 = r3.x
            float r3 = r3.y
            r0.offset(r2, r3)
            return r0
    }

    public static final android.graphics.Point times(android.graphics.Point r2, float r3) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            float r1 = (float) r1
            float r1 = r1 * r3
            int r1 = java.lang.Math.round(r1)
            int r2 = r2.y
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = java.lang.Math.round(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static final android.graphics.PointF times(android.graphics.PointF r2, float r3) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r1 = r1 * r3
            float r2 = r2.y
            float r2 = r2 * r3
            r0.<init>(r1, r2)
            return r0
    }

    public static final android.graphics.Point toPoint(android.graphics.PointF r2) {
            android.graphics.Point r0 = new android.graphics.Point
            float r1 = r2.x
            int r1 = (int) r1
            float r2 = r2.y
            int r2 = (int) r2
            r0.<init>(r1, r2)
            return r0
    }

    public static final android.graphics.PointF toPointF(android.graphics.Point r1) {
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r1)
            return r0
    }

    public static final android.graphics.Point unaryMinus(android.graphics.Point r2) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r2.x
            int r1 = -r1
            int r2 = r2.y
            int r2 = -r2
            r0.<init>(r1, r2)
            return r0
    }

    public static final android.graphics.PointF unaryMinus(android.graphics.PointF r2) {
            android.graphics.PointF r0 = new android.graphics.PointF
            float r1 = r2.x
            float r1 = -r1
            float r2 = r2.y
            float r2 = -r2
            r0.<init>(r1, r2)
            return r0
    }
}
