package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVCopyImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVCopyImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVCopyImage.class */
public class GLXNVCopyImage {
    protected GLXNVCopyImage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glXCopyImageSubDataNV(@org.lwjgl.system.NativeType("Display *") long r24, @org.lwjgl.system.NativeType("GLXContext") long r26, @org.lwjgl.system.NativeType("GLuint") int r28, @org.lwjgl.system.NativeType("GLenum") int r29, @org.lwjgl.system.NativeType("GLint") int r30, @org.lwjgl.system.NativeType("GLint") int r31, @org.lwjgl.system.NativeType("GLint") int r32, @org.lwjgl.system.NativeType("GLint") int r33, @org.lwjgl.system.NativeType("GLXContext") long r34, @org.lwjgl.system.NativeType("GLuint") int r36, @org.lwjgl.system.NativeType("GLenum") int r37, @org.lwjgl.system.NativeType("GLint") int r38, @org.lwjgl.system.NativeType("GLint") int r39, @org.lwjgl.system.NativeType("GLint") int r40, @org.lwjgl.system.NativeType("GLint") int r41, @org.lwjgl.system.NativeType("GLsizei") int r42, @org.lwjgl.system.NativeType("GLsizei") int r43, @org.lwjgl.system.NativeType("GLsizei") int r44) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCopyImageSubDataNV
            r45 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r45
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r24
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r24
            r1 = r26
            r2 = r28
            r3 = r29
            r4 = r30
            r5 = r31
            r6 = r32
            r7 = r33
            r8 = r34
            r9 = r36
            r10 = r37
            r11 = r38
            r12 = r39
            r13 = r40
            r14 = r41
            r15 = r42
            r16 = r43
            r17 = r44
            r18 = r45
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
    }
}
