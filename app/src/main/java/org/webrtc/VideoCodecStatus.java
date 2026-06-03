package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoCodecStatus.class */
public enum VideoCodecStatus extends java.lang.Enum<org.webrtc.VideoCodecStatus> {
    public static final org.webrtc.VideoCodecStatus TARGET_BITRATE_OVERSHOOT = null;
    public static final org.webrtc.VideoCodecStatus REQUEST_SLI = null;
    public static final org.webrtc.VideoCodecStatus NO_OUTPUT = null;
    public static final org.webrtc.VideoCodecStatus OK = null;
    public static final org.webrtc.VideoCodecStatus ERROR = null;
    public static final org.webrtc.VideoCodecStatus LEVEL_EXCEEDED = null;
    public static final org.webrtc.VideoCodecStatus MEMORY = null;
    public static final org.webrtc.VideoCodecStatus ERR_PARAMETER = null;
    public static final org.webrtc.VideoCodecStatus ERR_SIZE = null;
    public static final org.webrtc.VideoCodecStatus TIMEOUT = null;
    public static final org.webrtc.VideoCodecStatus UNINITIALIZED = null;
    public static final org.webrtc.VideoCodecStatus ERR_REQUEST_SLI = null;
    public static final org.webrtc.VideoCodecStatus FALLBACK_SOFTWARE = null;
    private final int number;
    private static final /* synthetic */ org.webrtc.VideoCodecStatus[] $VALUES = null;

    public static org.webrtc.VideoCodecStatus[] values() {
            org.webrtc.VideoCodecStatus[] r0 = org.webrtc.VideoCodecStatus.$VALUES
            java.lang.Object r0 = r0.clone()
            org.webrtc.VideoCodecStatus[] r0 = (org.webrtc.VideoCodecStatus[]) r0
            return r0
    }

    public static org.webrtc.VideoCodecStatus valueOf(java.lang.String r3) {
            java.lang.Class<org.webrtc.VideoCodecStatus> r0 = org.webrtc.VideoCodecStatus.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.webrtc.VideoCodecStatus r0 = (org.webrtc.VideoCodecStatus) r0
            return r0
    }

    VideoCodecStatus(java.lang.String r5, int r6, int r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.number = r1
            return
    }

    @org.webrtc.CalledByNative
    public int getNumber() {
            r2 = this;
            r0 = r2
            int r0 = r0.number
            return r0
    }

    private static /* synthetic */ org.webrtc.VideoCodecStatus[] $values() {
            r0 = 13
            org.webrtc.VideoCodecStatus[] r0 = new org.webrtc.VideoCodecStatus[r0]
            r1 = r0
            r2 = 0
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.TARGET_BITRATE_OVERSHOOT
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.REQUEST_SLI
            r1[r2] = r3
            r1 = r0
            r2 = 2
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.NO_OUTPUT
            r1[r2] = r3
            r1 = r0
            r2 = 3
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.OK
            r1[r2] = r3
            r1 = r0
            r2 = 4
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.ERROR
            r1[r2] = r3
            r1 = r0
            r2 = 5
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.LEVEL_EXCEEDED
            r1[r2] = r3
            r1 = r0
            r2 = 6
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.MEMORY
            r1[r2] = r3
            r1 = r0
            r2 = 7
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.ERR_PARAMETER
            r1[r2] = r3
            r1 = r0
            r2 = 8
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.ERR_SIZE
            r1[r2] = r3
            r1 = r0
            r2 = 9
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.TIMEOUT
            r1[r2] = r3
            r1 = r0
            r2 = 10
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.UNINITIALIZED
            r1[r2] = r3
            r1 = r0
            r2 = 11
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.ERR_REQUEST_SLI
            r1[r2] = r3
            r1 = r0
            r2 = 12
            org.webrtc.VideoCodecStatus r3 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            r1[r2] = r3
            return r0
    }

    static {
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "TARGET_BITRATE_OVERSHOOT"
            r3 = 0
            r4 = 5
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.TARGET_BITRATE_OVERSHOOT = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "REQUEST_SLI"
            r3 = 1
            r4 = 2
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.REQUEST_SLI = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "NO_OUTPUT"
            r3 = 2
            r4 = 1
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.NO_OUTPUT = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "OK"
            r3 = 3
            r4 = 0
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.OK = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "ERROR"
            r3 = 4
            r4 = -1
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.ERROR = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "LEVEL_EXCEEDED"
            r3 = 5
            r4 = -2
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.LEVEL_EXCEEDED = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "MEMORY"
            r3 = 6
            r4 = -3
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.MEMORY = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "ERR_PARAMETER"
            r3 = 7
            r4 = -4
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.ERR_PARAMETER = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "ERR_SIZE"
            r3 = 8
            r4 = -5
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.ERR_SIZE = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "TIMEOUT"
            r3 = 9
            r4 = -6
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.TIMEOUT = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "UNINITIALIZED"
            r3 = 10
            r4 = -7
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.UNINITIALIZED = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "ERR_REQUEST_SLI"
            r3 = 11
            r4 = -12
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.ERR_REQUEST_SLI = r0
            org.webrtc.VideoCodecStatus r0 = new org.webrtc.VideoCodecStatus
            r1 = r0
            java.lang.String r2 = "FALLBACK_SOFTWARE"
            r3 = 12
            r4 = -13
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE = r0
            org.webrtc.VideoCodecStatus[] r0 = $values()
            org.webrtc.VideoCodecStatus.$VALUES = r0
            return
    }
}
