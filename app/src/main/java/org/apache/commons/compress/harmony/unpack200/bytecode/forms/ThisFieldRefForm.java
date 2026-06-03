package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class ThisFieldRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm {
    public ThisFieldRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm
    protected java.lang.String context(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            java.lang.String r1 = r1.getCurrentClass()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            int r1 = r1.nextThisFieldRef()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getPoolID() {
            r1 = this;
            r0 = 10
            return r0
    }
}
