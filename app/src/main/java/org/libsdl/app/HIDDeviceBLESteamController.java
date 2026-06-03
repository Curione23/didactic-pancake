package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
class HIDDeviceBLESteamController extends android.bluetooth.BluetoothGattCallback implements org.libsdl.app.HIDDevice {
    private static final int CHROMEBOOK_CONNECTION_CHECK_INTERVAL = 10000;
    private static final java.lang.String TAG = "hidapi";
    private static final int TRANSPORT_AUTO = 0;
    private static final int TRANSPORT_BREDR = 1;
    private static final int TRANSPORT_LE = 2;
    private static final byte[] enterValveMode = null;
    public static final java.util.UUID inputCharacteristic = null;
    public static final java.util.UUID reportCharacteristic = null;
    public static final java.util.UUID steamControllerService = null;
    org.libsdl.app.HIDDeviceBLESteamController.GattOperation mCurrentOperation;
    private android.bluetooth.BluetoothDevice mDevice;
    private int mDeviceId;
    private boolean mFrozen;
    private android.bluetooth.BluetoothGatt mGatt;
    private android.os.Handler mHandler;
    private boolean mIsChromebook;
    private boolean mIsConnected;
    private boolean mIsReconnecting;
    private boolean mIsRegistered;
    private org.libsdl.app.HIDDeviceManager mManager;
    private java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController.GattOperation> mOperations;




    static class GattOperation {
        android.bluetooth.BluetoothGatt mGatt;
        org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation mOp;
        boolean mResult;
        java.util.UUID mUuid;
        byte[] mValue;

        private enum Operation extends java.lang.Enum<org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation> {
            private static final /* synthetic */ org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation[] $VALUES = null;
            public static final org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation CHR_READ = null;
            public static final org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation CHR_WRITE = null;
            public static final org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation ENABLE_NOTIFICATION = null;

            private static /* synthetic */ org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation[] $values() {
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r0 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_READ
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_WRITE
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r2 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.ENABLE_NOTIFICATION
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation[] r0 = new org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation[]{r0, r1, r2}
                    return r0
            }

            static {
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r0 = new org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation
                    java.lang.String r1 = "CHR_READ"
                    r2 = 0
                    r0.<init>(r1, r2)
                    org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_READ = r0
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r0 = new org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation
                    java.lang.String r1 = "CHR_WRITE"
                    r2 = 1
                    r0.<init>(r1, r2)
                    org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_WRITE = r0
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r0 = new org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation
                    java.lang.String r1 = "ENABLE_NOTIFICATION"
                    r2 = 2
                    r0.<init>(r1, r2)
                    org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.ENABLE_NOTIFICATION = r0
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation[] r0 = $values()
                    org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.$VALUES = r0
                    return
            }

            Operation(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation valueOf(java.lang.String r1) {
                    java.lang.Class<org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation> r0 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = (org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation) r1
                    return r1
            }

            public static org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation[] values() {
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation[] r0 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.$VALUES
                    java.lang.Object r0 = r0.clone()
                    org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation[] r0 = (org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation[]) r0
                    return r0
            }
        }

        private GattOperation(android.bluetooth.BluetoothGatt r2, org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation r3, java.util.UUID r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mResult = r0
                r1.mGatt = r2
                r1.mOp = r3
                r1.mUuid = r4
                return
        }

        private GattOperation(android.bluetooth.BluetoothGatt r2, org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation r3, java.util.UUID r4, byte[] r5) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mResult = r0
                r1.mGatt = r2
                r1.mOp = r3
                r1.mUuid = r4
                r1.mValue = r5
                return
        }

        public static org.libsdl.app.HIDDeviceBLESteamController.GattOperation enableNotification(android.bluetooth.BluetoothGatt r2, java.util.UUID r3) {
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation r0 = new org.libsdl.app.HIDDeviceBLESteamController$GattOperation
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.ENABLE_NOTIFICATION
                r0.<init>(r2, r1, r3)
                return r0
        }

