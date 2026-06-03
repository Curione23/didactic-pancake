package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzad extends com.google.android.gms.internal.common.zzaa {
    public zzad() {
            r1 = this;
            r0 = 4
            r1.<init>(r0)
            return
    }

    zzad(int r1) {
            r0 = this;
            r1 = 4
            r0.<init>(r1)
            return
    }

    public final com.google.android.gms.internal.common.zzad zzb(java.lang.Object r1) {
            r0 = this;
            super.zza(r1)
            return r0
    }

    public final com.google.android.gms.internal.common.zzad zzc(java.util.Iterator r2) {
            r1 = this;
        L0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r2.next()
            super.zza(r0)
            goto L0
        Le:
            return r1
    }

    public final com.google.android.gms.internal.common.zzah zzd() {
            r2 = this;
            r0 = 1
            r2.zzc = r0
            java.lang.Object[] r0 = r2.zza
            int r1 = r2.zzb
            com.google.android.gms.internal.common.zzah r0 = com.google.android.gms.internal.common.zzah.zzq(r0, r1)
            return r0
    }
}
