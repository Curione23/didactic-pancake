package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public class LineNumberTableAttribute extends org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute {
    private static org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 attributeName;
    private final int lineNumberTableLength;
    private final int[] lineNumbers;
    private final int[] startPcs;

    public LineNumberTableAttribute(int r2, int[] r3, int[] r4) {
            r1 = this;
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0 = org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute.attributeName
            r1.<init>(r0)
            r1.lineNumberTableLength = r2
            r1.startPcs = r3
            r1.lineNumbers = r4
            return
    }

    public static void setAttributeName(org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r0) {
            org.apache.commons.compress.harmony.unpack200.bytecode.LineNumberTableAttribute.attributeName = r0
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
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

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected int getLength() {
            r1 = this;
            int r0 = r1.lineNumberTableLength
            int r0 = r0 * 4
            int r0 = r0 + 2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.Attribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    protected org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] getNestedClassFileEntries() {
            r3 = this;
            r0 = 1
            org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[] r0 = new org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry[r0]
            r1 = 0
            org.apache.commons.compress.harmony.unpack200.bytecode.CPUTF8 r2 = r3.getAttributeName()
            r0[r1] = r2
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute
    protected int[] getStartPCs() {
            r1 = this;
            int[] r0 = r1.startPcs
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LineNumberTable: "
            r0.<init>(r1)
            int r1 = r2.lineNumberTableLength
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " lines"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.BCIRenumberedAttribute, org.apache.commons.compress.harmony.unpack200.bytecode.Attribute
    protected void writeBody(java.io.DataOutputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r2.lineNumberTableLength
            r3.writeShort(r0)
            r0 = 0
        L6:
            int r1 = r2.lineNumberTableLength
            if (r0 >= r1) goto L1b
            int[] r1 = r2.startPcs
            r1 = r1[r0]
            r3.writeShort(r1)
            int[] r1 = r2.lineNumbers
            r1 = r1[r0]
            r3.writeShort(r1)
            int r0 = r0 + 1
            goto L6
        L1b:
            return
    }
}
