package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Library.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Library.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Library.class */
public final class Library {
    public static final java.lang.String JNI_LIBRARY_NAME = null;
    static final java.lang.String JAVA_LIBRARY_PATH = "java.library.path";
    private static final java.util.regex.Pattern PATH_SEPARATOR = null;
    private static final java.util.regex.Pattern NATIVES_JAR = null;

    /* JADX INFO: renamed from: org.lwjgl.system.Library$1, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Library$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$lwjgl$system$Platform = null;

        static {
                org.lwjgl.system.Platform[] r0 = org.lwjgl.system.Platform.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.lwjgl.system.Library.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform = r0
                int[] r0 = org.lwjgl.system.Library.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L17
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.WINDOWS     // Catch: java.lang.NoSuchFieldError -> L17
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L17
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L17
                goto L18
            L17:
                r4 = move-exception
            L18:
                int[] r0 = org.lwjgl.system.Library.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform     // Catch: java.lang.NoSuchFieldError -> L26
                org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.LINUX     // Catch: java.lang.NoSuchFieldError -> L26
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L26
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L26
                goto L27
            L26:
                r4 = move-exception
            L27:
                return
        }
    }

    private Library() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static void initialize() {
            return
    }

    public static void loadSystem(java.lang.String r6, java.lang.String r7) throws java.lang.UnsatisfiedLinkError {
            void r0 = java.lang.System::load
            void r1 = java.lang.System::loadLibrary
            java.lang.Class<org.lwjgl.system.Library> r2 = org.lwjgl.system.Library.class
            r3 = r6
            r4 = r7
            loadSystem(r0, r1, r2, r3, r4)
            return
    }

    public static void loadSystem(java.util.function.Consumer<java.lang.String> r8, java.util.function.Consumer<java.lang.String> r9, java.lang.Class<?> r10, java.lang.String r11, java.lang.String r12) throws java.lang.UnsatisfiedLinkError {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L2e
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] Loading JNI library: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r12
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\tModule: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r11
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L2e:
            r0 = r12
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            boolean r0 = r0.isAbsolute()
            if (r0 == 0) goto L4d
            r0 = r8
            r1 = r12
            r0.accept(r1)
            java.lang.String r0 = "Success"
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            return
        L4d:
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            r1 = r12
            java.lang.String r0 = r0.mapLibraryName(r1)
            r13 = r0
            r0 = r12
            java.lang.String r1 = "lwjgl"
            boolean r0 = r0.contains(r1)
            r14 = r0
            r0 = r10
            r1 = r11
            r2 = r13
            r3 = r14
            java.net.URL r0 = findResource(r0, r1, r2, r3)
            r15 = r0
            r0 = r15
            if (r0 != 0) goto L7e
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            boolean r0 = loadSystemFromLibraryPath(r0, r1, r2, r3, r4)
            if (r0 == 0) goto L182
            return
        L7e:
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_LOADER
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r16 = r0
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.SHARED_LIBRARY_EXTRACT_FORCE     // Catch: java.lang.Exception -> L173
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L173
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L173
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L173
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L173
            if (r0 != 0) goto Lcf
            r0 = r15
            java.lang.String r0 = getRegularFilePath(r0)     // Catch: java.lang.Exception -> L173
            r17 = r0
            r0 = r17
            if (r0 == 0) goto Lcf
            r0 = r8
            r1 = r17
            r0.accept(r1)     // Catch: java.lang.Exception -> L173
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L173
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L173
            java.lang.String r1 = "Loaded from classpath: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L173
            r1 = r17
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L173
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L173
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L173
            return
        Lcf:
            r0 = r16
            if (r0 == 0) goto Ld9
            java.lang.String r0 = "Using SharedLibraryLoader..."
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L173
        Ld9:
            r0 = r12
            r1 = r13
            r2 = r15
            r3 = r8
            java.nio.channels.FileChannel r0 = org.lwjgl.system.SharedLibraryLoader.load(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L173
            r17 = r0
            r0 = 0
            r18 = r0
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r13
            r4 = r14
            boolean r0 = loadSystemFromLibraryPath(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L13f java.lang.Throwable -> L148 java.lang.Exception -> L173
            if (r0 == 0) goto L119
            r0 = r17
            if (r0 == 0) goto L118
            r0 = r18
            if (r0 == 0) goto L113
            r0 = r17
            r0.close()     // Catch: java.lang.Throwable -> L107 java.lang.Exception -> L173
            goto L118
        L107:
            r19 = move-exception
            r0 = r18
            r1 = r19
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L173
            goto L118
        L113:
            r0 = r17
            r0.close()     // Catch: java.lang.Exception -> L173
        L118:
            return
        L119:
            r0 = r17
            if (r0 == 0) goto L170
            r0 = r18
            if (r0 == 0) goto L137
            r0 = r17
            r0.close()     // Catch: java.lang.Throwable -> L12b java.lang.Exception -> L173
            goto L170
        L12b:
            r19 = move-exception
            r0 = r18
            r1 = r19
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L173
            goto L170
        L137:
            r0 = r17
            r0.close()     // Catch: java.lang.Exception -> L173
            goto L170
        L13f:
            r19 = move-exception
            r0 = r19
            r18 = r0
            r0 = r19
            throw r0     // Catch: java.lang.Throwable -> L148 java.lang.Exception -> L173
        L148:
            r20 = move-exception
            r0 = r17
            if (r0 == 0) goto L16d
            r0 = r18
            if (r0 == 0) goto L168
            r0 = r17
            r0.close()     // Catch: java.lang.Throwable -> L15c java.lang.Exception -> L173
            goto L16d
        L15c:
            r21 = move-exception
            r0 = r18
            r1 = r21
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L173
            goto L16d
        L168:
            r0 = r17
            r0.close()     // Catch: java.lang.Exception -> L173
        L16d:
            r0 = r20
            throw r0     // Catch: java.lang.Exception -> L173
        L170:
            goto L182
        L173:
            r17 = move-exception
            r0 = r16
            if (r0 == 0) goto L182
            r0 = r17
            java.io.PrintStream r1 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            r0.printStackTrace(r1)
        L182:
            java.lang.String r0 = "java.library.path"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r16 = r0
            r0 = r14
            if (r0 == 0) goto L1a8
            r0 = r16
            if (r0 == 0) goto L1a8
            r0 = r8
            r1 = r10
            r2 = r11
            r3 = r11
            r4 = r13
            java.lang.String r3 = getBundledPath(r3, r4)
            r4 = 0
            java.lang.String r5 = "java.library.path"
            r6 = r16
            boolean r0 = loadSystem(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L1a8
            return
        L1a8:
            r0 = r9
            r1 = r12
            r0.accept(r1)     // Catch: java.lang.Throwable -> L1f7
            r0 = r16
            if (r0 != 0) goto L1b9
            r0 = 0
            goto L1c3
        L1b9:
            r0 = r16
            r1 = r11
            r2 = r13
            r3 = r14
            java.nio.file.Path r0 = findFile(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L1f7
        L1c3:
            r17 = r0
            r0 = r17
            if (r0 == 0) goto L1f1
            java.lang.String r0 = "Loaded from %s: %s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1f7
            r2 = r1
            r3 = 0
            java.lang.String r4 = "java.library.path"
            r2[r3] = r4     // Catch: java.lang.Throwable -> L1f7
            r2 = r1
            r3 = 1
            r4 = r17
            r2[r3] = r4     // Catch: java.lang.Throwable -> L1f7
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch: java.lang.Throwable -> L1f7
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Throwable -> L1f7
            r0 = r14
            if (r0 == 0) goto L1f6
            r0 = r10
            r1 = r17
            r2 = r11
            r3 = r13
            checkHash(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L1f7
            goto L1f6
        L1f1:
            java.lang.String r0 = "Loaded from a ClassLoader provided path."
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Throwable -> L1f7
        L1f6:
            return
        L1f7:
            r17 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r13
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not found in "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "java.library.path"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = r10
            r1 = r11
            detectPlatformMismatch(r0, r1)
            r0 = 1
            printError(r0)
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to locate library: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r13
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private static boolean loadSystemFromLibraryPath(java.util.function.Consumer<java.lang.String> r8, java.lang.Class<?> r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L28
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            org.lwjgl.system.Configuration<java.lang.String> r5 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.String r5 = r5.getProperty()
            r6 = r13
            boolean r0 = loadSystem(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L28
            r0 = 1
            goto L29
        L28:
            r0 = 0
        L29:
            return r0
    }

    private static boolean loadSystem(java.util.function.Consumer<java.lang.String> r5, java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8, boolean r9, java.lang.String r10, java.lang.String r11) {
            r0 = r11
            r1 = r7
            r2 = r8
            r3 = r9
            java.nio.file.Path r0 = findFile(r0, r1, r2, r3)
            r12 = r0
            r0 = r12
            if (r0 != 0) goto L37
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r8
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not found in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = 0
            return r0
        L37:
            r0 = r5
            r1 = r12
            java.nio.file.Path r1 = r1.toAbsolutePath()
            java.lang.String r1 = r1.toString()
            r0.accept(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Loaded from "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r12
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = r9
            if (r0 == 0) goto L77
            r0 = r6
            r1 = r12
            r2 = r7
            r3 = r8
            checkHash(r0, r1, r2, r3)
        L77:
            r0 = 1
            return r0
    }

    public static org.lwjgl.system.SharedLibrary loadNative(java.lang.String r4, java.lang.String r5) {
            java.lang.Class<org.lwjgl.system.Library> r0 = org.lwjgl.system.Library.class
            r1 = r4
            r2 = r5
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2)
            return r0
    }

    public static org.lwjgl.system.SharedLibrary loadNative(java.lang.Class<?> r5, java.lang.String r6, java.lang.String r7) {
            r0 = r5
            r1 = r6
            r2 = r7
            r3 = 0
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2, r3)
            return r0
    }

    public static org.lwjgl.system.SharedLibrary loadNative(java.lang.Class<?> r6, java.lang.String r7, java.lang.String r8, boolean r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = 1
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2, r3, r4)
            return r0
    }

    private static org.lwjgl.system.SharedLibrary loadNative(java.lang.Class<?> r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L2d
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] Loading library: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r9
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\tModule: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L2d:
            r0 = r9
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            boolean r0 = r0.isAbsolute()
            if (r0 == 0) goto L4b
            r0 = r9
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.APIUtil.apiCreateLibrary(r0)
            r12 = r0
            java.lang.String r0 = "Success"
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = r12
            return r0
        L4b:
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.get()
            r1 = r9
            java.lang.String r0 = r0.mapLibraryName(r1)
            r12 = r0
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r10
            java.net.URL r0 = findResource(r0, r1, r2, r3)
            r14 = r0
            r0 = r14
            if (r0 != 0) goto L75
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r10
            org.lwjgl.system.SharedLibrary r0 = loadNativeFromLibraryPath(r0, r1, r2, r3)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L181
            r0 = r13
            return r0
        L75:
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_LOADER
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r15 = r0
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.SHARED_LIBRARY_EXTRACT_FORCE     // Catch: java.lang.Exception -> L172
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Exception -> L172
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L172
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L172
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L172
            if (r0 != 0) goto Lc7
            r0 = r14
            java.lang.String r0 = getRegularFilePath(r0)     // Catch: java.lang.Exception -> L172
            r16 = r0
            r0 = r16
            if (r0 == 0) goto Lc7
            r0 = r16
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.APIUtil.apiCreateLibrary(r0)     // Catch: java.lang.Exception -> L172
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L172
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L172
            java.lang.String r1 = "Loaded from classpath: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L172
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L172
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L172
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L172
            r0 = r13
            return r0
        Lc7:
            r0 = r15
            if (r0 == 0) goto Ld1
            java.lang.String r0 = "Using SharedLibraryLoader..."
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L172
        Ld1:
            r0 = r9
            r1 = r12
            r2 = r14
            r3 = 0
            java.nio.channels.FileChannel r0 = org.lwjgl.system.SharedLibraryLoader.load(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L172
            r16 = r0
            r0 = 0
            r17 = r0
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r10
            org.lwjgl.system.SharedLibrary r0 = loadNativeFromLibraryPath(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L13e java.lang.Throwable -> L147 java.lang.Exception -> L172
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L118
            r0 = r13
            r18 = r0
            r0 = r16
            if (r0 == 0) goto L115
            r0 = r17
            if (r0 == 0) goto L110
            r0 = r16
            r0.close()     // Catch: java.lang.Throwable -> L104 java.lang.Exception -> L172
            goto L115
        L104:
            r19 = move-exception
            r0 = r17
            r1 = r19
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L172
            goto L115
        L110:
            r0 = r16
            r0.close()     // Catch: java.lang.Exception -> L172
        L115:
            r0 = r18
            return r0
        L118:
            r0 = r16
            if (r0 == 0) goto L16f
            r0 = r17
            if (r0 == 0) goto L136
            r0 = r16
            r0.close()     // Catch: java.lang.Throwable -> L12a java.lang.Exception -> L172
            goto L16f
        L12a:
            r18 = move-exception
            r0 = r17
            r1 = r18
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L172
            goto L16f
        L136:
            r0 = r16
            r0.close()     // Catch: java.lang.Exception -> L172
            goto L16f
        L13e:
            r18 = move-exception
            r0 = r18
            r17 = r0
            r0 = r18
            throw r0     // Catch: java.lang.Throwable -> L147 java.lang.Exception -> L172
        L147:
            r20 = move-exception
            r0 = r16
            if (r0 == 0) goto L16c
            r0 = r17
            if (r0 == 0) goto L167
            r0 = r16
            r0.close()     // Catch: java.lang.Throwable -> L15b java.lang.Exception -> L172
            goto L16c
        L15b:
            r21 = move-exception
            r0 = r17
            r1 = r21
            r0.addSuppressed(r1)     // Catch: java.lang.Exception -> L172
            goto L16c
        L167:
            r0 = r16
            r0.close()     // Catch: java.lang.Exception -> L172
        L16c:
            r0 = r20
            throw r0     // Catch: java.lang.Exception -> L172
        L16f:
            goto L181
        L172:
            r16 = move-exception
            r0 = r15
            if (r0 == 0) goto L181
            r0 = r16
            java.io.PrintStream r1 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            r0.printStackTrace(r1)
        L181:
            r0 = r10
            if (r0 != 0) goto L194
            r0 = r12
            org.lwjgl.system.SharedLibrary r0 = loadNativeFromSystem(r0)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L194
            r0 = r13
            return r0
        L194:
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.EMULATE_SYSTEM_LOADLIBRARY
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L200
            java.lang.Class<java.lang.ClassLoader> r0 = java.lang.ClassLoader.class
            java.lang.String r1 = "findLibrary"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1fe
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5     // Catch: java.lang.Exception -> L1fe
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L1fe
            r15 = r0
            r0 = r15
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.Exception -> L1fe
            r0 = r15
            r1 = r7
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L1fe
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1fe
            r3 = r2
            r4 = 0
            r5 = r9
            r3[r4] = r5     // Catch: java.lang.Exception -> L1fe
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L1fe
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L1fe
            r16 = r0
            r0 = r16
            if (r0 == 0) goto L1fb
            r0 = r16
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.APIUtil.apiCreateLibrary(r0)     // Catch: java.lang.Exception -> L1fe
            r13 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1fe
            r1 = r0
            r1.<init>()     // Catch: java.lang.Exception -> L1fe
            java.lang.String r1 = "Loaded from ClassLoader provided path: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L1fe
            r1 = r16
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Exception -> L1fe
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L1fe
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.Exception -> L1fe
            r0 = r13
            return r0
        L1fb:
            goto L200
        L1fe:
            r15 = move-exception
        L200:
            java.lang.String r0 = "java.library.path"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r15 = r0
            r0 = r15
            if (r0 == 0) goto L222
            r0 = r7
            r1 = r8
            r2 = r12
            r3 = r10
            java.lang.String r4 = "java.library.path"
            r5 = r15
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2, r3, r4, r5)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L222
            r0 = r13
            return r0
        L222:
            r0 = r10
            if (r0 == 0) goto L235
            r0 = r12
            org.lwjgl.system.SharedLibrary r0 = loadNativeFromSystem(r0)
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L235
            r0 = r13
            return r0
        L235:
            r0 = r11
            if (r0 == 0) goto L243
            r0 = r7
            r1 = r8
            detectPlatformMismatch(r0, r1)
            r0 = r10
            printError(r0)
        L243:
            java.lang.UnsatisfiedLinkError r0 = new java.lang.UnsatisfiedLinkError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Failed to locate library: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r12
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    @javax.annotation.Nullable
    private static org.lwjgl.system.SharedLibrary loadNativeFromSystem(java.lang.String r3) {
            r0 = r3
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.APIUtil.apiCreateLibrary(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L2e
            r4 = r0
            r0 = r4
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.UnsatisfiedLinkError -> L2e
            r5 = r0
            r0 = r5
            if (r0 != 0) goto L15
            java.lang.String r0 = "Loaded from system paths"
            goto L28
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.UnsatisfiedLinkError -> L2e
            r1 = r0
            r1.<init>()     // Catch: java.lang.UnsatisfiedLinkError -> L2e
            java.lang.String r1 = "Loaded from system paths: "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.UnsatisfiedLinkError -> L2e
            r1 = r5
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.UnsatisfiedLinkError -> L2e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.UnsatisfiedLinkError -> L2e
        L28:
            org.lwjgl.system.APIUtil.apiLogMore(r0)     // Catch: java.lang.UnsatisfiedLinkError -> L2e
            goto L47
        L2e:
            r5 = move-exception
            r0 = 0
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not found in system paths"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
        L47:
            r0 = r4
            return r0
    }

    @javax.annotation.Nullable
    private static org.lwjgl.system.SharedLibrary loadNativeFromLibraryPath(java.lang.Class<?> r7, java.lang.String r8, java.lang.String r9, boolean r10) {
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            org.lwjgl.system.Configuration<java.lang.String> r4 = org.lwjgl.system.Configuration.LIBRARY_PATH
            java.lang.String r4 = r4.getProperty()
            r5 = r11
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2, r3, r4, r5)
            return r0
    }

    @javax.annotation.Nullable
    private static org.lwjgl.system.SharedLibrary loadNative(java.lang.Class<?> r5, java.lang.String r6, java.lang.String r7, boolean r8, java.lang.String r9, java.lang.String r10) {
            r0 = r10
            r1 = r6
            r2 = r7
            r3 = r8
            java.nio.file.Path r0 = findFile(r0, r1, r2, r3)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L36
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r7
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " not found in "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "="
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = 0
            return r0
        L36:
            r0 = r11
            java.nio.file.Path r0 = r0.toAbsolutePath()
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.SharedLibrary r0 = org.lwjgl.system.APIUtil.apiCreateLibrary(r0)
            r12 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "Loaded from "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r9
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r11
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            org.lwjgl.system.APIUtil.apiLogMore(r0)
            r0 = r8
            if (r0 == 0) goto L74
            r0 = r5
            r1 = r11
            r2 = r6
            r3 = r7
            checkHash(r0, r1, r2, r3)
        L74:
            r0 = r12
            return r0
    }

    public static org.lwjgl.system.SharedLibrary loadNative(java.lang.Class<?> r6, java.lang.String r7, @javax.annotation.Nullable org.lwjgl.system.Configuration<java.lang.String> r8, java.lang.String... r9) {
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = 0
            r4 = r9
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2, r3, r4)
            return r0
    }

    public static org.lwjgl.system.SharedLibrary loadNative(java.lang.Class<?> r8, java.lang.String r9, @javax.annotation.Nullable org.lwjgl.system.Configuration<java.lang.String> r10, @javax.annotation.Nullable java.util.function.Supplier<org.lwjgl.system.SharedLibrary> r11, java.lang.String... r12) {
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
            if (r0 == 0) goto L2a
            r0 = r10
            java.lang.Object r0 = r0.get()
            java.lang.String r0 = (java.lang.String) r0
            r13 = r0
            r0 = r13
            if (r0 == 0) goto L2a
            r0 = r8
            r1 = r9
            r2 = r13
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2)
            return r0
        L2a:
            r0 = r11
            if (r0 != 0) goto L3f
            r0 = r12
            int r0 = r0.length
            r1 = 1
            if (r0 > r1) goto L3f
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = 0
            r2 = r2[r3]
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2)
            return r0
        L3f:
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = 0
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L4b
            r3 = 0
            r4 = 0
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L4b
            return r0
        L4b:
            r13 = move-exception
            r0 = 1
            r14 = r0
        L50:
            r0 = r14
            r1 = r12
            int r1 = r1.length
            if (r0 >= r1) goto L7f
            r0 = r8
            r1 = r9
            r2 = r12
            r3 = r14
            r2 = r2[r3]     // Catch: java.lang.Throwable -> L77
            r3 = 0
            r4 = r11
            if (r4 != 0) goto L72
            r4 = r14
            r5 = r12
            int r5 = r5.length     // Catch: java.lang.Throwable -> L77
            r6 = 1
            int r5 = r5 - r6
            if (r4 != r5) goto L72
            r4 = 1
            goto L73
        L72:
            r4 = 0
        L73:
            org.lwjgl.system.SharedLibrary r0 = loadNative(r0, r1, r2, r3, r4)     // Catch: java.lang.Throwable -> L77
            return r0
        L77:
            r15 = move-exception
            int r14 = r14 + 1
            goto L50
        L7f:
            r0 = r11
            if (r0 == 0) goto L8d
            r0 = r11
            java.lang.Object r0 = r0.get()
            org.lwjgl.system.SharedLibrary r0 = (org.lwjgl.system.SharedLibrary) r0
            return r0
        L8d:
            r0 = r13
            throw r0
    }

    public static org.lwjgl.system.SharedLibrary createFromHandle(java.lang.String r6, long r7) {
            int[] r0 = org.lwjgl.system.Library.AnonymousClass1.$SwitchMap$org$lwjgl$system$Platform
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.get()
            int r1 = r1.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L24;
                case 2: goto L2e;
                default: goto L38;
            }
        L24:
            org.lwjgl.system.windows.WindowsLibrary r0 = new org.lwjgl.system.windows.WindowsLibrary
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            return r0
        L2e:
            org.lwjgl.system.linux.LinuxLibrary r0 = new org.lwjgl.system.linux.LinuxLibrary
            r1 = r0
            r2 = r6
            r3 = r7
            r1.<init>(r2, r3)
            return r0
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            r1.<init>()
            throw r0
    }

    private static java.lang.String getBundledPath(java.lang.String r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r5
            r2 = 46
            r3 = 47
            java.lang.String r1 = r1.replace(r2, r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = org.lwjgl.system.Platform.mapLibraryPathBundled(r0)
            return r0
    }

    @javax.annotation.Nullable
    static java.net.URL findResource(java.lang.Class<?> r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r0 = 0
            r7 = r0
            r0 = r6
            if (r0 == 0) goto L22
            r0 = r4
            r1 = r5
            java.lang.String r0 = getBundledPath(r0, r1)
            r8 = r0
            r0 = r8
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L22
            r0 = r3
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = r8
            java.net.URL r0 = r0.getResource(r1)
            r7 = r0
        L22:
            r0 = r7
            if (r0 != 0) goto L32
            r0 = r3
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = r5
            java.net.URL r0 = r0.getResource(r1)
            goto L34
        L32:
            r0 = r7
        L34:
            return r0
    }

    @javax.annotation.Nullable
    static java.lang.String getRegularFilePath(java.net.URL r3) {
            r0 = r3
            java.lang.String r0 = r0.getProtocol()
            java.lang.String r1 = "file"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2f
            r0 = r3
            java.net.URI r0 = r0.toURI()     // Catch: java.net.URISyntaxException -> L2e
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0)     // Catch: java.net.URISyntaxException -> L2e
            r4 = r0
            r0 = r4
            boolean r0 = r0.isAbsolute()     // Catch: java.net.URISyntaxException -> L2e
            if (r0 == 0) goto L2b
            r0 = r4
            boolean r0 = java.nio.file.Files.isReadable(r0)     // Catch: java.net.URISyntaxException -> L2e
            if (r0 == 0) goto L2b
            r0 = r4
            java.lang.String r0 = r0.toString()     // Catch: java.net.URISyntaxException -> L2e
            return r0
        L2b:
            goto L2f
        L2e:
            r4 = move-exception
        L2f:
            r0 = 0
            return r0
    }

    @javax.annotation.Nullable
    static java.nio.file.Path findFile(java.lang.String r3, java.lang.String r4, java.lang.String r5, boolean r6) {
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r4
            r1 = r5
            java.lang.String r0 = getBundledPath(r0, r1)
            r7 = r0
            r0 = r7
            r1 = r5
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L24
            r0 = r3
            r1 = r7
            java.nio.file.Path r0 = findFile(r0, r1)
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L24
            r0 = r8
            return r0
        L24:
            r0 = r3
            r1 = r5
            java.nio.file.Path r0 = findFile(r0, r1)
            return r0
    }

    @javax.annotation.Nullable
    private static java.nio.file.Path findFile(java.lang.String r6, java.lang.String r7) {
            java.util.regex.Pattern r0 = org.lwjgl.system.Library.PATH_SEPARATOR
            r1 = r6
            java.lang.String[] r0 = r0.split(r1)
            r8 = r0
            r0 = r8
            int r0 = r0.length
            r9 = r0
            r0 = 0
            r10 = r0
        Le:
            r0 = r10
            r1 = r9
            if (r0 >= r1) goto L3a
            r0 = r8
            r1 = r10
            r0 = r0[r1]
            r11 = r0
            r0 = r11
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            r2 = r1
            r3 = 0
            r4 = r7
            r2[r3] = r4
            java.nio.file.Path r0 = java.nio.file.Paths.get(r0, r1)
            r12 = r0
            r0 = r12
            boolean r0 = java.nio.file.Files.isReadable(r0)
            if (r0 == 0) goto L34
            r0 = r12
            return r0
        L34:
            int r10 = r10 + 1
            goto Le
        L3a:
            r0 = 0
            return r0
    }

    private static void detectPlatformMismatch(java.lang.Class<?> r5, java.lang.String r6) {
            r0 = r6
            java.lang.String r1 = "org.lwjgl"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto La
            return
        La:
            r0 = r6
            java.lang.String r1 = "org.lwjgl"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            java.lang.String r0 = "lwjgl"
            goto L33
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "lwjgl-"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r6
            java.lang.String r2 = "org.lwjgl."
            int r2 = r2.length()
            java.lang.String r1 = r1.substring(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L33:
            r7 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r2 = 8
            r1.<init>(r2)
            r8 = r0
            r0 = r5
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.io.IOException -> Lf9
            java.lang.String r1 = "META-INF/MANIFEST.MF"
            java.util.Enumeration r0 = r0.getResources(r1)     // Catch: java.io.IOException -> Lf9
            r9 = r0
        L49:
            r0 = r9
            boolean r0 = r0.hasMoreElements()     // Catch: java.io.IOException -> Lf9
            if (r0 == 0) goto Lf6
            r0 = r9
            java.lang.Object r0 = r0.nextElement()     // Catch: java.io.IOException -> Lf9
            java.net.URL r0 = (java.net.URL) r0     // Catch: java.io.IOException -> Lf9
            java.io.InputStream r0 = r0.openStream()     // Catch: java.io.IOException -> Lf9
            r10 = r0
            r0 = 0
            r11 = r0
            java.util.jar.Manifest r0 = new java.util.jar.Manifest     // Catch: java.lang.Throwable -> Lc2 java.lang.Throwable -> Lcb java.io.IOException -> Lf9
            r1 = r0
            r2 = r10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> Lc2 java.lang.Throwable -> Lcb java.io.IOException -> Lf9
            r12 = r0
            r0 = r12
            java.util.jar.Attributes r0 = r0.getMainAttributes()     // Catch: java.lang.Throwable -> Lc2 java.lang.Throwable -> Lcb java.io.IOException -> Lf9
            r13 = r0
            r0 = r7
            r1 = r13
            java.lang.String r2 = "Implementation-Title"
            java.lang.String r1 = r1.getValue(r2)     // Catch: java.lang.Throwable -> Lc2 java.lang.Throwable -> Lcb java.io.IOException -> Lf9
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lc2 java.lang.Throwable -> Lcb java.io.IOException -> Lf9
            if (r0 == 0) goto L9c
            r0 = r13
            java.lang.String r1 = "LWJGL-Platform"
            java.lang.String r0 = r0.getValue(r1)     // Catch: java.lang.Throwable -> Lc2 java.lang.Throwable -> Lcb java.io.IOException -> Lf9
            r14 = r0
            r0 = r14
            if (r0 == 0) goto L9c
            r0 = r8
            r1 = r14
            boolean r0 = r0.add(r1)     // Catch: java.lang.Throwable -> Lc2 java.lang.Throwable -> Lcb java.io.IOException -> Lf9
        L9c:
            r0 = r10
            if (r0 == 0) goto Lf3
            r0 = r11
            if (r0 == 0) goto Lba
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> Lae java.io.IOException -> Lf9
            goto Lf3
        Lae:
            r12 = move-exception
            r0 = r11
            r1 = r12
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> Lf9
            goto Lf3
        Lba:
            r0 = r10
            r0.close()     // Catch: java.io.IOException -> Lf9
            goto Lf3
        Lc2:
            r12 = move-exception
            r0 = r12
            r11 = r0
            r0 = r12
            throw r0     // Catch: java.lang.Throwable -> Lcb java.io.IOException -> Lf9
        Lcb:
            r15 = move-exception
            r0 = r10
            if (r0 == 0) goto Lf0
            r0 = r11
            if (r0 == 0) goto Leb
            r0 = r10
            r0.close()     // Catch: java.lang.Throwable -> Ldf java.io.IOException -> Lf9
            goto Lf0
        Ldf:
            r16 = move-exception
            r0 = r11
            r1 = r16
            r0.addSuppressed(r1)     // Catch: java.io.IOException -> Lf9
            goto Lf0
        Leb:
            r0 = r10
            r0.close()     // Catch: java.io.IOException -> Lf9
        Lf0:
            r0 = r15
            throw r0     // Catch: java.io.IOException -> Lf9
        Lf3:
            goto L49
        Lf6:
            goto Lfb
        Lf9:
            r9 = move-exception
        Lfb:
            r0 = r8
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L198
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] Platform/architecture mismatch detected for module: "
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r6
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\tJVM platform:\t\t"
            java.lang.StringBuilder r1 = r1.append(r2)
            org.lwjgl.system.Platform r2 = org.lwjgl.system.Platform.get()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "os.arch"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\t\t"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.vm.name"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " v"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " by "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.vm.vendor"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\tPlatform"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8
            int r2 = r2.size()
            r3 = 1
            if (r2 != r3) goto L17a
            java.lang.String r2 = ""
            goto L17c
        L17a:
            java.lang.String r2 = "s"
        L17c:
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " available on classpath:\n\t\t"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\t\t"
            r3 = r8
            java.lang.String r2 = java.lang.String.join(r2, r3)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        L198:
            return
    }

    private static void printError(boolean r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            java.lang.String r1 = "[LWJGL] Failed to load a library. Possible solutions:\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            if (r1 == 0) goto L15
            java.lang.String r1 = "\ta) Add the directory that contains the shared library to -Djava.library.path or -Dorg.lwjgl.librarypath.\n\tb) Add the JAR that contains the shared library to the classpath."
            goto L17
        L15:
            java.lang.String r1 = "\ta) Install the library or the driver that provides the library.\n\tb) Ensure that the library is accessible from the system library paths."
        L17:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            printError(r0)
            return
    }

    static void printError(java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r4
            r1.<init>(r2)
            r5 = r0
            r0 = r5
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 != 0) goto L37
            r0 = r5
            java.lang.String r1 = "[LWJGL] Enable debug mode with -Dorg.lwjgl.util.Debug=true for better diagnostics.\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            org.lwjgl.system.Configuration<java.lang.Boolean> r0 = org.lwjgl.system.Configuration.DEBUG_LOADER
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L37
            r0 = r5
            java.lang.String r1 = "[LWJGL] Enable the SharedLibraryLoader debug mode with -Dorg.lwjgl.util.DebugLoader=true for better diagnostics.\n"
            java.lang.StringBuilder r0 = r0.append(r1)
        L37:
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            r1 = r5
            r0.print(r1)
            return
    }

    private static void checkHash(java.lang.Class<?> r5, java.nio.file.Path r6, java.lang.String r7, java.lang.String r8) {
            boolean r0 = org.lwjgl.system.Checks.CHECKS
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r5
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La2
            r2 = r1
            r2.<init>()     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = "META-INF/"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La2
            r2 = r7
            r3 = r8
            java.lang.String r2 = getBundledPath(r2, r3)     // Catch: java.lang.Throwable -> La2
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r2 = ".sha1"
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La2
            java.util.Enumeration r0 = r0.getResources(r1)     // Catch: java.lang.Throwable -> La2
            r11 = r0
        L32:
            r0 = r11
            boolean r0 = r0.hasMoreElements()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L67
            r0 = r11
            java.lang.Object r0 = r0.nextElement()     // Catch: java.lang.Throwable -> La2
            java.net.URL r0 = (java.net.URL) r0     // Catch: java.lang.Throwable -> La2
            r12 = r0
            java.util.regex.Pattern r0 = org.lwjgl.system.Library.NATIVES_JAR     // Catch: java.lang.Throwable -> La2
            r1 = r12
            java.lang.String r1 = r1.toExternalForm()     // Catch: java.lang.Throwable -> La2
            java.util.regex.Matcher r0 = r0.matcher(r1)     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.find()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L60
            r0 = r12
            r10 = r0
            goto L64
        L60:
            r0 = r12
            r9 = r0
        L64:
            goto L32
        L67:
            r0 = r9
            if (r0 != 0) goto L6d
            return
        L6d:
            r0 = r9
            byte[] r0 = getSHA1(r0)     // Catch: java.lang.Throwable -> La2
            r12 = r0
            boolean r0 = org.lwjgl.system.Checks.DEBUG     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L7f
            r0 = r10
            if (r0 != 0) goto L86
        L7f:
            r0 = r6
            byte[] r0 = getSHA1(r0)     // Catch: java.lang.Throwable -> La2
            goto L8b
        L86:
            r0 = r10
            byte[] r0 = getSHA1(r0)     // Catch: java.lang.Throwable -> La2
        L8b:
            r13 = r0
            r0 = r12
            r1 = r13
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L9f
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM     // Catch: java.lang.Throwable -> La2
            java.lang.String r1 = "[LWJGL] [ERROR] Incompatible Java and native library versions detected.\nPossible reasons:\n\ta) -Djava.library.path is set to a folder containing shared libraries of an older LWJGL version.\n\tb) The classpath contains jar files of an older LWJGL version.\nPossible solutions:\n\ta) Make sure to not set -Djava.library.path (it is not needed for developing with LWJGL 3) or make\n\t   sure the folder it points to contains the shared libraries of the correct LWJGL version.\n\tb) Check the classpath and make sure to only have jar files of the same LWJGL version in it."
            r0.println(r1)     // Catch: java.lang.Throwable -> La2
        L9f:
            goto Lb4
        La2:
            r9 = move-exception
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto Lb4
            java.lang.String r0 = "Failed to verify native library."
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = r9
            r0.printStackTrace()
        Lb4:
            return
    }

    private static byte[] getSHA1(java.net.URL r6) throws java.io.IOException {
            r0 = 20
            byte[] r0 = new byte[r0]
            r7 = r0
            r0 = r6
            java.io.InputStream r0 = r0.openStream()
            r8 = r0
            r0 = 0
            r9 = r0
            r0 = 0
            r10 = r0
        Lf:
            r0 = r10
            r1 = 20
            if (r0 >= r1) goto L36
            r0 = r7
            r1 = r10
            r2 = r8
            int r2 = r2.read()     // Catch: java.lang.Throwable -> L57 java.lang.Throwable -> L5f
            r3 = 16
            int r2 = java.lang.Character.digit(r2, r3)     // Catch: java.lang.Throwable -> L57 java.lang.Throwable -> L5f
            r3 = 4
            int r2 = r2 << r3
            r3 = r8
            int r3 = r3.read()     // Catch: java.lang.Throwable -> L57 java.lang.Throwable -> L5f
            r4 = 16
            int r3 = java.lang.Character.digit(r3, r4)     // Catch: java.lang.Throwable -> L57 java.lang.Throwable -> L5f
            r2 = r2 | r3
            byte r2 = (byte) r2     // Catch: java.lang.Throwable -> L57 java.lang.Throwable -> L5f
            r0[r1] = r2     // Catch: java.lang.Throwable -> L57 java.lang.Throwable -> L5f
            int r10 = r10 + 1
            goto Lf
        L36:
            r0 = r8
            if (r0 == 0) goto L82
            r0 = r9
            if (r0 == 0) goto L50
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L45
            goto L82
        L45:
            r10 = move-exception
            r0 = r9
            r1 = r10
            r0.addSuppressed(r1)
            goto L82
        L50:
            r0 = r8
            r0.close()
            goto L82
        L57:
            r10 = move-exception
            r0 = r10
            r9 = r0
            r0 = r10
            throw r0     // Catch: java.lang.Throwable -> L5f
        L5f:
            r11 = move-exception
            r0 = r8
            if (r0 == 0) goto L7f
            r0 = r9
            if (r0 == 0) goto L7b
            r0 = r8
            r0.close()     // Catch: java.lang.Throwable -> L70
            goto L7f
        L70:
            r12 = move-exception
            r0 = r9
            r1 = r12
            r0.addSuppressed(r1)
            goto L7f
        L7b:
            r0 = r8
            r0.close()
        L7f:
            r0 = r11
            throw r0
        L82:
            r0 = r7
            return r0
    }

    private static byte[] getSHA1(java.nio.file.Path r5) throws java.security.NoSuchAlgorithmException, java.io.IOException {
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            r6 = r0
            r0 = r5
            r1 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r1]
            java.io.InputStream r0 = java.nio.file.Files.newInputStream(r0, r1)
            r7 = r0
            r0 = 0
            r8 = r0
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L5a
            r9 = r0
        L18:
            r0 = r7
            r1 = r9
            int r0 = r0.read(r1)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L5a
            r1 = r0
            r10 = r1
            r1 = -1
            if (r0 == r1) goto L31
            r0 = r6
            r1 = r9
            r2 = 0
            r3 = r10
            r0.update(r1, r2, r3)     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L5a
            goto L18
        L31:
            r0 = r7
            if (r0 == 0) goto L7d
            r0 = r8
            if (r0 == 0) goto L4b
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L40
            goto L7d
        L40:
            r9 = move-exception
            r0 = r8
            r1 = r9
            r0.addSuppressed(r1)
            goto L7d
        L4b:
            r0 = r7
            r0.close()
            goto L7d
        L52:
            r9 = move-exception
            r0 = r9
            r8 = r0
            r0 = r9
            throw r0     // Catch: java.lang.Throwable -> L5a
        L5a:
            r11 = move-exception
            r0 = r7
            if (r0 == 0) goto L7a
            r0 = r8
            if (r0 == 0) goto L76
            r0 = r7
            r0.close()     // Catch: java.lang.Throwable -> L6b
            goto L7a
        L6b:
            r12 = move-exception
            r0 = r8
            r1 = r12
            r0.addSuppressed(r1)
            goto L7a
        L76:
            r0 = r7
            r0.close()
        L7a:
            r0 = r11
            throw r0
        L7d:
            r0 = r6
            byte[] r0 = r0.digest()
            return r0
    }

    static {
            org.lwjgl.system.Configuration<java.lang.String> r0 = org.lwjgl.system.Configuration.LIBRARY_NAME
            java.lang.String r1 = "lwjgl"
            java.lang.String r1 = org.lwjgl.system.Platform.mapLibraryNameBundled(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            org.lwjgl.system.Library.JNI_LIBRARY_NAME = r0
            java.lang.String r0 = java.io.File.pathSeparator
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.lwjgl.system.Library.PATH_SEPARATOR = r0
            java.lang.String r0 = "/[\\w-]+?-natives-\\w+.jar!/"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            org.lwjgl.system.Library.NATIVES_JAR = r0
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto Lb1
            java.io.PrintStream r0 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = r1
            r2.<init>()
            java.lang.String r2 = "[LWJGL] Version: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = org.lwjgl.Version.getVersion()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\t OS: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "os.name"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " v"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "os.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\tJRE: "
            java.lang.StringBuilder r1 = r1.append(r2)
            org.lwjgl.system.Platform r2 = org.lwjgl.system.Platform.get()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "os.arch"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n\tJVM: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.vm.name"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " v"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.vm.version"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = " by "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "java.vm.vendor"
            java.lang.String r2 = java.lang.System.getProperty(r2)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "\n"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.print(r1)
        Lb1:
            java.lang.String r0 = "org.lwjgl"
            java.lang.String r1 = org.lwjgl.system.Library.JNI_LIBRARY_NAME
            loadSystem(r0, r1)
            return
    }
}
