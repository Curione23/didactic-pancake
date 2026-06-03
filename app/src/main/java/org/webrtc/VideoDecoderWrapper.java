package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoDecoderWrapper.class */
class VideoDecoderWrapper {
    VideoDecoderWrapper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.webrtc.CalledByNative
    static org.webrtc.VideoDecoder.Callback createDecoderCallback(long r3) {
            r0 = r3
            org.webrtc.VideoDecoder$Callback r0 = (v1, v2, v3) -> { // org.webrtc.VideoDecoder.Callback.onDecodedFrame(org.webrtc.VideoFrame, java.lang.Integer, java.lang.Integer):void
                lambda$createDecoderCallback$0(r0, v1, v2, v3);
            }
            return r0
    }

    private static native void nativeOnDecodedFrame(long r0, org.webrtc.VideoFrame r2, java.lang.Integer r3, java.lang.Integer r4);

    private static /* synthetic */ void lambda$createDecoderCallback$0(long r6, org.webrtc.VideoFrame r8, java.lang.Integer r9, java.lang.Integer r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            nativeOnDecodedFrame(r0, r1, r2, r3)
            return
    }
}
