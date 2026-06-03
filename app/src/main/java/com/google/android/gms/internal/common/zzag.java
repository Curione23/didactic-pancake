package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzag extends com.google.android.gms.internal.common.zzah {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ com.google.android.gms.internal.common.zzah zzc;

    zzag(com.google.android.gms.internal.common.zzah r1, int r2, int r3) {
            r0 = this;
            java.util.Objects.requireNonNull(r1)
            r0.zzc = r1
            r0.<init>()
            r0.zza = r2
            r0.zzb = r3
            return
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.zzb
            java.lang.String r1 = "index"
            com.google.android.gms.internal.common.zzr.zzb(r3, r0, r1)
            com.google.android.gms.internal.common.zzah r0 = r2.zzc
            int r1 = r2.zza
            int r3 = r3 + r1
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            int r0 = r1.zzb
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.common.zzah r1 = r0.zzi(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzac
    final java.lang.Object[] zzb() {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zzc
            java.lang.Object[] r0 = r0.zzb()
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzc() {
            r2 = this;
            com.google.android.gms.internal.common.zzah r0 = r2.zzc
            int r0 = r0.zzc()
            int r1 = r2.zza
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    final int zzd() {
            r2 = this;
            com.google.android.gms.internal.common.zzah r0 = r2.zzc
            int r0 = r0.zzc()
            int r1 = r2.zza
            int r0 = r0 + r1
            int r1 = r2.zzb
            int r0 = r0 + r1
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final com.google.android.gms.internal.common.zzah zzi(int r3, int r4) {
            r2 = this;
            int r0 = r2.zzb
            com.google.android.gms.internal.common.zzr.zzd(r3, r4, r0)
            int r0 = r2.zza
            com.google.android.gms.internal.common.zzah r1 = r2.zzc
            int r3 = r3 + r0
            int r4 = r4 + r0
            com.google.android.gms.internal.common.zzah r3 = r1.zzi(r3, r4)
            return r3
    }
}
