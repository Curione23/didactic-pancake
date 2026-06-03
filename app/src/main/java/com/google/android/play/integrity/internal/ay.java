package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class ay {
    public static void a(java.lang.Object r1, java.lang.Class r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = r2.getCanonicalName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r0 = " must be set"
            java.lang.String r2 = r2.concat(r0)
            r1.<init>(r2)
            throw r1
    }
}
