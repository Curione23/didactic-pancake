package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/Size.class */
public class Size {
    public int width;
    public int height;

    public Size(int r4, int r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.width = r1
            r0 = r3
            r1 = r5
            r0.height = r1
            return
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = r3
            int r0 = r0.width
            r1 = r3
            int r1 = r1.height
            java.lang.String r0 = r0 + "x" + r1
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.Size
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r4
            org.webrtc.Size r0 = (org.webrtc.Size) r0
            r5 = r0
            r0 = r3
            int r0 = r0.width
            r1 = r5
            int r1 = r1.width
            if (r0 != r1) goto L28
            r0 = r3
            int r0 = r0.height
            r1 = r5
            int r1 = r1.height
            if (r0 != r1) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = 1
            r1 = 65537(0x10001, float:9.1837E-41)
            r2 = r4
            int r2 = r2.width
            int r1 = r1 * r2
            int r0 = r0 + r1
            r1 = r4
            int r1 = r1.height
            int r0 = r0 + r1
            return r0
    }
}
