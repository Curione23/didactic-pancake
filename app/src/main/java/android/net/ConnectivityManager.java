package android.net;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/ConnectivityManager.class */
public class ConnectivityManager {
    public static final java.lang.String CONNECTIVITY_ACTION = "android.net.conn.CONNECTIVITY_CHANGE";
    public static final int TYPE_MOBILE = 0;
    public static final int TYPE_WIFI = 1;
    public static final int TYPE_BLUETOOTH = 7;
    public static final int TYPE_ETHERNET = 9;
    public static final int TYPE_VPN = 17;
    private final android.net.Network activeNetwork;
    private final android.net.NetworkInfo activeInfo;
    private final android.net.NetworkCapabilities capabilities;
    private final android.net.LinkProperties linkProperties;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/ConnectivityManager$NetworkCallback.class */
    public static class NetworkCallback {
        public NetworkCallback() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public void onAvailable(android.net.Network r2) {
                r1 = this;
                return
        }

        public void onCapabilitiesChanged(android.net.Network r2, android.net.NetworkCapabilities r3) {
                r1 = this;
                return
        }

        public void onLinkPropertiesChanged(android.net.Network r2, android.net.LinkProperties r3) {
                r1 = this;
                return
        }

        public void onLost(android.net.Network r2) {
                r1 = this;
                return
        }
    }

    public ConnectivityManager() {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            android.net.Network r1 = new android.net.Network
            r2 = r1
            r3 = 100
            r2.<init>(r3)
            r0.activeNetwork = r1
            r0 = r7
            android.net.NetworkInfo r1 = new android.net.NetworkInfo
            r2 = r1
            r3 = 1
            r4 = 0
            r5 = 1
            r2.<init>(r3, r4, r5)
            r0.activeInfo = r1
            r0 = r7
            android.net.NetworkCapabilities r1 = new android.net.NetworkCapabilities
            r2 = r1
            r2.<init>()
            r0.capabilities = r1
            r0 = r7
            android.net.LinkProperties r1 = new android.net.LinkProperties
            r2 = r1
            r2.<init>()
            r0.linkProperties = r1
            return
    }

    public android.net.NetworkInfo getActiveNetworkInfo() {
            r2 = this;
            r0 = r2
            android.net.NetworkInfo r0 = r0.activeInfo
            return r0
    }

    public android.net.Network getActiveNetwork() {
            r2 = this;
            r0 = r2
            android.net.Network r0 = r0.activeNetwork
            return r0
    }

    public android.net.NetworkInfo getNetworkInfo(android.net.Network r3) {
            r2 = this;
            r0 = r2
            android.net.NetworkInfo r0 = r0.activeInfo
            return r0
    }

    public android.net.NetworkInfo[] getAllNetworkInfo() {
            r5 = this;
            r0 = 1
            android.net.NetworkInfo[] r0 = new android.net.NetworkInfo[r0]
            r1 = r0
            r2 = 0
            r3 = r5
            android.net.NetworkInfo r3 = r3.activeInfo
            r1[r2] = r3
            return r0
    }

    public android.net.Network[] getAllNetworks() {
            r5 = this;
            r0 = 1
            android.net.Network[] r0 = new android.net.Network[r0]
            r1 = r0
            r2 = 0
            r3 = r5
            android.net.Network r3 = r3.activeNetwork
            r1[r2] = r3
            return r0
    }

    public android.net.NetworkCapabilities getNetworkCapabilities(android.net.Network r3) {
            r2 = this;
            r0 = r2
            android.net.NetworkCapabilities r0 = r0.capabilities
            return r0
    }

    public android.net.LinkProperties getLinkProperties(android.net.Network r3) {
            r2 = this;
            r0 = r2
            android.net.LinkProperties r0 = r0.linkProperties
            return r0
    }

    public void registerDefaultNetworkCallback(android.net.ConnectivityManager.NetworkCallback r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.notifyAvailable(r1)
            return
    }

    public void registerNetworkCallback(android.net.NetworkRequest r4, android.net.ConnectivityManager.NetworkCallback r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.notifyAvailable(r1)
            return
    }

    public void requestNetwork(android.net.NetworkRequest r4, android.net.ConnectivityManager.NetworkCallback r5) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.notifyAvailable(r1)
            return
    }

    public void unregisterNetworkCallback(android.net.ConnectivityManager.NetworkCallback r2) {
            r1 = this;
            return
    }

    private void notifyAvailable(android.net.ConnectivityManager.NetworkCallback r5) {
            r4 = this;
            r0 = r5
            if (r0 == 0) goto L24
            r0 = r5
            r1 = r4
            android.net.Network r1 = r1.activeNetwork
            r0.onAvailable(r1)
            r0 = r5
            r1 = r4
            android.net.Network r1 = r1.activeNetwork
            r2 = r4
            android.net.NetworkCapabilities r2 = r2.capabilities
            r0.onCapabilitiesChanged(r1, r2)
            r0 = r5
            r1 = r4
            android.net.Network r1 = r1.activeNetwork
            r2 = r4
            android.net.LinkProperties r2 = r2.linkProperties
            r0.onLinkPropertiesChanged(r1, r2)
        L24:
            return
    }
}
