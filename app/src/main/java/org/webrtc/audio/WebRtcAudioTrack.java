package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/WebRtcAudioTrack.class */
class WebRtcAudioTrack {
    private static final java.lang.String TAG = "WebRtcAudioTrackExternal";
    private static final int BITS_PER_SAMPLE = 16;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    private static final int DEFAULT_USAGE = 2;
    private static final int AUDIO_TRACK_START = 0;
    private static final int AUDIO_TRACK_STOP = 1;
    private long nativeAudioTrack;
    private final android.content.Context context;
    private final android.media.AudioManager audioManager;
    private final org.webrtc.ThreadUtils.ThreadChecker threadChecker;
    private java.nio.ByteBuffer byteBuffer;

    @androidx.annotation.Nullable
    private final android.media.AudioAttributes audioAttributes;

    @androidx.annotation.Nullable
    private android.media.AudioTrack audioTrack;

    @androidx.annotation.Nullable
    private org.webrtc.audio.WebRtcAudioTrack.AudioTrackThread audioThread;
    private final org.webrtc.audio.VolumeLogger volumeLogger;
    private volatile boolean speakerMute;
    private byte[] emptyBytes;
    private boolean useLowLatency;
    private int initialBufferSizeInFrames;

    @androidx.annotation.Nullable
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;

    @androidx.annotation.Nullable
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/WebRtcAudioTrack$AudioTrackThread.class */
    private class AudioTrackThread extends java.lang.Thread {
        private volatile boolean keepAlive;
        private org.webrtc.audio.LowLatencyAudioBufferManager bufferManager;
        final /* synthetic */ org.webrtc.audio.WebRtcAudioTrack this$0;

        public AudioTrackThread(org.webrtc.audio.WebRtcAudioTrack r5, java.lang.String r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.this$0 = r1
                r0 = r4
                r1 = r6
                r0.<init>(r1)
                r0 = r4
                r1 = 1
                r0.keepAlive = r1
                r0 = r4
                org.webrtc.audio.LowLatencyAudioBufferManager r1 = new org.webrtc.audio.LowLatencyAudioBufferManager
                r2 = r1
                r2.<init>()
                r0.bufferManager = r1
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r5 = this;
                r0 = -19
                android.os.Process.setThreadPriority(r0)
                java.lang.String r0 = "WebRtcAudioTrackExternal"
                java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
                java.lang.String r1 = "AudioTrackThread" + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                android.media.AudioTrack r0 = r0.audioTrack
                int r0 = r0.getPlayState()
                r1 = 3
                if (r0 != r1) goto L24
                r0 = 1
                goto L25
            L24:
                r0 = 0
            L25:
                org.webrtc.audio.WebRtcAudioTrack.assertTrue(r0)
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                r1 = 0
                r0.doAudioTrackStateCallback(r1)
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                int r0 = r0.capacity()
                r6 = r0
            L3b:
                r0 = r5
                boolean r0 = r0.keepAlive
                if (r0 == 0) goto Lf6
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                long r0 = r0.nativeAudioTrack
                r1 = r6
                org.webrtc.audio.WebRtcAudioTrack.nativeGetPlayoutData(r0, r1)
                r0 = r6
                r1 = r5
                org.webrtc.audio.WebRtcAudioTrack r1 = r1.this$0
                java.nio.ByteBuffer r1 = r1.byteBuffer
                int r1 = r1.remaining()
                if (r0 > r1) goto L5f
                r0 = 1
                goto L60
            L5f:
                r0 = 0
            L60:
                org.webrtc.audio.WebRtcAudioTrack.assertTrue(r0)
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                boolean r0 = r0.speakerMute
                if (r0 == 0) goto L96
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                java.nio.ByteBuffer r0 = r0.clear()
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                r1 = r5
                org.webrtc.audio.WebRtcAudioTrack r1 = r1.this$0
                byte[] r1 = r1.emptyBytes
                java.nio.ByteBuffer r0 = r0.put(r1)
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                r1 = 0
                java.nio.ByteBuffer r0 = r0.position(r1)
            L96:
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                android.media.AudioTrack r0 = r0.audioTrack
                r1 = r5
                org.webrtc.audio.WebRtcAudioTrack r1 = r1.this$0
                java.nio.ByteBuffer r1 = r1.byteBuffer
                r2 = r6
                r3 = 0
                int r0 = r0.write(r1, r2, r3)
                r7 = r0
                r0 = r7
                r1 = r6
                if (r0 == r1) goto Ld0
                java.lang.String r0 = "WebRtcAudioTrackExternal"
                r1 = r7
                java.lang.String r1 = "AudioTrack.write played invalid number of bytes: " + r1
                org.webrtc.Logging.e(r0, r1)
                r0 = r7
                if (r0 >= 0) goto Ld0
                r0 = r5
                r1 = 0
                r0.keepAlive = r1
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                r1 = r7
                java.lang.String r1 = "AudioTrack.write failed: " + r1
                r0.reportWebRtcAudioTrackError(r1)
            Ld0:
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                boolean r0 = r0.useLowLatency
                if (r0 == 0) goto Le8
                r0 = r5
                org.webrtc.audio.LowLatencyAudioBufferManager r0 = r0.bufferManager
                r1 = r5
                org.webrtc.audio.WebRtcAudioTrack r1 = r1.this$0
                android.media.AudioTrack r1 = r1.audioTrack
                r0.maybeAdjustBufferSize(r1)
            Le8:
                r0 = r5
                org.webrtc.audio.WebRtcAudioTrack r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                java.nio.ByteBuffer r0 = r0.rewind()
                goto L3b
            Lf6:
                return
        }

