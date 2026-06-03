package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPMember extends org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry {
    java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> attributes;
    protected final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 descriptor;
    transient int descriptorIndex;
    short flags;
    org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 name;
    transient int nameIndex;

    public CPMember(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3, long r4, java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r6) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "name"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r2
            r1.name = r2
            java.lang.String r2 = "descriptor"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8) r2
            r1.descriptor = r2
            int r2 = (int) r4
            short r2 = (short) r2
            r1.flags = r2
            if (r6 != 0) goto L1f
            java.util.List r6 = java.util.Collections.EMPTY_LIST
        L1f:
            r1.attributes = r6
            return
    }

    static /* synthetic */ void lambda$resolve$0(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r0, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r1) {
            r1.resolve(r0)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void doWrite(java.io.DataOutputStream r4) throws java.io.IOException {
            r3 = this;
            short r0 = r3.flags
            r4.writeShort(r0)
            int r0 = r3.nameIndex
            r4.writeShort(r0)
            int r0 = r3.descriptorIndex
            r4.writeShort(r0)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r3.attributes
            int r0 = r0.size()
            r4.writeShort(r0)
            r1 = 0
        L19:
            if (r1 >= r0) goto L29
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r2 = r3.attributes
            java.lang.Object r2 = r2.get(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r2
            r2.doWrite(r4)
            int r1 = r1 + 1
            goto L19
        L29:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
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
            org.apache.commons.compress.harmony.unpack200.bytecode.CPMember r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPMember) r5
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r2 = r4.attributes
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r3 = r5.attributes
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L3a
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r4.descriptor
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3 = r5.descriptor
            boolean r2 = java.util.Objects.equals(r2, r3)
            if (r2 == 0) goto L3a
            short r2 = r4.flags
            short r3 = r5.flags
            if (r2 != r3) goto L3a
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r4.name
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r5 = r5.name
            boolean r5 = java.util.Objects.equals(r2, r5)
            if (r5 == 0) goto L3a
            goto L3b
        L3a:
            r0 = r1
        L3b:
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r5 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r5.attributes
            int r0 = r0.size()
            int r1 = r0 + 2
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r1]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r5.name
            r3 = 0
            r1[r3] = r2
            r2 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4 = r5.descriptor
            r1[r2] = r4
        L14:
            if (r3 >= r0) goto L25
            int r2 = r3 + 2
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r4 = r5.attributes
            java.lang.Object r4 = r4.get(r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry) r4
            r1[r2] = r4
            int r3 = r3 + 1
            goto L14
        L25:
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r3 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r3.attributes
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 + r1
            int r0 = r0 * r1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.descriptor
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            short r2 = r3.flags
            int r0 = r0 + r2
            int r0 = r0 * r1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r3.name
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r3) {
            r2 = this;
            super.resolve(r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r2.name
            int r0 = r3.indexOf(r0)
            r2.nameIndex = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r2.descriptor
            int r0 = r3.indexOf(r0)
            r2.descriptorIndex = r0
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r2.attributes
            org.apache.commons.compress.harmony.unpack200.bytecode.CPMember$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CPMember$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.forEach(r1)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CPMember: "
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
}
