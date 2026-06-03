package org.apache.commons.compress.archivers.tar;

/* JADX INFO: loaded from: classes2.dex */
public class TarFile implements java.io.Closeable {
    private static final int SMALL_BUFFER_SIZE = 256;
    private final java.nio.channels.SeekableByteChannel archive;
    private final int blockSize;
    private org.apache.commons.compress.archivers.tar.TarArchiveEntry currEntry;
    private final java.util.LinkedList<org.apache.commons.compress.archivers.tar.TarArchiveEntry> entries;
    private java.util.Map<java.lang.String, java.lang.String> globalPaxHeaders;
    private final java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> globalSparseHeaders;
    private boolean hasHitEOF;
    private final boolean lenient;
    private final java.nio.ByteBuffer recordBuffer;
    private final int recordSize;
    private final byte[] smallBuf;
    private final java.util.Map<java.lang.String, java.util.List<java.io.InputStream>> sparseInputStreams;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    private final class BoundedTarEntryInputStream extends org.apache.commons.compress.utils.BoundedArchiveInputStream {
        private final java.nio.channels.SeekableByteChannel channel;
        private int currentSparseInputStreamIndex;
        private final org.apache.commons.compress.archivers.tar.TarArchiveEntry entry;
        private long entryOffset;
        final /* synthetic */ org.apache.commons.compress.archivers.tar.TarFile this$0;

        BoundedTarEntryInputStream(org.apache.commons.compress.archivers.tar.TarFile r5, org.apache.commons.compress.archivers.tar.TarArchiveEntry r6, java.nio.channels.SeekableByteChannel r7) throws java.io.IOException {
                r4 = this;
                r4.this$0 = r5
                long r0 = r6.getDataOffset()
                long r2 = r6.getRealSize()
                r4.<init>(r0, r2)
                long r0 = r7.size()
                long r2 = r6.getSize()
                long r0 = r0 - r2
                long r2 = r6.getDataOffset()
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 < 0) goto L23
                r4.entry = r6
                r4.channel = r7
                return
            L23:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "entry size exceeds archive size"
                r5.<init>(r6)
                throw r5
        }

        private int readArchive(long r2, java.nio.ByteBuffer r4) throws java.io.IOException {
                r1 = this;
                java.nio.channels.SeekableByteChannel r0 = r1.channel
                r0.position(r2)
                java.nio.channels.SeekableByteChannel r2 = r1.channel
                int r2 = r2.read(r4)
                return r2
        }

        private int readSparse(long r7, java.nio.ByteBuffer r9, int r10) throws java.io.IOException {
                r6 = this;
                org.apache.commons.compress.archivers.tar.TarFile r0 = r6.this$0
                java.util.Map r0 = org.apache.commons.compress.archivers.tar.TarFile.access$000(r0)
                org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r6.entry
                java.lang.String r1 = r1.getName()
                java.lang.Object r0 = r0.get(r1)
                java.util.List r0 = (java.util.List) r0
                if (r0 == 0) goto L65
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L1b
                goto L65
            L1b:
                int r1 = r6.currentSparseInputStreamIndex
                int r2 = r0.size()
                r3 = -1
                if (r1 < r2) goto L25
                return r3
            L25:
                int r1 = r6.currentSparseInputStreamIndex
                java.lang.Object r1 = r0.get(r1)
                java.io.InputStream r1 = (java.io.InputStream) r1
                byte[] r2 = new byte[r10]
                int r1 = r1.read(r2)
                if (r1 == r3) goto L39
                r4 = 0
                r9.put(r2, r4, r1)
            L39:
                int r2 = r6.currentSparseInputStreamIndex
                int r0 = r0.size()
                int r0 = r0 + (-1)
                if (r2 != r0) goto L44
                return r1
            L44:
                if (r1 != r3) goto L51
                int r0 = r6.currentSparseInputStreamIndex
                int r0 = r0 + 1
                r6.currentSparseInputStreamIndex = r0
                int r7 = r6.readSparse(r7, r9, r10)
                return r7
            L51:
                if (r1 >= r10) goto L64
                int r0 = r6.currentSparseInputStreamIndex
                int r0 = r0 + 1
                r6.currentSparseInputStreamIndex = r0
                long r4 = (long) r1
                long r7 = r7 + r4
                int r10 = r10 - r1
                int r7 = r6.readSparse(r7, r9, r10)
                if (r7 != r3) goto L63
                return r1
            L63:
                int r1 = r1 + r7
            L64:
                return r1
            L65:
                org.apache.commons.compress.archivers.tar.TarArchiveEntry r10 = r6.entry
                long r0 = r10.getDataOffset()
                long r0 = r0 + r7
                int r7 = r6.readArchive(r0, r9)
                return r7
        }

