package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessTexture.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessTexture.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessTexture.class */
public class NVBindlessTexture {
    protected NVBindlessTexture() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLuint64")
    public static native long glGetTextureHandleNV(@org.lwjgl.system.NativeType("GLuint") int r0);

    @org.lwjgl.system.NativeType("GLuint64")
    public static native long glGetTextureSamplerHandleNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glMakeTextureHandleResidentNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static native void glMakeTextureHandleNonResidentNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    @org.lwjgl.system.NativeType("GLuint64")
    public static native long glGetImageHandleNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLboolean") boolean r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4);

    public static native void glMakeImageHandleResidentNV(@org.lwjgl.system.NativeType("GLuint64") long r0, @org.lwjgl.system.NativeType("GLenum") int r2);

    public static native void glMakeImageHandleNonResidentNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static native void glUniformHandleui64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1);

    public static native void nglUniformHandleui64vNV(int r0, int r1, long r2);

    public static void glUniformHandleui64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniformHandleui64vNV(r0, r1, r2)
            return
    }

    public static native void glProgramUniformHandleui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64") long r2);

    public static native void nglProgramUniformHandleui64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniformHandleui64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniformHandleui64vNV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsTextureHandleResidentNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsImageHandleResidentNV(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static void glUniformHandleui64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformHandleui64vNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformHandleui64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformHandleui64vNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = r2.length
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
