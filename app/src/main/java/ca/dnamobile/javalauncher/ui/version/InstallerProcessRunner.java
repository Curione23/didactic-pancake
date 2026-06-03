package ca.dnamobile.javalauncher.ui.version;

/* JADX INFO: loaded from: classes.dex */
final class InstallerProcessRunner {
    private static final long HEARTBEAT_SECONDS = 5;
    private static final java.lang.String TAG = "InstallerProcessRunner";
    private static final int TAIL_LIMIT = 120;
    private static final long TIMEOUT_MINUTES = 15;

    private InstallerProcessRunner() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addArchCandidate(java.util.ArrayList<java.lang.String> r4, java.lang.String r5) {
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
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
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

    private static void addJvmArgIfMissing(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            r0 = 61
            int r0 = r4.indexOf(r0)
            if (r0 <= 0) goto L28
            int r0 = r0 + 1
            r1 = 0
            java.lang.String r0 = r4.substring(r1, r0)
            java.util.Iterator r1 = r3.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L13
            boolean r2 = r2.startsWith(r0)
            if (r2 == 0) goto L13
            return
        L28:
            boolean r0 = r3.contains(r4)
            if (r0 == 0) goto L2f
            return
        L2f:
            r3.add(r4)
            return
    }

    private static void appendPath(java.lang.StringBuilder r1, java.io.File r2) {
            boolean r0 = r2.isDirectory()
            if (r0 != 0) goto L7
            return
        L7:
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.String r0 = r1.toString()
            boolean r0 = containsPath(r0, r2)
            if (r0 == 0) goto L16
            return
        L16:
            int r0 = r1.length()
            if (r0 <= 0) goto L21
            r0 = 58
            r1.append(r0)
        L21:
            r1.append(r2)
            return
    }

    private static java.util.ArrayList<java.lang.String> buildEffectiveArgs(java.io.File r3, java.io.File r4, java.util.List<java.lang.String> r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-Djava.home="
            r1.<init>(r2)
            java.lang.String r2 = r3.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            addJvmArgIfMissing(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-Djava.library.path="
            r1.<init>(r2)
            java.lang.String r2 = buildLdLibraryPath(r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            addJvmArgIfMissing(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "-Dsun.boot.library.path="
            r1.<init>(r2)
            java.lang.String r3 = buildLdLibraryPath(r3)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            addJvmArgIfMissing(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "-Duser.dir="
            r3.<init>(r1)
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            addJvmArgIfMissing(r0, r3)
            java.lang.String r3 = "-Dorg.slf4j.simpleLogger.defaultLogLevel=warn"
            addJvmArgIfMissing(r0, r3)
            java.lang.String r3 = "-Dlog4j2.level=warn"
            addJvmArgIfMissing(r0, r3)
            java.lang.String r3 = "-Djava.util.logging.ConsoleHandler.level=WARNING"
            addJvmArgIfMissing(r0, r3)
            r0.addAll(r5)
            return r0
    }

    private static java.lang.String buildLdLibraryPath(java.io.File r3) {
            java.io.File r3 = resolveRuntimeLibDir(r3)
            java.io.File r0 = resolveJvmLibraryDir(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            appendPath(r1, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "jli"
            r0.<init>(r3, r2)
            appendPath(r1, r0)
            appendPath(r1, r3)
            java.lang.String r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r3 == 0) goto L2f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L2f
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            appendPath(r1, r0)
        L2f:
            java.lang.String r3 = r1.toString()
            return r3
    }

    private static boolean containsPath(java.lang.String r4, java.lang.String r5) {
            boolean r0 = r4.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ":"
            java.lang.String[] r4 = r4.split(r0)
            int r0 = r4.length
            r2 = r1
        L10:
            if (r2 >= r0) goto L1f
            r3 = r4[r2]
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L1c
            r4 = 1
            return r4
        L1c:
            int r2 = r2 + 1
            goto L10
        L1f:
            return r1
    }

    private static void drainOutput(java.lang.String r4, java.lang.Process r5, java.util.ArrayDeque<java.lang.String> r6, java.util.concurrent.atomic.AtomicInteger r7, java.util.concurrent.atomic.AtomicInteger r8, java.util.concurrent.atomic.AtomicInteger r9, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r10) {
            java.lang.String r0 = "InstallerProcessRunner"
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L85
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L85
            java.io.InputStream r5 = r5.getInputStream()     // Catch: java.lang.Throwable -> L85
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L85
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L85
        L10:
            java.lang.String r5 = r1.readLine()     // Catch: java.lang.Throwable -> L7b
            if (r5 == 0) goto L77
            r7.incrementAndGet()     // Catch: java.lang.Throwable -> L7b
            rememberTail(r6, r5)     // Catch: java.lang.Throwable -> L7b
            boolean r2 = isNoisyInstallerLine(r5)     // Catch: java.lang.Throwable -> L7b
            if (r2 == 0) goto L56
            int r5 = r8.incrementAndGet()     // Catch: java.lang.Throwable -> L7b
            int r2 = r5 / 500
            if (r2 <= 0) goto L10
            int r3 = r9.getAndSet(r2)     // Catch: java.lang.Throwable -> L7b
            if (r3 == r2) goto L10
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = friendlyName(r4)     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = " installer is applying patches... ("
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = " lines)"
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7b
            r2 = 0
            notify(r10, r2, r5)     // Catch: java.lang.Throwable -> L7b
            goto L10
        L56:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r2.<init>()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "[installer:"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r3 = "] "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L7b
            java.lang.StringBuilder r5 = r2.append(r5)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7b
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)     // Catch: java.lang.Throwable -> L7b
            goto L10
        L77:
            r1.close()     // Catch: java.lang.Throwable -> L85
            goto L98
        L7b:
            r5 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L80
            goto L84
        L80:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.lang.Throwable -> L85
        L84:
            throw r5     // Catch: java.lang.Throwable -> L85
        L85:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Installer output reader failed for "
            r6.<init>(r7)
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r0, r4, r5)
        L98:
            return
    }

    private static java.lang.String friendlyName(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = "neoforge"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L11
            java.lang.String r1 = "NeoForge"
            return r1
        L11:
            java.lang.String r0 = "forge"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1c
            java.lang.String r1 = "Forge"
            return r1
        L1c:
            java.lang.String r1 = "Loader"
            return r1
    }

    private static java.util.ArrayList<java.lang.String> getRuntimeArchCandidates() {
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

    private static boolean isNoisyInstallerLine(java.lang.String r3) {
            r0 = 1
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r3 = r3.trim()
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r1)
            java.lang.String r1 = "error"
            boolean r1 = r3.contains(r1)
            r2 = 0
            if (r1 != 0) goto L9a
            java.lang.String r1 = "exception"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L9a
            java.lang.String r1 = "failed"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L9a
            java.lang.String r1 = "warning"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L9a
            java.lang.String r1 = "successfully installed"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L9a
            java.lang.String r1 = "processor failed"
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L47
            goto L9a
        L47:
            java.lang.String r1 = ".class"
            boolean r1 = r3.endsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = ".class/"
            boolean r1 = r3.endsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "/"
            boolean r1 = r3.endsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "reading patch "
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "patching "
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "checksum:"
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "copying "
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "extracting "
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "scanning "
            boolean r1 = r3.startsWith(r1)
            if (r1 != 0) goto L99
            java.lang.String r1 = "java.io.file "
            boolean r3 = r3.startsWith(r1)
            if (r3 == 0) goto L98
            goto L99
        L98:
            r0 = r2
        L99:
            return r0
        L9a:
            return r2
    }

    static /* synthetic */ void lambda$runProcess$0(java.lang.String r0, java.lang.Process r1, java.util.ArrayDeque r2, java.util.concurrent.atomic.AtomicInteger r3, java.util.concurrent.atomic.AtomicInteger r4, java.util.concurrent.atomic.AtomicInteger r5, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r6) {
            drainOutput(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static int launch(android.content.Context r17, java.lang.String r18, java.io.File r19, java.io.File r20, java.util.List<java.lang.String> r21, int r22, int r23, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r24) throws java.lang.Exception {
            r11 = r22
            r12 = r24
            java.lang.String r13 = "InstallerProcessRunner"
            java.lang.String r0 = "Direct installer exec returned "
            java.io.File r14 = new java.io.File
            java.lang.String r1 = "bin/java"
            r15 = r19
            r14.<init>(r15, r1)
            boolean r1 = r14.isFile()
            if (r1 == 0) goto Led
            boolean r1 = r14.canExecute()
            if (r1 != 0) goto L22
            r1 = 0
            r2 = 1
            r14.setExecutable(r2, r1)
        L22:
            boolean r1 = r20.exists()
            if (r1 != 0) goto L48
            boolean r1 = r20.mkdirs()
            if (r1 == 0) goto L2f
            goto L48
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to create working directory: "
            r1.<init>(r2)
            java.lang.String r2 = r20.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L48:
            java.util.ArrayList r16 = buildEffectiveArgs(r19, r20, r21)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Starting "
            r1.<init>(r2)
            java.lang.String r2 = friendlyName(r18)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " installer JVM..."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            notify(r12, r11, r1)
            r7 = 0
            r1 = r17
            r2 = r18
            r3 = r14
            r4 = r20
            r5 = r19
            r6 = r16
            r8 = r22
            r9 = r23
            r10 = r24
            int r1 = runProcess(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L9e
            r2 = 126(0x7e, float:1.77E-43)
            if (r1 == r2) goto L87
            r2 = 127(0x7f, float:1.78E-43)
            if (r1 == r2) goto L87
            return r1
        L87:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L9e
            r2.<init>(r0)     // Catch: java.io.IOException -> L9e
            java.lang.StringBuilder r0 = r2.append(r1)     // Catch: java.io.IOException -> L9e
            java.lang.String r1 = "; retrying through Android linker."
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.io.IOException -> L9e
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L9e
            ca.dnamobile.javalauncher.feature.log.Logging.i(r13, r0)     // Catch: java.io.IOException -> L9e
            goto Lb5
        L9e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Direct installer exec failed; retrying through Android linker: "
            r1.<init>(r2)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r13, r0)
        Lb5:
            java.io.File r0 = resolveSystemLinker()
            if (r0 == 0) goto Le5
            boolean r0 = r0.isFile()
            if (r0 == 0) goto Le5
            int r0 = r11 + 1
            r1 = 100
            int r0 = java.lang.Math.min(r1, r0)
            java.lang.String r1 = "Retrying installer through Android system linker..."
            notify(r12, r0, r1)
            r7 = 1
            r1 = r17
            r2 = r18
            r3 = r14
            r4 = r20
            r5 = r19
            r6 = r16
            r8 = r22
            r9 = r23
            r10 = r24
            int r0 = runProcess(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        Le5:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "Direct Java start was blocked and no Android system linker was found."
            r0.<init>(r1)
            throw r0
        Led:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Missing Java binary: "
            r1.<init>(r2)
            java.lang.String r2 = r14.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private static void logTail(java.lang.String r5, java.util.ArrayDeque<java.lang.String> r6) {
            java.lang.String r0 = "Last installer output lines for "
            monitor-enter(r6)
            java.lang.String r1 = "InstallerProcessRunner"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r0 = r2.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = ":"
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L50
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r0 = r6.iterator()     // Catch: java.lang.Throwable -> L50
        L1f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L50
            java.lang.String r2 = "InstallerProcessRunner"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            r3.<init>()     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "[installer-tail:"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "] "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.StringBuilder r1 = r3.append(r1)     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L50
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r1)     // Catch: java.lang.Throwable -> L50
            goto L1f
        L4e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            return
        L50:
            r5 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L50
            throw r5
    }

    private static void notify(ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r1, int r2, java.lang.String r3) {
            if (r1 == 0) goto L12
            if (r2 <= 0) goto L12
            r0 = 100
            int r2 = java.lang.Math.min(r0, r2)
            r0 = 0
            int r2 = java.lang.Math.max(r0, r2)
            r1.onProgress(r2, r3)
        L12:
            java.lang.String r1 = "InstallerProcessRunner"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r3)
            return
    }

    private static void rememberTail(java.util.ArrayDeque<java.lang.String> r2, java.lang.String r3) {
            monitor-enter(r2)
            int r0 = r2.size()     // Catch: java.lang.Throwable -> L11
            r1 = 120(0x78, float:1.68E-43)
            if (r0 < r1) goto Lc
            r2.removeFirst()     // Catch: java.lang.Throwable -> L11
        Lc:
            r2.addLast(r3)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            return
        L11:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    private static java.io.File resolveHeapTaggingPreloadLibrary(android.content.Context r2) {
            android.content.pm.ApplicationInfo r0 = r2.getApplicationInfo()
            if (r0 == 0) goto Ld
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo()
            java.lang.String r2 = r2.nativeLibraryDir
            goto Le
        Ld:
            r2 = 0
        Le:
            java.lang.String r0 = "libdisable_heap_tagging.so"
            if (r2 == 0) goto L1e
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L1e
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            return r1
        L1e:
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r2 == 0) goto L2e
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L2e
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            return r1
        L2e:
            java.io.File r2 = new java.io.File
            r2.<init>(r0)
            return r2
    }

    private static java.io.File resolveJvmLibraryDir(java.io.File r4) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "server"
            r0.<init>(r4, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "libjvm.so"
            r1.<init>(r0, r2)
            boolean r1 = r1.isFile()
            if (r1 == 0) goto L15
            return r0
        L15:
            java.io.File r1 = new java.io.File
            java.lang.String r3 = "client"
            r1.<init>(r4, r3)
            java.io.File r4 = new java.io.File
            r4.<init>(r1, r2)
            boolean r4 = r4.isFile()
            if (r4 == 0) goto L28
            return r1
        L28:
            return r0
    }

    private static java.io.File resolveRuntimeLibDir(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib"
            r0.<init>(r3, r1)
            java.util.ArrayList r3 = getRuntimeArchCandidates()
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r3.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r2 = new java.io.File
            r2.<init>(r0, r1)
            boolean r1 = r2.isDirectory()
            if (r1 == 0) goto Lf
            return r2
        L27:
            return r0
    }

    private static java.io.File resolveSystemLinker() {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/bin/linker64"
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Le
            return r0
        Le:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "/system/bin/linker"
            r0.<init>(r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    private static int runProcess(android.content.Context r22, java.lang.String r23, java.io.File r24, java.io.File r25, java.io.File r26, java.util.List<java.lang.String> r27, boolean r28, int r29, int r30, ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.InstallProgressListener r31) throws java.lang.Exception {
            r8 = r23
            r9 = r31
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r28 == 0) goto L27
            java.io.File r1 = resolveSystemLinker()
            if (r1 == 0) goto L1f
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L1f
            java.lang.String r1 = r1.getAbsolutePath()
            r0.add(r1)
            goto L27
        L1f:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r1 = "No Android system linker found for installer fallback."
            r0.<init>(r1)
            throw r0
        L27:
            java.lang.String r1 = r24.getAbsolutePath()
            r0.add(r1)
            r1 = r27
            r0.addAll(r1)
            java.lang.ProcessBuilder r1 = new java.lang.ProcessBuilder
            r1.<init>(r0)
            r0 = r25
            r1.directory(r0)
            r10 = 1
            r1.redirectErrorStream(r10)
            java.util.Map r2 = r1.environment()
            sanitizeEnvironment(r2)
            java.lang.String r3 = "JAVA_HOME"
            java.lang.String r4 = r26.getAbsolutePath()
            r2.put(r3, r4)
            java.lang.String r3 = "HOME"
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r2.put(r3, r4)
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r4 = "TMPDIR"
            r2.put(r4, r3)
            java.lang.String r3 = "LD_LIBRARY_PATH"
            java.lang.String r4 = buildLdLibraryPath(r26)
            r2.put(r3, r4)
            java.io.File r3 = new java.io.File
            java.lang.String r4 = "bin"
            r5 = r26
            r3.<init>(r5, r4)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.String r4 = "PATH"
            java.lang.Object r5 = r2.get(r4)
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto La0
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto La0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.StringBuilder r3 = r6.append(r3)
            java.lang.String r6 = ":"
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
        La0:
            r2.put(r4, r3)
            java.io.File r3 = resolveHeapTaggingPreloadLibrary(r22)
            boolean r4 = r3.isFile()
            java.lang.String r5 = "LD_PRELOAD"
            if (r4 == 0) goto Lb7
            java.lang.String r3 = r3.getAbsolutePath()
            r2.put(r5, r3)
            goto Lba
        Lb7:
            r2.remove(r5)
        Lba:
            if (r28 == 0) goto Lbf
            java.lang.String r2 = "system-linker"
            goto Lc1
        Lbf:
            java.lang.String r2 = "direct-exec"
        Lc1:
            r11 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Installer launch mode="
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r3 = " task="
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.String r12 = "InstallerProcessRunner"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r12, r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Installer cwd="
            r2.<init>(r3)
            java.lang.String r0 = r25.getAbsolutePath()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.String r0 = r0.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r12, r0)
            java.lang.Process r13 = r1.start()
            java.util.ArrayDeque r14 = new java.util.ArrayDeque
            r0 = 120(0x78, float:1.68E-43)
            r14.<init>(r0)
            java.util.concurrent.atomic.AtomicInteger r15 = new java.util.concurrent.atomic.AtomicInteger
            r7 = 0
            r15.<init>(r7)
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r6.<init>(r7)
            java.util.concurrent.atomic.AtomicInteger r5 = new java.util.concurrent.atomic.AtomicInteger
            r0 = -1
            r5.<init>(r0)
            java.lang.Thread r4 = new java.lang.Thread
            ca.dnamobile.javalauncher.ui.version.InstallerProcessRunner$$ExternalSyntheticLambda0 r3 = new ca.dnamobile.javalauncher.ui.version.InstallerProcessRunner$$ExternalSyntheticLambda0
            r0 = r3
            r1 = r23
            r2 = r13
            r10 = r3
            r3 = r14
            r22 = r12
            r12 = r4
            r4 = r15
            r16 = r5
            r5 = r6
            r17 = r6
            r6 = r16
            r25 = r15
            r15 = r7
            r7 = r31
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "QuietInstallerOutput-"
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r8)
            java.lang.String r0 = r0.toString()
            r12.<init>(r10, r0)
            r0 = 1
            r12.setDaemon(r0)
            r12.start()
            long r0 = java.lang.System.currentTimeMillis()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MINUTES
            r3 = 15
            long r2 = r2.toMillis(r3)
            r4 = 100
            r5 = r29
            int r5 = java.lang.Math.min(r4, r5)
            int r5 = java.lang.Math.max(r15, r5)
            r6 = r30
            int r4 = java.lang.Math.min(r4, r6)
            int r4 = java.lang.Math.max(r5, r4)
            java.lang.String r6 = friendlyName(r23)
        L16e:
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            r26 = r2
            r2 = 5
            boolean r7 = r13.waitFor(r2, r7)
            r2 = 5000(0x1388, double:2.4703E-320)
            if (r7 == 0) goto L1ed
            r12.join(r2)
            int r0 = r13.exitValue()
            if (r0 == 0) goto L188
            logTail(r8, r14)
        L188:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " installer JVM exited with code "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            notify(r9, r4, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Installer finished task="
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r8)
            java.lang.String r2 = " mode="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r11)
            java.lang.String r2 = " exitCode="
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = " drainedLines="
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r25.get()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " filteredNoise="
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r17.get()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r7 = r22
            ca.dnamobile.javalauncher.feature.log.Logging.i(r7, r1)
            return r0
        L1ed:
            r7 = r22
            long r18 = java.lang.System.currentTimeMillis()
            long r2 = r18 - r0
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            r18 = r0
            long r0 = r10.toSeconds(r2)
            int r10 = r4 - r5
            int r10 = java.lang.Math.max(r15, r10)
            r16 = r11
            long r10 = (long) r10
            r20 = 5
            long r7 = r0 / r20
            long r7 = java.lang.Math.min(r10, r7)
            int r7 = (int) r7
            int r7 = r7 + r5
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r6)
            java.lang.String r10 = " installer is patching files... ("
            java.lang.StringBuilder r8 = r8.append(r10)
            java.lang.StringBuilder r0 = r8.append(r0)
            java.lang.String r1 = "s)"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            notify(r9, r7, r0)
            r0 = r26
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 < 0) goto L269
            r13.destroy()
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 5
            boolean r0 = r13.waitFor(r1, r0)
            if (r0 != 0) goto L246
            r13.destroyForcibly()
        L246:
            r0 = 5000(0x1388, double:2.4703E-320)
            r12.join(r0)
            r2 = r23
            logTail(r2, r14)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r2 = " installer timed out after 15 minutes."
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L269:
            r8 = r23
            r2 = r0
            r11 = r16
            r0 = r18
            goto L16e
    }

    private static void sanitizeEnvironment(java.util.Map<java.lang.String, java.lang.String> r5) {
            r0 = 21
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "CLASSPATH"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "JAVA_TOOL_OPTIONS"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "JDK_JAVA_OPTIONS"
            r1[r2] = r4
            r2 = 3
            java.lang.String r4 = "_JAVA_OPTIONS"
            r1[r2] = r4
            r2 = 4
            java.lang.String r4 = "POJAV_RENDERER"
            r1[r2] = r4
            r2 = 5
            java.lang.String r4 = "POJAVEXEC_EGL"
            r1[r2] = r4
            r2 = 6
            java.lang.String r4 = "POJAV_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 7
            java.lang.String r4 = "POJAVEXEC_EGL_LIBRARY"
            r1[r2] = r4
            r2 = 8
            java.lang.String r4 = "POJAV_RENDERER_LIBRARY"
            r1[r2] = r4
            r2 = 9
            java.lang.String r4 = "POJAVEXEC_RENDERER"
            r1[r2] = r4
            r2 = 10
            java.lang.String r4 = "OSMESA_LIB"
            r1[r2] = r4
            r2 = 11
            java.lang.String r4 = "LIB_MESA_NAME"
            r1[r2] = r4
            r2 = 12
            java.lang.String r4 = "MESA_LOADER_DRIVER_OVERRIDE"
            r1[r2] = r4
            r2 = 13
            java.lang.String r4 = "GALLIUM_DRIVER"
            r1[r2] = r4
            r2 = 14
            java.lang.String r4 = "VK_ICD_FILENAMES"
            r1[r2] = r4
            r2 = 15
            java.lang.String r4 = "VK_DRIVER_FILES"
            r1[r2] = r4
            r2 = 16
            java.lang.String r4 = "DRIVER_PATH"
            r1[r2] = r4
            r2 = 17
            java.lang.String r4 = "LIBGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 18
            java.lang.String r4 = "EGL_DRIVERS_PATH"
            r1[r2] = r4
            r2 = 19
            java.lang.String r4 = "LTW_NEVER_FLUSH_BUFFERS"
            r1[r2] = r4
            r2 = 20
            java.lang.String r4 = "LTW_COHERENT_DYNAMIC_STORAGE"
            r1[r2] = r4
        L7a:
            if (r3 >= r0) goto L84
            r2 = r1[r3]
            r5.remove(r2)
            int r3 = r3 + 1
            goto L7a
        L84:
            return
    }
}
