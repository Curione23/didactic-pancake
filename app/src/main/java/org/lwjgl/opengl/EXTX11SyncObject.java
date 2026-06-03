package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTX11SyncObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTX11SyncObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTX11SyncObject.class */
public class EXTX11SyncObject {
    public static final int GL_SYNC_X11_FENCE_EXT = 37089;

    protected EXTX11SyncObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("GLsync")
    public static native long glImportSyncEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLintptr") long r1, @org.lwjgl.system.NativeType("GLbitfield") int r3);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
