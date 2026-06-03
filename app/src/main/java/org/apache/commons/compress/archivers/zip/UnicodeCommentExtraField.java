package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public class UnicodeCommentExtraField extends org.apache.commons.compress.archivers.zip.AbstractUnicodeExtraField {
    public static final org.apache.commons.compress.archivers.zip.ZipShort UCOM_ID = null;

    static {
            org.apache.commons.compress.archivers.zip.ZipShort r0 = new org.apache.commons.compress.archivers.zip.ZipShort
            r1 = 25461(0x6375, float:3.5678E-41)
            r0.<init>(r1)
            org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID = r0
            return
    }

    public UnicodeCommentExtraField() {
            r0 = this;
            r0.<init>()
            return
    }

    public UnicodeCommentExtraField(java.lang.String r1, byte[] r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public UnicodeCommentExtraField(java.lang.String r1, byte[] r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipExtraField
    public org.apache.commons.compress.archivers.zip.ZipShort getHeaderId() {
            r1 = this;
            org.apache.commons.compress.archivers.zip.ZipShort r0 = org.apache.commons.compress.archivers.zip.UnicodeCommentExtraField.UCOM_ID
            return r0
    }
}
