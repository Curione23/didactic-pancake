package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes2.dex */
public class MutablePair<L, R> extends org.apache.commons.lang3.tuple.Pair<L, R> {
    public static final org.apache.commons.lang3.tuple.MutablePair<?, ?>[] EMPTY_ARRAY = null;
    private static final long serialVersionUID = 4954918890077093841L;
    public L left;
    public R right;

    static {
            r0 = 0
            org.apache.commons.lang3.tuple.MutablePair[] r0 = new org.apache.commons.lang3.tuple.MutablePair[r0]
            org.apache.commons.lang3.tuple.MutablePair.EMPTY_ARRAY = r0
            return
    }

    public MutablePair() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutablePair(L r1, R r2) {
            r0 = this;
            r0.<init>()
            r0.left = r1
            r0.right = r2
            return
    }

    public static <L, R> org.apache.commons.lang3.tuple.MutablePair<L, R>[] emptyArray() {
            org.apache.commons.lang3.tuple.MutablePair<?, ?>[] r0 = org.apache.commons.lang3.tuple.MutablePair.EMPTY_ARRAY
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.MutablePair<L, R> of(L r1, R r2) {
            org.apache.commons.lang3.tuple.MutablePair r0 = new org.apache.commons.lang3.tuple.MutablePair
            r0.<init>(r1, r2)
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.MutablePair<L, R> of(java.util.Map.Entry<L, R> r2) {
            if (r2 == 0) goto Lb
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            goto Ld
        Lb:
            r0 = 0
            r2 = r0
        Ld:
            org.apache.commons.lang3.tuple.MutablePair r1 = new org.apache.commons.lang3.tuple.MutablePair
            r1.<init>(r0, r2)
            return r1
    }

    public static <L, R> org.apache.commons.lang3.tuple.MutablePair<L, R> ofNonNull(L r1, R r2) {
            java.lang.String r0 = "left"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.lang.String r0 = "right"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.lang3.tuple.MutablePair r1 = of(r1, r2)
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

    public void setLeft(L r1) {
            r0 = this;
            r0.left = r1
            return
    }

    public void setRight(R r1) {
            r0 = this;
            r0.right = r1
            return
    }

    @Override // java.util.Map.Entry
    public R setValue(R r2) {
            r1 = this;
            java.lang.Object r0 = r1.getRight()
            r1.setRight(r2)
            return r0
    }
}
