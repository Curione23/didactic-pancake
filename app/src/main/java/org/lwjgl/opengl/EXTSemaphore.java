package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTSemaphore.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTSemaphore.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTSemaphore.class */
public class EXTSemaphore {
    public static final int GL_NUM_DEVICE_UUIDS_EXT = 38294;
    public static final int GL_DEVICE_UUID_EXT = 38295;
    public static final int GL_DRIVER_UUID_EXT = 38296;
    public static final int GL_UUID_SIZE_EXT = 16;
    public static final int GL_LAYOUT_GENERAL_EXT = 38285;
    public static final int GL_LAYOUT_COLOR_ATTACHMENT_EXT = 38286;
    public static final int GL_LAYOUT_DEPTH_STENCIL_ATTACHMENT_EXT = 38287;
    public static final int GL_LAYOUT_DEPTH_STENCIL_READ_ONLY_EXT = 38288;
    public static final int GL_LAYOUT_SHADER_READ_ONLY_EXT = 38289;
    public static final int GL_LAYOUT_TRANSFER_SRC_EXT = 38290;
    public static final int GL_LAYOUT_TRANSFER_DST_EXT = 38291;
    public static final int GL_LAYOUT_DEPTH_READ_ONLY_STENCIL_ATTACHMENT_EXT = 38192;
    public static final int GL_LAYOUT_DEPTH_ATTACHMENT_STENCIL_READ_ONLY_EXT = 38193;

    protected EXTSemaphore() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglGetUnsignedBytevEXT(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.EXTMemoryObject.nglGetUnsignedBytevEXT(r0, r1)
            return
    }

    public static void glGetUnsignedBytevEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLubyte *") java.nio.ByteBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.EXTMemoryObject.glGetUnsignedBytevEXT(r0, r1)
            return
    }

    public static void nglGetUnsignedBytei_vEXT(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.EXTMemoryObject.nglGetUnsignedBytei_vEXT(r0, r1, r2)
            return
    }

    public static void glGetUnsignedBytei_vEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLubyte *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.EXTMemoryObject.glGetUnsignedBytei_vEXT(r0, r1, r2)
            return
    }

    public static native void nglGenSemaphoresEXT(int r0, long r1);

    public static void glGenSemaphoresEXT(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGenSemaphoresEXT(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenSemaphoresEXT() {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r4 = r0
            r0 = r4
            int r0 = r0.getPointer()
            r5 = r0
            r0 = r4
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L24
            r6 = r0
            r0 = 1
            r1 = r6
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L24
            nglGenSemaphoresEXT(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L24
            r7 = r0
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r7
            return r0
        L24:
            r8 = move-exception
            r0 = r4
            r1 = r5
            r0.setPointer(r1)
            r0 = r8
            throw r0
    }

    public static native void nglDeleteSemaphoresEXT(int r0, long r1);

    public static void glDeleteSemaphoresEXT(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteSemaphoresEXT(r0, r1)
            return
    }

    public static void glDeleteSemaphoresEXT(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = r4
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L1f
            r7 = r0
            r0 = 1
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L1f
            nglDeleteSemaphoresEXT(r0, r1)     // Catch: java.lang.Throwable -> L1f
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            goto L29
        L1f:
            r8 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            throw r0
        L29:
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsSemaphoreEXT(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglSemaphoreParameterui64vEXT(int r0, int r1, long r2);

    public static void glSemaphoreParameterui64vEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r7) {
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
            nglSemaphoreParameterui64vEXT(r0, r1, r2)
            return
    }

    public static void glSemaphoreParameterui64EXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") long r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = r7
            java.nio.LongBuffer r0 = r0.longs(r1)     // Catch: java.lang.Throwable -> L28
            r11 = r0
            r0 = r5
            r1 = r6
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L28
            nglSemaphoreParameterui64vEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L28
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            goto L34
        L28:
            r12 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L34:
            return
    }

    public static native void nglGetSemaphoreParameterui64vEXT(int r0, int r1, long r2);

    public static void glGetSemaphoreParameterui64vEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint64 *") java.nio.LongBuffer r7) {
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
            nglGetSemaphoreParameterui64vEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetSemaphoreParameterui64EXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetSemaphoreParameterui64vEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r12 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r12
            throw r0
    }

    public static native void nglWaitSemaphoreEXT(int r0, int r1, long r2, int r4, long r5, long r7);

    public static void glWaitSemaphoreEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r10
            r1 = r11
            int r1 = r1.remaining()
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglWaitSemaphoreEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglSignalSemaphoreEXT(int r0, int r1, long r2, int r4, long r5, long r7);

    public static void glSignalSemaphoreEXT(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r10
            r1 = r11
            int r1 = r1.remaining()
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            int r3 = r3.remaining()
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            nglSignalSemaphoreEXT(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGenSemaphoresEXT(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGenSemaphoresEXT
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glDeleteSemaphoresEXT(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteSemaphoresEXT
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glSemaphoreParameterui64vEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSemaphoreParameterui64vEXT
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
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetSemaphoreParameterui64vEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint64 *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetSemaphoreParameterui64vEXT
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
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glWaitSemaphoreEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint const *") int[] r10, @org.lwjgl.system.NativeType("GLuint const *") int[] r11, @org.lwjgl.system.NativeType("GLenum const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWaitSemaphoreEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r9
            r1 = r10
            int r1 = r1.length
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = r11
            r5 = r12
            r6 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glSignalSemaphoreEXT(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint const *") int[] r10, @org.lwjgl.system.NativeType("GLuint const *") int[] r11, @org.lwjgl.system.NativeType("GLenum const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSignalSemaphoreEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r9
            r1 = r10
            int r1 = r1.length
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = r11
            r5 = r12
            r6 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
