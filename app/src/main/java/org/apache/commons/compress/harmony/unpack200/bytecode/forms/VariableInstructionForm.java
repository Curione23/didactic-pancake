package org.apache.commons.compress.harmony.unpack200.bytecode.forms;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VariableInstructionForm extends org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm {
    public VariableInstructionForm(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public void setRewrite2Bytes(int r4, int r5, int[] r6) {
            r3 = this;
            java.lang.String r0 = "Trying to rewrite "
            if (r5 < 0) goto L39
            int r1 = r6.length
            int r2 = r5 + 1
            if (r2 > r1) goto L16
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r4
            int r0 = r0 >> 8
            r6[r5] = r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            r6[r2] = r4
            return
        L16:
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r0 = " with an int at position "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = " but this won't fit in the rewrite array"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L39:
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r6 = " but there is no room for 4 bytes"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public void setRewrite4Bytes(int r4, int r5, int[] r6) {
            r3 = this;
            java.lang.String r0 = "Trying to rewrite "
            if (r5 < 0) goto L4b
            int r1 = r6.length
            int r2 = r5 + 3
            if (r2 > r1) goto L28
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r4
            int r0 = r0 >> 24
            r6[r5] = r0
            int r0 = r5 + 1
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r4
            int r1 = r1 >> 16
            r6[r0] = r1
            int r5 = r5 + 2
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r4
            int r0 = r0 >> 8
            r6[r5] = r0
            r4 = r4 & 255(0xff, float:3.57E-43)
            r6[r2] = r4
            return
        L28:
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r0)
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r0 = " with an int at position "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r6 = " but this won't fit in the rewrite array"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L4b:
            java.lang.Error r4 = new java.lang.Error
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r6 = " but there is no room for 4 bytes"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public void setRewrite4Bytes(int r4, int[] r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r5.length
            int r1 = r1 + (-3)
            r2 = -1
            if (r0 >= r1) goto L21
            r1 = r5[r0]
            if (r1 != r2) goto L1e
            int r1 = r0 + 1
            r1 = r5[r1]
            if (r1 != r2) goto L1e
            int r1 = r0 + 2
            r1 = r5[r1]
            if (r1 != r2) goto L1e
            int r1 = r0 + 3
            r1 = r5[r1]
            if (r1 != r2) goto L1e
            goto L22
        L1e:
            int r0 = r0 + 1
            goto L1
        L21:
            r0 = r2
        L22:
            r3.setRewrite4Bytes(r4, r0, r5)
            return
    }
}
