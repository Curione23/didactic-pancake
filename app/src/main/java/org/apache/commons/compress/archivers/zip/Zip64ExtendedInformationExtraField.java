package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class Zip64ExtendedInformationExtraField implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    static final org.apache.commons.compress.archivers.zip.ZipShort HEADER_ID = null;
    private static final java.lang.String LFH_MUST_HAVE_BOTH_SIZES_MSG = "Zip64 extended information must contain both size values in the local file header.";
    private org.apache.commons.compress.archivers.zip.ZipEightByteInteger compressedSize;
    private org.apache.commons.compress.archivers.zip.ZipLong diskStart;
    private byte[] rawCentralDirectoryData;
    private org.apache.commons.compress.archivers.zip.ZipEightByteInteger relativeHeaderOffset;
    private org.apache.commons.compress.archivers.zip.ZipEightByteInteger size;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 1
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID = r0
            return
    }

    public Zip64ExtendedInformationExtraField() {
            r0 = this;
            r0.<init>()
            return
    }

    public Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2, org.apache.commons.compress.archivers.zip.ZipEightByteInteger r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r0)
            return
    }

    public Zip64ExtendedInformationExtraField(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1, org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2, org.apache.commons.compress.archivers.zip.ZipEightByteInteger r3, org.apache.commons.compress.archivers.zip.ZipLong r4) {
            r0 = this;
            r0.<init>()
            r0.size = r1
            r0.compressedSize = r2
            r0.relativeHeaderOffset = r3
            r0.diskStart = r4
            return
    }

    private int addSizes(byte[] r5) {
            r4 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r4.size
            r1 = 8
            r2 = 0
            if (r0 == 0) goto L10
            byte[] r0 = r0.getBytes()
            java.lang.System.arraycopy(r0, r2, r5, r2, r1)
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r3 = r4.compressedSize
            if (r3 == 0) goto L1e
            byte[] r3 = r3.getBytes()
            java.lang.System.arraycopy(r3, r2, r5, r0, r1)
            int r0 = r0 + 8
        L1e:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r5 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r5.getCentralDirectoryLength()
            int r0 = r0.getValue()
            byte[] r0 = new byte[r0]
            int r1 = r5.addSizes(r0)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r2 = r5.relativeHeaderOffset
            r3 = 0
            if (r2 == 0) goto L1e
            byte[] r2 = r2.getBytes()
            r4 = 8
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
            int r1 = r1 + 8
        L1e:
            org.apache.commons.compress.archivers.zip.ZipLong r2 = r5.diskStart
            if (r2 == 0) goto L2a
            byte[] r2 = r2.getBytes()
            r4 = 4
            java.lang.System.arraycopy(r2, r3, r0, r1, r4)
        L2a:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r5 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r5.size
            r2 = 8
            r3 = 0
            if (r1 == 0) goto Lb
            r1 = r2
            goto Lc
        Lb:
            r1 = r3
        Lc:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r4 = r5.compressedSize
            if (r4 == 0) goto L12
            r4 = r2
            goto L13
        L12:
            r4 = r3
        L13:
            int r1 = r1 + r4
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r4 = r5.relativeHeaderOffset
            if (r4 == 0) goto L19
            goto L1a
        L19:
            r2 = r3
        L1a:
            int r1 = r1 + r2
            org.apache.commons.compress.archivers.zip.ZipLong r2 = r5.diskStart
            if (r2 == 0) goto L20
            r3 = 4
        L20:
            int r1 = r1 + r3
            r0.<init>(r1)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipEightByteInteger getCompressedSize() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.compressedSize
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipLong getDiskStartNumber() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipLong r0 = r1.diskStart
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField.HEADER_ID
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r2.size
            if (r0 != 0) goto Lc
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r2.compressedSize
            if (r1 == 0) goto L9
            goto Lc
        L9:
            byte[] r0 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
            return r0
        Lc:
            if (r0 == 0) goto L1a
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r2.compressedSize
            if (r0 == 0) goto L1a
            r0 = 16
            byte[] r0 = new byte[r0]
            r2.addSizes(r0)
            return r0
        L1a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Zip64 extended information must contain both size values in the local file header."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = r2.size
            if (r1 == 0) goto L9
            r1 = 16
            goto La
        L9:
            r1 = 0
        La:
            r0.<init>(r1)
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipEightByteInteger getRelativeHeaderOffset() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.relativeHeaderOffset
            return r0
    }

    public org.apache.commons.compress.archivers.zip.ZipEightByteInteger getSize() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = r1.size
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r3, int r4, int r5) throws java.util.zip.ZipException {
            r2 = this;
            byte[] r0 = new byte[r5]
            r2.rawCentralDirectoryData = r0
            r1 = 0
            java.lang.System.arraycopy(r3, r4, r0, r1, r5)
            r0 = 28
            if (r5 < r0) goto L10
            r2.parseFromLocalFileData(r3, r4, r5)
            goto L3c
        L10:
            r0 = 24
            if (r5 != r0) goto L2e
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r5.<init>(r3, r4)
            r2.size = r5
            int r5 = r4 + 8
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r0.<init>(r3, r5)
            r2.compressedSize = r0
            int r4 = r4 + 16
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r5 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r5.<init>(r3, r4)
            r2.relativeHeaderOffset = r5
            goto L3c
        L2e:
            int r0 = r5 % 8
            r1 = 4
            if (r0 != r1) goto L3c
            org.apache.commons.compress.archivers.zip.ZipLong r0 = new org.apache.commons.compress.archivers.zip.ZipLong
            int r4 = r4 + r5
            int r4 = r4 - r1
            r0.<init>(r3, r4)
            r2.diskStart = r0
        L3c:
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r4, int r5, int r6) throws java.util.zip.ZipException {
            r3 = this;
            if (r6 != 0) goto L3
            return
        L3:
            r0 = 16
            if (r6 < r0) goto L35
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r0.<init>(r4, r5)
            r3.size = r0
            int r0 = r5 + 8
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r1.<init>(r4, r0)
            r3.compressedSize = r1
            int r0 = r5 + 16
            int r1 = r6 + (-16)
            r2 = 8
            if (r1 < r2) goto L2a
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r1.<init>(r4, r0)
            r3.relativeHeaderOffset = r1
            int r0 = r5 + 24
            int r1 = r6 + (-24)
        L2a:
            r5 = 4
            if (r1 < r5) goto L34
            org.apache.commons.compress.archivers.zip.ZipLong r5 = new org.apache.commons.compress.archivers.zip.ZipLong
            r5.<init>(r4, r0)
            r3.diskStart = r5
        L34:
            return
        L35:
            java.util.zip.ZipException r4 = new java.util.zip.ZipException
            java.lang.String r5 = "Zip64 extended information must contain both size values in the local file header."
            r4.<init>(r5)
            throw r4
    }

    public void reparseCentralDirectoryData(boolean r6, boolean r7, boolean r8, boolean r9) throws java.util.zip.ZipException {
            r5 = this;
            byte[] r0 = r5.rawCentralDirectoryData
            if (r0 == 0) goto L75
            r1 = 0
            r2 = 8
            if (r6 == 0) goto Lb
            r3 = r2
            goto Lc
        Lb:
            r3 = r1
        Lc:
            if (r7 == 0) goto L10
            r4 = r2
            goto L11
        L10:
            r4 = r1
        L11:
            int r3 = r3 + r4
            if (r8 == 0) goto L16
            r4 = r2
            goto L17
        L16:
            r4 = r1
        L17:
            int r3 = r3 + r4
            if (r9 == 0) goto L1c
            r4 = 4
            goto L1d
        L1c:
            r4 = r1
        L1d:
            int r3 = r3 + r4
            int r0 = r0.length
            if (r0 < r3) goto L53
            if (r6 == 0) goto L2d
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            byte[] r0 = r5.rawCentralDirectoryData
            r6.<init>(r0, r1)
            r5.size = r6
            r1 = r2
        L2d:
            if (r7 == 0) goto L3a
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            byte[] r7 = r5.rawCentralDirectoryData
            r6.<init>(r7, r1)
            r5.compressedSize = r6
            int r1 = r1 + 8
        L3a:
            if (r8 == 0) goto L47
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r6 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            byte[] r7 = r5.rawCentralDirectoryData
            r6.<init>(r7, r1)
            r5.relativeHeaderOffset = r6
            int r1 = r1 + 8
        L47:
            if (r9 == 0) goto L75
            org.apache.commons.compress.archivers.zip.ZipLong r6 = new org.apache.commons.compress.archivers.zip.ZipLong
            byte[] r7 = r5.rawCentralDirectoryData
            r6.<init>(r7, r1)
            r5.diskStart = r6
            goto L75
        L53:
            java.util.zip.ZipException r6 = new java.util.zip.ZipException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Central directory zip64 extended information extra field's length doesn't match central directory data.  Expected length "
            r7.<init>(r8)
            java.lang.StringBuilder r7 = r7.append(r3)
            java.lang.String r8 = " but is "
            java.lang.StringBuilder r7 = r7.append(r8)
            byte[] r8 = r5.rawCentralDirectoryData
            int r8 = r8.length
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L75:
            return
    }

    public void setCompressedSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1) {
            r0 = this;
            r0.compressedSize = r1
            return
    }

    public void setDiskStartNumber(org.apache.commons.compress.archivers.zip.ZipLong r1) {
            r0 = this;
            r0.diskStart = r1
            return
    }

    public void setRelativeHeaderOffset(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1) {
            r0 = this;
            r0.relativeHeaderOffset = r1
            return
    }

    public void setSize(org.apache.commons.compress.archivers.zip.ZipEightByteInteger r1) {
            r0 = this;
            r0.size = r1
            return
    }
}
