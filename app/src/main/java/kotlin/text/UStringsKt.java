package kotlin.text;

/* JADX INFO: compiled from: UStrings.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0014\u0010\u0010\u001a\u00020\u0002*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0010\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u0002*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0014\u001a\u00020\u0007*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001c\u0010\u0014\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0011\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u0007*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u0018\u001a\u00020\n*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a\u001c\u0010\u0018\u001a\u00020\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001b\u001a\u0004\u0018\u00010\n*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u001a\u0014\u0010\u001c\u001a\u00020\r*\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001d\u001a\u001c\u0010\u001c\u001a\u00020\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a\u0011\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u0001H\u0007ø\u0001\u0000\u001a\u0019\u0010\u001f\u001a\u0004\u0018\u00010\r*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0007ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"toString", "", "Lkotlin/UByte;", "radix", "", "toString-LxnNnR4", "(BI)Ljava/lang/String;", "Lkotlin/UInt;", "toString-V7xB4Y4", "(II)Ljava/lang/String;", "Lkotlin/ULong;", "toString-JSWoG40", "(JI)Ljava/lang/String;", "Lkotlin/UShort;", "toString-olVBNx4", "(SI)Ljava/lang/String;", "toUByte", "(Ljava/lang/String;)B", "(Ljava/lang/String;I)B", "toUByteOrNull", "toUInt", "(Ljava/lang/String;)I", "(Ljava/lang/String;I)I", "toUIntOrNull", "toULong", "(Ljava/lang/String;)J", "(Ljava/lang/String;I)J", "toULongOrNull", "toUShort", "(Ljava/lang/String;)S", "(Ljava/lang/String;I)S", "toUShortOrNull", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UStringsKt {
    /* JADX INFO: renamed from: toString-JSWoG40, reason: not valid java name */
    public static final java.lang.String m2078toStringJSWoG40(long r0, int r2) {
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            java.lang.String r0 = kotlin.UnsignedKt.ulongToString(r0, r2)
            return r0
    }

    /* JADX INFO: renamed from: toString-LxnNnR4, reason: not valid java name */
    public static final java.lang.String m2079toStringLxnNnR4(byte r0, int r1) {
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = kotlin.text.CharsKt.checkRadix(r1)
            java.lang.String r0 = java.lang.Integer.toString(r0, r1)
            java.lang.String r1 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: toString-V7xB4Y4, reason: not valid java name */
    public static final java.lang.String m2080toStringV7xB4Y4(int r4, int r5) {
            long r0 = (long) r4
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r4 = kotlin.text.CharsKt.checkRadix(r5)
            java.lang.String r4 = java.lang.Long.toString(r0, r4)
            java.lang.String r5 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
    }

    /* JADX INFO: renamed from: toString-olVBNx4, reason: not valid java name */
    public static final java.lang.String m2081toStringolVBNx4(short r1, int r2) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r0
            int r2 = kotlin.text.CharsKt.checkRadix(r2)
            java.lang.String r1 = java.lang.Integer.toString(r1, r2)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    public static final byte toUByte(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r0 = toUByteOrNull(r1)
            if (r0 == 0) goto L10
            byte r1 = r0.m835unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final byte toUByte(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UByte r2 = toUByteOrNull(r1, r2)
            if (r2 == 0) goto L10
            byte r1 = r2.m835unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UByte r1 = toUByteOrNull(r1, r0)
            return r1
    }

    public static final kotlin.UByte toUByteOrNull(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r1 = toUIntOrNull(r1, r2)
            r2 = 0
            if (r1 == 0) goto L27
            int r1 = r1.m914unboximpl()
            r0 = 255(0xff, float:3.57E-43)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = java.lang.Integer.compareUnsigned(r1, r0)
            if (r0 <= 0) goto L1d
            return r2
        L1d:
            byte r1 = (byte) r1
            byte r1 = kotlin.UByte.m785constructorimpl(r1)
            kotlin.UByte r1 = kotlin.UByte.m779boximpl(r1)
            return r1
        L27:
            return r2
    }

    public static final int toUInt(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r0 = toUIntOrNull(r1)
            if (r0 == 0) goto L10
            int r1 = r0.m914unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final int toUInt(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r2 = toUIntOrNull(r1, r2)
            if (r2 == 0) goto L10
            int r1 = r2.m914unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UInt r1 = toUIntOrNull(r1, r0)
            return r1
    }

    public static final kotlin.UInt toUIntOrNull(java.lang.String r9, int r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.text.CharsKt.checkRadix(r10)
            int r0 = r9.length()
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            r2 = 0
            char r3 = r9.charAt(r2)
            r4 = 48
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r3, r4)
            if (r4 >= 0) goto L25
            r4 = 1
            if (r0 == r4) goto L24
            r5 = 43
            if (r3 == r5) goto L26
        L24:
            return r1
        L25:
            r4 = r2
        L26:
            int r3 = kotlin.UInt.m862constructorimpl(r10)
            r5 = 119304647(0x71c71c7, float:1.1769572E-34)
            r6 = r5
        L2e:
            if (r4 >= r0) goto L68
            char r7 = r9.charAt(r4)
            int r7 = kotlin.text.CharsKt.digitOf(r7, r10)
            if (r7 >= 0) goto L3b
            return r1
        L3b:
            int r8 = java.lang.Integer.compareUnsigned(r2, r6)
            if (r8 <= 0) goto L4f
            if (r6 != r5) goto L4e
            r6 = -1
            int r6 = java.lang.Integer.divideUnsigned(r6, r3)
            int r8 = java.lang.Integer.compareUnsigned(r2, r6)
            if (r8 <= 0) goto L4f
        L4e:
            return r1
        L4f:
            int r2 = r2 * r3
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r7 = kotlin.UInt.m862constructorimpl(r7)
            int r7 = r7 + r2
            int r7 = kotlin.UInt.m862constructorimpl(r7)
            int r2 = java.lang.Integer.compareUnsigned(r7, r2)
            if (r2 >= 0) goto L64
            return r1
        L64:
            int r4 = r4 + 1
            r2 = r7
            goto L2e
        L68:
            kotlin.UInt r9 = kotlin.UInt.m856boximpl(r2)
            return r9
    }

    public static final long toULong(java.lang.String r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.ULong r0 = toULongOrNull(r2)
            if (r0 == 0) goto L10
            long r0 = r0.m993unboximpl()
            return r0
        L10:
            kotlin.text.StringsKt.numberFormatError(r2)
            kotlin.KotlinNothingValueException r2 = new kotlin.KotlinNothingValueException
            r2.<init>()
            throw r2
    }

    public static final long toULong(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.ULong r2 = toULongOrNull(r1, r2)
            if (r2 == 0) goto L10
            long r1 = r2.m993unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.ULong r1 = toULongOrNull(r1, r0)
            return r1
    }

    public static final kotlin.ULong toULongOrNull(java.lang.String r17, int r18) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
            kotlin.text.CharsKt.checkRadix(r18)
            int r2 = r17.length()
            r3 = 0
            if (r2 != 0) goto L14
            return r3
        L14:
            r4 = 0
            char r5 = r0.charAt(r4)
            r6 = 48
            int r6 = kotlin.jvm.internal.Intrinsics.compare(r5, r6)
            if (r6 >= 0) goto L29
            r4 = 1
            if (r2 == r4) goto L28
            r6 = 43
            if (r5 == r6) goto L29
        L28:
            return r3
        L29:
            long r5 = (long) r1
            long r5 = kotlin.ULong.m941constructorimpl(r5)
            r7 = 512409557603043100(0x71c71c71c71c71c, double:2.0539100454284282E-274)
            r9 = 0
            r11 = r7
        L36:
            if (r4 >= r2) goto L7e
            char r13 = r0.charAt(r4)
            int r13 = kotlin.text.CharsKt.digitOf(r13, r1)
            if (r13 >= 0) goto L43
            return r3
        L43:
            int r14 = java.lang.Long.compareUnsigned(r9, r11)
            if (r14 <= 0) goto L5a
            int r11 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r11 != 0) goto L59
            r11 = -1
            long r11 = java.lang.Long.divideUnsigned(r11, r5)
            int r14 = java.lang.Long.compareUnsigned(r9, r11)
            if (r14 <= 0) goto L5a
        L59:
            return r3
        L5a:
            long r9 = r9 * r5
            long r9 = kotlin.ULong.m941constructorimpl(r9)
            int r13 = kotlin.UInt.m862constructorimpl(r13)
            long r13 = (long) r13
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r13 = r13 & r15
            long r13 = kotlin.ULong.m941constructorimpl(r13)
            long r13 = r13 + r9
            long r13 = kotlin.ULong.m941constructorimpl(r13)
            int r9 = java.lang.Long.compareUnsigned(r13, r9)
            if (r9 >= 0) goto L7a
            return r3
        L7a:
            int r4 = r4 + 1
            r9 = r13
            goto L36
        L7e:
            kotlin.ULong r0 = kotlin.ULong.m935boximpl(r9)
            return r0
    }

    public static final short toUShort(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r0 = toUShortOrNull(r1)
            if (r0 == 0) goto L10
            short r1 = r0.m1098unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final short toUShort(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UShort r2 = toUShortOrNull(r1, r2)
            if (r2 == 0) goto L10
            short r1 = r2.m1098unboximpl()
            return r1
        L10:
            kotlin.text.StringsKt.numberFormatError(r1)
            kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
            r1.<init>()
            throw r1
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 10
            kotlin.UShort r1 = toUShortOrNull(r1, r0)
            return r1
    }

    public static final kotlin.UShort toUShortOrNull(java.lang.String r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.UInt r1 = toUIntOrNull(r1, r2)
            r2 = 0
            if (r1 == 0) goto L28
            int r1 = r1.m914unboximpl()
            r0 = 65535(0xffff, float:9.1834E-41)
            int r0 = kotlin.UInt.m862constructorimpl(r0)
            int r0 = java.lang.Integer.compareUnsigned(r1, r0)
            if (r0 <= 0) goto L1e
            return r2
        L1e:
            short r1 = (short) r1
            short r1 = kotlin.UShort.m1048constructorimpl(r1)
            kotlin.UShort r1 = kotlin.UShort.m1042boximpl(r1)
            return r1
        L28:
            return r2
    }
}
