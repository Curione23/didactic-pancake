package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera1Session.class */
class Camera1Session implements org.webrtc.CameraSession {
    private static final java.lang.String TAG = "Camera1Session";
    private static final int NUMBER_OF_CAPTURE_BUFFERS = 3;
    private static final org.webrtc.Histogram camera1StartTimeMsHistogram = null;
    private static final org.webrtc.Histogram camera1StopTimeMsHistogram = null;
    private static final org.webrtc.Histogram camera1ResolutionHistogram = null;
    private final android.os.Handler cameraThreadHandler;
    private final org.webrtc.CameraSession.Events events;
    private final boolean captureToTexture;
    private final android.content.Context applicationContext;
    private final org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
    private final int cameraId;
    private final android.hardware.Camera camera;
    private final android.hardware.Camera.CameraInfo info;
    private final org.webrtc.CameraEnumerationAndroid.CaptureFormat captureFormat;
    private final long constructionTimeNs;
    private org.webrtc.Camera1Session.SessionState state;
    private boolean firstFrameReported;



    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera1Session$SessionState.class */
    private enum SessionState extends java.lang.Enum<org.webrtc.Camera1Session.SessionState> {
        public static final org.webrtc.Camera1Session.SessionState RUNNING = null;
        public static final org.webrtc.Camera1Session.SessionState STOPPED = null;
        private static final /* synthetic */ org.webrtc.Camera1Session.SessionState[] $VALUES = null;

        public static org.webrtc.Camera1Session.SessionState[] values() {
                org.webrtc.Camera1Session$SessionState[] r0 = org.webrtc.Camera1Session.SessionState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.Camera1Session$SessionState[] r0 = (org.webrtc.Camera1Session.SessionState[]) r0
                return r0
        }

        public static org.webrtc.Camera1Session.SessionState valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.Camera1Session$SessionState> r0 = org.webrtc.Camera1Session.SessionState.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.Camera1Session$SessionState r0 = (org.webrtc.Camera1Session.SessionState) r0
                return r0
        }

        SessionState(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.Camera1Session.SessionState[] $values() {
                r0 = 2
                org.webrtc.Camera1Session$SessionState[] r0 = new org.webrtc.Camera1Session.SessionState[r0]
                r1 = r0
                r2 = 0
                org.webrtc.Camera1Session$SessionState r3 = org.webrtc.Camera1Session.SessionState.RUNNING
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.Camera1Session$SessionState r3 = org.webrtc.Camera1Session.SessionState.STOPPED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.Camera1Session$SessionState r0 = new org.webrtc.Camera1Session$SessionState
                r1 = r0
                java.lang.String r2 = "RUNNING"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.Camera1Session.SessionState.RUNNING = r0
                org.webrtc.Camera1Session$SessionState r0 = new org.webrtc.Camera1Session$SessionState
                r1 = r0
                java.lang.String r2 = "STOPPED"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.Camera1Session.SessionState.STOPPED = r0
                org.webrtc.Camera1Session$SessionState[] r0 = $values()
                org.webrtc.Camera1Session.SessionState.$VALUES = r0
                return
        }
    }

