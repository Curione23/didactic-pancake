package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTImportContext.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTImportContext.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTImportContext.class */
public class GLXEXTImportContext {
    public static final int GLX_SHARE_CONTEXT_EXT = 32778;
    public static final int GLX_VISUAL_ID_EXT = 32779;
    public static final int GLX_SCREEN_EXT = 32780;

    protected GLXEXTImportContext() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("Display *")
    public static long glXGetCurrentDisplayEXT() {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetCurrentDisplayEXT
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

    public static int nglXQueryContextInfoEXT(long r10, long r12, int r14, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryContextInfoEXT
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

    public static int glXQueryContextInfoEXT(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXContext") long r10, int r12, @org.lwjgl.system.NativeType("int *") java.nio.IntBuffer r13) {
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
            int r0 = nglXQueryContextInfoEXT(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXContextID")
    public static long glXGetContextIDEXT(@org.lwjgl.system.NativeType("GLXContext const") long r5) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXGetContextIDEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r5
            r1 = r7
            long r0 = org.lwjgl.system.JNI.callPN(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("GLXContext")
    public static long glXImportContextEXT(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXContextID") long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXImportContextEXT
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
            r2 = r11
            long r0 = org.lwjgl.system.JNI.callPNP(r0, r1, r2)
            return r0
    }

    public static void glXFreeContextEXT(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLXContext") long r9) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXFreeContextEXT
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

    public static int glXQueryContextInfoEXT(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXContext") long r11, int r13, @org.lwjgl.system.NativeType("int *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryContextInfoEXT
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
