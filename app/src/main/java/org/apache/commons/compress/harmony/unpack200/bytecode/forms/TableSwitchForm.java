package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public class TableSwitchForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.SwitchForm {
    public TableSwitchForm(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ int lambda$setByteCodeOperands$0(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r0, int r1) {
            int r0 = r0.nextLabel()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm
    public void setByteCodeOperands(org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r8, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r9, int r10) {
            r7 = this;
            int r0 = r9.nextCaseCount()
            int r1 = r9.nextLabel()
            int r2 = r9.nextCaseValues()
            int[] r3 = new int[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm$$ExternalSyntheticLambda0 r4 = new org.apache.commons.compress.harmony.unpack200.bytecode.forms.TableSwitchForm$$ExternalSyntheticLambda0
            r4.<init>(r9)
            java.util.Arrays.setAll(r3, r4)
            int r9 = r0 + 1
            int[] r9 = new int[r9]
            r4 = 0
            r9[r4] = r1
            r1 = 1
            java.lang.System.arraycopy(r3, r4, r9, r1, r0)
            r8.setByteCodeTargets(r9)
            int r9 = r2 + r0
            int r9 = r9 - r1
            int r10 = r10 % 4
            int r3 = 3 - r10
            int r10 = 16 - r10
            int r5 = r0 * 4
            int r10 = r10 + r5
            int[] r10 = new int[r10]
            int r5 = r8.getOpcode()
            r10[r4] = r5
            r5 = r4
        L39:
            if (r5 >= r3) goto L43
            int r6 = r1 + 1
            r10[r1] = r4
            int r5 = r5 + 1
            r1 = r6
            goto L39
        L43:
            int r3 = r1 + 1
            r5 = -1
            r10[r1] = r5
            int r6 = r1 + 2
            r10[r3] = r5
            int r3 = r1 + 3
            r10[r6] = r5
            int r6 = r1 + 4
            r10[r3] = r5
            r7.setRewrite4Bytes(r2, r6, r10)
            int r2 = r1 + 8
            r7.setRewrite4Bytes(r9, r2, r10)
            int r1 = r1 + 12
        L5e:
            if (r4 >= r0) goto L73
            int r9 = r1 + 1
            r10[r1] = r5
            int r2 = r1 + 2
            r10[r9] = r5
            int r9 = r1 + 3
            r10[r2] = r5
            int r1 = r1 + 4
            r10[r9] = r5
            int r4 = r4 + 1
            goto L5e
        L73:
            r8.setRewrite(r10)
            return
    }
}
