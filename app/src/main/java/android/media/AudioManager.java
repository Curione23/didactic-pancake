package android.media;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioManager.class */
public class AudioManager {
    public static final java.lang.String PROPERTY_OUTPUT_SAMPLE_RATE = "android.media.property.OUTPUT_SAMPLE_RATE";
    public static final java.lang.String PROPERTY_OUTPUT_FRAMES_PER_BUFFER = "android.media.property.OUTPUT_FRAMES_PER_BUFFER";
    public static final int MODE_NORMAL = 0;
    public static final int STREAM_VOICE_CALL = 0;
    public static final int STREAM_MUSIC = 3;

    public AudioManager() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public java.lang.String getProperty(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "android.media.property.OUTPUT_SAMPLE_RATE"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lc
            java.lang.String r0 = "48000"
            return r0
        Lc:
            java.lang.String r0 = "android.media.property.OUTPUT_FRAMES_PER_BUFFER"
            r1 = r4
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            java.lang.String r0 = "256"
            return r0
        L18:
            r0 = 0
            return r0
    }

    public int getMode() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isMicrophoneMute() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isSpeakerphoneOn() {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isBluetoothScoOn() {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getStreamVolume(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getStreamMaxVolume(int r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    public boolean isVolumeFixed() {
            r2 = this;
            r0 = 1
            return r0
    }
}
