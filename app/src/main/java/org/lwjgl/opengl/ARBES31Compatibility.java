package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBES31Compatibility.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBES31Compatibility.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBES31Compatibility.class */
public class ARBES31Compatibility {
    protected ARBES31Compatibility() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glMemoryBarrierByRegion(@org.lwjgl.system.NativeType("GLbitfield") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL45C.glMemoryBarrierByRegion(r0)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
