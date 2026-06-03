package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class UnrecognizedExtraField implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    private byte[] centralData;
    private org.apache.commons.compress.archivers.zip.ZipShort headerId;
    private byte[] localData;

    public UnrecognizedExtraField() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r1 = this;
            byte[] r0 = r1.centralData
            if (r0 == 0) goto L9
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r0)
            return r0
        L9:
            byte[] r0 = r1.getLocalFileDataData()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r2 = this;
            byte[] r0 = r2.centralData
            if (r0 == 0) goto Ld
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            byte[] r1 = r2.centralData
            int r1 = r1.length
            r0.<init>(r1)
            return r0
        Ld:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r2.getLocalFileDataLength()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r1.headerId
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r1 = this;
            byte[] r0 = r1.localData
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            byte[] r1 = r2.localData
            if (r1 == 0) goto L8
            int r1 = r1.length
            goto L9
        L8:
            r1 = 0
        L9:
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) {
            r0 = this;
            int r3 = r3 + r2
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r0.setCentralDirectoryData(r1)
            byte[] r2 = r0.localData
            if (r2 != 0) goto Lf
            r0.setLocalFileDataData(r1)
        Lf:
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r1, int r2, int r3) {
            r0 = this;
            int r3 = r3 + r2
            byte[] r1 = java.util.Arrays.copyOfRange(r1, r2, r3)
            r0.setLocalFileDataData(r1)
            return
    }

    public void setCentralDirectoryData(byte[] r1) {
            r0 = this;
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r1)
            r0.centralData = r1
            return
    }

    public void setHeaderId(org.apache.commons.compress.archivers.zip.ZipShort r1) {
            r0 = this;
            r0.headerId = r1
            return
    }

    public void setLocalFileDataData(byte[] r1) {
            r0 = this;
            byte[] r1 = org.apache.commons.compress.archivers.zip.ZipUtil.copy(r1)
            r0.localData = r1
            return
    }
}
