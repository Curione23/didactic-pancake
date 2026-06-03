package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CPClass extends org.apache.commons.compress.harmony.pack200.CPConstant<org.apache.commons.compress.harmony.pack200.CPClass> {
    private final java.lang.String className;
    private final boolean isInnerClass;
    private final org.apache.commons.compress.harmony.pack200.CPUTF8 utf8;

    public CPClass(org.apache.commons.compress.harmony.pack200.CPUTF8 r6) {
            r5 = this;
            r5.<init>()
            r5.utf8 = r6
            java.lang.String r6 = r6.getUnderlyingString()
            r5.className = r6
            char[] r6 = r6.toCharArray()
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L21
            char r3 = r6[r2]
            r4 = 45
            if (r3 > r4) goto L1e
            r6 = 1
            r5.isInnerClass = r6
            return
        L1e:
            int r2 = r2 + 1
            goto L12
        L21:
            r5.isInnerClass = r1
            return
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
            r0 = this;
            org.apache.commons.compress.harmony.pack200.CPClass r1 = (org.apache.commons.compress.harmony.pack200.CPClass) r1
            int r1 = r0.compareTo(r1)
            return r1
    }

    public int compareTo(org.apache.commons.compress.harmony.pack200.CPClass r2) {
            r1 = this;
            java.lang.String r0 = r1.className
            java.lang.String r2 = r2.className
            int r2 = r0.compareTo(r2)
            return r2
    }

    public int getIndexInCpUtf8() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r1.utf8
            int r0 = r0.getIndex()
            return r0
    }

    public boolean isInnerClass() {
            r1 = this;
            boolean r0 = r1.isInnerClass
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.className
            return r0
    }
}
