package org.lwjgl.system;

/* JADX WARN: Classes with same name are omitted, all sources:
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Platform.class
  DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Platform.class
 */
/* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Platform.class */
public enum Platform extends java.lang.Enum<org.lwjgl.system.Platform> {
    public static final org.lwjgl.system.Platform LINUX = null;
    public static final org.lwjgl.system.Platform MACOSX = null;
    public static final org.lwjgl.system.Platform WINDOWS = null;
    private static final org.lwjgl.system.Platform current = null;
    private static final java.util.function.Function<java.lang.String, java.lang.String> bundledLibraryNameMapper = null;
    private static final java.util.function.Function<java.lang.String, java.lang.String> bundledLibraryPathMapper = null;
    private final java.lang.String name;
    private final java.lang.String nativePath;
    private static final /* synthetic */ org.lwjgl.system.Platform[] $VALUES = null;




    /* JADX INFO: renamed from: org.lwjgl.system.Platform$4, reason: invalid class name */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Platform$4.class */
    enum AnonymousClass4 extends org.lwjgl.system.Platform {
        AnonymousClass4(java.lang.String r8, int r9, java.lang.String r10, java.lang.String r11) {
                r7 = this;
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r11
                r5 = 0
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @Override // org.lwjgl.system.Platform
        java.lang.String mapLibraryName(java.lang.String r4) {
                r3 = this;
                r0 = r4
                java.lang.String r1 = ".dll"
                boolean r0 = r0.endsWith(r1)
                if (r0 == 0) goto Lb
                r0 = r4
                return r0
            Lb:
                r0 = r4
                java.lang.String r0 = java.lang.System.mapLibraryName(r0)
                return r0
        }
    }

    /* JADX WARN: Classes with same name are omitted, all sources:
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Platform$Architecture.class
      DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.4.1/lwjgl-glfw-classes.jar:org/lwjgl/system/Platform$Architecture.class
     */
    /* JADX INFO: loaded from: DroidBridge.Launcher-v0.3.9.apk:assets/components/lwjgl3.3.3/lwjgl-glfw-classes.jar:org/lwjgl/system/Platform$Architecture.class */
    public enum Architecture extends java.lang.Enum<org.lwjgl.system.Platform.Architecture> {
        public static final org.lwjgl.system.Platform.Architecture X64 = null;
        public static final org.lwjgl.system.Platform.Architecture X86 = null;
        public static final org.lwjgl.system.Platform.Architecture ARM64 = null;
        public static final org.lwjgl.system.Platform.Architecture ARM32 = null;
        static final org.lwjgl.system.Platform.Architecture current = null;
        final boolean is64Bit;
        private static final /* synthetic */ org.lwjgl.system.Platform.Architecture[] $VALUES = null;

        public static org.lwjgl.system.Platform.Architecture[] values() {
                org.lwjgl.system.Platform$Architecture[] r0 = org.lwjgl.system.Platform.Architecture.$VALUES
                java.lang.Object r0 = r0.clone()
                org.lwjgl.system.Platform$Architecture[] r0 = (org.lwjgl.system.Platform.Architecture[]) r0
                return r0
        }

        public static org.lwjgl.system.Platform.Architecture valueOf(java.lang.String r3) {
                java.lang.Class<org.lwjgl.system.Platform$Architecture> r0 = org.lwjgl.system.Platform.Architecture.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                org.lwjgl.system.Platform$Architecture r0 = (org.lwjgl.system.Platform.Architecture) r0
                return r0
        }

        Architecture(java.lang.String r5, int r6, boolean r7) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                r0 = r4
                r1 = r7
                r0.is64Bit = r1
                return
        }

