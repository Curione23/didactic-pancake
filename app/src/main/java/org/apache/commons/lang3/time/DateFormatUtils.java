package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class DateFormatUtils {
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_DATETIME_FORMAT = null;
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT = null;
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_DATE_FORMAT = null;
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_TIME_FORMAT = null;
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATETIME_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATETIME_TIME_ZONE_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATE_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_DATE_TIME_ZONE_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_NO_T_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_NO_T_TIME_ZONE_FORMAT = null;

    @java.lang.Deprecated
    public static final org.apache.commons.lang3.time.FastDateFormat ISO_TIME_TIME_ZONE_FORMAT = null;
    public static final org.apache.commons.lang3.time.FastDateFormat SMTP_DATETIME_FORMAT = null;
    private static final java.util.TimeZone UTC_TIME_ZONE = null;

    static {
            java.util.TimeZone r0 = org.apache.commons.lang3.time.FastTimeZone.getGmtTimeZone()
            org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE = r0
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ss"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT = r0
            org.apache.commons.lang3.time.DateFormatUtils.ISO_DATETIME_FORMAT = r0
            java.lang.String r0 = "yyyy-MM-dd'T'HH:mm:ssZZ"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_8601_EXTENDED_DATETIME_TIME_ZONE_FORMAT = r0
            org.apache.commons.lang3.time.DateFormatUtils.ISO_DATETIME_TIME_ZONE_FORMAT = r0
            java.lang.String r0 = "yyyy-MM-dd"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT = r0
            org.apache.commons.lang3.time.DateFormatUtils.ISO_DATE_FORMAT = r0
            java.lang.String r0 = "yyyy-MM-ddZZ"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_DATE_TIME_ZONE_FORMAT = r0
            java.lang.String r0 = "'T'HH:mm:ss"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_FORMAT = r0
            java.lang.String r0 = "'T'HH:mm:ssZZ"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_TIME_ZONE_FORMAT = r0
            java.lang.String r0 = "HH:mm:ss"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_8601_EXTENDED_TIME_FORMAT = r0
            org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_FORMAT = r0
            java.lang.String r0 = "HH:mm:ssZZ"
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0)
            org.apache.commons.lang3.time.DateFormatUtils.ISO_8601_EXTENDED_TIME_TIME_ZONE_FORMAT = r0
            org.apache.commons.lang3.time.DateFormatUtils.ISO_TIME_NO_T_TIME_ZONE_FORMAT = r0
            java.lang.String r0 = "EEE, dd MMM yyyy HH:mm:ss Z"
            java.util.Locale r1 = java.util.Locale.US
            org.apache.commons.lang3.time.FastDateFormat r0 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r0, r1)
            org.apache.commons.lang3.time.DateFormatUtils.SMTP_DATETIME_FORMAT = r0
            return
    }

    @java.lang.Deprecated
    public DateFormatUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String format(long r1, java.lang.String r3) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            r1 = 0
            java.lang.String r1 = format(r0, r3, r1, r1)
            return r1
    }

    public static java.lang.String format(long r1, java.lang.String r3, java.util.Locale r4) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            r1 = 0
            java.lang.String r1 = format(r0, r3, r1, r4)
            return r1
    }

    public static java.lang.String format(long r1, java.lang.String r3, java.util.TimeZone r4) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            r1 = 0
            java.lang.String r1 = format(r0, r3, r4, r1)
            return r1
    }

    public static java.lang.String format(long r1, java.lang.String r3, java.util.TimeZone r4, java.util.Locale r5) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.lang.String r1 = format(r0, r3, r4, r5)
            return r1
    }

    public static java.lang.String format(java.util.Calendar r2, java.lang.String r3) {
            java.util.TimeZone r0 = getTimeZone(r2)
            r1 = 0
            java.lang.String r2 = format(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String format(java.util.Calendar r1, java.lang.String r2, java.util.Locale r3) {
            java.util.TimeZone r0 = getTimeZone(r1)
            java.lang.String r1 = format(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String format(java.util.Calendar r1, java.lang.String r2, java.util.TimeZone r3) {
            r0 = 0
            java.lang.String r1 = format(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String format(java.util.Calendar r0, java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.FastDateFormat r1 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r1, r2, r3)
            java.lang.String r0 = r1.format(r0)
            return r0
    }

    public static java.lang.String format(java.util.Date r1, java.lang.String r2) {
            r0 = 0
            java.lang.String r1 = format(r1, r2, r0, r0)
            return r1
    }

    public static java.lang.String format(java.util.Date r1, java.lang.String r2, java.util.Locale r3) {
            r0 = 0
            java.lang.String r1 = format(r1, r2, r0, r3)
            return r1
    }

    public static java.lang.String format(java.util.Date r1, java.lang.String r2, java.util.TimeZone r3) {
            r0 = 0
            java.lang.String r1 = format(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String format(java.util.Date r0, java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.FastDateFormat r1 = org.apache.commons.lang3.time.FastDateFormat.getInstance(r1, r2, r3)
            java.lang.String r0 = r1.format(r0)
            return r0
    }

    public static java.lang.String formatUTC(long r1, java.lang.String r3) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.util.TimeZone r1 = org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE
            r2 = 0
            java.lang.String r1 = format(r0, r3, r1, r2)
            return r1
    }

    public static java.lang.String formatUTC(long r1, java.lang.String r3, java.util.Locale r4) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            java.util.TimeZone r1 = org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE
            java.lang.String r1 = format(r0, r3, r1, r4)
            return r1
    }

    public static java.lang.String formatUTC(java.util.Date r2, java.lang.String r3) {
            java.util.TimeZone r0 = org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE
            r1 = 0
            java.lang.String r2 = format(r2, r3, r0, r1)
            return r2
    }

    public static java.lang.String formatUTC(java.util.Date r1, java.lang.String r2, java.util.Locale r3) {
            java.util.TimeZone r0 = org.apache.commons.lang3.time.DateFormatUtils.UTC_TIME_ZONE
            java.lang.String r1 = format(r1, r2, r0, r3)
            return r1
    }

    private static java.util.TimeZone getTimeZone(java.util.Calendar r0) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.util.TimeZone r0 = r0.getTimeZone()
        L8:
            return r0
    }
}
