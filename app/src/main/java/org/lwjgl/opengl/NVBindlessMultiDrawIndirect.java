package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirect.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirect.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVBindlessMultiDrawIndirect.class */
public class NVBindlessMultiDrawIndirect {
    protected NVBindlessMultiDrawIndirect() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglMultiDrawArraysIndirectBindlessNV(int r0, long r1, int r3, int r4, int r5);

    public static void glMultiDrawArraysIndirectBindlessNV(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8, @org.lwjgl.system.NativeType("GLsizei") int r9, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLint") int r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1c
            r0 = r8
            r1 = r9
            r2 = r10
            if (r2 != 0) goto L17
            r2 = 16
            r3 = r11
            r4 = 24
            int r3 = r3 * r4
            int r2 = r2 + r3
            goto L18
        L17:
            r2 = r10
        L18:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1c:
            r0 = r7
            r1 = r8
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            r2 = r9
            r3 = r10
            r4 = r11
            nglMultiDrawArraysIndirectBindlessNV(r0, r1, r2, r3, r4)
            return
    }

    public static void glMultiDrawArraysIndirectBindlessNV(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("void const *") long r8, @org.lwjgl.system.NativeType("GLsizei") int r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLint") int r12) {
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            r4 = r12
            nglMultiDrawArraysIndirectBindlessNV(r0, r1, r2, r3, r4)
            return
    }

    public static native void nglMultiDrawElementsIndirectBindlessNV(int r0, int r1, long r2, int r4, int r5, int r6);

    public static void glMultiDrawElementsIndirectBindlessNV(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r10, @org.lwjgl.system.NativeType("GLsizei") int r11, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLint") int r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r10
            r1 = r11
            r2 = r12
            if (r2 != 0) goto L17
            r2 = r13
            r3 = 2
            int r2 = r2 + r3
            r3 = 24
            int r2 = r2 * r3
            goto L19
        L17:
            r2 = r12
        L19:
            int r1 = r1 * r2
            org.lwjgl.system.Checks.check(r0, r1)
        L1d:
            r0 = r8
            r1 = r9
            r2 = r10
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r11
            r4 = r12
            r5 = r13
            nglMultiDrawElementsIndirectBindlessNV(r0, r1, r2, r3, r4, r5)
            return
    }

    public static void glMultiDrawElementsIndirectBindlessNV(@org.lwjgl.system.NativeType("GLenum") int r8, @org.lwjgl.system.NativeType("GLenum") int r9, @org.lwjgl.system.NativeType("void const *") long r10, @org.lwjgl.system.NativeType("GLsizei") int r12, @org.lwjgl.system.NativeType("GLsizei") int r13, @org.lwjgl.system.NativeType("GLint") int r14) {
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r12
            r4 = r13
            r5 = r14
            nglMultiDrawElementsIndirectBindlessNV(r0, r1, r2, r3, r4, r5)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
