package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVVertexArrayRange.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVVertexArrayRange.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVVertexArrayRange.class */
public class WGLNVVertexArrayRange {
    protected WGLNVVertexArrayRange() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nwglAllocateMemoryNV(int r7, float r8, float r9, float r10) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglAllocateMemoryNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r0 = org.lwjgl.system.JNI.callP(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer wglAllocateMemoryNV(@org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLfloat") float r6, @org.lwjgl.system.NativeType("GLfloat") float r7, @org.lwjgl.system.NativeType("GLfloat") float r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            long r0 = nwglAllocateMemoryNV(r0, r1, r2, r3)
            r9 = r0
            r0 = r9
            r1 = r5
            java.nio.ByteBuffer r0 = org.lwjgl.system.MemoryUtil.memByteBufferSafe(r0, r1)
            return r0
    }

    public static void nwglFreeMemoryNV(long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglFreeMemoryNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            r1 = r7
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void wglFreeMemoryNV(@org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r3) {
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nwglFreeMemoryNV(r0)
            return
    }
}
