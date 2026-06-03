package android.content;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/droidbridge-devonvoid-android-webrtc-bridge.jar:android/content/Intent.class */
public class Intent {
    private java.lang.String action;
    private final java.util.Map<java.lang.String, java.lang.Object> extras;

    public Intent() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.extras = r1
            return
    }

    public Intent(java.lang.String r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.extras = r1
            r0 = r4
            r1 = r5
            r0.action = r1
            return
    }

    public java.lang.String getAction() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.action
            return r0
    }

    public android.content.Intent setAction(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.action = r1
            r0 = r3
            return r0
    }

    public android.content.Intent putExtra(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.extras
            r1 = r5
            r2 = r6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            return r0
    }

    public android.content.Intent putExtra(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.extras
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            return r0
    }

    public android.content.Intent putExtra(java.lang.String r5, android.os.Parcelable r6) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.extras
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r4
            return r0
    }

    public int getIntExtra(java.lang.String r4, int r5) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.extras
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            r6 = r0
            r0 = r6
            boolean r0 = r0 instanceof java.lang.Number
            if (r0 == 0) goto L1c
            r0 = r6
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            goto L1d
        L1c:
            r0 = r5
        L1d:
            return r0
    }

    public java.lang.String getStringExtra(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.extras
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L19
            r0 = r5
            java.lang.String r0 = (java.lang.String) r0
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    public <T extends android.os.Parcelable> T getParcelableExtra(java.lang.String r4) {
            r3 = this;
            r0 = r3
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.extras
            r1 = r4
            java.lang.Object r0 = r0.get(r1)
            r5 = r0
            r0 = r5
            boolean r0 = r0 instanceof android.os.Parcelable
            if (r0 == 0) goto L19
            r0 = r5
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }
}
