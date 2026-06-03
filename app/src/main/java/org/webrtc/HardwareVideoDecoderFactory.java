package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/HardwareVideoDecoderFactory.class */
public class HardwareVideoDecoderFactory extends org.webrtc.MediaCodecVideoDecoderFactory {
    private static final org.webrtc.Predicate<android.media.MediaCodecInfo> defaultAllowedPredicate = null;


    @java.lang.Deprecated
    public HardwareVideoDecoderFactory() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.<init>(r1)
            return
    }

    public HardwareVideoDecoderFactory(@androidx.annotation.Nullable org.webrtc.EglBase.Context r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    public HardwareVideoDecoderFactory(@androidx.annotation.Nullable org.webrtc.EglBase.Context r6, @androidx.annotation.Nullable org.webrtc.Predicate<android.media.MediaCodecInfo> r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            if (r2 != 0) goto Lc
            org.webrtc.Predicate<android.media.MediaCodecInfo> r2 = org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            goto L15
        Lc:
            r2 = r7
            org.webrtc.Predicate<android.media.MediaCodecInfo> r3 = org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate
            org.webrtc.Predicate r2 = r2.and(r3)
        L15:
            r0.<init>(r1, r2)
            return
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    public /* bridge */ /* synthetic */ org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
            r2 = this;
            r0 = r2
            org.webrtc.VideoCodecInfo[] r0 = super.getSupportedCodecs()
            return r0
    }

    @Override // org.webrtc.MediaCodecVideoDecoderFactory, org.webrtc.VideoDecoderFactory
    @androidx.annotation.Nullable
    public /* bridge */ /* synthetic */ org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            org.webrtc.VideoDecoder r0 = super.createDecoder(r1)
            return r0
    }

    static {
            org.webrtc.HardwareVideoDecoderFactory$1 r0 = new org.webrtc.HardwareVideoDecoderFactory$1
            r1 = r0
            r1.<init>()
            org.webrtc.HardwareVideoDecoderFactory.defaultAllowedPredicate = r0
            return
    }
}
