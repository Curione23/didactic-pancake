package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/IceCandidate.class */
public class IceCandidate {
    public final java.lang.String sdpMid;
    public final int sdpMLineIndex;
    public final java.lang.String sdp;
    public final java.lang.String serverUrl;
    public final org.webrtc.PeerConnection.AdapterType adapterType;

    public IceCandidate(java.lang.String r4, int r5, java.lang.String r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.sdpMid = r1
            r0 = r3
            r1 = r5
            r0.sdpMLineIndex = r1
            r0 = r3
            r1 = r6
            r0.sdp = r1
            r0 = r3
            java.lang.String r1 = ""
            r0.serverUrl = r1
            r0 = r3
            org.webrtc.PeerConnection$AdapterType r1 = org.webrtc.PeerConnection.AdapterType.UNKNOWN
            r0.adapterType = r1
            return
    }

    @org.webrtc.CalledByNative
    IceCandidate(java.lang.String r4, int r5, java.lang.String r6, java.lang.String r7, org.webrtc.PeerConnection.AdapterType r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.sdpMid = r1
            r0 = r3
            r1 = r5
            r0.sdpMLineIndex = r1
            r0 = r3
            r1 = r6
            r0.sdp = r1
            r0 = r3
            r1 = r7
            r0.serverUrl = r1
            r0 = r3
            r1 = r8
            r0.adapterType = r1
            return
    }

    public java.lang.String toString() {
            r6 = this;
            r0 = r6
            java.lang.String r0 = r0.sdpMid
            r1 = r6
            int r1 = r1.sdpMLineIndex
            r2 = r6
            java.lang.String r2 = r2.sdp
            r3 = r6
            java.lang.String r3 = r3.serverUrl
            r4 = r6
            org.webrtc.PeerConnection$AdapterType r4 = r4.adapterType
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = r0 + ":" + r1 + ":" + r2 + ":" + r3 + ":" + r4
            return r0
    }

    @org.webrtc.CalledByNative
    java.lang.String getSdpMid() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.sdpMid
            return r0
    }

    @org.webrtc.CalledByNative
    java.lang.String getSdp() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.sdp
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.IceCandidate
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            org.webrtc.IceCandidate r0 = (org.webrtc.IceCandidate) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.sdpMid
            r1 = r5
            java.lang.String r1 = r1.sdpMid
            boolean r0 = objectEquals(r0, r1)
            if (r0 == 0) goto L39
            r0 = r3
            int r0 = r0.sdpMLineIndex
            r1 = r5
            int r1 = r1.sdpMLineIndex
            if (r0 != r1) goto L39
            r0 = r3
            java.lang.String r0 = r0.sdp
            r1 = r5
            java.lang.String r1 = r1.sdp
            boolean r0 = objectEquals(r0, r1)
            if (r0 == 0) goto L39
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            return r0
    }

    public int hashCode() {
            r5 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r5
            java.lang.String r3 = r3.sdpMid
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r5
            int r3 = r3.sdpMLineIndex
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = r5
            java.lang.String r3 = r3.sdp
            r1[r2] = r3
            r6 = r0
            r0 = r6
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    private static boolean objectEquals(java.lang.Object r3, java.lang.Object r4) {
            r0 = r3
            if (r0 != 0) goto Le
            r0 = r4
            if (r0 != 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            r0 = r3
            r1 = r4
            boolean r0 = r0.equals(r1)
            return r0
    }
}
