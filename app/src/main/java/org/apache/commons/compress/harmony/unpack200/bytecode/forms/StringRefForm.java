package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class StringRefForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm {
    public StringRefForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public StringRefForm(int r1, java.lang.String r2, int[] r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.widened = r4
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getOffset(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1) {
            r0 = this;
            int r1 = r1.nextStringRef()
            return r1
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected int getPoolID() {
            r1 = this;
            r0 = 6
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.SingleByteReferenceForm, org.apache.commons.compress.harmony.unpack200.bytecode.forms.ReferenceForm
    protected void setNestedEntries(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r6, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r7, int r8) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r5 = this;
            org.apache.commons.compress.harmony.unpack200.SegmentConstantPool r7 = r7.globalConstantPool()
            r0 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            int r2 = r5.getPoolID()
            long r3 = (long) r8
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry r7 = r7.getValue(r2, r3)
            r8 = 0
            r1[r8] = r7
            r6.setNested(r1)
            boolean r7 = r5.widened
            if (r7 == 0) goto L27
            r7 = 2
            int[] r7 = new int[]{r8, r7}
            int[][] r7 = new int[][]{r7}
            r6.setNestedPositions(r7)
            goto L32
        L27:
            int[] r7 = new int[]{r8, r0}
            int[][] r7 = new int[][]{r7}
            r6.setNestedPositions(r7)
        L32:
            return
    }
}
