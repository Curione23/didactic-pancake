package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SurfaceViewRenderer.class */
public class SurfaceViewRenderer extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback, org.webrtc.VideoSink, org.webrtc.RendererCommon.RendererEvents {
    private static final java.lang.String TAG = "SurfaceViewRenderer";
    private final java.lang.String resourceName;
    private final org.webrtc.RendererCommon.VideoLayoutMeasure videoLayoutMeasure;
    private final org.webrtc.SurfaceEglRenderer eglRenderer;
    private org.webrtc.RendererCommon.RendererEvents rendererEvents;
    private int rotatedFrameWidth;
    private int rotatedFrameHeight;
    private boolean enableFixedSize;
    private int surfaceWidth;
    private int surfaceHeight;

    public SurfaceViewRenderer(android.content.Context r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            r0.<init>(r1)
            r0 = r5
            org.webrtc.RendererCommon$VideoLayoutMeasure r1 = new org.webrtc.RendererCommon$VideoLayoutMeasure
            r2 = r1
            r2.<init>()
            r0.videoLayoutMeasure = r1
            r0 = r5
            r1 = r5
            java.lang.String r1 = r1.getResourceName()
            r0.resourceName = r1
            r0 = r5
            org.webrtc.SurfaceEglRenderer r1 = new org.webrtc.SurfaceEglRenderer
            r2 = r1
            r3 = r5
            java.lang.String r3 = r3.resourceName
            r2.<init>(r3)
            r0.eglRenderer = r1
            r0 = r5
            android.view.SurfaceHolder r0 = r0.getHolder()
            r1 = r5
            r0.addCallback(r1)
            r0 = r5
            android.view.SurfaceHolder r0 = r0.getHolder()
            r1 = r5
            org.webrtc.SurfaceEglRenderer r1 = r1.eglRenderer
            r0.addCallback(r1)
            return
    }

