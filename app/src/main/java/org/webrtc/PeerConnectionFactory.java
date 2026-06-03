package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionFactory.class */
public class PeerConnectionFactory {
    public static final java.lang.String TRIAL_ENABLED = "Enabled";

    @java.lang.Deprecated
    public static final java.lang.String VIDEO_FRAME_EMIT_TRIAL = "VideoFrameEmit";
    private static final java.lang.String TAG = "PeerConnectionFactory";
    private static final java.lang.String VIDEO_CAPTURER_THREAD_NAME = "VideoCapturerThread";
    private static volatile boolean internalTracerInitialized;

    @androidx.annotation.Nullable
    private static org.webrtc.PeerConnectionFactory.ThreadInfo staticNetworkThread;

    @androidx.annotation.Nullable
    private static org.webrtc.PeerConnectionFactory.ThreadInfo staticWorkerThread;

    @androidx.annotation.Nullable
    private static org.webrtc.PeerConnectionFactory.ThreadInfo staticSignalingThread;
    private long nativeFactory;

    @androidx.annotation.Nullable
    private volatile org.webrtc.PeerConnectionFactory.ThreadInfo networkThread;

    @androidx.annotation.Nullable
    private volatile org.webrtc.PeerConnectionFactory.ThreadInfo workerThread;

    @androidx.annotation.Nullable
    private volatile org.webrtc.PeerConnectionFactory.ThreadInfo signalingThread;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionFactory$Builder.class */
    public static class Builder {

        @androidx.annotation.Nullable
        private org.webrtc.PeerConnectionFactory.Options options;

        @androidx.annotation.Nullable
        private org.webrtc.audio.AudioDeviceModule audioDeviceModule;
        private org.webrtc.AudioEncoderFactoryFactory audioEncoderFactoryFactory;
        private org.webrtc.AudioDecoderFactoryFactory audioDecoderFactoryFactory;

        @androidx.annotation.Nullable
        private org.webrtc.VideoEncoderFactory videoEncoderFactory;

        @androidx.annotation.Nullable
        private org.webrtc.VideoDecoderFactory videoDecoderFactory;

        @androidx.annotation.Nullable
        private org.webrtc.AudioProcessingFactory audioProcessingFactory;

        @androidx.annotation.Nullable
        private org.webrtc.FecControllerFactoryFactoryInterface fecControllerFactoryFactory;

        @androidx.annotation.Nullable
        private org.webrtc.NetworkControllerFactoryFactory networkControllerFactoryFactory;

        @androidx.annotation.Nullable
        private org.webrtc.NetworkStatePredictorFactoryFactory networkStatePredictorFactoryFactory;

        @androidx.annotation.Nullable
        private org.webrtc.NetEqFactoryFactory neteqFactoryFactory;

        private Builder() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                org.webrtc.BuiltinAudioEncoderFactoryFactory r1 = new org.webrtc.BuiltinAudioEncoderFactoryFactory
                r2 = r1
                r2.<init>()
                r0.audioEncoderFactoryFactory = r1
                r0 = r4
                org.webrtc.BuiltinAudioDecoderFactoryFactory r1 = new org.webrtc.BuiltinAudioDecoderFactoryFactory
                r2 = r1
                r2.<init>()
                r0.audioDecoderFactoryFactory = r1
                return
        }

