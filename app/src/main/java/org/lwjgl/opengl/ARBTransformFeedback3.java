package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransformFeedback3.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransformFeedback3.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransformFeedback3.class */
public class ARBTransformFeedback3 {
    public static final int GL_MAX_TRANSFORM_FEEDBACK_BUFFERS = 36464;
    public static final int GL_MAX_VERTEX_STREAMS = 36465;

    protected ARBTransformFeedback3() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glDrawTransformFeedbackStream(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glDrawTransformFeedbackStream(r0, r1, r2)
            return
    }

    public static void glBeginQueryIndexed(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL40C.glBeginQueryIndexed(r0, r1, r2)
            return
    }

    public static void glEndQueryIndexed(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLuint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL40C.glEndQueryIndexed(r0, r1)
            return
    }

    public static void nglGetQueryIndexediv(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL40C.nglGetQueryIndexediv(r0, r1, r2, r3)
            return
    }

    public static void glGetQueryIndexediv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL40C.glGetQueryIndexediv(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetQueryIndexedi(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL40C.glGetQueryIndexedi(r0, r1, r2)
            return r0
    }

    public static void glGetQueryIndexediv(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL40C.glGetQueryIndexediv(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
