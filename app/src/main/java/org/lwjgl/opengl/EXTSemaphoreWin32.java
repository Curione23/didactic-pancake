package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTSemaphoreWin32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTSemaphoreWin32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTSemaphoreWin32.class */
public class EXTSemaphoreWin32 {
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 38279;
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 38280;
    public static final int GL_DEVICE_LUID_EXT = 38297;
    public static final int GL_DEVICE_NODE_MASK_EXT = 38298;
    public static final int GL_LUID_SIZE_EXT = 8;
    public static final int GL_HANDLE_TYPE_D3D12_FENCE_EXT = 38292;
    public static final int GL_D3D12_FENCE_VALUE_EXT = 38293;

    protected EXTSemaphoreWin32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglImportSemaphoreWin32HandleEXT(int r0, int r1, long r2);

    public static void glImportSemaphoreWin32HandleEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void *") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            nglImportSemaphoreWin32HandleEXT(r0, r1, r2)
            return
    }

    public static native void nglImportSemaphoreWin32NameEXT(int r0, int r1, long r2);

    public static void glImportSemaphoreWin32NameEXT(@org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("void const *") long r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lb:
            r0 = r5
            r1 = r6
            r2 = r7
            nglImportSemaphoreWin32NameEXT(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
