package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL32.class */
public class GL32 extends org.lwjgl.opengl.GL31 {
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

    protected GL32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglGetBufferParameteri64v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL32C.nglGetBufferParameteri64v(r0, r1, r2)
            return
    }

    public static void glGetBufferParameteri64v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glGetBufferParameteri64v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetBufferParameteri64(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL32C.glGetBufferParameteri64(r0, r1)
            return r0
    }

    public static void nglDrawElementsBaseVertex(int r7, int r8, int r9, long r10, int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            org.lwjgl.opengl.GL32C.nglDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") long r10, @org.lwjgl.system.NativeType("GLint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r12
            org.lwjgl.opengl.GL32C.glDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL32C.glDrawElementsBaseVertex(r0, r1, r2, r3)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glDrawElementsBaseVertex(r0, r1, r2)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glDrawElementsBaseVertex(r0, r1, r2)
            return
    }

    public static void glDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glDrawElementsBaseVertex(r0, r1, r2)
            return
    }

    public static void nglDrawRangeElementsBaseVertex(int r9, int r10, int r11, int r12, int r13, long r14, int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r16
            org.lwjgl.opengl.GL32C.nglDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLuint") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("void const *") long r14, @org.lwjgl.system.NativeType("GLint") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r16
            org.lwjgl.opengl.GL32C.glDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL32C.glDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL32C.glDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL32C.glDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawRangeElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL32C.glDrawRangeElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void nglDrawElementsInstancedBaseVertex(int r8, int r9, int r10, long r11, int r13, int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            org.lwjgl.opengl.GL32C.nglDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            org.lwjgl.opengl.GL32C.glDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLint") int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL32C.glDrawElementsInstancedBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL32C.glDrawElementsInstancedBaseVertex(r0, r1, r2, r3)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL32C.glDrawElementsInstancedBaseVertex(r0, r1, r2, r3)
            return
    }

    public static void glDrawElementsInstancedBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL32C.glDrawElementsInstancedBaseVertex(r0, r1, r2, r3)
            return
    }

    public static void nglMultiDrawElementsBaseVertex(int r10, long r11, int r13, long r14, int r16, long r17) {
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r16
            r5 = r17
            org.lwjgl.opengl.GL32C.nglMultiDrawElementsBaseVertex(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL32C.glMultiDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glProvokingVertex(@org.lwjgl.system.NativeType("GLenum") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL32C.glProvokingVertex(r0)
            return
    }

    public static void glTexImage2DMultisample(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLboolean") boolean r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL32C.glTexImage2DMultisample(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glTexImage3DMultisample(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLboolean") boolean r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            org.lwjgl.opengl.GL32C.glTexImage3DMultisample(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void nglGetMultisamplefv(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL32C.nglGetMultisamplefv(r0, r1, r2)
            return
    }

    public static void glGetMultisamplefv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glGetMultisamplefv(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static float glGetMultisamplef(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            float r0 = org.lwjgl.opengl.GL32C.glGetMultisamplef(r0, r1)
            return r0
    }

    public static void glSampleMaski(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLbitfield") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL32C.glSampleMaski(r0, r1)
            return
    }

    public static void glFramebufferTexture(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint") int r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL32C.glFramebufferTexture(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("GLsync")
    public static long glFenceSync(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLbitfield") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL32C.glFenceSync(r0, r1)
            return r0
    }

    public static boolean nglIsSync(long r3) {
            r0 = r3
            boolean r0 = org.lwjgl.opengl.GL32C.nglIsSync(r0)
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsSync(@org.lwjgl.system.NativeType("GLsync") long r3) {
            r0 = r3
            boolean r0 = org.lwjgl.opengl.GL32C.glIsSync(r0)
            return r0
    }

    public static void nglDeleteSync(long r3) {
            r0 = r3
            org.lwjgl.opengl.GL32C.nglDeleteSync(r0)
            return
    }

    public static void glDeleteSync(@org.lwjgl.system.NativeType("GLsync") long r3) {
            r0 = r3
            org.lwjgl.opengl.GL32C.glDeleteSync(r0)
            return
    }

    public static int nglClientWaitSync(long r6, int r8, long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.opengl.GL32C.nglClientWaitSync(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLenum")
    public static int glClientWaitSync(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8, @org.lwjgl.system.NativeType("GLuint64") long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.opengl.GL32C.glClientWaitSync(r0, r1, r2)
            return r0
    }

    public static void nglWaitSync(long r6, int r8, long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.opengl.GL32C.nglWaitSync(r0, r1, r2)
            return
    }

    public static void glWaitSync(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLbitfield") int r8, @org.lwjgl.system.NativeType("GLuint64") long r9) {
            r0 = r6
            r1 = r8
            r2 = r9
            org.lwjgl.opengl.GL32C.glWaitSync(r0, r1, r2)
            return
    }

    public static void nglGetInteger64v(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL32C.nglGetInteger64v(r0, r1)
            return
    }

    public static void glGetInteger64v(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL32C.glGetInteger64v(r0, r1)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetInteger64(@org.lwjgl.system.NativeType("GLenum") int r3) {
            r0 = r3
            long r0 = org.lwjgl.opengl.GL32C.glGetInteger64(r0)
            return r0
    }

    public static void nglGetInteger64i_v(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL32C.nglGetInteger64i_v(r0, r1, r2)
            return
    }

    public static void glGetInteger64i_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint64 *") java.nio.LongBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glGetInteger64i_v(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static long glGetInteger64i(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            long r0 = org.lwjgl.opengl.GL32C.glGetInteger64i(r0, r1)
            return r0
    }

    public static void nglGetSynciv(long r9, int r11, int r12, long r13, long r15) {
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL32C.nglGetSynciv(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetSynciv(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.opengl.GL32C.glGetSynciv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetSynci(@org.lwjgl.system.NativeType("GLsync") long r5, @org.lwjgl.system.NativeType("GLenum") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            int r0 = org.lwjgl.opengl.GL32C.glGetSynci(r0, r1, r2)
            return r0
    }

    public static void glGetBufferParameteri64v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint64 *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glGetBufferParameteri64v(r0, r1, r2)
            return
    }

    public static void glMultiDrawElementsBaseVertex(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLsizei const *") int[] r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const * const *") org.lwjgl.PointerBuffer r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL32C.glMultiDrawElementsBaseVertex(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetMultisamplefv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLfloat *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glGetMultisamplefv(r0, r1, r2)
            return
    }

    public static void glGetInteger64v(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLint64 *") long[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL32C.glGetInteger64v(r0, r1)
            return
    }

    public static void glGetInteger64i_v(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint64 *") long[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL32C.glGetInteger64i_v(r0, r1, r2)
            return
    }

    public static void glGetSynciv(@org.lwjgl.system.NativeType("GLsync") long r6, @org.lwjgl.system.NativeType("GLenum") int r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.opengl.GL32C.glGetSynciv(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
