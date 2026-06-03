package com.google.android.gms.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
final class zzv {
    private java.lang.String zza;
    private java.lang.Boolean zzb;
    private java.lang.Boolean zzc;

    private zzv() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.zza = r0
            r1.zzb = r0
            r1.zzc = r0
            return
    }

    /* synthetic */ zzv(byte[] r1) {
            r0 = this;
            r0.<init>()
            r1 = 0
            r0.zza = r1
            r0.zzb = r1
            r0.zzc = r1
            return
    }

    final com.google.android.gms.common.zzv zza(java.lang.String r1) {
            r0 = this;
            r0.zza = r1
            return r0
    }

    final com.google.android.gms.common.zzv zzb(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.zzb = r1
            return r0
    }

    final com.google.android.gms.common.zzv zzc(boolean r1) {
            r0 = this;
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.zzc = r1
            return r0
    }

    final com.google.android.gms.common.zzw zzd() {
            r10 = this;
            java.lang.Boolean r0 = r10.zzb
            if (r0 == 0) goto L27
            java.lang.Boolean r1 = r10.zzc
            if (r1 == 0) goto L1f
            com.google.android.gms.common.zzw r1 = new com.google.android.gms.common.zzw
            java.lang.String r3 = r10.zza
            boolean r4 = r0.booleanValue()
            java.lang.Boolean r0 = r10.zzc
            boolean r7 = r0.booleanValue()
            r8 = 0
            r9 = 0
            r5 = 0
            r6 = 0
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r1
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "isGoogleOrPlatformOnly must be set"
            r0.<init>(r1)
            throw r0
        L27:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "allowTestKeys must be set"
            r0.<init>(r1)
            throw r0
    }
}
