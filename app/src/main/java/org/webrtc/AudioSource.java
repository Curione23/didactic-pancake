package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/AudioSource.class */
public class AudioSource extends org.webrtc.MediaSource {
    public AudioSource(long r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            return
    }

    long getNativeAudioSource() {
            r3 = this;
            r0 = r3
            long r0 = r0.getNativeMediaSource()
            return r0
    }
}
