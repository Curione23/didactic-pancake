package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CPInteger extends org.apache.commons.compress.harmony.unpack200.bytecode.CPConstantNumber {
    public CPInteger(java.lang.Integer r2, int r3) {
            r1 = this;
            r0 = 3
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Integer: "
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
            int r0 = r0.intValue()
            r2.writeInt(r0)
            return
    }
}
