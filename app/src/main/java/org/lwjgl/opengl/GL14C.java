package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL14C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL14C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL14C.class */
public class GL14C extends org.lwjgl.opengl.GL13C {
    public static final int GL_CONSTANT_COLOR = 32769;
    public static final int GL_ONE_MINUS_CONSTANT_COLOR = 32770;
    public static final int GL_CONSTANT_ALPHA = 32771;
    public static final int GL_ONE_MINUS_CONSTANT_ALPHA = 32772;
    public static final int GL_FUNC_ADD = 32774;
    public static final int GL_MIN = 32775;
    public static final int GL_MAX = 32776;
    public static final int GL_FUNC_SUBTRACT = 32778;
    public static final int GL_FUNC_REVERSE_SUBTRACT = 32779;
    public static final int GL_DEPTH_COMPONENT16 = 33189;
    public static final int GL_DEPTH_COMPONENT24 = 33190;
    public static final int GL_DEPTH_COMPONENT32 = 33191;
    public static final int GL_TEXTURE_DEPTH_SIZE = 34890;
    public static final int GL_TEXTURE_COMPARE_MODE = 34892;
    public static final int GL_TEXTURE_COMPARE_FUNC = 34893;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE = 33064;
    public static final int GL_BLEND_DST_RGB = 32968;
    public static final int GL_BLEND_SRC_RGB = 32969;
    public static final int GL_BLEND_DST_ALPHA = 32970;
    public static final int GL_BLEND_SRC_ALPHA = 32971;
    public static final int GL_INCR_WRAP = 34055;
    public static final int GL_DECR_WRAP = 34056;
    public static final int GL_TEXTURE_LOD_BIAS = 34049;
    public static final int GL_MAX_TEXTURE_LOD_BIAS = 34045;
    public static final int GL_MIRRORED_REPEAT = 33648;

    protected GL14C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glBlendColor(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2, @org.lwjgl.system.NativeType("GLfloat") float r3);

    public static native void glBlendEquation(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void nglMultiDrawArrays(int r0, long r1, long r3, int r5);

    public static void glMultiDrawArrays(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r9
            r1 = r8
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r7
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r8
            int r3 = r3.remaining()
            nglMultiDrawArrays(r0, r1, r2, r3)
            return
    }

    public static native void nglMultiDrawElements(int r0, long r1, int r3, long r4, int r6);

    public static void glMultiDrawElements(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const **") org.lwjgl.PointerBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r11
            r1 = r9
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            r0 = r8
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r9
            int r4 = r4.remaining()
            nglMultiDrawElements(r0, r1, r2, r3, r4)
            return
    }

    public static native void glPointParameterf(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glPointParameteri(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void nglPointParameterfv(int r0, long r1);

    public static void glPointParameterfv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglPointParameterfv(r0, r1)
            return
    }

    public static native void nglPointParameteriv(int r0, long r1);

    public static void glPointParameteriv(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglPointParameteriv(r0, r1)
            return
    }

    public static native void glBlendFuncSeparate(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLenum") int r3);

    public static void glMultiDrawArrays(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint const *") int[] r8, @org.lwjgl.system.NativeType("GLsizei const *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiDrawArrays
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            r1 = r8
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r8
            int r3 = r3.length
            r4 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawElements(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLsizei *") int[] r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const **") org.lwjgl.PointerBuffer r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiDrawElements
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r10
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r10
            int r4 = r4.length
            r5 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glPointParameterfv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPointParameterfv
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

    public static void glPointParameteriv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint const *") int[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPointParameteriv
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

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