        public void stopThread() {
                r3 = this;
                java.lang.String r0 = "WebRtcAudioTrackExternal"
                java.lang.String r1 = "stopThread"
                org.webrtc.Logging.d(r0, r1)
                r0 = r3
                r1 = 0
                r0.keepAlive = r1
                return
        }
    }

    @org.webrtc.CalledByNative
    WebRtcAudioTrack(android.content.Context r10, android.media.AudioManager r11) {
            r9 = this;
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    WebRtcAudioTrack(android.content.Context r6, android.media.AudioManager r7, @androidx.annotation.Nullable android.media.AudioAttributes r8, @androidx.annotation.Nullable org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback r9, @androidx.annotation.Nullable org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback r10, boolean r11, boolean r12) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r1 = new org.webrtc.ThreadUtils$ThreadChecker
            r2 = r1
            r2.<init>()
            r0.threadChecker = r1
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.detachThread()
            r0 = r5
            r1 = r6
            r0.context = r1
            r0 = r5
            r1 = r7
            r0.audioManager = r1
            r0 = r5
            r1 = r8
            r0.audioAttributes = r1
            r0 = r5
            r1 = r9
            r0.errorCallback = r1
            r0 = r5
            r1 = r10
            r0.stateCallback = r1
            r0 = r5
            r1 = r12
            if (r1 == 0) goto L42
            org.webrtc.audio.VolumeLogger r1 = new org.webrtc.audio.VolumeLogger
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            goto L43
        L42:
            r1 = 0
        L43:
            r0.volumeLogger = r1
            r0 = r5
            r1 = r11
            r0.useLowLatency = r1
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
            java.lang.String r1 = "ctor" + r1
            org.webrtc.Logging.d(r0, r1)
            return
    }

    @org.webrtc.CalledByNative
    public void setNativeAudioTrack(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.nativeAudioTrack = r1
            return
    }

