package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/RenderTexture.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/RenderTexture.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/RenderTexture.class */
public final class RenderTexture {
    private static final int WGL_BIND_TO_TEXTURE_RGB_ARB = 8304;
    private static final int WGL_BIND_TO_TEXTURE_RGBA_ARB = 8305;
    private static final int WGL_TEXTURE_FORMAT_ARB = 8306;
    private static final int WGL_TEXTURE_TARGET_ARB = 8307;
    private static final int WGL_MIPMAP_TEXTURE_ARB = 8308;
    private static final int WGL_TEXTURE_RGB_ARB = 8309;
    private static final int WGL_TEXTURE_RGBA_ARB = 8310;
    private static final int WGL_TEXTURE_CUBE_MAP_ARB = 8312;
    private static final int WGL_TEXTURE_1D_ARB = 8313;
    private static final int WGL_TEXTURE_2D_ARB = 8314;
    private static final int WGL_NO_TEXTURE_ARB = 8311;
    static final int WGL_MIPMAP_LEVEL_ARB = 8315;
    static final int WGL_CUBE_MAP_FACE_ARB = 8316;
    static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_X_ARB = 8317;
    static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_X_ARB = 8318;
    static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_Y_ARB = 8319;
    static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_Y_ARB = 8320;
    static final int WGL_TEXTURE_CUBE_MAP_POSITIVE_Z_ARB = 8321;
    static final int WGL_TEXTURE_CUBE_MAP_NEGATIVE_Z_ARB = 8322;
    static final int WGL_FRONT_LEFT_ARB = 8323;
    static final int WGL_FRONT_RIGHT_ARB = 8324;
    static final int WGL_BACK_LEFT_ARB = 8325;
    static final int WGL_BACK_RIGHT_ARB = 8326;
    private static final int WGL_BIND_TO_TEXTURE_RECTANGLE_RGB_NV = 8352;
    private static final int WGL_BIND_TO_TEXTURE_RECTANGLE_RGBA_NV = 8353;
    private static final int WGL_TEXTURE_RECTANGLE_NV = 8354;
    private static final int WGL_BIND_TO_TEXTURE_DEPTH_NV = 8355;
    private static final int WGL_BIND_TO_TEXTURE_RECTANGLE_DEPTH_NV = 8356;
    private static final int WGL_DEPTH_TEXTURE_FORMAT_NV = 8357;
    private static final int WGL_TEXTURE_DEPTH_COMPONENT_NV = 8358;
    static final int WGL_DEPTH_COMPONENT_NV = 8359;
    public static final int RENDER_TEXTURE_1D = 8313;
    public static final int RENDER_TEXTURE_2D = 8314;
    public static final int RENDER_TEXTURE_RECTANGLE = 8354;
    public static final int RENDER_TEXTURE_CUBE_MAP = 8312;
    java.nio.IntBuffer pixelFormatCaps;
    java.nio.IntBuffer pBufferAttribs;

    public RenderTexture(boolean r5, boolean r6, boolean r7, boolean r8, int r9, int r10) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r5
            if (r0 == 0) goto L16
            r0 = r6
            if (r0 == 0) goto L16
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "A RenderTexture can't be both RGB and RGBA."
            r1.<init>(r2)
            throw r0
        L16:
            r0 = r10
            if (r0 >= 0) goto L25
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The mipmap levels can't be negative."
            r1.<init>(r2)
            throw r0
        L25:
            r0 = r8
            if (r0 == 0) goto L3c
            r0 = r9
            r1 = 8354(0x20a2, float:1.1706E-41)
            if (r0 == r1) goto L3c
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "When the RenderTexture is rectangle the target must be RENDER_TEXTURE_RECTANGLE."
            r1.<init>(r2)
            throw r0
        L3c:
            r0 = r4
            r1 = 4
            java.nio.IntBuffer r1 = org.lwjgl.BufferUtils.createIntBuffer(r1)
            r0.pixelFormatCaps = r1
            r0 = r4
            r1 = 8
            java.nio.IntBuffer r1 = org.lwjgl.BufferUtils.createIntBuffer(r1)
            r0.pBufferAttribs = r1
            r0 = r5
            if (r0 == 0) goto L89
            r0 = r4
            java.nio.IntBuffer r0 = r0.pixelFormatCaps
            r1 = r8
            if (r1 == 0) goto L60
            r1 = 8352(0x20a0, float:1.1704E-41)
            goto L63
        L60:
            r1 = 8304(0x2070, float:1.1636E-41)
        L63:
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pixelFormatCaps
            r1 = 1
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8306(0x2072, float:1.1639E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8309(0x2075, float:1.1643E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
            goto Lc2
        L89:
            r0 = r6
            if (r0 == 0) goto Lc2
            r0 = r4
            java.nio.IntBuffer r0 = r0.pixelFormatCaps
            r1 = r8
            if (r1 == 0) goto L9c
            r1 = 8353(0x20a1, float:1.1705E-41)
            goto L9f
        L9c:
            r1 = 8305(0x2071, float:1.1638E-41)
        L9f:
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pixelFormatCaps
            r1 = 1
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8306(0x2072, float:1.1639E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8310(0x2076, float:1.1645E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
        Lc2:
            r0 = r7
            if (r0 == 0) goto Lfb
            r0 = r4
            java.nio.IntBuffer r0 = r0.pixelFormatCaps
            r1 = r8
            if (r1 == 0) goto Ld5
            r1 = 8356(0x20a4, float:1.1709E-41)
            goto Ld8
        Ld5:
            r1 = 8355(0x20a3, float:1.1708E-41)
        Ld8:
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pixelFormatCaps
            r1 = 1
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8357(0x20a5, float:1.171E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8358(0x20a6, float:1.1712E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
        Lfb:
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8307(0x2073, float:1.164E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = r9
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r10
            if (r0 == 0) goto L12a
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = 8308(0x2074, float:1.1642E-41)
            java.nio.IntBuffer r0 = r0.put(r1)
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            r1 = r10
            java.nio.IntBuffer r0 = r0.put(r1)
        L12a:
            r0 = r4
            java.nio.IntBuffer r0 = r0.pixelFormatCaps
            java.nio.Buffer r0 = r0.flip()
            r0 = r4
            java.nio.IntBuffer r0 = r0.pBufferAttribs
            java.nio.Buffer r0 = r0.flip()
            return
    }
}
