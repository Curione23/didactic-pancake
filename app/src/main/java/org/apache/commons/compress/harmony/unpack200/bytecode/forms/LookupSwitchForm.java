package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class LookupSwitchForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm {
    public LookupSwitchForm(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ int lambda$setByteCodeOperands$0(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r0, int r1) {
            int r0 = r0.nextCaseValues()
            return r0
    }

    static /* synthetic */ int lambda$setByteCodeOperands$1(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r0, int r1) {
            int r0 = r0.nextLabel()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r7, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r8, int r9) {
            r6 = this;
            int r0 = r8.nextCaseCount()
            int r1 = r8.nextLabel()
            int[] r2 = new int[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm$$ExternalSyntheticLambda0 r3 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm$$ExternalSyntheticLambda0
            r3.<init>(r8)
            java.util.Arrays.setAll(r2, r3)
            int[] r3 = new int[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm$$ExternalSyntheticLambda1 r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.LookupSwitchForm$$ExternalSyntheticLambda1
            r4.<init>(r8)
            java.util.Arrays.setAll(r3, r4)
            int r8 = r0 + 1
            int[] r8 = new int[r8]
            r4 = 0
            r8[r4] = r1
            r1 = 1
            java.lang.System.arraycopy(r3, r4, r8, r1, r0)
            r7.setByteCodeTargets(r8)
            int r9 = r9 % 4
            int r8 = 3 - r9
            int r9 = 12 - r9
            int r3 = r0 * 4
            int r9 = r9 + r3
            int r9 = r9 + r3
            int[] r9 = new int[r9]
            int r3 = r7.getOpcode()
            r9[r4] = r3
            r3 = r4
        L3d:
            if (r3 >= r8) goto L47
            int r5 = r1 + 1
            r9[r1] = r4
            int r3 = r3 + 1
            r1 = r5
            goto L3d
        L47:
            int r8 = r1 + 1
            r3 = -1
            r9[r1] = r3
            int r5 = r1 + 2
            r9[r8] = r3
            int r8 = r1 + 3
            r9[r5] = r3
            int r5 = r1 + 4
            r9[r8] = r3
            r6.setRewrite4Bytes(r0, r5, r9)
            int r1 = r1 + 8
        L5d:
            if (r4 >= r0) goto L79
            r8 = r2[r4]
            r6.setRewrite4Bytes(r8, r1, r9)
            int r8 = r1 + 4
            int r5 = r1 + 5
            r9[r8] = r3
            int r8 = r1 + 6
            r9[r5] = r3
            int r5 = r1 + 7
            r9[r8] = r3
            int r1 = r1 + 8
            r9[r5] = r3
            int r4 = r4 + 1
            goto L5d
        L79:
            r7.setRewrite(r9)
            return
    }
}
