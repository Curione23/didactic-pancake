package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/IceCandidateErrorEvent.class */
public final class IceCandidateErrorEvent {
    public final java.lang.String address;
    public final int port;
    public final java.lang.String url;
    public final int errorCode;
    public final java.lang.String errorText;

    @org.webrtc.CalledByNative
    public IceCandidateErrorEvent(java.lang.String r4, int r5, java.lang.String r6, int r7, java.lang.String r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.address = r1
            r0 = r3
            r1 = r5
            r0.port = r1
            r0 = r3
            r1 = r6
            r0.url = r1
            r0 = r3
            r1 = r7
            r0.errorCode = r1
            r0 = r3
            r1 = r8
            r0.errorText = r1
            return
    }
}
