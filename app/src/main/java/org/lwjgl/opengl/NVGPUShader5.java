package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVGPUShader5.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVGPUShader5.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVGPUShader5.class */
public class NVGPUShader5 {
    public static final int GL_INT64_NV = 5134;
    public static final int GL_UNSIGNED_INT64_NV = 5135;
    public static final int GL_INT8_NV = 36832;
    public static final int GL_INT8_VEC2_NV = 36833;
    public static final int GL_INT8_VEC3_NV = 36834;
    public static final int GL_INT8_VEC4_NV = 36835;
    public static final int GL_INT16_NV = 36836;
    public static final int GL_INT16_VEC2_NV = 36837;
    public static final int GL_INT16_VEC3_NV = 36838;
    public static final int GL_INT16_VEC4_NV = 36839;
    public static final int GL_INT64_VEC2_NV = 36841;
    public static final int GL_INT64_VEC3_NV = 36842;
    public static final int GL_INT64_VEC4_NV = 36843;
    public static final int GL_UNSIGNED_INT8_NV = 36844;
    public static final int GL_UNSIGNED_INT8_VEC2_NV = 36845;
    public static final int GL_UNSIGNED_INT8_VEC3_NV = 36846;
    public static final int GL_UNSIGNED_INT8_VEC4_NV = 36847;
    public static final int GL_UNSIGNED_INT16_NV = 36848;
    public static final int GL_UNSIGNED_INT16_VEC2_NV = 36849;
    public static final int GL_UNSIGNED_INT16_VEC3_NV = 36850;
    public static final int GL_UNSIGNED_INT16_VEC4_NV = 36851;
    public static final int GL_UNSIGNED_INT64_VEC2_NV = 36853;
    public static final int GL_UNSIGNED_INT64_VEC3_NV = 36854;
    public static final int GL_UNSIGNED_INT64_VEC4_NV = 36855;
    public static final int GL_FLOAT16_NV = 36856;
    public static final int GL_FLOAT16_VEC2_NV = 36857;
    public static final int GL_FLOAT16_VEC3_NV = 36858;
    public static final int GL_FLOAT16_VEC4_NV = 36859;

