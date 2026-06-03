package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/AudioTrack.class */
public class AudioTrack extends org.webrtc.MediaStreamTrack {
    public AudioTrack(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    public void setVolume(double r6) {
            r5 = this;
            r0 = r5
            long r0 = r0.getNativeAudioTrack()
            r1 = r6
            nativeSetVolume(r0, r1)
            return
    }

    long getNativeAudioTrack() {
            r3 = this;
            r0 = r3
            long r0 = r0.getNativeMediaStreamTrack()
            return r0
    }

    private static native void nativeSetVolume(long r0, double r2);
}
