package org.lwjgl.opengl;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL.class */
public final class GL {

    @javax.annotation.Nullable
    private static final org.lwjgl.system.APIUtil.APIVersion MAX_VERSION = null;

    @javax.annotation.Nullable
    private static org.lwjgl.system.FunctionProvider functionProvider;
    private static final java.lang.ThreadLocal<org.lwjgl.opengl.GLCapabilities> capabilitiesTLS = null;
    private static org.lwjgl.opengl.GL.ICD icd;

    @javax.annotation.Nullable
    private static org.lwjgl.opengl.WGLCapabilities capabilitiesWGL;

    @javax.annotation.Nullable
    private static org.lwjgl.opengl.GLXCapabilities capabilitiesGLXClient;

    @javax.annotation.Nullable
    private static org.lwjgl.opengl.GLXCapabilities capabilitiesGLX;


    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$2.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$2.class
     */
    /* JADX INFO: renamed from: org.lwjgl.opengl.GL$2, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$2.class */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$org$lwjgl$system$Platform = null;

        static {
                org.lwjgl.system.Platform[] r0 = org.lwjgl.system.Platform.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.lwjgl.opengl.GL.AnonymousClass2.$SwitchMap$org$lwjgl$system$Platform = r0
                int[] r0 = org.lwjgl.opengl.GL.AnonymousClass2.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L17
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.LINUX     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.lwjgl.opengl.GL.AnonymousClass2.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L26
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.MACOSX     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                int[] r0 = org.lwjgl.opengl.GL.AnonymousClass2.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L35
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS     // Catch: java.lang.NoSuchFieldError -> L35
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L35
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L35
                goto L36
            L35:
                r4 = move-exception
            L36:
                return
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICD.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICD.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICD.class */
    private interface ICD {
        default void set(@javax.annotation.Nullable org.lwjgl.opengl.GLCapabilities r2) {
                r1 = this;
                return
        }

        @javax.annotation.Nullable
        org.lwjgl.opengl.GLCapabilities get();
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICDStatic.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICDStatic.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICDStatic.class */
    private static class ICDStatic implements org.lwjgl.opengl.GL.ICD {

        @javax.annotation.Nullable
        private static org.lwjgl.opengl.GLCapabilities tempCaps;

        /* JADX WARN: Classes with same name are omitted, all sources:
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICDStatic$WriteOnce.class
          DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICDStatic$WriteOnce.class
         */
        /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/opengl/GL$ICDStatic$WriteOnce.class */
        private static final class WriteOnce {
            static final org.lwjgl.opengl.GLCapabilities caps = null;

            private WriteOnce() {
                    r2 = this;
                    r0 = r2
                    r0.<init>()
                    return
            }

            static {
                    org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.ICDStatic.access$200()
                    r4 = r0
                    r0 = r4
                    if (r0 != 0) goto L12
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    r1 = r0
                    java.lang.String r2 = "No GLCapabilities instance has been set"
                    r1.<init>(r2)
                    throw r0
                L12:
                    r0 = r4
                    org.lwjgl.opengl.GL.ICDStatic.WriteOnce.caps = r0
                    return
            }
        }

        private ICDStatic() {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        @Override // org.lwjgl.opengl.GL.ICD
        public void set(@javax.annotation.Nullable org.lwjgl.opengl.GLCapabilities r4) {
                r3 = this;
                org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.ICDStatic.tempCaps
                if (r0 != 0) goto Ld
                r0 = r4
                org.lwjgl.opengl.GL.ICDStatic.tempCaps = r0
                goto L36
            Ld:
                r0 = r4
                if (r0 == 0) goto L36
                r0 = r4
                org.lwjgl.opengl.GLCapabilities r1 = org.lwjgl.opengl.GL.ICDStatic.tempCaps
                if (r0 == r1) goto L36
                org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.ICDStatic.tempCaps
                org.lwjgl.PointerBuffer r0 = r0.addresses
                r1 = r4
                org.lwjgl.PointerBuffer r1 = r1.addresses
                boolean r0 = org.lwjgl.system.ThreadLocalUtil.areCapabilitiesDifferent(r0, r1)
                if (r0 == 0) goto L36
                java.lang.String r0 = "[WARNING] Incompatible context detected. Falling back to thread-local lookup for GL contexts."
                org.lwjgl.system.APIUtil.apiLog(r0)
                void r0 = org.lwjgl.opengl.GL::getCapabilities
                org.lwjgl.opengl.GL$ICD r0 = org.lwjgl.opengl.GL.access$102(r0)
            L36:
                return
        }

        @Override // org.lwjgl.opengl.GL.ICD
        public org.lwjgl.opengl.GLCapabilities get() {
                r2 = this;
                org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.ICDStatic.WriteOnce.caps
                return r0
        }

        /* synthetic */ ICDStatic(org.lwjgl.opengl.GL.AnonymousClass1 r3) {
                r2 = this;
                r0 = r2
                r0.<init>()
                return
        }

        static /* synthetic */ org.lwjgl.opengl.GLCapabilities access$200() {
                org.lwjgl.opengl.GLCapabilities r0 = org.lwjgl.opengl.GL.ICDStatic.tempCaps
                return r0
        }
    }

    private GL() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static void initialize() {
            return
    }

    public static void create() {
            int[] r0 = org.lwjgl.opengl.GL.AnonymousClass2.$SwitchMap$org$lwjgl$system$Platform
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.get()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L45;
                case 3: goto L72;
                default: goto L89;
            }
        L24:
            java.lang.Class<org.lwjgl.opengl.GL> r0 = org.lwjgl.opengl.GL.class
            java.lang.String r1 = "org.lwjgl.opengl"
            org.lwjgl.system.Configuration<java.lang.String> r2 = org.lwjgl.system.Configuration.OPENGL_LIBRARY_NAME
            r3 = 3
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "libGLX.so.0"
            r4[r5] = r6
            r4 = r3
            r5 = 1
            java.lang.String r6 = "libGL.so.1"
            r4[r5] = r6
            r4 = r3
            r5 = 2
            java.lang.String r6 = "libGL.so"
            r4[r5] = r6
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            r8 = r0
            goto L91
        L45:
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.OPENGL_LIBRARY_NAME
            java.lang.String r1 = "org.lwjgl.opengl.libname"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r0.set(r1)
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.OPENGL_LIBRARY_NAME
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L69
            java.lang.Class<org.lwjgl.opengl.GL> r0 = org.lwjgl.opengl.GL.class
            java.lang.String r1 = "org.lwjgl.opengl"
            r2 = r9
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            goto L6e
        L69:
            java.lang.String r0 = "com.apple.opengl"
            org.lwjgl.system.macosx.MacOSXLibrary r0 = org.lwjgl.system.macosx.MacOSXLibrary.getWithIdentifier(r0)
        L6e:
            r8 = r0
            goto L91
        L72:
            java.lang.Class<org.lwjgl.opengl.GL> r0 = org.lwjgl.opengl.GL.class
            java.lang.String r1 = "org.lwjgl.opengl"
            org.lwjgl.system.Configuration<java.lang.String> r2 = org.lwjgl.system.Configuration.OPENGL_LIBRARY_NAME
            r3 = 1
            java.lang.String[] r3 = new java.lang.String[r3]
            r4 = r3
            r5 = 0
            java.lang.String r6 = "opengl32"
            r4[r5] = r6
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2, r3)
            r8 = r0
            goto L91
        L89:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
        L91:
            r0 = r8
            create(r0)
            return
    }

    public static void create(java.lang.String r4) {
            java.lang.Class<org.lwjgl.opengl.GL> r0 = org.lwjgl.opengl.GL.class
            java.lang.String r1 = "org.lwjgl.opengl"
            r2 = r4
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.Library.loadNative(r0, r1, r2)
            create(r0)
            return
    }

    private static void create(org.lwjgl.system.SharedLibrary r4) {
            org.lwjgl.opengl.GL$1 r0 = new org.lwjgl.opengl.GL$1     // Catch: java.lang.RuntimeException -> Le
            r1 = r0
            r2 = r4
            r1.<init>(r2)     // Catch: java.lang.RuntimeException -> Le
            create(r0)     // Catch: java.lang.RuntimeException -> Le
            goto L17
        Le:
            r5 = move-exception
            r0 = r4
            r0.free()
            r0 = r5
            throw r0
        L17:
            return
    }

    public static void create(org.lwjgl.system.FunctionProvider r4) {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            if (r0 == 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "OpenGL library has already been loaded."
            r1.<init>(r2)
            throw r0
        L10:
            r0 = r4
            org.lwjgl.opengl.GL.functionProvider = r0
            r0 = 2228(0x8b4, float:3.122E-42)
            org.lwjgl.system.ThreadLocalUtil.setFunctionMissingAddresses(r0)
            return
    }

    public static void destroy() {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            org.lwjgl.system.ThreadLocalUtil.setFunctionMissingAddresses(r0)
            r0 = 0
            org.lwjgl.opengl.GL.capabilitiesWGL = r0
            r0 = 0
            org.lwjgl.opengl.GL.capabilitiesGLX = r0
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            boolean r0 = r0 instanceof org.lwjgl.system.NativeResource
            if (r0 == 0) goto L27
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            org.lwjgl.system.NativeResource r0 = (org.lwjgl.system.NativeResource) r0
            r0.free()
        L27:
            r0 = 0
            org.lwjgl.opengl.GL.functionProvider = r0
            return
    }

    @javax.annotation.Nullable
    public static org.lwjgl.system.FunctionProvider getFunctionProvider() {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            return r0
    }

    public static void setCapabilities(@javax.annotation.Nullable org.lwjgl.opengl.GLCapabilities r3) {
            java.lang.ThreadLocal<org.lwjgl.opengl.GLCapabilities> r0 = org.lwjgl.opengl.GL.capabilitiesTLS
            r1 = r3
            r0.set(r1)
            r0 = r3
            if (r0 != 0) goto Lf
            r0 = 0
            goto L16
        Lf:
            r0 = r3
            org.lwjgl.PointerBuffer r0 = r0.addresses
            long r0 = org.lwjgl.system.MemoryUtil.memAddress(r0)
        L16:
            org.lwjgl.system.ThreadLocalUtil.setCapabilities(r0)
            org.lwjgl.opengl.GL$ICD r0 = org.lwjgl.opengl.GL.icd
            r1 = r3
            r0.set(r1)
            return
    }

    public static org.lwjgl.opengl.GLCapabilities getCapabilities() {
            java.lang.ThreadLocal<org.lwjgl.opengl.GLCapabilities> r0 = org.lwjgl.opengl.GL.capabilitiesTLS
            java.lang.Object r0 = r0.get()
            org.lwjgl.opengl.GLCapabilities r0 = (org.lwjgl.opengl.GLCapabilities) r0
            org.lwjgl.opengl.GLCapabilities r0 = checkCapabilities(r0)
            return r0
    }

    private static org.lwjgl.opengl.GLCapabilities checkCapabilities(@javax.annotation.Nullable org.lwjgl.opengl.GLCapabilities r4) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 == 0) goto L14
            r0 = r4
            if (r0 != 0) goto L14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "No GLCapabilities instance set for the current thread. Possible solutions:\n\ta) Call GL.createCapabilities() after making a context current in the current thread.\n\tb) Call GL.setCapabilities() if a GLCapabilities instance already exists for the current context."
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r4
            return r0
    }

