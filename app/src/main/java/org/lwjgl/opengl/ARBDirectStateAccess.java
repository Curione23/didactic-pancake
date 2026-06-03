package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDirectStateAccess.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDirectStateAccess.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBDirectStateAccess.class */
public class ARBDirectStateAccess {
    public static final int GL_TEXTURE_TARGET = 4102;
    public static final int GL_QUERY_TARGET = 33514;

    protected ARBDirectStateAccess() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglCreateTransformFeedbacks(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL45C.nglCreateTransformFeedbacks(r0, r1)
            return
    }

    public static void glCreateTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateTransformFeedbacks(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateTransformFeedbacks() {
            int r0 = org.lwjgl.opengl.GL45C.glCreateTransformFeedbacks()
            return r0
    }

    public static void glTransformFeedbackBufferBase(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTransformFeedbackBufferBase(r0, r1, r2)
            return
    }

    public static void glTransformFeedbackBufferRange(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizeiptr") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL45C.glTransformFeedbackBufferRange(r0, r1, r2, r3, r4)
            return
    }

    public static void nglGetTransformFeedbackiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetTransformFeedbackiv(r0, r1, r2)
            return
    }

    public static void glGetTransformFeedbackiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTransformFeedbackiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTransformFeedbacki(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetTransformFeedbacki(r0, r1)
            return r0
    }

    public static void nglGetTransformFeedbacki_v(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetTransformFeedbacki_v(r0, r1, r2, r3)
            return
    }

