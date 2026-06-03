package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzw extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.zzx {
    public zzw() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            r1.<init>(r0)
            return
    }

    public static com.google.android.gms.common.internal.zzx zzg(android.os.IBinder r2) {
            java.lang.String r0 = "com.google.android.gms.common.internal.ICertData"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.gms.common.internal.zzx
            if (r1 == 0) goto Ld
            com.google.android.gms.common.internal.zzx r0 = (com.google.android.gms.common.internal.zzx) r0
            return r0
        Ld:
            com.google.android.gms.common.internal.zzv r0 = new com.google.android.gms.common.internal.zzv
            r0.<init>(r2)
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r2 = 1
            if (r1 == r2) goto L13
            r4 = 2
            if (r1 == r4) goto L8
            r1 = 0
            return r1
        L8:
            int r1 = r0.zze()
            r3.writeNoException()
            r3.writeInt(r1)
            goto L1d
        L13:
            com.google.android.gms.dynamic.IObjectWrapper r1 = r0.zzd()
            r3.writeNoException()
            com.google.android.gms.internal.common.zzc.zze(r3, r1)
        L1d:
            return r2
    }
}
