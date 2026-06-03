package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzc {
    public static final /* synthetic */ int zza = 0;
    private static final java.lang.ClassLoader zzb = null;

    static {
            java.lang.Class<com.google.android.gms.internal.common.zzc> r0 = com.google.android.gms.internal.common.zzc.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            com.google.android.gms.internal.common.zzc.zzb = r0
            return
    }

    private zzc() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean zza(android.os.Parcel r0) {
            int r0 = r0.readInt()
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public static android.os.Parcelable zzb(android.os.Parcel r1, android.os.Parcelable.Creator r2) {
            int r0 = r1.readInt()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.Object r1 = r2.createFromParcel(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            return r1
    }

    public static void zzc(android.os.Parcel r2, android.os.Parcelable r3) {
            r0 = 0
            if (r3 != 0) goto L7
            r2.writeInt(r0)
            return
        L7:
            r1 = 1
            r2.writeInt(r1)
            r3.writeToParcel(r2, r0)
            return
    }

    public static void zzd(android.os.Parcel r1, android.os.Parcelable r2) {
            if (r2 != 0) goto L7
            r2 = 0
            r1.writeInt(r2)
            return
        L7:
            r0 = 1
            r1.writeInt(r0)
            r2.writeToParcel(r1, r0)
            return
    }

    public static void zze(android.os.Parcel r0, android.os.IInterface r1) {
            if (r1 != 0) goto L7
            r1 = 0
            r0.writeStrongBinder(r1)
            return
        L7:
            android.os.IBinder r1 = r1.asBinder()
            r0.writeStrongBinder(r1)
            return
    }

    public static void zzf(android.os.Parcel r3) {
            int r3 = r3.dataAvail()
            if (r3 > 0) goto L7
            return
        L7:
            android.os.BadParcelableException r0 = new android.os.BadParcelableException
            java.lang.String r1 = java.lang.String.valueOf(r3)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 45
            r2.<init>(r1)
            java.lang.String r1 = "Parcel data not fully consumed, unread size: "
            r2.append(r1)
            r2.append(r3)
            java.lang.String r3 = r2.toString()
            r0.<init>(r3)
            throw r0
    }
}
