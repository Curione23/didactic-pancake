package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTPointParameters.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTPointParameters.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTPointParameters.class */
public class EXTPointParameters {
    public static final int GL_POINT_SIZE_MIN_EXT = 33062;
    public static final int GL_POINT_SIZE_MAX_EXT = 33063;
    public static final int GL_POINT_FADE_THRESHOLD_SIZE_EXT = 33064;
    public static final int GL_DISTANCE_ATTENUATION_EXT = 33065;

    protected EXTPointParameters() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glPointParameterfEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLfloat") float r1);

    public static native void nglPointParameterfvEXT(int r0, long r1);

    public static void glPointParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r4, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r5) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r5
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r4
            r1 = r5
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglPointParameterfvEXT(r0, r1)
            return
    }

    public static void glPointParameterfvEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glPointParameterfvEXT
            r7 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.system.JNI.callPV(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