    public static void create(org.webrtc.CameraSession.CreateSessionCallback r14, org.webrtc.CameraSession.Events r15, boolean r16, android.content.Context r17, org.webrtc.SurfaceTextureHelper r18, java.lang.String r19, int r20, int r21, int r22) {
            long r0 = java.lang.System.nanoTime()
            r23 = r0
            java.lang.String r0 = "Camera1Session"
            r1 = r19
            java.lang.String r1 = "Open camera " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r15
            r0.onCameraOpening()
            r0 = r19
            int r0 = org.webrtc.Camera1Enumerator.getCameraIndex(r0)     // Catch: java.lang.IllegalArgumentException -> L21
            r25 = r0
            goto L32
        L21:
            r26 = move-exception
            r0 = r14
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            r2 = r26
            java.lang.String r2 = r2.getMessage()
            r0.onFailure(r1, r2)
            return
        L32:
            r0 = r25
            android.hardware.Camera r0 = android.hardware.Camera.open(r0)     // Catch: java.lang.RuntimeException -> L3c
            r26 = r0
            goto L4d
        L3c:
            r27 = move-exception
            r0 = r14
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            r2 = r27
            java.lang.String r2 = r2.getMessage()
            r0.onFailure(r1, r2)
            return
        L4d:
            r0 = r26
            if (r0 != 0) goto L63
            r0 = r14
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            r2 = r25
            java.lang.String r2 = "Camera.open returned null for camera id = " + r2
            r0.onFailure(r1, r2)
            return
        L63:
            r0 = r26
            r1 = r18
            android.graphics.SurfaceTexture r1 = r1.getSurfaceTexture()     // Catch: java.lang.Throwable -> L70
            r0.setPreviewTexture(r1)     // Catch: java.lang.Throwable -> L70
            goto L86
        L70:
            r27 = move-exception
            r0 = r26
            r0.release()
            r0 = r14
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            r2 = r27
            java.lang.String r2 = r2.getMessage()
            r0.onFailure(r1, r2)
            return
        L86:
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r1 = r0
            r1.<init>()
            r27 = r0
            r0 = r25
            r1 = r27
            android.hardware.Camera.getCameraInfo(r0, r1)
            r0 = r26
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.RuntimeException -> Lc4
            r29 = r0
            r0 = r29
            r1 = r20
            r2 = r21
            r3 = r22
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r0 = findClosestCaptureFormat(r0, r1, r2, r3)     // Catch: java.lang.RuntimeException -> Lc4
            r28 = r0
            r0 = r29
            r1 = r20
            r2 = r21
            org.webrtc.Size r0 = findClosestPictureSize(r0, r1, r2)     // Catch: java.lang.RuntimeException -> Lc4
            r30 = r0
            r0 = r26
            r1 = r29
            r2 = r28
            r3 = r30
            r4 = r16
            updateCameraParameters(r0, r1, r2, r3, r4)     // Catch: java.lang.RuntimeException -> Lc4
            goto Lda
        Lc4:
            r29 = move-exception
            r0 = r26
            r0.release()
            r0 = r14
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            r2 = r29
            java.lang.String r2 = r2.getMessage()
            r0.onFailure(r1, r2)
            return
        Lda:
            r0 = r16
            if (r0 != 0) goto L105
            r0 = r28
            int r0 = r0.frameSize()
            r29 = r0
            r0 = 0
            r30 = r0
        Le8:
            r0 = r30
            r1 = 3
            if (r0 >= r1) goto L105
            r0 = r29
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r31 = r0
            r0 = r26
            r1 = r31
            byte[] r1 = r1.array()
            r0.addCallbackBuffer(r1)
            int r30 = r30 + 1
            goto Le8
        L105:
            r0 = r26
            r1 = 0
            r0.setDisplayOrientation(r1)     // Catch: java.lang.RuntimeException -> L10e
            goto L124
        L10e:
            r29 = move-exception
            r0 = r26
            r0.release()
            r0 = r14
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            r2 = r29
            java.lang.String r2 = r2.getMessage()
            r0.onFailure(r1, r2)
            return
        L124:
            r0 = r14
            org.webrtc.Camera1Session r1 = new org.webrtc.Camera1Session
            r2 = r1
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r0.onDone(r1)
            return
    }

    private static void updateCameraParameters(android.hardware.Camera r4, android.hardware.Camera.Parameters r5, org.webrtc.CameraEnumerationAndroid.CaptureFormat r6, org.webrtc.Size r7, boolean r8) {
            r0 = r5
            java.util.List r0 = r0.getSupportedFocusModes()
            r9 = r0
            r0 = r5
            r1 = r6
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r1 = r1.framerate
            int r1 = r1.min
            r2 = r6
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r2 = r2.framerate
            int r2 = r2.max
            r0.setPreviewFpsRange(r1, r2)
            r0 = r5
            r1 = r6
            int r1 = r1.width
            r2 = r6
            int r2 = r2.height
            r0.setPreviewSize(r1, r2)
            r0 = r5
            r1 = r7
            int r1 = r1.width
            r2 = r7
            int r2 = r2.height
            r0.setPictureSize(r1, r2)
            r0 = r8
            if (r0 != 0) goto L40
            r0 = r5
            r1 = r6
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            r1 = 17
            r0.setPreviewFormat(r1)
        L40:
            r0 = r5
            boolean r0 = r0.isVideoStabilizationSupported()
            if (r0 == 0) goto L4c
            r0 = r5
            r1 = 1
            r0.setVideoStabilization(r1)
        L4c:
            r0 = r9
            if (r0 == 0) goto L63
            r0 = r9
            java.lang.String r1 = "continuous-video"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L63
            r0 = r5
            java.lang.String r1 = "continuous-video"
            r0.setFocusMode(r1)
        L63:
            r0 = r4
            r1 = r5
            r0.setParameters(r1)
            return
    }

