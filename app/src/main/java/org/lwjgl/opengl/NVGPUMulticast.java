package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVGPUMulticast.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVGPUMulticast.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVGPUMulticast.class */
public class NVGPUMulticast {
    public static final int GL_PER_GPU_STORAGE_BIT_NV = 2048;
    public static final int GL_MULTICAST_GPUS_NV = 37562;
    public static final int GL_RENDER_GPU_MASK_NV = 38232;
    public static final int GL_PER_GPU_STORAGE_NV = 38216;
    public static final int GL_MULTICAST_PROGRAMMABLE_SAMPLE_LOCATION_NV = 38217;

    protected NVGPUMulticast() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glRenderGpuMaskNV(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void nglMulticastBufferSubDataNV(int r0, int r1, long r2, long r4, long r6);

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            int r3 = r3.remaining()
            long r3 = (long) r3
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMulticastBufferSubDataNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 1
            long r3 = r3 << r4
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMulticastBufferSubDataNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMulticastBufferSubDataNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMulticastBufferSubDataNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            int r3 = r3.remaining()
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 3
            long r3 = r3 << r4
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMulticastBufferSubDataNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void glMulticastCopyBufferSubDataNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLbitfield") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLintptr") long r4, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("GLsizeiptr") long r8);

    public static native void glMulticastCopyImageSubDataNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLbitfield") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16);

    public static native void glMulticastBlitFramebufferNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLenum") int r11);

    public static native void nglMulticastFramebufferSampleLocationsfvNV(int r0, int r1, int r2, int r3, long r4);

    public static void glMulticastFramebufferSampleLocationsfvNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = 1
            int r3 = r3 >> r4
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglMulticastFramebufferSampleLocationsfvNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void glMulticastBarrierNV();

    public static native void glMulticastWaitSyncNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLbitfield") int r1);

    public static native void nglMulticastGetQueryObjectivNV(int r0, int r1, int r2, long r3);

    public static void glMulticastGetQueryObjectivNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMulticastGetQueryObjectivNV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glMulticastGetQueryObjectiNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglMulticastGetQueryObjectivNV(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglMulticastGetQueryObjectuivNV(int r0, int r1, int r2, long r3);

    public static void glMulticastGetQueryObjectuivNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMulticastGetQueryObjectuivNV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glMulticastGetQueryObjectuiNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglMulticastGetQueryObjectuivNV(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglMulticastGetQueryObjecti64vNV(int r0, int r1, int r2, long r3);

    public static void glMulticastGetQueryObjecti64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMulticastGetQueryObjecti64vNV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glMulticastGetQueryObjecti64NV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglMulticastGetQueryObjecti64vNV(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static native void nglMulticastGetQueryObjectui64vNV(int r0, int r1, int r2, long r3);

    public static void glMulticastGetQueryObjectui64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint64 *") java.nio.LongBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMulticastGetQueryObjectui64vNV(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glMulticastGetQueryObjectui64NV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglMulticastGetQueryObjectui64vNV(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r14 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("void const *") short[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastBufferSubDataNV
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 1
            long r3 = r3 << r4
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("void const *") int[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastBufferSubDataNV
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("void const *") float[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastBufferSubDataNV
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 2
            long r3 = r3 << r4
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMulticastBufferSubDataNV(@org.lwjgl.system.NativeType("GLbitfield") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("void const *") double[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastBufferSubDataNV
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            int r3 = r3.length
            long r3 = java.lang.Integer.toUnsignedLong(r3)
            r4 = 3
            long r3 = r3 << r4
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMulticastFramebufferSampleLocationsfvNV(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLfloat const *") float[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastFramebufferSampleLocationsfvNV
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = 1
            int r3 = r3 >> r4
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMulticastGetQueryObjectivNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastGetQueryObjectivNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastGetQueryObjectuivNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastGetQueryObjectuivNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastGetQueryObjecti64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint64 *") long[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastGetQueryObjecti64vNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastGetQueryObjectui64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint64 *") long[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastGetQueryObjectui64vNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
