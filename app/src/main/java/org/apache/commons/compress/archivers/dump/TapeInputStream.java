package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes2.dex */
final class TapeInputStream extends java.io.FilterInputStream {
    private static final int RECORD_SIZE = 1024;
    private byte[] blockBuffer;
    private int blockSize;
    private long bytesRead;
    private int currBlkIdx;
    private boolean isCompressed;
    private int readOffset;

    /* JADX INFO: renamed from: org.apache.commons.compress.archivers.dump.TapeInputStream$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$apache$commons$compress$archivers$dump$DumpArchiveConstants$COMPRESSION_TYPE = null;

        static {
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE[] r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.compress.archivers.dump.TapeInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$dump$DumpArchiveConstants$COMPRESSION_TYPE = r0
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.ZLIB     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.compress.archivers.dump.TapeInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$dump$DumpArchiveConstants$COMPRESSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.BZLIB     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.compress.archivers.dump.TapeInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$dump$DumpArchiveConstants$COMPRESSION_TYPE     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r1 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.LZO     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    TapeInputStream(java.io.InputStream r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r2]
            r1.blockBuffer = r0
            r0 = -1
            r1.currBlkIdx = r0
            r1.blockSize = r2
            r1.readOffset = r2
            return
    }

    private void readBlock(boolean r10) throws java.io.IOException {
            r9 = this;
            java.io.InputStream r0 = r9.in
            if (r0 == 0) goto Lc0
            boolean r0 = r9.isCompressed
            r1 = 1
            r2 = 0
            if (r0 == 0) goto La9
            int r0 = r9.currBlkIdx
            r3 = -1
            if (r0 != r3) goto L11
            goto La9
        L11:
            byte[] r0 = r9.blockBuffer
            r3 = 4
            r9.readFully(r0, r2, r3)
            long r4 = r9.bytesRead
            r6 = 4
            long r4 = r4 + r6
            r9.bytesRead = r4
            byte[] r0 = r9.blockBuffer
            int r0 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(r0, r2)
            r4 = r0 & 1
            if (r4 != r1) goto L99
            int r4 = r0 >> 1
            int r0 = r0 >> r3
            r3 = 268435455(0xfffffff, float:2.5243547E-29)
            r0 = r0 & r3
            byte[] r3 = r9.readRange(r0)
            long r5 = r9.bytesRead
            long r7 = (long) r0
            long r5 = r5 + r7
            r9.bytesRead = r5
            if (r10 != 0) goto L42
            byte[] r10 = r9.blockBuffer
            java.util.Arrays.fill(r10, r2)
            goto Lb8
        L42:
            int[] r10 = org.apache.commons.compress.archivers.dump.TapeInputStream.AnonymousClass1.$SwitchMap$org$apache$commons$compress$archivers$dump$DumpArchiveConstants$COMPRESSION_TYPE
            r0 = 3
            r4 = r4 & r0
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$COMPRESSION_TYPE r4 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.COMPRESSION_TYPE.find(r4)
            int r4 = r4.ordinal()
            r10 = r10[r4]
            if (r10 == r1) goto L6d
            r1 = 2
            if (r10 == r1) goto L65
            if (r10 == r0) goto L5d
            org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException r10 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException
            r10.<init>()
            throw r10
        L5d:
            org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException r10 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException
            java.lang.String r0 = "LZO"
            r10.<init>(r0)
            throw r10
        L65:
            org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException r10 = new org.apache.commons.compress.archivers.dump.UnsupportedCompressionAlgorithmException
            java.lang.String r0 = "BZLIB2"
            r10.<init>(r0)
            throw r10
        L6d:
            java.util.zip.Inflater r10 = new java.util.zip.Inflater
            r10.<init>()
            int r0 = r3.length     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
            r10.setInput(r3, r2, r0)     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
            byte[] r0 = r9.blockBuffer     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
            int r0 = r10.inflate(r0)     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
            int r3 = r9.blockSize     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
            if (r0 != r3) goto L84
            r10.end()
            goto Lb8
        L84:
            org.apache.commons.compress.archivers.dump.ShortFileException r0 = new org.apache.commons.compress.archivers.dump.ShortFileException     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
            r0.<init>()     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
            throw r0     // Catch: java.lang.Throwable -> L8a java.util.zip.DataFormatException -> L8c
        L8a:
            r0 = move-exception
            goto L95
        L8c:
            r0 = move-exception
            org.apache.commons.compress.archivers.dump.DumpArchiveException r1 = new org.apache.commons.compress.archivers.dump.DumpArchiveException     // Catch: java.lang.Throwable -> L8a
            java.lang.String r2 = "Bad data"
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L8a
            throw r1     // Catch: java.lang.Throwable -> L8a
        L95:
            r10.end()
            throw r0
        L99:
            byte[] r10 = r9.blockBuffer
            int r0 = r9.blockSize
            r9.readFully(r10, r2, r0)
            long r3 = r9.bytesRead
            int r10 = r9.blockSize
            long r5 = (long) r10
            long r3 = r3 + r5
            r9.bytesRead = r3
            goto Lb8
        La9:
            byte[] r10 = r9.blockBuffer
            int r0 = r9.blockSize
            r9.readFully(r10, r2, r0)
            long r3 = r9.bytesRead
            int r10 = r9.blockSize
            long r5 = (long) r10
            long r3 = r3 + r5
            r9.bytesRead = r3
        Lb8:
            int r10 = r9.currBlkIdx
            int r10 = r10 + r1
            r9.currBlkIdx = r10
            r9.readOffset = r2
            return
        Lc0:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "Input buffer is closed"
            r10.<init>(r0)
            throw r10
    }

    private void readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r2 = org.apache.commons.compress.utils.IOUtils.readFully(r0, r2, r3, r4)
            if (r2 < r4) goto L9
            return
        L9:
            org.apache.commons.compress.archivers.dump.ShortFileException r2 = new org.apache.commons.compress.archivers.dump.ShortFileException
            r2.<init>()
            throw r2
    }

    private byte[] readRange(int r3) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            byte[] r0 = org.apache.commons.compress.utils.IOUtils.readRange(r0, r3)
            int r1 = r0.length
            if (r1 < r3) goto La
            return r0
        La:
            org.apache.commons.compress.archivers.dump.ShortFileException r3 = new org.apache.commons.compress.archivers.dump.ShortFileException
            r3.<init>()
            throw r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r2 = this;
            int r0 = r2.readOffset
            int r1 = r2.blockSize
            if (r0 >= r1) goto L8
            int r1 = r1 - r0
            return r1
        L8:
            java.io.InputStream r0 = r2.in
            int r0 = r0.available()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            if (r0 == 0) goto Lf
            java.io.InputStream r0 = r2.in
            java.io.InputStream r1 = java.lang.System.in
            if (r0 == r1) goto Lf
            java.io.InputStream r0 = r2.in
            r0.close()
        Lf:
            return
    }

    public long getBytesRead() {
            r2 = this;
            long r0 = r2.bytesRead
            return r0
    }

    public byte[] peek() throws java.io.IOException {
            r5 = this;
            int r0 = r5.readOffset
            int r1 = r5.blockSize
            if (r0 != r1) goto Ld
            r0 = 1
            r5.readBlock(r0)     // Catch: org.apache.commons.compress.archivers.dump.ShortFileException -> Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            byte[] r2 = r5.blockBuffer
            int r3 = r5.readOffset
            r4 = 0
            java.lang.System.arraycopy(r2, r3, r1, r4, r0)
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws java.io.IOException {
            r2 = this;
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "All reads must be multiple of record size (1024 bytes."
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            int r1 = r7 % 1024
            if (r1 != 0) goto L33
        L8:
            if (r0 >= r7) goto L32
            int r1 = r4.readOffset
            int r2 = r4.blockSize
            if (r1 != r2) goto L17
            r1 = 1
            r4.readBlock(r1)     // Catch: org.apache.commons.compress.archivers.dump.ShortFileException -> L15
            goto L17
        L15:
            r5 = -1
            return r5
        L17:
            int r1 = r4.readOffset
            int r2 = r1 + r7
            int r2 = r2 - r0
            int r3 = r4.blockSize
            if (r2 > r3) goto L23
            int r2 = r7 - r0
            goto L25
        L23:
            int r2 = r3 - r1
        L25:
            byte[] r3 = r4.blockBuffer
            java.lang.System.arraycopy(r3, r1, r5, r6, r2)
            int r1 = r4.readOffset
            int r1 = r1 + r2
            r4.readOffset = r1
            int r0 = r0 + r2
            int r6 = r6 + r2
            goto L8
        L32:
            return r0
        L33:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "All reads must be multiple of record size (1024 bytes."
            r5.<init>(r6)
            throw r5
    }

    public byte[] readRecord() throws java.io.IOException {
            r3 = this;
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r0]
            r2 = 0
            int r0 = r3.read(r1, r2, r0)
            r2 = -1
            if (r2 == r0) goto Ld
            return r1
        Ld:
            org.apache.commons.compress.archivers.dump.ShortFileException r0 = new org.apache.commons.compress.archivers.dump.ShortFileException
            r0.<init>()
            throw r0
    }

    public void resetBlockSize(int r3, boolean r4) throws java.io.IOException {
            r2 = this;
            r2.isCompressed = r4
            r4 = 1
            if (r3 < r4) goto L3a
            r0 = 1024(0x400, float:1.435E-42)
            int r3 = r3 * r0
            r2.blockSize = r3
            if (r3 < r4) goto L23
            byte[] r4 = r2.blockBuffer
            byte[] r3 = new byte[r3]
            r2.blockBuffer = r3
            r1 = 0
            java.lang.System.arraycopy(r4, r1, r3, r1, r0)
            byte[] r3 = r2.blockBuffer
            int r4 = r2.blockSize
            int r4 = r4 - r0
            r2.readFully(r3, r0, r4)
            r2.currBlkIdx = r1
            r2.readOffset = r0
            return
        L23:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Block size cannot be less than or equal to 0: "
            r4.<init>(r0)
            int r0 = r2.blockSize
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3a:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Block with "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " records found, must be at least 1"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r11) throws java.io.IOException {
            r10 = this;
            r0 = 1024(0x400, double:5.06E-321)
            long r0 = r11 % r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L40
        La:
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L3f
            int r0 = r10.readOffset
            int r1 = r10.blockSize
            if (r0 != r1) goto L25
            long r4 = r11 - r2
            long r0 = (long) r1
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            r10.readBlock(r0)     // Catch: org.apache.commons.compress.archivers.dump.ShortFileException -> L22
            goto L25
        L22:
            r11 = -1
            return r11
        L25:
            int r0 = r10.readOffset
            long r4 = (long) r0
            long r6 = r11 - r2
            long r4 = r4 + r6
            int r1 = r10.blockSize
            long r8 = (long) r1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L33
            goto L37
        L33:
            long r4 = (long) r1
            long r6 = (long) r0
            long r6 = r4 - r6
        L37:
            int r0 = org.apache.commons.compress.utils.ExactMath.add(r0, r6)
            r10.readOffset = r0
            long r2 = r2 + r6
            goto La
        L3f:
            return r2
        L40:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "All reads must be multiple of record size (1024 bytes."
            r11.<init>(r12)
            throw r11
    }
}
