package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzv extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.zzx {
    zzv(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() throws android.os.RemoteException {
            r2 = this;
            r0 = 1
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r0 = r2.zzB(r0, r1)
            android.os.IBinder r1 = r0.readStrongBinder()
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r1)
            r0.recycle()
            return r1
    }

    @Override // com.google.android.gms.common.internal.zzx
    public final int zze() throws android.os.RemoteException {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r0 = r2.zzB(r0, r1)
            int r1 = r0.readInt()
            r0.recycle()
            return r1
    }
}
