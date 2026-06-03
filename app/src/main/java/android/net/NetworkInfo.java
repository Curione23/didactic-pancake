package android.net;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/NetworkInfo.class */
public class NetworkInfo {
    private final int type;
    private final int subtype;
    private final boolean connected;

    public NetworkInfo() {
            r5 = this;
            r0 = r5
            r1 = 1
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            return
    }

    public NetworkInfo(int r4, int r5, boolean r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.type = r1
            r0 = r3
            r1 = r5
            r0.subtype = r1
            r0 = r3
            r1 = r6
            r0.connected = r1
            return
    }

    public boolean isConnected() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.connected
            return r0
    }

    public boolean isConnectedOrConnecting() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.connected
            return r0
    }

    public int getType() {
            r2 = this;
            r0 = r2
            int r0 = r0.type
            return r0
    }

    public int getSubtype() {
            r2 = this;
            r0 = r2
            int r0 = r0.subtype
            return r0
    }

    public java.lang.String getTypeName() {
            r3 = this;
            r0 = r3
            int r0 = r0.type
            r1 = 1
            if (r0 != r1) goto Lb
            java.lang.String r0 = "WIFI"
            return r0
        Lb:
            r0 = r3
            int r0 = r0.type
            if (r0 != 0) goto L15
            java.lang.String r0 = "MOBILE"
            return r0
        L15:
            r0 = r3
            int r0 = r0.type
            r1 = 9
            if (r0 != r1) goto L21
            java.lang.String r0 = "ETHERNET"
            return r0
        L21:
            r0 = r3
            int r0 = r0.type
            r1 = 17
            if (r0 != r1) goto L2d
            java.lang.String r0 = "VPN"
            return r0
        L2d:
            java.lang.String r0 = "UNKNOWN"
            return r0
    }

    public java.lang.String getSubtypeName() {
            r2 = this;
            java.lang.String r0 = ""
            return r0
    }
}
