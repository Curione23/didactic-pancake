package android.os;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/os/Message.class */
public class Message {
    public int what;
    public int arg1;
    public int arg2;
    public java.lang.Object obj;
    android.os.Handler target;

    public Message() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static android.os.Message obtain() {
            android.os.Message r0 = new android.os.Message
            r1 = r0
            r1.<init>()
            return r0
    }

    public void sendToTarget() {
            r3 = this;
            r0 = r3
            android.os.Handler r0 = r0.target
            if (r0 == 0) goto L10
            r0 = r3
            android.os.Handler r0 = r0.target
            r1 = r3
            boolean r0 = r0.sendMessage(r1)
        L10:
            return
    }
}
