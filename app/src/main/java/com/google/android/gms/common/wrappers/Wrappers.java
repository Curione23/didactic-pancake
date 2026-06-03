package com.google.android.gms.common.wrappers;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class Wrappers {
    private static final com.google.android.gms.common.wrappers.Wrappers zzb = null;
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zza;

    static {
            com.google.android.gms.common.wrappers.Wrappers r0 = new com.google.android.gms.common.wrappers.Wrappers
            r0.<init>()
            com.google.android.gms.common.wrappers.Wrappers.zzb = r0
            return
    }

    public Wrappers() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            return
    }

    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(android.content.Context r1) {
            com.google.android.gms.common.wrappers.Wrappers r0 = com.google.android.gms.common.wrappers.Wrappers.zzb
            com.google.android.gms.common.wrappers.PackageManagerWrapper r1 = r0.zza(r1)
            return r1
    }

    public final synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zza(android.content.Context r2) {
            r1 = this;
            monitor-enter(r1)
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = r1.zza     // Catch: java.lang.Throwable -> L1a
            if (r0 != 0) goto L16
            android.content.Context r0 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto Lf
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
        Lf:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r0 = new com.google.android.gms.common.wrappers.PackageManagerWrapper     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L1a
            r1.zza = r0     // Catch: java.lang.Throwable -> L1a
        L16:
            com.google.android.gms.common.wrappers.PackageManagerWrapper r2 = r1.zza     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)
            return r2
        L1a:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r2
    }
}
