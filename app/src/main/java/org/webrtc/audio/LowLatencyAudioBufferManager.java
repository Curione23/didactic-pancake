package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/LowLatencyAudioBufferManager.class */
class LowLatencyAudioBufferManager {
    private static final java.lang.String TAG = "LowLatencyAudioBufferManager";
    private int prevUnderrunCount;
    private int ticksUntilNextDecrease;
    private boolean keepLoweringBufferSize;
    private int bufferIncreaseCounter;

    public LowLatencyAudioBufferManager() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.prevUnderrunCount = r1
            r0 = r3
            r1 = 10
            r0.ticksUntilNextDecrease = r1
            r0 = r3
            r1 = 1
            r0.keepLoweringBufferSize = r1
            r0 = r3
            r1 = 0
            r0.bufferIncreaseCounter = r1
            return
    }

    public void maybeAdjustBufferSize(android.media.AudioTrack r5) {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb0
            r0 = r5
            int r0 = r0.getUnderrunCount()
            r6 = r0
            r0 = r6
            r1 = r4
            int r1 = r1.prevUnderrunCount
            if (r0 <= r1) goto L5e
            r0 = r4
            int r0 = r0.bufferIncreaseCounter
            r1 = 5
            if (r0 >= r1) goto L4b
            r0 = r5
            int r0 = r0.getBufferSizeInFrames()
            r7 = r0
            r0 = r7
            r1 = r5
            int r1 = r1.getPlaybackRate()
            r2 = 100
            int r1 = r1 / r2
            int r0 = r0 + r1
            r8 = r0
            java.lang.String r0 = "LowLatencyAudioBufferManager"
            r1 = r7
            r2 = r8
            java.lang.String r1 = "Underrun detected! Increasing AudioTrack buffer size from " + r1 + " to " + r2
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            r1 = r8
            int r0 = r0.setBufferSizeInFrames(r1)
            r0 = r4
            r1 = r0
            int r1 = r1.bufferIncreaseCounter
            r2 = 1
            int r1 = r1 + r2
            r0.bufferIncreaseCounter = r1
        L4b:
            r0 = r4
            r1 = 0
            r0.keepLoweringBufferSize = r1
            r0 = r4
            r1 = r6
            r0.prevUnderrunCount = r1
            r0 = r4
            r1 = 10
            r0.ticksUntilNextDecrease = r1
            goto Lb0
        L5e:
            r0 = r4
            boolean r0 = r0.keepLoweringBufferSize
            if (r0 == 0) goto Lb0
            r0 = r4
            r1 = r0
            int r1 = r1.ticksUntilNextDecrease
            r2 = 1
            int r1 = r1 - r2
            r0.ticksUntilNextDecrease = r1
            r0 = r4
            int r0 = r0.ticksUntilNextDecrease
            if (r0 > 0) goto Lb0
            r0 = r5
            int r0 = r0.getPlaybackRate()
            r1 = 100
            int r0 = r0 / r1
            r7 = r0
            r0 = r5
            int r0 = r0.getBufferSizeInFrames()
            r8 = r0
            r0 = r7
            r1 = r8
            r2 = r7
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            r9 = r0
            r0 = r9
            r1 = r8
            if (r0 == r1) goto Laa
            java.lang.String r0 = "LowLatencyAudioBufferManager"
            r1 = r8
            r2 = r9
            java.lang.String r1 = "Lowering AudioTrack buffer size from " + r1 + " to " + r2
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            r1 = r9
            int r0 = r0.setBufferSizeInFrames(r1)
        Laa:
            r0 = r4
            r1 = 10
            r0.ticksUntilNextDecrease = r1
        Lb0:
            return
    }
}
