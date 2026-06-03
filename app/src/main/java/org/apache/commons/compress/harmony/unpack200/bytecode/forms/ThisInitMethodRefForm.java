package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class ThisInitMethodRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm {
    public ThisInitMethodRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm
    protected java.lang.String context(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            java.lang.String r1 = r1.getCurrentClass()
            return r1
    }
}
