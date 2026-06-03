package android.media.audiofx;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/audiofx/AudioEffect.class */
public class AudioEffect {
    public static final java.util.UUID EFFECT_TYPE_AEC = null;
    public static final java.util.UUID EFFECT_TYPE_NS = null;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/audiofx/AudioEffect$Descriptor.class */
    public static class Descriptor {
        public java.util.UUID type;
        public java.util.UUID uuid;
        public java.lang.String name;
        public java.lang.String implementor;
        public java.lang.String connectMode;

        public Descriptor() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }
    }

    public AudioEffect() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static android.media.audiofx.AudioEffect.Descriptor[] queryEffects() {
            r0 = 0
            android.media.audiofx.AudioEffect$Descriptor[] r0 = new android.media.audiofx.AudioEffect.Descriptor[r0]
            return r0
    }

    static {
            java.lang.String r0 = "00000000-0000-0000-0000-000000000001"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            android.media.audiofx.AudioEffect.EFFECT_TYPE_AEC = r0
            java.lang.String r0 = "00000000-0000-0000-0000-000000000002"
            java.util.UUID r0 = java.util.UUID.fromString(r0)
            android.media.audiofx.AudioEffect.EFFECT_TYPE_NS = r0
            return
    }
}
