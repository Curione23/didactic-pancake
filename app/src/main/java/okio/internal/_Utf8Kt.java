package okio.internal;

/* JADX INFO: compiled from: -Utf8.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"commonAsUtf8ToByteArray", "", "", "commonToUtf8String", "beginIndex", "", "endIndex", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _Utf8Kt {
    public static final byte[] commonAsUtf8ToByteArray(java.lang.String r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            int r0 = r12.length()
            int r0 = r0 * 4
            byte[] r0 = new byte[r0]
            int r1 = r12.length()
            r2 = 0
        L12:
            java.lang.String r3 = "copyOf(this, newSize)"
            if (r2 >= r1) goto Lf8
            char r4 = r12.charAt(r2)
            r5 = 128(0x80, float:1.8E-43)
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r4, r5)
            if (r6 < 0) goto Lf1
            int r1 = r12.length()
            r4 = r2
        L27:
            if (r2 >= r1) goto Le9
            char r6 = r12.charAt(r2)
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r6, r5)
            if (r7 >= 0) goto L54
            byte r6 = (byte) r6
            int r7 = r4 + 1
            r0[r4] = r6
            int r2 = r2 + 1
        L3a:
            r4 = r7
            if (r2 >= r1) goto L27
            char r6 = r12.charAt(r2)
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r6, r5)
            if (r6 >= 0) goto L27
            int r6 = r2 + 1
            char r2 = r12.charAt(r2)
            byte r2 = (byte) r2
            int r7 = r4 + 1
            r0[r4] = r2
            r2 = r6
            goto L3a
        L54:
            r7 = 2048(0x800, float:2.87E-42)
            int r7 = kotlin.jvm.internal.Intrinsics.compare(r6, r7)
            if (r7 >= 0) goto L70
            int r7 = r6 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            int r8 = r4 + 1
            r0[r4] = r7
            r6 = r6 & 63
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 2
            r0[r8] = r6
        L6d:
            int r2 = r2 + 1
            goto L27
        L70:
            r7 = 55296(0xd800, float:7.7486E-41)
            r8 = 63
            if (r7 > r6) goto Lce
            r7 = 57344(0xe000, float:8.0356E-41)
            if (r6 >= r7) goto Lce
            r9 = 56319(0xdbff, float:7.892E-41)
            int r9 = kotlin.jvm.internal.Intrinsics.compare(r6, r9)
            if (r9 > 0) goto Lc5
            int r9 = r2 + 1
            if (r1 <= r9) goto Lc5
            char r10 = r12.charAt(r9)
            r11 = 56320(0xdc00, float:7.8921E-41)
            if (r11 > r10) goto Lc5
            if (r10 >= r7) goto Lc5
            int r6 = r6 << 10
            char r7 = r12.charAt(r9)
            int r6 = r6 + r7
            r7 = -56613888(0xfffffffffca02400, float:-6.651981E36)
            int r6 = r6 + r7
            int r7 = r6 >> 18
            r7 = r7 | 240(0xf0, float:3.36E-43)
            byte r7 = (byte) r7
            int r9 = r4 + 1
            r0[r4] = r7
            int r7 = r6 >> 12
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r10 = r4 + 2
            r0[r9] = r7
            int r7 = r6 >> 6
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r9 = r4 + 3
            r0[r10] = r7
            r6 = r6 & r8
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 4
            r0[r9] = r6
            int r2 = r2 + 2
            goto L27
        Lc5:
            int r6 = r4 + 1
            r0[r4] = r8
            int r2 = r2 + 1
            r4 = r6
            goto L27
        Lce:
            int r7 = r6 >> 12
            r7 = r7 | 224(0xe0, float:3.14E-43)
            byte r7 = (byte) r7
            int r9 = r4 + 1
            r0[r4] = r7
            int r7 = r6 >> 6
            r7 = r7 & r8
            r7 = r7 | r5
            byte r7 = (byte) r7
            int r8 = r4 + 2
            r0[r9] = r7
            r6 = r6 & 63
            r6 = r6 | r5
            byte r6 = (byte) r6
            int r4 = r4 + 3
            r0[r8] = r6
            goto L6d
        Le9:
            byte[] r12 = java.util.Arrays.copyOf(r0, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            return r12
        Lf1:
            byte r3 = (byte) r4
            r0[r2] = r3
            int r2 = r2 + 1
            goto L12
        Lf8:
            int r12 = r12.length()
            byte[] r12 = java.util.Arrays.copyOf(r0, r12)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r3)
            return r12
    }

    public static final java.lang.String commonToUtf8String(byte[] r16, int r17, int r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            if (r1 < 0) goto L18c
            int r3 = r0.length
            if (r2 > r3) goto L18c
            if (r1 > r2) goto L18c
            int r3 = r2 - r1
            char[] r3 = new char[r3]
            r4 = 0
            r5 = r4
        L18:
            if (r1 >= r2) goto L187
            r6 = r0[r1]
            if (r6 < 0) goto L34
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            int r1 = r1 + 1
        L25:
            r5 = r7
            if (r1 >= r2) goto L18
            r6 = r0[r1]
            if (r6 < 0) goto L18
            int r1 = r1 + 1
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto L25
        L34:
            int r7 = r6 >> 5
            r8 = -2
            r10 = 128(0x80, float:1.8E-43)
            r11 = 65533(0xfffd, float:9.1831E-41)
            r12 = 1
            if (r7 != r8) goto L72
            int r7 = r1 + 1
            if (r2 > r7) goto L4d
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        L48:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L4a:
            r5 = r7
        L4b:
            r9 = r12
            goto L70
        L4d:
            r7 = r0[r7]
            r8 = r7 & 192(0xc0, float:2.69E-43)
            if (r8 != r10) goto L6a
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r6 = r6 << 6
            r6 = r6 ^ r7
            if (r6 >= r10) goto L60
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L65
        L60:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
        L65:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
        L67:
            r5 = r7
        L68:
            r9 = 2
            goto L70
        L6a:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto L48
        L70:
            int r1 = r1 + r9
            goto L18
        L72:
            int r7 = r6 >> 4
            r13 = 57344(0xe000, float:8.0356E-41)
            r14 = 55296(0xd800, float:7.7486E-41)
            r15 = 3
            if (r7 != r8) goto Ldb
            int r7 = r1 + 2
            if (r2 > r7) goto L93
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r5 = r1 + 1
            if (r2 <= r5) goto L4a
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L4a
        L92:
            goto L67
        L93:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Ld2
            r7 = r0[r7]
            r9 = r7 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto Lca
            r9 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r9
            int r8 = r8 << 6
            r7 = r7 ^ r8
            int r6 = r6 << 12
            r6 = r6 ^ r7
            r7 = 2048(0x800, float:2.87E-42)
            if (r6 >= r7) goto Lb7
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
        Lb4:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto Lc7
        Lb7:
            if (r14 > r6) goto Lc1
            if (r6 >= r13) goto Lc1
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lb4
        Lc1:
            char r6 = (char) r6
            int r7 = r5 + 1
            r3[r5] = r6
            goto Lb4
        Lc7:
            r5 = r7
        Lc8:
            r9 = r15
            goto L70
        Lca:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L92
        Ld2:
            char r6 = (char) r11
            int r7 = r5 + 1
            r3[r5] = r6
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L4a
        Ldb:
            int r7 = r6 >> 3
            if (r7 != r8) goto L17e
            int r7 = r1 + 3
            if (r2 > r7) goto L105
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            int r5 = r1 + 1
            if (r2 <= r5) goto L102
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto L102
            int r5 = r1 + 2
            if (r2 <= r5) goto Lff
            r5 = r0[r5]
            r5 = r5 & 192(0xc0, float:2.69E-43)
            if (r5 != r10) goto Lff
        Lfd:
            r5 = r6
            goto Lc8
        Lff:
            r5 = r6
            goto L68
        L102:
            r5 = r6
            goto L4b
        L105:
            int r8 = r1 + 1
            r8 = r0[r8]
            r9 = r8 & 192(0xc0, float:2.69E-43)
            if (r9 != r10) goto L177
            int r9 = r1 + 2
            r9 = r0[r9]
            r12 = r9 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L170
            r7 = r0[r7]
            r12 = r7 & 192(0xc0, float:2.69E-43)
            if (r12 != r10) goto L169
            r10 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r10
            int r9 = r9 << 6
            r7 = r7 ^ r9
            int r8 = r8 << 12
            r7 = r7 ^ r8
            int r6 = r6 << 18
            r6 = r6 ^ r7
            r7 = 1114111(0x10ffff, float:1.561202E-39)
            if (r6 <= r7) goto L134
            int r6 = r5 + 1
            r3[r5] = r11
        L131:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L165
        L134:
            if (r14 > r6) goto L13d
            if (r6 >= r13) goto L13d
            int r6 = r5 + 1
            r3[r5] = r11
            goto L131
        L13d:
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 >= r7) goto L146
            int r6 = r5 + 1
            r3[r5] = r11
            goto L131
        L146:
            if (r6 == r11) goto L160
            int r7 = r6 >>> 10
            r8 = 55232(0xd7c0, float:7.7397E-41)
            int r7 = r7 + r8
            char r7 = (char) r7
            int r8 = r5 + 1
            r3[r5] = r7
            r6 = r6 & 1023(0x3ff, float:1.434E-42)
            r7 = 56320(0xdc00, float:7.8921E-41)
            int r6 = r6 + r7
            char r6 = (char) r6
            int r5 = r5 + 2
            r3[r8] = r6
            r6 = r5
            goto L131
        L160:
            int r6 = r5 + 1
            r3[r5] = r11
            goto L131
        L165:
            r9 = 4
            r5 = r6
            goto L70
        L169:
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto Lfd
        L170:
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto Lff
        L177:
            int r6 = r5 + 1
            r3[r5] = r11
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            goto L102
        L17e:
            int r6 = r5 + 1
            r3[r5] = r11
            int r1 = r1 + 1
            r5 = r6
            goto L18
        L187:
            java.lang.String r0 = kotlin.text.StringsKt.concatToString(r3, r4, r5)
            return r0
        L18c:
            java.lang.ArrayIndexOutOfBoundsException r3 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "size="
            r4.<init>(r5)
            int r0 = r0.length
            java.lang.StringBuilder r0 = r4.append(r0)
            java.lang.String r4 = " beginIndex="
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " endIndex="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public static /* synthetic */ java.lang.String commonToUtf8String$default(byte[] r0, int r1, int r2, int r3, java.lang.Object r4) {
            r4 = r3 & 1
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto La
            int r2 = r0.length
        La:
            java.lang.String r0 = commonToUtf8String(r0, r1, r2)
            return r0
    }
}
