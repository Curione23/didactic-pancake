package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
abstract class ag {
    private final com.google.android.play.integrity.internal.s a;
    private final java.lang.String b;
    private final long c;
    private final java.lang.Object d;
    private boolean e;

    ag(java.lang.String r3, long r4) {
            r2 = this;
            r2.<init>()
            com.google.android.play.integrity.internal.s r0 = new com.google.android.play.integrity.internal.s
            java.lang.String r1 = "IntegrityDialogWrapper"
            r0.<init>(r1)
            r2.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r2.d = r0
            r2.b = r3
            r2.c = r4
            return
    }

    public final com.google.android.gms.tasks.Task a(android.app.Activity r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.d
            monitor-enter(r0)
            boolean r1 = r5.e     // Catch: java.lang.Throwable -> L52
            r2 = 0
            if (r1 == 0) goto L12
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L52
            com.google.android.gms.tasks.Task r6 = com.google.android.gms.tasks.Tasks.forResult(r6)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return r6
        L12:
            r1 = 1
            r5.e = r1     // Catch: java.lang.Throwable -> L52
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            com.google.android.play.integrity.internal.s r0 = r5.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "checkAndShowDialog(%s)"
            r0.a(r4, r3)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r3 = "dialog.intent.type"
            r0.putInt(r3, r7)
            java.lang.String r7 = r5.b
            java.lang.String r3 = "package.name"
            r0.putString(r3, r7)
            java.lang.String r7 = "playcore.integrity.version.major"
            r0.putInt(r7, r1)
            java.lang.String r7 = "playcore.integrity.version.minor"
            r1 = 6
            r0.putInt(r7, r1)
            java.lang.String r7 = "playcore.integrity.version.patch"
            r0.putInt(r7, r2)
            long r1 = r5.c
            java.lang.String r7 = "request.token.sid"
            r0.putLong(r7, r1)
            com.google.android.gms.tasks.Task r6 = r5.b(r6, r0)
            return r6
        L52:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r6
    }

    abstract com.google.android.gms.tasks.Task b(android.app.Activity r1, android.os.Bundle r2);
}
