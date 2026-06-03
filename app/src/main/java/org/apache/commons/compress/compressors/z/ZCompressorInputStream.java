package org.apache.commons.compress.compressors.z;

/* JADX INFO: loaded from: classes2.dex */
public class ZCompressorInputStream extends org.apache.commons.compress.compressors.lzw.LZWInputStream {
    private static final int BLOCK_MODE_MASK = 128;
    private static final int MAGIC_1 = 31;
    private static final int MAGIC_2 = 157;
    private static final int MAX_CODE_SIZE_MASK = 31;
    private final boolean blockMode;
    private final int maxCodeSize;
    private long totalCodesRead;

    public ZCompressorInputStream(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = -1
            r1.<init>(r2, r0)
            return
    }

    public ZCompressorInputStream(java.io.InputStream r5, int r6) throws java.io.IOException {
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r4.<init>(r5, r0)
            org.apache.commons.compress.utils.BitInputStream r5 = r4.in
            r0 = 8
            long r1 = r5.readBits(r0)
            int r5 = (int) r1
            org.apache.commons.compress.utils.BitInputStream r1 = r4.in
            long r1 = r1.readBits(r0)
            int r1 = (int) r1
            org.apache.commons.compress.utils.BitInputStream r2 = r4.in
            long r2 = r2.readBits(r0)
            int r0 = (int) r2
            r2 = 31
            if (r5 != r2) goto L40
            r5 = 157(0x9d, float:2.2E-43)
            if (r1 != r5) goto L40
            if (r0 < 0) goto L40
            r5 = r0 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L2c
            r5 = 1
            goto L2d
        L2c:
            r5 = 0
        L2d:
            r4.blockMode = r5
            r0 = r0 & r2
            r4.maxCodeSize = r0
            if (r5 == 0) goto L39
            r5 = 9
            r4.setClearCode(r5)
        L39:
            r4.initializeTables(r0, r6)
            r4.clearEntries()
            return
        L40:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Input is not in .Z format"
            r5.<init>(r6)
            throw r5
    }

    private void clearEntries() {
            r1 = this;
            boolean r0 = r1.blockMode
            int r0 = r0 + 256
            r1.setTableSize(r0)
            return
    }

    public static boolean matches(byte[] r2, int r3) {
            r0 = 3
            r1 = 0
            if (r3 <= r0) goto L12
            r3 = r2[r1]
            r0 = 31
            if (r3 != r0) goto L12
            r3 = 1
            r2 = r2[r3]
            r0 = -99
            if (r2 != r0) goto L12
            r1 = r3
        L12:
            return r1
    }

    private void reAlignReading() throws java.io.IOException {
            r7 = this;
            long r0 = r7.totalCodesRead
            r2 = 8
            long r0 = r0 % r2
            long r0 = r2 - r0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Le
            r0 = r3
        Le:
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L19
            r7.readNextCode()
            r5 = 1
            long r3 = r3 + r5
            goto Le
        L19:
            org.apache.commons.compress.utils.BitInputStream r0 = r7.in
            r0.clearBitCache()
            return
    }

    @Override // org.apache.commons.compress.compressors.lzw.LZWInputStream
    protected int addEntry(int r3, byte r4) throws java.io.IOException {
            r2 = this;
            r0 = 1
            int r1 = r2.getCodeSize()
            int r0 = r0 << r1
            int r3 = r2.addEntry(r3, r4, r0)
            int r4 = r2.getTableSize()
            if (r4 != r0) goto L1e
            int r4 = r2.getCodeSize()
            int r0 = r2.maxCodeSize
            if (r4 >= r0) goto L1e
            r2.reAlignReading()
            r2.incrementCodeSize()
        L1e:
            return r3
    }

    @Override // org.apache.commons.compress.compressors.lzw.LZWInputStream
    protected int decompressNextSymbol() throws java.io.IOException {
            r3 = this;
            int r0 = r3.readNextCode()
            if (r0 >= 0) goto L8
            r0 = -1
            return r0
        L8:
            boolean r1 = r3.blockMode
            r2 = 0
            if (r1 == 0) goto L20
            int r1 = r3.getClearCode()
            if (r0 != r1) goto L20
            r3.clearEntries()
            r3.reAlignReading()
            r3.resetCodeSize()
            r3.resetPreviousCode()
            return r2
        L20:
            int r1 = r3.getTableSize()
            if (r0 != r1) goto L2b
            r3.addRepeatOfPreviousCode()
            r2 = 1
            goto L31
        L2b:
            int r1 = r3.getTableSize()
            if (r0 > r1) goto L36
        L31:
            int r0 = r3.expandCodeToOutputStack(r0, r2)
            return r0
        L36:
            java.io.IOException r1 = new java.io.IOException
            int r2 = r3.getCodeSize()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            java.lang.String r2 = "Invalid %d bit code 0x%x"
            java.lang.String r0 = java.lang.String.format(r2, r0)
            r1.<init>(r0)
            throw r1
    }

    @Override // org.apache.commons.compress.compressors.lzw.LZWInputStream
    protected int readNextCode() throws java.io.IOException {
            r5 = this;
            int r0 = super.readNextCode()
            if (r0 < 0) goto Ld
            long r1 = r5.totalCodesRead
            r3 = 1
            long r1 = r1 + r3
            r5.totalCodesRead = r1
        Ld:
            return r0
    }
}
