package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class StringUtils {
    @java.lang.Deprecated
    public StringUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equals(java.lang.CharSequence r10, java.lang.CharSequence r11) {
            r0 = 1
            if (r10 != r11) goto L4
            return r0
        L4:
            r1 = 0
            if (r10 == 0) goto L33
            if (r11 != 0) goto La
            goto L33
        La:
            boolean r2 = r10 instanceof java.lang.String
            if (r2 == 0) goto L17
            boolean r2 = r11 instanceof java.lang.String
            if (r2 == 0) goto L17
            boolean r10 = r10.equals(r11)
            return r10
        L17:
            int r2 = r10.length()
            int r3 = r11.length()
            if (r2 != r3) goto L31
            r8 = 0
            int r9 = r10.length()
            r5 = 0
            r6 = 0
            r4 = r10
            r7 = r11
            boolean r10 = org.apache.commons.codec.binary.CharSequenceUtils.regionMatches(r4, r5, r6, r7, r8, r9)
            if (r10 == 0) goto L31
            goto L32
        L31:
            r0 = r1
        L32:
            return r0
        L33:
            return r1
    }

    private static java.nio.ByteBuffer getByteBuffer(java.lang.String r0, java.nio.charset.Charset r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            byte[] r0 = r0.getBytes(r1)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            return r0
    }

    public static java.nio.ByteBuffer getByteBufferUtf8(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.nio.ByteBuffer r1 = getByteBuffer(r1, r0)
            return r1
    }

    private static byte[] getBytes(java.lang.String r0, java.nio.charset.Charset r1) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            byte[] r0 = r0.getBytes(r1)
        L8:
            return r0
    }

    public static byte[] getBytesIso8859_1(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            byte[] r1 = getBytes(r1, r0)
            return r1
    }

    public static byte[] getBytesUnchecked(java.lang.String r0, java.lang.String r1) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            byte[] r0 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.IllegalStateException r0 = newIllegalStateException(r1, r0)
            throw r0
    }

    public static byte[] getBytesUsAscii(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            byte[] r1 = getBytes(r1, r0)
            return r1
    }

    public static byte[] getBytesUtf16(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            byte[] r1 = getBytes(r1, r0)
            return r1
    }

    public static byte[] getBytesUtf16Be(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            byte[] r1 = getBytes(r1, r0)
            return r1
    }

    public static byte[] getBytesUtf16Le(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            byte[] r1 = getBytes(r1, r0)
            return r1
    }

    public static byte[] getBytesUtf8(java.lang.String r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r1 = getBytes(r1, r0)
            return r1
    }

    private static java.lang.IllegalStateException newIllegalStateException(java.lang.String r2, java.io.UnsupportedEncodingException r3) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            return r0
    }

    public static java.lang.String newString(byte[] r1, java.lang.String r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = new java.lang.String     // Catch: java.io.UnsupportedEncodingException -> La
            r0.<init>(r1, r2)     // Catch: java.io.UnsupportedEncodingException -> La
            return r0
        La:
            r1 = move-exception
            java.lang.IllegalStateException r1 = newIllegalStateException(r2, r1)
            throw r1
    }

    private static java.lang.String newString(byte[] r1, java.nio.charset.Charset r2) {
            if (r1 != 0) goto L4
            r1 = 0
            goto La
        L4:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1, r2)
            r1 = r0
        La:
            return r1
    }

    public static java.lang.String newStringIso8859_1(byte[] r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.ISO_8859_1
            java.lang.String r1 = newString(r1, r0)
            return r1
    }

    public static java.lang.String newStringUsAscii(byte[] r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.US_ASCII
            java.lang.String r1 = newString(r1, r0)
            return r1
    }

    public static java.lang.String newStringUtf16(byte[] r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16
            java.lang.String r1 = newString(r1, r0)
            return r1
    }

    public static java.lang.String newStringUtf16Be(byte[] r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16BE
            java.lang.String r1 = newString(r1, r0)
            return r1
    }

    public static java.lang.String newStringUtf16Le(byte[] r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_16LE
            java.lang.String r1 = newString(r1, r0)
            return r1
    }

    public static java.lang.String newStringUtf8(byte[] r1) {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r1 = newString(r1, r0)
            return r1
    }
}
