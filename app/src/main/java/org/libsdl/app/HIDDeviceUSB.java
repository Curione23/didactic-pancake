package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
class HIDDeviceUSB implements org.libsdl.app.HIDDevice {
    private static final java.lang.String TAG = "hidapi";
    protected android.hardware.usb.UsbDeviceConnection mConnection;
    protected android.hardware.usb.UsbDevice mDevice;
    protected int mDeviceId;
    protected boolean mFrozen;
    protected android.hardware.usb.UsbEndpoint mInputEndpoint;
    protected org.libsdl.app.HIDDeviceUSB.InputThread mInputThread;
    protected int mInterface;
    protected int mInterfaceIndex;
    protected org.libsdl.app.HIDDeviceManager mManager;
    protected android.hardware.usb.UsbEndpoint mOutputEndpoint;
    protected boolean mRunning;

    protected class InputThread extends java.lang.Thread {
        final /* synthetic */ org.libsdl.app.HIDDeviceUSB this$0;

        protected InputThread(org.libsdl.app.HIDDeviceUSB r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r5 = this;
                org.libsdl.app.HIDDeviceUSB r0 = r5.this$0
                android.hardware.usb.UsbEndpoint r0 = r0.mInputEndpoint
                int r0 = r0.getMaxPacketSize()
                byte[] r1 = new byte[r0]
            La:
                org.libsdl.app.HIDDeviceUSB r2 = r5.this$0
                boolean r2 = r2.mRunning
                if (r2 == 0) goto L50
                org.libsdl.app.HIDDeviceUSB r2 = r5.this$0     // Catch: java.lang.Exception -> L3b
                android.hardware.usb.UsbDeviceConnection r2 = r2.mConnection     // Catch: java.lang.Exception -> L3b
                org.libsdl.app.HIDDeviceUSB r3 = r5.this$0     // Catch: java.lang.Exception -> L3b
                android.hardware.usb.UsbEndpoint r3 = r3.mInputEndpoint     // Catch: java.lang.Exception -> L3b
                r4 = 1000(0x3e8, float:1.401E-42)
                int r2 = r2.bulkTransfer(r3, r1, r0, r4)     // Catch: java.lang.Exception -> L3b
                if (r2 <= 0) goto La
                if (r2 != r0) goto L24
                r2 = r1
                goto L29
            L24:
                r3 = 0
                byte[] r2 = java.util.Arrays.copyOfRange(r1, r3, r2)
            L29:
                org.libsdl.app.HIDDeviceUSB r3 = r5.this$0
                boolean r3 = r3.mFrozen
                if (r3 != 0) goto La
                org.libsdl.app.HIDDeviceUSB r3 = r5.this$0
                org.libsdl.app.HIDDeviceManager r3 = r3.mManager
                org.libsdl.app.HIDDeviceUSB r4 = r5.this$0
                int r4 = r4.mDeviceId
                r3.HIDDeviceInputReport(r4, r2)
                goto La
            L3b:
                r0 = move-exception
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Exception in UsbDeviceConnection bulktransfer: "
                r1.<init>(r2)
                java.lang.StringBuilder r0 = r1.append(r0)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "hidapi"
                android.util.Log.v(r1, r0)
            L50:
                return
        }
    }

