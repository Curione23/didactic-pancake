package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtcCertificatePem.class */
public class RtcCertificatePem {
    public final java.lang.String privateKey;
    public final java.lang.String certificate;
    private static final long DEFAULT_EXPIRY = 2592000;

    @org.webrtc.CalledByNative
    public RtcCertificatePem(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.privateKey = r1
            r0 = r3
            r1 = r5
            r0.certificate = r1
            return
    }

    @org.webrtc.CalledByNative
    java.lang.String getPrivateKey() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.privateKey
            return r0
    }

    @org.webrtc.CalledByNative
    java.lang.String getCertificate() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.certificate
            return r0
    }

    public static org.webrtc.RtcCertificatePem generateCertificate() {
            org.webrtc.PeerConnection$KeyType r0 = org.webrtc.PeerConnection.KeyType.ECDSA
            r1 = 2592000(0x278d00, double:1.280618E-317)
            org.webrtc.RtcCertificatePem r0 = nativeGenerateCertificate(r0, r1)
            return r0
    }

    public static org.webrtc.RtcCertificatePem generateCertificate(org.webrtc.PeerConnection.KeyType r4) {
            r0 = r4
            r1 = 2592000(0x278d00, double:1.280618E-317)
            org.webrtc.RtcCertificatePem r0 = nativeGenerateCertificate(r0, r1)
            return r0
    }

    public static org.webrtc.RtcCertificatePem generateCertificate(long r4) {
            org.webrtc.PeerConnection$KeyType r0 = org.webrtc.PeerConnection.KeyType.ECDSA
            r1 = r4
            org.webrtc.RtcCertificatePem r0 = nativeGenerateCertificate(r0, r1)
            return r0
    }

    public static org.webrtc.RtcCertificatePem generateCertificate(org.webrtc.PeerConnection.KeyType r4, long r5) {
            r0 = r4
            r1 = r5
            org.webrtc.RtcCertificatePem r0 = nativeGenerateCertificate(r0, r1)
            return r0
    }

    private static native org.webrtc.RtcCertificatePem nativeGenerateCertificate(org.webrtc.PeerConnection.KeyType r0, long r1);
}
