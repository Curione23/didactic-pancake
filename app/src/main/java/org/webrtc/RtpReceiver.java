package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpReceiver.class */
public class RtpReceiver {
    private long nativeRtpReceiver;
    private long nativeObserver;

    @androidx.annotation.Nullable
    private org.webrtc.MediaStreamTrack cachedTrack;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpReceiver$Observer.class */
    public interface Observer {
        @org.webrtc.CalledByNative("Observer")
        void onFirstPacketReceived(org.webrtc.MediaStreamTrack.MediaType r1);
    }

    @org.webrtc.CalledByNative
    public RtpReceiver(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.nativeRtpReceiver = r1
            r0 = r5
            long r0 = nativeGetTrack(r0)
            r7 = r0
            r0 = r4
            r1 = r7
            org.webrtc.MediaStreamTrack r1 = org.webrtc.MediaStreamTrack.createMediaStreamTrack(r1)
            r0.cachedTrack = r1
            return
    }

    @androidx.annotation.Nullable
    public org.webrtc.MediaStreamTrack track() {
            r2 = this;
            r0 = r2
            org.webrtc.MediaStreamTrack r0 = r0.cachedTrack
            return r0
    }

    public org.webrtc.RtpParameters getParameters() {
            r3 = this;
            r0 = r3
            r0.checkRtpReceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpReceiver
            org.webrtc.RtpParameters r0 = nativeGetParameters(r0)
            return r0
    }

    public java.lang.String id() {
            r3 = this;
            r0 = r3
            r0.checkRtpReceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpReceiver
            java.lang.String r0 = nativeGetId(r0)
            return r0
    }

    long getNativeRtpReceiver() {
            r3 = this;
            r0 = r3
            r0.checkRtpReceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpReceiver
            return r0
    }

    @org.webrtc.CalledByNative
    public void dispose() {
            r5 = this;
            r0 = r5
            r0.checkRtpReceiverExists()
            r0 = r5
            org.webrtc.MediaStreamTrack r0 = r0.cachedTrack
            r0.dispose()
            r0 = r5
            long r0 = r0.nativeObserver
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L24
            r0 = r5
            long r0 = r0.nativeRtpReceiver
            r1 = r5
            long r1 = r1.nativeObserver
            nativeUnsetObserver(r0, r1)
            r0 = r5
            r1 = 0
            r0.nativeObserver = r1
        L24:
            r0 = r5
            long r0 = r0.nativeRtpReceiver
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            r0 = r5
            r1 = 0
            r0.nativeRtpReceiver = r1
            return
    }

    public void SetObserver(org.webrtc.RtpReceiver.Observer r6) {
            r5 = this;
            r0 = r5
            r0.checkRtpReceiverExists()
            r0 = r5
            long r0 = r0.nativeObserver
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = r0.nativeRtpReceiver
            r1 = r5
            long r1 = r1.nativeObserver
            nativeUnsetObserver(r0, r1)
        L18:
            r0 = r5
            r1 = r5
            long r1 = r1.nativeRtpReceiver
            r2 = r6
            long r1 = nativeSetObserver(r1, r2)
            r0.nativeObserver = r1
            return
    }

    public void setFrameDecryptor(org.webrtc.FrameDecryptor r6) {
            r5 = this;
            r0 = r5
            r0.checkRtpReceiverExists()
            r0 = r5
            long r0 = r0.nativeRtpReceiver
            r1 = r6
            long r1 = r1.getNativeFrameDecryptor()
            nativeSetFrameDecryptor(r0, r1)
            return
    }

    private void checkRtpReceiverExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeRtpReceiver
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "RtpReceiver has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static native long nativeGetTrack(long r0);

    private static native org.webrtc.RtpParameters nativeGetParameters(long r0);

    private static native java.lang.String nativeGetId(long r0);

    private static native long nativeSetObserver(long r0, org.webrtc.RtpReceiver.Observer r2);

    private static native void nativeUnsetObserver(long r0, long r2);

    private static native void nativeSetFrameDecryptor(long r0, long r2);
}
