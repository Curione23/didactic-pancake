package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class NewClassRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ClassRefForm {
    public NewClassRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r4, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r5, int r6) {
            r3 = this;
            int r6 = r3.getOffset(r5)
            r0 = 0
            if (r6 != 0) goto L28
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r6 = r5.globalConstantPool()
            r1 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r1]
            java.lang.String r2 = r5.getCurrentClass()
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r6 = r6.getClassPoolEntry(r2)
            r1[r0] = r6
            r4.setNested(r1)
            r6 = 2
            int[] r6 = new int[]{r0, r6}
            int[][] r6 = new int[][]{r6}
            r4.setNestedPositions(r6)
            goto L2b
        L28:
            r3.setNestedEntries(r4, r5, r6)     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L3b
        L2b:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r4 = r4.getNestedClassFileEntries()
            r4 = r4[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r4 = (org.apache.commons.compress.harmony.unpack200.bytecode.CPClass) r4
            java.lang.String r4 = r4.getName()
            r5.setNewClass(r4)
            return
        L3b:
            java.lang.Error r4 = new java.lang.Error
            java.lang.String r5 = "Got a pack200 exception. What to do?"
            r4.<init>(r5)
            throw r4
    }
}
