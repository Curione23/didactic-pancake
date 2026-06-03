package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDGPUShaderInt64.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDGPUShaderInt64.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDGPUShaderInt64.class */
public class AMDGPUShaderInt64 {
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

    protected AMDGPUShaderInt64() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glUniform1i64NV(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLint64EXT") long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.NVGPUShader5.glUniform1i64NV(r0, r1)
            return
    }

    public static void glUniform2i64NV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64EXT") long r7, @org.lwjgl.system.NativeType("GLint64EXT") long r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.NVGPUShader5.glUniform2i64NV(r0, r1, r2)
            return
    }

    public static void glUniform3i64NV(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64EXT") long r9, @org.lwjgl.system.NativeType("GLint64EXT") long r11, @org.lwjgl.system.NativeType("GLint64EXT") long r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.NVGPUShader5.glUniform3i64NV(r0, r1, r2, r3)
            return
    }

    public static void glUniform4i64NV(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint64EXT") long r11, @org.lwjgl.system.NativeType("GLint64EXT") long r13, @org.lwjgl.system.NativeType("GLint64EXT") long r15, @org.lwjgl.system.NativeType("GLint64EXT") long r17) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r17
            org.lwjgl.opengl.NVGPUShader5.glUniform4i64NV(r0, r1, r2, r3, r4)
            return
    }

    public static void nglUniform1i64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform1i64vNV(r0, r1, r2)
            return
    }

    public static void glUniform1i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform1i64vNV(r0, r1)
            return
    }

    public static void nglUniform2i64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform2i64vNV(r0, r1, r2)
            return
    }

    public static void glUniform2i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform2i64vNV(r0, r1)
            return
    }

    public static void nglUniform3i64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform3i64vNV(r0, r1, r2)
            return
    }

    public static void glUniform3i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform3i64vNV(r0, r1)
            return
    }

    public static void nglUniform4i64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform4i64vNV(r0, r1, r2)
            return
    }

    public static void glUniform4i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform4i64vNV(r0, r1)
            return
    }

    public static void glUniform1ui64NV(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLuint64EXT") long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.NVGPUShader5.glUniform1ui64NV(r0, r1)
            return
    }

    public static void glUniform2ui64NV(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64EXT") long r7, @org.lwjgl.system.NativeType("GLuint64EXT") long r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.NVGPUShader5.glUniform2ui64NV(r0, r1, r2)
            return
    }

    public static void glUniform3ui64NV(@org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64EXT") long r9, @org.lwjgl.system.NativeType("GLuint64EXT") long r11, @org.lwjgl.system.NativeType("GLuint64EXT") long r13) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            org.lwjgl.opengl.NVGPUShader5.glUniform3ui64NV(r0, r1, r2, r3)
            return
    }

    public static void glUniform4ui64NV(@org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLuint64EXT") long r11, @org.lwjgl.system.NativeType("GLuint64EXT") long r13, @org.lwjgl.system.NativeType("GLuint64EXT") long r15, @org.lwjgl.system.NativeType("GLuint64EXT") long r17) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r15
            r4 = r17
            org.lwjgl.opengl.NVGPUShader5.glUniform4ui64NV(r0, r1, r2, r3, r4)
            return
    }

    public static void nglUniform1ui64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform1ui64vNV(r0, r1, r2)
            return
    }

    public static void glUniform1ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform1ui64vNV(r0, r1)
            return
    }

    public static void nglUniform2ui64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform2ui64vNV(r0, r1, r2)
            return
    }

    public static void glUniform2ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform2ui64vNV(r0, r1)
            return
    }

    public static void nglUniform3ui64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform3ui64vNV(r0, r1, r2)
            return
    }

    public static void glUniform3ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform3ui64vNV(r0, r1)
            return
    }

    public static void nglUniform4ui64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglUniform4ui64vNV(r0, r1, r2)
            return
    }

    public static void glUniform4ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform4ui64vNV(r0, r1)
            return
    }

    public static void nglGetUniformi64vNV(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.nglGetUniformi64vNV(r0, r1, r2)
            return
    }

    public static void glGetUniformi64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glGetUniformi64vNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetUniformi64NV(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.NVGPUShader5.glGetUniformi64NV(r0, r1)
            return r0
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

    public static void glProgramUniform1i64NV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLint64EXT") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform1i64NV(r0, r1, r2)
            return
    }

    public static void glProgramUniform2i64NV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLint64EXT") long r9, @org.lwjgl.system.NativeType("GLint64EXT") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform2i64NV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3i64NV(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint64EXT") long r11, @org.lwjgl.system.NativeType("GLint64EXT") long r13, @org.lwjgl.system.NativeType("GLint64EXT") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform3i64NV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform4i64NV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint64EXT") long r13, @org.lwjgl.system.NativeType("GLint64EXT") long r15, @org.lwjgl.system.NativeType("GLint64EXT") long r17, @org.lwjgl.system.NativeType("GLint64EXT") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform4i64NV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglProgramUniform1i64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform1i64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform1i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform1i64vNV(r0, r1, r2)
            return
    }

    public static void nglProgramUniform2i64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform2i64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform2i64vNV(r0, r1, r2)
            return
    }

    public static void nglProgramUniform3i64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform3i64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform3i64vNV(r0, r1, r2)
            return
    }

    public static void nglProgramUniform4i64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform4i64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform4i64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform1ui64NV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint64EXT") long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform1ui64NV(r0, r1, r2)
            return
    }

    public static void glProgramUniform2ui64NV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLuint64EXT") long r9, @org.lwjgl.system.NativeType("GLuint64EXT") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform2ui64NV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3ui64NV(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLuint64EXT") long r11, @org.lwjgl.system.NativeType("GLuint64EXT") long r13, @org.lwjgl.system.NativeType("GLuint64EXT") long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform3ui64NV(r0, r1, r2, r3, r4)
            return
    }

    public static void glProgramUniform4ui64NV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLuint64EXT") long r13, @org.lwjgl.system.NativeType("GLuint64EXT") long r15, @org.lwjgl.system.NativeType("GLuint64EXT") long r17, @org.lwjgl.system.NativeType("GLuint64EXT") long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r19
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform4ui64NV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void nglProgramUniform1ui64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform1ui64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform1ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform1ui64vNV(r0, r1, r2)
            return
    }

    public static void nglProgramUniform2ui64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform2ui64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform2ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform2ui64vNV(r0, r1, r2)
            return
    }

    public static void nglProgramUniform3ui64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform3ui64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform3ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform3ui64vNV(r0, r1, r2)
            return
    }

    public static void nglProgramUniform4ui64vNV(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.NVGPUShader5.nglProgramUniform4ui64vNV(r0, r1, r2, r3)
            return
    }

    public static void glProgramUniform4ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform4ui64vNV(r0, r1, r2)
            return
    }

    public static void glUniform1i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform1i64vNV(r0, r1)
            return
    }

    public static void glUniform2i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform2i64vNV(r0, r1)
            return
    }

    public static void glUniform3i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform3i64vNV(r0, r1)
            return
    }

    public static void glUniform4i64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform4i64vNV(r0, r1)
            return
    }

    public static void glUniform1ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform1ui64vNV(r0, r1)
            return
    }

    public static void glUniform2ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform2ui64vNV(r0, r1)
            return
    }

    public static void glUniform3ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform3ui64vNV(r0, r1)
            return
    }

    public static void glUniform4ui64vNV(@org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.NVGPUShader5.glUniform4ui64vNV(r0, r1)
            return
    }

    public static void glGetUniformi64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glGetUniformi64vNV(r0, r1, r2)
            return
    }

    public static void glGetUniformui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVShaderBufferLoad.glGetUniformui64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform1i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform1i64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform2i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform2i64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform3i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform3i64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform4i64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform4i64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform1ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform1ui64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform2ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform2ui64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform3ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform3ui64vNV(r0, r1, r2)
            return
    }

    public static void glProgramUniform4ui64vNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint64EXT const *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.NVGPUShader5.glProgramUniform4ui64vNV(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
