package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.6.0 */
/* JADX INFO: loaded from: classes.dex */
public class a implements android.os.IInterface {
    private final android.os.IBinder a;
    private final java.lang.String b;

    protected a(android.os.IBinder r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    protected final android.os.Parcel a() {
            r2 = this;
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.lang.String r1 = r2.b
            r0.writeInterfaceToken(r1)
            return r0
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
            r1 = this;
            android.os.IBinder r0 = r1.a
            return r0
    }

    protected final void b(int r4, android.os.Parcel r5) throws android.os.RemoteException {
            r3 = this;
            android.os.IBinder r0 = r3.a     // Catch: java.lang.Throwable -> Lb
            r1 = 0
            r2 = 1
            r0.transact(r4, r5, r1, r2)     // Catch: java.lang.Throwable -> Lb
            r5.recycle()
            return
        Lb:
            r4 = move-exception
            r5.recycle()
            throw r4
    }
}
