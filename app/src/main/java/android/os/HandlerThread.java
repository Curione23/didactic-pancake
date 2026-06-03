package android.os;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/os/HandlerThread.class */
public class HandlerThread extends java.lang.Thread {
    private final android.os.Looper looper;

    public HandlerThread(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            android.os.Looper r1 = new android.os.Looper
            r2 = r1
            r2.<init>()
            r0.looper = r1
            return
    }

    public HandlerThread(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r0.<init>(r1)
            r0 = r4
            android.os.Looper r1 = new android.os.Looper
            r2 = r1
            r2.<init>()
            r0.looper = r1
            return
    }

    public android.os.Looper getLooper() {
            r2 = this;
            r0 = r2
            android.os.Looper r0 = r0.looper
            return r0
    }

    public boolean quit() {
            r2 = this;
            r0 = 1
            return r0
    }
}
