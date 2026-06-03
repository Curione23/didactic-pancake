package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class SourceFileAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 name;
    private int nameIndex;

    public SourceFileAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute.attributeName
            r1.<init>(r0)
            r1.name = r2
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute.attributeName = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            boolean r0 = super.equals(r4)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Class r0 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r0 == r2) goto L17
            return r1
        L17:
            org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.SourceFileAttribute) r4
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r3.name
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4 = r4.name
            boolean r4 = java.util.Objects.equals(r0, r4)
            return r4
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            r0 = 2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r3 = this;
            r0 = 2
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            r1 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.getAttributeName()
            r0[r1] = r2
            r1 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.name
            r0[r1] = r2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.name
            if (r1 != 0) goto Lc
            r1 = 0
            goto L10
        Lc:
            int r1 = r1.hashCode()
        L10:
            int r0 = r0 + r1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    public boolean isSourceFileAttribute() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2) {
            r1 = this;
            super.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.name
            int r2 = r2.indexOf(r0)
            r1.nameIndex = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SourceFile: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.name
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.nameIndex
            r2.writeShort(r0)
            return
    }
}
