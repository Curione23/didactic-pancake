package android.media;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioFormat.class */
public class AudioFormat {
    public static final int CHANNEL_OUT_MONO = 4;
    public static final int CHANNEL_OUT_STEREO = 12;
    public static final int CHANNEL_IN_MONO = 16;
    public static final int CHANNEL_IN_STEREO = 12;
    public static final int ENCODING_PCM_16BIT = 2;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioFormat$Builder.class */
    public static class Builder {
        public Builder() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public android.media.AudioFormat.Builder setEncoding(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.media.AudioFormat.Builder setSampleRate(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.media.AudioFormat.Builder setChannelMask(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.media.AudioFormat build() {
                r3 = this;
                android.media.AudioFormat r0 = new android.media.AudioFormat
                r1 = r0
                r1.<init>()
                return r0
        }
    }

    public AudioFormat() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
