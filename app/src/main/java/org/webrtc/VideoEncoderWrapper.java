package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoderWrapper.class */
class VideoEncoderWrapper {
    VideoEncoderWrapper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.webrtc.CalledByNative
    static boolean getScalingSettingsOn(org.webrtc.VideoEncoder.ScalingSettings r2) {
            r0 = r2
            boolean r0 = r0.on
            return r0
    }

    @androidx.annotation.Nullable
    @org.webrtc.CalledByNative
    static java.lang.Integer getScalingSettingsLow(org.webrtc.VideoEncoder.ScalingSettings r2) {
            r0 = r2
            java.lang.Integer r0 = r0.low
            return r0
    }

    @androidx.annotation.Nullable
    @org.webrtc.CalledByNative
    static java.lang.Integer getScalingSettingsHigh(org.webrtc.VideoEncoder.ScalingSettings r2) {
            r0 = r2
            java.lang.Integer r0 = r0.high
            return r0
    }

    @org.webrtc.CalledByNative
    static org.webrtc.VideoEncoder.Callback createEncoderCallback(long r3) {
            r0 = r3
            org.webrtc.VideoEncoder$Callback r0 = (v1, v2) -> { // org.webrtc.VideoEncoder.Callback.onEncodedFrame(org.webrtc.EncodedImage, org.webrtc.VideoEncoder$CodecSpecificInfo):void
                lambda$createEncoderCallback$0(r0, v1, v2);
            }
            return r0
    }

    private static native void nativeOnEncodedFrame(long r0, org.webrtc.EncodedImage r2);

    private static /* synthetic */ void lambda$createEncoderCallback$0(long r4, org.webrtc.EncodedImage r6, org.webrtc.VideoEncoder.CodecSpecificInfo r7) {
            r0 = r4
            r1 = r6
            nativeOnEncodedFrame(r0, r1)
            return
    }
}
