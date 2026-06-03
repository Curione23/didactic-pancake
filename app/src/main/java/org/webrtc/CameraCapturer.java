package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraCapturer.class */
abstract class CameraCapturer implements org.webrtc.CameraVideoCapturer {
    private static final java.lang.String TAG = "CameraCapturer";
    private static final int MAX_OPEN_CAMERA_ATTEMPTS = 3;
    private static final int OPEN_CAMERA_DELAY_MS = 500;
    private static final int OPEN_CAMERA_TIMEOUT = 10000;
    private final org.webrtc.CameraEnumerator cameraEnumerator;
    private final org.webrtc.CameraVideoCapturer.CameraEventsHandler eventsHandler;
    private final android.os.Handler uiThreadHandler;

    @androidx.annotation.Nullable
    private final org.webrtc.CameraSession.CreateSessionCallback createSessionCallback;

    @androidx.annotation.Nullable
    private final org.webrtc.CameraSession.Events cameraSessionEventsHandler;
    private final java.lang.Runnable openCameraTimeoutRunnable;
    private android.os.Handler cameraThreadHandler;
    private android.content.Context applicationContext;
    private org.webrtc.CapturerObserver capturerObserver;
    private org.webrtc.SurfaceTextureHelper surfaceHelper;
    private final java.lang.Object stateLock;
    private boolean sessionOpening;

    @androidx.annotation.Nullable
    private org.webrtc.CameraSession currentSession;
    private java.lang.String cameraName;
    private java.lang.String pendingCameraName;
    private int width;
    private int height;
    private int framerate;
    private int openAttemptsRemaining;
    private org.webrtc.CameraCapturer.SwitchState switchState;

    @androidx.annotation.Nullable
    private org.webrtc.CameraVideoCapturer.CameraSwitchHandler switchEventsHandler;

    @androidx.annotation.Nullable
    private org.webrtc.CameraVideoCapturer.CameraStatistics cameraStatistics;
    private boolean firstFrameObserved;










    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraCapturer$SwitchState.class */
    enum SwitchState extends java.lang.Enum<org.webrtc.CameraCapturer.SwitchState> {
        public static final org.webrtc.CameraCapturer.SwitchState IDLE = null;
        public static final org.webrtc.CameraCapturer.SwitchState PENDING = null;
        public static final org.webrtc.CameraCapturer.SwitchState IN_PROGRESS = null;
        private static final /* synthetic */ org.webrtc.CameraCapturer.SwitchState[] $VALUES = null;

        public static org.webrtc.CameraCapturer.SwitchState[] values() {
                org.webrtc.CameraCapturer$SwitchState[] r0 = org.webrtc.CameraCapturer.SwitchState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.CameraCapturer$SwitchState[] r0 = (org.webrtc.CameraCapturer.SwitchState[]) r0
                return r0
        }

        public static org.webrtc.CameraCapturer.SwitchState valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.CameraCapturer$SwitchState> r0 = org.webrtc.CameraCapturer.SwitchState.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.CameraCapturer$SwitchState r0 = (org.webrtc.CameraCapturer.SwitchState) r0
                return r0
        }

        SwitchState(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ org.webrtc.CameraCapturer.SwitchState[] $values() {
                r0 = 3
                org.webrtc.CameraCapturer$SwitchState[] r0 = new org.webrtc.CameraCapturer.SwitchState[r0]
                r1 = r0
                r2 = 0
                org.webrtc.CameraCapturer$SwitchState r3 = org.webrtc.CameraCapturer.SwitchState.IDLE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.CameraCapturer$SwitchState r3 = org.webrtc.CameraCapturer.SwitchState.PENDING
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.CameraCapturer$SwitchState r3 = org.webrtc.CameraCapturer.SwitchState.IN_PROGRESS
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.CameraCapturer$SwitchState r0 = new org.webrtc.CameraCapturer$SwitchState
                r1 = r0
                java.lang.String r2 = "IDLE"
                r3 = 0
                r1.<init>(r2, r3)
                org.webrtc.CameraCapturer.SwitchState.IDLE = r0
                org.webrtc.CameraCapturer$SwitchState r0 = new org.webrtc.CameraCapturer$SwitchState
                r1 = r0
                java.lang.String r2 = "PENDING"
                r3 = 1
                r1.<init>(r2, r3)
                org.webrtc.CameraCapturer.SwitchState.PENDING = r0
                org.webrtc.CameraCapturer$SwitchState r0 = new org.webrtc.CameraCapturer$SwitchState
                r1 = r0
                java.lang.String r2 = "IN_PROGRESS"
                r3 = 2
                r1.<init>(r2, r3)
                org.webrtc.CameraCapturer.SwitchState.IN_PROGRESS = r0
                org.webrtc.CameraCapturer$SwitchState[] r0 = $values()
                org.webrtc.CameraCapturer.SwitchState.$VALUES = r0
                return
        }
    }

