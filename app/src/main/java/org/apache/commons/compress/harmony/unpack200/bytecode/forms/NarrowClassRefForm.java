package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class NarrowClassRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm {
    public NarrowClassRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public NarrowClassRefForm(int r1, java.lang.String r2, int[] r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public boolean nestedMustStartClassPool() {
            r1 = this;
            boolean r0 = r1.widened
            r0 = r0 ^ 1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected void setNestedEntries(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r2, int r3) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r0 = this;
            super.setNestedEntries(r1, r2, r3)
            boolean r2 = r0.widened
            if (r2 != 0) goto L14
            r2 = 0
            r3 = 1
            int[] r2 = new int[]{r2, r3}
            int[][] r2 = new int[][]{r2}
            r1.setNestedPositions(r2)
        L14:
            return
    }
}
