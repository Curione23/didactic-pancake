package androidx.core.graphics;

/* JADX INFO: compiled from: Rect.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\u0000\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\f\u001a\r\u0010\u0004\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0004\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\u0007\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\b\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0005*\u00020\u0001H\u0086\n\u001a\r\u0010\t\u001a\u00020\u0006*\u00020\u0003H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u000f\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0012\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\rH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000eH\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0005H\u0086\n\u001a\r\u0010\u0016\u001a\u00020\u0001*\u00020\u0003H\u0086\b\u001a\r\u0010\u0017\u001a\u00020\u0003*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0001H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0015\u0010\u0019\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u001bH\u0086\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f¨\u0006\u001d"}, d2 = {"and", "Landroid/graphics/Rect;", "r", "Landroid/graphics/RectF;", "component1", "", "", "component2", "component3", "component4", "contains", "", "p", "Landroid/graphics/Point;", "Landroid/graphics/PointF;", "minus", "xy", "Landroid/graphics/Region;", "or", "plus", "times", "factor", "toRect", "toRectF", "toRegion", "transform", "m", "Landroid/graphics/Matrix;", "xor", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RectKt {
    public static final android.graphics.Rect and(android.graphics.Rect r1, android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.intersect(r2)
            return r0
    }

    public static final android.graphics.RectF and(android.graphics.RectF r1, android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.intersect(r2)
            return r0
    }

    public static final float component1(android.graphics.RectF r0) {
            float r0 = r0.left
            return r0
    }

    public static final int component1(android.graphics.Rect r0) {
            int r0 = r0.left
            return r0
    }

    public static final float component2(android.graphics.RectF r0) {
            float r0 = r0.top
            return r0
    }

    public static final int component2(android.graphics.Rect r0) {
            int r0 = r0.top
            return r0
    }

    public static final float component3(android.graphics.RectF r0) {
            float r0 = r0.right
            return r0
    }

    public static final int component3(android.graphics.Rect r0) {
            int r0 = r0.right
            return r0
    }

    public static final float component4(android.graphics.RectF r0) {
            float r0 = r0.bottom
            return r0
    }

    public static final int component4(android.graphics.Rect r0) {
            int r0 = r0.bottom
            return r0
    }

    public static final boolean contains(android.graphics.Rect r1, android.graphics.Point r2) {
            int r0 = r2.x
            int r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    public static final boolean contains(android.graphics.RectF r1, android.graphics.PointF r2) {
            float r0 = r2.x
            float r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    public static final android.graphics.Rect minus(android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = -r2
            r0.offset(r1, r1)
            return r0
    }

    public static final android.graphics.Rect minus(android.graphics.Rect r1, android.graphics.Point r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r2.x
            int r1 = -r1
            int r2 = r2.y
            int r2 = -r2
            r0.offset(r1, r2)
            return r0
    }

    public static final android.graphics.RectF minus(android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = -r2
            r0.offset(r1, r1)
            return r0
    }

    public static final android.graphics.RectF minus(android.graphics.RectF r1, android.graphics.PointF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r2.x
            float r1 = -r1
            float r2 = r2.y
            float r2 = -r2
            r0.offset(r1, r2)
            return r0
    }

    public static final android.graphics.Region minus(android.graphics.Rect r1, android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region minus(android.graphics.RectF r2, android.graphics.RectF r3) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.roundOut(r2)
            android.graphics.Region$Op r3 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r3)
            return r0
    }

    public static final android.graphics.Rect or(android.graphics.Rect r1, android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    public static final android.graphics.RectF or(android.graphics.RectF r1, android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    public static final android.graphics.Rect plus(android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.offset(r2, r2)
            return r0
    }

    public static final android.graphics.Rect plus(android.graphics.Rect r1, android.graphics.Point r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r2.x
            int r2 = r2.y
            r0.offset(r1, r2)
            return r0
    }

    public static final android.graphics.Rect plus(android.graphics.Rect r1, android.graphics.Rect r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    public static final android.graphics.RectF plus(android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.offset(r2, r2)
            return r0
    }

    public static final android.graphics.RectF plus(android.graphics.RectF r1, android.graphics.PointF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r2.x
            float r2 = r2.y
            r0.offset(r1, r2)
            return r0
    }

    public static final android.graphics.RectF plus(android.graphics.RectF r1, android.graphics.RectF r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    public static final android.graphics.Rect times(android.graphics.Rect r1, int r2) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r1)
            int r1 = r0.top
            int r1 = r1 * r2
            r0.top = r1
            int r1 = r0.left
            int r1 = r1 * r2
            r0.left = r1
            int r1 = r0.right
            int r1 = r1 * r2
            r0.right = r1
            int r1 = r0.bottom
            int r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    public static final android.graphics.RectF times(android.graphics.RectF r1, float r2) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r0.top
            float r1 = r1 * r2
            r0.top = r1
            float r1 = r0.left
            float r1 = r1 * r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 * r2
            r0.right = r1
            float r1 = r0.bottom
            float r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    public static final android.graphics.RectF times(android.graphics.RectF r1, int r2) {
            float r2 = (float) r2
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            float r1 = r0.top
            float r1 = r1 * r2
            r0.top = r1
            float r1 = r0.left
            float r1 = r1 * r2
            r0.left = r1
            float r1 = r0.right
            float r1 = r1 * r2
            r0.right = r1
            float r1 = r0.bottom
            float r1 = r1 * r2
            r0.bottom = r1
            return r0
    }

    public static final android.graphics.Rect toRect(android.graphics.RectF r1) {
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.roundOut(r0)
            return r0
    }

    public static final android.graphics.RectF toRectF(android.graphics.Rect r1) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            return r0
    }

    public static final android.graphics.Region toRegion(android.graphics.Rect r1) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            return r0
    }

    public static final android.graphics.Region toRegion(android.graphics.RectF r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            return r0
    }

    public static final android.graphics.RectF transform(android.graphics.RectF r0, android.graphics.Matrix r1) {
            r1.mapRect(r0)
            return r0
    }

    public static final android.graphics.Region xor(android.graphics.Rect r1, android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region xor(android.graphics.RectF r2, android.graphics.RectF r3) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.roundOut(r1)
            r0.<init>(r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.roundOut(r2)
            android.graphics.Region$Op r3 = android.graphics.Region.Op.XOR
            r0.op(r2, r3)
            return r0
    }
}
