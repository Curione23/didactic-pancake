package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.google.android.play.integrity.internal.a implements com.google.android.play.integrity.internal.n {
    l(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.integrity.protocol.IIntegrityService"
            r1.<init>(r2, r0)
            return
    }

    @Override // com.google.android.play.integrity.internal.n
    public final void c(android.os.Bundle r2, com.google.android.play.integrity.internal.r r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.a()
            com.google.android.play.integrity.internal.c.c(r0, r2)
            r0.writeStrongBinder(r3)
            r2 = 3
            r1.b(r2, r0)
            return
    }

    @Override // com.google.android.play.integrity.internal.n
    public final void d(android.os.Bundle r2, com.google.android.play.integrity.internal.p r3) throws android.os.RemoteException {
            r1 = this;
            android.os.Parcel r0 = r1.a()
            com.google.android.play.integrity.internal.c.c(r0, r2)
            r0.writeStrongBinder(r3)
            r2 = 2
            r1.b(r2, r0)
            return
    }
}
