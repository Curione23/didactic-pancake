package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public class BinaryCodec implements org.apache.commons.codec.BinaryDecoder, org.apache.commons.codec.BinaryEncoder {
    private static final int[] BITS = null;
    private static final int BIT_0 = 1;
    private static final int BIT_1 = 2;
    private static final int BIT_2 = 4;
    private static final int BIT_3 = 8;
    private static final int BIT_4 = 16;
    private static final int BIT_5 = 32;
    private static final int BIT_6 = 64;
    private static final int BIT_7 = 128;
    private static final byte[] EMPTY_BYTE_ARRAY = null;
    private static final char[] EMPTY_CHAR_ARRAY = null;

    static {
            r0 = 0
            char[] r1 = new char[r0]
            org.apache.commons.codec.binary.BinaryCodec.EMPTY_CHAR_ARRAY = r1
            byte[] r0 = new byte[r0]
            org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY = r0
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [1, 2, 4, 8, 16, 32, 64, 128} // fill-array
            org.apache.commons.codec.binary.BinaryCodec.BITS = r0
            return
    }

    public BinaryCodec() {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] fromAscii(byte[] r9) {
            boolean r0 = isEmpty(r9)
            if (r0 == 0) goto L9
            byte[] r9 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY
            return r9
        L9:
            int r0 = r9.length
            int r1 = r0 >> 3
            byte[] r2 = new byte[r1]
            int r0 = r0 + (-1)
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r1) goto L32
            r5 = r3
        L15:
            int[] r6 = org.apache.commons.codec.binary.BinaryCodec.BITS
            int r7 = r6.length
            if (r5 >= r7) goto L2d
            int r7 = r0 - r5
            r7 = r9[r7]
            r8 = 49
            if (r7 != r8) goto L2a
            r7 = r2[r4]
            r6 = r6[r5]
            r6 = r6 | r7
            byte r6 = (byte) r6
            r2[r4] = r6
        L2a:
            int r5 = r5 + 1
            goto L15
        L2d:
            int r4 = r4 + 1
            int r0 = r0 + (-8)
            goto L12
        L32:
            return r2
    }

    public static byte[] fromAscii(char[] r9) {
            if (r9 == 0) goto L30
            int r0 = r9.length
            if (r0 != 0) goto L6
            goto L30
        L6:
            int r0 = r9.length
            int r1 = r0 >> 3
            byte[] r2 = new byte[r1]
            int r0 = r0 + (-1)
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r1) goto L2f
            r5 = r3
        L12:
            int[] r6 = org.apache.commons.codec.binary.BinaryCodec.BITS
            int r7 = r6.length
            if (r5 >= r7) goto L2a
            int r7 = r0 - r5
            char r7 = r9[r7]
            r8 = 49
            if (r7 != r8) goto L27
            r7 = r2[r4]
            r6 = r6[r5]
            r6 = r6 | r7
            byte r6 = (byte) r6
            r2[r4] = r6
        L27:
            int r5 = r5 + 1
            goto L12
        L2a:
            int r4 = r4 + 1
            int r0 = r0 + (-8)
            goto Lf
        L2f:
            return r2
        L30:
            byte[] r9 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY
            return r9
    }

    static boolean isEmpty(byte[] r0) {
            if (r0 == 0) goto L8
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto L8
        L6:
            r0 = 0
            goto L9
        L8:
            r0 = 1
        L9:
            return r0
    }

    public static byte[] toAsciiBytes(byte[] r8) {
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto L9
            byte[] r8 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY
            return r8
        L9:
            int r0 = r8.length
            int r1 = r0 << 3
            byte[] r2 = new byte[r1]
            int r1 = r1 + (-1)
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto L36
            r5 = r3
        L15:
            int[] r6 = org.apache.commons.codec.binary.BinaryCodec.BITS
            int r7 = r6.length
            if (r5 >= r7) goto L31
            r7 = r8[r4]
            r6 = r6[r5]
            r6 = r6 & r7
            if (r6 != 0) goto L28
            int r6 = r1 - r5
            r7 = 48
            r2[r6] = r7
            goto L2e
        L28:
            int r6 = r1 - r5
            r7 = 49
            r2[r6] = r7
        L2e:
            int r5 = r5 + 1
            goto L15
        L31:
            int r4 = r4 + 1
            int r1 = r1 + (-8)
            goto L12
        L36:
            return r2
    }

    public static char[] toAsciiChars(byte[] r8) {
            boolean r0 = isEmpty(r8)
            if (r0 == 0) goto L9
            char[] r8 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_CHAR_ARRAY
            return r8
        L9:
            int r0 = r8.length
            int r1 = r0 << 3
            char[] r2 = new char[r1]
            int r1 = r1 + (-1)
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r0) goto L36
            r5 = r3
        L15:
            int[] r6 = org.apache.commons.codec.binary.BinaryCodec.BITS
            int r7 = r6.length
            if (r5 >= r7) goto L31
            r7 = r8[r4]
            r6 = r6[r5]
            r6 = r6 & r7
            if (r6 != 0) goto L28
            int r6 = r1 - r5
            r7 = 48
            r2[r6] = r7
            goto L2e
        L28:
            int r6 = r1 - r5
            r7 = 49
            r2[r6] = r7
        L2e:
            int r5 = r5 + 1
            goto L15
        L31:
            int r4 = r4 + 1
            int r1 = r1 + (-8)
            goto L12
        L36:
            return r2
    }

    public static java.lang.String toAsciiString(byte[] r1) {
            java.lang.String r0 = new java.lang.String
            char[] r1 = toAsciiChars(r1)
            r0.<init>(r1)
            return r0
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object r2) throws org.apache.commons.codec.DecoderException {
            r1 = this;
            if (r2 != 0) goto L5
            byte[] r2 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY
            return r2
        L5:
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto L10
            byte[] r2 = (byte[]) r2
            byte[] r2 = fromAscii(r2)
            return r2
        L10:
            boolean r0 = r2 instanceof char[]
            if (r0 == 0) goto L1b
            char[] r2 = (char[]) r2
            byte[] r2 = fromAscii(r2)
            return r2
        L1b:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L2a
            java.lang.String r2 = (java.lang.String) r2
            char[] r2 = r2.toCharArray()
            byte[] r2 = fromAscii(r2)
            return r2
        L2a:
            org.apache.commons.codec.DecoderException r2 = new org.apache.commons.codec.DecoderException
            java.lang.String r0 = "argument not a byte array"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] r1) {
            r0 = this;
            byte[] r1 = fromAscii(r1)
            return r1
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r2 = (byte[]) r2
            char[] r2 = toAsciiChars(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "argument not a byte array"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] r1) {
            r0 = this;
            byte[] r1 = toAsciiBytes(r1)
            return r1
    }

    public byte[] toByteArray(java.lang.String r1) {
            r0 = this;
            if (r1 != 0) goto L5
            byte[] r1 = org.apache.commons.codec.binary.BinaryCodec.EMPTY_BYTE_ARRAY
            return r1
        L5:
            char[] r1 = r1.toCharArray()
            byte[] r1 = fromAscii(r1)
            return r1
    }
}
