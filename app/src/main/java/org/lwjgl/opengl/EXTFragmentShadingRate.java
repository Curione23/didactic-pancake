package org.lwjgl.opengl;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/EXTFragmentShadingRate.class */
public class EXTFragmentShadingRate {
    public static final int GL_SHADING_RATE_ATTACHMENT_EXT = 38609;
    public static final int GL_SHADING_RATE_1X1_PIXELS_EXT = 38566;
    public static final int GL_SHADING_RATE_1X2_PIXELS_EXT = 38567;
    public static final int GL_SHADING_RATE_1X4_PIXELS_EXT = 38570;
    public static final int GL_SHADING_RATE_2X1_PIXELS_EXT = 38568;
    public static final int GL_SHADING_RATE_2X2_PIXELS_EXT = 38569;
    public static final int GL_SHADING_RATE_2X4_PIXELS_EXT = 38573;
    public static final int GL_SHADING_RATE_4X1_PIXELS_EXT = 38571;
    public static final int GL_SHADING_RATE_4X2_PIXELS_EXT = 38572;
    public static final int GL_SHADING_RATE_4X4_PIXELS_EXT = 38574;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_KEEP_EXT = 38610;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_REPLACE_EXT = 38611;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MIN_EXT = 38612;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MAX_EXT = 38613;
    public static final int GL_FRAGMENT_SHADING_RATE_COMBINER_OP_MUL_EXT = 38614;
    public static final int GL_SHADING_RATE_EXT = 38608;
    public static final int GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT = 38615;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_WIDTH_EXT = 38616;
    public static final int GL_MIN_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT = 38617;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_HEIGHT_EXT = 38618;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_TEXEL_ASPECT_RATIO_EXT = 38619;
    public static final int GL_MAX_FRAGMENT_SHADING_RATE_ATTACHMENT_LAYERS_EXT = 38620;
    public static final int GL_FRAGMENT_SHADING_RATE_WITH_SHADER_DEPTH_STENCIL_WRITES_SUPPORTED_EXT = 38621;
    public static final int GL_FRAGMENT_SHADING_RATE_WITH_SAMPLE_MASK_SUPPORTED_EXT = 38622;
    public static final int GL_FRAGMENT_SHADING_RATE_ATTACHMENT_WITH_DEFAULT_FRAMEBUFFER_SUPPORTED_EXT = 38623;
    public static final int GL_FRAGMENT_SHADING_RATE_NON_TRIVIAL_COMBINERS_SUPPORTED_EXT = 36719;
    public static final int GL_FRAGMENT_SHADING_RATE_PRIMITIVE_RATE_WITH_MULTI_VIEWPORT_SUPPORTED_EXT = 38784;

    protected EXTFragmentShadingRate() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static native void glShadingRateEXT(@org.lwjgl.system.NativeType("GLenum") int r0);

    public static native void glShadingRateCombinerOpsEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1);

    public static native void glFramebufferShadingRateEXT(@org.lwjgl.system.NativeType("GLenum") int r0, @org.lwjgl.system.NativeType("GLenum") int r1, @org.lwjgl.system.NativeType("GLuint") int r2, @org.lwjgl.system.NativeType("GLint") int r3, @org.lwjgl.system.NativeType("GLsizei") int r4, @org.lwjgl.system.NativeType("GLsizei") int r5, @org.lwjgl.system.NativeType("GLsizei") int r6);

    public static native void nglGetFragmentShadingRatesEXT(int r0, int r1, long r2, long r4);

    public static void glGetFragmentShadingRatesEXT(@org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei *") java.nio.IntBuffer r8, @org.lwjgl.system.NativeType("GLenum *") java.nio.IntBuffer r9) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        Lb:
            r0 = r7
            r1 = r9
            int r1 = r1.remaining()
            r2 = r8
            long r2 = org.lwjgl.system.MemoryUtil.memAddress(r2)
            r3 = r9
            long r3 = org.lwjgl.system.MemoryUtil.memAddress(r3)
            nglGetFragmentShadingRatesEXT(r0, r1, r2, r3)
            return
    }

    public static void glGetFragmentShadingRatesEXT(@org.lwjgl.system.NativeType("GLsizei") int r7, @org.lwjgl.system.NativeType("GLsizei *") int[] r8, @org.lwjgl.system.NativeType("GLenum *") int[] r9) {
            org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.getICD()
            long r0 = r0.glGetFragmentShadingRatesEXT
            r10 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            r1 = 1
            org.lwjgl.system.Checks.check(r0, r1)
        L17:
            r0 = r7
            r1 = r9
            int r1 = r1.length
            r2 = r8
            r3 = r9
            r4 = r10
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.opengl.GL.initialize()
            return
    }
}
