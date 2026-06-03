package org.lwjgl.stb;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBPerlin.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBPerlin.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/stb/STBPerlin.class */
public class STBPerlin {
    protected STBPerlin() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native float stb_perlin_noise3(float r0, float r1, float r2, int r3, int r4, int r5);

    public static native float stb_perlin_noise3_seed(float r0, float r1, float r2, int r3, int r4, int r5, int r6);

    public static native float stb_perlin_ridge_noise3(float r0, float r1, float r2, float r3, float r4, float r5, int r6);

    public static native float stb_perlin_fbm_noise3(float r0, float r1, float r2, float r3, float r4, int r5);

    public static native float stb_perlin_turbulence_noise3(float r0, float r1, float r2, float r3, float r4, int r5);

    public static native float stb_perlin_noise3_wrap_nonpow2(float r0, float r1, float r2, int r3, int r4, int r5, @org.lwjgl.system.NativeType("unsigned char") byte r6);

    static {
            org.lwjgl.stb.LibSTB.initialize()
            return
    }
}
