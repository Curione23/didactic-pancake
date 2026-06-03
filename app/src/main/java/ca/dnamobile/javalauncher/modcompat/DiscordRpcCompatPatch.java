package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class DiscordRpcCompatPatch {
    private static final java.lang.String ASSET_ARM64_SO = "components/arm64-v8a/libdiscord-rpc.so";
    private static final int BUFFER_SIZE = 65536;
    private static final java.lang.String MARKER_ENTRY = "META-INF/javalauncher-discordrpc-arm64.txt";
    private static final java.lang.String TAG = "DiscordRpcCompatPatch";

    private DiscordRpcCompatPatch() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void apply(android.content.Context r8, ca.dnamobile.javalauncher.launcher.LaunchPlan r9) {
            boolean r0 = isArm64Device()
            if (r0 != 0) goto L7
            return
        L7:
            java.io.File r0 = new java.io.File
            java.io.File r9 = r9.getGameDirectory()
            java.lang.String r1 = "mods"
            r0.<init>(r9, r1)
            boolean r9 = r0.isDirectory()
            if (r9 != 0) goto L19
            return
        L19:
            java.io.File r8 = resolveAndroidArm64Library(r8)
            java.lang.String r9 = "DiscordRpcCompatPatch"
            if (r8 == 0) goto L67
            boolean r1 = r8.isFile()
            if (r1 != 0) goto L28
            goto L67
        L28:
            ca.dnamobile.javalauncher.modcompat.DiscordRpcCompatPatch$$ExternalSyntheticLambda0 r1 = new ca.dnamobile.javalauncher.modcompat.DiscordRpcCompatPatch$$ExternalSyntheticLambda0
            r1.<init>()
            java.io.File[] r0 = r0.listFiles(r1)
            if (r0 == 0) goto L66
            int r1 = r0.length
            if (r1 != 0) goto L37
            goto L66
        L37:
            java.lang.String r1 = sha1(r8)     // Catch: java.lang.Throwable -> L60
            int r2 = r0.length
            r3 = 0
        L3d:
            if (r3 >= r2) goto L5f
            r4 = r0[r3]
            patchJarIfNeeded(r4, r8, r1)     // Catch: java.lang.Throwable -> L45
            goto L5c
        L45:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Unable to patch DiscordRPC native inside "
            r6.<init>(r7)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r6.append(r4)
            java.lang.String r4 = r4.toString()
            ca.dnamobile.javalauncher.feature.log.Logging.e(r9, r4, r5)
        L5c:
            int r3 = r3 + 1
            goto L3d
        L5f:
            return
        L60:
            r8 = move-exception
            java.lang.String r0 = "Unable to hash Android DiscordRPC library"
            ca.dnamobile.javalauncher.feature.log.Logging.e(r9, r0, r8)
        L66:
            return
        L67:
            java.lang.String r8 = "No Android ARM64 libdiscord-rpc.so found; DiscordRPC mod patch skipped."
            ca.dnamobile.javalauncher.feature.log.Logging.i(r9, r8)
            return
    }

    private static void copy(java.io.InputStream r3, java.io.OutputStream r4) throws java.lang.Exception {
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
        L4:
            int r1 = r3.read(r0)
            r2 = -1
            if (r1 == r2) goto L10
            r2 = 0
            r4.write(r0, r2, r1)
            goto L4
        L10:
            return
    }

    private static void copyAssetIfNeeded(android.content.Context r4, java.lang.String r5, java.io.File r6) throws java.lang.Exception {
            boolean r0 = r6.isFile()
            if (r0 == 0) goto L11
            long r0 = r6.length()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L11
            return
        L11:
            java.io.File r0 = r6.getParentFile()
            if (r0 == 0) goto L3d
            boolean r1 = r0.exists()
            if (r1 != 0) goto L3d
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L24
            goto L3d
        L24:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unable to create folder: "
            r5.<init>(r6)
            java.lang.String r6 = r0.getAbsolutePath()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3d:
            android.content.res.AssetManager r4 = r4.getAssets()
            java.io.InputStream r4 = r4.open(r5)
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L68
            copy(r4, r5)     // Catch: java.lang.Throwable -> L5e
            r5.close()     // Catch: java.lang.Throwable -> L68
            if (r4 == 0) goto L55
            r4.close()
        L55:
            r4 = 1
            r5 = 0
            r6.setReadable(r4, r5)
            r6.setExecutable(r4, r5)
            return
        L5e:
            r6 = move-exception
            r5.close()     // Catch: java.lang.Throwable -> L63
            goto L67
        L63:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> L68
        L67:
            throw r6     // Catch: java.lang.Throwable -> L68
        L68:
            r5 = move-exception
            if (r4 == 0) goto L73
            r4.close()     // Catch: java.lang.Throwable -> L6f
            goto L73
        L6f:
            r4 = move-exception
            r5.addSuppressed(r4)
        L73:
            throw r5
    }

    private static void copyFile(java.io.File r2, java.io.File r3) throws java.lang.Exception {
            java.io.File r0 = r3.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to create folder: "
            r3.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L2c:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r2)
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4a
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4a
            copy(r0, r2)     // Catch: java.lang.Throwable -> L40
            r2.close()     // Catch: java.lang.Throwable -> L4a
            r0.close()
            return
        L40:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L45
            goto L49
        L45:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L4a
        L49:
            throw r3     // Catch: java.lang.Throwable -> L4a
        L4a:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r3 = move-exception
            r2.addSuppressed(r3)
        L53:
            throw r2
    }

    private static boolean isArm64Device() {
            java.lang.String[] r0 = android.os.Build.SUPPORTED_ABIS
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.length
            r3 = r1
        L8:
            if (r3 >= r2) goto L2b
            r4 = r0[r3]
            if (r4 != 0) goto Lf
            goto L26
        Lf:
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            java.lang.String r5 = "arm64"
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto L29
            java.lang.String r5 = "aarch64"
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L26
            goto L29
        L26:
            int r3 = r3 + 1
            goto L8
        L29:
            r0 = 1
            return r0
        L2b:
            return r1
    }

    private static boolean isDiscordRpcNativeEntry(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = normalizeZipName(r2)
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r1)
            java.lang.String r1 = "libdiscord-rpc.so"
            boolean r1 = r2.endsWith(r1)
            if (r1 != 0) goto L1e
            java.lang.String r1 = "/libdiscord-rpc.so"
            boolean r2 = r2.endsWith(r1)
            if (r2 == 0) goto L1f
        L1e:
            r0 = 1
        L1f:
            return r0
    }

    static /* synthetic */ boolean lambda$apply$0(java.io.File r0, java.lang.String r1) {
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

    private static java.lang.String normalizeZipName(java.lang.String r2) {
            r0 = 92
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            return r2
    }

    private static boolean patchJarIfNeeded(java.io.File r16, java.io.File r17, java.lang.String r18) throws java.lang.Exception {
            r0 = r16
            r1 = r18
            boolean r2 = r16.isFile()
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            java.util.zip.ZipFile r2 = new java.util.zip.ZipFile
            r2.<init>(r0)
            java.util.Enumeration r4 = r2.entries()     // Catch: java.lang.Throwable -> L1f9
            r5 = r3
        L16:
            boolean r6 = r4.hasMoreElements()     // Catch: java.lang.Throwable -> L1f9
            r7 = 1
            if (r6 == 0) goto L44
            java.lang.Object r6 = r4.nextElement()     // Catch: java.lang.Throwable -> L1f9
            java.util.zip.ZipEntry r6 = (java.util.zip.ZipEntry) r6     // Catch: java.lang.Throwable -> L1f9
            boolean r8 = r6.isDirectory()     // Catch: java.lang.Throwable -> L1f9
            if (r8 == 0) goto L2a
            goto L16
        L2a:
            java.lang.String r8 = r6.getName()     // Catch: java.lang.Throwable -> L1f9
            boolean r8 = isDiscordRpcNativeEntry(r8)     // Catch: java.lang.Throwable -> L1f9
            if (r8 != 0) goto L35
            goto L16
        L35:
            java.lang.String r5 = sha1(r2, r6)     // Catch: java.lang.Throwable -> L1f9
            boolean r5 = r1.equalsIgnoreCase(r5)     // Catch: java.lang.Throwable -> L1f9
            if (r5 != 0) goto L42
            r4 = r7
            r5 = r4
            goto L45
        L42:
            r5 = r7
            goto L16
        L44:
            r4 = r3
        L45:
            r2.close()
            if (r5 == 0) goto L1f8
            if (r4 != 0) goto L4e
            goto L1f8
        L4e:
            java.io.File r2 = new java.io.File
            java.io.File r4 = r16.getParentFile()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r16.getName()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r6 = ".discordrpc.tmp"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.<init>(r4, r5)
            java.io.File r4 = new java.io.File
            java.io.File r5 = r16.getParentFile()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r8 = r16.getName()
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r8 = ".before-discordrpc-patch"
            java.lang.StringBuilder r6 = r6.append(r8)
            java.lang.String r6 = r6.toString()
            r4.<init>(r5, r6)
            boolean r5 = r2.exists()
            if (r5 == 0) goto Lb4
            boolean r5 = r2.delete()
            if (r5 == 0) goto L9b
            goto Lb4
        L9b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to delete old temp jar: "
            r1.<init>(r3)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lb4:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.zip.ZipFile r6 = new java.util.zip.ZipFile
            r6.<init>(r0)
            java.util.zip.ZipOutputStream r8 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L1ec
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L1ec
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L1ec
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L1ec
            java.util.Enumeration r9 = r6.entries()     // Catch: java.lang.Throwable -> L1e0
            r10 = r3
        Lcd:
            boolean r11 = r9.hasMoreElements()     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r12 = "META-INF/javalauncher-discordrpc-arm64.txt"
            if (r11 == 0) goto L157
            java.lang.Object r11 = r9.nextElement()     // Catch: java.lang.Throwable -> L1e0
            java.util.zip.ZipEntry r11 = (java.util.zip.ZipEntry) r11     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r13 = r11.getName()     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r13 = normalizeZipName(r13)     // Catch: java.lang.Throwable -> L1e0
            boolean r14 = shouldSkipSignatureFile(r13)     // Catch: java.lang.Throwable -> L1e0
            if (r14 != 0) goto L153
            boolean r12 = r12.equals(r13)     // Catch: java.lang.Throwable -> L1e0
            if (r12 == 0) goto Lf1
            goto L153
        Lf1:
            boolean r12 = r5.add(r13)     // Catch: java.lang.Throwable -> L1e0
            if (r12 != 0) goto Lf8
            goto L153
        Lf8:
            java.util.zip.ZipEntry r12 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L1e0
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L1e0
            long r14 = r11.getTime()     // Catch: java.lang.Throwable -> L1e0
            r12.setTime(r14)     // Catch: java.lang.Throwable -> L1e0
            r8.putNextEntry(r12)     // Catch: java.lang.Throwable -> L1e0
            boolean r12 = r11.isDirectory()     // Catch: java.lang.Throwable -> L1e0
            if (r12 != 0) goto L14c
            boolean r12 = isDiscordRpcNativeEntry(r13)     // Catch: java.lang.Throwable -> L1e0
            if (r12 == 0) goto L12f
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1e0
            r12 = r17
            r11.<init>(r12)     // Catch: java.lang.Throwable -> L1e0
            copy(r11, r8)     // Catch: java.lang.Throwable -> L123
            r11.close()     // Catch: java.lang.Throwable -> L1e0
            int r10 = r10 + 1
            goto L14e
        L123:
            r0 = move-exception
            r1 = r0
            r11.close()     // Catch: java.lang.Throwable -> L129
            goto L12e
        L129:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L1e0
        L12e:
            throw r1     // Catch: java.lang.Throwable -> L1e0
        L12f:
            r12 = r17
            java.io.InputStream r11 = r6.getInputStream(r11)     // Catch: java.lang.Throwable -> L1e0
            copy(r11, r8)     // Catch: java.lang.Throwable -> L13e
            if (r11 == 0) goto L14e
            r11.close()     // Catch: java.lang.Throwable -> L1e0
            goto L14e
        L13e:
            r0 = move-exception
            r1 = r0
            if (r11 == 0) goto L14b
            r11.close()     // Catch: java.lang.Throwable -> L146
            goto L14b
        L146:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L1e0
        L14b:
            throw r1     // Catch: java.lang.Throwable -> L1e0
        L14c:
            r12 = r17
        L14e:
            r8.closeEntry()     // Catch: java.lang.Throwable -> L1e0
            goto Lcd
        L153:
            r12 = r17
            goto Lcd
        L157:
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L1e0
            r5.<init>(r12)     // Catch: java.lang.Throwable -> L1e0
            r8.putNextEntry(r5)     // Catch: java.lang.Throwable -> L1e0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e0
            r5.<init>()     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r9 = "Patched by JavaLauncher for Android ARM64 DiscordRPC compatibility.\nsourceSha1="
            java.lang.StringBuilder r5 = r5.append(r9)     // Catch: java.lang.Throwable -> L1e0
            java.lang.StringBuilder r1 = r5.append(r1)     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r5 = "\nreplacedEntries="
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L1e0
            java.lang.StringBuilder r1 = r1.append(r10)     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r5 = "\n"
            java.lang.StringBuilder r1 = r1.append(r5)     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L1e0
            java.lang.String r5 = "UTF-8"
            byte[] r1 = r1.getBytes(r5)     // Catch: java.lang.Throwable -> L1e0
            r8.write(r1)     // Catch: java.lang.Throwable -> L1e0
            r8.closeEntry()     // Catch: java.lang.Throwable -> L1e0
            r8.close()     // Catch: java.lang.Throwable -> L1ec
            r6.close()
            if (r10 > 0) goto L19a
            r2.delete()
            return r3
        L19a:
            boolean r1 = r4.isFile()
            if (r1 != 0) goto L1a3
            copyFile(r0, r4)
        L1a3:
            replaceFile(r2, r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Patched "
            r1.<init>(r2)
            java.lang.String r0 = r16.getName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = " with Android ARM64 libdiscord-rpc.so ("
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r1 = " entr"
            java.lang.StringBuilder r0 = r0.append(r1)
            if (r10 != r7) goto L1ca
            java.lang.String r1 = "y"
            goto L1cc
        L1ca:
            java.lang.String r1 = "ies"
        L1cc:
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ")."
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "DiscordRpcCompatPatch"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
            return r7
        L1e0:
            r0 = move-exception
            r1 = r0
            r8.close()     // Catch: java.lang.Throwable -> L1e6
            goto L1eb
        L1e6:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch: java.lang.Throwable -> L1ec
        L1eb:
            throw r1     // Catch: java.lang.Throwable -> L1ec
        L1ec:
            r0 = move-exception
            r1 = r0
            r6.close()     // Catch: java.lang.Throwable -> L1f2
            goto L1f7
        L1f2:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L1f7:
            throw r1
        L1f8:
            return r3
        L1f9:
            r0 = move-exception
            r1 = r0
            r2.close()     // Catch: java.lang.Throwable -> L1ff
            goto L204
        L1ff:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)
        L204:
            throw r1
    }

    private static void replaceFile(java.io.File r2, java.io.File r3) throws java.lang.Exception {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L26
            boolean r0 = r3.delete()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to replace "
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L26:
            boolean r0 = r2.renameTo(r3)
            if (r0 != 0) goto L32
            copyFile(r2, r3)
            r2.delete()
        L32:
            return
    }

    private static java.io.File resolveAndroidArm64Library(android.content.Context r5) {
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            r1 = 0
            if (r0 != 0) goto L9
            r0 = r1
            goto Lf
        L9:
            android.content.pm.ApplicationInfo r0 = r5.getApplicationInfo()
            java.lang.String r0 = r0.nativeLibraryDir
        Lf:
            java.lang.String r2 = "libdiscord-rpc.so"
            if (r0 == 0) goto L29
            java.lang.String r3 = r0.trim()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L29
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r2)
            boolean r0 = r3.isFile()
            if (r0 == 0) goto L29
            return r3
        L29:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L3e
            java.io.File r3 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_CACHE     // Catch: java.lang.Throwable -> L3e
            java.lang.String r4 = "discordrpc/android-arm64/libdiscord-rpc.so"
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r3 = "components/arm64-v8a/libdiscord-rpc.so"
            copyAssetIfNeeded(r5, r3, r0)     // Catch: java.lang.Throwable -> L3e
            boolean r5 = r0.isFile()     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L57
            return r0
        L3e:
            r5 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "DiscordRPC asset library not available: "
            r0.<init>(r3)
            java.lang.String r5 = r5.getMessage()
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "DiscordRpcCompatPatch"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r5)
        L57:
            java.lang.String r5 = ca.dnamobile.javalauncher.utils.path.PathManager.DIR_NATIVE_LIB
            if (r5 == 0) goto L71
            java.lang.String r0 = r5.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L71
            java.io.File r0 = new java.io.File
            r0.<init>(r5, r2)
            boolean r5 = r0.isFile()
            if (r5 == 0) goto L71
            return r0
        L71:
            return r1
    }

    private static java.lang.String sha1(java.io.File r1) throws java.lang.Exception {
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            java.lang.String r1 = sha1(r0)     // Catch: java.lang.Throwable -> Ld
            r0.close()
            return r1
        Ld:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r1.addSuppressed(r0)
        L16:
            throw r1
    }

    private static java.lang.String sha1(java.io.InputStream r6) throws java.lang.Exception {
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)
            r1 = 65536(0x10000, float:9.1835E-41)
            byte[] r1 = new byte[r1]
        La:
            int r2 = r6.read(r1)
            r3 = -1
            r4 = 0
            if (r2 == r3) goto L16
            r0.update(r1, r4, r2)
            goto La
        L16:
            byte[] r6 = r0.digest()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
        L23:
            if (r4 >= r1) goto L3f
            r2 = r6[r4]
            java.util.Locale r3 = java.util.Locale.ROOT
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r5 = "%02x"
            java.lang.String r2 = java.lang.String.format(r3, r5, r2)
            r0.append(r2)
            int r4 = r4 + 1
            goto L23
        L3f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    private static java.lang.String sha1(java.util.zip.ZipFile r0, java.util.zip.ZipEntry r1) throws java.lang.Exception {
            java.io.InputStream r0 = r0.getInputStream(r1)
            java.lang.String r1 = sha1(r0)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto Ld
            r0.close()
        Ld:
            return r1
        Le:
            r1 = move-exception
            if (r0 == 0) goto L19
            r0.close()     // Catch: java.lang.Throwable -> L15
            goto L19
        L15:
            r0 = move-exception
            r1.addSuppressed(r0)
        L19:
            throw r1
    }

    private static boolean shouldSkipSignatureFile(java.lang.String r1) {
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
}
