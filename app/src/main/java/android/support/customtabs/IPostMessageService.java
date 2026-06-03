package android.support.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface IPostMessageService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements android.support.customtabs.IPostMessageService {
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

        @Override // android.support.customtabs.IPostMessageService
        public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.IPostMessageService
        public void onPostMessage(android.support.customtabs.ICustomTabsCallback r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.IPostMessageService {
        static final int TRANSACTION_onMessageChannelReady = 2;
        static final int TRANSACTION_onPostMessage = 3;

        private static class Proxy implements android.support.customtabs.IPostMessageService {
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
                    java.lang.String r0 = android.support.customtabs.IPostMessageService.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // android.support.customtabs.IPostMessageService
            public void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.IPostMessageService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L24
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L24
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L24
                    r4 = 0
                    android.support.customtabs.IPostMessageService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L24
                    r2 = 2
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L24
                    r1.readException()     // Catch: java.lang.Throwable -> L24
                    r1.recycle()
                    r0.recycle()
                    return
                L24:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.IPostMessageService
            public void onPostMessage(android.support.customtabs.ICustomTabsCallback r4, java.lang.String r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.IPostMessageService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L27
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L27
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L27
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L27
                    r4 = 0
                    android.support.customtabs.IPostMessageService._Parcel.access$100(r0, r6, r4)     // Catch: java.lang.Throwable -> L27
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L27
                    r6 = 3
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L27
                    r1.readException()     // Catch: java.lang.Throwable -> L27
                    r1.recycle()
                    r0.recycle()
                    return
                L27:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = android.support.customtabs.IPostMessageService.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.customtabs.IPostMessageService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = android.support.customtabs.IPostMessageService.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.customtabs.IPostMessageService
                if (r1 == 0) goto L13
                android.support.customtabs.IPostMessageService r0 = (android.support.customtabs.IPostMessageService) r0
                return r0
            L13:
                android.support.customtabs.IPostMessageService$Stub$Proxy r0 = new android.support.customtabs.IPostMessageService$Stub$Proxy
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
                java.lang.String r0 = android.support.customtabs.IPostMessageService.Stub.DESCRIPTOR
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
                if (r4 == r0) goto L3c
                r0 = 3
                if (r4 == r0) goto L21
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L21:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                java.lang.String r7 = r5.readString()
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.IPostMessageService._Parcel.access$000(r5, r0)
                android.os.Bundle r5 = (android.os.Bundle) r5
                r3.onPostMessage(r4, r7, r5)
                r6.writeNoException()
                goto L52
            L3c:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.IPostMessageService._Parcel.access$000(r5, r7)
                android.os.Bundle r5 = (android.os.Bundle) r5
                r3.onMessageChannelReady(r4, r5)
                r6.writeNoException()
            L52:
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
            java.lang.String r2 = "android$support$customtabs$IPostMessageService"
            java.lang.String r0 = r2.replace(r0, r1)
            android.support.customtabs.IPostMessageService.DESCRIPTOR = r0
            return
    }

    void onMessageChannelReady(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onPostMessage(android.support.customtabs.ICustomTabsCallback r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException;
}
