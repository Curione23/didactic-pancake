package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class DeprecatedAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.Attribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;

    public DeprecatedAttribute() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute.attributeName
            r1.<init>(r0)
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.DeprecatedAttribute.attributeName = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Deprecated Attribute"
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r1) throws java.io.IOException {
            r0 = this;
            return
    }
}
