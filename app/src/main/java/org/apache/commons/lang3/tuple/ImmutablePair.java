package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes2.dex */
public class ImmutablePair<L, R> extends org.apache.commons.lang3.tuple.Pair<L, R> {
    public static final org.apache.commons.lang3.tuple.ImmutablePair<?, ?>[] EMPTY_ARRAY = null;
    private static final org.apache.commons.lang3.tuple.ImmutablePair NULL = null;
    private static final long serialVersionUID = 4954918890077093841L;
    public final L left;
    public final R right;

    static {
            r0 = 0
            org.apache.commons.lang3.tuple.ImmutablePair[] r0 = new org.apache.commons.lang3.tuple.ImmutablePair[r0]
            org.apache.commons.lang3.tuple.ImmutablePair.EMPTY_ARRAY = r0
            org.apache.commons.lang3.tuple.ImmutablePair r0 = new org.apache.commons.lang3.tuple.ImmutablePair
            r1 = 0
            r0.<init>(r1, r1)
            org.apache.commons.lang3.tuple.ImmutablePair.NULL = r0
            return
    }

    public ImmutablePair(L r1, R r2) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.right = r2
            return
    }

    public static <L, R> org.apache.commons.lang3.tuple.ImmutablePair<L, R>[] emptyArray() {
            org.apache.commons.lang3.tuple.ImmutablePair<?, ?>[] r0 = org.apache.commons.lang3.tuple.ImmutablePair.EMPTY_ARRAY
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.Pair<L, R> left(L r1) {
            r0 = 0
            org.apache.commons.lang3.tuple.ImmutablePair r1 = of(r1, r0)
            return r1
    }

    public static <L, R> org.apache.commons.lang3.tuple.ImmutablePair<L, R> nullPair() {
            org.apache.commons.lang3.tuple.ImmutablePair r0 = org.apache.commons.lang3.tuple.ImmutablePair.NULL
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.ImmutablePair<L, R> of(L r1, R r2) {
            if (r1 != 0) goto La
            if (r2 == 0) goto L5
            goto La
        L5:
            org.apache.commons.lang3.tuple.ImmutablePair r1 = nullPair()
            goto L10
        La:
            org.apache.commons.lang3.tuple.ImmutablePair r0 = new org.apache.commons.lang3.tuple.ImmutablePair
            r0.<init>(r1, r2)
            r1 = r0
        L10:
            return r1
    }

    public static <L, R> org.apache.commons.lang3.tuple.ImmutablePair<L, R> of(java.util.Map.Entry<L, R> r2) {
            if (r2 == 0) goto L10
            org.apache.commons.lang3.tuple.ImmutablePair r0 = new org.apache.commons.lang3.tuple.ImmutablePair
            java.lang.Object r1 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            r0.<init>(r1, r2)
            goto L14
        L10:
            org.apache.commons.lang3.tuple.ImmutablePair r0 = nullPair()
        L14:
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.ImmutablePair<L, R> ofNonNull(L r1, R r2) {
            java.lang.String r0 = "left"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "right"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.lang3.tuple.ImmutablePair r1 = of(r1, r2)
            return r1
    }

    public static <L, R> org.apache.commons.lang3.tuple.Pair<L, R> right(R r1) {
            r0 = 0
            org.apache.commons.lang3.tuple.ImmutablePair r1 = of(r0, r1)
            return r1
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public L getLeft() {
            r1 = this;
            L r0 = r1.left
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public R getRight() {
            r1 = this;
            R r0 = r1.right
            return r0
    }

    @Override // java.util.Map.Entry
    public R setValue(R r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }
}
