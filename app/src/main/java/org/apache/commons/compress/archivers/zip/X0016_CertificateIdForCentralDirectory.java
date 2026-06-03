package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class X0016_CertificateIdForCentralDirectory extends org.apache.commons.compress.archivers.zip.PKWareExtraHeader {
    static final org.apache.commons.compress.archivers.zip.ZipShort HEADER_ID = null;
    private org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlg;
    private int rcount;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 22
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.HEADER_ID = r0
            return
    }

    public X0016_CertificateIdForCentralDirectory() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory.HEADER_ID
            r1.<init>(r0)
            return
    }

    public org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm getHashAlgorithm() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = r1.hashAlg
            return r0
    }

    public int getRecordCount() {
            r1 = this;
            int r0 = r1.rcount
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.PKWareExtraHeader, org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r2, int r3, int r4) throws java.util.zip.ZipException {
            r1 = this;
            r0 = 4
            r1.assertMinimalLength(r0, r4)
            int r4 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r2, r3)
            r1.rcount = r4
            int r3 = r3 + 2
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r2, r3)
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r2 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(r2)
            r1.hashAlg = r2
            return
    }
}
