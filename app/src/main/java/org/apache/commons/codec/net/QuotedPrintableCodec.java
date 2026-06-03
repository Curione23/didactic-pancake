package org.apache.commons.codec.net;

/* JADX INFO: loaded from: classes2.dex */
public class QuotedPrintableCodec implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.StringEncoder, org.apache.commons.codec.StringDecoder {
    private static final byte CR = 13;
    private static final byte ESCAPE_CHAR = 61;
    private static final byte LF = 10;
    private static final int MIN_BYTES = 3;
    private static final java.util.BitSet PRINTABLE_CHARS = null;
    private static final int SAFE_LENGTH = 73;
    private static final byte SPACE = 32;
    private static final byte TAB = 9;
    private final java.nio.charset.Charset charset;
    private final boolean strict;

    static {
            java.util.BitSet r0 = new java.util.BitSet
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS = r0
            r0 = 33
        Lb:
            r1 = 60
            if (r0 > r1) goto L17
            java.util.BitSet r1 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS
            r1.set(r0)
            int r0 = r0 + 1
            goto Lb
        L17:
            r0 = 62
        L19:
            r1 = 126(0x7e, float:1.77E-43)
            if (r0 > r1) goto L25
            java.util.BitSet r1 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS
            r1.set(r0)
            int r0 = r0 + 1
            goto L19
        L25:
            java.util.BitSet r0 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS
            r1 = 9
            r0.set(r1)
            r1 = 32
            r0.set(r1)
            return
    }

