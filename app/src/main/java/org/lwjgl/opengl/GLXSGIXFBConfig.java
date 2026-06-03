package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIXFBConfig.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIXFBConfig.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIXFBConfig.class */
public class GLXSGIXFBConfig {
    public static final int GLX_DRAWABLE_TYPE_SGIX = 32784;
    public static final int GLX_RENDER_TYPE_SGIX = 32785;
    public static final int GLX_X_RENDERABLE_SGIX = 32786;
    public static final int GLX_FBCONFIG_ID_SGIX = 32787;
    public static final int GLX_SCREEN_EXT = 32780;
    public static final int GLX_WINDOW_BIT_SGIX = 1;
    public static final int GLX_PIXMAP_BIT_SGIX = 2;
    public static final int GLX_RGBA_BIT_SGIX = 1;
    public static final int GLX_COLOR_INDEX_BIT_SGIX = 2;
    public static final int GLX_RGBA_TYPE_SGIX = 32788;
    public static final int GLX_COLOR_INDEX_TYPE_SGIX = 32789;

    protected GLXSGIXFBConfig() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static int nglXGetFBConfigAttribSGIX(long r10, long r12, int r14, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetFBConfigAttribSGIX
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    public static int glXGetFBConfigAttribSGIX(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXFBConfigSGIX") long r10, int r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nglXGetFBConfigAttribSGIX(r0, r1, r2, r3)
            return r0
    }

    public static long nglXChooseFBConfigSGIX(long r10, int r12, long r13, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXChooseFBConfigSGIX
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r10
            r1 = r12
            r2 = r13
            r3 = r15
            r4 = r17
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLXFBConfigSGIX *")
    public static org.lwjgl.PointerBuffer glXChooseFBConfigSGIX(@org.lwjgl.system.NativeType("Display *") long r8, int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r11
            org.lwjgl.system.Checks.checkNTSafe(r0)
        La:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r12 = r0
            r0 = r12
            int r0 = r0.getPointer()
            r13 = r0
            r0 = r12
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r14 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)     // Catch: java.lang.Throwable -> L45
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L45
            long r0 = nglXChooseFBConfigSGIX(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L45
            r15 = r0
            r0 = r15
            r1 = r14
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L45
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L45
            r17 = r0
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r17
            return r0
        L45:
            r18 = move-exception
            r0 = r12
            r1 = r13
            r0.setPointer(r1)
            r0 = r18
            throw r0
    }

    @org.lwjgl.system.NativeType("GLXPixmap")
    public static long glXCreateGLXPixmapWithConfigSGIX(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXFBConfig") long r11, @org.lwjgl.system.NativeType("Pixmap") long r13) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateGLXPixmapWithConfigSGIX
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r0 = org.lwjgl.system.JNI.callPPNP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glXCreateContextWithConfigSGIX(@org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("GLXFBConfig") long r13, int r15, @org.lwjgl.system.NativeType("GLXContext") long r16, @org.lwjgl.system.NativeType("Bool") boolean r18) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateContextWithConfigSGIX
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            long r0 = org.lwjgl.system.Checks.check(r0)
        L24:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r18
            if (r4 == 0) goto L33
            r4 = 1
            goto L34
        L33:
            r4 = 0
        L34:
            r5 = r19
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static long nglXGetVisualFromFBConfigSGIX(long r7, long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetVisualFromFBConfigSGIX
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("XVisualInfo *")
    public static org.lwjgl.system.linux.XVisualInfo glXGetVisualFromFBConfigSGIX(@org.lwjgl.system.NativeType("Display *") long r5, @org.lwjgl.system.NativeType("GLXFBConfig") long r7) {
            r0 = r5
            r1 = r7
            long r0 = nglXGetVisualFromFBConfigSGIX(r0, r1)
            r9 = r0
            r0 = r9
            org.lwjgl.system.linux.XVisualInfo r0 = org.lwjgl.system.linux.XVisualInfo.createSafe(r0)
            return r0
    }

    public static long nglXGetFBConfigFromVisualSGIX(long r7, long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetFBConfigFromVisualSGIX
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            org.lwjgl.system.linux.XVisualInfo.validate(r0)
        L1d:
            r0 = r7
            r1 = r9
            r2 = r11
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXFBConfigSGIX")
    public static long glXGetFBConfigFromVisualSGIX(@org.lwjgl.system.NativeType("Display *") long r5, @org.lwjgl.system.NativeType("XVisualInfo *") org.lwjgl.system.linux.XVisualInfo r7) {
            r0 = r5
            r1 = r7
            long r1 = r1.address()
            long r0 = nglXGetFBConfigFromVisualSGIX(r0, r1)
            return r0
    }

    public static int glXGetFBConfigAttribSGIX(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXFBConfigSGIX") long r11, int r13, @org.lwjgl.system.NativeType("int *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetFBConfigAttribSGIX
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLXFBConfigSGIX *")
    public static org.lwjgl.PointerBuffer glXChooseFBConfigSGIX(@org.lwjgl.system.NativeType("Display *") long r9, int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r12) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXChooseFBConfigSGIX
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1d:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r15 = r0
            r0 = r15
            int r0 = r0.getPointer()
            r16 = r0
            r0 = r15
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r17 = r0
            r0 = r9
            r1 = r11
            r2 = r12
            r3 = r17
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L57
            r4 = r13
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L57
            r18 = r0
            r0 = r18
            r1 = r17
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L57
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L57
            r20 = r0
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r20
            return r0
        L57:
            r21 = move-exception
            r0 = r15
            r1 = r16
            r0.setPointer(r1)
            r0 = r21
            throw r0
    }
}
