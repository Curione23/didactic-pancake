package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class NewInitMethodRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm {
    public NewInitMethodRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm
    protected java.lang.String context(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            java.lang.String r1 = r1.getNewClass()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.InitMethodReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassSpecificReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected void setNestedEntries(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r5, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r6, int r7) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r0 = r6.globalConstantPool()
            r1 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r1]
            long r2 = (long) r7
            java.lang.String r6 = r4.context(r6)
            r7 = 11
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r6 = r0.getInitMethodPoolEntry(r7, r2, r6)
            r7 = 0
            r1[r7] = r6
            r5.setNested(r1)
            r6 = 2
            int[] r6 = new int[]{r7, r6}
            int[][] r6 = new int[][]{r6}
            r5.setNestedPositions(r6)
            return
    }
}
