package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitorAutoDetect.class */
public class NetworkMonitorAutoDetect extends android.content.BroadcastReceiver implements org.webrtc.NetworkChangeDetector {
    private static final long INVALID_NET_ID = -1;
    private static final java.lang.String TAG = "NetworkMonitorAutoDetect";
    private final org.webrtc.NetworkChangeDetector.Observer observer;
    private final android.content.IntentFilter intentFilter;
    private final android.content.Context context;

    @androidx.annotation.Nullable
    private final android.net.ConnectivityManager.NetworkCallback mobileNetworkCallback;

    @androidx.annotation.Nullable
    private final android.net.ConnectivityManager.NetworkCallback allNetworkCallback;
    private org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate connectivityManagerDelegate;
    private org.webrtc.NetworkMonitorAutoDetect.WifiManagerDelegate wifiManagerDelegate;
    private org.webrtc.NetworkMonitorAutoDetect.WifiDirectManagerDelegate wifiDirectManagerDelegate;
    private static boolean includeWifiDirect;

    @androidx.annotation.GuardedBy("availableNetworks")
    final java.util.Set<android.net.Network> availableNetworks;
    private boolean isRegistered;
    private org.webrtc.NetworkChangeDetector.ConnectionType connectionType;
    private java.lang.String wifiSSID;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitorAutoDetect$ConnectivityManagerDelegate.class */
    static class ConnectivityManagerDelegate {

        @androidx.annotation.Nullable
        private final android.net.ConnectivityManager connectivityManager;

        @androidx.annotation.NonNull
        @androidx.annotation.GuardedBy("availableNetworks")
        private final java.util.Set<android.net.Network> availableNetworks;
        private final boolean getAllNetworksFromCache;
        private final boolean requestVPN;
        private final boolean includeOtherUidNetworks;

        ConnectivityManagerDelegate(android.content.Context r6, java.util.Set<android.net.Network> r7, java.lang.String r8) {
                r5 = this;
                r0 = r5
                r1 = r6
                java.lang.String r2 = "connectivity"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
                r2 = r7
                r3 = r8
                r0.<init>(r1, r2, r3)
                return
        }

        @androidx.annotation.VisibleForTesting
        ConnectivityManagerDelegate(android.net.ConnectivityManager r6, java.util.Set<android.net.Network> r7, java.lang.String r8) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r0.connectivityManager = r1
                r0 = r5
                r1 = r7
                r0.availableNetworks = r1
                r0 = r5
                r1 = r8
                java.lang.String r2 = "getAllNetworksFromCache"
                r3 = 0
                boolean r1 = checkFieldTrial(r1, r2, r3)
                r0.getAllNetworksFromCache = r1
                r0 = r5
                r1 = r8
                java.lang.String r2 = "requestVPN"
                r3 = 0
                boolean r1 = checkFieldTrial(r1, r2, r3)
                r0.requestVPN = r1
                r0 = r5
                r1 = r8
                java.lang.String r2 = "includeOtherUidNetworks"
                r3 = 0
                boolean r1 = checkFieldTrial(r1, r2, r3)
                r0.includeOtherUidNetworks = r1
                return
        }

        private static boolean checkFieldTrial(java.lang.String r3, java.lang.String r4, boolean r5) {
                r0 = r3
                r1 = r4
                java.lang.String r1 = r1 + ":true"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto Lf
                r0 = 1
                return r0
            Lf:
                r0 = r3
                r1 = r4
                java.lang.String r1 = r1 + ":false"
                boolean r0 = r0.contains(r1)
                if (r0 == 0) goto L1e
                r0 = 0
                return r0
            L1e:
                r0 = r5
                return r0
        }

        org.webrtc.NetworkMonitorAutoDetect.NetworkState getNetworkState() {
                r8 = this;
                r0 = r8
                android.net.ConnectivityManager r0 = r0.connectivityManager
                if (r0 != 0) goto L14
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = 0
                r3 = -1
                r4 = -1
                r5 = -1
                r6 = -1
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L14:
                r0 = r8
                r1 = r8
                android.net.ConnectivityManager r1 = r1.connectivityManager
                android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getNetworkState(r1)
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        org.webrtc.NetworkMonitorAutoDetect.NetworkState getNetworkState(@androidx.annotation.Nullable android.net.Network r9) {
                r8 = this;
                r0 = r9
                if (r0 == 0) goto Lb
                r0 = r8
                android.net.ConnectivityManager r0 = r0.connectivityManager
                if (r0 != 0) goto L18
            Lb:
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = 0
                r3 = -1
                r4 = -1
                r5 = -1
                r6 = -1
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L18:
                r0 = r8
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r9
                android.net.NetworkInfo r0 = r0.getNetworkInfo(r1)
                r10 = r0
                r0 = r10
                if (r0 != 0) goto L40
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r9
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = "Couldn't retrieve information from network " + r1
                org.webrtc.Logging.w(r0, r1)
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = 0
                r3 = -1
                r4 = -1
                r5 = -1
                r6 = -1
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L40:
                r0 = r10
                int r0 = r0.getType()
                r1 = 17
                if (r0 == r1) goto L7b
                r0 = r8
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r9
                android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r1)
                r11 = r0
                r0 = r11
                if (r0 == 0) goto L5e
                r0 = r11
                r1 = 4
                boolean r0 = r0.hasTransport(r1)
                if (r0 != 0) goto L64
            L5e:
                r0 = r8
                r1 = r10
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getNetworkState(r1)
                return r0
            L64:
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = r10
                boolean r2 = r2.isConnected()
                r3 = 17
                r4 = -1
                r5 = r10
                int r5 = r5.getType()
                r6 = r10
                int r6 = r6.getSubtype()
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L7b:
                r0 = r10
                int r0 = r0.getType()
                r1 = 17
                if (r0 != r1) goto Ld7
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto Lc6
                r0 = r9
                r1 = r8
                android.net.ConnectivityManager r1 = r1.connectivityManager
                android.net.Network r1 = r1.getActiveNetwork()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lc6
                r0 = r8
                android.net.ConnectivityManager r0 = r0.connectivityManager
                android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
                r11 = r0
                r0 = r11
                if (r0 == 0) goto Lc6
                r0 = r11
                int r0 = r0.getType()
                r1 = 17
                if (r0 == r1) goto Lc6
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = r10
                boolean r2 = r2.isConnected()
                r3 = 17
                r4 = -1
                r5 = r11
                int r5 = r5.getType()
                r6 = r11
                int r6 = r6.getSubtype()
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            Lc6:
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = r10
                boolean r2 = r2.isConnected()
                r3 = 17
                r4 = -1
                r5 = -1
                r6 = -1
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            Ld7:
                r0 = r8
                r1 = r10
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getNetworkState(r1)
                return r0
        }

