package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVFramebufferMixedSamples.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVFramebufferMixedSamples.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/NVFramebufferMixedSamples.class */
public class NVFramebufferMixedSamples {
    public static final int GL_RASTER_MULTISAMPLE_EXT = 37671;
    public static final int GL_COVERAGE_MODULATION_TABLE_NV = 37681;
    public static final int GL_RASTER_SAMPLES_EXT = 37672;
    public static final int GL_MAX_RASTER_SAMPLES_EXT = 37673;
    public static final int GL_RASTER_FIXED_SAMPLE_LOCATIONS_EXT = 37674;
    public static final int GL_MULTISAMPLE_RASTERIZATION_ALLOWED_EXT = 37675;
    public static final int GL_EFFECTIVE_RASTER_SAMPLES_EXT = 37676;
    public static final int GL_COLOR_SAMPLES_NV = 36384;
    public static final int GL_DEPTH_SAMPLES_NV = 37677;
    public static final int GL_STENCIL_SAMPLES_NV = 37678;
    public static final int GL_MIXED_DEPTH_SAMPLES_SUPPORTED_NV = 37679;
    public static final int GL_MIXED_STENCIL_SAMPLES_SUPPORTED_NV = 37680;
    public static final int GL_COVERAGE_MODULATION_NV = 37682;
    public static final int GL_COVERAGE_MODULATION_TABLE_SIZE_NV = 37683;

    protected NVFramebufferMixedSamples() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void glRasterSamplesEXT(@org.lwjgl.system.NativeType("GLuint") int r3, @org.lwjgl.system.NativeType("GLboolean") boolean r4) {
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.EXTRasterMultisample.glRasterSamplesEXT(r0, r1)
            return
    }

    public static native void nglCoverageModulationTableNV(int r0, long r1);

    public static void glCoverageModulationTableNV(@org.lwjgl.system.NativeType("GLfloat const *") java.nio.FloatBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglCoverageModulationTableNV(r0, r1)
            return
    }

    public static native void nglGetCoverageModulationTableNV(int r0, long r1);

    public static void glGetCoverageModulationTableNV(@org.lwjgl.system.NativeType("GLfloat *") java.nio.FloatBuffer r4) {
            r0 = r4
            int r0 = r0.remaining()
            r1 = r4
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)
            nglGetCoverageModulationTableNV(r0, r1)
            return
    }

    public static native void glCoverageModulationNV(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static void glCoverageModulationTableNV(@org.lwjgl.system.NativeType("GLfloat const *") float[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glCoverageModulationTableNV
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

    public static void glGetCoverageModulationTableNV(@org.lwjgl.system.NativeType("GLfloat *") float[] r5) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetCoverageModulationTableNV
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
