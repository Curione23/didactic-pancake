package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzf extends com.google.android.gms.common.internal.zza {
    public final android.os.IBinder zze;
    final /* synthetic */ com.google.android.gms.common.internal.BaseGmsClient zzf;

    public zzf(com.google.android.gms.common.internal.BaseGmsClient r1, int r2, android.os.IBinder r3, android.os.Bundle r4) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzf = r1
            r0.<init>(r1, r2, r4)
            r0.zze = r3
            return
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final boolean zza() {
            r7 = this;
            java.lang.String r0 = "GmsClient"
            r1 = 0
            android.os.IBinder r2 = r7.zze     // Catch: android.os.RemoteException -> L7e
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: android.os.RemoteException -> L7e
            r3 = r2
            android.os.IBinder r3 = (android.os.IBinder) r3     // Catch: android.os.RemoteException -> L7e
            java.lang.String r2 = r2.getInterfaceDescriptor()     // Catch: android.os.RemoteException -> L7e
            com.google.android.gms.common.internal.BaseGmsClient r3 = r7.zzf
            java.lang.String r4 = r3.getServiceDescriptor()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L4f
            java.lang.String r3 = r3.getServiceDescriptor()
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r2)
            int r4 = r4 + 34
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + r5
            r6.<init>(r4)
            java.lang.String r4 = "service descriptor mismatch: "
            r6.append(r4)
            r6.append(r3)
            java.lang.String r3 = " vs. "
            r6.append(r3)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            android.util.Log.w(r0, r2)
            return r1
        L4f:
            android.os.IBinder r0 = r7.zze
            android.os.IInterface r0 = r3.createServiceInterface(r0)
            if (r0 == 0) goto L7d
            r2 = 2
            r4 = 4
            boolean r2 = r3.zze(r2, r4, r0)
            if (r2 != 0) goto L66
            r2 = 3
            boolean r0 = r3.zze(r2, r4, r0)
            if (r0 == 0) goto L7d
        L66:
            r0 = 0
            r3.zzn(r0)
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r3.zzk()
            android.os.Bundle r1 = r3.getConnectionHint()
            if (r0 == 0) goto L7b
            com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks r0 = r3.zzk()
            r0.onConnected(r1)
        L7b:
            r0 = 1
            return r0
        L7d:
            return r1
        L7e:
            java.lang.String r2 = "service probably died"
            android.util.Log.w(r0, r2)
            return r1
    }

    @Override // com.google.android.gms.common.internal.zza
    protected final void zzb(com.google.android.gms.common.ConnectionResult r3) {
            r2 = this;
            com.google.android.gms.common.internal.BaseGmsClient r0 = r2.zzf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r1 = r0.zzl()
            if (r1 == 0) goto Lf
            com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener r1 = r0.zzl()
            r1.onConnectionFailed(r3)
        Lf:
            r0.onConnectionFailed(r3)
            return
    }
}
