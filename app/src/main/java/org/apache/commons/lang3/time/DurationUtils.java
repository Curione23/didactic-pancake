package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class DurationUtils {
    static final org.apache.commons.lang3.LongRange LONG_TO_INT_RANGE = null;

    /* JADX INFO: renamed from: org.apache.commons.lang3.time.DurationUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$util$concurrent$TimeUnit = null;

        static {
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit = r0
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L1d
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L28
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L33
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L3e
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L49
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit     // Catch: java.lang.NoSuchFieldError -> L54
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }
    }

    static {
            java.lang.Long r0 = org.apache.commons.lang3.math.NumberUtils.LONG_INT_MIN_VALUE
            java.lang.Long r1 = org.apache.commons.lang3.math.NumberUtils.LONG_INT_MAX_VALUE
            org.apache.commons.lang3.LongRange r0 = org.apache.commons.lang3.LongRange.of(r0, r1)
            org.apache.commons.lang3.time.DurationUtils.LONG_TO_INT_RANGE = r0
            return
    }

    @java.lang.Deprecated
    public DurationUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends java.lang.Throwable> void accept(org.apache.commons.lang3.function.FailableBiConsumer<java.lang.Long, java.lang.Integer, T> r2, java.time.Duration r3) throws java.lang.Throwable {
            if (r2 == 0) goto L17
            if (r3 == 0) goto L17
            long r0 = r3.toMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r3 = getNanosOfMilli(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.accept(r0, r3)
        L17:
            return
    }

    @java.lang.Deprecated
    public static int getNanosOfMiili(java.time.Duration r0) {
            int r0 = getNanosOfMilli(r0)
            return r0
    }

    public static int getNanosOfMilli(java.time.Duration r1) {
            java.time.Duration r1 = zeroIfNull(r1)
            int r1 = r1.getNano()
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r1 = r1 % r0
            return r1
    }

    public static boolean isPositive(java.time.Duration r1) {
            boolean r0 = r1.isNegative()
            if (r0 != 0) goto Le
            boolean r1 = r1.isZero()
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    static /* synthetic */ void lambda$of$0(org.apache.commons.lang3.function.FailableRunnable r0, java.time.Instant r1) throws java.lang.Throwable {
            r0.run()
            return
    }

    private static <E extends java.lang.Throwable> java.time.Instant now(org.apache.commons.lang3.function.FailableConsumer<java.time.Instant, E> r1) throws java.lang.Throwable {
            java.time.Instant r0 = java.time.Instant.now()
            r1.accept(r0)
            return r0
    }

    public static <E extends java.lang.Throwable> java.time.Duration of(org.apache.commons.lang3.function.FailableConsumer<java.time.Instant, E> r1) throws java.lang.Throwable {
            java.util.Objects.requireNonNull(r1)
            org.apache.commons.lang3.time.DurationUtils$$ExternalSyntheticLambda1 r0 = new org.apache.commons.lang3.time.DurationUtils$$ExternalSyntheticLambda1
            r0.<init>(r1)
            java.time.Instant r1 = now(r0)
            java.time.Duration r1 = since(r1)
            return r1
    }

    public static <E extends java.lang.Throwable> java.time.Duration of(org.apache.commons.lang3.function.FailableRunnable<E> r1) throws java.lang.Throwable {
            org.apache.commons.lang3.time.DurationUtils$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.time.DurationUtils$$ExternalSyntheticLambda0
            r0.<init>(r1)
            java.time.Duration r1 = of(r0)
            return r1
    }

    public static java.time.Duration since(java.time.temporal.Temporal r1) {
            java.time.Instant r0 = java.time.Instant.now()
            java.time.Duration r1 = java.time.Duration.between(r1, r0)
            return r1
    }

    static java.time.temporal.ChronoUnit toChronoUnit(java.util.concurrent.TimeUnit r2) {
            int[] r0 = org.apache.commons.lang3.time.DurationUtils.AnonymousClass1.$SwitchMap$java$util$concurrent$TimeUnit
            java.lang.Object r1 = java.util.Objects.requireNonNull(r2)
            java.util.concurrent.TimeUnit r1 = (java.util.concurrent.TimeUnit) r1
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2d;
                case 2: goto L2a;
                case 3: goto L27;
                case 4: goto L24;
                case 5: goto L21;
                case 6: goto L1e;
                case 7: goto L1b;
                default: goto L11;
            }
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L1b:
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.DAYS
            return r2
        L1e:
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.HOURS
            return r2
        L21:
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.MINUTES
            return r2
        L24:
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.SECONDS
            return r2
        L27:
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.MILLIS
            return r2
        L2a:
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.MICROS
            return r2
        L2d:
            java.time.temporal.ChronoUnit r2 = java.time.temporal.ChronoUnit.NANOS
            return r2
    }

    public static java.time.Duration toDuration(long r0, java.util.concurrent.TimeUnit r2) {
            java.time.temporal.ChronoUnit r2 = toChronoUnit(r2)
            java.time.Duration r0 = java.time.Duration.of(r0, r2)
            return r0
    }

    public static int toMillisInt(java.time.Duration r3) {
            java.lang.String r0 = "duration"
            java.util.Objects.requireNonNull(r3, r0)
            org.apache.commons.lang3.LongRange r0 = org.apache.commons.lang3.time.DurationUtils.LONG_TO_INT_RANGE
            long r1 = r3.toMillis()
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            java.lang.Object r3 = r0.fit(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            int r3 = r3.intValue()
            return r3
    }

    public static java.time.Duration zeroIfNull(java.time.Duration r1) {
            java.time.Duration r0 = java.time.Duration.ZERO
            java.lang.Object r1 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(r1, r0)
            java.time.Duration r1 = (java.time.Duration) r1
            return r1
    }
}
