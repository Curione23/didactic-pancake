package android.support.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements android.support.customtabs.ICustomTabsService {
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

        @Override // android.support.customtabs.ICustomTabsService
        public android.os.Bundle extraCommand(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, android.os.Bundle r3, java.util.List<android.os.Bundle> r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSession(android.support.customtabs.ICustomTabsCallback r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public int postMessage(android.support.customtabs.ICustomTabsCallback r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean receiveFile(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, int r3, android.os.Bundle r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback r1, android.os.IBinder r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback r1, int r2, android.net.Uri r3, android.os.Bundle r4) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsService
        public boolean warmup(long r1) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsService {
        static final int TRANSACTION_extraCommand = 5;
        static final int TRANSACTION_isEngagementSignalsApiAvailable = 13;
        static final int TRANSACTION_mayLaunchUrl = 4;
        static final int TRANSACTION_newSession = 3;
        static final int TRANSACTION_newSessionWithExtras = 10;
        static final int TRANSACTION_postMessage = 8;
        static final int TRANSACTION_receiveFile = 12;
        static final int TRANSACTION_requestPostMessageChannel = 7;
        static final int TRANSACTION_requestPostMessageChannelWithExtras = 11;
        static final int TRANSACTION_setEngagementSignalsCallback = 14;
        static final int TRANSACTION_updateVisuals = 6;
        static final int TRANSACTION_validateRelationship = 9;
        static final int TRANSACTION_warmup = 2;

        private static class Proxy implements android.support.customtabs.ICustomTabsService {
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

            @Override // android.support.customtabs.ICustomTabsService
            public android.os.Bundle extraCommand(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2c
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L2c
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2c
                    r2 = 5
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r4 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r1, r4)     // Catch: java.lang.Throwable -> L2c
                    android.os.Bundle r4 = (android.os.Bundle) r4     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2c:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2c
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L2c
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2c
                    r2 = 13
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    if (r5 == 0) goto L25
                    r4 = 1
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2c:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5, android.os.Bundle r6, java.util.List<android.os.Bundle> r7) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L31
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L31
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L31
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L31
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r6, r4)     // Catch: java.lang.Throwable -> L31
                    android.support.customtabs.ICustomTabsService._Parcel.access$200(r0, r7, r4)     // Catch: java.lang.Throwable -> L31
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L31
                    r6 = 4
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L31
                    r1.readException()     // Catch: java.lang.Throwable -> L31
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L31
                    if (r5 == 0) goto L2a
                    r4 = 1
                L2a:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L31:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSession(android.support.customtabs.ICustomTabsCallback r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L28
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                    r0.writeStrongInterface(r5)     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L28
                    r2 = 3
                    r3 = 0
                    r5.transact(r2, r0, r1, r3)     // Catch: java.lang.Throwable -> L28
                    r1.readException()     // Catch: java.lang.Throwable -> L28
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L28
                    if (r5 == 0) goto L21
                    r3 = 1
                L21:
                    r1.recycle()
                    r0.recycle()
                    return r3
                L28:
                    r5 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2c
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L2c
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2c
                    r2 = 10
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    if (r5 == 0) goto L25
                    r4 = 1
                L25:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2c:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public int postMessage(android.support.customtabs.ICustomTabsCallback r4, java.lang.String r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2c
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L2c
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L2c
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r6, r4)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2c
                    r6 = 8
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L2c
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2c:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean receiveFile(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5, int r6, android.os.Bundle r7) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L32
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L32
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L32
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r7, r4)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L32
                    r6 = 12
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L32
                    if (r5 == 0) goto L2b
                    r4 = 1
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L32:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2b
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L2b
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2b
                    r2 = 7
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L2b
                    if (r5 == 0) goto L24
                    r4 = 1
                L24:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2b:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback r4, android.net.Uri r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2f
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L2f
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L2f
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r6, r4)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2f
                    r6 = 11
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L2f
                    if (r5 == 0) goto L28
                    r4 = 1
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2f:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback r4, android.os.IBinder r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2f
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2f
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L2f
                    r0.writeStrongBinder(r5)     // Catch: java.lang.Throwable -> L2f
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r6, r4)     // Catch: java.lang.Throwable -> L2f
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2f
                    r6 = 14
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L2f
                    r1.readException()     // Catch: java.lang.Throwable -> L2f
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L2f
                    if (r5 == 0) goto L28
                    r4 = 1
                L28:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2f:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean updateVisuals(android.support.customtabs.ICustomTabsCallback r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2b
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2b
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L2b
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L2b
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2b
                    r2 = 6
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2b
                    r1.readException()     // Catch: java.lang.Throwable -> L2b
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L2b
                    if (r5 == 0) goto L24
                    r4 = 1
                L24:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L2b:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean validateRelationship(android.support.customtabs.ICustomTabsCallback r4, int r5, android.net.Uri r6, android.os.Bundle r7) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L32
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L32
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L32
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L32
                    r4 = 0
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r6, r4)     // Catch: java.lang.Throwable -> L32
                    android.support.customtabs.ICustomTabsService._Parcel.access$100(r0, r7, r4)     // Catch: java.lang.Throwable -> L32
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L32
                    r6 = 9
                    r5.transact(r6, r0, r1, r4)     // Catch: java.lang.Throwable -> L32
                    r1.readException()     // Catch: java.lang.Throwable -> L32
                    int r5 = r1.readInt()     // Catch: java.lang.Throwable -> L32
                    if (r5 == 0) goto L2b
                    r4 = 1
                L2b:
                    r1.recycle()
                    r0.recycle()
                    return r4
                L32:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsService
            public boolean warmup(long r4) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsService.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L28
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L28
                    r0.writeLong(r4)     // Catch: java.lang.Throwable -> L28
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L28
                    r5 = 2
                    r2 = 0
                    r4.transact(r5, r0, r1, r2)     // Catch: java.lang.Throwable -> L28
                    r1.readException()     // Catch: java.lang.Throwable -> L28
                    int r4 = r1.readInt()     // Catch: java.lang.Throwable -> L28
                    if (r4 == 0) goto L21
                    r2 = 1
                L21:
                    r1.recycle()
                    r0.recycle()
                    return r2
                L28:
                    r4 = move-exception
                    r1.recycle()
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = android.support.customtabs.ICustomTabsService.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.customtabs.ICustomTabsService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = android.support.customtabs.ICustomTabsService.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.customtabs.ICustomTabsService
                if (r1 == 0) goto L13
                android.support.customtabs.ICustomTabsService r0 = (android.support.customtabs.ICustomTabsService) r0
                return r0
            L13:
                android.support.customtabs.ICustomTabsService$Stub$Proxy r0 = new android.support.customtabs.ICustomTabsService$Stub$Proxy
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
                java.lang.String r0 = android.support.customtabs.ICustomTabsService.Stub.DESCRIPTOR
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
                    case 2: goto L194;
                    case 3: goto L181;
                    case 4: goto L158;
                    case 5: goto L141;
                    case 6: goto L126;
                    case 7: goto L10a;
                    case 8: goto Lea;
                    case 9: goto Lc2;
                    case 10: goto La6;
                    case 11: goto L82;
                    case 12: goto L5a;
                    case 13: goto L3e;
                    case 14: goto L1e;
                    default: goto L19;
                }
            L19:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1e:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.IBinder r7 = r5.readStrongBinder()
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r0)
                android.os.Bundle r5 = (android.os.Bundle) r5
                boolean r4 = r3.setEngagementSignalsCallback(r4, r7, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L3e:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.os.Bundle r5 = (android.os.Bundle) r5
                boolean r4 = r3.isEngagementSignalsApiAvailable(r4, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L5a:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.net.Uri.CREATOR
                java.lang.Object r7 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.net.Uri r7 = (android.net.Uri) r7
                int r0 = r5.readInt()
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r2)
                android.os.Bundle r5 = (android.os.Bundle) r5
                boolean r4 = r3.receiveFile(r4, r7, r0, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L82:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.net.Uri.CREATOR
                java.lang.Object r7 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.net.Uri r7 = (android.net.Uri) r7
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r0)
                android.os.Bundle r5 = (android.os.Bundle) r5
                boolean r4 = r3.requestPostMessageChannelWithExtras(r4, r7, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            La6:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.os.Bundle r5 = (android.os.Bundle) r5
                boolean r4 = r3.newSessionWithExtras(r4, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            Lc2:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                int r7 = r5.readInt()
                android.os.Parcelable$Creator r0 = android.net.Uri.CREATOR
                java.lang.Object r0 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r0)
                android.net.Uri r0 = (android.net.Uri) r0
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r2)
                android.os.Bundle r5 = (android.os.Bundle) r5
                boolean r4 = r3.validateRelationship(r4, r7, r0, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            Lea:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                java.lang.String r7 = r5.readString()
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r0)
                android.os.Bundle r5 = (android.os.Bundle) r5
                int r4 = r3.postMessage(r4, r7, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L10a:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.net.Uri.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.net.Uri r5 = (android.net.Uri) r5
                boolean r4 = r3.requestPostMessageChannel(r4, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L126:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.os.Bundle r5 = (android.os.Bundle) r5
                boolean r4 = r3.updateVisuals(r4, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L141:
                java.lang.String r4 = r5.readString()
                android.os.Parcelable$Creator r7 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.os.Bundle r5 = (android.os.Bundle) r5
                android.os.Bundle r4 = r3.extraCommand(r4, r5)
                r6.writeNoException()
                android.support.customtabs.ICustomTabsService._Parcel.access$100(r6, r4, r1)
                goto L1a2
            L158:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                android.os.Parcelable$Creator r7 = android.net.Uri.CREATOR
                java.lang.Object r7 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r7)
                android.net.Uri r7 = (android.net.Uri) r7
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = android.support.customtabs.ICustomTabsService._Parcel.access$000(r5, r0)
                android.os.Bundle r0 = (android.os.Bundle) r0
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.util.ArrayList r5 = r5.createTypedArrayList(r2)
                boolean r4 = r3.mayLaunchUrl(r4, r7, r0, r5)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L181:
                android.os.IBinder r4 = r5.readStrongBinder()
                android.support.customtabs.ICustomTabsCallback r4 = android.support.customtabs.ICustomTabsCallback.Stub.asInterface(r4)
                boolean r4 = r3.newSession(r4)
                r6.writeNoException()
                r6.writeInt(r4)
                goto L1a2
            L194:
                long r4 = r5.readLong()
                boolean r4 = r3.warmup(r4)
                r6.writeNoException()
                r6.writeInt(r4)
            L1a2:
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

        static /* synthetic */ void access$200(android.os.Parcel r0, java.util.List r1, int r2) {
                writeTypedList(r0, r1, r2)
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

        private static <T extends android.os.Parcelable> void writeTypedList(android.os.Parcel r3, java.util.List<T> r4, int r5) {
                if (r4 != 0) goto L7
                r4 = -1
                r3.writeInt(r4)
                goto L1d
            L7:
                int r0 = r4.size()
                r3.writeInt(r0)
                r1 = 0
            Lf:
                if (r1 >= r0) goto L1d
                java.lang.Object r2 = r4.get(r1)
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                writeTypedObject(r3, r2, r5)
                int r1 = r1 + 1
                goto Lf
            L1d:
                return
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
            java.lang.String r2 = "android$support$customtabs$ICustomTabsService"
            java.lang.String r0 = r2.replace(r0, r1)
            android.support.customtabs.ICustomTabsService.DESCRIPTOR = r0
            return
    }

    android.os.Bundle extraCommand(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    boolean isEngagementSignalsApiAvailable(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException;

    boolean mayLaunchUrl(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, android.os.Bundle r3, java.util.List<android.os.Bundle> r4) throws android.os.RemoteException;

    boolean newSession(android.support.customtabs.ICustomTabsCallback r1) throws android.os.RemoteException;

    boolean newSessionWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException;

    int postMessage(android.support.customtabs.ICustomTabsCallback r1, java.lang.String r2, android.os.Bundle r3) throws android.os.RemoteException;

    boolean receiveFile(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, int r3, android.os.Bundle r4) throws android.os.RemoteException;

    boolean requestPostMessageChannel(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2) throws android.os.RemoteException;

    boolean requestPostMessageChannelWithExtras(android.support.customtabs.ICustomTabsCallback r1, android.net.Uri r2, android.os.Bundle r3) throws android.os.RemoteException;

    boolean setEngagementSignalsCallback(android.support.customtabs.ICustomTabsCallback r1, android.os.IBinder r2, android.os.Bundle r3) throws android.os.RemoteException;

    boolean updateVisuals(android.support.customtabs.ICustomTabsCallback r1, android.os.Bundle r2) throws android.os.RemoteException;

    boolean validateRelationship(android.support.customtabs.ICustomTabsCallback r1, int r2, android.net.Uri r3, android.os.Bundle r4) throws android.os.RemoteException;

    boolean warmup(long r1) throws android.os.RemoteException;
}
