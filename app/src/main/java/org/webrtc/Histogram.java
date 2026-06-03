package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Histogram.class */
class Histogram {
    private final long handle;

    private Histogram(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.handle = r1
            return
    }

    public static org.webrtc.Histogram createCounts(java.lang.String r7, int r8, int r9, int r10) {
            org.webrtc.Histogram r0 = new org.webrtc.Histogram
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            long r2 = nativeCreateCounts(r2, r3, r4, r5)
            r1.<init>(r2)
            return r0
    }

    public static org.webrtc.Histogram createEnumeration(java.lang.String r5, int r6) {
            org.webrtc.Histogram r0 = new org.webrtc.Histogram
            r1 = r0
            r2 = r5
            r3 = r6
            long r2 = nativeCreateEnumeration(r2, r3)
            r1.<init>(r2)
            return r0
    }

    public void addSample(int r5) {
            r4 = this;
            r0 = r4
            long r0 = r0.handle
            r1 = r5
            nativeAddSample(r0, r1)
            return
    }

    private static native long nativeCreateCounts(java.lang.String r0, int r1, int r2, int r3);

    private static native long nativeCreateEnumeration(java.lang.String r0, int r1);

    private static native void nativeAddSample(long r0, int r2);
}
