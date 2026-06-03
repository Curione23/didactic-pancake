package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class ClassRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm {
    protected boolean widened;

    public ClassRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public ClassRefForm(int r1, java.lang.String r2, int[] r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.widened = r4
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            int r1 = r1.nextClassRef()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getPoolID() {
            r1 = this;
            r0 = 7
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected void setNestedEntries(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r2, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r3, int r4) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r1 = this;
            r0 = 1
            if (r4 == 0) goto L8
            int r4 = r4 - r0
            super.setNestedEntries(r2, r3, r4)
            return
        L8:
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r4 = r3.globalConstantPool()
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            java.lang.String r3 = r3.getCurrentClass()
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r3 = r4.getClassPoolEntry(r3)
            r4 = 0
            r0[r4] = r3
            r2.setNested(r0)
            r3 = 2
            int[] r3 = new int[]{r4, r3}
            int[][] r3 = new int[][]{r3}
            r2.setNestedPositions(r3)
            return
    }
}
