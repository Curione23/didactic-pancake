package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureBufferObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureBufferObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTTextureBufferObject.class */
public class EXTTextureBufferObject {
    public static final int GL_TEXTURE_BUFFER_EXT = 35882;
    public static final int GL_MAX_TEXTURE_BUFFER_SIZE_EXT = 35883;
    public static final int GL_TEXTURE_BINDING_BUFFER_EXT = 35884;
    public static final int GL_TEXTURE_BUFFER_DATA_STORE_BINDING_EXT = 35885;
    public static final int GL_TEXTURE_BUFFER_FORMAT_EXT = 35886;

    protected EXTTextureBufferObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glTexBufferEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
