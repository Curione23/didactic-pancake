package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class IMethodRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm {
    public IMethodRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            int r1 = r1.nextIMethodRef()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getPoolID() {
            r1 = this;
            r0 = 12
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r2, int r3) {
            r0 = this;
            super.setByteCodeOperands(r1, r2, r3)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r2 = r1.getNestedClassFileEntries()
            r3 = 0
            r2 = r2[r3]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPInterfaceMethodRef) r2
            int r2 = r2.invokeInterfaceCount()
            int[] r1 = r1.getRewrite()
            r3 = 3
            r1[r3] = r2
            return
    }
}
