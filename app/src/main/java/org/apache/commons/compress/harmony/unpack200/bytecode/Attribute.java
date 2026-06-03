package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Attribute extends org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry {
    protected final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private int attributeNameIndex;

    public Attribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1) {
            r0 = this;
            r0.<init>()
            r0.attributeName = r1
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void doWrite(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.attributeNameIndex
            r2.writeShort(r0)
            int r0 = r1.getLength()
            r2.writeInt(r0)
            r1.writeBody(r2)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r4 = 1
            return r4
        L4:
            r0 = 0
            if (r4 != 0) goto L8
            return r0
        L8:
            java.lang.Class r1 = r3.getClass()
            java.lang.Class r2 = r4.getClass()
            if (r1 == r2) goto L13
            return r0
        L13:
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r4
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r3.attributeName
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4 = r4.attributeName
            boolean r4 = java.util.Objects.equals(r0, r4)
            return r4
    }

    protected org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 getAttributeName() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.attributeName
            return r0
    }

    protected abstract int getLength();

    protected int getLengthIncludingHeader() {
            r1 = this;
            int r0 = r1.getLength()
            int r0 = r0 + 6
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r3 = this;
            r0 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            r1 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.getAttributeName()
            r0[r1] = r2
            return r0
    }

    public boolean hasBCIRenumbering() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.attributeName
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public boolean isSourceFileAttribute() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2) {
            r1 = this;
            super.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.attributeName
            int r2 = r2.indexOf(r0)
            r1.attributeNameIndex = r2
            return
    }

    protected abstract void writeBody(java.io.DataOutputStream r1) throws java.io.IOException;
}
