package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DefaultVideoEncoderFactory.class */
public class DefaultVideoEncoderFactory implements org.webrtc.VideoEncoderFactory {
    private final org.webrtc.VideoEncoderFactory hardwareVideoEncoderFactory;
    private final org.webrtc.VideoEncoderFactory softwareVideoEncoderFactory;

    public DefaultVideoEncoderFactory(org.webrtc.EglBase.Context r8, boolean r9, boolean r10) {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r7
            org.webrtc.SoftwareVideoEncoderFactory r1 = new org.webrtc.SoftwareVideoEncoderFactory
            r2 = r1
            r2.<init>()
            r0.softwareVideoEncoderFactory = r1
            r0 = r7
            org.webrtc.HardwareVideoEncoderFactory r1 = new org.webrtc.HardwareVideoEncoderFactory
            r2 = r1
            r3 = r8
            r4 = r9
            r5 = r10
            r2.<init>(r3, r4, r5)
            r0.hardwareVideoEncoderFactory = r1
            return
    }

    DefaultVideoEncoderFactory(org.webrtc.VideoEncoderFactory r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            org.webrtc.SoftwareVideoEncoderFactory r1 = new org.webrtc.SoftwareVideoEncoderFactory
            r2 = r1
            r2.<init>()
            r0.softwareVideoEncoderFactory = r1
            r0 = r4
            r1 = r5
            r0.hardwareVideoEncoderFactory = r1
            return
    }

    @Override // org.webrtc.VideoEncoderFactory
    @androidx.annotation.Nullable
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r6) {
            r5 = this;
            r0 = r5
            org.webrtc.VideoEncoderFactory r0 = r0.softwareVideoEncoderFactory
            r1 = r6
            org.webrtc.VideoEncoder r0 = r0.createEncoder(r1)
            r7 = r0
            r0 = r5
            org.webrtc.VideoEncoderFactory r0 = r0.hardwareVideoEncoderFactory
            r1 = r6
            org.webrtc.VideoEncoder r0 = r0.createEncoder(r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L28
            r0 = r7
            if (r0 == 0) goto L28
            org.webrtc.VideoEncoderFallback r0 = new org.webrtc.VideoEncoderFallback
            r1 = r0
            r2 = r7
            r3 = r8
            r1.<init>(r2, r3)
            return r0
        L28:
            r0 = r8
            if (r0 == 0) goto L30
            r0 = r8
            goto L31
        L30:
            r0 = r7
        L31:
            return r0
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
            r3 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            org.webrtc.VideoEncoderFactory r1 = r1.softwareVideoEncoderFactory
            org.webrtc.VideoCodecInfo[] r1 = r1.getSupportedCodecs()
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r0 = r0.addAll(r1)
            r0 = r4
            r1 = r3
            org.webrtc.VideoEncoderFactory r1 = r1.hardwareVideoEncoderFactory
            org.webrtc.VideoCodecInfo[] r1 = r1.getSupportedCodecs()
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r0 = r0.addAll(r1)
            r0 = r4
            r1 = r4
            int r1 = r1.size()
            org.webrtc.VideoCodecInfo[] r1 = new org.webrtc.VideoCodecInfo[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.webrtc.VideoCodecInfo[] r0 = (org.webrtc.VideoCodecInfo[]) r0
            return r0
    }
}