        private android.bluetooth.BluetoothGattCharacteristic getCharacteristic(java.util.UUID r3) {
                r2 = this;
                android.bluetooth.BluetoothGatt r0 = r2.mGatt
                java.util.UUID r1 = org.libsdl.app.HIDDeviceBLESteamController.steamControllerService
                android.bluetooth.BluetoothGattService r0 = r0.getService(r1)
                if (r0 != 0) goto Lc
                r3 = 0
                return r3
            Lc:
                android.bluetooth.BluetoothGattCharacteristic r3 = r0.getCharacteristic(r3)
                return r3
        }

        public static org.libsdl.app.HIDDeviceBLESteamController.GattOperation readCharacteristic(android.bluetooth.BluetoothGatt r2, java.util.UUID r3) {
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation r0 = new org.libsdl.app.HIDDeviceBLESteamController$GattOperation
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_READ
                r0.<init>(r2, r1, r3)
                return r0
        }

        public static org.libsdl.app.HIDDeviceBLESteamController.GattOperation writeCharacteristic(android.bluetooth.BluetoothGatt r2, java.util.UUID r3, byte[] r4) {
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation r0 = new org.libsdl.app.HIDDeviceBLESteamController$GattOperation
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r1 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.Operation.CHR_WRITE
                r0.<init>(r2, r1, r3, r4)
                return r0
        }

        public boolean finish() {
                r1 = this;
                boolean r0 = r1.mResult
                return r0
        }