    @org.webrtc.CalledByNative
    private int initPlayout(int r7, int r8, double r9) {
            r6 = this;
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.String r1 = "initPlayout(sampleRate=" + r1 + ", channels=" + r2 + ", bufferSizeFactor=" + r3 + ")"
            org.webrtc.Logging.d(r0, r1)
            r0 = r8
            r1 = 2
            int r0 = r0 * r1
            r11 = r0
            r0 = r6
            r1 = r11
            r2 = r7
            r3 = 100
            int r2 = r2 / r3
            int r1 = r1 * r2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            r0.byteBuffer = r1
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r6
            java.nio.ByteBuffer r1 = r1.byteBuffer
            int r1 = r1.capacity()
            java.lang.String r1 = "byteBuffer.capacity: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            r1 = r6
            java.nio.ByteBuffer r1 = r1.byteBuffer
            int r1 = r1.capacity()
            byte[] r1 = new byte[r1]
            r0.emptyBytes = r1
            r0 = r6
            long r0 = r0.nativeAudioTrack
            r1 = r6
            java.nio.ByteBuffer r1 = r1.byteBuffer
            nativeCacheDirectBufferAddress(r0, r1)
            r0 = r6
            r1 = r8
            int r0 = r0.channelCountToConfiguration(r1)
            r12 = r0
            r0 = r7
            r1 = r12
            r2 = 2
            int r0 = android.media.AudioTrack.getMinBufferSize(r0, r1, r2)
            double r0 = (double) r0
            r1 = r9
            double r0 = r0 * r1
            int r0 = (int) r0
            r13 = r0
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r13
            java.lang.String r1 = "minBufferSizeInBytes: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r13
            r1 = r6
            java.nio.ByteBuffer r1 = r1.byteBuffer
            int r1 = r1.capacity()
            if (r0 >= r1) goto L84
            r0 = r6
            java.lang.String r1 = "AudioTrack.getMinBufferSize returns an invalid value."
            r0.reportWebRtcAudioTrackInitError(r1)
            r0 = -1
            return r0
        L84:
            r0 = r9
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L8f
            r0 = r6
            r1 = 0
            r0.useLowLatency = r1
        L8f:
            r0 = r6
            android.media.AudioTrack r0 = r0.audioTrack
            if (r0 == 0) goto L9e
            r0 = r6
            java.lang.String r1 = "Conflict with existing AudioTrack."
            r0.reportWebRtcAudioTrackInitError(r1)
            r0 = -1
            return r0
        L9e:
            r0 = r6
            boolean r0 = r0.useLowLatency     // Catch: java.lang.IllegalArgumentException -> Ld3
            if (r0 == 0) goto Lc0
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.IllegalArgumentException -> Ld3
            r1 = 26
            if (r0 < r1) goto Lc0
            r0 = r6
            r1 = r7
            r2 = r12
            r3 = r13
            r4 = r6
            android.media.AudioAttributes r4 = r4.audioAttributes     // Catch: java.lang.IllegalArgumentException -> Ld3
            android.media.AudioTrack r1 = createAudioTrackOnOreoOrHigher(r1, r2, r3, r4)     // Catch: java.lang.IllegalArgumentException -> Ld3
            r0.audioTrack = r1     // Catch: java.lang.IllegalArgumentException -> Ld3
            goto Ld0
        Lc0:
            r0 = r6
            r1 = r7
            r2 = r12
            r3 = r13
            r4 = r6
            android.media.AudioAttributes r4 = r4.audioAttributes     // Catch: java.lang.IllegalArgumentException -> Ld3
            android.media.AudioTrack r1 = createAudioTrackBeforeOreo(r1, r2, r3, r4)     // Catch: java.lang.IllegalArgumentException -> Ld3
            r0.audioTrack = r1     // Catch: java.lang.IllegalArgumentException -> Ld3
        Ld0:
            goto Le4
        Ld3:
            r14 = move-exception
            r0 = r6
            r1 = r14
            java.lang.String r1 = r1.getMessage()
            r0.reportWebRtcAudioTrackInitError(r1)
            r0 = r6
            r0.releaseAudioResources()
            r0 = -1
            return r0
        Le4:
            r0 = r6
            android.media.AudioTrack r0 = r0.audioTrack
            if (r0 == 0) goto Lf6
            r0 = r6
            android.media.AudioTrack r0 = r0.audioTrack
            int r0 = r0.getState()
            r1 = 1
            if (r0 == r1) goto L102
        Lf6:
            r0 = r6
            java.lang.String r1 = "Initialization of audio track failed."
            r0.reportWebRtcAudioTrackInitError(r1)
            r0 = r6
            r0.releaseAudioResources()
            r0 = -1
            return r0
        L102:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L118
            r0 = r6
            r1 = r6
            android.media.AudioTrack r1 = r1.audioTrack
            int r1 = r1.getBufferSizeInFrames()
            r0.initialBufferSizeInFrames = r1
            goto L11d
        L118:
            r0 = r6
            r1 = -1
            r0.initialBufferSizeInFrames = r1
        L11d:
            r0 = r6
            r0.logMainParameters()
            r0 = r6
            r0.logMainParametersExtended()
            r0 = r13
            return r0
    }

