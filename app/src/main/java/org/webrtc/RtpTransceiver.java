package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpTransceiver.class */
public class RtpTransceiver {
    private long nativeRtpTransceiver;
    private org.webrtc.RtpSender cachedSender;
    private org.webrtc.RtpReceiver cachedReceiver;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpTransceiver$RtpTransceiverDirection.class */
    public enum RtpTransceiverDirection extends java.lang.Enum<org.webrtc.RtpTransceiver.RtpTransceiverDirection> {
        public static final org.webrtc.RtpTransceiver.RtpTransceiverDirection SEND_RECV = null;
        public static final org.webrtc.RtpTransceiver.RtpTransceiverDirection SEND_ONLY = null;
        public static final org.webrtc.RtpTransceiver.RtpTransceiverDirection RECV_ONLY = null;
        public static final org.webrtc.RtpTransceiver.RtpTransceiverDirection INACTIVE = null;
        public static final org.webrtc.RtpTransceiver.RtpTransceiverDirection STOPPED = null;
        private final int nativeIndex;
        private static final /* synthetic */ org.webrtc.RtpTransceiver.RtpTransceiverDirection[] $VALUES = null;

        public static org.webrtc.RtpTransceiver.RtpTransceiverDirection[] values() {
                org.webrtc.RtpTransceiver$RtpTransceiverDirection[] r0 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.$VALUES
                java.lang.Object r0 = r0.clone()
                org.webrtc.RtpTransceiver$RtpTransceiverDirection[] r0 = (org.webrtc.RtpTransceiver.RtpTransceiverDirection[]) r0
                return r0
        }

        public static org.webrtc.RtpTransceiver.RtpTransceiverDirection valueOf(java.lang.String r3) {
                java.lang.Class<org.webrtc.RtpTransceiver$RtpTransceiverDirection> r0 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = (org.webrtc.RtpTransceiver.RtpTransceiverDirection) r0
                return r0
        }

        RtpTransceiverDirection(java.lang.String r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.nativeIndex = r1
                return
        }

        @org.webrtc.CalledByNative("RtpTransceiverDirection")
        int getNativeIndex() {
                r2 = this;
                r0 = r2
                int r0 = r0.nativeIndex
                return r0
        }

        @org.webrtc.CalledByNative("RtpTransceiverDirection")
        static org.webrtc.RtpTransceiver.RtpTransceiverDirection fromNativeIndex(int r4) {
                org.webrtc.RtpTransceiver$RtpTransceiverDirection[] r0 = values()
                r5 = r0
                r0 = r5
                int r0 = r0.length
                r6 = r0
                r0 = 0
                r7 = r0
            L9:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L25
                r0 = r5
                r1 = r7
                r0 = r0[r1]
                r8 = r0
                r0 = r8
                int r0 = r0.getNativeIndex()
                r1 = r4
                if (r0 != r1) goto L1f
                r0 = r8
                return r0
            L1f:
                int r7 = r7 + 1
                goto L9
            L25:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                r2 = r4
                java.lang.String r2 = "Uknown native RtpTransceiverDirection type" + r2
                r1.<init>(r2)
                throw r0
        }

        private static /* synthetic */ org.webrtc.RtpTransceiver.RtpTransceiverDirection[] $values() {
                r0 = 5
                org.webrtc.RtpTransceiver$RtpTransceiverDirection[] r0 = new org.webrtc.RtpTransceiver.RtpTransceiverDirection[r0]
                r1 = r0
                r2 = 0
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r3 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.SEND_RECV
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r3 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.SEND_ONLY
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r3 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.RECV_ONLY
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r3 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.INACTIVE
                r1[r2] = r3
                r1 = r0
                r2 = 4
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r3 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.STOPPED
                r1[r2] = r3
                return r0
        }

