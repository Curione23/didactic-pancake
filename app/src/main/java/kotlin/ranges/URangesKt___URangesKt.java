package kotlin.ranges;

/* JADX INFO: compiled from: _URanges.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\n\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001e\u0010\u0000\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\u0000\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u0000\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001e\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004\u001a\u001e\u0010\u000e\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0007\u001a\u001e\u0010\u000e\u001a\u00020\b*\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\n\u001a\u001e\u0010\u000e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\r\u001a&\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a&\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a$\u0010\u0014\u001a\u00020\u0005*\u00020\u00052\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a&\u0010\u0014\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a$\u0010\u0014\u001a\u00020\b*\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a&\u0010\u0014\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0087\nø\u0001\u0000¢\u0006\u0002\b*\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b+\u0010,\u001a\u001f\u0010#\u001a\u00020$*\u00020%2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\b\u0010)\u001a\u0004\u0018\u00010\bH\u0087\nø\u0001\u0000¢\u0006\u0002\b4\u001a\u001f\u0010#\u001a\u00020$*\u00020/2\u0006\u0010&\u001a\u00020\u000bH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00106\u001a\u001f\u00107\u001a\u000208*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u00107\u001a\u000208*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a\u001f\u00107\u001a\u00020>*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001a\u001f\u00107\u001a\u000208*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bA\u0010B\u001a\u0014\u0010C\u001a\u00020\u0005*\u000208H\u0007ø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u0014\u0010C\u001a\u00020\b*\u00020>H\u0007ø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001\u0000\u001a\u0011\u0010F\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001\u0000\u001a\u0014\u0010G\u001a\u00020\u0005*\u000208H\u0007ø\u0001\u0000¢\u0006\u0002\u0010D\u001a\u0014\u0010G\u001a\u00020\b*\u00020>H\u0007ø\u0001\u0000¢\u0006\u0002\u0010E\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\u0005*\u000208H\u0007ø\u0001\u0000\u001a\u0011\u0010H\u001a\u0004\u0018\u00010\b*\u00020>H\u0007ø\u0001\u0000\u001a\u0015\u0010I\u001a\u00020\u0005*\u00020%H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010J\u001a\u001c\u0010I\u001a\u00020\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000¢\u0006\u0002\u0010L\u001a\u0015\u0010I\u001a\u00020\b*\u00020/H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010M\u001a\u001c\u0010I\u001a\u00020\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000¢\u0006\u0002\u0010N\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%H\u0087\bø\u0001\u0000\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\u0005*\u00020%2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000\u001a\u0012\u0010O\u001a\u0004\u0018\u00010\b*\u00020/H\u0087\bø\u0001\u0000\u001a\u0019\u0010O\u001a\u0004\u0018\u00010\b*\u00020/2\u0006\u0010I\u001a\u00020KH\u0007ø\u0001\u0000\u001a\f\u0010P\u001a\u000208*\u000208H\u0007\u001a\f\u0010P\u001a\u00020>*\u00020>H\u0007\u001a\u0015\u0010Q\u001a\u000208*\u0002082\u0006\u0010Q\u001a\u00020RH\u0087\u0004\u001a\u0015\u0010Q\u001a\u00020>*\u00020>2\u0006\u0010Q\u001a\u00020SH\u0087\u0004\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00012\u0006\u00109\u001a\u00020\u0001H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bU\u0010V\u001a\u001f\u0010T\u001a\u00020%*\u00020\u00052\u0006\u00109\u001a\u00020\u0005H\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u001f\u0010T\u001a\u00020/*\u00020\b2\u0006\u00109\u001a\u00020\bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\bY\u0010Z\u001a\u001f\u0010T\u001a\u00020%*\u00020\u000b2\u0006\u00109\u001a\u00020\u000bH\u0087\u0004ø\u0001\u0000¢\u0006\u0004\b[\u0010\\\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006]"}, d2 = {"coerceAtLeast", "Lkotlin/UByte;", "minimumValue", "coerceAtLeast-Kr8caGY", "(BB)B", "Lkotlin/UInt;", "coerceAtLeast-J1ME1BU", "(II)I", "Lkotlin/ULong;", "coerceAtLeast-eb3DHEI", "(JJ)J", "Lkotlin/UShort;", "coerceAtLeast-5PvTz6A", "(SS)S", "coerceAtMost", "maximumValue", "coerceAtMost-Kr8caGY", "coerceAtMost-J1ME1BU", "coerceAtMost-eb3DHEI", "coerceAtMost-5PvTz6A", "coerceIn", "coerceIn-b33U2AM", "(BBB)B", "coerceIn-WZ9TVnA", "(III)I", "range", "Lkotlin/ranges/ClosedRange;", "coerceIn-wuiCnnA", "(ILkotlin/ranges/ClosedRange;)I", "coerceIn-sambcqE", "(JJJ)J", "coerceIn-JPwROB0", "(JLkotlin/ranges/ClosedRange;)J", "coerceIn-VKSA0NQ", "(SSS)S", "contains", "", "Lkotlin/ranges/UIntRange;", "value", "contains-68kG9v0", "(Lkotlin/ranges/UIntRange;B)Z", "element", "contains-biwQdVI", "contains-fz5IDCE", "(Lkotlin/ranges/UIntRange;J)Z", "contains-ZsK3CEQ", "(Lkotlin/ranges/UIntRange;S)Z", "Lkotlin/ranges/ULongRange;", "contains-ULb-yJY", "(Lkotlin/ranges/ULongRange;B)Z", "contains-Gab390E", "(Lkotlin/ranges/ULongRange;I)Z", "contains-GYNo2lE", "contains-uhHAxoY", "(Lkotlin/ranges/ULongRange;S)Z", "downTo", "Lkotlin/ranges/UIntProgression;", "to", "downTo-Kr8caGY", "(BB)Lkotlin/ranges/UIntProgression;", "downTo-J1ME1BU", "(II)Lkotlin/ranges/UIntProgression;", "Lkotlin/ranges/ULongProgression;", "downTo-eb3DHEI", "(JJ)Lkotlin/ranges/ULongProgression;", "downTo-5PvTz6A", "(SS)Lkotlin/ranges/UIntProgression;", "first", "(Lkotlin/ranges/UIntProgression;)I", "(Lkotlin/ranges/ULongProgression;)J", "firstOrNull", "last", "lastOrNull", "random", "(Lkotlin/ranges/UIntRange;)I", "Lkotlin/random/Random;", "(Lkotlin/ranges/UIntRange;Lkotlin/random/Random;)I", "(Lkotlin/ranges/ULongRange;)J", "(Lkotlin/ranges/ULongRange;Lkotlin/random/Random;)J", "randomOrNull", "reversed", "step", "", "", "until", "until-Kr8caGY", "(BB)Lkotlin/ranges/UIntRange;", "until-J1ME1BU", "(II)Lkotlin/ranges/UIntRange;", "until-eb3DHEI", "(JJ)Lkotlin/ranges/ULongRange;", "until-5PvTz6A", "(SS)Lkotlin/ranges/UIntRange;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/ranges/URangesKt")
class URangesKt___URangesKt {
    public URangesKt___URangesKt() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: coerceAtLeast-5PvTz6A, reason: not valid java name */
    public static final short m2007coerceAtLeast5PvTz6A(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            if (r0 >= 0) goto Ld
            r2 = r3
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: coerceAtLeast-J1ME1BU, reason: not valid java name */
    public static final int m2008coerceAtLeastJ1ME1BU(int r1, int r2) {
            int r0 = java.lang.Integer.compareUnsigned(r1, r2)
            if (r0 >= 0) goto L7
            r1 = r2
        L7:
            return r1
    }

    /* JADX INFO: renamed from: coerceAtLeast-Kr8caGY, reason: not valid java name */
    public static final byte m2009coerceAtLeastKr8caGY(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 >= 0) goto Lb
            r2 = r3
        Lb:
            return r2
    }

    /* JADX INFO: renamed from: coerceAtLeast-eb3DHEI, reason: not valid java name */
    public static final long m2010coerceAtLeasteb3DHEI(long r1, long r3) {
            int r0 = java.lang.Long.compareUnsigned(r1, r3)
            if (r0 >= 0) goto L7
            r1 = r3
        L7:
            return r1
    }

    /* JADX INFO: renamed from: coerceAtMost-5PvTz6A, reason: not valid java name */
    public static final short m2011coerceAtMost5PvTz6A(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r2 & r0
            r0 = r0 & r3
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r1, r0)
            if (r0 <= 0) goto Ld
            r2 = r3
        Ld:
            return r2
    }

    /* JADX INFO: renamed from: coerceAtMost-J1ME1BU, reason: not valid java name */
    public static final int m2012coerceAtMostJ1ME1BU(int r1, int r2) {
            int r0 = java.lang.Integer.compareUnsigned(r1, r2)
            if (r0 <= 0) goto L7
            r1 = r2
        L7:
            return r1
    }

    /* JADX INFO: renamed from: coerceAtMost-Kr8caGY, reason: not valid java name */
    public static final byte m2013coerceAtMostKr8caGY(byte r2, byte r3) {
            r0 = r2 & 255(0xff, float:3.57E-43)
            r1 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r0 <= 0) goto Lb
            r2 = r3
        Lb:
            return r2
    }

    /* JADX INFO: renamed from: coerceAtMost-eb3DHEI, reason: not valid java name */
    public static final long m2014coerceAtMosteb3DHEI(long r1, long r3) {
            int r0 = java.lang.Long.compareUnsigned(r1, r3)
            if (r0 <= 0) goto L7
            r1 = r3
        L7:
            return r1
    }

    /* JADX INFO: renamed from: coerceIn-JPwROB0, reason: not valid java name */
    public static final long m2015coerceInJPwROB0(long r2, kotlin.ranges.ClosedRange<kotlin.ULong> r4) {
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r4 instanceof kotlin.ranges.ClosedFloatingPointRange
            if (r0 == 0) goto L1a
            kotlin.ULong r2 = kotlin.ULong.m935boximpl(r2)
            kotlin.ranges.ClosedFloatingPointRange r4 = (kotlin.ranges.ClosedFloatingPointRange) r4
            java.lang.Comparable r2 = kotlin.ranges.RangesKt.coerceIn(r2, r4)
            kotlin.ULong r2 = (kotlin.ULong) r2
            long r2 = r2.m993unboximpl()
            return r2
        L1a:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L56
            java.lang.Comparable r0 = r4.getStart()
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m993unboximpl()
            int r0 = java.lang.Long.compareUnsigned(r2, r0)
            if (r0 >= 0) goto L3b
            java.lang.Comparable r2 = r4.getStart()
            kotlin.ULong r2 = (kotlin.ULong) r2
            long r2 = r2.m993unboximpl()
            goto L55
        L3b:
            java.lang.Comparable r0 = r4.getEndInclusive()
            kotlin.ULong r0 = (kotlin.ULong) r0
            long r0 = r0.m993unboximpl()
            int r0 = java.lang.Long.compareUnsigned(r2, r0)
            if (r0 <= 0) goto L55
            java.lang.Comparable r2 = r4.getEndInclusive()
            kotlin.ULong r2 = (kotlin.ULong) r2
            long r2 = r2.m993unboximpl()
        L55:
            return r2
        L56:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot coerce value to an empty range: "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            r4 = 46
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: coerceIn-VKSA0NQ, reason: not valid java name */
    public static final short m2016coerceInVKSA0NQ(short r4, short r5, short r6) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = r5 & r0
            r2 = r6 & r0
            int r3 = kotlin.jvm.internal.Intrinsics.compare(r1, r2)
            if (r3 > 0) goto L1d
            r0 = r0 & r4
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r1 >= 0) goto L15
            return r5
        L15:
            int r5 = kotlin.jvm.internal.Intrinsics.compare(r0, r2)
            if (r5 <= 0) goto L1c
            return r6
        L1c:
            return r4
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            java.lang.String r6 = kotlin.UShort.m1092toStringimpl(r6)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r0 = " is less than minimum "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r5 = kotlin.UShort.m1092toStringimpl(r5)
            java.lang.StringBuilder r5 = r6.append(r5)
            r6 = 46
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: coerceIn-WZ9TVnA, reason: not valid java name */
    public static final int m2017coerceInWZ9TVnA(int r2, int r3, int r4) {
            int r0 = java.lang.Integer.compareUnsigned(r3, r4)
            if (r0 > 0) goto L15
            int r0 = java.lang.Integer.compareUnsigned(r2, r3)
            if (r0 >= 0) goto Ld
            return r3
        Ld:
            int r3 = java.lang.Integer.compareUnsigned(r2, r4)
            if (r3 <= 0) goto L14
            return r4
        L14:
            return r2
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            java.lang.String r4 = kotlin.UInt.m908toStringimpl(r4)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " is less than minimum "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r3 = kotlin.UInt.m908toStringimpl(r3)
            java.lang.StringBuilder r3 = r4.append(r3)
            r4 = 46
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: coerceIn-b33U2AM, reason: not valid java name */
    public static final byte m2018coerceInb33U2AM(byte r3, byte r4, byte r5) {
            r0 = r4 & 255(0xff, float:3.57E-43)
            r1 = r5 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.jvm.internal.Intrinsics.compare(r0, r1)
            if (r2 > 0) goto L1b
            r2 = r3 & 255(0xff, float:3.57E-43)
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r2, r0)
            if (r0 >= 0) goto L13
            return r4
        L13:
            int r4 = kotlin.jvm.internal.Intrinsics.compare(r2, r1)
            if (r4 <= 0) goto L1a
            return r5
        L1a:
            return r3
        L1b:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: maximum "
            r0.<init>(r1)
            java.lang.String r5 = kotlin.UByte.m829toStringimpl(r5)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = " is less than minimum "
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r4 = kotlin.UByte.m829toStringimpl(r4)
            java.lang.StringBuilder r4 = r5.append(r4)
            r5 = 46
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    /* JADX INFO: renamed from: coerceIn-sambcqE, reason: not valid java name */
    public static final long m2019coerceInsambcqE(long r1, long r3, long r5) {
            int r0 = java.lang.Long.compareUnsigned(r3, r5)
            if (r0 > 0) goto L15
            int r0 = java.lang.Long.compareUnsigned(r1, r3)
            if (r0 >= 0) goto Ld
            return r3
        Ld:
            int r3 = java.lang.Long.compareUnsigned(r1, r5)
            if (r3 <= 0) goto L14
            return r5
        L14:
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Cannot coerce value to an empty range: maximum "
            r2.<init>(r0)
            java.lang.String r5 = kotlin.ULong.m987toStringimpl(r5)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r5 = " is less than minimum "
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = kotlin.ULong.m987toStringimpl(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = 46
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    /* JADX INFO: renamed from: coerceIn-wuiCnnA, reason: not valid java name */
    public static final int m2020coerceInwuiCnnA(int r2, kotlin.ranges.ClosedRange<kotlin.UInt> r3) {
            java.lang.String r0 = "range"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3 instanceof kotlin.ranges.ClosedFloatingPointRange
            if (r0 == 0) goto L1a
            kotlin.UInt r2 = kotlin.UInt.m856boximpl(r2)
            kotlin.ranges.ClosedFloatingPointRange r3 = (kotlin.ranges.ClosedFloatingPointRange) r3
            java.lang.Comparable r2 = kotlin.ranges.RangesKt.coerceIn(r2, r3)
            kotlin.UInt r2 = (kotlin.UInt) r2
            int r2 = r2.m914unboximpl()
            return r2
        L1a:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L56
            java.lang.Comparable r0 = r3.getStart()
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.m914unboximpl()
            int r0 = java.lang.Integer.compareUnsigned(r2, r0)
            if (r0 >= 0) goto L3b
            java.lang.Comparable r2 = r3.getStart()
            kotlin.UInt r2 = (kotlin.UInt) r2
            int r2 = r2.m914unboximpl()
            goto L55
        L3b:
            java.lang.Comparable r0 = r3.getEndInclusive()
            kotlin.UInt r0 = (kotlin.UInt) r0
            int r0 = r0.m914unboximpl()
            int r0 = java.lang.Integer.compareUnsigned(r2, r0)
            if (r0 <= 0) goto L55
            java.lang.Comparable r2 = r3.getEndInclusive()
            kotlin.UInt r2 = (kotlin.UInt) r2
            int r2 = r2.m914unboximpl()
        L55:
            return r2
        L56:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot coerce value to an empty range: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            r0 = 46
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: contains-68kG9v0, reason: not valid java name */
    public static final boolean m2021contains68kG9v0(kotlin.ranges.UIntRange r1, byte r2) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            boolean r1 = r1.m1994containsWZ4Q5Ns(r2)
            return r1
    }

    /* JADX INFO: renamed from: contains-GYNo2lE, reason: not valid java name */
    private static final boolean m2022containsGYNo2lE(kotlin.ranges.ULongRange r2, kotlin.ULong r3) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            if (r3 == 0) goto L13
            long r0 = r3.m993unboximpl()
            boolean r2 = r2.m2003containsVKZWuLQ(r0)
            if (r2 == 0) goto L13
            r2 = 1
            goto L14
        L13:
            r2 = 0
        L14:
            return r2
    }

    /* JADX INFO: renamed from: contains-Gab390E, reason: not valid java name */
    public static final boolean m2023containsGab390E(kotlin.ranges.ULongRange r4, int r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            boolean r4 = r4.m2003containsVKZWuLQ(r0)
            return r4
    }

    /* JADX INFO: renamed from: contains-ULb-yJY, reason: not valid java name */
    public static final boolean m2024containsULbyJY(kotlin.ranges.ULongRange r4, byte r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r5
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            boolean r4 = r4.m2003containsVKZWuLQ(r0)
            return r4
    }

    /* JADX INFO: renamed from: contains-ZsK3CEQ, reason: not valid java name */
    public static final boolean m2025containsZsK3CEQ(kotlin.ranges.UIntRange r1, short r2) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            boolean r1 = r1.m1994containsWZ4Q5Ns(r2)
            return r1
    }

    /* JADX INFO: renamed from: contains-biwQdVI, reason: not valid java name */
    private static final boolean m2026containsbiwQdVI(kotlin.ranges.UIntRange r1, kotlin.UInt r2) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            if (r2 == 0) goto L13
            int r2 = r2.m914unboximpl()
            boolean r1 = r1.m1994containsWZ4Q5Ns(r2)
            if (r1 == 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    /* JADX INFO: renamed from: contains-fz5IDCE, reason: not valid java name */
    public static final boolean m2027containsfz5IDCE(kotlin.ranges.UIntRange r4, long r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 32
            long r0 = r5 >>> r0
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L20
            int r5 = (int) r5
            int r5 = kotlin.UInt.m862constructorimpl(r5)
            boolean r4 = r4.m1994containsWZ4Q5Ns(r5)
            if (r4 == 0) goto L20
            r4 = 1
            goto L21
        L20:
            r4 = 0
        L21:
            return r4
    }

    /* JADX INFO: renamed from: contains-uhHAxoY, reason: not valid java name */
    public static final boolean m2028containsuhHAxoY(kotlin.ranges.ULongRange r4, short r5) {
            java.lang.String r0 = "$this$contains"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            long r0 = (long) r5
            r2 = 65535(0xffff, double:3.23786E-319)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            boolean r4 = r4.m2003containsVKZWuLQ(r0)
            return r4
    }

    /* JADX INFO: renamed from: downTo-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m2029downTo5PvTz6A(short r2, short r3) {
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            r3 = r3 & r1
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            r1 = -1
            kotlin.ranges.UIntProgression r2 = r0.m1991fromClosedRangeNkh28Cs(r2, r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: downTo-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m2030downToJ1ME1BU(int r2, int r3) {
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            r1 = -1
            kotlin.ranges.UIntProgression r2 = r0.m1991fromClosedRangeNkh28Cs(r2, r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: downTo-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntProgression m2031downToKr8caGY(byte r2, byte r3) {
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            r1 = -1
            kotlin.ranges.UIntProgression r2 = r0.m1991fromClosedRangeNkh28Cs(r2, r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: downTo-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongProgression m2032downToeb3DHEI(long r7, long r9) {
            kotlin.ranges.ULongProgression$Companion r0 = kotlin.ranges.ULongProgression.Companion
            r5 = -1
            r1 = r7
            r3 = r9
            kotlin.ranges.ULongProgression r7 = r0.m2000fromClosedRange7ftBX0g(r1, r3, r5)
            return r7
    }

    public static final int first(kotlin.ranges.UIntProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            int r3 = r3.m1989getFirstpVg5ArA()
            return r3
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Progression "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is empty."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final long first(kotlin.ranges.ULongProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            long r0 = r3.m1998getFirstsVKNKU()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Progression "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is empty."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final kotlin.UInt firstOrNull(kotlin.ranges.UIntProgression r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            int r1 = r1.m1989getFirstpVg5ArA()
            kotlin.UInt r1 = kotlin.UInt.m856boximpl(r1)
        L15:
            return r1
    }

    public static final kotlin.ULong firstOrNull(kotlin.ranges.ULongProgression r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            r2 = 0
            goto L15
        Ld:
            long r0 = r2.m1998getFirstsVKNKU()
            kotlin.ULong r2 = kotlin.ULong.m935boximpl(r0)
        L15:
            return r2
    }

    public static final int last(kotlin.ranges.UIntProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            int r3 = r3.m1990getLastpVg5ArA()
            return r3
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Progression "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is empty."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final long last(kotlin.ranges.ULongProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L10
            long r0 = r3.m1999getLastsVKNKU()
            return r0
        L10:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Progression "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is empty."
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final kotlin.UInt lastOrNull(kotlin.ranges.UIntProgression r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Ld
            r1 = 0
            goto L15
        Ld:
            int r1 = r1.m1990getLastpVg5ArA()
            kotlin.UInt r1 = kotlin.UInt.m856boximpl(r1)
        L15:
            return r1
    }

    public static final kotlin.ULong lastOrNull(kotlin.ranges.ULongProgression r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto Ld
            r2 = 0
            goto L15
        Ld:
            long r0 = r2.m1999getLastsVKNKU()
            kotlin.ULong r2 = kotlin.ULong.m935boximpl(r0)
        L15:
            return r2
    }

    private static final int random(kotlin.ranges.UIntRange r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            int r1 = kotlin.ranges.URangesKt.random(r1, r0)
            return r1
    }

    public static final int random(kotlin.ranges.UIntRange r1, kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r1 = kotlin.random.URandomKt.nextUInt(r2, r1)     // Catch: java.lang.IllegalArgumentException -> Lf
            return r1
        Lf:
            r1 = move-exception
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r1 = r1.getMessage()
            r2.<init>(r1)
            throw r2
    }

    private static final long random(kotlin.ranges.ULongRange r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            long r0 = kotlin.ranges.URangesKt.random(r2, r0)
            return r0
    }

    public static final long random(kotlin.ranges.ULongRange r1, kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            long r1 = kotlin.random.URandomKt.nextULong(r2, r1)     // Catch: java.lang.IllegalArgumentException -> Lf
            return r1
        Lf:
            r1 = move-exception
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            java.lang.String r1 = r1.getMessage()
            r2.<init>(r1)
            throw r2
    }

    private static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            kotlin.UInt r1 = kotlin.ranges.URangesKt.randomOrNull(r1, r0)
            return r1
    }

    public static final kotlin.UInt randomOrNull(kotlin.ranges.UIntRange r1, kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L12
            r1 = 0
            return r1
        L12:
            int r1 = kotlin.random.URandomKt.nextUInt(r2, r1)
            kotlin.UInt r1 = kotlin.UInt.m856boximpl(r1)
            return r1
    }

    private static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.random.Random$Default r0 = kotlin.random.Random.Default
            kotlin.random.Random r0 = (kotlin.random.Random) r0
            kotlin.ULong r1 = kotlin.ranges.URangesKt.randomOrNull(r1, r0)
            return r1
    }

    public static final kotlin.ULong randomOrNull(kotlin.ranges.ULongRange r1, kotlin.random.Random r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "random"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L12
            r1 = 0
            return r1
        L12:
            long r1 = kotlin.random.URandomKt.nextULong(r2, r1)
            kotlin.ULong r1 = kotlin.ULong.m935boximpl(r1)
            return r1
    }

    public static final kotlin.ranges.UIntProgression reversed(kotlin.ranges.UIntProgression r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            int r1 = r3.m1990getLastpVg5ArA()
            int r2 = r3.m1989getFirstpVg5ArA()
            int r3 = r3.getStep()
            int r3 = -r3
            kotlin.ranges.UIntProgression r3 = r0.m1991fromClosedRangeNkh28Cs(r1, r2, r3)
            return r3
    }

    public static final kotlin.ranges.ULongProgression reversed(kotlin.ranges.ULongProgression r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            kotlin.ranges.ULongProgression$Companion r1 = kotlin.ranges.ULongProgression.Companion
            long r2 = r8.m1999getLastsVKNKU()
            long r4 = r8.m1998getFirstsVKNKU()
            long r6 = r8.getStep()
            long r6 = -r6
            kotlin.ranges.ULongProgression r8 = r1.m2000fromClosedRange7ftBX0g(r2, r4, r6)
            return r8
    }

    public static final kotlin.ranges.UIntProgression step(kotlin.ranges.UIntProgression r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r4 <= 0) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            java.lang.Number r1 = (java.lang.Number) r1
            kotlin.ranges.RangesKt.checkStepIsPositive(r0, r1)
            kotlin.ranges.UIntProgression$Companion r0 = kotlin.ranges.UIntProgression.Companion
            int r1 = r3.m1989getFirstpVg5ArA()
            int r2 = r3.m1990getLastpVg5ArA()
            int r3 = r3.getStep()
            if (r3 <= 0) goto L24
            goto L25
        L24:
            int r4 = -r4
        L25:
            kotlin.ranges.UIntProgression r3 = r0.m1991fromClosedRangeNkh28Cs(r1, r2, r4)
            return r3
    }

    public static final kotlin.ranges.ULongProgression step(kotlin.ranges.ULongProgression r11, long r12) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.Long r3 = java.lang.Long.valueOf(r12)
            java.lang.Number r3 = (java.lang.Number) r3
            kotlin.ranges.RangesKt.checkStepIsPositive(r2, r3)
            kotlin.ranges.ULongProgression$Companion r4 = kotlin.ranges.ULongProgression.Companion
            long r5 = r11.m1998getFirstsVKNKU()
            long r7 = r11.m1999getLastsVKNKU()
            long r2 = r11.getStep()
            int r11 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r11 <= 0) goto L2a
            goto L2b
        L2a:
            long r12 = -r12
        L2b:
            r9 = r12
            kotlin.ranges.ULongProgression r11 = r4.m2000fromClosedRange7ftBX0g(r5, r7, r9)
            return r11
    }

    /* JADX INFO: renamed from: until-5PvTz6A, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m2033until5PvTz6A(short r2, short r3) {
            r0 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r0
            r1 = 0
            int r1 = kotlin.jvm.internal.Intrinsics.compare(r3, r1)
            if (r1 > 0) goto L12
            kotlin.ranges.UIntRange$Companion r2 = kotlin.ranges.UIntRange.Companion
            kotlin.ranges.UIntRange r2 = r2.getEMPTY()
            return r2
        L12:
            r2 = r2 & r0
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            int r3 = r3 + (-1)
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: until-J1ME1BU, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m2034untilJ1ME1BU(int r2, int r3) {
            r0 = 0
            int r0 = java.lang.Integer.compareUnsigned(r3, r0)
            if (r0 > 0) goto Le
            kotlin.ranges.UIntRange$Companion r2 = kotlin.ranges.UIntRange.Companion
            kotlin.ranges.UIntRange r2 = r2.getEMPTY()
            return r2
        Le:
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            int r3 = r3 + (-1)
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: until-Kr8caGY, reason: not valid java name */
    public static final kotlin.ranges.UIntRange m2035untilKr8caGY(byte r2, byte r3) {
            r3 = r3 & 255(0xff, float:3.57E-43)
            r0 = 0
            int r0 = kotlin.jvm.internal.Intrinsics.compare(r3, r0)
            if (r0 > 0) goto L10
            kotlin.ranges.UIntRange$Companion r2 = kotlin.ranges.UIntRange.Companion
            kotlin.ranges.UIntRange r2 = r2.getEMPTY()
            return r2
        L10:
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = kotlin.UInt.m862constructorimpl(r2)
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            int r3 = r3 + (-1)
            int r3 = kotlin.UInt.m862constructorimpl(r3)
            kotlin.ranges.UIntRange r0 = new kotlin.ranges.UIntRange
            r1 = 0
            r0.<init>(r2, r3, r1)
            return r0
    }

    /* JADX INFO: renamed from: until-eb3DHEI, reason: not valid java name */
    public static final kotlin.ranges.ULongRange m2036untileb3DHEI(long r6, long r8) {
            r0 = 0
            int r0 = java.lang.Long.compareUnsigned(r8, r0)
            if (r0 > 0) goto Lf
            kotlin.ranges.ULongRange$Companion r6 = kotlin.ranges.ULongRange.Companion
            kotlin.ranges.ULongRange r6 = r6.getEMPTY()
            return r6
        Lf:
            r0 = 1
            long r0 = (long) r0
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            long r0 = kotlin.ULong.m941constructorimpl(r0)
            long r8 = r8 - r0
            long r3 = kotlin.ULong.m941constructorimpl(r8)
            kotlin.ranges.ULongRange r8 = new kotlin.ranges.ULongRange
            r5 = 0
            r0 = r8
            r1 = r6
            r0.<init>(r1, r3, r5)
            return r8
    }
}
