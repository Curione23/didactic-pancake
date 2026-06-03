package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTEGLImageStorage.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTEGLImageStorage.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTEGLImageStorage.class */
public class EXTEGLImageStorage {
    protected EXTEGLImageStorage() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglEGLImageTargetTexStorageEXT(int r0, long r1, long r3);

    public static void glEGLImageTargetTexStorageEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @org.lwjgl.system.NativeType("GLeglImageOES") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lf:
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nglEGLImageTargetTexStorageEXT(r0, r1, r2)
            return
    }

    public static native void nglEGLImageTargetTextureStorageEXT(int r0, long r1, long r3);

    public static void glEGLImageTargetTextureStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r6, @org.lwjgl.system.NativeType("GLeglImageOES") long r7, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lf
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lf:
            r0 = r6
            r1 = r7
            r2 = r9
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nglEGLImageTargetTextureStorageEXT(r0, r1, r2)
            return
    }

    public static void glEGLImageTargetTexStorageEXT(@org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLeglImageOES") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glEGLImageTargetTexStorageEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1d:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void glEGLImageTargetTextureStorageEXT(@org.lwjgl.system.NativeType("GLuint") int r7, @org.lwjgl.system.NativeType("GLeglImageOES") long r8, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r10) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glEGLImageTargetTextureStorageEXT
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1d
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1d:
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r11
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
