package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class Hex implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder {
    public static final java.nio.charset.Charset DEFAULT_CHARSET = null;
    public static final java.lang.String DEFAULT_CHARSET_NAME = null;
    private static final char[] DIGITS_LOWER = null;
    private static final char[] DIGITS_UPPER = null;
    private final java.nio.charset.Charset charset;

    static {
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            org.apache.commons.codec.binary.Hex.DEFAULT_CHARSET = r0
            java.lang.String r0 = org.apache.commons.codec.CharEncoding.UTF_8
            org.apache.commons.codec.binary.Hex.DEFAULT_CHARSET_NAME = r0
            r0 = 16
            char[] r1 = new char[r0]
            r1 = {x001a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            org.apache.commons.codec.binary.Hex.DIGITS_LOWER = r1
            char[] r0 = new char[r0]
            r0 = {x002e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            org.apache.commons.codec.binary.Hex.DIGITS_UPPER = r0
            return
    }

    public Hex() {
            r1 = this;
            r1.<init>()
            java.nio.charset.Charset r0 = org.apache.commons.codec.binary.Hex.DEFAULT_CHARSET
            r1.charset = r0
            return
    }

    public Hex(java.lang.String r1) {
            r0 = this;
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            r0.<init>(r1)
            return
    }

    public Hex(java.nio.charset.Charset r1) {
            r0 = this;
            r0.<init>()
            r0.charset = r1
            return
    }

    public static int decodeHex(char[] r6, byte[] r7, int r8) throws org.apache.commons.codec.DecoderException {
            int r0 = r6.length
            r1 = r0 & 1
            if (r1 != 0) goto L32
            int r1 = r0 >> 1
            int r2 = r7.length
            int r2 = r2 - r8
            if (r2 < r1) goto L2a
            r2 = 0
        Lc:
            if (r2 >= r0) goto L29
            char r3 = r6[r2]
            int r3 = toDigit(r3, r2)
            int r3 = r3 << 4
            int r4 = r2 + 1
            char r5 = r6[r4]
            int r4 = toDigit(r5, r4)
            r3 = r3 | r4
            int r2 = r2 + 2
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3
            r7[r8] = r3
            int r8 = r8 + 1
            goto Lc
        L29:
            return r1
        L2a:
            org.apache.commons.codec.DecoderException r6 = new org.apache.commons.codec.DecoderException
            java.lang.String r7 = "Output array is not large enough to accommodate decoded data."
            r6.<init>(r7)
            throw r6
        L32:
            org.apache.commons.codec.DecoderException r6 = new org.apache.commons.codec.DecoderException
            java.lang.String r7 = "Odd number of characters."
            r6.<init>(r7)
            throw r6
    }

    public static byte[] decodeHex(java.lang.String r0) throws org.apache.commons.codec.DecoderException {
            char[] r0 = r0.toCharArray()
            byte[] r0 = decodeHex(r0)
            return r0
    }

    public static byte[] decodeHex(char[] r2) throws org.apache.commons.codec.DecoderException {
            int r0 = r2.length
            int r0 = r0 >> 1
            byte[] r0 = new byte[r0]
            r1 = 0
            decodeHex(r2, r0, r1)
            return r0
    }

    public static void encodeHex(byte[] r6, int r7, int r8, boolean r9, char[] r10, int r11) {
            char[] r3 = toAlphabet(r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            encodeHex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static char[] encodeHex(java.nio.ByteBuffer r1) {
            r0 = 1
            char[] r1 = encodeHex(r1, r0)
            return r1
    }

    public static char[] encodeHex(java.nio.ByteBuffer r0, boolean r1) {
            char[] r1 = toAlphabet(r1)
            char[] r0 = encodeHex(r0, r1)
            return r0
    }

    protected static char[] encodeHex(java.nio.ByteBuffer r0, char[] r1) {
            byte[] r0 = toByteArray(r0)
            char[] r0 = encodeHex(r0, r1)
            return r0
    }

    public static char[] encodeHex(byte[] r1) {
            r0 = 1
            char[] r1 = encodeHex(r1, r0)
            return r1
    }

    public static char[] encodeHex(byte[] r6, int r7, int r8, boolean r9) {
            char[] r3 = toAlphabet(r9)
            int r9 = r8 << 1
            char[] r4 = new char[r9]
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            char[] r6 = encodeHex(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private static char[] encodeHex(byte[] r4, int r5, int r6, char[] r7, char[] r8, int r9) {
            r0 = r5
        L1:
            int r1 = r5 + r6
            if (r0 >= r1) goto L1c
            int r1 = r9 + 1
            r2 = r4[r0]
            r3 = r2 & 240(0xf0, float:3.36E-43)
            int r3 = r3 >>> 4
            char r3 = r7[r3]
            r8[r9] = r3
            int r9 = r9 + 2
            r2 = r2 & 15
            char r2 = r7[r2]
            r8[r1] = r2
            int r0 = r0 + 1
            goto L1
        L1c:
            return r8
    }

    public static char[] encodeHex(byte[] r0, boolean r1) {
            char[] r1 = toAlphabet(r1)
            char[] r0 = encodeHex(r0, r1)
            return r0
    }

    protected static char[] encodeHex(byte[] r6, char[] r7) {
            int r2 = r6.length
            int r0 = r2 << 1
            char[] r4 = new char[r0]
            r5 = 0
            r1 = 0
            r0 = r6
            r3 = r7
            char[] r6 = encodeHex(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String encodeHexString(java.nio.ByteBuffer r1) {
            java.lang.String r0 = new java.lang.String
            char[] r1 = encodeHex(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String encodeHexString(java.nio.ByteBuffer r1, boolean r2) {
            java.lang.String r0 = new java.lang.String
            char[] r1 = encodeHex(r1, r2)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String encodeHexString(byte[] r1) {
            java.lang.String r0 = new java.lang.String
            char[] r1 = encodeHex(r1)
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String encodeHexString(byte[] r1, boolean r2) {
            java.lang.String r0 = new java.lang.String
            char[] r1 = encodeHex(r1, r2)
            r0.<init>(r1)
            return r0
    }

    private static char[] toAlphabet(boolean r0) {
            if (r0 == 0) goto L5
            char[] r0 = org.apache.commons.codec.binary.Hex.DIGITS_LOWER
            goto L7
        L5:
            char[] r0 = org.apache.commons.codec.binary.Hex.DIGITS_UPPER
        L7:
            return r0
    }

    private static byte[] toByteArray(java.nio.ByteBuffer r3) {
            int r0 = r3.remaining()
            boolean r1 = r3.hasArray()
            if (r1 == 0) goto L15
            byte[] r1 = r3.array()
            int r2 = r1.length
            if (r0 != r2) goto L15
            r3.position(r0)
            return r1
        L15:
            byte[] r0 = new byte[r0]
            r3.get(r0)
            return r0
    }

    protected static int toDigit(char r3, int r4) throws org.apache.commons.codec.DecoderException {
            r0 = 16
            int r0 = java.lang.Character.digit(r3, r0)
            r1 = -1
            if (r0 == r1) goto La
            return r0
        La:
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Illegal hexadecimal character "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " at index "
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object r3) throws org.apache.commons.codec.DecoderException {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r3 = (java.lang.String) r3
            char[] r3 = r3.toCharArray()
            java.lang.Object r3 = r2.decode(r3)
            return r3
        Lf:
            boolean r0 = r3 instanceof byte[]
            if (r0 == 0) goto L1a
            byte[] r3 = (byte[]) r3
            byte[] r3 = r2.decode(r3)
            return r3
        L1a:
            boolean r0 = r3 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L25
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            byte[] r3 = r2.decode(r3)
            return r3
        L25:
            char[] r3 = (char[]) r3     // Catch: java.lang.ClassCastException -> L2c
            byte[] r3 = decodeHex(r3)     // Catch: java.lang.ClassCastException -> L2c
            return r3
        L2c:
            r3 = move-exception
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
    }

    public byte[] decode(java.nio.ByteBuffer r3) throws org.apache.commons.codec.DecoderException {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            byte[] r3 = toByteArray(r3)
            java.nio.charset.Charset r1 = r2.getCharset()
            r0.<init>(r3, r1)
            char[] r3 = r0.toCharArray()
            byte[] r3 = decodeHex(r3)
            return r3
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] r3) throws org.apache.commons.codec.DecoderException {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            java.nio.charset.Charset r1 = r2.getCharset()
            r0.<init>(r3, r1)
            char[] r3 = r0.toCharArray()
            byte[] r3 = decodeHex(r3)
            return r3
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r3) throws org.apache.commons.codec.EncoderException {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto Lf
            java.lang.String r3 = (java.lang.String) r3
            java.nio.charset.Charset r0 = r2.getCharset()
            byte[] r3 = r3.getBytes(r0)
            goto L1c
        Lf:
            boolean r0 = r3 instanceof java.nio.ByteBuffer
            if (r0 == 0) goto L1a
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            byte[] r3 = toByteArray(r3)
            goto L1c
        L1a:
            byte[] r3 = (byte[]) r3     // Catch: java.lang.ClassCastException -> L21
        L1c:
            char[] r3 = encodeHex(r3)
            return r3
        L21:
            r3 = move-exception
            org.apache.commons.codec.EncoderException r0 = new org.apache.commons.codec.EncoderException
            java.lang.String r1 = r3.getMessage()
            r0.<init>(r1, r3)
            throw r0
    }

    public byte[] encode(java.nio.ByteBuffer r2) {
            r1 = this;
            java.lang.String r2 = encodeHexString(r2)
            java.nio.charset.Charset r0 = r1.getCharset()
            byte[] r2 = r2.getBytes(r0)
            return r2
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] r2) {
            r1 = this;
            java.lang.String r2 = encodeHexString(r2)
            java.nio.charset.Charset r0 = r1.getCharset()
            byte[] r2 = r2.getBytes(r0)
            return r2
    }

    public java.nio.charset.Charset getCharset() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            return r0
    }

    public java.lang.String getCharsetName() {
            r1 = this;
            java.nio.charset.Charset r0 = r1.charset
            java.lang.String r0 = r0.name()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "[charsetName="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.nio.charset.Charset r1 = r2.charset
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
