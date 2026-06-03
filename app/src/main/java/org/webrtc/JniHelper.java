package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/JniHelper.class */
class JniHelper {
    JniHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.webrtc.CalledByNative
    static byte[] getStringBytes(java.lang.String r4) {
            r0 = r4
            java.lang.String r1 = "ISO-8859-1"
            byte[] r0 = r0.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L7
            return r0
        L7:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "ISO-8859-1 is unsupported"
            r1.<init>(r2)
            throw r0
    }

    @org.webrtc.CalledByNative
    static java.lang.Object getStringClass() {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            return r0
    }

    @org.webrtc.CalledByNative
    static java.lang.Object getKey(java.util.Map.Entry r2) {
            r0 = r2
            java.lang.Object r0 = r0.getKey()
            return r0
    }

    @org.webrtc.CalledByNative
    static java.lang.Object getValue(java.util.Map.Entry r2) {
            r0 = r2
            java.lang.Object r0 = r0.getValue()
            return r0
    }
}
