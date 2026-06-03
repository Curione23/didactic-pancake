package org.apache.commons.lang3.util;

/* JADX INFO: loaded from: classes2.dex */
public final class FluentBitSet implements java.lang.Cloneable, java.io.Serializable {
    private static final long serialVersionUID = 1;
    private final java.util.BitSet bitSet;

    public FluentBitSet() {
            r1 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1.<init>(r0)
            return
    }

    public FluentBitSet(int r2) {
            r1 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public FluentBitSet(java.util.BitSet r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "set"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.BitSet r2 = (java.util.BitSet) r2
            r1.bitSet = r2
            return
    }

    public org.apache.commons.lang3.util.FluentBitSet and(java.util.BitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.and(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet and(org.apache.commons.lang3.util.FluentBitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            java.util.BitSet r2 = r2.bitSet
            r0.and(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet andNot(java.util.BitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.andNot(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet andNot(org.apache.commons.lang3.util.FluentBitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            java.util.BitSet r2 = r2.bitSet
            r0.andNot(r2)
            return r1
    }

    public java.util.BitSet bitSet() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            return r0
    }

    public int cardinality() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r0 = r0.cardinality()
            return r0
    }

    public org.apache.commons.lang3.util.FluentBitSet clear() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.clear()
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet clear(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.clear(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet clear(int r2, int r3) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.clear(r2, r3)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet clear(int... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Le
            r2 = r5[r1]
            java.util.BitSet r3 = r4.bitSet
            r3.clear(r2)
            int r1 = r1 + 1
            goto L2
        Le:
            return r4
    }

    public java.lang.Object clone() {
            r2 = this;
            org.apache.commons.lang3.util.FluentBitSet r0 = new org.apache.commons.lang3.util.FluentBitSet
            java.util.BitSet r1 = r2.bitSet
            java.lang.Object r1 = r1.clone()
            java.util.BitSet r1 = (java.util.BitSet) r1
            r0.<init>(r1)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r2 instanceof org.apache.commons.lang3.util.FluentBitSet
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            org.apache.commons.lang3.util.FluentBitSet r2 = (org.apache.commons.lang3.util.FluentBitSet) r2
            java.util.BitSet r0 = r1.bitSet
            java.util.BitSet r2 = r2.bitSet
            boolean r2 = java.util.Objects.equals(r0, r2)
            return r2
    }

    public org.apache.commons.lang3.util.FluentBitSet flip(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.flip(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet flip(int r2, int r3) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.flip(r2, r3)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet get(int r3, int r4) {
            r2 = this;
            org.apache.commons.lang3.util.FluentBitSet r0 = new org.apache.commons.lang3.util.FluentBitSet
            java.util.BitSet r1 = r2.bitSet
            java.util.BitSet r3 = r1.get(r3, r4)
            r0.<init>(r3)
            return r0
    }

    public boolean get(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            boolean r2 = r0.get(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r0 = r0.hashCode()
            return r0
    }

    public boolean intersects(java.util.BitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            boolean r2 = r0.intersects(r2)
            return r2
    }

    public boolean intersects(org.apache.commons.lang3.util.FluentBitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            java.util.BitSet r2 = r2.bitSet
            boolean r2 = r0.intersects(r2)
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            boolean r0 = r0.isEmpty()
            return r0
    }

    public int length() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r0 = r0.length()
            return r0
    }

    public int nextClearBit(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r2 = r0.nextClearBit(r2)
            return r2
    }

    public int nextSetBit(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r2 = r0.nextSetBit(r2)
            return r2
    }

    public org.apache.commons.lang3.util.FluentBitSet or(java.util.BitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.or(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet or(org.apache.commons.lang3.util.FluentBitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            java.util.BitSet r2 = r2.bitSet
            r0.or(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet or(org.apache.commons.lang3.util.FluentBitSet... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r5[r1]
            java.util.BitSet r3 = r4.bitSet
            java.util.BitSet r2 = r2.bitSet
            r3.or(r2)
            int r1 = r1 + 1
            goto L2
        L10:
            return r4
    }

    public int previousClearBit(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r2 = r0.previousClearBit(r2)
            return r2
    }

    public int previousSetBit(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r2 = r0.previousSetBit(r2)
            return r2
    }

    public org.apache.commons.lang3.util.FluentBitSet set(int r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.set(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet set(int r2, int r3) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.set(r2, r3)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet set(int r2, int r3, boolean r4) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.set(r2, r3, r4)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet set(int r2, boolean r3) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.set(r2, r3)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet set(int... r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Le
            r2 = r5[r1]
            java.util.BitSet r3 = r4.bitSet
            r3.set(r2)
            int r1 = r1 + 1
            goto L2
        Le:
            return r4
    }

    public org.apache.commons.lang3.util.FluentBitSet setInclusive(int r2, int r3) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r3 = r3 + 1
            r0.set(r2, r3)
            return r1
    }

    public int size() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            int r0 = r0.size()
            return r0
    }

    public java.util.stream.IntStream stream() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            java.util.stream.IntStream r0 = r0.stream()
            return r0
    }

    public byte[] toByteArray() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            byte[] r0 = r0.toByteArray()
            return r0
    }

    public long[] toLongArray() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            long[] r0 = r0.toLongArray()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            java.lang.String r0 = r0.toString()
            return r0
    }

    public org.apache.commons.lang3.util.FluentBitSet xor(java.util.BitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            r0.xor(r2)
            return r1
    }

    public org.apache.commons.lang3.util.FluentBitSet xor(org.apache.commons.lang3.util.FluentBitSet r2) {
            r1 = this;
            java.util.BitSet r0 = r1.bitSet
            java.util.BitSet r2 = r2.bitSet
            r0.xor(r2)
            return r1
    }
}
