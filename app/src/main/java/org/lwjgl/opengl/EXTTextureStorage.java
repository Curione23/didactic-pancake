package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureStorage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureStorage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureStorage.class */
public class EXTTextureStorage {
    public static final int GL_TEXTURE_IMMUTABLE_FORMAT_EXT = 37167;
    public static final int GL_ALPHA8_EXT = 32828;
    public static final int GL_LUMINANCE8_EXT = 32832;
    public static final int GL_LUMINANCE8_ALPHA8_EXT = 32837;
    public static final int GL_RGBA32F_EXT = 34836;
    public static final int GL_RGB32F_EXT = 34837;
    public static final int GL_ALPHA32F_EXT = 34838;
    public static final int GL_LUMINANCE32F_EXT = 34840;
    public static final int GL_LUMINANCE_ALPHA32F_EXT = 34841;
    public static final int GL_RGBA16F_EXT = 34842;
    public static final int GL_RGB16F_EXT = 34843;
    public static final int GL_ALPHA16F_EXT = 34844;
    public static final int GL_LUMINANCE16F_EXT = 34846;
    public static final int GL_LUMINANCE_ALPHA16F_EXT = 34847;
    public static final int GL_RGB10_A2_EXT = 32857;
    public static final int GL_RGB10_EXT = 32850;
    public static final int GL_BGRA8_EXT = 37793;
    public static final int GL_R8_EXT = 33321;
    public static final int GL_RG8_EXT = 33323;
    public static final int GL_R32F_EXT = 33326;
    public static final int GL_RG32F_EXT = 33328;
    public static final int GL_R16F_EXT = 33325;
    public static final int GL_RG16F_EXT = 33327;
    public static final int GL_RGB_RAW_422_APPLE = 35409;

    protected EXTTextureStorage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glTexStorage1DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3);

    public static native void glTexStorage2DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void glTexStorage3DEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLsizei") int r1, @org.lwjgl.system.NativeType("GLenum") int r2, @org.lwjgl.system.NativeType("GLsizei") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    public static native void glTextureStorage1DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4);

    public static native void glTextureStorage2DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5);

    public static native void glTextureStorage3DEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLsizei") int r2, @org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
