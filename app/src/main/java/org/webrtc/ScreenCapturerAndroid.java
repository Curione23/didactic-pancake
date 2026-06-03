package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ScreenCapturerAndroid.class */
public class ScreenCapturerAndroid implements org.webrtc.VideoCapturer, org.webrtc.VideoSink {
    private static final int DISPLAY_FLAGS = 3;
    private static final int VIRTUAL_DISPLAY_DPI = 400;
    private final android.content.Intent mediaProjectionPermissionResultData;
    private final android.media.projection.MediaProjection.Callback mediaProjectionCallback;
    private int width;
    private int height;

    @androidx.annotation.Nullable
    private android.hardware.display.VirtualDisplay virtualDisplay;

    @androidx.annotation.Nullable
    private org.webrtc.SurfaceTextureHelper surfaceTextureHelper;

    @androidx.annotation.Nullable
    private org.webrtc.CapturerObserver capturerObserver;
    private long numCapturedFrames;

    @androidx.annotation.Nullable
    private android.media.projection.MediaProjection mediaProjection;
    private boolean isDisposed;

    @androidx.annotation.Nullable
    private android.media.projection.MediaProjectionManager mediaProjectionManager;


    public ScreenCapturerAndroid(android.content.Intent r4, android.media.projection.MediaProjection.Callback r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.mediaProjectionPermissionResultData = r1
            r0 = r3
            r1 = r5
            r0.mediaProjectionCallback = r1
            return
    }

    private void checkNotDisposed() {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isDisposed
            if (r0 == 0) goto L11
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "capturer is disposed."
            r1.<init>(r2)
            throw r0
        L11:
            return
    }

