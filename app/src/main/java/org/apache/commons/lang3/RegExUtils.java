package org.apache.commons.lang3;

/* JADX INFO: loaded from: classes2.dex */
public class RegExUtils {
    @java.lang.Deprecated
    public RegExUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.regex.Pattern dotAll(java.lang.String r1) {
            r0 = 32
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1, r0)
            return r1
    }

    public static java.util.regex.Matcher dotAllMatcher(java.lang.String r0, java.lang.String r1) {
            java.util.regex.Pattern r0 = dotAll(r0)
            java.util.regex.Matcher r0 = r0.matcher(r1)
            return r0
    }

    public static java.lang.String removeAll(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = replaceAll(r1, r2, r0)
            return r1
    }

    public static java.lang.String removeAll(java.lang.String r1, java.util.regex.Pattern r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = replaceAll(r1, r2, r0)
            return r1
    }

    public static java.lang.String removeFirst(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = replaceFirst(r1, r2, r0)
            return r1
    }

    public static java.lang.String removeFirst(java.lang.String r1, java.util.regex.Pattern r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = replaceFirst(r1, r2, r0)
            return r1
    }

    public static java.lang.String removePattern(java.lang.String r1, java.lang.String r2) {
            java.lang.String r0 = ""
            java.lang.String r1 = replacePattern(r1, r2, r0)
            return r1
    }

    public static java.lang.String replaceAll(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3}
            boolean r0 = org.apache.commons.lang3.ObjectUtils.anyNull(r0)
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = r1.replaceAll(r2, r3)
            return r1
    }

    public static java.lang.String replaceAll(java.lang.String r1, java.util.regex.Pattern r2, java.lang.String r3) {
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3}
            boolean r0 = org.apache.commons.lang3.ObjectUtils.anyNull(r0)
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.util.regex.Matcher r1 = r2.matcher(r1)
            java.lang.String r1 = r1.replaceAll(r3)
            return r1
    }

    public static java.lang.String replaceFirst(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            if (r0 == 0) goto Lb
            if (r1 == 0) goto Lb
            if (r2 != 0) goto L7
            goto Lb
        L7:
            java.lang.String r0 = r0.replaceFirst(r1, r2)
        Lb:
            return r0
    }

    public static java.lang.String replaceFirst(java.lang.String r0, java.util.regex.Pattern r1, java.lang.String r2) {
            if (r0 == 0) goto Lf
            if (r1 == 0) goto Lf
            if (r2 != 0) goto L7
            goto Lf
        L7:
            java.util.regex.Matcher r0 = r1.matcher(r0)
            java.lang.String r0 = r0.replaceFirst(r2)
        Lf:
            return r0
    }

    public static java.lang.String replacePattern(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r2, r3}
            boolean r0 = org.apache.commons.lang3.ObjectUtils.anyNull(r0)
            if (r0 == 0) goto Lb
            return r1
        Lb:
            java.util.regex.Matcher r1 = dotAllMatcher(r2, r1)
            java.lang.String r1 = r1.replaceAll(r3)
            return r1
    }
}
