package okio;

/* JADX INFO: renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a0\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0000\u001a \u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0015H\u0000\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0015H\u0080\b\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a\u0010\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0005H\u0000\u001a\u0015\u0010\u001a\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\f\u001a\u0015\u0010\u001a\u001a\u00020\u0015*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0080\f\u001a\u0015\u0010\u001a\u001a\u00020\u0015*\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0015H\u0080\f\u001a\u0015\u0010\u001d\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0001H\u0080\f\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0001*\u00020 2\u0006\u0010!\u001a\u00020\u0001H\u0000\u001a\f\u0010\"\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\"\u001a\u00020\u0015*\u00020\u0015H\u0000\u001a\f\u0010\"\u001a\u00020#*\u00020#H\u0000\u001a\u0015\u0010$\u001a\u00020\u0015*\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u0001H\u0080\f\u001a\u0015\u0010%\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\f\u001a\u0015\u0010&\u001a\u00020\u0001*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\f\u001a\f\u0010'\u001a\u00020(*\u00020\u001bH\u0000\u001a\f\u0010'\u001a\u00020(*\u00020\u0001H\u0000\u001a\f\u0010'\u001a\u00020(*\u00020\u0015H\u0000\u001a\u0015\u0010)\u001a\u00020\u001b*\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0080\f\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u001c\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006*"}, d2 = {"DEFAULT__ByteString_size", "", "getDEFAULT__ByteString_size", "()I", "DEFAULT__new_UnsafeCursor", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "arrayRangeEquals", "", "a", "", "aOffset", "b", "bOffset", "byteCount", "checkOffsetAndCount", "", "size", "", "offset", "minOf", "resolveDefaultParameter", "unsafeCursor", "and", "", "other", "leftRotate", "bitCount", "sizeParam", "Lokio/ByteString;", "position", "reverseBytes", "", "rightRotate", "shl", "shr", "toHexString", "", "xor", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SegmentedByteString {
    private static final int DEFAULT__ByteString_size = 0;
    private static final okio.Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = null;

    static {
            okio.Buffer$UnsafeCursor r0 = new okio.Buffer$UnsafeCursor
            r0.<init>()
            okio.SegmentedByteString.DEFAULT__new_UnsafeCursor = r0
            r0 = -1234567890(0xffffffffb669fd2e, float:-3.4867076E-6)
            okio.SegmentedByteString.DEFAULT__ByteString_size = r0
            return
    }

    public static final int and(byte r0, int r1) {
            r0 = r0 & r1
            return r0
    }

    public static final long and(byte r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    public static final long and(int r2, long r3) {
            long r0 = (long) r2
            long r2 = r0 & r3
            return r2
    }

    public static final boolean arrayRangeEquals(byte[] r4, int r5, byte[] r6, int r7, int r8) {
            java.lang.String r0 = "a"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "b"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 0
            r1 = r0
        Lc:
            if (r1 >= r8) goto L1c
            int r2 = r1 + r5
            r2 = r4[r2]
            int r3 = r1 + r7
            r3 = r6[r3]
            if (r2 == r3) goto L19
            return r0
        L19:
            int r1 = r1 + 1
            goto Lc
        L1c:
            r4 = 1
            return r4
    }

    public static final void checkOffsetAndCount(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "size="
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r5 = " offset="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = " byteCount="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r8)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public static final int getDEFAULT__ByteString_size() {
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            return r0
    }

    public static final okio.Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.DEFAULT__new_UnsafeCursor
            return r0
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
            return
    }

    public static final int leftRotate(int r1, int r2) {
            int r0 = r1 << r2
            int r2 = 32 - r2
            int r1 = r1 >>> r2
            r1 = r1 | r0
            return r1
    }

    public static final long minOf(int r2, long r3) {
            long r0 = (long) r2
            long r2 = java.lang.Math.min(r0, r3)
            return r2
    }

    public static final long minOf(long r2, int r4) {
            long r0 = (long) r4
            long r2 = java.lang.Math.min(r2, r0)
            return r2
    }

    public static final int resolveDefaultParameter(okio.ByteString r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            if (r2 != r0) goto Le
            int r1 = r1.size()
            return r1
        Le:
            return r2
    }

    public static final int resolveDefaultParameter(byte[] r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = okio.SegmentedByteString.DEFAULT__ByteString_size
            if (r2 != r0) goto Lb
            int r1 = r1.length
            return r1
        Lb:
            return r2
    }

    public static final okio.Buffer.UnsafeCursor resolveDefaultParameter(okio.Buffer.UnsafeCursor r1) {
            java.lang.String r0 = "unsafeCursor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            okio.Buffer$UnsafeCursor r0 = okio.SegmentedByteString.DEFAULT__new_UnsafeCursor
            if (r1 != r0) goto Le
            okio.Buffer$UnsafeCursor r1 = new okio.Buffer$UnsafeCursor
            r1.<init>()
        Le:
            return r1
    }

    public static final int reverseBytes(int r2) {
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r0 = r0 & r2
            int r0 = r0 >>> 24
            r1 = 16711680(0xff0000, float:2.3418052E-38)
            r1 = r1 & r2
            int r1 = r1 >>> 8
            r0 = r0 | r1
            r1 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 << 8
            r0 = r0 | r1
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    public static final long reverseBytes(long r8) {
            r0 = -72057594037927936(0xff00000000000000, double:-5.486124068793689E303)
            long r0 = r0 & r8
            r2 = 56
            long r0 = r0 >>> r2
            r3 = 71776119061217280(0xff000000000000, double:7.06327445644526E-304)
            long r3 = r3 & r8
            r5 = 40
            long r3 = r3 >>> r5
            long r0 = r0 | r3
            r3 = 280375465082880(0xff0000000000, double:1.38523885234213E-309)
            long r3 = r3 & r8
            r6 = 24
            long r3 = r3 >>> r6
            long r0 = r0 | r3
            r3 = 1095216660480(0xff00000000, double:5.41108926696E-312)
            long r3 = r3 & r8
            r7 = 8
            long r3 = r3 >>> r7
            long r0 = r0 | r3
            r3 = 4278190080(0xff000000, double:2.113706745E-314)
            long r3 = r3 & r8
            long r3 = r3 << r7
            long r0 = r0 | r3
            r3 = 16711680(0xff0000, double:8.256667E-317)
            long r3 = r3 & r8
            long r3 = r3 << r6
            long r0 = r0 | r3
            r3 = 65280(0xff00, double:3.22526E-319)
            long r3 = r3 & r8
            long r3 = r3 << r5
            long r0 = r0 | r3
            r3 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            long r8 = r8 << r2
            long r8 = r8 | r0
            return r8
    }

    public static final short reverseBytes(short r1) {
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r1
            int r0 = r0 >>> 8
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r0
            short r1 = (short) r1
            return r1
    }

    public static final long rightRotate(long r2, int r4) {
            long r0 = r2 >>> r4
            int r4 = 64 - r4
            long r2 = r2 << r4
            long r2 = r2 | r0
            return r2
    }

    public static final int shl(byte r0, int r1) {
            int r0 = r0 << r1
            return r0
    }

    public static final int shr(byte r0, int r1) {
            int r0 = r0 >> r1
            return r0
    }

    public static final java.lang.String toHexString(byte r3) {
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r1 = r3 >> 4
            r1 = r1 & 15
            char r0 = r0[r1]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r3 = r3 & 15
            char r3 = r1[r3]
            r1 = 2
            char[] r1 = new char[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            java.lang.String r3 = kotlin.text.StringsKt.concatToString(r1)
            return r3
    }

    public static final java.lang.String toHexString(int r10) {
            if (r10 != 0) goto L5
            java.lang.String r10 = "0"
            return r10
        L5:
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r1 = r10 >> 28
            r1 = r1 & 15
            char r0 = r0[r1]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r2 = r10 >> 24
            r2 = r2 & 15
            char r1 = r1[r2]
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r3 = r10 >> 20
            r3 = r3 & 15
            char r2 = r2[r3]
            char[] r3 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r4 = r10 >> 16
            r4 = r4 & 15
            char r3 = r3[r4]
            char[] r4 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r5 = r10 >> 12
            r5 = r5 & 15
            char r4 = r4[r5]
            char[] r5 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r6 = r10 >> 8
            r6 = r6 & 15
            char r5 = r5[r6]
            char[] r6 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            int r7 = r10 >> 4
            r7 = r7 & 15
            char r6 = r6[r7]
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r10 = r10 & 15
            char r10 = r7[r10]
            r7 = 8
            char[] r8 = new char[r7]
            r9 = 0
            r8[r9] = r0
            r0 = 1
            r8[r0] = r1
            r0 = 2
            r8[r0] = r2
            r0 = 3
            r8[r0] = r3
            r0 = 4
            r8[r0] = r4
            r0 = 5
            r8[r0] = r5
            r0 = 6
            r8[r0] = r6
            r0 = 7
            r8[r0] = r10
        L6f:
            if (r9 >= r7) goto L7a
            char r10 = r8[r9]
            r0 = 48
            if (r10 != r0) goto L7a
            int r9 = r9 + 1
            goto L6f
        L7a:
            java.lang.String r10 = kotlin.text.StringsKt.concatToString(r8, r9, r7)
            return r10
    }

    public static final java.lang.String toHexString(long r21) {
            r0 = 0
            int r0 = (r21 > r0 ? 1 : (r21 == r0 ? 0 : -1))
            if (r0 != 0) goto L9
            java.lang.String r0 = "0"
            return r0
        L9:
            char[] r0 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r1 = 60
            long r1 = r21 >> r1
            r3 = 15
            long r1 = r1 & r3
            int r1 = (int) r1
            char r0 = r0[r1]
            char[] r1 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r2 = 56
            long r5 = r21 >> r2
            long r5 = r5 & r3
            int r2 = (int) r5
            char r1 = r1[r2]
            char[] r2 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r5 = 52
            long r5 = r21 >> r5
            long r5 = r5 & r3
            int r5 = (int) r5
            char r2 = r2[r5]
            char[] r5 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r6 = 48
            long r7 = r21 >> r6
            long r7 = r7 & r3
            int r7 = (int) r7
            char r5 = r5[r7]
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r8 = 44
            long r8 = r21 >> r8
            long r8 = r8 & r3
            int r8 = (int) r8
            char r7 = r7[r8]
            char[] r8 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r9 = 40
            long r9 = r21 >> r9
            long r9 = r9 & r3
            int r9 = (int) r9
            char r8 = r8[r9]
            char[] r9 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r10 = 36
            long r10 = r21 >> r10
            long r10 = r10 & r3
            int r10 = (int) r10
            char r9 = r9[r10]
            char[] r10 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r11 = 32
            long r11 = r21 >> r11
            long r11 = r11 & r3
            int r11 = (int) r11
            char r10 = r10[r11]
            char[] r11 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r12 = 28
            long r12 = r21 >> r12
            long r12 = r12 & r3
            int r12 = (int) r12
            char r11 = r11[r12]
            char[] r12 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r13 = 24
            long r13 = r21 >> r13
            long r13 = r13 & r3
            int r13 = (int) r13
            char r12 = r12[r13]
            char[] r13 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r14 = 20
            long r14 = r21 >> r14
            long r14 = r14 & r3
            int r14 = (int) r14
            char r13 = r13[r14]
            char[] r14 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r15 = 16
            long r16 = r21 >> r15
            r18 = r7
            long r6 = r16 & r3
            int r6 = (int) r6
            char r6 = r14[r6]
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r14 = 12
            long r16 = r21 >> r14
            long r14 = r16 & r3
            int r14 = (int) r14
            char r7 = r7[r14]
            char[] r14 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r15 = 8
            long r16 = r21 >> r15
            r19 = r6
            r20 = r7
            long r6 = r16 & r3
            int r6 = (int) r6
            char r6 = r14[r6]
            char[] r7 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            r14 = 4
            long r16 = r21 >> r14
            long r14 = r16 & r3
            int r14 = (int) r14
            char r7 = r7[r14]
            char[] r14 = okio.internal.ByteString.getHEX_DIGIT_CHARS()
            long r3 = r21 & r3
            int r3 = (int) r3
            char r3 = r14[r3]
            r4 = 16
            char[] r14 = new char[r4]
            r4 = 0
            r14[r4] = r0
            r0 = 1
            r14[r0] = r1
            r0 = 2
            r14[r0] = r2
            r0 = 3
            r14[r0] = r5
            r0 = 4
            r14[r0] = r18
            r0 = 5
            r14[r0] = r8
            r0 = 6
            r14[r0] = r9
            r0 = 7
            r14[r0] = r10
            r0 = 8
            r14[r0] = r11
            r0 = 9
            r14[r0] = r12
            r0 = 10
            r14[r0] = r13
            r0 = 11
            r14[r0] = r19
            r0 = 12
            r14[r0] = r20
            r0 = 13
            r14[r0] = r6
            r0 = 14
            r14[r0] = r7
            r0 = 15
            r14[r0] = r3
            r0 = 16
        L10f:
            if (r4 >= r0) goto L11a
            char r1 = r14[r4]
            r2 = 48
            if (r1 != r2) goto L11a
            int r4 = r4 + 1
            goto L10f
        L11a:
            java.lang.String r0 = kotlin.text.StringsKt.concatToString(r14, r4, r0)
            return r0
    }

    public static final byte xor(byte r0, byte r1) {
            r0 = r0 ^ r1
            byte r0 = (byte) r0
            return r0
    }
}
