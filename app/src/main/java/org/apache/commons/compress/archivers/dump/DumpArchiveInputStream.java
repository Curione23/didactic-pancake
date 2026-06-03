package org.apache.commons.compress.archivers.dump;

/* JADX INFO: loaded from: classes2.dex */
public class DumpArchiveInputStream extends org.apache.commons.compress.archivers.ArchiveInputStream<org.apache.commons.compress.archivers.dump.DumpArchiveEntry> {
    private static final java.lang.String CURRENT_PATH_SEGMENT = ".";
    private static final java.lang.String PARENT_PATH_SEGMENT = "..";
    private org.apache.commons.compress.archivers.dump.DumpArchiveEntry active;
    private byte[] blockBuffer;
    private long entryOffset;
    private long entrySize;
    private long filepos;
    private boolean hasHitEOF;
    private boolean isClosed;
    private final java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.Dirent> names;
    private final java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.DumpArchiveEntry> pending;
    private final java.util.Queue<org.apache.commons.compress.archivers.dump.DumpArchiveEntry> queue;
    protected org.apache.commons.compress.archivers.dump.TapeInputStream raw;
    private final byte[] readBuf;
    private int readIdx;
    private int recordOffset;
    private final org.apache.commons.compress.archivers.dump.DumpArchiveSummary summary;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    public DumpArchiveInputStream(java.io.InputStream r2) throws org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DumpArchiveInputStream(java.io.InputStream r4, java.lang.String r5) throws org.apache.commons.compress.archivers.ArchiveException {
            r3 = this;
            r3.<init>(r4, r5)
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]
            r3.readBuf = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r3.names = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r3.pending = r1
            org.apache.commons.compress.archivers.dump.TapeInputStream r1 = new org.apache.commons.compress.archivers.dump.TapeInputStream
            r1.<init>(r4)
            r3.raw = r1
            r4 = 0
            r3.hasHitEOF = r4
            org.apache.commons.compress.archivers.zip.ZipEncoding r4 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r5)
            r3.zipEncoding = r4
            org.apache.commons.compress.archivers.dump.TapeInputStream r5 = r3.raw     // Catch: java.io.IOException -> L78
            byte[] r5 = r5.readRecord()     // Catch: java.io.IOException -> L78
            boolean r1 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r5)     // Catch: java.io.IOException -> L78
            if (r1 == 0) goto L72
            org.apache.commons.compress.archivers.dump.DumpArchiveSummary r1 = new org.apache.commons.compress.archivers.dump.DumpArchiveSummary     // Catch: java.io.IOException -> L78
            r1.<init>(r5, r4)     // Catch: java.io.IOException -> L78
            r3.summary = r1     // Catch: java.io.IOException -> L78
            org.apache.commons.compress.archivers.dump.TapeInputStream r4 = r3.raw     // Catch: java.io.IOException -> L78
            int r5 = r1.getNTRec()     // Catch: java.io.IOException -> L78
            boolean r1 = r1.isCompressed()     // Catch: java.io.IOException -> L78
            r4.resetBlockSize(r5, r1)     // Catch: java.io.IOException -> L78
            r4 = 4096(0x1000, float:5.74E-42)
            byte[] r4 = new byte[r4]     // Catch: java.io.IOException -> L78
            r3.blockBuffer = r4     // Catch: java.io.IOException -> L78
            r3.readCLRI()     // Catch: java.io.IOException -> L78
            r3.readBITS()     // Catch: java.io.IOException -> L78
            org.apache.commons.compress.archivers.dump.Dirent r4 = new org.apache.commons.compress.archivers.dump.Dirent
            r5 = 4
            java.lang.String r1 = "."
            r2 = 2
            r4.<init>(r2, r2, r5, r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r0.put(r5, r4)
            java.util.PriorityQueue r4 = new java.util.PriorityQueue
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda0 r5 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda0
            r5.<init>()
            r0 = 10
            r4.<init>(r0, r5)
            r3.queue = r4
            return
        L72:
            org.apache.commons.compress.archivers.dump.UnrecognizedFormatException r4 = new org.apache.commons.compress.archivers.dump.UnrecognizedFormatException     // Catch: java.io.IOException -> L78
            r4.<init>()     // Catch: java.io.IOException -> L78
            throw r4     // Catch: java.io.IOException -> L78
        L78:
            r4 = move-exception
            org.apache.commons.compress.archivers.ArchiveException r5 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.String r0 = r4.getMessage()
            r5.<init>(r0, r4)
            throw r5
    }

    private java.lang.String getPath(org.apache.commons.compress.archivers.dump.DumpArchiveEntry r6) throws org.apache.commons.compress.archivers.dump.DumpArchiveException {
            r5 = this;
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            java.util.BitSet r1 = new java.util.BitSet
            r1.<init>()
            int r2 = r6.getIno()
        Le:
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.Dirent> r3 = r5.names
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.containsKey(r4)
            if (r3 != 0) goto L1e
            r0.clear()
            goto L44
        L1e:
            boolean r3 = r1.get(r2)
            if (r3 != 0) goto L83
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.Dirent> r3 = r5.names
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r3 = r3.get(r4)
            org.apache.commons.compress.archivers.dump.Dirent r3 = (org.apache.commons.compress.archivers.dump.Dirent) r3
            r1.set(r2)
            java.lang.String r2 = r3.getName()
            r0.push(r2)
            int r2 = r3.getIno()
            int r4 = r3.getParentIno()
            if (r2 != r4) goto L7e
        L44:
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L59
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r0 = r5.pending
            int r1 = r6.getIno()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r1, r6)
            r6 = 0
            return r6
        L59:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.Object r1 = r0.pop()
            java.lang.String r1 = (java.lang.String) r1
            r6.<init>(r1)
        L64:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L79
            r1 = 47
            r6.append(r1)
            java.lang.Object r1 = r0.pop()
            java.lang.String r1 = (java.lang.String) r1
            r6.append(r1)
            goto L64
        L79:
            java.lang.String r6 = r6.toString()
            return r6
        L7e:
            int r2 = r3.getParentIno()
            goto Le
        L83:
            org.apache.commons.compress.archivers.dump.DumpArchiveException r6 = new org.apache.commons.compress.archivers.dump.DumpArchiveException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Duplicate node "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    static /* synthetic */ int lambda$new$0(org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1, org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2) {
            java.lang.String r0 = r1.getOriginalName()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r2.getOriginalName()
            if (r0 != 0) goto Ld
            goto L1a
        Ld:
            java.lang.String r1 = r1.getOriginalName()
            java.lang.String r2 = r2.getOriginalName()
            int r1 = r1.compareTo(r2)
            return r1
        L1a:
            r1 = 2147483647(0x7fffffff, float:NaN)
            return r1
    }

    public static boolean matches(byte[] r2, int r3) {
            r0 = 32
            r1 = 0
            if (r3 >= r0) goto L6
            return r1
        L6:
            r0 = 1024(0x400, float:1.435E-42)
            if (r3 < r0) goto Lf
            boolean r2 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r2)
            return r2
        Lf:
            r3 = 24
            int r2 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(r2, r3)
            r3 = 60012(0xea6c, float:8.4095E-41)
            if (r3 != r2) goto L1b
            r1 = 1
        L1b:
            return r1
    }

    private void readBITS() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.archivers.dump.TapeInputStream r0 = r5.raw
            byte[] r0 = r0.readRecord()
            boolean r1 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r0)
            if (r1 == 0) goto L47
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(r0)
            r5.active = r0
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.BITS
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1 = r5.active
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r1 = r1.getHeaderType()
            if (r0 != r1) goto L41
            org.apache.commons.compress.archivers.dump.TapeInputStream r0 = r5.raw
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1 = r5.active
            int r1 = r1.getHeaderCount()
            long r1 = (long) r1
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 * r3
            long r0 = r0.skip(r1)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r0 = r5.active
            int r0 = r0.getHeaderCount()
            r5.readIdx = r0
            return
        L3b:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L41:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r0 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r0.<init>()
            throw r0
        L47:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r0 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r0.<init>()
            throw r0
    }

    private void readCLRI() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.archivers.dump.TapeInputStream r0 = r5.raw
            byte[] r0 = r0.readRecord()
            boolean r1 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r0)
            if (r1 == 0) goto L47
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r0 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(r0)
            r5.active = r0
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r0 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.CLRI
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1 = r5.active
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r1 = r1.getHeaderType()
            if (r0 != r1) goto L41
            org.apache.commons.compress.archivers.dump.TapeInputStream r0 = r5.raw
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1 = r5.active
            int r1 = r1.getHeaderCount()
            long r1 = (long) r1
            r3 = 1024(0x400, double:5.06E-321)
            long r1 = r1 * r3
            long r0 = r0.skip(r1)
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r0 = r5.active
            int r0 = r0.getHeaderCount()
            r5.readIdx = r0
            return
        L3b:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L41:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r0 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r0.<init>()
            throw r0
        L47:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r0 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r0.<init>()
            throw r0
    }

    private void readDirectoryEntry(org.apache.commons.compress.archivers.dump.DumpArchiveEntry r13) throws java.io.IOException {
            r12 = this;
            long r0 = r13.getEntrySize()
            r2 = 1
        L5:
            if (r2 != 0) goto L11
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r3 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r4 = r13.getHeaderType()
            if (r3 != r4) goto L10
            goto L11
        L10:
            return
        L11:
            if (r2 != 0) goto L18
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r12.raw
            r2.readRecord()
        L18:
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.Dirent> r2 = r12.names
            int r3 = r13.getIno()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r2 = r2.containsKey(r3)
            if (r2 != 0) goto L3d
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r2 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.INODE
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r3 = r13.getHeaderType()
            if (r2 != r3) goto L3d
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r2 = r12.pending
            int r3 = r13.getIno()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.put(r3, r13)
        L3d:
            int r2 = r13.getHeaderCount()
            int r2 = r2 * 1024
            byte[] r3 = r12.blockBuffer
            int r4 = r3.length
            r5 = 0
            if (r4 >= r2) goto L5b
            org.apache.commons.compress.archivers.dump.TapeInputStream r3 = r12.raw
            byte[] r3 = org.apache.commons.compress.utils.IOUtils.readRange(r3, r2)
            r12.blockBuffer = r3
            int r3 = r3.length
            if (r3 != r2) goto L55
            goto L63
        L55:
            java.io.EOFException r13 = new java.io.EOFException
            r13.<init>()
            throw r13
        L5b:
            org.apache.commons.compress.archivers.dump.TapeInputStream r4 = r12.raw
            int r3 = r4.read(r3, r5, r2)
            if (r3 != r2) goto L125
        L63:
            r3 = r5
        L64:
            int r4 = r2 + (-8)
            if (r3 >= r4) goto L109
            long r6 = (long) r3
            r8 = 8
            long r8 = r0 - r8
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 >= 0) goto L109
            byte[] r4 = r12.blockBuffer
            int r4 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert32(r4, r3)
            byte[] r6 = r12.blockBuffer
            int r7 = r3 + 4
            int r6 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.convert16(r6, r7)
            if (r6 == 0) goto L101
            byte[] r7 = r12.blockBuffer
            int r8 = r3 + 6
            r8 = r7[r8]
            org.apache.commons.compress.archivers.zip.ZipEncoding r9 = r12.zipEncoding
            int r10 = r3 + 8
            int r11 = r3 + 7
            r11 = r7[r11]
            java.lang.String r7 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.decode(r9, r7, r10, r11)
            java.lang.String r9 = "."
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto Lfe
            java.lang.String r9 = ".."
            boolean r9 = r9.equals(r7)
            if (r9 == 0) goto La4
            goto Lfe
        La4:
            org.apache.commons.compress.archivers.dump.Dirent r9 = new org.apache.commons.compress.archivers.dump.Dirent
            int r10 = r13.getIno()
            r9.<init>(r4, r10, r8, r7)
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.Dirent> r7 = r12.names
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r7.put(r4, r9)
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r4 = r12.pending
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Lc0:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto Lf4
            java.lang.Object r7 = r4.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            java.lang.Object r8 = r7.getValue()
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r8 = (org.apache.commons.compress.archivers.dump.DumpArchiveEntry) r8
            java.lang.String r9 = r12.getPath(r8)
            if (r9 == 0) goto Lc0
            r8.setName(r9)
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.Dirent> r9 = r12.names
            java.lang.Object r7 = r7.getKey()
            java.lang.Object r7 = r9.get(r7)
            org.apache.commons.compress.archivers.dump.Dirent r7 = (org.apache.commons.compress.archivers.dump.Dirent) r7
            java.lang.String r7 = r7.getName()
            r8.setSimpleName(r7)
            java.util.Queue<org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r7 = r12.queue
            r7.add(r8)
            goto Lc0
        Lf4:
            java.util.Queue<org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r4 = r12.queue
            org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda1 r7 = new org.apache.commons.compress.archivers.dump.DumpArchiveInputStream$$ExternalSyntheticLambda1
            r7.<init>(r12)
            r4.forEach(r7)
        Lfe:
            int r3 = r3 + r6
            goto L64
        L101:
            org.apache.commons.compress.archivers.dump.DumpArchiveException r13 = new org.apache.commons.compress.archivers.dump.DumpArchiveException
            java.lang.String r0 = "reclen cannot be 0"
            r13.<init>(r0)
            throw r13
        L109:
            org.apache.commons.compress.archivers.dump.TapeInputStream r13 = r12.raw
            byte[] r13 = r13.peek()
            boolean r2 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r13)
            if (r2 == 0) goto L11f
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r13 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(r13)
            r2 = 1024(0x400, double:5.06E-321)
            long r0 = r0 - r2
            r2 = r5
            goto L5
        L11f:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r13 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r13.<init>()
            throw r13
        L125:
            java.io.EOFException r13 = new java.io.EOFException
            r13.<init>()
            throw r13
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.isClosed
            if (r0 != 0) goto Lc
            r0 = 1
            r1.isClosed = r0
            org.apache.commons.compress.archivers.dump.TapeInputStream r0 = r1.raw
            r0.close()
        Lc:
            return
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public long getBytesRead() {
            r2 = this;
            org.apache.commons.compress.archivers.dump.TapeInputStream r0 = r2.raw
            long r0 = r0.getBytesRead()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    @java.lang.Deprecated
    public int getCount() {
            r2 = this;
            long r0 = r2.getBytesRead()
            int r0 = (int) r0
            return r0
    }

    @java.lang.Deprecated
    public org.apache.commons.compress.archivers.dump.DumpArchiveEntry getNextDumpEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public org.apache.commons.compress.archivers.dump.DumpArchiveEntry getNextEntry() throws java.io.IOException {
            r10 = this;
            java.util.Queue<org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r0 = r10.queue
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L11
            java.util.Queue<org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r0 = r10.queue
            java.lang.Object r0 = r0.remove()
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r0 = (org.apache.commons.compress.archivers.dump.DumpArchiveEntry) r0
            return r0
        L11:
            r0 = 0
            r1 = r0
            r2 = r1
        L14:
            if (r1 != 0) goto Lfc
            boolean r1 = r10.hasHitEOF
            if (r1 == 0) goto L1b
            return r0
        L1b:
            int r1 = r10.readIdx
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2 = r10.active
            int r2 = r2.getHeaderCount()
            r3 = -1
            r5 = 1024(0x400, double:5.06E-321)
            if (r1 >= r2) goto L48
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1 = r10.active
            int r2 = r10.readIdx
            int r7 = r2 + 1
            r10.readIdx = r7
            boolean r1 = r1.isSparseRecord(r2)
            if (r1 != 0) goto L1b
            org.apache.commons.compress.archivers.dump.TapeInputStream r1 = r10.raw
            long r1 = r1.skip(r5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L42
            goto L1b
        L42:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        L48:
            r1 = 0
            r10.readIdx = r1
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r10.raw
            long r7 = r2.getBytesRead()
            r10.filepos = r7
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r10.raw
            byte[] r2 = r2.readRecord()
            boolean r7 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r2)
            if (r7 == 0) goto Lf6
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(r2)
            r10.active = r2
        L65:
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r2 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.ADDR
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r7 = r10.active
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r7 = r7.getHeaderType()
            if (r2 != r7) goto Laf
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r10.raw
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r7 = r10.active
            int r7 = r7.getHeaderCount()
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r8 = r10.active
            int r8 = r8.getHeaderHoles()
            int r7 = r7 - r8
            long r7 = (long) r7
            long r7 = r7 * r5
            long r7 = r2.skip(r7)
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto La9
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r10.raw
            long r7 = r2.getBytesRead()
            r10.filepos = r7
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r10.raw
            byte[] r2 = r2.readRecord()
            boolean r7 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r2)
            if (r7 == 0) goto La3
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(r2)
            r10.active = r2
            goto L65
        La3:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r0 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r0.<init>()
            throw r0
        La9:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        Laf:
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r2 = org.apache.commons.compress.archivers.dump.DumpArchiveConstants.SEGMENT_TYPE.END
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r3 = r10.active
            org.apache.commons.compress.archivers.dump.DumpArchiveConstants$SEGMENT_TYPE r3 = r3.getHeaderType()
            if (r2 != r3) goto Lbd
            r1 = 1
            r10.hasHitEOF = r1
            return r0
        Lbd:
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2 = r10.active
            boolean r3 = r2.isDirectory()
            r4 = 0
            if (r3 == 0) goto Ld9
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1 = r10.active
            r10.readDirectoryEntry(r1)
            r10.entryOffset = r4
            r10.entrySize = r4
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r1 = r10.active
            int r1 = r1.getHeaderCount()
            r10.readIdx = r1
            goto Le5
        Ld9:
            r10.entryOffset = r4
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r3 = r10.active
            long r3 = r3.getEntrySize()
            r10.entrySize = r3
            r10.readIdx = r1
        Le5:
            byte[] r1 = r10.readBuf
            int r1 = r1.length
            r10.recordOffset = r1
            java.lang.String r1 = r10.getPath(r2)
            if (r1 != 0) goto Lf1
            r2 = r0
        Lf1:
            r9 = r2
            r2 = r1
            r1 = r9
            goto L14
        Lf6:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r0 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r0.<init>()
            throw r0
        Lfc:
            r1.setName(r2)
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.Dirent> r0 = r10.names
            int r2 = r1.getIno()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r2)
            org.apache.commons.compress.archivers.dump.Dirent r0 = (org.apache.commons.compress.archivers.dump.Dirent) r0
            java.lang.String r0 = r0.getName()
            r1.setSimpleName(r0)
            long r2 = r10.filepos
            r1.setOffset(r2)
            return r1
    }

    public org.apache.commons.compress.archivers.dump.DumpArchiveSummary getSummary() {
            r1 = this;
            org.apache.commons.compress.archivers.dump.DumpArchiveSummary r0 = r1.summary
            return r0
    }

    /* JADX INFO: renamed from: lambda$readDirectoryEntry$1$org-apache-commons-compress-archivers-dump-DumpArchiveInputStream, reason: not valid java name */
    /* synthetic */ void m2540x293e921c(org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2) {
            r1 = this;
            java.util.Map<java.lang.Integer, org.apache.commons.compress.archivers.dump.DumpArchiveEntry> r0 = r1.pending
            int r2 = r2.getIno()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.remove(r2)
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            boolean r1 = r7.hasHitEOF
            if (r1 != 0) goto La0
            boolean r1 = r7.isClosed
            if (r1 != 0) goto La0
            long r1 = r7.entryOffset
            long r3 = r7.entrySize
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L16
            goto La0
        L16:
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r5 = r7.active
            if (r5 == 0) goto L98
            long r5 = (long) r10
            long r5 = r5 + r1
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L22
            long r3 = r3 - r1
            int r10 = (int) r3
        L22:
            r1 = r0
        L23:
            if (r10 <= 0) goto L91
            byte[] r2 = r7.readBuf
            int r2 = r2.length
            int r3 = r7.recordOffset
            int r2 = r2 - r3
            int r2 = java.lang.Math.min(r10, r2)
            int r3 = r7.recordOffset
            int r4 = r3 + r2
            byte[] r5 = r7.readBuf
            int r6 = r5.length
            if (r4 > r6) goto L43
            java.lang.System.arraycopy(r5, r3, r8, r9, r2)
            int r1 = r1 + r2
            int r3 = r7.recordOffset
            int r3 = r3 + r2
            r7.recordOffset = r3
            int r10 = r10 - r2
            int r9 = r9 + r2
        L43:
            if (r10 <= 0) goto L23
            int r2 = r7.readIdx
            r3 = 512(0x200, float:7.17E-43)
            if (r2 < r3) goto L66
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r7.raw
            byte[] r2 = r2.readRecord()
            boolean r3 = org.apache.commons.compress.archivers.dump.DumpArchiveUtil.verify(r2)
            if (r3 == 0) goto L60
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2 = org.apache.commons.compress.archivers.dump.DumpArchiveEntry.parse(r2)
            r7.active = r2
            r7.readIdx = r0
            goto L66
        L60:
            org.apache.commons.compress.archivers.dump.InvalidFormatException r8 = new org.apache.commons.compress.archivers.dump.InvalidFormatException
            r8.<init>()
            throw r8
        L66:
            org.apache.commons.compress.archivers.dump.DumpArchiveEntry r2 = r7.active
            int r3 = r7.readIdx
            int r4 = r3 + 1
            r7.readIdx = r4
            boolean r2 = r2.isSparseRecord(r3)
            if (r2 != 0) goto L89
            org.apache.commons.compress.archivers.dump.TapeInputStream r2 = r7.raw
            byte[] r3 = r7.readBuf
            int r4 = r3.length
            int r2 = r2.read(r3, r0, r4)
            byte[] r3 = r7.readBuf
            int r3 = r3.length
            if (r2 != r3) goto L83
            goto L8e
        L83:
            java.io.EOFException r8 = new java.io.EOFException
            r8.<init>()
            throw r8
        L89:
            byte[] r2 = r7.readBuf
            java.util.Arrays.fill(r2, r0)
        L8e:
            r7.recordOffset = r0
            goto L23
        L91:
            long r8 = r7.entryOffset
            long r2 = (long) r1
            long r8 = r8 + r2
            r7.entryOffset = r8
            return r1
        L98:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "No current dump entry"
            r8.<init>(r9)
            throw r8
        La0:
            r8 = -1
            return r8
    }
}
