package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBWindowPos.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBWindowPos.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ARBWindowPos.class */
public class ARBWindowPos {
    protected ARBWindowPos() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glWindowPos2iARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1);

    public static native void glWindowPos2sARB(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1);

    public static native void glWindowPos2fARB(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void glWindowPos2dARB(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2);

    public static native void nglWindowPos2ivARB(long r0);

    public static void glWindowPos2ivARB(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2ivARB(r0)
            return
    }

    public static native void nglWindowPos2svARB(long r0);

    public static void glWindowPos2svARB(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2svARB(r0)
            return
    }

    public static native void nglWindowPos2fvARB(long r0);

    public static void glWindowPos2fvARB(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2fvARB(r0)
            return
    }

    public static native void nglWindowPos2dvARB(long r0);

    public static void glWindowPos2dvARB(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos2dvARB(r0)
            return
    }

    public static native void glWindowPos3iARB(@org.lwjgl.system.NativeType("GLint") int r0, @org.lwjgl.system.NativeType("GLint") int r1, @org.lwjgl.system.NativeType("GLint") int r2);

    public static native void glWindowPos3sARB(@org.lwjgl.system.NativeType("GLshort") short r0, @org.lwjgl.system.NativeType("GLshort") short r1, @org.lwjgl.system.NativeType("GLshort") short r2);

    public static native void glWindowPos3fARB(@org.lwjgl.system.NativeType("GLfloat") float r0, @org.lwjgl.system.NativeType("GLfloat") float r1, @org.lwjgl.system.NativeType("GLfloat") float r2);

    public static native void glWindowPos3dARB(@org.lwjgl.system.NativeType("GLdouble") double r0, @org.lwjgl.system.NativeType("GLdouble") double r2, @org.lwjgl.system.NativeType("GLdouble") double r4);

    public static native void nglWindowPos3ivARB(long r0);

    public static void glWindowPos3ivARB(@org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3ivARB(r0)
            return
    }

    public static native void nglWindowPos3svARB(long r0);

    public static void glWindowPos3svARB(@org.lwjgl.system.NativeType("GLshort const *") java.nio.ShortBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3svARB(r0)
            return
    }

    public static native void nglWindowPos3fvARB(long r0);

    public static void glWindowPos3fvARB(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3fvARB(r0)
            return
    }

    public static native void nglWindowPos3dvARB(long r0);

    public static void glWindowPos3dvARB(@org.lwjgl.system.NativeType("GLdouble const *") java.nio.DoubleBuffer r3) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r3
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r3
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
            nglWindowPos3dvARB(r0)
            return
    }

    public static void glWindowPos2ivARB(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2ivARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos2svARB(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2svARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos2fvARB(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2fvARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos2dvARB(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos2dvARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 2
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3ivARB(@org.lwjgl.system.NativeType("GLint const *") int[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3ivARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3svARB(@org.lwjgl.system.NativeType("GLshort const *") short[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3svARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3fvARB(@org.lwjgl.system.NativeType("GLfloat const *") float[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3fvARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r4
            r1 = r5
            org.lwjgl.system.JNI.callPV(r0, r1)
            return
    }

    public static void glWindowPos3dvARB(@org.lwjgl.system.NativeType("GLdouble const *") double[] r4) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowPos3dvARB
            r5 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r5
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r4
            r1 = 3
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
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
