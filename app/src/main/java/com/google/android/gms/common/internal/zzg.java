package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzg extends com.google.android.gms.common.internal.zza {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zze;

    public zzg(com.google.android.gms.common.internal.BaseGmsClient r1, int r2, android.os.Bundle r3) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zze = r1
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zza() {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zze
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r0 = r0.zzc
            com.google.android.gms.common.ConnectionResult r1 = com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS
            r0.onReportServiceBinding(r1)
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zze
            boolean r1 = r0.enableLocalFallback()
            if (r1 == 0) goto L14
            boolean r1 = r0.zzg()
            if (r1 == 0) goto L14
            r3 = 16
            r0.zzf(r3)
            return
        L14:
            com.google.android.gms.common.internal.BaseGmsClient$ConnectionProgressReportCallbacks r1 = r0.zzc
            r1.onReportServiceBinding(r3)
            r0.onConnectionFailed(r3)
            return
    }
}
