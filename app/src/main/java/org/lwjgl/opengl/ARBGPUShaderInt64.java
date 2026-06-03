package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGPUShaderInt64.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGPUShaderInt64.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGPUShaderInt64.class */
public class ARBGPUShaderInt64 {
    public static final int GL_INT64_ARB = 5134;
    public static final int GL_UNSIGNED_INT64_ARB = 5135;
    public static final int GL_INT64_VEC2_ARB = 36841;
    public static final int GL_INT64_VEC3_ARB = 36842;
    public static final int GL_INT64_VEC4_ARB = 36843;
    public static final int GL_UNSIGNED_INT64_VEC2_ARB = 36853;
    public static final int GL_UNSIGNED_INT64_VEC3_ARB = 36854;
    public static final int GL_UNSIGNED_INT64_VEC4_ARB = 36855;

    protected ARBGPUShaderInt64() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glUniform1i64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64") long r1);

    public static native void nglUniform1i64vARB(int r0, int r1, long r2);

    public static void glUniform1i64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1i64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform1i64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64") long r2);

    public static native void nglProgramUniform1i64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1i64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1i64vARB(r0, r1, r2, r3)
            return
    }

    public static native void glUniform2i64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64") long r1, @org.lwjgl.system.NativeType("GLint64") long r3);

    public static native void nglUniform2i64vARB(int r0, int r1, long r2);

    public static void glUniform2i64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2i64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform2i64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64") long r2, @org.lwjgl.system.NativeType("GLint64") long r4);

    public static native void nglProgramUniform2i64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2i64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2i64vARB(r0, r1, r2, r3)
            return
    }

    public static native void glUniform3i64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64") long r1, @org.lwjgl.system.NativeType("GLint64") long r3, @org.lwjgl.system.NativeType("GLint64") long r5);

    public static native void nglUniform3i64vARB(int r0, int r1, long r2);

    public static void glUniform3i64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3i64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform3i64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64") long r2, @org.lwjgl.system.NativeType("GLint64") long r4, @org.lwjgl.system.NativeType("GLint64") long r6);

    public static native void nglProgramUniform3i64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3i64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3i64vARB(r0, r1, r2, r3)
            return
    }

    public static native void glUniform4i64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64") long r1, @org.lwjgl.system.NativeType("GLint64") long r3, @org.lwjgl.system.NativeType("GLint64") long r5, @org.lwjgl.system.NativeType("GLint64") long r7);

    public static native void nglUniform4i64vARB(int r0, int r1, long r2);

    public static void glUniform4i64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4i64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform4i64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64") long r2, @org.lwjgl.system.NativeType("GLint64") long r4, @org.lwjgl.system.NativeType("GLint64") long r6, @org.lwjgl.system.NativeType("GLint64") long r8);

    public static native void nglProgramUniform4i64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4i64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4i64vARB(r0, r1, r2, r3)
            return
    }

    public static native void glUniform1ui64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1);

    public static native void nglUniform1ui64vARB(int r0, int r1, long r2);

    public static void glUniform1ui64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1ui64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform1ui64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64") long r2);

    public static native void nglProgramUniform1ui64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1ui64vARB(r0, r1, r2, r3)
            return
    }

    public static native void glUniform2ui64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1, @org.lwjgl.system.NativeType("GLuint64") long r3);

    public static native void nglUniform2ui64vARB(int r0, int r1, long r2);

    public static void glUniform2ui64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2ui64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform2ui64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64") long r2, @org.lwjgl.system.NativeType("GLuint64") long r4);

    public static native void nglProgramUniform2ui64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2ui64vARB(r0, r1, r2, r3)
            return
    }

    public static native void glUniform3ui64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1, @org.lwjgl.system.NativeType("GLuint64") long r3, @org.lwjgl.system.NativeType("GLuint64") long r5);

    public static native void nglUniform3ui64vARB(int r0, int r1, long r2);

    public static void glUniform3ui64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3ui64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform3ui64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64") long r2, @org.lwjgl.system.NativeType("GLuint64") long r4, @org.lwjgl.system.NativeType("GLuint64") long r6);

    public static native void nglProgramUniform3ui64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3ui64vARB(r0, r1, r2, r3)
            return
    }

    public static native void glUniform4ui64ARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64") long r1, @org.lwjgl.system.NativeType("GLuint64") long r3, @org.lwjgl.system.NativeType("GLuint64") long r5, @org.lwjgl.system.NativeType("GLuint64") long r7);

    public static native void nglUniform4ui64vARB(int r0, int r1, long r2);

    public static void glUniform4ui64vARB(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4ui64vARB(r0, r1, r2)
            return
    }

    public static native void glProgramUniform4ui64ARB(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64") long r2, @org.lwjgl.system.NativeType("GLuint64") long r4, @org.lwjgl.system.NativeType("GLuint64") long r6, @org.lwjgl.system.NativeType("GLuint64") long r8);

    public static native void nglProgramUniform4ui64vARB(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4ui64vARB(r0, r1, r2, r3)
            return
    }

    public static native void nglGetUniformi64vARB(int r0, int r1, long r2);

    public static void glGetUniformi64vARB(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r7) {
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
            nglGetUniformi64vARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetUniformi64vARB(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
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
            nglGetUniformi64vARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetUniformui64vARB(int r0, int r1, long r2);

    public static void glGetUniformui64vARB(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64 *") java.nio.LongBuffer r7) {
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
            nglGetUniformui64vARB(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetUniformui64vARB(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
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
            nglGetUniformui64vARB(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetnUniformi64vARB(int r0, int r1, int r2, long r3);

    public static void glGetnUniformi64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnUniformi64vARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetnUniformi64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnUniformi64vARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetnUniformui64vARB(int r0, int r1, int r2, long r3);

    public static void glGetnUniformui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetnUniformui64vARB(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetnUniformui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L2b
            r10 = r0
            r0 = r6
            r1 = r7
            r2 = 1
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2b
            nglGetnUniformui64vARB(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2b
            r0 = r10
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2b
            r11 = r0
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r11
            return r0
        L2b:
            r13 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static void glUniform1i64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64 *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1i64vARB
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

    public static void glProgramUniform1i64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64 *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1i64vARB
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

    public static void glUniform2i64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64 *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2i64vARB
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2i64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64 *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2i64vARB
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
            r3 = 1
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniform3i64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64 *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3i64vARB
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 3
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3i64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64 *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3i64vARB
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
            r3 = 3
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniform4i64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64 *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4i64vARB
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4i64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64 *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4i64vARB
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

    public static void glUniform1ui64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1ui64vARB
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

    public static void glProgramUniform1ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1ui64vARB
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

    public static void glUniform2ui64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2ui64vARB
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 1
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2ui64vARB
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
            r3 = 1
            int r2 = r2 >> r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniform3ui64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3ui64vARB
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 3
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3ui64vARB
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
            r3 = 3
            int r2 = r2 / r3
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniform4ui64vARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4ui64vARB
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = r1.length
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4ui64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64 const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4ui64vARB
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

    public static void glGetUniformi64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64 *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformi64vARB
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

    public static void glGetUniformui64vARB(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64 *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformui64vARB
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

    public static void glGetnUniformi64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64 *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnUniformi64vARB
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

    public static void glGetnUniformui64vARB(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64 *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetnUniformui64vARB
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
