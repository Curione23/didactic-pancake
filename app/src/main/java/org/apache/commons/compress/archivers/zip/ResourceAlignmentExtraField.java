package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceAlignmentExtraField implements org.apache.commons.compress.archivers.zip.ZipExtraField {
    private static final int ALLOW_METHOD_MESSAGE_CHANGE_FLAG = 32768;
    public static final int BASE_SIZE = 2;
    public static final org.apache.commons.compress.archivers.zip.ZipShort ID = null;
    private short alignment;
    private boolean allowMethodChange;
    private int padding;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 41246(0xa11e, float:5.7798E-41)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID = r0
            return
    }

    public ResourceAlignmentExtraField() {
            r0 = this;
            r0.<init>()
            return
    }

    public ResourceAlignmentExtraField(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ResourceAlignmentExtraField(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ResourceAlignmentExtraField(int r2, boolean r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r2 < 0) goto L28
            r0 = 32767(0x7fff, float:4.5916E-41)
            if (r2 > r0) goto L28
            if (r4 < 0) goto L13
            short r2 = (short) r2
            r1.alignment = r2
            r1.allowMethodChange = r3
            r1.padding = r4
            return
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Padding must not be negative, was: "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L28:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Alignment must be between 0 and 0x7fff, was: "
            r4.<init>(r0)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public boolean allowMethodChange() {
            r1 = this;
            boolean r0 = r1.allowMethodChange
            return r0
    }

    public short getAlignment() {
            r1 = this;
            short r0 = r1.alignment
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getCentralDirectoryData() {
            r2 = this;
            short r0 = r2.alignment
            boolean r1 = r2.allowMethodChange
            if (r1 == 0) goto La
            r1 = 32768(0x8000, float:4.5918E-41)
            goto Lb
        La:
            r1 = 0
        Lb:
            r0 = r0 | r1
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r0)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getCentralDirectoryLength() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 2
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.ResourceAlignmentExtraField.ID
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public byte[] getLocalFileDataData() {
            r4 = this;
            int r0 = r4.padding
            int r0 = r0 + 2
            byte[] r0 = new byte[r0]
            short r1 = r4.alignment
            boolean r2 = r4.allowMethodChange
            r3 = 0
            if (r2 == 0) goto L11
            r2 = 32768(0x8000, float:4.5918E-41)
            goto L12
        L11:
            r2 = r3
        L12:
            r1 = r1 | r2
            org.apache.commons.compress.archivers.zip.ZipShort.putShort(r1, r0, r3)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getLocalFileDataLength() {
            r2 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            int r1 = r2.padding
            int r1 = r1 + 2
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromCentralDirectoryData(byte[] r2, int r3, int r4) throws java.util.zip.ZipException {
            r1 = this;
            r0 = 2
            if (r4 < r0) goto L18
            int r2 = org.apache.commons.compress.archivers.zip.ZipShort.getValue(r2, r3)
            r3 = r2 & 32767(0x7fff, float:4.5916E-41)
            short r3 = (short) r3
            r1.alignment = r3
            r3 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r3
            if (r2 == 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            r1.allowMethodChange = r2
            return
        L18:
            java.util.zip.ZipException r2 = new java.util.zip.ZipException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Too short content for ResourceAlignmentExtraField (0xa11e): "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public void parseFromLocalFileData(byte[] r1, int r2, int r3) throws java.util.zip.ZipException {
            r0 = this;
            r0.parseFromCentralDirectoryData(r1, r2, r3)
            int r3 = r3 + (-2)
            r0.padding = r3
            return
    }
}
