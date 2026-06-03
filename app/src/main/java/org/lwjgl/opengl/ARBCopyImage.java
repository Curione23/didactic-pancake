package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBCopyImage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBCopyImage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBCopyImage.class */
public class ARBCopyImage {
    protected ARBCopyImage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glCopyImageSubData(@org.lwjgl.system.NativeType("GLuint") int r16, @org.lwjgl.system.NativeType("GLenum") int r17, @org.lwjgl.system.NativeType("GLint") int r18, @org.lwjgl.system.NativeType("GLint") int r19, @org.lwjgl.system.NativeType("GLint") int r20, @org.lwjgl.system.NativeType("GLint") int r21, @org.lwjgl.system.NativeType("GLuint") int r22, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLint") int r24, @org.lwjgl.system.NativeType("GLint") int r25, @org.lwjgl.system.NativeType("GLint") int r26, @org.lwjgl.system.NativeType("GLint") int r27, @org.lwjgl.system.NativeType("GLsizei") int r28, @org.lwjgl.system.NativeType("GLsizei") int r29, @org.lwjgl.system.NativeType("GLsizei") int r30) {
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            org.lwjgl.opengl.GL43C.glCopyImageSubData(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
