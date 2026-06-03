package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class IincForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm {
    public IincForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r2, int r3) {
            r0 = this;
            int r3 = r2.nextLocal()
            int r2 = r2.nextByte()
            int[] r2 = new int[]{r3, r2}
            r1.setOperandBytes(r2)
            return
    }
}
