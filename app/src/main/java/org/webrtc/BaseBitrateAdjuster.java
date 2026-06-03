package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/BaseBitrateAdjuster.class */
class BaseBitrateAdjuster implements org.webrtc.BitrateAdjuster {
    protected int targetBitrateBps;
    protected double targetFramerateFps;

    BaseBitrateAdjuster() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.BitrateAdjuster
    public void setTargets(int r5, double r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.targetBitrateBps = r1
            r0 = r4
            r1 = r6
            r0.targetFramerateFps = r1
            return
    }

    @Override // org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int r2) {
            r1 = this;
            return
    }

    @Override // org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
            r2 = this;
            r0 = r2
            int r0 = r0.targetBitrateBps
            return r0
    }

    @Override // org.webrtc.BitrateAdjuster
    public double getAdjustedFramerateFps() {
            r3 = this;
            r0 = r3
            double r0 = r0.targetFramerateFps
            return r0
    }
}
