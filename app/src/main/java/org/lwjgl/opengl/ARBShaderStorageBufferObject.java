package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderStorageBufferObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderStorageBufferObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBShaderStorageBufferObject.class */
public class ARBShaderStorageBufferObject {
    public static final int GL_SHADER_STORAGE_BUFFER = 37074;
    public static final int GL_SHADER_STORAGE_BUFFER_BINDING = 37075;
    public static final int GL_SHADER_STORAGE_BUFFER_START = 37076;
    public static final int GL_SHADER_STORAGE_BUFFER_SIZE = 37077;
    public static final int GL_MAX_VERTEX_SHADER_STORAGE_BLOCKS = 37078;
    public static final int GL_MAX_GEOMETRY_SHADER_STORAGE_BLOCKS = 37079;
    public static final int GL_MAX_TESS_CONTROL_SHADER_STORAGE_BLOCKS = 37080;
    public static final int GL_MAX_TESS_EVALUATION_SHADER_STORAGE_BLOCKS = 37081;
    public static final int GL_MAX_FRAGMENT_SHADER_STORAGE_BLOCKS = 37082;
    public static final int GL_MAX_COMPUTE_SHADER_STORAGE_BLOCKS = 37083;
    public static final int GL_MAX_COMBINED_SHADER_STORAGE_BLOCKS = 37084;
    public static final int GL_MAX_SHADER_STORAGE_BUFFER_BINDINGS = 37085;
    public static final int GL_MAX_SHADER_STORAGE_BLOCK_SIZE = 37086;
    public static final int GL_SHADER_STORAGE_BUFFER_OFFSET_ALIGNMENT = 37087;
    public static final int GL_SHADER_STORAGE_BARRIER_BIT = 8192;
    public static final int GL_MAX_COMBINED_SHADER_OUTPUT_RESOURCES = 36665;

    protected ARBShaderStorageBufferObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glShaderStorageBlockBinding(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @org.lwjgl.system.NativeType("GLuint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL43C.glShaderStorageBlockBinding(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
