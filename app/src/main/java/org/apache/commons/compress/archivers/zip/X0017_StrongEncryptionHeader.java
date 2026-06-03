package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class X0017_StrongEncryptionHeader extends org.apache.commons.compress.archivers.zip.PKWareExtraHeader {
    static final org.apache.commons.compress.archivers.zip.ZipShort HEADER_ID = null;
    private org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm algId;
    private int bitlen;
    private byte[] erdData;
    private int flags;
    private int format;
    private org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm hashAlg;
    private int hashSize;
    private byte[] ivData;
    private byte[] keyBlob;
    private long rcount;
    private byte[] recipientKeyHash;
    private byte[] vCRC32;
    private byte[] vData;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 23
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.HEADER_ID = r0
            return
    }

    public X0017_StrongEncryptionHeader() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X0017_StrongEncryptionHeader.HEADER_ID
            r1.<init>(r0)
            return
    }

    private void assertDynamicLengthFits(java.lang.String r4, int r5, int r6, int r7) throws java.util.zip.ZipException {
            r3 = this;
            int r0 = r6 + r5
            if (r0 > r7) goto L5
            return
        L5:
            java.util.zip.ZipException r0 = new java.util.zip.ZipException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid X0017_StrongEncryptionHeader: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " "
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = " doesn't fit into "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r7)
            java.lang.String r5 = " bytes of data at position "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm getEncryptionAlgorithm() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = r1.algId
            return r0
    }

    public org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm getHashAlgorithm() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r0 = r1.hashAlg
            return r0
    }

    public long getRecordCount() {
            r2 = this;
            long r0 = r2.rcount
            return r0
    }

    public void parseCentralDirectoryFormat(byte[] r5, int r6, int r7) throws java.util.zip.ZipException {
            r4 = this;
            r0 = 12
            r4.assertMinimalLength(r0, r7)
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r5, r6)
            r4.format = r0
            int r0 = r6 + 2
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r5, r0)
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r0 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(r0)
            r4.algId = r0
            int r0 = r6 + 4
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r5, r0)
            r4.bitlen = r0
            int r0 = r6 + 6
            int r0 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r5, r0)
            r4.flags = r0
            int r0 = r6 + 8
            long r0 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r5, r0)
            r4.rcount = r0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L4e
            r0 = 16
            r4.assertMinimalLength(r0, r7)
            int r7 = r6 + 12
            int r7 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r5, r7)
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r7 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(r7)
            r4.hashAlg = r7
            int r6 = r6 + 14
            int r5 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r5, r6)
            r4.hashSize = r5
        L4e:
            return
    }

    public void parseFileFormat(byte[] r12, int r13, int r14) throws java.util.zip.ZipException {
            r11 = this;
            r0 = 4
            r11.assertMinimalLength(r0, r14)
            int r1 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r13)
            java.lang.String r2 = "ivSize"
            r11.assertDynamicLengthFits(r2, r1, r0, r14)
            int r2 = r13 + 4
            r11.assertMinimalLength(r2, r1)
            byte[] r2 = java.util.Arrays.copyOfRange(r12, r2, r1)
            r11.ivData = r2
            int r2 = r1 + 16
            r11.assertMinimalLength(r2, r14)
            int r13 = r13 + r1
            int r3 = r13 + 6
            int r3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r3)
            r11.format = r3
            int r3 = r13 + 8
            int r3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r3)
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$EncryptionAlgorithm r3 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.EncryptionAlgorithm.getAlgorithmByCode(r3)
            r11.algId = r3
            int r3 = r13 + 10
            int r3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r3)
            r11.bitlen = r3
            int r3 = r13 + 12
            int r3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r3)
            r11.flags = r3
            int r3 = r13 + 14
            int r3 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r3)
            java.lang.String r4 = "erdSize"
            r11.assertDynamicLengthFits(r4, r3, r2, r14)
            int r2 = r13 + 16
            r11.assertMinimalLength(r2, r3)
            byte[] r4 = java.util.Arrays.copyOfRange(r12, r2, r3)
            r11.erdData = r4
            int r4 = r1 + 20
            int r4 = r4 + r3
            r11.assertMinimalLength(r4, r14)
            int r2 = r2 + r3
            long r5 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r12, r2)
            r11.rcount = r5
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            java.lang.String r5 = " is too small to hold CRC"
            java.lang.String r6 = "Invalid X0017_StrongEncryptionHeader: vSize "
            java.lang.String r7 = "vSize"
            if (r2 != 0) goto Lb7
            int r4 = r4 + 2
            r11.assertMinimalLength(r4, r14)
            int r2 = r13 + 20
            int r2 = r2 + r3
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r2)
            int r1 = r1 + 22
            int r1 = r1 + r3
            r11.assertDynamicLengthFits(r7, r2, r1, r14)
            if (r2 < r0) goto La0
            int r13 = r13 + 22
            int r13 = r13 + r3
            int r14 = r2 + (-4)
            r11.assertMinimalLength(r13, r14)
            byte[] r14 = java.util.Arrays.copyOfRange(r12, r13, r14)
            r11.vData = r14
            int r13 = r13 + r2
            int r13 = r13 - r0
            r11.assertMinimalLength(r13, r0)
            byte[] r12 = java.util.Arrays.copyOfRange(r12, r13, r0)
            r11.vCRC32 = r12
            goto L123
        La0:
            java.util.zip.ZipException r12 = new java.util.zip.ZipException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r6)
            java.lang.StringBuilder r13 = r13.append(r2)
            java.lang.StringBuilder r13 = r13.append(r5)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        Lb7:
            int r4 = r4 + 6
            r11.assertMinimalLength(r4, r14)
            int r2 = r13 + 20
            int r2 = r2 + r3
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r2)
            org.apache.commons.compress.archivers.zip.PKWareExtraHeader$HashAlgorithm r2 = org.apache.commons.compress.archivers.zip.PKWareExtraHeader.HashAlgorithm.getAlgorithmByCode(r2)
            r11.hashAlg = r2
            int r2 = r13 + 22
            int r2 = r2 + r3
            int r4 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r2)
            r11.hashSize = r4
            int r4 = r13 + 24
            int r4 = r4 + r3
            int r8 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r4)
            int r9 = r11.hashSize
            if (r8 < r9) goto L13b
            int r9 = r1 + 24
            int r9 = r9 + r3
            java.lang.String r10 = "resize"
            r11.assertDynamicLengthFits(r10, r8, r9, r14)
            int r9 = r11.hashSize
            byte[] r9 = java.util.Arrays.copyOfRange(r12, r4, r9)
            r11.recipientKeyHash = r9
            int r9 = r11.hashSize
            int r4 = r4 + r9
            int r9 = r8 - r9
            byte[] r4 = java.util.Arrays.copyOfRange(r12, r4, r9)
            r11.keyBlob = r4
            int r4 = r1 + 26
            int r4 = r4 + r3
            int r4 = r4 + r8
            int r4 = r4 + 2
            r11.assertMinimalLength(r4, r14)
            int r13 = r13 + 26
            int r13 = r13 + r3
            int r13 = r13 + r8
            int r13 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r12, r13)
            if (r13 < r0) goto L124
            int r1 = r1 + 22
            int r1 = r1 + r3
            int r1 = r1 + r8
            r11.assertDynamicLengthFits(r7, r13, r1, r14)
            int r2 = r2 + r8
            int r14 = r13 + (-4)
            byte[] r14 = java.util.Arrays.copyOfRange(r12, r2, r14)
            r11.vData = r14
            int r2 = r2 + r13
            int r2 = r2 - r0
            byte[] r12 = java.util.Arrays.copyOfRange(r12, r2, r0)
            r11.vCRC32 = r12
        L123:
            return
        L124:
            java.util.zip.ZipException r12 = new java.util.zip.ZipException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r6)
            java.lang.StringBuilder r13 = r14.append(r13)
            java.lang.StringBuilder r13 = r13.append(r5)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L13b:
            java.util.zip.ZipException r12 = new java.util.zip.ZipException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Invalid X0017_StrongEncryptionHeader: resize "
            r13.<init>(r14)
            java.lang.StringBuilder r13 = r13.append(r8)
            java.lang.String r14 = " is too small to hold hashSize"
            java.lang.StringBuilder r13 = r13.append(r14)
            int r14 = r11.hashSize
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    @Override // org.apache.commons.compress.archivers.zip.PKWareExtraHeader, org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            super.parseFromCentralDirectoryData(r1, r2, r3)
            r0.parseCentralDirectoryFormat(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.PKWareExtraHeader, org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            super.parseFromLocalFileData(r1, r2, r3)
            r0.parseFileFormat(r1, r2, r3)
            return
    }
}
