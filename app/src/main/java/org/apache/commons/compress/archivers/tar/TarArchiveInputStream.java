package org.apache.commons.compress.archivers.tar;

/* JADX INFO: loaded from: classes2.dex */
public class TarArchiveInputStream extends org.apache.commons.compress.archivers.ArchiveInputStream<org.apache.commons.compress.archivers.tar.TarArchiveEntry> {
    private static final int SMALL_BUFFER_SIZE = 256;
    private boolean atEof;
    private final int blockSize;
    private org.apache.commons.compress.archivers.tar.TarArchiveEntry currEntry;
    private int currentSparseInputStreamIndex;
    private long entryOffset;
    private long entrySize;
    private java.util.Map<java.lang.String, java.lang.String> globalPaxHeaders;
    private final java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> globalSparseHeaders;
    private final boolean lenient;
    private final byte[] recordBuffer;
    private final byte[] smallBuf;
    private java.util.List<java.io.InputStream> sparseInputStreams;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    public TarArchiveInputStream(java.io.InputStream r3) {
            r2 = this;
            r0 = 10240(0x2800, float:1.4349E-41)
            r1 = 512(0x200, float:7.17E-43)
            r2.<init>(r3, r0, r1)
            return
    }

    public TarArchiveInputStream(java.io.InputStream r2, int r3) {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            r1.<init>(r2, r3, r0)
            return
    }

    public TarArchiveInputStream(java.io.InputStream r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public TarArchiveInputStream(java.io.InputStream r7, int r8, int r9, java.lang.String r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public TarArchiveInputStream(java.io.InputStream r1, int r2, int r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r4)
            r1 = 256(0x100, float:3.59E-43)
            byte[] r1 = new byte[r1]
            r0.smallBuf = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.globalPaxHeaders = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.globalSparseHeaders = r1
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r4)
            r0.zipEncoding = r1
            byte[] r1 = new byte[r3]
            r0.recordBuffer = r1
            r0.blockSize = r2
            r0.lenient = r5
            return
    }

    public TarArchiveInputStream(java.io.InputStream r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            r1.<init>(r2, r3, r0, r4)
            return
    }

    public TarArchiveInputStream(java.io.InputStream r3, java.lang.String r4) {
            r2 = this;
            r0 = 10240(0x2800, float:1.4349E-41)
            r1 = 512(0x200, float:7.17E-43)
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public TarArchiveInputStream(java.io.InputStream r7, boolean r8) {
            r6 = this;
            r3 = 512(0x200, float:7.17E-43)
            r4 = 0
            r2 = 10240(0x2800, float:1.4349E-41)
            r0 = r6
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private void applyPaxHeadersToCurrentEntry(java.util.Map<java.lang.String, java.lang.String> r2, java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r3) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r1.currEntry
            r0.updateEntryFromPaxHeaders(r2)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r1.currEntry
            r2.setSparseHeaders(r3)
            return
    }

    private void buildSparseInputStreams() throws java.io.IOException {
            r11 = this;
            r0 = -1
            r11.currentSparseInputStreamIndex = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r11.sparseInputStreams = r0
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r11.currEntry
            java.util.List r0 = r0.getOrderedSparseHeaders()
            org.apache.commons.compress.archivers.tar.TarArchiveSparseZeroInputStream r1 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseZeroInputStream
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
            r2 = 0
            r4 = r2
        L1c:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r0.next()
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r6 = (org.apache.commons.compress.archivers.tar.TarArchiveStructSparse) r6
            long r7 = r6.getOffset()
            long r7 = r7 - r4
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L64
            if (r7 <= 0) goto L42
            java.util.List<java.io.InputStream> r7 = r11.sparseInputStreams
            org.apache.commons.compress.utils.BoundedInputStream r8 = new org.apache.commons.compress.utils.BoundedInputStream
            long r9 = r6.getOffset()
            long r9 = r9 - r4
            r8.<init>(r1, r9)
            r7.add(r8)
        L42:
            long r4 = r6.getNumbytes()
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 <= 0) goto L5a
            java.util.List<java.io.InputStream> r4 = r11.sparseInputStreams
            org.apache.commons.compress.utils.BoundedInputStream r5 = new org.apache.commons.compress.utils.BoundedInputStream
            java.io.InputStream r7 = r11.in
            long r8 = r6.getNumbytes()
            r5.<init>(r7, r8)
            r4.add(r5)
        L5a:
            long r4 = r6.getOffset()
            long r6 = r6.getNumbytes()
            long r4 = r4 + r6
            goto L1c
        L64:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted struct sparse detected"
            r0.<init>(r1)
            throw r0
        L6c:
            java.util.List<java.io.InputStream> r0 = r11.sparseInputStreams
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L77
            r0 = 0
            r11.currentSparseInputStreamIndex = r0
        L77:
            return
    }

