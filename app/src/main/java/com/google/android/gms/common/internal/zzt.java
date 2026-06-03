package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzt extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.IAccountAccessor {
    zzt(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IAccountAccessor"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() throws android.os.RemoteException {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            android.os.Parcel r0 = r2.zzB(r0, r1)
            android.os.Parcelable$Creator r1 = android.accounts.Account.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zzb(r0, r1)
            android.accounts.Account r1 = (android.accounts.Account) r1
            r0.recycle()
            return r1
    }
}