    private static org.webrtc.CameraEnumerationAndroid.CaptureFormat findClosestCaptureFormat(android.hardware.Camera.Parameters r6, int r7, int r8, int r9) {
            r0 = r6
            java.util.List r0 = r0.getSupportedPreviewFpsRange()
            java.util.List r0 = org.webrtc.Camera1Enumerator.convertFramerates(r0)
            r10 = r0
            java.lang.String r0 = "Camera1Session"
            r1 = r10
            java.lang.String r1 = "Available fps ranges: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r10
            r1 = r9
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r0 = org.webrtc.CameraEnumerationAndroid.getClosestSupportedFramerateRange(r0, r1)
            r11 = r0
            r0 = r6
            java.util.List r0 = r0.getSupportedPreviewSizes()
            java.util.List r0 = org.webrtc.Camera1Enumerator.convertSizes(r0)
            r1 = r7
            r2 = r8
            org.webrtc.Size r0 = org.webrtc.CameraEnumerationAndroid.getClosestSupportedSize(r0, r1, r2)
            r12 = r0
            org.webrtc.Histogram r0 = org.webrtc.Camera1Session.camera1ResolutionHistogram
            r1 = r12
            org.webrtc.CameraEnumerationAndroid.reportCameraResolution(r0, r1)
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r0 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat
            r1 = r0
            r2 = r12
            int r2 = r2.width
            r3 = r12
            int r3 = r3.height
            r4 = r11
            r1.<init>(r2, r3, r4)
            return r0
    }

    private static org.webrtc.Size findClosestPictureSize(android.hardware.Camera.Parameters r4, int r5, int r6) {
            r0 = r4
            java.util.List r0 = r0.getSupportedPictureSizes()
            java.util.List r0 = org.webrtc.Camera1Enumerator.convertSizes(r0)
            r1 = r5
            r2 = r6
            org.webrtc.Size r0 = org.webrtc.CameraEnumerationAndroid.getClosestSupportedSize(r0, r1, r2)
            return r0
    }

    private Camera1Session(org.webrtc.CameraSession.Events r5, boolean r6, android.content.Context r7, org.webrtc.SurfaceTextureHelper r8, int r9, android.hardware.Camera r10, android.hardware.Camera.CameraInfo r11, org.webrtc.CameraEnumerationAndroid.CaptureFormat r12, long r13) {
            r4 = this;
            r0 = r4
            r0.<init>()
            java.lang.String r0 = "Camera1Session"
            r1 = r9
            java.lang.String r1 = "Create new camera1 session on camera " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            android.os.Handler r1 = new android.os.Handler
            r2 = r1
            r2.<init>()
            r0.cameraThreadHandler = r1
            r0 = r4
            r1 = r5
            r0.events = r1
            r0 = r4
            r1 = r6
            r0.captureToTexture = r1
            r0 = r4
            r1 = r7
            r0.applicationContext = r1
            r0 = r4
            r1 = r8
            r0.surfaceTextureHelper = r1
            r0 = r4
            r1 = r9
            r0.cameraId = r1
            r0 = r4
            r1 = r10
            r0.camera = r1
            r0 = r4
            r1 = r11
            r0.info = r1
            r0 = r4
            r1 = r12
            r0.captureFormat = r1
            r0 = r4
            r1 = r13
            r0.constructionTimeNs = r1
            r0 = r8
            r1 = r12
            int r1 = r1.width
            r2 = r12
            int r2 = r2.height
            r0.setTextureSize(r1, r2)
            r0 = r4
            r0.startCapturing()
            return
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
            r6 = this;
            java.lang.String r0 = "Camera1Session"
            r1 = r6
            int r1 = r1.cameraId
            java.lang.String r1 = "Stop camera1 session on camera " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            r0.checkIsOnCameraThread()
            r0 = r6
            org.webrtc.Camera1Session$SessionState r0 = r0.state
            org.webrtc.Camera1Session$SessionState r1 = org.webrtc.Camera1Session.SessionState.STOPPED
            if (r0 == r1) goto L38
            long r0 = java.lang.System.nanoTime()
            r7 = r0
            r0 = r6
            r0.stopInternal()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            r2 = r7
            long r1 = r1 - r2
            long r0 = r0.toMillis(r1)
            int r0 = (int) r0
            r9 = r0
            org.webrtc.Histogram r0 = org.webrtc.Camera1Session.camera1StopTimeMsHistogram
            r1 = r9
            r0.addSample(r1)
        L38:
            return
    }

