package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class SignatureAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 signature;
    private int signatureIndex;

    public SignatureAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute.attributeName
            r1.<init>(r0)
            r1.signature = r2
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.SignatureAttribute.attributeName = r0
            return
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
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.signature
            r0[r1] = r2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r2) {
            r1 = this;
            super.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.signature
            r0.resolve(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = r1.signature
            int r2 = r2.indexOf(r0)
            r1.signatureIndex = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Signature: "
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r2.signature
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.signatureIndex
            r2.writeShort(r0)
            return
    }
}
