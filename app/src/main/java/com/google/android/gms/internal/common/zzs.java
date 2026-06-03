package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzs extends com.google.android.gms.internal.common.zzv {
    final /* synthetic */ com.google.android.gms.internal.common.zzp zza;

    zzs(com.google.android.gms.internal.common.zzw r1, java.lang.CharSequence r2, com.google.android.gms.internal.common.zzp r3) {
            r0 = this;
            r0.zza = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzc(int r5) {
            r4 = this;
            java.lang.CharSequence r0 = r4.zzb
            int r1 = r0.length()
            java.lang.String r2 = "index"
            com.google.android.gms.internal.common.zzr.zzc(r5, r1, r2)
        Lb:
            if (r5 >= r1) goto L1d
            com.google.android.gms.internal.common.zzp r2 = r4.zza
            char r3 = r0.charAt(r5)
            boolean r2 = r2.zza(r3)
            if (r2 == 0) goto L1a
            goto L1e
        L1a:
            int r5 = r5 + 1
            goto Lb
        L1d:
            r5 = -1
        L1e:
            return r5
    }

    @Override // com.google.android.gms.internal.common.zzv
    final int zzd(int r1) {
            r0 = this;
            int r1 = r1 + 1
            return r1
    }
}
