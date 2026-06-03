package android.support.customtabs.trusted;

/* JADX INFO: loaded from: classes.dex */
public interface ITrustedWebActivityService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements android.support.customtabs.trusted.ITrustedWebActivityService {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle areNotificationsEnabled(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public void cancelNotification(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle extraCommand(java.lang.String r1, android.os.Bundle r2, android.os.IBinder r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getActiveNotifications() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle getSmallIconBitmap() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public int getSmallIconId() throws android.os.RemoteException {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.customtabs.trusted.ITrustedWebActivityService
        public android.os.Bundle notifyNotificationWithChannel(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.trusted.ITrustedWebActivityService {
        static final int TRANSACTION_areNotificationsEnabled = 6;
        static final int TRANSACTION_cancelNotification = 3;
        static final int TRANSACTION_extraCommand = 9;
        static final int TRANSACTION_getActiveNotifications = 5;
        static final int TRANSACTION_getSmallIconBitmap = 7;
        static final int TRANSACTION_getSmallIconId = 4;
        static final int TRANSACTION_notifyNotificationWithChannel = 2;

        private static class Proxy implements android.support.customtabs.trusted.ITrustedWebActivityService {
            private android.os.IBinder mRemote;

            Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle areNotificationsEnabled(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L29
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L29
                    r2 = 0
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r0, r5, r2)     // Catch: java.lang.Throwable -> L29
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L29
                    r3 = 6
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L29
                    r1.readException()     // Catch: java.lang.Throwable -> L29
                    android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L29
                    java.lang.Object r5 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r1, r5)     // Catch: java.lang.Throwable -> L29
                    android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L29
                    r1.recycle()
                    r0.recycle()
                    return r5
                L29:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public void cancelNotification(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L21
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L21
                    r2 = 0
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r0, r5, r2)     // Catch: java.lang.Throwable -> L21
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L21
                    r3 = 3
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L21
                    r1.readException()     // Catch: java.lang.Throwable -> L21
                    r1.recycle()
                    r0.recycle()
                    return
                L21:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle extraCommand(java.lang.String r4, android.os.Bundle r5, android.os.IBinder r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L30
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L30
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L30
                    r4 = 0
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L30
                    r0.writeStrongBinder(r6)     // Catch: java.lang.Throwable -> L30
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L30
                    r6 = 9
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L30
                    r1.readException()     // Catch: java.lang.Throwable -> L30
                    android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L30
                    java.lang.Object r4 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r1, r4)     // Catch: java.lang.Throwable -> L30
                    android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L30
                    r1.recycle()
                    r0.recycle()
                    return r4
                L30:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle getActiveNotifications() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L26
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L26
                    r3 = 5
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L26
                    r1.readException()     // Catch: java.lang.Throwable -> L26
                    android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L26
                    java.lang.Object r2 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r1, r2)     // Catch: java.lang.Throwable -> L26
                    android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Throwable -> L26
                    r1.recycle()
                    r0.recycle()
                    return r2
                L26:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle getSmallIconBitmap() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L26
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L26
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L26
                    r3 = 7
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L26
                    r1.readException()     // Catch: java.lang.Throwable -> L26
                    android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L26
                    java.lang.Object r2 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r1, r2)     // Catch: java.lang.Throwable -> L26
                    android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: java.lang.Throwable -> L26
                    r1.recycle()
                    r0.recycle()
                    return r2
                L26:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public int getSmallIconId() throws android.os.RemoteException {
                    r5 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L22
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r2 = r5.mRemote     // Catch: java.lang.Throwable -> L22
                    r3 = 4
                    r4 = 0
                    r2.transact(r3, r0, r1, r4)     // Catch: java.lang.Throwable -> L22
                    r1.readException()     // Catch: java.lang.Throwable -> L22
                    int r2 = r1.readInt()     // Catch: java.lang.Throwable -> L22
                    r1.recycle()
                    r0.recycle()
                    return r2
                L22:
                    r2 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r2
            }

            @Override // android.support.customtabs.trusted.ITrustedWebActivityService
            public android.os.Bundle notifyNotificationWithChannel(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L29
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L29
                    r2 = 0
                    android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r0, r5, r2)     // Catch: java.lang.Throwable -> L29
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L29
                    r3 = 2
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L29
                    r1.readException()     // Catch: java.lang.Throwable -> L29
                    android.os.Parcelable$Creator r5 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L29
                    java.lang.Object r5 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r1, r5)     // Catch: java.lang.Throwable -> L29
                    android.os.Bundle r5 = (android.os.Bundle) r5     // Catch: java.lang.Throwable -> L29
                    r1.recycle()
                    r0.recycle()
                    return r5
                L29:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.customtabs.trusted.ITrustedWebActivityService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.customtabs.trusted.ITrustedWebActivityService
                if (r1 == 0) goto L13
                android.support.customtabs.trusted.ITrustedWebActivityService r0 = (android.support.customtabs.trusted.ITrustedWebActivityService) r0
                return r0
            L13:
                android.support.customtabs.trusted.ITrustedWebActivityService$Stub$Proxy r0 = new android.support.customtabs.trusted.ITrustedWebActivityService$Stub$Proxy
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
                java.lang.String r0 = android.support.customtabs.trusted.ITrustedWebActivityService.Stub.DESCRIPTOR
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
                switch(r4) {
                    case 2: goto L7c;
                    case 3: goto L6d;
                    case 4: goto L62;
                    case 5: goto L57;
                    case 6: goto L44;
                    case 7: goto L39;
                    case 8: goto L19;
                    case 9: goto L1e;
                    default: goto L19;
                }
            L19:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1e:
                java.lang.String r4 = r5.readString()
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r7 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r5, r7)
                android.os.Bundle r7 = (android.os.Bundle) r7
                android.os.IBinder r5 = r5.readStrongBinder()
                android.os.Bundle r4 = r3.extraCommand(r4, r7, r5)
                r6.writeNoException()
                android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r6, r4, r1)
                goto L8e
            L39:
                android.os.Bundle r4 = r3.getSmallIconBitmap()
                r6.writeNoException()
                android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r6, r4, r1)
                goto L8e
            L44:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r5, r4)
                android.os.Bundle r4 = (android.os.Bundle) r4
                android.os.Bundle r4 = r3.areNotificationsEnabled(r4)
                r6.writeNoException()
                android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r6, r4, r1)
                goto L8e
            L57:
                android.os.Bundle r4 = r3.getActiveNotifications()
                r6.writeNoException()
                android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r6, r4, r1)
                goto L8e
            L62:
                int r4 = r3.getSmallIconId()
                r6.writeNoException()
                r6.writeInt(r4)
                goto L8e
            L6d:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r5, r4)
                android.os.Bundle r4 = (android.os.Bundle) r4
                r3.cancelNotification(r4)
                r6.writeNoException()
                goto L8e
            L7c:
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$000(r5, r4)
                android.os.Bundle r4 = (android.os.Bundle) r4
                android.os.Bundle r4 = r3.notifyNotificationWithChannel(r4)
                r6.writeNoException()
                android.support.customtabs.trusted.ITrustedWebActivityService._Parcel.access$100(r6, r4, r1)
            L8e:
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
            java.lang.String r2 = "android$support$customtabs$trusted$ITrustedWebActivityService"
            java.lang.String r0 = r2.replace(r0, r1)
            android.support.customtabs.trusted.ITrustedWebActivityService.DESCRIPTOR = r0
            return
    }

    android.os.Bundle areNotificationsEnabled(android.os.Bundle r1) throws android.os.RemoteException;

    void cancelNotification(android.os.Bundle r1) throws android.os.RemoteException;

    android.os.Bundle extraCommand(java.lang.String r1, android.os.Bundle r2, android.os.IBinder r3) throws android.os.RemoteException;

    android.os.Bundle getActiveNotifications() throws android.os.RemoteException;

    android.os.Bundle getSmallIconBitmap() throws android.os.RemoteException;

    int getSmallIconId() throws android.os.RemoteException;

    android.os.Bundle notifyNotificationWithChannel(android.os.Bundle r1) throws android.os.RemoteException;
}
