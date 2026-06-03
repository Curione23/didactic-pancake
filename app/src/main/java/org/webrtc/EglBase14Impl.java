package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase14Impl.class */
class EglBase14Impl implements org.webrtc.EglBase14 {
    private static final java.lang.String TAG = "EglBase14Impl";
    private static final org.webrtc.EglBase14Impl.EglConnection EGL_NO_CONNECTION = null;
    private android.opengl.EGLSurface eglSurface;
    private org.webrtc.EglBase14Impl.EglConnection eglConnection;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase14Impl$Context.class */
    public static class Context implements org.webrtc.EglBase14.Context {
        private final android.opengl.EGLContext egl14Context;

        @Override // org.webrtc.EglBase14.Context
        public android.opengl.EGLContext getRawContext() {
                r2 = this;
                r0 = r2
                android.opengl.EGLContext r0 = r0.egl14Context
                return r0
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
                r3 = this;
                r0 = r3
                android.opengl.EGLContext r0 = r0.egl14Context
                long r0 = r0.getNativeHandle()
                return r0
        }

        public Context(android.opengl.EGLContext r4) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.egl14Context = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase14Impl$EglConnection.class */
    public static class EglConnection implements org.webrtc.EglBase14.EglConnection {
        private final android.opengl.EGLContext eglContext;
        private final android.opengl.EGLDisplay eglDisplay;
        private final android.opengl.EGLConfig eglConfig;
        private final org.webrtc.RefCountDelegate refCountDelegate;
        private android.opengl.EGLSurface currentSurface;

        public EglConnection(android.opengl.EGLContext r7, int[] r8) {
                r6 = this;
                r0 = r6
                r0.<init>()
                r0 = r6
                android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
                r0.currentSurface = r1
                r0 = r6
                android.opengl.EGLDisplay r1 = org.webrtc.EglBase14Impl.getEglDisplay()
                r0.eglDisplay = r1
                r0 = r6
                r1 = r6
                android.opengl.EGLDisplay r1 = r1.eglDisplay
                r2 = r8
                android.opengl.EGLConfig r1 = org.webrtc.EglBase14Impl.getEglConfig(r1, r2)
                r0.eglConfig = r1
                r0 = r8
                int r0 = org.webrtc.EglBase.getOpenGlesVersionFromConfig(r0)
                r9 = r0
                java.lang.String r0 = "EglBase14Impl"
                r1 = r9
                java.lang.String r1 = "Using OpenGL ES version " + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r6
                r1 = r7
                r2 = r6
                android.opengl.EGLDisplay r2 = r2.eglDisplay
                r3 = r6
                android.opengl.EGLConfig r3 = r3.eglConfig
                r4 = r9
                android.opengl.EGLContext r1 = org.webrtc.EglBase14Impl.createEglContext(r1, r2, r3, r4)
                r0.eglContext = r1
                r0 = r6
                org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
                r2 = r1
                r3 = r6
                void r3 = () -> { // java.lang.Runnable.run():void
                    r3.lambda$new$0();
                }
                r2.<init>(r3)
                r0.refCountDelegate = r1
                return
        }

        private EglConnection() {
                r5 = this;
                r0 = r5
                r0.<init>()
                r0 = r5
                android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
                r0.currentSurface = r1
                r0 = r5
                android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
                r0.eglContext = r1
                r0 = r5
                android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
                r0.eglDisplay = r1
                r0 = r5
                r1 = 0
                r0.eglConfig = r1
                r0 = r5
                org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
                r2 = r1
                void r3 = () -> { // java.lang.Runnable.run():void
                    lambda$new$1();
                }
                r2.<init>(r3)
                r0.refCountDelegate = r1
                return
        }

        @Override // org.webrtc.RefCounted
        public void retain() {
                r2 = this;
                r0 = r2
                org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
                r0.retain()
                return
        }

