package org.webrtc.audio;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/audio/AudioDeviceModule.class */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setSpeakerMute(boolean r1);

    void setMicrophoneMute(boolean r1);

    default boolean setNoiseSuppressorEnabled(boolean r3) {
            r2 = this;
            r0 = 0
            return r0
    }

    default boolean setPreferredMicrophoneFieldDimension(float r3) {
            r2 = this;
            r0 = 0
            return r0
    }
}
