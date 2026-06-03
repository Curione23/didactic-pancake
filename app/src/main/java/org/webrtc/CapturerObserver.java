package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CapturerObserver.class */
public interface CapturerObserver {
    void onCapturerStarted(boolean r1);

    void onCapturerStopped();

    void onFrameCaptured(org.webrtc.VideoFrame r1);
}
