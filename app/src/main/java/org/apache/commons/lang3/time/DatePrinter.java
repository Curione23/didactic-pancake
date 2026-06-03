package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public interface DatePrinter {
    <B extends java.lang.Appendable> B format(long r1, B r3);

    <B extends java.lang.Appendable> B format(java.util.Calendar r1, B r2);

    <B extends java.lang.Appendable> B format(java.util.Date r1, B r2);

    java.lang.String format(long r1);

    java.lang.String format(java.util.Calendar r1);

    java.lang.String format(java.util.Date r1);

    @java.lang.Deprecated
    java.lang.StringBuffer format(long r1, java.lang.StringBuffer r3);

    java.lang.StringBuffer format(java.lang.Object r1, java.lang.StringBuffer r2, java.text.FieldPosition r3);

    @java.lang.Deprecated
    java.lang.StringBuffer format(java.util.Calendar r1, java.lang.StringBuffer r2);

    @java.lang.Deprecated
    java.lang.StringBuffer format(java.util.Date r1, java.lang.StringBuffer r2);

    java.util.Locale getLocale();

    java.lang.String getPattern();

    java.util.TimeZone getTimeZone();
}
