package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL42C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL42C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL42C.class */
public class GL42C extends org.lwjgl.opengl.GL41C {
    public static final int GL_COPY_READ_BUFFER_BINDING = 36662;
    public static final int GL_COPY_WRITE_BUFFER_BINDING = 36663;
    public static final int GL_TRANSFORM_FEEDBACK_ACTIVE = 36388;
    public static final int GL_TRANSFORM_FEEDBACK_PAUSED = 36387;
    public static final int GL_COMPRESSED_RGBA_BPTC_UNORM = 36492;
    public static final int GL_COMPRESSED_SRGB_ALPHA_BPTC_UNORM = 36493;
    public static final int GL_COMPRESSED_RGB_BPTC_SIGNED_FLOAT = 36494;
    public static final int GL_COMPRESSED_RGB_BPTC_UNSIGNED_FLOAT = 36495;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_WIDTH = 37159;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_HEIGHT = 37160;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_DEPTH = 37161;
    public static final int GL_UNPACK_COMPRESSED_BLOCK_SIZE = 37162;
    public static final int GL_PACK_COMPRESSED_BLOCK_WIDTH = 37163;
    public static final int GL_PACK_COMPRESSED_BLOCK_HEIGHT = 37164;
    public static final int GL_PACK_COMPRESSED_BLOCK_DEPTH = 37165;
    public static final int GL_PACK_COMPRESSED_BLOCK_SIZE = 37166;
    public static final int GL_ATOMIC_COUNTER_BUFFER = 37568;
    public static final int GL_ATOMIC_COUNTER_BUFFER_BINDING = 37569;
    public static final int GL_ATOMIC_COUNTER_BUFFER_START = 37570;
    public static final int GL_ATOMIC_COUNTER_BUFFER_SIZE = 37571;
    public static final int GL_ATOMIC_COUNTER_BUFFER_DATA_SIZE = 37572;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTERS = 37573;
    public static final int GL_ATOMIC_COUNTER_BUFFER_ACTIVE_ATOMIC_COUNTER_INDICES = 37574;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_VERTEX_SHADER = 37575;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_CONTROL_SHADER = 37576;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_TESS_EVALUATION_SHADER = 37577;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_GEOMETRY_SHADER = 37578;
    public static final int GL_ATOMIC_COUNTER_BUFFER_REFERENCED_BY_FRAGMENT_SHADER = 37579;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTER_BUFFERS = 37580;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTER_BUFFERS = 37581;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTER_BUFFERS = 37582;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTER_BUFFERS = 37583;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTER_BUFFERS = 37584;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTER_BUFFERS = 37585;
    public static final int GL_MAX_VERTEX_ATOMIC_COUNTERS = 37586;
    public static final int GL_MAX_TESS_CONTROL_ATOMIC_COUNTERS = 37587;
    public static final int GL_MAX_TESS_EVALUATION_ATOMIC_COUNTERS = 37588;
    public static final int GL_MAX_GEOMETRY_ATOMIC_COUNTERS = 37589;
    public static final int GL_MAX_FRAGMENT_ATOMIC_COUNTERS = 37590;
    public static final int GL_MAX_COMBINED_ATOMIC_COUNTERS = 37591;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_SIZE = 37592;
    public static final int GL_MAX_ATOMIC_COUNTER_BUFFER_BINDINGS = 37596;
    public static final int GL_ACTIVE_ATOMIC_COUNTER_BUFFERS = 37593;
    public static final int GL_UNIFORM_ATOMIC_COUNTER_BUFFER_INDEX = 37594;
    public static final int GL_UNSIGNED_INT_ATOMIC_COUNTER = 37595;
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT = 37167;
    public static final int GL_MAX_IMAGE_UNITS = 36664;
    public static final int GL_MAX_COMBINED_IMAGE_UNITS_AND_FRAGMENT_OUTPUTS = 36665;
    public static final int GL_MAX_IMAGE_SAMPLES = 36973;
    public static final int GL_MAX_VERTEX_IMAGE_UNIFORMS = 37066;
    public static final int GL_MAX_TESS_CONTROL_IMAGE_UNIFORMS = 37067;
    public static final int GL_MAX_TESS_EVALUATION_IMAGE_UNIFORMS = 37068;
    public static final int GL_MAX_GEOMETRY_IMAGE_UNIFORMS = 37069;
    public static final int GL_MAX_FRAGMENT_IMAGE_UNIFORMS = 37070;
    public static final int GL_MAX_COMBINED_IMAGE_UNIFORMS = 37071;
    public static final int GL_IMAGE_BINDING_NAME = 36666;
    public static final int GL_IMAGE_BINDING_LEVEL = 36667;
    public static final int GL_IMAGE_BINDING_LAYERED = 36668;
    public static final int GL_IMAGE_BINDING_LAYER = 36669;
    public static final int GL_IMAGE_BINDING_ACCESS = 36670;
    public static final int GL_IMAGE_BINDING_FORMAT = 36974;
    public static final int GL_VERTEX_ATTRIB_ARRAY_BARRIER_BIT = 1;
    public static final int GL_ELEMENT_ARRAY_BARRIER_BIT = 2;
    public static final int GL_UNIFORM_BARRIER_BIT = 4;
    public static final int GL_TEXTURE_FETCH_BARRIER_BIT = 8;
    public static final int GL_SHADER_IMAGE_ACCESS_BARRIER_BIT = 32;
    public static final int GL_COMMAND_BARRIER_BIT = 64;
    public static final int GL_PIXEL_BUFFER_BARRIER_BIT = 128;
    public static final int GL_TEXTURE_UPDATE_BARRIER_BIT = 256;
    public static final int GL_BUFFER_UPDATE_BARRIER_BIT = 512;
    public static final int GL_FRAMEBUFFER_BARRIER_BIT = 1024;
    public static final int GL_TRANSFORM_FEEDBACK_BARRIER_BIT = 2048;
    public static final int GL_ATOMIC_COUNTER_BARRIER_BIT = 4096;
    public static final int GL_ALL_BARRIER_BITS = -1;
    public static final int GL_IMAGE_1D = 36940;
    public static final int GL_IMAGE_2D = 36941;
    public static final int GL_IMAGE_3D = 36942;
    public static final int GL_IMAGE_2D_RECT = 36943;
    public static final int GL_IMAGE_CUBE = 36944;
    public static final int GL_IMAGE_BUFFER = 36945;
    public static final int GL_IMAGE_1D_ARRAY = 36946;
    public static final int GL_IMAGE_2D_ARRAY = 36947;
    public static final int GL_IMAGE_CUBE_MAP_ARRAY = 36948;
    public static final int GL_IMAGE_2D_MULTISAMPLE = 36949;
    public static final int GL_IMAGE_2D_MULTISAMPLE_ARRAY = 36950;
    public static final int GL_INT_IMAGE_1D = 36951;
    public static final int GL_INT_IMAGE_2D = 36952;
    public static final int GL_INT_IMAGE_3D = 36953;
    public static final int GL_INT_IMAGE_2D_RECT = 36954;
    public static final int GL_INT_IMAGE_CUBE = 36955;
    public static final int GL_INT_IMAGE_BUFFER = 36956;
    public static final int GL_INT_IMAGE_1D_ARRAY = 36957;
    public static final int GL_INT_IMAGE_2D_ARRAY = 36958;
    public static final int GL_INT_IMAGE_CUBE_MAP_ARRAY = 36959;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE = 36960;
    public static final int GL_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 36961;
    public static final int GL_UNSIGNED_INT_IMAGE_1D = 36962;
    public static final int GL_UNSIGNED_INT_IMAGE_2D = 36963;
    public static final int GL_UNSIGNED_INT_IMAGE_3D = 36964;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_RECT = 36965;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE = 36966;
    public static final int GL_UNSIGNED_INT_IMAGE_BUFFER = 36967;
    public static final int GL_UNSIGNED_INT_IMAGE_1D_ARRAY = 36968;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_ARRAY = 36969;
    public static final int GL_UNSIGNED_INT_IMAGE_CUBE_MAP_ARRAY = 36970;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE = 36971;
    public static final int GL_UNSIGNED_INT_IMAGE_2D_MULTISAMPLE_ARRAY = 36972;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_TYPE = 37063;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_SIZE = 37064;
    public static final int GL_IMAGE_FORMAT_COMPATIBILITY_BY_CLASS = 37065;
    public static final int GL_NUM_SAMPLE_COUNTS = 37760;
    public static final int GL_MIN_MAP_BUFFER_ALIGNMENT = 37052;

