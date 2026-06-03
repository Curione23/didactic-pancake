package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class LabelForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm {
    protected boolean widened;

    public LabelForm(int r1, java.lang.String r2, int[] r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public LabelForm(int r1, java.lang.String r2, int[] r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            r0.widened = r4
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void fixUpByteCodeTargets(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r5, org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute r6) {
            r4 = this;
            int[] r0 = r5.getByteCodeTargets()
            r1 = 0
            r0 = r0[r1]
            int r2 = r5.getByteCodeIndex()
            int r0 = r0 + r2
            java.util.List<java.lang.Integer> r3 = r6.byteCodeOffsets
            java.lang.Object r0 = r3.get(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.List<java.lang.Integer> r6 = r6.byteCodeOffsets
            java.lang.Object r6 = r6.get(r2)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r0 = r0 - r6
            r5.setOperandSigned2Bytes(r0, r1)
            boolean r6 = r4.widened
            if (r6 == 0) goto L39
            r6 = 4
            int[] r6 = new int[]{r1, r6}
            int[][] r6 = new int[][]{r6}
            r5.setNestedPositions(r6)
            goto L45
        L39:
            r6 = 2
            int[] r6 = new int[]{r1, r6}
            int[][] r6 = new int[][]{r6}
            r5.setNestedPositions(r6)
        L45:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r2, int r3) {
            r0 = this;
            int r2 = r2.nextLabel()
            int[] r2 = new int[]{r2}
            r1.setByteCodeTargets(r2)
            return
    }
}
