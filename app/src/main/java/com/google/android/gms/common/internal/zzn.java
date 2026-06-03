package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzn {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.content.ComponentName zzc;
    private final int zzd;
    private final boolean zze;

    public zzn(android.content.ComponentName r1, int r2) {
            r0 = this;
            r0.<init>()
            r2 = 0
            r0.zza = r2
            r0.zzb = r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            r2 = r1
            android.content.ComponentName r2 = (android.content.ComponentName) r2
            r0.zzc = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zzd = r1
            r1 = 0
            r0.zze = r1
            return
    }

    public zzn(java.lang.String r2, int r3, boolean r4) {
            r1 = this;
            r3 = 4225(0x1081, float:5.92E-42)
            r4 = 0
            java.lang.String r0 = "com.google.android.gms"
            r1.<init>(r2, r0, r3, r4)
            return
    }

    public zzn(java.lang.String r1, java.lang.String r2, int r3, boolean r4) {
            r0 = this;
            r0.<init>()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1)
            r0.zza = r1
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r2)
            r0.zzb = r2
            r1 = 0
            r0.zzc = r1
            r1 = 4225(0x1081, float:5.92E-42)
            r0.zzd = r1
            r0.zze = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.android.gms.common.internal.zzn
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.android.gms.common.internal.zzn r5 = (com.google.android.gms.common.internal.zzn) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.zza
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L33
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.zzb
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L33
            android.content.ComponentName r1 = r4.zzc
            android.content.ComponentName r3 = r5.zzc
            boolean r1 = com.google.android.gms.common.internal.Objects.equal(r1, r3)
            if (r1 == 0) goto L33
            int r1 = r5.zzd
            boolean r1 = r4.zze
            boolean r5 = r5.zze
            if (r1 != r5) goto L33
            return r0
        L33:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            java.lang.String r0 = r5.zza
            java.lang.String r1 = r5.zzb
            android.content.ComponentName r2 = r5.zzc
            r3 = 4225(0x1081, float:5.92E-42)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            boolean r4 = r5.zze
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3, r4}
            int r0 = com.google.android.gms.common.internal.Objects.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.zza
            if (r0 != 0) goto Ld
            android.content.ComponentName r0 = r1.zzc
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = r0.flattenToString()
        Ld:
            return r0
    }

    public final java.lang.String zza() {
            r1 = this;
            java.lang.String r0 = r1.zza
            return r0
    }

    public final java.lang.String zzb() {
            r1 = this;
            java.lang.String r0 = r1.zzb
            return r0
    }

    public final android.content.ComponentName zzc() {
            r1 = this;
            android.content.ComponentName r0 = r1.zzc
            return r0
    }

    public final boolean zzd() {
            r1 = this;
            boolean r0 = r1.zze
            return r0
    }
}
