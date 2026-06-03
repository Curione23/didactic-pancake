package android.media;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioTimestamp.class */
public class AudioTimestamp {
    public long framePosition;
    public long nanoTime;

    public AudioTimestamp() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.framePosition = r1
            r0 = r4
            long r1 = java.lang.System.nanoTime()
            r0.nanoTime = r1
            return
    }
}
