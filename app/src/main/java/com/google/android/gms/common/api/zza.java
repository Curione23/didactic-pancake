package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zza implements android.os.Parcelable.Creator {
    private static final com.google.android.gms.common.api.zza zzb = null;
    private final android.os.Parcelable.Creator zza;

    static {
            com.google.android.gms.common.api.zza r0 = new com.google.android.gms.common.api.zza
            com.google.android.gms.common.api.zzb r1 = new com.google.android.gms.common.api.zzb
            r1.<init>()
            r0.<init>(r1)
            com.google.android.gms.common.api.zza.zzb = r0
            return
    }

    private zza(android.os.Parcelable.Creator r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public static com.google.android.gms.common.api.zza zza() {
            com.google.android.gms.common.api.zza r0 = com.google.android.gms.common.api.zza.zzb
            return r0
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r4) {
            r3 = this;
            int r0 = r4.dataPosition()
            int r1 = r4.readInt()
            r2 = -204102970(0xfffffffff3d5a2c6, float:-3.385195E31)
            if (r1 != r2) goto L15
            com.google.android.gms.common.api.ApiMetadata r4 = com.google.android.gms.common.api.zzb.zza(r4)
            r0 = r4
            com.google.android.gms.common.api.ApiMetadata r0 = (com.google.android.gms.common.api.ApiMetadata) r0
            goto L1e
        L15:
            int r0 = r0 + (-4)
            r4.setDataPosition(r0)
            com.google.android.gms.common.api.ApiMetadata r4 = com.google.android.gms.common.api.ApiMetadata.getEmptyInstance()
        L1e:
            return r4
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiMetadata[] r1 = new com.google.android.gms.common.api.ApiMetadata[r1]
            com.google.android.gms.common.api.ApiMetadata[] r1 = (com.google.android.gms.common.api.ApiMetadata[]) r1
            return r1
    }
}
