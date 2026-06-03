package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CameraEnumerator.class */
public interface CameraEnumerator {
    java.lang.String[] getDeviceNames();

    boolean isFrontFacing(java.lang.String r1);

    boolean isBackFacing(java.lang.String r1);

    java.util.List<org.webrtc.CameraEnumerationAndroid.CaptureFormat> getSupportedFormats(java.lang.String r1);

    org.webrtc.CameraVideoCapturer createCapturer(java.lang.String r1, org.webrtc.CameraVideoCapturer.CameraEventsHandler r2);
}
