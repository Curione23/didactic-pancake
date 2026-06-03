package org.apache.commons.lang3.tuple;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Triple<L, M, R> implements java.lang.Comparable<org.apache.commons.lang3.tuple.Triple<L, M, R>>, java.io.Serializable {
    public static final org.apache.commons.lang3.tuple.Triple<?, ?, ?>[] EMPTY_ARRAY = null;
    private static final long serialVersionUID = 1;

    static {
            r0 = 0
            org.apache.commons.lang3.tuple.Triple[] r0 = new org.apache.commons.lang3.tuple.Triple[r0]
            org.apache.commons.lang3.tuple.Triple.EMPTY_ARRAY = r0
            return
    }

    public Triple() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.Triple<L, M, R>[] emptyArray() {
            org.apache.commons.lang3.tuple.Triple<?, ?, ?>[] r0 = org.apache.commons.lang3.tuple.Triple.EMPTY_ARRAY
            return r0
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.Triple<L, M, R> of(L r0, M r1, R r2) {
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = org.apache.commons.lang3.tuple.ImmutableTriple.of(r0, r1, r2)
            return r0
    }

    public static <L, M, R> org.apache.commons.lang3.tuple.Triple<L, M, R> ofNonNull(L r0, M r1, R r2) {
            org.apache.commons.lang3.tuple.ImmutableTriple r0 = org.apache.commons.lang3.tuple.ImmutableTriple.ofNonNull(r0, r1, r2)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            org.apache.commons.lang3.tuple.Triple r1 = (org.apache.commons.lang3.tuple.Triple) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public int compareTo(org.apache.commons.lang3.tuple.Triple<L, M, R> r4) {
            r3 = this;
            org.apache.commons.lang3.builder.CompareToBuilder r0 = new org.apache.commons.lang3.builder.CompareToBuilder
            r0.<init>()
            java.lang.Object r1 = r3.getLeft()
            java.lang.Object r2 = r4.getLeft()
            org.apache.commons.lang3.builder.CompareToBuilder r0 = r0.append(r1, r2)
            java.lang.Object r1 = r3.getMiddle()
            java.lang.Object r2 = r4.getMiddle()
            org.apache.commons.lang3.builder.CompareToBuilder r0 = r0.append(r1, r2)
            java.lang.Object r1 = r3.getRight()
            java.lang.Object r4 = r4.getRight()
            org.apache.commons.lang3.builder.CompareToBuilder r4 = r0.append(r1, r4)
            int r4 = r4.toComparison()
            return r4
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof org.apache.commons.lang3.tuple.Triple
            r2 = 0
            if (r1 == 0) goto L38
            org.apache.commons.lang3.tuple.Triple r5 = (org.apache.commons.lang3.tuple.Triple) r5
            java.lang.Object r1 = r4.getLeft()
            java.lang.Object r3 = r5.getLeft()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.getMiddle()
            java.lang.Object r3 = r5.getMiddle()
            boolean r1 = java.util.Objects.equals(r1, r3)
            if (r1 == 0) goto L36
            java.lang.Object r1 = r4.getRight()
            java.lang.Object r5 = r5.getRight()
            boolean r5 = java.util.Objects.equals(r1, r5)
            if (r5 == 0) goto L36
            goto L37
        L36:
            r0 = r2
        L37:
            return r0
        L38:
            return r2
    }

    public abstract L getLeft();

    public abstract M getMiddle();

    public abstract R getRight();

    public int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.getLeft()
            int r0 = java.util.Objects.hashCode(r0)
            java.lang.Object r1 = r2.getMiddle()
            int r1 = java.util.Objects.hashCode(r1)
            r0 = r0 ^ r1
            java.lang.Object r1 = r2.getRight()
            int r1 = java.util.Objects.hashCode(r1)
            r0 = r0 ^ r1
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r3.getLeft()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ","
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r2 = r3.getMiddle()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r3.getRight()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String toString(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.getLeft()
            java.lang.Object r1 = r3.getMiddle()
            java.lang.Object r2 = r3.getRight()
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r4 = java.lang.String.format(r4, r0)
            return r4
    }
}
