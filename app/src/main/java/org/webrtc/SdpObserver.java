package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/SdpObserver.class */
public interface SdpObserver {
    @org.webrtc.CalledByNative
    void onCreateSuccess(org.webrtc.SessionDescription r1);

    @org.webrtc.CalledByNative
    void onSetSuccess();

    @org.webrtc.CalledByNative
    void onCreateFailure(java.lang.String r1);

    @org.webrtc.CalledByNative
    void onSetFailure(java.lang.String r1);
}
