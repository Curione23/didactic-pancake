package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBRenderTexture.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBRenderTexture.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/WGLARBRenderTexture.class */
public class WGLARBRenderTexture {
    public static final int WGL_BIND_TO_TEXTURE_RGB_ARB = 8304;
    public static final int WGL_BIND_TO_TEXTURE_RGBA_ARB = 8305;
    public static final int WGL_TEXTURE_FORMAT_ARB = 8306;
    public static final int WGL_TEXTURE_TARGET_ARB = 8307;
    public static final int WGL_MIPMAP_TEXTURE_ARB = 8308;
    public static final int WGL_TEXTURE_RGB_ARB = 8309;
    public static final int WGL_TEXTURE_RGBA_ARB = 8310;
    public static final int WGL_NO_TEXTURE_ARB = 8311;
    public static final int WGL_TEXTURE_CUBE_MAP_ARB = 8312;
    public static final int WGL_TEXTURE_1D_ARB = 8313;
    public static final int WGL_TEXTURE_2D_ARB = 8314;
    public static final int WGL_MIPMAP_LEVEL_ARB = 8315;
    public static final int WGL_CUBE_MAP_FACE_ARB = 8316;
    public static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB = 8317;
    public static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB = 8318;
    public static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB = 8319;
    public static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB = 8320;
    public static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB = 8321;
    public static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB = 8322;
    public static final int WGL_FRONT_LEFT_ARB = 8323;
    public static final int WGL_FRONT_RIGHT_ARB = 8324;
    public static final int WGL_BACK_LEFT_ARB = 8325;
    public static final int WGL_BACK_RIGHT_ARB = 8326;
    public static final int WGL_AUX0_ARB = 8327;
    public static final int WGL_AUX1_ARB = 8328;
    public static final int WGL_AUX2_ARB = 8329;
    public static final int WGL_AUX3_ARB = 8330;
    public static final int WGL_AUX4_ARB = 8331;
    public static final int WGL_AUX5_ARB = 8332;
    public static final int WGL_AUX6_ARB = 8333;
    public static final int WGL_AUX7_ARB = 8334;
    public static final int WGL_AUX8_ARB = 8335;
    public static final int WGL_AUX9_ARB = 8336;

    protected WGLARBRenderTexture() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglBindTexImageARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r6, int r8) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglBindTexImageARB
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglReleaseTexImageARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r6, int r8) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglReleaseTexImageARB
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L17
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
        L17:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPI(r0, r1, r2)
            if (r0 == 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            return r0
    }

    public static int nwglSetPbufferAttribARB(long r7, long r9) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglSetPbufferAttribARB
            r11 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L19
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r7
            long r0 = org.lwjgl.system.Checks.check(r0)
        L19:
            r0 = r7
            r1 = r9
            r2 = r11
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglSetPbufferAttribARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r5, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r7) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto La
            r0 = r7
            org.lwjgl.system.Checks.checkNTSafe(r0)
        La:
            r0 = r5
            r1 = r7
            long r1 = org.lwjgl.system.MemoryUtil.memAddressSafe(r1)
            int r0 = nwglSetPbufferAttribARB(r0, r1)
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            return r0
    }

    @org.lwjgl.system.NativeType("BOOL")
    public static boolean wglSetPbufferAttribARB(@org.lwjgl.system.NativeType("HPBUFFERARB") long r6, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r8) {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesWGL()
            long r0 = r0.wglSetPbufferAttribARB
            r9 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1b
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r6
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L1b:
            r0 = r6
            r1 = r8
            r2 = r9
            int r0 = org.lwjgl.system.JNI.callPPI(r0, r1, r2)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }
}