    public static void glGetTransformFeedbacki_v(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTransformFeedbacki_v(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTransformFeedbacki(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL45C.glGetTransformFeedbacki(r0, r1, r2)
            return r0
    }

    public static void nglGetTransformFeedbacki64_v(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetTransformFeedbacki64_v(r0, r1, r2, r3)
            return
    }

    public static void glGetTransformFeedbacki64_v(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTransformFeedbacki64_v(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetTransformFeedbacki64(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            long r0 = org.lwjgl.opengl.GL45C.glGetTransformFeedbacki64(r0, r1, r2)
            return r0
    }

    public static void nglCreateBuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL45C.nglCreateBuffers(r0, r1)
            return
    }

    public static void glCreateBuffers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateBuffers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateBuffers() {
            int r0 = org.lwjgl.opengl.GL45C.glCreateBuffers()
            return r0
    }

    public static void nglNamedBufferStorage(int r7, long r8, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            org.lwjgl.opengl.GL45C.nglNamedBufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLsizeiptr") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void nglNamedBufferData(int r7, long r8, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            org.lwjgl.opengl.GL45C.nglNamedBufferData(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLsizeiptr") long r6, @org.lwjgl.system.NativeType("GLenum") int r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void nglNamedBufferSubData(int r8, long r9, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL45C.nglNamedBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.LongBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glCopyNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizeiptr") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL45C.glCopyNamedBufferSubData(r0, r1, r2, r3, r4)
            return
    }

    public static void nglClearNamedBufferData(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL45C.nglClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void nglClearNamedBufferSubData(int r11, int r12, long r13, long r15, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            org.lwjgl.opengl.GL45C.nglClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL45C.glClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL45C.glClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL45C.glClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL45C.glClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static long nglMapNamedBuffer(int r3, int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL45C.nglMapNamedBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBuffer(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL45C.glMapNamedBuffer(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBuffer(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @javax.annotation.Nullable java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL45C.glMapNamedBuffer(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBuffer(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, long r8, @javax.annotation.Nullable java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL45C.glMapNamedBuffer(r0, r1, r2, r3)
            return r0
    }

    public static long nglMapNamedBufferRange(int r7, long r8, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            long r0 = org.lwjgl.opengl.GL45C.nglMapNamedBufferRange(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBufferRange(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLintptr") long r8, @org.lwjgl.system.NativeType("GLsizeiptr") long r10, @org.lwjgl.system.NativeType("GLbitfield") int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL45C.glMapNamedBufferRange(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("void *")
    public static java.nio.ByteBuffer glMapNamedBufferRange(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9, @org.lwjgl.system.NativeType("GLsizeiptr") long r11, @org.lwjgl.system.NativeType("GLbitfield") int r13, @javax.annotation.Nullable java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            java.nio.ByteBuffer r0 = org.lwjgl.opengl.GL45C.glMapNamedBufferRange(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glUnmapNamedBuffer(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL45C.glUnmapNamedBuffer(r0)
            return r0
    }

    public static void glFlushMappedNamedBufferRange(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLintptr") long r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL45C.glFlushMappedNamedBufferRange(r0, r1, r2)
            return
    }

    public static void nglGetNamedBufferParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetNamedBufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedBufferParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedBufferParameteri(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetNamedBufferParameteri(r0, r1)
            return r0
    }

    public static void nglGetNamedBufferParameteri64v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetNamedBufferParameteri64v(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferParameteri64v(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedBufferParameteri64v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetNamedBufferParameteri64(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL45C.glGetNamedBufferParameteri64(r0, r1)
            return r0
    }

    public static void nglGetNamedBufferPointerv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetNamedBufferPointerv(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferPointerv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void **") org.lwjgl.PointerBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedBufferPointerv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetNamedBufferPointer(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL45C.glGetNamedBufferPointer(r0, r1)
            return r0
    }

    public static void nglGetNamedBufferSubData(int r8, long r9, long r11, long r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.GL45C.nglGetNamedBufferSubData(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.LongBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void nglCreateFramebuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL45C.nglCreateFramebuffers(r0, r1)
            return
    }

    public static void glCreateFramebuffers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateFramebuffers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateFramebuffers() {
            int r0 = org.lwjgl.opengl.GL45C.glCreateFramebuffers()
            return r0
    }

    public static void glNamedFramebufferRenderbuffer(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glNamedFramebufferRenderbuffer(r0, r1, r2, r3)
            return
    }

    public static void glNamedFramebufferParameteri(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedFramebufferParameteri(r0, r1, r2)
            return
    }

    public static void glNamedFramebufferTexture(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glNamedFramebufferTexture(r0, r1, r2, r3)
            return
    }

    public static void glNamedFramebufferTextureLayer(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glNamedFramebufferTextureLayer(r0, r1, r2, r3, r4)
            return
    }

    public static void glNamedFramebufferDrawBuffer(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glNamedFramebufferDrawBuffer(r0, r1)
            return
    }

    public static void nglNamedFramebufferDrawBuffers(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglNamedFramebufferDrawBuffers(r0, r1, r2)
            return
    }

    public static void glNamedFramebufferDrawBuffers(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glNamedFramebufferDrawBuffers(r0, r1)
            return
    }

    public static void glNamedFramebufferDrawBuffers(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum const *") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glNamedFramebufferDrawBuffers(r0, r1)
            return
    }

    public static void glNamedFramebufferReadBuffer(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glNamedFramebufferReadBuffer(r0, r1)
            return
    }

    public static void nglInvalidateNamedFramebufferData(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglInvalidateNamedFramebufferData(r0, r1, r2)
            return
    }

    public static void glInvalidateNamedFramebufferData(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glInvalidateNamedFramebufferData(r0, r1)
            return
    }

    public static void glInvalidateNamedFramebufferData(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum const *") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glInvalidateNamedFramebufferData(r0, r1)
            return
    }

    public static void nglInvalidateNamedFramebufferSubData(int r9, int r10, long r11, int r13, int r14, int r15, int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.opengl.GL45C.nglInvalidateNamedFramebufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glInvalidateNamedFramebufferSubData(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glInvalidateNamedFramebufferSubData(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glInvalidateNamedFramebufferSubData(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum const *") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glInvalidateNamedFramebufferSubData(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglClearNamedFramebufferiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglClearNamedFramebufferiv(r0, r1, r2, r3)
            return
    }

    public static void glClearNamedFramebufferiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glClearNamedFramebufferiv(r0, r1, r2, r3)
            return
    }

    public static void nglClearNamedFramebufferuiv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglClearNamedFramebufferuiv(r0, r1, r2, r3)
            return
    }

    public static void glClearNamedFramebufferuiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glClearNamedFramebufferuiv(r0, r1, r2, r3)
            return
    }

    public static void nglClearNamedFramebufferfv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglClearNamedFramebufferfv(r0, r1, r2, r3)
            return
    }

    public static void glClearNamedFramebufferfv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glClearNamedFramebufferfv(r0, r1, r2, r3)
            return
    }

    public static void glClearNamedFramebufferfi(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLfloat") float r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedFramebufferfi(r0, r1, r2, r3, r4)
            return
    }

    public static void glBlitNamedFramebuffer(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLint") int r22, @org.lwjgl.system.NativeType("GLbitfield") int r23, @org.lwjgl.system.NativeType("GLenum") int r24) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            org.lwjgl.opengl.GL45C.glBlitNamedFramebuffer(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static int glCheckNamedFramebufferStatus(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glCheckNamedFramebufferStatus(r0, r1)
            return r0
    }

    public static void nglGetNamedFramebufferParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetNamedFramebufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetNamedFramebufferParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedFramebufferParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedFramebufferParameteri(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetNamedFramebufferParameteri(r0, r1)
            return r0
    }

    public static void nglGetNamedFramebufferAttachmentParameteriv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetNamedFramebufferAttachmentParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedFramebufferAttachmentParameteriv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetNamedFramebufferAttachmentParameteriv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedFramebufferAttachmentParameteri(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL45C.glGetNamedFramebufferAttachmentParameteri(r0, r1, r2)
            return r0
    }

    public static void nglCreateRenderbuffers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL45C.nglCreateRenderbuffers(r0, r1)
            return
    }

    public static void glCreateRenderbuffers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateRenderbuffers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateRenderbuffers() {
            int r0 = org.lwjgl.opengl.GL45C.glCreateRenderbuffers()
            return r0
    }

    public static void glNamedRenderbufferStorage(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glNamedRenderbufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glNamedRenderbufferStorageMultisample(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glNamedRenderbufferStorageMultisample(r0, r1, r2, r3, r4)
            return
    }

    public static void nglGetNamedRenderbufferParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetNamedRenderbufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetNamedRenderbufferParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedRenderbufferParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetNamedRenderbufferParameteri(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetNamedRenderbufferParameteri(r0, r1)
            return r0
    }

    public static void nglCreateTextures(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglCreateTextures(r0, r1, r2)
            return
    }

    public static void glCreateTextures(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glCreateTextures(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateTextures(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            int r0 = org.lwjgl.opengl.GL45C.glCreateTextures(r0)
            return r0
    }

    public static void glTextureBuffer(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureBuffer(r0, r1, r2)
            return
    }

    public static void glTextureBufferRange(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizeiptr") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            org.lwjgl.opengl.GL45C.glTextureBufferRange(r0, r1, r2, r3, r4)
            return
    }

    public static void glTextureStorage1D(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glTextureStorage1D(r0, r1, r2, r3)
            return
    }

    public static void glTextureStorage2D(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glTextureStorage2D(r0, r1, r2, r3, r4)
            return
    }

    public static void glTextureStorage3D(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glTextureStorage3D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glTextureStorage2DMultisample(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLboolean") boolean r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glTextureStorage2DMultisample(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glTextureStorage3DMultisample(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLboolean") boolean r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureStorage3DMultisample(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nglTextureSubImage1D(int r9, int r10, int r11, int r12, int r13, int r14, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL45C.nglTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLenum") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nglTextureSubImage2D(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL45C.nglTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void nglTextureSubImage3D(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.opengl.GL45C.nglTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("void const *") long r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void nglCompressedTextureSubImage1D(int r9, int r10, int r11, int r12, int r13, int r14, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL45C.nglCompressedTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("void const *") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            org.lwjgl.opengl.GL45C.glCompressedTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glCompressedTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glCompressedTextureSubImage1D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglCompressedTextureSubImage2D(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL45C.nglCompressedTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("void const *") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            org.lwjgl.opengl.GL45C.glCompressedTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glCompressedTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL45C.glCompressedTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void nglCompressedTextureSubImage3D(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.opengl.GL45C.nglCompressedTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glCompressedTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLsizei") int r22, @org.lwjgl.system.NativeType("void const *") long r23) {
            r0 = r13
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            org.lwjgl.opengl.GL45C.glCompressedTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glCompressedTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r20) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            org.lwjgl.opengl.GL45C.glCompressedTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public static void glCopyTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glCopyTextureSubImage1D(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glCopyTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL45C.glCopyTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glCopyTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glCopyTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureParameterf(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat") float r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterf(r0, r1, r2)
            return
    }

    public static void nglTextureParameterfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglTextureParameterfv(r0, r1, r2)
            return
    }

    public static void glTextureParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterfv(r0, r1, r2)
            return
    }

    public static void glTextureParameteri(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameteri(r0, r1, r2)
            return
    }

    public static void nglTextureParameterIiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglTextureParameterIiv(r0, r1, r2)
            return
    }

    public static void glTextureParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterIiv(r0, r1, r2)
            return
    }

    public static void glTextureParameterIi(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterIi(r0, r1, r2)
            return
    }

    public static void nglTextureParameterIuiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglTextureParameterIuiv(r0, r1, r2)
            return
    }

    public static void glTextureParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterIuiv(r0, r1, r2)
            return
    }

    public static void glTextureParameterIui(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterIui(r0, r1, r2)
            return
    }

    public static void nglTextureParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglTextureParameteriv(r0, r1, r2)
            return
    }

    public static void glTextureParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameteriv(r0, r1, r2)
            return
    }

    public static void glGenerateTextureMipmap(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glGenerateTextureMipmap(r0)
            return
    }

    public static void glBindTextureUnit(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glBindTextureUnit(r0, r1)
            return
    }

    public static void nglGetTextureImage(int r8, int r9, int r10, int r11, int r12, long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.opengl.GL45C.nglGetTextureImage(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("void *") long r13) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.ShortBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.FloatBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") java.nio.DoubleBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void nglGetCompressedTextureImage(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetCompressedTextureImage(r0, r1, r2, r3)
            return
    }

    public static void glGetCompressedTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.glGetCompressedTextureImage(r0, r1, r2, r3)
            return
    }

    public static void glGetCompressedTextureImage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetCompressedTextureImage(r0, r1, r2)
            return
    }

    public static void nglGetTextureLevelParameterfv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetTextureLevelParameterfv(r0, r1, r2, r3)
            return
    }

    public static void glGetTextureLevelParameterfv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTextureLevelParameterfv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTextureLevelParameterf(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            float r0 = org.lwjgl.opengl.GL45C.glGetTextureLevelParameterf(r0, r1, r2)
            return r0
    }

    public static void nglGetTextureLevelParameteriv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetTextureLevelParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glGetTextureLevelParameteriv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTextureLevelParameteriv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureLevelParameteri(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL45C.glGetTextureLevelParameteri(r0, r1, r2)
            return r0
    }

    public static void nglGetTextureParameterfv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetTextureParameterfv(r0, r1, r2)
            return
    }

    public static void glGetTextureParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameterfv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetTextureParameterf(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.opengl.GL45C.glGetTextureParameterf(r0, r1)
            return r0
    }

    public static void nglGetTextureParameterIiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetTextureParameterIiv(r0, r1, r2)
            return
    }

    public static void glGetTextureParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameterIiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureParameterIi(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetTextureParameterIi(r0, r1)
            return r0
    }

    public static void nglGetTextureParameterIuiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetTextureParameterIuiv(r0, r1, r2)
            return
    }

    public static void glGetTextureParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameterIuiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureParameterIui(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetTextureParameterIui(r0, r1)
            return r0
    }

    public static void nglGetTextureParameteriv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetTextureParameteriv(r0, r1, r2)
            return
    }

    public static void glGetTextureParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameteriv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTextureParameteri(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetTextureParameteri(r0, r1)
            return r0
    }

    public static void nglCreateVertexArrays(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL45C.nglCreateVertexArrays(r0, r1)
            return
    }

    public static void glCreateVertexArrays(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateVertexArrays(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateVertexArrays() {
            int r0 = org.lwjgl.opengl.GL45C.glCreateVertexArrays()
            return r0
    }

    public static void glDisableVertexArrayAttrib(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glDisableVertexArrayAttrib(r0, r1)
            return
    }

    public static void glEnableVertexArrayAttrib(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glEnableVertexArrayAttrib(r0, r1)
            return
    }

    public static void glVertexArrayElementBuffer(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glVertexArrayElementBuffer(r0, r1)
            return
    }

    public static void glVertexArrayVertexBuffer(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            org.lwjgl.opengl.GL45C.glVertexArrayVertexBuffer(r0, r1, r2, r3, r4)
            return
    }

    public static void nglVertexArrayVertexBuffers(int r10, int r11, int r12, long r13, long r15, long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r17
            org.lwjgl.opengl.GL45C.nglVertexArrayVertexBuffers(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexArrayVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glVertexArrayVertexBuffers(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexArrayAttribFormat(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLboolean") boolean r11, @org.lwjgl.system.NativeType("GLuint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glVertexArrayAttribFormat(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glVertexArrayAttribIFormat(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glVertexArrayAttribIFormat(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexArrayAttribLFormat(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glVertexArrayAttribLFormat(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexArrayAttribBinding(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glVertexArrayAttribBinding(r0, r1, r2)
            return
    }

    public static void glVertexArrayBindingDivisor(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glVertexArrayBindingDivisor(r0, r1, r2)
            return
    }

    public static void nglGetVertexArrayiv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglGetVertexArrayiv(r0, r1, r2)
            return
    }

    public static void glGetVertexArrayiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetVertexArrayiv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexArrayi(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.GL45C.glGetVertexArrayi(r0, r1)
            return r0
    }

    public static void nglGetVertexArrayIndexediv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetVertexArrayIndexediv(r0, r1, r2, r3)
            return
    }

    public static void glGetVertexArrayIndexediv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetVertexArrayIndexediv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexArrayIndexedi(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL45C.glGetVertexArrayIndexedi(r0, r1, r2)
            return r0
    }

    public static void nglGetVertexArrayIndexed64iv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.nglGetVertexArrayIndexed64iv(r0, r1, r2, r3)
            return
    }

    public static void glGetVertexArrayIndexed64iv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetVertexArrayIndexed64iv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexArrayIndexed64i(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            long r0 = org.lwjgl.opengl.GL45C.glGetVertexArrayIndexed64i(r0, r1, r2)
            return r0
    }

    public static void nglCreateSamplers(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL45C.nglCreateSamplers(r0, r1)
            return
    }

    public static void glCreateSamplers(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateSamplers(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateSamplers() {
            int r0 = org.lwjgl.opengl.GL45C.glCreateSamplers()
            return r0
    }

    public static void nglCreateProgramPipelines(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL45C.nglCreateProgramPipelines(r0, r1)
            return
    }

    public static void glCreateProgramPipelines(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateProgramPipelines(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateProgramPipelines() {
            int r0 = org.lwjgl.opengl.GL45C.glCreateProgramPipelines()
            return r0
    }

    public static void nglCreateQueries(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL45C.nglCreateQueries(r0, r1, r2)
            return
    }

    public static void glCreateQueries(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glCreateQueries(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glCreateQueries(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            int r0 = org.lwjgl.opengl.GL45C.glCreateQueries(r0)
            return r0
    }

    public static void glGetQueryBufferObjecti64v(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.glGetQueryBufferObjecti64v(r0, r1, r2, r3)
            return
    }

    public static void glGetQueryBufferObjectiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.glGetQueryBufferObjectiv(r0, r1, r2, r3)
            return
    }

    public static void glGetQueryBufferObjectui64v(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.glGetQueryBufferObjectui64v(r0, r1, r2, r3)
            return
    }

    public static void glGetQueryBufferObjectuiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLintptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL45C.glGetQueryBufferObjectuiv(r0, r1, r2, r3)
            return
    }

    public static void glCreateTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateTransformFeedbacks(r0)
            return
    }

    public static void glGetTransformFeedbackiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTransformFeedbackiv(r0, r1, r2)
            return
    }

    public static void glGetTransformFeedbacki_v(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTransformFeedbacki_v(r0, r1, r2, r3)
            return
    }

    public static void glGetTransformFeedbacki64_v(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint64 *") long[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTransformFeedbacki64_v(r0, r1, r2, r3)
            return
    }

    public static void glCreateBuffers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateBuffers(r0)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") short[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") int[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") float[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferStorage(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") double[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferStorage(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") short[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") int[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") long[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") float[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("void const *") double[] r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glNamedBufferData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") short[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") long[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void const *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glClearNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glClearNamedBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL45C.glClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL45C.glClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL45C.glClearNamedBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetNamedBufferParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedBufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferParameteri64v(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint64 *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedBufferParameteri64v(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") short[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") long[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glGetNamedBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLintptr") long r6, @org.lwjgl.system.NativeType("void *") double[] r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL45C.glGetNamedBufferSubData(r0, r1, r2)
            return
    }

    public static void glCreateFramebuffers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateFramebuffers(r0)
            return
    }

    public static void glNamedFramebufferDrawBuffers(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glNamedFramebufferDrawBuffers(r0, r1)
            return
    }

    public static void glInvalidateNamedFramebufferData(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLenum const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glInvalidateNamedFramebufferData(r0, r1)
            return
    }

    public static void glInvalidateNamedFramebufferSubData(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum const *") int[] r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL45C.glInvalidateNamedFramebufferSubData(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glClearNamedFramebufferiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glClearNamedFramebufferiv(r0, r1, r2, r3)
            return
    }

    public static void glClearNamedFramebufferuiv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glClearNamedFramebufferuiv(r0, r1, r2, r3)
            return
    }

    public static void glClearNamedFramebufferfv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLfloat const *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glClearNamedFramebufferfv(r0, r1, r2, r3)
            return
    }

    public static void glGetNamedFramebufferParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedFramebufferParameteriv(r0, r1, r2)
            return
    }

    public static void glGetNamedFramebufferAttachmentParameteriv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetNamedFramebufferAttachmentParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glCreateRenderbuffers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateRenderbuffers(r0)
            return
    }

    public static void glGetNamedRenderbufferParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetNamedRenderbufferParameteriv(r0, r1, r2)
            return
    }

    public static void glCreateTextures(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glCreateTextures(r0, r1)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") short[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") int[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") float[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage1D(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") double[] r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL45C.glTextureSubImage1D(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") short[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") int[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") float[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage2D(@org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("void const *") double[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            org.lwjgl.opengl.GL45C.glTextureSubImage2D(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") short[] r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") int[] r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") float[] r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureSubImage3D(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("void const *") double[] r22) {
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            org.lwjgl.opengl.GL45C.glTextureSubImage3D(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glTextureParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterfv(r0, r1, r2)
            return
    }

    public static void glTextureParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterIiv(r0, r1, r2)
            return
    }

    public static void glTextureParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameterIuiv(r0, r1, r2)
            return
    }

    public static void glTextureParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glTextureParameteriv(r0, r1, r2)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") short[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") float[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void *") double[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glGetTextureImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetTextureLevelParameterfv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTextureLevelParameterfv(r0, r1, r2, r3)
            return
    }

    public static void glGetTextureLevelParameteriv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetTextureLevelParameteriv(r0, r1, r2, r3)
            return
    }

    public static void glGetTextureParameterfv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameterfv(r0, r1, r2)
            return
    }

    public static void glGetTextureParameterIiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameterIiv(r0, r1, r2)
            return
    }

    public static void glGetTextureParameterIuiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameterIuiv(r0, r1, r2)
            return
    }

    public static void glGetTextureParameteriv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetTextureParameteriv(r0, r1, r2)
            return
    }

    public static void glCreateVertexArrays(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateVertexArrays(r0)
            return
    }

    public static void glVertexArrayVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL45C.glVertexArrayVertexBuffers(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetVertexArrayiv(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL45C.glGetVertexArrayiv(r0, r1, r2)
            return
    }

    public static void glGetVertexArrayIndexediv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetVertexArrayIndexediv(r0, r1, r2, r3)
            return
    }

    public static void glGetVertexArrayIndexed64iv(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint64 *") long[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL45C.glGetVertexArrayIndexed64iv(r0, r1, r2, r3)
            return
    }

    public static void glCreateSamplers(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateSamplers(r0)
            return
    }

    public static void glCreateProgramPipelines(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glCreateProgramPipelines(r0)
            return
    }

    public static void glCreateQueries(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL45C.glCreateQueries(r0, r1)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
