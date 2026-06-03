package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/AndroidVideoDecoder.class */
class AndroidVideoDecoder implements org.webrtc.VideoDecoder, org.webrtc.VideoSink {
    private static final java.lang.String TAG = "AndroidVideoDecoder";
    private static final int MEDIA_CODEC_RELEASE_TIMEOUT_MS = 5000;
    private static final int DEQUEUE_INPUT_TIMEOUT_US = 500000;
    private static final int DEQUEUE_OUTPUT_BUFFER_TIMEOUT_US = 100000;
    private final org.webrtc.MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private final java.lang.String codecName;
    private final org.webrtc.VideoCodecMimeType codecType;
    private final java.util.concurrent.BlockingDeque<org.webrtc.AndroidVideoDecoder.FrameInfo> frameInfos;
    private int colorFormat;

    @androidx.annotation.Nullable
    private java.lang.Thread outputThread;
    private org.webrtc.ThreadUtils.ThreadChecker outputThreadChecker;
    private org.webrtc.ThreadUtils.ThreadChecker decoderThreadChecker;
    private volatile boolean running;

    @androidx.annotation.Nullable
    private volatile java.lang.Exception shutdownException;
    private final java.lang.Object dimensionLock;
    private int width;
    private int height;
    private int stride;
    private int sliceHeight;
    private boolean hasDecodedFirstFrame;
    private boolean keyFrameRequired;

    @androidx.annotation.Nullable
    private final org.webrtc.EglBase.Context sharedContext;

    @androidx.annotation.Nullable
    private org.webrtc.SurfaceTextureHelper surfaceTextureHelper;

    @androidx.annotation.Nullable
    private android.view.Surface surface;
    private final java.lang.Object renderedTextureMetadataLock;

    @androidx.annotation.Nullable
    private org.webrtc.AndroidVideoDecoder.DecodedTextureMetadata renderedTextureMetadata;

    @androidx.annotation.Nullable
    private org.webrtc.VideoDecoder.Callback callback;

    @androidx.annotation.Nullable
    private org.webrtc.MediaCodecWrapper codec;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/AndroidVideoDecoder$DecodedTextureMetadata.class */
    private static class DecodedTextureMetadata {
        final long presentationTimestampUs;
        final java.lang.Integer decodeTimeMs;

