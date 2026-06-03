package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CPUTF8 extends org.apache.commons.compress.harmony.pack200.ConstantPoolEntry implements java.lang.Comparable {
    private final java.lang.String string;

    public CPUTF8(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.string = r1
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = r1.string
            org.apache.commons.compress.harmony.pack200.CPUTF8 r2 = (org.apache.commons.compress.harmony.pack200.CPUTF8) r2
            java.lang.String r2 = r2.string
            int r2 = r0.compareTo(r2)
            return r2
    }

    public java.lang.String getUnderlyingString() {
            r1 = this;
            java.lang.String r0 = r1.string
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.string
            return r0
    }
}