    public CameraCapturer(java.lang.String r6, @androidx.annotation.Nullable org.webrtc.CameraVideoCapturer.CameraEventsHandler r7, org.webrtc.CameraEnumerator r8) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.webrtc.CameraCapturer$1 r1 = new org.webrtc.CameraCapturer$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.createSessionCallback = r1
            r0 = r5
            org.webrtc.CameraCapturer$2 r1 = new org.webrtc.CameraCapturer$2
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.cameraSessionEventsHandler = r1
            r0 = r5
            org.webrtc.CameraCapturer$3 r1 = new org.webrtc.CameraCapturer$3
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.openCameraTimeoutRunnable = r1
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.stateLock = r1
            r0 = r5
            org.webrtc.CameraCapturer$SwitchState r1 = org.webrtc.CameraCapturer.SwitchState.IDLE
            r0.switchState = r1
            r0 = r7
            if (r0 != 0) goto L47
            org.webrtc.CameraCapturer$4 r0 = new org.webrtc.CameraCapturer$4
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            r7 = r0
        L47:
            r0 = r5
            r1 = r7
            r0.eventsHandler = r1
            r0 = r5
            r1 = r8
            r0.cameraEnumerator = r1
            r0 = r5
            r1 = r6
            r0.cameraName = r1
            r0 = r8
            java.lang.String[] r0 = r0.getDeviceNames()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r9 = r0
            r0 = r5
            android.os.Handler r1 = new android.os.Handler
            r2 = r1
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            r0.uiThreadHandler = r1
            r0 = r9
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L83
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "No cameras attached."
            r1.<init>(r2)
            throw r0
        L83:
            r0 = r9
            r1 = r5
            java.lang.String r1 = r1.cameraName
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto La2
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r5
            java.lang.String r2 = r2.cameraName
            java.lang.String r2 = "Camera name " + r2 + " does not match any known camera device."
            r1.<init>(r2)
            throw r0
        La2:
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void initialize(org.webrtc.SurfaceTextureHelper r4, android.content.Context r5, org.webrtc.CapturerObserver r6) {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.applicationContext = r1
            r0 = r3
            r1 = r6
            r0.capturerObserver = r1
            r0 = r3
            r1 = r4
            r0.surfaceHelper = r1
            r0 = r3
            r1 = r4
            android.os.Handler r1 = r1.getHandler()
            r0.cameraThreadHandler = r1
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void startCapture(int r6, int r7, int r8) {
            r5 = this;
            java.lang.String r0 = "CameraCapturer"
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r1 = "startCapture: " + r1 + "x" + r2 + "@" + r3
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            android.content.Context r0 = r0.applicationContext
            if (r0 != 0) goto L1e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "CameraCapturer must be initialized before calling startCapture."
            r1.<init>(r2)
            throw r0
        L1e:
            r0 = r5
            java.lang.Object r0 = r0.stateLock
            r1 = r0
            r9 = r1
            monitor-enter(r0)
            r0 = r5
            boolean r0 = r0.sessionOpening     // Catch: java.lang.Throwable -> L63
            if (r0 != 0) goto L34
            r0 = r5
            org.webrtc.CameraSession r0 = r0.currentSession     // Catch: java.lang.Throwable -> L63
            if (r0 == 0) goto L3f
        L34:
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Session already open"
            org.webrtc.Logging.w(r0, r1)     // Catch: java.lang.Throwable -> L63
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            return
        L3f:
            r0 = r5
            r1 = r6
            r0.width = r1     // Catch: java.lang.Throwable -> L63
            r0 = r5
            r1 = r7
            r0.height = r1     // Catch: java.lang.Throwable -> L63
            r0 = r5
            r1 = r8
            r0.framerate = r1     // Catch: java.lang.Throwable -> L63
            r0 = r5
            r1 = 1
            r0.sessionOpening = r1     // Catch: java.lang.Throwable -> L63
            r0 = r5
            r1 = 3
            r0.openAttemptsRemaining = r1     // Catch: java.lang.Throwable -> L63
            r0 = r5
            r1 = 0
            r0.createSessionInternal(r1)     // Catch: java.lang.Throwable -> L63
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            goto L6b
        L63:
            r10 = move-exception
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            r0 = r10
            throw r0
        L6b:
            return
    }

    private void createSessionInternal(int r6) {
            r5 = this;
            r0 = r5
            android.os.Handler r0 = r0.uiThreadHandler
            r1 = r5
            java.lang.Runnable r1 = r1.openCameraTimeoutRunnable
            r2 = r6
            r3 = 10000(0x2710, float:1.4013E-41)
            int r2 = r2 + r3
            long r2 = (long) r2
            boolean r0 = r0.postDelayed(r1, r2)
            r0 = r5
            android.os.Handler r0 = r0.cameraThreadHandler
            org.webrtc.CameraCapturer$5 r1 = new org.webrtc.CameraCapturer$5
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r2 = r6
            long r2 = (long) r2
            boolean r0 = r0.postDelayed(r1, r2)
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void stopCapture() {
            r6 = this;
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Stop capture"
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            java.lang.Object r0 = r0.stateLock
            r1 = r0
            r7 = r1
            monitor-enter(r0)
        Le:
            r0 = r6
            boolean r0 = r0.sessionOpening     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L37
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Stop capture: Waiting for session to open"
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L84
            r0 = r6
            java.lang.Object r0 = r0.stateLock     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L84
            r0.wait()     // Catch: java.lang.InterruptedException -> L26 java.lang.Throwable -> L84
            goto Le
        L26:
            r8 = move-exception
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Stop capture interrupted while waiting for the session to open."
            org.webrtc.Logging.w(r0, r1)     // Catch: java.lang.Throwable -> L84
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L84
            r0.interrupt()     // Catch: java.lang.Throwable -> L84
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            return
        L37:
            r0 = r6
            org.webrtc.CameraSession r0 = r0.currentSession     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L78
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Stop capture: Nulling session"
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L84
            r0 = r6
            org.webrtc.CameraVideoCapturer$CameraStatistics r0 = r0.cameraStatistics     // Catch: java.lang.Throwable -> L84
            r0.release()     // Catch: java.lang.Throwable -> L84
            r0 = r6
            r1 = 0
            r0.cameraStatistics = r1     // Catch: java.lang.Throwable -> L84
            r0 = r6
            org.webrtc.CameraSession r0 = r0.currentSession     // Catch: java.lang.Throwable -> L84
            r8 = r0
            r0 = r6
            android.os.Handler r0 = r0.cameraThreadHandler     // Catch: java.lang.Throwable -> L84
            org.webrtc.CameraCapturer$6 r1 = new org.webrtc.CameraCapturer$6     // Catch: java.lang.Throwable -> L84
            r2 = r1
            r3 = r6
            r4 = r8
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L84
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> L84
            r0 = r6
            r1 = 0
            r0.currentSession = r1     // Catch: java.lang.Throwable -> L84
            r0 = r6
            org.webrtc.CapturerObserver r0 = r0.capturerObserver     // Catch: java.lang.Throwable -> L84
            r0.onCapturerStopped()     // Catch: java.lang.Throwable -> L84
            goto L7f
        L78:
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Stop capture: No session open"
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> L84
        L7f:
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            goto L89
        L84:
            r9 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L84
            r0 = r9
            throw r0
        L89:
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Stop capture done"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void changeCaptureFormat(int r6, int r7, int r8) {
            r5 = this;
            java.lang.String r0 = "CameraCapturer"
            r1 = r6
            r2 = r7
            r3 = r8
            java.lang.String r1 = "changeCaptureFormat: " + r1 + "x" + r2 + "@" + r3
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            java.lang.Object r0 = r0.stateLock
            r1 = r0
            r9 = r1
            monitor-enter(r0)
            r0 = r5
            r0.stopCapture()     // Catch: java.lang.Throwable -> L26
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            r0.startCapture(r1, r2, r3)     // Catch: java.lang.Throwable -> L26
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            goto L2e
        L26:
            r10 = move-exception
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            r0 = r10
            throw r0
        L2e:
            return
    }

    @Override // org.webrtc.VideoCapturer
    public void dispose() {
            r3 = this;
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "dispose"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            r0.stopCapture()
            return
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler r7) {
            r6 = this;
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "switchCamera"
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            android.os.Handler r0 = r0.cameraThreadHandler
            org.webrtc.CameraCapturer$7 r1 = new org.webrtc.CameraCapturer$7
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
            boolean r0 = r0.post(r1)
            return
    }

    @Override // org.webrtc.CameraVideoCapturer
    public void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler r8, java.lang.String r9) {
            r7 = this;
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "switchCamera"
            org.webrtc.Logging.d(r0, r1)
            r0 = r7
            android.os.Handler r0 = r0.cameraThreadHandler
            org.webrtc.CameraCapturer$8 r1 = new org.webrtc.CameraCapturer$8
            r2 = r1
            r3 = r7
            r4 = r8
            r5 = r9
            r2.<init>(r3, r4, r5)
            boolean r0 = r0.post(r1)
            return
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void printStackTrace() {
            r3 = this;
            r0 = 0
            r4 = r0
            r0 = r3
            android.os.Handler r0 = r0.cameraThreadHandler
            if (r0 == 0) goto L14
            r0 = r3
            android.os.Handler r0 = r0.cameraThreadHandler
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            r4 = r0
        L14:
            r0 = r4
            if (r0 == 0) goto L50
            r0 = r4
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r5 = r0
            r0 = r5
            int r0 = r0.length
            if (r0 <= 0) goto L50
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "CameraCapturer stack trace:"
            org.webrtc.Logging.d(r0, r1)
            r0 = r5
            r6 = r0
            r0 = r6
            int r0 = r0.length
            r7 = r0
            r0 = 0
            r8 = r0
        L33:
            r0 = r8
            r1 = r7
            if (r0 >= r1) goto L50
            r0 = r6
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            java.lang.String r0 = "CameraCapturer"
            r1 = r9
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.d(r0, r1)
            int r8 = r8 + 1
            goto L33
        L50:
            return
    }

    private void reportCameraSwitchError(java.lang.String r4, @androidx.annotation.Nullable org.webrtc.CameraVideoCapturer.CameraSwitchHandler r5) {
            r3 = this;
            java.lang.String r0 = "CameraCapturer"
            r1 = r4
            org.webrtc.Logging.e(r0, r1)
            r0 = r5
            if (r0 == 0) goto L11
            r0 = r5
            r1 = r4
            r0.onCameraSwitchError(r1)
        L11:
            return
    }

    private void switchCameraInternal(@androidx.annotation.Nullable org.webrtc.CameraVideoCapturer.CameraSwitchHandler r7, java.lang.String r8) {
            r6 = this;
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "switchCamera internal"
            org.webrtc.Logging.d(r0, r1)
            r0 = r6
            org.webrtc.CameraEnumerator r0 = r0.cameraEnumerator
            java.lang.String[] r0 = r0.getDeviceNames()
            java.util.List r0 = java.util.Arrays.asList(r0)
            r9 = r0
            r0 = r9
            r1 = r8
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L2b
            r0 = r6
            r1 = r8
            java.lang.String r1 = "Attempted to switch to unknown camera device " + r1
            r2 = r7
            r0.reportCameraSwitchError(r1, r2)
            return
        L2b:
            r0 = r6
            java.lang.Object r0 = r0.stateLock
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            r0 = r6
            org.webrtc.CameraCapturer$SwitchState r0 = r0.switchState     // Catch: java.lang.Throwable -> Ld1
            org.webrtc.CameraCapturer$SwitchState r1 = org.webrtc.CameraCapturer.SwitchState.IDLE     // Catch: java.lang.Throwable -> Ld1
            if (r0 == r1) goto L49
            r0 = r6
            java.lang.String r1 = "Camera switch already in progress."
            r2 = r7
            r0.reportCameraSwitchError(r1, r2)     // Catch: java.lang.Throwable -> Ld1
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        L49:
            r0 = r6
            boolean r0 = r0.sessionOpening     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto L63
            r0 = r6
            org.webrtc.CameraSession r0 = r0.currentSession     // Catch: java.lang.Throwable -> Ld1
            if (r0 != 0) goto L63
            r0 = r6
            java.lang.String r1 = "switchCamera: camera is not running."
            r2 = r7
            r0.reportCameraSwitchError(r1, r2)     // Catch: java.lang.Throwable -> Ld1
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        L63:
            r0 = r6
            r1 = r7
            r0.switchEventsHandler = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            boolean r0 = r0.sessionOpening     // Catch: java.lang.Throwable -> Ld1
            if (r0 == 0) goto L7f
            r0 = r6
            org.webrtc.CameraCapturer$SwitchState r1 = org.webrtc.CameraCapturer.SwitchState.PENDING     // Catch: java.lang.Throwable -> Ld1
            r0.switchState = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            r1 = r8
            r0.pendingCameraName = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            return
        L7f:
            r0 = r6
            org.webrtc.CameraCapturer$SwitchState r1 = org.webrtc.CameraCapturer.SwitchState.IN_PROGRESS     // Catch: java.lang.Throwable -> Ld1
            r0.switchState = r1     // Catch: java.lang.Throwable -> Ld1
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "switchCamera: Stopping session"
            org.webrtc.Logging.d(r0, r1)     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            org.webrtc.CameraVideoCapturer$CameraStatistics r0 = r0.cameraStatistics     // Catch: java.lang.Throwable -> Ld1
            r0.release()     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            r1 = 0
            r0.cameraStatistics = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            org.webrtc.CameraSession r0 = r0.currentSession     // Catch: java.lang.Throwable -> Ld1
            r11 = r0
            r0 = r6
            android.os.Handler r0 = r0.cameraThreadHandler     // Catch: java.lang.Throwable -> Ld1
            org.webrtc.CameraCapturer$9 r1 = new org.webrtc.CameraCapturer$9     // Catch: java.lang.Throwable -> Ld1
            r2 = r1
            r3 = r6
            r4 = r11
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> Ld1
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            r1 = 0
            r0.currentSession = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            r1 = r8
            r0.cameraName = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            r1 = 1
            r0.sessionOpening = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            r1 = 1
            r0.openAttemptsRemaining = r1     // Catch: java.lang.Throwable -> Ld1
            r0 = r6
            r1 = 0
            r0.createSessionInternal(r1)     // Catch: java.lang.Throwable -> Ld1
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            goto Ld9
        Ld1:
            r12 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld1
            r0 = r12
            throw r0
        Ld9:
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "switchCamera done"
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private void checkIsOnCameraThread() {
            r4 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = r4
            android.os.Handler r1 = r1.cameraThreadHandler
            android.os.Looper r1 = r1.getLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 == r1) goto L23
            java.lang.String r0 = "CameraCapturer"
            java.lang.String r1 = "Check is on camera thread failed."
            org.webrtc.Logging.e(r0, r1)
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Not on camera thread."
            r1.<init>(r2)
            throw r0
        L23:
            return
    }

    protected java.lang.String getCameraName() {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.stateLock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            java.lang.String r0 = r0.cameraName     // Catch: java.lang.Throwable -> Le
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            return r0
        Le:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            r0 = r5
            throw r0
    }

    protected abstract void createCameraSession(org.webrtc.CameraSession.CreateSessionCallback r1, org.webrtc.CameraSession.Events r2, android.content.Context r3, org.webrtc.SurfaceTextureHelper r4, java.lang.String r5, int r6, int r7, int r8);
}
