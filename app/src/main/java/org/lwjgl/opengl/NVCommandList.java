package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVCommandList.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVCommandList.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVCommandList.class */
public class NVCommandList {
    public static final int GL_TERMINATE_SEQUENCE_COMMAND_NV = 0;
    public static final int GL_NOP_COMMAND_NV = 1;
    public static final int GL_DRAW_ELEMENTS_COMMAND_NV = 2;
    public static final int GL_DRAW_ARRAYS_COMMAND_NV = 3;
    public static final int GL_DRAW_ELEMENTS_STRIP_COMMAND_NV = 4;
    public static final int GL_DRAW_ARRAYS_STRIP_COMMAND_NV = 5;
    public static final int GL_DRAW_ELEMENTS_INSTANCED_COMMAND_NV = 6;
    public static final int GL_DRAW_ARRAYS_INSTANCED_COMMAND_NV = 7;
    public static final int GL_ELEMENT_ADDRESS_COMMAND_NV = 8;
    public static final int GL_ATTRIBUTE_ADDRESS_COMMAND_NV = 9;
    public static final int GL_UNIFORM_ADDRESS_COMMAND_NV = 10;
    public static final int GL_BLEND_COLOR_COMMAND_NV = 11;
    public static final int GL_STENCIL_REF_COMMAND_NV = 12;
    public static final int GL_LINE_WIDTH_COMMAND_NV = 13;
    public static final int GL_POLYGON_OFFSET_COMMAND_NV = 14;
    public static final int GL_ALPHA_REF_COMMAND_NV = 15;
    public static final int GL_VIEWPORT_COMMAND_NV = 16;
    public static final int GL_SCISSOR_COMMAND_NV = 17;
    public static final int GL_FRONT_FACE_COMMAND_NV = 18;

    protected NVCommandList() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglCreateStatesNV(int r0, long r1);

    public static void glCreateStatesNV(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglCreateStatesNV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateStatesNV() {
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
            nglCreateStatesNV(r0, r1)     // Catch: java.lang.Throwable -> L24
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

    public static native void nglDeleteStatesNV(int r0, long r1);

    public static void glDeleteStatesNV(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteStatesNV(r0, r1)
            return
    }

    public static void glDeleteStatesNV(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
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
            nglDeleteStatesNV(r0, r1)     // Catch: java.lang.Throwable -> L1f
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
    public static native boolean glIsStateNV(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glStateCaptureNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    @org.lwjgl.system.NativeType("GLuint")
    public static native int glGetCommandHeaderNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    @org.lwjgl.system.NativeType("GLushort")
    public static native short glGetStageIndexNV(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglDrawCommandsNV(int r0, int r1, long r2, long r4, int r6);

    public static void glDrawCommandsNV(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r10, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            int r4 = r4.remaining()
            nglDrawCommandsNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglDrawCommandsAddressNV(int r0, long r1, long r3, int r5);

    public static void glDrawCommandsAddressNV(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r8, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r8
            int r3 = r3.remaining()
            nglDrawCommandsAddressNV(r0, r1, r2, r3)
            return
    }

    public static native void nglDrawCommandsStatesNV(int r0, long r1, long r3, long r5, long r7, int r9);

    public static void glDrawCommandsStatesNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r12, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r13
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = r12
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r11
            r1 = r12
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r12
            int r5 = r5.remaining()
            nglDrawCommandsStatesNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglDrawCommandsStatesAddressNV(long r0, long r2, long r4, long r6, int r8);

    public static void glDrawCommandsStatesAddressNV(@org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r10, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r11
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r10
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r10
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            int r4 = r4.remaining()
            nglDrawCommandsStatesAddressNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglCreateCommandListsNV(int r0, long r1);

    public static void glCreateCommandListsNV(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglCreateCommandListsNV(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateCommandListsNV() {
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
            nglCreateCommandListsNV(r0, r1)     // Catch: java.lang.Throwable -> L24
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

    public static native void nglDeleteCommandListsNV(int r0, long r1);

    public static void glDeleteCommandListsNV(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglDeleteCommandListsNV(r0, r1)
            return
    }

    public static void glDeleteCommandListsNV(@org.lwjgl.system.NativeType("GLuint const *") int r4) {
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
            nglDeleteCommandListsNV(r0, r1)     // Catch: java.lang.Throwable -> L1f
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
    public static native boolean glIsCommandListNV(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void nglListDrawCommandsStatesClientNV(int r0, int r1, long r2, long r4, long r6, long r8, int r10);

    public static void glListDrawCommandsStatesClientNV(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("void const **") org.lwjgl.PointerBuffer r14, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r15
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r17
            r1 = r14
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L20:
            r0 = r12
            r1 = r13
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r16
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r17
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r14
            int r6 = r6.remaining()
            nglListDrawCommandsStatesClientNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void glCommandListSegmentsNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glCompileCommandListNV(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glCallCommandListNV(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static void glCreateStatesNV(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glCreateStatesNV
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

    public static void glDeleteStatesNV(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteStatesNV
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

    public static void glDrawCommandsNV(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("GLsizei const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawCommandsNV
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r11
            int r4 = r4.remaining()
            r5 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawCommandsAddressNV(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r8, @org.lwjgl.system.NativeType("GLsizei const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawCommandsAddressNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r8
            int r3 = r3.length
            r4 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawCommandsStatesNV(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r11, @org.lwjgl.system.NativeType("GLsizei const *") int[] r12, @org.lwjgl.system.NativeType("GLuint const *") int[] r13, @org.lwjgl.system.NativeType("GLuint const *") int[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawCommandsStatesNV
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2d
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r13
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L2d:
            r0 = r10
            r1 = r11
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r11
            int r5 = r5.remaining()
            r6 = r15
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawCommandsStatesAddressNV(@org.lwjgl.system.NativeType("GLuint64 const *") long[] r8, @org.lwjgl.system.NativeType("GLsizei const *") int[] r9, @org.lwjgl.system.NativeType("GLuint const *") int[] r10, @org.lwjgl.system.NativeType("GLuint const *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDrawCommandsStatesAddressNV
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L26
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r10
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L26:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r8
            int r4 = r4.length
            r5 = r12
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glCreateCommandListsNV(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glCreateCommandListsNV
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

    public static void glDeleteCommandListsNV(@org.lwjgl.system.NativeType("GLuint const *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glDeleteCommandListsNV
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

    public static void glListDrawCommandsStatesClientNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("void const **") org.lwjgl.PointerBuffer r13, @org.lwjgl.system.NativeType("GLsizei const *") int[] r14, @org.lwjgl.system.NativeType("GLuint const *") int[] r15, @org.lwjgl.system.NativeType("GLuint const *") int[] r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glListDrawCommandsStatesClientNV
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2e
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = r13
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = r13
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L2e:
            r0 = r11
            r1 = r12
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r13
            int r6 = r6.remaining()
            r7 = r17
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
