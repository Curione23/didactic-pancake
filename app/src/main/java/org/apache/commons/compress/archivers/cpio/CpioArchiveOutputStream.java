package org.apache.commons.compress.archivers.cpio;

/* JADX INFO: loaded from: classes2.dex */
public class CpioArchiveOutputStream extends org.apache.commons.compress.archivers.ArchiveOutputStream<org.apache.commons.compress.archivers.cpio.CpioArchiveEntry> implements org.apache.commons.compress.archivers.cpio.CpioConstants {
    private final int blockSize;
    final java.lang.String charsetName;
    private long crc;
    private org.apache.commons.compress.archivers.cpio.CpioArchiveEntry entry;
    private final short entryFormat;
    private final java.util.HashMap<java.lang.String, org.apache.commons.compress.archivers.cpio.CpioArchiveEntry> names;
    private long nextArtificalDeviceAndInode;
    private long written;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    public CpioArchiveOutputStream(java.io.OutputStream r2) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            return
    }

    public CpioArchiveOutputStream(java.io.OutputStream r3, java.lang.String r4) {
            r2 = this;
            r0 = 1
            r1 = 512(0x200, float:7.17E-43)
            r2.<init>(r3, r0, r1, r4)
            return
    }

    public CpioArchiveOutputStream(java.io.OutputStream r3, short r4) {
            r2 = this;
            r0 = 512(0x200, float:7.17E-43)
            java.lang.String r1 = org.apache.commons.compress.archivers.cpio.CpioUtil.DEFAULT_CHARSET_NAME
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public CpioArchiveOutputStream(java.io.OutputStream r2, short r3, int r4) {
            r1 = this;
            java.lang.String r0 = org.apache.commons.compress.archivers.cpio.CpioUtil.DEFAULT_CHARSET_NAME
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public CpioArchiveOutputStream(java.io.OutputStream r3, short r4, int r5, java.lang.String r6) {
            r2 = this;
            r2.<init>(r3)
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r2.names = r3
            r0 = 1
            r2.nextArtificalDeviceAndInode = r0
            r3 = 1
            if (r4 == r3) goto L31
            r3 = 2
            if (r4 == r3) goto L31
            r3 = 4
            if (r4 == r3) goto L31
            r3 = 8
            if (r4 != r3) goto L1c
            goto L31
        L1c:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unknown format: "
            r5.<init>(r6)
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L31:
            r2.entryFormat = r4
            r2.blockSize = r5
            r2.charsetName = r6
            org.apache.commons.compress.archivers.zip.ZipEncoding r3 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r6)
            r2.zipEncoding = r3
            return
    }

    private byte[] encode(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r3.zipEncoding
            java.nio.ByteBuffer r4 = r0.encode(r4)
            int r0 = r4.limit()
            int r1 = r4.position()
            int r0 = r0 - r1
            byte[] r1 = r4.array()
            int r2 = r4.arrayOffset()
            int r4 = r4.arrayOffset()
            int r4 = r4 + r0
            byte[] r4 = java.util.Arrays.copyOfRange(r1, r2, r4)
            return r4
    }

    private void pad(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 <= 0) goto Lc
            byte[] r0 = new byte[r3]
            java.io.OutputStream r1 = r2.out
            r1.write(r0)
            r2.count(r3)
        Lc:
            return
    }

    private void writeAsciiLong(long r3, int r5, int r6) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 16
            if (r6 != r1) goto L11
            java.lang.String r3 = java.lang.Long.toHexString(r3)
            r0.append(r3)
            goto L20
        L11:
            r1 = 8
            if (r6 != r1) goto L1d
            java.lang.String r3 = java.lang.Long.toOctalString(r3)
            r0.append(r3)
            goto L20
        L1d:
            r0.append(r3)
        L20:
            int r3 = r0.length()
            if (r3 > r5) goto L3c
            int r3 = r0.length()
            int r5 = r5 - r3
            r3 = 0
            r4 = r3
        L2d:
            if (r4 >= r5) goto L37
            java.lang.String r6 = "0"
            r0.insert(r3, r6)
            int r4 = r4 + 1
            goto L2d
        L37:
            java.lang.String r3 = r0.toString()
            goto L45
        L3c:
            int r3 = r0.length()
            int r3 = r3 - r5
            java.lang.String r3 = r0.substring(r3)
        L45:
            byte[] r3 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(r3)
            java.io.OutputStream r4 = r2.out
            r4.write(r3)
            int r3 = r3.length
            r2.count(r3)
            return
    }

    private void writeBinaryLong(long r1, int r3, boolean r4) throws java.io.IOException {
            r0 = this;
            byte[] r1 = org.apache.commons.compress.archivers.cpio.CpioUtil.long2byteArray(r1, r3, r4)
            java.io.OutputStream r2 = r0.out
            r2.write(r1)
            int r1 = r1.length
            r0.count(r1)
            return
    }

    private void writeCString(byte[] r3) throws java.io.IOException {
            r2 = this;
            java.io.OutputStream r0 = r2.out
            r0.write(r3)
            java.io.OutputStream r0 = r2.out
            r1 = 0
            r0.write(r1)
            int r3 = r3.length
            int r3 = r3 + 1
            r2.count(r3)
            return
    }

    private void writeHeader(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r6) throws java.io.IOException {
            r5 = this;
            short r0 = r6.getFormat()
            r1 = 6
            r2 = 1
            if (r0 == r2) goto L58
            r3 = 2
            if (r0 == r3) goto L46
            r4 = 4
            if (r0 == r4) goto L34
            r1 = 8
            if (r0 != r1) goto L1b
            r0 = 29127(0x71c7, double:1.43907E-319)
            r5.writeBinaryLong(r0, r3, r2)
            r5.writeOldBinaryEntry(r6, r2)
            goto L69
        L1b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown format "
            r1.<init>(r2)
            short r6 = r6.getFormat()
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L34:
            java.io.OutputStream r0 = r5.out
            java.lang.String r2 = "070707"
            byte[] r2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(r2)
            r0.write(r2)
            r5.count(r1)
            r5.writeOldAsciiEntry(r6)
            goto L69
        L46:
            java.io.OutputStream r0 = r5.out
            java.lang.String r2 = "070702"
            byte[] r2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(r2)
            r0.write(r2)
            r5.count(r1)
            r5.writeNewEntry(r6)
            goto L69
        L58:
            java.io.OutputStream r0 = r5.out
            java.lang.String r2 = "070701"
            byte[] r2 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiBytes(r2)
            r0.write(r2)
            r5.count(r1)
            r5.writeNewEntry(r6)
        L69:
            return
    }

    private void writeNewEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r12) throws java.io.IOException {
            r11 = this;
            long r0 = r12.getInode()
            long r2 = r12.getDeviceMin()
            java.lang.String r4 = "TRAILER!!!"
            java.lang.String r5 = r12.getName()
            boolean r4 = r4.equals(r5)
            r5 = 1
            r7 = 0
            if (r4 == 0) goto L1b
            r0 = r7
            r2 = r0
            goto L3e
        L1b:
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 != 0) goto L2e
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L2e
            long r0 = r11.nextArtificalDeviceAndInode
            long r2 = r0 + r5
            r11.nextArtificalDeviceAndInode = r2
            r2 = 32
            long r2 = r0 >> r2
            goto L3e
        L2e:
            long r7 = r11.nextArtificalDeviceAndInode
            r9 = 4294967296(0x100000000, double:2.121995791E-314)
            long r9 = r9 * r2
            long r9 = r9 + r0
            long r7 = java.lang.Math.max(r7, r9)
            long r7 = r7 + r5
            r11.nextArtificalDeviceAndInode = r7
        L3e:
            r4 = 8
            r7 = 16
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getMode()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getUID()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getGID()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getNumberOfLinks()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getTime()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getSize()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getDeviceMaj()
            r11.writeAsciiLong(r0, r4, r7)
            r11.writeAsciiLong(r2, r4, r7)
            long r0 = r12.getRemoteDeviceMaj()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getRemoteDeviceMin()
            r11.writeAsciiLong(r0, r4, r7)
            java.lang.String r0 = r12.getName()
            byte[] r0 = r11.encode(r0)
            int r1 = r0.length
            long r1 = (long) r1
            long r1 = r1 + r5
            r11.writeAsciiLong(r1, r4, r7)
            long r1 = r12.getChksum()
            r11.writeAsciiLong(r1, r4, r7)
            r11.writeCString(r0)
            int r0 = r0.length
            long r0 = (long) r0
            int r12 = r12.getHeaderPadCount(r0)
            r11.pad(r12)
            return
    }

    private void writeOldAsciiEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r12) throws java.io.IOException {
            r11 = this;
            long r0 = r12.getInode()
            long r2 = r12.getDevice()
            java.lang.String r4 = "TRAILER!!!"
            java.lang.String r5 = r12.getName()
            boolean r4 = r4.equals(r5)
            r5 = 1
            r7 = 0
            if (r4 == 0) goto L1b
            r0 = r7
            r2 = r0
            goto L42
        L1b:
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 != 0) goto L34
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L34
            long r0 = r11.nextArtificalDeviceAndInode
            r2 = 262143(0x3ffff, double:1.29516E-318)
            long r7 = r0 & r2
            long r9 = r0 + r5
            r11.nextArtificalDeviceAndInode = r9
            r4 = 18
            long r0 = r0 >> r4
            long r2 = r2 & r0
            r0 = r7
            goto L42
        L34:
            long r7 = r11.nextArtificalDeviceAndInode
            r9 = 262144(0x40000, double:1.295163E-318)
            long r9 = r9 * r2
            long r9 = r9 + r0
            long r7 = java.lang.Math.max(r7, r9)
            long r7 = r7 + r5
            r11.nextArtificalDeviceAndInode = r7
        L42:
            r4 = 6
            r7 = 8
            r11.writeAsciiLong(r2, r4, r7)
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getMode()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getUID()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getGID()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getNumberOfLinks()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getRemoteDevice()
            r11.writeAsciiLong(r0, r4, r7)
            long r0 = r12.getTime()
            r2 = 11
            r11.writeAsciiLong(r0, r2, r7)
            java.lang.String r0 = r12.getName()
            byte[] r0 = r11.encode(r0)
            int r1 = r0.length
            long r8 = (long) r1
            long r8 = r8 + r5
            r11.writeAsciiLong(r8, r4, r7)
            long r3 = r12.getSize()
            r11.writeAsciiLong(r3, r2, r7)
            r11.writeCString(r0)
            return
    }

    private void writeOldBinaryEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r12, boolean r13) throws java.io.IOException {
            r11 = this;
            long r0 = r12.getInode()
            long r2 = r12.getDevice()
            java.lang.String r4 = "TRAILER!!!"
            java.lang.String r5 = r12.getName()
            boolean r4 = r4.equals(r5)
            r5 = 1
            r7 = 0
            if (r4 == 0) goto L1b
            r0 = r7
            r2 = r0
            goto L42
        L1b:
            int r4 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r4 != 0) goto L34
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L34
            long r0 = r11.nextArtificalDeviceAndInode
            r2 = 65535(0xffff, double:3.23786E-319)
            long r7 = r0 & r2
            long r9 = r0 + r5
            r11.nextArtificalDeviceAndInode = r9
            r4 = 16
            long r0 = r0 >> r4
            long r2 = r2 & r0
            r0 = r7
            goto L42
        L34:
            long r7 = r11.nextArtificalDeviceAndInode
            r9 = 65536(0x10000, double:3.2379E-319)
            long r9 = r9 * r2
            long r9 = r9 + r0
            long r7 = java.lang.Math.max(r7, r9)
            long r7 = r7 + r5
            r11.nextArtificalDeviceAndInode = r7
        L42:
            r4 = 2
            r11.writeBinaryLong(r2, r4, r13)
            r11.writeBinaryLong(r0, r4, r13)
            long r0 = r12.getMode()
            r11.writeBinaryLong(r0, r4, r13)
            long r0 = r12.getUID()
            r11.writeBinaryLong(r0, r4, r13)
            long r0 = r12.getGID()
            r11.writeBinaryLong(r0, r4, r13)
            long r0 = r12.getNumberOfLinks()
            r11.writeBinaryLong(r0, r4, r13)
            long r0 = r12.getRemoteDevice()
            r11.writeBinaryLong(r0, r4, r13)
            long r0 = r12.getTime()
            r2 = 4
            r11.writeBinaryLong(r0, r2, r13)
            java.lang.String r0 = r12.getName()
            byte[] r0 = r11.encode(r0)
            int r1 = r0.length
            long r7 = (long) r1
            long r7 = r7 + r5
            r11.writeBinaryLong(r7, r4, r13)
            long r3 = r12.getSize()
            r11.writeBinaryLong(r3, r2, r13)
            r11.writeCString(r0)
            int r13 = r0.length
            long r0 = (long) r13
            int r12 = r12.getHeaderPadCount(r0)
            r11.pad(r12)
            return
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
            r4 = this;
            r4.checkFinished()
            r4.checkOpen()
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r4.entry
            if (r0 == 0) goto L72
            long r0 = r0.getSize()
            long r2 = r4.written
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L45
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r4.entry
            int r0 = r0.getDataPadCount()
            r4.pad(r0)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r4.entry
            short r0 = r0.getFormat()
            r1 = 2
            if (r0 != r1) goto L3b
            long r0 = r4.crc
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r2 = r4.entry
            long r2 = r2.getChksum()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L33
            goto L3b
        L33:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "CRC Error"
            r0.<init>(r1)
            throw r0
        L3b:
            r0 = 0
            r4.entry = r0
            r0 = 0
            r4.crc = r0
            r4.written = r0
            return
        L45:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid entry size (expected "
            r1.<init>(r2)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r2 = r4.entry
            long r2 = r2.getSize()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " but got "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r4.written
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " bytes)"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L72:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Trying to close non-existent entry"
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.io.File r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r1 = r0.createArchiveEntry(r1, r2)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry createArchiveEntry(java.nio.file.Path r1, java.lang.String r2, java.nio.file.LinkOption[] r3) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r1 = r0.createArchiveEntry(r1, r2, r3)
            return r1
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.cpio.CpioArchiveEntry createArchiveEntry(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            r1.checkFinished()
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
            r0.<init>(r2, r3)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public org.apache.commons.compress.archivers.cpio.CpioArchiveEntry createArchiveEntry(java.nio.file.Path r2, java.lang.String r3, java.nio.file.LinkOption... r4) throws java.io.IOException {
            r1 = this;
            r1.checkFinished()
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
            r0.<init>(r2, r3, r4)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws java.io.IOException {
            r5 = this;
            r5.checkOpen()
            r5.checkFinished()
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r5.entry
            if (r0 != 0) goto L3a
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
            short r1 = r5.entryFormat
            r0.<init>(r1)
            r5.entry = r0
            java.lang.String r1 = "TRAILER!!!"
            r0.setName(r1)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r5.entry
            r1 = 1
            r0.setNumberOfLinks(r1)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r5.entry
            r5.writeHeader(r0)
            r5.closeArchiveEntry()
            long r0 = r5.getBytesWritten()
            int r2 = r5.blockSize
            long r3 = (long) r2
            long r0 = r0 % r3
            int r0 = (int) r0
            if (r0 == 0) goto L36
            int r2 = r2 - r0
            r5.pad(r2)
        L36:
            super.finish()
            return
        L3a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "This archive contains unclosed entries."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public /* bridge */ /* synthetic */ void putArchiveEntry(org.apache.commons.compress.archivers.ArchiveEntry r1) throws java.io.IOException {
            r0 = this;
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r1 = (org.apache.commons.compress.archivers.cpio.CpioArchiveEntry) r1
            r0.putArchiveEntry(r1)
            return
    }

    public void putArchiveEntry(org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r5) throws java.io.IOException {
            r4 = this;
            r4.checkFinished()
            r4.checkOpen()
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r4.entry
            if (r0 == 0) goto Ld
            r4.closeArchiveEntry()
        Ld:
            long r0 = r5.getTime()
            r2 = -1
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L21
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            r5.setTime(r0)
        L21:
            short r0 = r5.getFormat()
            short r1 = r4.entryFormat
            if (r0 != r1) goto L58
            java.util.HashMap<java.lang.String, org.apache.commons.compress.archivers.cpio.CpioArchiveEntry> r0 = r4.names
            java.lang.String r1 = r5.getName()
            java.lang.Object r0 = r0.put(r1, r5)
            if (r0 != 0) goto L3f
            r4.writeHeader(r5)
            r4.entry = r5
            r0 = 0
            r4.written = r0
            return
        L3f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Duplicate entry: "
            r1.<init>(r2)
            java.lang.String r5 = r5.getName()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L58:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Header format: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " does not match existing format: "
            java.lang.StringBuilder r0 = r0.append(r1)
            short r1 = r4.entryFormat
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r8, int r9, int r10) throws java.io.IOException {
            r7 = this;
            r7.checkOpen()
            if (r9 < 0) goto L5b
            if (r10 < 0) goto L5b
            int r0 = r8.length
            int r0 = r0 - r10
            if (r9 > r0) goto L5b
            if (r10 != 0) goto Le
            return
        Le:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.entry
            if (r0 == 0) goto L53
            long r1 = r7.written
            long r3 = (long) r10
            long r1 = r1 + r3
            long r5 = r0.getSize()
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 > 0) goto L4b
            java.io.OutputStream r0 = r7.out
            r0.write(r8, r9, r10)
            long r0 = r7.written
            long r0 = r0 + r3
            r7.written = r0
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r9 = r7.entry
            short r9 = r9.getFormat()
            r0 = 2
            if (r9 != r0) goto L47
            r9 = 0
        L32:
            if (r9 >= r10) goto L47
            long r0 = r7.crc
            r2 = r8[r9]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r7.crc = r0
            int r9 = r9 + 1
            goto L32
        L47:
            r7.count(r10)
            return
        L4b:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "Attempt to write past end of STORED entry"
            r8.<init>(r9)
            throw r8
        L53:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r9 = "No current CPIO entry"
            r8.<init>(r9)
            throw r8
        L5b:
            java.lang.IndexOutOfBoundsException r8 = new java.lang.IndexOutOfBoundsException
            r8.<init>()
            throw r8
    }
}
