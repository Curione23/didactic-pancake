package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzr {
    public static void zza(boolean r0) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    public static int zzb(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L6
            if (r1 < r2) goto L5
            goto L6
        L5:
            return r1
        L6:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            if (r1 < 0) goto L42
            if (r2 >= 0) goto L2f
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r3 = r3 + 15
            r0.<init>(r3)
            java.lang.String r3 = "negative size: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
        L2f:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1, r2}
            java.lang.String r2 = "%s (%s) must be less than size (%s)"
            java.lang.String r1 = com.google.android.gms.internal.common.zzx.zza(r2, r1)
            goto L50
        L42:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r2 = "%s (%s) must not be negative"
            java.lang.String r1 = com.google.android.gms.internal.common.zzx.zza(r2, r1)
        L50:
            r3.<init>(r1)
            throw r3
    }

    public static int zzc(int r1, int r2, java.lang.String r3) {
            if (r1 < 0) goto L5
            if (r1 > r2) goto L5
            return r1
        L5:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "index"
            java.lang.String r1 = zze(r1, r2, r0)
            r3.<init>(r1)
            throw r3
    }

    public static void zzd(int r1, int r2, int r3) {
            if (r1 < 0) goto L8
            if (r2 < r1) goto L8
            if (r2 <= r3) goto L7
            goto L8
        L7:
            return
        L8:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            if (r1 < 0) goto L2d
            if (r1 > r3) goto L2d
            if (r2 < 0) goto L26
            if (r2 <= r3) goto L13
            goto L26
        L13:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
            java.lang.String r2 = "end index (%s) must not be less than start index (%s)"
            java.lang.String r1 = com.google.android.gms.internal.common.zzx.zza(r2, r1)
            goto L33
        L26:
            java.lang.String r1 = "end index"
            java.lang.String r1 = zze(r2, r3, r1)
            goto L33
        L2d:
            java.lang.String r2 = "start index"
            java.lang.String r1 = zze(r1, r3, r2)
        L33:
            r0.<init>(r1)
            throw r0
    }

    private static java.lang.String zze(int r1, int r2, java.lang.String r3) {
            if (r1 >= 0) goto L11
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            java.lang.String r2 = "%s (%s) must not be negative"
            java.lang.String r1 = com.google.android.gms.internal.common.zzx.zza(r2, r1)
            return r1
        L11:
            if (r2 < 0) goto L26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1, r2}
            java.lang.String r2 = "%s (%s) must not be greater than size (%s)"
            java.lang.String r1 = com.google.android.gms.internal.common.zzx.zza(r2, r1)
            return r1
        L26:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r3 = r3 + 15
            r0.<init>(r3)
            java.lang.String r3 = "negative size: "
            r0.append(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            throw r1
    }
}
