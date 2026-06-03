package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.zzc zzc;

    zzb(com.google.android.gms.common.api.internal.zzc r1, com.google.android.gms.common.api.internal.LifecycleCallback r2, java.lang.String r3) {
            r0 = this;
            r0.zza = r2
            r0.zzb = r3
            java.util.Objects.requireNonNull(r1)
            r0.zzc = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r4 = this;
            com.google.android.gms.common.api.internal.zzc r0 = r4.zzc
            int r1 = r0.zzm()
            if (r1 <= 0) goto L1f
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r4.zza
            android.os.Bundle r2 = r0.zzn()
            if (r2 == 0) goto L1b
            java.lang.String r2 = r4.zzb
            android.os.Bundle r3 = r0.zzn()
            android.os.Bundle r2 = r3.getBundle(r2)
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r1.onCreate(r2)
        L1f:
            int r1 = r0.zzm()
            r2 = 2
            if (r1 < r2) goto L2b
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r4.zza
            r1.onStart()
        L2b:
            int r1 = r0.zzm()
            r2 = 3
            if (r1 < r2) goto L37
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r4.zza
            r1.onResume()
        L37:
            int r1 = r0.zzm()
            r2 = 4
            if (r1 < r2) goto L43
            com.google.android.gms.common.api.internal.LifecycleCallback r1 = r4.zza
            r1.onStop()
        L43:
            int r0 = r0.zzm()
            r1 = 5
            if (r0 < r1) goto L4f
            com.google.android.gms.common.api.internal.LifecycleCallback r0 = r4.zza
            r0.onDestroy()
        L4f:
            return
    }
}
