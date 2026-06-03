package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/WrappedNativeVideoDecoder.class */
public abstract class WrappedNativeVideoDecoder implements org.webrtc.VideoDecoder {
    public WrappedNativeVideoDecoder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.VideoDecoder
    public abstract long createNative(long r1);

    @Override // org.webrtc.VideoDecoder
    public final org.webrtc.VideoCodecStatus initDecode(org.webrtc.VideoDecoder.Settings r5, org.webrtc.VideoDecoder.Callback r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoDecoder
    public final org.webrtc.VideoCodecStatus release() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoDecoder
    public final org.webrtc.VideoCodecStatus decode(org.webrtc.EncodedImage r5, org.webrtc.VideoDecoder.DecodeInfo r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoDecoder
    public final java.lang.String getImplementationName() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }
}
