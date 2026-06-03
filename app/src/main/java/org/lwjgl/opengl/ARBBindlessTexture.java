package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBindlessTexture.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBindlessTexture.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBBindlessTexture.class */
public class ARBBindlessTexture {
    public static final int GL_UNSIGNED_INT64_ARB = 5135;

    protected ARBBindlessTexture() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLuint64")
    public static native long glGetTextureHandleARB(@org.lwjgl.system.NativeType("GLuint") int r0);

    @org.lwjgl.system.NativeType("GLuint64")
    public static native long glGetTextureSamplerHandleARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glMakeTextureHandleResidentARB(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static native void glMakeTextureHandleNonResidentARB(@org.lwjgl.system.NativeType("GLuint64") long r0);

    @org.lwjgl.system.NativeType("GLuint64")
    public static native long glGetImageHandleARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLboolean") boolean r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLenum") int r4);

    public static native void glMakeImageHandleResidentARB(@org.lwjgl.system.NativeType("GLuint64") long r0, @org.lwjgl.system.NativeType("GLenum") int r2);

    public static native void glMakeImageHandleNonResidentARB(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static native void glUniformHandleui64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1);

    public static native void nglUniformHandleui64vARB(int r0, int r1, long r2);

    public static void glUniformHandleui64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniformHandleui64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniformHandleui64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64") long r2);

    public static native void nglProgramUniformHandleui64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniformHandleui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniformHandleui64vARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsTextureHandleResidentARB(@org.lwjgl.system.NativeType("GLuint64") long r0);

    @org.lwjgl.system.NativeType("GLboolean")
    public static native boolean glIsImageHandleResidentARB(@org.lwjgl.system.NativeType("GLuint64") long r0);

    public static native void glVertexAttribL1ui64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1);

    public static native void nglVertexAttribL1ui64vARB(int r0, long r1);

    public static void glVertexAttribL1ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribL1ui64vARB(r0, r1)
            return
    }

    public static native void nglGetVertexAttribLui64vARB(int r0, int r1, long r2);

    public static void glGetVertexAttribLui64vARB(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint64 *") java.nio.LongBuffer r7) {
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
            nglGetVertexAttribLui64vARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetVertexAttribLui64ARB(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetVertexAttribLui64vARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static void glUniformHandleui64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformHandleui64vARB
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniformHandleui64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniformHandleui64vARB
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
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribL1ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribL1ui64vARB
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

    public static void glGetVertexAttribLui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint64 *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribLui64vARB
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
