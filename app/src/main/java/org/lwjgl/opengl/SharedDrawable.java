package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/SharedDrawable.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/SharedDrawable.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/SharedDrawable.class */
public final class SharedDrawable extends org.lwjgl.opengl.DrawableGL {
    public SharedDrawable(org.lwjgl.opengl.Drawable r4) throws org.lwjgl.LWJGLException {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r4
            if (r0 == 0) goto L1b
            r0 = r3
            r1 = r4
            org.lwjgl.opengl.DrawableLWJGL r1 = (org.lwjgl.opengl.DrawableLWJGL) r1
            org.lwjgl.opengl.Context r1 = r1.createSharedContext()
            org.lwjgl.opengl.ContextGL r1 = (org.lwjgl.opengl.ContextGL) r1
            r0.context = r1
            goto L2d
        L1b:
            r0 = r3
            org.lwjgl.opengl.Drawable r1 = org.lwjgl.opengl.Display.getDrawable()
            org.lwjgl.opengl.DrawableLWJGL r1 = (org.lwjgl.opengl.DrawableLWJGL) r1
            org.lwjgl.opengl.Context r1 = r1.createSharedContext()
            org.lwjgl.opengl.ContextGL r1 = (org.lwjgl.opengl.ContextGL) r1
            r0.context = r1
        L2d:
            return
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public org.lwjgl.opengl.ContextGL createSharedContext() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.context
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.Drawable
    public void makeCurrent() throws org.lwjgl.LWJGLException {
            r1 = this;
            return
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

    @Override // org.lwjgl.opengl.DrawableGL, org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ org.lwjgl.opengl.Context createSharedContext() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.createSharedContext()
            return r0
    }
}