        @Override // org.webrtc.RefCounted
        public void release() {
                r2 = this;
                r0 = r2
                org.webrtc.RefCountDelegate r0 = r0.refCountDelegate
                r0.release()
                return
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public android.opengl.EGLContext getContext() {
                r2 = this;
                r0 = r2
                android.opengl.EGLContext r0 = r0.eglContext
                return r0
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public android.opengl.EGLDisplay getDisplay() {
                r2 = this;
                r0 = r2
                android.opengl.EGLDisplay r0 = r0.eglDisplay
                return r0
        }

        @Override // org.webrtc.EglBase14.EglConnection
        public android.opengl.EGLConfig getConfig() {
                r2 = this;
                r0 = r2
                android.opengl.EGLConfig r0 = r0.eglConfig
                return r0
        }

        public void makeCurrent(android.opengl.EGLSurface r6) {
                r5 = this;
                android.opengl.EGLContext r0 = android.opengl.EGL14.eglGetCurrentContext()
                r1 = r5
                android.opengl.EGLContext r1 = r1.eglContext
                if (r0 != r1) goto L13
                r0 = r5
                android.opengl.EGLSurface r0 = r0.currentSurface
                r1 = r6
                if (r0 != r1) goto L13
                return
            L13:
                java.lang.Object r0 = org.webrtc.EglBase.lock
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r5
                android.opengl.EGLDisplay r0 = r0.eglDisplay     // Catch: java.lang.Throwable -> L44
                r1 = r6
                r2 = r6
                r3 = r5
                android.opengl.EGLContext r3 = r3.eglContext     // Catch: java.lang.Throwable -> L44
                boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L44
                if (r0 != 0) goto L3f
                android.opengl.GLException r0 = new android.opengl.GLException     // Catch: java.lang.Throwable -> L44
                r1 = r0
                int r2 = android.opengl.EGL14.eglGetError()     // Catch: java.lang.Throwable -> L44
                int r3 = android.opengl.EGL14.eglGetError()     // Catch: java.lang.Throwable -> L44
                java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L44
                java.lang.String r3 = "eglMakeCurrent failed: 0x" + r3     // Catch: java.lang.Throwable -> L44
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L44
                throw r0     // Catch: java.lang.Throwable -> L44
            L3f:
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
                goto L49
            L44:
                r8 = move-exception
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
                r0 = r8
                throw r0
            L49:
                r0 = r5
                r1 = r6
                r0.currentSurface = r1
                return
        }

        public void detachCurrent() {
                r5 = this;
                java.lang.Object r0 = org.webrtc.EglBase.lock
                r1 = r0
                r6 = r1
                monitor-enter(r0)
                r0 = r5
                android.opengl.EGLDisplay r0 = r0.eglDisplay     // Catch: java.lang.Throwable -> L34
                android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L34
                android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L34
                android.opengl.EGLContext r3 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch: java.lang.Throwable -> L34
                boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L34
                if (r0 != 0) goto L2f
                android.opengl.GLException r0 = new android.opengl.GLException     // Catch: java.lang.Throwable -> L34
                r1 = r0
                int r2 = android.opengl.EGL14.eglGetError()     // Catch: java.lang.Throwable -> L34
                int r3 = android.opengl.EGL14.eglGetError()     // Catch: java.lang.Throwable -> L34
                java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L34
                java.lang.String r3 = "eglDetachCurrent failed: 0x" + r3     // Catch: java.lang.Throwable -> L34
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L34
                throw r0     // Catch: java.lang.Throwable -> L34
            L2f:
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
                goto L39
            L34:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L34
                r0 = r7
                throw r0
            L39:
                r0 = r5
                android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
                r0.currentSurface = r1
                return
        }

        private static /* synthetic */ void lambda$new$1() {
                return
        }

        private /* synthetic */ void lambda$new$0() {
                r5 = this;
                java.lang.Object r0 = org.webrtc.EglBase.lock
                r1 = r0
                r6 = r1
                monitor-enter(r0)
                r0 = r5
                android.opengl.EGLDisplay r0 = r0.eglDisplay     // Catch: java.lang.Throwable -> L28
                android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L28
                android.opengl.EGLSurface r2 = android.opengl.EGL14.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L28
                android.opengl.EGLContext r3 = android.opengl.EGL14.EGL_NO_CONTEXT     // Catch: java.lang.Throwable -> L28
                boolean r0 = android.opengl.EGL14.eglMakeCurrent(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L28
                r0 = r5
                android.opengl.EGLDisplay r0 = r0.eglDisplay     // Catch: java.lang.Throwable -> L28
                r1 = r5
                android.opengl.EGLContext r1 = r1.eglContext     // Catch: java.lang.Throwable -> L28
                boolean r0 = android.opengl.EGL14.eglDestroyContext(r0, r1)     // Catch: java.lang.Throwable -> L28
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                goto L2d
            L28:
                r7 = move-exception
                r0 = r6
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L28
                r0 = r7
                throw r0
            L2d:
                boolean r0 = android.opengl.EGL14.eglReleaseThread()
                r0 = r5
                android.opengl.EGLDisplay r0 = r0.eglDisplay
                boolean r0 = android.opengl.EGL14.eglTerminate(r0)
                r0 = r5
                android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
                r0.currentSurface = r1
                return
        }
    }

    public EglBase14Impl(android.opengl.EGLContext r7, int[] r8) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            r0.eglSurface = r1
            r0 = r6
            org.webrtc.EglBase14Impl$EglConnection r1 = new org.webrtc.EglBase14Impl$EglConnection
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.eglConnection = r1
            return
    }

    public EglBase14Impl(org.webrtc.EglBase14Impl.EglConnection r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            r0.eglSurface = r1
            r0 = r3
            r1 = r4
            r0.eglConnection = r1
            r0 = r3
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            r0.retain()
            return
    }

    @Override // org.webrtc.EglBase
    public void createSurface(android.view.Surface r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.createSurfaceInternal(r1)
            return
    }

    @Override // org.webrtc.EglBase
    public void createSurface(android.graphics.SurfaceTexture r4) {
            r3 = this;
            r0 = r3
            r1 = r4
            r0.createSurfaceInternal(r1)
            return
    }

    private void createSurfaceInternal(java.lang.Object r8) {
            r7 = this;
            r0 = r8
            boolean r0 = r0 instanceof android.view.Surface
            if (r0 != 0) goto L18
            r0 = r8
            boolean r0 = r0 instanceof android.graphics.SurfaceTexture
            if (r0 != 0) goto L18
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Input must be either a Surface or SurfaceTexture"
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r7
            r0.checkIsNotReleased()
            r0 = r7
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 == r1) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Already has an EGLSurface"
            r1.<init>(r2)
            throw r0
        L30:
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 12344(0x3038, float:1.7298E-41)
            r1[r2] = r3
            r9 = r0
            r0 = r7
            r1 = r7
            org.webrtc.EglBase14Impl$EglConnection r1 = r1.eglConnection
            android.opengl.EGLDisplay r1 = r1.getDisplay()
            r2 = r7
            org.webrtc.EglBase14Impl$EglConnection r2 = r2.eglConnection
            android.opengl.EGLConfig r2 = r2.getConfig()
            r3 = r8
            r4 = r9
            r5 = 0
            android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreateWindowSurface(r1, r2, r3, r4, r5)
            r0.eglSurface = r1
            r0 = r7
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 != r1) goto L72
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            int r2 = android.opengl.EGL14.eglGetError()
            int r3 = android.opengl.EGL14.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Failed to create window surface: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L72:
            return
    }

