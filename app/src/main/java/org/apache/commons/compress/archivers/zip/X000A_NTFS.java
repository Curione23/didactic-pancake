package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class X000A_NTFS implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    public static final org.apache.commons.compress.archivers.zip.ZipShort HEADER_ID = null;
    private static final org.apache.commons.compress.archivers.zip.ZipShort TIME_ATTR_SIZE = null;
    private static final org.apache.commons.compress.archivers.zip.ZipShort TIME_ATTR_TAG = null;
    private org.apache.commons.compress.archivers.zip.ZipEightByteInteger accessTime;
    private org.apache.commons.compress.archivers.zip.ZipEightByteInteger createTime;
    private org.apache.commons.compress.archivers.zip.ZipEightByteInteger modifyTime;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 10
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.X000A_NTFS.HEADER_ID = r0
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 1
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.X000A_NTFS.TIME_ATTR_TAG = r0
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 24
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.X000A_NTFS.TIME_ATTR_SIZE = r0
            return
    }

    public X000A_NTFS() {
            r1 = this;
            r1.<init>()
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            r1.modifyTime = r0
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            r1.accessTime = r0
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            r1.createTime = r0
            return
    }

    private static org.apache.commons.compress.archivers.zip.ZipEightByteInteger dateToZip(java.util.Date r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r1 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r3)
            r0.<init>(r1)
            return r0
    }

    private static org.apache.commons.compress.archivers.zip.ZipEightByteInteger fileTimeToZip(java.nio.file.attribute.FileTime r3) {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r1 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r3)
            r0.<init>(r1)
            return r0
    }

    private void readTimeAttr(byte[] r2, int r3, int r4) {
            r1 = this;
            r0 = 26
            if (r4 < r0) goto L2c
            org.apache.commons.compress.archivers.zip.ZipShort r4 = new org.apache.commons.compress.archivers.zip.ZipShort
            r4.<init>(r2, r3)
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X000A_NTFS.TIME_ATTR_SIZE
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L2c
            int r4 = r3 + 2
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r0.<init>(r2, r4)
            r1.modifyTime = r0
            int r4 = r3 + 10
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r0.<init>(r2, r4)
            r1.accessTime = r0
            int r3 = r3 + 18
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r4.<init>(r2, r3)
            r1.createTime = r4
        L2c:
            return
    }

    private void reset() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            r1.modifyTime = r0
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            r1.accessTime = r0
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            r1.createTime = r0
            return
    }

    private static java.util.Date zipToDate(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2) {
            if (r2 == 0) goto L14
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            goto L14
        Lb:
            long r0 = r2.getLongValue()
            java.util.Date r2 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToDate(r0)
            return r2
        L14:
            r2 = 0
            return r2
    }

    private static java.nio.file.attribute.FileTime zipToFileTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2) {
            if (r2 == 0) goto L14
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto Lb
            goto L14
        Lb:
            long r0 = r2.getLongValue()
            java.nio.file.attribute.FileTime r2 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToFileTime(r0)
            return r2
        L14:
            r2 = 0
            return r2
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.compress.archivers.zip.X000A_NTFS
            r1 = 0
            if (r0 == 0) goto L26
            org.apache.commons.compress.archivers.zip.X000A_NTFS r4 = (org.apache.commons.compress.archivers.zip.X000A_NTFS) r4
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r3.modifyTime
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2 = r4.modifyTime
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L26
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r3.accessTime
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2 = r4.accessTime
            boolean r0 = java.util.Objects.equals(r0, r2)
            if (r0 == 0) goto L26
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r3.createTime
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r4 = r4.createTime
            boolean r4 = java.util.Objects.equals(r0, r4)
            if (r4 == 0) goto L26
            r1 = 1
        L26:
            return r1
    }

    public java.nio.file.attribute.FileTime getAccessFileTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.accessTime
            java.nio.file.attribute.FileTime r0 = zipToFileTime(r0)
            return r0
    }

    public java.util.Date getAccessJavaTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.accessTime
            java.util.Date r0 = zipToDate(r0)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipEightByteInteger getAccessTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.accessTime
            return r0
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

    public java.nio.file.attribute.FileTime getCreateFileTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.createTime
            java.nio.file.attribute.FileTime r0 = zipToFileTime(r0)
            return r0
    }

    public java.util.Date getCreateJavaTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.createTime
            java.util.Date r0 = zipToDate(r0)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipEightByteInteger getCreateTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.createTime
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X000A_NTFS.HEADER_ID
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r5 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r5.getLocalFileDataLength()
            int r0 = r0.getValue()
            byte[] r0 = new byte[r0]
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X000A_NTFS.TIME_ATTR_TAG
            byte[] r1 = r1.getBytes()
            r2 = 0
            r3 = 4
            r4 = 2
            java.lang.System.arraycopy(r1, r2, r0, r3, r4)
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X000A_NTFS.TIME_ATTR_SIZE
            byte[] r1 = r1.getBytes()
            r3 = 6
            java.lang.System.arraycopy(r1, r2, r0, r3, r4)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r5.modifyTime
            byte[] r1 = r1.getBytes()
            r3 = 8
            java.lang.System.arraycopy(r1, r2, r0, r3, r3)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r5.accessTime
            byte[] r1 = r1.getBytes()
            r4 = 16
            java.lang.System.arraycopy(r1, r2, r0, r4, r3)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r5.createTime
            byte[] r1 = r1.getBytes()
            r4 = 24
            java.lang.System.arraycopy(r1, r2, r0, r4, r3)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 32
            r0.<init>(r1)
            return r0
    }

    public java.nio.file.attribute.FileTime getModifyFileTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.modifyTime
            java.nio.file.attribute.FileTime r0 = zipToFileTime(r0)
            return r0
    }

    public java.util.Date getModifyJavaTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.modifyTime
            java.util.Date r0 = zipToDate(r0)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipEightByteInteger getModifyTime() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.modifyTime
            return r0
    }

    public int hashCode() {
            r3 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r3.modifyTime
            r1 = -123(0xffffffffffffff85, float:NaN)
            if (r0 == 0) goto Lb
            int r0 = r0.hashCode()
            r1 = r1 ^ r0
        Lb:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r3.accessTime
            if (r0 == 0) goto L1a
            int r0 = r0.hashCode()
            r2 = 11
            int r0 = java.lang.Integer.rotateLeft(r0, r2)
            r1 = r1 ^ r0
        L1a:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r3.createTime
            if (r0 == 0) goto L29
            int r0 = r0.hashCode()
            r2 = 22
            int r0 = java.lang.Integer.rotateLeft(r0, r2)
            r1 = r1 ^ r0
        L29:
            return r1
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            r0.reset()
            r0.parseFromLocalFileData(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r3, int r4, int r5) throws java.util.zip.ZipException {
            r2 = this;
            int r5 = r5 + r4
            int r4 = r4 + 4
        L3:
            int r0 = r4 + 4
            if (r0 > r5) goto L28
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r0.<init>(r3, r4)
            int r4 = r4 + 2
            org.apache.commons.compress.archivers.zip.ZipShort r1 = org.apache.commons.compress.archivers.zip.X000A_NTFS.TIME_ATTR_TAG
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            int r5 = r5 - r4
            r2.readTimeAttr(r3, r4, r5)
            goto L28
        L1b:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r0.<init>(r3, r4)
            int r0 = r0.getValue()
            int r0 = r0 + 2
            int r4 = r4 + r0
            goto L3
        L28:
            return
    }

    public void setAccessFileTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = fileTimeToZip(r1)
            r0.setAccessTime(r1)
            return
    }

    public void setAccessJavaTime(java.util.Date r1) {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = dateToZip(r1)
            r0.setAccessTime(r1)
            return
    }

    public void setAccessTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1) {
            r0 = this;
            if (r1 != 0) goto L4
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
        L4:
            r0.accessTime = r1
            return
    }

    public void setCreateFileTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = fileTimeToZip(r1)
            r0.setCreateTime(r1)
            return
    }

    public void setCreateJavaTime(java.util.Date r1) {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = dateToZip(r1)
            r0.setCreateTime(r1)
            return
    }

    public void setCreateTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1) {
            r0 = this;
            if (r1 != 0) goto L4
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
        L4:
            r0.createTime = r1
            return
    }

    public void setModifyFileTime(java.nio.file.attribute.FileTime r1) {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = fileTimeToZip(r1)
            r0.setModifyTime(r1)
            return
    }

    public void setModifyJavaTime(java.util.Date r1) {
            r0 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = dateToZip(r1)
            r0.setModifyTime(r1)
            return
    }

    public void setModifyTime(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1) {
            r0 = this;
            if (r1 != 0) goto L4
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.ZERO
        L4:
            r0.modifyTime = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "0x000A Zip Extra Field: Modify:["
            r0.<init>(r1)
            java.nio.file.attribute.FileTime r1 = r2.getModifyFileTime()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]  Access:["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.nio.file.attribute.FileTime r1 = r2.getAccessFileTime()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]  Create:["
            java.lang.StringBuilder r0 = r0.append(r1)
            java.nio.file.attribute.FileTime r1 = r2.getCreateFileTime()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "] "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
