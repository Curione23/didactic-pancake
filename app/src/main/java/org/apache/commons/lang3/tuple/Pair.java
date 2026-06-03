package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Pair<L, R> implements java.util.Map.Entry<L, R>, java.lang.Comparable<org.apache.commons.lang3.tuple.Pair<L, R>>, java.io.Serializable {
    public static final org.apache.commons.lang3.tuple.Pair<?, ?>[] EMPTY_ARRAY = null;
    private static final long serialVersionUID = 4954918890077093841L;

    static {
            r0 = 0
            org.apache.commons.lang3.tuple.Pair[] r0 = new org.apache.commons.lang3.tuple.Pair[r0]
            org.apache.commons.lang3.tuple.Pair.EMPTY_ARRAY = r0
            return
    }

    public Pair() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <L, R> org.apache.commons.lang3.tuple.Pair<L, R>[] emptyArray() {
            org.apache.commons.lang3.tuple.Pair<?, ?>[] r0 = org.apache.commons.lang3.tuple.Pair.EMPTY_ARRAY
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.Pair<L, R> of(L r0, R r1) {
            org.apache.commons.lang3.tuple.ImmutablePair r0 = org.apache.commons.lang3.tuple.ImmutablePair.of(r0, r1)
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.Pair<L, R> of(java.util.Map.Entry<L, R> r0) {
            org.apache.commons.lang3.tuple.ImmutablePair r0 = org.apache.commons.lang3.tuple.ImmutablePair.of(r0)
            return r0
    }

    public static <L, R> org.apache.commons.lang3.tuple.Pair<L, R> ofNonNull(L r0, R r1) {
            org.apache.commons.lang3.tuple.ImmutablePair r0 = org.apache.commons.lang3.tuple.ImmutablePair.ofNonNull(r0, r1)
            return r0
    }

    public <E extends java.lang.Throwable> void accept(org.apache.commons.lang3.function.FailableBiConsumer<L, R, E> r3) throws java.lang.Throwable {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r1 = r2.getValue()
            r3.accept(r0, r1)
            return
    }

    public <V, E extends java.lang.Throwable> V apply(org.apache.commons.lang3.function.FailableBiFunction<L, R, V, E> r3) throws java.lang.Throwable {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r3 = r3.apply(r0, r1)
            return r3
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            org.apache.commons.lang3.tuple.Pair r1 = (org.apache.commons.lang3.tuple.Pair) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public int compareTo(org.apache.commons.lang3.tuple.Pair<L, R> r4) {
            r3 = this;
            org.apache.commons.lang3.builder.CompareToBuilder r0 = new org.apache.commons.lang3.builder.CompareToBuilder
            r0.<init>()
            java.lang.Object r1 = r3.getLeft()
            java.lang.Object r2 = r4.getLeft()
            org.apache.commons.lang3.builder.CompareToBuilder r0 = r0.append(r1, r2)
            java.lang.Object r1 = r3.getRight()
            java.lang.Object r4 = r4.getRight()
            org.apache.commons.lang3.builder.CompareToBuilder r4 = r0.append(r1, r4)
            int r4 = r4.toComparison()
            return r4
    }

    @Override // java.util.Map.Entry
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map.Entry
            r2 = 0
            if (r1 == 0) goto L2a
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r3 = r5.getKey()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L28
            java.lang.Object r1 = r4.getValue()
            java.lang.Object r5 = r5.getValue()
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L28
            goto L29
        L28:
            r0 = r2
        L29:
            return r0
        L2a:
            return r2
    }

    @Override // java.util.Map.Entry
    public final L getKey() {
            r1 = this;
            java.lang.Object r0 = r1.getLeft()
            return r0
    }

    public abstract L getLeft();

    public abstract R getRight();

    @Override // java.util.Map.Entry
    public R getValue() {
            r1 = this;
            java.lang.Object r0 = r1.getRight()
            return r0
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            int r0 = java.util.Objects.hashCode(r0)
            java.lang.Object r1 = r2.getValue()
            int r1 = java.util.Objects.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r2.getLeft()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 44
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2.getRight()
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString(java.lang.String r3) {
            r2 = this;
            java.lang.Object r0 = r2.getLeft()
            java.lang.Object r1 = r2.getRight()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1}
            java.lang.String r3 = java.lang.String.format(r3, r0)
            return r3
    }
}
