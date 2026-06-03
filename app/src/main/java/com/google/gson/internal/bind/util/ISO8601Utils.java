package com.google.gson.internal.bind.util;

/* JADX INFO: loaded from: classes2.dex */
public class ISO8601Utils {
    private static final java.util.TimeZone TIMEZONE_UTC = null;
    private static final java.lang.String UTC_ID = "UTC";

    static {
            java.lang.String r0 = "UTC"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC = r0
            return
    }

    private ISO8601Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean checkOffset(java.lang.String r1, int r2, char r3) {
            int r0 = r1.length()
            if (r2 >= r0) goto Le
            char r1 = r1.charAt(r2)
            if (r1 != r3) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    public static java.lang.String format(java.util.Date r2) {
            r0 = 0
            java.util.TimeZone r1 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            java.lang.String r2 = format(r2, r0, r1)
            return r2
    }

    public static java.lang.String format(java.util.Date r1, boolean r2) {
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC
            java.lang.String r1 = format(r1, r2, r0)
            return r1
    }

    public static java.lang.String format(java.util.Date r8, boolean r9, java.util.TimeZone r10) {
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            java.util.Locale r1 = java.util.Locale.US
            r0.<init>(r10, r1)
            r0.setTime(r8)
            java.lang.String r8 = "yyyy-MM-ddThh:mm:ss"
            int r8 = r8.length()
            if (r9 == 0) goto L19
            java.lang.String r1 = ".sss"
            int r1 = r1.length()
            goto L1a
        L19:
            r1 = 0
        L1a:
            int r8 = r8 + r1
            int r1 = r10.getRawOffset()
            if (r1 != 0) goto L24
            java.lang.String r1 = "Z"
            goto L26
        L24:
            java.lang.String r1 = "+hh:mm"
        L26:
            int r1 = r1.length()
            int r8 = r8 + r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r8)
            r8 = 1
            int r2 = r0.get(r8)
            java.lang.String r3 = "yyyy"
            int r3 = r3.length()
            padInt(r1, r2, r3)
            r2 = 45
            r1.append(r2)
            r3 = 2
            int r3 = r0.get(r3)
            int r3 = r3 + r8
            java.lang.String r8 = "MM"
            int r8 = r8.length()
            padInt(r1, r3, r8)
            r1.append(r2)
            r8 = 5
            int r8 = r0.get(r8)
            java.lang.String r3 = "dd"
            int r3 = r3.length()
            padInt(r1, r8, r3)
            r8 = 84
            r1.append(r8)
            r8 = 11
            int r8 = r0.get(r8)
            java.lang.String r3 = "hh"
            int r4 = r3.length()
            padInt(r1, r8, r4)
            r8 = 58
            r1.append(r8)
            r4 = 12
            int r4 = r0.get(r4)
            java.lang.String r5 = "mm"
            int r6 = r5.length()
            padInt(r1, r4, r6)
            r1.append(r8)
            r4 = 13
            int r4 = r0.get(r4)
            java.lang.String r6 = "ss"
            int r6 = r6.length()
            padInt(r1, r4, r6)
            if (r9 == 0) goto Lb3
            r9 = 46
            r1.append(r9)
            r9 = 14
            int r9 = r0.get(r9)
            java.lang.String r4 = "sss"
            int r4 = r4.length()
            padInt(r1, r9, r4)
        Lb3:
            long r6 = r0.getTimeInMillis()
            int r9 = r10.getOffset(r6)
            if (r9 == 0) goto Le8
            r10 = 60000(0xea60, float:8.4078E-41)
            int r10 = r9 / r10
            int r0 = r10 / 60
            int r0 = java.lang.Math.abs(r0)
            int r10 = r10 % 60
            int r10 = java.lang.Math.abs(r10)
            if (r9 >= 0) goto Ld1
            goto Ld3
        Ld1:
            r2 = 43
        Ld3:
            r1.append(r2)
            int r9 = r3.length()
            padInt(r1, r0, r9)
            r1.append(r8)
            int r8 = r5.length()
            padInt(r1, r10, r8)
            goto Led
        Le8:
            r8 = 90
            r1.append(r8)
        Led:
            java.lang.String r8 = r1.toString()
            return r8
    }

