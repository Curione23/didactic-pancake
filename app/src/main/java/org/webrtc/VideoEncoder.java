package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder.class */
public interface VideoEncoder {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$BitrateAllocation.class */
    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        @org.webrtc.CalledByNative("BitrateAllocation")
        public BitrateAllocation(int[][] r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.bitratesBbs = r1
                return
        }

        public int getSum() {
                r3 = this;
                r0 = 0
                r4 = r0
                r0 = r3
                int[][] r0 = r0.bitratesBbs
                r5 = r0
                r0 = r5
                int r0 = r0.length
                r6 = r0
                r0 = 0
                r7 = r0
            Ld:
                r0 = r7
                r1 = r6
                if (r0 >= r1) goto L44
                r0 = r5
                r1 = r7
                r0 = r0[r1]
                r8 = r0
                r0 = r8
                r9 = r0
                r0 = r9
                int r0 = r0.length
                r10 = r0
                r0 = 0
                r11 = r0
            L25:
                r0 = r11
                r1 = r10
                if (r0 >= r1) goto L3e
                r0 = r9
                r1 = r11
                r0 = r0[r1]
                r12 = r0
                r0 = r4
                r1 = r12
                int r0 = r0 + r1
                r4 = r0
                int r11 = r11 + 1
                goto L25
            L3e:
                int r7 = r7 + 1
                goto Ld
            L44:
                r0 = r4
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$Callback.class */
    public interface Callback {
        void onEncodedFrame(org.webrtc.EncodedImage r1, org.webrtc.VideoEncoder.CodecSpecificInfo r2);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$Capabilities.class */
    public static class Capabilities {
        public final boolean lossNotification;

        @org.webrtc.CalledByNative("Capabilities")
        public Capabilities(boolean r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.lossNotification = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$CodecSpecificInfo.class */
    public static class CodecSpecificInfo {
        public CodecSpecificInfo() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$CodecSpecificInfoAV1.class */
    public static class CodecSpecificInfoAV1 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
        public CodecSpecificInfoAV1() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$CodecSpecificInfoH264.class */
    public static class CodecSpecificInfoH264 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
        public CodecSpecificInfoH264() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$CodecSpecificInfoVP8.class */
    public static class CodecSpecificInfoVP8 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
        public CodecSpecificInfoVP8() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$CodecSpecificInfoVP9.class */
    public static class CodecSpecificInfoVP9 extends org.webrtc.VideoEncoder.CodecSpecificInfo {
        public CodecSpecificInfoVP9() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$EncodeInfo.class */
    public static class EncodeInfo {
        public final org.webrtc.EncodedImage.FrameType[] frameTypes;

        @org.webrtc.CalledByNative("EncodeInfo")
        public EncodeInfo(org.webrtc.EncodedImage.FrameType[] r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.frameTypes = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$EncoderInfo.class */
    public static class EncoderInfo {
        public final int requestedResolutionAlignment;
        public final boolean applyAlignmentToAllSimulcastLayers;

        public EncoderInfo(int r4, boolean r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.requestedResolutionAlignment = r1
                r0 = r3
                r1 = r5
                r0.applyAlignmentToAllSimulcastLayers = r1
                return
        }

        @org.webrtc.CalledByNative("EncoderInfo")
        public int getRequestedResolutionAlignment() {
                r2 = this;
                r0 = r2
                int r0 = r0.requestedResolutionAlignment
                return r0
        }

        @org.webrtc.CalledByNative("EncoderInfo")
        public boolean getApplyAlignmentToAllSimulcastLayers() {
                r2 = this;
                r0 = r2
                boolean r0 = r0.applyAlignmentToAllSimulcastLayers
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$RateControlParameters.class */
    public static class RateControlParameters {
        public final org.webrtc.VideoEncoder.BitrateAllocation bitrate;
        public final double framerateFps;

        @org.webrtc.CalledByNative("RateControlParameters")
        public RateControlParameters(org.webrtc.VideoEncoder.BitrateAllocation r5, double r6) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.bitrate = r1
                r0 = r4
                r1 = r6
                r0.framerateFps = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$ResolutionBitrateLimits.class */
    public static class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int minStartBitrateBps;
        public final int minBitrateBps;
        public final int maxBitrateBps;

        public ResolutionBitrateLimits(int r4, int r5, int r6, int r7) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.frameSizePixels = r1
                r0 = r3
                r1 = r5
                r0.minStartBitrateBps = r1
                r0 = r3
                r1 = r6
                r0.minBitrateBps = r1
                r0 = r3
                r1 = r7
                r0.maxBitrateBps = r1
                return
        }

        @org.webrtc.CalledByNative("ResolutionBitrateLimits")
        public int getFrameSizePixels() {
                r2 = this;
                r0 = r2
                int r0 = r0.frameSizePixels
                return r0
        }

        @org.webrtc.CalledByNative("ResolutionBitrateLimits")
        public int getMinStartBitrateBps() {
                r2 = this;
                r0 = r2
                int r0 = r0.minStartBitrateBps
                return r0
        }

        @org.webrtc.CalledByNative("ResolutionBitrateLimits")
        public int getMinBitrateBps() {
                r2 = this;
                r0 = r2
                int r0 = r0.minBitrateBps
                return r0
        }

        @org.webrtc.CalledByNative("ResolutionBitrateLimits")
        public int getMaxBitrateBps() {
                r2 = this;
                r0 = r2
                int r0 = r0.maxBitrateBps
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$ScalingSettings.class */
    public static class ScalingSettings {
        public final boolean on;

        @androidx.annotation.Nullable
        public final java.lang.Integer low;

        @androidx.annotation.Nullable
        public final java.lang.Integer high;
        public static final org.webrtc.VideoEncoder.ScalingSettings OFF = null;

        public ScalingSettings(int r4, int r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 1
                r0.on = r1
                r0 = r3
                r1 = r4
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.low = r1
                r0 = r3
                r1 = r5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.high = r1
                return
        }

        private ScalingSettings() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 0
                r0.on = r1
                r0 = r3
                r1 = 0
                r0.low = r1
                r0 = r3
                r1 = 0
                r0.high = r1
                return
        }

        @java.lang.Deprecated
        public ScalingSettings(boolean r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.on = r1
                r0 = r3
                r1 = 0
                r0.low = r1
                r0 = r3
                r1 = 0
                r0.high = r1
                return
        }

        @java.lang.Deprecated
        public ScalingSettings(boolean r4, int r5, int r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.on = r1
                r0 = r3
                r1 = r5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.low = r1
                r0 = r3
                r1 = r6
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r0.high = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                r0 = r3
                boolean r0 = r0.on
                if (r0 == 0) goto L17
                r0 = r3
                java.lang.Integer r0 = r0.low
                r1 = r3
                java.lang.Integer r1 = r1.high
                java.lang.String r0 = "[ " + r0 + ", " + r1 + " ]"
                goto L19
            L17:
                java.lang.String r0 = "OFF"
            L19:
                return r0
        }

        static {
                org.webrtc.VideoEncoder$ScalingSettings r0 = new org.webrtc.VideoEncoder$ScalingSettings
                r1 = r0
                r1.<init>()
                org.webrtc.VideoEncoder.ScalingSettings.OFF = r0
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoEncoder$Settings.class */
    public static class Settings {
        public final int numberOfCores;
        public final int width;
        public final int height;
        public final int startBitrate;
        public final int maxFramerate;
        public final int numberOfSimulcastStreams;
        public final boolean automaticResizeOn;
        public final org.webrtc.VideoEncoder.Capabilities capabilities;

        @java.lang.Deprecated
        public Settings(int r13, int r14, int r15, int r16, int r17, int r18, boolean r19) {
                r12 = this;
                r0 = r12
                r1 = r13
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                org.webrtc.VideoEncoder$Capabilities r8 = new org.webrtc.VideoEncoder$Capabilities
                r9 = r8
                r10 = 0
                r9.<init>(r10)
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return
        }

        @org.webrtc.CalledByNative("Settings")
        public Settings(int r4, int r5, int r6, int r7, int r8, int r9, boolean r10, org.webrtc.VideoEncoder.Capabilities r11) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.numberOfCores = r1
                r0 = r3
                r1 = r5
                r0.width = r1
                r0 = r3
                r1 = r6
                r0.height = r1
                r0 = r3
                r1 = r7
                r0.startBitrate = r1
                r0 = r3
                r1 = r8
                r0.maxFramerate = r1
                r0 = r3
                r1 = r9
                r0.numberOfSimulcastStreams = r1
                r0 = r3
                r1 = r10
                r0.automaticResizeOn = r1
                r0 = r3
                r1 = r11
                r0.capabilities = r1
                return
        }
    }

    @org.webrtc.CalledByNative
    default long createNativeVideoEncoder() {
            r3 = this;
            r0 = 0
            return r0
    }

    @org.webrtc.CalledByNative
    default boolean isHardwareEncoder() {
            r2 = this;
            r0 = 1
            return r0
    }

    @org.webrtc.CalledByNative
    org.webrtc.VideoCodecStatus initEncode(org.webrtc.VideoEncoder.Settings r1, org.webrtc.VideoEncoder.Callback r2);

    @org.webrtc.CalledByNative
    org.webrtc.VideoCodecStatus release();

    @org.webrtc.CalledByNative
    org.webrtc.VideoCodecStatus encode(org.webrtc.VideoFrame r1, org.webrtc.VideoEncoder.EncodeInfo r2);

    org.webrtc.VideoCodecStatus setRateAllocation(org.webrtc.VideoEncoder.BitrateAllocation r1, int r2);

    @org.webrtc.CalledByNative
    default org.webrtc.VideoCodecStatus setRates(org.webrtc.VideoEncoder.RateControlParameters r5) {
            r4 = this;
            r0 = r5
            double r0 = r0.framerateFps
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r6 = r0
            r0 = r4
            r1 = r5
            org.webrtc.VideoEncoder$BitrateAllocation r1 = r1.bitrate
            r2 = r6
            org.webrtc.VideoCodecStatus r0 = r0.setRateAllocation(r1, r2)
            return r0
    }

    @org.webrtc.CalledByNative
    org.webrtc.VideoEncoder.ScalingSettings getScalingSettings();

    @org.webrtc.CalledByNative
    default org.webrtc.VideoEncoder.ResolutionBitrateLimits[] getResolutionBitrateLimits() {
            r2 = this;
            r0 = 0
            org.webrtc.VideoEncoder$ResolutionBitrateLimits[] r0 = new org.webrtc.VideoEncoder.ResolutionBitrateLimits[r0]
            r3 = r0
            r0 = r3
            return r0
    }

    @org.webrtc.CalledByNative
    java.lang.String getImplementationName();

    @org.webrtc.CalledByNative
    default org.webrtc.VideoEncoder.EncoderInfo getEncoderInfo() {
            r5 = this;
            org.webrtc.VideoEncoder$EncoderInfo r0 = new org.webrtc.VideoEncoder$EncoderInfo
            r1 = r0
            r2 = 1
            r3 = 0
            r1.<init>(r2, r3)
            return r0
    }
}
