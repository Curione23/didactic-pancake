package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CandidatePairChangeEvent.class */
public final class CandidatePairChangeEvent {
    public final org.webrtc.IceCandidate local;
    public final org.webrtc.IceCandidate remote;
    public final int lastDataReceivedMs;
    public final java.lang.String reason;
    public final int estimatedDisconnectedTimeMs;

    @org.webrtc.CalledByNative
    CandidatePairChangeEvent(org.webrtc.IceCandidate r4, org.webrtc.IceCandidate r5, int r6, java.lang.String r7, int r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.local = r1
            r0 = r3
            r1 = r5
            r0.remote = r1
            r0 = r3
            r1 = r6
            r0.lastDataReceivedMs = r1
            r0 = r3
            r1 = r7
            r0.reason = r1
            r0 = r3
            r1 = r8
            r0.estimatedDisconnectedTimeMs = r1
            return
    }
}
