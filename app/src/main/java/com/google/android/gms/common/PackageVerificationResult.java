package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class PackageVerificationResult {
    private final java.lang.String zza;
    private final boolean zzb;

    @javax.annotation.Nullable
    private final java.lang.String zzc;

    @javax.annotation.Nullable
    private final java.lang.Throwable zzd;

    private PackageVerificationResult(java.lang.String r1, int r2, boolean r3, @javax.annotation.Nullable java.lang.String r4, @javax.annotation.Nullable java.lang.Throwable r5, @javax.annotation.Nullable com.google.android.gms.common.signatureverification.zza r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r3
            r0.zzc = r4
            r0.zzd = r5
            return
    }

    public static com.google.android.gms.common.PackageVerificationResult zza(java.lang.String r7, java.lang.String r8, @javax.annotation.Nullable java.lang.Throwable r9, @javax.annotation.Nullable com.google.android.gms.common.signatureverification.zza r10) {
            com.google.android.gms.common.PackageVerificationResult r10 = new com.google.android.gms.common.PackageVerificationResult
            r3 = 0
            r6 = 0
            r2 = 1
            r0 = r10
            r1 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r10
    }

    public static com.google.android.gms.common.PackageVerificationResult zzd(java.lang.String r7, int r8, @javax.annotation.Nullable com.google.android.gms.common.signatureverification.zza r9) {
            com.google.android.gms.common.PackageVerificationResult r9 = new com.google.android.gms.common.PackageVerificationResult
            r5 = 0
            r6 = 0
            r3 = 1
            r4 = 0
            r0 = r9
            r1 = r7
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r9
    }

    public final boolean zzb() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }

    public final void zzc() {
            r3 = this;
            boolean r0 = r3.zzb
            if (r0 != 0) goto L23
            java.lang.String r0 = r3.zzc
            java.lang.String.valueOf(r0)
            java.lang.Throwable r1 = r3.zzd
            java.lang.String r2 = "PackageVerificationRslt: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r0 = r2.concat(r0)
            if (r1 == 0) goto L1d
            java.lang.SecurityException r2 = new java.lang.SecurityException
            r2.<init>(r0, r1)
            throw r2
        L1d:
            java.lang.SecurityException r1 = new java.lang.SecurityException
            r1.<init>(r0)
            throw r1
        L23:
            return
    }
}
