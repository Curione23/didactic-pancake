package ca.dnamobile.javalauncher.launcher;

/* JADX INFO: loaded from: classes.dex */
public final class RuntimeCompat {
    public static final java.lang.String PATCH_ID = "JRE8_ANDROID_14_16_V31";
    private static final java.lang.String TAG = "RuntimeCompat";

    private RuntimeCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String describeRuntimeState(java.lang.String r7, java.io.File r8) {
            boolean r0 = r8.exists()
            if (r0 != 0) goto L1a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "missing folder "
            r7.<init>(r0)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
        L1a:
            boolean r0 = r8.isDirectory()
            if (r0 != 0) goto L34
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "not a directory "
            r7.<init>(r0)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
        L34:
            java.lang.String r7 = safeRuntimeVersion(r7)
            java.io.File r0 = findJava8Home(r8)
            java.io.File r1 = findModernJavaHome(r8)
            if (r0 == 0) goto L43
            goto L44
        L43:
            r0 = r1
        L44:
            r1 = 0
            if (r0 == 0) goto L4c
            java.io.File r2 = findJavaBinary(r0)
            goto L4d
        L4c:
            r2 = r1
        L4d:
            if (r0 == 0) goto L54
            java.io.File r3 = findLibJvm(r0)
            goto L55
        L54:
            r3 = r1
        L55:
            r4 = 8
            if (r0 == 0) goto L60
            java.lang.String r5 = "rt.jar"
            java.io.File r5 = findFileNamed(r0, r5, r4)
            goto L61
        L60:
            r5 = r1
        L61:
            if (r0 == 0) goto L69
            java.lang.String r1 = "modules"
            java.io.File r1 = findFileNamed(r0, r1, r4)
        L69:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r6 = "path="
            r4.<init>(r6)
            java.lang.String r8 = r8.getAbsolutePath()
            java.lang.StringBuilder r8 = r4.append(r8)
            java.lang.String r4 = ", marker="
            java.lang.StringBuilder r8 = r8.append(r4)
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = ", javaHome="
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r8 = "<missing>"
            if (r0 == 0) goto L91
            java.lang.String r0 = r0.getAbsolutePath()
            goto L92
        L91:
            r0 = r8
        L92:
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = ", binJava="
            java.lang.StringBuilder r7 = r7.append(r0)
            if (r2 == 0) goto La3
            java.lang.String r0 = r2.getAbsolutePath()
            goto La4
        La3:
            r0 = r8
        La4:
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = ", libjvm="
            java.lang.StringBuilder r7 = r7.append(r0)
            if (r3 == 0) goto Lb5
            java.lang.String r0 = r3.getAbsolutePath()
            goto Lb6
        Lb5:
            r0 = r8
        Lb6:
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = ", rt.jar="
            java.lang.StringBuilder r7 = r7.append(r0)
            if (r5 == 0) goto Lc7
            java.lang.String r0 = r5.getAbsolutePath()
            goto Lc8
        Lc7:
            r0 = r8
        Lc8:
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r0 = ", modules="
            java.lang.StringBuilder r7 = r7.append(r0)
            if (r1 == 0) goto Ld8
            java.lang.String r8 = r1.getAbsolutePath()
        Ld8:
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
    }

    private static java.lang.String emptyToNull(java.lang.String r1) {
            if (r1 == 0) goto L12
            java.lang.String r0 = r1.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            java.lang.String r1 = r1.trim()
            goto L13
        L12:
            r1 = 0
        L13:
            return r1
    }

    public static java.io.File findFileNamed(java.io.File r5, java.lang.String r6, int r7) {
            r0 = 0
            if (r7 < 0) goto L3a
            boolean r1 = r5.isDirectory()
            if (r1 != 0) goto La
            goto L3a
        La:
            java.io.File[] r5 = r5.listFiles()
            if (r5 != 0) goto L11
            return r0
        L11:
            int r1 = r5.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L3a
            r3 = r5[r2]
            boolean r4 = r3.isFile()
            if (r4 == 0) goto L28
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L28
            return r3
        L28:
            boolean r4 = r3.isDirectory()
            if (r4 == 0) goto L37
            int r4 = r7 + (-1)
            java.io.File r3 = findFileNamed(r3, r6, r4)
            if (r3 == 0) goto L37
            return r3
        L37:
            int r2 = r2 + 1
            goto L13
        L3a:
            return r0
    }

