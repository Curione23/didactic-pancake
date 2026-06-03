package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public final class UnparseableExtraFieldData implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    private static final org.apache.commons.compress.archivers.zip.ZipShort HEADER_ID = null;
    private byte[] centralDirectoryData;
    private byte[] localFileData;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 44225(0xacc1, float:6.1972E-41)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.HEADER_ID = r0
            return
    }

    public UnparseableExtraFieldData() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r1 = this;
            byte[] r0 = r1.centralDirectoryData
            if (r0 != 0) goto L9
            byte[] r0 = r1.getLocalFileDataData()
            goto Ld
        L9:
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r0)
        Ld:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r2 = this;
            byte[] r0 = r2.centralDirectoryData
            if (r0 != 0) goto L9
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r2.getLocalFileDataLength()
            goto L11
        L9:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            byte[] r1 = r2.centralDirectoryData
            int r1 = r1.length
            r0.<init>(r1)
        L11:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.UnparseableExtraFieldData.HEADER_ID
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r1 = this;
            byte[] r0 = r1.localFileData
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            byte[] r1 = r2.localFileData
            if (r1 != 0) goto L8
            r1 = 0
            goto L9
        L8:
            int r1 = r1.length
        L9:
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r2, int r3, int r4) {
            r1 = this;
            int r0 = r3 + r4
            byte[] r0 = java.util.Arrays.copyOfRange(r2, r3, r0)
            r1.centralDirectoryData = r0
            byte[] r0 = r1.localFileData
            if (r0 != 0) goto Lf
            r1.parseFromLocalFileData(r2, r3, r4)
        Lf:
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r1, int r2, int r3) {
            r0 = this;
            int r3 = r3 + r2
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r0.localFileData = r1
            return
    }
}
