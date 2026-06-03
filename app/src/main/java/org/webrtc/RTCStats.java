package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/RTCStats.class */
public class RTCStats {
    private final long timestampUs;
    private final java.lang.String type;
    private final java.lang.String id;
    private final java.util.Map<java.lang.String, java.lang.Object> members;

    public RTCStats(long r5, java.lang.String r7, java.lang.String r8, java.util.Map<java.lang.String, java.lang.Object> r9) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = r5
            r0.timestampUs = r1
            r0 = r4
            r1 = r7
            r0.type = r1
            r0 = r4
            r1 = r8
            r0.id = r1
            r0 = r4
            r1 = r9
            r0.members = r1
            return
    }

    public double getTimestampUs() {
            r3 = this;
            r0 = r3
            long r0 = r0.timestampUs
            double r0 = (double) r0
            return r0
    }

    public java.lang.String getType() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.type
            return r0
    }

    public java.lang.String getId() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.id
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getMembers() {
            r2 = this;
            r0 = r2
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.members
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
            java.lang.String r1 = ", type: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.type
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", id: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.String r1 = r1.id
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r6 = r0
            r0 = r4
            java.util.Map<java.lang.String, java.lang.Object> r0 = r0.members
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
        L3f:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L7a
            r0 = r7
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r8 = r0
            r0 = r5
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            r1 = r8
            java.lang.Object r1 = r1.getValue()
            appendValue(r0, r1)
            goto L3f
        L7a:
            r0 = r5
            java.lang.String r1 = " }"
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r5
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static void appendValue(java.lang.StringBuilder r4, java.lang.Object r5) {
            r0 = r5
            boolean r0 = r0 instanceof java.lang.Object[]
            if (r0 == 0) goto L3d
            r0 = r5
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6 = r0
            r0 = r4
            r1 = 91
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 0
            r7 = r0
        L15:
            r0 = r7
            r1 = r6
            int r1 = r1.length
            if (r0 >= r1) goto L33
            r0 = r7
            if (r0 == 0) goto L26
            r0 = r4
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
        L26:
            r0 = r4
            r1 = r6
            r2 = r7
            r1 = r1[r2]
            appendValue(r0, r1)
            int r7 = r7 + 1
            goto L15
        L33:
            r0 = r4
            r1 = 93
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L5d
        L3d:
            r0 = r5
            boolean r0 = r0 instanceof java.lang.String
            if (r0 == 0) goto L57
            r0 = r4
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 34
            java.lang.StringBuilder r0 = r0.append(r1)
            goto L5d
        L57:
            r0 = r4
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
        L5d:
            return
    }

    @org.webrtc.CalledByNative
    static org.webrtc.RTCStats create(long r8, java.lang.String r10, java.lang.String r11, java.util.Map r12) {
            org.webrtc.RTCStats r0 = new org.webrtc.RTCStats
            r1 = r0
            r2 = r8
            r3 = r10
            r4 = r11
            r5 = r12
            r1.<init>(r2, r3, r4, r5)
            return r0
    }
}
