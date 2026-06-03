package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVViewportSwizzle.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVViewportSwizzle.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVViewportSwizzle.class */
public class NVViewportSwizzle {
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_X_NV = 37712;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_X_NV = 37713;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Y_NV = 37714;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Y_NV = 37715;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_Z_NV = 37716;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_Z_NV = 37717;
    public static final int GL_VIEWPORT_SWIZZLE_POSITIVE_W_NV = 37718;
    public static final int GL_VIEWPORT_SWIZZLE_NEGATIVE_W_NV = 37719;
    public static final int GL_VIEWPORT_SWIZZLE_X_NV = 37720;
    public static final int GL_VIEWPORT_SWIZZLE_Y_NV = 37721;
    public static final int GL_VIEWPORT_SWIZZLE_Z_NV = 37722;
    public static final int GL_VIEWPORT_SWIZZLE_W_NV = 37723;

    protected NVViewportSwizzle() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glViewportSwizzleNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum") int r4);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
