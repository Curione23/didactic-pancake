package org.apache.commons.lang3.text;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public class FormattableUtils {
    private static final java.lang.String SIMPLEST_FORMAT = "%s";

    public FormattableUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Formatter append(java.lang.CharSequence r7, java.util.Formatter r8, int r9, int r10, int r11) {
            r5 = 32
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.util.Formatter r7 = append(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.util.Formatter append(java.lang.CharSequence r7, java.util.Formatter r8, int r9, int r10, int r11, char r12) {
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.util.Formatter r7 = append(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.util.Formatter append(java.lang.CharSequence r5, java.util.Formatter r6, int r7, int r8, int r9, char r10, java.lang.CharSequence r11) {
            r0 = 0
            r1 = 1
            if (r11 == 0) goto Lf
            if (r9 < 0) goto Lf
            int r2 = r11.length()
            if (r2 > r9) goto Ld
            goto Lf
        Ld:
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Object[] r3 = new java.lang.Object[]{r11, r3}
            java.lang.String r4 = "Specified ellipsis '%1$s' exceeds precision of %2$s"
            org.apache.commons.lang3.Validate.isTrue(r2, r4, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r5)
            if (r9 < 0) goto L42
            int r3 = r5.length()
            if (r9 >= r3) goto L42
            java.lang.String r3 = ""
            java.lang.Object r11 = org.apache.commons.lang3.ObjectUtils.defaultIfNull(r11, r3)
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            int r3 = r11.length()
            int r9 = r9 - r3
            int r5 = r5.length()
            java.lang.String r11 = r11.toString()
            r2.replace(r9, r5, r11)
        L42:
            r5 = r7 & 1
            if (r5 != r1) goto L47
            goto L48
        L47:
            r1 = r0
        L48:
            int r5 = r2.length()
        L4c:
            if (r5 >= r8) goto L59
            if (r1 == 0) goto L52
            r7 = r5
            goto L53
        L52:
            r7 = r0
        L53:
            r2.insert(r7, r10)
            int r5 = r5 + 1
            goto L4c
        L59:
            java.lang.String r5 = r2.toString()
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r6.format(r5, r7)
            return r6
    }

    public static java.util.Formatter append(java.lang.CharSequence r7, java.util.Formatter r8, int r9, int r10, int r11, java.lang.CharSequence r12) {
            r5 = 32
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            java.util.Formatter r7 = append(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static java.lang.String toString(java.util.Formattable r1) {
            java.lang.String r0 = "%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r0, r1)
            return r1
    }
}
