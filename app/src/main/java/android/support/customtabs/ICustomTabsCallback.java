package android.support.customtabs;

/* JADX INFO: loaded from: classes.dex */
public interface ICustomTabsCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements android.support.customtabs.ICustomTabsCallback {
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

        @Override // android.support.customtabs.ICustomTabsCallback
        public void extraCallback(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public android.os.Bundle extraCallbackWithResult(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityLayout(int r1, int r2, int r3, int r4, int r5, android.os.Bundle r6) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onActivityResized(int r1, int r2, android.os.Bundle r3) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMessageChannelReady(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onMinimized(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onNavigationEvent(int r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onPostMessage(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onRelationshipValidationResult(int r1, android.net.Uri r2, boolean r3, android.os.Bundle r4) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onUnminimized(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public void onWarmupCompleted(android.os.Bundle r1) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.customtabs.ICustomTabsCallback {
        static final int TRANSACTION_extraCallback = 3;
        static final int TRANSACTION_extraCallbackWithResult = 7;
        static final int TRANSACTION_onActivityLayout = 10;
        static final int TRANSACTION_onActivityResized = 8;
        static final int TRANSACTION_onMessageChannelReady = 4;
        static final int TRANSACTION_onMinimized = 11;
        static final int TRANSACTION_onNavigationEvent = 2;
        static final int TRANSACTION_onPostMessage = 5;
        static final int TRANSACTION_onRelationshipValidationResult = 6;
        static final int TRANSACTION_onUnminimized = 12;
        static final int TRANSACTION_onWarmupCompleted = 9;

        private static class Proxy implements android.support.customtabs.ICustomTabsCallback {
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

            @Override // android.support.customtabs.ICustomTabsCallback
            public void extraCallback(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1c
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L1c
                    r4 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L1c
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

            @Override // android.support.customtabs.ICustomTabsCallback
            public android.os.Bundle extraCallbackWithResult(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L2c
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L2c
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L2c
                    r4 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L2c
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L2c
                    r2 = 7
                    r5.transact(r2, r0, r1, r4)     // Catch: java.lang.Throwable -> L2c
                    r1.readException()     // Catch: java.lang.Throwable -> L2c
                    android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR     // Catch: java.lang.Throwable -> L2c
                    java.lang.Object r4 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r1, r4)     // Catch: java.lang.Throwable -> L2c
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
                    java.lang.String r0 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityLayout(int r3, int r4, int r5, int r6, int r7, android.os.Bundle r8) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L29
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r6)     // Catch: java.lang.Throwable -> L29
                    r0.writeInt(r7)     // Catch: java.lang.Throwable -> L29
                    r3 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r8, r3)     // Catch: java.lang.Throwable -> L29
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L29
                    r4 = 0
                    r5 = 1
                    r6 = 10
                    r3.transact(r6, r0, r4, r5)     // Catch: java.lang.Throwable -> L29
                    r0.recycle()
                    return
                L29:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onActivityResized(int r3, int r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L20
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L20
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L20
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L20
                    r3 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r3)     // Catch: java.lang.Throwable -> L20
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L20
                    r4 = 0
                    r5 = 1
                    r1 = 8
                    r3.transact(r1, r0, r4, r5)     // Catch: java.lang.Throwable -> L20
                    r0.recycle()
                    return
                L20:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMessageChannelReady(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L21
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L21
                    r2 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r2)     // Catch: java.lang.Throwable -> L21
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L21
                    r3 = 4
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

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onMinimized(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1a
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1a
                    r1 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r1)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L1a
                    r1 = 0
                    r2 = 1
                    r3 = 11
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L1a
                    r0.recycle()
                    return
                L1a:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onNavigationEvent(int r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1c
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1c
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1c
                    r4 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L1c
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L1c
                    r5 = 0
                    r1 = 1
                    r2 = 2
                    r4.transact(r2, r0, r5, r1)     // Catch: java.lang.Throwable -> L1c
                    r0.recycle()
                    return
                L1c:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onPostMessage(java.lang.String r4, android.os.Bundle r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    android.os.Parcel r1 = android.os.Parcel.obtain()
                    java.lang.String r2 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L24
                    r0.writeInterfaceToken(r2)     // Catch: java.lang.Throwable -> L24
                    r0.writeString(r4)     // Catch: java.lang.Throwable -> L24
                    r4 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r4)     // Catch: java.lang.Throwable -> L24
                    android.os.IBinder r5 = r3.mRemote     // Catch: java.lang.Throwable -> L24
                    r2 = 5
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

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onRelationshipValidationResult(int r3, android.net.Uri r4, boolean r5, android.os.Bundle r6) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L22
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L22
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L22
                    r3 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r4, r3)     // Catch: java.lang.Throwable -> L22
                    r4 = 1
                    r0.writeInt(r5)     // Catch: java.lang.Throwable -> L22
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r6, r3)     // Catch: java.lang.Throwable -> L22
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L22
                    r5 = 6
                    r6 = 0
                    r3.transact(r5, r0, r6, r4)     // Catch: java.lang.Throwable -> L22
                    r0.recycle()
                    return
                L22:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onUnminimized(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1a
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1a
                    r1 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r1)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L1a
                    r1 = 0
                    r2 = 1
                    r3 = 12
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L1a
                    r0.recycle()
                    return
                L1a:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public void onWarmupCompleted(android.os.Bundle r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = android.support.customtabs.ICustomTabsCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1a
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1a
                    r1 = 0
                    android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r0, r5, r1)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L1a
                    r1 = 0
                    r2 = 1
                    r3 = 9
                    r5.transact(r3, r0, r1, r2)     // Catch: java.lang.Throwable -> L1a
                    r0.recycle()
                    return
                L1a:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = android.support.customtabs.ICustomTabsCallback.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.customtabs.ICustomTabsCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = android.support.customtabs.ICustomTabsCallback.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.customtabs.ICustomTabsCallback
                if (r1 == 0) goto L13
                android.support.customtabs.ICustomTabsCallback r0 = (android.support.customtabs.ICustomTabsCallback) r0
                return r0
            L13:
                android.support.customtabs.ICustomTabsCallback$Stub$Proxy r0 = new android.support.customtabs.ICustomTabsCallback$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r10, android.os.Parcel r11, android.os.Parcel r12, int r13) throws android.os.RemoteException {
                r9 = this;
                java.lang.String r0 = android.support.customtabs.ICustomTabsCallback.Stub.DESCRIPTOR
                r1 = 1
                if (r10 < r1) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r10 > r2) goto Ld
                r11.enforceInterface(r0)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r10 != r2) goto L16
                r12.writeString(r0)
                return r1
            L16:
                switch(r10) {
                    case 2: goto Le7;
                    case 3: goto Ld7;
                    case 4: goto Lc8;
                    case 5: goto Lb5;
                    case 6: goto L94;
                    case 7: goto L7d;
                    case 8: goto L68;
                    case 9: goto L5b;
                    case 10: goto L38;
                    case 11: goto L2b;
                    case 12: goto L1e;
                    default: goto L19;
                }
            L19:
                boolean r10 = super.onTransact(r10, r11, r12, r13)
                return r10
            L1e:
                android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
                java.lang.Object r10 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r10)
                android.os.Bundle r10 = (android.os.Bundle) r10
                r9.onUnminimized(r10)
                goto Lf6
            L2b:
                android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
                java.lang.Object r10 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r10)
                android.os.Bundle r10 = (android.os.Bundle) r10
                r9.onMinimized(r10)
                goto Lf6
            L38:
                int r3 = r11.readInt()
                int r4 = r11.readInt()
                int r5 = r11.readInt()
                int r6 = r11.readInt()
                int r7 = r11.readInt()
                android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
                java.lang.Object r10 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r10)
                r8 = r10
                android.os.Bundle r8 = (android.os.Bundle) r8
                r2 = r9
                r2.onActivityLayout(r3, r4, r5, r6, r7, r8)
                goto Lf6
            L5b:
                android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
                java.lang.Object r10 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r10)
                android.os.Bundle r10 = (android.os.Bundle) r10
                r9.onWarmupCompleted(r10)
                goto Lf6
            L68:
                int r10 = r11.readInt()
                int r12 = r11.readInt()
                android.os.Parcelable$Creator r13 = android.os.Bundle.CREATOR
                java.lang.Object r11 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r13)
                android.os.Bundle r11 = (android.os.Bundle) r11
                r9.onActivityResized(r10, r12, r11)
                goto Lf6
            L7d:
                java.lang.String r10 = r11.readString()
                android.os.Parcelable$Creator r13 = android.os.Bundle.CREATOR
                java.lang.Object r11 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r13)
                android.os.Bundle r11 = (android.os.Bundle) r11
                android.os.Bundle r10 = r9.extraCallbackWithResult(r10, r11)
                r12.writeNoException()
                android.support.customtabs.ICustomTabsCallback._Parcel.access$100(r12, r10, r1)
                goto Lf6
            L94:
                int r10 = r11.readInt()
                android.os.Parcelable$Creator r12 = android.net.Uri.CREATOR
                java.lang.Object r12 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r12)
                android.net.Uri r12 = (android.net.Uri) r12
                int r13 = r11.readInt()
                if (r13 == 0) goto La8
                r13 = r1
                goto La9
            La8:
                r13 = 0
            La9:
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r11 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r0)
                android.os.Bundle r11 = (android.os.Bundle) r11
                r9.onRelationshipValidationResult(r10, r12, r13, r11)
                goto Lf6
            Lb5:
                java.lang.String r10 = r11.readString()
                android.os.Parcelable$Creator r13 = android.os.Bundle.CREATOR
                java.lang.Object r11 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r13)
                android.os.Bundle r11 = (android.os.Bundle) r11
                r9.onPostMessage(r10, r11)
                r12.writeNoException()
                goto Lf6
            Lc8:
                android.os.Parcelable$Creator r10 = android.os.Bundle.CREATOR
                java.lang.Object r10 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r10)
                android.os.Bundle r10 = (android.os.Bundle) r10
                r9.onMessageChannelReady(r10)
                r12.writeNoException()
                goto Lf6
            Ld7:
                java.lang.String r10 = r11.readString()
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r11 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r12)
                android.os.Bundle r11 = (android.os.Bundle) r11
                r9.extraCallback(r10, r11)
                goto Lf6
            Le7:
                int r10 = r11.readInt()
                android.os.Parcelable$Creator r12 = android.os.Bundle.CREATOR
                java.lang.Object r11 = android.support.customtabs.ICustomTabsCallback._Parcel.access$000(r11, r12)
                android.os.Bundle r11 = (android.os.Bundle) r11
                r9.onNavigationEvent(r10, r11)
            Lf6:
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
            java.lang.String r2 = "android$support$customtabs$ICustomTabsCallback"
            java.lang.String r0 = r2.replace(r0, r1)
            android.support.customtabs.ICustomTabsCallback.DESCRIPTOR = r0
            return
    }

    void extraCallback(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    android.os.Bundle extraCallbackWithResult(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onActivityLayout(int r1, int r2, int r3, int r4, int r5, android.os.Bundle r6) throws android.os.RemoteException;

    void onActivityResized(int r1, int r2, android.os.Bundle r3) throws android.os.RemoteException;

    void onMessageChannelReady(android.os.Bundle r1) throws android.os.RemoteException;

    void onMinimized(android.os.Bundle r1) throws android.os.RemoteException;

    void onNavigationEvent(int r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onPostMessage(java.lang.String r1, android.os.Bundle r2) throws android.os.RemoteException;

    void onRelationshipValidationResult(int r1, android.net.Uri r2, boolean r3, android.os.Bundle r4) throws android.os.RemoteException;

    void onUnminimized(android.os.Bundle r1) throws android.os.RemoteException;

    void onWarmupCompleted(android.os.Bundle r1) throws android.os.RemoteException;
}
