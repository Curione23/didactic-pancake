package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzr> CREATOR = null;
    private final boolean zza;

    @javax.annotation.Nullable
    private final java.lang.String zzb;
    private final int zzc;
    private final int zzd;
    private final long zze;

    static {
            com.google.android.gms.common.zzs r0 = new com.google.android.gms.common.zzs
            r0.<init>()
            com.google.android.gms.common.zzr.CREATOR = r0
            return
    }

    zzr(boolean r1, java.lang.String r2, int r3, int r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            int r1 = com.google.android.gms.common.zzz.zza(r3)
            int r1 = r1 + (-1)
            r0.zzc = r1
            int r1 = com.google.android.gms.common.zzc.zza(r4)
            int r1 = r1 + (-1)
            r0.zzd = r1
            r0.zze = r5
            return
    }

    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r0 = 1
            boolean r1 = r3.zza
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r0, r1)
            java.lang.String r0 = r3.zzb
            r1 = 0
            r2 = 2
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r2, r0, r1)
            r0 = 3
            int r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 4
            int r1 = r3.zzd
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r4, r0, r1)
            r0 = 5
            long r1 = r3.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(r4, r0, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r5)
            return
    }

    public final boolean zza() {
            r1 = this;
            boolean r0 = r1.zza
            return r0
    }

    @javax.annotation.Nullable
    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final long zzc() {
            r2 = this;
            long r0 = r2.zze
            return r0
    }

    public final int zzd() {
            r1 = this;
            int r0 = r1.zzc
            int r0 = com.google.android.gms.common.zzz.zza(r0)
            return r0
    }

    public final int zze() {
            r1 = this;
            int r0 = r1.zzd
            int r0 = com.google.android.gms.common.zzc.zza(r0)
            return r0
    }
}
