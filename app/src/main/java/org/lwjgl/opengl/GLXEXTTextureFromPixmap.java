package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTTextureFromPixmap.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTTextureFromPixmap.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GLXEXTTextureFromPixmap.class */
public class GLXEXTTextureFromPixmap {
    public static final int GLX_BIND_TO_TEXTURE_RGB_EXT = 8400;
    public static final int GLX_BIND_TO_TEXTURE_RGBA_EXT = 8401;
    public static final int GLX_BIND_TO_MIPMAP_TEXTURE_EXT = 8402;
    public static final int GLX_BIND_TO_TEXTURE_TARGETS_EXT = 8403;
    public static final int GLX_Y_INVERTED_EXT = 8404;
    public static final int GLX_TEXTURE_FORMAT_EXT = 8405;
    public static final int GLX_TEXTURE_TARGET_EXT = 8406;
    public static final int GLX_MIPMAP_TEXTURE_EXT = 8407;
    public static final int GLX_TEXTURE_FORMAT_NONE_EXT = 8408;
    public static final int GLX_TEXTURE_FORMAT_RGB_EXT = 8409;
    public static final int GLX_TEXTURE_FORMAT_RGBA_EXT = 8410;
    public static final int GLX_TEXTURE_1D_BIT_EXT = 1;
    public static final int GLX_TEXTURE_2D_BIT_EXT = 2;
    public static final int GLX_TEXTURE_RECTANGLE_BIT_EXT = 4;
    public static final int GLX_TEXTURE_1D_EXT = 8411;
    public static final int GLX_TEXTURE_2D_EXT = 8412;
    public static final int GLX_TEXTURE_RECTANGLE_EXT = 8413;
    public static final int GLX_FRONT_LEFT_EXT = 8414;
    public static final int GLX_FRONT_RIGHT_EXT = 8415;
    public static final int GLX_BACK_LEFT_EXT = 8416;
    public static final int GLX_BACK_RIGHT_EXT = 8417;
    public static final int GLX_FRONT_EXT = 8414;
    public static final int GLX_BACK_EXT = 8416;
    public static final int GLX_AUX0_EXT = 8418;
    public static final int GLX_AUX1_EXT = 8419;
    public static final int GLX_AUX2_EXT = 8420;
    public static final int GLX_AUX3_EXT = 8421;
    public static final int GLX_AUX4_EXT = 8422;
    public static final int GLX_AUX5_EXT = 8423;
    public static final int GLX_AUX6_EXT = 8424;
    public static final int GLX_AUX7_EXT = 8425;
    public static final int GLX_AUX8_EXT = 8426;
    public static final int GLX_AUX9_EXT = 8427;

    protected GLXEXTTextureFromPixmap() {
            r3 = this;
            r0 = r3
            r0.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    public static void nglXBindTexImageEXT(long r10, long r12, int r14, long r15) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXBindTexImageEXT
            r17 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r17
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r12
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r10
            r1 = r12
            r2 = r14
            r3 = r15
            r4 = r17
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }

    public static void glXBindTexImageEXT(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXDrawable") long r10, int r12, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") java.nio.IntBuffer r13) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto Lb
            r0 = r13
            org.lwjgl.system.Checks.checkNTSafe(r0)
        Lb:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            long r3 = org.lwjgl.system.MemoryUtil.memAddressSafe(r3)
            nglXBindTexImageEXT(r0, r1, r2, r3)
            return
    }

    public static void glXReleaseTexImageEXT(@org.lwjgl.system.NativeType("Display *") long r8, @org.lwjgl.system.NativeType("GLXDrawable") long r10, int r12) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXReleaseTexImageEXT
            r13 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L1e
            r0 = r13
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r8
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r10
            long r0 = org.lwjgl.system.Checks.check(r0)
        L1e:
            r0 = r8
            r1 = r10
            r2 = r12
            r3 = r13
            org.lwjgl.system.JNI.callPPV(r0, r1, r2, r3)
            return
    }

    public static void glXBindTexImageEXT(@org.lwjgl.system.NativeType("Display *") long r9, @org.lwjgl.system.NativeType("GLXDrawable") long r11, int r13, @javax.annotation.Nullable @org.lwjgl.system.NativeType("int const *") int[] r14) {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.getCapabilitiesGLXClient()
            long r0 = r0.glXBindTexImageEXT
            r15 = r0
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L23
            r0 = r15
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r9
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r11
            long r0 = org.lwjgl.system.Checks.check(r0)
            r0 = r14
            org.lwjgl.system.Checks.checkNTSafe(r0)
        L23:
            r0 = r9
            r1 = r11
            r2 = r13
            r3 = r14
            r4 = r15
            org.lwjgl.system.JNI.callPPPV(r0, r1, r2, r3, r4)
            return
    }
}
