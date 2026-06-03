package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class CharEncoding {
    public static final java.lang.String ISO_8859_1 = null;
    public static final java.lang.String US_ASCII = null;
    public static final java.lang.String UTF_16 = null;
    public static final java.lang.String UTF_16BE = null;
    public static final java.lang.String UTF_16LE = null;
    public static final java.lang.String UTF_8 = null;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r0 = r0.name()
            org.apache.commons.lang3.CharEncoding.ISO_8859_1 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r0 = r0.name()
            org.apache.commons.lang3.CharEncoding.US_ASCII = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            java.lang.String r0 = r0.name()
            org.apache.commons.lang3.CharEncoding.UTF_16 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r0 = r0.name()
            org.apache.commons.lang3.CharEncoding.UTF_16BE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r0 = r0.name()
            org.apache.commons.lang3.CharEncoding.UTF_16LE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.name()
            org.apache.commons.lang3.CharEncoding.UTF_8 = r0
            return
    }

    @java.lang.Deprecated
    public CharEncoding() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean isSupported(java.lang.String r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            boolean r1 = java.nio.charset.Charset.isSupported(r1)     // Catch: java.nio.charset.IllegalCharsetNameException -> L9
            return r1
        L9:
            return r0
    }
}
