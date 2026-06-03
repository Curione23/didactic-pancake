package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.p {
    public o() {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.play.integrity.internal.b
    protected final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 2
            if (r1 != r3) goto L13
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.play.integrity.internal.c.a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.play.integrity.internal.c.b(r2)
            r0.b(r1)
            r1 = 1
            return r1
        L13:
            r1 = 0
            return r1
    }
}
