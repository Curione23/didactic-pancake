package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzaa {
    private java.lang.String zza;
    private long zzb;
    private com.google.android.gms.internal.common.zzah zzc;
    private com.google.android.gms.internal.common.zzah zzd;

    zzaa() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.zza = r0
            r0 = -1
            r2.zzb = r0
            com.google.android.gms.internal.common.zzah r0 = com.google.android.gms.internal.common.zzah.zzj()
            r2.zzc = r0
            com.google.android.gms.internal.common.zzah r0 = com.google.android.gms.internal.common.zzah.zzj()
            r2.zzd = r0
            return
    }

    final com.google.android.gms.common.zzaa zza(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    final com.google.android.gms.common.zzaa zzb(long r1) {
            r0 = this;
            r0.zzb = r1
            return r0
    }

    final com.google.android.gms.common.zzaa zzc(java.util.List r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.internal.common.zzah r1 = com.google.android.gms.internal.common.zzah.zzp(r1)
            r0.zzc = r1
            return r0
    }

    final com.google.android.gms.common.zzaa zzd(java.util.List r1) {
            r0 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.android.gms.internal.common.zzah r1 = com.google.android.gms.internal.common.zzah.zzp(r1)
            r0.zzd = r1
            return r0
    }

    final com.google.android.gms.common.zzab zze() {
            r9 = this;
            java.lang.String r0 = r9.zza
            if (r0 == 0) goto L3d
            long r0 = r9.zzb
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L35
            com.google.android.gms.internal.common.zzah r0 = r9.zzc
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L25
            com.google.android.gms.internal.common.zzah r0 = r9.zzd
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            goto L25
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Either orderedTestCerts or orderedProdCerts must have at least one cert"
            r0.<init>(r1)
            throw r0
        L25:
            com.google.android.gms.common.zzab r0 = new com.google.android.gms.common.zzab
            java.lang.String r3 = r9.zza
            long r4 = r9.zzb
            com.google.android.gms.internal.common.zzah r6 = r9.zzc
            com.google.android.gms.internal.common.zzah r7 = r9.zzd
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r6, r7, r8)
            return r0
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "minimumStampedVersionNumber must be greater than or equal to 0"
            r0.<init>(r1)
            throw r0
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "packageName must be defined"
            r0.<init>(r1)
            throw r0
    }
}
