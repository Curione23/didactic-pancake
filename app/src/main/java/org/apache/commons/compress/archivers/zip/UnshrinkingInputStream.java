package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
final class UnshrinkingInputStream extends org.apache.commons.compress.compressors.lzw.LZWInputStream {
    private static final int MAX_CODE_SIZE = 13;
    private static final int MAX_TABLE_SIZE = 8192;
    private final boolean[] isUsed;

    UnshrinkingInputStream(java.io.InputStream r3) {
            r2 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.<init>(r3, r0)
            r3 = 9
            r2.setClearCode(r3)
            r3 = 13
            r2.initializeTables(r3)
            int r3 = r2.getPrefixesLength()
            boolean[] r3 = new boolean[r3]
            r2.isUsed = r3
            r3 = 0
        L18:
            r0 = 256(0x100, float:3.59E-43)
            r1 = 1
            if (r3 >= r0) goto L24
            boolean[] r0 = r2.isUsed
            r0[r3] = r1
            int r3 = r3 + 1
            goto L18
        L24:
            int r3 = r2.getClearCode()
            int r3 = r3 + r1
            r2.setTableSize(r3)
            return
    }

    private void partialClear() {
            r8 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            boolean[] r1 = new boolean[r0]
            r2 = 0
            r3 = r2
        L6:
            boolean[] r4 = r8.isUsed
            int r5 = r4.length
            r6 = -1
            r7 = 1
            if (r3 >= r5) goto L20
            boolean r4 = r4[r3]
            if (r4 == 0) goto L1d
            int r4 = r8.getPrefix(r3)
            if (r4 == r6) goto L1d
            int r4 = r8.getPrefix(r3)
            r1[r4] = r7
        L1d:
            int r3 = r3 + 1
            goto L6
        L20:
            int r3 = r8.getClearCode()
            int r3 = r3 + r7
        L25:
            if (r3 >= r0) goto L35
            boolean r4 = r1[r3]
            if (r4 != 0) goto L32
            boolean[] r4 = r8.isUsed
            r4[r3] = r2
            r8.setPrefix(r3, r6)
        L32:
            int r3 = r3 + 1
            goto L25
        L35:
            return
    }

    @Override // org.apache.commons.compress.compressors.lzw.LZWInputStream
    protected int addEntry(int r4, byte r5) throws java.io.IOException {
            r3 = this;
            int r0 = r3.getTableSize()
        L4:
            r1 = 8192(0x2000, float:1.148E-41)
            if (r0 >= r1) goto L11
            boolean[] r2 = r3.isUsed
            boolean r2 = r2[r0]
            if (r2 == 0) goto L11
            int r0 = r0 + 1
            goto L4
        L11:
            r3.setTableSize(r0)
            int r4 = r3.addEntry(r4, r5, r1)
            if (r4 < 0) goto L1f
            boolean[] r5 = r3.isUsed
            r0 = 1
            r5[r4] = r0
        L1f:
            return r4
    }

    @Override // org.apache.commons.compress.compressors.lzw.LZWInputStream
    protected int decompressNextSymbol() throws java.io.IOException {
            r4 = this;
            int r0 = r4.readNextCode()
            if (r0 >= 0) goto L8
            r0 = -1
            return r0
        L8:
            int r1 = r4.getClearCode()
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L20
            boolean[] r1 = r4.isUsed
            boolean r1 = r1[r0]
            if (r1 != 0) goto L1b
            int r0 = r4.addRepeatOfPreviousCode()
            r2 = r3
        L1b:
            int r0 = r4.expandCodeToOutputStack(r0, r2)
            return r0
        L20:
            int r0 = r4.readNextCode()
            if (r0 < 0) goto L60
            if (r0 != r3) goto L3c
            int r0 = r4.getCodeSize()
            r1 = 13
            if (r0 >= r1) goto L34
            r4.incrementCodeSize()
            goto L4a
        L34:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Attempt to increase code size beyond maximum"
            r0.<init>(r1)
            throw r0
        L3c:
            r1 = 2
            if (r0 != r1) goto L4b
            r4.partialClear()
            int r0 = r4.getClearCode()
            int r0 = r0 + r3
            r4.setTableSize(r0)
        L4a:
            return r2
        L4b:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Invalid clear code subcode "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L60:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Unexpected EOF;"
            r0.<init>(r1)
            throw r0
    }
}
