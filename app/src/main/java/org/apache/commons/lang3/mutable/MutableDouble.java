package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableDouble extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableDouble>, org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 1587163916;
    private double value;

    public MutableDouble() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutableDouble(double r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public MutableDouble(java.lang.Number r3) {
            r2 = this;
            r2.<init>()
            double r0 = r3.doubleValue()
            r2.value = r0
            return
    }

    public MutableDouble(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            double r0 = java.lang.Double.parseDouble(r3)
            r2.value = r0
            return
    }

    public void add(double r3) {
            r2 = this;
            double r0 = r2.value
            double r0 = r0 + r3
            r2.value = r0
            return
    }

    public void add(java.lang.Number r5) {
            r4 = this;
            double r0 = r4.value
            double r2 = r5.doubleValue()
            double r0 = r0 + r2
            r4.value = r0
            return
    }

    public double addAndGet(double r3) {
            r2 = this;
            double r0 = r2.value
            double r0 = r0 + r3
            r2.value = r0
            return r0
    }

    public double addAndGet(java.lang.Number r5) {
            r4 = this;
            double r0 = r4.value
            double r2 = r5.doubleValue()
            double r0 = r0 + r2
            r4.value = r0
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.lang3.mutable.MutableDouble r1) {
            r0 = this;
            org.apache.commons.lang3.mutable.MutableDouble r1 = (org.apache.commons.lang3.mutable.MutableDouble) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.apache.commons.lang3.mutable.MutableDouble r5) {
            r4 = this;
            double r0 = r4.value
            double r2 = r5.value
            int r5 = java.lang.Double.compare(r0, r2)
            return r5
    }

    public void decrement() {
            r4 = this;
            double r0 = r4.value
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            r4.value = r0
            return
    }

    public double decrementAndGet() {
            r4 = this;
            double r0 = r4.value
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 - r2
            r4.value = r0
            return r0
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            double r0 = r2.value
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof org.apache.commons.lang3.mutable.MutableDouble
            if (r0 == 0) goto L18
            org.apache.commons.lang3.mutable.MutableDouble r5 = (org.apache.commons.lang3.mutable.MutableDouble) r5
            double r0 = r5.value
            long r0 = java.lang.Double.doubleToLongBits(r0)
            double r2 = r4.value
            long r2 = java.lang.Double.doubleToLongBits(r2)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            return r5
    }

    @Override // java.lang.Number
    public float floatValue() {
            r2 = this;
            double r0 = r2.value
            float r0 = (float) r0
            return r0
    }

    public double getAndAdd(double r3) {
            r2 = this;
            double r0 = r2.value
            double r3 = r3 + r0
            r2.value = r3
            return r0
    }

    public double getAndAdd(java.lang.Number r5) {
            r4 = this;
            double r0 = r4.value
            double r2 = r5.doubleValue()
            double r2 = r2 + r0
            r4.value = r2
            return r0
    }

    public double getAndDecrement() {
            r4 = this;
            double r0 = r4.value
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r0 - r2
            r4.value = r2
            return r0
    }

    public double getAndIncrement() {
            r4 = this;
            double r0 = r4.value
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 + r0
            r4.value = r2
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public java.lang.Number getValue() {
            r2 = this;
            double r0 = r2.value
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.lang.Number getValue2() {
            r1 = this;
            java.lang.Double r0 = r1.getValue()
            return r0
    }

    public int hashCode() {
            r4 = this;
            double r0 = r4.value
            long r0 = java.lang.Double.doubleToLongBits(r0)
            r2 = 32
            long r2 = r0 >>> r2
            long r0 = r0 ^ r2
            int r0 = (int) r0
            return r0
    }

    public void increment() {
            r4 = this;
            double r0 = r4.value
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            r4.value = r0
            return
    }

    public double incrementAndGet() {
            r4 = this;
            double r0 = r4.value
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 + r2
            r4.value = r0
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r2 = this;
            double r0 = r2.value
            int r0 = (int) r0
            return r0
    }

    public boolean isInfinite() {
            r2 = this;
            double r0 = r2.value
            boolean r0 = java.lang.Double.isInfinite(r0)
            return r0
    }

    public boolean isNaN() {
            r2 = this;
            double r0 = r2.value
            boolean r0 = java.lang.Double.isNaN(r0)
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            double r0 = r2.value
            long r0 = (long) r0
            return r0
    }

    public void setValue(double r1) {
            r0 = this;
            r0.value = r1
            return
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(java.lang.Number r3) {
            r2 = this;
            double r0 = r3.doubleValue()
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

    public void subtract(double r3) {
            r2 = this;
            double r0 = r2.value
            double r0 = r0 - r3
            r2.value = r0
            return
    }

    public void subtract(java.lang.Number r5) {
            r4 = this;
            double r0 = r4.value
            double r2 = r5.doubleValue()
            double r0 = r0 - r2
            r4.value = r0
            return
    }

    public java.lang.Double toDouble() {
            r2 = this;
            double r0 = r2.doubleValue()
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            double r0 = r2.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
