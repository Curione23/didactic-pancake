package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ReferenceForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm {
    public ReferenceForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    protected abstract int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1);

    protected abstract int getPoolID();

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r2, int r3) {
            r0 = this;
            int r3 = r0.getOffset(r2)
            r0.setNestedEntries(r1, r2, r3)     // Catch: org.apache.commons.compress.harmony.pack200.Pack200Exception -> L8
            return
        L8:
            java.lang.Error r1 = new java.lang.Error
            java.lang.String r2 = "Got a pack200 exception. What to do?"
            r1.<init>(r2)
            throw r1
    }

    protected void setNestedEntries(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r5, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r6, int r7) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r6 = r6.globalConstantPool()
            r0 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            int r1 = r4.getPoolID()
            long r2 = (long) r7
            org.apache.commons.compress.harmony.unpack200.bytecode.ConstantPoolEntry r6 = r6.getConstantPoolEntry(r1, r2)
            r7 = 0
            r0[r7] = r6
            r6 = r0[r7]
            java.lang.String r1 = "Null nested entries are not allowed"
            java.util.Objects.requireNonNull(r6, r1)
            r5.setNested(r0)
            r6 = 2
            int[] r6 = new int[]{r7, r6}
            int[][] r6 = new int[][]{r6}
            r5.setNestedPositions(r6)
            return
    }
}
