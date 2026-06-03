package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ContextGL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ContextGL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/ContextGL.class */
final class ContextGL implements org.lwjgl.opengl.Context {
    private static final java.lang.ThreadLocal<org.lwjgl.opengl.ContextGL> current_context_local = null;
    private final long handle;
    private final org.lwjgl.opengl.PeerInfo peer_info;
    private final org.lwjgl.opengl.ContextAttribs contextAttribs;
    private final boolean forwardCompatible;
    private boolean destroyed;
    private boolean destroy_requested;
    private java.lang.Thread thread;
    private boolean isCurrent;

    org.lwjgl.opengl.PeerInfo getPeerInfo() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.PeerInfo r0 = r0.peer_info
            return r0
    }

    org.lwjgl.opengl.ContextAttribs getContextAttribs() {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.ContextAttribs r0 = r0.contextAttribs
            return r0
    }

    static org.lwjgl.opengl.ContextGL getCurrentContext() {
            java.lang.ThreadLocal<org.lwjgl.opengl.ContextGL> r0 = org.lwjgl.opengl.ContextGL.current_context_local
            java.lang.Object r0 = r0.get()
            org.lwjgl.opengl.ContextGL r0 = (org.lwjgl.opengl.ContextGL) r0
            return r0
    }

    ContextGL(long r5) {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r4
            r1 = 0
            r0.peer_info = r1
            r0 = r4
            r1 = 0
            r0.contextAttribs = r1
            r0 = r4
            r1 = 0
            r0.forwardCompatible = r1
            r0 = r4
            r1 = r5
            r0.handle = r1
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String r1 = "LWJGLX: ready-handle context created"
            r0.println(r1)
            return
    }

    ContextGL(org.lwjgl.opengl.PeerInfo r5, org.lwjgl.opengl.ContextAttribs r6, org.lwjgl.opengl.ContextGL r7) throws org.lwjgl.LWJGLException {
            r4 = this;
            r0 = r4
            r0.<init>()
            r0 = r7
            if (r0 == 0) goto Lc
            r0 = r7
            goto Ld
        Lc:
            r0 = r4
        Ld:
            r8 = r0
            r0 = r8
            r1 = r0
            r9 = r1
            monitor-enter(r0)
            r0 = r7
            if (r0 == 0) goto L2a
            r0 = r7
            boolean r0 = r0.destroyed     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L2a
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L55
            r1 = r0
            java.lang.String r2 = "Shared context is destroyed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L55
            throw r0     // Catch: java.lang.Throwable -> L55
        L2a:
            r0 = r4
            r1 = r5
            r0.peer_info = r1     // Catch: java.lang.Throwable -> L55
            r0 = r4
            r1 = r6
            r0.contextAttribs = r1     // Catch: java.lang.Throwable -> L55
            r0 = r4
            r1 = 0
            r0.forwardCompatible = r1     // Catch: java.lang.Throwable -> L55
            r0 = 0
            r10 = r0
            r0 = r7
            if (r0 == 0) goto L46
            r0 = r7
            long r0 = r0.handle     // Catch: java.lang.Throwable -> L55
            r10 = r0
        L46:
            r0 = r4
            r1 = r10
            long r1 = org.lwjgl.glfw.GLFW.nglfwCreateContext(r1)     // Catch: java.lang.Throwable -> L55
            r0.handle = r1     // Catch: java.lang.Throwable -> L55
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            goto L5d
        L55:
            r12 = move-exception
            r0 = r9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L55
            r0 = r12
            throw r0
        L5d:
            return
    }

    @Override // org.lwjgl.opengl.Context
    public void releaseCurrent() throws org.lwjgl.LWJGLException {
            r3 = this;
            org.lwjgl.opengl.ContextGL r0 = getCurrentContext()
            r4 = r0
            r0 = r4
            if (r0 == 0) goto L2f
            r0 = 0
            org.lwjgl.glfw.GLFW.glfwMakeContextCurrent(r0)
            r0 = r3
            r1 = 0
            r0.isCurrent = r1
            java.lang.ThreadLocal<org.lwjgl.opengl.ContextGL> r0 = org.lwjgl.opengl.ContextGL.current_context_local
            r1 = 0
            r0.set(r1)
            r0 = r4
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r4
            r1 = 0
            r0.thread = r1     // Catch: java.lang.Throwable -> L2a
            r0 = r4
            r0.checkDestroy()     // Catch: java.lang.Throwable -> L2a
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2f
        L2a:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            r0 = r6
            throw r0
        L2f:
            return
    }

    @Override // org.lwjgl.opengl.Context
    public synchronized void releaseDrawable() throws org.lwjgl.LWJGLException {
            r4 = this;
            r0 = r4
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Context is destroyed"
            r1.<init>(r2)
            throw r0
        L11:
            return
    }

    public synchronized void update() {
            r4 = this;
            r0 = r4
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Context is destroyed"
            r1.<init>(r2)
            throw r0
        L11:
            return
    }

    public static void swapBuffers() throws org.lwjgl.LWJGLException {
            org.lwjgl.opengl.Display.swapBuffers()
            return
    }

    private boolean canAccess() {
            r3 = this;
            r0 = r3
            java.lang.Thread r0 = r0.thread
            if (r0 == 0) goto L11
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r1 = r3
            java.lang.Thread r1 = r1.thread
            if (r0 != r1) goto L15
        L11:
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    private void checkAccess() {
            r5 = this;
            r0 = r5
            boolean r0 = r0.canAccess()
            if (r0 != 0) goto L35
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "From thread "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ": "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.Thread r3 = r3.thread
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " already has the context current"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L35:
            return
    }

    @Override // org.lwjgl.opengl.Context
    public synchronized void makeCurrent() throws org.lwjgl.LWJGLException {
            r4 = this;
            r0 = r4
            r0.checkAccess()
            r0 = r4
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L15
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Context is destroyed"
            r1.<init>(r2)
            throw r0
        L15:
            r0 = r4
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r0.thread = r1
            java.lang.ThreadLocal<org.lwjgl.opengl.ContextGL> r0 = org.lwjgl.opengl.ContextGL.current_context_local
            r1 = r4
            r0.set(r1)
            r0 = r4
            long r0 = r0.handle
            org.lwjgl.glfw.GLFW.glfwMakeContextCurrent(r0)
            org.lwjgl.opengl.GLContext.initCapabilities()
            r0 = r4
            r1 = 1
            r0.isCurrent = r1
            return
    }

    java.nio.ByteBuffer getHandle() {
            r2 = this;
            r0 = 0
            return r0
    }

    @Override // org.lwjgl.opengl.Context
    public synchronized boolean isCurrent() throws org.lwjgl.LWJGLException {
            r4 = this;
            r0 = r4
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L11
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Context is destroyed"
            r1.<init>(r2)
            throw r0
        L11:
            r0 = r4
            boolean r0 = r0.isCurrent
            return r0
    }

    private void checkDestroy() {
            r3 = this;
            r0 = r3
            boolean r0 = r0.destroyed
            if (r0 != 0) goto L39
            r0 = r3
            boolean r0 = r0.destroy_requested
            if (r0 == 0) goto L39
            r0 = r3
            r0.releaseDrawable()     // Catch: org.lwjgl.LWJGLException -> L22
            r0 = r3
            r1 = 1
            r0.destroyed = r1     // Catch: org.lwjgl.LWJGLException -> L22
            r0 = r3
            r1 = 0
            r0.thread = r1     // Catch: org.lwjgl.LWJGLException -> L22
            org.lwjgl.opengl.Display.destroy()     // Catch: org.lwjgl.LWJGLException -> L22
            goto L39
        L22:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Exception occurred while destroying context: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.LWJGLUtil.log(r0)
        L39:
            return
    }

    public static void setSwapInterval(int r2) {
            r0 = r2
            org.lwjgl.glfw.GLFW.glfwSwapInterval(r0)
            return
    }

    public synchronized void forceDestroy() throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            r0.checkAccess()
            r0 = r2
            r0.destroy()
            return
    }

    public synchronized void destroy() throws org.lwjgl.LWJGLException {
            r4 = this;
            r0 = r4
            boolean r0 = r0.destroyed
            if (r0 == 0) goto L8
            return
        L8:
            r0 = r4
            r1 = 1
            r0.destroy_requested = r1
            r0 = r4
            boolean r0 = r0.isCurrent()
            r5 = r0
            r0 = 0
            r6 = r0
            r0 = r5
            if (r0 == 0) goto L2f
            org.lwjgl.opengl.ContextCapabilities r0 = org.lwjgl.opengl.GLContext.getCapabilities()
            if (r0 == 0) goto L2b
            org.lwjgl.opengl.ContextCapabilities r0 = org.lwjgl.opengl.GLContext.getCapabilities()
            boolean r0 = r0.OpenGL11
            if (r0 == 0) goto L2b
            int r0 = org.lwjgl.opengl.GL11.glGetError()
            r6 = r0
        L2b:
            r0 = r4
            r0.releaseCurrent()
        L2f:
            r0 = r4
            r0.checkDestroy()
            r0 = r5
            if (r0 == 0) goto L44
            r0 = r6
            if (r0 == 0) goto L44
            org.lwjgl.opengl.OpenGLException r0 = new org.lwjgl.opengl.OpenGLException
            r1 = r0
            r2 = r6
            r1.<init>(r2)
            throw r0
        L44:
            return
    }

    public synchronized void setCLSharingProperties(org.lwjgl.PointerBuffer r3) throws org.lwjgl.LWJGLException {
            r2 = this;
            r0 = r2
            org.lwjgl.opengl.PeerInfo r0 = r0.peer_info
            java.nio.ByteBuffer r0 = r0.lockAndGetHandle()
            r4 = r0
            return
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.ContextGL.current_context_local = r0
            org.lwjgl.Sys.initialize()
            return
    }
}
