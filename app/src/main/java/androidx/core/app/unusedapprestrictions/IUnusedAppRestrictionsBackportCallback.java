package androidx.core.app.unusedapprestrictions;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = null;

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
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

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean r1, boolean r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
        static final int TRANSACTION_onIsPermissionRevocationEnabledForAppResult = 1;

        private static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
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
                    java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.Proxy.DESCRIPTOR
                    return r0
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean r3, boolean r4) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.Proxy.DESCRIPTOR     // Catch: java.lang.Throwable -> L1a
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1a
                    r1 = 1
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L1a
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1a
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L1a
                    r4 = 0
                    r3.transact(r1, r0, r4, r1)     // Catch: java.lang.Throwable -> L1a
                    r0.recycle()
                    return
                L1a:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.DESCRIPTOR
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.DESCRIPTOR
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
                if (r1 == 0) goto L13
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r0 = (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback) r0
                return r0
            L13:
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$Proxy r0 = new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$Proxy
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
                java.lang.String r0 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.DESCRIPTOR
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
                if (r4 == r1) goto L1d
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1d:
                int r4 = r5.readInt()
                r6 = 0
                if (r4 == 0) goto L26
                r4 = r1
                goto L27
            L26:
                r4 = r6
            L27:
                int r5 = r5.readInt()
                if (r5 == 0) goto L2e
                r6 = r1
            L2e:
                r3.onIsPermissionRevocationEnabledForAppResult(r4, r6)
                return r1
        }
    }

    static {
            r0 = 36
            r1 = 46
            java.lang.String r2 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback"
            java.lang.String r0 = r2.replace(r0, r1)
            androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.DESCRIPTOR = r0
            return
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean r1, boolean r2) throws android.os.RemoteException;
}