        DecodedTextureMetadata(long r5, java.lang.Integer r7) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.presentationTimestampUs = r1
                r0 = r4
                r1 = r7
                r0.decodeTimeMs = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/AndroidVideoDecoder$FrameInfo.class */
    private static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        FrameInfo(long r5, int r7) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.decodeStartTimeMs = r1
                r0 = r4
                r1 = r7
                r0.rotation = r1
                return
        }
    }

    AndroidVideoDecoder(org.webrtc.MediaCodecWrapperFactory r7, java.lang.String r8, org.webrtc.VideoCodecMimeType r9, int r10, @androidx.annotation.Nullable org.webrtc.EglBase.Context r11) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.dimensionLock = r1
            r0 = r6
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.renderedTextureMetadataLock = r1
            r0 = r6
            r1 = r10
            boolean r0 = r0.isSupportedColorFormat(r1)
            if (r0 != 0) goto L32
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r10
            java.lang.String r2 = "Unsupported color format: " + r2
            r1.<init>(r2)
            throw r0
        L32:
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            java.lang.String r1 = "ctor name: " + r1 + " type: " + r2 + " color format: " + r3 + " context: " + r4
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            r1 = r7
            r0.mediaCodecWrapperFactory = r1
            r0 = r6
            r1 = r8
            r0.codecName = r1
            r0 = r6
            r1 = r9
            r0.codecType = r1
            r0 = r6
            r1 = r10
            r0.colorFormat = r1
            r0 = r6
            r1 = r11
            r0.sharedContext = r1
            r0 = r6
            java.util.concurrent.LinkedBlockingDeque r1 = new java.util.concurrent.LinkedBlockingDeque
            r2 = r1
            r2.<init>()
            r0.frameInfos = r1
            return
    }

    @Override // org.webrtc.VideoDecoder
    public org.webrtc.VideoCodecStatus initDecode(org.webrtc.VideoDecoder.Settings r6, org.webrtc.VideoDecoder.Callback r7) {
            r5 = this;
            r0 = r5
            org.webrtc.ThreadUtils$ThreadChecker r1 = new org.webrtc.ThreadUtils$ThreadChecker
            r2 = r1
            r2.<init>()
            r0.decoderThreadChecker = r1
            r0 = r5
            r1 = r7
            r0.callback = r1
            r0 = r5
            org.webrtc.EglBase$Context r0 = r0.sharedContext
            if (r0 == 0) goto L39
            r0 = r5
            r1 = r5
            org.webrtc.SurfaceTextureHelper r1 = r1.createSurfaceTextureHelper()
            r0.surfaceTextureHelper = r1
            r0 = r5
            android.view.Surface r1 = new android.view.Surface
            r2 = r1
            r3 = r5
            org.webrtc.SurfaceTextureHelper r3 = r3.surfaceTextureHelper
            android.graphics.SurfaceTexture r3 = r3.getSurfaceTexture()
            r2.<init>(r3)
            r0.surface = r1
            r0 = r5
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r1 = r5
            r0.startListening(r1)
        L39:
            r0 = r5
            r1 = r6
            int r1 = r1.width
            r2 = r6
            int r2 = r2.height
            org.webrtc.VideoCodecStatus r0 = r0.initDecodeInternal(r1, r2)
            return r0
    }

    private org.webrtc.VideoCodecStatus initDecodeInternal(int r8, int r9) {
            r7 = this;
            r0 = r7
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.decoderThreadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r7
            java.lang.String r1 = r1.codecName
            r2 = r7
            org.webrtc.VideoCodecMimeType r2 = r2.codecType
            r3 = r8
            r4 = r9
            r5 = r7
            int r5 = r5.colorFormat
            java.lang.String r1 = "initDecodeInternal name: " + r1 + " type: " + r2 + " width: " + r3 + " height: " + r4 + " color format: " + r5
            org.webrtc.Logging.d(r0, r1)
            r0 = r7
            java.lang.Thread r0 = r0.outputThread
            if (r0 == 0) goto L31
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "initDecodeInternal called while the codec is already running"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        L31:
            r0 = r7
            r1 = r8
            r0.width = r1
            r0 = r7
            r1 = r9
            r0.height = r1
            r0 = r7
            r1 = r8
            r0.stride = r1
            r0 = r7
            r1 = r9
            r0.sliceHeight = r1
            r0 = r7
            r1 = 0
            r0.hasDecodedFirstFrame = r1
            r0 = r7
            r1 = 1
            r0.keyFrameRequired = r1
            r0 = r7
            r1 = r7
            org.webrtc.MediaCodecWrapperFactory r1 = r1.mediaCodecWrapperFactory     // Catch: java.lang.Throwable -> L63
            r2 = r7
            java.lang.String r2 = r2.codecName     // Catch: java.lang.Throwable -> L63
            org.webrtc.MediaCodecWrapper r1 = r1.createByCodecName(r2)     // Catch: java.lang.Throwable -> L63
            r0.codec = r1     // Catch: java.lang.Throwable -> L63
            goto L76
        L63:
            r10 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r7
            java.lang.String r1 = r1.codecName
            java.lang.String r1 = "Cannot create media decoder " + r1
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        L76:
            r0 = r7
            org.webrtc.VideoCodecMimeType r0 = r0.codecType     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r0 = r0.mimeType()     // Catch: java.lang.Throwable -> Lb0
            r1 = r8
            r2 = r9
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r0, r1, r2)     // Catch: java.lang.Throwable -> Lb0
            r10 = r0
            r0 = r7
            org.webrtc.EglBase$Context r0 = r0.sharedContext     // Catch: java.lang.Throwable -> Lb0
            if (r0 != 0) goto L94
            r0 = r10
            java.lang.String r1 = "color-format"
            r2 = r7
            int r2 = r2.colorFormat     // Catch: java.lang.Throwable -> Lb0
            r0.setInteger(r1, r2)     // Catch: java.lang.Throwable -> Lb0
        L94:
            r0 = r7
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Throwable -> Lb0
            r1 = r10
            r2 = r7
            android.view.Surface r2 = r2.surface     // Catch: java.lang.Throwable -> Lb0
            r3 = 0
            r4 = 0
            r0.configure(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lb0
            r0 = r7
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Throwable -> Lb0
            r0.start()     // Catch: java.lang.Throwable -> Lb0
            goto Lc2
        Lb0:
            r10 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "initDecode failed"
            r2 = r10
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = r7
            org.webrtc.VideoCodecStatus r0 = r0.release()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        Lc2:
            r0 = r7
            r1 = 1
            r0.running = r1
            r0 = r7
            r1 = r7
            java.lang.Thread r1 = r1.createOutputThread()
            r0.outputThread = r1
            r0 = r7
            java.lang.Thread r0 = r0.outputThread
            r0.start()
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "initDecodeInternal done"
            org.webrtc.Logging.d(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    @Override // org.webrtc.VideoDecoder
    public org.webrtc.VideoCodecStatus decode(org.webrtc.EncodedImage r9, org.webrtc.VideoDecoder.DecodeInfo r10) {
            r8 = this;
            r0 = r8
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.decoderThreadChecker
            r0.checkIsOnValidThread()
            r0 = r8
            org.webrtc.MediaCodecWrapper r0 = r0.codec
            if (r0 == 0) goto L15
            r0 = r8
            org.webrtc.VideoDecoder$Callback r0 = r0.callback
            if (r0 != 0) goto L33
        L15:
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r8
            org.webrtc.MediaCodecWrapper r1 = r1.codec
            if (r1 == 0) goto L22
            r1 = 1
            goto L23
        L22:
            r1 = 0
        L23:
            r2 = r8
            org.webrtc.VideoDecoder$Callback r2 = r2.callback
            java.lang.String r1 = "decode uninitalized, codec: " + r1 + ", callback: " + r2
            org.webrtc.Logging.d(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.UNINITIALIZED
            return r0
        L33:
            r0 = r9
            java.nio.ByteBuffer r0 = r0.buffer
            if (r0 != 0) goto L45
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "decode() - no input data"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERR_PARAMETER
            return r0
        L45:
            r0 = r9
            java.nio.ByteBuffer r0 = r0.buffer
            int r0 = r0.remaining()
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L5c
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "decode() - input buffer empty"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERR_PARAMETER
            return r0
        L5c:
            r0 = r8
            java.lang.Object r0 = r0.dimensionLock
            r1 = r0
            r14 = r1
            monitor-enter(r0)
            r0 = r8
            int r0 = r0.width     // Catch: java.lang.Throwable -> L76
            r12 = r0
            r0 = r8
            int r0 = r0.height     // Catch: java.lang.Throwable -> L76
            r13 = r0
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            goto L7e
        L76:
            r15 = move-exception
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76
            r0 = r15
            throw r0
        L7e:
            r0 = r9
            int r0 = r0.encodedWidth
            r1 = r9
            int r1 = r1.encodedHeight
            int r0 = r0 * r1
            if (r0 <= 0) goto Lb5
            r0 = r9
            int r0 = r0.encodedWidth
            r1 = r12
            if (r0 != r1) goto L9c
            r0 = r9
            int r0 = r0.encodedHeight
            r1 = r13
            if (r0 == r1) goto Lb5
        L9c:
            r0 = r8
            r1 = r9
            int r1 = r1.encodedWidth
            r2 = r9
            int r2 = r2.encodedHeight
            org.webrtc.VideoCodecStatus r0 = r0.reinitDecode(r1, r2)
            r14 = r0
            r0 = r14
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.OK
            if (r0 == r1) goto Lb5
            r0 = r14
            return r0
        Lb5:
            r0 = r8
            boolean r0 = r0.keyFrameRequired
            if (r0 == 0) goto Ld2
            r0 = r9
            org.webrtc.EncodedImage$FrameType r0 = r0.frameType
            org.webrtc.EncodedImage$FrameType r1 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
            if (r0 == r1) goto Ld2
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "decode() - key frame required first"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.NO_OUTPUT
            return r0
        Ld2:
            r0 = r8
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> Le3
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = r0.dequeueInputBuffer(r1)     // Catch: java.lang.IllegalStateException -> Le3
            r14 = r0
            goto Lf3
        Le3:
            r15 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "dequeueInputBuffer failed"
            r2 = r15
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        Lf3:
            r0 = r14
            if (r0 >= 0) goto L104
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "decode() - no HW buffers available; decoder falling behind"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L104:
            r0 = r8
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L114
            r1 = r14
            java.nio.ByteBuffer r0 = r0.getInputBuffer(r1)     // Catch: java.lang.IllegalStateException -> L114
            r15 = r0
            goto L128
        L114:
            r16 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r14
            java.lang.String r1 = "getInputBuffer with index=" + r1 + " failed"
            r2 = r16
            org.webrtc.Logging.e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L128:
            r0 = r15
            int r0 = r0.capacity()
            r1 = r11
            if (r0 >= r1) goto L13d
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "decode() - HW buffer too small"
            org.webrtc.Logging.e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L13d:
            r0 = r15
            r1 = r9
            java.nio.ByteBuffer r1 = r1.buffer
            java.nio.ByteBuffer r0 = r0.put(r1)
            r0 = r8
            java.util.concurrent.BlockingDeque<org.webrtc.AndroidVideoDecoder$FrameInfo> r0 = r0.frameInfos
            org.webrtc.AndroidVideoDecoder$FrameInfo r1 = new org.webrtc.AndroidVideoDecoder$FrameInfo
            r2 = r1
            long r3 = android.os.SystemClock.elapsedRealtime()
            r4 = r9
            int r4 = r4.rotation
            r2.<init>(r3, r4)
            boolean r0 = r0.offer(r1)
            r0 = r8
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L17a
            r1 = r14
            r2 = 0
            r3 = r11
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.IllegalStateException -> L17a
            r5 = r9
            long r5 = r5.captureTimeNs     // Catch: java.lang.IllegalStateException -> L17a
            long r4 = r4.toMicros(r5)     // Catch: java.lang.IllegalStateException -> L17a
            r5 = 0
            r0.queueInputBuffer(r1, r2, r3, r4, r5)     // Catch: java.lang.IllegalStateException -> L17a
            goto L194
        L17a:
            r16 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "queueInputBuffer failed"
            r2 = r16
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = r8
            java.util.concurrent.BlockingDeque<org.webrtc.AndroidVideoDecoder$FrameInfo> r0 = r0.frameInfos
            java.lang.Object r0 = r0.pollLast()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            return r0
        L194:
            r0 = r8
            boolean r0 = r0.keyFrameRequired
            if (r0 == 0) goto L1a0
            r0 = r8
            r1 = 0
            r0.keyFrameRequired = r1
        L1a0:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    @Override // org.webrtc.VideoDecoder
    public java.lang.String getImplementationName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.codecName
            return r0
    }

    @Override // org.webrtc.VideoDecoder
    public org.webrtc.VideoCodecStatus release() {
            r3 = this;
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "release"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            org.webrtc.VideoCodecStatus r0 = r0.releaseInternal()
            r4 = r0
            r0 = r3
            android.view.Surface r0 = r0.surface
            if (r0 == 0) goto L30
            r0 = r3
            r0.releaseSurface()
            r0 = r3
            r1 = 0
            r0.surface = r1
            r0 = r3
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r0.stopListening()
            r0 = r3
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r0.dispose()
            r0 = r3
            r1 = 0
            r0.surfaceTextureHelper = r1
        L30:
            r0 = r3
            java.lang.Object r0 = r0.renderedTextureMetadataLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = 0
            r0.renderedTextureMetadata = r1     // Catch: java.lang.Throwable -> L41
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            goto L46
        L41:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L41
            r0 = r6
            throw r0
        L46:
            r0 = r3
            r1 = 0
            r0.callback = r1
            r0 = r3
            java.util.concurrent.BlockingDeque<org.webrtc.AndroidVideoDecoder$FrameInfo> r0 = r0.frameInfos
            r0.clear()
            r0 = r4
            return r0
    }

    private org.webrtc.VideoCodecStatus releaseInternal() {
            r6 = this;
            r0 = r6
            boolean r0 = r0.running
            if (r0 != 0) goto L13
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "release: Decoder is not running."
            org.webrtc.Logging.d(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
        L13:
            r0 = r6
            r1 = 0
            r0.running = r1     // Catch: java.lang.Throwable -> L80
            r0 = r6
            java.lang.Thread r0 = r0.outputThread     // Catch: java.lang.Throwable -> L80
            r1 = 5000(0x1388, double:2.4703E-320)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r0, r1)     // Catch: java.lang.Throwable -> L80
            if (r0 != 0) goto L44
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "Media decoder release timeout"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L80
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L80
            org.webrtc.Logging.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L80
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.TIMEOUT     // Catch: java.lang.Throwable -> L80
            r7 = r0
            r0 = r6
            r1 = 0
            r0.codec = r1
            r0 = r6
            r1 = 0
            r0.outputThread = r1
            r0 = r7
            return r0
        L44:
            r0 = r6
            java.lang.Exception r0 = r0.shutdownException     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L73
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "Media decoder release error"
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L80
            r3 = r2
            r4 = r6
            java.lang.Exception r4 = r4.shutdownException     // Catch: java.lang.Throwable -> L80
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L80
            org.webrtc.Logging.e(r0, r1, r2)     // Catch: java.lang.Throwable -> L80
            r0 = r6
            r1 = 0
            r0.shutdownException = r1     // Catch: java.lang.Throwable -> L80
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR     // Catch: java.lang.Throwable -> L80
            r7 = r0
            r0 = r6
            r1 = 0
            r0.codec = r1
            r0 = r6
            r1 = 0
            r0.outputThread = r1
            r0 = r7
            return r0
        L73:
            r0 = r6
            r1 = 0
            r0.codec = r1
            r0 = r6
            r1 = 0
            r0.outputThread = r1
            goto L8d
        L80:
            r8 = move-exception
            r0 = r6
            r1 = 0
            r0.codec = r1
            r0 = r6
            r1 = 0
            r0.outputThread = r1
            r0 = r8
            throw r0
        L8d:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
    }

    private org.webrtc.VideoCodecStatus reinitDecode(int r5, int r6) {
            r4 = this;
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.decoderThreadChecker
            r0.checkIsOnValidThread()
            r0 = r4
            org.webrtc.VideoCodecStatus r0 = r0.releaseInternal()
            r7 = r0
            r0 = r7
            org.webrtc.VideoCodecStatus r1 = org.webrtc.VideoCodecStatus.OK
            if (r0 == r1) goto L15
            r0 = r7
            return r0
        L15:
            r0 = r4
            r1 = r5
            r2 = r6
            org.webrtc.VideoCodecStatus r0 = r0.initDecodeInternal(r1, r2)
            return r0
    }

    private java.lang.Thread createOutputThread() {
            r5 = this;
            org.webrtc.AndroidVideoDecoder$1 r0 = new org.webrtc.AndroidVideoDecoder$1
            r1 = r0
            r2 = r5
            java.lang.String r3 = "AndroidVideoDecoder.outputThread"
            r1.<init>(r2, r3)
            return r0
    }

    protected void deliverDecodedFrame() {
            r6 = this;
            r0 = r6
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.checkIsOnValidThread()
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch: java.lang.IllegalStateException -> L92
            r1 = r0
            r1.<init>()     // Catch: java.lang.IllegalStateException -> L92
            r7 = r0
            r0 = r6
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.IllegalStateException -> L92
            r1 = r7
            r2 = 100000(0x186a0, double:4.94066E-319)
            int r0 = r0.dequeueOutputBuffer(r1, r2)     // Catch: java.lang.IllegalStateException -> L92
            r8 = r0
            r0 = r8
            r1 = -2
            if (r0 != r1) goto L31
            r0 = r6
            r1 = r6
            org.webrtc.MediaCodecWrapper r1 = r1.codec     // Catch: java.lang.IllegalStateException -> L92
            android.media.MediaFormat r1 = r1.getOutputFormat()     // Catch: java.lang.IllegalStateException -> L92
            r0.reformat(r1)     // Catch: java.lang.IllegalStateException -> L92
            return
        L31:
            r0 = r8
            if (r0 >= 0) goto L41
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r8
            java.lang.String r1 = "dequeueOutputBuffer returned " + r1     // Catch: java.lang.IllegalStateException -> L92
            org.webrtc.Logging.v(r0, r1)     // Catch: java.lang.IllegalStateException -> L92
            return
        L41:
            r0 = r6
            java.util.concurrent.BlockingDeque<org.webrtc.AndroidVideoDecoder$FrameInfo> r0 = r0.frameInfos     // Catch: java.lang.IllegalStateException -> L92
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.IllegalStateException -> L92
            org.webrtc.AndroidVideoDecoder$FrameInfo r0 = (org.webrtc.AndroidVideoDecoder.FrameInfo) r0     // Catch: java.lang.IllegalStateException -> L92
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = 0
            r11 = r0
            r0 = r9
            if (r0 == 0) goto L6c
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.IllegalStateException -> L92
            r1 = r9
            long r1 = r1.decodeStartTimeMs     // Catch: java.lang.IllegalStateException -> L92
            long r0 = r0 - r1
            int r0 = (int) r0     // Catch: java.lang.IllegalStateException -> L92
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.IllegalStateException -> L92
            r10 = r0
            r0 = r9
            int r0 = r0.rotation     // Catch: java.lang.IllegalStateException -> L92
            r11 = r0
        L6c:
            r0 = r6
            r1 = 1
            r0.hasDecodedFirstFrame = r1     // Catch: java.lang.IllegalStateException -> L92
            r0 = r6
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper     // Catch: java.lang.IllegalStateException -> L92
            if (r0 == 0) goto L85
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = r11
            r4 = r10
            r0.deliverTextureFrame(r1, r2, r3, r4)     // Catch: java.lang.IllegalStateException -> L92
            goto L8f
        L85:
            r0 = r6
            r1 = r8
            r2 = r7
            r3 = r11
            r4 = r10
            r0.deliverByteFrame(r1, r2, r3, r4)     // Catch: java.lang.IllegalStateException -> L92
        L8f:
            goto L9c
        L92:
            r7 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "deliverDecodedFrame failed"
            r2 = r7
            org.webrtc.Logging.e(r0, r1, r2)
        L9c:
            return
    }

    private void deliverTextureFrame(int r8, android.media.MediaCodec.BufferInfo r9, int r10, java.lang.Integer r11) {
            r7 = this;
            r0 = r7
            java.lang.Object r0 = r0.dimensionLock
            r1 = r0
            r14 = r1
            monitor-enter(r0)
            r0 = r7
            int r0 = r0.width     // Catch: java.lang.Throwable -> L1a
            r12 = r0
            r0 = r7
            int r0 = r0.height     // Catch: java.lang.Throwable -> L1a
            r13 = r0
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            goto L22
        L1a:
            r15 = move-exception
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            r0 = r15
            throw r0
        L22:
            r0 = r7
            java.lang.Object r0 = r0.renderedTextureMetadataLock
            r1 = r0
            r14 = r1
            monitor-enter(r0)
            r0 = r7
            org.webrtc.AndroidVideoDecoder$DecodedTextureMetadata r0 = r0.renderedTextureMetadata     // Catch: java.lang.Throwable -> L75
            if (r0 == 0) goto L40
            r0 = r7
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Throwable -> L75
            r1 = r8
            r2 = 0
            r0.releaseOutputBuffer(r1, r2)     // Catch: java.lang.Throwable -> L75
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            return
        L40:
            r0 = r7
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper     // Catch: java.lang.Throwable -> L75
            r1 = r12
            r2 = r13
            r0.setTextureSize(r1, r2)     // Catch: java.lang.Throwable -> L75
            r0 = r7
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper     // Catch: java.lang.Throwable -> L75
            r1 = r10
            r0.setFrameRotation(r1)     // Catch: java.lang.Throwable -> L75
            r0 = r7
            org.webrtc.AndroidVideoDecoder$DecodedTextureMetadata r1 = new org.webrtc.AndroidVideoDecoder$DecodedTextureMetadata     // Catch: java.lang.Throwable -> L75
            r2 = r1
            r3 = r9
            long r3 = r3.presentationTimeUs     // Catch: java.lang.Throwable -> L75
            r4 = r11
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L75
            r0.renderedTextureMetadata = r1     // Catch: java.lang.Throwable -> L75
            r0 = r7
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Throwable -> L75
            r1 = r8
            r2 = 1
            r0.releaseOutputBuffer(r1, r2)     // Catch: java.lang.Throwable -> L75
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            goto L7d
        L75:
            r16 = move-exception
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L75
            r0 = r16
            throw r0
        L7d:
            return
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame r8) {
            r7 = this;
            r0 = r7
            java.lang.Object r0 = r0.renderedTextureMetadataLock
            r1 = r0
            r13 = r1
            monitor-enter(r0)
            r0 = r7
            org.webrtc.AndroidVideoDecoder$DecodedTextureMetadata r0 = r0.renderedTextureMetadata     // Catch: java.lang.Throwable -> L3a
            if (r0 != 0) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            r1 = r0
            java.lang.String r2 = "Rendered texture metadata was null in onTextureFrameAvailable."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3a
            throw r0     // Catch: java.lang.Throwable -> L3a
        L1a:
            r0 = r7
            org.webrtc.AndroidVideoDecoder$DecodedTextureMetadata r0 = r0.renderedTextureMetadata     // Catch: java.lang.Throwable -> L3a
            long r0 = r0.presentationTimestampUs     // Catch: java.lang.Throwable -> L3a
            r1 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r1
            r11 = r0
            r0 = r7
            org.webrtc.AndroidVideoDecoder$DecodedTextureMetadata r0 = r0.renderedTextureMetadata     // Catch: java.lang.Throwable -> L3a
            java.lang.Integer r0 = r0.decodeTimeMs     // Catch: java.lang.Throwable -> L3a
            r10 = r0
            r0 = r7
            r1 = 0
            r0.renderedTextureMetadata = r1     // Catch: java.lang.Throwable -> L3a
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            goto L42
        L3a:
            r14 = move-exception
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            r0 = r14
            throw r0
        L42:
            org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame
            r1 = r0
            r2 = r8
            org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()
            r3 = r8
            int r3 = r3.getRotation()
            r4 = r11
            r1.<init>(r2, r3, r4)
            r13 = r0
            r0 = r7
            org.webrtc.VideoDecoder$Callback r0 = r0.callback
            r1 = r13
            r2 = r10
            r3 = 0
            r0.onDecodedFrame(r1, r2, r3)
            return
    }

    private void deliverByteFrame(int r8, android.media.MediaCodec.BufferInfo r9, int r10, java.lang.Integer r11) {
            r7 = this;
            r0 = r7
            java.lang.Object r0 = r0.dimensionLock
            r1 = r0
            r16 = r1
            monitor-enter(r0)
            r0 = r7
            int r0 = r0.width     // Catch: java.lang.Throwable -> L26
            r12 = r0
            r0 = r7
            int r0 = r0.height     // Catch: java.lang.Throwable -> L26
            r13 = r0
            r0 = r7
            int r0 = r0.stride     // Catch: java.lang.Throwable -> L26
            r14 = r0
            r0 = r7
            int r0 = r0.sliceHeight     // Catch: java.lang.Throwable -> L26
            r15 = r0
            r0 = r16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            goto L2e
        L26:
            r17 = move-exception
            r0 = r16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            r0 = r17
            throw r0
        L2e:
            r0 = r9
            int r0 = r0.size
            r1 = r12
            r2 = r13
            int r1 = r1 * r2
            r2 = 3
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 / r2
            if (r0 >= r1) goto L4d
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r9
            int r1 = r1.size
            java.lang.String r1 = "Insufficient output buffer size: " + r1
            org.webrtc.Logging.e(r0, r1)
            return
        L4d:
            r0 = r9
            int r0 = r0.size
            r1 = r14
            r2 = r13
            int r1 = r1 * r2
            r2 = 3
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 / r2
            if (r0 >= r1) goto L78
            r0 = r15
            r1 = r13
            if (r0 != r1) goto L78
            r0 = r14
            r1 = r12
            if (r0 <= r1) goto L78
            r0 = r9
            int r0 = r0.size
            r1 = 2
            int r0 = r0 * r1
            r1 = r13
            r2 = 3
            int r1 = r1 * r2
            int r0 = r0 / r1
            r14 = r0
        L78:
            r0 = r7
            org.webrtc.MediaCodecWrapper r0 = r0.codec
            r1 = r8
            java.nio.ByteBuffer r0 = r0.getOutputBuffer(r1)
            r16 = r0
            r0 = r16
            r1 = r9
            int r1 = r1.offset
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r16
            r1 = r9
            int r1 = r1.offset
            r2 = r9
            int r2 = r2.size
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r16
            java.nio.ByteBuffer r0 = r0.slice()
            r16 = r0
            r0 = r7
            int r0 = r0.colorFormat
            r1 = 19
            if (r0 != r1) goto Lc0
            r0 = r7
            r1 = r16
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r13
            org.webrtc.VideoFrame$Buffer r0 = r0.copyI420Buffer(r1, r2, r3, r4, r5)
            r17 = r0
            goto Ld0
        Lc0:
            r0 = r7
            r1 = r16
            r2 = r14
            r3 = r15
            r4 = r12
            r5 = r13
            org.webrtc.VideoFrame$Buffer r0 = r0.copyNV12ToI420Buffer(r1, r2, r3, r4, r5)
            r17 = r0
        Ld0:
            r0 = r7
            org.webrtc.MediaCodecWrapper r0 = r0.codec
            r1 = r8
            r2 = 0
            r0.releaseOutputBuffer(r1, r2)
            r0 = r9
            long r0 = r0.presentationTimeUs
            r1 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r1
            r18 = r0
            org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame
            r1 = r0
            r2 = r17
            r3 = r10
            r4 = r18
            r1.<init>(r2, r3, r4)
            r20 = r0
            r0 = r7
            org.webrtc.VideoDecoder$Callback r0 = r0.callback
            r1 = r20
            r2 = r11
            r3 = 0
            r0.onDecodedFrame(r1, r2, r3)
            r0 = r20
            r0.release()
            return
    }

    private org.webrtc.VideoFrame.Buffer copyNV12ToI420Buffer(java.nio.ByteBuffer r10, int r11, int r12, int r13, int r14) {
            r9 = this;
            org.webrtc.NV12Buffer r0 = new org.webrtc.NV12Buffer
            r1 = r0
            r2 = r13
            r3 = r14
            r4 = r11
            r5 = r12
            r6 = r10
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            org.webrtc.VideoFrame$I420Buffer r0 = r0.toI420()
            return r0
    }

    private org.webrtc.VideoFrame.Buffer copyI420Buffer(java.nio.ByteBuffer r9, int r10, int r11, int r12, int r13) {
            r8 = this;
            r0 = r10
            r1 = 2
            int r0 = r0 % r1
            if (r0 == 0) goto L14
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r0
            r2 = r10
            java.lang.String r2 = "Stride is not divisible by two: " + r2
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r12
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r14 = r0
            r0 = r11
            r1 = 2
            int r0 = r0 % r1
            if (r0 != 0) goto L2b
            r0 = r13
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            goto L2f
        L2b:
            r0 = r13
            r1 = 2
            int r0 = r0 / r1
        L2f:
            r15 = r0
            r0 = r10
            r1 = 2
            int r0 = r0 / r1
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = 0
            r1 = r10
            r2 = r13
            int r1 = r1 * r2
            int r0 = r0 + r1
            r18 = r0
            r0 = 0
            r1 = r10
            r2 = r11
            int r1 = r1 * r2
            int r0 = r0 + r1
            r19 = r0
            r0 = r19
            r1 = r16
            r2 = r15
            int r1 = r1 * r2
            int r0 = r0 + r1
            r20 = r0
            r0 = r19
            r1 = r16
            r2 = r11
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 / r2
            int r0 = r0 + r1
            r21 = r0
            r0 = r21
            r1 = r16
            r2 = r15
            int r1 = r1 * r2
            int r0 = r0 + r1
            r22 = r0
            r0 = r8
            r1 = r12
            r2 = r13
            org.webrtc.VideoFrame$I420Buffer r0 = r0.allocateI420Buffer(r1, r2)
            r23 = r0
            r0 = r9
            r1 = r18
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r9
            r1 = 0
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r8
            r1 = r9
            java.nio.ByteBuffer r1 = r1.slice()
            r2 = r10
            r3 = r23
            java.nio.ByteBuffer r3 = r3.getDataY()
            r4 = r23
            int r4 = r4.getStrideY()
            r5 = r12
            r6 = r13
            r0.copyPlane(r1, r2, r3, r4, r5, r6)
            r0 = r9
            r1 = r20
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r9
            r1 = r19
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r8
            r1 = r9
            java.nio.ByteBuffer r1 = r1.slice()
            r2 = r16
            r3 = r23
            java.nio.ByteBuffer r3 = r3.getDataU()
            r4 = r23
            int r4 = r4.getStrideU()
            r5 = r14
            r6 = r15
            r0.copyPlane(r1, r2, r3, r4, r5, r6)
            r0 = r11
            r1 = 2
            int r0 = r0 % r1
            r1 = 1
            if (r0 != r1) goto Lf9
            r0 = r9
            r1 = r19
            r2 = r16
            r3 = r15
            r4 = 1
            int r3 = r3 - r4
            int r2 = r2 * r3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r23
            java.nio.ByteBuffer r0 = r0.getDataU()
            r24 = r0
            r0 = r24
            r1 = r23
            int r1 = r1.getStrideU()
            r2 = r15
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r24
            r1 = r9
            java.nio.ByteBuffer r0 = r0.put(r1)
        Lf9:
            r0 = r9
            r1 = r22
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r9
            r1 = r21
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r8
            r1 = r9
            java.nio.ByteBuffer r1 = r1.slice()
            r2 = r16
            r3 = r23
            java.nio.ByteBuffer r3 = r3.getDataV()
            r4 = r23
            int r4 = r4.getStrideV()
            r5 = r14
            r6 = r15
            r0.copyPlane(r1, r2, r3, r4, r5, r6)
            r0 = r11
            r1 = 2
            int r0 = r0 % r1
            r1 = 1
            if (r0 != r1) goto L159
            r0 = r9
            r1 = r21
            r2 = r16
            r3 = r15
            r4 = 1
            int r3 = r3 - r4
            int r2 = r2 * r3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r23
            java.nio.ByteBuffer r0 = r0.getDataV()
            r24 = r0
            r0 = r24
            r1 = r23
            int r1 = r1.getStrideV()
            r2 = r15
            int r1 = r1 * r2
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r24
            r1 = r9
            java.nio.ByteBuffer r0 = r0.put(r1)
        L159:
            r0 = r23
            return r0
    }

    private void reformat(android.media.MediaFormat r9) {
            r8 = this;
            r0 = r8
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r9
            java.lang.String r1 = "Decoder format changed: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r9
            java.lang.String r1 = "crop-left"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L61
            r0 = r9
            java.lang.String r1 = "crop-right"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L61
            r0 = r9
            java.lang.String r1 = "crop-bottom"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L61
            r0 = r9
            java.lang.String r1 = "crop-top"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L61
            r0 = 1
            r1 = r9
            java.lang.String r2 = "crop-right"
            int r1 = r1.getInteger(r2)
            int r0 = r0 + r1
            r1 = r9
            java.lang.String r2 = "crop-left"
            int r1 = r1.getInteger(r2)
            int r0 = r0 - r1
            r10 = r0
            r0 = 1
            r1 = r9
            java.lang.String r2 = "crop-bottom"
            int r1 = r1.getInteger(r2)
            int r0 = r0 + r1
            r1 = r9
            java.lang.String r2 = "crop-top"
            int r1 = r1.getInteger(r2)
            int r0 = r0 - r1
            r11 = r0
            goto L71
        L61:
            r0 = r9
            java.lang.String r1 = "width"
            int r0 = r0.getInteger(r1)
            r10 = r0
            r0 = r9
            java.lang.String r1 = "height"
            int r0 = r0.getInteger(r1)
            r11 = r0
        L71:
            r0 = r8
            java.lang.Object r0 = r0.dimensionLock
            r1 = r0
            r12 = r1
            monitor-enter(r0)
            r0 = r10
            r1 = r8
            int r1 = r1.width     // Catch: java.lang.Throwable -> Lde
            if (r0 != r1) goto L89
            r0 = r11
            r1 = r8
            int r1 = r1.height     // Catch: java.lang.Throwable -> Lde
            if (r0 == r1) goto Ld8
        L89:
            r0 = r8
            boolean r0 = r0.hasDecodedFirstFrame     // Catch: java.lang.Throwable -> Lde
            if (r0 == 0) goto Lae
            r0 = r8
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> Lde
            r2 = r1
            r3 = r8
            int r3 = r3.width     // Catch: java.lang.Throwable -> Lde
            r4 = r8
            int r4 = r4.height     // Catch: java.lang.Throwable -> Lde
            r5 = r10
            r6 = r11
            java.lang.String r3 = "Unexpected size change. Configured " + r3 + "*" + r4 + ". New " + r5 + "*" + r6     // Catch: java.lang.Throwable -> Lde
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lde
            r0.stopOnOutputThread(r1)     // Catch: java.lang.Throwable -> Lde
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lde
            return
        Lae:
            r0 = r10
            if (r0 <= 0) goto Lb6
            r0 = r11
            if (r0 > 0) goto Lce
        Lb6:
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r8
            int r1 = r1.width     // Catch: java.lang.Throwable -> Lde
            r2 = r8
            int r2 = r2.height     // Catch: java.lang.Throwable -> Lde
            r3 = r10
            r4 = r11
            java.lang.String r1 = "Unexpected format dimensions. Configured " + r1 + "*" + r2 + ". New " + r3 + "*" + r4 + ". Skip it"     // Catch: java.lang.Throwable -> Lde
            org.webrtc.Logging.w(r0, r1)     // Catch: java.lang.Throwable -> Lde
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lde
            return
        Lce:
            r0 = r8
            r1 = r10
            r0.width = r1     // Catch: java.lang.Throwable -> Lde
            r0 = r8
            r1 = r11
            r0.height = r1     // Catch: java.lang.Throwable -> Lde
        Ld8:
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lde
            goto Le6
        Lde:
            r13 = move-exception
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lde
            r0 = r13
            throw r0
        Le6:
            r0 = r8
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            if (r0 != 0) goto L131
            r0 = r9
            java.lang.String r1 = "color-format"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L131
            r0 = r8
            r1 = r9
            java.lang.String r2 = "color-format"
            int r1 = r1.getInteger(r2)
            r0.colorFormat = r1
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r8
            int r1 = r1.colorFormat
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            java.lang.String r1 = "Color: 0x" + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r8
            r1 = r8
            int r1 = r1.colorFormat
            boolean r0 = r0.isSupportedColorFormat(r1)
            if (r0 != 0) goto L131
            r0 = r8
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r2 = r1
            r3 = r8
            int r3 = r3.colorFormat
            java.lang.String r3 = "Unsupported color format: " + r3
            r2.<init>(r3)
            r0.stopOnOutputThread(r1)
            return
        L131:
            r0 = r8
            java.lang.Object r0 = r0.dimensionLock
            r1 = r0
            r12 = r1
            monitor-enter(r0)
            r0 = r9
            java.lang.String r1 = "stride"
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L199
            if (r0 == 0) goto L14e
            r0 = r8
            r1 = r9
            java.lang.String r2 = "stride"
            int r1 = r1.getInteger(r2)     // Catch: java.lang.Throwable -> L199
            r0.stride = r1     // Catch: java.lang.Throwable -> L199
        L14e:
            r0 = r9
            java.lang.String r1 = "slice-height"
            boolean r0 = r0.containsKey(r1)     // Catch: java.lang.Throwable -> L199
            if (r0 == 0) goto L163
            r0 = r8
            r1 = r9
            java.lang.String r2 = "slice-height"
            int r1 = r1.getInteger(r2)     // Catch: java.lang.Throwable -> L199
            r0.sliceHeight = r1     // Catch: java.lang.Throwable -> L199
        L163:
            java.lang.String r0 = "AndroidVideoDecoder"
            r1 = r8
            int r1 = r1.stride     // Catch: java.lang.Throwable -> L199
            r2 = r8
            int r2 = r2.sliceHeight     // Catch: java.lang.Throwable -> L199
            java.lang.String r1 = "Frame stride and slice height: " + r1 + " x " + r2     // Catch: java.lang.Throwable -> L199
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L199
            r0 = r8
            r1 = r8
            int r1 = r1.width     // Catch: java.lang.Throwable -> L199
            r2 = r8
            int r2 = r2.stride     // Catch: java.lang.Throwable -> L199
            int r1 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> L199
            r0.stride = r1     // Catch: java.lang.Throwable -> L199
            r0 = r8
            r1 = r8
            int r1 = r1.height     // Catch: java.lang.Throwable -> L199
            r2 = r8
            int r2 = r2.sliceHeight     // Catch: java.lang.Throwable -> L199
            int r1 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> L199
            r0.sliceHeight = r1     // Catch: java.lang.Throwable -> L199
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L199
            goto L1a1
        L199:
            r14 = move-exception
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L199
            r0 = r14
            throw r0
        L1a1:
            return
    }

    private void releaseCodecOnOutputThread() {
            r4 = this;
            r0 = r4
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "Releasing MediaCodec on output thread"
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Exception -> L1b
            r0.stop()     // Catch: java.lang.Exception -> L1b
            goto L25
        L1b:
            r5 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "Media decoder stop failed"
            r2 = r5
            org.webrtc.Logging.e(r0, r1, r2)
        L25:
            r0 = r4
            org.webrtc.MediaCodecWrapper r0 = r0.codec     // Catch: java.lang.Exception -> L31
            r0.release()     // Catch: java.lang.Exception -> L31
            goto L40
        L31:
            r5 = move-exception
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "Media decoder release failed"
            r2 = r5
            org.webrtc.Logging.e(r0, r1, r2)
            r0 = r4
            r1 = r5
            r0.shutdownException = r1
        L40:
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.String r1 = "Release on output thread done"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private void stopOnOutputThread(java.lang.Exception r4) {
            r3 = this;
            r0 = r3
            org.webrtc.ThreadUtils$ThreadChecker r0 = r0.outputThreadChecker
            r0.checkIsOnValidThread()
            r0 = r3
            r1 = 0
            r0.running = r1
            r0 = r3
            r1 = r4
            r0.shutdownException = r1
            return
    }

    private boolean isSupportedColorFormat(int r4) {
            r3 = this;
            int[] r0 = org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        La:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L24
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            r1 = r4
            if (r0 != r1) goto L1e
            r0 = 1
            return r0
        L1e:
            int r7 = r7 + 1
            goto La
        L24:
            r0 = 0
            return r0
    }

    protected org.webrtc.SurfaceTextureHelper createSurfaceTextureHelper() {
            r3 = this;
            java.lang.String r0 = "decoder-texture-thread"
            r1 = r3
            org.webrtc.EglBase$Context r1 = r1.sharedContext
            org.webrtc.SurfaceTextureHelper r0 = org.webrtc.SurfaceTextureHelper.create(r0, r1)
            return r0
    }

    protected void releaseSurface() {
            r2 = this;
            r0 = r2
            android.view.Surface r0 = r0.surface
            r0.release()
            return
    }

    protected org.webrtc.VideoFrame.I420Buffer allocateI420Buffer(int r4, int r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            org.webrtc.JavaI420Buffer r0 = org.webrtc.JavaI420Buffer.allocate(r0, r1)
            return r0
    }

    protected void copyPlane(java.nio.ByteBuffer r8, int r9, java.nio.ByteBuffer r10, int r11, int r12, int r13) {
            r7 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.webrtc.YuvHelper.copyPlane(r0, r1, r2, r3, r4, r5)
            return
    }
}
