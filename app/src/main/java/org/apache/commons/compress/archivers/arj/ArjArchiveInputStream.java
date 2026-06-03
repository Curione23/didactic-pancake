package org.apache.commons.compress.archivers.arj;

/* JADX INFO: loaded from: classes2.dex */
public class ArjArchiveInputStream extends org.apache.commons.compress.archivers.ArchiveInputStream<org.apache.commons.compress.archivers.arj.ArjArchiveEntry> {
    private static final int ARJ_MAGIC_1 = 96;
    private static final int ARJ_MAGIC_2 = 234;
    private static final java.lang.String ENCODING_NAME = "CP437";
    private java.io.InputStream currentInputStream;
    private org.apache.commons.compress.archivers.arj.LocalFileHeader currentLocalFileHeader;
    private final java.io.DataInputStream dis;
    private final org.apache.commons.compress.archivers.arj.MainHeader mainHeader;

    public ArjArchiveInputStream(java.io.InputStream r2) throws org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            java.lang.String r0 = "CP437"
            r1.<init>(r2, r0)
            return
    }

    public ArjArchiveInputStream(java.io.InputStream r2, java.lang.String r3) throws org.apache.commons.compress.archivers.ArchiveException {
            r1 = this;
            r1.<init>(r2, r3)
            java.io.DataInputStream r3 = new java.io.DataInputStream
            r3.<init>(r2)
            r1.dis = r3
            r1.in = r3
            org.apache.commons.compress.archivers.arj.MainHeader r2 = r1.readMainHeader()     // Catch: java.io.IOException -> L2f
            r1.mainHeader = r2     // Catch: java.io.IOException -> L2f
            int r3 = r2.arjFlags     // Catch: java.io.IOException -> L2f
            r3 = r3 & 1
            if (r3 != 0) goto L27
            int r2 = r2.arjFlags     // Catch: java.io.IOException -> L2f
            r2 = r2 & 4
            if (r2 != 0) goto L1f
            return
        L1f:
            org.apache.commons.compress.archivers.ArchiveException r2 = new org.apache.commons.compress.archivers.ArchiveException     // Catch: java.io.IOException -> L2f
            java.lang.String r3 = "Multi-volume ARJ files are unsupported"
            r2.<init>(r3)     // Catch: java.io.IOException -> L2f
            throw r2     // Catch: java.io.IOException -> L2f
        L27:
            org.apache.commons.compress.archivers.ArchiveException r2 = new org.apache.commons.compress.archivers.ArchiveException     // Catch: java.io.IOException -> L2f
            java.lang.String r3 = "Encrypted ARJ files are unsupported"
            r2.<init>(r3)     // Catch: java.io.IOException -> L2f
            throw r2     // Catch: java.io.IOException -> L2f
        L2f:
            r2 = move-exception
            org.apache.commons.compress.archivers.ArchiveException r3 = new org.apache.commons.compress.archivers.ArchiveException
            java.lang.String r0 = r2.getMessage()
            r3.<init>(r0, r2)
            throw r3
    }

    public static boolean matches(byte[] r2, int r3) {
            r0 = 2
            r1 = 0
            if (r3 < r0) goto L16
            r3 = r2[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = 96
            if (r3 != r0) goto L16
            r3 = 1
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            r0 = 234(0xea, float:3.28E-43)
            if (r2 != r0) goto L16
            r1 = r3
        L16:
            return r1
    }

    private int read16(java.io.DataInputStream r2) throws java.io.IOException {
            r1 = this;
            int r2 = r2.readUnsignedShort()
            r0 = 2
            r1.count(r0)
            int r2 = java.lang.Integer.reverseBytes(r2)
            int r2 = r2 >>> 16
            return r2
    }

    private int read32(java.io.DataInputStream r2) throws java.io.IOException {
            r1 = this;
            int r2 = r2.readInt()
            r0 = 4
            r1.count(r0)
            int r2 = java.lang.Integer.reverseBytes(r2)
            return r2
    }

    private int read8(java.io.DataInputStream r2) throws java.io.IOException {
            r1 = this;
            int r2 = r2.readUnsignedByte()
            r0 = 1
            r1.count(r0)
            return r2
    }

    private void readExtraData(int r2, java.io.DataInputStream r3, org.apache.commons.compress.archivers.arj.LocalFileHeader r4) throws java.io.IOException {
            r1 = this;
            r0 = 33
            if (r2 < r0) goto L2a
            int r0 = r1.read32(r3)
            r4.extendedFilePosition = r0
            r0 = 45
            if (r2 < r0) goto L25
            int r2 = r1.read32(r3)
            r4.dateTimeAccessed = r2
            int r2 = r1.read32(r3)
            r4.dateTimeCreated = r2
            int r2 = r1.read32(r3)
            r4.originalSizeEvenForVolumes = r2
            r2 = 12
            r1.pushedBackBytes(r2)
        L25:
            r2 = 4
            r1.pushedBackBytes(r2)
        L2a:
            return
    }

    private byte[] readHeader() throws java.io.IOException {
            r7 = this;
            r0 = 0
            r1 = 0
            r2 = r1
        L3:
            java.io.DataInputStream r3 = r7.dis
            int r3 = r7.read8(r3)
        L9:
            java.io.DataInputStream r4 = r7.dis
            int r4 = r7.read8(r4)
            r5 = 96
            if (r3 == r5) goto L1a
            r3 = 234(0xea, float:3.28E-43)
            if (r4 != r3) goto L18
            goto L1a
        L18:
            r3 = r4
            goto L9
        L1a:
            java.io.DataInputStream r3 = r7.dis
            int r3 = r7.read16(r3)
            if (r3 != 0) goto L23
            return r1
        L23:
            r4 = 2600(0xa28, float:3.643E-42)
            if (r3 > r4) goto L4b
            java.io.DataInputStream r2 = r7.dis
            byte[] r2 = r7.readRange(r2, r3)
            java.io.DataInputStream r3 = r7.dis
            int r3 = r7.read32(r3)
            long r3 = (long) r3
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r5
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32
            r5.<init>()
            r5.update(r2)
            long r5 = r5.getValue()
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L4b
            r0 = 1
        L4b:
            if (r0 == 0) goto L3
            return r2
    }

    private org.apache.commons.compress.archivers.arj.LocalFileHeader readLocalFileHeader() throws java.io.IOException {
            r12 = this;
            byte[] r0 = r12.readHeader()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            r1.<init>(r2)
            int r0 = r1.readUnsignedByte()     // Catch: java.lang.Throwable -> Lfc
            int r2 = r0 + (-1)
            byte[] r2 = r12.readRange(r1, r2)     // Catch: java.lang.Throwable -> Lfc
            int r3 = r2.length     // Catch: java.lang.Throwable -> Lfc
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lfc
            r12.pushedBackBytes(r3)     // Catch: java.lang.Throwable -> Lfc
            java.io.DataInputStream r3 = new java.io.DataInputStream     // Catch: java.lang.Throwable -> Lfc
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Lfc
            r4.<init>(r2)     // Catch: java.lang.Throwable -> Lfc
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lfc
            org.apache.commons.compress.archivers.arj.LocalFileHeader r2 = new org.apache.commons.compress.archivers.arj.LocalFileHeader     // Catch: java.lang.Throwable -> Lf2
            r2.<init>()     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.archiverVersionNumber = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.minVersionToExtract = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.hostOS = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.arjFlags = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.method = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.fileType = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.reserved = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r12.read32(r3)     // Catch: java.lang.Throwable -> Lf2
            r2.dateTimeModified = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r12.read32(r3)     // Catch: java.lang.Throwable -> Lf2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lf2
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r2.compressedSize = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r12.read32(r3)     // Catch: java.lang.Throwable -> Lf2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lf2
            long r4 = r4 & r6
            r2.originalSize = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r12.read32(r3)     // Catch: java.lang.Throwable -> Lf2
            long r4 = (long) r4     // Catch: java.lang.Throwable -> Lf2
            long r4 = r4 & r6
            r2.originalCrc32 = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r12.read16(r3)     // Catch: java.lang.Throwable -> Lf2
            r2.fileSpecPosition = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r12.read16(r3)     // Catch: java.lang.Throwable -> Lf2
            r2.fileAccessMode = r4     // Catch: java.lang.Throwable -> Lf2
            r4 = 20
            r12.pushedBackBytes(r4)     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.firstChapter = r4     // Catch: java.lang.Throwable -> Lf2
            int r4 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> Lf2
            r2.lastChapter = r4     // Catch: java.lang.Throwable -> Lf2
            r12.readExtraData(r0, r3, r2)     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r0 = r12.readString(r1)     // Catch: java.lang.Throwable -> Lf2
            r2.name = r0     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r0 = r12.readString(r1)     // Catch: java.lang.Throwable -> Lf2
            r2.comment = r0     // Catch: java.lang.Throwable -> Lf2
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lf2
            r0.<init>()     // Catch: java.lang.Throwable -> Lf2
        Lae:
            java.io.DataInputStream r4 = r12.dis     // Catch: java.lang.Throwable -> Lf2
            int r4 = r12.read16(r4)     // Catch: java.lang.Throwable -> Lf2
            if (r4 <= 0) goto Le0
            java.io.DataInputStream r5 = r12.dis     // Catch: java.lang.Throwable -> Lf2
            byte[] r4 = r12.readRange(r5, r4)     // Catch: java.lang.Throwable -> Lf2
            java.io.DataInputStream r5 = r12.dis     // Catch: java.lang.Throwable -> Lf2
            int r5 = r12.read32(r5)     // Catch: java.lang.Throwable -> Lf2
            long r8 = (long) r5     // Catch: java.lang.Throwable -> Lf2
            long r8 = r8 & r6
            java.util.zip.CRC32 r5 = new java.util.zip.CRC32     // Catch: java.lang.Throwable -> Lf2
            r5.<init>()     // Catch: java.lang.Throwable -> Lf2
            r5.update(r4)     // Catch: java.lang.Throwable -> Lf2
            long r10 = r5.getValue()     // Catch: java.lang.Throwable -> Lf2
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 != 0) goto Ld8
            r0.add(r4)     // Catch: java.lang.Throwable -> Lf2
            goto Lae
        Ld8:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> Lf2
            java.lang.String r2 = "Extended header CRC32 verification failure"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf2
            throw r0     // Catch: java.lang.Throwable -> Lf2
        Le0:
            r4 = 0
            byte[][] r4 = new byte[r4][]     // Catch: java.lang.Throwable -> Lf2
            java.lang.Object[] r0 = r0.toArray(r4)     // Catch: java.lang.Throwable -> Lf2
            byte[][] r0 = (byte[][]) r0     // Catch: java.lang.Throwable -> Lf2
            r2.extendedHeaders = r0     // Catch: java.lang.Throwable -> Lf2
            r3.close()     // Catch: java.lang.Throwable -> Lfc
            r1.close()
            return r2
        Lf2:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> Lf7
            goto Lfb
        Lf7:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch: java.lang.Throwable -> Lfc
        Lfb:
            throw r0     // Catch: java.lang.Throwable -> Lfc
        Lfc:
            r0 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L101
            goto L105
        L101:
            r1 = move-exception
            r0.addSuppressed(r1)
        L105:
            throw r0
    }

    private org.apache.commons.compress.archivers.arj.MainHeader readMainHeader() throws java.io.IOException {
            r8 = this;
            byte[] r0 = r8.readHeader()
            if (r0 == 0) goto Lea
            java.io.DataInputStream r1 = new java.io.DataInputStream
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r0)
            r1.<init>(r2)
            int r0 = r1.readUnsignedByte()
            int r2 = r0 + (-1)
            byte[] r2 = r8.readRange(r1, r2)
            int r3 = r2.length
            long r3 = (long) r3
            r8.pushedBackBytes(r3)
            java.io.DataInputStream r3 = new java.io.DataInputStream
            java.io.ByteArrayInputStream r4 = new java.io.ByteArrayInputStream
            r4.<init>(r2)
            r3.<init>(r4)
            org.apache.commons.compress.archivers.arj.MainHeader r2 = new org.apache.commons.compress.archivers.arj.MainHeader
            r2.<init>()
            int r4 = r3.readUnsignedByte()
            r2.archiverVersionNumber = r4
            int r4 = r3.readUnsignedByte()
            r2.minVersionToExtract = r4
            int r4 = r3.readUnsignedByte()
            r2.hostOS = r4
            int r4 = r3.readUnsignedByte()
            r2.arjFlags = r4
            int r4 = r3.readUnsignedByte()
            r2.securityVersion = r4
            int r4 = r3.readUnsignedByte()
            r2.fileType = r4
            int r4 = r3.readUnsignedByte()
            r2.reserved = r4
            int r4 = r8.read32(r3)
            r2.dateTimeCreated = r4
            int r4 = r8.read32(r3)
            r2.dateTimeModified = r4
            int r4 = r8.read32(r3)
            long r4 = (long) r4
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r6
            r2.archiveSize = r4
            int r4 = r8.read32(r3)
            r2.securityEnvelopeFilePosition = r4
            int r4 = r8.read16(r3)
            r2.fileSpecPosition = r4
            int r4 = r8.read16(r3)
            r2.securityEnvelopeLength = r4
            r4 = 20
            r8.pushedBackBytes(r4)
            int r4 = r3.readUnsignedByte()
            r2.encryptionVersion = r4
            int r4 = r3.readUnsignedByte()
            r2.lastChapter = r4
            r4 = 33
            if (r0 < r4) goto Laa
            int r0 = r3.readUnsignedByte()
            r2.arjProtectionFactor = r0
            int r0 = r3.readUnsignedByte()
            r2.arjFlags2 = r0
            r3.readUnsignedByte()
            r3.readUnsignedByte()
        Laa:
            java.lang.String r0 = r8.readString(r1)
            r2.name = r0
            java.lang.String r0 = r8.readString(r1)
            r2.comment = r0
            java.io.DataInputStream r0 = r8.dis
            int r0 = r8.read16(r0)
            if (r0 <= 0) goto Le9
            java.io.DataInputStream r1 = r8.dis
            byte[] r0 = r8.readRange(r1, r0)
            r2.extendedHeaderBytes = r0
            java.io.DataInputStream r0 = r8.dis
            int r0 = r8.read32(r0)
            long r0 = (long) r0
            long r0 = r0 & r6
            java.util.zip.CRC32 r3 = new java.util.zip.CRC32
            r3.<init>()
            byte[] r4 = r2.extendedHeaderBytes
            r3.update(r4)
            long r3 = r3.getValue()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto Le1
            goto Le9
        Le1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Extended header CRC32 verification failure"
            r0.<init>(r1)
            throw r0
        Le9:
            return r2
        Lea:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Archive ends without any headers"
            r0.<init>(r1)
            throw r0
    }

    private byte[] readRange(java.io.InputStream r2, int r3) throws java.io.IOException {
            r1 = this;
            byte[] r2 = org.apache.commons.compress.utils.IOUtils.readRange(r2, r3)
            int r0 = r2.length
            r1.count(r0)
            int r0 = r2.length
            if (r0 < r3) goto Lc
            return r2
        Lc:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    private java.lang.String readString(java.io.DataInputStream r3) throws java.io.IOException {
            r2 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L5:
            int r1 = r3.readUnsignedByte()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto Lf
            r0.write(r1)     // Catch: java.lang.Throwable -> L1f
            goto L5
        Lf:
            java.nio.charset.Charset r3 = r2.getCharset()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r3.name()     // Catch: java.lang.Throwable -> L1f
            java.lang.String r3 = r0.toString(r3)     // Catch: java.lang.Throwable -> L1f
            r0.close()
            return r3
        L1f:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r0 = move-exception
            r3.addSuppressed(r0)
        L28:
            throw r3
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public boolean canReadEntryData(org.apache.commons.compress.archivers.ArchiveEntry r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.apache.commons.compress.archivers.arj.ArjArchiveEntry
            if (r0 == 0) goto Le
            org.apache.commons.compress.archivers.arj.ArjArchiveEntry r2 = (org.apache.commons.compress.archivers.arj.ArjArchiveEntry) r2
            int r2 = r2.getMethod()
            if (r2 != 0) goto Le
            r2 = 1
            goto Lf
        Le:
            r2 = 0
        Lf:
            return r2
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            java.io.DataInputStream r0 = r1.dis
            r0.close()
            return
    }

    public java.lang.String getArchiveComment() {
            r1 = this;
            org.apache.commons.compress.archivers.arj.MainHeader r0 = r1.mainHeader
            java.lang.String r0 = r0.comment
            return r0
    }

    public java.lang.String getArchiveName() {
            r1 = this;
            org.apache.commons.compress.archivers.arj.MainHeader r0 = r1.mainHeader
            java.lang.String r0 = r0.name
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.arj.ArjArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public org.apache.commons.compress.archivers.arj.ArjArchiveEntry getNextEntry() throws java.io.IOException {
            r4 = this;
            java.io.InputStream r0 = r4.currentInputStream
            r1 = 0
            if (r0 == 0) goto L16
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            org.apache.commons.io.IOUtils.skip(r0, r2)
            java.io.InputStream r0 = r4.currentInputStream
            r0.close()
            r4.currentLocalFileHeader = r1
            r4.currentInputStream = r1
        L16:
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r4.readLocalFileHeader()
            r4.currentLocalFileHeader = r0
            if (r0 == 0) goto L7a
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = org.apache.commons.io.input.BoundedInputStream.builder()
            java.io.DataInputStream r1 = r4.dis
            org.apache.commons.io.build.AbstractOriginSupplier r0 = r0.setInputStream(r1)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            org.apache.commons.compress.archivers.arj.LocalFileHeader r1 = r4.currentLocalFileHeader
            long r1 = r1.compressedSize
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r0 = r0.setMaxCount(r1)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            r1 = 0
            org.apache.commons.io.input.BoundedInputStream$AbstractBuilder r0 = r0.setPropagateClose(r1)
            org.apache.commons.io.input.BoundedInputStream$Builder r0 = (org.apache.commons.io.input.BoundedInputStream.Builder) r0
            org.apache.commons.io.input.BoundedInputStream r0 = r0.get()
            r4.currentInputStream = r0
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r4.currentLocalFileHeader
            int r0 = r0.method
            if (r0 != 0) goto L72
            org.apache.commons.io.input.ChecksumInputStream$Builder r0 = org.apache.commons.io.input.ChecksumInputStream.builder()
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32
            r1.<init>()
            org.apache.commons.io.input.ChecksumInputStream$Builder r0 = r0.setChecksum(r1)
            java.io.InputStream r1 = r4.currentInputStream
            org.apache.commons.io.build.AbstractOriginSupplier r0 = r0.setInputStream(r1)
            org.apache.commons.io.input.ChecksumInputStream$Builder r0 = (org.apache.commons.io.input.ChecksumInputStream.Builder) r0
            org.apache.commons.compress.archivers.arj.LocalFileHeader r1 = r4.currentLocalFileHeader
            long r1 = r1.originalSize
            org.apache.commons.io.input.ChecksumInputStream$Builder r0 = r0.setCountThreshold(r1)
            org.apache.commons.compress.archivers.arj.LocalFileHeader r1 = r4.currentLocalFileHeader
            long r1 = r1.originalCrc32
            org.apache.commons.io.input.ChecksumInputStream$Builder r0 = r0.setExpectedChecksumValue(r1)
            org.apache.commons.io.input.ChecksumInputStream r0 = r0.get()
            r4.currentInputStream = r0
        L72:
            org.apache.commons.compress.archivers.arj.ArjArchiveEntry r0 = new org.apache.commons.compress.archivers.arj.ArjArchiveEntry
            org.apache.commons.compress.archivers.arj.LocalFileHeader r1 = r4.currentLocalFileHeader
            r0.<init>(r1)
            return r0
        L7a:
            r4.currentInputStream = r1
            return r1
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            if (r4 != 0) goto L4
            r2 = 0
            return r2
        L4:
            org.apache.commons.compress.archivers.arj.LocalFileHeader r0 = r1.currentLocalFileHeader
            if (r0 == 0) goto L2c
            int r0 = r0.method
            if (r0 != 0) goto L13
            java.io.InputStream r0 = r1.currentInputStream
            int r2 = r0.read(r2, r3, r4)
            return r2
        L13:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unsupported compression method "
            r3.<init>(r4)
            org.apache.commons.compress.archivers.arj.LocalFileHeader r4 = r1.currentLocalFileHeader
            int r4 = r4.method
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "No current arj entry"
            r2.<init>(r3)
            throw r2
    }
}
