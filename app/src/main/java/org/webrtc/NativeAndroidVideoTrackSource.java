package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NativeAndroidVideoTrackSource.class */
class NativeAndroidVideoTrackSource {
    private final long nativeAndroidVideoTrackSource;

    public NativeAndroidVideoTrackSource(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.nativeAndroidVideoTrackSource = r1
            return
    }

    public void setState(boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.nativeAndroidVideoTrackSource
            r1 = r5
            nativeSetState(r0, r1)
            return
    }

    @androidx.annotation.Nullable
    public org.webrtc.VideoProcessor.FrameAdaptationParameters adaptFrame(org.webrtc.VideoFrame r9) {
            r8 = this;
            r0 = r8
            long r0 = r0.nativeAndroidVideoTrackSource
            r1 = r9
            org.webrtc.VideoFrame$Buffer r1 = r1.getBuffer()
            int r1 = r1.getWidth()
            r2 = r9
            org.webrtc.VideoFrame$Buffer r2 = r2.getBuffer()
            int r2 = r2.getHeight()
            r3 = r9
            int r3 = r3.getRotation()
            r4 = r9
            long r4 = r4.getTimestampNs()
            org.webrtc.VideoProcessor$FrameAdaptationParameters r0 = nativeAdaptFrame(r0, r1, r2, r3, r4)
            return r0
    }

    public void onFrameCaptured(org.webrtc.VideoFrame r8) {
            r7 = this;
            r0 = r7
            long r0 = r0.nativeAndroidVideoTrackSource
            r1 = r8
            int r1 = r1.getRotation()
            r2 = r8
            long r2 = r2.getTimestampNs()
            r3 = r8
            org.webrtc.VideoFrame$Buffer r3 = r3.getBuffer()
            nativeOnFrameCaptured(r0, r1, r2, r3)
            return
    }

    public void adaptOutputFormat(org.webrtc.VideoSource.AspectRatio r11, @androidx.annotation.Nullable java.lang.Integer r12, org.webrtc.VideoSource.AspectRatio r13, @androidx.annotation.Nullable java.lang.Integer r14, @androidx.annotation.Nullable java.lang.Integer r15) {
            r10 = this;
            r0 = r10
            long r0 = r0.nativeAndroidVideoTrackSource
            r1 = r11
            int r1 = r1.width
            r2 = r11
            int r2 = r2.height
            r3 = r12
            r4 = r13
            int r4 = r4.width
            r5 = r13
            int r5 = r5.height
            r6 = r14
            r7 = r15
            nativeAdaptOutputFormat(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public void setIsScreencast(boolean r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.nativeAndroidVideoTrackSource
            r1 = r5
            nativeSetIsScreencast(r0, r1)
            return
    }

    @org.webrtc.CalledByNative
    static org.webrtc.VideoProcessor.FrameAdaptationParameters createFrameAdaptationParameters(int r12, int r13, int r14, int r15, int r16, int r17, long r18, boolean r20) {
            org.webrtc.VideoProcessor$FrameAdaptationParameters r0 = new org.webrtc.VideoProcessor$FrameAdaptationParameters
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r20
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
    }

    private static native void nativeSetIsScreencast(long r0, boolean r2);

    private static native void nativeSetState(long r0, boolean r2);

    private static native void nativeAdaptOutputFormat(long r0, int r2, int r3, @androidx.annotation.Nullable java.lang.Integer r4, int r5, int r6, @androidx.annotation.Nullable java.lang.Integer r7, @androidx.annotation.Nullable java.lang.Integer r8);

    @androidx.annotation.Nullable
    private static native org.webrtc.VideoProcessor.FrameAdaptationParameters nativeAdaptFrame(long r0, int r2, int r3, int r4, long r5);

    private static native void nativeOnFrameCaptured(long r0, int r2, long r3, org.webrtc.VideoFrame.Buffer r5);
}
