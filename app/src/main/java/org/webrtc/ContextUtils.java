package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ContextUtils.class */
public class ContextUtils {
    private static final java.lang.String TAG = "ContextUtils";
    private static android.content.Context applicationContext;

    public ContextUtils() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void initialize(android.content.Context r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Application context cannot be null for ContextUtils.initialize."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            org.webrtc.ContextUtils.applicationContext = r0
            return
    }

    @java.lang.Deprecated
    public static android.content.Context getApplicationContext() {
            android.content.Context r0 = org.webrtc.ContextUtils.applicationContext
            return r0
    }
}
