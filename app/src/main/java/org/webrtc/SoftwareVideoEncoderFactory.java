package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SoftwareVideoEncoderFactory.class */
public class SoftwareVideoEncoderFactory implements org.webrtc.VideoEncoderFactory {
    private static final java.lang.String TAG = "SoftwareVideoEncoderFactory";
    private final long nativeFactory;


    public SoftwareVideoEncoderFactory() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            long r1 = nativeCreateFactory()
            r0.nativeFactory = r1
            return
    }

    @Override // org.webrtc.VideoEncoderFactory
    @androidx.annotation.Nullable
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r7) {
            r6 = this;
            r0 = r6
            long r0 = r0.nativeFactory
            r1 = r7
            long r0 = nativeCreateEncoder(r0, r1)
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L1c
            java.lang.String r0 = "SoftwareVideoEncoderFactory"
            r1 = r7
            java.lang.String r1 = "Trying to create encoder for unsupported format. " + r1
            org.webrtc.Logging.w(r0, r1)
            r0 = 0
            return r0
        L1c:
            org.webrtc.SoftwareVideoEncoderFactory$1 r0 = new org.webrtc.SoftwareVideoEncoderFactory$1
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
            r3 = this;
            r0 = r3
            long r0 = r0.nativeFactory
            java.util.List r0 = nativeGetSupportedCodecs(r0)
            r1 = 0
            org.webrtc.VideoCodecInfo[] r1 = new org.webrtc.VideoCodecInfo[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.webrtc.VideoCodecInfo[] r0 = (org.webrtc.VideoCodecInfo[]) r0
            return r0
    }

    private static native long nativeCreateFactory();

    private static native long nativeCreateEncoder(long r0, org.webrtc.VideoCodecInfo r2);

    private static native java.util.List<org.webrtc.VideoCodecInfo> nativeGetSupportedCodecs(long r0);
}
