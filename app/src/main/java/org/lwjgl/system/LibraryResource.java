package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/LibraryResource.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/LibraryResource.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/LibraryResource.class */
public final class LibraryResource {
    private LibraryResource() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static java.nio.file.Path load(java.lang.String r4, java.lang.String r5) {
            java.lang.Class<org.lwjgl.system.LibraryResource> r0 = org.lwjgl.system.LibraryResource.class
            r1 = r4
            r2 = r5
            java.nio.file.Path r0 = load(r0, r1, r2)
            return r0
    }

    public static java.nio.file.Path load(java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = 1
            java.nio.file.Path r0 = load(r0, r1, r2, r3, r4)
            return r0
    }

    public static java.nio.file.Path load(java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 1
            java.nio.file.Path r0 = load(r0, r1, r2, r3, r4)
            return r0
    }

    private static java.nio.file.Path load(java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L2d
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] Loading library resource: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\tModule: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r7
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L2d:
            r0 = r8
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r11 = r0
            r0 = r11
            boolean r0 = r0.isAbsolute()
            if (r0 == 0) goto L78
            r0 = r11
            r1 = 0
            java.nio.file.LinkOption[] r1 = new java.nio.file.LinkOption[r1]
            boolean r0 = java.nio.file.Files.exists(r0, r1)
            if (r0 != 0) goto L70
            r0 = r10
            if (r0 == 0) goto L55
            printError()
        L55:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to locate library resource: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L70:
            java.lang.String r0 = "Success"
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = r11
            return r0
        L78:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            java.net.URL r0 = org.lwjgl.system.Library.findResource(r0, r1, r2, r3)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L96
            r0 = r7
            r1 = r8
            r2 = r9
            java.nio.file.Path r0 = loadFromLibraryPath(r0, r1, r2)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L18c
            r0 = r11
            return r0
        L96:
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_LOADER
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r13 = r0
            r0 = r12
            java.lang.String r0 = org.lwjgl.system.Library.getRegularFilePath(r0)     // Catch: java.lang.Exception -> L17d
            r14 = r0
            r0 = r14
            if (r0 == 0) goto Ld5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L17d
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L17d
            java.lang.String r1 = "Loaded from classpath: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L17d
            r1 = r14
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L17d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L17d
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L17d
            r0 = r14
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Exception -> L17d
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)     // Catch: java.lang.Exception -> L17d
            return r0
        Ld5:
            r0 = r13
            if (r0 == 0) goto Ldf
            java.lang.String r0 = "Using SharedLibraryLoader..."
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L17d
        Ldf:
            r0 = r8
            r1 = r8
            r2 = r12
            r3 = 0
            java.nio.channels.FileChannel r0 = org.lwjgl.system.SharedLibraryLoader.load(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L17d
            r15 = r0
            r0 = 0
            r16 = r0
            r0 = r7
            r1 = r8
            r2 = r9
            java.nio.file.Path r0 = loadFromLibraryPath(r0, r1, r2)     // Catch: java.lang.Throwable -> L149 java.lang.Throwable -> L152 java.lang.Exception -> L17d
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L123
            r0 = r11
            r17 = r0
            r0 = r15
            if (r0 == 0) goto L120
            r0 = r16
            if (r0 == 0) goto L11b
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> L10f java.lang.Exception -> L17d
            goto L120
        L10f:
            r18 = move-exception
            r0 = r16
            r1 = r18
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L17d
            goto L120
        L11b:
            r0 = r15
            r0.close()     // Catch: java.lang.Exception -> L17d
        L120:
            r0 = r17
            return r0
        L123:
            r0 = r15
            if (r0 == 0) goto L17a
            r0 = r16
            if (r0 == 0) goto L141
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> L135 java.lang.Exception -> L17d
            goto L17a
        L135:
            r17 = move-exception
            r0 = r16
            r1 = r17
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L17d
            goto L17a
        L141:
            r0 = r15
            r0.close()     // Catch: java.lang.Exception -> L17d
            goto L17a
        L149:
            r17 = move-exception
            r0 = r17
            r16 = r0
            r0 = r17
            throw r0     // Catch: java.lang.Throwable -> L152 java.lang.Exception -> L17d
        L152:
            r19 = move-exception
            r0 = r15
            if (r0 == 0) goto L177
            r0 = r16
            if (r0 == 0) goto L172
            r0 = r15
            r0.close()     // Catch: java.lang.Throwable -> L166 java.lang.Exception -> L17d
            goto L177
        L166:
            r20 = move-exception
            r0 = r16
            r1 = r20
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L17d
            goto L177
        L172:
            r0 = r15
            r0.close()     // Catch: java.lang.Exception -> L17d
        L177:
            r0 = r19
            throw r0     // Catch: java.lang.Exception -> L17d
        L17a:
            goto L18c
        L17d:
            r14 = move-exception
            r0 = r13
            if (r0 == 0) goto L18c
            r0 = r14
            java.io.PrintStream r1 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            r0.printStackTrace(r1)
        L18c:
            java.lang.String r0 = "java.library.path"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L1ac
            r0 = r7
            r1 = r8
            r2 = r9
            java.lang.String r3 = "java.library.path"
            r4 = r13
            java.nio.file.Path r0 = load(r0, r1, r2, r3, r4)
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L1ac
            r0 = r11
            return r0
        L1ac:
            r0 = r10
            if (r0 == 0) goto L1b4
            printError()
        L1b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to locate library resource: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @javax.annotation.Nullable
    private static java.nio.file.Path loadFromLibraryPath(java.lang.String r6, java.lang.String r7, boolean r8) {
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r9 = r0
            r0 = r9
            if (r0 != 0) goto L10
            r0 = 0
            return r0
        L10:
            r0 = r6
            r1 = r7
            r2 = r8
            org.lwjgl.system.Configuration<java.lang.String> r3 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.String r3 = r3.getProperty()
            r4 = r9
            java.nio.file.Path r0 = load(r0, r1, r2, r3, r4)
            return r0
    }

    @javax.annotation.Nullable
    private static java.nio.file.Path load(java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, java.lang.String r9) {
            r0 = r9
            r1 = r5
            r2 = r6
            r3 = r7
            java.nio.file.Path r0 = org.lwjgl.system.Library.findFile(r0, r1, r2, r3)
            r10 = r0
            r0 = r10
            if (r0 != 0) goto L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not found in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = 0
            return r0
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Loaded from "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = r10
            return r0
    }

    public static java.nio.file.Path load(java.lang.Class<?> r6, java.lang.String r7, org.lwjgl.system.Configuration<java.lang.String> r8, java.lang.String... r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = r9
            java.nio.file.Path r0 = load(r0, r1, r2, r3, r4)
            return r0
    }

    public static java.nio.file.Path load(java.lang.Class<?> r8, java.lang.String r9, org.lwjgl.system.Configuration<java.lang.String> r10, @javax.annotation.Nullable java.util.function.Supplier<java.nio.file.Path> r11, java.lang.String... r12) {
            r0 = r12
            int r0 = r0.length
            if (r0 != 0) goto L10
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "No default names specified."
            r1.<init>(r2)
            throw r0
        L10:
            r0 = r10
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L26
            r0 = r8
            r1 = r9
            r2 = r13
            java.nio.file.Path r0 = load(r0, r1, r2)
            return r0
        L26:
            r0 = r11
            if (r0 != 0) goto L3b
            r0 = r12
            int r0 = r0.length
            r1 = 1
            if (r0 > r1) goto L3b
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = 0
            r2 = r2[r3]
            java.nio.file.Path r0 = load(r0, r1, r2)
            return r0
        L3b:
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L47
            r3 = 0
            r4 = 0
            java.nio.file.Path r0 = load(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L47
            return r0
        L47:
            r14 = move-exception
            r0 = 1
            r15 = r0
        L4c:
            r0 = r15
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L7b
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r15
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L73
            r3 = 0
            r4 = r11
            if (r4 != 0) goto L6e
            r4 = r15
            r5 = r12
            int r5 = r5.length     // Catch: java.lang.Throwable -> L73
            r6 = 1
            int r5 = r5 - r6
            if (r4 != r5) goto L6e
            r4 = 1
            goto L6f
        L6e:
            r4 = 0
        L6f:
            java.nio.file.Path r0 = load(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L73
            return r0
        L73:
            r16 = move-exception
            int r15 = r15 + 1
            goto L4c
        L7b:
            r0 = r11
            if (r0 == 0) goto L89
            r0 = r11
            java.lang.Object r0 = r0.get()
            java.nio.file.Path r0 = (java.nio.file.Path) r0
            return r0
        L89:
            r0 = r14
            throw r0
    }

    private static void printError() {
            java.lang.String r0 = "[LWJGL] Failed to load a library resource. Possible solutions:\n\ta) Add the directory that contains the resource to -Djava.library.path or -Dorg.lwjgl.librarypath.\n\tb) Add the JAR that contains the resource to the classpath."
            org.lwjgl.system.Library.printError(r0)
            return
    }

    static {
            org.lwjgl.system.Library.initialize()
            return
    }
}
