package android.os;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/os/Process.class */
public final class Process {
    public static final int THREAD_PRIORITY_DEFAULT = 0;
    public static final int THREAD_PRIORITY_AUDIO = -16;
    public static final int THREAD_PRIORITY_URGENT_AUDIO = -19;
    public static final int THREAD_PRIORITY_DISPLAY = -4;
    public static final int THREAD_PRIORITY_BACKGROUND = 10;
    public static final int THREAD_PRIORITY_MORE_FAVORABLE = -1;
    public static final int THREAD_PRIORITY_LESS_FAVORABLE = 1;

    private Process() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int myPid() {
            r0 = 0
            return r0
    }

    public static int myTid() {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            long r0 = r0.getId()
            r5 = r0
            r0 = r5
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L18
            r0 = r5
            r1 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 % r1
            int r0 = (int) r0
            goto L1a
        L18:
            r0 = r5
            int r0 = (int) r0
        L1a:
            return r0
    }

    public static int myUid() {
            r0 = 0
            return r0
    }

    public static void setThreadPriority(int r1) {
            return
    }

    public static void setThreadPriority(int r1, int r2) {
            return
    }

    public static int getThreadPriority(int r2) {
            r0 = 0
            return r0
    }
}
