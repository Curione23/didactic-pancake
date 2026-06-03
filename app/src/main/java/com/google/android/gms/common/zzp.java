package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzp extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.zzp> CREATOR = null;
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final android.content.Context zzd;
    private final boolean zze;
    private final boolean zzf;
    private final boolean zzg;

    static {
            com.google.android.gms.common.zzq r0 = new com.google.android.gms.common.zzq
            r0.<init>()
            com.google.android.gms.common.zzp.CREATOR = r0
            return
    }

    zzp(java.lang.String r1, boolean r2, boolean r3, android.os.IBinder r4, boolean r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r3
            com.google.android.gms.dynamic.IObjectWrapper r1 = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(r4)
            java.lang.Object r1 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r1)
            android.content.Context r1 = (android.content.Context) r1
            r0.zzd = r1
            r0.zze = r5
            r0.zzf = r6
            r0.zzg = r7
            return
    }

    public final void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            java.lang.String r5 = r3.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            r1 = 1
            r2 = 0
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(r4, r1, r5, r2)
            r5 = 2
            boolean r1 = r3.zzb
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 3
            boolean r1 = r3.zzc
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            android.content.Context r5 = r3.zzd
            com.google.android.gms.dynamic.IObjectWrapper r5 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r5)
            r1 = 4
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIBinder(r4, r1, r5, r2)
            r5 = 5
            boolean r1 = r3.zze
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 6
            boolean r1 = r3.zzf
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            r5 = 8
            boolean r1 = r3.zzg
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r4, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}
