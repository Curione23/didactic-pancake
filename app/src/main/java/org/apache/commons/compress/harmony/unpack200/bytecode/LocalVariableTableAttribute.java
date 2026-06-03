package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class LocalVariableTableAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private int codeLength;
    private int[] descriptorIndexes;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] descriptors;
    private final int[] indexes;
    private final int[] lengths;
    private final int localVariableTableLength;
    private int[] nameIndexes;
    private final org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] names;
    private final int[] startPcs;

    public LocalVariableTableAttribute(int r2, int[] r3, int[] r4, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r5, org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r6, int[] r7) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute.attributeName
            r1.<init>(r0)
            r1.localVariableTableLength = r2
            r1.startPcs = r3
            r1.lengths = r4
            r1.names = r5
            r1.descriptors = r6
            r1.indexes = r7
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute.attributeName = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            int r0 = r1.localVariableTableLength
            int r0 = r0 * 10
            int r0 = r0 + 2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r1 = r3.getAttributeName()
            r0.add(r1)
            r1 = 0
        Ld:
            int r2 = r3.localVariableTableLength
            if (r1 >= r2) goto L22
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r2 = r3.names
            r2 = r2[r1]
            r0.add(r2)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r2 = r3.descriptors
            r2 = r2[r1]
            r0.add(r2)
            int r1 = r1 + 1
            goto Ld
        L22:
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r1 = org.apache.commons.compress.harmony.unpack200.bytecode.LocalVariableTableAttribute.NONE
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = (org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[]) r0
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    protected int[] getStartPCs() {
            r1 = this;
            int[] r0 = r1.startPcs
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    public void renumber(java.util.List<java.lang.Integer> r7) throws org.apache.commons.compress.harmony.pack200.Pack200Exception {
            r6 = this;
            int[] r0 = r6.startPcs
            int r1 = r0.length
            int[] r0 = java.util.Arrays.copyOf(r0, r1)
            super.renumber(r7)
            int r1 = r6.codeLength
            r2 = 0
        Ld:
            int[] r3 = r6.lengths
            int r4 = r3.length
            if (r2 >= r4) goto L40
            int[] r4 = r6.startPcs
            r4 = r4[r2]
            r3 = r3[r2]
            r5 = r0[r2]
            int r5 = r5 + r3
            if (r5 < 0) goto L38
            int r3 = r7.size()
            if (r5 != r3) goto L26
            int r3 = r1 - r4
            goto L31
        L26:
            java.lang.Object r3 = r7.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            int r3 = r3 - r4
        L31:
            int[] r4 = r6.lengths
            r4[r2] = r3
            int r2 = r2 + 1
            goto Ld
        L38:
            org.apache.commons.compress.harmony.pack200.Pack200Exception r7 = new org.apache.commons.compress.harmony.pack200.Pack200Exception
            java.lang.String r0 = "Error renumbering bytecode indexes"
            r7.<init>(r0)
            throw r7
        L40:
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected void resolve(org.apache.commons.compress.harmony.unpack200.bytecode.ClassConstantPool r4) {
            r3 = this;
            super.resolve(r4)
            int r0 = r3.localVariableTableLength
            int[] r1 = new int[r0]
            r3.nameIndexes = r1
            int[] r0 = new int[r0]
            r3.descriptorIndexes = r0
            r0 = 0
        Le:
            int r1 = r3.localVariableTableLength
            if (r0 >= r1) goto L3b
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r3.names
            r1 = r1[r0]
            r1.resolve(r4)
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r1 = r3.descriptors
            r1 = r1[r0]
            r1.resolve(r4)
            int[] r1 = r3.nameIndexes
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r2 = r3.names
            r2 = r2[r0]
            int r2 = r4.indexOf(r2)
            r1[r0] = r2
            int[] r1 = r3.descriptorIndexes
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8[] r2 = r3.descriptors
            r2 = r2[r0]
            int r2 = r4.indexOf(r2)
            r1[r0] = r2
            int r0 = r0 + 1
            goto Le
        L3b:
            return
    }

    public void setCodeLength(int r1) {
            r0 = this;
            r0.codeLength = r1
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LocalVariableTable: "
            r0.<init>(r1)
            int r1 = r2.localVariableTableLength
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " variables"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.localVariableTableLength
            r3.writeShort(r0)
            r0 = 0
        L6:
            int r1 = r2.localVariableTableLength
            if (r0 >= r1) goto L30
            int[] r1 = r2.startPcs
            r1 = r1[r0]
            r3.writeShort(r1)
            int[] r1 = r2.lengths
            r1 = r1[r0]
            r3.writeShort(r1)
            int[] r1 = r2.nameIndexes
            r1 = r1[r0]
            r3.writeShort(r1)
            int[] r1 = r2.descriptorIndexes
            r1 = r1[r0]
            r3.writeShort(r1)
            int[] r1 = r2.indexes
            r1 = r1[r0]
            r3.writeShort(r1)
            int r0 = r0 + 1
            goto L6
        L30:
            return
    }
}
