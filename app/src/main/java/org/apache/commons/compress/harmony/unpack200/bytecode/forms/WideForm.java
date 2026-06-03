package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class WideForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.VariableInstructionForm {
    public WideForm(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r3, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r4, int r5) {
            r2 = this;
            int r0 = r4.nextWideByteCode()
            r1 = 132(0x84, float:1.85E-43)
            if (r0 != r1) goto Lc
            r2.setByteCodeOperandsFormat2(r0, r3, r4, r5)
            goto Lf
        Lc:
            r2.setByteCodeOperandsFormat1(r0, r3, r4, r5)
        Lf:
            return
    }

    protected void setByteCodeOperandsFormat1(int r3, org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r4, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r5, int r6) {
            r2 = this;
            int r5 = r5.nextLocal()
            r6 = 4
            int[] r6 = new int[r6]
            int r0 = r4.getOpcode()
            r1 = 0
            r6[r1] = r0
            r0 = 1
            r6[r0] = r3
            r3 = 2
            r2.setRewrite2Bytes(r5, r3, r6)
            r4.setRewrite(r6)
            return
    }

    protected void setByteCodeOperandsFormat2(int r4, org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r5, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r6, int r7) {
            r3 = this;
            int r7 = r6.nextLocal()
            int r6 = r6.nextShort()
            r0 = 6
            int[] r0 = new int[r0]
            int r1 = r5.getOpcode()
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r4
            r4 = 2
            r3.setRewrite2Bytes(r7, r4, r0)
            r4 = 4
            r3.setRewrite2Bytes(r6, r4, r0)
            r5.setRewrite(r0)
            return
    }
}
