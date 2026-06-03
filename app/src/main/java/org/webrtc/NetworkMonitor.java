package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitor.class */
public class NetworkMonitor {
    private static final java.lang.String TAG = "NetworkMonitor";
    private org.webrtc.NetworkChangeDetectorFactory networkChangeDetectorFactory;
    private final java.util.ArrayList<java.lang.Long> nativeNetworkObservers;
    private final java.util.ArrayList<org.webrtc.NetworkMonitor.NetworkObserver> networkObservers;
    private final java.lang.Object networkChangeDetectorLock;

    @androidx.annotation.Nullable
    private org.webrtc.NetworkChangeDetector networkChangeDetector;
    private int numObservers;
    private volatile org.webrtc.NetworkChangeDetector.ConnectionType currentConnectionType;



    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitor$InstanceHolder.class */
    private static class InstanceHolder {
        static final org.webrtc.NetworkMonitor instance = null;

        private InstanceHolder() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static {
                org.webrtc.NetworkMonitor r0 = new org.webrtc.NetworkMonitor
                r1 = r0
                r1.<init>()
                org.webrtc.NetworkMonitor.InstanceHolder.instance = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NetworkMonitor$NetworkObserver.class */
    public interface NetworkObserver {
        void onConnectionTypeChanged(org.webrtc.NetworkChangeDetector.ConnectionType r1);
    }

    private NetworkMonitor() {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.webrtc.NetworkMonitor$1 r1 = new org.webrtc.NetworkMonitor$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.networkChangeDetectorFactory = r1
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.networkChangeDetectorLock = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.nativeNetworkObservers = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.networkObservers = r1
            r0 = r5
            r1 = 0
            r0.numObservers = r1
            r0 = r5
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_UNKNOWN
            r0.currentConnectionType = r1
            return
    }

    public void setNetworkChangeDetectorFactory(org.webrtc.NetworkChangeDetectorFactory r4) {
            r3 = this;
            r0 = r3
            int r0 = r0.numObservers
            if (r0 != 0) goto Lb
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            assertIsTrue(r0)
            r0 = r3
            r1 = r4
            r0.networkChangeDetectorFactory = r1
            return
    }

    @java.lang.Deprecated
    public static void init(android.content.Context r1) {
            return
    }

    @org.webrtc.CalledByNative
    public static org.webrtc.NetworkMonitor getInstance() {
            org.webrtc.NetworkMonitor r0 = org.webrtc.NetworkMonitor.InstanceHolder.instance
            return r0
    }

    private static void assertIsTrue(boolean r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Expected to be true"
            r1.<init>(r2)
            throw r0
        Le:
            return
    }

    public void startMonitoring(android.content.Context r6, java.lang.String r7) {
            r5 = this;
            r0 = r5
            java.lang.Object r0 = r0.networkChangeDetectorLock
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            r0 = r5
            r1 = r0
            int r1 = r1.numObservers     // Catch: java.lang.Throwable -> L34
            r2 = 1
            int r1 = r1 + r2
            r0.numObservers = r1     // Catch: java.lang.Throwable -> L34
            r0 = r5
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> L34
            if (r0 != 0) goto L22
            r0 = r5
            r1 = r5
            r2 = r6
            r3 = r7
            org.webrtc.NetworkChangeDetector r1 = r1.createNetworkChangeDetector(r2, r3)     // Catch: java.lang.Throwable -> L34
            r0.networkChangeDetector = r1     // Catch: java.lang.Throwable -> L34
        L22:
            r0 = r5
            r1 = r5
            org.webrtc.NetworkChangeDetector r1 = r1.networkChangeDetector     // Catch: java.lang.Throwable -> L34
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = r1.getCurrentConnectionType()     // Catch: java.lang.Throwable -> L34
            r0.currentConnectionType = r1     // Catch: java.lang.Throwable -> L34
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            goto L3b
        L34:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
            r0 = r9
            throw r0
        L3b:
            return
    }

    @java.lang.Deprecated
    public void startMonitoring(android.content.Context r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            java.lang.String r2 = ""
            r0.startMonitoring(r1, r2)
            return
    }

    @java.lang.Deprecated
    public void startMonitoring() {
            r4 = this;
            r0 = r4
            android.content.Context r1 = org.webrtc.ContextUtils.getApplicationContext()
            java.lang.String r2 = ""
            r0.startMonitoring(r1, r2)
            return
    }

    @org.webrtc.CalledByNative
    private void startMonitoring(@androidx.annotation.Nullable android.content.Context r6, long r7, java.lang.String r9) {
            r5 = this;
            java.lang.String r0 = "NetworkMonitor"
            r1 = r7
            r2 = r9
            java.lang.String r1 = "Start monitoring with native observer " + r1 + " fieldTrialsString: " + r0
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            r1 = r6
            if (r1 == 0) goto L16
            r1 = r6
            goto L19
        L16:
            android.content.Context r1 = org.webrtc.ContextUtils.getApplicationContext()
        L19:
            r2 = r9
            r0.startMonitoring(r1, r2)
            r0 = r5
            java.util.ArrayList<java.lang.Long> r0 = r0.nativeNetworkObservers
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            r0 = r5
            java.util.ArrayList<java.lang.Long> r0 = r0.nativeNetworkObservers     // Catch: java.lang.Throwable -> L38
            r1 = r7
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L38
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L38
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            goto L40
        L38:
            r11 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            r0 = r11
            throw r0
        L40:
            r0 = r5
            r1 = r7
            r0.updateObserverActiveNetworkList(r1)
            r0 = r5
            r1 = r5
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = r1.currentConnectionType
            r0.notifyObserversOfConnectionTypeChange(r1)
            return
    }

    public void stopMonitoring() {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.networkChangeDetectorLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r4
            r1 = r0
            int r1 = r1.numObservers     // Catch: java.lang.Throwable -> L28
            r2 = 1
            int r1 = r1 - r2
            r2 = r1; r1 = r0; r0 = r2;      // Catch: java.lang.Throwable -> L28
            r1.numObservers = r2     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L23
            r0 = r4
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> L28
            r0.destroy()     // Catch: java.lang.Throwable -> L28
            r0 = r4
            r1 = 0
            r0.networkChangeDetector = r1     // Catch: java.lang.Throwable -> L28
        L23:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            goto L2d
        L28:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
            r0 = r6
            throw r0
        L2d:
            return
    }

    @org.webrtc.CalledByNative
    private void stopMonitoring(long r5) {
            r4 = this;
            java.lang.String r0 = "NetworkMonitor"
            r1 = r5
            java.lang.String r1 = "Stop monitoring with native observer " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            r0.stopMonitoring()
            r0 = r4
            java.util.ArrayList<java.lang.Long> r0 = r0.nativeNetworkObservers
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            r0 = r4
            java.util.ArrayList<java.lang.Long> r0 = r0.nativeNetworkObservers     // Catch: java.lang.Throwable -> L27
            r1 = r5
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L27
            boolean r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L27
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            goto L2e
        L27:
            r8 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            r0 = r8
            throw r0
        L2e:
            return
    }

    @org.webrtc.CalledByNative
    private boolean networkBindingSupported() {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.networkChangeDetectorLock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1e
            r0 = r3
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> L22
            boolean r0 = r0.supportNetworkCallback()     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1e
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            return r0
        L22:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
            r0 = r5
            throw r0
    }

    @org.webrtc.CalledByNative
    private static int androidSdkInt() {
            int r0 = android.os.Build.VERSION.SDK_INT
            return r0
    }

    private org.webrtc.NetworkChangeDetector.ConnectionType getCurrentConnectionType() {
            r2 = this;
            r0 = r2
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = r0.currentConnectionType
            return r0
    }

    private org.webrtc.NetworkChangeDetector createNetworkChangeDetector(android.content.Context r7, java.lang.String r8) {
            r6 = this;
            r0 = r6
            org.webrtc.NetworkChangeDetectorFactory r0 = r0.networkChangeDetectorFactory
            org.webrtc.NetworkMonitor$2 r1 = new org.webrtc.NetworkMonitor$2
            r2 = r1
            r3 = r6
            r4 = r8
            r2.<init>(r3, r4)
            r2 = r7
            org.webrtc.NetworkChangeDetector r0 = r0.create(r1, r2)
            return r0
    }

    private void updateCurrentConnectionType(org.webrtc.NetworkChangeDetector.ConnectionType r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.currentConnectionType = r1
            r0 = r3
            r1 = r4
            r0.notifyObserversOfConnectionTypeChange(r1)
            return
    }

    private void notifyObserversOfConnectionTypeChange(org.webrtc.NetworkChangeDetector.ConnectionType r5) {
            r4 = this;
            r0 = r4
            java.util.List r0 = r0.getNativeNetworkObserversSync()
            r6 = r0
            r0 = r6
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        Lc:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2c
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r8 = r0
            r0 = r4
            r1 = r8
            long r1 = r1.longValue()
            r0.nativeNotifyConnectionTypeChanged(r1)
            goto Lc
        L2c:
            r0 = r4
            java.util.ArrayList<org.webrtc.NetworkMonitor$NetworkObserver> r0 = r0.networkObservers
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L46
            r1 = r0
            r2 = r4
            java.util.ArrayList<org.webrtc.NetworkMonitor$NetworkObserver> r2 = r2.networkObservers     // Catch: java.lang.Throwable -> L46
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L46
            r7 = r0
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            goto L4e
        L46:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            r0 = r9
            throw r0
        L4e:
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L56:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L77
            r0 = r8
            java.lang.Object r0 = r0.next()
            org.webrtc.NetworkMonitor$NetworkObserver r0 = (org.webrtc.NetworkMonitor.NetworkObserver) r0
            r9 = r0
            r0 = r9
            r1 = r5
            r0.onConnectionTypeChanged(r1)
            goto L56
        L77:
            return
    }

    private void notifyObserversOfNetworkConnect(org.webrtc.NetworkChangeDetector.NetworkInformation r6) {
            r5 = this;
            r0 = r5
            java.util.List r0 = r0.getNativeNetworkObserversSync()
            r7 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        Lc:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2d
            r0 = r8
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r9 = r0
            r0 = r5
            r1 = r9
            long r1 = r1.longValue()
            r2 = r6
            r0.nativeNotifyOfNetworkConnect(r1, r2)
            goto Lc
        L2d:
            return
    }

    private void notifyObserversOfNetworkDisconnect(long r7) {
            r6 = this;
            r0 = r6
            java.util.List r0 = r0.getNativeNetworkObserversSync()
            r9 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        Ld:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L30
            r0 = r10
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r11 = r0
            r0 = r6
            r1 = r11
            long r1 = r1.longValue()
            r2 = r7
            r0.nativeNotifyOfNetworkDisconnect(r1, r2)
            goto Ld
        L30:
            return
    }

    private void notifyObserversOfNetworkPreference(java.util.List<org.webrtc.NetworkChangeDetector.ConnectionType> r7, int r8) {
            r6 = this;
            r0 = r6
            java.util.List r0 = r0.getNativeNetworkObserversSync()
            r9 = r0
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r10 = r0
        Ld:
            r0 = r10
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L53
            r0 = r10
            java.lang.Object r0 = r0.next()
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = (org.webrtc.NetworkChangeDetector.ConnectionType) r0
            r11 = r0
            r0 = r9
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L2b:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L50
            r0 = r12
            java.lang.Object r0 = r0.next()
            java.lang.Long r0 = (java.lang.Long) r0
            r13 = r0
            r0 = r6
            r1 = r13
            long r1 = r1.longValue()
            r2 = r11
            r3 = r8
            r0.nativeNotifyOfNetworkPreference(r1, r2, r3)
            goto L2b
        L50:
            goto Ld
        L53:
            return
    }

    private void updateObserverActiveNetworkList(long r6) {
            r5 = this;
            r0 = r5
            java.lang.Object r0 = r0.networkChangeDetectorLock
            r1 = r0
            r9 = r1
            monitor-enter(r0)
            r0 = r5
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L13
            r0 = 0
            goto L1c
        L13:
            r0 = r5
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> L23
            java.util.List r0 = r0.getActiveNetworkList()     // Catch: java.lang.Throwable -> L23
        L1c:
            r8 = r0
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            goto L2b
        L23:
            r10 = move-exception
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            r0 = r10
            throw r0
        L2b:
            r0 = r8
            if (r0 != 0) goto L30
            return
        L30:
            r0 = r8
            int r0 = r0.size()
            org.webrtc.NetworkChangeDetector$NetworkInformation[] r0 = new org.webrtc.NetworkChangeDetector.NetworkInformation[r0]
            r9 = r0
            r0 = r8
            r1 = r9
            java.lang.Object[] r0 = r0.toArray(r1)
            org.webrtc.NetworkChangeDetector$NetworkInformation[] r0 = (org.webrtc.NetworkChangeDetector.NetworkInformation[]) r0
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            r0.nativeNotifyOfActiveNetworkList(r1, r2)
            return
    }

    private java.util.List<java.lang.Long> getNativeNetworkObserversSync() {
            r4 = this;
            r0 = r4
            java.util.ArrayList<java.lang.Long> r0 = r0.nativeNetworkObservers
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1 = r0
            r2 = r4
            java.util.ArrayList<java.lang.Long> r2 = r2.nativeNetworkObservers     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            r1 = r5
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            return r0
        L15:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r0 = r6
            throw r0
    }

    @java.lang.Deprecated
    public static void addNetworkObserver(org.webrtc.NetworkMonitor.NetworkObserver r3) {
            org.webrtc.NetworkMonitor r0 = getInstance()
            r1 = r3
            r0.addObserver(r1)
            return
    }

    public void addObserver(org.webrtc.NetworkMonitor.NetworkObserver r4) {
            r3 = this;
            r0 = r3
            java.util.ArrayList<org.webrtc.NetworkMonitor$NetworkObserver> r0 = r0.networkObservers
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            java.util.ArrayList<org.webrtc.NetworkMonitor$NetworkObserver> r0 = r0.networkObservers     // Catch: java.lang.Throwable -> L15
            r1 = r4
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L15
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L1a
        L15:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r0 = r6
            throw r0
        L1a:
            return
    }

    @java.lang.Deprecated
    public static void removeNetworkObserver(org.webrtc.NetworkMonitor.NetworkObserver r3) {
            org.webrtc.NetworkMonitor r0 = getInstance()
            r1 = r3
            r0.removeObserver(r1)
            return
    }

    public void removeObserver(org.webrtc.NetworkMonitor.NetworkObserver r4) {
            r3 = this;
            r0 = r3
            java.util.ArrayList<org.webrtc.NetworkMonitor$NetworkObserver> r0 = r0.networkObservers
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            java.util.ArrayList<org.webrtc.NetworkMonitor$NetworkObserver> r0 = r0.networkObservers     // Catch: java.lang.Throwable -> L15
            r1 = r4
            boolean r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L15
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L1a
        L15:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            r0 = r6
            throw r0
        L1a:
            return
    }

    public static boolean isOnline() {
            org.webrtc.NetworkMonitor r0 = getInstance()
            org.webrtc.NetworkChangeDetector$ConnectionType r0 = r0.getCurrentConnectionType()
            r3 = r0
            r0 = r3
            org.webrtc.NetworkChangeDetector$ConnectionType r1 = org.webrtc.NetworkChangeDetector.ConnectionType.CONNECTION_NONE
            if (r0 == r1) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private native void nativeNotifyConnectionTypeChanged(long r1);

    private native void nativeNotifyOfNetworkConnect(long r1, org.webrtc.NetworkChangeDetector.NetworkInformation r3);

    private native void nativeNotifyOfNetworkDisconnect(long r1, long r3);

    private native void nativeNotifyOfActiveNetworkList(long r1, org.webrtc.NetworkChangeDetector.NetworkInformation[] r3);

    private native void nativeNotifyOfNetworkPreference(long r1, org.webrtc.NetworkChangeDetector.ConnectionType r3, int r4);

    @androidx.annotation.Nullable
    org.webrtc.NetworkChangeDetector getNetworkChangeDetector() {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.networkChangeDetectorLock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            org.webrtc.NetworkChangeDetector r0 = r0.networkChangeDetector     // Catch: java.lang.Throwable -> Le
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r0 = r5
            throw r0
    }

    int getNumObservers() {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.networkChangeDetectorLock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            int r0 = r0.numObservers     // Catch: java.lang.Throwable -> Le
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r0 = r5
            throw r0
    }

    static org.webrtc.NetworkMonitorAutoDetect createAndSetAutoDetectForTest(android.content.Context r4, java.lang.String r5) {
            org.webrtc.NetworkMonitor r0 = getInstance()
            r6 = r0
            r0 = r6
            r1 = r4
            r2 = r5
            org.webrtc.NetworkChangeDetector r0 = r0.createNetworkChangeDetector(r1, r2)
            r7 = r0
            r0 = r6
            r1 = r7
            r0.networkChangeDetector = r1
            r0 = r7
            org.webrtc.NetworkMonitorAutoDetect r0 = (org.webrtc.NetworkMonitorAutoDetect) r0
            return r0
    }
}
