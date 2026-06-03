package org.apache.commons.codec.binary;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BaseNCodec implements org.apache.commons.codec.BinaryEncoder, org.apache.commons.codec.BinaryDecoder {
    static final byte[] CHUNK_SEPARATOR = null;
    protected static final org.apache.commons.codec.CodecPolicy DECODING_POLICY_DEFAULT = null;
    private static final int DEFAULT_BUFFER_RESIZE_FACTOR = 2;
    private static final int DEFAULT_BUFFER_SIZE = 8192;
    static final int EOF = -1;
    protected static final int MASK_8BITS = 255;
    private static final int MAX_BUFFER_SIZE = 2147483639;
    public static final int MIME_CHUNK_SIZE = 76;
    protected static final byte PAD_DEFAULT = 61;
    public static final int PEM_CHUNK_SIZE = 64;

    @java.lang.Deprecated
    protected final byte PAD;
    private final int chunkSeparatorLength;
    private final org.apache.commons.codec.CodecPolicy decodingPolicy;
    private final int encodedBlockSize;
    protected final int lineLength;
    protected final byte pad;
    private final int unencodedBlockSize;

    public static abstract class AbstractBuilder<T, B extends org.apache.commons.codec.binary.BaseNCodec.AbstractBuilder<T, B>> implements java.util.function.Supplier<T> {
        private org.apache.commons.codec.CodecPolicy decodingPolicy;
        private final byte[] defaultEncodeTable;
        private byte[] encodeTable;
        private int lineLength;
        private byte[] lineSeparator;
        private byte padding;

        AbstractBuilder(byte[] r2) {
                r1 = this;
                r1.<init>()
                org.apache.commons.codec.CodecPolicy r0 = org.apache.commons.codec.binary.BaseNCodec.DECODING_POLICY_DEFAULT
                r1.decodingPolicy = r0
                byte[] r0 = org.apache.commons.codec.binary.BaseNCodec.CHUNK_SEPARATOR
                r1.lineSeparator = r0
                r0 = 61
                r1.padding = r0
                r1.defaultEncodeTable = r2
                r1.encodeTable = r2
                return
        }

        B asThis() {
                r0 = this;
                return r0
        }

        org.apache.commons.codec.CodecPolicy getDecodingPolicy() {
                r1 = this;
                org.apache.commons.codec.CodecPolicy r0 = r1.decodingPolicy
                return r0
        }

        byte[] getEncodeTable() {
                r1 = this;
                byte[] r0 = r1.encodeTable
                return r0
        }

        int getLineLength() {
                r1 = this;
                int r0 = r1.lineLength
                return r0
        }

        byte[] getLineSeparator() {
                r1 = this;
                byte[] r0 = r1.lineSeparator
                return r0
        }

        byte getPadding() {
                r1 = this;
                byte r0 = r1.padding
                return r0
        }

        public B setDecodingPolicy(org.apache.commons.codec.CodecPolicy r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L5
            L3:
                org.apache.commons.codec.CodecPolicy r1 = org.apache.commons.codec.binary.BaseNCodec.DECODING_POLICY_DEFAULT
            L5:
                r0.decodingPolicy = r1
                org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder r1 = r0.asThis()
                return r1
        }

        public B setEncodeTable(byte... r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L5
            L3:
                byte[] r1 = r0.defaultEncodeTable
            L5:
                r0.encodeTable = r1
                org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder r1 = r0.asThis()
                return r1
        }

        public B setLineLength(int r2) {
                r1 = this;
                r0 = 0
                int r2 = java.lang.Math.max(r0, r2)
                r1.lineLength = r2
                org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder r2 = r1.asThis()
                return r2
        }

        public B setLineSeparator(byte... r1) {
                r0 = this;
                if (r1 == 0) goto L3
                goto L5
            L3:
                byte[] r1 = org.apache.commons.codec.binary.BaseNCodec.CHUNK_SEPARATOR
            L5:
                r0.lineSeparator = r1
                org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder r1 = r0.asThis()
                return r1
        }

        public B setPadding(byte r1) {
                r0 = this;
                r0.padding = r1
                org.apache.commons.codec.binary.BaseNCodec$AbstractBuilder r1 = r0.asThis()
                return r1
        }
    }

    static class Context {
        byte[] buffer;
        int currentLinePos;
        boolean eof;
        int ibitWorkArea;
        long lbitWorkArea;
        int modulus;
        int pos;
        int readPos;

        Context() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String toString() {
                r10 = this;
                java.lang.Class r0 = r10.getClass()
                java.lang.String r1 = r0.getSimpleName()
                byte[] r0 = r10.buffer
                java.lang.String r2 = java.util.Arrays.toString(r0)
                int r0 = r10.currentLinePos
                java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
                boolean r0 = r10.eof
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
                int r0 = r10.ibitWorkArea
                java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
                long r6 = r10.lbitWorkArea
                java.lang.Long r6 = java.lang.Long.valueOf(r6)
                int r0 = r10.modulus
                java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                int r0 = r10.pos
                java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
                int r0 = r10.readPos
                java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3, r4, r5, r6, r7, r8, r9}
                java.lang.String r1 = "%s[buffer=%s, currentLinePos=%s, eof=%s, ibitWorkArea=%s, lbitWorkArea=%s, modulus=%s, pos=%s, readPos=%s]"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }
    }

    static {
            org.apache.commons.codec.CodecPolicy r0 = org.apache.commons.codec.CodecPolicy.LENIENT
            org.apache.commons.codec.binary.BaseNCodec.DECODING_POLICY_DEFAULT = r0
            r0 = 2
            byte[] r0 = new byte[r0]
            r0 = {x000e: FILL_ARRAY_DATA , data: [13, 10} // fill-array
            org.apache.commons.codec.binary.BaseNCodec.CHUNK_SEPARATOR = r0
            return
    }

    protected BaseNCodec(int r7, int r8, int r9, int r10) {
            r6 = this;
            r5 = 61
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected BaseNCodec(int r8, int r9, int r10, int r11, byte r12) {
            r7 = this;
            org.apache.commons.codec.CodecPolicy r6 = org.apache.commons.codec.binary.BaseNCodec.DECODING_POLICY_DEFAULT
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    protected BaseNCodec(int r2, int r3, int r4, int r5, byte r6, org.apache.commons.codec.CodecPolicy r7) {
            r1 = this;
            r1.<init>()
            r0 = 61
            r1.PAD = r0
            r1.unencodedBlockSize = r2
            r1.encodedBlockSize = r3
            if (r4 <= 0) goto L12
            if (r5 <= 0) goto L12
            int r4 = r4 / r3
            int r4 = r4 * r3
            goto L13
        L12:
            r4 = 0
        L13:
            r1.lineLength = r4
            r1.chunkSeparatorLength = r5
            r1.pad = r6
            java.lang.String r2 = "codecPolicy"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r7, r2)
            org.apache.commons.codec.CodecPolicy r2 = (org.apache.commons.codec.CodecPolicy) r2
            r1.decodingPolicy = r2
            return
    }

    private static int createPositiveCapacity(int r6) {
            if (r6 < 0) goto La
            r0 = 2147483639(0x7ffffff7, float:NaN)
            int r6 = java.lang.Math.max(r6, r0)
            return r6
        La:
            java.lang.OutOfMemoryError r0 = new java.lang.OutOfMemoryError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to allocate array size: "
            r1.<init>(r2)
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            java.lang.StringBuilder r6 = r1.append(r2)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    public static byte[] getChunkSeparator() {
            byte[] r0 = org.apache.commons.codec.binary.BaseNCodec.CHUNK_SEPARATOR
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    @java.lang.Deprecated
    protected static boolean isWhiteSpace(byte r0) {
            boolean r0 = java.lang.Character.isWhitespace(r0)
            return r0
    }

    private static byte[] resizeBuffer(org.apache.commons.codec.binary.BaseNCodec.Context r2, int r3) {
            byte[] r0 = r2.buffer
            int r0 = r0.length
            int r0 = r0 * 2
            int r1 = java.lang.Integer.compareUnsigned(r0, r3)
            if (r1 >= 0) goto Lc
            r0 = r3
        Lc:
            r1 = 2147483639(0x7ffffff7, float:NaN)
            int r1 = java.lang.Integer.compareUnsigned(r0, r1)
            if (r1 <= 0) goto L19
            int r0 = createPositiveCapacity(r3)
        L19:
            byte[] r3 = r2.buffer
            byte[] r3 = java.util.Arrays.copyOf(r3, r0)
            r2.buffer = r3
            return r3
    }

    static int toLength(byte[] r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L5
        L4:
            int r0 = r0.length
        L5:
            return r0
    }

    int available(org.apache.commons.codec.binary.BaseNCodec.Context r2) {
            r1 = this;
            boolean r0 = r1.hasData(r2)
            if (r0 == 0) goto Lc
            int r0 = r2.pos
            int r2 = r2.readPos
            int r0 = r0 - r2
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    protected boolean containsAlphabetOrPad(byte[] r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L19
            int r1 = r6.length
            r2 = r0
        L5:
            if (r2 >= r1) goto L19
            r3 = r6[r2]
            byte r4 = r5.pad
            if (r4 == r3) goto L17
            boolean r3 = r5.isInAlphabet(r3)
            if (r3 == 0) goto L14
            goto L17
        L14:
            int r2 = r2 + 1
            goto L5
        L17:
            r6 = 1
            return r6
        L19:
            return r0
    }

    @Override // org.apache.commons.codec.Decoder
    public java.lang.Object decode(java.lang.Object r2) throws org.apache.commons.codec.DecoderException {
            r1 = this;
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r2 = (byte[]) r2
            byte[] r2 = r1.decode(r2)
            return r2
        Lb:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L16
            java.lang.String r2 = (java.lang.String) r2
            byte[] r2 = r1.decode(r2)
            return r2
        L16:
            org.apache.commons.codec.DecoderException r2 = new org.apache.commons.codec.DecoderException
            java.lang.String r0 = "Parameter supplied to Base-N decode is not a byte[] or a String"
            r2.<init>(r0)
            throw r2
    }

    abstract void decode(byte[] r1, int r2, int r3, org.apache.commons.codec.binary.BaseNCodec.Context r4);

    public byte[] decode(java.lang.String r1) {
            r0 = this;
            byte[] r1 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r1)
            byte[] r1 = r0.decode(r1)
            return r1
    }

    @Override // org.apache.commons.codec.BinaryDecoder
    public byte[] decode(byte[] r4) {
            r3 = this;
            boolean r0 = org.apache.commons.codec.binary.BinaryCodec.isEmpty(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            org.apache.commons.codec.binary.BaseNCodec$Context r0 = new org.apache.commons.codec.binary.BaseNCodec$Context
            r0.<init>()
            int r1 = r4.length
            r2 = 0
            r3.decode(r4, r2, r1, r0)
            r1 = -1
            r3.decode(r4, r2, r1, r0)
            int r4 = r0.pos
            byte[] r1 = new byte[r4]
            r3.readResults(r1, r2, r4, r0)
            return r1
    }

    @Override // org.apache.commons.codec.Encoder
    public java.lang.Object encode(java.lang.Object r2) throws org.apache.commons.codec.EncoderException {
            r1 = this;
            boolean r0 = r2 instanceof byte[]
            if (r0 == 0) goto Lb
            byte[] r2 = (byte[]) r2
            byte[] r2 = r1.encode(r2)
            return r2
        Lb:
            org.apache.commons.codec.EncoderException r2 = new org.apache.commons.codec.EncoderException
            java.lang.String r0 = "Parameter supplied to Base-N encode is not a byte[]"
            r2.<init>(r0)
            throw r2
    }

    abstract void encode(byte[] r1, int r2, int r3, org.apache.commons.codec.binary.BaseNCodec.Context r4);

    @Override // org.apache.commons.codec.BinaryEncoder
    public byte[] encode(byte[] r3) {
            r2 = this;
            boolean r0 = org.apache.commons.codec.binary.BinaryCodec.isEmpty(r3)
            if (r0 == 0) goto L7
            return r3
        L7:
            r0 = 0
            int r1 = r3.length
            byte[] r3 = r2.encode(r3, r0, r1)
            return r3
    }

    public byte[] encode(byte[] r2, int r3, int r4) {
            r1 = this;
            boolean r0 = org.apache.commons.codec.binary.BinaryCodec.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            org.apache.commons.codec.binary.BaseNCodec$Context r0 = new org.apache.commons.codec.binary.BaseNCodec$Context
            r0.<init>()
            r1.encode(r2, r3, r4, r0)
            r4 = -1
            r1.encode(r2, r3, r4, r0)
            int r2 = r0.pos
            int r3 = r0.readPos
            int r2 = r2 - r3
            byte[] r3 = new byte[r2]
            r4 = 0
            r1.readResults(r3, r4, r2, r0)
            return r3
    }

    public java.lang.String encodeAsString(byte[] r1) {
            r0 = this;
            byte[] r1 = r0.encode(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r1)
            return r1
    }

    public java.lang.String encodeToString(byte[] r1) {
            r0 = this;
            byte[] r1 = r0.encode(r1)
            java.lang.String r1 = org.apache.commons.codec.binary.StringUtils.newStringUtf8(r1)
            return r1
    }

    protected byte[] ensureBufferSize(int r3, org.apache.commons.codec.binary.BaseNCodec.Context r4) {
            r2 = this;
            byte[] r0 = r4.buffer
            if (r0 != 0) goto L16
            int r0 = r2.getDefaultBufferSize()
            int r3 = java.lang.Math.max(r3, r0)
            byte[] r3 = new byte[r3]
            r4.buffer = r3
            r3 = 0
            r4.pos = r3
            r4.readPos = r3
            goto L27
        L16:
            int r0 = r4.pos
            int r0 = r0 + r3
            byte[] r1 = r4.buffer
            int r1 = r1.length
            int r0 = r0 - r1
            if (r0 <= 0) goto L27
            int r0 = r4.pos
            int r0 = r0 + r3
            byte[] r3 = resizeBuffer(r4, r0)
            return r3
        L27:
            byte[] r3 = r4.buffer
            return r3
    }

    public org.apache.commons.codec.CodecPolicy getCodecPolicy() {
            r1 = this;
            org.apache.commons.codec.CodecPolicy r0 = r1.decodingPolicy
            return r0
    }

    protected int getDefaultBufferSize() {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            return r0
    }

    public long getEncodedLength(byte[] r7) {
            r6 = this;
            int r7 = r7.length
            int r0 = r6.unencodedBlockSize
            int r7 = r7 + r0
            int r7 = r7 + (-1)
            int r7 = r7 / r0
            long r0 = (long) r7
            int r7 = r6.encodedBlockSize
            long r2 = (long) r7
            long r0 = r0 * r2
            int r7 = r6.lineLength
            if (r7 <= 0) goto L1c
            long r2 = (long) r7
            long r2 = r2 + r0
            r4 = 1
            long r2 = r2 - r4
            long r4 = (long) r7
            long r2 = r2 / r4
            int r7 = r6.chunkSeparatorLength
            long r4 = (long) r7
            long r2 = r2 * r4
            long r0 = r0 + r2
        L1c:
            return r0
    }

    boolean hasData(org.apache.commons.codec.binary.BaseNCodec.Context r2) {
            r1 = this;
            int r0 = r2.pos
            int r2 = r2.readPos
            if (r0 <= r2) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }

    protected abstract boolean isInAlphabet(byte r1);

    public boolean isInAlphabet(java.lang.String r2) {
            r1 = this;
            byte[] r2 = org.apache.commons.codec.binary.StringUtils.getBytesUtf8(r2)
            r0 = 1
            boolean r2 = r1.isInAlphabet(r2, r0)
            return r2
    }

    public boolean isInAlphabet(byte[] r6, boolean r7) {
            r5 = this;
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L1d
            r3 = r6[r2]
            boolean r4 = r5.isInAlphabet(r3)
            if (r4 != 0) goto L1a
            if (r7 == 0) goto L19
            byte r4 = r5.pad
            if (r3 == r4) goto L1a
            boolean r3 = java.lang.Character.isWhitespace(r3)
            if (r3 != 0) goto L1a
        L19:
            return r1
        L1a:
            int r2 = r2 + 1
            goto L3
        L1d:
            r6 = 1
            return r6
    }

    public boolean isStrictDecoding() {
            r2 = this;
            org.apache.commons.codec.CodecPolicy r0 = r2.decodingPolicy
            org.apache.commons.codec.CodecPolicy r1 = org.apache.commons.codec.CodecPolicy.STRICT
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    int readResults(byte[] r4, int r5, int r6, org.apache.commons.codec.binary.BaseNCodec.Context r7) {
            r3 = this;
            boolean r0 = r3.hasData(r7)
            r1 = 0
            if (r0 == 0) goto L26
            int r0 = r3.available(r7)
            int r6 = java.lang.Math.min(r0, r6)
            byte[] r0 = r7.buffer
            int r2 = r7.readPos
            java.lang.System.arraycopy(r0, r2, r4, r5, r6)
            int r4 = r7.readPos
            int r4 = r4 + r6
            r7.readPos = r4
            boolean r4 = r3.hasData(r7)
            if (r4 != 0) goto L25
            r7.readPos = r1
            r7.pos = r1
        L25:
            return r6
        L26:
            boolean r4 = r7.eof
            if (r4 == 0) goto L2b
            r1 = -1
        L2b:
            return r1
    }
}
