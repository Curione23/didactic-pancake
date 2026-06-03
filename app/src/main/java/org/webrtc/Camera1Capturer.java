package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Camera1Capturer.class */
public class Camera1Capturer extends org.webrtc.CameraCapturer {
    private final boolean captureToTexture;

    public Camera1Capturer(java.lang.String r8, org.webrtc.CameraVideoCapturer.CameraEventsHandler r9, boolean r10) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            org.webrtc.Camera1Enumerator r3 = new org.webrtc.Camera1Enumerator
            r4 = r3
            r5 = r10
            r4.<init>(r5)
            r0.<init>(r1, r2, r3)
            r0 = r7
            r1 = r10
            r0.captureToTexture = r1
            return
    }

    @Override // org.webrtc.CameraCapturer
    protected void createCameraSession(org.webrtc.CameraSession.CreateSessionCallback r11, org.webrtc.CameraSession.Events r12, android.content.Context r13, org.webrtc.SurfaceTextureHelper r14, java.lang.String r15, int r16, int r17, int r18) {
            r10 = this;
            r0 = r11
            r1 = r12
            r2 = r10
            boolean r2 = r2.captureToTexture
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.webrtc.Camera1Session.create(r0, r1, r2, r3, r4, r5, r6, r7, r8)
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
