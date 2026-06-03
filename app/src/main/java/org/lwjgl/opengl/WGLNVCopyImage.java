package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVCopyImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVCopyImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVCopyImage.class */
public class WGLNVCopyImage {
    protected WGLNVCopyImage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglCopyImageSubDataNV(@org.lwjgl.system.NativeType("HGLRC") long r22, @org.lwjgl.system.NativeType("GLuint") int r24, @org.lwjgl.system.NativeType("GLenum") int r25, @org.lwjgl.system.NativeType("GLint") int r26, @org.lwjgl.system.NativeType("GLint") int r27, @org.lwjgl.system.NativeType("GLint") int r28, @org.lwjgl.system.NativeType("GLint") int r29, @org.lwjgl.system.NativeType("HGLRC") long r30, @org.lwjgl.system.NativeType("GLuint") int r32, @org.lwjgl.system.NativeType("GLenum") int r33, @org.lwjgl.system.NativeType("GLint") int r34, @org.lwjgl.system.NativeType("GLint") int r35, @org.lwjgl.system.NativeType("GLint") int r36, @org.lwjgl.system.NativeType("GLint") int r37, @org.lwjgl.system.NativeType("GLsizei") int r38, @org.lwjgl.system.NativeType("GLsizei") int r39, @org.lwjgl.system.NativeType("GLsizei") int r40) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglCopyImageSubDataNV
            r41 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1f
            r0 = r41
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r22
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r30
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1f:
            r0 = r22
            r1 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r32
            r9 = r33
            r10 = r34
            r11 = r35
            r12 = r36
            r13 = r37
            r14 = r38
            r15 = r39
            r16 = r40
            r17 = r41
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r0 == 0) goto L4a
            r0 = 1
            goto L4b
        L4a:
            r0 = 0
        L4b:
            return r0
    }
}
