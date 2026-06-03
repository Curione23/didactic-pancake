package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIMakeCurrentRead.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIMakeCurrentRead.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIMakeCurrentRead.class */
public class GLXSGIMakeCurrentRead {
    protected GLXSGIMakeCurrentRead() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXMakeCurrentReadSGI(@org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("GLXDrawable") long r13, @org.lwjgl.system.NativeType("GLXDrawable") long r15, @org.lwjgl.system.NativeType("GLXContext") long r17) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXMakeCurrentReadSGI
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L2b
            r0 = 1
            goto L2c
        L2b:
            r0 = 0
        L2c:
            return r0
    }

    @org.lwjgl.system.NativeType("GLXDrawable")
    public static long glXGetCurrentReadDrawableSGI() {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetCurrentReadDrawableSGI
            r3 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r3
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r3
            long r0 = org.lwjgl.system.JNI.callP(r0)
            return r0
    }
}
