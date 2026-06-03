package org.apache.commons.compress.archivers.zip;

/* JADX INFO: loaded from: classes2.dex */
final class NioZipEncoding implements org.apache.commons.compress.archivers.zip.ZipEncoding, org.apache.commons.compress.archivers.zip.CharsetAccessor {
    private static final char[] HEX_CHARS = null;
    private static final char REPLACEMENT = '?';
    private static final byte[] REPLACEMENT_BYTES = null;
    private static final java.lang.String REPLACEMENT_STRING = null;
    private final java.nio.charset.Charset charset;
    private final boolean useReplacement;

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = 63
            r0[r1] = r2
            org.apache.commons.compress.archivers.zip.NioZipEncoding.REPLACEMENT_BYTES = r0
            java.lang.String r0 = java.lang.String.valueOf(r2)
            org.apache.commons.compress.archivers.zip.NioZipEncoding.REPLACEMENT_STRING = r0
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x001a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            org.apache.commons.compress.archivers.zip.NioZipEncoding.HEX_CHARS = r0
            return
    }

    NioZipEncoding(java.nio.charset.Charset r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.charset = r1
            r0.useReplacement = r2
            return
    }

    private static java.nio.ByteBuffer encodeFully(java.nio.charset.CharsetEncoder r1, java.nio.CharBuffer r2, java.nio.ByteBuffer r3) {
        L0:
            boolean r0 = r2.hasRemaining()
            if (r0 == 0) goto L1e
            r0 = 0
            java.nio.charset.CoderResult r0 = r1.encode(r2, r3, r0)
            boolean r0 = r0.isOverflow()
            if (r0 == 0) goto L0
            int r0 = r2.remaining()
            int r0 = estimateIncrementalEncodingSize(r1, r0)
            java.nio.ByteBuffer r3 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.growBufferBy(r3, r0)
            goto L0
        L1e:
            return r3
    }

    private static java.nio.CharBuffer encodeSurrogate(java.nio.CharBuffer r2, char r3) {
            r0 = 0
            java.nio.Buffer r0 = r2.position(r0)
            r1 = 6
            r0.limit(r1)
            r0 = 37
            r2.put(r0)
            r0 = 85
            r2.put(r0)
            char[] r0 = org.apache.commons.compress.archivers.zip.NioZipEncoding.HEX_CHARS
            int r1 = r3 >> 12
            r1 = r1 & 15
            char r1 = r0[r1]
            r2.put(r1)
            int r1 = r3 >> 8
            r1 = r1 & 15
            char r1 = r0[r1]
            r2.put(r1)
            int r1 = r3 >> 4
            r1 = r1 & 15
            char r1 = r0[r1]
            r2.put(r1)
            r3 = r3 & 15
            char r3 = r0[r3]
            r2.put(r3)
            r2.flip()
            return r2
    }

    private static int estimateIncrementalEncodingSize(java.nio.charset.CharsetEncoder r0, int r1) {
            float r1 = (float) r1
            float r0 = r0.averageBytesPerChar()
            float r1 = r1 * r0
            double r0 = (double) r1
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            return r0
    }

    private static int estimateInitialBufferSize(java.nio.charset.CharsetEncoder r1, int r2) {
            float r0 = r1.maxBytesPerChar()
            int r2 = r2 + (-1)
            float r2 = (float) r2
            float r1 = r1.averageBytesPerChar()
            float r2 = r2 * r1
            float r0 = r0 + r2
            double r1 = (double) r0
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            return r1
    }

    private java.nio.charset.CharsetDecoder newDecoder() {
            r2 = this;
            boolean r0 = r2.useReplacement
            if (r0 != 0) goto L17
            java.nio.charset.Charset r0 = r2.charset
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetDecoder r0 = r0.onMalformedInput(r1)
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetDecoder r0 = r0.onUnmappableCharacter(r1)
            return r0
        L17:
            java.nio.charset.Charset r0 = r2.charset
            java.nio.charset.CharsetDecoder r0 = r0.newDecoder()
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r0 = r0.onMalformedInput(r1)
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r0 = r0.onUnmappableCharacter(r1)
            java.lang.String r1 = org.apache.commons.compress.archivers.zip.NioZipEncoding.REPLACEMENT_STRING
            java.nio.charset.CharsetDecoder r0 = r0.replaceWith(r1)
            return r0
    }

    private java.nio.charset.CharsetEncoder newEncoder() {
            r2 = this;
            boolean r0 = r2.useReplacement
            if (r0 == 0) goto L1d
            java.nio.charset.Charset r0 = r2.charset
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r0 = r0.onMalformedInput(r1)
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetEncoder r0 = r0.onUnmappableCharacter(r1)
            byte[] r1 = org.apache.commons.compress.archivers.zip.NioZipEncoding.REPLACEMENT_BYTES
            java.nio.charset.CharsetEncoder r0 = r0.replaceWith(r1)
            return r0
        L1d:
            java.nio.charset.Charset r0 = r2.charset
            java.nio.charset.CharsetEncoder r0 = r0.newEncoder()
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetEncoder r0 = r0.onMalformedInput(r1)
            java.nio.charset.CodingErrorAction r1 = java.nio.charset.CodingErrorAction.REPORT
            java.nio.charset.CharsetEncoder r0 = r0.onUnmappableCharacter(r1)
            return r0
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public boolean canEncode(java.lang.String r2) {
            r1 = this;
            java.nio.charset.CharsetEncoder r0 = r1.newEncoder()
            boolean r2 = r0.canEncode(r2)
            return r2
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public java.lang.String decode(byte[] r2) throws java.io.IOException {
            r1 = this;
            java.nio.charset.CharsetDecoder r0 = r1.newDecoder()
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r2)
            java.nio.CharBuffer r2 = r0.decode(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    @Override // org.apache.commons.compress.archivers.zip.ZipEncoding
    public java.nio.ByteBuffer encode(java.lang.String r11) {
            r10 = this;
            java.nio.charset.CharsetEncoder r0 = r10.newEncoder()
            java.nio.CharBuffer r11 = java.nio.CharBuffer.wrap(r11)
            int r1 = r11.remaining()
            int r1 = estimateInitialBufferSize(r0, r1)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)
            r2 = 0
        L15:
            boolean r3 = r11.hasRemaining()
            r4 = 1
            if (r3 == 0) goto La2
            r3 = 0
            java.nio.charset.CoderResult r5 = r0.encode(r11, r1, r3)
            boolean r6 = r5.isUnmappable()
            if (r6 != 0) goto L4e
            boolean r6 = r5.isMalformed()
            if (r6 == 0) goto L2e
            goto L4e
        L2e:
            boolean r3 = r5.isOverflow()
            if (r3 == 0) goto L41
            int r3 = r11.remaining()
            int r3 = estimateIncrementalEncodingSize(r0, r3)
            java.nio.ByteBuffer r1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.growBufferBy(r1, r3)
            goto L15
        L41:
            boolean r3 = r5.isUnderflow()
            if (r3 != 0) goto La2
            boolean r3 = r5.isError()
            if (r3 == 0) goto L15
            goto La2
        L4e:
            int r6 = r5.length()
            r7 = 6
            int r6 = r6 * r7
            int r6 = estimateIncrementalEncodingSize(r0, r6)
            int r8 = r1.remaining()
            if (r6 <= r8) goto L87
            int r6 = r11.position()
            r8 = r3
        L63:
            int r9 = r11.limit()
            if (r6 >= r9) goto L7a
            char r9 = r11.get(r6)
            boolean r9 = r0.canEncode(r9)
            if (r9 != 0) goto L75
            r9 = r7
            goto L76
        L75:
            r9 = r4
        L76:
            int r8 = r8 + r9
            int r6 = r6 + 1
            goto L63
        L7a:
            int r4 = estimateIncrementalEncodingSize(r0, r8)
            int r6 = r1.remaining()
            int r4 = r4 - r6
            java.nio.ByteBuffer r1 = org.apache.commons.compress.archivers.zip.ZipEncodingHelper.growBufferBy(r1, r4)
        L87:
            if (r2 != 0) goto L8d
            java.nio.CharBuffer r2 = java.nio.CharBuffer.allocate(r7)
        L8d:
            int r4 = r5.length()
            if (r3 >= r4) goto L15
            char r4 = r11.get()
            java.nio.CharBuffer r4 = encodeSurrogate(r2, r4)
            java.nio.ByteBuffer r1 = encodeFully(r0, r4, r1)
            int r3 = r3 + 1
            goto L8d
        La2:
            r0.encode(r11, r1, r4)
            int r11 = r1.position()
            r1.limit(r11)
            r1.rewind()
            return r1
    }

    @Override // org.apache.commons.compress.archivers.zip.CharsetAccessor
    public java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            return r0
    }
}
