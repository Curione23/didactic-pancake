package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
class zzaa extends com.google.android.gms.internal.common.zzab {
    java.lang.Object[] zza;
    int zzb;
    boolean zzc;

    zzaa(int r1) {
            r0 = this;
            r0.<init>()
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.zza = r1
            r1 = 0
            r0.zzb = r1
            return
    }

    public final com.google.android.gms.internal.common.zzaa zza(java.lang.Object r5) {
            r4 = this;
            r5.getClass()
            java.lang.Object[] r0 = r4.zza
            int r0 = r0.length
            int r1 = r4.zzb
            int r2 = r1 + 1
            if (r2 < 0) goto L3e
            if (r2 > r0) goto L10
            r3 = r0
            goto L22
        L10:
            int r3 = r0 >> 1
            int r3 = r3 + r0
            int r3 = r3 + 1
            if (r3 >= r2) goto L1d
            int r1 = java.lang.Integer.highestOneBit(r1)
            int r3 = r1 + r1
        L1d:
            if (r3 >= 0) goto L22
            r3 = 2147483647(0x7fffffff, float:NaN)
        L22:
            if (r3 > r0) goto L28
            boolean r0 = r4.zzc
            if (r0 == 0) goto L33
        L28:
            java.lang.Object[] r0 = r4.zza
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            r4.zza = r0
            r0 = 0
            r4.zzc = r0
        L33:
            java.lang.Object[] r0 = r4.zza
            int r1 = r4.zzb
            int r2 = r1 + 1
            r4.zzb = r2
            r0[r1] = r5
            return r4
        L3e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "cannot store more than Integer.MAX_VALUE elements"
            r5.<init>(r0)
            throw r5
    }
}
