package org.apache.commons.io.charset;

/* JADX INFO: loaded from: classes2.dex */
public final class CharsetDecoders {
    private CharsetDecoders() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.nio.charset.CharsetDecoder toCharsetDecoder(java.nio.charset.CharsetDecoder r0) {
            if (r0 == 0) goto L3
            goto Lb
        L3:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
        Lb:
            return r0
    }
}
