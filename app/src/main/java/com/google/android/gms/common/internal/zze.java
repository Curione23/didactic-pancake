package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zze implements android.content.ServiceConnection {
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zza;
    private final int zzb;

    public zze(com.google.android.gms.common.internal.BaseGmsClient r1, int r2) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zza = r1
            r0.<init>()
            r0.zzb = r2
            return
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
            r3 = this;
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            if (r5 != 0) goto La
            r5 = 16
            r4.zzf(r5)
            return
        La:
            java.lang.Object r0 = r4.zzh()
            monitor-enter(r0)
            java.lang.String r1 = "com.google.android.gms.common.internal.IGmsServiceBroker"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch: java.lang.Throwable -> L31
            if (r1 == 0) goto L1e
            boolean r2 = r1 instanceof com.google.android.gms.common.internal.IGmsServiceBroker     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L1e
            com.google.android.gms.common.internal.IGmsServiceBroker r1 = (com.google.android.gms.common.internal.IGmsServiceBroker) r1     // Catch: java.lang.Throwable -> L31
            goto L23
        L1e:
            com.google.android.gms.common.internal.zzaa r1 = new com.google.android.gms.common.internal.zzaa     // Catch: java.lang.Throwable -> L31
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L31
        L23:
            r4.zzi(r1)     // Catch: java.lang.Throwable -> L31
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            r5 = 0
            int r0 = r3.zzb
            r1 = 0
            r4.zzb(r1, r5, r0)
            return
        L31:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L31
            throw r4
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName r4) {
            r3 = this;
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            java.lang.Object r0 = r4.zzh()
            monitor-enter(r0)
            r1 = 0
            r4.zzi(r1)     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            com.google.android.gms.common.internal.BaseGmsClient r4 = r3.zza
            int r0 = r3.zzb
            android.os.Handler r4 = r4.zzb
            r1 = 6
            r2 = 1
            android.os.Message r0 = r4.obtainMessage(r1, r0, r2)
            r4.sendMessage(r0)
            return
        L1c:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }
}
