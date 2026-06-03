package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class ExceptionsAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private transient int[] exceptionIndexes;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] exceptions;

    public ExceptionsAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r2) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute.attributeName
            r1.<init>(r0)
            r1.exceptions = r2
            return
    }

    private static int hashCode(java.lang.Object[] r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length
            r2 = 1
            r3 = r0
        L7:
            if (r3 >= r1) goto L19
            r4 = r5[r3]
            int r2 = r2 * 31
            if (r4 != 0) goto L11
            r4 = r0
            goto L15
        L11:
            int r4 = r4.hashCode()
        L15:
            int r2 = r2 + r4
            int r3 = r3 + 1
            goto L7
        L19:
            return r2
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute.attributeName = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = super.equals(r5)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r1 == r3) goto L17
            return r2
        L17:
            org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionsAttribute) r5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r1 = r4.exceptions
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r5 = r5.exceptions
            boolean r5 = java.util.Arrays.equals(r1, r5)
            if (r5 != 0) goto L24
            return r2
        L24:
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r0 = r1.exceptions
            int r0 = r0.length
            int r0 = r0 * 2
            int r0 = r0 + 2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r0 = r4.exceptions
            int r1 = r0.length
            int r1 = r1 + 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r1]
            r2 = 0
            int r3 = r0.length
            java.lang.System.arraycopy(r0, r2, r1, r2, r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r0 = r4.exceptions
            int r0 = r0.length
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r4.getAttributeName()
            r1[r0] = r2
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r1 = r2.exceptions
            int r1 = hashCode(r1)
            int r0 = r0 + r1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r4) {
            r3 = this;
            super.resolve(r4)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r0 = r3.exceptions
            int r0 = r0.length
            int[] r0 = new int[r0]
            r3.exceptionIndexes = r0
            r0 = 0
        Lb:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r1 = r3.exceptions
            int r2 = r1.length
            if (r0 >= r2) goto L24
            r1 = r1[r0]
            r1.resolve(r4)
            int[] r1 = r3.exceptionIndexes
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r2 = r3.exceptions
            r2 = r2[r0]
            int r2 = r4.indexOf(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lb
        L24:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Exceptions: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass[] r1 = r5.exceptions
            int r2 = r1.length
            r3 = 0
        Lb:
            if (r3 >= r2) goto L1a
            r4 = r1[r3]
            r0.append(r4)
            r4 = 32
            r0.append(r4)
            int r3 = r3 + 1
            goto Lb
        L1a:
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r5) throws java.io.IOException {
            r4 = this;
            int[] r0 = r4.exceptionIndexes
            int r0 = r0.length
            r5.writeShort(r0)
            int[] r0 = r4.exceptionIndexes
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L14
            r3 = r0[r2]
            r5.writeShort(r3)
            int r2 = r2 + 1
            goto La
        L14:
            return
    }
}
