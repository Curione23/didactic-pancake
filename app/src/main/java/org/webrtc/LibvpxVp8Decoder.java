package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/LibvpxVp8Decoder.class */
public class LibvpxVp8Decoder extends org.webrtc.WrappedNativeVideoDecoder {
    public LibvpxVp8Decoder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.WrappedNativeVideoDecoder, org.webrtc.VideoDecoder
    public long createNative(long r4) {
            r3 = this;
            r0 = r4
            long r0 = nativeCreateDecoder(r0)
            return r0
    }

    static native long nativeCreateDecoder(long r0);
}
