package org.webrtc;

/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase.class */
public interface EglBase {
    public static final java.lang.Object lock = null;
    public static final int EGL_OPENGL_ES2_BIT = 4;
    public static final int EGL_OPENGL_ES3_BIT = 64;
    public static final int EGL_RECORDABLE_ANDROID = 12610;
    public static final int[] CONFIG_PLAIN = null;
    public static final int[] CONFIG_RGBA = null;
    public static final int[] CONFIG_PIXEL_BUFFER = null;
    public static final int[] CONFIG_PIXEL_RGBA_BUFFER = null;
    public static final int[] CONFIG_RECORDABLE = null;

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase$ConfigBuilder.class */
    public static class ConfigBuilder {
        private int openGlesVersion;
        private boolean hasAlphaChannel;
        private boolean supportsPixelBuffer;
        private boolean isRecordable;

        public ConfigBuilder() {
                r3 = this;
                r0 = r3
                r0.<init>()
                r0 = r3
                r1 = 2
                r0.openGlesVersion = r1
                return
        }

        public org.webrtc.EglBase.ConfigBuilder setOpenGlesVersion(int r5) {
                r4 = this;
                r0 = r5
                r1 = 1
                if (r0 < r1) goto La
                r0 = r5
                r1 = 3
                if (r0 <= r1) goto L18
            La:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                r2 = r5
                java.lang.String r2 = "OpenGL ES version " + r2 + " not supported"
                r1.<init>(r2)
                throw r0
            L18:
                r0 = r4
                r1 = r5
                r0.openGlesVersion = r1
                r0 = r4
                return r0
        }

        public org.webrtc.EglBase.ConfigBuilder setHasAlphaChannel(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.hasAlphaChannel = r1
                r0 = r3
                return r0
        }

        public org.webrtc.EglBase.ConfigBuilder setSupportsPixelBuffer(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.supportsPixelBuffer = r1
                r0 = r3
                return r0
        }

        public org.webrtc.EglBase.ConfigBuilder setIsRecordable(boolean r4) {
                r3 = this;
                r0 = r3
                r1 = r4
                r0.isRecordable = r1
                r0 = r3
                return r0
        }

