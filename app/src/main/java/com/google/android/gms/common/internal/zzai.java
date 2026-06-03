package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.internal.zzai> CREATOR = null;
    final int zza;

    static {
            com.google.android.gms.common.internal.zzaj r0 = new com.google.android.gms.common.internal.zzaj
            r0.<init>()
            com.google.android.gms.common.internal.zzai.CREATOR = r0
            return
    }

    zzai(int r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    public final void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.zza
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r1 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r1, r4)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r0)
            return
    }
}
