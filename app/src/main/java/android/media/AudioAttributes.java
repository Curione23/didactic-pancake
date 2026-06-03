package android.media;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioAttributes.class */
public class AudioAttributes {
    public static final int USAGE_VOICE_COMMUNICATION = 2;
    public static final int CONTENT_TYPE_SPEECH = 1;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioAttributes$Builder.class */
    public static class Builder {
        public Builder() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        public android.media.AudioAttributes.Builder setUsage(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.media.AudioAttributes.Builder setContentType(int r3) {
                r2 = this;
                r0 = r2
                return r0
        }

        public android.media.AudioAttributes build() {
                r3 = this;
                android.media.AudioAttributes r0 = new android.media.AudioAttributes
                r1 = r0
                r1.<init>()
                return r0
        }
    }

    public AudioAttributes() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }
}
