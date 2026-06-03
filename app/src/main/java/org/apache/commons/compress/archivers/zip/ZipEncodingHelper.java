package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ZipEncodingHelper {
    static final org.apache.commons.compress.archivers.zip.ZipEncoding ZIP_ENCODING_UTF_8 = null;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            org.apache.commons.compress.archivers.zip.ZipEncoding r0 = getZipEncoding(r0)
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper.ZIP_ENCODING_UTF_8 = r0
            return
    }

    public ZipEncodingHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.apache.commons.compress.archivers.zip.ZipEncoding getZipEncoding(java.lang.String r2) {
            org.apache.commons.compress.archivers.zip.NioZipEncoding r0 = new org.apache.commons.compress.archivers.zip.NioZipEncoding
            java.nio.charset.Charset r1 = toSafeCharset(r2)
            java.nio.charset.Charset r2 = toSafeCharset(r2)
            java.lang.String r2 = r2.name()
            boolean r2 = isUTF8(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static org.apache.commons.compress.archivers.zip.ZipEncoding getZipEncoding(java.nio.charset.Charset r2) {
            org.apache.commons.compress.archivers.zip.NioZipEncoding r0 = new org.apache.commons.compress.archivers.zip.NioZipEncoding
            java.nio.charset.Charset r1 = org.apache.commons.io.Charsets.toCharset(r2)
            java.nio.charset.Charset r2 = org.apache.commons.io.Charsets.toCharset(r2)
            boolean r2 = isUTF8(r2)
            r0.<init>(r1, r2)
            return r0
    }

    static java.nio.ByteBuffer growBufferBy(java.nio.ByteBuffer r1, int r2) {
            int r0 = r1.position()
            r1.limit(r0)
            r1.rewind()
            int r0 = r1.capacity()
            int r0 = r0 + r2
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r0)
            r2.put(r1)
            return r2
    }

    static boolean isUTF8(java.lang.String r0) {
            if (r0 == 0) goto L3
            goto Lb
        L3:
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.lang.String r0 = r0.name()
        Lb:
            boolean r0 = isUTF8Alias(r0)
            return r0
    }

    static boolean isUTF8(java.nio.charset.Charset r0) {
            java.nio.charset.Charset r0 = org.apache.commons.io.Charsets.toCharset(r0)
            java.lang.String r0 = r0.name()
            boolean r0 = isUTF8Alias(r0)
            return r0
    }

    private static boolean isUTF8Alias(java.lang.String r2) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r0 = r0.name()
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 != 0) goto L24
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.util.Set r0 = r0.aliases()
            java.util.stream.Stream r0 = r0.stream()
            org.apache.commons.compress.archivers.zip.ZipEncodingHelper$$ExternalSyntheticLambda0 r1 = new org.apache.commons.compress.archivers.zip.ZipEncodingHelper$$ExternalSyntheticLambda0
            r1.<init>(r2)
            boolean r2 = r0.anyMatch(r1)
            if (r2 == 0) goto L22
            goto L24
        L22:
            r2 = 0
            goto L25
        L24:
            r2 = 1
        L25:
            return r2
    }

    static /* synthetic */ boolean lambda$isUTF8Alias$0(java.lang.String r0, java.lang.String r1) {
            boolean r0 = r1.equalsIgnoreCase(r0)
            return r0
    }

    private static java.nio.charset.Charset toSafeCharset(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()
            java.nio.charset.Charset r0 = org.apache.commons.io.Charsets.toCharset(r1)     // Catch: java.nio.charset.UnsupportedCharsetException -> L8
        L8:
            return r0
    }
}
