package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Metrics.class */
public class Metrics {
    private static final java.lang.String TAG = "Metrics";
    public final java.util.Map<java.lang.String, org.webrtc.Metrics.HistogramInfo> map;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Metrics$HistogramInfo.class */
    public static class HistogramInfo {
        public final int min;
        public final int max;
        public final int bucketCount;
        public final java.util.Map<java.lang.Integer, java.lang.Integer> samples;

        @org.webrtc.CalledByNative("HistogramInfo")
        public HistogramInfo(int r5, int r6, int r7) {
                r4 = this;
                r0 = r4
                r0.<init>()
                r0 = r4
                java.util.HashMap r1 = new java.util.HashMap
                r2 = r1
                r2.<init>()
                r0.samples = r1
                r0 = r4
                r1 = r5
                r0.min = r1
                r0 = r4
                r1 = r6
                r0.max = r1
                r0 = r4
                r1 = r7
                r0.bucketCount = r1
                return
        }

        @org.webrtc.CalledByNative("HistogramInfo")
        public void addSample(int r5, int r6) {
                r4 = this;
                r0 = r4
                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r0.samples
                r1 = r5
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = r6
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r0 = r0.put(r1, r2)
                return
        }
    }

    @org.webrtc.CalledByNative
    Metrics() {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            java.util.HashMap r1 = new java.util.HashMap
            r2 = r1
            r2.<init>()
            r0.map = r1
            return
    }

    @org.webrtc.CalledByNative
    private void add(java.lang.String r5, org.webrtc.Metrics.HistogramInfo r6) {
            r4 = this;
            r0 = r4
            java.util.Map<java.lang.String, org.webrtc.Metrics$HistogramInfo> r0 = r0.map
            r1 = r5
            r2 = r6
            java.lang.Object r0 = r0.put(r1, r2)
            return
    }

    public static void enable() {
            nativeEnable()
            return
    }

    public static org.webrtc.Metrics getAndReset() {
            org.webrtc.Metrics r0 = nativeGetAndReset()
            return r0
    }

    private static native void nativeEnable();

    private static native org.webrtc.Metrics nativeGetAndReset();
}
