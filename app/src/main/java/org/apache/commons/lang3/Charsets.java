package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
final class Charsets {
    Charsets() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.nio.charset.Charset toCharset(java.lang.String r0) {
            if (r0 != 0) goto L7
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            goto Lb
        L7:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
        Lb:
            return r0
    }

    static java.nio.charset.Charset toCharset(java.nio.charset.Charset r0) {
            if (r0 != 0) goto L6
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
        L6:
            return r0
    }

    static java.lang.String toCharsetName(java.lang.String r0) {
            if (r0 != 0) goto La
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r0 = r0.name()
        La:
            return r0
    }
}
