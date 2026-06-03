package android.util;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/ContainerHelpers.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:android/util/ContainerHelpers.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:android/util/ContainerHelpers.class */
class ContainerHelpers {
    ContainerHelpers() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static int binarySearch(int[] r3, int r4, int r5) {
            r0 = 0
            r6 = r0
            r0 = r4
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
        L7:
            r0 = r6
            r1 = r7
            if (r0 > r1) goto L3e
            r0 = r6
            r1 = r7
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 >>> r1
            r8 = r0
            r0 = r3
            r1 = r8
            r0 = r0[r1]
            r9 = r0
            r0 = r9
            r1 = r5
            if (r0 >= r1) goto L29
            r0 = r8
            r1 = 1
            int r0 = r0 + r1
            r6 = r0
            goto L3b
        L29:
            r0 = r9
            r1 = r5
            if (r0 <= r1) goto L38
            r0 = r8
            r1 = 1
            int r0 = r0 - r1
            r7 = r0
            goto L3b
        L38:
            r0 = r8
            return r0
        L3b:
            goto L7
        L3e:
            r0 = r6
            r1 = -1
            r0 = r0 ^ r1
            return r0
    }

    static int binarySearch(long[] r5, int r6, long r7) {
            r0 = 0
            r9 = r0
            r0 = r6
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
        L8:
            r0 = r9
            r1 = r10
            if (r0 > r1) goto L44
            r0 = r9
            r1 = r10
            int r0 = r0 + r1
            r1 = 1
            int r0 = r0 >>> r1
            r11 = r0
            r0 = r5
            r1 = r11
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L2e
            r0 = r11
            r1 = 1
            int r0 = r0 + r1
            r9 = r0
            goto L41
        L2e:
            r0 = r12
            r1 = r7
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3e
            r0 = r11
            r1 = 1
            int r0 = r0 - r1
            r10 = r0
            goto L41
        L3e:
            r0 = r11
            return r0
        L41:
            goto L8
        L44:
            r0 = r9
            r1 = -1
            r0 = r0 ^ r1
            return r0
    }
}
