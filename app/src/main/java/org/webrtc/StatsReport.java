package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/StatsReport.class */
public class StatsReport {
    public final java.lang.String id;
    public final java.lang.String type;
    public final double timestamp;
    public final org.webrtc.StatsReport.Value[] values;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/StatsReport$Value.class */
    public static class Value {
        public final java.lang.String name;
        public final java.lang.String value;

        @org.webrtc.CalledByNative("Value")
        public Value(java.lang.String r4, java.lang.String r5) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.name = r1
                r0 = r3
                r1 = r5
                r0.value = r1
                return
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = r0
                r1.<init>()
                r4 = r0
                r0 = r4
                java.lang.String r1 = "["
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                java.lang.String r1 = r1.name
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = ": "
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = r3
                java.lang.String r1 = r1.value
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "]"
                java.lang.StringBuilder r0 = r0.append(r1)
                r0 = r4
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    @org.webrtc.CalledByNative
    public StatsReport(java.lang.String r5, java.lang.String r6, double r7, org.webrtc.StatsReport.Value[] r9) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.id = r1
            r0 = r4
            r1 = r6
            r0.type = r1
            r0 = r4
            r1 = r7
            r0.timestamp = r1
            r0 = r4
            r1 = r9
            r0.values = r1
            return
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.String r1 = "id: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.id
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", type: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.type
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", timestamp: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            double r1 = r1.timestamp
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", values: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r6 = r0
        L35:
            r0 = r6
            r1 = r4
            org.webrtc.StatsReport$Value[] r1 = r1.values
            int r1 = r1.length
            if (r0 >= r1) goto L57
            r0 = r5
            r1 = r4
            org.webrtc.StatsReport$Value[] r1 = r1.values
            r2 = r6
            r1 = r1[r2]
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            int r6 = r6 + 1
            goto L35
        L57:
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }
}
