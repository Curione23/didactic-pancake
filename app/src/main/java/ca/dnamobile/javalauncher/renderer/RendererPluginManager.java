package ca.dnamobile.javalauncher.renderer;

/* JADX INFO: loaded from: classes.dex */
public final class RendererPluginManager {
    private static final java.lang.String[] KNOWN_RENDERER_PLUGIN_PACKAGES = null;
    private static final java.lang.String[] META_RENDERER_DESC = null;
    private static final java.lang.String[] META_RENDERER_DLOPEN = null;
    private static final java.lang.String[] META_RENDERER_EGL = null;
    private static final java.lang.String[] META_RENDERER_ENV = null;
    private static final java.lang.String[] META_RENDERER_ID = null;
    private static final java.lang.String[] META_RENDERER_LIBRARY = null;
    private static final java.lang.String[] META_RENDERER_NAME = null;
    private static final java.lang.String TAG = "RendererPluginManager";

    /* JADX INFO: renamed from: $r8$lambda$OA1lKlnpHGCy68ydBjM-YT3qdKg, reason: not valid java name */
    public static /* synthetic */ java.lang.String m557$r8$lambda$OA1lKlnpHGCy68ydBjMYT3qdKg(java.io.File r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    /* JADX INFO: renamed from: $r8$lambda$_sH-z_aSCQjK6FVafyUlyiC2V-c, reason: not valid java name */
    public static /* synthetic */ java.lang.String m558$r8$lambda$_sHz_aSCQjK6FVafyUlyiC2Vc(java.util.zip.ZipEntry r0) {
            java.lang.String r0 = r0.getName()
            return r0
    }

    static {
            r0 = 17
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r1 = "com.fcl.plugin.mobileglues"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "com.bzlzhh.plugin.ngg"
            r3 = 1
            r0[r3] = r1
            java.lang.String r1 = "com.bzlzhh.plugin.ngg.angleless"
            r4 = 2
            r0[r4] = r1
            java.lang.String r1 = "com.mio.plugin.renderer.gl4es"
            r5 = 3
            r0[r5] = r1
            java.lang.String r1 = "com.mio.plugin.renderer.mesa2500.rc1"
            r6 = 4
            r0[r6] = r1
            java.lang.String r1 = "com.mio.plugin.renderer.mobileglues"
            r7 = 5
            r0[r7] = r1
            r1 = 6
            java.lang.String r8 = "com.mio.plugin.renderer.ltw"
            r0[r1] = r8
            r1 = 7
            java.lang.String r8 = "com.mio.plugin.renderer.angle"
            r0[r1] = r8
            r1 = 8
            java.lang.String r8 = "com.mio.plugin.renderer.mesa2319"
            r0[r1] = r8
            r1 = 9
            java.lang.String r8 = "com.mio.plugin.renderer.mesa2427"
            r0[r1] = r8
            r1 = 10
            java.lang.String r8 = "com.mio.plugin.renderer.mesa2434"
            r0[r1] = r8
            r1 = 11
            java.lang.String r8 = "com.mio.plugin.renderer.mesa2500"
            r0[r1] = r8
            r1 = 12
            java.lang.String r8 = "com.fcl.plugin.renderer.mobileglues"
            r0[r1] = r8
            r1 = 13
            java.lang.String r8 = "com.fcl.plugin.renderer.ltw"
            r0[r1] = r8
            r1 = 14
            java.lang.String r8 = "com.fcl.plugin.renderer.gl4es"
            r0[r1] = r8
            r1 = 15
            java.lang.String r8 = "com.fcl.plugin.renderer.angle"
            r0[r1] = r8
            r1 = 16
            java.lang.String r8 = "com.fcl.plugin.renderer.mesa"
            r0[r1] = r8
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.KNOWN_RENDERER_PLUGIN_PACKAGES = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "renderer_id"
            r0[r2] = r1
            java.lang.String r1 = "rendererId"
            r0[r3] = r1
            java.lang.String r1 = "RENDERER_ID"
            r0[r4] = r1
            java.lang.String r1 = "com.movtery.zalithlauncher.renderer.ID"
            r0[r5] = r1
            java.lang.String r1 = "net.kdt.pojavlaunch.renderer.ID"
            r0[r6] = r1
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_ID = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "renderer_name"
            r0[r2] = r1
            java.lang.String r1 = "rendererName"
            r0[r3] = r1
            java.lang.String r1 = "RENDERER_NAME"
            r0[r4] = r1
            java.lang.String r1 = "com.movtery.zalithlauncher.renderer.NAME"
            r0[r5] = r1
            java.lang.String r1 = "net.kdt.pojavlaunch.renderer.NAME"
            r0[r6] = r1
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_NAME = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "renderer_description"
            r0[r2] = r1
            java.lang.String r1 = "rendererDescription"
            r0[r3] = r1
            java.lang.String r1 = "RENDERER_DESCRIPTION"
            r0[r4] = r1
            java.lang.String r1 = "com.movtery.zalithlauncher.renderer.DESCRIPTION"
            r0[r5] = r1
            java.lang.String r1 = "net.kdt.pojavlaunch.renderer.DESCRIPTION"
            r0[r6] = r1
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_DESC = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "renderer_library"
            r0[r2] = r1
            java.lang.String r1 = "rendererLibrary"
            r0[r3] = r1
            java.lang.String r1 = "RENDERER_LIBRARY"
            r0[r4] = r1
            java.lang.String r1 = "com.movtery.zalithlauncher.renderer.LIBRARY"
            r0[r5] = r1
            java.lang.String r1 = "net.kdt.pojavlaunch.renderer.LIBRARY"
            r0[r6] = r1
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_LIBRARY = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "renderer_egl"
            r0[r2] = r1
            java.lang.String r1 = "rendererEGL"
            r0[r3] = r1
            java.lang.String r1 = "RENDERER_EGL"
            r0[r4] = r1
            java.lang.String r1 = "com.movtery.zalithlauncher.renderer.EGL"
            r0[r5] = r1
            java.lang.String r1 = "net.kdt.pojavlaunch.renderer.EGL"
            r0[r6] = r1
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_EGL = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "renderer_env"
            r0[r2] = r1
            java.lang.String r1 = "rendererEnv"
            r0[r3] = r1
            java.lang.String r1 = "RENDERER_ENV"
            r0[r4] = r1
            java.lang.String r1 = "com.movtery.zalithlauncher.renderer.ENV"
            r0[r5] = r1
            java.lang.String r1 = "net.kdt.pojavlaunch.renderer.ENV"
            r0[r6] = r1
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_ENV = r0
            java.lang.String[] r0 = new java.lang.String[r7]
            java.lang.String r1 = "renderer_dlopen"
            r0[r2] = r1
            java.lang.String r1 = "rendererDlopen"
            r0[r3] = r1
            java.lang.String r1 = "RENDERER_DLOPEN"
            r0[r4] = r1
            java.lang.String r1 = "com.movtery.zalithlauncher.renderer.DLOPEN"
            r0[r5] = r1
            java.lang.String r1 = "net.kdt.pojavlaunch.renderer.DLOPEN"
            r0[r6] = r1
            ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_DLOPEN = r0
            return
    }

    private RendererPluginManager() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addApkFile(java.util.List<java.io.File> r3, java.lang.String r4) {
            if (r4 == 0) goto L3b
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L3b
        Ld:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.isFile()
            if (r4 != 0) goto L19
            return
        L19:
            java.util.Iterator r4 = r3.iterator()
        L1d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.next()
            java.io.File r1 = (java.io.File) r1
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.String r2 = r0.getAbsolutePath()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1d
            return
        L38:
            r3.add(r0)
        L3b:
            return
    }

    private static void addNativeLibrariesToDlopen(java.util.List<java.lang.String> r4, java.io.File r5, java.lang.String r6) {
            if (r5 == 0) goto L40
            boolean r0 = r5.isDirectory()
            if (r0 != 0) goto L9
            goto L40
        L9:
            ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda2 r0 = new ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda2
            r0.<init>()
            java.io.File[] r5 = r5.listFiles(r0)
            if (r5 != 0) goto L15
            return
        L15:
            ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda3
            r0.<init>()
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.util.Comparator r0 = java.util.Comparator.comparing(r0, r1)
            java.util.Arrays.sort(r5, r0)
            int r0 = r5.length
            r1 = 0
        L25:
            if (r1 >= r0) goto L40
            r2 = r5[r1]
            java.lang.String r2 = r2.getAbsolutePath()
            boolean r3 = r2.equals(r6)
            if (r3 == 0) goto L34
            goto L3d
        L34:
            boolean r3 = r4.contains(r2)
            if (r3 != 0) goto L3d
            r4.add(r2)
        L3d:
            int r1 = r1 + 1
            goto L25
        L40:
            return
    }

    private static void applyInferredEnv(java.lang.String r8, java.util.LinkedHashMap<java.lang.String, java.lang.String> r9) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r0)
            java.lang.String r0 = "mobileglues"
            boolean r0 = r8.contains(r0)
            java.lang.String r1 = "LIBGL_ES"
            java.lang.String r2 = "3"
            if (r0 != 0) goto L8c
            java.lang.String r0 = "mobile glues"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L1c
            goto L8c
        L1c:
            java.lang.String r0 = "ngg"
            boolean r0 = r8.contains(r0)
            java.lang.String r3 = "LIBGL_NOERROR"
            java.lang.String r4 = "LIBGL_NORMALIZE"
            java.lang.String r5 = "LIBGL_GL"
            java.lang.String r6 = "LIBGL_USE_MC_COLOR"
            java.lang.String r7 = "1"
            if (r0 != 0) goto L7a
            java.lang.String r0 = "krypton"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L37
            goto L7a
        L37:
            java.lang.String r0 = "gl4es"
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L5b
            putIfMissing(r9, r6, r7)
            java.lang.String r8 = "21"
            putIfMissing(r9, r5, r8)
            putIfMissing(r9, r1, r2)
            putIfMissing(r9, r4, r7)
            putIfMissing(r9, r3, r7)
            java.lang.String r8 = "LIBGL_MIPMAP"
            putIfMissing(r9, r8, r2)
            java.lang.String r8 = "LIBGL_USEVBO"
            putIfMissing(r9, r8, r7)
            goto L96
        L5b:
            java.lang.String r0 = "mesa"
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L6b
            java.lang.String r0 = "zink"
            boolean r8 = r8.contains(r0)
            if (r8 == 0) goto L96
        L6b:
            java.lang.String r8 = "MESA_GL_VERSION_OVERRIDE"
            java.lang.String r0 = "4.6"
            putIfMissing(r9, r8, r0)
            java.lang.String r8 = "MESA_GLSL_VERSION_OVERRIDE"
            java.lang.String r0 = "460"
            putIfMissing(r9, r8, r0)
            goto L96
        L7a:
            putIfMissing(r9, r6, r7)
            java.lang.String r8 = "31"
            putIfMissing(r9, r5, r8)
            putIfMissing(r9, r1, r2)
            putIfMissing(r9, r4, r7)
            putIfMissing(r9, r3, r7)
            goto L96
        L8c:
            putIfMissing(r9, r1, r2)
            java.lang.String r8 = "MG_DIR_PATH"
            java.lang.String r0 = "/sdcard/MG"
            putIfMissing(r9, r8, r0)
        L96:
            return
    }

    private static ca.dnamobile.javalauncher.renderer.RendererInterface buildPluginRenderer(android.content.Context r12, android.content.pm.PackageInfo r13, java.io.File r14) {
            r0 = 0
            if (r13 == 0) goto L112
            java.lang.String r1 = r13.packageName
            if (r1 != 0) goto L9
            goto L112
        L9:
            java.lang.String r4 = r13.packageName
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            if (r13 == 0) goto L12
            android.os.Bundle r1 = r13.metaData
            goto L13
        L12:
            r1 = r0
        L13:
            if (r14 == 0) goto L16
            goto L1a
        L16:
            java.io.File r14 = getInstalledNativeLibraryDir(r13)
        L1a:
            java.lang.String r2 = "RendererPluginManager"
            if (r14 == 0) goto L24
            boolean r3 = r14.isDirectory()
            if (r3 != 0) goto L36
        L24:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Renderer plugin has no native library directory: "
            r3.<init>(r5)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r3)
        L36:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            if (r14 == 0) goto L46
            boolean r3 = r14.isDirectory()
            if (r3 == 0) goto L46
            r11.add(r14)
        L46:
            r3 = 2
            java.lang.String[] r5 = new java.lang.String[r3]
            java.lang.String[] r6 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_ID
            java.lang.String r6 = readMeta(r1, r6)
            r7 = 0
            r5[r7] = r6
            java.lang.String r6 = inferRendererId(r4)
            r8 = 1
            r5[r8] = r6
            java.lang.String r5 = firstNonEmpty(r5)
            r6 = 3
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.String[] r9 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_NAME
            java.lang.String r9 = readMeta(r1, r9)
            r6[r7] = r9
            java.lang.String r12 = getApplicationLabel(r12, r13)
            r6[r8] = r12
            java.lang.String r12 = inferRendererName(r4)
            r6[r3] = r12
            java.lang.String r12 = firstNonEmpty(r6)
            java.lang.String[] r13 = new java.lang.String[r3]
            java.lang.String[] r6 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_DESC
            java.lang.String r6 = readMeta(r1, r6)
            r13[r7] = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "Installed renderer plugin: "
            r6.<init>(r9)
            java.lang.StringBuilder r6 = r6.append(r4)
            java.lang.String r6 = r6.toString()
            r13[r8] = r6
            java.lang.String r6 = firstNonEmpty(r13)
            java.lang.String[] r13 = new java.lang.String[r3]
            java.lang.String[] r9 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_LIBRARY
            java.lang.String r9 = readMeta(r1, r9)
            r13[r7] = r9
            java.lang.String r9 = inferRendererLibraryName(r4, r14)
            r13[r8] = r9
            java.lang.String r13 = firstNonEmpty(r13)
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String[] r9 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_EGL
            java.lang.String r9 = readMeta(r1, r9)
            r3[r7] = r9
            java.lang.String r7 = inferRendererEgl(r4, r13)
            r3[r8] = r7
            java.lang.String r10 = firstNonEmpty(r3)
            if (r13 == 0) goto L100
            java.lang.String r3 = r13.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Lcc
            goto L100
        Lcc:
            java.io.File r0 = resolveLibraryFile(r13, r14)
            if (r0 == 0) goto Ldc
            boolean r2 = r0.isFile()
            if (r2 == 0) goto Ldc
            java.lang.String r13 = r0.getAbsolutePath()
        Ldc:
            r9 = r13
            java.lang.String[] r13 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_ENV
            java.lang.String r13 = readMeta(r1, r13)
            java.util.LinkedHashMap r7 = parseEnv(r13)
            applyInferredEnv(r4, r7)
            java.lang.String[] r13 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_DLOPEN
            java.lang.String r13 = readMeta(r1, r13)
            java.util.ArrayList r8 = parseList(r13)
            addNativeLibrariesToDlopen(r8, r14, r9)
            ca.dnamobile.javalauncher.renderer.PluginRenderer r13 = new ca.dnamobile.javalauncher.renderer.PluginRenderer
            r2 = r13
            r3 = r5
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r13
        L100:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Renderer plugin skipped because no renderer library was found: "
            r12.<init>(r13)
            java.lang.StringBuilder r12 = r12.append(r4)
            java.lang.String r12 = r12.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r12)
        L112:
            return r0
    }

    private static void clearDirectory(java.io.File r3) {
            java.io.File[] r3 = r3.listFiles()
            if (r3 != 0) goto L7
            return
        L7:
            int r0 = r3.length
            r1 = 0
        L9:
            if (r1 >= r0) goto L13
            r2 = r3[r1]
            deleteRecursively(r2)
            int r1 = r1 + 1
            goto L9
        L13:
            return
    }

    public static void clearImportedAndCachedRendererPlugins(android.content.Context r1) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_INSTALLED_RENDERER_PLUGIN
            if (r1 == 0) goto L11
            boolean r0 = r1.exists()
            if (r0 != 0) goto Le
            goto L11
        Le:
            clearDirectory(r1)
        L11:
            return
    }

    private static java.util.ArrayList<java.util.zip.ZipEntry> collectLibEntries(java.util.zip.ZipFile r4, java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "lib/"
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.util.Enumeration r4 = r4.entries()
        L1e:
            boolean r1 = r4.hasMoreElements()
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r4.nextElement()
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L1e
            java.lang.String r2 = r1.getName()
            boolean r2 = r2.startsWith(r5)
            if (r2 == 0) goto L1e
            java.lang.String r2 = r1.getName()
            java.lang.String r3 = ".so"
            boolean r2 = r2.endsWith(r3)
            if (r2 == 0) goto L1e
            r0.add(r1)
            goto L1e
        L4a:
            ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda0 r4 = new ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda0
            r4.<init>()
            java.util.Comparator r5 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.util.Comparator r4 = java.util.Comparator.comparing(r4, r5)
            r0.sort(r4)
            return r0
    }

    private static void copy(java.io.InputStream r3, java.io.OutputStream r4) throws java.lang.Exception {
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L10
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    private static void copyFile(java.io.File r1, java.io.File r2) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1e
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            copy(r0, r1)     // Catch: java.lang.Throwable -> L14
            r1.close()     // Catch: java.lang.Throwable -> L1e
            r0.close()
            return
        L14:
            r2 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r1 = move-exception
            r2.addSuppressed(r1)     // Catch: java.lang.Throwable -> L1e
        L1d:
            throw r2     // Catch: java.lang.Throwable -> L1e
        L1e:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r2 = move-exception
            r1.addSuppressed(r2)
        L27:
            throw r1
    }

    private static void copyUriToFile(android.content.Context r1, android.net.Uri r2, java.io.File r3) throws java.lang.Exception {
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.io.InputStream r1 = r1.openInputStream(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L1d
            copy(r1, r2)     // Catch: java.lang.Throwable -> L1b
            r2.close()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L1a
            r1.close()
        L1a:
            return
        L1b:
            r3 = move-exception
            goto L25
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b
            java.lang.String r0 = "Unable to open selected APK."
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3     // Catch: java.lang.Throwable -> L1b
        L25:
            r2.close()     // Catch: java.lang.Throwable -> L29
            goto L2d
        L29:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L2e
        L2d:
            throw r3     // Catch: java.lang.Throwable -> L2e
        L2e:
            r2 = move-exception
            if (r1 == 0) goto L39
            r1.close()     // Catch: java.lang.Throwable -> L35
            goto L39
        L35:
            r1 = move-exception
            r2.addSuppressed(r1)
        L39:
            throw r2
    }

    private static void deleteRecursively(java.io.File r1) {
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L9
            clearDirectory(r1)
        L9:
            r1.delete()
            return
    }

    public static java.util.List<ca.dnamobile.javalauncher.renderer.RendererInterface> discoverPlugins(android.content.Context r6) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r6)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.lang.String[] r1 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.KNOWN_RENDERER_PLUGIN_PACKAGES
            int r2 = r1.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L20
            r4 = r1[r3]
            ca.dnamobile.javalauncher.renderer.RendererInterface r4 = loadInstalledPackagePlugin(r6, r4)
            if (r4 == 0) goto L1d
            java.lang.String r5 = r4.getUniqueIdentifier()
            r0.put(r5, r4)
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            java.util.List r1 = getInstalledPackages(r6)
            java.util.Iterator r1 = r1.iterator()
        L28:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            java.lang.String r3 = r2.packageName
            if (r3 == 0) goto L28
            boolean r4 = r0.containsKey(r3)
            if (r4 == 0) goto L3f
            goto L28
        L3f:
            boolean r3 = looksLikeRendererPlugin(r3, r2)
            if (r3 != 0) goto L46
            goto L28
        L46:
            java.io.File r3 = extractInstalledNativeLibDir(r2)
            ca.dnamobile.javalauncher.renderer.RendererInterface r2 = buildPluginRenderer(r6, r2, r3)
            if (r2 == 0) goto L28
            java.lang.String r3 = r2.getUniqueIdentifier()
            r0.put(r3, r2)
            goto L28
        L58:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Collection r0 = r0.values()
            r6.<init>(r0)
            return r6
    }

    private static java.io.File extractInstalledNativeLibDir(android.content.pm.PackageInfo r6) {
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            java.io.File r1 = getInstalledNativeLibraryDir(r0)
            boolean r2 = hasSharedLibraries(r1)
            if (r2 == 0) goto Ld
            return r1
        Ld:
            if (r0 != 0) goto L10
            return r1
        L10:
            java.util.List r0 = getPackageApkFiles(r0)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            java.lang.String r3 = r6.packageName     // Catch: java.lang.Throwable -> L31
            java.io.File r3 = extractNativeLibraries(r2, r3)     // Catch: java.lang.Throwable -> L31
            boolean r2 = hasSharedLibraries(r3)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L18
            return r3
        L31:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to extract renderer plugin libraries from "
            r4.<init>(r5)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "RendererPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r4, r2, r3)
            goto L18
        L4b:
            return r1
    }

    private static java.io.File extractNativeLibraries(java.io.File r8, java.lang.String r9) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_INSTALLED_RENDERER_PLUGIN
            java.lang.String r2 = "[^A-Za-z0-9_.-]"
            java.lang.String r3 = "_"
            java.lang.String r9 = r9.replaceAll(r2, r3)
            r0.<init>(r1, r9)
            java.io.File r9 = new java.io.File
            java.lang.String r1 = "lib"
            r9.<init>(r0, r1)
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r0 = net.kdt.pojavlaunch.Architecture.androidAbiAsString(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r9, r0)
            boolean r9 = r1.exists()
            if (r9 != 0) goto L49
            boolean r9 = r1.mkdirs()
            if (r9 == 0) goto L30
            goto L49
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to create plugin native directory: "
            r9.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L49:
            java.util.LinkedHashSet r9 = new java.util.LinkedHashSet
            r9.<init>()
            r9.add(r0)
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            if (r0 == 0) goto L5e
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            java.util.List r0 = java.util.Arrays.asList(r0)
            r9.addAll(r0)
        L5e:
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            r2 = 1
            if (r0 != r2) goto L6a
            java.lang.String r0 = "arm64-v8a"
            r9.add(r0)
        L6a:
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            if (r0 != 0) goto L75
            java.lang.String r0 = "armeabi-v7a"
            r9.add(r0)
        L75:
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r8)
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L10b
        L7e:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> L10b
            r4 = 0
            if (r3 == 0) goto Lec
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> L10b
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L10b
            java.util.ArrayList r3 = collectLibEntries(r0, r3)     // Catch: java.lang.Throwable -> L10b
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L10b
            if (r5 == 0) goto L96
            goto L7e
        L96:
            clearDirectory(r1)     // Catch: java.lang.Throwable -> L10b
            java.util.Iterator r9 = r3.iterator()     // Catch: java.lang.Throwable -> L10b
        L9d:
            boolean r3 = r9.hasNext()     // Catch: java.lang.Throwable -> L10b
            if (r3 == 0) goto Led
            java.lang.Object r3 = r9.next()     // Catch: java.lang.Throwable -> L10b
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch: java.lang.Throwable -> L10b
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L10b
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L10b
            java.lang.String r7 = r3.getName()     // Catch: java.lang.Throwable -> L10b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L10b
            r5.<init>(r1, r6)     // Catch: java.lang.Throwable -> L10b
            java.io.InputStream r3 = r0.getInputStream(r3)     // Catch: java.lang.Throwable -> L10b
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Le0
            r6.<init>(r5)     // Catch: java.lang.Throwable -> Le0
            copy(r3, r6)     // Catch: java.lang.Throwable -> Ld6
            r6.close()     // Catch: java.lang.Throwable -> Le0
            if (r3 == 0) goto Lcf
            r3.close()     // Catch: java.lang.Throwable -> L10b
        Lcf:
            r5.setReadable(r2, r4)     // Catch: java.lang.Throwable -> L10b
            r5.setExecutable(r2, r4)     // Catch: java.lang.Throwable -> L10b
            goto L9d
        Ld6:
            r8 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> Ldb
            goto Ldf
        Ldb:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> Le0
        Ldf:
            throw r8     // Catch: java.lang.Throwable -> Le0
        Le0:
            r8 = move-exception
            if (r3 == 0) goto Leb
            r3.close()     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            r9 = move-exception
            r8.addSuppressed(r9)     // Catch: java.lang.Throwable -> L10b
        Leb:
            throw r8     // Catch: java.lang.Throwable -> L10b
        Lec:
            r2 = r4
        Led:
            r0.close()
            if (r2 != 0) goto L10a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "No native renderer libraries matched device ABI in "
            r9.<init>(r0)
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r8 = r9.append(r8)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "RendererPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r9, r8)
        L10a:
            return r1
        L10b:
            r8 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L110
            goto L114
        L110:
            r9 = move-exception
            r8.addSuppressed(r9)
        L114:
            throw r8
    }

    private static java.io.File findBestNativeLibrary(java.io.File r6) {
            r0 = 0
            if (r6 == 0) goto L68
            boolean r1 = r6.isDirectory()
            if (r1 != 0) goto La
            goto L68
        La:
            ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda4 r1 = new ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda4
            r1.<init>()
            java.io.File[] r6 = r6.listFiles(r1)
            if (r6 == 0) goto L68
            int r1 = r6.length
            if (r1 != 0) goto L19
            goto L68
        L19:
            ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda3 r0 = new ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda3
            r0.<init>()
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            java.util.Comparator r0 = java.util.Comparator.comparing(r0, r1)
            java.util.Arrays.sort(r6, r0)
            int r0 = r6.length
            r1 = 0
            r2 = r1
        L2a:
            if (r2 >= r0) goto L65
            r3 = r6[r2]
            java.lang.String r4 = r3.getName()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "mobileglues"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L64
            java.lang.String r5 = "ltw"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L64
            java.lang.String r5 = "ng_gl4es"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L64
            java.lang.String r5 = "gl4es"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L64
            java.lang.String r5 = "osmesa"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L61
            goto L64
        L61:
            int r2 = r2 + 1
            goto L2a
        L64:
            return r3
        L65:
            r6 = r6[r1]
            return r6
        L68:
            return r0
    }

    private static java.lang.String firstExistingLibrary(java.io.File r5, java.lang.String... r6) {
            r0 = 0
            if (r5 == 0) goto L1e
            boolean r1 = r5.isDirectory()
            if (r1 == 0) goto L1e
            int r1 = r6.length
            r2 = r0
        Lb:
            if (r2 >= r1) goto L1e
            r3 = r6[r2]
            java.io.File r4 = new java.io.File
            r4.<init>(r5, r3)
            boolean r4 = r4.isFile()
            if (r4 == 0) goto L1b
            return r3
        L1b:
            int r2 = r2 + 1
            goto Lb
        L1e:
            int r5 = r6.length
            if (r5 <= 0) goto L24
            r5 = r6[r0]
            goto L25
        L24:
            r5 = 0
        L25:
            return r5
    }

    private static java.lang.String firstNonEmpty(java.lang.String... r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r5.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L1e
            r3 = r5[r2]
            if (r3 == 0) goto L1b
            java.lang.String r4 = r3.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L1b
            java.lang.String r5 = r3.trim()
            return r5
        L1b:
            int r2 = r2 + 1
            goto L6
        L1e:
            return r0
    }

    private static java.lang.String getApplicationLabel(android.content.Context r1, android.content.pm.ApplicationInfo r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Throwable -> L13
            java.lang.CharSequence r1 = r1.getApplicationLabel(r2)     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L13
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L13
        L13:
            return r0
    }

    private static android.content.pm.PackageInfo getArchivePackageInfo(android.content.Context r3, java.io.File r4) {
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch: java.lang.Throwable -> L3a
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L3a
            r1 = 33
            if (r0 < r1) goto L19
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L3a
            r1 = 128(0x80, double:6.3E-322)
            android.content.pm.PackageManager$PackageInfoFlags r1 = android.content.pm.PackageManager.PackageInfoFlags.of(r1)     // Catch: java.lang.Throwable -> L3a
            android.content.pm.PackageInfo r3 = r3.getPackageArchiveInfo(r0, r1)     // Catch: java.lang.Throwable -> L3a
            goto L23
        L19:
            java.lang.String r0 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L3a
            r1 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r3 = r3.getPackageArchiveInfo(r0, r1)     // Catch: java.lang.Throwable -> L3a
        L23:
            if (r3 == 0) goto L39
            android.content.pm.ApplicationInfo r0 = r3.applicationInfo     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            android.content.pm.ApplicationInfo r0 = r3.applicationInfo     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L3a
            r0.sourceDir = r1     // Catch: java.lang.Throwable -> L3a
            android.content.pm.ApplicationInfo r0 = r3.applicationInfo     // Catch: java.lang.Throwable -> L3a
            java.lang.String r1 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L3a
            r0.publicSourceDir = r1     // Catch: java.lang.Throwable -> L3a
        L39:
            return r3
        L3a:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to parse renderer plugin APK: "
            r0.<init>(r1)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r0 = "RendererPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r3)
            r3 = 0
            return r3
    }

    private static java.io.File getInstalledNativeLibraryDir(android.content.pm.ApplicationInfo r1) {
            if (r1 == 0) goto L1b
            java.lang.String r0 = r1.nativeLibraryDir
            if (r0 == 0) goto L1b
            java.lang.String r0 = r1.nativeLibraryDir
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            goto L1b
        L13:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r1.nativeLibraryDir
            r0.<init>(r1)
            return r0
        L1b:
            r1 = 0
            return r1
    }

    private static java.util.List<android.content.pm.PackageInfo> getInstalledPackages(android.content.Context r4) {
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L1b
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L1b
            r1 = 33
            r2 = 129(0x81, double:6.37E-322)
            if (r0 < r1) goto L15
            android.content.pm.PackageManager$PackageInfoFlags r0 = android.content.pm.PackageManager.PackageInfoFlags.of(r2)     // Catch: java.lang.Throwable -> L1b
            java.util.List r4 = r4.getInstalledPackages(r0)     // Catch: java.lang.Throwable -> L1b
            return r4
        L15:
            int r0 = (int) r2     // Catch: java.lang.Throwable -> L1b
            java.util.List r4 = r4.getInstalledPackages(r0)     // Catch: java.lang.Throwable -> L1b
            return r4
        L1b:
            r4 = move-exception
            java.lang.String r0 = "RendererPluginManager"
            java.lang.String r1 = "Failed to enumerate installed renderer plugins"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r1, r4)
            java.util.List r4 = java.util.Collections.emptyList()
            return r4
    }

    private static java.util.List<java.io.File> getPackageApkFiles(android.content.pm.ApplicationInfo r6) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = r6.publicSourceDir
            addApkFile(r0, r1)
            java.lang.String r1 = r6.sourceDir
            addApkFile(r0, r1)
            java.lang.String[] r1 = r6.splitPublicSourceDirs
            r2 = 0
            if (r1 == 0) goto L22
            java.lang.String[] r1 = r6.splitPublicSourceDirs
            int r3 = r1.length
            r4 = r2
        L18:
            if (r4 >= r3) goto L22
            r5 = r1[r4]
            addApkFile(r0, r5)
            int r4 = r4 + 1
            goto L18
        L22:
            java.lang.String[] r1 = r6.splitSourceDirs
            if (r1 == 0) goto L33
            java.lang.String[] r6 = r6.splitSourceDirs
            int r1 = r6.length
        L29:
            if (r2 >= r1) goto L33
            r3 = r6[r2]
            addApkFile(r0, r3)
            int r2 = r2 + 1
            goto L29
        L33:
            return r0
    }

    public static boolean hasImportedOrCachedRendererPlugins(android.content.Context r1) {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r1)
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_INSTALLED_RENDERER_PLUGIN
            if (r1 == 0) goto L12
            boolean r0 = r1.isDirectory()
            if (r0 == 0) goto L12
            java.io.File[] r1 = r1.listFiles()
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L1a
            int r1 = r1.length
            if (r1 <= 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    private static boolean hasSharedLibraries(java.io.File r2) {
            r0 = 0
            if (r2 == 0) goto L19
            boolean r1 = r2.isDirectory()
            if (r1 != 0) goto La
            goto L19
        La:
            ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.renderer.RendererPluginManager$$ExternalSyntheticLambda1
            r1.<init>()
            java.io.File[] r2 = r2.listFiles(r1)
            if (r2 == 0) goto L19
            int r2 = r2.length
            if (r2 <= 0) goto L19
            r0 = 1
        L19:
            return r0
    }

    @java.lang.Deprecated
    public static ca.dnamobile.javalauncher.renderer.RendererInterface importRendererApk(android.content.Context r5, android.net.Uri r6) throws java.lang.Exception {
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r5)
            java.io.File r0 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_INSTALLED_RENDERER_PLUGIN
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2b
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L12
            goto L2b
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create renderer plugin directory: "
            r6.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L2b:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "importing_renderer_plugin.apk"
            r1.<init>(r0, r2)
            copyUriToFile(r5, r6, r1)
            android.content.pm.PackageInfo r6 = getArchivePackageInfo(r5, r1)
            if (r6 == 0) goto Lf5
            java.lang.String r2 = r6.packageName
            if (r2 == 0) goto Lf5
            java.lang.String r2 = r6.packageName
            java.lang.String r2 = r2.trim()
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto Lf5
            java.lang.String r2 = r6.packageName
            java.lang.String r3 = "[^A-Za-z0-9_.-]"
            java.lang.String r4 = "_"
            java.lang.String r2 = r2.replaceAll(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ".apk"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r3.<init>(r0, r2)
            boolean r0 = r3.exists()
            if (r0 == 0) goto L93
            boolean r0 = r3.delete()
            if (r0 == 0) goto L7a
            goto L93
        L7a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to replace old plugin APK: "
            r6.<init>(r0)
            java.lang.String r0 = r3.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L93:
            boolean r0 = r1.renameTo(r3)
            if (r0 != 0) goto L9f
            copyFile(r1, r3)
            r1.delete()
        L9f:
            java.lang.String r6 = r6.packageName
            java.io.File r6 = extractNativeLibraries(r3, r6)
            android.content.pm.PackageInfo r0 = getArchivePackageInfo(r5, r3)
            ca.dnamobile.javalauncher.renderer.RendererInterface r5 = buildPluginRenderer(r5, r0, r6)
            if (r5 == 0) goto Ldc
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Imported renderer APK: "
            r6.<init>(r0)
            java.lang.String r0 = r5.getRendererName()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " ("
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = r5.getUniqueIdentifier()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = "RendererPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r6)
            return r5
        Ldc:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Could not find renderer metadata or native libraries inside "
            r6.<init>(r0)
            java.lang.String r0 = r3.getName()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        Lf5:
            r1.delete()
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Selected file is not a valid Android APK plugin."
            r5.<init>(r6)
            throw r5
    }

    private static java.lang.String inferRendererEgl(java.lang.String r1, java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "mobileglues"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L11
            java.lang.String r1 = "libmobileglues.so"
            return r1
        L11:
            java.lang.String r0 = "gl4es"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1c
            java.lang.String r1 = "libEGL.so"
            return r1
        L1c:
            java.lang.String r0 = "ngg"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L46
            java.lang.String r0 = "krypton"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L2d
            goto L46
        L2d:
            if (r2 == 0) goto L44
            java.lang.String r1 = r2.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L3a
            goto L44
        L3a:
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            java.lang.String r1 = r1.getName()
            return r1
        L44:
            r1 = 0
            return r1
        L46:
            java.lang.String r1 = "libng_gl4es.so"
            return r1
    }

    private static java.lang.String inferRendererId(java.lang.String r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "zink"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "vulkan"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L49
            java.lang.String r0 = "mesa"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L1f
            goto L49
        L1f:
            java.lang.String r0 = "mobileglues"
            boolean r0 = r2.contains(r0)
            java.lang.String r1 = "opengles3"
            if (r0 != 0) goto L48
            java.lang.String r0 = "ltw"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L32
            goto L48
        L32:
            java.lang.String r0 = "gl4es"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L3d
            java.lang.String r2 = "opengles2"
            return r2
        L3d:
            java.lang.String r0 = "gallium"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L48
            java.lang.String r2 = "custom_gallium"
            return r2
        L48:
            return r1
        L49:
            java.lang.String r2 = "vulkan_zink"
            return r2
    }

    private static java.lang.String inferRendererLibraryName(java.lang.String r5, java.io.File r6) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toLowerCase(r0)
            java.lang.String r0 = "mobileglues"
            boolean r0 = r5.contains(r0)
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L20
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r0 = "libmobileglues.so"
            r5[r3] = r0
            java.lang.String r0 = "libMobileGlues.so"
            r5[r2] = r0
            java.lang.String r5 = firstExistingLibrary(r6, r5)
            return r5
        L20:
            java.lang.String r0 = "ltw"
            boolean r0 = r5.contains(r0)
            java.lang.String r4 = "libng_gl4es.so"
            if (r0 == 0) goto L3c
            r5 = 3
            java.lang.String[] r5 = new java.lang.String[r5]
            java.lang.String r0 = "libltw.so"
            r5[r3] = r0
            java.lang.String r0 = "libLTW.so"
            r5[r2] = r0
            r5[r1] = r4
            java.lang.String r5 = firstExistingLibrary(r6, r5)
            return r5
        L3c:
            java.lang.String r0 = "ngg"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L4d
            java.lang.String[] r5 = new java.lang.String[r2]
            r5[r3] = r4
            java.lang.String r5 = firstExistingLibrary(r6, r5)
            return r5
        L4d:
            java.lang.String r0 = "gl4es"
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L64
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r0 = "libgl4es_114.so"
            r5[r3] = r0
            java.lang.String r0 = "libgl4es.so"
            r5[r2] = r0
            java.lang.String r5 = firstExistingLibrary(r6, r5)
            return r5
        L64:
            java.lang.String r0 = "mesa"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L7b
            java.lang.String[] r5 = new java.lang.String[r1]
            java.lang.String r0 = "libOSMesa_8.so"
            r5[r3] = r0
            java.lang.String r0 = "libOSMesa.so"
            r5[r2] = r0
            java.lang.String r5 = firstExistingLibrary(r6, r5)
            return r5
        L7b:
            java.io.File r5 = findBestNativeLibrary(r6)
            if (r5 == 0) goto L86
            java.lang.String r5 = r5.getName()
            goto L87
        L86:
            r5 = 0
        L87:
            return r5
    }

    private static java.lang.String inferRendererName(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "mobileglues"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L11
            java.lang.String r1 = "MobileGlues (OpenGL 4.0, 1.17+)"
            return r1
        L11:
            java.lang.String r0 = "ltw"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L1c
            java.lang.String r1 = "LTW Renderer"
            return r1
        L1c:
            java.lang.String r0 = "angleless"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L27
            java.lang.String r1 = "Krypton Wrapper, NO-ANGLE (OpenGL ~3.0+)"
            return r1
        L27:
            java.lang.String r0 = "ngg"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L32
            java.lang.String r1 = "Krypton Wrapper (OpenGL ~3.0+)"
            return r1
        L32:
            java.lang.String r0 = "gl4es"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L3d
            java.lang.String r1 = "Holy-GL4ES (Legacy)"
            return r1
        L3d:
            java.lang.String r0 = "mesa"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L48
            java.lang.String r1 = "Mesa Renderer Plugin"
            return r1
        L48:
            java.lang.String r1 = "Renderer Plugin"
            return r1
    }

    public static boolean isStorageConfigurablePlugin(ca.dnamobile.javalauncher.renderer.RendererInterface r4) {
            r0 = 0
            if (r4 == 0) goto L4c
            boolean r1 = r4.isExternalPlugin()
            if (r1 != 0) goto La
            goto L4c
        La:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r4.getUniqueIdentifier()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r3 = r4.getRendererName()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r4 = r4.getRendererId()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r1)
            java.lang.String r1 = "mobileglues"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L4b
            java.lang.String r1 = "mobile glues"
            boolean r4 = r4.contains(r1)
            if (r4 == 0) goto L4c
        L4b:
            r0 = 1
        L4c:
            return r0
    }

    static /* synthetic */ boolean lambda$addNativeLibrariesToDlopen$2(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = ".so"
            boolean r0 = r1.endsWith(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$findBestNativeLibrary$1(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = ".so"
            boolean r0 = r1.endsWith(r0)
            return r0
    }

    static /* synthetic */ boolean lambda$hasSharedLibraries$0(java.io.File r0, java.lang.String r1) {
            java.lang.String r0 = ".so"
            boolean r0 = r1.endsWith(r0)
            return r0
    }

    private static ca.dnamobile.javalauncher.renderer.RendererInterface loadInstalledPackagePlugin(android.content.Context r5, java.lang.String r6) {
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L23
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L23
            r2 = 33
            r3 = 129(0x81, double:6.37E-322)
            if (r1 < r2) goto L15
            android.content.pm.PackageManager$PackageInfoFlags r1 = android.content.pm.PackageManager.PackageInfoFlags.of(r3)     // Catch: java.lang.Throwable -> L23
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L1a
        L15:
            int r1 = (int) r3     // Catch: java.lang.Throwable -> L23
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r6, r1)     // Catch: java.lang.Throwable -> L23
        L1a:
            java.io.File r1 = extractInstalledNativeLibDir(r0)     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.renderer.RendererInterface r5 = buildPluginRenderer(r5, r0, r1)     // Catch: java.lang.Throwable -> L23
            return r5
        L23:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Renderer plugin not installed or not visible: "
            r5.<init>(r0)
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "RendererPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r5)
            r5 = 0
            return r5
    }

    private static boolean looksLikeRendererPlugin(java.lang.String r2, android.content.pm.PackageInfo r3) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "renderer"
            boolean r0 = r2.contains(r0)
            r1 = 1
            if (r0 != 0) goto L54
            java.lang.String r0 = "mobileglues"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L54
            java.lang.String r0 = "ngg"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L54
            java.lang.String r0 = "gl4es"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L54
            java.lang.String r0 = "ltw"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L54
            java.lang.String r0 = "mesa"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L38
            goto L54
        L38:
            android.content.pm.ApplicationInfo r2 = r3.applicationInfo
            if (r2 == 0) goto L41
            android.content.pm.ApplicationInfo r2 = r3.applicationInfo
            android.os.Bundle r2 = r2.metaData
            goto L42
        L41:
            r2 = 0
        L42:
            java.lang.String[] r3 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_LIBRARY
            java.lang.String r3 = readMeta(r2, r3)
            if (r3 != 0) goto L54
            java.lang.String[] r3 = ca.dnamobile.javalauncher.renderer.RendererPluginManager.META_RENDERER_ID
            java.lang.String r2 = readMeta(r2, r3)
            if (r2 == 0) goto L53
            goto L54
        L53:
            r1 = 0
        L54:
            return r1
    }

    public static boolean openPluginApp(android.content.Context r4, ca.dnamobile.javalauncher.renderer.RendererInterface r5) {
            if (r5 == 0) goto L40
            boolean r0 = r5.isExternalPlugin()
            if (r0 != 0) goto L9
            goto L40
        L9:
            java.lang.String r0 = r5.getUniqueIdentifier()
            android.content.pm.PackageManager r1 = r4.getPackageManager()     // Catch: java.lang.Throwable -> L26
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r0)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L1c
            boolean r4 = openPluginAppSettings(r4, r5)     // Catch: java.lang.Throwable -> L26
            return r4
        L1c:
            r2 = 268435456(0x10000000, float:2.524355E-29)
            r1.addFlags(r2)     // Catch: java.lang.Throwable -> L26
            r4.startActivity(r1)     // Catch: java.lang.Throwable -> L26
            r4 = 1
            return r4
        L26:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to open renderer plugin app: "
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "RendererPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r2, r0, r1)
            boolean r4 = openPluginAppSettings(r4, r5)
            return r4
        L40:
            r4 = 0
            return r4
    }

    public static boolean openPluginAppSettings(android.content.Context r4, ca.dnamobile.javalauncher.renderer.RendererInterface r5) {
            java.lang.String r0 = "package:"
            r1 = 0
            if (r5 == 0) goto L4e
            boolean r2 = r5.isExternalPlugin()
            if (r2 != 0) goto Lc
            goto L4e
        Lc:
            android.content.Intent r2 = new android.content.Intent     // Catch: java.lang.Throwable -> L35
            java.lang.String r3 = "android.settings.APPLICATION_DETAILS_SETTINGS"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r5.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L35
            r2.setData(r0)     // Catch: java.lang.Throwable -> L35
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r2.addFlags(r0)     // Catch: java.lang.Throwable -> L35
            r4.startActivity(r2)     // Catch: java.lang.Throwable -> L35
            r4 = 1
            return r4
        L35:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to open renderer plugin app settings: "
            r0.<init>(r2)
            java.lang.String r5 = r5.getUniqueIdentifier()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "RendererPluginManager"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r5, r4)
        L4e:
            return r1
    }

    private static java.util.LinkedHashMap<java.lang.String, java.lang.String> parseEnv(java.lang.String r7) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            if (r7 == 0) goto L46
            java.lang.String r1 = r7.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L46
        L12:
            java.lang.String r1 = "[;\\n]"
            java.lang.String[] r7 = r7.split(r1)
            int r1 = r7.length
            r2 = 0
            r3 = r2
        L1b:
            if (r3 >= r1) goto L46
            r4 = r7[r3]
            r5 = 61
            int r5 = r4.indexOf(r5)
            if (r5 > 0) goto L28
            goto L43
        L28:
            java.lang.String r6 = r4.substring(r2, r5)
            java.lang.String r6 = r6.trim()
            int r5 = r5 + 1
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r4 = r4.trim()
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L43
            r0.put(r6, r4)
        L43:
            int r3 = r3 + 1
            goto L1b
        L46:
            return r0
    }

    private static java.util.ArrayList<java.lang.String> parseList(java.lang.String r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r5 == 0) goto L34
            java.lang.String r1 = r5.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L12
            goto L34
        L12:
            java.lang.String r1 = "[;,:\\n]"
            java.lang.String[] r5 = r5.split(r1)
            int r1 = r5.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L34
            r3 = r5[r2]
            java.lang.String r3 = r3.trim()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L31
            boolean r4 = r0.contains(r3)
            if (r4 != 0) goto L31
            r0.add(r3)
        L31:
            int r2 = r2 + 1
            goto L1a
        L34:
            return r0
    }

    private static void putIfMissing(java.util.LinkedHashMap<java.lang.String, java.lang.String> r1, java.lang.String r2, java.lang.String r3) {
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L9
            r1.put(r2, r3)
        L9:
            return
    }

    private static java.lang.String readMeta(android.os.Bundle r5, java.lang.String[] r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = r6.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L2a
            r3 = r6[r2]
            boolean r4 = r5.containsKey(r3)
            if (r4 != 0) goto L11
            goto L27
        L11:
            java.lang.Object r3 = r5.get(r3)
            if (r3 != 0) goto L18
            goto L27
        L18:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r3 = r3.trim()
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L27
            return r3
        L27:
            int r2 = r2 + 1
            goto L6
        L2a:
            return r0
    }

    private static java.io.File resolveLibraryFile(java.lang.String r2, java.io.File r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r1 = r0.isAbsolute()
            if (r1 == 0) goto L12
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L12
            return r0
        L12:
            r0 = 0
            if (r3 != 0) goto L16
            return r0
        L16:
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r2)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L22
            r0 = r1
        L22:
            return r0
    }
}
