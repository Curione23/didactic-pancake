package org.apache.commons.lang3.time;

/* JADX INFO: loaded from: classes2.dex */
public class FastTimeZone {
    private static final java.util.regex.Pattern GMT_PATTERN = null;
    private static final java.util.TimeZone GREENWICH = null;

    static {
            java.lang.String r0 = "^(?:(?i)GMT)?([+-])?(\\d\\d?)?(:?(\\d\\d?))?$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.apache.commons.lang3.time.FastTimeZone.GMT_PATTERN = r0
            org.apache.commons.lang3.time.GmtTimeZone r0 = new org.apache.commons.lang3.time.GmtTimeZone
            r1 = 0
            r0.<init>(r1, r1, r1)
            org.apache.commons.lang3.time.FastTimeZone.GREENWICH = r0
            return
    }

    private FastTimeZone() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.TimeZone getGmtTimeZone() {
            java.util.TimeZone r0 = org.apache.commons.lang3.time.FastTimeZone.GREENWICH
            return r0
    }

    public static java.util.TimeZone getGmtTimeZone(java.lang.String r4) {
            java.lang.String r0 = "Z"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L47
            java.lang.String r0 = "UTC"
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L11
            goto L47
        L11:
            java.util.regex.Pattern r0 = org.apache.commons.lang3.time.FastTimeZone.GMT_PATTERN
            java.util.regex.Matcher r4 = r0.matcher(r4)
            boolean r0 = r4.matches()
            if (r0 == 0) goto L45
            r0 = 2
            java.lang.String r0 = r4.group(r0)
            int r0 = parseInt(r0)
            r1 = 4
            java.lang.String r1 = r4.group(r1)
            int r1 = parseInt(r1)
            if (r0 != 0) goto L36
            if (r1 != 0) goto L36
            java.util.TimeZone r4 = org.apache.commons.lang3.time.FastTimeZone.GREENWICH
            return r4
        L36:
            org.apache.commons.lang3.time.GmtTimeZone r2 = new org.apache.commons.lang3.time.GmtTimeZone
            r3 = 1
            java.lang.String r4 = r4.group(r3)
            boolean r4 = parseSign(r4)
            r2.<init>(r4, r0, r1)
            return r2
        L45:
            r4 = 0
            return r4
        L47:
            java.util.TimeZone r4 = org.apache.commons.lang3.time.FastTimeZone.GREENWICH
            return r4
    }

    public static java.util.TimeZone getTimeZone(java.lang.String r1) {
            java.util.TimeZone r0 = getGmtTimeZone(r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            return r1
    }

    private static int parseInt(java.lang.String r0) {
            if (r0 == 0) goto L7
            int r0 = java.lang.Integer.parseInt(r0)
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    private static boolean parseSign(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto Lc
            char r2 = r2.charAt(r0)
            r1 = 45
            if (r2 != r1) goto Lc
            r0 = 1
        Lc:
            return r0
    }
}
