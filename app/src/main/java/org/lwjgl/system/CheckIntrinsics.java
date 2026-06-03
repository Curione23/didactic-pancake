package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/CheckIntrinsics.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/CheckIntrinsics.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/CheckIntrinsics.class */
public final class CheckIntrinsics {
    private CheckIntrinsics() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static int checkIndex(int r3, int r4) {
            r0 = r3
            if (r0 < 0) goto L9
            r0 = r4
            r1 = r3
            if (r0 > r1) goto L11
        L9:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            r1.<init>()
            throw r0
        L11:
            r0 = r3
            return r0
    }

    public static int checkFromToIndex(int r3, int r4, int r5) {
            r0 = r3
            if (r0 < 0) goto Le
            r0 = r4
            r1 = r3
            if (r0 < r1) goto Le
            r0 = r5
            r1 = r4
            if (r0 >= r1) goto L16
        Le:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            r1.<init>()
            throw r0
        L16:
            r0 = r3
            return r0
    }

    public static int checkFromIndexSize(int r3, int r4, int r5) {
            r0 = r5
            r1 = r3
            r0 = r0 | r1
            r1 = r4
            r0 = r0 | r1
            if (r0 < 0) goto Lf
            r0 = r5
            r1 = r3
            int r0 = r0 - r1
            r1 = r4
            if (r0 >= r1) goto L17
        Lf:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            r1 = r0
            r1.<init>()
            throw r0
        L17:
            r0 = r3
            return r0
    }
}
