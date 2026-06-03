package android.net.wifi;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/wifi/WifiManager.class */
public class WifiManager {
    public static final java.lang.String NETWORK_STATE_CHANGED_ACTION = "android.net.wifi.STATE_CHANGE";
    public static final java.lang.String EXTRA_WIFI_INFO = "wifiInfo";

    public WifiManager() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public android.net.wifi.WifiInfo getConnectionInfo() {
            r3 = this;
            android.net.wifi.WifiInfo r0 = new android.net.wifi.WifiInfo
            r1 = r0
            r1.<init>()
            return r0
    }

    public boolean isWifiEnabled() {
            r2 = this;
            r0 = 1
            return r0
    }
}