    private void startCapturing() {
            r5 = this;
            java.lang.String r0 = "Camera1Session"
            java.lang.String r1 = "Start capturing"
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            r0.checkIsOnCameraThread()
            r0 = r5
            org.webrtc.Camera1Session$SessionState r1 = org.webrtc.Camera1Session.SessionState.RUNNING
            r0.state = r1
            r0 = r5
            android.hardware.Camera r0 = r0.camera
            org.webrtc.Camera1Session$1 r1 = new org.webrtc.Camera1Session$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.setErrorCallback(r1)
            r0 = r5
            boolean r0 = r0.captureToTexture
            if (r0 == 0) goto L30
            r0 = r5
            r0.listenForTextureFrames()
            goto L34
        L30:
            r0 = r5
            r0.listenForBytebufferFrames()
        L34:
            r0 = r5
            android.hardware.Camera r0 = r0.camera     // Catch: java.lang.RuntimeException -> L3e
            r0.startPreview()     // Catch: java.lang.RuntimeException -> L3e
            goto L51
        L3e:
            r6 = move-exception
            r0 = r5
            r0.stopInternal()
            r0 = r5
            org.webrtc.CameraSession$Events r0 = r0.events
            r1 = r5
            r2 = r6
            java.lang.String r2 = r2.getMessage()
            r0.onCameraError(r1, r2)
        L51:
            return
    }

