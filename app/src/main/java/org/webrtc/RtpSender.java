package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpSender.class */
public class RtpSender {
    private long nativeRtpSender;

    @androidx.annotation.Nullable
    private org.webrtc.MediaStreamTrack cachedTrack;
    private boolean ownsTrack;

    @androidx.annotation.Nullable
    private final org.webrtc.DtmfSender dtmfSender;

    @org.webrtc.CalledByNative
    public RtpSender(long r7) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            r1 = 1
            r0.ownsTrack = r1
            r0 = r6
            r1 = r7
            r0.nativeRtpSender = r1
            r0 = r7
            long r0 = nativeGetTrack(r0)
            r9 = r0
            r0 = r6
            r1 = r9
            org.webrtc.MediaStreamTrack r1 = org.webrtc.MediaStreamTrack.createMediaStreamTrack(r1)
            r0.cachedTrack = r1
            r0 = r7
            java.lang.String r0 = nativeGetMediaType(r0)
            java.lang.String r1 = "audio"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L48
            r0 = r7
            long r0 = nativeGetDtmfSender(r0)
            r11 = r0
            r0 = r6
            r1 = r11
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L41
            org.webrtc.DtmfSender r1 = new org.webrtc.DtmfSender
            r2 = r1
            r3 = r11
            r2.<init>(r3)
            goto L42
        L41:
            r1 = 0
        L42:
            r0.dtmfSender = r1
            goto L4d
        L48:
            r0 = r6
            r1 = 0
            r0.dtmfSender = r1
        L4d:
            return
    }

    public boolean setTrack(@androidx.annotation.Nullable org.webrtc.MediaStreamTrack r6, boolean r7) {
            r5 = this;
            r0 = r5
            r0.checkRtpSenderExists()
            r0 = r5
            long r0 = r0.nativeRtpSender
            r1 = r6
            if (r1 != 0) goto L10
            r1 = 0
            goto L14
        L10:
            r1 = r6
            long r1 = r1.getNativeMediaStreamTrack()
        L14:
            boolean r0 = nativeSetTrack(r0, r1)
            if (r0 != 0) goto L1c
            r0 = 0
            return r0
        L1c:
            r0 = r5
            org.webrtc.MediaStreamTrack r0 = r0.cachedTrack
            if (r0 == 0) goto L31
            r0 = r5
            boolean r0 = r0.ownsTrack
            if (r0 == 0) goto L31
            r0 = r5
            org.webrtc.MediaStreamTrack r0 = r0.cachedTrack
            r0.dispose()
        L31:
            r0 = r5
            r1 = r6
            r0.cachedTrack = r1
            r0 = r5
            r1 = r7
            r0.ownsTrack = r1
            r0 = 1
            return r0
    }

    @androidx.annotation.Nullable
    public org.webrtc.MediaStreamTrack track() {
            r2 = this;
            r0 = r2
            org.webrtc.MediaStreamTrack r0 = r0.cachedTrack
            return r0
    }

    public void setStreams(java.util.List<java.lang.String> r5) {
            r4 = this;
            r0 = r4
            r0.checkRtpSenderExists()
            r0 = r4
            long r0 = r0.nativeRtpSender
            r1 = r5
            nativeSetStreams(r0, r1)
            return
    }

    public java.util.List<java.lang.String> getStreams() {
            r3 = this;
            r0 = r3
            r0.checkRtpSenderExists()
            r0 = r3
            long r0 = r0.nativeRtpSender
            java.util.List r0 = nativeGetStreams(r0)
            return r0
    }

    public boolean setParameters(org.webrtc.RtpParameters r5) {
            r4 = this;
            r0 = r4
            r0.checkRtpSenderExists()
            r0 = r4
            long r0 = r0.nativeRtpSender
            r1 = r5
            boolean r0 = nativeSetParameters(r0, r1)
            return r0
    }

    public org.webrtc.RtpParameters getParameters() {
            r3 = this;
            r0 = r3
            r0.checkRtpSenderExists()
            r0 = r3
            long r0 = r0.nativeRtpSender
            org.webrtc.RtpParameters r0 = nativeGetParameters(r0)
            return r0
    }

    public java.lang.String id() {
            r3 = this;
            r0 = r3
            r0.checkRtpSenderExists()
            r0 = r3
            long r0 = r0.nativeRtpSender
            java.lang.String r0 = nativeGetId(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public org.webrtc.DtmfSender dtmf() {
            r2 = this;
            r0 = r2
            org.webrtc.DtmfSender r0 = r0.dtmfSender
            return r0
    }

    public void setFrameEncryptor(org.webrtc.FrameEncryptor r6) {
            r5 = this;
            r0 = r5
            r0.checkRtpSenderExists()
            r0 = r5
            long r0 = r0.nativeRtpSender
            r1 = r6
            long r1 = r1.getNativeFrameEncryptor()
            nativeSetFrameEncryptor(r0, r1)
            return
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkRtpSenderExists()
            r0 = r4
            org.webrtc.DtmfSender r0 = r0.dtmfSender
            if (r0 == 0) goto L12
            r0 = r4
            org.webrtc.DtmfSender r0 = r0.dtmfSender
            r0.dispose()
        L12:
            r0 = r4
            org.webrtc.MediaStreamTrack r0 = r0.cachedTrack
            if (r0 == 0) goto L27
            r0 = r4
            boolean r0 = r0.ownsTrack
            if (r0 == 0) goto L27
            r0 = r4
            org.webrtc.MediaStreamTrack r0 = r0.cachedTrack
            r0.dispose()
        L27:
            r0 = r4
            long r0 = r0.nativeRtpSender
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            r0 = r4
            r1 = 0
            r0.nativeRtpSender = r1
            return
    }

    long getNativeRtpSender() {
            r3 = this;
            r0 = r3
            r0.checkRtpSenderExists()
            r0 = r3
            long r0 = r0.nativeRtpSender
            return r0
    }

    private void checkRtpSenderExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeRtpSender
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "RtpSender has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static native boolean nativeSetTrack(long r0, long r2);

    private static native long nativeGetTrack(long r0);

    private static native void nativeSetStreams(long r0, java.util.List<java.lang.String> r2);

    private static native java.util.List<java.lang.String> nativeGetStreams(long r0);

    private static native long nativeGetDtmfSender(long r0);

    private static native boolean nativeSetParameters(long r0, org.webrtc.RtpParameters r2);

    private static native org.webrtc.RtpParameters nativeGetParameters(long r0);

    private static native java.lang.String nativeGetId(long r0);

    private static native void nativeSetFrameEncryptor(long r0, long r2);

    private static native java.lang.String nativeGetMediaType(long r0);
}
