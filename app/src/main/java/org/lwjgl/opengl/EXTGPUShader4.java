package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTGPUShader4.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTGPUShader4.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTGPUShader4.class */
public class EXTGPUShader4 {
    public static final int GL_VERTEX_ATTRIB_ARRAY_INTEGER_EXT = 35069;
    public static final int GL_SAMPLER_1D_ARRAY_EXT = 36288;
    public static final int GL_SAMPLER_2D_ARRAY_EXT = 36289;
    public static final int GL_SAMPLER_BUFFER_EXT = 36290;
    public static final int GL_SAMPLER_1D_ARRAY_SHADOW_EXT = 36291;
    public static final int GL_SAMPLER_2D_ARRAY_SHADOW_EXT = 36292;
    public static final int GL_SAMPLER_CUBE_SHADOW_EXT = 36293;
    public static final int GL_UNSIGNED_INT_VEC2_EXT = 36294;
    public static final int GL_UNSIGNED_INT_VEC3_EXT = 36295;
    public static final int GL_UNSIGNED_INT_VEC4_EXT = 36296;
    public static final int GL_INT_SAMPLER_1D_EXT = 36297;
    public static final int GL_INT_SAMPLER_2D_EXT = 36298;
    public static final int GL_INT_SAMPLER_3D_EXT = 36299;
    public static final int GL_INT_SAMPLER_CUBE_EXT = 36300;
    public static final int GL_INT_SAMPLER_2D_RECT_EXT = 36301;
    public static final int GL_INT_SAMPLER_1D_ARRAY_EXT = 36302;
    public static final int GL_INT_SAMPLER_2D_ARRAY_EXT = 36303;
    public static final int GL_INT_SAMPLER_BUFFER_EXT = 36304;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_EXT = 36305;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_EXT = 36306;
    public static final int GL_UNSIGNED_INT_SAMPLER_3D_EXT = 36307;
    public static final int GL_UNSIGNED_INT_SAMPLER_CUBE_EXT = 36308;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT_EXT = 36309;
    public static final int GL_UNSIGNED_INT_SAMPLER_1D_ARRAY_EXT = 36310;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_ARRAY_EXT = 36311;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER_EXT = 36312;
    public static final int GL_MIN_PROGRAM_TEXEL_OFFSET_EXT = 35076;
    public static final int GL_MAX_PROGRAM_TEXEL_OFFSET_EXT = 35077;

    protected EXTGPUShader4() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glVertexAttribI1iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glVertexAttribI2iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glVertexAttribI3iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glVertexAttribI4iEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void glVertexAttribI1uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glVertexAttribI2uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glVertexAttribI3uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    public static native void glVertexAttribI4uiEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLint") int r4);

    public static native void nglVertexAttribI1ivEXT(int r0, long r1);

    public static void glVertexAttribI1ivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI1ivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI2ivEXT(int r0, long r1);

    public static void glVertexAttribI2ivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI2ivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI3ivEXT(int r0, long r1);

    public static void glVertexAttribI3ivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI3ivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI4ivEXT(int r0, long r1);

    public static void glVertexAttribI4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI4ivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI1uivEXT(int r0, long r1);

    public static void glVertexAttribI1uivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI1uivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI2uivEXT(int r0, long r1);

    public static void glVertexAttribI2uivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI2uivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI3uivEXT(int r0, long r1);

    public static void glVertexAttribI3uivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI3uivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI4uivEXT(int r0, long r1);

    public static void glVertexAttribI4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI4uivEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI4bvEXT(int r0, long r1);

    public static void glVertexAttribI4bvEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI4bvEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI4svEXT(int r0, long r1);

    public static void glVertexAttribI4svEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI4svEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI4ubvEXT(int r0, long r1);

    public static void glVertexAttribI4ubvEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLbyte const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI4ubvEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribI4usvEXT(int r0, long r1);

