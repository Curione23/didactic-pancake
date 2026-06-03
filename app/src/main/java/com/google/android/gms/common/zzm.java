package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class zzm extends com.google.android.gms.common.zzj {
    private static final java.lang.ref.WeakReference zzb = null;
    private java.lang.ref.WeakReference zza;

    static {
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r1 = 0
            r0.<init>(r1)
            com.google.android.gms.common.zzm.zzb = r0
            return
    }

    zzm(byte[] r1) {
            r0 = this;
            r0.<init>(r1)
            java.lang.ref.WeakReference r1 = com.google.android.gms.common.zzm.zzb
            r0.zza = r1
            return
    }

    protected abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    final byte[] zzc() {
            r2 = this;
            monitor-enter(r2)
            java.lang.ref.WeakReference r0 = r2.zza     // Catch: java.lang.Throwable -> L18
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L18
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L16
            byte[] r0 = r2.zzb()     // Catch: java.lang.Throwable -> L18
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L18
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L18
            r2.zza = r1     // Catch: java.lang.Throwable -> L18
        L16:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            return r0
        L18:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }
}
