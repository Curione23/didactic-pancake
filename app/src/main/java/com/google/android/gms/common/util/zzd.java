package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    public static android.os.StrictMode.VmPolicy zza() {
            android.os.StrictMode$VmPolicy r0 = android.os.StrictMode.getVmPolicy()
            boolean r1 = com.google.android.gms.common.util.PlatformVersion.isAtLeastS()
            if (r1 == 0) goto L1a
            android.os.StrictMode$VmPolicy$Builder r1 = new android.os.StrictMode$VmPolicy$Builder
            r1.<init>(r0)
            android.os.StrictMode$VmPolicy$Builder r1 = com.google.android.gms.common.util.zzc.zza(r1)
            android.os.StrictMode$VmPolicy r1 = r1.build()
            android.os.StrictMode.setVmPolicy(r1)
        L1a:
            return r0
    }
}
