package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglRenderer.class */
public class EglRenderer implements org.webrtc.VideoSink {
    private static final java.lang.String TAG = "EglRenderer";
    private static final long LOG_INTERVAL_SEC = 4;
    protected final java.lang.String name;
    private final java.lang.Object threadLock;

    @androidx.annotation.Nullable
    @androidx.annotation.GuardedBy("threadLock")
    private org.webrtc.EglThread eglThread;
    private final java.lang.Runnable eglExceptionCallback;
    private final java.util.ArrayList<org.webrtc.EglRenderer.FrameListenerAndParams> frameListeners;
    private volatile org.webrtc.EglRenderer.ErrorCallback errorCallback;
    private final java.lang.Object fpsReductionLock;
    private long nextFrameTimeNs;
    private long minRenderPeriodNs;

    @androidx.annotation.Nullable
    private org.webrtc.EglBase eglBase;
    private final org.webrtc.VideoFrameDrawer frameDrawer;

    @androidx.annotation.Nullable
    private org.webrtc.RendererCommon.GlDrawer drawer;
    private boolean usePresentationTimeStamp;
    private final android.graphics.Matrix drawMatrix;
    private final java.lang.Object frameLock;

    @androidx.annotation.Nullable
    private org.webrtc.VideoFrame pendingFrame;
    private final java.lang.Object layoutLock;
    private float layoutAspectRatio;
    private boolean mirrorHorizontally;
    private boolean mirrorVertically;
    private final java.lang.Object statisticsLock;
    private int framesReceived;
    private int framesDropped;
    private int framesRendered;
    private long statisticsStartTimeNs;
    private long renderTimeNs;
    private long renderSwapBufferTimeNs;
    private final org.webrtc.GlTextureFrameBuffer bitmapTextureFramebuffer;
    private final java.lang.Runnable logStatisticsRunnable;
    private final org.webrtc.EglRenderer.EglSurfaceCreation eglSurfaceCreationRunnable;



    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglRenderer$EglSurfaceCreation.class */
    private class EglSurfaceCreation implements java.lang.Runnable {
        private java.lang.Object surface;
        final /* synthetic */ org.webrtc.EglRenderer this$0;

        private EglSurfaceCreation(org.webrtc.EglRenderer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.this$0 = r1
                r0 = r3
                r0.<init>()
                return
        }

