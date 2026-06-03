package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/WrappedNativeVideoEncoder.class */
public abstract class WrappedNativeVideoEncoder implements org.webrtc.VideoEncoder {
    public WrappedNativeVideoEncoder() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.VideoEncoder
    public abstract long createNativeVideoEncoder();

    @Override // org.webrtc.VideoEncoder
    public abstract boolean isHardwareEncoder();

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus initEncode(org.webrtc.VideoEncoder.Settings r5, org.webrtc.VideoEncoder.Callback r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus release() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r5, org.webrtc.VideoEncoder.EncodeInfo r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoCodecStatus setRateAllocation(org.webrtc.VideoEncoder.BitrateAllocation r5, int r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoEncoder
    public final org.webrtc.VideoEncoder.ScalingSettings getScalingSettings() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }

    @Override // org.webrtc.VideoEncoder
    public final java.lang.String getImplementationName() {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Not implemented."
            r1.<init>(r2)
            throw r0
    }
}
