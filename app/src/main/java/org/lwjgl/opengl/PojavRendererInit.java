package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PojavRendererInit.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PojavRendererInit.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/PojavRendererInit.class */
public class PojavRendererInit {
    public PojavRendererInit() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void onCreateCapabilities(org.lwjgl.system.FunctionProvider r3) {
            r0 = 0
            r4 = r0
            r0 = r3
            boolean r0 = r0 instanceof org.lwjgl.system.SharedLibrary
            if (r0 == 0) goto L15
            r0 = r3
            org.lwjgl.system.SharedLibrary r0 = (org.lwjgl.system.SharedLibrary) r0
            r5 = r0
            r0 = r5
            java.lang.String r0 = r0.getName()
            r4 = r0
        L15:
            r0 = r4
            boolean r0 = isValidString(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = "org.lwjgl.opengl.libname"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r4 = r0
        L22:
            r0 = r4
            boolean r0 = isValidString(r0)
            if (r0 != 0) goto L31
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "PojavRendererInit: Failed to find Pojav renderer name! Renderer-specific initialization may not work properly"
            r0.println(r1)
        L31:
            r0 = r4
            java.lang.String r1 = "libgl4es_114.so"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L3e
            r0 = r3
            nativeInitGl4esInternals(r0)
        L3e:
            return
    }

    private static boolean isValidString(@javax.annotation.Nullable java.lang.String r2) {
            r0 = r2
            if (r0 == 0) goto Lf
            r0 = r2
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            return r0
    }

    public static native void nativeInitGl4esInternals(org.lwjgl.system.FunctionProvider r0);
}