        public synchronized void setSurface(java.lang.Object r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.surface = r1
                return
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
                r4 = this;
                r0 = r4
                java.lang.Object r0 = r0.surface
                if (r0 == 0) goto L84
                r0 = r4
                org.webrtc.EglRenderer r0 = r0.this$0
                org.webrtc.EglBase r0 = r0.eglBase
                if (r0 == 0) goto L84
                r0 = r4
                org.webrtc.EglRenderer r0 = r0.this$0
                org.webrtc.EglBase r0 = r0.eglBase
                boolean r0 = r0.hasSurface()
                if (r0 != 0) goto L84
                r0 = r4
                java.lang.Object r0 = r0.surface
                boolean r0 = r0 instanceof android.view.Surface
                if (r0 == 0) goto L40
                r0 = r4
                org.webrtc.EglRenderer r0 = r0.this$0
                org.webrtc.EglBase r0 = r0.eglBase
                r1 = r4
                java.lang.Object r1 = r1.surface
                android.view.Surface r1 = (android.view.Surface) r1
                r0.createSurface(r1)
                goto L71
            L40:
                r0 = r4
                java.lang.Object r0 = r0.surface
                boolean r0 = r0 instanceof android.graphics.SurfaceTexture
                if (r0 == 0) goto L60
                r0 = r4
                org.webrtc.EglRenderer r0 = r0.this$0
                org.webrtc.EglBase r0 = r0.eglBase
                r1 = r4
                java.lang.Object r1 = r1.surface
                android.graphics.SurfaceTexture r1 = (android.graphics.SurfaceTexture) r1
                r0.createSurface(r1)
                goto L71
            L60:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r1 = r0
                r2 = r4
                java.lang.Object r2 = r2.surface
                java.lang.String r2 = "Invalid surface: " + r2
                r1.<init>(r2)
                throw r0
            L71:
                r0 = r4
                org.webrtc.EglRenderer r0 = r0.this$0
                org.webrtc.EglBase r0 = r0.eglBase
                r0.makeCurrent()
                r0 = 3317(0xcf5, float:4.648E-42)
                r1 = 1
                android.opengl.GLES20.glPixelStorei(r0, r1)
            L84:
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglRenderer$ErrorCallback.class */
    public interface ErrorCallback {
        void onGlOutOfMemory();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglRenderer$FrameListener.class */
    public interface FrameListener {
        void onFrame(android.graphics.Bitmap r1);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglRenderer$FrameListenerAndParams.class */
    private static class FrameListenerAndParams {
        public final org.webrtc.EglRenderer.FrameListener listener;
        public final float scale;
        public final org.webrtc.RendererCommon.GlDrawer drawer;
        public final boolean applyFpsReduction;

        public FrameListenerAndParams(org.webrtc.EglRenderer.FrameListener r4, float r5, org.webrtc.RendererCommon.GlDrawer r6, boolean r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.listener = r1
                r0 = r3
                r1 = r5
                r0.scale = r1
                r0 = r3
                r1 = r6
                r0.drawer = r1
                r0 = r3
                r1 = r7
                r0.applyFpsReduction = r1
                return
        }
    }

    public EglRenderer(java.lang.String r6) {
            r5 = this;
            r0 = r5
            r1 = r6
            org.webrtc.VideoFrameDrawer r2 = new org.webrtc.VideoFrameDrawer
            r3 = r2
            r3.<init>()
            r0.<init>(r1, r2)
            return
    }

    public EglRenderer(java.lang.String r6, org.webrtc.VideoFrameDrawer r7) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.threadLock = r1
            r0 = r5
            org.webrtc.EglRenderer$1 r1 = new org.webrtc.EglRenderer$1
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.eglExceptionCallback = r1
            r0 = r5
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.frameListeners = r1
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.fpsReductionLock = r1
            r0 = r5
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r2 = r1
            r2.<init>()
            r0.drawMatrix = r1
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.frameLock = r1
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.layoutLock = r1
            r0 = r5
            java.lang.Object r1 = new java.lang.Object
            r2 = r1
            r2.<init>()
            r0.statisticsLock = r1
            r0 = r5
            org.webrtc.GlTextureFrameBuffer r1 = new org.webrtc.GlTextureFrameBuffer
            r2 = r1
            r3 = 6408(0x1908, float:8.98E-42)
            r2.<init>(r3)
            r0.bitmapTextureFramebuffer = r1
            r0 = r5
            org.webrtc.EglRenderer$2 r1 = new org.webrtc.EglRenderer$2
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.logStatisticsRunnable = r1
            r0 = r5
            org.webrtc.EglRenderer$EglSurfaceCreation r1 = new org.webrtc.EglRenderer$EglSurfaceCreation
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.eglSurfaceCreationRunnable = r1
            r0 = r5
            r1 = r6
            r0.name = r1
            r0 = r5
            r1 = r7
            r0.frameDrawer = r1
            return
    }

    public void init(org.webrtc.EglThread r7, org.webrtc.RendererCommon.GlDrawer r8, boolean r9) {
            r6 = this;
            r0 = r6
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            r0 = r6
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L20
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L77
            r1 = r0
            r2 = r6
            java.lang.String r2 = r2.name     // Catch: java.lang.Throwable -> L77
            java.lang.String r2 = r2 + "Already initialized"     // Catch: java.lang.Throwable -> L77
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L77
            throw r0     // Catch: java.lang.Throwable -> L77
        L20:
            r0 = r6
            java.lang.String r1 = "Initializing EglRenderer"
            r0.logD(r1)     // Catch: java.lang.Throwable -> L77
            r0 = r6
            r1 = r7
            r0.eglThread = r1     // Catch: java.lang.Throwable -> L77
            r0 = r6
            r1 = r8
            r0.drawer = r1     // Catch: java.lang.Throwable -> L77
            r0 = r6
            r1 = r9
            r0.usePresentationTimeStamp = r1     // Catch: java.lang.Throwable -> L77
            r0 = r7
            r1 = r6
            java.lang.Runnable r1 = r1.eglExceptionCallback     // Catch: java.lang.Throwable -> L77
            r0.addExceptionCallback(r1)     // Catch: java.lang.Throwable -> L77
            r0 = r6
            r1 = r7
            org.webrtc.EglBase r1 = r1.createEglBaseWithSharedConnection()     // Catch: java.lang.Throwable -> L77
            r0.eglBase = r1     // Catch: java.lang.Throwable -> L77
            r0 = r7
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L77
            r1 = r6
            org.webrtc.EglRenderer$EglSurfaceCreation r1 = r1.eglSurfaceCreationRunnable     // Catch: java.lang.Throwable -> L77
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> L77
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L77
            r11 = r0
            r0 = r6
            r1 = r11
            r0.resetStatistics(r1)     // Catch: java.lang.Throwable -> L77
            r0 = r7
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L77
            r1 = r6
            java.lang.Runnable r1 = r1.logStatisticsRunnable     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L77
            r3 = 4
            long r2 = r2.toMillis(r3)     // Catch: java.lang.Throwable -> L77
            boolean r0 = r0.postDelayed(r1, r2)     // Catch: java.lang.Throwable -> L77
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            goto L7f
        L77:
            r13 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L77
            r0 = r13
            throw r0
        L7f:
            return
    }

    public void init(@androidx.annotation.Nullable org.webrtc.EglBase.Context r6, int[] r7, org.webrtc.RendererCommon.GlDrawer r8, boolean r9) {
            r5 = this;
            r0 = 0
            r1 = r6
            r2 = r7
            org.webrtc.EglThread r0 = org.webrtc.EglThread.create(r0, r1, r2)
            r10 = r0
            r0 = r5
            r1 = r10
            r2 = r8
            r3 = r9
            r0.init(r1, r2, r3)
            return
    }

    public void init(@androidx.annotation.Nullable org.webrtc.EglBase.Context r7, int[] r8, org.webrtc.RendererCommon.GlDrawer r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            r0.init(r1, r2, r3, r4)
            return
    }

    public void createEglSurface(android.view.Surface r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.createEglSurfaceInternal(r1)
            return
    }

    public void createEglSurface(android.graphics.SurfaceTexture r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.createEglSurfaceInternal(r1)
            return
    }

    private void createEglSurfaceInternal(java.lang.Object r4) {
            r3 = this;
            r0 = r3
            org.webrtc.EglRenderer$EglSurfaceCreation r0 = r0.eglSurfaceCreationRunnable
            r1 = r4
            r0.setSurface(r1)
            r0 = r3
            r1 = r3
            org.webrtc.EglRenderer$EglSurfaceCreation r1 = r1.eglSurfaceCreationRunnable
            r0.postToRenderThread(r1)
            return
    }

    public void release() {
            r4 = this;
            r0 = r4
            java.lang.String r1 = "Releasing."
            r0.logD(r1)
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r5 = r0
            r0 = r4
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L26
            r0 = r4
            java.lang.String r1 = "Already released"
            r0.logD(r1)     // Catch: java.lang.Throwable -> L62
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return
        L26:
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L62
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L62
            r1 = r4
            java.lang.Runnable r1 = r1.logStatisticsRunnable     // Catch: java.lang.Throwable -> L62
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L62
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L62
            r1 = r4
            java.lang.Runnable r1 = r1.eglExceptionCallback     // Catch: java.lang.Throwable -> L62
            r0.removeExceptionCallback(r1)     // Catch: java.lang.Throwable -> L62
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L62
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L62
            r1 = r4
            r2 = r5
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$release$0(r2);
            }     // Catch: java.lang.Throwable -> L62
            boolean r0 = r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L62
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L62
            r0.release()     // Catch: java.lang.Throwable -> L62
            r0 = r4
            r1 = 0
            r0.eglThread = r1     // Catch: java.lang.Throwable -> L62
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            goto L67
        L62:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            r0 = r7
            throw r0
        L67:
            r0 = r5
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            r0 = r4
            java.lang.Object r0 = r0.frameLock
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            org.webrtc.VideoFrame r0 = r0.pendingFrame     // Catch: java.lang.Throwable -> L8a
            if (r0 == 0) goto L85
            r0 = r4
            org.webrtc.VideoFrame r0 = r0.pendingFrame     // Catch: java.lang.Throwable -> L8a
            r0.release()     // Catch: java.lang.Throwable -> L8a
            r0 = r4
            r1 = 0
            r0.pendingFrame = r1     // Catch: java.lang.Throwable -> L8a
        L85:
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            goto L91
        L8a:
            r8 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8a
            r0 = r8
            throw r0
        L91:
            r0 = r4
            java.lang.String r1 = "Releasing done."
            r0.logD(r1)
            return
    }

    private void resetStatistics(long r5) {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.statisticsLock
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            r0 = r4
            r1 = r5
            r0.statisticsStartTimeNs = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            r1 = 0
            r0.framesReceived = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            r1 = 0
            r0.framesDropped = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            r1 = 0
            r0.framesRendered = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            r1 = 0
            r0.renderTimeNs = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            r1 = 0
            r0.renderSwapBufferTimeNs = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r8 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = r8
            throw r0
        L31:
            return
    }

    public void printStackTrace() {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L62
            if (r0 != 0) goto L12
            r0 = 0
            goto L1f
        L12:
            r0 = r3
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L62
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L62
            android.os.Looper r0 = r0.getLooper()     // Catch: java.lang.Throwable -> L62
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Throwable -> L62
        L1f:
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L5d
            r0 = r5
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L62
            r6 = r0
            r0 = r6
            int r0 = r0.length     // Catch: java.lang.Throwable -> L62
            if (r0 <= 0) goto L5d
            r0 = r3
            java.lang.String r1 = "EglRenderer stack trace:"
            r0.logW(r1)     // Catch: java.lang.Throwable -> L62
            r0 = r6
            r7 = r0
            r0 = r7
            int r0 = r0.length     // Catch: java.lang.Throwable -> L62
            r8 = r0
            r0 = 0
            r9 = r0
        L40:
            r0 = r9
            r1 = r8
            if (r0 >= r1) goto L5d
            r0 = r7
            r1 = r9
            r0 = r0[r1]     // Catch: java.lang.Throwable -> L62
            r10 = r0
            r0 = r3
            r1 = r10
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L62
            r0.logW(r1)     // Catch: java.lang.Throwable -> L62
            int r9 = r9 + 1
            goto L40
        L5d:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            goto L69
        L62:
            r11 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            r0 = r11
            throw r0
        L69:
            return
    }

    public void setMirror(boolean r4) {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = r4
            r0.mirrorHorizontally = r1     // Catch: java.lang.Throwable -> L11
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r0 = r6
            throw r0
        L16:
            return
    }

    public void setMirrorVertically(boolean r4) {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = r4
            r0.mirrorVertically = r1     // Catch: java.lang.Throwable -> L11
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r0 = r6
            throw r0
        L16:
            return
    }

    public void setLayoutAspectRatio(float r4) {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            r1 = r4
            r0.layoutAspectRatio = r1     // Catch: java.lang.Throwable -> L11
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            r0 = r6
            throw r0
        L16:
            return
    }

    public void setFpsReduction(float r6) {
            r5 = this;
            r0 = r5
            java.lang.Object r0 = r0.fpsReductionLock
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            r0 = r5
            long r0 = r0.minRenderPeriodNs     // Catch: java.lang.Throwable -> L40
            r8 = r0
            r0 = r6
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L1c
            r0 = r5
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r0.minRenderPeriodNs = r1     // Catch: java.lang.Throwable -> L40
            goto L2b
        L1c:
            r0 = r5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L40
            r2 = 1
            long r1 = r1.toNanos(r2)     // Catch: java.lang.Throwable -> L40
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L40
            r2 = r6
            float r1 = r1 / r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L40
            r0.minRenderPeriodNs = r1     // Catch: java.lang.Throwable -> L40
        L2b:
            r0 = r5
            long r0 = r0.minRenderPeriodNs     // Catch: java.lang.Throwable -> L40
            r1 = r8
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L3b
            r0 = r5
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L40
            r0.nextFrameTimeNs = r1     // Catch: java.lang.Throwable -> L40
        L3b:
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            goto L47
        L40:
            r10 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L40
            r0 = r10
            throw r0
        L47:
            return
    }

    public void disableFpsReduction() {
            r3 = this;
            r0 = r3
            r1 = 2139095040(0x7f800000, float:Infinity)
            r0.setFpsReduction(r1)
            return
    }

    public void pauseVideo() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.setFpsReduction(r1)
            return
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener r7, float r8) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = 0
            r0.addFrameListener(r1, r2, r3, r4)
            return
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener r7, float r8, org.webrtc.RendererCommon.GlDrawer r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            r0.addFrameListener(r1, r2, r3, r4)
            return
    }

