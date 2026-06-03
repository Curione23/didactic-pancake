package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/WebRtcAudioRecord.class */
class WebRtcAudioRecord {
    private static final java.lang.String TAG = "WebRtcAudioRecordExternal";
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int BUFFER_SIZE_FACTOR = 2;
    private static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    private static final int AUDIO_RECORD_START = 0;
    private static final int AUDIO_RECORD_STOP = 1;
    private static final int CHECK_REC_STATUS_DELAY_MS = 100;
    private final android.content.Context context;
    private final android.media.AudioManager audioManager;
    private final int audioSource;
    private final int audioFormat;
    private long nativeAudioRecord;
    private final org.webrtc.audio.WebRtcAudioEffects effects;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer byteBuffer;

    @androidx.annotation.Nullable
    private android.media.AudioRecord audioRecord;

    @androidx.annotation.Nullable
    private org.webrtc.audio.WebRtcAudioRecord.AudioRecordThread audioThread;

    @androidx.annotation.Nullable
    private android.media.AudioDeviceInfo preferredDevice;
    private final java.util.concurrent.ScheduledExecutorService executor;

    @androidx.annotation.Nullable
    private java.util.concurrent.ScheduledFuture<java.lang.String> future;
    private volatile boolean microphoneMute;
    private final java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> audioSourceMatchesRecordingSessionRef;
    private byte[] emptyBytes;

    @androidx.annotation.Nullable
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;

    @androidx.annotation.Nullable
    private final org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;

    @androidx.annotation.Nullable
    private final org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    private final boolean isAcousticEchoCancelerSupported;
    private final boolean isNoiseSuppressorSupported;
    private static final java.util.concurrent.atomic.AtomicInteger nextSchedulerId = null;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/WebRtcAudioRecord$AudioRecordThread.class */
    private class AudioRecordThread extends java.lang.Thread {
        private volatile boolean keepAlive;
        final /* synthetic */ org.webrtc.audio.WebRtcAudioRecord this$0;