    public static org.lwjgl.opengl.WGLCapabilities getCapabilitiesWGL() {
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.capabilitiesWGL
            if (r0 != 0) goto Lc
            org.lwjgl.opengl.WGLCapabilities r0 = createCapabilitiesWGLDummy()
            org.lwjgl.opengl.GL.capabilitiesWGL = r0
        Lc:
            org.lwjgl.opengl.WGLCapabilities r0 = org.lwjgl.opengl.GL.capabilitiesWGL
            return r0
    }

    static org.lwjgl.opengl.GLXCapabilities getCapabilitiesGLXClient() {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.capabilitiesGLXClient
            if (r0 != 0) goto Ld
            r0 = 1
            org.lwjgl.opengl.GLXCapabilities r0 = initCapabilitiesGLX(r0)
            org.lwjgl.opengl.GL.capabilitiesGLXClient = r0
        Ld:
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.capabilitiesGLXClient
            return r0
    }

    public static org.lwjgl.opengl.GLXCapabilities getCapabilitiesGLX() {
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.capabilitiesGLX
            if (r0 != 0) goto Ld
            r0 = 0
            org.lwjgl.opengl.GLXCapabilities r0 = initCapabilitiesGLX(r0)
            org.lwjgl.opengl.GL.capabilitiesGLX = r0
        Ld:
            org.lwjgl.opengl.GLXCapabilities r0 = org.lwjgl.opengl.GL.capabilitiesGLX
            return r0
    }

