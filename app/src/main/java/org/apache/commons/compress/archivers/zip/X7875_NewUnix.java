package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class X7875_NewUnix implements org.apache.commons.compress.archivers.zip.ZipExtraField, java.lang.Cloneable, java.io.Serializable {
    static final org.apache.commons.compress.archivers.zip.ZipShort HEADER_ID = null;
    private static final java.math.BigInteger ONE_THOUSAND = null;
    private static final org.apache.commons.compress.archivers.zip.ZipShort ZERO = null;
    private static final long serialVersionUID = 1;
    private java.math.BigInteger gid;
    private java.math.BigInteger uid;
    private int version;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 30837(0x7875, float:4.3212E-41)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.HEADER_ID = r0
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 0
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.ZERO = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            java.math.BigInteger r0 = java.math.BigInteger.valueOf(r0)
            org.apache.commons.compress.archivers.zip.X7875_NewUnix.ONE_THOUSAND = r0
            return
    }

    public X7875_NewUnix() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.version = r0
            r1.reset()
            return
    }

    private void reset() {
            r1 = this;
            java.math.BigInteger r0 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.ONE_THOUSAND
            r1.uid = r0
            r1.gid = r0
            return
    }

    static byte[] trimLeadingZeroesForceMinLength(byte[] r4) {
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r4.length
            r1 = 0
            r2 = r1
        L7:
            if (r1 >= r0) goto L13
            r3 = r4[r1]
            if (r3 == 0) goto Le
            goto L13
        Le:
            int r2 = r2 + 1
            int r1 = r1 + 1
            goto L7
        L13:
            int r0 = r4.length
            int r0 = r0 - r2
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            byte[] r1 = new byte[r0]
            int r3 = r4.length
            int r3 = r3 - r2
            int r3 = r0 - r3
            int r0 = r0 - r3
            java.lang.System.arraycopy(r4, r2, r1, r3, r0)
            return r1
    }

    public java.lang.Object clone() throws java.lang.CloneNotSupportedException {
            r1 = this;
            java.lang.Object r0 = super.clone()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.compress.archivers.zip.X7875_NewUnix
            r1 = 0
            if (r0 == 0) goto L22
            org.apache.commons.compress.archivers.zip.X7875_NewUnix r4 = (org.apache.commons.compress.archivers.zip.X7875_NewUnix) r4
            int r0 = r3.version
            int r2 = r4.version
            if (r0 != r2) goto L22
            java.math.BigInteger r0 = r3.uid
            java.math.BigInteger r2 = r4.uid
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L22
            java.math.BigInteger r0 = r3.gid
            java.math.BigInteger r4 = r4.gid
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L22
            r1 = 1
        L22:
            return r1
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
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.ZERO
            return r0
    }

    public long getGID() {
            r2 = this;
            java.math.BigInteger r0 = r2.gid
            long r0 = org.apache.commons.compress.archivers.zip.ZipUtil.bigToLong(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.X7875_NewUnix.HEADER_ID
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r8 = this;
            java.math.BigInteger r0 = r8.uid
            byte[] r0 = r0.toByteArray()
            java.math.BigInteger r1 = r8.gid
            byte[] r1 = r1.toByteArray()
            byte[] r0 = trimLeadingZeroesForceMinLength(r0)
            r2 = 0
            if (r0 == 0) goto L15
            int r3 = r0.length
            goto L16
        L15:
            r3 = r2
        L16:
            byte[] r1 = trimLeadingZeroesForceMinLength(r1)
            if (r1 == 0) goto L1e
            int r4 = r1.length
            goto L1f
        L1e:
            r4 = r2
        L1f:
            int r5 = r3 + 3
            int r5 = r5 + r4
            byte[] r5 = new byte[r5]
            if (r0 == 0) goto L29
            org.apache.commons.compress.archivers.zip.ZipUtil.reverse(r0)
        L29:
            if (r1 == 0) goto L2e
            org.apache.commons.compress.archivers.zip.ZipUtil.reverse(r1)
        L2e:
            int r6 = r8.version
            byte r6 = org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(r6)
            r5[r2] = r6
            byte r6 = org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(r3)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            if (r0 == 0) goto L43
            java.lang.System.arraycopy(r0, r2, r5, r6, r3)
        L43:
            int r6 = r6 + r3
            int r3 = r3 + 3
            byte r0 = org.apache.commons.compress.archivers.zip.ZipUtil.unsignedIntToSignedByte(r4)
            r5[r6] = r0
            if (r1 == 0) goto L51
            java.lang.System.arraycopy(r1, r2, r5, r3, r4)
        L51:
            return r5
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r3 = this;
            java.math.BigInteger r0 = r3.uid
            byte[] r0 = r0.toByteArray()
            byte[] r0 = trimLeadingZeroesForceMinLength(r0)
            r1 = 0
            if (r0 != 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            int r0 = r0.length
        L10:
            java.math.BigInteger r2 = r3.gid
            byte[] r2 = r2.toByteArray()
            byte[] r2 = trimLeadingZeroesForceMinLength(r2)
            if (r2 != 0) goto L1d
            goto L1e
        L1d:
            int r1 = r2.length
        L1e:
            org.apache.commons.compress.archivers.zip.ZipShort r2 = new org.apache.commons.compress.archivers.zip.ZipShort
            int r0 = r0 + 3
            int r0 = r0 + r1
            r2.<init>(r0)
            return r2
    }

    public long getUID() {
            r2 = this;
            java.math.BigInteger r0 = r2.uid
            long r0 = org.apache.commons.compress.archivers.zip.ZipUtil.bigToLong(r0)
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = -1234567(0xffffffffffed2979, float:NaN)
            int r1 = r3.version
            int r1 = r1 * r0
            java.math.BigInteger r0 = r3.uid
            int r0 = r0.hashCode()
            r2 = 16
            int r0 = java.lang.Integer.rotateLeft(r0, r2)
            r0 = r0 ^ r1
            java.math.BigInteger r1 = r3.gid
            int r1 = r1.hashCode()
            r0 = r0 ^ r1
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r7, int r8, int r9) throws java.util.zip.ZipException {
            r6 = this;
            r6.reset()
            r0 = 3
            java.lang.String r1 = " bytes"
            if (r9 < r0) goto L8f
            int r0 = r8 + 1
            r2 = r7[r8]
            int r2 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt(r2)
            r6.version = r2
            int r8 = r8 + 2
            r0 = r7[r0]
            int r0 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt(r0)
            int r2 = r0 + 3
            java.lang.String r3 = " doesn't fit into "
            if (r2 > r9) goto L6e
            int r0 = r0 + r8
            byte[] r8 = java.util.Arrays.copyOfRange(r7, r8, r0)
            java.math.BigInteger r4 = new java.math.BigInteger
            byte[] r8 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(r8)
            r5 = 1
            r4.<init>(r5, r8)
            r6.uid = r4
            int r8 = r0 + 1
            r0 = r7[r0]
            int r0 = org.apache.commons.compress.archivers.zip.ZipUtil.signedByteToUnsignedInt(r0)
            int r2 = r2 + r0
            if (r2 > r9) goto L4d
            int r0 = r0 + r8
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r8, r0)
            java.math.BigInteger r8 = new java.math.BigInteger
            byte[] r7 = org.apache.commons.compress.archivers.zip.ZipUtil.reverse(r7)
            r8.<init>(r5, r7)
            r6.gid = r8
            return
        L4d:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "X7875_NewUnix invalid: gidSize "
            r8.<init>(r2)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L6e:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r2 = "X7875_NewUnix invalid: uidSize "
            r8.<init>(r2)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L8f:
            java.util.zip.ZipException r7 = new java.util.zip.ZipException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "X7875_NewUnix length is too short, only "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public void setGID(long r1) {
            r0 = this;
            java.math.BigInteger r1 = org.apache.commons.compress.archivers.zip.ZipUtil.longToBig(r1)
            r0.gid = r1
            return
    }

    public void setUID(long r1) {
            r0 = this;
            java.math.BigInteger r1 = org.apache.commons.compress.archivers.zip.ZipUtil.longToBig(r1)
            r0.uid = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "0x7875 Zip Extra Field: UID="
            r0.<init>(r1)
            java.math.BigInteger r1 = r2.uid
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " GID="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.math.BigInteger r1 = r2.gid
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
