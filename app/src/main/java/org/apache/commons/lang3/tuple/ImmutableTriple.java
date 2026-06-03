package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes2.dex */
public class ImmutableTriple<L, M, R> extends org.apache.commons.lang3.tuple.Triple<L, M, R> {
    public static final org.apache.commons.lang3.tuple.ImmutableTriple<?, ?, ?>[] EMPTY_ARRAY = null;
    private static final org.apache.commons.lang3.tuple.ImmutableTriple NULL = null;
    private static final long serialVersionUID = 1;
    public final L left;
    public final M middle;
    public final R right;

    static {
            r0 = 0
            org.apache.commons.lang3.tuple.ImmutableTriple[] r0 = new org.apache.commons.lang3.tuple.ImmutableTriple[r0]
            org.apache.commons.lang3.tuple.ImmutableTriple.EMPTY_ARRAY = r0
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = new org.apache.commons.lang3.tuple.ImmutableTriple
            r1 = 0
            r0.<init>(r1, r1, r1)
            org.apache.commons.lang3.tuple.ImmutableTriple.NULL = r0
            return
    }

    public ImmutableTriple(L r1, M r2, R r3) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.middle = r2
            r0.right = r3
            return
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R>[] emptyArray() {
            org.apache.commons.lang3.tuple.ImmutableTriple<?, ?, ?>[] r0 = org.apache.commons.lang3.tuple.ImmutableTriple.EMPTY_ARRAY
            return r0
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> nullTriple() {
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = org.apache.commons.lang3.tuple.ImmutableTriple.NULL
            return r0
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> of(L r3, M r4, R r5) {
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            if (r4 == 0) goto La
            goto Lb
        La:
            r0 = r1
        Lb:
            r0 = r0 | r2
            if (r0 != 0) goto L16
            if (r5 == 0) goto L11
            goto L16
        L11:
            org.apache.commons.lang3.tuple.ImmutableTriple r3 = nullTriple()
            goto L1c
        L16:
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = new org.apache.commons.lang3.tuple.ImmutableTriple
            r0.<init>(r3, r4, r5)
            r3 = r0
        L1c:
            return r3
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.ImmutableTriple<L, M, R> ofNonNull(L r1, M r2, R r3) {
            java.lang.String r0 = "left"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "middle"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "right"
            java.lang.Object r3 = java.util.Objects.requireNonNull(r3, r0)
            org.apache.commons.lang3.tuple.ImmutableTriple r1 = of(r1, r2, r3)
            return r1
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public L getLeft() {
            r1 = this;
            L r0 = r1.left
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public M getMiddle() {
            r1 = this;
            M r0 = r1.middle
            return r0
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public R getRight() {
            r1 = this;
            R r0 = r1.right
            return r0
    }
}
