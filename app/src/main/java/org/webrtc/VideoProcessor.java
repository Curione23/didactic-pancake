package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoProcessor.class */
public interface VideoProcessor extends org.webrtc.CapturerObserver {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoProcessor$FrameAdaptationParameters.class */
    public static class FrameAdaptationParameters {
        public final int cropX;
        public final int cropY;
        public final int cropWidth;
        public final int cropHeight;
        public final int scaleWidth;
        public final int scaleHeight;
        public final long timestampNs;
        public final boolean drop;

        public FrameAdaptationParameters(int r5, int r6, int r7, int r8, int r9, int r10, long r11, boolean r13) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.cropX = r1
                r0 = r4
                r1 = r6
                r0.cropY = r1
                r0 = r4
                r1 = r7
                r0.cropWidth = r1
                r0 = r4
                r1 = r8
                r0.cropHeight = r1
                r0 = r4
                r1 = r9
                r0.scaleWidth = r1
                r0 = r4
                r1 = r10
                r0.scaleHeight = r1
                r0 = r4
                r1 = r11
                r0.timestampNs = r1
                r0 = r4
                r1 = r13
                r0.drop = r1
                return
        }
    }

    default void onFrameCaptured(org.webrtc.VideoFrame r4, org.webrtc.VideoProcessor.FrameAdaptationParameters r5) {
            r3 = this;
            r0 = r4
            r1 = r5
            org.webrtc.VideoFrame r0 = applyFrameAdaptationParameters(r0, r1)
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L15
            r0 = r3
            r1 = r6
            r0.onFrameCaptured(r1)
            r0 = r6
            r0.release()
        L15:
            return
    }

    void setSink(@androidx.annotation.Nullable org.webrtc.VideoSink r1);

    @androidx.annotation.Nullable
    static org.webrtc.VideoFrame applyFrameAdaptationParameters(org.webrtc.VideoFrame r8, org.webrtc.VideoProcessor.FrameAdaptationParameters r9) {
            r0 = r9
            boolean r0 = r0.drop
            if (r0 == 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r8
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            r1 = r9
            int r1 = r1.cropX
            r2 = r9
            int r2 = r2.cropY
            r3 = r9
            int r3 = r3.cropWidth
            r4 = r9
            int r4 = r4.cropHeight
            r5 = r9
            int r5 = r5.scaleWidth
            r6 = r9
            int r6 = r6.scaleHeight
            org.webrtc.VideoFrame$Buffer r0 = r0.cropAndScale(r1, r2, r3, r4, r5, r6)
            r10 = r0
            org.webrtc.VideoFrame r0 = new org.webrtc.VideoFrame
            r1 = r0
            r2 = r10
            r3 = r8
            int r3 = r3.getRotation()
            r4 = r9
            long r4 = r4.timestampNs
            r1.<init>(r2, r3, r4)
            return r0
    }
}