    private void consumeRemainderOfLastBlock() throws java.io.IOException {
            r5 = this;
            long r0 = r5.getBytesRead()
            int r2 = r5.blockSize
            long r2 = (long) r2
            long r0 = r0 % r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1b
            java.io.InputStream r2 = r5.in
            int r3 = r5.blockSize
            long r3 = (long) r3
            long r3 = r3 - r0
            long r0 = org.apache.commons.compress.utils.IOUtils.skip(r2, r3)
            r5.count(r0)
        L1b:
            return
    }

    private long getActuallySkipped(long r2, long r4, long r6) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            boolean r0 = r0 instanceof java.io.FileInputStream
            if (r0 == 0) goto La
            long r4 = java.lang.Math.min(r4, r2)
        La:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto Lf
            return r4
        Lf:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r3 = "Truncated TAR archive"
            r2.<init>(r3)
            throw r2
    }

    private byte[] getRecord() throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.readRecord()
            boolean r1 = r2.isEOFRecord(r0)
            r2.setAtEOF(r1)
            boolean r1 = r2.isAtEOF()
            if (r1 == 0) goto L1a
            if (r0 == 0) goto L1a
            r2.tryToConsumeSecondEOFRecord()
            r2.consumeRemainderOfLastBlock()
            r0 = 0
        L1a:
            return r0
    }

    private boolean isDirectory() {
            r1 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r1.currEntry
            if (r0 == 0) goto Lc
            boolean r0 = r0.isDirectory()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public static boolean matches(byte[] r7, int r8) {
            r0 = 265(0x109, float:3.71E-43)
            r1 = 0
            if (r8 >= r0) goto L6
            return r1
        L6:
            java.lang.String r8 = "ustar\u0000"
            r0 = 257(0x101, float:3.6E-43)
            r2 = 6
            boolean r3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r8, r7, r0, r2)
            r4 = 1
            r5 = 2
            r6 = 263(0x107, float:3.69E-43)
            if (r3 == 0) goto L1e
            java.lang.String r3 = "00"
            boolean r3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r3, r7, r6, r5)
            if (r3 == 0) goto L1e
            return r4
        L1e:
            java.lang.String r3 = "ustar "
            boolean r3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r3, r7, r0, r2)
            if (r3 == 0) goto L37
            java.lang.String r3 = " \u0000"
            boolean r3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r3, r7, r6, r5)
            if (r3 != 0) goto L36
            java.lang.String r3 = "0\u0000"
            boolean r3 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r3, r7, r6, r5)
            if (r3 == 0) goto L37
        L36:
            return r4
        L37:
            boolean r8 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r8, r7, r0, r2)
            if (r8 == 0) goto L46
            java.lang.String r8 = "\u0000\u0000"
            boolean r7 = org.apache.commons.compress.utils.ArchiveUtils.matchAsciiBuffer(r8, r7, r6, r5)
            if (r7 == 0) goto L46
            r1 = r4
        L46:
            return r1
    }

    private void paxHeaders() throws java.io.IOException {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.globalPaxHeaders
            long r2 = r4.entrySize
            java.util.Map r1 = org.apache.commons.compress.archivers.tar.TarUtils.parsePaxHeaders(r4, r0, r1, r2)
            java.lang.String r2 = "GNU.sparse.map"
            boolean r3 = r1.containsKey(r2)
            if (r3 == 0) goto L24
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.Object r2 = r1.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            java.util.List r2 = org.apache.commons.compress.archivers.tar.TarUtils.parseFromPAX01SparseHeaders(r2)
            r0.<init>(r2)
        L24:
            r4.getNextEntry()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r4.currEntry
            if (r2 == 0) goto L49
            r4.applyPaxHeadersToCurrentEntry(r1, r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r4.currEntry
            boolean r0 = r0.isPaxGNU1XSparse()
            if (r0 == 0) goto L45
            java.io.InputStream r0 = r4.in
            int r1 = r4.getRecordSize()
            java.util.List r0 = org.apache.commons.compress.archivers.tar.TarUtils.parsePAX1XSparseHeaders(r0, r1)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r4.currEntry
            r1.setSparseHeaders(r0)
        L45:
            r4.buildSparseInputStreams()
            return
        L49:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "premature end of tar archive. Didn't find any entry after PAX header."
            r0.<init>(r1)
            throw r0
    }

    private void readGlobalPaxHeaders() throws java.io.IOException {
            r4 = this;
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r0 = r4.globalSparseHeaders
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.globalPaxHeaders
            long r2 = r4.entrySize
            java.util.Map r0 = org.apache.commons.compress.archivers.tar.TarUtils.parsePaxHeaders(r4, r0, r1, r2)
            r4.globalPaxHeaders = r0
            r4.getNextEntry()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r4.currEntry
            if (r0 == 0) goto L14
            return
        L14:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Error detected parsing the pax header"
            r0.<init>(r1)
            throw r0
    }

    private void readOldGNUSparse() throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r3.currEntry
            boolean r0 = r0.isExtended()
            if (r0 == 0) goto L2f
        L8:
            byte[] r0 = r3.getRecord()
            if (r0 == 0) goto L27
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry r1 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry
            r1.<init>(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r3.currEntry
            java.util.List r0 = r0.getSparseHeaders()
            java.util.List r2 = r1.getSparseHeaders()
            r0.addAll(r2)
            boolean r0 = r1.isExtended()
            if (r0 != 0) goto L8
            goto L2f
        L27:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "premature end of tar archive. Didn't find extended_header after header with extended flag."
            r0.<init>(r1)
            throw r0
        L2f:
            r3.buildSparseInputStreams()
            return
    }

    private int readSparse(byte[] r5, int r6, int r7) throws java.io.IOException {
            r4 = this;
            java.util.List<java.io.InputStream> r0 = r4.sparseInputStreams
            if (r0 == 0) goto L52
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L52
        Lb:
            int r0 = r4.currentSparseInputStreamIndex
            java.util.List<java.io.InputStream> r1 = r4.sparseInputStreams
            int r1 = r1.size()
            r2 = -1
            if (r0 < r1) goto L17
            return r2
        L17:
            java.util.List<java.io.InputStream> r0 = r4.sparseInputStreams
            int r1 = r4.currentSparseInputStreamIndex
            java.lang.Object r0 = r0.get(r1)
            java.io.InputStream r0 = (java.io.InputStream) r0
            int r0 = r0.read(r5, r6, r7)
            int r1 = r4.currentSparseInputStreamIndex
            java.util.List<java.io.InputStream> r3 = r4.sparseInputStreams
            int r3 = r3.size()
            int r3 = r3 + (-1)
            if (r1 != r3) goto L32
            return r0
        L32:
            if (r0 != r2) goto L3f
            int r0 = r4.currentSparseInputStreamIndex
            int r0 = r0 + 1
            r4.currentSparseInputStreamIndex = r0
            int r5 = r4.readSparse(r5, r6, r7)
            return r5
        L3f:
            if (r0 >= r7) goto L51
            int r1 = r4.currentSparseInputStreamIndex
            int r1 = r1 + 1
            r4.currentSparseInputStreamIndex = r1
            int r6 = r6 + r0
            int r7 = r7 - r0
            int r5 = r4.readSparse(r5, r6, r7)
            if (r5 != r2) goto L50
            return r0
        L50:
            int r0 = r0 + r5
        L51:
            return r0
        L52:
            java.io.InputStream r0 = r4.in
            int r5 = r0.read(r5, r6, r7)
            return r5
    }

    private void skipRecordPadding() throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.isDirectory()
            if (r0 != 0) goto L42
            long r0 = r8.entrySize
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L42
            int r4 = r8.getRecordSize()
            long r4 = (long) r4
            long r0 = r0 % r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L42
            java.io.InputStream r0 = r8.in
            int r0 = r0.available()
            long r2 = (long) r0
            long r0 = r8.entrySize
            int r4 = r8.getRecordSize()
            long r4 = (long) r4
            long r0 = r0 / r4
            r4 = 1
            long r0 = r0 + r4
            int r4 = r8.getRecordSize()
            long r4 = (long) r4
            long r0 = r0 * r4
            long r4 = r8.entrySize
            long r6 = r0 - r4
            java.io.InputStream r0 = r8.in
            long r4 = org.apache.commons.compress.utils.IOUtils.skip(r0, r6)
            r1 = r8
            long r0 = r1.getActuallySkipped(r2, r4, r6)
            r8.count(r0)
        L42:
            return
    }

    private long skipSparse(long r6) throws java.io.IOException {
            r5 = this;
            java.util.List<java.io.InputStream> r0 = r5.sparseInputStreams
            if (r0 == 0) goto L38
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto L38
        Lb:
            r0 = 0
        Ld:
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L37
            int r2 = r5.currentSparseInputStreamIndex
            java.util.List<java.io.InputStream> r3 = r5.sparseInputStreams
            int r3 = r3.size()
            if (r2 >= r3) goto L37
            java.util.List<java.io.InputStream> r2 = r5.sparseInputStreams
            int r3 = r5.currentSparseInputStreamIndex
            java.lang.Object r2 = r2.get(r3)
            java.io.InputStream r2 = (java.io.InputStream) r2
            long r3 = r6 - r0
            long r2 = r2.skip(r3)
            long r0 = r0 + r2
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto Ld
            int r2 = r5.currentSparseInputStreamIndex
            int r2 = r2 + 1
            r5.currentSparseInputStreamIndex = r2
            goto Ld
        L37:
            return r0
        L38:
            java.io.InputStream r0 = r5.in
            long r6 = r0.skip(r6)
            return r6
    }

    private void tryToConsumeSecondEOFRecord() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.in
            boolean r0 = r0.markSupported()
            if (r0 == 0) goto L11
            java.io.InputStream r1 = r4.in
            int r2 = r4.getRecordSize()
            r1.mark(r2)
        L11:
            byte[] r1 = r4.readRecord()     // Catch: java.lang.Throwable -> L2b
            boolean r1 = r4.isEOFRecord(r1)     // Catch: java.lang.Throwable -> L2b
            if (r1 != 0) goto L2a
            if (r0 == 0) goto L2a
            int r0 = r4.getRecordSize()
            long r0 = (long) r0
            r4.pushedBackBytes(r0)
            java.io.InputStream r0 = r4.in
            r0.reset()
        L2a:
            return
        L2b:
            r1 = move-exception
            if (r0 == 0) goto L3b
            int r0 = r4.getRecordSize()
            long r2 = (long) r0
            r4.pushedBackBytes(r2)
            java.io.InputStream r0 = r4.in
            r0.reset()
        L3b:
            throw r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r4 = this;
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r4.currEntry
            long r0 = r0.getRealSize()
            long r2 = r4.entryOffset
            long r0 = r0 - r2
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L1c
            r0 = 2147483647(0x7fffffff, float:NaN)
            return r0
        L1c:
            int r0 = (int) r0
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry r1) {
            r0 = this;
            boolean r1 = r1 instanceof org.apache.commons.compress.archivers.tar.TarArchiveEntry
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            java.util.List<java.io.InputStream> r0 = r2.sparseInputStreams
            if (r0 == 0) goto L18
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            java.io.InputStream r1 = (java.io.InputStream) r1
            r1.close()
            goto L8
        L18:
            java.io.InputStream r0 = r2.in
            r0.close()
            return
    }

    public org.apache.commons.compress.archivers.tar.TarArchiveEntry getCurrentEntry() {
            r1 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r1.currEntry
            return r0
    }

    protected byte[] getLongNameData() throws java.io.IOException {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L5:
            byte[] r1 = r4.smallBuf
            int r1 = r4.read(r1)
            if (r1 < 0) goto L14
            byte[] r2 = r4.smallBuf
            r3 = 0
            r0.write(r2, r3, r1)
            goto L5
        L14:
            r4.getNextEntry()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r4.currEntry
            if (r1 != 0) goto L1d
            r0 = 0
            return r0
        L1d:
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
        L22:
            if (r1 <= 0) goto L2d
            int r2 = r1 + (-1)
            r2 = r0[r2]
            if (r2 != 0) goto L2d
            int r1 = r1 + (-1)
            goto L22
        L2d:
            int r2 = r0.length
            if (r1 == r2) goto L34
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
        L34:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r1.getNextTarEntry()
            return r0
    }

    @java.lang.Deprecated
    public org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.isAtEOF()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            if (r0 == 0) goto L17
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            org.apache.commons.compress.utils.IOUtils.skip(r6, r2)
            r6.skipRecordPadding()
        L17:
            byte[] r0 = r6.getRecord()
            if (r0 != 0) goto L20
            r6.currEntry = r1
            return r1
        L20:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry     // Catch: java.lang.IllegalArgumentException -> Ld6
            java.util.Map<java.lang.String, java.lang.String> r3 = r6.globalPaxHeaders     // Catch: java.lang.IllegalArgumentException -> Ld6
            org.apache.commons.compress.archivers.zip.ZipEncoding r4 = r6.zipEncoding     // Catch: java.lang.IllegalArgumentException -> Ld6
            boolean r5 = r6.lenient     // Catch: java.lang.IllegalArgumentException -> Ld6
            r2.<init>(r3, r0, r4, r5)     // Catch: java.lang.IllegalArgumentException -> Ld6
            r6.currEntry = r2     // Catch: java.lang.IllegalArgumentException -> Ld6
            r3 = 0
            r6.entryOffset = r3
            long r2 = r2.getSize()
            r6.entrySize = r2
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            boolean r0 = r0.isGNULongLinkEntry()
            if (r0 == 0) goto L51
            byte[] r0 = r6.getLongNameData()
            if (r0 != 0) goto L46
            return r1
        L46:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r6.currEntry
            org.apache.commons.compress.archivers.zip.ZipEncoding r3 = r6.zipEncoding
            java.lang.String r0 = r3.decode(r0)
            r2.setLinkName(r0)
        L51:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            boolean r0 = r0.isGNULongNameEntry()
            if (r0 == 0) goto L91
            byte[] r0 = r6.getLongNameData()
            if (r0 != 0) goto L60
            return r1
        L60:
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = r6.zipEncoding
            java.lang.String r0 = r1.decode(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r6.currEntry
            r1.setName(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r6.currEntry
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto L91
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L91
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r6.currEntry
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setName(r0)
        L91:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            boolean r0 = r0.isGlobalPaxHeader()
            if (r0 == 0) goto L9c
            r6.readGlobalPaxHeaders()
        L9c:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry     // Catch: java.lang.NumberFormatException -> Lcd
            boolean r0 = r0.isPaxHeader()     // Catch: java.lang.NumberFormatException -> Lcd
            if (r0 == 0) goto La8
            r6.paxHeaders()     // Catch: java.lang.NumberFormatException -> Lcd
            goto Lb7
        La8:
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.globalPaxHeaders     // Catch: java.lang.NumberFormatException -> Lcd
            boolean r0 = r0.isEmpty()     // Catch: java.lang.NumberFormatException -> Lcd
            if (r0 != 0) goto Lb7
            java.util.Map<java.lang.String, java.lang.String> r0 = r6.globalPaxHeaders     // Catch: java.lang.NumberFormatException -> Lcd
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r1 = r6.globalSparseHeaders     // Catch: java.lang.NumberFormatException -> Lcd
            r6.applyPaxHeadersToCurrentEntry(r0, r1)     // Catch: java.lang.NumberFormatException -> Lcd
        Lb7:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            boolean r0 = r0.isOldGNUSparse()
            if (r0 == 0) goto Lc2
            r6.readOldGNUSparse()
        Lc2:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            long r0 = r0.getSize()
            r6.entrySize = r0
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            return r0
        Lcd:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Error detected parsing the pax header"
            r1.<init>(r2, r0)
            throw r1
        Ld6:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Error detected parsing the header"
            r1.<init>(r2, r0)
            throw r1
    }

    public int getRecordSize() {
            r1 = this;
            byte[] r0 = r1.recordBuffer
            int r0 = r0.length
            return r0
    }

    protected final boolean isAtEOF() {
            r1 = this;
            boolean r0 = r1.atEof
            return r0
    }

    protected boolean isEOFRecord(byte[] r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            int r0 = r1.getRecordSize()
            boolean r2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(r2, r0)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int r1) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            if (r9 != 0) goto L4
            r7 = 0
            return r7
        L4:
            boolean r0 = r6.isAtEOF()
            r1 = -1
            if (r0 != 0) goto L5f
            boolean r0 = r6.isDirectory()
            if (r0 == 0) goto L12
            goto L5f
        L12:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            if (r0 == 0) goto L57
            long r2 = r6.entryOffset
            long r4 = r0.getRealSize()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L21
            return r1
        L21:
            int r0 = r6.available()
            int r9 = java.lang.Math.min(r9, r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            boolean r0 = r0.isSparse()
            if (r0 == 0) goto L36
            int r7 = r6.readSparse(r7, r8, r9)
            goto L3c
        L36:
            java.io.InputStream r0 = r6.in
            int r7 = r0.read(r7, r8, r9)
        L3c:
            if (r7 != r1) goto L4d
            if (r9 > 0) goto L45
            r8 = 1
            r6.setAtEOF(r8)
            goto L56
        L45:
            java.io.IOException r7 = new java.io.IOException
            java.lang.String r8 = "Truncated TAR archive"
            r7.<init>(r8)
            throw r7
        L4d:
            r6.count(r7)
            long r8 = r6.entryOffset
            long r0 = (long) r7
            long r8 = r8 + r0
            r6.entryOffset = r8
        L56:
            return r7
        L57:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "No current tar entry"
            r7.<init>(r8)
            throw r7
        L5f:
            return r1
    }

    protected byte[] readRecord() throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            byte[] r1 = r2.recordBuffer
            int r0 = org.apache.commons.compress.utils.IOUtils.readFully(r0, r1)
            r2.count(r0)
            int r1 = r2.getRecordSize()
            if (r0 == r1) goto L13
            r0 = 0
            return r0
        L13:
            byte[] r0 = r2.recordBuffer
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            return
    }

    protected final void setAtEOF(boolean r1) {
            r0 = this;
            r0.atEof = r1
            return
    }

    protected final void setCurrentEntry(org.apache.commons.compress.archivers.tar.TarArchiveEntry r1) {
            r0 = this;
            r0.currEntry = r1
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r9) throws java.io.IOException {
            r8 = this;
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 <= 0) goto L42
            boolean r2 = r8.isDirectory()
            if (r2 == 0) goto Ld
            goto L42
        Ld:
            java.io.InputStream r0 = r8.in
            int r0 = r0.available()
            long r2 = (long) r0
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r8.currEntry
            long r0 = r0.getRealSize()
            long r4 = r8.entryOffset
            long r0 = r0 - r4
            long r6 = java.lang.Math.min(r9, r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r9 = r8.currEntry
            boolean r9 = r9.isSparse()
            if (r9 != 0) goto L35
            java.io.InputStream r9 = r8.in
            long r4 = org.apache.commons.compress.utils.IOUtils.skip(r9, r6)
            r1 = r8
            long r9 = r1.getActuallySkipped(r2, r4, r6)
            goto L39
        L35:
            long r9 = r8.skipSparse(r6)
        L39:
            r8.count(r9)
            long r0 = r8.entryOffset
            long r0 = r0 + r9
            r8.entryOffset = r0
            return r9
        L42:
            return r0
    }
}
