package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoDecoder.class */
public interface VideoDecoder {

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoDecoder$Callback.class */
    public interface Callback {
        void onDecodedFrame(org.webrtc.VideoFrame r1, java.lang.Integer r2, java.lang.Integer r3);
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoDecoder$DecodeInfo.class */
    public static class DecodeInfo {
        public final boolean isMissingFrames;
        public final long renderTimeMs;

        public DecodeInfo(boolean r5, long r6) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                r1 = r5
                r0.isMissingFrames = r1
                r0 = r4
                r1 = r6
                r0.renderTimeMs = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/VideoDecoder$Settings.class */
    public static class Settings {
        public final int numberOfCores;
        public final int width;
        public final int height;

        @org.webrtc.CalledByNative("Settings")
        public Settings(int r4, int r5, int r6) {
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
                return
        }
    }

    @org.webrtc.CalledByNative
    default long createNative(long r4) {
            r3 = this;
            r0 = 0
            return r0
    }

    @org.webrtc.CalledByNative
    org.webrtc.VideoCodecStatus initDecode(org.webrtc.VideoDecoder.Settings r1, org.webrtc.VideoDecoder.Callback r2);

    @org.webrtc.CalledByNative
    org.webrtc.VideoCodecStatus release();

    @org.webrtc.CalledByNative
    org.webrtc.VideoCodecStatus decode(org.webrtc.EncodedImage r1, org.webrtc.VideoDecoder.DecodeInfo r2);

    @org.webrtc.CalledByNative
    java.lang.String getImplementationName();
}
