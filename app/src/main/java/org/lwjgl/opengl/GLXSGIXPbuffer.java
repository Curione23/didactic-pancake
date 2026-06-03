package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIXPbuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIXPbuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXSGIXPbuffer.class */
public class GLXSGIXPbuffer {
    public static final int GLX_MAX_PBUFFER_WIDTH_SGIX = 32790;
    public static final int GLX_MAX_PBUFFER_HEIGHT_SGIX = 32791;
    public static final int GLX_MAX_PBUFFER_PIXELS_SGIX = 32792;
    public static final int GLX_OPTIMAL_PBUFFER_WIDTH_SGIX = 32793;
    public static final int GLX_OPTIMAL_PBUFFER_HEIGHT_SGIX = 32794;
    public static final int GLX_PBUFFER_BIT_SGIX = 4;
    public static final int GLX_PRESERVED_CONTENTS_SGIX = 32795;
    public static final int GLX_LARGEST_PBUFFER_SGIX = 32796;
    public static final int GLX_WIDTH_SGIX = 32797;
    public static final int GLX_HEIGHT_SGIX = 32798;
    public static final int GLX_EVENT_MASK_SGIX = 32799;
    public static final int GLX_BUFFER_CLOBBER_MASK_SGIX = 134217728;
    public static final int GLX_DAMAGED_SGIX = 32800;
    public static final int GLX_SAVED_SGIX = 32801;
    public static final int GLX_WINDOW_SGIX = 32802;
    public static final int GLX_PBUFFER_SGIX = 32803;
    public static final int GLX_FRONT_LEFT_BUFFER_BIT_SGIX = 1;
    public static final int GLX_FRONT_RIGHT_BUFFER_BIT_SGIX = 2;
    public static final int GLX_BACK_LEFT_BUFFER_BIT_SGIX = 4;
    public static final int GLX_BACK_RIGHT_BUFFER_BIT_SGIX = 8;
    public static final int GLX_AUX_BUFFERS_BIT_SGIX = 16;
    public static final int GLX_DEPTH_BUFFER_BIT_SGIX = 32;
    public static final int GLX_STENCIL_BUFFER_BIT_SGIX = 64;
    public static final int GLX_ACCUM_BUFFER_BIT_SGIX = 128;
    public static final int GLX_SAMPLE_BUFFERS_BIT_SGIX = 256;

    protected GLXSGIXPbuffer() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static long nglXCreateGLXPbufferSGIX(long r11, long r13, int r15, int r16, long r17) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateGLXPbufferSGIX
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
            r4 = r17
            r5 = r19
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXPbuffer")
    public static long glXCreateGLXPbufferSGIX(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXFBConfig") long r11, @org.lwjgl.system.NativeType("unsigned int") int r13, @org.lwjgl.system.NativeType("unsigned int") int r14, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r15) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r15
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            long r4 = org.lwjgl.system.MemoryUtil.memAddressSafe(r4)
            long r0 = nglXCreateGLXPbufferSGIX(r0, r1, r2, r3, r4)
            return r0
    }

    public static void glXDestroyGLXPbufferSGIX(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXPbuffer") long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXDestroyGLXPbufferSGIX
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

    public static void nglXQueryGLXPbufferSGIX(long r10, long r12, int r14, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryGLXPbufferSGIX
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

    public static void glXQueryGLXPbufferSGIX(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXPbuffer") long r10, int r12, @org.lwjgl.system.NativeType("unsigned int *") java.nio.IntBuffer r13) {
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
            nglXQueryGLXPbufferSGIX(r0, r1, r2, r3)
            return
    }

    public static void glXSelectEventSGIX(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXDrawable") long r11, @org.lwjgl.system.NativeType("unsigned long") long r13) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXSelectEventSGIX
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

    public static void nglXGetSelectedEventSGIX(long r9, long r11, long r13) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetSelectedEventSGIX
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

    public static void glXGetSelectedEventSGIX(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXDrawable") long r9, @org.lwjgl.system.NativeType("unsigned long *") org.lwjgl.CLongBuffer r11) {
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
            nglXGetSelectedEventSGIX(r0, r1, r2)
            return
    }

    @org.lwjgl.system.NativeType("GLXPbuffer")
    public static long glXCreateGLXPbufferSGIX(@org.lwjgl.system.NativeType("Display *") long r10, @org.lwjgl.system.NativeType("GLXFBConfig") long r12, @org.lwjgl.system.NativeType("unsigned int") int r14, @org.lwjgl.system.NativeType("unsigned int") int r15, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int *") int[] r16) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXCreateGLXPbufferSGIX
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
            r3 = r15
            r4 = r16
            r5 = r17
            long r0 = org.lwjgl.system.JNI.callPPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static void glXQueryGLXPbufferSGIX(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXPbuffer") long r11, int r13, @org.lwjgl.system.NativeType("unsigned int *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryGLXPbufferSGIX
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
}
