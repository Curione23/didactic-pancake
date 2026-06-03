package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class FastDatePrinter implements org.apache.commons.lang3.time.DatePrinter, java.io.Serializable {
    private static final org.apache.commons.lang3.time.FastDatePrinter.Rule[] EMPTY_RULE_ARRAY = null;
    public static final int FULL = 0;
    public static final int LONG = 1;
    private static final int MAX_DIGITS = 10;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey, java.lang.String> cTimeZoneDisplayCache = null;
    private static final long serialVersionUID = 1;
    private final java.util.Locale locale;
    private transient int maxLengthEstimate;
    private final java.lang.String pattern;
    private transient org.apache.commons.lang3.time.FastDatePrinter.Rule[] rules;
    private final java.util.TimeZone timeZone;

    private static class CharacterLiteral implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final char value;

        CharacterLiteral(char r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r1, java.util.Calendar r2) throws java.io.IOException {
                r0 = this;
                char r2 = r0.value
                r1.append(r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    private static class DayInWeekField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule rule;

        DayInWeekField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.rule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r4, java.util.Calendar r5) throws java.io.IOException {
                r3 = this;
                r0 = 7
                int r5 = r5.get(r0)
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r1 = r3.rule
                r2 = 1
                if (r5 != r2) goto Lb
                goto Ld
            Lb:
                int r0 = r5 + (-1)
            Ld:
                r1.appendTo(r4, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    private static class Iso8601_Rule implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS = null;
        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS_COLON_MINUTES = null;
        static final org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule ISO8601_HOURS_MINUTES = null;
        private final int length;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r0 = new org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule
                r1 = 3
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS = r0
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r0 = new org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule
                r1 = 5
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_MINUTES = r0
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r0 = new org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule
                r1 = 6
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES = r0
                return
        }

        Iso8601_Rule(int r1) {
                r0 = this;
                r0.<init>()
                r0.length = r1
                return
        }

        static org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule getRule(int r1) {
                r0 = 1
                if (r1 == r0) goto L17
                r0 = 2
                if (r1 == r0) goto L14
                r0 = 3
                if (r1 != r0) goto Lc
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r1 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES
                return r1
            Lc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "invalid number of X"
                r1.<init>(r0)
                throw r1
            L14:
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r1 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_MINUTES
                return r1
            L17:
                org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r1 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS
                return r1
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r4, java.util.Calendar r5) throws java.io.IOException {
                r3 = this;
                r0 = 15
                int r0 = r5.get(r0)
                r1 = 16
                int r5 = r5.get(r1)
                int r0 = r0 + r5
                if (r0 != 0) goto L15
                java.lang.String r5 = "Z"
                r4.append(r5)
                return
            L15:
                if (r0 >= 0) goto L1e
                r5 = 45
                r4.append(r5)
                int r0 = -r0
                goto L23
            L1e:
                r5 = 43
                r4.append(r5)
            L23:
                r5 = 3600000(0x36ee80, float:5.044674E-39)
                int r5 = r0 / r5
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r4, r5)
                int r1 = r3.length
                r2 = 5
                if (r1 >= r2) goto L31
                return
            L31:
                r2 = 6
                if (r1 != r2) goto L39
                r1 = 58
                r4.append(r1)
            L39:
                r1 = 60000(0xea60, float:8.4078E-41)
                int r0 = r0 / r1
                int r5 = r5 * 60
                int r0 = r0 - r5
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r4, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                int r0 = r1.length
                return r0
        }
    }

    private interface NumberRule extends org.apache.commons.lang3.time.FastDatePrinter.Rule {
        void appendTo(java.lang.Appendable r1, int r2) throws java.io.IOException;
    }

    private static final class PaddedNumberField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final int field;
        private final int size;

        PaddedNumberField(int r2, int r3) {
                r1 = this;
                r1.<init>()
                r0 = 3
                if (r3 < r0) goto Lb
                r1.field = r2
                r1.size = r3
                return
            Lb:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                r2.<init>()
                throw r2
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.size
                org.apache.commons.lang3.time.FastDatePrinter.access$100(r2, r3, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.field
                int r3 = r3.get(r0)
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                int r0 = r1.size
                return r0
        }
    }

    private interface Rule {
        void appendTo(java.lang.Appendable r1, java.util.Calendar r2) throws java.io.IOException;

        int estimateLength();
    }

    private static class StringLiteral implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final java.lang.String value;

        StringLiteral(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r1, java.util.Calendar r2) throws java.io.IOException {
                r0 = this;
                java.lang.String r2 = r0.value
                r1.append(r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                java.lang.String r0 = r1.value
                int r0 = r0.length()
                return r0
        }
    }

    private static class TextField implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final int field;
        private final java.lang.String[] values;

        TextField(int r1, java.lang.String[] r2) {
                r0 = this;
                r0.<init>()
                r0.field = r1
                r0.values = r2
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                java.lang.String[] r0 = r2.values
                int r1 = r2.field
                int r4 = r4.get(r1)
                r4 = r0[r4]
                r3.append(r4)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r3 = this;
                java.lang.String[] r0 = r3.values
                int r0 = r0.length
                r1 = 0
            L4:
                int r0 = r0 + (-1)
                if (r0 < 0) goto L14
                java.lang.String[] r2 = r3.values
                r2 = r2[r0]
                int r2 = r2.length()
                if (r2 <= r1) goto L4
                r1 = r2
                goto L4
            L14:
                return r1
        }
    }

    private static class TimeZoneDisplayKey {
        private final java.util.Locale locale;
        private final int style;
        private final java.util.TimeZone timeZone;

        TimeZoneDisplayKey(java.util.TimeZone r1, boolean r2, int r3, java.util.Locale r4) {
                r0 = this;
                r0.<init>()
                r0.timeZone = r1
                if (r2 == 0) goto Ld
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 | r3
                r0.style = r1
                goto Lf
            Ld:
                r0.style = r3
            Lf:
                java.util.Locale r1 = org.apache.commons.lang3.LocaleUtils.toLocale(r4)
                r0.locale = r1
                return
        }

        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey
                r2 = 0
                if (r1 == 0) goto L28
                org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey r5 = (org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey) r5
                java.util.TimeZone r1 = r4.timeZone
                java.util.TimeZone r3 = r5.timeZone
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L26
                int r1 = r4.style
                int r3 = r5.style
                if (r1 != r3) goto L26
                java.util.Locale r1 = r4.locale
                java.util.Locale r5 = r5.locale
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L26
                goto L27
            L26:
                r0 = r2
            L27:
                return r0
            L28:
                return r2
        }

        public int hashCode() {
                r2 = this;
                int r0 = r2.style
                int r0 = r0 * 31
                java.util.Locale r1 = r2.locale
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.TimeZone r1 = r2.timeZone
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    private static class TimeZoneNameRule implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        private final java.lang.String daylight;
        private final java.util.Locale locale;
        private final java.lang.String standard;
        private final int style;

        TimeZoneNameRule(java.util.TimeZone r2, java.util.Locale r3, int r4) {
                r1 = this;
                r1.<init>()
                java.util.Locale r0 = org.apache.commons.lang3.LocaleUtils.toLocale(r3)
                r1.locale = r0
                r1.style = r4
                r0 = 0
                java.lang.String r0 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(r2, r0, r4, r3)
                r1.standard = r0
                r0 = 1
                java.lang.String r2 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(r2, r0, r4, r3)
                r1.daylight = r2
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r4, java.util.Calendar r5) throws java.io.IOException {
                r3 = this;
                java.util.TimeZone r0 = r5.getTimeZone()
                r1 = 16
                int r5 = r5.get(r1)
                if (r5 == 0) goto Le
                r5 = 1
                goto Lf
            Le:
                r5 = 0
            Lf:
                int r1 = r3.style
                java.util.Locale r2 = r3.locale
                java.lang.String r5 = org.apache.commons.lang3.time.FastDatePrinter.getTimeZoneDisplay(r0, r5, r1, r2)
                r4.append(r5)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r2 = this;
                java.lang.String r0 = r2.standard
                int r0 = r0.length()
                java.lang.String r1 = r2.daylight
                int r1 = r1.length()
                int r0 = java.lang.Math.max(r0, r1)
                return r0
        }
    }

    private static class TimeZoneNumberRule implements org.apache.commons.lang3.time.FastDatePrinter.Rule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule INSTANCE_COLON = null;
        static final org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule INSTANCE_NO_COLON = null;
        private final boolean colon;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r0 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule
                r1 = 1
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_COLON = r0
                org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r0 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule
                r1 = 0
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_NO_COLON = r0
                return
        }

        TimeZoneNumberRule(boolean r1) {
                r0 = this;
                r0.<init>()
                r0.colon = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                r0 = 15
                int r0 = r4.get(r0)
                r1 = 16
                int r4 = r4.get(r1)
                int r0 = r0 + r4
                if (r0 >= 0) goto L16
                r4 = 45
                r3.append(r4)
                int r0 = -r0
                goto L1b
            L16:
                r4 = 43
                r3.append(r4)
            L1b:
                r4 = 3600000(0x36ee80, float:5.044674E-39)
                int r4 = r0 / r4
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r3, r4)
                boolean r1 = r2.colon
                if (r1 == 0) goto L2c
                r1 = 58
                r3.append(r1)
            L2c:
                r1 = 60000(0xea60, float:8.4078E-41)
                int r0 = r0 / r1
                int r4 = r4 * 60
                int r0 = r0 - r4
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r3, r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 5
                return r0
        }
    }

    private static class TwelveHourField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule rule;

        TwelveHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.rule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                r0 = 10
                int r1 = r4.get(r0)
                if (r1 != 0) goto Le
                int r4 = r4.getLeastMaximum(r0)
                int r1 = r4 + 1
            Le:
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r4 = r2.rule
                r4.appendTo(r3, r1)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    private static class TwentyFourHourField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule rule;

        TwentyFourHourField(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.rule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r3, java.util.Calendar r4) throws java.io.IOException {
                r2 = this;
                r0 = 11
                int r1 = r4.get(r0)
                if (r1 != 0) goto Le
                int r4 = r4.getMaximum(r0)
                int r1 = r4 + 1
            Le:
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r4 = r2.rule
                r4.appendTo(r3, r1)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    private static class TwoDigitMonthField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField INSTANCE = null;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField r0 = new org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField
                r0.<init>()
                org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.INSTANCE = r0
                return
        }

        TwoDigitMonthField() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r1, int r2) throws java.io.IOException {
                r0 = this;
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r1, r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                int r3 = r3.get(r0)
                int r3 = r3 + 1
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class TwoDigitNumberField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final int field;

        TwoDigitNumberField(int r1) {
                r0 = this;
                r0.<init>()
                r0.field = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 100
                if (r3 >= r0) goto L8
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r2, r3)
                goto Lc
            L8:
                r0 = 2
                org.apache.commons.lang3.time.FastDatePrinter.access$100(r2, r3, r0)
            Lc:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.field
                int r3 = r3.get(r0)
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class TwoDigitYearField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField INSTANCE = null;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField r0 = new org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField
                r0.<init>()
                org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.INSTANCE = r0
                return
        }

        TwoDigitYearField() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r1, int r2) throws java.io.IOException {
                r0 = this;
                int r2 = r2 % 100
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r1, r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                r0 = 1
                int r3 = r3.get(r0)
                int r3 = r3 % 100
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class UnpaddedMonthField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        static final org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField INSTANCE = null;

        static {
                org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField r0 = new org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField
                r0.<init>()
                org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.INSTANCE = r0
                return
        }

        UnpaddedMonthField() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                if (r3 >= r0) goto Lb
                int r3 = r3 + 48
                char r3 = (char) r3
                r2.append(r3)
                goto Le
            Lb:
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r2, r3)
            Le:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                r0 = 2
                int r3 = r3.get(r0)
                int r3 = r3 + 1
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 2
                return r0
        }
    }

    private static class UnpaddedNumberField implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final int field;

        UnpaddedNumberField(int r1) {
                r0 = this;
                r0.<init>()
                r0.field = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public final void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                r0 = 10
                if (r3 >= r0) goto Lb
                int r3 = r3 + 48
                char r3 = (char) r3
                r2.append(r3)
                goto L17
            Lb:
                r0 = 100
                if (r3 >= r0) goto L13
                org.apache.commons.lang3.time.FastDatePrinter.access$000(r2, r3)
                goto L17
            L13:
                r0 = 1
                org.apache.commons.lang3.time.FastDatePrinter.access$100(r2, r3, r0)
            L17:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                int r0 = r1.field
                int r3 = r3.get(r0)
                r1.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                r0 = 4
                return r0
        }
    }

    private static class WeekYear implements org.apache.commons.lang3.time.FastDatePrinter.NumberRule {
        private final org.apache.commons.lang3.time.FastDatePrinter.NumberRule rule;

        WeekYear(org.apache.commons.lang3.time.FastDatePrinter.NumberRule r1) {
                r0 = this;
                r0.<init>()
                r0.rule = r1
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.NumberRule
        public void appendTo(java.lang.Appendable r2, int r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public void appendTo(java.lang.Appendable r2, java.util.Calendar r3) throws java.io.IOException {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                int r3 = r3.getWeekYear()
                r0.appendTo(r2, r3)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDatePrinter.Rule
        public int estimateLength() {
                r1 = this;
                org.apache.commons.lang3.time.FastDatePrinter$NumberRule r0 = r1.rule
                int r0 = r0.estimateLength()
                return r0
        }
    }

    static {
            r0 = 0
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r0 = new org.apache.commons.lang3.time.FastDatePrinter.Rule[r0]
            org.apache.commons.lang3.time.FastDatePrinter.EMPTY_RULE_ARRAY = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 7
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDatePrinter.cTimeZoneDisplayCache = r0
            return
    }

    protected FastDatePrinter(java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3) {
            r0 = this;
            r0.<init>()
            r0.pattern = r1
            r0.timeZone = r2
            java.util.Locale r1 = org.apache.commons.lang3.LocaleUtils.toLocale(r3)
            r0.locale = r1
            r0.init()
            return
    }

    static /* synthetic */ void access$000(java.lang.Appendable r0, int r1) throws java.io.IOException {
            appendDigits(r0, r1)
            return
    }

    static /* synthetic */ void access$100(java.lang.Appendable r0, int r1, int r2) throws java.io.IOException {
            appendFullDigits(r0, r1, r2)
            return
    }

    private static void appendDigits(java.lang.Appendable r1, int r2) throws java.io.IOException {
            int r0 = r2 / 10
            int r0 = r0 + 48
            char r0 = (char) r0
            r1.append(r0)
            int r2 = r2 % 10
            int r2 = r2 + 48
            char r2 = (char) r2
            r1.append(r2)
            return
    }

    private static void appendFullDigits(java.lang.Appendable r8, int r9, int r10) throws java.io.IOException {
            r0 = 10000(0x2710, float:1.4013E-41)
            r1 = 10
            r2 = 48
            if (r9 >= r0) goto L5c
            r0 = 2
            r3 = 3
            r4 = 4
            r5 = 1
            r6 = 1000(0x3e8, float:1.401E-42)
            r7 = 100
            if (r9 >= r6) goto L1c
            if (r9 >= r7) goto L1a
            if (r9 >= r1) goto L18
            r6 = r5
            goto L1d
        L18:
            r6 = r0
            goto L1d
        L1a:
            r6 = r3
            goto L1d
        L1c:
            r6 = r4
        L1d:
            int r10 = r10 - r6
        L1e:
            if (r10 <= 0) goto L26
            r8.append(r2)
            int r10 = r10 + (-1)
            goto L1e
        L26:
            if (r6 == r5) goto L56
            if (r6 == r0) goto L47
            if (r6 == r3) goto L38
            if (r6 == r4) goto L2f
            goto L7f
        L2f:
            int r10 = r9 / 1000
            int r10 = r10 + r2
            char r10 = (char) r10
            r8.append(r10)
            int r9 = r9 % 1000
        L38:
            if (r9 < r7) goto L44
            int r10 = r9 / 100
            int r10 = r10 + r2
            char r10 = (char) r10
            r8.append(r10)
            int r9 = r9 % 100
            goto L47
        L44:
            r8.append(r2)
        L47:
            if (r9 < r1) goto L53
            int r10 = r9 / 10
            int r10 = r10 + r2
            char r10 = (char) r10
            r8.append(r10)
            int r9 = r9 % 10
            goto L56
        L53:
            r8.append(r2)
        L56:
            int r9 = r9 + r2
            char r9 = (char) r9
            r8.append(r9)
            goto L7f
        L5c:
            char[] r0 = new char[r1]
            r1 = 0
        L5f:
            if (r9 == 0) goto L6d
            int r3 = r1 + 1
            int r4 = r9 % 10
            int r4 = r4 + r2
            char r4 = (char) r4
            r0[r1] = r4
            int r9 = r9 / 10
            r1 = r3
            goto L5f
        L6d:
            if (r1 >= r10) goto L75
            r8.append(r2)
            int r10 = r10 + (-1)
            goto L6d
        L75:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L7f
            char r9 = r0[r1]
            r8.append(r9)
            goto L75
        L7f:
            return
    }

    private <B extends java.lang.Appendable> B applyRules(java.util.Calendar r5, B r6) {
            r4 = this;
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r0 = r4.rules     // Catch: java.io.IOException -> Le
            int r1 = r0.length     // Catch: java.io.IOException -> Le
            r2 = 0
        L4:
            if (r2 >= r1) goto L12
            r3 = r0[r2]     // Catch: java.io.IOException -> Le
            r3.appendTo(r6, r5)     // Catch: java.io.IOException -> Le
            int r2 = r2 + 1
            goto L4
        Le:
            r5 = move-exception
            org.apache.commons.lang3.exception.ExceptionUtils.asRuntimeException(r5)
        L12:
            return r6
    }

    private java.lang.String applyRulesToString(java.util.Calendar r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.maxLengthEstimate
            r0.<init>(r1)
            java.lang.Appendable r3 = r2.applyRules(r3, r0)
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            return r3
    }

    static java.lang.String getTimeZoneDisplay(java.util.TimeZone r3, boolean r4, int r5, java.util.Locale r6) {
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey r0 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey
            r0.<init>(r3, r4, r5, r6)
            java.util.concurrent.ConcurrentMap<org.apache.commons.lang3.time.FastDatePrinter$TimeZoneDisplayKey, java.lang.String> r1 = org.apache.commons.lang3.time.FastDatePrinter.cTimeZoneDisplayCache
            org.apache.commons.lang3.time.FastDatePrinter$$ExternalSyntheticLambda0 r2 = new org.apache.commons.lang3.time.FastDatePrinter$$ExternalSyntheticLambda0
            r2.<init>(r3, r4, r5, r6)
            java.lang.Object r3 = r1.computeIfAbsent(r0, r2)
            java.lang.String r3 = (java.lang.String) r3
            return r3
    }

    private void init() {
            r3 = this;
            java.util.List r0 = r3.parsePattern()
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r1 = org.apache.commons.lang3.time.FastDatePrinter.EMPTY_RULE_ARRAY
            java.lang.Object[] r0 = r0.toArray(r1)
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r0 = (org.apache.commons.lang3.time.FastDatePrinter.Rule[]) r0
            r3.rules = r0
            int r0 = r0.length
            r1 = 0
        L10:
            int r0 = r0 + (-1)
            if (r0 < 0) goto L1e
            org.apache.commons.lang3.time.FastDatePrinter$Rule[] r2 = r3.rules
            r2 = r2[r0]
            int r2 = r2.estimateLength()
            int r1 = r1 + r2
            goto L10
        L1e:
            r3.maxLengthEstimate = r1
            return
    }

    static /* synthetic */ java.lang.String lambda$getTimeZoneDisplay$0(java.util.TimeZone r0, boolean r1, int r2, java.util.Locale r3, org.apache.commons.lang3.time.FastDatePrinter.TimeZoneDisplayKey r4) {
            java.lang.String r0 = r0.getDisplayName(r1, r2, r3)
            return r0
    }

    private java.util.Calendar newCalendar() {
            r2 = this;
            java.util.TimeZone r0 = r2.timeZone
            java.util.Locale r1 = r2.locale
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            return r0
    }

    private void readObject(java.io.ObjectInputStream r1) throws java.io.IOException, java.lang.ClassNotFoundException {
            r0 = this;
            r1.defaultReadObject()
            r0.init()
            return
    }

    @java.lang.Deprecated
    protected java.lang.StringBuffer applyRules(java.util.Calendar r1, java.lang.StringBuffer r2) {
            r0 = this;
            java.lang.Appendable r1 = r0.applyRules(r1, r2)
            java.lang.StringBuffer r1 = (java.lang.StringBuffer) r1
            return r1
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.lang3.time.FastDatePrinter
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.apache.commons.lang3.time.FastDatePrinter r4 = (org.apache.commons.lang3.time.FastDatePrinter) r4
            java.lang.String r0 = r3.pattern
            java.lang.String r2 = r4.pattern
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.util.TimeZone r0 = r3.timeZone
            java.util.TimeZone r2 = r4.timeZone
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L27
            java.util.Locale r0 = r3.locale
            java.util.Locale r4 = r4.locale
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L27
            r1 = 1
        L27:
            return r1
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(long r2, B r4) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTimeInMillis(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r4)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(java.util.Calendar r3, B r4) {
            r2 = this;
            java.util.TimeZone r0 = r3.getTimeZone()
            java.util.TimeZone r1 = r2.timeZone
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L17
            java.lang.Object r3 = r3.clone()
            java.util.Calendar r3 = (java.util.Calendar) r3
            java.util.TimeZone r0 = r2.timeZone
            r3.setTimeZone(r0)
        L17:
            java.lang.Appendable r3 = r2.applyRules(r3, r4)
            return r3
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(java.util.Date r2, B r3) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTime(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r3)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(long r2) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTimeInMillis(r2)
            java.lang.String r2 = r1.applyRulesToString(r0)
            return r2
    }

    java.lang.String format(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Date
            if (r0 == 0) goto Lb
            java.util.Date r4 = (java.util.Date) r4
            java.lang.String r4 = r3.format(r4)
            return r4
        Lb:
            boolean r0 = r4 instanceof java.util.Calendar
            if (r0 == 0) goto L16
            java.util.Calendar r4 = (java.util.Calendar) r4
            java.lang.String r4 = r3.format(r4)
            return r4
        L16:
            boolean r0 = r4 instanceof java.lang.Long
            if (r0 == 0) goto L25
            java.lang.Long r4 = (java.lang.Long) r4
            long r0 = r4.longValue()
            java.lang.String r4 = r3.format(r0)
            return r4
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown class: "
            r1.<init>(r2)
            java.lang.String r2 = "<null>"
            java.lang.String r4 = org.apache.commons.lang3.ClassUtils.getName(r4, r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(java.util.Calendar r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.maxLengthEstimate
            r0.<init>(r1)
            java.lang.Appendable r3 = r2.format(r3, r0)
            java.lang.StringBuilder r3 = (java.lang.StringBuilder) r3
            java.lang.String r3 = r3.toString()
            return r3
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(java.util.Date r2) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTime(r2)
            java.lang.String r2 = r1.applyRulesToString(r0)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.StringBuffer format(long r2, java.lang.StringBuffer r4) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTimeInMillis(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r4)
            java.lang.StringBuffer r2 = (java.lang.StringBuffer) r2
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @java.lang.Deprecated
    public java.lang.StringBuffer format(java.lang.Object r3, java.lang.StringBuffer r4, java.text.FieldPosition r5) {
            r2 = this;
            boolean r5 = r3 instanceof java.util.Date
            if (r5 == 0) goto Lb
            java.util.Date r3 = (java.util.Date) r3
            java.lang.StringBuffer r3 = r2.format(r3, r4)
            return r3
        Lb:
            boolean r5 = r3 instanceof java.util.Calendar
            if (r5 == 0) goto L16
            java.util.Calendar r3 = (java.util.Calendar) r3
            java.lang.StringBuffer r3 = r2.format(r3, r4)
            return r3
        L16:
            boolean r5 = r3 instanceof java.lang.Long
            if (r5 == 0) goto L25
            java.lang.Long r3 = (java.lang.Long) r3
            long r0 = r3.longValue()
            java.lang.StringBuffer r3 = r2.format(r0, r4)
            return r3
        L25:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown class: "
            r5.<init>(r0)
            java.lang.String r0 = "<null>"
            java.lang.String r3 = org.apache.commons.lang3.ClassUtils.getName(r3, r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.StringBuffer format(java.util.Calendar r1, java.lang.StringBuffer r2) {
            r0 = this;
            java.util.Date r1 = r1.getTime()
            java.lang.StringBuffer r1 = r0.format(r1, r2)
            return r1
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.StringBuffer format(java.util.Date r2, java.lang.StringBuffer r3) {
            r1 = this;
            java.util.Calendar r0 = r1.newCalendar()
            r0.setTime(r2)
            java.lang.Appendable r2 = r1.applyRules(r0, r3)
            java.lang.StringBuffer r2 = (java.lang.StringBuffer) r2
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.util.Locale getLocale() {
            r1 = this;
            java.util.Locale r0 = r1.locale
            return r0
    }

    public int getMaxLengthEstimate() {
            r1 = this;
            int r0 = r1.maxLengthEstimate
            return r0
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String getPattern() {
            r1 = this;
            java.lang.String r0 = r1.pattern
            return r0
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.util.TimeZone getTimeZone() {
            r1 = this;
            java.util.TimeZone r0 = r1.timeZone
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.pattern
            int r0 = r0.hashCode()
            java.util.TimeZone r1 = r3.timeZone
            int r1 = r1.hashCode()
            java.util.Locale r2 = r3.locale
            int r2 = r2.hashCode()
            int r2 = r2 * 13
            int r1 = r1 + r2
            int r1 = r1 * 13
            int r0 = r0 + r1
            return r0
    }

    protected java.util.List<org.apache.commons.lang3.time.FastDatePrinter.Rule> parsePattern() {
            r16 = this;
            r0 = r16
            java.text.DateFormatSymbols r1 = new java.text.DateFormatSymbols
            java.util.Locale r2 = r0.locale
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.String[] r3 = r1.getEras()
            java.lang.String[] r4 = r1.getMonths()
            java.lang.String[] r5 = r1.getShortMonths()
            java.lang.String[] r6 = r1.getWeekdays()
            java.lang.String[] r7 = r1.getShortWeekdays()
            java.lang.String[] r1 = r1.getAmPmStrings()
            java.lang.String r8 = r0.pattern
            int r8 = r8.length()
            r9 = 0
            r10 = r9
        L2e:
            if (r10 >= r8) goto L1d8
            int[] r10 = new int[]{r10}
            java.lang.String r11 = r0.pattern
            java.lang.String r11 = r0.parseToken(r11, r10)
            r10 = r10[r9]
            int r12 = r11.length()
            if (r12 != 0) goto L44
            goto L1d8
        L44:
            char r13 = r11.charAt(r9)
            r14 = 39
            r15 = 1
            if (r13 == r14) goto L1b5
            r14 = 83
            if (r13 == r14) goto L1ad
            r14 = 97
            if (r13 == r14) goto L1a5
            r14 = 100
            if (r13 == r14) goto L19f
            r14 = 104(0x68, float:1.46E-43)
            if (r13 == r14) goto L193
            r14 = 107(0x6b, float:1.5E-43)
            if (r13 == r14) goto L187
            r14 = 109(0x6d, float:1.53E-43)
            if (r13 == r14) goto L180
            r14 = 115(0x73, float:1.61E-43)
            if (r13 == r14) goto L179
            r14 = 117(0x75, float:1.64E-43)
            if (r13 == r14) goto L16e
            r14 = 119(0x77, float:1.67E-43)
            if (r13 == r14) goto L168
            r14 = 121(0x79, float:1.7E-43)
            r9 = 2
            if (r13 == r14) goto L14d
            r14 = 122(0x7a, float:1.71E-43)
            if (r13 == r14) goto L133
            switch(r13) {
                case 68: goto L12b;
                case 69: goto L11e;
                case 70: goto L117;
                case 71: goto L10e;
                case 72: goto L107;
                default: goto L7d;
            }
        L7d:
            switch(r13) {
                case 75: goto L100;
                case 76: goto Ld1;
                case 77: goto Lb5;
                default: goto L80;
            }
        L80:
            switch(r13) {
                case 87: goto Lae;
                case 88: goto La8;
                case 89: goto L14d;
                case 90: goto L98;
                default: goto L83;
            }
        L83:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Illegal pattern component: "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L98:
            if (r12 != r15) goto L9e
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r9 = org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_NO_COLON
            goto L130
        L9e:
            if (r12 != r9) goto La4
            org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r9 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.ISO8601_HOURS_COLON_MINUTES
            goto L130
        La4:
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNumberRule r9 = org.apache.commons.lang3.time.FastDatePrinter.TimeZoneNumberRule.INSTANCE_COLON
            goto L130
        La8:
            org.apache.commons.lang3.time.FastDatePrinter$Iso8601_Rule r9 = org.apache.commons.lang3.time.FastDatePrinter.Iso8601_Rule.getRule(r12)
            goto L130
        Lae:
            r11 = 4
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r11, r12)
            goto L130
        Lb5:
            r11 = 4
            if (r12 < r11) goto Lbe
            org.apache.commons.lang3.time.FastDatePrinter$TextField r11 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11.<init>(r9, r4)
            goto Le3
        Lbe:
            r11 = 3
            if (r12 != r11) goto Lc7
            org.apache.commons.lang3.time.FastDatePrinter$TextField r11 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11.<init>(r9, r5)
            goto Le3
        Lc7:
            if (r12 != r9) goto Lcd
            org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField r9 = org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.INSTANCE
            goto L130
        Lcd:
            org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField r9 = org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.INSTANCE
            goto L130
        Ld1:
            r11 = 4
            if (r12 < r11) goto Le5
            org.apache.commons.lang3.time.FastDatePrinter$TextField r11 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            java.util.Locale r12 = r0.locale
            org.apache.commons.lang3.time.CalendarUtils r12 = org.apache.commons.lang3.time.CalendarUtils.getInstance(r12)
            java.lang.String[] r12 = r12.getStandaloneLongMonthNames()
            r11.<init>(r9, r12)
        Le3:
            r9 = r11
            goto L130
        Le5:
            r11 = 3
            if (r12 != r11) goto Lf8
            org.apache.commons.lang3.time.FastDatePrinter$TextField r11 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            java.util.Locale r12 = r0.locale
            org.apache.commons.lang3.time.CalendarUtils r12 = org.apache.commons.lang3.time.CalendarUtils.getInstance(r12)
            java.lang.String[] r12 = r12.getStandaloneShortMonthNames()
            r11.<init>(r9, r12)
            goto Le3
        Lf8:
            if (r12 != r9) goto Lfd
            org.apache.commons.lang3.time.FastDatePrinter$TwoDigitMonthField r9 = org.apache.commons.lang3.time.FastDatePrinter.TwoDigitMonthField.INSTANCE
            goto L130
        Lfd:
            org.apache.commons.lang3.time.FastDatePrinter$UnpaddedMonthField r9 = org.apache.commons.lang3.time.FastDatePrinter.UnpaddedMonthField.INSTANCE
            goto L130
        L100:
            r9 = 10
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L107:
            r9 = 11
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L10e:
            org.apache.commons.lang3.time.FastDatePrinter$TextField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11 = 0
            r9.<init>(r11, r3)
            r12 = r11
            goto L1d1
        L117:
            r9 = 8
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L11e:
            org.apache.commons.lang3.time.FastDatePrinter$TextField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11 = 4
            if (r12 >= r11) goto L125
            r11 = r7
            goto L126
        L125:
            r11 = r6
        L126:
            r12 = 7
            r9.<init>(r12, r11)
            goto L130
        L12b:
            r9 = 6
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
        L130:
            r12 = 0
            goto L1d1
        L133:
            r11 = 4
            if (r12 < r11) goto L140
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule r9 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule
            java.util.TimeZone r11 = r0.timeZone
            java.util.Locale r12 = r0.locale
            r9.<init>(r11, r12, r15)
            goto L130
        L140:
            org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule r9 = new org.apache.commons.lang3.time.FastDatePrinter$TimeZoneNameRule
            java.util.TimeZone r11 = r0.timeZone
            java.util.Locale r12 = r0.locale
            r13 = 0
            r9.<init>(r11, r12, r13)
            r12 = r13
            goto L1d1
        L14d:
            if (r12 != r9) goto L152
            org.apache.commons.lang3.time.FastDatePrinter$TwoDigitYearField r9 = org.apache.commons.lang3.time.FastDatePrinter.TwoDigitYearField.INSTANCE
            goto L15b
        L152:
            r9 = 4
            int r9 = java.lang.Math.max(r12, r9)
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r15, r9)
        L15b:
            r11 = 89
            if (r13 != r11) goto L130
            org.apache.commons.lang3.time.FastDatePrinter$WeekYear r11 = new org.apache.commons.lang3.time.FastDatePrinter$WeekYear
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = (org.apache.commons.lang3.time.FastDatePrinter.NumberRule) r9
            r11.<init>(r9)
            goto Le3
        L168:
            r9 = 3
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L16e:
            org.apache.commons.lang3.time.FastDatePrinter$DayInWeekField r9 = new org.apache.commons.lang3.time.FastDatePrinter$DayInWeekField
            r11 = 7
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r11 = r0.selectNumberRule(r11, r12)
            r9.<init>(r11)
            goto L130
        L179:
            r9 = 13
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L180:
            r9 = 12
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L187:
            org.apache.commons.lang3.time.FastDatePrinter$TwentyFourHourField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TwentyFourHourField
            r11 = 11
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r11 = r0.selectNumberRule(r11, r12)
            r9.<init>(r11)
            goto L130
        L193:
            org.apache.commons.lang3.time.FastDatePrinter$TwelveHourField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TwelveHourField
            r11 = 10
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r11 = r0.selectNumberRule(r11, r12)
            r9.<init>(r11)
            goto L130
        L19f:
            r9 = 5
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L1a5:
            org.apache.commons.lang3.time.FastDatePrinter$TextField r9 = new org.apache.commons.lang3.time.FastDatePrinter$TextField
            r11 = 9
            r9.<init>(r11, r1)
            goto L130
        L1ad:
            r9 = 14
            org.apache.commons.lang3.time.FastDatePrinter$NumberRule r9 = r0.selectNumberRule(r9, r12)
            goto L130
        L1b5:
            java.lang.String r9 = r11.substring(r15)
            int r11 = r9.length()
            if (r11 != r15) goto L1ca
            org.apache.commons.lang3.time.FastDatePrinter$CharacterLiteral r11 = new org.apache.commons.lang3.time.FastDatePrinter$CharacterLiteral
            r12 = 0
            char r9 = r9.charAt(r12)
            r11.<init>(r9)
            goto L1d0
        L1ca:
            r12 = 0
            org.apache.commons.lang3.time.FastDatePrinter$StringLiteral r11 = new org.apache.commons.lang3.time.FastDatePrinter$StringLiteral
            r11.<init>(r9)
        L1d0:
            r9 = r11
        L1d1:
            r2.add(r9)
            int r10 = r10 + r15
            r9 = r12
            goto L2e
        L1d8:
            return r2
    }

    protected java.lang.String parseToken(java.lang.String r14, int[] r15) {
            r13 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            r2 = r15[r1]
            int r3 = r14.length()
            char r4 = r14.charAt(r2)
            r5 = 90
            r6 = 65
            if (r4 < r6) goto L18
            if (r4 <= r5) goto L20
        L18:
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 97
            if (r4 < r8) goto L33
            if (r4 > r7) goto L33
        L20:
            r0.append(r4)
        L23:
            int r5 = r2 + 1
            if (r5 >= r3) goto L66
            char r6 = r14.charAt(r5)
            if (r6 == r4) goto L2e
            goto L66
        L2e:
            r0.append(r4)
            r2 = r5
            goto L23
        L33:
            r4 = 39
            r0.append(r4)
            r9 = r1
        L39:
            if (r2 >= r3) goto L66
            char r10 = r14.charAt(r2)
            if (r10 != r4) goto L53
            int r11 = r2 + 1
            if (r11 >= r3) goto L50
            char r12 = r14.charAt(r11)
            if (r12 != r4) goto L50
            r0.append(r10)
            r2 = r11
            goto L63
        L50:
            r9 = r9 ^ 1
            goto L63
        L53:
            if (r9 != 0) goto L60
            if (r10 < r6) goto L59
            if (r10 <= r5) goto L5d
        L59:
            if (r10 < r8) goto L60
            if (r10 > r7) goto L60
        L5d:
            int r2 = r2 + (-1)
            goto L66
        L60:
            r0.append(r10)
        L63:
            int r2 = r2 + 1
            goto L39
        L66:
            r15[r1] = r2
            java.lang.String r14 = r0.toString()
            return r14
    }

    protected org.apache.commons.lang3.time.FastDatePrinter.NumberRule selectNumberRule(int r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L12
            r0 = 2
            if (r3 == r0) goto Lc
            org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField r0 = new org.apache.commons.lang3.time.FastDatePrinter$PaddedNumberField
            r0.<init>(r2, r3)
            return r0
        Lc:
            org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField r3 = new org.apache.commons.lang3.time.FastDatePrinter$TwoDigitNumberField
            r3.<init>(r2)
            return r3
        L12:
            org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField r3 = new org.apache.commons.lang3.time.FastDatePrinter$UnpaddedNumberField
            r3.<init>(r2)
            return r3
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FastDatePrinter["
            r0.<init>(r1)
            java.lang.String r1 = r3.pattern
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ","
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Locale r2 = r3.locale
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.TimeZone r1 = r3.timeZone
            java.lang.String r1 = r1.getID()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
