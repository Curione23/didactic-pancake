package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/HardwareVideoEncoder.class */
class HardwareVideoEncoder implements org.webrtc.VideoEncoder {
    private static final java.lang.String TAG = "HardwareVideoEncoder";
    private static final int MAX_VIDEO_FRAMERATE = 30;
    private static final int MAX_ENCODER_Q_SIZE = 2;
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private static final int REQUIRED_RESOLUTION_ALIGNMENT = 16;
    private final org.webrtc.MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private final java.lang.String codecName;
    private final org.webrtc.VideoCodecMimeType codecType;
    private final java.lang.Integer surfaceColorFormat;
    private final java.lang.Integer yuvColorFormat;
    private final java.util.Map<java.lang.String, java.lang.String> params;
    private final int keyFrameIntervalSec;
    private final long forcedKeyFrameNs;
    private final org.webrtc.BitrateAdjuster bitrateAdjuster;
    private final org.webrtc.EglBase14.Context sharedContext;
    private final org.webrtc.GlRectDrawer textureDrawer;
    private final org.webrtc.VideoFrameDrawer videoFrameDrawer;
    private final java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage.Builder> outputBuilders;
    private final org.webrtc.ThreadUtils.ThreadChecker encodeThreadChecker;
    private final org.webrtc.ThreadUtils.ThreadChecker outputThreadChecker;
    private final org.webrtc.HardwareVideoEncoder.BusyCount outputBuffersBusyCount;
    private org.webrtc.VideoEncoder.Callback callback;
    private boolean automaticResizeOn;

    @androidx.annotation.Nullable
    private org.webrtc.MediaCodecWrapper codec;

    @androidx.annotation.Nullable
    private java.lang.Thread outputThread;

    @androidx.annotation.Nullable
    private org.webrtc.EglBase14 textureEglBase;

    @androidx.annotation.Nullable
    private android.view.Surface textureInputSurface;
    private int width;
    private int height;
    private int stride;
    private int sliceHeight;
    private boolean isSemiPlanar;
    private int frameSizeBytes;
    private boolean useSurfaceMode;
    private long nextPresentationTimestampUs;
    private long lastKeyFrameNs;

    @androidx.annotation.Nullable
    private java.nio.ByteBuffer configBuffer;
    private int adjustedBitrate;
    private volatile boolean running;

    @androidx.annotation.Nullable
    private volatile java.lang.Exception shutdownException;
    private boolean isEncodingStatisticsEnabled;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/HardwareVideoEncoder$BusyCount.class */
    private static class BusyCount {
        private final java.lang.Object countLock;
        private int count;

        private BusyCount() {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.lang.Object r1 = new java.lang.Object
                r2 = r1
                r2.<init>()
                r0.countLock = r1
                return
        }

        public void increment() {
                r4 = this;
                r0 = r4
                java.lang.Object r0 = r0.countLock
                r1 = r0
                r5 = r1
                monitor-enter(r0)
                r0 = r4
                r1 = r0
                int r1 = r1.count     // Catch: java.lang.Throwable -> L16
                r2 = 1
                int r1 = r1 + r2
                r0.count = r1     // Catch: java.lang.Throwable -> L16
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                goto L1b
            L16:
                r6 = move-exception
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
                r0 = r6
                throw r0
            L1b:
                return
        }

        public void decrement() {
                r4 = this;
                r0 = r4
                java.lang.Object r0 = r0.countLock
                r1 = r0
                r5 = r1
                monitor-enter(r0)
                r0 = r4
                r1 = r0
                int r1 = r1.count     // Catch: java.lang.Throwable -> L24
                r2 = 1
                int r1 = r1 - r2
                r0.count = r1     // Catch: java.lang.Throwable -> L24
                r0 = r4
                int r0 = r0.count     // Catch: java.lang.Throwable -> L24
                if (r0 != 0) goto L1f
                r0 = r4
                java.lang.Object r0 = r0.countLock     // Catch: java.lang.Throwable -> L24
                r0.notifyAll()     // Catch: java.lang.Throwable -> L24
            L1f:
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                goto L29
            L24:
                r6 = move-exception
                r0 = r5
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                r0 = r6
                throw r0
            L29:
                return
        }

        public void waitForZero() {
                r4 = this;
                r0 = 0
                r5 = r0
                r0 = r4
                java.lang.Object r0 = r0.countLock
                r1 = r0
                r6 = r1
                monitor-enter(r0)
            L9:
                r0 = r4
                int r0 = r0.count     // Catch: java.lang.Throwable -> L2d
                if (r0 <= 0) goto L28
                r0 = r4
                java.lang.Object r0 = r0.countLock     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L2d
                r0.wait()     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L2d
                goto L9
            L1a:
                r7 = move-exception
                java.lang.String r0 = "HardwareVideoEncoder"
                java.lang.String r1 = "Interrupted while waiting on busy count"
                r2 = r7
                org.webrtc.Logging.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L2d
                r0 = 1
                r5 = r0
                goto L9
            L28:
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                goto L34
            L2d:
                r8 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2d
                r0 = r8
                throw r0
            L34:
                r0 = r5
                if (r0 == 0) goto L3e
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L3e:
                return
        }
    }