    public HIDDeviceUSB(org.libsdl.app.HIDDeviceManager r1, android.hardware.usb.UsbDevice r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.mManager = r1
            r0.mDevice = r2
            r0.mInterfaceIndex = r3
            android.hardware.usb.UsbInterface r2 = r2.getInterface(r3)
            int r2 = r2.getId()
            r0.mInterface = r2
            java.lang.String r2 = r0.getIdentifier()
            int r1 = r1.getDeviceIDForIdentifier(r2)
            r0.mDeviceId = r1
            r1 = 0
            r0.mRunning = r1
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public void close() {
            r3 = this;
            r0 = 0
            r3.mRunning = r0
            org.libsdl.app.HIDDeviceUSB$InputThread r0 = r3.mInputThread
            r1 = 0
            if (r0 == 0) goto L1d
        L8:
            org.libsdl.app.HIDDeviceUSB$InputThread r0 = r3.mInputThread
            boolean r0 = r0.isAlive()
            if (r0 == 0) goto L1b
            org.libsdl.app.HIDDeviceUSB$InputThread r0 = r3.mInputThread
            r0.interrupt()
            org.libsdl.app.HIDDeviceUSB$InputThread r0 = r3.mInputThread     // Catch: java.lang.InterruptedException -> L8
            r0.join()     // Catch: java.lang.InterruptedException -> L8
            goto L8
        L1b:
            r3.mInputThread = r1
        L1d:
            android.hardware.usb.UsbDeviceConnection r0 = r3.mConnection
            if (r0 == 0) goto L35
            android.hardware.usb.UsbDevice r0 = r3.mDevice
            int r2 = r3.mInterfaceIndex
            android.hardware.usb.UsbInterface r0 = r0.getInterface(r2)
            android.hardware.usb.UsbDeviceConnection r2 = r3.mConnection
            r2.releaseInterface(r0)
            android.hardware.usb.UsbDeviceConnection r0 = r3.mConnection
            r0.close()
            r3.mConnection = r1
        L35:
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public android.hardware.usb.UsbDevice getDevice() {
            r1 = this;
            android.hardware.usb.UsbDevice r0 = r1.mDevice
            return r0
    }

    public java.lang.String getDeviceName() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getManufacturerName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r3.getProductName()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "(0x"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.getVendorId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "%x"
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/0x"
            java.lang.StringBuilder r0 = r0.append(r1)
            int r1 = r3.getProductId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r1 = java.lang.String.format(r2, r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getId() {
            r1 = this;
            int r0 = r1.mDeviceId
            return r0
    }

    public java.lang.String getIdentifier() {
            r4 = this;
            android.hardware.usb.UsbDevice r0 = r4.mDevice
            java.lang.String r0 = r0.getDeviceName()
            android.hardware.usb.UsbDevice r1 = r4.mDevice
            int r1 = r1.getVendorId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.hardware.usb.UsbDevice r2 = r4.mDevice
            int r2 = r2.getProductId()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            int r3 = r4.mInterfaceIndex
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r1, r2, r3}
            java.lang.String r1 = "%s/%x/%x/%d"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public java.lang.String getManufacturerName() {
            r2 = this;
            android.hardware.usb.UsbDevice r0 = r2.mDevice
            java.lang.String r0 = r0.getManufacturerName()
            if (r0 != 0) goto L1a
            int r0 = r2.getVendorId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
        L1a:
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getProductId() {
            r1 = this;
            android.hardware.usb.UsbDevice r0 = r1.mDevice
            int r0 = r0.getProductId()
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public java.lang.String getProductName() {
            r2 = this;
            android.hardware.usb.UsbDevice r0 = r2.mDevice
            java.lang.String r0 = r0.getProductName()
            if (r0 != 0) goto L1a
            int r0 = r2.getProductId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "%x"
            java.lang.String r0 = java.lang.String.format(r1, r0)
        L1a:
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public java.lang.String getSerialNumber() {
            r1 = this;
            android.hardware.usb.UsbDevice r0 = r1.mDevice     // Catch: java.lang.SecurityException -> L7
            java.lang.String r0 = r0.getSerialNumber()     // Catch: java.lang.SecurityException -> L7
            goto L8
        L7:
            r0 = 0
        L8:
            if (r0 != 0) goto Lc
            java.lang.String r0 = ""
        Lc:
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVendorId() {
            r1 = this;
            android.hardware.usb.UsbDevice r0 = r1.mDevice
            int r0 = r0.getVendorId()
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public int getVersion() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean open() {
            r8 = this;
            org.libsdl.app.HIDDeviceManager r0 = r8.mManager
            android.hardware.usb.UsbManager r0 = r0.getUSBManager()
            android.hardware.usb.UsbDevice r1 = r8.mDevice
            android.hardware.usb.UsbDeviceConnection r0 = r0.openDevice(r1)
            r8.mConnection = r0
            java.lang.String r1 = "hidapi"
            r2 = 0
            if (r0 != 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to open USB device "
            r0.<init>(r3)
            java.lang.String r3 = r8.getDeviceName()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            return r2
        L2a:
            android.hardware.usb.UsbDevice r0 = r8.mDevice
            int r3 = r8.mInterfaceIndex
            android.hardware.usb.UsbInterface r0 = r0.getInterface(r3)
            android.hardware.usb.UsbDeviceConnection r3 = r8.mConnection
            r4 = 1
            boolean r3 = r3.claimInterface(r0, r4)
            if (r3 != 0) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to claim interfaces on USB device "
            r0.<init>(r3)
            java.lang.String r3 = r8.getDeviceName()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            r8.close()
            return r2
        L55:
            r3 = r2
        L56:
            int r5 = r0.getEndpointCount()
            if (r3 >= r5) goto L7b
            android.hardware.usb.UsbEndpoint r5 = r0.getEndpoint(r3)
            int r6 = r5.getDirection()
            if (r6 == 0) goto L72
            r7 = 128(0x80, float:1.8E-43)
            if (r6 == r7) goto L6b
            goto L78
        L6b:
            android.hardware.usb.UsbEndpoint r6 = r8.mInputEndpoint
            if (r6 != 0) goto L78
            r8.mInputEndpoint = r5
            goto L78
        L72:
            android.hardware.usb.UsbEndpoint r6 = r8.mOutputEndpoint
            if (r6 != 0) goto L78
            r8.mOutputEndpoint = r5
        L78:
            int r3 = r3 + 1
            goto L56
        L7b:
            android.hardware.usb.UsbEndpoint r0 = r8.mInputEndpoint
            if (r0 == 0) goto L91
            android.hardware.usb.UsbEndpoint r0 = r8.mOutputEndpoint
            if (r0 != 0) goto L84
            goto L91
        L84:
            r8.mRunning = r4
            org.libsdl.app.HIDDeviceUSB$InputThread r0 = new org.libsdl.app.HIDDeviceUSB$InputThread
            r0.<init>(r8)
            r8.mInputThread = r0
            r0.start()
            return r4
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "Missing required endpoint on USB device "
            r0.<init>(r3)
            java.lang.String r3 = r8.getDeviceName()
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r1, r0)
            r8.close()
            return r2
    }

    @Override // org.libsdl.app.HIDDevice
    public boolean readReport(byte[] r17, boolean r18) {
            r16 = this;
            r0 = r16
            r10 = r17
            int r1 = r10.length
            r11 = 0
            r2 = r10[r11]
            android.hardware.usb.UsbDeviceConnection r3 = r0.mConnection
            java.lang.String r12 = "hidapi"
            if (r3 != 0) goto L14
            java.lang.String r1 = "readReport() called with no device connection"
            android.util.Log.w(r12, r1)
            return r11
        L14:
            r13 = 1
            if (r2 != 0) goto L1c
            int r1 = r1 + (-1)
            r14 = r1
            r7 = r13
            goto L1e
        L1c:
            r14 = r1
            r7 = r11
        L1e:
            r15 = r7
            if (r18 == 0) goto L23
            r1 = 3
            goto L24
        L23:
            r1 = r13
        L24:
            int r1 = r1 << 8
            r4 = r1 | r2
            int r5 = r0.mInterface
            r9 = 1000(0x3e8, float:1.401E-42)
            r2 = 161(0xa1, float:2.26E-43)
            r6 = 1
            r1 = r3
            r3 = r6
            r6 = r17
            r8 = r14
            int r1 = r1.controlTransfer(r2, r3, r4, r5, r6, r7, r8, r9)
            if (r1 >= 0) goto L5b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "getFeatureReport() returned "
            r2.<init>(r3)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r2 = " on device "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r16.getDeviceName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r12, r1)
            return r11
        L5b:
            if (r15 == 0) goto L61
            int r1 = r1 + 1
            int r14 = r14 + 1
        L61:
            if (r1 != r14) goto L65
            r1 = r10
            goto L69
        L65:
            byte[] r1 = java.util.Arrays.copyOfRange(r10, r11, r1)
        L69:
            org.libsdl.app.HIDDeviceManager r2 = r0.mManager
            int r3 = r0.mDeviceId
            r2.HIDDeviceReportResponse(r3, r1)
            return r13
    }

    @Override // org.libsdl.app.HIDDevice
    public void setFrozen(boolean r1) {
            r0 = this;
            r0.mFrozen = r1
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public void shutdown() {
            r1 = this;
            r1.close()
            r0 = 0
            r1.mManager = r0
            return
    }

    @Override // org.libsdl.app.HIDDevice
    public int writeReport(byte[] r14, boolean r15) {
            r13 = this;
            android.hardware.usb.UsbDeviceConnection r0 = r13.mConnection
            r9 = -1
            java.lang.String r10 = "hidapi"
            if (r0 != 0) goto Ld
            java.lang.String r14 = "writeReport() called with no device connection"
            android.util.Log.w(r10, r14)
            return r9
        Ld:
            java.lang.String r11 = " on device "
            if (r15 == 0) goto L52
            int r15 = r14.length
            r1 = 0
            r2 = r14[r1]
            if (r2 != 0) goto L1a
            int r15 = r15 + (-1)
            r1 = 1
        L1a:
            r6 = r1
            r12 = r6
            r3 = r2 | 768(0x300, float:1.076E-42)
            int r4 = r13.mInterface
            r8 = 1000(0x3e8, float:1.401E-42)
            r1 = 33
            r2 = 9
            r5 = r14
            r7 = r15
            int r14 = r0.controlTransfer(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 >= 0) goto L4d
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r0 = "writeFeatureReport() returned "
            r15.<init>(r0)
            java.lang.StringBuilder r14 = r15.append(r14)
            java.lang.StringBuilder r14 = r14.append(r11)
            java.lang.String r15 = r13.getDeviceName()
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.String r14 = r14.toString()
            android.util.Log.w(r10, r14)
            return r9
        L4d:
            if (r12 == 0) goto L51
            int r15 = r15 + 1
        L51:
            return r15
        L52:
            android.hardware.usb.UsbEndpoint r15 = r13.mOutputEndpoint
            int r1 = r14.length
            r2 = 1000(0x3e8, float:1.401E-42)
            int r15 = r0.bulkTransfer(r15, r14, r1, r2)
            int r14 = r14.length
            if (r15 == r14) goto L7c
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "writeOutputReport() returned "
            r14.<init>(r0)
            java.lang.StringBuilder r14 = r14.append(r15)
            java.lang.StringBuilder r14 = r14.append(r11)
            java.lang.String r0 = r13.getDeviceName()
            java.lang.StringBuilder r14 = r14.append(r0)
            java.lang.String r14 = r14.toString()
            android.util.Log.w(r10, r14)
        L7c:
            return r15
    }
}
