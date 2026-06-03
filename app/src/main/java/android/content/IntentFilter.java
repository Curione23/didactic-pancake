package android.content;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/content/IntentFilter.class */
public class IntentFilter {
    private final java.util.List<java.lang.String> actions;

    public IntentFilter() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.actions = r1
            return
    }

    public IntentFilter(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = r1
            r2.<init>()
            r0.actions = r1
            r0 = r4
            r1 = r5
            r0.addAction(r1)
            return
    }

    public void addAction(java.lang.String r4) {
            r3 = this;
            r0 = r4
            if (r0 == 0) goto L1c
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.actions
            r1 = r4
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L1c
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.actions
            r1 = r4
            boolean r0 = r0.add(r1)
        L1c:
            return
    }

    public boolean hasAction(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.List<java.lang.String> r0 = r0.actions
            r1 = r4
            boolean r0 = r0.contains(r1)
            return r0
    }
}
