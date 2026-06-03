package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMatrixPalette.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMatrixPalette.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBMatrixPalette.class */
public class ARBMatrixPalette {
    public static final int GL_MATRIX_PALETTE_ARB = 34880;
    public static final int GL_MAX_MATRIX_PALETTE_STACK_DEPTH_ARB = 34881;
    public static final int GL_MAX_PALETTE_MATRICES_ARB = 34882;
    public static final int GL_CURRENT_PALETTE_MATRIX_ARB = 34883;
    public static final int GL_MATRIX_INDEX_ARRAY_ARB = 34884;
    public static final int GL_CURRENT_MATRIX_INDEX_ARB = 34885;
    public static final int GL_MATRIX_INDEX_ARRAY_SIZE_ARB = 34886;
    public static final int GL_MATRIX_INDEX_ARRAY_TYPE_ARB = 34887;
    public static final int GL_MATRIX_INDEX_ARRAY_STRIDE_ARB = 34888;
    public static final int GL_MATRIX_INDEX_ARRAY_POINTER_ARB = 34889;

    protected ARBMatrixPalette() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glCurrentPaletteMatrixARB(@org.lwjgl.system.NativeType("GLint") int r0);

    public static native void nglMatrixIndexuivARB(int r0, long r1);

    public static void glMatrixIndexuivARB(@org.lwjgl.system.NativeType("GLuint *") java.nio.IntBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixIndexuivARB(r0, r1)
            return
    }

    public static native void nglMatrixIndexubvARB(int r0, long r1);

    public static void glMatrixIndexubvARB(@org.lwjgl.system.NativeType("GLubyte *") java.nio.ByteBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixIndexubvARB(r0, r1)
            return
    }

    public static native void nglMatrixIndexusvARB(int r0, long r1);

    public static void glMatrixIndexusvARB(@org.lwjgl.system.NativeType("GLushort *") java.nio.ShortBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglMatrixIndexusvARB(r0, r1)
            return
    }

    public static native void nglMatrixIndexPointerARB(int r0, int r1, int r2, long r3);

    public static void glMatrixIndexPointerARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMatrixIndexPointerARB(r0, r1, r2, r3)
            return
    }

    public static void glMatrixIndexPointerARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLenum") int r7, @org.lwjgl.system.NativeType("GLsizei") int r8, @org.lwjgl.system.NativeType("void const *") long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            nglMatrixIndexPointerARB(r0, r1, r2, r3)
            return
    }

    public static void glMatrixIndexPointerARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ByteBuffer r8) {
            r0 = r6
            r1 = 5121(0x1401, float:7.176E-42)
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMatrixIndexPointerARB(r0, r1, r2, r3)
            return
    }

    public static void glMatrixIndexPointerARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.ShortBuffer r8) {
            r0 = r6
            r1 = 5123(0x1403, float:7.179E-42)
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMatrixIndexPointerARB(r0, r1, r2, r3)
            return
    }

    public static void glMatrixIndexPointerARB(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("void const *") java.nio.IntBuffer r8) {
            r0 = r6
            r1 = 5125(0x1405, float:7.182E-42)
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglMatrixIndexPointerARB(r0, r1, r2, r3)
            return
    }

    public static void glMatrixIndexuivARB(@org.lwjgl.system.NativeType("GLuint *") int[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixIndexuivARB
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    public static void glMatrixIndexusvARB(@org.lwjgl.system.NativeType("GLushort *") short[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMatrixIndexusvARB
            r6 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r5
            int r0 = r0.length
            r1 = r5
            r2 = r6
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
