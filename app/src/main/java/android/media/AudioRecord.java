package android.media;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/media/AudioRecord.class */
public class AudioRecord {
    public static final int STATE_INITIALIZED = 1;
    public static final int RECORDSTATE_STOPPED = 1;
    public static final int RECORDSTATE_RECORDING = 3;
    public static final int ERROR_BAD_VALUE = -2;
    private int recordingState;

    public AudioRecord() {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.recordingState = r1
            return
    }

    public AudioRecord(int r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.recordingState = r1
            return
    }

    public AudioRecord(android.media.AudioAttributes r4, android.media.AudioFormat r5, int r6, int r7) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = 1
            r0.recordingState = r1
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

    public int getRecordingState() {
            r2 = this;
            r0 = r2
            int r0 = r0.recordingState
            return r0
    }

    public void startRecording() {
            r3 = this;
            r0 = r3
            r1 = 3
            r0.recordingState = r1
            return
    }

    public void stop() {
            r3 = this;
            r0 = r3
            r1 = 1
            r0.recordingState = r1
            return
    }

    public void release() {
            r1 = this;
            return
    }

    public int read(java.nio.ByteBuffer r3, int r4) {
            r2 = this;
            r0 = 0
            return r0
    }

    public int read(byte[] r3, int r4, int r5) {
            r2 = this;
            r0 = 0
            return r0
    }

    public int getAudioSessionId() {
            r2 = this;
            r0 = 0
            return r0
    }
}
