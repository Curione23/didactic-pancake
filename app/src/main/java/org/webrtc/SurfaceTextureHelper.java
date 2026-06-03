package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SurfaceTextureHelper.class */
public class SurfaceTextureHelper {
    private static final java.lang.String TAG = "SurfaceTextureHelper";
    private final org.webrtc.TextureBufferImpl.RefCountMonitor textureRefCountMonitor;
    private final android.os.Handler handler;
    private final org.webrtc.EglBase eglBase;
    private final android.graphics.SurfaceTexture surfaceTexture;
    private final int oesTextureId;
    private final org.webrtc.YuvConverter yuvConverter;

    @androidx.annotation.Nullable
    private final org.webrtc.TimestampAligner timestampAligner;
    private final org.webrtc.SurfaceTextureHelper.FrameRefMonitor frameRefMonitor;

    @androidx.annotation.Nullable
    private org.webrtc.VideoSink listener;
    private boolean hasPendingTexture;
    private volatile boolean isTextureInUse;
    private boolean isQuitting;
    private int frameRotation;
    private int textureWidth;
    private int textureHeight;

    @androidx.annotation.Nullable
    private org.webrtc.VideoSink pendingListener;
    final java.lang.Runnable setListenerRunnable;




    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SurfaceTextureHelper$FrameRefMonitor.class */
    public interface FrameRefMonitor {
        void onNewBuffer(org.webrtc.VideoFrame.TextureBuffer r1);

        void onRetainBuffer(org.webrtc.VideoFrame.TextureBuffer r1);

        void onReleaseBuffer(org.webrtc.VideoFrame.TextureBuffer r1);

        void onDestroyBuffer(org.webrtc.VideoFrame.TextureBuffer r1);
    }

    public static org.webrtc.SurfaceTextureHelper create(java.lang.String r10, org.webrtc.EglBase.Context r11, boolean r12, org.webrtc.YuvConverter r13, org.webrtc.SurfaceTextureHelper.FrameRefMonitor r14) {
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            r15 = r0
            r0 = r15
            r0.start()
            android.os.Handler r0 = new android.os.Handler
            r1 = r0
            r2 = r15
            android.os.Looper r2 = r2.getLooper()
            r1.<init>(r2)
            r16 = r0
            r0 = r16
            org.webrtc.SurfaceTextureHelper$1 r1 = new org.webrtc.SurfaceTextureHelper$1
            r2 = r1
            r3 = r11
            r4 = r16
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            org.webrtc.SurfaceTextureHelper r0 = (org.webrtc.SurfaceTextureHelper) r0
            return r0
    }

    public static org.webrtc.SurfaceTextureHelper create(java.lang.String r6, org.webrtc.EglBase.Context r7) {
            r0 = r6
            r1 = r7
            r2 = 0
            org.webrtc.YuvConverter r3 = new org.webrtc.YuvConverter
            r4 = r3
            r4.<init>()
            r4 = 0
            org.webrtc.SurfaceTextureHelper r0 = create(r0, r1, r2, r3, r4)
            return r0
    }

    public static org.webrtc.SurfaceTextureHelper create(java.lang.String r6, org.webrtc.EglBase.Context r7, boolean r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            org.webrtc.YuvConverter r3 = new org.webrtc.YuvConverter
            r4 = r3
            r4.<init>()
            r4 = 0
            org.webrtc.SurfaceTextureHelper r0 = create(r0, r1, r2, r3, r4)
            return r0
    }

    public static org.webrtc.SurfaceTextureHelper create(java.lang.String r6, org.webrtc.EglBase.Context r7, boolean r8, org.webrtc.YuvConverter r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            org.webrtc.SurfaceTextureHelper r0 = create(r0, r1, r2, r3, r4)
            return r0
    }

