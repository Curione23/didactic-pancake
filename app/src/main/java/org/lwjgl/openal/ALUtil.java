package org.lwjgl.openal;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/openal/ALUtil.class */
public final class ALUtil {
    private ALUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @javax.annotation.Nullable
    public static java.util.List<java.lang.String> getStringList(long r5, int r7) {
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.openal.ALC10.nalcGetString(r0, r1)
            r8 = r0
            r0 = r8
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = r8
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBuffer(r0, r1)
            r10 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r11 = r0
            r0 = 0
            r12 = r0
        L22:
            r0 = r10
            byte r0 = r0.get()
            if (r0 != 0) goto L22
            r0 = r10
            int r0 = r0.position()
            r1 = 1
            int r0 = r0 - r1
            r13 = r0
            r0 = r13
            r1 = r12
            if (r0 != r1) goto L3d
            goto L5b
        L3d:
            r0 = r11
            r1 = r10
            r2 = r13
            r3 = r12
            int r2 = r2 - r3
            r3 = r12
            java.lang.String r1 = org.lwjgl.system.MemoryUtil.memUTF8(r1, r2, r3)
            boolean r0 = r0.add(r1)
            r0 = r10
            int r0 = r0.position()
            r12 = r0
            goto L22
        L5b:
            r0 = r11
            return r0
    }
}
