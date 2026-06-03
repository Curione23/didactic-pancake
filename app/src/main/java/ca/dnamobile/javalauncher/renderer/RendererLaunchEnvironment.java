package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class RendererLaunchEnvironment {
    private static final java.lang.String TAG = "RendererLaunchEnvironment";

    private RendererLaunchEnvironment() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void appendPath(java.lang.StringBuilder r0, java.io.File r1) {
            if (r1 != 0) goto L3
            return
        L3:
            java.lang.String r1 = r1.getAbsolutePath()
            appendRaw(r0, r1)
            return
    }

    private static void appendRaw(java.lang.StringBuilder r1, java.lang.String r2) {
            if (r2 == 0) goto L1f
            java.lang.String r0 = r2.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L1f
        Ld:
            int r0 = r1.length()
            if (r0 <= 0) goto L18
            r0 = 58
            r1.append(r0)
        L18:
            java.lang.String r2 = r2.trim()
            r1.append(r2)
        L1f:
            return
    }

    public static void applyBeforeJvmLaunch(android.content.Context r8, ca.dnamobile.javalauncher.launcher.LaunchPlan r9, ca.dnamobile.javalauncher.renderer.RendererInterface r10) {
            java.lang.String r0 = "RendererLaunchEnvironment"
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r8)
            java.util.Map r1 = r10.getRendererEnv()
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            setEnv(r3, r2)
            goto L11
        L2d:
            boolean r1 = isLtwRenderer(r10)
            if (r1 != 0) goto L34
            return
        L34:
            java.lang.String r1 = "libltw.so"
            java.io.File r10 = resolveRendererLibrary(r8, r10, r1)
            if (r10 == 0) goto L47
            boolean r2 = r10.isFile()
            if (r2 == 0) goto L47
            java.io.File r2 = r10.getParentFile()
            goto L48
        L47:
            r2 = 0
        L48:
            java.io.File r3 = resolveAppNativeDir(r8)
            java.io.File r9 = r9.getRuntimeDirectory()
            int r4 = org.lwjgl.glfw.CallbackBridge.windowWidth
            r5 = 1
            int r4 = java.lang.Math.max(r5, r4)
            int r6 = org.lwjgl.glfw.CallbackBridge.windowHeight
            int r5 = java.lang.Math.max(r5, r6)
            java.lang.String r6 = "POJAV_RENDERER"
            java.lang.String r7 = "opengles3_ltw"
            setEnv(r6, r7)
            java.lang.String r6 = "LIBGL_ES"
            java.lang.String r7 = "3"
            setEnv(r6, r7)
            java.lang.String r6 = "POJAVEXEC_EGL"
            setEnv(r6, r1)
            java.lang.String r6 = "POJAV_EGL_LIBRARY"
            setEnv(r6, r1)
            java.lang.String r6 = "POJAVEXEC_EGL_LIBRARY"
            setEnv(r6, r1)
            java.lang.String r6 = "POJAV_RENDERER_LIBRARY"
            setEnv(r6, r1)
            java.lang.String r6 = "POJAVEXEC_RENDERER"
            setEnv(r6, r1)
            if (r2 == 0) goto L8b
            java.lang.String r1 = r2.getAbsolutePath()
            goto L8f
        L8b:
            java.lang.String r1 = r3.getAbsolutePath()
        L8f:
            java.lang.String r6 = "DRIVER_PATH"
            setEnv(r6, r1)
            java.lang.String r1 = "POJAV_NATIVEDIR"
            java.lang.String r6 = r3.getAbsolutePath()
            setEnv(r1, r6)
            java.io.File r1 = r8.getCacheDir()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r6 = "TMPDIR"
            setEnv(r6, r1)
            java.lang.String r1 = "JAVA_HOME"
            java.lang.String r6 = r9.getAbsolutePath()
            setEnv(r1, r6)
            java.lang.String r1 = "AWTSTUB_WIDTH"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            setEnv(r1, r4)
            java.lang.String r1 = "AWTSTUB_HEIGHT"
            java.lang.String r4 = java.lang.String.valueOf(r5)
            setEnv(r1, r4)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            if (r1 == 0) goto Ld4
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_FILE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r4 = "HOME"
            setEnv(r4, r1)
        Ld4:
            java.lang.String r8 = buildLdLibraryPath(r8, r9, r3, r2)
            java.lang.String r9 = "LD_LIBRARY_PATH"
            setEnv(r9, r8)
            net.kdt.pojavlaunch.utils.JREUtils.setLdLibraryPath(r8)     // Catch: java.lang.Throwable -> Lf7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf7
            r9.<init>()     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r1 = "Native LD_LIBRARY_PATH set for LTW: "
            java.lang.StringBuilder r9 = r9.append(r1)     // Catch: java.lang.Throwable -> Lf7
            java.lang.StringBuilder r8 = r9.append(r8)     // Catch: java.lang.Throwable -> Lf7
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lf7
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r8)     // Catch: java.lang.Throwable -> Lf7
            goto Lfd
        Lf7:
            r8 = move-exception
            java.lang.String r9 = "JREUtils.setLdLibraryPath failed for LTW"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r9, r8)
        Lfd:
            if (r10 == 0) goto L12d
            boolean r8 = r10.isFile()
            if (r8 == 0) goto L12d
            java.lang.String r8 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L127
            net.kdt.pojavlaunch.utils.JREUtils.dlopen(r8)     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L127
            r8.<init>()     // Catch: java.lang.Throwable -> L127
            java.lang.String r9 = "LTW dlopen requested: "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L127
            java.lang.String r9 = r10.getAbsolutePath()     // Catch: java.lang.Throwable -> L127
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L127
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L127
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r8)     // Catch: java.lang.Throwable -> L127
            goto L12d
        L127:
            r8 = move-exception
            java.lang.String r9 = "LTW dlopen failed; launch will continue"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r9, r8)
        L12d:
            return
    }

    public static void applyEarlyBridgeEnvironment(android.content.Context r3, ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            int r0 = org.lwjgl.glfw.CallbackBridge.windowWidth
            r1 = 1
            int r0 = java.lang.Math.max(r1, r0)
            int r2 = org.lwjgl.glfw.CallbackBridge.windowHeight
            int r1 = java.lang.Math.max(r1, r2)
            applyEarlyBridgeEnvironment(r3, r4, r0, r1)
            return
    }

    public static void applyEarlyBridgeEnvironment(android.content.Context r5, ca.dnamobile.javalauncher.renderer.RendererInterface r6, int r7, int r8) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r5)
            java.util.Map r0 = r6.getRendererEnv()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            setEnv(r2, r1)
            goto Lf
        L2b:
            boolean r0 = isLtwRenderer(r6)
            if (r0 != 0) goto L32
            return
        L32:
            java.lang.String r0 = "libltw.so"
            java.io.File r6 = resolveRendererLibrary(r5, r6, r0)
            if (r6 == 0) goto L45
            boolean r1 = r6.isFile()
            if (r1 == 0) goto L45
            java.io.File r1 = r6.getParentFile()
            goto L46
        L45:
            r1 = 0
        L46:
            java.io.File r2 = resolveAppNativeDir(r5)
            java.lang.String r3 = "POJAV_RENDERER"
            java.lang.String r4 = "opengles3_ltw"
            setEnv(r3, r4)
            java.lang.String r3 = "LIBGL_ES"
            java.lang.String r4 = "3"
            setEnv(r3, r4)
            java.lang.String r3 = "POJAVEXEC_EGL"
            setEnv(r3, r0)
            java.lang.String r3 = "POJAV_EGL_LIBRARY"
            setEnv(r3, r0)
            java.lang.String r3 = "POJAVEXEC_EGL_LIBRARY"
            setEnv(r3, r0)
            java.lang.String r3 = "POJAV_RENDERER_LIBRARY"
            setEnv(r3, r0)
            java.lang.String r3 = "POJAVEXEC_RENDERER"
            setEnv(r3, r0)
            if (r1 == 0) goto L78
            java.lang.String r0 = r1.getAbsolutePath()
            goto L7c
        L78:
            java.lang.String r0 = r2.getAbsolutePath()
        L7c:
            java.lang.String r1 = "DRIVER_PATH"
            setEnv(r1, r0)
            java.lang.String r0 = "POJAV_NATIVEDIR"
            java.lang.String r1 = r2.getAbsolutePath()
            setEnv(r0, r1)
            java.io.File r5 = r5.getCacheDir()
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r0 = "TMPDIR"
            setEnv(r0, r5)
            r5 = 1
            int r7 = java.lang.Math.max(r5, r7)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "AWTSTUB_WIDTH"
            setEnv(r0, r7)
            int r5 = java.lang.Math.max(r5, r8)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r7 = "AWTSTUB_HEIGHT"
            setEnv(r7, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Early LTW bridge env applied. lib="
            r5.<init>(r7)
            if (r6 == 0) goto Lc0
            java.lang.String r6 = r6.getAbsolutePath()
            goto Lc2
        Lc0:
            java.lang.String r6 = "<missing>"
        Lc2:
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = " appNativeDir="
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = r2.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "RendererLaunchEnvironment"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
            return
    }

    private static java.lang.String buildLdLibraryPath(android.content.Context r2, java.io.File r3, java.io.File r4, java.io.File r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            appendPath(r0, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r1 = "lib/jli"
            r5.<init>(r3, r1)
            appendPath(r0, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r1 = "lib"
            r5.<init>(r3, r1)
            appendPath(r0, r5)
            java.io.File r5 = new java.io.File
            java.lang.String r1 = "lib/server"
            r5.<init>(r3, r1)
            appendPath(r0, r5)
            java.lang.String r3 = "/system/lib64"
            appendRaw(r0, r3)
            java.lang.String r3 = "/vendor/lib64"
            appendRaw(r0, r3)
            java.lang.String r3 = "/vendor/lib64/hw"
            appendRaw(r0, r3)
            java.io.File r3 = new java.io.File
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.dataDir
            java.lang.String r5 = "app_runtime_mod"
            r3.<init>(r2, r5)
            appendPath(r0, r3)
            appendPath(r0, r4)
            java.lang.String r2 = "LD_LIBRARY_PATH"
            java.lang.String r2 = java.lang.System.getenv(r2)
            if (r2 == 0) goto L5d
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L5d
            appendRaw(r0, r2)
        L5d:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static boolean isLtwRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getRendererName()
            java.lang.String r2 = safe(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererId()
            java.lang.String r3 = safe(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getUniqueIdentifier()
            java.lang.String r3 = safe(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererLibrary()
            java.lang.String r3 = safe(r3)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererEGL()
            java.lang.String r4 = safe(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "ltw"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = "libltw.so"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L72
        L71:
            r0 = 1
        L72:
            return r0
    }

    public static void patchJvmArgsForRenderer(android.content.Context r3, ca.dnamobile.javalauncher.renderer.RendererInterface r4, java.util.List<java.lang.String> r5) {
            boolean r0 = isLtwRenderer(r4)
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r0 = "libltw.so"
            java.io.File r3 = resolveRendererLibrary(r3, r4, r0)
            java.lang.String r4 = "RendererLaunchEnvironment"
            if (r3 == 0) goto L5d
            boolean r0 = r3.isFile()
            if (r0 != 0) goto L18
            goto L5d
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-Dorg.lwjgl.opengl.libname="
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            java.util.Iterator r0 = r5.iterator()
        L2f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L47
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L2f
            boolean r2 = r2.startsWith(r1)
            if (r2 == 0) goto L2f
            r0.remove()
            goto L2f
        L47:
            r5.add(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "LTW JVM arg patched: "
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
        L5d:
            java.lang.String r3 = "LTW libltw.so could not be resolved; keeping existing JVM args."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
    }

    private static java.io.File resolveAppNativeDir(android.content.Context r2) {
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            if (r0 == 0) goto Ld
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            java.lang.String r0 = r0.nativeLibraryDir
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L20
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L20
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            return r2
        L20:
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r0 == 0) goto L34
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L34
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            return r2
        L34:
            java.io.File r0 = new java.io.File
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r1 = "lib"
            r0.<init>(r2, r1)
            return r0
    }

    private static java.io.File resolveRendererLibrary(android.content.Context r2, ca.dnamobile.javalauncher.renderer.RendererInterface r3, java.lang.String r4) {
            java.lang.String r3 = r3.getRendererLibrary()
            if (r3 == 0) goto L3a
            java.lang.String r0 = r3.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L3a
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.trim()
            r0.<init>(r3)
            boolean r3 = r0.isAbsolute()
            if (r3 == 0) goto L26
            boolean r3 = r0.isFile()
            if (r3 == 0) goto L26
            return r0
        L26:
            java.io.File r3 = new java.io.File
            java.io.File r1 = resolveAppNativeDir(r2)
            java.lang.String r0 = r0.getName()
            r3.<init>(r1, r0)
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L3a
            return r3
        L3a:
            java.io.File r3 = new java.io.File
            java.io.File r2 = resolveAppNativeDir(r2)
            r3.<init>(r2, r4)
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L4a
            return r3
        L4a:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r2 == 0) goto L64
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L64
            java.io.File r3 = new java.io.File
            r3.<init>(r2, r4)
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L64
            return r3
        L64:
            r2 = 0
            return r2
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L4
            java.lang.String r0 = ""
        L4:
            return r0
    }

    private static void setEnv(java.lang.String r3, java.lang.String r4) {
            java.lang.String r0 = "RendererLaunchEnvironment"
            java.lang.String r1 = "Added custom env: "
            if (r4 != 0) goto L7
            return
        L7:
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L11
            android.system.Os.unsetenv(r3)     // Catch: java.lang.Throwable -> L30
            goto L43
        L11:
            r2 = 1
            android.system.Os.setenv(r3, r4, r2)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L30
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r1 = r2.append(r3)     // Catch: java.lang.Throwable -> L30
            java.lang.String r2 = "="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L30
            java.lang.StringBuilder r4 = r1.append(r4)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L30
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r4)     // Catch: java.lang.Throwable -> L30
            goto L43
        L30:
            r4 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to set env "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r3, r4)
        L43:
            return
    }
}
