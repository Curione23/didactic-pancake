package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j extends com.google.android.play.integrity.internal.b implements com.google.android.play.integrity.internal.k {
    public j() {
            r1 = this;
            java.lang.String r0 = "com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback"
            r1.<init>(r0)
            return
    }

    @Override // com.google.android.play.integrity.internal.b
    protected final boolean a(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) throws android.os.RemoteException {
            r0 = this;
            r3 = 2
            if (r1 == r3) goto L3b
            r3 = 3
            if (r1 == r3) goto L2c
            r3 = 4
            if (r1 == r3) goto L1d
            r3 = 5
            if (r1 == r3) goto Le
            r1 = 0
            return r1
        Le:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.play.integrity.internal.c.a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.play.integrity.internal.c.b(r2)
            r0.b(r1)
            goto L49
        L1d:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.play.integrity.internal.c.a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.play.integrity.internal.c.b(r2)
            r0.d(r1)
            goto L49
        L2c:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.play.integrity.internal.c.a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.play.integrity.internal.c.b(r2)
            r0.c(r1)
            goto L49
        L3b:
            android.os.Parcelable$Creator r1 = android.os.Bundle.CREATOR
            android.os.Parcelable r1 = com.google.android.play.integrity.internal.c.a(r2, r1)
            android.os.Bundle r1 = (android.os.Bundle) r1
            com.google.android.play.integrity.internal.c.b(r2)
            r0.e(r1)
        L49:
            r1 = 1
            return r1
    }
}
