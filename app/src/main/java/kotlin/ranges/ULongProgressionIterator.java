package kotlin.ranges;

/* JADX INFO: compiled from: ULongRange.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002J\u0016\u0010\f\u001a\u00020\u0002H\u0096\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u00020\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0016\u0010\u0005\u001a\u00020\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000f"}, d2 = {"Lkotlin/ranges/ULongProgressionIterator;", "", "Lkotlin/ULong;", "first", "last", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "finalElement", "J", "hasNext", "", "next", "next-s-VKNKU", "()J", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class ULongProgressionIterator implements java.util.Iterator<kotlin.ULong>, kotlin.jvm.internal.markers.KMappedMarker {
    private final long finalElement;
    private boolean hasNext;
    private long next;
    private final long step;

    private ULongProgressionIterator(long r4, long r6, long r8) {
            r3 = this;
            r3.<init>()
            r3.finalElement = r6
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L14
            int r0 = java.lang.Long.compareUnsigned(r4, r6)
            if (r0 > 0) goto L1b
            goto L1c
        L14:
            int r0 = java.lang.Long.compareUnsigned(r4, r6)
            if (r0 < 0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            r3.hasNext = r1
            long r8 = kotlin.ULong.m941constructorimpl(r8)
            r3.step = r8
            boolean r8 = r3.hasNext
            if (r8 == 0) goto L29
            goto L2a
        L29:
            r4 = r6
        L2a:
            r3.next = r4
            return
    }

    public /* synthetic */ ULongProgressionIterator(long r1, long r3, long r5, kotlin.jvm.internal.DefaultConstructorMarker r7) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            return
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
            r1 = this;
            boolean r0 = r1.hasNext
            return r0
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ kotlin.ULong next() {
            r2 = this;
            long r0 = r2.m2001nextsVKNKU()
            kotlin.ULong r0 = kotlin.ULong.m935boximpl(r0)
            return r0
    }

    /* JADX INFO: renamed from: next-s-VKNKU, reason: not valid java name */
    public long m2001nextsVKNKU() {
            r4 = this;
            long r0 = r4.next
            long r2 = r4.finalElement
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L16
            boolean r2 = r4.hasNext
            if (r2 == 0) goto L10
            r2 = 0
            r4.hasNext = r2
            goto L1f
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            r0.<init>()
            throw r0
        L16:
            long r2 = r4.step
            long r2 = r2 + r0
            long r2 = kotlin.ULong.m941constructorimpl(r2)
            r4.next = r2
        L1f:
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