    private static int indexOfNonDigit(java.lang.String r2, int r3) {
        L0:
            int r0 = r2.length()
            if (r3 >= r0) goto L17
            char r0 = r2.charAt(r3)
            r1 = 48
            if (r0 < r1) goto L16
            r1 = 57
            if (r0 <= r1) goto L13
            goto L16
        L13:
            int r3 = r3 + 1
            goto L0
        L16:
            return r3
        L17:
            int r2 = r2.length()
            return r2
    }

    private static void padInt(java.lang.StringBuilder r1, int r2, int r3) {
            java.lang.String r2 = java.lang.Integer.toString(r2)
            int r0 = r2.length()
            int r3 = r3 - r0
        L9:
            if (r3 <= 0) goto L13
            r0 = 48
            r1.append(r0)
            int r3 = r3 + (-1)
            goto L9
        L13:
            r1.append(r2)
            return
    }

    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
            r1 = r19
            r2 = r20
            java.lang.String r0 = "Mismatching time zone indicator: "
            java.lang.String r3 = "GMT"
            java.lang.String r4 = "Invalid time zone indicator '"
            int r5 = r20.getIndex()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r6 = r5 + 4
            int r7 = parseInt(r1, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r8 = 45
            boolean r9 = checkOffset(r1, r6, r8)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r10 = 5
            if (r9 == 0) goto L1f
            int r6 = r5 + 5
        L1f:
            int r5 = r6 + 2
            int r9 = parseInt(r1, r6, r5)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            boolean r11 = checkOffset(r1, r5, r8)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r11 == 0) goto L2d
            int r5 = r6 + 3
        L2d:
            int r6 = r5 + 2
            int r11 = parseInt(r1, r5, r6)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r12 = 84
            boolean r12 = checkOffset(r1, r6, r12)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r13 = 1
            r14 = 0
            if (r12 != 0) goto L54
            int r15 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r15 > r6) goto L54
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r9 = r9 - r13
            r0.<init>(r7, r9, r11)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0.setLenient(r14)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r2.setIndex(r6)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.util.Date r0 = r0.getTime()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            return r0
        L54:
            r15 = 43
            r14 = 90
            if (r12 == 0) goto Ld8
            int r6 = r5 + 3
            int r12 = r5 + 5
            int r6 = parseInt(r1, r6, r12)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r10 = 58
            boolean r16 = checkOffset(r1, r12, r10)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r16 == 0) goto L6c
            int r12 = r5 + 6
        L6c:
            int r5 = r12 + 2
            int r16 = parseInt(r1, r12, r5)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            boolean r10 = checkOffset(r1, r5, r10)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r10 == 0) goto L7b
            int r12 = r12 + 3
            r5 = r12
        L7b:
            int r10 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r10 <= r5) goto Lce
            char r10 = r1.charAt(r5)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r10 == r14) goto Lce
            if (r10 == r15) goto Lce
            if (r10 == r8) goto Lce
            int r10 = r5 + 2
            int r12 = parseInt(r1, r5, r10)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r8 = 59
            if (r12 <= r8) goto L9b
            r8 = 63
            if (r12 >= r8) goto L9b
            r12 = 59
        L9b:
            r8 = 46
            boolean r8 = checkOffset(r1, r10, r8)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r8 == 0) goto Lc8
            int r8 = r5 + 3
            int r10 = r5 + 4
            int r10 = indexOfNonDigit(r1, r10)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r5 = r5 + 6
            int r5 = java.lang.Math.min(r10, r5)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r17 = parseInt(r1, r8, r5)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r5 = r5 - r8
            if (r5 == r13) goto Lbf
            r8 = 2
            if (r5 == r8) goto Lbc
            goto Lc1
        Lbc:
            int r17 = r17 * 10
            goto Lc1
        Lbf:
            int r17 = r17 * 100
        Lc1:
            r5 = r6
            r6 = r10
            r8 = r16
            r10 = r17
            goto Ldc
        Lc8:
            r5 = r6
            r6 = r10
            r8 = r16
            r10 = 0
            goto Ldc
        Lce:
            r8 = r16
            r10 = 0
            r12 = 0
            r18 = r6
            r6 = r5
            r5 = r18
            goto Ldc
        Ld8:
            r5 = 0
            r8 = 0
            r10 = 0
            r12 = 0
        Ldc:
            int r15 = r19.length()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r15 <= r6) goto L1c5
            char r15 = r1.charAt(r6)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r15 != r14) goto Led
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r6 = r6 + r13
            goto L193
        Led:
            r14 = 43
            if (r15 == r14) goto L10f
            r14 = 45
            if (r15 != r14) goto Lf6
            goto L10f
        Lf6:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r3.<init>(r4)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.StringBuilder r3 = r3.append(r15)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r4 = "'"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
        L10f:
            java.lang.String r4 = r1.substring(r6)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r14 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r15 = 5
            if (r14 < r15) goto L11b
            goto L12e
        L11b:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r14.<init>()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.StringBuilder r4 = r14.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r14 = "00"
            java.lang.StringBuilder r4 = r4.append(r14)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r4 = r4.toString()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
        L12e:
            int r14 = r4.length()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r6 = r6 + r14
            java.lang.String r14 = "+0000"
            boolean r14 = r4.equals(r14)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r14 != 0) goto L191
            java.lang.String r14 = "+00:00"
            boolean r14 = r4.equals(r14)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r14 == 0) goto L144
            goto L191
        L144:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r14.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.StringBuilder r3 = r14.append(r4)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.util.TimeZone r4 = java.util.TimeZone.getTimeZone(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r14 = r4.getID()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            boolean r15 = r14.equals(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r15 != 0) goto L18f
            java.lang.String r15 = ":"
            java.lang.String r13 = ""
            java.lang.String r13 = r14.replace(r15, r13)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            boolean r13 = r13.equals(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            if (r13 == 0) goto L16e
            goto L18f
        L16e:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r6.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.StringBuilder r0 = r6.append(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r3 = " given, resolves to "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r3 = r4.getID()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            throw r5     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
        L18f:
            r0 = r4
            goto L193
        L191:
            java.util.TimeZone r0 = com.google.gson.internal.bind.util.ISO8601Utils.TIMEZONE_UTC     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
        L193:
            java.util.GregorianCalendar r3 = new java.util.GregorianCalendar     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r3.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0 = 0
            r3.setLenient(r0)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0 = 1
            r3.set(r0, r7)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            int r9 = r9 - r0
            r0 = 2
            r3.set(r0, r9)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0 = 5
            r3.set(r0, r11)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0 = 11
            r3.set(r0, r5)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0 = 12
            r3.set(r0, r8)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0 = 13
            r3.set(r0, r12)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r0 = 14
            r3.set(r0, r10)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            r2.setIndex(r6)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.util.Date r0 = r3.getTime()     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            return r0
        L1c5:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            java.lang.String r3 = "No time zone indicator"
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
            throw r0     // Catch: java.lang.IllegalArgumentException -> L1cd java.lang.IndexOutOfBoundsException -> L1cf
        L1cd:
            r0 = move-exception
            goto L1d0
        L1cf:
            r0 = move-exception
        L1d0:
            if (r1 != 0) goto L1d4
            r1 = 0
            goto L1e9
        L1d4:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "\""
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            r3 = 34
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
        L1e9:
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L1f5
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L212
        L1f5:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "("
            r3.<init>(r4)
            java.lang.Class r4 = r0.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L212:
            java.text.ParseException r4 = new java.text.ParseException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to parse date ["
            r5.<init>(r6)
            java.lang.StringBuilder r1 = r5.append(r1)
            java.lang.String r5 = "]: "
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            int r2 = r20.getIndex()
            r4.<init>(r1, r2)
            r4.initCause(r0)
            throw r4
    }

    private static int parseInt(java.lang.String r5, int r6, int r7) throws java.lang.NumberFormatException {
            if (r6 < 0) goto L63
            int r0 = r5.length()
            if (r7 > r0) goto L63
            if (r6 > r7) goto L63
            java.lang.String r0 = "Invalid number: "
            r1 = 10
            if (r6 >= r7) goto L35
            int r2 = r6 + 1
            char r3 = r5.charAt(r6)
            int r3 = java.lang.Character.digit(r3, r1)
            if (r3 < 0) goto L1e
            int r3 = -r3
            goto L37
        L1e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L35:
            r3 = 0
            r2 = r6
        L37:
            if (r2 >= r7) goto L61
            int r4 = r2 + 1
            char r2 = r5.charAt(r2)
            int r2 = java.lang.Character.digit(r2, r1)
            if (r2 < 0) goto L4a
            int r3 = r3 * 10
            int r3 = r3 - r2
            r2 = r4
            goto L37
        L4a:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r5 = r5.substring(r6, r7)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
        L61:
            int r5 = -r3
            return r5
        L63:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r6.<init>(r5)
            throw r6
    }
}
