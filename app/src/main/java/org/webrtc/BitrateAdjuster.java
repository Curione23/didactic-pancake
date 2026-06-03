package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/BitrateAdjuster.class */
interface BitrateAdjuster {
    void setTargets(int r1, double r2);

    void reportEncodedFrame(int r1);

    int getAdjustedBitrateBps();

    double getAdjustedFramerateFps();
}
