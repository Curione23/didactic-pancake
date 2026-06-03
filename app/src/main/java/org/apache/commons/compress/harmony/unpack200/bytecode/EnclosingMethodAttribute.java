package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class EnclosingMethodAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private int classIndex;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPClass cpClass;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType method;
    private int methodIndex;

    public EnclosingMethodAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2, org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r3) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute.attributeName
            r1.<init>(r0)
            r1.cpClass = r2
            r1.method = r3
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute.attributeName = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            r0 = 4
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r6 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r0 = r6.method
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L15
            r4 = 3
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r4]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r5 = org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute.attributeName
            r4[r2] = r5
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r6.cpClass
            r4[r1] = r2
            r4[r3] = r0
            return r4
        L15:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r3]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r3 = org.apache.commons.compress.harmony.unpack200.bytecode.EnclosingMethodAttribute.attributeName
            r0[r2] = r3
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r6.cpClass
            r0[r1] = r2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2) {
            r1 = this;
            super.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r1.cpClass
            r0.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r0 = r1.cpClass
            int r0 = r2.indexOf(r0)
            r1.classIndex = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r0 = r1.method
            if (r0 == 0) goto L20
            r0.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPNameAndType r0 = r1.method
            int r2 = r2.indexOf(r0)
            r1.methodIndex = r2
            goto L23
        L20:
            r2 = 0
            r1.methodIndex = r2
        L23:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "EnclosingMethod"
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.classIndex
            r2.writeShort(r0)
            int r0 = r1.methodIndex
            r2.writeShort(r0)
            return
    }
}