        static {
                org.lwjgl.system.Platform$Architecture r0 = new org.lwjgl.system.Platform$Architecture
                r1 = r0
                java.lang.String r2 = "X64"
                r3 = 0
                r4 = 1
                r1.<init>(r2, r3, r4)
                org.lwjgl.system.Platform.Architecture.X64 = r0
                org.lwjgl.system.Platform$Architecture r0 = new org.lwjgl.system.Platform$Architecture
                r1 = r0
                java.lang.String r2 = "X86"
                r3 = 1
                r4 = 0
                r1.<init>(r2, r3, r4)
                org.lwjgl.system.Platform.Architecture.X86 = r0
                org.lwjgl.system.Platform$Architecture r0 = new org.lwjgl.system.Platform$Architecture
                r1 = r0
                java.lang.String r2 = "ARM64"
                r3 = 2
                r4 = 1
                r1.<init>(r2, r3, r4)
                org.lwjgl.system.Platform.Architecture.ARM64 = r0
                org.lwjgl.system.Platform$Architecture r0 = new org.lwjgl.system.Platform$Architecture
                r1 = r0
                java.lang.String r2 = "ARM32"
                r3 = 3
                r4 = 0
                r1.<init>(r2, r3, r4)
                org.lwjgl.system.Platform.Architecture.ARM32 = r0
                r0 = 4
                org.lwjgl.system.Platform$Architecture[] r0 = new org.lwjgl.system.Platform.Architecture[r0]
                r1 = r0
                r2 = 0
                org.lwjgl.system.Platform$Architecture r3 = org.lwjgl.system.Platform.Architecture.X64
                r1[r2] = r3
                r1 = r0
                r2 = 1
                org.lwjgl.system.Platform$Architecture r3 = org.lwjgl.system.Platform.Architecture.X86
                r1[r2] = r3
                r1 = r0
                r2 = 2
                org.lwjgl.system.Platform$Architecture r3 = org.lwjgl.system.Platform.Architecture.ARM64
                r1[r2] = r3
                r1 = r0
                r2 = 3
                org.lwjgl.system.Platform$Architecture r3 = org.lwjgl.system.Platform.Architecture.ARM32
                r1[r2] = r3
                org.lwjgl.system.Platform.Architecture.$VALUES = r0
                java.lang.String r0 = "os.arch"
                java.lang.String r0 = java.lang.System.getProperty(r0)
                r6 = r0
                r0 = r6
                java.lang.String r1 = "64"
                boolean r0 = r0.contains(r1)
                if (r0 != 0) goto L6f
                r0 = r6
                java.lang.String r1 = "armv8"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L73
            L6f:
                r0 = 1
                goto L74
            L73:
                r0 = 0
            L74:
                r7 = r0
                r0 = r6
                java.lang.String r1 = "arm"
                boolean r0 = r0.startsWith(r1)
                if (r0 != 0) goto L87
                r0 = r6
                java.lang.String r1 = "aarch64"
                boolean r0 = r0.startsWith(r1)
                if (r0 == 0) goto L97
            L87:
                r0 = r7
                if (r0 == 0) goto L91
                org.lwjgl.system.Platform$Architecture r0 = org.lwjgl.system.Platform.Architecture.ARM64
                goto La4
            L91:
                org.lwjgl.system.Platform$Architecture r0 = org.lwjgl.system.Platform.Architecture.ARM32
                goto La4
            L97:
                r0 = r7
                if (r0 == 0) goto La1
                org.lwjgl.system.Platform$Architecture r0 = org.lwjgl.system.Platform.Architecture.X64
                goto La4
            La1:
                org.lwjgl.system.Platform$Architecture r0 = org.lwjgl.system.Platform.Architecture.X86
            La4:
                org.lwjgl.system.Platform.Architecture.current = r0
                return
        }
    }

    public static org.lwjgl.system.Platform[] values() {
            org.lwjgl.system.Platform[] r0 = org.lwjgl.system.Platform.$VALUES
            java.lang.Object r0 = r0.clone()
            org.lwjgl.system.Platform[] r0 = (org.lwjgl.system.Platform[]) r0
            return r0
    }

    public static org.lwjgl.system.Platform valueOf(java.lang.String r3) {
            java.lang.Class<org.lwjgl.system.Platform> r0 = org.lwjgl.system.Platform.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            org.lwjgl.system.Platform r0 = (org.lwjgl.system.Platform) r0
            return r0
    }

