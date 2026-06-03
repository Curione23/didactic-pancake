package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzw {
    private final com.google.android.gms.internal.common.zzp zza;
    private final boolean zzb;
    private final com.google.android.gms.internal.common.zzu zzc;

    private zzw(com.google.android.gms.internal.common.zzu r1, boolean r2, com.google.android.gms.internal.common.zzp r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.zzc = r1
            r0.zzb = r2
            r0.zza = r3
            return
    }

    public static com.google.android.gms.internal.common.zzw zza(com.google.android.gms.internal.common.zzp r4) {
            com.google.android.gms.internal.common.zzw r0 = new com.google.android.gms.internal.common.zzw
            com.google.android.gms.internal.common.zzu r1 = new com.google.android.gms.internal.common.zzu
            r1.<init>(r4)
            com.google.android.gms.internal.common.zzp r4 = com.google.android.gms.internal.common.zzo.zza
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    public final com.google.android.gms.internal.common.zzw zzb() {
            r5 = this;
            com.google.android.gms.internal.common.zzp r0 = r5.zza
            com.google.android.gms.internal.common.zzw r1 = new com.google.android.gms.internal.common.zzw
            com.google.android.gms.internal.common.zzu r2 = r5.zzc
            r3 = 1
            r4 = 2147483647(0x7fffffff, float:NaN)
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    public final java.lang.Iterable zzc(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzt r0 = new com.google.android.gms.internal.common.zzt
            r0.<init>(r1, r2)
            return r0
    }

    public final java.util.List zzd(java.lang.CharSequence r3) {
            r2 = this;
            r3.getClass()
            com.google.android.gms.internal.common.zzu r0 = r2.zzc
            java.util.Iterator r3 = r0.zza(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Le:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1e
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.add(r1)
            goto Le
        L1e:
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            return r3
    }

    final /* synthetic */ java.util.Iterator zze(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzu r0 = r1.zzc
            java.util.Iterator r2 = r0.zza(r1, r2)
            return r2
    }

    final /* synthetic */ com.google.android.gms.internal.common.zzp zzf() {
            r1 = this;
            com.google.android.gms.internal.common.zzp r0 = r1.zza
            return r0
    }

    final /* synthetic */ boolean zzg() {
            r1 = this;
            boolean r0 = r1.zzb
            return r0
    }
}
