package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzg extends android.os.Handler {
    private final android.os.Looper zza;

    public zzg() {
            r1 = this;
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.zza = r0
            return
    }

    public zzg(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.zza = r1
            return
    }

    public zzg(android.os.Looper r1, android.os.Handler.Callback r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.zza = r1
            return
    }
}
