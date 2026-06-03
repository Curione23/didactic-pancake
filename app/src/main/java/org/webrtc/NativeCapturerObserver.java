package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/NativeCapturerObserver.class */
class NativeCapturerObserver implements org.webrtc.CapturerObserver {
    private final org.webrtc.NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    @org.webrtc.CalledByNative
    public NativeCapturerObserver(long r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            org.webrtc.NativeAndroidVideoTrackSource r1 = new org.webrtc.NativeAndroidVideoTrackSource
            r2 = r1
            r3 = r7
            r2.<init>(r3)
            r0.nativeAndroidVideoTrackSource = r1
            return
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean r4) {
            r3 = this;
            r0 = r3
            org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
            r1 = r4
            r0.setState(r1)
            return
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
            r3 = this;
            r0 = r3
            org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
            r1 = 0
            r0.setState(r1)
            return
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(org.webrtc.VideoFrame r9) {
            r8 = this;
            r0 = r8
            org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
            r1 = r9
            org.webrtc.VideoProcessor$FrameAdaptationParameters r0 = r0.adaptFrame(r1)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto Le
            return
        Le:
            r0 = r9
            org.webrtc.VideoFrame$Buffer r0 = r0.getBuffer()
            r1 = r10
            int r1 = r1.cropX
            r2 = r10
            int r2 = r2.cropY
            r3 = r10
            int r3 = r3.cropWidth
            r4 = r10
            int r4 = r4.cropHeight
            r5 = r10
            int r5 = r5.scaleWidth
            r6 = r10
            int r6 = r6.scaleHeight
            org.webrtc.VideoFrame$Buffer r0 = r0.cropAndScale(r1, r2, r3, r4, r5, r6)
            r11 = r0
            r0 = r8
            org.webrtc.NativeAndroidVideoTrackSource r0 = r0.nativeAndroidVideoTrackSource
            org.webrtc.VideoFrame r1 = new org.webrtc.VideoFrame
            r2 = r1
            r3 = r11
            r4 = r9
            int r4 = r4.getRotation()
            r5 = r10
            long r5 = r5.timestampNs
            r2.<init>(r3, r4, r5)
            r0.onFrameCaptured(r1)
            r0 = r11
            r0.release()
            return
    }
}
