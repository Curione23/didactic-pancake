package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DefaultVideoDecoderFactory.class */
public class DefaultVideoDecoderFactory implements org.webrtc.VideoDecoderFactory {
    private final org.webrtc.VideoDecoderFactory hardwareVideoDecoderFactory;
    private final org.webrtc.VideoDecoderFactory softwareVideoDecoderFactory;

    @androidx.annotation.Nullable
    private final org.webrtc.VideoDecoderFactory platformSoftwareVideoDecoderFactory;

    public DefaultVideoDecoderFactory(@androidx.annotation.Nullable org.webrtc.EglBase.Context r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.webrtc.SoftwareVideoDecoderFactory r1 = new org.webrtc.SoftwareVideoDecoderFactory
            r2 = r1
            r2.<init>()
            r0.softwareVideoDecoderFactory = r1
            r0 = r5
            org.webrtc.HardwareVideoDecoderFactory r1 = new org.webrtc.HardwareVideoDecoderFactory
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.hardwareVideoDecoderFactory = r1
            r0 = r5
            org.webrtc.PlatformSoftwareVideoDecoderFactory r1 = new org.webrtc.PlatformSoftwareVideoDecoderFactory
            r2 = r1
            r3 = r6
            r2.<init>(r3)
            r0.platformSoftwareVideoDecoderFactory = r1
            return
    }

    DefaultVideoDecoderFactory(org.webrtc.VideoDecoderFactory r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            org.webrtc.SoftwareVideoDecoderFactory r1 = new org.webrtc.SoftwareVideoDecoderFactory
            r2 = r1
            r2.<init>()
            r0.softwareVideoDecoderFactory = r1
            r0 = r4
            r1 = r5
            r0.hardwareVideoDecoderFactory = r1
            r0 = r4
            r1 = 0
            r0.platformSoftwareVideoDecoderFactory = r1
            return
    }

    @Override // org.webrtc.VideoDecoderFactory
    @androidx.annotation.Nullable
    public org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo r6) {
            r5 = this;
            r0 = r5
            org.webrtc.VideoDecoderFactory r0 = r0.softwareVideoDecoderFactory
            r1 = r6
            org.webrtc.VideoDecoder r0 = r0.createDecoder(r1)
            r7 = r0
            r0 = r5
            org.webrtc.VideoDecoderFactory r0 = r0.hardwareVideoDecoderFactory
            r1 = r6
            org.webrtc.VideoDecoder r0 = r0.createDecoder(r1)
            r8 = r0
            r0 = r7
            if (r0 != 0) goto L2c
            r0 = r5
            org.webrtc.VideoDecoderFactory r0 = r0.platformSoftwareVideoDecoderFactory
            if (r0 == 0) goto L2c
            r0 = r5
            org.webrtc.VideoDecoderFactory r0 = r0.platformSoftwareVideoDecoderFactory
            r1 = r6
            org.webrtc.VideoDecoder r0 = r0.createDecoder(r1)
            r7 = r0
        L2c:
            r0 = r8
            if (r0 == 0) goto L3e
            r0 = r7
            if (r0 == 0) goto L3e
            org.webrtc.VideoDecoderFallback r0 = new org.webrtc.VideoDecoderFallback
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L3e:
            r0 = r8
            if (r0 == 0) goto L46
            r0 = r8
            goto L47
        L46:
            r0 = r7
        L47:
            return r0
    }

    @Override // org.webrtc.VideoDecoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
            r3 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            org.webrtc.VideoDecoderFactory r1 = r1.softwareVideoDecoderFactory
            org.webrtc.VideoCodecInfo[] r1 = r1.getSupportedCodecs()
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r0 = r0.addAll(r1)
            r0 = r4
            r1 = r3
            org.webrtc.VideoDecoderFactory r1 = r1.hardwareVideoDecoderFactory
            org.webrtc.VideoCodecInfo[] r1 = r1.getSupportedCodecs()
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r0 = r0.addAll(r1)
            r0 = r3
            org.webrtc.VideoDecoderFactory r0 = r0.platformSoftwareVideoDecoderFactory
            if (r0 == 0) goto L42
            r0 = r4
            r1 = r3
            org.webrtc.VideoDecoderFactory r1 = r1.platformSoftwareVideoDecoderFactory
            org.webrtc.VideoCodecInfo[] r1 = r1.getSupportedCodecs()
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r0 = r0.addAll(r1)
        L42:
            r0 = r4
            r1 = r4
            int r1 = r1.size()
            org.webrtc.VideoCodecInfo[] r1 = new org.webrtc.VideoCodecInfo[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.webrtc.VideoCodecInfo[] r0 = (org.webrtc.VideoCodecInfo[]) r0
            return r0
    }
}