    protected GL42C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglGetActiveAtomicCounterBufferiv(int r0, int r1, int r2, long r3);

    public static void glGetActiveAtomicCounterBufferiv(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r9) {
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
            nglGetActiveAtomicCounterBufferiv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetActiveAtomicCounterBufferi(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
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
            nglGetActiveAtomicCounterBufferiv(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2d
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

    public static native void glTexStorage1D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void glTexStorage2D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void glTexStorage3D(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    public static native void glDrawTransformFeedbackInstanced(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2);

    public static native void glDrawTransformFeedbackStreamInstanced(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void glDrawArraysInstancedBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLuint") int r4);

    public static native void nglDrawElementsInstancedBaseInstance(int r0, int r1, int r2, long r3, int r5, int r6);

    public static void glDrawElementsInstancedBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLuint") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r13
            r5 = r14
            nglDrawElementsInstancedBaseInstance(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLuint") int r12) {
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
            nglDrawElementsInstancedBaseInstance(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLuint") int r11) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = 5121(0x1401, float:7.176E-42)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            r5 = r11
            nglDrawElementsInstancedBaseInstance(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLuint") int r11) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = 5123(0x1403, float:7.179E-42)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            r5 = r11
            nglDrawElementsInstancedBaseInstance(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glDrawElementsInstancedBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLuint") int r11) {
            r0 = r8
            r1 = r9
            int r1 = r1.remaining()
            r2 = 5125(0x1405, float:7.182E-42)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            r5 = r11
            nglDrawElementsInstancedBaseInstance(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglDrawElementsInstancedBaseVertexBaseInstance(int r0, int r1, int r2, long r3, int r5, int r6, int r7);

    public static void glDrawElementsInstancedBaseVertexBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") long r12, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15, @org.lwjgl.system.NativeType("GLuint") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r14
            r5 = r15
            r6 = r16
            nglDrawElementsInstancedBaseVertexBaseInstance(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLuint") int r14) {
            r0 = r9
            r1 = r11
            int r1 = r1.remaining()
            r2 = r10
            int r2 = org.lwjgl.opengl.GLChecks.typeToByteShift(r2)
            int r1 = r1 >> r2
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            r5 = r13
            r6 = r14
            nglDrawElementsInstancedBaseVertexBaseInstance(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = 5121(0x1401, float:7.176E-42)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            r5 = r12
            r6 = r13
            nglDrawElementsInstancedBaseVertexBaseInstance(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = 5123(0x1403, float:7.179E-42)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            r5 = r12
            r6 = r13
            nglDrawElementsInstancedBaseVertexBaseInstance(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glDrawElementsInstancedBaseVertexBaseInstance(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13) {
            r0 = r9
            r1 = r10
            int r1 = r1.remaining()
            r2 = 5125(0x1405, float:7.182E-42)
            r3 = r10
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r11
            r5 = r12
            r6 = r13
            nglDrawElementsInstancedBaseVertexBaseInstance(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void glBindImageTexture(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLint") int r2, @org.lwjgl.system.NativeType("GLboolean") boolean r3, @org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6);

    public static native void glMemoryBarrier(@org.lwjgl.system.NativeType("GLbitfield") int r0);

    public static native void nglGetInternalformativ(int r0, int r1, int r2, int r3, long r4);

    public static void glGetInternalformativ(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r10) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            int r3 = r3.remaining()
            r4 = r10
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglGetInternalformativ(r0, r1, r2, r3, r4)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetInternalformati(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L2e
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = 1
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L2e
            nglGetInternalformativ(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L2e
            r0 = r12
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L2e
            r13 = r0
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r13
            return r0
        L2e:
            r14 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            throw r0
    }

    public static void glGetActiveAtomicCounterBufferiv(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLint *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveAtomicCounterBufferiv
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

    public static void glGetInternalformativ(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLint *") int[] r11) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetInternalformativ
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            int r3 = r3.length
            r4 = r11
            r5 = r12
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
