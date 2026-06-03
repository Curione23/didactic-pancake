package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIVideoSync.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIVideoSync.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIVideoSync.class */
public class GLXSGIVideoSync {
    protected GLXSGIVideoSync() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nglXGetVideoSyncSGI(long r5) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetVideoSyncSGI
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glXGetVideoSyncSGI(@org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            int r0 = nglXGetVideoSyncSGI(r0)
            return r0
    }

    public static int nglXWaitVideoSyncSGI(int r7, int r8, long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXWaitVideoSyncSGI
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glXWaitVideoSyncSGI(int r5, int r6, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nglXWaitVideoSyncSGI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glXGetVideoSyncSGI(@org.lwjgl.system.NativeType("unsigned int *") int[] r4) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetVideoSyncSGI
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glXWaitVideoSyncSGI(int r6, int r7, @org.lwjgl.system.NativeType("unsigned int *") int[] r8) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXWaitVideoSyncSGI
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3)
            return r0
    }
}
