package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ClassSpecificReferenceForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm {
    public ClassSpecificReferenceForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    protected abstract java.lang.String context(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1);

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected abstract int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1);

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected abstract int getPoolID();

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected void setNestedEntries(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r6, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r7, int r8) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r0 = r7.globalConstantPool()
            r1 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r1]
            int r2 = r5.getPoolID()
            long r3 = (long) r8
            java.lang.String r7 = r5.context(r7)
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r7 = r0.getClassSpecificPoolEntry(r2, r3, r7)
            r8 = 0
            r1[r8] = r7
            r6.setNested(r1)
            r7 = 2
            int[] r7 = new int[]{r8, r7}
            int[][] r7 = new int[][]{r7}
            r6.setNestedPositions(r7)
            return
    }
}
