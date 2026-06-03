package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/JniCommon.class */
public class JniCommon {
    public JniCommon() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static native void nativeAddRef(long r0);

    public static native void nativeReleaseRef(long r0);

    public static native java.nio.ByteBuffer nativeAllocateByteBuffer(int r0);

    public static native void nativeFreeByteBuffer(java.nio.ByteBuffer r0);
}
