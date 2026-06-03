package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/HardwareVideoEncoderFactory.class */
public class HardwareVideoEncoderFactory implements org.webrtc.VideoEncoderFactory {
    private static final java.lang.String TAG = "HardwareVideoEncoderFactory";
    private static final int PERIODIC_KEY_FRAME_INTERVAL_S = 3600;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_L_MS = 15000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_M_MS = 20000;
    private static final int QCOM_VP8_KEY_FRAME_INTERVAL_ANDROID_N_MS = 15000;
    private static final java.util.List<java.lang.String> H264_HW_EXCEPTION_MODELS = null;

    @androidx.annotation.Nullable
    private final org.webrtc.EglBase14.Context sharedContext;
    private final boolean enableIntelVp8Encoder;
    private final boolean enableH264HighProfile;

    @androidx.annotation.Nullable
    private final org.webrtc.Predicate<android.media.MediaCodecInfo> codecAllowedPredicate;

    /* JADX INFO: renamed from: org.webrtc.HardwareVideoEncoderFactory$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/HardwareVideoEncoderFactory$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoCodecMimeType = null;

        static {
                org.webrtc.VideoCodecMimeType[] r0 = org.webrtc.VideoCodecMimeType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType = r0
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L17
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP8     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L26
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP9     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L35
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L44
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H265     // Catch: java.lang.NoSuchFieldError -> L44
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L44
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L44
                goto L45
            L44:
                r4 = move-exception
            L45:
                int[] r0 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType     // Catch: java.lang.NoSuchFieldError -> L53
                org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.AV1     // Catch: java.lang.NoSuchFieldError -> L53
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

    public HardwareVideoEncoderFactory(org.webrtc.EglBase.Context r7, boolean r8, boolean r9) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public HardwareVideoEncoderFactory(org.webrtc.EglBase.Context r4, boolean r5, boolean r6, @androidx.annotation.Nullable org.webrtc.Predicate<android.media.MediaCodecInfo> r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.EglBase14.Context
            if (r0 == 0) goto L16
            r0 = r3
            r1 = r4
            org.webrtc.EglBase14$Context r1 = (org.webrtc.EglBase14.Context) r1
            r0.sharedContext = r1
            goto L22
        L16:
            java.lang.String r0 = "HardwareVideoEncoderFactory"
            java.lang.String r1 = "No shared EglBase.Context.  Encoders will not use texture mode."
            org.webrtc.Logging.w(r0, r1)
            r0 = r3
            r1 = 0
            r0.sharedContext = r1
        L22:
            r0 = r3
            r1 = r5
            r0.enableIntelVp8Encoder = r1
            r0 = r3
            r1 = r6
            r0.enableH264HighProfile = r1
            r0 = r3
            r1 = r7
            r0.codecAllowedPredicate = r1
            return
    }

    @java.lang.Deprecated
    public HardwareVideoEncoderFactory(boolean r6, boolean r7) {
            r5 = this;
            r0 = r5
            r1 = 0
            r2 = r6
            r3 = r7
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // org.webrtc.VideoEncoderFactory
    @androidx.annotation.Nullable
    public org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r15) {
            r14 = this;
            r0 = r15
            java.lang.String r0 = r0.getName()
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.valueOf(r0)
            r16 = r0
            r0 = r14
            r1 = r16
            android.media.MediaCodecInfo r0 = r0.findCodecForType(r1)
            r17 = r0
            r0 = r17
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r17
            java.lang.String r0 = r0.getName()
            r18 = r0
            r0 = r16
            java.lang.String r0 = r0.mimeType()
            r19 = r0
            int[] r0 = org.webrtc.MediaCodecUtils.TEXTURE_COLOR_FORMATS
            r1 = r17
            r2 = r19
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r2)
            java.lang.Integer r0 = org.webrtc.MediaCodecUtils.selectColorFormat(r0, r1)
            r20 = r0
            int[] r0 = org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS
            r1 = r17
            r2 = r19
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r2)
            java.lang.Integer r0 = org.webrtc.MediaCodecUtils.selectColorFormat(r0, r1)
            r21 = r0
            r0 = r16
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264
            if (r0 != r1) goto L7a
            r0 = r15
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.params
            r1 = r16
            r2 = 1
            java.util.Map r1 = org.webrtc.MediaCodecUtils.getCodecProperties(r1, r2)
            boolean r0 = org.webrtc.H264Utils.isSameH264Profile(r0, r1)
            r22 = r0
            r0 = r15
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.params
            r1 = r16
            r2 = 0
            java.util.Map r1 = org.webrtc.MediaCodecUtils.getCodecProperties(r1, r2)
            boolean r0 = org.webrtc.H264Utils.isSameH264Profile(r0, r1)
            r23 = r0
            r0 = r22
            if (r0 != 0) goto L6b
            r0 = r23
            if (r0 != 0) goto L6b
            r0 = 0
            return r0
        L6b:
            r0 = r22
            if (r0 == 0) goto L7a
            r0 = r14
            r1 = r17
            boolean r0 = r0.isH264HighProfileSupported(r1)
            if (r0 != 0) goto L7a
            r0 = 0
            return r0
        L7a:
            org.webrtc.HardwareVideoEncoder r0 = new org.webrtc.HardwareVideoEncoder
            r1 = r0
            org.webrtc.MediaCodecWrapperFactoryImpl r2 = new org.webrtc.MediaCodecWrapperFactoryImpl
            r3 = r2
            r3.<init>()
            r3 = r18
            r4 = r16
            r5 = r20
            r6 = r21
            r7 = r15
            java.util.Map<java.lang.String, java.lang.String> r7 = r7.params
            r8 = 3600(0xe10, float:5.045E-42)
            r9 = r14
            r10 = r16
            r11 = r18
            int r9 = r9.getForcedKeyFrameIntervalMs(r10, r11)
            r10 = r14
            r11 = r16
            r12 = r18
            org.webrtc.BitrateAdjuster r10 = r10.createBitrateAdjuster(r11, r12)
            r11 = r14
            org.webrtc.EglBase14$Context r11 = r11.sharedContext
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
    }

    @Override // org.webrtc.VideoEncoderFactory
    public org.webrtc.VideoCodecInfo[] getSupportedCodecs() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r8 = r0
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
            r9 = r0
            r0 = r9
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r11 = r0
        L31:
            r0 = r11
            r1 = r10
            if (r0 >= r1) goto L94
            r0 = r9
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r7
            r1 = r12
            android.media.MediaCodecInfo r0 = r0.findCodecForType(r1)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L8e
            r0 = r12
            java.lang.String r0 = r0.name()
            r14 = r0
            r0 = r12
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.H264
            if (r0 != r1) goto L78
            r0 = r7
            r1 = r13
            boolean r0 = r0.isH264HighProfileSupported(r1)
            if (r0 == 0) goto L78
            r0 = r8
            org.webrtc.VideoCodecInfo r1 = new org.webrtc.VideoCodecInfo
            r2 = r1
            r3 = r14
            r4 = r12
            r5 = 1
            java.util.Map r4 = org.webrtc.MediaCodecUtils.getCodecProperties(r4, r5)
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
        L78:
            r0 = r8
            org.webrtc.VideoCodecInfo r1 = new org.webrtc.VideoCodecInfo
            r2 = r1
            r3 = r14
            r4 = r12
            r5 = 0
            java.util.Map r4 = org.webrtc.MediaCodecUtils.getCodecProperties(r4, r5)
            r2.<init>(r3, r4)
            boolean r0 = r0.add(r1)
        L8e:
            int r11 = r11 + 1
            goto L31
        L94:
            r0 = r8
            r1 = r8
            int r1 = r1.size()
            org.webrtc.VideoCodecInfo[] r1 = new org.webrtc.VideoCodecInfo[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            org.webrtc.VideoCodecInfo[] r0 = (org.webrtc.VideoCodecInfo[]) r0
            return r0
    }

    @androidx.annotation.Nullable
    private android.media.MediaCodecInfo findCodecForType(org.webrtc.VideoCodecMimeType r5) {
            r4 = this;
            r0 = 0
            r6 = r0
        L2:
            r0 = r6
            int r1 = android.media.MediaCodecList.getCodecCount()
            if (r0 >= r1) goto L3d
            r0 = 0
            r7 = r0
            r0 = r6
            android.media.MediaCodecInfo r0 = android.media.MediaCodecList.getCodecInfoAt(r0)     // Catch: java.lang.IllegalArgumentException -> L13
            r7 = r0
            goto L1e
        L13:
            r8 = move-exception
            java.lang.String r0 = "HardwareVideoEncoderFactory"
            java.lang.String r1 = "Cannot retrieve encoder codec info"
            r2 = r8
            org.webrtc.Logging.e(r0, r1, r2)
        L1e:
            r0 = r7
            if (r0 == 0) goto L37
            r0 = r7
            boolean r0 = r0.isEncoder()
            if (r0 != 0) goto L2c
            goto L37
        L2c:
            r0 = r4
            r1 = r7
            r2 = r5
            boolean r0 = r0.isSupportedCodec(r1, r2)
            if (r0 == 0) goto L37
            r0 = r7
            return r0
        L37:
            int r6 = r6 + 1
            goto L2
        L3d:
            r0 = 0
            return r0
    }

    private boolean isSupportedCodec(android.media.MediaCodecInfo r5, org.webrtc.VideoCodecMimeType r6) {
            r4 = this;
            r0 = r5
            r1 = r6
            boolean r0 = org.webrtc.MediaCodecUtils.codecSupportsType(r0, r1)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            int[] r0 = org.webrtc.MediaCodecUtils.ENCODER_COLOR_FORMATS
            r1 = r5
            r2 = r6
            java.lang.String r2 = r2.mimeType()
            android.media.MediaCodecInfo$CodecCapabilities r1 = r1.getCapabilitiesForType(r2)
            java.lang.Integer r0 = org.webrtc.MediaCodecUtils.selectColorFormat(r0, r1)
            if (r0 != 0) goto L1d
            r0 = 0
            return r0
        L1d:
            r0 = r4
            r1 = r5
            r2 = r6
            boolean r0 = r0.isHardwareSupportedInCurrentSdk(r1, r2)
            if (r0 == 0) goto L32
            r0 = r4
            r1 = r5
            boolean r0 = r0.isMediaCodecAllowed(r1)
            if (r0 == 0) goto L32
            r0 = 1
            goto L33
        L32:
            r0 = 0
        L33:
            return r0
    }

    private boolean isHardwareSupportedInCurrentSdk(android.media.MediaCodecInfo r4, org.webrtc.VideoCodecMimeType r5) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Ld
            r0 = r4
            boolean r0 = r0.isHardwareAccelerated()
            return r0
        Ld:
            int[] r0 = org.webrtc.HardwareVideoEncoderFactory.AnonymousClass1.$SwitchMap$org$webrtc$VideoCodecMimeType
            r1 = r5
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L38;
                case 2: goto L3e;
                case 3: goto L44;
                case 4: goto L4a;
                case 5: goto L4a;
                default: goto L4c;
            }
        L38:
            r0 = r3
            r1 = r4
            boolean r0 = r0.isHardwareSupportedInCurrentSdkVp8(r1)
            return r0
        L3e:
            r0 = r3
            r1 = r4
            boolean r0 = r0.isHardwareSupportedInCurrentSdkVp9(r1)
            return r0
        L44:
            r0 = r3
            r1 = r4
            boolean r0 = r0.isHardwareSupportedInCurrentSdkH264(r1)
            return r0
        L4a:
            r0 = 0
            return r0
        L4c:
            r0 = 0
            return r0
    }

    private boolean isHardwareSupportedInCurrentSdkVp8(android.media.MediaCodecInfo r4) {
            r3 = this;
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "OMX.qcom."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L2f
            r0 = r5
            java.lang.String r1 = "OMX.Exynos."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1f
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L2f
        L1f:
            r0 = r5
            java.lang.String r1 = "OMX.Intel."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L33
            r0 = r3
            boolean r0 = r0.enableIntelVp8Encoder
            if (r0 == 0) goto L33
        L2f:
            r0 = 1
            goto L34
        L33:
            r0 = 0
        L34:
            return r0
    }

    private boolean isHardwareSupportedInCurrentSdkVp9(android.media.MediaCodecInfo r4) {
            r3 = this;
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "OMX.qcom."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L17
            r0 = r5
            java.lang.String r1 = "OMX.Exynos."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L23
        L17:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    private boolean isHardwareSupportedInCurrentSdkH264(android.media.MediaCodecInfo r4) {
            r3 = this;
            java.util.List<java.lang.String> r0 = org.webrtc.HardwareVideoEncoderFactory.H264_HW_EXCEPTION_MODELS
            java.lang.String r1 = android.os.Build.MODEL
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "OMX.qcom."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L27
            r0 = r5
            java.lang.String r1 = "OMX.Exynos."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2b
        L27:
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    private boolean isMediaCodecAllowed(android.media.MediaCodecInfo r4) {
            r3 = this;
            r0 = r3
            org.webrtc.Predicate<android.media.MediaCodecInfo> r0 = r0.codecAllowedPredicate
            if (r0 != 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = r3
            org.webrtc.Predicate<android.media.MediaCodecInfo> r0 = r0.codecAllowedPredicate
            r1 = r4
            boolean r0 = r0.test(r1)
            return r0
    }

    private int getForcedKeyFrameIntervalMs(org.webrtc.VideoCodecMimeType r4, java.lang.String r5) {
            r3 = this;
            r0 = r4
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP8
            if (r0 != r1) goto L2c
            r0 = r5
            java.lang.String r1 = "OMX.qcom."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L2c
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 >= r1) goto L1c
            r0 = 15000(0x3a98, float:2.102E-41)
            return r0
        L1c:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 != r1) goto L28
            r0 = 20000(0x4e20, float:2.8026E-41)
            return r0
        L28:
            r0 = 15000(0x3a98, float:2.102E-41)
            return r0
        L2c:
            r0 = 0
            return r0
    }

    private org.webrtc.BitrateAdjuster createBitrateAdjuster(org.webrtc.VideoCodecMimeType r4, java.lang.String r5) {
            r3 = this;
            r0 = r5
            java.lang.String r1 = "OMX.Exynos."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L20
            r0 = r4
            org.webrtc.VideoCodecMimeType r1 = org.webrtc.VideoCodecMimeType.VP8
            if (r0 != r1) goto L18
            org.webrtc.DynamicBitrateAdjuster r0 = new org.webrtc.DynamicBitrateAdjuster
            r1 = r0
            r1.<init>()
            return r0
        L18:
            org.webrtc.FramerateBitrateAdjuster r0 = new org.webrtc.FramerateBitrateAdjuster
            r1 = r0
            r1.<init>()
            return r0
        L20:
            org.webrtc.BaseBitrateAdjuster r0 = new org.webrtc.BaseBitrateAdjuster
            r1 = r0
            r1.<init>()
            return r0
    }

    private boolean isH264HighProfileSupported(android.media.MediaCodecInfo r4) {
            r3 = this;
            r0 = r3
            boolean r0 = r0.enableH264HighProfile
            if (r0 == 0) goto L1f
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 <= r1) goto L1f
            r0 = r4
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "OMX.Exynos."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L1f
            r0 = 1
            goto L20
        L1f:
            r0 = 0
        L20:
            return r0
    }

    static {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "SAMSUNG-SGH-I337"
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "Nexus 7"
            r1[r2] = r3
            r1 = r0
            r2 = 2
            java.lang.String r3 = "Nexus 4"
            r1[r2] = r3
            java.util.List r0 = java.util.Arrays.asList(r0)
            org.webrtc.HardwareVideoEncoderFactory.H264_HW_EXCEPTION_MODELS = r0
            return
    }
}
