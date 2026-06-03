package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/AddIceObserver.class */
public interface AddIceObserver {
    @org.webrtc.CalledByNative
    void onAddSuccess();

    @org.webrtc.CalledByNative
    void onAddFailure(java.lang.String r1);
}