    Platform(java.lang.String r5, int r6, java.lang.String r7, java.lang.String r8) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            r0 = r4
            r1 = r7
            r0.name = r1
            r0 = r4
            r1 = r8
            r0.nativePath = r1
            return
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    abstract java.lang.String mapLibraryName(java.lang.String r1);

    public static org.lwjgl.system.Platform get() {
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.current
            return r0
    }

    public static org.lwjgl.system.Platform.Architecture getArchitecture() {
            org.lwjgl.system.Platform$Architecture r0 = org.lwjgl.system.Platform.Architecture.current
            return r0
    }

    public static java.lang.String mapLibraryNameBundled(java.lang.String r3) {
            java.util.function.Function<java.lang.String, java.lang.String> r0 = org.lwjgl.system.Platform.bundledLibraryNameMapper
            r1 = r3
            java.lang.Object r0 = r0.apply(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    static java.lang.String mapLibraryPathBundled(java.lang.String r3) {
            java.util.function.Function<java.lang.String, java.lang.String> r0 = org.lwjgl.system.Platform.bundledLibraryPathMapper
            r1 = r3
            java.lang.Object r0 = r0.apply(r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    private static java.util.function.Function<java.lang.String, java.lang.String> getMapper(@javax.annotation.Nullable java.lang.Object r6, java.util.function.Function<java.lang.String, java.lang.String> r7, java.util.function.Function<java.lang.String, java.lang.String> r8) {
            r0 = r6
            if (r0 == 0) goto Ld
            java.lang.String r0 = "default"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
        Ld:
            r0 = r7
            return r0
        Lf:
            java.lang.String r0 = "legacy"
            r1 = r6
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1a
            r0 = r8
            return r0
        L1a:
            r0 = r6
            boolean r0 = r0 instanceof java.util.function.Function
            if (r0 == 0) goto L26
            r0 = r6
            java.util.function.Function r0 = (java.util.function.Function) r0
            return r0
        L26:
            r0 = r6
            java.lang.String r0 = r0.toString()
            r9 = r0
            r0 = r9
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L41
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Throwable -> L41
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> L41
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Throwable -> L41
            java.util.function.Function r0 = (java.util.function.Function) r0     // Catch: java.lang.Throwable -> L41
            return r0
        L41:
            r10 = move-exception
            boolean r0 = org.lwjgl.system.Checks.DEBUG
            if (r0 == 0) goto L51
            r0 = r10
            java.io.PrintStream r1 = org.lwjgl.system.APIUtil.DEBUG_STREAM
            r0.printStackTrace(r1)
        L51:
            java.lang.String r0 = "Warning: Failed to instantiate bundled library mapper: %s. Using the default."
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = r1
            r3 = 0
            r4 = r9
            r2[r3] = r4
            java.lang.String r0 = java.lang.String.format(r0, r1)
            org.lwjgl.system.APIUtil.apiLog(r0)
            r0 = r7
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$static$3(java.lang.String r4) {
            r0 = r4
            r1 = r4
            r2 = 47
            int r1 = r1.lastIndexOf(r2)
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$static$2(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            org.lwjgl.system.Platform r1 = org.lwjgl.system.Platform.current
            java.lang.String r1 = r1.nativePath
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            org.lwjgl.system.Platform$Architecture r1 = org.lwjgl.system.Platform.Architecture.current
            java.lang.String r1 = r1.name()
            java.lang.String r1 = r1.toLowerCase()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "/"
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$static$1(java.lang.String r3) {
            org.lwjgl.system.Platform$Architecture r0 = org.lwjgl.system.Platform.Architecture.current
            boolean r0 = r0.is64Bit
            if (r0 == 0) goto Ld
            r0 = r3
            goto L20
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r1 = r3
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "32"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L20:
            return r0
    }

    private static /* synthetic */ java.lang.String lambda$static$0(java.lang.String r2) {
            r0 = r2
            return r0
    }

    /* synthetic */ Platform(java.lang.String r7, int r8, java.lang.String r9, java.lang.String r10, org.lwjgl.system.Platform.AnonymousClass1 r11) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4)
            return
    }

    static {
            org.lwjgl.system.Platform$1 r0 = new org.lwjgl.system.Platform$1
            r1 = r0
            java.lang.String r2 = "LINUX"
            r3 = 0
            java.lang.String r4 = "Linux"
            java.lang.String r5 = "linux"
            r1.<init>(r2, r3, r4, r5)
            org.lwjgl.system.Platform.LINUX = r0
            org.lwjgl.system.Platform$2 r0 = new org.lwjgl.system.Platform$2
            r1 = r0
            java.lang.String r2 = "MACOSX"
            r3 = 1
            java.lang.String r4 = "macOS"
            java.lang.String r5 = "macos"
            r1.<init>(r2, r3, r4, r5)
            org.lwjgl.system.Platform.MACOSX = r0
            org.lwjgl.system.Platform$3 r0 = new org.lwjgl.system.Platform$3
            r1 = r0
            java.lang.String r2 = "WINDOWS"
            r3 = 2
            java.lang.String r4 = "Windows"
            java.lang.String r5 = "windows"
            r1.<init>(r2, r3, r4, r5)
            org.lwjgl.system.Platform.WINDOWS = r0
            r0 = 3
            org.lwjgl.system.Platform[] r0 = new org.lwjgl.system.Platform[r0]
            r1 = r0
            r2 = 0
            org.lwjgl.system.Platform r3 = org.lwjgl.system.Platform.LINUX
            r1[r2] = r3
            r1 = r0
            r2 = 1
            org.lwjgl.system.Platform r3 = org.lwjgl.system.Platform.MACOSX
            r1[r2] = r3
            r1 = r0
            r2 = 2
            org.lwjgl.system.Platform r3 = org.lwjgl.system.Platform.WINDOWS
            r1[r2] = r3
            org.lwjgl.system.Platform.$VALUES = r0
            java.lang.String r0 = "os.name"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            r7 = r0
            r0 = r7
            java.lang.String r1 = "Windows"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L64
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.WINDOWS
            org.lwjgl.system.Platform.current = r0
            goto Lc7
        L64:
            r0 = r7
            java.lang.String r1 = "Linux"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L88
            r0 = r7
            java.lang.String r1 = "FreeBSD"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L88
            r0 = r7
            java.lang.String r1 = "SunOS"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L88
            r0 = r7
            java.lang.String r1 = "Unix"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L91
        L88:
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.LINUX
            org.lwjgl.system.Platform.current = r0
            goto Lc7
        L91:
            r0 = r7
            java.lang.String r1 = "Mac OS X"
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto La3
            r0 = r7
            java.lang.String r1 = "Darwin"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto Lac
        La3:
            org.lwjgl.system.Platform r0 = org.lwjgl.system.Platform.MACOSX
            org.lwjgl.system.Platform.current = r0
            goto Lc7
        Lac:
            java.lang.LinkageError r0 = new java.lang.LinkageError
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            r3.<init>()
            java.lang.String r3 = "Unknown platform: "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lc7:
            org.lwjgl.system.Configuration<java.lang.Object> r0 = org.lwjgl.system.Configuration.BUNDLED_LIBRARY_NAME_MAPPER
            java.lang.String r1 = "default"
            java.lang.Object r0 = r0.get(r1)
            void r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$static$0(v0);
            }
            void r2 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$static$1(v0);
            }
            java.util.function.Function r0 = getMapper(r0, r1, r2)
            org.lwjgl.system.Platform.bundledLibraryNameMapper = r0
            org.lwjgl.system.Configuration<java.lang.Object> r0 = org.lwjgl.system.Configuration.BUNDLED_LIBRARY_PATH_MAPPER
            java.lang.String r1 = "default"
            java.lang.Object r0 = r0.get(r1)
            void r1 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$static$2(v0);
            }
            void r2 = (v0) -> { // java.util.function.Function.apply(java.lang.Object):java.lang.Object
                return lambda$static$3(v0);
            }
            java.util.function.Function r0 = getMapper(r0, r1, r2)
            org.lwjgl.system.Platform.bundledLibraryPathMapper = r0
            return
    }
}
