package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzu extends com.google.android.gms.internal.common.zza implements com.google.android.gms.common.internal.ICancelToken {
    zzu(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.ICancelToken"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.gms.common.internal.ICancelToken
    public final void cancel() throws android.os.RemoteException {
            r2 = this;
            r0 = 2
            android.os.Parcel r1 = r2.zza()
            r2.zzC(r0, r1)
            return
    }
}
