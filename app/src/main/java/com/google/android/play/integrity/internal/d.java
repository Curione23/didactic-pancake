package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final java.util.List a(java.util.List r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r5.next()
            com.google.android.play.integrity.internal.f r1 = (com.google.android.play.integrity.internal.f) r1
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            int r3 = r1.a()
            java.lang.String r4 = "event_type"
            r2.putInt(r4, r3)
            long r3 = r1.b()
            java.lang.String r1 = "event_timestamp"
            r2.putLong(r1, r3)
            r0.add(r2)
            goto L9
        L30:
            return r0
    }

    public static final void b(int r2, java.util.List r3) {
            long r0 = java.lang.System.currentTimeMillis()
            com.google.android.play.integrity.internal.f r2 = com.google.android.play.integrity.internal.f.c(r2, r0)
            r3.add(r2)
            return
    }
}
