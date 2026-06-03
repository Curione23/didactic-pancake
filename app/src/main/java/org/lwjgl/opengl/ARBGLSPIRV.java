package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGLSPIRV.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGLSPIRV.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBGLSPIRV.class */
public class ARBGLSPIRV {
    public static final int GL_SHADER_BINARY_FORMAT_SPIR_V_ARB = 38225;
    public static final int GL_SPIR_V_BINARY_ARB = 38226;

    protected ARBGLSPIRV() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglSpecializeShaderARB(int r0, long r1, int r3, long r4, long r6);

    public static void glSpecializeShaderARB(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = r2.remaining()
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)
            nglSpecializeShaderARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glSpecializeShaderARB(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLuint const *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Le
            r0 = r12
            r1 = r11
            int r1 = r1.remaining()
            org.lwjgl.system.Checks.check(r0, r1)
        Le:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L45
            r0 = r13
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L45
            r15 = r0
            r0 = r9
            r1 = r15
            r2 = r11
            int r2 = r2.remaining()     // Catch: java.lang.Throwable -> L45
            r3 = r11
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L45
            r4 = r12
            long r4 = org.lwjgl.system.MemoryUtil.memAddress(r4)     // Catch: java.lang.Throwable -> L45
            nglSpecializeShaderARB(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L45
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            goto L51
        L45:
            r17 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            throw r0
        L51:
            return
    }

    public static void glSpecializeShaderARB(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLuint const *") int[] r11, @org.lwjgl.system.NativeType("GLuint const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSpecializeShaderARB
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNT1(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            int r2 = r2.length
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glSpecializeShaderARB(@org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLchar const *") java.lang.CharSequence r10, @org.lwjgl.system.NativeType("GLuint const *") int[] r11, @org.lwjgl.system.NativeType("GLuint const *") int[] r12) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glSpecializeShaderARB
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1a
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r11
            int r1 = r1.length
            org.lwjgl.system.Checks.check(r0, r1)
        L1a:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = r10
            r2 = 1
            int r0 = r0.nUTF8(r1, r2)     // Catch: java.lang.Throwable -> L4b
            r0 = r15
            long r0 = r0.getPointerAddress()     // Catch: java.lang.Throwable -> L4b
            r17 = r0
            r0 = r9
            r1 = r17
            r2 = r11
            int r2 = r2.length     // Catch: java.lang.Throwable -> L4b
            r3 = r11
            r4 = r12
            r5 = r13
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L4b
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            goto L57
        L4b:
            r19 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r19
            throw r0
        L57:
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
