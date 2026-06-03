package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule.class */
public class JavaAudioDeviceModule implements org.webrtc.audio.AudioDeviceModule {
    private static final java.lang.String TAG = "JavaAudioDeviceModule";
    private final android.content.Context context;
    private final android.media.AudioManager audioManager;
    private final org.webrtc.audio.WebRtcAudioRecord audioInput;
    private final org.webrtc.audio.WebRtcAudioTrack audioOutput;
    private final int inputSampleRate;
    private final int outputSampleRate;
    private final boolean useStereoInput;
    private final boolean useStereoOutput;
    private final java.lang.Object nativeLock;
    private long nativeAudioDeviceModule;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$AudioRecordErrorCallback.class */
    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordInitError(java.lang.String r1);

        void onWebRtcAudioRecordStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode r1, java.lang.String r2);

        void onWebRtcAudioRecordError(java.lang.String r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$AudioRecordStartErrorCode.class */
    public enum AudioRecordStartErrorCode extends java.lang.Enum<org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode> {
        public static final org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode AUDIO_RECORD_START_EXCEPTION = null;
        public static final org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode AUDIO_RECORD_START_STATE_MISMATCH = null;
        private static final /* synthetic */ org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode[] $VALUES = null;

        public static org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode[] values() {
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode[] r0 = org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode[] r0 = (org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode[]) r0
                return r0
        }

        public static org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode> r0 = org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode r0 = (org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode) r0
                return r0
        }

        AudioRecordStartErrorCode(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode[] $values() {
                r0 = 2
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode[] r0 = new org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode[r0]
                r1 = r0
                r2 = 0
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode r3 = org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode r3 = org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode r0 = new org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode
                r1 = r0
                java.lang.String r2 = "AUDIO_RECORD_START_EXCEPTION"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION = r0
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode r0 = new org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode
                r1 = r0
                java.lang.String r2 = "AUDIO_RECORD_START_STATE_MISMATCH"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH = r0
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStartErrorCode[] r0 = $values()
                org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStartErrorCode.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$AudioRecordStateCallback.class */
    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$AudioSamples.class */
    public static class AudioSamples {
        private final int audioFormat;
        private final int channelCount;
        private final int sampleRate;
        private final byte[] data;

        public AudioSamples(int r4, int r5, int r6, byte[] r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.audioFormat = r1
                r0 = r3
                r1 = r5
                r0.channelCount = r1
                r0 = r3
                r1 = r6
                r0.sampleRate = r1
                r0 = r3
                r1 = r7
                r0.data = r1
                return
        }

        public int getAudioFormat() {
                r2 = this;
                r0 = r2
                int r0 = r0.audioFormat
                return r0
        }

        public int getChannelCount() {
                r2 = this;
                r0 = r2
                int r0 = r0.channelCount
                return r0
        }

        public int getSampleRate() {
                r2 = this;
                r0 = r2
                int r0 = r0.sampleRate
                return r0
        }

        public byte[] getData() {
                r2 = this;
                r0 = r2
                byte[] r0 = r0.data
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$AudioTrackErrorCallback.class */
    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackInitError(java.lang.String r1);

        void onWebRtcAudioTrackStartError(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode r1, java.lang.String r2);

        void onWebRtcAudioTrackError(java.lang.String r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$AudioTrackStartErrorCode.class */
    public enum AudioTrackStartErrorCode extends java.lang.Enum<org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode> {
        public static final org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode AUDIO_TRACK_START_EXCEPTION = null;
        public static final org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode AUDIO_TRACK_START_STATE_MISMATCH = null;
        private static final /* synthetic */ org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode[] $VALUES = null;

        public static org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode[] values() {
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode[] r0 = org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode[] r0 = (org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode[]) r0
                return r0
        }

        public static org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode> r0 = org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode r0 = (org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode) r0
                return r0
        }

        AudioTrackStartErrorCode(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode[] $values() {
                r0 = 2
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode[] r0 = new org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode[r0]
                r1 = r0
                r2 = 0
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode r3 = org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode r3 = org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode r0 = new org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode
                r1 = r0
                java.lang.String r2 = "AUDIO_TRACK_START_EXCEPTION"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION = r0
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode r0 = new org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode
                r1 = r0
                java.lang.String r2 = "AUDIO_TRACK_START_STATE_MISMATCH"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH = r0
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStartErrorCode[] r0 = $values()
                org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStartErrorCode.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$AudioTrackStateCallback.class */
    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$Builder.class */
    public static class Builder {
        private final android.content.Context context;
        private java.util.concurrent.ScheduledExecutorService scheduler;
        private final android.media.AudioManager audioManager;
        private int inputSampleRate;
        private int outputSampleRate;
        private int audioSource;
        private int audioFormat;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback;
        private org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback;
        private org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback;
        private boolean useHardwareAcousticEchoCanceler;
        private boolean useHardwareNoiseSuppressor;
        private boolean useStereoInput;
        private boolean useStereoOutput;
        private android.media.AudioAttributes audioAttributes;
        private boolean useLowLatency;
        private boolean enableVolumeLogger;

        private Builder(android.content.Context r5) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = 7
                r0.audioSource = r1
                r0 = r4
                r1 = 2
                r0.audioFormat = r1
                r0 = r4
                boolean r1 = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()
                r0.useHardwareAcousticEchoCanceler = r1
                r0 = r4
                boolean r1 = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()
                r0.useHardwareNoiseSuppressor = r1
                r0 = r4
                r1 = r5
                r0.context = r1
                r0 = r4
                r1 = r5
                java.lang.String r2 = "audio"
                java.lang.Object r1 = r1.getSystemService(r2)
                android.media.AudioManager r1 = (android.media.AudioManager) r1
                r0.audioManager = r1
                r0 = r4
                r1 = r4
                android.media.AudioManager r1 = r1.audioManager
                int r1 = org.webrtc.audio.WebRtcAudioManager.getSampleRate(r1)
                r0.inputSampleRate = r1
                r0 = r4
                r1 = r4
                android.media.AudioManager r1 = r1.audioManager
                int r1 = org.webrtc.audio.WebRtcAudioManager.getSampleRate(r1)
                r0.outputSampleRate = r1
                r0 = r4
                r1 = 0
                r0.useLowLatency = r1
                r0 = r4
                r1 = 1
                r0.enableVolumeLogger = r1
                return
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setScheduler(java.util.concurrent.ScheduledExecutorService r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.scheduler = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setSampleRate(int r4) {
                r3 = this;
                java.lang.String r0 = "JavaAudioDeviceModule"
                r1 = r4
                java.lang.String r1 = "Input/Output sample rate overridden to: " + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r3
                r1 = r4
                r0.inputSampleRate = r1
                r0 = r3
                r1 = r4
                r0.outputSampleRate = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setInputSampleRate(int r4) {
                r3 = this;
                java.lang.String r0 = "JavaAudioDeviceModule"
                r1 = r4
                java.lang.String r1 = "Input sample rate overridden to: " + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r3
                r1 = r4
                r0.inputSampleRate = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setOutputSampleRate(int r4) {
                r3 = this;
                java.lang.String r0 = "JavaAudioDeviceModule"
                r1 = r4
                java.lang.String r1 = "Output sample rate overridden to: " + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r3
                r1 = r4
                r0.outputSampleRate = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioSource(int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioSource = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioFormat(int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioFormat = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioTrackErrorCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackErrorCallback r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioTrackErrorCallback = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioRecordErrorCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordErrorCallback r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioRecordErrorCallback = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setSamplesReadyCallback(org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.samplesReadyCallback = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioTrackStateCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioTrackStateCallback r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioTrackStateCallback = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioRecordStateCallback(org.webrtc.audio.JavaAudioDeviceModule.AudioRecordStateCallback r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioRecordStateCallback = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseHardwareNoiseSuppressor(boolean r4) {
                r3 = this;
                r0 = r4
                if (r0 == 0) goto L13
                boolean r0 = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()
                if (r0 != 0) goto L13
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "HW NS not supported"
                org.webrtc.Logging.e(r0, r1)
                r0 = 0
                r4 = r0
            L13:
                r0 = r3
                r1 = r4
                r0.useHardwareNoiseSuppressor = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseHardwareAcousticEchoCanceler(boolean r4) {
                r3 = this;
                r0 = r4
                if (r0 == 0) goto L13
                boolean r0 = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()
                if (r0 != 0) goto L13
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "HW AEC not supported"
                org.webrtc.Logging.e(r0, r1)
                r0 = 0
                r4 = r0
            L13:
                r0 = r3
                r1 = r4
                r0.useHardwareAcousticEchoCanceler = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseStereoInput(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.useStereoInput = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseStereoOutput(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.useStereoOutput = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setUseLowLatency(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.useLowLatency = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setAudioAttributes(android.media.AudioAttributes r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioAttributes = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule.Builder setEnableVolumeLogger(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.enableVolumeLogger = r1
                r0 = r3
                return r0
        }

        public org.webrtc.audio.JavaAudioDeviceModule createAudioDeviceModule() {
                r13 = this;
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "createAudioDeviceModule"
                org.webrtc.Logging.d(r0, r1)
                r0 = r13
                boolean r0 = r0.useHardwareNoiseSuppressor
                if (r0 == 0) goto L18
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "HW NS will be used."
                org.webrtc.Logging.d(r0, r1)
                goto L2c
            L18:
                boolean r0 = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInNoiseSuppressorSupported()
                if (r0 == 0) goto L25
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "Overriding default behavior; now using WebRTC NS!"
                org.webrtc.Logging.d(r0, r1)
            L25:
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "HW NS will not be used."
                org.webrtc.Logging.d(r0, r1)
            L2c:
                r0 = r13
                boolean r0 = r0.useHardwareAcousticEchoCanceler
                if (r0 == 0) goto L3d
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "HW AEC will be used."
                org.webrtc.Logging.d(r0, r1)
                goto L51
            L3d:
                boolean r0 = org.webrtc.audio.JavaAudioDeviceModule.isBuiltInAcousticEchoCancelerSupported()
                if (r0 == 0) goto L4a
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "Overriding default behavior; now using WebRTC AEC!"
                org.webrtc.Logging.d(r0, r1)
            L4a:
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "HW AEC will not be used."
                org.webrtc.Logging.d(r0, r1)
            L51:
                r0 = 26
                r14 = r0
                r0 = r13
                boolean r0 = r0.useLowLatency
                if (r0 == 0) goto L6a
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 26
                if (r0 < r1) goto L6a
                java.lang.String r0 = "JavaAudioDeviceModule"
                java.lang.String r1 = "Low latency mode will be used."
                org.webrtc.Logging.d(r0, r1)
            L6a:
                r0 = r13
                java.util.concurrent.ScheduledExecutorService r0 = r0.scheduler
                r15 = r0
                r0 = r15
                if (r0 != 0) goto L77
                java.util.concurrent.ScheduledExecutorService r0 = org.webrtc.audio.WebRtcAudioRecord.newDefaultScheduler()
                r15 = r0
            L77:
                org.webrtc.audio.WebRtcAudioRecord r0 = new org.webrtc.audio.WebRtcAudioRecord
                r1 = r0
                r2 = r13
                android.content.Context r2 = r2.context
                r3 = r15
                r4 = r13
                android.media.AudioManager r4 = r4.audioManager
                r5 = r13
                int r5 = r5.audioSource
                r6 = r13
                int r6 = r6.audioFormat
                r7 = r13
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback r7 = r7.audioRecordErrorCallback
                r8 = r13
                org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStateCallback r8 = r8.audioRecordStateCallback
                r9 = r13
                org.webrtc.audio.JavaAudioDeviceModule$SamplesReadyCallback r9 = r9.samplesReadyCallback
                r10 = r13
                boolean r10 = r10.useHardwareAcousticEchoCanceler
                r11 = r13
                boolean r11 = r11.useHardwareNoiseSuppressor
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r16 = r0
                org.webrtc.audio.WebRtcAudioTrack r0 = new org.webrtc.audio.WebRtcAudioTrack
                r1 = r0
                r2 = r13
                android.content.Context r2 = r2.context
                r3 = r13
                android.media.AudioManager r3 = r3.audioManager
                r4 = r13
                android.media.AudioAttributes r4 = r4.audioAttributes
                r5 = r13
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback r5 = r5.audioTrackErrorCallback
                r6 = r13
                org.webrtc.audio.JavaAudioDeviceModule$AudioTrackStateCallback r6 = r6.audioTrackStateCallback
                r7 = r13
                boolean r7 = r7.useLowLatency
                r8 = r13
                boolean r8 = r8.enableVolumeLogger
                r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                r17 = r0
                org.webrtc.audio.JavaAudioDeviceModule r0 = new org.webrtc.audio.JavaAudioDeviceModule
                r1 = r0
                r2 = r13
                android.content.Context r2 = r2.context
                r3 = r13
                android.media.AudioManager r3 = r3.audioManager
                r4 = r16
                r5 = r17
                r6 = r13
                int r6 = r6.inputSampleRate
                r7 = r13
                int r7 = r7.outputSampleRate
                r8 = r13
                boolean r8 = r8.useStereoInput
                r9 = r13
                boolean r9 = r9.useStereoOutput
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/JavaAudioDeviceModule$SamplesReadyCallback.class */
    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(org.webrtc.audio.JavaAudioDeviceModule.AudioSamples r1);
    }

    public static org.webrtc.audio.JavaAudioDeviceModule.Builder builder(android.content.Context r4) {
            org.webrtc.audio.JavaAudioDeviceModule$Builder r0 = new org.webrtc.audio.JavaAudioDeviceModule$Builder
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
            boolean r0 = org.webrtc.audio.WebRtcAudioEffects.isAcousticEchoCancelerSupported()
            return r0
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
            boolean r0 = org.webrtc.audio.WebRtcAudioEffects.isNoiseSuppressorSupported()
            return r0
    }

    private JavaAudioDeviceModule(android.content.Context r5, android.media.AudioManager r6, org.webrtc.audio.WebRtcAudioRecord r7, org.webrtc.audio.WebRtcAudioTrack r8, int r9, int r10, boolean r11, boolean r12) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.nativeLock = r1
            r0 = r4
            r1 = r5
            r0.context = r1
            r0 = r4
            r1 = r6
            r0.audioManager = r1
            r0 = r4
            r1 = r7
            r0.audioInput = r1
            r0 = r4
            r1 = r8
            r0.audioOutput = r1
            r0 = r4
            r1 = r9
            r0.inputSampleRate = r1
            r0 = r4
            r1 = r10
            r0.outputSampleRate = r1
            r0 = r4
            r1 = r11
            r0.useStereoInput = r1
            r0 = r4
            r1 = r12
            r0.useStereoOutput = r1
            return
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
            r10 = this;
            r0 = r10
            java.lang.Object r0 = r0.nativeLock
            r1 = r0
            r11 = r1
            monitor-enter(r0)
            r0 = r10
            long r0 = r0.nativeAudioDeviceModule     // Catch: java.lang.Throwable -> L3e
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L37
            r0 = r10
            r1 = r10
            android.content.Context r1 = r1.context     // Catch: java.lang.Throwable -> L3e
            r2 = r10
            android.media.AudioManager r2 = r2.audioManager     // Catch: java.lang.Throwable -> L3e
            r3 = r10
            org.webrtc.audio.WebRtcAudioRecord r3 = r3.audioInput     // Catch: java.lang.Throwable -> L3e
            r4 = r10
            org.webrtc.audio.WebRtcAudioTrack r4 = r4.audioOutput     // Catch: java.lang.Throwable -> L3e
            r5 = r10
            int r5 = r5.inputSampleRate     // Catch: java.lang.Throwable -> L3e
            r6 = r10
            int r6 = r6.outputSampleRate     // Catch: java.lang.Throwable -> L3e
            r7 = r10
            boolean r7 = r7.useStereoInput     // Catch: java.lang.Throwable -> L3e
            r8 = r10
            boolean r8 = r8.useStereoOutput     // Catch: java.lang.Throwable -> L3e
            long r1 = nativeCreateAudioDeviceModule(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L3e
            r0.nativeAudioDeviceModule = r1     // Catch: java.lang.Throwable -> L3e
        L37:
            r0 = r10
            long r0 = r0.nativeAudioDeviceModule     // Catch: java.lang.Throwable -> L3e
            r1 = r11
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3e
            return r0
        L3e:
            r12 = move-exception
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r12
            throw r0
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
            r5 = this;
            r0 = r5
            java.lang.Object r0 = r0.nativeLock
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r5
            long r0 = r0.nativeAudioDeviceModule     // Catch: java.lang.Throwable -> L21
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L1c
            r0 = r5
            long r0 = r0.nativeAudioDeviceModule     // Catch: java.lang.Throwable -> L21
            org.webrtc.JniCommon.nativeReleaseRef(r0)     // Catch: java.lang.Throwable -> L21
            r0 = r5
            r1 = 0
            r0.nativeAudioDeviceModule = r1     // Catch: java.lang.Throwable -> L21
        L1c:
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L26
        L21:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            r0 = r7
            throw r0
        L26:
            return
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean r4) {
            r3 = this;
            java.lang.String r0 = "JavaAudioDeviceModule"
            r1 = r4
            java.lang.String r1 = "setSpeakerMute: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.WebRtcAudioTrack r0 = r0.audioOutput
            r1 = r4
            r0.setSpeakerMute(r1)
            return
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean r4) {
            r3 = this;
            java.lang.String r0 = "JavaAudioDeviceModule"
            r1 = r4
            java.lang.String r1 = "setMicrophoneMute: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.WebRtcAudioRecord r0 = r0.audioInput
            r1 = r4
            r0.setMicrophoneMute(r1)
            return
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public boolean setNoiseSuppressorEnabled(boolean r4) {
            r3 = this;
            java.lang.String r0 = "JavaAudioDeviceModule"
            r1 = r4
            java.lang.String r1 = "setNoiseSuppressorEnabled: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.WebRtcAudioRecord r0 = r0.audioInput
            r1 = r4
            boolean r0 = r0.setNoiseSuppressorEnabled(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(23)
    public void setPreferredInputDevice(android.media.AudioDeviceInfo r4) {
            r3 = this;
            java.lang.String r0 = "JavaAudioDeviceModule"
            r1 = r4
            java.lang.String r1 = "setPreferredInputDevice: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.audio.WebRtcAudioRecord r0 = r0.audioInput
            r1 = r4
            r0.setPreferredDevice(r1)
            return
    }

    private static native long nativeCreateAudioDeviceModule(android.content.Context r0, android.media.AudioManager r1, org.webrtc.audio.WebRtcAudioRecord r2, org.webrtc.audio.WebRtcAudioTrack r3, int r4, int r5, boolean r6, boolean r7);
}
