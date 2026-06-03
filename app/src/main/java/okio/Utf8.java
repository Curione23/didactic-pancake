package okio;

/* JADX INFO: compiled from: Utf8.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0011\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0007H\u0080\b\u001a4\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0017\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0018\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u0019\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001a\u001a\u00020\u0016*\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a4\u0010\u001c\u001a\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\bø\u0001\u0000\u001a%\u0010\u001d\u001a\u00020\u001e*\u00020\u001b2\b\b\u0002\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0013\u001a\u00020\u0001H\u0007¢\u0006\u0002\b\u001f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 55232;
    public static final int LOG_SURROGATE_HEADER = 56320;
    public static final int MASK_2BYTES = 3968;
    public static final int MASK_3BYTES = -123008;
    public static final int MASK_4BYTES = 3678080;
    public static final byte REPLACEMENT_BYTE = 63;
    public static final char REPLACEMENT_CHARACTER = 65533;
    public static final int REPLACEMENT_CODE_POINT = 65533;

    public static final boolean isIsoControl(int r1) {
            if (r1 < 0) goto L7
            r0 = 32
            if (r1 >= r0) goto L7
            goto Lf
        L7:
            r0 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto L11
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 >= r0) goto L11
        Lf:
            r1 = 1
            goto L12
        L11:
            r1 = 0
        L12:
            return r1
    }

    public static final boolean isUtf8Continuation(byte r1) {
            r1 = r1 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r1 != r0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public static final int process2Utf8Bytes(byte[] r3, int r4, int r5, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4 + 1
            r1 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 1
            if (r5 > r0) goto L1a
            r6.invoke(r1)
            return r2
        L1a:
            r4 = r3[r4]
            r3 = r3[r0]
            r5 = r3 & 192(0xc0, float:2.69E-43)
            r0 = 128(0x80, float:1.8E-43)
            if (r5 != r0) goto L38
            r3 = r3 ^ 3968(0xf80, float:5.56E-42)
            int r4 = r4 << 6
            r3 = r3 ^ r4
            if (r3 >= r0) goto L2f
            r6.invoke(r1)
            goto L36
        L2f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.invoke(r3)
        L36:
            r3 = 2
            return r3
        L38:
            r6.invoke(r1)
            return r2
    }

    public static final int process3Utf8Bytes(byte[] r6, int r7, int r8, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            int r0 = r7 + 2
            r1 = 128(0x80, float:1.8E-43)
            r2 = 1
            r3 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 2
            if (r8 > r0) goto L27
            r9.invoke(r3)
            int r7 = r7 + r2
            if (r8 <= r7) goto L26
            r6 = r6[r7]
            r6 = r6 & 192(0xc0, float:2.69E-43)
            if (r6 != r1) goto L26
            return r4
        L26:
            return r2
        L27:
            r8 = r6[r7]
            int r7 = r7 + r2
            r7 = r6[r7]
            r5 = r7 & 192(0xc0, float:2.69E-43)
            if (r5 != r1) goto L63
            r6 = r6[r0]
            r0 = r6 & 192(0xc0, float:2.69E-43)
            if (r0 != r1) goto L5f
            r0 = -123008(0xfffffffffffe1f80, float:NaN)
            r6 = r6 ^ r0
            int r7 = r7 << 6
            r6 = r6 ^ r7
            int r7 = r8 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto L48
            r9.invoke(r3)
            goto L5d
        L48:
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r7 > r6) goto L56
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 >= r7) goto L56
            r9.invoke(r3)
            goto L5d
        L56:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.invoke(r6)
        L5d:
            r6 = 3
            return r6
        L5f:
            r9.invoke(r3)
            return r4
        L63:
            r9.invoke(r3)
            return r2
    }

    public static final int process4Utf8Bytes(byte[] r8, int r9, int r10, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            int r0 = r9 + 3
            r1 = 2
            r2 = 1
            r3 = 128(0x80, float:1.8E-43)
            r4 = 65533(0xfffd, float:9.1831E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 3
            if (r10 > r0) goto L33
            r11.invoke(r4)
            int r11 = r9 + 1
            if (r10 <= r11) goto L32
            r11 = r8[r11]
            r11 = r11 & 192(0xc0, float:2.69E-43)
            if (r11 != r3) goto L32
            int r9 = r9 + r1
            if (r10 <= r9) goto L31
            r8 = r8[r9]
            r8 = r8 & 192(0xc0, float:2.69E-43)
            if (r8 != r3) goto L31
            return r5
        L31:
            return r1
        L32:
            return r2
        L33:
            r10 = r8[r9]
            int r6 = r9 + 1
            r6 = r8[r6]
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 != r3) goto L87
            int r9 = r9 + r1
            r9 = r8[r9]
            r2 = r9 & 192(0xc0, float:2.69E-43)
            if (r2 != r3) goto L83
            r8 = r8[r0]
            r0 = r8 & 192(0xc0, float:2.69E-43)
            if (r0 != r3) goto L7f
            r0 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r0
            int r9 = r9 << 6
            r8 = r8 ^ r9
            int r9 = r6 << 12
            r8 = r8 ^ r9
            int r9 = r10 << 18
            r8 = r8 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r8 <= r9) goto L60
            r11.invoke(r4)
            goto L7d
        L60:
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r9 > r8) goto L6e
            r9 = 57344(0xe000, float:8.0356E-41)
            if (r8 >= r9) goto L6e
            r11.invoke(r4)
            goto L7d
        L6e:
            r9 = 65536(0x10000, float:9.1835E-41)
            if (r8 >= r9) goto L76
            r11.invoke(r4)
            goto L7d
        L76:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.invoke(r8)
        L7d:
            r8 = 4
            return r8
        L7f:
            r11.invoke(r4)
            return r5
        L83:
            r11.invoke(r4)
            return r1
        L87:
            r11.invoke(r4)
            return r2
    }

    public static final void processUtf16Chars(byte[] r11, int r12, int r13, kotlin.jvm.functions.Function1<? super java.lang.Character, kotlin.Unit> r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
        La:
            if (r12 >= r13) goto L17c
            r0 = r11[r12]
            if (r0 < 0) goto L2b
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            int r12 = r12 + 1
        L1a:
            if (r12 >= r13) goto La
            r0 = r11[r12]
            if (r0 < 0) goto La
            int r12 = r12 + 1
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            goto L1a
        L2b:
            int r1 = r0 >> 5
            r2 = -2
            r3 = 2
            r4 = 128(0x80, float:1.8E-43)
            r5 = 1
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != r2) goto L62
            int r1 = r12 + 1
            if (r13 > r1) goto L47
        L3b:
            char r0 = (char) r6
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L45:
            r3 = r5
            goto L60
        L47:
            r1 = r11[r1]
            r2 = r1 & 192(0xc0, float:2.69E-43)
            if (r2 != r4) goto L3b
            r1 = r1 ^ 3968(0xf80, float:5.56E-42)
            int r0 = r0 << 6
            r0 = r0 ^ r1
            if (r0 >= r4) goto L56
            char r0 = (char) r6
            goto L57
        L56:
            char r0 = (char) r0
        L57:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L60:
            int r12 = r12 + r3
            goto La
        L62:
            int r1 = r0 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            r9 = 3
            if (r1 != r2) goto Lcd
            int r1 = r12 + 2
            if (r13 > r1) goto L86
            char r0 = (char) r6
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            int r0 = r12 + 1
            if (r13 <= r0) goto L45
            r0 = r11[r0]
            r0 = r0 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L45
            goto L60
        L86:
            int r2 = r12 + 1
            r2 = r11[r2]
            r10 = r2 & 192(0xc0, float:2.69E-43)
            if (r10 != r4) goto Lc1
            r1 = r11[r1]
            r5 = r1 & 192(0xc0, float:2.69E-43)
            if (r5 != r4) goto Lb6
            r3 = -123008(0xfffffffffffe1f80, float:NaN)
            r1 = r1 ^ r3
            int r2 = r2 << 6
            r1 = r1 ^ r2
            int r0 = r0 << 12
            r0 = r0 ^ r1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto Lad
        La2:
            char r0 = (char) r6
        La3:
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto Lb4
        Lad:
            if (r8 > r0) goto Lb2
            if (r0 >= r7) goto Lb2
            goto La2
        Lb2:
            char r0 = (char) r0
            goto La3
        Lb4:
            r3 = r9
            goto L60
        Lb6:
            char r0 = (char) r6
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L60
        Lc1:
            char r0 = (char) r6
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L45
        Lcd:
            int r1 = r0 >> 3
            if (r1 != r2) goto L171
            int r1 = r12 + 3
            if (r13 > r1) goto Lf3
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            int r0 = r12 + 1
            if (r13 <= r0) goto L45
            r0 = r11[r0]
            r0 = r0 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L45
            int r0 = r12 + 2
            if (r13 <= r0) goto L60
            r0 = r11[r0]
            r0 = r0 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L60
        Lf2:
            goto Lb4
        Lf3:
            int r2 = r12 + 1
            r2 = r11[r2]
            r10 = r2 & 192(0xc0, float:2.69E-43)
            if (r10 != r4) goto L166
            int r5 = r12 + 2
            r5 = r11[r5]
            r10 = r5 & 192(0xc0, float:2.69E-43)
            if (r10 != r4) goto L15b
            r1 = r11[r1]
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L151
            r3 = 3678080(0x381f80, float:5.154088E-39)
            r1 = r1 ^ r3
            int r3 = r5 << 6
            r1 = r1 ^ r3
            int r2 = r2 << 12
            r1 = r1 ^ r2
            int r0 = r0 << 18
            r0 = r0 ^ r1
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r0 <= r1) goto L125
        L11b:
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r14.invoke(r0)
        L122:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L14e
        L125:
            if (r8 > r0) goto L12a
            if (r0 >= r7) goto L12a
            goto L11b
        L12a:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 >= r1) goto L12f
            goto L11b
        L12f:
            if (r0 == r6) goto L11b
            int r1 = r0 >>> 10
            r2 = 55232(0xd7c0, float:7.7397E-41)
            int r1 = r1 + r2
            char r1 = (char) r1
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r14.invoke(r1)
            r0 = r0 & 1023(0x3ff, float:1.434E-42)
            r1 = 56320(0xdc00, float:7.8921E-41)
            int r0 = r0 + r1
            char r0 = (char) r0
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            r14.invoke(r0)
            goto L122
        L14e:
            r3 = 4
            goto L60
        L151:
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto Lf2
        L15b:
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L60
        L166:
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L45
        L171:
            java.lang.Character r0 = java.lang.Character.valueOf(r6)
            r14.invoke(r0)
            int r12 = r12 + 1
            goto La
        L17c:
            return
    }

    public static final void processUtf8Bytes(java.lang.String r7, int r8, int r9, kotlin.jvm.functions.Function1<? super java.lang.Byte, kotlin.Unit> r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
        La:
            if (r8 >= r9) goto Lee
            char r0 = r7.charAt(r8)
            r1 = 128(0x80, float:1.8E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r2 >= 0) goto L3e
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 1
        L22:
            if (r8 >= r9) goto La
            char r0 = r7.charAt(r8)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 >= 0) goto La
            int r0 = r8 + 1
            char r8 = r7.charAt(r8)
            byte r8 = (byte) r8
            java.lang.Byte r8 = java.lang.Byte.valueOf(r8)
            r10.invoke(r8)
            r8 = r0
            goto L22
        L3e:
            r2 = 2048(0x800, float:2.87E-42)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            if (r2 >= 0) goto L60
            int r2 = r0 >> 6
            r2 = r2 | 192(0xc0, float:2.69E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
        L5d:
            int r8 = r8 + 1
            goto La
        L60:
            r2 = 55296(0xd800, float:7.7486E-41)
            r3 = 63
            if (r2 > r0) goto Lc9
            r2 = 57344(0xe000, float:8.0356E-41)
            if (r0 >= r2) goto Lc9
            r4 = 56319(0xdbff, float:7.892E-41)
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r0, r4)
            if (r4 > 0) goto Lc1
            int r4 = r8 + 1
            if (r9 <= r4) goto Lc1
            char r5 = r7.charAt(r4)
            r6 = 56320(0xdc00, float:7.8921E-41)
            if (r6 > r5) goto Lc1
            if (r5 >= r2) goto Lc1
            int r0 = r0 << 10
            char r2 = r7.charAt(r4)
            int r0 = r0 + r2
            r2 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r0 = r0 + r2
            int r2 = r0 >> 18
            r2 = r2 | 240(0xf0, float:3.36E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 12
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 6
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & r3
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            int r8 = r8 + 2
            goto La
        Lc1:
            java.lang.Byte r0 = java.lang.Byte.valueOf(r3)
            r10.invoke(r0)
            goto L5d
        Lc9:
            int r2 = r0 >> 12
            r2 = r2 | 224(0xe0, float:3.14E-43)
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            int r2 = r0 >> 6
            r2 = r2 & r3
            r2 = r2 | r1
            byte r2 = (byte) r2
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            r10.invoke(r2)
            r0 = r0 & 63
            r0 = r0 | r1
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r10.invoke(r0)
            goto L5d
        Lee:
            return
    }

    public static final void processUtf8CodePoints(byte[] r11, int r12, int r13, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r14) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "yield"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
        La:
            if (r12 >= r13) goto L160
            r0 = r11[r12]
            if (r0 < 0) goto L29
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.invoke(r0)
            int r12 = r12 + 1
        L19:
            if (r12 >= r13) goto La
            r0 = r11[r12]
            if (r0 < 0) goto La
            int r12 = r12 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r14.invoke(r0)
            goto L19
        L29:
            int r1 = r0 >> 5
            r2 = -2
            r3 = 2
            r4 = 128(0x80, float:1.8E-43)
            r5 = 1
            r6 = 65533(0xfffd, float:9.1831E-41)
            if (r1 != r2) goto L61
            int r1 = r12 + 1
            if (r13 > r1) goto L44
        L39:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L42:
            r3 = r5
            goto L5f
        L44:
            r1 = r11[r1]
            r2 = r1 & 192(0xc0, float:2.69E-43)
            if (r2 != r4) goto L39
            r1 = r1 ^ 3968(0xf80, float:5.56E-42)
            int r0 = r0 << 6
            r0 = r0 ^ r1
            if (r0 >= r4) goto L56
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L5a
        L56:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L5a:
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L5f:
            int r12 = r12 + r3
            goto La
        L61:
            int r1 = r0 >> 4
            r7 = 57344(0xe000, float:8.0356E-41)
            r8 = 55296(0xd800, float:7.7486E-41)
            r9 = 3
            if (r1 != r2) goto Lcb
            int r1 = r12 + 2
            if (r13 > r1) goto L84
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            int r0 = r12 + 1
            if (r13 <= r0) goto L42
            r0 = r11[r0]
            r0 = r0 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L42
            goto L5f
        L84:
            int r2 = r12 + 1
            r2 = r11[r2]
            r10 = r2 & 192(0xc0, float:2.69E-43)
            if (r10 != r4) goto Lc0
            r1 = r11[r1]
            r5 = r1 & 192(0xc0, float:2.69E-43)
            if (r5 != r4) goto Lb6
            r3 = -123008(0xfffffffffffe1f80, float:NaN)
            r1 = r1 ^ r3
            int r2 = r2 << 6
            r1 = r1 ^ r2
            int r0 = r0 << 12
            r0 = r0 ^ r1
            r1 = 2048(0x800, float:2.87E-42)
            if (r0 >= r1) goto Laa
        La0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        La4:
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto Lb4
        Laa:
            if (r8 > r0) goto Laf
            if (r0 >= r7) goto Laf
            goto La0
        Laf:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto La4
        Lb4:
            r3 = r9
            goto L5f
        Lb6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L5f
        Lc0:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L42
        Lcb:
            int r1 = r0 >> 3
            if (r1 != r2) goto L155
            int r1 = r12 + 3
            if (r13 > r1) goto Lf1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            int r0 = r12 + 1
            if (r13 <= r0) goto L42
            r0 = r11[r0]
            r0 = r0 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L42
            int r0 = r12 + 2
            if (r13 <= r0) goto L5f
            r0 = r11[r0]
            r0 = r0 & 192(0xc0, float:2.69E-43)
            if (r0 != r4) goto L5f
        Lf0:
            goto Lb4
        Lf1:
            int r2 = r12 + 1
            r2 = r11[r2]
            r10 = r2 & 192(0xc0, float:2.69E-43)
            if (r10 != r4) goto L14a
            int r5 = r12 + 2
            r5 = r11[r5]
            r10 = r5 & 192(0xc0, float:2.69E-43)
            if (r10 != r4) goto L13f
            r1 = r11[r1]
            r3 = r1 & 192(0xc0, float:2.69E-43)
            if (r3 != r4) goto L135
            r3 = 3678080(0x381f80, float:5.154088E-39)
            r1 = r1 ^ r3
            int r3 = r5 << 6
            r1 = r1 ^ r3
            int r2 = r2 << 12
            r1 = r1 ^ r2
            int r0 = r0 << 18
            r0 = r0 ^ r1
            r1 = 1114111(0x10ffff, float:1.561202E-39)
            if (r0 <= r1) goto L123
        L119:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L11d:
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L132
        L123:
            if (r8 > r0) goto L128
            if (r0 >= r7) goto L128
            goto L119
        L128:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 >= r1) goto L12d
            goto L119
        L12d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L11d
        L132:
            r3 = 4
            goto L5f
        L135:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto Lf0
        L13f:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L5f
        L14a:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            goto L42
        L155:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r14.invoke(r0)
            int r12 = r12 + 1
            goto La
        L160:
            return
    }

    public static final long size(java.lang.String r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 3
            r1 = 0
            r2 = 0
            long r0 = size$default(r3, r2, r2, r0, r1)
            return r0
    }

    public static final long size(java.lang.String r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 2
            r1 = 0
            r2 = 0
            long r3 = size$default(r3, r4, r2, r0, r1)
            return r3
    }

    public static final long size(java.lang.String r9, int r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            if (r10 < 0) goto La1
            if (r11 < r10) goto L7e
            int r0 = r9.length()
            if (r11 > r0) goto L57
            r0 = 0
        L11:
            if (r10 >= r11) goto L56
            char r2 = r9.charAt(r10)
            r3 = 128(0x80, float:1.8E-43)
            r4 = 1
            if (r2 >= r3) goto L21
            long r0 = r0 + r4
        L1e:
            int r10 = r10 + 1
            goto L11
        L21:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L29
            r2 = 2
        L26:
            long r2 = (long) r2
            long r0 = r0 + r2
            goto L1e
        L29:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L54
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 <= r3) goto L34
            goto L54
        L34:
            int r6 = r10 + 1
            if (r6 >= r11) goto L3d
            char r7 = r9.charAt(r6)
            goto L3e
        L3d:
            r7 = 0
        L3e:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r2 > r8) goto L51
            r2 = 56320(0xdc00, float:7.8921E-41)
            if (r7 < r2) goto L51
            if (r7 <= r3) goto L4b
            goto L51
        L4b:
            r2 = 4
            long r2 = (long) r2
            long r0 = r0 + r2
            int r10 = r10 + 2
            goto L11
        L51:
            long r0 = r0 + r4
            r10 = r6
            goto L11
        L54:
            r2 = 3
            goto L26
        L56:
            return r0
        L57:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "endIndex > string.length: "
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.String r11 = " > "
            java.lang.StringBuilder r10 = r10.append(r11)
            int r9 = r9.length()
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L7e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "endIndex < beginIndex: "
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.String r11 = " < "
            java.lang.StringBuilder r9 = r9.append(r11)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        La1:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "beginIndex < 0: "
            r9.<init>(r11)
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
    }

    public static /* synthetic */ long size$default(java.lang.String r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            long r0 = size(r0, r1, r2)
            return r0
    }
}
