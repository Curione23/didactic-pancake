package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class CPRef extends org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry {
    protected java.lang.String cachedToString;
    org.apache.commons.compress.harmony.unpack200.bytecode.CPClass className;
    transient int classNameIndex;
    protected org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType nameAndType;
    transient int nameAndTypeIndex;

    public CPRef(byte r1, org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r3, int r4) {
            r0 = this;
            r0.<init>(r1, r4)
            java.lang.String r1 = "className"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r2, r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r1
            r0.className = r1
            java.lang.String r1 = "descriptor"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r3, r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType) r1
            r0.nameAndType = r1
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
            int r2 = r4.hashCode()
            int r3 = r5.hashCode()
            if (r2 == r3) goto L1e
            return r1
        L1e:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPRef r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPRef) r5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r4.className
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3 = r5.className
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L35
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r2 = r4.nameAndType
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r5 = r5.nameAndType
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L35
            goto L36
        L35:
            r0 = r1
        L36:
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
            java.lang.String r0 = r2.cachedToString
            if (r0 != 0) goto L4e
            byte r0 = r2.getTag()
            r1 = 9
            if (r0 != r1) goto Lf
            java.lang.String r0 = "FieldRef"
            goto L27
        Lf:
            byte r0 = r2.getTag()
            r1 = 10
            if (r0 != r1) goto L1a
            java.lang.String r0 = "MethoddRef"
            goto L27
        L1a:
            byte r0 = r2.getTag()
            r1 = 11
            if (r0 != r1) goto L25
            java.lang.String r0 = "InterfaceMethodRef"
            goto L27
        L25:
            java.lang.String r0 = "unknown"
        L27:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r1 = r2.className
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "#"
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r1 = r2.nameAndType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.cachedToString = r0
        L4e:
            java.lang.String r0 = r2.cachedToString
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
