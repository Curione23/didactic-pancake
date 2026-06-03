package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class PackageSignatureVerifier {
    static volatile com.google.android.gms.common.zzac zza;
    private static com.google.android.gms.common.zzad zzb;

    public PackageSignatureVerifier() {
            r0 = this;
            r0.<init>()
            return
    }

    private static synchronized com.google.android.gms.common.zzad zza(android.content.Context r2) {
            java.lang.Class<com.google.android.gms.common.PackageSignatureVerifier> r0 = com.google.android.gms.common.PackageSignatureVerifier.class
            monitor-enter(r0)
            com.google.android.gms.common.zzad r1 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto Le
            com.google.android.gms.common.zzad r1 = new com.google.android.gms.common.zzad     // Catch: java.lang.Throwable -> L12
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            com.google.android.gms.common.PackageSignatureVerifier.zzb = r1     // Catch: java.lang.Throwable -> L12
        Le:
            com.google.android.gms.common.zzad r2 = com.google.android.gms.common.PackageSignatureVerifier.zzb     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)
            return r2
        L12:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r2
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerified(android.content.Context r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.honorsDebugCertificates(r4)
            zza(r4)
            int r1 = com.google.android.gms.common.zzo.zzh
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            com.google.android.gms.common.zzo.zzb()     // Catch: java.lang.Throwable -> L88 android.os.RemoteException -> L8a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L8c
            com.google.android.gms.common.internal.zzad r2 = com.google.android.gms.common.zzo.zzg     // Catch: java.lang.Throwable -> L88 android.os.RemoteException -> L8a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L8c
            boolean r2 = r2.zzi()     // Catch: java.lang.Throwable -> L88 android.os.RemoteException -> L8a com.google.android.gms.dynamite.DynamiteModule.LoadingException -> L8c
            android.os.StrictMode.setThreadPolicy(r1)
            if (r2 == 0) goto L97
            com.google.android.gms.common.signatureverification.SignatureVerificationConfiguration r1 = com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider.zza()
            r1.zza()
            java.lang.String.valueOf(r5)
            java.lang.String r1 = java.lang.String.valueOf(r5)
            r2 = 1
            if (r2 == r0) goto L2f
            java.lang.String r2 = "-0"
            goto L31
        L2f:
            java.lang.String r2 = "-1"
        L31:
            java.lang.String r1 = r1.concat(r2)
            com.google.android.gms.common.zzac r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            if (r2 == 0) goto L4c
            com.google.android.gms.common.zzac r2 = com.google.android.gms.common.PackageSignatureVerifier.zza
            java.lang.String r2 = r2.zza()
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L4c
            com.google.android.gms.common.zzac r4 = com.google.android.gms.common.PackageSignatureVerifier.zza
            com.google.android.gms.common.PackageVerificationResult r4 = r4.zzb()
            goto L87
        L4c:
            r5.isEmpty()
            zza(r4)
            com.google.android.gms.common.zzv r4 = new com.google.android.gms.common.zzv
            r2 = 0
            r4.<init>(r2)
            r4.zza(r5)
            r4.zzb(r0)
            r0 = 0
            r4.zzc(r0)
            com.google.android.gms.common.zzw r4 = r4.zzd()
            com.google.android.gms.common.zzy r4 = com.google.android.gms.common.zzo.zzc(r4)
            boolean r0 = r4.zza
            if (r0 == 0) goto L7c
            int r4 = r4.zzd
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.PackageVerificationResult.zzd(r5, r4, r2)
            com.google.android.gms.common.zzac r5 = new com.google.android.gms.common.zzac
            r5.<init>(r1, r4)
            com.google.android.gms.common.PackageSignatureVerifier.zza = r5
            goto L87
        L7c:
            java.lang.String r0 = r4.zzb
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.Throwable r4 = r4.zzc
            com.google.android.gms.common.PackageVerificationResult r4 = com.google.android.gms.common.PackageVerificationResult.zza(r5, r0, r4, r2)
        L87:
            return r4
        L88:
            r4 = move-exception
            goto L9d
        L8a:
            r4 = move-exception
            goto L8d
        L8c:
            r4 = move-exception
        L8d:
            java.lang.String r5 = "GoogleCertificates"
            java.lang.String r0 = "Failed to get Google certificates from remote"
            android.util.Log.e(r5, r0, r4)     // Catch: java.lang.Throwable -> L88
            android.os.StrictMode.setThreadPolicy(r1)
        L97:
            com.google.android.gms.common.zzae r4 = new com.google.android.gms.common.zzae
            r4.<init>()
            throw r4
        L9d:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r4
    }

    public com.google.android.gms.common.PackageVerificationResult queryPackageSignatureVerifiedWithRetry(android.content.Context r3, java.lang.String r4) {
            r2 = this;
            com.google.android.gms.common.PackageVerificationResult r0 = r2.queryPackageSignatureVerified(r3, r4)     // Catch: java.lang.SecurityException -> L8
            r0.zzc()     // Catch: java.lang.SecurityException -> L8
            goto L1c
        L8:
            r0 = move-exception
            com.google.android.gms.common.PackageVerificationResult r3 = r2.queryPackageSignatureVerified(r3, r4)
            boolean r4 = r3.zzb()
            if (r4 == 0) goto L1b
            java.lang.String r4 = "PkgSignatureVerifier"
            java.lang.String r1 = "Got flaky result during package signature verification"
            android.util.Log.e(r4, r1, r0)
            return r3
        L1b:
            r0 = r3
        L1c:
            return r0
    }
}
