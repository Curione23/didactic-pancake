package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public class zzy {
    private static final com.google.android.gms.common.zzy zze = null;
    final boolean zza;

    @javax.annotation.Nullable
    final java.lang.String zzb;

    @javax.annotation.Nullable
    final java.lang.Throwable zzc;
    final int zzd;

    static {
            com.google.android.gms.common.zzy r8 = new com.google.android.gms.common.zzy
            r5 = 0
            r6 = -1
            r1 = 1
            r2 = 3
            r3 = 1
            r4 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            com.google.android.gms.common.zzy.zze = r8
            return
    }

    private zzy(boolean r1, int r2, int r3, @javax.annotation.Nullable java.lang.String r4, @javax.annotation.Nullable java.lang.Throwable r5, long r6) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzd = r2
            r0.zzb = r4
            r0.zzc = r5
            return
    }

    /* synthetic */ zzy(boolean r1, int r2, int r3, java.lang.String r4, java.lang.Throwable r5, long r6, byte[] r8) {
            r0 = this;
            r6 = 0
            r7 = -1
            r2 = 0
            r3 = 1
            r4 = 5
            r5 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return
    }

    @java.lang.Deprecated
    static com.google.android.gms.common.zzy zzb() {
            com.google.android.gms.common.zzy r0 = com.google.android.gms.common.zzy.zze
            return r0
    }

    static com.google.android.gms.common.zzy zzc(java.lang.String r9) {
            com.google.android.gms.common.zzy r8 = new com.google.android.gms.common.zzy
            r5 = 0
            r6 = -1
            r1 = 0
            r2 = 1
            r3 = 5
            r0 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
    }

    static com.google.android.gms.common.zzy zzd(java.lang.String r9, java.lang.Throwable r10) {
            com.google.android.gms.common.zzy r8 = new com.google.android.gms.common.zzy
            r3 = 5
            r6 = -1
            r1 = 0
            r2 = 1
            r0 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
    }

    public static com.google.android.gms.common.zzy zzf(int r9, long r10) {
            com.google.android.gms.common.zzy r8 = new com.google.android.gms.common.zzy
            r4 = 0
            r5 = 0
            r1 = 1
            r3 = 1
            r0 = r8
            r2 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
    }

    static com.google.android.gms.common.zzy zzg(int r9, int r10, java.lang.String r11, @javax.annotation.Nullable java.lang.Throwable r12) {
            com.google.android.gms.common.zzy r8 = new com.google.android.gms.common.zzy
            r1 = 0
            r6 = -1
            r0 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @javax.annotation.Nullable
    java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    final void zze() {
            r3 = this;
            boolean r0 = r3.zza
            if (r0 != 0) goto L20
            r0 = 3
            java.lang.String r1 = "GoogleCertificatesRslt"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L20
            java.lang.Throwable r0 = r3.zzc
            if (r0 == 0) goto L19
            java.lang.String r2 = r3.zza()
            android.util.Log.d(r1, r2, r0)
            return
        L19:
            java.lang.String r0 = r3.zza()
            android.util.Log.d(r1, r0)
        L20:
            return
    }
}
