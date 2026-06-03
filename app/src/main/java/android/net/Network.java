package android.net;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/Network.class */
public class Network {
    private final long id;

    public Network() {
            r4 = this;
            r0 = r4
            r1 = 100
            r0.<init>(r1)
            return
    }

    public Network(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.id = r1
            return
    }

    public long getNetworkHandle() {
            r3 = this;
            r0 = r3
            long r0 = r0.id
            return r0
    }

    public int getNetId() {
            r3 = this;
            r0 = r3
            long r0 = r0.id
            int r0 = (int) r0
            return r0
    }

    public void bindSocket(java.net.DatagramSocket r2) throws java.io.IOException {
            r1 = this;
            return
    }

    public void bindSocket(java.net.Socket r2) throws java.io.IOException {
            r1 = this;
            return
    }

    public void bindSocket(java.io.FileDescriptor r2) throws java.io.IOException {
            r1 = this;
            return
    }

    public javax.net.SocketFactory getSocketFactory() {
            r2 = this;
            javax.net.SocketFactory r0 = javax.net.SocketFactory.getDefault()
            return r0
    }

    public java.net.URLConnection openConnection(java.net.URL r3) throws java.io.IOException {
            r2 = this;
            r0 = r3
            java.net.URLConnection r0 = r0.openConnection()
            return r0
    }

    public java.net.URLConnection openConnection(java.net.URL r4, java.net.Proxy r5) throws java.io.IOException {
            r3 = this;
            r0 = r4
            r1 = r5
            java.net.URLConnection r0 = r0.openConnection(r1)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            long r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = r6
            boolean r0 = r0 instanceof android.net.Network
            if (r0 == 0) goto L1a
            r0 = r6
            android.net.Network r0 = (android.net.Network) r0
            long r0 = r0.id
            r1 = r5
            long r1 = r1.id
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    public int hashCode() {
            r6 = this;
            r0 = r6
            long r0 = r0.id
            r1 = r6
            long r1 = r1.id
            r2 = 32
            long r1 = r1 >>> r2
            long r0 = r0 ^ r1
            int r0 = (int) r0
            return r0
    }
}