        public int[] createConfigAttributes() {
                r5 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = r0
                r1.<init>()
                r6 = r0
                r0 = r6
                r1 = 12324(0x3024, float:1.727E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 12323(0x3023, float:1.7268E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 12322(0x3022, float:1.7267E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r5
                boolean r0 = r0.hasAlphaChannel
                if (r0 == 0) goto L63
                r0 = r6
                r1 = 12321(0x3021, float:1.7265E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
            L63:
                r0 = r5
                int r0 = r0.openGlesVersion
                r1 = 2
                if (r0 == r1) goto L73
                r0 = r5
                int r0 = r0.openGlesVersion
                r1 = 3
                if (r0 != r1) goto L94
            L73:
                r0 = r6
                r1 = 12352(0x3040, float:1.7309E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = r5
                int r1 = r1.openGlesVersion
                r2 = 3
                if (r1 != r2) goto L8c
                r1 = 64
                goto L8d
            L8c:
                r1 = 4
            L8d:
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
            L94:
                r0 = r5
                boolean r0 = r0.supportsPixelBuffer
                if (r0 == 0) goto Laf
                r0 = r6
                r1 = 12339(0x3033, float:1.729E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
            Laf:
                r0 = r5
                boolean r0 = r0.isRecordable
                if (r0 == 0) goto Lca
                r0 = r6
                r1 = 12610(0x3142, float:1.767E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                r1 = 1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
            Lca:
                r0 = r6
                r1 = 12344(0x3038, float:1.7298E-41)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = r0.add(r1)
                r0 = r6
                int r0 = r0.size()
                int[] r0 = new int[r0]
                r7 = r0
                r0 = 0
                r8 = r0
            Lde:
                r0 = r8
                r1 = r6
                int r1 = r1.size()
                if (r0 >= r1) goto Lfa
                r0 = r7
                r1 = r8
                r2 = r6
                r3 = r8
                java.lang.Object r2 = r2.get(r3)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0[r1] = r2
                int r8 = r8 + 1
                goto Lde
            Lfa:
                r0 = r7
                return r0
        }
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase$Context.class */
    public interface Context {
        public static final long NO_CONTEXT = 0;

        long getNativeEglContext();
    }

    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/webrtc_bridge/webrtc-android-classes.jar:org/webrtc/EglBase$EglConnection.class */
    public interface EglConnection extends org.webrtc.RefCounted {
        static org.webrtc.EglBase.EglConnection create(@androidx.annotation.Nullable org.webrtc.EglBase.Context r5, int[] r6) {
                r0 = r5
                if (r0 != 0) goto L9
                r0 = r6
                org.webrtc.EglBase$EglConnection r0 = createEgl14(r0)
                return r0
            L9:
                r0 = r5
                boolean r0 = r0 instanceof org.webrtc.EglBase14.Context
                if (r0 == 0) goto L22
                org.webrtc.EglBase14Impl$EglConnection r0 = new org.webrtc.EglBase14Impl$EglConnection
                r1 = r0
                r2 = r5
                org.webrtc.EglBase14$Context r2 = (org.webrtc.EglBase14.Context) r2
                android.opengl.EGLContext r2 = r2.getRawContext()
                r3 = r6
                r1.<init>(r2, r3)
                return r0
            L22:
                r0 = r5
                boolean r0 = r0 instanceof org.webrtc.EglBase10.Context
                if (r0 == 0) goto L3b
                org.webrtc.EglBase10Impl$EglConnection r0 = new org.webrtc.EglBase10Impl$EglConnection
                r1 = r0
                r2 = r5
                org.webrtc.EglBase10$Context r2 = (org.webrtc.EglBase10.Context) r2
                javax.microedition.khronos.egl.EGLContext r2 = r2.getRawContext()
                r3 = r6
                r1.<init>(r2, r3)
                return r0
            L3b:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = r0
                java.lang.String r2 = "Unrecognized Context"
                r1.<init>(r2)
                throw r0
        }

        static org.webrtc.EglBase.EglConnection createEgl10(int[] r5) {
                org.webrtc.EglBase10Impl$EglConnection r0 = new org.webrtc.EglBase10Impl$EglConnection
                r1 = r0
                r2 = 0
                r3 = r5
                r1.<init>(r2, r3)
                return r0
        }

        static org.webrtc.EglBase.EglConnection createEgl14(int[] r5) {
                org.webrtc.EglBase14Impl$EglConnection r0 = new org.webrtc.EglBase14Impl$EglConnection
                r1 = r0
                r2 = 0
                r3 = r5
                r1.<init>(r2, r3)
                return r0
        }
    }

    static org.webrtc.EglBase.ConfigBuilder configBuilder() {
            org.webrtc.EglBase$ConfigBuilder r0 = new org.webrtc.EglBase$ConfigBuilder
            r1 = r0
            r1.<init>()
            return r0
    }

    static int getOpenGlesVersionFromConfig(int[] r4) {
            r0 = 0
            r5 = r0
        L2:
            r0 = r5
            r1 = r4
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
            if (r0 >= r1) goto L40
            r0 = r4
            r1 = r5
            r0 = r0[r1]
            r1 = 12352(0x3040, float:1.7309E-41)
            if (r0 != r1) goto L3a
            r0 = r4
            r1 = r5
            r2 = 1
            int r1 = r1 + r2
            r0 = r0[r1]
            switch(r0) {
                case 4: goto L34;
                case 64: goto L36;
                default: goto L38;
            }
        L34:
            r0 = 2
            return r0
        L36:
            r0 = 3
            return r0
        L38:
            r0 = 1
            return r0
        L3a:
            int r5 = r5 + 1
            goto L2
        L40:
            r0 = 1
            return r0
    }

    static org.webrtc.EglBase create(org.webrtc.EglBase.EglConnection r4) {
            r0 = r4
            if (r0 != 0) goto L8
            org.webrtc.EglBase r0 = create()
            return r0
        L8:
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.EglBase14Impl.EglConnection
            if (r0 == 0) goto L1b
            org.webrtc.EglBase14Impl r0 = new org.webrtc.EglBase14Impl
            r1 = r0
            r2 = r4
            org.webrtc.EglBase14Impl$EglConnection r2 = (org.webrtc.EglBase14Impl.EglConnection) r2
            r1.<init>(r2)
            return r0
        L1b:
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.EglBase10Impl.EglConnection
            if (r0 == 0) goto L2e
            org.webrtc.EglBase10Impl r0 = new org.webrtc.EglBase10Impl
            r1 = r0
            r2 = r4
            org.webrtc.EglBase10Impl$EglConnection r2 = (org.webrtc.EglBase10Impl.EglConnection) r2
            r1.<init>(r2)
            return r0
        L2e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unrecognized EglConnection"
            r1.<init>(r2)
            throw r0
    }

    static org.webrtc.EglBase create(@androidx.annotation.Nullable org.webrtc.EglBase.Context r4, int[] r5) {
            r0 = r4
            if (r0 != 0) goto L9
            r0 = r5
            org.webrtc.EglBase14 r0 = createEgl14(r0)
            return r0
        L9:
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.EglBase14.Context
            if (r0 == 0) goto L19
            r0 = r4
            org.webrtc.EglBase14$Context r0 = (org.webrtc.EglBase14.Context) r0
            r1 = r5
            org.webrtc.EglBase14 r0 = createEgl14(r0, r1)
            return r0
        L19:
            r0 = r4
            boolean r0 = r0 instanceof org.webrtc.EglBase10.Context
            if (r0 == 0) goto L29
            r0 = r4
            org.webrtc.EglBase10$Context r0 = (org.webrtc.EglBase10.Context) r0
            r1 = r5
            org.webrtc.EglBase10 r0 = createEgl10(r0, r1)
            return r0
        L29:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Unrecognized Context"
            r1.<init>(r2)
            throw r0
    }

    static org.webrtc.EglBase create() {
            r0 = 0
            int[] r1 = org.webrtc.EglBase.CONFIG_PLAIN
            org.webrtc.EglBase r0 = create(r0, r1)
            return r0
    }

    static org.webrtc.EglBase create(org.webrtc.EglBase.Context r3) {
            r0 = r3
            int[] r1 = org.webrtc.EglBase.CONFIG_PLAIN
            org.webrtc.EglBase r0 = create(r0, r1)
            return r0
    }

    static org.webrtc.EglBase10 createEgl10(int[] r5) {
            org.webrtc.EglBase10Impl r0 = new org.webrtc.EglBase10Impl
            r1 = r0
            r2 = 0
            r3 = r5
            r1.<init>(r2, r3)
            return r0
    }

    static org.webrtc.EglBase10 createEgl10(org.webrtc.EglBase10.Context r5, int[] r6) {
            org.webrtc.EglBase10Impl r0 = new org.webrtc.EglBase10Impl
            r1 = r0
            r2 = r5
            if (r2 != 0) goto Lc
            r2 = 0
            goto L12
        Lc:
            r2 = r5
            javax.microedition.khronos.egl.EGLContext r2 = r2.getRawContext()
        L12:
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    static org.webrtc.EglBase10 createEgl10(javax.microedition.khronos.egl.EGLContext r5, int[] r6) {
            org.webrtc.EglBase10Impl r0 = new org.webrtc.EglBase10Impl
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    static org.webrtc.EglBase14 createEgl14(int[] r5) {
            org.webrtc.EglBase14Impl r0 = new org.webrtc.EglBase14Impl
            r1 = r0
            r2 = 0
            r3 = r5
            r1.<init>(r2, r3)
            return r0
    }

    static org.webrtc.EglBase14 createEgl14(org.webrtc.EglBase14.Context r5, int[] r6) {
            org.webrtc.EglBase14Impl r0 = new org.webrtc.EglBase14Impl
            r1 = r0
            r2 = r5
            if (r2 != 0) goto Lc
            r2 = 0
            goto L12
        Lc:
            r2 = r5
            android.opengl.EGLContext r2 = r2.getRawContext()
        L12:
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    static org.webrtc.EglBase14 createEgl14(android.opengl.EGLContext r5, int[] r6) {
            org.webrtc.EglBase14Impl r0 = new org.webrtc.EglBase14Impl
            r1 = r0
            r2 = r5
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    void createSurface(android.view.Surface r1);

    void createSurface(android.graphics.SurfaceTexture r1);

    void createDummyPbufferSurface();

    void createPbufferSurface(int r1, int r2);

    org.webrtc.EglBase.Context getEglBaseContext();

    boolean hasSurface();

    int surfaceWidth();

    int surfaceHeight();

    void releaseSurface();

    void release();

    void makeCurrent();

    void detachCurrent();

    void swapBuffers();

    void swapBuffers(long r1);

    static {
            java.lang.Object r0 = new java.lang.Object
            r1 = r0
            r1.<init>()
            org.webrtc.EglBase.lock = r0
            org.webrtc.EglBase$ConfigBuilder r0 = configBuilder()
            int[] r0 = r0.createConfigAttributes()
            org.webrtc.EglBase.CONFIG_PLAIN = r0
            org.webrtc.EglBase$ConfigBuilder r0 = configBuilder()
            r1 = 1
            org.webrtc.EglBase$ConfigBuilder r0 = r0.setHasAlphaChannel(r1)
            int[] r0 = r0.createConfigAttributes()
            org.webrtc.EglBase.CONFIG_RGBA = r0
            org.webrtc.EglBase$ConfigBuilder r0 = configBuilder()
            r1 = 1
            org.webrtc.EglBase$ConfigBuilder r0 = r0.setSupportsPixelBuffer(r1)
            int[] r0 = r0.createConfigAttributes()
            org.webrtc.EglBase.CONFIG_PIXEL_BUFFER = r0
            org.webrtc.EglBase$ConfigBuilder r0 = configBuilder()
            r1 = 1
            org.webrtc.EglBase$ConfigBuilder r0 = r0.setHasAlphaChannel(r1)
            r1 = 1
            org.webrtc.EglBase$ConfigBuilder r0 = r0.setSupportsPixelBuffer(r1)
            int[] r0 = r0.createConfigAttributes()
            org.webrtc.EglBase.CONFIG_PIXEL_RGBA_BUFFER = r0
            org.webrtc.EglBase$ConfigBuilder r0 = configBuilder()
            r1 = 1
            org.webrtc.EglBase$ConfigBuilder r0 = r0.setIsRecordable(r1)
            int[] r0 = r0.createConfigAttributes()
            org.webrtc.EglBase.CONFIG_RECORDABLE = r0
            return
    }
}
