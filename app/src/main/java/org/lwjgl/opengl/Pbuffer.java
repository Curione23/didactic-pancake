package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Pbuffer.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Pbuffer.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/Pbuffer.class */
public final class Pbuffer extends org.lwjgl.opengl.DrawableGL {
    public static final int PBUFFER_SUPPORTED = 0;
    public static final int RENDER_TEXTURE_SUPPORTED = 2;
    public static final int RENDER_TEXTURE_RECTANGLE_SUPPORTED = 4;
    public static final int RENDER_DEPTH_TEXTURE_SUPPORTED = 8;
    public static final int MIPMAP_LEVEL = 8315;
    public static final int CUBE_MAP_FACE = 8316;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_X = 8317;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_X = 8318;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_Y = 8319;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y = 8320;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_Z = 8321;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z = 8322;
    public static final int FRONT_LEFT_BUFFER = 8323;
    public static final int FRONT_RIGHT_BUFFER = 8324;
    public static final int BACK_LEFT_BUFFER = 8325;
    public static final int BACK_RIGHT_BUFFER = 8326;
    public static final int DEPTH_BUFFER = 8359;
    private final int width;
    private final int height;

    public Pbuffer(int r8, int r9, org.lwjgl.opengl.PixelFormat r10, org.lwjgl.opengl.Drawable r11) throws org.lwjgl.LWJGLException {
            r7 = this;
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = 0
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public Pbuffer(int r9, int r10, org.lwjgl.opengl.PixelFormat r11, org.lwjgl.opengl.RenderTexture r12, org.lwjgl.opengl.Drawable r13) throws org.lwjgl.LWJGLException {
            r8 = this;
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public Pbuffer(int r8, int r9, org.lwjgl.opengl.PixelFormat r10, org.lwjgl.opengl.RenderTexture r11, org.lwjgl.opengl.Drawable r12, org.lwjgl.opengl.ContextAttribs r13) throws org.lwjgl.LWJGLException {
            r7 = this;
            r0 = r7
            r0.<init>()
            r0 = r10
            if (r0 != 0) goto L12
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r1 = r0
            java.lang.String r2 = "Pixel format must be non-null"
            r1.<init>(r2)
            throw r0
        L12:
            r0 = r7
            r1 = r8
            r0.width = r1
            r0 = r7
            r1 = r9
            r0.height = r1
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r13
            r5 = r11
            org.lwjgl.opengl.PeerInfo r1 = createPbuffer(r1, r2, r3, r4, r5)
            r0.peer_info = r1
            r0 = 0
            r14 = r0
            r0 = r12
            if (r0 != 0) goto L37
            org.lwjgl.opengl.Drawable r0 = org.lwjgl.opengl.Display.getDrawable()
            r12 = r0
        L37:
            r0 = r12
            if (r0 == 0) goto L48
            r0 = r12
            org.lwjgl.opengl.DrawableLWJGL r0 = (org.lwjgl.opengl.DrawableLWJGL) r0
            org.lwjgl.opengl.Context r0 = r0.getContext()
            r14 = r0
        L48:
            return
    }

    private static org.lwjgl.opengl.PeerInfo createPbuffer(int r8, int r9, org.lwjgl.opengl.PixelFormat r10, org.lwjgl.opengl.ContextAttribs r11, org.lwjgl.opengl.RenderTexture r12) throws org.lwjgl.LWJGLException {
            r0 = r12
            if (r0 != 0) goto L1b
            r0 = 1
            java.nio.IntBuffer r0 = org.lwjgl.BufferUtils.createIntBuffer(r0)
            r13 = r0
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.getImplementation()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = 0
            r6 = r13
            org.lwjgl.opengl.PeerInfo r0 = r0.createPbuffer(r1, r2, r3, r4, r5, r6)
            return r0
        L1b:
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.getImplementation()
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            java.nio.IntBuffer r5 = r5.pixelFormatCaps
            r6 = r12
            java.nio.IntBuffer r6 = r6.pBufferAttribs
            org.lwjgl.opengl.PeerInfo r0 = r0.createPbuffer(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public synchronized boolean isBufferLost() {
            r3 = this;
            r0 = r3
            r0.checkDestroyed()
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.getImplementation()
            r1 = r3
            org.lwjgl.opengl.PeerInfo r1 = r1.peer_info
            boolean r0 = r0.isBufferLost(r1)
            return r0
    }

    public static int getCapabilities() {
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.getImplementation()
            int r0 = r0.getPbufferCapabilities()
            return r0
    }

    public synchronized void setAttrib(int r6, int r7) {
            r5 = this;
            r0 = r5
            r0.checkDestroyed()
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.getImplementation()
            r1 = r5
            org.lwjgl.opengl.PeerInfo r1 = r1.peer_info
            r2 = r6
            r3 = r7
            r0.setPbufferAttrib(r1, r2, r3)
            return
    }

    public synchronized void bindTexImage(int r5) {
            r4 = this;
            r0 = r4
            r0.checkDestroyed()
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.getImplementation()
            r1 = r4
            org.lwjgl.opengl.PeerInfo r1 = r1.peer_info
            r2 = r5
            r0.bindTexImageToPbuffer(r1, r2)
            return
    }

    public synchronized void releaseTexImage(int r5) {
            r4 = this;
            r0 = r4
            r0.checkDestroyed()
            org.lwjgl.opengl.DisplayImplementation r0 = org.lwjgl.opengl.Display.getImplementation()
            r1 = r4
            org.lwjgl.opengl.PeerInfo r1 = r1.peer_info
            r2 = r5
            r0.releaseTexImageFromPbuffer(r1, r2)
            return
    }

    public synchronized int getHeight() {
            r2 = this;
            r0 = r2
            r0.checkDestroyed()
            r0 = r2
            int r0 = r0.height
            return r0
    }

    public synchronized int getWidth() {
            r2 = this;
            r0 = r2
            r0.checkDestroyed()
            r0 = r2
            int r0 = r0.width
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.Drawable
    public /* bridge */ /* synthetic */ void setCLSharingProperties(org.lwjgl.PointerBuffer r4) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setCLSharingProperties(r1)
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.Drawable
    public /* bridge */ /* synthetic */ void destroy() {
            r2 = this;
            r0 = r2
            super.destroy()
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.Drawable
    public /* bridge */ /* synthetic */ void releaseContext() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            super.releaseContext()
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.Drawable
    public /* bridge */ /* synthetic */ void makeCurrent() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            super.makeCurrent()
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.Drawable
    public /* bridge */ /* synthetic */ boolean isCurrent() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            boolean r0 = super.isCurrent()
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ void initContext(float r6, float r7, float r8) {
            r5 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = r8
            super.initContext(r1, r2, r3)
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ void swapBuffers() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            super.swapBuffers()
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ void setSwapInterval(int r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setSwapInterval(r1)
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ void checkGLError() {
            r2 = this;
            r0 = r2
            super.checkGLError()
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ org.lwjgl.opengl.ContextGL createSharedContext() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = super.createSharedContext()
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ org.lwjgl.opengl.ContextGL getContext() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = super.getContext()
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ org.lwjgl.opengl.PixelFormatLWJGL getPixelFormat() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.PixelFormatLWJGL r0 = super.getPixelFormat()
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r5, org.lwjgl.opengl.ContextAttribs r6) throws org.lwjgl.LWJGLException {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.setPixelFormat(r1, r2)
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r4) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setPixelFormat(r1)
            return
    }

    static {
            org.lwjgl.Sys.initialize()
            return
    }
}