        public AudioRecordThread(org.webrtc.audio.WebRtcAudioRecord r4, java.lang.String r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r1 = r5
                r0.<init>(r1)
                r0 = r3
                r1 = 1
                r0.keepAlive = r1
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r8 = this;
                r0 = -19
                android.os.Process.setThreadPriority(r0)
                java.lang.String r0 = "WebRtcAudioRecordExternal"
                java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
                java.lang.String r1 = "AudioRecordThread" + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                android.media.AudioRecord r0 = r0.audioRecord
                int r0 = r0.getRecordingState()
                r1 = 3
                if (r0 != r1) goto L24
                r0 = 1
                goto L25
            L24:
                r0 = 0
            L25:
                org.webrtc.audio.WebRtcAudioRecord.assertTrue(r0)
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                r1 = 0
                r0.doAudioRecordStateCallback(r1)
                long r0 = java.lang.System.nanoTime()
                r9 = r0
                r0 = 0
                r11 = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L46
                android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
                r1 = r0
                r1.<init>()
                r11 = r0
            L46:
                r0 = r8
                boolean r0 = r0.keepAlive
                if (r0 == 0) goto L16f
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                android.media.AudioRecord r0 = r0.audioRecord
                r1 = r8
                org.webrtc.audio.WebRtcAudioRecord r1 = r1.this$0
                java.nio.ByteBuffer r1 = r1.byteBuffer
                r2 = r8
                org.webrtc.audio.WebRtcAudioRecord r2 = r2.this$0
                java.nio.ByteBuffer r2 = r2.byteBuffer
                int r2 = r2.capacity()
                int r0 = r0.read(r1, r2)
                r12 = r0
                r0 = r12
                r1 = r8
                org.webrtc.audio.WebRtcAudioRecord r1 = r1.this$0
                java.nio.ByteBuffer r1 = r1.byteBuffer
                int r1 = r1.capacity()
                if (r0 != r1) goto L147
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                boolean r0 = r0.microphoneMute
                if (r0 == 0) goto La0
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                java.nio.ByteBuffer r0 = r0.clear()
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                r1 = r8
                org.webrtc.audio.WebRtcAudioRecord r1 = r1.this$0
                byte[] r1 = r1.emptyBytes
                java.nio.ByteBuffer r0 = r0.put(r1)
            La0:
                r0 = r8
                boolean r0 = r0.keepAlive
                if (r0 == 0) goto Ld9
                r0 = 0
                r13 = r0
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto Lc7
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                android.media.AudioRecord r0 = r0.audioRecord
                r1 = r11
                r2 = 0
                int r0 = r0.getTimestamp(r1, r2)
                if (r0 != 0) goto Lc7
                r0 = r11
                long r0 = r0.nanoTime
                r13 = r0
            Lc7:
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                r1 = r8
                org.webrtc.audio.WebRtcAudioRecord r1 = r1.this$0
                long r1 = r1.nativeAudioRecord
                r2 = r12
                r3 = r13
                r0.nativeDataIsRecorded(r1, r2, r3)
            Ld9:
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                org.webrtc.audio.JavaAudioDeviceModule$SamplesReadyCallback r0 = r0.audioSamplesReadyCallback
                if (r0 == 0) goto L16c
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                java.nio.ByteBuffer r0 = r0.byteBuffer
                byte[] r0 = r0.array()
                r1 = r8
                org.webrtc.audio.WebRtcAudioRecord r1 = r1.this$0
                java.nio.ByteBuffer r1 = r1.byteBuffer
                int r1 = r1.arrayOffset()
                r2 = r8
                org.webrtc.audio.WebRtcAudioRecord r2 = r2.this$0
                java.nio.ByteBuffer r2 = r2.byteBuffer
                int r2 = r2.capacity()
                r3 = r8
                org.webrtc.audio.WebRtcAudioRecord r3 = r3.this$0
                java.nio.ByteBuffer r3 = r3.byteBuffer
                int r3 = r3.arrayOffset()
                int r2 = r2 + r3
                byte[] r0 = java.util.Arrays.copyOfRange(r0, r1, r2)
                r13 = r0
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                org.webrtc.audio.JavaAudioDeviceModule$SamplesReadyCallback r0 = r0.audioSamplesReadyCallback
                org.webrtc.audio.JavaAudioDeviceModule$AudioSamples r1 = new org.webrtc.audio.JavaAudioDeviceModule$AudioSamples
                r2 = r1
                r3 = r8
                org.webrtc.audio.WebRtcAudioRecord r3 = r3.this$0
                android.media.AudioRecord r3 = r3.audioRecord
                int r3 = r3.getAudioFormat()
                r4 = r8
                org.webrtc.audio.WebRtcAudioRecord r4 = r4.this$0
                android.media.AudioRecord r4 = r4.audioRecord
                int r4 = r4.getChannelCount()
                r5 = r8
                org.webrtc.audio.WebRtcAudioRecord r5 = r5.this$0
                android.media.AudioRecord r5 = r5.audioRecord
                int r5 = r5.getSampleRate()
                r6 = r13
                r2.<init>(r3, r4, r5, r6)
                r0.onWebRtcAudioRecordSamplesReady(r1)
                goto L16c
            L147:
                r0 = r12
                java.lang.String r0 = "AudioRecord.read failed: " + r0
                r13 = r0
                java.lang.String r0 = "WebRtcAudioRecordExternal"
                r1 = r13
                org.webrtc.Logging.e(r0, r1)
                r0 = r12
                r1 = -3
                if (r0 != r1) goto L16c
                r0 = r8
                r1 = 0
                r0.keepAlive = r1
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0
                r1 = r13
                r0.reportWebRtcAudioRecordError(r1)
            L16c:
                goto L46
            L16f:
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0     // Catch: java.lang.IllegalStateException -> L18e
                android.media.AudioRecord r0 = r0.audioRecord     // Catch: java.lang.IllegalStateException -> L18e
                if (r0 == 0) goto L18b
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0     // Catch: java.lang.IllegalStateException -> L18e
                android.media.AudioRecord r0 = r0.audioRecord     // Catch: java.lang.IllegalStateException -> L18e
                r0.stop()     // Catch: java.lang.IllegalStateException -> L18e
                r0 = r8
                org.webrtc.audio.WebRtcAudioRecord r0 = r0.this$0     // Catch: java.lang.IllegalStateException -> L18e
                r1 = 1
                r0.doAudioRecordStateCallback(r1)     // Catch: java.lang.IllegalStateException -> L18e
            L18b:
                goto L19f
            L18e:
                r12 = move-exception
                java.lang.String r0 = "WebRtcAudioRecordExternal"
                r1 = r12
                java.lang.String r1 = r1.getMessage()
                java.lang.String r1 = "AudioRecord.stop failed: " + r1
                org.webrtc.Logging.e(r0, r1)
            L19f:
                return
        }

        public void stopThread() {
                r3 = this;
                java.lang.String r0 = "WebRtcAudioRecordExternal"
                java.lang.String r1 = "stopThread"
                org.webrtc.Logging.d(r0, r1)
                r0 = r3
                r1 = 0
                r0.keepAlive = r1
                return
        }
    }

    @org.webrtc.CalledByNative
    WebRtcAudioRecord(android.content.Context r13, android.media.AudioManager r14) {
            r12 = this;
            r0 = r12
            r1 = r13
            java.util.concurrent.ScheduledExecutorService r2 = newDefaultScheduler()
            r3 = r14
            r4 = 7
            r5 = 2
            r6 = 0
            r7 = 0
            r8 = 0
            boolean r9 = org.webrtc.audio.WebRtcAudioEffects.isAcousticEchoCancelerSupported()
            boolean r10 = org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public WebRtcAudioRecord(android.content.Context r5, java.util.concurrent.ScheduledExecutorService r6, android.media.AudioManager r7, int r8, int r9, @androidx.annotation.Nullable org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback r10, @androidx.annotation.Nullable org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback r11, @androidx.annotation.Nullable org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback r12, boolean r13, boolean r14) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            org.webrtc.audio.WebRtcAudioEffects r1 = new org.webrtc.audio.WebRtcAudioEffects
            r2 = r1
            r2.<init>()
            r0.effects = r1
            r0 = r4
            java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
            r2 = r1
            r2.<init>()
            r0.audioSourceMatchesRecordingSessionRef = r1
            r0 = r13
            if (r0 == 0) goto L2f
            boolean r0 = org.webrtc.audio.WebRtcAudioEffects.isAcousticEchoCancelerSupported()
            if (r0 != 0) goto L2f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "HW AEC not supported"
            r1.<init>(r2)
            throw r0
        L2f:
            r0 = r14
            if (r0 == 0) goto L44
            boolean r0 = org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported()
            if (r0 != 0) goto L44
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "HW NS not supported"
            r1.<init>(r2)
            throw r0
        L44:
            r0 = r4
            r1 = r5
            r0.context = r1
            r0 = r4
            r1 = r6
            r0.executor = r1
            r0 = r4
            r1 = r7
            r0.audioManager = r1
            r0 = r4
            r1 = r8
            r0.audioSource = r1
            r0 = r4
            r1 = r9
            r0.audioFormat = r1
            r0 = r4
            r1 = r10
            r0.errorCallback = r1
            r0 = r4
            r1 = r11
            r0.stateCallback = r1
            r0 = r4
            r1 = r12
            r0.audioSamplesReadyCallback = r1
            r0 = r4
            r1 = r13
            r0.isAcousticEchoCancelerSupported = r1
            r0 = r4
            r1 = r14
            r0.isNoiseSuppressorSupported = r1
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.getThreadInfo()
            java.lang.String r1 = "ctor" + r1
            org.webrtc.Logging.d(r0, r1)
            return
    }

