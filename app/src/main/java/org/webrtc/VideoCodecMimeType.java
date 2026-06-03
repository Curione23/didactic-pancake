package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoCodecMimeType.class */
enum VideoCodecMimeType extends java.lang.Enum<org.webrtc.VideoCodecMimeType> {
    public static final org.webrtc.VideoCodecMimeType VP8 = null;
    public static final org.webrtc.VideoCodecMimeType VP9 = null;
    public static final org.webrtc.VideoCodecMimeType H264 = null;
    public static final org.webrtc.VideoCodecMimeType AV1 = null;
    public static final org.webrtc.VideoCodecMimeType H265 = null;
    private final java.lang.String mimeType;
    private static final /* synthetic */ org.webrtc.VideoCodecMimeType[] $VALUES = null;

    public static org.webrtc.VideoCodecMimeType[] values() {
            org.webrtc.VideoCodecMimeType[] r0 = org.webrtc.VideoCodecMimeType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.webrtc.VideoCodecMimeType[] r0 = (org.webrtc.VideoCodecMimeType[]) r0
            return r0
    }

    public static org.webrtc.VideoCodecMimeType valueOf(java.lang.String r3) {
            java.lang.Class<org.webrtc.VideoCodecMimeType> r0 = org.webrtc.VideoCodecMimeType.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.webrtc.VideoCodecMimeType r0 = (org.webrtc.VideoCodecMimeType) r0
            return r0
    }

    VideoCodecMimeType(java.lang.String r5, int r6, java.lang.String r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.mimeType = r1
            return
    }

    java.lang.String mimeType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.mimeType
            return r0
    }

    private static /* synthetic */ org.webrtc.VideoCodecMimeType[] $values() {
            r0 = 5
            org.webrtc.VideoCodecMimeType[] r0 = new org.webrtc.VideoCodecMimeType[r0]
            r1 = r0
            r2 = 0
            org.webrtc.VideoCodecMimeType r3 = org.webrtc.VideoCodecMimeType.VP8
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.webrtc.VideoCodecMimeType r3 = org.webrtc.VideoCodecMimeType.VP9
            r1[r2] = r3
            r1 = r0
            r2 = 2
            org.webrtc.VideoCodecMimeType r3 = org.webrtc.VideoCodecMimeType.H264
            r1[r2] = r3
            r1 = r0
            r2 = 3
            org.webrtc.VideoCodecMimeType r3 = org.webrtc.VideoCodecMimeType.AV1
            r1[r2] = r3
            r1 = r0
            r2 = 4
            org.webrtc.VideoCodecMimeType r3 = org.webrtc.VideoCodecMimeType.H265
            r1[r2] = r3
            return r0
    }

    static {
            org.webrtc.VideoCodecMimeType r0 = new org.webrtc.VideoCodecMimeType
            r1 = r0
            java.lang.String r2 = "VP8"
            r3 = 0
            java.lang.String r4 = "video/x-vnd.on2.vp8"
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecMimeType.VP8 = r0
            org.webrtc.VideoCodecMimeType r0 = new org.webrtc.VideoCodecMimeType
            r1 = r0
            java.lang.String r2 = "VP9"
            r3 = 1
            java.lang.String r4 = "video/x-vnd.on2.vp9"
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecMimeType.VP9 = r0
            org.webrtc.VideoCodecMimeType r0 = new org.webrtc.VideoCodecMimeType
            r1 = r0
            java.lang.String r2 = "H264"
            r3 = 2
            java.lang.String r4 = "video/avc"
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecMimeType.H264 = r0
            org.webrtc.VideoCodecMimeType r0 = new org.webrtc.VideoCodecMimeType
            r1 = r0
            java.lang.String r2 = "AV1"
            r3 = 3
            java.lang.String r4 = "video/av01"
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecMimeType.AV1 = r0
            org.webrtc.VideoCodecMimeType r0 = new org.webrtc.VideoCodecMimeType
            r1 = r0
            java.lang.String r2 = "H265"
            r3 = 4
            java.lang.String r4 = "video/hevc"
            r1.<init>(r2, r3, r4)
            org.webrtc.VideoCodecMimeType.H265 = r0
            org.webrtc.VideoCodecMimeType[] r0 = $values()
            org.webrtc.VideoCodecMimeType.$VALUES = r0
            return
    }
}