        static {
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = new org.webrtc.RtpTransceiver$RtpTransceiverDirection
                r1 = r0
                java.lang.String r2 = "SEND_RECV"
                r3 = 0
                r4 = 0
                r1.<init>(r2, r3, r4)
                org.webrtc.RtpTransceiver.RtpTransceiverDirection.SEND_RECV = r0
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = new org.webrtc.RtpTransceiver$RtpTransceiverDirection
                r1 = r0
                java.lang.String r2 = "SEND_ONLY"
                r3 = 1
                r4 = 1
                r1.<init>(r2, r3, r4)
                org.webrtc.RtpTransceiver.RtpTransceiverDirection.SEND_ONLY = r0
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = new org.webrtc.RtpTransceiver$RtpTransceiverDirection
                r1 = r0
                java.lang.String r2 = "RECV_ONLY"
                r3 = 2
                r4 = 2
                r1.<init>(r2, r3, r4)
                org.webrtc.RtpTransceiver.RtpTransceiverDirection.RECV_ONLY = r0
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = new org.webrtc.RtpTransceiver$RtpTransceiverDirection
                r1 = r0
                java.lang.String r2 = "INACTIVE"
                r3 = 3
                r4 = 3
                r1.<init>(r2, r3, r4)
                org.webrtc.RtpTransceiver.RtpTransceiverDirection.INACTIVE = r0
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = new org.webrtc.RtpTransceiver$RtpTransceiverDirection
                r1 = r0
                java.lang.String r2 = "STOPPED"
                r3 = 4
                r4 = 4
                r1.<init>(r2, r3, r4)
                org.webrtc.RtpTransceiver.RtpTransceiverDirection.STOPPED = r0
                org.webrtc.RtpTransceiver$RtpTransceiverDirection[] r0 = $values()
                org.webrtc.RtpTransceiver.RtpTransceiverDirection.$VALUES = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RtpTransceiver$RtpTransceiverInit.class */
    public static final class RtpTransceiverInit {
        private final org.webrtc.RtpTransceiver.RtpTransceiverDirection direction;
        private final java.util.List<java.lang.String> streamIds;
        private final java.util.List<org.webrtc.RtpParameters.Encoding> sendEncodings;

        public RtpTransceiverInit() {
                r3 = this;
                r0 = r3
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r1 = org.webrtc.RtpTransceiver.RtpTransceiverDirection.SEND_RECV
                r0.<init>(r1)
                return
        }

        public RtpTransceiverInit(org.webrtc.RtpTransceiver.RtpTransceiverDirection r6) {
                r5 = this;
                r0 = r5
                r1 = r6
                java.util.List r2 = java.util.Collections.emptyList()
                java.util.List r3 = java.util.Collections.emptyList()
                r0.<init>(r1, r2, r3)
                return
        }

        public RtpTransceiverInit(org.webrtc.RtpTransceiver.RtpTransceiverDirection r6, java.util.List<java.lang.String> r7) {
                r5 = this;
                r0 = r5
                r1 = r6
                r2 = r7
                java.util.List r3 = java.util.Collections.emptyList()
                r0.<init>(r1, r2, r3)
                return
        }

        public RtpTransceiverInit(org.webrtc.RtpTransceiver.RtpTransceiverDirection r6, java.util.List<java.lang.String> r7, java.util.List<org.webrtc.RtpParameters.Encoding> r8) {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                r1 = r6
                r0.direction = r1
                r0 = r5
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r3 = r7
                r2.<init>(r3)
                r0.streamIds = r1
                r0 = r5
                java.util.ArrayList r1 = new java.util.ArrayList
                r2 = r1
                r3 = r8
                r2.<init>(r3)
                r0.sendEncodings = r1
                return
        }

        @org.webrtc.CalledByNative("RtpTransceiverInit")
        int getDirectionNativeIndex() {
                r2 = this;
                r0 = r2
                org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = r0.direction
                int r0 = r0.getNativeIndex()
                return r0
        }

        @org.webrtc.CalledByNative("RtpTransceiverInit")
        java.util.List<java.lang.String> getStreamIds() {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r2 = r4
                java.util.List<java.lang.String> r2 = r2.streamIds
                r1.<init>(r2)
                return r0
        }

        @org.webrtc.CalledByNative("RtpTransceiverInit")
        java.util.List<org.webrtc.RtpParameters.Encoding> getSendEncodings() {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r2 = r4
                java.util.List<org.webrtc.RtpParameters$Encoding> r2 = r2.sendEncodings
                r1.<init>(r2)
                return r0
        }
    }

    @org.webrtc.CalledByNative
    protected RtpTransceiver(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.nativeRtpTransceiver = r1
            r0 = r4
            r1 = r5
            org.webrtc.RtpSender r1 = nativeGetSender(r1)
            r0.cachedSender = r1
            r0 = r4
            r1 = r5
            org.webrtc.RtpReceiver r1 = nativeGetReceiver(r1)
            r0.cachedReceiver = r1
            return
    }

    public org.webrtc.MediaStreamTrack.MediaType getMediaType() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            org.webrtc.MediaStreamTrack$MediaType r0 = nativeGetMediaType(r0)
            return r0
    }

