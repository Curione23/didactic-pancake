package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RTCStatsCollectorCallback.class */
public interface RTCStatsCollectorCallback {
    @org.webrtc.CalledByNative
    void onStatsDelivered(org.webrtc.RTCStatsReport r1);
}
