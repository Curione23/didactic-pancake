package android.support.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface IEngagementSignalsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements android.support.customtabs.IEngagementSignalsCallback {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onGreatestScrollPercentageIncreased(int r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onSessionEnded(boolean r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public void onVerticalScrollEvent(boolean r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.IEngagementSignalsCallback {
        static final int TRANSACTION_onGreatestScrollPercentageIncreased = 3;
        static final int TRANSACTION_onSessionEnded = 4;
        static final int TRANSACTION_onVerticalScrollEvent = 2;

        private static class Proxy implements android.support.customtabs.IEngagementSignalsCallback {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = android.support.customtabs.IEngagementSignalsCallback.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onGreatestScrollPercentageIncreased(int r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.IEngagementSignalsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1c
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1c
                    r4 = 0
                    android.support.customtabs.IEngagementSignalsCallback._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L1c
                    r5 = 0
                    r1 = 1
                    r2 = 3
                    r4.transact(r2, r0, r5, r1)     // Catch: java.lang.Throwable -> L1c
                    r0.recycle()
                    return
                L1c:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onSessionEnded(boolean r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.IEngagementSignalsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1c
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r1 = 1
                    r2 = 0
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1c
                    android.support.customtabs.IEngagementSignalsCallback._Parcel.access$100(r0, r5, r2)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L1c
                    r5 = 4
                    r2 = 0
                    r4.transact(r5, r0, r2, r1)     // Catch: java.lang.Throwable -> L1c
                    r0.recycle()
                    return
                L1c:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public void onVerticalScrollEvent(boolean r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.IEngagementSignalsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1c
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r1 = 1
                    r2 = 0
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1c
                    android.support.customtabs.IEngagementSignalsCallback._Parcel.access$100(r0, r5, r2)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L1c
                    r5 = 2
                    r2 = 0
                    r4.transact(r5, r0, r2, r1)     // Catch: java.lang.Throwable -> L1c
                    r0.recycle()
                    return
                L1c:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = android.support.customtabs.IEngagementSignalsCallback.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.customtabs.IEngagementSignalsCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = android.support.customtabs.IEngagementSignalsCallback.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.customtabs.IEngagementSignalsCallback
                if (r1 == 0) goto L13
                android.support.customtabs.IEngagementSignalsCallback r0 = (android.support.customtabs.IEngagementSignalsCallback) r0
                return r0
            L13:
                android.support.customtabs.IEngagementSignalsCallback$Stub$Proxy r0 = new android.support.customtabs.IEngagementSignalsCallback$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                java.lang.String r0 = android.support.customtabs.IEngagementSignalsCallback.Stub.DESCRIPTOR
                r1 = 1
                if (r4 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 != r2) goto L16
                r6.writeString(r0)
                return r1
            L16:
                r0 = 2
                r2 = 0
                if (r4 == r0) goto L48
                r0 = 3
                if (r4 == r0) goto L38
                r0 = 4
                if (r4 == r0) goto L25
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L25:
                int r4 = r5.readInt()
                if (r4 == 0) goto L2c
                r2 = r1
            L2c:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = android.support.customtabs.IEngagementSignalsCallback._Parcel.access$000(r5, r4)
                android.os.Bundle r4 = (android.os.Bundle) r4
                r3.onSessionEnded(r2, r4)
                goto L5a
            L38:
                int r4 = r5.readInt()
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.IEngagementSignalsCallback._Parcel.access$000(r5, r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
                r3.onGreatestScrollPercentageIncreased(r4, r5)
                goto L5a
            L48:
                int r4 = r5.readInt()
                if (r4 == 0) goto L4f
                r2 = r1
            L4f:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = android.support.customtabs.IEngagementSignalsCallback._Parcel.access$000(r5, r4)
                android.os.Bundle r4 = (android.os.Bundle) r4
                r3.onVerticalScrollEvent(r2, r4)
            L5a:
                return r1
        }
    }

    public static class _Parcel {
        public _Parcel() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ java.lang.Object access$000(android.os.Parcel r0, android.os.Parcelable.Creator r1) {
                java.lang.Object r0 = readTypedObject(r0, r1)
                return r0
        }

        static /* synthetic */ void access$100(android.os.Parcel r0, android.os.Parcelable r1, int r2) {
                writeTypedObject(r0, r1, r2)
                return
        }

        private static <T> T readTypedObject(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
                int r0 = r1.readInt()
                if (r0 == 0) goto Lb
                java.lang.Object r1 = r2.createFromParcel(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        private static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel r1, T r2, int r3) {
                if (r2 == 0) goto La
                r0 = 1
                r1.writeInt(r0)
                r2.writeToParcel(r1, r3)
                goto Le
            La:
                r2 = 0
                r1.writeInt(r2)
            Le:
                return
        }
    }

    static {
            r0 = 36
            r1 = 46
            java.lang.String r2 = "android$support$customtabs$IEngagementSignalsCallback"
            java.lang.String r0 = r2.replace(r0, r1)
            android.support.customtabs.IEngagementSignalsCallback.DESCRIPTOR = r0
            return
    }

    void onGreatestScrollPercentageIncreased(int r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onSessionEnded(boolean r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onVerticalScrollEvent(boolean r1, android.os.Bundle r2) throws android.os.RemoteException;
}
