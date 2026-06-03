package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaCodecWrapper.class */
interface MediaCodecWrapper {
    void configure(android.media.MediaFormat r1, android.view.Surface r2, android.media.MediaCrypto r3, int r4);

    void start();

    void flush();

    void stop();

    void release();

    int dequeueInputBuffer(long r1);

    void queueInputBuffer(int r1, int r2, int r3, long r4, int r6);

    int dequeueOutputBuffer(android.media.MediaCodec.BufferInfo r1, long r2);

    void releaseOutputBuffer(int r1, boolean r2);

    android.media.MediaFormat getInputFormat();

    android.media.MediaFormat getOutputFormat();

    android.media.MediaFormat getOutputFormat(int r1);

    java.nio.ByteBuffer getInputBuffer(int r1);

    java.nio.ByteBuffer getOutputBuffer(int r1);

    android.view.Surface createInputSurface();

    void setParameters(android.os.Bundle r1);

    android.media.MediaCodecInfo getCodecInfo();
}
