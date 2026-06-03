package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/VolumeLogger.class */
class VolumeLogger {
    private static final java.lang.String TAG = "VolumeLogger";
    private static final java.lang.String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    private static final int TIMER_PERIOD_IN_SECONDS = 30;
    private final android.media.AudioManager audioManager;

    @androidx.annotation.Nullable
    private java.util.Timer timer;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/VolumeLogger$LogVolumeTask.class */
    private class LogVolumeTask extends java.util.TimerTask {
        private final int maxRingVolume;
        private final int maxVoiceCallVolume;
        final /* synthetic */ org.webrtc.audio.VolumeLogger this$0;

        LogVolumeTask(org.webrtc.audio.VolumeLogger r4, int r5, int r6) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r5
                r0.maxRingVolume = r1
                r0 = r3
                r1 = r6
                r0.maxVoiceCallVolume = r1
                return
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = r4
                org.webrtc.audio.VolumeLogger r0 = r0.this$0
                android.media.AudioManager r0 = r0.audioManager
                int r0 = r0.getMode()
                r5 = r0
                r0 = r5
                r1 = 1
                if (r0 != r1) goto L2c
                java.lang.String r0 = "VolumeLogger"
                r1 = r4
                org.webrtc.audio.VolumeLogger r1 = r1.this$0
                android.media.AudioManager r1 = r1.audioManager
                r2 = 2
                int r1 = r1.getStreamVolume(r2)
                r2 = r4
                int r2 = r2.maxRingVolume
                java.lang.String r1 = "STREAM_RING stream volume: " + r1 + " (max=" + r2 + ")"
                org.webrtc.Logging.d(r0, r1)
                goto L4a
            L2c:
                r0 = r5
                r1 = 3
                if (r0 != r1) goto L4a
                java.lang.String r0 = "VolumeLogger"
                r1 = r4
                org.webrtc.audio.VolumeLogger r1 = r1.this$0
                android.media.AudioManager r1 = r1.audioManager
                r2 = 0
                int r1 = r1.getStreamVolume(r2)
                r2 = r4
                int r2 = r2.maxVoiceCallVolume
                java.lang.String r1 = "VOICE_CALL stream volume: " + r1 + " (max=" + r2 + ")"
                org.webrtc.Logging.d(r0, r1)
            L4a:
                return
        }
    }

    public VolumeLogger(android.media.AudioManager r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.audioManager = r1
            return
    }

    public void start() {
            r8 = this;
            java.lang.String r0 = "VolumeLogger"
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
            java.lang.String r1 = "start" + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r8
            java.util.Timer r0 = r0.timer
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = "VolumeLogger"
            r1 = r8
            android.media.AudioManager r1 = r1.audioManager
            int r1 = r1.getMode()
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.modeToString(r1)
            java.lang.String r1 = "audio mode is: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r8
            java.util.Timer r1 = new java.util.Timer
            r2 = r1
            java.lang.String r3 = "WebRtcVolumeLevelLoggerThread"
            r2.<init>(r3)
            r0.timer = r1
            r0 = r8
            java.util.Timer r0 = r0.timer
            org.webrtc.audio.VolumeLogger$LogVolumeTask r1 = new org.webrtc.audio.VolumeLogger$LogVolumeTask
            r2 = r1
            r3 = r8
            r4 = r8
            android.media.AudioManager r4 = r4.audioManager
            r5 = 2
            int r4 = r4.getStreamMaxVolume(r5)
            r5 = r8
            android.media.AudioManager r5 = r5.audioManager
            r6 = 0
            int r5 = r5.getStreamMaxVolume(r6)
            r2.<init>(r3, r4, r5)
            r2 = 0
            r3 = 30000(0x7530, double:1.4822E-319)
            r0.schedule(r1, r2, r3)
            return
    }

    public void stop() {
            r3 = this;
            java.lang.String r0 = "VolumeLogger"
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
            java.lang.String r1 = "stop" + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            java.util.Timer r0 = r0.timer
            if (r0 == 0) goto L20
            r0 = r3
            java.util.Timer r0 = r0.timer
            r0.cancel()
            r0 = r3
            r1 = 0
            r0.timer = r1
        L20:
            return
    }
}
