package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public final class JarMarker implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    private static final org.apache.commons.compress.archivers.zip.JarMarker DEFAULT = null;
    static final org.apache.commons.compress.archivers.zip.ZipShort ID = null;
    private static final org.apache.commons.compress.archivers.zip.ZipShort NULL = null;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 51966(0xcafe, float:7.282E-41)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.JarMarker.ID = r0
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 0
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.JarMarker.NULL = r0
            org.apache.commons.compress.archivers.zip.JarMarker r0 = new org.apache.commons.compress.archivers.zip.JarMarker
            r0.<init>()
            org.apache.commons.compress.archivers.zip.JarMarker.DEFAULT = r0
            return
    }

    public JarMarker() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.apache.commons.compress.archivers.zip.JarMarker getInstance() {
            org.apache.commons.compress.archivers.zip.JarMarker r0 = org.apache.commons.compress.archivers.zip.JarMarker.DEFAULT
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r1 = this;
            byte[] r0 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.JarMarker.NULL
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.JarMarker.ID
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r1 = this;
            byte[] r0 = org.apache.commons.compress.utils.ByteUtils.EMPTY_BYTE_ARRAY
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.JarMarker.NULL
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            r0.parseFromLocalFileData(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.util.zip.ZipException r1 = new java.util.zip.ZipException
            java.lang.String r2 = "JarMarker doesn't expect any data"
            r1.<init>(r2)
            throw r1
    }
}
