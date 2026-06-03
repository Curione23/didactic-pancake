package kotlin.collections;

/* JADX INFO: compiled from: ReversedViews.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reverseIteratorIndex", "reverseIteratorIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
class CollectionsKt__ReversedViewsKt extends kotlin.collections.CollectionsKt__MutableCollectionsKt {
    public CollectionsKt__ReversedViewsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ int access$reverseElementIndex(java.util.List r0, int r1) {
            int r0 = reverseElementIndex$CollectionsKt__ReversedViewsKt(r0, r1)
            return r0
    }

    public static final /* synthetic */ int access$reverseIteratorIndex(java.util.List r0, int r1) {
            int r0 = reverseIteratorIndex$CollectionsKt__ReversedViewsKt(r0, r1)
            return r0
    }

    public static final /* synthetic */ int access$reversePositionIndex(java.util.List r0, int r1) {
            int r0 = reversePositionIndex$CollectionsKt__ReversedViewsKt(r0, r1)
            return r0
    }

    public static final <T> java.util.List<T> asReversed(java.util.List<? extends T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.ReversedListReadOnly r0 = new kotlin.collections.ReversedListReadOnly
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static final <T> java.util.List<T> asReversedMutable(java.util.List<T> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.collections.ReversedList r0 = new kotlin.collections.ReversedList
            r0.<init>(r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> r4, int r5) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = kotlin.collections.CollectionsKt.getLastIndex(r4)
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L16
            int r4 = kotlin.collections.CollectionsKt.getLastIndex(r4)
            int r4 = r4 - r5
            return r4
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Element index "
            r1.<init>(r3)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = " must be in range ["
            java.lang.StringBuilder r5 = r5.append(r1)
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            int r4 = kotlin.collections.CollectionsKt.getLastIndex(r4)
            r1.<init>(r2, r4)
            java.lang.StringBuilder r4 = r5.append(r1)
            java.lang.String r5 = "]."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> r0, int r1) {
            int r0 = kotlin.collections.CollectionsKt.getLastIndex(r0)
            int r0 = r0 - r1
            return r0
    }

    private static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(java.util.List<?> r4, int r5) {
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            int r1 = r4.size()
            r2 = 0
            r0.<init>(r2, r1)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L16
            int r4 = r4.size()
            int r4 = r4 - r5
            return r4
        L16:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Position index "
            r1.<init>(r3)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = " must be in range ["
            java.lang.StringBuilder r5 = r5.append(r1)
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            int r4 = r4.size()
            r1.<init>(r2, r4)
            java.lang.StringBuilder r4 = r5.append(r1)
            java.lang.String r5 = "]."
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }
}
