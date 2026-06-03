package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzw {
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzw(java.lang.String r1, boolean r2, boolean r3, boolean r4, boolean r5, boolean r6, byte[] r7) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            r0.zzb = r2
            r0.zzc = r5
            return
    }

    final boolean zza() {
            r1 = this;
            boolean r0 = r1.zzc
            return r0
    }

    final com.google.android.gms.common.zzp zzb(android.content.Context r10) {
            r9 = this;
            com.google.android.gms.common.zzp r8 = new com.google.android.gms.common.zzp
            com.google.android.gms.dynamic.IObjectWrapper r4 = com.google.android.gms.dynamic.ObjectWrapper.wrap(r10)
            java.lang.String r1 = r9.zza
            boolean r2 = r9.zzb
            r6 = 1
            r7 = 0
            r3 = 0
            r5 = 0
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }
}
