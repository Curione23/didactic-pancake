package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibraryLoader.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibraryLoader.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/SharedLibraryLoader.class */
final class SharedLibraryLoader {
    private static final java.util.concurrent.locks.Lock EXTRACT_PATH_LOCK = null;

    @javax.annotation.concurrent.GuardedBy("EXTRACT_PATH_LOCK")
    @javax.annotation.Nullable
    private static java.nio.file.Path extractPath;
    private static java.util.HashSet<java.nio.file.Path> extractPaths;
    private static boolean checkedJDK8195129;

    private SharedLibraryLoader() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    static java.nio.channels.FileChannel load(java.lang.String r5, java.lang.String r6, java.net.URL r7, @javax.annotation.Nullable java.util.function.Consumer<java.lang.String> r8) {
            java.util.concurrent.locks.Lock r0 = org.lwjgl.system.SharedLibraryLoader.EXTRACT_PATH_LOCK     // Catch: java.lang.Exception -> L65
            r0.lock()     // Catch: java.lang.Exception -> L65
            java.nio.file.Path r0 = org.lwjgl.system.SharedLibraryLoader.extractPath     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            if (r0 == 0) goto L1c
            java.nio.file.Path r0 = org.lwjgl.system.SharedLibraryLoader.extractPath     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            r1 = r6
            java.nio.file.Path r0 = r0.resolve(r1)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            r9 = r0
            goto L46
        L1c:
            r0 = r6
            r1 = r7
            r2 = r8
            java.nio.file.Path r0 = getExtractPath(r0, r1, r2)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            r9 = r0
            r0 = r9
            java.nio.file.Path r0 = r0.getParent()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            r10 = r0
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            if (r0 != r1) goto L3c
            boolean r0 = org.lwjgl.system.SharedLibraryLoader.checkedJDK8195129     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            if (r0 == 0) goto L41
        L3c:
            r0 = r10
            org.lwjgl.system.SharedLibraryLoader.extractPath = r0     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
        L41:
            r0 = r10
            initExtractPath(r0)     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
        L46:
            java.util.concurrent.locks.Lock r0 = org.lwjgl.system.SharedLibraryLoader.EXTRACT_PATH_LOCK     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            r0.unlock()     // Catch: java.lang.Exception -> L65
            goto L5e
        L51:
            r11 = move-exception
            java.util.concurrent.locks.Lock r0 = org.lwjgl.system.SharedLibraryLoader.EXTRACT_PATH_LOCK     // Catch: java.lang.Throwable -> L51 java.lang.Exception -> L65
            r0.unlock()     // Catch: java.lang.Exception -> L65
            r0 = r11
            throw r0     // Catch: java.lang.Exception -> L65
        L5e:
            r0 = r9
            r1 = r7
            java.nio.channels.FileChannel r0 = extract(r0, r1)     // Catch: java.lang.Exception -> L65
            return r0
        L65:
            r9 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "\tFailed to extract "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r5
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " library"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
    }

    private static void initExtractPath(java.nio.file.Path r3) {
            java.util.HashSet<java.nio.file.Path> r0 = org.lwjgl.system.SharedLibraryLoader.extractPaths
            r1 = r3
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Lb
            return
        Lb:
            java.util.HashSet<java.nio.file.Path> r0 = org.lwjgl.system.SharedLibraryLoader.extractPaths
            r1 = r3
            boolean r0 = r0.add(r1)
            r0 = r3
            java.nio.file.Path r0 = r0.toAbsolutePath()
            java.lang.String r0 = r0.toString()
            r4 = r0
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L4d
            r0 = r5
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = java.io.File.pathSeparator
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4 = r0
        L4d:
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.String r0 = r0.getProperty()
            r1 = r4
            java.lang.String r0 = java.lang.System.setProperty(r0, r1)
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.LIBRARY_PATH
            r1 = r4
            r0.set(r1)
            return
    }

