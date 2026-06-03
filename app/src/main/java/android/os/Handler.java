package android.os;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/os/Handler.class */
public class Handler {
    private final android.os.Looper looper;

    public Handler() {
            r3 = this;
            r0 = r3
            android.os.Looper r1 = android.os.Looper.myLooper()
            r0.<init>(r1)
            return
    }

    public Handler(android.os.Looper r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            if (r1 == 0) goto Ld
            r1 = r4
            goto L10
        Ld:
            android.os.Looper r1 = android.os.Looper.getMainLooper()
        L10:
            r0.looper = r1
            return
    }

    public android.os.Looper getLooper() {
            r2 = this;
            r0 = r2
            android.os.Looper r0 = r0.looper
            return r0
    }

    public boolean post(java.lang.Runnable r3) {
            r2 = this;
            r0 = r3
            if (r0 == 0) goto La
            r0 = r3
            r0.run()
        La:
            r0 = 1
            return r0
    }

    public boolean postDelayed(java.lang.Runnable r3, long r4) {
            r2 = this;
            r0 = r3
            if (r0 == 0) goto La
            r0 = r3
            r0.run()
        La:
            r0 = 1
            return r0
    }

    public void removeCallbacks(java.lang.Runnable r2) {
            r1 = this;
            return
    }

    public android.os.Message obtainMessage() {
            r3 = this;
            android.os.Message r0 = android.os.Message.obtain()
            r4 = r0
            r0 = r4
            r1 = r3
            r0.target = r1
            r0 = r4
            return r0
    }

    public android.os.Message obtainMessage(int r4) {
            r3 = this;
            r0 = r3
            android.os.Message r0 = r0.obtainMessage()
            r5 = r0
            r0 = r5
            r1 = r4
            r0.what = r1
            r0 = r5
            return r0
    }

    public android.os.Message obtainMessage(int r4, java.lang.Object r5) {
            r3 = this;
            r0 = r3
            r1 = r4
            android.os.Message r0 = r0.obtainMessage(r1)
            r6 = r0
            r0 = r6
            r1 = r5
            r0.obj = r1
            r0 = r6
            return r0
    }

    public boolean sendMessage(android.os.Message r3) {
            r2 = this;
            r0 = 1
            return r0
    }
}
