package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class DateUtils {
    public static final long MILLIS_PER_DAY = 86400000;
    public static final long MILLIS_PER_HOUR = 3600000;
    public static final long MILLIS_PER_MINUTE = 60000;
    public static final long MILLIS_PER_SECOND = 1000;
    public static final int RANGE_MONTH_MONDAY = 6;
    public static final int RANGE_MONTH_SUNDAY = 5;
    public static final int RANGE_WEEK_CENTER = 4;
    public static final int RANGE_WEEK_MONDAY = 2;
    public static final int RANGE_WEEK_RELATIVE = 3;
    public static final int RANGE_WEEK_SUNDAY = 1;
    public static final int SEMI_MONTH = 1001;
    private static final int[][] fields = null;

    static class DateIterator implements java.util.Iterator<java.util.Calendar> {
        private final java.util.Calendar endFinal;
        private final java.util.Calendar spot;

        DateIterator(java.util.Calendar r2, java.util.Calendar r3) {
                r1 = this;
                r1.<init>()
                r1.endFinal = r3
                r1.spot = r2
                r3 = 5
                r0 = -1
                r2.add(r3, r0)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                java.util.Calendar r0 = r2.spot
                java.util.Calendar r1 = r2.endFinal
                boolean r0 = r0.before(r1)
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.util.Calendar next() {
                r1 = this;
                java.util.Calendar r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public java.util.Calendar next2() {
                r3 = this;
                java.util.Calendar r0 = r3.spot
                java.util.Calendar r1 = r3.endFinal
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L1a
                java.util.Calendar r0 = r3.spot
                r1 = 5
                r2 = 1
                r0.add(r1, r2)
                java.util.Calendar r0 = r3.spot
                java.lang.Object r0 = r0.clone()
                java.util.Calendar r0 = (java.util.Calendar) r0
                return r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    private enum ModifyType extends java.lang.Enum<org.apache.commons.lang3.time.DateUtils.ModifyType> {
        private static final /* synthetic */ org.apache.commons.lang3.time.DateUtils.ModifyType[] $VALUES = null;
        public static final org.apache.commons.lang3.time.DateUtils.ModifyType CEILING = null;
        public static final org.apache.commons.lang3.time.DateUtils.ModifyType ROUND = null;
        public static final org.apache.commons.lang3.time.DateUtils.ModifyType TRUNCATE = null;

        private static /* synthetic */ org.apache.commons.lang3.time.DateUtils.ModifyType[] $values() {
                org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
                org.apache.commons.lang3.time.DateUtils$ModifyType r1 = org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND
                org.apache.commons.lang3.time.DateUtils$ModifyType r2 = org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING
                org.apache.commons.lang3.time.DateUtils$ModifyType[] r0 = new org.apache.commons.lang3.time.DateUtils.ModifyType[]{r0, r1, r2}
                return r0
        }

        static {
                org.apache.commons.lang3.time.DateUtils$ModifyType r0 = new org.apache.commons.lang3.time.DateUtils$ModifyType
                java.lang.String r1 = "TRUNCATE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE = r0
                org.apache.commons.lang3.time.DateUtils$ModifyType r0 = new org.apache.commons.lang3.time.DateUtils$ModifyType
                java.lang.String r1 = "ROUND"
                r2 = 1
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND = r0
                org.apache.commons.lang3.time.DateUtils$ModifyType r0 = new org.apache.commons.lang3.time.DateUtils$ModifyType
                java.lang.String r1 = "CEILING"
                r2 = 2
                r0.<init>(r1, r2)
                org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING = r0
                org.apache.commons.lang3.time.DateUtils$ModifyType[] r0 = $values()
                org.apache.commons.lang3.time.DateUtils.ModifyType.$VALUES = r0
                return
        }

        ModifyType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.lang3.time.DateUtils.ModifyType valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.lang3.time.DateUtils$ModifyType> r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.lang3.time.DateUtils$ModifyType r1 = (org.apache.commons.lang3.time.DateUtils.ModifyType) r1
                return r1
        }

        public static org.apache.commons.lang3.time.DateUtils.ModifyType[] values() {
                org.apache.commons.lang3.time.DateUtils$ModifyType[] r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.lang3.time.DateUtils$ModifyType[] r0 = (org.apache.commons.lang3.time.DateUtils.ModifyType[]) r0
                return r0
        }
    }

    static {
            r0 = 14
            int[] r1 = new int[]{r0}
            r0 = 13
            int[] r2 = new int[]{r0}
            r0 = 12
            int[] r3 = new int[]{r0}
            r0 = 11
            r4 = 10
            int[] r4 = new int[]{r0, r4}
            r0 = 5
            r5 = 9
            int[] r5 = new int[]{r0, r0, r5}
            r0 = 2
            r6 = 1001(0x3e9, float:1.403E-42)
            int[] r6 = new int[]{r0, r6}
            r0 = 1
            int[] r7 = new int[]{r0}
            r0 = 0
            int[] r8 = new int[]{r0}
            int[][] r0 = new int[][]{r1, r2, r3, r4, r5, r6, r7, r8}
            org.apache.commons.lang3.time.DateUtils.fields = r0
            return
    }

    @java.lang.Deprecated
    public DateUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.util.Date add(java.util.Date r1, int r2, int r3) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            r0.add(r2, r3)
            java.util.Date r1 = r0.getTime()
            return r1
    }

    public static java.util.Date addDays(java.util.Date r1, int r2) {
            r0 = 5
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addHours(java.util.Date r1, int r2) {
            r0 = 11
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addMilliseconds(java.util.Date r1, int r2) {
            r0 = 14
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addMinutes(java.util.Date r1, int r2) {
            r0 = 12
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addMonths(java.util.Date r1, int r2) {
            r0 = 2
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addSeconds(java.util.Date r1, int r2) {
            r0 = 13
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addWeeks(java.util.Date r1, int r2) {
            r0 = 3
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Date addYears(java.util.Date r1, int r2) {
            r0 = 1
            java.util.Date r1 = add(r1, r0, r2)
            return r1
    }

    public static java.util.Calendar ceiling(java.util.Calendar r1, int r2) {
            java.lang.String r0 = "calendar"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.Object r1 = r1.clone()
            java.util.Calendar r1 = (java.util.Calendar) r1
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING
            java.util.Calendar r1 = modify(r1, r2, r0)
            return r1
    }

    public static java.util.Date ceiling(java.lang.Object r2, int r3) {
            java.lang.String r0 = "date"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto L10
            java.util.Date r2 = (java.util.Date) r2
            java.util.Date r2 = ceiling(r2, r3)
            return r2
        L10:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L1f
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Calendar r2 = ceiling(r2, r3)
            java.util.Date r2 = r2.getTime()
            return r2
        L1f:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not find ceiling of for type: "
            r0.<init>(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static java.util.Date ceiling(java.util.Date r1, int r2) {
            java.util.Calendar r1 = toCalendar(r1)
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING
            java.util.Calendar r1 = modify(r1, r2, r0)
            java.util.Date r1 = r1.getTime()
            return r1
    }

    private static long getFragment(java.util.Calendar r7, int r8, java.util.concurrent.TimeUnit r9) {
            java.lang.String r0 = "calendar"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 1
            if (r9 != r0) goto Lc
            r0 = 0
            goto Ld
        Lc:
            r0 = r1
        Ld:
            r2 = 6
            r3 = 5
            r4 = 2
            if (r8 == r1) goto L24
            if (r8 == r4) goto L17
            r5 = 0
            goto L30
        L17:
            int r5 = r7.get(r3)
            int r5 = r5 - r0
            long r5 = (long) r5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r5 = r9.convert(r5, r0)
            goto L30
        L24:
            int r5 = r7.get(r2)
            int r5 = r5 - r0
            long r5 = (long) r5
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r5 = r9.convert(r5, r0)
        L30:
            if (r8 == r1) goto L56
            if (r8 == r4) goto L56
            if (r8 == r3) goto L56
            if (r8 == r2) goto L56
            switch(r8) {
                case 11: goto L64;
                case 12: goto L72;
                case 13: goto L80;
                case 14: goto L8e;
                default: goto L3b;
            }
        L3b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "The fragment "
            r9.<init>(r0)
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r9 = " is not supported"
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L56:
            r8 = 11
            int r8 = r7.get(r8)
            long r0 = (long) r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.HOURS
            long r0 = r9.convert(r0, r8)
            long r5 = r5 + r0
        L64:
            r8 = 12
            int r8 = r7.get(r8)
            long r0 = (long) r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MINUTES
            long r0 = r9.convert(r0, r8)
            long r5 = r5 + r0
        L72:
            r8 = 13
            int r8 = r7.get(r8)
            long r0 = (long) r8
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r9.convert(r0, r8)
            long r5 = r5 + r0
        L80:
            r8 = 14
            int r7 = r7.get(r8)
            long r7 = (long) r7
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r7 = r9.convert(r7, r0)
            long r5 = r5 + r7
        L8e:
            return r5
    }

    private static long getFragment(java.util.Date r1, int r2, java.util.concurrent.TimeUnit r3) {
            validateDateNotNull(r1)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r0.setTime(r1)
            long r1 = getFragment(r0, r2, r3)
            return r1
    }

    public static long getFragmentInDays(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInDays(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInHours(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInHours(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.HOURS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMilliseconds(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMilliseconds(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMinutes(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInMinutes(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInSeconds(java.util.Calendar r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static long getFragmentInSeconds(java.util.Date r1, int r2) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r1 = getFragment(r1, r2, r0)
            return r1
    }

    public static boolean isSameDay(java.util.Calendar r4, java.util.Calendar r5) {
            java.lang.String r0 = "cal1"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "cal2"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 0
            int r1 = r4.get(r0)
            int r2 = r5.get(r0)
            if (r1 != r2) goto L2c
            r1 = 1
            int r2 = r4.get(r1)
            int r3 = r5.get(r1)
            if (r2 != r3) goto L2c
            r2 = 6
            int r4 = r4.get(r2)
            int r5 = r5.get(r2)
            if (r4 != r5) goto L2c
            r0 = r1
        L2c:
            return r0
    }

    public static boolean isSameDay(java.util.Date r0, java.util.Date r1) {
            java.util.Calendar r0 = toCalendar(r0)
            java.util.Calendar r1 = toCalendar(r1)
            boolean r0 = isSameDay(r0, r1)
            return r0
    }

    public static boolean isSameInstant(java.util.Calendar r2, java.util.Calendar r3) {
            java.lang.String r0 = "cal1"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "cal2"
            java.util.Objects.requireNonNull(r3, r0)
            java.util.Date r2 = r2.getTime()
            long r0 = r2.getTime()
            java.util.Date r2 = r3.getTime()
            long r2 = r2.getTime()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L20
            r2 = 1
            goto L21
        L20:
            r2 = 0
        L21:
            return r2
    }

    public static boolean isSameInstant(java.util.Date r2, java.util.Date r3) {
            java.lang.String r0 = "date1"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "date2"
            java.util.Objects.requireNonNull(r3, r0)
            long r0 = r2.getTime()
            long r2 = r3.getTime()
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 != 0) goto L18
            r2 = 1
            goto L19
        L18:
            r2 = 0
        L19:
            return r2
    }

    public static boolean isSameLocalTime(java.util.Calendar r4, java.util.Calendar r5) {
            java.lang.String r0 = "cal1"
            java.util.Objects.requireNonNull(r4, r0)
            java.lang.String r0 = "cal2"
            java.util.Objects.requireNonNull(r5, r0)
            r0 = 14
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            r2 = 0
            if (r1 != r0) goto L66
            r0 = 13
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L66
            r0 = 12
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L66
            r0 = 11
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L66
            r0 = 6
            int r1 = r4.get(r0)
            int r0 = r5.get(r0)
            if (r1 != r0) goto L66
            r0 = 1
            int r1 = r4.get(r0)
            int r3 = r5.get(r0)
            if (r1 != r3) goto L66
            int r1 = r4.get(r2)
            int r3 = r5.get(r2)
            if (r1 != r3) goto L66
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r5 = r5.getClass()
            if (r4 != r5) goto L66
            r2 = r0
        L66:
            return r2
    }

    public static java.util.Iterator<?> iterator(java.lang.Object r2, int r3) {
            java.lang.String r0 = "calendar"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto L10
            java.util.Date r2 = (java.util.Date) r2
            java.util.Iterator r2 = iterator(r2, r3)
            return r2
        L10:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L1b
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Iterator r2 = iterator(r2, r3)
            return r2
        L1b:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not iterate based on "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static java.util.Iterator<java.util.Calendar> iterator(java.util.Calendar r8, int r9) {
            java.lang.String r0 = "calendar"
            java.util.Objects.requireNonNull(r8, r0)
            r0 = -1
            r1 = 2
            r2 = 5
            r3 = 1
            r4 = 7
            switch(r9) {
                case 1: goto L43;
                case 2: goto L43;
                case 3: goto L43;
                case 4: goto L43;
                case 5: goto L28;
                case 6: goto L28;
                default: goto Ld;
            }
        Ld:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "The range style "
            r0.<init>(r1)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r0 = " is not valid."
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L28:
            java.util.Calendar r8 = truncate(r8, r1)
            java.lang.Object r5 = r8.clone()
            java.util.Calendar r5 = (java.util.Calendar) r5
            r5.add(r1, r3)
            r5.add(r2, r0)
            r6 = 6
            if (r9 != r6) goto L3e
            r6 = r5
            r5 = r8
            goto L68
        L3e:
            r1 = r3
            r6 = r5
            r5 = r8
        L41:
            r8 = r4
            goto L69
        L43:
            java.util.Calendar r5 = truncate(r8, r2)
            java.util.Calendar r6 = truncate(r8, r2)
            if (r9 == r1) goto L68
            r1 = 3
            if (r9 == r1) goto L61
            r7 = 4
            if (r9 == r7) goto L55
            r1 = r3
            goto L41
        L55:
            int r9 = r8.get(r4)
            int r9 = r9 - r1
            int r8 = r8.get(r4)
            int r8 = r8 + r1
            r1 = r9
            goto L69
        L61:
            int r1 = r8.get(r4)
            int r8 = r1 + (-1)
            goto L69
        L68:
            r8 = r3
        L69:
            if (r1 >= r3) goto L6d
            int r1 = r1 + 7
        L6d:
            if (r1 <= r4) goto L71
            int r1 = r1 + (-7)
        L71:
            if (r8 >= r3) goto L75
            int r8 = r8 + 7
        L75:
            if (r8 <= r4) goto L79
            int r8 = r8 + (-7)
        L79:
            int r9 = r5.get(r4)
            if (r9 == r1) goto L83
            r5.add(r2, r0)
            goto L79
        L83:
            int r9 = r6.get(r4)
            if (r9 == r8) goto L8d
            r6.add(r2, r3)
            goto L83
        L8d:
            org.apache.commons.lang3.time.DateUtils$DateIterator r8 = new org.apache.commons.lang3.time.DateUtils$DateIterator
            r8.<init>(r5, r6)
            return r8
    }

    public static java.util.Iterator<java.util.Calendar> iterator(java.util.Date r0, int r1) {
            java.util.Calendar r0 = toCalendar(r0)
            java.util.Iterator r0 = iterator(r0, r1)
            return r0
    }

    private static java.util.Calendar modify(java.util.Calendar r16, int r17, org.apache.commons.lang3.time.DateUtils.ModifyType r18) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 1
            int r4 = r0.get(r3)
            r5 = 280000000(0x10b07600, float:6.960157E-29)
            if (r4 > r5) goto L158
            r4 = 14
            if (r1 != r4) goto L15
            return r0
        L15:
            java.util.Date r5 = r16.getTime()
            long r6 = r5.getTime()
            int r4 = r0.get(r4)
            org.apache.commons.lang3.time.DateUtils$ModifyType r8 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            if (r8 == r2) goto L29
            r8 = 500(0x1f4, float:7.0E-43)
            if (r4 >= r8) goto L2b
        L29:
            long r8 = (long) r4
            long r6 = r6 - r8
        L2b:
            r4 = 13
            if (r1 != r4) goto L31
            r9 = r3
            goto L32
        L31:
            r9 = 0
        L32:
            int r4 = r0.get(r4)
            r10 = 30
            if (r9 != 0) goto L45
            org.apache.commons.lang3.time.DateUtils$ModifyType r11 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            if (r11 == r2) goto L40
            if (r4 >= r10) goto L45
        L40:
            long r11 = (long) r4
            r13 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r13
            long r6 = r6 - r11
        L45:
            r4 = 12
            if (r1 != r4) goto L4a
            r9 = r3
        L4a:
            int r11 = r0.get(r4)
            if (r9 != 0) goto L5c
            org.apache.commons.lang3.time.DateUtils$ModifyType r9 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            if (r9 == r2) goto L56
            if (r11 >= r10) goto L5c
        L56:
            long r9 = (long) r11
            r11 = 60000(0xea60, double:2.9644E-319)
            long r9 = r9 * r11
            long r6 = r6 - r9
        L5c:
            long r9 = r5.getTime()
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 == 0) goto L6a
            r5.setTime(r6)
            r0.setTime(r5)
        L6a:
            int[][] r5 = org.apache.commons.lang3.time.DateUtils.fields
            int r6 = r5.length
            r7 = 0
            r9 = 0
        L6f:
            if (r7 >= r6) goto L13d
            r10 = r5[r7]
            int r11 = r10.length
            r12 = 0
        L75:
            r13 = 15
            r14 = 2
            r15 = 1001(0x3e9, float:1.403E-42)
            r4 = 5
            if (r12 >= r11) goto Lc8
            r8 = r10[r12]
            if (r8 != r1) goto Lc2
            org.apache.commons.lang3.time.DateUtils$ModifyType r5 = org.apache.commons.lang3.time.DateUtils.ModifyType.CEILING
            if (r2 == r5) goto L8b
            org.apache.commons.lang3.time.DateUtils$ModifyType r5 = org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND
            if (r2 != r5) goto Lc1
            if (r9 == 0) goto Lc1
        L8b:
            if (r1 != r15) goto La0
            int r1 = r0.get(r4)
            if (r1 != r3) goto L97
            r0.add(r4, r13)
            goto Lc1
        L97:
            r1 = -15
            r0.add(r4, r1)
            r0.add(r14, r3)
            goto Lc1
        La0:
            r2 = 9
            if (r1 != r2) goto Lbb
            r1 = 11
            int r2 = r0.get(r1)
            if (r2 != 0) goto Lb2
            r2 = 12
            r0.add(r1, r2)
            goto Lc1
        Lb2:
            r2 = -12
            r0.add(r1, r2)
            r0.add(r4, r3)
            goto Lc1
        Lbb:
            r8 = 0
            r1 = r10[r8]
            r0.add(r1, r3)
        Lc1:
            return r0
        Lc2:
            r8 = 0
            int r12 = r12 + 1
            r4 = 12
            goto L75
        Lc8:
            r8 = 0
            r12 = 9
            if (r1 == r12) goto Lec
            if (r1 == r15) goto Ld2
        Lcf:
            r8 = 12
            goto L107
        Ld2:
            r11 = r10[r8]
            if (r11 != r4) goto Lcf
            int r4 = r0.get(r4)
            int r8 = r4 + (-1)
            if (r8 < r13) goto Le1
            int r4 = r4 + (-16)
            goto Le2
        Le1:
            r4 = r8
        Le2:
            r8 = 7
            if (r4 <= r8) goto Le7
            r9 = r3
            goto Le8
        Le7:
            r9 = 0
        Le8:
            r11 = r9
            r8 = 12
            goto L104
        Lec:
            r4 = r8
            r8 = r10[r4]
            r4 = 11
            if (r8 != r4) goto Lcf
            int r4 = r0.get(r4)
            r8 = 12
            if (r4 < r8) goto Lfd
            int r4 = r4 + (-12)
        Lfd:
            r9 = 6
            if (r4 < r9) goto L102
            r9 = r3
            goto L103
        L102:
            r9 = 0
        L103:
            r11 = r9
        L104:
            r9 = r4
            r4 = r3
            goto L10a
        L107:
            r11 = r9
            r4 = 0
            r9 = 0
        L10a:
            if (r4 != 0) goto L12a
            r4 = 0
            r9 = r10[r4]
            int r9 = r0.getActualMinimum(r9)
            r11 = r10[r4]
            int r11 = r0.getActualMaximum(r11)
            r12 = r10[r4]
            int r12 = r0.get(r12)
            int r12 = r12 - r9
            int r11 = r11 - r9
            int r11 = r11 / r14
            if (r12 <= r11) goto L126
            r9 = r3
            goto L127
        L126:
            r9 = r4
        L127:
            r11 = r9
            r9 = r12
            goto L12b
        L12a:
            r4 = 0
        L12b:
            if (r9 == 0) goto L137
            r10 = r10[r4]
            int r12 = r0.get(r10)
            int r12 = r12 - r9
            r0.set(r10, r12)
        L137:
            int r7 = r7 + 1
            r4 = r8
            r9 = r11
            goto L6f
        L13d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "The field "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " is not supported"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L158:
            java.lang.ArithmeticException r0 = new java.lang.ArithmeticException
            java.lang.String r1 = "Calendar value too large for accurate calculations"
            r0.<init>(r1)
            throw r0
    }

    public static java.util.Date parseDate(java.lang.String r1, java.util.Locale r2, java.lang.String... r3) throws java.text.ParseException {
            r0 = 1
            java.util.Date r1 = parseDateWithLeniency(r1, r2, r3, r0)
            return r1
    }

    public static java.util.Date parseDate(java.lang.String r1, java.lang.String... r2) throws java.text.ParseException {
            r0 = 0
            java.util.Date r1 = parseDate(r1, r0, r2)
            return r1
    }

    public static java.util.Date parseDateStrictly(java.lang.String r1, java.util.Locale r2, java.lang.String... r3) throws java.text.ParseException {
            r0 = 0
            java.util.Date r1 = parseDateWithLeniency(r1, r2, r3, r0)
            return r1
    }

    public static java.util.Date parseDateStrictly(java.lang.String r1, java.lang.String... r2) throws java.text.ParseException {
            r0 = 0
            java.util.Date r1 = parseDateStrictly(r1, r0, r2)
            return r1
    }

    private static java.util.Date parseDateWithLeniency(java.lang.String r7, java.util.Locale r8, java.lang.String[] r9, boolean r10) throws java.text.ParseException {
            java.lang.String r0 = "str"
            java.util.Objects.requireNonNull(r7, r0)
            java.lang.String r0 = "parsePatterns"
            java.util.Objects.requireNonNull(r9, r0)
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.util.Locale r8 = org.apache.commons.lang3.LocaleUtils.toLocale(r8)
            java.text.ParsePosition r1 = new java.text.ParsePosition
            r2 = 0
            r1.<init>(r2)
            java.util.Calendar r3 = java.util.Calendar.getInstance(r0, r8)
            r3.setLenient(r10)
            int r10 = r9.length
            r4 = r2
        L21:
            if (r4 >= r10) goto L48
            r5 = r9[r4]
            org.apache.commons.lang3.time.FastDateParser r6 = new org.apache.commons.lang3.time.FastDateParser
            r6.<init>(r5, r0, r8)
            r3.clear()
            boolean r5 = r6.parse(r7, r1, r3)     // Catch: java.lang.IllegalArgumentException -> L42
            if (r5 == 0) goto L42
            int r5 = r1.getIndex()     // Catch: java.lang.IllegalArgumentException -> L42
            int r6 = r7.length()     // Catch: java.lang.IllegalArgumentException -> L42
            if (r5 != r6) goto L42
            java.util.Date r7 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L42
            return r7
        L42:
            r1.setIndex(r2)
            int r4 = r4 + 1
            goto L21
        L48:
            java.text.ParseException r8 = new java.text.ParseException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unable to parse the date: "
            r9.<init>(r10)
            java.lang.StringBuilder r7 = r9.append(r7)
            java.lang.String r7 = r7.toString()
            r9 = -1
            r8.<init>(r7, r9)
            throw r8
    }

    public static java.util.Calendar round(java.util.Calendar r1, int r2) {
            java.lang.String r0 = "calendar"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.Object r1 = r1.clone()
            java.util.Calendar r1 = (java.util.Calendar) r1
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND
            java.util.Calendar r1 = modify(r1, r2, r0)
            return r1
    }

    public static java.util.Date round(java.lang.Object r2, int r3) {
            java.lang.String r0 = "date"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto L10
            java.util.Date r2 = (java.util.Date) r2
            java.util.Date r2 = round(r2, r3)
            return r2
        L10:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L1f
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Calendar r2 = round(r2, r3)
            java.util.Date r2 = r2.getTime()
            return r2
        L1f:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not round "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static java.util.Date round(java.util.Date r1, int r2) {
            java.util.Calendar r1 = toCalendar(r1)
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.ROUND
            java.util.Calendar r1 = modify(r1, r2, r0)
            java.util.Date r1 = r1.getTime()
            return r1
    }

    private static java.util.Date set(java.util.Date r2, int r3, int r4) {
            validateDateNotNull(r2)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 0
            r0.setLenient(r1)
            r0.setTime(r2)
            r0.set(r3, r4)
            java.util.Date r2 = r0.getTime()
            return r2
    }

    public static java.util.Date setDays(java.util.Date r1, int r2) {
            r0 = 5
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setHours(java.util.Date r1, int r2) {
            r0 = 11
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setMilliseconds(java.util.Date r1, int r2) {
            r0 = 14
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setMinutes(java.util.Date r1, int r2) {
            r0 = 12
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setMonths(java.util.Date r1, int r2) {
            r0 = 2
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setSeconds(java.util.Date r1, int r2) {
            r0 = 13
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Date setYears(java.util.Date r1, int r2) {
            r0 = 1
            java.util.Date r1 = set(r1, r0, r2)
            return r1
    }

    public static java.util.Calendar toCalendar(java.util.Date r2) {
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            java.lang.String r1 = "date"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r1)
            java.util.Date r2 = (java.util.Date) r2
            r0.setTime(r2)
            return r0
    }

    public static java.util.Calendar toCalendar(java.util.Date r1, java.util.TimeZone r2) {
            java.util.Calendar r2 = java.util.Calendar.getInstance(r2)
            java.lang.String r0 = "date"
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1, r0)
            java.util.Date r1 = (java.util.Date) r1
            r2.setTime(r1)
            return r2
    }

    public static java.util.Calendar truncate(java.util.Calendar r1, int r2) {
            java.lang.String r0 = "date"
            java.util.Objects.requireNonNull(r1, r0)
            java.lang.Object r1 = r1.clone()
            java.util.Calendar r1 = (java.util.Calendar) r1
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            java.util.Calendar r1 = modify(r1, r2, r0)
            return r1
    }

    public static java.util.Date truncate(java.lang.Object r2, int r3) {
            java.lang.String r0 = "date"
            java.util.Objects.requireNonNull(r2, r0)
            boolean r0 = r2 instanceof java.util.Date
            if (r0 == 0) goto L10
            java.util.Date r2 = (java.util.Date) r2
            java.util.Date r2 = truncate(r2, r3)
            return r2
        L10:
            boolean r0 = r2 instanceof java.util.Calendar
            if (r0 == 0) goto L1f
            java.util.Calendar r2 = (java.util.Calendar) r2
            java.util.Calendar r2 = truncate(r2, r3)
            java.util.Date r2 = r2.getTime()
            return r2
        L1f:
            java.lang.ClassCastException r3 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not truncate "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static java.util.Date truncate(java.util.Date r1, int r2) {
            java.util.Calendar r1 = toCalendar(r1)
            org.apache.commons.lang3.time.DateUtils$ModifyType r0 = org.apache.commons.lang3.time.DateUtils.ModifyType.TRUNCATE
            java.util.Calendar r1 = modify(r1, r2, r0)
            java.util.Date r1 = r1.getTime()
            return r1
    }

    public static int truncatedCompareTo(java.util.Calendar r0, java.util.Calendar r1, int r2) {
            java.util.Calendar r0 = truncate(r0, r2)
            java.util.Calendar r1 = truncate(r1, r2)
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static int truncatedCompareTo(java.util.Date r0, java.util.Date r1, int r2) {
            java.util.Date r0 = truncate(r0, r2)
            java.util.Date r1 = truncate(r1, r2)
            int r0 = r0.compareTo(r1)
            return r0
    }

    public static boolean truncatedEquals(java.util.Calendar r0, java.util.Calendar r1, int r2) {
            int r0 = truncatedCompareTo(r0, r1, r2)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public static boolean truncatedEquals(java.util.Date r0, java.util.Date r1, int r2) {
            int r0 = truncatedCompareTo(r0, r1, r2)
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private static void validateDateNotNull(java.util.Date r1) {
            java.lang.String r0 = "date"
            java.util.Objects.requireNonNull(r1, r0)
            return
    }
}
