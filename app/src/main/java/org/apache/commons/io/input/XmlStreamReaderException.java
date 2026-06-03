package org.apache.commons.io.input;

/* JADX INFO: loaded from: classes2.dex */
public class XmlStreamReaderException extends java.io.IOException {
    private static final long serialVersionUID = 1;
    private final java.lang.String bomEncoding;
    private final java.lang.String contentTypeEncoding;
    private final java.lang.String contentTypeMime;
    private final java.lang.String xmlEncoding;
    private final java.lang.String xmlGuessEncoding;

    public XmlStreamReaderException(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            r7 = this;
            r2 = 0
            r3 = 0
            r0 = r7
            r1 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public XmlStreamReaderException(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r0 = this;
            r0.<init>(r1)
            r0.contentTypeMime = r2
            r0.contentTypeEncoding = r3
            r0.bomEncoding = r4
            r0.xmlGuessEncoding = r5
            r0.xmlEncoding = r6
            return
    }

    public java.lang.String getBomEncoding() {
            r1 = this;
            java.lang.String r0 = r1.bomEncoding
            return r0
    }

    public java.lang.String getContentTypeEncoding() {
            r1 = this;
            java.lang.String r0 = r1.contentTypeEncoding
            return r0
    }

    public java.lang.String getContentTypeMime() {
            r1 = this;
            java.lang.String r0 = r1.contentTypeMime
            return r0
    }

    public java.lang.String getXmlEncoding() {
            r1 = this;
            java.lang.String r0 = r1.xmlEncoding
            return r0
    }

    public java.lang.String getXmlGuessEncoding() {
            r1 = this;
            java.lang.String r0 = r1.xmlGuessEncoding
            return r0
    }
}
