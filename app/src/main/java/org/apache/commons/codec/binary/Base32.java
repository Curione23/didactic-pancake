package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class Base32 extends org.apache.commons.codec.binary.BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 5;
    private static final int BYTES_PER_ENCODED_BLOCK = 8;
    private static final int BYTES_PER_UNENCODED_BLOCK = 5;
    private static final byte[] DECODE_TABLE = null;
    private static final byte[] ENCODE_TABLE = null;
    private static final byte[] HEX_DECODE_TABLE = null;
    private static final byte[] HEX_ENCODE_TABLE = null;
    private static final long MASK_1BITS = 1;
    private static final long MASK_2BITS = 3;
    private static final long MASK_3BITS = 7;
    private static final long MASK_4BITS = 15;
    private static final int MASK_5BITS = 31;
    private final byte[] decodeTable;
    private final int encodeSize;
    private final byte[] encodeTable;
    private final byte[] lineSeparator;

    /* JADX INFO: renamed from: org.apache.commons.codec.binary.Base32$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
    }

    public static class Builder extends org.apache.commons.codec.binary.BaseNCodec.AbstractBuilder<org.apache.commons.codec.binary.Base32, org.apache.commons.codec.binary.Base32.Builder> {
        public Builder() {
                r1 = this;
                byte[] r0 = org.apache.commons.codec.binary.Base32.access$000()
                r1.<init>(r0)
                return
        }

        @Override // java.util.function.Supplier
        public /* bridge */ /* synthetic */ java.lang.Object get() {
                r1 = this;
                org.apache.commons.codec.binary.Base32 r0 = r1.get()
                return r0
        }

        @Override // java.util.function.Supplier
        public org.apache.commons.codec.binary.Base32 get() {
                r8 = this;
                org.apache.commons.codec.binary.Base32 r7 = new org.apache.commons.codec.binary.Base32
                int r1 = r8.getLineLength()
                byte[] r2 = r8.getLineSeparator()
                byte[] r3 = r8.getEncodeTable()
                byte r4 = r8.getPadding()
                org.apache.commons.codec.CodecPolicy r5 = r8.getDecodingPolicy()
                r6 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    static {
            r0 = 123(0x7b, float:1.72E-43)
            byte[] r0 = new byte[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25} // fill-array
            org.apache.commons.codec.binary.Base32.DECODE_TABLE = r0
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x0068: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 50, 51, 52, 53, 54, 55} // fill-array
            org.apache.commons.codec.binary.Base32.ENCODE_TABLE = r0
            r0 = 119(0x77, float:1.67E-43)
            byte[] r0 = new byte[r0]
            r0 = {x007c: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31} // fill-array
            org.apache.commons.codec.binary.Base32.HEX_DECODE_TABLE = r0
            r0 = 32
            byte[] r0 = new byte[r0]
            r0 = {x00bc: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86} // fill-array
            org.apache.commons.codec.binary.Base32.HEX_ENCODE_TABLE = r0
            return
    }

    public Base32() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Base32(byte r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public Base32(int r2) {
            r1 = this;
            byte[] r0 = org.apache.commons.codec.binary.Base32.CHUNK_SEPARATOR
            r1.<init>(r2, r0)
            return
    }

    public Base32(int r3, byte[] r4) {
            r2 = this;
            r0 = 0
            r1 = 61
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public Base32(int r2, byte[] r3, boolean r4) {
            r1 = this;
            r0 = 61
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public Base32(int r7, byte[] r8, boolean r9, byte r10) {
            r6 = this;
            org.apache.commons.codec.CodecPolicy r5 = org.apache.commons.codec.binary.Base32.DECODING_POLICY_DEFAULT
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Base32(int r7, byte[] r8, boolean r9, byte r10, org.apache.commons.codec.CodecPolicy r11) {
            r6 = this;
            if (r9 == 0) goto L5
            byte[] r9 = org.apache.commons.codec.binary.Base32.HEX_ENCODE_TABLE
            goto L7
        L5:
            byte[] r9 = org.apache.commons.codec.binary.Base32.ENCODE_TABLE
        L7:
            r3 = r9
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private Base32(int r8, byte[] r9, byte[] r10, byte r11, org.apache.commons.codec.CodecPolicy r12) {
            r7 = this;
            r2 = 8
            int r4 = toLength(r9)
            r1 = 5
            r0 = r7
            r3 = r8
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r12 = "encodeTable"
            java.util.Objects.requireNonNull(r10, r12)
            r7.encodeTable = r10
            byte[] r12 = org.apache.commons.codec.binary.Base32.HEX_ENCODE_TABLE
            if (r10 != r12) goto L1c
            byte[] r10 = org.apache.commons.codec.binary.Base32.HEX_DECODE_TABLE
            goto L1e
        L1c:
            byte[] r10 = org.apache.commons.codec.binary.Base32.DECODE_TABLE
        L1e:
            r7.decodeTable = r10
            r10 = 8
            if (r8 <= 0) goto L73
            if (r9 == 0) goto L58
            java.lang.Object r8 = r9.clone()
            byte[] r8 = (byte[]) r8
            boolean r9 = r7.containsAlphabetOrPad(r8)
            if (r9 != 0) goto L39
            int r9 = r8.length
            int r9 = r9 + r10
            r7.encodeSize = r9
            r7.lineSeparator = r8
            goto L78
        L39:
            java.lang.String r8 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r8)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "lineSeparator must not contain Base32 characters: ["
            r10.<init>(r11)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r10 = "]"
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L58:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "lineLength "
            r10.<init>(r11)
            java.lang.StringBuilder r8 = r10.append(r8)
            java.lang.String r10 = " > 0, but lineSeparator is null"
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L73:
            r7.encodeSize = r10
            r8 = 0
            r7.lineSeparator = r8
        L78:
            boolean r8 = r7.isInAlphabet(r11)
            if (r8 != 0) goto L85
            boolean r8 = java.lang.Character.isWhitespace(r11)
            if (r8 != 0) goto L85
            return
        L85:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "pad must not be in alphabet or whitespace"
            r8.<init>(r9)
            throw r8
    }

    /* synthetic */ Base32(int r1, byte[] r2, byte[] r3, byte r4, org.apache.commons.codec.CodecPolicy r5, org.apache.commons.codec.binary.Base32.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Base32(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 61
            r2 = 0
            r3.<init>(r2, r0, r4, r1)
            return
    }

    public Base32(boolean r3, byte r4) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r0, r1, r3, r4)
            return
    }

    static /* synthetic */ byte[] access$000() {
            byte[] r0 = org.apache.commons.codec.binary.Base32.ENCODE_TABLE
            return r0
    }

    public static org.apache.commons.codec.binary.Base32.Builder builder() {
            org.apache.commons.codec.binary.Base32$Builder r0 = new org.apache.commons.codec.binary.Base32$Builder
            r0.<init>()
            return r0
    }

    private void validateCharacter(long r3, org.apache.commons.codec.binary.BaseNCodec.Context r5) {
            r2 = this;
            boolean r0 = r2.isStrictDecoding()
            if (r0 == 0) goto L18
            long r0 = r5.lbitWorkArea
            long r3 = r3 & r0
            r0 = 0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 != 0) goto L10
            goto L18
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Strict decoding: Last encoded character (before the paddings if any) is a valid base 32 alphabet but not a possible encoding. Expected the discarded bits from the character to be zero."
            r3.<init>(r4)
            throw r3
        L18:
            return
    }

    private void validateTrailingCharacters() {
            r2 = this;
            boolean r0 = r2.isStrictDecoding()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Strict decoding: Last encoded character(s) (before the paddings if any) are valid base 32 alphabet but not a possible encoding. Decoding requires either 2, 4, 5, or 7 trailing 5-bit characters to create bytes."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void decode(byte[] r19, int r20, int r21, org.apache.commons.codec.binary.BaseNCodec.Context r22) {
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = r22
            boolean r3 = r2.eof
            if (r3 == 0) goto Lb
            return
        Lb:
            r3 = 1
            if (r1 >= 0) goto L10
            r2.eof = r3
        L10:
            int r4 = r0.encodeSize
            int r4 = r4 - r3
            r5 = 0
            r6 = r5
            r5 = r20
        L17:
            r7 = 24
            r8 = 16
            r9 = 8
            r10 = 255(0xff, double:1.26E-321)
            if (r6 >= r1) goto La4
            int r12 = r5 + 1
            r5 = r19[r5]
            byte r13 = r0.pad
            if (r5 != r13) goto L2d
            r2.eof = r3
            goto La4
        L2d:
            byte[] r13 = r0.ensureBufferSize(r4, r2)
            if (r5 < 0) goto L9a
            byte[] r14 = r0.decodeTable
            int r15 = r14.length
            if (r5 >= r15) goto L9a
            r5 = r14[r5]
            if (r5 < 0) goto L9a
            int r14 = r2.modulus
            int r14 = r14 + r3
            int r14 = r14 % r9
            r2.modulus = r14
            long r14 = r2.lbitWorkArea
            r16 = 5
            long r14 = r14 << r16
            r17 = r4
            long r3 = (long) r5
            long r14 = r14 + r3
            r2.lbitWorkArea = r14
            int r3 = r2.modulus
            if (r3 != 0) goto L9c
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            r14 = 32
            long r4 = r4 >> r14
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r13[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r7
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r13[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r8
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r13[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r9
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r13[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r13[r3] = r4
            goto L9c
        L9a:
            r17 = r4
        L9c:
            int r6 = r6 + 1
            r5 = r12
            r4 = r17
            r3 = 1
            goto L17
        La4:
            r17 = r4
            boolean r1 = r2.eof
            if (r1 == 0) goto L1ce
            int r1 = r2.modulus
            if (r1 <= 0) goto L1ce
            r4 = r17
            byte[] r1 = r0.ensureBufferSize(r4, r2)
            int r3 = r2.modulus
            switch(r3) {
                case 1: goto L1b7;
                case 2: goto L1ba;
                case 3: goto L1a4;
                case 4: goto L17d;
                case 5: goto L148;
                case 6: goto L114;
                case 7: goto Ld0;
                default: goto Lb9;
            }
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Impossible modulus "
            r3.<init>(r4)
            int r2 = r2.modulus
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        Ld0:
            r3 = 7
            r0.validateCharacter(r3, r2)
            long r3 = r2.lbitWorkArea
            r5 = 3
            long r3 = r3 >> r5
            r2.lbitWorkArea = r3
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r7
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r8
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r9
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 & r10
            int r2 = (int) r4
            byte r2 = (byte) r2
            r1[r3] = r2
            goto L1ce
        L114:
            r18.validateTrailingCharacters()
            long r3 = r2.lbitWorkArea
            r5 = 6
            long r3 = r3 >> r5
            r2.lbitWorkArea = r3
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r8
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r9
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 & r10
            int r2 = (int) r4
            byte r2 = (byte) r2
            r1[r3] = r2
            goto L1ce
        L148:
            r3 = 1
            r0.validateCharacter(r3, r2)
            long r3 = r2.lbitWorkArea
            r5 = 1
            long r3 = r3 >> r5
            r2.lbitWorkArea = r3
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r8
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r9
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 & r10
            int r2 = (int) r4
            byte r2 = (byte) r2
            r1[r3] = r2
            goto L1ce
        L17d:
            r3 = 15
            r0.validateCharacter(r3, r2)
            long r3 = r2.lbitWorkArea
            r5 = 4
            long r3 = r3 >> r5
            r2.lbitWorkArea = r3
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 >> r9
            long r4 = r4 & r10
            int r4 = (int) r4
            byte r4 = (byte) r4
            r1[r3] = r4
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            long r4 = r4 & r10
            int r2 = (int) r4
            byte r2 = (byte) r2
            r1[r3] = r2
            goto L1ce
        L1a4:
            r18.validateTrailingCharacters()
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            r2 = 7
            long r4 = r4 >> r2
            long r4 = r4 & r10
            int r2 = (int) r4
            byte r2 = (byte) r2
            r1[r3] = r2
            goto L1ce
        L1b7:
            r18.validateTrailingCharacters()
        L1ba:
            r3 = 3
            r0.validateCharacter(r3, r2)
            int r3 = r2.pos
            int r4 = r3 + 1
            r2.pos = r4
            long r4 = r2.lbitWorkArea
            r2 = 2
            long r4 = r4 >> r2
            long r4 = r4 & r10
            int r2 = (int) r4
            byte r2 = (byte) r2
            r1[r3] = r2
        L1ce:
            return
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void encode(byte[] r12, int r13, int r14, org.apache.commons.codec.binary.BaseNCodec.Context r15) {
            r11 = this;
            boolean r0 = r15.eof
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 0
            r1 = 1
            if (r14 >= 0) goto L251
            r15.eof = r1
            int r12 = r15.modulus
            if (r12 != 0) goto L14
            int r12 = r11.lineLength
            if (r12 != 0) goto L14
            return
        L14:
            int r12 = r11.encodeSize
            byte[] r12 = r11.ensureBufferSize(r12, r15)
            int r13 = r15.pos
            int r14 = r15.modulus
            if (r14 == 0) goto L22d
            r2 = 3
            r3 = 2
            if (r14 == r1) goto L1cc
            r4 = 4
            if (r14 == r3) goto L158
            if (r14 == r2) goto Ld7
            if (r14 != r4) goto Lc0
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            r6 = 27
            long r4 = r4 >> r6
            int r4 = (int) r4
            r4 = r4 & 31
            r1 = r1[r4]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            r6 = 22
            long r4 = r4 >> r6
            int r4 = (int) r4
            r4 = r4 & 31
            r1 = r1[r4]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            r6 = 17
            long r4 = r4 >> r6
            int r4 = (int) r4
            r4 = r4 & 31
            r1 = r1[r4]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            r6 = 12
            long r4 = r4 >> r6
            int r4 = (int) r4
            r4 = r4 & 31
            r1 = r1[r4]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            r6 = 7
            long r4 = r4 >> r6
            int r4 = (int) r4
            r4 = r4 & 31
            r1 = r1[r4]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            long r3 = r4 >> r3
            int r3 = (int) r3
            r3 = r3 & 31
            r1 = r1[r3]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r3 = r15.lbitWorkArea
            long r2 = r3 << r2
            int r2 = (int) r2
            r2 = r2 & 31
            r1 = r1[r2]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            goto L22d
        Lc0:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Impossible modulus "
            r13.<init>(r14)
            int r14 = r15.modulus
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        Ld7:
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r5 = r15.lbitWorkArea
            r3 = 19
            long r5 = r5 >> r3
            int r3 = (int) r5
            r3 = r3 & 31
            r2 = r2[r3]
            r12[r14] = r2
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r5 = r15.lbitWorkArea
            r3 = 14
            long r5 = r5 >> r3
            int r3 = (int) r5
            r3 = r3 & 31
            r2 = r2[r3]
            r12[r14] = r2
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r5 = r15.lbitWorkArea
            r3 = 9
            long r5 = r5 >> r3
            int r3 = (int) r5
            r3 = r3 & 31
            r2 = r2[r3]
            r12[r14] = r2
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r5 = r15.lbitWorkArea
            long r3 = r5 >> r4
            int r3 = (int) r3
            r3 = r3 & 31
            r2 = r2[r3]
            r12[r14] = r2
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r3 = r15.lbitWorkArea
            long r3 = r3 << r1
            int r1 = (int) r3
            r1 = r1 & 31
            r1 = r2[r1]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            goto L22d
        L158:
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r5 = r15.lbitWorkArea
            r3 = 11
            long r5 = r5 >> r3
            int r3 = (int) r5
            r3 = r3 & 31
            r2 = r2[r3]
            r12[r14] = r2
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r5 = r15.lbitWorkArea
            r3 = 6
            long r5 = r5 >> r3
            int r3 = (int) r5
            r3 = r3 & 31
            r2 = r2[r3]
            r12[r14] = r2
            int r14 = r15.pos
            int r2 = r14 + 1
            r15.pos = r2
            byte[] r2 = r11.encodeTable
            long r5 = r15.lbitWorkArea
            long r5 = r5 >> r1
            int r1 = (int) r5
            r1 = r1 & 31
            r1 = r2[r1]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r2 = r15.lbitWorkArea
            long r2 = r2 << r4
            int r2 = (int) r2
            r2 = r2 & 31
            r1 = r1[r2]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            goto L22d
        L1cc:
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            long r4 = r4 >> r2
            int r2 = (int) r4
            r2 = r2 & 31
            r1 = r1[r2]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte[] r1 = r11.encodeTable
            long r4 = r15.lbitWorkArea
            long r2 = r4 << r3
            int r2 = (int) r2
            r2 = r2 & 31
            r1 = r1[r2]
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
            int r14 = r15.pos
            int r1 = r14 + 1
            r15.pos = r1
            byte r1 = r11.pad
            r12[r14] = r1
        L22d:
            int r14 = r15.currentLinePos
            int r1 = r15.pos
            int r1 = r1 - r13
            int r14 = r14 + r1
            r15.currentLinePos = r14
            int r13 = r11.lineLength
            if (r13 <= 0) goto L339
            int r13 = r15.currentLinePos
            if (r13 <= 0) goto L339
            byte[] r13 = r11.lineSeparator
            int r14 = r15.pos
            byte[] r1 = r11.lineSeparator
            int r1 = r1.length
            java.lang.System.arraycopy(r13, r0, r12, r14, r1)
            int r12 = r15.pos
            byte[] r13 = r11.lineSeparator
            int r13 = r13.length
            int r12 = r12 + r13
            r15.pos = r12
            goto L339
        L251:
            r2 = r0
        L252:
            if (r2 >= r14) goto L339
            int r3 = r11.encodeSize
            byte[] r3 = r11.ensureBufferSize(r3, r15)
            int r4 = r15.modulus
            int r4 = r4 + r1
            r5 = 5
            int r4 = r4 % r5
            r15.modulus = r4
            int r4 = r13 + 1
            r13 = r12[r13]
            if (r13 >= 0) goto L269
            int r13 = r13 + 256
        L269:
            long r6 = r15.lbitWorkArea
            r8 = 8
            long r6 = r6 << r8
            long r9 = (long) r13
            long r6 = r6 + r9
            r15.lbitWorkArea = r6
            int r13 = r15.modulus
            if (r13 != 0) goto L334
            int r13 = r15.pos
            int r6 = r13 + 1
            r15.pos = r6
            byte[] r6 = r11.encodeTable
            long r9 = r15.lbitWorkArea
            r7 = 35
            long r9 = r9 >> r7
            int r7 = (int) r9
            r7 = r7 & 31
            r6 = r6[r7]
            r3[r13] = r6
            int r13 = r15.pos
            int r6 = r13 + 1
            r15.pos = r6
            byte[] r6 = r11.encodeTable
            long r9 = r15.lbitWorkArea
            r7 = 30
            long r9 = r9 >> r7
            int r7 = (int) r9
            r7 = r7 & 31
            r6 = r6[r7]
            r3[r13] = r6
            int r13 = r15.pos
            int r6 = r13 + 1
            r15.pos = r6
            byte[] r6 = r11.encodeTable
            long r9 = r15.lbitWorkArea
            r7 = 25
            long r9 = r9 >> r7
            int r7 = (int) r9
            r7 = r7 & 31
            r6 = r6[r7]
            r3[r13] = r6
            int r13 = r15.pos
            int r6 = r13 + 1
            r15.pos = r6
            byte[] r6 = r11.encodeTable
            long r9 = r15.lbitWorkArea
            r7 = 20
            long r9 = r9 >> r7
            int r7 = (int) r9
            r7 = r7 & 31
            r6 = r6[r7]
            r3[r13] = r6
            int r13 = r15.pos
            int r6 = r13 + 1
            r15.pos = r6
            byte[] r6 = r11.encodeTable
            long r9 = r15.lbitWorkArea
            r7 = 15
            long r9 = r9 >> r7
            int r7 = (int) r9
            r7 = r7 & 31
            r6 = r6[r7]
            r3[r13] = r6
            int r13 = r15.pos
            int r6 = r13 + 1
            r15.pos = r6
            byte[] r6 = r11.encodeTable
            long r9 = r15.lbitWorkArea
            r7 = 10
            long r9 = r9 >> r7
            int r7 = (int) r9
            r7 = r7 & 31
            r6 = r6[r7]
            r3[r13] = r6
            int r13 = r15.pos
            int r6 = r13 + 1
            r15.pos = r6
            byte[] r6 = r11.encodeTable
            long r9 = r15.lbitWorkArea
            long r9 = r9 >> r5
            int r5 = (int) r9
            r5 = r5 & 31
            r5 = r6[r5]
            r3[r13] = r5
            int r13 = r15.pos
            int r5 = r13 + 1
            r15.pos = r5
            byte[] r5 = r11.encodeTable
            long r6 = r15.lbitWorkArea
            int r6 = (int) r6
            r6 = r6 & 31
            r5 = r5[r6]
            r3[r13] = r5
            int r13 = r15.currentLinePos
            int r13 = r13 + r8
            r15.currentLinePos = r13
            int r13 = r11.lineLength
            if (r13 <= 0) goto L334
            int r13 = r11.lineLength
            int r5 = r15.currentLinePos
            if (r13 > r5) goto L334
            byte[] r13 = r11.lineSeparator
            int r5 = r15.pos
            byte[] r6 = r11.lineSeparator
            int r6 = r6.length
            java.lang.System.arraycopy(r13, r0, r3, r5, r6)
            int r13 = r15.pos
            byte[] r3 = r11.lineSeparator
            int r3 = r3.length
            int r13 = r13 + r3
            r15.pos = r13
            r15.currentLinePos = r0
        L334:
            int r2 = r2 + 1
            r13 = r4
            goto L252
        L339:
            return
    }

    byte[] getLineSeparator() {
            r1 = this;
            byte[] r0 = r1.lineSeparator
            return r0
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte r3) {
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
}
