package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class Base16 extends org.apache.commons.codec.binary.BaseNCodec {
    private static final int BITS_PER_ENCODED_BYTE = 4;
    private static final int BYTES_PER_ENCODED_BLOCK = 2;
    private static final int BYTES_PER_UNENCODED_BLOCK = 1;
    private static final byte[] LOWER_CASE_DECODE_TABLE = null;
    private static final byte[] LOWER_CASE_ENCODE_TABLE = null;
    private static final int MASK_4BITS = 15;
    private static final byte[] UPPER_CASE_DECODE_TABLE = null;
    private static final byte[] UPPER_CASE_ENCODE_TABLE = null;
    private final byte[] decodeTable;
    private final byte[] encodeTable;

    static {
            r0 = 71
            byte[] r0 = new byte[r0]
            r0 = {x0026: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15} // fill-array
            org.apache.commons.codec.binary.Base16.UPPER_CASE_DECODE_TABLE = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x004e: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70} // fill-array
            org.apache.commons.codec.binary.Base16.UPPER_CASE_ENCODE_TABLE = r0
            r0 = 103(0x67, float:1.44E-43)
            byte[] r0 = new byte[r0]
            r0 = {x005a: FILL_ARRAY_DATA , data: [-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15} // fill-array
            org.apache.commons.codec.binary.Base16.LOWER_CASE_DECODE_TABLE = r0
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0092: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            org.apache.commons.codec.binary.Base16.LOWER_CASE_ENCODE_TABLE = r0
            return
    }

    public Base16() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public Base16(boolean r2) {
            r1 = this;
            org.apache.commons.codec.CodecPolicy r0 = org.apache.commons.codec.binary.Base16.DECODING_POLICY_DEFAULT
            r1.<init>(r2, r0)
            return
    }

    public Base16(boolean r2, org.apache.commons.codec.CodecPolicy r3) {
            r1 = this;
            if (r2 == 0) goto L5
            byte[] r0 = org.apache.commons.codec.binary.Base16.LOWER_CASE_ENCODE_TABLE
            goto L7
        L5:
            byte[] r0 = org.apache.commons.codec.binary.Base16.UPPER_CASE_ENCODE_TABLE
        L7:
            r1.<init>(r2, r0, r3)
            return
    }

    private Base16(boolean r8, byte[] r9, org.apache.commons.codec.CodecPolicy r10) {
            r7 = this;
            r4 = 0
            r5 = 61
            r1 = 1
            r2 = 2
            r3 = 0
            r0 = r7
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.lang.String r8 = "encodeTable"
            java.util.Objects.requireNonNull(r9, r8)
            r7.encodeTable = r9
            byte[] r8 = org.apache.commons.codec.binary.Base16.LOWER_CASE_ENCODE_TABLE
            if (r9 != r8) goto L19
            byte[] r8 = org.apache.commons.codec.binary.Base16.LOWER_CASE_DECODE_TABLE
            goto L1b
        L19:
            byte[] r8 = org.apache.commons.codec.binary.Base16.UPPER_CASE_DECODE_TABLE
        L1b:
            r7.decodeTable = r8
            return
    }

    private int decodeOctet(byte r5) {
            r4 = this;
            r0 = r5 & 255(0xff, float:3.57E-43)
            byte[] r1 = r4.decodeTable
            int r2 = r1.length
            r3 = -1
            if (r0 >= r2) goto Lb
            r0 = r1[r5]
            goto Lc
        Lb:
            r0 = r3
        Lc:
            if (r0 == r3) goto Lf
            return r0
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid octet in encoded value: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    private void validateTrailingCharacter() {
            r2 = this;
            boolean r0 = r2.isStrictDecoding()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Strict decoding: Last encoded character is a valid base 16 alphabet character but not a possible encoding. Decoding requires at least two characters to create one byte."
            r0.<init>(r1)
            throw r0
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void decode(byte[] r7, int r8, int r9, org.apache.commons.codec.binary.BaseNCodec.Context r10) {
            r6 = this;
            boolean r0 = r10.eof
            r1 = 1
            if (r0 != 0) goto L7f
            if (r9 >= 0) goto L9
            goto L7f
        L9:
            int r0 = r7.length
            int r0 = r0 - r8
            int r9 = java.lang.Math.min(r0, r9)
            int r0 = r10.ibitWorkArea
            r2 = 0
            if (r0 == 0) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            int r0 = r0 + r9
            if (r0 != r1) goto L26
            if (r0 != r9) goto L26
            r7 = r7[r8]
            int r7 = r6.decodeOctet(r7)
            int r7 = r7 + r1
            r10.ibitWorkArea = r7
            return
        L26:
            int r3 = r0 % 2
            if (r3 != 0) goto L2c
            r3 = r0
            goto L2e
        L2c:
            int r3 = r0 + (-1)
        L2e:
            int r4 = r8 + r9
            int r3 = r3 / 2
            byte[] r3 = r6.ensureBufferSize(r3, r10)
            if (r9 >= r0) goto L52
            int r9 = r10.ibitWorkArea
            int r9 = r9 - r1
            int r9 = r9 << 4
            int r0 = r8 + 1
            r8 = r7[r8]
            int r8 = r6.decodeOctet(r8)
            r8 = r8 | r9
            int r9 = r10.pos
            int r5 = r9 + 1
            r10.pos = r5
            byte r8 = (byte) r8
            r3[r9] = r8
            r10.ibitWorkArea = r2
            r8 = r0
        L52:
            int r9 = r4 + (-1)
        L54:
            if (r8 >= r9) goto L73
            int r0 = r8 + 1
            r2 = r7[r8]
            int r2 = r6.decodeOctet(r2)
            int r2 = r2 << 4
            int r8 = r8 + 2
            r0 = r7[r0]
            int r0 = r6.decodeOctet(r0)
            r0 = r0 | r2
            int r2 = r10.pos
            int r5 = r2 + 1
            r10.pos = r5
            byte r0 = (byte) r0
            r3[r2] = r0
            goto L54
        L73:
            if (r8 >= r4) goto L7e
            r7 = r7[r8]
            int r7 = r6.decodeOctet(r7)
            int r7 = r7 + r1
            r10.ibitWorkArea = r7
        L7e:
            return
        L7f:
            r10.eof = r1
            int r7 = r10.ibitWorkArea
            if (r7 == 0) goto L88
            r6.validateTrailingCharacter()
        L88:
            return
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    void encode(byte[] r6, int r7, int r8, org.apache.commons.codec.binary.BaseNCodec.Context r9) {
            r5 = this;
            boolean r0 = r9.eof
            if (r0 == 0) goto L5
            return
        L5:
            if (r8 >= 0) goto Lb
            r6 = 1
            r9.eof = r6
            return
        Lb:
            int r0 = r8 * 2
            if (r0 < 0) goto L3a
            byte[] r0 = r5.ensureBufferSize(r0, r9)
            int r8 = r8 + r7
        L14:
            if (r7 >= r8) goto L39
            r1 = r6[r7]
            int r2 = r1 >> 4
            r2 = r2 & 15
            r1 = r1 & 15
            int r3 = r9.pos
            int r4 = r3 + 1
            r9.pos = r4
            byte[] r4 = r5.encodeTable
            r2 = r4[r2]
            r0[r3] = r2
            int r2 = r9.pos
            int r3 = r2 + 1
            r9.pos = r3
            byte[] r3 = r5.encodeTable
            r1 = r3[r1]
            r0[r2] = r1
            int r7 = r7 + 1
            goto L14
        L39:
            return
        L3a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Input length exceeds maximum size for encoded data: "
            r7.<init>(r9)
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
    }

    @Override // org.apache.commons.codec.binary.BaseNCodec
    public boolean isInAlphabet(byte r4) {
            r3 = this;
            r0 = r4 & 255(0xff, float:3.57E-43)
            byte[] r1 = r3.decodeTable
            int r2 = r1.length
            if (r0 >= r2) goto Le
            r4 = r1[r4]
            r0 = -1
            if (r4 == r0) goto Le
            r4 = 1
            goto Lf
        Le:
            r4 = 0
        Lf:
            return r4
    }
}
