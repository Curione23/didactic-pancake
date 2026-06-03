package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoDecoderFactory.class */
public interface VideoDecoderFactory {
    @androidx.annotation.Nullable
    @org.webrtc.CalledByNative
    org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo r1);

    @org.webrtc.CalledByNative
    default org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
            r2 = this;
            r0 = 0
            org.webrtc.VideoCodecInfo[] r0 = new org.webrtc.VideoCodecInfo[r0]
            return r0
    }
}
