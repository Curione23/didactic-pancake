package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirectCount.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirectCount.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirectCount.class */
public class NVBindlessMultiDrawIndirectCount {
    protected NVBindlessMultiDrawIndirectCount() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglMultiDrawArraysIndirectBindlessCountNV(int r0, long r1, long r3, int r5, int r6, int r7);

    public static void glMultiDrawArraysIndirectBindlessCountNV(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLintptr") long r11, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLint") int r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r10
            r1 = r13
            r2 = r14
            if (r2 != 0) goto L19
            r2 = 16
            r3 = r15
            r4 = 24
            int r3 = r3 * r4
            int r2 = r2 + r3
            goto L1b
        L19:
            r2 = r14
        L1b:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1f:
            r0 = r9
            r1 = r10
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r11
            r3 = r13
            r4 = r14
            r5 = r15
            nglMultiDrawArraysIndirectBindlessCountNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawArraysIndirectBindlessCountNV(@org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") long r10, @org.lwjgl.system.NativeType("GLintptr") long r12, @org.lwjgl.system.NativeType("GLsizei") int r14, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLint") int r16) {
            r0 = r9
            r1 = r10
            r2 = r12
            r3 = r14
            r4 = r15
            r5 = r16
            nglMultiDrawArraysIndirectBindlessCountNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static native void nglMultiDrawElementsIndirectBindlessCountNV(int r0, int r1, long r2, long r4, int r6, int r7, int r8);

    public static void glMultiDrawElementsIndirectBindlessCountNV(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r12, @org.lwjgl.system.NativeType("GLintptr") long r13, @org.lwjgl.system.NativeType("GLsizei") int r15, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLint") int r17) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r12
            r1 = r15
            r2 = r16
            if (r2 != 0) goto L18
            r2 = r17
            r3 = 2
            int r2 = r2 + r3
            r3 = 24
            int r2 = r2 * r3
            goto L1a
        L18:
            r2 = r16
        L1a:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r10
            r1 = r11
            r2 = r12
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r13
            r4 = r15
            r5 = r16
            r6 = r17
            nglMultiDrawElementsIndirectBindlessCountNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static void glMultiDrawElementsIndirectBindlessCountNV(@org.lwjgl.system.NativeType("GLenum") int r10, @org.lwjgl.system.NativeType("GLenum") int r11, @org.lwjgl.system.NativeType("void const *") long r12, @org.lwjgl.system.NativeType("GLintptr") long r14, @org.lwjgl.system.NativeType("GLsizei") int r16, @org.lwjgl.system.NativeType("GLsizei") int r17, @org.lwjgl.system.NativeType("GLint") int r18) {
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r14
            r4 = r16
            r5 = r17
            r6 = r18
            nglMultiDrawElementsIndirectBindlessCountNV(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
