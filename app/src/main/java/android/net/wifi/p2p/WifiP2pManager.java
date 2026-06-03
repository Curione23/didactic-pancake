package android.net.wifi.p2p;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/wifi/p2p/WifiP2pManager.class */
public class WifiP2pManager {
    public static final java.lang.String WIFI_P2P_STATE_CHANGED_ACTION = "android.net.wifi.p2p.STATE_CHANGED";
    public static final java.lang.String WIFI_P2P_CONNECTION_CHANGED_ACTION = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE";
    public static final java.lang.String EXTRA_WIFI_STATE = "wifi_p2p_state";
    public static final java.lang.String EXTRA_WIFI_P2P_GROUP = "p2pGroupInfo";
    public static final int WIFI_P2P_STATE_ENABLED = 2;
    public static final int WIFI_P2P_STATE_DISABLED = 1;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/wifi/p2p/WifiP2pManager$Channel.class */
    public static class Channel {
        public Channel() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/wifi/p2p/WifiP2pManager$ChannelListener.class */
    public interface ChannelListener {
        void onChannelDisconnected();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/wifi/p2p/WifiP2pManager$GroupInfoListener.class */
    public interface GroupInfoListener {
        void onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup r1);
    }

    public WifiP2pManager() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public android.net.wifi.p2p.WifiP2pManager.Channel initialize(android.content.Context r4, android.os.Looper r5, android.net.wifi.p2p.WifiP2pManager.ChannelListener r6) {
            r3 = this;
            android.net.wifi.p2p.WifiP2pManager$Channel r0 = new android.net.wifi.p2p.WifiP2pManager$Channel
            r1 = r0
            r1.<init>()
            return r0
    }

    public void requestGroupInfo(android.net.wifi.p2p.WifiP2pManager.Channel r4, android.net.wifi.p2p.WifiP2pManager.GroupInfoListener r5) {
            r3 = this;
            r0 = r5
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 0
            r0.onGroupInfoAvailable(r1)
        Lb:
            return
    }
}
