package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CPString extends org.apache.commons.compress.harmony.pack200.CPConstant<org.apache.commons.compress.harmony.pack200.CPString> {
    private final java.lang.String string;
    private final org.apache.commons.compress.harmony.pack200.CPUTF8 utf8;

    public CPString(org.apache.commons.compress.harmony.pack200.CPUTF8 r1) {
            r0 = this;
            r0.<init>()
            r0.utf8 = r1
            java.lang.String r1 = r1.getUnderlyingString()
            r0.string = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.CPString r1 = (org.apache.commons.compress.harmony.pack200.CPString) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public int compareTo(org.apache.commons.compress.harmony.pack200.CPString r2) {
            r1 = this;
            java.lang.String r0 = r1.string
            java.lang.String r2 = r2.string
            int r2 = r0.compareTo(r2)
            return r2
    }

    public int getIndexInCpUtf8() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r1.utf8
            int r0 = r0.getIndex()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.string
            return r0
    }
}