    @org.webrtc.CalledByNative
    public void setNativeAudioRecord(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.nativeAudioRecord = r1
            return
    }

    @org.webrtc.CalledByNative
    boolean isAcousticEchoCancelerSupported() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isAcousticEchoCancelerSupported
            return r0
    }

    @org.webrtc.CalledByNative
    boolean isNoiseSuppressorSupported() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isNoiseSuppressorSupported
            return r0
    }

    @org.webrtc.CalledByNative
    boolean isAudioConfigVerified() {
            r2 = this;
            r0 = r2
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r0.audioSourceMatchesRecordingSessionRef
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @org.webrtc.CalledByNative
    boolean isAudioSourceMatchingRecordingSession() {
            r3 = this;
            r0 = r3
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r0.audioSourceMatchesRecordingSessionRef
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L18
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "Audio configuration has not yet been verified"
            org.webrtc.Logging.w(r0, r1)
            r0 = 0
            return r0
        L18:
            r0 = r4
            boolean r0 = r0.booleanValue()
            return r0
    }

    @org.webrtc.CalledByNative
    private boolean enableBuiltInAEC(boolean r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            java.lang.String r1 = "enableBuiltInAEC(" + r1 + ")"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.WebRtcAudioEffects r0 = r0.effects
            r1 = r4
            boolean r0 = r0.setAEC(r1)
            return r0
    }

    @org.webrtc.CalledByNative
    private boolean enableBuiltInNS(boolean r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            java.lang.String r1 = "enableBuiltInNS(" + r1 + ")"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.WebRtcAudioEffects r0 = r0.effects
            r1 = r4
            boolean r0 = r0.setNS(r1)
            return r0
    }

    @org.webrtc.CalledByNative
    private int initRecording(int r8, int r9) {
            r7 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r8
            r2 = r9
            java.lang.String r1 = "initRecording(sampleRate=" + r1 + ", channels=" + r2 + ")"
            org.webrtc.Logging.d(r0, r1)
            r0 = r7
            android.media.AudioRecord r0 = r0.audioRecord
            if (r0 == 0) goto L1b
            r0 = r7
            java.lang.String r1 = "InitRecording called twice without StopRecording."
            r0.reportWebRtcAudioRecordInitError(r1)
            r0 = -1
            return r0
        L1b:
            r0 = r9
            r1 = r7
            int r1 = r1.audioFormat
            int r1 = getBytesPerSample(r1)
            int r0 = r0 * r1
            r10 = r0
            r0 = r8
            r1 = 100
            int r0 = r0 / r1
            r11 = r0
            r0 = r7
            r1 = r10
            r2 = r11
            int r1 = r1 * r2
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            r0.byteBuffer = r1
            r0 = r7
            java.nio.ByteBuffer r0 = r0.byteBuffer
            boolean r0 = r0.hasArray()
            if (r0 != 0) goto L48
            r0 = r7
            java.lang.String r1 = "ByteBuffer does not have backing array."
            r0.reportWebRtcAudioRecordInitError(r1)
            r0 = -1
            return r0
        L48:
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r7
            java.nio.ByteBuffer r1 = r1.byteBuffer
            int r1 = r1.capacity()
            java.lang.String r1 = "byteBuffer.capacity: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r7
            r1 = r7
            java.nio.ByteBuffer r1 = r1.byteBuffer
            int r1 = r1.capacity()
            byte[] r1 = new byte[r1]
            r0.emptyBytes = r1
            r0 = r7
            r1 = r7
            long r1 = r1.nativeAudioRecord
            r2 = r7
            java.nio.ByteBuffer r2 = r2.byteBuffer
            r0.nativeCacheDirectBufferAddress(r1, r2)
            r0 = r7
            r1 = r9
            int r0 = r0.channelCountToConfiguration(r1)
            r12 = r0
            r0 = r8
            r1 = r12
            r2 = r7
            int r2 = r2.audioFormat
            int r0 = android.media.AudioRecord.getMinBufferSize(r0, r1, r2)
            r13 = r0
            r0 = r13
            r1 = -1
            if (r0 == r1) goto L92
            r0 = r13
            r1 = -2
            if (r0 != r1) goto L9f
        L92:
            r0 = r7
            r1 = r13
            java.lang.String r1 = "AudioRecord.getMinBufferSize failed: " + r1
            r0.reportWebRtcAudioRecordInitError(r1)
            r0 = -1
            return r0
        L9f:
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r13
            java.lang.String r1 = "AudioRecord.getMinBufferSize: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = 2
            r1 = r13
            int r0 = r0 * r1
            r1 = r7
            java.nio.ByteBuffer r1 = r1.byteBuffer
            int r1 = r1.capacity()
            int r0 = java.lang.Math.max(r0, r1)
            r14 = r0
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r14
            java.lang.String r1 = "bufferSizeInBytes: " + r1
            org.webrtc.Logging.d(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L11c
            r1 = 23
            if (r0 < r1) goto Lfd
            r0 = r7
            r1 = r7
            int r1 = r1.audioSource     // Catch: java.lang.Throwable -> L11c
            r2 = r8
            r3 = r12
            r4 = r7
            int r4 = r4.audioFormat     // Catch: java.lang.Throwable -> L11c
            r5 = r14
            android.media.AudioRecord r1 = createAudioRecordOnMOrHigher(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L11c
            r0.audioRecord = r1     // Catch: java.lang.Throwable -> L11c
            r0 = r7
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r0.audioSourceMatchesRecordingSessionRef     // Catch: java.lang.Throwable -> L11c
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L11c
            r0 = r7
            android.media.AudioDeviceInfo r0 = r0.preferredDevice     // Catch: java.lang.Throwable -> L11c
            if (r0 == 0) goto L119
            r0 = r7
            r1 = r7
            android.media.AudioDeviceInfo r1 = r1.preferredDevice     // Catch: java.lang.Throwable -> L11c
            r0.setPreferredDevice(r1)     // Catch: java.lang.Throwable -> L11c
            goto L119
        Lfd:
            r0 = r7
            r1 = r7
            int r1 = r1.audioSource     // Catch: java.lang.Throwable -> L11c
            r2 = r8
            r3 = r12
            r4 = r7
            int r4 = r4.audioFormat     // Catch: java.lang.Throwable -> L11c
            r5 = r14
            android.media.AudioRecord r1 = createAudioRecordOnLowerThanM(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L11c
            r0.audioRecord = r1     // Catch: java.lang.Throwable -> L11c
            r0 = r7
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r0.audioSourceMatchesRecordingSessionRef     // Catch: java.lang.Throwable -> L11c
            r1 = 0
            r0.set(r1)     // Catch: java.lang.Throwable -> L11c
        L119:
            goto L12d
        L11c:
            r15 = move-exception
            r0 = r7
            r1 = r15
            java.lang.String r1 = r1.getMessage()
            r0.reportWebRtcAudioRecordInitError(r1)
            r0 = r7
            r0.releaseAudioResources()
            r0 = -1
            return r0
        L12d:
            r0 = r7
            android.media.AudioRecord r0 = r0.audioRecord
            if (r0 == 0) goto L13f
            r0 = r7
            android.media.AudioRecord r0 = r0.audioRecord
            int r0 = r0.getState()
            r1 = 1
            if (r0 == r1) goto L14b
        L13f:
            r0 = r7
            java.lang.String r1 = "Creation or initialization of audio recorder failed."
            r0.reportWebRtcAudioRecordInitError(r1)
            r0 = r7
            r0.releaseAudioResources()
            r0 = -1
            return r0
        L14b:
            r0 = r7
            org.webrtc.audio.WebRtcAudioEffects r0 = r0.effects
            r1 = r7
            android.media.AudioRecord r1 = r1.audioRecord
            int r1 = r1.getAudioSessionId()
            r0.enable(r1)
            r0 = r7
            r0.logMainParameters()
            r0 = r7
            r0.logMainParametersExtended()
            r0 = r7
            r1 = r7
            android.media.AudioRecord r1 = r1.audioRecord
            r2 = 0
            int r0 = r0.logRecordingConfigurations(r1, r2)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L17d
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r15
            java.lang.String r1 = "Potential microphone conflict. Active sessions: " + r1
            org.webrtc.Logging.w(r0, r1)
        L17d:
            r0 = r11
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    @android.annotation.TargetApi(23)
    void setPreferredDevice(@androidx.annotation.Nullable android.media.AudioDeviceInfo r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            if (r1 == 0) goto L10
            r1 = r4
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L11
        L10:
            r1 = 0
        L11:
            java.lang.String r1 = "setPreferredDevice " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            r1 = r4
            r0.preferredDevice = r1
            r0 = r3
            android.media.AudioRecord r0 = r0.audioRecord
            if (r0 == 0) goto L38
            r0 = r3
            android.media.AudioRecord r0 = r0.audioRecord
            r1 = r4
            boolean r0 = r0.setPreferredDevice(r1)
            if (r0 != 0) goto L38
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "setPreferredDevice failed"
            org.webrtc.Logging.e(r0, r1)
        L38:
            return
    }

    @org.webrtc.CalledByNative
    private boolean startRecording() {
            r6 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "startRecording"
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            android.media.AudioRecord r0 = r0.audioRecord
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            assertTrue(r0)
            r0 = r6
            org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread r0 = r0.audioThread
            if (r0 != 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            assertTrue(r0)
            r0 = r6
            android.media.AudioRecord r0 = r0.audioRecord     // Catch: java.lang.IllegalStateException -> L30
            r0.startRecording()     // Catch: java.lang.IllegalStateException -> L30
            goto L43
        L30:
            r7 = move-exception
            r0 = r6
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode r1 = org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION
            r2 = r7
            java.lang.String r2 = r2.getMessage()
            java.lang.String r2 = "AudioRecord.startRecording failed: " + r2
            r0.reportWebRtcAudioRecordStartError(r1, r2)
            r0 = 0
            return r0
        L43:
            r0 = r6
            android.media.AudioRecord r0 = r0.audioRecord
            int r0 = r0.getRecordingState()
            r1 = 3
            if (r0 == r1) goto L63
            r0 = r6
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode r1 = org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH
            r2 = r6
            android.media.AudioRecord r2 = r2.audioRecord
            int r2 = r2.getRecordingState()
            java.lang.String r2 = "AudioRecord.startRecording failed - incorrect state: " + r2
            r0.reportWebRtcAudioRecordStartError(r1, r2)
            r0 = 0
            return r0
        L63:
            r0 = r6
            org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread r1 = new org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread
            r2 = r1
            r3 = r6
            java.lang.String r4 = "AudioRecordJavaThread"
            r2.<init>(r3, r4)
            r0.audioThread = r1
            r0 = r6
            org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread r0 = r0.audioThread
            r0.start()
            r0 = r6
            r1 = r6
            android.media.AudioRecord r1 = r1.audioRecord
            r0.scheduleLogRecordingConfigurationsTask(r1)
            r0 = 1
            return r0
    }

    @org.webrtc.CalledByNative
    private boolean stopRecording() {
            r4 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "stopRecording"
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread r0 = r0.audioThread
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            assertTrue(r0)
            r0 = r4
            java.util.concurrent.ScheduledFuture<java.lang.String> r0 = r0.future
            if (r0 == 0) goto L3a
            r0 = r4
            java.util.concurrent.ScheduledFuture<java.lang.String> r0 = r0.future
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L35
            r0 = r4
            java.util.concurrent.ScheduledFuture<java.lang.String> r0 = r0.future
            r1 = 1
            boolean r0 = r0.cancel(r1)
        L35:
            r0 = r4
            r1 = 0
            r0.future = r1
        L3a:
            r0 = r4
            org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread r0 = r0.audioThread
            r0.stopThread()
            r0 = r4
            org.webrtc.audio.WebRtcAudioRecord$AudioRecordThread r0 = r0.audioThread
            r1 = 2000(0x7d0, double:9.88E-321)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r0, r1)
            if (r0 != 0) goto L63
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "Join of AudioRecordJavaThread timed out"
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
        L63:
            r0 = r4
            r1 = 0
            r0.audioThread = r1
            r0 = r4
            org.webrtc.audio.WebRtcAudioEffects r0 = r0.effects
            r0.release()
            r0 = r4
            r0.releaseAudioResources()
            r0 = 1
            return r0
    }

    @android.annotation.TargetApi(23)
    private static android.media.AudioRecord createAudioRecordOnMOrHigher(int r4, int r5, int r6, int r7, int r8) {
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "createAudioRecordOnMOrHigher"
            org.webrtc.Logging.d(r0, r1)
            android.media.AudioRecord$Builder r0 = new android.media.AudioRecord$Builder
            r1 = r0
            r1.<init>()
            r1 = r4
            android.media.AudioRecord$Builder r0 = r0.setAudioSource(r1)
            android.media.AudioFormat$Builder r1 = new android.media.AudioFormat$Builder
            r2 = r1
            r2.<init>()
            r2 = r7
            android.media.AudioFormat$Builder r1 = r1.setEncoding(r2)
            r2 = r5
            android.media.AudioFormat$Builder r1 = r1.setSampleRate(r2)
            r2 = r6
            android.media.AudioFormat$Builder r1 = r1.setChannelMask(r2)
            android.media.AudioFormat r1 = r1.build()
            android.media.AudioRecord$Builder r0 = r0.setAudioFormat(r1)
            r1 = r8
            android.media.AudioRecord$Builder r0 = r0.setBufferSizeInBytes(r1)
            android.media.AudioRecord r0 = r0.build()
            return r0
    }

    private static android.media.AudioRecord createAudioRecordOnLowerThanM(int r8, int r9, int r10, int r11, int r12) {
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "createAudioRecordOnLowerThanM"
            org.webrtc.Logging.d(r0, r1)
            android.media.AudioRecord r0 = new android.media.AudioRecord
            r1 = r0
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    private void logMainParameters() {
            r5 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r5
            android.media.AudioRecord r1 = r1.audioRecord
            int r1 = r1.getAudioSessionId()
            r2 = r5
            android.media.AudioRecord r2 = r2.audioRecord
            int r2 = r2.getChannelCount()
            r3 = r5
            android.media.AudioRecord r3 = r3.audioRecord
            int r3 = r3.getSampleRate()
            java.lang.String r1 = "AudioRecord: session ID: " + r1 + ", channels: " + r2 + ", sample rate: " + r3
            org.webrtc.Logging.d(r0, r1)
            return
    }

    @android.annotation.TargetApi(23)
    private void logMainParametersExtended() {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L19
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r3
            android.media.AudioRecord r1 = r1.audioRecord
            int r1 = r1.getBufferSizeInFrames()
            java.lang.String r1 = "AudioRecord: buffer size in frames: " + r1
            org.webrtc.Logging.d(r0, r1)
        L19:
            return
    }

    @android.annotation.TargetApi(24)
    private int logRecordingConfigurations(android.media.AudioRecord r8, boolean r9) {
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L12
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "AudioManager#getActiveRecordingConfigurations() requires N or higher"
            org.webrtc.Logging.w(r0, r1)
            r0 = 0
            return r0
        L12:
            r0 = r8
            if (r0 != 0) goto L18
            r0 = 0
            return r0
        L18:
            r0 = r7
            android.media.AudioManager r0 = r0.audioManager
            java.util.List r0 = r0.getActiveRecordingConfigurations()
            r10 = r0
            r0 = r10
            int r0 = r0.size()
            r11 = r0
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r11
            java.lang.String r1 = "Number of active recording sessions: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r11
            if (r0 <= 0) goto L64
            r0 = r8
            int r0 = r0.getAudioSessionId()
            r1 = r10
            boolean r0 = logActiveRecordingConfigs(r0, r1)
            r0 = r9
            if (r0 == 0) goto L64
            r0 = r7
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r0.audioSourceMatchesRecordingSessionRef
            r1 = r8
            int r1 = r1.getAudioSource()
            r2 = r8
            int r2 = r2.getAudioSessionId()
            r3 = r8
            android.media.AudioFormat r3 = r3.getFormat()
            r4 = r8
            android.media.AudioDeviceInfo r4 = r4.getRoutedDevice()
            r5 = r10
            boolean r1 = verifyAudioConfig(r1, r2, r3, r4, r5)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.set(r1)
        L64:
            r0 = r11
            return r0
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
            if (r0 != r1) goto La
            r0 = 16
            goto Lc
        La:
            r0 = 12
        Lc:
            return r0
    }

    private native void nativeCacheDirectBufferAddress(long r1, java.nio.ByteBuffer r3);

    private native void nativeDataIsRecorded(long r1, int r3, long r4);

    public void setMicrophoneMute(boolean r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            java.lang.String r1 = "setMicrophoneMute(" + r1 + ")"
            org.webrtc.Logging.w(r0, r1)
            r0 = r3
            r1 = r4
            r0.microphoneMute = r1
            return
    }

    public boolean setNoiseSuppressorEnabled(boolean r4) {
            r3 = this;
            boolean r0 = org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported()
            if (r0 != 0) goto L10
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "Noise suppressor is not supported."
            org.webrtc.Logging.e(r0, r1)
            r0 = 0
            return r0
        L10:
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            java.lang.String r1 = "SetNoiseSuppressorEnabled(" + r1 + ")"
            org.webrtc.Logging.w(r0, r1)
            r0 = r3
            org.webrtc.audio.WebRtcAudioEffects r0 = r0.effects
            r1 = r4
            boolean r0 = r0.toggleNS(r1)
            return r0
    }

    private void releaseAudioResources() {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "releaseAudioResources"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.media.AudioRecord r0 = r0.audioRecord
            if (r0 == 0) goto L1b
            r0 = r3
            android.media.AudioRecord r0 = r0.audioRecord
            r0.release()
            r0 = r3
            r1 = 0
            r0.audioRecord = r1
        L1b:
            r0 = r3
            java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r0 = r0.audioSourceMatchesRecordingSessionRef
            r1 = 0
            r0.set(r1)
            return
    }

    private void reportWebRtcAudioRecordInitError(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r5
            java.lang.String r1 = "Init recording error: " + r1
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
            r0 = r4
            r1 = r4
            android.media.AudioRecord r1 = r1.audioRecord
            r2 = 0
            int r0 = r0.logRecordingConfigurations(r1, r2)
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback r0 = r0.errorCallback
            if (r0 == 0) goto L33
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback r0 = r0.errorCallback
            r1 = r5
            r0.onWebRtcAudioRecordInitError(r1)
        L33:
            return
    }

    private void reportWebRtcAudioRecordStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode r5, java.lang.String r6) {
            r4 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r5
            r2 = r6
            java.lang.String r1 = "Start recording error: " + r1 + ". " + r2
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
            r0 = r4
            r1 = r4
            android.media.AudioRecord r1 = r1.audioRecord
            r2 = 0
            int r0 = r0.logRecordingConfigurations(r1, r2)
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback r0 = r0.errorCallback
            if (r0 == 0) goto L35
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback r0 = r0.errorCallback
            r1 = r5
            r2 = r6
            r0.onWebRtcAudioRecordStartError(r1, r2)
        L35:
            return
    }

    private void reportWebRtcAudioRecordError(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r5
            java.lang.String r1 = "Run-time recording error: " + r1
            org.webrtc.Logging.e(r0, r1)
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            android.content.Context r1 = r1.context
            r2 = r4
            android.media.AudioManager r2 = r2.audioManager
            org.webrtc.audio.WebRtcAudioUtils.logAudioState(r0, r1, r2)
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback r0 = r0.errorCallback
            if (r0 == 0) goto L29
            r0 = r4
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback r0 = r0.errorCallback
            r1 = r5
            r0.onWebRtcAudioRecordError(r1)
        L29:
            return
    }

    private void doAudioRecordStateCallback(int r4) {
            r3 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r4
            java.lang.String r1 = audioStateToString(r1)
            java.lang.String r1 = "doAudioRecordStateCallback: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStateCallback r0 = r0.stateCallback
            if (r0 == 0) goto L3e
            r0 = r4
            if (r0 != 0) goto L25
            r0 = r3
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStateCallback r0 = r0.stateCallback
            r0.onWebRtcAudioRecordStart()
            goto L3e
        L25:
            r0 = r4
            r1 = 1
            if (r0 != r1) goto L36
            r0 = r3
            org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStateCallback r0 = r0.stateCallback
            r0.onWebRtcAudioRecordStop()
            goto L3e
        L36:
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "Invalid audio state"
            org.webrtc.Logging.e(r0, r1)
        L3e:
            return
    }

    private static int getBytesPerSample(int r4) {
            r0 = r4
            switch(r0) {
                case 0: goto L4e;
                case 1: goto L4a;
                case 2: goto L4a;
                case 3: goto L48;
                case 4: goto L4c;
                case 5: goto L4e;
                case 6: goto L4e;
                case 7: goto L4e;
                case 8: goto L4e;
                case 9: goto L4e;
                case 10: goto L4e;
                case 11: goto L4e;
                case 12: goto L4e;
                case 13: goto L4a;
                default: goto L4e;
            }
        L48:
            r0 = 1
            return r0
        L4a:
            r0 = 2
            return r0
        L4c:
            r0 = 4
            return r0
        L4e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r4
            java.lang.String r2 = "Bad audio format " + r2
            r1.<init>(r2)
            throw r0
    }

    private void scheduleLogRecordingConfigurationsTask(android.media.AudioRecord r8) {
            r7 = this;
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "scheduleLogRecordingConfigurationsTask"
            org.webrtc.Logging.d(r0, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 >= r1) goto L11
            return
        L11:
            r0 = r7
            r1 = r8
            void r0 = () -> { // java.util.concurrent.Callable.call():java.lang.Object
                return r0.lambda$scheduleLogRecordingConfigurationsTask$0(r1);
            }
            r9 = r0
            r0 = r7
            java.util.concurrent.ScheduledFuture<java.lang.String> r0 = r0.future
            if (r0 == 0) goto L37
            r0 = r7
            java.util.concurrent.ScheduledFuture<java.lang.String> r0 = r0.future
            boolean r0 = r0.isDone()
            if (r0 != 0) goto L37
            r0 = r7
            java.util.concurrent.ScheduledFuture<java.lang.String> r0 = r0.future
            r1 = 1
            boolean r0 = r0.cancel(r1)
        L37:
            r0 = r7
            r1 = r7
            java.util.concurrent.ScheduledExecutorService r1 = r1.executor
            r2 = r9
            r3 = 100
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r1 = r1.schedule(r2, r3, r4)
            r0.future = r1
            return
    }

    @android.annotation.TargetApi(24)
    private static boolean logActiveRecordingConfigs(int r3, java.util.List<android.media.AudioRecordingConfiguration> r4) {
            r0 = r4
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            assertTrue(r0)
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "AudioRecordingConfigurations: "
            org.webrtc.Logging.d(r0, r1)
        L20:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L180
            r0 = r5
            java.lang.Object r0 = r0.next()
            android.media.AudioRecordingConfiguration r0 = (android.media.AudioRecordingConfiguration) r0
            r6 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            int r0 = r0.getClientAudioSource()
            r8 = r0
            r0 = r7
            java.lang.String r1 = "  client audio source="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.audioSourceToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", client session id="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            int r1 = r1.getClientAudioSessionId()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " ("
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            android.media.AudioFormat r0 = r0.getFormat()
            r9 = r0
            r0 = r7
            java.lang.String r1 = "  Device AudioFormat: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "channel count="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getChannelCount()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", channel index mask="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getChannelIndexMask()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", channel mask="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getChannelMask()
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.channelMaskToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", encoding="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getEncoding()
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.audioEncodingToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", sample rate="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getSampleRate()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            android.media.AudioFormat r0 = r0.getClientFormat()
            r9 = r0
            r0 = r7
            java.lang.String r1 = "  Client AudioFormat: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "channel count="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getChannelCount()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", channel index mask="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getChannelIndexMask()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", channel mask="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getChannelMask()
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.channelMaskToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", encoding="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getEncoding()
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.audioEncodingToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", sample rate="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            int r1 = r1.getSampleRate()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r6
            android.media.AudioDeviceInfo r0 = r0.getAudioDevice()
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L173
            r0 = r10
            boolean r0 = r0.isSource()
            assertTrue(r0)
            r0 = r7
            java.lang.String r1 = "  AudioDevice: "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "type="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            int r1 = r1.getType()
            java.lang.String r1 = org.webrtc.audio.WebRtcAudioUtils.deviceTypeToString(r1)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", id="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            int r1 = r1.getId()
            java.lang.StringBuilder r0 = r0.append(r1)
        L173:
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            r1 = r7
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.d(r0, r1)
            goto L20
        L180:
            r0 = 1
            return r0
    }

    @android.annotation.TargetApi(24)
    private static boolean verifyAudioConfig(int r3, int r4, android.media.AudioFormat r5, android.media.AudioDeviceInfo r6, java.util.List<android.media.AudioRecordingConfiguration> r7) {
            r0 = r7
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            assertTrue(r0)
            r0 = r7
            java.util.Iterator r0 = r0.iterator()
            r8 = r0
        L1b:
            r0 = r8
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto Ld0
            r0 = r8
            java.lang.Object r0 = r0.next()
            android.media.AudioRecordingConfiguration r0 = (android.media.AudioRecordingConfiguration) r0
            r9 = r0
            r0 = r9
            android.media.AudioDeviceInfo r0 = r0.getAudioDevice()
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L40
            goto L1b
        L40:
            r0 = r9
            int r0 = r0.getClientAudioSource()
            r1 = r3
            if (r0 != r1) goto Lcd
            r0 = r9
            int r0 = r0.getClientAudioSessionId()
            r1 = r4
            if (r0 != r1) goto Lcd
            r0 = r9
            android.media.AudioFormat r0 = r0.getClientFormat()
            int r0 = r0.getEncoding()
            r1 = r5
            int r1 = r1.getEncoding()
            if (r0 != r1) goto Lcd
            r0 = r9
            android.media.AudioFormat r0 = r0.getClientFormat()
            int r0 = r0.getSampleRate()
            r1 = r5
            int r1 = r1.getSampleRate()
            if (r0 != r1) goto Lcd
            r0 = r9
            android.media.AudioFormat r0 = r0.getClientFormat()
            int r0 = r0.getChannelMask()
            r1 = r5
            int r1 = r1.getChannelMask()
            if (r0 != r1) goto Lcd
            r0 = r9
            android.media.AudioFormat r0 = r0.getClientFormat()
            int r0 = r0.getChannelIndexMask()
            r1 = r5
            int r1 = r1.getChannelIndexMask()
            if (r0 != r1) goto Lcd
            r0 = r9
            android.media.AudioFormat r0 = r0.getFormat()
            int r0 = r0.getEncoding()
            if (r0 == 0) goto Lcd
            r0 = r9
            android.media.AudioFormat r0 = r0.getFormat()
            int r0 = r0.getSampleRate()
            if (r0 <= 0) goto Lcd
            r0 = r9
            android.media.AudioFormat r0 = r0.getFormat()
            int r0 = r0.getChannelMask()
            if (r0 != 0) goto Lba
            r0 = r9
            android.media.AudioFormat r0 = r0.getFormat()
            int r0 = r0.getChannelIndexMask()
            if (r0 == 0) goto Lcd
        Lba:
            r0 = r10
            r1 = r6
            boolean r0 = checkDeviceMatch(r0, r1)
            if (r0 == 0) goto Lcd
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "verifyAudioConfig: PASS"
            org.webrtc.Logging.d(r0, r1)
            r0 = 1
            return r0
        Lcd:
            goto L1b
        Ld0:
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "verifyAudioConfig: FAILED"
            org.webrtc.Logging.e(r0, r1)
            r0 = 0
            return r0
    }

    @android.annotation.TargetApi(24)
    private static boolean checkDeviceMatch(android.media.AudioDeviceInfo r3, android.media.AudioDeviceInfo r4) {
            r0 = r3
            int r0 = r0.getId()
            r1 = r4
            int r1 = r1.getId()
            if (r0 != r1) goto L1a
            r0 = r3
            int r0 = r0.getType()
            r1 = r4
            int r1 = r1.getType()
            if (r0 != r1) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    private static java.lang.String audioStateToString(int r2) {
            r0 = r2
            switch(r0) {
                case 0: goto L1c;
                case 1: goto L20;
                default: goto L24;
            }
        L1c:
            java.lang.String r0 = "START"
            return r0
        L20:
            java.lang.String r0 = "STOP"
            return r0
        L24:
            java.lang.String r0 = "INVALID"
            return r0
    }

    static java.util.concurrent.ScheduledExecutorService newDefaultScheduler() {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            r5 = r0
            r0 = 0
            org.webrtc.audio.WebRtcAudioRecord$1 r1 = new org.webrtc.audio.WebRtcAudioRecord$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            java.util.concurrent.ScheduledExecutorService r0 = java.util.concurrent.Executors.newScheduledThreadPool(r0, r1)
            return r0
    }

    private /* synthetic */ java.lang.String lambda$scheduleLogRecordingConfigurationsTask$0(android.media.AudioRecord r5) throws java.lang.Exception {
            r4 = this;
            r0 = r4
            android.media.AudioRecord r0 = r0.audioRecord
            r1 = r5
            if (r0 != r1) goto L12
            r0 = r4
            r1 = r5
            r2 = 1
            int r0 = r0.logRecordingConfigurations(r1, r2)
            goto L1a
        L12:
            java.lang.String r0 = "WebRtcAudioRecordExternal"
            java.lang.String r1 = "audio record has changed"
            org.webrtc.Logging.d(r0, r1)
        L1a:
            java.lang.String r0 = "Scheduled task is done"
            return r0
    }

    static {
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.webrtc.audio.WebRtcAudioRecord.nextSchedulerId = r0
            return
    }
}
