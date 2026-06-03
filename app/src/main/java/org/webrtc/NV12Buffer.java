package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NV12Buffer.class */
public class NV12Buffer implements org.webrtc.VideoFrame.Buffer {
    private final int width;
    private final int height;
    private final int stride;
    private final int sliceHeight;
    private final java.nio.ByteBuffer buffer;
    private final org.webrtc.RefCountDelegate refCountDelegate;

    public NV12Buffer(int r6, int r7, int r8, int r9, java.nio.ByteBuffer r10, @androidx.annotation.Nullable java.lang.Runnable r11) {
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
            r0.stride = r1
            r0 = r5
            r1 = r9
            r0.sliceHeight = r1
            r0 = r5
            r1 = r10
            r0.buffer = r1
            r0 = r5
            org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
            r2 = r1
            r3 = r11
            r2.<init>(r3)
            r0.refCountDelegate = r1
            return
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
            r8 = this;
            r0 = r8
            r1 = 0
            r2 = 0
            r3 = r8
            int r3 = r3.width
            r4 = r8
            int r4 = r4.height
            r5 = r8
            int r5 = r5.width
            r6 = r8
            int r6 = r6.height
            org.webrtc.VideoFrame$Buffer r0 = r0.cropAndScale(r1, r2, r3, r4, r5, r6)
            org.webrtc.VideoFrame$I420Buffer r0 = (org.webrtc.VideoFrame.I420Buffer) r0
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
    public org.webrtc.VideoFrame.Buffer cropAndScale(int r19, int r20, int r21, int r22, int r23, int r24) {
            r18 = this;
            r0 = r23
            r1 = r24
            org.webrtc.JavaI420Buffer r0 = org.webrtc.JavaI420Buffer.allocate(r0, r1)
            r25 = r0
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = r18
            java.nio.ByteBuffer r6 = r6.buffer
            r7 = r18
            int r7 = r7.width
            r8 = r18
            int r8 = r8.height
            r9 = r18
            int r9 = r9.stride
            r10 = r18
            int r10 = r10.sliceHeight
            r11 = r25
            java.nio.ByteBuffer r11 = r11.getDataY()
            r12 = r25
            int r12 = r12.getStrideY()
            r13 = r25
            java.nio.ByteBuffer r13 = r13.getDataU()
            r14 = r25
            int r14 = r14.getStrideU()
            r15 = r25
            java.nio.ByteBuffer r15 = r15.getDataV()
            r16 = r25
            int r16 = r16.getStrideV()
            nativeCropAndScale(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = r25
            return r0
    }

    private static native void nativeCropAndScale(int r0, int r1, int r2, int r3, int r4, int r5, java.nio.ByteBuffer r6, int r7, int r8, int r9, int r10, java.nio.ByteBuffer r11, int r12, java.nio.ByteBuffer r13, int r14, java.nio.ByteBuffer r15, int r16);
}
