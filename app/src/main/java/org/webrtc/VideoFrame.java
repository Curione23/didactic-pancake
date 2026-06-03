package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrame.class */
public class VideoFrame implements org.webrtc.RefCounted {
    private final org.webrtc.VideoFrame.Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrame$Buffer.class */
    public interface Buffer extends org.webrtc.RefCounted {
        @org.webrtc.CalledByNative("Buffer")
        default int getBufferType() {
                r2 = this;
                r0 = 0
                return r0
        }

        @org.webrtc.CalledByNative("Buffer")
        int getWidth();

        @org.webrtc.CalledByNative("Buffer")
        int getHeight();

        @androidx.annotation.Nullable
        @org.webrtc.CalledByNative("Buffer")
        org.webrtc.VideoFrame.I420Buffer toI420();

        @Override // org.webrtc.RefCounted
        @org.webrtc.CalledByNative("Buffer")
        void retain();

        @Override // org.webrtc.RefCounted
        @org.webrtc.CalledByNative("Buffer")
        void release();

        @org.webrtc.CalledByNative("Buffer")
        org.webrtc.VideoFrame.Buffer cropAndScale(int r1, int r2, int r3, int r4, int r5, int r6);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrame$I420Buffer.class */
    public interface I420Buffer extends org.webrtc.VideoFrame.Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        default int getBufferType() {
                r2 = this;
                r0 = 1
                return r0
        }

        @org.webrtc.CalledByNative("I420Buffer")
        java.nio.ByteBuffer getDataY();

        @org.webrtc.CalledByNative("I420Buffer")
        java.nio.ByteBuffer getDataU();

        @org.webrtc.CalledByNative("I420Buffer")
        java.nio.ByteBuffer getDataV();

        @org.webrtc.CalledByNative("I420Buffer")
        int getStrideY();

        @org.webrtc.CalledByNative("I420Buffer")
        int getStrideU();

        @org.webrtc.CalledByNative("I420Buffer")
        int getStrideV();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrame$TextureBuffer.class */
    public interface TextureBuffer extends org.webrtc.VideoFrame.Buffer {

        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoFrame$TextureBuffer$Type.class */
        public enum Type extends java.lang.Enum<org.webrtc.VideoFrame.TextureBuffer.Type> {
            public static final org.webrtc.VideoFrame.TextureBuffer.Type OES = null;
            public static final org.webrtc.VideoFrame.TextureBuffer.Type RGB = null;
            private final int glTarget;
            private static final /* synthetic */ org.webrtc.VideoFrame.TextureBuffer.Type[] $VALUES = null;

            public static org.webrtc.VideoFrame.TextureBuffer.Type[] values() {
                    org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = org.webrtc.VideoFrame.TextureBuffer.Type.$VALUES
                    java.lang.Object r0 = r0.clone()
                    org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = (org.webrtc.VideoFrame.TextureBuffer.Type[]) r0
                    return r0
            }

            public static org.webrtc.VideoFrame.TextureBuffer.Type valueOf(java.lang.String r3) {
                    java.lang.Class<org.webrtc.VideoFrame$TextureBuffer$Type> r0 = org.webrtc.VideoFrame.TextureBuffer.Type.class
                    r1 = r3
                    java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                    org.webrtc.VideoFrame$TextureBuffer$Type r0 = (org.webrtc.VideoFrame.TextureBuffer.Type) r0
                    return r0
            }

            Type(java.lang.String r5, int r6, int r7) {
                    r4 = this;
                    r0 = r4
                    r1 = r5
                    r2 = r6
                    r0.<init>(r1, r2)
                    r0 = r4
                    r1 = r7
                    r0.glTarget = r1
                    return
            }

            public int getGlTarget() {
                    r2 = this;
                    r0 = r2
                    int r0 = r0.glTarget
                    return r0
            }

            private static /* synthetic */ org.webrtc.VideoFrame.TextureBuffer.Type[] $values() {
                    r0 = 2
                    org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = new org.webrtc.VideoFrame.TextureBuffer.Type[r0]
                    r1 = r0
                    r2 = 0
                    org.webrtc.VideoFrame$TextureBuffer$Type r3 = org.webrtc.VideoFrame.TextureBuffer.Type.OES
                    r1[r2] = r3
                    r1 = r0
                    r2 = 1
                    org.webrtc.VideoFrame$TextureBuffer$Type r3 = org.webrtc.VideoFrame.TextureBuffer.Type.RGB
                    r1[r2] = r3
                    return r0
            }

