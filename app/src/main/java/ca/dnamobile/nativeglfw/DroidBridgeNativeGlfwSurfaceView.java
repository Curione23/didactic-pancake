package ca.dnamobile.nativeglfw;

/* JADX INFO: loaded from: classes.dex */
public final class DroidBridgeNativeGlfwSurfaceView extends android.view.SurfaceView implements android.view.SurfaceHolder.Callback {
    private boolean desktopGl;
    private java.lang.String eglLibrary;
    private java.lang.String mesaDriver;
    private final ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw nativeGlfw;

    public DroidBridgeNativeGlfwSurfaceView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = new ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw
            r1.<init>()
            r0.nativeGlfw = r1
            r1 = 0
            r0.desktopGl = r1
            java.lang.String r1 = ""
            r0.eglLibrary = r1
            r0.mesaDriver = r1
            r0.init()
            return
    }

    public DroidBridgeNativeGlfwSurfaceView(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = new ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw
            r1.<init>()
            r0.nativeGlfw = r1
            r1 = 0
            r0.desktopGl = r1
            java.lang.String r1 = ""
            r0.eglLibrary = r1
            r0.mesaDriver = r1
            r0.init()
            return
    }

    private void init() {
            r1 = this;
            android.view.SurfaceHolder r0 = r1.getHolder()
            r0.addCallback(r1)
            return
    }

    public void configureRenderer(java.lang.String r8, java.lang.String r9, boolean r10) {
            r7 = this;
            java.lang.String r0 = ""
            if (r8 != 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r8
        L7:
            r7.eglLibrary = r2
            if (r9 != 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r9
        Le:
            r7.mesaDriver = r3
            r7.desktopGl = r10
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = r7.nativeGlfw
            r5 = 0
            r6 = 0
            r4 = r10
            r1.configureRenderer(r2, r3, r4, r5, r6)
            return
    }

    public ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw getNativeGlfw() {
            r1 = this;
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r0 = r1.nativeGlfw
            return r0
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r0 = r1.nativeGlfw
            r0.close()
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r2, int r3, int r4, int r5) {
            r1 = this;
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r2 = r1.nativeGlfw
            r2.surfaceChanged(r4, r5)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r2 = r1.nativeGlfw
            r3 = 1039516303(0x3df5c28f, float:0.12)
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = 1032805417(0x3d8f5c29, float:0.07)
            r0 = 1035489772(0x3db851ec, float:0.09)
            r2.clearTest(r5, r0, r3, r4)
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r7) {
            r6 = this;
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r0 = r6.nativeGlfw
            java.lang.String r1 = r6.eglLibrary
            java.lang.String r2 = r6.mesaDriver
            boolean r3 = r6.desktopGl
            r4 = 0
            r5 = 0
            r0.configureRenderer(r1, r2, r3, r4, r5)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r0 = r6.nativeGlfw
            android.view.Surface r7 = r7.getSurface()
            int r1 = r6.getWidth()
            r2 = 1
            int r1 = java.lang.Math.max(r1, r2)
            int r3 = r6.getHeight()
            int r2 = java.lang.Math.max(r3, r2)
            r0.surfaceCreated(r7, r1, r2)
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r7 = r6.nativeGlfw
            r0 = 1039516303(0x3df5c28f, float:0.12)
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 1032805417(0x3d8f5c29, float:0.07)
            r3 = 1035489772(0x3db851ec, float:0.09)
            r7.clearTest(r2, r3, r0, r1)
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r1) {
            r0 = this;
            ca.dnamobile.nativeglfw.DroidBridgeNativeGlfw r1 = r0.nativeGlfw
            r1.surfaceDestroyed()
            return
    }
}
