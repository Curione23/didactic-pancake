package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AWTGLCanvas.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AWTGLCanvas.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/AWTGLCanvas.class */
public class AWTGLCanvas extends java.awt.Canvas implements org.lwjgl.opengl.Drawable, java.awt.event.ComponentListener, java.awt.event.HierarchyListener {
    private static final long serialVersionUID = 1;
    private org.lwjgl.opengl.ContextGL mContextGL;
    private org.lwjgl.opengl.PixelFormatLWJGL mPixelFormat;
    private org.lwjgl.opengl.ContextAttribs mCtxAttrs;

    public void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r4) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.mPixelFormat = r1
            return
    }

    public void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r4, org.lwjgl.opengl.ContextAttribs r5) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.mPixelFormat = r1
            r0 = r3
            r1 = r5
            r0.mCtxAttrs = r1
            return
    }

    public org.lwjgl.opengl.PixelFormatLWJGL getPixelFormat() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.PixelFormatLWJGL r0 = r0.mPixelFormat
            return r0
    }

    public org.lwjgl.opengl.ContextGL getContext() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            return r0
    }

    public org.lwjgl.opengl.ContextGL createSharedContext() throws org.lwjgl.LWJGLException {
            r7 = this;
            r0 = r7
            org.lwjgl.opengl.ContextGL r1 = new org.lwjgl.opengl.ContextGL
            r2 = r1
            r3 = r7
            org.lwjgl.opengl.ContextGL r3 = r3.getContext()
            org.lwjgl.opengl.PeerInfo r3 = r3.getPeerInfo()
            r4 = r7
            org.lwjgl.opengl.ContextAttribs r4 = r4.mCtxAttrs
            r5 = 0
            r2.<init>(r3, r4, r5)
            r0.mContextGL = r1
            r0 = r7
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            return r0
    }

    public void checkGLError() {
            r1 = this;
            return
    }

    public void initContext(float r5, float r6, float r7) {
            r4 = this;
            r0 = r5
            r1 = r6
            r2 = r7
            org.lwjgl.opengl.Display.setInitialBackground(r0, r1, r2)
            return
    }

    public AWTGLCanvas() throws org.lwjgl.LWJGLException {
            r4 = this;
            r0 = r4
            r0.<init>()
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "AWTGLCanvas constructor called on thread:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            return
    }

    public AWTGLCanvas(org.lwjgl.opengl.PixelFormat r3) throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            r0.<init>()
            r0 = r3
            org.lwjgl.opengl.Display.create(r0)
            return
    }

    public AWTGLCanvas(java.awt.GraphicsDevice r4, org.lwjgl.opengl.PixelFormat r5) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            return
    }

    public AWTGLCanvas(java.awt.GraphicsDevice r4, org.lwjgl.opengl.PixelFormat r5, org.lwjgl.opengl.Drawable r6) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            return
    }

    public AWTGLCanvas(java.awt.GraphicsDevice r4, org.lwjgl.opengl.PixelFormat r5, org.lwjgl.opengl.Drawable r6, org.lwjgl.opengl.ContextAttribs r7) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r1 = r5
            r0.<init>(r1)
            return
    }

    public void addNotify() {
            r1 = this;
            return
    }

    public void removeNotify() {
            r1 = this;
            return
    }

    public void setSwapInterval(int r3) {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            r0 = r3
            org.lwjgl.opengl.ContextGL.setSwapInterval(r0)
            return
    }

    public void setVSyncEnabled(boolean r3) {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            r0 = r3
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            org.lwjgl.opengl.ContextGL.setSwapInterval(r0)
            return
    }

    public void swapBuffers() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            org.lwjgl.opengl.ContextGL.swapBuffers()
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public boolean isCurrent() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            boolean r0 = r0.isCurrent()
            return r0
    }

    @Override // org.lwjgl.opengl.Drawable
    public void makeCurrent() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            r0.makeCurrent()
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public void releaseContext() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            r0.releaseCurrent()
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public final void destroy() {
            r4 = this;
            r0 = r4
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL     // Catch: org.lwjgl.LWJGLException -> La
            r0.destroy()     // Catch: org.lwjgl.LWJGLException -> La
            goto L14
        La:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            r2 = r5
            r1.<init>(r2)
            throw r0
        L14:
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public final void setCLSharingProperties(org.lwjgl.PointerBuffer r4) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.mContextGL
            r1 = r4
            r0.setCLSharingProperties(r1)
            return
    }

    protected void initGL() {
            r1 = this;
            return
    }

    protected void paintGL() {
            r1 = this;
            return
    }

    public final void paint(java.awt.Graphics r2) {
            r1 = this;
            return
    }

    protected void exceptionOccurred(org.lwjgl.LWJGLException r2) {
            r1 = this;
            return
    }

    public void update(java.awt.Graphics r2) {
            r1 = this;
            return
    }

    public void componentShown(java.awt.event.ComponentEvent r2) {
            r1 = this;
            return
    }

    public void componentHidden(java.awt.event.ComponentEvent r2) {
            r1 = this;
            return
    }

    public void componentResized(java.awt.event.ComponentEvent r2) {
            r1 = this;
            return
    }

    public void componentMoved(java.awt.event.ComponentEvent r2) {
            r1 = this;
            return
    }

    public void setLocation(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.setLocation(r1, r2)
            return
    }

    public void setLocation(java.awt.Point r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setLocation(r1)
            return
    }

    public void setSize(java.awt.Dimension r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            super.setSize(r1)
            return
    }

    public void setSize(int r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            super.setSize(r1, r2)
            return
    }

    public void setBounds(int r7, int r8, int r9, int r10) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            super.setBounds(r1, r2, r3, r4)
            return
    }

    public void hierarchyChanged(java.awt.event.HierarchyEvent r2) {
            r1 = this;
            return
    }
}
