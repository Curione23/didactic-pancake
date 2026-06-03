package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVTransformFeedback.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVTransformFeedback.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVTransformFeedback.class */
public class NVTransformFeedback {
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_NV = 35982;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_START_NV = 35972;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_SIZE_NV = 35973;
    public static final int GL_TRANSFORM_FEEDBACK_RECORD_NV = 35974;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_BINDING_NV = 35983;
    public static final int GL_INTERLEAVED_ATTRIBS_NV = 35980;
    public static final int GL_SEPARATE_ATTRIBS_NV = 35981;
    public static final int GL_PRIMITIVES_GENERATED_NV = 35975;
    public static final int GL_TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN_NV = 35976;
    public static final int GL_RASTERIZER_DISCARD_NV = 35977;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS_NV = 35978;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS_NV = 35979;
    public static final int GL_MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS_NV = 35968;
    public static final int GL_TRANSFORM_FEEDBACK_ATTRIBS_NV = 35966;
    public static final int GL_ACTIVE_VARYINGS_NV = 35969;
    public static final int GL_ACTIVE_VARYING_MAX_LENGTH_NV = 35970;
    public static final int GL_TRANSFORM_FEEDBACK_VARYINGS_NV = 35971;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_MODE_NV = 35967;
    public static final int GL_BACK_PRIMARY_COLOR_NV = 35959;
    public static final int GL_BACK_SECONDARY_COLOR_NV = 35960;
    public static final int GL_TEXTURE_COORD_NV = 35961;
    public static final int GL_CLIP_DISTANCE_NV = 35962;
    public static final int GL_VERTEX_ID_NV = 35963;
    public static final int GL_PRIMITIVE_ID_NV = 35964;
    public static final int GL_GENERIC_ATTRIB_NV = 35965;
    public static final int GL_SECONDARY_COLOR_NV = 34093;
    public static final int GL_LAYER_NV = 36266;

    protected NVTransformFeedback() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBeginTransformFeedbackNV(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glEndTransformFeedbackNV();

    public static native void nglTransformFeedbackAttribsNV(int r0, long r1, int r3);

    public static void glTransformFeedbackAttribsNV(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r5
            int r0 = r0.remaining()
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r6
            nglTransformFeedbackAttribsNV(r0, r1, r2)
            return
    }

    public static native void glBindBufferRangeNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLintptr") long r3, @org.lwjgl.system.NativeType("GLsizeiptr") long r5);

    public static native void glBindBufferOffsetNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLintptr") long r3);

    public static native void glBindBufferBaseNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    public static native void nglTransformFeedbackVaryingsNV(int r0, int r1, long r2, int r4);

    public static void glTransformFeedbackVaryingsNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLenum") int r8) {
            r0 = r6
            r1 = r7
            int r1 = r1.remaining()
            r2 = r7
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r8
            nglTransformFeedbackVaryingsNV(r0, r1, r2, r3)
            return
    }

    public static native void nglActiveVaryingNV(int r0, long r1);

    public static void glActiveVaryingNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglActiveVaryingNV(r0, r1)
            return
    }

    public static void glActiveVaryingNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r5) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r6 = r0
            r0 = r6
            int r0 = r0.getPointer()
            r7 = r0
            r0 = r6
            r1 = r5
            r2 = 1
            int r0 = r0.nASCII(r1, r2)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L24
            r8 = r0
            r0 = r4
            r1 = r8
            nglActiveVaryingNV(r0, r1)     // Catch: java.lang.Throwable -> L24
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            goto L2e
        L24:
            r10 = move-exception
            r0 = r6
            r1 = r7
            r0.setPointer(r1)
            r0 = r10
            throw r0
        L2e:
            return
    }

    public static native int nglGetVaryingLocationNV(int r0, long r1);

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetVaryingLocationNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r5
            org.lwjgl.system.Checks.checkNT1(r0)
        La:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            int r0 = nglGetVaryingLocationNV(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLint")
    public static int glGetVaryingLocationNV(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r5) {
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
            int r0 = nglGetVaryingLocationNV(r0, r1)     // Catch: java.lang.Throwable -> L26
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

    public static native void nglGetActiveVaryingNV(int r0, int r1, int r2, long r3, long r5, long r7, long r9);

    public static void glGetActiveVaryingNV(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r14, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r15, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r16, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r17) {
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
            nglGetActiveVaryingNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglGetTransformFeedbackVaryingNV(int r0, int r1, long r2);

    public static void glGetTransformFeedbackVaryingNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7) {
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
            nglGetTransformFeedbackVaryingNV(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetTransformFeedbackVaryingNV(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
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
            nglGetTransformFeedbackVaryingNV(r0, r1, r2)     // Catch: java.lang.Throwable -> L2a
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

    public static native void nglTransformFeedbackStreamAttribsNV(int r0, long r1, int r3, long r4, int r6);

    public static void glTransformFeedbackStreamAttribsNV(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            r0 = r8
            int r0 = r0.remaining()
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            int r2 = r2.remaining()
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            nglTransformFeedbackStreamAttribsNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glTransformFeedbackAttribsNV(@org.lwjgl.system.NativeType("GLint const *") int[] r6, @org.lwjgl.system.NativeType("GLenum") int r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTransformFeedbackAttribsNV
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            int r0 = r0.length
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    public static void glTransformFeedbackVaryingsNV(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8, @org.lwjgl.system.NativeType("GLenum") int r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTransformFeedbackVaryingsNV
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r8
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetActiveVaryingNV(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLuint") int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r13, @org.lwjgl.system.NativeType("GLsizei *") int[] r14, @org.lwjgl.system.NativeType("GLenum *") int[] r15, @org.lwjgl.system.NativeType("GLchar *") java.nio.ByteBuffer r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetActiveVaryingNV
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

    public static void glGetTransformFeedbackVaryingNV(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetTransformFeedbackVaryingNV
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

    public static void glTransformFeedbackStreamAttribsNV(@org.lwjgl.system.NativeType("GLint const *") int[] r8, @org.lwjgl.system.NativeType("GLint const *") int[] r9, @org.lwjgl.system.NativeType("GLenum") int r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glTransformFeedbackStreamAttribsNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r8
            int r0 = r0.length
            r1 = r8
            r2 = r9
            int r2 = r2.length
            r3 = r9
            r4 = r10
            r5 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
