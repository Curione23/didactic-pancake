package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTMemoryObjectWin32.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTMemoryObjectWin32.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTMemoryObjectWin32.class */
public class EXTMemoryObjectWin32 {
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_EXT = 38279;
    public static final int GL_HANDLE_TYPE_OPAQUE_WIN32_KMT_EXT = 38280;
    public static final int GL_DEVICE_LUID_EXT = 38297;
    public static final int GL_DEVICE_NODE_MASK_EXT = 38298;
    public static final int GL_LUID_SIZE_EXT = 8;
    public static final int GL_HANDLE_TYPE_D3D12_TILEPOOL_EXT = 38281;
    public static final int GL_HANDLE_TYPE_D3D12_RESOURCE_EXT = 38282;
    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_EXT = 38283;
    public static final int GL_HANDLE_TYPE_D3D11_IMAGE_KMT_EXT = 38284;

    protected EXTMemoryObjectWin32() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglImportMemoryWin32HandleEXT(int r0, long r1, int r3, long r4);

    public static void glImportMemoryWin32HandleEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint64") long r8, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void *") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            nglImportMemoryWin32HandleEXT(r0, r1, r2, r3)
            return
    }

    public static native void nglImportMemoryWin32NameEXT(int r0, long r1, int r3, long r4);

    public static void glImportMemoryWin32NameEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLuint64") long r8, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        Lc:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            nglImportMemoryWin32NameEXT(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
