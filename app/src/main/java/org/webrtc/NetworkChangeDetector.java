package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkChangeDetector.class */
public interface NetworkChangeDetector {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkChangeDetector$ConnectionType.class */
    public enum ConnectionType extends java.lang.Enum<org.webrtc.NetworkChangeDetector.ConnectionType> {
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_UNKNOWN = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_ETHERNET = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_WIFI = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_5G = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_4G = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_3G = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_2G = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_UNKNOWN_CELLULAR = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_BLUETOOTH = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_VPN = null;
        public static final org.webrtc.NetworkChangeDetector.ConnectionType CONNECTION_NONE = null;
        private static final /* synthetic */ org.webrtc.NetworkChangeDetector.ConnectionType[] $VALUES = null;

        public static org.webrtc.NetworkChangeDetector.ConnectionType[] values() {
                org.webrtc.NetworkChangeDetector$ConnectionType[] r0 = org.webrtc.NetworkChangeDetector.ConnectionType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.NetworkChangeDetector$ConnectionType[] r0 = (org.webrtc.NetworkChangeDetector.ConnectionType[]) r0
                return r0
        }

        public static org.webrtc.NetworkChangeDetector.ConnectionType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.NetworkChangeDetector$ConnectionType> r0 = org.webrtc.NetworkChangeDetector.ConnectionType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = (org.webrtc.NetworkChangeDetector.ConnectionType) r0
                return r0
        }

        ConnectionType(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.NetworkChangeDetector.ConnectionType[] $values() {
                r0 = 11
                org.webrtc.NetworkChangeDetector$ConnectionType[] r0 = new org.webrtc.NetworkChangeDetector.ConnectionType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_5G
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_4G
                r1[r2] = r3
                r1 = r0
                r2 = 5
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_3G
                r1[r2] = r3
                r1 = r0
                r2 = 6
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_2G
                r1[r2] = r3
                r1 = r0
                r2 = 7
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR
                r1[r2] = r3
                r1 = r0
                r2 = 8
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH
                r1[r2] = r3
                r1 = r0
                r2 = 9
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_VPN
                r1[r2] = r3
                r1 = r0
                r2 = 10
                org.webrtc.NetworkChangeDetector$ConnectionType r3 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_UNKNOWN"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_ETHERNET"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_WIFI"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_5G"
                r3 = 3
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_5G = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_4G"
                r3 = 4
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_4G = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_3G"
                r3 = 5
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_3G = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_2G"
                r3 = 6
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_2G = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_UNKNOWN_CELLULAR"
                r3 = 7
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_BLUETOOTH"
                r3 = 8
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_VPN"
                r3 = 9
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_VPN = r0
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = new org.webrtc.NetworkChangeDetector$ConnectionType
                r1 = r0
                java.lang.String r2 = "CONNECTION_NONE"
                r3 = 10
                r1.<init>(r2, r3)
                org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE = r0
                org.webrtc.NetworkChangeDetector$ConnectionType[] r0 = $values()
                org.webrtc.NetworkChangeDetector.ConnectionType.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkChangeDetector$IPAddress.class */
    public static class IPAddress {
        public final byte[] address;

        public IPAddress(byte[] r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.address = r1
                return
        }

        @org.webrtc.CalledByNative("IPAddress")
        private byte[] getAddress() {
                r2 = this;
                r0 = r2
                byte[] r0 = r0.address
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkChangeDetector$NetworkInformation.class */
    public static class NetworkInformation {
        public final java.lang.String name;
        public final org.webrtc.NetworkChangeDetector.ConnectionType type;
        public final org.webrtc.NetworkChangeDetector.ConnectionType underlyingTypeForVpn;
        public final long handle;
        public final org.webrtc.NetworkChangeDetector.IPAddress[] ipAddresses;

        public NetworkInformation(java.lang.String r5, org.webrtc.NetworkChangeDetector.ConnectionType r6, org.webrtc.NetworkChangeDetector.ConnectionType r7, long r8, org.webrtc.NetworkChangeDetector.IPAddress[] r10) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.name = r1
                r0 = r4
                r1 = r6
                r0.type = r1
                r0 = r4
                r1 = r7
                r0.underlyingTypeForVpn = r1
                r0 = r4
                r1 = r8
                r0.handle = r1
                r0 = r4
                r1 = r10
                r0.ipAddresses = r1
                return
        }

        @org.webrtc.CalledByNative("NetworkInformation")
        private org.webrtc.NetworkChangeDetector.IPAddress[] getIpAddresses() {
                r2 = this;
                r0 = r2
                org.webrtc.NetworkChangeDetector$IPAddress[] r0 = r0.ipAddresses
                return r0
        }

        @org.webrtc.CalledByNative("NetworkInformation")
        private org.webrtc.NetworkChangeDetector.ConnectionType getConnectionType() {
                r2 = this;
                r0 = r2
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = r0.type
                return r0
        }

        @org.webrtc.CalledByNative("NetworkInformation")
        private org.webrtc.NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn() {
                r2 = this;
                r0 = r2
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = r0.underlyingTypeForVpn
                return r0
        }

        @org.webrtc.CalledByNative("NetworkInformation")
        private long getHandle() {
                r3 = this;
                r0 = r3
                long r0 = r0.handle
                return r0
        }

        @org.webrtc.CalledByNative("NetworkInformation")
        private java.lang.String getName() {
                r2 = this;
                r0 = r2
                java.lang.String r0 = r0.name
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkChangeDetector$Observer.class */
    public static abstract class Observer {
        public Observer() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public abstract void onConnectionTypeChanged(org.webrtc.NetworkChangeDetector.ConnectionType r1);

        public abstract void onNetworkConnect(org.webrtc.NetworkChangeDetector.NetworkInformation r1);

        public abstract void onNetworkDisconnect(long r1);

        public abstract void onNetworkPreference(java.util.List<org.webrtc.NetworkChangeDetector.ConnectionType> r1, int r2);

        public java.lang.String getFieldTrialsString() {
                r2 = this;
                java.lang.String r0 = ""
                return r0
        }
    }

    org.webrtc.NetworkChangeDetector.ConnectionType getCurrentConnectionType();

    boolean supportNetworkCallback();

    @androidx.annotation.Nullable
    java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList();

    void destroy();
}
