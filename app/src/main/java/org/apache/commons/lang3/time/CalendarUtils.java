package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class CalendarUtils {
    public static final org.apache.commons.lang3.time.CalendarUtils INSTANCE = null;
    private final java.util.Calendar calendar;
    private final java.util.Locale locale;

    static {
            org.apache.commons.lang3.time.CalendarUtils r0 = getInstance()
            org.apache.commons.lang3.time.CalendarUtils.INSTANCE = r0
            return
    }

    public CalendarUtils(java.util.Calendar r2) {
            r1 = this;
            java.util.Locale r0 = java.util.Locale.getDefault()
            r1.<init>(r2, r0)
            return
    }

    CalendarUtils(java.util.Calendar r2, java.util.Locale r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "calendar"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.util.Calendar r2 = (java.util.Calendar) r2
            r1.calendar = r2
            java.lang.String r2 = "locale"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
            java.util.Locale r2 = (java.util.Locale) r2
            r1.locale = r2
            return
    }

    public static org.apache.commons.lang3.time.CalendarUtils getInstance() {
            org.apache.commons.lang3.time.CalendarUtils r0 = new org.apache.commons.lang3.time.CalendarUtils
            java.util.Calendar r1 = java.util.Calendar.getInstance()
            r0.<init>(r1)
            return r0
    }

    static org.apache.commons.lang3.time.CalendarUtils getInstance(java.util.Locale r2) {
            org.apache.commons.lang3.time.CalendarUtils r0 = new org.apache.commons.lang3.time.CalendarUtils
            java.util.Calendar r1 = java.util.Calendar.getInstance(r2)
            r0.<init>(r1, r2)
            return r0
    }

    static /* synthetic */ void lambda$getMonthDisplayNames$0(java.lang.String[] r0, java.lang.String r1, java.lang.Integer r2) {
            int r2 = r2.intValue()
            r0[r2] = r1
            return
    }

    public int getDayOfMonth() {
            r2 = this;
            java.util.Calendar r0 = r2.calendar
            r1 = 5
            int r0 = r0.get(r1)
            return r0
    }

    public int getDayOfYear() {
            r2 = this;
            java.util.Calendar r0 = r2.calendar
            r1 = 6
            int r0 = r0.get(r1)
            return r0
    }

    public int getMonth() {
            r2 = this;
            java.util.Calendar r0 = r2.calendar
            r1 = 2
            int r0 = r0.get(r1)
            return r0
    }

    java.lang.String[] getMonthDisplayNames(int r4) {
            r3 = this;
            java.util.Calendar r0 = r3.calendar
            r1 = 2
            java.util.Locale r2 = r3.locale
            java.util.Map r4 = r0.getDisplayNames(r1, r4, r2)
            if (r4 != 0) goto Ld
            r4 = 0
            return r4
        Ld:
            int r0 = r4.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            org.apache.commons.lang3.time.CalendarUtils$$ExternalSyntheticLambda0 r1 = new org.apache.commons.lang3.time.CalendarUtils$$ExternalSyntheticLambda0
            r1.<init>(r0)
            r4.forEach(r1)
            return r0
    }

    java.lang.String[] getStandaloneLongMonthNames() {
            r1 = this;
            r0 = 32770(0x8002, float:4.592E-41)
            java.lang.String[] r0 = r1.getMonthDisplayNames(r0)
            return r0
    }

    java.lang.String[] getStandaloneShortMonthNames() {
            r1 = this;
            r0 = 32769(0x8001, float:4.5919E-41)
            java.lang.String[] r0 = r1.getMonthDisplayNames(r0)
            return r0
    }

    public int getYear() {
            r2 = this;
            java.util.Calendar r0 = r2.calendar
            r1 = 1
            int r0 = r0.get(r1)
            return r0
    }
}