    public void addFrameListener(org.webrtc.EglRenderer.FrameListener r8, float r9, @androidx.annotation.Nullable org.webrtc.RendererCommon.GlDrawer r10, boolean r11) {
            r7 = this;
            r0 = r7
            r1 = r7
            r2 = r10
            r3 = r8
            r4 = r9
            r5 = r11
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$addFrameListener$1(r2, r3, r4, r5);
            }
            r0.postToRenderThread(r1)
            return
    }

    public void removeFrameListener(org.webrtc.EglRenderer.FrameListener r6) {
            r5 = this;
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = r0
            r2 = 1
            r1.<init>(r2)
            r7 = r0
            r0 = r5
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            r0 = r5
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L49
            if (r0 != 0) goto L1a
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            return
        L1a:
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L49
            r1 = r5
            org.webrtc.EglThread r1 = r1.eglThread     // Catch: java.lang.Throwable -> L49
            android.os.Handler r1 = r1.getHandler()     // Catch: java.lang.Throwable -> L49
            android.os.Looper r1 = r1.getLooper()     // Catch: java.lang.Throwable -> L49
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L49
            if (r0 != r1) goto L38
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L49
            r1 = r0
            java.lang.String r2 = "removeFrameListener must not be called on the render thread."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L49
            throw r0     // Catch: java.lang.Throwable -> L49
        L38:
            r0 = r5
            r1 = r5
            r2 = r7
            r3 = r6
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$removeFrameListener$2(r2, r3);
            }     // Catch: java.lang.Throwable -> L49
            r0.postToRenderThread(r1)     // Catch: java.lang.Throwable -> L49
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            goto L50
        L49:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            r0 = r9
            throw r0
        L50:
            r0 = r7
            org.webrtc.ThreadUtils.awaitUninterruptibly(r0)
            return
    }

    public void setErrorCallback(org.webrtc.EglRenderer.ErrorCallback r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.errorCallback = r1
            return
    }

    @Override // org.webrtc.VideoSink
    public void onFrame(org.webrtc.VideoFrame r5) {
            r4 = this;
            r0 = r4
            java.lang.Object r0 = r0.statisticsLock
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            r1 = r0
            int r1 = r1.framesReceived     // Catch: java.lang.Throwable -> L16
            r2 = 1
            int r1 = r1 + r2
            r0.framesReceived = r1     // Catch: java.lang.Throwable -> L16
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1b
        L16:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r0 = r7
            throw r0
        L1b:
            r0 = r4
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L83
            if (r0 != 0) goto L33
            r0 = r4
            java.lang.String r1 = "Dropping frame - Not initialized or already released."
            r0.logD(r1)     // Catch: java.lang.Throwable -> L83
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return
        L33:
            r0 = r4
            java.lang.Object r0 = r0.frameLock     // Catch: java.lang.Throwable -> L83
            r1 = r0
            r8 = r1
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L83
            r0 = r4
            org.webrtc.VideoFrame r0 = r0.pendingFrame     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            if (r0 == 0) goto L46
            r0 = 1
            goto L47
        L46:
            r0 = 0
        L47:
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L53
            r0 = r4
            org.webrtc.VideoFrame r0 = r0.pendingFrame     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            r0.release()     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
        L53:
            r0 = r4
            r1 = r5
            r0.pendingFrame = r1     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            r0 = r4
            org.webrtc.VideoFrame r0 = r0.pendingFrame     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            r0.retain()     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            r1 = r4
            void r1 = r1::renderFrameOnRenderThread     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            goto L7e
        L76:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L83
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L83
        L7e:
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            goto L8a
        L83:
            r10 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            r0 = r10
            throw r0
        L8a:
            r0 = r6
            if (r0 == 0) goto Lab
            r0 = r4
            java.lang.Object r0 = r0.statisticsLock
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            r0 = r4
            r1 = r0
            int r1 = r1.framesDropped     // Catch: java.lang.Throwable -> La4
            r2 = 1
            int r1 = r1 + r2
            r0.framesDropped = r1     // Catch: java.lang.Throwable -> La4
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            goto Lab
        La4:
            r11 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La4
            r0 = r11
            throw r0
        Lab:
            return
    }

    public void releaseEglSurface(java.lang.Runnable r5) {
            r4 = this;
            r0 = r4
            org.webrtc.EglRenderer$EglSurfaceCreation r0 = r0.eglSurfaceCreationRunnable
            r1 = 0
            r0.setSurface(r1)
            r0 = r4
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r6 = r1
            monitor-enter(r0)
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L39
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L3e
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L3e
            r1 = r4
            org.webrtc.EglRenderer$EglSurfaceCreation r1 = r1.eglSurfaceCreationRunnable     // Catch: java.lang.Throwable -> L3e
            r0.removeCallbacks(r1)     // Catch: java.lang.Throwable -> L3e
            r0 = r4
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L3e
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L3e
            r1 = r4
            r2 = r5
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$releaseEglSurface$3(r2);
            }     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L3e
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L39:
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            goto L43
        L3e:
            r7 = move-exception
            r0 = r6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            r0 = r7
            throw r0
        L43:
            r0 = r5
            r0.run()
            return
    }

    private void postToRenderThread(java.lang.Runnable r4) {
            r3 = this;
            r0 = r3
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L1a
            r0 = r3
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L1f
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L1f
            r1 = r4
            boolean r0 = r0.post(r1)     // Catch: java.lang.Throwable -> L1f
        L1a:
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            goto L24
        L1f:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            r0 = r6
            throw r0
        L24:
            return
    }

    private void clearSurfaceOnRenderThread(float r6, float r7, float r8, float r9) {
            r5 = this;
            r0 = r5
            org.webrtc.EglBase r0 = r0.eglBase
            if (r0 == 0) goto L3a
            r0 = r5
            org.webrtc.EglBase r0 = r0.eglBase
            boolean r0 = r0.hasSurface()
            if (r0 == 0) goto L3a
            r0 = r5
            java.lang.String r1 = "clearSurface"
            r0.logD(r1)
            r0 = r5
            org.webrtc.EglBase r0 = r0.eglBase
            r0.makeCurrent()
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            android.opengl.GLES20.glClearColor(r0, r1, r2, r3)
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)
            r0 = r5
            org.webrtc.EglBase r0 = r0.eglBase
            r0.swapBuffers()
        L3a:
            return
    }

    public void clearImage() {
            r6 = this;
            r0 = r6
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.clearImage(r1, r2, r3, r4)
            return
    }

    public void clearImage(float r8, float r9, float r10, float r11) {
            r7 = this;
            r0 = r7
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r12 = r1
            monitor-enter(r0)
            r0 = r7
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L2f
            if (r0 != 0) goto L13
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L13:
            r0 = r7
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L2f
            android.os.Handler r0 = r0.getHandler()     // Catch: java.lang.Throwable -> L2f
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$clearImage$4(r2, r3, r4, r5);
            }     // Catch: java.lang.Throwable -> L2f
            boolean r0 = r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L2f
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            goto L37
        L2f:
            r13 = move-exception
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            r0 = r13
            throw r0
        L37:
            return
    }

    private void swapBuffersOnRenderThread(org.webrtc.VideoFrame r7, long r8) {
            r6 = this;
            r0 = r6
            java.lang.Object r0 = r0.threadLock
            r1 = r0
            r10 = r1
            monitor-enter(r0)
            r0 = r6
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L24
            if (r0 == 0) goto L1e
            r0 = r6
            org.webrtc.EglThread r0 = r0.eglThread     // Catch: java.lang.Throwable -> L24
            r1 = r6
            r2 = r7
            r3 = r8
            void r1 = (v3) -> { // org.webrtc.EglThread.RenderUpdate.update(boolean):void
                r1.lambda$swapBuffersOnRenderThread$5(r2, r3, v3);
            }     // Catch: java.lang.Throwable -> L24
            r0.scheduleRenderUpdate(r1)     // Catch: java.lang.Throwable -> L24
        L1e:
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L2c
        L24:
            r11 = move-exception
            r0 = r10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            r0 = r11
            throw r0
        L2c:
            return
    }

    private void renderFrameOnRenderThread() {
            r9 = this;
            r0 = r9
            java.lang.Object r0 = r0.frameLock
            r1 = r0
            r11 = r1
            monitor-enter(r0)
            r0 = r9
            org.webrtc.VideoFrame r0 = r0.pendingFrame     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L11
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            return
        L11:
            r0 = r9
            org.webrtc.VideoFrame r0 = r0.pendingFrame     // Catch: java.lang.Throwable -> L20
            r10 = r0
            r0 = r9
            r1 = 0
            r0.pendingFrame = r1     // Catch: java.lang.Throwable -> L20
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            goto L25
        L20:
            r12 = move-exception
            r0 = r11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r12
            throw r0
        L25:
            r0 = r9
            org.webrtc.EglBase r0 = r0.eglBase
            if (r0 == 0) goto L38
            r0 = r9
            org.webrtc.EglBase r0 = r0.eglBase
            boolean r0 = r0.hasSurface()
            if (r0 != 0) goto L44
        L38:
            r0 = r9
            java.lang.String r1 = "Dropping frame - No surface"
            r0.logD(r1)
            r0 = r10
            r0.release()
            return
        L44:
            r0 = r9
            org.webrtc.EglBase r0 = r0.eglBase
            r0.makeCurrent()
            r0 = r9
            java.lang.Object r0 = r0.fpsReductionLock
            r1 = r0
            r12 = r1
            monitor-enter(r0)
            r0 = r9
            long r0 = r0.minRenderPeriodNs     // Catch: java.lang.Throwable -> Lae
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L64
            r0 = 0
            r11 = r0
            goto La9
        L64:
            r0 = r9
            long r0 = r0.minRenderPeriodNs     // Catch: java.lang.Throwable -> Lae
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L72
            r0 = 1
            r11 = r0
            goto La9
        L72:
            long r0 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> Lae
            r13 = r0
            r0 = r13
            r1 = r9
            long r1 = r1.nextFrameTimeNs     // Catch: java.lang.Throwable -> Lae
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L8d
            r0 = r9
            java.lang.String r1 = "Skipping frame rendering - fps reduction is active."
            r0.logD(r1)     // Catch: java.lang.Throwable -> Lae
            r0 = 0
            r11 = r0
            goto La9
        L8d:
            r0 = r9
            r1 = r0
            long r1 = r1.nextFrameTimeNs     // Catch: java.lang.Throwable -> Lae
            r2 = r9
            long r2 = r2.minRenderPeriodNs     // Catch: java.lang.Throwable -> Lae
            long r1 = r1 + r2
            r0.nextFrameTimeNs = r1     // Catch: java.lang.Throwable -> Lae
            r0 = r9
            r1 = r9
            long r1 = r1.nextFrameTimeNs     // Catch: java.lang.Throwable -> Lae
            r2 = r13
            long r1 = java.lang.Math.max(r1, r2)     // Catch: java.lang.Throwable -> Lae
            r0.nextFrameTimeNs = r1     // Catch: java.lang.Throwable -> Lae
            r0 = 1
            r11 = r0
        La9:
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            goto Lb5
        Lae:
            r15 = move-exception
            r0 = r12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lae
            r0 = r15
            throw r0
        Lb5:
            long r0 = java.lang.System.nanoTime()
            r12 = r0
            r0 = r10
            int r0 = r0.getRotatedWidth()
            float r0 = (float) r0
            r1 = r10
            int r1 = r1.getRotatedHeight()
            float r1 = (float) r1
            float r0 = r0 / r1
            r14 = r0
            r0 = r9
            java.lang.Object r0 = r0.layoutLock
            r1 = r0
            r16 = r1
            monitor-enter(r0)
            r0 = r9
            float r0 = r0.layoutAspectRatio     // Catch: java.lang.Throwable -> Le8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lde
            r0 = r9
            float r0 = r0.layoutAspectRatio     // Catch: java.lang.Throwable -> Le8
            goto Le0
        Lde:
            r0 = r14
        Le0:
            r15 = r0
            r0 = r16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le8
            goto Lf0
        Le8:
            r17 = move-exception
            r0 = r16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le8
            r0 = r17
            throw r0
        Lf0:
            r0 = r14
            r1 = r15
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L105
            r0 = r15
            r1 = r14
            float r0 = r0 / r1
            r16 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r17 = r0
            goto L10f
        L105:
            r0 = 1065353216(0x3f800000, float:1.0)
            r16 = r0
            r0 = r14
            r1 = r15
            float r0 = r0 / r1
            r17 = r0
        L10f:
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r0.reset()
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1056964608(0x3f000000, float:0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = r9
            boolean r1 = r1.mirrorHorizontally
            if (r1 == 0) goto L135
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L136
        L135:
            r1 = 1065353216(0x3f800000, float:1.0)
        L136:
            r2 = r9
            boolean r2 = r2.mirrorVertically
            if (r2 == 0) goto L143
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L144
        L143:
            r2 = 1065353216(0x3f800000, float:1.0)
        L144:
            boolean r0 = r0.preScale(r1, r2)
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = r16
            r2 = r17
            boolean r0 = r0.preScale(r1, r2)
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r11
            if (r0 == 0) goto L1d0
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            android.opengl.GLES20.glClearColor(r0, r1, r2, r3)     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = r9
            org.webrtc.VideoFrameDrawer r0 = r0.frameDrawer     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r1 = r10
            r2 = r9
            org.webrtc.RendererCommon$GlDrawer r2 = r2.drawer     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r3 = r9
            android.graphics.Matrix r3 = r3.drawMatrix     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r4 = 0
            r5 = 0
            r6 = r9
            org.webrtc.EglBase r6 = r6.eglBase     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            int r6 = r6.surfaceWidth()     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r7 = r9
            org.webrtc.EglBase r7 = r7.eglBase     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            int r7 = r7.surfaceHeight()     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0.drawFrame(r1, r2, r3, r4, r5, r6, r7)     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            long r0 = java.lang.System.nanoTime()     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r18 = r0
            r0 = r9
            r1 = r10
            r2 = r18
            r0.swapBuffersOnRenderThread(r1, r2)     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = r9
            java.lang.Object r0 = r0.statisticsLock     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r1 = r0
            r20 = r1
            monitor-enter(r0)     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = r9
            r1 = r0
            int r1 = r1.framesRendered     // Catch: java.lang.Throwable -> L1c8 org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r2 = 1
            int r1 = r1 + r2
            r0.framesRendered = r1     // Catch: java.lang.Throwable -> L1c8 org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = r9
            r1 = r0
            long r1 = r1.renderTimeNs     // Catch: java.lang.Throwable -> L1c8 org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r2 = r18
            r3 = r12
            long r2 = r2 - r3
            long r1 = r1 + r2
            r0.renderTimeNs = r1     // Catch: java.lang.Throwable -> L1c8 org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = r20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c8 org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            goto L1d0
        L1c8:
            r21 = move-exception
            r0 = r20
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c8 org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = r21
            throw r0     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
        L1d0:
            r0 = r9
            r1 = r10
            r2 = r11
            r0.notifyCallbacks(r1, r2)     // Catch: org.webrtc.GlUtil.GlOutOfMemoryException -> L1dd java.lang.Throwable -> L218
            r0 = r10
            r0.release()
            goto L221
        L1dd:
            r18 = move-exception
            r0 = r9
            java.lang.String r1 = "Error while drawing frame"
            r2 = r18
            r0.logE(r1, r2)     // Catch: java.lang.Throwable -> L218
            r0 = r9
            org.webrtc.EglRenderer$ErrorCallback r0 = r0.errorCallback     // Catch: java.lang.Throwable -> L218
            r19 = r0
            r0 = r19
            if (r0 == 0) goto L1fa
            r0 = r19
            r0.onGlOutOfMemory()     // Catch: java.lang.Throwable -> L218
        L1fa:
            r0 = r9
            org.webrtc.RendererCommon$GlDrawer r0 = r0.drawer     // Catch: java.lang.Throwable -> L218
            r0.release()     // Catch: java.lang.Throwable -> L218
            r0 = r9
            org.webrtc.VideoFrameDrawer r0 = r0.frameDrawer     // Catch: java.lang.Throwable -> L218
            r0.release()     // Catch: java.lang.Throwable -> L218
            r0 = r9
            org.webrtc.GlTextureFrameBuffer r0 = r0.bitmapTextureFramebuffer     // Catch: java.lang.Throwable -> L218
            r0.release()     // Catch: java.lang.Throwable -> L218
            r0 = r10
            r0.release()
            goto L221
        L218:
            r22 = move-exception
            r0 = r10
            r0.release()
            r0 = r22
            throw r0
        L221:
            return
    }

    private void notifyCallbacks(org.webrtc.VideoFrame r10, boolean r11) {
            r9 = this;
            r0 = r9
            java.util.ArrayList<org.webrtc.EglRenderer$FrameListenerAndParams> r0 = r0.frameListeners
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            return
        Lb:
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r0.reset()
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = 1056964608(0x3f000000, float:0.5)
            r2 = 1056964608(0x3f000000, float:0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = r9
            boolean r1 = r1.mirrorHorizontally
            if (r1 == 0) goto L31
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L32
        L31:
            r1 = 1065353216(0x3f800000, float:1.0)
        L32:
            r2 = r9
            boolean r2 = r2.mirrorVertically
            if (r2 == 0) goto L3f
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L40
        L3f:
            r2 = 1065353216(0x3f800000, float:1.0)
        L40:
            boolean r0 = r0.preScale(r1, r2)
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            boolean r0 = r0.preScale(r1, r2)
            r0 = r9
            android.graphics.Matrix r0 = r0.drawMatrix
            r1 = -1090519040(0xffffffffbf000000, float:-0.5)
            r2 = -1090519040(0xffffffffbf000000, float:-0.5)
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r9
            java.util.ArrayList<org.webrtc.EglRenderer$FrameListenerAndParams> r0 = r0.frameListeners
            java.util.Iterator r0 = r0.iterator()
            r12 = r0
        L66:
            r0 = r12
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L168
            r0 = r12
            java.lang.Object r0 = r0.next()
            org.webrtc.EglRenderer$FrameListenerAndParams r0 = (org.webrtc.EglRenderer.FrameListenerAndParams) r0
            r13 = r0
            r0 = r11
            if (r0 != 0) goto L89
            r0 = r13
            boolean r0 = r0.applyFpsReduction
            if (r0 == 0) goto L89
            goto L66
        L89:
            r0 = r12
            r0.remove()
            r0 = r13
            float r0 = r0.scale
            r1 = r10
            int r1 = r1.getRotatedWidth()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            r14 = r0
            r0 = r13
            float r0 = r0.scale
            r1 = r10
            int r1 = r1.getRotatedHeight()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            r15 = r0
            r0 = r14
            if (r0 == 0) goto Lb5
            r0 = r15
            if (r0 != 0) goto Lc3
        Lb5:
            r0 = r13
            org.webrtc.EglRenderer$FrameListener r0 = r0.listener
            r1 = 0
            r0.onFrame(r1)
            goto L66
        Lc3:
            r0 = r9
            org.webrtc.GlTextureFrameBuffer r0 = r0.bitmapTextureFramebuffer
            r1 = r14
            r2 = r15
            r0.setSize(r1, r2)
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = r9
            org.webrtc.GlTextureFrameBuffer r1 = r1.bitmapTextureFramebuffer
            int r1 = r1.getFrameBufferId()
            android.opengl.GLES20.glBindFramebuffer(r0, r1)
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = 36064(0x8ce0, float:5.0536E-41)
            r2 = 3553(0xde1, float:4.979E-42)
            r3 = r9
            org.webrtc.GlTextureFrameBuffer r3 = r3.bitmapTextureFramebuffer
            int r3 = r3.getTextureId()
            r4 = 0
            android.opengl.GLES20.glFramebufferTexture2D(r0, r1, r2, r3, r4)
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            android.opengl.GLES20.glClearColor(r0, r1, r2, r3)
            r0 = 16384(0x4000, float:2.2959E-41)
            android.opengl.GLES20.glClear(r0)
            r0 = r9
            org.webrtc.VideoFrameDrawer r0 = r0.frameDrawer
            r1 = r10
            r2 = r13
            org.webrtc.RendererCommon$GlDrawer r2 = r2.drawer
            r3 = r9
            android.graphics.Matrix r3 = r3.drawMatrix
            r4 = 0
            r5 = 0
            r6 = r14
            r7 = r15
            r0.drawFrame(r1, r2, r3, r4, r5, r6, r7)
            r0 = r14
            r1 = r15
            int r0 = r0 * r1
            r1 = 4
            int r0 = r0 * r1
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            r16 = r0
            r0 = 0
            r1 = 0
            r2 = r14
            r3 = r15
            android.opengl.GLES20.glViewport(r0, r1, r2, r3)
            r0 = 0
            r1 = 0
            r2 = r14
            r3 = r15
            r4 = 6408(0x1908, float:8.98E-42)
            r5 = 5121(0x1401, float:7.176E-42)
            r6 = r16
            android.opengl.GLES20.glReadPixels(r0, r1, r2, r3, r4, r5, r6)
            r0 = 36160(0x8d40, float:5.0671E-41)
            r1 = 0
            android.opengl.GLES20.glBindFramebuffer(r0, r1)
            java.lang.String r0 = "EglRenderer.notifyCallbacks"
            org.webrtc.GlUtil.checkNoGLES2Error(r0)
            r0 = r14
            r1 = r15
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            r17 = r0
            r0 = r17
            r1 = r16
            r0.copyPixelsFromBuffer(r1)
            r0 = r13
            org.webrtc.EglRenderer$FrameListener r0 = r0.listener
            r1 = r17
            r0.onFrame(r1)
            goto L66
        L168:
            return
    }

    private java.lang.String averageTimeAsString(long r7, int r9) {
            r6 = this;
            r0 = r9
            if (r0 > 0) goto La
            java.lang.String r0 = "NA"
            goto L19
        La:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            r1 = r7
            r2 = r9
            long r2 = (long) r2
            long r1 = r1 / r2
            long r0 = r0.toMicros(r1)
            java.lang.String r0 = r0 + " us"
        L19:
            return r0
    }

    private void logStatistics() {
            r13 = this;
            java.text.DecimalFormat r0 = new java.text.DecimalFormat
            r1 = r0
            java.lang.String r2 = "#.0"
            r1.<init>(r2)
            r14 = r0
            long r0 = java.lang.System.nanoTime()
            r15 = r0
            r0 = r13
            java.lang.Object r0 = r0.statisticsLock
            r1 = r0
            r17 = r1
            monitor-enter(r0)
            r0 = r15
            r1 = r13
            long r1 = r1.statisticsStartTimeNs     // Catch: java.lang.Throwable -> L97
            long r0 = r0 - r1
            r18 = r0
            r0 = r18
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L38
            r0 = r13
            long r0 = r0.minRenderPeriodNs     // Catch: java.lang.Throwable -> L97
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L3c
            r0 = r13
            int r0 = r0.framesReceived     // Catch: java.lang.Throwable -> L97
            if (r0 != 0) goto L3c
        L38:
            r0 = r17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            return
        L3c:
            r0 = r13
            int r0 = r0.framesRendered     // Catch: java.lang.Throwable -> L97
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L97
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L97
            r2 = 1
            long r1 = r1.toNanos(r2)     // Catch: java.lang.Throwable -> L97
            long r0 = r0 * r1
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L97
            r1 = r18
            float r1 = (float) r1     // Catch: java.lang.Throwable -> L97
            float r0 = r0 / r1
            r20 = r0
            r0 = r13
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L97
            r2 = r18
            long r1 = r1.toMillis(r2)     // Catch: java.lang.Throwable -> L97
            r2 = r13
            int r2 = r2.framesReceived     // Catch: java.lang.Throwable -> L97
            r3 = r13
            int r3 = r3.framesDropped     // Catch: java.lang.Throwable -> L97
            r4 = r13
            int r4 = r4.framesRendered     // Catch: java.lang.Throwable -> L97
            r5 = r14
            r6 = r20
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L97
            java.lang.String r5 = r5.format(r6)     // Catch: java.lang.Throwable -> L97
            r6 = r13
            r7 = r13
            long r7 = r7.renderTimeNs     // Catch: java.lang.Throwable -> L97
            r8 = r13
            int r8 = r8.framesRendered     // Catch: java.lang.Throwable -> L97
            java.lang.String r6 = r6.averageTimeAsString(r7, r8)     // Catch: java.lang.Throwable -> L97
            r7 = r13
            r8 = r13
            long r8 = r8.renderSwapBufferTimeNs     // Catch: java.lang.Throwable -> L97
            r9 = r13
            int r9 = r9.framesRendered     // Catch: java.lang.Throwable -> L97
            java.lang.String r7 = r7.averageTimeAsString(r8, r9)     // Catch: java.lang.Throwable -> L97
            java.lang.String r1 = "Duration: " + r1 + " ms. Frames received: " + r0 + ". Dropped: " + r2 + ". Rendered: " + r3 + ". Render fps: " + r4 + ". Average render time: " + r5 + ". Average swapBuffer time: " + r6 + "."     // Catch: java.lang.Throwable -> L97
            r0.logD(r1)     // Catch: java.lang.Throwable -> L97
            r0 = r13
            r1 = r15
            r0.resetStatistics(r1)     // Catch: java.lang.Throwable -> L97
            r0 = r17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            goto L9f
        L97:
            r21 = move-exception
            r0 = r17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            r0 = r21
            throw r0
        L9f:
            return
    }

    private void logE(java.lang.String r5, java.lang.Throwable r6) {
            r4 = this;
            java.lang.String r0 = "EglRenderer"
            r1 = r4
            java.lang.String r1 = r1.name
            r2 = r5
            java.lang.String r1 = r1 + r2
            r2 = r6
            org.webrtc.Logging.e(r0, r1, r2)
            return
    }

    private void logD(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "EglRenderer"
            r1 = r4
            java.lang.String r1 = r1.name
            r2 = r5
            java.lang.String r1 = r1 + r2
            org.webrtc.Logging.d(r0, r1)
            return
    }

    private void logW(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "EglRenderer"
            r1 = r4
            java.lang.String r1 = r1.name
            r2 = r5
            java.lang.String r1 = r1 + r2
            org.webrtc.Logging.w(r0, r1)
            return
    }

    private /* synthetic */ void lambda$swapBuffersOnRenderThread$5(org.webrtc.VideoFrame r9, long r10, boolean r12) {
            r8 = this;
            r0 = r12
            if (r0 != 0) goto L22
            r0 = r8
            org.webrtc.EglBase r0 = r0.eglBase
            if (r0 == 0) goto L18
            r0 = r8
            org.webrtc.EglBase r0 = r0.eglBase
            boolean r0 = r0.hasSurface()
            if (r0 != 0) goto L19
        L18:
            return
        L19:
            r0 = r8
            org.webrtc.EglBase r0 = r0.eglBase
            r0.makeCurrent()
        L22:
            r0 = r8
            boolean r0 = r0.usePresentationTimeStamp
            if (r0 == 0) goto L39
            r0 = r8
            org.webrtc.EglBase r0 = r0.eglBase
            r1 = r9
            long r1 = r1.getTimestampNs()
            r0.swapBuffers(r1)
            goto L42
        L39:
            r0 = r8
            org.webrtc.EglBase r0 = r0.eglBase
            r0.swapBuffers()
        L42:
            r0 = r8
            java.lang.Object r0 = r0.statisticsLock
            r1 = r0
            r13 = r1
            monitor-enter(r0)
            r0 = r8
            r1 = r0
            long r1 = r1.renderSwapBufferTimeNs     // Catch: java.lang.Throwable -> L5e
            long r2 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L5e
            r3 = r10
            long r2 = r2 - r3
            long r1 = r1 + r2
            r0.renderSwapBufferTimeNs = r1     // Catch: java.lang.Throwable -> L5e
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            goto L66
        L5e:
            r14 = move-exception
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5e
            r0 = r14
            throw r0
        L66:
            return
    }

    private /* synthetic */ void lambda$clearImage$4(float r7, float r8, float r9, float r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.clearSurfaceOnRenderThread(r1, r2, r3, r4)
            return
    }

    private /* synthetic */ void lambda$releaseEglSurface$3(java.lang.Runnable r3) {
            r2 = this;
            r0 = r2
            org.webrtc.EglBase r0 = r0.eglBase
            if (r0 == 0) goto L19
            r0 = r2
            org.webrtc.EglBase r0 = r0.eglBase
            r0.detachCurrent()
            r0 = r2
            org.webrtc.EglBase r0 = r0.eglBase
            r0.releaseSurface()
        L19:
            r0 = r3
            r0.run()
            return
    }

    private /* synthetic */ void lambda$removeFrameListener$2(java.util.concurrent.CountDownLatch r4, org.webrtc.EglRenderer.FrameListener r5) {
            r3 = this;
            r0 = r4
            r0.countDown()
            r0 = r3
            java.util.ArrayList<org.webrtc.EglRenderer$FrameListenerAndParams> r0 = r0.frameListeners
            java.util.Iterator r0 = r0.iterator()
            r6 = r0
        Lc:
            r0 = r6
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L2e
            r0 = r6
            java.lang.Object r0 = r0.next()
            org.webrtc.EglRenderer$FrameListenerAndParams r0 = (org.webrtc.EglRenderer.FrameListenerAndParams) r0
            org.webrtc.EglRenderer$FrameListener r0 = r0.listener
            r1 = r5
            if (r0 != r1) goto Lc
            r0 = r6
            r0.remove()
            goto Lc
        L2e:
            return
    }

    private /* synthetic */ void lambda$addFrameListener$1(org.webrtc.RendererCommon.GlDrawer r9, org.webrtc.EglRenderer.FrameListener r10, float r11, boolean r12) {
            r8 = this;
            r0 = r9
            if (r0 != 0) goto Lb
            r0 = r8
            org.webrtc.RendererCommon$GlDrawer r0 = r0.drawer
            goto Lc
        Lb:
            r0 = r9
        Lc:
            r13 = r0
            r0 = r8
            java.util.ArrayList<org.webrtc.EglRenderer$FrameListenerAndParams> r0 = r0.frameListeners
            org.webrtc.EglRenderer$FrameListenerAndParams r1 = new org.webrtc.EglRenderer$FrameListenerAndParams
            r2 = r1
            r3 = r10
            r4 = r11
            r5 = r13
            r6 = r12
            r2.<init>(r3, r4, r5, r6)
            boolean r0 = r0.add(r1)
            return
    }

    private /* synthetic */ void lambda$release$0(java.util.concurrent.CountDownLatch r4) {
            r3 = this;
            java.lang.Object r0 = org.webrtc.EglBase.lock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = 0
            android.opengl.GLES20.glUseProgram(r0)     // Catch: java.lang.Throwable -> Lf
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            goto L14
        Lf:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            r0 = r6
            throw r0
        L14:
            r0 = r3
            org.webrtc.RendererCommon$GlDrawer r0 = r0.drawer
            if (r0 == 0) goto L29
            r0 = r3
            org.webrtc.RendererCommon$GlDrawer r0 = r0.drawer
            r0.release()
            r0 = r3
            r1 = 0
            r0.drawer = r1
        L29:
            r0 = r3
            org.webrtc.VideoFrameDrawer r0 = r0.frameDrawer
            r0.release()
            r0 = r3
            org.webrtc.GlTextureFrameBuffer r0 = r0.bitmapTextureFramebuffer
            r0.release()
            r0 = r3
            org.webrtc.EglBase r0 = r0.eglBase
            if (r0 == 0) goto L5c
            r0 = r3
            java.lang.String r1 = "eglBase detach and release."
            r0.logD(r1)
            r0 = r3
            org.webrtc.EglBase r0 = r0.eglBase
            r0.detachCurrent()
            r0 = r3
            org.webrtc.EglBase r0 = r0.eglBase
            r0.release()
            r0 = r3
            r1 = 0
            r0.eglBase = r1
        L5c:
            r0 = r3
            java.util.ArrayList<org.webrtc.EglRenderer$FrameListenerAndParams> r0 = r0.frameListeners
            r0.clear()
            r0 = r4
            r0.countDown()
            return
    }
}
