package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/TimestampAligner.class */
public class TimestampAligner {
    private volatile long nativeTimestampAligner;

    public TimestampAligner() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            long r1 = nativeCreateTimestampAligner()
            r0.nativeTimestampAligner = r1
            return
    }

    public static long getRtcTimeNanos() {
            long r0 = nativeRtcTimeNanos()
            return r0
    }

    public long translateTimestamp(long r6) {
            r5 = this;
            r0 = r5
            r0.checkNativeAlignerExists()
            r0 = r5
            long r0 = r0.nativeTimestampAligner
            r1 = r6
            long r0 = nativeTranslateTimestamp(r0, r1)
            return r0
    }

    public void dispose() {
            r4 = this;
            r0 = r4
            r0.checkNativeAlignerExists()
            r0 = r4
            long r0 = r0.nativeTimestampAligner
            nativeReleaseTimestampAligner(r0)
            r0 = r4
            r1 = 0
            r0.nativeTimestampAligner = r1
            return
    }

    private void checkNativeAlignerExists() {
            r5 = this;
            r0 = r5
            long r0 = r0.nativeTimestampAligner
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L13
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "TimestampAligner has been disposed."
            r1.<init>(r2)
            throw r0
        L13:
            return
    }

    private static native long nativeRtcTimeNanos();

    private static native long nativeCreateTimestampAligner();

    private static native void nativeReleaseTimestampAligner(long r0);

    private static native long nativeTranslateTimestamp(long r0, long r2);
}
