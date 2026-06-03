package org.apache.commons.lang3.mutable;

/* JADX INFO: loaded from: classes2.dex */
public class MutableFloat extends java.lang.Number implements java.lang.Comparable<org.apache.commons.lang3.mutable.MutableFloat>, org.apache.commons.lang3.mutable.Mutable<java.lang.Number> {
    private static final long serialVersionUID = 5787169186L;
    private float value;

    public MutableFloat() {
            r0 = this;
            r0.<init>()
            return
    }

    public MutableFloat(float r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    public MutableFloat(java.lang.Number r1) {
            r0 = this;
            r0.<init>()
            float r1 = r1.floatValue()
            r0.value = r1
            return
    }

    public MutableFloat(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            float r1 = java.lang.Float.parseFloat(r1)
            r0.value = r1
            return
    }

    public void add(float r2) {
            r1 = this;
            float r0 = r1.value
            float r0 = r0 + r2
            r1.value = r0
            return
    }

    public void add(java.lang.Number r2) {
            r1 = this;
            float r0 = r1.value
            float r2 = r2.floatValue()
            float r0 = r0 + r2
            r1.value = r0
            return
    }

    public float addAndGet(float r2) {
            r1 = this;
            float r0 = r1.value
            float r0 = r0 + r2
            r1.value = r0
            return r0
    }

    public float addAndGet(java.lang.Number r2) {
            r1 = this;
            float r0 = r1.value
            float r2 = r2.floatValue()
            float r0 = r0 + r2
            r1.value = r0
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(org.apache.commons.lang3.mutable.MutableFloat r1) {
            r0 = this;
            org.apache.commons.lang3.mutable.MutableFloat r1 = (org.apache.commons.lang3.mutable.MutableFloat) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* JADX INFO: renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(org.apache.commons.lang3.mutable.MutableFloat r2) {
            r1 = this;
            float r0 = r1.value
            float r2 = r2.value
            int r2 = java.lang.Float.compare(r0, r2)
            return r2
    }

    public void decrement() {
            r2 = this;
            float r0 = r2.value
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            r2.value = r0
            return
    }

    public float decrementAndGet() {
            r2 = this;
            float r0 = r2.value
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 - r1
            r2.value = r0
            return r0
    }

    @Override // java.lang.Number
    public double doubleValue() {
            r2 = this;
            float r0 = r2.value
            double r0 = (double) r0
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.apache.commons.lang3.mutable.MutableFloat
            if (r0 == 0) goto L16
            org.apache.commons.lang3.mutable.MutableFloat r2 = (org.apache.commons.lang3.mutable.MutableFloat) r2
            float r2 = r2.value
            int r2 = java.lang.Float.floatToIntBits(r2)
            float r0 = r1.value
            int r0 = java.lang.Float.floatToIntBits(r0)
            if (r2 != r0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
    }

    @Override // java.lang.Number
    public float floatValue() {
            r1 = this;
            float r0 = r1.value
            return r0
    }

    public float getAndAdd(float r2) {
            r1 = this;
            float r0 = r1.value
            float r2 = r2 + r0
            r1.value = r2
            return r0
    }

    public float getAndAdd(java.lang.Number r2) {
            r1 = this;
            float r0 = r1.value
            float r2 = r2.floatValue()
            float r2 = r2 + r0
            r1.value = r2
            return r0
    }

    public float getAndDecrement() {
            r2 = this;
            float r0 = r2.value
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r0 - r1
            r2.value = r1
            return r0
    }

    public float getAndIncrement() {
            r2 = this;
            float r0 = r2.value
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 + r0
            r2.value = r1
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    public java.lang.Number getValue() {
            r1 = this;
            float r0 = r1.value
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    @Override // org.apache.commons.lang3.mutable.Mutable
    /* JADX INFO: renamed from: getValue, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ java.lang.Number getValue2() {
            r1 = this;
            java.lang.Float r0 = r1.getValue()
            return r0
    }

    public int hashCode() {
            r1 = this;
            float r0 = r1.value
            int r0 = java.lang.Float.floatToIntBits(r0)
            return r0
    }

    public void increment() {
            r2 = this;
            float r0 = r2.value
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            r2.value = r0
            return
    }

    public float incrementAndGet() {
            r2 = this;
            float r0 = r2.value
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 + r1
            r2.value = r0
            return r0
    }

    @Override // java.lang.Number
    public int intValue() {
            r1 = this;
            float r0 = r1.value
            int r0 = (int) r0
            return r0
    }

    public boolean isInfinite() {
            r1 = this;
            float r0 = r1.value
            boolean r0 = java.lang.Float.isInfinite(r0)
            return r0
    }

    public boolean isNaN() {
            r1 = this;
            float r0 = r1.value
            boolean r0 = java.lang.Float.isNaN(r0)
            return r0
    }

    @Override // java.lang.Number
    public long longValue() {
            r2 = this;
            float r0 = r2.value
            long r0 = (long) r0
            return r0
    }

    public void setValue(float r1) {
            r0 = this;
            r0.value = r1
            return
    }

    /* JADX INFO: renamed from: setValue, reason: avoid collision after fix types in other method */
    public void setValue2(java.lang.Number r1) {
            r0 = this;
            float r1 = r1.floatValue()
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

    public void subtract(float r2) {
            r1 = this;
            float r0 = r1.value
            float r0 = r0 - r2
            r1.value = r0
            return
    }

    public void subtract(java.lang.Number r2) {
            r1 = this;
            float r0 = r1.value
            float r2 = r2.floatValue()
            float r0 = r0 - r2
            r1.value = r0
            return
    }

    public java.lang.Float toFloat() {
            r1 = this;
            float r0 = r1.floatValue()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            float r0 = r1.value
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
