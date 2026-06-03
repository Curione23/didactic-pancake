package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPNameAndType extends org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry {
    private int cachedHashCode;
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptor;
    transient int descriptorIndex;
    private boolean hashCodeComputed;
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 name;
    transient int nameIndex;

    public CPNameAndType(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3, int r4) {
            r1 = this;
            r0 = 12
            r1.<init>(r0, r4)
            java.lang.String r4 = "name"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r4)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r2
            r1.name = r2
            java.lang.String r2 = "descriptor"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r2
            r1.descriptor = r2
            return
    }

    private void generateHashCode() {
            r2 = this;
            r0 = 1
            r2.hashCodeComputed = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r2.descriptor
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * r1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.name
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.cachedHashCode = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r4.descriptor
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3 = r5.descriptor
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L2a
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r4.name
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r5 = r5.name
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L2a
            goto L2b
        L2a:
            r0 = r1
        L2b:
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r3 = this;
            r0 = 2
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            r1 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.name
            r0[r1] = r2
            r1 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.descriptor
            r0[r1] = r2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r1 = this;
            boolean r0 = r1.hashCodeComputed
            if (r0 != 0) goto L7
            r1.generateHashCode()
        L7:
            int r0 = r1.cachedHashCode
            return r0
    }

    public int invokeInterfaceCount() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.descriptor
            java.lang.String r0 = r0.underlyingString()
            int r0 = org.apache.commons.compress.harmony.unpack200.SegmentUtils.countInvokeInterfaceArgs(r0)
            int r0 = r0 + 1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2) {
            r1 = this;
            super.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.descriptor
            int r0 = r2.indexOf(r0)
            r1.descriptorIndex = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.name
            int r2 = r2.indexOf(r0)
            r1.nameIndex = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "NameAndType: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.descriptor
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.nameIndex
            r2.writeShort(r0)
            int r0 = r1.descriptorIndex
            r2.writeShort(r0)
            return
    }
}
