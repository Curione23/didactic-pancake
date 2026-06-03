package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RTCStatsReport.class */
public class RTCStatsReport {
    private final long timestampUs;
    private final java.util.Map<java.lang.String, org.webrtc.RTCStats> stats;

    public RTCStatsReport(long r5, java.util.Map<java.lang.String, org.webrtc.RTCStats> r7) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.timestampUs = r1
            r0 = r4
            r1 = r7
            r0.stats = r1
            return
    }

    public double getTimestampUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.timestampUs
            double r0 = (double) r0
            return r0
    }

    public java.util.Map<java.lang.String, org.webrtc.RTCStats> getStatsMap() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, org.webrtc.RTCStats> r0 = r0.stats
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "{ timestampUs: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            long r1 = r1.timestampUs
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", stats: [\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, org.webrtc.RTCStats> r0 = r0.stats
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L2c:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L57
            r0 = r7
            java.lang.Object r0 = r0.next()
            org.webrtc.RTCStats r0 = (org.webrtc.RTCStats) r0
            r8 = r0
            r0 = r6
            if (r0 != 0) goto L4b
            r0 = r5
            java.lang.String r1 = ",\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        L4b:
            r0 = r5
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r6 = r0
            goto L2c
        L57:
            r0 = r5
            java.lang.String r1 = " ] }"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.webrtc.CalledByNative
    private static org.webrtc.RTCStatsReport create(long r6, java.util.Map r8) {
            org.webrtc.RTCStatsReport r0 = new org.webrtc.RTCStatsReport
            r1 = r0
            r2 = r6
            r3 = r8
            r1.<init>(r2, r3)
            return r0
    }
}