    public java.lang.String getMid() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            java.lang.String r0 = nativeGetMid(r0)
            return r0
    }

    public org.webrtc.RtpSender getSender() {
            r2 = this;
            r0 = r2
            org.webrtc.RtpSender r0 = r0.cachedSender
            return r0
    }

    public org.webrtc.RtpReceiver getReceiver() {
            r2 = this;
            r0 = r2
            org.webrtc.RtpReceiver r0 = r0.cachedReceiver
            return r0
    }

    public boolean isStopped() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            boolean r0 = nativeStopped(r0)
            return r0
    }

    public org.webrtc.RtpTransceiver.RtpTransceiverDirection getDirection() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = nativeDirection(r0)
            return r0
    }

    public org.webrtc.RtpTransceiver.RtpTransceiverDirection getCurrentDirection() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            org.webrtc.RtpTransceiver$RtpTransceiverDirection r0 = nativeCurrentDirection(r0)
            return r0
    }

    public boolean setDirection(org.webrtc.RtpTransceiver.RtpTransceiverDirection r5) {
            r4 = this;
            r0 = r4
            r0.checkRtpTransceiverExists()
            r0 = r4
            long r0 = r0.nativeRtpTransceiver
            r1 = r5
            boolean r0 = nativeSetDirection(r0, r1)
            return r0
    }

    public void stop() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            nativeStopInternal(r0)
            return
    }

    public void setCodecPreferences(java.util.List<org.webrtc.RtpCapabilities.CodecCapability> r5) {
            r4 = this;
            r0 = r4
            r0.checkRtpTransceiverExists()
            r0 = r4
            long r0 = r0.nativeRtpTransceiver
            r1 = r5
            nativeSetCodecPreferences(r0, r1)
            return
    }

    public void stopInternal() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            nativeStopInternal(r0)
            return
    }

    public void stopStandard() {
            r3 = this;
            r0 = r3
            r0.checkRtpTransceiverExists()
            r0 = r3
            long r0 = r0.nativeRtpTransceiver
            nativeStopStandard(r0)
            return
    }

    @org.webrtc.CalledByNative
    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkRtpTransceiverExists()
            r0 = r4
            org.webrtc.RtpSender r0 = r0.cachedSender
            r0.dispose()
            r0 = r4
            org.webrtc.RtpReceiver r0 = r0.cachedReceiver
            r0.dispose()
            r0 = r4
            long r0 = r0.nativeRtpTransceiver
            org.webrtc.JniCommon.nativeReleaseRef(r0)
            r0 = r4
            r1 = 0
            r0.nativeRtpTransceiver = r1
            return
    }

    private void checkRtpTransceiverExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeRtpTransceiver
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "RtpTransceiver has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static native org.webrtc.MediaStreamTrack.MediaType nativeGetMediaType(long r0);

    private static native java.lang.String nativeGetMid(long r0);

    private static native org.webrtc.RtpSender nativeGetSender(long r0);

    private static native org.webrtc.RtpReceiver nativeGetReceiver(long r0);

    private static native boolean nativeStopped(long r0);

    private static native org.webrtc.RtpTransceiver.RtpTransceiverDirection nativeDirection(long r0);

    private static native org.webrtc.RtpTransceiver.RtpTransceiverDirection nativeCurrentDirection(long r0);

    private static native void nativeStopInternal(long r0);

    private static native void nativeStopStandard(long r0);

    private static native boolean nativeSetDirection(long r0, org.webrtc.RtpTransceiver.RtpTransceiverDirection r2);

    private static native void nativeSetCodecPreferences(long r0, java.util.List<org.webrtc.RtpCapabilities.CodecCapability> r2);
}
