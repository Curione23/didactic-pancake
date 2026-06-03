package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzaf extends com.google.android.gms.internal.common.zzah {
    private final transient com.google.android.gms.internal.common.zzah zza;

    zzaf(com.google.android.gms.internal.common.zzah r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    private final int zzs(int r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            int r0 = r0.size()
            int r0 = r0 + (-1)
            int r0 = r0 - r2
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            boolean r2 = r0.contains(r2)
            return r2
    }

    @Override // java.util.List
    public final java.lang.Object get(int r4) {
            r3 = this;
            com.google.android.gms.internal.common.zzah r0 = r3.zza
            int r1 = r0.size()
            java.lang.String r2 = "index"
            com.google.android.gms.internal.common.zzr.zzb(r4, r1, r2)
            int r4 = r3.zzs(r4)
            java.lang.Object r4 = r0.get(r4)
            return r4
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int indexOf(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            int r2 = r0.lastIndexOf(r2)
            if (r2 < 0) goto Ld
            int r2 = r1.zzs(r2)
            return r2
        Ld:
            r2 = -1
            return r2
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            int r2 = r0.indexOf(r2)
            if (r2 < 0) goto Ld
            int r2 = r1.zzs(r2)
            return r2
        Ld:
            r2 = -1
            return r2
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzah, java.util.List
    public final /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
            r0 = this;
            com.google.android.gms.internal.common.zzah r1 = r0.zzi(r1, r2)
            return r1
    }

    @Override // com.google.android.gms.internal.common.zzac
    final boolean zzf() {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            boolean r0 = r0.zzf()
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final com.google.android.gms.internal.common.zzah zzh() {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            return r0
    }

    @Override // com.google.android.gms.internal.common.zzah
    public final com.google.android.gms.internal.common.zzah zzi(int r3, int r4) {
            r2 = this;
            com.google.android.gms.internal.common.zzah r0 = r2.zza
            int r1 = r0.size()
            com.google.android.gms.internal.common.zzr.zzd(r3, r4, r1)
            int r1 = r0.size()
            int r1 = r1 - r4
            int r4 = r0.size()
            int r4 = r4 - r3
            com.google.android.gms.internal.common.zzah r3 = r0.zzi(r1, r4)
            com.google.android.gms.internal.common.zzah r3 = r3.zzh()
            return r3
    }
}
