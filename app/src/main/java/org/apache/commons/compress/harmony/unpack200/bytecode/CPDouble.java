package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPDouble extends org.apache.commons.compress.harmony.unpack200.bytecode.CPConstantNumber {
    public CPDouble(java.lang.Double r2, int r3) {
            r1 = this;
            r0 = 6
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Double: "
            r0.<init>(r1)
            java.lang.Object r1 = r2.getValue()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry
    protected void writeBody(java.io.DataOutputStream r3) throws java.io.IOException {
            r2 = this;
            java.lang.Number r0 = r2.getNumber()
            double r0 = r0.doubleValue()
            r3.writeDouble(r0)
            return
    }
}
