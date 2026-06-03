package android.os;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/os/SystemClock.class */
public final class SystemClock {
    private SystemClock() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static long elapsedRealtime() {
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    public static long uptimeMillis() {
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    public static long currentThreadTimeMillis() {
            long r0 = java.lang.System.currentTimeMillis()
            return r0
    }

    public static void sleep(long r3) {
            r0 = r3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L7
            goto Le
        L7:
            r5 = move-exception
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Le:
            return
    }
}
