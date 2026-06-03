package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
final class bb {
    private static com.google.android.play.core.integrity.ac a;

    static synchronized com.google.android.play.core.integrity.ac a(android.content.Context r2, boolean r3) {
            java.lang.Class<com.google.android.play.core.integrity.bb> r3 = com.google.android.play.core.integrity.bb.class
            monitor-enter(r3)
            com.google.android.play.core.integrity.ac r0 = com.google.android.play.core.integrity.bb.a     // Catch: java.lang.Throwable -> L1e
            if (r0 != 0) goto L1a
            com.google.android.play.core.integrity.ab r0 = new com.google.android.play.core.integrity.ab     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
            android.content.Context r2 = com.google.android.play.integrity.internal.ag.a(r2)     // Catch: java.lang.Throwable -> L1e
            r0.a(r2)     // Catch: java.lang.Throwable -> L1e
            com.google.android.play.core.integrity.ac r2 = r0.b()     // Catch: java.lang.Throwable -> L1e
            com.google.android.play.core.integrity.bb.a = r2     // Catch: java.lang.Throwable -> L1e
        L1a:
            com.google.android.play.core.integrity.ac r2 = com.google.android.play.core.integrity.bb.a     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r3)
            return r2
        L1e:
            r2 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1e
            throw r2
    }
}
