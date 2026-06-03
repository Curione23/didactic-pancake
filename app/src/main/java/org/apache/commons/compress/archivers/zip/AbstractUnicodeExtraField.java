package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractUnicodeExtraField implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    private byte[] data;
    private long nameCRC32;
    private byte[] unicodeName;

    protected AbstractUnicodeExtraField() {
            r0 = this;
            r0.<init>()
            return
    }

    protected AbstractUnicodeExtraField(java.lang.String r3, byte[] r4) {
            r2 = this;
            r0 = 0
            int r1 = r4.length
            r2.<init>(r3, r4, r0, r1)
            return
    }

    protected AbstractUnicodeExtraField(java.lang.String r2, byte[] r3, int r4, int r5) {
            r1 = this;
            r1.<init>()
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r0.<init>()
            r0.update(r3, r4, r5)
            long r3 = r0.getValue()
            r1.nameCRC32 = r3
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r2 = r2.getBytes(r3)
            r1.unicodeName = r2
            return
    }

    private void assembleData() {
            r6 = this;
            byte[] r0 = r6.unicodeName
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.length
            r1 = 5
            int r0 = r0 + r1
            byte[] r0 = new byte[r0]
            r6.data = r0
            r2 = 0
            r3 = 1
            r0[r2] = r3
            long r4 = r6.nameCRC32
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipLong.getBytes(r4)
            byte[] r4 = r6.data
            r5 = 4
            java.lang.System.arraycopy(r0, r2, r4, r3, r5)
            byte[] r0 = r6.unicodeName
            byte[] r3 = r6.data
            int r4 = r0.length
            java.lang.System.arraycopy(r0, r2, r3, r1, r4)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r2 = this;
            byte[] r0 = r2.data
            if (r0 != 0) goto L7
            r2.assembleData()
        L7:
            byte[] r0 = r2.data
            if (r0 == 0) goto L11
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r2 = this;
            byte[] r0 = r2.data
            if (r0 != 0) goto L7
            r2.assembleData()
        L7:
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            byte[] r1 = r2.data
            if (r1 == 0) goto Lf
            int r1 = r1.length
            goto L10
        Lf:
            r1 = 0
        L10:
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r1 = this;
            byte[] r0 = r1.getCentralDirectoryData()
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = r1.getCentralDirectoryLength()
            return r0
    }

    public long getNameCRC32() {
            r2 = this;
            long r0 = r2.nameCRC32
            return r0
    }

    public byte[] getUnicodeName() {
            r2 = this;
            byte[] r0 = r2.unicodeName
            if (r0 == 0) goto La
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            r0.parseFromLocalFileData(r1, r2, r3)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r4, int r5, int r6) throws java.util.zip.ZipException {
            r3 = this;
            r0 = 5
            if (r6 < r0) goto L39
            r1 = r4[r5]
            r2 = 1
            if (r1 != r2) goto L1e
            int r1 = r5 + 1
            long r1 = org.apache.commons.compress.archivers.zip.ZipLong.getValue(r4, r1)
            r3.nameCRC32 = r1
            int r6 = r6 - r0
            byte[] r1 = new byte[r6]
            r3.unicodeName = r1
            int r5 = r5 + r0
            r0 = 0
            java.lang.System.arraycopy(r4, r5, r1, r0, r6)
            r4 = 0
            r3.data = r4
            return
        L1e:
            java.util.zip.ZipException r4 = new java.util.zip.ZipException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unsupported version ["
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r6 = "] for UniCode path extra data."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L39:
            java.util.zip.ZipException r4 = new java.util.zip.ZipException
            java.lang.String r5 = "UniCode path extra data must have at least 5 bytes."
            r4.<init>(r5)
            throw r4
    }

    public void setNameCRC32(long r1) {
            r0 = this;
            r0.nameCRC32 = r1
            r1 = 0
            r0.data = r1
            return
    }

    public void setUnicodeName(byte[] r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Lb
            int r1 = r3.length
            byte[] r3 = java.util.Arrays.copyOf(r3, r1)
            r2.unicodeName = r3
            goto Ld
        Lb:
            r2.unicodeName = r0
        Ld:
            r2.data = r0
            return
    }
}
