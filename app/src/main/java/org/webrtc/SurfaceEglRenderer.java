package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SurfaceEglRenderer.class */
public class SurfaceEglRenderer extends org.webrtc.EglRenderer implements android.view.SurfaceHolder.Callback {
    private static final java.lang.String TAG = "SurfaceEglRenderer";
    private org.webrtc.RendererCommon.RendererEvents rendererEvents;
    private final java.lang.Object layoutLock;
    private boolean isRenderingPaused;
    private boolean isFirstFrameRendered;
    private int rotatedFrameWidth;
    private int rotatedFrameHeight;
    private int frameRotation;

    public SurfaceEglRenderer(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.layoutLock = r1
            return
    }

    public void init(org.webrtc.EglBase.Context r6, org.webrtc.RendererCommon.RendererEvents r7, int[] r8, org.webrtc.RendererCommon.GlDrawer r9) {
            r5 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r5
            r1 = r7
            r0.rendererEvents = r1
            r0 = r5
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            r0 = r5
            r1 = 0
            r0.isFirstFrameRendered = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            r1 = 0
            r0.rotatedFrameWidth = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            r1 = 0
            r0.rotatedFrameHeight = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            r1 = 0
            r0.frameRotation = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            goto L32
        L2a:
            r11 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = r11
            throw r0
        L32:
            r0 = r5
            r1 = r6
            r2 = r8
            r3 = r9
            super.init(r1, r2, r3)
            return
    }

    @Override // org.webrtc.EglRenderer
    public void init(org.webrtc.EglBase.Context r7, int[] r8, org.webrtc.RendererCommon.GlDrawer r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r4 = r9
            r0.init(r1, r2, r3, r4)
            return
    }

    @Override // org.webrtc.EglRenderer
    public void setFpsReduction(float r5) {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            r1 = r5
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r0.isRenderingPaused = r1     // Catch: java.lang.Throwable -> L1b
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            goto L20
        L1b:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            r0 = r7
            throw r0
        L20:
            r0 = r4
            r1 = r5
            super.setFpsReduction(r1)
            return
    }

    @Override // org.webrtc.EglRenderer
    public void disableFpsReduction() {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = 0
            r0.isRenderingPaused = r1     // Catch: java.lang.Throwable -> L11
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r0 = r5
            throw r0
        L16:
            r0 = r3
            super.disableFpsReduction()
            return
    }

    @Override // org.webrtc.EglRenderer
    public void pauseVideo() {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = 1
            r0.isRenderingPaused = r1     // Catch: java.lang.Throwable -> L11
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r0 = r5
            throw r0
        L16:
            r0 = r3
            super.pauseVideo()
            return
    }

    @Override // org.webrtc.EglRenderer, org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.updateFrameDimensionsAndReportEvents(r1)
            r0 = r3
            r1 = r4
            super.onFrame(r1)
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r4) {
            r3 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r3
            r1 = r4
            android.view.Surface r1 = r1.getSurface()
            r0.createEglSurface(r1)
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r5) {
            r4 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r6 = r0
            r0 = r4
            r1 = r6
            r2 = r1
            java.lang.Object r2 = java.util.Objects.requireNonNull(r2)
            void r1 = r1::countDown
            r0.releaseEglSurface(r1)
            r0 = r6
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r6, int r7, int r8, int r9) {
            r5 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r5
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.String r1 = "surfaceChanged: format: " + r1 + " size: " + r2 + "x" + r3
            r0.logD(r1)
            return
    }

    private void updateFrameDimensionsAndReportEvents(org.webrtc.VideoFrame r6) {
            r5 = this;
            r0 = r5
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            r0 = r5
            boolean r0 = r0.isRenderingPaused     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L11
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            return
        L11:
            r0 = r5
            boolean r0 = r0.isFirstFrameRendered     // Catch: java.lang.Throwable -> Lb6
            if (r0 != 0) goto L33
            r0 = r5
            r1 = 1
            r0.isFirstFrameRendered = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r5
            java.lang.String r1 = "Reporting first rendered frame."
            r0.logD(r1)     // Catch: java.lang.Throwable -> Lb6
            r0 = r5
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L33
            r0 = r5
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents     // Catch: java.lang.Throwable -> Lb6
            r0.onFirstFrameRendered()     // Catch: java.lang.Throwable -> Lb6
        L33:
            r0 = r5
            int r0 = r0.rotatedFrameWidth     // Catch: java.lang.Throwable -> Lb6
            r1 = r6
            int r1 = r1.getRotatedWidth()     // Catch: java.lang.Throwable -> Lb6
            if (r0 != r1) goto L54
            r0 = r5
            int r0 = r0.rotatedFrameHeight     // Catch: java.lang.Throwable -> Lb6
            r1 = r6
            int r1 = r1.getRotatedHeight()     // Catch: java.lang.Throwable -> Lb6
            if (r0 != r1) goto L54
            r0 = r5
            int r0 = r0.frameRotation     // Catch: java.lang.Throwable -> Lb6
            r1 = r6
            int r1 = r1.getRotation()     // Catch: java.lang.Throwable -> Lb6
            if (r0 == r1) goto Lb1
        L54:
            r0 = r5
            r1 = r6
            org.webrtc.VideoFrame$Buffer r1 = r1.getBuffer()     // Catch: java.lang.Throwable -> Lb6
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lb6
            r2 = r6
            org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> Lb6
            int r2 = r2.getHeight()     // Catch: java.lang.Throwable -> Lb6
            r3 = r6
            int r3 = r3.getRotation()     // Catch: java.lang.Throwable -> Lb6
            java.lang.String r1 = "Reporting frame resolution changed to " + r1 + "x" + r2 + " with rotation " + r3     // Catch: java.lang.Throwable -> Lb6
            r0.logD(r1)     // Catch: java.lang.Throwable -> Lb6
            r0 = r5
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L99
            r0 = r5
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents     // Catch: java.lang.Throwable -> Lb6
            r1 = r6
            org.webrtc.VideoFrame$Buffer r1 = r1.getBuffer()     // Catch: java.lang.Throwable -> Lb6
            int r1 = r1.getWidth()     // Catch: java.lang.Throwable -> Lb6
            r2 = r6
            org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()     // Catch: java.lang.Throwable -> Lb6
            int r2 = r2.getHeight()     // Catch: java.lang.Throwable -> Lb6
            r3 = r6
            int r3 = r3.getRotation()     // Catch: java.lang.Throwable -> Lb6
            r0.onFrameResolutionChanged(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb6
        L99:
            r0 = r5
            r1 = r6
            int r1 = r1.getRotatedWidth()     // Catch: java.lang.Throwable -> Lb6
            r0.rotatedFrameWidth = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r5
            r1 = r6
            int r1 = r1.getRotatedHeight()     // Catch: java.lang.Throwable -> Lb6
            r0.rotatedFrameHeight = r1     // Catch: java.lang.Throwable -> Lb6
            r0 = r5
            r1 = r6
            int r1 = r1.getRotation()     // Catch: java.lang.Throwable -> Lb6
            r0.frameRotation = r1     // Catch: java.lang.Throwable -> Lb6
        Lb1:
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            goto Lbb
        Lb6:
            r8 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb6
            r0 = r8
            throw r0
        Lbb:
            return
    }

    private void logD(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SurfaceEglRenderer"
            r1 = r4
            java.lang.String r1 = r1.name
            r2 = r5
            java.lang.String r1 = r1 + ": " + r2
            org.webrtc.Logging.d(r0, r1)
            return
    }
}
