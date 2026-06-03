package org.apache.commons.compress.harmony.pack200;

/* JADX INFO: loaded from: classes2.dex */
public class Pack200ClassReader extends org.objectweb.asm.ClassReader {
    private boolean anySyntheticAttributes;
    private java.lang.String fileName;
    private boolean lastConstantHadWideIndex;
    private int lastUnsignedShort;

    public Pack200ClassReader(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String getFileName() {
            r1 = this;
            java.lang.String r0 = r1.fileName
            return r0
    }

    public boolean hasSyntheticAttributes() {
            r1 = this;
            boolean r0 = r1.anySyntheticAttributes
            return r0
    }

    public boolean lastConstantHadWideIndex() {
            r1 = this;
            boolean r0 = r1.lastConstantHadWideIndex
            return r0
    }

    @Override // org.objectweb.asm.ClassReader
    public java.lang.Object readConst(int r2, char[] r3) {
            r1 = this;
            int r0 = r1.lastUnsignedShort
            if (r2 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            r1.lastConstantHadWideIndex = r0
            java.lang.Object r2 = super.readConst(r2, r3)
            return r2
    }

    @Override // org.objectweb.asm.ClassReader
    public java.lang.String readUTF8(int r1, char[] r2) {
            r0 = this;
            java.lang.String r1 = super.readUTF8(r1, r2)
            boolean r2 = r0.anySyntheticAttributes
            if (r2 != 0) goto L13
            java.lang.String r2 = "Synthetic"
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L13
            r2 = 1
            r0.anySyntheticAttributes = r2
        L13:
            return r1
    }

    @Override // org.objectweb.asm.ClassReader
    public int readUnsignedShort(int r3) {
            r2 = this;
            int r0 = super.readUnsignedShort(r3)
            if (r3 <= 0) goto L13
            byte[] r1 = r2.b
            int r3 = r3 + (-1)
            r3 = r1[r3]
            r1 = 19
            if (r3 != r1) goto L13
            r2.lastUnsignedShort = r0
            goto L17
        L13:
            r3 = -32768(0xffffffffffff8000, float:NaN)
            r2.lastUnsignedShort = r3
        L17:
            return r0
    }

    public void setFileName(java.lang.String r1) {
            r0 = this;
            r0.fileName = r1
            return
    }
}
