package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL31C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL31C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL31C.class */
public class GL31C extends org.lwjgl.opengl.GL30C {
    public static final int GL_R8_SNORM = 36756;
    public static final int GL_RG8_SNORM = 36757;
    public static final int GL_RGB8_SNORM = 36758;
    public static final int GL_RGBA8_SNORM = 36759;
    public static final int GL_R16_SNORM = 36760;
    public static final int GL_RG16_SNORM = 36761;
    public static final int GL_RGB16_SNORM = 36762;
    public static final int GL_RGBA16_SNORM = 36763;
    public static final int GL_SIGNED_NORMALIZED = 36764;
    public static final int GL_SAMPLER_BUFFER = 36290;
    public static final int GL_INT_SAMPLER_2D_RECT = 36301;
    public static final int GL_INT_SAMPLER_BUFFER = 36304;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_RECT = 36309;
    public static final int GL_UNSIGNED_INT_SAMPLER_BUFFER = 36312;
    public static final int GL_COPY_READ_BUFFER = 36662;
    public static final int GL_COPY_WRITE_BUFFER = 36663;
    public static final int GL_PRIMITIVE_RESTART = 36765;
    public static final int GL_PRIMITIVE_RESTART_INDEX = 36766;
    public static final int GL_TEXTURE_BUFFER = 35882;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE = 35883;
    public static final int GL_TEXTURE_BINDING_BUFFER = 35884;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING = 35885;
    public static final int GL_TEXTURE_RECTANGLE = 34037;
    public static final int GL_TEXTURE_BINDING_RECTANGLE = 34038;
    public static final int GL_PROXY_TEXTURE_RECTANGLE = 34039;
    public static final int GL_MAX_RECTANGLE_TEXTURE_SIZE = 34040;
    public static final int GL_SAMPLER_2D_RECT = 35683;
    public static final int GL_SAMPLER_2D_RECT_SHADOW = 35684;
    public static final int GL_UNIFORM_BUFFER = 35345;
    public static final int GL_UNIFORM_BUFFER_BINDING = 35368;
    public static final int GL_UNIFORM_BUFFER_START = 35369;
    public static final int GL_UNIFORM_BUFFER_SIZE = 35370;
    public static final int GL_MAX_VERTEX_UNIFORM_BLOCKS = 35371;
    public static final int GL_MAX_GEOMETRY_UNIFORM_BLOCKS = 35372;
    public static final int GL_MAX_FRAGMENT_UNIFORM_BLOCKS = 35373;
    public static final int GL_MAX_COMBINED_UNIFORM_BLOCKS = 35374;
    public static final int GL_MAX_UNIFORM_BUFFER_BINDINGS = 35375;
    public static final int GL_MAX_UNIFORM_BLOCK_SIZE = 35376;
    public static final int GL_MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS = 35377;
    public static final int GL_MAX_COMBINED_GEOMETRY_UNIFORM_COMPONENTS = 35378;
    public static final int GL_MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS = 35379;
    public static final int GL_UNIFORM_BUFFER_OFFSET_ALIGNMENT = 35380;
    public static final int GL_ACTIVE_UNIFORM_BLOCK_MAX_NAME_LENGTH = 35381;
    public static final int GL_ACTIVE_UNIFORM_BLOCKS = 35382;
    public static final int GL_UNIFORM_TYPE = 35383;
    public static final int GL_UNIFORM_SIZE = 35384;
    public static final int GL_UNIFORM_NAME_LENGTH = 35385;
    public static final int GL_UNIFORM_BLOCK_INDEX = 35386;
    public static final int GL_UNIFORM_OFFSET = 35387;
    public static final int GL_UNIFORM_ARRAY_STRIDE = 35388;
    public static final int GL_UNIFORM_MATRIX_STRIDE = 35389;
    public static final int GL_UNIFORM_IS_ROW_MAJOR = 35390;
    public static final int GL_UNIFORM_BLOCK_BINDING = 35391;
    public static final int GL_UNIFORM_BLOCK_DATA_SIZE = 35392;
    public static final int GL_UNIFORM_BLOCK_NAME_LENGTH = 35393;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORMS = 35394;
    public static final int GL_UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES = 35395;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER = 35396;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_GEOMETRY_SHADER = 35397;
    public static final int GL_UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER = 35398;
    public static final int GL_INVALID_INDEX = -1;

