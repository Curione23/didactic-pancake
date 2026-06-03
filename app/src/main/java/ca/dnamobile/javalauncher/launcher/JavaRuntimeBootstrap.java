package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class JavaRuntimeBootstrap {
    private static final java.lang.String TAG = "JavaRuntimeBootstrap";

    public static final class RuntimePaths {
        public final java.io.File jvmLibraryDir;
        public final java.lang.String ldLibraryPath;
        public final java.lang.String nativeLinkerPath;
        public final java.io.File runtimeHome;
        public final java.io.File runtimeLibDir;

        private RuntimePaths(java.io.File r1, java.io.File r2, java.io.File r3, java.lang.String r4, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.runtimeHome = r1
                r0.runtimeLibDir = r2
                r0.jvmLibraryDir = r3
                r0.ldLibraryPath = r4
                r0.nativeLinkerPath = r5
                return
        }

        private static void addArchCandidate(java.util.List<java.lang.String> r4, java.lang.String r5) {
                if (r5 == 0) goto L2f
                java.lang.String r0 = r5.trim()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto Ld
                goto L2f
            Ld:
                java.lang.String r0 = "/"
                java.lang.String[] r5 = r5.split(r0)
                int r0 = r5.length
                r1 = 0
            L15:
                if (r1 >= r0) goto L2f
                r2 = r5[r1]
                java.lang.String r3 = r2.trim()
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L2c
                boolean r3 = r4.contains(r2)
                if (r3 != 0) goto L2c
                r4.add(r2)
            L2c:
                int r1 = r1 + 1
                goto L15
            L2f:
                return
        }

        private static void addPath(java.util.List<java.lang.String> r1, java.io.File r2) {
                boolean r0 = r2.exists()
                if (r0 != 0) goto L7
                return
            L7:
                java.lang.String r2 = r2.getAbsolutePath()
                boolean r0 = r1.contains(r2)
                if (r0 != 0) goto L14
                r1.add(r2)
            L14:
                return
        }

        private static void addSystemVendorPaths(java.util.List<java.lang.String> r3) {
                boolean r0 = is64BitDevice()
                if (r0 == 0) goto L9
                java.lang.String r0 = "lib64"
                goto Lb
            L9:
                java.lang.String r0 = "lib"
            Lb:
                java.lang.String r1 = "/system/"
                java.lang.String r1 = r1.concat(r0)
                r3.add(r1)
                java.lang.String r1 = "/vendor/"
                java.lang.String r2 = r1.concat(r0)
                r3.add(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.StringBuilder r0 = r2.append(r0)
                java.lang.String r1 = "/hw"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.add(r0)
                return
        }

        private static java.util.List<java.lang.String> getRuntimeArchCandidates() {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
                java.lang.String r1 = net.kdt.pojavlaunch.Architecture.archAsString(r1)
                addArchCandidate(r0, r1)
                int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
                r3 = 1
                java.lang.String r4 = "arm64"
                java.lang.String r5 = "aarch64"
                if (r2 == r3) goto L7a
                boolean r2 = r1.contains(r4)
                if (r2 != 0) goto L7a
                boolean r2 = r1.contains(r5)
                if (r2 == 0) goto L28
                goto L7a
            L28:
                int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
                java.lang.String r3 = "arm"
                if (r2 == 0) goto L71
                boolean r2 = r1.contains(r3)
                if (r2 == 0) goto L37
                goto L71
            L37:
                int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
                r3 = 2
                if (r2 != r3) goto L53
                java.lang.String r1 = "i386"
                addArchCandidate(r0, r1)
                java.lang.String r1 = "i486"
                addArchCandidate(r0, r1)
                java.lang.String r1 = "i586"
                addArchCandidate(r0, r1)
                java.lang.String r1 = "x86"
                addArchCandidate(r0, r1)
                goto L85
            L53:
                int r2 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
                r3 = 3
                java.lang.String r4 = "x86_64"
                java.lang.String r5 = "amd64"
                if (r2 == r3) goto L6a
                boolean r2 = r1.contains(r4)
                if (r2 != 0) goto L6a
                boolean r1 = r1.contains(r5)
                if (r1 == 0) goto L85
            L6a:
                addArchCandidate(r0, r5)
                addArchCandidate(r0, r4)
                goto L85
            L71:
                addArchCandidate(r0, r3)
                java.lang.String r1 = "armeabi-v7a"
                addArchCandidate(r0, r1)
                goto L85
            L7a:
                addArchCandidate(r0, r5)
                addArchCandidate(r0, r4)
                java.lang.String r1 = "arm64-v8a"
                addArchCandidate(r0, r1)
            L85:
                return r0
        }

        private static boolean is64BitDevice() {
                java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
                if (r0 == 0) goto Lb
                java.lang.String[] r0 = android.os.Build.SUPPORTED_64_BIT_ABIS
                int r0 = r0.length
                if (r0 <= 0) goto Lb
                r0 = 1
                goto Lc
            Lb:
                r0 = 0
            Lc:
                return r0
        }

        private static java.lang.String joinPathList(java.util.List<java.lang.String> r3) {
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.util.Iterator r3 = r3.iterator()
            L9:
                boolean r1 = r3.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r3.next()
                java.lang.String r1 = (java.lang.String) r1
                if (r1 == 0) goto L9
                java.lang.String r2 = r1.trim()
                boolean r2 = r2.isEmpty()
                if (r2 == 0) goto L22
                goto L9
            L22:
                int r2 = r0.length()
                if (r2 <= 0) goto L2d
                r2 = 58
                r0.append(r2)
            L2d:
                r0.append(r1)
                goto L9
            L31:
                java.lang.String r3 = r0.toString()
                return r3
        }

        static ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths resolve(android.content.Context r6, ca.dnamobile.javalauncher.launcher.LaunchPlan r7, ca.dnamobile.javalauncher.renderer.RendererInterface r8, ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result r9, ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.Result r10) {
                java.io.File r1 = r7.getRuntimeDirectory()
                java.io.File r2 = resolveRuntimeLibDir(r1)
                java.io.File r0 = new java.io.File
                java.lang.String r3 = "server/libjvm.so"
                r0.<init>(r2, r3)
                boolean r0 = r0.isFile()
                if (r0 == 0) goto L1d
                java.io.File r0 = new java.io.File
                java.lang.String r3 = "server"
                r0.<init>(r2, r3)
                goto L24
            L1d:
                java.io.File r0 = new java.io.File
                java.lang.String r3 = "client"
                r0.<init>(r2, r3)
            L24:
                r3 = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                addPath(r0, r3)
                java.io.File r4 = new java.io.File
                java.lang.String r5 = "jli"
                r4.<init>(r2, r5)
                addPath(r0, r4)
                addPath(r0, r2)
                if (r10 == 0) goto L46
                java.io.File r4 = r10.stagedNativeDir
                addPath(r0, r4)
                java.io.File r10 = r10.pluginNativeDir
                addPath(r0, r10)
            L46:
                boolean r10 = r9.available
                if (r10 == 0) goto L58
                java.lang.String r10 = r9.libraryPath
                if (r10 == 0) goto L58
                java.io.File r10 = new java.io.File
                java.lang.String r9 = r9.libraryPath
                r10.<init>(r9)
                addPath(r0, r10)
            L58:
                java.io.File r7 = r7.getLwjglNativeDirectory()
                addPath(r0, r7)
                java.util.List r7 = r8.getLibrarySearchPaths()
                java.util.Iterator r7 = r7.iterator()
            L67:
                boolean r9 = r7.hasNext()
                if (r9 == 0) goto L77
                java.lang.Object r9 = r7.next()
                java.io.File r9 = (java.io.File) r9
                addPath(r0, r9)
                goto L67
            L77:
                boolean r7 = ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.m540$$Nest$smshouldApplyDriverPluginEnvironment(r8)
                if (r7 == 0) goto L95
                java.util.List r6 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.getSelectedDriverLibrarySearchPaths(r6, r8)
                java.util.Iterator r6 = r6.iterator()
            L85:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L95
                java.lang.Object r7 = r6.next()
                java.io.File r7 = (java.io.File) r7
                addPath(r0, r7)
                goto L85
            L95:
                addSystemVendorPaths(r0)
                java.io.File r6 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD
                if (r6 == 0) goto La1
                java.io.File r6 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD
                addPath(r0, r6)
            La1:
                java.io.File r6 = new java.io.File
                java.lang.String r7 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
                r6.<init>(r7)
                addPath(r0, r6)
                java.lang.String r4 = joinPathList(r0)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r3.getAbsolutePath()
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r7 = ":"
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.StringBuilder r6 = r6.append(r4)
                java.lang.String r5 = r6.toString()
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "runtimeHome="
                r6.<init>(r7)
                java.lang.String r7 = r1.getAbsolutePath()
                java.lang.StringBuilder r6 = r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.lang.String r7 = "JavaRuntimeBootstrap"
                ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r8 = "runtimeLibDir="
                r6.<init>(r8)
                java.lang.String r8 = r2.getAbsolutePath()
                java.lang.StringBuilder r6 = r6.append(r8)
                java.lang.String r6 = r6.toString()
                ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r8 = "jvmLibraryDir="
                r6.<init>(r8)
                java.lang.String r8 = r3.getAbsolutePath()
                java.lang.StringBuilder r6 = r6.append(r8)
                java.lang.String r6 = r6.toString()
                ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r8 = "LD_LIBRARY_PATH="
                r6.<init>(r8)
                java.lang.StringBuilder r6 = r6.append(r4)
                java.lang.String r6 = r6.toString()
                ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
                ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap$RuntimePaths r6 = new ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap$RuntimePaths
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        private static java.io.File resolveRuntimeLibDir(java.io.File r5) {
                java.util.List r0 = getRuntimeArchCandidates()
                java.util.Iterator r0 = r0.iterator()
            L8:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L2f
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.io.File r2 = new java.io.File
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                java.lang.String r4 = "lib/"
                r3.<init>(r4)
                java.lang.StringBuilder r1 = r3.append(r1)
                java.lang.String r1 = r1.toString()
                r2.<init>(r5, r1)
                boolean r1 = r2.isDirectory()
                if (r1 == 0) goto L8
                return r2
            L2f:
                java.io.File r0 = new java.io.File
                java.lang.String r1 = "lib"
                r0.<init>(r5, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smshouldApplyDriverPluginEnvironment, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m540$$Nest$smshouldApplyDriverPluginEnvironment(ca.dnamobile.javalauncher.renderer.RendererInterface r0) {
            boolean r0 = shouldApplyDriverPluginEnvironment(r0)
            return r0
    }

    private JavaRuntimeBootstrap() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void applyEnvironment(android.content.Context r8, ca.dnamobile.javalauncher.launcher.LaunchPlan r9, ca.dnamobile.javalauncher.renderer.RendererInterface r10, ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths r11, ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.Result r12, ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.Result r13) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            seedRendererEnvironmentReset(r0)
            java.io.File r1 = r9.getRuntimeDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "JAVA_HOME"
            r0.put(r2, r1)
            java.io.File r1 = r9.getGameDirectory()
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "HOME"
            r0.put(r2, r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = "TMPDIR"
            r0.put(r2, r1)
            java.lang.String r1 = "POJAV_NATIVEDIR"
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r0.put(r1, r2)
            java.lang.String r1 = "LD_LIBRARY_PATH"
            java.lang.String r2 = r11.ldLibraryPath
            r0.put(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = new java.io.File
            java.io.File r3 = r9.getRuntimeDirectory()
            java.lang.String r4 = "bin"
            r2.<init>(r3, r4)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "PATH"
            java.lang.String r3 = safeEnv(r2)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.put(r2, r1)
            java.lang.String r1 = "-Dglfwstub.windowWidth="
            java.lang.String r2 = "1"
            java.lang.String r1 = resolveJvmArgValue(r9, r1, r2)
            java.lang.String r3 = "AWTSTUB_WIDTH"
            r0.put(r3, r1)
            java.lang.String r1 = "-Dglfwstub.windowHeight="
            java.lang.String r9 = resolveJvmArgValue(r9, r1, r2)
            java.lang.String r1 = "AWTSTUB_HEIGHT"
            r0.put(r1, r9)
            java.io.File r9 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD
            java.lang.String r1 = ""
            if (r9 == 0) goto L8f
            java.io.File r9 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_RUNTIME_MOD
            java.lang.String r9 = r9.getAbsolutePath()
            goto L90
        L8f:
            r9 = r1
        L90:
            java.lang.String r3 = "MOD_ANDROID_RUNTIME"
            r0.put(r3, r9)
            boolean r9 = isLtwRenderer(r10)
            java.lang.String r3 = "opengles3_ltw"
            if (r9 == 0) goto L9f
            r9 = r3
            goto La3
        L9f:
            java.lang.String r9 = r10.getRendererId()
        La3:
            java.lang.String r4 = "POJAV_RENDERER"
            r0.put(r4, r9)
            java.util.Map r9 = r10.getRendererEnv()
            r0.putAll(r9)
            boolean r9 = shouldApplyDriverPluginEnvironment(r10)
            if (r9 == 0) goto Lbc
            java.util.Map r9 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.buildEnvironment(r8, r10)
            r0.putAll(r9)
        Lbc:
            boolean r9 = isLtwRenderer(r10)
            java.lang.String r5 = "EGL_DRIVERS_PATH"
            java.lang.String r6 = "LIBGL_DRIVERS_PATH"
            java.lang.String r7 = "POJAVEXEC_EGL"
            if (r9 == 0) goto L120
            r0.put(r4, r3)
            java.lang.String r9 = "libltw.so"
            r0.put(r7, r9)
            java.lang.String r3 = "POJAV_EGL_LIBRARY"
            r0.put(r3, r9)
            java.lang.String r3 = "POJAVEXEC_EGL_LIBRARY"
            r0.put(r3, r9)
            java.lang.String r3 = "POJAV_RENDERER_LIBRARY"
            r0.put(r3, r9)
            java.lang.String r3 = "POJAVEXEC_RENDERER"
            r0.put(r3, r9)
            java.lang.String r9 = "LIBGL_ES"
            java.lang.String r3 = "3"
            r0.put(r9, r3)
            java.lang.String r9 = "POJAV_USE_SYSTEM_VULKAN"
            r0.put(r9, r2)
            java.lang.String r9 = "DRIVER_PATH"
            r0.put(r9, r1)
            java.lang.String r9 = "VK_ICD_FILENAMES"
            r0.put(r9, r1)
            java.lang.String r9 = "VK_DRIVER_FILES"
            r0.put(r9, r1)
            r0.put(r6, r1)
            r0.put(r5, r1)
            java.lang.String r9 = "MESA_LOADER_DRIVER_OVERRIDE"
            r0.put(r9, r1)
            java.lang.String r9 = "GALLIUM_DRIVER"
            r0.put(r9, r1)
            java.lang.String r9 = "OSMESA_LIB"
            r0.put(r9, r1)
            java.lang.String r9 = "LTW_NEVER_FLUSH_BUFFERS"
            java.lang.String r1 = "0"
            r0.put(r9, r1)
            java.lang.String r9 = "LTW_COHERENT_DYNAMIC_STORAGE"
            r0.put(r9, r1)
        L120:
            java.lang.String r9 = r10.getRendererEGL()
            java.lang.String r9 = sanitizeLibraryName(r9)
            boolean r1 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r10)
            if (r1 != 0) goto L144
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L138
            java.lang.String r9 = inferPojavExecEgl(r10)
        L138:
            boolean r1 = r9.isEmpty()
            if (r1 != 0) goto L141
            r0.put(r7, r9)
        L141:
            applyRendererBridgeAliases(r0, r10, r9)
        L144:
            applyLiteGlesEnvironmentOverrides(r0, r13)
            applyMobileGluesConfigEnvironment(r8, r10, r0)
            boolean r9 = isLtwRenderer(r10)
            if (r9 != 0) goto L15e
            if (r13 != 0) goto L15e
            boolean r9 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r10)
            if (r9 == 0) goto L159
            goto L15e
        L159:
            java.lang.String r9 = findMesaDriverPath(r11)
            goto L15f
        L15e:
            r9 = 0
        L15f:
            if (r9 == 0) goto L167
            r0.put(r6, r9)
            r0.put(r5, r9)
        L167:
            boolean r9 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isMesaZinkTurnipRenderer(r10)
            if (r9 == 0) goto L171
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.applyZinkTurnipEnvironment(r8, r10, r0)
            goto L17a
        L171:
            boolean r9 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r10)
            if (r9 == 0) goto L17a
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.applyEnvironment(r8, r10, r0)
        L17a:
            java.lang.String r8 = findJsphLibrary(r11)
            if (r8 == 0) goto L185
            java.lang.String r9 = "JSP"
            r0.put(r9, r8)
        L185:
            boolean r8 = r12.available
            java.lang.String r9 = "JavaRuntimeBootstrap"
            if (r8 == 0) goto L1d9
            java.lang.String r8 = r12.executablePath
            if (r8 == 0) goto L1d9
            java.lang.String r8 = "JAVALAUNCHER_FFMPEG_PATH"
            java.lang.String r10 = r12.executablePath
            r0.put(r8, r10)
            java.lang.String r8 = r12.ffprobePath
            if (r8 == 0) goto L1a1
            java.lang.String r8 = "JAVALAUNCHER_FFPROBE_PATH"
            java.lang.String r10 = r12.ffprobePath
            r0.put(r8, r10)
        L1a1:
            java.lang.String r8 = r12.libraryPath
            if (r8 == 0) goto L1ac
            java.lang.String r8 = "JAVALAUNCHER_FFMPEG_LIBRARY_PATH"
            java.lang.String r10 = r12.libraryPath
            r0.put(r8, r10)
        L1ac:
            java.lang.String r8 = "JAVALAUNCHER_FFMPEG_USE_LINKER"
            r0.put(r8, r2)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Replay Mod FFmpeg executable="
            r8.<init>(r10)
            java.lang.String r10 = r12.executablePath
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r10 = " ffprobe="
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r10 = r12.ffprobePath
            if (r10 == 0) goto L1cb
            java.lang.String r10 = r12.ffprobePath
            goto L1cd
        L1cb:
            java.lang.String r10 = "<missing>"
        L1cd:
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r9, r8)
            goto L1f8
        L1d9:
            boolean r8 = r12.replayModPresent
            if (r8 == 0) goto L1f8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r10 = "Replay Mod detected, but JavaLauncher FFmpeg plugin is unavailable: "
            r8.<init>(r10)
            java.lang.String r10 = r12.errorMessage
            if (r10 == 0) goto L1eb
            java.lang.String r10 = r12.errorMessage
            goto L1ed
        L1eb:
            java.lang.String r10 = "unknown reason"
        L1ed:
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r9, r8)
        L1f8:
            java.util.Set r8 = r0.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L200:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L21c
            java.lang.Object r9 = r8.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r10 = r9.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            setEnv(r10, r9)
            goto L200
        L21c:
            return
    }

    private static void applyLiteGlesEnvironmentOverrides(java.util.LinkedHashMap<java.lang.String, java.lang.String> r4, ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.Result r5) {
            if (r5 != 0) goto L3
            return
        L3:
            java.io.File r0 = r5.stagedNativeDir
            java.lang.String r0 = r0.getAbsolutePath()
            java.io.File r1 = r5.pluginNativeDir
            java.lang.String r1 = r1.getAbsolutePath()
            java.io.File r2 = r5.stagedOSMesaLibrary
            java.lang.String r2 = r2.getAbsolutePath()
            java.io.File r5 = r5.stagedMainLibrary
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r3 = "DB_LITEGLES_PLUGIN_NATIVE_DIR"
            r4.put(r3, r1)
            java.lang.String r1 = "DB_LITEGLES_STAGED_NATIVE_DIR"
            r4.put(r1, r0)
            java.lang.String r1 = "DB_LITEGLES_OSMESA_PATH"
            r4.put(r1, r2)
            java.lang.String r1 = "POJAV_OSMESA_LIBRARY"
            r4.put(r1, r2)
            java.lang.String r1 = "OSMESA_LIBRARY"
            r4.put(r1, r2)
            java.lang.String r1 = "OSMESA_LIB"
            r4.put(r1, r2)
            java.lang.String r1 = "LIBGL_OSMESA"
            r4.put(r1, r2)
            java.lang.String r1 = "LIB_MESA_NAME"
            r4.put(r1, r2)
            java.lang.String r1 = "POJAV_RENDERER"
            java.lang.String r3 = "opengles3"
            r4.put(r1, r3)
            java.lang.String r1 = "POJAV_RENDERER_LIBRARY"
            r4.put(r1, r5)
            java.lang.String r1 = "POJAVEXEC_RENDERER"
            r4.put(r1, r5)
            java.lang.String r5 = "POJAVEXEC_EGL"
            java.lang.String r1 = "libEGL.so"
            r4.put(r5, r1)
            java.lang.String r5 = "POJAV_EGL_LIBRARY"
            r4.put(r5, r1)
            java.lang.String r5 = "POJAVEXEC_EGL_LIBRARY"
            r4.put(r5, r1)
            java.lang.String r5 = "LIBGL_ES"
            java.lang.String r1 = "2"
            r4.put(r5, r1)
            java.lang.String r5 = "LIBGL_GL"
            java.lang.String r1 = "21"
            r4.put(r5, r1)
            java.lang.String r5 = "LIBGL_FBO"
            java.lang.String r1 = "1"
            r4.put(r5, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "LiteGLES env stagedDir="
            r4.<init>(r5)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            java.lang.String r5 = "JavaRuntimeBootstrap"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "LiteGLES env OSMesa="
            r4.<init>(r0)
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r5, r4)
            return
    }

    private static void applyMobileGluesConfigEnvironment(android.content.Context r5, ca.dnamobile.javalauncher.renderer.RendererInterface r6, java.util.LinkedHashMap<java.lang.String, java.lang.String> r7) {
            java.lang.String r0 = "JavaRuntimeBootstrap"
            java.lang.String r1 = "MG_DIR_PATH"
            java.lang.String r2 = "MobileGlues config env prepared before renderer preload: MG_DIR_PATH="
            boolean r6 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.isMobileGluesRenderer(r6)
            if (r6 != 0) goto Ld
            return
        Ld:
            java.io.File r6 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.prepareLaunchConfig(r5)     // Catch: java.lang.Throwable -> L5f
            java.io.File r5 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.getLaunchConfigFile(r5)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L5f
            r7.put(r1, r3)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r3 = "MOBILEGLUES_CONFIG_DIR"
            java.lang.String r4 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L5f
            r7.put(r3, r4)     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r6 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r6 = r3.append(r6)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = " configExists="
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r5.isFile()     // Catch: java.lang.Throwable -> L5f
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r2 = " configSize="
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L5f
            boolean r2 = r5.isFile()     // Catch: java.lang.Throwable -> L5f
            if (r2 == 0) goto L51
            long r2 = r5.length()     // Catch: java.lang.Throwable -> L5f
            goto L53
        L51:
            r2 = 0
        L53:
            java.lang.StringBuilder r5 = r6.append(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L5f
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> L5f
            goto L81
        L5f:
            r5 = move-exception
            java.io.File r6 = ca.dnamobile.javalauncher.renderer.MobileGluesConfigHelper.getConfigDirectory()
            java.lang.String r2 = r6.getAbsolutePath()
            r7.put(r1, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to prepare MobileGlues config before renderer preload; using fallback MG_DIR_PATH="
            r7.<init>(r1)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r6, r5)
        L81:
            return
    }

    private static void applyRendererBridgeAliases(java.util.LinkedHashMap<java.lang.String, java.lang.String> r16, ca.dnamobile.javalauncher.renderer.RendererInterface r17, java.lang.String r18) {
            r0 = r16
            r1 = r18
            java.lang.String r2 = r17.getRendererLibrary()
            java.lang.String r2 = sanitizeLibraryName(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r17.getRendererId()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r5 = r17.getRendererName()
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            boolean r4 = isLtwRenderer(r17)
            java.lang.String r5 = "MESA_LOADER_DRIVER_OVERRIDE"
            java.lang.String r6 = "GALLIUM_DRIVER"
            java.lang.String r7 = "OSMESA_LIB"
            java.lang.String r8 = "3"
            java.lang.String r9 = "LIBGL_ES"
            java.lang.String r10 = "POJAVEXEC_RENDERER"
            java.lang.String r11 = "POJAV_RENDERER_LIBRARY"
            java.lang.String r12 = "POJAVEXEC_EGL_LIBRARY"
            java.lang.String r13 = "POJAV_EGL_LIBRARY"
            java.lang.String r14 = "POJAVEXEC_EGL"
            java.lang.String r15 = "POJAV_RENDERER"
            if (r4 == 0) goto La6
            java.lang.String r1 = "opengles3_ltw"
            r0.put(r15, r1)
            java.lang.String r1 = "libltw.so"
            r0.put(r14, r1)
            r0.put(r13, r1)
            r0.put(r12, r1)
            r0.put(r11, r1)
            r0.put(r10, r1)
            r0.put(r9, r8)
            java.lang.String r1 = "POJAV_USE_SYSTEM_VULKAN"
            java.lang.String r2 = "1"
            r0.put(r1, r2)
            java.lang.String r1 = "DRIVER_PATH"
            java.lang.String r2 = ""
            r0.put(r1, r2)
            java.lang.String r1 = "VK_ICD_FILENAMES"
            r0.put(r1, r2)
            java.lang.String r1 = "VK_DRIVER_FILES"
            r0.put(r1, r2)
            java.lang.String r1 = "LIBGL_DRIVERS_PATH"
            r0.put(r1, r2)
            java.lang.String r1 = "EGL_DRIVERS_PATH"
            r0.put(r1, r2)
            r0.put(r7, r2)
            r0.put(r6, r2)
            r0.put(r5, r2)
            java.lang.String r1 = "LTW_NEVER_FLUSH_BUFFERS"
            java.lang.String r2 = "0"
            r0.put(r1, r2)
            java.lang.String r1 = "LTW_COHERENT_DYNAMIC_STORAGE"
            r0.put(r1, r2)
            return
        La6:
            boolean r4 = isMobileGluesRenderer(r17)
            if (r4 == 0) goto Lc6
            java.lang.String r1 = "mobileglues"
            r0.put(r15, r1)
            java.lang.String r1 = "libmobileglues.so"
            r0.put(r11, r1)
            r0.put(r10, r1)
            r0.put(r14, r1)
            r0.put(r13, r1)
            r0.put(r12, r1)
            clearMesaAndVulkanDriverEnvironment(r16)
            return
        Lc6:
            boolean r4 = r2.isEmpty()
            if (r4 != 0) goto Ld5
            r0.put(r11, r2)
            r0.put(r10, r2)
            r0.put(r7, r2)
        Ld5:
            boolean r4 = r18.isEmpty()
            if (r4 != 0) goto Le1
            r0.put(r13, r1)
            r0.put(r12, r1)
        Le1:
            java.lang.String r1 = "zink"
            boolean r4 = r3.contains(r1)
            if (r4 != 0) goto Lf1
            java.lang.String r4 = "osmesa"
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L119
        Lf1:
            java.lang.String r3 = "vulkan_zink"
            r0.put(r15, r3)
            boolean r3 = r2.isEmpty()
            java.lang.String r4 = "libOSMesa_8.so"
            if (r3 == 0) goto L100
            r3 = r4
            goto L101
        L100:
            r3 = r2
        L101:
            r0.put(r14, r3)
            r0.put(r9, r8)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L10e
            r2 = r4
        L10e:
            java.lang.String r3 = "LIB_MESA_NAME"
            r0.put(r3, r2)
            r0.put(r5, r1)
            r0.put(r6, r1)
        L119:
            return
    }

    private static void clearMesaAndVulkanDriverEnvironment(java.util.LinkedHashMap<java.lang.String, java.lang.String> r2) {
            java.lang.String r0 = "POJAV_OSMESA_LIBRARY"
            java.lang.String r1 = ""
            r2.put(r0, r1)
            java.lang.String r0 = "OSMESA_LIBRARY"
            r2.put(r0, r1)
            java.lang.String r0 = "OSMESA_LIB"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_OSMESA"
            r2.put(r0, r1)
            java.lang.String r0 = "LIB_MESA_NAME"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_MODE"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DRIVER"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_GL"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_EGL_RECOVER_CURRENT"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_PROCESS_NAME"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_LOADER_DRIVER_OVERRIDE"
            r2.put(r0, r1)
            java.lang.String r0 = "GALLIUM_DRIVER"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_GL_VERSION_OVERRIDE"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_GLSL_VERSION_OVERRIDE"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_EXTENSION_OVERRIDE"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_GLSL_CACHE_DIR"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_SHADER_CACHE_DIR"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_DEBUG"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_NO_ERROR"
            r2.put(r0, r1)
            java.lang.String r0 = "mesa_glthread"
            r2.put(r0, r1)
            java.lang.String r0 = "EGL_PLATFORM"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_ES"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_GL"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_FBO"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_MIPMAP"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_NOINTOVLHACK"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_NORMALIZE"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_NOERROR"
            r2.put(r0, r1)
            java.lang.String r0 = "LIBGL_DRIVERS_PATH"
            r2.put(r0, r1)
            java.lang.String r0 = "EGL_DRIVERS_PATH"
            r2.put(r0, r1)
            java.lang.String r0 = "DRIVER_PATH"
            r2.put(r0, r1)
            java.lang.String r0 = "POJAV_LOAD_TURNIP"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_LOAD_TURNIP"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r2.put(r0, r1)
            java.lang.String r0 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            r2.put(r0, r1)
            java.lang.String r0 = "POJAV_CUSTOM_VULKAN_DRIVER"
            r2.put(r0, r1)
            java.lang.String r0 = "VK_ICD_FILENAMES"
            r2.put(r0, r1)
            java.lang.String r0 = "VK_DRIVER_FILES"
            r2.put(r0, r1)
            java.lang.String r0 = "VK_INSTANCE_LAYERS"
            r2.put(r0, r1)
            java.lang.String r0 = "VULKAN_PTR"
            r2.put(r0, r1)
            java.lang.String r0 = "TU_DEBUG"
            r2.put(r0, r1)
            java.lang.String r0 = "ZINK_DEBUG"
            r2.put(r0, r1)
            java.lang.String r0 = "ZINK_DESCRIPTORS"
            r2.put(r0, r1)
            java.lang.String r0 = "MESA_VK_WSI_PRESENT_MODE"
            r2.put(r0, r1)
            java.lang.String r0 = "POJAV_USE_SYSTEM_VULKAN"
            java.lang.String r1 = "1"
            r2.put(r0, r1)
            return
    }

    private static void collectSharedLibraries(java.io.File r5, java.util.List<java.io.File> r6) {
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L7
            return
        L7:
            int r0 = r5.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L2f
            r2 = r5[r1]
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L17
            collectSharedLibraries(r2, r6)
            goto L2c
        L17:
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L2c
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = ".so"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L2c
            r6.add(r2)
        L2c:
            int r1 = r1 + 1
            goto L9
        L2f:
            return
    }

    private static void copyRuntimeNativeIfNeeded(java.io.File r7, java.io.File r8) {
            boolean r0 = r7.isFile()
            java.lang.String r1 = "JavaRuntimeBootstrap"
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Missing optional native source: "
            r8.<init>(r0)
            java.lang.String r7 = r7.getAbsolutePath()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
        L1f:
            boolean r0 = r8.isFile()
            if (r0 == 0) goto L32
            long r2 = r8.length()
            long r4 = r7.length()
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L32
            return
        L32:
            java.io.File r0 = r8.getParentFile()
            if (r0 == 0) goto L5b
            boolean r2 = r0.exists()
            if (r2 != 0) goto L5b
            boolean r2 = r0.mkdirs()
            if (r2 != 0) goto L5b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable to create native target folder: "
            r7.<init>(r8)
            java.lang.String r8 = r0.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)
            return
        L5b:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Lbf
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lbf
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb5
            r2.<init>(r8)     // Catch: java.lang.Throwable -> Lb5
            r3 = 16384(0x4000, float:2.2959E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Lab
        L69:
            int r4 = r0.read(r3)     // Catch: java.lang.Throwable -> Lab
            r5 = -1
            r6 = 0
            if (r4 == r5) goto L75
            r2.write(r3, r6, r4)     // Catch: java.lang.Throwable -> Lab
            goto L69
        L75:
            r3 = 1
            r8.setReadable(r3, r6)     // Catch: java.lang.Throwable -> Lab
            r8.setExecutable(r3, r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            r3.<init>()     // Catch: java.lang.Throwable -> Lab
            java.lang.String r4 = "Prepared native "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r7 = r3.append(r7)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = " -> "
            java.lang.StringBuilder r7 = r7.append(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r7 = r7.append(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lab
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r7)     // Catch: java.lang.Throwable -> Lab
            r2.close()     // Catch: java.lang.Throwable -> Lb5
            r0.close()     // Catch: java.lang.Throwable -> Lbf
            goto Ld6
        Lab:
            r7 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Lb0
            goto Lb4
        Lb0:
            r2 = move-exception
            r7.addSuppressed(r2)     // Catch: java.lang.Throwable -> Lb5
        Lb4:
            throw r7     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r7 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lba
            goto Lbe
        Lba:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lbf
        Lbe:
            throw r7     // Catch: java.lang.Throwable -> Lbf
        Lbf:
            r7 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to prepare native "
            r0.<init>(r2)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r1, r8, r7)
        Ld6:
            return
    }

    private static boolean dlopenOptional(java.io.File r1) {
            boolean r0 = r1.isFile()
            if (r0 != 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r1 = r1.getAbsolutePath()
            boolean r1 = dlopenOptional(r1)
            return r1
    }

    private static boolean dlopenOptional(java.lang.String r5) {
            java.lang.String r0 = "JavaRuntimeBootstrap"
            java.lang.String r1 = "dlopen "
            r2 = 0
            if (r5 == 0) goto L44
            java.lang.String r3 = r5.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L12
            goto L44
        L12:
            boolean r3 = net.kdt.pojavlaunch.utils.JREUtils.dlopen(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = r4.append(r5)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = " = "
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L31
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L31
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L31
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)     // Catch: java.lang.Throwable -> L31
            return r3
        L31:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "dlopen failed for "
            r3.<init>(r4)
            java.lang.StringBuilder r5 = r3.append(r5)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r5, r1)
        L44:
            return r2
    }

    private static java.lang.String findJsphLibrary(ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths r3) {
            java.io.File r3 = r3.runtimeHome
            java.lang.String r3 = r3.getName()
            int r3 = parseRuntimeJavaVersion(r3)
            r0 = 11
            r1 = 0
            if (r3 > r0) goto L10
            return r1
        L10:
            r0 = 17
            if (r3 != r0) goto L17
            java.lang.String r3 = "libjsph17"
            goto L19
        L17:
            java.lang.String r3 = "libjsph21"
        L19:
            java.io.File r0 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r0.<init>(r2)
            ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap$$ExternalSyntheticLambda1
            r2.<init>(r3)
            java.io.File[] r3 = r0.listFiles(r2)
            if (r3 == 0) goto L37
            int r0 = r3.length
            if (r0 != 0) goto L2f
            goto L37
        L2f:
            r0 = 0
            r3 = r3[r0]
            java.lang.String r3 = r3.getAbsolutePath()
            return r3
        L37:
            return r1
    }

    private static java.lang.String findMesaDriverPath(ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths r7) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r3 = "dri"
            r1.<init>(r2, r3)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r4 = "gallium"
            r1.<init>(r2, r4)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r1.<init>(r2)
            r0.add(r1)
            java.lang.String r7 = r7.ldLibraryPath
            java.lang.String r1 = ":"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = 0
        L31:
            if (r2 >= r1) goto L5e
            r5 = r7[r2]
            if (r5 == 0) goto L5b
            java.lang.String r6 = r5.trim()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L42
            goto L5b
        L42:
            java.io.File r6 = new java.io.File
            java.lang.String r5 = r5.trim()
            r6.<init>(r5)
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r3)
            r0.add(r5)
            java.io.File r5 = new java.io.File
            r5.<init>(r6, r4)
            r0.add(r5)
        L5b:
            int r2 = r2 + 1
            goto L31
        L5e:
            java.util.Iterator r7 = r0.iterator()
        L62:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L79
            java.lang.Object r0 = r7.next()
            java.io.File r0 = (java.io.File) r0
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L62
            java.lang.String r7 = r0.getAbsolutePath()
            return r7
        L79:
            r7 = 0
            return r7
    }

    private static java.lang.String inferPojavExecEgl(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            java.lang.String r0 = r4.getRendererId()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = r4.getRendererName()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = r4.getRendererLibrary()
            java.lang.String r2 = sanitizeLibraryName(r2)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r1 = isLtwRenderer(r4)
            if (r1 == 0) goto L4a
            java.lang.String r4 = "libltw.so"
            return r4
        L4a:
            boolean r1 = isLiteGlesRenderer(r4)
            java.lang.String r2 = "libEGL.so"
            if (r1 == 0) goto L53
            return r2
        L53:
            java.lang.String r1 = "gl4es"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lba
            java.lang.String r1 = "opengles"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lba
            java.lang.String r1 = "krypton"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lba
            java.lang.String r1 = "ng_gl4es"
            boolean r1 = r0.contains(r1)
            if (r1 == 0) goto L74
            goto Lba
        L74:
            boolean r1 = isMobileGluesRenderer(r4)
            if (r1 == 0) goto L7d
            java.lang.String r4 = "libmobileglues.so"
            return r4
        L7d:
            java.lang.String r1 = "osmesa"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "zink"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "mesa"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "virgl"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "freedreno"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "panfrost"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lae
            goto Lb1
        Lae:
            java.lang.String r4 = ""
            return r4
        Lb1:
            java.lang.String r4 = r4.getRendererLibrary()
            java.lang.String r4 = sanitizeLibraryName(r4)
            return r4
        Lba:
            return r2
    }

    private static boolean isLiteGlesRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererId()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererLibrary()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererEGL()
            java.lang.String r4 = sanitizeLibraryName(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "litegles"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = "litegl"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = "droidbridge_litegl"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = "ca.dnamobile.renderer.litegles"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L72
        L71:
            r0 = 1
        L72:
            return r0
    }

    private static boolean isLtwRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererId()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererLibrary()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererEGL()
            java.lang.String r4 = sanitizeLibraryName(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "ltw"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L61
            java.lang.String r1 = "libltw.so"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L62
        L61:
            r0 = 1
        L62:
            return r0
    }

    private static boolean isMobileGluesRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererId()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererLibrary()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererEGL()
            java.lang.String r4 = sanitizeLibraryName(r4)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "mobileglues"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L69
            java.lang.String r1 = "mobile glues"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L69
            java.lang.String r1 = "com.fcl.plugin.mobileglues"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L6a
        L69:
            r0 = 1
        L6a:
            return r0
    }

    private static boolean isOpenGlesWrapperRenderer(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            java.lang.String r0 = r4.getRendererId()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = r4.getRendererName()
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = r4.getRendererLibrary()
            java.lang.String r2 = sanitizeLibraryName(r2)
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r0 = r3.append(r0)
            java.lang.String r3 = " "
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            boolean r4 = isLiteGlesRenderer(r4)
            if (r4 != 0) goto L6a
            java.lang.String r4 = "opengles"
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L6a
            java.lang.String r4 = "gl4es"
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L6a
            java.lang.String r4 = "ng_gl4es"
            boolean r4 = r0.contains(r4)
            if (r4 != 0) goto L6a
            java.lang.String r4 = "krypton"
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto L68
            goto L6a
        L68:
            r4 = 0
            goto L6b
        L6a:
            r4 = 1
        L6b:
            return r4
    }

    private static boolean isPre16Version(java.lang.String r9) {
            java.lang.String r9 = r9.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r9 = r9.toLowerCase(r0)
            java.lang.String r0 = "rd-"
            boolean r0 = r9.startsWith(r0)
            r1 = 1
            if (r0 != 0) goto L7a
            java.lang.String r0 = "classic"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "infdev"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "indev"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "a"
            boolean r0 = r9.startsWith(r0)
            if (r0 != 0) goto L7a
            java.lang.String r0 = "b"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L3c
            goto L7a
        L3c:
            java.lang.String r0 = "1."
            boolean r0 = r9.startsWith(r0)
            r2 = 0
            if (r0 == 0) goto L79
            java.lang.String r0 = "[^0-9]+"
            java.lang.String[] r9 = r9.split(r0)
            int r0 = r9.length
            r3 = -1
            r4 = r2
            r5 = r4
            r6 = r3
        L50:
            if (r4 >= r0) goto L6f
            r7 = r9[r4]
            if (r7 == 0) goto L6c
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L5d
            goto L6c
        L5d:
            if (r5 != 0) goto L63
            int r6 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L6c
        L63:
            if (r5 != r1) goto L6a
            int r3 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.NumberFormatException -> L6c
            goto L6f
        L6a:
            int r5 = r5 + 1
        L6c:
            int r4 = r4 + 1
            goto L50
        L6f:
            if (r6 != r1) goto L77
            if (r3 < 0) goto L77
            r9 = 6
            if (r3 >= r9) goto L77
            goto L78
        L77:
            r1 = r2
        L78:
            return r1
        L79:
            return r2
        L7a:
            return r1
    }

    static /* synthetic */ boolean lambda$findJsphLibrary$1(java.lang.String r0, java.io.File r1, java.lang.String r2) {
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L10
            java.lang.String r0 = ".so"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    static /* synthetic */ int lambda$listSharedLibraries$0(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.String r1 = r1.getAbsolutePath()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    private static java.util.List<java.io.File> listSharedLibraries(java.io.File r1) {
            boolean r0 = r1.isDirectory()
            if (r0 != 0) goto Lb
            java.util.List r1 = java.util.Collections.emptyList()
            return r1
        Lb:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            collectSharedLibraries(r1, r0)
            ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap$$ExternalSyntheticLambda0
            r1.<init>()
            r0.sort(r1)
            return r0
    }

    private static int parseRuntimeJavaVersion(java.lang.String r1) {
            java.lang.String r0 = "25"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lb
            r1 = 25
            return r1
        Lb:
            java.lang.String r0 = "21"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L16
            r1 = 21
            return r1
        L16:
            java.lang.String r0 = "17"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L21
            r1 = 17
            return r1
        L21:
            java.lang.String r0 = "8"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L2c
            r1 = 8
            return r1
        L2c:
            r1 = 0
            return r1
    }

    private static void preloadAndroidWebRtcNativeTest(android.content.Context r4) {
            java.lang.String r0 = "Android WebRTC native test dlopen "
            r1 = 0
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2d
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.nativeLibraryDir     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L2d
            android.content.pm.ApplicationInfo r2 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.nativeLibraryDir     // Catch: java.lang.Throwable -> L2d
            java.lang.String r2 = r2.trim()     // Catch: java.lang.Throwable -> L2d
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r2 != 0) goto L2d
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L2d
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = r4.nativeLibraryDir     // Catch: java.lang.Throwable -> L2d
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d
            goto L2e
        L2d:
            r2 = r1
        L2e:
            if (r2 != 0) goto L47
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r4 == 0) goto L47
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L47
            java.io.File r2 = new java.io.File
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r2.<init>(r4)
        L47:
            if (r2 == 0) goto L50
            java.io.File r1 = new java.io.File
            java.lang.String r4 = "libjingle_peerconnection_so.so"
            r1.<init>(r2, r4)
        L50:
            java.lang.String r4 = "JavaRuntimeBootstrap"
            if (r1 == 0) goto L98
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L98
            java.lang.String r2 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L81
            boolean r2 = net.kdt.pojavlaunch.utils.JREUtils.dlopen(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r1.getAbsolutePath()     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = " = "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L81
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r0)     // Catch: java.lang.Throwable -> L81
            return
        L81:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Android WebRTC native test dlopen failed: "
            r2.<init>(r3)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r1, r0)
        L98:
            java.lang.String r0 = "jingle_peerconnection_so"
            java.lang.System.loadLibrary(r0)     // Catch: java.lang.Throwable -> La3
            java.lang.String r0 = "Android WebRTC native test loaded with System.loadLibrary(\"jingle_peerconnection_so\")"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r0)     // Catch: java.lang.Throwable -> La3
            goto La9
        La3:
            r0 = move-exception
            java.lang.String r1 = "Android WebRTC native test unavailable"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r1, r0)
        La9:
            return
    }

    private static void preloadPackagedNativeShim(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = "WebRTC Linux shim dlopen "
            java.lang.String r1 = "WebRTC Linux shim loaded with System.loadLibrary(\""
            r2 = 0
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L2f
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.nativeLibraryDir     // Catch: java.lang.Throwable -> L2f
            if (r3 == 0) goto L2f
            android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.nativeLibraryDir     // Catch: java.lang.Throwable -> L2f
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L2f
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L2f
            if (r3 != 0) goto L2f
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L2f
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r4.nativeLibraryDir     // Catch: java.lang.Throwable -> L2f
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            goto L30
        L2f:
            r3 = r2
        L30:
            if (r3 != 0) goto L49
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r4 == 0) goto L49
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L49
            java.io.File r3 = new java.io.File
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r3.<init>(r4)
        L49:
            if (r3 == 0) goto L50
            java.io.File r2 = new java.io.File
            r2.<init>(r3, r6)
        L50:
            java.lang.String r4 = "JavaRuntimeBootstrap"
            if (r2 == 0) goto L98
            boolean r6 = r2.isFile()
            if (r6 == 0) goto L98
            java.lang.String r6 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L81
            boolean r6 = net.kdt.pojavlaunch.utils.JREUtils.dlopen(r6)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L81
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L81
            java.lang.String r3 = " = "
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L81
            java.lang.StringBuilder r6 = r0.append(r6)     // Catch: java.lang.Throwable -> L81
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L81
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r6)     // Catch: java.lang.Throwable -> L81
            return
        L81:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "WebRTC Linux shim dlopen failed: "
            r0.<init>(r3)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r0, r6)
        L98:
            java.lang.System.loadLibrary(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb2
            r6.<init>(r1)     // Catch: java.lang.Throwable -> Lb2
            java.lang.StringBuilder r6 = r6.append(r5)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r0 = "\")"
            java.lang.StringBuilder r6 = r6.append(r0)     // Catch: java.lang.Throwable -> Lb2
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> Lb2
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r6)     // Catch: java.lang.Throwable -> Lb2
            goto Lc5
        Lb2:
            r6 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WebRTC Linux shim unavailable: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r5, r6)
        Lc5:
            return
    }

    private static void preloadRuntimeAndGraphics(ca.dnamobile.javalauncher.launcher.LaunchPlan r4, ca.dnamobile.javalauncher.renderer.RendererInterface r5, ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths r6, ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.Result r7) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = "libSDL3.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = "libSDL2.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = "libspirv-cross.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = "libshaderc.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = "libshaderc_shared.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = "liblwjgl_vma.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.lang.String r0 = "libzstd-jni_dh-1.5.7-6.so"
            dlopenOptional(r0)
            boolean r0 = shouldPrepareAwtNative(r4)
            if (r0 == 0) goto L56
            prepareAwtDummyNative(r6)
        L56:
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "jli/libjli.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "libjli.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.jvmLibraryDir
            java.lang.String r3 = "libjvm.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "libverify.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "libjava.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "libnet.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "libnio.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "libawt.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            java.io.File r1 = new java.io.File
            java.io.File r2 = r6.runtimeLibDir
            java.lang.String r3 = "libawt_headless.so"
            r1.<init>(r2, r3)
            dlopenOptional(r1)
            if (r0 == 0) goto Lda
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.runtimeLibDir
            java.lang.String r2 = "libawt_xawt.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r0.<init>(r1, r2)
            dlopenOptional(r0)
        Lda:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.runtimeLibDir
            java.lang.String r2 = "libfreetype.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.runtimeLibDir
            java.lang.String r2 = "libfontmanager.so"
            r0.<init>(r1, r2)
            dlopenOptional(r0)
            java.io.File r6 = r6.runtimeLibDir
            java.util.List r6 = listSharedLibraries(r6)
            java.util.Iterator r6 = r6.iterator()
        Lfc:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L10c
            java.lang.Object r0 = r6.next()
            java.io.File r0 = (java.io.File) r0
            dlopenOptional(r0)
            goto Lfc
        L10c:
            java.io.File r6 = new java.io.File
            java.lang.String r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r1 = "libopenal.so"
            r6.<init>(r0, r1)
            dlopenOptional(r6)
            java.io.File r6 = new java.io.File
            java.io.File r0 = r4.getLwjglNativeDirectory()
            r6.<init>(r0, r1)
            dlopenOptional(r6)
            boolean r6 = isOpenGlesWrapperRenderer(r5)
            if (r6 == 0) goto L139
            java.lang.String r6 = "libEGL.so"
            dlopenOptional(r6)
            java.lang.String r6 = "libGLESv2.so"
            dlopenOptional(r6)
            java.lang.String r6 = "libGLESv3.so"
            dlopenOptional(r6)
        L139:
            java.util.List r6 = r5.getDlopenLibrary()
            java.util.Iterator r6 = r6.iterator()
        L141:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L151
            java.lang.Object r0 = r6.next()
            java.lang.String r0 = (java.lang.String) r0
            dlopenOptional(r0)
            goto L141
        L151:
            if (r7 == 0) goto L181
            java.io.File r6 = r7.stagedOSMesaLibrary
            dlopenOptional(r6)
            java.io.File r6 = new java.io.File
            java.io.File r0 = r7.stagedNativeDir
            java.lang.String r1 = "libOSMesa_8.so"
            r6.<init>(r0, r1)
            dlopenOptional(r6)
            java.io.File r6 = new java.io.File
            java.io.File r0 = r7.stagedNativeDir
            java.lang.String r1 = "libOSMesa8.so"
            r6.<init>(r0, r1)
            dlopenOptional(r6)
            java.io.File r6 = new java.io.File
            java.io.File r0 = r7.stagedNativeDir
            java.lang.String r1 = "libGL.so"
            r6.<init>(r0, r1)
            dlopenOptional(r6)
            java.io.File r6 = r7.stagedMainLibrary
            dlopenOptional(r6)
        L181:
            java.lang.String r6 = r5.getRendererLibrary()
            java.lang.String r6 = sanitizeLibraryName(r6)
            boolean r7 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r5)
            java.lang.String r0 = "JavaRuntimeBootstrap"
            if (r7 == 0) goto L1b2
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "Skipping generic renderer dlopen for Mesa renderer; native bridge will load "
            r7.<init>(r1)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = " for "
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r5 = r5.getRendererName()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)
            goto L1f9
        L1b2:
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L1e3
            java.util.List r5 = r5.getLibrarySearchPaths()
            java.util.Iterator r5 = r5.iterator()
        L1c0:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L1d5
            java.lang.Object r7 = r5.next()
            java.io.File r7 = (java.io.File) r7
            java.io.File r0 = new java.io.File
            r0.<init>(r7, r6)
            dlopenOptional(r0)
            goto L1c0
        L1d5:
            java.io.File r5 = new java.io.File
            java.lang.String r7 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r5.<init>(r7, r6)
            dlopenOptional(r5)
            dlopenOptional(r6)
            goto L1f9
        L1e3:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Skipping renderer preload because renderer library is empty: "
            r6.<init>(r7)
            java.lang.String r5 = r5.getRendererName()
            java.lang.StringBuilder r5 = r6.append(r5)
            java.lang.String r5 = r5.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)
        L1f9:
            java.io.File r4 = r4.getLwjglNativeDirectory()
            java.util.List r4 = listSharedLibraries(r4)
            java.util.Iterator r4 = r4.iterator()
        L205:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L215
            java.lang.Object r5 = r4.next()
            java.io.File r5 = (java.io.File) r5
            dlopenOptional(r5)
            goto L205
        L215:
            return
    }

    private static void preloadWebRtcLinuxDesktopShims(android.content.Context r2) {
            java.lang.String r0 = "pulse"
            java.lang.String r1 = "libpulse.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "udev"
            java.lang.String r1 = "libudev.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "dbus-1"
            java.lang.String r1 = "libdbus-1.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "X11"
            java.lang.String r1 = "libX11.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xfixes"
            java.lang.String r1 = "libXfixes.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xrandr"
            java.lang.String r1 = "libXrandr.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xcomposite"
            java.lang.String r1 = "libXcomposite.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xdamage"
            java.lang.String r1 = "libXdamage.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xrender"
            java.lang.String r1 = "libXrender.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xext"
            java.lang.String r1 = "libXext.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xi"
            java.lang.String r1 = "libXi.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xtst"
            java.lang.String r1 = "libXtst.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xcursor"
            java.lang.String r1 = "libXcursor.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xinerama"
            java.lang.String r1 = "libXinerama.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xss"
            java.lang.String r1 = "libXss.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "xcb"
            java.lang.String r1 = "libxcb.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xau"
            java.lang.String r1 = "libXau.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "Xdmcp"
            java.lang.String r1 = "libXdmcp.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "drm"
            java.lang.String r1 = "libdrm.so"
            preloadPackagedNativeShim(r2, r0, r1)
            java.lang.String r0 = "gbm"
            java.lang.String r1 = "libgbm.so"
            preloadPackagedNativeShim(r2, r0, r1)
            return
    }

    public static ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths prepare(android.content.Context r8, ca.dnamobile.javalauncher.launcher.LaunchPlan r9, ca.dnamobile.javalauncher.renderer.RendererInterface r10) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r8)
            ca.dnamobile.javalauncher.renderer.AdrenoSyncFenceFdGuard.startIfNeeded(r10)
            java.io.File r0 = r9.getGameDirectory()
            ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat$Result r5 = ca.dnamobile.javalauncher.modcompat.FFmpegPluginCompat.discoverForReplayMod(r8, r0)
            ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader$Result r0 = prepareLiteGlesIfNeeded(r8, r9, r10)
            ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap$RuntimePaths r7 = ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths.resolve(r8, r9, r10, r5, r0)
            ca.dnamobile.javalauncher.modcompat.DiscordRpcCompatPatch.apply(r8, r9)
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r7
            r6 = r0
            applyEnvironment(r1, r2, r3, r4, r5, r6)
            pushLdLibraryPath(r7)
            ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.preload(r8, r10)
            preloadAndroidWebRtcNativeTest(r8)
            boolean r1 = shouldPreloadLinuxDesktopShims(r10)
            if (r1 == 0) goto L34
            preloadWebRtcLinuxDesktopShims(r8)
            goto L3b
        L34:
            java.lang.String r8 = "JavaRuntimeBootstrap"
            java.lang.String r1 = "Skipping Linux desktop/WebRTC shims for DroidBridge Mesa renderer to avoid libdrm/libgbm/X11 shadowing"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r8, r1)
        L3b:
            preloadRuntimeAndGraphics(r9, r10, r7, r0)
            return r7
    }

    private static void prepareAwtDummyNative(ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r2 = "libawt_xawt.so"
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            java.io.File r3 = r3.runtimeLibDir
            r1.<init>(r3, r2)
            copyRuntimeNativeIfNeeded(r0, r1)
            return
    }

    private static ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.Result prepareLiteGlesIfNeeded(android.content.Context r6, ca.dnamobile.javalauncher.launcher.LaunchPlan r7, ca.dnamobile.javalauncher.renderer.RendererInterface r8) {
            java.lang.String r0 = "JavaRuntimeBootstrap"
            java.lang.String r1 = "LiteGLES renderer staged OSMesa="
            java.lang.String r2 = "Preparing LiteGLES renderer plugin into "
            boolean r8 = isLiteGlesRenderer(r8)
            if (r8 != 0) goto Le
            r6 = 0
            return r6
        Le:
            java.io.File r8 = new java.io.File
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "natives/"
            r4.<init>(r5)
            java.lang.String r7 = r7.getVersionId()
            java.lang.StringBuilder r7 = r4.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r3, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r2 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r7 = r7.append(r2)     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L59
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = "ca.dnamobile.renderer.litegles"
            ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader$Result r6 = ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.prepare(r6, r7, r8)     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L59
            java.io.File r8 = r6.stagedOSMesaLibrary     // Catch: java.lang.Throwable -> L59
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> L59
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L59
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L59
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r7)     // Catch: java.lang.Throwable -> L59
            return r6
        L59:
            r6 = move-exception
            java.lang.String r7 = "LiteGLES renderer plugin preload failed"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r7, r6)
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r7, r6)
            throw r8
    }

    private static void pushLdLibraryPath(ca.dnamobile.javalauncher.launcher.JavaRuntimeBootstrap.RuntimePaths r3) {
            java.lang.String r0 = "JavaRuntimeBootstrap"
            java.lang.String r1 = "setLdLibraryPath="
            java.lang.String r2 = r3.nativeLinkerPath     // Catch: java.lang.Throwable -> L1c
            net.kdt.pojavlaunch.utils.JREUtils.setLdLibraryPath(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r3.nativeLinkerPath     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r3 = r2.append(r3)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r3)     // Catch: java.lang.Throwable -> L1c
            goto L22
        L1c:
            r3 = move-exception
            java.lang.String r1 = "Failed to push LD_LIBRARY_PATH into native linker"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r3)
        L22:
            return
    }

    private static java.lang.String resolveJvmArgValue(ca.dnamobile.javalauncher.launcher.LaunchPlan r2, java.lang.String r3, java.lang.String r4) {
            java.util.List r2 = r2.getJvmArgs()
            java.util.Iterator r2 = r2.iterator()
        L8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L8
            boolean r1 = r0.startsWith(r3)
            if (r1 == 0) goto L8
            int r1 = r3.length()
            java.lang.String r0 = r0.substring(r1)
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L8
            return r0
        L2f:
            return r4
    }

    private static java.lang.String safeEnv(java.lang.String r0) {
            java.lang.String r0 = android.system.Os.getenv(r0)
            if (r0 == 0) goto L7
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            return r0
    }

    private static java.lang.String sanitizeLibraryName(java.lang.String r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = r2.trim()
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L2a
            java.lang.String r1 = "null"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 != 0) goto L2a
            java.lang.String r1 = "(null)"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L20
            goto L2a
        L20:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r2 = r0.getName()
            return r2
        L2a:
            return r0
    }

    private static void seedRendererEnvironmentReset(java.util.LinkedHashMap<java.lang.String, java.lang.String> r5) {
            r0 = 73
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "POJAV_RENDERER"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "POJAVEXEC_EGL"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "POJAV_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "POJAVEXEC_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "POJAV_RENDERER_LIBRARY"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "POJAVEXEC_RENDERER"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "POJAV_OSMESA_LIBRARY"
            r1[r2] = r4
            r2 = 7
            java.lang.String r4 = "OSMESA_LIBRARY"
            r1[r2] = r4
            r2 = 8
            java.lang.String r4 = "OSMESA_LIB"
            r1[r2] = r4
            r2 = 9
            java.lang.String r4 = "LIBGL_OSMESA"
            r1[r2] = r4
            r2 = 10
            java.lang.String r4 = "LIB_MESA_NAME"
            r1[r2] = r4
            r2 = 11
            java.lang.String r4 = "LIBGL_ES"
            r1[r2] = r4
            r2 = 12
            java.lang.String r4 = "LIBGL_GL"
            r1[r2] = r4
            r2 = 13
            java.lang.String r4 = "LIBGL_FBO"
            r1[r2] = r4
            r2 = 14
            java.lang.String r4 = "LIBGL_MIPMAP"
            r1[r2] = r4
            r2 = 15
            java.lang.String r4 = "LIBGL_NOINTOVLHACK"
            r1[r2] = r4
            r2 = 16
            java.lang.String r4 = "LIBGL_NORMALIZE"
            r1[r2] = r4
            r2 = 17
            java.lang.String r4 = "LIBGL_NOERROR"
            r1[r2] = r4
            r2 = 18
            java.lang.String r4 = "DROIDBRIDGE_MESA"
            r1[r2] = r4
            r2 = 19
            java.lang.String r4 = "DROIDBRIDGE_MESA_MODE"
            r1[r2] = r4
            r2 = 20
            java.lang.String r4 = "DROIDBRIDGE_MESA_DRIVER"
            r1[r2] = r4
            r2 = 21
            java.lang.String r4 = "DROIDBRIDGE_MESA_NATIVE_DIR"
            r1[r2] = r4
            r2 = 22
            java.lang.String r4 = "DROIDBRIDGE_MESA_ALIAS_DIR"
            r1[r2] = r4
            r2 = 23
            java.lang.String r4 = "DROIDBRIDGE_MESA_NAMESPACE"
            r1[r2] = r4
            r2 = 24
            java.lang.String r4 = "DROIDBRIDGE_MESA_NAMESPACE_PATH"
            r1[r2] = r4
            r2 = 25
            java.lang.String r4 = "DROIDBRIDGE_MESA_EGL"
            r1[r2] = r4
            r2 = 26
            java.lang.String r4 = "DROIDBRIDGE_MESA_GL"
            r1[r2] = r4
            r2 = 27
            java.lang.String r4 = "DROIDBRIDGE_MESA_EGL_SINGLE_INSTANCE"
            r1[r2] = r4
            r2 = 28
            java.lang.String r4 = "DROIDBRIDGE_MESA_EGL_PLATFORM_DISPLAY"
            r1[r2] = r4
            r2 = 29
            java.lang.String r4 = "DROIDBRIDGE_MESA_EGL_SHIM"
            r1[r2] = r4
            r2 = 30
            java.lang.String r4 = "DROIDBRIDGE_MESA_DESKTOP_GL"
            r1[r2] = r4
            r2 = 31
            java.lang.String r4 = "DROIDBRIDGE_MESA_SAFE_SWAPS"
            r1[r2] = r4
            r2 = 32
            java.lang.String r4 = "DROIDBRIDGE_ZINK_V59_CLEAN_ALIAS"
            r1[r2] = r4
            r2 = 33
            java.lang.String r4 = "DROIDBRIDGE_LEGACY_FREEDRENO_ALIAS_V59"
            r1[r2] = r4
            r2 = 34
            java.lang.String r4 = "DROIDBRIDGE_EGL_FORCE_DESKTOP_GL"
            r1[r2] = r4
            r2 = 35
            java.lang.String r4 = "DROIDBRIDGE_EGL_NO_SYSTEM_FALLBACK"
            r1[r2] = r4
            r2 = 36
            java.lang.String r4 = "DROIDBRIDGE_EGL_RECOVER_CURRENT"
            r1[r2] = r4
            r2 = 37
            java.lang.String r4 = "POJAV_RENDERER_MESA_MODE"
            r1[r2] = r4
            r2 = 38
            java.lang.String r4 = "MESA_PROCESS_NAME"
            r1[r2] = r4
            r2 = 39
            java.lang.String r4 = "MESA_DRICONF_EXECUTABLE_OVERRIDE"
            r1[r2] = r4
            r2 = 40
            java.lang.String r4 = "MESA_LOADER_DRIVER_OVERRIDE"
            r1[r2] = r4
            r2 = 41
            java.lang.String r4 = "GALLIUM_DRIVER"
            r1[r2] = r4
            r2 = 42
            java.lang.String r4 = "MESA_GL_VERSION_OVERRIDE"
            r1[r2] = r4
            r2 = 43
            java.lang.String r4 = "MESA_GLSL_VERSION_OVERRIDE"
            r1[r2] = r4
            r2 = 44
            java.lang.String r4 = "MESA_EXTENSION_OVERRIDE"
            r1[r2] = r4
            r2 = 45
            java.lang.String r4 = "MESA_GLSL_CACHE_DIR"
            r1[r2] = r4
            r2 = 46
            java.lang.String r4 = "MESA_SHADER_CACHE_DIR"
            r1[r2] = r4
            r2 = 47
            java.lang.String r4 = "LIBGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 48
            java.lang.String r4 = "EGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 49
            java.lang.String r4 = "DRIVER_PATH"
            r1[r2] = r4
            r2 = 50
            java.lang.String r4 = "VK_ICD_FILENAMES"
            r1[r2] = r4
            r2 = 51
            java.lang.String r4 = "VK_DRIVER_FILES"
            r1[r2] = r4
            r2 = 52
            java.lang.String r4 = "VK_INSTANCE_LAYERS"
            r1[r2] = r4
            r2 = 53
            java.lang.String r4 = "VULKAN_PTR"
            r1[r2] = r4
            r2 = 54
            java.lang.String r4 = "POJAV_LOAD_TURNIP"
            r1[r2] = r4
            r2 = 55
            java.lang.String r4 = "DROIDBRIDGE_LOAD_TURNIP"
            r1[r2] = r4
            r2 = 56
            java.lang.String r4 = "DROIDBRIDGE_USE_CUSTOM_TURNIP"
            r1[r2] = r4
            r2 = 57
            java.lang.String r4 = "DROIDBRIDGE_CUSTOM_VULKAN_DRIVER"
            r1[r2] = r4
            r2 = 58
            java.lang.String r4 = "POJAV_CUSTOM_VULKAN_DRIVER"
            r1[r2] = r4
            r2 = 59
            java.lang.String r4 = "POJAV_USE_SYSTEM_VULKAN"
            r1[r2] = r4
            r2 = 60
            java.lang.String r4 = "TU_DEBUG"
            r1[r2] = r4
            r2 = 61
            java.lang.String r4 = "ZINK_DEBUG"
            r1[r2] = r4
            r2 = 62
            java.lang.String r4 = "ZINK_DESCRIPTORS"
            r1[r2] = r4
            r2 = 63
            java.lang.String r4 = "EGL_PLATFORM"
            r1[r2] = r4
            r2 = 64
            java.lang.String r4 = "MESA_ANDROID_NO_KMS_SWRAST"
            r1[r2] = r4
            r2 = 65
            java.lang.String r4 = "FORCE_VSYNC"
            r1[r2] = r4
            r2 = 66
            java.lang.String r4 = "allow_higher_compat_version"
            r1[r2] = r4
            r2 = 67
            java.lang.String r4 = "force_glsl_extensions_warn"
            r1[r2] = r4
            r2 = 68
            java.lang.String r4 = "allow_glsl_extension_directive_midshader"
            r1[r2] = r4
            r2 = 69
            java.lang.String r4 = "mesa_glthread"
            r1[r2] = r4
            r2 = 70
            java.lang.String r4 = "MESA_DEBUG"
            r1[r2] = r4
            r2 = 71
            java.lang.String r4 = "MESA_NO_ERROR"
            r1[r2] = r4
            r2 = 72
            java.lang.String r4 = "MESA_VK_WSI_PRESENT_MODE"
            r1[r2] = r4
        L1b2:
            if (r3 >= r0) goto L1be
            r2 = r1[r3]
            java.lang.String r4 = ""
            r5.put(r2, r4)
            int r3 = r3 + 1
            goto L1b2
        L1be:
            return
    }

    private static void setEnv(java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = "JavaRuntimeBootstrap"
            java.lang.String r1 = "env unset "
            java.lang.String r2 = "env "
            if (r5 != 0) goto L9
            return
        L9:
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L23
            android.system.Os.unsetenv(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r5 = r5.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L42
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> L42
            goto L55
        L23:
            r1 = 1
            android.system.Os.setenv(r4, r5, r1)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L42
            java.lang.String r2 = "="
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.StringBuilder r5 = r1.append(r5)     // Catch: java.lang.Throwable -> L42
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L42
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> L42
            goto L55
        L42:
            r5 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to update env "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r5)
        L55:
            return
    }

    private static boolean shouldApplyDriverPluginEnvironment(ca.dnamobile.javalauncher.renderer.RendererInterface r1) {
            if (r1 == 0) goto L10
            boolean r0 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isMesaZinkTurnipRenderer(r1)
            if (r0 != 0) goto Le
            boolean r1 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.isVulkanZinkRenderer(r1)
            if (r1 == 0) goto L10
        Le:
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
    }

    private static boolean shouldPreloadLinuxDesktopShims(ca.dnamobile.javalauncher.renderer.RendererInterface r3) {
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            boolean r1 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isDroidBridgeMesaRenderer(r3)
            r2 = 0
            if (r1 == 0) goto Lc
            return r2
        Lc:
            boolean r1 = ca.dnamobile.javalauncher.renderer.DroidBridgeMesaSupport.isVulkanZinkOrLegacyAlias(r3)
            if (r1 == 0) goto L13
            return r2
        L13:
            boolean r3 = ca.dnamobile.javalauncher.renderer.DriverPluginManager.isVulkanZinkRenderer(r3)
            if (r3 == 0) goto L1a
            return r2
        L1a:
            return r0
    }

    private static boolean shouldPrepareAwtNative(ca.dnamobile.javalauncher.launcher.LaunchPlan r3) {
            java.util.List r0 = r3.getJvmArgs()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L17
            goto L8
        L17:
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "cacio"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L35
            java.lang.String r2 = "-dawt.toolkit="
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L35
            java.lang.String r2 = "-djava.awt.graphicsenv="
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L8
        L35:
            r3 = 1
            return r3
        L37:
            java.lang.String r3 = r3.getVersionId()
            boolean r3 = isPre16Version(r3)
            return r3
    }
}
