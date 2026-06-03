package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.i {
    public static com.google.android.play.integrity.internal.i b(android.os.IBinder r2) {
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.lang.String r0 = "com.google.android.play.core.integrity.protocol.IExpressIntegrityService"
            android.os.IInterface r0 = r2.queryLocalInterface(r0)
            boolean r1 = r0 instanceof com.google.android.play.integrity.internal.i
            if (r1 == 0) goto L11
            com.google.android.play.integrity.internal.i r0 = (com.google.android.play.integrity.internal.i) r0
            return r0
        L11:
            com.google.android.play.integrity.internal.g r0 = new com.google.android.play.integrity.internal.g
            r0.<init>(r2)
            return r0
    }
}
