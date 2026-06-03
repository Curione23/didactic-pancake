package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class Base64 extends org.apache.commons.codec.binary.BaseNCodec {
    private static final int ALPHABET_LENGTH = 64;
    private static final int BITS_PER_ENCODED_BYTE = 6;
    private static final int BYTES_PER_ENCODED_BLOCK = 4;
    private static final int BYTES_PER_UNENCODED_BLOCK = 3;
    private static final byte[] DECODE_TABLE = null;
    private static final int DECODING_TABLE_LENGTH = 256;
    private static final int MASK_2BITS = 3;
    private static final int MASK_4BITS = 15;
    private static final int MASK_6BITS = 63;
    private static final byte[] STANDARD_ENCODE_TABLE = null;
    private static final byte[] URL_SAFE_ENCODE_TABLE = null;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final boolean isUrlSafe;
    private final byte[] lineSeparator;

    /* JADX INFO: renamed from: org.apache.commons.codec.binary.Base64$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.codec.binary.BaseNCodec.AbstractBuilder<org.apache.commons.codec.binary.Base64, org.apache.commons.codec.binary.Base64.Builder> {
        public Builder() {
                r1 = this;
                byte[] r0 = org.apache.commons.codec.binary.Base64.access$000()
                r1.<init>(r0)
                return
        }

        @Override // java.util.function.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                org.apache.commons.codec.binary.Base64 r0 = r1.get()
                return r0
        }

        @Override // java.util.function.Supplier
        public org.apache.commons.codec.binary.Base64 get() {
                r8 = this;
                org.apache.commons.codec.binary.Base64 r7 = new org.apache.commons.codec.binary.Base64
                int r1 = r8.getLineLength()
                byte[] r2 = r8.getLineSeparator()
                byte r3 = r8.getPadding()
                byte[] r4 = r8.getEncodeTable()
                org.apache.commons.codec.CodecPolicy r5 = r8.getDecodingPolicy()
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public org.apache.commons.codec.binary.Base64.Builder setUrlSafe(boolean r1) {
                r0 = this;
                byte[] r1 = org.apache.commons.codec.binary.Base64.access$200(r1)
                org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder r1 = r0.setEncodeTable(r1)
                org.apache.commons.codec.binary.Base64$Builder r1 = (org.apache.commons.codec.binary.Base64.Builder) r1
                return r1
        }
    }

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0040: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE = r0
            r0 = 123(0x7b, float:1.72E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0064: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51} // fill-array
            org.apache.commons.codec.binary.Base64.DECODE_TABLE = r0
            return
    }

    public Base64() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Base64(int r2) {
            r1 = this;
            byte[] r0 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR
            r1.<init>(r2, r0)
            return
    }

    public Base64(int r2, byte[] r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    private Base64(int r8, byte[] r9, byte r10, byte[] r11, org.apache.commons.codec.CodecPolicy r12) {
            r7 = this;
            r2 = 4
            int r4 = toLength(r9)
            r1 = 3
            r0 = r7
            r3 = r8
            r5 = r10
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r10 = "encodeTable"
            java.util.Objects.requireNonNull(r11, r10)
            int r10 = r11.length
            r12 = 64
            if (r10 != r12) goto L7e
            byte[] r10 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE
            if (r11 != r10) goto L1d
            r10 = 1
            goto L1e
        L1d:
            r10 = 0
        L1e:
            r7.isUrlSafe = r10
            byte[] r12 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
            if (r11 == r12) goto L36
            if (r10 == 0) goto L27
            goto L36
        L27:
            java.lang.Object r10 = r11.clone()
            byte[] r10 = (byte[]) r10
            r7.encodeTable = r10
            byte[] r10 = r7.calculateDecodeTable(r10)
            r7.decodeTable = r10
            goto L3c
        L36:
            byte[] r10 = org.apache.commons.codec.binary.Base64.DECODE_TABLE
            r7.decodeTable = r10
            r7.encodeTable = r11
        L3c:
            r10 = 0
            r11 = 4
            if (r9 == 0) goto L79
            java.lang.Object r9 = r9.clone()
            byte[] r9 = (byte[]) r9
            boolean r12 = r7.containsAlphabetOrPad(r9)
            if (r12 != 0) goto L5a
            if (r8 <= 0) goto L55
            int r8 = r9.length
            int r8 = r8 + r11
            r7.encodeSize = r8
            r7.lineSeparator = r9
            goto L7d
        L55:
            r7.encodeSize = r11
            r7.lineSeparator = r10
            goto L7d
        L5a:
            java.lang.String r8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r9)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "lineSeparator must not contain base64 characters: ["
            r10.<init>(r11)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r10 = "]"
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L79:
            r7.encodeSize = r11
            r7.lineSeparator = r10
        L7d:
            return
        L7e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "encodeTable must have exactly 64 entries."
            r8.<init>(r9)
            throw r8
    }

    /* synthetic */ Base64(int r1, byte[] r2, byte r3, byte[] r4, org.apache.commons.codec.CodecPolicy r5, org.apache.commons.codec.binary.Base64.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Base64(int r7, byte[] r8, boolean r9) {
            r6 = this;
            byte[] r4 = toUrlSafeEncodeTable(r9)
            org.apache.commons.codec.CodecPolicy r5 = org.apache.commons.codec.binary.Base64.DECODING_POLICY_DEFAULT
            r3 = 61
            r0 = r6
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Base64(int r7, byte[] r8, boolean r9, org.apache.commons.codec.CodecPolicy r10) {
            r6 = this;
            r3 = 61
            byte[] r4 = toUrlSafeEncodeTable(r9)
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Base64(boolean r3) {
            r2 = this;
            r0 = 76
            byte[] r1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR
            r2.<init>(r0, r1, r3)
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
            return r0
    }

    static /* synthetic */ byte[] access$200(boolean r0) {
            byte[] r0 = toUrlSafeEncodeTable(r0)
            return r0
    }

    public static org.apache.commons.codec.binary.Base64.Builder builder() {
            org.apache.commons.codec.binary.Base64$Builder r0 = new org.apache.commons.codec.binary.Base64$Builder
            r0.<init>()
            return r0
    }

    private byte[] calculateDecodeTable(byte[] r5) {
            r4 = this;
            r0 = 256(0x100, float:3.59E-43)
            byte[] r0 = new byte[r0]
            r1 = -1
            java.util.Arrays.fill(r0, r1)
            r1 = 0
        L9:
            int r2 = r5.length
            if (r1 >= r2) goto L14
            r2 = r5[r1]
            byte r3 = (byte) r1
            r0[r2] = r3
            int r1 = r1 + 1
            goto L9
        L14:
            return r0
    }

    public static byte[] decodeBase64(java.lang.String r1) {
            org.apache.commons.codec.binary.Base64 r0 = new org.apache.commons.codec.binary.Base64
            r0.<init>()
            byte[] r1 = r0.decode(r1)
            return r1
    }

    public static byte[] decodeBase64(byte[] r1) {
            org.apache.commons.codec.binary.Base64 r0 = new org.apache.commons.codec.binary.Base64
            r0.<init>()
            byte[] r1 = r0.decode(r1)
            return r1
    }

    public static java.math.BigInteger decodeInteger(byte[] r2) {
            java.math.BigInteger r0 = new java.math.BigInteger
            r1 = 1
            byte[] r2 = decodeBase64(r2)
            r0.<init>(r1, r2)
            return r0
    }

    public static byte[] encodeBase64(byte[] r1) {
            r0 = 0
            byte[] r1 = encodeBase64(r1, r0)
            return r1
    }

    public static byte[] encodeBase64(byte[] r1, boolean r2) {
            r0 = 0
            byte[] r1 = encodeBase64(r1, r2, r0)
            return r1
    }

    public static byte[] encodeBase64(byte[] r1, boolean r2, boolean r3) {
            r0 = 2147483647(0x7fffffff, float:NaN)
            byte[] r1 = encodeBase64(r1, r2, r3, r0)
            return r1
    }

    public static byte[] encodeBase64(byte[] r4, boolean r5, boolean r6, int r7) {
            boolean r0 = org.apache.commons.codec.binary.BinaryCodec.isEmpty(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            if (r5 == 0) goto Lf
            org.apache.commons.codec.binary.Base64 r5 = new org.apache.commons.codec.binary.Base64
            r5.<init>(r6)
            goto L17
        Lf:
            org.apache.commons.codec.binary.Base64 r5 = new org.apache.commons.codec.binary.Base64
            r0 = 0
            byte[] r1 = org.apache.commons.codec.binary.Base64.CHUNK_SEPARATOR
            r5.<init>(r0, r1, r6)
        L17:
            long r0 = r5.getEncodedLength(r4)
            long r2 = (long) r7
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 > 0) goto L25
            byte[] r4 = r5.encode(r4)
            return r4
        L25:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Input array too big, the output array would be bigger ("
            r5.<init>(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = ") than the specified maximum size of "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    public static byte[] encodeBase64Chunked(byte[] r1) {
            r0 = 1
            byte[] r1 = encodeBase64(r1, r0)
            return r1
    }

    public static java.lang.String encodeBase64String(byte[] r1) {
            r0 = 0
            byte[] r1 = encodeBase64(r1, r0)
            java.lang.String r1 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(r1)
            return r1
    }

    public static byte[] encodeBase64URLSafe(byte[] r2) {
            r0 = 0
            r1 = 1
            byte[] r2 = encodeBase64(r2, r0, r1)
            return r2
    }

    public static java.lang.String encodeBase64URLSafeString(byte[] r2) {
            r0 = 0
            r1 = 1
            byte[] r2 = encodeBase64(r2, r0, r1)
            java.lang.String r2 = org.apache.commons.codec.binary.StringUtils.newStringUsAscii(r2)
            return r2
    }

    public static byte[] encodeInteger(java.math.BigInteger r1) {
            java.lang.String r0 = "bigInteger"
            java.util.Objects.requireNonNull(r1, r0)
            byte[] r1 = toIntegerBytes(r1)
            r0 = 0
            byte[] r1 = encodeBase64(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static boolean isArrayByteBase64(byte[] r0) {
            boolean r0 = isBase64(r0)
            return r0
    }

    public static boolean isBase64(byte r2) {
            r0 = 61
            if (r2 == r0) goto L13
            if (r2 < 0) goto L11
            byte[] r0 = org.apache.commons.codec.binary.Base64.DECODE_TABLE
            int r1 = r0.length
            if (r2 >= r1) goto L11
            r2 = r0[r2]
            r0 = -1
            if (r2 == r0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    public static boolean isBase64(java.lang.String r0) {
            byte[] r0 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r0)
            boolean r0 = isBase64(r0)
            return r0
    }

    public static boolean isBase64(byte[] r5) {
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L17
            r3 = r5[r2]
            boolean r4 = isBase64(r3)
            if (r4 != 0) goto L14
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 != 0) goto L14
            return r1
        L14:
            int r2 = r2 + 1
            goto L3
        L17:
            r5 = 1
            return r5
    }

    static byte[] toIntegerBytes(java.math.BigInteger r5) {
            int r0 = r5.bitLength()
            int r0 = r0 + 7
            int r0 = r0 >> 3
            int r0 = r0 << 3
            byte[] r1 = r5.toByteArray()
            int r2 = r5.bitLength()
            int r2 = r2 % 8
            r3 = 1
            if (r2 == 0) goto L23
            int r2 = r5.bitLength()
            int r2 = r2 / 8
            int r2 = r2 + r3
            int r4 = r0 / 8
            if (r2 != r4) goto L23
            return r1
        L23:
            int r2 = r1.length
            int r5 = r5.bitLength()
            int r5 = r5 % 8
            if (r5 != 0) goto L2f
            int r2 = r2 + (-1)
            goto L30
        L2f:
            r3 = 0
        L30:
            int r0 = r0 / 8
            int r5 = r0 - r2
            byte[] r0 = new byte[r0]
            java.lang.System.arraycopy(r1, r3, r0, r5, r2)
            return r0
    }

    private static byte[] toUrlSafeEncodeTable(boolean r0) {
            if (r0 == 0) goto L5
            byte[] r0 = org.apache.commons.codec.binary.Base64.URL_SAFE_ENCODE_TABLE
            goto L7
        L5:
            byte[] r0 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
        L7:
            return r0
    }

    private void validateCharacter(int r2, org.apache.commons.codec.binary.BaseNCodec.Context r3) {
            r1 = this;
            boolean r0 = r1.isStrictDecoding()
            if (r0 == 0) goto L14
            int r3 = r3.ibitWorkArea
            r2 = r2 & r3
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero."
            r2.<init>(r3)
            throw r2
        L14:
            return
    }

    private void validateTrailingCharacter() {
            r2 = this;
            boolean r0 = r2.isStrictDecoding()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Strict decoding: Last encoded character (before the paddings if any) is a valid base 64 alphabet but not a possible encoding. Decoding requires at least two trailing 6-bit characters to create bytes."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void decode(byte[] r8, int r9, int r10, org.apache.commons.codec.binary.BaseNCodec.Context r11) {
            r7 = this;
            boolean r0 = r11.eof
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            if (r10 >= 0) goto La
            r11.eof = r0
        La:
            int r1 = r7.encodeSize
            int r1 = r1 - r0
            r2 = 0
        Le:
            if (r2 >= r10) goto L6b
            byte[] r3 = r7.ensureBufferSize(r1, r11)
            int r4 = r9 + 1
            r9 = r8[r9]
            byte r5 = r7.pad
            if (r9 != r5) goto L1f
            r11.eof = r0
            goto L6b
        L1f:
            if (r9 < 0) goto L67
            byte[] r5 = r7.decodeTable
            int r6 = r5.length
            if (r9 >= r6) goto L67
            r9 = r5[r9]
            if (r9 < 0) goto L67
            int r5 = r11.modulus
            int r5 = r5 + r0
            int r5 = r5 % 4
            r11.modulus = r5
            int r5 = r11.ibitWorkArea
            int r5 = r5 << 6
            int r5 = r5 + r9
            r11.ibitWorkArea = r5
            int r9 = r11.modulus
            if (r9 != 0) goto L67
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            int r5 = r11.ibitWorkArea
            int r5 = r5 >> 16
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            int r5 = r11.ibitWorkArea
            int r5 = r5 >> 8
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            int r5 = r11.ibitWorkArea
            r5 = r5 & 255(0xff, float:3.57E-43)
            byte r5 = (byte) r5
            r3[r9] = r5
        L67:
            int r2 = r2 + 1
            r9 = r4
            goto Le
        L6b:
            boolean r8 = r11.eof
            if (r8 == 0) goto Ld9
            int r8 = r11.modulus
            if (r8 == 0) goto Ld9
            byte[] r8 = r7.ensureBufferSize(r1, r11)
            int r9 = r11.modulus
            if (r9 == r0) goto Ld6
            r10 = 2
            if (r9 == r10) goto Lbd
            r0 = 3
            if (r9 != r0) goto La6
            r7.validateCharacter(r0, r11)
            int r9 = r11.ibitWorkArea
            int r9 = r9 >> r10
            r11.ibitWorkArea = r9
            int r9 = r11.pos
            int r10 = r9 + 1
            r11.pos = r10
            int r10 = r11.ibitWorkArea
            int r10 = r10 >> 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r8[r9] = r10
            int r9 = r11.pos
            int r10 = r9 + 1
            r11.pos = r10
            int r10 = r11.ibitWorkArea
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r8[r9] = r10
            goto Ld9
        La6:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Impossible modulus "
            r9.<init>(r10)
            int r10 = r11.modulus
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        Lbd:
            r9 = 15
            r7.validateCharacter(r9, r11)
            int r9 = r11.ibitWorkArea
            int r9 = r9 >> 4
            r11.ibitWorkArea = r9
            int r9 = r11.pos
            int r10 = r9 + 1
            r11.pos = r10
            int r10 = r11.ibitWorkArea
            r10 = r10 & 255(0xff, float:3.57E-43)
            byte r10 = (byte) r10
            r8[r9] = r10
            goto Ld9
        Ld6:
            r7.validateTrailingCharacter()
        Ld9:
            return
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void encode(byte[] r8, int r9, int r10, org.apache.commons.codec.binary.BaseNCodec.Context r11) {
            r7 = this;
            boolean r0 = r11.eof
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 1
            if (r10 >= 0) goto Le5
            r11.eof = r1
            int r8 = r11.modulus
            if (r8 != 0) goto L14
            int r8 = r7.lineLength
            if (r8 != 0) goto L14
            return
        L14:
            int r8 = r7.encodeSize
            byte[] r8 = r7.ensureBufferSize(r8, r11)
            int r9 = r11.pos
            int r10 = r11.modulus
            if (r10 == 0) goto Lc1
            r2 = 2
            if (r10 == r1) goto L83
            if (r10 != r2) goto L6c
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r3 = r3 >> 10
            r3 = r3 & 63
            r1 = r1[r3]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r3 = r3 >> 4
            r3 = r3 & 63
            r1 = r1[r3]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r2 = r3 << 2
            r2 = r2 & 63
            r1 = r1[r2]
            r8[r10] = r1
            byte[] r10 = r7.encodeTable
            byte[] r1 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
            if (r10 != r1) goto Lc1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.pad
            r8[r10] = r1
            goto Lc1
        L6c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Impossible modulus "
            r9.<init>(r10)
            int r10 = r11.modulus
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L83:
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.encodeTable
            int r3 = r11.ibitWorkArea
            int r2 = r3 >> 2
            r2 = r2 & 63
            r1 = r1[r2]
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte[] r1 = r7.encodeTable
            int r2 = r11.ibitWorkArea
            int r2 = r2 << 4
            r2 = r2 & 63
            r1 = r1[r2]
            r8[r10] = r1
            byte[] r10 = r7.encodeTable
            byte[] r1 = org.apache.commons.codec.binary.Base64.STANDARD_ENCODE_TABLE
            if (r10 != r1) goto Lc1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.pad
            r8[r10] = r1
            int r10 = r11.pos
            int r1 = r10 + 1
            r11.pos = r1
            byte r1 = r7.pad
            r8[r10] = r1
        Lc1:
            int r10 = r11.currentLinePos
            int r1 = r11.pos
            int r1 = r1 - r9
            int r10 = r10 + r1
            r11.currentLinePos = r10
            int r9 = r7.lineLength
            if (r9 <= 0) goto L177
            int r9 = r11.currentLinePos
            if (r9 <= 0) goto L177
            byte[] r9 = r7.lineSeparator
            int r10 = r11.pos
            byte[] r1 = r7.lineSeparator
            int r1 = r1.length
            java.lang.System.arraycopy(r9, r0, r8, r10, r1)
            int r8 = r11.pos
            byte[] r9 = r7.lineSeparator
            int r9 = r9.length
            int r8 = r8 + r9
            r11.pos = r8
            goto L177
        Le5:
            r2 = r0
        Le6:
            if (r2 >= r10) goto L177
            int r3 = r7.encodeSize
            byte[] r3 = r7.ensureBufferSize(r3, r11)
            int r4 = r11.modulus
            int r4 = r4 + r1
            int r4 = r4 % 3
            r11.modulus = r4
            int r4 = r9 + 1
            r9 = r8[r9]
            if (r9 >= 0) goto Lfd
            int r9 = r9 + 256
        Lfd:
            int r5 = r11.ibitWorkArea
            int r5 = r5 << 8
            int r5 = r5 + r9
            r11.ibitWorkArea = r5
            int r9 = r11.modulus
            if (r9 != 0) goto L172
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            int r6 = r6 >> 18
            r6 = r6 & 63
            r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            int r6 = r6 >> 12
            r6 = r6 & 63
            r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            int r6 = r6 >> 6
            r6 = r6 & 63
            r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.pos
            int r5 = r9 + 1
            r11.pos = r5
            byte[] r5 = r7.encodeTable
            int r6 = r11.ibitWorkArea
            r6 = r6 & 63
            r5 = r5[r6]
            r3[r9] = r5
            int r9 = r11.currentLinePos
            int r9 = r9 + 4
            r11.currentLinePos = r9
            int r9 = r7.lineLength
            if (r9 <= 0) goto L172
            int r9 = r7.lineLength
            int r5 = r11.currentLinePos
            if (r9 > r5) goto L172
            byte[] r9 = r7.lineSeparator
            int r5 = r11.pos
            byte[] r6 = r7.lineSeparator
            int r6 = r6.length
            java.lang.System.arraycopy(r9, r0, r3, r5, r6)
            int r9 = r11.pos
            byte[] r3 = r7.lineSeparator
            int r3 = r3.length
            int r9 = r9 + r3
            r11.pos = r9
            r11.currentLinePos = r0
        L172:
            int r2 = r2 + 1
            r9 = r4
            goto Le6
        L177:
            return
    }

    byte[] getLineSeparator() {
            r1 = this;
            byte[] r0 = r1.lineSeparator
            return r0
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    protected boolean isInAlphabet(byte r3) {
            r2 = this;
            if (r3 < 0) goto Le
            byte[] r0 = r2.decodeTable
            int r1 = r0.length
            if (r3 >= r1) goto Le
            r3 = r0[r3]
            r0 = -1
            if (r3 == r0) goto Le
            r3 = 1
            goto Lf
        Le:
            r3 = 0
        Lf:
            return r3
    }

    public boolean isUrlSafe() {
            r1 = this;
            boolean r0 = r1.isUrlSafe
            return r0
    }
}
