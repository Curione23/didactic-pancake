package android.net;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/NetworkRequest.class */
public class NetworkRequest {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/net/NetworkRequest$Builder.class */
    public static class Builder {
        public Builder() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public android.net.NetworkRequest.Builder addCapability(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.net.NetworkRequest.Builder removeCapability(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.net.NetworkRequest.Builder addTransportType(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.net.NetworkRequest.Builder setIncludeOtherUidNetworks(boolean r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.net.NetworkRequest build() {
                r3 = this;
                android.net.NetworkRequest r0 = new android.net.NetworkRequest
                r1 = r0
                r1.<init>()
                return r0
        }
    }

    public NetworkRequest() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
