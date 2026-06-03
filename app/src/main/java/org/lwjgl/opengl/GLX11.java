package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX11.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX11.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX11.class */
public class GLX11 extends org.lwjgl.opengl.GLX {
    public static final int GLX_VENDOR = 1;
    public static final int GLX_VERSION = 2;
    public static final int GLX_EXTENSIONS = 3;

    protected GLX11() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nglXQueryExtensionsString(long r6, int r8) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryExtensionsString
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String glXQueryExtensionsString(@org.lwjgl.system.NativeType("Display *") long r4, int r6) {
            r0 = r4
            r1 = r6
            long r0 = nglXQueryExtensionsString(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static long nglXGetClientString(long r6, int r8) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetClientString
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r6
            r1 = r8
            r2 = r9
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String glXGetClientString(@org.lwjgl.system.NativeType("Display *") long r4, int r6) {
            r0 = r4
            r1 = r6
            long r0 = nglXGetClientString(r0, r1)
            r7 = r0
            r0 = r7
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }

    public static long nglXQueryServerString(long r7, int r9, int r10) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryServerString
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("char const *")
    public static java.lang.String glXQueryServerString(@org.lwjgl.system.NativeType("Display *") long r5, int r7, int r8) {
            r0 = r5
            r1 = r7
            r2 = r8
            long r0 = nglXQueryServerString(r0, r1, r2)
            r9 = r0
            r0 = r9
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            return r0
    }
}
