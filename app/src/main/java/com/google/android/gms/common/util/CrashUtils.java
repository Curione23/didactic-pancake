package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class CrashUtils {
    private static final java.lang.String[] zza = null;

    static {
            r0 = 5
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "android."
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "com.android."
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "dalvik."
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "java."
            r0[r1] = r2
            r1 = 4
            java.lang.String r2 = "javax."
            r0[r1] = r2
            com.google.android.gms.common.util.CrashUtils.zza = r0
            return
    }

    public CrashUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addDynamiteErrorToDropBox(android.content.Context r1, java.lang.Throwable r2) {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)     // Catch: java.lang.Exception -> L7
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Exception -> L7
            goto Lf
        L7:
            r1 = move-exception
            java.lang.String r2 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r2, r0, r1)
        Lf:
            r1 = 0
            return r1
    }
}
