package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX13.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX13.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLX13.class */
public class GLX13 extends org.lwjgl.opengl.GLX12 {
    public static final int GLX_WINDOW_BIT = 1;
    public static final int GLX_PIXMAP_BIT = 2;
    public static final int GLX_PBUFFER_BIT = 4;
    public static final int GLX_RGBA_BIT = 1;
    public static final int GLX_COLOR_INDEX_BIT = 2;
    public static final int GLX_PBUFFER_CLOBBER_MASK = 134217728;
    public static final int GLX_FRONT_LEFT_BUFFER_BIT = 1;
    public static final int GLX_FRONT_RIGHT_BUFFER_BIT = 2;
    public static final int GLX_BACK_LEFT_BUFFER_BIT = 4;
    public static final int GLX_BACK_RIGHT_BUFFER_BIT = 8;
    public static final int GLX_AUX_BUFFERS_BIT = 16;
    public static final int GLX_DEPTH_BUFFER_BIT = 32;
    public static final int GLX_STENCIL_BUFFER_BIT = 64;
    public static final int GLX_ACCUM_BUFFER_BIT = 128;
    public static final int GLX_CONFIG_CAVEAT = 32;
    public static final int GLX_X_VISUAL_TYPE = 34;
    public static final int GLX_TRANSPARENT_TYPE = 35;
    public static final int GLX_TRANSPARENT_INDEX_VALUE = 36;
    public static final int GLX_TRANSPARENT_RED_VALUE = 37;
    public static final int GLX_TRANSPARENT_GREEN_VALUE = 38;
    public static final int GLX_TRANSPARENT_BLUE_VALUE = 39;
    public static final int GLX_TRANSPARENT_ALPHA_VALUE = 40;
    public static final int GLX_DONT_CARE = -1;
    public static final int GLX_NONE = 32768;
    public static final int GLX_SLOW_CONFIG = 32769;
    public static final int GLX_TRUE_COLOR = 32770;
    public static final int GLX_DIRECT_COLOR = 32771;
    public static final int GLX_PSEUDO_COLOR = 32772;
    public static final int GLX_STATIC_COLOR = 32773;
    public static final int GLX_GRAY_SCALE = 32774;
    public static final int GLX_STATIC_GRAY = 32775;
    public static final int GLX_TRANSPARENT_RGB = 32776;
    public static final int GLX_TRANSPARENT_INDEX = 32777;
    public static final int GLX_VISUAL_ID = 32779;
    public static final int GLX_SCREEN = 32780;
    public static final int GLX_NON_CONFORMANT_CONFIG = 32781;
    public static final int GLX_DRAWABLE_TYPE = 32784;
    public static final int GLX_RENDER_TYPE = 32785;
    public static final int GLX_X_RENDERABLE = 32786;
    public static final int GLX_FBCONFIG_ID = 32787;
    public static final int GLX_RGBA_TYPE = 32788;
    public static final int GLX_COLOR_INDEX_TYPE = 32789;
    public static final int GLX_MAX_PBUFFER_WIDTH = 32790;
    public static final int GLX_MAX_PBUFFER_HEIGHT = 32791;
    public static final int GLX_MAX_PBUFFER_PIXELS = 32792;
    public static final int GLX_PRESERVED_CONTENTS = 32795;
    public static final int GLX_LARGEST_PBUFFER = 32796;
    public static final int GLX_WIDTH = 32797;
    public static final int GLX_HEIGHT = 32798;
    public static final int GLX_EVENT_MASK = 32799;
    public static final int GLX_DAMAGED = 32800;
    public static final int GLX_SAVED = 32801;
    public static final int GLX_WINDOW = 32802;
    public static final int GLX_PBUFFER = 32803;
    public static final int GLX_PBUFFER_HEIGHT = 32832;
    public static final int GLX_PBUFFER_WIDTH = 32833;