    @androidx.annotation.Nullable
    public android.media.projection.MediaProjection getMediaProjection() {
            r2 = this;
            r0 = r2
            android.media.projection.MediaProjection r0 = r0.mediaProjection
            return r0
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void initialize(org.webrtc.SurfaceTextureHelper r5, android.content.Context r6, org.webrtc.CapturerObserver r7) {
            r4 = this;
            r0 = r4
            r0.checkNotDisposed()
            r0 = r7
            if (r0 != 0) goto L12
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "capturerObserver not set."
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r4
            r1 = r7
            r0.capturerObserver = r1
            r0 = r5
            if (r0 != 0) goto L25
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "surfaceTextureHelper not set."
            r1.<init>(r2)
            throw r0
        L25:
            r0 = r4
            r1 = r5
            r0.surfaceTextureHelper = r1
            r0 = r4
            r1 = r6
            java.lang.String r2 = "media_projection"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.media.projection.MediaProjectionManager r1 = (android.media.projection.MediaProjectionManager) r1
            r0.mediaProjectionManager = r1
            return
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void startCapture(int r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r0.checkNotDisposed()
            r0 = r5
            r1 = r6
            r0.width = r1
            r0 = r5
            r1 = r7
            r0.height = r1
            r0 = r5
            r1 = r5
            android.media.projection.MediaProjectionManager r1 = r1.mediaProjectionManager
            r2 = -1
            r3 = r5
            android.content.Intent r3 = r3.mediaProjectionPermissionResultData
            android.media.projection.MediaProjection r1 = r1.getMediaProjection(r2, r3)
            r0.mediaProjection = r1
            r0 = r5
            android.media.projection.MediaProjection r0 = r0.mediaProjection
            r1 = r5
            android.media.projection.MediaProjection$Callback r1 = r1.mediaProjectionCallback
            r2 = r5
            org.webrtc.SurfaceTextureHelper r2 = r2.surfaceTextureHelper
            android.os.Handler r2 = r2.getHandler()
            r0.registerCallback(r1, r2)
            r0 = r5
            r0.updateVirtualDisplay()
            r0 = r5
            org.webrtc.CapturerObserver r0 = r0.capturerObserver
            r1 = 1
            r0.onCapturerStarted(r1)
            r0 = r5
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r1 = r5
            r0.startListening(r1)
            return
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void stopCapture() {
            r5 = this;
            r0 = r5
            r0.checkNotDisposed()
            r0 = r5
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            android.os.Handler r0 = r0.getHandler()
            org.webrtc.ScreenCapturerAndroid$1 r1 = new org.webrtc.ScreenCapturerAndroid$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            return
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void dispose() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.isDisposed = r1
            return
    }

    @Override // org.webrtc.VideoCapturer
    public synchronized void changeCaptureFormat(int r4, int r5, int r6) {
            r3 = this;
            r0 = r3
            r0.checkNotDisposed()
            r0 = r3
            r1 = r4
            r0.width = r1
            r0 = r3
            r1 = r5
            r0.height = r1
            r0 = r3
            android.hardware.display.VirtualDisplay r0 = r0.virtualDisplay
            if (r0 != 0) goto L16
            return
        L16:
            r0 = r3
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            android.os.Handler r0 = r0.getHandler()
            r1 = r3
            void r1 = r1::updateVirtualDisplay
            org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            return
    }

    private void updateVirtualDisplay() {
            r5 = this;
            r0 = r5
            org.webrtc.SurfaceTextureHelper r0 = r0.surfaceTextureHelper
            r1 = r5
            int r1 = r1.width
            r2 = r5
            int r2 = r2.height
            r0.setTextureSize(r1, r2)
            r0 = r5
            android.hardware.display.VirtualDisplay r0 = r0.virtualDisplay
            if (r0 == 0) goto L1e
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 >= r1) goto L25
        L1e:
            r0 = r5
            r0.createVirtualDisplay()
            goto L4c
        L25:
            r0 = r5
            android.hardware.display.VirtualDisplay r0 = r0.virtualDisplay
            r1 = r5
            int r1 = r1.width
            r2 = r5
            int r2 = r2.height
            r3 = 400(0x190, float:5.6E-43)
            r0.resize(r1, r2, r3)
            r0 = r5
            android.hardware.display.VirtualDisplay r0 = r0.virtualDisplay
            android.view.Surface r1 = new android.view.Surface
            r2 = r1
            r3 = r5
            org.webrtc.SurfaceTextureHelper r3 = r3.surfaceTextureHelper
            android.graphics.SurfaceTexture r3 = r3.getSurfaceTexture()
            r2.<init>(r3)
            r0.setSurface(r1)
        L4c:
            return
    }

    private void createVirtualDisplay() {
            r11 = this;
            r0 = r11
            android.hardware.display.VirtualDisplay r0 = r0.virtualDisplay
            if (r0 == 0) goto Le
            r0 = r11
            android.hardware.display.VirtualDisplay r0 = r0.virtualDisplay
            r0.release()
        Le:
            r0 = r11
            r1 = r11
            android.media.projection.MediaProjection r1 = r1.mediaProjection
            java.lang.String r2 = "WebRTC_ScreenCapture"
            r3 = r11
            int r3 = r3.width
            r4 = r11
            int r4 = r4.height
            r5 = 400(0x190, float:5.6E-43)
            r6 = 3
            android.view.Surface r7 = new android.view.Surface
            r8 = r7
            r9 = r11
            org.webrtc.SurfaceTextureHelper r9 = r9.surfaceTextureHelper
            android.graphics.SurfaceTexture r9 = r9.getSurfaceTexture()
            r8.<init>(r9)
            r8 = 0
            r9 = 0
            android.hardware.display.VirtualDisplay r1 = r1.createVirtualDisplay(r2, r3, r4, r5, r6, r7, r8, r9)
            r0.virtualDisplay = r1
            return
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame r7) {
            r6 = this;
            r0 = r6
            r1 = r0
            long r1 = r1.numCapturedFrames
            r2 = 1
            long r1 = r1 + r2
            r0.numCapturedFrames = r1
            r0 = r6
            org.webrtc.CapturerObserver r0 = r0.capturerObserver
            r1 = r7
            r0.onFrameCaptured(r1)
            return
    }

    @Override // org.webrtc.VideoCapturer
    public boolean isScreencast() {
            r2 = this;
            r0 = 1
            return r0
    }

    public long getNumCapturedFrames() {
            r3 = this;
            r0 = r3
            long r0 = r0.numCapturedFrames
            return r0
    }
}
