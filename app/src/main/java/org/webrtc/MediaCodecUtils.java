package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaCodecUtils.class */
class MediaCodecUtils {
    private static final java.lang.String TAG = "MediaCodecUtils";
    static final java.lang.String EXYNOS_PREFIX = "OMX.Exynos.";
    static final java.lang.String INTEL_PREFIX = "OMX.Intel.";
    static final java.lang.String NVIDIA_PREFIX = "OMX.Nvidia.";
    static final java.lang.String QCOM_PREFIX = "OMX.qcom.";
    static final java.lang.String[] SOFTWARE_IMPLEMENTATION_PREFIXES = null;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar32m4ka = 2141391873;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar16m4ka = 2141391874;
    static final int COLOR_QCOM_FORMATYVU420PackedSemiPlanar64x32Tile2m8ka = 2141391875;
    static final int COLOR_QCOM_FORMATYUV420PackedSemiPlanar32m = 2141391876;
    static final int[] DECODER_COLOR_FORMATS = null;
    static final int[] ENCODER_COLOR_FORMATS = null;
    static final int[] TEXTURE_COLOR_FORMATS = null;

    /* JADX INFO: renamed from: org.webrtc.MediaCodecUtils$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaCodecUtils$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType = null;

        static {
                org.webrtc.VideoCodecMimeType[] r0 = org.webrtc.VideoCodecMimeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType = r0
                int[] r0 = org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L17
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP8     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L26
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP9     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L35
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.AV1     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                int[] r0 = org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L44
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H265     // Catch: java.lang.NoSuchFieldError -> L44
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r4 = move-exception
            L45:
                int[] r0 = org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L53
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264     // Catch: java.lang.NoSuchFieldError -> L53
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L53
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L53
                goto L54
            L53:
                r4 = move-exception
            L54:
                return
        }
    }

    @androidx.annotation.Nullable
    static java.lang.Integer selectColorFormat(int[] r3, android.media.MediaCodecInfo.CodecCapabilities r4) {
            r0 = r3
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L8:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L49
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            int[] r0 = r0.colorFormats
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L22:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L43
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            r1 = r8
            if (r0 != r1) goto L3d
            r0 = r12
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L3d:
            int r11 = r11 + 1
            goto L22
        L43:
            int r7 = r7 + 1
            goto L8
        L49:
            r0 = 0
            return r0
    }

    static boolean codecSupportsType(android.media.MediaCodecInfo r3, org.webrtc.VideoCodecMimeType r4) {
            r0 = r3
            java.lang.String[] r0 = r0.getSupportedTypes()
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        Lb:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L2b
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            java.lang.String r0 = r0.mimeType()
            r1 = r8
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            r0 = 1
            return r0
        L25:
            int r7 = r7 + 1
            goto Lb
        L2b:
            r0 = 0
            return r0
    }

    static java.util.Map<java.lang.String, java.lang.String> getCodecProperties(org.webrtc.VideoCodecMimeType r4, boolean r5) {
            int[] r0 = org.webrtc.MediaCodecUtils.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType
            r1 = r4
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L2c;
                case 2: goto L2c;
                case 3: goto L2c;
                case 4: goto L2c;
                case 5: goto L34;
                default: goto L39;
            }
        L2c:
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            return r0
        L34:
            r0 = r5
            java.util.Map r0 = org.webrtc.H264Utils.getDefaultH264Params(r0)
            return r0
        L39:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            r2 = r4
            java.lang.String r2 = "Unsupported codec: " + r2
            r1.<init>(r2)
            throw r0
    }

    static boolean isHardwareAccelerated(android.media.MediaCodecInfo r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            r0 = r3
            boolean r0 = isHardwareAcceleratedQOrHigher(r0)
            return r0
        Ld:
            r0 = r3
            boolean r0 = isSoftwareOnly(r0)
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @android.annotation.TargetApi(29)
    private static boolean isHardwareAcceleratedQOrHigher(android.media.MediaCodecInfo r2) {
            r0 = r2
            boolean r0 = r0.isHardwareAccelerated()
            return r0
    }

    static boolean isSoftwareOnly(android.media.MediaCodecInfo r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            r0 = r3
            boolean r0 = isSoftwareOnlyQOrHigher(r0)
            return r0
        Ld:
            r0 = r3
            java.lang.String r0 = r0.getName()
            r4 = r0
            java.lang.String[] r0 = org.webrtc.MediaCodecUtils.SOFTWARE_IMPLEMENTATION_PREFIXES
            r5 = r0
            r0 = r5
            int r0 = r0.length
            r6 = r0
            r0 = 0
            r7 = r0
        L1c:
            r0 = r7
            r1 = r6
            if (r0 >= r1) goto L39
            r0 = r5
            r1 = r7
            r0 = r0[r1]
            r8 = r0
            r0 = r4
            r1 = r8
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L33
            r0 = 1
            return r0
        L33:
            int r7 = r7 + 1
            goto L1c
        L39:
            r0 = 0
            return r0
    }

    @android.annotation.TargetApi(29)
    private static boolean isSoftwareOnlyQOrHigher(android.media.MediaCodecInfo r2) {
            r0 = r2
            boolean r0 = r0.isSoftwareOnly()
            return r0
    }

    private MediaCodecUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "OMX.google."
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "OMX.SEC."
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "c2.android"
            r1[r2] = r3
            org.webrtc.MediaCodecUtils.SOFTWARE_IMPLEMENTATION_PREFIXES = r0
            r0 = 7
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 19
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 21
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2141391872(0x7fa30c00, float:NaN)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2141391873(0x7fa30c01, float:NaN)
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 2141391874(0x7fa30c02, float:NaN)
            r1[r2] = r3
            r1 = r0
            r2 = 5
            r3 = 2141391875(0x7fa30c03, float:NaN)
            r1[r2] = r3
            r1 = r0
            r2 = 6
            r3 = 2141391876(0x7fa30c04, float:NaN)
            r1[r2] = r3
            org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS = r0
            r0 = 4
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 19
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 21
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 2141391872(0x7fa30c00, float:NaN)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 2141391876(0x7fa30c04, float:NaN)
            r1[r2] = r3
            org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 2130708361(0x7f000789, float:1.701803E38)
            r1[r2] = r3
            org.webrtc.MediaCodecUtils.TEXTURE_COLOR_FORMATS = r0
            return
    }
}
