package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera2Session.class */
class Camera2Session implements org.webrtc.CameraSession {
    private static final java.lang.String TAG = "Camera2Session";
    private static final org.webrtc.Histogram camera2StartTimeMsHistogram = null;
    private static final org.webrtc.Histogram camera2StopTimeMsHistogram = null;
    private static final org.webrtc.Histogram camera2ResolutionHistogram = null;
    private final android.os.Handler cameraThreadHandler;
    private final org.webrtc.CameraSession.CreateSessionCallback callback;
    private final org.webrtc.CameraSession.Events events;
    private final android.content.Context applicationContext;
    private final android.hardware.camera2.CameraManager cameraManager;
    private final org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
    private final java.lang.String cameraId;
    private final int width;
    private final int height;
    private final int framerate;
    private android.hardware.camera2.CameraCharacteristics cameraCharacteristics;
    private int cameraOrientation;
    private boolean isCameraFrontFacing;
    private int fpsUnitFactor;
    private org.webrtc.CameraEnumerationAndroid.CaptureFormat captureFormat;

    @androidx.annotation.Nullable
    private android.hardware.camera2.CameraDevice cameraDevice;

    @androidx.annotation.Nullable
    private android.view.Surface surface;

    @androidx.annotation.Nullable
    private android.hardware.camera2.CameraCaptureSession captureSession;
    private org.webrtc.Camera2Session.SessionState state;
    private boolean firstFrameReported;
    private final long constructionTimeNs;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera2Session$CameraCaptureCallback.class */
    private static class CameraCaptureCallback extends android.hardware.camera2.CameraCaptureSession.CaptureCallback {
        private CameraCaptureCallback() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureFailed(android.hardware.camera2.CameraCaptureSession r4, android.hardware.camera2.CaptureRequest r5, android.hardware.camera2.CaptureFailure r6) {
                r3 = this;
                java.lang.String r0 = "Camera2Session"
                r1 = r6
                java.lang.String r1 = "Capture failed: " + r1
                org.webrtc.Logging.d(r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera2Session$CameraStateCallback.class */
    private class CameraStateCallback extends android.hardware.camera2.CameraDevice.StateCallback {
        final /* synthetic */ org.webrtc.Camera2Session this$0;

        private CameraStateCallback(org.webrtc.Camera2Session r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        private java.lang.String getErrorDescription(int r3) {
                r2 = this;
                r0 = r3
                switch(r0) {
                    case 1: goto L2a;
                    case 2: goto L30;
                    case 3: goto L27;
                    case 4: goto L24;
                    case 5: goto L2d;
                    default: goto L33;
                }
            L24:
                java.lang.String r0 = "Camera device has encountered a fatal error."
                return r0
            L27:
                java.lang.String r0 = "Camera device could not be opened due to a device policy."
                return r0
            L2a:
                java.lang.String r0 = "Camera device is in use already."
                return r0
            L2d:
                java.lang.String r0 = "Camera service has encountered a fatal error."
                return r0
            L30:
                java.lang.String r0 = "Camera device could not be opened because there are too many other open camera devices."
                return r0
            L33:
                r0 = r3
                java.lang.String r0 = "Unknown camera error: " + r0
                return r0
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(android.hardware.camera2.CameraDevice r5) {
                r4 = this;
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.checkIsOnCameraThread()
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                android.hardware.camera2.CameraCaptureSession r0 = r0.captureSession
                if (r0 != 0) goto L22
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.Camera2Session$SessionState r0 = r0.state
                org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.STOPPED
                if (r0 == r1) goto L22
                r0 = 1
                goto L23
            L22:
                r0 = 0
            L23:
                r6 = r0
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.STOPPED
                r0.state = r1
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.stopInternal()
                r0 = r6
                if (r0 == 0) goto L4d
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.CameraSession$CreateSessionCallback r0 = r0.callback
                org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.DISCONNECTED
                java.lang.String r2 = "Camera disconnected / evicted."
                r0.onFailure(r1, r2)
                goto L5d
            L4d:
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.CameraSession$Events r0 = r0.events
                r1 = r4
                org.webrtc.Camera2Session r1 = r1.this$0
                r0.onCameraDisconnected(r1)
            L5d:
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(android.hardware.camera2.CameraDevice r5, int r6) {
                r4 = this;
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.checkIsOnCameraThread()
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                r1 = r4
                r2 = r6
                java.lang.String r1 = r1.getErrorDescription(r2)
                r0.reportError(r1)
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(android.hardware.camera2.CameraDevice r7) {
                r6 = this;
                r0 = r6
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.checkIsOnCameraThread()
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Camera opened."
                org.webrtc.Logging.d(r0, r1)
                r0 = r6
                org.webrtc.Camera2Session r0 = r0.this$0
                r1 = r7
                r0.cameraDevice = r1
                r0 = r6
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
                r1 = r6
                org.webrtc.Camera2Session r1 = r1.this$0
                org.webrtc.CameraEnumerationAndroid$CaptureFormat r1 = r1.captureFormat
                int r1 = r1.width
                r2 = r6
                org.webrtc.Camera2Session r2 = r2.this$0
                org.webrtc.CameraEnumerationAndroid$CaptureFormat r2 = r2.captureFormat
                int r2 = r2.height
                r0.setTextureSize(r1, r2)
                r0 = r6
                org.webrtc.Camera2Session r0 = r0.this$0
                android.view.Surface r1 = new android.view.Surface
                r2 = r1
                r3 = r6
                org.webrtc.Camera2Session r3 = r3.this$0
                org.webrtc.SurfaceTextureHelper r3 = r3.surfaceTextureHelper
                android.graphics.SurfaceTexture r3 = r3.getSurfaceTexture()
                r2.<init>(r3)
                r0.surface = r1
                r0 = r7
                r1 = 1
                android.view.Surface[] r1 = new android.view.Surface[r1]     // Catch: android.hardware.camera2.CameraAccessException -> L76
                r2 = r1
                r3 = 0
                r4 = r6
                org.webrtc.Camera2Session r4 = r4.this$0     // Catch: android.hardware.camera2.CameraAccessException -> L76
                android.view.Surface r4 = r4.surface     // Catch: android.hardware.camera2.CameraAccessException -> L76
                r2[r3] = r4     // Catch: android.hardware.camera2.CameraAccessException -> L76
                java.util.List r1 = java.util.Arrays.asList(r1)     // Catch: android.hardware.camera2.CameraAccessException -> L76
                org.webrtc.Camera2Session$CaptureSessionCallback r2 = new org.webrtc.Camera2Session$CaptureSessionCallback     // Catch: android.hardware.camera2.CameraAccessException -> L76
                r3 = r2
                r4 = r6
                org.webrtc.Camera2Session r4 = r4.this$0     // Catch: android.hardware.camera2.CameraAccessException -> L76
                r3.<init>(r4)     // Catch: android.hardware.camera2.CameraAccessException -> L76
                r3 = r6
                org.webrtc.Camera2Session r3 = r3.this$0     // Catch: android.hardware.camera2.CameraAccessException -> L76
                android.os.Handler r3 = r3.cameraThreadHandler     // Catch: android.hardware.camera2.CameraAccessException -> L76
                r0.createCaptureSession(r1, r2, r3)     // Catch: android.hardware.camera2.CameraAccessException -> L76
                goto L85
            L76:
                r8 = move-exception
                r0 = r6
                org.webrtc.Camera2Session r0 = r0.this$0
                r1 = r8
                java.lang.String r1 = "Failed to create capture session. " + r1
                r0.reportError(r1)
                return
            L85:
                return
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(android.hardware.camera2.CameraDevice r4) {
                r3 = this;
                r0 = r3
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.checkIsOnCameraThread()
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Camera device closed."
                org.webrtc.Logging.d(r0, r1)
                r0 = r3
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.CameraSession$Events r0 = r0.events
                r1 = r3
                org.webrtc.Camera2Session r1 = r1.this$0
                r0.onCameraClosed(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera2Session$CaptureSessionCallback.class */
    private class CaptureSessionCallback extends android.hardware.camera2.CameraCaptureSession.StateCallback {
        final /* synthetic */ org.webrtc.Camera2Session this$0;

        private CaptureSessionCallback(org.webrtc.Camera2Session r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(android.hardware.camera2.CameraCaptureSession r4) {
                r3 = this;
                r0 = r3
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.checkIsOnCameraThread()
                r0 = r4
                r0.close()
                r0 = r3
                org.webrtc.Camera2Session r0 = r0.this$0
                java.lang.String r1 = "Failed to configure capture session."
                r0.reportError(r1)
                return
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(android.hardware.camera2.CameraCaptureSession r9) {
                r8 = this;
                r0 = r8
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.checkIsOnCameraThread()
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Camera capture session configured."
                org.webrtc.Logging.d(r0, r1)
                r0 = r8
                org.webrtc.Camera2Session r0 = r0.this$0
                r1 = r9
                r0.captureSession = r1
                r0 = r8
                org.webrtc.Camera2Session r0 = r0.this$0     // Catch: android.hardware.camera2.CameraAccessException -> La5
                android.hardware.camera2.CameraDevice r0 = r0.cameraDevice     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r1 = 3
                android.hardware.camera2.CaptureRequest$Builder r0 = r0.createCaptureRequest(r1)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r10 = r0
                r0 = r10
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch: android.hardware.camera2.CameraAccessException -> La5
                android.util.Range r2 = new android.util.Range     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r3 = r2
                r4 = r8
                org.webrtc.Camera2Session r4 = r4.this$0     // Catch: android.hardware.camera2.CameraAccessException -> La5
                org.webrtc.CameraEnumerationAndroid$CaptureFormat r4 = r4.captureFormat     // Catch: android.hardware.camera2.CameraAccessException -> La5
                org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r4 = r4.framerate     // Catch: android.hardware.camera2.CameraAccessException -> La5
                int r4 = r4.min     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r5 = r8
                org.webrtc.Camera2Session r5 = r5.this$0     // Catch: android.hardware.camera2.CameraAccessException -> La5
                int r5 = r5.fpsUnitFactor     // Catch: android.hardware.camera2.CameraAccessException -> La5
                int r4 = r4 / r5
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r5 = r8
                org.webrtc.Camera2Session r5 = r5.this$0     // Catch: android.hardware.camera2.CameraAccessException -> La5
                org.webrtc.CameraEnumerationAndroid$CaptureFormat r5 = r5.captureFormat     // Catch: android.hardware.camera2.CameraAccessException -> La5
                org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r5 = r5.framerate     // Catch: android.hardware.camera2.CameraAccessException -> La5
                int r5 = r5.max     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r6 = r8
                org.webrtc.Camera2Session r6 = r6.this$0     // Catch: android.hardware.camera2.CameraAccessException -> La5
                int r6 = r6.fpsUnitFactor     // Catch: android.hardware.camera2.CameraAccessException -> La5
                int r5 = r5 / r6
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r3.<init>(r4, r5)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0.set(r1, r2)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0 = r10
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0.set(r1, r2)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0 = r10
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r2 = 0
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0.set(r1, r2)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0 = r8
                r1 = r10
                r0.chooseStabilizationMode(r1)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0 = r8
                r1 = r10
                r0.chooseFocusMode(r1)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0 = r10
                r1 = r8
                org.webrtc.Camera2Session r1 = r1.this$0     // Catch: android.hardware.camera2.CameraAccessException -> La5
                android.view.Surface r1 = r1.surface     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0.addTarget(r1)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r0 = r9
                r1 = r10
                android.hardware.camera2.CaptureRequest r1 = r1.build()     // Catch: android.hardware.camera2.CameraAccessException -> La5
                org.webrtc.Camera2Session$CameraCaptureCallback r2 = new org.webrtc.Camera2Session$CameraCaptureCallback     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r3 = r2
                r3.<init>()     // Catch: android.hardware.camera2.CameraAccessException -> La5
                r3 = r8
                org.webrtc.Camera2Session r3 = r3.this$0     // Catch: android.hardware.camera2.CameraAccessException -> La5
                android.os.Handler r3 = r3.cameraThreadHandler     // Catch: android.hardware.camera2.CameraAccessException -> La5
                int r0 = r0.setRepeatingRequest(r1, r2, r3)     // Catch: android.hardware.camera2.CameraAccessException -> La5
                goto Lb4
            La5:
                r10 = move-exception
                r0 = r8
                org.webrtc.Camera2Session r0 = r0.this$0
                r1 = r10
                java.lang.String r1 = "Failed to start capture request. " + r1
                r0.reportError(r1)
                return
            Lb4:
                r0 = r8
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
                r1 = r8
                void r1 = (v1) -> { // org.webrtc.VideoSink.onFrame(org.webrtc.VideoFrame):void
                    r1.lambda$onConfigured$0(v1);
                }
                r0.startListening(r1)
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Camera device successfully started."
                org.webrtc.Logging.d(r0, r1)
                r0 = r8
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.CameraSession$CreateSessionCallback r0 = r0.callback
                r1 = r8
                org.webrtc.Camera2Session r1 = r1.this$0
                r0.onDone(r1)
                return
        }

        private void chooseStabilizationMode(android.hardware.camera2.CaptureRequest.Builder r5) {
                r4 = this;
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                android.hardware.camera2.CameraCharacteristics r0 = r0.cameraCharacteristics
                android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION
                java.lang.Object r0 = r0.get(r1)
                int[] r0 = (int[]) r0
                r6 = r0
                r0 = r6
                if (r0 == 0) goto L55
                r0 = r6
                r7 = r0
                r0 = r7
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r9 = r0
            L1e:
                r0 = r9
                r1 = r8
                if (r0 >= r1) goto L55
                r0 = r7
                r1 = r9
                r0 = r0[r1]
                r10 = r0
                r0 = r10
                r1 = 1
                if (r0 != r1) goto L4f
                r0 = r5
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.set(r1, r2)
                r0 = r5
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.set(r1, r2)
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Using optical stabilization."
                org.webrtc.Logging.d(r0, r1)
                return
            L4f:
                int r9 = r9 + 1
                goto L1e
            L55:
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                android.hardware.camera2.CameraCharacteristics r0 = r0.cameraCharacteristics
                android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
                java.lang.Object r0 = r0.get(r1)
                int[] r0 = (int[]) r0
                r7 = r0
                r0 = r7
                if (r0 == 0) goto Lad
                r0 = r7
                r8 = r0
                r0 = r8
                int r0 = r0.length
                r9 = r0
                r0 = 0
                r10 = r0
            L75:
                r0 = r10
                r1 = r9
                if (r0 >= r1) goto Lad
                r0 = r8
                r1 = r10
                r0 = r0[r1]
                r11 = r0
                r0 = r11
                r1 = 1
                if (r0 != r1) goto La7
                r0 = r5
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
                r2 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.set(r1, r2)
                r0 = r5
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
                r2 = 0
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.set(r1, r2)
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Using video stabilization."
                org.webrtc.Logging.d(r0, r1)
                return
            La7:
                int r10 = r10 + 1
                goto L75
            Lad:
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Stabilization not available."
                org.webrtc.Logging.d(r0, r1)
                return
        }

        private void chooseFocusMode(android.hardware.camera2.CaptureRequest.Builder r5) {
                r4 = this;
                r0 = r4
                org.webrtc.Camera2Session r0 = r0.this$0
                android.hardware.camera2.CameraCharacteristics r0 = r0.cameraCharacteristics
                android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
                java.lang.Object r0 = r0.get(r1)
                int[] r0 = (int[]) r0
                r6 = r0
                r0 = r6
                r7 = r0
                r0 = r7
                int r0 = r0.length
                r8 = r0
                r0 = 0
                r9 = r0
            L1a:
                r0 = r9
                r1 = r8
                if (r0 >= r1) goto L46
                r0 = r7
                r1 = r9
                r0 = r0[r1]
                r10 = r0
                r0 = r10
                r1 = 3
                if (r0 != r1) goto L40
                r0 = r5
                android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
                r2 = 3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r0.set(r1, r2)
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Using continuous video auto-focus."
                org.webrtc.Logging.d(r0, r1)
                return
            L40:
                int r9 = r9 + 1
                goto L1a
            L46:
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Auto-focus is not available."
                org.webrtc.Logging.d(r0, r1)
                return
        }

        private /* synthetic */ void lambda$onConfigured$0(org.webrtc.VideoFrame r8) {
                r7 = this;
                r0 = r7
                org.webrtc.Camera2Session r0 = r0.this$0
                r0.checkIsOnCameraThread()
                r0 = r7
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.Camera2Session$SessionState r0 = r0.state
                org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.RUNNING
                if (r0 == r1) goto L1c
                java.lang.String r0 = "Camera2Session"
                java.lang.String r1 = "Texture frame captured but camera is no longer running."
                org.webrtc.Logging.d(r0, r1)
                return
            L1c:
                r0 = r7
                org.webrtc.Camera2Session r0 = r0.this$0
                boolean r0 = r0.firstFrameReported
                if (r0 != 0) goto L48
                r0 = r7
                org.webrtc.Camera2Session r0 = r0.this$0
                r1 = 1
                r0.firstFrameReported = r1
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
                long r1 = java.lang.System.nanoTime()
                r2 = r7
                org.webrtc.Camera2Session r2 = r2.this$0
                long r2 = r2.constructionTimeNs
                long r1 = r1 - r2
                long r0 = r0.toMillis(r1)
                int r0 = (int) r0
                r9 = r0
                org.webrtc.Histogram r0 = org.webrtc.Camera2Session.camera2StartTimeMsHistogram
                r1 = r9
                r0.addSample(r1)
            L48:
                org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame
                r1 = r0
                r2 = r8
                org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()
                org.webrtc.TextureBufferImpl r2 = (org.webrtc.TextureBufferImpl) r2
                r3 = r7
                org.webrtc.Camera2Session r3 = r3.this$0
                boolean r3 = r3.isCameraFrontFacing
                r4 = r7
                org.webrtc.Camera2Session r4 = r4.this$0
                int r4 = r4.cameraOrientation
                int r4 = -r4
                org.webrtc.VideoFrame$TextureBuffer r2 = org.webrtc.CameraSession.createTextureBufferWithModifiedTransformMatrix(r2, r3, r4)
                r3 = r7
                org.webrtc.Camera2Session r3 = r3.this$0
                int r3 = r3.getFrameOrientation()
                r4 = r8
                long r4 = r4.getTimestampNs()
                r1.<init>(r2, r3, r4)
                r9 = r0
                r0 = r7
                org.webrtc.Camera2Session r0 = r0.this$0
                org.webrtc.CameraSession$Events r0 = r0.events
                r1 = r7
                org.webrtc.Camera2Session r1 = r1.this$0
                r2 = r9
                r0.onFrameCaptured(r1, r2)
                r0 = r9
                r0.release()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera2Session$SessionState.class */
    private enum SessionState extends java.lang.Enum<org.webrtc.Camera2Session.SessionState> {
        public static final org.webrtc.Camera2Session.SessionState RUNNING = null;
        public static final org.webrtc.Camera2Session.SessionState STOPPED = null;
        private static final /* synthetic */ org.webrtc.Camera2Session.SessionState[] $VALUES = null;

        public static org.webrtc.Camera2Session.SessionState[] values() {
                org.webrtc.Camera2Session$SessionState[] r0 = org.webrtc.Camera2Session.SessionState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.Camera2Session$SessionState[] r0 = (org.webrtc.Camera2Session.SessionState[]) r0
                return r0
        }

        public static org.webrtc.Camera2Session.SessionState valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.Camera2Session$SessionState> r0 = org.webrtc.Camera2Session.SessionState.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.Camera2Session$SessionState r0 = (org.webrtc.Camera2Session.SessionState) r0
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

        private static /* synthetic */ org.webrtc.Camera2Session.SessionState[] $values() {
                r0 = 2
                org.webrtc.Camera2Session$SessionState[] r0 = new org.webrtc.Camera2Session.SessionState[r0]
                r1 = r0
                r2 = 0
                org.webrtc.Camera2Session$SessionState r3 = org.webrtc.Camera2Session.SessionState.RUNNING
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.Camera2Session$SessionState r3 = org.webrtc.Camera2Session.SessionState.STOPPED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.Camera2Session$SessionState r0 = new org.webrtc.Camera2Session$SessionState
                r1 = r0
                java.lang.String r2 = "RUNNING"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.Camera2Session.SessionState.RUNNING = r0
                org.webrtc.Camera2Session$SessionState r0 = new org.webrtc.Camera2Session$SessionState
                r1 = r0
                java.lang.String r2 = "STOPPED"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.Camera2Session.SessionState.STOPPED = r0
                org.webrtc.Camera2Session$SessionState[] r0 = $values()
                org.webrtc.Camera2Session.SessionState.$VALUES = r0
                return
        }
    }

    public static void create(org.webrtc.CameraSession.CreateSessionCallback r12, org.webrtc.CameraSession.Events r13, android.content.Context r14, android.hardware.camera2.CameraManager r15, org.webrtc.SurfaceTextureHelper r16, java.lang.String r17, int r18, int r19, int r20) {
            org.webrtc.Camera2Session r0 = new org.webrtc.Camera2Session
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private Camera2Session(org.webrtc.CameraSession.CreateSessionCallback r5, org.webrtc.CameraSession.Events r6, android.content.Context r7, android.hardware.camera2.CameraManager r8, org.webrtc.SurfaceTextureHelper r9, java.lang.String r10, int r11, int r12, int r13) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.RUNNING
            r0.state = r1
            java.lang.String r0 = "Camera2Session"
            r1 = r10
            java.lang.String r1 = "Create new camera2 session on camera " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            long r1 = java.lang.System.nanoTime()
            r0.constructionTimeNs = r1
            r0 = r4
            android.os.Handler r1 = new android.os.Handler
            r2 = r1
            r2.<init>()
            r0.cameraThreadHandler = r1
            r0 = r4
            r1 = r5
            r0.callback = r1
            r0 = r4
            r1 = r6
            r0.events = r1
            r0 = r4
            r1 = r7
            r0.applicationContext = r1
            r0 = r4
            r1 = r8
            r0.cameraManager = r1
            r0 = r4
            r1 = r9
            r0.surfaceTextureHelper = r1
            r0 = r4
            r1 = r10
            r0.cameraId = r1
            r0 = r4
            r1 = r11
            r0.width = r1
            r0 = r4
            r1 = r12
            r0.height = r1
            r0 = r4
            r1 = r13
            r0.framerate = r1
            r0 = r4
            r0.start()
            return
    }

    private void start() {
            r4 = this;
            r0 = r4
            r0.checkIsOnCameraThread()
            java.lang.String r0 = "Camera2Session"
            java.lang.String r1 = "start"
            org.webrtc.Logging.d(r0, r1)
            r0 = r4
            r1 = r4
            android.hardware.camera2.CameraManager r1 = r1.cameraManager     // Catch: java.lang.Throwable -> L1d
            r2 = r4
            java.lang.String r2 = r2.cameraId     // Catch: java.lang.Throwable -> L1d
            android.hardware.camera2.CameraCharacteristics r1 = r1.getCameraCharacteristics(r2)     // Catch: java.lang.Throwable -> L1d
            r0.cameraCharacteristics = r1     // Catch: java.lang.Throwable -> L1d
            goto L2c
        L1d:
            r5 = move-exception
            r0 = r4
            r1 = r5
            java.lang.String r1 = r1.getMessage()
            java.lang.String r1 = "getCameraCharacteristics(): " + r1
            r0.reportError(r1)
            return
        L2c:
            r0 = r4
            r1 = r4
            android.hardware.camera2.CameraCharacteristics r1 = r1.cameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.cameraOrientation = r1
            r0 = r4
            r1 = r4
            android.hardware.camera2.CameraCharacteristics r1 = r1.cameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r1 != 0) goto L58
            r1 = 1
            goto L59
        L58:
            r1 = 0
        L59:
            r0.isCameraFrontFacing = r1
            r0 = r4
            r0.findCaptureFormat()
            r0 = r4
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r0 = r0.captureFormat
            if (r0 != 0) goto L68
            return
        L68:
            r0 = r4
            r0.openCamera()
            return
    }

    private void findCaptureFormat() {
            r7 = this;
            r0 = r7
            r0.checkIsOnCameraThread()
            r0 = r7
            android.hardware.camera2.CameraCharacteristics r0 = r0.cameraCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r0 = r0.get(r1)
            android.util.Range[] r0 = (android.util.Range[]) r0
            r8 = r0
            r0 = r7
            r1 = r8
            int r1 = org.webrtc.Camera2Enumerator.getFpsUnitFactor(r1)
            r0.fpsUnitFactor = r1
            r0 = r8
            r1 = r7
            int r1 = r1.fpsUnitFactor
            java.util.List r0 = org.webrtc.Camera2Enumerator.convertFramerates(r0, r1)
            r9 = r0
            r0 = r7
            android.hardware.camera2.CameraCharacteristics r0 = r0.cameraCharacteristics
            java.util.List r0 = org.webrtc.Camera2Enumerator.getSupportedSizes(r0)
            r10 = r0
            java.lang.String r0 = "Camera2Session"
            r1 = r10
            java.lang.String r1 = "Available preview sizes: " + r1
            org.webrtc.Logging.d(r0, r1)
            java.lang.String r0 = "Camera2Session"
            r1 = r9
            java.lang.String r1 = "Available fps ranges: " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L53
            r0 = r10
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5a
        L53:
            r0 = r7
            java.lang.String r1 = "No supported capture formats."
            r0.reportError(r1)
            return
        L5a:
            r0 = r9
            r1 = r7
            int r1 = r1.framerate
            org.webrtc.CameraEnumerationAndroid$CaptureFormat$FramerateRange r0 = org.webrtc.CameraEnumerationAndroid.getClosestSupportedFramerateRange(r0, r1)
            r11 = r0
            r0 = r10
            r1 = r7
            int r1 = r1.width
            r2 = r7
            int r2 = r2.height
            org.webrtc.Size r0 = org.webrtc.CameraEnumerationAndroid.getClosestSupportedSize(r0, r1, r2)
            r12 = r0
            org.webrtc.Histogram r0 = org.webrtc.Camera2Session.camera2ResolutionHistogram
            r1 = r12
            org.webrtc.CameraEnumerationAndroid.reportCameraResolution(r0, r1)
            r0 = r7
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r1 = new org.webrtc.CameraEnumerationAndroid$CaptureFormat
            r2 = r1
            r3 = r12
            int r3 = r3.width
            r4 = r12
            int r4 = r4.height
            r5 = r11
            r2.<init>(r3, r4, r5)
            r0.captureFormat = r1
            java.lang.String r0 = "Camera2Session"
            r1 = r7
            org.webrtc.CameraEnumerationAndroid$CaptureFormat r1 = r1.captureFormat
            java.lang.String r1 = "Using capture format: " + r1
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private void openCamera() {
            r6 = this;
            r0 = r6
            r0.checkIsOnCameraThread()
            java.lang.String r0 = "Camera2Session"
            r1 = r6
            java.lang.String r1 = r1.cameraId
            java.lang.String r1 = "Opening camera " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            org.webrtc.CameraSession$Events r0 = r0.events
            r0.onCameraOpening()
            r0 = r6
            android.hardware.camera2.CameraManager r0 = r0.cameraManager     // Catch: java.lang.Throwable -> L35
            r1 = r6
            java.lang.String r1 = r1.cameraId     // Catch: java.lang.Throwable -> L35
            org.webrtc.Camera2Session$CameraStateCallback r2 = new org.webrtc.Camera2Session$CameraStateCallback     // Catch: java.lang.Throwable -> L35
            r3 = r2
            r4 = r6
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L35
            r3 = r6
            android.os.Handler r3 = r3.cameraThreadHandler     // Catch: java.lang.Throwable -> L35
            r0.openCamera(r1, r2, r3)     // Catch: java.lang.Throwable -> L35
            goto L41
        L35:
            r7 = move-exception
            r0 = r6
            r1 = r7
            java.lang.String r1 = "Failed to open camera: " + r1
            r0.reportError(r1)
            return
        L41:
            return
    }

    @Override // org.webrtc.CameraSession
    public void stop() {
            r6 = this;
            java.lang.String r0 = "Camera2Session"
            r1 = r6
            java.lang.String r1 = r1.cameraId
            java.lang.String r1 = "Stop camera2 session on camera " + r1
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            r0.checkIsOnCameraThread()
            r0 = r6
            org.webrtc.Camera2Session$SessionState r0 = r0.state
            org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.STOPPED
            if (r0 == r1) goto L3f
            long r0 = java.lang.System.nanoTime()
            r7 = r0
            r0 = r6
            org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.STOPPED
            r0.state = r1
            r0 = r6
            r0.stopInternal()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            r2 = r7
            long r1 = r1 - r2
            long r0 = r0.toMillis(r1)
            int r0 = (int) r0
            r9 = r0
            org.webrtc.Histogram r0 = org.webrtc.Camera2Session.camera2StopTimeMsHistogram
            r1 = r9
            r0.addSample(r1)
        L3f:
            return
    }

    private void stopInternal() {
            r3 = this;
            java.lang.String r0 = "Camera2Session"
            java.lang.String r1 = "Stop internal"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            r0.checkIsOnCameraThread()
            r0 = r3
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r0.stopListening()
            r0 = r3
            android.hardware.camera2.CameraCaptureSession r0 = r0.captureSession
            if (r0 == 0) goto L26
            r0 = r3
            android.hardware.camera2.CameraCaptureSession r0 = r0.captureSession
            r0.close()
            r0 = r3
            r1 = 0
            r0.captureSession = r1
        L26:
            r0 = r3
            android.view.Surface r0 = r0.surface
            if (r0 == 0) goto L39
            r0 = r3
            android.view.Surface r0 = r0.surface
            r0.release()
            r0 = r3
            r1 = 0
            r0.surface = r1
        L39:
            r0 = r3
            android.hardware.camera2.CameraDevice r0 = r0.cameraDevice
            if (r0 == 0) goto L4c
            r0 = r3
            android.hardware.camera2.CameraDevice r0 = r0.cameraDevice
            r0.close()
            r0 = r3
            r1 = 0
            r0.cameraDevice = r1
        L4c:
            java.lang.String r0 = "Camera2Session"
            java.lang.String r1 = "Stop done"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private void reportError(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.checkIsOnCameraThread()
            java.lang.String r0 = "Camera2Session"
            r1 = r5
            java.lang.String r1 = "Error: " + r1
            org.webrtc.Logging.e(r0, r1)
            r0 = r4
            android.hardware.camera2.CameraCaptureSession r0 = r0.captureSession
            if (r0 != 0) goto L24
            r0 = r4
            org.webrtc.Camera2Session$SessionState r0 = r0.state
            org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.STOPPED
            if (r0 == r1) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            r6 = r0
            r0 = r4
            org.webrtc.Camera2Session$SessionState r1 = org.webrtc.Camera2Session.SessionState.STOPPED
            r0.state = r1
            r0 = r4
            r0.stopInternal()
            r0 = r6
            if (r0 == 0) goto L45
            r0 = r4
            org.webrtc.CameraSession$CreateSessionCallback r0 = r0.callback
            org.webrtc.CameraSession$FailureType r1 = org.webrtc.CameraSession.FailureType.ERROR
            r2 = r5
            r0.onFailure(r1, r2)
            goto L50
        L45:
            r0 = r4
            org.webrtc.CameraSession$Events r0 = r0.events
            r1 = r4
            r2 = r5
            r0.onCameraError(r1, r2)
        L50:
            return
    }

    private int getFrameOrientation() {
            r3 = this;
            r0 = r3
            android.content.Context r0 = r0.applicationContext
            int r0 = org.webrtc.CameraSession.getDeviceOrientation(r0)
            r4 = r0
            r0 = r3
            boolean r0 = r0.isCameraFrontFacing
            if (r0 != 0) goto L15
            r0 = 360(0x168, float:5.04E-43)
            r1 = r4
            int r0 = r0 - r1
            r4 = r0
        L15:
            r0 = r3
            int r0 = r0.cameraOrientation
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

    static {
            java.lang.String r0 = "WebRTC.Android.Camera2.StartTimeMs"
            r1 = 1
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 50
            org.webrtc.Histogram r0 = org.webrtc.Histogram.createCounts(r0, r1, r2, r3)
            org.webrtc.Camera2Session.camera2StartTimeMsHistogram = r0
            java.lang.String r0 = "WebRTC.Android.Camera2.StopTimeMs"
            r1 = 1
            r2 = 10000(0x2710, float:1.4013E-41)
            r3 = 50
            org.webrtc.Histogram r0 = org.webrtc.Histogram.createCounts(r0, r1, r2, r3)
            org.webrtc.Camera2Session.camera2StopTimeMsHistogram = r0
            java.lang.String r0 = "WebRTC.Android.Camera2.Resolution"
            java.util.ArrayList<org.webrtc.Size> r1 = org.webrtc.CameraEnumerationAndroid.COMMON_RESOLUTIONS
            int r1 = r1.size()
            org.webrtc.Histogram r0 = org.webrtc.Histogram.createEnumeration(r0, r1)
            org.webrtc.Camera2Session.camera2ResolutionHistogram = r0
            return
    }
}
