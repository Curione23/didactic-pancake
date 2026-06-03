package android.net;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/LinkAddress.class */
public class LinkAddress {
    private final java.net.InetAddress address;

    public LinkAddress(java.net.InetAddress r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.address = r1
            return
    }

    public java.net.InetAddress getAddress() {
            r2 = this;
            r0 = r2
            java.net.InetAddress r0 = r0.address
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.net.InetAddress r0 = r0.address
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
