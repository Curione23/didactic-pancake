package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBClearBufferObject.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBClearBufferObject.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBClearBufferObject.class */
public class ARBClearBufferObject {
    protected ARBClearBufferObject() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglClearBufferData(int r7, int r8, int r9, int r10, long r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            org.lwjgl.opengl.GL43C.nglClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void nglClearBufferSubData(int r11, int r12, long r13, long r15, int r17, int r18, long r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            org.lwjgl.opengl.GL43C.nglClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static native void nglClearNamedBufferDataEXT(int r0, int r1, int r2, int r3, long r4);

    public static void glClearNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearNamedBufferDataEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearNamedBufferDataEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearNamedBufferDataEXT(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r11) {
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            nglClearNamedBufferDataEXT(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglClearNamedBufferSubDataEXT(int r0, int r1, long r2, long r4, int r6, int r7, long r8);

    public static void glClearNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizeiptr") long r15, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nglClearNamedBufferSubDataEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizeiptr") long r15, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nglClearNamedBufferSubDataEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizeiptr") long r15, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nglClearNamedBufferSubDataEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r11, @org.lwjgl.system.NativeType("GLenum") int r12, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizeiptr") long r15, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLenum") int r18, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") java.nio.FloatBuffer r19) {
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            r5 = r18
            r6 = r19
            long r6 = org.lwjgl.system.MemoryUtil.memAddressSafe(r6)
            nglClearNamedBufferSubDataEXT(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferData(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r10) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.opengl.GL43C.glClearBufferData(r0, r1, r2, r3, r4)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearBufferSubData(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizeiptr") long r14, @org.lwjgl.system.NativeType("GLenum") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            org.lwjgl.opengl.GL43C.glClearBufferSubData(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glClearNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearNamedBufferDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glClearNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearNamedBufferDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glClearNamedBufferDataEXT(@org.lwjgl.system.NativeType("GLuint") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearNamedBufferDataEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glClearNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLintptr") long r14, @org.lwjgl.system.NativeType("GLsizeiptr") long r16, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") short[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearNamedBufferSubDataEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glClearNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLintptr") long r14, @org.lwjgl.system.NativeType("GLsizeiptr") long r16, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") int[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearNamedBufferSubDataEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public static void glClearNamedBufferSubDataEXT(@org.lwjgl.system.NativeType("GLuint") int r12, @org.lwjgl.system.NativeType("GLenum") int r13, @org.lwjgl.system.NativeType("GLintptr") long r14, @org.lwjgl.system.NativeType("GLsizeiptr") long r16, @org.lwjgl.system.NativeType("GLenum") int r18, @org.lwjgl.system.NativeType("GLenum") int r19, @javax.annotation.Nullable @org.lwjgl.system.NativeType("void const *") float[] r20) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glClearNamedBufferSubDataEXT
            r21 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L14:
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
