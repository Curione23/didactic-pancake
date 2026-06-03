package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements com.google.android.gms.common.internal.IGmsCallbacks {
    public zzz() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.internal.IGmsCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.gms.internal.common.zzb
    protected final boolean zza(int r3, android.os.Parcel r4, android.os.Parcel r5, int r6) throws android.os.RemoteException {
            r2 = this;
            r6 = 1
            if (r3 == r6) goto L35
            r0 = 2
            if (r3 == r0) goto L22
            r0 = 3
            if (r3 == r0) goto Lb
            r3 = 0
            return r3
        Lb:
            int r3 = r4.readInt()
            android.os.IBinder r0 = r4.readStrongBinder()
            android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzj> r1 = com.google.android.gms.common.internal.zzj.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zzb(r4, r1)
            com.google.android.gms.common.internal.zzj r1 = (com.google.android.gms.common.internal.zzj) r1
            com.google.android.gms.internal.common.zzc.zzf(r4)
            r2.zzc(r3, r0, r1)
            goto L4b
        L22:
            int r3 = r4.readInt()
            android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.internal.common.zzc.zzb(r4, r0)
            android.os.Bundle r0 = (android.os.Bundle) r0
            com.google.android.gms.internal.common.zzc.zzf(r4)
            r2.zzb(r3, r0)
            goto L4b
        L35:
            int r3 = r4.readInt()
            android.os.IBinder r0 = r4.readStrongBinder()
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.gms.internal.common.zzc.zzb(r4, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.gms.internal.common.zzc.zzf(r4)
            r2.onPostInitComplete(r3, r0, r1)
        L4b:
            r5.writeNoException()
            return r6
    }
}