    @org.webrtc.CalledByNative
    private boolean startPlayout() {
            r6 = this;
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.checkIsOnValidThread()
            r0 = r6
            org.webrtc.audio.VolumeLogger r0 = r0.volumeLogger
            if (r0 == 0) goto L15
            r0 = r6
            org.webrtc.audio.VolumeLogger r0 = r0.volumeLogger
            r0.start()
        L15:
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "startPlayout"
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            android.media.AudioTrack r0 = r0.audioTrack
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            assertTrue(r0)
            r0 = r6
            org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread r0 = r0.audioThread
            if (r0 != 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            assertTrue(r0)
            r0 = r6
            android.media.AudioTrack r0 = r0.audioTrack     // Catch: java.lang.IllegalStateException -> L44
            r0.play()     // Catch: java.lang.IllegalStateException -> L44
            goto L5b
        L44:
            r7 = move-exception
            r0 = r6
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode r1 = org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = "AudioTrack.play failed: " + r2
            r0.reportWebRtcAudioTrackStartError(r1, r2)
            r0 = r6
            r0.releaseAudioResources()
            r0 = 0
            return r0
        L5b:
            r0 = r6
            android.media.AudioTrack r0 = r0.audioTrack
            int r0 = r0.getPlayState()
            r1 = 3
            if (r0 == r1) goto L7f
            r0 = r6
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode r1 = org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH
            r2 = r6
            android.media.AudioTrack r2 = r2.audioTrack
            int r2 = r2.getPlayState()
            java.lang.String r2 = "AudioTrack.play failed - incorrect state :" + r2
            r0.reportWebRtcAudioTrackStartError(r1, r2)
            r0 = r6
            r0.releaseAudioResources()
            r0 = 0
            return r0
        L7f:
            r0 = r6
            org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread r1 = new org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread
            r2 = r1
            r3 = r6
            java.lang.String r4 = "AudioTrackJavaThread"
            r2.<init>(r3, r4)
            r0.audioThread = r1
            r0 = r6
            org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread r0 = r0.audioThread
            r0.start()
            r0 = 1
            return r0
    }

    @org.webrtc.CalledByNative
    private boolean stopPlayout() {
            r4 = this;
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.checkIsOnValidThread()
            r0 = r4
            org.webrtc.audio.VolumeLogger r0 = r0.volumeLogger
            if (r0 == 0) goto L15
            r0 = r4
            org.webrtc.audio.VolumeLogger r0 = r0.volumeLogger
            r0.stop()
        L15:
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "stopPlayout"
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread r0 = r0.audioThread
            if (r0 == 0) goto L27
            r0 = 1
            goto L28
        L27:
            r0 = 0
        L28:
            assertTrue(r0)
            r0 = r4
            r0.logUnderrunCount()
            r0 = r4
            org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread r0 = r0.audioThread
            r0.stopThread()
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "Stopping the AudioTrackThread..."
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread r0 = r0.audioThread
            r0.interrupt()
            r0 = r4
            org.webrtc.audio.WebRtcAudioTrack$AudioTrackThread r0 = r0.audioThread
            r1 = 2000(0x7d0, double:9.88E-321)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r0, r1)
            if (r0 != 0) goto L65
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "Join of AudioTrackThread timed out."
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
        L65:
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "AudioTrackThread has now been stopped."
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            r1 = 0
            r0.audioThread = r1
            r0 = r4
            android.media.AudioTrack r0 = r0.audioTrack
            if (r0 == 0) goto La5
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "Calling AudioTrack.stop..."
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            android.media.AudioTrack r0 = r0.audioTrack     // Catch: java.lang.IllegalStateException -> L96
            r0.stop()     // Catch: java.lang.IllegalStateException -> L96
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "AudioTrack.stop is done."
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.IllegalStateException -> L96
            r0 = r4
            r1 = 1
            r0.doAudioTrackStateCallback(r1)     // Catch: java.lang.IllegalStateException -> L96
            goto La5
        L96:
            r5 = move-exception
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r5
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = "AudioTrack.stop failed: " + r1
            org.webrtc.Logging.e(r0, r1)
        La5:
            r0 = r4
            r0.releaseAudioResources()
            r0 = 1
            return r0
    }