    protected GLX13() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nglXGetFBConfigs(long r8, int r10, long r11) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetFBConfigs
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3)
            return r0
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLXFBConfig *")
    public static org.lwjgl.PointerBuffer glXGetFBConfigs(@org.lwjgl.system.NativeType("Display *") long r6, int r8) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r9 = r0
            r0 = r9
            int r0 = r0.getPointer()
            r10 = r0
            r0 = r9
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)
            r11 = r0
            r0 = r6
            r1 = r8
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)     // Catch: java.lang.Throwable -> L33
            long r0 = nglXGetFBConfigs(r0, r1, r2)     // Catch: java.lang.Throwable -> L33
            r12 = r0
            r0 = r12
            r1 = r11
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L33
            org.lwjgl.PointerBuffer r0 = org.lwjgl.system.MemoryUtil.memPointerBufferSafe(r0, r1)     // Catch: java.lang.Throwable -> L33
            r14 = r0
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r14
            return r0
        L33:
            r15 = move-exception
            r0 = r9
            r1 = r10
            r0.setPointer(r1)
            r0 = r15
            throw r0
    }

    public static long nglXChooseFBConfig(long r10, int r12, long r13, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXChooseFBConfig
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
    @org.lwjgl.system.NativeType("GLXFBConfig *")
    public static org.lwjgl.PointerBuffer glXChooseFBConfig(@org.lwjgl.system.NativeType("Display *") long r8, int r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r11) {
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
            long r0 = nglXChooseFBConfig(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L45
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

    public static int nglXGetFBConfigAttrib(long r10, long r12, int r14, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetFBConfigAttrib
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

    public static int glXGetFBConfigAttrib(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXFBConfig") long r10, int r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13) {
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
            int r0 = nglXGetFBConfigAttrib(r0, r1, r2, r3)
            return r0
    }

    public static long nglXGetVisualFromFBConfig(long r7, long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetVisualFromFBConfig
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
    public static org.lwjgl.system.linux.XVisualInfo glXGetVisualFromFBConfig(@org.lwjgl.system.NativeType("Display *") long r5, @org.lwjgl.system.NativeType("GLXFBConfig") long r7) {
            r0 = r5
            r1 = r7
            long r0 = nglXGetVisualFromFBConfig(r0, r1)
            r9 = r0
            r0 = r9
            org.lwjgl.system.linux.XVisualInfo r0 = org.lwjgl.system.linux.XVisualInfo.createSafe(r0)
            return r0
    }

    public static long nglXCreateWindow(long r11, long r13, long r15, long r17) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateWindow
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            long r0 = org.lwjgl.system.JNI.callPPNPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXWindow")
    public static long glXCreateWindow(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXFBConfig") long r11, @org.lwjgl.system.NativeType("Window") long r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            long r0 = nglXCreateWindow(r0, r1, r2, r3)
            return r0
    }

    public static long nglXCreatePixmap(long r11, long r13, long r15, long r17) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreatePixmap
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r17
            r4 = r19
            long r0 = org.lwjgl.system.JNI.callPPNPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXPixmap")
    public static long glXCreatePixmap(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXFBConfig") long r11, @org.lwjgl.system.NativeType("Pixmap") long r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            long r0 = nglXCreatePixmap(r0, r1, r2, r3)
            return r0
    }

    public static void glXDestroyPixmap(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXPixmap") long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXDestroyPixmap
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static long nglXCreatePbuffer(long r9, long r11, long r13) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreatePbuffer
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
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXPbuffer")
    public static long glXCreatePbuffer(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXFBConfig") long r9, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r11
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            long r0 = nglXCreatePbuffer(r0, r1, r2)
            return r0
    }

    public static void glXDestroyPbuffer(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXPbuffer") long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXDestroyPbuffer
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
            org.lwjgl.system.JNI.callPPV(r0, r1, r2)
            return
    }

    public static void nglXQueryDrawable(long r10, long r12, int r14, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryDrawable
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glXQueryDrawable(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXDrawable") long r10, int r12, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r13) {
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
            nglXQueryDrawable(r0, r1, r2, r3)
            return
    }

    @org.lwjgl.system.NativeType("void")
    public static int glXQueryDrawable(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXDrawable") long r10, int r12) {
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackGet()
            r13 = r0
            r0 = r13
            int r0 = r0.getPointer()
            r14 = r0
            r0 = r13
            r1 = 1
            java.nio.IntBuffer r0 = r0.callocInt(r1)     // Catch: java.lang.Throwable -> L32
            r15 = r0
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r15
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)     // Catch: java.lang.Throwable -> L32
            nglXQueryDrawable(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L32
            r0 = r15
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L32
            r16 = r0
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r16
            return r0
        L32:
            r17 = move-exception
            r0 = r13
            r1 = r14
            r0.setPointer(r1)
            r0 = r17
            throw r0
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glXCreateNewContext(@org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("GLXFBConfig") long r13, int r15, @org.lwjgl.system.NativeType("GLXContext") long r16, @org.lwjgl.system.NativeType("Bool") boolean r18) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateNewContext
            r19 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r19
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r11
            r1 = r13
            r2 = r15
            r3 = r16
            r4 = r18
            if (r4 == 0) goto L2d
            r4 = 1
            goto L2e
        L2d:
            r4 = 0
        L2e:
            r5 = r19
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXMakeContextCurrent(@org.lwjgl.system.NativeType("Display *") long r11, @org.lwjgl.system.NativeType("GLXDrawable") long r13, @org.lwjgl.system.NativeType("GLXDrawable") long r15, @org.lwjgl.system.NativeType("GLXContext") long r17) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXMakeContextCurrent
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
    public static long glXGetCurrentReadDrawable() {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetCurrentReadDrawable
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

    public static int nglXQueryContext(long r10, long r12, int r14, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryContext
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

    public static int glXQueryContext(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXContext") long r10, int r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13) {
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
            int r0 = nglXQueryContext(r0, r1, r2, r3)
            return r0
    }

    public static void glXSelectEvent(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXDrawable") long r11, @org.lwjgl.system.NativeType("unsigned long") long r13) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXSelectEvent
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
            org.lwjgl.system.JNI.callPPNV(r0, r1, r2, r3)
            return
    }

    public static void nglXGetSelectedEvent(long r9, long r11, long r13) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetSelectedEvent
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3)
            return
    }

    public static void glXGetSelectedEvent(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXDrawable") long r9, @org.lwjgl.system.NativeType("unsigned long *") org.lwjgl.CLongBuffer r11) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r7
            r1 = r9
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            nglXGetSelectedEvent(r0, r1, r2)
            return
    }

    @javax.annotation.Nullable
    @org.lwjgl.system.NativeType("GLXFBConfig *")
    public static org.lwjgl.PointerBuffer glXChooseFBConfig(@org.lwjgl.system.NativeType("Display *") long r9, int r11, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r12) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXChooseFBConfig
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

    public static int glXGetFBConfigAttrib(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXFBConfig") long r11, int r13, @org.lwjgl.system.NativeType("int *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetFBConfigAttrib
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

    @org.lwjgl.system.NativeType("GLXWindow")
    public static long glXCreateWindow(@org.lwjgl.system.NativeType("Display *") long r10, @org.lwjgl.system.NativeType("GLXFBConfig") long r12, @org.lwjgl.system.NativeType("Window") long r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r16) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateWindow
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L23:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            long r0 = org.lwjgl.system.JNI.callPPNPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXPixmap")
    public static long glXCreatePixmap(@org.lwjgl.system.NativeType("Display *") long r10, @org.lwjgl.system.NativeType("GLXFBConfig") long r12, @org.lwjgl.system.NativeType("Pixmap") long r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r16) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreatePixmap
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r16
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L23:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r16
            r4 = r17
            long r0 = org.lwjgl.system.JNI.callPPNPP(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXPbuffer")
    public static long glXCreatePbuffer(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXFBConfig") long r10, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r12) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreatePbuffer
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L23:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3)
            return r0
    }

    public static void glXQueryDrawable(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXDrawable") long r11, int r13, @org.lwjgl.system.NativeType("unsigned int *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryDrawable
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
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static int glXQueryContext(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXContext") long r11, int r13, @org.lwjgl.system.NativeType("int *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryContext
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
}
