package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBInvalidateSubdata.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBInvalidateSubdata.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBInvalidateSubdata.class */
public class ARBInvalidateSubdata {
    protected ARBInvalidateSubdata() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glInvalidateTexSubImage(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLint") int r11, @org.lwjgl.system.NativeType("GLint") int r12, @org.lwjgl.system.NativeType("GLint") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            org.lwjgl.opengl.GL43C.glInvalidateTexSubImage(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glInvalidateTexImage(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLint") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateTexImage(r0, r1)
            return
    }

    public static void glInvalidateBufferSubData(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLintptr") long r7, @org.lwjgl.system.NativeType("GLsizeiptr") long r9) {
            r0 = r6
            r1 = r7
            r2 = r9
            org.lwjgl.opengl.GL43C.glInvalidateBufferSubData(r0, r1, r2)
            return
    }

    public static void glInvalidateBufferData(@org.lwjgl.system.NativeType("GLuint") int r2) {
            r0 = r2
            org.lwjgl.opengl.GL43C.glInvalidateBufferData(r0)
            return
    }

    public static void nglInvalidateFramebuffer(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL43C.nglInvalidateFramebuffer(r0, r1, r2)
            return
    }

    public static void glInvalidateFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateFramebuffer(r0, r1)
            return
    }

    public static void glInvalidateFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum const *") int r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateFramebuffer(r0, r1)
            return
    }

    public static void nglInvalidateSubFramebuffer(int r9, int r10, long r11, int r13, int r14, int r15, int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            org.lwjgl.opengl.GL43C.nglInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glInvalidateSubFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum const *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glInvalidateSubFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum const *") int r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glInvalidateFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r3, @org.lwjgl.system.NativeType("GLenum const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL43C.glInvalidateFramebuffer(r0, r1)
            return
    }

    public static void glInvalidateSubFramebuffer(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum const *") int[] r8, @org.lwjgl.system.NativeType("GLint") int r9, @org.lwjgl.system.NativeType("GLint") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            org.lwjgl.opengl.GL43C.glInvalidateSubFramebuffer(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
