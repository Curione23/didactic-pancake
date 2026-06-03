package android.os;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/os/Looper.class */
public class Looper {
    private static final android.os.Looper MAIN = null;
    private final java.lang.Thread thread;

    public Looper() {
            r3 = this;
            r0 = r3
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.<init>(r1)
            return
    }

    private Looper(java.lang.Thread r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.thread = r1
            return
    }

    public static android.os.Looper getMainLooper() {
            android.os.Looper r0 = android.os.Looper.MAIN
            return r0
    }

    public static android.os.Looper myLooper() {
            android.os.Looper r0 = android.os.Looper.MAIN
            return r0
    }

    public java.lang.Thread getThread() {
            r2 = this;
            r0 = r2
            java.lang.Thread r0 = r0.thread
            return r0
    }

    public void quit() {
            r1 = this;
            return
    }

    static {
            android.os.Looper r0 = new android.os.Looper
            r1 = r0
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.<init>(r2)
            android.os.Looper.MAIN = r0
            return
    }
}