    public SurfaceViewRenderer(android.content.Context r6, android.util.AttributeSet r7) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r0.<init>(r1, r2)
            r0 = r5
            org.webrtc.RendererCommon$VideoLayoutMeasure r1 = new org.webrtc.RendererCommon$VideoLayoutMeasure
            r2 = r1
            r2.<init>()
            r0.videoLayoutMeasure = r1
            r0 = r5
            r1 = r5
            java.lang.String r1 = r1.getResourceName()
            r0.resourceName = r1
            r0 = r5
            org.webrtc.SurfaceEglRenderer r1 = new org.webrtc.SurfaceEglRenderer
            r2 = r1
            r3 = r5
            java.lang.String r3 = r3.resourceName
            r2.<init>(r3)
            r0.eglRenderer = r1
            r0 = r5
            android.view.SurfaceHolder r0 = r0.getHolder()
            r1 = r5
            r0.addCallback(r1)
            r0 = r5
            android.view.SurfaceHolder r0 = r0.getHolder()
            r1 = r5
            org.webrtc.SurfaceEglRenderer r1 = r1.eglRenderer
            r0.addCallback(r1)
            return
    }

    public void init(org.webrtc.EglBase.Context r8, org.webrtc.RendererCommon.RendererEvents r9) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            int[] r3 = org.webrtc.EglBase.CONFIG_PLAIN
            org.webrtc.GlRectDrawer r4 = new org.webrtc.GlRectDrawer
            r5 = r4
            r5.<init>()
            r0.init(r1, r2, r3, r4)
            return
    }

    public void init(org.webrtc.EglBase.Context r7, org.webrtc.RendererCommon.RendererEvents r8, int[] r9, org.webrtc.RendererCommon.GlDrawer r10) {
            r6 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r6
            r1 = r8
            r0.rendererEvents = r1
            r0 = r6
            r1 = 0
            r0.rotatedFrameWidth = r1
            r0 = r6
            r1 = 0
            r0.rotatedFrameHeight = r1
            r0 = r6
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r7
            r2 = r6
            r3 = r9
            r4 = r10
            r0.init(r1, r2, r3, r4)
            return
    }

    public void release() {
            r2 = this;
            r0 = r2
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r0.release()
            return
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener r6, float r7, org.webrtc.RendererCommon.GlDrawer r8) {
            r5 = this;
            r0 = r5
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r6
            r2 = r7
            r3 = r8
            r0.addFrameListener(r1, r2, r3)
            return
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener r5, float r6) {
            r4 = this;
            r0 = r4
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r5
            r2 = r6
            r0.addFrameListener(r1, r2)
            return
    }

    public void removeFrameListener(org.webrtc.EglRenderer.FrameListener r4) {
            r3 = this;
            r0 = r3
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r4
            r0.removeFrameListener(r1)
            return
    }

    public void setEnableHardwareScaler(boolean r4) {
            r3 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r3
            r1 = r4
            r0.enableFixedSize = r1
            r0 = r3
            r0.updateSurfaceSize()
            return
    }

    public void setMirror(boolean r4) {
            r3 = this;
            r0 = r3
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r4
            r0.setMirror(r1)
            return
    }

    public void setScalingType(org.webrtc.RendererCommon.ScalingType r4) {
            r3 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r3
            org.webrtc.RendererCommon$VideoLayoutMeasure r0 = r0.videoLayoutMeasure
            r1 = r4
            r0.setScalingType(r1)
            r0 = r3
            r0.requestLayout()
            return
    }

    public void setScalingType(org.webrtc.RendererCommon.ScalingType r5, org.webrtc.RendererCommon.ScalingType r6) {
            r4 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r4
            org.webrtc.RendererCommon$VideoLayoutMeasure r0 = r0.videoLayoutMeasure
            r1 = r5
            r2 = r6
            r0.setScalingType(r1, r2)
            r0 = r4
            r0.requestLayout()
            return
    }

    public void setFpsReduction(float r4) {
            r3 = this;
            r0 = r3
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r4
            r0.setFpsReduction(r1)
            return
    }

    public void disableFpsReduction() {
            r2 = this;
            r0 = r2
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r0.disableFpsReduction()
            return
    }

    public void pauseVideo() {
            r2 = this;
            r0 = r2
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r0.pauseVideo()
            return
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame r4) {
            r3 = this;
            r0 = r3
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r4
            r0.onFrame(r1)
            return
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int r7, int r8) {
            r6 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r6
            org.webrtc.RendererCommon$VideoLayoutMeasure r0 = r0.videoLayoutMeasure
            r1 = r7
            r2 = r8
            r3 = r6
            int r3 = r3.rotatedFrameWidth
            r4 = r6
            int r4 = r4.rotatedFrameHeight
            android.graphics.Point r0 = r0.measure(r1, r2, r3, r4)
            r9 = r0
            r0 = r6
            r1 = r9
            int r1 = r1.x
            r2 = r9
            int r2 = r2.y
            r0.setMeasuredDimension(r1, r2)
            r0 = r6
            r1 = r9
            int r1 = r1.x
            r2 = r9
            int r2 = r2.y
            java.lang.String r1 = "onMeasure(). New size: " + r1 + "x" + r2
            r0.logD(r1)
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
            r5 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r5
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r1 = r9
            r2 = r7
            int r1 = r1 - r2
            float r1 = (float) r1
            r2 = r10
            r3 = r8
            int r2 = r2 - r3
            float r2 = (float) r2
            float r1 = r1 / r2
            r0.setLayoutAspectRatio(r1)
            r0 = r5
            r0.updateSurfaceSize()
            return
    }

    private void updateSurfaceSize() {
            r10 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r10
            boolean r0 = r0.enableFixedSize
            if (r0 == 0) goto Lcd
            r0 = r10
            int r0 = r0.rotatedFrameWidth
            if (r0 == 0) goto Lcd
            r0 = r10
            int r0 = r0.rotatedFrameHeight
            if (r0 == 0) goto Lcd
            r0 = r10
            int r0 = r0.getWidth()
            if (r0 == 0) goto Lcd
            r0 = r10
            int r0 = r0.getHeight()
            if (r0 == 0) goto Lcd
            r0 = r10
            int r0 = r0.getWidth()
            float r0 = (float) r0
            r1 = r10
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            r11 = r0
            r0 = r10
            int r0 = r0.rotatedFrameWidth
            float r0 = (float) r0
            r1 = r10
            int r1 = r1.rotatedFrameHeight
            float r1 = (float) r1
            float r0 = r0 / r1
            r12 = r0
            r0 = r12
            r1 = r11
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L56
            r0 = r10
            int r0 = r0.rotatedFrameHeight
            float r0 = (float) r0
            r1 = r11
            float r0 = r0 * r1
            int r0 = (int) r0
            r13 = r0
            r0 = r10
            int r0 = r0.rotatedFrameHeight
            r14 = r0
            goto L65
        L56:
            r0 = r10
            int r0 = r0.rotatedFrameWidth
            r13 = r0
            r0 = r10
            int r0 = r0.rotatedFrameWidth
            float r0 = (float) r0
            r1 = r11
            float r0 = r0 / r1
            int r0 = (int) r0
            r14 = r0
        L65:
            r0 = r10
            int r0 = r0.getWidth()
            r1 = r13
            int r0 = java.lang.Math.min(r0, r1)
            r15 = r0
            r0 = r10
            int r0 = r0.getHeight()
            r1 = r14
            int r0 = java.lang.Math.min(r0, r1)
            r16 = r0
            r0 = r10
            r1 = r10
            int r1 = r1.getWidth()
            r2 = r10
            int r2 = r2.getHeight()
            r3 = r10
            int r3 = r3.rotatedFrameWidth
            r4 = r10
            int r4 = r4.rotatedFrameHeight
            r5 = r15
            r6 = r16
            r7 = r10
            int r7 = r7.surfaceWidth
            r8 = r10
            int r8 = r8.surfaceHeight
            java.lang.String r1 = "updateSurfaceSize. Layout size: " + r1 + "x" + r2 + ", frame size: " + r3 + "x" + r4 + ", requested surface size: " + r5 + "x" + r6 + ", old surface size: " + r7 + "x" + r8
            r0.logD(r1)
            r0 = r15
            r1 = r10
            int r1 = r1.surfaceWidth
            if (r0 != r1) goto Lb1
            r0 = r16
            r1 = r10
            int r1 = r1.surfaceHeight
            if (r0 == r1) goto Lca
        Lb1:
            r0 = r10
            r1 = r15
            r0.surfaceWidth = r1
            r0 = r10
            r1 = r16
            r0.surfaceHeight = r1
            r0 = r10
            android.view.SurfaceHolder r0 = r0.getHolder()
            r1 = r15
            r2 = r16
            r0.setFixedSize(r1, r2)
        Lca:
            goto Le0
        Lcd:
            r0 = r10
            r1 = r10
            r2 = 0
            r3 = r2; r2 = r1; r1 = r3; 
            r2.surfaceHeight = r3
            r0.surfaceWidth = r1
            r0 = r10
            android.view.SurfaceHolder r0 = r0.getHolder()
            r0.setSizeFromLayout()
        Le0:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r6) {
            r5 = this;
            org.webrtc.ThreadUtils.checkIsOnMainThread()
            r0 = r5
            r1 = r5
            r2 = 0
            r3 = r2; r2 = r1; r1 = r3; 
            r2.surfaceHeight = r3
            r0.surfaceWidth = r1
            r0 = r5
            r0.updateSurfaceSize()
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r2) {
            r1 = this;
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r2, int r3, int r4, int r5) {
            r1 = this;
            return
    }

    private java.lang.String getResourceName() {
            r3 = this;
            r0 = r3
            android.content.res.Resources r0 = r0.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Lc
            r1 = r3
            int r1 = r1.getId()     // Catch: android.content.res.Resources.NotFoundException -> Lc
            java.lang.String r0 = r0.getResourceEntryName(r1)     // Catch: android.content.res.Resources.NotFoundException -> Lc
            return r0
        Lc:
            r4 = move-exception
            java.lang.String r0 = ""
            return r0
    }

    public void clearImage() {
            r2 = this;
            r0 = r2
            org.webrtc.SurfaceEglRenderer r0 = r0.eglRenderer
            r0.clearImage()
            return
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
            r2 = this;
            r0 = r2
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents
            if (r0 == 0) goto L10
            r0 = r2
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents
            r0.onFirstFrameRendered()
        L10:
            return
    }

    @Override // org.webrtc.RendererCommon.RendererEvents
    public void onFrameResolutionChanged(int r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents
            if (r0 == 0) goto L13
            r0 = r5
            org.webrtc.RendererCommon$RendererEvents r0 = r0.rendererEvents
            r1 = r6
            r2 = r7
            r3 = r8
            r0.onFrameResolutionChanged(r1, r2, r3)
        L13:
            r0 = r8
            if (r0 == 0) goto L1e
            r0 = r8
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L22
        L1e:
            r0 = r6
            goto L23
        L22:
            r0 = r7
        L23:
            r9 = r0
            r0 = r8
            if (r0 == 0) goto L30
            r0 = r8
            r1 = 180(0xb4, float:2.52E-43)
            if (r0 != r1) goto L34
        L30:
            r0 = r7
            goto L35
        L34:
            r0 = r6
        L35:
            r10 = r0
            r0 = r5
            r1 = r5
            r2 = r9
            r3 = r10
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$onFrameResolutionChanged$0(r2, r3);
            }
            r0.postOrRun(r1)
            return
    }

    private void postOrRun(java.lang.Runnable r4) {
            r3 = this;
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            if (r0 != r1) goto L15
            r0 = r4
            r0.run()
            goto L1b
        L15:
            r0 = r3
            r1 = r4
            boolean r0 = r0.post(r1)
        L1b:
            return
    }

    private void logD(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SurfaceViewRenderer"
            r1 = r4
            java.lang.String r1 = r1.resourceName
            r2 = r5
            java.lang.String r1 = r1 + ": " + r2
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private /* synthetic */ void lambda$onFrameResolutionChanged$0(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.rotatedFrameWidth = r1
            r0 = r3
            r1 = r5
            r0.rotatedFrameHeight = r1
            r0 = r3
            r0.updateSurfaceSize()
            r0 = r3
            r0.requestLayout()
            return
    }
}
