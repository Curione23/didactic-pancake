package android.media;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioTrack.class */
public class AudioTrack {
    public static final int STATE_INITIALIZED = 1;
    public static final int PLAYSTATE_STOPPED = 1;
    public static final int PLAYSTATE_PLAYING = 3;
    public static final int MODE_STREAM = 1;
    public static final int WRITE_BLOCKING = 0;
    public static final int ERROR_BAD_VALUE = -2;
    private int playState;

    public AudioTrack() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.playState = r1
            return
    }

    public AudioTrack(int r4, int r5, int r6, int r7, int r8, int r9) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.playState = r1
            return
    }

    public AudioTrack(android.media.AudioAttributes r4, android.media.AudioFormat r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.playState = r1
            return
    }

    public static int getMinBufferSize(int r2, int r3, int r4) {
            r0 = 4096(0x1000, float:5.74E-42)
            return r0
    }

    public int getState() {
            r2 = this;
            r0 = 1
            return r0
    }

    public int getPlayState() {
            r2 = this;
            r0 = r2
            int r0 = r0.playState
            return r0
    }

    public void play() {
            r3 = this;
            r0 = r3
            r1 = 3
            r0.playState = r1
            return
    }

    public void stop() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.playState = r1
            return
    }

    public void flush() {
            r1 = this;
            return
    }

    public void release() {
            r1 = this;
            return
    }

    public int write(java.nio.ByteBuffer r3, int r4, int r5) {
            r2 = this;
            r0 = r4
            return r0
    }

    public int write(byte[] r3, int r4, int r5) {
            r2 = this;
            r0 = r5
            return r0
    }

    public int getAudioSessionId() {
            r2 = this;
            r0 = 0
            return r0
    }

    public void setVolume(float r2) {
            r1 = this;
            return
    }
}
