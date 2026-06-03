package com.google.android.gms.dynamite;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza extends java.lang.Thread {
    zza(java.lang.ThreadGroup r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r2 = "GmsDynamite"
            r0.<init>(r1, r2)
            return
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
            r1 = this;
            r0 = 19
            android.os.Process.setThreadPriority(r0)
            monitor-enter(r1)
        L6:
            r1.wait()     // Catch: java.lang.Throwable -> La java.lang.InterruptedException -> Lc
            goto L6
        La:
            r0 = move-exception
            goto Le
        Lc:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            return
        Le:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r0
    }
}
