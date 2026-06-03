package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase10Impl.class */
class EglBase10Impl implements org.webrtc.EglBase10 {
    private static final java.lang.String TAG = "EglBase10Impl";
    private static final int EGL_CONTEXT_CLIENT_VERSION = 12440;
    private static final org.webrtc.EglBase10Impl.EglConnection EGL_NO_CONNECTION = null;
    private javax.microedition.khronos.egl.EGLSurface eglSurface;
    private org.webrtc.EglBase10Impl.EglConnection eglConnection;


    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase10Impl$Context.class */
    private static class Context implements org.webrtc.EglBase10.Context {
        private final javax.microedition.khronos.egl.EGL10 egl;
        private final javax.microedition.khronos.egl.EGLContext eglContext;
        private final javax.microedition.khronos.egl.EGLConfig eglContextConfig;

        @Override // org.webrtc.EglBase10.Context
        public javax.microedition.khronos.egl.EGLContext getRawContext() {
                r2 = this;
                r0 = r2
                javax.microedition.khronos.egl.EGLContext r0 = r0.eglContext
                return r0
        }

        @Override // org.webrtc.EglBase.Context
        public long getNativeEglContext() {
                r6 = this;
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                javax.microedition.khronos.egl.EGLContext r0 = r0.eglGetCurrentContext()
                r7 = r0
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetCurrentDisplay()
                r8 = r0
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = 12377(0x3059, float:1.7344E-41)
                javax.microedition.khronos.egl.EGLSurface r0 = r0.eglGetCurrentSurface(r1)
                r9 = r0
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = 12378(0x305a, float:1.7345E-41)
                javax.microedition.khronos.egl.EGLSurface r0 = r0.eglGetCurrentSurface(r1)
                r10 = r0
                r0 = 0
                r11 = r0
                r0 = r8
                javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
                if (r0 != r1) goto L46
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
                javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
                r8 = r0
            L46:
                r0 = r7
                r1 = r6
                javax.microedition.khronos.egl.EGLContext r1 = r1.eglContext     // Catch: java.lang.Throwable -> Ldc
                if (r0 == r1) goto Lb3
                r0 = 5
                int[] r0 = new int[r0]     // Catch: java.lang.Throwable -> Ldc
                r1 = r0
                r2 = 0
                r3 = 12375(0x3057, float:1.7341E-41)
                r1[r2] = r3     // Catch: java.lang.Throwable -> Ldc
                r1 = r0
                r2 = 1
                r3 = 1
                r1[r2] = r3     // Catch: java.lang.Throwable -> Ldc
                r1 = r0
                r2 = 2
                r3 = 12374(0x3056, float:1.734E-41)
                r1[r2] = r3     // Catch: java.lang.Throwable -> Ldc
                r1 = r0
                r2 = 3
                r3 = 1
                r1[r2] = r3     // Catch: java.lang.Throwable -> Ldc
                r1 = r0
                r2 = 4
                r3 = 12344(0x3038, float:1.7298E-41)
                r1[r2] = r3     // Catch: java.lang.Throwable -> Ldc
                r12 = r0
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl     // Catch: java.lang.Throwable -> Ldc
                r1 = r8
                r2 = r6
                javax.microedition.khronos.egl.EGLConfig r2 = r2.eglContextConfig     // Catch: java.lang.Throwable -> Ldc
                r3 = r12
                javax.microedition.khronos.egl.EGLSurface r0 = r0.eglCreatePbufferSurface(r1, r2, r3)     // Catch: java.lang.Throwable -> Ldc
                r11 = r0
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl     // Catch: java.lang.Throwable -> Ldc
                r1 = r8
                r2 = r11
                r3 = r11
                r4 = r6
                javax.microedition.khronos.egl.EGLContext r4 = r4.eglContext     // Catch: java.lang.Throwable -> Ldc
                boolean r0 = r0.eglMakeCurrent(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Ldc
                if (r0 != 0) goto Lb3
                android.opengl.GLException r0 = new android.opengl.GLException     // Catch: java.lang.Throwable -> Ldc
                r1 = r0
                r2 = r6
                javax.microedition.khronos.egl.EGL10 r2 = r2.egl     // Catch: java.lang.Throwable -> Ldc
                int r2 = r2.eglGetError()     // Catch: java.lang.Throwable -> Ldc
                r3 = r6
                javax.microedition.khronos.egl.EGL10 r3 = r3.egl     // Catch: java.lang.Throwable -> Ldc
                int r3 = r3.eglGetError()     // Catch: java.lang.Throwable -> Ldc
                java.lang.String r3 = "Failed to make temporary EGL surface active: " + r3     // Catch: java.lang.Throwable -> Ldc
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Ldc
                throw r0     // Catch: java.lang.Throwable -> Ldc
            Lb3:
                long r0 = org.webrtc.EglBase10Impl.nativeGetCurrentNativeEGLContext()     // Catch: java.lang.Throwable -> Ldc
                r12 = r0
                r0 = r11
                if (r0 == 0) goto Ld9
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r7
                boolean r0 = r0.eglMakeCurrent(r1, r2, r3, r4)
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = r8
                r2 = r11
                boolean r0 = r0.eglDestroySurface(r1, r2)
            Ld9:
                r0 = r12
                return r0
            Ldc:
                r14 = move-exception
                r0 = r11
                if (r0 == 0) goto Lff
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r7
                boolean r0 = r0.eglMakeCurrent(r1, r2, r3, r4)
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = r8
                r2 = r11
                boolean r0 = r0.eglDestroySurface(r1, r2)
            Lff:
                r0 = r14
                throw r0
        }

        public Context(javax.microedition.khronos.egl.EGL10 r4, javax.microedition.khronos.egl.EGLContext r5, javax.microedition.khronos.egl.EGLConfig r6) {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = r4
                r0.egl = r1
                r0 = r3
                r1 = r5
                r0.eglContext = r1
                r0 = r3
                r1 = r6
                r0.eglContextConfig = r1
                return
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase10Impl$EglConnection.class */
    public static class EglConnection implements org.webrtc.EglBase10.EglConnection {
        private final javax.microedition.khronos.egl.EGL10 egl;
        private final javax.microedition.khronos.egl.EGLContext eglContext;
        private final javax.microedition.khronos.egl.EGLDisplay eglDisplay;
        private final javax.microedition.khronos.egl.EGLConfig eglConfig;
        private final org.webrtc.RefCountDelegate refCountDelegate;
        private javax.microedition.khronos.egl.EGLSurface currentSurface;

        public EglConnection(javax.microedition.khronos.egl.EGLContext r8, int[] r9) {
                r7 = this;
                r0 = r7
                r0.<init>()
                r0 = r7
                javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
                r0.currentSurface = r1
                r0 = r7
                javax.microedition.khronos.egl.EGL r1 = javax.microedition.khronos.egl.EGLContext.getEGL()
                javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1
                r0.egl = r1
                r0 = r7
                r1 = r7
                javax.microedition.khronos.egl.EGL10 r1 = r1.egl
                javax.microedition.khronos.egl.EGLDisplay r1 = org.webrtc.EglBase10Impl.getEglDisplay(r1)
                r0.eglDisplay = r1
                r0 = r7
                r1 = r7
                javax.microedition.khronos.egl.EGL10 r1 = r1.egl
                r2 = r7
                javax.microedition.khronos.egl.EGLDisplay r2 = r2.eglDisplay
                r3 = r9
                javax.microedition.khronos.egl.EGLConfig r1 = org.webrtc.EglBase10Impl.getEglConfig(r1, r2, r3)
                r0.eglConfig = r1
                r0 = r9
                int r0 = org.webrtc.EglBase.getOpenGlesVersionFromConfig(r0)
                r10 = r0
                java.lang.String r0 = "EglBase10Impl"
                r1 = r10
                java.lang.String r1 = "Using OpenGL ES version " + r1
                org.webrtc.Logging.d(r0, r1)
                r0 = r7
                r1 = r7
                javax.microedition.khronos.egl.EGL10 r1 = r1.egl
                r2 = r8
                r3 = r7
                javax.microedition.khronos.egl.EGLDisplay r3 = r3.eglDisplay
                r4 = r7
                javax.microedition.khronos.egl.EGLConfig r4 = r4.eglConfig
                r5 = r10
                javax.microedition.khronos.egl.EGLContext r1 = org.webrtc.EglBase10Impl.createEglContext(r1, r2, r3, r4, r5)
                r0.eglContext = r1
                r0 = r7
                org.webrtc.RefCountDelegate r1 = new org.webrtc.RefCountDelegate
                r2 = r1
                r3 = r7
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
                javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
                r0.currentSurface = r1
                r0 = r5
                javax.microedition.khronos.egl.EGL r1 = javax.microedition.khronos.egl.EGLContext.getEGL()
                javax.microedition.khronos.egl.EGL10 r1 = (javax.microedition.khronos.egl.EGL10) r1
                r0.egl = r1
                r0 = r5
                javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
                r0.eglContext = r1
                r0 = r5
                javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
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

        @Override // org.webrtc.EglBase10.EglConnection
        public javax.microedition.khronos.egl.EGL10 getEgl() {
                r2 = this;
                r0 = r2
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                return r0
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public javax.microedition.khronos.egl.EGLContext getContext() {
                r2 = this;
                r0 = r2
                javax.microedition.khronos.egl.EGLContext r0 = r0.eglContext
                return r0
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public javax.microedition.khronos.egl.EGLDisplay getDisplay() {
                r2 = this;
                r0 = r2
                javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglDisplay
                return r0
        }

        @Override // org.webrtc.EglBase10.EglConnection
        public javax.microedition.khronos.egl.EGLConfig getConfig() {
                r2 = this;
                r0 = r2
                javax.microedition.khronos.egl.EGLConfig r0 = r0.eglConfig
                return r0
        }

        public void makeCurrent(javax.microedition.khronos.egl.EGLSurface r7) {
                r6 = this;
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                javax.microedition.khronos.egl.EGLContext r0 = r0.eglGetCurrentContext()
                r1 = r6
                javax.microedition.khronos.egl.EGLContext r1 = r1.eglContext
                if (r0 != r1) goto L19
                r0 = r6
                javax.microedition.khronos.egl.EGLSurface r0 = r0.currentSurface
                r1 = r7
                if (r0 != r1) goto L19
                return
            L19:
                java.lang.Object r0 = org.webrtc.EglBase.lock
                r1 = r0
                r8 = r1
                monitor-enter(r0)
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl     // Catch: java.lang.Throwable -> L5c
                r1 = r6
                javax.microedition.khronos.egl.EGLDisplay r1 = r1.eglDisplay     // Catch: java.lang.Throwable -> L5c
                r2 = r7
                r3 = r7
                r4 = r6
                javax.microedition.khronos.egl.EGLContext r4 = r4.eglContext     // Catch: java.lang.Throwable -> L5c
                boolean r0 = r0.eglMakeCurrent(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L5c
                if (r0 != 0) goto L57
                android.opengl.GLException r0 = new android.opengl.GLException     // Catch: java.lang.Throwable -> L5c
                r1 = r0
                r2 = r6
                javax.microedition.khronos.egl.EGL10 r2 = r2.egl     // Catch: java.lang.Throwable -> L5c
                int r2 = r2.eglGetError()     // Catch: java.lang.Throwable -> L5c
                r3 = r6
                javax.microedition.khronos.egl.EGL10 r3 = r3.egl     // Catch: java.lang.Throwable -> L5c
                int r3 = r3.eglGetError()     // Catch: java.lang.Throwable -> L5c
                java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r3 = "eglMakeCurrent failed: 0x" + r3     // Catch: java.lang.Throwable -> L5c
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5c
                throw r0     // Catch: java.lang.Throwable -> L5c
            L57:
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
                goto L61
            L5c:
                r9 = move-exception
                r0 = r8
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5c
                r0 = r9
                throw r0
            L61:
                r0 = r6
                r1 = r7
                r0.currentSurface = r1
                return
        }

        public void detachCurrent() {
                r6 = this;
                java.lang.Object r0 = org.webrtc.EglBase.lock
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl     // Catch: java.lang.Throwable -> L46
                r1 = r6
                javax.microedition.khronos.egl.EGLDisplay r1 = r1.eglDisplay     // Catch: java.lang.Throwable -> L46
                javax.microedition.khronos.egl.EGLSurface r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L46
                javax.microedition.khronos.egl.EGLSurface r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L46
                javax.microedition.khronos.egl.EGLContext r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch: java.lang.Throwable -> L46
                boolean r0 = r0.eglMakeCurrent(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L46
                if (r0 != 0) goto L41
                android.opengl.GLException r0 = new android.opengl.GLException     // Catch: java.lang.Throwable -> L46
                r1 = r0
                r2 = r6
                javax.microedition.khronos.egl.EGL10 r2 = r2.egl     // Catch: java.lang.Throwable -> L46
                int r2 = r2.eglGetError()     // Catch: java.lang.Throwable -> L46
                r3 = r6
                javax.microedition.khronos.egl.EGL10 r3 = r3.egl     // Catch: java.lang.Throwable -> L46
                int r3 = r3.eglGetError()     // Catch: java.lang.Throwable -> L46
                java.lang.String r3 = java.lang.Integer.toHexString(r3)     // Catch: java.lang.Throwable -> L46
                java.lang.String r3 = "eglDetachCurrent failed: 0x" + r3     // Catch: java.lang.Throwable -> L46
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L46
                throw r0     // Catch: java.lang.Throwable -> L46
            L41:
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                goto L4b
            L46:
                r8 = move-exception
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                r0 = r8
                throw r0
            L4b:
                r0 = r6
                javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
                r0.currentSurface = r1
                return
        }

        private static /* synthetic */ void lambda$new$1() {
                return
        }

        private /* synthetic */ void lambda$new$0() {
                r6 = this;
                java.lang.Object r0 = org.webrtc.EglBase.lock
                r1 = r0
                r7 = r1
                monitor-enter(r0)
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl     // Catch: java.lang.Throwable -> L22
                r1 = r6
                javax.microedition.khronos.egl.EGLDisplay r1 = r1.eglDisplay     // Catch: java.lang.Throwable -> L22
                javax.microedition.khronos.egl.EGLSurface r2 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L22
                javax.microedition.khronos.egl.EGLSurface r3 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE     // Catch: java.lang.Throwable -> L22
                javax.microedition.khronos.egl.EGLContext r4 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT     // Catch: java.lang.Throwable -> L22
                boolean r0 = r0.eglMakeCurrent(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L22
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                goto L27
            L22:
                r8 = move-exception
                r0 = r7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L22
                r0 = r8
                throw r0
            L27:
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = r6
                javax.microedition.khronos.egl.EGLDisplay r1 = r1.eglDisplay
                r2 = r6
                javax.microedition.khronos.egl.EGLContext r2 = r2.eglContext
                boolean r0 = r0.eglDestroyContext(r1, r2)
                r0 = r6
                javax.microedition.khronos.egl.EGL10 r0 = r0.egl
                r1 = r6
                javax.microedition.khronos.egl.EGLDisplay r1 = r1.eglDisplay
                boolean r0 = r0.eglTerminate(r1)
                r0 = r6
                javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
                r0.currentSurface = r1
                return
        }
    }

    public EglBase10Impl(javax.microedition.khronos.egl.EGLContext r7, int[] r8) {
            r6 = this;
            r0 = r6
            r0.<init>()
            r0 = r6
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            r0.eglSurface = r1
            r0 = r6
            org.webrtc.EglBase10Impl$EglConnection r1 = new org.webrtc.EglBase10Impl$EglConnection
            r2 = r1
            r3 = r7
            r4 = r8
            r2.<init>(r3, r4)
            r0.eglConnection = r1
            return
    }

    public EglBase10Impl(org.webrtc.EglBase10Impl.EglConnection r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            r0.eglSurface = r1
            r0 = r3
            r1 = r4
            r0.eglConnection = r1
            r0 = r3
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            r0.retain()
            return
    }

    @Override // org.webrtc.EglBase
    public void createSurface(android.view.Surface r7) {
            r6 = this;
            r0 = r6
            org.webrtc.EglBase10Impl$1FakeSurfaceHolder r1 = new org.webrtc.EglBase10Impl$1FakeSurfaceHolder
            r2 = r1
            r3 = r6
            r4 = r7
            r2.<init>(r3, r4)
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
            boolean r0 = r0 instanceof android.view.SurfaceHolder
            if (r0 != 0) goto L18
            r0 = r8
            boolean r0 = r0 instanceof android.graphics.SurfaceTexture
            if (r0 != 0) goto L18
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Input must be either a SurfaceHolder or SurfaceTexture"
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r7
            r0.checkIsNotReleased()
            r0 = r7
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 == r1) goto L30
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Already has an EGLSurface"
            r1.<init>(r2)
            throw r0
        L30:
            r0 = r7
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            javax.microedition.khronos.egl.EGL10 r0 = r0.getEgl()
            r9 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 12344(0x3038, float:1.7298E-41)
            r1[r2] = r3
            r10 = r0
            r0 = r7
            r1 = r9
            r2 = r7
            org.webrtc.EglBase10Impl$EglConnection r2 = r2.eglConnection
            javax.microedition.khronos.egl.EGLDisplay r2 = r2.getDisplay()
            r3 = r7
            org.webrtc.EglBase10Impl$EglConnection r3 = r3.eglConnection
            javax.microedition.khronos.egl.EGLConfig r3 = r3.getConfig()
            r4 = r8
            r5 = r10
            javax.microedition.khronos.egl.EGLSurface r1 = r1.eglCreateWindowSurface(r2, r3, r4, r5)
            r0.eglSurface = r1
            r0 = r7
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L82
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            r2 = r9
            int r2 = r2.eglGetError()
            r3 = r9
            int r3 = r3.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Failed to create window surface: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L82:
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
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 == r1) goto L18
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Already has an EGLSurface"
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r7
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            javax.microedition.khronos.egl.EGL10 r0 = r0.getEgl()
            r10 = r0
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
            r11 = r0
            r0 = r7
            r1 = r10
            r2 = r7
            org.webrtc.EglBase10Impl$EglConnection r2 = r2.eglConnection
            javax.microedition.khronos.egl.EGLDisplay r2 = r2.getDisplay()
            r3 = r7
            org.webrtc.EglBase10Impl$EglConnection r3 = r3.eglConnection
            javax.microedition.khronos.egl.EGLConfig r3 = r3.getConfig()
            r4 = r11
            javax.microedition.khronos.egl.EGLSurface r1 = r1.eglCreatePbufferSurface(r2, r3, r4)
            r0.eglSurface = r1
            r0 = r7
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L81
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            r2 = r10
            int r2 = r2.eglGetError()
            r3 = r8
            r4 = r9
            r5 = r10
            int r5 = r5.eglGetError()
            java.lang.String r5 = java.lang.Integer.toHexString(r5)
            java.lang.String r3 = "Failed to create pixel buffer surface with size " + r3 + "x" + r4 + ": 0x" + r5
            r1.<init>(r2, r3)
            throw r0
        L81:
            return
    }

    @Override // org.webrtc.EglBase
    public org.webrtc.EglBase.Context getEglBaseContext() {
            r6 = this;
            org.webrtc.EglBase10Impl$Context r0 = new org.webrtc.EglBase10Impl$Context
            r1 = r0
            r2 = r6
            org.webrtc.EglBase10Impl$EglConnection r2 = r2.eglConnection
            javax.microedition.khronos.egl.EGL10 r2 = r2.getEgl()
            r3 = r6
            org.webrtc.EglBase10Impl$EglConnection r3 = r3.eglConnection
            javax.microedition.khronos.egl.EGLContext r3 = r3.getContext()
            r4 = r6
            org.webrtc.EglBase10Impl$EglConnection r4 = r4.eglConnection
            javax.microedition.khronos.egl.EGLConfig r4 = r4.getConfig()
            r1.<init>(r2, r3, r4)
            return r0
    }

    @Override // org.webrtc.EglBase
    public boolean hasSurface() {
            r3 = this;
            r0 = r3
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
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
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            javax.microedition.khronos.egl.EGL10 r0 = r0.getEgl()
            r1 = r6
            org.webrtc.EglBase10Impl$EglConnection r1 = r1.eglConnection
            javax.microedition.khronos.egl.EGLDisplay r1 = r1.getDisplay()
            r2 = r6
            javax.microedition.khronos.egl.EGLSurface r2 = r2.eglSurface
            r3 = 12375(0x3057, float:1.7341E-41)
            r4 = r7
            boolean r0 = r0.eglQuerySurface(r1, r2, r3, r4)
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
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            javax.microedition.khronos.egl.EGL10 r0 = r0.getEgl()
            r1 = r6
            org.webrtc.EglBase10Impl$EglConnection r1 = r1.eglConnection
            javax.microedition.khronos.egl.EGLDisplay r1 = r1.getDisplay()
            r2 = r6
            javax.microedition.khronos.egl.EGLSurface r2 = r2.eglSurface
            r3 = 12374(0x3056, float:1.734E-41)
            r4 = r7
            boolean r0 = r0.eglQuerySurface(r1, r2, r3, r4)
            r0 = r7
            r1 = 0
            r0 = r0[r1]
            return r0
    }

    @Override // org.webrtc.EglBase
    public void releaseSurface() {
            r4 = this;
            r0 = r4
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 == r1) goto L29
            r0 = r4
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            javax.microedition.khronos.egl.EGL10 r0 = r0.getEgl()
            r1 = r4
            org.webrtc.EglBase10Impl$EglConnection r1 = r1.eglConnection
            javax.microedition.khronos.egl.EGLDisplay r1 = r1.getDisplay()
            r2 = r4
            javax.microedition.khronos.egl.EGLSurface r2 = r2.eglSurface
            boolean r0 = r0.eglDestroySurface(r1, r2)
            r0 = r4
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            r0.eglSurface = r1
        L29:
            return
    }

    private void checkIsNotReleased() {
            r4 = this;
            r0 = r4
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            org.webrtc.EglBase10Impl$EglConnection r1 = org.webrtc.EglBase10Impl.EGL_NO_CONNECTION
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
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            r0.release()
            r0 = r3
            org.webrtc.EglBase10Impl$EglConnection r1 = org.webrtc.EglBase10Impl.EGL_NO_CONNECTION
            r0.eglConnection = r1
            return
    }

    @Override // org.webrtc.EglBase
    public void makeCurrent() {
            r4 = this;
            r0 = r4
            r0.checkIsNotReleased()
            r0 = r4
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L18
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "No EGLSurface - can't make current"
            r1.<init>(r2)
            throw r0
        L18:
            r0 = r4
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            r1 = r4
            javax.microedition.khronos.egl.EGLSurface r1 = r1.eglSurface
            r0.makeCurrent(r1)
            return
    }

    @Override // org.webrtc.EglBase
    public void detachCurrent() {
            r2 = this;
            r0 = r2
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection
            r0.detachCurrent()
            return
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers() {
            r4 = this;
            r0 = r4
            r0.checkIsNotReleased()
            r0 = r4
            javax.microedition.khronos.egl.EGLSurface r0 = r0.eglSurface
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
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
            org.webrtc.EglBase10Impl$EglConnection r0 = r0.eglConnection     // Catch: java.lang.Throwable -> L3b
            javax.microedition.khronos.egl.EGL10 r0 = r0.getEgl()     // Catch: java.lang.Throwable -> L3b
            r1 = r4
            org.webrtc.EglBase10Impl$EglConnection r1 = r1.eglConnection     // Catch: java.lang.Throwable -> L3b
            javax.microedition.khronos.egl.EGLDisplay r1 = r1.getDisplay()     // Catch: java.lang.Throwable -> L3b
            r2 = r4
            javax.microedition.khronos.egl.EGLSurface r2 = r2.eglSurface     // Catch: java.lang.Throwable -> L3b
            boolean r0 = r0.eglSwapBuffers(r1, r2)     // Catch: java.lang.Throwable -> L3b
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            goto L40
        L3b:
            r6 = move-exception
            r0 = r5
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            r0 = r6
            throw r0
        L40:
            return
    }

    @Override // org.webrtc.EglBase
    public void swapBuffers(long r3) {
            r2 = this;
            r0 = r2
            r0.swapBuffers()
            return
    }

    private static javax.microedition.khronos.egl.EGLDisplay getEglDisplay(javax.microedition.khronos.egl.EGL10 r5) {
            r0 = r5
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r6 = r0
            r0 = r6
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            if (r0 != r1) goto L2d
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            r2 = r5
            int r2 = r2.eglGetError()
            r3 = r5
            int r3 = r3.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Unable to get EGL10 display: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L2d:
            r0 = 2
            int[] r0 = new int[r0]
            r7 = r0
            r0 = r5
            r1 = r6
            r2 = r7
            boolean r0 = r0.eglInitialize(r1, r2)
            if (r0 != 0) goto L58
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            r2 = r5
            int r2 = r2.eglGetError()
            r3 = r5
            int r3 = r3.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Unable to initialize EGL10: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L58:
            r0 = r6
            return r0
    }

    private static javax.microedition.khronos.egl.EGLConfig getEglConfig(javax.microedition.khronos.egl.EGL10 r7, javax.microedition.khronos.egl.EGLDisplay r8, int[] r9) {
            r0 = 1
            javax.microedition.khronos.egl.EGLConfig[] r0 = new javax.microedition.khronos.egl.EGLConfig[r0]
            r10 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r11 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r10
            int r4 = r4.length
            r5 = r11
            boolean r0 = r0.eglChooseConfig(r1, r2, r3, r4, r5)
            if (r0 != 0) goto L36
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            r2 = r7
            int r2 = r2.eglGetError()
            r3 = r7
            int r3 = r3.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "eglChooseConfig failed: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L36:
            r0 = r11
            r1 = 0
            r0 = r0[r1]
            if (r0 > 0) goto L47
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Unable to find any matching EGL config"
            r1.<init>(r2)
            throw r0
        L47:
            r0 = r10
            r1 = 0
            r0 = r0[r1]
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L5b
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "eglChooseConfig returned null"
            r1.<init>(r2)
            throw r0
        L5b:
            r0 = r12
            return r0
    }

    private static javax.microedition.khronos.egl.EGLContext createEglContext(javax.microedition.khronos.egl.EGL10 r6, @androidx.annotation.Nullable javax.microedition.khronos.egl.EGLContext r7, javax.microedition.khronos.egl.EGLDisplay r8, javax.microedition.khronos.egl.EGLConfig r9, int r10) {
            r0 = r7
            if (r0 == 0) goto L15
            r0 = r7
            javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
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
            r3 = r10
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 12344(0x3038, float:1.7298E-41)
            r1[r2] = r3
            r11 = r0
            r0 = r7
            if (r0 != 0) goto L35
            javax.microedition.khronos.egl.EGLContext r0 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            goto L36
        L35:
            r0 = r7
        L36:
            r12 = r0
            java.lang.Object r0 = org.webrtc.EglBase.lock
            r1 = r0
            r14 = r1
            monitor-enter(r0)
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r12
            r4 = r11
            javax.microedition.khronos.egl.EGLContext r0 = r0.eglCreateContext(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L53
            r13 = r0
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            goto L5b
        L53:
            r15 = move-exception
            r0 = r14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            r0 = r15
            throw r0
        L5b:
            r0 = r13
            javax.microedition.khronos.egl.EGLContext r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r0 != r1) goto L7f
            android.opengl.GLException r0 = new android.opengl.GLException
            r1 = r0
            r2 = r6
            int r2 = r2.eglGetError()
            r3 = r6
            int r3 = r3.eglGetError()
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.String r3 = "Failed to create EGL context: 0x" + r3
            r1.<init>(r2, r3)
            throw r0
        L7f:
            r0 = r13
            return r0
    }

    private static native long nativeGetCurrentNativeEGLContext();

    static {
            org.webrtc.EglBase10Impl$EglConnection r0 = new org.webrtc.EglBase10Impl$EglConnection
            r1 = r0
            r1.<init>()
            org.webrtc.EglBase10Impl.EGL_NO_CONNECTION = r0
            return
    }
}
