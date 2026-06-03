package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeUtils {
    static final long HUNDRED_NANOS_PER_MILLISECOND = 0;
    static final long WINDOWS_EPOCH_OFFSET = -116444736000000000L;

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            r1 = 1
            long r0 = r0.toNanos(r1)
            r2 = 100
            long r0 = r0 / r2
            org.apache.commons.compress.utils.TimeUtils.HUNDRED_NANOS_PER_MILLISECOND = r0
            return
    }

    private TimeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static boolean isUnixTime(long r0) {
            boolean r0 = org.apache.commons.io.file.attribute.FileTimes.isUnixTime(r0)
            return r0
    }

    @java.lang.Deprecated
    public static boolean isUnixTime(java.nio.file.attribute.FileTime r0) {
            boolean r0 = org.apache.commons.io.file.attribute.FileTimes.isUnixTime(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.Date ntfsTimeToDate(long r0) {
            java.util.Date r0 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToDate(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.nio.file.attribute.FileTime ntfsTimeToFileTime(long r0) {
            java.nio.file.attribute.FileTime r0 = org.apache.commons.io.file.attribute.FileTimes.ntfsTimeToFileTime(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.util.Date toDate(java.nio.file.attribute.FileTime r0) {
            java.util.Date r0 = org.apache.commons.io.file.attribute.FileTimes.toDate(r0)
            return r0
    }

    @java.lang.Deprecated
    public static java.nio.file.attribute.FileTime toFileTime(java.util.Date r0) {
            java.nio.file.attribute.FileTime r0 = org.apache.commons.io.file.attribute.FileTimes.toFileTime(r0)
            return r0
    }

    @java.lang.Deprecated
    public static long toNtfsTime(long r0) {
            long r0 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r0)
            return r0
    }

    @java.lang.Deprecated
    public static long toNtfsTime(java.nio.file.attribute.FileTime r2) {
            long r0 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r2)
            return r0
    }

    @java.lang.Deprecated
    public static long toNtfsTime(java.util.Date r2) {
            long r0 = org.apache.commons.io.file.attribute.FileTimes.toNtfsTime(r2)
            return r0
    }

    public static long toUnixTime(java.nio.file.attribute.FileTime r2) {
            long r0 = org.apache.commons.io.file.attribute.FileTimes.toUnixTime(r2)
            return r0
    }

    public static java.nio.file.attribute.FileTime truncateToHundredNanos(java.nio.file.attribute.FileTime r4) {
            java.time.Instant r4 = r4.toInstant()
            long r0 = r4.getEpochSecond()
            int r4 = r4.getNano()
            int r4 = r4 / 100
            int r4 = r4 * 100
            long r2 = (long) r4
            java.time.Instant r4 = java.time.Instant.ofEpochSecond(r0, r2)
            java.nio.file.attribute.FileTime r4 = java.nio.file.attribute.FileTime.from(r4)
            return r4
    }

    @java.lang.Deprecated
    public static java.nio.file.attribute.FileTime unixTimeToFileTime(long r0) {
            java.nio.file.attribute.FileTime r0 = org.apache.commons.io.file.attribute.FileTimes.fromUnixTime(r0)
            return r0
    }
}
