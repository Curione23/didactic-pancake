package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class FloatRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm {
    public FloatRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public FloatRefForm(int r1, java.lang.String r2, int[] r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.widened = r4
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            int r1 = r1.nextFloatRef()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getPoolID() {
            r1 = this;
            r0 = 3
            return r0
    }
}