    protected GL31C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glDrawArraysInstanced(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void nglDrawElementsInstanced(int r0, int r1, int r2, long r3, int r5);

    public static void glDrawElementsInstanced(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            nglDrawElementsInstanced(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstanced(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            int r1 = r1 >> r2
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            nglDrawElementsInstanced(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstanced(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5121(0x1401, float:7.176E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsInstanced(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstanced(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5123(0x1403, float:7.179E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsInstanced(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstanced(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5125(0x1405, float:7.182E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsInstanced(r0, r1, r2, r3, r4)
            return
    }

    public static native void glCopyBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLintptr") long r2, @org.lwjgl.system.NativeType("GLintptr") long r4, @org.lwjgl.system.NativeType("GLsizeiptr") long r6);

    public static native void glPrimitiveRestartIndex(@org.lwjgl.system.NativeType("GLuint") int r0);

    public static native void glTexBuffer(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void nglGetUniformIndices(int r0, int r1, long r2, long r4);

    public static void glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetUniformIndices(r0, r1, r2, r3)
            return
    }

    public static void glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence[] r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r9
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            void r1 = org.lwjgl.system.MemoryUtil::memASCII     // Catch: java.lang.Throwable -> L3e
            r2 = r8
            long r0 = org.lwjgl.system.APIUtil.apiArray(r0, r1, r2)     // Catch: java.lang.Throwable -> L3e
            r12 = r0
            r0 = r7
            r1 = r8
            int r1 = r1.length     // Catch: java.lang.Throwable -> L3e
            r2 = r12
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3e
            nglGetUniformIndices(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L3e
            r0 = r12
            r1 = r8
            int r1 = r1.length     // Catch: java.lang.Throwable -> L3e
            org.lwjgl.system.APIUtil.apiArrayFree(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            goto L49
        L3e:
            r14 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L49:
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            int r1 = org.lwjgl.system.MemoryUtil::memASCII     // Catch: java.lang.Throwable -> L45
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]     // Catch: java.lang.Throwable -> L45
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.Throwable -> L45
            long r0 = org.lwjgl.system.APIUtil.apiArray(r0, r1, r2)     // Catch: java.lang.Throwable -> L45
            r11 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L45
            r13 = r0
            r0 = r7
            r1 = 1
            r2 = r11
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L45
            nglGetUniformIndices(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L45
            r0 = r11
            r1 = 1
            org.lwjgl.system.APIUtil.apiArrayFree(r0, r1)     // Catch: java.lang.Throwable -> L45
            r0 = r13
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L45
            r14 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            return r0
        L45:
            r15 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static native void nglGetActiveUniformsiv(int r0, int r1, long r2, int r4, long r5);

    public static void glGetActiveUniformsiv(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetActiveUniformsiv(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetActiveUniformsi(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint const *") int r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L39
            r13 = r0
            r0 = r11
            r1 = r9
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L39
            r14 = r0
            r0 = r8
            r1 = 1
            r2 = r14
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L39
            r3 = r10
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L39
            nglGetActiveUniformsiv(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L39
            r0 = r13
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L39
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L39:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    public static native void nglGetActiveUniformName(int r0, int r1, int r2, long r3, long r5);

    public static void glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetActiveUniformName(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L3e
            r13 = r0
            r0 = r11
            r1 = r10
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L3e
            r14 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3e
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L3e
            nglGetActiveUniformName(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3e
            r0 = r14
            r1 = r13
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L3e:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = r7
            r4 = 35385(0x8a39, float:4.9585E-41)
            int r2 = glGetActiveUniformsi(r2, r3, r4)
            java.lang.String r0 = glGetActiveUniformName(r0, r1, r2)
            return r0
    }

    public static native int nglGetUniformBlockIndex(int r0, long r1);

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetUniformBlockIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nglGetUniformBlockIndex(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLuint")
    public static int glGetUniformBlockIndex(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r5) {
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
            int r0 = nglGetUniformBlockIndex(r0, r1)     // Catch: java.lang.Throwable -> L26
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

    public static native void nglGetActiveUniformBlockiv(int r0, int r1, int r2, long r3);

    public static void glGetActiveUniformBlockiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetActiveUniformBlockiv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetActiveUniformBlocki(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2d
            r11 = r0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L2d
            nglGetActiveUniformBlockiv(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
            r0 = r11
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2d
            r12 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r12
            return r0
        L2d:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
    }

    public static native void nglGetActiveUniformBlockName(int r0, int r1, int r2, long r3, long r5);

    public static void glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        Lb:
            r0 = r8
            r1 = r9
            r2 = r11
            int r2 = r2.remaining()
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetActiveUniformBlockName(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r11 = r0
            r0 = r11
            int r0 = r0.getPointer()
            r12 = r0
            r0 = r11
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L3e
            r13 = r0
            r0 = r11
            r1 = r10
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L3e
            r14 = r0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L3e
            r4 = r14
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L3e
            nglGetActiveUniformBlockName(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L3e
            r0 = r14
            r1 = r13
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0, r1)     // Catch: java.lang.Throwable -> L3e
            r15 = r0
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r15
            return r0
        L3e:
            r16 = move-exception
            r0 = r11
            r1 = r12
            r0.setPointer(r1)
            r0 = r16
            throw r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7) {
            r0 = r6
            r1 = r7
            r2 = r6
            r3 = r7
            r4 = 35393(0x8a41, float:4.9596E-41)
            int r2 = glGetActiveUniformBlocki(r2, r3, r4)
            java.lang.String r0 = glGetActiveUniformBlockName(r0, r1, r2)
            return r0
    }

    public static native void glUniformBlockBinding(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static void glGetUniformIndices(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("GLuint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetUniformIndices
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveUniformsiv(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint const *") int[] r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveUniformsiv
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = r9
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r8
            r1 = r9
            int r1 = r1.length
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetActiveUniformName(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveUniformName
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.remaining()
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glGetActiveUniformBlockiv(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveUniformBlockiv
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveUniformBlockName(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r11, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveUniformBlockName
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r12
            int r2 = r2.remaining()
            r3 = r11
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