    public QuotedPrintableCodec() {
            r2 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public QuotedPrintableCodec(java.lang.String r2) throws java.nio.charset.IllegalCharsetNameException, java.lang.IllegalArgumentException, java.nio.charset.UnsupportedCharsetException {
            r1 = this;
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r2)
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public QuotedPrintableCodec(java.nio.charset.Charset r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public QuotedPrintableCodec(java.nio.charset.Charset r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.charset = r1
            r0.strict = r2
            return
    }

    public QuotedPrintableCodec(boolean r2) {
            r1 = this;
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r2)
            return
    }

    public static final byte[] decodeQuotedPrintable(byte[] r5) throws org.apache.commons.codec.DecoderException {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
        La:
            int r2 = r5.length
            if (r1 >= r2) goto L46
            r2 = r5[r1]
            r3 = 61
            r4 = 13
            if (r2 != r3) goto L3a
            int r2 = r1 + 1
            r3 = r5[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            if (r3 != r4) goto L1d
            r1 = r2
            goto L43
        L1d:
            int r2 = org.apache.commons.codec.net.Utils.digit16(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            int r1 = r1 + 2
            r3 = r5[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            int r3 = org.apache.commons.codec.net.Utils.digit16(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            int r2 = r2 << 4
            int r2 = r2 + r3
            char r2 = (char) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            r0.write(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L31
            goto L43
        L31:
            r5 = move-exception
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.String r1 = "Invalid quoted-printable encoding"
            r0.<init>(r1, r5)
            throw r0
        L3a:
            if (r2 == r4) goto L43
            r3 = 10
            if (r2 == r3) goto L43
            r0.write(r2)
        L43:
            int r1 = r1 + 1
            goto La
        L46:
            byte[] r5 = r0.toByteArray()
            return r5
    }

    private static int encodeByte(int r0, boolean r1, java.io.ByteArrayOutputStream r2) {
            if (r1 == 0) goto L7
            int r0 = encodeQuotedPrintable(r0, r2)
            return r0
        L7:
            r2.write(r0)
            r0 = 1
            return r0
    }

    private static final int encodeQuotedPrintable(int r1, java.io.ByteArrayOutputStream r2) {
            r0 = 61
            r2.write(r0)
            int r0 = r1 >> 4
            char r0 = org.apache.commons.codec.net.Utils.hexDigit(r0)
            char r1 = org.apache.commons.codec.net.Utils.hexDigit(r1)
            r2.write(r0)
            r2.write(r1)
            r1 = 3
            return r1
    }

    public static final byte[] encodeQuotedPrintable(java.util.BitSet r1, byte[] r2) {
            r0 = 0
            byte[] r1 = encodeQuotedPrintable(r1, r2, r0)
            return r1
    }

    public static final byte[] encodeQuotedPrintable(java.util.BitSet r10, byte[] r11, boolean r12) {
            r0 = 0
            if (r11 != 0) goto L4
            return r0
        L4:
            if (r10 != 0) goto L8
            java.util.BitSet r10 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS
        L8:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            int r2 = r11.length
            r3 = 0
            if (r12 == 0) goto La0
            r12 = 3
            if (r2 >= r12) goto L15
            return r0
        L15:
            r12 = 1
            r4 = r12
            r0 = r3
        L18:
            int r5 = r2 + (-3)
            r6 = 10
            r7 = 13
            r8 = 61
            if (r0 >= r5) goto L55
            int r5 = getUnsignedOctet(r0, r11)
            r9 = 73
            if (r4 >= r9) goto L35
            boolean r6 = r10.get(r5)
            r6 = r6 ^ r12
            int r5 = encodeByte(r5, r6, r1)
            int r4 = r4 + r5
            goto L52
        L35:
            boolean r4 = r10.get(r5)
            if (r4 == 0) goto L44
            boolean r4 = isWhitespace(r5)
            if (r4 == 0) goto L42
            goto L44
        L42:
            r4 = r3
            goto L45
        L44:
            r4 = r12
        L45:
            encodeByte(r5, r4, r1)
            r1.write(r8)
            r1.write(r7)
            r1.write(r6)
            r4 = r12
        L52:
            int r0 = r0 + 1
            goto L18
        L55:
            int r0 = getUnsignedOctet(r5, r11)
            boolean r5 = r10.get(r0)
            if (r5 == 0) goto L6c
            boolean r5 = isWhitespace(r0)
            if (r5 == 0) goto L6a
            r5 = 68
            if (r4 <= r5) goto L6a
            goto L6c
        L6a:
            r5 = r3
            goto L6d
        L6c:
            r5 = r12
        L6d:
            int r0 = encodeByte(r0, r5, r1)
            int r4 = r4 + r0
            r0 = 71
            if (r4 <= r0) goto L7f
            r1.write(r8)
            r1.write(r7)
            r1.write(r6)
        L7f:
            int r0 = r2 + (-2)
            r4 = r0
        L82:
            if (r4 >= r2) goto Lb9
            int r5 = getUnsignedOctet(r4, r11)
            boolean r6 = r10.get(r5)
            if (r6 == 0) goto L99
            if (r4 <= r0) goto L97
            boolean r6 = isWhitespace(r5)
            if (r6 == 0) goto L97
            goto L99
        L97:
            r6 = r3
            goto L9a
        L99:
            r6 = r12
        L9a:
            encodeByte(r5, r6, r1)
            int r4 = r4 + 1
            goto L82
        La0:
            int r12 = r11.length
        La1:
            if (r3 >= r12) goto Lb9
            r0 = r11[r3]
            if (r0 >= 0) goto La9
            int r0 = r0 + 256
        La9:
            boolean r2 = r10.get(r0)
            if (r2 == 0) goto Lb3
            r1.write(r0)
            goto Lb6
        Lb3:
            encodeQuotedPrintable(r0, r1)
        Lb6:
            int r3 = r3 + 1
            goto La1
        Lb9:
            byte[] r10 = r1.toByteArray()
            return r10
    }

    private static int getUnsignedOctet(int r0, byte[] r1) {
            r0 = r1[r0]
            if (r0 >= 0) goto L6
            int r0 = r0 + 256
        L6:
            return r0
    }

    private static boolean isWhitespace(int r1) {
            r0 = 32
            if (r1 == r0) goto Lb
            r0 = 9
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            goto Lc
        Lb:
            r1 = 1
        Lc:
            return r1
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object r4) throws org.apache.commons.codec.DecoderException {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto Lf
            byte[] r4 = (byte[]) r4
            byte[] r4 = r3.decode(r4)
            return r4
        Lf:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L1a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r3.decode(r4)
            return r4
        L1a:
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Objects of type "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " cannot be quoted-printable decoded"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.codec.StringDecoder
    public java.lang.String decode(java.lang.String r2) throws org.apache.commons.codec.DecoderException {
            r1 = this;
            java.nio.charset.Charset r0 = r1.getCharset()
            java.lang.String r2 = r1.decode(r2, r0)
            return r2
    }

    public java.lang.String decode(java.lang.String r2, java.lang.String r3) throws org.apache.commons.codec.DecoderException, java.io.UnsupportedEncodingException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = new java.lang.String
            byte[] r2 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(r2)
            byte[] r2 = r1.decode(r2)
            r0.<init>(r2, r3)
            return r0
    }

    public java.lang.String decode(java.lang.String r2, java.nio.charset.Charset r3) throws org.apache.commons.codec.DecoderException {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = new java.lang.String
            byte[] r2 = org.apache.commons.codec.binary.StringUtils.getBytesUsAscii(r2)
            byte[] r2 = r1.decode(r2)
            r0.<init>(r2, r3)
            return r0
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] r1) throws org.apache.commons.codec.DecoderException {
            r0 = this;
            byte[] r1 = decodeQuotedPrintable(r1)
            return r1
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r4) throws org.apache.commons.codec.EncoderException {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            boolean r0 = r4 instanceof byte[]
            if (r0 == 0) goto Lf
            byte[] r4 = (byte[]) r4
            byte[] r4 = r3.encode(r4)
            return r4
        Lf:
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L1a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r3.encode(r4)
            return r4
        L1a:
            org.apache.commons.codec.EncoderException r0 = new org.apache.commons.codec.EncoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Objects of type "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " cannot be quoted-printable encoded"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.codec.StringEncoder
    public java.lang.String encode(java.lang.String r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            java.nio.charset.Charset r0 = r1.getCharset()
            java.lang.String r2 = r1.encode(r2, r0)
            return r2
    }

    public java.lang.String encode(java.lang.String r1, java.lang.String r2) throws java.io.UnsupportedEncodingException {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            byte[] r1 = r1.getBytes(r2)
            byte[] r1 = r0.encode(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(r1)
            return r1
    }

    public java.lang.String encode(java.lang.String r1, java.nio.charset.Charset r2) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            byte[] r1 = r1.getBytes(r2)
            byte[] r1 = r0.encode(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(r1)
            return r1
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] r3) {
            r2 = this;
            java.util.BitSet r0 = org.apache.commons.codec.net.QuotedPrintableCodec.PRINTABLE_CHARS
            boolean r1 = r2.strict
            byte[] r3 = encodeQuotedPrintable(r0, r3, r1)
            return r3
    }

    public java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            return r0
    }

    public java.lang.String getDefaultCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            java.lang.String r0 = r0.name()
            return r0
    }
}
