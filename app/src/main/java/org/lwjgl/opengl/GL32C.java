package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL32C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL32C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL32C.class */
public class GL32C extends org.lwjgl.opengl.GL31C {
    public static final int GL_CONTEXT_PROFILE_MASK = 37158;
    public static final int GL_CONTEXT_CORE_PROFILE_BIT = 1;
    public static final int GL_CONTEXT_COMPATIBILITY_PROFILE_BIT = 2;
    public static final int GL_MAX_VERTEX_OUTPUT_COMPONENTS = 37154;
    public static final int GL_MAX_GEOMETRY_INPUT_COMPONENTS = 37155;
    public static final int GL_MAX_GEOMETRY_OUTPUT_COMPONENTS = 37156;
    public static final int GL_MAX_FRAGMENT_INPUT_COMPONENTS = 37157;
    public static final int GL_FIRST_VERTEX_CONVENTION = 36429;
    public static final int GL_LAST_VERTEX_CONVENTION = 36430;
    public static final int GL_PROVOKING_VERTEX = 36431;
    public static final int GL_QUADS_FOLLOW_PROVOKING_VERTEX_CONVENTION = 36428;
    public static final int GL_TEXTURE_CUBE_MAP_SEAMLESS = 34895;
    public static final int GL_SAMPLE_POSITION = 36432;
    public static final int GL_SAMPLE_MASK = 36433;
    public static final int GL_SAMPLE_MASK_VALUE = 36434;
    public static final int GL_TEXTURE_2D_MULTISAMPLE = 37120;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE = 37121;
    public static final int GL_TEXTURE_2D_MULTISAMPLE_ARRAY = 37122;
    public static final int GL_PROXY_TEXTURE_2D_MULTISAMPLE_ARRAY = 37123;
    public static final int GL_MAX_SAMPLE_MASK_WORDS = 36441;
    public static final int GL_MAX_COLOR_TEXTURE_SAMPLES = 37134;
    public static final int GL_MAX_DEPTH_TEXTURE_SAMPLES = 37135;
    public static final int GL_MAX_INTEGER_SAMPLES = 37136;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE = 37124;
    public static final int GL_TEXTURE_BINDING_2D_MULTISAMPLE_ARRAY = 37125;
    public static final int GL_TEXTURE_SAMPLES = 37126;
    public static final int GL_TEXTURE_FIXED_SAMPLE_LOCATIONS = 37127;
    public static final int GL_SAMPLER_2D_MULTISAMPLE = 37128;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE = 37129;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE = 37130;
    public static final int GL_SAMPLER_2D_MULTISAMPLE_ARRAY = 37131;
    public static final int GL_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37132;
    public static final int GL_UNSIGNED_INT_SAMPLER_2D_MULTISAMPLE_ARRAY = 37133;
    public static final int GL_DEPTH_CLAMP = 34383;
    public static final int GL_GEOMETRY_SHADER = 36313;
    public static final int GL_GEOMETRY_VERTICES_OUT = 36314;
    public static final int GL_GEOMETRY_INPUT_TYPE = 36315;
    public static final int GL_GEOMETRY_OUTPUT_TYPE = 36316;
    public static final int GL_MAX_GEOMETRY_TEXTURE_IMAGE_UNITS = 35881;
    public static final int GL_MAX_GEOMETRY_UNIFORM_COMPONENTS = 36319;
    public static final int GL_MAX_GEOMETRY_OUTPUT_VERTICES = 36320;
    public static final int GL_MAX_GEOMETRY_TOTAL_OUTPUT_COMPONENTS = 36321;
    public static final int GL_LINES_ADJACENCY = 10;
    public static final int GL_LINE_STRIP_ADJACENCY = 11;
    public static final int GL_TRIANGLES_ADJACENCY = 12;
    public static final int GL_TRIANGLE_STRIP_ADJACENCY = 13;
    public static final int GL_FRAMEBUFFER_INCOMPLETE_LAYER_TARGETS = 36264;
    public static final int GL_FRAMEBUFFER_ATTACHMENT_LAYERED = 36263;
    public static final int GL_PROGRAM_POINT_SIZE = 34370;
    public static final int GL_MAX_SERVER_WAIT_TIMEOUT = 37137;
    public static final int GL_OBJECT_TYPE = 37138;
    public static final int GL_SYNC_CONDITION = 37139;
    public static final int GL_SYNC_STATUS = 37140;
    public static final int GL_SYNC_FLAGS = 37141;
    public static final int GL_SYNC_FENCE = 37142;
    public static final int GL_SYNC_GPU_COMMANDS_COMPLETE = 37143;
    public static final int GL_UNSIGNALED = 37144;
    public static final int GL_SIGNALED = 37145;
    public static final int GL_SYNC_FLUSH_COMMANDS_BIT = 1;
    public static final long GL_TIMEOUT_IGNORED = -1;
    public static final int GL_ALREADY_SIGNALED = 37146;
    public static final int GL_TIMEOUT_EXPIRED = 37147;
    public static final int GL_CONDITION_SATISFIED = 37148;
    public static final int GL_WAIT_FAILED = 37149;

