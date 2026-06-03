package org.apache.commons.compress.compressors.lzw;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LZWInputStream extends org.apache.commons.compress.compressors.CompressorInputStream implements org.apache.commons.compress.utils.InputStreamStatistics {
    protected static final int DEFAULT_CODE_SIZE = 9;
    protected static final int UNUSED_PREFIX = -1;
    private byte[] characters;
    private int clearCode;
    private int codeSize;
    protected final org.apache.commons.compress.utils.BitInputStream in;
    private final byte[] oneByte;
    private byte[] outputStack;
    private int outputStackLocation;
    private int[] prefixes;
    private int previousCode;
    private byte previousCodeFirstChar;
    private int tableSize;

    protected LZWInputStream(java.io.InputStream r3, java.nio.ByteOrder r4) {
            r2 = this;
            r2.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r2.oneByte = r0
            r0 = -1
            r2.clearCode = r0
            r1 = 9
            r2.codeSize = r1
            r2.previousCode = r0
            org.apache.commons.compress.utils.BitInputStream r0 = new org.apache.commons.compress.utils.BitInputStream
            r0.<init>(r3, r4)
            r2.in = r0
            return
    }

    private int readFromStack(byte[] r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = r2.outputStack
            int r0 = r0.length
            int r1 = r2.outputStackLocation
            int r0 = r0 - r1
            if (r0 <= 0) goto L19
            int r5 = java.lang.Math.min(r0, r5)
            byte[] r0 = r2.outputStack
            int r1 = r2.outputStackLocation
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            int r3 = r2.outputStackLocation
            int r3 = r3 + r5
            r2.outputStackLocation = r3
            return r5
        L19:
            r3 = 0
            return r3
    }

    protected abstract int addEntry(int r1, byte r2) throws java.io.IOException;

    protected int addEntry(int r2, byte r3, int r4) {
            r1 = this;
            int r0 = r1.tableSize
            if (r0 >= r4) goto L11
            int[] r4 = r1.prefixes
            r4[r0] = r2
            byte[] r2 = r1.characters
            r2[r0] = r3
            int r2 = r0 + 1
            r1.tableSize = r2
            return r0
        L11:
            r2 = -1
            return r2
    }

    protected int addRepeatOfPreviousCode() throws java.io.IOException {
            r2 = this;
            int r0 = r2.previousCode
            r1 = -1
            if (r0 == r1) goto Lc
            byte r1 = r2.previousCodeFirstChar
            int r0 = r2.addEntry(r0, r1)
            return r0
        Lc:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "The first code can't be a reference to its preceding code"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r1.in
            r0.close()
            return
    }

    protected abstract int decompressNextSymbol() throws java.io.IOException;

    protected int expandCodeToOutputStack(int r5, boolean r6) throws java.io.IOException {
            r4 = this;
            r0 = r5
        L1:
            if (r0 < 0) goto L16
            byte[] r1 = r4.outputStack
            int r2 = r4.outputStackLocation
            int r2 = r2 + (-1)
            r4.outputStackLocation = r2
            byte[] r3 = r4.characters
            r3 = r3[r0]
            r1[r2] = r3
            int[] r1 = r4.prefixes
            r0 = r1[r0]
            goto L1
        L16:
            int r0 = r4.previousCode
            r1 = -1
            if (r0 == r1) goto L26
            if (r6 != 0) goto L26
            byte[] r6 = r4.outputStack
            int r1 = r4.outputStackLocation
            r6 = r6[r1]
            r4.addEntry(r0, r6)
        L26:
            r4.previousCode = r5
            byte[] r5 = r4.outputStack
            int r6 = r4.outputStackLocation
            r5 = r5[r6]
            r4.previousCodeFirstChar = r5
            return r6
    }

    protected int getClearCode() {
            r1 = this;
            int r0 = r1.clearCode
            return r0
    }

    protected int getCodeSize() {
            r1 = this;
            int r0 = r1.codeSize
            return r0
    }

    @Override // org.apache.commons.compress.utils.InputStreamStatistics
    public long getCompressedCount() {
            r2 = this;
            org.apache.commons.compress.utils.BitInputStream r0 = r2.in
            long r0 = r0.getBytesRead()
            return r0
    }

    protected int getPrefix(int r2) {
            r1 = this;
            int[] r0 = r1.prefixes
            r2 = r0[r2]
            return r2
    }

    protected int getPrefixesLength() {
            r1 = this;
            int[] r0 = r1.prefixes
            int r0 = r0.length
            return r0
    }

    protected int getTableSize() {
            r1 = this;
            int r0 = r1.tableSize
            return r0
    }

    protected void incrementCodeSize() {
            r1 = this;
            int r0 = r1.codeSize
            int r0 = r0 + 1
            r1.codeSize = r0
            return
    }

    protected void initializeTables(int r4) {
            r3 = this;
            r0 = 1
            int r0 = r0 << r4
            r1 = 256(0x100, float:3.59E-43)
            if (r0 < r1) goto L2b
            int r2 = r3.getCodeSize()
            if (r2 > r4) goto L2b
            int[] r4 = new int[r0]
            r3.prefixes = r4
            byte[] r4 = new byte[r0]
            r3.characters = r4
            byte[] r4 = new byte[r0]
            r3.outputStack = r4
            r3.outputStackLocation = r0
            r4 = 0
        L1b:
            if (r4 >= r1) goto L2a
            int[] r0 = r3.prefixes
            r2 = -1
            r0[r4] = r2
            byte[] r0 = r3.characters
            byte r2 = (byte) r4
            r0[r4] = r2
            int r4 = r4 + 1
            goto L1b
        L2a:
            return
        L2b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "maxCodeSize "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is out of bounds."
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    protected void initializeTables(int r5, int r6) throws org.apache.commons.compress.MemoryLimitException {
            r4 = this;
            if (r5 <= 0) goto L1e
            r0 = -1
            if (r6 <= r0) goto L1a
            r0 = 1
            int r0 = r0 << r5
            long r0 = (long) r0
            r2 = 6
            long r0 = r0 * r2
            r2 = 10
            long r0 = r0 >> r2
            long r2 = (long) r6
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L14
            goto L1a
        L14:
            org.apache.commons.compress.MemoryLimitException r5 = new org.apache.commons.compress.MemoryLimitException
            r5.<init>(r0, r6)
            throw r5
        L1a:
            r4.initializeTables(r5)
            return
        L1e:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "maxCodeSize is "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = ", must be bigger than 0"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.oneByte
            int r0 = r2.read(r0)
            if (r0 >= 0) goto L9
            return r0
        L9:
            byte[] r0 = r2.oneByte
            r1 = 0
            r0 = r0[r1]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    @Override // java.io.InputStream
    public int read(byte[] r4, int r5, int r6) throws java.io.IOException {
            r3 = this;
            if (r6 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r3.readFromStack(r4, r5, r6)
        L8:
            int r1 = r6 - r0
            if (r1 <= 0) goto L21
            int r2 = r3.decompressNextSymbol()
            if (r2 >= 0) goto L19
            if (r0 <= 0) goto L18
            r3.count(r0)
            return r0
        L18:
            return r2
        L19:
            int r2 = r5 + r0
            int r1 = r3.readFromStack(r4, r2, r1)
            int r0 = r0 + r1
            goto L8
        L21:
            r3.count(r0)
            return r0
    }

    protected int readNextCode() throws java.io.IOException {
            r2 = this;
            int r0 = r2.codeSize
            r1 = 31
            if (r0 > r1) goto Le
            org.apache.commons.compress.utils.BitInputStream r1 = r2.in
            long r0 = r1.readBits(r0)
            int r0 = (int) r0
            return r0
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Code size must not be bigger than 31"
            r0.<init>(r1)
            throw r0
    }

    protected void resetCodeSize() {
            r1 = this;
            r0 = 9
            r1.setCodeSize(r0)
            return
    }

    protected void resetPreviousCode() {
            r1 = this;
            r0 = -1
            r1.previousCode = r0
            return
    }

    protected void setClearCode(int r2) {
            r1 = this;
            r0 = 1
            int r2 = r2 - r0
            int r2 = r0 << r2
            r1.clearCode = r2
            return
    }

    protected void setCodeSize(int r1) {
            r0 = this;
            r0.codeSize = r1
            return
    }

    protected void setPrefix(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.prefixes
            r0[r2] = r3
            return
    }

    protected void setTableSize(int r1) {
            r0 = this;
            r0.tableSize = r1
            return
    }
}
