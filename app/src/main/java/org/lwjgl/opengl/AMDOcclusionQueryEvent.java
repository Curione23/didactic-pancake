package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDOcclusionQueryEvent.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDOcclusionQueryEvent.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDOcclusionQueryEvent.class */
public class AMDOcclusionQueryEvent {
    public static final int GL_OCCLUSION_QUERY_EVENT_MASK_AMD = 34639;
    public static final int GL_QUERY_DEPTH_PASS_EVENT_BIT_AMD = 1;
    public static final int GL_QUERY_DEPTH_FAIL_EVENT_BIT_AMD = 2;
    public static final int GL_QUERY_STENCIL_FAIL_EVENT_BIT_AMD = 4;
    public static final int GL_QUERY_DEPTH_BOUNDS_FAIL_EVENT_BIT_AMD = 8;
    public static final int GL_QUERY_ALL_EVENT_BITS_AMD = -1;

    protected AMDOcclusionQueryEvent() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glQueryObjectParameteruiAMD(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLuint") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLuint") int r3);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
