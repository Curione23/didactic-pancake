package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class ProcessUtils {

    @javax.annotation.Nullable
    private static java.lang.String zza;
    private static int zzb;

    @javax.annotation.Nullable
    private static java.lang.Boolean zzc;

    static {
            return
    }

    private ProcessUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getMyProcessName() {
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            if (r0 != 0) goto L72
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L11
            java.lang.String r0 = android.app.Application.getProcessName()
            com.google.android.gms.common.util.ProcessUtils.zza = r0
            goto L72
        L11:
            int r0 = com.google.android.gms.common.util.ProcessUtils.zzb
            if (r0 != 0) goto L1b
            int r0 = android.os.Process.myPid()
            com.google.android.gms.common.util.ProcessUtils.zzb = r0
        L1b:
            java.lang.String r1 = "/cmdline"
            java.lang.String r2 = "/proc/"
            r3 = 0
            if (r0 > 0) goto L23
            goto L70
        L23:
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            int r4 = r4.length()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            int r4 = r4 + 14
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            r5.append(r2)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            r5.append(r0)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            r5.append(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L62
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L62
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L62
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L62
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L6d
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L6d
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L6d
            java.lang.String r3 = r0.trim()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L6d
            goto L6d
        L5f:
            r0 = move-exception
            r3 = r2
            goto L68
        L62:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r1)     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
            throw r0     // Catch: java.lang.Throwable -> L67 java.io.IOException -> L6c
        L67:
            r0 = move-exception
        L68:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r3)
            throw r0
        L6c:
            r2 = r3
        L6d:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
        L70:
            com.google.android.gms.common.util.ProcessUtils.zza = r3
        L72:
            java.lang.String r0 = com.google.android.gms.common.util.ProcessUtils.zza
            return r0
    }

    public static boolean zza() {
            java.lang.Boolean r0 = com.google.android.gms.common.util.ProcessUtils.zzc
            if (r0 != 0) goto L38
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastP()
            if (r0 == 0) goto L13
            boolean r0 = android.os.Process.isIsolated()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L36
        L13:
            r0 = 0
            java.lang.Class<android.os.Process> r1 = android.os.Process.class
            java.lang.String r2 = "isIsolated"
            com.google.android.gms.internal.common.zzi[] r3 = new com.google.android.gms.internal.common.zzi[r0]     // Catch: java.lang.ReflectiveOperationException -> L32
            java.lang.Object r1 = com.google.android.gms.internal.common.zzj.zza(r1, r2, r3)     // Catch: java.lang.ReflectiveOperationException -> L32
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.ReflectiveOperationException -> L32
            java.lang.String r3 = "expected a non-null reference"
            if (r1 == 0) goto L28
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.ReflectiveOperationException -> L32
            r0 = r1
            goto L36
        L28:
            com.google.android.gms.internal.common.zzy r1 = new com.google.android.gms.internal.common.zzy     // Catch: java.lang.ReflectiveOperationException -> L32
            java.lang.String r2 = com.google.android.gms.internal.common.zzx.zza(r3, r2)     // Catch: java.lang.ReflectiveOperationException -> L32
            r1.<init>(r2)     // Catch: java.lang.ReflectiveOperationException -> L32
            throw r1     // Catch: java.lang.ReflectiveOperationException -> L32
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L36:
            com.google.android.gms.common.util.ProcessUtils.zzc = r0
        L38:
            boolean r0 = r0.booleanValue()
            return r0
    }
}
