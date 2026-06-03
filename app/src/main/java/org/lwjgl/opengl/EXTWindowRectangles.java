package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTWindowRectangles.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTWindowRectangles.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTWindowRectangles.class */
public class EXTWindowRectangles {
    public static final int GL_INCLUSIVE_EXT = 36624;
    public static final int GL_EXCLUSIVE_EXT = 36625;
    public static final int GL_WINDOW_RECTANGLE_EXT = 36626;
    public static final int GL_WINDOW_RECTANGLE_MODE_EXT = 36627;
    public static final int GL_MAX_WINDOW_RECTANGLES_EXT = 36628;
    public static final int GL_NUM_WINDOW_RECTANGLES_EXT = 36629;

    protected EXTWindowRectangles() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglWindowRectanglesEXT(int r0, int r1, long r2);

    public static void glWindowRectanglesEXT(@org.lwjgl.system.NativeType("GLenum") int r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") java.nio.IntBuffer r6) {
            r0 = r5
            r1 = r6
            int r1 = org.lwjgl.system.Checks.remainingSafe(r1)
            r2 = 2
            int r1 = r1 >> r2
            r2 = r6
            long r2 = org.lwjgl.system.MemoryUtil.memAddressSafe(r2)
            nglWindowRectanglesEXT(r0, r1, r2)
            return
    }

    public static void glWindowRectanglesEXT(@org.lwjgl.system.NativeType("GLenum") int r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("GLint const *") int[] r7) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glWindowRectanglesEXT
            r8 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r6
            r1 = r7
            int r1 = org.lwjgl.system.Checks.lengthSafe(r1)
            r2 = 2
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
