package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoDecoderFallback.class */
public class VideoDecoderFallback extends org.webrtc.WrappedNativeVideoDecoder {
    private final org.webrtc.VideoDecoder fallback;
    private final org.webrtc.VideoDecoder primary;

    public VideoDecoderFallback(org.webrtc.VideoDecoder r4, org.webrtc.VideoDecoder r5) {
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

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long r6) {
            r5 = this;
            r0 = r6
            r1 = r5
            org.webrtc.VideoDecoder r1 = r1.fallback
            r2 = r5
            org.webrtc.VideoDecoder r2 = r2.primary
            long r0 = nativeCreate(r0, r1, r2)
            return r0
    }

    private static native long nativeCreate(long r0, org.webrtc.VideoDecoder r2, org.webrtc.VideoDecoder r3);
}