    private static org.lwjgl.opengl.GLXCapabilities initCapabilitiesGLX(boolean r5) {
            r0 = 0
            long r0 = org.lwjgl.system.linux.X11.nXOpenDisplay(r0)
            r6 = r0
            r0 = r6
            r1 = r5
            if (r1 == 0) goto Le
            r1 = -1
            goto L12
        Le:
            r1 = r6
            int r1 = org.lwjgl.system.linux.X11.XDefaultScreen(r1)     // Catch: java.lang.Throwable -> L1c
        L12:
            org.lwjgl.opengl.GLXCapabilities r0 = createCapabilitiesGLX(r0, r1)     // Catch: java.lang.Throwable -> L1c
            r8 = r0
            r0 = r6
            org.lwjgl.system.linux.X11.XCloseDisplay(r0)
            r0 = r8
            return r0
        L1c:
            r9 = move-exception
            r0 = r6
            org.lwjgl.system.linux.X11.XCloseDisplay(r0)
            r0 = r9
            throw r0
    }

    private static void fixPojavGLContext() throws java.lang.Exception {
            java.lang.String r0 = "org.lwjgl.glfw.GLFW"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            r10 = r0
            r0 = r10
            java.lang.String r1 = "mainContext"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            r8 = r0
            r0 = r10
            java.lang.String r1 = "glfwMakeContextCurrent"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class r5 = java.lang.Long.TYPE
            r3[r4] = r5
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)
            r1 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = r2
            r4 = 0
            r5 = r8
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3[r4] = r5
            java.lang.Object r0 = r0.invoke(r1, r2)
            return
    }

    public static org.lwjgl.opengl.GLCapabilities createCapabilities() {
            r0 = 0
            org.lwjgl.opengl.GLCapabilities r0 = createCapabilities(r0)
            return r0
    }

    public static org.lwjgl.opengl.GLCapabilities createCapabilities(@javax.annotation.Nullable java.util.function.IntFunction<org.lwjgl.PointerBuffer> r3) {
            r0 = 0
            r1 = r3
            org.lwjgl.opengl.GLCapabilities r0 = createCapabilities(r0, r1)
            return r0
    }

    public static org.lwjgl.opengl.GLCapabilities createCapabilities(boolean r3) {
            r0 = r3
            r1 = 0
            org.lwjgl.opengl.GLCapabilities r0 = createCapabilities(r0, r1)
            return r0
    }

    public static org.lwjgl.opengl.GLCapabilities createCapabilities(boolean r7, @javax.annotation.Nullable java.util.function.IntFunction<org.lwjgl.PointerBuffer> r8) {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "OpenGL library has not been loaded."
            r1.<init>(r2)
            throw r0
        L12:
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.LINUX
            if (r0 != r1) goto L2e
            java.lang.String r0 = "POJAV_RENDERER"
            java.lang.String r0 = java.lang.System.getenv(r0)
            if (r0 == 0) goto L2e
            fixPojavGLContext()     // Catch: java.lang.Exception -> L29
            goto L2e
        L29:
            r10 = move-exception
            r0 = r10
            r0.printStackTrace()
        L2e:
            r0 = r9
            java.lang.String r1 = "glGetError"
            long r0 = r0.getFunctionAddress(r1)
            r10 = r0
            r0 = r9
            java.lang.String r1 = "glGetString"
            long r0 = r0.getFunctionAddress(r1)
            r12 = r0
            r0 = r9
            java.lang.String r1 = "glGetIntegerv"
            long r0 = r0.getFunctionAddress(r1)
            r14 = r0
            r0 = r10
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5f
            r0 = r12
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L5f
            r0 = r14
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L69
        L5f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Core OpenGL functions could not be found. Make sure that the OpenGL library has been loaded correctly."
            r1.<init>(r2)
            throw r0
        L69:
            r0 = r10
            int r0 = org.lwjgl.system.JNI.callI(r0)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L88
            java.lang.String r0 = "An OpenGL context was in an error state before the creation of its capabilities instance. Error: 0x%X"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r16
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            org.lwjgl.system.APIUtil.apiLog(r0)
        L88:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r19 = r0
            r0 = 0
            r20 = r0
            r0 = r19
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r21 = r0
            r0 = 33307(0x821b, float:4.6673E-41)
            r1 = r21
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r2 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r0 = r10
            int r0 = org.lwjgl.system.JNI.callI(r0)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            if (r0 != 0) goto Lcf
            r0 = 3
            r1 = r21
            r2 = 0
            int r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r2 = r1
            r17 = r2
            if (r0 > r1) goto Lcf
            r0 = 33308(0x821c, float:4.6674E-41)
            r1 = r21
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r2 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r0 = r21
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r18 = r0
            goto L107
        Lcf:
            r0 = 7938(0x1f02, float:1.1124E-41)
            r1 = r12
            long r0 = org.lwjgl.system.JNI.callP(r0, r1)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memUTF8Safe(r0)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r22 = r0
            r0 = r22
            if (r0 == 0) goto Le8
            r0 = r10
            int r0 = org.lwjgl.system.JNI.callI(r0)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            if (r0 == 0) goto Lf2
        Le8:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r1 = r0
            java.lang.String r2 = "There is no OpenGL context current in the current thread."
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            throw r0     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
        Lf2:
            r0 = r22
            org.lwjgl.system.APIUtil$APIVersion r0 = org.lwjgl.system.APIUtil.apiParseVersion(r0)     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r23 = r0
            r0 = r23
            int r0 = r0.major     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r17 = r0
            r0 = r23
            int r0 = r0.minor     // Catch: java.lang.Throwable -> L12d java.lang.Throwable -> L136
            r18 = r0
        L107:
            r0 = r19
            if (r0 == 0) goto L15e
            r0 = r20
            if (r0 == 0) goto L125
            r0 = r19
            r0.close()     // Catch: java.lang.Throwable -> L119
            goto L15e
        L119:
            r21 = move-exception
            r0 = r20
            r1 = r21
            r0.addSuppressed(r1)
            goto L15e
        L125:
            r0 = r19
            r0.close()
            goto L15e
        L12d:
            r21 = move-exception
            r0 = r21
            r20 = r0
            r0 = r21
            throw r0     // Catch: java.lang.Throwable -> L136
        L136:
            r24 = move-exception
            r0 = r19
            if (r0 == 0) goto L15b
            r0 = r20
            if (r0 == 0) goto L156
            r0 = r19
            r0.close()     // Catch: java.lang.Throwable -> L14a
            goto L15b
        L14a:
            r25 = move-exception
            r0 = r20
            r1 = r25
            r0.addSuppressed(r1)
            goto L15b
        L156:
            r0 = r19
            r0.close()
        L15b:
            r0 = r24
            throw r0
        L15e:
            r0 = r17
            r1 = 1
            if (r0 < r1) goto L170
            r0 = r17
            r1 = 1
            if (r0 != r1) goto L17a
            r0 = r18
            r1 = 1
            if (r0 >= r1) goto L17a
        L170:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "OpenGL 1.1 is required."
            r1.<init>(r2)
            throw r0
        L17a:
            r0 = 4
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 5
            r1[r2] = r3
            r1 = r0
            r2 = 1
            r3 = 1
            r1[r2] = r3
            r1 = r0
            r2 = 2
            r3 = 3
            r1[r2] = r3
            r1 = r0
            r2 = 3
            r3 = 6
            r1[r2] = r3
            r19 = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 512(0x200, float:7.17E-43)
            r1.<init>(r2)
            r20 = r0
            r0 = r17
            r1 = r19
            int r1 = r1.length
            int r0 = java.lang.Math.min(r0, r1)
            r21 = r0
            org.lwjgl.system.APIUtil$APIVersion r0 = org.lwjgl.opengl.GL.MAX_VERSION
            if (r0 == 0) goto L1b9
            org.lwjgl.system.APIUtil$APIVersion r0 = org.lwjgl.opengl.GL.MAX_VERSION
            int r0 = r0.major
            r1 = r21
            int r0 = java.lang.Math.min(r0, r1)
            r21 = r0
        L1b9:
            r0 = 1
            r22 = r0
        L1bc:
            r0 = r22
            r1 = r21
            if (r0 > r1) goto L23b
            r0 = r19
            r1 = r22
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r23 = r0
            r0 = r22
            r1 = r17
            if (r0 != r1) goto L1dc
            r0 = r18
            r1 = r23
            int r0 = java.lang.Math.min(r0, r1)
            r23 = r0
        L1dc:
            org.lwjgl.system.APIUtil$APIVersion r0 = org.lwjgl.opengl.GL.MAX_VERSION
            if (r0 == 0) goto L1fa
            r0 = r22
            org.lwjgl.system.APIUtil$APIVersion r1 = org.lwjgl.opengl.GL.MAX_VERSION
            int r1 = r1.major
            if (r0 != r1) goto L1fa
            org.lwjgl.system.APIUtil$APIVersion r0 = org.lwjgl.opengl.GL.MAX_VERSION
            int r0 = r0.minor
            r1 = r23
            int r0 = java.lang.Math.min(r0, r1)
            r23 = r0
        L1fa:
            r0 = r22
            r1 = 1
            if (r0 != r1) goto L204
            r0 = 1
            goto L205
        L204:
            r0 = 0
        L205:
            r24 = r0
        L207:
            r0 = r24
            r1 = r23
            if (r0 > r1) goto L235
            r0 = r20
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "OpenGL"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r22
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r24
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
            int r24 = r24 + 1
            goto L207
        L235:
            int r22 = r22 + 1
            goto L1bc
        L23b:
            r0 = r17
            r1 = 3
            if (r0 >= r1) goto L279
            r0 = 7939(0x1f03, float:1.1125E-41)
            r1 = r12
            long r0 = org.lwjgl.system.JNI.callP(r0, r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            r22 = r0
            r0 = r22
            if (r0 == 0) goto L276
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r22
            r1.<init>(r2)
            r23 = r0
        L25e:
            r0 = r23
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L276
            r0 = r20
            r1 = r23
            java.lang.String r1 = r1.nextToken()
            boolean r0 = r0.add(r1)
            goto L25e
        L276:
            goto L383
        L279:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r22 = r0
            r0 = 0
            r23 = r0
            r0 = r22
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r24 = r0
            r0 = 33309(0x821d, float:4.6676E-41)
            r1 = r24
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r2 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r0 = r24
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r25 = r0
            r0 = r9
            java.lang.String r1 = "glGetStringi"
            long r0 = org.lwjgl.system.APIUtil.apiGetFunctionAddress(r0, r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r26 = r0
            r0 = 0
            r28 = r0
        L2a8:
            r0 = r28
            r1 = r25
            if (r0 >= r1) goto L2ca
            r0 = r20
            r1 = 7939(0x1f03, float:1.1125E-41)
            r2 = r28
            r3 = r26
            long r1 = org.lwjgl.system.JNI.callP(r1, r2, r3)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            java.lang.String r1 = org.lwjgl.system.MemoryUtil.memASCII(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            int r28 = r28 + 1
            goto L2a8
        L2ca:
            r0 = 33310(0x821e, float:4.6677E-41)
            r1 = r24
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r2 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r0 = r24
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L2e6
            r0 = 1
            r7 = r0
            goto L32c
        L2e6:
            r0 = 3
            r1 = r17
            if (r0 < r1) goto L2f2
            r0 = 1
            r1 = r18
            if (r0 > r1) goto L32c
        L2f2:
            r0 = 3
            r1 = r17
            if (r0 < r1) goto L2fe
            r0 = 2
            r1 = r18
            if (r0 > r1) goto L31a
        L2fe:
            r0 = 37158(0x9126, float:5.207E-41)
            r1 = r24
            long r1 = org.lwjgl.system.MemoryUtil.memAddress(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r2 = r14
            org.lwjgl.system.JNI.callPV(r0, r1, r2)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r0 = r24
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L32c
            r0 = 1
            r7 = r0
            goto L32c
        L31a:
            r0 = r20
            java.lang.String r1 = "GL_ARB_compatibility"
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L352 java.lang.Throwable -> L35b
            if (r0 != 0) goto L32a
            r0 = 1
            goto L32b
        L32a:
            r0 = 0
        L32b:
            r7 = r0
        L32c:
            r0 = r22
            if (r0 == 0) goto L383
            r0 = r23
            if (r0 == 0) goto L34a
            r0 = r22
            r0.close()     // Catch: java.lang.Throwable -> L33e
            goto L383
        L33e:
            r24 = move-exception
            r0 = r23
            r1 = r24
            r0.addSuppressed(r1)
            goto L383
        L34a:
            r0 = r22
            r0.close()
            goto L383
        L352:
            r24 = move-exception
            r0 = r24
            r23 = r0
            r0 = r24
            throw r0     // Catch: java.lang.Throwable -> L35b
        L35b:
            r29 = move-exception
            r0 = r22
            if (r0 == 0) goto L380
            r0 = r23
            if (r0 == 0) goto L37b
            r0 = r22
            r0.close()     // Catch: java.lang.Throwable -> L36f
            goto L380
        L36f:
            r30 = move-exception
            r0 = r23
            r1 = r30
            r0.addSuppressed(r1)
            goto L380
        L37b:
            r0 = r22
            r0.close()
        L380:
            r0 = r29
            throw r0
        L383:
            r0 = r20
            org.lwjgl.system.Configuration<java.lang.Object> r1 = org.lwjgl.system.Configuration.OPENGL_EXTENSION_FILTER
            org.lwjgl.system.APIUtil.apiFilterExtensions(r0, r1)
            org.lwjgl.opengl.GLCapabilities r0 = new org.lwjgl.opengl.GLCapabilities
            r1 = r0
            r2 = r9
            r3 = r20
            r4 = r7
            r5 = r8
            if (r5 != 0) goto L39f
            org.lwjgl.opengl.GLCapabilities r5 = org.lwjgl.BufferUtils::createPointerBuffer
            goto L3a0
        L39f:
            r5 = r8
        L3a0:
            r1.<init>(r2, r3, r4, r5)
            r22 = r0
            r0 = r22
            setCapabilities(r0)
            r0 = r22
            return r0
    }

    private static org.lwjgl.opengl.WGLCapabilities createCapabilitiesWGLDummy() {
            long r0 = org.lwjgl.opengl.WGL.wglGetCurrentDC()
            r19 = r0
            r0 = r19
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto Lf
            r0 = r19
            org.lwjgl.opengl.WGLCapabilities r0 = createCapabilitiesWGL(r0)
            return r0
        Lf:
            r0 = 0
            r21 = r0
            r0 = 0
            r22 = r0
            r0 = 0
            r24 = r0
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()     // Catch: java.lang.Throwable -> L167
            r26 = r0
            r0 = 0
            r27 = r0
            r0 = r26
            org.lwjgl.system.windows.WNDCLASSEX r0 = org.lwjgl.system.windows.WNDCLASSEX.calloc(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.SIZEOF     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.cbSize(r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r1 = 3
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.style(r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            long r1 = org.lwjgl.system.windows.WindowsLibrary.HINSTANCE     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.hInstance(r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r1 = r26
            java.lang.String r2 = "WGL"
            java.nio.ByteBuffer r1 = r1.UTF16(r2)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            org.lwjgl.system.windows.WNDCLASSEX r0 = r0.lpszClassName(r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r28 = r0
            r0 = r28
            long r0 = r0.address()     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            int r1 = org.lwjgl.system.windows.WNDCLASSEX.LPFNWNDPROC     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            long r0 = r0 + r1
            long r1 = org.lwjgl.system.windows.User32.Functions.DefWindowProc     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            org.lwjgl.system.MemoryUtil.memPutAddress(r0, r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r0 = r28
            short r0 = org.lwjgl.system.windows.User32.RegisterClassEx(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r21 = r0
            r0 = r21
            if (r0 != 0) goto L63
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r1 = r0
            java.lang.String r2 = "Failed to register WGL window class"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            throw r0     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
        L63:
            r0 = 0
            r1 = r21
            r2 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r2
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r2 = 0
            r3 = 114229248(0x6cf0000, float:7.7864746E-35)
            r4 = 0
            r5 = 0
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            long r0 = org.lwjgl.system.windows.User32.nCreateWindowEx(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            long r0 = org.lwjgl.system.Checks.check(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r22 = r0
            r0 = r22
            long r0 = org.lwjgl.system.windows.User32.GetDC(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            long r0 = org.lwjgl.system.Checks.check(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r19 = r0
            r0 = r26
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.calloc(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            int r1 = org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR.SIZEOF     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            short r1 = (short) r1     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.nSize(r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r1 = 1
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.nVersion(r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r1 = 32
            org.lwjgl.system.windows.PIXELFORMATDESCRIPTOR r0 = r0.dwFlags(r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r29 = r0
            r0 = r19
            r1 = r29
            int r0 = org.lwjgl.system.windows.GDI32.ChoosePixelFormat(r0, r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r30 = r0
            r0 = r30
            if (r0 != 0) goto Lac
            java.lang.String r0 = "Failed to choose an OpenGL-compatible pixel format"
            org.lwjgl.system.windows.WindowsUtil.windowsThrowException(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
        Lac:
            r0 = r19
            r1 = r30
            r2 = r29
            int r0 = org.lwjgl.system.windows.GDI32.DescribePixelFormat(r0, r1, r2)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            if (r0 != 0) goto Lbc
            java.lang.String r0 = "Failed to obtain pixel format information"
            org.lwjgl.system.windows.WindowsUtil.windowsThrowException(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
        Lbc:
            r0 = r19
            r1 = r30
            r2 = r29
            boolean r0 = org.lwjgl.system.windows.GDI32.SetPixelFormat(r0, r1, r2)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            if (r0 != 0) goto Lcc
            java.lang.String r0 = "Failed to set the pixel format"
            org.lwjgl.system.windows.WindowsUtil.windowsThrowException(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
        Lcc:
            r0 = r19
            long r0 = org.lwjgl.opengl.WGL.wglCreateContext(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            long r0 = org.lwjgl.system.Checks.check(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r24 = r0
            r0 = r19
            r1 = r24
            boolean r0 = org.lwjgl.opengl.WGL.wglMakeCurrent(r0, r1)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r0 = r19
            org.lwjgl.opengl.WGLCapabilities r0 = createCapabilitiesWGL(r0)     // Catch: java.lang.Throwable -> L136 java.lang.Throwable -> L13f java.lang.Throwable -> L167
            r31 = r0
            r0 = r26
            if (r0 == 0) goto L105
            r0 = r27
            if (r0 == 0) goto L100
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> Lf4 java.lang.Throwable -> L167
            goto L105
        Lf4:
            r32 = move-exception
            r0 = r27
            r1 = r32
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L167
            goto L105
        L100:
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L167
        L105:
            r0 = r24
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L118
            r0 = 0
            r1 = 0
            boolean r0 = org.lwjgl.opengl.WGL.wglMakeCurrent(r0, r1)
            r0 = r24
            boolean r0 = org.lwjgl.opengl.WGL.wglDeleteContext(r0)
        L118:
            r0 = r22
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L123
            r0 = r22
            boolean r0 = org.lwjgl.system.windows.User32.DestroyWindow(r0)
        L123:
            r0 = r21
            if (r0 == 0) goto L133
            r0 = r21
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            long r0 = (long) r0
            long r1 = org.lwjgl.system.windows.WindowsLibrary.HINSTANCE
            int r0 = org.lwjgl.system.windows.User32.nUnregisterClass(r0, r1)
        L133:
            r0 = r31
            return r0
        L136:
            r28 = move-exception
            r0 = r28
            r27 = r0
            r0 = r28
            throw r0     // Catch: java.lang.Throwable -> L13f java.lang.Throwable -> L167
        L13f:
            r33 = move-exception
            r0 = r26
            if (r0 == 0) goto L164
            r0 = r27
            if (r0 == 0) goto L15f
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L153 java.lang.Throwable -> L167
            goto L164
        L153:
            r34 = move-exception
            r0 = r27
            r1 = r34
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L167
            goto L164
        L15f:
            r0 = r26
            r0.close()     // Catch: java.lang.Throwable -> L167
        L164:
            r0 = r33
            throw r0     // Catch: java.lang.Throwable -> L167
        L167:
            r35 = move-exception
            r0 = r24
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L17c
            r0 = 0
            r1 = 0
            boolean r0 = org.lwjgl.opengl.WGL.wglMakeCurrent(r0, r1)
            r0 = r24
            boolean r0 = org.lwjgl.opengl.WGL.wglDeleteContext(r0)
        L17c:
            r0 = r22
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L187
            r0 = r22
            boolean r0 = org.lwjgl.system.windows.User32.DestroyWindow(r0)
        L187:
            r0 = r21
            if (r0 == 0) goto L197
            r0 = r21
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            long r0 = (long) r0
            long r1 = org.lwjgl.system.windows.WindowsLibrary.HINSTANCE
            int r0 = org.lwjgl.system.windows.User32.nUnregisterClass(r0, r1)
        L197:
            r0 = r35
            throw r0
    }

    public static org.lwjgl.opengl.WGLCapabilities createCapabilitiesWGL() {
            long r0 = org.lwjgl.opengl.WGL.wglGetCurrentDC()
            r5 = r0
            r0 = r5
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L14
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "Failed to retrieve the device context of the current OpenGL context"
            r1.<init>(r2)
            throw r0
        L14:
            r0 = r5
            org.lwjgl.opengl.WGLCapabilities r0 = createCapabilitiesWGL(r0)
            return r0
    }

    private static org.lwjgl.opengl.WGLCapabilities createCapabilitiesWGL(long r5) {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            r7 = r0
            r0 = r7
            if (r0 != 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "OpenGL library has not been loaded."
            r1.<init>(r2)
            throw r0
        L12:
            r0 = 0
            r8 = r0
            r0 = r7
            java.lang.String r1 = "wglGetExtensionsStringARB"
            long r0 = r0.getFunctionAddress(r1)
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L32
            r0 = r5
            r1 = r9
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            r8 = r0
            goto L4c
        L32:
            r0 = r7
            java.lang.String r1 = "wglGetExtensionsStringEXT"
            long r0 = r0.getFunctionAddress(r1)
            r9 = r0
            r0 = r9
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L4c
            r0 = r9
            long r0 = org.lwjgl.system.JNI.callP(r0)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCII(r0)
            r8 = r0
        L4c:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 32
            r1.<init>(r2)
            r11 = r0
            r0 = r8
            if (r0 == 0) goto L7d
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r8
            r1.<init>(r2)
            r12 = r0
        L65:
            r0 = r12
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L7d
            r0 = r11
            r1 = r12
            java.lang.String r1 = r1.nextToken()
            boolean r0 = r0.add(r1)
            goto L65
        L7d:
            r0 = r11
            org.lwjgl.system.Configuration<java.lang.Object> r1 = org.lwjgl.system.Configuration.OPENGL_EXTENSION_FILTER
            org.lwjgl.system.APIUtil.apiFilterExtensions(r0, r1)
            org.lwjgl.opengl.WGLCapabilities r0 = new org.lwjgl.opengl.WGLCapabilities
            r1 = r0
            r2 = r7
            r3 = r11
            r1.<init>(r2, r3)
            return r0
    }

    public static org.lwjgl.opengl.GLXCapabilities createCapabilitiesGLX(long r5) {
            r0 = r5
            r1 = r5
            int r1 = org.lwjgl.system.linux.X11.XDefaultScreen(r1)
            org.lwjgl.opengl.GLXCapabilities r0 = createCapabilitiesGLX(r0, r1)
            return r0
    }

    public static org.lwjgl.opengl.GLXCapabilities createCapabilitiesGLX(long r8, int r10) {
            org.lwjgl.system.FunctionProvider r0 = org.lwjgl.opengl.GL.functionProvider
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L12
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "OpenGL library has not been loaded."
            r1.<init>(r2)
            throw r0
        L12:
            org.lwjgl.system.MemoryStack r0 = org.lwjgl.system.MemoryStack.stackPush()
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r14
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r16 = r0
            r0 = r14
            r1 = 0
            java.nio.IntBuffer r0 = r0.ints(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r17 = r0
            r0 = r8
            r1 = r16
            r2 = r17
            boolean r0 = org.lwjgl.opengl.GLX11.glXQueryVersion(r0, r1, r2)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            if (r0 != 0) goto L3f
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r1 = r0
            java.lang.String r2 = "Failed to query GLX version"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
        L3f:
            r0 = r16
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r12 = r0
            r0 = r17
            r1 = 0
            int r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r13 = r0
            r0 = r12
            r1 = 1
            if (r0 == r1) goto L71
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r3 = r2
            r3.<init>()     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            java.lang.String r3 = "Invalid GLX major version: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r3 = r12
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
            throw r0     // Catch: java.lang.Throwable -> L97 java.lang.Throwable -> La0
        L71:
            r0 = r14
            if (r0 == 0) goto Lc8
            r0 = r15
            if (r0 == 0) goto L8f
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> L83
            goto Lc8
        L83:
            r16 = move-exception
            r0 = r15
            r1 = r16
            r0.addSuppressed(r1)
            goto Lc8
        L8f:
            r0 = r14
            r0.close()
            goto Lc8
        L97:
            r16 = move-exception
            r0 = r16
            r15 = r0
            r0 = r16
            throw r0     // Catch: java.lang.Throwable -> La0
        La0:
            r18 = move-exception
            r0 = r14
            if (r0 == 0) goto Lc5
            r0 = r15
            if (r0 == 0) goto Lc0
            r0 = r14
            r0.close()     // Catch: java.lang.Throwable -> Lb4
            goto Lc5
        Lb4:
            r19 = move-exception
            r0 = r15
            r1 = r19
            r0.addSuppressed(r1)
            goto Lc5
        Lc0:
            r0 = r14
            r0.close()
        Lc5:
            r0 = r18
            throw r0
        Lc8:
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 32
            r1.<init>(r2)
            r14 = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = r0
            r2 = 0
            r3 = 4
            int[] r3 = new int[r3]
            r4 = r3
            r5 = 0
            r6 = 1
            r4[r5] = r6
            r4 = r3
            r5 = 1
            r6 = 2
            r4[r5] = r6
            r4 = r3
            r5 = 2
            r6 = 3
            r4[r5] = r6
            r4 = r3
            r5 = 3
            r6 = 4
            r4[r5] = r6
            r1[r2] = r3
            r15 = r0
            r0 = 1
            r16 = r0
        Lf2:
            r0 = r16
            r1 = r15
            int r1 = r1.length
            if (r0 > r1) goto L15f
            r0 = r15
            r1 = r16
            r2 = 1
            int r1 = r1 - r2
            r0 = r0[r1]
            r17 = r0
            r0 = r17
            r18 = r0
            r0 = r18
            int r0 = r0.length
            r19 = r0
            r0 = 0
            r20 = r0
        L10f:
            r0 = r20
            r1 = r19
            if (r0 >= r1) goto L159
            r0 = r18
            r1 = r20
            r0 = r0[r1]
            r21 = r0
            r0 = r16
            r1 = r12
            if (r0 < r1) goto L132
            r0 = r16
            r1 = r12
            if (r0 != r1) goto L153
            r0 = r21
            r1 = r13
            if (r0 > r1) goto L153
        L132:
            r0 = r14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "GLX"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r16
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r21
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.add(r1)
        L153:
            int r20 = r20 + 1
            goto L10f
        L159:
            int r16 = r16 + 1
            goto Lf2
        L15f:
            r0 = 1
            r1 = r13
            if (r0 > r1) goto L1c1
            r0 = r10
            r1 = -1
            if (r0 != r1) goto L183
            r0 = r11
            java.lang.String r1 = "glXGetClientString"
            long r0 = r0.getFunctionAddress(r1)
            r17 = r0
            r0 = r8
            r1 = 3
            r2 = r17
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1, r2)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            r16 = r0
            goto L199
        L183:
            r0 = r11
            java.lang.String r1 = "glXQueryExtensionsString"
            long r0 = r0.getFunctionAddress(r1)
            r17 = r0
            r0 = r8
            r1 = r10
            r2 = r17
            long r0 = org.lwjgl.system.JNI.callPP(r0, r1, r2)
            java.lang.String r0 = org.lwjgl.system.MemoryUtil.memASCIISafe(r0)
            r16 = r0
        L199:
            r0 = r16
            if (r0 == 0) goto L1c1
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            r1 = r0
            r2 = r16
            r1.<init>(r2)
            r17 = r0
        L1a9:
            r0 = r17
            boolean r0 = r0.hasMoreTokens()
            if (r0 == 0) goto L1c1
            r0 = r14
            r1 = r17
            java.lang.String r1 = r1.nextToken()
            boolean r0 = r0.add(r1)
            goto L1a9
        L1c1:
            r0 = r14
            org.lwjgl.system.Configuration<java.lang.Object> r1 = org.lwjgl.system.Configuration.OPENGL_EXTENSION_FILTER
            org.lwjgl.system.APIUtil.apiFilterExtensions(r0, r1)
            org.lwjgl.opengl.GLXCapabilities r0 = new org.lwjgl.opengl.GLXCapabilities
            r1 = r0
            r2 = r11
            r3 = r14
            r1.<init>(r2, r3)
            return r0
    }

    static org.lwjgl.opengl.GLCapabilities getICD() {
            org.lwjgl.opengl.GL$ICD r0 = org.lwjgl.opengl.GL.icd
            org.lwjgl.opengl.GLCapabilities r0 = r0.get()
            org.lwjgl.opengl.GLCapabilities r0 = checkCapabilities(r0)
            return r0
    }

    static /* synthetic */ org.lwjgl.opengl.GL.ICD access$102(org.lwjgl.opengl.GL.ICD r3) {
            r0 = r3
            r1 = r0
            org.lwjgl.opengl.GL.icd = r1
            return r0
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r1 = r0
            r1.<init>()
            org.lwjgl.opengl.GL.capabilitiesTLS = r0
            org.lwjgl.opengl.GL$ICDStatic r0 = new org.lwjgl.opengl.GL$ICDStatic
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            org.lwjgl.opengl.GL.icd = r0
            void r0 = java.lang.System::load
            void r1 = java.lang.System::loadLibrary
            java.lang.Class<org.lwjgl.opengl.GL> r2 = org.lwjgl.opengl.GL.class
            java.lang.String r3 = "org.lwjgl.opengl"
            java.lang.String r4 = "lwjgl_opengl"
            java.lang.String r4 = org.lwjgl.system.Platform.mapLibraryNameBundled(r4)
            org.lwjgl.system.Library.loadSystem(r0, r1, r2, r3, r4)
            org.lwjgl.system.Configuration<java.lang.Object> r0 = org.lwjgl.system.Configuration.OPENGL_MAXVERSION
            org.lwjgl.system.APIUtil$APIVersion r0 = org.lwjgl.system.APIUtil.apiParseVersion(r0)
            org.lwjgl.opengl.GL.MAX_VERSION = r0
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.OPENGL_EXPLICIT_INIT
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L4a
            create()
        L4a:
            return
    }
}
