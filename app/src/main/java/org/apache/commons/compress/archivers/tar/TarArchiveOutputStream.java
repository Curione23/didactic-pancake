package org.apache.commons.compress.archivers.tar;

/* JADX INFO: loaded from: classes2.dex */
public class TarArchiveOutputStream extends org.apache.commons.compress.archivers.ArchiveOutputStream<org.apache.commons.compress.archivers.tar.TarArchiveEntry> {
    private static final org.apache.commons.compress.archivers.zip.ZipEncoding ASCII = null;
    public static final int BIGNUMBER_ERROR = 0;
    public static final int BIGNUMBER_POSIX = 2;
    public static final int BIGNUMBER_STAR = 1;
    private static final int BLOCK_SIZE_UNSPECIFIED = -511;
    public static final int LONGFILE_ERROR = 0;
    public static final int LONGFILE_GNU = 2;
    public static final int LONGFILE_POSIX = 3;
    public static final int LONGFILE_TRUNCATE = 1;
    private static final int RECORD_SIZE = 512;
    private boolean addPaxHeadersForNonAsciiNames;
    private int bigNumberMode;
    final java.lang.String charsetName;
    private final org.apache.commons.io.output.CountingOutputStream countingOut;
    private long currBytes;
    private java.lang.String currName;
    private long currSize;
    private boolean haveUnclosedEntry;
    private int longFileMode;
    private final byte[] recordBuf;
    private final int recordsPerBlock;
    private long recordsWritten;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.ASCII = r0
            return
    }

    public TarArchiveOutputStream(java.io.OutputStream r2) {
            r1 = this;
            r0 = -511(0xfffffffffffffe01, float:NaN)
            r1.<init>(r2, r0)
            return
    }

    public TarArchiveOutputStream(java.io.OutputStream r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public TarArchiveOutputStream(java.io.OutputStream r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    @java.lang.Deprecated
    public TarArchiveOutputStream(java.io.OutputStream r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            r1 = 512(0x200, float:7.17E-43)
            if (r3 != r1) goto L8
            return
        L8:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Tar record size must always be 512 bytes. Attempt to set size of "
            r2.<init>(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public TarArchiveOutputStream(java.io.OutputStream r4, int r5, java.lang.String r6) {
            r3 = this;
            r3.<init>(r4)
            r0 = 0
            r3.longFileMode = r0
            r3.bigNumberMode = r0
            r0 = -511(0xfffffffffffffe01, float:NaN)
            r1 = 512(0x200, float:7.17E-43)
            if (r0 != r5) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r5
        L11:
            if (r0 <= 0) goto L3d
            int r2 = r0 % 512
            if (r2 != 0) goto L3d
            org.apache.commons.compress.utils.FixedLengthBlockOutputStream r5 = new org.apache.commons.compress.utils.FixedLengthBlockOutputStream
            org.apache.commons.io.output.CountingOutputStream r2 = new org.apache.commons.io.output.CountingOutputStream
            r2.<init>(r4)
            r3.countingOut = r2
            r5.<init>(r2, r1)
            r3.out = r5
            java.nio.charset.Charset r4 = org.apache.commons.io.Charsets.toCharset(r6)
            java.lang.String r4 = r4.name()
            r3.charsetName = r4
            org.apache.commons.compress.archivers.zip.ZipEncoding r4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r6)
            r3.zipEncoding = r4
            byte[] r4 = new byte[r1]
            r3.recordBuf = r4
            int r0 = r0 / r1
            r3.recordsPerBlock = r0
            return
        L3d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Block size must be a multiple of 512 bytes. Attempt to use set size of "
            r6.<init>(r0)
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public TarArchiveOutputStream(java.io.OutputStream r2, java.lang.String r3) {
            r1 = this;
            r0 = -511(0xfffffffffffffe01, float:NaN)
            r1.<init>(r2, r0, r3)
            return
    }

    private void addFileTimePaxHeader(java.util.Map<java.lang.String, java.lang.String> r7, java.lang.String r8, java.nio.file.attribute.FileTime r9) {
            r6 = this;
            if (r9 == 0) goto L1e
            java.time.Instant r9 = r9.toInstant()
            long r3 = r9.getEpochSecond()
            int r5 = r9.getNano()
            if (r5 != 0) goto L18
            java.lang.String r9 = java.lang.String.valueOf(r3)
            r7.put(r8, r9)
            goto L1e
        L18:
            r0 = r6
            r1 = r7
            r2 = r8
            r0.addInstantPaxHeader(r1, r2, r3, r5)
        L1e:
            return
    }

    private void addFileTimePaxHeaderForBigNumber(java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9, java.nio.file.attribute.FileTime r10, long r11) {
            r7 = this;
            if (r10 == 0) goto L1e
            java.time.Instant r10 = r10.toInstant()
            long r3 = r10.getEpochSecond()
            int r5 = r10.getNano()
            if (r5 != 0) goto L18
            r0 = r7
            r1 = r8
            r2 = r9
            r5 = r11
            r0.addPaxHeaderForBigNumber(r1, r2, r3, r5)
            goto L1e
        L18:
            r0 = r7
            r1 = r8
            r2 = r9
            r0.addInstantPaxHeader(r1, r2, r3, r5)
        L1e:
            return
    }

    private void addInstantPaxHeader(java.util.Map<java.lang.String, java.lang.String> r2, java.lang.String r3, long r4, int r6) {
            r1 = this;
            java.math.BigDecimal r4 = java.math.BigDecimal.valueOf(r4)
            long r5 = (long) r6
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r5)
            r6 = 9
            java.math.BigDecimal r5 = r5.movePointLeft(r6)
            r6 = 7
            java.math.RoundingMode r0 = java.math.RoundingMode.DOWN
            java.math.BigDecimal r5 = r5.setScale(r6, r0)
            java.math.BigDecimal r4 = r4.add(r5)
            java.lang.String r4 = r4.toPlainString()
            r2.put(r3, r4)
            return
    }

    private void addPaxHeaderForBigNumber(java.util.Map<java.lang.String, java.lang.String> r3, java.lang.String r4, long r5, long r7) {
            r2 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto La
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 <= 0) goto L11
        La:
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r3.put(r4, r5)
        L11:
            return
    }

    private void addPaxHeadersForBigNumbers(java.util.Map<java.lang.String, java.lang.String> r8, org.apache.commons.compress.archivers.tar.TarArchiveEntry r9) {
            r7 = this;
            long r3 = r9.getSize()
            r5 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            java.lang.String r2 = "size"
            r0 = r7
            r1 = r8
            r0.addPaxHeaderForBigNumber(r1, r2, r3, r5)
            long r3 = r9.getLongGroupId()
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            java.lang.String r2 = "gid"
            r0.addPaxHeaderForBigNumber(r1, r2, r3, r5)
            java.nio.file.attribute.FileTime r3 = r9.getLastModifiedTime()
            r4 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            java.lang.String r2 = "mtime"
            r0.addFileTimePaxHeaderForBigNumber(r1, r2, r3, r4)
            java.lang.String r0 = "atime"
            java.nio.file.attribute.FileTime r1 = r9.getLastAccessTime()
            r7.addFileTimePaxHeader(r8, r0, r1)
            java.nio.file.attribute.FileTime r0 = r9.getStatusChangeTime()
            java.lang.String r1 = "ctime"
            if (r0 == 0) goto L43
            java.nio.file.attribute.FileTime r0 = r9.getStatusChangeTime()
            r7.addFileTimePaxHeader(r8, r1, r0)
            goto L4a
        L43:
            java.nio.file.attribute.FileTime r0 = r9.getCreationTime()
            r7.addFileTimePaxHeader(r8, r1, r0)
        L4a:
            long r3 = r9.getLongUserId()
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            java.lang.String r2 = "uid"
            r0 = r7
            r1 = r8
            r0.addPaxHeaderForBigNumber(r1, r2, r3, r5)
            java.lang.String r0 = "LIBARCHIVE.creationtime"
            java.nio.file.attribute.FileTime r1 = r9.getCreationTime()
            r7.addFileTimePaxHeader(r8, r0, r1)
            int r0 = r9.getDevMajor()
            long r3 = (long) r0
            java.lang.String r2 = "SCHILY.devmajor"
            r0 = r7
            r1 = r8
            r0.addPaxHeaderForBigNumber(r1, r2, r3, r5)
            int r0 = r9.getDevMinor()
            long r3 = (long) r0
            java.lang.String r2 = "SCHILY.devminor"
            r0 = r7
            r0.addPaxHeaderForBigNumber(r1, r2, r3, r5)
            int r0 = r9.getMode()
            long r2 = (long) r0
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            java.lang.String r1 = "mode"
            r0 = r7
            r0.failForBigNumber(r1, r2, r4)
            return
    }

    private byte[] encodeExtendedPaxHeadersContents(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            org.apache.commons.compress.archivers.tar.TarArchiveOutputStream$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.archivers.tar.TarArchiveOutputStream$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r3.forEach(r1)
            java.lang.String r3 = r0.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r3 = r3.getBytes(r0)
            return r3
    }

    private void failForBigNumber(java.lang.String r8, long r9, long r11) {
            r7 = this;
            java.lang.String r6 = ""
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r0.failForBigNumber(r1, r2, r4, r6)
            return
    }

    private void failForBigNumber(java.lang.String r3, long r4, long r6, java.lang.String r8) {
            r2 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 > 0) goto Lb
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " '"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = "' is too big ( > "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = " )."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r8)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private void failForBigNumberWithPosixMessage(java.lang.String r8, long r9, long r11) {
            r7 = this;
            java.lang.String r6 = " Use STAR or POSIX extensions to overcome this limit"
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            r0.failForBigNumber(r1, r2, r4, r6)
            return
    }

    private void failForBigNumbers(org.apache.commons.compress.archivers.tar.TarArchiveEntry r14) {
            r13 = this;
            long r2 = r14.getSize()
            r4 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            java.lang.String r1 = "entry size"
            r0 = r13
            r0.failForBigNumber(r1, r2, r4)
            long r8 = r14.getLongGroupId()
            r10 = 2097151(0x1fffff, double:1.0361303E-317)
            java.lang.String r7 = "group id"
            r6 = r13
            r6.failForBigNumberWithPosixMessage(r7, r8, r10)
            java.nio.file.attribute.FileTime r0 = r14.getLastModifiedTime()
            long r3 = org.apache.commons.compress.utils.TimeUtils.toUnixTime(r0)
            r5 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            java.lang.String r2 = "last modification time"
            r1 = r13
            r1.failForBigNumber(r2, r3, r5)
            long r9 = r14.getLongUserId()
            r11 = 2097151(0x1fffff, double:1.0361303E-317)
            java.lang.String r8 = "user id"
            r7 = r13
            r7.failForBigNumber(r8, r9, r11)
            int r0 = r14.getMode()
            long r3 = (long) r0
            r5 = 2097151(0x1fffff, double:1.0361303E-317)
            java.lang.String r2 = "mode"
            r1.failForBigNumber(r2, r3, r5)
            int r0 = r14.getDevMajor()
            long r3 = (long) r0
            java.lang.String r2 = "major device number"
            r1.failForBigNumber(r2, r3, r5)
            int r14 = r14.getDevMinor()
            long r2 = (long) r14
            r4 = 2097151(0x1fffff, double:1.0361303E-317)
            java.lang.String r1 = "minor device number"
            r0 = r13
            r0.failForBigNumber(r1, r2, r4)
            return
    }

    private boolean handleLongName(org.apache.commons.compress.archivers.tar.TarArchiveEntry r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9, java.lang.String r10, byte r11, java.lang.String r12) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r6.zipEncoding
            java.nio.ByteBuffer r0 = r0.encode(r8)
            int r1 = r0.limit()
            int r2 = r0.position()
            int r1 = r1 - r2
            r2 = 100
            r3 = 0
            if (r1 < r2) goto L6d
            int r2 = r6.longFileMode
            r4 = 3
            r5 = 1
            if (r2 != r4) goto L1e
            r9.put(r10, r8)
            return r5
        L1e:
            r9 = 2
            if (r2 != r9) goto L47
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r8 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry
            java.lang.String r9 = "././@LongLink"
            r8.<init>(r9, r11)
            long r9 = (long) r1
            r11 = 1
            long r9 = r9 + r11
            r8.setSize(r9)
            r6.transferModTime(r7, r8)
            r6.putArchiveEntry(r8)
            byte[] r7 = r0.array()
            int r8 = r0.arrayOffset()
            r6.write(r7, r8, r1)
            r6.write(r3)
            r6.closeArchiveEntry()
            goto L6d
        L47:
            if (r2 != r5) goto L4a
            goto L6d
        L4a:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.StringBuilder r9 = r9.append(r12)
            java.lang.String r10 = " '"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r9 = "' is too long ( > 100 bytes)"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L6d:
            return r3
    }

    static /* synthetic */ void lambda$encodeExtendedPaxHeadersContents$0(java.io.StringWriter r7, java.lang.String r8, java.lang.String r9) {
            int r0 = r8.length()
            int r1 = r9.length()
            int r0 = r0 + r1
            int r0 = r0 + 5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r3 = "="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r4 = "\n"
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r1.getBytes(r5)
            int r5 = r5.length
        L39:
            if (r0 == r5) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r1.getBytes(r0)
            int r0 = r0.length
            r6 = r5
            r5 = r0
            r0 = r6
            goto L39
        L67:
            r7.write(r1)
            return
    }

    private void padAsNeeded() throws java.io.IOException {
            r4 = this;
            long r0 = r4.recordsWritten
            int r2 = r4.recordsPerBlock
            long r2 = (long) r2
            long r0 = r0 % r2
            int r0 = java.lang.Math.toIntExact(r0)
            if (r0 == 0) goto L16
        Lc:
            int r1 = r4.recordsPerBlock
            if (r0 >= r1) goto L16
            r4.writeEOFRecord()
            int r0 = r0 + 1
            goto Lc
        L16:
            return
    }

    private boolean shouldBeReplaced(char r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            r0 = 47
            if (r2 == r0) goto Ld
            r0 = 92
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }

    private java.lang.String stripTo7Bits(java.lang.String r6) {
            r5 = this;
            int r0 = r6.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r2 = 0
        La:
            if (r2 >= r0) goto L25
            char r3 = r6.charAt(r2)
            r3 = r3 & 127(0x7f, float:1.78E-43)
            char r3 = (char) r3
            boolean r4 = r5.shouldBeReplaced(r3)
            if (r4 == 0) goto L1f
            java.lang.String r3 = "_"
            r1.append(r3)
            goto L22
        L1f:
            r1.append(r3)
        L22:
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r6 = r1.toString()
            return r6
    }

    private void transferModTime(org.apache.commons.compress.archivers.tar.TarArchiveEntry r7, org.apache.commons.compress.archivers.tar.TarArchiveEntry r8) {
            r6 = this;
            java.nio.file.attribute.FileTime r7 = r7.getLastModifiedTime()
            long r0 = org.apache.commons.compress.utils.TimeUtils.toUnixTime(r7)
            r2 = 0
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L17
            r4 = 8589934591(0x1ffffffff, double:4.2439915814E-314)
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 <= 0) goto L18
        L17:
            r0 = r2
        L18:
            java.nio.file.attribute.FileTime r7 = org.apache.commons.io.file.attribute.FileTimes.fromUnixTime(r0)
            r8.setLastModifiedTime(r7)
            return
    }

    private void writeEOFRecord() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.recordBuf
            r1 = 0
            byte[] r0 = org.apache.commons.lang3.ArrayFill.fill(r0, r1)
            r2.writeRecord(r0)
            return
    }

    private void writeRecord(byte[] r5) throws java.io.IOException {
            r4 = this;
            int r0 = r5.length
            r1 = 512(0x200, float:7.17E-43)
            if (r0 != r1) goto L12
            java.io.OutputStream r0 = r4.out
            r0.write(r5)
            long r0 = r4.recordsWritten
            r2 = 1
            long r0 = r0 + r2
            r4.recordsWritten = r0
            return
        L12:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Record to write has length '"
            r1.<init>(r2)
            int r5 = r5.length
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = "' which is not the record size of '512'"
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.isFinished()     // Catch: java.lang.Throwable -> L13
            if (r0 != 0) goto L9
            r2.finish()     // Catch: java.lang.Throwable -> L13
        L9:
            boolean r0 = r2.isClosed()
            if (r0 != 0) goto L12
            super.close()
        L12:
            return
        L13:
            r0 = move-exception
            boolean r1 = r2.isClosed()
            if (r1 != 0) goto L1d
            super.close()
        L1d:
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws java.io.IOException {
            r8 = this;
            r8.checkFinished()
            boolean r0 = r8.haveUnclosedEntry
            if (r0 == 0) goto L64
            java.io.OutputStream r0 = r8.out
            org.apache.commons.compress.utils.FixedLengthBlockOutputStream r0 = (org.apache.commons.compress.utils.FixedLengthBlockOutputStream) r0
            r0.flushBlock()
            long r0 = r8.currBytes
            long r2 = r8.currSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L2f
            long r0 = r8.recordsWritten
            r4 = 512(0x200, double:2.53E-321)
            long r6 = r2 / r4
            long r0 = r0 + r6
            r8.recordsWritten = r0
            r6 = 0
            long r2 = r2 % r4
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 == 0) goto L2b
            r2 = 1
            long r0 = r0 + r2
            r8.recordsWritten = r0
        L2b:
            r0 = 0
            r8.haveUnclosedEntry = r0
            return
        L2f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Entry '"
            r1.<init>(r2)
            java.lang.String r2 = r8.currName
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' closed at '"
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r8.currBytes
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' before the '"
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r8.currSize
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "' bytes specified in the header were written"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L64:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No current entry to close"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.io.File r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r0.createArchiveEntry(r1, r2)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption[] r3) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r0.createArchiveEntry(r1, r2, r3)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.tar.TarArchiveEntry createArchiveEntry(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r1.checkFinished()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry
            r0.<init>(r2, r3)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.tar.TarArchiveEntry createArchiveEntry(java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r1 = this;
            r1.checkFinished()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws java.io.IOException {
            r2 = this;
            r2.checkFinished()
            boolean r0 = r2.haveUnclosedEntry
            if (r0 != 0) goto L19
            r2.writeEOFRecord()
            r2.writeEOFRecord()
            r2.padAsNeeded()
            java.io.OutputStream r0 = r2.out
            r0.flush()
            super.finish()
            return
        L19:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "This archive contains unclosed entries."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public long getBytesWritten() {
            r2 = this;
            org.apache.commons.io.output.CountingOutputStream r0 = r2.countingOut
            long r0 = r0.getByteCount()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    @java.lang.Deprecated
    public int getCount() {
            r2 = this;
            long r0 = r2.getBytesWritten()
            int r0 = (int) r0
            return r0
    }

    @java.lang.Deprecated
    public int getRecordSize() {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ void putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = (org.apache.commons.compress.archivers.tar.TarArchiveEntry) r1
            r0.putArchiveEntry(r1)
            return
    }

    public void putArchiveEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry r18) throws java.io.IOException {
            r17 = this;
            r7 = r17
            r8 = r18
            r17.checkFinished()
            boolean r0 = r18.isGlobalPaxHeader()
            r9 = 0
            r12 = 1
            if (r0 == 0) goto L42
            java.util.Map r0 = r18.getExtraPaxHeaders()
            byte[] r0 = r7.encodeExtendedPaxHeadersContents(r0)
            int r1 = r0.length
            long r1 = (long) r1
            r8.setSize(r1)
            byte[] r1 = r7.recordBuf
            org.apache.commons.compress.archivers.zip.ZipEncoding r2 = r7.zipEncoding
            int r3 = r7.bigNumberMode
            if (r3 != r12) goto L27
            r11 = r12
            goto L28
        L27:
            r11 = 0
        L28:
            r8.writeEntryHeader(r1, r2, r11)
            byte[] r1 = r7.recordBuf
            r7.writeRecord(r1)
            long r1 = r18.getSize()
            r7.currSize = r1
            r7.currBytes = r9
            r7.haveUnclosedEntry = r12
            r7.write(r0)
            r17.closeArchiveEntry()
            goto Lf8
        L42:
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.lang.String r14 = r18.getName()
            r5 = 76
            java.lang.String r6 = "file name"
            java.lang.String r4 = "path"
            r0 = r17
            r1 = r18
            r2 = r14
            r3 = r13
            boolean r15 = r0.handleLongName(r1, r2, r3, r4, r5, r6)
            java.lang.String r6 = r18.getLinkName()
            if (r6 == 0) goto L7e
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L7e
            r5 = 75
            java.lang.String r16 = "link name"
            java.lang.String r4 = "linkpath"
            r0 = r17
            r1 = r18
            r2 = r6
            r3 = r13
            r11 = r6
            r6 = r16
            boolean r0 = r0.handleLongName(r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L7f
            r0 = r12
            goto L80
        L7e:
            r11 = r6
        L7f:
            r0 = 0
        L80:
            int r1 = r7.bigNumberMode
            r2 = 2
            if (r1 != r2) goto L89
            r7.addPaxHeadersForBigNumbers(r13, r8)
            goto L8e
        L89:
            if (r1 == r12) goto L8e
            r17.failForBigNumbers(r18)
        L8e:
            boolean r1 = r7.addPaxHeadersForNonAsciiNames
            if (r1 == 0) goto La1
            if (r15 != 0) goto La1
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.ASCII
            boolean r1 = r1.canEncode(r14)
            if (r1 != 0) goto La1
            java.lang.String r1 = "path"
            r13.put(r1, r14)
        La1:
            boolean r1 = r7.addPaxHeadersForNonAsciiNames
            if (r1 == 0) goto Lc0
            if (r0 != 0) goto Lc0
            boolean r0 = r18.isLink()
            if (r0 != 0) goto Lb3
            boolean r0 = r18.isSymbolicLink()
            if (r0 == 0) goto Lc0
        Lb3:
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = org.apache.commons.compress.archivers.tar.TarArchiveOutputStream.ASCII
            boolean r0 = r0.canEncode(r11)
            if (r0 != 0) goto Lc0
            java.lang.String r0 = "linkpath"
            r13.put(r0, r11)
        Lc0:
            java.util.Map r0 = r18.getExtraPaxHeaders()
            r13.putAll(r0)
            boolean r0 = r13.isEmpty()
            if (r0 != 0) goto Ld0
            r7.writePaxHeaders(r8, r14, r13)
        Ld0:
            byte[] r0 = r7.recordBuf
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = r7.zipEncoding
            int r2 = r7.bigNumberMode
            if (r2 != r12) goto Lda
            r11 = r12
            goto Ldb
        Lda:
            r11 = 0
        Ldb:
            r8.writeEntryHeader(r0, r1, r11)
            byte[] r0 = r7.recordBuf
            r7.writeRecord(r0)
            r7.currBytes = r9
            boolean r0 = r18.isDirectory()
            if (r0 == 0) goto Lee
            r7.currSize = r9
            goto Lf4
        Lee:
            long r0 = r18.getSize()
            r7.currSize = r0
        Lf4:
            r7.currName = r14
            r7.haveUnclosedEntry = r12
        Lf8:
            return
    }

    public void setAddPaxHeadersForNonAsciiNames(boolean r1) {
            r0 = this;
            r0.addPaxHeadersForNonAsciiNames = r1
            return
    }

    public void setBigNumberMode(int r1) {
            r0 = this;
            r0.bigNumberMode = r1
            return
    }

    public void setLongFileMode(int r1) {
            r0 = this;
            r0.longFileMode = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.haveUnclosedEntry
            if (r0 == 0) goto L4c
            long r0 = r6.currBytes
            long r2 = (long) r9
            long r0 = r0 + r2
            long r4 = r6.currSize
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 > 0) goto L19
            java.io.OutputStream r0 = r6.out
            r0.write(r7, r8, r9)
            long r7 = r6.currBytes
            long r7 = r7 + r2
            r6.currBytes = r7
            return
        L19:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Request to write '"
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "' bytes exceeds size in header of '"
            java.lang.StringBuilder r8 = r8.append(r9)
            long r0 = r6.currSize
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r9 = "' bytes for entry '"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = r6.currName
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = "'"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L4c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "No current tar entry"
            r7.<init>(r8)
            throw r7
    }

    void writePaxHeaders(org.apache.commons.compress.archivers.tar.TarArchiveEntry r3, java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "./PaxHeaders.X/"
            r0.<init>(r1)
            java.lang.String r4 = r2.stripTo7Bits(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            int r0 = r4.length()
            r1 = 100
            if (r0 < r1) goto L22
            r0 = 0
            r1 = 99
            java.lang.String r4 = r4.substring(r0, r1)
        L22:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry
            r1 = 120(0x78, float:1.68E-43)
            r0.<init>(r4, r1)
            r2.transferModTime(r3, r0)
            byte[] r3 = r2.encodeExtendedPaxHeadersContents(r5)
            int r4 = r3.length
            long r4 = (long) r4
            r0.setSize(r4)
            r2.putArchiveEntry(r0)
            r2.write(r3)
            r2.closeArchiveEntry()
            return
    }
}
