package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoCapturer.class */
public interface VideoCapturer {
    void initialize(org.webrtc.SurfaceTextureHelper r1, android.content.Context r2, org.webrtc.CapturerObserver r3);

    void startCapture(int r1, int r2, int r3);

    void stopCapture() throws java.lang.InterruptedException;

    void changeCaptureFormat(int r1, int r2, int r3);

    void dispose();

    boolean isScreencast();
}
