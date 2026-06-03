package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
public class HIDDeviceManager {
    private static final java.lang.String ACTION_USB_PERMISSION = "org.libsdl.app.USB_PERMISSION";
    private static final java.lang.String TAG = "hidapi";
    private static org.libsdl.app.HIDDeviceManager sManager;
    private static int sManagerRefCount;
    private final android.content.BroadcastReceiver mBluetoothBroadcast;
    private java.util.HashMap<android.bluetooth.BluetoothDevice, org.libsdl.app.HIDDeviceBLESteamController> mBluetoothDevices;
    private android.bluetooth.BluetoothManager mBluetoothManager;
    private android.content.Context mContext;
    private java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> mDevicesById;
    private android.os.Handler mHandler;
    private boolean mIsChromebook;
    private java.util.List<android.bluetooth.BluetoothDevice> mLastBluetoothDevices;
    private int mNextDeviceId;
    private android.content.SharedPreferences mSharedPreferences;
    private final android.content.BroadcastReceiver mUsbBroadcast;
    private android.hardware.usb.UsbManager mUsbManager;




    /* JADX INFO: renamed from: -$$Nest$mhandleUsbDeviceAttached, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2687$$Nest$mhandleUsbDeviceAttached(org.libsdl.app.HIDDeviceManager r0, android.hardware.usb.UsbDevice r1) {
            r0.handleUsbDeviceAttached(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mhandleUsbDeviceDetached, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2688$$Nest$mhandleUsbDeviceDetached(org.libsdl.app.HIDDeviceManager r0, android.hardware.usb.UsbDevice r1) {
            r0.handleUsbDeviceDetached(r1)
            return
    }

    /* JADX INFO: renamed from: -$$Nest$mhandleUsbDevicePermission, reason: not valid java name */
    static /* bridge */ /* synthetic */ void m2689$$Nest$mhandleUsbDevicePermission(org.libsdl.app.HIDDeviceManager r0, android.hardware.usb.UsbDevice r1, boolean r2) {
            r0.handleUsbDevicePermission(r1, r2)
            return
    }

    static {
            return
    }

