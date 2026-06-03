package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL21C.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL21C.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL21C.class */
public class GL21C extends org.lwjgl.opengl.GL20C {
    public static final int GL_FLOAT_MAT2x3 = 35685;
    public static final int GL_FLOAT_MAT2x4 = 35686;
    public static final int GL_FLOAT_MAT3x2 = 35687;
    public static final int GL_FLOAT_MAT3x4 = 35688;
    public static final int GL_FLOAT_MAT4x2 = 35689;
    public static final int GL_FLOAT_MAT4x3 = 35690;
    public static final int GL_PIXEL_PACK_BUFFER = 35051;
    public static final int GL_PIXEL_UNPACK_BUFFER = 35052;
    public static final int GL_PIXEL_PACK_BUFFER_BINDING = 35053;
    public static final int GL_PIXEL_UNPACK_BUFFER_BINDING = 35055;
    public static final int GL_SRGB = 35904;
    public static final int GL_SRGB8 = 35905;
    public static final int GL_SRGB_ALPHA = 35906;
    public static final int GL_SRGB8_ALPHA8 = 35907;
    public static final int GL_COMPRESSED_SRGB = 35912;
    public static final int GL_COMPRESSED_SRGB_ALPHA = 35913;

    protected GL21C() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void nglUniformMatrix2x3fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix2x3fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 6
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix2x3fv(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix3x2fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix3x2fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 6
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix3x2fv(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix2x4fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix2x4fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix2x4fv(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix4x2fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix4x2fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 3
            int r1 = r1 >> r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix4x2fv(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix3x4fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix3x4fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 12
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix3x4fv(r0, r1, r2, r3)
            return
    }

    public static native void nglUniformMatrix4x3fv(int r0, int r1, boolean r2, long r3);

    public static void glUniformMatrix4x3fv(@org.lwjgl.system.NativeType("GLint") int r6, @org.lwjgl.system.NativeType("GLboolean") boolean r7, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r8) {
            r0 = r6
            r1 = r8
            int r1 = r1.remaining()
            r2 = 12
            int r1 = r1 / r2
            r2 = r7
            r3 = r8
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglUniformMatrix4x3fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2x3fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix2x3fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 6
            int r1 = r1 / r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformMatrix3x2fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix3x2fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 6
            int r1 = r1 / r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformMatrix2x4fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix2x4fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 3
            int r1 = r1 >> r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformMatrix4x2fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix4x2fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 3
            int r1 = r1 >> r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformMatrix3x4fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix3x4fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 12
            int r1 = r1 / r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glUniformMatrix4x3fv(@org.lwjgl.system.NativeType("GLint") int r7, @org.lwjgl.system.NativeType("GLboolean") boolean r8, @org.lwjgl.system.NativeType("GLfloat const *") float[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glUniformMatrix4x3fv
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L12
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L12:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = 12
            int r1 = r1 / r2
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPV(r0, r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
