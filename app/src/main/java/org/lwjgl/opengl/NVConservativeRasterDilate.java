package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRasterDilate.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRasterDilate.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRasterDilate.class */
public class NVConservativeRasterDilate {
    public static final int GL_CONSERVATIVE_RASTER_DILATE_NV = 37753;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_RANGE_NV = 37754;
    public static final int GL_CONSERVATIVE_RASTER_DILATE_GRANULARITY_NV = 37755;

    protected NVConservativeRasterDilate() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glConservativeRasterParameterfNV(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
