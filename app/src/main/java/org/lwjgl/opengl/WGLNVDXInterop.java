package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVDXInterop.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVDXInterop.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLNVDXInterop.class */
public class WGLNVDXInterop {
    public static final int WGL_ACCESS_READ_ONLY_NV = 0;
    public static final int WGL_ACCESS_READ_WRITE_NV = 1;
    public static final int WGL_ACCESS_WRITE_DISCARD_NV = 2;

    protected WGLNVDXInterop() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDXSetResourceShareHandleNV(@org.lwjgl.system.NativeType("void *") long r7, @org.lwjgl.system.NativeType("HANDLE") long r9) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXSetResourceShareHandleNV
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    @org.lwjgl.system.NativeType("HANDLE")
    public static long wglDXOpenDeviceNV(@org.lwjgl.system.NativeType("void *") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXOpenDeviceNV
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
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDXCloseDeviceNV(@org.lwjgl.system.NativeType("HANDLE") long r5) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXCloseDeviceNV
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
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1)
            if (r0 == 0) goto L23
            r0 = 1
            goto L24
        L23:
            r0 = 0
        L24:
            return r0
    }

    @org.lwjgl.system.NativeType("HANDLE")
    public static long wglDXRegisterObjectNV(@org.lwjgl.system.NativeType("HANDLE") long r10, @org.lwjgl.system.NativeType("void *") long r12, @org.lwjgl.system.NativeType("GLuint") int r14, @org.lwjgl.system.NativeType("GLenum") int r15, @org.lwjgl.system.NativeType("GLenum") int r16) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXRegisterObjectNV
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
            r4 = r16
            r5 = r17
            long r0 = org.lwjgl.system.JNI.callPPP(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDXUnregisterObjectNV(@org.lwjgl.system.NativeType("HANDLE") long r7, @org.lwjgl.system.NativeType("HANDLE") long r9) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXUnregisterObjectNV
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
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            if (r0 == 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDXObjectAccessNV(@org.lwjgl.system.NativeType("HANDLE") long r6, @org.lwjgl.system.NativeType("GLenum") int r8) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXObjectAccessNV
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

    public static int nwglDXLockObjectsNV(long r8, int r10, long r11) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXLockObjectsNV
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

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDXLockObjectsNV(@org.lwjgl.system.NativeType("HANDLE") long r6, @org.lwjgl.system.NativeType("HANDLE *") org.lwjgl.PointerBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nwglDXLockObjectsNV(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }

    public static int nwglDXUnlockObjectsNV(long r8, int r10, long r11) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglDXUnlockObjectsNV
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

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglDXUnlockObjectsNV(@org.lwjgl.system.NativeType("HANDLE") long r6, @org.lwjgl.system.NativeType("HANDLE *") org.lwjgl.PointerBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            int r0 = nwglDXUnlockObjectsNV(r0, r1, r2)
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
    }
}
