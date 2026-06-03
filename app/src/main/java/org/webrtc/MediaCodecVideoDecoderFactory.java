package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/MediaCodecVideoDecoderFactory.class */
class MediaCodecVideoDecoderFactory implements org.webrtc.VideoDecoderFactory {
    private static final java.lang.String TAG = "MediaCodecVideoDecoderFactory";

    @androidx.annotation.Nullable
    private final org.webrtc.EglBase.Context sharedContext;

    @androidx.annotation.Nullable
    private final org.webrtc.Predicate<android.media.MediaCodecInfo> codecAllowedPredicate;

    public MediaCodecVideoDecoderFactory(@androidx.annotation.Nullable org.webrtc.EglBase.Context r4, @androidx.annotation.Nullable org.webrtc.Predicate<android.media.MediaCodecInfo> r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.sharedContext = r1
            r0 = r3
            r1 = r5
            r0.codecAllowedPredicate = r1
            return
    }

    @Override // org.webrtc.VideoDecoderFactory
    @androidx.annotation.Nullable
    public org.webrtc.VideoDecoder createDecoder(org.webrtc.VideoCodecInfo r9) {
            r8 = this;
            r0 = r9
            java.lang.String r0 = r0.getName()
            org.webrtc.VideoCodecMimeType r0 = org.webrtc.VideoCodecMimeType.valueOf(r0)
            r10 = r0
            r0 = r8
            r1 = r10
            android.media.MediaCodecInfo r0 = r0.findCodecForType(r1)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r11
            r1 = r10
            java.lang.String r1 = r1.mimeType()
            android.media.MediaCodecInfo$CodecCapabilities r0 = r0.getCapabilitiesForType(r1)
            r12 = r0
            org.webrtc.AndroidVideoDecoder r0 = new org.webrtc.AndroidVideoDecoder
            r1 = r0
            org.webrtc.MediaCodecWrapperFactoryImpl r2 = new org.webrtc.MediaCodecWrapperFactoryImpl
            r3 = r2
            r3.<init>()
            r3 = r11
            java.lang.String r3 = r3.getName()
            r4 = r10
            int[] r5 = org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS
            r6 = r12
            java.lang.Integer r5 = org.webrtc.MediaCodecUtils.selectColorFormat(r5, r6)
            int r5 = r5.intValue()
            r6 = r8
            org.webrtc.EglBase$Context r6 = r6.sharedContext
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    @Override // org.webrtc.VideoDecoderFactory
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
            java.lang.String r0 = "MediaCodecVideoDecoderFactory"
            java.lang.String r1 = "Cannot retrieve decoder codec info"
            r2 = r8
            org.webrtc.Logging.e(r0, r1, r2)
        L1e:
            r0 = r7
            if (r0 == 0) goto L37
            r0 = r7
            boolean r0 = r0.isEncoder()
            if (r0 == 0) goto L2c
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
            int[] r0 = org.webrtc.MediaCodecUtils.DECODER_COLOR_FORMATS
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
            boolean r0 = r0.isCodecAllowed(r1)
            return r0
    }

    private boolean isCodecAllowed(android.media.MediaCodecInfo r4) {
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

    private boolean isH264HighProfileSupported(android.media.MediaCodecInfo r4) {
            r3 = this;
            r0 = r4
            java.lang.String r0 = r0.getName()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "OMX.qcom."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            if (r0 < r1) goto L23
            r0 = r5
            java.lang.String r1 = "OMX.Exynos."
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L23
            r0 = 1
            return r0
        L23:
            r0 = 0
            return r0
    }
}
