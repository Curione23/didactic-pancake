package org.apache.commons.compress.harmony.unpack200.bytecode;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ConstantPoolEntry extends org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry {
    public static final byte CP_Class = 7;
    public static final byte CP_Double = 6;
    public static final byte CP_Fieldref = 9;
    public static final byte CP_Float = 4;
    public static final byte CP_Integer = 3;
    public static final byte CP_InterfaceMethodref = 11;
    public static final byte CP_Long = 5;
    public static final byte CP_Methodref = 10;
    public static final byte CP_NameAndType = 12;
    public static final byte CP_String = 8;
    public static final byte CP_UTF8 = 1;
    protected int globalIndex;
    byte tag;

    ConstantPoolEntry(byte r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.tag = r1
            r0.globalIndex = r2
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public void doWrite(java.io.DataOutputStream r2) throws java.io.IOException {
            r1 = this;
            byte r0 = r1.tag
            r2.writeByte(r0)
            r1.writeBody(r2)
            return
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public abstract boolean equals(java.lang.Object r1);

    public int getGlobalIndex() {
            r1 = this;
            int r0 = r1.globalIndex
            return r0
    }

    public byte getTag() {
            r1 = this;
            byte r0 = r1.tag
            return r0
    }

    @Override // org.apache.commons.compress.harmony.unpack200.bytecode.ClassFileEntry
    public abstract int hashCode();

    protected abstract void writeBody(java.io.DataOutputStream r1) throws java.io.IOException;
}