            static {
                    org.webrtc.VideoFrame$TextureBuffer$Type r0 = new org.webrtc.VideoFrame$TextureBuffer$Type
                    r1 = r0
                    java.lang.String r2 = "OES"
                    r3 = 0
                    r4 = 36197(0x8d65, float:5.0723E-41)
                    r1.<init>(r2, r3, r4)
                    org.webrtc.VideoFrame.TextureBuffer.Type.OES = r0
                    org.webrtc.VideoFrame$TextureBuffer$Type r0 = new org.webrtc.VideoFrame$TextureBuffer$Type
                    r1 = r0
                    java.lang.String r2 = "RGB"
                    r3 = 1
                    r4 = 3553(0xde1, float:4.979E-42)
                    r1.<init>(r2, r3, r4)
                    org.webrtc.VideoFrame.TextureBuffer.Type.RGB = r0
                    org.webrtc.VideoFrame$TextureBuffer$Type[] r0 = $values()
                    org.webrtc.VideoFrame.TextureBuffer.Type.$VALUES = r0
                    return
            }
        }

        org.webrtc.VideoFrame.TextureBuffer.Type getType();

        int getTextureId();

        android.graphics.Matrix getTransformMatrix();

        default org.webrtc.VideoFrame.TextureBuffer applyTransformMatrix(android.graphics.Matrix r5, int r6, int r7) {
                r4 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r1 = r0
                java.lang.String r2 = "Not implemented"
                r1.<init>(r2)
                throw r0
        }

        default int getUnscaledWidth() {
                r2 = this;
                r0 = r2
                int r0 = r0.getWidth()
                return r0
        }

        default int getUnscaledHeight() {
                r2 = this;
                r0 = r2
                int r0 = r0.getHeight()
                return r0
        }
    }

    @org.webrtc.CalledByNative
    public VideoFrame(org.webrtc.VideoFrame.Buffer r5, int r6, long r7) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 != 0) goto L12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "buffer not allowed to be null"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r6
            r1 = 90
            int r0 = r0 % r1
            if (r0 == 0) goto L23
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "rotation must be a multiple of 90"
            r1.<init>(r2)
            throw r0
        L23:
            r0 = r4
            r1 = r5
            r0.buffer = r1
            r0 = r4
            r1 = r6
            r0.rotation = r1
            r0 = r4
            r1 = r7
            r0.timestampNs = r1
            return
    }

    @org.webrtc.CalledByNative
    public org.webrtc.VideoFrame.Buffer getBuffer() {
            r2 = this;
            r0 = r2
            org.webrtc.VideoFrame$Buffer r0 = r0.buffer
            return r0
    }

    @org.webrtc.CalledByNative
    public int getRotation() {
            r2 = this;
            r0 = r2
            int r0 = r0.rotation
            return r0
    }

    @org.webrtc.CalledByNative
    public long getTimestampNs() {
            r3 = this;
            r0 = r3
            long r0 = r0.timestampNs
            return r0
    }

    public int getRotatedWidth() {
            r3 = this;
            r0 = r3
            int r0 = r0.rotation
            r1 = 180(0xb4, float:2.52E-43)
            int r0 = r0 % r1
            if (r0 != 0) goto L15
            r0 = r3
            org.webrtc.VideoFrame$Buffer r0 = r0.buffer
            int r0 = r0.getWidth()
            return r0
        L15:
            r0 = r3
            org.webrtc.VideoFrame$Buffer r0 = r0.buffer
            int r0 = r0.getHeight()
            return r0
    }

    public int getRotatedHeight() {
            r3 = this;
            r0 = r3
            int r0 = r0.rotation
            r1 = 180(0xb4, float:2.52E-43)
            int r0 = r0 % r1
            if (r0 != 0) goto L15
            r0 = r3
            org.webrtc.VideoFrame$Buffer r0 = r0.buffer
            int r0 = r0.getHeight()
            return r0
        L15:
            r0 = r3
            org.webrtc.VideoFrame$Buffer r0 = r0.buffer
            int r0 = r0.getWidth()
            return r0
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
            r2 = this;
            r0 = r2
            org.webrtc.VideoFrame$Buffer r0 = r0.buffer
            r0.retain()
            return
    }

    @Override // org.webrtc.RefCounted
    @org.webrtc.CalledByNative
    public void release() {
            r2 = this;
            r0 = r2
            org.webrtc.VideoFrame$Buffer r0 = r0.buffer
            r0.release()
            return
    }
}
