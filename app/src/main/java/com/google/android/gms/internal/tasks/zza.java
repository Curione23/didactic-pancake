package com.google.android.gms.internal.tasks;

/* JADX INFO: compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zza extends android.os.Handler {
    private final android.os.Looper zza;

    public zza() {
            r1 = this;
            r1.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r1.zza = r0
            return
    }

    public zza(android.os.Looper r1) {
            r0 = this;
            r0.<init>(r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.zza = r1
            return
    }
}
