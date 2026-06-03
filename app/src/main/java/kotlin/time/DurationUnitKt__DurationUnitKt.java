package kotlin.time;

/* JADX INFO: compiled from: DurationUnit.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0001\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0001¨\u0006\t"}, d2 = {"durationUnitByIsoChar", "Lkotlin/time/DurationUnit;", "isoChar", "", "isTimeComponent", "", "durationUnitByShortName", "shortName", "", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
class DurationUnitKt__DurationUnitKt extends kotlin.time.DurationUnitKt__DurationUnitJvmKt {

    /* JADX INFO: compiled from: DurationUnit.kt */
    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                kotlin.time.DurationUnit[] r0 = kotlin.time.DurationUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L3d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3d
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3d
            L3d:
                kotlin.time.DurationUnit r1 = kotlin.time.DurationUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L46
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L46
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L46
            L46:
                kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    public DurationUnitKt__DurationUnitKt() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final kotlin.time.DurationUnit durationUnitByIsoChar(char r2, boolean r3) {
            if (r3 != 0) goto L1e
            r3 = 68
            if (r2 != r3) goto L9
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.DAYS
            goto L32
        L9:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid or unsupported duration ISO non-time unit: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
        L1e:
            r3 = 72
            if (r2 != r3) goto L25
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.HOURS
            goto L32
        L25:
            r3 = 77
            if (r2 != r3) goto L2c
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.MINUTES
            goto L32
        L2c:
            r3 = 83
            if (r2 != r3) goto L33
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.SECONDS
        L32:
            return r2
        L33:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid duration ISO time unit: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static final kotlin.time.DurationUnit durationUnitByShortName(java.lang.String r3) {
            java.lang.String r0 = "shortName"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r3.hashCode()
            r1 = 100
            if (r0 == r1) goto L67
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L5c
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L51
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L46
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L3b
            r1 = 3525(0xdc5, float:4.94E-42)
            if (r0 == r1) goto L30
            r1 = 3742(0xe9e, float:5.244E-42)
            if (r0 != r1) goto L72
            java.lang.String r0 = "us"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MICROSECONDS
            goto L71
        L30:
            java.lang.String r0 = "ns"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.NANOSECONDS
            goto L71
        L3b:
            java.lang.String r0 = "ms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MILLISECONDS
            goto L71
        L46:
            java.lang.String r0 = "s"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.SECONDS
            goto L71
        L51:
            java.lang.String r0 = "m"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.MINUTES
            goto L71
        L5c:
            java.lang.String r0 = "h"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.HOURS
            goto L71
        L67:
            java.lang.String r0 = "d"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L72
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnit.DAYS
        L71:
            return r3
        L72:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown duration unit short name: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static final java.lang.String shortName(kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int[] r0 = kotlin.time.DurationUnitKt__DurationUnitKt.WhenMappings.$EnumSwitchMapping$0
            int r1 = r3.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L3b;
                case 2: goto L38;
                case 3: goto L35;
                case 4: goto L32;
                case 5: goto L2f;
                case 6: goto L2c;
                case 7: goto L29;
                default: goto L10;
            }
        L10:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown unit: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L29:
            java.lang.String r3 = "d"
            goto L3d
        L2c:
            java.lang.String r3 = "h"
            goto L3d
        L2f:
            java.lang.String r3 = "m"
            goto L3d
        L32:
            java.lang.String r3 = "s"
            goto L3d
        L35:
            java.lang.String r3 = "ms"
            goto L3d
        L38:
            java.lang.String r3 = "us"
            goto L3d
        L3b:
            java.lang.String r3 = "ns"
        L3d:
            return r3
    }
}
