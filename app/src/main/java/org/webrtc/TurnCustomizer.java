package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/TurnCustomizer.class */
public class TurnCustomizer {
    private long nativeTurnCustomizer;

    public TurnCustomizer(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.nativeTurnCustomizer = r1
            return
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkTurnCustomizerExists()
            r0 = r4
            long r0 = r0.nativeTurnCustomizer
            nativeFreeTurnCustomizer(r0)
            r0 = r4
            r1 = 0
            r0.nativeTurnCustomizer = r1
            return
    }

    private static native void nativeFreeTurnCustomizer(long r0);

    @org.webrtc.CalledByNative
    long getNativeTurnCustomizer() {
            r3 = this;
            r0 = r3
            r0.checkTurnCustomizerExists()
            r0 = r3
            long r0 = r0.nativeTurnCustomizer
            return r0
    }

    private void checkTurnCustomizerExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeTurnCustomizer
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "TurnCustomizer has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }
}
