package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL21.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL21.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL21.class */
public class GL21 extends org.lwjgl.opengl.GL20 {
    public static final int GL_CURRENT_RASTER_SECONDARY_COLOR = 33887;
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
    public static final int GL_SLUMINANCE_ALPHA = 35908;
    public static final int GL_SLUMINANCE8_ALPHA8 = 35909;
    public static final int GL_SLUMINANCE = 35910;
    public static final int GL_SLUMINANCE8 = 35911;
    public static final int GL_COMPRESSED_SRGB = 35912;
    public static final int GL_COMPRESSED_SRGB_ALPHA = 35913;
    public static final int GL_COMPRESSED_SLUMINANCE = 35914;
    public static final int GL_COMPRESSED_SLUMINANCE_ALPHA = 35915;

    protected GL21() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglUniformMatrix2x3fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL21C.nglUniformMatrix2x3fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2x3fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix2x3fv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix3x2fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL21C.nglUniformMatrix3x2fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix3x2fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix3x2fv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix2x4fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL21C.nglUniformMatrix2x4fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix2x4fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix2x4fv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix4x2fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL21C.nglUniformMatrix4x2fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix4x2fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix4x2fv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix3x4fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL21C.nglUniformMatrix3x4fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix3x4fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix3x4fv(r0, r1, r2)
            return
    }

    public static void nglUniformMatrix4x3fv(int r6, int r7, boolean r8, long r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            org.lwjgl.opengl.GL21C.nglUniformMatrix4x3fv(r0, r1, r2, r3)
            return
    }

    public static void glUniformMatrix4x3fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix4x3fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix2x3fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix2x3fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3x2fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix3x2fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix2x4fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix2x4fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4x2fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix4x2fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix3x4fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix3x4fv(r0, r1, r2)
            return
    }

    public static void glUniformMatrix4x3fv(@org.lwjgl.system.NativeType("GLint") int r4, @org.lwjgl.system.NativeType("GLboolean") boolean r5, @org.lwjgl.system.NativeType("GLfloat const *") float[] r6) {
            r0 = r4
            r1 = r5
            r2 = r6
            org.lwjgl.opengl.GL21C.glUniformMatrix4x3fv(r0, r1, r2)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
