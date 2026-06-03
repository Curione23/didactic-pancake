package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd extends com.google.android.gms.common.internal.zzz {
    private com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zzd(com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void onPostInitComplete(int r3, android.os.IBinder r4, android.os.Bundle r5) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            java.lang.String r1 = "onPostInitComplete can be called only once per call to getRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            int r1 = r2.zzb
            r0.onPostInitHandler(r3, r4, r5, r1)
            r3 = 0
            r2.zza = r3
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzb(int r2, android.os.Bundle r3) {
            r1 = this;
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            java.lang.String r3 = "GmsClient"
            java.lang.String r0 = "received deprecated onAccountValidationComplete callback, ignoring"
            android.util.Log.wtf(r3, r0, r2)
            return
    }

    @Override // com.google.android.gms.common.internal.IGmsCallbacks
    public final void zzc(int r3, android.os.IBinder r4, com.google.android.gms.common.internal.zzj r5) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zza
            java.lang.String r1 = "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            r0.zzc(r5)
            android.os.Bundle r5 = r5.zza
            r2.onPostInitComplete(r3, r4, r5)
            return
    }
}
