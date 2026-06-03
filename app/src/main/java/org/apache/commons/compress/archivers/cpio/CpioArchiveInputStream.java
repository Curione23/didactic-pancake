package org.apache.commons.compress.archivers.cpio;

/* JADX INFO: loaded from: classes2.dex */
public class CpioArchiveInputStream extends org.apache.commons.compress.archivers.ArchiveInputStream<org.apache.commons.compress.archivers.cpio.CpioArchiveEntry> implements org.apache.commons.compress.archivers.cpio.CpioConstants {
    private final int blockSize;
    private boolean closed;
    private long crc;
    private org.apache.commons.compress.archivers.cpio.CpioArchiveEntry entry;
    private long entryBytesRead;
    private boolean entryEOF;
    private final byte[] fourBytesBuf;
    private final byte[] sixBytesBuf;
    private final byte[] tmpbuf;
    private final byte[] twoBytesBuf;
    private final org.apache.commons.compress.archivers.zip.ZipEncoding zipEncoding;

    public CpioArchiveInputStream(java.io.InputStream r3) {
            r2 = this;
            r0 = 512(0x200, float:7.17E-43)
            java.lang.String r1 = org.apache.commons.compress.archivers.cpio.CpioUtil.DEFAULT_CHARSET_NAME
            r2.<init>(r3, r0, r1)
            return
    }

    public CpioArchiveInputStream(java.io.InputStream r2, int r3) {
            r1 = this;
            java.lang.String r0 = org.apache.commons.compress.archivers.cpio.CpioUtil.DEFAULT_CHARSET_NAME
            r1.<init>(r2, r3, r0)
            return
    }

