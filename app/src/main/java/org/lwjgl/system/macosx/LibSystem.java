package org.lwjgl.system.macosx;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/LibSystem.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/LibSystem.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/macosx/LibSystem.class */
public final class LibSystem {
    private static final org.lwjgl.system.SharedLibrary SYSTEM = null;

    public static org.lwjgl.system.SharedLibrary getLibrary() {
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.macosx.LibSystem.SYSTEM
            return r0
    }

    private LibSystem() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    static {
            java.lang.Class<org.lwjgl.system.macosx.LibSystem> r0 = org.lwjgl.system.macosx.LibSystem.class
            java.lang.String r1 = "org.lwjgl"
            java.lang.String r2 = "System"
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            org.lwjgl.system.macosx.LibSystem.SYSTEM = r0
            return
    }
}
