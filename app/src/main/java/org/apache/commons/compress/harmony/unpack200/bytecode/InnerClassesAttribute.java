package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class InnerClassesAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private final java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.InnerClassesEntry> innerClasses;
    private final java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry> nestedClassFileEntries;

    private static final class InnerClassesEntry {
        int innerClassAccessFlags;
        org.apache.commons.compress.harmony.unpack200.bytecode.CPClass innerClassInfo;
        int innerClassInfoIndex;
        org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 innerClassName;
        int innerNameIndex;
        org.apache.commons.compress.harmony.unpack200.bytecode.CPClass outerClassInfo;
        int outerClassInfoIndex;

        InnerClassesEntry(org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4, int r5) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.innerClassInfoIndex = r0
                r1.outerClassInfoIndex = r0
                r1.innerNameIndex = r0
                r1.innerClassInfo = r2
                r1.outerClassInfo = r3
                r1.innerClassName = r4
                r1.innerClassAccessFlags = r5
                return
        }

        public void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r3) {
                r2 = this;
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r2.innerClassInfo
                r1 = 0
                if (r0 == 0) goto L11
                r0.resolve(r3)
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r2.innerClassInfo
                int r0 = r3.indexOf(r0)
                r2.innerClassInfoIndex = r0
                goto L13
            L11:
                r2.innerClassInfoIndex = r1
            L13:
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r2.innerClassName
                if (r0 == 0) goto L23
                r0.resolve(r3)
                org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r2.innerClassName
                int r0 = r3.indexOf(r0)
                r2.innerNameIndex = r0
                goto L25
            L23:
                r2.innerNameIndex = r1
            L25:
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r2.outerClassInfo
                if (r0 == 0) goto L35
                r0.resolve(r3)
                org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r2.outerClassInfo
                int r3 = r3.indexOf(r0)
                r2.outerClassInfoIndex = r3
                goto L37
            L35:
                r2.outerClassInfoIndex = r1
            L37:
                return
        }

        public void write(java.io.DataOutputStream r2) throws java.io.IOException {
                r1 = this;
                int r0 = r1.innerClassInfoIndex
                r2.writeShort(r0)
                int r0 = r1.outerClassInfoIndex
                r2.writeShort(r0)
                int r0 = r1.innerNameIndex
                r2.writeShort(r0)
                int r0 = r1.innerClassAccessFlags
                r2.writeShort(r0)
                return
        }
    }

    public InnerClassesAttribute(java.lang.String r2) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.attributeName
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.innerClasses = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.nestedClassFileEntries = r2
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.getAttributeName()
            r2.add(r0)
            return
    }

    private void addInnerClassesEntry(org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.InnerClassesEntry r2) {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry> r0 = r1.innerClasses
            r0.add(r2)
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.attributeName = r0
            return
    }

    public void addInnerClassesEntry(org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r3, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r4, int r5) {
            r1 = this;
            if (r2 == 0) goto L7
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry> r0 = r1.nestedClassFileEntries
            r0.add(r2)
        L7:
            if (r3 == 0) goto Le
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry> r0 = r1.nestedClassFileEntries
            r0.add(r3)
        Le:
            if (r4 == 0) goto L15
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry> r0 = r1.nestedClassFileEntries
            r0.add(r4)
        L15:
            org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry
            r0.<init>(r2, r3, r4, r5)
            r1.addInnerClassesEntry(r0)
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
            org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute) r5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r4.getAttributeName()
            if (r1 != 0) goto L26
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r5 = r5.getAttributeName()
            if (r5 == 0) goto L35
            return r2
        L26:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r4.getAttributeName()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r5 = r5.getAttributeName()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L35
            return r2
        L35:
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry> r0 = r1.innerClasses
            int r0 = r0.size()
            int r0 = r0 * 8
            int r0 = r0 + 2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry> r0 = r2.nestedClassFileEntries
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.NONE
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[]) r0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.getAttributeName()
            if (r1 != 0) goto Le
            r1 = 0
            goto L16
        Le:
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.getAttributeName()
            int r1 = r1.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r3) {
            r2 = this;
            super.resolve(r3)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry> r0 = r2.innerClasses
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.InnerClassesEntry) r1
            r1.resolve(r3)
            goto L9
        L19:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InnerClasses: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.getAttributeName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r3) throws java.io.IOException {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry> r0 = r2.innerClasses
            int r0 = r0.size()
            r3.writeShort(r0)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry> r0 = r2.innerClasses
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute$InnerClassesEntry r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.InnerClassesAttribute.InnerClassesEntry) r1
            r1.write(r3)
            goto Lf
        L1f:
            return
    }
}
