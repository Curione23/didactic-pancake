package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVXGpuMulticast2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVXGpuMulticast2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVXGpuMulticast2.class */
public class NVXGpuMulticast2 {
    protected NVXGpuMulticast2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native int nglAsyncCopyImageSubDataNVX(int r0, long r1, long r3, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23, long r25);

    @org.lwjgl.system.NativeType("GLuint")
    public static int glAsyncCopyImageSubDataNVX(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r28, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r29, @org.lwjgl.system.NativeType("GLuint") int r30, @org.lwjgl.system.NativeType("GLbitfield") int r31, @org.lwjgl.system.NativeType("GLuint") int r32, @org.lwjgl.system.NativeType("GLenum") int r33, @org.lwjgl.system.NativeType("GLint") int r34, @org.lwjgl.system.NativeType("GLint") int r35, @org.lwjgl.system.NativeType("GLint") int r36, @org.lwjgl.system.NativeType("GLint") int r37, @org.lwjgl.system.NativeType("GLuint") int r38, @org.lwjgl.system.NativeType("GLenum") int r39, @org.lwjgl.system.NativeType("GLint") int r40, @org.lwjgl.system.NativeType("GLint") int r41, @org.lwjgl.system.NativeType("GLint") int r42, @org.lwjgl.system.NativeType("GLint") int r43, @org.lwjgl.system.NativeType("GLsizei") int r44, @org.lwjgl.system.NativeType("GLsizei") int r45, @org.lwjgl.system.NativeType("GLsizei") int r46, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r47, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r48) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r29
            r1 = r28
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r48
            r1 = r47
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r28
            int r0 = r0.remaining()
            r1 = r28
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r29
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r30
            r4 = r31
            r5 = r32
            r6 = r33
            r7 = r34
            r8 = r35
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            r19 = r46
            r20 = r47
            int r20 = r20.remaining()
            r21 = r47
            long r21 = org.lwjgl.system.MemoryUtil.memAddress(r21)
            r22 = r48
            long r22 = org.lwjgl.system.MemoryUtil.memAddress(r22)
            int r0 = nglAsyncCopyImageSubDataNVX(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r0
    }

    public static native long nglAsyncCopyBufferSubDataNVX(int r0, long r1, long r3, int r5, int r6, int r7, int r8, long r9, long r11, long r13, int r15, long r16, long r18);

    @org.lwjgl.system.NativeType("GLsync")
    public static long glAsyncCopyBufferSubDataNVX(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r21, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r22, @org.lwjgl.system.NativeType("GLuint") int r23, @org.lwjgl.system.NativeType("GLbitfield") int r24, @org.lwjgl.system.NativeType("GLuint") int r25, @org.lwjgl.system.NativeType("GLuint") int r26, @org.lwjgl.system.NativeType("GLintptr") long r27, @org.lwjgl.system.NativeType("GLintptr") long r29, @org.lwjgl.system.NativeType("GLsizeiptr") long r31, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r33, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r34) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r22
            r1 = r21
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r34
            r1 = r33
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r21
            int r0 = r0.remaining()
            r1 = r21
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r22
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            r7 = r27
            r8 = r29
            r9 = r31
            r10 = r33
            int r10 = r10.remaining()
            r11 = r33
            long r11 = org.lwjgl.system.MemoryUtil.memAddress(r11)
            r12 = r34
            long r12 = org.lwjgl.system.MemoryUtil.memAddress(r12)
            long r0 = nglAsyncCopyBufferSubDataNVX(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
    }

    public static native void glUploadGpuMaskNVX(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void nglMulticastViewportArrayvNVX(int r0, int r1, int r2, long r3);

    public static void glMulticastViewportArrayvNVX(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMulticastViewportArrayvNVX(r0, r1, r2, r3)
            return
    }

    public static native void nglMulticastScissorArrayvNVX(int r0, int r1, int r2, long r3);

    public static void glMulticastScissorArrayvNVX(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMulticastScissorArrayvNVX(r0, r1, r2, r3)
            return
    }

    public static native void glMulticastViewportPositionWScaleNVX(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    @org.lwjgl.system.NativeType("GLuint")
    public static int glAsyncCopyImageSubDataNVX(@org.lwjgl.system.NativeType("GLuint const *") int[] r26, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r27, @org.lwjgl.system.NativeType("GLuint") int r28, @org.lwjgl.system.NativeType("GLbitfield") int r29, @org.lwjgl.system.NativeType("GLuint") int r30, @org.lwjgl.system.NativeType("GLenum") int r31, @org.lwjgl.system.NativeType("GLint") int r32, @org.lwjgl.system.NativeType("GLint") int r33, @org.lwjgl.system.NativeType("GLint") int r34, @org.lwjgl.system.NativeType("GLint") int r35, @org.lwjgl.system.NativeType("GLuint") int r36, @org.lwjgl.system.NativeType("GLenum") int r37, @org.lwjgl.system.NativeType("GLint") int r38, @org.lwjgl.system.NativeType("GLint") int r39, @org.lwjgl.system.NativeType("GLint") int r40, @org.lwjgl.system.NativeType("GLint") int r41, @org.lwjgl.system.NativeType("GLsizei") int r42, @org.lwjgl.system.NativeType("GLsizei") int r43, @org.lwjgl.system.NativeType("GLsizei") int r44, @org.lwjgl.system.NativeType("GLuint const *") int[] r45, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r46) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glAsyncCopyImageSubDataNVX
            r47 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r47
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r27
            r1 = r26
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r46
            r1 = r45
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r26
            int r0 = r0.length
            r1 = r26
            r2 = r27
            r3 = r28
            r4 = r29
            r5 = r30
            r6 = r31
            r7 = r32
            r8 = r33
            r9 = r34
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r16 = r41
            r17 = r42
            r18 = r43
            r19 = r44
            r20 = r45
            int r20 = r20.length
            r21 = r45
            r22 = r46
            r23 = r47
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r0
    }

    @org.lwjgl.system.NativeType("GLsync")
    public static long glAsyncCopyBufferSubDataNVX(@org.lwjgl.system.NativeType("GLuint const *") int[] r19, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r20, @org.lwjgl.system.NativeType("GLuint") int r21, @org.lwjgl.system.NativeType("GLbitfield") int r22, @org.lwjgl.system.NativeType("GLuint") int r23, @org.lwjgl.system.NativeType("GLuint") int r24, @org.lwjgl.system.NativeType("GLintptr") long r25, @org.lwjgl.system.NativeType("GLintptr") long r27, @org.lwjgl.system.NativeType("GLsizeiptr") long r29, @org.lwjgl.system.NativeType("GLuint const *") int[] r31, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r32) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glAsyncCopyBufferSubDataNVX
            r33 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L22
            r0 = r33
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r20
            r1 = r19
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r32
            r1 = r31
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L22:
            r0 = r19
            int r0 = r0.length
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r8 = r27
            r9 = r29
            r10 = r31
            int r10 = r10.length
            r11 = r31
            r12 = r32
            r13 = r33
            long r0 = org.lwjgl.system.JNI.callPPPPPPPP(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
    }

    public static void glMulticastViewportArrayvNVX(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastViewportArrayvNVX
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
            r3 = 2
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMulticastScissorArrayvNVX(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMulticastScissorArrayvNVX
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
            r3 = 2
            int r2 = r2 >> r3
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
