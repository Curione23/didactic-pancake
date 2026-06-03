package org.apache.commons.codec;

/* JADX INFO: loaded from: classes2.dex */
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
            org.apache.commons.codec.CharEncoding.ISO_8859_1 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r0 = r0.name()
            org.apache.commons.codec.CharEncoding.US_ASCII = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            java.lang.String r0 = r0.name()
            org.apache.commons.codec.CharEncoding.UTF_16 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r0 = r0.name()
            org.apache.commons.codec.CharEncoding.UTF_16BE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r0 = r0.name()
            org.apache.commons.codec.CharEncoding.UTF_16LE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.name()
            org.apache.commons.codec.CharEncoding.UTF_8 = r0
            return
    }

    @java.lang.Deprecated
    public CharEncoding() {
            r0 = this;
            r0.<init>()
            return
    }
}
