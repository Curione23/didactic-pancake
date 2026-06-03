package com.google.android.gms.common.signatureverification;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    private static com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zza;

    static {
            return
    }

    public static synchronized void zza(com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration r2) {
            java.lang.Class<com.google.android.gms.common.signatureverification.zzd> r0 = com.google.android.gms.common.signatureverification.zzd.class
            monitor-enter(r0)
            com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration r1 = com.google.android.gms.common.signatureverification.zzd.zza     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lb
            com.google.android.gms.common.signatureverification.zzd.zza = r2     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return
        Lb:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13
            java.lang.String r1 = "Redundantly setting SignatureVerificationConfiguration"
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L13:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r2
    }

    static /* synthetic */ com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zzb() {
            com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration r0 = zzc()
            return r0
    }

    private static synchronized com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration zzc() {
            java.lang.Class<com.google.android.gms.common.signatureverification.zzd> r0 = com.google.android.gms.common.signatureverification.zzd.class
            monitor-enter(r0)
            com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration r1 = com.google.android.gms.common.signatureverification.zzd.zza     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto Lf
            com.google.android.gms.common.signatureverification.zzb r1 = new com.google.android.gms.common.signatureverification.zzb     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            zza(r1)     // Catch: java.lang.Throwable -> L13
        Lf:
            com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration r1 = com.google.android.gms.common.signatureverification.zzd.zza     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)
            return r1
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }
}
