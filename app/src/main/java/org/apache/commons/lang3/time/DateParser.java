package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public interface DateParser {
    java.util.Locale getLocale();

    java.lang.String getPattern();

    java.util.TimeZone getTimeZone();

    java.util.Date parse(java.lang.String r1) throws java.text.ParseException;

    java.util.Date parse(java.lang.String r1, java.text.ParsePosition r2);

    boolean parse(java.lang.String r1, java.text.ParsePosition r2, java.util.Calendar r3);

    java.lang.Object parseObject(java.lang.String r1) throws java.text.ParseException;

    java.lang.Object parseObject(java.lang.String r1, java.text.ParsePosition r2);
}
