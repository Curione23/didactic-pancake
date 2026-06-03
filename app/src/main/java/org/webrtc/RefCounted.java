package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RefCounted.class */
public interface RefCounted {
    @org.webrtc.CalledByNative
    void retain();

    @org.webrtc.CalledByNative
    void release();
}
