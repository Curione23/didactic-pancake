package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class StandardIntegrityException extends com.google.android.gms.common.api.ApiException {
    private final java.lang.Throwable a;
    private final boolean b;
    private boolean c;
    private final java.lang.Object d;

    StandardIntegrityException(int r5, boolean r6, java.lang.Throwable r7) {
            r4 = this;
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            java.lang.String r3 = com.google.android.play.core.integrity.model.b.a(r5)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "Standard Integrity API error (%d): %s."
            java.lang.String r1 = java.lang.String.format(r1, r3, r2)
            r0.<init>(r5, r1)
            r4.<init>(r0)
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.d = r0
            if (r5 == 0) goto L2a
            r4.a = r7
            r4.b = r6
            return
        L2a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "ErrorCode should not be 0."
            r5.<init>(r6)
            throw r5
    }

    final void a(boolean r2) {
            r1 = this;
            java.lang.Object r2 = r1.d
            monitor-enter(r2)
            r0 = 1
            r1.c = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    final boolean b() {
            r3 = this;
            java.lang.Object r0 = r3.d
            monitor-enter(r0)
            boolean r1 = r3.c     // Catch: java.lang.Throwable -> Lf
            r2 = 0
            if (r1 != 0) goto Ld
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Ld
            r2 = 1
        Ld:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    @Override // java.lang.Throwable
    public final synchronized java.lang.Throwable getCause() {
            r1 = this;
            monitor-enter(r1)
            java.lang.Throwable r0 = r1.a     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = super.getStatusCode()
            return r0
    }

    public boolean isRemediable() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }
}
