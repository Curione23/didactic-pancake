package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/FramerateBitrateAdjuster.class */
class FramerateBitrateAdjuster extends org.webrtc.BaseBitrateAdjuster {
    private static final int DEFAULT_FRAMERATE_FPS = 30;

    FramerateBitrateAdjuster() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int r7, double r8) {
            r6 = this;
            r0 = r6
            r1 = 4629137466983448576(0x403e000000000000, double:30.0)
            r0.targetFramerateFps = r1
            r0 = r6
            r1 = r7
            r2 = 30
            int r1 = r1 * r2
            double r1 = (double) r1
            r2 = r8
            double r1 = r1 / r2
            int r1 = (int) r1
            r0.targetBitrateBps = r1
            return
    }
}
