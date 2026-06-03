package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class LaunchGame {
    private static final java.util.concurrent.atomic.AtomicBoolean IS_LAUNCHING = null;
    private static final java.lang.String TAG = "LaunchGame";

    private static final class QuickPlaySupport {
        final java.lang.String reason;
        final boolean supported;

        private QuickPlaySupport(boolean r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.supported = r1
                r0.reason = r2
                return
        }

        static ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport supported(java.lang.String r2) {
                ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r0 = new ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport
                r1 = 1
                r0.<init>(r1, r2)
                return r0
        }

        static ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport unsupported(java.lang.String r2) {
                ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r0 = new ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport
                r1 = 0
                r0.<init>(r1, r2)
                return r0
        }
    }

    public interface StatusListener {
        void onStatus(java.lang.String r1);
    }

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            ca.dnamobile.javalauncher.launcher.LaunchGame.IS_LAUNCHING = r0
            return
    }

    private LaunchGame() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addModDirectory(java.util.ArrayList<java.io.File> r1, java.io.File r2) {
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto Lf
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto Lf
            r1.add(r2)
        Lf:
            return
    }

    private static void appendLaunchHeader(android.content.Context r2, java.lang.String r3, java.lang.String r4, ca.dnamobile.javalauncher.instance.LauncherInstance r5, ca.dnamobile.javalauncher.data.AccountStore.Account r6) {
            java.lang.String r0 = "--------- Start launching DroidBridge Launcher"
            safeAppendLog(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Info: Launcher: "
            r0.<init>(r1)
            java.lang.String r1 = getLauncherVersionLabel(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            safeAppendLog(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Info: Package: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getPackageName()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Info: Device: "
            r2.<init>(r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = " "
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = " / API "
            java.lang.StringBuilder r2 = r2.append(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r0 = " / "
            java.lang.StringBuilder r2 = r2.append(r0)
            int r0 = net.kdt.pojavlaunch.Architecture.getDeviceArchitecture()
            java.lang.String r0 = net.kdt.pojavlaunch.Architecture.androidAbiAsString(r0)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            boolean r2 = r3.equals(r4)
            java.lang.String r0 = "Info: Minecraft: "
            if (r2 == 0) goto L88
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            goto La2
        L88:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " / base "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
        La2:
            if (r5 == 0) goto Lba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Info: Instance: "
            r2.<init>(r3)
            java.lang.String r3 = r5.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
        Lba:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Info: Account: "
            r2.<init>(r3)
            java.lang.String r3 = getAccountLogLabel(r6)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            return
    }

    private static ca.dnamobile.javalauncher.launcher.LaunchPlan appendMethodInjectorAgentIfNeeded(android.content.Context r2, ca.dnamobile.javalauncher.launcher.LaunchPlan r3, int r4, java.io.File r5) {
            java.lang.String r0 = "MethodInjectorAgent: enabled Veil ImGui compatibility JVM args: "
            r1 = 17
            if (r4 >= r1) goto Lb
            ca.dnamobile.javalauncher.launcher.LaunchPlan r2 = stripMethodInjectorAgent(r3)
            return r2
        Lb:
            boolean r4 = hasVeilOrImguiMod(r5)
            if (r4 != 0) goto L16
            ca.dnamobile.javalauncher.launcher.LaunchPlan r2 = stripMethodInjectorAgent(r3)
            return r2
        L16:
            java.io.File r4 = ca.dnamobile.javalauncher.modcompat.MethodInjectorAgentInstaller.install(r2)
            if (r4 != 0) goto L26
            java.lang.String r2 = "MethodInjectorAgent: missing agent jar; Veil ImGui compatibility patch disabled"
            safeAppendLog(r2)
            ca.dnamobile.javalauncher.launcher.LaunchPlan r2 = stripMethodInjectorAgent(r3)
            return r2
        L26:
            java.util.ArrayList r2 = buildVeilImguiCompatibilityJvmArgs(r2, r4)
            ca.dnamobile.javalauncher.launcher.LaunchPlan r4 = prependJvmArgsToLaunchPlan(r3, r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.StringBuilder r2 = r5.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L3f
            safeAppendLog(r2)     // Catch: java.lang.Throwable -> L3f
            return r4
        L3f:
            r2 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "MethodInjectorAgent: unable to add compatibility JVM args to LaunchPlan: "
            r4.<init>(r5)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            java.lang.String r2 = "MethodInjectorAgent: Veil ImGui compatibility patch disabled for this launch"
            safeAppendLog(r2)
            ca.dnamobile.javalauncher.launcher.LaunchPlan r2 = stripMethodInjectorAgent(r3)
            return r2
    }

    private static ca.dnamobile.javalauncher.launcher.LaunchPlan appendQuickPlayArgs(ca.dnamobile.javalauncher.launcher.LaunchPlan r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, java.io.File r5, ca.dnamobile.javalauncher.launcher.LaunchGame.StatusListener r6) {
            if (r2 != 0) goto L5
            java.lang.String r2 = ""
            goto L9
        L5:
            java.lang.String r2 = r2.trim()
        L9:
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L10
            return r1
        L10:
            ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r4 = getQuickPlaySupport(r3, r4, r5)
            boolean r5 = r4.supported
            if (r5 != 0) goto L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Direct world launch is not supported for Minecraft "
            r5.<init>(r0)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r5 = ". Launching Minecraft normally."
            java.lang.StringBuilder r3 = r3.append(r5)
            java.lang.String r3 = r3.toString()
            notify(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Quick Play skipped for world '"
            r3.<init>(r5)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = "': "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r4.reason
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            return r1
        L4f:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.List r5 = r1.getGameArgs()
            r3.<init>(r5)
            removeExistingQuickPlayArgs(r3)
            java.lang.String r5 = "--quickPlaySingleplayer"
            r3.add(r5)
            r3.add(r2)
            java.lang.String r5 = "--quickPlayPath"
            r3.add(r5)
            java.lang.String r5 = "quickPlay/log.json"
            r3.add(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Quick Play enabled for world folder: "
            r5.<init>(r6)
            java.lang.StringBuilder r2 = r5.append(r2)
            java.lang.String r5 = " ("
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r4 = r4.reason
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r4 = ")"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            ca.dnamobile.javalauncher.launcher.LaunchPlan r1 = r1.copyWithGameArgs(r3)
            return r1
    }

    private static java.util.ArrayList<java.lang.String> buildVeilImguiCompatibilityJvmArgs(android.content.Context r2, java.io.File r3) {
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "-javaagent:"
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.add(r3)
            java.lang.String r3 = "-Dimgui.library.name=imgui-java"
            r2.add(r3)
            return r2
    }

    private static boolean containsQuickPlayToken(java.lang.Object r6) {
            r0 = 0
            if (r6 == 0) goto L68
            java.lang.Object r1 = org.json.JSONObject.NULL
            if (r6 != r1) goto L8
            goto L68
        L8:
            boolean r1 = r6 instanceof java.lang.String
            java.lang.String r2 = "quickplay"
            if (r1 == 0) goto L1b
            java.lang.String r6 = (java.lang.String) r6
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r0)
            boolean r6 = r6.contains(r2)
            return r6
        L1b:
            boolean r1 = r6 instanceof org.json.JSONArray
            r3 = 1
            if (r1 == 0) goto L38
            org.json.JSONArray r6 = (org.json.JSONArray) r6
            r1 = r0
        L23:
            int r2 = r6.length()
            if (r1 >= r2) goto L37
            java.lang.Object r2 = r6.opt(r1)
            boolean r2 = containsQuickPlayToken(r2)
            if (r2 == 0) goto L34
            return r3
        L34:
            int r1 = r1 + 1
            goto L23
        L37:
            return r0
        L38:
            boolean r1 = r6 instanceof org.json.JSONObject
            if (r1 == 0) goto L68
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.util.Iterator r1 = r6.keys()
        L42:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L68
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L5d
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r5 = r4.toLowerCase(r5)
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L5d
            return r3
        L5d:
            java.lang.Object r4 = r6.opt(r4)
            boolean r4 = containsQuickPlayToken(r4)
            if (r4 == 0) goto L42
            return r3
        L68:
            return r0
    }

    private static ca.dnamobile.javalauncher.launcher.LaunchPlan copyLaunchPlanWithJvmArgs(ca.dnamobile.javalauncher.launcher.LaunchPlan r9, java.util.ArrayList<java.lang.String> r10) throws java.lang.Exception {
            r0 = 8
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "copyWithJvmArgs"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "copyWithJavaArgs"
            r4 = 1
            r1[r4] = r2
            r2 = 2
            java.lang.String r5 = "copyWithVmArgs"
            r1[r2] = r5
            r2 = 3
            java.lang.String r5 = "copyWithJvmArguments"
            r1[r2] = r5
            r2 = 4
            java.lang.String r5 = "copyWithJavaArguments"
            r1[r2] = r5
            r2 = 5
            java.lang.String r5 = "withJvmArgs"
            r1[r2] = r5
            r2 = 6
            java.lang.String r5 = "withJavaArgs"
            r1[r2] = r5
            r2 = 7
            java.lang.String r5 = "withVmArgs"
            r1[r2] = r5
            r2 = r3
        L2d:
            if (r2 >= r0) goto L54
            r5 = r1[r2]
            java.lang.Class r6 = r9.getClass()     // Catch: java.lang.NoSuchMethodException -> L51
            java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L51
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r7[r3] = r8     // Catch: java.lang.NoSuchMethodException -> L51
            java.lang.reflect.Method r5 = r6.getMethod(r5, r7)     // Catch: java.lang.NoSuchMethodException -> L51
            r5.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L51
            java.lang.Object[] r6 = new java.lang.Object[]{r10}     // Catch: java.lang.NoSuchMethodException -> L51
            java.lang.Object r5 = r5.invoke(r9, r6)     // Catch: java.lang.NoSuchMethodException -> L51
            boolean r6 = r5 instanceof ca.dnamobile.javalauncher.launcher.LaunchPlan     // Catch: java.lang.NoSuchMethodException -> L51
            if (r6 == 0) goto L51
            ca.dnamobile.javalauncher.launcher.LaunchPlan r5 = (ca.dnamobile.javalauncher.launcher.LaunchPlan) r5     // Catch: java.lang.NoSuchMethodException -> L51
            return r5
        L51:
            int r2 = r2 + 1
            goto L2d
        L54:
            r9 = 0
            return r9
    }

    private static void ensureInstalled(java.lang.String r6) {
            java.lang.String r0 = "Missing inherited client jar: "
            java.io.File r1 = new java.io.File
            java.io.File r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()
            r1.<init>(r2, r6)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = ".json"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r1, r3)
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r5 = ".jar"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r1, r4)
            boolean r1 = r2.isFile()
            if (r1 == 0) goto Lcd
            boolean r1 = r3.isFile()
            if (r1 == 0) goto L48
            return
        L48:
            org.json.JSONObject r1 = readVersionJson(r6)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r2 = "inheritsFrom"
            java.lang.String r4 = ""
            java.lang.String r1 = r1.optString(r2, r4)     // Catch: java.lang.Exception -> Lb0
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Exception -> Lb0
            if (r2 != 0) goto L97
            java.io.File r2 = new java.io.File     // Catch: java.lang.Exception -> Lb0
            java.io.File r3 = new java.io.File     // Catch: java.lang.Exception -> Lb0
            java.io.File r4 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()     // Catch: java.lang.Exception -> Lb0
            r3.<init>(r4, r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r4.<init>()     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> Lb0
            r2.<init>(r3, r1)     // Catch: java.lang.Exception -> Lb0
            boolean r1 = r2.isFile()     // Catch: java.lang.Exception -> Lb0
            if (r1 == 0) goto L80
            return
        L80:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb0
            r3.<init>(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r2.getAbsolutePath()     // Catch: java.lang.Exception -> Lb0
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Exception -> Lb0
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> Lb0
            r1.<init>(r0)     // Catch: java.lang.Exception -> Lb0
            throw r1     // Catch: java.lang.Exception -> Lb0
        L97:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing client jar: "
            r0.<init>(r1)
            java.lang.String r1 = r3.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        Lb0:
            r0 = move-exception
            boolean r1 = r0 instanceof java.lang.IllegalStateException
            if (r1 == 0) goto Lb8
            java.lang.IllegalStateException r0 = (java.lang.IllegalStateException) r0
            throw r0
        Lb8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to check inherited client jar for "
            r2.<init>(r3)
            java.lang.StringBuilder r6 = r2.append(r6)
            java.lang.String r6 = r6.toString()
            r1.<init>(r6, r0)
            throw r1
        Lcd:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Missing version json: "
            r0.<init>(r1)
            java.lang.String r1 = r2.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }

    private static java.lang.reflect.Field findField(java.lang.Class<?> r0, java.lang.String r1) {
        L0:
            if (r0 == 0) goto Lc
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.NoSuchFieldException -> L7
            return r0
        L7:
            java.lang.Class r0 = r0.getSuperclass()
            goto L0
        Lc:
            r0 = 0
            return r0
    }

    private static java.lang.Object findJvmArgsObject(ca.dnamobile.javalauncher.launcher.LaunchPlan r15) throws java.lang.Exception {
            r0 = 8
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "getJvmArgs"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "getJavaArgs"
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "getVmArgs"
            r5 = 2
            r1[r5] = r2
            java.lang.String r2 = "getJvmArguments"
            r6 = 3
            r1[r6] = r2
            java.lang.String r2 = "getJavaArguments"
            r7 = 4
            r1[r7] = r2
            r2 = 5
            java.lang.String r8 = "jvmArgs"
            r1[r2] = r8
            r9 = 6
            java.lang.String r10 = "javaArgs"
            r1[r9] = r10
            r9 = 7
            java.lang.String r11 = "vmArgs"
            r1[r9] = r11
            r9 = r3
        L2d:
            if (r9 >= r0) goto L4c
            r12 = r1[r9]
            java.lang.Class r13 = r15.getClass()     // Catch: java.lang.NoSuchMethodException -> L49
            java.lang.Class[] r14 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> L49
            java.lang.reflect.Method r12 = r13.getMethod(r12, r14)     // Catch: java.lang.NoSuchMethodException -> L49
            r12.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L49
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch: java.lang.NoSuchMethodException -> L49
            java.lang.Object r12 = r12.invoke(r15, r13)     // Catch: java.lang.NoSuchMethodException -> L49
            boolean r13 = r12 instanceof java.util.List     // Catch: java.lang.NoSuchMethodException -> L49
            if (r13 == 0) goto L49
            return r12
        L49:
            int r9 = r9 + 1
            goto L2d
        L4c:
            java.lang.String[] r0 = new java.lang.String[r2]
            r0[r3] = r8
            r0[r4] = r10
            r0[r5] = r11
            java.lang.String r1 = "jvmArguments"
            r0[r6] = r1
            java.lang.String r1 = "javaArguments"
            r0[r7] = r1
        L5c:
            if (r3 >= r2) goto L7a
            r1 = r0[r3]
            java.lang.Class r5 = r15.getClass()
            java.lang.reflect.Field r1 = findField(r5, r1)
            if (r1 != 0) goto L6b
            goto L77
        L6b:
            r1.setAccessible(r4)
            java.lang.Object r1 = r1.get(r15)
            boolean r5 = r1 instanceof java.util.List
            if (r5 == 0) goto L77
            return r1
        L77:
            int r3 = r3 + 1
            goto L5c
        L7a:
            r15 = 0
            return r15
    }

    private static java.lang.String getAccountLogLabel(ca.dnamobile.javalauncher.data.AccountStore.Account r3) {
            java.lang.String r0 = ")"
            if (r3 != 0) goto L7
            java.lang.String r3 = "None"
            return r3
        L7:
            java.lang.String r1 = r3.getBestDisplayName()     // Catch: java.lang.Throwable -> Lc
            goto Le
        Lc:
            java.lang.String r1 = ""
        Le:
            if (r1 == 0) goto L20
            java.lang.String r2 = r1.trim()
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L1b
            goto L20
        L1b:
            java.lang.String r1 = r1.trim()
            goto L22
        L20:
            java.lang.String r1 = "unknown"
        L22:
            boolean r2 = r3.isMicrosoftAccount()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L36
            boolean r3 = r3.hasMinecraftSession()     // Catch: java.lang.Throwable -> L36
            if (r3 == 0) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "Microsoft ("
            r3.<init>(r2)
            goto L3d
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r2 = "Offline ("
            r3.<init>(r2)
        L3d:
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    private static java.lang.String getBuildChannel(android.content.Context r1) {
            java.lang.String r1 = r1.getPackageName()
            if (r1 == 0) goto L11
            java.lang.String r0 = ".debug"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L11
            java.lang.String r1 = "debug"
            goto L13
        L11:
            java.lang.String r1 = "release"
        L13:
            return r1
    }

    private static java.lang.String getLauncherVersionLabel(android.content.Context r6) {
            java.lang.String r0 = ")"
            java.lang.String r1 = "DroidBridge Launcher "
            android.content.pm.PackageManager r2 = r6.getPackageManager()     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r6.getPackageName()     // Catch: java.lang.Throwable -> L63
            r4 = 0
            android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r2.versionName     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L29
            java.lang.String r3 = r2.versionName     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L63
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L63
            if (r3 == 0) goto L22
            goto L29
        L22:
            java.lang.String r3 = r2.versionName     // Catch: java.lang.Throwable -> L63
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L63
            goto L2b
        L29:
            java.lang.String r3 = "unknown"
        L2b:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L63
            r5 = 28
            if (r4 < r5) goto L36
            long r4 = r2.getLongVersionCode()     // Catch: java.lang.Throwable -> L63
            goto L39
        L36:
            int r2 = r2.versionCode     // Catch: java.lang.Throwable -> L63
            long r4 = (long) r2     // Catch: java.lang.Throwable -> L63
        L39:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L63
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = r2.append(r3)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = " ("
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = ", "
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.String r2 = getBuildChannel(r6)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L63
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L63
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> L63
            return r6
        L63:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "DroidBridge Launcher unknown ("
            r1.<init>(r2)
            java.lang.String r6 = getBuildChannel(r6)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            return r6
    }

    private static ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport getQuickPlaySupport(java.lang.String r1, org.json.JSONObject r2, java.io.File r3) {
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            boolean r0 = versionTreeContainsQuickPlayArguments(r1, r2, r0)
            if (r0 == 0) goto L12
            java.lang.String r1 = "version JSON contains Quick Play arguments"
            ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r1 = ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport.supported(r1)
            return r1
        L12:
            boolean r1 = supportsQuickPlayVersionId(r1)
            if (r1 == 0) goto L1f
            java.lang.String r1 = "version id is Quick Play capable"
            ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r1 = ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport.supported(r1)
            return r1
        L1f:
            java.lang.String r1 = "id"
            java.lang.String r0 = ""
            java.lang.String r1 = r2.optString(r1, r0)
            boolean r1 = supportsQuickPlayVersionId(r1)
            if (r1 == 0) goto L34
            java.lang.String r1 = "version JSON id is Quick Play capable"
            ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r1 = ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport.supported(r1)
            return r1
        L34:
            java.lang.String r1 = "inheritsFrom"
            java.lang.String r1 = r2.optString(r1, r0)
            boolean r1 = supportsQuickPlayVersionId(r1)
            if (r1 == 0) goto L47
            java.lang.String r1 = "inherited Minecraft version is Quick Play capable"
            ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r1 = ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport.supported(r1)
            return r1
        L47:
            boolean r1 = hasQuickPlayCompatibilityMod(r3)
            if (r1 == 0) goto L54
            java.lang.String r1 = "Quick Play compatibility mod detected"
            ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r1 = ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport.supported(r1)
            return r1
        L54:
            java.lang.String r1 = "vanilla Quick Play starts at Java Edition 1.20; older versions need a compatibility mod"
            ca.dnamobile.javalauncher.launcher.LaunchGame$QuickPlaySupport r1 = ca.dnamobile.javalauncher.launcher.LaunchGame.QuickPlaySupport.unsupported(r1)
            return r1
    }

    private static boolean hasQuickPlayCompatibilityMod(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "mods"
            r0.<init>(r2, r1)
            ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda2 r2 = new ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda2
            r2.<init>()
            java.io.File[] r2 = r0.listFiles(r2)
            if (r2 == 0) goto L17
            int r2 = r2.length
            if (r2 <= 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            return r2
    }

    private static boolean hasVeilOrImguiMod(java.io.File r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "mods"
            r1.<init>(r4, r2)
            addModDirectory(r0, r1)
            java.io.File r4 = r4.getParentFile()
            if (r4 == 0) goto L1d
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r2)
            addModDirectory(r0, r1)
        L1d:
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            if (r4 == 0) goto L37
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            java.lang.String r4 = r4.trim()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L37
            java.io.File r4 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME
            r4.<init>(r1, r2)
            addModDirectory(r0, r4)
        L37:
            java.util.Iterator r4 = r0.iterator()
        L3b:
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 == 0) goto L71
            java.lang.Object r0 = r4.next()
            java.io.File r0 = (java.io.File) r0
            ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda0 r2 = new ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda0
            r2.<init>()
            java.io.File[] r0 = r0.listFiles(r2)
            if (r0 != 0) goto L54
            goto L3b
        L54:
            ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda1 r2 = new ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda1
            r2.<init>()
            java.util.Arrays.sort(r0, r2)
            int r2 = r0.length
        L5d:
            if (r1 >= r2) goto L3b
            r3 = r0[r1]
            boolean r3 = isVeilOrImguiJar(r3)
            if (r3 == 0) goto L6e
            java.lang.String r4 = "Info: Veil/ImGui compatibility mod detected"
            safeAppendLog(r4)
            r4 = 1
            return r4
        L6e:
            int r1 = r1 + 1
            goto L5d
        L71:
            return r1
    }

    private static boolean isMethodInjectorAgentArg(java.lang.String r1) {
            if (r1 == 0) goto L14
            java.lang.String r0 = "-javaagent:"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = "methods_injector_agent.jar"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    private static boolean isVeilImguiCompatibilityArg(java.lang.String r1) {
            boolean r0 = isMethodInjectorAgentArg(r1)
            if (r0 != 0) goto L1d
            if (r1 == 0) goto L10
            java.lang.String r0 = "-Dimgui.library.name="
            boolean r0 = r1.startsWith(r0)
            if (r0 != 0) goto L1d
        L10:
            if (r1 == 0) goto L1b
            java.lang.String r0 = "-Dimgui.library.path="
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r1 = 0
            goto L1e
        L1d:
            r1 = 1
        L1e:
            return r1
    }

    private static boolean isVeilOrImguiJar(java.io.File r10) {
            java.lang.String r0 = r10.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "veil"
            boolean r2 = r0.contains(r1)
            r3 = 1
            if (r2 != 0) goto Le7
            java.lang.String r2 = "imgui"
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L1d
            goto Le7
        L1d:
            r0 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Lc5
            r4.<init>(r10)     // Catch: java.lang.Throwable -> Lc5
            java.util.Enumeration r5 = r4.entries()     // Catch: java.lang.Throwable -> Lbb
            r6 = r0
        L28:
            boolean r7 = r5.hasMoreElements()     // Catch: java.lang.Throwable -> Lbb
            if (r7 == 0) goto Lb7
            int r7 = r6 + 1
            r8 = 4096(0x1000, float:5.74E-42)
            if (r6 >= r8) goto Lb7
            java.lang.Object r6 = r5.nextElement()     // Catch: java.lang.Throwable -> Lbb
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> Lbb
            if (r8 != 0) goto L43
            java.lang.String r8 = ""
            goto L4d
        L43:
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> Lbb
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch: java.lang.Throwable -> Lbb
        L4d:
            boolean r9 = r8.contains(r1)     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto Lb3
            boolean r9 = r8.contains(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto Lb3
            java.lang.String r9 = "foundry/veil"
            boolean r9 = r8.contains(r9)     // Catch: java.lang.Throwable -> Lbb
            if (r9 == 0) goto L62
            goto Lb3
        L62:
            boolean r9 = r6.isDirectory()     // Catch: java.lang.Throwable -> Lbb
            if (r9 == 0) goto L69
            goto Lac
        L69:
            java.lang.String r9 = "fabric.mod.json"
            boolean r9 = r8.endsWith(r9)     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L89
            java.lang.String r9 = "quilt.mod.json"
            boolean r9 = r8.endsWith(r9)     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L89
            java.lang.String r9 = "mods.toml"
            boolean r9 = r8.endsWith(r9)     // Catch: java.lang.Throwable -> Lbb
            if (r9 != 0) goto L89
            java.lang.String r9 = "neoforge.mods.toml"
            boolean r8 = r8.endsWith(r9)     // Catch: java.lang.Throwable -> Lbb
            if (r8 == 0) goto Lac
        L89:
            r8 = 262144(0x40000, float:3.67342E-40)
            java.lang.String r6 = readZipEntryText(r4, r6, r8)     // Catch: java.lang.Throwable -> Lbb
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r6 = r6.toLowerCase(r8)     // Catch: java.lang.Throwable -> Lbb
            java.lang.String r8 = "foundry.veil"
            boolean r8 = r6.contains(r8)     // Catch: java.lang.Throwable -> Lbb
            if (r8 != 0) goto Laf
            java.lang.String r8 = "\"veil\""
            boolean r8 = r6.contains(r8)     // Catch: java.lang.Throwable -> Lbb
            if (r8 != 0) goto Laf
            boolean r6 = r6.contains(r2)     // Catch: java.lang.Throwable -> Lbb
            if (r6 == 0) goto Lac
            goto Laf
        Lac:
            r6 = r7
            goto L28
        Laf:
            r4.close()     // Catch: java.lang.Throwable -> Lc5
            return r3
        Lb3:
            r4.close()     // Catch: java.lang.Throwable -> Lc5
            return r3
        Lb7:
            r4.close()     // Catch: java.lang.Throwable -> Lc5
            goto Le6
        Lbb:
            r1 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> Lc0
            goto Lc4
        Lc0:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> Lc5
        Lc4:
            throw r1     // Catch: java.lang.Throwable -> Lc5
        Lc5:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "MethodInjectorAgent: unable to inspect mod jar "
            r2.<init>(r3)
            java.lang.String r10 = r10.getName()
            java.lang.StringBuilder r10 = r2.append(r10)
            java.lang.String r2 = ": "
            java.lang.StringBuilder r10 = r10.append(r2)
            java.lang.StringBuilder r10 = r10.append(r1)
            java.lang.String r10 = r10.toString()
            safeAppendLog(r10)
        Le6:
            return r0
        Le7:
            return r3
    }

    static /* synthetic */ boolean lambda$hasQuickPlayCompatibilityMod$2(java.io.File r0, java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r0 = ""
            goto Lb
        L5:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
        Lb:
            java.lang.String r1 = ".jar"
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L25
            java.lang.String r1 = "quickplay"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L23
            java.lang.String r1 = "quick-play"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L25
        L23:
            r0 = 1
            goto L26
        L25:
            r0 = 0
        L26:
            return r0
    }

    static /* synthetic */ boolean lambda$hasVeilOrImguiMod$0(java.io.File r0, java.lang.String r1) {
            if (r1 != 0) goto L5
            java.lang.String r0 = ""
            goto Lb
        L5:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
        Lb:
            java.lang.String r1 = ".jar"
            boolean r0 = r0.endsWith(r1)
            return r0
    }

    static /* synthetic */ int lambda$hasVeilOrImguiMod$1(java.io.File r0, java.io.File r1) {
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r1.getName()
            int r0 = r0.compareToIgnoreCase(r1)
            return r0
    }

    private static void notify(ca.dnamobile.javalauncher.launcher.LaunchGame.StatusListener r0, java.lang.String r1) {
            if (r0 == 0) goto L5
            r0.onStatus(r1)
        L5:
            java.lang.String r0 = "LaunchGame"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)
            return
    }

    public static void onJvmExited(android.content.Context r2, java.lang.String r3, int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Info: Java exit code: "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            safeAppendLog(r4)
            ca.dnamobile.javalauncher.logs.LauncherLogManager.preserveLatestLogIfEnabled(r2, r3)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.reset()
            ca.dnamobile.javalauncher.modcompat.ControlifySDL.reset()
            resetLaunchState()
            return
    }

    private static int[] parseVersionNumbers(java.lang.String r6) {
            java.lang.String r0 = "[^0-9]+"
            java.lang.String r1 = "."
            java.lang.String r6 = r6.replaceAll(r0, r1)
            java.lang.String r0 = "\\.+"
            java.lang.String[] r6 = r6.split(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r6.length
            r2 = 0
            r3 = r2
        L16:
            if (r3 >= r1) goto L39
            r4 = r6[r3]
            if (r4 == 0) goto L36
            java.lang.String r5 = r4.trim()
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L27
            goto L36
        L27:
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L36
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.Throwable -> L36
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L36
            r0.add(r4)     // Catch: java.lang.Throwable -> L36
        L36:
            int r3 = r3 + 1
            goto L16
        L39:
            int r6 = r0.size()
            int[] r6 = new int[r6]
        L3f:
            int r1 = r0.size()
            if (r2 >= r1) goto L54
            java.lang.Object r1 = r0.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6[r2] = r1
            int r2 = r2 + 1
            goto L3f
        L54:
            return r6
    }

    private static ca.dnamobile.javalauncher.launcher.LaunchPlan prependJvmArgsToLaunchPlan(ca.dnamobile.javalauncher.launcher.LaunchPlan r5, java.util.ArrayList<java.lang.String> r6) throws java.lang.Exception {
            java.lang.Object r0 = findJvmArgsObject(r5)
            boolean r1 = r0 instanceof java.util.List
            if (r1 == 0) goto L46
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r2 = r0.iterator()
        L13:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2d
            java.lang.Object r3 = r2.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L13
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = isVeilImguiCompatibilityArg(r3)
            if (r4 != 0) goto L13
            r1.add(r3)
            goto L13
        L2d:
            r2 = 0
            r1.addAll(r2, r6)
            ca.dnamobile.javalauncher.launcher.LaunchPlan r3 = copyLaunchPlanWithJvmArgs(r5, r1)
            if (r3 == 0) goto L38
            return r3
        L38:
            boolean r1 = replaceJvmArgsField(r5, r1)
            if (r1 == 0) goto L3f
            return r5
        L3f:
            removeExistingVeilImguiCompatibilityArgs(r0)
            r0.addAll(r2, r6)
            return r5
        L46:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "LaunchPlan does not expose a JVM args List"
            r5.<init>(r6)
            throw r5
    }

    private static org.json.JSONObject readVersionJson(java.lang.String r3) throws java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.io.File r1 = new java.io.File
            java.io.File r2 = ca.dnamobile.javalauncher.ui.version.MinecraftVersionInstaller.getVersionsDirectory()
            r1.<init>(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r3 = r2.append(r3)
            java.lang.String r2 = ".json"
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r3 = r3.toString()
            r0.<init>(r1, r3)
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r0)
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = net.kdt.pojavlaunch.Tools.read(r3)     // Catch: java.lang.Throwable -> L33
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L33
            r3.close()
            return r0
        L33:
            r0 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L38
            goto L3c
        L38:
            r3 = move-exception
            r0.addSuppressed(r3)
        L3c:
            throw r0
    }

    private static java.lang.String readZipEntryText(java.util.zip.ZipFile r5, java.util.zip.ZipEntry r6, int r7) throws java.lang.Exception {
            java.io.InputStream r5 = r5.getInputStream(r6)
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L41
            r6.<init>()     // Catch: java.lang.Throwable -> L41
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r2 = r1
        Lf:
            int r3 = r5.read(r0)     // Catch: java.lang.Throwable -> L37
            r4 = -1
            if (r3 == r4) goto L24
            int r4 = r7 - r2
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L37
            if (r3 <= 0) goto L22
            r6.write(r0, r1, r3)     // Catch: java.lang.Throwable -> L37
            int r2 = r2 + r3
        L22:
            if (r2 < r7) goto Lf
        L24:
            java.nio.charset.Charset r7 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r7.name()     // Catch: java.lang.Throwable -> L37
            java.lang.String r7 = r6.toString(r7)     // Catch: java.lang.Throwable -> L37
            r6.close()     // Catch: java.lang.Throwable -> L41
            if (r5 == 0) goto L36
            r5.close()
        L36:
            return r7
        L37:
            r7 = move-exception
            r6.close()     // Catch: java.lang.Throwable -> L3c
            goto L40
        L3c:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.lang.Throwable -> L41
        L40:
            throw r7     // Catch: java.lang.Throwable -> L41
        L41:
            r6 = move-exception
            if (r5 == 0) goto L4c
            r5.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r5 = move-exception
            r6.addSuppressed(r5)
        L4c:
            throw r6
    }

    private static void removeExistingQuickPlayArgs(java.util.ArrayList<java.lang.String> r1) {
            java.lang.String r0 = "--quickPlaySingleplayer"
            removeOptionAndValue(r1, r0)
            java.lang.String r0 = "--quickPlayMultiplayer"
            removeOptionAndValue(r1, r0)
            java.lang.String r0 = "--quickPlayRealms"
            removeOptionAndValue(r1, r0)
            java.lang.String r0 = "--quickPlayPath"
            removeOptionAndValue(r1, r0)
            return
    }

    private static void removeExistingVeilImguiCompatibilityArgs(java.util.List<java.lang.String> r2) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = isVeilImguiCompatibilityArg(r1)
            if (r1 == 0) goto L17
            r2.remove(r0)
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            return
    }

    private static void removeOptionAndValue(java.util.ArrayList<java.lang.String> r3, java.lang.String r4) {
            r0 = 0
        L1:
            int r1 = r3.size()
            if (r0 >= r1) goto L31
            java.lang.Object r1 = r3.get(r0)
            boolean r1 = r4.equals(r1)
            if (r1 != 0) goto L12
            goto L2e
        L12:
            r3.remove(r0)
            int r1 = r3.size()
            if (r0 >= r1) goto L2c
            java.lang.Object r1 = r3.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "--"
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L2c
            r3.remove(r0)
        L2c:
            int r0 = r0 + (-1)
        L2e:
            int r0 = r0 + 1
            goto L1
        L31:
            return
    }

    private static boolean replaceJvmArgsField(ca.dnamobile.javalauncher.launcher.LaunchPlan r7, java.util.ArrayList<java.lang.String> r8) {
            r0 = 5
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "jvmArgs"
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "javaArgs"
            r4 = 1
            r1[r4] = r2
            r2 = 2
            java.lang.String r5 = "vmArgs"
            r1[r2] = r5
            r2 = 3
            java.lang.String r5 = "jvmArguments"
            r1[r2] = r5
            r2 = 4
            java.lang.String r5 = "javaArguments"
            r1[r2] = r5
            r2 = r3
        L1d:
            if (r2 >= r0) goto L3f
            r5 = r1[r2]
            java.lang.Class r6 = r7.getClass()     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Field r5 = findField(r6, r5)     // Catch: java.lang.Throwable -> L3c
            if (r5 != 0) goto L2c
            goto L3c
        L2c:
            r5.setAccessible(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r6 = r5.get(r7)     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6 instanceof java.util.List     // Catch: java.lang.Throwable -> L3c
            if (r6 != 0) goto L38
            goto L3c
        L38:
            r5.set(r7, r8)     // Catch: java.lang.Throwable -> L3c
            return r4
        L3c:
            int r2 = r2 + 1
            goto L1d
        L3f:
            return r3
    }

    public static void resetLaunchState() {
            java.util.concurrent.atomic.AtomicBoolean r0 = ca.dnamobile.javalauncher.launcher.LaunchGame.IS_LAUNCHING
            r1 = 0
            r0.set(r1)
            return
    }

    private static ca.dnamobile.javalauncher.renderer.RendererInterface resolveRendererForLaunch(android.content.Context r2, ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.Settings r3) {
            boolean r0 = r3.hasRendererOverride()
            if (r0 == 0) goto L4d
            java.lang.String r0 = r3.rendererIdentifier
            ca.dnamobile.javalauncher.renderer.RendererInterface r0 = ca.dnamobile.javalauncher.renderer.Renderers.findRenderer(r2, r0)
            if (r0 == 0) goto L39
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Info: Per-instance renderer override: "
            r2.<init>(r3)
            java.lang.String r3 = r0.getRendererName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " ("
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r0.getUniqueIdentifier()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            return r0
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Info: Per-instance renderer override missing, using global renderer: "
            r0.<init>(r1)
            java.lang.String r3 = r3.rendererIdentifier
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            safeAppendLog(r3)
        L4d:
            ca.dnamobile.javalauncher.renderer.RendererInterface r2 = ca.dnamobile.javalauncher.renderer.Renderers.getSelectedRenderer(r2)
            return r2
    }

    private static java.io.File resolveRuntimeDirectory(int r1) {
            java.io.File r1 = ca.dnamobile.javalauncher.launcher.RuntimeCompat.resolveRuntimeForJava(r1)
            java.lang.String r0 = "Info: Runtime patch: JRE8_ANDROID_14_16_V31"
            safeAppendLog(r0)
            return r1
    }

    private static int resolveTargetJava(java.lang.String r3, org.json.JSONObject r4) {
            java.lang.String r0 = "javaVersion"
            org.json.JSONObject r0 = r4.optJSONObject(r0)
            r1 = 8
            if (r0 == 0) goto L1e
            java.lang.String r3 = "majorVersion"
            r4 = 0
            int r3 = r0.optInt(r3, r4)
            if (r3 != 0) goto L19
            java.lang.String r3 = "version"
            int r3 = r0.optInt(r3, r1)
        L19:
            int r3 = java.lang.Math.max(r1, r3)
            return r3
        L1e:
            java.lang.String r0 = "inheritsFrom"
            java.lang.String r2 = ""
            java.lang.String r4 = r4.optString(r0, r2)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L58
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L58
            org.json.JSONObject r3 = readVersionJson(r4)     // Catch: java.lang.Throwable -> L3b
            int r3 = resolveTargetJava(r4, r3)     // Catch: java.lang.Throwable -> L3b
            return r3
        L3b:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to resolve inherited Java version from "
            r0.<init>(r2)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = ": "
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            safeAppendLog(r3)
        L58:
            return r1
    }

    public static int runGame(android.content.Context r7, java.lang.String r8, ca.dnamobile.javalauncher.data.AccountStore.Account r9, int r10, int r11, ca.dnamobile.javalauncher.launcher.LaunchGame.StatusListener r12) throws java.lang.Exception {
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            int r7 = runGame(r0, r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static int runGame(android.content.Context r17, java.lang.String r18, ca.dnamobile.javalauncher.data.AccountStore.Account r19, int r20, int r21, java.lang.String r22, ca.dnamobile.javalauncher.launcher.LaunchGame.StatusListener r23) throws java.lang.Exception {
            r7 = r17
            r8 = r18
            r0 = r19
            r9 = r23
            java.lang.String r1 = "Info: Per-instance Java runtime: "
            java.lang.String r2 = "Info: Java: "
            java.lang.String r3 = "Info: Renderer plugin: "
            java.lang.String r4 = "Info: Graphics: systemVulkan="
            java.lang.String r5 = "Info: Renderer: "
            java.lang.String r10 = "LaunchGame failed: "
            java.lang.String r6 = "Preparing launch for "
            java.util.concurrent.atomic.AtomicBoolean r11 = ca.dnamobile.javalauncher.launcher.LaunchGame.IS_LAUNCHING
            r12 = 1
            r13 = 0
            boolean r11 = r11.compareAndSet(r13, r12)
            if (r11 != 0) goto L28
            java.lang.String r0 = "LaunchGame: launch request ignored because launch is already in progress"
            safeAppendLog(r0)
            r0 = -1000(0xfffffffffffffc18, float:NaN)
            return r0
        L28:
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r17)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r11 = "launch Minecraft"
            ca.dnamobile.javalauncher.security.LauncherSecurity.requireOfficialBuildAndMicrosoftSession(r7, r0, r11)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b0
            r11.<init>(r6)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r6 = r11.append(r8)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r11 = "..."
            java.lang.StringBuilder r6 = r6.append(r11)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1b0
            notify(r9, r6)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.instance.LauncherInstance r6 = ca.dnamobile.javalauncher.instance.LauncherInstanceManager.findByNameOrId(r17, r18)     // Catch: java.lang.Throwable -> L1b0
            if (r6 == 0) goto L51
            java.lang.String r11 = r6.getBaseVersionId()     // Catch: java.lang.Throwable -> L1b0
            goto L52
        L51:
            r11 = r8
        L52:
            if (r6 == 0) goto L59
            java.io.File r12 = r6.getGameDirectory()     // Catch: java.lang.Throwable -> L1b0
            goto L60
        L59:
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r14 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MINECRAFT_HOME     // Catch: java.lang.Throwable -> L1b0
            r12.<init>(r14)     // Catch: java.lang.Throwable -> L1b0
        L60:
            if (r6 == 0) goto L6d
            java.io.File r12 = ca.dnamobile.javalauncher.utils.path.PathManager.inferLauncherHomeFromGameDirectory(r12)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.utils.path.PathManager.initContextConstants(r7, r12)     // Catch: java.lang.Throwable -> L1b0
            java.io.File r12 = r6.getGameDirectory()     // Catch: java.lang.Throwable -> L1b0
        L6d:
            ca.dnamobile.javalauncher.logs.LauncherLogManager.beginLatestLog(r17, r18)     // Catch: java.lang.Throwable -> L1b0
            appendLaunchHeader(r7, r8, r11, r6, r0)     // Catch: java.lang.Throwable -> L1b0
            if (r6 == 0) goto L7a
            java.lang.String r14 = r6.getId()     // Catch: java.lang.Throwable -> L1b0
            goto L7b
        L7a:
            r14 = r8
        L7b:
            if (r6 == 0) goto L82
            java.lang.String r6 = r6.getName()     // Catch: java.lang.Throwable -> L1b0
            goto L83
        L82:
            r6 = r8
        L83:
            java.lang.String r6 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.resolveInstanceKey(r14, r6)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings$Settings r14 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.load(r7, r6)     // Catch: java.lang.Throwable -> L1b0
            boolean r6 = r14.hasAnyOverride()     // Catch: java.lang.Throwable -> L1b0
            if (r6 == 0) goto L96
            java.lang.String r6 = "Info: Per-instance launch settings: enabled"
            safeAppendLog(r6)     // Catch: java.lang.Throwable -> L1b0
        L96:
            ensureInstalled(r11)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.renderer.Renderers.reload(r17)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.renderer.RendererInterface r15 = resolveRendererForLaunch(r7, r14)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b0
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r5 = r15.getRendererName()     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r5 = r6.append(r5)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r6 = " ("
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r6 = r15.getRendererId()     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r6 = ")"
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1b0
            safeAppendLog(r5)     // Catch: java.lang.Throwable -> L1b0
            boolean r5 = r15.isExternalPlugin()     // Catch: java.lang.Throwable -> L1b0
            if (r5 == 0) goto Le2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b0
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r3 = r15.getUniqueIdentifier()     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r3 = r5.append(r3)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1b0
            safeAppendLog(r3)     // Catch: java.lang.Throwable -> L1b0
        Le2:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b0
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b0
            boolean r4 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseSystemVulkanDriver(r17)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r4 = ", forceOpenGL26Plus="
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L1b0
            boolean r4 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isUseOpenGlForMinecraft26Plus(r17)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1b0
            safeAppendLog(r3)     // Catch: java.lang.Throwable -> L1b0
            org.json.JSONObject r6 = readVersionJson(r11)     // Catch: java.lang.Throwable -> L1b0
            int r5 = resolveTargetJava(r11, r6)     // Catch: java.lang.Throwable -> L1b0
            java.io.File r3 = resolveRuntimeDirectory(r5)     // Catch: java.lang.Throwable -> L1b0
            java.io.File r4 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.resolveRuntimeDirectory(r14, r3)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b0
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r2 = r3.append(r5)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r3 = " using "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r3 = r4.getName()     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L1b0
            safeAppendLog(r2)     // Catch: java.lang.Throwable -> L1b0
            boolean r2 = r14.hasRuntimeOverride()     // Catch: java.lang.Throwable -> L1b0
            if (r2 == 0) goto L14a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b0
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r1 = r14.runtimeName     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r1 = r2.append(r1)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1b0
            safeAppendLog(r1)     // Catch: java.lang.Throwable -> L1b0
        L14a:
            ca.dnamobile.javalauncher.launcher.GraphicsBackendHelper.applyBeforeLaunch(r7, r11, r6, r12)     // Catch: java.lang.Throwable -> L1b0
            runPreLaunchModMitigations(r12)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r1 = "Building launch arguments..."
            notify(r9, r1)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder r3 = new ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder     // Catch: java.lang.Throwable -> L1b0
            r1 = r3
            r2 = r17
            r13 = r3
            r3 = r11
            r0 = r4
            r4 = r19
            r8 = r5
            r5 = r20
            r16 = r6
            r6 = r21
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder r0 = r13.setRuntimeDirectory(r0)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder r0 = r0.setGameDirectory(r12)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.JavaLaunchBuilder r0 = r0.setRenderer(r15)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.LaunchPlan r0 = r0.build()     // Catch: java.lang.Throwable -> L1b0
            r1 = r22
            r2 = r11
            r3 = r16
            r4 = r12
            r5 = r23
            ca.dnamobile.javalauncher.launcher.LaunchPlan r0 = appendQuickPlayArgs(r0, r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.LaunchPlan r0 = appendMethodInjectorAgentIfNeeded(r7, r0, r8, r12)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.LaunchPlan r0 = ca.dnamobile.javalauncher.launcher.InstanceLaunchSettings.applyJvmOverrides(r7, r0, r14)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.LaunchPlan r0 = ca.dnamobile.javalauncher.launcher.DroidBridgeOpenGlProxyArgs.applyIfNeeded(r0, r15)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r1 = "Checking controller compatibility..."
            notify(r9, r1)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.modcompat.ControlifySDL.initializeIfNeeded(r7, r12)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.prepare(r7, r12)     // Catch: java.lang.Throwable -> L1b0
            if (r9 != 0) goto L1a0
            r1 = 0
            goto L1a8
        L1a0:
            java.util.Objects.requireNonNull(r23)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda3 r1 = new ca.dnamobile.javalauncher.launcher.LaunchGame$$ExternalSyntheticLambda3     // Catch: java.lang.Throwable -> L1b0
            r1.<init>(r9)     // Catch: java.lang.Throwable -> L1b0
        L1a8:
            int r0 = ca.dnamobile.javalauncher.launcher.JavaGameLauncher.launchPreparedPlan(r7, r0, r15, r1)     // Catch: java.lang.Throwable -> L1b0
            ca.dnamobile.javalauncher.logs.LauncherLogManager.preserveLatestLogIfEnabled(r17, r18)
            return r0
        L1b0:
            r0 = move-exception
            java.util.concurrent.atomic.AtomicBoolean r1 = ca.dnamobile.javalauncher.launcher.LaunchGame.IS_LAUNCHING     // Catch: java.lang.Throwable -> L1d4
            r2 = 0
            r1.set(r2)     // Catch: java.lang.Throwable -> L1d4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d4
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L1d4
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L1d4
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1d4
            safeAppendLog(r1)     // Catch: java.lang.Throwable -> L1d4
            boolean r1 = r0 instanceof java.lang.Exception     // Catch: java.lang.Throwable -> L1d4
            if (r1 == 0) goto L1ce
            java.lang.Exception r0 = (java.lang.Exception) r0     // Catch: java.lang.Throwable -> L1d4
            throw r0     // Catch: java.lang.Throwable -> L1d4
        L1ce:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1d4
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d4
            throw r1     // Catch: java.lang.Throwable -> L1d4
        L1d4:
            r0 = move-exception
            ca.dnamobile.javalauncher.logs.LauncherLogManager.preserveLatestLogIfEnabled(r17, r18)
            throw r0
    }

    private static void runPreLaunchModMitigations(java.io.File r0) {
            ca.dnamobile.javalauncher.modcompat.VulkanModLwjglMitigation.prepare(r0)
            ca.dnamobile.javalauncher.modcompat.VulkanModConfigMitigation.prepare(r0)
            return
    }

    private static void safeAppendLog(java.lang.String r1) {
            java.lang.String r0 = stripTrailingLineBreaks(r1)     // Catch: java.lang.Throwable -> L8
            net.kdt.pojavlaunch.Logger.appendToLog(r0)     // Catch: java.lang.Throwable -> L8
            goto Ld
        L8:
            java.lang.String r0 = "LaunchGame"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)
        Ld:
            return
    }

    private static ca.dnamobile.javalauncher.launcher.LaunchPlan stripMethodInjectorAgent(ca.dnamobile.javalauncher.launcher.LaunchPlan r6) {
            java.lang.Object r0 = findJvmArgsObject(r6)     // Catch: java.lang.Throwable -> L50
            boolean r1 = r0 instanceof java.util.List     // Catch: java.lang.Throwable -> L50
            if (r1 != 0) goto L9
            return r6
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L50
            r1.<init>()     // Catch: java.lang.Throwable -> L50
            r2 = r0
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L50
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L50
            r3 = 0
        L16:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L50
            if (r4 == 0) goto L39
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L50
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L2f
            r5 = r4
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L50
            boolean r5 = isVeilImguiCompatibilityArg(r5)     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L2f
            r3 = 1
            goto L16
        L2f:
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Throwable -> L50
            if (r5 == 0) goto L16
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L50
            r1.add(r4)     // Catch: java.lang.Throwable -> L50
            goto L16
        L39:
            if (r3 != 0) goto L3c
            return r6
        L3c:
            ca.dnamobile.javalauncher.launcher.LaunchPlan r2 = copyLaunchPlanWithJvmArgs(r6, r1)     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L43
            return r2
        L43:
            boolean r1 = replaceJvmArgsField(r6, r1)     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L4a
            return r6
        L4a:
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L50
            removeExistingVeilImguiCompatibilityArgs(r0)     // Catch: java.lang.Throwable -> L50
            goto L63
        L50:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "MethodInjectorAgent: unable to strip compatibility JVM args: "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            safeAppendLog(r0)
        L63:
            return r6
    }

    private static java.lang.String stripTrailingLineBreaks(java.lang.String r3) {
            int r0 = r3.length()
        L4:
            if (r0 <= 0) goto L18
            int r1 = r0 + (-1)
            char r1 = r3.charAt(r1)
            r2 = 10
            if (r1 == r2) goto L15
            r2 = 13
            if (r1 == r2) goto L15
            goto L18
        L15:
            int r0 = r0 + (-1)
            goto L4
        L18:
            int r1 = r3.length()
            if (r0 != r1) goto L1f
            goto L24
        L1f:
            r1 = 0
            java.lang.String r3 = r3.substring(r1, r0)
        L24:
            return r3
    }

    private static boolean supportsQuickPlayVersionId(java.lang.String r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r6 = r6.trim()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r1)
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L15
            return r0
        L15:
            int[] r1 = parseVersionNumbers(r6)
            int r2 = r1.length
            r3 = 1
            if (r2 <= 0) goto L24
            r2 = r1[r0]
            r4 = 26
            if (r2 < r4) goto L24
            return r3
        L24:
            java.lang.String r2 = "^\\d{2}w\\d{2}[a-z].*$"
            boolean r2 = r6.matches(r2)
            if (r2 == 0) goto L4b
            r2 = 2
            java.lang.String r2 = r6.substring(r0, r2)     // Catch: java.lang.Throwable -> L4b
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.Throwable -> L4b
            r4 = 3
            r5 = 5
            java.lang.String r6 = r6.substring(r4, r5)     // Catch: java.lang.Throwable -> L4b
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Throwable -> L4b
            r1 = 23
            if (r2 > r1) goto L49
            if (r2 != r1) goto L4a
            r1 = 14
            if (r6 < r1) goto L4a
        L49:
            r0 = r3
        L4a:
            return r0
        L4b:
            r6 = r0
        L4c:
            int r2 = r6 + 1
            int r4 = r1.length
            if (r2 >= r4) goto L5e
            r6 = r1[r6]
            if (r6 != r3) goto L5c
            r6 = r1[r2]
            r4 = 20
            if (r6 < r4) goto L5c
            return r3
        L5c:
            r6 = r2
            goto L4c
        L5e:
            return r0
    }

    private static boolean versionTreeContainsQuickPlayArguments(java.lang.String r2, org.json.JSONObject r3, java.util.Set<java.lang.String> r4) {
            boolean r2 = r4.add(r2)
            r0 = 0
            if (r2 != 0) goto L8
            return r0
        L8:
            boolean r2 = containsQuickPlayToken(r3)
            if (r2 == 0) goto L10
            r2 = 1
            return r2
        L10:
            java.lang.String r2 = "inheritsFrom"
            java.lang.String r1 = ""
            java.lang.String r2 = r3.optString(r2, r1)
            java.lang.String r2 = r2.trim()
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L23
            return r0
        L23:
            org.json.JSONObject r3 = readVersionJson(r2)     // Catch: java.lang.Throwable -> L2c
            boolean r2 = versionTreeContainsQuickPlayArguments(r2, r3, r4)     // Catch: java.lang.Throwable -> L2c
            return r2
        L2c:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to inspect inherited Quick Play args from "
            r4.<init>(r1)
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            safeAppendLog(r2)
            return r0
    }
}
