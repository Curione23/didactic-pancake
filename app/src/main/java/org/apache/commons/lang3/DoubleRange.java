package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public final class DoubleRange extends org.apache.commons.lang3.NumberRange<java.lang.Double> {
    private static final long serialVersionUID = 1;

    private DoubleRange(java.lang.Double r2, java.lang.Double r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public static org.apache.commons.lang3.DoubleRange of(double r0, double r2) {
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            java.lang.Double r1 = java.lang.Double.valueOf(r2)
            org.apache.commons.lang3.DoubleRange r0 = of(r0, r1)
            return r0
    }

    public static org.apache.commons.lang3.DoubleRange of(java.lang.Double r1, java.lang.Double r2) {
            org.apache.commons.lang3.DoubleRange r0 = new org.apache.commons.lang3.DoubleRange
            r0.<init>(r1, r2)
            return r0
    }
}
