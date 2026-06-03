package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ScatterZipOutputStream implements java.io.Closeable {
    private final org.apache.commons.compress.parallel.ScatterGatherBackingStore backingStore;
    private final java.util.concurrent.atomic.AtomicBoolean isClosed;
    private final java.util.Queue<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.CompressedEntry> items;
    private final org.apache.commons.compress.archivers.zip.StreamCompressor streamCompressor;
    private org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter;

    private static final class CompressedEntry {
        final long compressedSize;
        final long crc;
        final long size;
        final org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest zipArchiveEntryRequest;

        CompressedEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r1, long r2, long r4, long r6) {
                r0 = this;
                r0.<init>()
                r0.zipArchiveEntryRequest = r1
                r0.crc = r2
                r0.compressedSize = r4
                r0.size = r6
                return
        }

        public org.apache.commons.compress.archivers.zip.ZipArchiveEntry transferToArchiveEntry() {
                r3 = this;
                org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r0 = r3.zipArchiveEntryRequest
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r0.getZipArchiveEntry()
                long r1 = r3.compressedSize
                r0.setCompressedSize(r1)
                long r1 = r3.size
                r0.setSize(r1)
                long r1 = r3.crc
                r0.setCrc(r1)
                org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r1 = r3.zipArchiveEntryRequest
                int r1 = r1.getMethod()
                r0.setMethod(r1)
                return r0
        }
    }

    public static class ZipEntryWriter implements java.io.Closeable {
        private final java.util.Iterator<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.CompressedEntry> itemsIterator;
        private final java.io.InputStream itemsIteratorData;

        public ZipEntryWriter(org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r2) throws java.io.IOException {
                r1 = this;
                r1.<init>()
                org.apache.commons.compress.parallel.ScatterGatherBackingStore r0 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.access$000(r2)
                r0.closeForWriting()
                java.util.Queue r0 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.access$100(r2)
                java.util.Iterator r0 = r0.iterator()
                r1.itemsIterator = r0
                org.apache.commons.compress.parallel.ScatterGatherBackingStore r2 = org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.access$000(r2)
                java.io.InputStream r2 = r2.getInputStream()
                r1.itemsIteratorData = r2
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r1 = this;
                java.io.InputStream r0 = r1.itemsIteratorData
                if (r0 == 0) goto L7
                r0.close()
            L7:
                return
        }

        public void writeNextZipEntry(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream r5) throws java.io.IOException {
                r4 = this;
                java.util.Iterator<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry> r0 = r4.itemsIterator
                java.lang.Object r0 = r0.next()
                org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry r0 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.CompressedEntry) r0
                org.apache.commons.io.input.BoundedInputStream$Builder r1 = org.apache.commons.io.input.BoundedInputStream.builder()
                java.io.InputStream r2 = r4.itemsIteratorData
                org.apache.commons.io.build.AbstractOriginSupplier r1 = r1.setInputStream(r2)
                org.apache.commons.io.input.BoundedInputStream$Builder r1 = (org.apache.commons.io.input.BoundedInputStream.Builder) r1
                long r2 = r0.compressedSize
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r1 = r1.setMaxCount(r2)
                org.apache.commons.io.input.BoundedInputStream$Builder r1 = (org.apache.commons.io.input.BoundedInputStream.Builder) r1
                r2 = 0
                org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r1 = r1.setPropagateClose(r2)
                org.apache.commons.io.input.BoundedInputStream$Builder r1 = (org.apache.commons.io.input.BoundedInputStream.Builder) r1
                org.apache.commons.io.input.BoundedInputStream r1 = r1.get()
                org.apache.commons.compress.archivers.zip.ZipArchiveEntry r0 = r0.transferToArchiveEntry()     // Catch: java.lang.Throwable -> L34
                r5.addRawArchiveEntry(r0, r1)     // Catch: java.lang.Throwable -> L34
                if (r1 == 0) goto L33
                r1.close()
            L33:
                return
            L34:
                r5 = move-exception
                if (r1 == 0) goto L3f
                r1.close()     // Catch: java.lang.Throwable -> L3b
                goto L3f
            L3b:
                r0 = move-exception
                r5.addSuppressed(r0)
            L3f:
                throw r5
        }
    }

    public ScatterZipOutputStream(org.apache.commons.compress.parallel.ScatterGatherBackingStore r2, org.apache.commons.compress.archivers.zip.StreamCompressor r3) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentLinkedQueue r0 = new java.util.concurrent.ConcurrentLinkedQueue
            r0.<init>()
            r1.items = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r1.isClosed = r0
            r1.backingStore = r2
            r1.streamCompressor = r3
            return
    }

    static /* synthetic */ org.apache.commons.compress.parallel.ScatterGatherBackingStore access$000(org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r0) {
            org.apache.commons.compress.parallel.ScatterGatherBackingStore r0 = r0.backingStore
            return r0
    }

    static /* synthetic */ java.util.Queue access$100(org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r0) {
            java.util.Queue<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry> r0 = r0.items
            return r0
    }

    public static org.apache.commons.compress.archivers.zip.ScatterZipOutputStream fileBased(java.io.File r1) throws java.io.FileNotFoundException {
            java.nio.file.Path r1 = r1.toPath()
            r0 = -1
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r1 = pathBased(r1, r0)
            return r1
    }

    public static org.apache.commons.compress.archivers.zip.ScatterZipOutputStream fileBased(java.io.File r0, int r1) throws java.io.FileNotFoundException {
            java.nio.file.Path r0 = r0.toPath()
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r0 = pathBased(r0, r1)
            return r0
    }

    public static org.apache.commons.compress.archivers.zip.ScatterZipOutputStream pathBased(java.nio.file.Path r1) throws java.io.FileNotFoundException {
            r0 = -1
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r1 = pathBased(r1, r0)
            return r1
    }

    public static org.apache.commons.compress.archivers.zip.ScatterZipOutputStream pathBased(java.nio.file.Path r1, int r2) throws java.io.FileNotFoundException {
            org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore r0 = new org.apache.commons.compress.parallel.FileBasedScatterGatherBackingStore
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = org.apache.commons.compress.archivers.zip.StreamCompressor.create(r2, r0)
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream r2 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream
            r2.<init>(r0, r1)
            return r2
    }

    public void addArchiveEntry(org.apache.commons.compress.archivers.zip.ZipArchiveEntryRequest r11) throws java.io.IOException {
            r10 = this;
            java.io.InputStream r0 = r11.getPayloadStream()
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = r10.streamCompressor     // Catch: java.lang.Throwable -> L31
            int r2 = r11.getMethod()     // Catch: java.lang.Throwable -> L31
            r1.deflate(r0, r2)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L12
            r0.close()
        L12:
            java.util.Queue<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry> r0 = r10.items
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry r9 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = r10.streamCompressor
            long r3 = r1.getCrc32()
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = r10.streamCompressor
            long r5 = r1.getBytesWrittenForLastEntry()
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = r10.streamCompressor
            long r7 = r1.getBytesRead()
            r1 = r9
            r2 = r11
            r1.<init>(r2, r3, r5, r7)
            r0.add(r9)
            return
        L31:
            r11 = move-exception
            if (r0 == 0) goto L3c
            r0.close()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r0 = move-exception
            r11.addSuppressed(r0)
        L3c:
            throw r11
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.isClosed
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 != 0) goto Lb
            return
        Lb:
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$ZipEntryWriter r0 = r3.zipEntryWriter     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L12
            r0.close()     // Catch: java.lang.Throwable -> L1d
        L12:
            org.apache.commons.compress.parallel.ScatterGatherBackingStore r0 = r3.backingStore     // Catch: java.lang.Throwable -> L1d
            r0.close()     // Catch: java.lang.Throwable -> L1d
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r3.streamCompressor
            r0.close()
            return
        L1d:
            r0 = move-exception
            org.apache.commons.compress.archivers.zip.StreamCompressor r1 = r3.streamCompressor
            r1.close()
            throw r0
    }

    public void writeTo(org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream r7) throws java.io.IOException {
            r6 = this;
            org.apache.commons.compress.parallel.ScatterGatherBackingStore r0 = r6.backingStore
            r0.closeForWriting()
            org.apache.commons.compress.parallel.ScatterGatherBackingStore r0 = r6.backingStore
            java.io.InputStream r0 = r0.getInputStream()
            java.util.Queue<org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry> r1 = r6.items     // Catch: java.lang.Throwable -> L59
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L59
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L53
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L59
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$CompressedEntry r2 = (org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.CompressedEntry) r2     // Catch: java.lang.Throwable -> L59
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = org.apache.commons.io.input.BoundedInputStream.builder()     // Catch: java.lang.Throwable -> L59
            org.apache.commons.io.build.AbstractOriginSupplier r3 = r3.setInputStream(r0)     // Catch: java.lang.Throwable -> L59
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3     // Catch: java.lang.Throwable -> L59
            long r4 = r2.compressedSize     // Catch: java.lang.Throwable -> L59
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r3 = r3.setMaxCount(r4)     // Catch: java.lang.Throwable -> L59
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3     // Catch: java.lang.Throwable -> L59
            r4 = 0
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r3 = r3.setPropagateClose(r4)     // Catch: java.lang.Throwable -> L59
            org.apache.commons.io.input.BoundedInputStream$Builder r3 = (org.apache.commons.io.input.BoundedInputStream.Builder) r3     // Catch: java.lang.Throwable -> L59
            org.apache.commons.io.input.BoundedInputStream r3 = r3.get()     // Catch: java.lang.Throwable -> L59
            org.apache.commons.compress.archivers.zip.ZipArchiveEntry r2 = r2.transferToArchiveEntry()     // Catch: java.lang.Throwable -> L47
            r7.addRawArchiveEntry(r2, r3)     // Catch: java.lang.Throwable -> L47
            if (r3 == 0) goto L11
            r3.close()     // Catch: java.lang.Throwable -> L59
            goto L11
        L47:
            r7 = move-exception
            if (r3 == 0) goto L52
            r3.close()     // Catch: java.lang.Throwable -> L4e
            goto L52
        L4e:
            r1 = move-exception
            r7.addSuppressed(r1)     // Catch: java.lang.Throwable -> L59
        L52:
            throw r7     // Catch: java.lang.Throwable -> L59
        L53:
            if (r0 == 0) goto L58
            r0.close()
        L58:
            return
        L59:
            r7 = move-exception
            if (r0 == 0) goto L64
            r0.close()     // Catch: java.lang.Throwable -> L60
            goto L64
        L60:
            r0 = move-exception
            r7.addSuppressed(r0)
        L64:
            throw r7
    }

    public org.apache.commons.compress.archivers.zip.ScatterZipOutputStream.ZipEntryWriter zipEntryWriter() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$ZipEntryWriter r0 = r1.zipEntryWriter
            if (r0 != 0) goto Lb
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$ZipEntryWriter r0 = new org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$ZipEntryWriter
            r0.<init>(r1)
            r1.zipEntryWriter = r0
        Lb:
            org.apache.commons.compress.archivers.zip.ScatterZipOutputStream$ZipEntryWriter r0 = r1.zipEntryWriter
            return r0
    }
}
