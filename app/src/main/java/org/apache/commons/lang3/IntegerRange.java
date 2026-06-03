package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public final class IntegerRange extends org.apache.commons.lang3.NumberRange<java.lang.Integer> {
    private static final long serialVersionUID = 1;

    private IntegerRange(java.lang.Integer r2, java.lang.Integer r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public static org.apache.commons.lang3.IntegerRange of(int r0, int r1) {
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            org.apache.commons.lang3.IntegerRange r0 = of(r0, r1)
            return r0
    }

    public static org.apache.commons.lang3.IntegerRange of(java.lang.Integer r1, java.lang.Integer r2) {
            org.apache.commons.lang3.IntegerRange r0 = new org.apache.commons.lang3.IntegerRange
            r0.<init>(r1, r2)
            return r0
    }
}
