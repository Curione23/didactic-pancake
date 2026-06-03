package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class AsiExtraField implements org.apache.commons.compress.archivers.zip.ZipExtraField, org.apache.commons.compress.archivers.zip.UnixStat, java.lang.Cloneable {
    static final org.apache.commons.compress.archivers.zip.ZipShort HEADER_ID = null;
    private static final int MIN_SIZE = 14;
    private java.util.zip.CRC32 crc;
    private boolean dirFlag;
    private int gid;
    private java.lang.String link;
    private int mode;
    private int uid;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 30062(0x756e, float:4.2126E-41)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.AsiExtraField.HEADER_ID = r0
            return
    }

    public AsiExtraField() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = ""
            r1.link = r0
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r1.crc = r0
            return
    }

    public java.lang.Object clone() {
            r2 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> Le
            org.apache.commons.compress.archivers.zip.AsiExtraField r0 = (org.apache.commons.compress.archivers.zip.AsiExtraField) r0     // Catch: java.lang.CloneNotSupportedException -> Le
            java.util.zip.CRC32 r1 = new java.util.zip.CRC32     // Catch: java.lang.CloneNotSupportedException -> Le
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> Le
            r0.crc = r1     // Catch: java.lang.CloneNotSupportedException -> Le
            return r0
        Le:
            r0 = move-exception
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r1 = this;
            byte[] r0 = r1.getLocalFileDataData()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r1.getLocalFileDataLength()
            return r0
    }

    public int getGroupId() {
            r1 = this;
            int r0 = r1.gid
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.AsiExtraField.HEADER_ID
            return r0
    }

    public java.lang.String getLinkedFile() {
            r1 = this;
            java.lang.String r0 = r1.link
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r9 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r9.getLocalFileDataLength()
            int r0 = r0.getValue()
            int r1 = r0 + (-4)
            byte[] r2 = new byte[r1]
            int r3 = r9.getMode()
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r3)
            r4 = 0
            r5 = 2
            java.lang.System.arraycopy(r3, r4, r2, r4, r5)
            java.lang.String r3 = r9.getLinkedFile()
            java.nio.charset.Charset r6 = java.nio.charset.Charset.defaultCharset()
            byte[] r3 = r3.getBytes(r6)
            int r6 = r3.length
            long r6 = (long) r6
            byte[] r6 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r6)
            r7 = 4
            java.lang.System.arraycopy(r6, r4, r2, r5, r7)
            int r6 = r9.getUserId()
            byte[] r6 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r6)
            r8 = 6
            java.lang.System.arraycopy(r6, r4, r2, r8, r5)
            int r6 = r9.getGroupId()
            byte[] r6 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r6)
            r8 = 8
            java.lang.System.arraycopy(r6, r4, r2, r8, r5)
            r5 = 10
            int r6 = r3.length
            java.lang.System.arraycopy(r3, r4, r2, r5, r6)
            java.util.zip.CRC32 r3 = r9.crc
            r3.reset()
            java.util.zip.CRC32 r3 = r9.crc
            r3.update(r2)
            java.util.zip.CRC32 r3 = r9.crc
            long r5 = r3.getValue()
            byte[] r0 = new byte[r0]
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r5)
            java.lang.System.arraycopy(r3, r4, r0, r4, r7)
            java.lang.System.arraycopy(r2, r4, r0, r7, r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r3 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            java.lang.String r1 = r3.getLinkedFile()
            java.nio.charset.Charset r2 = java.nio.charset.Charset.defaultCharset()
            byte[] r1 = r1.getBytes(r2)
            int r1 = r1.length
            int r1 = r1 + 14
            r0.<init>(r1)
            return r0
    }

    public int getMode() {
            r1 = this;
            int r0 = r1.mode
            return r0
    }

    protected int getMode(int r2) {
            r1 = this;
            boolean r0 = r1.isLink()
            if (r0 == 0) goto La
            r0 = 40960(0xa000, float:5.7397E-41)
            goto L16
        La:
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L13
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L16
        L13:
            r0 = 32768(0x8000, float:4.5918E-41)
        L16:
            r2 = r2 & 4095(0xfff, float:5.738E-42)
            r2 = r2 | r0
            return r2
    }

    public int getUserId() {
            r1 = this;
            int r0 = r1.uid
            return r0
    }

    public boolean isDirectory() {
            r1 = this;
            boolean r0 = r1.dirFlag
            if (r0 == 0) goto Lc
            boolean r0 = r1.isLink()
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    public boolean isLink() {
            r1 = this;
            java.lang.String r0 = r1.getLinkedFile()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            r0.parseFromLocalFileData(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r7, int r8, int r9) throws java.util.zip.ZipException {
            r6 = this;
            r0 = 14
            if (r9 < r0) goto Lab
            long r1 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r7, r8)
            int r3 = r9 + (-4)
            byte[] r4 = new byte[r3]
            int r8 = r8 + 4
            r5 = 0
            java.lang.System.arraycopy(r7, r8, r4, r5, r3)
            java.util.zip.CRC32 r7 = r6.crc
            r7.reset()
            java.util.zip.CRC32 r7 = r6.crc
            r7.update(r4)
            java.util.zip.CRC32 r7 = r6.crc
            long r7 = r7.getValue()
            int r3 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r3 != 0) goto L84
            int r7 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r4, r5)
            r8 = 2
            long r1 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r4, r8)
            int r8 = (int) r1
            if (r8 < 0) goto L69
            int r9 = r9 - r0
            if (r8 > r9) goto L69
            r9 = 6
            int r9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r4, r9)
            r6.uid = r9
            r9 = 8
            int r9 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r4, r9)
            r6.gid = r9
            if (r8 != 0) goto L4b
            java.lang.String r8 = ""
            r6.link = r8
            goto L5d
        L4b:
            byte[] r9 = new byte[r8]
            r0 = 10
            java.lang.System.arraycopy(r4, r0, r9, r5, r8)
            java.lang.String r8 = new java.lang.String
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            r8.<init>(r9, r0)
            r6.link = r8
        L5d:
            r8 = r7 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L62
            r5 = 1
        L62:
            r6.setDirectory(r5)
            r6.setMode(r7)
            return
        L69:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Bad symbolic link name length "
            r9.<init>(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r9 = " in ASI extra field"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L84:
            java.util.zip.ZipException r9 = new java.util.zip.ZipException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Bad CRC checksum, expected "
            r0.<init>(r3)
            java.lang.String r1 = java.lang.Long.toHexString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " instead of "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r7 = java.lang.Long.toHexString(r7)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r9.<init>(r7)
            throw r9
        Lab:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "The length is too short, only "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r9 = " bytes, expected at least 14"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public void setDirectory(boolean r1) {
            r0 = this;
            r0.dirFlag = r1
            int r1 = r0.mode
            int r1 = r0.getMode(r1)
            r0.mode = r1
            return
    }

    public void setGroupId(int r1) {
            r0 = this;
            r0.gid = r1
            return
    }

    public void setLinkedFile(java.lang.String r1) {
            r0 = this;
            r0.link = r1
            int r1 = r0.mode
            int r1 = r0.getMode(r1)
            r0.mode = r1
            return
    }

    public void setMode(int r1) {
            r0 = this;
            int r1 = r0.getMode(r1)
            r0.mode = r1
            return
    }

    public void setUserId(int r1) {
            r0 = this;
            r0.uid = r1
            return
    }
}