    private static java.nio.file.Path getExtractPath(java.lang.String r7, java.net.URL r8, @javax.annotation.Nullable java.util.function.Consumer<java.lang.String> r9) {
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.SHARED_LIBRARY_EXTRACT_PATH
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r12 = r0
            r0 = r12
            if (r0 == 0) goto L4d
            r0 = r12
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r1 = r0
            r10 = r1
            r1 = r7
            java.nio.file.Path r0 = r0.resolve(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            boolean r0 = canWrite(r0, r1, r2, r3)
            if (r0 == 0) goto L31
            r0 = r11
            return r0
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "The path "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " is not accessible. Trying other paths."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
        L4d:
            java.lang.String r0 = org.lwjgl.Version.getVersion()
            r1 = 32
            r2 = 45
            java.lang.String r0 = r0.replace(r1, r2)
            r13 = r0
            org.lwjgl.system.Platform$Architecture r0 = org.lwjgl.system.Platform.getArchitecture()
            java.lang.String r0 = r0.name()
            java.lang.String r0 = r0.toLowerCase()
            r14 = r0
            java.lang.String r0 = "java.io.tmpdir"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r1 = r0
            r10 = r1
            org.lwjgl.system.Configuration<java.lang.String> r1 = org.lwjgl.system.Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "lwjgl_"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "user.name"
            java.lang.String r3 = java.lang.System.getProperty(r3)
            java.lang.String r3 = r3.trim()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            r2 = 3
            java.lang.String[] r2 = new java.lang.String[r2]
            r3 = r2
            r4 = 0
            r5 = r13
            r3[r4] = r5
            r3 = r2
            r4 = 1
            r5 = r14
            r3[r4] = r5
            r3 = r2
            r4 = 2
            r5 = r7
            r3[r4] = r5
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1, r2)
            java.nio.file.Path r0 = r0.resolve(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            boolean r0 = canWrite(r0, r1, r2, r3)
            if (r0 == 0) goto Lbf
            r0 = r11
            return r0
        Lbf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            org.lwjgl.system.Configuration<java.lang.String> r1 = org.lwjgl.system.Configuration.SHARED_LIBRARY_EXTRACT_DIRECTORY
            java.lang.String r2 = "lwjgl"
            java.lang.Object r1 = r1.get(r2)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 3
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r13
            r2[r3] = r4
            r2 = r1
            r3 = 1
            r4 = r14
            r2[r3] = r4
            r2 = r1
            r3 = 2
            r4 = r7
            r2[r3] = r4
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r15 = r0
            java.lang.String r0 = ""
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            java.nio.file.Path r0 = r0.toAbsolutePath()
            r1 = r0
            r10 = r1
            r1 = r15
            java.nio.file.Path r0 = r0.resolve(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            boolean r0 = canWrite(r0, r1, r2, r3)
            if (r0 == 0) goto L11a
            r0 = r11
            return r0
        L11a:
            java.lang.String r0 = "user.home"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r1 = r0
            r10 = r1
            r1 = r15
            java.nio.file.Path r0 = r0.resolve(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            boolean r0 = canWrite(r0, r1, r2, r3)
            if (r0 == 0) goto L13f
            r0 = r11
            return r0
        L13f:
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS
            if (r0 != r1) goto L1c9
            java.lang.String r0 = "SystemRoot"
            java.lang.String r0 = java.lang.System.getenv(r0)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L17b
            r0 = r16
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            java.lang.String r4 = "Temp"
            r2[r3] = r4
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r1 = r0
            r10 = r1
            r1 = r15
            java.nio.file.Path r0 = r0.resolve(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            boolean r0 = canWrite(r0, r1, r2, r3)
            if (r0 == 0) goto L17b
            r0 = r11
            return r0
        L17b:
            java.lang.String r0 = "SystemDrive"
            java.lang.String r0 = java.lang.System.getenv(r0)
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L1c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r1 = r0
            r10 = r1
            java.lang.String r1 = "Temp"
            r2 = 0
            java.lang.String[] r2 = new java.lang.String[r2]
            java.nio.file.Path r1 = java.nio.file.Paths.get(r1, r2)
            r2 = r15
            java.nio.file.Path r1 = r1.resolve(r2)
            java.nio.file.Path r0 = r0.resolve(r1)
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            boolean r0 = canWrite(r0, r1, r2, r3)
            if (r0 == 0) goto L1c9
            r0 = r11
            return r0
        L1c9:
            java.lang.String r0 = "lwjgl"
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L1f7
            java.nio.file.Path r0 = java.nio.file.Files.createTempDirectory(r0, r1)     // Catch: java.io.IOException -> L1f7
            r11 = r0
            r0 = r11
            java.nio.file.Path r0 = r0.getParent()     // Catch: java.io.IOException -> L1f7
            r10 = r0
            r0 = r11
            r1 = r7
            java.nio.file.Path r0 = r0.resolve(r1)     // Catch: java.io.IOException -> L1f7
            r11 = r0
            r0 = r10
            r1 = r11
            r2 = r8
            r3 = r9
            boolean r0 = canWrite(r0, r1, r2, r3)     // Catch: java.io.IOException -> L1f7
            if (r0 == 0) goto L1f4
            r0 = r11
            return r0
        L1f4:
            goto L1f9
        L1f7:
            r16 = move-exception
        L1f9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Failed to find an appropriate directory to extract the native library"
            r1.<init>(r2)
            throw r0
    }

    private static java.nio.channels.FileChannel extract(java.nio.file.Path r7, java.net.URL r8) throws java.io.IOException {
            r0 = r7
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            boolean r0 = java.nio.file.Files.exists(r0, r1)
            if (r0 == 0) goto L142
            r0 = r8
            java.io.InputStream r0 = r0.openStream()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r7
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            r11 = r0
            r0 = 0
            r12 = r0
            r0 = r9
            long r0 = crc(r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            r1 = r11
            long r1 = crc(r1)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L9f
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_LOADER     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            if (r0 == 0) goto L55
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            r1 = r0
            r1.<init>()     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            java.lang.String r1 = "Found at: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
        L55:
            r0 = r7
            java.nio.channels.FileChannel r0 = lock(r0)     // Catch: java.lang.Throwable -> Lc5 java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            r13 = r0
            r0 = r11
            if (r0 == 0) goto L7e
            r0 = r12
            if (r0 == 0) goto L79
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L6d java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            goto L7e
        L6d:
            r14 = move-exception
            r0 = r12
            r1 = r14
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            goto L7e
        L79:
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
        L7e:
            r0 = r9
            if (r0 == 0) goto L9c
            r0 = r10
            if (r0 == 0) goto L98
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L8d
            goto L9c
        L8d:
            r14 = move-exception
            r0 = r10
            r1 = r14
            r0.addSuppressed(r1)
            goto L9c
        L98:
            r0 = r9
            r0.close()
        L9c:
            r0 = r13
            return r0
        L9f:
            r0 = r11
            if (r0 == 0) goto Lf6
            r0 = r12
            if (r0 == 0) goto Lbd
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            goto Lf6
        Lb1:
            r13 = move-exception
            r0 = r12
            r1 = r13
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            goto Lf6
        Lbd:
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            goto Lf6
        Lc5:
            r13 = move-exception
            r0 = r13
            r12 = r0
            r0 = r13
            throw r0     // Catch: java.lang.Throwable -> Lce java.lang.Throwable -> L117 java.lang.Throwable -> L11f
        Lce:
            r15 = move-exception
            r0 = r11
            if (r0 == 0) goto Lf3
            r0 = r12
            if (r0 == 0) goto Lee
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> Le2 java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            goto Lf3
        Le2:
            r16 = move-exception
            r0 = r12
            r1 = r16
            r0.addSuppressed(r1)     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
            goto Lf3
        Lee:
            r0 = r11
            r0.close()     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
        Lf3:
            r0 = r15
            throw r0     // Catch: java.lang.Throwable -> L117 java.lang.Throwable -> L11f
        Lf6:
            r0 = r9
            if (r0 == 0) goto L142
            r0 = r10
            if (r0 == 0) goto L110
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L105
            goto L142
        L105:
            r11 = move-exception
            r0 = r10
            r1 = r11
            r0.addSuppressed(r1)
            goto L142
        L110:
            r0 = r9
            r0.close()
            goto L142
        L117:
            r11 = move-exception
            r0 = r11
            r10 = r0
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L11f
        L11f:
            r17 = move-exception
            r0 = r9
            if (r0 == 0) goto L13f
            r0 = r10
            if (r0 == 0) goto L13b
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L130
            goto L13f
        L130:
            r18 = move-exception
            r0 = r10
            r1 = r18
            r0.addSuppressed(r1)
            goto L13f
        L13b:
            r0 = r9
            r0.close()
        L13f:
            r0 = r17
            throw r0
        L142:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Extracting: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.String r1 = r1.getPath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            java.nio.file.Path r0 = org.lwjgl.system.SharedLibraryLoader.extractPath
            if (r0 != 0) goto L177
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "        to: "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
        L177:
            r0 = r7
            java.nio.file.Path r0 = r0.getParent()
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]
            java.nio.file.Path r0 = java.nio.file.Files.createDirectories(r0, r1)
            r0 = r8
            java.io.InputStream r0 = r0.openStream()
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            r1 = r7
            r2 = 1
            java.nio.file.CopyOption[] r2 = new java.nio.file.CopyOption[r2]     // Catch: java.lang.Throwable -> L1bd java.lang.Throwable -> L1c5
            r3 = r2
            r4 = 0
            java.nio.file.StandardCopyOption r5 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.lang.Throwable -> L1bd java.lang.Throwable -> L1c5
            r3[r4] = r5     // Catch: java.lang.Throwable -> L1bd java.lang.Throwable -> L1c5
            long r0 = java.nio.file.Files.copy(r0, r1, r2)     // Catch: java.lang.Throwable -> L1bd java.lang.Throwable -> L1c5
            r0 = r9
            if (r0 == 0) goto L1e8
            r0 = r10
            if (r0 == 0) goto L1b6
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L1ab
            goto L1e8
        L1ab:
            r11 = move-exception
            r0 = r10
            r1 = r11
            r0.addSuppressed(r1)
            goto L1e8
        L1b6:
            r0 = r9
            r0.close()
            goto L1e8
        L1bd:
            r11 = move-exception
            r0 = r11
            r10 = r0
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L1c5
        L1c5:
            r19 = move-exception
            r0 = r9
            if (r0 == 0) goto L1e5
            r0 = r10
            if (r0 == 0) goto L1e1
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L1d6
            goto L1e5
        L1d6:
            r20 = move-exception
            r0 = r10
            r1 = r20
            r0.addSuppressed(r1)
            goto L1e5
        L1e1:
            r0 = r9
            r0.close()
        L1e5:
            r0 = r19
            throw r0
        L1e8:
            r0 = r7
            java.nio.channels.FileChannel r0 = lock(r0)
            return r0
    }

    private static java.nio.channels.FileChannel lock(java.nio.file.Path r7) {
            r0 = r7
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]     // Catch: java.lang.Exception -> L39
            java.nio.channels.FileChannel r0 = java.nio.channels.FileChannel.open(r0, r1)     // Catch: java.lang.Exception -> L39
            r8 = r0
            r0 = r8
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 1
            java.nio.channels.FileLock r0 = r0.tryLock(r1, r2, r3)     // Catch: java.lang.Exception -> L39
            if (r0 != 0) goto L37
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_LOADER     // Catch: java.lang.Exception -> L39
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L39
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L39
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L39
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L39
            if (r0 == 0) goto L2d
            java.lang.String r0 = "File is locked by another process, waiting..."
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L39
        L2d:
            r0 = r8
            r1 = 0
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r3 = 1
            java.nio.channels.FileLock r0 = r0.lock(r1, r2, r3)     // Catch: java.lang.Exception -> L39
        L37:
            r0 = r8
            return r0
        L39:
            r8 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r1 = r0
            java.lang.String r2 = "Failed to lock file."
            r3 = r8
            r1.<init>(r2, r3)
            throw r0
    }

    private static long crc(java.io.InputStream r5) throws java.io.IOException {
            java.util.zip.CRC32 r0 = new java.util.zip.CRC32
            r1 = r0
            r1.<init>()
            r6 = r0
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r7 = r0
        Le:
            r0 = r5
            r1 = r7
            int r0 = r0.read(r1)
            r1 = r0
            r8 = r1
            r1 = -1
            if (r0 == r1) goto L23
            r0 = r6
            r1 = r7
            r2 = 0
            r3 = r8
            r0.update(r1, r2, r3)
            goto Le
        L23:
            r0 = r6
            long r0 = r0.getValue()
            return r0
    }

    private static boolean canWrite(java.nio.file.Path r4, java.nio.file.Path r5, java.net.URL r6, @javax.annotation.Nullable java.util.function.Consumer<java.lang.String> r7) {
            r0 = r5
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            boolean r0 = java.nio.file.Files.exists(r0, r1)
            if (r0 == 0) goto L26
            r0 = r5
            boolean r0 = java.nio.file.Files.isWritable(r0)
            if (r0 != 0) goto L14
            r0 = 0
            return r0
        L14:
            r0 = r5
            java.nio.file.Path r0 = r0.getParent()
            java.lang.String r1 = ".lwjgl.test"
            java.nio.file.Path r0 = r0.resolve(r1)
            r8 = r0
            goto L3e
        L26:
            r0 = r5
            java.nio.file.Path r0 = r0.getParent()     // Catch: java.io.IOException -> L37
            r1 = 0
            java.nio.file.attribute.FileAttribute[] r1 = new java.nio.file.attribute.FileAttribute[r1]     // Catch: java.io.IOException -> L37
            java.nio.file.Path r0 = java.nio.file.Files.createDirectories(r0, r1)     // Catch: java.io.IOException -> L37
            goto L3b
        L37:
            r9 = move-exception
            r0 = 0
            return r0
        L3b:
            r0 = r5
            r8 = r0
        L3e:
            r0 = r8
            r1 = 0
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L65
            r2 = 0
            java.nio.file.OpenOption[] r2 = new java.nio.file.OpenOption[r2]     // Catch: java.lang.Throwable -> L65
            java.nio.file.Path r0 = java.nio.file.Files.write(r0, r1, r2)     // Catch: java.lang.Throwable -> L65
            r0 = r8
            java.nio.file.Files.delete(r0)     // Catch: java.lang.Throwable -> L65
            r0 = r7
            if (r0 == 0) goto L63
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()     // Catch: java.lang.Throwable -> L65
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS     // Catch: java.lang.Throwable -> L65
            if (r0 != r1) goto L63
            r0 = r5
            r1 = r6
            r2 = r7
            workaroundJDK8195129(r0, r1, r2)     // Catch: java.lang.Throwable -> L65
        L63:
            r0 = 1
            return r0
        L65:
            r9 = move-exception
            r0 = r5
            r1 = r8
            if (r0 != r1) goto L72
            r0 = r4
            r1 = r5
            canWriteCleanup(r0, r1)
        L72:
            r0 = 0
            return r0
    }

    private static void canWriteCleanup(java.nio.file.Path r3, java.nio.file.Path r4) {
            r0 = r4
            boolean r0 = java.nio.file.Files.deleteIfExists(r0)     // Catch: java.io.IOException -> Lb9
            r0 = r4
            java.nio.file.Path r0 = r0.getParent()     // Catch: java.io.IOException -> Lb9
            r5 = r0
        Lc:
            r0 = r5
            r1 = r3
            boolean r0 = java.nio.file.Files.isSameFile(r0, r1)     // Catch: java.io.IOException -> Lb9
            if (r0 != 0) goto Lb6
            r0 = r5
            java.util.stream.Stream r0 = java.nio.file.Files.list(r0)     // Catch: java.io.IOException -> Lb9
            r6 = r0
            r0 = 0
            r7 = r0
            r0 = r6
            java.util.Optional r0 = r0.findAny()     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L7f java.io.IOException -> Lb9
            boolean r0 = r0.isPresent()     // Catch: java.lang.Throwable -> L76 java.lang.Throwable -> L7f java.io.IOException -> Lb9
            if (r0 == 0) goto L4f
            r0 = r6
            if (r0 == 0) goto Lb6
            r0 = r7
            if (r0 == 0) goto L46
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L3a java.io.IOException -> Lb9
            goto Lb6
        L3a:
            r8 = move-exception
            r0 = r7
            r1 = r8
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> Lb9
            goto Lb6
        L46:
            r0 = r6
            r0.close()     // Catch: java.io.IOException -> Lb9
            goto Lb6
        L4f:
            r0 = r6
            if (r0 == 0) goto La8
            r0 = r7
            if (r0 == 0) goto L6d
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L61 java.io.IOException -> Lb9
            goto La8
        L61:
            r8 = move-exception
            r0 = r7
            r1 = r8
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> Lb9
            goto La8
        L6d:
            r0 = r6
            r0.close()     // Catch: java.io.IOException -> Lb9
            goto La8
        L76:
            r8 = move-exception
            r0 = r8
            r7 = r0
            r0 = r8
            throw r0     // Catch: java.lang.Throwable -> L7f java.io.IOException -> Lb9
        L7f:
            r9 = move-exception
            r0 = r6
            if (r0 == 0) goto La5
            r0 = r7
            if (r0 == 0) goto L9f
            r0 = r6
            r0.close()     // Catch: java.lang.Throwable -> L93 java.io.IOException -> Lb9
            goto La5
        L93:
            r10 = move-exception
            r0 = r7
            r1 = r10
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> Lb9
            goto La5
        L9f:
            r0 = r6
            r0.close()     // Catch: java.io.IOException -> Lb9
        La5:
            r0 = r9
            throw r0     // Catch: java.io.IOException -> Lb9
        La8:
            r0 = r5
            java.nio.file.Files.delete(r0)     // Catch: java.io.IOException -> Lb9
            r0 = r5
            java.nio.file.Path r0 = r0.getParent()     // Catch: java.io.IOException -> Lb9
            r5 = r0
            goto Lc
        Lb6:
            goto Lba
        Lb9:
            r5 = move-exception
        Lba:
            return
    }

    private static void workaroundJDK8195129(java.nio.file.Path r4, java.net.URL r5, @javax.annotation.Nonnull java.util.function.Consumer<java.lang.String> r6) throws java.lang.Throwable {
            r0 = r4
            java.nio.file.Path r0 = r0.toAbsolutePath()
            java.lang.String r0 = r0.toString()
            r7 = r0
            r0 = r7
            java.lang.String r1 = ".dll"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto Lb4
            r0 = 0
            r8 = r0
            r0 = 0
            r9 = r0
        L1b:
            r0 = r9
            r1 = r7
            int r1 = r1.length()
            if (r0 >= r1) goto L39
            r0 = 128(0x80, float:1.8E-43)
            r1 = r7
            r2 = r9
            char r1 = r1.charAt(r2)
            if (r0 > r1) goto L33
            r0 = 1
            r8 = r0
        L33:
            int r9 = r9 + 1
            goto L1b
        L39:
            r0 = r8
            if (r0 == 0) goto Lb0
            r0 = r4
            r1 = r5
            java.nio.channels.FileChannel r0 = extract(r0, r1)
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r6
            r1 = r4
            java.nio.file.Path r1 = r1.toAbsolutePath()     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L88
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L88
            r0.accept(r1)     // Catch: java.lang.Throwable -> L7f java.lang.Throwable -> L88
            r0 = r9
            if (r0 == 0) goto Lb0
            r0 = r10
            if (r0 == 0) goto L77
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L6b
            goto Lb0
        L6b:
            r11 = move-exception
            r0 = r10
            r1 = r11
            r0.addSuppressed(r1)
            goto Lb0
        L77:
            r0 = r9
            r0.close()
            goto Lb0
        L7f:
            r11 = move-exception
            r0 = r11
            r10 = r0
            r0 = r11
            throw r0     // Catch: java.lang.Throwable -> L88
        L88:
            r12 = move-exception
            r0 = r9
            if (r0 == 0) goto Lad
            r0 = r10
            if (r0 == 0) goto La8
            r0 = r9
            r0.close()     // Catch: java.lang.Throwable -> L9c
            goto Lad
        L9c:
            r13 = move-exception
            r0 = r10
            r1 = r13
            r0.addSuppressed(r1)
            goto Lad
        La8:
            r0 = r9
            r0.close()
        Lad:
            r0 = r12
            throw r0
        Lb0:
            r0 = 1
            org.lwjgl.system.SharedLibraryLoader.checkedJDK8195129 = r0
        Lb4:
            return
    }

    static {
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r1 = r0
            r1.<init>()
            org.lwjgl.system.SharedLibraryLoader.EXTRACT_PATH_LOCK = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = r0
            r2 = 4
            r1.<init>(r2)
            org.lwjgl.system.SharedLibraryLoader.extractPaths = r0
            return
    }
}
