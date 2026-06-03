package org.apache.commons.compress.archivers.sevenz;

/* JADX INFO: loaded from: classes2.dex */
public class SevenZOutputFile implements java.io.Closeable {
    private org.apache.commons.io.output.CountingOutputStream[] additionalCountingStreams;
    private final java.util.Map<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry, long[]> additionalSizes;
    private org.apache.commons.compress.archivers.sevenz.AES256Options aes256Options;
    private final java.nio.channels.SeekableByteChannel channel;
    private final java.util.zip.CRC32 compressedCrc32;
    private java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> contentMethods;
    private final java.util.zip.CRC32 crc32;
    private org.apache.commons.io.output.CountingOutputStream currentOutputStream;
    private long fileBytesWritten;
    private final java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> files;
    private boolean finished;
    private int numNonEmptyStreams;


    private final class OutputStreamWrapper extends java.io.OutputStream {
        private static final int BUF_SIZE = 8192;
        private final java.nio.ByteBuffer buffer;
        final /* synthetic */ org.apache.commons.compress.archivers.sevenz.SevenZOutputFile this$0;

        private OutputStreamWrapper(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 8192(0x2000, float:1.148E-41)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
                r0.buffer = r1
                return
        }

        /* synthetic */ OutputStreamWrapper(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r1, org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r0 = this;
                return
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws java.io.IOException {
                r0 = this;
                return
        }

        @Override // java.io.OutputStream
        public void write(int r3) throws java.io.IOException {
                r2 = this;
                java.nio.ByteBuffer r0 = r2.buffer
                r0.clear()
                java.nio.ByteBuffer r0 = r2.buffer
                byte r1 = (byte) r3
                java.nio.ByteBuffer r0 = r0.put(r1)
                r0.flip()
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0 = r2.this$0
                java.nio.channels.SeekableByteChannel r0 = org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.access$000(r0)
                java.nio.ByteBuffer r1 = r2.buffer
                r0.write(r1)
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0 = r2.this$0
                java.util.zip.CRC32 r0 = org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.access$100(r0)
                r0.update(r3)
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r3 = r2.this$0
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.access$208(r3)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r3) throws java.io.IOException {
                r2 = this;
                r0 = 0
                int r1 = r3.length
                r2.write(r3, r0, r1)
                return
        }

        @Override // java.io.OutputStream
        public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
                r2 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                if (r5 <= r0) goto L12
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0 = r2.this$0
                java.nio.channels.SeekableByteChannel r0 = org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.access$000(r0)
                java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r3, r4, r5)
                r0.write(r1)
                goto L2b
            L12:
                java.nio.ByteBuffer r0 = r2.buffer
                r0.clear()
                java.nio.ByteBuffer r0 = r2.buffer
                java.nio.ByteBuffer r0 = r0.put(r3, r4, r5)
                r0.flip()
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0 = r2.this$0
                java.nio.channels.SeekableByteChannel r0 = org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.access$000(r0)
                java.nio.ByteBuffer r1 = r2.buffer
                r0.write(r1)
            L2b:
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0 = r2.this$0
                java.util.zip.CRC32 r0 = org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.access$100(r0)
                r0.update(r3, r4, r5)
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r3 = r2.this$0
                long r4 = (long) r5
                org.apache.commons.compress.archivers.sevenz.SevenZOutputFile.access$214(r3, r4)
                return
        }
    }

    public SevenZOutputFile(java.io.File r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SevenZOutputFile(java.io.File r4, char[] r5) throws java.io.IOException {
            r3 = this;
            java.nio.file.Path r4 = r4.toPath()
            java.nio.file.StandardOpenOption r0 = java.nio.file.StandardOpenOption.CREATE
            java.nio.file.StandardOpenOption r1 = java.nio.file.StandardOpenOption.WRITE
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.TRUNCATE_EXISTING
            java.util.EnumSet r0 = java.util.EnumSet.of(r0, r1, r2)
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]
            java.nio.channels.SeekableByteChannel r4 = java.nio.file.Files.newByteChannel(r4, r0, r1)
            r3.<init>(r4, r5)
            return
    }

    public SevenZOutputFile(java.nio.channels.SeekableByteChannel r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SevenZOutputFile(java.nio.channels.SeekableByteChannel r3, char[] r4) throws java.io.IOException {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.files = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r2.crc32 = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r2.compressedCrc32 = r0
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.LZMA2
            r0.<init>(r1)
            java.util.List r0 = java.util.Collections.singletonList(r0)
            r2.contentMethods = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.additionalSizes = r0
            r2.channel = r3
            r0 = 32
            r3.position(r0)
            if (r4 == 0) goto L3c
            org.apache.commons.compress.archivers.sevenz.AES256Options r3 = new org.apache.commons.compress.archivers.sevenz.AES256Options
            r3.<init>(r4)
            r2.aes256Options = r3
        L3c:
            return
    }

    static /* synthetic */ java.nio.channels.SeekableByteChannel access$000(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0) {
            java.nio.channels.SeekableByteChannel r0 = r0.channel
            return r0
    }

    static /* synthetic */ java.util.zip.CRC32 access$100(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0) {
            java.util.zip.CRC32 r0 = r0.compressedCrc32
            return r0
    }

    static /* synthetic */ long access$208(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r4) {
            long r0 = r4.fileBytesWritten
            r2 = 1
            long r2 = r2 + r0
            r4.fileBytesWritten = r2
            return r0
    }

    static /* synthetic */ long access$214(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r2, long r3) {
            long r0 = r2.fileBytesWritten
            long r0 = r0 + r3
            r2.fileBytesWritten = r0
            return r0
    }

    static /* synthetic */ java.util.zip.CRC32 access$400(org.apache.commons.compress.archivers.sevenz.SevenZOutputFile r0) {
            java.util.zip.CRC32 r0 = r0.crc32
            return r0
    }

    private void fillDates(java.nio.file.Path r2, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r1 = this;
            java.lang.Class<java.nio.file.attribute.BasicFileAttributes> r0 = java.nio.file.attribute.BasicFileAttributes.class
            java.nio.file.attribute.BasicFileAttributes r2 = java.nio.file.Files.readAttributes(r2, r0, r4)
            java.nio.file.attribute.FileTime r4 = r2.lastModifiedTime()
            r3.setLastModifiedTime(r4)
            java.nio.file.attribute.FileTime r4 = r2.creationTime()
            r3.setCreationTime(r4)
            java.nio.file.attribute.FileTime r2 = r2.lastAccessTime()
            r3.setAccessTime(r2)
            return
    }

    private java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> getContentMethods(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r4) {
            r3 = this;
            java.lang.Iterable r4 = r4.getContentMethods()
            if (r4 != 0) goto L8
            java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r4 = r3.contentMethods
        L8:
            org.apache.commons.compress.archivers.sevenz.AES256Options r0 = r3.aes256Options
            if (r0 == 0) goto L30
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r1 = org.apache.commons.compress.archivers.sevenz.SevenZMethod.AES256SHA256
            org.apache.commons.compress.archivers.sevenz.AES256Options r2 = r3.aes256Options
            r0.<init>(r1, r2)
            java.util.stream.Stream r0 = java.util.stream.Stream.of(r0)
            java.util.Spliterator r4 = r4.spliterator()
            r1 = 0
            java.util.stream.Stream r4 = java.util.stream.StreamSupport.stream(r4, r1)
            java.util.stream.Stream r4 = java.util.stream.Stream.concat(r0, r4)
            java.util.stream.Collector r0 = java.util.stream.Collectors.toList()
            java.lang.Object r4 = r4.collect(r0)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
        L30:
            return r4
    }

    private java.io.OutputStream getCurrentOutputStream() throws java.io.IOException {
            r1 = this;
            org.apache.commons.io.output.CountingOutputStream r0 = r1.currentOutputStream
            if (r0 != 0) goto La
            org.apache.commons.io.output.CountingOutputStream r0 = r1.setupFileOutputStream()
            r1.currentOutputStream = r0
        La:
            org.apache.commons.io.output.CountingOutputStream r0 = r1.currentOutputStream
            return r0
    }

    static /* synthetic */ boolean lambda$writeFileEmptyStreams$1(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r0) {
            boolean r0 = r0.hasStream()
            r0 = r0 ^ 1
            return r0
    }

    private static <T> java.lang.Iterable<T> reverse(java.lang.Iterable<T> r2) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r2.next()
            r0.addFirst(r1)
            goto L9
        L17:
            return r0
    }

    private org.apache.commons.io.output.CountingOutputStream setupFileOutputStream() throws java.io.IOException {
            r6 = this;
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r6.files
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L65
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$OutputStreamWrapper r0 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$OutputStreamWrapper
            r1 = 0
            r0.<init>(r6, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r2 = r6.files
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.Object r2 = r2.get(r3)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            java.lang.Iterable r2 = r6.getContentMethods(r2)
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            r5 = 0
            if (r3 == 0) goto L4f
            java.lang.Object r3 = r2.next()
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r3 = (org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration) r3
            if (r4 != 0) goto L41
            org.apache.commons.io.output.CountingOutputStream r4 = new org.apache.commons.io.output.CountingOutputStream
            r4.<init>(r0)
            r1.add(r4)
            r0 = r4
        L41:
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r4 = r3.getMethod()
            java.lang.Object r3 = r3.getOptions()
            java.io.OutputStream r0 = org.apache.commons.compress.archivers.sevenz.Coders.addEncoder(r0, r4, r3)
            r4 = r5
            goto L29
        L4f:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L5f
            org.apache.commons.io.output.CountingOutputStream[] r2 = new org.apache.commons.io.output.CountingOutputStream[r5]
            java.lang.Object[] r1 = r1.toArray(r2)
            org.apache.commons.io.output.CountingOutputStream[] r1 = (org.apache.commons.io.output.CountingOutputStream[]) r1
            r6.additionalCountingStreams = r1
        L5f:
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1 r1 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$1
            r1.<init>(r6, r0)
            return r1
        L65:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No current 7z entry"
            r0.<init>(r1)
            throw r0
    }

    private void writeBits(java.io.DataOutput r7, java.util.BitSet r8, int r9) throws java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 7
            r2 = r0
            r4 = r2
            r3 = r1
        L5:
            if (r2 >= r9) goto L19
            boolean r5 = r8.get(r2)
            int r5 = r5 << r3
            r4 = r4 | r5
            int r3 = r3 + (-1)
            if (r3 >= 0) goto L16
            r7.write(r4)
            r4 = r0
            r3 = r1
        L16:
            int r2 = r2 + 1
            goto L5
        L19:
            if (r3 == r1) goto L1e
            r7.write(r4)
        L1e:
            return
    }

    private void writeFileATimes(java.io.DataOutput r7) throws java.io.IOException {
            r6 = this;
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r6.files
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r0.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r3 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r3
            boolean r3 = r3.getHasAccessDate()
            if (r3 == 0) goto L8
            int r2 = r2 + 1
            goto L8
        L1d:
            if (r2 <= 0) goto La7
            r0 = 19
            r7.write(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            if (r2 == r4) goto L69
            r3.write(r1)
            java.util.BitSet r2 = new java.util.BitSet
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r2.<init>(r4)
            r4 = r1
        L45:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            int r5 = r5.size()
            if (r4 >= r5) goto L5f
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            java.lang.Object r5 = r5.get(r4)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r5 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r5
            boolean r5 = r5.getHasAccessDate()
            r2.set(r4, r5)
            int r4 = r4 + 1
            goto L45
        L5f:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r6.writeBits(r3, r2, r4)
            goto L6d
        L69:
            r2 = 1
            r3.write(r2)
        L6d:
            r3.write(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r6.files
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r4 = r2.getHasAccessDate()
            if (r4 == 0) goto L76
            java.nio.file.attribute.FileTime r2 = r2.getAccessTime()
            long r4 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r2)
            long r4 = java.lang.Long.reverseBytes(r4)
            r3.writeLong(r4)
            goto L76
        L98:
            r3.flush()
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r6.writeUint64(r7, r1)
            r7.write(r0)
        La7:
            return
    }

    private void writeFileAntiItems(java.io.DataOutput r7) throws java.io.IOException {
            r6 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 0
            r0.<init>(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r2 = r6.files
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        Ld:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2b
            java.lang.Object r4 = r2.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r4 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r4
            boolean r5 = r4.hasStream()
            if (r5 != 0) goto Ld
            boolean r4 = r4.isAntiItem()
            int r5 = r3 + 1
            r0.set(r3, r4)
            r1 = r1 | r4
            r3 = r5
            goto Ld
        L2b:
            if (r1 == 0) goto L4e
            r1 = 16
            r7.write(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r1)
            r6.writeBits(r2, r0, r3)
            r2.flush()
            byte[] r0 = r1.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r6.writeUint64(r7, r1)
            r7.write(r0)
        L4e:
            return
    }

    private void writeFileCTimes(java.io.DataOutput r7) throws java.io.IOException {
            r6 = this;
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r6.files
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r0.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r3 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r3
            boolean r3 = r3.getHasCreationDate()
            if (r3 == 0) goto L8
            int r2 = r2 + 1
            goto L8
        L1d:
            if (r2 <= 0) goto La7
            r0 = 18
            r7.write(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            if (r2 == r4) goto L69
            r3.write(r1)
            java.util.BitSet r2 = new java.util.BitSet
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r2.<init>(r4)
            r4 = r1
        L45:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            int r5 = r5.size()
            if (r4 >= r5) goto L5f
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            java.lang.Object r5 = r5.get(r4)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r5 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r5
            boolean r5 = r5.getHasCreationDate()
            r2.set(r4, r5)
            int r4 = r4 + 1
            goto L45
        L5f:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r6.writeBits(r3, r2, r4)
            goto L6d
        L69:
            r2 = 1
            r3.write(r2)
        L6d:
            r3.write(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r6.files
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r4 = r2.getHasCreationDate()
            if (r4 == 0) goto L76
            java.nio.file.attribute.FileTime r2 = r2.getCreationTime()
            long r4 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r2)
            long r4 = java.lang.Long.reverseBytes(r4)
            r3.writeLong(r4)
            goto L76
        L98:
            r3.flush()
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r6.writeUint64(r7, r1)
            r7.write(r0)
        La7:
            return
    }

    private void writeFileEmptyFiles(java.io.DataOutput r8) throws java.io.IOException {
            r7 = this;
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 0
            r0.<init>(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r2 = r7.files
            java.util.Iterator r2 = r2.iterator()
            r3 = r1
        Ld:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r2.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r4 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r4
            boolean r5 = r4.hasStream()
            if (r5 != 0) goto Ld
            boolean r4 = r4.isDirectory()
            int r5 = r3 + 1
            r6 = r4 ^ 1
            r0.set(r3, r6)
            r3 = r4 ^ 1
            r1 = r1 | r3
            r3 = r5
            goto Ld
        L2f:
            if (r1 == 0) goto L52
            r1 = 15
            r8.write(r1)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r1)
            r7.writeBits(r2, r0, r3)
            r2.flush()
            byte[] r0 = r1.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r7.writeUint64(r8, r1)
            r8.write(r0)
        L52:
            return
    }

    private void writeFileEmptyStreams(java.io.DataOutput r5) throws java.io.IOException {
            r4 = this;
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r4.files
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$$ExternalSyntheticLambda0
            r1.<init>()
            boolean r0 = r0.anyMatch(r1)
            if (r0 == 0) goto L60
            r0 = 14
            r5.write(r0)
            java.util.BitSet r0 = new java.util.BitSet
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r4.files
            int r1 = r1.size()
            r0.<init>(r1)
            r1 = 0
        L22:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r2 = r4.files
            int r2 = r2.size()
            if (r1 >= r2) goto L3e
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r2 = r4.files
            java.lang.Object r2 = r2.get(r1)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r2 = r2.hasStream()
            r2 = r2 ^ 1
            r0.set(r1, r2)
            int r1 = r1 + 1
            goto L22
        L3e:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            java.io.DataOutputStream r2 = new java.io.DataOutputStream
            r2.<init>(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r3 = r4.files
            int r3 = r3.size()
            r4.writeBits(r2, r0, r3)
            r2.flush()
            byte[] r0 = r1.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r4.writeUint64(r5, r1)
            r5.write(r0)
        L60:
            return
    }

    private void writeFileMTimes(java.io.DataOutput r7) throws java.io.IOException {
            r6 = this;
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r6.files
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r0.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r3 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r3
            boolean r3 = r3.getHasLastModifiedDate()
            if (r3 == 0) goto L8
            int r2 = r2 + 1
            goto L8
        L1d:
            if (r2 <= 0) goto La7
            r0 = 20
            r7.write(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            if (r2 == r4) goto L69
            r3.write(r1)
            java.util.BitSet r2 = new java.util.BitSet
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r2.<init>(r4)
            r4 = r1
        L45:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            int r5 = r5.size()
            if (r4 >= r5) goto L5f
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            java.lang.Object r5 = r5.get(r4)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r5 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r5
            boolean r5 = r5.getHasLastModifiedDate()
            r2.set(r4, r5)
            int r4 = r4 + 1
            goto L45
        L5f:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r6.writeBits(r3, r2, r4)
            goto L6d
        L69:
            r2 = 1
            r3.write(r2)
        L6d:
            r3.write(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r6.files
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r4 = r2.getHasLastModifiedDate()
            if (r4 == 0) goto L76
            java.nio.file.attribute.FileTime r2 = r2.getLastModifiedTime()
            long r4 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r2)
            long r4 = java.lang.Long.reverseBytes(r4)
            r3.writeLong(r4)
            goto L76
        L98:
            r3.flush()
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r6.writeUint64(r7, r1)
            r7.write(r0)
        La7:
            return
    }

    private void writeFileNames(java.io.DataOutput r7) throws java.io.IOException {
            r6 = this;
            r0 = 17
            r7.write(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.DataOutputStream r1 = new java.io.DataOutputStream
            r1.<init>(r0)
            r2 = 0
            r1.write(r2)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r3 = r6.files
            java.util.Iterator r3 = r3.iterator()
        L19:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L36
            java.lang.Object r4 = r3.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r4 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r4
            java.lang.String r4 = r4.getName()
            java.nio.charset.Charset r5 = java.nio.charset.StandardCharsets.UTF_16LE
            byte[] r4 = r4.getBytes(r5)
            r1.write(r4)
            r1.writeShort(r2)
            goto L19
        L36:
            r1.flush()
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r6.writeUint64(r7, r1)
            r7.write(r0)
            return
    }

    private void writeFileWindowsAttributes(java.io.DataOutput r7) throws java.io.IOException {
            r6 = this;
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r6.files
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        L8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1d
            java.lang.Object r3 = r0.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r3 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r3
            boolean r3 = r3.getHasWindowsAttributes()
            if (r3 == 0) goto L8
            int r2 = r2 + 1
            goto L8
        L1d:
            if (r2 <= 0) goto La3
            r0 = 21
            r7.write(r0)
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            if (r2 == r4) goto L69
            r3.write(r1)
            java.util.BitSet r2 = new java.util.BitSet
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r2.<init>(r4)
            r4 = r1
        L45:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            int r5 = r5.size()
            if (r4 >= r5) goto L5f
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r5 = r6.files
            java.lang.Object r5 = r5.get(r4)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r5 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r5
            boolean r5 = r5.getHasWindowsAttributes()
            r2.set(r4, r5)
            int r4 = r4 + 1
            goto L45
        L5f:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r4 = r6.files
            int r4 = r4.size()
            r6.writeBits(r3, r2, r4)
            goto L6d
        L69:
            r2 = 1
            r3.write(r2)
        L6d:
            r3.write(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r6.files
            java.util.Iterator r1 = r1.iterator()
        L76:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L94
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r4 = r2.getHasWindowsAttributes()
            if (r4 == 0) goto L76
            int r2 = r2.getWindowsAttributes()
            int r2 = java.lang.Integer.reverseBytes(r2)
            r3.writeInt(r2)
            goto L76
        L94:
            r3.flush()
            byte[] r0 = r0.toByteArray()
            int r1 = r0.length
            long r1 = (long) r1
            r6.writeUint64(r7, r1)
            r7.write(r0)
        La3:
            return
    }

    private void writeFilesInfo(java.io.DataOutput r3) throws java.io.IOException {
            r2 = this;
            r0 = 5
            r3.write(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r2.files
            int r0 = r0.size()
            long r0 = (long) r0
            r2.writeUint64(r3, r0)
            r2.writeFileEmptyStreams(r3)
            r2.writeFileEmptyFiles(r3)
            r2.writeFileAntiItems(r3)
            r2.writeFileNames(r3)
            r2.writeFileCTimes(r3)
            r2.writeFileATimes(r3)
            r2.writeFileMTimes(r3)
            r2.writeFileWindowsAttributes(r3)
            r0 = 0
            r3.write(r0)
            return
    }

    private void writeFolder(java.io.DataOutput r7, org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r8) throws java.io.IOException {
            r6 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.lang.Iterable r8 = r6.getContentMethods(r8)
            java.util.Iterator r8 = r8.iterator()
            r1 = 0
        Le:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r8.next()
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r2 = (org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration) r2
            int r1 = r1 + 1
            r6.writeSingleCodec(r2, r0)
            goto Le
        L20:
            long r2 = (long) r1
            r6.writeUint64(r7, r2)
            byte[] r8 = r0.toByteArray()
            r7.write(r8)
            r2 = 0
        L2d:
            int r8 = r1 + (-1)
            long r4 = (long) r8
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 >= 0) goto L3f
            r4 = 1
            long r4 = r4 + r2
            r6.writeUint64(r7, r4)
            r6.writeUint64(r7, r2)
            r2 = r4
            goto L2d
        L3f:
            return
    }

    private void writeHeader(java.io.DataOutput r2) throws java.io.IOException {
            r1 = this;
            r0 = 1
            r2.write(r0)
            r0 = 4
            r2.write(r0)
            r1.writeStreamsInfo(r2)
            r1.writeFilesInfo(r2)
            r0 = 0
            r2.write(r0)
            return
    }

    private void writePackInfo(java.io.DataOutput r5) throws java.io.IOException {
            r4 = this;
            r0 = 6
            r5.write(r0)
            r0 = 0
            r4.writeUint64(r5, r0)
            int r0 = r4.numNonEmptyStreams
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r4.writeUint64(r5, r0)
            r0 = 9
            r5.write(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r4.files
            java.util.Iterator r0 = r0.iterator()
        L20:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r1 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r1
            boolean r2 = r1.hasStream()
            if (r2 == 0) goto L20
            long r1 = r1.getCompressedSize()
            r4.writeUint64(r5, r1)
            goto L20
        L3a:
            r0 = 10
            r5.write(r0)
            r0 = 1
            r5.write(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r4.files
            java.util.Iterator r0 = r0.iterator()
        L49:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L68
            java.lang.Object r1 = r0.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r1 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r1
            boolean r2 = r1.hasStream()
            if (r2 == 0) goto L49
            long r1 = r1.getCompressedCrcValue()
            int r1 = (int) r1
            int r1 = java.lang.Integer.reverseBytes(r1)
            r5.writeInt(r1)
            goto L49
        L68:
            r0 = 0
            r5.write(r0)
            return
    }

    private void writeSingleCodec(org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r4, java.io.OutputStream r5) throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r0 = r4.getMethod()
            byte[] r0 = r0.getId()
            org.apache.commons.compress.archivers.sevenz.SevenZMethod r1 = r4.getMethod()
            org.apache.commons.compress.archivers.sevenz.AbstractCoder r1 = org.apache.commons.compress.archivers.sevenz.Coders.findByMethod(r1)
            java.lang.Object r4 = r4.getOptions()
            byte[] r4 = r1.getOptionsAsProperties(r4)
            int r1 = r0.length
            int r2 = r4.length
            if (r2 <= 0) goto L1e
            r1 = r1 | 32
        L1e:
            r5.write(r1)
            r5.write(r0)
            int r0 = r4.length
            if (r0 <= 0) goto L2e
            int r0 = r4.length
            r5.write(r0)
            r5.write(r4)
        L2e:
            return
    }

    private void writeStreamsInfo(java.io.DataOutput r2) throws java.io.IOException {
            r1 = this;
            int r0 = r1.numNonEmptyStreams
            if (r0 <= 0) goto La
            r1.writePackInfo(r2)
            r1.writeUnpackInfo(r2)
        La:
            r1.writeSubStreamsInfo(r2)
            r0 = 0
            r2.write(r0)
            return
    }

    private void writeSubStreamsInfo(java.io.DataOutput r2) throws java.io.IOException {
            r1 = this;
            r0 = 8
            r2.write(r0)
            r0 = 0
            r2.write(r0)
            return
    }

    private void writeUint64(java.io.DataOutput r9, long r10) throws java.io.IOException {
            r8 = this;
            r0 = 0
            r1 = 128(0x80, float:1.8E-43)
            r2 = r1
            r1 = r0
        L5:
            r3 = 8
            if (r0 >= r3) goto L22
            int r4 = r0 + 1
            int r5 = r4 * 7
            r6 = 1
            long r5 = r6 << r5
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 >= 0) goto L1d
            long r1 = (long) r1
            int r4 = r0 * 8
            long r4 = r10 >>> r4
            long r1 = r1 | r4
            int r1 = (int) r1
            goto L22
        L1d:
            r1 = r1 | r2
            int r2 = r2 >>> 1
            r0 = r4
            goto L5
        L22:
            r9.write(r1)
        L25:
            if (r0 <= 0) goto L32
            r1 = 255(0xff, double:1.26E-321)
            long r1 = r1 & r10
            int r1 = (int) r1
            r9.write(r1)
            long r10 = r10 >>> r3
            int r0 = r0 + (-1)
            goto L25
        L32:
            return
    }

    private void writeUnpackInfo(java.io.DataOutput r9) throws java.io.IOException {
            r8 = this;
            r0 = 7
            r9.write(r0)
            r0 = 11
            r9.write(r0)
            int r0 = r8.numNonEmptyStreams
            long r0 = (long) r0
            r8.writeUint64(r9, r0)
            r0 = 0
            r9.write(r0)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r8.files
            java.util.Iterator r1 = r1.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r3 = r2.hasStream()
            if (r3 == 0) goto L19
            r8.writeFolder(r9, r2)
            goto L19
        L2f:
            r1 = 12
            r9.write(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r8.files
            java.util.Iterator r1 = r1.iterator()
        L3a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r3 = r2.hasStream()
            if (r3 == 0) goto L3a
            java.util.Map<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry, long[]> r3 = r8.additionalSizes
            java.lang.Object r3 = r3.get(r2)
            long[] r3 = (long[]) r3
            if (r3 == 0) goto L62
            int r4 = r3.length
            r5 = r0
        L58:
            if (r5 >= r4) goto L62
            r6 = r3[r5]
            r8.writeUint64(r9, r6)
            int r5 = r5 + 1
            goto L58
        L62:
            long r2 = r2.getSize()
            r8.writeUint64(r9, r2)
            goto L3a
        L6a:
            r1 = 10
            r9.write(r1)
            r1 = 1
            r9.write(r1)
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r1 = r8.files
            java.util.Iterator r1 = r1.iterator()
        L79:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L98
            java.lang.Object r2 = r1.next()
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r2
            boolean r3 = r2.hasStream()
            if (r3 == 0) goto L79
            long r2 = r2.getCrcValue()
            int r2 = (int) r2
            int r2 = java.lang.Integer.reverseBytes(r2)
            r9.writeInt(r2)
            goto L79
        L98:
            r9.write(r0)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.finished     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto L7
            r2.finish()     // Catch: java.lang.Throwable -> Ld
        L7:
            java.nio.channels.SeekableByteChannel r0 = r2.channel
            r0.close()
            return
        Ld:
            r0 = move-exception
            java.nio.channels.SeekableByteChannel r1 = r2.channel
            r1.close()
            throw r0
    }

    public void closeArchiveEntry() throws java.io.IOException {
            r7 = this;
            org.apache.commons.io.output.CountingOutputStream r0 = r7.currentOutputStream
            if (r0 == 0) goto Lc
            r0.flush()
            org.apache.commons.io.output.CountingOutputStream r0 = r7.currentOutputStream
            r0.close()
        Lc:
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r7.files
            int r1 = r0.size()
            r2 = 1
            int r1 = r1 - r2
            java.lang.Object r0 = r0.get(r1)
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r0 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r0
            long r3 = r7.fileBytesWritten
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L62
            r0.setHasStream(r2)
            int r1 = r7.numNonEmptyStreams
            int r1 = r1 + r2
            r7.numNonEmptyStreams = r1
            org.apache.commons.io.output.CountingOutputStream r1 = r7.currentOutputStream
            long r3 = r1.getByteCount()
            r0.setSize(r3)
            long r3 = r7.fileBytesWritten
            r0.setCompressedSize(r3)
            java.util.zip.CRC32 r1 = r7.crc32
            long r3 = r1.getValue()
            r0.setCrcValue(r3)
            java.util.zip.CRC32 r1 = r7.compressedCrc32
            long r3 = r1.getValue()
            r0.setCompressedCrcValue(r3)
            r0.setHasCrc(r2)
            org.apache.commons.io.output.CountingOutputStream[] r1 = r7.additionalCountingStreams
            if (r1 == 0) goto L6f
            int r1 = r1.length
            long[] r1 = new long[r1]
            org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$$ExternalSyntheticLambda1 r2 = new org.apache.commons.compress.archivers.sevenz.SevenZOutputFile$$ExternalSyntheticLambda1
            r2.<init>(r7)
            java.util.Arrays.setAll(r1, r2)
            java.util.Map<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry, long[]> r2 = r7.additionalSizes
            r2.put(r0, r1)
            goto L6f
        L62:
            r1 = 0
            r0.setHasStream(r1)
            r0.setSize(r5)
            r0.setCompressedSize(r5)
            r0.setHasCrc(r1)
        L6f:
            r0 = 0
            r7.currentOutputStream = r0
            r7.additionalCountingStreams = r0
            java.util.zip.CRC32 r0 = r7.crc32
            r0.reset()
            java.util.zip.CRC32 r0 = r7.compressedCrc32
            r0.reset()
            r7.fileBytesWritten = r5
            return
    }

    public org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry createArchiveEntry(java.io.File r4, java.lang.String r5) {
            r3 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry
            r0.<init>()
            boolean r1 = r4.isDirectory()
            r0.setDirectory(r1)
            r0.setName(r5)
            java.nio.file.Path r5 = r4.toPath()     // Catch: java.io.IOException -> L1a
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]     // Catch: java.io.IOException -> L1a
            r3.fillDates(r5, r0, r1)     // Catch: java.io.IOException -> L1a
            goto L26
        L1a:
            java.util.Date r5 = new java.util.Date
            long r1 = r4.lastModified()
            r5.<init>(r1)
            r0.setLastModifiedDate(r5)
        L26:
            return r0
    }

    public org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry createArchiveEntry(java.nio.file.Path r3, java.lang.String r4, java.nio.file.LinkOption... r5) throws java.io.IOException {
            r2 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r0 = new org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry
            r0.<init>()
            boolean r1 = java.nio.file.Files.isDirectory(r3, r5)
            r0.setDirectory(r1)
            r0.setName(r4)
            r2.fillDates(r3, r0, r5)
            return r0
    }

    public void finish() throws java.io.IOException {
            r8 = this;
            boolean r0 = r8.finished
            if (r0 != 0) goto L9a
            r0 = 1
            r8.finished = r0
            java.nio.channels.SeekableByteChannel r0 = r8.channel
            long r0 = r0.position()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            java.io.DataOutputStream r3 = new java.io.DataOutputStream
            r3.<init>(r2)
            r8.writeHeader(r3)
            r3.flush()
            byte[] r2 = r2.toByteArray()
            java.nio.channels.SeekableByteChannel r3 = r8.channel
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r2)
            r3.write(r4)
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            r3.update(r2)
            byte[] r4 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature
            int r4 = r4.length
            int r4 = r4 + 26
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.allocate(r4)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r4 = r4.order(r5)
            java.nio.channels.SeekableByteChannel r5 = r8.channel
            r6 = 0
            r5.position(r6)
            byte[] r5 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature
            r4.put(r5)
            r5 = 0
            java.nio.ByteBuffer r6 = r4.put(r5)
            r7 = 2
            r6.put(r7)
            r4.putInt(r5)
            r5 = 32
            long r0 = r0 - r5
            java.nio.ByteBuffer r0 = r4.putLong(r0)
            int r1 = r2.length
            long r1 = (long) r1
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r5
            java.nio.ByteBuffer r0 = r0.putLong(r1)
            long r1 = r3.getValue()
            int r1 = (int) r1
            r0.putInt(r1)
            r3.reset()
            byte[] r0 = r4.array()
            byte[] r1 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature
            int r1 = r1.length
            int r1 = r1 + 6
            r2 = 20
            r3.update(r0, r1, r2)
            byte[] r0 = org.apache.commons.compress.archivers.sevenz.SevenZFile.sevenZSignature
            int r0 = r0.length
            int r0 = r0 + r7
            long r1 = r3.getValue()
            int r1 = (int) r1
            r4.putInt(r0, r1)
            r4.flip()
            java.nio.channels.SeekableByteChannel r0 = r8.channel
            r0.write(r4)
            return
        L9a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "This archive has already been finished"
            r0.<init>(r1)
            throw r0
    }

    /* JADX INFO: renamed from: lambda$closeArchiveEntry$0$org-apache-commons-compress-archivers-sevenz-SevenZOutputFile, reason: not valid java name */
    /* synthetic */ long m2541x1b9a4843(int r3) {
            r2 = this;
            org.apache.commons.io.output.CountingOutputStream[] r0 = r2.additionalCountingStreams
            r3 = r0[r3]
            long r0 = r3.getByteCount()
            return r0
    }

    @java.lang.Deprecated
    public void putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry r1) {
            r0 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r1 = (org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry) r1
            r0.putArchiveEntry(r1)
            return
    }

    public void putArchiveEntry(org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry r2) {
            r1 = this;
            java.util.List<org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry> r0 = r1.files
            r0.add(r2)
            return
    }

    public void setContentCompression(org.apache.commons.compress.archivers.sevenz.SevenZMethod r2) {
            r1 = this;
            org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration r0 = new org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration
            r0.<init>(r2)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            r1.setContentMethods(r2)
            return
    }

    public void setContentMethods(java.lang.Iterable<? extends org.apache.commons.compress.archivers.sevenz.SevenZMethodConfiguration> r1) {
            r0 = this;
            java.lang.Iterable r1 = reverse(r1)
            r0.contentMethods = r1
            return
    }

    public void write(int r2) throws java.io.IOException {
            r1 = this;
            java.io.OutputStream r0 = r1.getCurrentOutputStream()
            r0.write(r2)
            return
    }

    public void write(java.io.InputStream r4) throws java.io.IOException {
            r3 = this;
            r0 = 8024(0x1f58, float:1.1244E-41)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r4.read(r0)
            r2 = -1
            if (r2 == r1) goto L10
            r2 = 0
            r3.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    public void write(java.nio.file.Path r2, java.nio.file.OpenOption... r3) throws java.io.IOException {
            r1 = this;
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream
            java.io.InputStream r2 = java.nio.file.Files.newInputStream(r2, r3)
            r0.<init>(r2)
            r1.write(r0)     // Catch: java.lang.Throwable -> L10
            r0.close()
            return
        L10:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r3 = move-exception
            r2.addSuppressed(r3)
        L19:
            throw r2
    }

    public void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    public void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r4 <= 0) goto L9
            java.io.OutputStream r0 = r1.getCurrentOutputStream()
            r0.write(r2, r3, r4)
        L9:
            return
    }
}
