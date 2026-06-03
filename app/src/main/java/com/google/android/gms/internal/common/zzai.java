package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzai {
    static java.lang.Object[] zza(java.lang.Object[] r2, int r3) {
            r0 = 0
        L1:
            if (r0 >= r3) goto L2b
            r1 = r2[r0]
            if (r1 == 0) goto La
            int r0 = r0 + 1
            goto L1
        La:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = java.lang.String.valueOf(r0)
            int r3 = r3.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r3 = r3 + 9
            r1.<init>(r3)
            java.lang.String r3 = "at index "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r3 = r1.toString()
            r2.<init>(r3)
            throw r2
        L2b:
            return r2
    }
}