        public void run() {
                r8 = this;
                org.libsdl.app.HIDDeviceBLESteamController$GattOperation$Operation r0 = r8.mOp
                int r0 = r0.ordinal()
                r1 = 0
                java.lang.String r2 = "hidapi"
                r3 = 1
                if (r0 == 0) goto La2
                if (r0 == r3) goto L71
                r4 = 2
                if (r0 == r4) goto L13
                goto Lcd
            L13:
                java.util.UUID r0 = r8.mUuid
                android.bluetooth.BluetoothGattCharacteristic r0 = r8.getCharacteristic(r0)
                if (r0 == 0) goto Lcd
                java.lang.String r4 = "00002902-0000-1000-8000-00805f9b34fb"
                java.util.UUID r4 = java.util.UUID.fromString(r4)
                android.bluetooth.BluetoothGattDescriptor r4 = r0.getDescriptor(r4)
                if (r4 == 0) goto Lcd
                int r5 = r0.getProperties()
                r6 = r5 & 16
                r7 = 16
                if (r6 != r7) goto L34
                byte[] r5 = android.bluetooth.BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE
                goto L3b
            L34:
                r6 = 32
                r5 = r5 & r6
                if (r5 != r6) goto L69
                byte[] r5 = android.bluetooth.BluetoothGattDescriptor.ENABLE_INDICATION_VALUE
            L3b:
                android.bluetooth.BluetoothGatt r6 = r8.mGatt
                r6.setCharacteristicNotification(r0, r3)
                r4.setValue(r5)
                android.bluetooth.BluetoothGatt r0 = r8.mGatt
                boolean r0 = r0.writeDescriptor(r4)
                if (r0 != 0) goto L66
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to write descriptor "
                r0.<init>(r3)
                java.util.UUID r3 = r8.mUuid
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r2, r0)
                r8.mResult = r1
                return
            L66:
                r8.mResult = r3
                goto Lcd
            L69:
                java.lang.String r0 = "Unable to start notifications on input characteristic"
                android.util.Log.e(r2, r0)
                r8.mResult = r1
                return
            L71:
                java.util.UUID r0 = r8.mUuid
                android.bluetooth.BluetoothGattCharacteristic r0 = r8.getCharacteristic(r0)
                byte[] r4 = r8.mValue
                r0.setValue(r4)
                android.bluetooth.BluetoothGatt r4 = r8.mGatt
                boolean r0 = r4.writeCharacteristic(r0)
                if (r0 != 0) goto L9f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to write characteristic "
                r0.<init>(r3)
                java.util.UUID r3 = r8.mUuid
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r2, r0)
                r8.mResult = r1
                goto Lcd
            L9f:
                r8.mResult = r3
                goto Lcd
            La2:
                java.util.UUID r0 = r8.mUuid
                android.bluetooth.BluetoothGattCharacteristic r0 = r8.getCharacteristic(r0)
                android.bluetooth.BluetoothGatt r4 = r8.mGatt
                boolean r0 = r4.readCharacteristic(r0)
                if (r0 != 0) goto Lcb
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r3 = "Unable to read characteristic "
                r0.<init>(r3)
                java.util.UUID r3 = r8.mUuid
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r0 = r0.append(r3)
                java.lang.String r0 = r0.toString()
                android.util.Log.e(r2, r0)
                r8.mResult = r1
                goto Lcd
            Lcb:
                r8.mResult = r3
            Lcd:
                return
        }
    }

    /* JADX INFO: renamed from: -$$Nest$fgetmGatt, reason: not valid java name */
    static /* bridge */ /* synthetic */ android.bluetooth.BluetoothGatt m2685$$Nest$fgetmGatt(org.libsdl.app.HIDDeviceBLESteamController r0) {
            android.bluetooth.BluetoothGatt r0 = r0.mGatt
            return r0
    }

    /* JADX INFO: renamed from: -$$Nest$fgetmOperations, reason: not valid java name */
    static /* bridge */ /* synthetic */ java.util.LinkedList m2686$$Nest$fgetmOperations(org.libsdl.app.HIDDeviceBLESteamController r0) {
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r0 = r0.mOperations
            return r0
    }

    static {
            java.lang.String r0 = "100F6C32-1735-4313-B402-38567131E5F3"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            org.libsdl.app.HIDDeviceBLESteamController.steamControllerService = r0
            java.lang.String r0 = "100F6C33-1735-4313-B402-38567131E5F3"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            org.libsdl.app.HIDDeviceBLESteamController.inputCharacteristic = r0
            java.lang.String r0 = "100F6C34-1735-4313-B402-38567131E5F3"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            org.libsdl.app.HIDDeviceBLESteamController.reportCharacteristic = r0
            r0 = 6
            byte[] r0 = new byte[r0]
            r0 = {x0022: FILL_ARRAY_DATA , data: [-64, -121, 3, 8, 7, 0} // fill-array
            org.libsdl.app.HIDDeviceBLESteamController.enterValveMode = r0
            return
    }

    public HIDDeviceBLESteamController(org.libsdl.app.HIDDeviceManager r3, android.bluetooth.BluetoothDevice r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mIsRegistered = r0
            r2.mIsConnected = r0
            r2.mIsChromebook = r0
            r2.mIsReconnecting = r0
            r2.mFrozen = r0
            r1 = 0
            r2.mCurrentOperation = r1
            r2.mManager = r3
            r2.mDevice = r4
            java.lang.String r4 = r2.getIdentifier()
            int r3 = r3.getDeviceIDForIdentifier(r4)
            r2.mDeviceId = r3
            r2.mIsRegistered = r0
            org.libsdl.app.HIDDeviceManager r3 = r2.mManager
            android.content.Context r3 = r3.getContext()
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r4 = "org.chromium.arc.device_management"
            boolean r3 = r3.hasSystemFeature(r4)
            r2.mIsChromebook = r3
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            r2.mOperations = r3
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r3.<init>(r4)
            r2.mHandler = r3
            android.bluetooth.BluetoothGatt r3 = r2.connectGatt()
            r2.mGatt = r3
            return
    }

    private android.bluetooth.BluetoothGatt connectGatt() {
            r1 = this;
            r0 = 0
            android.bluetooth.BluetoothGatt r0 = r1.connectGatt(r0)
            return r0
    }

    private android.bluetooth.BluetoothGatt connectGatt(boolean r4) {
            r3 = this;
            android.bluetooth.BluetoothDevice r0 = r3.mDevice     // Catch: java.lang.Exception -> Le
            org.libsdl.app.HIDDeviceManager r1 = r3.mManager     // Catch: java.lang.Exception -> Le
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Exception -> Le
            r2 = 2
            android.bluetooth.BluetoothGatt r4 = r0.connectGatt(r1, r4, r3, r2)     // Catch: java.lang.Exception -> Le
            return r4
        Le:
            android.bluetooth.BluetoothDevice r0 = r3.mDevice
            org.libsdl.app.HIDDeviceManager r1 = r3.mManager
            android.content.Context r1 = r1.getContext()
            android.bluetooth.BluetoothGatt r4 = r0.connectGatt(r1, r4, r3)
            return r4
    }

    private void enableNotification(java.util.UUID r2) {
            r1 = this;
            android.bluetooth.BluetoothGatt r0 = r1.mGatt
            org.libsdl.app.HIDDeviceBLESteamController$GattOperation r2 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.enableNotification(r0, r2)
            r1.queueGattOperation(r2)
            return
    }

    private void executeNextGattOperation() {
            r2 = this;
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r0 = r2.mOperations
            monitor-enter(r0)
            org.libsdl.app.HIDDeviceBLESteamController$GattOperation r1 = r2.mCurrentOperation     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L9:
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r1 = r2.mOperations     // Catch: java.lang.Throwable -> L29
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            return
        L13:
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r1 = r2.mOperations     // Catch: java.lang.Throwable -> L29
            java.lang.Object r1 = r1.removeFirst()     // Catch: java.lang.Throwable -> L29
            org.libsdl.app.HIDDeviceBLESteamController$GattOperation r1 = (org.libsdl.app.HIDDeviceBLESteamController.GattOperation) r1     // Catch: java.lang.Throwable -> L29
            r2.mCurrentOperation = r1     // Catch: java.lang.Throwable -> L29
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            android.os.Handler r0 = r2.mHandler
            org.libsdl.app.HIDDeviceBLESteamController$2 r1 = new org.libsdl.app.HIDDeviceBLESteamController$2
            r1.<init>(r2)
            r0.post(r1)
            return
        L29:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
            throw r1
    }

    private void finishCurrentGattOperation() {
            r3 = this;
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r0 = r3.mOperations
            monitor-enter(r0)
            org.libsdl.app.HIDDeviceBLESteamController$GattOperation r1 = r3.mCurrentOperation     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            if (r1 == 0) goto Lb
            r3.mCurrentOperation = r2     // Catch: java.lang.Throwable -> L1e
            goto Lc
        Lb:
            r1 = r2
        Lc:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L1a
            boolean r0 = r1.finish()
            if (r0 != 0) goto L1a
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r0 = r3.mOperations
            r0.addFirst(r1)
        L1a:
            r3.executeNextGattOperation()
            return
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    private boolean isRegistered() {
            r1 = this;
            boolean r0 = r1.mIsRegistered
            return r0
    }

    private boolean probeService(org.libsdl.app.HIDDeviceBLESteamController r7) {
            r6 = this;
            boolean r0 = r6.isRegistered()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r6.mIsConnected
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "probeService controller="
            r0.<init>(r3)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "hidapi"
            android.util.Log.v(r0, r7)
            android.bluetooth.BluetoothGatt r7 = r6.mGatt
            java.util.List r7 = r7.getServices()
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L94
            java.lang.Object r3 = r7.next()
            android.bluetooth.BluetoothGattService r3 = (android.bluetooth.BluetoothGattService) r3
            java.util.UUID r4 = r3.getUuid()
            java.util.UUID r5 = org.libsdl.app.HIDDeviceBLESteamController.steamControllerService
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L2c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Found Valve steam controller service "
            r7.<init>(r2)
            java.util.UUID r2 = r3.getUuid()
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.String r7 = r7.toString()
            android.util.Log.v(r0, r7)
            java.util.List r7 = r3.getCharacteristics()
            java.util.Iterator r7 = r7.iterator()
        L62:
            boolean r2 = r7.hasNext()
            if (r2 == 0) goto L93
            java.lang.Object r2 = r7.next()
            android.bluetooth.BluetoothGattCharacteristic r2 = (android.bluetooth.BluetoothGattCharacteristic) r2
            java.util.UUID r3 = r2.getUuid()
            java.util.UUID r4 = org.libsdl.app.HIDDeviceBLESteamController.inputCharacteristic
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L62
            java.lang.String r3 = "Found input characteristic"
            android.util.Log.v(r0, r3)
            java.lang.String r3 = "00002902-0000-1000-8000-00805f9b34fb"
            java.util.UUID r3 = java.util.UUID.fromString(r3)
            android.bluetooth.BluetoothGattDescriptor r3 = r2.getDescriptor(r3)
            if (r3 == 0) goto L62
            java.util.UUID r2 = r2.getUuid()
            r6.enableNotification(r2)
            goto L62
        L93:
            return r1
        L94:
            android.bluetooth.BluetoothGatt r7 = r6.mGatt
            java.util.List r7 = r7.getServices()
            int r7 = r7.size()
            if (r7 != 0) goto Lbc
            boolean r7 = r6.mIsChromebook
            if (r7 == 0) goto Lbc
            boolean r7 = r6.mIsReconnecting
            if (r7 != 0) goto Lbc
            java.lang.String r7 = "Chromebook: Discovered services were empty; this almost certainly means the BtGatt.ContextMap bug has bitten us."
            android.util.Log.e(r0, r7)
            r6.mIsConnected = r2
            r6.mIsReconnecting = r1
            android.bluetooth.BluetoothGatt r7 = r6.mGatt
            r7.disconnect()
            android.bluetooth.BluetoothGatt r7 = r6.connectGatt(r2)
            r6.mGatt = r7
        Lbc:
            return r2
    }

    private void queueGattOperation(org.libsdl.app.HIDDeviceBLESteamController.GattOperation r3) {
            r2 = this;
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r0 = r2.mOperations
            monitor-enter(r0)
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r1 = r2.mOperations     // Catch: java.lang.Throwable -> Ld
            r1.add(r3)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r2.executeNextGattOperation()
            return
        Ld:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r3
    }

    private void setRegistered() {
            r1 = this;
            r0 = 1
            r1.mIsRegistered = r0
            return
    }

    protected void checkConnectionForChromebookIssue() {
            r5 = this;
            boolean r0 = r5.mIsChromebook
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r5.getConnectionState()
            r1 = 0
            r2 = 1
            java.lang.String r3 = "hidapi"
            if (r0 == 0) goto L66
            if (r0 == r2) goto L60
            r4 = 2
            if (r0 == r4) goto L15
            goto L78
        L15:
            boolean r0 = r5.mIsConnected
            if (r0 != 0) goto L2c
            java.lang.String r0 = "Chromebook: We are in a very bad state; the controller shows as connected in the underlying Bluetooth layer, but we never received a callback.  Forcing a reconnect."
            android.util.Log.v(r3, r0)
            r5.mIsReconnecting = r2
            android.bluetooth.BluetoothGatt r0 = r5.mGatt
            r0.disconnect()
            android.bluetooth.BluetoothGatt r0 = r5.connectGatt(r1)
            r5.mGatt = r0
            goto L78
        L2c:
            boolean r0 = r5.isRegistered()
            if (r0 != 0) goto L5a
            android.bluetooth.BluetoothGatt r0 = r5.mGatt
            java.util.List r0 = r0.getServices()
            int r0 = r0.size()
            if (r0 <= 0) goto L47
            java.lang.String r0 = "Chromebook: We are connected to a controller, but never got our registration.  Trying to recover."
            android.util.Log.v(r3, r0)
            r5.probeService(r5)
            goto L78
        L47:
            java.lang.String r0 = "Chromebook: We are connected to a controller, but never discovered services.  Trying to recover."
            android.util.Log.v(r3, r0)
            r5.mIsReconnecting = r2
            android.bluetooth.BluetoothGatt r0 = r5.mGatt
            r0.disconnect()
            android.bluetooth.BluetoothGatt r0 = r5.connectGatt(r1)
            r5.mGatt = r0
            goto L78
        L5a:
            java.lang.String r0 = "Chromebook: We are connected, and registered.  Everything's good!"
            android.util.Log.v(r3, r0)
            return
        L60:
            java.lang.String r0 = "Chromebook: We're still trying to connect.  Waiting a bit longer."
            android.util.Log.v(r3, r0)
            goto L78
        L66:
            java.lang.String r0 = "Chromebook: We have either been disconnected, or the Chromebook BtGatt.ContextMap bug has bitten us.  Attempting a disconnect/reconnect, but we may not be able to recover."
            android.util.Log.v(r3, r0)
            r5.mIsReconnecting = r2
            android.bluetooth.BluetoothGatt r0 = r5.mGatt
            r0.disconnect()
            android.bluetooth.BluetoothGatt r0 = r5.connectGatt(r1)
            r5.mGatt = r0
        L78:
            android.os.Handler r0 = r5.mHandler
            org.libsdl.app.HIDDeviceBLESteamController$1 r1 = new org.libsdl.app.HIDDeviceBLESteamController$1
            r1.<init>(r5, r5)
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public void close() {
            r0 = this;
            return
    }

    protected int getConnectionState() {
            r3 = this;
            org.libsdl.app.HIDDeviceManager r0 = r3.mManager
            android.content.Context r0 = r0.getContext()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            java.lang.String r2 = "bluetooth"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            if (r0 != 0) goto L15
            return r1
        L15:
            android.bluetooth.BluetoothDevice r1 = r3.mDevice
            r2 = 7
            int r0 = r0.getConnectionState(r1, r2)
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public android.hardware.usb.UsbDevice getDevice() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.bluetooth.BluetoothGatt getGatt() {
            r1 = this;
            android.bluetooth.BluetoothGatt r0 = r1.mGatt
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getId() {
            r1 = this;
            int r0 = r1.mDeviceId
            return r0
    }

    public java.lang.String getIdentifier() {
            r2 = this;
            android.bluetooth.BluetoothDevice r0 = r2.mDevice
            java.lang.String r0 = r0.getAddress()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "SteamController.%s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public java.lang.String getManufacturerName() {
            r1 = this;
            java.lang.String r0 = "Valve Corporation"
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getProductId() {
            r1 = this;
            r0 = 4358(0x1106, float:6.107E-42)
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public java.lang.String getProductName() {
            r1 = this;
            java.lang.String r0 = "Steam Controller"
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public java.lang.String getSerialNumber() {
            r1 = this;
            java.lang.String r0 = "12345"
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVendorId() {
            r1 = this;
            r0 = 10462(0x28de, float:1.466E-41)
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicChanged(android.bluetooth.BluetoothGatt r2, android.bluetooth.BluetoothGattCharacteristic r3) {
            r1 = this;
            java.util.UUID r2 = r3.getUuid()
            java.util.UUID r0 = org.libsdl.app.HIDDeviceBLESteamController.inputCharacteristic
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L1d
            boolean r2 = r1.mFrozen
            if (r2 != 0) goto L1d
            org.libsdl.app.HIDDeviceManager r2 = r1.mManager
            int r0 = r1.getId()
            byte[] r3 = r3.getValue()
            r2.HIDDeviceInputReport(r0, r3)
        L1d:
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicRead(android.bluetooth.BluetoothGatt r1, android.bluetooth.BluetoothGattCharacteristic r2, int r3) {
            r0 = this;
            java.util.UUID r1 = r2.getUuid()
            java.util.UUID r3 = org.libsdl.app.HIDDeviceBLESteamController.reportCharacteristic
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L1d
            boolean r1 = r0.mFrozen
            if (r1 != 0) goto L1d
            org.libsdl.app.HIDDeviceManager r1 = r0.mManager
            int r3 = r0.getId()
            byte[] r2 = r2.getValue()
            r1.HIDDeviceReportResponse(r3, r2)
        L1d:
            r0.finishCurrentGattOperation()
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onCharacteristicWrite(android.bluetooth.BluetoothGatt r16, android.bluetooth.BluetoothGattCharacteristic r17, int r18) {
            r15 = this;
            java.util.UUID r0 = r17.getUuid()
            java.util.UUID r1 = org.libsdl.app.HIDDeviceBLESteamController.reportCharacteristic
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L59
            boolean r0 = r15.isRegistered()
            if (r0 != 0) goto L59
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Registering Steam Controller with ID: "
            r0.<init>(r1)
            int r1 = r15.getId()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hidapi"
            android.util.Log.v(r1, r0)
            r0 = r15
            org.libsdl.app.HIDDeviceManager r1 = r0.mManager
            int r2 = r15.getId()
            java.lang.String r3 = r15.getIdentifier()
            int r4 = r15.getVendorId()
            int r5 = r15.getProductId()
            java.lang.String r6 = r15.getSerialNumber()
            int r7 = r15.getVersion()
            java.lang.String r8 = r15.getManufacturerName()
            java.lang.String r9 = r15.getProductName()
            r13 = 0
            r14 = 1
            r10 = 0
            r11 = 0
            r12 = 0
            r1.HIDDeviceConnected(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.setRegistered()
            goto L5a
        L59:
            r0 = r15
        L5a:
            r15.finishCurrentGattOperation()
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onConnectionStateChange(android.bluetooth.BluetoothGatt r1, int r2, int r3) {
            r0 = this;
            r1 = 0
            r0.mIsReconnecting = r1
            r2 = 2
            if (r3 != r2) goto L1a
            r1 = 1
            r0.mIsConnected = r1
            boolean r1 = r0.isRegistered()
            if (r1 != 0) goto L1e
            android.os.Handler r1 = r0.mHandler
            org.libsdl.app.HIDDeviceBLESteamController$3 r2 = new org.libsdl.app.HIDDeviceBLESteamController$3
            r2.<init>(r0)
            r1.post(r2)
            goto L1e
        L1a:
            if (r3 != 0) goto L1e
            r0.mIsConnected = r1
        L1e:
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorRead(android.bluetooth.BluetoothGatt r1, android.bluetooth.BluetoothGattDescriptor r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onDescriptorWrite(android.bluetooth.BluetoothGatt r2, android.bluetooth.BluetoothGattDescriptor r3, int r4) {
            r1 = this;
            android.bluetooth.BluetoothGattCharacteristic r3 = r3.getCharacteristic()
            java.util.UUID r4 = r3.getUuid()
            java.util.UUID r0 = org.libsdl.app.HIDDeviceBLESteamController.inputCharacteristic
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L2b
            android.bluetooth.BluetoothGattService r3 = r3.getService()
            java.util.UUID r4 = org.libsdl.app.HIDDeviceBLESteamController.reportCharacteristic
            android.bluetooth.BluetoothGattCharacteristic r3 = r3.getCharacteristic(r4)
            if (r3 == 0) goto L2b
            java.lang.String r4 = "hidapi"
            java.lang.String r0 = "Writing report characteristic to enter valve mode"
            android.util.Log.v(r4, r0)
            byte[] r4 = org.libsdl.app.HIDDeviceBLESteamController.enterValveMode
            r3.setValue(r4)
            r2.writeCharacteristic(r3)
        L2b:
            r1.finishCurrentGattOperation()
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onMtuChanged(android.bluetooth.BluetoothGatt r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReadRemoteRssi(android.bluetooth.BluetoothGatt r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onReliableWriteCompleted(android.bluetooth.BluetoothGatt r1, int r2) {
            r0 = this;
            return
    }

    @Override // android.bluetooth.BluetoothGattCallback
    public void onServicesDiscovered(android.bluetooth.BluetoothGatt r2, int r3) {
            r1 = this;
            if (r3 != 0) goto L26
            java.util.List r3 = r2.getServices()
            int r3 = r3.size()
            if (r3 != 0) goto L23
            java.lang.String r3 = "hidapi"
            java.lang.String r0 = "onServicesDiscovered returned zero services; something has gone horribly wrong down in Android's Bluetooth stack."
            android.util.Log.v(r3, r0)
            r3 = 1
            r1.mIsReconnecting = r3
            r3 = 0
            r1.mIsConnected = r3
            r2.disconnect()
            android.bluetooth.BluetoothGatt r2 = r1.connectGatt(r3)
            r1.mGatt = r2
            goto L26
        L23:
            r1.probeService(r1)
        L26:
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean open() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void readCharacteristic(java.util.UUID r2) {
            r1 = this;
            android.bluetooth.BluetoothGatt r0 = r1.mGatt
            org.libsdl.app.HIDDeviceBLESteamController$GattOperation r2 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.readCharacteristic(r0, r2)
            r1.queueGattOperation(r2)
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean readReport(byte[] r2, boolean r3) {
            r1 = this;
            boolean r2 = r1.isRegistered()
            r0 = 0
            if (r2 != 0) goto L16
            java.lang.String r2 = "hidapi"
            java.lang.String r3 = "Attempted readReport before Steam Controller is registered!"
            android.util.Log.e(r2, r3)
            boolean r2 = r1.mIsConnected
            if (r2 == 0) goto L15
            r1.probeService(r1)
        L15:
            return r0
        L16:
            if (r3 == 0) goto L1f
            java.util.UUID r2 = org.libsdl.app.HIDDeviceBLESteamController.reportCharacteristic
            r1.readCharacteristic(r2)
            r2 = 1
            return r2
        L1f:
            return r0
    }

    public void reconnect() {
            r2 = this;
            int r0 = r2.getConnectionState()
            r1 = 2
            if (r0 == r1) goto L12
            android.bluetooth.BluetoothGatt r0 = r2.mGatt
            r0.disconnect()
            android.bluetooth.BluetoothGatt r0 = r2.connectGatt()
            r2.mGatt = r0
        L12:
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public void setFrozen(boolean r1) {
            r0 = this;
            r0.mFrozen = r1
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public void shutdown() {
            r2 = this;
            r2.close()
            android.bluetooth.BluetoothGatt r0 = r2.mGatt
            r1 = 0
            if (r0 == 0) goto L10
            r0.disconnect()
            r0.close()
            r2.mGatt = r1
        L10:
            r2.mManager = r1
            r0 = 0
            r2.mIsRegistered = r0
            r2.mIsConnected = r0
            java.util.LinkedList<org.libsdl.app.HIDDeviceBLESteamController$GattOperation> r0 = r2.mOperations
            r0.clear()
            return
    }

    public void writeCharacteristic(java.util.UUID r2, byte[] r3) {
            r1 = this;
            android.bluetooth.BluetoothGatt r0 = r1.mGatt
            org.libsdl.app.HIDDeviceBLESteamController$GattOperation r2 = org.libsdl.app.HIDDeviceBLESteamController.GattOperation.writeCharacteristic(r0, r2, r3)
            r1.queueGattOperation(r2)
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public int writeReport(byte[] r2, boolean r3) {
            r1 = this;
            boolean r0 = r1.isRegistered()
            if (r0 != 0) goto L16
            java.lang.String r2 = "hidapi"
            java.lang.String r3 = "Attempted writeReport before Steam Controller is registered!"
            android.util.Log.e(r2, r3)
            boolean r2 = r1.mIsConnected
            if (r2 == 0) goto L14
            r1.probeService(r1)
        L14:
            r2 = -1
            return r2
        L16:
            if (r3 == 0) goto L26
            int r3 = r2.length
            r0 = 1
            int r3 = r3 - r0
            byte[] r3 = java.util.Arrays.copyOfRange(r2, r0, r3)
            java.util.UUID r0 = org.libsdl.app.HIDDeviceBLESteamController.reportCharacteristic
            r1.writeCharacteristic(r0, r3)
            int r2 = r2.length
            return r2
        L26:
            java.util.UUID r3 = org.libsdl.app.HIDDeviceBLESteamController.reportCharacteristic
            r1.writeCharacteristic(r3, r2)
            int r2 = r2.length
            return r2
    }
}
