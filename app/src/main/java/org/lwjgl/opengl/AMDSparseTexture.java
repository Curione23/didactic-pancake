package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDSparseTexture.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDSparseTexture.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AMDSparseTexture.class */
public class AMDSparseTexture {
    public static final int GL_TEXTURE_STORAGE_SPARSE_BIT_AMD = 1;
    public static final int GL_VIRTUAL_PAGE_SIZE_X_AMD = 37269;
    public static final int GL_VIRTUAL_PAGE_SIZE_Y_AMD = 37270;
    public static final int GL_VIRTUAL_PAGE_SIZE_Z_AMD = 37271;
    public static final int GL_MAX_SPARSE_TEXTURE_SIZE_AMD = 37272;
    public static final int GL_MAX_SPARSE_3D_TEXTURE_SIZE_AMD = 37273;
    public static final int GL_MAX_SPARSE_ARRAY_TEXTURE_LAYERS = 37274;
    public static final int GL_MIN_SPARSE_LEVEL_AMD = 37275;
    public static final int GL_MIN_LOD_WARNING_AMD = 37276;

    protected AMDSparseTexture() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glTexStorageSparseAMD(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLbitfield") int r6);

    public static native void glTextureStorageSparseAMD(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6, @org.lwjgl.system.NativeType("GLbitfield") int r7);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
