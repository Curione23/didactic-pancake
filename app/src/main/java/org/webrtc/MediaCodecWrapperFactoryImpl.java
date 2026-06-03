package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaCodecWrapperFactoryImpl.class */
class MediaCodecWrapperFactoryImpl implements org.webrtc.MediaCodecWrapperFactory {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl.class */
    private static class MediaCodecWrapperImpl implements org.webrtc.MediaCodecWrapper {
        private final android.media.MediaCodec mediaCodec;

        public MediaCodecWrapperImpl(android.media.MediaCodec r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.mediaCodec = r1
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void configure(android.media.MediaFormat r7, android.view.Surface r8, android.media.MediaCrypto r9, int r10) {
                r6 = this;
                r0 = r6
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r0.configure(r1, r2, r3, r4)
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void start() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                r0.start()
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void flush() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                r0.flush()
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void stop() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                r0.stop()
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void release() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                r0.release()
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueInputBuffer(long r5) {
                r4 = this;
                r0 = r4
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r5
                int r0 = r0.dequeueInputBuffer(r1)
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void queueInputBuffer(int r9, int r10, int r11, long r12, int r14) {
                r8 = this;
                r0 = r8
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r9
                r2 = r10
                r3 = r11
                r4 = r12
                r5 = r14
                r0.queueInputBuffer(r1, r2, r3, r4, r5)
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo r6, long r7) {
                r5 = this;
                r0 = r5
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r6
                r2 = r7
                int r0 = r0.dequeueOutputBuffer(r1, r2)
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void releaseOutputBuffer(int r5, boolean r6) {
                r4 = this;
                r0 = r4
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r5
                r2 = r6
                r0.releaseOutputBuffer(r1, r2)
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public android.media.MediaFormat getInputFormat() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                android.media.MediaFormat r0 = r0.getInputFormat()
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public android.media.MediaFormat getOutputFormat() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                android.media.MediaFormat r0 = r0.getOutputFormat()
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public android.media.MediaFormat getOutputFormat(int r4) {
                r3 = this;
                r0 = r3
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r4
                android.media.MediaFormat r0 = r0.getOutputFormat(r1)
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public java.nio.ByteBuffer getInputBuffer(int r4) {
                r3 = this;
                r0 = r3
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r4
                java.nio.ByteBuffer r0 = r0.getInputBuffer(r1)
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public java.nio.ByteBuffer getOutputBuffer(int r4) {
                r3 = this;
                r0 = r3
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r4
                java.nio.ByteBuffer r0 = r0.getOutputBuffer(r1)
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public android.view.Surface createInputSurface() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                android.view.Surface r0 = r0.createInputSurface()
                return r0
        }

        @Override // org.webrtc.MediaCodecWrapper
        public void setParameters(android.os.Bundle r4) {
                r3 = this;
                r0 = r3
                android.media.MediaCodec r0 = r0.mediaCodec
                r1 = r4
                r0.setParameters(r1)
                return
        }

        @Override // org.webrtc.MediaCodecWrapper
        public android.media.MediaCodecInfo getCodecInfo() {
                r2 = this;
                r0 = r2
                android.media.MediaCodec r0 = r0.mediaCodec
                android.media.MediaCodecInfo r0 = r0.getCodecInfo()
                return r0
        }
    }

    MediaCodecWrapperFactoryImpl() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.MediaCodecWrapperFactory
    public org.webrtc.MediaCodecWrapper createByCodecName(java.lang.String r5) throws java.io.IOException {
            r4 = this;
            org.webrtc.MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl r0 = new org.webrtc.MediaCodecWrapperFactoryImpl$MediaCodecWrapperImpl
            r1 = r0
            r2 = r5
            android.media.MediaCodec r2 = android.media.MediaCodec.createByCodecName(r2)
            r1.<init>(r2)
            return r0
    }
}
