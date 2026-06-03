package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRasterPreSnapTriangles.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRasterPreSnapTriangles.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRasterPreSnapTriangles.class */
public class NVConservativeRasterPreSnapTriangles {
    public static final int GL_CONSERVATIVE_RASTER_MODE_NV = 38221;
    public static final int GL_CONSERVATIVE_RASTER_MODE_POST_SNAP_NV = 38222;
    public static final int GL_CONSERVATIVE_RASTER_MODE_PRE_SNAP_TRIANGLES_NV = 38223;

    protected NVConservativeRasterPreSnapTriangles() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glConservativeRasterParameteriNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
