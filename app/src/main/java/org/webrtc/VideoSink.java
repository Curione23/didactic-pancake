package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoSink.class */
public interface VideoSink {
    @org.webrtc.CalledByNative
    void onFrame(org.webrtc.VideoFrame r1);
}
