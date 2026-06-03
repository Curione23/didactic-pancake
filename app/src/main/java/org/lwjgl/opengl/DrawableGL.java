package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DrawableGL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DrawableGL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/DrawableGL.class */
abstract class DrawableGL implements org.lwjgl.opengl.DrawableLWJGL {
    protected org.lwjgl.opengl.PixelFormat pixel_format;
    protected org.lwjgl.opengl.PeerInfo peer_info;
    protected org.lwjgl.opengl.ContextGL context;

    protected DrawableGL() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r4) throws org.lwjgl.LWJGLException {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r1 = r0
            r1.<init>()
            throw r0
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public void setPixelFormat(org.lwjgl.opengl.PixelFormatLWJGL r6, org.lwjgl.opengl.ContextAttribs r7) throws org.lwjgl.LWJGLException {
            r5 = this;
            r0 = r5
            r1 = r6
            org.lwjgl.opengl.PixelFormat r1 = (org.lwjgl.opengl.PixelFormat) r1
            r0.pixel_format = r1
            r0 = r5
            org.lwjgl.opengl.DisplayImplementation r1 = org.lwjgl.opengl.Display.getImplementation()
            r2 = r5
            org.lwjgl.opengl.PixelFormat r2 = r2.pixel_format
            r3 = r7
            org.lwjgl.opengl.PeerInfo r1 = r1.createPeerInfo(r2, r3)
            r0.peer_info = r1
            return
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public org.lwjgl.opengl.PixelFormatLWJGL getPixelFormat() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.PixelFormat r0 = r0.pixel_format
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public org.lwjgl.opengl.ContextGL getContext() {
            r3 = this;
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: java.lang.Throwable -> Ld
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            r0 = r5
            throw r0
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public org.lwjgl.opengl.ContextGL createSharedContext() throws org.lwjgl.LWJGLException {
            r6 = this;
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r7 = r1
            monitor-enter(r0)
            r0 = r6
            r0.checkDestroyed()     // Catch: java.lang.Throwable -> L23
            org.lwjgl.opengl.ContextGL r0 = new org.lwjgl.opengl.ContextGL     // Catch: java.lang.Throwable -> L23
            r1 = r0
            r2 = r6
            org.lwjgl.opengl.PeerInfo r2 = r2.peer_info     // Catch: java.lang.Throwable -> L23
            r3 = r6
            org.lwjgl.opengl.ContextGL r3 = r3.context     // Catch: java.lang.Throwable -> L23
            org.lwjgl.opengl.ContextAttribs r3 = r3.getContextAttribs()     // Catch: java.lang.Throwable -> L23
            r4 = r6
            org.lwjgl.opengl.ContextGL r4 = r4.context     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Throwable -> L23
            r1 = r7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            r8 = move-exception
            r0 = r7
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            r0 = r8
            throw r0
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public void checkGLError() {
            r1 = this;
            org.lwjgl.opengl.Util.checkGLError()
            return
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public void setSwapInterval(int r3) {
            r2 = this;
            r0 = r3
            org.lwjgl.opengl.ContextGL.setSwapInterval(r0)
            return
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public void swapBuffers() throws org.lwjgl.LWJGLException {
            r1 = this;
            org.lwjgl.opengl.ContextGL.swapBuffers()
            return
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public void initContext(float r6, float r7, float r8) {
            r5 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            org.lwjgl.opengl.GL11.glClearColor(r0, r1, r2, r3)
            r0 = 16384(0x4000, float:2.2959E-41)
            org.lwjgl.opengl.GL11.glClear(r0)
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public boolean isCurrent() throws org.lwjgl.LWJGLException {
            r3 = this;
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r0.checkDestroyed()     // Catch: java.lang.Throwable -> L14
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: java.lang.Throwable -> L14
            boolean r0 = r0.isCurrent()     // Catch: java.lang.Throwable -> L14
            r1 = r4
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            return r0
        L14:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            r0 = r5
            throw r0
    }

    @Override // org.lwjgl.opengl.Drawable
    public void makeCurrent() throws org.lwjgl.LWJGLException {
            r3 = this;
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r0.checkDestroyed()     // Catch: java.lang.Throwable -> L16
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: java.lang.Throwable -> L16
            r0.makeCurrent()     // Catch: java.lang.Throwable -> L16
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            goto L1b
        L16:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            r0 = r5
            throw r0
        L1b:
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public void releaseContext() throws org.lwjgl.LWJGLException {
            r3 = this;
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            r0.checkDestroyed()     // Catch: java.lang.Throwable -> L20
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: java.lang.Throwable -> L20
            boolean r0 = r0.isCurrent()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L1b
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: java.lang.Throwable -> L20
            r0.releaseCurrent()     // Catch: java.lang.Throwable -> L20
        L1b:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            goto L25
        L20:
            r5 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L20
            r0 = r5
            throw r0
        L25:
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public void destroy() {
            r3 = this;
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r4 = r1
            monitor-enter(r0)
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: java.lang.Throwable -> L52
            if (r0 != 0) goto L10
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            return
        L10:
            r0 = r3
            r0.releaseContext()     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
            r0.forceDestroy()     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
            r0 = r3
            r1 = 0
            r0.context = r1     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
            r0 = r3
            org.lwjgl.opengl.PeerInfo r0 = r0.peer_info     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
            if (r0 == 0) goto L33
            r0 = r3
            org.lwjgl.opengl.PeerInfo r0 = r0.peer_info     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
            r0.destroy()     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
            r0 = r3
            r1 = 0
            r0.peer_info = r1     // Catch: org.lwjgl.LWJGLException -> L36 java.lang.Throwable -> L52
        L33:
            goto L4d
        L36:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "Exception occurred while destroying Drawable: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L52
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            org.lwjgl.LWJGLUtil.log(r0)     // Catch: java.lang.Throwable -> L52
        L4d:
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            goto L57
        L52:
            r6 = move-exception
            r0 = r4
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            r0 = r6
            throw r0
        L57:
            return
    }

    @Override // org.lwjgl.opengl.Drawable
    public void setCLSharingProperties(org.lwjgl.PointerBuffer r4) throws org.lwjgl.LWJGLException {
            r3 = this;
            java.lang.Object r0 = org.lwjgl.opengl.GlobalLock.lock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r3
            r0.checkDestroyed()     // Catch: java.lang.Throwable -> L17
            r0 = r3
            org.lwjgl.opengl.ContextGL r0 = r0.context     // Catch: java.lang.Throwable -> L17
            r1 = r4
            r0.setCLSharingProperties(r1)     // Catch: java.lang.Throwable -> L17
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            goto L1c
        L17:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            r0 = r6
            throw r0
        L1c:
            return
    }

    protected final void checkDestroyed() {
            r4 = this;
            r0 = r4
            org.lwjgl.opengl.ContextGL r0 = r0.context
            if (r0 != 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "The Drawable has no context available."
            r1.<init>(r2)
            throw r0
        L11:
            return
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ org.lwjgl.opengl.Context createSharedContext() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.createSharedContext()
            return r0
    }

    @Override // org.lwjgl.opengl.DrawableLWJGL
    public /* bridge */ /* synthetic */ org.lwjgl.opengl.Context getContext() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextGL r0 = r0.getContext()
            return r0
    }
}
