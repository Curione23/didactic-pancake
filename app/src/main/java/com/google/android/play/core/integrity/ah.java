package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class ah {
    private static com.google.android.play.core.integrity.z a;

    static synchronized com.google.android.play.core.integrity.z a(android.content.Context r3) {
            java.lang.Class<com.google.android.play.core.integrity.ah> r0 = com.google.android.play.core.integrity.ah.class
            monitor-enter(r0)
            com.google.android.play.core.integrity.z r1 = com.google.android.play.core.integrity.ah.a     // Catch: java.lang.Throwable -> L1e
            if (r1 != 0) goto L1a
            com.google.android.play.core.integrity.y r1 = new com.google.android.play.core.integrity.y     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            android.content.Context r3 = com.google.android.play.integrity.internal.ag.a(r3)     // Catch: java.lang.Throwable -> L1e
            r1.a(r3)     // Catch: java.lang.Throwable -> L1e
            com.google.android.play.core.integrity.z r3 = r1.b()     // Catch: java.lang.Throwable -> L1e
            com.google.android.play.core.integrity.ah.a = r3     // Catch: java.lang.Throwable -> L1e
        L1a:
            com.google.android.play.core.integrity.z r3 = com.google.android.play.core.integrity.ah.a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)
            return r3
        L1e:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r3
    }
}
