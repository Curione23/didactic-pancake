package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/H264Utils.class */
class H264Utils {
    public static final java.lang.String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final java.lang.String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final java.lang.String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_HIGH = "640c";
    public static final java.lang.String H264_LEVEL_3_1 = "1f";
    public static final java.lang.String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final java.lang.String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static org.webrtc.VideoCodecInfo DEFAULT_H264_BASELINE_PROFILE_CODEC;
    public static org.webrtc.VideoCodecInfo DEFAULT_H264_HIGH_PROFILE_CODEC;

    H264Utils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.String, java.lang.String> getDefaultH264Params(boolean r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "level-asymmetry-allowed"
            java.lang.String r2 = "1"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.lang.String r1 = "packetization-mode"
            java.lang.String r2 = "1"
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.lang.String r1 = "profile-level-id"
            r2 = r4
            if (r2 == 0) goto L2a
            java.lang.String r2 = "640c1f"
            goto L2c
        L2a:
            java.lang.String r2 = "42e01f"
        L2c:
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            return r0
    }

    public static boolean isSameH264Profile(java.util.Map<java.lang.String, java.lang.String> r3, java.util.Map<java.lang.String, java.lang.String> r4) {
            r0 = r3
            r1 = r4
            boolean r0 = nativeIsSameH264Profile(r0, r1)
            return r0
    }

    private static native boolean nativeIsSameH264Profile(java.util.Map<java.lang.String, java.lang.String> r0, java.util.Map<java.lang.String, java.lang.String> r1);

    static {
            org.webrtc.VideoCodecInfo r0 = new org.webrtc.VideoCodecInfo
            r1 = r0
            java.lang.String r2 = "H264"
            r3 = 0
            java.util.Map r3 = getDefaultH264Params(r3)
            r1.<init>(r2, r3)
            org.webrtc.H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC = r0
            org.webrtc.VideoCodecInfo r0 = new org.webrtc.VideoCodecInfo
            r1 = r0
            java.lang.String r2 = "H264"
            r3 = 1
            java.util.Map r3 = getDefaultH264Params(r3)
            r1.<init>(r2, r3)
            org.webrtc.H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC = r0
            return
    }
}