    private SurfaceTextureHelper(org.webrtc.EglBase.Context r6, android.os.Handler r7, boolean r8, org.webrtc.YuvConverter r9, org.webrtc.SurfaceTextureHelper.FrameRefMonitor r10) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            org.webrtc.SurfaceTextureHelper$2 r1 = new org.webrtc.SurfaceTextureHelper$2
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.textureRefCountMonitor = r1
            r0 = r5
            org.webrtc.SurfaceTextureHelper$3 r1 = new org.webrtc.SurfaceTextureHelper$3
            r2 = r1
            r3 = r5
            r2.<init>(r3)
            r0.setListenerRunnable = r1
            r0 = r7
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L33
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "SurfaceTextureHelper must be created on the handler thread"
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r5
            r1 = r7
            r0.handler = r1
            r0 = r5
            r1 = r8
            if (r1 == 0) goto L47
            org.webrtc.TimestampAligner r1 = new org.webrtc.TimestampAligner
            r2 = r1
            r2.<init>()
            goto L48
        L47:
            r1 = 0
        L48:
            r0.timestampAligner = r1
            r0 = r5
            r1 = r9
            r0.yuvConverter = r1
            r0 = r5
            r1 = r10
            r0.frameRefMonitor = r1
            r0 = r5
            r1 = r6
            int[] r2 = org.webrtc.EglBase.CONFIG_PIXEL_BUFFER
            org.webrtc.EglBase r1 = org.webrtc.EglBase.create(r1, r2)
            r0.eglBase = r1
            r0 = r5
            org.webrtc.EglBase r0 = r0.eglBase     // Catch: java.lang.RuntimeException -> L77
            r0.createDummyPbufferSurface()     // Catch: java.lang.RuntimeException -> L77
            r0 = r5
            org.webrtc.EglBase r0 = r0.eglBase     // Catch: java.lang.RuntimeException -> L77
            r0.makeCurrent()     // Catch: java.lang.RuntimeException -> L77
            goto L8c
        L77:
            r11 = move-exception
            r0 = r5
            org.webrtc.EglBase r0 = r0.eglBase
            r0.release()
            r0 = r7
            android.os.Looper r0 = r0.getLooper()
            r0.quit()
            r0 = r11
            throw r0
        L8c:
            r0 = r5
            r1 = 36197(0x8d65, float:5.0723E-41)
            int r1 = org.webrtc.GlUtil.generateTexture(r1)
            r0.oesTextureId = r1
            r0 = r5
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture
            r2 = r1
            r3 = r5
            int r3 = r3.oesTextureId
            r2.<init>(r3)
            r0.surfaceTexture = r1
            r0 = r5
            android.graphics.SurfaceTexture r0 = r0.surfaceTexture
            r1 = r5
            void r1 = (v1) -> { // android.graphics.SurfaceTexture.OnFrameAvailableListener.onFrameAvailable(android.graphics.SurfaceTexture):void
                r1.lambda$new$0(v1);
            }
            r2 = r7
            r0.setOnFrameAvailableListener(r1, r2)
            return
    }

    public void startListening(org.webrtc.VideoSink r5) {
            r4 = this;
            r0 = r4
            org.webrtc.VideoSink r0 = r0.listener
            if (r0 != 0) goto Le
            r0 = r4
            org.webrtc.VideoSink r0 = r0.pendingListener
            if (r0 == 0) goto L18
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "SurfaceTextureHelper listener has already been set."
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r4
            r1 = r5
            r0.pendingListener = r1
            r0 = r4
            android.os.Handler r0 = r0.handler
            r1 = r4
            java.lang.Runnable r1 = r1.setListenerRunnable
            boolean r0 = r0.post(r1)
            return
    }

    public void stopListening() {
            r3 = this;
            java.lang.String r0 = "SurfaceTextureHelper"
            java.lang.String r1 = "stopListening()"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.os.Handler r0 = r0.handler
            r1 = r3
            java.lang.Runnable r1 = r1.setListenerRunnable
            r0.removeCallbacks(r1)
            r0 = r3
            android.os.Handler r0 = r0.handler
            r1 = r3
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$stopListening$1();
            }
            org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            return
    }

    public void setTextureSize(int r6, int r7) {
            r5 = this;
            r0 = r6
            if (r0 > 0) goto L12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r6
            java.lang.String r2 = "Texture width must be positive, but was " + r2
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r7
            if (r0 > 0) goto L24
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r7
            java.lang.String r2 = "Texture height must be positive, but was " + r2
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            android.graphics.SurfaceTexture r0 = r0.surfaceTexture
            r1 = r6
            r2 = r7
            r0.setDefaultBufferSize(r1, r2)
            r0 = r5
            android.os.Handler r0 = r0.handler
            r1 = r5
            r2 = r6
            r3 = r7
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$setTextureSize$2(r2, r3);
            }
            boolean r0 = r0.post(r1)
            return
    }

    public void forceFrame() {
            r3 = this;
            r0 = r3
            android.os.Handler r0 = r0.handler
            r1 = r3
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$forceFrame$3();
            }
            boolean r0 = r0.post(r1)
            return
    }

    public void setFrameRotation(int r5) {
            r4 = this;
            r0 = r4
            android.os.Handler r0 = r0.handler
            r1 = r4
            r2 = r5
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$setFrameRotation$4(r2);
            }
            boolean r0 = r0.post(r1)
            return
    }

    public android.graphics.SurfaceTexture getSurfaceTexture() {
            r2 = this;
            r0 = r2
            android.graphics.SurfaceTexture r0 = r0.surfaceTexture
            return r0
    }

    public android.os.Handler getHandler() {
            r2 = this;
            r0 = r2
            android.os.Handler r0 = r0.handler
            return r0
    }

    private void returnTextureFrame() {
            r3 = this;
            r0 = r3
            android.os.Handler r0 = r0.handler
            r1 = r3
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$returnTextureFrame$5();
            }
            boolean r0 = r0.post(r1)
            return
    }

    public boolean isTextureInUse() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isTextureInUse
            return r0
    }

    public void dispose() {
            r3 = this;
            java.lang.String r0 = "SurfaceTextureHelper"
            java.lang.String r1 = "dispose()"
            org.webrtc.Logging.d(r0, r1)
            r0 = r3
            android.os.Handler r0 = r0.handler
            r1 = r3
            void r1 = () -> { // java.lang.Runnable.run():void
                r1.lambda$dispose$6();
            }
            org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            return
    }

    @java.lang.Deprecated
    public org.webrtc.VideoFrame.I420Buffer textureToYuv(org.webrtc.VideoFrame.TextureBuffer r3) {
            r2 = this;
            r0 = r3
            org.webrtc.VideoFrame$I420Buffer r0 = r0.toI420()
            return r0
    }

    private void updateTexImage() {
            r3 = this;
            java.lang.Object r0 = org.webrtc.EglBase.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            android.graphics.SurfaceTexture r0 = r0.surfaceTexture     // Catch: java.lang.Throwable -> L12
            r0.updateTexImage()     // Catch: java.lang.Throwable -> L12
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L17
        L12:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            r0 = r5
            throw r0
        L17:
            return
    }

    private void tryDeliverTextureFrame() {
            r11 = this;
            r0 = r11
            android.os.Handler r0 = r0.handler
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Wrong thread."
            r1.<init>(r2)
            throw r0
        L1a:
            r0 = r11
            boolean r0 = r0.isQuitting
            if (r0 != 0) goto L36
            r0 = r11
            boolean r0 = r0.hasPendingTexture
            if (r0 == 0) goto L36
            r0 = r11
            boolean r0 = r0.isTextureInUse
            if (r0 != 0) goto L36
            r0 = r11
            org.webrtc.VideoSink r0 = r0.listener
            if (r0 != 0) goto L37
        L36:
            return
        L37:
            r0 = r11
            int r0 = r0.textureWidth
            if (r0 == 0) goto L45
            r0 = r11
            int r0 = r0.textureHeight
            if (r0 != 0) goto L4d
        L45:
            java.lang.String r0 = "SurfaceTextureHelper"
            java.lang.String r1 = "Texture size has not been set."
            org.webrtc.Logging.w(r0, r1)
            return
        L4d:
            r0 = r11
            r1 = 1
            r0.isTextureInUse = r1
            r0 = r11
            r1 = 0
            r0.hasPendingTexture = r1
            r0 = r11
            r0.updateTexImage()
            r0 = 16
            float[] r0 = new float[r0]
            r12 = r0
            r0 = r11
            android.graphics.SurfaceTexture r0 = r0.surfaceTexture
            r1 = r12
            r0.getTransformMatrix(r1)
            r0 = r11
            android.graphics.SurfaceTexture r0 = r0.surfaceTexture
            long r0 = r0.getTimestamp()
            r13 = r0
            r0 = r11
            org.webrtc.TimestampAligner r0 = r0.timestampAligner
            if (r0 == 0) goto L80
            r0 = r11
            org.webrtc.TimestampAligner r0 = r0.timestampAligner
            r1 = r13
            long r0 = r0.translateTimestamp(r1)
            r13 = r0
        L80:
            org.webrtc.TextureBufferImpl r0 = new org.webrtc.TextureBufferImpl
            r1 = r0
            r2 = r11
            int r2 = r2.textureWidth
            r3 = r11
            int r3 = r3.textureHeight
            org.webrtc.VideoFrame$TextureBuffer$Type r4 = org.webrtc.VideoFrame.TextureBuffer.Type.OES
            r5 = r11
            int r5 = r5.oesTextureId
            r6 = r12
            android.graphics.Matrix r6 = org.webrtc.RendererCommon.convertMatrixToAndroidGraphicsMatrix(r6)
            r7 = r11
            android.os.Handler r7 = r7.handler
            r8 = r11
            org.webrtc.YuvConverter r8 = r8.yuvConverter
            r9 = r11
            org.webrtc.TextureBufferImpl$RefCountMonitor r9 = r9.textureRefCountMonitor
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r15 = r0
            r0 = r11
            org.webrtc.SurfaceTextureHelper$FrameRefMonitor r0 = r0.frameRefMonitor
            if (r0 == 0) goto Lba
            r0 = r11
            org.webrtc.SurfaceTextureHelper$FrameRefMonitor r0 = r0.frameRefMonitor
            r1 = r15
            r0.onNewBuffer(r1)
        Lba:
            org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame
            r1 = r0
            r2 = r15
            r3 = r11
            int r3 = r3.frameRotation
            r4 = r13
            r1.<init>(r2, r3, r4)
            r16 = r0
            r0 = r11
            org.webrtc.VideoSink r0 = r0.listener
            r1 = r16
            r0.onFrame(r1)
            r0 = r16
            r0.release()
            return
    }

    private void release() {
            r6 = this;
            r0 = r6
            android.os.Handler r0 = r0.handler
            android.os.Looper r0 = r0.getLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 == r1) goto L1a
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Wrong thread."
            r1.<init>(r2)
            throw r0
        L1a:
            r0 = r6
            boolean r0 = r0.isTextureInUse
            if (r0 != 0) goto L28
            r0 = r6
            boolean r0 = r0.isQuitting
            if (r0 != 0) goto L33
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Unexpected release."
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r6
            org.webrtc.YuvConverter r0 = r0.yuvConverter
            r0.release()
            r0 = 1
            r1 = 1
            int[] r1 = new int[r1]
            r2 = r1
            r3 = 0
            r4 = r6
            int r4 = r4.oesTextureId
            r2[r3] = r4
            r2 = 0
            android.opengl.GLES20.glDeleteTextures(r0, r1, r2)
            r0 = r6
            android.graphics.SurfaceTexture r0 = r0.surfaceTexture
            r0.release()
            r0 = r6
            org.webrtc.EglBase r0 = r0.eglBase
            r0.release()
            r0 = r6
            android.os.Handler r0 = r0.handler
            android.os.Looper r0 = r0.getLooper()
            r0.quit()
            r0 = r6
            org.webrtc.TimestampAligner r0 = r0.timestampAligner
            if (r0 == 0) goto L71
            r0 = r6
            org.webrtc.TimestampAligner r0 = r0.timestampAligner
            r0.dispose()
        L71:
            return
    }

    private /* synthetic */ void lambda$dispose$6() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.isQuitting = r1
            r0 = r3
            boolean r0 = r0.isTextureInUse
            if (r0 != 0) goto L10
            r0 = r3
            r0.release()
        L10:
            return
    }

    private /* synthetic */ void lambda$returnTextureFrame$5() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.isTextureInUse = r1
            r0 = r3
            boolean r0 = r0.isQuitting
            if (r0 == 0) goto L13
            r0 = r3
            r0.release()
            goto L17
        L13:
            r0 = r3
            r0.tryDeliverTextureFrame()
        L17:
            return
    }

    private /* synthetic */ void lambda$setFrameRotation$4(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.frameRotation = r1
            return
    }

    private /* synthetic */ void lambda$forceFrame$3() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.hasPendingTexture = r1
            r0 = r3
            r0.tryDeliverTextureFrame()
            return
    }

    private /* synthetic */ void lambda$setTextureSize$2(int r4, int r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.textureWidth = r1
            r0 = r3
            r1 = r5
            r0.textureHeight = r1
            r0 = r3
            r0.tryDeliverTextureFrame()
            return
    }

    private /* synthetic */ void lambda$stopListening$1() {
            r3 = this;
            r0 = r3
            r1 = 0
            r0.listener = r1
            r0 = r3
            r1 = 0
            r0.pendingListener = r1
            return
    }

    private /* synthetic */ void lambda$new$0(android.graphics.SurfaceTexture r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.hasPendingTexture
            if (r0 == 0) goto Lf
            java.lang.String r0 = "SurfaceTextureHelper"
            java.lang.String r1 = "A frame is already pending, dropping frame."
            org.webrtc.Logging.d(r0, r1)
        Lf:
            r0 = r3
            r1 = 1
            r0.hasPendingTexture = r1
            r0 = r3
            r0.tryDeliverTextureFrame()
            return
    }
}