    public HardwareVideoEncoder(org.webrtc.MediaCodecWrapperFactory r6, java.lang.String r7, org.webrtc.VideoCodecMimeType r8, java.lang.Integer r9, java.lang.Integer r10, java.util.Map<java.lang.String, java.lang.String> r11, int r12, int r13, org.webrtc.BitrateAdjuster r14, org.webrtc.EglBase14.Context r15) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.webrtc.GlRectDrawer r1 = new org.webrtc.GlRectDrawer
            r2 = r1
            r2.<init>()
            r0.textureDrawer = r1
            r0 = r5
            org.webrtc.VideoFrameDrawer r1 = new org.webrtc.VideoFrameDrawer
            r2 = r1
            r2.<init>()
            r0.videoFrameDrawer = r1
            r0 = r5
            java.util.concurrent.LinkedBlockingDeque r1 = new java.util.concurrent.LinkedBlockingDeque
            r2 = r1
            r2.<init>()
            r0.outputBuilders = r1
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r1 = new org.webrtc.ThreadUtils$ThreadChecker
            r2 = r1
            r2.<init>()
            r0.encodeThreadChecker = r1
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r1 = new org.webrtc.ThreadUtils$ThreadChecker
            r2 = r1
            r2.<init>()
            r0.outputThreadChecker = r1
            r0 = r5
            org.webrtc.HardwareVideoEncoder$BusyCount r1 = new org.webrtc.HardwareVideoEncoder$BusyCount
            r2 = r1
            r2.<init>()
            r0.outputBuffersBusyCount = r1
            r0 = r5
            r1 = r6
            r0.mediaCodecWrapperFactory = r1
            r0 = r5
            r1 = r7
            r0.codecName = r1
            r0 = r5
            r1 = r8
            r0.codecType = r1
            r0 = r5
            r1 = r9
            r0.surfaceColorFormat = r1
            r0 = r5
            r1 = r10
            r0.yuvColorFormat = r1
            r0 = r5
            r1 = r11
            r0.params = r1
            r0 = r5
            r1 = r12
            r0.keyFrameIntervalSec = r1
            r0 = r5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2 = r13
            long r2 = (long) r2
            long r1 = r1.toNanos(r2)
            r0.forcedKeyFrameNs = r1
            r0 = r5
            r1 = r14
            r0.bitrateAdjuster = r1
            r0 = r5
            r1 = r15
            r0.sharedContext = r1
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.detachThread()
            return
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus initEncode(org.webrtc.VideoEncoder.Settings r10, org.webrtc.VideoEncoder.Callback r11) {
            r9 = this;
            r0 = r9
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r9
            r1 = r11
            r0.callback = r1
            r0 = r9
            r1 = r10
            boolean r1 = r1.automaticResizeOn
            r0.automaticResizeOn = r1
            r0 = r9
            r1 = r10
            int r1 = r1.width
            r0.width = r1
            r0 = r9
            r1 = r10
            int r1 = r1.height
            r0.height = r1
            r0 = r9
            r1 = r9
            boolean r1 = r1.canUseSurface()
            r0.useSurfaceMode = r1
            r0 = r10
            int r0 = r0.startBitrate
            if (r0 == 0) goto L50
            r0 = r10
            int r0 = r0.maxFramerate
            if (r0 == 0) goto L50
            r0 = r9
            org.webrtc.BitrateAdjuster r0 = r0.bitrateAdjuster
            r1 = r10
            int r1 = r1.startBitrate
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = r1 * r2
            r2 = r10
            int r2 = r2.maxFramerate
            double r2 = (double) r2
            r0.setTargets(r1, r2)
        L50:
            r0 = r9
            r1 = r9
            org.webrtc.BitrateAdjuster r1 = r1.bitrateAdjuster
            int r1 = r1.getAdjustedBitrateBps()
            r0.adjustedBitrate = r1
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r9
            java.lang.String r1 = r1.codecName
            r2 = r9
            org.webrtc.VideoCodecMimeType r2 = r2.codecType
            r3 = r9
            int r3 = r3.width
            r4 = r9
            int r4 = r4.height
            r5 = r10
            int r5 = r5.maxFramerate
            r6 = r10
            int r6 = r6.startBitrate
            r7 = r9
            boolean r7 = r7.useSurfaceMode
            java.lang.String r1 = "initEncode name: " + r1 + " type: " + r2 + " width: " + r3 + " height: " + r4 + " framerate_fps: " + r5 + " bitrate_kbps: " + r6 + " surface mode: " + r7
            org.webrtc.Logging.d(r0, r1)
            r0 = r9
            org.webrtc.VideoCodecStatus r0 = r0.initEncodeInternal()
            return r0
    }

