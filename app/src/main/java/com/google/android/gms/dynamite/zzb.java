package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzb {
    private static java.lang.ClassLoader zza;
    private static java.lang.Thread zzb;

    static {
            return
    }

    public static synchronized java.lang.ClassLoader zza() {
            java.lang.Class<com.google.android.gms.dynamite.zzb> r0 = com.google.android.gms.dynamite.zzb.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> Lea
            if (r1 != 0) goto Le6
            java.lang.String r1 = "Failed to get thread context classloader "
            java.lang.Thread r2 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> Lea
            r3 = 0
            if (r2 != 0) goto Lb2
            android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> Lea
            java.lang.Thread r2 = r2.getThread()     // Catch: java.lang.Throwable -> Lea
            java.lang.ThreadGroup r2 = r2.getThreadGroup()     // Catch: java.lang.Throwable -> Lea
            java.lang.String r4 = "Failed to enumerate thread/threadgroup "
            if (r2 != 0) goto L21
            r2 = r3
            goto Lab
        L21:
            java.lang.Class<java.lang.Void> r5 = java.lang.Void.class
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lea
            int r6 = r2.activeGroupCount()     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            java.lang.ThreadGroup[] r7 = new java.lang.ThreadGroup[r6]     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            r2.enumerate(r7)     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            r8 = 0
            r9 = r8
        L2f:
            if (r9 >= r6) goto L43
            r10 = r7[r9]     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            java.lang.String r11 = "dynamiteLoader"
            java.lang.String r12 = r10.getName()     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            boolean r11 = r11.equals(r12)     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            if (r11 == 0) goto L40
            goto L44
        L40:
            int r9 = r9 + 1
            goto L2f
        L43:
            r10 = r3
        L44:
            if (r10 != 0) goto L4d
            java.lang.ThreadGroup r10 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            java.lang.String r6 = "dynamiteLoader"
            r10.<init>(r2, r6)     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
        L4d:
            int r2 = r10.activeCount()     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            java.lang.Thread[] r6 = new java.lang.Thread[r2]     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            r10.enumerate(r6)     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
        L56:
            if (r8 >= r2) goto L6a
            r7 = r6[r8]     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            java.lang.String r9 = "GmsDynamite"
            java.lang.String r11 = r7.getName()     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            boolean r9 = r9.equals(r11)     // Catch: java.lang.Throwable -> L82 java.lang.SecurityException -> L84
            if (r9 == 0) goto L67
            goto L6b
        L67:
            int r8 = r8 + 1
            goto L56
        L6a:
            r7 = r3
        L6b:
            if (r7 != 0) goto La9
            com.google.android.gms.dynamite.zza r2 = new com.google.android.gms.dynamite.zza     // Catch: java.lang.SecurityException -> L7f java.lang.Throwable -> L82
            java.lang.String r6 = "GmsDynamite"
            r2.<init>(r10, r6)     // Catch: java.lang.SecurityException -> L7f java.lang.Throwable -> L82
            r2.setContextClassLoader(r3)     // Catch: java.lang.SecurityException -> L7c java.lang.Throwable -> L82
            r2.start()     // Catch: java.lang.SecurityException -> L7c java.lang.Throwable -> L82
            r7 = r2
            goto La9
        L7c:
            r6 = move-exception
            r7 = r2
            goto L87
        L7f:
            r2 = move-exception
            r6 = r2
            goto L87
        L82:
            r1 = move-exception
            goto Lb0
        L84:
            r2 = move-exception
            r6 = r2
            r7 = r3
        L87:
            java.lang.String r2 = "DynamiteLoaderV2CL"
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L82
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L82
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L82
            int r8 = r8 + 39
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L82
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L82
            r9.append(r4)     // Catch: java.lang.Throwable -> L82
            r9.append(r6)     // Catch: java.lang.Throwable -> L82
            java.lang.String r4 = r9.toString()     // Catch: java.lang.Throwable -> L82
            android.util.Log.w(r2, r4)     // Catch: java.lang.Throwable -> L82
        La9:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            r2 = r7
        Lab:
            com.google.android.gms.dynamite.zzb.zzb = r2     // Catch: java.lang.Throwable -> Lea
            if (r2 != 0) goto Lb2
            goto Le1
        Lb0:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L82
            throw r1     // Catch: java.lang.Throwable -> Lea
        Lb2:
            monitor-enter(r2)     // Catch: java.lang.Throwable -> Lea
            java.lang.Thread r4 = com.google.android.gms.dynamite.zzb.zzb     // Catch: java.lang.Throwable -> Lbb java.lang.SecurityException -> Lbd
            java.lang.ClassLoader r1 = r4.getContextClassLoader()     // Catch: java.lang.Throwable -> Lbb java.lang.SecurityException -> Lbd
            r3 = r1
            goto Le0
        Lbb:
            r1 = move-exception
            goto Le4
        Lbd:
            r4 = move-exception
            java.lang.String r5 = "DynamiteLoaderV2CL"
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> Lbb
            int r6 = r6.length()     // Catch: java.lang.Throwable -> Lbb
            int r6 = r6 + 41
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lbb
            r7.<init>(r6)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r1)     // Catch: java.lang.Throwable -> Lbb
            r7.append(r4)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r1 = r7.toString()     // Catch: java.lang.Throwable -> Lbb
            android.util.Log.w(r5, r1)     // Catch: java.lang.Throwable -> Lbb
        Le0:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbb
        Le1:
            com.google.android.gms.dynamite.zzb.zza = r3     // Catch: java.lang.Throwable -> Lea
            goto Le6
        Le4:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lbb
            throw r1     // Catch: java.lang.Throwable -> Lea
        Le6:
            java.lang.ClassLoader r1 = com.google.android.gms.dynamite.zzb.zza     // Catch: java.lang.Throwable -> Lea
            monitor-exit(r0)
            return r1
        Lea:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lea
            throw r1
    }
}
