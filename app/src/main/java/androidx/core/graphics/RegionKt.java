package androidx.core.graphics;

/* JADX INFO: compiled from: Region.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010(\n\u0002\b\u0007\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\n\u001a0\u0010\b\u001a\u00020\t*\u00020\u00012!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\t0\u000bH\u0086\b\u001a\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010*\u00020\u0001H\u0086\u0002\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0011\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\n\u001a\u0015\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\n\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0001H\u0086\n\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0086\f\u001a\u0015\u0010\u0016\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\f¨\u0006\u0017"}, d2 = {"and", "Landroid/graphics/Region;", "r", "Landroid/graphics/Rect;", "contains", "", "p", "Landroid/graphics/Point;", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "rect", "iterator", "", "minus", "not", "or", "plus", "unaryMinus", "xor", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class RegionKt {

    /* JADX INFO: renamed from: androidx.core.graphics.RegionKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Region.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\b\u001a\u00020\u0004H\u0096\u0002J\t\u0010\t\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/graphics/RegionKt$iterator$1", "", "Landroid/graphics/Rect;", "hasMore", "", "iterator", "Landroid/graphics/RegionIterator;", "rect", "hasNext", "next", "core-ktx_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.graphics.Rect>, kotlin.jvm.internal.markers.KMappedMarker {
        private boolean hasMore;
        private final android.graphics.RegionIterator iterator;
        private final android.graphics.Rect rect;

        AnonymousClass1(android.graphics.Region r2) {
                r1 = this;
                r1.<init>()
                android.graphics.RegionIterator r0 = new android.graphics.RegionIterator
                r0.<init>(r2)
                r1.iterator = r0
                android.graphics.Rect r2 = new android.graphics.Rect
                r2.<init>()
                r1.rect = r2
                boolean r2 = r0.next(r2)
                r1.hasMore = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.hasMore
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public android.graphics.Rect next() {
                r3 = this;
                boolean r0 = r3.hasMore
                if (r0 == 0) goto L16
                android.graphics.Rect r0 = new android.graphics.Rect
                android.graphics.Rect r1 = r3.rect
                r0.<init>(r1)
                android.graphics.RegionIterator r1 = r3.iterator
                android.graphics.Rect r2 = r3.rect
                boolean r1 = r1.next(r2)
                r3.hasMore = r1
                return r0
            L16:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.graphics.Rect next() {
                r1 = this;
                android.graphics.Rect r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public static final android.graphics.Region and(android.graphics.Region r1, android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region and(android.graphics.Region r1, android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.INTERSECT
            r0.op(r2, r1)
            return r0
    }

    public static final boolean contains(android.graphics.Region r1, android.graphics.Point r2) {
            int r0 = r2.x
            int r2 = r2.y
            boolean r1 = r1.contains(r0, r2)
            return r1
    }

    public static final void forEach(android.graphics.Region r2, kotlin.jvm.functions.Function1<? super android.graphics.Rect, kotlin.Unit> r3) {
            android.graphics.RegionIterator r0 = new android.graphics.RegionIterator
            r0.<init>(r2)
        L5:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            boolean r1 = r0.next(r2)
            if (r1 != 0) goto L11
            return
        L11:
            r3.invoke(r2)
            goto L5
    }

    public static final java.util.Iterator<android.graphics.Rect> iterator(android.graphics.Region r1) {
            androidx.core.graphics.RegionKt$iterator$1 r0 = new androidx.core.graphics.RegionKt$iterator$1
            r0.<init>(r1)
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
    }

    public static final android.graphics.Region minus(android.graphics.Region r1, android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region minus(android.graphics.Region r1, android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region not(android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = r2.getBounds()
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region or(android.graphics.Region r1, android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    public static final android.graphics.Region or(android.graphics.Region r1, android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region plus(android.graphics.Region r1, android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            r0.union(r2)
            return r0
    }

    public static final android.graphics.Region plus(android.graphics.Region r1, android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.UNION
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region unaryMinus(android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            android.graphics.Rect r1 = r2.getBounds()
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region xor(android.graphics.Region r1, android.graphics.Rect r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }

    public static final android.graphics.Region xor(android.graphics.Region r1, android.graphics.Region r2) {
            android.graphics.Region r0 = new android.graphics.Region
            r0.<init>(r1)
            android.graphics.Region$Op r1 = android.graphics.Region.Op.XOR
            r0.op(r2, r1)
            return r0
    }
}
