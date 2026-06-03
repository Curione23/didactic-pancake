package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVVertexAttribInteger64bit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVVertexAttribInteger64bit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVVertexAttribInteger64bit.class */
public class NVVertexAttribInteger64bit {
    public static final int GL_INT64_NV = 5134;
    public static final int GL_UNSIGNED_INT64_NV = 5135;

    protected NVVertexAttribInteger64bit() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glVertexAttribL1i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1);

    public static native void glVertexAttribL2i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1, @org.lwjgl.system.NativeType("GLint64EXT") long r3);

    public static native void glVertexAttribL3i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1, @org.lwjgl.system.NativeType("GLint64EXT") long r3, @org.lwjgl.system.NativeType("GLint64EXT") long r5);

    public static native void glVertexAttribL4i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1, @org.lwjgl.system.NativeType("GLint64EXT") long r3, @org.lwjgl.system.NativeType("GLint64EXT") long r5, @org.lwjgl.system.NativeType("GLint64EXT") long r7);

    public static native void nglVertexAttribL1i64vNV(int r0, long r1);

    public static void glVertexAttribL1i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL1i64vNV(r0, r1)
            return
    }

    public static native void nglVertexAttribL2i64vNV(int r0, long r1);

    public static void glVertexAttribL2i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL2i64vNV(r0, r1)
            return
    }

    public static native void nglVertexAttribL3i64vNV(int r0, long r1);

    public static void glVertexAttribL3i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL3i64vNV(r0, r1)
            return
    }

    public static native void nglVertexAttribL4i64vNV(int r0, long r1);

    public static void glVertexAttribL4i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL4i64vNV(r0, r1)
            return
    }

    public static native void glVertexAttribL1ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1);

    public static native void glVertexAttribL2ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r3);

    public static native void glVertexAttribL3ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r3, @org.lwjgl.system.NativeType("GLuint64EXT") long r5);

    public static native void glVertexAttribL4ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r3, @org.lwjgl.system.NativeType("GLuint64EXT") long r5, @org.lwjgl.system.NativeType("GLuint64EXT") long r7);

    public static native void nglVertexAttribL1ui64vNV(int r0, long r1);

    public static void glVertexAttribL1ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL1ui64vNV(r0, r1)
            return
    }

    public static native void nglVertexAttribL2ui64vNV(int r0, long r1);

    public static void glVertexAttribL2ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL2ui64vNV(r0, r1)
            return
    }

    public static native void nglVertexAttribL3ui64vNV(int r0, long r1);

    public static void glVertexAttribL3ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL3ui64vNV(r0, r1)
            return
    }

    public static native void nglVertexAttribL4ui64vNV(int r0, long r1);

    public static void glVertexAttribL4ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL4ui64vNV(r0, r1)
            return
    }

    public static native void nglGetVertexAttribLi64vNV(int r0, int r1, long r2);

    public static void glGetVertexAttribLi64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint64EXT *") java.nio.LongBuffer r7) {
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
            nglGetVertexAttribLi64vNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexAttribLi64NV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetVertexAttribLi64vNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetVertexAttribLui64vNV(int r0, int r1, long r2);

    public static void glGetVertexAttribLui64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint64EXT *") java.nio.LongBuffer r7) {
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
            nglGetVertexAttribLui64vNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexAttribLui64NV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetVertexAttribLui64vNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void glVertexAttribLFormatNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static void glVertexAttribL1i64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL1i64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribL2i64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL2i64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribL3i64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL3i64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribL4i64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL4i64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribL1ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL1ui64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribL2ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL2ui64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribL3ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL3ui64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glVertexAttribL4ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL4ui64vNV
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glGetVertexAttribLi64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint64EXT *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribLi64vNV
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

    public static void glGetVertexAttribLui64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint64EXT *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribLui64vNV
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
