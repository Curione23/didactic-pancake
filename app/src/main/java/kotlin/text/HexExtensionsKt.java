package kotlin.text;

/* JADX INFO: compiled from: HexExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\n\n\u0002\b\u0004\u001a \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a@\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a@\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0000\u001a \u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u001a,\u0010\u0018\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002\u001a,\u0010\u001d\u001a\u00020\u001e*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\"H\u0002\u001a\u001c\u0010#\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002\u001a\u0014\u0010$\u001a\u00020\u000b*\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u001a*\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010%\u001a\u00020&*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010)\u001a\u00020**\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010+\u001a\u00020\u000b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010,\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a0\u0010-\u001a\u00020\b*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020(2\u0006\u0010 \u001a\u00020\u000bH\u0003\u001a*\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0003\u001a\u0016\u0010.\u001a\u00020/*\u00020\u00052\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020&2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a*\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020*2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\u000b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020\b2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u0016\u00100\u001a\u00020\u0005*\u00020/2\b\b\u0002\u0010'\u001a\u00020(H\u0007\u001a\u001c\u00101\u001a\u00020\u0005*\u00020\b2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u000bH\u0003\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"HEX_DIGITS_TO_DECIMAL", "", "getHEX_DIGITS_TO_DECIMAL$annotations", "()V", "LOWER_CASE_HEX_DIGITS", "", "UPPER_CASE_HEX_DIGITS", "charsPerSet", "", "charsPerElement", "elementsPerSet", "", "elementSeparatorLength", "formattedStringLength", "totalBytes", "bytesPerLine", "bytesPerGroup", "groupSeparatorLength", "byteSeparatorLength", "bytePrefixLength", "byteSuffixLength", "parsedByteArrayMaxSize", "stringLength", "wholeElementsPerSet", "checkContainsAt", "part", "index", "endIndex", "partName", "checkHexLength", "", "startIndex", "maxDigits", "requireMaxLength", "", "checkNewLineAt", "decimalFromHexDigitAt", "hexToByte", "", "format", "Lkotlin/text/HexFormat;", "hexToByteArray", "", "hexToInt", "hexToLong", "hexToLongImpl", "hexToShort", "", "toHexString", "toHexStringImpl", "bits", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HexExtensionsKt {
    private static final int[] HEX_DIGITS_TO_DECIMAL = null;
    private static final java.lang.String LOWER_CASE_HEX_DIGITS = "0123456789abcdef";
    private static final java.lang.String UPPER_CASE_HEX_DIGITS = "0123456789ABCDEF";

    static {
            r0 = 128(0x80, float:1.8E-43)
            int[] r1 = new int[r0]
            r2 = 0
            r3 = r2
        L6:
            if (r3 >= r0) goto Le
            r4 = -1
            r1[r3] = r4
            int r3 = r3 + 1
            goto L6
        Le:
            java.lang.String r0 = "0123456789abcdef"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3 = r2
            r4 = r3
        L14:
            int r5 = r0.length()
            if (r3 >= r5) goto L26
            char r5 = r0.charAt(r3)
            int r6 = r4 + 1
            r1[r5] = r4
            int r3 = r3 + 1
            r4 = r6
            goto L14
        L26:
            java.lang.String r0 = "0123456789ABCDEF"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r3 = r2
        L2b:
            int r4 = r0.length()
            if (r2 >= r4) goto L3d
            char r4 = r0.charAt(r2)
            int r5 = r3 + 1
            r1[r4] = r3
            int r2 = r2 + 1
            r3 = r5
            goto L2b
        L3d:
            kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL = r1
            return
    }

    private static final long charsPerSet(long r4, int r6, int r7) {
            if (r6 <= 0) goto Lb
            long r0 = (long) r6
            long r4 = r4 * r0
            long r6 = (long) r7
            r2 = 1
            long r0 = r0 - r2
            long r6 = r6 * r0
            long r4 = r4 + r6
            return r4
        Lb:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Failed requirement."
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private static final int checkContainsAt(java.lang.String r7, java.lang.String r8, int r9, int r10, java.lang.String r11) {
            int r0 = r8.length()
            int r0 = r0 + r9
            if (r0 > r10) goto L17
            int r5 = r8.length()
            r6 = 1
            r4 = 0
            r1 = r7
            r2 = r9
            r3 = r8
            boolean r1 = kotlin.text.StringsKt.regionMatches(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L17
            return r0
        L17:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected "
            r2.<init>(r3)
            java.lang.StringBuilder r11 = r2.append(r11)
            java.lang.String r2 = " \""
            java.lang.StringBuilder r11 = r11.append(r2)
            java.lang.StringBuilder r8 = r11.append(r8)
            java.lang.String r11 = "\" at index "
            java.lang.StringBuilder r8 = r8.append(r11)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r11 = ", but was "
            java.lang.StringBuilder r8 = r8.append(r11)
            int r10 = kotlin.ranges.RangesKt.coerceAtMost(r0, r10)
            java.lang.String r11 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r11)
            java.lang.String r7 = r7.substring(r9, r10)
            java.lang.String r9 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r9)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            r1.<init>(r7)
            throw r1
    }

    private static final void checkHexLength(java.lang.String r3, int r4, int r5, int r6, boolean r7) {
            int r0 = r5 - r4
            if (r7 == 0) goto L7
            if (r0 != r6) goto La
            goto L9
        L7:
            if (r0 > r6) goto La
        L9:
            return
        La:
            if (r7 == 0) goto Lf
            java.lang.String r7 = "exactly"
            goto L11
        Lf:
            java.lang.String r7 = "at most"
        L11:
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r1)
            java.lang.String r3 = r3.substring(r4, r5)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected "
            r1.<init>(r2)
            java.lang.StringBuilder r7 = r1.append(r7)
            r1 = 32
            java.lang.StringBuilder r7 = r7.append(r1)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = " hexadecimal digits at index "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r6 = ", but was "
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = " of length "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    private static final int checkNewLineAt(java.lang.String r3, int r4, int r5) {
            char r0 = r3.charAt(r4)
            r1 = 13
            r2 = 10
            if (r0 != r1) goto L17
            int r0 = r4 + 1
            if (r0 >= r5) goto L1f
            char r3 = r3.charAt(r0)
            if (r3 != r2) goto L1f
            int r0 = r4 + 2
            goto L1f
        L17:
            char r5 = r3.charAt(r4)
            if (r5 != r2) goto L20
            int r0 = r4 + 1
        L1f:
            return r0
        L20:
            java.lang.NumberFormatException r5 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected a new line at index "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = ", but was "
            java.lang.StringBuilder r0 = r0.append(r1)
            char r3 = r3.charAt(r4)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    private static final int decimalFromHexDigitAt(java.lang.String r3, int r4) {
            char r0 = r3.charAt(r4)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 > r1) goto Lf
            int[] r1 = kotlin.text.HexExtensionsKt.HEX_DIGITS_TO_DECIMAL
            r0 = r1[r0]
            if (r0 < 0) goto Lf
            return r0
        Lf:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a hexadecimal digit at index "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ", but was "
            java.lang.StringBuilder r1 = r1.append(r2)
            char r3 = r3.charAt(r4)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final int formattedStringLength(int r5, int r6, int r7, int r8, int r9, int r10, int r11) {
            if (r5 <= 0) goto L58
            int r0 = r5 + (-1)
            int r1 = r0 / r6
            int r2 = r6 + (-1)
            int r2 = r2 / r7
            int r3 = r5 % r6
            if (r3 != 0) goto Le
            goto Lf
        Le:
            r6 = r3
        Lf:
            int r6 = r6 + (-1)
            int r6 = r6 / r7
            int r2 = r2 * r1
            int r2 = r2 + r6
            int r0 = r0 - r1
            int r0 = r0 - r2
            long r6 = (long) r1
            long r1 = (long) r2
            long r3 = (long) r8
            long r1 = r1 * r3
            long r6 = r6 + r1
            long r0 = (long) r0
            long r8 = (long) r9
            long r0 = r0 * r8
            long r6 = r6 + r0
            long r8 = (long) r5
            long r0 = (long) r10
            r2 = 2
            long r0 = r0 + r2
            long r10 = (long) r11
            long r0 = r0 + r10
            long r8 = r8 * r0
            long r6 = r6 + r8
            kotlin.ranges.IntRange r5 = new kotlin.ranges.IntRange
            r8 = 0
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5.<init>(r8, r9)
            kotlin.ranges.ClosedRange r5 = (kotlin.ranges.ClosedRange) r5
            boolean r5 = kotlin.ranges.RangesKt.intRangeContains(r5, r6)
            if (r5 == 0) goto L3b
            int r5 = (int) r6
            return r5
        L3b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "The resulting string length is too big: "
            r8.<init>(r9)
            long r6 = kotlin.ULong.m941constructorimpl(r6)
            java.lang.String r6 = kotlin.ULong.m987toStringimpl(r6)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L58:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Failed requirement."
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
    }

    private static /* synthetic */ void getHEX_DIGITS_TO_DECIMAL$annotations() {
            return
    }

    private static final byte hexToByte(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat r4) {
            r0 = 2
            long r1 = hexToLongImpl(r1, r2, r3, r4, r0)
            int r1 = (int) r1
            byte r1 = (byte) r1
            return r1
    }

    public static final byte hexToByte(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte r2 = hexToByte(r2, r0, r1, r3)
            return r2
    }

    static /* synthetic */ byte hexToByte$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            byte r0 = hexToByte(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte hexToByte$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            byte r0 = hexToByte(r0, r1)
            return r0
    }

    private static final byte[] hexToByteArray(java.lang.String r18, int r19, int r20, kotlin.text.HexFormat r21) {
            r0 = r18
            r1 = r19
            r2 = r20
            kotlin.collections.AbstractList$Companion r3 = kotlin.collections.AbstractList.Companion
            int r4 = r18.length()
            r3.checkBoundsIndexes$kotlin_stdlib(r1, r2, r4)
            r3 = 0
            if (r1 != r2) goto L15
            byte[] r0 = new byte[r3]
            return r0
        L15:
            kotlin.text.HexFormat$BytesHexFormat r4 = r21.getBytes()
            int r12 = r4.getBytesPerLine()
            int r13 = r4.getBytesPerGroup()
            java.lang.String r14 = r4.getBytePrefix()
            java.lang.String r15 = r4.getByteSuffix()
            java.lang.String r11 = r4.getByteSeparator()
            java.lang.String r4 = r4.getGroupSeparator()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r3 = r11
            r11 = r16
            int r5 = parsedByteArrayMaxSize(r5, r6, r7, r8, r9, r10, r11)
            byte[] r6 = new byte[r5]
            r7 = 0
            r8 = 0
            r9 = 0
        L51:
            if (r1 >= r2) goto La0
            if (r8 != r12) goto L5c
            int r1 = checkNewLineAt(r0, r1, r2)
            r8 = 0
        L5a:
            r9 = 0
            goto L6d
        L5c:
            if (r9 != r13) goto L65
            java.lang.String r9 = "group separator"
            int r1 = checkContainsAt(r0, r4, r1, r2, r9)
            goto L5a
        L65:
            if (r9 == 0) goto L6d
            java.lang.String r10 = "byte separator"
            int r1 = checkContainsAt(r0, r3, r1, r2, r10)
        L6d:
            r10 = 1
            int r8 = r8 + r10
            int r9 = r9 + r10
            java.lang.String r11 = "byte prefix"
            int r1 = checkContainsAt(r0, r14, r1, r2, r11)
            int r11 = r1 + 2
            int r11 = kotlin.ranges.RangesKt.coerceAtMost(r11, r2)
            r16 = r3
            r3 = 2
            checkHexLength(r0, r1, r11, r3, r10)
            int r10 = r7 + 1
            int r11 = r1 + 1
            int r17 = decimalFromHexDigitAt(r0, r1)
            int r17 = r17 << 4
            int r1 = r1 + r3
            int r3 = decimalFromHexDigitAt(r0, r11)
            r3 = r17 | r3
            byte r3 = (byte) r3
            r6[r7] = r3
            java.lang.String r3 = "byte suffix"
            int r1 = checkContainsAt(r0, r15, r1, r2, r3)
            r7 = r10
            r3 = r16
            goto L51
        La0:
            if (r7 != r5) goto La3
            goto Lac
        La3:
            byte[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r0 = "copyOf(this, newSize)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
        Lac:
            return r6
    }

    public static final byte[] hexToByteArray(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            byte[] r2 = hexToByteArray(r2, r0, r1, r3)
            return r2
    }

    static /* synthetic */ byte[] hexToByteArray$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            byte[] r0 = hexToByteArray(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ byte[] hexToByteArray$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            byte[] r0 = hexToByteArray(r0, r1)
            return r0
    }

    private static final int hexToInt(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat r4) {
            r0 = 8
            long r1 = hexToLongImpl(r1, r2, r3, r4, r0)
            int r1 = (int) r1
            return r1
    }

    public static final int hexToInt(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            int r2 = hexToInt(r2, r0, r1, r3)
            return r2
    }

    static /* synthetic */ int hexToInt$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            int r0 = hexToInt(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            int r0 = hexToInt(r0, r1)
            return r0
    }

    private static final long hexToLong(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat r4) {
            r0 = 16
            long r1 = hexToLongImpl(r1, r2, r3, r4, r0)
            return r1
    }

    public static final long hexToLong(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            long r2 = hexToLong(r2, r0, r1, r3)
            return r2
    }

    static /* synthetic */ long hexToLong$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            long r0 = hexToLong(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            long r0 = hexToLong(r0, r1)
            return r0
    }

    private static final long hexToLongImpl(java.lang.String r3, int r4, int r5, kotlin.text.HexFormat r6, int r7) {
            kotlin.collections.AbstractList$Companion r0 = kotlin.collections.AbstractList.Companion
            int r1 = r3.length()
            r0.checkBoundsIndexes$kotlin_stdlib(r4, r5, r1)
            kotlin.text.HexFormat$NumberHexFormat r0 = r6.getNumber()
            java.lang.String r0 = r0.getPrefix()
            kotlin.text.HexFormat$NumberHexFormat r6 = r6.getNumber()
            java.lang.String r6 = r6.getSuffix()
            int r1 = r0.length()
            int r2 = r6.length()
            int r1 = r1 + r2
            int r2 = r5 - r4
            if (r1 >= r2) goto L4b
            java.lang.String r1 = "prefix"
            int r4 = checkContainsAt(r3, r0, r4, r5, r1)
            int r0 = r6.length()
            int r0 = r5 - r0
            java.lang.String r1 = "suffix"
            checkContainsAt(r3, r6, r0, r5, r1)
            r5 = 0
            checkHexLength(r3, r4, r0, r7, r5)
            r5 = 0
        L3d:
            if (r4 >= r0) goto L4a
            r7 = 4
            long r5 = r5 << r7
            int r7 = decimalFromHexDigitAt(r3, r4)
            long r1 = (long) r7
            long r5 = r5 | r1
            int r4 = r4 + 1
            goto L3d
        L4a:
            return r5
        L4b:
            java.lang.NumberFormatException r7 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected a hexadecimal number with prefix \""
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "\" and suffix \""
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = "\", but was "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r0)
            java.lang.String r3 = r3.substring(r4, r5)
            java.lang.String r4 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r3 = r3.toString()
            r7.<init>(r3)
            throw r7
    }

    static /* synthetic */ long hexToLongImpl$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L5
            r1 = 0
        L5:
            r5 = r5 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            long r0 = hexToLongImpl(r0, r1, r2, r3, r4)
            return r0
    }

    private static final short hexToShort(java.lang.String r1, int r2, int r3, kotlin.text.HexFormat r4) {
            r0 = 4
            long r1 = hexToLongImpl(r1, r2, r3, r4, r0)
            int r1 = (int) r1
            short r1 = (short) r1
            return r1
    }

    public static final short hexToShort(java.lang.String r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length()
            short r2 = hexToShort(r2, r0, r1, r3)
            return r2
    }

    static /* synthetic */ short hexToShort$default(java.lang.String r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto Ld
            int r2 = r0.length()
        Ld:
            r4 = r4 & 4
            if (r4 == 0) goto L17
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L17:
            short r0 = hexToShort(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ short hexToShort$default(java.lang.String r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            short r0 = hexToShort(r0, r1)
            return r0
    }

    public static final int parsedByteArrayMaxSize(int r17, int r18, int r19, int r20, int r21, int r22, int r23) {
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            if (r0 <= 0) goto L64
            r5 = r22
            long r5 = (long) r5
            r7 = 2
            long r5 = r5 + r7
            r7 = r23
            long r7 = (long) r7
            long r5 = r5 + r7
            long r7 = charsPerSet(r5, r2, r4)
            if (r1 > r2) goto L21
            long r9 = charsPerSet(r5, r1, r4)
            goto L32
        L21:
            int r9 = r1 / r2
            long r9 = charsPerSet(r7, r9, r3)
            int r11 = r1 % r2
            if (r11 == 0) goto L32
            long r12 = (long) r3
            long r9 = r9 + r12
            long r11 = charsPerSet(r5, r11, r4)
            long r9 = r9 + r11
        L32:
            long r11 = (long) r0
            r0 = 1
            long r13 = wholeElementsPerSet(r11, r9, r0)
            r15 = 1
            long r9 = r9 + r15
            long r9 = r9 * r13
            long r11 = r11 - r9
            long r9 = wholeElementsPerSet(r11, r7, r3)
            long r0 = (long) r3
            long r7 = r7 + r0
            long r7 = r7 * r9
            long r11 = r11 - r7
            long r0 = wholeElementsPerSet(r11, r5, r4)
            long r3 = (long) r4
            long r5 = r5 + r3
            long r5 = r5 * r0
            long r11 = r11 - r5
            r3 = 0
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L57
            r4 = r18
            r3 = 1
            goto L5a
        L57:
            r3 = 0
            r4 = r18
        L5a:
            long r4 = (long) r4
            long r13 = r13 * r4
            long r4 = (long) r2
            long r9 = r9 * r4
            long r13 = r13 + r9
            long r13 = r13 + r0
            long r0 = (long) r3
            long r13 = r13 + r0
            int r0 = (int) r13
            return r0
        L64:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed requirement."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.String toHexString(byte r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = (long) r2
            r2 = 8
            java.lang.String r2 = toHexStringImpl(r0, r3, r2)
            return r2
    }

    public static final java.lang.String toHexString(int r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = (long) r2
            r2 = 32
            java.lang.String r2 = toHexStringImpl(r0, r3, r2)
            return r2
    }

    public static final java.lang.String toHexString(long r1, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 64
            java.lang.String r1 = toHexStringImpl(r1, r3, r0)
            return r1
    }

    public static final java.lang.String toHexString(short r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            long r0 = (long) r2
            r2 = 16
            java.lang.String r2 = toHexStringImpl(r0, r3, r2)
            return r2
    }

    public static final java.lang.String toHexString(byte[] r17, int r18, int r19, kotlin.text.HexFormat r20) {
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "format"
            r4 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
            kotlin.collections.AbstractList$Companion r3 = kotlin.collections.AbstractList.Companion
            int r5 = r0.length
            r3.checkBoundsIndexes$kotlin_stdlib(r1, r2, r5)
            if (r1 != r2) goto L1d
            java.lang.String r0 = ""
            return r0
        L1d:
            boolean r3 = r20.getUpperCase()
            if (r3 == 0) goto L26
            java.lang.String r3 = "0123456789ABCDEF"
            goto L28
        L26:
            java.lang.String r3 = "0123456789abcdef"
        L28:
            kotlin.text.HexFormat$BytesHexFormat r4 = r20.getBytes()
            int r12 = r4.getBytesPerLine()
            int r13 = r4.getBytesPerGroup()
            java.lang.String r14 = r4.getBytePrefix()
            java.lang.String r15 = r4.getByteSuffix()
            java.lang.String r11 = r4.getByteSeparator()
            java.lang.String r4 = r4.getGroupSeparator()
            int r5 = r2 - r1
            int r8 = r4.length()
            int r9 = r11.length()
            int r10 = r14.length()
            int r16 = r15.length()
            r6 = r12
            r7 = r13
            r1 = r11
            r11 = r16
            int r5 = formattedStringLength(r5, r6, r7, r8, r9, r10, r11)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r8 = r18
            r9 = 0
            r10 = 0
        L68:
            if (r8 >= r2) goto La2
            r11 = r0[r8]
            r7 = r11 & 255(0xff, float:3.57E-43)
            if (r9 != r12) goto L78
            r9 = 10
            r6.append(r9)
            r9 = 0
        L76:
            r10 = 0
            goto L7e
        L78:
            if (r10 != r13) goto L7e
            r6.append(r4)
            goto L76
        L7e:
            if (r10 == 0) goto L83
            r6.append(r1)
        L83:
            r6.append(r14)
            int r7 = r7 >> 4
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r7 = r11 & 15
            char r7 = r3.charAt(r7)
            r6.append(r7)
            r6.append(r15)
            int r10 = r10 + 1
            int r9 = r9 + 1
            int r8 = r8 + 1
            goto L68
        La2:
            int r0 = r6.length()
            if (r5 != r0) goto Lb2
            java.lang.String r0 = r6.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
        Lb2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final java.lang.String toHexString(byte[] r2, kotlin.text.HexFormat r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "format"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = toHexString(r2, r0, r1, r3)
            return r2
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(int r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(long r0, kotlin.text.HexFormat r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto La
            kotlin.text.HexFormat$Companion r2 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r2 = r2.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r2)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(short r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] r0, int r1, int r2, kotlin.text.HexFormat r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L5
            r1 = 0
        L5:
            r5 = r4 & 2
            if (r5 == 0) goto La
            int r2 = r0.length
        La:
            r4 = r4 & 4
            if (r4 == 0) goto L14
            kotlin.text.HexFormat$Companion r3 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r3 = r3.getDefault()
        L14:
            java.lang.String r0 = toHexString(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] r0, kotlin.text.HexFormat r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto La
            kotlin.text.HexFormat$Companion r1 = kotlin.text.HexFormat.Companion
            kotlin.text.HexFormat r1 = r1.getDefault()
        La:
            java.lang.String r0 = toHexString(r0, r1)
            return r0
    }

    private static final java.lang.String toHexStringImpl(long r9, kotlin.text.HexFormat r11, int r12) {
            r0 = r12 & 3
            if (r0 != 0) goto L65
            boolean r0 = r11.getUpperCase()
            if (r0 == 0) goto Ld
            java.lang.String r0 = "0123456789ABCDEF"
            goto Lf
        Ld:
            java.lang.String r0 = "0123456789abcdef"
        Lf:
            kotlin.text.HexFormat$NumberHexFormat r1 = r11.getNumber()
            java.lang.String r1 = r1.getPrefix()
            kotlin.text.HexFormat$NumberHexFormat r2 = r11.getNumber()
            java.lang.String r2 = r2.getSuffix()
            int r3 = r1.length()
            int r4 = r12 >> 2
            int r3 = r3 + r4
            int r4 = r2.length()
            int r3 = r3 + r4
            kotlin.text.HexFormat$NumberHexFormat r11 = r11.getNumber()
            boolean r11 = r11.getRemoveLeadingZeros()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r1)
        L3b:
            if (r12 <= 0) goto L58
            int r12 = r12 + (-4)
            long r5 = r9 >> r12
            r7 = 15
            long r5 = r5 & r7
            int r1 = (int) r5
            if (r11 == 0) goto L4d
            if (r1 != 0) goto L4d
            if (r12 <= 0) goto L4d
            r11 = 1
            goto L4e
        L4d:
            r11 = 0
        L4e:
            if (r11 != 0) goto L3b
            char r1 = r0.charAt(r1)
            r4.append(r1)
            goto L3b
        L58:
            r4.append(r2)
            java.lang.String r9 = r4.toString()
            java.lang.String r10 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r10)
            return r9
        L65:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Failed requirement."
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
    }

    private static final long wholeElementsPerSet(long r3, long r5, int r7) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L10
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto Lb
            goto L10
        Lb:
            long r0 = (long) r7
            long r3 = r3 + r0
            long r5 = r5 + r0
            long r0 = r3 / r5
        L10:
            return r0
    }
}
