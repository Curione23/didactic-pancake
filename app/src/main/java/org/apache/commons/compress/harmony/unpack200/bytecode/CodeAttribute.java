package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class CodeAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    public java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> attributes;
    public java.util.List<java.lang.Integer> byteCodeOffsets;
    public java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode> byteCodes;
    public int codeLength;
    public java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> exceptionTable;
    public int maxLocals;
    public int maxStack;

    public CodeAttribute(int r4, int r5, byte[] r6, org.apache.commons.compress.harmony.unpack200.Segment r7, org.apache.commons.compress.harmony.unpack200.bytecode.OperandManager r8, java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> r9) {
            r3 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute.attributeName
            r3.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.attributes = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.byteCodeOffsets = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.byteCodes = r0
            r3.maxLocals = r5
            r3.maxStack = r4
            r4 = 0
            r3.codeLength = r4
            r3.exceptionTable = r9
            java.util.List<java.lang.Integer> r5 = r3.byteCodeOffsets
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r5.add(r9)
            r5 = r4
        L2d:
            int r9 = r6.length
            if (r4 >= r9) goto L97
            r9 = r6[r4]
            r9 = r9 & 255(0xff, float:3.57E-43)
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r9 = org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode.getByteCode(r9)
            r9.setByteCodeIndex(r5)
            int r0 = r5 + 1
            int r1 = r3.codeLength
            r9.extractOperands(r8, r7, r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode> r1 = r3.byteCodes
            r1.add(r9)
            int r1 = r3.codeLength
            int r2 = r9.getLength()
            int r1 = r1 + r2
            r3.codeLength = r1
            java.util.List<java.lang.Integer> r1 = r3.byteCodeOffsets
            int r2 = r1.size()
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            boolean r2 = r9.hasMultipleByteCodes()
            if (r2 == 0) goto L76
            java.util.List<java.lang.Integer> r0 = r3.byteCodeOffsets
            int r2 = r1 + 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            int r5 = r5 + 2
            goto L77
        L76:
            r5 = r0
        L77:
            int r0 = r6.length
            int r0 = r0 + (-1)
            if (r4 >= r0) goto L8a
            java.util.List<java.lang.Integer> r0 = r3.byteCodeOffsets
            int r2 = r9.getLength()
            int r1 = r1 + r2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
        L8a:
            int r9 = r9.getOpcode()
            r0 = 196(0xc4, float:2.75E-43)
            if (r9 != r0) goto L94
            int r4 = r4 + 1
        L94:
            int r4 = r4 + 1
            goto L2d
        L97:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode> r4 = r3.byteCodes
            java.util.Iterator r4 = r4.iterator()
        L9d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lad
            java.lang.Object r5 = r4.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r5 = (org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode) r5
            r5.applyByteCodeTargetFixup(r3)
            goto L9d
        Lad:
            return
    }

    static /* synthetic */ void lambda$renumber$0(java.util.List r0, org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry r1) {
            r1.renumber(r0)
            return
    }

    static /* synthetic */ void lambda$resolve$1(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r0, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r1) {
            r1.resolve(r0)
            return
    }

    static /* synthetic */ void lambda$resolve$2(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r0, org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1) {
            r1.resolve(r0)
            return
    }

    static /* synthetic */ void lambda$resolve$3(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r0, org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry r1) {
            r1.resolve(r0)
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute.attributeName = r0
            return
    }

    public void addAttribute(org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r2.attributes
            r0.add(r3)
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute
            if (r0 == 0) goto L11
            r0 = r3
            org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute) r0
            int r1 = r2.codeLength
            r0.setCodeLength(r1)
        L11:
            boolean r0 = r3 instanceof org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute
            if (r0 == 0) goto L1c
            org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute r3 = (org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTypeTableAttribute) r3
            int r0 = r2.codeLength
            r3.setCodeLength(r0)
        L1c:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r3 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r3.attributes
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L7:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L19
            java.lang.Object r2 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r2
            int r2 = r2.getLengthIncludingHeader()
            int r1 = r1 + r2
            goto L7
        L19:
            int r0 = r3.codeLength
            int r0 = r0 + 10
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> r2 = r3.exceptionTable
            int r2 = r2.size()
            int r2 = r2 * 8
            int r0 = r0 + r2
            int r0 = r0 + 2
            int r0 = r0 + r1
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r1 = r3.attributes
            int r1 = r1.size()
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode> r2 = r3.byteCodes
            int r2 = r2.size()
            int r1 = r1 + r2
            int r1 = r1 + 10
            r0.<init>(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r3.getAttributeName()
            r0.add(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode> r1 = r3.byteCodes
            r0.addAll(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r1 = r3.attributes
            r0.addAll(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> r1 = r3.exceptionTable
            java.util.Iterator r1 = r1.iterator()
        L2b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L41
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry r2 = (org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry) r2
            org.apache.commons.compress.harmony.unpack200.bytecode.CPClass r2 = r2.getCatchType()
            if (r2 == 0) goto L2b
            r0.add(r2)
            goto L2b
        L41:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute.NONE
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[]) r0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    protected int[] getStartPCs() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    public void renumber(java.util.List<java.lang.Integer> r3) {
            r2 = this;
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> r0 = r2.exceptionTable
            org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.forEach(r1)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r3) {
            r2 = this;
            super.resolve(r3)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r2.attributes
            org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda1 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda1
            r1.<init>(r3)
            r0.forEach(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode> r0 = r2.byteCodes
            org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda2 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda2
            r1.<init>(r3)
            r0.forEach(r1)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> r0 = r2.exceptionTable
            org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda3 r1 = new org.apache.commons.compress.harmony.unpack200.bytecode.CodeAttribute$$ExternalSyntheticLambda3
            r1.<init>(r3)
            r0.forEach(r1)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Code: "
            r0.<init>(r1)
            int r1 = r2.getLength()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " bytes"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.maxStack
            r3.writeShort(r0)
            int r0 = r2.maxLocals
            r3.writeShort(r0)
            int r0 = r2.codeLength
            r3.writeInt(r0)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode> r0 = r2.byteCodes
            java.util.Iterator r0 = r0.iterator()
        L15:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.ByteCode) r1
            r1.write(r3)
            goto L15
        L25:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> r0 = r2.exceptionTable
            int r0 = r0.size()
            r3.writeShort(r0)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry> r0 = r2.exceptionTable
            java.util.Iterator r0 = r0.iterator()
        L34:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.ExceptionTableEntry) r1
            r1.write(r3)
            goto L34
        L44:
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r2.attributes
            int r0 = r0.size()
            r3.writeShort(r0)
            java.util.List<org.apache.commons.compress.harmony.unpack200.bytecode.Attribute> r0 = r2.attributes
            java.util.Iterator r0 = r0.iterator()
        L53:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L63
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.harmony.unpack200.bytecode.Attribute r1 = (org.apache.commons.compress.harmony.unpack200.bytecode.Attribute) r1
            r1.write(r3)
            goto L53
        L63:
            return
    }
}
