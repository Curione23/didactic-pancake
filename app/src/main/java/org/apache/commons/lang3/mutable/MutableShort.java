package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableShort extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableShort>, org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = -2135791679;
    private short value;

    public MutableShort() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutableShort(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            short r1 = r1.shortValue()
            r0.value = r1
            return
    }

    public MutableShort(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            short r1 = java.lang.Short.parseShort(r1)
            r0.value = r1
            return
    }

    public MutableShort(short r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public void add(java.lang.Number r2) {
            r1 = this;
            short r0 = r1.value
            short r2 = r2.shortValue()
            int r0 = r0 + r2
            short r2 = (short) r0
            r1.value = r2
            return
    }

    public void add(short r2) {
            r1 = this;
            short r0 = r1.value
            int r0 = r0 + r2
            short r2 = (short) r0
            r1.value = r2
            return
    }

    public short addAndGet(java.lang.Number r2) {
            r1 = this;
            short r0 = r1.value
            short r2 = r2.shortValue()
            int r0 = r0 + r2
            short r2 = (short) r0
            r1.value = r2
            return r2
    }

    public short addAndGet(short r2) {
            r1 = this;
            short r0 = r1.value
            int r0 = r0 + r2
            short r2 = (short) r0
            r1.value = r2
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.lang3.mutable.MutableShort r1) {
            r0 = this;
            org.apache.commons.lang3.mutable.MutableShort r1 = (org.apache.commons.lang3.mutable.MutableShort) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.apache.commons.lang3.mutable.MutableShort r2) {
            r1 = this;
            short r0 = r1.value
            short r2 = r2.value
            int r2 = org.apache.commons.lang3.math.NumberUtils.compare(r0, r2)
            return r2
    }

    public void decrement() {
            r1 = this;
            short r0 = r1.value
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r1.value = r0
            return
    }

    public short decrementAndGet() {
            r1 = this;
            short r0 = r1.value
            int r0 = r0 + (-1)
            short r0 = (short) r0
            r1.value = r0
            return r0
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            short r0 = r2.value
            double r0 = (double) r0
            return r0
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof org.apache.commons.lang3.mutable.MutableShort
            r1 = 0
            if (r0 == 0) goto L10
            short r0 = r2.value
            org.apache.commons.lang3.mutable.MutableShort r3 = (org.apache.commons.lang3.mutable.MutableShort) r3
            short r3 = r3.shortValue()
            if (r0 != r3) goto L10
            r1 = 1
        L10:
            return r1
    }

    @Override // java.lang.Number
    public float floatValue() {
            r1 = this;
            short r0 = r1.value
            float r0 = (float) r0
            return r0
    }

    public short getAndAdd(java.lang.Number r2) {
            r1 = this;
            short r0 = r1.value
            short r2 = r2.shortValue()
            int r2 = r2 + r0
            short r2 = (short) r2
            r1.value = r2
            return r0
    }

    public short getAndAdd(short r2) {
            r1 = this;
            short r0 = r1.value
            int r2 = r2 + r0
            short r2 = (short) r2
            r1.value = r2
            return r0
    }

    public short getAndDecrement() {
            r2 = this;
            short r0 = r2.value
            int r1 = r0 + (-1)
            short r1 = (short) r1
            r2.value = r1
            return r0
    }

    public short getAndIncrement() {
            r2 = this;
            short r0 = r2.value
            int r1 = r0 + 1
            short r1 = (short) r1
            r2.value = r1
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public /* bridge */ /* synthetic */ java.lang.Number getValue() {
            r1 = this;
            java.lang.Short r0 = r1.getValue2()
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public java.lang.Number getValue2() {
            r1 = this;
            short r0 = r1.value
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    public int hashCode() {
            r1 = this;
            short r0 = r1.value
            return r0
    }

    public void increment() {
            r1 = this;
            short r0 = r1.value
            int r0 = r0 + 1
            short r0 = (short) r0
            r1.value = r0
            return
    }

    public short incrementAndGet() {
            r1 = this;
            short r0 = r1.value
            int r0 = r0 + 1
            short r0 = (short) r0
            r1.value = r0
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r1 = this;
            short r0 = r1.value
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            short r0 = r2.value
            long r0 = (long) r0
            return r0
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(java.lang.Number r1) {
            r0 = this;
            short r1 = r1.shortValue()
            r0.value = r1
            return
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public /* bridge */ /* synthetic */ void setValue(java.lang.Number r1) {
            r0 = this;
            java.lang.Number r1 = (java.lang.Number) r1
            r0.setValue2(r1)
            return
    }

    public void setValue(short r1) {
            r0 = this;
            r0.value = r1
            return
    }

    @Override // java.lang.Number
    public short shortValue() {
            r1 = this;
            short r0 = r1.value
            return r0
    }

    public void subtract(java.lang.Number r2) {
            r1 = this;
            short r0 = r1.value
            short r2 = r2.shortValue()
            int r0 = r0 - r2
            short r2 = (short) r0
            r1.value = r2
            return
    }

    public void subtract(short r2) {
            r1 = this;
            short r0 = r1.value
            int r0 = r0 - r2
            short r2 = (short) r0
            r1.value = r2
            return
    }

    public java.lang.Short toShort() {
            r1 = this;
            short r0 = r1.shortValue()
            java.lang.Short r0 = java.lang.Short.valueOf(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            short r0 = r1.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
