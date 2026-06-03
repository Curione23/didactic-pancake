package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBindableUniform.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBindableUniform.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTBindableUniform.class */
public class EXTBindableUniform {
    public static final int GL_MAX_VERTEX_BINDABLE_UNIFORMS_EXT = 36322;
    public static final int GL_MAX_FRAGMENT_BINDABLE_UNIFORMS_EXT = 36323;
    public static final int GL_MAX_GEOMETRY_BINDABLE_UNIFORMS_EXT = 36324;
    public static final int GL_MAX_BINDABLE_UNIFORM_SIZE_EXT = 36333;
    public static final int GL_UNIFORM_BUFFER_BINDING_EXT = 36335;
    public static final int GL_UNIFORM_BUFFER_EXT = 36334;

    protected EXTBindableUniform() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glUniformBufferEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLuint") int r2);

    @org.lwjgl.system.NativeType("GLint")
    public static native int glGetUniformBufferSizeEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    @org.lwjgl.system.NativeType("GLintptr")
    public static native long glGetUniformOffsetEXT(@org.lwjgl.system.NativeType("GLuint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
