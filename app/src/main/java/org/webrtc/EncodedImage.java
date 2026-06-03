package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EncodedImage.class */
public class EncodedImage implements org.webrtc.RefCounted {
    private final org.webrtc.RefCountDelegate refCountDelegate;
    public final java.nio.ByteBuffer buffer;
    public final int encodedWidth;
    public final int encodedHeight;
    public final long captureTimeMs;
    public final long captureTimeNs;
    public final org.webrtc.EncodedImage.FrameType frameType;
    public final int rotation;

    @androidx.annotation.Nullable
    public final java.lang.Integer qp;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EncodedImage$Builder.class */
    public static class Builder {
        private java.nio.ByteBuffer buffer;

        @androidx.annotation.Nullable
        private java.lang.Runnable releaseCallback;
        private int encodedWidth;
        private int encodedHeight;
        private long captureTimeNs;
        private org.webrtc.EncodedImage.FrameType frameType;
        private int rotation;

        @androidx.annotation.Nullable
        private java.lang.Integer qp;

        private Builder() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public org.webrtc.EncodedImage.Builder setBuffer(java.nio.ByteBuffer r4, @androidx.annotation.Nullable java.lang.Runnable r5) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.buffer = r1
                r0 = r3
                r1 = r5
                r0.releaseCallback = r1
                r0 = r3
                return r0
        }

        public org.webrtc.EncodedImage.Builder setEncodedWidth(int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.encodedWidth = r1
                r0 = r3
                return r0
        }

        public org.webrtc.EncodedImage.Builder setEncodedHeight(int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.encodedHeight = r1
                r0 = r3
                return r0
        }

        @java.lang.Deprecated
        public org.webrtc.EncodedImage.Builder setCaptureTimeMs(long r6) {
                r5 = this;
                r0 = r5
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
                r2 = r6
                long r1 = r1.toNanos(r2)
                r0.captureTimeNs = r1
                r0 = r5
                return r0
        }

        public org.webrtc.EncodedImage.Builder setCaptureTimeNs(long r5) {
                r4 = this;
                r0 = r4
                r1 = r5
                r0.captureTimeNs = r1
                r0 = r4
                return r0
        }

        public org.webrtc.EncodedImage.Builder setFrameType(org.webrtc.EncodedImage.FrameType r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.frameType = r1
                r0 = r3
                return r0
        }

        public org.webrtc.EncodedImage.Builder setRotation(int r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.rotation = r1
                r0 = r3
                return r0
        }

        public org.webrtc.EncodedImage.Builder setQp(@androidx.annotation.Nullable java.lang.Integer r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.qp = r1
                r0 = r3
                return r0
        }

        public org.webrtc.EncodedImage createEncodedImage() {
                r12 = this;
                org.webrtc.EncodedImage r0 = new org.webrtc.EncodedImage
                r1 = r0
                r2 = r12
                java.nio.ByteBuffer r2 = r2.buffer
                r3 = r12
                java.lang.Runnable r3 = r3.releaseCallback
                r4 = r12
                int r4 = r4.encodedWidth
                r5 = r12
                int r5 = r5.encodedHeight
                r6 = r12
                long r6 = r6.captureTimeNs
                r7 = r12
                org.webrtc.EncodedImage$FrameType r7 = r7.frameType
                r8 = r12
                int r8 = r8.rotation
                r9 = r12
                java.lang.Integer r9 = r9.qp
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EncodedImage$FrameType.class */
    public enum FrameType extends java.lang.Enum<org.webrtc.EncodedImage.FrameType> {
        public static final org.webrtc.EncodedImage.FrameType EmptyFrame = null;
        public static final org.webrtc.EncodedImage.FrameType VideoFrameKey = null;
        public static final org.webrtc.EncodedImage.FrameType VideoFrameDelta = null;
        private final int nativeIndex;
        private static final /* synthetic */ org.webrtc.EncodedImage.FrameType[] $VALUES = null;

        public static org.webrtc.EncodedImage.FrameType[] values() {
                org.webrtc.EncodedImage$FrameType[] r0 = org.webrtc.EncodedImage.FrameType.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.EncodedImage$FrameType[] r0 = (org.webrtc.EncodedImage.FrameType[]) r0
                return r0
        }

        public static org.webrtc.EncodedImage.FrameType valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.EncodedImage$FrameType> r0 = org.webrtc.EncodedImage.FrameType.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.EncodedImage$FrameType r0 = (org.webrtc.EncodedImage.FrameType) r0
                return r0
        }

        FrameType(java.lang.String r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.nativeIndex = r1
                return
        }

        public int getNative() {
                r2 = this;
                r0 = r2
                int r0 = r0.nativeIndex
                return r0
        }

        @org.webrtc.CalledByNative("FrameType")
        static org.webrtc.EncodedImage.FrameType fromNativeIndex(int r4) {
                org.webrtc.EncodedImage$FrameType[] r0 = values()
                r5 = r0
                r0 = r5
                int r0 = r0.length
                r6 = r0
                r0 = 0
                r7 = r0
            L9:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L25
                r0 = r5
                r1 = r7
                r0 = r0[r1]
                r8 = r0
                r0 = r8
                int r0 = r0.getNative()
                r1 = r4
                if (r0 != r1) goto L1f
                r0 = r8
                return r0
            L1f:
                int r7 = r7 + 1
                goto L9
            L25:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                r2 = r4
                java.lang.String r2 = "Unknown native frame type: " + r2
                r1.<init>(r2)
                throw r0
        }

        private static /* synthetic */ org.webrtc.EncodedImage.FrameType[] $values() {
                r0 = 3
                org.webrtc.EncodedImage$FrameType[] r0 = new org.webrtc.EncodedImage.FrameType[r0]
                r1 = r0
                r2 = 0
                org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.EmptyFrame
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.VideoFrameKey
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.EncodedImage$FrameType r3 = org.webrtc.EncodedImage.FrameType.VideoFrameDelta
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.EncodedImage$FrameType r0 = new org.webrtc.EncodedImage$FrameType
                r1 = r0
                java.lang.String r2 = "EmptyFrame"
                r3 = 0
                r4 = 0
                r1.<init>(r2, r3, r4)
                org.webrtc.EncodedImage.FrameType.EmptyFrame = r0
                org.webrtc.EncodedImage$FrameType r0 = new org.webrtc.EncodedImage$FrameType
                r1 = r0
                java.lang.String r2 = "VideoFrameKey"
                r3 = 1
                r4 = 3
                r1.<init>(r2, r3, r4)
                org.webrtc.EncodedImage.FrameType.VideoFrameKey = r0
                org.webrtc.EncodedImage$FrameType r0 = new org.webrtc.EncodedImage$FrameType
                r1 = r0
                java.lang.String r2 = "VideoFrameDelta"
                r3 = 2
                r4 = 4
                r1.<init>(r2, r3, r4)
                org.webrtc.EncodedImage.FrameType.VideoFrameDelta = r0
                org.webrtc.EncodedImage$FrameType[] r0 = $values()
                org.webrtc.EncodedImage.FrameType.$VALUES = r0
                return
        }
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
            r2 = this;
            r0 = r2
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.retain()
            return
    }

