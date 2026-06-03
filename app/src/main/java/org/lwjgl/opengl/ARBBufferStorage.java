package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBufferStorage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBufferStorage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBufferStorage.class */
public class ARBBufferStorage {
    public static final int GL_MAP_PERSISTENT_BIT = 64;
    public static final int GL_MAP_COHERENT_BIT = 128;
    public static final int GL_DYNAMIC_STORAGE_BIT = 256;
    public static final int GL_CLIENT_STORAGE_BIT = 512;
    public static final int GL_BUFFER_IMMUTABLE_STORAGE = 33311;
    public static final int GL_BUFFER_STORAGE_FLAGS = 33312;
    public static final int GL_CLIENT_MAPPED_BUFFER_BARRIER_BIT = 16384;

    protected ARBBufferStorage() {
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

    public static native void nglNamedBufferStorageEXT(int r0, long r1, long r3, int r5);

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r8, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            r0 = r7
            r1 = r8
            r2 = 0
            r3 = r10
            nglNamedBufferStorageEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = (long) r1
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferStorageEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 1
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferStorageEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferStorageEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 2
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferStorageEXT(r0, r1, r2, r3)
            return
    }

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.DoubleBuffer r8, @org.lwjgl.system.NativeType("GLbitfield") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            long r1 = java.lang.Integer.toUnsignedLong(r1)
            r2 = 3
            long r1 = r1 << r2
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            nglNamedBufferStorageEXT(r0, r1, r2, r3)
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

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") short[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferStorageEXT
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

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") int[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferStorageEXT
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

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") float[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferStorageEXT
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

    public static void glNamedBufferStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") double[] r9, @org.lwjgl.system.NativeType("GLbitfield") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glNamedBufferStorageEXT
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