        public org.webrtc.PeerConnectionFactory.Builder setOptions(org.webrtc.PeerConnectionFactory.Options r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.options = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioDeviceModule(org.webrtc.audio.AudioDeviceModule r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.audioDeviceModule = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioEncoderFactoryFactory(org.webrtc.AudioEncoderFactoryFactory r5) {
                r4 = this;
                r0 = r5
                if (r0 != 0) goto Le
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "PeerConnectionFactory.Builder does not accept a null AudioEncoderFactoryFactory."
                r1.<init>(r2)
                throw r0
            Le:
                r0 = r4
                r1 = r5
                r0.audioEncoderFactoryFactory = r1
                r0 = r4
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioDecoderFactoryFactory(org.webrtc.AudioDecoderFactoryFactory r5) {
                r4 = this;
                r0 = r5
                if (r0 != 0) goto Le
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "PeerConnectionFactory.Builder does not accept a null AudioDecoderFactoryFactory."
                r1.<init>(r2)
                throw r0
            Le:
                r0 = r4
                r1 = r5
                r0.audioDecoderFactoryFactory = r1
                r0 = r4
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setVideoEncoderFactory(org.webrtc.VideoEncoderFactory r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.videoEncoderFactory = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setVideoDecoderFactory(org.webrtc.VideoDecoderFactory r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.videoDecoderFactory = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setAudioProcessingFactory(org.webrtc.AudioProcessingFactory r5) {
                r4 = this;
                r0 = r5
                if (r0 != 0) goto Le
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                r1 = r0
                java.lang.String r2 = "PeerConnectionFactory builder does not accept a null AudioProcessingFactory."
                r1.<init>(r2)
                throw r0
            Le:
                r0 = r4
                r1 = r5
                r0.audioProcessingFactory = r1
                r0 = r4
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setFecControllerFactoryFactoryInterface(org.webrtc.FecControllerFactoryFactoryInterface r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.fecControllerFactoryFactory = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setNetworkControllerFactoryFactory(org.webrtc.NetworkControllerFactoryFactory r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.networkControllerFactoryFactory = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setNetworkStatePredictorFactoryFactory(org.webrtc.NetworkStatePredictorFactoryFactory r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.networkStatePredictorFactoryFactory = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory.Builder setNetEqFactoryFactory(org.webrtc.NetEqFactoryFactory r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.neteqFactoryFactory = r1
                r0 = r3
                return r0
        }

        public org.webrtc.PeerConnectionFactory createPeerConnectionFactory() {
                r21 = this;
                org.webrtc.PeerConnectionFactory.checkInitializeHasBeenCalled()
                r0 = r21
                org.webrtc.audio.AudioDeviceModule r0 = r0.audioDeviceModule
                if (r0 != 0) goto L17
                r0 = r21
                android.content.Context r1 = org.webrtc.ContextUtils.getApplicationContext()
                org.webrtc.audio.JavaAudioDeviceModule$Builder r1 = org.webrtc.audio.JavaAudioDeviceModule.builder(r1)
                org.webrtc.audio.JavaAudioDeviceModule r1 = r1.createAudioDeviceModule()
                r0.audioDeviceModule = r1
            L17:
                android.content.Context r0 = org.webrtc.ContextUtils.getApplicationContext()
                r1 = r21
                org.webrtc.PeerConnectionFactory$Options r1 = r1.options
                r2 = r21
                org.webrtc.audio.AudioDeviceModule r2 = r2.audioDeviceModule
                long r2 = r2.getNativeAudioDeviceModulePointer()
                r3 = r21
                org.webrtc.AudioEncoderFactoryFactory r3 = r3.audioEncoderFactoryFactory
                long r3 = r3.createNativeAudioEncoderFactory()
                r4 = r21
                org.webrtc.AudioDecoderFactoryFactory r4 = r4.audioDecoderFactoryFactory
                long r4 = r4.createNativeAudioDecoderFactory()
                r5 = r21
                org.webrtc.VideoEncoderFactory r5 = r5.videoEncoderFactory
                r6 = r21
                org.webrtc.VideoDecoderFactory r6 = r6.videoDecoderFactory
                r7 = r21
                org.webrtc.AudioProcessingFactory r7 = r7.audioProcessingFactory
                if (r7 != 0) goto L4c
                r7 = 0
                goto L55
            L4c:
                r7 = r21
                org.webrtc.AudioProcessingFactory r7 = r7.audioProcessingFactory
                long r7 = r7.createNative()
            L55:
                r8 = r21
                org.webrtc.FecControllerFactoryFactoryInterface r8 = r8.fecControllerFactoryFactory
                if (r8 != 0) goto L60
                r8 = 0
                goto L69
            L60:
                r8 = r21
                org.webrtc.FecControllerFactoryFactoryInterface r8 = r8.fecControllerFactoryFactory
                long r8 = r8.createNative()
            L69:
                r9 = r21
                org.webrtc.NetworkControllerFactoryFactory r9 = r9.networkControllerFactoryFactory
                if (r9 != 0) goto L74
                r9 = 0
                goto L7d
            L74:
                r9 = r21
                org.webrtc.NetworkControllerFactoryFactory r9 = r9.networkControllerFactoryFactory
                long r9 = r9.createNativeNetworkControllerFactory()
            L7d:
                r10 = r21
                org.webrtc.NetworkStatePredictorFactoryFactory r10 = r10.networkStatePredictorFactoryFactory
                if (r10 != 0) goto L88
                r10 = 0
                goto L91
            L88:
                r10 = r21
                org.webrtc.NetworkStatePredictorFactoryFactory r10 = r10.networkStatePredictorFactoryFactory
                long r10 = r10.createNativeNetworkStatePredictorFactory()
            L91:
                r11 = r21
                org.webrtc.NetEqFactoryFactory r11 = r11.neteqFactoryFactory
                if (r11 != 0) goto L9c
                r11 = 0
                goto La5
            L9c:
                r11 = r21
                org.webrtc.NetEqFactoryFactory r11 = r11.neteqFactoryFactory
                long r11 = r11.createNativeNetEqFactory()
            La5:
                org.webrtc.PeerConnectionFactory r0 = org.webrtc.PeerConnectionFactory.nativeCreatePeerConnectionFactory(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionFactory$InitializationOptions.class */
    public static class InitializationOptions {
        final android.content.Context applicationContext;
        final java.lang.String fieldTrials;
        final boolean enableInternalTracer;
        final org.webrtc.NativeLibraryLoader nativeLibraryLoader;
        final java.lang.String nativeLibraryName;

        @androidx.annotation.Nullable
        org.webrtc.Loggable loggable;

        @androidx.annotation.Nullable
        org.webrtc.Logging.Severity loggableSeverity;

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionFactory$InitializationOptions$Builder.class */
        public static class Builder {
            private final android.content.Context applicationContext;
            private java.lang.String fieldTrials;
            private boolean enableInternalTracer;
            private org.webrtc.NativeLibraryLoader nativeLibraryLoader;
            private java.lang.String nativeLibraryName;

            @androidx.annotation.Nullable
            private org.webrtc.Loggable loggable;

            @androidx.annotation.Nullable
            private org.webrtc.Logging.Severity loggableSeverity;

            Builder(android.content.Context r5) {
                    r4 = this;
                    r0 = r4
                    r0.<init>()
                    r0 = r4
                    java.lang.String r1 = ""
                    r0.fieldTrials = r1
                    r0 = r4
                    org.webrtc.NativeLibrary$DefaultLoader r1 = new org.webrtc.NativeLibrary$DefaultLoader
                    r2 = r1
                    r2.<init>()
                    r0.nativeLibraryLoader = r1
                    r0 = r4
                    java.lang.String r1 = "jingle_peerconnection_so"
                    r0.nativeLibraryName = r1
                    r0 = r4
                    r1 = r5
                    r0.applicationContext = r1
                    return
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setFieldTrials(java.lang.String r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.fieldTrials = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setEnableInternalTracer(boolean r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.enableInternalTracer = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setNativeLibraryLoader(org.webrtc.NativeLibraryLoader r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.nativeLibraryLoader = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setNativeLibraryName(java.lang.String r4) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.nativeLibraryName = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions.Builder setInjectableLogger(org.webrtc.Loggable r4, org.webrtc.Logging.Severity r5) {
                    r3 = this;
                    r0 = r3
                    r1 = r4
                    r0.loggable = r1
                    r0 = r3
                    r1 = r5
                    r0.loggableSeverity = r1
                    r0 = r3
                    return r0
            }

            public org.webrtc.PeerConnectionFactory.InitializationOptions createInitializationOptions() {
                    r10 = this;
                    org.webrtc.PeerConnectionFactory$InitializationOptions r0 = new org.webrtc.PeerConnectionFactory$InitializationOptions
                    r1 = r0
                    r2 = r10
                    android.content.Context r2 = r2.applicationContext
                    r3 = r10
                    java.lang.String r3 = r3.fieldTrials
                    r4 = r10
                    boolean r4 = r4.enableInternalTracer
                    r5 = r10
                    org.webrtc.NativeLibraryLoader r5 = r5.nativeLibraryLoader
                    r6 = r10
                    java.lang.String r6 = r6.nativeLibraryName
                    r7 = r10
                    org.webrtc.Loggable r7 = r7.loggable
                    r8 = r10
                    org.webrtc.Logging$Severity r8 = r8.loggableSeverity
                    r1.<init>(r2, r3, r4, r5, r6, r7, r8)
                    return r0
            }
        }

        private InitializationOptions(android.content.Context r4, java.lang.String r5, boolean r6, org.webrtc.NativeLibraryLoader r7, java.lang.String r8, @androidx.annotation.Nullable org.webrtc.Loggable r9, @androidx.annotation.Nullable org.webrtc.Logging.Severity r10) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.applicationContext = r1
                r0 = r3
                r1 = r5
                r0.fieldTrials = r1
                r0 = r3
                r1 = r6
                r0.enableInternalTracer = r1
                r0 = r3
                r1 = r7
                r0.nativeLibraryLoader = r1
                r0 = r3
                r1 = r8
                r0.nativeLibraryName = r1
                r0 = r3
                r1 = r9
                r0.loggable = r1
                r0 = r3
                r1 = r10
                r0.loggableSeverity = r1
                return
        }

        public static org.webrtc.PeerConnectionFactory.InitializationOptions.Builder builder(android.content.Context r4) {
                org.webrtc.PeerConnectionFactory$InitializationOptions$Builder r0 = new org.webrtc.PeerConnectionFactory$InitializationOptions$Builder
                r1 = r0
                r2 = r4
                r1.<init>(r2)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionFactory$Options.class */
    public static class Options {
        public static final int ADAPTER_TYPE_UNKNOWN = 0;
        public static final int ADAPTER_TYPE_ETHERNET = 1;
        public static final int ADAPTER_TYPE_WIFI = 2;
        public static final int ADAPTER_TYPE_CELLULAR = 4;
        public static final int ADAPTER_TYPE_VPN = 8;
        public static final int ADAPTER_TYPE_LOOPBACK = 16;
        public static final int ADAPTER_TYPE_ANY = 32;
        public int networkIgnoreMask;
        public boolean disableEncryption;
        public boolean disableNetworkMonitor;

        public Options() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @org.webrtc.CalledByNative("Options")
        int getNetworkIgnoreMask() {
                r2 = this;
                r0 = r2
                int r0 = r0.networkIgnoreMask
                return r0
        }

        @org.webrtc.CalledByNative("Options")
        boolean getDisableEncryption() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.disableEncryption
                return r0
        }

        @org.webrtc.CalledByNative("Options")
        boolean getDisableNetworkMonitor() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.disableNetworkMonitor
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/PeerConnectionFactory$ThreadInfo.class */
    private static class ThreadInfo {
        final java.lang.Thread thread;
        final int tid;

        public static org.webrtc.PeerConnectionFactory.ThreadInfo getCurrent() {
                org.webrtc.PeerConnectionFactory$ThreadInfo r0 = new org.webrtc.PeerConnectionFactory$ThreadInfo
                r1 = r0
                java.lang.Thread r2 = java.lang.Thread.currentThread()
                int r3 = android.os.Process.myTid()
                r1.<init>(r2, r3)
                return r0
        }

        private ThreadInfo(java.lang.Thread r4, int r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.thread = r1
                r0 = r3
                r1 = r5
                r0.tid = r1
                return
        }
    }

    public static org.webrtc.PeerConnectionFactory.Builder builder() {
            org.webrtc.PeerConnectionFactory$Builder r0 = new org.webrtc.PeerConnectionFactory$Builder
            r1 = r0
            r1.<init>()
            return r0
    }

    public static void initialize(org.webrtc.PeerConnectionFactory.InitializationOptions r4) {
            r0 = r4
            android.content.Context r0 = r0.applicationContext
            org.webrtc.ContextUtils.initialize(r0)
            r0 = r4
            org.webrtc.NativeLibraryLoader r0 = r0.nativeLibraryLoader
            r1 = r4
            java.lang.String r1 = r1.nativeLibraryName
            org.webrtc.NativeLibrary.initialize(r0, r1)
            nativeInitializeAndroidGlobals()
            r0 = r4
            java.lang.String r0 = r0.fieldTrials
            nativeInitializeFieldTrials(r0)
            r0 = r4
            boolean r0 = r0.enableInternalTracer
            if (r0 == 0) goto L2c
            boolean r0 = org.webrtc.PeerConnectionFactory.internalTracerInitialized
            if (r0 != 0) goto L2c
            initializeInternalTracer()
        L2c:
            r0 = r4
            org.webrtc.Loggable r0 = r0.loggable
            if (r0 == 0) goto L56
            r0 = r4
            org.webrtc.Loggable r0 = r0.loggable
            r1 = r4
            org.webrtc.Logging$Severity r1 = r1.loggableSeverity
            org.webrtc.Logging.injectLoggable(r0, r1)
            org.webrtc.JNILogging r0 = new org.webrtc.JNILogging
            r1 = r0
            r2 = r4
            org.webrtc.Loggable r2 = r2.loggable
            r1.<init>(r2)
            r1 = r4
            org.webrtc.Logging$Severity r1 = r1.loggableSeverity
            int r1 = r1.ordinal()
            nativeInjectLoggable(r0, r1)
            goto L63
        L56:
            java.lang.String r0 = "PeerConnectionFactory"
            java.lang.String r1 = "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted."
            org.webrtc.Logging.d(r0, r1)
            org.webrtc.Logging.deleteInjectedLoggable()
            nativeDeleteLoggable()
        L63:
            return
    }

    private static void checkInitializeHasBeenCalled() {
            boolean r0 = org.webrtc.NativeLibrary.isLoaded()
            if (r0 == 0) goto Lc
            android.content.Context r0 = org.webrtc.ContextUtils.getApplicationContext()
            if (r0 != 0) goto L16
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory."
            r1.<init>(r2)
            throw r0
        L16:
            return
    }

    private static void initializeInternalTracer() {
            r0 = 1
            org.webrtc.PeerConnectionFactory.internalTracerInitialized = r0
            nativeInitializeInternalTracer()
            return
    }

    public static void shutdownInternalTracer() {
            r0 = 0
            org.webrtc.PeerConnectionFactory.internalTracerInitialized = r0
            nativeShutdownInternalTracer()
            return
    }

    @java.lang.Deprecated
    public static void initializeFieldTrials(java.lang.String r2) {
            r0 = r2
            nativeInitializeFieldTrials(r0)
            return
    }

    public static java.lang.String fieldTrialsFindFullName(java.lang.String r2) {
            boolean r0 = org.webrtc.NativeLibrary.isLoaded()
            if (r0 == 0) goto Ld
            r0 = r2
            java.lang.String r0 = nativeFindFieldTrialsFullName(r0)
            goto Lf
        Ld:
            java.lang.String r0 = ""
        Lf:
            return r0
    }

    public static boolean startInternalTracingCapture(java.lang.String r2) {
            r0 = r2
            boolean r0 = nativeStartInternalTracingCapture(r0)
            return r0
    }

    public static void stopInternalTracingCapture() {
            nativeStopInternalTracingCapture()
            return
    }

    @org.webrtc.CalledByNative
    PeerConnectionFactory(long r6) {
            r5 = this;
            r0 = r5
            r0.<init>()
            checkInitializeHasBeenCalled()
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L17
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Failed to initialize PeerConnectionFactory!"
            r1.<init>(r2)
            throw r0
        L17:
            r0 = r5
            r1 = r6
            r0.nativeFactory = r1
            return
    }

    @androidx.annotation.Nullable
    org.webrtc.PeerConnection createPeerConnectionInternal(org.webrtc.PeerConnection.RTCConfiguration r9, org.webrtc.MediaConstraints r10, org.webrtc.PeerConnection.Observer r11, org.webrtc.SSLCertificateVerifier r12) {
            r8 = this;
            r0 = r8
            r0.checkPeerConnectionFactoryExists()
            r0 = r11
            long r0 = org.webrtc.PeerConnection.createNativePeerConnectionObserver(r0)
            r13 = r0
            r0 = r13
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            r0 = 0
            return r0
        L13:
            r0 = r8
            long r0 = r0.nativeFactory
            r1 = r9
            r2 = r10
            r3 = r13
            r4 = r12
            long r0 = nativeCreatePeerConnection(r0, r1, r2, r3, r4)
            r15 = r0
            r0 = r15
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L2b
            r0 = 0
            return r0
        L2b:
            org.webrtc.PeerConnection r0 = new org.webrtc.PeerConnection
            r1 = r0
            r2 = r15
            r1.<init>(r2)
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public org.webrtc.PeerConnection createPeerConnection(org.webrtc.PeerConnection.RTCConfiguration r7, org.webrtc.MediaConstraints r8, org.webrtc.PeerConnection.Observer r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            org.webrtc.PeerConnection r0 = r0.createPeerConnectionInternal(r1, r2, r3, r4)
            return r0
    }

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public org.webrtc.PeerConnection createPeerConnection(java.util.List<org.webrtc.PeerConnection.IceServer> r6, org.webrtc.MediaConstraints r7, org.webrtc.PeerConnection.Observer r8) {
            r5 = this;
            org.webrtc.PeerConnection$RTCConfiguration r0 = new org.webrtc.PeerConnection$RTCConfiguration
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            r9 = r0
            r0 = r9
            org.webrtc.PeerConnection$SdpSemantics r1 = org.webrtc.PeerConnection.SdpSemantics.UNIFIED_PLAN
            r0.sdpSemantics = r1
            r0 = r5
            r1 = r9
            r2 = r7
            r3 = r8
            org.webrtc.PeerConnection r0 = r0.createPeerConnection(r1, r2, r3)
            return r0
    }

    @androidx.annotation.Nullable
    public org.webrtc.PeerConnection createPeerConnection(java.util.List<org.webrtc.PeerConnection.IceServer> r5, org.webrtc.PeerConnection.Observer r6) {
            r4 = this;
            org.webrtc.PeerConnection$RTCConfiguration r0 = new org.webrtc.PeerConnection$RTCConfiguration
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
            r0 = r7
            org.webrtc.PeerConnection$SdpSemantics r1 = org.webrtc.PeerConnection.SdpSemantics.UNIFIED_PLAN
            r0.sdpSemantics = r1
            r0 = r4
            r1 = r7
            r2 = r6
            org.webrtc.PeerConnection r0 = r0.createPeerConnection(r1, r2)
            return r0
    }

    @androidx.annotation.Nullable
    public org.webrtc.PeerConnection createPeerConnection(org.webrtc.PeerConnection.RTCConfiguration r6, org.webrtc.PeerConnection.Observer r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = 0
            r3 = r7
            org.webrtc.PeerConnection r0 = r0.createPeerConnection(r1, r2, r3)
            return r0
    }

    @androidx.annotation.Nullable
    public org.webrtc.PeerConnection createPeerConnection(org.webrtc.PeerConnection.RTCConfiguration r7, org.webrtc.PeerConnectionDependencies r8) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            org.webrtc.PeerConnection$Observer r3 = r3.getObserver()
            r4 = r8
            org.webrtc.SSLCertificateVerifier r4 = r4.getSSLCertificateVerifier()
            org.webrtc.PeerConnection r0 = r0.createPeerConnectionInternal(r1, r2, r3, r4)
            return r0
    }

    public org.webrtc.MediaStream createLocalMediaStream(java.lang.String r7) {
            r6 = this;
            r0 = r6
            r0.checkPeerConnectionFactoryExists()
            org.webrtc.MediaStream r0 = new org.webrtc.MediaStream
            r1 = r0
            r2 = r6
            long r2 = r2.nativeFactory
            r3 = r7
            long r2 = nativeCreateLocalMediaStream(r2, r3)
            r1.<init>(r2)
            return r0
    }

    public org.webrtc.VideoSource createVideoSource(boolean r8, boolean r9) {
            r7 = this;
            r0 = r7
            r0.checkPeerConnectionFactoryExists()
            org.webrtc.VideoSource r0 = new org.webrtc.VideoSource
            r1 = r0
            r2 = r7
            long r2 = r2.nativeFactory
            r3 = r8
            r4 = r9
            long r2 = nativeCreateVideoSource(r2, r3, r4)
            r1.<init>(r2)
            return r0
    }

    public org.webrtc.VideoSource createVideoSource(boolean r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = 1
            org.webrtc.VideoSource r0 = r0.createVideoSource(r1, r2)
            return r0
    }

    public org.webrtc.VideoTrack createVideoTrack(java.lang.String r9, org.webrtc.VideoSource r10) {
            r8 = this;
            r0 = r8
            r0.checkPeerConnectionFactoryExists()
            org.webrtc.VideoTrack r0 = new org.webrtc.VideoTrack
            r1 = r0
            r2 = r8
            long r2 = r2.nativeFactory
            r3 = r9
            r4 = r10
            long r4 = r4.getNativeVideoTrackSource()
            long r2 = nativeCreateVideoTrack(r2, r3, r4)
            r1.<init>(r2)
            return r0
    }

    public org.webrtc.AudioSource createAudioSource(org.webrtc.MediaConstraints r7) {
            r6 = this;
            r0 = r6
            r0.checkPeerConnectionFactoryExists()
            org.webrtc.AudioSource r0 = new org.webrtc.AudioSource
            r1 = r0
            r2 = r6
            long r2 = r2.nativeFactory
            r3 = r7
            long r2 = nativeCreateAudioSource(r2, r3)
            r1.<init>(r2)
            return r0
    }

    public org.webrtc.AudioTrack createAudioTrack(java.lang.String r9, org.webrtc.AudioSource r10) {
            r8 = this;
            r0 = r8
            r0.checkPeerConnectionFactoryExists()
            org.webrtc.AudioTrack r0 = new org.webrtc.AudioTrack
            r1 = r0
            r2 = r8
            long r2 = r2.nativeFactory
            r3 = r9
            r4 = r10
            long r4 = r4.getNativeAudioSource()
            long r2 = nativeCreateAudioTrack(r2, r3, r4)
            r1.<init>(r2)
            return r0
    }

    public org.webrtc.RtpCapabilities getRtpReceiverCapabilities(org.webrtc.MediaStreamTrack.MediaType r5) {
            r4 = this;
            r0 = r4
            r0.checkPeerConnectionFactoryExists()
            r0 = r4
            long r0 = r0.nativeFactory
            r1 = r5
            org.webrtc.RtpCapabilities r0 = nativeGetRtpReceiverCapabilities(r0, r1)
            return r0
    }

    public org.webrtc.RtpCapabilities getRtpSenderCapabilities(org.webrtc.MediaStreamTrack.MediaType r5) {
            r4 = this;
            r0 = r4
            r0.checkPeerConnectionFactoryExists()
            r0 = r4
            long r0 = r0.nativeFactory
            r1 = r5
            org.webrtc.RtpCapabilities r0 = nativeGetRtpSenderCapabilities(r0, r1)
            return r0
    }

    public boolean startAecDump(int r6, int r7) {
            r5 = this;
            r0 = r5
            r0.checkPeerConnectionFactoryExists()
            r0 = r5
            long r0 = r0.nativeFactory
            r1 = r6
            r2 = r7
            boolean r0 = nativeStartAecDump(r0, r1, r2)
            return r0
    }

    public void stopAecDump() {
            r3 = this;
            r0 = r3
            r0.checkPeerConnectionFactoryExists()
            r0 = r3
            long r0 = r0.nativeFactory
            nativeStopAecDump(r0)
            return
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkPeerConnectionFactoryExists()
            r0 = r4
            long r0 = r0.nativeFactory
            nativeFreeFactory(r0)
            r0 = r4
            r1 = 0
            r0.networkThread = r1
            r0 = r4
            r1 = 0
            r0.workerThread = r1
            r0 = r4
            r1 = 0
            r0.signalingThread = r1
            r0 = r4
            r1 = 0
            r0.nativeFactory = r1
            return
    }

    public long getNativePeerConnectionFactory() {
            r3 = this;
            r0 = r3
            r0.checkPeerConnectionFactoryExists()
            r0 = r3
            long r0 = r0.nativeFactory
            long r0 = nativeGetNativePeerConnectionFactory(r0)
            return r0
    }

    public long getNativeOwnedFactoryAndThreads() {
            r3 = this;
            r0 = r3
            r0.checkPeerConnectionFactoryExists()
            r0 = r3
            long r0 = r0.nativeFactory
            return r0
    }

    private void checkPeerConnectionFactoryExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeFactory
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "PeerConnectionFactory has been disposed."
            r1.<init>(r2)
            throw r0
        L14:
            return
    }

    private static void printStackTrace(@androidx.annotation.Nullable org.webrtc.PeerConnectionFactory.ThreadInfo r5, boolean r6) {
            r0 = r5
            if (r0 != 0) goto L5
            return
        L5:
            r0 = r5
            java.lang.Thread r0 = r0.thread
            java.lang.String r0 = r0.getName()
            r7 = r0
            r0 = r5
            java.lang.Thread r0 = r0.thread
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r8 = r0
            r0 = r8
            int r0 = r0.length
            if (r0 <= 0) goto L4e
            java.lang.String r0 = "PeerConnectionFactory"
            r1 = r7
            java.lang.String r1 = r1 + " stacktrace:"
            org.webrtc.Logging.w(r0, r1)
            r0 = r8
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L30:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L4e
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            java.lang.String r0 = "PeerConnectionFactory"
            r1 = r12
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.w(r0, r1)
            int r11 = r11 + 1
            goto L30
        L4e:
            r0 = r6
            if (r0 == 0) goto L73
            java.lang.String r0 = "PeerConnectionFactory"
            java.lang.String r1 = "*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***"
            org.webrtc.Logging.w(r0, r1)
            java.lang.String r0 = "PeerConnectionFactory"
            int r1 = android.os.Process.myPid()
            r2 = r5
            int r2 = r2.tid
            r3 = r7
            java.lang.String r1 = "pid: " + r1 + ", tid: " + r2 + ", name: " + r3 + "  >>> WebRTC <<<"
            org.webrtc.Logging.w(r0, r1)
            r0 = r5
            int r0 = r0.tid
            nativePrintStackTrace(r0)
        L73:
            return
    }

    @java.lang.Deprecated
    public static void printStackTraces() {
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = org.webrtc.PeerConnectionFactory.staticNetworkThread
            r1 = 0
            printStackTrace(r0, r1)
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = org.webrtc.PeerConnectionFactory.staticWorkerThread
            r1 = 0
            printStackTrace(r0, r1)
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = org.webrtc.PeerConnectionFactory.staticSignalingThread
            r1 = 0
            printStackTrace(r0, r1)
            return
    }

    public void printInternalStackTraces(boolean r4) {
            r3 = this;
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = r0.signalingThread
            r1 = r4
            printStackTrace(r0, r1)
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = r0.workerThread
            r1 = r4
            printStackTrace(r0, r1)
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = r0.networkThread
            r1 = r4
            printStackTrace(r0, r1)
            return
    }

    @org.webrtc.CalledByNative
    private void onNetworkThreadReady() {
            r3 = this;
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r1 = org.webrtc.PeerConnectionFactory.ThreadInfo.getCurrent()
            r0.networkThread = r1
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = r0.networkThread
            org.webrtc.PeerConnectionFactory.staticNetworkThread = r0
            java.lang.String r0 = "PeerConnectionFactory"
            java.lang.String r1 = "onNetworkThreadReady"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    @org.webrtc.CalledByNative
    private void onWorkerThreadReady() {
            r3 = this;
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r1 = org.webrtc.PeerConnectionFactory.ThreadInfo.getCurrent()
            r0.workerThread = r1
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = r0.workerThread
            org.webrtc.PeerConnectionFactory.staticWorkerThread = r0
            java.lang.String r0 = "PeerConnectionFactory"
            java.lang.String r1 = "onWorkerThreadReady"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    @org.webrtc.CalledByNative
    private void onSignalingThreadReady() {
            r3 = this;
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r1 = org.webrtc.PeerConnectionFactory.ThreadInfo.getCurrent()
            r0.signalingThread = r1
            r0 = r3
            org.webrtc.PeerConnectionFactory$ThreadInfo r0 = r0.signalingThread
            org.webrtc.PeerConnectionFactory.staticSignalingThread = r0
            java.lang.String r0 = "PeerConnectionFactory"
            java.lang.String r1 = "onSignalingThreadReady"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private static native void nativeInitializeAndroidGlobals();

    private static native void nativeInitializeFieldTrials(java.lang.String r0);

    private static native java.lang.String nativeFindFieldTrialsFullName(java.lang.String r0);

    private static native void nativeInitializeInternalTracer();

    private static native void nativeShutdownInternalTracer();

    private static native boolean nativeStartInternalTracingCapture(java.lang.String r0);

    private static native void nativeStopInternalTracingCapture();

    private static native org.webrtc.PeerConnectionFactory nativeCreatePeerConnectionFactory(android.content.Context r0, org.webrtc.PeerConnectionFactory.Options r1, long r2, long r4, long r6, org.webrtc.VideoEncoderFactory r8, org.webrtc.VideoDecoderFactory r9, long r10, long r12, long r14, long r16, long r18);

    private static native long nativeCreatePeerConnection(long r0, org.webrtc.PeerConnection.RTCConfiguration r2, org.webrtc.MediaConstraints r3, long r4, org.webrtc.SSLCertificateVerifier r6);

    private static native long nativeCreateLocalMediaStream(long r0, java.lang.String r2);

    private static native long nativeCreateVideoSource(long r0, boolean r2, boolean r3);

    private static native long nativeCreateVideoTrack(long r0, java.lang.String r2, long r3);

    private static native long nativeCreateAudioSource(long r0, org.webrtc.MediaConstraints r2);

    private static native long nativeCreateAudioTrack(long r0, java.lang.String r2, long r3);

    private static native boolean nativeStartAecDump(long r0, int r2, int r3);

    private static native void nativeStopAecDump(long r0);

    private static native void nativeFreeFactory(long r0);

    private static native long nativeGetNativePeerConnectionFactory(long r0);

    private static native void nativeInjectLoggable(org.webrtc.JNILogging r0, int r1);

    private static native void nativeDeleteLoggable();

    private static native void nativePrintStackTrace(int r0);

    private static native org.webrtc.RtpCapabilities nativeGetRtpSenderCapabilities(long r0, org.webrtc.MediaStreamTrack.MediaType r2);

    private static native org.webrtc.RtpCapabilities nativeGetRtpReceiverCapabilities(long r0, org.webrtc.MediaStreamTrack.MediaType r2);
}
