package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class FastDateParser implements org.apache.commons.lang3.time.DateParser, java.io.Serializable {
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy ABBREVIATED_YEAR_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy DAY_OF_MONTH_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy DAY_OF_WEEK_IN_MONTH_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy DAY_OF_WEEK_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy DAY_OF_YEAR_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR12_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR24_OF_DAY_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR_OF_DAY_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy HOUR_STRATEGY = null;
    static final java.util.Locale JAPANESE_IMPERIAL = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy LITERAL_YEAR_STRATEGY = null;
    private static final java.util.Comparator<java.lang.String> LONGER_FIRST_LOWERCASE = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy MILLISECOND_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy MINUTE_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy NUMBER_MONTH_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy SECOND_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy WEEK_OF_MONTH_STRATEGY = null;
    private static final org.apache.commons.lang3.time.FastDateParser.Strategy WEEK_OF_YEAR_STRATEGY = null;
    private static final java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy>[] caches = null;
    private static final long serialVersionUID = 3;
    private final int century;
    private final java.util.Locale locale;
    private final java.lang.String pattern;
    private transient java.util.List<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth> patterns;
    private final int startYear;
    private final java.util.TimeZone timeZone;






    private static final class CaseInsensitiveTextStrategy extends org.apache.commons.lang3.time.FastDateParser.PatternStrategy {
        private final int field;
        private final java.util.Map<java.lang.String, java.lang.Integer> lKeyValues;
        final java.util.Locale locale;

        CaseInsensitiveTextStrategy(int r3, java.util.Calendar r4, java.util.Locale r5) {
                r2 = this;
                r0 = 0
                r2.<init>(r0)
                r2.field = r3
                java.util.Locale r0 = org.apache.commons.lang3.LocaleUtils.toLocale(r5)
                r2.locale = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "((?iu)"
                r0.append(r1)
                java.util.Map r3 = org.apache.commons.lang3.time.FastDateParser.access$100(r4, r5, r3, r0)
                r2.lKeyValues = r3
                int r3 = r0.length()
                int r3 = r3 + (-1)
                r0.setLength(r3)
                java.lang.String r3 = ")"
                r0.append(r3)
                r2.createPattern(r0)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        void setCalendar(org.apache.commons.lang3.time.FastDateParser r2, java.util.Calendar r3, java.lang.String r4) {
                r1 = this;
                java.util.Locale r2 = r1.locale
                java.lang.String r2 = r4.toLowerCase(r2)
                java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.lKeyValues
                java.lang.Object r4 = r4.get(r2)
                java.lang.Integer r4 = (java.lang.Integer) r4
                if (r4 != 0) goto L2c
                java.util.Map<java.lang.String, java.lang.Integer> r4 = r1.lKeyValues
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r2 = r0.append(r2)
                r0 = 46
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.Object r2 = r4.get(r2)
                r4 = r2
                java.lang.Integer r4 = (java.lang.Integer) r4
            L2c:
                r2 = 9
                int r0 = r1.field
                if (r2 != r0) goto L39
                int r2 = r4.intValue()
                r0 = 1
                if (r2 > r0) goto L42
            L39:
                int r2 = r1.field
                int r4 = r4.intValue()
                r3.set(r2, r4)
            L42:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CaseInsensitiveTextStrategy [field="
                r0.<init>(r1)
                int r1 = r2.field
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", locale="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.Locale r1 = r2.locale
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", lKeyValues="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.Map<java.lang.String, java.lang.Integer> r1 = r2.lKeyValues
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", pattern="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.regex.Pattern r1 = r2.pattern
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static final class CopyQuotedStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        private final java.lang.String formatField;

        CopyQuotedStrategy(java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.formatField = r2
                return
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        boolean isNumber() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        boolean parse(org.apache.commons.lang3.time.FastDateParser r3, java.util.Calendar r4, java.lang.String r5, java.text.ParsePosition r6, int r7) {
                r2 = this;
                r3 = 0
                r4 = r3
            L2:
                java.lang.String r7 = r2.formatField
                int r7 = r7.length()
                if (r4 >= r7) goto L2c
                int r7 = r6.getIndex()
                int r7 = r7 + r4
                int r0 = r5.length()
                if (r7 != r0) goto L19
                r6.setErrorIndex(r7)
                return r3
            L19:
                java.lang.String r0 = r2.formatField
                char r0 = r0.charAt(r4)
                char r1 = r5.charAt(r7)
                if (r0 == r1) goto L29
                r6.setErrorIndex(r7)
                return r3
            L29:
                int r4 = r4 + 1
                goto L2
            L2c:
                java.lang.String r3 = r2.formatField
                int r3 = r3.length()
                int r4 = r6.getIndex()
                int r3 = r3 + r4
                r6.setIndex(r3)
                r3 = 1
                return r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "CopyQuotedStrategy [formatField="
                r0.<init>(r1)
                java.lang.String r1 = r2.formatField
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static final class ISO8601TimeZoneStrategy extends org.apache.commons.lang3.time.FastDateParser.PatternStrategy {
        private static final org.apache.commons.lang3.time.FastDateParser.Strategy ISO_8601_1_STRATEGY = null;
        private static final org.apache.commons.lang3.time.FastDateParser.Strategy ISO_8601_2_STRATEGY = null;
        private static final org.apache.commons.lang3.time.FastDateParser.Strategy ISO_8601_3_STRATEGY = null;

        static {
                org.apache.commons.lang3.time.FastDateParser$ISO8601TimeZoneStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$ISO8601TimeZoneStrategy
                java.lang.String r1 = "(Z|(?:[+-]\\d{2}))"
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_1_STRATEGY = r0
                org.apache.commons.lang3.time.FastDateParser$ISO8601TimeZoneStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$ISO8601TimeZoneStrategy
                java.lang.String r1 = "(Z|(?:[+-]\\d{2}\\d{2}))"
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_2_STRATEGY = r0
                org.apache.commons.lang3.time.FastDateParser$ISO8601TimeZoneStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$ISO8601TimeZoneStrategy
                java.lang.String r1 = "(Z|(?:[+-]\\d{2}(?::)\\d{2}))"
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY = r0
                return
        }

        ISO8601TimeZoneStrategy(java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.createPattern(r2)
                return
        }

        static /* synthetic */ org.apache.commons.lang3.time.FastDateParser.Strategy access$900() {
                org.apache.commons.lang3.time.FastDateParser$Strategy r0 = org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY
                return r0
        }

        static org.apache.commons.lang3.time.FastDateParser.Strategy getStrategy(int r1) {
                r0 = 1
                if (r1 == r0) goto L17
                r0 = 2
                if (r1 == r0) goto L14
                r0 = 3
                if (r1 != r0) goto Lc
                org.apache.commons.lang3.time.FastDateParser$Strategy r1 = org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_3_STRATEGY
                return r1
            Lc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "invalid number of X"
                r1.<init>(r0)
                throw r1
            L14:
                org.apache.commons.lang3.time.FastDateParser$Strategy r1 = org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_2_STRATEGY
                return r1
            L17:
                org.apache.commons.lang3.time.FastDateParser$Strategy r1 = org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.ISO_8601_1_STRATEGY
                return r1
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        void setCalendar(org.apache.commons.lang3.time.FastDateParser r1, java.util.Calendar r2, java.lang.String r3) {
                r0 = this;
                java.util.TimeZone r1 = org.apache.commons.lang3.time.FastTimeZone.getGmtTimeZone(r3)
                r2.setTimeZone(r1)
                return
        }
    }

    private static class NumberStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        private final int field;

        NumberStrategy(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.field = r2
                return
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        boolean isNumber() {
                r1 = this;
                r0 = 1
                return r0
        }

        int modify(org.apache.commons.lang3.time.FastDateParser r1, int r2) {
                r0 = this;
                return r2
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        boolean parse(org.apache.commons.lang3.time.FastDateParser r3, java.util.Calendar r4, java.lang.String r5, java.text.ParsePosition r6, int r7) {
                r2 = this;
                int r0 = r6.getIndex()
                int r1 = r5.length()
                if (r7 != 0) goto L1e
            La:
                if (r0 >= r1) goto L1a
                char r7 = r5.charAt(r0)
                boolean r7 = java.lang.Character.isWhitespace(r7)
                if (r7 != 0) goto L17
                goto L1a
            L17:
                int r0 = r0 + 1
                goto La
            L1a:
                r6.setIndex(r0)
                goto L22
            L1e:
                int r7 = r7 + r0
                if (r1 <= r7) goto L22
                r1 = r7
            L22:
                if (r0 >= r1) goto L32
                char r7 = r5.charAt(r0)
                boolean r7 = java.lang.Character.isDigit(r7)
                if (r7 != 0) goto L2f
                goto L32
            L2f:
                int r0 = r0 + 1
                goto L22
            L32:
                int r7 = r6.getIndex()
                if (r7 != r0) goto L3d
                r6.setErrorIndex(r0)
                r3 = 0
                return r3
            L3d:
                int r7 = r6.getIndex()
                java.lang.String r5 = r5.substring(r7, r0)
                int r5 = java.lang.Integer.parseInt(r5)
                r6.setIndex(r0)
                int r6 = r2.field
                int r3 = r2.modify(r3, r5)
                r4.set(r6, r3)
                r3 = 1
                return r3
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "NumberStrategy [field="
                r0.<init>(r1)
                int r1 = r2.field
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static abstract class PatternStrategy extends org.apache.commons.lang3.time.FastDateParser.Strategy {
        java.util.regex.Pattern pattern;

        private PatternStrategy() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        /* synthetic */ PatternStrategy(org.apache.commons.lang3.time.FastDateParser.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        void createPattern(java.lang.String r1) {
                r0 = this;
                java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)
                r0.pattern = r1
                return
        }

        void createPattern(java.lang.StringBuilder r1) {
                r0 = this;
                java.lang.String r1 = r1.toString()
                r0.createPattern(r1)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        boolean isNumber() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.Strategy
        boolean parse(org.apache.commons.lang3.time.FastDateParser r3, java.util.Calendar r4, java.lang.String r5, java.text.ParsePosition r6, int r7) {
                r2 = this;
                java.util.regex.Pattern r7 = r2.pattern
                int r0 = r6.getIndex()
                java.lang.String r5 = r5.substring(r0)
                java.util.regex.Matcher r5 = r7.matcher(r5)
                boolean r7 = r5.lookingAt()
                if (r7 != 0) goto L1d
                int r3 = r6.getIndex()
                r6.setErrorIndex(r3)
                r3 = 0
                return r3
            L1d:
                int r7 = r6.getIndex()
                r0 = 1
                int r1 = r5.end(r0)
                int r7 = r7 + r1
                r6.setIndex(r7)
                java.lang.String r5 = r5.group(r0)
                r2.setCalendar(r3, r4, r5)
                return r0
        }

        abstract void setCalendar(org.apache.commons.lang3.time.FastDateParser r1, java.util.Calendar r2, java.lang.String r3);

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Class r1 = r2.getClass()
                java.lang.String r1 = r1.getSimpleName()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " [pattern="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.regex.Pattern r1 = r2.pattern
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private static abstract class Strategy {
        private Strategy() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Strategy(org.apache.commons.lang3.time.FastDateParser.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        boolean isNumber() {
                r1 = this;
                r0 = 0
                return r0
        }

        abstract boolean parse(org.apache.commons.lang3.time.FastDateParser r1, java.util.Calendar r2, java.lang.String r3, java.text.ParsePosition r4, int r5);
    }

    private static final class StrategyAndWidth {
        final org.apache.commons.lang3.time.FastDateParser.Strategy strategy;
        final int width;

        StrategyAndWidth(org.apache.commons.lang3.time.FastDateParser.Strategy r2, int r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "strategy"
                java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
                org.apache.commons.lang3.time.FastDateParser$Strategy r2 = (org.apache.commons.lang3.time.FastDateParser.Strategy) r2
                r1.strategy = r2
                r1.width = r3
                return
        }

        int getMaxWidth(java.util.ListIterator<org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth> r3) {
                r2 = this;
                org.apache.commons.lang3.time.FastDateParser$Strategy r0 = r2.strategy
                boolean r0 = r0.isNumber()
                r1 = 0
                if (r0 == 0) goto L23
                boolean r0 = r3.hasNext()
                if (r0 != 0) goto L10
                goto L23
            L10:
                java.lang.Object r0 = r3.next()
                org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth r0 = (org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth) r0
                org.apache.commons.lang3.time.FastDateParser$Strategy r0 = r0.strategy
                r3.previous()
                boolean r3 = r0.isNumber()
                if (r3 == 0) goto L23
                int r1 = r2.width
            L23:
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "StrategyAndWidth [strategy="
                r0.<init>(r1)
                org.apache.commons.lang3.time.FastDateParser$Strategy r1 = r2.strategy
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", width="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.width
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    private final class StrategyParser {
        private int currentIdx;
        private final java.util.Calendar definingCalendar;
        final /* synthetic */ org.apache.commons.lang3.time.FastDateParser this$0;

        StrategyParser(org.apache.commons.lang3.time.FastDateParser r1, java.util.Calendar r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.lang.String r1 = "definingCalendar"
                java.lang.Object r1 = java.util.Objects.requireNonNull(r2, r1)
                java.util.Calendar r1 = (java.util.Calendar) r1
                r0.definingCalendar = r1
                return
        }

        private org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth letterPattern(char r5) {
                r4 = this;
                int r0 = r4.currentIdx
            L2:
                int r1 = r4.currentIdx
                int r1 = r1 + 1
                r4.currentIdx = r1
                org.apache.commons.lang3.time.FastDateParser r2 = r4.this$0
                java.lang.String r2 = org.apache.commons.lang3.time.FastDateParser.access$300(r2)
                int r2 = r2.length()
                if (r1 >= r2) goto L22
                org.apache.commons.lang3.time.FastDateParser r1 = r4.this$0
                java.lang.String r1 = org.apache.commons.lang3.time.FastDateParser.access$300(r1)
                int r2 = r4.currentIdx
                char r1 = r1.charAt(r2)
                if (r1 == r5) goto L2
            L22:
                int r1 = r4.currentIdx
                int r1 = r1 - r0
                org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth r0 = new org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth
                org.apache.commons.lang3.time.FastDateParser r2 = r4.this$0
                java.util.Calendar r3 = r4.definingCalendar
                org.apache.commons.lang3.time.FastDateParser$Strategy r5 = org.apache.commons.lang3.time.FastDateParser.access$500(r2, r5, r1, r3)
                r0.<init>(r5, r1)
                return r0
        }

        private org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth literal() {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 0
            L6:
                int r2 = r6.currentIdx
                org.apache.commons.lang3.time.FastDateParser r3 = r6.this$0
                java.lang.String r3 = org.apache.commons.lang3.time.FastDateParser.access$300(r3)
                int r3 = r3.length()
                if (r2 >= r3) goto L5a
                org.apache.commons.lang3.time.FastDateParser r2 = r6.this$0
                java.lang.String r2 = org.apache.commons.lang3.time.FastDateParser.access$300(r2)
                int r3 = r6.currentIdx
                char r2 = r2.charAt(r3)
                if (r1 != 0) goto L29
                boolean r3 = org.apache.commons.lang3.time.FastDateParser.access$400(r2)
                if (r3 == 0) goto L29
                goto L5a
            L29:
                r3 = 39
                if (r2 != r3) goto L50
                int r4 = r6.currentIdx
                int r4 = r4 + 1
                r6.currentIdx = r4
                org.apache.commons.lang3.time.FastDateParser r5 = r6.this$0
                java.lang.String r5 = org.apache.commons.lang3.time.FastDateParser.access$300(r5)
                int r5 = r5.length()
                if (r4 == r5) goto L4d
                org.apache.commons.lang3.time.FastDateParser r4 = r6.this$0
                java.lang.String r4 = org.apache.commons.lang3.time.FastDateParser.access$300(r4)
                int r5 = r6.currentIdx
                char r4 = r4.charAt(r5)
                if (r4 == r3) goto L50
            L4d:
                r1 = r1 ^ 1
                goto L6
            L50:
                int r3 = r6.currentIdx
                int r3 = r3 + 1
                r6.currentIdx = r3
                r0.append(r2)
                goto L6
            L5a:
                if (r1 != 0) goto L6f
                java.lang.String r0 = r0.toString()
                org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth r1 = new org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth
                org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy r2 = new org.apache.commons.lang3.time.FastDateParser$CopyQuotedStrategy
                r2.<init>(r0)
                int r0 = r0.length()
                r1.<init>(r2, r0)
                return r1
            L6f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Unterminated quote"
                r0.<init>(r1)
                throw r0
        }

        org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth getNextStrategy() {
                r2 = this;
                int r0 = r2.currentIdx
                org.apache.commons.lang3.time.FastDateParser r1 = r2.this$0
                java.lang.String r1 = org.apache.commons.lang3.time.FastDateParser.access$300(r1)
                int r1 = r1.length()
                if (r0 < r1) goto L10
                r0 = 0
                return r0
            L10:
                org.apache.commons.lang3.time.FastDateParser r0 = r2.this$0
                java.lang.String r0 = org.apache.commons.lang3.time.FastDateParser.access$300(r0)
                int r1 = r2.currentIdx
                char r0 = r0.charAt(r1)
                boolean r1 = org.apache.commons.lang3.time.FastDateParser.access$400(r0)
                if (r1 == 0) goto L27
                org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth r0 = r2.letterPattern(r0)
                return r0
            L27:
                org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth r0 = r2.literal()
                return r0
        }
    }

    static class TimeZoneStrategy extends org.apache.commons.lang3.time.FastDateParser.PatternStrategy {
        private static final java.lang.String GMT_OPTION = "GMT[+-]\\d{1,2}:\\d{2}";
        private static final int ID = 0;
        private static final java.lang.String RFC_822_TIME_ZONE = "[+-]\\d{4}";
        private final java.util.Locale locale;
        private final java.util.Map<java.lang.String, org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.TzInfo> tzNames;

        private static final class TzInfo {
            final int dstOffset;
            final java.util.TimeZone zone;

            TzInfo(java.util.TimeZone r1, boolean r2) {
                    r0 = this;
                    r0.<init>()
                    r0.zone = r1
                    if (r2 == 0) goto Lc
                    int r1 = r1.getDSTSavings()
                    goto Ld
                Lc:
                    r1 = 0
                Ld:
                    r0.dstOffset = r1
                    return
            }

            public java.lang.String toString() {
                    r2 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    java.lang.String r1 = "TzInfo [zone="
                    r0.<init>(r1)
                    java.util.TimeZone r1 = r2.zone
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r1 = ", dstOffset="
                    java.lang.StringBuilder r0 = r0.append(r1)
                    int r1 = r2.dstOffset
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r1 = "]"
                    java.lang.StringBuilder r0 = r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }
        }

        TimeZoneStrategy(java.util.Locale r15) {
                r14 = this;
                r0 = 0
                r14.<init>(r0)
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r14.tzNames = r0
                java.util.Locale r0 = org.apache.commons.lang3.LocaleUtils.toLocale(r15)
                r14.locale = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "((?iu)[+-]\\d{4}|GMT[+-]\\d{1,2}:\\d{2}"
                r0.append(r1)
                java.util.TreeSet r1 = new java.util.TreeSet
                java.util.Comparator r2 = org.apache.commons.lang3.time.FastDateParser.access$600()
                r1.<init>(r2)
                java.text.DateFormatSymbols r2 = java.text.DateFormatSymbols.getInstance(r15)
                java.lang.String[][] r2 = r2.getZoneStrings()
                int r3 = r2.length
                r4 = 0
                r5 = r4
            L2f:
                java.lang.String r6 = "GMT"
                if (r5 >= r3) goto L74
                r7 = r2[r5]
                r8 = r7[r4]
                boolean r6 = r8.equalsIgnoreCase(r6)
                if (r6 == 0) goto L3e
                goto L71
            L3e:
                java.util.TimeZone r6 = java.util.TimeZone.getTimeZone(r8)
                org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo r8 = new org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo
                r8.<init>(r6, r4)
                r9 = 1
                r11 = r8
                r10 = r9
            L4a:
                int r12 = r7.length
                if (r10 >= r12) goto L71
                r12 = 3
                if (r10 == r12) goto L56
                r12 = 5
                if (r10 == r12) goto L54
                goto L5b
            L54:
                r11 = r8
                goto L5b
            L56:
                org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo r11 = new org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo
                r11.<init>(r6, r9)
            L5b:
                r12 = r7[r10]
                if (r12 == 0) goto L6e
                java.lang.String r12 = r12.toLowerCase(r15)
                boolean r13 = r1.add(r12)
                if (r13 == 0) goto L6e
                java.util.Map<java.lang.String, org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo> r13 = r14.tzNames
                r13.put(r12, r11)
            L6e:
                int r10 = r10 + 1
                goto L4a
            L71:
                int r5 = r5 + 1
                goto L2f
            L74:
                java.lang.String[] r2 = java.util.TimeZone.getAvailableIDs()
                int r3 = r2.length
            L79:
                if (r4 >= r3) goto La7
                r5 = r2[r4]
                boolean r7 = r5.equalsIgnoreCase(r6)
                if (r7 == 0) goto L84
                goto La4
            L84:
                java.util.TimeZone r5 = java.util.TimeZone.getTimeZone(r5)
                java.lang.String r7 = r5.getDisplayName(r15)
                java.lang.String r7 = r7.toLowerCase(r15)
                boolean r8 = r1.add(r7)
                if (r8 == 0) goto La4
                java.util.Map<java.lang.String, org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo> r8 = r14.tzNames
                org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo r9 = new org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo
                boolean r10 = r5.observesDaylightTime()
                r9.<init>(r5, r10)
                r8.put(r7, r9)
            La4:
                int r4 = r4 + 1
                goto L79
            La7:
                org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$$ExternalSyntheticLambda0 r15 = new org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$$ExternalSyntheticLambda0
                r15.<init>(r0)
                r1.forEach(r15)
                java.lang.String r15 = ")"
                r0.append(r15)
                r14.createPattern(r0)
                return
        }

        static /* synthetic */ void lambda$new$0(java.lang.StringBuilder r1, java.lang.String r2) {
                r0 = 124(0x7c, float:1.74E-43)
                java.lang.StringBuilder r1 = r1.append(r0)
                org.apache.commons.lang3.time.FastDateParser.access$700(r1, r2)
                return
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        void setCalendar(org.apache.commons.lang3.time.FastDateParser r2, java.util.Calendar r3, java.lang.String r4) {
                r1 = this;
                java.util.TimeZone r2 = org.apache.commons.lang3.time.FastTimeZone.getGmtTimeZone(r4)
                if (r2 == 0) goto La
                r3.setTimeZone(r2)
                goto L48
            La:
                java.util.Locale r2 = r1.locale
                java.lang.String r2 = r4.toLowerCase(r2)
                java.util.Map<java.lang.String, org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo> r4 = r1.tzNames
                java.lang.Object r4 = r4.get(r2)
                org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo r4 = (org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.TzInfo) r4
                if (r4 != 0) goto L36
                java.util.Map<java.lang.String, org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo> r4 = r1.tzNames
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.StringBuilder r2 = r0.append(r2)
                r0 = 46
                java.lang.StringBuilder r2 = r2.append(r0)
                java.lang.String r2 = r2.toString()
                java.lang.Object r2 = r4.get(r2)
                r4 = r2
                org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo r4 = (org.apache.commons.lang3.time.FastDateParser.TimeZoneStrategy.TzInfo) r4
            L36:
                r2 = 16
                int r0 = r4.dstOffset
                r3.set(r2, r0)
                java.util.TimeZone r2 = r4.zone
                int r2 = r2.getRawOffset()
                r4 = 15
                r3.set(r4, r2)
            L48:
                return
        }

        @Override // org.apache.commons.lang3.time.FastDateParser.PatternStrategy
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "TimeZoneStrategy [locale="
                r0.<init>(r1)
                java.util.Locale r1 = r2.locale
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", tzNames="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.Map<java.lang.String, org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy$TzInfo> r1 = r2.tzNames
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ", pattern="
                java.lang.StringBuilder r0 = r0.append(r1)
                java.util.regex.Pattern r1 = r2.pattern
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "ja"
            java.lang.String r2 = "JP"
            r0.<init>(r1, r2, r2)
            org.apache.commons.lang3.time.FastDateParser.JAPANESE_IMPERIAL = r0
            java.util.Comparator r0 = java.util.Comparator.reverseOrder()
            org.apache.commons.lang3.time.FastDateParser.LONGER_FIRST_LOWERCASE = r0
            r0 = 17
            java.util.concurrent.ConcurrentMap[] r0 = new java.util.concurrent.ConcurrentMap[r0]
            org.apache.commons.lang3.time.FastDateParser.caches = r0
            org.apache.commons.lang3.time.FastDateParser$1 r0 = new org.apache.commons.lang3.time.FastDateParser$1
            r1 = 1
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.ABBREVIATED_YEAR_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$2 r0 = new org.apache.commons.lang3.time.FastDateParser$2
            r2 = 2
            r0.<init>(r2)
            org.apache.commons.lang3.time.FastDateParser.NUMBER_MONTH_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.LITERAL_YEAR_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 3
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.WEEK_OF_YEAR_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 4
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.WEEK_OF_MONTH_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 6
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.DAY_OF_YEAR_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 5
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.DAY_OF_MONTH_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$3 r0 = new org.apache.commons.lang3.time.FastDateParser$3
            r1 = 7
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.DAY_OF_WEEK_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 8
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.DAY_OF_WEEK_IN_MONTH_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 11
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.HOUR_OF_DAY_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$4 r0 = new org.apache.commons.lang3.time.FastDateParser$4
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.HOUR24_OF_DAY_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$5 r0 = new org.apache.commons.lang3.time.FastDateParser$5
            r1 = 10
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.HOUR12_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.HOUR_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 12
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.MINUTE_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 13
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.SECOND_STRATEGY = r0
            org.apache.commons.lang3.time.FastDateParser$NumberStrategy r0 = new org.apache.commons.lang3.time.FastDateParser$NumberStrategy
            r1 = 14
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser.MILLISECOND_STRATEGY = r0
            return
    }

    protected FastDateParser(java.lang.String r2, java.util.TimeZone r3, java.util.Locale r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    protected FastDateParser(java.lang.String r2, java.util.TimeZone r3, java.util.Locale r4, java.util.Date r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "pattern"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.pattern = r2
            java.lang.String r2 = "timeZone"
            java.lang.Object r2 = java.util.Objects.requireNonNull(r3, r2)
            java.util.TimeZone r2 = (java.util.TimeZone) r2
            r1.timeZone = r2
            java.util.Locale r2 = org.apache.commons.lang3.LocaleUtils.toLocale(r4)
            r1.locale = r2
            java.util.Calendar r3 = java.util.Calendar.getInstance(r3, r2)
            r4 = 1
            if (r5 == 0) goto L2c
            r3.setTime(r5)
            int r2 = r3.get(r4)
            goto L44
        L2c:
            java.util.Locale r5 = org.apache.commons.lang3.time.FastDateParser.JAPANESE_IMPERIAL
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L36
            r2 = 0
            goto L44
        L36:
            java.util.Date r2 = new java.util.Date
            r2.<init>()
            r3.setTime(r2)
            int r2 = r3.get(r4)
            int r2 = r2 + (-80)
        L44:
            int r4 = r2 / 100
            int r4 = r4 * 100
            r1.century = r4
            int r2 = r2 - r4
            r1.startYear = r2
            r1.init(r3)
            return
    }

    static /* synthetic */ java.util.Map access$100(java.util.Calendar r0, java.util.Locale r1, int r2, java.lang.StringBuilder r3) {
            java.util.Map r0 = appendDisplayNames(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ java.lang.String access$300(org.apache.commons.lang3.time.FastDateParser r0) {
            java.lang.String r0 = r0.pattern
            return r0
    }

    static /* synthetic */ boolean access$400(char r0) {
            boolean r0 = isFormatLetter(r0)
            return r0
    }

    static /* synthetic */ org.apache.commons.lang3.time.FastDateParser.Strategy access$500(org.apache.commons.lang3.time.FastDateParser r0, char r1, int r2, java.util.Calendar r3) {
            org.apache.commons.lang3.time.FastDateParser$Strategy r0 = r0.getStrategy(r1, r2, r3)
            return r0
    }

    static /* synthetic */ java.util.Comparator access$600() {
            java.util.Comparator<java.lang.String> r0 = org.apache.commons.lang3.time.FastDateParser.LONGER_FIRST_LOWERCASE
            return r0
    }

    static /* synthetic */ java.lang.StringBuilder access$700(java.lang.StringBuilder r0, java.lang.String r1) {
            java.lang.StringBuilder r0 = simpleQuote(r0, r1)
            return r0
    }

    static /* synthetic */ int access$800(org.apache.commons.lang3.time.FastDateParser r0, int r1) {
            int r0 = r0.adjustYear(r1)
            return r0
    }

    private int adjustYear(int r3) {
            r2 = this;
            int r0 = r2.century
            int r0 = r0 + r3
            int r1 = r2.startYear
            if (r3 < r1) goto L8
            goto La
        L8:
            int r0 = r0 + 100
        La:
            return r0
    }

    private static java.util.Map<java.lang.String, java.lang.Integer> appendDisplayNames(java.util.Calendar r2, java.util.Locale r3, int r4, java.lang.StringBuilder r5) {
            java.lang.String r0 = "calendar"
            java.util.Objects.requireNonNull(r2, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Locale r3 = org.apache.commons.lang3.LocaleUtils.toLocale(r3)
            r1 = 0
            java.util.Map r2 = r2.getDisplayNames(r4, r1, r3)
            java.util.TreeSet r4 = new java.util.TreeSet
            java.util.Comparator<java.lang.String> r1 = org.apache.commons.lang3.time.FastDateParser.LONGER_FIRST_LOWERCASE
            r4.<init>(r1)
            org.apache.commons.lang3.time.FastDateParser$$ExternalSyntheticLambda1 r1 = new org.apache.commons.lang3.time.FastDateParser$$ExternalSyntheticLambda1
            r1.<init>(r3, r4, r0)
            r2.forEach(r1)
            org.apache.commons.lang3.time.FastDateParser$$ExternalSyntheticLambda2 r2 = new org.apache.commons.lang3.time.FastDateParser$$ExternalSyntheticLambda2
            r2.<init>(r5)
            r4.forEach(r2)
            return r0
    }

    private static java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser.Strategy> getCache(int r3) {
            java.util.concurrent.ConcurrentMap<java.util.Locale, org.apache.commons.lang3.time.FastDateParser$Strategy>[] r0 = org.apache.commons.lang3.time.FastDateParser.caches
            monitor-enter(r0)
            r1 = r0[r3]     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lf
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap     // Catch: java.lang.Throwable -> L13
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L13
            r0[r3] = r1     // Catch: java.lang.Throwable -> L13
        Lf:
            r3 = r0[r3]     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r3
        L13:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r3
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getLocaleSpecificStrategy(int r4, java.util.Calendar r5) {
            r3 = this;
            java.util.concurrent.ConcurrentMap r0 = getCache(r4)
            java.util.Locale r1 = r3.locale
            org.apache.commons.lang3.time.FastDateParser$$ExternalSyntheticLambda0 r2 = new org.apache.commons.lang3.time.FastDateParser$$ExternalSyntheticLambda0
            r2.<init>(r3, r4, r5)
            java.lang.Object r4 = r0.computeIfAbsent(r1, r2)
            org.apache.commons.lang3.time.FastDateParser$Strategy r4 = (org.apache.commons.lang3.time.FastDateParser.Strategy) r4
            return r4
    }

    private org.apache.commons.lang3.time.FastDateParser.Strategy getStrategy(char r3, int r4, java.util.Calendar r5) {
            r2 = this;
            r0 = 83
            if (r3 == r0) goto Lae
            r0 = 97
            if (r3 == r0) goto La7
            r0 = 100
            if (r3 == r0) goto La4
            r0 = 104(0x68, float:1.46E-43)
            if (r3 == r0) goto La1
            r0 = 107(0x6b, float:1.5E-43)
            if (r3 == r0) goto L9e
            r0 = 109(0x6d, float:1.53E-43)
            if (r3 == r0) goto L9b
            r0 = 115(0x73, float:1.61E-43)
            if (r3 == r0) goto L98
            r0 = 117(0x75, float:1.64E-43)
            if (r3 == r0) goto L95
            r0 = 119(0x77, float:1.67E-43)
            if (r3 == r0) goto L92
            r0 = 121(0x79, float:1.7E-43)
            r1 = 2
            if (r3 == r0) goto L8a
            r0 = 122(0x7a, float:1.71E-43)
            if (r3 == r0) goto L83
            switch(r3) {
                case 68: goto L80;
                case 69: goto L7a;
                case 70: goto L77;
                case 71: goto L71;
                case 72: goto L6e;
                default: goto L30;
            }
        L30:
            switch(r3) {
                case 75: goto L6b;
                case 76: goto L60;
                case 77: goto L60;
                default: goto L33;
            }
        L33:
            switch(r3) {
                case 87: goto L5d;
                case 88: goto L58;
                case 89: goto L8a;
                case 90: goto L51;
                default: goto L36;
            }
        L36:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Format '"
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = "' not supported"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L51:
            if (r4 != r1) goto L83
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.access$900()
            return r3
        L58:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.ISO8601TimeZoneStrategy.getStrategy(r4)
            return r3
        L5d:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.WEEK_OF_MONTH_STRATEGY
            return r3
        L60:
            r3 = 3
            if (r4 < r3) goto L68
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = r2.getLocaleSpecificStrategy(r1, r5)
            goto L6a
        L68:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.NUMBER_MONTH_STRATEGY
        L6a:
            return r3
        L6b:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.HOUR_STRATEGY
            return r3
        L6e:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.HOUR_OF_DAY_STRATEGY
            return r3
        L71:
            r3 = 0
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = r2.getLocaleSpecificStrategy(r3, r5)
            return r3
        L77:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.DAY_OF_WEEK_IN_MONTH_STRATEGY
            return r3
        L7a:
            r3 = 7
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = r2.getLocaleSpecificStrategy(r3, r5)
            return r3
        L80:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.DAY_OF_YEAR_STRATEGY
            return r3
        L83:
            r3 = 15
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = r2.getLocaleSpecificStrategy(r3, r5)
            return r3
        L8a:
            if (r4 <= r1) goto L8f
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.LITERAL_YEAR_STRATEGY
            goto L91
        L8f:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.ABBREVIATED_YEAR_STRATEGY
        L91:
            return r3
        L92:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.WEEK_OF_YEAR_STRATEGY
            return r3
        L95:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.DAY_OF_WEEK_STRATEGY
            return r3
        L98:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.SECOND_STRATEGY
            return r3
        L9b:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.MINUTE_STRATEGY
            return r3
        L9e:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.HOUR24_OF_DAY_STRATEGY
            return r3
        La1:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.HOUR12_STRATEGY
            return r3
        La4:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.DAY_OF_MONTH_STRATEGY
            return r3
        La7:
            r3 = 9
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = r2.getLocaleSpecificStrategy(r3, r5)
            return r3
        Lae:
            org.apache.commons.lang3.time.FastDateParser$Strategy r3 = org.apache.commons.lang3.time.FastDateParser.MILLISECOND_STRATEGY
            return r3
    }

    private void init(java.util.Calendar r3) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.patterns = r0
            org.apache.commons.lang3.time.FastDateParser$StrategyParser r0 = new org.apache.commons.lang3.time.FastDateParser$StrategyParser
            r0.<init>(r2, r3)
        Lc:
            org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth r3 = r0.getNextStrategy()
            if (r3 != 0) goto L13
            return
        L13:
            java.util.List<org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth> r1 = r2.patterns
            r1.add(r3)
            goto Lc
    }

    private static boolean isFormatLetter(char r1) {
            r0 = 65
            if (r1 < r0) goto L8
            r0 = 90
            if (r1 <= r0) goto L10
        L8:
            r0 = 97
            if (r1 < r0) goto L12
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 > r0) goto L12
        L10:
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    static /* synthetic */ void lambda$appendDisplayNames$0(java.util.Locale r0, java.util.TreeSet r1, java.util.Map r2, java.lang.String r3, java.lang.Integer r4) {
            java.lang.String r0 = r3.toLowerCase(r0)
            boolean r1 = r1.add(r0)
            if (r1 == 0) goto Ld
            r2.put(r0, r4)
        Ld:
            return
    }

    static /* synthetic */ void lambda$appendDisplayNames$1(java.lang.StringBuilder r0, java.lang.String r1) {
            java.lang.StringBuilder r0 = simpleQuote(r0, r1)
            r1 = 124(0x7c, float:1.74E-43)
            r0.append(r1)
            return
    }

    private void readObject(java.io.ObjectInputStream r2) throws java.io.IOException, java.lang.ClassNotFoundException {
            r1 = this;
            r2.defaultReadObject()
            java.util.TimeZone r2 = r1.timeZone
            java.util.Locale r0 = r1.locale
            java.util.Calendar r2 = java.util.Calendar.getInstance(r2, r0)
            r1.init(r2)
            return
    }

    private static java.lang.StringBuilder simpleQuote(java.lang.StringBuilder r6, java.lang.String r7) {
            r0 = 0
        L1:
            int r1 = r7.length()
            r2 = 63
            r3 = 46
            if (r0 >= r1) goto L38
            char r1 = r7.charAt(r0)
            r4 = 36
            r5 = 92
            if (r1 == r4) goto L2f
            if (r1 == r3) goto L2f
            if (r1 == r2) goto L2f
            r2 = 94
            if (r1 == r2) goto L2f
            r2 = 91
            if (r1 == r2) goto L2f
            if (r1 == r5) goto L2f
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L2f
            r2 = 124(0x7c, float:1.74E-43)
            if (r1 == r2) goto L2f
            switch(r1) {
                case 40: goto L2f;
                case 41: goto L2f;
                case 42: goto L2f;
                case 43: goto L2f;
                default: goto L2e;
            }
        L2e:
            goto L32
        L2f:
            r6.append(r5)
        L32:
            r6.append(r1)
            int r0 = r0 + 1
            goto L1
        L38:
            int r7 = r6.length()
            int r7 = r7 + (-1)
            char r7 = r6.charAt(r7)
            if (r7 != r3) goto L47
            r6.append(r2)
        L47:
            return r6
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof org.apache.commons.lang3.time.FastDateParser
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.apache.commons.lang3.time.FastDateParser r4 = (org.apache.commons.lang3.time.FastDateParser) r4
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

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public java.util.Locale getLocale() {
            r1 = this;
            java.util.Locale r0 = r1.locale
            return r0
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public java.lang.String getPattern() {
            r1 = this;
            java.lang.String r0 = r1.pattern
            return r0
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
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

    /* JADX INFO: renamed from: lambda$getLocaleSpecificStrategy$2$org-apache-commons-lang3-time-FastDateParser, reason: not valid java name */
    /* synthetic */ org.apache.commons.lang3.time.FastDateParser.Strategy m2677xdc739664(int r2, java.util.Calendar r3, java.util.Locale r4) {
            r1 = this;
            r4 = 15
            if (r2 != r4) goto Lc
            org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy r2 = new org.apache.commons.lang3.time.FastDateParser$TimeZoneStrategy
            java.util.Locale r3 = r1.locale
            r2.<init>(r3)
            goto L14
        Lc:
            org.apache.commons.lang3.time.FastDateParser$CaseInsensitiveTextStrategy r4 = new org.apache.commons.lang3.time.FastDateParser$CaseInsensitiveTextStrategy
            java.util.Locale r0 = r1.locale
            r4.<init>(r2, r3, r0)
            r2 = r4
        L14:
            return r2
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public java.util.Date parse(java.lang.String r5) throws java.text.ParseException {
            r4 = this;
            java.text.ParsePosition r0 = new java.text.ParsePosition
            r1 = 0
            r0.<init>(r1)
            java.util.Date r1 = r4.parse(r5, r0)
            if (r1 != 0) goto L54
            java.util.Locale r1 = r4.locale
            java.util.Locale r2 = org.apache.commons.lang3.time.FastDateParser.JAPANESE_IMPERIAL
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3b
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "(The "
            r2.<init>(r3)
            java.util.Locale r3 = r4.locale
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " locale does not support dates before 1868 AD)\nUnparseable date: \""
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            int r0 = r0.getErrorIndex()
            r1.<init>(r5, r0)
            throw r1
        L3b:
            java.text.ParseException r1 = new java.text.ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unparseable date: "
            r2.<init>(r3)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            int r0 = r0.getErrorIndex()
            r1.<init>(r5, r0)
            throw r1
        L54:
            return r1
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public java.util.Date parse(java.lang.String r3, java.text.ParsePosition r4) {
            r2 = this;
            java.util.TimeZone r0 = r2.timeZone
            java.util.Locale r1 = r2.locale
            java.util.Calendar r0 = java.util.Calendar.getInstance(r0, r1)
            r0.clear()
            boolean r3 = r2.parse(r3, r4, r0)
            if (r3 == 0) goto L16
            java.util.Date r3 = r0.getTime()
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public boolean parse(java.lang.String r9, java.text.ParsePosition r10, java.util.Calendar r11) {
            r8 = this;
            java.util.List<org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth> r0 = r8.patterns
            java.util.ListIterator r0 = r0.listIterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth r1 = (org.apache.commons.lang3.time.FastDateParser.StrategyAndWidth) r1
            int r7 = r1.getMaxWidth(r0)
            org.apache.commons.lang3.time.FastDateParser$Strategy r2 = r1.strategy
            r3 = r8
            r4 = r11
            r5 = r9
            r6 = r10
            boolean r1 = r2.parse(r3, r4, r5, r6, r7)
            if (r1 != 0) goto L6
            r9 = 0
            return r9
        L24:
            r9 = 1
            return r9
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public java.lang.Object parseObject(java.lang.String r1) throws java.text.ParseException {
            r0 = this;
            java.util.Date r1 = r0.parse(r1)
            return r1
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public java.lang.Object parseObject(java.lang.String r1, java.text.ParsePosition r2) {
            r0 = this;
            java.util.Date r1 = r0.parse(r1, r2)
            return r1
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FastDateParser["
            r0.<init>(r1)
            java.lang.String r1 = r3.pattern
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
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

    public java.lang.String toStringAll() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FastDateParser [pattern="
            r0.<init>(r1)
            java.lang.String r1 = r2.pattern
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", timeZone="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.TimeZone r1 = r2.timeZone
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", locale="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.Locale r1 = r2.locale
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", century="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.century
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", startYear="
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r2.startYear
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", patterns="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.util.List<org.apache.commons.lang3.time.FastDateParser$StrategyAndWidth> r1 = r2.patterns
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
