package okio.internal;

/* JADX INFO: renamed from: okio.internal.-ByteString, reason: invalid class name */
/* JADX INFO: compiled from: ByteString.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0080\b\u001a\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H\u0002\u001a\r\u0010\u0011\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\fH\u0080\b\u001a-\u0010\u0016\u001a\u00020\u0017*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u000f\u0010\u001c\u001a\u0004\u0018\u00010\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0012H\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0080\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0080\b\u001a\u0017\u0010\"\u001a\u00020 *\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010#H\u0080\b\u001a\u0015\u0010$\u001a\u00020%*\u00020\f2\u0006\u0010&\u001a\u00020\u0007H\u0080\b\u001a\r\u0010'\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010(\u001a\u00020\u0007*\u00020\fH\u0080\b\u001a\r\u0010)\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\u001d\u0010*\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\r\u0010,\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a\u001d\u0010-\u001a\u00020\u0007*\u00020\f2\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a-\u0010.\u001a\u00020 *\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010/\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\tH\u0080\b\u001a\u0015\u00100\u001a\u00020 *\u00020\f2\u0006\u00101\u001a\u00020\fH\u0080\b\u001a\u001d\u00102\u001a\u00020\f*\u00020\f2\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u0007H\u0080\b\u001a\r\u00105\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00106\u001a\u00020\f*\u00020\fH\u0080\b\u001a\r\u00107\u001a\u00020\t*\u00020\fH\u0080\b\u001a\u001d\u00108\u001a\u00020\f*\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0080\b\u001a\r\u00109\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a\r\u0010:\u001a\u00020\u0012*\u00020\fH\u0080\b\u001a$\u0010;\u001a\u00020\u0017*\u00020\f2\u0006\u0010<\u001a\u00020=2\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0000\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005¨\u0006>"}, d2 = {"HEX_DIGIT_CHARS", "", "getHEX_DIGIT_CHARS$annotations", "()V", "getHEX_DIGIT_CHARS", "()[C", "codePointIndexToCharIndex", "", "s", "", "codePointCount", "commonOf", "Lokio/ByteString;", "data", "decodeHexDigit", "c", "", "commonBase64", "", "commonBase64Url", "commonCompareTo", "other", "commonCopyInto", "", "offset", "target", "targetOffset", "byteCount", "commonDecodeBase64", "commonDecodeHex", "commonEncodeUtf8", "commonEndsWith", "", "suffix", "commonEquals", "", "commonGetByte", "", "pos", "commonGetSize", "commonHashCode", "commonHex", "commonIndexOf", "fromIndex", "commonInternalArray", "commonLastIndexOf", "commonRangeEquals", "otherOffset", "commonStartsWith", "prefix", "commonSubstring", "beginIndex", "endIndex", "commonToAsciiLowercase", "commonToAsciiUppercase", "commonToByteArray", "commonToByteString", "commonToString", "commonUtf8", "commonWrite", "buffer", "Lokio/Buffer;", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ByteString {
    private static final char[] HEX_DIGIT_CHARS = null;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            okio.internal.ByteString.HEX_DIGIT_CHARS = r0
            return
    }

    public static final /* synthetic */ int access$codePointIndexToCharIndex(byte[] r0, int r1) {
            int r0 = codePointIndexToCharIndex(r0, r1)
            return r0
    }

    public static final /* synthetic */ int access$decodeHexDigit(char r0) {
            int r0 = decodeHexDigit(r0)
            return r0
    }

    private static final int codePointIndexToCharIndex(byte[] r18, int r19) {
            r0 = r18
            r1 = r19
            int r2 = r0.length
            r3 = 0
            r4 = r3
            r5 = r4
        L8:
            if (r3 >= r2) goto L19f
            r6 = r0[r3]
            r7 = 160(0xa0, float:2.24E-43)
            r8 = 127(0x7f, float:1.78E-43)
            r9 = 32
            r10 = 13
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 10
            r13 = 65536(0x10000, float:9.1835E-41)
            r16 = -1
            if (r6 < 0) goto L64
            int r17 = r5 + 1
            if (r5 != r1) goto L24
            return r4
        L24:
            if (r6 == r12) goto L32
            if (r6 == r10) goto L32
            if (r6 < 0) goto L2d
            if (r6 >= r9) goto L2d
            goto L34
        L2d:
            if (r8 > r6) goto L32
            if (r6 >= r7) goto L32
            goto L34
        L32:
            if (r6 != r11) goto L35
        L34:
            return r16
        L35:
            if (r6 >= r13) goto L39
            r5 = 1
            goto L3a
        L39:
            r5 = 2
        L3a:
            int r4 = r4 + r5
            int r3 = r3 + 1
        L3d:
            r5 = r17
            if (r3 >= r2) goto L8
            r6 = r0[r3]
            if (r6 < 0) goto L8
            int r3 = r3 + 1
            int r17 = r5 + 1
            if (r5 != r1) goto L4c
            return r4
        L4c:
            if (r6 == r12) goto L5a
            if (r6 == r10) goto L5a
            if (r6 < 0) goto L55
            if (r6 >= r9) goto L55
            goto L5c
        L55:
            if (r8 > r6) goto L5a
            if (r6 >= r7) goto L5a
            goto L5c
        L5a:
            if (r6 != r11) goto L5d
        L5c:
            return r16
        L5d:
            if (r6 >= r13) goto L61
            r5 = 1
            goto L62
        L61:
            r5 = 2
        L62:
            int r4 = r4 + r5
            goto L3d
        L64:
            int r14 = r6 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.8E-43)
            if (r14 != r15) goto Lad
            int r14 = r3 + 1
            if (r2 > r14) goto L73
            if (r5 != r1) goto L72
            return r4
        L72:
            return r16
        L73:
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto La9
            r14 = r14 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r14
            if (r6 >= r13) goto L84
            if (r5 != r1) goto L83
            return r4
        L83:
            return r16
        L84:
            int r13 = r5 + 1
            if (r5 != r1) goto L89
            return r4
        L89:
            if (r6 == r12) goto L97
            if (r6 == r10) goto L97
            if (r6 < 0) goto L92
            if (r6 >= r9) goto L92
            goto L99
        L92:
            if (r8 > r6) goto L97
            if (r6 >= r7) goto L97
            goto L99
        L97:
            if (r6 != r11) goto L9a
        L99:
            return r16
        L9a:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto La0
            r14 = 1
            goto La1
        La0:
            r14 = 2
        La1:
            int r4 = r4 + r14
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r3 = r3 + 2
            r5 = r13
            goto L8
        La9:
            if (r5 != r1) goto Lac
            return r4
        Lac:
            return r16
        Lad:
            int r14 = r6 >> 4
            r11 = 57344(0xe000, float:8.0356E-41)
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r14 != r15) goto L11b
            int r14 = r3 + 2
            if (r2 > r14) goto Lbf
            if (r5 != r1) goto Lbe
            return r4
        Lbe:
            return r16
        Lbf:
            int r15 = r3 + 1
            r15 = r0[r15]
            r8 = r15 & 192(0xc0, float:2.69E-43)
            if (r8 != r13) goto L117
            r8 = r0[r14]
            r14 = r8 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L113
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r8 = r8 ^ r13
            int r13 = r15 << 6
            r8 = r8 ^ r13
            int r6 = r6 << 12
            r6 = r6 ^ r8
            r8 = 2048(0x800, float:2.87E-42)
            if (r6 >= r8) goto Ldf
            if (r5 != r1) goto Lde
            return r4
        Lde:
            return r16
        Ldf:
            if (r7 > r6) goto Le7
            if (r6 >= r11) goto Le7
            if (r5 != r1) goto Le6
            return r4
        Le6:
            return r16
        Le7:
            int r7 = r5 + 1
            if (r5 != r1) goto Lec
            return r4
        Lec:
            if (r6 == r12) goto Lfe
            if (r6 == r10) goto Lfe
            if (r6 < 0) goto Lf5
            if (r6 >= r9) goto Lf5
            goto L103
        Lf5:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto Lfe
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto Lfe
            goto L103
        Lfe:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L104
        L103:
            return r16
        L104:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L10a
            r14 = 1
            goto L10b
        L10a:
            r14 = 2
        L10b:
            int r4 = r4 + r14
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r3 = r3 + 3
        L110:
            r5 = r7
            goto L8
        L113:
            if (r5 != r1) goto L116
            return r4
        L116:
            return r16
        L117:
            if (r5 != r1) goto L11a
            return r4
        L11a:
            return r16
        L11b:
            int r8 = r6 >> 3
            if (r8 != r15) goto L19b
            int r8 = r3 + 3
            if (r2 > r8) goto L127
            if (r5 != r1) goto L126
            return r4
        L126:
            return r16
        L127:
            int r14 = r3 + 1
            r14 = r0[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L197
            int r15 = r3 + 2
            r15 = r0[r15]
            r9 = r15 & 192(0xc0, float:2.69E-43)
            if (r9 != r13) goto L193
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r13) goto L18f
            r9 = 3678080(0x381f80, float:5.154088E-39)
            r8 = r8 ^ r9
            int r9 = r15 << 6
            r8 = r8 ^ r9
            int r9 = r14 << 12
            r8 = r8 ^ r9
            int r6 = r6 << 18
            r6 = r6 ^ r8
            r8 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r8) goto L153
            if (r5 != r1) goto L152
            return r4
        L152:
            return r16
        L153:
            if (r7 > r6) goto L15b
            if (r6 >= r11) goto L15b
            if (r5 != r1) goto L15a
            return r4
        L15a:
            return r16
        L15b:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L163
            if (r5 != r1) goto L162
            return r4
        L162:
            return r16
        L163:
            int r7 = r5 + 1
            if (r5 != r1) goto L168
            return r4
        L168:
            if (r6 == r12) goto L17c
            if (r6 == r10) goto L17c
            if (r6 < 0) goto L173
            r5 = 32
            if (r6 >= r5) goto L173
            goto L181
        L173:
            r5 = 127(0x7f, float:1.78E-43)
            if (r5 > r6) goto L17c
            r5 = 160(0xa0, float:2.24E-43)
            if (r6 >= r5) goto L17c
            goto L181
        L17c:
            r5 = 65533(0xfffd, float:9.1831E-41)
            if (r6 != r5) goto L182
        L181:
            return r16
        L182:
            r5 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r5) goto L188
            r14 = 1
            goto L189
        L188:
            r14 = 2
        L189:
            int r4 = r4 + r14
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r3 = r3 + 4
            goto L110
        L18f:
            if (r5 != r1) goto L192
            return r4
        L192:
            return r16
        L193:
            if (r5 != r1) goto L196
            return r4
        L196:
            return r16
        L197:
            if (r5 != r1) goto L19a
            return r4
        L19a:
            return r16
        L19b:
            if (r5 != r1) goto L19e
            return r4
        L19e:
            return r16
        L19f:
            return r4
    }

    public static final java.lang.String commonBase64(okio.ByteString r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r2.getData$okio()
            r0 = 0
            r1 = 1
            java.lang.String r2 = okio.Base64.encodeBase64$default(r2, r0, r1, r0)
            return r2
    }

    public static final java.lang.String commonBase64Url(okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            byte[] r0 = okio.Base64.getBASE64_URL_SAFE()
            java.lang.String r1 = okio.Base64.encodeBase64(r1, r0)
            return r1
    }

    public static final int commonCompareTo(okio.ByteString r9, okio.ByteString r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L18:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L32
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L2d
            int r4 = r4 + 1
            goto L18
        L2d:
            if (r7 >= r8) goto L30
            goto L31
        L30:
            r5 = r6
        L31:
            return r5
        L32:
            if (r0 != r1) goto L35
            return r3
        L35:
            if (r0 >= r1) goto L38
            goto L39
        L38:
            r5 = r6
        L39:
            return r5
    }

    public static final void commonCopyInto(okio.ByteString r1, int r2, byte[] r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r1 = r1.getData$okio()
            int r5 = r5 + r2
            kotlin.collections.ArraysKt.copyInto(r1, r3, r4, r2, r5)
            return
    }

    public static final okio.ByteString commonDecodeBase64(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = okio.Base64.decodeBase64ToArray(r1)
            if (r1 == 0) goto L11
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r1)
            goto L12
        L11:
            r0 = 0
        L12:
            return r0
    }

    public static final okio.ByteString commonDecodeHex(java.lang.String r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L3b
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L16:
            if (r2 >= r0) goto L35
            int r3 = r2 * 2
            char r4 = r5.charAt(r3)
            int r4 = access$decodeHexDigit(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = access$decodeHexDigit(r3)
            int r4 = r4 + r3
            byte r3 = (byte) r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L16
        L35:
            okio.ByteString r5 = new okio.ByteString
            r5.<init>(r1)
            return r5
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected hex string: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
    }

    public static final okio.ByteString commonEncodeUtf8(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = okio._JvmPlatformKt.asUtf8ToByteArray(r2)
            r0.<init>(r1)
            r0.setUtf8$okio(r2)
            return r0
    }

    public static final boolean commonEndsWith(okio.ByteString r3, okio.ByteString r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.size()
            boolean r3 = r3.rangeEquals(r0, r4, r1, r2)
            return r3
    }

    public static final boolean commonEndsWith(okio.ByteString r3, byte[] r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "suffix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.length
            boolean r3 = r3.rangeEquals(r0, r4, r1, r2)
            return r3
    }

    public static final boolean commonEquals(okio.ByteString r4, java.lang.Object r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 1
            if (r5 != r4) goto L9
            goto L2c
        L9:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L2b
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            byte[] r3 = r4.getData$okio()
            int r3 = r3.length
            if (r1 != r3) goto L2b
            byte[] r1 = r4.getData$okio()
            byte[] r4 = r4.getData$okio()
            int r4 = r4.length
            boolean r4 = r5.rangeEquals(r2, r1, r2, r4)
            if (r4 == 0) goto L2b
            goto L2c
        L2b:
            r0 = r2
        L2c:
            return r0
    }

    public static final byte commonGetByte(okio.ByteString r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            r1 = r1[r2]
            return r1
    }

    public static final int commonGetSize(okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            int r1 = r1.length
            return r1
    }

    public static final int commonHashCode(okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r0 = r1.getHashCode$okio()
            if (r0 == 0) goto Lc
            return r0
        Lc:
            byte[] r0 = r1.getData$okio()
            int r0 = java.util.Arrays.hashCode(r0)
            r1.setHashCode$okio(r0)
            return r0
    }

    public static final java.lang.String commonHex(okio.ByteString r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            byte[] r0 = r8.getData$okio()
            int r0 = r0.length
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            byte[] r8 = r8.getData$okio()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        L15:
            if (r2 >= r1) goto L36
            r4 = r8[r2]
            int r5 = r3 + 1
            char[] r6 = getHEX_DIGIT_CHARS()
            int r7 = r4 >> 4
            r7 = r7 & 15
            char r6 = r6[r7]
            r0[r3] = r6
            int r3 = r3 + 2
            char[] r6 = getHEX_DIGIT_CHARS()
            r4 = r4 & 15
            char r4 = r6[r4]
            r0[r5] = r4
            int r2 = r2 + 1
            goto L15
        L36:
            java.lang.String r8 = kotlin.text.StringsKt.concatToString(r0)
            return r8
    }

    public static final int commonIndexOf(okio.ByteString r4, byte[] r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            byte[] r0 = r4.getData$okio()
            int r0 = r0.length
            int r1 = r5.length
            int r0 = r0 - r1
            r1 = 0
            int r6 = java.lang.Math.max(r6, r1)
            if (r6 > r0) goto L29
        L18:
            byte[] r2 = r4.getData$okio()
            int r3 = r5.length
            boolean r2 = okio.SegmentedByteString.arrayRangeEquals(r2, r6, r5, r1, r3)
            if (r2 == 0) goto L24
            return r6
        L24:
            if (r6 == r0) goto L29
            int r6 = r6 + 1
            goto L18
        L29:
            r4 = -1
            return r4
    }

    public static final byte[] commonInternalArray(okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            return r1
    }

    public static final int commonLastIndexOf(okio.ByteString r1, okio.ByteString r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r2 = r2.internalArray$okio()
            int r1 = r1.lastIndexOf(r2, r3)
            return r1
    }

    public static final int commonLastIndexOf(okio.ByteString r3, byte[] r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r5 = okio.SegmentedByteString.resolveDefaultParameter(r3, r5)
            byte[] r0 = r3.getData$okio()
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L19:
            r0 = -1
            if (r0 >= r5) goto L2c
            byte[] r0 = r3.getData$okio()
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.SegmentedByteString.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L29
            return r5
        L29:
            int r5 = r5 + (-1)
            goto L19
        L2c:
            return r0
    }

    public static final okio.ByteString commonOf(byte[] r2) {
            java.lang.String r0 = "data"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.ByteString r0 = new okio.ByteString
            int r1 = r2.length
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r1 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            r0.<init>(r2)
            return r0
    }

    public static final boolean commonRangeEquals(okio.ByteString r1, int r2, okio.ByteString r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            byte[] r1 = r1.getData$okio()
            boolean r1 = r3.rangeEquals(r4, r1, r2, r5)
            return r1
    }

    public static final boolean commonRangeEquals(okio.ByteString r1, int r2, byte[] r3, int r4, int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 < 0) goto L26
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            int r0 = r0 - r5
            if (r2 > r0) goto L26
            if (r4 < 0) goto L26
            int r0 = r3.length
            int r0 = r0 - r5
            if (r4 > r0) goto L26
            byte[] r1 = r1.getData$okio()
            boolean r1 = okio.SegmentedByteString.arrayRangeEquals(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L26
            r1 = 1
            goto L27
        L26:
            r1 = 0
        L27:
            return r1
    }

    public static final boolean commonStartsWith(okio.ByteString r2, okio.ByteString r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.size()
            boolean r2 = r2.rangeEquals(r0, r3, r0, r1)
            return r2
    }

    public static final boolean commonStartsWith(okio.ByteString r2, byte[] r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "prefix"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r3.length
            boolean r2 = r2.rangeEquals(r0, r3, r0, r1)
            return r2
    }

    public static final okio.ByteString commonSubstring(okio.ByteString r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r3 = okio.SegmentedByteString.resolveDefaultParameter(r1, r3)
            if (r2 < 0) goto L5e
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            if (r3 > r0) goto L3a
            int r0 = r3 - r2
            if (r0 < 0) goto L2e
            if (r2 != 0) goto L20
            byte[] r0 = r1.getData$okio()
            int r0 = r0.length
            if (r3 != r0) goto L20
            return r1
        L20:
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r1.getData$okio()
            byte[] r1 = kotlin.collections.ArraysKt.copyOfRange(r1, r2, r3)
            r0.<init>(r1)
            return r0
        L2e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "endIndex < beginIndex"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "endIndex > length("
            r2.<init>(r3)
            byte[] r1 = r1.getData$okio()
            int r1 = r1.length
            java.lang.StringBuilder r1 = r2.append(r1)
            r2 = 41
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L5e:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "beginIndex < 0"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    public static final okio.ByteString commonToAsciiLowercase(okio.ByteString r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L4c
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 65
            if (r1 < r2) goto L49
            r3 = 90
            if (r1 <= r3) goto L1c
            goto L49
        L1c:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + 32
            byte r1 = (byte) r1
            r5[r0] = r1
        L31:
            int r0 = r5.length
            if (r4 >= r0) goto L43
            r0 = r5[r4]
            if (r0 < r2) goto L40
            if (r0 <= r3) goto L3b
            goto L40
        L3b:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r5[r4] = r0
        L40:
            int r4 = r4 + 1
            goto L31
        L43:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L49:
            int r0 = r0 + 1
            goto L6
        L4c:
            return r5
    }

    public static final okio.ByteString commonToAsciiUppercase(okio.ByteString r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
        L6:
            byte[] r1 = r5.getData$okio()
            int r1 = r1.length
            if (r0 >= r1) goto L4c
            byte[] r1 = r5.getData$okio()
            r1 = r1[r0]
            r2 = 97
            if (r1 < r2) goto L49
            r3 = 122(0x7a, float:1.71E-43)
            if (r1 <= r3) goto L1c
            goto L49
        L1c:
            byte[] r5 = r5.getData$okio()
            int r4 = r5.length
            byte[] r5 = java.util.Arrays.copyOf(r5, r4)
            java.lang.String r4 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            int r4 = r0 + 1
            int r1 = r1 + (-32)
            byte r1 = (byte) r1
            r5[r0] = r1
        L31:
            int r0 = r5.length
            if (r4 >= r0) goto L43
            r0 = r5[r4]
            if (r0 < r2) goto L40
            if (r0 <= r3) goto L3b
            goto L40
        L3b:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r5[r4] = r0
        L40:
            int r4 = r4 + 1
            goto L31
        L43:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r5)
            return r0
        L49:
            int r0 = r0 + 1
            goto L6
        L4c:
            return r5
    }

    public static final byte[] commonToByteArray(okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            byte[] r1 = r1.getData$okio()
            int r0 = r1.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String r0 = "copyOf(this, size)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            return r1
    }

    public static final okio.ByteString commonToByteString(byte[] r7, int r8, int r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r9 = okio.SegmentedByteString.resolveDefaultParameter(r7, r9)
            int r0 = r7.length
            long r1 = (long) r0
            long r3 = (long) r8
            long r5 = (long) r9
            okio.SegmentedByteString.checkOffsetAndCount(r1, r3, r5)
            okio.ByteString r0 = new okio.ByteString
            int r9 = r9 + r8
            byte[] r7 = kotlin.collections.ArraysKt.copyOfRange(r7, r8, r9)
            r0.<init>(r7)
            return r0
    }

    public static final java.lang.String commonToString(okio.ByteString r20) {
            r0 = r20
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            byte[] r1 = r20.getData$okio()
            int r1 = r1.length
            if (r1 != 0) goto L11
            java.lang.String r0 = "[size=0]"
            return r0
        L11:
            byte[] r1 = r20.getData$okio()
            r2 = 64
            int r1 = access$codePointIndexToCharIndex(r1, r2)
            r3 = -1
            java.lang.String r4 = "…]"
            java.lang.String r5 = "[size="
            r6 = 93
            r7 = 0
            if (r1 != r3) goto Lbc
            byte[] r1 = r20.getData$okio()
            int r1 = r1.length
            if (r1 > r2) goto L44
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[hex="
            r1.<init>(r2)
            java.lang.String r0 = r20.hex()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L8b
        L44:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            byte[] r3 = r20.getData$okio()
            int r3 = r3.length
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " hex="
            java.lang.StringBuilder r1 = r1.append(r3)
            int r2 = okio.SegmentedByteString.resolveDefaultParameter(r0, r2)
            byte[] r3 = r20.getData$okio()
            int r3 = r3.length
            if (r2 > r3) goto L98
            if (r2 < 0) goto L8c
            byte[] r3 = r20.getData$okio()
            int r3 = r3.length
            if (r2 != r3) goto L6d
            goto L7b
        L6d:
            okio.ByteString r3 = new okio.ByteString
            byte[] r0 = r20.getData$okio()
            byte[] r0 = kotlin.collections.ArraysKt.copyOfRange(r0, r7, r2)
            r3.<init>(r0)
            r0 = r3
        L7b:
            java.lang.String r0 = r0.hex()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
        L8b:
            return r0
        L8c:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "endIndex < beginIndex"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "endIndex > length("
            r1.<init>(r2)
            byte[] r0 = r20.getData$okio()
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lbc:
            java.lang.String r2 = r20.utf8()
            java.lang.String r8 = r2.substring(r7, r1)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)
            r12 = 4
            r13 = 0
            java.lang.String r9 = "\\"
            java.lang.String r10 = "\\\\"
            r11 = 0
            java.lang.String r14 = kotlin.text.StringsKt.replace$default(r8, r9, r10, r11, r12, r13)
            r18 = 4
            r19 = 0
            java.lang.String r15 = "\n"
            java.lang.String r16 = "\\n"
            r17 = 0
            java.lang.String r7 = kotlin.text.StringsKt.replace$default(r14, r15, r16, r17, r18, r19)
            r11 = 4
            r12 = 0
            java.lang.String r8 = "\r"
            java.lang.String r9 = "\\r"
            r10 = 0
            java.lang.String r3 = kotlin.text.StringsKt.replace$default(r7, r8, r9, r10, r11, r12)
            int r2 = r2.length()
            if (r1 >= r2) goto L114
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            byte[] r0 = r20.getData$okio()
            int r0 = r0.length
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " text="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L127
        L114:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[text="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
        L127:
            return r0
    }

    public static final java.lang.String commonUtf8(okio.ByteString r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = r1.getUtf8$okio()
            if (r0 != 0) goto L16
            byte[] r0 = r1.internalArray$okio()
            java.lang.String r0 = okio._JvmPlatformKt.toUtf8String(r0)
            r1.setUtf8$okio(r0)
        L16:
            return r0
    }

    public static final void commonWrite(okio.ByteString r1, okio.Buffer r2, int r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            byte[] r1 = r1.getData$okio()
            r2.write(r1, r3, r4)
            return
    }

    private static final int decodeHexDigit(char r3) {
            r0 = 48
            if (r0 > r3) goto La
            r1 = 58
            if (r3 >= r1) goto La
            int r3 = r3 - r0
            goto L1f
        La:
            r0 = 97
            if (r0 > r3) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r3 >= r0) goto L15
            int r3 = r3 + (-87)
            goto L1f
        L15:
            r0 = 65
            if (r0 > r3) goto L20
            r0 = 71
            if (r3 >= r0) goto L20
            int r3 = r3 + (-55)
        L1f:
            return r3
        L20:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected hex digit: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final char[] getHEX_DIGIT_CHARS() {
            char[] r0 = okio.internal.ByteString.HEX_DIGIT_CHARS
            return r0
    }

    public static /* synthetic */ void getHEX_DIGIT_CHARS$annotations() {
            return
    }
}
