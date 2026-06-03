package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransposeMatrix.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransposeMatrix.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBTransposeMatrix.class */
public class ARBTransposeMatrix {
    public static final int GL_TRANSPOSE_MODELVIEW_MATRIX_ARB = 34019;
    public static final int GL_TRANSPOSE_PROJECTION_MATRIX_ARB = 34020;
    public static final int GL_TRANSPOSE_TEXTURE_MATRIX_ARB = 34021;
    public static final int GL_TRANSPOSE_COLOR_MATRIX_ARB = 34022;

    protected ARBTransposeMatrix() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglLoadTransposeMatrixfARB(long r0);

    public static void glLoadTransposeMatrixfARB(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglLoadTransposeMatrixfARB(r0)
            return
    }

    public static native void nglLoadTransposeMatrixdARB(long r0);

    public static void glLoadTransposeMatrixdARB(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglLoadTransposeMatrixdARB(r0)
            return
    }

    public static native void nglMultTransposeMatrixfARB(long r0);

    public static void glMultTransposeMatrixfARB(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglMultTransposeMatrixfARB(r0)
            return
    }

    public static native void nglMultTransposeMatrixdARB(long r0);

    public static void glMultTransposeMatrixdARB(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lc
            r0 = r3
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        Lc:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglMultTransposeMatrixdARB(r0)
            return
    }

    public static void glLoadTransposeMatrixfARB(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLoadTransposeMatrixfARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glLoadTransposeMatrixdARB(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glLoadTransposeMatrixdARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMultTransposeMatrixfARB(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultTransposeMatrixfARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glMultTransposeMatrixdARB(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glMultTransposeMatrixdARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L18
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 16
            org.lwjgl.system.Checks.check(r0, r1)
        L18:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
