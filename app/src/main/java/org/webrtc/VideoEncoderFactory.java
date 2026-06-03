package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoderFactory.class */
public interface VideoEncoderFactory {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoderFactory$VideoEncoderSelector.class */
    public interface VideoEncoderSelector {
        @org.webrtc.CalledByNative("VideoEncoderSelector")
        void onCurrentEncoder(org.webrtc.VideoCodecInfo r1);

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("VideoEncoderSelector")
        org.webrtc.VideoCodecInfo onAvailableBitrate(int r1);

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("VideoEncoderSelector")
        default org.webrtc.VideoCodecInfo onResolutionChange(int r3, int r4) {
                r2 = this;
                r0 = 0
                return r0
        }

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("VideoEncoderSelector")
        org.webrtc.VideoCodecInfo onEncoderBroken();
    }

    @androidx.annotation.Nullable
    @org.webrtc.CalledByNative
    org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r1);

    @org.webrtc.CalledByNative
    org.webrtc.VideoCodecInfo[] getSupportedCodecs();

    @org.webrtc.CalledByNative
    default org.webrtc.VideoCodecInfo[] getImplementations() {
            r2 = this;
            r0 = r2
            org.webrtc.VideoCodecInfo[] r0 = r0.getSupportedCodecs()
            return r0
    }

    @org.webrtc.CalledByNative
    default org.webrtc.VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
            r2 = this;
            r0 = 0
            return r0
    }
}
