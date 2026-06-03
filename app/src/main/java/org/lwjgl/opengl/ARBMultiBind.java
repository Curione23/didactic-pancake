package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMultiBind.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMultiBind.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMultiBind.class */
public class ARBMultiBind {
    protected ARBMultiBind() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglBindBuffersBase(int r6, int r7, int r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL44C.nglBindBuffersBase(r0, r1, r2, r3)
            return
    }

    public static void glBindBuffersBase(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBindBuffersBase(r0, r1, r2)
            return
    }

    public static void nglBindBuffersRange(int r10, int r11, int r12, long r13, long r15, long r17) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r17
            org.lwjgl.opengl.GL44C.nglBindBuffersRange(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glBindBuffersRange(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizeiptr const *") org.lwjgl.PointerBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glBindBuffersRange(r0, r1, r2, r3, r4)
            return
    }

    public static void nglBindTextures(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL44C.nglBindTextures(r0, r1, r2)
            return
    }

    public static void glBindTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindTextures(r0, r1)
            return
    }

    public static void nglBindSamplers(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL44C.nglBindSamplers(r0, r1, r2)
            return
    }

    public static void glBindSamplers(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindSamplers(r0, r1)
            return
    }

    public static void nglBindImageTextures(int r5, int r6, long r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.GL44C.nglBindImageTextures(r0, r1, r2)
            return
    }

    public static void glBindImageTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindImageTextures(r0, r1)
            return
    }

    public static void nglBindVertexBuffers(int r9, int r10, long r11, long r13, long r15) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            org.lwjgl.opengl.GL44C.nglBindVertexBuffers(r0, r1, r2, r3, r4)
            return
    }

    public static void glBindVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") java.nio.IntBuffer r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL44C.glBindVertexBuffers(r0, r1, r2, r3)
            return
    }

    public static void glBindBuffersBase(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL44C.glBindBuffersBase(r0, r1, r2)
            return
    }

    public static void glBindBuffersRange(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLuint") int r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizeiptr const *") org.lwjgl.PointerBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL44C.glBindBuffersRange(r0, r1, r2, r3, r4)
            return
    }

    public static void glBindTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindTextures(r0, r1)
            return
    }

    public static void glBindSamplers(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindSamplers(r0, r1)
            return
    }

    public static void glBindImageTextures(@org.lwjgl.system.NativeType("GLuint") int r3, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.GL44C.glBindImageTextures(r0, r1)
            return
    }

    public static void glBindVertexBuffers(@org.lwjgl.system.NativeType("GLuint") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLuint const *") int[] r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLintptr const *") org.lwjgl.PointerBuffer r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLsizei const *") int[] r8) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            org.lwjgl.opengl.GL44C.glBindVertexBuffers(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
