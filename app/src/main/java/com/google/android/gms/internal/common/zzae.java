package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzae extends com.google.android.gms.internal.common.zzz {
    private final com.google.android.gms.internal.common.zzah zza;

    zzae(com.google.android.gms.internal.common.zzah r2, int r3) {
            r1 = this;
            int r0 = r2.size()
            r1.<init>(r0, r3)
            r1.zza = r2
            return
    }

    @Override // com.google.android.gms.internal.common.zzz
    protected final java.lang.Object zza(int r2) {
            r1 = this;
            com.google.android.gms.internal.common.zzah r0 = r1.zza
            java.lang.Object r2 = r0.get(r2)
            return r2
    }
}
