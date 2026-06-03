package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class FastDateFormat extends java.text.Format implements org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter {
    public static final int FULL = 0;
    public static final int LONG = 1;
    public static final int MEDIUM = 2;
    public static final int SHORT = 3;
    private static final org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> cache = null;
    private static final long serialVersionUID = 2;
    private final org.apache.commons.lang3.time.FastDateParser parser;
    private final org.apache.commons.lang3.time.FastDatePrinter printer;


    static {
            org.apache.commons.lang3.time.FastDateFormat$1 r0 = new org.apache.commons.lang3.time.FastDateFormat$1
            r0.<init>()
            org.apache.commons.lang3.time.FastDateFormat.cache = r0
            return
    }

    protected FastDateFormat(java.lang.String r2, java.util.TimeZone r3, java.util.Locale r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r4, r0)
            return
    }

    protected FastDateFormat(java.lang.String r2, java.util.TimeZone r3, java.util.Locale r4, java.util.Date r5) {
            r1 = this;
            r1.<init>()
            org.apache.commons.lang3.time.FastDatePrinter r0 = new org.apache.commons.lang3.time.FastDatePrinter
            r0.<init>(r2, r3, r4)
            r1.printer = r0
            org.apache.commons.lang3.time.FastDateParser r0 = new org.apache.commons.lang3.time.FastDateParser
            r0.<init>(r2, r3, r4, r5)
            r1.parser = r0
            return
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int r2) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getDateInstance(r2, r1, r1)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getDateInstance(r2, r1, r3)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int r2, java.util.TimeZone r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getDateInstance(r2, r3, r1)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateInstance(int r1, java.util.TimeZone r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            java.text.Format r1 = r0.getDateInstance(r1, r2, r3)
            org.apache.commons.lang3.time.FastDateFormat r1 = (org.apache.commons.lang3.time.FastDateFormat) r1
            return r1
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int r2, int r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getDateTimeInstance(r2, r3, r1, r1)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int r2, int r3, java.util.Locale r4) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getDateTimeInstance(r2, r3, r1, r4)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int r1, int r2, java.util.TimeZone r3) {
            r0 = 0
            org.apache.commons.lang3.time.FastDateFormat r1 = getDateTimeInstance(r1, r2, r3, r0)
            return r1
    }

    public static org.apache.commons.lang3.time.FastDateFormat getDateTimeInstance(int r1, int r2, java.util.TimeZone r3, java.util.Locale r4) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            java.text.Format r1 = r0.getDateTimeInstance(r1, r2, r3, r4)
            org.apache.commons.lang3.time.FastDateFormat r1 = (org.apache.commons.lang3.time.FastDateFormat) r1
            return r1
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance() {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            java.text.Format r0 = r0.getInstance()
            org.apache.commons.lang3.time.FastDateFormat r0 = (org.apache.commons.lang3.time.FastDateFormat) r0
            return r0
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String r2) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getInstance(r2, r1, r1)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getInstance(r2, r1, r3)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String r2, java.util.TimeZone r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getInstance(r2, r3, r1)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getInstance(java.lang.String r1, java.util.TimeZone r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            java.text.Format r1 = r0.getInstance(r1, r2, r3)
            org.apache.commons.lang3.time.FastDateFormat r1 = (org.apache.commons.lang3.time.FastDateFormat) r1
            return r1
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int r2) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getTimeInstance(r2, r1, r1)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getTimeInstance(r2, r1, r3)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int r2, java.util.TimeZone r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            r1 = 0
            java.text.Format r2 = r0.getTimeInstance(r2, r3, r1)
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            return r2
    }

    public static org.apache.commons.lang3.time.FastDateFormat getTimeInstance(int r1, java.util.TimeZone r2, java.util.Locale r3) {
            org.apache.commons.lang3.time.AbstractFormatCache<org.apache.commons.lang3.time.FastDateFormat> r0 = org.apache.commons.lang3.time.FastDateFormat.cache
            java.text.Format r1 = r0.getTimeInstance(r1, r2, r3)
            org.apache.commons.lang3.time.FastDateFormat r1 = (org.apache.commons.lang3.time.FastDateFormat) r1
            return r1
    }

    @java.lang.Deprecated
    protected java.lang.StringBuffer applyRules(java.util.Calendar r2, java.lang.StringBuffer r3) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.StringBuffer r2 = r0.applyRules(r2, r3)
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof org.apache.commons.lang3.time.FastDateFormat
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            org.apache.commons.lang3.time.FastDateFormat r2 = (org.apache.commons.lang3.time.FastDateFormat) r2
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            org.apache.commons.lang3.time.FastDatePrinter r2 = r2.printer
            boolean r2 = r0.equals(r2)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(long r2, B r4) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.Appendable r2 = r0.format(r2, r4)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(java.util.Calendar r2, B r3) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.Appendable r2 = r0.format(r2, r3)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public <B extends java.lang.Appendable> B format(java.util.Date r2, B r3) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.Appendable r2 = r0.format(r2, r3)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(long r2) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.String r2 = r0.format(r2)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(java.util.Calendar r2) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.String r2 = r0.format(r2)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    public java.lang.String format(java.util.Date r2) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.String r2 = r0.format(r2)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @java.lang.Deprecated
    public java.lang.StringBuffer format(long r2, java.lang.StringBuffer r4) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.StringBuffer r2 = r0.format(r2, r4)
            return r2
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.DatePrinter
    public java.lang.StringBuffer format(java.lang.Object r1, java.lang.StringBuffer r2, java.text.FieldPosition r3) {
            r0 = this;
            org.apache.commons.lang3.time.FastDatePrinter r3 = r0.printer
            java.lang.String r1 = r3.format(r1)
            java.lang.StringBuffer r1 = r2.append(r1)
            return r1
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @java.lang.Deprecated
    public java.lang.StringBuffer format(java.util.Calendar r2, java.lang.StringBuffer r3) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.StringBuffer r2 = r0.format(r2, r3)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DatePrinter
    @java.lang.Deprecated
    public java.lang.StringBuffer format(java.util.Date r2, java.lang.StringBuffer r3) {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.StringBuffer r2 = r0.format(r2, r3)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public java.util.Locale getLocale() {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.util.Locale r0 = r0.getLocale()
            return r0
    }

    public int getMaxLengthEstimate() {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            int r0 = r0.getMaxLengthEstimate()
            return r0
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public java.lang.String getPattern() {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.lang.String r0 = r0.getPattern()
            return r0
    }

    @Override // org.apache.commons.lang3.time.DateParser, org.apache.commons.lang3.time.DatePrinter
    public java.util.TimeZone getTimeZone() {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            java.util.TimeZone r0 = r0.getTimeZone()
            return r0
    }

    public int hashCode() {
            r1 = this;
            org.apache.commons.lang3.time.FastDatePrinter r0 = r1.printer
            int r0 = r0.hashCode()
            return r0
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public java.util.Date parse(java.lang.String r2) throws java.text.ParseException {
            r1 = this;
            org.apache.commons.lang3.time.FastDateParser r0 = r1.parser
            java.util.Date r2 = r0.parse(r2)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public java.util.Date parse(java.lang.String r2, java.text.ParsePosition r3) {
            r1 = this;
            org.apache.commons.lang3.time.FastDateParser r0 = r1.parser
            java.util.Date r2 = r0.parse(r2, r3)
            return r2
    }

    @Override // org.apache.commons.lang3.time.DateParser
    public boolean parse(java.lang.String r2, java.text.ParsePosition r3, java.util.Calendar r4) {
            r1 = this;
            org.apache.commons.lang3.time.FastDateParser r0 = r1.parser
            boolean r2 = r0.parse(r2, r3, r4)
            return r2
    }

    @Override // java.text.Format, org.apache.commons.lang3.time.DateParser
    public java.lang.Object parseObject(java.lang.String r2, java.text.ParsePosition r3) {
            r1 = this;
            org.apache.commons.lang3.time.FastDateParser r0 = r1.parser
            java.lang.Object r2 = r0.parseObject(r2, r3)
            return r2
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FastDateFormat["
            r0.<init>(r1)
            org.apache.commons.lang3.time.FastDatePrinter r1 = r3.printer
            java.lang.String r1 = r1.getPattern()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ","
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.lang3.time.FastDatePrinter r2 = r3.printer
            java.util.Locale r2 = r2.getLocale()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            org.apache.commons.lang3.time.FastDatePrinter r1 = r3.printer
            java.util.TimeZone r1 = r1.getTimeZone()
            java.lang.String r1 = r1.getID()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
