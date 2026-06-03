package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class UnicodePathExtraField extends org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField {
    public static final org.apache.commons.compress.archivers.zip.ZipShort UPATH_ID = null;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 28789(0x7075, float:4.0342E-41)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID = r0
            return
    }

    public UnicodePathExtraField() {
            r0 = this;
            r0.<init>()
            return
    }

    public UnicodePathExtraField(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public UnicodePathExtraField(java.lang.String r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.UnicodePathExtraField.UPATH_ID
            return r0
    }
}
