package com.google.android.gms.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements com.google.android.gms.tasks.OnSuccessListener {
    final /* synthetic */ com.google.android.gms.tasks.OnTokenCanceledListener zza;

    zza(com.google.android.gms.tasks.zzb r1, com.google.android.gms.tasks.OnTokenCanceledListener r2) {
            r0 = this;
            r0.zza = r2
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r1) {
            r0 = this;
            java.lang.Void r1 = (java.lang.Void) r1
            com.google.android.gms.tasks.OnTokenCanceledListener r1 = r0.zza
            r1.onCanceled()
            return
    }
}
