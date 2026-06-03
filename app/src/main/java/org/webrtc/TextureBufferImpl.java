package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/TextureBufferImpl.class */
public class TextureBufferImpl implements org.webrtc.VideoFrame.TextureBuffer {
    private final int unscaledWidth;
    private final int unscaledHeight;
    private final int width;
    private final int height;
    private final org.webrtc.VideoFrame.TextureBuffer.Type type;
    private final int id;
    private final android.graphics.Matrix transformMatrix;
    private final android.os.Handler toI420Handler;
    private final org.webrtc.YuvConverter yuvConverter;
    private final org.webrtc.RefCountDelegate refCountDelegate;
    private final org.webrtc.TextureBufferImpl.RefCountMonitor refCountMonitor;



    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/TextureBufferImpl$RefCountMonitor.class */
    interface RefCountMonitor {
        void onRetain(org.webrtc.TextureBufferImpl r1);

        void onRelease(org.webrtc.TextureBufferImpl r1);

        void onDestroy(org.webrtc.TextureBufferImpl r1);
    }

    public TextureBufferImpl(int r15, int r16, org.webrtc.VideoFrame.TextureBuffer.Type r17, int r18, android.graphics.Matrix r19, android.os.Handler r20, org.webrtc.YuvConverter r21, @androidx.annotation.Nullable java.lang.Runnable r22) {
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            org.webrtc.TextureBufferImpl$1 r10 = new org.webrtc.TextureBufferImpl$1
            r11 = r10
            r12 = r22
            r11.<init>(r12)
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    TextureBufferImpl(int r13, int r14, org.webrtc.VideoFrame.TextureBuffer.Type r15, int r16, android.graphics.Matrix r17, android.os.Handler r18, org.webrtc.YuvConverter r19, org.webrtc.TextureBufferImpl.RefCountMonitor r20) {
            r12 = this;
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    private TextureBufferImpl(int r7, int r8, int r9, int r10, org.webrtc.VideoFrame.TextureBuffer.Type r11, int r12, android.graphics.Matrix r13, android.os.Handler r14, org.webrtc.YuvConverter r15, org.webrtc.TextureBufferImpl.RefCountMonitor r16) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = r7
            r0.unscaledWidth = r1
            r0 = r6
            r1 = r8
            r0.unscaledHeight = r1
            r0 = r6
            r1 = r9
            r0.width = r1
            r0 = r6
            r1 = r10
            r0.height = r1
            r0 = r6
            r1 = r11
            r0.type = r1
            r0 = r6
            r1 = r12
            r0.id = r1
            r0 = r6
            r1 = r13
            r0.transformMatrix = r1
            r0 = r6
            r1 = r14
            r0.toI420Handler = r1
            r0 = r6
            r1 = r15
            r0.yuvConverter = r1
            r0 = r6
            org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
            r2 = r1
            r3 = r6
            r4 = r16
            void r3 = () -> { // java.lang.Runnable.run():void
                r3.lambda$new$0(r4);
            }
            r2.<init>(r3)
            r0.refCountDelegate = r1
            r0 = r6
            r1 = r16
            r0.refCountMonitor = r1
            return
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public org.webrtc.VideoFrame.TextureBuffer.Type getType() {
            r2 = this;
            r0 = r2
            org.webrtc.VideoFrame$TextureBuffer$Type r0 = r0.type
            return r0
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getTextureId() {
            r2 = this;
            r0 = r2
            int r0 = r0.id
            return r0
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public android.graphics.Matrix getTransformMatrix() {
            r2 = this;
            r0 = r2
            android.graphics.Matrix r0 = r0.transformMatrix
            return r0
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
            r2 = this;
            r0 = r2
            int r0 = r0.width
            return r0
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
            r2 = this;
            r0 = r2
            int r0 = r0.height
            return r0
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.I420Buffer toI420() {
            r3 = this;
            r0 = r3
            android.os.Handler r0 = r0.toI420Handler
            r1 = r3
            org.webrtc.VideoFrame$I420Buffer r1 = () -> { // java.util.concurrent.Callable.call():java.lang.Object
                return r1.lambda$toI420$1();
            }
            java.lang.Object r0 = org.webrtc.ThreadUtils.invokeAtFrontUninterruptibly(r0, r1)
            org.webrtc.VideoFrame$I420Buffer r0 = (org.webrtc.VideoFrame.I420Buffer) r0
            return r0
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
            r3 = this;
            r0 = r3
            org.webrtc.TextureBufferImpl$RefCountMonitor r0 = r0.refCountMonitor
            r1 = r3
            r0.onRetain(r1)
            r0 = r3
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.retain()
            return
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
            r3 = this;
            r0 = r3
            org.webrtc.TextureBufferImpl$RefCountMonitor r0 = r0.refCountMonitor
            r1 = r3
            r0.onRelease(r1)
            r0 = r3
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.release()
            return
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.Buffer cropAndScale(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r1 = r0
            r1.<init>()
            r14 = r0
            r0 = r7
            int r0 = r0.height
            r1 = r9
            r2 = r11
            int r1 = r1 + r2
            int r0 = r0 - r1
            r15 = r0
            r0 = r14
            r1 = r8
            float r1 = (float) r1
            r2 = r7
            int r2 = r2.width
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r15
            float r2 = (float) r2
            r3 = r7
            int r3 = r3.height
            float r3 = (float) r3
            float r2 = r2 / r3
            boolean r0 = r0.preTranslate(r1, r2)
            r0 = r14
            r1 = r10
            float r1 = (float) r1
            r2 = r7
            int r2 = r2.width
            float r2 = (float) r2
            float r1 = r1 / r2
            r2 = r11
            float r2 = (float) r2
            r3 = r7
            int r3 = r3.height
            float r3 = (float) r3
            float r2 = r2 / r3
            boolean r0 = r0.preScale(r1, r2)
            r0 = r7
            r1 = r14
            r2 = r7
            int r2 = r2.unscaledWidth
            r3 = r10
            int r2 = r2 * r3
            float r2 = (float) r2
            r3 = r7
            int r3 = r3.width
            float r3 = (float) r3
            float r2 = r2 / r3
            int r2 = java.lang.Math.round(r2)
            r3 = r7
            int r3 = r3.unscaledHeight
            r4 = r11
            int r3 = r3 * r4
            float r3 = (float) r3
            r4 = r7
            int r4 = r4.height
            float r4 = (float) r4
            float r3 = r3 / r4
            int r3 = java.lang.Math.round(r3)
            r4 = r12
            r5 = r13
            org.webrtc.TextureBufferImpl r0 = r0.applyTransformMatrix(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledWidth() {
            r2 = this;
            r0 = r2
            int r0 = r0.unscaledWidth
            return r0
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public int getUnscaledHeight() {
            r2 = this;
            r0 = r2
            int r0 = r0.unscaledHeight
            return r0
    }

    public android.os.Handler getToI420Handler() {
            r2 = this;
            r0 = r2
            android.os.Handler r0 = r0.toI420Handler
            return r0
    }

    public org.webrtc.YuvConverter getYuvConverter() {
            r2 = this;
            r0 = r2
            org.webrtc.YuvConverter r0 = r0.yuvConverter
            return r0
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public org.webrtc.TextureBufferImpl applyTransformMatrix(android.graphics.Matrix r8, int r9, int r10) {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r9
            r5 = r10
            org.webrtc.TextureBufferImpl r0 = r0.applyTransformMatrix(r1, r2, r3, r4, r5)
            return r0
    }

    private org.webrtc.TextureBufferImpl applyTransformMatrix(android.graphics.Matrix r16, int r17, int r18, int r19, int r20) {
            r15 = this;
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r1 = r0
            r2 = r15
            android.graphics.Matrix r2 = r2.transformMatrix
            r1.<init>(r2)
            r21 = r0
            r0 = r21
            r1 = r16
            boolean r0 = r0.preConcat(r1)
            r0 = r15
            r0.retain()
            org.webrtc.TextureBufferImpl r0 = new org.webrtc.TextureBufferImpl
            r1 = r0
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r15
            org.webrtc.VideoFrame$TextureBuffer$Type r6 = r6.type
            r7 = r15
            int r7 = r7.id
            r8 = r21
            r9 = r15
            android.os.Handler r9 = r9.toI420Handler
            r10 = r15
            org.webrtc.YuvConverter r10 = r10.yuvConverter
            org.webrtc.TextureBufferImpl$2 r11 = new org.webrtc.TextureBufferImpl$2
            r12 = r11
            r13 = r15
            r12.<init>(r13)
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    @Override // org.webrtc.VideoFrame.TextureBuffer
    public /* bridge */ /* synthetic */ org.webrtc.VideoFrame.TextureBuffer applyTransformMatrix(android.graphics.Matrix r6, int r7, int r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.webrtc.TextureBufferImpl r0 = r0.applyTransformMatrix(r1, r2, r3)
            return r0
    }

    private /* synthetic */ org.webrtc.VideoFrame.I420Buffer lambda$toI420$1() throws java.lang.Exception {
            r3 = this;
            r0 = r3
            org.webrtc.YuvConverter r0 = r0.yuvConverter
            r1 = r3
            org.webrtc.VideoFrame$I420Buffer r0 = r0.convert(r1)
            return r0
    }

    private /* synthetic */ void lambda$new$0(org.webrtc.TextureBufferImpl.RefCountMonitor r4) {
            r3 = this;
            r0 = r4
            r1 = r3
            r0.onDestroy(r1)
            return
    }
}
