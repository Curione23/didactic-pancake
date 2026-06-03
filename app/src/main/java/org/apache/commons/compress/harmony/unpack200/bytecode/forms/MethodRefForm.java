package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class MethodRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm {
    public MethodRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            int r1 = r1.nextMethodRef()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getPoolID() {
            r1 = this;
            r0 = 11
            return r0
    }
}
