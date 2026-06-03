package org.apache.commons.codec.net;

/* JADX INFO: loaded from: classes2.dex */
public class PercentCodec implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder {
    private static final byte ESCAPE_CHAR = 37;
    private final java.util.BitSet alwaysEncodeChars;
    private int alwaysEncodeCharsMax;
    private int alwaysEncodeCharsMin;
    private final boolean plusForSpace;

    public PercentCodec() {
            r1 = this;
            r1.<init>()
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1.alwaysEncodeChars = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.alwaysEncodeCharsMin = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.alwaysEncodeCharsMax = r0
            r0 = 0
            r1.plusForSpace = r0
            r0 = 37
            r1.insertAlwaysEncodeChar(r0)
            return
    }

    public PercentCodec(byte[] r2, boolean r3) {
            r1 = this;
            r1.<init>()
            java.util.BitSet r0 = new java.util.BitSet
            r0.<init>()
            r1.alwaysEncodeChars = r0
            r0 = 2147483647(0x7fffffff, float:NaN)
            r1.alwaysEncodeCharsMin = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.alwaysEncodeCharsMax = r0
            r1.plusForSpace = r3
            r1.insertAlwaysEncodeChars(r2)
            return
    }

    private boolean canEncode(byte r2) {
            r1 = this;
            boolean r0 = r1.isAsciiChar(r2)
            if (r0 == 0) goto L17
            boolean r0 = r1.inAlwaysEncodeCharsRange(r2)
            if (r0 == 0) goto L15
            java.util.BitSet r0 = r1.alwaysEncodeChars
            boolean r2 = r0.get(r2)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    private boolean containsSpace(byte[] r6) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L10
            r3 = r6[r2]
            r4 = 32
            if (r3 != r4) goto Ld
            r6 = 1
            return r6
        Ld:
            int r2 = r2 + 1
            goto L3
        L10:
            return r1
    }

    private byte[] doEncode(byte[] r6, int r7, boolean r8) {
            r5 = this;
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r7)
            int r0 = r6.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L43
            r2 = r6[r1]
            if (r8 == 0) goto L2f
            boolean r3 = r5.canEncode(r2)
            if (r3 == 0) goto L2f
            if (r2 >= 0) goto L17
            int r2 = r2 + 256
            byte r2 = (byte) r2
        L17:
            int r3 = r2 >> 4
            char r3 = org.apache.commons.codec.net.Utils.hexDigit(r3)
            char r2 = org.apache.commons.codec.net.Utils.hexDigit(r2)
            r4 = 37
            r7.put(r4)
            byte r3 = (byte) r3
            r7.put(r3)
            byte r2 = (byte) r2
            r7.put(r2)
            goto L40
        L2f:
            boolean r3 = r5.plusForSpace
            if (r3 == 0) goto L3d
            r3 = 32
            if (r2 != r3) goto L3d
            r2 = 43
            r7.put(r2)
            goto L40
        L3d:
            r7.put(r2)
        L40:
            int r1 = r1 + 1
            goto L6
        L43:
            byte[] r6 = r7.array()
            return r6
    }

    private int expectedDecodingBytes(byte[] r5) {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.length
            if (r0 >= r2) goto L12
            r2 = r5[r0]
            r3 = 37
            if (r2 != r3) goto Ld
            r2 = 3
            goto Le
        Ld:
            r2 = 1
        Le:
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L12:
            return r1
    }

    private int expectedEncodingBytes(byte[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
            r2 = r1
        L3:
            if (r1 >= r0) goto L14
            r3 = r5[r1]
            boolean r3 = r4.canEncode(r3)
            if (r3 == 0) goto Lf
            r3 = 3
            goto L10
        Lf:
            r3 = 1
        L10:
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L3
        L14:
            return r2
    }

    private boolean inAlwaysEncodeCharsRange(byte r2) {
            r1 = this;
            int r0 = r1.alwaysEncodeCharsMin
            if (r2 < r0) goto La
            int r0 = r1.alwaysEncodeCharsMax
            if (r2 > r0) goto La
            r2 = 1
            goto Lb
        La:
            r2 = 0
        Lb:
            return r2
    }

    private void insertAlwaysEncodeChar(byte r2) {
            r1 = this;
            if (r2 < 0) goto L14
            java.util.BitSet r0 = r1.alwaysEncodeChars
            r0.set(r2)
            int r0 = r1.alwaysEncodeCharsMin
            if (r2 >= r0) goto Ld
            r1.alwaysEncodeCharsMin = r2
        Ld:
            int r0 = r1.alwaysEncodeCharsMax
            if (r2 <= r0) goto L13
            r1.alwaysEncodeCharsMax = r2
        L13:
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "byte must be >= 0"
            r2.<init>(r0)
            throw r2
    }

    private void insertAlwaysEncodeChars(byte[] r4) {
            r3 = this;
            if (r4 == 0) goto Le
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto Le
            r2 = r4[r1]
            r3.insertAlwaysEncodeChar(r2)
            int r1 = r1 + 1
            goto L4
        Le:
            r4 = 37
            r3.insertAlwaysEncodeChar(r4)
            return
    }

    private boolean isAsciiChar(byte r1) {
            r0 = this;
            if (r1 < 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
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
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Objects of type "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " cannot be Percent decoded"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] r5) throws org.apache.commons.codec.DecoderException {
            r4 = this;
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            int r0 = r4.expectedDecodingBytes(r5)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            r1 = 0
        Ld:
            int r2 = r5.length
            if (r1 >= r2) goto L4b
            r2 = r5[r1]
            r3 = 37
            if (r2 != r3) goto L37
            int r2 = r1 + 1
            r2 = r5[r2]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2e
            int r2 = org.apache.commons.codec.net.Utils.digit16(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2e
            int r1 = r1 + 2
            r3 = r5[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2e
            int r3 = org.apache.commons.codec.net.Utils.digit16(r3)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2e
            int r2 = r2 << 4
            int r2 = r2 + r3
            byte r2 = (byte) r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2e
            r0.put(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L2e
            goto L48
        L2e:
            r5 = move-exception
            org.apache.commons.codec.DecoderException r0 = new org.apache.commons.codec.DecoderException
            java.lang.String r1 = "Invalid percent decoding: "
            r0.<init>(r1, r5)
            throw r0
        L37:
            boolean r3 = r4.plusForSpace
            if (r3 == 0) goto L45
            r3 = 43
            if (r2 != r3) goto L45
            r2 = 32
            r0.put(r2)
            goto L48
        L45:
            r0.put(r2)
        L48:
            int r1 = r1 + 1
            goto Ld
        L4b:
            byte[] r5 = r0.array()
            return r5
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
            org.apache.commons.codec.EncoderException r0 = new org.apache.commons.codec.EncoderException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Objects of type "
            r1.<init>(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " cannot be Percent encoded"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] r4) throws org.apache.commons.codec.EncoderException {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            int r0 = r3.expectedEncodingBytes(r4)
            int r1 = r4.length
            if (r0 == r1) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L1c
            boolean r2 = r3.plusForSpace
            if (r2 == 0) goto L1b
            boolean r2 = r3.containsSpace(r4)
            if (r2 == 0) goto L1b
            goto L1c
        L1b:
            return r4
        L1c:
            byte[] r4 = r3.doEncode(r4, r0, r1)
            return r4
    }
}
