package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/LibvpxVp8Encoder.class */
public class LibvpxVp8Encoder extends org.webrtc.WrappedNativeVideoEncoder {
    public LibvpxVp8Encoder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public long createNativeVideoEncoder() {
            r3 = this;
            long r0 = nativeCreateEncoder()
            return r0
    }

    static native long nativeCreateEncoder();

    @Override // org.webrtc.WrappedNativeVideoEncoder, org.webrtc.VideoEncoder
    public boolean isHardwareEncoder() {
            r2 = this;
            r0 = 0
            return r0
    }
}
