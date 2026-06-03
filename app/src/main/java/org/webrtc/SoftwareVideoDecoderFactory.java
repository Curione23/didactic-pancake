package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SoftwareVideoDecoderFactory.class */
public class SoftwareVideoDecoderFactory implements org.webrtc.VideoDecoderFactory {
    private static final java.lang.String TAG = "SoftwareVideoDecoderFactory";
    private final long nativeFactory;


    public SoftwareVideoDecoderFactory() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            long r1 = nativeCreateFactory()
            r0.nativeFactory = r1
            return
    }

    @Override // org.webrtc.VideoDecoderFactory
    @androidx.annotation.Nullable
    public org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeFactory
            r1 = r6
            boolean r0 = nativeIsSupported(r0, r1)
            if (r0 != 0) goto L18
            java.lang.String r0 = "SoftwareVideoDecoderFactory"
            r1 = r6
            java.lang.String r1 = "Trying to create decoder for unsupported format. " + r1
            org.webrtc.Logging.w(r0, r1)
            r0 = 0
            return r0
        L18:
            org.webrtc.SoftwareVideoDecoderFactory$1 r0 = new org.webrtc.SoftwareVideoDecoderFactory$1
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
            r3 = this;
            r0 = r3
            long r0 = r0.nativeFactory
            java.util.List r0 = nativeGetSupportedCodecs(r0)
            r1 = 0
            org.webrtc.VideoCodecInfo[] r1 = new org.webrtc.VideoCodecInfo[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.webrtc.VideoCodecInfo[] r0 = (org.webrtc.VideoCodecInfo[]) r0
            return r0
    }

    private static native long nativeCreateFactory();

    private static native boolean nativeIsSupported(long r0, org.webrtc.VideoCodecInfo r2);

    private static native long nativeCreate(long r0, long r2, org.webrtc.VideoCodecInfo r4);

    private static native java.util.List<org.webrtc.VideoCodecInfo> nativeGetSupportedCodecs(long r0);
}
