package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/WebRtcAudioManager.class */
class WebRtcAudioManager {
    private static final java.lang.String TAG = "WebRtcAudioManagerExternal";
    private static final int DEFAULT_SAMPLE_RATE_HZ = 16000;
    private static final int BITS_PER_SAMPLE = 16;
    private static final int DEFAULT_FRAME_PER_BUFFER = 256;

    WebRtcAudioManager() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.webrtc.CalledByNative
    static android.media.AudioManager getAudioManager(android.content.Context r3) {
            r0 = r3
            java.lang.String r1 = "audio"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.media.AudioManager r0 = (android.media.AudioManager) r0
            return r0
    }

    @org.webrtc.CalledByNative
    static int getOutputBufferSize(android.content.Context r3, android.media.AudioManager r4, int r5, int r6) {
            r0 = r3
            boolean r0 = isLowLatencyOutputSupported(r0)
            if (r0 == 0) goto Le
            r0 = r4
            int r0 = getLowLatencyFramesPerBuffer(r0)
            goto L13
        Le:
            r0 = r5
            r1 = r6
            int r0 = getMinOutputFrameSize(r0, r1)
        L13:
            return r0
    }

    @org.webrtc.CalledByNative
    static int getInputBufferSize(android.content.Context r3, android.media.AudioManager r4, int r5, int r6) {
            r0 = r3
            boolean r0 = isLowLatencyInputSupported(r0)
            if (r0 == 0) goto Le
            r0 = r4
            int r0 = getLowLatencyFramesPerBuffer(r0)
            goto L13
        Le:
            r0 = r5
            r1 = r6
            int r0 = getMinInputFrameSize(r0, r1)
        L13:
            return r0
    }

    @org.webrtc.CalledByNative
    static boolean isLowLatencyOutputSupported(android.content.Context r3) {
            r0 = r3
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.String r1 = "android.hardware.audio.low_latency"
            boolean r0 = r0.hasSystemFeature(r1)
            return r0
    }

    @org.webrtc.CalledByNative
    static boolean isLowLatencyInputSupported(android.content.Context r2) {
            r0 = r2
            boolean r0 = isLowLatencyOutputSupported(r0)
            return r0
    }

    @org.webrtc.CalledByNative
    static int getSampleRate(android.media.AudioManager r3) {
            boolean r0 = org.webrtc.audio.WebRtcAudioUtils.runningOnEmulator()
            if (r0 == 0) goto L11
            java.lang.String r0 = "WebRtcAudioManagerExternal"
            java.lang.String r1 = "Running emulator, overriding sample rate to 8 kHz."
            org.webrtc.Logging.d(r0, r1)
            r0 = 8000(0x1f40, float:1.121E-41)
            return r0
        L11:
            r0 = r3
            int r0 = getSampleRateForApiLevel(r0)
            r4 = r0
            java.lang.String r0 = "WebRtcAudioManagerExternal"
            r1 = r4
            java.lang.String r1 = "Sample rate is set to " + r1 + " Hz"
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            return r0
    }

    private static int getSampleRateForApiLevel(android.media.AudioManager r3) {
            r0 = r3
            java.lang.String r1 = "android.media.property.OUTPUT_SAMPLE_RATE"
            java.lang.String r0 = r0.getProperty(r1)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L11
            r0 = 16000(0x3e80, float:2.2421E-41)
            goto L15
        L11:
            r0 = r4
            int r0 = java.lang.Integer.parseInt(r0)
        L15:
            return r0
    }

    private static int getLowLatencyFramesPerBuffer(android.media.AudioManager r3) {
            r0 = r3
            java.lang.String r1 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            java.lang.String r0 = r0.getProperty(r1)
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L11
            r0 = 256(0x100, float:3.59E-43)
            goto L15
        L11:
            r0 = r4
            int r0 = java.lang.Integer.parseInt(r0)
        L15:
            return r0
    }

    private static int getMinOutputFrameSize(int r4, int r5) {
            r0 = r5
            r1 = 2
            int r0 = r0 * r1
            r6 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto Ld
            r0 = 4
            goto Lf
        Ld:
            r0 = 12
        Lf:
            r7 = r0
            r0 = r4
            r1 = r7
            r2 = 2
            int r0 = android.media.AudioTrack.getMinBufferSize(r0, r1, r2)
            r1 = r6
            int r0 = r0 / r1
            return r0
    }

    private static int getMinInputFrameSize(int r4, int r5) {
            r0 = r5
            r1 = 2
            int r0 = r0 * r1
            r6 = r0
            r0 = r5
            r1 = 1
            if (r0 != r1) goto Le
            r0 = 16
            goto L10
        Le:
            r0 = 12
        L10:
            r7 = r0
            r0 = r4
            r1 = r7
            r2 = 2
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r1, r2)
            r1 = r6
            int r0 = r0 / r1
            return r0
    }
}