    public static java.io.File findJava8Home(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/rt.jar"
            r0.<init>(r3, r1)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto Le
            return r3
        Le:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "jre/lib/rt.jar"
            r0.<init>(r3, r1)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L23
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "jre"
            r0.<init>(r3, r1)
            return r0
        L23:
            java.lang.String r0 = "rt.jar"
            r1 = 10
            java.io.File r3 = findFileNamed(r3, r0, r1)
            r0 = 0
            if (r3 != 0) goto L2f
            return r0
        L2f:
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L4f
            java.lang.String r1 = "lib"
            java.lang.String r2 = r3.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L42
            goto L4f
        L42:
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L4f
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L4f
            r0 = r3
        L4f:
            return r0
    }

    public static java.io.File findJavaBinary(java.io.File r2) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "bin/java"
            r0.<init>(r2, r1)
            boolean r1 = r0.isFile()
            if (r1 == 0) goto Le
            return r0
        Le:
            java.lang.String r0 = "java"
            r1 = 4
            java.io.File r2 = findFileNamed(r2, r0, r1)
            return r2
    }

    public static java.io.File findLibJvm(java.io.File r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/server/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/client/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/aarch64/server/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/aarch64/client/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/arm64/server/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/arm64/client/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/arm64-v8a/server/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/arm64-v8a/client/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/arm/server/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/arm/client/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/x86_64/server/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/x86_64/client/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/i386/server/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "lib/i386/client/libjvm.so"
            r1.<init>(r3, r2)
            r0.add(r1)
            java.util.Iterator r0 = r0.iterator()
        L95:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La8
            java.lang.Object r1 = r0.next()
            java.io.File r1 = (java.io.File) r1
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L95
            return r1
        La8:
            java.lang.String r0 = "libjvm.so"
            r1 = 10
            java.io.File r3 = findFileNamed(r3, r0, r1)
            return r3
    }

    public static java.io.File findModernJavaHome(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "lib/modules"
            r0.<init>(r3, r1)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto Le
            return r3
        Le:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "jre/lib/modules"
            r0.<init>(r3, r1)
            boolean r0 = r0.isFile()
            if (r0 == 0) goto L23
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "jre"
            r0.<init>(r3, r1)
            return r0
        L23:
            java.lang.String r0 = "modules"
            r1 = 10
            java.io.File r3 = findFileNamed(r3, r0, r1)
            r0 = 0
            if (r3 != 0) goto L2f
            return r0
        L2f:
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L4f
            java.lang.String r1 = "lib"
            java.lang.String r2 = r3.getName()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L42
            goto L4f
        L42:
            java.io.File r3 = r3.getParentFile()
            if (r3 == 0) goto L4f
            boolean r1 = r3.isDirectory()
            if (r1 == 0) goto L4f
            r0 = r3
        L4f:
            return r0
    }

    public static java.io.File getRuntimeDirectory(java.lang.String r2) {
            java.io.File r0 = net.kdt.pojavlaunch.multirt.MultiRTUtils.getRuntimeDir(r2)     // Catch: java.lang.Throwable -> L7
            if (r0 == 0) goto L7
            return r0
        L7:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_MULTIRT_HOME
            r0.<init>(r1, r2)
            return r0
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

    private static boolean isJava8Runtime(java.lang.String r1) {
            java.lang.String r0 = "8"
            boolean r1 = r1.contains(r0)
            return r1
    }

    public static boolean isRuntimeInstalledForDisplay(java.lang.String r2) {
            java.io.File r0 = getRuntimeDirectory(r2)
            int r1 = javaMajorForRuntimeName(r2)
            boolean r2 = isRuntimeInstalledForJava(r2, r0, r1)
            return r2
    }

    public static boolean isRuntimeInstalledForJava(java.lang.String r4, java.io.File r5, int r6) {
            boolean r0 = r5.isDirectory()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r0 = isJava8Runtime(r4)
            r2 = 1
            r3 = 8
            if (r0 != 0) goto L30
            if (r6 > r3) goto L14
            goto L30
        L14:
            java.io.File r4 = findModernJavaHome(r5)
            if (r4 == 0) goto L2f
            java.io.File r5 = findJavaBinary(r4)
            if (r5 == 0) goto L2f
            java.io.File r5 = findLibJvm(r4)
            if (r5 == 0) goto L2f
            java.lang.String r5 = "modules"
            java.io.File r4 = findFileNamed(r4, r5, r3)
            if (r4 == 0) goto L2f
            r1 = r2
        L2f:
            return r1
        L30:
            java.lang.String r4 = safeRuntimeVersion(r4)
            java.io.File r5 = findJava8Home(r5)
            boolean r4 = isBlank(r4)
            if (r4 != 0) goto L4f
            if (r5 == 0) goto L4f
            java.io.File r4 = findLibJvm(r5)
            if (r4 == 0) goto L4f
            java.lang.String r4 = "rt.jar"
            java.io.File r4 = findFileNamed(r5, r4, r3)
            if (r4 == 0) goto L4f
            r1 = r2
        L4f:
            return r1
    }

    public static int javaMajorForRuntimeName(java.lang.String r1) {
            java.lang.String r0 = "25"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lb
            r1 = 25
            return r1
        Lb:
            java.lang.String r0 = "21"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L16
            r1 = 21
            return r1
        L16:
            java.lang.String r0 = "17"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L21
            r1 = 17
            return r1
        L21:
            java.lang.String r0 = "8"
            r1.contains(r0)
            r1 = 8
            return r1
    }

    public static java.io.File normalizeRuntimeHome(java.lang.String r0, java.io.File r1, int r2) {
            boolean r0 = isJava8Runtime(r0)
            if (r0 != 0) goto L13
            r0 = 8
            if (r2 > r0) goto Lb
            goto L13
        Lb:
            java.io.File r0 = findModernJavaHome(r1)
            if (r0 == 0) goto L12
            r1 = r0
        L12:
            return r1
        L13:
            java.io.File r0 = findJava8Home(r1)
            if (r0 == 0) goto L1a
            r1 = r0
        L1a:
            return r1
    }

    private static java.lang.String[] preferredRuntimes(int r10) {
            r0 = 25
            java.lang.String r1 = "Internal-8"
            r2 = 3
            java.lang.String r3 = "Internal-17"
            r4 = 2
            java.lang.String r5 = "Internal-21"
            r6 = 1
            java.lang.String r7 = "Internal-25"
            r8 = 0
            r9 = 4
            if (r10 < r0) goto L1c
            java.lang.String[] r10 = new java.lang.String[r9]
            r10[r8] = r7
            r10[r6] = r5
            r10[r4] = r3
            r10[r2] = r1
            return r10
        L1c:
            r0 = 21
            if (r10 < r0) goto L2b
            java.lang.String[] r10 = new java.lang.String[r9]
            r10[r8] = r5
            r10[r6] = r7
            r10[r4] = r3
            r10[r2] = r1
            return r10
        L2b:
            r0 = 17
            if (r10 < r0) goto L3a
            java.lang.String[] r10 = new java.lang.String[r9]
            r10[r8] = r3
            r10[r6] = r5
            r10[r4] = r7
            r10[r2] = r1
            return r10
        L3a:
            java.lang.String[] r10 = new java.lang.String[r9]
            r10[r8] = r1
            r10[r6] = r3
            r10[r4] = r5
            r10[r2] = r7
            return r10
    }

    public static java.io.File resolveRuntimeForJava(int r8) {
            java.lang.String[] r0 = preferredRuntimes(r8)
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L64
            r3 = r0[r2]
            java.io.File r4 = getRuntimeDirectory(r3)
            boolean r5 = isRuntimeInstalledForJava(r3, r4, r8)
            java.lang.String r6 = "RuntimeCompat"
            if (r5 == 0) goto L37
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Runtime patch active: JRE8_ANDROID_14_16_V31 selected "
            r8.<init>(r0)
            java.lang.StringBuilder r8 = r8.append(r3)
            java.lang.String r0 = " -> "
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r0 = r4.getAbsolutePath()
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r8)
            return r4
        L37:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "Runtime "
            r5.<init>(r7)
            java.lang.StringBuilder r5 = r5.append(r3)
            java.lang.String r7 = " is not usable for Java "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r8)
            java.lang.String r7 = ": "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r3 = describeRuntimeState(r3, r4)
            java.lang.StringBuilder r3 = r5.append(r3)
            java.lang.String r3 = r3.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.i(r6, r3)
            int r2 = r2 + 1
            goto L6
        L64:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No launchable internal Java runtime is installed for Java "
            r1.<init>(r2)
            java.lang.StringBuilder r8 = r1.append(r8)
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
    }

    private static java.lang.String safeRuntimeVersion(java.lang.String r0) {
            java.lang.String r0 = net.kdt.pojavlaunch.multirt.MultiRTUtils.readInternalRuntimeVersion(r0)     // Catch: java.lang.Throwable -> L9
            java.lang.String r0 = emptyToNull(r0)     // Catch: java.lang.Throwable -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }
}
