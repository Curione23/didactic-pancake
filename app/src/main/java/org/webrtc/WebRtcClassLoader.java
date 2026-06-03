package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/WebRtcClassLoader.class */
class WebRtcClassLoader {
    WebRtcClassLoader() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.webrtc.CalledByNative
    static java.lang.Object getClassLoader() {
            java.lang.Class<org.webrtc.WebRtcClassLoader> r0 = org.webrtc.WebRtcClassLoader.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4 = r0
            r0 = r4
            if (r0 != 0) goto L14
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Failed to get WebRTC class loader."
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r4
            return r0
    }
}
