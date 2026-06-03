package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionDependencies.class */
public final class PeerConnectionDependencies {
    private final org.webrtc.PeerConnection.Observer observer;
    private final org.webrtc.SSLCertificateVerifier sslCertificateVerifier;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionDependencies$Builder.class */
    public static class Builder {
        private org.webrtc.PeerConnection.Observer observer;
        private org.webrtc.SSLCertificateVerifier sslCertificateVerifier;

        private Builder(org.webrtc.PeerConnection.Observer r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.observer = r1
                return
        }

        public org.webrtc.PeerConnectionDependencies.Builder setSSLCertificateVerifier(org.webrtc.SSLCertificateVerifier r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.sslCertificateVerifier = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionDependencies createPeerConnectionDependencies() {
                r5 = this;
                org.webrtc.PeerConnectionDependencies r0 = new org.webrtc.PeerConnectionDependencies
                r1 = r0
                r2 = r5
                org.webrtc.PeerConnection$Observer r2 = r2.observer
                r3 = r5
                org.webrtc.SSLCertificateVerifier r3 = r3.sslCertificateVerifier
                r1.<init>(r2, r3)
                return r0
        }
    }

    public static org.webrtc.PeerConnectionDependencies.Builder builder(org.webrtc.PeerConnection.Observer r4) {
            org.webrtc.PeerConnectionDependencies$Builder r0 = new org.webrtc.PeerConnectionDependencies$Builder
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    org.webrtc.PeerConnection.Observer getObserver() {
            r2 = this;
            r0 = r2
            org.webrtc.PeerConnection$Observer r0 = r0.observer
            return r0
    }

    @androidx.annotation.Nullable
    org.webrtc.SSLCertificateVerifier getSSLCertificateVerifier() {
            r2 = this;
            r0 = r2
            org.webrtc.SSLCertificateVerifier r0 = r0.sslCertificateVerifier
            return r0
    }

    private PeerConnectionDependencies(org.webrtc.PeerConnection.Observer r4, org.webrtc.SSLCertificateVerifier r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.observer = r1
            r0 = r3
            r1 = r5
            r0.sslCertificateVerifier = r1
            return
    }
}
