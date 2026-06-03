package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPFieldRef extends org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry {
    private int cachedHashCode;
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass className;
    transient int classNameIndex;
    private boolean hashCodeComputed;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType;
    transient int nameAndTypeIndex;

    public CPFieldRef(org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r3, int r4) {
            r1 = this;
            r0 = 9
            r1.<init>(r0, r4)
            r1.className = r2
            r1.nameAndType = r3
            return
    }

    private void generateHashCode() {
            r3 = this;
            r0 = 1
            r3.hashCodeComputed = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r3.className
            r1 = 0
            if (r0 != 0) goto La
            r0 = r1
            goto Le
        La:
            int r0 = r0.hashCode()
        Le:
            r2 = 31
            int r0 = r0 + r2
            int r0 = r0 * r2
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r3.nameAndType
            if (r2 != 0) goto L17
            goto L1b
        L17:
            int r1 = r2.hashCode()
        L1b:
            int r0 = r0 + r1
            r3.cachedHashCode = r0
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
            org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPFieldRef) r5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r4.className
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3 = r5.className
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L2a
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r4.nameAndType
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r5 = r5.nameAndType
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
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r3.className
            r0[r1] = r2
            r1 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r3.nameAndType
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

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2) {
            r1 = this;
            super.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r0 = r1.nameAndType
            int r0 = r2.indexOf(r0)
            r1.nameAndTypeIndex = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r1.className
            int r2 = r2.indexOf(r0)
            r1.classNameIndex = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FieldRef: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r2.className
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = r2.nameAndType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.classNameIndex
            r2.writeShort(r0)
            int r0 = r1.nameAndTypeIndex
            r2.writeShort(r0)
            return
    }
}
