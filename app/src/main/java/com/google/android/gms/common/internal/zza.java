package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zza extends com.google.android.gms.common.internal.zzc {
    public final int zza;
    public final android.os.Bundle zzb;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzc;

    protected zza(com.google.android.gms.common.internal.BaseGmsClient r2, int r3, android.os.Bundle r4) {
            r1 = this;
            java.util.Objects.requireNonNull(r2)
            r1.zzc = r2
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.<init>(r2, r0)
            r1.zza = r3
            r1.zzb = r4
            return
    }

    protected abstract boolean zza();

    protected abstract void zzb(com.google.android.gms.common.ConnectionResult r1);

    @Override // com.google.android.gms.common.internal.zzc
    protected final /* bridge */ /* synthetic */ void zzc(java.lang.Object r4) {
            r3 = this;
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            int r4 = r3.zza
            r0 = 1
            r1 = 0
            if (r4 != 0) goto L1e
            boolean r4 = r3.zza()
            if (r4 != 0) goto L1d
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zzc
            r4.zzd(r0, r1)
            com.google.android.gms.common.ConnectionResult r4 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r4.<init>(r0, r1)
            r3.zzb(r4)
        L1d:
            return
        L1e:
            com.google.android.gms.common.internal.BaseGmsClient r2 = r3.zzc
            r2.zzd(r0, r1)
            android.os.Bundle r0 = r3.zzb
            if (r0 == 0) goto L30
            java.lang.String r1 = "pendingIntent"
            android.os.Parcelable r0 = r0.getParcelable(r1)
            r1 = r0
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L30:
            com.google.android.gms.common.ConnectionResult r0 = new com.google.android.gms.common.ConnectionResult
            r0.<init>(r4, r1)
            r3.zzb(r0)
            return
    }
}
