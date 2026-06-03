package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class ControllerModCompat {
    private static final java.lang.String TAG = "ControllerModCompat";
    private static net.kdt.pojavlaunch.Logger.eventLogListener controllableLogListener;
    private static net.kdt.pojavlaunch.Logger.eventLogListener legacy4JLogListener;
    private static boolean suppressLauncherGamepadInput;

    private static final class PatchBytesResult {
        final byte[] bytes;
        final boolean changed;

        PatchBytesResult(byte[] r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.bytes = r1
                r0.changed = r2
                return
        }
    }

    private ControllerModCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addPath(java.lang.StringBuilder r3, java.io.File r4) {
            java.lang.String r4 = r4.getAbsolutePath()
            java.lang.String r0 = r4.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            return
        Lf:
            java.lang.String r0 = r3.toString()
            boolean r1 = r0.equals(r4)
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L5d
            goto L6b
        L5d:
            int r0 = r3.length()
            if (r0 <= 0) goto L68
            r0 = 58
            r3.append(r0)
        L68:
            r3.append(r4)
        L6b:
            return
    }

    private static void addPathList(java.lang.StringBuilder r4, java.lang.String r5) {
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            return
        Lb:
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r5.split(r0)
            int r0 = r5.length
            r1 = 0
        L13:
            if (r1 >= r0) goto L33
            r2 = r5[r1]
            if (r2 == 0) goto L30
            java.lang.String r3 = r2.trim()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L24
            goto L30
        L24:
            java.io.File r3 = new java.io.File
            java.lang.String r2 = r2.trim()
            r3.<init>(r2)
            addPath(r4, r3)
        L30:
            int r1 = r1 + 1
            goto L13
        L33:
            return
    }

    private static void append(java.lang.String r3) {
            java.lang.String r0 = "\n"
            java.lang.String r1 = "ControllerModCompat: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2c
            boolean r1 = r3.endsWith(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L10
            goto L21
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r1.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r3 = r1.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2c
        L21:
            java.lang.StringBuilder r3 = r2.append(r3)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2c
            net.kdt.pojavlaunch.Logger.appendToLog(r3)     // Catch: java.lang.Throwable -> L2c
        L2c:
            return
    }

    public static java.lang.String buildJnaLibraryPath(android.content.Context r4, java.io.File r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            addPathList(r0, r6)
            if (r5 == 0) goto L8e
            boolean r6 = hasControllable(r5)
            if (r6 == 0) goto L8e
            java.lang.String r6 = findControllableSdlVersion(r5)
            java.io.File r1 = new java.io.File
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo()
            java.lang.String r4 = r4.nativeLibraryDir
            r1.<init>(r4)
            addPath(r0, r1)
            java.io.File r4 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "ControllableSDL/"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r4.<init>(r1, r2)
            addPath(r0, r4)
            java.io.File r4 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "controllable_natives/SDL/"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r6)
            java.lang.String r2 = r2.toString()
            r4.<init>(r1, r2)
            addPath(r0, r4)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.StringBuilder r1 = r1.append(r6)
            java.lang.String r1 = r1.toString()
            r4.<init>(r5, r1)
            addPath(r0, r4)
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "controllable_natives/"
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r6 = r6.toString()
            r4.<init>(r5, r6)
            addPath(r0, r4)
            java.lang.String r4 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r4 == 0) goto L8e
            java.io.File r4 = new java.io.File
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r4.<init>(r5)
            addPath(r0, r4)
        L8e:
            java.lang.String r4 = r0.toString()
            return r4
    }

    private static void copyFile(java.io.File r4, java.io.File r5) throws java.io.IOException {
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L2e
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2e
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L2e
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L19
            goto L2e
        L19:
            java.io.IOException r4 = new java.io.IOException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r5.<init>(r1)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L2e:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L59
            r1 = 0
            r4.<init>(r5, r1)     // Catch: java.lang.Throwable -> L59
            r5 = 65536(0x10000, float:9.1835E-41)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L4f
        L3d:
            int r2 = r0.read(r5)     // Catch: java.lang.Throwable -> L4f
            r3 = -1
            if (r2 == r3) goto L48
            r4.write(r5, r1, r2)     // Catch: java.lang.Throwable -> L4f
            goto L3d
        L48:
            r4.close()     // Catch: java.lang.Throwable -> L59
            r0.close()
            return
        L4f:
            r5 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L54
            goto L58
        L54:
            r4 = move-exception
            r5.addSuppressed(r4)     // Catch: java.lang.Throwable -> L59
        L58:
            throw r5     // Catch: java.lang.Throwable -> L59
        L59:
            r4 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L5e
            goto L62
        L5e:
            r5 = move-exception
            r4.addSuppressed(r5)
        L62:
            throw r4
    }

    private static void copyNative(java.io.File r5, java.io.File r6) throws java.io.IOException {
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto L2e
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2e
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L2e
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L19
            goto L2e
        L19:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create directory: "
            r6.<init>(r1)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L2e:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r5)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L76
            r1 = 0
            r5.<init>(r6, r1)     // Catch: java.lang.Throwable -> L76
            r2 = 65536(0x10000, float:9.1835E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L6c
        L3d:
            int r3 = r0.read(r2)     // Catch: java.lang.Throwable -> L6c
            r4 = -1
            if (r3 == r4) goto L48
            r5.write(r2, r1, r3)     // Catch: java.lang.Throwable -> L6c
            goto L3d
        L48:
            r5.close()     // Catch: java.lang.Throwable -> L76
            r0.close()
            r5 = 1
            r6.setReadable(r5, r1)
            r6.setExecutable(r5, r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Prepared Controllable SDL2 native: "
            r5.<init>(r0)
            java.lang.String r6 = r6.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            append(r5)
            return
        L6c:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L71
            goto L75
        L71:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L76
        L75:
            throw r6     // Catch: java.lang.Throwable -> L76
        L76:
            r5 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L7b
            goto L7f
        L7b:
            r6 = move-exception
            r5.addSuppressed(r6)
        L7f:
            throw r5
    }

    private static java.io.File findAndroidSdl2Library(android.content.Context r6) {
            r0 = 3
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "libSDL2.so"
            r3 = 0
            r1[r3] = r2
            r2 = 1
            java.lang.String r4 = "libSDL2-2.0.so"
            r1[r2] = r4
            r2 = 2
            java.lang.String r4 = "libSDL2_2.0.so"
            r1[r2] = r4
            java.io.File r2 = new java.io.File
            android.content.pm.ApplicationInfo r6 = r6.getApplicationInfo()
            java.lang.String r6 = r6.nativeLibraryDir
            r2.<init>(r6)
            r6 = r3
        L1e:
            if (r6 >= r0) goto L31
            r4 = r1[r6]
            java.io.File r5 = new java.io.File
            r5.<init>(r2, r4)
            boolean r4 = r5.isFile()
            if (r4 == 0) goto L2e
            return r5
        L2e:
            int r6 = r6 + 1
            goto L1e
        L31:
            java.lang.String r6 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r6 == 0) goto L4f
            java.io.File r6 = new java.io.File
            java.lang.String r2 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            r6.<init>(r2)
        L3c:
            if (r3 >= r0) goto L4f
            r2 = r1[r3]
            java.io.File r4 = new java.io.File
            r4.<init>(r6, r2)
            boolean r2 = r4.isFile()
            if (r2 == 0) goto L4c
            return r4
        L4c:
            int r3 = r3 + 1
            goto L3c
        L4f:
            r6 = 0
            return r6
    }

    private static java.lang.String findControllableSdlVersion(java.io.File r3) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "mods"
            r0.<init>(r3, r1)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda0 r3 = new ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda0
            r3.<init>()
            java.io.File[] r3 = r0.listFiles(r3)
            if (r3 == 0) goto L22
            int r0 = r3.length
            r1 = 0
        L14:
            if (r1 >= r0) goto L22
            r2 = r3[r1]
            java.lang.String r2 = findControllableSdlVersionInJar(r2)
            if (r2 == 0) goto L1f
            return r2
        L1f:
            int r1 = r1 + 1
            goto L14
        L22:
            java.lang.String r3 = "2.30.12"
            return r3
    }

    private static java.lang.String findControllableSdlVersionInJar(java.io.File r4) {
            java.lang.String r0 = "controllable-sdl-"
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L5b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5b
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L5b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5b
        Lc:
            java.util.zip.ZipEntry r4 = r1.getNextEntry()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L4d
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L51
            java.util.Locale r2 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L51
            java.lang.String r4 = r4.toLowerCase(r2)     // Catch: java.lang.Throwable -> L51
            int r2 = r4.indexOf(r0)     // Catch: java.lang.Throwable -> L51
            if (r2 < 0) goto Lc
            java.lang.String r3 = ".jar"
            boolean r3 = r4.endsWith(r3)     // Catch: java.lang.Throwable -> L51
            if (r3 != 0) goto L2b
            goto Lc
        L2b:
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L51
            int r2 = r2 + r3
            java.lang.String r4 = r4.substring(r2)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "^(\\d+\\.\\d+\\.\\d+)"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> L51
            java.util.regex.Matcher r4 = r2.matcher(r4)     // Catch: java.lang.Throwable -> L51
            boolean r2 = r4.find()     // Catch: java.lang.Throwable -> L51
            if (r2 == 0) goto Lc
            r0 = 1
            java.lang.String r4 = r4.group(r0)     // Catch: java.lang.Throwable -> L51
            r1.close()     // Catch: java.lang.Throwable -> L5b
            return r4
        L4d:
            r1.close()     // Catch: java.lang.Throwable -> L5b
            goto L5b
        L51:
            r4 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L5b
        L5a:
            throw r4     // Catch: java.lang.Throwable -> L5b
        L5b:
            r4 = 0
            return r4
    }

    public static boolean hasControllable(java.io.File r4) {
            r0 = 0
            if (r4 == 0) goto L11
            r1 = 1
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.String r3 = "controllable"
            r2[r0] = r3
            boolean r4 = hasMod(r4, r2)
            if (r4 == 0) goto L11
            r0 = r1
        L11:
            return r0
    }

    private static boolean hasMod(java.io.File r8, java.lang.String... r9) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "mods"
            r0.<init>(r8, r1)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda4 r8 = new ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda4
            r8.<init>()
            java.io.File[] r8 = r0.listFiles(r8)
            r0 = 0
            if (r8 != 0) goto L14
            return r0
        L14:
            int r1 = r8.length
            r2 = r0
        L16:
            if (r2 >= r1) goto L3e
            r3 = r8[r2]
            java.lang.String r3 = r3.getName()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            int r4 = r9.length
            r5 = r0
        L26:
            if (r5 >= r4) goto L3b
            r6 = r9[r5]
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r6 = r6.toLowerCase(r7)
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L38
            r8 = 1
            return r8
        L38:
            int r5 = r5 + 1
            goto L26
        L3b:
            int r2 = r2 + 1
            goto L16
        L3e:
            return r0
    }

    private static boolean isControllableSdlNativeResource(java.lang.String r1) {
            java.lang.String r0 = "linux-aarch64/libsdl2.so"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "linux-aarch64/libsdl2-2.0.so"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "linux-arm64/libsdl2.so"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = "linux-arm64/libsdl2-2.0.so"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            goto L24
        L23:
            r1 = 1
        L24:
            return r1
    }

    private static boolean isJarSignatureEntry(java.lang.String r1) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toUpperCase(r0)
            java.lang.String r0 = "META-INF/"
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto L30
            java.lang.String r0 = ".SF"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = ".RSA"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = ".DSA"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L2e
            java.lang.String r0 = ".EC"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L30
        L2e:
            r1 = 1
            goto L31
        L30:
            r1 = 0
        L31:
            return r1
    }

    static /* synthetic */ boolean lambda$findControllableSdlVersion$4(java.io.File r1) {
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L1a
            java.lang.String r1 = r1.getName()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = ".jar"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    static /* synthetic */ boolean lambda$hasMod$5(java.io.File r1) {
            boolean r0 = r1.isFile()
            if (r0 == 0) goto L1a
            java.lang.String r1 = r1.getName()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            java.lang.String r0 = ".jar"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    static /* synthetic */ boolean lambda$patchControllableJarForAndroidSdl2$3(java.io.File r2) {
            boolean r0 = r2.isFile()
            if (r0 == 0) goto L2c
            java.lang.String r0 = r2.getName()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = ".jar"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L2c
            java.lang.String r2 = r2.getName()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            java.lang.String r0 = "controllable"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L2c
            r2 = 1
            goto L2d
        L2c:
            r2 = 0
        L2d:
            return r2
    }

    static /* synthetic */ void lambda$scheduleSdlPoll$2(java.lang.String r2) {
            boolean r0 = net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled
            if (r0 != 0) goto L1b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r0 = ": skipped because launcher SDL routing is disabled"
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            append(r2)
            return
        L1b:
            org.libsdl.app.SDLControllerManager.initialize()     // Catch: java.lang.Throwable -> L38
            org.libsdl.app.SDLControllerManager.pollInputDevices()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L38
            r0.<init>()     // Catch: java.lang.Throwable -> L38
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L38
            java.lang.String r1 = ": SDLControllerManager.pollInputDevices() completed"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L38
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L38
            append(r0)     // Catch: java.lang.Throwable -> L38
            goto L6c
        L38:
            r0 = move-exception
            r1 = 0
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = r1.append(r2)
            java.lang.String r1 = ": SDL poll failed, routing disabled: "
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.Class r1 = r0.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r1 = ": "
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r2 = r2.toString()
            append(r2)
        L6c:
            return
    }

    static /* synthetic */ void lambda$startControllableMitigation$1(java.lang.String r3) {
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "ControllerModCompat:"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "Sound engine started"
            boolean r0 = r3.contains(r0)
            r1 = 0
            if (r0 == 0) goto L29
            java.lang.String r3 = "Controllable compatibility: game reached sound engine start; launcher gamepad overlay remains disabled"
            append(r3)
            java.lang.String r3 = "Controllable sound engine poll"
            scheduleSdlPoll(r3, r1)
            java.lang.String r3 = "Controllable sound engine delayed poll"
            r0 = 1500(0x5dc, double:7.41E-321)
            scheduleSdlPoll(r3, r0)
            goto La2
        L29:
            java.lang.String r0 = "Applying gamepad mappings"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L96
            java.lang.String r0 = "Successfully updated"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L96
            java.lang.String r0 = "Finished downloading mappings"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L42
            goto L96
        L42:
            java.lang.String r0 = "libm.so.6"
            boolean r0 = r3.contains(r0)
            r1 = 0
            if (r0 != 0) goto L89
            java.lang.String r0 = "libc.so.6"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L54
            goto L89
        L54:
            java.lang.String r0 = "java.io.File.getName()"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L71
            java.lang.String r0 = "file"
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L71
            java.lang.String r3 = "Controllable hit the JNA nounpack File.getName() bug; make sure -Djna.nounpack is not forced true."
            append(r3)
            net.kdt.pojavlaunch.Logger$eventLogListener r3 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener
            net.kdt.pojavlaunch.Logger.removeLogListener(r3)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener = r1
            goto La2
        L71:
            java.lang.String r0 = "Stopping!"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L81
            java.lang.String r0 = "Game crashed!"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto La2
        L81:
            net.kdt.pojavlaunch.Logger$eventLogListener r3 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener
            net.kdt.pojavlaunch.Logger.removeLogListener(r3)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener = r1
            goto La2
        L89:
            java.lang.String r3 = "Controllable is still loading a desktop SDL2 native; embedded jar patch did not take effect."
            append(r3)
            net.kdt.pojavlaunch.Logger$eventLogListener r3 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener
            net.kdt.pojavlaunch.Logger.removeLogListener(r3)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener = r1
            goto La2
        L96:
            java.lang.String r3 = "Controllable mapping poll"
            scheduleSdlPoll(r3, r1)
            java.lang.String r3 = "Controllable mapping delayed poll"
            r0 = 750(0x2ee, double:3.705E-321)
            scheduleSdlPoll(r3, r0)
        La2:
            return
    }

    static /* synthetic */ void lambda$startLegacy4JMitigation$0(java.lang.String r6) {
            if (r6 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "ControllerModCompat:"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "Added SDL Controller Mappings"
            boolean r0 = r6.contains(r0)
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L30
            java.lang.String r6 = "Legacy4J SDL mappings loaded successfully"
            append(r6)
            java.lang.String r6 = "Legacy4J mappings poll"
            scheduleSdlPoll(r6, r2)
            java.lang.String r6 = "Legacy4J mappings delayed poll"
            r2 = 1000(0x3e8, double:4.94E-321)
            scheduleSdlPoll(r6, r2)
            net.kdt.pojavlaunch.Logger$eventLogListener r6 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener
            net.kdt.pojavlaunch.Logger.removeLogListener(r6)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener = r1
            return
        L30:
            java.lang.String r0 = "SDL Game Controller failed to start"
            boolean r0 = r6.contains(r0)
            r4 = 1500(0x5dc, double:7.41E-321)
            if (r0 != 0) goto L76
            java.lang.String r0 = "GLFW will be used instead"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L76
            java.lang.String r0 = "SDL3 (isXander's libsdl4j)"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L4b
            goto L76
        L4b:
            java.lang.String r0 = "Sound engine started"
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L5e
            java.lang.String r6 = "Legacy4J sound engine poll"
            scheduleSdlPoll(r6, r2)
            java.lang.String r6 = "Legacy4J sound engine delayed poll"
            scheduleSdlPoll(r6, r4)
            return
        L5e:
            java.lang.String r0 = "Stopping!"
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L6e
            java.lang.String r0 = "Game crashed!"
            boolean r6 = r6.contains(r0)
            if (r6 == 0) goto L75
        L6e:
            net.kdt.pojavlaunch.Logger$eventLogListener r6 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener
            net.kdt.pojavlaunch.Logger.removeLogListener(r6)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener = r1
        L75:
            return
        L76:
            java.lang.String r6 = "Legacy4J SDL/GLFW fallback detected; keeping launcher SDL bridge and gamepad overlay suppression active"
            append(r6)
            java.lang.String r6 = "Legacy4J fallback poll"
            scheduleSdlPoll(r6, r2)
            java.lang.String r6 = "Legacy4J fallback delayed poll"
            scheduleSdlPoll(r6, r4)
            return
    }

    private static void logAndroidControllers(java.lang.String r9) {
            r0 = 0
            int[] r1 = android.view.InputDevice.getDeviceIds()     // Catch: java.lang.Throwable -> L74
            int r2 = r1.length     // Catch: java.lang.Throwable -> L74
            r3 = r0
        L7:
            if (r0 >= r2) goto L91
            r4 = r1[r0]     // Catch: java.lang.Throwable -> L72
            android.view.InputDevice r5 = android.view.InputDevice.getDevice(r4)     // Catch: java.lang.Throwable -> L72
            if (r5 != 0) goto L12
            goto L6f
        L12:
            int r6 = r5.getSources()     // Catch: java.lang.Throwable -> L72
            r7 = r6 & 1025(0x401, float:1.436E-42)
            r8 = 1025(0x401, float:1.436E-42)
            if (r7 == r8) goto L29
            r7 = 16777232(0x1000010, float:2.3509932E-38)
            r8 = r6 & r7
            if (r8 == r7) goto L29
            r7 = r6 & 513(0x201, float:7.19E-43)
            r8 = 513(0x201, float:7.19E-43)
            if (r7 != r8) goto L6f
        L29:
            int r3 = r3 + 1
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L72
            r7.<init>()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r7 = r7.append(r9)     // Catch: java.lang.Throwable -> L72
            java.lang.String r8 = ": Android controller device id="
            java.lang.StringBuilder r7 = r7.append(r8)     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r4 = r7.append(r4)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = " name="
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = r5.getName()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L72
            java.lang.String r7 = " descriptor="
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = r5.getDescriptor()     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = " sources=0x"
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r5 = java.lang.Integer.toHexString(r6)     // Catch: java.lang.Throwable -> L72
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L72
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L72
            append(r4)     // Catch: java.lang.Throwable -> L72
        L6f:
            int r0 = r0 + 1
            goto L7
        L72:
            r0 = move-exception
            goto L77
        L74:
            r1 = move-exception
            r3 = r0
            r0 = r1
        L77:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r1 = r1.append(r9)
            java.lang.String r2 = ": Android controller scan failed: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            append(r0)
        L91:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r9 = r0.append(r9)
            java.lang.String r0 = ": Android controller count="
            java.lang.StringBuilder r9 = r9.append(r0)
            java.lang.StringBuilder r9 = r9.append(r3)
            java.lang.String r9 = r9.toString()
            append(r9)
            return
    }

    private static void patchControllableJarForAndroidSdl2(java.io.File r6, java.io.File r7) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "mods"
            r0.<init>(r6, r1)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda5 r6 = new ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda5
            r6.<init>()
            java.io.File[] r6 = r0.listFiles(r6)
            if (r6 == 0) goto L79
            int r0 = r6.length
            if (r0 != 0) goto L16
            goto L79
        L16:
            byte[] r7 = readAllBytes(r7)     // Catch: java.io.IOException -> L66
            int r0 = r6.length
            r1 = 0
        L1c:
            if (r1 >= r0) goto L65
            r2 = r6[r1]
            boolean r3 = patchOuterControllableJar(r2, r7)     // Catch: java.lang.Throwable -> L41
            if (r3 == 0) goto L62
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r3.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "Patched Controllable embedded SDL2 resource: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L41
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L41
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L41
            append(r3)     // Catch: java.lang.Throwable -> L41
            goto L62
        L41:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Failed to patch Controllable jar "
            r4.<init>(r5)
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r2 = r4.append(r2)
            java.lang.String r4 = ": "
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            append(r2)
        L62:
            int r1 = r1 + 1
            goto L1c
        L65:
            return
        L66:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Unable to read Android SDL2 for jar patch: "
            r7.<init>(r0)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            append(r6)
        L79:
            return
    }

    private static ca.dnamobile.javalauncher.modcompat.ControllerModCompat.PatchBytesResult patchNestedControllableSdlJar(byte[] r9, byte[] r10) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            int r1 = r9.length
            int r2 = r10.length
            int r1 = java.lang.Math.max(r1, r2)
            r0.<init>(r1)
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r9)
            r1.<init>(r2)
            java.util.zip.ZipOutputStream r9 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L74
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L74
            r2 = 65536(0x10000, float:9.1835E-41)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L6a
            r3 = 0
            r4 = r3
        L20:
            java.util.zip.ZipEntry r5 = r1.getNextEntry()     // Catch: java.lang.Throwable -> L6a
            r6 = 1
            if (r5 == 0) goto L52
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L6a
            boolean r7 = isJarSignatureEntry(r5)     // Catch: java.lang.Throwable -> L6a
            if (r7 == 0) goto L33
            r4 = r6
            goto L20
        L33:
            byte[] r7 = readEntryBytes(r1, r2)     // Catch: java.lang.Throwable -> L6a
            java.util.Locale r8 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L6a
            java.lang.String r8 = r5.toLowerCase(r8)     // Catch: java.lang.Throwable -> L6a
            boolean r8 = isControllableSdlNativeResource(r8)     // Catch: java.lang.Throwable -> L6a
            if (r8 == 0) goto L4e
            boolean r3 = java.util.Arrays.equals(r7, r10)     // Catch: java.lang.Throwable -> L6a
            if (r3 != 0) goto L4d
            r7 = r10
            r3 = r6
            r4 = r3
            goto L4e
        L4d:
            r3 = r6
        L4e:
            writeZipEntry(r9, r5, r7)     // Catch: java.lang.Throwable -> L6a
            goto L20
        L52:
            if (r3 != 0) goto L5a
            java.lang.String r2 = "linux-aarch64/libSDL2.so"
            writeZipEntry(r9, r2, r10)     // Catch: java.lang.Throwable -> L6a
            r4 = r6
        L5a:
            r9.close()     // Catch: java.lang.Throwable -> L74
            r1.close()
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$PatchBytesResult r9 = new ca.dnamobile.javalauncher.modcompat.ControllerModCompat$PatchBytesResult
            byte[] r10 = r0.toByteArray()
            r9.<init>(r10, r4)
            return r9
        L6a:
            r10 = move-exception
            r9.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r9 = move-exception
            r10.addSuppressed(r9)     // Catch: java.lang.Throwable -> L74
        L73:
            throw r10     // Catch: java.lang.Throwable -> L74
        L74:
            r9 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r10 = move-exception
            r9.addSuppressed(r10)
        L7d:
            throw r9
    }

    private static boolean patchOuterControllableJar(java.io.File r12, byte[] r13) throws java.io.IOException {
            java.io.File r0 = new java.io.File
            java.io.File r1 = r12.getParentFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".javalauncher.tmp"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.util.zip.ZipInputStream r1 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r12)
            r1.<init>(r2)
            java.util.zip.ZipOutputStream r2 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> Lec
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lec
            r4 = 0
            r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> Lec
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lec
            r3 = 65536(0x10000, float:9.1835E-41)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> Le2
            r5 = r4
            r6 = r5
        L3b:
            java.util.zip.ZipEntry r7 = r1.getNextEntry()     // Catch: java.lang.Throwable -> Le2
            r8 = 1
            if (r7 == 0) goto L88
            java.lang.String r7 = r7.getName()     // Catch: java.lang.Throwable -> Le2
            boolean r9 = isJarSignatureEntry(r7)     // Catch: java.lang.Throwable -> Le2
            if (r9 == 0) goto L4e
            r6 = r8
            goto L3b
        L4e:
            byte[] r9 = readEntryBytes(r1, r3)     // Catch: java.lang.Throwable -> Le2
            java.util.Locale r10 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Le2
            java.lang.String r10 = r7.toLowerCase(r10)     // Catch: java.lang.Throwable -> Le2
            java.lang.String r11 = ".jar"
            boolean r11 = r10.endsWith(r11)     // Catch: java.lang.Throwable -> Le2
            if (r11 == 0) goto L76
            java.lang.String r11 = "controllable-sdl"
            boolean r11 = r10.contains(r11)     // Catch: java.lang.Throwable -> Le2
            if (r11 == 0) goto L76
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$PatchBytesResult r5 = patchNestedControllableSdlJar(r9, r13)     // Catch: java.lang.Throwable -> Le2
            boolean r10 = r5.changed     // Catch: java.lang.Throwable -> Le2
            if (r10 == 0) goto L74
            byte[] r5 = r5.bytes     // Catch: java.lang.Throwable -> Le2
            r9 = r5
            r6 = r8
        L74:
            r5 = r8
            goto L84
        L76:
            boolean r10 = isControllableSdlNativeResource(r10)     // Catch: java.lang.Throwable -> Le2
            if (r10 == 0) goto L84
            boolean r10 = java.util.Arrays.equals(r9, r13)     // Catch: java.lang.Throwable -> Le2
            if (r10 != 0) goto L84
            r9 = r13
            r6 = r8
        L84:
            writeZipEntry(r2, r7, r9)     // Catch: java.lang.Throwable -> Le2
            goto L3b
        L88:
            r2.close()     // Catch: java.lang.Throwable -> Lec
            r1.close()
            if (r5 != 0) goto La6
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r1 = "Controllable jar did not contain an embedded controllable-sdl jar: "
            r13.<init>(r1)
            java.lang.String r1 = r12.getName()
            java.lang.StringBuilder r13 = r13.append(r1)
            java.lang.String r13 = r13.toString()
            append(r13)
        La6:
            if (r6 != 0) goto Lac
            r0.delete()
            return r4
        Lac:
            java.io.File r13 = new java.io.File
            java.io.File r1 = r12.getParentFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r12.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".javalauncher.bak"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r13.<init>(r1, r2)
            boolean r1 = r13.exists()
            if (r1 != 0) goto Ld5
            copyFile(r12, r13)
        Ld5:
            boolean r13 = r0.renameTo(r12)
            if (r13 != 0) goto Le1
            copyFile(r0, r12)
            r0.delete()
        Le1:
            return r8
        Le2:
            r12 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            r13 = move-exception
            r12.addSuppressed(r13)     // Catch: java.lang.Throwable -> Lec
        Leb:
            throw r12     // Catch: java.lang.Throwable -> Lec
        Lec:
            r12 = move-exception
            r1.close()     // Catch: java.lang.Throwable -> Lf1
            goto Lf5
        Lf1:
            r13 = move-exception
            r12.addSuppressed(r13)
        Lf5:
            throw r12
    }

    public static synchronized void prepare(android.content.Context r3, java.io.File r4) {
            java.lang.Class<ca.dnamobile.javalauncher.modcompat.ControllerModCompat> r0 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.class
            monitor-enter(r0)
            if (r4 != 0) goto L7
            monitor-exit(r0)
            return
        L7:
            boolean r1 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isSdlControllerModCompatEnabled(r3)     // Catch: java.lang.Throwable -> L23
            r2 = 0
            if (r1 != 0) goto L19
            java.lang.String r3 = "disabled by preference"
            append(r3)     // Catch: java.lang.Throwable -> L23
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.suppressLauncherGamepadInput = r2     // Catch: java.lang.Throwable -> L23
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return
        L19:
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.suppressLauncherGamepadInput = r2     // Catch: java.lang.Throwable -> L23
            startLegacy4JMitigation(r3, r4)     // Catch: java.lang.Throwable -> L23
            startControllableMitigation(r3, r4)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r0)
            return
        L23:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r3
    }

    private static void prepareAndroidSdl2ForControllable(android.content.Context r6, java.io.File r7) throws java.io.IOException {
            java.io.File r6 = findAndroidSdl2Library(r6)
            if (r6 == 0) goto La6
            boolean r0 = r6.isFile()
            if (r0 != 0) goto Le
            goto La6
        Le:
            java.lang.String r0 = findControllableSdlVersion(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Preparing Controllable Android SDL2 version="
            r1.<init>(r2)
            java.lang.StringBuilder r1 = r1.append(r0)
            java.lang.String r2 = " from "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            append(r1)
            patchControllableJarForAndroidSdl2(r7, r6)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "controllable_natives/SDL/"
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r4 = "/libSDL2.so"
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r7, r2)
            copyNative(r6, r1)
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "controllable_natives/"
            r2.<init>(r5)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r7, r2)
            copyNative(r6, r1)
            java.io.File r7 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "ControllableSDL/"
            r2.<init>(r5)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            r7.<init>(r1, r2)
            copyNative(r6, r7)
            java.io.File r7 = new java.io.File
            java.io.File r1 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r7.<init>(r1, r0)
            copyNative(r6, r7)
            return
        La6:
            java.lang.String r6 = "Android libSDL2.so missing. Controllable will likely extract its desktop linux-aarch64 SDL2 and crash."
            append(r6)
            return
    }

    private static byte[] readAllBytes(java.io.File r6) throws java.io.IOException {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r6)
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L2e
            long r2 = r6.length()     // Catch: java.lang.Throwable -> L2e
            r4 = 8388608(0x800000, double:4.144523E-317)
            long r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2e
            int r6 = (int) r2     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L2e
            r6 = 65536(0x10000, float:9.1835E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L2e
        L1a:
            int r2 = r0.read(r6)     // Catch: java.lang.Throwable -> L2e
            r3 = -1
            if (r2 == r3) goto L26
            r3 = 0
            r1.write(r6, r3, r2)     // Catch: java.lang.Throwable -> L2e
            goto L1a
        L26:
            byte[] r6 = r1.toByteArray()     // Catch: java.lang.Throwable -> L2e
            r0.close()
            return r6
        L2e:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L33
            goto L37
        L33:
            r0 = move-exception
            r6.addSuppressed(r0)
        L37:
            throw r6
    }

    private static byte[] readEntryBytes(java.util.zip.ZipInputStream r3, byte[] r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
        L5:
            int r1 = r3.read(r4)
            r2 = -1
            if (r1 == r2) goto L11
            r2 = 0
            r0.write(r4, r2, r1)
            goto L5
        L11:
            byte[] r3 = r0.toByteArray()
            return r3
    }

    public static synchronized void reset() {
            java.lang.Class<ca.dnamobile.javalauncher.modcompat.ControllerModCompat> r0 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.class
            monitor-enter(r0)
            net.kdt.pojavlaunch.Logger$eventLogListener r1 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            if (r1 == 0) goto Ld
            net.kdt.pojavlaunch.Logger.removeLogListener(r1)     // Catch: java.lang.Throwable -> L1d
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener = r2     // Catch: java.lang.Throwable -> L1d
        Ld:
            net.kdt.pojavlaunch.Logger$eventLogListener r1 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L16
            net.kdt.pojavlaunch.Logger.removeLogListener(r1)     // Catch: java.lang.Throwable -> L1d
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener = r2     // Catch: java.lang.Throwable -> L1d
        L16:
            r1 = 0
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.suppressLauncherGamepadInput = r1     // Catch: java.lang.Throwable -> L1d
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r1     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)
            return
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    private static void scheduleSdlPoll(java.lang.String r2, long r3) {
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda1 r1 = new ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda1
            r1.<init>(r2)
            r0.postDelayed(r1, r3)
            return
    }

    public static boolean shouldSuppressLauncherGamepadInput() {
            boolean r0 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.suppressLauncherGamepadInput
            return r0
    }

    private static void showWarning(android.content.Context r0, java.lang.String r1) {
            boolean r0 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isShowControllerModCompatWarnings(r0)
            if (r0 == 0) goto L9
            append(r1)
        L9:
            return
    }

    private static void startControllableMitigation(android.content.Context r4, java.io.File r5) {
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]
            java.lang.String r2 = "controllable"
            r3 = 0
            r1[r3] = r2
            boolean r1 = hasMod(r5, r1)
            if (r1 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = "Controllable detected, preparing SDL/JNA compatibility"
            append(r1)
            java.lang.String r1 = "Controllable"
            logAndroidControllers(r1)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.suppressLauncherGamepadInput = r0
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r3
            prepareAndroidSdl2ForControllable(r4, r5)     // Catch: java.lang.Throwable -> L21
            goto L34
        L21:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Failed to prepare Android SDL2 for Controllable: "
            r0.<init>(r2)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            append(r5)
        L34:
            boolean r5 = ca.dnamobile.javalauncher.settings.LauncherPreferences.isForceSdlControllerBridge(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Controllable Force SDL bridge="
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            append(r0)
            if (r5 == 0) goto L61
            boolean r0 = tryEnableLauncherSdlBridge(r4, r1)
            if (r0 == 0) goto L61
            java.lang.String r0 = "Controllable initial delayed poll"
            r1 = 750(0x2ee, double:3.705E-321)
            scheduleSdlPoll(r0, r1)
            java.lang.String r0 = "Controllable initial late poll"
            r1 = 2500(0x9c4, double:1.235E-320)
            scheduleSdlPoll(r0, r1)
            goto L68
        L61:
            if (r5 != 0) goto L68
            java.lang.String r0 = "Controllable Force SDL bridge is disabled; patched SDL2 only, launcher gamepad overlay remains suppressed"
            append(r0)
        L68:
            if (r5 == 0) goto L6d
            java.lang.String r5 = "Controllable compatibility mode is active. Force SDL bridge is enabled."
            goto L6f
        L6d:
            java.lang.String r5 = "Controllable compatibility mode is active. Enable Force SDL bridge in settings if the controller is not detected."
        L6f:
            showWarning(r4, r5)
            net.kdt.pojavlaunch.Logger$eventLogListener r4 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener
            if (r4 == 0) goto L79
            net.kdt.pojavlaunch.Logger.removeLogListener(r4)
        L79:
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda2 r4 = new ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda2
            r4.<init>()
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.controllableLogListener = r4
            net.kdt.pojavlaunch.Logger.addLogListener(r4)
            return
    }

    private static void startLegacy4JMitigation(android.content.Context r4, java.io.File r5) {
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r2 = "legacy4j"
            r0[r1] = r2
            java.lang.String r1 = "legacy-4j"
            r2 = 1
            r0[r2] = r1
            r1 = 2
            java.lang.String r3 = "legacy"
            r0[r1] = r3
            boolean r5 = hasMod(r5, r0)
            if (r5 != 0) goto L19
            return
        L19:
            java.lang.String r5 = "Legacy4J detected; enabling launcher SDL bridge before Minecraft starts"
            append(r5)
            java.lang.String r5 = "Legacy4J"
            logAndroidControllers(r5)
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.suppressLauncherGamepadInput = r2
            boolean r5 = tryEnableLauncherSdlBridge(r4, r5)
            if (r5 == 0) goto L41
            java.lang.String r5 = "Legacy4J initial poll"
            r0 = 0
            scheduleSdlPoll(r5, r0)
            java.lang.String r5 = "Legacy4J delayed poll"
            r0 = 750(0x2ee, double:3.705E-321)
            scheduleSdlPoll(r5, r0)
            java.lang.String r5 = "Legacy4J late poll"
            r0 = 2500(0x9c4, double:1.235E-320)
            scheduleSdlPoll(r5, r0)
            goto L46
        L41:
            java.lang.String r5 = "Legacy4J launcher SDL bridge did not initialize; JavaLauncher gamepad overlay stays suppressed so GLFW fallback can try to receive input"
            append(r5)
        L46:
            java.lang.String r5 = "Legacy4J controller compatibility mode is active."
            showWarning(r4, r5)
            net.kdt.pojavlaunch.Logger$eventLogListener r4 = ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener
            if (r4 == 0) goto L52
            net.kdt.pojavlaunch.Logger.removeLogListener(r4)
        L52:
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda3 r4 = new ca.dnamobile.javalauncher.modcompat.ControllerModCompat$$ExternalSyntheticLambda3
            r4.<init>()
            ca.dnamobile.javalauncher.modcompat.ControllerModCompat.legacy4JLogListener = r4
            net.kdt.pojavlaunch.Logger.addLogListener(r4)
            return
    }

    private static boolean tryEnableLauncherSdlBridge(android.content.Context r6, java.lang.String r7) {
            java.lang.String r0 = ": "
            r1 = 0
            java.io.File r2 = findAndroidSdl2Library(r6)     // Catch: java.lang.Throwable -> L210
            if (r2 == 0) goto L1f7
            boolean r3 = r2.isFile()     // Catch: java.lang.Throwable -> L210
            if (r3 != 0) goto L11
            goto L1f7
        L11:
            java.lang.String r3 = "SDL3"
            org.libsdl.app.SDL.loadLibrary(r3, r6)     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            r3.<init>()     // Catch: java.lang.Throwable -> L2d
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r4 = " Force SDL bridge: SDL3 loaded"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2d
            append(r3)     // Catch: java.lang.Throwable -> L2d
            goto L5c
        L2d:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r4.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r5 = " Force SDL bridge: SDL3 not loaded/available: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L210
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L210
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L210
            append(r3)     // Catch: java.lang.Throwable -> L210
        L5c:
            java.lang.String r3 = "SDL2"
            org.libsdl.app.SDL.loadLibrary(r3, r6)     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L78
            r3.<init>()     // Catch: java.lang.Throwable -> L78
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = " Force SDL bridge: SDL2 loaded via SDL.loadLibrary"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L78
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L78
            append(r3)     // Catch: java.lang.Throwable -> L78
            goto Lae
        L78:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r4.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r5 = " Force SDL bridge: SDL.loadLibrary(SDL2) failed, using System.load: "
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L210
            java.lang.Class r5 = r3.getClass()     // Catch: java.lang.Throwable -> L210
            java.lang.String r5 = r5.getSimpleName()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r4 = r4.append(r5)     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r4 = r4.append(r0)     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r4.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L210
            append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L210
            java.lang.System.load(r2)     // Catch: java.lang.Throwable -> L210
        Lae:
            org.libsdl.app.SDL.initialize()     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc8
            r2.<init>()     // Catch: java.lang.Throwable -> Lc8
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r3 = " Force SDL bridge: SDL.initialize() completed"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> Lc8
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lc8
            append(r2)     // Catch: java.lang.Throwable -> Lc8
            goto Lf7
        Lc8:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r3.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r4 = " Force SDL bridge: SDL.initialize() failed/non-fatal: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L210
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L210
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L210
            append(r2)     // Catch: java.lang.Throwable -> L210
        Lf7:
            org.libsdl.app.SDL.setupJNI()     // Catch: java.lang.Throwable -> L111
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L111
            r2.<init>()     // Catch: java.lang.Throwable -> L111
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch: java.lang.Throwable -> L111
            java.lang.String r3 = " Force SDL bridge: SDL.setupJNI() completed"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L111
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L111
            append(r2)     // Catch: java.lang.Throwable -> L111
            goto L140
        L111:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r3.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r4 = " Force SDL bridge: SDL.setupJNI() failed/non-fatal: "
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L210
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L210
            java.lang.String r4 = r4.getSimpleName()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r3 = r3.append(r0)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = r2.getMessage()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L210
            append(r2)     // Catch: java.lang.Throwable -> L210
        L140:
            org.libsdl.app.SDL.setContext(r6)     // Catch: java.lang.Throwable -> L210
            org.libsdl.app.SDLSurface r2 = new org.libsdl.app.SDLSurface     // Catch: java.lang.Throwable -> L15f
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15f
            r6.<init>()     // Catch: java.lang.Throwable -> L15f
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r2 = " Force SDL bridge: SDLSurface created for controller plumbing"
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L15f
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L15f
            append(r6)     // Catch: java.lang.Throwable -> L15f
            goto L18e
        L15f:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r2.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = " Force SDL bridge: SDLSurface creation failed/non-fatal: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Throwable -> L210
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r6 = r2.append(r6)     // Catch: java.lang.Throwable -> L210
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L210
            append(r6)     // Catch: java.lang.Throwable -> L210
        L18e:
            net.kdt.pojavlaunch.Tools.SDL.initializeControllerSubsystems()     // Catch: java.lang.Throwable -> L1a8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a8
            r6.<init>()     // Catch: java.lang.Throwable -> L1a8
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L1a8
            java.lang.String r2 = " Force SDL bridge: Tools.SDL.initializeControllerSubsystems() completed"
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L1a8
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1a8
            append(r6)     // Catch: java.lang.Throwable -> L1a8
            goto L1d7
        L1a8:
            r6 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r2.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = " Force SDL bridge: controller subsystem init failed/non-fatal: "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.Class r3 = r6.getClass()     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = r3.getSimpleName()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r2.append(r0)     // Catch: java.lang.Throwable -> L210
            java.lang.String r6 = r6.getMessage()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r6 = r2.append(r6)     // Catch: java.lang.Throwable -> L210
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L210
            append(r6)     // Catch: java.lang.Throwable -> L210
        L1d7:
            org.libsdl.app.SDLControllerManager.initialize()     // Catch: java.lang.Throwable -> L210
            r6 = 1
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r6     // Catch: java.lang.Throwable -> L210
            org.libsdl.app.SDLControllerManager.pollInputDevices()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r2.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r2 = r2.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r3 = " Force SDL bridge initialized; launcher SDL routing enabled"
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L210
            append(r2)     // Catch: java.lang.Throwable -> L210
            return r6
        L1f7:
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r1     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L210
            r6.<init>()     // Catch: java.lang.Throwable -> L210
            java.lang.StringBuilder r6 = r6.append(r7)     // Catch: java.lang.Throwable -> L210
            java.lang.String r2 = " Force SDL bridge not enabled: Android libSDL2.so was not found"
            java.lang.StringBuilder r6 = r6.append(r2)     // Catch: java.lang.Throwable -> L210
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L210
            append(r6)     // Catch: java.lang.Throwable -> L210
            return r1
        L210:
            r6 = move-exception
            net.kdt.pojavlaunch.MinecraftGLSurface.sdlEnabled = r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r7 = r2.append(r7)
            java.lang.String r2 = " Force SDL bridge not enabled: "
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.Class r2 = r6.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r7 = r7.append(r2)
            java.lang.StringBuilder r7 = r7.append(r0)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r6 = r6.toString()
            append(r6)
            return r1
    }

    private static void writeZipEntry(java.util.zip.ZipOutputStream r1, java.lang.String r2, byte[] r3) throws java.io.IOException {
            java.util.zip.ZipEntry r0 = new java.util.zip.ZipEntry
            r0.<init>(r2)
            r1.putNextEntry(r0)
            r1.write(r3)
            r1.closeEntry()
            return
    }
}
