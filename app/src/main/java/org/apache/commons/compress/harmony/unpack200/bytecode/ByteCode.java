package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class ByteCode extends org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode[] noArgByteCodes;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm byteCodeForm;
    private int byteCodeOffset;
    private int[] byteCodeTargets;
    private org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] nested;
    private int[][] nestedPositions;
    private int[] rewrite;

    static {
            r0 = 255(0xff, float:3.57E-43)
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode[r0]
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode.noArgByteCodes = r0
            return
    }

    protected ByteCode(int r2) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode.NONE
            r1.<init>(r2, r0)
            return
    }

    protected ByteCode(int r2, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r3) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.byteCodeOffset = r0
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r2 = org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm.get(r2)
            r1.byteCodeForm = r2
            int[] r2 = r2.getRewriteCopy()
            r1.rewrite = r2
            r1.nested = r3
            return
    }

    public static org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode getByteCode(int r2) {
            r2 = r2 & 255(0xff, float:3.57E-43)
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm.get(r2)
            boolean r0 = r0.hasNoOperand()
            if (r0 == 0) goto L1e
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode[] r0 = org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode.noArgByteCodes
            r1 = r0[r2]
            if (r1 != 0) goto L19
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode
            r1.<init>(r2)
            r0[r2] = r1
        L19:
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode[] r0 = org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode.noArgByteCodes
            r2 = r0[r2]
            return r2
        L1e:
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode
            r0.<init>(r2)
            return r0
    }

    public void applyByteCodeTargetFixup(org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute r2) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r1.getByteCodeForm()
            r0.fixUpByteCodeTargets(r1, r2)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void doWrite(java.io.DataOutputStream r5) throws java.io.IOException {
            r4 = this;
            int[] r0 = r4.rewrite
            int r1 = r0.length
            r2 = 0
        L4:
            if (r2 >= r1) goto Le
            r3 = r0[r2]
            r5.writeByte(r3)
            int r2 = r2 + 1
            goto L4
        Le:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r0 != r1) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    public void extractOperands(org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r1, org.apache.commons.compress.harmony.unpack200.Segment r2, int r3) {
            r0 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r2 = r0.getByteCodeForm()
            r2.setByteCodeOperands(r0, r1, r3)
            return
    }

    protected org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm getByteCodeForm() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r1.byteCodeForm
            return r0
    }

    public int getByteCodeIndex() {
            r1 = this;
            int r0 = r1.byteCodeOffset
            return r0
    }

    public int[] getByteCodeTargets() {
            r1 = this;
            int[] r0 = r1.byteCodeTargets
            return r0
    }

    public int getLength() {
            r1 = this;
            int[] r0 = r1.rewrite
            int r0 = r0.length
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r1.getByteCodeForm()
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = r1.nested
            return r0
    }

    public int[] getNestedPosition(int r2) {
            r1 = this;
            int[][] r0 = r1.getNestedPositions()
            r2 = r0[r2]
            return r2
    }

    public int[][] getNestedPositions() {
            r1 = this;
            int[][] r0 = r1.nestedPositions
            return r0
    }

    public int getOpcode() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r1.getByteCodeForm()
            int r0 = r0.getOpcode()
            return r0
    }

    public int[] getRewrite() {
            r1 = this;
            int[] r0 = r1.rewrite
            return r0
    }

    public boolean hasMultipleByteCodes() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r1.getByteCodeForm()
            boolean r0 = r0.hasMultipleByteCodes()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public int hashCode() {
            r1 = this;
            int r0 = r1.objectHashCode()
            return r0
    }

    public boolean nestedMustStartClassPool() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r1.byteCodeForm
            boolean r0 = r0.nestedMustStartClassPool()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r5) {
            r4 = this;
            super.resolve(r5)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = r4.nested
            int r0 = r0.length
            if (r0 <= 0) goto L56
            r0 = 0
            r1 = r0
        La:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r2 = r4.nested
            int r2 = r2.length
            if (r1 >= r2) goto L56
            int[] r2 = r4.getNestedPosition(r1)
            r3 = 1
            r2 = r2[r3]
            if (r2 == r3) goto L42
            r3 = 2
            if (r2 != r3) goto L2d
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r2 = r4.nested
            r2 = r2[r1]
            int r2 = r5.indexOf(r2)
            int[] r3 = r4.getNestedPosition(r1)
            r3 = r3[r0]
            r4.setOperand2Bytes(r2, r3)
            goto L53
        L2d:
            java.lang.Error r5 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unhandled resolve "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L42:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r2 = r4.nested
            r2 = r2[r1]
            int r2 = r5.indexOf(r2)
            int[] r3 = r4.getNestedPosition(r1)
            r3 = r3[r0]
            r4.setOperandByte(r2, r3)
        L53:
            int r1 = r1 + 1
            goto La
        L56:
            return
    }

    public void setByteCodeIndex(int r1) {
            r0 = this;
            r0.byteCodeOffset = r1
            return
    }

    public void setByteCodeTargets(int[] r1) {
            r0 = this;
            r0.byteCodeTargets = r1
            return
    }

    public void setNested(org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1) {
            r0 = this;
            r0.nested = r1
            return
    }

    public void setNestedPositions(int[][] r1) {
            r0 = this;
            r0.nestedPositions = r1
            return
    }

    public void setOperand2Bytes(int r5, int r6) {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r4.getByteCodeForm()
            int r0 = r0.firstOperandIndex()
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r1 = r4.getByteCodeForm()
            int[] r1 = r1.getRewrite()
            int r1 = r1.length
            r2 = 1
            java.lang.String r3 = "Trying to rewrite "
            if (r0 < r2) goto L4d
            int r0 = r0 + r6
            int r2 = r0 + 1
            if (r2 > r1) goto L2a
            int[] r6 = r4.rewrite
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r5
            int r1 = r1 >> 8
            r6[r0] = r1
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6[r2] = r5
            return
        L2a:
            java.lang.Error r5 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " with an int at position "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " but this won't fit in the rewrite array"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L4d:
            java.lang.Error r5 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r0 = " that has no rewrite"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public void setOperandByte(int r5, int r6) {
            r4 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r4.getByteCodeForm()
            int r0 = r0.firstOperandIndex()
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r1 = r4.getByteCodeForm()
            int r1 = r1.operandLength()
            r2 = 1
            java.lang.String r3 = "Trying to rewrite "
            if (r0 < r2) goto L42
            int r0 = r0 + r6
            if (r0 > r1) goto L1f
            int[] r6 = r4.rewrite
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6[r0] = r5
            return
        L1f:
            java.lang.Error r5 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = " with an byte at position "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " but this won't fit in the rewrite array"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L42:
            java.lang.Error r5 = new java.lang.Error
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r3)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r0 = " that has no rewrite"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    public void setOperandBytes(int[] r7) {
            r6 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r6.getByteCodeForm()
            int r0 = r0.firstOperandIndex()
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r1 = r6.getByteCodeForm()
            int r1 = r1.operandLength()
            r2 = 1
            java.lang.String r3 = "Trying to rewrite "
            if (r0 < r2) goto L57
            int r2 = r7.length
            if (r1 != r2) goto L29
            r2 = 0
        L19:
            if (r2 >= r1) goto L28
            int[] r3 = r6.rewrite
            int r4 = r2 + r0
            r5 = r7[r2]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r3[r4] = r5
            int r2 = r2 + 1
            goto L19
        L28:
            return
        L29:
            java.lang.Error r0 = new java.lang.Error
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " with "
            java.lang.StringBuilder r1 = r1.append(r2)
            int r7 = r7.length
            java.lang.StringBuilder r7 = r1.append(r7)
            java.lang.String r1 = " but bytecode has length "
            java.lang.StringBuilder r7 = r7.append(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r1 = r6.byteCodeForm
            int r1 = r1.operandLength()
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.String r7 = r7.toString()
            r0.<init>(r7)
            throw r0
        L57:
            java.lang.Error r7 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r1 = " that has no rewrite"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
    }

    public void setOperandSigned2Bytes(int r2, int r3) {
            r1 = this;
            if (r2 < 0) goto L6
            r1.setOperand2Bytes(r2, r3)
            goto Lc
        L6:
            r0 = 65536(0x10000, float:9.1835E-41)
            int r2 = r2 + r0
            r1.setOperand2Bytes(r2, r3)
        Lc:
            return
    }

    public void setRewrite(int[] r1) {
            r0 = this;
            r0.rewrite = r1
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.forms.ByteCodeForm r0 = r1.getByteCodeForm()
            java.lang.String r0 = r0.getName()
            return r0
    }
}
