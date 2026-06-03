package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzx extends com.google.android.gms.common.zzy {
    private final java.util.concurrent.Callable zze;

    /* synthetic */ zzx(java.util.concurrent.Callable r10, byte[] r11) {
            r9 = this;
            r6 = -1
            r8 = 0
            r1 = 0
            r2 = 1
            r3 = 5
            r4 = 0
            r5 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            r9.zze = r10
            return
    }

    @Override // com.google.android.gms.common.zzy
    final java.lang.String zza() {
            r2 = this;
            java.util.concurrent.Callable r0 = r2.zze     // Catch: java.lang.Exception -> L9
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> L9
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }
}
