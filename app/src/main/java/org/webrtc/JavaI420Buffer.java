package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/JavaI420Buffer.class */
public class JavaI420Buffer implements org.webrtc.VideoFrame.I420Buffer {
    private final int width;
    private final int height;
    private final java.nio.ByteBuffer dataY;
    private final java.nio.ByteBuffer dataU;
    private final java.nio.ByteBuffer dataV;
    private final int strideY;
    private final int strideU;
    private final int strideV;
    private final org.webrtc.RefCountDelegate refCountDelegate;

    private JavaI420Buffer(int r6, int r7, java.nio.ByteBuffer r8, int r9, java.nio.ByteBuffer r10, int r11, java.nio.ByteBuffer r12, int r13, @androidx.annotation.Nullable java.lang.Runnable r14) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.width = r1
            r0 = r5
            r1 = r7
            r0.height = r1
            r0 = r5
            r1 = r8
            r0.dataY = r1
            r0 = r5
            r1 = r10
            r0.dataU = r1
            r0 = r5
            r1 = r12
            r0.dataV = r1
            r0 = r5
            r1 = r9
            r0.strideY = r1
            r0 = r5
            r1 = r11
            r0.strideU = r1
            r0 = r5
            r1 = r13
            r0.strideV = r1
            r0 = r5
            org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
            r2 = r1
            r3 = r14
            r2.<init>(r3)
            r0.refCountDelegate = r1
            return
    }

    private static void checkCapacity(java.nio.ByteBuffer r5, int r6, int r7, int r8) {
            r0 = r8
            r1 = r7
            r2 = 1
            int r1 = r1 - r2
            int r0 = r0 * r1
            r1 = r6
            int r0 = r0 + r1
            r9 = r0
            r0 = r5
            int r0 = r0.capacity()
            r1 = r9
            if (r0 >= r1) goto L25
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r9
            r3 = r5
            int r3 = r3.capacity()
            java.lang.String r2 = "Buffer must be at least " + r2 + " bytes, but was " + r3
            r1.<init>(r2)
            throw r0
        L25:
            return
    }

    public static org.webrtc.JavaI420Buffer wrap(int r12, int r13, java.nio.ByteBuffer r14, int r15, java.nio.ByteBuffer r16, int r17, java.nio.ByteBuffer r18, int r19, @androidx.annotation.Nullable java.lang.Runnable r20) {
            r0 = r14
            if (r0 == 0) goto Le
            r0 = r16
            if (r0 == 0) goto Le
            r0 = r18
            if (r0 != 0) goto L18
        Le:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Data buffers cannot be null."
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r14
            boolean r0 = r0.isDirect()
            if (r0 == 0) goto L2f
            r0 = r16
            boolean r0 = r0.isDirect()
            if (r0 == 0) goto L2f
            r0 = r18
            boolean r0 = r0.isDirect()
            if (r0 != 0) goto L39
        L2f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Data buffers must be direct byte buffers."
            r1.<init>(r2)
            throw r0
        L39:
            r0 = r14
            java.nio.ByteBuffer r0 = r0.slice()
            r14 = r0
            r0 = r16
            java.nio.ByteBuffer r0 = r0.slice()
            r16 = r0
            r0 = r18
            java.nio.ByteBuffer r0 = r0.slice()
            r18 = r0
            r0 = r12
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r21 = r0
            r0 = r13
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r22 = r0
            r0 = r14
            r1 = r12
            r2 = r13
            r3 = r15
            checkCapacity(r0, r1, r2, r3)
            r0 = r16
            r1 = r21
            r2 = r22
            r3 = r17
            checkCapacity(r0, r1, r2, r3)
            r0 = r18
            r1 = r21
            r2 = r22
            r3 = r19
            checkCapacity(r0, r1, r2, r3)
            org.webrtc.JavaI420Buffer r0 = new org.webrtc.JavaI420Buffer
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public static org.webrtc.JavaI420Buffer allocate(int r12, int r13) {
            r0 = r13
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r14 = r0
            r0 = r12
            r1 = 1
            int r0 = r0 + r1
            r1 = 2
            int r0 = r0 / r1
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r16
            r1 = r12
            r2 = r13
            int r1 = r1 * r2
            int r0 = r0 + r1
            r17 = r0
            r0 = r17
            r1 = r15
            r2 = r14
            int r1 = r1 * r2
            int r0 = r0 + r1
            r18 = r0
            r0 = r12
            r1 = r13
            int r0 = r0 * r1
            r1 = 2
            r2 = r15
            int r1 = r1 * r2
            r2 = r14
            int r1 = r1 * r2
            int r0 = r0 + r1
            java.nio.ByteBuffer r0 = org.webrtc.JniCommon.nativeAllocateByteBuffer(r0)
            r19 = r0
            r0 = r19
            r1 = r16
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r19
            r1 = r17
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r19
            java.nio.ByteBuffer r0 = r0.slice()
            r20 = r0
            r0 = r19
            r1 = r17
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r19
            r1 = r18
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r19
            java.nio.ByteBuffer r0 = r0.slice()
            r21 = r0
            r0 = r19
            r1 = r18
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r19
            r1 = r18
            r2 = r15
            r3 = r14
            int r2 = r2 * r3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.limit(r1)
            r0 = r19
            java.nio.ByteBuffer r0 = r0.slice()
            r22 = r0
            org.webrtc.JavaI420Buffer r0 = new org.webrtc.JavaI420Buffer
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r20
            r5 = r12
            r6 = r21
            r7 = r15
            r8 = r22
            r9 = r15
            r10 = r19
            org.webrtc.JavaI420Buffer r10 = () -> { // java.lang.Runnable.run():void
                lambda$allocate$0(r10);
            }
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
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

    @Override // org.webrtc.VideoFrame.I420Buffer
    public java.nio.ByteBuffer getDataY() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.dataY
            java.nio.ByteBuffer r0 = r0.slice()
            return r0
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public java.nio.ByteBuffer getDataU() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.dataU
            java.nio.ByteBuffer r0 = r0.slice()
            return r0
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public java.nio.ByteBuffer getDataV() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.dataV
            java.nio.ByteBuffer r0 = r0.slice()
            return r0
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
            r2 = this;
            r0 = r2
            int r0 = r0.strideY
            return r0
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
            r2 = this;
            r0 = r2
            int r0 = r0.strideU
            return r0
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
            r2 = this;
            r0 = r2
            int r0 = r0.strideV
            return r0
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.I420Buffer toI420() {
            r2 = this;
            r0 = r2
            r0.retain()
            r0 = r2
            return r0
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
            r2 = this;
            r0 = r2
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.retain()
            return
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
            r2 = this;
            r0 = r2
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.release()
            return
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public org.webrtc.VideoFrame.Buffer cropAndScale(int r9, int r10, int r11, int r12, int r13, int r14) {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.webrtc.VideoFrame$Buffer r0 = cropAndScaleI420(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }

    public static org.webrtc.VideoFrame.Buffer cropAndScaleI420(org.webrtc.VideoFrame.I420Buffer r19, int r20, int r21, int r22, int r23, int r24, int r25) {
            r0 = r22
            r1 = r24
            if (r0 != r1) goto L97
            r0 = r23
            r1 = r25
            if (r0 != r1) goto L97
            r0 = r19
            java.nio.ByteBuffer r0 = r0.getDataY()
            r26 = r0
            r0 = r19
            java.nio.ByteBuffer r0 = r0.getDataU()
            r27 = r0
            r0 = r19
            java.nio.ByteBuffer r0 = r0.getDataV()
            r28 = r0
            r0 = r26
            r1 = r20
            r2 = r21
            r3 = r19
            int r3 = r3.getStrideY()
            int r2 = r2 * r3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r27
            r1 = r20
            r2 = 2
            int r1 = r1 / r2
            r2 = r21
            r3 = 2
            int r2 = r2 / r3
            r3 = r19
            int r3 = r3.getStrideU()
            int r2 = r2 * r3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r28
            r1 = r20
            r2 = 2
            int r1 = r1 / r2
            r2 = r21
            r3 = 2
            int r2 = r2 / r3
            r3 = r19
            int r3 = r3.getStrideV()
            int r2 = r2 * r3
            int r1 = r1 + r2
            java.nio.ByteBuffer r0 = r0.position(r1)
            r0 = r19
            r0.retain()
            r0 = r24
            r1 = r25
            r2 = r26
            java.nio.ByteBuffer r2 = r2.slice()
            r3 = r19
            int r3 = r3.getStrideY()
            r4 = r27
            java.nio.ByteBuffer r4 = r4.slice()
            r5 = r19
            int r5 = r5.getStrideU()
            r6 = r28
            java.nio.ByteBuffer r6 = r6.slice()
            r7 = r19
            int r7 = r7.getStrideV()
            r8 = r19
            r9 = r8
            java.lang.Object r9 = java.util.Objects.requireNonNull(r9)
            org.webrtc.VideoFrame$Buffer r8 = r8::release
            org.webrtc.JavaI420Buffer r0 = wrap(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        L97:
            r0 = r24
            r1 = r25
            org.webrtc.JavaI420Buffer r0 = allocate(r0, r1)
            r26 = r0
            r0 = r19
            java.nio.ByteBuffer r0 = r0.getDataY()
            r1 = r19
            int r1 = r1.getStrideY()
            r2 = r19
            java.nio.ByteBuffer r2 = r2.getDataU()
            r3 = r19
            int r3 = r3.getStrideU()
            r4 = r19
            java.nio.ByteBuffer r4 = r4.getDataV()
            r5 = r19
            int r5 = r5.getStrideV()
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r26
            java.nio.ByteBuffer r10 = r10.getDataY()
            r11 = r26
            int r11 = r11.getStrideY()
            r12 = r26
            java.nio.ByteBuffer r12 = r12.getDataU()
            r13 = r26
            int r13 = r13.getStrideU()
            r14 = r26
            java.nio.ByteBuffer r14 = r14.getDataV()
            r15 = r26
            int r15 = r15.getStrideV()
            r16 = r24
            r17 = r25
            nativeCropAndScaleI420(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = r26
            return r0
    }

    private static native void nativeCropAndScaleI420(java.nio.ByteBuffer r0, int r1, java.nio.ByteBuffer r2, int r3, java.nio.ByteBuffer r4, int r5, int r6, int r7, int r8, int r9, java.nio.ByteBuffer r10, int r11, java.nio.ByteBuffer r12, int r13, java.nio.ByteBuffer r14, int r15, int r16, int r17);

    private static /* synthetic */ void lambda$allocate$0(java.nio.ByteBuffer r2) {
            r0 = r2
            org.webrtc.JniCommon.nativeFreeByteBuffer(r0)
            return
    }
}
