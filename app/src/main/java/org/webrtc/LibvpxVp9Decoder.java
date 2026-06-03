package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/LibvpxVp9Decoder.class */
public class LibvpxVp9Decoder extends org.webrtc.WrappedNativeVideoDecoder {
    public LibvpxVp9Decoder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long r4) {
            r3 = this;
            long r0 = nativeCreateDecoder()
            return r0
    }

    static native long nativeCreateDecoder();

    static native boolean nativeIsSupported();
}
