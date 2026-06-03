package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGetProgramBinary.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGetProgramBinary.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGetProgramBinary.class */
public class ARBGetProgramBinary {
    public static final int GL_PROGRAM_BINARY_RETRIEVABLE_HINT = 33367;
    public static final int GL_PROGRAM_BINARY_LENGTH = 34625;
    public static final int GL_NUM_PROGRAM_BINARY_FORMATS = 34814;
    public static final int GL_PROGRAM_BINARY_FORMATS = 34815;

    protected ARBGetProgramBinary() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglGetProgramBinary(int r9, int r10, long r11, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL41C.nglGetProgramBinary(r0, r1, r2, r3, r4)
            return
    }

    public static void glGetProgramBinary(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r6, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetProgramBinary(r0, r1, r2, r3)
            return
    }

    public static void nglProgramBinary(int r6, int r7, long r8, int r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r10
            org.lwjgl.opengl.GL41C.nglProgramBinary(r0, r1, r2, r3)
            return
    }

    public static void glProgramBinary(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramBinary(r0, r1, r2)
            return
    }

    public static void glProgramParameteri(@org.lwjgl.system.NativeType("GLuint") int r4, @org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLint") int r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL41C.glProgramParameteri(r0, r1, r2)
            return
    }

    public static void glGetProgramBinary(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei *") int[] r6, @org.lwjgl.system.NativeType("GLenum *") int[] r7, @org.lwjgl.system.NativeType("void *") java.nio.ByteBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL41C.glGetProgramBinary(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
