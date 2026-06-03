package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBES2Compatibility.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBES2Compatibility.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBES2Compatibility.class */
public class ARBES2Compatibility {
    public static final int GL_SHADER_COMPILER = 36346;
    public static final int GL_SHADER_BINARY_FORMATS = 36344;
    public static final int GL_NUM_SHADER_BINARY_FORMATS = 36345;
    public static final int GL_MAX_VERTEX_UNIFORM_VECTORS = 36347;
    public static final int GL_MAX_VARYING_VECTORS = 36348;
    public static final int GL_MAX_FRAGMENT_UNIFORM_VECTORS = 36349;
    public static final int GL_IMPLEMENTATION_COLOR_READ_TYPE = 35738;
    public static final int GL_IMPLEMENTATION_COLOR_READ_FORMAT = 35739;
    public static final int GL_FIXED = 5132;
    public static final int GL_LOW_FLOAT = 36336;
    public static final int GL_MEDIUM_FLOAT = 36337;
    public static final int GL_HIGH_FLOAT = 36338;
    public static final int GL_LOW_INT = 36339;
    public static final int GL_MEDIUM_INT = 36340;
    public static final int GL_HIGH_INT = 36341;
    public static final int GL_RGB565 = 36194;

    protected ARBES2Compatibility() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glReleaseShaderCompiler() {
            org.lwjgl.opengl.GL41C.glReleaseShaderCompiler()
            return
    }

    public static void nglShaderBinary(int r8, long r9, int r11, long r12, int r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r14
            org.lwjgl.opengl.GL41C.nglShaderBinary(r0, r1, r2, r3, r4)
            return
    }

    public static void glShaderBinary(@org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glShaderBinary(r0, r1, r2)
            return
    }

    public static void nglGetShaderPrecisionFormat(int r7, int r8, long r9, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r11
            org.lwjgl.opengl.GL41C.nglGetShaderPrecisionFormat(r0, r1, r2, r3)
            return
    }

    public static void glGetShaderPrecisionFormat(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetShaderPrecisionFormat(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glGetShaderPrecisionFormat(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            int r0 = org.lwjgl.opengl.GL41C.glGetShaderPrecisionFormat(r0, r1, r2)
            return r0
    }

    public static void glDepthRangef(@org.lwjgl.system.NativeType("GLfloat") float r3, @org.lwjgl.system.NativeType("GLfloat") float r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL41C.glDepthRangef(r0, r1)
            return
    }

    public static void glClearDepthf(@org.lwjgl.system.NativeType("GLfloat") float r2) {
            r0 = r2
            org.lwjgl.opengl.GL41C.glClearDepthf(r0)
            return
    }

    public static void glShaderBinary(@org.lwjgl.system.NativeType("GLuint const *") int[] r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glShaderBinary(r0, r1, r2)
            return
    }

    public static void glGetShaderPrecisionFormat(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLint *") int[] r7, @org.lwjgl.system.NativeType("GLint *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetShaderPrecisionFormat(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