        @Override // org.apache.commons.compress.utils.BoundedArchiveInputStream
        protected int read(long r5, java.nio.ByteBuffer r7) throws java.io.IOException {
                r4 = this;
                long r0 = r4.entryOffset
                org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r4.entry
                long r2 = r2.getRealSize()
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                r1 = -1
                if (r0 < 0) goto Le
                return r1
            Le:
                org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r4.entry
                boolean r0 = r0.isSparse()
                if (r0 == 0) goto L21
                long r5 = r4.entryOffset
                int r0 = r7.limit()
                int r5 = r4.readSparse(r5, r7, r0)
                goto L25
            L21:
                int r5 = r4.readArchive(r5, r7)
            L25:
                if (r5 != r1) goto L3d
                byte[] r6 = r7.array()
                int r6 = r6.length
                if (r6 > 0) goto L35
                org.apache.commons.compress.archivers.tar.TarFile r6 = r4.this$0
                r7 = 1
                r6.setAtEOF(r7)
                goto L46
            L35:
                java.io.IOException r5 = new java.io.IOException
                java.lang.String r6 = "Truncated TAR archive"
                r5.<init>(r6)
                throw r5
            L3d:
                long r0 = r4.entryOffset
                long r2 = (long) r5
                long r0 = r0 + r2
                r4.entryOffset = r0
                r7.flip()
            L46:
                return r5
        }
    }

    public TarFile(java.io.File r1) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1)
            return
    }

    public TarFile(java.io.File r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2)
            return
    }

    public TarFile(java.io.File r1, boolean r2) throws java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2)
            return
    }

    public TarFile(java.nio.channels.SeekableByteChannel r7) throws java.io.IOException {
            r6 = this;
            r4 = 0
            r5 = 0
            r2 = 10240(0x2800, float:1.4349E-41)
            r3 = 512(0x200, float:7.17E-43)
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public TarFile(java.nio.channels.SeekableByteChannel r2, int r3, int r4, java.lang.String r5, boolean r6) throws java.io.IOException {
            r1 = this;
            r1.<init>()
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1.smallBuf = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.entries = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.globalSparseHeaders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.globalPaxHeaders = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.sparseInputStreams = r0
            r1.archive = r2
            org.apache.commons.compress.archivers.zip.ZipEncoding r2 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r5)
            r1.zipEncoding = r2
            r1.recordSize = r4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r4)
            r1.recordBuffer = r2
            r1.blockSize = r3
            r1.lenient = r6
        L39:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r1.getNextTarEntry()
            if (r2 == 0) goto L45
            java.util.LinkedList<org.apache.commons.compress.archivers.tar.TarArchiveEntry> r3 = r1.entries
            r3.add(r2)
            goto L39
        L45:
            return
    }

    public TarFile(java.nio.file.Path r8) throws java.io.IOException {
            r7 = this;
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.channels.SeekableByteChannel r2 = java.nio.file.Files.newByteChannel(r8, r0)
            r5 = 0
            r6 = 0
            r3 = 10240(0x2800, float:1.4349E-41)
            r4 = 512(0x200, float:7.17E-43)
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public TarFile(java.nio.file.Path r8, java.lang.String r9) throws java.io.IOException {
            r7 = this;
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.channels.SeekableByteChannel r2 = java.nio.file.Files.newByteChannel(r8, r0)
            r4 = 512(0x200, float:7.17E-43)
            r6 = 0
            r3 = 10240(0x2800, float:1.4349E-41)
            r1 = r7
            r5 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public TarFile(java.nio.file.Path r8, boolean r9) throws java.io.IOException {
            r7 = this;
            r0 = 0
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            java.nio.channels.SeekableByteChannel r2 = java.nio.file.Files.newByteChannel(r8, r0)
            r4 = 512(0x200, float:7.17E-43)
            r5 = 0
            r3 = 10240(0x2800, float:1.4349E-41)
            r1 = r7
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public TarFile(byte[] r2) throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel r0 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public TarFile(byte[] r7, java.lang.String r8) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel r1 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel
            r1.<init>(r7)
            r3 = 512(0x200, float:7.17E-43)
            r5 = 0
            r2 = 10240(0x2800, float:1.4349E-41)
            r0 = r6
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public TarFile(byte[] r7, boolean r8) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.utils.SeekableInMemoryByteChannel r1 = new org.apache.commons.compress.utils.SeekableInMemoryByteChannel
            r1.<init>(r7)
            r3 = 512(0x200, float:7.17E-43)
            r4 = 0
            r2 = 10240(0x2800, float:1.4349E-41)
            r0 = r6
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ java.util.Map access$000(org.apache.commons.compress.archivers.tar.TarFile r0) {
            java.util.Map<java.lang.String, java.util.List<java.io.InputStream>> r0 = r0.sparseInputStreams
            return r0
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
            r17 = this;
            r0 = r17
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r0.currEntry
            java.util.List r2 = r2.getOrderedSparseHeaders()
            org.apache.commons.compress.archivers.tar.TarArchiveSparseZeroInputStream r3 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseZeroInputStream
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
            r4 = 0
            r6 = r4
            r8 = r6
        L1a:
            boolean r10 = r2.hasNext()
            if (r10 == 0) goto L84
            java.lang.Object r10 = r2.next()
            org.apache.commons.compress.archivers.tar.TarArchiveStructSparse r10 = (org.apache.commons.compress.archivers.tar.TarArchiveStructSparse) r10
            long r11 = r10.getOffset()
            long r11 = r11 - r6
            int r6 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r6 < 0) goto L7c
            if (r6 <= 0) goto L3a
            org.apache.commons.compress.utils.BoundedInputStream r6 = new org.apache.commons.compress.utils.BoundedInputStream
            r6.<init>(r3, r11)
            r1.add(r6)
            long r8 = r8 + r11
        L3a:
            long r6 = r10.getNumbytes()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L72
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r6 = r0.currEntry
            long r6 = r6.getDataOffset()
            long r11 = r10.getOffset()
            long r6 = r6 + r11
            long r12 = r6 - r8
            long r6 = r10.getNumbytes()
            long r6 = r6 + r12
            int r6 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r6 < 0) goto L6a
            org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream r6 = new org.apache.commons.compress.utils.BoundedSeekableByteChannelInputStream
            long r14 = r10.getNumbytes()
            java.nio.channels.SeekableByteChannel r7 = r0.archive
            r11 = r6
            r16 = r7
            r11.<init>(r12, r14, r16)
            r1.add(r6)
            goto L72
        L6a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Unreadable TAR archive, sparse block offset or length too big"
            r1.<init>(r2)
            throw r1
        L72:
            long r6 = r10.getOffset()
            long r10 = r10.getNumbytes()
            long r6 = r6 + r10
            goto L1a
        L7c:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Corrupted struct sparse detected"
            r1.<init>(r2)
            throw r1
        L84:
            java.util.Map<java.lang.String, java.util.List<java.io.InputStream>> r2 = r0.sparseInputStreams
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r3 = r0.currEntry
            java.lang.String r3 = r3.getName()
            r2.put(r3, r1)
            return
    }

    private void consumeRemainderOfLastBlock() throws java.io.IOException {
            r5 = this;
            java.nio.channels.SeekableByteChannel r0 = r5.archive
            long r0 = r0.position()
            int r2 = r5.blockSize
            long r3 = (long) r2
            long r0 = r0 % r3
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 <= 0) goto L15
            long r2 = (long) r2
            long r2 = r2 - r0
            r5.repositionForwardBy(r2)
        L15:
            return
    }

    private byte[] getLongNameData() throws java.io.IOException {
            r5 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r5.currEntry
            java.io.InputStream r1 = r5.getInputStream(r1)
        Lb:
            byte[] r2 = r5.smallBuf     // Catch: java.lang.Throwable -> L40
            int r2 = r1.read(r2)     // Catch: java.lang.Throwable -> L40
            if (r2 < 0) goto L1a
            byte[] r3 = r5.smallBuf     // Catch: java.lang.Throwable -> L40
            r4 = 0
            r0.write(r3, r4, r2)     // Catch: java.lang.Throwable -> L40
            goto Lb
        L1a:
            if (r1 == 0) goto L1f
            r1.close()
        L1f:
            r5.getNextTarEntry()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r5.currEntry
            if (r1 != 0) goto L28
            r0 = 0
            return r0
        L28:
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
        L2d:
            if (r1 <= 0) goto L38
            int r2 = r1 + (-1)
            r2 = r0[r2]
            if (r2 != 0) goto L38
            int r1 = r1 + (-1)
            goto L2d
        L38:
            int r2 = r0.length
            if (r1 == r2) goto L3f
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
        L3f:
            return r0
        L40:
            r0 = move-exception
            if (r1 == 0) goto L4b
            r1.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r1 = move-exception
            r0.addSuppressed(r1)
        L4b:
            throw r0
    }

    private org.apache.commons.compress.archivers.tar.TarArchiveEntry getNextTarEntry() throws java.io.IOException {
            r10 = this;
            boolean r0 = r10.isAtEOF()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r10.currEntry
            if (r0 == 0) goto L20
            long r2 = r0.getDataOffset()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r10.currEntry
            long r4 = r0.getSize()
            long r2 = r2 + r4
            r10.repositionForwardTo(r2)
            r10.throwExceptionIfPositionIsNotInArchive()
            r10.skipRecordPadding()
        L20:
            java.nio.ByteBuffer r0 = r10.getRecord()
            if (r0 != 0) goto L29
            r10.currEntry = r1
            return r1
        L29:
            java.nio.channels.SeekableByteChannel r2 = r10.archive     // Catch: java.lang.IllegalArgumentException -> Ld6
            long r8 = r2.position()     // Catch: java.lang.IllegalArgumentException -> Ld6
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = new org.apache.commons.compress.archivers.tar.TarArchiveEntry     // Catch: java.lang.IllegalArgumentException -> Ld6
            java.util.Map<java.lang.String, java.lang.String> r4 = r10.globalPaxHeaders     // Catch: java.lang.IllegalArgumentException -> Ld6
            byte[] r5 = r0.array()     // Catch: java.lang.IllegalArgumentException -> Ld6
            org.apache.commons.compress.archivers.zip.ZipEncoding r6 = r10.zipEncoding     // Catch: java.lang.IllegalArgumentException -> Ld6
            boolean r7 = r10.lenient     // Catch: java.lang.IllegalArgumentException -> Ld6
            r3 = r2
            r3.<init>(r4, r5, r6, r7, r8)     // Catch: java.lang.IllegalArgumentException -> Ld6
            r10.currEntry = r2     // Catch: java.lang.IllegalArgumentException -> Ld6
            boolean r0 = r2.isGNULongLinkEntry()
            if (r0 == 0) goto L59
            byte[] r0 = r10.getLongNameData()
            if (r0 != 0) goto L4e
            return r1
        L4e:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r10.currEntry
            org.apache.commons.compress.archivers.zip.ZipEncoding r3 = r10.zipEncoding
            java.lang.String r0 = r3.decode(r0)
            r2.setLinkName(r0)
        L59:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r10.currEntry
            boolean r0 = r0.isGNULongNameEntry()
            if (r0 == 0) goto L99
            byte[] r0 = r10.getLongNameData()
            if (r0 != 0) goto L68
            return r1
        L68:
            org.apache.commons.compress.archivers.zip.ZipEncoding r1 = r10.zipEncoding
            java.lang.String r0 = r1.decode(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r10.currEntry
            r1.setName(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r10.currEntry
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto L99
            java.lang.String r1 = "/"
            boolean r2 = r0.endsWith(r1)
            if (r2 != 0) goto L99
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r10.currEntry
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r2.setName(r0)
        L99:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r10.currEntry
            boolean r0 = r0.isGlobalPaxHeader()
            if (r0 == 0) goto La4
            r10.readGlobalPaxHeaders()
        La4:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r10.currEntry     // Catch: java.lang.NumberFormatException -> Lcd
            boolean r0 = r0.isPaxHeader()     // Catch: java.lang.NumberFormatException -> Lcd
            if (r0 == 0) goto Lb0
            r10.paxHeaders()     // Catch: java.lang.NumberFormatException -> Lcd
            goto Lbf
        Lb0:
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.globalPaxHeaders     // Catch: java.lang.NumberFormatException -> Lcd
            boolean r0 = r0.isEmpty()     // Catch: java.lang.NumberFormatException -> Lcd
            if (r0 != 0) goto Lbf
            java.util.Map<java.lang.String, java.lang.String> r0 = r10.globalPaxHeaders     // Catch: java.lang.NumberFormatException -> Lcd
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r1 = r10.globalSparseHeaders     // Catch: java.lang.NumberFormatException -> Lcd
            r10.applyPaxHeadersToCurrentEntry(r0, r1)     // Catch: java.lang.NumberFormatException -> Lcd
        Lbf:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r10.currEntry
            boolean r0 = r0.isOldGNUSparse()
            if (r0 == 0) goto Lca
            r10.readOldGNUSparse()
        Lca:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r10.currEntry
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

    private java.nio.ByteBuffer getRecord() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.readRecord()
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

    private boolean isEOFRecord(java.nio.ByteBuffer r2) {
            r1 = this;
            if (r2 == 0) goto L11
            byte[] r2 = r2.array()
            int r0 = r1.recordSize
            boolean r2 = org.apache.commons.compress.utils.ArchiveUtils.isArrayZero(r2, r0)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    private void paxHeaders() throws java.io.IOException {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r5.currEntry
            java.io.InputStream r1 = r5.getInputStream(r1)
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.globalPaxHeaders     // Catch: java.lang.Throwable -> L81
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r3 = r5.currEntry     // Catch: java.lang.Throwable -> L81
            long r3 = r3.getSize()     // Catch: java.lang.Throwable -> L81
            java.util.Map r2 = org.apache.commons.compress.archivers.tar.TarUtils.parsePaxHeaders(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L81
            if (r1 == 0) goto L1c
            r1.close()
        L1c:
            java.lang.String r1 = "GNU.sparse.map"
            boolean r3 = r2.containsKey(r1)
            if (r3 == 0) goto L33
            java.util.ArrayList r0 = new java.util.ArrayList
            java.lang.Object r1 = r2.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = org.apache.commons.compress.archivers.tar.TarUtils.parseFromPAX01SparseHeaders(r1)
            r0.<init>(r1)
        L33:
            r5.getNextTarEntry()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r1 = r5.currEntry
            if (r1 == 0) goto L79
            r5.applyPaxHeadersToCurrentEntry(r2, r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r5.currEntry
            boolean r0 = r0.isPaxGNU1XSparse()
            if (r0 == 0) goto L75
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r5.currEntry
            java.io.InputStream r0 = r5.getInputStream(r0)
            int r1 = r5.recordSize     // Catch: java.lang.Throwable -> L69
            java.util.List r1 = org.apache.commons.compress.archivers.tar.TarUtils.parsePAX1XSparseHeaders(r0, r1)     // Catch: java.lang.Throwable -> L69
            if (r0 == 0) goto L56
            r0.close()
        L56:
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r5.currEntry
            r0.setSparseHeaders(r1)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r5.currEntry
            long r1 = r0.getDataOffset()
            int r3 = r5.recordSize
            long r3 = (long) r3
            long r1 = r1 + r3
            r0.setDataOffset(r1)
            goto L75
        L69:
            r1 = move-exception
            if (r0 == 0) goto L74
            r0.close()     // Catch: java.lang.Throwable -> L70
            goto L74
        L70:
            r0 = move-exception
            r1.addSuppressed(r0)
        L74:
            throw r1
        L75:
            r5.buildSparseInputStreams()
            return
        L79:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "premature end of tar archive. Didn't find any entry after PAX header."
            r0.<init>(r1)
            throw r0
        L81:
            r0 = move-exception
            if (r1 == 0) goto L8c
            r1.close()     // Catch: java.lang.Throwable -> L88
            goto L8c
        L88:
            r1 = move-exception
            r0.addSuppressed(r1)
        L8c:
            throw r0
    }

    private void readGlobalPaxHeaders() throws java.io.IOException {
            r5 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r5.currEntry
            java.io.InputStream r0 = r5.getInputStream(r0)
            java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveStructSparse> r1 = r5.globalSparseHeaders     // Catch: java.lang.Throwable -> L2b
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.globalPaxHeaders     // Catch: java.lang.Throwable -> L2b
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r3 = r5.currEntry     // Catch: java.lang.Throwable -> L2b
            long r3 = r3.getSize()     // Catch: java.lang.Throwable -> L2b
            java.util.Map r1 = org.apache.commons.compress.archivers.tar.TarUtils.parsePaxHeaders(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r5.globalPaxHeaders = r1     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L1b
            r0.close()
        L1b:
            r5.getNextTarEntry()
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r5.currEntry
            if (r0 == 0) goto L23
            return
        L23:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Error detected parsing the pax header"
            r0.<init>(r1)
            throw r0
        L2b:
            r1 = move-exception
            if (r0 == 0) goto L36
            r0.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r0 = move-exception
            r1.addSuppressed(r0)
        L36:
            throw r1
    }

    private void readOldGNUSparse() throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            boolean r0 = r0.isExtended()
            if (r0 == 0) goto L40
        L8:
            java.nio.ByteBuffer r0 = r6.getRecord()
            if (r0 == 0) goto L38
            org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry r1 = new org.apache.commons.compress.archivers.tar.TarArchiveSparseEntry
            byte[] r0 = r0.array()
            r1.<init>(r0)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            java.util.List r0 = r0.getSparseHeaders()
            java.util.List r2 = r1.getSparseHeaders()
            r0.addAll(r2)
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            long r2 = r0.getDataOffset()
            int r4 = r6.recordSize
            long r4 = (long) r4
            long r2 = r2 + r4
            r0.setDataOffset(r2)
            boolean r0 = r1.isExtended()
            if (r0 != 0) goto L8
            goto L40
        L38:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "premature end of tar archive. Didn't find extended_header after header with extended flag."
            r0.<init>(r1)
            throw r0
        L40:
            r6.buildSparseInputStreams()
            return
    }

    private java.nio.ByteBuffer readRecord() throws java.io.IOException {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.recordBuffer
            r0.rewind()
            java.nio.channels.SeekableByteChannel r0 = r2.archive
            java.nio.ByteBuffer r1 = r2.recordBuffer
            int r0 = r0.read(r1)
            int r1 = r2.recordSize
            if (r0 == r1) goto L13
            r0 = 0
            return r0
        L13:
            java.nio.ByteBuffer r0 = r2.recordBuffer
            return r0
    }

    private void repositionForwardBy(long r3) throws java.io.IOException {
            r2 = this;
            java.nio.channels.SeekableByteChannel r0 = r2.archive
            long r0 = r0.position()
            long r0 = r0 + r3
            r2.repositionForwardTo(r0)
            return
    }

    private void repositionForwardTo(long r3) throws java.io.IOException {
            r2 = this;
            java.nio.channels.SeekableByteChannel r0 = r2.archive
            long r0 = r0.position()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L10
            java.nio.channels.SeekableByteChannel r0 = r2.archive
            r0.position(r3)
            return
        L10:
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r4 = "trying to move backwards inside of the archive"
            r3.<init>(r4)
            throw r3
    }

    private void skipRecordPadding() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto L3c
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            long r0 = r0.getSize()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L3c
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            long r0 = r0.getSize()
            int r4 = r6.recordSize
            long r4 = (long) r4
            long r0 = r0 % r4
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3c
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r0 = r6.currEntry
            long r0 = r0.getSize()
            int r2 = r6.recordSize
            long r3 = (long) r2
            long r0 = r0 / r3
            r3 = 1
            long r0 = r0 + r3
            long r2 = (long) r2
            long r0 = r0 * r2
            org.apache.commons.compress.archivers.tar.TarArchiveEntry r2 = r6.currEntry
            long r2 = r2.getSize()
            long r0 = r0 - r2
            r6.repositionForwardBy(r0)
            r6.throwExceptionIfPositionIsNotInArchive()
        L3c:
            return
    }

    private void throwExceptionIfPositionIsNotInArchive() throws java.io.IOException {
            r4 = this;
            java.nio.channels.SeekableByteChannel r0 = r4.archive
            long r0 = r0.size()
            java.nio.channels.SeekableByteChannel r2 = r4.archive
            long r2 = r2.position()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L11
            return
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Truncated TAR archive"
            r0.<init>(r1)
            throw r0
    }

    private void tryToConsumeSecondEOFRecord() throws java.io.IOException {
            r6 = this;
            java.nio.ByteBuffer r0 = r6.readRecord()     // Catch: java.lang.Throwable -> L18
            boolean r0 = r6.isEOFRecord(r0)     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L17
            java.nio.channels.SeekableByteChannel r0 = r6.archive
            long r1 = r0.position()
            int r3 = r6.recordSize
            long r3 = (long) r3
            long r1 = r1 - r3
            r0.position(r1)
        L17:
            return
        L18:
            r0 = move-exception
            java.nio.channels.SeekableByteChannel r1 = r6.archive
            long r2 = r1.position()
            int r4 = r6.recordSize
            long r4 = (long) r4
            long r2 = r2 - r4
            r1.position(r2)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.nio.channels.SeekableByteChannel r0 = r1.archive
            r0.close()
            return
    }

    public java.util.List<org.apache.commons.compress.archivers.tar.TarArchiveEntry> getEntries() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.LinkedList<org.apache.commons.compress.archivers.tar.TarArchiveEntry> r1 = r2.entries
            r0.<init>(r1)
            return r0
    }

    public java.io.InputStream getInputStream(org.apache.commons.compress.archivers.tar.TarArchiveEntry r3) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.tar.TarFile$BoundedTarEntryInputStream r0 = new org.apache.commons.compress.archivers.tar.TarFile$BoundedTarEntryInputStream     // Catch: java.lang.RuntimeException -> L8
            java.nio.channels.SeekableByteChannel r1 = r2.archive     // Catch: java.lang.RuntimeException -> L8
            r0.<init>(r2, r3, r1)     // Catch: java.lang.RuntimeException -> L8
            return r0
        L8:
            r3 = move-exception
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Corrupted TAR archive. Can't read entry"
            r0.<init>(r1, r3)
            throw r0
    }

    protected final boolean isAtEOF() {
            r1 = this;
            boolean r0 = r1.hasHitEOF
            return r0
    }

    protected final void setAtEOF(boolean r1) {
            r0 = this;
            r0.hasHitEOF = r1
            return
    }
}