    @org.webrtc.CalledByNative
    private int getStreamMaxVolume() {
            r3 = this;
            r0 = r3
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "getStreamMaxVolume"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.media.AudioManager r0 = r0.audioManager
            r1 = 0
            int r0 = r0.getStreamMaxVolume(r1)
            return r0
    }

    @org.webrtc.CalledByNative
    private boolean setStreamVolume(int r6) {
            r5 = this;
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r6
            java.lang.String r1 = "setStreamVolume(" + r1 + ")"
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            android.media.AudioManager r0 = r0.audioManager
            boolean r0 = r0.isVolumeFixed()
            if (r0 == 0) goto L26
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "The device implements a fixed volume policy."
            org.webrtc.Logging.e(r0, r1)
            r0 = 0
            return r0
        L26:
            r0 = r5
            android.media.AudioManager r0 = r0.audioManager
            r1 = 0
            r2 = r6
            r3 = 0
            r0.setStreamVolume(r1, r2, r3)
            r0 = 1
            return r0
    }

    @org.webrtc.CalledByNative
    private int getStreamVolume() {
            r3 = this;
            r0 = r3
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.threadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "getStreamVolume"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.media.AudioManager r0 = r0.audioManager
            r1 = 0
            int r0 = r0.getStreamVolume(r1)
            return r0
    }

