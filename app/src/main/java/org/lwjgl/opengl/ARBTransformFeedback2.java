package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransformFeedback2.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransformFeedback2.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransformFeedback2.class */
public class ARBTransformFeedback2 {
    public static final int GL_TRANSFORM_FEEDBACK = 36386;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_PAUSED = 36387;
    public static final int GL_TRANSFORM_FEEDBACK_BUFFER_ACTIVE = 36388;
    public static final int GL_TRANSFORM_FEEDBACK_BINDING = 36389;

    protected ARBTransformFeedback2() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glBindTransformFeedback(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glBindTransformFeedback(r0, r1)
            return
    }

    public static void nglDeleteTransformFeedbacks(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.nglDeleteTransformFeedbacks(r0, r1)
            return
    }

    public static void glDeleteTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glDeleteTransformFeedbacks(r0)
            return
    }

    public static void glDeleteTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint const *") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glDeleteTransformFeedbacks(r0)
            return
    }

    public static void nglGenTransformFeedbacks(int r4, long r5) {
            r0 = r4
            r1 = r5
            org.lwjgl.opengl.GL40C.nglGenTransformFeedbacks(r0, r1)
            return
    }

    public static void glGenTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glGenTransformFeedbacks(r0)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGenTransformFeedbacks() {
            int r0 = org.lwjgl.opengl.GL40C.glGenTransformFeedbacks()
            return r0
    }

    @org.lwjgl.system.NativeType("GLboolean")
    public static boolean glIsTransformFeedback(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            boolean r0 = org.lwjgl.opengl.GL40C.glIsTransformFeedback(r0)
            return r0
    }

    public static void glPauseTransformFeedback() {
            org.lwjgl.opengl.GL40C.glPauseTransformFeedback()
            return
    }

    public static void glResumeTransformFeedback() {
            org.lwjgl.opengl.GL40C.glResumeTransformFeedback()
            return
    }

    public static void glDrawTransformFeedback(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glDrawTransformFeedback(r0, r1)
            return
    }

    public static void glDeleteTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint const *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glDeleteTransformFeedbacks(r0)
            return
    }

    public static void glGenTransformFeedbacks(@org.lwjgl.system.NativeType("GLuint *") int[] r2) {
            r0 = r2
            org.lwjgl.opengl.GL40C.glGenTransformFeedbacks(r0)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
