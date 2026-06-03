package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class ByteForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm {
    public ByteForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r2, int r3) {
            r0 = this;
            int r2 = r2.nextByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 0
            r1.setOperandByte(r2, r3)
            return
    }
}
