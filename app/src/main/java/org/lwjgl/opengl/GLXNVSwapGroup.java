package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVSwapGroup.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVSwapGroup.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXNVSwapGroup.class */
public class GLXNVSwapGroup {
    protected GLXNVSwapGroup() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXJoinSwapGroupNV(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXDrawable") long r10, @org.lwjgl.system.NativeType("GLuint") int r12) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXJoinSwapGroupNV
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L2e
            r0 = 1
            goto L2f
        L2e:
            r0 = 0
        L2f:
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXBindSwapBarrierNV(@org.lwjgl.system.NativeType("Display *") long r7, @org.lwjgl.system.NativeType("GLuint") int r9, @org.lwjgl.system.NativeType("GLuint") int r10) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXBindSwapBarrierNV
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
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2, r3)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    public static int nglXQuerySwapGroupNV(long r11, long r13, long r15, long r17) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQuerySwapGroupNV
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
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQuerySwapGroupNV(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXDrawable") long r11, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r13, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r14) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L12:
            r0 = r9
            r1 = r11
            r2 = r13
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r14
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nglXQuerySwapGroupNV(r0, r1, r2, r3)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    public static int nglXQueryMaxSwapGroupsNV(long r10, int r12, long r13, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryMaxSwapGroupsNV
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
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryMaxSwapGroupsNV(@org.lwjgl.system.NativeType("Display *") long r8, int r10, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r11, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r12) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L11
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L11:
            r0 = r8
            r1 = r10
            r2 = r11
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r12
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            int r0 = nglXQueryMaxSwapGroupsNV(r0, r1, r2, r3)
            if (r0 == 0) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = 0
        L27:
            return r0
    }

    public static int nglXQueryFrameCountNV(long r8, int r10, long r11) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryFrameCountNV
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryFrameCountNV(@org.lwjgl.system.NativeType("Display *") long r6, int r8, @org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r9
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r6
            r1 = r8
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nglXQueryFrameCountNV(r0, r1, r2)
            if (r0 == 0) goto L1b
            r0 = 1
            goto L1c
        L1b:
            r0 = 0
        L1c:
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXResetFrameCountNV(@org.lwjgl.system.NativeType("Display *") long r6, int r8) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXResetFrameCountNV
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
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQuerySwapGroupNV(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXDrawable") long r11, @org.lwjgl.system.NativeType("GLuint *") int[] r13, @org.lwjgl.system.NativeType("GLuint *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQuerySwapGroupNV
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L2a
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r13
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r14
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L2a:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            int r0 = org.lwjgl.system.JNI.callPPPPI(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryMaxSwapGroupsNV(@org.lwjgl.system.NativeType("Display *") long r8, int r10, @org.lwjgl.system.NativeType("GLuint *") int[] r11, @org.lwjgl.system.NativeType("GLuint *") int[] r12) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryMaxSwapGroupsNV
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L24
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
            r0 = r12
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L24:
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            int r0 = org.lwjgl.system.JNI.callPPPI(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L35
            r0 = 1
            goto L36
        L35:
            r0 = 0
        L36:
            return r0
    }

    @org.lwjgl.system.NativeType("Bool")
    public static boolean glXQueryFrameCountNV(@org.lwjgl.system.NativeType("Display *") long r7, int r9, @org.lwjgl.system.NativeType("GLuint *") int[] r10) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXQueryFrameCountNV
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L1e:
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2, r3)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            return r0
    }
}
