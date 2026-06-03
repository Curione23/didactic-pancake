package android.content;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/content/Context.class */
public class Context {
    public static final java.lang.String AUDIO_SERVICE = "audio";
    public static final java.lang.String CONNECTIVITY_SERVICE = "connectivity";
    public static final java.lang.String WIFI_SERVICE = "wifi";
    public static final java.lang.String WIFI_P2P_SERVICE = "wifip2p";
    private final android.media.AudioManager audioManager;
    private final android.net.ConnectivityManager connectivityManager;
    private final android.net.wifi.WifiManager wifiManager;
    private final android.net.wifi.p2p.WifiP2pManager wifiP2pManager;
    private final android.content.pm.PackageManager packageManager;

    public Context() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            android.media.AudioManager r1 = new android.media.AudioManager
            r2 = r1
            r2.<init>()
            r0.audioManager = r1
            r0 = r4
            android.net.ConnectivityManager r1 = new android.net.ConnectivityManager
            r2 = r1
            r2.<init>()
            r0.connectivityManager = r1
            r0 = r4
            android.net.wifi.WifiManager r1 = new android.net.wifi.WifiManager
            r2 = r1
            r2.<init>()
            r0.wifiManager = r1
            r0 = r4
            android.net.wifi.p2p.WifiP2pManager r1 = new android.net.wifi.p2p.WifiP2pManager
            r2 = r1
            r2.<init>()
            r0.wifiP2pManager = r1
            r0 = r4
            android.content.pm.PackageManager r1 = new android.content.pm.PackageManager
            r2 = r1
            r2.<init>()
            r0.packageManager = r1
            return
    }

    public android.content.Context getApplicationContext() {
            r2 = this;
            r0 = r2
            return r0
    }

    public java.lang.String getPackageName() {
            r2 = this;
            java.lang.String r0 = "ca.dnamobile.javalauncher"
            return r0
    }

    public java.lang.Object getSystemService(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "audio"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            r0 = r3
            android.media.AudioManager r0 = r0.audioManager
            return r0
        Le:
            java.lang.String r0 = "connectivity"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            r0 = r3
            android.net.ConnectivityManager r0 = r0.connectivityManager
            return r0
        L1c:
            java.lang.String r0 = "wifi"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2a
            r0 = r3
            android.net.wifi.WifiManager r0 = r0.wifiManager
            return r0
        L2a:
            java.lang.String r0 = "wifip2p"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L38
            r0 = r3
            android.net.wifi.p2p.WifiP2pManager r0 = r0.wifiP2pManager
            return r0
        L38:
            r0 = 0
            return r0
    }

    public android.content.pm.PackageManager getPackageManager() {
            r2 = this;
            r0 = r2
            android.content.pm.PackageManager r0 = r0.packageManager
            return r0
    }

    public android.content.Intent registerReceiver(android.content.BroadcastReceiver r6, android.content.IntentFilter r7) {
            r5 = this;
            android.content.Intent r0 = new android.content.Intent
            r1 = r0
            r1.<init>()
            r8 = r0
            r0 = r7
            if (r0 == 0) goto L2a
            r0 = r7
            java.lang.String r1 = "android.net.wifi.STATE_CHANGE"
            boolean r0 = r0.hasAction(r1)
            if (r0 == 0) goto L2a
            r0 = r8
            java.lang.String r1 = "android.net.wifi.STATE_CHANGE"
            android.content.Intent r0 = r0.setAction(r1)
            r0 = r8
            java.lang.String r1 = "wifiInfo"
            android.net.wifi.WifiInfo r2 = new android.net.wifi.WifiInfo
            r3 = r2
            r3.<init>()
            android.content.Intent r0 = r0.putExtra(r1, r2)
        L2a:
            r0 = r8
            return r0
    }

    public void unregisterReceiver(android.content.BroadcastReceiver r2) {
            r1 = this;
            return
    }

    public java.io.File getCacheDir() {
            r5 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.String r2 = "java.io.tmpdir"
            java.lang.String r3 = "/tmp"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            r1.<init>(r2)
            return r0
    }

    public java.io.File getFilesDir() {
            r5 = this;
            java.io.File r0 = new java.io.File
            r1 = r0
            java.lang.String r2 = "user.home"
            java.lang.String r3 = "/tmp"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)
            r1.<init>(r2)
            return r0
    }
}
