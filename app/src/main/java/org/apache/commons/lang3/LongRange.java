package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public final class LongRange extends org.apache.commons.lang3.NumberRange<java.lang.Long> {
    private static final long serialVersionUID = 1;

    private LongRange(java.lang.Long r2, java.lang.Long r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public static org.apache.commons.lang3.LongRange of(long r0, long r2) {
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            org.apache.commons.lang3.LongRange r0 = of(r0, r1)
            return r0
    }

    public static org.apache.commons.lang3.LongRange of(java.lang.Long r1, java.lang.Long r2) {
            org.apache.commons.lang3.LongRange r0 = new org.apache.commons.lang3.LongRange
            r0.<init>(r1, r2)
            return r0
    }
}
