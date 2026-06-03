package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class Strings {
    private static final java.util.regex.Pattern zza = null;

    static {
            java.lang.String r0 = "\\$\\{(.*?)\\}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.google.android.gms.common.util.Strings.zza = r0
            return
    }

    private Strings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String emptyToNull(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            r1 = 0
        L7:
            return r1
    }

    public static boolean isEmptyOrWhitespace(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            r0 = 1
            return r0
    }
}
