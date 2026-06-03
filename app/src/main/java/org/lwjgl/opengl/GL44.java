package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL44.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL44.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL44.class */
public class GL44 extends org.lwjgl.opengl.GL43 {
    public static final int GL_MAX_VERTEX_ATTRIB_STRIDE = 33509;
    public static final int GL_PRIMITIVE_RESTART_FOR_PATCHES_SUPPORTED = 33313;
    public static final int GL_TEXTURE_BUFFER_BINDING = 35882;
    public static final int GL_MAP_PERSISTENT_BIT = 64;
    public static final int GL_MAP_COHERENT_BIT = 128;
    public static final int GL_DYNAMIC_STORAGE_BIT = 256;
    public static final int GL_CLIENT_STORAGE_BIT = 512;
    public static final int GL_BUFFER_IMMUTABLE_STORAGE = 33311;
    public static final int GL_BUFFER_STORAGE_FLAGS = 33312;
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 16384;
    public static final int GL_CLEAR_TEXTURE = 37733;
    public static final int GL_LOCATION_COMPONENT = 37706;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_INDEX = 37707;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_STRIDE = 37708;
    public static final int GL_QUERY_RESULT_NO_WAIT = 37268;
    public static final int GL_QUERY_BUFFER = 37266;
    public static final int GL_QUERY_BUFFER_BINDING = 37267;
    public static final int GL_QUERY_BUFFER_BARRIER_BIT = 32768;
    public static final int GL_MIRROR_CLAMP_TO_EDGE = 34627;

    protected GL44() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglBufferStorage(int r7, long r8, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            org.lwjgl.opengl.GL44C.nglBufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLsizeiptr") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8) {
            r0 = r5
            r1 = r6
            r2 = r8
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void nglClearTexSubImage(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, long r23) {
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
            org.lwjgl.opengl.GL44C.nglClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void nglClearTexImage(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL44C.nglClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void nglBindBuffersBase(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL44C.nglBindBuffersBase(r0, r1, r2, r3)
            return
    }

    public static void glBindBuffersBase(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBindBuffersBase(r0, r1, r2)
            return
    }

    public static void nglBindBuffersRange(int r10, int r11, int r12, long r13, long r15, long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r17
            org.lwjgl.opengl.GL44C.nglBindBuffersRange(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glBindBuffersRange(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizeiptr const *") org.lwjgl.PointerBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glBindBuffersRange(r0, r1, r2, r3, r4)
            return
    }

    public static void nglBindTextures(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL44C.nglBindTextures(r0, r1, r2)
            return
    }

    public static void glBindTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindTextures(r0, r1)
            return
    }

    public static void nglBindSamplers(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL44C.nglBindSamplers(r0, r1, r2)
            return
    }

    public static void glBindSamplers(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindSamplers(r0, r1)
            return
    }

    public static void nglBindImageTextures(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL44C.nglBindImageTextures(r0, r1, r2)
            return
    }

    public static void glBindImageTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindImageTextures(r0, r1)
            return
    }

    public static void nglBindVertexBuffers(int r9, int r10, long r11, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL44C.nglBindVertexBuffers(r0, r1, r2, r3, r4)
            return
    }

    public static void glBindVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL44C.glBindVertexBuffers(r0, r1, r2, r3)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") short[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") int[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") float[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") double[] r5, @org.lwjgl.system.NativeType("GLbitfield") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBufferStorage(r0, r1, r2)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLenum") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r22) {
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
            org.lwjgl.opengl.GL44C.glClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glBindBuffersBase(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBindBuffersBase(r0, r1, r2)
            return
    }

    public static void glBindBuffersRange(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizeiptr const *") org.lwjgl.PointerBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glBindBuffersRange(r0, r1, r2, r3, r4)
            return
    }

    public static void glBindTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindTextures(r0, r1)
            return
    }

    public static void glBindSamplers(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindSamplers(r0, r1)
            return
    }

    public static void glBindImageTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindImageTextures(r0, r1)
            return
    }

    public static void glBindVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL44C.glBindVertexBuffers(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
