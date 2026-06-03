package kotlin.time;

/* JADX INFO: compiled from: Duration.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b*\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0005H\u0002ø\u0001\u0000¢\u0006\u0002\u0010&\u001a\u0018\u0010'\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010)\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010+\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010-\u001a\u00020\u00072\u0006\u0010.\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u0010\u001a\u0010\u0010/\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u0001H\u0002\u001a\u0010\u00100\u001a\u00020\u00012\u0006\u0010.\u001a\u00020\u0001H\u0002\u001a \u00101\u001a\u00020\u00072\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0002ø\u0001\u0000¢\u0006\u0002\u00106\u001a\u0010\u00107\u001a\u00020\u00012\u0006\u00102\u001a\u000203H\u0002\u001a)\u00108\u001a\u00020\u0005*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a)\u0010=\u001a\u000203*\u0002032\u0006\u00109\u001a\u00020\u00052\u0012\u0010:\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u0002050;H\u0082\b\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\b2\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\b@\u0010A\u001a\u001f\u0010>\u001a\u00020\u0007*\u00020\u00052\u0006\u0010?\u001a\u00020\u0007H\u0087\nø\u0001\u0000¢\u0006\u0004\bB\u0010C\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\b2\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010G\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00052\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010H\u001a\u001c\u0010D\u001a\u00020\u0007*\u00020\u00012\u0006\u0010E\u001a\u00020FH\u0007ø\u0001\u0000¢\u0006\u0002\u0010I\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000\"!\u0010\u0006\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\r\u001a\u0004\b\u000b\u0010\u000e\"!\u0010\u0006\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\t\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010\"!\u0010\u0011\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\f\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000e\"!\u0010\u0011\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0010\"!\u0010\u0014\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\f\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000e\"!\u0010\u0014\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0010\"!\u0010\u0017\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\f\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000e\"!\u0010\u0017\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0010\"!\u0010\u001a\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\n\u001a\u0004\b\u001c\u0010\f\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\r\u001a\u0004\b\u001c\u0010\u000e\"!\u0010\u001a\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0010\"!\u0010\u001d\u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\n\u001a\u0004\b\u001f\u0010\f\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\r\u001a\u0004\b\u001f\u0010\u000e\"!\u0010\u001d\u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001e\u0010\u000f\u001a\u0004\b\u001f\u0010\u0010\"!\u0010 \u001a\u00020\u0007*\u00020\b8FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\n\u001a\u0004\b\"\u0010\f\"!\u0010 \u001a\u00020\u0007*\u00020\u00058FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\r\u001a\u0004\b\"\u0010\u000e\"!\u0010 \u001a\u00020\u0007*\u00020\u00018FX\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b!\u0010\u000f\u001a\u0004\b\"\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006J"}, d2 = {"MAX_MILLIS", "", "MAX_NANOS", "MAX_NANOS_IN_MILLIS", "NANOS_IN_MILLIS", "", "days", "Lkotlin/time/Duration;", "", "getDays$annotations", "(D)V", "getDays", "(D)J", "(I)V", "(I)J", "(J)V", "(J)J", "hours", "getHours$annotations", "getHours", "microseconds", "getMicroseconds$annotations", "getMicroseconds", "milliseconds", "getMilliseconds$annotations", "getMilliseconds", "minutes", "getMinutes$annotations", "getMinutes", "nanoseconds", "getNanoseconds$annotations", "getNanoseconds", "seconds", "getSeconds$annotations", "getSeconds", "durationOf", "normalValue", "unitDiscriminator", "(JI)J", "durationOfMillis", "normalMillis", "durationOfMillisNormalized", "millis", "durationOfNanos", "normalNanos", "durationOfNanosNormalized", "nanos", "millisToNanos", "nanosToMillis", "parseDuration", "value", "", "strictIso", "", "(Ljava/lang/String;Z)J", "parseOverLongIsoComponent", "skipWhile", "startIndex", "predicate", "Lkotlin/Function1;", "", "substringWhile", "times", "duration", "times-kIfJnKk", "(DJ)J", "times-mvk6XK0", "(IJ)J", "toDuration", "unit", "Lkotlin/time/DurationUnit;", "(DLkotlin/time/DurationUnit;)J", "(ILkotlin/time/DurationUnit;)J", "(JLkotlin/time/DurationUnit;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class DurationKt {
    public static final long MAX_MILLIS = 4611686018427387903L;
    public static final long MAX_NANOS = 4611686018426999999L;
    private static final long MAX_NANOS_IN_MILLIS = 4611686018426L;
    public static final int NANOS_IN_MILLIS = 1000000;

    public static final /* synthetic */ long access$durationOf(long r0, int r2) {
            long r0 = durationOf(r0, r2)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillis(long r0) {
            long r0 = durationOfMillis(r0)
            return r0
    }

    public static final /* synthetic */ long access$durationOfMillisNormalized(long r0) {
            long r0 = durationOfMillisNormalized(r0)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanos(long r0) {
            long r0 = durationOfNanos(r0)
            return r0
    }

    public static final /* synthetic */ long access$durationOfNanosNormalized(long r0) {
            long r0 = durationOfNanosNormalized(r0)
            return r0
    }

    public static final /* synthetic */ long access$millisToNanos(long r0) {
            long r0 = millisToNanos(r0)
            return r0
    }

    public static final /* synthetic */ long access$nanosToMillis(long r0) {
            long r0 = nanosToMillis(r0)
            return r0
    }

    public static final /* synthetic */ long access$parseDuration(java.lang.String r0, boolean r1) {
            long r0 = parseDuration(r0, r1)
            return r0
    }

    private static final long durationOf(long r2, int r4) {
            r0 = 1
            long r2 = r2 << r0
            long r0 = (long) r4
            long r2 = r2 + r0
            long r2 = kotlin.time.Duration.m2092constructorimpl(r2)
            return r2
    }

    private static final long durationOfMillis(long r2) {
            r0 = 1
            long r2 = r2 << r0
            r0 = 1
            long r2 = r2 + r0
            long r2 = kotlin.time.Duration.m2092constructorimpl(r2)
            return r2
    }

    private static final long durationOfMillisNormalized(long r6) {
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426(0xfffffbce4217d286, double:NaN)
            r3 = 4611686018426(0x431bde82d7a, double:2.2784756311107E-311)
            r0.<init>(r1, r3)
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L1e
            long r6 = millisToNanos(r6)
            long r6 = durationOfNanos(r6)
            goto L31
        L1e:
            r2 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            r0 = r6
            long r6 = kotlin.ranges.RangesKt.coerceIn(r0, r2, r4)
            long r6 = durationOfMillis(r6)
        L31:
            return r6
    }

    private static final long durationOfNanos(long r1) {
            r0 = 1
            long r1 = r1 << r0
            long r1 = kotlin.time.Duration.m2092constructorimpl(r1)
            return r1
    }

    private static final long durationOfNanosNormalized(long r5) {
            kotlin.ranges.LongRange r0 = new kotlin.ranges.LongRange
            r1 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r3 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r0.<init>(r1, r3)
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L1a
            long r5 = durationOfNanos(r5)
            goto L22
        L1a:
            long r5 = nanosToMillis(r5)
            long r5 = durationOfMillis(r5)
        L22:
            return r5
    }

    public static final /* synthetic */ long getDays(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final /* synthetic */ long getDays(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getDays(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.DAYS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.days", imports = {"kotlin.time.Duration.Companion.days"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getDays$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getHours(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final /* synthetic */ long getHours(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getHours(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.HOURS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getHours$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMicroseconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final /* synthetic */ long getMicroseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMicroseconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MICROSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMicroseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMilliseconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final /* synthetic */ long getMilliseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMilliseconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMilliseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getMinutes(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final /* synthetic */ long getMinutes(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getMinutes(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MINUTES
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getMinutes$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getNanoseconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final /* synthetic */ long getNanoseconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getNanoseconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getNanoseconds$annotations(long r0) {
            return
    }

    public static final /* synthetic */ long getSeconds(double r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    public static final /* synthetic */ long getSeconds(int r2) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r0 = toDuration(r2, r0)
            return r0
    }

    public static final /* synthetic */ long getSeconds(long r1) {
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            long r1 = toDuration(r1, r0)
            return r1
    }

    @kotlin.Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(double r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(int r0) {
            return
    }

    @kotlin.Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getSeconds$annotations(long r0) {
            return
    }

    private static final long millisToNanos(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r2 * r0
            return r2
    }

    private static final long nanosToMillis(long r2) {
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0
            long r2 = r2 / r0
            return r2
    }

    private static final long parseDuration(java.lang.String r27, boolean r28) {
            r6 = r27
            int r7 = r27.length()
            if (r7 == 0) goto L2e2
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r8 = r0.m2195getZEROUwyO8pc()
            r10 = 0
            char r0 = r6.charAt(r10)
            r1 = 43
            r2 = 45
            r11 = 1
            if (r0 != r1) goto L1b
            goto L1d
        L1b:
            if (r0 != r2) goto L1f
        L1d:
            r12 = r11
            goto L20
        L1f:
            r12 = r10
        L20:
            if (r12 <= 0) goto L24
            r13 = r11
            goto L25
        L24:
            r13 = r10
        L25:
            r0 = 2
            r14 = 0
            if (r13 == 0) goto L34
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.startsWith$default(r1, r2, r10, r0, r14)
            if (r1 == 0) goto L34
            r15 = r11
            goto L35
        L34:
            r15 = r10
        L35:
            java.lang.String r5 = "No components"
            if (r7 <= r12) goto L2db
            char r1 = r6.charAt(r12)
            r2 = 80
            java.lang.String r4 = "this as java.lang.String).substring(startIndex)"
            java.lang.String r3 = "Unexpected order of duration components"
            r16 = r5
            r5 = 57
            r0 = 48
            java.lang.String r10 = "this as java.lang.String…ing(startIndex, endIndex)"
            java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
            if (r1 != r2) goto L16e
            int r12 = r12 + r11
            if (r12 == r7) goto L168
            r1 = 0
            r2 = 0
        L54:
            if (r12 >= r7) goto L164
            char r13 = r6.charAt(r12)
            r11 = 84
            if (r13 != r11) goto L6d
            if (r1 != 0) goto L67
            int r12 = r12 + 1
            if (r12 == r7) goto L67
            r1 = 1
        L65:
            r11 = 1
            goto L54
        L67:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L6d:
            r11 = r12
        L6e:
            int r13 = r27.length()
            if (r11 >= r13) goto La4
            char r13 = r6.charAt(r11)
            r18 = r15
            kotlin.ranges.CharRange r15 = new kotlin.ranges.CharRange
            r15.<init>(r0, r5)
            boolean r15 = r15.contains(r13)
            if (r15 != 0) goto L95
            java.lang.String r15 = "+-."
            java.lang.CharSequence r15 = (java.lang.CharSequence) r15
            r17 = r7
            r0 = 2
            r5 = 0
            r7 = 0
            boolean r13 = kotlin.text.StringsKt.contains$default(r15, r13, r7, r0, r5)
            if (r13 == 0) goto Laa
            goto L99
        L95:
            r17 = r7
            r0 = 2
            r5 = 0
        L99:
            int r11 = r11 + 1
            r7 = r17
            r15 = r18
            r0 = 48
            r5 = 57
            goto L6e
        La4:
            r17 = r7
            r18 = r15
            r0 = 2
            r5 = 0
        Laa:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r14)
            java.lang.String r7 = r6.substring(r12, r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r10)
            r20 = r7
            java.lang.CharSequence r20 = (java.lang.CharSequence) r20
            int r11 = r20.length()
            if (r11 == 0) goto L15e
            int r11 = r7.length()
            int r12 = r12 + r11
            r11 = r6
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            if (r12 < 0) goto L149
            int r13 = kotlin.text.StringsKt.getLastIndex(r11)
            if (r12 > r13) goto L149
            char r11 = r11.charAt(r12)
            int r12 = r12 + 1
            kotlin.time.DurationUnit r11 = kotlin.time.DurationUnitKt.durationUnitByIsoChar(r11, r1)
            if (r2 == 0) goto Lea
            r13 = r11
            java.lang.Enum r13 = (java.lang.Enum) r13
            int r2 = r2.compareTo(r13)
            if (r2 <= 0) goto Le4
            goto Lea
        Le4:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r3)
            throw r0
        Lea:
            r24 = 6
            r25 = 0
            r21 = 46
            r22 = 0
            r23 = 0
            int r2 = kotlin.text.StringsKt.indexOf$default(r20, r21, r22, r23, r24, r25)
            kotlin.time.DurationUnit r13 = kotlin.time.DurationUnit.SECONDS
            if (r11 != r13) goto L12e
            if (r2 <= 0) goto L12e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r14)
            r13 = 0
            java.lang.String r15 = r7.substring(r13, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r10)
            r28 = r1
            long r0 = parseOverLongIsoComponent(r15)
            long r0 = toDuration(r0, r11)
            long r0 = kotlin.time.Duration.m2128plusLRDsOJo(r8, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7, r14)
            java.lang.String r2 = r7.substring(r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            double r7 = java.lang.Double.parseDouble(r2)
            long r7 = toDuration(r7, r11)
            long r8 = kotlin.time.Duration.m2128plusLRDsOJo(r0, r7)
            goto L13c
        L12e:
            r28 = r1
            long r0 = parseOverLongIsoComponent(r7)
            long r0 = toDuration(r0, r11)
            long r8 = kotlin.time.Duration.m2128plusLRDsOJo(r8, r0)
        L13c:
            r1 = r28
            r2 = r11
            r7 = r17
            r15 = r18
            r0 = 48
            r5 = 57
            goto L65
        L149:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing unit for value "
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L15e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L164:
            r18 = r15
            goto L2ce
        L168:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L16e:
            r17 = r7
            r18 = r15
            r5 = 0
            if (r28 != 0) goto L2d5
            int r7 = r17 - r12
            java.lang.String r2 = "Infinity"
            int r0 = r2.length()
            int r7 = java.lang.Math.max(r7, r0)
            r11 = 1
            r15 = 0
            r1 = 48
            r0 = r27
            r1 = r12
            r26 = r3
            r3 = r15
            r15 = r4
            r4 = r7
            r7 = r16
            r16 = r5
            r5 = r11
            boolean r0 = kotlin.text.StringsKt.regionMatches(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L1a0
            kotlin.time.Duration$Companion r0 = kotlin.time.Duration.Companion
            long r8 = r0.m2193getINFINITEUwyO8pc()
            goto L2ce
        L1a0:
            r0 = r13 ^ 1
            if (r13 == 0) goto L1c8
            char r1 = r6.charAt(r12)
            r2 = 40
            if (r1 != r2) goto L1c8
            r1 = r6
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            char r1 = kotlin.text.StringsKt.last(r1)
            r2 = 41
            if (r1 != r2) goto L1c8
            int r12 = r12 + 1
            int r0 = r17 + (-1)
            if (r12 == r0) goto L1c2
            r7 = r0
            r2 = r16
            r0 = 1
            goto L1cc
        L1c2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L1c8:
            r2 = r16
            r7 = r17
        L1cc:
            r1 = 0
        L1cd:
            if (r12 >= r7) goto L2ce
            if (r1 == 0) goto L1e4
            if (r0 == 0) goto L1e4
        L1d3:
            int r1 = r27.length()
            if (r12 >= r1) goto L1e4
            char r1 = r6.charAt(r12)
            r3 = 32
            if (r1 != r3) goto L1e4
            int r12 = r12 + 1
            goto L1d3
        L1e4:
            r1 = r12
        L1e5:
            int r3 = r27.length()
            if (r1 >= r3) goto L205
            char r3 = r6.charAt(r1)
            kotlin.ranges.CharRange r4 = new kotlin.ranges.CharRange
            r5 = 57
            r11 = 48
            r4.<init>(r11, r5)
            boolean r4 = r4.contains(r3)
            if (r4 != 0) goto L202
            r4 = 46
            if (r3 != r4) goto L209
        L202:
            int r1 = r1 + 1
            goto L1e5
        L205:
            r5 = 57
            r11 = 48
        L209:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r14)
            java.lang.String r1 = r6.substring(r12, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r10)
            r19 = r1
            java.lang.CharSequence r19 = (java.lang.CharSequence) r19
            int r3 = r19.length()
            if (r3 == 0) goto L2c8
            int r3 = r1.length()
            int r12 = r12 + r3
            r3 = r12
        L223:
            int r4 = r27.length()
            if (r3 >= r4) goto L243
            char r4 = r6.charAt(r3)
            kotlin.ranges.CharRange r13 = new kotlin.ranges.CharRange
            r5 = 97
            r11 = 122(0x7a, float:1.71E-43)
            r13.<init>(r5, r11)
            boolean r4 = r13.contains(r4)
            if (r4 == 0) goto L243
            int r3 = r3 + 1
            r5 = 57
            r11 = 48
            goto L223
        L243:
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6, r14)
            java.lang.String r3 = r6.substring(r12, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r10)
            int r4 = r3.length()
            int r12 = r12 + r4
            kotlin.time.DurationUnit r3 = kotlin.time.DurationUnitKt.durationUnitByShortName(r3)
            if (r2 == 0) goto L26a
            r4 = r3
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r2 = r2.compareTo(r4)
            if (r2 <= 0) goto L262
            goto L26a
        L262:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r2 = r26
            r0.<init>(r2)
            throw r0
        L26a:
            r2 = r26
            r23 = 6
            r24 = 0
            r20 = 46
            r21 = 0
            r22 = 0
            int r4 = kotlin.text.StringsKt.indexOf$default(r19, r20, r21, r22, r23, r24)
            if (r4 <= 0) goto L2b4
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r14)
            r5 = 0
            java.lang.String r11 = r1.substring(r5, r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
            long r5 = java.lang.Long.parseLong(r11)
            long r5 = toDuration(r5, r3)
            long r5 = kotlin.time.Duration.m2128plusLRDsOJo(r8, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r14)
            java.lang.String r1 = r1.substring(r4)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r15)
            double r8 = java.lang.Double.parseDouble(r1)
            long r8 = toDuration(r8, r3)
            long r8 = kotlin.time.Duration.m2128plusLRDsOJo(r5, r8)
            if (r12 < r7) goto L2ac
            goto L2c0
        L2ac:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Fractional component must be last"
            r0.<init>(r1)
            throw r0
        L2b4:
            long r4 = java.lang.Long.parseLong(r1)
            long r4 = toDuration(r4, r3)
            long r8 = kotlin.time.Duration.m2128plusLRDsOJo(r8, r4)
        L2c0:
            r6 = r27
            r26 = r2
            r2 = r3
            r1 = 1
            goto L1cd
        L2c8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L2ce:
            if (r18 == 0) goto L2d4
            long r8 = kotlin.time.Duration.m2145unaryMinusUwyO8pc(r8)
        L2d4:
            return r8
        L2d5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L2db:
            r7 = r5
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r7)
            throw r0
        L2e2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "The string is empty"
            r0.<init>(r1)
            throw r0
    }

    private static final long parseOverLongIsoComponent(java.lang.String r9) {
            int r0 = r9.length()
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            if (r0 <= 0) goto L1a
            java.lang.String r5 = "+-"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            char r6 = r9.charAt(r4)
            boolean r5 = kotlin.text.StringsKt.contains$default(r5, r6, r4, r3, r2)
            if (r5 == 0) goto L1a
            r5 = r1
            goto L1b
        L1a:
            r5 = r4
        L1b:
            int r0 = r0 - r5
            r6 = 16
            if (r0 <= r6) goto L72
            kotlin.ranges.IntRange r0 = new kotlin.ranges.IntRange
            r6 = r9
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = kotlin.text.StringsKt.getLastIndex(r6)
            r0.<init>(r5, r6)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r5 = r0 instanceof java.util.Collection
            if (r5 == 0) goto L3c
            r5 = r0
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L3c
            goto L61
        L3c:
            java.util.Iterator r0 = r0.iterator()
        L40:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L61
            r5 = r0
            kotlin.collections.IntIterator r5 = (kotlin.collections.IntIterator) r5
            int r5 = r5.nextInt()
            kotlin.ranges.CharRange r6 = new kotlin.ranges.CharRange
            r7 = 48
            r8 = 57
            r6.<init>(r7, r8)
            char r5 = r9.charAt(r5)
            boolean r5 = r6.contains(r5)
            if (r5 != 0) goto L40
            goto L72
        L61:
            char r9 = r9.charAt(r4)
            r0 = 45
            if (r9 != r0) goto L6c
            r0 = -9223372036854775808
            goto L71
        L6c:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L71:
            return r0
        L72:
            java.lang.String r0 = "+"
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r9, r0, r4, r3, r2)
            if (r0 == 0) goto L7e
            java.lang.String r9 = kotlin.text.StringsKt.drop(r9, r1)
        L7e:
            long r0 = java.lang.Long.parseLong(r9)
            return r0
    }

    private static final int skipWhile(java.lang.String r1, int r2, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r3) {
        L0:
            int r0 = r1.length()
            if (r2 >= r0) goto L1d
            char r0 = r1.charAt(r2)
            java.lang.Character r0 = java.lang.Character.valueOf(r0)
            java.lang.Object r0 = r3.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1d
            int r2 = r2 + 1
            goto L0
        L1d:
            return r2
    }

    private static final java.lang.String substringWhile(java.lang.String r2, int r3, kotlin.jvm.functions.Function1<? super java.lang.Character, java.lang.Boolean> r4) {
            r0 = r3
        L1:
            int r1 = r2.length()
            if (r0 >= r1) goto L1e
            char r1 = r2.charAt(r0)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1e
            int r0 = r0 + 1
            goto L1
        L1e:
            java.lang.String r4 = "null cannot be cast to non-null type java.lang.String"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r2, r4)
            java.lang.String r2 = r2.substring(r3, r0)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            return r2
    }

    /* JADX INFO: renamed from: times-kIfJnKk, reason: not valid java name */
    private static final long m2218timeskIfJnKk(double r0, long r2) {
            long r0 = kotlin.time.Duration.m2129timesUwyO8pc(r2, r0)
            return r0
    }

    /* JADX INFO: renamed from: times-mvk6XK0, reason: not valid java name */
    private static final long m2219timesmvk6XK0(int r0, long r1) {
            long r0 = kotlin.time.Duration.m2130timesUwyO8pc(r1, r0)
            return r0
    }

    public static final long toDuration(double r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            double r0 = kotlin.time.DurationUnitKt.convertDurationUnit(r7, r9, r0)
            boolean r2 = java.lang.Double.isNaN(r0)
            if (r2 != 0) goto L3e
            long r0 = kotlin.math.MathKt.roundToLong(r0)
            kotlin.ranges.LongRange r2 = new kotlin.ranges.LongRange
            r3 = -4611686018426999999(0xc00000000005eb41, double:-2.0000000001722644)
            r5 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            r2.<init>(r3, r5)
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L2f
            long r7 = durationOfNanos(r0)
            goto L3d
        L2f:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            double r7 = kotlin.time.DurationUnitKt.convertDurationUnit(r7, r9, r0)
            long r7 = kotlin.math.MathKt.roundToLong(r7)
            long r7 = durationOfMillisNormalized(r7)
        L3d:
            return r7
        L3e:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Duration value cannot be NaN."
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
    }

    public static final long toDuration(int r2, kotlin.time.DurationUnit r3) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.SECONDS
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r3.compareTo(r0)
            if (r0 > 0) goto L1b
            long r0 = (long) r2
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r2 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r0, r3, r2)
            long r2 = durationOfNanos(r2)
            goto L20
        L1b:
            long r0 = (long) r2
            long r2 = toDuration(r0, r3)
        L20:
            return r2
    }

    public static final long toDuration(long r7, kotlin.time.DurationUnit r9) {
            java.lang.String r0 = "unit"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.NANOSECONDS
            long r0 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r0, r2, r9)
            kotlin.ranges.LongRange r2 = new kotlin.ranges.LongRange
            long r3 = -r0
            r2.<init>(r3, r0)
            boolean r0 = r2.contains(r7)
            if (r0 == 0) goto L27
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.NANOSECONDS
            long r7 = kotlin.time.DurationUnitKt.convertDurationUnitOverflow(r7, r9, r0)
            long r7 = durationOfNanos(r7)
            return r7
        L27:
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r1 = kotlin.time.DurationUnitKt.convertDurationUnit(r7, r9, r0)
            r3 = -4611686018427387903(0xc000000000000001, double:-2.0000000000000004)
            r5 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r7 = kotlin.ranges.RangesKt.coerceIn(r1, r3, r5)
            long r7 = durationOfMillis(r7)
            return r7
    }
}
