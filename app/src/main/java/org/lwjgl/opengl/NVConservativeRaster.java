package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRaster.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRaster.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVConservativeRaster.class */
public class NVConservativeRaster {
    public static final int GL_CONSERVATIVE_RASTERIZATION_NV = 37702;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_X_BITS_NV = 37703;
    public static final int GL_SUBPIXEL_PRECISION_BIAS_Y_BITS_NV = 37704;
    public static final int GL_MAX_SUBPIXEL_PRECISION_BIAS_BITS_NV = 37705;

    protected NVConservativeRaster() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glSubpixelPrecisionBiasNV(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLuint") int r1);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
