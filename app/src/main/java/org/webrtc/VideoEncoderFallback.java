package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoderFallback.class */
public class VideoEncoderFallback extends org.webrtc.WrappedNativeVideoEncoder {
    private final org.webrtc.VideoEncoder fallback;
    private final org.webrtc.VideoEncoder primary;

    public VideoEncoderFallback(org.webrtc.VideoEncoder r4, org.webrtc.VideoEncoder r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.fallback = r1
            r0 = r3
            r1 = r5
            r0.primary = r1
            return
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNativeVideoEncoder() {
            r3 = this;
            r0 = r3
            org.webrtc.VideoEncoder r0 = r0.fallback
            r1 = r3
            org.webrtc.VideoEncoder r1 = r1.primary
            long r0 = nativeCreateEncoder(r0, r1)
            return r0
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
            r2 = this;
            r0 = r2
            org.webrtc.VideoEncoder r0 = r0.primary
            boolean r0 = r0.isHardwareEncoder()
            return r0
    }

    private static native long nativeCreateEncoder(org.webrtc.VideoEncoder r0, org.webrtc.VideoEncoder r1);
}
