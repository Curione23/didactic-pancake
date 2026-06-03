package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureView.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureView.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTextureView.class */
public class ARBTextureView {
    public static final int GL_TEXTURE_VIEW_MIN_LEVEL = 33499;
    public static final int GL_TEXTURE_VIEW_NUM_LEVELS = 33500;
    public static final int GL_TEXTURE_VIEW_MIN_LAYER = 33501;
    public static final int GL_TEXTURE_VIEW_NUM_LAYERS = 33502;
    public static final int GL_TEXTURE_IMMUTABLE_LEVELS = 33503;

    protected ARBTextureView() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glTextureView(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLuint") int r13, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLuint") int r15, @org.lwjgl.system.NativeType("GLuint") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL43C.glTextureView(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
