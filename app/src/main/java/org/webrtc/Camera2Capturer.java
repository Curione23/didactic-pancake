package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera2Capturer.class */
public class Camera2Capturer extends org.webrtc.CameraCapturer {
    private final android.content.Context context;

    @androidx.annotation.Nullable
    private final android.hardware.camera2.CameraManager cameraManager;

    public Camera2Capturer(android.content.Context r8, java.lang.String r9, org.webrtc.CameraVideoCapturer.CameraEventsHandler r10) {
            r7 = this;
            r0 = r7
            r1 = r9
            r2 = r10
            org.webrtc.Camera2Enumerator r3 = new org.webrtc.Camera2Enumerator
            r4 = r3
            r5 = r8
            r4.<init>(r5)
            r0.<init>(r1, r2, r3)
            r0 = r7
            r1 = r8
            r0.context = r1
            r0 = r7
            r1 = r8
            java.lang.String r2 = "camera"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.hardware.camera2.CameraManager r1 = (android.hardware.camera2.CameraManager) r1
            r0.cameraManager = r1
            return
    }

    @Override // org.webrtc.CameraCapturer
    protected void createCameraSession(org.webrtc.CameraSession.CreateSessionCallback r11, org.webrtc.CameraSession.Events r12, android.content.Context r13, org.webrtc.SurfaceTextureHelper r14, java.lang.String r15, int r16, int r17, int r18) {
            r10 = this;
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r10
            android.hardware.camera2.CameraManager r3 = r3.cameraManager
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.webrtc.Camera2Session.create(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // org.webrtc.CameraCapturer
    public /* bridge */ /* synthetic */ void printStackTrace() {
            r2 = this;
            r0 = r2
            super.printStackTrace()
            return
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ boolean isScreencast() {
            r2 = this;
            r0 = r2
            boolean r0 = super.isScreencast()
            return r0
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.switchCamera(r1, r2)
            return
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.CameraVideoCapturer
    public /* bridge */ /* synthetic */ void switchCamera(org.webrtc.CameraVideoCapturer.CameraSwitchHandler r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.switchCamera(r1)
            return
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void dispose() {
            r2 = this;
            r0 = r2
            super.dispose()
            return
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void changeCaptureFormat(int r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.changeCaptureFormat(r1, r2, r3)
            return
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void stopCapture() {
            r2 = this;
            r0 = r2
            super.stopCapture()
            return
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void startCapture(int r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.startCapture(r1, r2, r3)
            return
    }

    @Override // org.webrtc.CameraCapturer, org.webrtc.VideoCapturer
    public /* bridge */ /* synthetic */ void initialize(org.webrtc.SurfaceTextureHelper r6, android.content.Context r7, org.webrtc.CapturerObserver r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.initialize(r1, r2, r3)
            return
    }
}