    private org.webrtc.VideoCodecStatus initEncodeInternal() {
            r6 = this;
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r6
            r1 = 0
            r0.nextPresentationTimestampUs = r1
            r0 = r6
            r1 = -1
            r0.lastKeyFrameNs = r1
            r0 = r6
            r1 = 0
            r0.isEncodingStatisticsEnabled = r1
            r0 = r6
            r1 = r6
            org.webrtc.MediaCodecWrapperFactory r1 = r1.mediaCodecWrapperFactory     // Catch: java.lang.Throwable -> L2c
            r2 = r6
            java.lang.String r2 = r2.codecName     // Catch: java.lang.Throwable -> L2c
            org.webrtc.MediaCodecWrapper r1 = r1.createByCodecName(r2)     // Catch: java.lang.Throwable -> L2c
            r0.codec = r1     // Catch: java.lang.Throwable -> L2c
            goto L3f
        L2c:
            r7 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r6
            java.lang.String r1 = r1.codecName
            java.lang.String r1 = "Cannot create media encoder " + r1
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        L3f:
            r0 = r6
            boolean r0 = r0.useSurfaceMode
            if (r0 == 0) goto L4d
            r0 = r6
            java.lang.Integer r0 = r0.surfaceColorFormat
            goto L51
        L4d:
            r0 = r6
            java.lang.Integer r0 = r0.yuvColorFormat
        L51:
            int r0 = r0.intValue()
            r7 = r0
            r0 = r6
            org.webrtc.VideoCodecMimeType r0 = r0.codecType     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r0 = r0.mimeType()     // Catch: java.lang.Throwable -> L1d2
            r1 = r6
            int r1 = r1.width     // Catch: java.lang.Throwable -> L1d2
            r2 = r6
            int r2 = r2.height     // Catch: java.lang.Throwable -> L1d2
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r8 = r0
            r0 = r8
            java.lang.String r1 = "bitrate"
            r2 = r6
            int r2 = r2.adjustedBitrate     // Catch: java.lang.Throwable -> L1d2
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0 = r8
            java.lang.String r1 = "bitrate-mode"
            r2 = 2
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0 = r8
            java.lang.String r1 = "color-format"
            r2 = r7
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0 = r8
            java.lang.String r1 = "frame-rate"
            r2 = r6
            org.webrtc.BitrateAdjuster r2 = r2.bitrateAdjuster     // Catch: java.lang.Throwable -> L1d2
            double r2 = r2.getAdjustedFramerateFps()     // Catch: java.lang.Throwable -> L1d2
            float r2 = (float) r2     // Catch: java.lang.Throwable -> L1d2
            r0.setFloat(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0 = r8
            java.lang.String r1 = "i-frame-interval"
            r2 = r6
            int r2 = r2.keyFrameIntervalSec     // Catch: java.lang.Throwable -> L1d2
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            org.webrtc.VideoCodecMimeType r0 = r0.codecType     // Catch: java.lang.Throwable -> L1d2
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264     // Catch: java.lang.Throwable -> L1d2
            if (r0 != r1) goto L140
            r0 = r6
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.params     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "profile-level-id"
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1d2
            r9 = r0
            r0 = r9
            if (r0 != 0) goto Lbb
            java.lang.String r0 = "42e01f"
            r9 = r0
        Lbb:
            r0 = r9
            r10 = r0
            r0 = -1
            r11 = r0
            r0 = r10
            int r0 = r0.hashCode()     // Catch: java.lang.Throwable -> L1d2
            switch(r0) {
                case 1537948542: goto Lf1;
                case 1595523974: goto Le0;
                default: goto Lff;
            }     // Catch: java.lang.Throwable -> L1d2
        Le0:
            r0 = r10
            java.lang.String r1 = "640c1f"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1d2
            if (r0 == 0) goto Lff
            r0 = 0
            r11 = r0
            goto Lff
        Lf1:
            r0 = r10
            java.lang.String r1 = "42e01f"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1d2
            if (r0 == 0) goto Lff
            r0 = 1
            r11 = r0
        Lff:
            r0 = r11
            switch(r0) {
                case 0: goto L11c;
                case 1: goto L132;
                default: goto L135;
            }     // Catch: java.lang.Throwable -> L1d2
        L11c:
            r0 = r8
            java.lang.String r1 = "profile"
            r2 = 8
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0 = r8
            java.lang.String r1 = "level"
            r2 = 256(0x100, float:3.59E-43)
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            goto L140
        L132:
            goto L140
        L135:
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r9
            java.lang.String r1 = "Unknown profile level id: " + r1     // Catch: java.lang.Throwable -> L1d2
            org.webrtc.Logging.w(r0, r1)     // Catch: java.lang.Throwable -> L1d2
        L140:
            r0 = r6
            java.lang.String r0 = r0.codecName     // Catch: java.lang.Throwable -> L1d2
            java.lang.String r1 = "c2.google.av1.encoder"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L1d2
            if (r0 == 0) goto L155
            r0 = r8
            java.lang.String r1 = "vendor.google-av1enc.encoding-preset.int32.value"
            r2 = 1
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
        L155:
            r0 = r6
            boolean r0 = r0.isEncodingStatisticsSupported()     // Catch: java.lang.Throwable -> L1d2
            if (r0 == 0) goto L169
            r0 = r8
            java.lang.String r1 = "video-encoding-statistics-level"
            r2 = 1
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            r1 = 1
            r0.isEncodingStatisticsEnabled = r1     // Catch: java.lang.Throwable -> L1d2
        L169:
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r8
            java.lang.String r1 = "Format: " + r1     // Catch: java.lang.Throwable -> L1d2
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Throwable -> L1d2
            r1 = r8
            r2 = 0
            r3 = 0
            r4 = 1
            r0.configure(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            boolean r0 = r0.useSurfaceMode     // Catch: java.lang.Throwable -> L1d2
            if (r0 == 0) goto L1b9
            r0 = r6
            r1 = r6
            org.webrtc.EglBase14$Context r1 = r1.sharedContext     // Catch: java.lang.Throwable -> L1d2
            int[] r2 = org.webrtc.EglBase.CONFIG_RECORDABLE     // Catch: java.lang.Throwable -> L1d2
            org.webrtc.EglBase14 r1 = org.webrtc.EglBase.createEgl14(r1, r2)     // Catch: java.lang.Throwable -> L1d2
            r0.textureEglBase = r1     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            r1 = r6
            org.webrtc.MediaCodecWrapper r1 = r1.codec     // Catch: java.lang.Throwable -> L1d2
            android.view.Surface r1 = r1.createInputSurface()     // Catch: java.lang.Throwable -> L1d2
            r0.textureInputSurface = r1     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            org.webrtc.EglBase14 r0 = r0.textureEglBase     // Catch: java.lang.Throwable -> L1d2
            r1 = r6
            android.view.Surface r1 = r1.textureInputSurface     // Catch: java.lang.Throwable -> L1d2
            r0.createSurface(r1)     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            org.webrtc.EglBase14 r0 = r0.textureEglBase     // Catch: java.lang.Throwable -> L1d2
            r0.makeCurrent()     // Catch: java.lang.Throwable -> L1d2
        L1b9:
            r0 = r6
            r1 = r6
            org.webrtc.MediaCodecWrapper r1 = r1.codec     // Catch: java.lang.Throwable -> L1d2
            android.media.MediaFormat r1 = r1.getInputFormat()     // Catch: java.lang.Throwable -> L1d2
            r0.updateInputFormat(r1)     // Catch: java.lang.Throwable -> L1d2
            r0 = r6
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Throwable -> L1d2
            r0.start()     // Catch: java.lang.Throwable -> L1d2
            goto L1e5
        L1d2:
            r8 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "initEncodeInternal failed"
            r2 = r8
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = r6
            org.webrtc.VideoCodecStatus r0 = r0.release()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        L1e5:
            r0 = r6
            r1 = 1
            r0.running = r1
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.detachThread()
            r0 = r6
            r1 = r6
            java.lang.Thread r1 = r1.createOutputThread()
            r0.outputThread = r1
            r0 = r6
            java.lang.Thread r0 = r0.outputThread
            r0.start()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus release() {
            r4 = this;
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r4
            java.lang.Thread r0 = r0.outputThread
            if (r0 != 0) goto L15
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            r5 = r0
            goto L54
        L15:
            r0 = r4
            r1 = 0
            r0.running = r1
            r0 = r4
            java.lang.Thread r0 = r0.outputThread
            r1 = 5000(0x1388, double:2.4703E-320)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r0, r1)
            if (r0 != 0) goto L36
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder release timeout"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.TIMEOUT
            r5 = r0
            goto L54
        L36:
            r0 = r4
            java.lang.Exception r0 = r0.shutdownException
            if (r0 == 0) goto L50
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder release exception"
            r2 = r4
            java.lang.Exception r2 = r2.shutdownException
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            r5 = r0
            goto L54
        L50:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            r5 = r0
        L54:
            r0 = r4
            org.webrtc.GlRectDrawer r0 = r0.textureDrawer
            r0.release()
            r0 = r4
            org.webrtc.VideoFrameDrawer r0 = r0.videoFrameDrawer
            r0.release()
            r0 = r4
            org.webrtc.EglBase14 r0 = r0.textureEglBase
            if (r0 == 0) goto L77
            r0 = r4
            org.webrtc.EglBase14 r0 = r0.textureEglBase
            r0.release()
            r0 = r4
            r1 = 0
            r0.textureEglBase = r1
        L77:
            r0 = r4
            android.view.Surface r0 = r0.textureInputSurface
            if (r0 == 0) goto L8a
            r0 = r4
            android.view.Surface r0 = r0.textureInputSurface
            r0.release()
            r0 = r4
            r1 = 0
            r0.textureInputSurface = r1
        L8a:
            r0 = r4
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r0.outputBuilders
            r0.clear()
            r0 = r4
            r1 = 0
            r0.codec = r1
            r0 = r4
            r1 = 0
            r0.outputThread = r1
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.detachThread()
            r0 = r5
            return r0
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r7, org.webrtc.VideoEncoder.EncodeInfo r8) {
            r6 = this;
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r6
            org.webrtc.MediaCodecWrapper r0 = r0.codec
            if (r0 != 0) goto L12
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.UNINITIALIZED
            return r0
        L12:
            r0 = r7
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            boolean r0 = r0 instanceof org.webrtc.VideoFrame.TextureBuffer
            r9 = r0
            r0 = r7
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            int r0 = r0.getWidth()
            r10 = r0
            r0 = r7
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            int r0 = r0.getHeight()
            r11 = r0
            r0 = r6
            boolean r0 = r0.canUseSurface()
            if (r0 == 0) goto L3f
            r0 = r9
            if (r0 == 0) goto L3f
            r0 = 1
            goto L40
        L3f:
            r0 = 0
        L40:
            r12 = r0
            r0 = r10
            r1 = r6
            int r1 = r1.width
            if (r0 != r1) goto L5d
            r0 = r11
            r1 = r6
            int r1 = r1.height
            if (r0 != r1) goto L5d
            r0 = r12
            r1 = r6
            boolean r1 = r1.useSurfaceMode
            if (r0 == r1) goto L74
        L5d:
            r0 = r6
            r1 = r10
            r2 = r11
            r3 = r12
            org.webrtc.VideoCodecStatus r0 = r0.resetCodec(r1, r2, r3)
            r13 = r0
            r0 = r13
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.OK
            if (r0 == r1) goto L74
            r0 = r13
            return r0
        L74:
            r0 = r6
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r0.outputBuilders
            int r0 = r0.size()
            r1 = 2
            if (r0 <= r1) goto L8d
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Dropped frame, encoder queue full"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.NO_OUTPUT
            return r0
        L8d:
            r0 = 0
            r13 = r0
            r0 = r8
            org.webrtc.EncodedImage$FrameType[] r0 = r0.frameTypes
            r14 = r0
            r0 = r14
            int r0 = r0.length
            r15 = r0
            r0 = 0
            r16 = r0
        L9e:
            r0 = r16
            r1 = r15
            if (r0 >= r1) goto Lbd
            r0 = r14
            r1 = r16
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            org.webrtc.EncodedImage$FrameType r1 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
            if (r0 != r1) goto Lb7
            r0 = 1
            r13 = r0
        Lb7:
            int r16 = r16 + 1
            goto L9e
        Lbd:
            r0 = r13
            if (r0 != 0) goto Lcd
            r0 = r6
            r1 = r7
            long r1 = r1.getTimestampNs()
            boolean r0 = r0.shouldForceKeyFrame(r1)
            if (r0 == 0) goto Ld5
        Lcd:
            r0 = r6
            r1 = r7
            long r1 = r1.getTimestampNs()
            r0.requestKeyFrame(r1)
        Ld5:
            org.webrtc.EncodedImage$Builder r0 = org.webrtc.EncodedImage.builder()
            r1 = r7
            long r1 = r1.getTimestampNs()
            org.webrtc.EncodedImage$Builder r0 = r0.setCaptureTimeNs(r1)
            r1 = r7
            org.webrtc.VideoFrame$Buffer r1 = r1.getBuffer()
            int r1 = r1.getWidth()
            org.webrtc.EncodedImage$Builder r0 = r0.setEncodedWidth(r1)
            r1 = r7
            org.webrtc.VideoFrame$Buffer r1 = r1.getBuffer()
            int r1 = r1.getHeight()
            org.webrtc.EncodedImage$Builder r0 = r0.setEncodedHeight(r1)
            r1 = r7
            int r1 = r1.getRotation()
            org.webrtc.EncodedImage$Builder r0 = r0.setRotation(r1)
            r14 = r0
            r0 = r6
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r0.outputBuilders
            r1 = r14
            boolean r0 = r0.offer(r1)
            r0 = r6
            long r0 = r0.nextPresentationTimestampUs
            r15 = r0
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 1
            long r0 = r0.toMicros(r1)
            double r0 = (double) r0
            r1 = r6
            org.webrtc.BitrateAdjuster r1 = r1.bitrateAdjuster
            double r1 = r1.getAdjustedFramerateFps()
            double r0 = r0 / r1
            long r0 = (long) r0
            r17 = r0
            r0 = r6
            r1 = r0
            long r1 = r1.nextPresentationTimestampUs
            r2 = r17
            long r1 = r1 + r2
            r0.nextPresentationTimestampUs = r1
            r0 = r6
            boolean r0 = r0.useSurfaceMode
            if (r0 == 0) goto L145
            r0 = r6
            r1 = r7
            r2 = r15
            org.webrtc.VideoCodecStatus r0 = r0.encodeTextureBuffer(r1, r2)
            r19 = r0
            goto L14e
        L145:
            r0 = r6
            r1 = r7
            r2 = r15
            org.webrtc.VideoCodecStatus r0 = r0.encodeByteBuffer(r1, r2)
            r19 = r0
        L14e:
            r0 = r19
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.OK
            if (r0 == r1) goto L160
            r0 = r6
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r0.outputBuilders
            java.lang.Object r0 = r0.pollLast()
        L160:
            r0 = r19
            return r0
    }

    private org.webrtc.VideoCodecStatus encodeTextureBuffer(org.webrtc.VideoFrame r8, long r9) {
            r7 = this;
            r0 = r7
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch: java.lang.RuntimeException -> L40
            org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame     // Catch: java.lang.RuntimeException -> L40
            r1 = r0
            r2 = r8
            org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()     // Catch: java.lang.RuntimeException -> L40
            r3 = 0
            r4 = r8
            long r4 = r4.getTimestampNs()     // Catch: java.lang.RuntimeException -> L40
            r1.<init>(r2, r3, r4)     // Catch: java.lang.RuntimeException -> L40
            r11 = r0
            r0 = r7
            org.webrtc.VideoFrameDrawer r0 = r0.videoFrameDrawer     // Catch: java.lang.RuntimeException -> L40
            r1 = r11
            r2 = r7
            org.webrtc.GlRectDrawer r2 = r2.textureDrawer     // Catch: java.lang.RuntimeException -> L40
            r3 = 0
            r0.drawFrame(r1, r2, r3)     // Catch: java.lang.RuntimeException -> L40
            r0 = r7
            org.webrtc.EglBase14 r0 = r0.textureEglBase     // Catch: java.lang.RuntimeException -> L40
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch: java.lang.RuntimeException -> L40
            r2 = r9
            long r1 = r1.toNanos(r2)     // Catch: java.lang.RuntimeException -> L40
            r0.swapBuffers(r1)     // Catch: java.lang.RuntimeException -> L40
            goto L50
        L40:
            r11 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "encodeTexture failed"
            r2 = r11
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L50:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    private org.webrtc.VideoCodecStatus encodeByteBuffer(org.webrtc.VideoFrame r9, long r10) {
            r8 = this;
            r0 = r8
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r8
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L16
            r1 = 0
            int r0 = r0.dequeueInputBuffer(r1)     // Catch: java.lang.IllegalStateException -> L16
            r12 = r0
            goto L26
        L16:
            r13 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "dequeueInputBuffer failed"
            r2 = r13
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L26:
            r0 = r12
            r1 = -1
            if (r0 != r1) goto L38
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Dropped frame, no input buffers available"
            org.webrtc.Logging.d(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.NO_OUTPUT
            return r0
        L38:
            r0 = r8
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L48
            r1 = r12
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r1)     // Catch: java.lang.IllegalStateException -> L48
            r13 = r0
            goto L5c
        L48:
            r14 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r12
            java.lang.String r1 = "getInputBuffer with index=" + r1 + " failed"
            r2 = r14
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L5c:
            r0 = r13
            int r0 = r0.capacity()
            r1 = r8
            int r1 = r1.frameSizeBytes
            if (r0 >= r1) goto L7f
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r13
            int r1 = r1.capacity()
            r2 = r8
            int r2 = r2.frameSizeBytes
            java.lang.String r1 = "Input buffer size: " + r1 + " is smaller than frame size: " + r2
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L7f:
            r0 = r8
            r1 = r13
            r2 = r9
            org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()
            r0.fillInputBuffer(r1, r2)
            r0 = r8
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L9e
            r1 = r12
            r2 = 0
            r3 = r8
            int r3 = r3.frameSizeBytes     // Catch: java.lang.IllegalStateException -> L9e
            r4 = r10
            r5 = 0
            r0.queueInputBuffer(r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalStateException -> L9e
            goto Lae
        L9e:
            r14 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "queueInputBuffer failed"
            r2 = r14
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        Lae:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus setRateAllocation(org.webrtc.VideoEncoder.BitrateAllocation r6, int r7) {
            r5 = this;
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r7
            r1 = 30
            if (r0 <= r1) goto L10
            r0 = 30
            r7 = r0
        L10:
            r0 = r5
            org.webrtc.BitrateAdjuster r0 = r0.bitrateAdjuster
            r1 = r6
            int r1 = r1.getSum()
            r2 = r7
            double r2 = (double) r2
            r0.setTargets(r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoCodecStatus setRates(org.webrtc.VideoEncoder.RateControlParameters r6) {
            r5 = this;
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r5
            org.webrtc.BitrateAdjuster r0 = r0.bitrateAdjuster
            r1 = r6
            org.webrtc.VideoEncoder$BitrateAllocation r1 = r1.bitrate
            int r1 = r1.getSum()
            r2 = r6
            double r2 = r2.framerateFps
            r0.setTargets(r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoEncoder.ScalingSettings getScalingSettings() {
            r5 = this;
            r0 = r5
            boolean r0 = r0.automaticResizeOn
            if (r0 == 0) goto L3f
            r0 = r5
            org.webrtc.VideoCodecMimeType r0 = r0.codecType
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP8
            if (r0 != r1) goto L23
            r0 = 29
            r6 = r0
            r0 = 95
            r7 = r0
            org.webrtc.VideoEncoder$ScalingSettings r0 = new org.webrtc.VideoEncoder$ScalingSettings
            r1 = r0
            r2 = 29
            r3 = 95
            r1.<init>(r2, r3)
            return r0
        L23:
            r0 = r5
            org.webrtc.VideoCodecMimeType r0 = r0.codecType
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264
            if (r0 != r1) goto L3f
            r0 = 24
            r6 = r0
            r0 = 37
            r7 = r0
            org.webrtc.VideoEncoder$ScalingSettings r0 = new org.webrtc.VideoEncoder$ScalingSettings
            r1 = r0
            r2 = 24
            r3 = 37
            r1.<init>(r2, r3)
            return r0
        L3f:
            org.webrtc.VideoEncoder$ScalingSettings r0 = org.webrtc.VideoEncoder.ScalingSettings.OFF
            return r0
    }

    @Override // org.webrtc.VideoEncoder
    public java.lang.String getImplementationName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.codecName
            return r0
    }

    @Override // org.webrtc.VideoEncoder
    public org.webrtc.VideoEncoder.EncoderInfo getEncoderInfo() {
            r5 = this;
            org.webrtc.VideoEncoder$EncoderInfo r0 = new org.webrtc.VideoEncoder$EncoderInfo
            r1 = r0
            r2 = 16
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }

    private org.webrtc.VideoCodecStatus resetCodec(int r4, int r5, boolean r6) {
            r3 = this;
            r0 = r3
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r3
            org.webrtc.VideoCodecStatus r0 = r0.release()
            r7 = r0
            r0 = r7
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.OK
            if (r0 == r1) goto L18
            r0 = r7
            return r0
        L18:
            r0 = r3
            r1 = r4
            r0.width = r1
            r0 = r3
            r1 = r5
            r0.height = r1
            r0 = r3
            r1 = r6
            r0.useSurfaceMode = r1
            r0 = r3
            org.webrtc.VideoCodecStatus r0 = r0.initEncodeInternal()
            return r0
    }

    private boolean shouldForceKeyFrame(long r8) {
            r7 = this;
            r0 = r7
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = r7
            long r0 = r0.forcedKeyFrameNs
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L22
            r0 = r8
            r1 = r7
            long r1 = r1.lastKeyFrameNs
            r2 = r7
            long r2 = r2.forcedKeyFrameNs
            long r1 = r1 + r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    private void requestKeyFrame(long r5) {
            r4 = this;
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.encodeThreadChecker
            r0.checkIsOnValidThread()
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.IllegalStateException -> L24
            r1 = r0
            r1.<init>()     // Catch: java.lang.IllegalStateException -> L24
            r7 = r0
            r0 = r7
            java.lang.String r1 = "request-sync"
            r2 = 0
            r0.putInt(r1, r2)     // Catch: java.lang.IllegalStateException -> L24
            r0 = r4
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L24
            r1 = r7
            r0.setParameters(r1)     // Catch: java.lang.IllegalStateException -> L24
            goto L2f
        L24:
            r7 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "requestKeyFrame failed"
            r2 = r7
            org.webrtc.Logging.e(r0, r1, r2)
            return
        L2f:
            r0 = r4
            r1 = r5
            r0.lastKeyFrameNs = r1
            return
    }

    private java.lang.Thread createOutputThread() {
            r4 = this;
            org.webrtc.HardwareVideoEncoder$1 r0 = new org.webrtc.HardwareVideoEncoder$1
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            return r0
    }

    protected void deliverEncodedImage() {
            r5 = this;
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.checkIsOnValidThread()
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r0
            r1.<init>()     // Catch: java.lang.IllegalStateException -> L1e3
            r6 = r0
            r0 = r5
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r6
            r2 = 100000(0x186a0, double:4.94066E-319)
            int r0 = r0.dequeueOutputBuffer(r1, r2)     // Catch: java.lang.IllegalStateException -> L1e3
            r7 = r0
            r0 = r7
            if (r0 >= 0) goto L2f
            r0 = r7
            r1 = -3
            if (r0 != r1) goto L2e
            r0 = r5
            org.webrtc.HardwareVideoEncoder$BusyCount r0 = r0.outputBuffersBusyCount     // Catch: java.lang.IllegalStateException -> L1e3
            r0.waitForZero()     // Catch: java.lang.IllegalStateException -> L1e3
        L2e:
            return
        L2f:
            r0 = r5
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r7
            java.nio.ByteBuffer r0 = r0.getOutputBuffer(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r8 = r0
            r0 = r8
            r1 = r6
            int r1 = r1.offset     // Catch: java.lang.IllegalStateException -> L1e3
            java.nio.ByteBuffer r0 = r0.position(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r8
            r1 = r6
            int r1 = r1.offset     // Catch: java.lang.IllegalStateException -> L1e3
            r2 = r6
            int r2 = r2.size     // Catch: java.lang.IllegalStateException -> L1e3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.limit(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r6
            int r0 = r0.flags     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = 2
            r0 = r0 & r1
            if (r0 == 0) goto L9c
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r6
            int r1 = r1.offset     // Catch: java.lang.IllegalStateException -> L1e3
            r2 = r6
            int r2 = r2.size     // Catch: java.lang.IllegalStateException -> L1e3
            java.lang.String r1 = "Config frame generated. Offset: " + r1 + ". Size: " + r2     // Catch: java.lang.IllegalStateException -> L1e3
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.IllegalStateException -> L1e3
            if (r0 <= 0) goto L9b
            r0 = r5
            org.webrtc.VideoCodecMimeType r0 = r0.codecType     // Catch: java.lang.IllegalStateException -> L1e3
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264     // Catch: java.lang.IllegalStateException -> L1e3
            if (r0 == r1) goto L87
            r0 = r5
            org.webrtc.VideoCodecMimeType r0 = r0.codecType     // Catch: java.lang.IllegalStateException -> L1e3
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H265     // Catch: java.lang.IllegalStateException -> L1e3
            if (r0 != r1) goto L9b
        L87:
            r0 = r5
            r1 = r6
            int r1 = r1.size     // Catch: java.lang.IllegalStateException -> L1e3
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0.configBuffer = r1     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r5
            java.nio.ByteBuffer r0 = r0.configBuffer     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r8
            java.nio.ByteBuffer r0 = r0.put(r1)     // Catch: java.lang.IllegalStateException -> L1e3
        L9b:
            return
        L9c:
            r0 = r5
            org.webrtc.BitrateAdjuster r0 = r0.bitrateAdjuster     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r6
            int r1 = r1.size     // Catch: java.lang.IllegalStateException -> L1e3
            r0.reportEncodedFrame(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r5
            int r0 = r0.adjustedBitrate     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r5
            org.webrtc.BitrateAdjuster r1 = r1.bitrateAdjuster     // Catch: java.lang.IllegalStateException -> L1e3
            int r1 = r1.getAdjustedBitrateBps()     // Catch: java.lang.IllegalStateException -> L1e3
            if (r0 == r1) goto Lbe
            r0 = r5
            org.webrtc.VideoCodecStatus r0 = r0.updateBitrate()     // Catch: java.lang.IllegalStateException -> L1e3
        Lbe:
            r0 = r6
            int r0 = r0.flags     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto Lcb
            r0 = 1
            goto Lcc
        Lcb:
            r0 = 0
        Lcc:
            r9 = r0
            r0 = r9
            if (r0 == 0) goto Ldb
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Sync frame generated"
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.IllegalStateException -> L1e3
        Ldb:
            r0 = 0
            r10 = r0
            r0 = r5
            boolean r0 = r0.isEncodingStatisticsEnabled     // Catch: java.lang.IllegalStateException -> L1e3
            if (r0 == 0) goto L10e
            r0 = r5
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r7
            android.media.MediaFormat r0 = r0.getOutputFormat(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L10e
            r0 = r11
            java.lang.String r1 = "video-qp-average"
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            if (r0 == 0) goto L10e
            r0 = r11
            java.lang.String r1 = "video-qp-average"
            int r0 = r0.getInteger(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalStateException -> L1e3
            r10 = r0
        L10e:
            r0 = r9
            if (r0 == 0) goto L174
            r0 = r5
            java.nio.ByteBuffer r0 = r0.configBuffer     // Catch: java.lang.IllegalStateException -> L1e3
            if (r0 == 0) goto L174
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r5
            java.nio.ByteBuffer r1 = r1.configBuffer     // Catch: java.lang.IllegalStateException -> L1e3
            int r1 = r1.capacity()     // Catch: java.lang.IllegalStateException -> L1e3
            r2 = r6
            int r2 = r2.offset     // Catch: java.lang.IllegalStateException -> L1e3
            r3 = r6
            int r3 = r3.size     // Catch: java.lang.IllegalStateException -> L1e3
            java.lang.String r1 = "Prepending config buffer of size " + r1 + " to output buffer with offset " + r2 + ", size " + r3     // Catch: java.lang.IllegalStateException -> L1e3
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r6
            int r0 = r0.size     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r5
            java.nio.ByteBuffer r1 = r1.configBuffer     // Catch: java.lang.IllegalStateException -> L1e3
            int r1 = r1.capacity()     // Catch: java.lang.IllegalStateException -> L1e3
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)     // Catch: java.lang.IllegalStateException -> L1e3
            r11 = r0
            r0 = r5
            java.nio.ByteBuffer r0 = r0.configBuffer     // Catch: java.lang.IllegalStateException -> L1e3
            java.nio.ByteBuffer r0 = r0.rewind()     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r11
            r1 = r5
            java.nio.ByteBuffer r1 = r1.configBuffer     // Catch: java.lang.IllegalStateException -> L1e3
            java.nio.ByteBuffer r0 = r0.put(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r11
            r1 = r8
            java.nio.ByteBuffer r0 = r0.put(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r11
            java.nio.ByteBuffer r0 = r0.rewind()     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r5
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r7
            r2 = 0
            r0.releaseOutputBuffer(r1, r2)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = 0
            r12 = r0
            goto L18a
        L174:
            r0 = r8
            java.nio.ByteBuffer r0 = r0.slice()     // Catch: java.lang.IllegalStateException -> L1e3
            r11 = r0
            r0 = r5
            org.webrtc.HardwareVideoEncoder$BusyCount r0 = r0.outputBuffersBusyCount     // Catch: java.lang.IllegalStateException -> L1e3
            r0.increment()     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r5
            r1 = r7
            void r0 = () -> { // java.lang.Runnable.run():void
                r0.lambda$deliverEncodedImage$0(r1);
            }     // Catch: java.lang.IllegalStateException -> L1e3
            r12 = r0
        L18a:
            r0 = r9
            if (r0 == 0) goto L195
            org.webrtc.EncodedImage$FrameType r0 = org.webrtc.EncodedImage.FrameType.VideoFrameKey     // Catch: java.lang.IllegalStateException -> L1e3
            goto L198
        L195:
            org.webrtc.EncodedImage$FrameType r0 = org.webrtc.EncodedImage.FrameType.VideoFrameDelta     // Catch: java.lang.IllegalStateException -> L1e3
        L198:
            r13 = r0
            r0 = r5
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r0 = r0.outputBuilders     // Catch: java.lang.IllegalStateException -> L1e3
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.IllegalStateException -> L1e3
            org.webrtc.EncodedImage$Builder r0 = (org.webrtc.EncodedImage.Builder) r0     // Catch: java.lang.IllegalStateException -> L1e3
            r14 = r0
            r0 = r14
            r1 = r11
            r2 = r12
            org.webrtc.EncodedImage$Builder r0 = r0.setBuffer(r1, r2)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r14
            r1 = r13
            org.webrtc.EncodedImage$Builder r0 = r0.setFrameType(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r14
            r1 = r10
            org.webrtc.EncodedImage$Builder r0 = r0.setQp(r1)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r14
            org.webrtc.EncodedImage r0 = r0.createEncodedImage()     // Catch: java.lang.IllegalStateException -> L1e3
            r15 = r0
            r0 = r5
            org.webrtc.VideoEncoder$Callback r0 = r0.callback     // Catch: java.lang.IllegalStateException -> L1e3
            r1 = r15
            org.webrtc.VideoEncoder$CodecSpecificInfo r2 = new org.webrtc.VideoEncoder$CodecSpecificInfo     // Catch: java.lang.IllegalStateException -> L1e3
            r3 = r2
            r3.<init>()     // Catch: java.lang.IllegalStateException -> L1e3
            r0.onEncodedFrame(r1, r2)     // Catch: java.lang.IllegalStateException -> L1e3
            r0 = r15
            r0.release()     // Catch: java.lang.IllegalStateException -> L1e3
            goto L1ed
        L1e3:
            r6 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "deliverOutput failed"
            r2 = r6
            org.webrtc.Logging.e(r0, r1, r2)
        L1ed:
            return
    }

    private void releaseCodecOnOutputThread() {
            r4 = this;
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Releasing MediaCodec on output thread"
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            org.webrtc.HardwareVideoEncoder$BusyCount r0 = r0.outputBuffersBusyCount
            r0.waitForZero()
            r0 = r4
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Exception -> L22
            r0.stop()     // Catch: java.lang.Exception -> L22
            goto L2c
        L22:
            r5 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder stop failed"
            r2 = r5
            org.webrtc.Logging.e(r0, r1, r2)
        L2c:
            r0 = r4
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Exception -> L38
            r0.release()     // Catch: java.lang.Exception -> L38
            goto L47
        L38:
            r5 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder release failed"
            r2 = r5
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = r4
            r1 = r5
            r0.shutdownException = r1
        L47:
            r0 = r4
            r1 = 0
            r0.configBuffer = r1
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Release on output thread done"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private org.webrtc.VideoCodecStatus updateBitrate() {
            r4 = this;
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.checkIsOnValidThread()
            r0 = r4
            r1 = r4
            org.webrtc.BitrateAdjuster r1 = r1.bitrateAdjuster
            int r1 = r1.getAdjustedBitrateBps()
            r0.adjustedBitrate = r1
            android.os.Bundle r0 = new android.os.Bundle     // Catch: java.lang.IllegalStateException -> L35
            r1 = r0
            r1.<init>()     // Catch: java.lang.IllegalStateException -> L35
            r5 = r0
            r0 = r5
            java.lang.String r1 = "video-bitrate"
            r2 = r4
            int r2 = r2.adjustedBitrate     // Catch: java.lang.IllegalStateException -> L35
            r0.putInt(r1, r2)     // Catch: java.lang.IllegalStateException -> L35
            r0 = r4
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L35
            r1 = r5
            r0.setParameters(r1)     // Catch: java.lang.IllegalStateException -> L35
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK     // Catch: java.lang.IllegalStateException -> L35
            return r0
        L35:
            r5 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "updateBitrate failed"
            r2 = r5
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
    }

    private boolean canUseSurface() {
            r2 = this;
            r0 = r2
            org.webrtc.EglBase14$Context r0 = r0.sharedContext
            if (r0 == 0) goto L12
            r0 = r2
            java.lang.Integer r0 = r0.surfaceColorFormat
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private void updateInputFormat(android.media.MediaFormat r8) {
            r7 = this;
            r0 = r7
            r1 = r7
            int r1 = r1.width
            r0.stride = r1
            r0 = r7
            r1 = r7
            int r1 = r1.height
            r0.sliceHeight = r1
            r0 = r8
            if (r0 == 0) goto L5c
            r0 = r8
            java.lang.String r1 = "stride"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L38
            r0 = r7
            r1 = r8
            java.lang.String r2 = "stride"
            int r1 = r1.getInteger(r2)
            r0.stride = r1
            r0 = r7
            r1 = r7
            int r1 = r1.stride
            r2 = r7
            int r2 = r2.width
            int r1 = java.lang.Math.max(r1, r2)
            r0.stride = r1
        L38:
            r0 = r8
            java.lang.String r1 = "slice-height"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L5c
            r0 = r7
            r1 = r8
            java.lang.String r2 = "slice-height"
            int r1 = r1.getInteger(r2)
            r0.sliceHeight = r1
            r0 = r7
            r1 = r7
            int r1 = r1.sliceHeight
            r2 = r7
            int r2 = r2.height
            int r1 = java.lang.Math.max(r1, r2)
            r0.sliceHeight = r1
        L5c:
            r0 = r7
            r1 = r7
            r2 = r7
            java.lang.Integer r2 = r2.yuvColorFormat
            int r2 = r2.intValue()
            boolean r1 = r1.isSemiPlanar(r2)
            r0.isSemiPlanar = r1
            r0 = r7
            boolean r0 = r0.isSemiPlanar
            if (r0 == 0) goto L92
            r0 = r7
            int r0 = r0.height
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r9 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.sliceHeight
            r2 = r7
            int r2 = r2.stride
            int r1 = r1 * r2
            r2 = r9
            r3 = r7
            int r3 = r3.stride
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0.frameSizeBytes = r1
            goto Lb7
        L92:
            r0 = r7
            int r0 = r0.stride
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r9 = r0
            r0 = r7
            int r0 = r0.sliceHeight
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r10 = r0
            r0 = r7
            r1 = r7
            int r1 = r1.sliceHeight
            r2 = r7
            int r2 = r2.stride
            int r1 = r1 * r2
            r2 = r10
            r3 = r9
            int r2 = r2 * r3
            r3 = 2
            int r2 = r2 * r3
            int r1 = r1 + r2
            r0.frameSizeBytes = r1
        Lb7:
            java.lang.String r0 = "HardwareVideoEncoder"
            r1 = r8
            r2 = r7
            int r2 = r2.stride
            r3 = r7
            int r3 = r3.sliceHeight
            r4 = r7
            boolean r4 = r4.isSemiPlanar
            r5 = r7
            int r5 = r5.frameSizeBytes
            java.lang.String r1 = "updateInputFormat format: " + r1 + " stride: " + r2 + " sliceHeight: " + r3 + " isSemiPlanar: " + r4 + " frameSizeBytes: " + r5
            org.webrtc.Logging.d(r0, r1)
            return
    }

    protected boolean isEncodingStatisticsSupported() {
            r3 = this;
            r0 = r3
            org.webrtc.VideoCodecMimeType r0 = r0.codecType
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP8
            if (r0 == r1) goto L14
            r0 = r3
            org.webrtc.VideoCodecMimeType r0 = r0.codecType
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP9
            if (r0 != r1) goto L16
        L14:
            r0 = 0
            return r0
        L16:
            r0 = r3
            org.webrtc.MediaCodecWrapper r0 = r0.codec
            android.media.MediaCodecInfo r0 = r0.getCodecInfo()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L26
            r0 = 0
            return r0
        L26:
            r0 = r4
            r1 = r3
            org.webrtc.VideoCodecMimeType r1 = r1.codecType
            java.lang.String r1 = r1.mimeType()
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r1)
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L38
            r0 = 0
            return r0
        L38:
            r0 = r5
            java.lang.String r1 = "encoding-statistics"
            boolean r0 = r0.isFeatureSupported(r1)
            return r0
    }

    protected void fillInputBuffer(java.nio.ByteBuffer r13, org.webrtc.VideoFrame.Buffer r14) {
            r12 = this;
            r0 = r14
            org.webrtc.VideoFrame$I420Buffer r0 = r0.toI420()
            r15 = r0
            r0 = r12
            boolean r0 = r0.isSemiPlanar
            if (r0 == 0) goto L4d
            r0 = r15
            java.nio.ByteBuffer r0 = r0.getDataY()
            r1 = r15
            int r1 = r1.getStrideY()
            r2 = r15
            java.nio.ByteBuffer r2 = r2.getDataU()
            r3 = r15
            int r3 = r3.getStrideU()
            r4 = r15
            java.nio.ByteBuffer r4 = r4.getDataV()
            r5 = r15
            int r5 = r5.getStrideV()
            r6 = r13
            r7 = r15
            int r7 = r7.getWidth()
            r8 = r15
            int r8 = r8.getHeight()
            r9 = r12
            int r9 = r9.stride
            r10 = r12
            int r10 = r10.sliceHeight
            org.webrtc.YuvHelper.I420ToNV12(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L89
        L4d:
            r0 = r15
            java.nio.ByteBuffer r0 = r0.getDataY()
            r1 = r15
            int r1 = r1.getStrideY()
            r2 = r15
            java.nio.ByteBuffer r2 = r2.getDataU()
            r3 = r15
            int r3 = r3.getStrideU()
            r4 = r15
            java.nio.ByteBuffer r4 = r4.getDataV()
            r5 = r15
            int r5 = r5.getStrideV()
            r6 = r13
            r7 = r15
            int r7 = r7.getWidth()
            r8 = r15
            int r8 = r8.getHeight()
            r9 = r12
            int r9 = r9.stride
            r10 = r12
            int r10 = r10.sliceHeight
            org.webrtc.YuvHelper.I420Copy(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
        L89:
            r0 = r15
            r0.release()
            return
    }

    protected boolean isSemiPlanar(int r5) {
            r4 = this;
            r0 = r5
            switch(r0) {
                case 19: goto L2c;
                case 21: goto L2e;
                case 2141391872: goto L2e;
                case 2141391876: goto L2e;
                default: goto L30;
            }
        L2c:
            r0 = 0
            return r0
        L2e:
            r0 = 1
            return r0
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r5
            java.lang.String r2 = "Unsupported colorFormat: " + r2
            r1.<init>(r2)
            throw r0
    }

    private /* synthetic */ void lambda$deliverEncodedImage$0(int r5) {
            r4 = this;
            r0 = r4
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Exception -> Le
            r1 = r5
            r2 = 0
            r0.releaseOutputBuffer(r1, r2)     // Catch: java.lang.Exception -> Le
            goto L18
        Le:
            r6 = move-exception
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "releaseOutputBuffer failed"
            r2 = r6
            org.webrtc.Logging.e(r0, r1, r2)
        L18:
            r0 = r4
            org.webrtc.HardwareVideoEncoder$BusyCount r0 = r0.outputBuffersBusyCount
            r0.decrement()
            return
    }
}
