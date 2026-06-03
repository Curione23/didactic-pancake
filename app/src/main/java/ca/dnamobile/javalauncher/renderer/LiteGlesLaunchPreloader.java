package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class LiteGlesLaunchPreloader {
    public static final java.lang.String ENTRY_CLASS = "ca.dnamobile.renderer.litegles.plugin.LiteGlesPlugin";
    private static final java.lang.String METHOD_GET_CONFIG = "getConfig";
    public static final java.lang.String PACKAGE_NAME = "ca.dnamobile.renderer.litegles";
    private static final android.net.Uri SETTINGS_URI = null;

    public static final class Result {
        public final java.lang.String mergedNativePath;
        public final java.io.File pluginNativeDir;
        public final java.io.File stagedMainLibrary;
        public final java.io.File stagedNativeDir;
        public final java.io.File stagedOSMesaLibrary;

        Result(java.io.File r1, java.io.File r2, java.io.File r3, java.io.File r4, java.lang.String r5) {
                r0 = this;
                r0.<init>()
                r0.pluginNativeDir = r1
                r0.stagedNativeDir = r2
                r0.stagedMainLibrary = r3
                r0.stagedOSMesaLibrary = r4
                r0.mergedNativePath = r5
                return
        }
    }

    static {
            java.lang.String r0 = "content://ca.dnamobile.renderer.litegles.settings/config"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.SETTINGS_URI = r0
            return
    }

    private LiteGlesLaunchPreloader() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void applyEnvironmentBlock(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r0 = "\\n"
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L10:
            if (r2 >= r0) goto L3b
            r3 = r6[r2]
            r4 = 61
            int r4 = r3.indexOf(r4)
            if (r4 > 0) goto L1d
            goto L38
        L1d:
            java.lang.String r5 = r3.substring(r1, r4)
            java.lang.String r5 = r5.trim()
            int r4 = r4 + 1
            java.lang.String r3 = r3.substring(r4)
            java.lang.String r3 = r3.trim()
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L38
            setEnv(r5, r3)
        L38:
            int r2 = r2 + 1
            goto L10
        L3b:
            return
    }

    private static java.lang.Boolean callPluginPrepare(android.content.Context r7, java.io.File r8) throws java.lang.Exception {
            java.lang.String r0 = "prepareForLaunch"
            java.lang.ClassLoader r1 = r7.getClassLoader()
            java.lang.String r2 = "ca.dnamobile.renderer.litegles.plugin.LiteGlesPlugin"
            java.lang.Class r1 = r1.loadClass(r2)
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.NoSuchMethodException -> L34
            java.lang.Class<android.content.Context> r6 = android.content.Context.class
            r5[r3] = r6     // Catch: java.lang.NoSuchMethodException -> L34
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r4] = r6     // Catch: java.lang.NoSuchMethodException -> L34
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: java.lang.NoSuchMethodException -> L34
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.NoSuchMethodException -> L34
            java.lang.Object[] r8 = new java.lang.Object[]{r7, r8}     // Catch: java.lang.NoSuchMethodException -> L34
            java.lang.Object r8 = r5.invoke(r2, r8)     // Catch: java.lang.NoSuchMethodException -> L34
            boolean r5 = r8 instanceof java.lang.Boolean     // Catch: java.lang.NoSuchMethodException -> L34
            if (r5 == 0) goto L31
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.NoSuchMethodException -> L34
            goto L33
        L31:
            java.lang.Boolean r8 = java.lang.Boolean.TRUE     // Catch: java.lang.NoSuchMethodException -> L34
        L33:
            return r8
        L34:
            java.lang.Class[] r8 = new java.lang.Class[r4]
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r8[r3] = r4
            java.lang.reflect.Method r8 = r1.getMethod(r0, r8)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object r7 = r8.invoke(r2, r7)
            boolean r8 = r7 instanceof java.lang.Boolean
            if (r8 == 0) goto L4d
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            goto L4f
        L4d:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
        L4f:
            return r7
    }

    private static void copyAlways(java.io.File r5, java.io.File r6) throws java.io.IOException {
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto L28
            boolean r1 = r0.isDirectory()
            if (r1 != 0) goto L28
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L28
        L13:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not create "
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L28:
            java.io.File r0 = new java.io.File
            java.io.File r1 = r6.getParentFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".tmp"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            r1 = 65536(0x10000, float:9.1835E-41)
            byte[] r1 = new byte[r1]
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r5)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lc7
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lc7
        L56:
            int r3 = r2.read(r1)     // Catch: java.lang.Throwable -> Lbd
            r4 = 0
            if (r3 < 0) goto L61
            r5.write(r1, r4, r3)     // Catch: java.lang.Throwable -> Lbd
            goto L56
        L61:
            java.io.FileDescriptor r1 = r5.getFD()     // Catch: java.lang.Throwable -> Lbd
            r1.sync()     // Catch: java.lang.Throwable -> Lbd
            r5.close()     // Catch: java.lang.Throwable -> Lc7
            r2.close()
            r5 = 1
            r0.setReadable(r5, r4)
            r0.setExecutable(r5, r4)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L97
            boolean r5 = r6.delete()
            if (r5 == 0) goto L82
            goto L97
        L82:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not replace "
            r0.<init>(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L97:
            boolean r5 = r0.renameTo(r6)
            if (r5 == 0) goto L9e
            return
        L9e:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not move "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " to "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lbd:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> Lc2
            goto Lc6
        Lc2:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> Lc7
        Lc6:
            throw r6     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r5 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Lcc
            goto Ld0
        Lcc:
            r6 = move-exception
            r5.addSuppressed(r6)
        Ld0:
            throw r5
    }

    private static java.io.File firstExisting(java.io.File r8, java.lang.String... r9) {
            int r0 = r9.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L1f
            r2 = r9[r1]
            java.io.File r3 = new java.io.File
            r3.<init>(r8, r2)
            boolean r2 = r3.isFile()
            if (r2 == 0) goto L1c
            long r4 = r3.length()
            r6 = 0
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto L1c
            return r3
        L1c:
            int r1 = r1 + 1
            goto L2
        L1f:
            r8 = 0
            return r8
    }

    private static java.io.File firstExistingOr(java.io.File r3, java.io.File r4, java.lang.String r5) {
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r5)
            boolean r4 = r0.isFile()
            if (r4 == 0) goto L16
            long r4 = r0.length()
            r1 = 0
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L16
            r3 = r0
        L16:
            return r3
    }

    private static java.lang.String mergePaths(java.lang.String... r9) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            if (r9 == 0) goto L30
            int r1 = r9.length
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L30
            r4 = r9[r3]
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L15
            goto L2d
        L15:
            java.lang.String r5 = java.io.File.pathSeparator
            java.lang.String[] r4 = r4.split(r5)
            int r5 = r4.length
            r6 = r2
        L1d:
            if (r6 >= r5) goto L2d
            r7 = r4[r6]
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L2a
            r0.add(r7)
        L2a:
            int r6 = r6 + 1
            goto L1d
        L2d:
            int r3 = r3 + 1
            goto La
        L30:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.util.Iterator r0 = r0.iterator()
        L39:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L54
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            int r2 = r9.length()
            if (r2 <= 0) goto L50
            java.lang.String r2 = java.io.File.pathSeparator
            r9.append(r2)
        L50:
            r9.append(r1)
            goto L39
        L54:
            java.lang.String r9 = r9.toString()
            return r9
    }

    public static ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.Result prepare(android.content.Context r12, java.lang.String r13, java.io.File r14) throws java.lang.Exception {
            r0 = 3
            android.content.Context r13 = r12.createPackageContext(r13, r0)
            android.content.pm.ApplicationInfo r1 = r13.getApplicationInfo()
            java.io.File r3 = new java.io.File
            java.lang.String r1 = r1.nativeLibraryDir
            r3.<init>(r1)
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L1dc
            boolean r1 = r14.isDirectory()
            if (r1 != 0) goto L38
            boolean r1 = r14.mkdirs()
            if (r1 == 0) goto L23
            goto L38
        L23:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not create staged native dir: "
            r13.<init>(r0)
            java.lang.StringBuilder r13 = r13.append(r14)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
        L38:
            android.os.Bundle r12 = readProviderBundle(r12)
            java.lang.String r1 = ""
            if (r12 == 0) goto L46
            java.lang.String r2 = "environmentBlock"
            java.lang.String r1 = r12.getString(r2, r1)
        L46:
            java.lang.String r2 = "missing"
            if (r12 == 0) goto L50
            java.lang.String r4 = "profile"
            java.lang.String r2 = r12.getString(r4, r2)
        L50:
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L5f
            java.lang.String r6 = "directVbo"
            boolean r6 = r12.getBoolean(r6, r5)
            if (r6 == 0) goto L5d
            goto L5f
        L5d:
            r6 = r4
            goto L60
        L5f:
            r6 = r5
        L60:
            if (r12 == 0) goto L6d
            java.lang.String r7 = "cacheLists"
            boolean r12 = r12.getBoolean(r7, r5)
            if (r12 == 0) goto L6b
            goto L6d
        L6b:
            r12 = r4
            goto L6e
        L6d:
            r12 = r5
        L6e:
            java.io.PrintStream r7 = java.lang.System.out
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "DroidBridgeLiteGLES: provider profile before native load="
            r8.<init>(r9)
            java.lang.StringBuilder r8 = r8.append(r2)
            java.lang.String r9 = ", directVbo="
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r8 = ", cacheLists="
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.StringBuilder r12 = r6.append(r12)
            java.lang.String r12 = r12.toString()
            r7.println(r12)
            java.io.File r12 = stageAliases(r3, r14)
            java.io.File r6 = new java.io.File
            java.lang.String r7 = "libOSMesa.so"
            r6.<init>(r14, r7)
            java.io.File r7 = new java.io.File
            java.lang.String r8 = "libOSMesa_8.so"
            r7.<init>(r14, r8)
            java.io.File r8 = new java.io.File
            java.lang.String r9 = "libGL.so"
            r8.<init>(r14, r9)
            java.lang.String r9 = "DB_LITEGLES_PLUGIN_NATIVE_DIR"
            java.lang.String r10 = r3.getAbsolutePath()
            setEnv(r9, r10)
            java.lang.String r9 = "DB_LITEGLES_STAGED_NATIVE_DIR"
            java.lang.String r10 = r14.getAbsolutePath()
            setEnv(r9, r10)
            java.lang.String r9 = "DB_LITEGLES_OSMESA_PATH"
            java.lang.String r10 = r6.getAbsolutePath()
            setEnv(r9, r10)
            java.lang.String r9 = "POJAV_OSMESA_LIBRARY"
            java.lang.String r10 = r6.getAbsolutePath()
            setEnv(r9, r10)
            java.lang.String r9 = "OSMESA_LIBRARY"
            java.lang.String r10 = r6.getAbsolutePath()
            setEnv(r9, r10)
            java.lang.String r9 = "OSMESA_LIB"
            java.lang.String r10 = r6.getAbsolutePath()
            setEnv(r9, r10)
            java.lang.String r9 = "LIBGL_OSMESA"
            java.lang.String r10 = r6.getAbsolutePath()
            setEnv(r9, r10)
            java.lang.String r9 = "LIBGL_ES"
            java.lang.String r10 = "2"
            setEnv(r9, r10)
            java.lang.String r9 = "LIBGL_GL"
            java.lang.String r10 = "21"
            setEnv(r9, r10)
            java.lang.String r9 = "LIBGL_FBO"
            java.lang.String r10 = "1"
            setEnv(r9, r10)
            java.lang.String r9 = "POJAV_RENDERER"
            java.lang.String r10 = "opengles3"
            setEnv(r9, r10)
            applyEnvironmentBlock(r1)
            r9 = 5
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.String r10 = r14.getAbsolutePath()
            r9[r4] = r10
            java.lang.String r4 = r3.getAbsolutePath()
            r9[r5] = r4
            r4 = 2
            java.lang.String r5 = "java.library.path"
            java.lang.String r10 = java.lang.System.getProperty(r5)
            r9[r4] = r10
            java.lang.String r4 = "org.lwjgl.librarypath"
            java.lang.String r10 = java.lang.System.getProperty(r4)
            r9[r0] = r10
            r0 = 4
            java.lang.String r10 = "org.lwjgl.system.librarypath"
            java.lang.String r11 = java.lang.System.getProperty(r10)
            r9[r0] = r11
            java.lang.String r0 = mergePaths(r9)
            java.lang.System.setProperty(r5, r0)
            java.lang.System.setProperty(r4, r0)
            java.lang.System.setProperty(r10, r0)
            java.lang.String r4 = "org.lwjgl.system.SharedLibraryExtractPath"
            java.lang.String r5 = r14.getAbsolutePath()
            java.lang.System.setProperty(r4, r5)
            java.lang.String r4 = "droidbridge.osmesa.path"
            java.lang.String r5 = r6.getAbsolutePath()
            java.lang.System.setProperty(r4, r5)
            java.lang.String r4 = "droidbridge.renderer.plugin.nativeDir"
            java.lang.String r5 = r3.getAbsolutePath()
            java.lang.System.setProperty(r4, r5)
            java.lang.String r4 = "droidbridge.renderer.stagedNativeDir"
            java.lang.String r5 = r14.getAbsolutePath()
            java.lang.System.setProperty(r4, r5)
            java.lang.String r4 = "droidbridge.litegles.profile"
            java.lang.System.setProperty(r4, r2)
            java.lang.String r2 = r6.getAbsolutePath()
            java.lang.System.load(r2)
            java.lang.Boolean r13 = callPluginPrepare(r13, r14)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r13 = r2.equals(r13)
            if (r13 == 0) goto L1d4
            applyEnvironmentBlock(r1)
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridgeLiteGLES: staged libOSMesa="
            r1.<init>(r2)
            java.lang.String r2 = r6.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.println(r1)
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridgeLiteGLES: staged libOSMesa_8="
            r1.<init>(r2)
            java.lang.String r2 = r7.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.println(r1)
            java.io.PrintStream r13 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridgeLiteGLES: staged libGL="
            r1.<init>(r2)
            java.lang.String r2 = r8.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r13.println(r1)
            ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader$Result r13 = new ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader$Result
            r2 = r13
            r4 = r14
            r5 = r12
            r7 = r0
            r2.<init>(r3, r4, r5, r6, r7)
            return r13
        L1d4:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "LiteGLES plugin prepareForLaunch returned false"
            r12.<init>(r13)
            throw r12
        L1dc:
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = "Renderer nativeLibraryDir does not exist: "
            r13.<init>(r14)
            java.lang.StringBuilder r13 = r13.append(r3)
            java.lang.String r13 = r13.toString()
            r12.<init>(r13)
            throw r12
    }

    private static android.os.Bundle readProviderBundle(android.content.Context r5) {
            java.lang.String r0 = ""
            java.lang.String r1 = "DroidBridgeLiteGLES: provider config version="
            r2 = 0
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L5d
            android.net.Uri r3 = ca.dnamobile.javalauncher.renderer.LiteGlesLaunchPreloader.SETTINGS_URI     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "getConfig"
            android.os.Bundle r5 = r5.call(r3, r4, r2, r2)     // Catch: java.lang.Throwable -> L5d
            if (r5 == 0) goto L5c
            java.io.PrintStream r3 = java.lang.System.out     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "version"
            java.lang.String r1 = r5.getString(r1, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = ", profile="
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r4 = "profile"
            java.lang.String r0 = r5.getString(r4, r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = ", directVbo="
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "directVbo"
            r4 = 1
            boolean r1 = r5.getBoolean(r1, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = ", cacheLists="
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = "cacheLists"
            boolean r1 = r5.getBoolean(r1, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5d
            r3.println(r0)     // Catch: java.lang.Throwable -> L5d
        L5c:
            return r5
        L5d:
            r5 = move-exception
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "DroidBridgeLiteGLES: provider config unavailable -> "
            r1.<init>(r3)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.println(r5)
            return r2
    }

    private static void setEnv(java.lang.String r1, java.lang.String r2) {
            r0 = 1
            android.system.Os.setenv(r1, r2, r0)     // Catch: java.lang.Throwable -> L4
        L4:
            return
    }

    private static java.io.File stageAliases(java.io.File r7, java.io.File r8) throws java.io.IOException {
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "libdroidbridge_litegl.so"
            r0[r1] = r2
            r1 = 1
            java.lang.String r3 = "libOSMesa.so"
            r0[r1] = r3
            r1 = 2
            java.lang.String r4 = "libOSMesa_8.so"
            r0[r1] = r4
            r1 = 3
            java.lang.String r5 = "libGL.so"
            r0[r1] = r5
            java.io.File r0 = firstExisting(r7, r0)
            if (r0 == 0) goto L5d
            java.io.File r1 = new java.io.File
            r1.<init>(r8, r2)
            copyAlways(r0, r1)
            java.io.File r1 = firstExistingOr(r0, r7, r3)
            java.io.File r6 = new java.io.File
            r6.<init>(r8, r3)
            copyAlways(r1, r6)
            java.io.File r1 = firstExistingOr(r0, r7, r4)
            java.io.File r3 = new java.io.File
            r3.<init>(r8, r4)
            copyAlways(r1, r3)
            java.lang.String r1 = "libOSMesa8.so"
            java.io.File r3 = firstExistingOr(r0, r7, r1)
            java.io.File r4 = new java.io.File
            r4.<init>(r8, r1)
            copyAlways(r3, r4)
            java.io.File r7 = firstExistingOr(r0, r7, r5)
            java.io.File r0 = new java.io.File
            r0.<init>(r8, r5)
            copyAlways(r7, r0)
            java.io.File r7 = new java.io.File
            r7.<init>(r8, r2)
            return r7
        L5d:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LiteGLES native library was not found in "
            r0.<init>(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            r8.<init>(r7)
            throw r8
    }
}
