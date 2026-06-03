package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class InstanceLaunchSettings {
    private static final java.lang.String PREFS = "per_instance_launch_settings";
    public static final int RAM_DEFAULT = -1;
    public static final java.lang.String RENDERER_DEFAULT = "";
    public static final java.lang.String RUNTIME_DEFAULT = "";
    private static final java.lang.String TAG = "InstanceLaunchSettings";

    public static final class Settings {
        public java.lang.String customJvmArgs;
        public int ramMb;
        public java.lang.String rendererIdentifier;
        public java.lang.String runtimeName;

        public Settings() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = ""
                r1.rendererIdentifier = r0
                r1.runtimeName = r0
                r1.customJvmArgs = r0
                r0 = -1
                r1.ramMb = r0
                return
        }

        public boolean hasAnyOverride() {
                r1 = this;
                boolean r0 = r1.hasRendererOverride()
                if (r0 != 0) goto L1b
                boolean r0 = r1.hasRuntimeOverride()
                if (r0 != 0) goto L1b
                boolean r0 = r1.hasRamOverride()
                if (r0 != 0) goto L1b
                boolean r0 = r1.hasCustomJvmArgs()
                if (r0 == 0) goto L19
                goto L1b
            L19:
                r0 = 0
                goto L1c
            L1b:
                r0 = 1
            L1c:
                return r0
        }

        public boolean hasCustomJvmArgs() {
                r1 = this;
                java.lang.String r0 = r1.customJvmArgs
                boolean r0 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.m486$$Nest$smisBlank(r0)
                r0 = r0 ^ 1
                return r0
        }

        public boolean hasRamOverride() {
                r1 = this;
                int r0 = r1.ramMb
                if (r0 <= 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean hasRendererOverride() {
                r1 = this;
                java.lang.String r0 = r1.rendererIdentifier
                boolean r0 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.m486$$Nest$smisBlank(r0)
                r0 = r0 ^ 1
                return r0
        }

        public boolean hasRuntimeOverride() {
                r1 = this;
                java.lang.String r0 = r1.runtimeName
                boolean r0 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.m486$$Nest$smisBlank(r0)
                r0 = r0 ^ 1
                return r0
        }
    }

    /* JADX INFO: renamed from: -$$Nest$smisBlank, reason: not valid java name */
    static /* bridge */ /* synthetic */ boolean m486$$Nest$smisBlank(java.lang.String r0) {
            boolean r0 = isBlank(r0)
            return r0
    }

    private InstanceLaunchSettings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static ca.dnamobile.javalauncher.launcher.LaunchPlan applyJvmOverrides(android.content.Context r6, ca.dnamobile.javalauncher.launcher.LaunchPlan r7, ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r8) {
            boolean r0 = r8.hasRamOverride()
            if (r0 != 0) goto Ld
            boolean r0 = r8.hasCustomJvmArgs()
            if (r0 != 0) goto Ld
            return r7
        Ld:
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = r7.getJvmArgs()
            r0.<init>(r1)
            boolean r1 = r8.hasRamOverride()
            java.lang.String r2 = "InstanceLaunchSettings"
            if (r1 == 0) goto L7e
            int r1 = r8.ramMb
            int r6 = ca.dnamobile.javalauncher.settings.MemoryAllocationUtils.clampToAllowedRam(r6, r1)
            int r1 = resolveStartHeapMb(r6)
            java.lang.String r3 = "-Xms"
            purgeArg(r0, r3)
            java.lang.String r4 = "-Xmx"
            purgeArg(r0, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r3)
            java.lang.StringBuilder r3 = r5.append(r1)
            java.lang.String r5 = "M"
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            insertBeforeClasspath(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            insertBeforeClasspath(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Applied per-instance RAM: Xms="
            r3.<init>(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " MB, Xmx="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = " MB"
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r6)
        L7e:
            boolean r6 = r8.hasCustomJvmArgs()
            if (r6 == 0) goto Lb6
            java.lang.String r6 = r8.customJvmArgs
            java.util.ArrayList r6 = tokenizeJvmArgs(r6)
            java.util.ArrayList r6 = sanitizeCustomJvmArgs(r6)
            java.util.Iterator r6 = r6.iterator()
        L92:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto La2
            java.lang.Object r1 = r6.next()
            java.lang.String r1 = (java.lang.String) r1
            insertBeforeClasspath(r0, r1)
            goto L92
        La2:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Applied per-instance JVM args: "
            r6.<init>(r1)
            java.lang.String r8 = r8.customJvmArgs
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r6)
        Lb6:
            ca.dnamobile.javalauncher.launcher.LaunchPlan r6 = r7.copyWithJvmArgs(r0)
            return r6
    }

    public static void clear(android.content.Context r3, java.lang.String r4) {
            java.lang.String r0 = prefix(r4)
            android.content.SharedPreferences r3 = prefs(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "renderer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.SharedPreferences$Editor r3 = r3.remove(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "runtime"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.SharedPreferences$Editor r3 = r3.remove(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "jvm_args"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.content.SharedPreferences$Editor r3 = r3.remove(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "ram_mb"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            android.content.SharedPreferences$Editor r3 = r3.remove(r0)
            r3.commit()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Cleared per-instance settings for "
            r3.<init>(r0)
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "InstanceLaunchSettings"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
    }

    public static java.lang.String describeRendererChoice(ca.dnamobile.javalauncher.renderer.RendererInterface r2) {
            if (r2 != 0) goto L5
            java.lang.String r2 = "Default launcher renderer"
            return r2
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.getRendererName()
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r2 = r2.isExternalPlugin()
            if (r2 == 0) goto L1b
            java.lang.String r2 = "  •  Plugin"
            goto L1d
        L1b:
            java.lang.String r2 = ""
        L1d:
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static int findClasspathIndex(java.util.List<java.lang.String> r3) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L2a
            java.lang.Object r1 = r3.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "-cp"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L29
            java.lang.String r2 = "-classpath"
            boolean r2 = r2.equals(r1)
            if (r2 != 0) goto L29
            java.lang.String r2 = "--class-path"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L26
            goto L29
        L26:
            int r0 = r0 + 1
            goto L1
        L29:
            return r0
        L2a:
            r3 = -1
            return r3
    }

    private static java.lang.String firstNonBlank(java.lang.String... r4) {
            if (r4 == 0) goto L16
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L16
            r2 = r4[r1]
            boolean r3 = isBlank(r2)
            if (r3 != 0) goto L13
            java.lang.String r4 = r2.trim()
            return r4
        L13:
            int r1 = r1 + 1
            goto L4
        L16:
            java.lang.String r4 = ""
            return r4
    }

    public static java.lang.String[] getRuntimeDisplayLabels() {
            java.lang.String[] r0 = getRuntimeNames()
            int r1 = r0.length
            int r1 = r1 + 1
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "Default for Minecraft version"
            r3 = 0
            r1[r3] = r2
        Le:
            int r2 = r0.length
            if (r3 >= r2) goto L37
            int r2 = r3 + 1
            r4 = r0[r3]
            boolean r4 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.isRuntimeInstalledForDisplay(r4)
            if (r4 == 0) goto L1e
            r3 = r0[r3]
            goto L33
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r3 = r0[r3]
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r4 = " (not installed)"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
        L33:
            r1[r2] = r3
            r3 = r2
            goto Le
        L37:
            return r1
    }

    public static java.lang.String[] getRuntimeNames() {
            r0 = 4
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "Internal-8"
            r0[r1] = r2
            r1 = 1
            java.lang.String r2 = "Internal-17"
            r0[r1] = r2
            r1 = 2
            java.lang.String r2 = "Internal-21"
            r0[r1] = r2
            r1 = 3
            java.lang.String r2 = "Internal-25"
            r0[r1] = r2
            return r0
    }

    private static void insertBeforeClasspath(java.util.ArrayList<java.lang.String> r1, java.lang.String r2) {
            boolean r0 = isBlank(r2)
            if (r0 == 0) goto L7
            return
        L7:
            int r0 = findClasspathIndex(r1)
            if (r0 >= 0) goto L11
            int r0 = r1.size()
        L11:
            r1.add(r0, r2)
            return
    }

    private static boolean isBlank(java.lang.String r0) {
            if (r0 == 0) goto Lf
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    static /* synthetic */ boolean lambda$purgeArg$0(java.lang.String r0, java.lang.String r1) {
            if (r1 == 0) goto La
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    public static ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings load(android.content.Context r4, java.lang.String r5) {
            android.content.SharedPreferences r4 = prefs(r4)
            java.lang.String r5 = prefix(r5)
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings$Settings r0 = new ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings$Settings
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r2 = "renderer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = ""
            java.lang.String r1 = r4.getString(r1, r2)
            r0.rendererIdentifier = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r3 = "runtime"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r4.getString(r1, r2)
            r0.runtimeName = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r5)
            java.lang.String r3 = "jvm_args"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r4.getString(r1, r2)
            r0.customJvmArgs = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r1 = "ram_mb"
            java.lang.StringBuilder r5 = r5.append(r1)
            java.lang.String r5 = r5.toString()
            r1 = -1
            int r4 = r4.getInt(r5, r1)
            r0.ramMb = r4
            java.lang.String r4 = r0.rendererIdentifier
            if (r4 != 0) goto L7a
            r0.rendererIdentifier = r2
        L7a:
            java.lang.String r4 = r0.runtimeName
            if (r4 != 0) goto L80
            r0.runtimeName = r2
        L80:
            java.lang.String r4 = r0.customJvmArgs
            if (r4 != 0) goto L86
            r0.customJvmArgs = r2
        L86:
            return r0
    }

    private static java.lang.String prefix(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "instance."
            r0.<init>(r1)
            java.lang.String r2 = sanitizeKey(r2)
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = "."
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static android.content.SharedPreferences prefs(android.content.Context r2) {
            android.content.Context r2 = r2.getApplicationContext()
            java.lang.String r0 = "per_instance_launch_settings"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }

    private static void purgeArg(java.util.ArrayList<java.lang.String> r1, java.lang.String r2) {
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings$$ExternalSyntheticLambda0 r0 = new ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.removeIf(r0)
            return
    }

    public static java.lang.String resolveInstanceKey(java.lang.String r2, java.lang.String r3) {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            java.lang.String r3 = "default"
            r0[r2] = r3
            java.lang.String r2 = firstNonBlank(r0)
            java.lang.String r2 = r2.trim()
            r3 = 10
            r0 = 32
            java.lang.String r2 = r2.replace(r3, r0)
            r3 = 13
            java.lang.String r2 = r2.replace(r3, r0)
            return r2
    }

    public static java.io.File resolveRuntimeDirectory(ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r4, java.io.File r5) {
            boolean r0 = r4.hasRuntimeOverride()
            if (r0 != 0) goto L7
            return r5
        L7:
            java.lang.String r0 = r4.runtimeName
            java.io.File r0 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.getRuntimeDirectory(r0)
            java.lang.String r1 = r4.runtimeName
            int r1 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.javaMajorForRuntimeName(r1)
            java.lang.String r2 = r4.runtimeName
            boolean r1 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.isRuntimeInstalledForJava(r2, r0, r1)
            java.lang.String r2 = "InstanceLaunchSettings"
            if (r1 == 0) goto L40
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Using per-instance Java runtime: "
            r5.<init>(r1)
            java.lang.String r4 = r4.runtimeName
            java.lang.StringBuilder r4 = r5.append(r4)
            java.lang.String r5 = " -> "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = r0.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r4)
            return r0
        L40:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Per-instance Java runtime is missing/broken, falling back to default: "
            r1.<init>(r3)
            java.lang.String r3 = r4.runtimeName
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " state="
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r4 = r4.runtimeName
            java.lang.String r4 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.describeRuntimeState(r4, r0)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r2, r4)
            return r5
    }

    private static int resolveStartHeapMb(int r2) {
            r0 = 512(0x200, float:7.17E-43)
            if (r2 > 0) goto L5
            return r0
        L5:
            int r2 = r2 / 4
            r1 = 768(0x300, float:1.076E-42)
            int r2 = java.lang.Math.max(r0, r2)
            int r2 = java.lang.Math.min(r1, r2)
            return r2
    }

    public static int runtimeIndexForName(java.lang.String r4) {
            boolean r0 = isBlank(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String[] r0 = getRuntimeNames()
            r2 = r1
        Ld:
            int r3 = r0.length
            if (r2 >= r3) goto L1e
            r3 = r0[r2]
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L1b
            int r2 = r2 + 1
            return r2
        L1b:
            int r2 = r2 + 1
            goto Ld
        L1e:
            return r1
    }

    public static java.lang.String runtimeNameForIndex(int r2) {
            java.lang.String[] r0 = getRuntimeNames()
            int r2 = r2 + (-1)
            if (r2 < 0) goto Lf
            int r1 = r0.length
            if (r2 < r1) goto Lc
            goto Lf
        Lc:
            r2 = r0[r2]
            return r2
        Lf:
            java.lang.String r2 = ""
            return r2
    }

    private static java.lang.String safe(java.lang.String r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            goto L9
        L5:
            java.lang.String r0 = r0.trim()
        L9:
            return r0
    }

    private static java.util.ArrayList<java.lang.String> sanitizeCustomJvmArgs(java.util.ArrayList<java.lang.String> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L65
            java.lang.Object r2 = r4.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = isBlank(r2)
            if (r3 == 0) goto L19
            goto L62
        L19:
            java.lang.String r3 = "-cp"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L60
            java.lang.String r3 = "-classpath"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L60
            java.lang.String r3 = "--class-path"
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L32
            goto L60
        L32:
            java.lang.String r3 = "-Xms"
            boolean r3 = r2.startsWith(r3)
            if (r3 != 0) goto L62
            java.lang.String r3 = "-Xmx"
            boolean r3 = r2.startsWith(r3)
            if (r3 == 0) goto L43
            goto L62
        L43:
            java.lang.String r3 = "java"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L62
            java.lang.String r3 = "/java"
            boolean r3 = r2.endsWith(r3)
            if (r3 != 0) goto L62
            java.lang.String r3 = "\\java.exe"
            boolean r3 = r2.endsWith(r3)
            if (r3 == 0) goto L5c
            goto L62
        L5c:
            r0.add(r2)
            goto L62
        L60:
            int r1 = r1 + 1
        L62:
            int r1 = r1 + 1
            goto L6
        L65:
            return r0
    }

    private static java.lang.String sanitizeKey(java.lang.String r2) {
            java.lang.String r2 = r2.trim()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            java.lang.String r2 = "default"
            return r2
        L13:
            java.lang.String r0 = "[^a-z0-9._-]"
            java.lang.String r1 = "_"
            java.lang.String r2 = r2.replaceAll(r0, r1)
            return r2
    }

    public static void save(android.content.Context r3, java.lang.String r4, ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r5) {
            java.lang.String r0 = prefix(r4)
            android.content.SharedPreferences r3 = prefs(r3)
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "renderer"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r5.rendererIdentifier
            java.lang.String r2 = safe(r2)
            r3.putString(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "runtime"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r5.runtimeName
            java.lang.String r2 = safe(r2)
            r3.putString(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = "jvm_args"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = r5.customJvmArgs
            java.lang.String r2 = safe(r2)
            r3.putString(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "ram_mb"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r1 = r5.ramMb
            r2 = -1
            if (r1 <= 0) goto L7b
            int r1 = r5.ramMb
            goto L7c
        L7b:
            r1 = r2
        L7c:
            r3.putInt(r0, r1)
            boolean r3 = r3.commit()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Saved per-instance settings for "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": renderer="
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = r5.rendererIdentifier
            java.lang.String r0 = safe(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = ", runtime="
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = r5.runtimeName
            java.lang.String r0 = safe(r0)
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = ", ram="
            java.lang.StringBuilder r4 = r4.append(r0)
            int r0 = r5.ramMb
            if (r0 <= 0) goto Lba
            int r2 = r5.ramMb
        Lba:
            java.lang.StringBuilder r4 = r4.append(r2)
            java.lang.String r0 = ", jvmArgs="
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r5 = r5.customJvmArgs
            boolean r5 = isBlank(r5)
            r5 = r5 ^ 1
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ", committed="
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "InstanceLaunchSettings"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r4, r3)
            return
    }

    public static java.util.ArrayList<java.lang.String> tokenizeJvmArgs(java.lang.String r9) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r9 == 0) goto L79
            java.lang.String r1 = r9.trim()
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L13
            goto L79
        L13:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        L1d:
            int r7 = r9.length()
            r8 = 92
            if (r3 >= r7) goto L67
            char r7 = r9.charAt(r3)
            if (r4 == 0) goto L30
            r1.append(r7)
            r4 = r2
            goto L64
        L30:
            if (r7 != r8) goto L34
            r4 = 1
            goto L64
        L34:
            r8 = 39
            if (r7 != r8) goto L3d
            if (r5 != 0) goto L3d
            r6 = r6 ^ 1
            goto L64
        L3d:
            r8 = 34
            if (r7 != r8) goto L46
            if (r6 != 0) goto L46
            r5 = r5 ^ 1
            goto L64
        L46:
            boolean r8 = java.lang.Character.isWhitespace(r7)
            if (r8 == 0) goto L61
            if (r6 != 0) goto L61
            if (r5 != 0) goto L61
            int r7 = r1.length()
            if (r7 <= 0) goto L64
            java.lang.String r7 = r1.toString()
            r0.add(r7)
            r1.setLength(r2)
            goto L64
        L61:
            r1.append(r7)
        L64:
            int r3 = r3 + 1
            goto L1d
        L67:
            if (r4 == 0) goto L6c
            r1.append(r8)
        L6c:
            int r9 = r1.length()
            if (r9 <= 0) goto L79
            java.lang.String r9 = r1.toString()
            r0.add(r9)
        L79:
            return r0
    }
}
