package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class Utf8 {
    private static final long ASCII_MASK_LONG = -9187201950435737472L;
    static final int COMPLETE = 0;
    static final int MALFORMED = -1;
    static final int MAX_BYTES_PER_CHAR = 3;
    private static final int UNSAFE_COUNT_ASCII_THRESHOLD = 16;
    private static final com.google.crypto.tink.shaded.protobuf.Utf8.Processor processor = null;

    private static class DecodeUtil {
        private DecodeUtil() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ void access$1000(byte r0, byte r1, byte r2, byte r3, char[] r4, int r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                handleFourBytes(r0, r1, r2, r3, r4, r5)
                return
        }

        static /* synthetic */ boolean access$400(byte r0) {
                boolean r0 = isOneByte(r0)
                return r0
        }

        static /* synthetic */ void access$500(byte r0, char[] r1, int r2) {
                handleOneByte(r0, r1, r2)
                return
        }

        static /* synthetic */ boolean access$600(byte r0) {
                boolean r0 = isTwoBytes(r0)
                return r0
        }

        static /* synthetic */ void access$700(byte r0, byte r1, char[] r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                handleTwoBytes(r0, r1, r2, r3)
                return
        }

        static /* synthetic */ boolean access$800(byte r0) {
                boolean r0 = isThreeBytes(r0)
                return r0
        }

        static /* synthetic */ void access$900(byte r0, byte r1, byte r2, char[] r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                handleThreeBytes(r0, r1, r2, r3, r4)
                return
        }

        private static void handleFourBytes(byte r2, byte r3, byte r4, byte r5, char[] r6, int r7) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L41
                int r0 = r2 << 28
                int r1 = r3 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L41
                boolean r0 = isNotTrailingByte(r5)
                if (r0 != 0) goto L41
                r2 = r2 & 7
                int r2 = r2 << 18
                int r3 = trailingByteValue(r3)
                int r3 = r3 << 12
                r2 = r2 | r3
                int r3 = trailingByteValue(r4)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = trailingByteValue(r5)
                r2 = r2 | r3
                char r3 = highSurrogate(r2)
                r6[r7] = r3
                int r7 = r7 + 1
                char r2 = lowSurrogate(r2)
                r6[r7] = r2
                return
            L41:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
        }

        private static void handleOneByte(byte r0, char[] r1, int r2) {
                char r0 = (char) r0
                r1[r2] = r0
                return
        }

        private static void handleThreeBytes(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                boolean r0 = isNotTrailingByte(r3)
                if (r0 != 0) goto L2e
                r0 = -32
                r1 = -96
                if (r2 != r0) goto Le
                if (r3 < r1) goto L2e
            Le:
                r0 = -19
                if (r2 != r0) goto L14
                if (r3 >= r1) goto L2e
            L14:
                boolean r0 = isNotTrailingByte(r4)
                if (r0 != 0) goto L2e
                r2 = r2 & 15
                int r2 = r2 << 12
                int r3 = trailingByteValue(r3)
                int r3 = r3 << 6
                r2 = r2 | r3
                int r3 = trailingByteValue(r4)
                r2 = r2 | r3
                char r2 = (char) r2
                r5[r6] = r2
                return
            L2e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r2 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r2
        }

        private static void handleTwoBytes(byte r1, byte r2, char[] r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = -62
                if (r1 < r0) goto L17
                boolean r0 = isNotTrailingByte(r2)
                if (r0 != 0) goto L17
                r1 = r1 & 31
                int r1 = r1 << 6
                int r2 = trailingByteValue(r2)
                r1 = r1 | r2
                char r1 = (char) r1
                r3[r4] = r1
                return
            L17:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r1 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r1
        }

        private static char highSurrogate(int r1) {
                int r1 = r1 >>> 10
                r0 = 55232(0xd7c0, float:7.7397E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        private static boolean isNotTrailingByte(byte r1) {
                r0 = -65
                if (r1 <= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        private static boolean isOneByte(byte r0) {
                if (r0 < 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                return r0
        }

        private static boolean isThreeBytes(byte r1) {
                r0 = -16
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        private static boolean isTwoBytes(byte r1) {
                r0 = -32
                if (r1 >= r0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                return r1
        }

        private static char lowSurrogate(int r1) {
                r1 = r1 & 1023(0x3ff, float:1.434E-42)
                r0 = 56320(0xdc00, float:7.8921E-41)
                int r1 = r1 + r0
                char r1 = (char) r1
                return r1
        }

        private static int trailingByteValue(byte r0) {
                r0 = r0 & 63
                return r0
        }
    }

    static abstract class Processor {
        Processor() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partialIsValidUtf8(java.nio.ByteBuffer r7, int r8, int r9) {
                int r0 = com.google.crypto.tink.shaded.protobuf.Utf8.access$200(r7, r8, r9)
                int r8 = r8 + r0
            L5:
                if (r8 < r9) goto L9
                r7 = 0
                return r7
            L9:
                int r0 = r8 + 1
                byte r1 = r7.get(r8)
                if (r1 >= 0) goto L83
                r2 = -32
                r3 = -1
                r4 = -65
                if (r1 >= r2) goto L2a
                if (r0 < r9) goto L1b
                return r1
            L1b:
                r2 = -62
                if (r1 < r2) goto L29
                byte r0 = r7.get(r0)
                if (r0 <= r4) goto L26
                goto L29
            L26:
                int r8 = r8 + 2
                goto L5
            L29:
                return r3
            L2a:
                r5 = -16
                if (r1 >= r5) goto L57
                int r5 = r9 + (-1)
                if (r0 < r5) goto L38
                int r9 = r9 - r0
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$300(r7, r1, r0, r9)
                return r7
            L38:
                int r5 = r8 + 2
                byte r0 = r7.get(r0)
                if (r0 > r4) goto L56
                r6 = -96
                if (r1 != r2) goto L46
                if (r0 < r6) goto L56
            L46:
                r2 = -19
                if (r1 != r2) goto L4c
                if (r0 >= r6) goto L56
            L4c:
                byte r0 = r7.get(r5)
                if (r0 <= r4) goto L53
                goto L56
            L53:
                int r8 = r8 + 3
                goto L5
            L56:
                return r3
            L57:
                int r2 = r9 + (-2)
                if (r0 < r2) goto L61
                int r9 = r9 - r0
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$300(r7, r1, r0, r9)
                return r7
            L61:
                int r2 = r8 + 2
                byte r0 = r7.get(r0)
                if (r0 > r4) goto L82
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L82
                int r0 = r8 + 3
                byte r1 = r7.get(r2)
                if (r1 > r4) goto L82
                int r8 = r8 + 4
                byte r0 = r7.get(r0)
                if (r0 <= r4) goto L5
            L82:
                return r3
            L83:
                r8 = r0
                goto L5
        }

        final java.lang.String decodeUtf8(java.nio.ByteBuffer r2, int r3, int r4) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r1 = this;
                boolean r0 = r2.hasArray()
                if (r0 == 0) goto L14
                int r0 = r2.arrayOffset()
                byte[] r2 = r2.array()
                int r0 = r0 + r3
                java.lang.String r2 = r1.decodeUtf8(r2, r0, r4)
                return r2
            L14:
                boolean r0 = r2.isDirect()
                if (r0 == 0) goto L1f
                java.lang.String r2 = r1.decodeUtf8Direct(r2, r3, r4)
                return r2
            L1f:
                java.lang.String r2 = r1.decodeUtf8Default(r2, r3, r4)
                return r2
        }

        abstract java.lang.String decodeUtf8(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        final java.lang.String decodeUtf8Default(java.nio.ByteBuffer r10, int r11, int r12) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r9 = this;
                r0 = r11 | r12
                int r1 = r10.limit()
                int r1 = r1 - r11
                int r1 = r1 - r12
                r0 = r0 | r1
                if (r0 < 0) goto Lbd
                int r0 = r11 + r12
                char[] r12 = new char[r12]
                r7 = 0
                r1 = r7
            L11:
                if (r11 >= r0) goto L27
                byte r2 = r10.get(r11)
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r3 != 0) goto L1e
                goto L27
            L1e:
                int r11 = r11 + 1
                int r3 = r1 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r12, r1)
                r1 = r3
                goto L11
            L27:
                r8 = r1
            L28:
                if (r11 >= r0) goto Lb7
                int r1 = r11 + 1
                byte r2 = r10.get(r11)
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r3 == 0) goto L54
                int r11 = r8 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r12, r8)
            L3b:
                if (r1 >= r0) goto L51
                byte r2 = r10.get(r1)
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r3 != 0) goto L48
                goto L51
            L48:
                int r1 = r1 + 1
                int r3 = r11 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r12, r11)
                r11 = r3
                goto L3b
            L51:
                r8 = r11
                r11 = r1
                goto L28
            L54:
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$600(r2)
                if (r3 == 0) goto L6e
                if (r1 >= r0) goto L69
                int r11 = r11 + 2
                byte r1 = r10.get(r1)
                int r3 = r8 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$700(r2, r1, r12, r8)
                r8 = r3
                goto L28
            L69:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r10
            L6e:
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$800(r2)
                if (r3 == 0) goto L90
                int r3 = r0 + (-1)
                if (r1 >= r3) goto L8b
                int r3 = r11 + 2
                byte r1 = r10.get(r1)
                int r11 = r11 + 3
                byte r3 = r10.get(r3)
                int r4 = r8 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$900(r2, r1, r3, r12, r8)
                r8 = r4
                goto L28
            L8b:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r10
            L90:
                int r3 = r0 + (-2)
                if (r1 >= r3) goto Lb2
                int r3 = r11 + 2
                byte r4 = r10.get(r1)
                int r1 = r11 + 3
                byte r3 = r10.get(r3)
                int r11 = r11 + 4
                byte r5 = r10.get(r1)
                r1 = r2
                r2 = r4
                r4 = r5
                r5 = r12
                r6 = r8
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$1000(r1, r2, r3, r4, r5, r6)
                int r8 = r8 + 2
                goto L28
            Lb2:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r10
            Lb7:
                java.lang.String r10 = new java.lang.String
                r10.<init>(r12, r7, r8)
                return r10
            Lbd:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r10 = r10.limit()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r12}
                java.lang.String r11 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                r0.<init>(r10)
                throw r0
        }

        abstract java.lang.String decodeUtf8Direct(java.nio.ByteBuffer r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;

        abstract int encodeUtf8(java.lang.CharSequence r1, byte[] r2, int r3, int r4);

        final void encodeUtf8(java.lang.CharSequence r5, java.nio.ByteBuffer r6) {
                r4 = this;
                boolean r0 = r6.hasArray()
                if (r0 == 0) goto L20
                int r0 = r6.arrayOffset()
                byte[] r1 = r6.array()
                int r2 = r6.position()
                int r2 = r2 + r0
                int r3 = r6.remaining()
                int r5 = com.google.crypto.tink.shaded.protobuf.Utf8.encode(r5, r1, r2, r3)
                int r5 = r5 - r0
                r6.position(r5)
                goto L2d
            L20:
                boolean r0 = r6.isDirect()
                if (r0 == 0) goto L2a
                r4.encodeUtf8Direct(r5, r6)
                goto L2d
            L2a:
                r4.encodeUtf8Default(r5, r6)
            L2d:
                return
        }

        final void encodeUtf8Default(java.lang.CharSequence r9, java.nio.ByteBuffer r10) {
                r8 = this;
                int r0 = r9.length()
                int r1 = r10.position()
                r2 = 0
            L9:
                r3 = 128(0x80, float:1.8E-43)
                if (r2 >= r0) goto L1c
                char r4 = r9.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                if (r4 >= r3) goto L1c
                int r3 = r1 + r2
                byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                r10.put(r3, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                int r2 = r2 + 1
                goto L9
            L1c:
                if (r2 != r0) goto L24
                int r0 = r1 + r2
                r10.position(r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                return
            L24:
                int r1 = r1 + r2
            L25:
                if (r2 >= r0) goto Lc5
                char r4 = r9.charAt(r2)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                if (r4 >= r3) goto L33
                byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                r10.put(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                goto Lbf
            L33:
                r5 = 2048(0x800, float:2.87E-42)
                if (r4 >= r5) goto L4e
                int r5 = r1 + 1
                int r6 = r4 >>> 6
                r6 = r6 | 192(0xc0, float:2.69E-43)
                byte r6 = (byte) r6
                r10.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
                r1 = r4 & 63
                r1 = r1 | r3
                byte r1 = (byte) r1     // Catch: java.lang.IndexOutOfBoundsException -> L4b
                r10.put(r5, r1)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
                r1 = r5
                goto Lbf
            L4b:
                r1 = r5
                goto Lc9
            L4e:
                r5 = 55296(0xd800, float:7.7486E-41)
                if (r4 < r5) goto La3
                r5 = 57343(0xdfff, float:8.0355E-41)
                if (r5 >= r4) goto L59
                goto La3
            L59:
                int r5 = r2 + 1
                if (r5 == r0) goto L9d
                char r2 = r9.charAt(r5)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
                boolean r6 = java.lang.Character.isSurrogatePair(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
                if (r6 == 0) goto L99
                int r2 = java.lang.Character.toCodePoint(r4, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
                int r4 = r1 + 1
                int r6 = r2 >>> 18
                r6 = r6 | 240(0xf0, float:3.36E-43)
                byte r6 = (byte) r6
                r10.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L97
                int r6 = r1 + 2
                int r7 = r2 >>> 12
                r7 = r7 & 63
                r7 = r7 | r3
                byte r7 = (byte) r7
                r10.put(r4, r7)     // Catch: java.lang.IndexOutOfBoundsException -> L94
                int r1 = r1 + 3
                int r4 = r2 >>> 6
                r4 = r4 & 63
                r4 = r4 | r3
                byte r4 = (byte) r4
                r10.put(r6, r4)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
                r2 = r2 & 63
                r2 = r2 | r3
                byte r2 = (byte) r2     // Catch: java.lang.IndexOutOfBoundsException -> L9b
                r10.put(r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L9b
                r2 = r5
                goto Lbf
            L94:
                r2 = r5
                r1 = r6
                goto Lc9
            L97:
                r1 = r4
                goto L9b
            L99:
                r2 = r5
                goto L9d
            L9b:
                r2 = r5
                goto Lc9
            L9d:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r3 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                r3.<init>(r2, r0)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                throw r3     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            La3:
                int r5 = r1 + 1
                int r6 = r4 >>> 12
                r6 = r6 | 224(0xe0, float:3.14E-43)
                byte r6 = (byte) r6
                r10.put(r1, r6)     // Catch: java.lang.IndexOutOfBoundsException -> L4b
                int r1 = r1 + 2
                int r6 = r4 >>> 6
                r6 = r6 & 63
                r6 = r6 | r3
                byte r6 = (byte) r6
                r10.put(r5, r6)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                r4 = r4 & 63
                r4 = r4 | r3
                byte r4 = (byte) r4     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                r10.put(r1, r4)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
            Lbf:
                int r2 = r2 + 1
                int r1 = r1 + 1
                goto L25
            Lc5:
                r10.position(r1)     // Catch: java.lang.IndexOutOfBoundsException -> Lc9
                return
            Lc9:
                int r0 = r10.position()
                int r10 = r10.position()
                int r1 = r1 - r10
                int r1 = r1 + 1
                int r10 = java.lang.Math.max(r2, r1)
                int r0 = r0 + r10
                java.lang.ArrayIndexOutOfBoundsException r10 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r3 = "Failed writing "
                r1.<init>(r3)
                char r9 = r9.charAt(r2)
                java.lang.StringBuilder r9 = r1.append(r9)
                java.lang.String r1 = " at index "
                java.lang.StringBuilder r9 = r9.append(r1)
                java.lang.StringBuilder r9 = r9.append(r0)
                java.lang.String r9 = r9.toString()
                r10.<init>(r9)
                throw r10
        }

        abstract void encodeUtf8Direct(java.lang.CharSequence r1, java.nio.ByteBuffer r2);

        final boolean isValidUtf8(java.nio.ByteBuffer r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                int r2 = r1.partialIsValidUtf8(r0, r2, r3, r4)
                if (r2 != 0) goto L8
                r0 = 1
            L8:
                return r0
        }

        final boolean isValidUtf8(byte[] r2, int r3, int r4) {
                r1 = this;
                r0 = 0
                int r2 = r1.partialIsValidUtf8(r0, r2, r3, r4)
                if (r2 != 0) goto L8
                r0 = 1
            L8:
                return r0
        }

        final int partialIsValidUtf8(int r2, java.nio.ByteBuffer r3, int r4, int r5) {
                r1 = this;
                boolean r0 = r3.hasArray()
                if (r0 == 0) goto L15
                int r0 = r3.arrayOffset()
                byte[] r3 = r3.array()
                int r4 = r4 + r0
                int r0 = r0 + r5
                int r2 = r1.partialIsValidUtf8(r2, r3, r4, r0)
                return r2
            L15:
                boolean r0 = r3.isDirect()
                if (r0 == 0) goto L20
                int r2 = r1.partialIsValidUtf8Direct(r2, r3, r4, r5)
                return r2
            L20:
                int r2 = r1.partialIsValidUtf8Default(r2, r3, r4, r5)
                return r2
        }

        abstract int partialIsValidUtf8(int r1, byte[] r2, int r3, int r4);

        final int partialIsValidUtf8Default(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
                r6 = this;
                if (r7 == 0) goto L92
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1e
                r7 = -62
                if (r0 < r7) goto L1d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
                goto L1d
            L1a:
                r9 = r7
                goto L92
            L1d:
                return r2
            L1e:
                r4 = -16
                if (r0 >= r4) goto L4f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L38
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L35
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r9)
                return r7
            L35:
                r5 = r9
                r9 = r7
                r7 = r5
            L38:
                if (r7 > r3) goto L4e
                r4 = -96
                if (r0 != r1) goto L40
                if (r7 < r4) goto L4e
            L40:
                r1 = -19
                if (r0 != r1) goto L46
                if (r7 >= r4) goto L4e
            L46:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L1a
            L4e:
                return r2
            L4f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L64
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L62
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r7
            L62:
                r9 = 0
                goto L6a
            L64:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L6a:
                if (r9 != 0) goto L7c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L79
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L79:
                r5 = r9
                r9 = r7
                r7 = r5
            L7c:
                if (r1 > r3) goto L91
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L91
                if (r9 > r3) goto L91
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L92
            L91:
                return r2
            L92:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
        }

        abstract int partialIsValidUtf8Direct(int r1, java.nio.ByteBuffer r2, int r3, int r4);
    }

    static final class SafeProcessor extends com.google.crypto.tink.shaded.protobuf.Utf8.Processor {
        SafeProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        private static int partialIsValidUtf8(byte[] r1, int r2, int r3) {
            L0:
                if (r2 >= r3) goto L9
                r0 = r1[r2]
                if (r0 < 0) goto L9
                int r2 = r2 + 1
                goto L0
            L9:
                if (r2 < r3) goto Ld
                r1 = 0
                goto L11
            Ld:
                int r1 = partialIsValidUtf8NonAscii(r1, r2, r3)
            L11:
                return r1
        }

        private static int partialIsValidUtf8NonAscii(byte[] r7, int r8, int r9) {
            L0:
                if (r8 < r9) goto L4
                r7 = 0
                return r7
            L4:
                int r0 = r8 + 1
                r1 = r7[r8]
                if (r1 >= 0) goto L6a
                r2 = -32
                r3 = -1
                r4 = -65
                if (r1 >= r2) goto L1f
                if (r0 < r9) goto L14
                return r1
            L14:
                r2 = -62
                if (r1 < r2) goto L1e
                int r8 = r8 + 2
                r0 = r7[r0]
                if (r0 <= r4) goto L0
            L1e:
                return r3
            L1f:
                r5 = -16
                if (r1 >= r5) goto L45
                int r5 = r9 + (-1)
                if (r0 < r5) goto L2c
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1100(r7, r0, r9)
                return r7
            L2c:
                int r5 = r8 + 2
                r0 = r7[r0]
                if (r0 > r4) goto L44
                r6 = -96
                if (r1 != r2) goto L38
                if (r0 < r6) goto L44
            L38:
                r2 = -19
                if (r1 != r2) goto L3e
                if (r0 >= r6) goto L44
            L3e:
                int r8 = r8 + 3
                r0 = r7[r5]
                if (r0 <= r4) goto L0
            L44:
                return r3
            L45:
                int r2 = r9 + (-2)
                if (r0 < r2) goto L4e
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1100(r7, r0, r9)
                return r7
            L4e:
                int r2 = r8 + 2
                r0 = r7[r0]
                if (r0 > r4) goto L69
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L69
                int r0 = r8 + 3
                r1 = r7[r2]
                if (r1 > r4) goto L69
                int r8 = r8 + 4
                r0 = r7[r0]
                if (r0 <= r4) goto L0
            L69:
                return r3
            L6a:
                r8 = r0
                goto L0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] r10, int r11, int r12) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r9 = this;
                r0 = r11 | r12
                int r1 = r10.length
                int r1 = r1 - r11
                int r1 = r1 - r12
                r0 = r0 | r1
                if (r0 < 0) goto La7
                int r0 = r11 + r12
                char[] r12 = new char[r12]
                r7 = 0
                r1 = r7
            Le:
                if (r11 >= r0) goto L22
                r2 = r10[r11]
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r3 != 0) goto L19
                goto L22
            L19:
                int r11 = r11 + 1
                int r3 = r1 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r12, r1)
                r1 = r3
                goto Le
            L22:
                r8 = r1
            L23:
                if (r11 >= r0) goto La1
                int r1 = r11 + 1
                r2 = r10[r11]
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r3 == 0) goto L4b
                int r11 = r8 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r12, r8)
            L34:
                if (r1 >= r0) goto L48
                r2 = r10[r1]
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r2)
                if (r3 != 0) goto L3f
                goto L48
            L3f:
                int r1 = r1 + 1
                int r3 = r11 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r2, r12, r11)
                r11 = r3
                goto L34
            L48:
                r8 = r11
                r11 = r1
                goto L23
            L4b:
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$600(r2)
                if (r3 == 0) goto L63
                if (r1 >= r0) goto L5e
                int r11 = r11 + 2
                r1 = r10[r1]
                int r3 = r8 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$700(r2, r1, r12, r8)
                r8 = r3
                goto L23
            L5e:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r10
            L63:
                boolean r3 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$800(r2)
                if (r3 == 0) goto L81
                int r3 = r0 + (-1)
                if (r1 >= r3) goto L7c
                int r3 = r11 + 2
                r1 = r10[r1]
                int r11 = r11 + 3
                r3 = r10[r3]
                int r4 = r8 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$900(r2, r1, r3, r12, r8)
                r8 = r4
                goto L23
            L7c:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r10
            L81:
                int r3 = r0 + (-2)
                if (r1 >= r3) goto L9c
                int r3 = r11 + 2
                r4 = r10[r1]
                int r1 = r11 + 3
                r3 = r10[r3]
                int r11 = r11 + 4
                r5 = r10[r1]
                r1 = r2
                r2 = r4
                r4 = r5
                r5 = r12
                r6 = r8
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$1000(r1, r2, r3, r4, r5, r6)
                int r8 = r8 + 2
                goto L23
            L9c:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r10 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r10
            La1:
                java.lang.String r10 = new java.lang.String
                r10.<init>(r12, r7, r8)
                return r10
            La7:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                int r10 = r10.length
                java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Object[] r10 = new java.lang.Object[]{r10, r11, r12}
                java.lang.String r11 = "buffer length=%d, index=%d, size=%d"
                java.lang.String r10 = java.lang.String.format(r11, r10)
                r0.<init>(r10)
                throw r0
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r0 = this;
                java.lang.String r1 = r0.decodeUtf8Default(r1, r2, r3)
                return r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence r8, byte[] r9, int r10, int r11) {
                r7 = this;
                int r0 = r8.length()
                int r11 = r11 + r10
                r1 = 0
            L6:
                r2 = 128(0x80, float:1.8E-43)
                if (r1 >= r0) goto L1a
                int r3 = r1 + r10
                if (r3 >= r11) goto L1a
                char r4 = r8.charAt(r1)
                if (r4 >= r2) goto L1a
                byte r2 = (byte) r4
                r9[r3] = r2
                int r1 = r1 + 1
                goto L6
            L1a:
                if (r1 != r0) goto L1e
                int r10 = r10 + r0
                return r10
            L1e:
                int r10 = r10 + r1
            L1f:
                if (r1 >= r0) goto Lfd
                char r3 = r8.charAt(r1)
                if (r3 >= r2) goto L31
                if (r10 >= r11) goto L31
                int r4 = r10 + 1
                byte r3 = (byte) r3
                r9[r10] = r3
                r10 = r4
                goto Lb5
            L31:
                r4 = 2048(0x800, float:2.87E-42)
                if (r3 >= r4) goto L4b
                int r4 = r11 + (-2)
                if (r10 > r4) goto L4b
                int r4 = r10 + 1
                int r5 = r3 >>> 6
                r5 = r5 | 960(0x3c0, float:1.345E-42)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r10 = r10 + 2
                r3 = r3 & 63
                r3 = r3 | r2
                byte r3 = (byte) r3
                r9[r4] = r3
                goto Lb5
            L4b:
                r4 = 57343(0xdfff, float:8.0355E-41)
                r5 = 55296(0xd800, float:7.7486E-41)
                if (r3 < r5) goto L55
                if (r4 >= r3) goto L75
            L55:
                int r6 = r11 + (-3)
                if (r10 > r6) goto L75
                int r4 = r10 + 1
                int r5 = r3 >>> 12
                r5 = r5 | 480(0x1e0, float:6.73E-43)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r5 = r10 + 2
                int r6 = r3 >>> 6
                r6 = r6 & 63
                r6 = r6 | r2
                byte r6 = (byte) r6
                r9[r4] = r6
                int r10 = r10 + 3
                r3 = r3 & 63
                r3 = r3 | r2
                byte r3 = (byte) r3
                r9[r5] = r3
                goto Lb5
            L75:
                int r6 = r11 + (-4)
                if (r10 > r6) goto Lc2
                int r4 = r1 + 1
                int r5 = r8.length()
                if (r4 == r5) goto Lba
                char r1 = r8.charAt(r4)
                boolean r5 = java.lang.Character.isSurrogatePair(r3, r1)
                if (r5 == 0) goto Lb9
                int r1 = java.lang.Character.toCodePoint(r3, r1)
                int r3 = r10 + 1
                int r5 = r1 >>> 18
                r5 = r5 | 240(0xf0, float:3.36E-43)
                byte r5 = (byte) r5
                r9[r10] = r5
                int r5 = r10 + 2
                int r6 = r1 >>> 12
                r6 = r6 & 63
                r6 = r6 | r2
                byte r6 = (byte) r6
                r9[r3] = r6
                int r3 = r10 + 3
                int r6 = r1 >>> 6
                r6 = r6 & 63
                r6 = r6 | r2
                byte r6 = (byte) r6
                r9[r5] = r6
                int r10 = r10 + 4
                r1 = r1 & 63
                r1 = r1 | r2
                byte r1 = (byte) r1
                r9[r3] = r1
                r1 = r4
            Lb5:
                int r1 = r1 + 1
                goto L1f
            Lb9:
                r1 = r4
            Lba:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r8 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r1 = r1 + (-1)
                r8.<init>(r1, r0)
                throw r8
            Lc2:
                if (r5 > r3) goto Lde
                if (r3 > r4) goto Lde
                int r9 = r1 + 1
                int r11 = r8.length()
                if (r9 == r11) goto Ld8
                char r8 = r8.charAt(r9)
                boolean r8 = java.lang.Character.isSurrogatePair(r3, r8)
                if (r8 != 0) goto Lde
            Ld8:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r8 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                r8.<init>(r1, r0)
                throw r8
            Lde:
                java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                java.lang.String r11 = "Failed writing "
                r9.<init>(r11)
                java.lang.StringBuilder r9 = r9.append(r3)
                java.lang.String r11 = " at index "
                java.lang.StringBuilder r9 = r9.append(r11)
                java.lang.StringBuilder r9 = r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
            Lfd:
                return r10
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.CharSequence r1, java.nio.ByteBuffer r2) {
                r0 = this;
                r0.encodeUtf8Default(r1, r2)
                return
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8(int r7, byte[] r8, int r9, int r10) {
                r6 = this;
                if (r7 == 0) goto L86
                if (r9 < r10) goto L5
                return r7
            L5:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L1c
                r7 = -62
                if (r0 < r7) goto L1b
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
                goto L1b
            L18:
                r9 = r7
                goto L86
            L1b:
                return r2
            L1c:
                r4 = -16
                if (r0 >= r4) goto L49
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L34
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r7 < r10) goto L31
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r9)
                return r7
            L31:
                r5 = r9
                r9 = r7
                r7 = r5
            L34:
                if (r7 > r3) goto L48
                r4 = -96
                if (r0 != r1) goto L3c
                if (r7 < r4) goto L48
            L3c:
                r1 = -19
                if (r0 != r1) goto L42
                if (r7 >= r4) goto L48
            L42:
                int r7 = r9 + 1
                r9 = r8[r9]
                if (r9 <= r3) goto L18
            L48:
                return r2
            L49:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L5c
                int r7 = r9 + 1
                r1 = r8[r9]
                if (r7 < r10) goto L5a
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r0, r1)
                return r7
            L5a:
                r9 = 0
                goto L62
            L5c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L62:
                if (r9 != 0) goto L72
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r9 < r10) goto L6f
                int r7 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r0, r1, r7)
                return r7
            L6f:
                r5 = r9
                r9 = r7
                r7 = r5
            L72:
                if (r1 > r3) goto L85
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L85
                if (r9 > r3) goto L85
                int r9 = r7 + 1
                r7 = r8[r7]
                if (r7 <= r3) goto L86
            L85:
                return r2
            L86:
                int r7 = partialIsValidUtf8(r8, r9, r10)
                return r7
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int r1, java.nio.ByteBuffer r2, int r3, int r4) {
                r0 = this;
                int r1 = r0.partialIsValidUtf8Default(r1, r2, r3, r4)
                return r1
        }
    }

    static class UnpairedSurrogateException extends java.lang.IllegalArgumentException {
        UnpairedSurrogateException(int r3, int r4) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "Unpaired surrogate at index "
                r0.<init>(r1)
                java.lang.StringBuilder r3 = r0.append(r3)
                java.lang.String r0 = " of "
                java.lang.StringBuilder r3 = r3.append(r0)
                java.lang.StringBuilder r3 = r3.append(r4)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                return
        }
    }

    static final class UnsafeProcessor extends com.google.crypto.tink.shaded.protobuf.Utf8.Processor {
        UnsafeProcessor() {
                r0 = this;
                r0.<init>()
                return
        }

        static boolean isAvailable() {
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeArrayOperations()
                if (r0 == 0) goto Le
                boolean r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.hasUnsafeByteBufferOperations()
                if (r0 == 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        private static int partialIsValidUtf8(long r10, int r12) {
                int r0 = unsafeEstimateConsecutiveAscii(r10, r12)
                long r1 = (long) r0
                long r10 = r10 + r1
                int r12 = r12 - r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r12 <= 0) goto L1a
                long r4 = r10 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r1 < 0) goto L19
                int r12 = r12 + (-1)
                r10 = r4
                goto L9
            L19:
                r10 = r4
            L1a:
                if (r12 != 0) goto L1d
                return r0
            L1d:
                int r0 = r12 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r12 = r12 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r10
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r10 <= r6) goto L37
                goto L39
            L37:
                r10 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L48:
                int r12 = r12 + (-3)
                long r2 = r2 + r10
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r10 = r10 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r0)
                return r10
            L6d:
                int r12 = r12 + (-4)
                long r2 = r2 + r10
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r10
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r10 = r10 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
        }

        private static int partialIsValidUtf8(byte[] r10, long r11, int r13) {
                int r0 = unsafeEstimateConsecutiveAscii(r10, r11, r13)
                int r13 = r13 - r0
                long r0 = (long) r0
                long r11 = r11 + r0
            L7:
                r0 = 0
                r1 = r0
            L9:
                r2 = 1
                if (r13 <= 0) goto L1a
                long r4 = r11 + r2
                byte r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r1 < 0) goto L19
                int r13 = r13 + (-1)
                r11 = r4
                goto L9
            L19:
                r11 = r4
            L1a:
                if (r13 != 0) goto L1d
                return r0
            L1d:
                int r0 = r13 + (-1)
                r4 = -32
                r5 = -1
                r6 = -65
                if (r1 >= r4) goto L3a
                if (r0 != 0) goto L29
                return r1
            L29:
                int r13 = r13 + (-2)
                r0 = -62
                if (r1 < r0) goto L39
                long r2 = r2 + r11
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r11 <= r6) goto L37
                goto L39
            L37:
                r11 = r2
                goto L7
            L39:
                return r5
            L3a:
                r7 = -16
                r8 = 2
                if (r1 >= r7) goto L65
                r7 = 2
                if (r0 >= r7) goto L48
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L48:
                int r13 = r13 + (-3)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L64
                r7 = -96
                if (r1 != r4) goto L57
                if (r0 < r7) goto L64
            L57:
                r4 = -19
                if (r1 != r4) goto L5d
                if (r0 >= r7) goto L64
            L5d:
                long r11 = r11 + r8
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 <= r6) goto L7
            L64:
                return r5
            L65:
                r4 = 3
                if (r0 >= r4) goto L6d
                int r10 = unsafeIncompleteStateFor(r10, r1, r11, r0)
                return r10
            L6d:
                int r13 = r13 + (-4)
                long r2 = r2 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r11)
                if (r0 > r6) goto L8f
                int r1 = r1 << 28
                int r0 = r0 + 112
                int r1 = r1 + r0
                int r0 = r1 >> 30
                if (r0 != 0) goto L8f
                long r8 = r8 + r11
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r2)
                if (r0 > r6) goto L8f
                r0 = 3
                long r11 = r11 + r0
                byte r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10, r8)
                if (r0 <= r6) goto L7
            L8f:
                return r5
        }

        private static int unsafeEstimateConsecutiveAscii(long r5, int r7) {
                r0 = 16
                if (r7 >= r0) goto L6
                r5 = 0
                return r5
            L6:
                long r0 = -r5
                r2 = 7
                long r0 = r0 & r2
                int r0 = (int) r0
                r1 = r0
            Lc:
                if (r1 <= 0) goto L1d
                r2 = 1
                long r2 = r2 + r5
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r5)
                if (r5 >= 0) goto L19
                int r0 = r0 - r1
                return r0
            L19:
                int r1 = r1 + (-1)
                r5 = r2
                goto Lc
            L1d:
                int r0 = r7 - r0
            L1f:
                r1 = 8
                if (r0 < r1) goto L39
                long r1 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r5)
                r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r1 = r1 & r3
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 != 0) goto L39
                r1 = 8
                long r5 = r5 + r1
                int r0 = r0 + (-8)
                goto L1f
            L39:
                int r7 = r7 - r0
                return r7
        }

        private static int unsafeEstimateConsecutiveAscii(byte[] r8, long r9, int r11) {
                r0 = 16
                r1 = 0
                if (r11 >= r0) goto L6
                return r1
            L6:
                int r0 = (int) r9
                r0 = r0 & 7
                int r0 = 8 - r0
            Lb:
                r2 = 1
                if (r1 >= r0) goto L1b
                long r2 = r2 + r9
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 >= 0) goto L17
                return r1
            L17:
                int r1 = r1 + 1
                r9 = r2
                goto Lb
            L1b:
                int r0 = r1 + 8
                if (r0 > r11) goto L38
                long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.BYTE_ARRAY_BASE_OFFSET
                long r4 = r4 + r9
                long r4 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getLong(r8, r4)
                r6 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r4 = r4 & r6
                r6 = 0
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L33
                goto L38
            L33:
                r4 = 8
                long r9 = r9 + r4
                r1 = r0
                goto L1b
            L38:
                if (r1 >= r11) goto L47
                long r4 = r9 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r8, r9)
                if (r9 >= 0) goto L43
                return r1
            L43:
                int r1 = r1 + 1
                r9 = r4
                goto L38
            L47:
                return r11
        }

        private static int unsafeIncompleteStateFor(long r2, int r4, int r5) {
                if (r5 == 0) goto L27
                r0 = 1
                if (r5 == r0) goto L1e
                r0 = 2
                if (r5 != r0) goto L18
                byte r5 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                r0 = 1
                long r2 = r2 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r4, r5, r2)
                return r2
            L18:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L1e:
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r4, r2)
                return r2
            L27:
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1200(r4)
                return r2
        }

        private static int unsafeIncompleteStateFor(byte[] r2, int r3, long r4, int r6) {
                if (r6 == 0) goto L27
                r0 = 1
                if (r6 == r0) goto L1e
                r0 = 2
                if (r6 != r0) goto L18
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2, r4)
                r0 = 1
                long r4 = r4 + r0
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2, r4)
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r3, r6, r2)
                return r2
            L18:
                java.lang.AssertionError r2 = new java.lang.AssertionError
                r2.<init>()
                throw r2
            L1e:
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2, r4)
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r3, r2)
                return r2
            L27:
                int r2 = com.google.crypto.tink.shaded.protobuf.Utf8.access$1200(r3)
                return r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8(byte[] r3, int r4, int r5) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r2 = this;
                java.lang.String r0 = new java.lang.String
                java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                r0.<init>(r3, r4, r5, r1)
                java.lang.String r1 = "�"
                boolean r1 = r0.contains(r1)
                if (r1 != 0) goto L10
                return r0
            L10:
                java.nio.charset.Charset r1 = com.google.crypto.tink.shaded.protobuf.Internal.UTF_8
                byte[] r1 = r0.getBytes(r1)
                int r5 = r5 + r4
                byte[] r3 = java.util.Arrays.copyOfRange(r3, r4, r5)
                boolean r3 = java.util.Arrays.equals(r1, r3)
                if (r3 == 0) goto L22
                return r0
            L22:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r3 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r3
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        java.lang.String decodeUtf8Direct(java.nio.ByteBuffer r20, int r21, int r22) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
                r19 = this;
                r0 = r21
                r1 = r22
                r2 = r0 | r1
                int r3 = r20.limit()
                int r3 = r3 - r0
                int r3 = r3 - r1
                r2 = r2 | r3
                if (r2 < 0) goto Ld3
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r20)
                long r4 = (long) r0
                long r2 = r2 + r4
                long r4 = (long) r1
                long r4 = r4 + r2
                char[] r0 = new char[r1]
                r1 = 0
                r6 = r1
            L1b:
                int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r12 = 1
                if (r7 >= 0) goto L34
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                boolean r8 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r7)
                if (r8 != 0) goto L2c
                goto L34
            L2c:
                long r2 = r2 + r12
                int r8 = r6 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r7, r0, r6)
                r6 = r8
                goto L1b
            L34:
                r14 = r6
            L35:
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 >= 0) goto Lcd
                long r6 = r2 + r12
                byte r8 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r2)
                boolean r9 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r8)
                if (r9 == 0) goto L64
                int r2 = r14 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r8, r0, r14)
            L4a:
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r3 >= 0) goto L61
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                boolean r8 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$400(r3)
                if (r8 != 0) goto L59
                goto L61
            L59:
                long r6 = r6 + r12
                int r8 = r2 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$500(r3, r0, r2)
                r2 = r8
                goto L4a
            L61:
                r14 = r2
                r2 = r6
                goto L35
            L64:
                boolean r9 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$600(r8)
                r10 = 2
                if (r9 == 0) goto L81
                int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r9 >= 0) goto L7c
                long r2 = r2 + r10
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                int r7 = r14 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$700(r8, r6, r0, r14)
                r14 = r7
                goto L35
            L7c:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            L81:
                boolean r9 = com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$800(r8)
                r15 = 3
                if (r9 == 0) goto La5
                long r17 = r4 - r12
                int r9 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
                if (r9 >= 0) goto La0
                long r10 = r10 + r2
                byte r6 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r2 = r2 + r15
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                int r9 = r14 + 1
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$900(r8, r6, r7, r0, r14)
                r14 = r9
                goto L35
            La0:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            La5:
                long r17 = r4 - r10
                int r9 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
                if (r9 >= 0) goto Lc8
                long r10 = r10 + r2
                byte r7 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r6)
                long r15 = r15 + r2
                byte r9 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r10)
                r10 = 4
                long r2 = r2 + r10
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r15)
                r6 = r8
                r8 = r9
                r9 = r10
                r10 = r0
                r11 = r14
                com.google.crypto.tink.shaded.protobuf.Utf8.DecodeUtil.access$1000(r6, r7, r8, r9, r10, r11)
                int r14 = r14 + 2
                goto L35
            Lc8:
                com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r0 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.invalidUtf8()
                throw r0
            Lcd:
                java.lang.String r2 = new java.lang.String
                r2.<init>(r0, r1, r14)
                return r2
            Ld3:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                int r3 = r20.limit()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r22)
                java.lang.Object[] r0 = new java.lang.Object[]{r3, r0, r1}
                java.lang.String r1 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int encodeUtf8(java.lang.CharSequence r25, byte[] r26, int r27, int r28) {
                r24 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r3 = r28
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r25.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L144
                r2 = 0
            L1a:
                r11 = 1
                r3 = 128(0x80, float:1.8E-43)
                if (r2 >= r8) goto L2f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L2f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L1a
            L2f:
                if (r2 != r8) goto L33
                int r0 = (int) r4
                return r0
            L33:
                if (r2 >= r8) goto L142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L4f
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L4f
                long r14 = r4 + r11
                byte r13 = (byte) r13
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r13)
                r22 = r6
                r17 = r10
                r20 = r11
                r4 = r14
                r14 = r9
                goto Lf8
            L4f:
                r14 = 2048(0x800, float:2.87E-42)
                r15 = 2
                if (r13 >= r14) goto L76
                long r17 = r6 - r15
                int r14 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r14 > 0) goto L76
                r14 = r9
                r17 = r10
                long r9 = r4 + r11
                int r11 = r13 >>> 6
                r11 = r11 | 960(0x3c0, float:1.345E-42)
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r11)
                long r4 = r4 + r15
                r11 = r13 & 63
                r11 = r11 | r3
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r9, r11)
            L70:
                r22 = r6
                r20 = 1
                goto Lf8
            L76:
                r14 = r9
                r17 = r10
                r9 = 57343(0xdfff, float:8.0355E-41)
                r10 = 55296(0xd800, float:7.7486E-41)
                r11 = 3
                if (r13 < r10) goto L85
                if (r9 >= r13) goto Lad
            L85:
                long r18 = r6 - r11
                int r18 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r18 > 0) goto Lad
                r18 = 1
                long r9 = r4 + r18
                int r11 = r13 >>> 12
                r11 = r11 | 480(0x1e0, float:6.73E-43)
                byte r11 = (byte) r11
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r11)
                long r11 = r4 + r15
                int r15 = r13 >>> 6
                r15 = r15 & 63
                r15 = r15 | r3
                byte r15 = (byte) r15
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r9, r15)
                r9 = 3
                long r4 = r4 + r9
                r9 = r13 & 63
                r9 = r9 | r3
                byte r9 = (byte) r9
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r11, r9)
                goto L70
            Lad:
                r11 = 4
                long r20 = r6 - r11
                int r20 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r20 > 0) goto L10c
                int r9 = r2 + 1
                if (r9 == r8) goto L104
                char r2 = r0.charAt(r9)
                boolean r10 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r10 == 0) goto L103
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r20 = 1
                long r11 = r4 + r20
                int r10 = r2 >>> 18
                r10 = r10 | 240(0xf0, float:3.36E-43)
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r4, r10)
                r22 = r6
                long r6 = r4 + r15
                int r10 = r2 >>> 12
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r11, r10)
                r10 = 3
                long r11 = r4 + r10
                int r10 = r2 >>> 6
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r6, r10)
                r6 = 4
                long r4 = r4 + r6
                r2 = r2 & 63
                r2 = r2 | r3
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r11, r2)
                r2 = r9
            Lf8:
                int r2 = r2 + 1
                r9 = r14
                r10 = r17
                r11 = r20
                r6 = r22
                goto L33
            L103:
                r2 = r9
            L104:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + (-1)
                r0.<init>(r2, r8)
                throw r0
            L10c:
                if (r10 > r13) goto L124
                if (r13 > r9) goto L124
                int r1 = r2 + 1
                if (r1 == r8) goto L11e
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L124
            L11e:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L124:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r6 = r17
                r1.<init>(r6)
                java.lang.StringBuilder r1 = r1.append(r13)
                r7 = r14
                java.lang.StringBuilder r1 = r1.append(r7)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L142:
                int r0 = (int) r4
                return r0
            L144:
                r7 = r9
                r6 = r10
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>(r6)
                int r8 = r8 + (-1)
                char r0 = r0.charAt(r8)
                java.lang.StringBuilder r0 = r4.append(r0)
                java.lang.StringBuilder r0 = r0.append(r7)
                int r2 = r2 + r3
                java.lang.StringBuilder r0 = r0.append(r2)
                java.lang.String r0 = r0.toString()
                r1.<init>(r0)
                throw r1
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        void encodeUtf8Direct(java.lang.CharSequence r28, java.nio.ByteBuffer r29) {
                r27 = this;
                r0 = r28
                r1 = r29
                long r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r29)
                int r4 = r29.position()
                long r4 = (long) r4
                long r4 = r4 + r2
                int r6 = r29.limit()
                long r6 = (long) r6
                long r6 = r6 + r2
                int r8 = r28.length()
                long r9 = (long) r8
                long r11 = r6 - r4
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                java.lang.String r10 = " at index "
                java.lang.String r11 = "Failed writing "
                if (r9 > 0) goto L153
                r9 = 0
            L24:
                r12 = 1
                r14 = 128(0x80, float:1.8E-43)
                if (r9 >= r8) goto L39
                char r15 = r0.charAt(r9)
                if (r15 >= r14) goto L39
                long r12 = r12 + r4
                byte r14 = (byte) r15
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r14)
                int r9 = r9 + 1
                r4 = r12
                goto L24
            L39:
                if (r9 != r8) goto L41
                long r4 = r4 - r2
                int r0 = (int) r4
                r1.position(r0)
                return
            L41:
                if (r9 >= r8) goto L148
                char r15 = r0.charAt(r9)
                if (r15 >= r14) goto L5b
                int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r16 >= 0) goto L5b
                long r16 = r4 + r12
                byte r15 = (byte) r15
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r15)
                r19 = r2
                r1 = r9
                r9 = r14
                r4 = r16
                goto L100
            L5b:
                r14 = 2048(0x800, float:2.87E-42)
                r17 = 2
                if (r15 >= r14) goto L83
                long r19 = r6 - r17
                int r14 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
                if (r14 > 0) goto L83
                r19 = r2
                long r1 = r4 + r12
                int r3 = r15 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r3)
                long r4 = r4 + r17
                r3 = r15 & 63
                r14 = 128(0x80, float:1.8E-43)
                r3 = r3 | r14
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r3)
            L7e:
                r1 = r9
                r9 = 128(0x80, float:1.8E-43)
                goto L100
            L83:
                r19 = r2
                r1 = 57343(0xdfff, float:8.0355E-41)
                r2 = 55296(0xd800, float:7.7486E-41)
                r21 = 3
                if (r15 < r2) goto L91
                if (r1 >= r15) goto Lb8
            L91:
                long r23 = r6 - r21
                int r3 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
                if (r3 > 0) goto Lb8
                long r1 = r4 + r12
                int r3 = r15 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r3)
                long r12 = r4 + r17
                int r3 = r15 >>> 6
                r3 = r3 & 63
                r14 = 128(0x80, float:1.8E-43)
                r3 = r3 | r14
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r1, r3)
                long r4 = r4 + r21
                r1 = r15 & 63
                r1 = r1 | r14
                byte r1 = (byte) r1
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r12, r1)
                goto L7e
            Lb8:
                r12 = 4
                long r25 = r6 - r12
                int r3 = (r4 > r25 ? 1 : (r4 == r25 ? 0 : -1))
                if (r3 > 0) goto L115
                int r1 = r9 + 1
                if (r1 == r8) goto L10d
                char r2 = r0.charAt(r1)
                boolean r3 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r3 == 0) goto L10c
                int r2 = java.lang.Character.toCodePoint(r15, r2)
                r14 = 1
                long r12 = r4 + r14
                int r3 = r2 >>> 18
                r3 = r3 | 240(0xf0, float:3.36E-43)
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r4, r3)
                long r14 = r4 + r17
                int r3 = r2 >>> 12
                r3 = r3 & 63
                r9 = 128(0x80, float:1.8E-43)
                r3 = r3 | r9
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r12, r3)
                long r12 = r4 + r21
                int r3 = r2 >>> 6
                r3 = r3 & 63
                r3 = r3 | r9
                byte r3 = (byte) r3
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r14, r3)
                r14 = 4
                long r4 = r4 + r14
                r2 = r2 & 63
                r2 = r2 | r9
                byte r2 = (byte) r2
                com.google.crypto.tink.shaded.protobuf.UnsafeUtil.putByte(r12, r2)
            L100:
                int r1 = r1 + 1
                r14 = r9
                r2 = r19
                r12 = 1
                r9 = r1
                r1 = r29
                goto L41
            L10c:
                r9 = r1
            L10d:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                int r9 = r9 + (-1)
                r0.<init>(r9, r8)
                throw r0
            L115:
                if (r2 > r15) goto L12d
                if (r15 > r1) goto L12d
                int r1 = r9 + 1
                if (r1 == r8) goto L127
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r15, r0)
                if (r0 != 0) goto L12d
            L127:
                com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r9, r8)
                throw r0
            L12d:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>(r11)
                java.lang.StringBuilder r1 = r1.append(r15)
                java.lang.StringBuilder r1 = r1.append(r10)
                java.lang.StringBuilder r1 = r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L148:
                r19 = r2
                long r4 = r4 - r19
                int r0 = (int) r4
                r1 = r29
                r1.position(r0)
                return
            L153:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r11)
                int r8 = r8 + (-1)
                char r0 = r0.charAt(r8)
                java.lang.StringBuilder r0 = r3.append(r0)
                java.lang.StringBuilder r0 = r0.append(r10)
                int r1 = r29.limit()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r2.<init>(r0)
                throw r2
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8(int r11, byte[] r12, int r13, int r14) {
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.length
                int r1 = r1 - r14
                r0 = r0 | r1
                if (r0 < 0) goto La8
                long r0 = (long) r13
                long r13 = (long) r14
                if (r11 == 0) goto La1
                int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
                if (r2 < 0) goto L10
                return r11
            L10:
                byte r2 = (byte) r11
                r3 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r2 >= r3) goto L2a
                r11 = -62
                if (r2 < r11) goto L29
                long r6 = r6 + r0
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L26
                goto L29
            L26:
                r0 = r6
                goto La1
            L29:
                return r4
            L2a:
                r8 = -16
                if (r2 >= r8) goto L5e
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L44
                long r8 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L43
                int r11 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r2, r11)
                return r11
            L43:
                r0 = r8
            L44:
                if (r11 > r5) goto L5d
                r8 = -96
                if (r2 != r3) goto L4c
                if (r11 < r8) goto L5d
            L4c:
                r3 = -19
                if (r2 != r3) goto L52
                if (r11 >= r8) goto L5d
            L52:
                long r2 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L5b
                goto L5d
            L5b:
                r0 = r2
                goto La1
            L5d:
                return r4
            L5e:
                int r3 = r11 >> 8
                int r3 = ~r3
                byte r3 = (byte) r3
                if (r3 != 0) goto L76
                long r8 = r0 + r6
                byte r3 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0)
                int r11 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r11 < 0) goto L73
                int r11 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r2, r3)
                return r11
            L73:
                r11 = 0
                r0 = r8
                goto L79
            L76:
                int r11 = r11 >> 16
                byte r11 = (byte) r11
            L79:
                if (r11 != 0) goto L8b
                long r8 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0)
                int r0 = (r8 > r13 ? 1 : (r8 == r13 ? 0 : -1))
                if (r0 < 0) goto L8a
                int r11 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r2, r3, r11)
                return r11
            L8a:
                r0 = r8
            L8b:
                if (r3 > r5) goto La0
                int r2 = r2 << 28
                int r3 = r3 + 112
                int r2 = r2 + r3
                int r2 = r2 >> 30
                if (r2 != 0) goto La0
                if (r11 > r5) goto La0
                long r2 = r0 + r6
                byte r11 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r12, r0)
                if (r11 <= r5) goto L5b
            La0:
                return r4
            La1:
                long r13 = r13 - r0
                int r11 = (int) r13
                int r11 = partialIsValidUtf8(r12, r0, r11)
                return r11
            La8:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                int r12 = r12.length
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                java.lang.Object[] r12 = new java.lang.Object[]{r12, r13, r14}
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r13, r12)
                r11.<init>(r12)
                throw r11
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Utf8.Processor
        int partialIsValidUtf8Direct(int r10, java.nio.ByteBuffer r11, int r12, int r13) {
                r9 = this;
                r0 = r12 | r13
                int r1 = r11.limit()
                int r1 = r1 - r13
                r0 = r0 | r1
                if (r0 < 0) goto Lad
                long r0 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.addressOffset(r11)
                long r2 = (long) r12
                long r0 = r0 + r2
                int r13 = r13 - r12
                long r11 = (long) r13
                long r11 = r11 + r0
                if (r10 == 0) goto La6
                int r13 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
                if (r13 < 0) goto L1a
                return r10
            L1a:
                byte r13 = (byte) r10
                r2 = -32
                r3 = -1
                r4 = -65
                r5 = 1
                if (r13 >= r2) goto L34
                r10 = -62
                if (r13 < r10) goto L33
                long r5 = r5 + r0
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r10 <= r4) goto L30
                goto L33
            L30:
                r0 = r5
                goto La6
            L33:
                return r3
            L34:
                r7 = -16
                if (r13 >= r7) goto L64
                int r10 = r10 >> 8
                int r10 = ~r10
                byte r10 = (byte) r10
                if (r10 != 0) goto L4e
                long r7 = r0 + r5
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 < 0) goto L4d
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r13, r10)
                return r10
            L4d:
                r0 = r7
            L4e:
                if (r10 > r4) goto L63
                r7 = -96
                if (r13 != r2) goto L56
                if (r10 < r7) goto L63
            L56:
                r2 = -19
                if (r13 != r2) goto L5c
                if (r10 >= r7) goto L63
            L5c:
                long r5 = r5 + r0
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r10 <= r4) goto L30
            L63:
                return r3
            L64:
                int r2 = r10 >> 8
                int r2 = ~r2
                byte r2 = (byte) r2
                if (r2 != 0) goto L7c
                long r7 = r0 + r5
                byte r2 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                int r10 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r10 < 0) goto L79
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$000(r13, r2)
                return r10
            L79:
                r10 = 0
                r0 = r7
                goto L7f
            L7c:
                int r10 = r10 >> 16
                byte r10 = (byte) r10
            L7f:
                if (r10 != 0) goto L91
                long r7 = r0 + r5
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
                if (r0 < 0) goto L90
                int r10 = com.google.crypto.tink.shaded.protobuf.Utf8.access$100(r13, r2, r10)
                return r10
            L90:
                r0 = r7
            L91:
                if (r2 > r4) goto La5
                int r13 = r13 << 28
                int r2 = r2 + 112
                int r13 = r13 + r2
                int r13 = r13 >> 30
                if (r13 != 0) goto La5
                if (r10 > r4) goto La5
                long r5 = r5 + r0
                byte r10 = com.google.crypto.tink.shaded.protobuf.UnsafeUtil.getByte(r0)
                if (r10 <= r4) goto L30
            La5:
                return r3
            La6:
                long r11 = r11 - r0
                int r10 = (int) r11
                int r10 = partialIsValidUtf8(r0, r10)
                return r10
            Lad:
                java.lang.ArrayIndexOutOfBoundsException r10 = new java.lang.ArrayIndexOutOfBoundsException
                int r11 = r11.limit()
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                java.lang.Object[] r11 = new java.lang.Object[]{r11, r12, r13}
                java.lang.String r12 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r11 = java.lang.String.format(r12, r11)
                r10.<init>(r11)
                throw r10
        }
    }

    static {
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Utf8.UnsafeProcessor.isAvailable()
            if (r0 == 0) goto L12
            boolean r0 = com.google.crypto.tink.shaded.protobuf.Android.isOnAndroidDevice()
            if (r0 != 0) goto L12
            com.google.crypto.tink.shaded.protobuf.Utf8$UnsafeProcessor r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnsafeProcessor
            r0.<init>()
            goto L17
        L12:
            com.google.crypto.tink.shaded.protobuf.Utf8$SafeProcessor r0 = new com.google.crypto.tink.shaded.protobuf.Utf8$SafeProcessor
            r0.<init>()
        L17:
            com.google.crypto.tink.shaded.protobuf.Utf8.processor = r0
            return
    }

    private Utf8() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int access$000(int r0, int r1) {
            int r0 = incompleteStateFor(r0, r1)
            return r0
    }

    static /* synthetic */ int access$100(int r0, int r1, int r2) {
            int r0 = incompleteStateFor(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int access$1100(byte[] r0, int r1, int r2) {
            int r0 = incompleteStateFor(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int access$1200(int r0) {
            int r0 = incompleteStateFor(r0)
            return r0
    }

    static /* synthetic */ int access$200(java.nio.ByteBuffer r0, int r1, int r2) {
            int r0 = estimateConsecutiveAscii(r0, r1, r2)
            return r0
    }

    static /* synthetic */ int access$300(java.nio.ByteBuffer r0, int r1, int r2, int r3) {
            int r0 = incompleteStateFor(r0, r1, r2, r3)
            return r0
    }

    static java.lang.String decodeUtf8(java.nio.ByteBuffer r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            java.lang.String r1 = r0.decodeUtf8(r1, r2, r3)
            return r1
    }

    static java.lang.String decodeUtf8(byte[] r1, int r2, int r3) throws com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            java.lang.String r1 = r0.decodeUtf8(r1, r2, r3)
            return r1
    }

    static int encode(java.lang.CharSequence r1, byte[] r2, int r3, int r4) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r1 = r0.encodeUtf8(r1, r2, r3, r4)
            return r1
    }

    static void encodeUtf8(java.lang.CharSequence r1, java.nio.ByteBuffer r2) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            r0.encodeUtf8(r1, r2)
            return
    }

    static int encodedLength(java.lang.CharSequence r5) {
            int r0 = r5.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L12
            char r2 = r5.charAt(r1)
            r3 = 128(0x80, float:1.8E-43)
            if (r2 >= r3) goto L12
            int r1 = r1 + 1
            goto L5
        L12:
            r2 = r0
        L13:
            if (r1 >= r0) goto L2a
            char r3 = r5.charAt(r1)
            r4 = 2048(0x800, float:2.87E-42)
            if (r3 >= r4) goto L25
            int r3 = 127 - r3
            int r3 = r3 >>> 31
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto L13
        L25:
            int r5 = encodedLengthGeneral(r5, r1)
            int r2 = r2 + r5
        L2a:
            if (r2 < r0) goto L2d
            return r2
        L2d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UTF-8 length does not fit in int: "
            r0.<init>(r1)
            long r1 = (long) r2
            r3 = 4294967296(0x100000000, double:2.121995791E-314)
            long r1 = r1 + r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    private static int encodedLengthGeneral(java.lang.CharSequence r4, int r5) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r5 >= r0) goto L35
            char r2 = r4.charAt(r5)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L15
            int r2 = 127 - r2
            int r2 = r2 >>> 31
            int r1 = r1 + r2
            goto L32
        L15:
            int r1 = r1 + 2
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r3 > r2) goto L32
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 > r3) goto L32
            int r2 = java.lang.Character.codePointAt(r4, r5)
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r2 < r3) goto L2c
            int r5 = r5 + 1
            goto L32
        L2c:
            com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException r4 = new com.google.crypto.tink.shaded.protobuf.Utf8$UnpairedSurrogateException
            r4.<init>(r5, r0)
            throw r4
        L32:
            int r5 = r5 + 1
            goto L5
        L35:
            return r1
    }

    private static int estimateConsecutiveAscii(java.nio.ByteBuffer r5, int r6, int r7) {
            int r7 = r7 + (-7)
            r0 = r6
        L3:
            if (r0 >= r7) goto L18
            long r1 = r5.getLong(r0)
            r3 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r1 = r1 & r3
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L18
            int r0 = r0 + 8
            goto L3
        L18:
            int r0 = r0 - r6
            return r0
    }

    private static int incompleteStateFor(int r1) {
            r0 = -12
            if (r1 <= r0) goto L5
            r1 = -1
        L5:
            return r1
    }

    private static int incompleteStateFor(int r1, int r2) {
            r0 = -12
            if (r1 > r0) goto Ld
            r0 = -65
            if (r2 <= r0) goto L9
            goto Ld
        L9:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            goto Le
        Ld:
            r1 = -1
        Le:
            return r1
    }

    private static int incompleteStateFor(int r1, int r2, int r3) {
            r0 = -12
            if (r1 > r0) goto L12
            r0 = -65
            if (r2 > r0) goto L12
            if (r3 <= r0) goto Lb
            goto L12
        Lb:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            int r2 = r3 << 16
            r1 = r1 ^ r2
            goto L13
        L12:
            r1 = -1
        L13:
            return r1
    }

    private static int incompleteStateFor(java.nio.ByteBuffer r2, int r3, int r4, int r5) {
            if (r5 == 0) goto L25
            r0 = 1
            if (r5 == r0) goto L1c
            r1 = 2
            if (r5 != r1) goto L16
            byte r5 = r2.get(r4)
            int r4 = r4 + r0
            byte r2 = r2.get(r4)
            int r2 = incompleteStateFor(r3, r5, r2)
            return r2
        L16:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L1c:
            byte r2 = r2.get(r4)
            int r2 = incompleteStateFor(r3, r2)
            return r2
        L25:
            int r2 = incompleteStateFor(r3)
            return r2
    }

    private static int incompleteStateFor(byte[] r3, int r4, int r5) {
            int r0 = r4 + (-1)
            r0 = r3[r0]
            int r5 = r5 - r4
            if (r5 == 0) goto L24
            r1 = 1
            if (r5 == r1) goto L1d
            r2 = 2
            if (r5 != r2) goto L17
            r5 = r3[r4]
            int r4 = r4 + r1
            r3 = r3[r4]
            int r3 = incompleteStateFor(r0, r5, r3)
            return r3
        L17:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1d:
            r3 = r3[r4]
            int r3 = incompleteStateFor(r0, r3)
            return r3
        L24:
            int r3 = incompleteStateFor(r0)
            return r3
    }

    static boolean isValidUtf8(java.nio.ByteBuffer r3) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r1 = r3.position()
            int r2 = r3.remaining()
            boolean r3 = r0.isValidUtf8(r3, r1, r2)
            return r3
    }

    static boolean isValidUtf8(byte[] r3) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            r1 = 0
            int r2 = r3.length
            boolean r3 = r0.isValidUtf8(r3, r1, r2)
            return r3
    }

    static boolean isValidUtf8(byte[] r1, int r2, int r3) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            boolean r1 = r0.isValidUtf8(r1, r2, r3)
            return r1
    }

    static int partialIsValidUtf8(int r1, java.nio.ByteBuffer r2, int r3, int r4) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r1 = r0.partialIsValidUtf8(r1, r2, r3, r4)
            return r1
    }

    static int partialIsValidUtf8(int r1, byte[] r2, int r3, int r4) {
            com.google.crypto.tink.shaded.protobuf.Utf8$Processor r0 = com.google.crypto.tink.shaded.protobuf.Utf8.processor
            int r1 = r0.partialIsValidUtf8(r1, r2, r3, r4)
            return r1
    }
}
