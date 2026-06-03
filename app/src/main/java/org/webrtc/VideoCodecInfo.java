package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoCodecInfo.class */
public class VideoCodecInfo {
    public static final java.lang.String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final java.lang.String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final java.lang.String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final java.lang.String H264_PROFILE_CONSTRAINED_HIGH = "640c";
    public static final java.lang.String H264_LEVEL_3_1 = "1f";
    public static final java.lang.String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final java.lang.String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public final java.lang.String name;
    public final java.util.Map<java.lang.String, java.lang.String> params;

    @java.lang.Deprecated
    public final int payload;

    @org.webrtc.CalledByNative
    public VideoCodecInfo(java.lang.String r4, java.util.Map<java.lang.String, java.lang.String> r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 0
            r0.payload = r1
            r0 = r3
            r1 = r4
            r0.name = r1
            r0 = r3
            r1 = r5
            r0.params = r1
            return
    }

    @java.lang.Deprecated
    public VideoCodecInfo(int r4, java.lang.String r5, java.util.Map<java.lang.String, java.lang.String> r6) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.payload = r1
            r0 = r3
            r1 = r5
            r0.name = r1
            r0 = r3
            r1 = r6
            r0.params = r1
            return
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
            r3 = this;
            r0 = r4
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = r4
            r1 = r3
            if (r0 != r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.VideoCodecInfo
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            r0 = r4
            org.webrtc.VideoCodecInfo r0 = (org.webrtc.VideoCodecInfo) r0
            r5 = r0
            r0 = r3
            java.lang.String r0 = r0.name
            r1 = r5
            java.lang.String r1 = r1.name
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3d
            r0 = r3
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.params
            r1 = r5
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.params
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            return r0
    }

    public int hashCode() {
            r6 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = r0
            r2 = 0
            r3 = r6
            java.lang.String r3 = r3.name
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toUpperCase(r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r6
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.params
            r1[r2] = r3
            r7 = r0
            r0 = r7
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            java.lang.String r0 = r0.name
            r1 = r3
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.params
            java.lang.String r0 = "VideoCodec{" + r0 + " " + r1 + "}"
            return r0
    }

    @org.webrtc.CalledByNative
    java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    @org.webrtc.CalledByNative
    java.util.Map getParams() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.params
            return r0
    }
}
