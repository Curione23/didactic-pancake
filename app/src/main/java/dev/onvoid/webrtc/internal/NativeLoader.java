package dev.onvoid.webrtc.internal;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:dev/onvoid/webrtc/internal/NativeLoader.class */
public class NativeLoader {
    public NativeLoader() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void loadLibrary(java.lang.String r3) throws java.lang.Exception {
            java.lang.String r0 = "webrtc-java"
            r1 = r3
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            java.lang.String r0 = "jingle_peerconnection_so"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L11
            goto L12
        L11:
            r4 = move-exception
        L12:
            return
        L13:
            r0 = r3
            java.lang.System.loadLibrary(r0)
            return
    }
}