        private org.webrtc.NetworkMonitorAutoDetect.NetworkState getNetworkState(@androidx.annotation.Nullable android.net.NetworkInfo r9) {
                r8 = this;
                r0 = r9
                if (r0 == 0) goto Lb
                r0 = r9
                boolean r0 = r0.isConnected()
                if (r0 != 0) goto L18
            Lb:
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = 0
                r3 = -1
                r4 = -1
                r5 = -1
                r6 = -1
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L18:
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = new org.webrtc.NetworkMonitorAutoDetect$NetworkState
                r1 = r0
                r2 = 1
                r3 = r9
                int r3 = r3.getType()
                r4 = r9
                int r4 = r4.getSubtype()
                r5 = -1
                r6 = -1
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        android.net.Network[] getAllNetworks() {
                r3 = this;
                r0 = r3
                android.net.ConnectivityManager r0 = r0.connectivityManager
                if (r0 != 0) goto Lc
                r0 = 0
                android.net.Network[] r0 = new android.net.Network[r0]
                return r0
            Lc:
                r0 = r3
                boolean r0 = r0.supportNetworkCallback()
                if (r0 == 0) goto L39
                r0 = r3
                boolean r0 = r0.getAllNetworksFromCache
                if (r0 == 0) goto L39
                r0 = r3
                java.util.Set<android.net.Network> r0 = r0.availableNetworks
                r1 = r0
                r4 = r1
                monitor-enter(r0)
                r0 = r3
                java.util.Set<android.net.Network> r0 = r0.availableNetworks     // Catch: java.lang.Throwable -> L34
                r1 = 0
                android.net.Network[] r1 = new android.net.Network[r1]     // Catch: java.lang.Throwable -> L34
                java.lang.Object[] r0 = r0.toArray(r1)     // Catch: java.lang.Throwable -> L34
                android.net.Network[] r0 = (android.net.Network[]) r0     // Catch: java.lang.Throwable -> L34
                r1 = r4
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
                return r0
            L34:
                r5 = move-exception
                r0 = r4
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
                r0 = r5
                throw r0
            L39:
                r0 = r3
                android.net.ConnectivityManager r0 = r0.connectivityManager
                android.net.Network[] r0 = r0.getAllNetworks()
                return r0
        }

        @androidx.annotation.Nullable
        java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
                r3 = this;
                r0 = r3
                boolean r0 = r0.supportNetworkCallback()
                if (r0 != 0) goto L9
                r0 = 0
                return r0
            L9:
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r3
                android.net.Network[] r0 = r0.getAllNetworks()
                r5 = r0
                r0 = r5
                int r0 = r0.length
                r6 = r0
                r0 = 0
                r7 = r0
            L1c:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L42
                r0 = r5
                r1 = r7
                r0 = r0[r1]
                r8 = r0
                r0 = r3
                r1 = r8
                org.webrtc.NetworkChangeDetector$NetworkInformation r0 = r0.networkToInfo(r1)
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L3c
                r0 = r4
                r1 = r9
                boolean r0 = r0.add(r1)
            L3c:
                int r7 = r7 + 1
                goto L1c
            L42:
                r0 = r4
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        long getDefaultNetId() {
                r5 = this;
                r0 = r5
                boolean r0 = r0.supportNetworkCallback()
                if (r0 != 0) goto Lb
                r0 = -1
                return r0
            Lb:
                r0 = r5
                android.net.ConnectivityManager r0 = r0.connectivityManager
                android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
                r6 = r0
                r0 = r6
                if (r0 != 0) goto L1b
                r0 = -1
                return r0
            L1b:
                r0 = r5
                android.net.Network[] r0 = r0.getAllNetworks()
                r7 = r0
                r0 = -1
                r8 = r0
                r0 = r7
                r10 = r0
                r0 = r10
                int r0 = r0.length
                r11 = r0
                r0 = 0
                r12 = r0
            L2f:
                r0 = r12
                r1 = r11
                if (r0 >= r1) goto L83
                r0 = r10
                r1 = r12
                r0 = r0[r1]
                r13 = r0
                r0 = r5
                r1 = r13
                boolean r0 = r0.hasInternetCapability(r1)
                if (r0 != 0) goto L49
                goto L7d
            L49:
                r0 = r5
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r13
                android.net.NetworkInfo r0 = r0.getNetworkInfo(r1)
                r14 = r0
                r0 = r14
                if (r0 == 0) goto L7d
                r0 = r14
                int r0 = r0.getType()
                r1 = r6
                int r1 = r1.getType()
                if (r0 != r1) goto L7d
                r0 = r8
                r1 = -1
                int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r0 == 0) goto L77
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                r1 = r0
                java.lang.String r2 = "Multiple connected networks of same type are not supported."
                r1.<init>(r2)
                throw r0
            L77:
                r0 = r13
                long r0 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r0)
                r8 = r0
            L7d:
                int r12 = r12 + 1
                goto L2f
            L83:
                r0 = r8
                return r0
        }

        @androidx.annotation.Nullable
        @android.annotation.SuppressLint({"NewApi"})
        private org.webrtc.NetworkChangeDetector.NetworkInformation networkToInfo(@androidx.annotation.Nullable android.net.Network r11) {
                r10 = this;
                r0 = r11
                if (r0 == 0) goto Lb
                r0 = r10
                android.net.ConnectivityManager r0 = r0.connectivityManager
                if (r0 != 0) goto Ld
            Lb:
                r0 = 0
                return r0
            Ld:
                r0 = r10
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r11
                android.net.LinkProperties r0 = r0.getLinkProperties(r1)
                r12 = r0
                r0 = r12
                if (r0 != 0) goto L2a
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r11
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = "Detected unknown network: " + r1
                org.webrtc.Logging.w(r0, r1)
                r0 = 0
                return r0
            L2a:
                r0 = r12
                java.lang.String r0 = r0.getInterfaceName()
                if (r0 != 0) goto L41
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r11
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = "Null interface name for network " + r1
                org.webrtc.Logging.w(r0, r1)
                r0 = 0
                return r0
            L41:
                r0 = r10
                r1 = r11
                org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getNetworkState(r1)
                r13 = r0
                r0 = r13
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkMonitorAutoDetect.getConnectionType(r0)
                r14 = r0
                r0 = r14
                org.webrtc.NetworkChangeDetector$ConnectionType r1 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE
                if (r0 != r1) goto L65
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r11
                java.lang.String r1 = r1.toString()
                java.lang.String r1 = "Network " + r1 + " is disconnected"
                org.webrtc.Logging.d(r0, r1)
                r0 = 0
                return r0
            L65:
                r0 = r14
                org.webrtc.NetworkChangeDetector$ConnectionType r1 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN
                if (r0 == r1) goto L75
                r0 = r14
                org.webrtc.NetworkChangeDetector$ConnectionType r1 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR
                if (r0 != r1) goto L8d
            L75:
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r11
                java.lang.String r1 = r1.toString()
                r2 = r14
                r3 = r13
                int r3 = r3.getNetworkType()
                r4 = r13
                int r4 = r4.getNetworkSubType()
                java.lang.String r1 = "Network " + r1 + " connection type is " + r2 + " because it has type " + r3 + " and subtype " + r4
                org.webrtc.Logging.d(r0, r1)
            L8d:
                r0 = r13
                org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkMonitorAutoDetect.getUnderlyingConnectionTypeForVpn(r0)
                r15 = r0
                org.webrtc.NetworkChangeDetector$NetworkInformation r0 = new org.webrtc.NetworkChangeDetector$NetworkInformation
                r1 = r0
                r2 = r12
                java.lang.String r2 = r2.getInterfaceName()
                r3 = r14
                r4 = r15
                r5 = r11
                long r5 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r5)
                r6 = r10
                r7 = r12
                org.webrtc.NetworkChangeDetector$IPAddress[] r6 = r6.getIPAddresses(r7)
                r1.<init>(r2, r3, r4, r5, r6)
                r16 = r0
                r0 = r16
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        boolean hasInternetCapability(android.net.Network r4) {
                r3 = this;
                r0 = r3
                android.net.ConnectivityManager r0 = r0.connectivityManager
                if (r0 != 0) goto L9
                r0 = 0
                return r0
            L9:
                r0 = r3
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r4
                android.net.NetworkCapabilities r0 = r0.getNetworkCapabilities(r1)
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L23
                r0 = r5
                r1 = 12
                boolean r0 = r0.hasCapability(r1)
                if (r0 == 0) goto L23
                r0 = 1
                goto L24
            L23:
                r0 = 0
            L24:
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        @androidx.annotation.VisibleForTesting
        android.net.NetworkRequest createNetworkRequest() {
                r3 = this;
                android.net.NetworkRequest$Builder r0 = new android.net.NetworkRequest$Builder
                r1 = r0
                r1.<init>()
                r1 = 12
                android.net.NetworkRequest$Builder r0 = r0.addCapability(r1)
                r4 = r0
                r0 = r3
                boolean r0 = r0.requestVPN
                if (r0 == 0) goto L1b
                r0 = r4
                r1 = 15
                android.net.NetworkRequest$Builder r0 = r0.removeCapability(r1)
            L1b:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 31
                if (r0 < r1) goto L30
                r0 = r3
                boolean r0 = r0.includeOtherUidNetworks
                if (r0 == 0) goto L30
                r0 = r4
                r1 = 1
                android.net.NetworkRequest$Builder r0 = r0.setIncludeOtherUidNetworks(r1)
            L30:
                r0 = r4
                android.net.NetworkRequest r0 = r0.build()
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        public void registerNetworkCallback(android.net.ConnectivityManager.NetworkCallback r5) {
                r4 = this;
                r0 = r4
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r4
                android.net.NetworkRequest r1 = r1.createNetworkRequest()
                r2 = r5
                r0.registerNetworkCallback(r1, r2)
                return
        }

        @android.annotation.SuppressLint({"NewApi"})
        public void requestMobileNetwork(android.net.ConnectivityManager.NetworkCallback r5) {
                r4 = this;
                android.net.NetworkRequest$Builder r0 = new android.net.NetworkRequest$Builder
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r6
                r1 = 12
                android.net.NetworkRequest$Builder r0 = r0.addCapability(r1)
                r1 = 0
                android.net.NetworkRequest$Builder r0 = r0.addTransportType(r1)
                r0 = r4
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r6
                android.net.NetworkRequest r1 = r1.build()
                r2 = r5
                r0.requestNetwork(r1, r2)
                return
        }

        @android.annotation.SuppressLint({"NewApi"})
        org.webrtc.NetworkChangeDetector.IPAddress[] getIPAddresses(android.net.LinkProperties r7) {
                r6 = this;
                r0 = r7
                java.util.List r0 = r0.getLinkAddresses()
                int r0 = r0.size()
                org.webrtc.NetworkChangeDetector$IPAddress[] r0 = new org.webrtc.NetworkChangeDetector.IPAddress[r0]
                r8 = r0
                r0 = 0
                r9 = r0
                r0 = r7
                java.util.List r0 = r0.getLinkAddresses()
                java.util.Iterator r0 = r0.iterator()
                r10 = r0
            L1a:
                r0 = r10
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L48
                r0 = r10
                java.lang.Object r0 = r0.next()
                android.net.LinkAddress r0 = (android.net.LinkAddress) r0
                r11 = r0
                r0 = r8
                r1 = r9
                org.webrtc.NetworkChangeDetector$IPAddress r2 = new org.webrtc.NetworkChangeDetector$IPAddress
                r3 = r2
                r4 = r11
                java.net.InetAddress r4 = r4.getAddress()
                byte[] r4 = r4.getAddress()
                r3.<init>(r4)
                r0[r1] = r2
                int r9 = r9 + 1
                goto L1a
            L48:
                r0 = r8
                return r0
        }

        @android.annotation.SuppressLint({"NewApi"})
        public void releaseCallback(android.net.ConnectivityManager.NetworkCallback r4) {
                r3 = this;
                r0 = r3
                boolean r0 = r0.supportNetworkCallback()
                if (r0 == 0) goto L17
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                java.lang.String r1 = "Unregister network callback"
                org.webrtc.Logging.d(r0, r1)
                r0 = r3
                android.net.ConnectivityManager r0 = r0.connectivityManager
                r1 = r4
                r0.unregisterNetworkCallback(r1)
            L17:
                return
        }

        public boolean supportNetworkCallback() {
                r2 = this;
                r0 = r2
                android.net.ConnectivityManager r0 = r0.connectivityManager
                if (r0 == 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitorAutoDetect$NetworkState.class */
    static class NetworkState {
        private final boolean connected;
        private final int type;
        private final int subtype;
        private final int underlyingNetworkTypeForVpn;
        private final int underlyingNetworkSubtypeForVpn;

        public NetworkState(boolean r4, int r5, int r6, int r7, int r8) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.connected = r1
                r0 = r3
                r1 = r5
                r0.type = r1
                r0 = r3
                r1 = r6
                r0.subtype = r1
                r0 = r3
                r1 = r7
                r0.underlyingNetworkTypeForVpn = r1
                r0 = r3
                r1 = r8
                r0.underlyingNetworkSubtypeForVpn = r1
                return
        }

        public boolean isConnected() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.connected
                return r0
        }

        public int getNetworkType() {
                r2 = this;
                r0 = r2
                int r0 = r0.type
                return r0
        }

        public int getNetworkSubType() {
                r2 = this;
                r0 = r2
                int r0 = r0.subtype
                return r0
        }

        public int getUnderlyingNetworkTypeForVpn() {
                r2 = this;
                r0 = r2
                int r0 = r0.underlyingNetworkTypeForVpn
                return r0
        }

        public int getUnderlyingNetworkSubtypeForVpn() {
                r2 = this;
                r0 = r2
                int r0 = r0.underlyingNetworkSubtypeForVpn
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitorAutoDetect$SimpleNetworkCallback.class */
    @android.annotation.SuppressLint({"NewApi"})
    @androidx.annotation.VisibleForTesting
    class SimpleNetworkCallback extends android.net.ConnectivityManager.NetworkCallback {

        @androidx.annotation.GuardedBy("availableNetworks")
        final java.util.Set<android.net.Network> availableNetworks;
        final /* synthetic */ org.webrtc.NetworkMonitorAutoDetect this$0;

        SimpleNetworkCallback(org.webrtc.NetworkMonitorAutoDetect r4, java.util.Set<android.net.Network> r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.availableNetworks = r1
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(android.net.Network r6) {
                r5 = this;
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r6
                long r1 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r1)
                r2 = r6
                java.lang.String r2 = r2.toString()
                java.lang.String r1 = "Network handle: " + r1 + " becomes available: " + r0
                org.webrtc.Logging.d(r0, r1)
                r0 = r5
                java.util.Set<android.net.Network> r0 = r0.availableNetworks
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r5
                java.util.Set<android.net.Network> r0 = r0.availableNetworks     // Catch: java.lang.Throwable -> L29
                r1 = r6
                boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L29
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                goto L2e
            L29:
                r8 = move-exception
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                r0 = r8
                throw r0
            L2e:
                r0 = r5
                r1 = r6
                r0.onNetworkChanged(r1)
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(android.net.Network r6, android.net.NetworkCapabilities r7) {
                r5 = this;
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r6
                long r1 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r1)
                r2 = r7
                java.lang.String r2 = r2.toString()
                java.lang.String r1 = "handle: " + r1 + " capabilities changed: " + r0
                org.webrtc.Logging.d(r0, r1)
                r0 = r5
                r1 = r6
                r0.onNetworkChanged(r1)
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(android.net.Network r5, android.net.LinkProperties r6) {
                r4 = this;
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r5
                long r1 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r1)
                java.lang.String r1 = "handle: " + r1 + " link properties changed"
                org.webrtc.Logging.d(r0, r1)
                r0 = r4
                r1 = r5
                r0.onNetworkChanged(r1)
                return
        }

        public void onLosing(android.net.Network r7, int r8) {
                r6 = this;
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r7
                long r1 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r1)
                r2 = r7
                java.lang.String r2 = r2.toString()
                r3 = r8
                java.lang.String r1 = "Network handle: " + r1 + ", " + r0 + " is about to lose in " + r2 + "ms"
                org.webrtc.Logging.d(r0, r1)
                return
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(android.net.Network r6) {
                r5 = this;
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                r1 = r6
                long r1 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r1)
                r2 = r6
                java.lang.String r2 = r2.toString()
                java.lang.String r1 = "Network handle: " + r1 + ", " + r0 + " is disconnected"
                org.webrtc.Logging.d(r0, r1)
                r0 = r5
                java.util.Set<android.net.Network> r0 = r0.availableNetworks
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r5
                java.util.Set<android.net.Network> r0 = r0.availableNetworks     // Catch: java.lang.Throwable -> L29
                r1 = r6
                boolean r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L29
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                goto L2e
            L29:
                r8 = move-exception
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L29
                r0 = r8
                throw r0
            L2e:
                r0 = r5
                org.webrtc.NetworkMonitorAutoDetect r0 = r0.this$0
                org.webrtc.NetworkChangeDetector$Observer r0 = r0.observer
                r1 = r6
                long r1 = org.webrtc.NetworkMonitorAutoDetect.networkToNetId(r1)
                r0.onNetworkDisconnect(r1)
                return
        }

        private void onNetworkChanged(android.net.Network r4) {
                r3 = this;
                r0 = r3
                org.webrtc.NetworkMonitorAutoDetect r0 = r0.this$0
                org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
                r1 = r4
                org.webrtc.NetworkChangeDetector$NetworkInformation r0 = r0.networkToInfo(r1)
                r5 = r0
                r0 = r5
                if (r0 == 0) goto L1b
                r0 = r3
                org.webrtc.NetworkMonitorAutoDetect r0 = r0.this$0
                org.webrtc.NetworkChangeDetector$Observer r0 = r0.observer
                r1 = r5
                r0.onNetworkConnect(r1)
            L1b:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitorAutoDetect$WifiDirectManagerDelegate.class */
    static class WifiDirectManagerDelegate extends android.content.BroadcastReceiver {
        private static final int WIFI_P2P_NETWORK_HANDLE = 0;
        private final android.content.Context context;
        private final org.webrtc.NetworkChangeDetector.Observer observer;

        @androidx.annotation.Nullable
        private org.webrtc.NetworkChangeDetector.NetworkInformation wifiP2pNetworkInfo;

        WifiDirectManagerDelegate(org.webrtc.NetworkChangeDetector.Observer r6, android.content.Context r7) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r7
                r0.context = r1
                r0 = r5
                r1 = r6
                r0.observer = r1
                android.content.IntentFilter r0 = new android.content.IntentFilter
                r1 = r0
                r1.<init>()
                r8 = r0
                r0 = r8
                java.lang.String r1 = "android.net.wifi.p2p.STATE_CHANGED"
                r0.addAction(r1)
                r0 = r8
                java.lang.String r1 = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE"
                r0.addAction(r1)
                r0 = r7
                r1 = r5
                r2 = r8
                android.content.Intent r0 = r0.registerReceiver(r1, r2)
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 <= r1) goto L56
                r0 = r7
                java.lang.String r1 = "wifip2p"
                java.lang.Object r0 = r0.getSystemService(r1)
                android.net.wifi.p2p.WifiP2pManager r0 = (android.net.wifi.p2p.WifiP2pManager) r0
                r9 = r0
                r0 = r9
                r1 = r7
                r2 = r7
                android.os.Looper r2 = r2.getMainLooper()
                r3 = 0
                android.net.wifi.p2p.WifiP2pManager$Channel r0 = r0.initialize(r1, r2, r3)
                r10 = r0
                r0 = r9
                r1 = r10
                r2 = r5
                void r2 = (v1) -> { // android.net.wifi.p2p.WifiP2pManager.GroupInfoListener.onGroupInfoAvailable(android.net.wifi.p2p.WifiP2pGroup):void
                    r2.lambda$new$0(v1);
                }
                r0.requestGroupInfo(r1, r2)
            L56:
                return
        }

        @Override // android.content.BroadcastReceiver
        @android.annotation.SuppressLint({"InlinedApi"})
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
                r4 = this;
                java.lang.String r0 = "android.net.wifi.p2p.CONNECTION_STATE_CHANGE"
                r1 = r6
                java.lang.String r1 = r1.getAction()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1e
                r0 = r6
                java.lang.String r1 = "p2pGroupInfo"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.net.wifi.p2p.WifiP2pGroup r0 = (android.net.wifi.p2p.WifiP2pGroup) r0
                r7 = r0
                r0 = r4
                r1 = r7
                r0.onWifiP2pGroupChange(r1)
                goto L37
            L1e:
                java.lang.String r0 = "android.net.wifi.p2p.STATE_CHANGED"
                r1 = r6
                java.lang.String r1 = r1.getAction()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L37
                r0 = r6
                java.lang.String r1 = "wifi_p2p_state"
                r2 = 0
                int r0 = r0.getIntExtra(r1, r2)
                r7 = r0
                r0 = r4
                r1 = r7
                r0.onWifiP2pStateChange(r1)
            L37:
                return
        }

        public void release() {
                r3 = this;
                r0 = r3
                android.content.Context r0 = r0.context
                r1 = r3
                r0.unregisterReceiver(r1)
                return
        }

        public java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
                r2 = this;
                r0 = r2
                org.webrtc.NetworkChangeDetector$NetworkInformation r0 = r0.wifiP2pNetworkInfo
                if (r0 == 0) goto Lf
                r0 = r2
                org.webrtc.NetworkChangeDetector$NetworkInformation r0 = r0.wifiP2pNetworkInfo
                java.util.List r0 = java.util.Collections.singletonList(r0)
                return r0
            Lf:
                java.util.List r0 = java.util.Collections.emptyList()
                return r0
        }

        private void onWifiP2pGroupChange(@androidx.annotation.Nullable android.net.wifi.p2p.WifiP2pGroup r11) {
                r10 = this;
                r0 = r11
                if (r0 == 0) goto Lb
                r0 = r11
                java.lang.String r0 = r0.getInterface()
                if (r0 != 0) goto Lc
            Lb:
                return
            Lc:
                r0 = r11
                java.lang.String r0 = r0.getInterface()     // Catch: java.net.SocketException -> L17
                java.net.NetworkInterface r0 = java.net.NetworkInterface.getByName(r0)     // Catch: java.net.SocketException -> L17
                r12 = r0
                goto L21
            L17:
                r13 = move-exception
                java.lang.String r0 = "NetworkMonitorAutoDetect"
                java.lang.String r1 = "Unable to get WifiP2p network interface"
                r2 = r13
                org.webrtc.Logging.e(r0, r1, r2)
                return
            L21:
                r0 = r12
                java.util.Enumeration r0 = r0.getInetAddresses()
                java.util.ArrayList r0 = java.util.Collections.list(r0)
                r13 = r0
                r0 = r13
                int r0 = r0.size()
                org.webrtc.NetworkChangeDetector$IPAddress[] r0 = new org.webrtc.NetworkChangeDetector.IPAddress[r0]
                r14 = r0
                r0 = 0
                r15 = r0
            L37:
                r0 = r15
                r1 = r13
                int r1 = r1.size()
                if (r0 >= r1) goto L62
                r0 = r14
                r1 = r15
                org.webrtc.NetworkChangeDetector$IPAddress r2 = new org.webrtc.NetworkChangeDetector$IPAddress
                r3 = r2
                r4 = r13
                r5 = r15
                java.lang.Object r4 = r4.get(r5)
                java.net.InetAddress r4 = (java.net.InetAddress) r4
                byte[] r4 = r4.getAddress()
                r3.<init>(r4)
                r0[r1] = r2
                int r15 = r15 + 1
                goto L37
            L62:
                r0 = r10
                org.webrtc.NetworkChangeDetector$NetworkInformation r1 = new org.webrtc.NetworkChangeDetector$NetworkInformation
                r2 = r1
                r3 = r11
                java.lang.String r3 = r3.getInterface()
                org.webrtc.NetworkChangeDetector$ConnectionType r4 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI
                org.webrtc.NetworkChangeDetector$ConnectionType r5 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE
                r6 = 0
                r7 = r14
                r2.<init>(r3, r4, r5, r6, r7)
                r0.wifiP2pNetworkInfo = r1
                r0 = r10
                org.webrtc.NetworkChangeDetector$Observer r0 = r0.observer
                r1 = r10
                org.webrtc.NetworkChangeDetector$NetworkInformation r1 = r1.wifiP2pNetworkInfo
                r0.onNetworkConnect(r1)
                return
        }

        private void onWifiP2pStateChange(int r5) {
                r4 = this;
                r0 = r5
                r1 = 1
                if (r0 != r1) goto L12
                r0 = r4
                r1 = 0
                r0.wifiP2pNetworkInfo = r1
                r0 = r4
                org.webrtc.NetworkChangeDetector$Observer r0 = r0.observer
                r1 = 0
                r0.onNetworkDisconnect(r1)
            L12:
                return
        }

        private /* synthetic */ void lambda$new$0(android.net.wifi.p2p.WifiP2pGroup r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.onWifiP2pGroupChange(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitorAutoDetect$WifiManagerDelegate.class */
    static class WifiManagerDelegate {

        @androidx.annotation.Nullable
        private final android.content.Context context;

        WifiManagerDelegate(android.content.Context r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.context = r1
                return
        }

        WifiManagerDelegate() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.context = r1
                return
        }

        java.lang.String getWifiSSID() {
                r6 = this;
                r0 = r6
                android.content.Context r0 = r0.context
                r1 = 0
                android.content.IntentFilter r2 = new android.content.IntentFilter
                r3 = r2
                java.lang.String r4 = "android.net.wifi.STATE_CHANGE"
                r3.<init>(r4)
                android.content.Intent r0 = r0.registerReceiver(r1, r2)
                r7 = r0
                r0 = r7
                if (r0 == 0) goto L2f
                r0 = r7
                java.lang.String r1 = "wifiInfo"
                android.os.Parcelable r0 = r0.getParcelableExtra(r1)
                android.net.wifi.WifiInfo r0 = (android.net.wifi.WifiInfo) r0
                r8 = r0
                r0 = r8
                if (r0 == 0) goto L2f
                r0 = r8
                java.lang.String r0 = r0.getSSID()
                r9 = r0
                r0 = r9
                if (r0 == 0) goto L2f
                r0 = r9
                return r0
            L2f:
                java.lang.String r0 = ""
                return r0
        }
    }

    @android.annotation.SuppressLint({"NewApi"})
    public NetworkMonitorAutoDetect(org.webrtc.NetworkChangeDetector.Observer r8, android.content.Context r9) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            java.util.HashSet r1 = new java.util.HashSet
            r2 = r1
            r2.<init>()
            r0.availableNetworks = r1
            r0 = r7
            r1 = r8
            r0.observer = r1
            r0 = r7
            r1 = r9
            r0.context = r1
            r0 = r8
            java.lang.String r0 = r0.getFieldTrialsString()
            r10 = r0
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r1 = new org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate
            r2 = r1
            r3 = r9
            r4 = r7
            java.util.Set<android.net.Network> r4 = r4.availableNetworks
            r5 = r10
            r2.<init>(r3, r4, r5)
            r0.connectivityManagerDelegate = r1
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$WifiManagerDelegate r1 = new org.webrtc.NetworkMonitorAutoDetect$WifiManagerDelegate
            r2 = r1
            r3 = r9
            r2.<init>(r3)
            r0.wifiManagerDelegate = r1
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getNetworkState()
            r11 = r0
            r0 = r7
            r1 = r11
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = getConnectionType(r1)
            r0.connectionType = r1
            r0 = r7
            r1 = r7
            r2 = r11
            java.lang.String r1 = r1.getWifiSSID(r2)
            r0.wifiSSID = r1
            r0 = r7
            android.content.IntentFilter r1 = new android.content.IntentFilter
            r2 = r1
            java.lang.String r3 = "android.net.conn.CONNECTIVITY_CHANGE"
            r2.<init>(r3)
            r0.intentFilter = r1
            boolean r0 = org.webrtc.NetworkMonitorAutoDetect.includeWifiDirect
            if (r0 == 0) goto L77
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate r1 = new org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate
            r2 = r1
            r3 = r8
            r4 = r9
            r2.<init>(r3, r4)
            r0.wifiDirectManagerDelegate = r1
        L77:
            r0 = r7
            r0.registerReceiver()
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            boolean r0 = r0.supportNetworkCallback()
            if (r0 == 0) goto Lca
            android.net.ConnectivityManager$NetworkCallback r0 = new android.net.ConnectivityManager$NetworkCallback
            r1 = r0
            r1.<init>()
            r12 = r0
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate     // Catch: java.lang.SecurityException -> L9a
            r1 = r12
            r0.requestMobileNetwork(r1)     // Catch: java.lang.SecurityException -> L9a
            goto La6
        L9a:
            r13 = move-exception
            java.lang.String r0 = "NetworkMonitorAutoDetect"
            java.lang.String r1 = "Unable to obtain permission to request a cellular network."
            org.webrtc.Logging.w(r0, r1)
            r0 = 0
            r12 = r0
        La6:
            r0 = r7
            r1 = r12
            r0.mobileNetworkCallback = r1
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$SimpleNetworkCallback r1 = new org.webrtc.NetworkMonitorAutoDetect$SimpleNetworkCallback
            r2 = r1
            r3 = r7
            r4 = r7
            java.util.Set<android.net.Network> r4 = r4.availableNetworks
            r2.<init>(r3, r4)
            r0.allNetworkCallback = r1
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            r1 = r7
            android.net.ConnectivityManager$NetworkCallback r1 = r1.allNetworkCallback
            r0.registerNetworkCallback(r1)
            goto Ld4
        Lca:
            r0 = r7
            r1 = 0
            r0.mobileNetworkCallback = r1
            r0 = r7
            r1 = 0
            r0.allNetworkCallback = r1
        Ld4:
            return
    }

    public static void setIncludeWifiDirect(boolean r2) {
            r0 = r2
            org.webrtc.NetworkMonitorAutoDetect.includeWifiDirect = r0
            return
    }

    @Override // org.webrtc.NetworkChangeDetector
    public boolean supportNetworkCallback() {
            r2 = this;
            r0 = r2
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            boolean r0 = r0.supportNetworkCallback()
            return r0
    }

    void setConnectivityManagerDelegateForTests(org.webrtc.NetworkMonitorAutoDetect.ConnectivityManagerDelegate r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.connectivityManagerDelegate = r1
            return
    }

    void setWifiManagerDelegateForTests(org.webrtc.NetworkMonitorAutoDetect.WifiManagerDelegate r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.wifiManagerDelegate = r1
            return
    }

    boolean isReceiverRegisteredForTesting() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isRegistered
            return r0
    }

    @Override // org.webrtc.NetworkChangeDetector
    @androidx.annotation.Nullable
    public java.util.List<org.webrtc.NetworkChangeDetector.NetworkInformation> getActiveNetworkList() {
            r4 = this;
            r0 = r4
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            java.util.List r0 = r0.getActiveNetworkList()
            r5 = r0
            r0 = r5
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate r0 = r0.wifiDirectManagerDelegate
            if (r0 == 0) goto L2a
            r0 = r6
            r1 = r4
            org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate r1 = r1.wifiDirectManagerDelegate
            java.util.List r1 = r1.getActiveNetworkList()
            boolean r0 = r0.addAll(r1)
        L2a:
            r0 = r6
            return r0
    }

    @Override // org.webrtc.NetworkChangeDetector
    public void destroy() {
            r3 = this;
            r0 = r3
            android.net.ConnectivityManager$NetworkCallback r0 = r0.allNetworkCallback
            if (r0 == 0) goto L12
            r0 = r3
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            r1 = r3
            android.net.ConnectivityManager$NetworkCallback r1 = r1.allNetworkCallback
            r0.releaseCallback(r1)
        L12:
            r0 = r3
            android.net.ConnectivityManager$NetworkCallback r0 = r0.mobileNetworkCallback
            if (r0 == 0) goto L24
            r0 = r3
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            r1 = r3
            android.net.ConnectivityManager$NetworkCallback r1 = r1.mobileNetworkCallback
            r0.releaseCallback(r1)
        L24:
            r0 = r3
            org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate r0 = r0.wifiDirectManagerDelegate
            if (r0 == 0) goto L32
            r0 = r3
            org.webrtc.NetworkMonitorAutoDetect$WifiDirectManagerDelegate r0 = r0.wifiDirectManagerDelegate
            r0.release()
        L32:
            r0 = r3
            r0.unregisterReceiver()
            return
    }

    private void registerReceiver() {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isRegistered
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r4
            r1 = 1
            r0.isRegistered = r1
            r0 = r4
            android.content.Context r0 = r0.context
            r1 = r4
            r2 = r4
            android.content.IntentFilter r2 = r2.intentFilter
            android.content.Intent r0 = r0.registerReceiver(r1, r2)
            return
    }

    private void unregisterReceiver() {
            r3 = this;
            r0 = r3
            boolean r0 = r0.isRegistered
            if (r0 != 0) goto L8
            return
        L8:
            r0 = r3
            r1 = 0
            r0.isRegistered = r1
            r0 = r3
            android.content.Context r0 = r0.context
            r1 = r3
            r0.unregisterReceiver(r1)
            return
    }

    public org.webrtc.NetworkMonitorAutoDetect.NetworkState getCurrentNetworkState() {
            r2 = this;
            r0 = r2
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getNetworkState()
            return r0
    }

    public long getDefaultNetId() {
            r3 = this;
            r0 = r3
            org.webrtc.NetworkMonitorAutoDetect$ConnectivityManagerDelegate r0 = r0.connectivityManagerDelegate
            long r0 = r0.getDefaultNetId()
            return r0
    }

    private static org.webrtc.NetworkChangeDetector.ConnectionType getConnectionType(boolean r2, int r3, int r4) {
            r0 = r2
            if (r0 != 0) goto L8
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE
            return r0
        L8:
            r0 = r3
            switch(r0) {
                case 0: goto L70;
                case 1: goto L64;
                case 2: goto Le8;
                case 3: goto Le8;
                case 4: goto L70;
                case 5: goto L70;
                case 6: goto L68;
                case 7: goto L6c;
                case 8: goto Le8;
                case 9: goto L60;
                case 10: goto Le8;
                case 11: goto Le8;
                case 12: goto Le8;
                case 13: goto Le8;
                case 14: goto Le8;
                case 15: goto Le8;
                case 16: goto Le8;
                case 17: goto Le4;
                default: goto Le8;
            }
        L60:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_ETHERNET
            return r0
        L64:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI
            return r0
        L68:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_4G
            return r0
        L6c:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_BLUETOOTH
            return r0
        L70:
            r0 = r4
            switch(r0) {
                case 1: goto Ld0;
                case 2: goto Ld0;
                case 3: goto Ld4;
                case 4: goto Ld0;
                case 5: goto Ld4;
                case 6: goto Ld4;
                case 7: goto Ld0;
                case 8: goto Ld4;
                case 9: goto Ld4;
                case 10: goto Ld4;
                case 11: goto Ld0;
                case 12: goto Ld4;
                case 13: goto Ld8;
                case 14: goto Ld4;
                case 15: goto Ld4;
                case 16: goto Ld0;
                case 17: goto Ld4;
                case 18: goto Ld8;
                case 19: goto Le0;
                case 20: goto Ldc;
                default: goto Le0;
            }
        Ld0:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_2G
            return r0
        Ld4:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_3G
            return r0
        Ld8:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_4G
            return r0
        Ldc:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_5G
            return r0
        Le0:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN_CELLULAR
            return r0
        Le4:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_VPN
            return r0
        Le8:
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN
            return r0
    }

    public static org.webrtc.NetworkChangeDetector.ConnectionType getConnectionType(org.webrtc.NetworkMonitorAutoDetect.NetworkState r4) {
            r0 = r4
            boolean r0 = r0.isConnected()
            r1 = r4
            int r1 = r1.getNetworkType()
            r2 = r4
            int r2 = r2.getNetworkSubType()
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = getConnectionType(r0, r1, r2)
            return r0
    }

    @Override // org.webrtc.NetworkChangeDetector
    public org.webrtc.NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
            r2 = this;
            r0 = r2
            org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getCurrentNetworkState()
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = getConnectionType(r0)
            return r0
    }

    private static org.webrtc.NetworkChangeDetector.ConnectionType getUnderlyingConnectionTypeForVpn(org.webrtc.NetworkMonitorAutoDetect.NetworkState r4) {
            r0 = r4
            int r0 = r0.getNetworkType()
            r1 = 17
            if (r0 == r1) goto Ld
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE
            return r0
        Ld:
            r0 = r4
            boolean r0 = r0.isConnected()
            r1 = r4
            int r1 = r1.getUnderlyingNetworkTypeForVpn()
            r2 = r4
            int r2 = r2.getUnderlyingNetworkSubtypeForVpn()
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = getConnectionType(r0, r1, r2)
            return r0
    }

    private java.lang.String getWifiSSID(org.webrtc.NetworkMonitorAutoDetect.NetworkState r4) {
            r3 = this;
            r0 = r4
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = getConnectionType(r0)
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_WIFI
            if (r0 == r1) goto Ld
            java.lang.String r0 = ""
            return r0
        Ld:
            r0 = r3
            org.webrtc.NetworkMonitorAutoDetect$WifiManagerDelegate r0 = r0.wifiManagerDelegate
            java.lang.String r0 = r0.getWifiSSID()
            return r0
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context r4, android.content.Intent r5) {
            r3 = this;
            r0 = r3
            org.webrtc.NetworkMonitorAutoDetect$NetworkState r0 = r0.getCurrentNetworkState()
            r6 = r0
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            r1 = r5
            java.lang.String r1 = r1.getAction()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            r0 = r3
            r1 = r6
            r0.connectionTypeChanged(r1)
        L16:
            return
    }

    private void connectionTypeChanged(org.webrtc.NetworkMonitorAutoDetect.NetworkState r4) {
            r3 = this;
            r0 = r4
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = getConnectionType(r0)
            r5 = r0
            r0 = r3
            r1 = r4
            java.lang.String r0 = r0.getWifiSSID(r1)
            r6 = r0
            r0 = r5
            r1 = r3
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = r1.connectionType
            if (r0 != r1) goto L1f
            r0 = r6
            r1 = r3
            java.lang.String r1 = r1.wifiSSID
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1f
            return
        L1f:
            r0 = r3
            r1 = r5
            r0.connectionType = r1
            r0 = r3
            r1 = r6
            r0.wifiSSID = r1
            java.lang.String r0 = "NetworkMonitorAutoDetect"
            r1 = r3
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = r1.connectionType
            java.lang.String r1 = "Network connectivity changed, type is: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.NetworkChangeDetector$Observer r0 = r0.observer
            r1 = r5
            r0.onConnectionTypeChanged(r1)
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    private static long networkToNetId(android.net.Network r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto Ld
            r0 = r3
            long r0 = r0.getNetworkHandle()
            return r0
        Ld:
            r0 = r3
            java.lang.String r0 = r0.toString()
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            return r0
    }
}
