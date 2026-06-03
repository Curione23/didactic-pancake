package org.apache.commons.io;

/* JADX INFO: loaded from: classes2.dex */
public class Charsets {

    @java.lang.Deprecated
    public static final java.nio.charset.Charset ISO_8859_1 = null;
    private static final java.util.SortedMap<java.lang.String, java.nio.charset.Charset> STANDARD_CHARSET_MAP = null;

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
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.ISO_8859_1
            r0.put(r1, r2)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.US_ASCII
            r0.put(r1, r2)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16
            r0.put(r1, r2)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16BE
            r0.put(r1, r2)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_16LE
            r0.put(r1, r2)
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = r1.name()
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r0.put(r1, r2)
            java.util.SortedMap r0 = java.util.Collections.unmodifiableSortedMap(r0)
            org.apache.commons.io.Charsets.STANDARD_CHARSET_MAP = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            org.apache.commons.io.Charsets.ISO_8859_1 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            org.apache.commons.io.Charsets.US_ASCII = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            org.apache.commons.io.Charsets.UTF_16 = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            org.apache.commons.io.Charsets.UTF_16BE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            org.apache.commons.io.Charsets.UTF_16LE = r0
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            org.apache.commons.io.Charsets.UTF_8 = r0
            return
    }

    public Charsets() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.SortedMap<java.lang.String, java.nio.charset.Charset> requiredCharsets() {
            java.util.SortedMap<java.lang.String, java.nio.charset.Charset> r0 = org.apache.commons.io.Charsets.STANDARD_CHARSET_MAP
            return r0
    }

    public static java.nio.charset.Charset toCharset(java.lang.String r1) throws java.nio.charset.UnsupportedCharsetException {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.nio.charset.Charset r1 = toCharset(r1, r0)
            return r1
    }

    public static java.nio.charset.Charset toCharset(java.lang.String r0, java.nio.charset.Charset r1) throws java.nio.charset.UnsupportedCharsetException {
            if (r0 != 0) goto L3
            goto L7
        L3:
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r0)
        L7:
            return r1
    }

    public static java.nio.charset.Charset toCharset(java.nio.charset.Charset r0) {
            if (r0 != 0) goto L6
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
        L6:
            return r0
    }

    public static java.nio.charset.Charset toCharset(java.nio.charset.Charset r0, java.nio.charset.Charset r1) {
            if (r0 != 0) goto L3
            r0 = r1
        L3:
            return r0
    }
}
