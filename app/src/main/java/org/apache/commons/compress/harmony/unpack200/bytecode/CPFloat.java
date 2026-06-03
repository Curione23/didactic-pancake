package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPFloat extends org.apache.commons.compress.harmony.unpack200.bytecode.CPConstantNumber {
    public CPFloat(java.lang.Float r2, int r3) {
            r1 = this;
            r0 = 4
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Float: "
            r0.<init>(r1)
            java.lang.Object r1 = r2.getValue()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
    protected void writeBody(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            java.lang.Number r0 = r1.getNumber()
            float r0 = r0.floatValue()
            r2.writeFloat(r0)
            return
    }
}
