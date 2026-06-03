package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBIndirectParameters.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBIndirectParameters.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBIndirectParameters.class */
public class ARBIndirectParameters {
    public static final int GL_PARAMETER_BUFFER_ARB = 33006;
    public static final int GL_PARAMETER_BUFFER_BINDING_ARB = 33007;

    protected ARBIndirectParameters() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglMultiDrawArraysIndirectCountARB(int r0, long r1, long r3, int r5, int r6);

    public static void glMultiDrawArraysIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r9
            r1 = r12
            r2 = r13
            if (r2 != 0) goto L13
            r2 = 16
            goto L15
        L13:
            r2 = r13
        L15:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r8
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = r12
            r4 = r13
            nglMultiDrawArraysIndirectCountARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") long r9, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r13
            r4 = r14
            nglMultiDrawArraysIndirectCountARB(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r9, @org.lwjgl.system.NativeType("GLintptr") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            r1 = r12
            r2 = r13
            if (r2 != 0) goto L13
            r2 = 16
            goto L15
        L13:
            r2 = r13
        L15:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r8
            r1 = r9
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r10
            r3 = r12
            r4 = r13
            nglMultiDrawArraysIndirectCountARB(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglMultiDrawElementsIndirectCountARB(int r0, int r1, long r2, long r4, int r6, int r7);

    public static void glMultiDrawElementsIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            r1 = r14
            r2 = r15
            if (r2 != 0) goto L13
            r2 = 20
            goto L15
        L13:
            r2 = r15
        L15:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L19:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r14
            r5 = r15
            nglMultiDrawElementsIndirectCountARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") long r11, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r15
            r5 = r16
            nglMultiDrawElementsIndirectCountARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r11
            r1 = r14
            r2 = r15
            if (r2 != 0) goto L13
            r2 = 20
            goto L15
        L13:
            r2 = r15
        L15:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1b:
            r0 = r9
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            r4 = r14
            r5 = r15
            nglMultiDrawElementsIndirectCountARB(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawArraysIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") int[] r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiDrawArraysIndirectCountARB
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = r13
            r2 = r14
            if (r2 != 0) goto L21
            r2 = 16
            goto L23
        L21:
            r2 = r14
        L23:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L29:
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectCountARB(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") int[] r12, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultiDrawElementsIndirectCountARB
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L29
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            r1 = r15
            r2 = r16
            if (r2 != 0) goto L21
            r2 = 20
            goto L23
        L21:
            r2 = r16
        L23:
            int r1 = r1 * r2
            r2 = 2
            int r1 = r1 >> r2
            org.lwjgl.system.Checks.check(r0, r1)
        L29:
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