    protected NVGPUShader5() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glUniform1i64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1);

    public static native void glUniform2i64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1, @org.lwjgl.system.NativeType("GLint64EXT") long r3);

    public static native void glUniform3i64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1, @org.lwjgl.system.NativeType("GLint64EXT") long r3, @org.lwjgl.system.NativeType("GLint64EXT") long r5);

    public static native void glUniform4i64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint64EXT") long r1, @org.lwjgl.system.NativeType("GLint64EXT") long r3, @org.lwjgl.system.NativeType("GLint64EXT") long r5, @org.lwjgl.system.NativeType("GLint64EXT") long r7);

    public static native void nglUniform1i64vNV(int r0, int r1, long r2);

    public static void glUniform1i64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1i64vNV(r0, r1, r2)
            return
    }

    public static native void nglUniform2i64vNV(int r0, int r1, long r2);

    public static void glUniform2i64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2i64vNV(r0, r1, r2)
            return
    }

    public static native void nglUniform3i64vNV(int r0, int r1, long r2);

    public static void glUniform3i64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3i64vNV(r0, r1, r2)
            return
    }

    public static native void nglUniform4i64vNV(int r0, int r1, long r2);

    public static void glUniform4i64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4i64vNV(r0, r1, r2)
            return
    }

    public static native void glUniform1ui64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1);

    public static native void glUniform2ui64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r3);

    public static native void glUniform3ui64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r3, @org.lwjgl.system.NativeType("GLuint64EXT") long r5);

    public static native void glUniform4ui64NV(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint64EXT") long r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r3, @org.lwjgl.system.NativeType("GLuint64EXT") long r5, @org.lwjgl.system.NativeType("GLuint64EXT") long r7);

    public static native void nglUniform1ui64vNV(int r0, int r1, long r2);

    public static void glUniform1ui64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1ui64vNV(r0, r1, r2)
            return
    }

    public static native void nglUniform2ui64vNV(int r0, int r1, long r2);

    public static void glUniform2ui64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2ui64vNV(r0, r1, r2)
            return
    }

    public static native void nglUniform3ui64vNV(int r0, int r1, long r2);

    public static void glUniform3ui64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3ui64vNV(r0, r1, r2)
            return
    }

    public static native void nglUniform4ui64vNV(int r0, int r1, long r2);

    public static void glUniform4ui64vNV(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4ui64vNV(r0, r1, r2)
            return
    }

    public static native void nglGetUniformi64vNV(int r0, int r1, long r2);

    public static void glGetUniformi64vNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64EXT *") java.nio.LongBuffer r7) {
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
            nglGetUniformi64vNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetUniformi64NV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
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
            nglGetUniformi64vNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static void nglGetUniformui64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVShaderBufferLoad.nglGetUniformui64vNV(r0, r1, r2)
            return
    }

    public static void glGetUniformui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVShaderBufferLoad.glGetUniformui64vNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetUniformui64NV(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.NVShaderBufferLoad.glGetUniformui64NV(r0, r1)
            return r0
    }

    public static native void glProgramUniform1i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64EXT") long r2);

    public static native void glProgramUniform2i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64EXT") long r2, @org.lwjgl.system.NativeType("GLint64EXT") long r4);

    public static native void glProgramUniform3i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64EXT") long r2, @org.lwjgl.system.NativeType("GLint64EXT") long r4, @org.lwjgl.system.NativeType("GLint64EXT") long r6);

    public static native void glProgramUniform4i64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint64EXT") long r2, @org.lwjgl.system.NativeType("GLint64EXT") long r4, @org.lwjgl.system.NativeType("GLint64EXT") long r6, @org.lwjgl.system.NativeType("GLint64EXT") long r8);

    public static native void nglProgramUniform1i64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1i64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1i64vNV(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform2i64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2i64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2i64vNV(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform3i64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3i64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3i64vNV(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform4i64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4i64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4i64vNV(r0, r1, r2, r3)
            return
    }

    public static native void glProgramUniform1ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r2);

    public static native void glProgramUniform2ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r2, @org.lwjgl.system.NativeType("GLuint64EXT") long r4);

    public static native void glProgramUniform3ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r2, @org.lwjgl.system.NativeType("GLuint64EXT") long r4, @org.lwjgl.system.NativeType("GLuint64EXT") long r6);

    public static native void glProgramUniform4ui64NV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint64EXT") long r2, @org.lwjgl.system.NativeType("GLuint64EXT") long r4, @org.lwjgl.system.NativeType("GLuint64EXT") long r6, @org.lwjgl.system.NativeType("GLuint64EXT") long r8);

    public static native void nglProgramUniform1ui64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform1ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform1ui64vNV(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform2ui64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform2ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 1
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform2ui64vNV(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform3ui64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform3ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 3
            int r2 = r2 / r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform3ui64vNV(r0, r1, r2, r3)
            return
    }

    public static native void nglProgramUniform4ui64vNV(int r0, int r1, int r2, long r3);

    public static void glProgramUniform4ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            int r2 = r2.remaining()
            r3 = 2
            int r2 = r2 >> r3
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglProgramUniform4ui64vNV(r0, r1, r2, r3)
            return
    }

    public static void glUniform1i64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1i64vNV
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

    public static void glUniform2i64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2i64vNV
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

    public static void glUniform3i64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3i64vNV
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

    public static void glUniform4i64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4i64vNV
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

    public static void glUniform1ui64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1ui64vNV
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

    public static void glUniform2ui64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64EXT *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2ui64vNV
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

    public static void glUniform3ui64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3ui64vNV
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

    public static void glUniform4ui64vNV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4ui64vNV
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

    public static void glGetUniformi64vNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLint64EXT *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformi64vNV
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

    public static void glGetUniformui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVShaderBufferLoad.glGetUniformui64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform1i64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1i64vNV
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

    public static void glProgramUniform2i64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2i64vNV
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

    public static void glProgramUniform3i64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3i64vNV
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

    public static void glProgramUniform4i64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4i64vNV
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

    public static void glProgramUniform1ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform1ui64vNV
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

    public static void glProgramUniform2ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform2ui64vNV
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

    public static void glProgramUniform3ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform3ui64vNV
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

    public static void glProgramUniform4ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glProgramUniform4ui64vNV
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
