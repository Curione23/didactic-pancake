package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/BuiltinAudioDecoderFactoryFactory.class */
public class BuiltinAudioDecoderFactoryFactory implements org.webrtc.AudioDecoderFactoryFactory {
    public BuiltinAudioDecoderFactoryFactory() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.webrtc.AudioDecoderFactoryFactory
    public long createNativeAudioDecoderFactory() {
            r3 = this;
            long r0 = nativeCreateBuiltinAudioDecoderFactory()
            return r0
    }

    private static native long nativeCreateBuiltinAudioDecoderFactory();
}
