package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTransformFeedback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTransformFeedback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTransformFeedback.class */
public class EXTTransformFeedback {
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_EXT = 35982;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_EXT = 35972;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_EXT = 35973;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_EXT = 35983;
    public static final int GL_INTERLEAVED_ATTRIBS_EXT = 35980;
    public static final int GL_SEPARATE_ATTRIBS_EXT = 35981;
    public static final int GL_PRIMITIVES_GENERATED_EXT = 35975;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_EXT = 35976;
    public static final int GL_RASTERIZER_DISCARD_EXT = 35977;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_EXT = 35978;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_EXT = 35979;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_EXT = 35968;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_EXT = 35971;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_EXT = 35967;
    public static final int GL_TRANSFORM_FEEDBACK_VARYING_MAX_LENGTH_EXT = 35958;

    protected EXTTransformFeedback() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBindBufferRangeEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLintptr") long r3, @org.lwjgl.system.NativeType("GLsizeiptr") long r5);

    public static native void glBindBufferOffsetEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLintptr") long r3);

    public static native void glBindBufferBaseEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void glBeginTransformFeedbackEXT(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glEndTransformFeedbackEXT();

    public static native void nglTransformFeedbackVaryingsEXT(int r0, int r1, long r2, int r4);

    public static void glTransformFeedbackVaryingsEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLchar const * const *") org.lwjgl.PointerBuffer r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            r0 = r6
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r8
            nglTransformFeedbackVaryingsEXT(r0, r1, r2, r3)
            return
    }

    public static void glTransformFeedbackVaryingsEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence[] r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            void r1 = org.lwjgl.system.MemoryUtil::memASCII     // Catch: java.lang.Throwable -> L2f
            r2 = r7
            long r0 = org.lwjgl.system.APIUtil.apiArray(r0, r1, r2)     // Catch: java.lang.Throwable -> L2f
            r11 = r0
            r0 = r6
            r1 = r7
            int r1 = r1.length     // Catch: java.lang.Throwable -> L2f
            r2 = r11
            r3 = r8
            nglTransformFeedbackVaryingsEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L2f
            r0 = r11
            r1 = r7
            int r1 = r1.length     // Catch: java.lang.Throwable -> L2f
            org.lwjgl.system.APIUtil.apiArrayFree(r0, r1)     // Catch: java.lang.Throwable -> L2f
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            goto L3a
        L2f:
            r13 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r13
            throw r0
        L3a:
            return
    }

    public static void glTransformFeedbackVaryingsEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLchar const * const *") java.lang.CharSequence r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r10 = r0
            r0 = r10
            int r0 = r0.getPointer()
            r11 = r0
            r0 = r10
            void r1 = org.lwjgl.system.MemoryUtil::memASCII     // Catch: java.lang.Throwable -> L34
            r2 = 1
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r2]     // Catch: java.lang.Throwable -> L34
            r3 = r2
            r4 = 0
            r5 = r8
            r3[r4] = r5     // Catch: java.lang.Throwable -> L34
            long r0 = org.lwjgl.system.APIUtil.apiArray(r0, r1, r2)     // Catch: java.lang.Throwable -> L34
            r12 = r0
            r0 = r7
            r1 = 1
            r2 = r12
            r3 = r9
            nglTransformFeedbackVaryingsEXT(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L34
            r0 = r12
            r1 = 1
            org.lwjgl.system.APIUtil.apiArrayFree(r0, r1)     // Catch: java.lang.Throwable -> L34
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            goto L3f
        L34:
            r14 = move-exception
            r0 = r10
            r1 = r11
            r0.setPointer(r1)
            r0 = r14
            throw r0
        L3f:
            return
    }

    public static native void nglGetTransformFeedbackVaryingEXT(int r0, int r1, int r2, long r3, long r5, long r7, long r9);

    public static void glGetTransformFeedbackVaryingEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L16
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L16:
            r0 = r12
            r1 = r13
            r2 = r17
            int r2 = r2.remaining()
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)
            r6 = r17
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            nglGetTransformFeedbackVaryingEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetTransformFeedbackVaryingEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r16
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r17 = r0
            r0 = r17
            int r0 = r0.getPointer()
            r18 = r0
            r0 = r17
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L5d
            r19 = r0
            r0 = r17
            r1 = r14
            java.nio.ByteBuffer r0 = r0.malloc(r1)     // Catch: java.lang.Throwable -> L5d
            r20 = r0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r19
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L5d
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L5d
            r5 = r16
            long r5 = org.lwjgl.system.MemoryUtil.memAddress(r5)     // Catch: java.lang.Throwable -> L5d
            r6 = r20
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)     // Catch: java.lang.Throwable -> L5d
            nglGetTransformFeedbackVaryingEXT(r0, r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L5d
            r0 = r20
            r1 = r19
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0, r1)     // Catch: java.lang.Throwable -> L5d
            r21 = r0
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r21
            return r0
        L5d:
            r22 = move-exception
            r0 = r17
            r1 = r18
            r0.setPointer(r1)
            r0 = r22
            throw r0
    }

    @org.lwjgl.system.NativeType("void")
    public static java.lang.String glGetTransformFeedbackVaryingEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r9) {
            r0 = r6
            r1 = r7
            org.lwjgl.opengl.GLCapabilities r2 = org.lwjgl.opengl.GL.getCapabilities()
            boolean r2 = r2.OpenGL20
            if (r2 == 0) goto L14
            r2 = r6
            r3 = 35958(0x8c76, float:5.0388E-41)
            int r2 = org.lwjgl.opengl.GL20.glGetProgrami(r2, r3)
            goto L1a
        L14:
            r2 = r6
            r3 = 35958(0x8c76, float:5.0388E-41)
            int r2 = org.lwjgl.opengl.ARBShaderObjects.glGetObjectParameteriARB(r2, r3)
        L1a:
            r3 = r8
            r4 = r9
            java.lang.String r0 = glGetTransformFeedbackVaryingEXT(r0, r1, r2, r3, r4)
            return r0
    }

    public static void nglGetIntegerIndexedvEXT(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.EXTDrawBuffers2.nglGetIntegerIndexedvEXT(r0, r1, r2)
            return
    }

    public static void glGetIntegerIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.EXTDrawBuffers2.glGetIntegerIndexedvEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetIntegerIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            int r0 = org.lwjgl.opengl.EXTDrawBuffers2.glGetIntegerIndexedEXT(r0, r1)
            return r0
    }

    public static void nglGetBooleanIndexedvEXT(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.EXTDrawBuffers2.nglGetBooleanIndexedvEXT(r0, r1, r2)
            return
    }

    public static void glGetBooleanIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLboolean *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.EXTDrawBuffers2.glGetBooleanIndexedvEXT(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static boolean glGetBooleanIndexedEXT(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            boolean r0 = org.lwjgl.opengl.EXTDrawBuffers2.glGetBooleanIndexedEXT(r0, r1)
            return r0
    }

    public static void glGetTransformFeedbackVaryingEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @org.lwjgl.system.NativeType("GLsizei *") int[] r14, @org.lwjgl.system.NativeType("GLenum *") int[] r15, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTransformFeedbackVaryingEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.checkSafe(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r15
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r11
            r1 = r12
            r2 = r16
            int r2 = r2.remaining()
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            long r6 = org.lwjgl.system.MemoryUtil.memAddress(r6)
            r7 = r17
            org.lwjgl.system.JNI.callPPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glGetIntegerIndexedvEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLint *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.EXTDrawBuffers2.glGetIntegerIndexedvEXT(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
