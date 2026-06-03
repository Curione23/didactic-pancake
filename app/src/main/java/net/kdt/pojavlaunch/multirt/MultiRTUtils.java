package net.kdt.pojavlaunch.multirt;

/* JADX INFO: loaded from: classes2.dex */
public final class MultiRTUtils {
    private static final java.lang.String TAG = "MultiRTUtils";

    private MultiRTUtils() {
            r0 = this;
            r0.<init>()
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

    private static java.lang.String buildRuntimeLdLibraryPath(java.io.File r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r1.<init>(r2)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib"
            r1.<init>(r4, r2)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/aarch64"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/aarch64/jli"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/aarch64/server"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm64"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm64/jli"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm64/server"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm64-v8a"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm64-v8a/jli"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm64-v8a/server"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm/jli"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/arm/server"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/x86_64"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/x86_64/jli"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "lib/x86_64/server"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "jre/lib"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "jre/lib/aarch64"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "jre/lib/aarch64/jli"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "jre/lib/aarch64/server"
            r1.<init>(r4, r3)
            addPath(r0, r1)
            java.lang.String[] r4 = android.os.Build.SUPPORTED_64_BIT_ABIS
            if (r4 == 0) goto Le2
            java.lang.String[] r4 = android.os.Build.SUPPORTED_64_BIT_ABIS
            int r4 = r4.length
            if (r4 <= 0) goto Le2
            java.lang.String r2 = "lib64"
        Le2:
            java.lang.String r4 = "/system/"
            java.lang.String r4 = r4.concat(r2)
            r0.add(r4)
            java.lang.String r4 = "/vendor/"
            java.lang.String r1 = r4.concat(r2)
            r0.add(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.StringBuilder r4 = r1.append(r2)
            java.lang.String r1 = "/hw"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.add(r4)
            java.lang.String r4 = joinPathList(r0)
            return r4
    }

    private static void collectPackFiles(java.io.File r5, java.util.List<java.io.File> r6) {
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
            collectPackFiles(r2, r6)
            goto L2c
        L17:
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L2c
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = ".pack"
            boolean r3 = r3.endsWith(r4)
            if (r3 == 0) goto L2c
            r6.add(r2)
        L2c:
            int r1 = r1 + 1
            goto L9
        L2f:
            return
    }

    private static void copyAwtDummyNativeLibraries(java.io.File r1) throws java.io.IOException {
            java.io.File r1 = resolveRuntimeLibDir(r1)
            java.lang.String r0 = "libawt_xawt.so"
            copyDummyNativeLib(r0, r1)
            return
    }

    private static void copyDirectory(java.io.File r5, java.io.File r6) throws java.io.IOException {
            boolean r0 = r5.isDirectory()
            java.lang.String r1 = "Unable to create directory: "
            r2 = 0
            if (r0 == 0) goto L47
            boolean r0 = r6.exists()
            if (r0 != 0) goto L2d
            boolean r0 = r6.mkdirs()
            if (r0 == 0) goto L16
            goto L2d
        L16:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L2d:
            java.io.File[] r5 = r5.listFiles()
            if (r5 == 0) goto L8b
            int r0 = r5.length
        L34:
            if (r2 >= r0) goto L8b
            r1 = r5[r2]
            java.io.File r3 = new java.io.File
            java.lang.String r4 = r1.getName()
            r3.<init>(r6, r4)
            copyDirectory(r1, r3)
            int r2 = r2 + 1
            goto L34
        L47:
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto L71
            boolean r3 = r0.exists()
            if (r3 != 0) goto L71
            boolean r3 = r0.mkdirs()
            if (r3 == 0) goto L5a
            goto L71
        L5a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L71:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r5)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L96
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L96
            net.kdt.pojavlaunch.Tools.copy(r0, r1)     // Catch: java.lang.Throwable -> L8c
            r1.close()     // Catch: java.lang.Throwable -> L96
            r0.close()
            boolean r5 = r5.canExecute()
            r6.setExecutable(r5, r2)
        L8b:
            return
        L8c:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L91
            goto L95
        L91:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L96
        L95:
            throw r5     // Catch: java.lang.Throwable -> L96
        L96:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L9b
            goto L9f
        L9b:
            r6 = move-exception
            r5.addSuppressed(r6)
        L9f:
            throw r5
    }

    private static void copyDummyNativeLib(java.lang.String r6, java.io.File r7) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r0.<init>(r1, r6)
            java.io.File r1 = new java.io.File
            r1.<init>(r7, r6)
            boolean r6 = r0.isFile()
            java.lang.String r7 = "MultiRTUtils"
            if (r6 != 0) goto L2b
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "AWT dummy native is missing from APK native dir: "
            r6.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
        L2b:
            boolean r6 = r1.isFile()
            if (r6 == 0) goto L54
            long r2 = r1.length()
            long r4 = r0.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L54
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "AWT dummy native already prepared: "
            r6.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
        L54:
            java.io.File r6 = r1.getParentFile()
            if (r6 == 0) goto L80
            boolean r2 = r6.exists()
            if (r2 != 0) goto L80
            boolean r2 = r6.mkdirs()
            if (r2 == 0) goto L67
            goto L80
        L67:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create runtime lib directory: "
            r0.<init>(r1)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r6 = r0.append(r6)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
        L80:
            java.io.FileInputStream r6 = new java.io.FileInputStream
            r6.<init>(r0)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lca
            r2.<init>(r1)     // Catch: java.lang.Throwable -> Lca
            net.kdt.pojavlaunch.Tools.copy(r6, r2)     // Catch: java.lang.Throwable -> Lc0
            r2.close()     // Catch: java.lang.Throwable -> Lca
            r6.close()
            r6 = 1
            r2 = 0
            r1.setReadable(r6, r2)
            r1.setExecutable(r6, r2)
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r2 = "Copied AWT dummy native: "
            r6.<init>(r2)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = " -> "
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r6)
            return
        Lc0:
            r7 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Lc5
            goto Lc9
        Lc5:
            r0 = move-exception
            r7.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lca
        Lc9:
            throw r7     // Catch: java.lang.Throwable -> Lca
        Lca:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> Lcf
            goto Ld3
        Lcf:
            r6 = move-exception
            r7.addSuppressed(r6)
        Ld3:
            throw r7
    }

    private static void createSymbolicLinkIfPossible(java.io.File r5, java.lang.String r6) throws java.io.IOException {
            boolean r0 = r5.exists()
            if (r0 == 0) goto L9
            r5.delete()
        L9:
            java.lang.String r0 = "android.system.Os"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = "symlink"
            r2 = 2
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 0
            r2[r4] = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = 1
            r2[r4] = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r1 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> L2f
            java.lang.Object[] r1 = new java.lang.Object[]{r6, r1}     // Catch: java.lang.Throwable -> L2f
            r2 = 0
            r0.invoke(r2, r1)     // Catch: java.lang.Throwable -> L2f
            goto L32
        L2f:
            writeText(r5, r6)
        L32:
            return
    }

    private static void extractTarEntry(java.io.InputStream r7, java.lang.Object r8, java.io.File r9) throws java.lang.ReflectiveOperationException, java.io.IOException {
            java.lang.Class r0 = r8.getClass()
            r1 = 0
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.String r3 = "getName"
            java.lang.reflect.Method r2 = r0.getMethod(r3, r2)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.Object r2 = r2.invoke(r8, r3)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "isDirectory"
            java.lang.Class[] r4 = new java.lang.Class[r1]
            java.lang.reflect.Method r3 = r0.getMethod(r3, r4)
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.Object r3 = r3.invoke(r8, r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.String r4 = "isSymbolicLink"
            java.lang.Class[] r5 = new java.lang.Class[r1]
            java.lang.reflect.Method r4 = r0.getMethod(r4, r5)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.Object r4 = r4.invoke(r8, r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.String r5 = "getMode"
            java.lang.Class[] r6 = new java.lang.Class[r1]
            java.lang.reflect.Method r5 = r0.getMethod(r5, r6)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.Object r5 = r5.invoke(r8, r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.io.File r9 = safeResolve(r9, r2)
            java.lang.String r2 = "Unable to create directory: "
            if (r3 == 0) goto L7e
            boolean r7 = r9.exists()
            if (r7 != 0) goto L7d
            boolean r7 = r9.mkdirs()
            if (r7 == 0) goto L66
            goto L7d
        L66:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            java.lang.String r9 = r9.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L7d:
            return
        L7e:
            java.io.File r3 = r9.getParentFile()
            if (r3 == 0) goto La8
            boolean r6 = r3.exists()
            if (r6 != 0) goto La8
            boolean r6 = r3.mkdirs()
            if (r6 == 0) goto L91
            goto La8
        L91:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r2)
            java.lang.String r9 = r3.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        La8:
            if (r4 == 0) goto Lbe
            java.lang.String r7 = "getLinkName"
            java.lang.Class[] r2 = new java.lang.Class[r1]
            java.lang.reflect.Method r7 = r0.getMethod(r7, r2)
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.Object r7 = r7.invoke(r8, r0)
            java.lang.String r7 = (java.lang.String) r7
            createSymbolicLinkIfPossible(r9, r7)
            return
        Lbe:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream
            r8.<init>(r9)
            net.kdt.pojavlaunch.Tools.copy(r7, r8)     // Catch: java.lang.Throwable -> Ld8
            r8.close()
            r7 = r5 & 73
            r8 = 1
            if (r7 == 0) goto Ld1
            r9.setExecutable(r8, r1)
        Ld1:
            r9.setReadable(r8, r1)
            r9.setWritable(r8, r8)
            return
        Ld8:
            r7 = move-exception
            r8.close()     // Catch: java.lang.Throwable -> Ldd
            goto Le1
        Ldd:
            r8 = move-exception
            r7.addSuppressed(r8)
        Le1:
            throw r7
    }

    private static void extractTarXz(java.io.InputStream r3, java.io.File r4) throws java.io.IOException {
            java.io.File r0 = r4.getParentFile()
            if (r0 != 0) goto L7
            r0 = r4
        L7:
            java.lang.String r1 = "runtime-pack-"
            java.lang.String r2 = ".tar.xz"
            java.io.File r0 = java.io.File.createTempFile(r1, r2, r0)
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L37
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L37
            net.kdt.pojavlaunch.Tools.copy(r3, r1)     // Catch: java.lang.Throwable -> L2d
            r1.close()     // Catch: java.lang.Throwable -> L37
            if (r3 == 0) goto L1f
            r3.close()     // Catch: java.lang.Throwable -> L43
        L1f:
            extractTarXzWithOptionalLibraries(r0, r4)     // Catch: java.lang.LinkageError -> L23 java.lang.ReflectiveOperationException -> L25 java.lang.Throwable -> L43
            goto L29
        L23:
            r3 = move-exception
            goto L26
        L25:
            r3 = move-exception
        L26:
            extractTarXzWithSystemTar(r0, r4, r3)     // Catch: java.lang.Throwable -> L43
        L29:
            r0.delete()
            return
        L2d:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L32
            goto L36
        L32:
            r1 = move-exception
            r4.addSuppressed(r1)     // Catch: java.lang.Throwable -> L37
        L36:
            throw r4     // Catch: java.lang.Throwable -> L37
        L37:
            r4 = move-exception
            if (r3 == 0) goto L42
            r3.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L43
        L42:
            throw r4     // Catch: java.lang.Throwable -> L43
        L43:
            r3 = move-exception
            r0.delete()
            throw r3
    }

    private static void extractTarXzWithOptionalLibraries(java.io.File r6, java.io.File r7) throws java.lang.ReflectiveOperationException, java.io.IOException {
            java.lang.String r0 = "org.tukaani.xz.XZInputStream"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.String r1 = "org.apache.commons.compress.archivers.tar.TarArchiveInputStream"
            java.lang.Class r1 = java.lang.Class.forName(r1)
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            r5 = 0
            r3[r5] = r4
            java.lang.reflect.Constructor r0 = r0.getConstructor(r3)
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
            r2[r5] = r3
            java.lang.reflect.Constructor r2 = r1.getConstructor(r2)
            java.lang.String r3 = "getNextTarEntry"
            java.lang.Class[] r4 = new java.lang.Class[r5]
            java.lang.reflect.Method r1 = r1.getMethod(r3, r4)
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L64
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r2.newInstance(r6)     // Catch: java.lang.Throwable -> L64
            java.io.InputStream r6 = (java.io.InputStream) r6     // Catch: java.lang.Throwable -> L64
        L43:
            java.lang.Object[] r0 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L58
            java.lang.Object r0 = r1.invoke(r6, r0)     // Catch: java.lang.Throwable -> L58
            if (r0 == 0) goto L4f
            extractTarEntry(r6, r0, r7)     // Catch: java.lang.Throwable -> L58
            goto L43
        L4f:
            if (r6 == 0) goto L54
            r6.close()     // Catch: java.lang.Throwable -> L64
        L54:
            r3.close()
            return
        L58:
            r7 = move-exception
            if (r6 == 0) goto L63
            r6.close()     // Catch: java.lang.Throwable -> L5f
            goto L63
        L5f:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.lang.Throwable -> L64
        L63:
            throw r7     // Catch: java.lang.Throwable -> L64
        L64:
            r6 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L69
            goto L6d
        L69:
            r7 = move-exception
            r6.addSuppressed(r7)
        L6d:
            throw r6
    }

    private static void extractTarXzWithSystemTar(java.io.File r12, java.io.File r13, java.lang.Throwable r14) throws java.io.IOException {
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            java.lang.String r3 = "tar"
            r1[r2] = r3
            r4 = 1
            java.lang.String r5 = "-xJf"
            r1[r4] = r5
            java.lang.String r6 = r12.getAbsolutePath()
            r7 = 2
            r1[r7] = r6
            r6 = 3
            java.lang.String r8 = "-C"
            r1[r6] = r8
            java.lang.String r9 = r13.getAbsolutePath()
            r10 = 4
            r1[r10] = r9
            java.io.IOException r1 = runTarCommand(r1)
            if (r1 != 0) goto L27
            return
        L27:
            r9 = 6
            java.lang.String[] r9 = new java.lang.String[r9]
            java.lang.String r11 = "toybox"
            r9[r2] = r11
            r9[r4] = r3
            r9[r7] = r5
            java.lang.String r12 = r12.getAbsolutePath()
            r9[r6] = r12
            r9[r10] = r8
            java.lang.String r12 = r13.getAbsolutePath()
            r9[r0] = r12
            java.io.IOException r12 = runTarCommand(r9)
            if (r12 != 0) goto L47
            return
        L47:
            java.io.IOException r13 = new java.io.IOException
            java.lang.String r0 = "Unable to extract .tar.xz runtime pack. Add org.tukaani:xz and org.apache.commons:commons-compress to the app dependencies, or use a device image whose tar supports -J."
            r13.<init>(r0)
            r13.addSuppressed(r14)
            r13.addSuppressed(r1)
            r13.addSuppressed(r12)
            throw r13
    }

    private static java.io.File findFileNamed(java.io.File r5, java.lang.String r6, int r7) {
            r0 = 0
            if (r7 < 0) goto L46
            boolean r1 = r5.isDirectory()
            if (r1 != 0) goto La
            goto L46
        La:
            java.io.File r1 = new java.io.File
            r1.<init>(r5, r6)
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L16
            return r1
        L16:
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L1d
            return r0
        L1d:
            int r1 = r5.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L46
            r3 = r5[r2]
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L32
            int r4 = r7 + (-1)
            java.io.File r3 = findFileNamed(r3, r6, r4)
            if (r3 == 0) goto L43
            return r3
        L32:
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L43
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L43
            return r3
        L43:
            int r2 = r2 + 1
            goto L1f
        L46:
            return r0
    }

    private static java.io.File findUnpack200(java.io.File r5) {
            r0 = 2
            java.io.File[] r1 = new java.io.File[r0]
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "bin/unpack200"
            r2.<init>(r5, r3)
            r3 = 0
            r1[r3] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "jre/bin/unpack200"
            r2.<init>(r5, r4)
            r4 = 1
            r1[r4] = r2
        L17:
            if (r3 >= r0) goto L25
            r2 = r1[r3]
            boolean r4 = r2.isFile()
            if (r4 == 0) goto L22
            return r2
        L22:
            int r3 = r3 + 1
            goto L17
        L25:
            java.lang.String r0 = "unpack200"
            r1 = 4
            java.io.File r5 = findFileNamed(r5, r0, r1)
            return r5
    }

    public static java.io.File getRuntimeDir(java.lang.String r2) {
            java.io.File r0 = new java.io.File
            java.io.File r1 = getRuntimesHome()
            r0.<init>(r1, r2)
            return r0
    }

    public static java.io.File getRuntimeHome(java.lang.String r0) {
            java.io.File r0 = getRuntimeDir(r0)
            return r0
    }

    public static java.io.File getRuntimesHome() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MULTIRT_HOME
            r0.<init>(r1)
            return r0
    }

    public static void installRuntimeNamedBinpack(java.io.InputStream r4, java.io.InputStream r5, java.lang.String r6, java.lang.String r7) throws java.io.IOException {
            java.io.File r0 = getRuntimesHome()
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2a
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L11
            goto L2a
        L11:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to create runtimes home: "
            r5.<init>(r6)
            java.lang.String r6 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L2a:
            java.io.File r1 = getRuntimeDir(r6)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.String r3 = ".installing"
            java.lang.StringBuilder r6 = r6.append(r3)
            java.lang.String r6 = r6.toString()
            r2.<init>(r0, r6)
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r2)
            boolean r6 = r2.mkdirs()
            if (r6 == 0) goto L7c
            extractTarXz(r4, r2)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            extractTarXz(r5, r2)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            normalizeRuntimeDirIfNeeded(r2)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            java.io.File r4 = new java.io.File     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            java.lang.String r5 = "version"
            r4.<init>(r2, r5)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            writeText(r4, r7)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            postPrepare(r2)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r1)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            boolean r4 = r2.renameTo(r1)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            if (r4 != 0) goto L74
            copyDirectory(r2, r1)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r2)     // Catch: java.lang.RuntimeException -> L75 java.io.IOException -> L77
        L74:
            return
        L75:
            r4 = move-exception
            goto L78
        L77:
            r4 = move-exception
        L78:
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r2)
            throw r4
        L7c:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to create temp runtime directory: "
            r5.<init>(r6)
            java.lang.String r6 = r2.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    private static java.lang.String joinCommand(java.lang.String[] r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1c
            r3 = r5[r2]
            int r4 = r0.length()
            if (r4 <= 0) goto L16
            r4 = 32
            r0.append(r4)
        L16:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L1c:
            java.lang.String r5 = r0.toString()
            return r5
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

    private static boolean looksLikeRuntimeRoot(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "bin"
            r0.<init>(r2, r1)
            boolean r0 = r0.isDirectory()
            if (r0 != 0) goto L62
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/rt.jar"
            r0.<init>(r2, r1)
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L62
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/rt.jar.pack"
            r0.<init>(r2, r1)
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L62
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "jre/lib/rt.jar"
            r0.<init>(r2, r1)
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L62
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "jre/lib/rt.jar.pack"
            r0.<init>(r2, r1)
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L62
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/modules"
            r0.<init>(r2, r1)
            boolean r0 = r0.isFile()
            if (r0 != 0) goto L62
            java.lang.String r0 = "rt.jar"
            r1 = 4
            java.io.File r0 = findFileNamed(r2, r0, r1)
            if (r0 != 0) goto L62
            java.lang.String r0 = "rt.jar.pack"
            java.io.File r2 = findFileNamed(r2, r0, r1)
            if (r2 == 0) goto L60
            goto L62
        L60:
            r2 = 0
            goto L63
        L62:
            r2 = 1
        L63:
            return r2
    }

    public static void normalizeRuntimeDirIfNeeded(java.io.File r7) throws java.io.IOException {
            boolean r0 = r7.isDirectory()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = looksLikeRuntimeRoot(r7)
            if (r0 == 0) goto Le
            return
        Le:
            java.io.File[] r0 = r7.listFiles()
            if (r0 == 0) goto La1
            int r1 = r0.length
            r2 = 1
            if (r1 != r2) goto La1
            r1 = 0
            r2 = r0[r1]
            boolean r2 = r2.isDirectory()
            if (r2 != 0) goto L23
            goto La1
        L23:
            r0 = r0[r1]
            boolean r2 = looksLikeRuntimeRoot(r0)
            if (r2 != 0) goto L2c
            return
        L2c:
            java.io.File r2 = r7.getParentFile()
            if (r2 != 0) goto L33
            return
        L33:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r7.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ".normalized"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r2, r4)
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r3)
            boolean r2 = r3.mkdirs()
            if (r2 == 0) goto L88
            java.io.File[] r0 = r0.listFiles()
            if (r0 == 0) goto L78
            int r2 = r0.length
        L5f:
            if (r1 >= r2) goto L78
            r4 = r0[r1]
            java.io.File r5 = new java.io.File
            java.lang.String r6 = r4.getName()
            r5.<init>(r3, r6)
            boolean r6 = r4.renameTo(r5)
            if (r6 != 0) goto L75
            copyDirectory(r4, r5)
        L75:
            int r1 = r1 + 1
            goto L5f
        L78:
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r7)
            boolean r0 = r3.renameTo(r7)
            if (r0 != 0) goto L87
            copyDirectory(r3, r7)
            ca.dnamobile.javalauncher.utils.path.PathManager.deleteQuietly(r3)
        L87:
            return
        L88:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create normalize temp dir: "
            r0.<init>(r1)
            java.lang.String r1 = r3.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        La1:
            return
    }

    private static void postPrepare(java.io.File r4) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "bin"
            r0.<init>(r4, r1)
            setExecutableRecursive(r0)
            setJexecExecutable(r4)
            renameFreetypeIfNeeded(r4)
            unpackPack200Files(r4)     // Catch: java.io.IOException -> L17
            copyAwtDummyNativeLibraries(r4)     // Catch: java.io.IOException -> L17
            return
        L17:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Failed to post-prepare runtime in "
            r2.<init>(r3)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r4 = r2.append(r4)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    public static void postPrepare(java.lang.String r0) {
            java.io.File r0 = getRuntimeDir(r0)
            postPrepare(r0)
            return
    }

    public static java.lang.String readInternalRuntimeVersion(java.lang.String r2) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.io.File r2 = getRuntimeDir(r2)
            java.lang.String r1 = "version"
            r0.<init>(r2, r1)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L14
            java.lang.String r2 = ""
            return r2
        L14:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            java.lang.String r0 = net.kdt.pojavlaunch.Tools.read(r2)     // Catch: java.lang.Throwable -> L21
            r2.close()
            return r0
        L21:
            r0 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L26
            goto L2a
        L26:
            r2 = move-exception
            r0.addSuppressed(r2)
        L2a:
            throw r0
    }

    private static void renameFreetypeIfNeeded(java.io.File r6) {
            java.io.File r6 = resolveRuntimeLibDir(r6)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "libfreetype.so.6"
            r0.<init>(r6, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libfreetype.so"
            r1.<init>(r6, r2)
            boolean r6 = r0.isFile()
            if (r6 == 0) goto L30
            boolean r6 = r1.exists()
            if (r6 == 0) goto L2a
            long r2 = r0.length()
            long r4 = r1.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L30
        L2a:
            r1.delete()
            r0.renameTo(r1)
        L30:
            return
    }

    private static java.io.File resolveRuntimeLibDir(java.io.File r5) {
            r0 = 9
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "lib/aarch64"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "lib/arm64"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "lib/arm64-v8a"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "lib/arm"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "lib/armeabi-v7a"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "lib/x86_64"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "lib/amd64"
            r1[r2] = r4
            r2 = 7
            java.lang.String r4 = "lib/i386"
            r1[r2] = r4
            r2 = 8
            java.lang.String r4 = "lib/x86"
            r1[r2] = r4
        L32:
            if (r3 >= r0) goto L45
            r2 = r1[r3]
            java.io.File r4 = new java.io.File
            r4.<init>(r5, r2)
            boolean r2 = r4.isDirectory()
            if (r2 == 0) goto L42
            return r4
        L42:
            int r3 = r3 + 1
            goto L32
        L45:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib"
            r0.<init>(r5, r1)
            return r0
    }

    private static void runAndCheck(java.lang.ProcessBuilder r6, java.lang.String r7, java.io.File r8, java.io.File r9, java.lang.String r10) throws java.io.IOException {
            java.lang.String r0 = "Interrupted while running "
            r1 = 0
            java.lang.Process r1 = r6.start()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            r6.<init>()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.io.InputStream r2 = r1.getInputStream()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            net.kdt.pojavlaunch.Tools.copy(r2, r6)     // Catch: java.lang.Throwable -> Lc3
            if (r2 == 0) goto L18
            r2.close()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
        L18:
            int r2 = r1.waitFor()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r3 = new java.lang.String     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            byte[] r6 = r6.toByteArray()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            r3.<init>(r6, r4)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            if (r2 != 0) goto L76
            boolean r6 = r9.isFile()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            if (r6 == 0) goto L55
            java.lang.String r6 = "MultiRTUtils"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            r10.<init>()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r10 = r10.append(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r2 = " OK: "
            java.lang.StringBuilder r10 = r10.append(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r9 = r10.append(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r9)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            if (r1 == 0) goto L54
            r1.destroy()
        L54:
            return
        L55:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            r10.<init>()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r10 = r10.append(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r2 = " returned success but output jar is missing: "
            java.lang.StringBuilder r10 = r10.append(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r9 = r10.append(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            throw r6     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
        L76:
            java.io.IOException r6 = new java.io.IOException     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            r4.<init>()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r5 = " failed with exit "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r2 = r4.append(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r4 = "\npack="
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r4 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r4 = "\nout="
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r9 = r9.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r9 = r2.append(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r2 = "\nLD_LIBRARY_PATH="
            java.lang.StringBuilder r9 = r9.append(r2)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r10 = "\n"
            java.lang.StringBuilder r9 = r9.append(r10)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.StringBuilder r9 = r9.append(r3)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            r6.<init>(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
            throw r6     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
        Lc3:
            r6 = move-exception
            if (r2 == 0) goto Lce
            r2.close()     // Catch: java.lang.Throwable -> Lca
            goto Lce
        Lca:
            r9 = move-exception
            r6.addSuppressed(r9)     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
        Lce:
            throw r6     // Catch: java.lang.Throwable -> Lcf java.lang.InterruptedException -> Ld1
        Lcf:
            r6 = move-exception
            goto Lfa
        Ld1:
            r6 = move-exception
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> Lcf
            r9.interrupt()     // Catch: java.lang.Throwable -> Lcf
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> Lcf
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf
            r10.<init>(r0)     // Catch: java.lang.Throwable -> Lcf
            java.lang.StringBuilder r7 = r10.append(r7)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r10 = " for "
            java.lang.StringBuilder r7 = r7.append(r10)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r8 = r8.getAbsolutePath()     // Catch: java.lang.Throwable -> Lcf
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> Lcf
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lcf
            r9.<init>(r7, r6)     // Catch: java.lang.Throwable -> Lcf
            throw r9     // Catch: java.lang.Throwable -> Lcf
        Lfa:
            if (r1 == 0) goto Lff
            r1.destroy()
        Lff:
            throw r6
    }

    private static void runApkNativeUnpack200(java.io.File r6, java.lang.String r7, java.io.File r8, java.io.File r9) throws java.io.IOException {
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto La8
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder
            r2 = 4
            java.lang.String[] r2 = new java.lang.String[r2]
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "./"
            r3.<init>(r4)
            java.lang.String r6 = r6.getName()
            java.lang.StringBuilder r6 = r3.append(r6)
            java.lang.String r6 = r6.toString()
            r3 = 0
            r2[r3] = r6
            java.lang.String r6 = "-r"
            r3 = 1
            r2[r3] = r6
            r6 = 2
            java.lang.String r4 = r8.getAbsolutePath()
            r2[r6] = r4
            r6 = 3
            java.lang.String r4 = r9.getAbsolutePath()
            r2[r6] = r4
            r1.<init>(r2)
            java.lang.ProcessBuilder r6 = r1.directory(r0)
            java.lang.ProcessBuilder r6 = r6.redirectErrorStream(r3)
            java.util.Map r1 = r6.environment()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ":"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "LD_LIBRARY_PATH"
            r1.put(r4, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r0.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r4 = ""
            java.lang.String r5 = "PATH"
            java.lang.Object r4 = r1.getOrDefault(r5, r4)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.put(r5, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "apk-native libunpack200"
            runAndCheck(r6, r0, r8, r9, r7)
            return
        La8:
            java.io.IOException r7 = new java.io.IOException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "libunpack200.so has no parent: "
            r8.<init>(r9)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r6 = r8.append(r6)
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            throw r7
    }

    private static void runRuntimeUnpack200(java.io.File r5, java.lang.String r6, java.io.File r7, java.io.File r8) throws java.io.IOException {
            r0 = 1
            r1 = 0
            r5.setExecutable(r0, r1)
            java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder
            r3 = 4
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.String r4 = r5.getAbsolutePath()
            r3[r1] = r4
            java.lang.String r1 = "-r"
            r3[r0] = r1
            r1 = 2
            java.lang.String r4 = r7.getAbsolutePath()
            r3[r1] = r4
            r1 = 3
            java.lang.String r4 = r8.getAbsolutePath()
            r3[r1] = r4
            r2.<init>(r3)
            java.lang.ProcessBuilder r0 = r2.redirectErrorStream(r0)
            java.util.Map r1 = r0.environment()
            java.lang.String r2 = "LD_LIBRARY_PATH"
            r1.put(r2, r6)
            java.io.File r5 = r5.getParentFile()
            if (r5 == 0) goto L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r2 = ""
            java.lang.String r3 = "PATH"
            java.lang.Object r2 = r1.getOrDefault(r3, r2)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.StringBuilder r5 = r5.append(r2)
            java.lang.String r5 = r5.toString()
            r1.put(r3, r5)
        L60:
            java.lang.String r5 = "runtime unpack200"
            runAndCheck(r0, r5, r7, r8, r6)
            return
    }

    private static java.io.IOException runTarCommand(java.lang.String[] r5) {
            java.lang.String r0 = "Command failed with exit "
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L5d
            r2 = 1
            java.lang.ProcessBuilder r1 = r1.redirectErrorStream(r2)     // Catch: java.lang.Throwable -> L5d
            java.lang.Process r1 = r1.start()     // Catch: java.lang.Throwable -> L5d
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L5d
            r2.<init>()     // Catch: java.lang.Throwable -> L5d
            java.io.InputStream r3 = r1.getInputStream()     // Catch: java.lang.Throwable -> L5d
            net.kdt.pojavlaunch.Tools.copy(r3, r2)     // Catch: java.lang.Throwable -> L51
            if (r3 == 0) goto L21
            r3.close()     // Catch: java.lang.Throwable -> L5d
        L21:
            int r1 = r1.waitFor()     // Catch: java.lang.Throwable -> L5d
            if (r1 != 0) goto L29
            r5 = 0
            return r5
        L29:
            java.io.IOException r3 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r0 = r4.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> L5d
            byte[] r2 = r2.toByteArray()     // Catch: java.lang.Throwable -> L5d
            java.nio.charset.Charset r4 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            return r3
        L51:
            r0 = move-exception
            if (r3 == 0) goto L5c
            r3.close()     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r1 = move-exception
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L5d
        L5c:
            throw r0     // Catch: java.lang.Throwable -> L5d
        L5d:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Command failed: "
            r2.<init>(r3)
            java.lang.String r5 = joinCommand(r5)
            java.lang.StringBuilder r5 = r2.append(r5)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r0)
            return r1
    }

    private static java.io.File safeResolve(java.io.File r3, java.lang.String r4) throws java.io.IOException {
            r0 = r4
        L1:
            java.lang.String r1 = "./"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto Lf
            r1 = 2
            java.lang.String r0 = r0.substring(r1)
            goto L1
        Lf:
            java.io.File r1 = new java.io.File
            r1.<init>(r3, r0)
            java.lang.String r3 = r3.getCanonicalPath()
            java.lang.String r0 = r1.getCanonicalPath()
            boolean r2 = r0.equals(r3)
            if (r2 != 0) goto L51
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = java.io.File.separator
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            boolean r3 = r0.startsWith(r3)
            if (r3 == 0) goto L3c
            goto L51
        L3c:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Blocked unsafe tar entry: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L51:
            return r1
    }

    private static void setExecutableRecursive(java.io.File r3) {
            boolean r0 = r3.exists()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r3.isFile()
            r1 = 0
            if (r0 == 0) goto L13
            r0 = 1
            r3.setExecutable(r0, r1)
            return
        L13:
            java.io.File[] r3 = r3.listFiles()
            if (r3 != 0) goto L1a
            return
        L1a:
            int r0 = r3.length
        L1b:
            if (r1 >= r0) goto L25
            r2 = r3[r1]
            setExecutableRecursive(r2)
            int r1 = r1 + 1
            goto L1b
        L25:
            return
    }

    private static void setJexecExecutable(java.io.File r6) {
            r0 = 8
            java.io.File[] r1 = new java.io.File[r0]
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "lib/jexec"
            r2.<init>(r6, r3)
            r3 = 0
            r1[r3] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "jre/lib/jexec"
            r2.<init>(r6, r4)
            r4 = 1
            r1[r4] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "lib/aarch64/jexec"
            r2.<init>(r6, r5)
            r5 = 2
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "lib/arm64/jexec"
            r2.<init>(r6, r5)
            r5 = 3
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "lib/arm64-v8a/jexec"
            r2.<init>(r6, r5)
            r5 = 4
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "lib/arm/jexec"
            r2.<init>(r6, r5)
            r5 = 5
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "lib/x86_64/jexec"
            r2.<init>(r6, r5)
            r5 = 6
            r1[r5] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r5 = "lib/i386/jexec"
            r2.<init>(r6, r5)
            r6 = 7
            r1[r6] = r2
            r6 = r3
        L55:
            if (r6 >= r0) goto L65
            r2 = r1[r6]
            boolean r5 = r2.exists()
            if (r5 == 0) goto L62
            r2.setExecutable(r4, r3)
        L62:
            int r6 = r6 + 1
            goto L55
        L65:
            return
    }

    private static void unpackPack200Files(java.io.File r8) throws java.io.IOException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            collectPackFiles(r8, r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lf
            return
        Lf:
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.String r3 = "libunpack200.so"
            r1.<init>(r2, r3)
            java.io.File r2 = findUnpack200(r8)
            boolean r3 = r1.isFile()
            if (r3 != 0) goto L50
            if (r2 == 0) goto L2b
            boolean r3 = r2.isFile()
            if (r3 == 0) goto L2b
            goto L50
        L2b:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Runtime has .pack files but neither APK libunpack200.so nor runtime bin/unpack200 was found. runtime="
            r1.<init>(r2)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r1 = " nativeDir="
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            java.lang.StringBuilder r8 = r8.append(r1)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        L50:
            java.lang.String r8 = buildRuntimeLdLibraryPath(r8)
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L11b
            java.lang.Object r3 = r0.next()
            java.io.File r3 = (java.io.File) r3
            java.lang.String r4 = r3.getAbsolutePath()
            java.lang.String r5 = ".pack"
            boolean r6 = r4.endsWith(r5)
            if (r6 != 0) goto L71
            goto L58
        L71:
            java.io.File r6 = new java.io.File
            int r7 = r4.length()
            int r5 = r5.length()
            int r7 = r7 - r5
            r5 = 0
            java.lang.String r4 = r4.substring(r5, r7)
            r6.<init>(r4)
            java.io.File r4 = r6.getParentFile()
            if (r4 == 0) goto Lb0
            boolean r5 = r4.exists()
            if (r5 != 0) goto Lb0
            boolean r5 = r4.mkdirs()
            if (r5 == 0) goto L97
            goto Lb0
        L97:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r0.<init>(r1)
            java.lang.String r1 = r4.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Lb0:
            boolean r4 = r6.exists()
            if (r4 == 0) goto Ld6
            boolean r4 = r6.delete()
            if (r4 == 0) goto Lbd
            goto Ld6
        Lbd:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to replace existing unpacked jar: "
            r0.<init>(r1)
            java.lang.String r1 = r6.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        Ld6:
            boolean r4 = r1.isFile()
            if (r4 == 0) goto Lea
            runApkNativeUnpack200(r1, r8, r3, r6)     // Catch: java.io.IOException -> Le1
            goto L58
        Le1:
            r4 = move-exception
            java.lang.String r5 = "MultiRTUtils"
            java.lang.String r7 = "APK libunpack200.so failed, trying runtime unpack200 if available"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r5, r7, r4)
            goto Leb
        Lea:
            r4 = 0
        Leb:
            if (r2 == 0) goto Lff
            boolean r5 = r2.isFile()
            if (r5 == 0) goto Lff
            runRuntimeUnpack200(r2, r8, r3, r6)     // Catch: java.io.IOException -> Lf8
            goto L58
        Lf8:
            r8 = move-exception
            if (r4 == 0) goto Lfe
            r8.addSuppressed(r4)
        Lfe:
            throw r8
        Lff:
            if (r4 == 0) goto L102
            throw r4
        L102:
            java.io.IOException r8 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to unpack pack200 file: "
            r0.<init>(r1)
            java.lang.String r1 = r3.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L11b:
            return
    }

    private static void writeText(java.io.File r2, java.lang.String r3) throws java.io.IOException {
            java.io.File r0 = r2.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r3.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2c:
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r2)
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L3e
            byte[] r2 = r3.getBytes(r2)     // Catch: java.lang.Throwable -> L3e
            r0.write(r2)     // Catch: java.lang.Throwable -> L3e
            r0.close()
            return
        L3e:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L43
            goto L47
        L43:
            r3 = move-exception
            r2.addSuppressed(r3)
        L47:
            throw r2
    }
}
