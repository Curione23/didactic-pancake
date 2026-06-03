package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/ApplicationContextProvider.class */
public class ApplicationContextProvider {
    public ApplicationContextProvider() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @org.webrtc.CalledByNative
    public static android.content.Context getApplicationContext() {
            android.content.Context r0 = org.webrtc.ContextUtils.getApplicationContext()
            return r0
    }
}
