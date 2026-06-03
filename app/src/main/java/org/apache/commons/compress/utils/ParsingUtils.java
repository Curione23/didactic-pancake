package org.apache.commons.compress.utils;

/* JADX INFO: loaded from: classes2.dex */
public final class ParsingUtils {
    private ParsingUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int parseIntValue(java.lang.String r1) throws java.io.IOException {
            r0 = 10
            int r1 = parseIntValue(r1, r0)
            return r1
    }

    public static int parseIntValue(java.lang.String r2, int r3) throws java.io.IOException {
            int r2 = java.lang.Integer.parseInt(r2, r3)     // Catch: java.lang.NumberFormatException -> L5
            return r2
        L5:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to parse int from string value: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }

    public static long parseLongValue(java.lang.String r2) throws java.io.IOException {
            r0 = 10
            long r0 = parseLongValue(r2, r0)
            return r0
    }

    public static long parseLongValue(java.lang.String r2, int r3) throws java.io.IOException {
            long r2 = java.lang.Long.parseLong(r2, r3)     // Catch: java.lang.NumberFormatException -> L5
            return r2
        L5:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to parse long from string value: "
            r0.<init>(r1)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            r3.<init>(r2)
            throw r3
    }
}
