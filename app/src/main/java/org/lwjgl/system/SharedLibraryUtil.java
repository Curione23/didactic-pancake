package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibraryUtil.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibraryUtil.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibraryUtil.class */
public final class SharedLibraryUtil {
    public SharedLibraryUtil() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    private static native int getLibraryPath(long r0, long r2, int r4);

    @javax.annotation.Nullable
    public static java.lang.String getLibraryPath(long r6) {
            r0 = 256(0x100, float:3.59E-43)
            r8 = r0
            r0 = r8
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memAlloc(r0)
            r9 = r0
        L9:
            r0 = r6
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L49
            r2 = r8
            int r0 = getLibraryPath(r0, r1, r2)     // Catch: java.lang.Throwable -> L49
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L23
            r0 = 0
            r11 = r0
            r0 = r9
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r11
            return r0
        L23:
            r0 = r10
            r1 = r8
            if (r0 >= r1) goto L3a
            r0 = r9
            r1 = r10
            r2 = 1
            int r1 = r1 - r2
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8(r0, r1)     // Catch: java.lang.Throwable -> L49
            r11 = r0
            r0 = r9
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r11
            return r0
        L3a:
            r0 = r9
            r1 = r8
            r2 = 3
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 / r2
            r2 = r1
            r8 = r2
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memRealloc(r0, r1)     // Catch: java.lang.Throwable -> L49
            r9 = r0
            goto L9
        L49:
            r12 = move-exception
            r0 = r9
            org.lwjgl.system.MemoryUtil.memFree(r0)
            r0 = r12
            throw r0
    }
}
