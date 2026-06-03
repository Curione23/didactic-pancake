package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL46C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL46C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL46C.class */
public class GL46C extends org.lwjgl.opengl.GL45C {
    public static final int GL_PARAMETER_BUFFER = 33006;
    public static final int GL_PARAMETER_BUFFER_BINDING = 33007;
    public static final int GL_VERTICES_SUBMITTED = 33518;
    public static final int GL_PRIMITIVES_SUBMITTED = 33519;
    public static final int GL_VERTEX_SHADER_INVOCATIONS = 33520;
    public static final int GL_TESS_CONTROL_SHADER_PATCHES = 33521;
    public static final int GL_TESS_EVALUATION_SHADER_INVOCATIONS = 33522;
    public static final int GL_GEOMETRY_SHADER_PRIMITIVES_EMITTED = 33523;
    public static final int GL_FRAGMENT_SHADER_INVOCATIONS = 33524;
    public static final int GL_COMPUTE_SHADER_INVOCATIONS = 33525;
    public static final int GL_CLIPPING_INPUT_PRIMITIVES = 33526;
    public static final int GL_CLIPPING_OUTPUT_PRIMITIVES = 33527;
    public static final int GL_POLYGON_OFFSET_CLAMP = 36379;
    public static final int GL_CONTEXT_FLAG_NO_ERROR_BIT = 8;
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V = 38225;
    public static final int GL_SPIR_V_BINARY = 38226;
    public static final int GL_SPIR_V_EXTENSIONS = 38227;
    public static final int GL_NUM_SPIR_V_EXTENSIONS = 38228;
    public static final int GL_TEXTURE_MAX_ANISOTROPY = 34046;
    public static final int GL_MAX_TEXTURE_MAX_ANISOTROPY = 34047;
    public static final int GL_TRANSFORM_FEEDBACK_OVERFLOW = 33516;
    public static final int GL_TRANSFORM_FEEDBACK_STREAM_OVERFLOW = 33517;

    protected GL46C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglMultiDrawArraysIndirectCount(int r0, long r1, long r3, int r5, int r6);

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r9
            r1 = r12
            r2 = r13
            if (r2 != 0) goto L13
            r2 = 16
            goto L15
        L13:
            r2 = r13
        L15:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r8
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = r12
            r4 = r13
            nglMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") long r9, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            nglMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            r1 = r12
            r2 = r13
            if (r2 != 0) goto L13
            r2 = 16
            goto L15
        L13:
            r2 = r13
        L15:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r8
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = r12
            r4 = r13
            nglMultiDrawArraysIndirectCount(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglMultiDrawElementsIndirectCount(int r0, int r1, long r2, long r4, int r6, int r7);

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            r1 = r14
            r2 = r15
            if (r2 != 0) goto L13
            r2 = 20
            goto L15
        L13:
            r2 = r15
        L15:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r14
            r5 = r15
            nglMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            r5 = r16
            nglMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            r1 = r14
            r2 = r15
            if (r2 != 0) goto L13
            r2 = 20
            goto L15
        L13:
            r2 = r15
        L15:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r14
            r5 = r15
            nglMultiDrawElementsIndirectCount(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void glPolygonOffsetClamp(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void nglSpecializeShader(int r0, long r1, int r3, long r4, long r6);

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            r1 = r11
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L12:
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglSpecializeShader(r0, r1, r2, r3, r4)
            return
    }

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            r1 = r11
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Le:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L45
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L45
            r15 = r0
            r0 = r9
            r1 = r15
            r2 = r11
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)     // Catch: java.lang.Throwable -> L45
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L45
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)     // Catch: java.lang.Throwable -> L45
            nglSpecializeShader(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L45
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L51
        L45:
            r17 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            throw r0
        L51:
            return
    }

    public static void glMultiDrawArraysIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") int[] r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiDrawArraysIndirectCount
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r13
            r2 = r14
            if (r2 != 0) goto L21
            r2 = 16
            goto L23
        L21:
            r2 = r14
        L23:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L29:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCount(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") int[] r12, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiDrawElementsIndirectCount
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r15
            r2 = r16
            if (r2 != 0) goto L21
            r2 = 20
            goto L23
        L21:
            r2 = r16
        L23:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L29:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSpecializeShader
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L20
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            r1 = r11
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L20:
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glSpecializeShader(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSpecializeShader
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1c:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4f
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4f
            r17 = r0
            r0 = r9
            r1 = r17
            r2 = r11
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)     // Catch: java.lang.Throwable -> L4f
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4f
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            goto L5b
        L4f:
            r19 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            throw r0
        L5b:
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
