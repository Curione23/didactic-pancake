package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NV21Buffer.class */
public class NV21Buffer implements org.webrtc.VideoFrame.Buffer {
    private final byte[] data;
    private final int width;
    private final int height;
    private final org.webrtc.RefCountDelegate refCountDelegate;

    public NV21Buffer(byte[] r6, int r7, int r8, @androidx.annotation.Nullable java.lang.Runnable r9) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.data = r1
            r0 = r5
            r1 = r7
            r0.width = r1
            r0 = r5
            r1 = r8
            r0.height = r1
            r0 = r5
            org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
            r2 = r1
            r3 = r9
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
    public org.webrtc.VideoFrame.Buffer cropAndScale(int r17, int r18, int r19, int r20, int r21, int r22) {
            r16 = this;
            r0 = r21
            r1 = r22
            org.webrtc.JavaI420Buffer r0 = org.webrtc.JavaI420Buffer.allocate(r0, r1)
            r23 = r0
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r16
            byte[] r6 = r6.data
            r7 = r16
            int r7 = r7.width
            r8 = r16
            int r8 = r8.height
            r9 = r23
            java.nio.ByteBuffer r9 = r9.getDataY()
            r10 = r23
            int r10 = r10.getStrideY()
            r11 = r23
            java.nio.ByteBuffer r11 = r11.getDataU()
            r12 = r23
            int r12 = r12.getStrideU()
            r13 = r23
            java.nio.ByteBuffer r13 = r13.getDataV()
            r14 = r23
            int r14 = r14.getStrideV()
            nativeCropAndScale(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r23
            return r0
    }

    private static native void nativeCropAndScale(int r0, int r1, int r2, int r3, int r4, int r5, byte[] r6, int r7, int r8, java.nio.ByteBuffer r9, int r10, java.nio.ByteBuffer r11, int r12, java.nio.ByteBuffer r13, int r14);
}
