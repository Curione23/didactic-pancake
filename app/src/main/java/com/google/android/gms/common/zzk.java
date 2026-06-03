package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzk extends com.google.android.gms.common.zzj {
    private final byte[] zza;

    zzk(byte[] r3) {
            r2 = this;
            r0 = 0
            r1 = 25
            byte[] r0 = java.util.Arrays.copyOfRange(r3, r0, r1)
            r2.<init>(r0)
            r2.zza = r3
            return
    }

    @Override // com.google.android.gms.common.zzj
    final byte[] zzc() {
            r1 = this;
            byte[] r0 = r1.zza
            return r0
    }
}
