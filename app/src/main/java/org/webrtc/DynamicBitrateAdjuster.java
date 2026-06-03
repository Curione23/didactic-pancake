package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/DynamicBitrateAdjuster.class */
class DynamicBitrateAdjuster extends org.webrtc.BaseBitrateAdjuster {
    private static final double BITRATE_ADJUSTMENT_SEC = 3.0d;
    private static final double BITRATE_ADJUSTMENT_MAX_SCALE = 4.0d;
    private static final int BITRATE_ADJUSTMENT_STEPS = 20;
    private static final double BITS_PER_BYTE = 8.0d;
    private double deviationBytes;
    private double timeSinceLastAdjustmentMs;
    private int bitrateAdjustmentScaleExp;

    DynamicBitrateAdjuster() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void setTargets(int r7, double r8) {
            r6 = this;
            r0 = r6
            int r0 = r0.targetBitrateBps
            if (r0 <= 0) goto L20
            r0 = r7
            r1 = r6
            int r1 = r1.targetBitrateBps
            if (r0 >= r1) goto L20
            r0 = r6
            r1 = r6
            double r1 = r1.deviationBytes
            r2 = r7
            double r2 = (double) r2
            double r1 = r1 * r2
            r2 = r6
            int r2 = r2.targetBitrateBps
            double r2 = (double) r2
            double r1 = r1 / r2
            r0.deviationBytes = r1
        L20:
            r0 = r6
            r1 = r7
            r2 = r8
            super.setTargets(r1, r2)
            return
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public void reportEncodedFrame(int r9) {
            r8 = this;
            r0 = r8
            double r0 = r0.targetFramerateFps
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            return
        La:
            r0 = r8
            int r0 = r0.targetBitrateBps
            double r0 = (double) r0
            r1 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r0 = r0 / r1
            r1 = r8
            double r1 = r1.targetFramerateFps
            double r0 = r0 / r1
            r10 = r0
            r0 = r8
            r1 = r0
            double r1 = r1.deviationBytes
            r2 = r9
            double r2 = (double) r2
            r3 = r10
            double r2 = r2 - r3
            double r1 = r1 + r2
            r0.deviationBytes = r1
            r0 = r8
            r1 = r0
            double r1 = r1.timeSinceLastAdjustmentMs
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            r3 = r8
            double r3 = r3.targetFramerateFps
            double r2 = r2 / r3
            double r1 = r1 + r2
            r0.timeSinceLastAdjustmentMs = r1
            r0 = r8
            int r0 = r0.targetBitrateBps
            double r0 = (double) r0
            r1 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r0 = r0 / r1
            r12 = r0
            r0 = 4613937818241073152(0x4008000000000000, double:3.0)
            r1 = r12
            double r0 = r0 * r1
            r14 = r0
            r0 = r8
            r1 = r8
            double r1 = r1.deviationBytes
            r2 = r14
            double r1 = java.lang.Math.min(r1, r2)
            r0.deviationBytes = r1
            r0 = r8
            r1 = r8
            double r1 = r1.deviationBytes
            r2 = r14
            double r2 = -r2
            double r1 = java.lang.Math.max(r1, r2)
            r0.deviationBytes = r1
            r0 = r8
            double r0 = r0.timeSinceLastAdjustmentMs
            r1 = 4658815484840378368(0x40a7700000000000, double:3000.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L71
            return
        L71:
            r0 = r8
            double r0 = r0.deviationBytes
            r1 = r12
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Laa
            r0 = r8
            double r0 = r0.deviationBytes
            r1 = r12
            double r0 = r0 / r1
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r1
            int r0 = (int) r0
            r16 = r0
            r0 = r8
            r1 = r0
            int r1 = r1.bitrateAdjustmentScaleExp
            r2 = r16
            int r1 = r1 - r2
            r0.bitrateAdjustmentScaleExp = r1
            r0 = r8
            r1 = r8
            int r1 = r1.bitrateAdjustmentScaleExp
            r2 = -20
            int r1 = java.lang.Math.max(r1, r2)
            r0.bitrateAdjustmentScaleExp = r1
            r0 = r8
            r1 = r12
            r0.deviationBytes = r1
            goto Le3
        Laa:
            r0 = r8
            double r0 = r0.deviationBytes
            r1 = r12
            double r1 = -r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Le3
            r0 = r8
            double r0 = r0.deviationBytes
            double r0 = -r0
            r1 = r12
            double r0 = r0 / r1
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r0 = r0 + r1
            int r0 = (int) r0
            r16 = r0
            r0 = r8
            r1 = r0
            int r1 = r1.bitrateAdjustmentScaleExp
            r2 = r16
            int r1 = r1 + r2
            r0.bitrateAdjustmentScaleExp = r1
            r0 = r8
            r1 = r8
            int r1 = r1.bitrateAdjustmentScaleExp
            r2 = 20
            int r1 = java.lang.Math.min(r1, r2)
            r0.bitrateAdjustmentScaleExp = r1
            r0 = r8
            r1 = r12
            double r1 = -r1
            r0.deviationBytes = r1
        Le3:
            r0 = r8
            r1 = 0
            r0.timeSinceLastAdjustmentMs = r1
            return
    }

    private double getBitrateAdjustmentScale() {
            r7 = this;
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            r1 = r7
            int r1 = r1.bitrateAdjustmentScaleExp
            double r1 = (double) r1
            r2 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r1 = r1 / r2
            double r0 = java.lang.Math.pow(r0, r1)
            return r0
    }

    @Override // org.webrtc.BaseBitrateAdjuster, org.webrtc.BitrateAdjuster
    public int getAdjustedBitrateBps() {
            r5 = this;
            r0 = r5
            int r0 = r0.targetBitrateBps
            double r0 = (double) r0
            r1 = r5
            double r1 = r1.getBitrateAdjustmentScale()
            double r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }
}
