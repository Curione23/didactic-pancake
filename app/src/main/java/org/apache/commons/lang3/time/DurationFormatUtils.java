package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class DurationFormatUtils {
    static final java.lang.String H = "H";
    private static final int HOURS_PER_DAY = 24;
    public static final java.lang.String ISO_EXTENDED_FORMAT_PATTERN = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'";
    static final java.lang.String M = "M";
    private static final int MINUTES_PER_HOUR = 60;
    static final java.lang.String S = "S";
    private static final int SECONDS_PER_MINUTES = 60;
    static final java.lang.String d = "d";
    static final java.lang.String m = "m";
    static final java.lang.String s = "s";
    static final java.lang.String y = "y";

    static class Token {
        private static final org.apache.commons.lang3.time.DurationFormatUtils.Token[] EMPTY_ARRAY = null;
        private int count;
        private int optionalIndex;
        private final java.lang.CharSequence value;

        static {
                r0 = 0
                org.apache.commons.lang3.time.DurationFormatUtils$Token[] r0 = new org.apache.commons.lang3.time.DurationFormatUtils.Token[r0]
                org.apache.commons.lang3.time.DurationFormatUtils.Token.EMPTY_ARRAY = r0
                return
        }

        Token(java.lang.CharSequence r2, boolean r3, int r4) {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.optionalIndex = r0
                java.lang.String r0 = "value"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r1.value = r2
                r2 = 1
                r1.count = r2
                if (r3 == 0) goto L17
                r1.optionalIndex = r4
            L17:
                return
        }

        static /* synthetic */ int access$000(org.apache.commons.lang3.time.DurationFormatUtils.Token r0) {
                int r0 = r0.optionalIndex
                return r0
        }

        static /* synthetic */ org.apache.commons.lang3.time.DurationFormatUtils.Token[] access$100() {
                org.apache.commons.lang3.time.DurationFormatUtils$Token[] r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.EMPTY_ARRAY
                return r0
        }

        static boolean containsTokenWithValue(org.apache.commons.lang3.time.DurationFormatUtils.Token[] r1, java.lang.Object r2) {
                java.util.stream.Stream r1 = java.util.stream.Stream.of(r1)
                org.apache.commons.lang3.time.DurationFormatUtils$Token$$ExternalSyntheticLambda0 r0 = new org.apache.commons.lang3.time.DurationFormatUtils$Token$$ExternalSyntheticLambda0
                r0.<init>(r2)
                boolean r1 = r1.anyMatch(r0)
                return r1
        }

        static /* synthetic */ boolean lambda$containsTokenWithValue$0(java.lang.Object r0, org.apache.commons.lang3.time.DurationFormatUtils.Token r1) {
                java.lang.Object r1 = r1.getValue()
                if (r1 != r0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof org.apache.commons.lang3.time.DurationFormatUtils.Token
                r1 = 0
                if (r0 == 0) goto L42
                org.apache.commons.lang3.time.DurationFormatUtils$Token r4 = (org.apache.commons.lang3.time.DurationFormatUtils.Token) r4
                java.lang.CharSequence r0 = r3.value
                java.lang.Class r0 = r0.getClass()
                java.lang.CharSequence r2 = r4.value
                java.lang.Class r2 = r2.getClass()
                if (r0 == r2) goto L16
                return r1
            L16:
                int r0 = r3.count
                int r2 = r4.count
                if (r0 == r2) goto L1d
                return r1
            L1d:
                java.lang.CharSequence r0 = r3.value
                boolean r2 = r0 instanceof java.lang.StringBuilder
                if (r2 == 0) goto L32
                java.lang.String r0 = r0.toString()
                java.lang.CharSequence r4 = r4.value
                java.lang.String r4 = r4.toString()
                boolean r4 = r0.equals(r4)
                return r4
            L32:
                boolean r2 = r0 instanceof java.lang.Number
                if (r2 == 0) goto L3d
                java.lang.CharSequence r4 = r4.value
                boolean r4 = r0.equals(r4)
                return r4
            L3d:
                java.lang.CharSequence r4 = r4.value
                if (r0 != r4) goto L42
                r1 = 1
            L42:
                return r1
        }

        int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }

        java.lang.Object getValue() {
                r1 = this;
                java.lang.CharSequence r0 = r1.value
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.CharSequence r0 = r1.value
                int r0 = r0.hashCode()
                return r0
        }

        void increment() {
                r1 = this;
                int r0 = r1.count
                int r0 = r0 + 1
                r1.count = r0
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.CharSequence r0 = r2.value
                java.lang.String r0 = r0.toString()
                int r1 = r2.count
                java.lang.String r0 = org.apache.commons.lang3.StringUtils.repeat(r0, r1)
                return r0
        }
    }

    @java.lang.Deprecated
    public DurationFormatUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.lang.String format(org.apache.commons.lang3.time.DurationFormatUtils.Token[] r27, long r28, long r30, long r32, long r34, long r36, long r38, long r40, boolean r42) {
            r0 = r27
            r1 = r28
            r3 = r30
            r5 = r32
            r7 = r34
            r9 = r36
            r11 = r38
            r13 = r40
            r15 = r42
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            int r14 = r0.length
            r16 = 0
            r12 = r16
            r17 = r12
            r18 = r17
            r20 = r18
            r21 = r20
            r11 = -1
            r19 = -1
        L27:
            if (r12 >= r14) goto L186
            r22 = r0[r12]
            java.lang.Object r0 = r22.getValue()
            r23 = r14
            boolean r14 = r0 instanceof java.lang.StringBuilder
            r24 = r12
            int r12 = r22.getCount()
            int r9 = org.apache.commons.lang3.time.DurationFormatUtils.Token.access$000(r22)
            if (r11 == r9) goto L55
            int r11 = org.apache.commons.lang3.time.DurationFormatUtils.Token.access$000(r22)
            r9 = -1
            if (r11 <= r9) goto L53
            int r19 = r13.length()
            r18 = r16
            r20 = r18
            r9 = r19
            r17 = 1
            goto L57
        L53:
            r17 = r16
        L55:
            r9 = r19
        L57:
            if (r14 == 0) goto L6a
            if (r17 == 0) goto L5d
            if (r18 != 0) goto L64
        L5d:
            java.lang.String r0 = r0.toString()
            r13.append(r0)
        L64:
            r0 = r40
            r2 = r13
            r13 = 1
            goto L166
        L6a:
            java.lang.String r10 = "y"
            boolean r10 = r0.equals(r10)
            r25 = 0
            if (r10 == 0) goto L91
            int r0 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r0 != 0) goto L7a
            r0 = 1
            goto L7c
        L7a:
            r0 = r16
        L7c:
            if (r17 == 0) goto L80
            if (r0 != 0) goto L87
        L80:
            java.lang.String r10 = paddedValue(r1, r15, r12)
            r13.append(r10)
        L87:
            r18 = r0
            r2 = r13
            r21 = r16
            r13 = 1
        L8d:
            r0 = r40
            goto L166
        L91:
            java.lang.String r10 = "M"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto Lad
            int r0 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r0 != 0) goto L9f
            r0 = 1
            goto La1
        L9f:
            r0 = r16
        La1:
            if (r17 == 0) goto La5
            if (r0 != 0) goto L87
        La5:
            java.lang.String r10 = paddedValue(r3, r15, r12)
            r13.append(r10)
            goto L87
        Lad:
            java.lang.String r10 = "d"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto Lc9
            int r0 = (r5 > r25 ? 1 : (r5 == r25 ? 0 : -1))
            if (r0 != 0) goto Lbb
            r0 = 1
            goto Lbd
        Lbb:
            r0 = r16
        Lbd:
            if (r17 == 0) goto Lc1
            if (r0 != 0) goto L87
        Lc1:
            java.lang.String r10 = paddedValue(r5, r15, r12)
            r13.append(r10)
            goto L87
        Lc9:
            java.lang.String r10 = "H"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto Le5
            int r0 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r0 != 0) goto Ld7
            r0 = 1
            goto Ld9
        Ld7:
            r0 = r16
        Ld9:
            if (r17 == 0) goto Ldd
            if (r0 != 0) goto L87
        Ldd:
            java.lang.String r10 = paddedValue(r7, r15, r12)
            r13.append(r10)
            goto L87
        Le5:
            java.lang.String r10 = "m"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L103
            r1 = r36
            int r0 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r0 != 0) goto Lf5
            r0 = 1
            goto Lf7
        Lf5:
            r0 = r16
        Lf7:
            if (r17 == 0) goto Lfb
            if (r0 != 0) goto L87
        Lfb:
            java.lang.String r10 = paddedValue(r1, r15, r12)
            r13.append(r10)
            goto L87
        L103:
            r1 = r36
            java.lang.String r10 = "s"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L12b
            r1 = r38
            r10 = -1
            int r0 = (r1 > r25 ? 1 : (r1 == r25 ? 0 : -1))
            if (r0 != 0) goto L116
            r0 = 1
            goto L118
        L116:
            r0 = r16
        L118:
            if (r17 == 0) goto L11c
            if (r0 != 0) goto L123
        L11c:
            java.lang.String r12 = paddedValue(r1, r15, r12)
            r13.append(r12)
        L123:
            r18 = r0
            r2 = r13
            r13 = 1
            r21 = 1
            goto L8d
        L12b:
            r1 = r38
            java.lang.String r10 = "S"
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L64
            r0 = r40
            r2 = r13
            int r10 = (r0 > r25 ? 1 : (r0 == r25 ? 0 : -1))
            if (r10 != 0) goto L13e
            r10 = 1
            goto L140
        L13e:
            r10 = r16
        L140:
            if (r17 == 0) goto L147
            if (r10 != 0) goto L145
            goto L147
        L145:
            r13 = 1
            goto L162
        L147:
            if (r21 == 0) goto L15a
            r13 = 3
            if (r15 == 0) goto L150
            int r13 = java.lang.Math.max(r13, r12)
        L150:
            r12 = 1
            java.lang.String r13 = paddedValue(r0, r12, r13)
            r2.append(r13)
            r13 = r12
            goto L162
        L15a:
            r13 = 1
            java.lang.String r12 = paddedValue(r0, r15, r12)
            r2.append(r12)
        L162:
            r18 = r10
            r21 = r16
        L166:
            if (r17 == 0) goto L177
            if (r14 != 0) goto L177
            if (r20 != 0) goto L177
            if (r18 == 0) goto L175
            int r10 = r2.length()
            r2.delete(r9, r10)
        L175:
            r20 = r13
        L177:
            int r12 = r24 + 1
            r0 = r27
            r13 = r2
            r19 = r9
            r14 = r23
            r1 = r28
            r9 = r36
            goto L27
        L186:
            r2 = r13
            java.lang.String r0 = r2.toString()
            return r0
    }

    public static java.lang.String formatDuration(long r1, java.lang.String r3) {
            r0 = 1
            java.lang.String r1 = formatDuration(r1, r3, r0)
            return r1
    }

    public static java.lang.String formatDuration(long r23, java.lang.String r25, boolean r26) {
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.lang.String r6 = "durationMillis must not be negative"
            r0 = 0
            r4 = r23
            org.apache.commons.lang3.Validate.inclusiveBetween(r0, r2, r4, r6)
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r7 = lexx(r25)
            java.lang.String r0 = "d"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            r1 = 0
            if (r0 == 0) goto L26
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            long r5 = r23 / r3
            long r3 = r3 * r5
            long r3 = r23 - r3
            r12 = r5
            goto L29
        L26:
            r3 = r23
            r12 = r1
        L29:
            java.lang.String r0 = "H"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            if (r0 == 0) goto L3a
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            long r8 = r3 / r5
            long r5 = r5 * r8
            long r3 = r3 - r5
            r14 = r8
            goto L3b
        L3a:
            r14 = r1
        L3b:
            java.lang.String r0 = "m"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            if (r0 == 0) goto L4d
            r5 = 60000(0xea60, double:2.9644E-319)
            long r8 = r3 / r5
            long r5 = r5 * r8
            long r3 = r3 - r5
            r16 = r8
            goto L4f
        L4d:
            r16 = r1
        L4f:
            java.lang.String r0 = "s"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r7, r0)
            if (r0 == 0) goto L62
            r0 = 1000(0x3e8, double:4.94E-321)
            long r5 = r3 / r0
            long r0 = r0 * r5
            long r3 = r3 - r0
            r20 = r3
            r18 = r5
            goto L66
        L62:
            r18 = r1
            r20 = r3
        L66:
            r8 = 0
            r10 = 0
            r22 = r26
            java.lang.String r0 = format(r7, r8, r10, r12, r14, r16, r18, r20, r22)
            return r0
    }

    public static java.lang.String formatDurationHMS(long r1) {
            java.lang.String r0 = "HH:mm:ss.SSS"
            java.lang.String r1 = formatDuration(r1, r0)
            return r1
    }

    public static java.lang.String formatDurationISO(long r2) {
            java.lang.String r0 = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'"
            r1 = 0
            java.lang.String r2 = formatDuration(r2, r0, r1)
            return r2
    }

    public static java.lang.String formatDurationWords(long r6, boolean r8, boolean r9) {
            java.lang.String r0 = "d' days 'H' hours 'm' minutes 's' seconds'"
            java.lang.String r6 = formatDuration(r6, r0)
            java.lang.String r7 = " 0 minutes"
            java.lang.String r0 = " 0 hours"
            java.lang.String r1 = " 0 days"
            java.lang.String r2 = " "
            java.lang.String r3 = ""
            if (r8 == 0) goto L4c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r8 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r1, r3)
            int r4 = r8.length()
            int r5 = r6.length()
            if (r4 == r5) goto L41
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r8, r0, r3)
            int r4 = r6.length()
            int r5 = r8.length()
            if (r4 == r5) goto L40
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r7, r3)
            goto L41
        L40:
            r6 = r8
        L41:
            boolean r8 = r6.isEmpty()
            if (r8 != 0) goto L4c
            r8 = 1
            java.lang.String r6 = r6.substring(r8)
        L4c:
            if (r9 == 0) goto L80
            java.lang.String r8 = " 0 seconds"
            java.lang.String r8 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r8, r3)
            int r9 = r8.length()
            int r4 = r6.length()
            if (r9 == r4) goto L80
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r8, r7, r3)
            int r7 = r6.length()
            int r9 = r8.length()
            if (r7 == r9) goto L7f
            java.lang.String r7 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r0, r3)
            int r8 = r7.length()
            int r9 = r6.length()
            if (r8 == r9) goto L80
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r7, r1, r3)
            goto L80
        L7f:
            r6 = r8
        L80:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r2)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = " 1 seconds"
            java.lang.String r8 = " 1 second"
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r7, r8)
            java.lang.String r7 = " 1 minutes"
            java.lang.String r8 = " 1 minute"
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r7, r8)
            java.lang.String r7 = " 1 hours"
            java.lang.String r8 = " 1 hour"
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r7, r8)
            java.lang.String r7 = " 1 days"
            java.lang.String r8 = " 1 day"
            java.lang.String r6 = org.apache.commons.lang3.StringUtils.replaceOnce(r6, r7, r8)
            java.lang.String r6 = r6.trim()
            return r6
    }

    public static java.lang.String formatPeriod(long r7, long r9, java.lang.String r11) {
            r5 = 1
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            r0 = r7
            r2 = r9
            r4 = r11
            java.lang.String r7 = formatPeriod(r0, r2, r4, r5, r6)
            return r7
    }

    public static java.lang.String formatPeriod(long r25, long r27, java.lang.String r29, boolean r30, java.util.TimeZone r31) {
            r0 = r25
            r2 = r27
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 > 0) goto Lc
            r4 = r6
            goto Ld
        Lc:
            r4 = r5
        Ld:
            java.lang.String r7 = "startMillis must not be greater than endMillis"
            java.lang.Object[] r8 = new java.lang.Object[r5]
            org.apache.commons.lang3.Validate.isTrue(r4, r7, r8)
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r9 = lexx(r29)
            java.util.Calendar r4 = java.util.Calendar.getInstance(r31)
            java.util.Date r7 = new java.util.Date
            r7.<init>(r0)
            r4.setTime(r7)
            java.util.Calendar r0 = java.util.Calendar.getInstance(r31)
            java.util.Date r1 = new java.util.Date
            r1.<init>(r2)
            r0.setTime(r1)
            r1 = 14
            int r2 = r0.get(r1)
            int r1 = r4.get(r1)
            int r2 = r2 - r1
            long r1 = (long) r2
            r3 = 13
            int r7 = r0.get(r3)
            int r3 = r4.get(r3)
            int r7 = r7 - r3
            r3 = 12
            int r8 = r0.get(r3)
            int r3 = r4.get(r3)
            int r8 = r8 - r3
            r3 = 11
            int r10 = r0.get(r3)
            int r3 = r4.get(r3)
            int r10 = r10 - r3
            r3 = 5
            int r11 = r0.get(r3)
            int r12 = r4.get(r3)
            int r11 = r11 - r12
            r12 = 2
            int r13 = r0.get(r12)
            int r14 = r4.get(r12)
            int r13 = r13 - r14
            int r14 = r0.get(r6)
            int r15 = r4.get(r6)
            int r14 = r14 - r15
        L7a:
            r15 = 0
            int r15 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            r16 = 1000(0x3e8, double:4.94E-321)
            if (r15 >= 0) goto L87
            long r1 = r1 + r16
            int r7 = r7 + (-1)
            goto L7a
        L87:
            if (r7 >= 0) goto L8e
            int r7 = r7 + 60
            int r8 = r8 + (-1)
            goto L87
        L8e:
            if (r8 >= 0) goto L95
            int r8 = r8 + 60
            int r10 = r10 + (-1)
            goto L8e
        L95:
            if (r10 >= 0) goto L9c
            int r10 = r10 + 24
            int r11 = r11 + (-1)
            goto L95
        L9c:
            java.lang.String r15 = "M"
            boolean r15 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r15)
            java.lang.String r5 = "y"
            if (r15 == 0) goto Lc9
        La6:
            if (r11 >= 0) goto Lb3
            int r0 = r4.getActualMaximum(r3)
            int r11 = r11 + r0
            int r13 = r13 + (-1)
            r4.add(r12, r6)
            goto La6
        Lb3:
            if (r13 >= 0) goto Lba
            int r13 = r13 + 12
            int r14 = r14 + (-1)
            goto Lb3
        Lba:
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r5)
            if (r0 != 0) goto L127
            if (r14 == 0) goto L127
        Lc2:
            if (r14 == 0) goto L127
            int r14 = r14 * 12
            int r13 = r13 + r14
            r14 = 0
            goto Lc2
        Lc9:
            boolean r5 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r5)
            if (r5 != 0) goto L106
            int r5 = r0.get(r6)
            if (r13 >= 0) goto Ld7
            int r5 = r5 + (-1)
        Ld7:
            int r13 = r4.get(r6)
            if (r13 == r5) goto L105
            r13 = 6
            int r14 = r4.getActualMaximum(r13)
            int r15 = r4.get(r13)
            int r14 = r14 - r15
            int r11 = r11 + r14
            boolean r14 = r4 instanceof java.util.GregorianCalendar
            if (r14 == 0) goto Lfc
            int r14 = r4.get(r12)
            if (r14 != r6) goto Lfc
            int r14 = r4.get(r3)
            r15 = 29
            if (r14 != r15) goto Lfc
            int r11 = r11 + 1
        Lfc:
            r4.add(r6, r6)
            int r13 = r4.get(r13)
            int r11 = r11 + r13
            goto Ld7
        L105:
            r14 = 0
        L106:
            int r5 = r4.get(r12)
            int r13 = r0.get(r12)
            if (r5 == r13) goto L119
            int r5 = r4.getActualMaximum(r3)
            int r11 = r11 + r5
            r4.add(r12, r6)
            goto L106
        L119:
            r13 = 0
        L11a:
            if (r11 >= 0) goto L127
            int r0 = r4.getActualMaximum(r3)
            int r11 = r11 + r0
            int r13 = r13 + (-1)
            r4.add(r12, r6)
            goto L11a
        L127:
            java.lang.String r0 = "d"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L133
            int r11 = r11 * 24
            int r10 = r10 + r11
            r11 = 0
        L133:
            java.lang.String r0 = "H"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L13f
            int r10 = r10 * 60
            int r8 = r8 + r10
            r10 = 0
        L13f:
            java.lang.String r0 = "m"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L14b
            int r8 = r8 * 60
            int r7 = r7 + r8
            r8 = 0
        L14b:
            java.lang.String r0 = "s"
            boolean r0 = org.apache.commons.lang3.time.DurationFormatUtils.Token.containsTokenWithValue(r9, r0)
            if (r0 != 0) goto L15b
            long r3 = (long) r7
            long r3 = r3 * r16
            long r1 = r1 + r3
            r22 = r1
            r5 = 0
            goto L15e
        L15b:
            r22 = r1
            r5 = r7
        L15e:
            long r0 = (long) r14
            long r12 = (long) r13
            long r14 = (long) r11
            long r2 = (long) r10
            long r6 = (long) r8
            long r4 = (long) r5
            r10 = r0
            r16 = r2
            r18 = r6
            r20 = r4
            r24 = r30
            java.lang.String r0 = format(r9, r10, r12, r14, r16, r18, r20, r22, r24)
            return r0
    }

    public static java.lang.String formatPeriodISO(long r7, long r9) {
            r5 = 0
            java.util.TimeZone r6 = java.util.TimeZone.getDefault()
            java.lang.String r4 = "'P'yyyy'Y'M'M'd'DT'H'H'm'M's.SSS'S'"
            r0 = r7
            r2 = r9
            java.lang.String r7 = formatPeriod(r0, r2, r4, r5, r6)
            return r7
    }

    static org.apache.commons.lang3.time.DurationFormatUtils.Token[] lexx(java.lang.String r12) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length()
            r0.<init>(r1)
            r1 = 0
            r2 = 0
            r3 = -1
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r2
            r8 = r7
        L11:
            int r9 = r12.length()
            if (r4 >= r9) goto Le2
            char r9 = r12.charAt(r4)
            r10 = 39
            if (r5 == 0) goto L26
            if (r9 == r10) goto L26
            r7.append(r9)
            goto Lde
        L26:
            r11 = 1
            if (r9 == r10) goto Lad
            r10 = 72
            if (r9 == r10) goto Laa
            r10 = 77
            if (r9 == r10) goto La7
            r10 = 83
            if (r9 == r10) goto La4
            r10 = 91
            if (r9 == r10) goto L88
            r10 = 93
            if (r9 == r10) goto L6e
            r10 = 100
            if (r9 == r10) goto L6b
            r10 = 109(0x6d, float:1.53E-43)
            if (r9 == r10) goto L68
            r10 = 115(0x73, float:1.61E-43)
            if (r9 == r10) goto L64
            r10 = 121(0x79, float:1.7E-43)
            if (r9 == r10) goto L60
            if (r7 != 0) goto L5c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            org.apache.commons.lang3.time.DurationFormatUtils$Token r10 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r10.<init>(r7, r6, r3)
            r0.add(r10)
        L5c:
            r7.append(r9)
            goto L71
        L60:
            java.lang.String r9 = "y"
            goto Lc2
        L64:
            java.lang.String r9 = "s"
            goto Lc2
        L68:
            java.lang.String r9 = "m"
            goto Lc2
        L6b:
            java.lang.String r9 = "d"
            goto Lc2
        L6e:
            if (r6 == 0) goto L73
            r6 = r1
        L71:
            r9 = r2
            goto Lc2
        L73:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Attempting to close unopened optional block at index: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        L88:
            if (r6 != 0) goto L8f
            int r3 = r3 + 1
            r9 = r2
            r6 = r11
            goto Lc2
        L8f:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Nested optional block at index: "
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r12.<init>(r0)
            throw r12
        La4:
            java.lang.String r9 = "S"
            goto Lc2
        La7:
            java.lang.String r9 = "M"
            goto Lc2
        Laa:
            java.lang.String r9 = "H"
            goto Lc2
        Lad:
            if (r5 == 0) goto Lb3
            r5 = r1
            r7 = r2
            r9 = r7
            goto Lc2
        Lb3:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            org.apache.commons.lang3.time.DurationFormatUtils$Token r5 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r5.<init>(r7, r6, r3)
            r0.add(r5)
            r9 = r2
            r5 = r11
        Lc2:
            if (r9 == 0) goto Lde
            if (r8 == 0) goto Ld4
            java.lang.Object r7 = r8.getValue()
            boolean r7 = r7.equals(r9)
            if (r7 == 0) goto Ld4
            r8.increment()
            goto Ldd
        Ld4:
            org.apache.commons.lang3.time.DurationFormatUtils$Token r7 = new org.apache.commons.lang3.time.DurationFormatUtils$Token
            r7.<init>(r9, r6, r3)
            r0.add(r7)
            r8 = r7
        Ldd:
            r7 = r2
        Lde:
            int r4 = r4 + 1
            goto L11
        Le2:
            if (r5 != 0) goto L106
            if (r6 != 0) goto Lf1
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r12 = org.apache.commons.lang3.time.DurationFormatUtils.Token.access$100()
            java.lang.Object[] r12 = r0.toArray(r12)
            org.apache.commons.lang3.time.DurationFormatUtils$Token[] r12 = (org.apache.commons.lang3.time.DurationFormatUtils.Token[]) r12
            return r12
        Lf1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unmatched optional in format: "
            r1.<init>(r2)
            java.lang.StringBuilder r12 = r1.append(r12)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
        L106:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unmatched quote in format: "
            r1.<init>(r2)
            java.lang.StringBuilder r12 = r1.append(r12)
            java.lang.String r12 = r12.toString()
            r0.<init>(r12)
            throw r0
    }

    private static java.lang.String paddedValue(long r0, boolean r2, int r3) {
            java.lang.String r0 = java.lang.Long.toString(r0)
            if (r2 == 0) goto Lc
            r1 = 48
            java.lang.String r0 = org.apache.commons.lang3.StringUtils.leftPad(r0, r3, r1)
        Lc:
            return r0
    }
}