    @Override // org.webrtc.EglBase
    public void createDummyPbufferSurface() {
            r4 = this;
            r0 = r4
            r1 = 1
            r2 = 1
            r0.createPbufferSurface(r1, r2)
            return
    }

    @Override // org.webrtc.EglBase
    public void createPbufferSurface(int r8, int r9) {
            r7 = this;
            r0 = r7
            r0.checkIsNotReleased()
            r0 = r7
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 == r1) goto L18
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Already has an EGLSurface"
            r1.<init>(r2)
            throw r0
        L18:
            r0 = 5
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 12375(0x3057, float:1.7341E-41)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r8
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 12374(0x3056, float:1.734E-41)
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = r9
            r1[r2] = r3
            r1 = r0
            r2 = 4
            r3 = 12344(0x3038, float:1.7298E-41)
            r1[r2] = r3
            r10 = r0
            r0 = r7
            r1 = r7
            org.webrtc.EglBase14Impl$EglConnection r1 = r1.eglConnection
            android.opengl.EGLDisplay r1 = r1.getDisplay()
            r2 = r7
            org.webrtc.EglBase14Impl$EglConnection r2 = r2.eglConnection
            android.opengl.EGLConfig r2 = r2.getConfig()
            r3 = r10
            r4 = 0
            android.opengl.EGLSurface r1 = android.opengl.EGL14.eglCreatePbufferSurface(r1, r2, r3, r4)
            r0.eglSurface = r1
            r0 = r7
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 != r1) goto L6f
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            int r2 = android.opengl.EGL14.eglGetError()
            r3 = r8
            r4 = r9
            int r5 = android.opengl.EGL14.eglGetError()
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.String r3 = "Failed to create pixel buffer surface with size " + r3 + "x" + r4 + ": 0x" + r5
            r1.<init>(r2, r3)
            throw r0
        L6f:
            return
    }

    @Override // org.webrtc.EglBase
    public org.webrtc.EglBase14Impl.Context getEglBaseContext() {
            r4 = this;
            org.webrtc.EglBase14Impl$Context r0 = new org.webrtc.EglBase14Impl$Context
            r1 = r0
            r2 = r4
            org.webrtc.EglBase14Impl$EglConnection r2 = r2.eglConnection
            android.opengl.EGLContext r2 = r2.getContext()
            r1.<init>(r2)
            return r0
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
            r3 = this;
            r0 = r3
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 == r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // org.webrtc.EglBase
    public int surfaceWidth() {
            r6 = this;
            r0 = 1
            int[] r0 = new int[r0]
            r7 = r0
            r0 = r6
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            android.opengl.EGLDisplay r0 = r0.getDisplay()
            r1 = r6
            android.opengl.EGLSurface r1 = r1.eglSurface
            r2 = 12375(0x3057, float:1.7341E-41)
            r3 = r7
            r4 = 0
            boolean r0 = android.opengl.EGL14.eglQuerySurface(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // org.webrtc.EglBase
    public int surfaceHeight() {
            r6 = this;
            r0 = 1
            int[] r0 = new int[r0]
            r7 = r0
            r0 = r6
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            android.opengl.EGLDisplay r0 = r0.getDisplay()
            r1 = r6
            android.opengl.EGLSurface r1 = r1.eglSurface
            r2 = 12374(0x3056, float:1.734E-41)
            r3 = r7
            r4 = 0
            boolean r0 = android.opengl.EGL14.eglQuerySurface(r0, r1, r2, r3, r4)
            r0 = r7
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
            r3 = this;
            r0 = r3
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 == r1) goto L20
            r0 = r3
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            android.opengl.EGLDisplay r0 = r0.getDisplay()
            r1 = r3
            android.opengl.EGLSurface r1 = r1.eglSurface
            boolean r0 = android.opengl.EGL14.eglDestroySurface(r0, r1)
            r0 = r3
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            r0.eglSurface = r1
        L20:
            return
    }

    private void checkIsNotReleased() {
            r4 = this;
            r0 = r4
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            org.webrtc.EglBase14Impl$EglConnection r1 = org.webrtc.EglBase14Impl.EGL_NO_CONNECTION
            if (r0 != r1) goto L14
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "This object has been released"
            r1.<init>(r2)
            throw r0
        L14:
            return
    }

    @Override // org.webrtc.EglBase
    public void release() {
            r3 = this;
            r0 = r3
            r0.checkIsNotReleased()
            r0 = r3
            r0.releaseSurface()
            r0 = r3
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            r0.release()
            r0 = r3
            org.webrtc.EglBase14Impl$EglConnection r1 = org.webrtc.EglBase14Impl.EGL_NO_CONNECTION
            r0.eglConnection = r1
            return
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
            r4 = this;
            r0 = r4
            r0.checkIsNotReleased()
            r0 = r4
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 != r1) goto L18
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "No EGLSurface - can't make current"
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r4
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            r1 = r4
            android.opengl.EGLSurface r1 = r1.eglSurface
            r0.makeCurrent(r1)
            return
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
            r2 = this;
            r0 = r2
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection
            r0.detachCurrent()
            return
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
            r4 = this;
            r0 = r4
            r0.checkIsNotReleased()
            r0 = r4
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 != r1) goto L18
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "No EGLSurface - can't swap buffers"
            r1.<init>(r2)
            throw r0
        L18:
            java.lang.Object r0 = org.webrtc.EglBase.lock
            r1 = r0
            r5 = r1
            monitor-enter(r0)
            r0 = r4
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection     // Catch: java.lang.Throwable -> L32
            android.opengl.EGLDisplay r0 = r0.getDisplay()     // Catch: java.lang.Throwable -> L32
            r1 = r4
            android.opengl.EGLSurface r1 = r1.eglSurface     // Catch: java.lang.Throwable -> L32
            boolean r0 = android.opengl.EGL14.eglSwapBuffers(r0, r1)     // Catch: java.lang.Throwable -> L32
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            goto L37
        L32:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            r0 = r6
            throw r0
        L37:
            return
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long r6) {
            r5 = this;
            r0 = r5
            r0.checkIsNotReleased()
            r0 = r5
            android.opengl.EGLSurface r0 = r0.eglSurface
            android.opengl.EGLSurface r1 = android.opengl.EGL14.EGL_NO_SURFACE
            if (r0 != r1) goto L18
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "No EGLSurface - can't swap buffers"
            r1.<init>(r2)
            throw r0
        L18:
            java.lang.Object r0 = org.webrtc.EglBase.lock
            r1 = r0
            r8 = r1
            monitor-enter(r0)
            r0 = r5
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection     // Catch: java.lang.Throwable -> L42
            android.opengl.EGLDisplay r0 = r0.getDisplay()     // Catch: java.lang.Throwable -> L42
            r1 = r5
            android.opengl.EGLSurface r1 = r1.eglSurface     // Catch: java.lang.Throwable -> L42
            r2 = r6
            boolean r0 = android.opengl.EGLExt.eglPresentationTimeANDROID(r0, r1, r2)     // Catch: java.lang.Throwable -> L42
            r0 = r5
            org.webrtc.EglBase14Impl$EglConnection r0 = r0.eglConnection     // Catch: java.lang.Throwable -> L42
            android.opengl.EGLDisplay r0 = r0.getDisplay()     // Catch: java.lang.Throwable -> L42
            r1 = r5
            android.opengl.EGLSurface r1 = r1.eglSurface     // Catch: java.lang.Throwable -> L42
            boolean r0 = android.opengl.EGL14.eglSwapBuffers(r0, r1)     // Catch: java.lang.Throwable -> L42
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            goto L49
        L42:
            r9 = move-exception
            r0 = r8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L42
            r0 = r9
            throw r0
        L49:
            return
    }

    private static android.opengl.EGLDisplay getEglDisplay() {
            r0 = 0
            android.opengl.EGLDisplay r0 = android.opengl.EGL14.eglGetDisplay(r0)
            r6 = r0
            r0 = r6
            android.opengl.EGLDisplay r1 = android.opengl.EGL14.EGL_NO_DISPLAY
            if (r0 != r1) goto L22
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            int r2 = android.opengl.EGL14.eglGetError()
            int r3 = android.opengl.EGL14.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Unable to get EGL14 display: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L22:
            r0 = 2
            int[] r0 = new int[r0]
            r7 = r0
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r7
            r4 = 1
            boolean r0 = android.opengl.EGL14.eglInitialize(r0, r1, r2, r3, r4)
            if (r0 != 0) goto L47
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            int r2 = android.opengl.EGL14.eglGetError()
            int r3 = android.opengl.EGL14.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Unable to initialize EGL14: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L47:
            r0 = r6
            return r0
    }

    private static android.opengl.EGLConfig getEglConfig(android.opengl.EGLDisplay r9, int[] r10) {
            r0 = 1
            android.opengl.EGLConfig[] r0 = new android.opengl.EGLConfig[r0]
            r11 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r12 = r0
            r0 = r9
            r1 = r10
            r2 = 0
            r3 = r11
            r4 = 0
            r5 = r11
            int r5 = r5.length
            r6 = r12
            r7 = 0
            boolean r0 = android.opengl.EGL14.eglChooseConfig(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != 0) goto L2e
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            int r2 = android.opengl.EGL14.eglGetError()
            int r3 = android.opengl.EGL14.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "eglChooseConfig failed: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L2e:
            r0 = r12
            r1 = 0
            r0 = r0[r1]
            if (r0 > 0) goto L3e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unable to find any matching EGL config"
            r1.<init>(r2)
            throw r0
        L3e:
            r0 = r11
            r1 = 0
            r0 = r0[r1]
            r13 = r0
            r0 = r13
            if (r0 != 0) goto L52
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "eglChooseConfig returned null"
            r1.<init>(r2)
            throw r0
        L52:
            r0 = r13
            return r0
    }

    private static android.opengl.EGLContext createEglContext(@androidx.annotation.Nullable android.opengl.EGLContext r6, android.opengl.EGLDisplay r7, android.opengl.EGLConfig r8, int r9) {
            r0 = r6
            if (r0 == 0) goto L15
            r0 = r6
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r0 != r1) goto L15
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Invalid sharedContext"
            r1.<init>(r2)
            throw r0
        L15:
            r0 = 3
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 12440(0x3098, float:1.7432E-41)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = r9
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 12344(0x3038, float:1.7298E-41)
            r1[r2] = r3
            r10 = r0
            r0 = r6
            if (r0 != 0) goto L34
            android.opengl.EGLContext r0 = android.opengl.EGL14.EGL_NO_CONTEXT
            goto L35
        L34:
            r0 = r6
        L35:
            r11 = r0
            java.lang.Object r0 = org.webrtc.EglBase.lock
            r1 = r0
            r13 = r1
            monitor-enter(r0)
            r0 = r7
            r1 = r8
            r2 = r11
            r3 = r10
            r4 = 0
            android.opengl.EGLContext r0 = android.opengl.EGL14.eglCreateContext(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L50
            r12 = r0
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            goto L58
        L50:
            r14 = move-exception
            r0 = r13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L50
            r0 = r14
            throw r0
        L58:
            r0 = r12
            android.opengl.EGLContext r1 = android.opengl.EGL14.EGL_NO_CONTEXT
            if (r0 != r1) goto L76
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            int r2 = android.opengl.EGL14.eglGetError()
            int r3 = android.opengl.EGL14.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Failed to create EGL context: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L76:
            r0 = r12
            return r0
    }

    @Override // org.webrtc.EglBase
    public /* bridge */ /* synthetic */ org.webrtc.EglBase.Context getEglBaseContext() {
            r2 = this;
            r0 = r2
            org.webrtc.EglBase14Impl$Context r0 = r0.getEglBaseContext()
            return r0
    }

    static {
            org.webrtc.EglBase14Impl$EglConnection r0 = new org.webrtc.EglBase14Impl$EglConnection
            r1 = r0
            r1.<init>()
            org.webrtc.EglBase14Impl.EGL_NO_CONNECTION = r0
            return
    }
}
