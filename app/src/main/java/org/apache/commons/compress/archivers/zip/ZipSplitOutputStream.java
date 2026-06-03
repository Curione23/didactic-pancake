package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
final class ZipSplitOutputStream extends org.apache.commons.compress.archivers.zip.RandomAccessOutputStream {
    private static final long ZIP_SEGMENT_MAX_SIZE = 4294967295L;
    private static final long ZIP_SEGMENT_MIN_SIZE = 65536;
    private java.nio.channels.FileChannel currentChannel;
    private long currentSplitSegmentBytesWritten;
    private int currentSplitSegmentIndex;
    private final java.util.List<java.lang.Long> diskToPosition;
    private boolean finished;
    private org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream outputStream;
    private final java.util.TreeMap<java.lang.Long, java.nio.file.Path> positionToFiles;
    private final byte[] singleByte;
    private final long splitSize;
    private long totalPosition;
    private java.nio.file.Path zipFile;

    ZipSplitOutputStream(java.io.File r1, long r2) throws java.lang.IllegalArgumentException, java.io.IOException {
            r0 = this;
            java.nio.file.Path r1 = r1.toPath()
            r0.<init>(r1, r2)
            return
    }

    ZipSplitOutputStream(java.nio.file.Path r5, long r6) throws java.lang.IllegalArgumentException, java.io.IOException {
            r4 = this;
            r4.<init>()
            r0 = 1
            byte[] r0 = new byte[r0]
            r4.singleByte = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.diskToPosition = r0
            java.util.TreeMap r1 = new java.util.TreeMap
            r1.<init>()
            r4.positionToFiles = r1
            r2 = 65536(0x10000, double:3.2379E-319)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 < 0) goto L4d
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 > 0) goto L4d
            r4.zipFile = r5
            r4.splitSize = r6
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r6 = new org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream
            r6.<init>(r5)
            r4.outputStream = r6
            java.nio.channels.FileChannel r5 = r6.channel()
            r4.currentChannel = r5
            r5 = 0
            java.lang.Long r7 = java.lang.Long.valueOf(r5)
            java.nio.file.Path r2 = r4.zipFile
            r1.put(r7, r2)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r0.add(r5)
            r4.writeZipSplitSignature()
            return
        L4d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Zip split segment size should between 64K and 4,294,967,295"
            r5.<init>(r6)
            throw r5
    }

    private java.nio.file.Path createNewSplitSegmentFile(java.lang.Integer r4) throws java.io.IOException {
            r3 = this;
            java.nio.file.Path r4 = r3.getSplitSegmentFileName(r4)
            r0 = 0
            java.nio.file.LinkOption[] r0 = new java.nio.file.LinkOption[r0]
            boolean r0 = java.nio.file.Files.exists(r4, r0)
            if (r0 != 0) goto Le
            return r4
        Le:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "split ZIP segment "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " already exists"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private void finish() throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.finished
            if (r0 != 0) goto L36
            java.nio.file.Path r0 = r6.zipFile
            java.lang.String r0 = org.apache.commons.compress.utils.FileNameUtils.getBaseName(r0)
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r1 = r6.outputStream
            r1.close()
            java.nio.file.Path r1 = r6.zipFile
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = ".zip"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.nio.file.Path r0 = r1.resolveSibling(r0)
            r2 = 1
            java.nio.file.CopyOption[] r3 = new java.nio.file.CopyOption[r2]
            r4 = 0
            java.nio.file.StandardCopyOption r5 = java.nio.file.StandardCopyOption.ATOMIC_MOVE
            r3[r4] = r5
            java.nio.file.Files.move(r1, r0, r3)
            r6.finished = r2
            return
        L36:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "This archive has already been finished"
            r0.<init>(r1)
            throw r0
    }

    private java.nio.file.Path getSplitSegmentFileName(java.lang.Integer r6) {
            r5 = this;
            if (r6 != 0) goto L7
            int r6 = r5.currentSplitSegmentIndex
            int r6 = r6 + 2
            goto Lb
        L7:
            int r6 = r6.intValue()
        Lb:
            java.nio.file.Path r0 = r5.zipFile
            java.lang.String r0 = org.apache.commons.compress.utils.FileNameUtils.getBaseName(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".z"
            r1.<init>(r2)
            r2 = 9
            if (r6 > r2) goto L26
            java.lang.String r2 = "0"
            java.lang.StringBuilder r2 = r1.append(r2)
            r2.append(r6)
            goto L29
        L26:
            r1.append(r6)
        L29:
            java.nio.file.Path r6 = r5.zipFile
            java.nio.file.Path r6 = r6.getParent()
            java.util.Objects.nonNull(r6)
            if (r6 == 0) goto L3d
            java.nio.file.Path r6 = r6.toAbsolutePath()
            java.lang.String r6 = r6.toString()
            goto L3f
        L3d:
            java.lang.String r6 = "."
        L3f:
            java.nio.file.Path r2 = r5.zipFile
            java.nio.file.FileSystem r2 = r2.getFileSystem()
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r3[r1] = r0
            java.nio.file.Path r6 = r2.getPath(r6, r3)
            return r6
    }

    private void openNewSplitSegment() throws java.io.IOException {
            r8 = this;
            int r0 = r8.currentSplitSegmentIndex
            r1 = 0
            r3 = 1
            if (r0 != 0) goto L29
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r0 = r8.outputStream
            r0.close()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.nio.file.Path r0 = r8.createNewSplitSegmentFile(r0)
            java.nio.file.Path r4 = r8.zipFile
            java.nio.file.CopyOption[] r5 = new java.nio.file.CopyOption[r3]
            r6 = 0
            java.nio.file.StandardCopyOption r7 = java.nio.file.StandardCopyOption.ATOMIC_MOVE
            r5[r6] = r7
            java.nio.file.Files.move(r4, r0, r5)
            java.util.TreeMap<java.lang.Long, java.nio.file.Path> r4 = r8.positionToFiles
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            r4.put(r5, r0)
        L29:
            r0 = 0
            java.nio.file.Path r0 = r8.createNewSplitSegmentFile(r0)
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r4 = r8.outputStream
            r4.close()
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r4 = new org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream
            r4.<init>(r0)
            r8.outputStream = r4
            java.nio.channels.FileChannel r4 = r4.channel()
            r8.currentChannel = r4
            r8.currentSplitSegmentBytesWritten = r1
            r8.zipFile = r0
            int r1 = r8.currentSplitSegmentIndex
            int r1 = r1 + r3
            r8.currentSplitSegmentIndex = r1
            java.util.List<java.lang.Long> r1 = r8.diskToPosition
            long r2 = r8.totalPosition
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.add(r2)
            java.util.TreeMap<java.lang.Long, java.nio.file.Path> r1 = r8.positionToFiles
            long r2 = r8.totalPosition
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r1.put(r2, r0)
            return
    }

    private void writeToSegment(java.nio.file.Path r4, long r5, byte[] r7, int r8, int r9) throws java.io.IOException {
            r3 = this;
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.WRITE
            r0[r1] = r2
            java.nio.channels.FileChannel r4 = java.nio.channels.FileChannel.open(r4, r0)
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.wrap(r7, r8, r9)     // Catch: java.lang.Throwable -> L19
            org.apache.commons.compress.archivers.zip.ZipIoUtil.writeFullyAt(r4, r7, r5)     // Catch: java.lang.Throwable -> L19
            if (r4 == 0) goto L18
            r4.close()
        L18:
            return
        L19:
            r5 = move-exception
            if (r4 == 0) goto L24
            r4.close()     // Catch: java.lang.Throwable -> L20
            goto L24
        L20:
            r4 = move-exception
            r5.addSuppressed(r4)
        L24:
            throw r5
    }

    private void writeZipSplitSignature() throws java.io.IOException {
            r4 = this;
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r0 = r4.outputStream
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG
            r0.write(r1)
            long r0 = r4.currentSplitSegmentBytesWritten
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG
            int r2 = r2.length
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.currentSplitSegmentBytesWritten = r0
            long r0 = r4.totalPosition
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.DD_SIG
            int r2 = r2.length
            long r2 = (long) r2
            long r0 = r0 + r2
            r4.totalPosition = r0
            return
    }

    public long calculateDiskPosition(long r3, long r5) throws java.io.IOException {
            r2 = this;
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L16
            java.util.List<java.lang.Long> r0 = r2.diskToPosition
            int r3 = (int) r3
            java.lang.Object r3 = r0.get(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r3 = r3 + r5
            return r3
        L16:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Disk number exceeded internal limits: limit=2147483647 requested="
            r6.<init>(r0)
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.finished
            if (r0 != 0) goto L7
            r1.finish()
        L7:
            return
    }

    public long getCurrentSplitSegmentBytesWritten() {
            r2 = this;
            long r0 = r2.currentSplitSegmentBytesWritten
            return r0
    }

    public int getCurrentSplitSegmentIndex() {
            r1 = this;
            int r0 = r1.currentSplitSegmentIndex
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
    public long position() {
            r2 = this;
            long r0 = r2.totalPosition
            return r0
    }

    public void prepareToWriteUnsplittableContent(long r5) throws java.lang.IllegalArgumentException, java.io.IOException {
            r4 = this;
            long r0 = r4.splitSize
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L11
            long r2 = r4.currentSplitSegmentBytesWritten
            long r0 = r0 - r2
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L10
            r4.openNewSplitSegment()
        L10:
            return
        L11:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "The unsplittable content size is bigger than the split segment size"
            r5.<init>(r6)
            throw r5
    }

    @Override // org.apache.commons.compress.archivers.zip.RandomAccessOutputStream, java.io.OutputStream
    public void write(int r3) throws java.io.IOException {
            r2 = this;
            byte[] r0 = r2.singleByte
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r1 = 0
            r0[r1] = r3
            r2.write(r0)
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
    public void write(byte[] r9, int r10, int r11) throws java.io.IOException {
            r8 = this;
            if (r11 > 0) goto L3
            return
        L3:
            long r0 = r8.currentSplitSegmentBytesWritten
            long r2 = r8.splitSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L12
            r8.openNewSplitSegment()
            r8.write(r9, r10, r11)
            goto L37
        L12:
            long r4 = (long) r11
            long r6 = r0 + r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L28
            int r2 = (int) r2
            int r0 = (int) r0
            int r2 = r2 - r0
            r8.write(r9, r10, r2)
            r8.openNewSplitSegment()
            int r10 = r10 + r2
            int r11 = r11 - r2
            r8.write(r9, r10, r11)
            goto L37
        L28:
            org.apache.commons.compress.archivers.zip.FileRandomAccessOutputStream r0 = r8.outputStream
            r0.write(r9, r10, r11)
            long r9 = r8.currentSplitSegmentBytesWritten
            long r9 = r9 + r4
            r8.currentSplitSegmentBytesWritten = r9
            long r9 = r8.totalPosition
            long r9 = r9 + r4
            r8.totalPosition = r9
        L37:
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.RandomAccessOutputStream
    public void writeFully(byte[] r11, int r12, int r13, long r14) throws java.io.IOException {
            r10 = this;
        L0:
            if (r13 <= 0) goto L85
            java.util.TreeMap<java.lang.Long, java.nio.file.Path> r0 = r10.positionToFiles
            java.lang.Long r1 = java.lang.Long.valueOf(r14)
            java.util.Map$Entry r0 = r0.floorEntry(r1)
            java.util.TreeMap<java.lang.Long, java.nio.file.Path> r1 = r10.positionToFiles
            java.lang.Long r2 = java.lang.Long.valueOf(r14)
            java.lang.Object r1 = r1.higherKey(r2)
            java.lang.Long r1 = (java.lang.Long) r1
            r7 = 0
            if (r1 != 0) goto L35
            java.nio.channels.FileChannel r1 = r10.currentChannel
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r11, r12, r13)
            java.lang.Object r0 = r0.getKey()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            long r3 = r14 - r3
            org.apache.commons.compress.archivers.zip.ZipIoUtil.writeFullyAt(r1, r2, r3)
            long r0 = (long) r13
            long r14 = r14 + r0
            int r12 = r12 + r13
            r13 = r7
            goto L0
        L35:
            long r2 = (long) r13
            long r8 = r14 + r2
            long r2 = r1.longValue()
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 > 0) goto L5d
            java.lang.Object r1 = r0.getValue()
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.lang.Object r0 = r0.getKey()
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = r14 - r2
            r0 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.writeToSegment(r1, r2, r4, r5, r6)
            int r12 = r12 + r13
            r13 = r7
            r14 = r8
            goto L0
        L5d:
            long r1 = r1.longValue()
            long r1 = r1 - r14
            int r7 = java.lang.Math.toIntExact(r1)
            java.lang.Object r1 = r0.getValue()
            java.nio.file.Path r1 = (java.nio.file.Path) r1
            java.lang.Object r0 = r0.getKey()
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            long r2 = r14 - r2
            r0 = r10
            r4 = r11
            r5 = r12
            r6 = r7
            r0.writeToSegment(r1, r2, r4, r5, r6)
            long r0 = (long) r7
            long r14 = r14 + r0
            int r12 = r12 + r7
            int r13 = r13 - r7
            goto L0
        L85:
            return
    }
}
