package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVCopyBuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVCopyBuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVCopyBuffer.class */
public class GLXNVCopyBuffer {
    protected GLXNVCopyBuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glXCopyBufferSubDataNV(@org.lwjgl.system.NativeType("Display *") long r17, @org.lwjgl.system.NativeType("GLXContext") long r19, @org.lwjgl.system.NativeType("GLXContext") long r21, @org.lwjgl.system.NativeType("GLenum") int r23, @org.lwjgl.system.NativeType("GLenum") int r24, @org.lwjgl.system.NativeType("GLintptr") long r25, @org.lwjgl.system.NativeType("GLintptr") long r27, @org.lwjgl.system.NativeType("GLsizeiptr") long r29) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCopyBufferSubDataNV
            r31 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r31
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L24:
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r27
            r7 = r29
            r8 = r31
            org.lwjgl.system.JNI.callPPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public static void glXNamedCopyBufferSubDataNV(@org.lwjgl.system.NativeType("Display *") long r17, @org.lwjgl.system.NativeType("GLXContext") long r19, @org.lwjgl.system.NativeType("GLXContext") long r21, @org.lwjgl.system.NativeType("GLuint") int r23, @org.lwjgl.system.NativeType("GLuint") int r24, @org.lwjgl.system.NativeType("GLintptr") long r25, @org.lwjgl.system.NativeType("GLintptr") long r27, @org.lwjgl.system.NativeType("GLsizeiptr") long r29) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXNamedCopyBufferSubDataNV
            r31 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r31
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r21
            long r0 = org.lwjgl.system.Checks.check(r0)
        L24:
            r0 = r17
            r1 = r19
            r2 = r21
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r27
            r7 = r29
            r8 = r31
            org.lwjgl.system.JNI.callPPPPPPV(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
