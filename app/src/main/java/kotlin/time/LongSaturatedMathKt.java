package kotlin.time;

/* JADX INFO: compiled from: longSaturatedMath.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a*\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\t\u001a*\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a*\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000e\u001a(\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a(\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class LongSaturatedMathKt {
    /* JADX INFO: renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m2220checkInfiniteSumDefinedPjuGub4(long r0, long r2, long r4) {
            boolean r2 = kotlin.time.Duration.m2124isInfiniteimpl(r2)
            if (r2 == 0) goto L17
            long r2 = r0 ^ r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto Lf
            goto L17
        Lf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Summing infinities of different signs"
            r0.<init>(r1)
            throw r0
        L17:
            return r0
    }

    private static final long infinityOfSign(long r2) {
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 >= 0) goto Ld
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            long r2 = r2.m2194getNEG_INFINITEUwyO8pc$kotlin_stdlib()
            goto L13
        Ld:
            kotlin.time.Duration$Companion r2 = kotlin.time.Duration.Companion
            long r2 = r2.m2193getINFINITEUwyO8pc()
        L13:
            return r2
    }

    public static final boolean isSaturated(long r2) {
            r0 = 1
            long r2 = r2 - r0
            long r2 = r2 | r0
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    /* JADX INFO: renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m2221saturatingAddNuflL3o(long r9, kotlin.time.DurationUnit r11, long r12) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            long r5 = kotlin.time.Duration.m2138toLongimpl(r12, r11)
            r0 = 1
            long r2 = r9 - r0
            long r2 = r2 | r0
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L1e
            r1 = r9
            r3 = r12
            long r9 = m2220checkInfiniteSumDefinedPjuGub4(r1, r3, r5)
            return r9
        L1e:
            long r2 = r5 - r0
            long r0 = r0 | r2
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 != 0) goto L2a
            long r9 = m2222saturatingAddInHalvesNuflL3o(r9, r11, r12)
            return r9
        L2a:
            long r11 = r9 + r5
            long r0 = r9 ^ r11
            long r2 = r5 ^ r11
            long r0 = r0 & r2
            r2 = 0
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 >= 0) goto L3e
            int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r9 >= 0) goto L3d
            r7 = -9223372036854775808
        L3d:
            return r7
        L3e:
            return r11
    }

    /* JADX INFO: renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m2222saturatingAddInHalvesNuflL3o(long r8, kotlin.time.DurationUnit r10, long r11) {
            r0 = 2
            long r0 = kotlin.time.Duration.m2095divUwyO8pc(r11, r0)
            long r2 = kotlin.time.Duration.m2138toLongimpl(r0, r10)
            r4 = 1
            long r6 = r2 - r4
            long r4 = r4 | r6
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L18
            return r2
        L18:
            long r8 = m2221saturatingAddNuflL3o(r8, r10, r0)
            long r11 = kotlin.time.Duration.m2127minusLRDsOJo(r11, r0)
            long r8 = m2221saturatingAddNuflL3o(r8, r10, r11)
            return r8
    }

    public static final long saturatingDiff(long r4, long r6, kotlin.time.DurationUnit r8) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = 1
            long r2 = r6 - r0
            long r0 = r0 | r2
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L1c
            long r4 = infinityOfSign(r6)
            long r4 = kotlin.time.Duration.m2145unaryMinusUwyO8pc(r4)
            return r4
        L1c:
            long r4 = saturatingFiniteDiff(r4, r6, r8)
            return r4
    }

    private static final long saturatingFiniteDiff(long r6, long r8, kotlin.time.DurationUnit r10) {
            long r0 = r6 - r8
            long r2 = r0 ^ r6
            long r4 = r0 ^ r8
            long r4 = ~r4
            long r2 = r2 & r4
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L42
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r10.compareTo(r2)
            if (r2 >= 0) goto L39
            r0 = 1
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r0, r2, r10)
            long r2 = r6 / r0
            long r4 = r8 / r0
            long r2 = r2 - r4
            long r6 = r6 % r0
            long r8 = r8 % r0
            long r6 = r6 - r8
            kotlin.time.Duration$Companion r8 = kotlin.time.Duration.Companion
            kotlin.time.DurationUnit r8 = kotlin.time.DurationUnit.MILLISECONDS
            long r8 = kotlin.time.DurationKt.toDuration(r2, r8)
            long r6 = kotlin.time.DurationKt.toDuration(r6, r10)
            long r6 = kotlin.time.Duration.m2128plusLRDsOJo(r8, r6)
            return r6
        L39:
            long r6 = infinityOfSign(r0)
            long r6 = kotlin.time.Duration.m2145unaryMinusUwyO8pc(r6)
            return r6
        L42:
            long r6 = kotlin.time.DurationKt.toDuration(r0, r10)
            return r6
    }

    public static final long saturatingOriginsDiff(long r6, long r8, kotlin.time.DurationUnit r10) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            r0 = 1
            long r2 = r8 - r0
            long r2 = r2 | r0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L27
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 != 0) goto L1e
            kotlin.time.Duration$Companion r6 = kotlin.time.Duration.Companion
            long r6 = r6.m2195getZEROUwyO8pc()
            return r6
        L1e:
            long r6 = infinityOfSign(r8)
            long r6 = kotlin.time.Duration.m2145unaryMinusUwyO8pc(r6)
            return r6
        L27:
            long r2 = r6 - r0
            long r0 = r0 | r2
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto L33
            long r6 = infinityOfSign(r6)
            return r6
        L33:
            long r6 = saturatingFiniteDiff(r6, r8, r10)
            return r6
    }
}