    public static void glVertexAttribI4usvEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglVertexAttribI4usvEXT(r0, r1)
            return
    }

    public static native void nglVertexAttribIPointerEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glVertexAttribIPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglVertexAttribIPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribIPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            nglVertexAttribIPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribIPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglVertexAttribIPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glVertexAttribIPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglVertexAttribIPointerEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglGetVertexAttribIivEXT(int r0, int r1, long r2);

    public static void glGetVertexAttribIivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetVertexAttribIivEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexAttribIiEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetVertexAttribIivEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetVertexAttribIuivEXT(int r0, int r1, long r2);

    public static void glGetVertexAttribIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglGetVertexAttribIuivEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetVertexAttribIuiEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetVertexAttribIuivEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglGetUniformuivEXT(int r0, int r1, long r2);

    public static void glGetUniformuivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r7) {
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
            nglGetUniformuivEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetUniformuiEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetUniformuivEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
            r10 = r0
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r10
            return r0
        L2a:
            r11 = move-exception
            r0 = r7
            r1 = r8
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void nglBindFragDataLocationEXT(int r0, int r1, long r2);

    public static void glBindFragDataLocationEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r5
            r1 = r6
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglBindFragDataLocationEXT(r0, r1, r2)
            return
    }

    public static void glBindFragDataLocationEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r7) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r8 = r0
            r0 = r8
            int r0 = r0.getPointer()
            r9 = r0
            r0 = r8
            r1 = r7
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L27
            r0 = r8
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L27
            r10 = r0
            r0 = r5
            r1 = r6
            r2 = r10
            nglBindFragDataLocationEXT(r0, r1, r2)     // Catch: java.lang.Throwable -> L27
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            goto L32
        L27:
            r12 = move-exception
            r0 = r8
            r1 = r9
            r0.setPointer(r1)
            r0 = r12
            throw r0
        L32:
            return
    }

    public static native int nglGetFragDataLocationEXT(int r0, long r1);

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetFragDataLocationEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nglGetFragDataLocationEXT(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetFragDataLocationEXT(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L26
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r4
            r1 = r8
            int r0 = nglGetFragDataLocationEXT(r0, r1)     // Catch: java.lang.Throwable -> L26
            r10 = r0
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            return r0
        L26:
            r11 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r11
            throw r0
    }

    public static native void glUniform1uiEXT(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    public static native void glUniform2uiEXT(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glUniform3uiEXT(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3);

    public static native void glUniform4uiEXT(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLuint") int r4);

    public static native void nglUniform1uivEXT(int r0, int r1, long r2);

    public static void glUniform1uivEXT(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform1uivEXT(r0, r1, r2)
            return
    }

    public static native void nglUniform2uivEXT(int r0, int r1, long r2);

    public static void glUniform2uivEXT(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 1
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform2uivEXT(r0, r1, r2)
            return
    }

    public static native void nglUniform3uivEXT(int r0, int r1, long r2);

    public static void glUniform3uivEXT(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 / r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform3uivEXT(r0, r1, r2)
            return
    }

    public static native void nglUniform4uivEXT(int r0, int r1, long r2);

    public static void glUniform4uivEXT(@org.lwjgl.system.NativeType("GLint") int r5, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = r1.remaining()
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglUniform4uivEXT(r0, r1, r2)
            return
    }

    public static void glVertexAttribI1ivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI1ivEXT
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

    public static void glVertexAttribI2ivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI2ivEXT
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

    public static void glVertexAttribI3ivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI3ivEXT
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

    public static void glVertexAttribI4ivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI4ivEXT
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

    public static void glVertexAttribI1uivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI1uivEXT
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

    public static void glVertexAttribI2uivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI2uivEXT
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

    public static void glVertexAttribI3uivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI3uivEXT
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

    public static void glVertexAttribI4uivEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI4uivEXT
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

    public static void glVertexAttribI4svEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI4svEXT
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

    public static void glVertexAttribI4usvEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLshort const *") short[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribI4usvEXT
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

    public static void glVertexAttribIPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribIPointerEXT
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

    public static void glVertexAttribIPointerEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glVertexAttribIPointerEXT
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

    public static void glGetVertexAttribIivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribIivEXT
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetVertexAttribIuivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetVertexAttribIuivEXT
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 4
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glGetUniformuivEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLuint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformuivEXT
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

    public static void glUniform1uivEXT(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform1uivEXT
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

    public static void glUniform2uivEXT(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform2uivEXT
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

    public static void glUniform3uivEXT(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform3uivEXT
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

    public static void glUniform4uivEXT(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLuint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniform4uivEXT
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
