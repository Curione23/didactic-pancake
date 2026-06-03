package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class Charsets {

    @java.lang.Deprecated
    public static final java.nio.charset.Charset ISO_8859_1 = null;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset US_ASCII = null;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_16 = null;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_16BE = null;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_16LE = null;

    @java.lang.Deprecated
    public static final java.nio.charset.Charset UTF_8 = null;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            org.apache.commons.compress.utils.Charsets.ISO_8859_1 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            org.apache.commons.compress.utils.Charsets.US_ASCII = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            org.apache.commons.compress.utils.Charsets.UTF_16 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            org.apache.commons.compress.utils.Charsets.UTF_16BE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            org.apache.commons.compress.utils.Charsets.UTF_16LE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            org.apache.commons.compress.utils.Charsets.UTF_8 = r0
            return
    }

    public Charsets() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.nio.charset.Charset toCharset(java.lang.String r0) {
            if (r0 != 0) goto L7
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            goto Lb
        L7:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
        Lb:
            return r0
    }

    public static java.nio.charset.Charset toCharset(java.nio.charset.Charset r0) {
            if (r0 != 0) goto L6
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
        L6:
            return r0
    }
}