    @Override // org.webrtc.RefCounted
    public void release() {
            r2 = this;
            r0 = r2
            org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
            r0.release()
            return
    }

    @org.webrtc.CalledByNative
    private EncodedImage(java.nio.ByteBuffer r6, @androidx.annotation.Nullable java.lang.Runnable r7, int r8, int r9, long r10, org.webrtc.EncodedImage.FrameType r12, int r13, @androidx.annotation.Nullable java.lang.Integer r14) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r5
            r1 = r6
            r0.buffer = r1
            r0 = r5
            r1 = r8
            r0.encodedWidth = r1
            r0 = r5
            r1 = r9
            r0.encodedHeight = r1
            r0 = r5
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS
            r2 = r10
            long r1 = r1.toMillis(r2)
            r0.captureTimeMs = r1
            r0 = r5
            r1 = r10
            r0.captureTimeNs = r1
            r0 = r5
            r1 = r12
            r0.frameType = r1
            r0 = r5
            r1 = r13
            r0.rotation = r1
            r0 = r5
            r1 = r14
            r0.qp = r1
            r0 = r5
            org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.refCountDelegate = r1
            return
    }

    @org.webrtc.CalledByNative
    private java.nio.ByteBuffer getBuffer() {
            r2 = this;
            r0 = r2
            java.nio.ByteBuffer r0 = r0.buffer
            return r0
    }

    @org.webrtc.CalledByNative
    private int getEncodedWidth() {
            r2 = this;
            r0 = r2
            int r0 = r0.encodedWidth
            return r0
    }

    @org.webrtc.CalledByNative
    private int getEncodedHeight() {
            r2 = this;
            r0 = r2
            int r0 = r0.encodedHeight
            return r0
    }

    @org.webrtc.CalledByNative
    private long getCaptureTimeNs() {
            r3 = this;
            r0 = r3
            long r0 = r0.captureTimeNs
            return r0
    }

    @org.webrtc.CalledByNative
    private int getFrameType() {
            r2 = this;
            r0 = r2
            org.webrtc.EncodedImage$FrameType r0 = r0.frameType
            int r0 = r0.getNative()
            return r0
    }

    @org.webrtc.CalledByNative
    private int getRotation() {
            r2 = this;
            r0 = r2
            int r0 = r0.rotation
            return r0
    }

    @androidx.annotation.Nullable
    @org.webrtc.CalledByNative
    private java.lang.Integer getQp() {
            r2 = this;
            r0 = r2
            java.lang.Integer r0 = r0.qp
            return r0
    }

    public static org.webrtc.EncodedImage.Builder builder() {
            org.webrtc.EncodedImage$Builder r0 = new org.webrtc.EncodedImage$Builder
            r1 = r0
            r1.<init>()
            return r0
    }
}
