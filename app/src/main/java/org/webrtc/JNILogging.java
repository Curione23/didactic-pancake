package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/JNILogging.class */
class JNILogging {
    private final org.webrtc.Loggable loggable;

    public JNILogging(org.webrtc.Loggable r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.loggable = r1
            return
    }

    @org.webrtc.CalledByNative
    public void logToInjectable(java.lang.String r6, java.lang.Integer r7, java.lang.String r8) {
            r5 = this;
            r0 = r5
            org.webrtc.Loggable r0 = r0.loggable
            r1 = r6
            org.webrtc.Logging$Severity[] r2 = org.webrtc.Logging.Severity.values()
            r3 = r7
            int r3 = r3.intValue()
            r2 = r2[r3]
            r3 = r8
            r0.onLogMessage(r1, r2, r3)
            return
    }
}
