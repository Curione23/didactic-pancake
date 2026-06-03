package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableLong extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableLong>, org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 62986528375L;
    private long value;

    public MutableLong() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutableLong(long r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public MutableLong(java.lang.Number r3) {
            r2 = this;
            r2.<init>()
            long r0 = r3.longValue()
            r2.value = r0
            return
    }

    public MutableLong(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            long r0 = java.lang.Long.parseLong(r3)
            r2.value = r0
            return
    }

    public void add(long r3) {
            r2 = this;
            long r0 = r2.value
            long r0 = r0 + r3
            r2.value = r0
            return
    }

    public void add(java.lang.Number r5) {
            r4 = this;
            long r0 = r4.value
            long r2 = r5.longValue()
            long r0 = r0 + r2
            r4.value = r0
            return
    }

    public long addAndGet(long r3) {
            r2 = this;
            long r0 = r2.value
            long r0 = r0 + r3
            r2.value = r0
            return r0
    }

    public long addAndGet(java.lang.Number r5) {
            r4 = this;
            long r0 = r4.value
            long r2 = r5.longValue()
            long r0 = r0 + r2
            r4.value = r0
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.lang3.mutable.MutableLong r1) {
            r0 = this;
            org.apache.commons.lang3.mutable.MutableLong r1 = (org.apache.commons.lang3.mutable.MutableLong) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.apache.commons.lang3.mutable.MutableLong r5) {
            r4 = this;
            long r0 = r4.value
            long r2 = r5.value
            int r5 = org.apache.commons.lang3.math.NumberUtils.compare(r0, r2)
            return r5
    }

    public void decrement() {
            r4 = this;
            long r0 = r4.value
            r2 = 1
            long r0 = r0 - r2
            r4.value = r0
            return
    }

    public long decrementAndGet() {
            r4 = this;
            long r0 = r4.value
            r2 = 1
            long r0 = r0 - r2
            r4.value = r0
            return r0
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            long r0 = r2.value
            double r0 = (double) r0
            return r0
    }

    public boolean equals(java.lang.Object r7) {
            r6 = this;
            boolean r0 = r7 instanceof org.apache.commons.lang3.mutable.MutableLong
            r1 = 0
            if (r0 == 0) goto L12
            long r2 = r6.value
            org.apache.commons.lang3.mutable.MutableLong r7 = (org.apache.commons.lang3.mutable.MutableLong) r7
            long r4 = r7.longValue()
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 != 0) goto L12
            r1 = 1
        L12:
            return r1
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            long r0 = r2.value
            float r0 = (float) r0
            return r0
    }

    public long getAndAdd(long r3) {
            r2 = this;
            long r0 = r2.value
            long r3 = r3 + r0
            r2.value = r3
            return r0
    }

    public long getAndAdd(java.lang.Number r5) {
            r4 = this;
            long r0 = r4.value
            long r2 = r5.longValue()
            long r2 = r2 + r0
            r4.value = r2
            return r0
    }

    public long getAndDecrement() {
            r4 = this;
            long r0 = r4.value
            r2 = 1
            long r2 = r0 - r2
            r4.value = r2
            return r0
    }

    public long getAndIncrement() {
            r4 = this;
            long r0 = r4.value
            r2 = 1
            long r2 = r2 + r0
            r4.value = r2
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public java.lang.Number getValue() {
            r2 = this;
            long r0 = r2.value
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.lang.Number getValue2() {
            r1 = this;
            java.lang.Long r0 = r1.getValue()
            return r0
    }

    public int hashCode() {
            r4 = this;
            long r0 = r4.value
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r0 = (int) r0
            return r0
    }

    public void increment() {
            r4 = this;
            long r0 = r4.value
            r2 = 1
            long r0 = r0 + r2
            r4.value = r0
            return
    }

    public long incrementAndGet() {
            r4 = this;
            long r0 = r4.value
            r2 = 1
            long r0 = r0 + r2
            r4.value = r0
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            long r0 = r2.value
            int r0 = (int) r0
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            long r0 = r2.value
            return r0
    }

    public void setValue(long r1) {
            r0 = this;
            r0.value = r1
            return
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(java.lang.Number r3) {
            r2 = this;
            long r0 = r3.longValue()
            r2.value = r0
            return
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public /* bridge */ /* synthetic */ void setValue(java.lang.Number r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            r0.setValue2(r1)
            return
    }

    public void subtract(long r3) {
            r2 = this;
            long r0 = r2.value
            long r0 = r0 - r3
            r2.value = r0
            return
    }

    public void subtract(java.lang.Number r5) {
            r4 = this;
            long r0 = r4.value
            long r2 = r5.longValue()
            long r0 = r0 - r2
            r4.value = r0
            return
    }

    public java.lang.Long toLong() {
            r2 = this;
            long r0 = r2.longValue()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            long r0 = r2.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
