package org.libsdl.app;

/* JADX INFO: loaded from: classes2.dex */
interface HIDDevice {
    void close();

    android.hardware.usb.UsbDevice getDevice();

    int getId();

    java.lang.String getManufacturerName();

    int getProductId();

    java.lang.String getProductName();

    java.lang.String getSerialNumber();

    int getVendorId();

    int getVersion();

    boolean open();

    boolean readReport(byte[] r1, boolean r2);

    void setFrozen(boolean r1);

    void shutdown();

    int writeReport(byte[] r1, boolean r2);
}
