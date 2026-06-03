package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/BuiltinAudioEncoderFactoryFactory.class */
public class BuiltinAudioEncoderFactoryFactory implements org.webrtc.AudioEncoderFactoryFactory {
    public BuiltinAudioEncoderFactoryFactory() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.AudioEncoderFactoryFactory
    public long createNativeAudioEncoderFactory() {
            r3 = this;
            long r0 = nativeCreateBuiltinAudioEncoderFactory()
            return r0
    }

    private static native long nativeCreateBuiltinAudioEncoderFactory();
}
