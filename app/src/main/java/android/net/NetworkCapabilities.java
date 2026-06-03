package android.net;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/NetworkCapabilities.class */
public class NetworkCapabilities {
    public static final int TRANSPORT_CELLULAR = 0;
    public static final int TRANSPORT_WIFI = 1;
    public static final int TRANSPORT_BLUETOOTH = 2;
    public static final int TRANSPORT_ETHERNET = 3;
    public static final int TRANSPORT_VPN = 4;
    public static final int NET_CAPABILITY_INTERNET = 12;
    public static final int NET_CAPABILITY_NOT_VPN = 15;

    public NetworkCapabilities() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public boolean hasTransport(int r4) {
            r3 = this;
            r0 = r4
            r1 = 1
            if (r0 == r1) goto Le
            r0 = r4
            if (r0 == 0) goto Le
            r0 = r4
            r1 = 3
            if (r0 != r1) goto L12
        Le:
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public boolean hasCapability(int r4) {
            r3 = this;
            r0 = r4
            r1 = 12
            if (r0 == r1) goto Lc
            r0 = r4
            r1 = 15
            if (r0 != r1) goto L10
        Lc:
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public int getLinkDownstreamBandwidthKbps() {
            r2 = this;
            r0 = 100000(0x186a0, float:1.4013E-40)
            return r0
    }

    public int getLinkUpstreamBandwidthKbps() {
            r2 = this;
            r0 = 100000(0x186a0, float:1.4013E-40)
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "DroidBridgeNetworkCapabilities"
            return r0
    }
}
