package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL44C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL44C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL44C.class */
public class GL44C extends org.lwjgl.opengl.GL43C {
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

    protected GL44C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglBufferStorage(int r0, long r1, long r3, int r5);

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r8, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            r0 = r7
            r1 = r8
            r2 = 0
            r3 = r10
            nglBufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferStorage(r0, r1, r2, r3)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglBufferStorage(r0, r1, r2, r3)
            return
    }

    public static native void nglClearTexSubImage(int r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, long r10);

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLsizei") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLenum") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r23) {
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
            long r10 = org.lwjgl.system.MemoryUtil.memAddressSafe(r10)
            nglClearTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static native void nglClearTexImage(int r0, int r1, int r2, int r3, long r4);

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearTexImage(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglBindBuffersBase(int r0, int r1, int r2, long r3);

    public static void glBindBuffersBase(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nglBindBuffersBase(r0, r1, r2, r3)
            return
    }

    public static native void nglBindBuffersRange(int r0, int r1, int r2, long r3, long r5, long r7);

    public static void glBindBuffersRange(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizeiptr const *") org.lwjgl.PointerBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r13
            r1 = r12
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = r12
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L17:
            r0 = r10
            r1 = r11
            r2 = r12
            int r2 = org.lwjgl.system.Checks.remainingSafe(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r14
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            nglBindBuffersRange(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglBindTextures(int r0, int r1, long r2);

    public static void glBindTextures(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nglBindTextures(r0, r1, r2)
            return
    }

    public static native void nglBindSamplers(int r0, int r1, long r2);

    public static void glBindSamplers(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nglBindSamplers(r0, r1, r2)
            return
    }

    public static native void nglBindImageTextures(int r0, int r1, long r2);

    public static void glBindImageTextures(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nglBindImageTextures(r0, r1, r2)
            return
    }

    public static native void nglBindVertexBuffers(int r0, int r1, long r2, long r4, long r6);

    public static void glBindVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r11
            r1 = r10
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = r10
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L16:
            r0 = r9
            r1 = r10
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglBindVertexBuffers(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") short[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferStorage
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") int[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferStorage
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") float[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferStorage
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBufferStorage(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") double[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBufferStorage
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexSubImage
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexSubImage
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexSubImage
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glClearTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLint") int r16, @org.lwjgl.system.NativeType("GLint") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLsizei") int r19, @org.lwjgl.system.NativeType("GLsizei") int r20, @org.lwjgl.system.NativeType("GLsizei") int r21, @org.lwjgl.system.NativeType("GLenum") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r24) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexSubImage
            r25 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r25
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexImage
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexImage
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexImage
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glClearTexImage(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") double[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearTexImage
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glBindBuffersBase(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBindBuffersBase
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glBindBuffersRange(@org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizeiptr const *") org.lwjgl.PointerBuffer r15) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBindBuffersRange
            r16 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L25
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = r13
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = r13
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L25:
            r0 = r11
            r1 = r12
            r2 = r13
            int r2 = org.lwjgl.system.Checks.lengthSafe(r2)
            r3 = r13
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            r5 = r15
            long r5 = org.lwjgl.system.MemoryUtil.memAddressSafe(r5)
            r6 = r16
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glBindTextures(@org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBindTextures
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glBindSamplers(@org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBindSamplers
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glBindImageTextures(@org.lwjgl.system.NativeType("GLuint") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBindImageTextures
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glBindVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glBindVertexBuffers
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r10
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r12
            r1 = r10
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L24:
            r0 = r9
            r1 = r10
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
