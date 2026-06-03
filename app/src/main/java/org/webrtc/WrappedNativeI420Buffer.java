package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/WrappedNativeI420Buffer.class */
class WrappedNativeI420Buffer implements org.webrtc.VideoFrame.I420Buffer {
    private final int width;
    private final int height;
    private final java.nio.ByteBuffer dataY;
    private final int strideY;
    private final java.nio.ByteBuffer dataU;
    private final int strideU;
    private final java.nio.ByteBuffer dataV;
    private final int strideV;
    private final long nativeBuffer;

    @org.webrtc.CalledByNative
    WrappedNativeI420Buffer(int r5, int r6, java.nio.ByteBuffer r7, int r8, java.nio.ByteBuffer r9, int r10, java.nio.ByteBuffer r11, int r12, long r13) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.width = r1
            r0 = r4
            r1 = r6
            r0.height = r1
            r0 = r4
            r1 = r7
            r0.dataY = r1
            r0 = r4
            r1 = r8
            r0.strideY = r1
            r0 = r4
            r1 = r9
            r0.dataU = r1
            r0 = r4
            r1 = r10
            r0.strideU = r1
            r0 = r4
            r1 = r11
            r0.dataV = r1
            r0 = r4
            r1 = r12
            r0.strideV = r1
            r0 = r4
            r1 = r13
            r0.nativeBuffer = r1
            r0 = r4
            r0.retain()
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
            r3 = this;
            r0 = r3
            long r0 = r0.nativeBuffer
            org.webrtc.JniCommon.nativeAddRef(r0)
            return
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
            r3 = this;
            r0 = r3
            long r0 = r0.nativeBuffer
            org.webrtc.JniCommon.nativeReleaseRef(r0)
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
            org.webrtc.VideoFrame$Buffer r0 = org.webrtc.JavaI420Buffer.cropAndScaleI420(r0, r1, r2, r3, r4, r5, r6)
            return r0
    }
}
