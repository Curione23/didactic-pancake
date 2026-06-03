package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class CPSignature extends org.apache.commons.compress.harmony.pack200.ConstantPoolEntry implements java.lang.Comparable {
    private final java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> classes;
    private final boolean formStartsWithBracket;
    private final java.lang.String signature;
    private final org.apache.commons.compress.harmony.pack200.CPUTF8 signatureForm;

    public CPSignature(java.lang.String r1, org.apache.commons.compress.harmony.pack200.CPUTF8 r2, java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r3) {
            r0 = this;
            r0.<init>()
            r0.signature = r1
            r0.signatureForm = r2
            r0.classes = r3
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "("
            boolean r1 = r1.startsWith(r2)
            r0.formStartsWithBracket = r1
            return
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object r4) {
            r3 = this;
            java.lang.String r0 = r3.signature
            org.apache.commons.compress.harmony.pack200.CPSignature r4 = (org.apache.commons.compress.harmony.pack200.CPSignature) r4
            java.lang.String r1 = r4.signature
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            r4 = 0
            return r4
        Le:
            boolean r0 = r3.formStartsWithBracket
            r1 = 1
            if (r0 == 0) goto L18
            boolean r2 = r4.formStartsWithBracket
            if (r2 != 0) goto L18
            return r1
        L18:
            boolean r2 = r4.formStartsWithBracket
            if (r2 == 0) goto L20
            if (r0 != 0) goto L20
            r4 = -1
            return r4
        L20:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r3.classes
            int r0 = r0.size()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r2 = r4.classes
            int r2 = r2.size()
            int r0 = r0 - r2
            if (r0 == 0) goto L3d
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r3.classes
            int r0 = r0.size()
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r4 = r4.classes
            int r4 = r4.size()
            int r0 = r0 - r4
            return r0
        L3d:
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r3.classes
            int r0 = r0.size()
            if (r0 <= 0) goto L68
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r3.classes
            int r0 = r0.size()
            int r0 = r0 - r1
        L4c:
            if (r0 < 0) goto L68
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r1 = r3.classes
            java.lang.Object r1 = r1.get(r0)
            org.apache.commons.compress.harmony.pack200.CPClass r1 = (org.apache.commons.compress.harmony.pack200.CPClass) r1
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r2 = r4.classes
            java.lang.Object r2 = r2.get(r0)
            org.apache.commons.compress.harmony.pack200.CPClass r2 = (org.apache.commons.compress.harmony.pack200.CPClass) r2
            int r1 = r1.compareTo(r2)
            if (r1 == 0) goto L65
            return r1
        L65:
            int r0 = r0 + (-1)
            goto L4c
        L68:
            java.lang.String r0 = r3.signature
            java.lang.String r4 = r4.signature
            int r4 = r0.compareTo(r4)
            return r4
    }

    public java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> getClasses() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.pack200.CPClass> r0 = r1.classes
            return r0
    }

    public int getIndexInCpUtf8() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r1.signatureForm
            int r0 = r0.getIndex()
            return r0
    }

    public org.apache.commons.compress.harmony.pack200.CPUTF8 getSignatureForm() {
            r1 = this;
            org.apache.commons.compress.harmony.pack200.CPUTF8 r0 = r1.signatureForm
            return r0
    }

    public java.lang.String getUnderlyingString() {
            r1 = this;
            java.lang.String r0 = r1.signature
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.signature
            return r0
    }
}