    private void stopInternal() {
            r3 = this;
            java.lang.String r0 = "Camera1Session"
            java.lang.String r1 = "Stop internal"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            r0.checkIsOnCameraThread()
            r0 = r3
            org.webrtc.Camera1Session$SessionState r0 = r0.state
            org.webrtc.Camera1Session$SessionState r1 = org.webrtc.Camera1Session.SessionState.STOPPED
            if (r0 != r1) goto L1f
            java.lang.String r0 = "Camera1Session"
            java.lang.String r1 = "Camera is already stopped"
            org.webrtc.Logging.d(r0, r1)
            return
        L1f:
            r0 = r3
            org.webrtc.Camera1Session$SessionState r1 = org.webrtc.Camera1Session.SessionState.STOPPED
            r0.state = r1
            r0 = r3
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r0.stopListening()
            r0 = r3
            android.hardware.Camera r0 = r0.camera
            r0.stopPreview()
            r0 = r3
            android.hardware.Camera r0 = r0.camera
            r0.release()
            r0 = r3
            org.webrtc.CameraSession$Events r0 = r0.events
            r1 = r3
            r0.onCameraClosed(r1)
            java.lang.String r0 = "Camera1Session"
            java.lang.String r1 = "Stop done"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private void listenForTextureFrames() {
            r3 = this;
            r0 = r3
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r1 = r3
            void r1 = (v1) -> { // org.webrtc.VideoSink.onFrame(org.webrtc.VideoFrame):void
                r1.lambda$listenForTextureFrames$0(v1);
            }
            r0.startListening(r1)
            return
    }

    private void listenForBytebufferFrames() {
            r5 = this;
            r0 = r5
            android.hardware.Camera r0 = r0.camera
            org.webrtc.Camera1Session$2 r1 = new org.webrtc.Camera1Session$2
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.setPreviewCallbackWithBuffer(r1)
            return
    }

    private int getFrameOrientation() {
            r3 = this;
            r0 = r3
            android.content.Context r0 = r0.applicationContext
            int r0 = org.webrtc.CameraSession.getDeviceOrientation(r0)
            r4 = r0
            r0 = r3
            android.hardware.Camera$CameraInfo r0 = r0.info
            int r0 = r0.facing
            if (r0 != 0) goto L18
            r0 = 360(0x168, float:5.04E-43)
            r1 = r4
            int r0 = r0 - r1
            r4 = r0
        L18:
            r0 = r3
            android.hardware.Camera$CameraInfo r0 = r0.info
            int r0 = r0.orientation
            r1 = r4
            int r0 = r0 + r1
            r1 = 360(0x168, float:5.04E-43)
            int r0 = r0 % r1
            return r0
    }

    private void checkIsOnCameraThread() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = r4
            android.os.Handler r1 = r1.cameraThreadHandler
            android.os.Looper r1 = r1.getLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 == r1) goto L1b
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Wrong thread"
            r1.<init>(r2)
            throw r0
        L1b:
            return
    }

    private /* synthetic */ void lambda$listenForTextureFrames$0(org.webrtc.VideoFrame r8) {
            r7 = this;
            r0 = r7
            r0.checkIsOnCameraThread()
            r0 = r7
            org.webrtc.Camera1Session$SessionState r0 = r0.state
            org.webrtc.Camera1Session$SessionState r1 = org.webrtc.Camera1Session.SessionState.RUNNING
            if (r0 == r1) goto L17
            java.lang.String r0 = "Camera1Session"
            java.lang.String r1 = "Texture frame captured but camera is no longer running."
            org.webrtc.Logging.d(r0, r1)
            return
        L17:
            r0 = r7
            boolean r0 = r0.firstFrameReported
            if (r0 != 0) goto L3a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            r2 = r7
            long r2 = r2.constructionTimeNs
            long r1 = r1 - r2
            long r0 = r0.toMillis(r1)
            int r0 = (int) r0
            r9 = r0
            org.webrtc.Histogram r0 = org.webrtc.Camera1Session.camera1StartTimeMsHistogram
            r1 = r9
            r0.addSample(r1)
            r0 = r7
            r1 = 1
            r0.firstFrameReported = r1
        L3a:
            org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame
            r1 = r0
            r2 = r8
            org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()
            org.webrtc.TextureBufferImpl r2 = (org.webrtc.TextureBufferImpl) r2
            r3 = r7
            android.hardware.Camera$CameraInfo r3 = r3.info
            int r3 = r3.facing
            r4 = 1
            if (r3 != r4) goto L54
            r3 = 1
            goto L55
        L54:
            r3 = 0
        L55:
            r4 = 0
            org.webrtc.VideoFrame$TextureBuffer r2 = org.webrtc.CameraSession.createTextureBufferWithModifiedTransformMatrix(r2, r3, r4)
            r3 = r7
            int r3 = r3.getFrameOrientation()
            r4 = r8
            long r4 = r4.getTimestampNs()
            r1.<init>(r2, r3, r4)
            r9 = r0
            r0 = r7
            org.webrtc.CameraSession$Events r0 = r0.events
            r1 = r7
            r2 = r9
            r0.onFrameCaptured(r1, r2)
            r0 = r9
            r0.release()
            return
    }

    static {
            java.lang.String r0 = "WebRTC.Android.Camera1.StartTimeMs"
            r1 = 1
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 50
            org.webrtc.Histogram r0 = org.webrtc.Histogram.createCounts(r0, r1, r2, r3)
            org.webrtc.Camera1Session.camera1StartTimeMsHistogram = r0
            java.lang.String r0 = "WebRTC.Android.Camera1.StopTimeMs"
            r1 = 1
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 50
            org.webrtc.Histogram r0 = org.webrtc.Histogram.createCounts(r0, r1, r2, r3)
            org.webrtc.Camera1Session.camera1StopTimeMsHistogram = r0
            java.lang.String r0 = "WebRTC.Android.Camera1.Resolution"
            java.util.ArrayList<org.webrtc.Size> r1 = org.webrtc.CameraEnumerationAndroid.COMMON_RESOLUTIONS
            int r1 = r1.size()
            org.webrtc.Histogram r0 = org.webrtc.Histogram.createEnumeration(r0, r1)
            org.webrtc.Camera1Session.camera1ResolutionHistogram = r0
            return
    }
}
