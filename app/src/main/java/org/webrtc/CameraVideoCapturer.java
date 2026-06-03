package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraVideoCapturer.class */
public interface CameraVideoCapturer extends org.webrtc.VideoCapturer {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraVideoCapturer$CameraEventsHandler.class */
    public interface CameraEventsHandler {
        void onCameraError(java.lang.String r1);

        void onCameraDisconnected();

        void onCameraFreezed(java.lang.String r1);

        void onCameraOpening(java.lang.String r1);

        void onFirstFrameAvailable();

        void onCameraClosed();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraVideoCapturer$CameraStatistics.class */
    public static class CameraStatistics {
        private static final java.lang.String TAG = "CameraStatistics";
        private static final int CAMERA_OBSERVER_PERIOD_MS = 2000;
        private static final int CAMERA_FREEZE_REPORT_TIMOUT_MS = 4000;
        private final org.webrtc.SurfaceTextureHelper surfaceTextureHelper;
        private final org.webrtc.CameraVideoCapturer.CameraEventsHandler eventsHandler;
        private int frameCount;
        private int freezePeriodCount;
        private final java.lang.Runnable cameraObserver;


        public CameraStatistics(org.webrtc.SurfaceTextureHelper r6, org.webrtc.CameraVideoCapturer.CameraEventsHandler r7) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                org.webrtc.CameraVideoCapturer$CameraStatistics$1 r1 = new org.webrtc.CameraVideoCapturer$CameraStatistics$1
                r2 = r1
                r3 = r5
                r2.<init>(r3)
                r0.cameraObserver = r1
                r0 = r6
                if (r0 != 0) goto L1e
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "SurfaceTextureHelper is null"
                r1.<init>(r2)
                throw r0
            L1e:
                r0 = r5
                r1 = r6
                r0.surfaceTextureHelper = r1
                r0 = r5
                r1 = r7
                r0.eventsHandler = r1
                r0 = r5
                r1 = 0
                r0.frameCount = r1
                r0 = r5
                r1 = 0
                r0.freezePeriodCount = r1
                r0 = r6
                android.os.Handler r0 = r0.getHandler()
                r1 = r5
                java.lang.Runnable r1 = r1.cameraObserver
                r2 = 2000(0x7d0, double:9.88E-321)
                boolean r0 = r0.postDelayed(r1, r2)
                return
        }

        private void checkThread() {
                r4 = this;
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r1 = r4
                org.webrtc.SurfaceTextureHelper r1 = r1.surfaceTextureHelper
                android.os.Handler r1 = r1.getHandler()
                android.os.Looper r1 = r1.getLooper()
                java.lang.Thread r1 = r1.getThread()
                if (r0 == r1) goto L1d
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                java.lang.String r2 = "Wrong thread"
                r1.<init>(r2)
                throw r0
            L1d:
                return
        }

        public void addFrame() {
                r4 = this;
                r0 = r4
                r0.checkThread()
                r0 = r4
                r1 = r0
                int r1 = r1.frameCount
                r2 = 1
                int r1 = r1 + r2
                r0.frameCount = r1
                return
        }

        public void release() {
                r3 = this;
                r0 = r3
                org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
                android.os.Handler r0 = r0.getHandler()
                r1 = r3
                java.lang.Runnable r1 = r1.cameraObserver
                r0.removeCallbacks(r1)
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraVideoCapturer$CameraSwitchHandler.class */
    public interface CameraSwitchHandler {
        void onCameraSwitchDone(boolean r1);

        void onCameraSwitchError(java.lang.String r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraVideoCapturer$MediaRecorderHandler.class */
    @java.lang.Deprecated
    public interface MediaRecorderHandler {
        void onMediaRecorderSuccess();

        void onMediaRecorderError(java.lang.String r1);
    }

    void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler r1);

    void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler r1, java.lang.String r2);

    @java.lang.Deprecated
    default void addMediaRecorderToCamera(android.media.MediaRecorder r5, org.webrtc.CameraVideoCapturer.MediaRecorderHandler r6) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Deprecated and not implemented."
            r1.<init>(r2)
            throw r0
    }

    @java.lang.Deprecated
    default void removeMediaRecorderFromCamera(org.webrtc.CameraVideoCapturer.MediaRecorderHandler r5) {
            r4 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            java.lang.String r2 = "Deprecated and not implemented."
            r1.<init>(r2)
            throw r0
    }
}