    protected GL32C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglGetBufferParameteri64v(int r0, int r1, long r2);

    public static void glGetBufferParameteri64v(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r7) {
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
            nglGetBufferParameteri64v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetBufferParameteri64(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
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
            nglGetBufferParameteri64v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglDrawElementsBaseVertex(int r0, int r1, int r2, long r3, int r5);

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") long r10, @org.lwjgl.system.NativeType("GLint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            nglDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLint") int r10) {
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
            nglDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLint") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5121(0x1401, float:7.176E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8, @org.lwjgl.system.NativeType("GLint") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5123(0x1403, float:7.179E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLint") int r9) {
            r0 = r7
            r1 = r8
            int r1 = r1.remaining()
            r2 = 5125(0x1405, float:7.182E-42)
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            nglDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglDrawRangeElementsBaseVertex(int r0, int r1, int r2, int r3, int r4, long r5, int r7);

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") long r14, @org.lwjgl.system.NativeType("GLint") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r16
            nglDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r13, @org.lwjgl.system.NativeType("GLint") int r14) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            int r3 = r3.remaining()
            r4 = r12
            int r4 = org.lwjgl.opengl.GLChecks.typeToByteShift(r4)
            int r3 = r3 >> r4
            r4 = r12
            r5 = r13
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r14
            nglDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLint") int r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            int r3 = r3.remaining()
            r4 = 5121(0x1401, float:7.176E-42)
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r13
            nglDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r12, @org.lwjgl.system.NativeType("GLint") int r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            int r3 = r3.remaining()
            r4 = 5123(0x1403, float:7.179E-42)
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r13
            nglDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("GLint") int r13) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            int r3 = r3.remaining()
            r4 = 5125(0x1405, float:7.182E-42)
            r5 = r12
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r13
            nglDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglDrawElementsInstancedBaseVertex(int r0, int r1, int r2, long r3, int r5, int r6);

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            nglDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLint") int r12) {
            r0 = r8
            r1 = r10
            int r1 = r1.remaining()
            r2 = r9
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            int r1 = r1 >> r2
            r2 = r9
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            r5 = r12
            nglDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLint") int r11) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = 5121(0x1401, float:7.176E-42)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            r5 = r11
            nglDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLint") int r11) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = 5123(0x1403, float:7.179E-42)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            r5 = r11
            nglDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLint") int r11) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = 5125(0x1405, float:7.182E-42)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            r5 = r11
            nglDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglMultiDrawElementsBaseVertex(int r0, long r1, int r3, long r4, int r6, long r7);

    public static void glMultiDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r10, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r11
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r11
            boolean r0 = r0.hasRemaining()
            if (r0 == 0) goto L34
            r0 = r7
            r1 = r8
            int r1 = r1.get()
            r2 = r9
            r3 = r10
            long r3 = r3.get()
            r4 = r11
            int r4 = r4.get()
            glDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            goto L17
        L34:
            return
    }

    public static native void glProvokingVertex(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glTexImage2DMultisample(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5);

    public static native void glTexImage3DMultisample(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLboolean") boolean r6);

    public static native void nglGetMultisamplefv(int r0, int r1, long r2);

    public static void glGetMultisamplefv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r7) {
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
            nglGetMultisamplefv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMultisamplef(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r7 = r0
            r0 = r7
            int r0 = r0.getPointer()
            r8 = r0
            r0 = r7
            r1 = 1
            java.nio.FloatBuffer r0 = r0.callocFloat(r1)     // Catch: java.lang.Throwable -> L2a
            r9 = r0
            r0 = r5
            r1 = r6
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L2a
            nglGetMultisamplefv(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
            r0 = r9
            r1 = 0
            float r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2a
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

    public static native void glSampleMaski(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLbitfield") int r1);

    public static native void glFramebufferTexture(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3);

    @org.lwjgl.system.NativeType("GLsync")
    public static native long glFenceSync(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLbitfield") int r1);

    public static native boolean nglIsSync(long r0);

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsSync(@org.lwjgl.system.NativeType("GLsync") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            boolean r0 = nglIsSync(r0)
            return r0
    }

    public static native void nglDeleteSync(long r0);

    public static void glDeleteSync(@org.lwjgl.system.NativeType("GLsync") long r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r3
            nglDeleteSync(r0)
            return
    }

    public static native int nglClientWaitSync(long r0, int r2, long r3);

    @org.lwjgl.system.NativeType("GLenum")
    public static int glClientWaitSync(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8, @org.lwjgl.system.NativeType("GLuint64") long r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = nglClientWaitSync(r0, r1, r2)
            return r0
    }

    public static native void nglWaitSync(long r0, int r2, long r3);

    public static void glWaitSync(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8, @org.lwjgl.system.NativeType("GLuint64") long r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            nglWaitSync(r0, r1, r2)
            return
    }

    public static native void nglGetInteger64v(int r0, long r1);

    public static void glGetInteger64v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetInteger64v(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetInteger64(@org.lwjgl.system.NativeType("GLenum") int r4) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r5 = r0
            r0 = r5
            int r0 = r0.getPointer()
            r6 = r0
            r0 = r5
            r1 = 1
            java.nio.LongBuffer r0 = r0.callocLong(r1)     // Catch: java.lang.Throwable -> L26
            r7 = r0
            r0 = r4
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L26
            nglGetInteger64v(r0, r1)     // Catch: java.lang.Throwable -> L26
            r0 = r7
            r1 = 0
            long r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L26
            r8 = r0
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r8
            return r0
        L26:
            r10 = move-exception
            r0 = r5
            r1 = r6
            r0.setPointer(r1)
            r0 = r10
            throw r0
    }

    public static native void nglGetInteger64i_v(int r0, int r1, long r2);

    public static void glGetInteger64i_v(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r7) {
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
            nglGetInteger64i_v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetInteger64i(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
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
            nglGetInteger64i_v(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglGetSynciv(long r0, int r2, int r3, long r4, long r6);

    public static void glGetSynciv(@org.lwjgl.system.NativeType("GLsync") long r9, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r12, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            r0 = r9
            r1 = r11
            r2 = r13
            int r2 = r2.remaining()
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r13
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetSynciv(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetSynci(@org.lwjgl.system.NativeType("GLsync") long r9, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L10
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L10:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L45
            r15 = r0
            r0 = r9
            r1 = r11
            r2 = 1
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)     // Catch: java.lang.Throwable -> L45
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L45
            nglGetSynciv(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L45
            r0 = r15
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L45
            r16 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r16
            return r0
        L45:
            r17 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    public static void glGetBufferParameteri64v(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint64 *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetBufferParameteri64v
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

    public static void glMultiDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLsizei const *") int[] r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r13, @org.lwjgl.system.NativeType("GLint *") int[] r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiDrawElementsBaseVertex
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L21
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = r11
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = r11
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L21:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            int r4 = r4.length
            r5 = r14
            r6 = r15
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glGetMultisamplefv(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLfloat *") float[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetMultisamplefv
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

    public static void glGetInteger64v(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint64 *") long[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetInteger64v
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

    public static void glGetInteger64i_v(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint64 *") long[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetInteger64i_v
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

    public static void glGetSynciv(@org.lwjgl.system.NativeType("GLsync") long r9, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r12, @org.lwjgl.system.NativeType("GLint *") int[] r13) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetSynciv
            r14 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r14
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
        L1e:
            r0 = r9
            r1 = r11
            r2 = r13
            int r2 = r2.length
            r3 = r12
            r4 = r13
            r5 = r14
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