    private HIDDeviceManager(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mDevicesById = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.mBluetoothDevices = r0
            r0 = 0
            r2.mNextDeviceId = r0
            r1 = 0
            r2.mSharedPreferences = r1
            r2.mIsChromebook = r0
            org.libsdl.app.HIDDeviceManager$1 r1 = new org.libsdl.app.HIDDeviceManager$1
            r1.<init>(r2)
            r2.mUsbBroadcast = r1
            org.libsdl.app.HIDDeviceManager$2 r1 = new org.libsdl.app.HIDDeviceManager$2
            r1.<init>(r2)
            r2.mBluetoothBroadcast = r1
            r2.mContext = r3
            r2.HIDDeviceRegisterCallback()
            android.content.Context r3 = r2.mContext
            java.lang.String r1 = "hidapi"
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r1, r0)
            r2.mSharedPreferences = r3
            android.content.Context r3 = r2.mContext
            android.content.pm.PackageManager r3 = r3.getPackageManager()
            java.lang.String r1 = "org.chromium.arc.device_management"
            boolean r3 = r3.hasSystemFeature(r1)
            r2.mIsChromebook = r3
            android.content.SharedPreferences r3 = r2.mSharedPreferences
            java.lang.String r1 = "next_device_id"
            int r3 = r3.getInt(r1, r0)
            r2.mNextDeviceId = r3
            return
    }

    private native void HIDDeviceRegisterCallback();

    private native void HIDDeviceReleaseCallback();

    public static org.libsdl.app.HIDDeviceManager acquire(android.content.Context r1) {
            int r0 = org.libsdl.app.HIDDeviceManager.sManagerRefCount
            if (r0 != 0) goto Lb
            org.libsdl.app.HIDDeviceManager r0 = new org.libsdl.app.HIDDeviceManager
            r0.<init>(r1)
            org.libsdl.app.HIDDeviceManager.sManager = r0
        Lb:
            int r1 = org.libsdl.app.HIDDeviceManager.sManagerRefCount
            int r1 = r1 + 1
            org.libsdl.app.HIDDeviceManager.sManagerRefCount = r1
            org.libsdl.app.HIDDeviceManager r1 = org.libsdl.app.HIDDeviceManager.sManager
            return r1
    }

    private void close() {
            r2 = this;
            r2.shutdownUSB()
            r2.shutdownBluetooth()
            monitor-enter(r2)
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r0 = r2.mDevicesById     // Catch: java.lang.Throwable -> L30
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L30
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L30
        L11:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L30
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L30
            org.libsdl.app.HIDDevice r1 = (org.libsdl.app.HIDDevice) r1     // Catch: java.lang.Throwable -> L30
            r1.shutdown()     // Catch: java.lang.Throwable -> L30
            goto L11
        L21:
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r0 = r2.mDevicesById     // Catch: java.lang.Throwable -> L30
            r0.clear()     // Catch: java.lang.Throwable -> L30
            java.util.HashMap<android.bluetooth.BluetoothDevice, org.libsdl.app.HIDDeviceBLESteamController> r0 = r2.mBluetoothDevices     // Catch: java.lang.Throwable -> L30
            r0.clear()     // Catch: java.lang.Throwable -> L30
            r2.HIDDeviceReleaseCallback()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            return
        L30:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L30
            throw r0
    }

    private void connectHIDDeviceUSB(android.hardware.usb.UsbDevice r20) {
            r19 = this;
            r15 = r19
            r0 = r20
            monitor-enter(r19)
            r1 = 0
            r14 = r1
        L7:
            int r2 = r20.getInterfaceCount()     // Catch: java.lang.Throwable -> L85
            if (r14 >= r2) goto L83
            android.hardware.usb.UsbInterface r2 = r0.getInterface(r14)     // Catch: java.lang.Throwable -> L85
            boolean r3 = r15.isHIDDeviceInterface(r0, r2)     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L7e
            int r3 = r2.getId()     // Catch: java.lang.Throwable -> L85
            r4 = 1
            int r3 = r4 << r3
            r4 = r1 & r3
            if (r4 == 0) goto L23
            goto L7e
        L23:
            r16 = r1 | r3
            org.libsdl.app.HIDDeviceUSB r1 = new org.libsdl.app.HIDDeviceUSB     // Catch: java.lang.Throwable -> L85
            r1.<init>(r15, r0, r14)     // Catch: java.lang.Throwable -> L85
            int r3 = r1.getId()     // Catch: java.lang.Throwable -> L85
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r4 = r15.mDevicesById     // Catch: java.lang.Throwable -> L85
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L85
            r4.put(r5, r1)     // Catch: java.lang.Throwable -> L85
            java.lang.String r4 = r1.getIdentifier()     // Catch: java.lang.Throwable -> L85
            int r5 = r1.getVendorId()     // Catch: java.lang.Throwable -> L85
            int r6 = r1.getProductId()     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r1.getSerialNumber()     // Catch: java.lang.Throwable -> L85
            int r8 = r1.getVersion()     // Catch: java.lang.Throwable -> L85
            java.lang.String r9 = r1.getManufacturerName()     // Catch: java.lang.Throwable -> L85
            java.lang.String r10 = r1.getProductName()     // Catch: java.lang.Throwable -> L85
            int r11 = r2.getId()     // Catch: java.lang.Throwable -> L85
            int r12 = r2.getInterfaceClass()     // Catch: java.lang.Throwable -> L85
            int r13 = r2.getInterfaceSubclass()     // Catch: java.lang.Throwable -> L85
            int r17 = r2.getInterfaceProtocol()     // Catch: java.lang.Throwable -> L85
            r18 = 0
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            r1.HIDDeviceConnected(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L85
            r1 = r16
            goto L80
        L7e:
            r17 = r14
        L80:
            int r14 = r17 + 1
            goto L7
        L83:
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L85
            return
        L85:
            r0 = move-exception
            monitor-exit(r19)     // Catch: java.lang.Throwable -> L85
            throw r0
    }

    private org.libsdl.app.HIDDevice getDevice(int r6) {
            r5 = this;
            java.lang.String r0 = "Available devices: "
            java.lang.String r1 = "No device for id: "
            monitor-enter(r5)
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r2 = r5.mDevicesById     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> L3f
            org.libsdl.app.HIDDevice r2 = (org.libsdl.app.HIDDevice) r2     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L3d
            java.lang.String r3 = "hidapi"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r6 = r4.append(r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.v(r3, r6)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r6 = "hidapi"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r0 = r5.mDevicesById     // Catch: java.lang.Throwable -> L3f
            java.util.Set r0 = r0.keySet()     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3f
            android.util.Log.v(r6, r0)     // Catch: java.lang.Throwable -> L3f
        L3d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            return r2
        L3f:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3f
            throw r6
    }

    private void handleUsbDeviceAttached(android.hardware.usb.UsbDevice r1) {
            r0 = this;
            r0.connectHIDDeviceUSB(r1)
            return
    }

    private void handleUsbDeviceDetached(android.hardware.usb.UsbDevice r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r1 = r4.mDevicesById
            java.util.Collection r1 = r1.values()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r1.next()
            org.libsdl.app.HIDDevice r2 = (org.libsdl.app.HIDDevice) r2
            android.hardware.usb.UsbDevice r3 = r2.getDevice()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto Lf
            int r2 = r2.getId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.add(r2)
            goto Lf
        L31:
            java.util.Iterator r5 = r0.iterator()
        L35:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L61
            java.lang.Object r0 = r5.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r1 = r4.mDevicesById
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.get(r2)
            org.libsdl.app.HIDDevice r1 = (org.libsdl.app.HIDDevice) r1
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r2 = r4.mDevicesById
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2.remove(r3)
            r1.shutdown()
            r4.HIDDeviceDisconnected(r0)
            goto L35
        L61:
            return
    }

    private void handleUsbDevicePermission(android.hardware.usb.UsbDevice r4, boolean r5) {
            r3 = this;
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r0 = r3.mDevicesById
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            org.libsdl.app.HIDDevice r1 = (org.libsdl.app.HIDDevice) r1
            android.hardware.usb.UsbDevice r2 = r1.getDevice()
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto La
            if (r5 == 0) goto L27
            boolean r2 = r1.open()
            goto L28
        L27:
            r2 = 0
        L28:
            int r1 = r1.getId()
            r3.HIDDeviceOpenResult(r1, r2)
            goto La
        L30:
            return
    }

    private void initializeBluetooth() {
            r5 = this;
            java.lang.String r0 = "Initializing Bluetooth"
            java.lang.String r1 = "hidapi"
            android.util.Log.d(r1, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L27
            android.content.Context r0 = r5.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r2 = r5.mContext
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "android.permission.BLUETOOTH_CONNECT"
            int r0 = r0.checkPermission(r3, r2)
            if (r0 == 0) goto L27
            java.lang.String r0 = "Couldn't initialize Bluetooth, missing android.permission.BLUETOOTH_CONNECT"
            android.util.Log.d(r1, r0)
            return
        L27:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 > r2) goto L47
            android.content.Context r0 = r5.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Context r2 = r5.mContext
            java.lang.String r2 = r2.getPackageName()
            java.lang.String r3 = "android.permission.BLUETOOTH"
            int r0 = r0.checkPermission(r3, r2)
            if (r0 == 0) goto L47
            java.lang.String r0 = "Couldn't initialize Bluetooth, missing android.permission.BLUETOOTH"
            android.util.Log.d(r1, r0)
            return
        L47:
            android.content.Context r0 = r5.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r2 = "android.hardware.bluetooth_le"
            boolean r0 = r0.hasSystemFeature(r2)
            if (r0 == 0) goto Ld7
            android.content.Context r0 = r5.mContext
            java.lang.String r2 = "bluetooth"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.bluetooth.BluetoothManager r0 = (android.bluetooth.BluetoothManager) r0
            r5.mBluetoothManager = r0
            if (r0 != 0) goto L64
            return
        L64:
            android.bluetooth.BluetoothAdapter r0 = r0.getAdapter()
            if (r0 != 0) goto L6b
            return
        L6b:
            java.util.Set r0 = r0.getBondedDevices()
            java.util.Iterator r0 = r0.iterator()
        L73:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L9b
            java.lang.Object r2 = r0.next()
            android.bluetooth.BluetoothDevice r2 = (android.bluetooth.BluetoothDevice) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Bluetooth device available: "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            android.util.Log.d(r1, r3)
            boolean r3 = r5.isSteamController(r2)
            if (r3 == 0) goto L73
            r5.connectBluetoothDevice(r2)
            goto L73
        L9b:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.bluetooth.device.action.ACL_CONNECTED"
            r0.addAction(r1)
            java.lang.String r1 = "android.bluetooth.device.action.ACL_DISCONNECTED"
            r0.addAction(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto Lb9
            android.content.Context r1 = r5.mContext
            android.content.BroadcastReceiver r2 = r5.mBluetoothBroadcast
            r3 = 2
            r1.registerReceiver(r2, r0, r3)
            goto Lc0
        Lb9:
            android.content.Context r1 = r5.mContext
            android.content.BroadcastReceiver r2 = r5.mBluetoothBroadcast
            r1.registerReceiver(r2, r0)
        Lc0:
            boolean r0 = r5.mIsChromebook
            if (r0 == 0) goto Ld6
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r5.mHandler = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r5.mLastBluetoothDevices = r0
        Ld6:
            return
        Ld7:
            java.lang.String r0 = "Couldn't initialize Bluetooth, this version of Android does not support Bluetooth LE"
            android.util.Log.d(r1, r0)
            return
    }

    private void initializeUSB() {
            r4 = this;
            android.content.Context r0 = r4.mContext
            java.lang.String r1 = "usb"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.usb.UsbManager r0 = (android.hardware.usb.UsbManager) r0
            r4.mUsbManager = r0
            if (r0 != 0) goto Lf
            return
        Lf:
            android.content.IntentFilter r0 = new android.content.IntentFilter
            r0.<init>()
            java.lang.String r1 = "android.hardware.usb.action.USB_DEVICE_ATTACHED"
            r0.addAction(r1)
            java.lang.String r1 = "android.hardware.usb.action.USB_DEVICE_DETACHED"
            r0.addAction(r1)
            java.lang.String r1 = "org.libsdl.app.USB_PERMISSION"
            r0.addAction(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 < r2) goto L32
            android.content.Context r1 = r4.mContext
            android.content.BroadcastReceiver r2 = r4.mUsbBroadcast
            r3 = 2
            r1.registerReceiver(r2, r0, r3)
            goto L39
        L32:
            android.content.Context r1 = r4.mContext
            android.content.BroadcastReceiver r2 = r4.mUsbBroadcast
            r1.registerReceiver(r2, r0)
        L39:
            android.hardware.usb.UsbManager r0 = r4.mUsbManager
            java.util.HashMap r0 = r0.getDeviceList()
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L47:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L57
            java.lang.Object r1 = r0.next()
            android.hardware.usb.UsbDevice r1 = (android.hardware.usb.UsbDevice) r1
            r4.handleUsbDeviceAttached(r1)
            goto L47
        L57:
            return
    }

    private boolean isHIDDeviceInterface(android.hardware.usb.UsbDevice r4, android.hardware.usb.UsbInterface r5) {
            r3 = this;
            int r0 = r5.getInterfaceClass()
            r1 = 3
            r2 = 1
            if (r0 != r1) goto L9
            return r2
        L9:
            boolean r0 = r3.isXbox360Controller(r4, r5)
            if (r0 != 0) goto L18
            boolean r4 = r3.isXboxOneController(r4, r5)
            if (r4 == 0) goto L16
            goto L18
        L16:
            r4 = 0
            return r4
        L18:
            return r2
    }

    private boolean isXbox360Controller(android.hardware.usb.UsbDevice r6, android.hardware.usb.UsbInterface r7) {
            r5 = this;
            r0 = 26
            int[] r1 = new int[r0]
            r1 = {x0038: FILL_ARRAY_DATA , data: [121, 1103, 1118, 1133, 1390, 1699, 1848, 2047, 3695, 3853, 4152, 4553, 4779, 5168, 5227, 5426, 5604, 5678, 5769, 6473, 7085, 8406, 9414, 11298, 11720, 39046} // fill-array
            int r2 = r7.getInterfaceClass()
            r3 = 255(0xff, float:3.57E-43)
            r4 = 0
            if (r2 != r3) goto L36
            int r2 = r7.getInterfaceSubclass()
            r3 = 93
            if (r2 != r3) goto L36
            int r2 = r7.getInterfaceProtocol()
            r3 = 1
            if (r2 == r3) goto L27
            int r7 = r7.getInterfaceProtocol()
            r2 = 129(0x81, float:1.81E-43)
            if (r7 != r2) goto L36
        L27:
            int r6 = r6.getVendorId()
            r7 = r4
        L2c:
            if (r7 >= r0) goto L36
            r2 = r1[r7]
            if (r6 != r2) goto L33
            return r3
        L33:
            int r7 = r7 + 1
            goto L2c
        L36:
            return r4
    }

    private boolean isXboxOneController(android.hardware.usb.UsbDevice r6, android.hardware.usb.UsbInterface r7) {
            r5 = this;
            r0 = 14
            int[] r1 = new int[r0]
            r1 = {x0038: FILL_ARRAY_DATA , data: [1008, 1103, 1118, 1848, 2821, 3695, 3853, 4341, 5426, 8406, 9414, 11720, 11812, 13623} // fill-array
            int r2 = r7.getId()
            r3 = 0
            if (r2 != 0) goto L36
            int r2 = r7.getInterfaceClass()
            r4 = 255(0xff, float:3.57E-43)
            if (r2 != r4) goto L36
            int r2 = r7.getInterfaceSubclass()
            r4 = 71
            if (r2 != r4) goto L36
            int r7 = r7.getInterfaceProtocol()
            r2 = 208(0xd0, float:2.91E-43)
            if (r7 != r2) goto L36
            int r6 = r6.getVendorId()
            r7 = r3
        L2b:
            if (r7 >= r0) goto L36
            r2 = r1[r7]
            if (r6 != r2) goto L33
            r6 = 1
            return r6
        L33:
            int r7 = r7 + 1
            goto L2b
        L36:
            return r3
    }

    public static void release(org.libsdl.app.HIDDeviceManager r1) {
            org.libsdl.app.HIDDeviceManager r0 = org.libsdl.app.HIDDeviceManager.sManager
            if (r1 != r0) goto L12
            int r1 = org.libsdl.app.HIDDeviceManager.sManagerRefCount
            int r1 = r1 + (-1)
            org.libsdl.app.HIDDeviceManager.sManagerRefCount = r1
            if (r1 != 0) goto L12
            r0.close()
            r1 = 0
            org.libsdl.app.HIDDeviceManager.sManager = r1
        L12:
            return
    }

    private void shutdownBluetooth() {
            r2 = this;
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Exception -> L7
            android.content.BroadcastReceiver r1 = r2.mBluetoothBroadcast     // Catch: java.lang.Exception -> L7
            r0.unregisterReceiver(r1)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    private void shutdownUSB() {
            r2 = this;
            android.content.Context r0 = r2.mContext     // Catch: java.lang.Exception -> L7
            android.content.BroadcastReceiver r1 = r2.mUsbBroadcast     // Catch: java.lang.Exception -> L7
            r0.unregisterReceiver(r1)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    native void HIDDeviceConnected(int r1, java.lang.String r2, int r3, int r4, java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8, int r9, int r10, int r11, int r12, boolean r13);

    native void HIDDeviceDisconnected(int r1);

    native void HIDDeviceInputReport(int r1, byte[] r2);

    native void HIDDeviceOpenPending(int r1);

    native void HIDDeviceOpenResult(int r1, boolean r2);

    native void HIDDeviceReportResponse(int r1, byte[] r2);

    public void chromebookConnectionHandler() {
            r6 = this;
            boolean r0 = r6.mIsChromebook
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            android.bluetooth.BluetoothManager r2 = r6.mBluetoothManager
            r3 = 7
            java.util.List r2 = r2.getConnectedDevices(r3)
            java.util.Iterator r3 = r2.iterator()
        L1a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L32
            java.lang.Object r4 = r3.next()
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            java.util.List<android.bluetooth.BluetoothDevice> r5 = r6.mLastBluetoothDevices
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto L1a
            r1.add(r4)
            goto L1a
        L32:
            java.util.List<android.bluetooth.BluetoothDevice> r3 = r6.mLastBluetoothDevices
            java.util.Iterator r3 = r3.iterator()
        L38:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4e
            java.lang.Object r4 = r3.next()
            android.bluetooth.BluetoothDevice r4 = (android.bluetooth.BluetoothDevice) r4
            boolean r5 = r2.contains(r4)
            if (r5 != 0) goto L38
            r0.add(r4)
            goto L38
        L4e:
            r6.mLastBluetoothDevices = r2
            java.util.Iterator r0 = r0.iterator()
        L54:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L64
            java.lang.Object r2 = r0.next()
            android.bluetooth.BluetoothDevice r2 = (android.bluetooth.BluetoothDevice) r2
            r6.disconnectBluetoothDevice(r2)
            goto L54
        L64:
            java.util.Iterator r0 = r1.iterator()
        L68:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L78
            java.lang.Object r1 = r0.next()
            android.bluetooth.BluetoothDevice r1 = (android.bluetooth.BluetoothDevice) r1
            r6.connectBluetoothDevice(r1)
            goto L68
        L78:
            android.os.Handler r0 = r6.mHandler
            org.libsdl.app.HIDDeviceManager$3 r1 = new org.libsdl.app.HIDDeviceManager$3
            r1.<init>(r6, r6)
            r2 = 10000(0x2710, double:4.9407E-320)
            r0.postDelayed(r1, r2)
            return
    }

    public void closeDevice(int r4) {
            r3 = this;
            java.lang.String r0 = "hidapi"
            java.lang.String r1 = "closeDevice deviceID="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L22
            r2.<init>(r1)     // Catch: java.lang.Exception -> L22
            java.lang.StringBuilder r1 = r2.append(r4)     // Catch: java.lang.Exception -> L22
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L22
            android.util.Log.v(r0, r1)     // Catch: java.lang.Exception -> L22
            org.libsdl.app.HIDDevice r1 = r3.getDevice(r4)     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto L1e
            r3.HIDDeviceDisconnected(r4)     // Catch: java.lang.Exception -> L22
            return
        L1e:
            r1.close()     // Catch: java.lang.Exception -> L22
            goto L39
        L22:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Got exception: "
            r1.<init>(r2)
            java.lang.String r4 = android.util.Log.getStackTraceString(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r0, r4)
        L39:
            return
    }

    public boolean connectBluetoothDevice(android.bluetooth.BluetoothDevice r5) {
            r4 = this;
            java.lang.String r0 = "Steam controller with address "
            java.lang.String r1 = "hidapi"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "connectBluetoothDevice device="
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            android.util.Log.v(r1, r2)
            monitor-enter(r4)
            java.util.HashMap<android.bluetooth.BluetoothDevice, org.libsdl.app.HIDDeviceBLESteamController> r1 = r4.mBluetoothDevices     // Catch: java.lang.Throwable -> L5f
            boolean r1 = r1.containsKey(r5)     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto L45
            java.lang.String r1 = "hidapi"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r0 = r2.append(r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = " already exists, attempting reconnect"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5f
            android.util.Log.v(r1, r0)     // Catch: java.lang.Throwable -> L5f
            java.util.HashMap<android.bluetooth.BluetoothDevice, org.libsdl.app.HIDDeviceBLESteamController> r0 = r4.mBluetoothDevices     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.Throwable -> L5f
            org.libsdl.app.HIDDeviceBLESteamController r5 = (org.libsdl.app.HIDDeviceBLESteamController) r5     // Catch: java.lang.Throwable -> L5f
            r5.reconnect()     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5f
            r5 = 0
            return r5
        L45:
            org.libsdl.app.HIDDeviceBLESteamController r0 = new org.libsdl.app.HIDDeviceBLESteamController     // Catch: java.lang.Throwable -> L5f
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L5f
            int r1 = r0.getId()     // Catch: java.lang.Throwable -> L5f
            java.util.HashMap<android.bluetooth.BluetoothDevice, org.libsdl.app.HIDDeviceBLESteamController> r2 = r4.mBluetoothDevices     // Catch: java.lang.Throwable -> L5f
            r2.put(r5, r0)     // Catch: java.lang.Throwable -> L5f
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r5 = r4.mDevicesById     // Catch: java.lang.Throwable -> L5f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L5f
            r5.put(r1, r0)     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5f
            r5 = 1
            return r5
        L5f:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L5f
            throw r5
    }

    public void disconnectBluetoothDevice(android.bluetooth.BluetoothDevice r4) {
            r3 = this;
            monitor-enter(r3)
            java.util.HashMap<android.bluetooth.BluetoothDevice, org.libsdl.app.HIDDeviceBLESteamController> r0 = r3.mBluetoothDevices     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L27
            org.libsdl.app.HIDDeviceBLESteamController r0 = (org.libsdl.app.HIDDeviceBLESteamController) r0     // Catch: java.lang.Throwable -> L27
            if (r0 != 0) goto Ld
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return
        Ld:
            int r1 = r0.getId()     // Catch: java.lang.Throwable -> L27
            java.util.HashMap<android.bluetooth.BluetoothDevice, org.libsdl.app.HIDDeviceBLESteamController> r2 = r3.mBluetoothDevices     // Catch: java.lang.Throwable -> L27
            r2.remove(r4)     // Catch: java.lang.Throwable -> L27
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r4 = r3.mDevicesById     // Catch: java.lang.Throwable -> L27
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L27
            r4.remove(r2)     // Catch: java.lang.Throwable -> L27
            r0.shutdown()     // Catch: java.lang.Throwable -> L27
            r3.HIDDeviceDisconnected(r1)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L27
            throw r4
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public int getDeviceIDForIdentifier(java.lang.String r5) {
            r4 = this;
            android.content.SharedPreferences r0 = r4.mSharedPreferences
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences r1 = r4.mSharedPreferences
            r2 = 0
            int r1 = r1.getInt(r5, r2)
            if (r1 != 0) goto L1a
            int r1 = r4.mNextDeviceId
            int r2 = r1 + 1
            r4.mNextDeviceId = r2
            java.lang.String r3 = "next_device_id"
            r0.putInt(r3, r2)
        L1a:
            r0.putInt(r5, r1)
            r0.commit()
            return r1
    }

    android.hardware.usb.UsbManager getUSBManager() {
            r1 = this;
            android.hardware.usb.UsbManager r0 = r1.mUsbManager
            return r0
    }

    public boolean initialize(boolean r3, boolean r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "initialize("
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hidapi"
            android.util.Log.v(r1, r0)
            if (r3 == 0) goto L29
            r2.initializeUSB()
        L29:
            if (r4 == 0) goto L2e
            r2.initializeBluetooth()
        L2e:
            r3 = 1
            return r3
    }

    public boolean isSteamController(android.bluetooth.BluetoothDevice r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r4.getName()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r1 = r4.getName()
            java.lang.String r2 = "SteamController"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L20
            int r4 = r4.getType()
            r4 = r4 & 2
            if (r4 == 0) goto L20
            r0 = 1
        L20:
            return r0
    }

    public boolean openDevice(int r9) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "openDevice deviceID="
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "hidapi"
            android.util.Log.v(r1, r0)
            org.libsdl.app.HIDDevice r0 = r8.getDevice(r9)
            r2 = 0
            if (r0 != 0) goto L1f
            r8.HIDDeviceDisconnected(r9)
            return r2
        L1f:
            android.hardware.usb.UsbDevice r3 = r0.getDevice()
            if (r3 == 0) goto L83
            android.hardware.usb.UsbManager r4 = r8.mUsbManager
            boolean r4 = r4.hasPermission(r3)
            if (r4 != 0) goto L83
            r8.HIDDeviceOpenPending(r9)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L6d
            r4 = 31
            if (r0 < r4) goto L39
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L3a
        L39:
            r0 = r2
        L3a:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L6d
            r5 = 33
            java.lang.String r6 = "org.libsdl.app.USB_PERMISSION"
            if (r4 < r5) goto L5c
            android.content.Intent r4 = new android.content.Intent     // Catch: java.lang.Exception -> L6d
            r4.<init>(r6)     // Catch: java.lang.Exception -> L6d
            android.content.Context r5 = r8.mContext     // Catch: java.lang.Exception -> L6d
            java.lang.String r5 = r5.getPackageName()     // Catch: java.lang.Exception -> L6d
            r4.setPackage(r5)     // Catch: java.lang.Exception -> L6d
            android.hardware.usb.UsbManager r5 = r8.mUsbManager     // Catch: java.lang.Exception -> L6d
            android.content.Context r6 = r8.mContext     // Catch: java.lang.Exception -> L6d
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r6, r2, r4, r0)     // Catch: java.lang.Exception -> L6d
            r5.requestPermission(r3, r0)     // Catch: java.lang.Exception -> L6d
            goto L82
        L5c:
            android.hardware.usb.UsbManager r4 = r8.mUsbManager     // Catch: java.lang.Exception -> L6d
            android.content.Context r5 = r8.mContext     // Catch: java.lang.Exception -> L6d
            android.content.Intent r7 = new android.content.Intent     // Catch: java.lang.Exception -> L6d
            r7.<init>(r6)     // Catch: java.lang.Exception -> L6d
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r5, r2, r7, r0)     // Catch: java.lang.Exception -> L6d
            r4.requestPermission(r3, r0)     // Catch: java.lang.Exception -> L6d
            goto L82
        L6d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Couldn't request permission for USB device "
            r0.<init>(r4)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.v(r1, r0)
            r8.HIDDeviceOpenResult(r9, r2)
        L82:
            return r2
        L83:
            boolean r9 = r0.open()     // Catch: java.lang.Exception -> L88
            return r9
        L88:
            r9 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Got exception: "
            r0.<init>(r3)
            java.lang.String r9 = android.util.Log.getStackTraceString(r9)
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r1, r9)
            return r2
    }

    public boolean readReport(int r3, byte[] r4, boolean r5) {
            r2 = this;
            r0 = 0
            org.libsdl.app.HIDDevice r1 = r2.getDevice(r3)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto Lb
            r2.HIDDeviceDisconnected(r3)     // Catch: java.lang.Exception -> L10
            return r0
        Lb:
            boolean r3 = r1.readReport(r4, r5)     // Catch: java.lang.Exception -> L10
            return r3
        L10:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Got exception: "
            r4.<init>(r5)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "hidapi"
            android.util.Log.e(r4, r3)
            return r0
    }

    public void setFrozen(boolean r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<java.lang.Integer, org.libsdl.app.HIDDevice> r0 = r2.mDevicesById     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        Lb:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            org.libsdl.app.HIDDevice r1 = (org.libsdl.app.HIDDevice) r1     // Catch: java.lang.Throwable -> L1d
            r1.setFrozen(r3)     // Catch: java.lang.Throwable -> L1d
            goto Lb
        L1b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r3
    }

    public int writeReport(int r3, byte[] r4, boolean r5) {
            r2 = this;
            r0 = -1
            org.libsdl.app.HIDDevice r1 = r2.getDevice(r3)     // Catch: java.lang.Exception -> L10
            if (r1 != 0) goto Lb
            r2.HIDDeviceDisconnected(r3)     // Catch: java.lang.Exception -> L10
            return r0
        Lb:
            int r3 = r1.writeReport(r4, r5)     // Catch: java.lang.Exception -> L10
            return r3
        L10:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Got exception: "
            r4.<init>(r5)
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "hidapi"
            android.util.Log.e(r4, r3)
            return r0
    }
}