    @org.webrtc.CalledByNative
    private int GetPlayoutUnderrunCount() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L19
            r0 = r3
            android.media.AudioTrack r0 = r0.audioTrack
            if (r0 == 0) goto L17
            r0 = r3
            android.media.AudioTrack r0 = r0.audioTrack
            int r0 = r0.getUnderrunCount()
            return r0
        L17:
            r0 = -1
            return r0
        L19:
            r0 = -2
            return r0
    }

    private void logMainParameters() {
            r6 = this;
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r6
            android.media.AudioTrack r1 = r1.audioTrack
            int r1 = r1.getAudioSessionId()
            r2 = r6
            android.media.AudioTrack r2 = r2.audioTrack
            int r2 = r2.getChannelCount()
            r3 = r6
            android.media.AudioTrack r3 = r3.audioTrack
            int r3 = r3.getSampleRate()
            float r4 = android.media.AudioTrack.getMaxVolume()
            java.lang.String r1 = "AudioTrack: session ID: " + r1 + ", channels: " + r2 + ", sample rate: " + r3 + ", max gain: " + r4
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private static void logNativeOutputSampleRate(int r3) {
            r0 = 0
            int r0 = android.media.AudioTrack.getNativeOutputSampleRate(r0)
            r4 = r0
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r4
            java.lang.String r1 = "nativeOutputSampleRate: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            r1 = r4
            if (r0 == r1) goto L1d
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "Unable to use fast mode since requested sample rate is not native"
            org.webrtc.Logging.w(r0, r1)
        L1d:
            return
    }

    private static android.media.AudioAttributes getAudioAttributes(@androidx.annotation.Nullable android.media.AudioAttributes r3) {
            android.media.AudioAttributes$Builder r0 = new android.media.AudioAttributes$Builder
            r1 = r0
            r1.<init>()
            r1 = 2
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
            r1 = 1
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
            r4 = r0
            r0 = r3
            if (r0 == 0) goto L4b
            r0 = r3
            int r0 = r0.getUsage()
            if (r0 == 0) goto L24
            r0 = r4
            r1 = r3
            int r1 = r1.getUsage()
            android.media.AudioAttributes$Builder r0 = r0.setUsage(r1)
        L24:
            r0 = r3
            int r0 = r0.getContentType()
            if (r0 == 0) goto L34
            r0 = r4
            r1 = r3
            int r1 = r1.getContentType()
            android.media.AudioAttributes$Builder r0 = r0.setContentType(r1)
        L34:
            r0 = r4
            r1 = r3
            int r1 = r1.getFlags()
            android.media.AudioAttributes$Builder r0 = r0.setFlags(r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L4b
            r0 = r4
            r1 = r3
            android.media.AudioAttributes$Builder r0 = applyAttributesOnQOrHigher(r0, r1)
            r4 = r0
        L4b:
            r0 = r4
            android.media.AudioAttributes r0 = r0.build()
            return r0
    }

    private static android.media.AudioTrack createAudioTrackBeforeOreo(int r8, int r9, int r10, @androidx.annotation.Nullable android.media.AudioAttributes r11) {
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "createAudioTrackBeforeOreo"
            org.webrtc.Logging.d(r0, r1)
            r0 = r8
            logNativeOutputSampleRate(r0)
            android.media.AudioTrack r0 = new android.media.AudioTrack
            r1 = r0
            r2 = r11
            android.media.AudioAttributes r2 = getAudioAttributes(r2)
            android.media.AudioFormat$Builder r3 = new android.media.AudioFormat$Builder
            r4 = r3
            r4.<init>()
            r4 = 2
            android.media.AudioFormat$Builder r3 = r3.setEncoding(r4)
            r4 = r8
            android.media.AudioFormat$Builder r3 = r3.setSampleRate(r4)
            r4 = r9
            android.media.AudioFormat$Builder r3 = r3.setChannelMask(r4)
            android.media.AudioFormat r3 = r3.build()
            r4 = r10
            r5 = 1
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @android.annotation.TargetApi(26)
    private static android.media.AudioTrack createAudioTrackOnOreoOrHigher(int r4, int r5, int r6, @androidx.annotation.Nullable android.media.AudioAttributes r7) {
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "createAudioTrackOnOreoOrHigher"
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            logNativeOutputSampleRate(r0)
            android.media.AudioTrack$Builder r0 = new android.media.AudioTrack$Builder
            r1 = r0
            r1.<init>()
            r1 = r7
            android.media.AudioAttributes r1 = getAudioAttributes(r1)
            android.media.AudioTrack$Builder r0 = r0.setAudioAttributes(r1)
            android.media.AudioFormat$Builder r1 = new android.media.AudioFormat$Builder
            r2 = r1
            r2.<init>()
            r2 = 2
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r2)
            r2 = r4
            android.media.AudioFormat$Builder r1 = r1.setSampleRate(r2)
            r2 = r5
            android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
            android.media.AudioFormat r1 = r1.build()
            android.media.AudioTrack$Builder r0 = r0.setAudioFormat(r1)
            r1 = r6
            android.media.AudioTrack$Builder r0 = r0.setBufferSizeInBytes(r1)
            r1 = 1
            android.media.AudioTrack$Builder r0 = r0.setPerformanceMode(r1)
            r1 = 1
            android.media.AudioTrack$Builder r0 = r0.setTransferMode(r1)
            r1 = 0
            android.media.AudioTrack$Builder r0 = r0.setSessionId(r1)
            android.media.AudioTrack r0 = r0.build()
            return r0
    }

    @android.annotation.TargetApi(29)
    private static android.media.AudioAttributes.Builder applyAttributesOnQOrHigher(android.media.AudioAttributes.Builder r3, android.media.AudioAttributes r4) {
            r0 = r3
            r1 = r4
            int r1 = r1.getAllowedCapturePolicy()
            android.media.AudioAttributes$Builder r0 = r0.setAllowedCapturePolicy(r1)
            return r0
    }

    private void logBufferSizeInFrames() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L19
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r3
            android.media.AudioTrack r1 = r1.audioTrack
            int r1 = r1.getBufferSizeInFrames()
            java.lang.String r1 = "AudioTrack: buffer size in frames: " + r1
            org.webrtc.Logging.d(r0, r1)
        L19:
            return
    }

    @org.webrtc.CalledByNative
    private int getBufferSizeInFrames() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L10
            r0 = r3
            android.media.AudioTrack r0 = r0.audioTrack
            int r0 = r0.getBufferSizeInFrames()
            return r0
        L10:
            r0 = -1
            return r0
    }

    @org.webrtc.CalledByNative
    private int getInitialBufferSizeInFrames() {
            r2 = this;
            r0 = r2
            int r0 = r0.initialBufferSizeInFrames
            return r0
    }

    private void logBufferCapacityInFrames() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L19
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r3
            android.media.AudioTrack r1 = r1.audioTrack
            int r1 = r1.getBufferCapacityInFrames()
            java.lang.String r1 = "AudioTrack: buffer capacity in frames: " + r1
            org.webrtc.Logging.d(r0, r1)
        L19:
            return
    }

    private void logMainParametersExtended() {
            r2 = this;
            r0 = r2
            r0.logBufferSizeInFrames()
            r0 = r2
            r0.logBufferCapacityInFrames()
            return
    }

    private void logUnderrunCount() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L19
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r3
            android.media.AudioTrack r1 = r1.audioTrack
            int r1 = r1.getUnderrunCount()
            java.lang.String r1 = "underrun count: " + r1
            org.webrtc.Logging.d(r0, r1)
        L19:
            return
    }

    private static void assertTrue(boolean r4) {
            r0 = r4
            if (r0 != 0) goto Lf
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            java.lang.String r2 = "Expected condition to be true"
            r1.<init>(r2)
            throw r0
        Lf:
            return
    }

    private int channelCountToConfiguration(int r4) {
            r3 = this;
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L9
            r0 = 4
            goto Lb
        L9:
            r0 = 12
        Lb:
            return r0
    }

    private static native void nativeCacheDirectBufferAddress(long r0, java.nio.ByteBuffer r2);

    private static native void nativeGetPlayoutData(long r0, int r2);

    public void setSpeakerMute(boolean r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r4
            java.lang.String r1 = "setSpeakerMute(" + r1 + ")"
            org.webrtc.Logging.w(r0, r1)
            r0 = r3
            r1 = r4
            r0.speakerMute = r1
            return
    }

    private void releaseAudioResources() {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "releaseAudioResources"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.media.AudioTrack r0 = r0.audioTrack
            if (r0 == 0) goto L1b
            r0 = r3
            android.media.AudioTrack r0 = r0.audioTrack
            r0.release()
            r0 = r3
            r1 = 0
            r0.audioTrack = r1
        L1b:
            return
    }

    private void reportWebRtcAudioTrackInitError(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r5
            java.lang.String r1 = "Init playout error: " + r1
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback r0 = r0.errorCallback
            if (r0 == 0) goto L29
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback r0 = r0.errorCallback
            r1 = r5
            r0.onWebRtcAudioTrackInitError(r1)
        L29:
            return
    }

    private void reportWebRtcAudioTrackStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r5
            r2 = r6
            java.lang.String r1 = "Start playout error: " + r1 + ". " + r2
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback r0 = r0.errorCallback
            if (r0 == 0) goto L2b
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback r0 = r0.errorCallback
            r1 = r5
            r2 = r6
            r0.onWebRtcAudioTrackStartError(r1, r2)
        L2b:
            return
    }

    private void reportWebRtcAudioTrackError(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r5
            java.lang.String r1 = "Run-time playback error: " + r1
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback r0 = r0.errorCallback
            if (r0 == 0) goto L29
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback r0 = r0.errorCallback
            r1 = r5
            r0.onWebRtcAudioTrackError(r1)
        L29:
            return
    }

    private void doAudioTrackStateCallback(int r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            r1 = r4
            java.lang.String r1 = "doAudioTrackStateCallback: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStateCallback r0 = r0.stateCallback
            if (r0 == 0) goto L3b
            r0 = r4
            if (r0 != 0) goto L22
            r0 = r3
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStateCallback r0 = r0.stateCallback
            r0.onWebRtcAudioTrackStart()
            goto L3b
        L22:
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L33
            r0 = r3
            org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStateCallback r0 = r0.stateCallback
            r0.onWebRtcAudioTrackStop()
            goto L3b
        L33:
            java.lang.String r0 = "WebRtcAudioTrackExternal"
            java.lang.String r1 = "Invalid audio state"
            org.webrtc.Logging.e(r0, r1)
        L3b:
            return
    }
}