    public CpioArchiveInputStream(java.io.InputStream r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r2, r4)
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.tmpbuf = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r1.twoBytesBuf = r0
            r0 = 4
            byte[] r0 = new byte[r0]
            r1.fourBytesBuf = r0
            r0 = 6
            byte[] r0 = new byte[r0]
            r1.sixBytesBuf = r0
            r1.in = r2
            if (r3 <= 0) goto L25
            r1.blockSize = r3
            org.apache.commons.compress.archivers.zip.ZipEncoding r2 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.getZipEncoding(r4)
            r1.zipEncoding = r2
            return
        L25:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "blockSize must be bigger than 0"
            r2.<init>(r3)
            throw r2
    }

    public CpioArchiveInputStream(java.io.InputStream r2, java.lang.String r3) {
            r1 = this;
            r0 = 512(0x200, float:7.17E-43)
            r1.<init>(r2, r0, r3)
            return
    }

    private void closeEntry() throws java.io.IOException {
            r4 = this;
        L0:
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r2 = r4.skip(r0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L0
        Lc:
            return
    }

    private void ensureOpen() throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.closed
            if (r0 != 0) goto L5
            return
        L5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Stream closed"
            r0.<init>(r1)
            throw r0
    }

    public static boolean matches(byte[] r5, int r6) {
            r0 = 6
            r1 = 0
            if (r6 >= r0) goto L5
            return r1
        L5:
            r6 = r5[r1]
            r0 = 199(0xc7, float:2.79E-43)
            r2 = 113(0x71, float:1.58E-43)
            r3 = 1
            if (r6 != r2) goto L15
            r4 = r5[r3]
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != r0) goto L15
            return r3
        L15:
            r4 = r5[r3]
            if (r4 != r2) goto L1e
            r2 = r6 & 255(0xff, float:3.57E-43)
            if (r2 != r0) goto L1e
            return r3
        L1e:
            r0 = 48
            if (r6 == r0) goto L23
            return r1
        L23:
            r6 = 55
            if (r4 == r6) goto L28
            return r1
        L28:
            r2 = 2
            r2 = r5[r2]
            if (r2 == r0) goto L2e
            return r1
        L2e:
            r2 = 3
            r2 = r5[r2]
            if (r2 == r6) goto L34
            return r1
        L34:
            r2 = 4
            r2 = r5[r2]
            if (r2 == r0) goto L3a
            return r1
        L3a:
            r0 = 5
            r5 = r5[r0]
            r0 = 49
            if (r5 != r0) goto L42
            return r3
        L42:
            r0 = 50
            if (r5 != r0) goto L47
            return r3
        L47:
            if (r5 != r6) goto L4a
            return r3
        L4a:
            return r1
    }

    private long readAsciiLong(int r1, int r2) throws java.io.IOException {
            r0 = this;
            byte[] r1 = r0.readRange(r1)
            java.lang.String r1 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r1)
            long r1 = org.apache.commons.compress.utils.ParsingUtils.parseLongValue(r1, r2)
            return r1
    }

    private long readBinaryLong(int r1, boolean r2) throws java.io.IOException {
            r0 = this;
            byte[] r1 = r0.readRange(r1)
            long r1 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(r1, r2)
            return r1
    }

    private java.lang.String readCString(int r3) throws java.io.IOException {
            r2 = this;
            int r3 = r3 + (-1)
            byte[] r3 = r2.readRange(r3)
            java.io.InputStream r0 = r2.in
            int r0 = r0.read()
            r1 = -1
            if (r0 == r1) goto L16
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = r2.zipEncoding
            java.lang.String r3 = r0.decode(r3)
            return r3
        L16:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    private int readFully(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            java.io.InputStream r0 = r1.in
            int r2 = org.apache.commons.compress.utils.IOUtils.readFully(r0, r2, r3, r4)
            r1.count(r2)
            if (r2 < r4) goto Lc
            return r2
        Lc:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
    }

    private org.apache.commons.compress.archivers.cpio.CpioArchiveEntry readNewEntry(boolean r10) throws java.io.IOException {
            r9 = this;
            if (r10 == 0) goto L9
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
            r0 = 2
            r10.<init>(r0)
            goto Lf
        L9:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r10 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
            r0 = 1
            r10.<init>(r0)
        Lf:
            r0 = 8
            r1 = 16
            long r2 = r9.readAsciiLong(r0, r1)
            r10.setInode(r2)
            long r2 = r9.readAsciiLong(r0, r1)
            long r4 = org.apache.commons.compress.archivers.cpio.CpioUtil.fileType(r2)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2b
            r10.setMode(r2)
        L2b:
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setUID(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setGID(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setNumberOfLinks(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setTime(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setSize(r4)
            long r4 = r10.getSize()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto Ld4
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setDeviceMaj(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setDeviceMin(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setRemoteDeviceMaj(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            r10.setRemoteDeviceMin(r4)
            long r4 = r9.readAsciiLong(r0, r1)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto Lcc
            long r0 = r9.readAsciiLong(r0, r1)
            r10.setChksum(r0)
            int r0 = (int) r4
            java.lang.String r0 = r9.readCString(r0)
            r10.setName(r0)
            long r1 = org.apache.commons.compress.archivers.cpio.CpioUtil.fileType(r2)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto Lc1
            java.lang.String r1 = "TRAILER!!!"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L9a
            goto Lc1
        L9a:
            java.io.IOException r10 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Mode 0 only allowed in the trailer. Found entry name: "
            r1.<init>(r2)
            java.lang.String r0 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(r0)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " Occurred at byte: "
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r9.getBytesRead()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        Lc1:
            r0 = 1
            long r4 = r4 - r0
            int r0 = r10.getHeaderPadCount(r4)
            r9.skip(r0)
            return r10
        Lcc:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "Found illegal entry with negative name length"
            r10.<init>(r0)
            throw r10
        Ld4:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "Found illegal entry with negative length"
            r10.<init>(r0)
            throw r10
    }

    private org.apache.commons.compress.archivers.cpio.CpioArchiveEntry readOldAsciiEntry() throws java.io.IOException {
            r11 = this;
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
            r1 = 4
            r0.<init>(r1)
            r1 = 6
            r2 = 8
            long r3 = r11.readAsciiLong(r1, r2)
            r0.setDevice(r3)
            long r3 = r11.readAsciiLong(r1, r2)
            r0.setInode(r3)
            long r3 = r11.readAsciiLong(r1, r2)
            long r5 = org.apache.commons.compress.archivers.cpio.CpioUtil.fileType(r3)
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L28
            r0.setMode(r3)
        L28:
            long r5 = r11.readAsciiLong(r1, r2)
            r0.setUID(r5)
            long r5 = r11.readAsciiLong(r1, r2)
            r0.setGID(r5)
            long r5 = r11.readAsciiLong(r1, r2)
            r0.setNumberOfLinks(r5)
            long r5 = r11.readAsciiLong(r1, r2)
            r0.setRemoteDevice(r5)
            r5 = 11
            long r9 = r11.readAsciiLong(r5, r2)
            r0.setTime(r9)
            long r9 = r11.readAsciiLong(r1, r2)
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 < 0) goto Lad
            long r1 = r11.readAsciiLong(r5, r2)
            r0.setSize(r1)
            long r1 = r0.getSize()
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 < 0) goto La5
            int r1 = (int) r9
            java.lang.String r1 = r11.readCString(r1)
            r0.setName(r1)
            long r2 = org.apache.commons.compress.archivers.cpio.CpioUtil.fileType(r3)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto La4
            java.lang.String r2 = "TRAILER!!!"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L7d
            goto La4
        L7d:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Mode 0 only allowed in the trailer. Found entry: "
            r2.<init>(r3)
            java.lang.String r1 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(r1)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " Occurred at byte: "
            java.lang.StringBuilder r1 = r1.append(r2)
            long r2 = r11.getBytesRead()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La4:
            return r0
        La5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Found illegal entry with negative length"
            r0.<init>(r1)
            throw r0
        Lad:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Found illegal entry with negative name length"
            r0.<init>(r1)
            throw r0
    }

    private org.apache.commons.compress.archivers.cpio.CpioArchiveEntry readOldBinaryEntry(boolean r11) throws java.io.IOException {
            r10 = this;
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = new org.apache.commons.compress.archivers.cpio.CpioArchiveEntry
            r1 = 8
            r0.<init>(r1)
            r1 = 2
            long r2 = r10.readBinaryLong(r1, r11)
            r0.setDevice(r2)
            long r2 = r10.readBinaryLong(r1, r11)
            r0.setInode(r2)
            long r2 = r10.readBinaryLong(r1, r11)
            long r4 = org.apache.commons.compress.archivers.cpio.CpioUtil.fileType(r2)
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L27
            r0.setMode(r2)
        L27:
            long r4 = r10.readBinaryLong(r1, r11)
            r0.setUID(r4)
            long r4 = r10.readBinaryLong(r1, r11)
            r0.setGID(r4)
            long r4 = r10.readBinaryLong(r1, r11)
            r0.setNumberOfLinks(r4)
            long r4 = r10.readBinaryLong(r1, r11)
            r0.setRemoteDevice(r4)
            r4 = 4
            long r8 = r10.readBinaryLong(r4, r11)
            r0.setTime(r8)
            long r8 = r10.readBinaryLong(r1, r11)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 < 0) goto Lb5
            long r4 = r10.readBinaryLong(r4, r11)
            r0.setSize(r4)
            long r4 = r0.getSize()
            int r11 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r11 < 0) goto Lad
            int r11 = (int) r8
            java.lang.String r11 = r10.readCString(r11)
            r0.setName(r11)
            long r1 = org.apache.commons.compress.archivers.cpio.CpioUtil.fileType(r2)
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto La2
            java.lang.String r1 = "TRAILER!!!"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L7b
            goto La2
        L7b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Mode 0 only allowed in the trailer. Found entry: "
            r1.<init>(r2)
            java.lang.String r11 = org.apache.commons.compress.utils.ArchiveUtils.sanitize(r11)
            java.lang.StringBuilder r11 = r1.append(r11)
            java.lang.String r1 = "Occurred at byte: "
            java.lang.StringBuilder r11 = r11.append(r1)
            long r1 = r10.getBytesRead()
            java.lang.StringBuilder r11 = r11.append(r1)
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
        La2:
            r1 = 1
            long r8 = r8 - r1
            int r11 = r0.getHeaderPadCount(r8)
            r10.skip(r11)
            return r0
        Lad:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "Found illegal entry with negative length"
            r11.<init>(r0)
            throw r11
        Lb5:
            java.io.IOException r11 = new java.io.IOException
            java.lang.String r0 = "Found illegal entry with negative name length"
            r11.<init>(r0)
            throw r11
    }

    private byte[] readRange(int r3) throws java.io.IOException {
            r2 = this;
            java.io.InputStream r0 = r2.in
            byte[] r0 = org.apache.commons.compress.utils.IOUtils.readRange(r0, r3)
            int r1 = r0.length
            r2.count(r1)
            int r1 = r0.length
            if (r1 < r3) goto Le
            return r0
        Le:
            java.io.EOFException r3 = new java.io.EOFException
            r3.<init>()
            throw r3
    }

    private void skip(int r3) throws java.io.IOException {
            r2 = this;
            if (r3 <= 0) goto L8
            byte[] r0 = r2.fourBytesBuf
            r1 = 0
            r2.readFully(r0, r1, r3)
        L8:
            return
    }

    private void skipRemainderOfLastBlock() throws java.io.IOException {
            r9 = this;
            long r0 = r9.getBytesRead()
            int r2 = r9.blockSize
            long r3 = (long) r2
            long r0 = r0 % r3
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L10
            r5 = r3
            goto L12
        L10:
            long r5 = (long) r2
            long r5 = r5 - r0
        L12:
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 <= 0) goto L25
            int r2 = r9.blockSize
            long r7 = (long) r2
            long r7 = r7 - r0
            long r7 = r9.skip(r7)
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 > 0) goto L23
            goto L25
        L23:
            long r5 = r5 - r7
            goto L12
        L25:
            return
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws java.io.IOException {
            r1 = this;
            r1.ensureOpen()
            boolean r0 = r1.entryEOF
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = 1
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.closed
            if (r0 != 0) goto Lc
            java.io.InputStream r0 = r1.in
            r0.close()
            r0 = 1
            r1.closed = r0
        Lc:
            return
    }

    @java.lang.Deprecated
    public org.apache.commons.compress.archivers.cpio.CpioArchiveEntry getNextCPIOEntry() throws java.io.IOException {
            r7 = this;
            r7.ensureOpen()
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.entry
            if (r0 == 0) goto La
            r7.closeEntry()
        La:
            byte[] r0 = r7.twoBytesBuf
            int r1 = r0.length
            r2 = 0
            r7.readFully(r0, r2, r1)
            byte[] r0 = r7.twoBytesBuf
            long r0 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(r0, r2)
            r3 = 29127(0x71c7, double:1.43907E-319)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L26
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.readOldBinaryEntry(r2)
            r7.entry = r0
            goto Lb7
        L26:
            byte[] r0 = r7.twoBytesBuf
            long r5 = org.apache.commons.compress.archivers.cpio.CpioUtil.byteArray2long(r0, r1)
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L38
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.readOldBinaryEntry(r1)
            r7.entry = r0
            goto Lb7
        L38:
            byte[] r0 = r7.twoBytesBuf
            byte[] r3 = r7.sixBytesBuf
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r2, r4)
            byte[] r0 = r7.sixBytesBuf
            byte[] r3 = r7.twoBytesBuf
            int r3 = r3.length
            byte[] r4 = r7.fourBytesBuf
            int r4 = r4.length
            r7.readFully(r0, r3, r4)
            byte[] r0 = r7.sixBytesBuf
            java.lang.String r0 = org.apache.commons.compress.utils.ArchiveUtils.toAsciiString(r0)
            r0.hashCode()
            int r3 = r0.hashCode()
            r4 = -1
            switch(r3) {
                case 1426477263: goto L73;
                case 1426477264: goto L68;
                case 1426477269: goto L5d;
                default: goto L5c;
            }
        L5c:
            goto L7d
        L5d:
            java.lang.String r3 = "070707"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L66
            goto L7d
        L66:
            r4 = 2
            goto L7d
        L68:
            java.lang.String r3 = "070702"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L71
            goto L7d
        L71:
            r4 = r1
            goto L7d
        L73:
            java.lang.String r3 = "070701"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L7c
            goto L7d
        L7c:
            r4 = r2
        L7d:
            switch(r4) {
                case 0: goto Lb1;
                case 1: goto Laa;
                case 2: goto La3;
                default: goto L80;
            }
        L80:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unknown magic ["
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r2 = "]. Occurred at byte: "
            java.lang.StringBuilder r0 = r0.append(r2)
            long r2 = r7.getBytesRead()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        La3:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.readOldAsciiEntry()
            r7.entry = r0
            goto Lb7
        Laa:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.readNewEntry(r1)
            r7.entry = r0
            goto Lb7
        Lb1:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.readNewEntry(r2)
            r7.entry = r0
        Lb7:
            r3 = 0
            r7.entryBytesRead = r3
            r7.entryEOF = r2
            r7.crc = r3
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.entry
            java.lang.String r0 = r0.getName()
            java.lang.String r2 = "TRAILER!!!"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Ld4
            r7.entryEOF = r1
            r7.skipRemainderOfLastBlock()
            r0 = 0
            return r0
        Ld4:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r7.entry
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public /* bridge */ /* synthetic */ org.apache.commons.compress.archivers.ArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r1.getNextEntry()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.ArchiveInputStream
    public org.apache.commons.compress.archivers.cpio.CpioArchiveEntry getNextEntry() throws java.io.IOException {
            r1 = this;
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r0 = r1.getNextCPIOEntry()
            return r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r11, int r12, int r13) throws java.io.IOException {
            r10 = this;
            r10.ensureOpen()
            if (r12 < 0) goto L9d
            if (r13 < 0) goto L9d
            int r0 = r11.length
            int r0 = r0 - r13
            if (r12 > r0) goto L9d
            r0 = 0
            if (r13 != 0) goto Lf
            return r0
        Lf:
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r1 = r10.entry
            r2 = -1
            if (r1 == 0) goto L9c
            boolean r3 = r10.entryEOF
            if (r3 == 0) goto L1a
            goto L9c
        L1a:
            long r3 = r10.entryBytesRead
            long r5 = r1.getSize()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r3 = 2
            if (r1 != 0) goto L60
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r11 = r10.entry
            int r11 = r11.getDataPadCount()
            r10.skip(r11)
            r11 = 1
            r10.entryEOF = r11
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r11 = r10.entry
            short r11 = r11.getFormat()
            if (r11 != r3) goto L5f
            long r11 = r10.crc
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r13 = r10.entry
            long r0 = r13.getChksum()
            int r11 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r11 != 0) goto L46
            goto L5f
        L46:
            java.io.IOException r11 = new java.io.IOException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "CRC Error. Occurred at byte: "
            r12.<init>(r13)
            long r0 = r10.getBytesRead()
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L5f:
            return r2
        L60:
            long r4 = (long) r13
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r13 = r10.entry
            long r6 = r13.getSize()
            long r8 = r10.entryBytesRead
            long r6 = r6 - r8
            long r4 = java.lang.Math.min(r4, r6)
            int r13 = (int) r4
            if (r13 >= 0) goto L72
            return r2
        L72:
            int r12 = r10.readFully(r11, r12, r13)
            org.apache.commons.compress.archivers.cpio.CpioArchiveEntry r13 = r10.entry
            short r13 = r13.getFormat()
            if (r13 != r3) goto L93
        L7e:
            if (r0 >= r12) goto L93
            long r1 = r10.crc
            r13 = r11[r0]
            r13 = r13 & 255(0xff, float:3.57E-43)
            long r3 = (long) r13
            long r1 = r1 + r3
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r10.crc = r1
            int r0 = r0 + 1
            goto L7e
        L93:
            if (r12 <= 0) goto L9b
            long r0 = r10.entryBytesRead
            long r2 = (long) r12
            long r0 = r0 + r2
            r10.entryBytesRead = r0
        L9b:
            return r12
        L9c:
            return r2
        L9d:
            java.lang.IndexOutOfBoundsException r11 = new java.lang.IndexOutOfBoundsException
            r11.<init>()
            throw r11
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long r5) throws java.io.IOException {
            r4 = this;
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L2c
            r4.ensureOpen()
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r5 = java.lang.Math.min(r5, r0)
            int r5 = (int) r5
            r6 = 0
            r0 = r6
        L13:
            if (r0 >= r5) goto L2a
            int r1 = r5 - r0
            byte[] r2 = r4.tmpbuf
            int r3 = r2.length
            if (r1 <= r3) goto L1d
            int r1 = r2.length
        L1d:
            int r1 = r4.read(r2, r6, r1)
            r2 = -1
            if (r1 != r2) goto L28
            r5 = 1
            r4.entryEOF = r5
            goto L2a
        L28:
            int r0 = r0 + r1
            goto L13
        L2a:
            long r5 = (long) r0
            return r5
        L2c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Negative skip length"
            r5.<init>(r6)
            throw r5
    }
}
