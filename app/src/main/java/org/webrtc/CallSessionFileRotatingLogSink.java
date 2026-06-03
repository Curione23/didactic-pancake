package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/CallSessionFileRotatingLogSink.class */
public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    public static byte[] getLogData(java.lang.String r4) {
            r0 = r4
            if (r0 != 0) goto Le
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "dirPath may not be null."
            r1.<init>(r2)
            throw r0
        Le:
            r0 = r4
            byte[] r0 = nativeGetLogData(r0)
            return r0
    }

    public CallSessionFileRotatingLogSink(java.lang.String r6, int r7, org.webrtc.Logging.Severity r8) {
            r5 = this;
            r0 = r5
            r0.<init>()
            r0 = r6
            if (r0 != 0) goto L12
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "dirPath may not be null."
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            int r3 = r3.ordinal()
            long r1 = nativeAddSink(r1, r2, r3)
            r0.nativeSink = r1
            return
    }

    public void dispose() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeSink
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L15
            r0 = r5
            long r0 = r0.nativeSink
            nativeDeleteSink(r0)
            r0 = r5
            r1 = 0
            r0.nativeSink = r1
        L15:
            return
    }

    private static native long nativeAddSink(java.lang.String r0, int r1, int r2);

    private static native void nativeDeleteSink(long r0);

    private static native byte[] nativeGetLogData(java.lang.String r0);
}
