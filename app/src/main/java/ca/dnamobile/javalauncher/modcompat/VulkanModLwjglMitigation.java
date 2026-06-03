package ca.dnamobile.javalauncher.modcompat;

/* JADX INFO: loaded from: classes.dex */
public final class VulkanModLwjglMitigation {
    private static final java.lang.String LEGACY_MARKER_ENTRY = "META-INF/zalith/vulkanmod_lwjgl_override";
    private static final java.lang.String MARKER_ENTRY = "META-INF/javalauncher/vulkanmod_lwjgl_override";
    private static final java.lang.String TAG = "VulkanModLwjglMitigation";
    private static final java.lang.String WORK_DIR_NAME = ".javalauncher_patch";

    private VulkanModLwjglMitigation() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void appendBlankLogLine() {
            java.lang.String r0 = ""
            net.kdt.pojavlaunch.Logger.appendToLog(r0)     // Catch: java.lang.Throwable -> L6
            goto Lb
        L6:
            java.lang.String r1 = "VulkanModLwjglMitigation"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r1, r0)
        Lb:
            return
    }

    private static void appendLog(java.lang.String r1) {
            java.lang.String r0 = stripTrailingLineBreaks(r1)     // Catch: java.lang.Throwable -> L8
            net.kdt.pojavlaunch.Logger.appendToLog(r0)     // Catch: java.lang.Throwable -> L8
            goto Ld
        L8:
            java.lang.String r0 = "VulkanModLwjglMitigation"
            ca.dnamobile.javalauncher.feature.log.Logging.i(r0, r1)
        Ld:
            return
    }

    private static boolean containsBundledLwjglVulkan(java.io.File r3) throws java.io.IOException {
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r3)
            java.util.Enumeration r3 = r0.entries()     // Catch: java.lang.Throwable -> L43
        L9:
            boolean r1 = r3.hasMoreElements()     // Catch: java.lang.Throwable -> L43
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r3.nextElement()     // Catch: java.lang.Throwable -> L43
            java.util.zip.ZipEntry r1 = (java.util.zip.ZipEntry) r1     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = r1.getName()     // Catch: java.lang.Throwable -> L43
            boolean r2 = shouldStripBundledLwjglVulkan(r2)     // Catch: java.lang.Throwable -> L43
            if (r2 == 0) goto L9
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            r3.<init>()     // Catch: java.lang.Throwable -> L43
            java.lang.String r2 = "VulkanMod mitigation: found nested Vulkan jar entry "
            java.lang.StringBuilder r3 = r3.append(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r3 = r3.append(r1)     // Catch: java.lang.Throwable -> L43
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L43
            appendLog(r3)     // Catch: java.lang.Throwable -> L43
            r0.close()
            r3 = 1
            return r3
        L3e:
            r0.close()
            r3 = 0
            return r3
        L43:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L48
            goto L4c
        L48:
            r0 = move-exception
            r3.addSuppressed(r0)
        L4c:
            throw r3
    }

    private static void copyFile(java.io.File r3, java.io.File r4) throws java.io.IOException {
            java.io.File r0 = r4.getParentFile()
            if (r0 == 0) goto L2c
            boolean r1 = r0.exists()
            if (r1 != 0) goto L2c
            boolean r1 = r0.mkdirs()
            if (r1 == 0) goto L13
            goto L2c
        L13:
            java.io.IOException r3 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not create target directory: "
            r4.<init>(r1)
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L2c:
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r3)
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L57
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L57
            r4 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r4]     // Catch: java.lang.Throwable -> L4d
        L3a:
            int r1 = r0.read(r4)     // Catch: java.lang.Throwable -> L4d
            r2 = -1
            if (r1 == r2) goto L46
            r2 = 0
            r3.write(r4, r2, r1)     // Catch: java.lang.Throwable -> L4d
            goto L3a
        L46:
            r3.close()     // Catch: java.lang.Throwable -> L57
            r0.close()
            return
        L4d:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L52
            goto L56
        L52:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L57
        L56:
            throw r4     // Catch: java.lang.Throwable -> L57
        L57:
            r3 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r4 = move-exception
            r3.addSuppressed(r4)
        L60:
            throw r3
    }

    private static void deleteIfExists(java.io.File r2) {
            boolean r0 = r2.exists()
            if (r0 == 0) goto L24
            boolean r0 = r2.delete()
            if (r0 != 0) goto L24
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not delete temporary file: "
            r0.<init>(r1)
            java.lang.String r2 = r2.getAbsolutePath()
            java.lang.StringBuilder r2 = r0.append(r2)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = "VulkanModLwjglMitigation"
            android.util.Log.w(r0, r2)
        L24:
            return
    }

    private static java.io.File findMinecraftRoot(java.io.File r2) {
        L0:
            if (r2 == 0) goto L14
            java.lang.String r0 = ".minecraft"
            java.lang.String r1 = r2.getName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            return r2
        Lf:
            java.io.File r2 = r2.getParentFile()
            goto L0
        L14:
            r2 = 0
            return r2
    }

    private static java.util.List<java.io.File> getCandidateModsDirs(java.io.File r4) {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "mods"
            r1.<init>(r4, r2)
            r0.add(r1)
            java.io.File r1 = r4.getParentFile()
            if (r1 == 0) goto L1d
            java.io.File r3 = new java.io.File
            r3.<init>(r1, r2)
            r0.add(r3)
        L1d:
            java.io.File r4 = findMinecraftRoot(r4)
            if (r4 == 0) goto L2b
            java.io.File r1 = new java.io.File
            r1.<init>(r4, r2)
            r0.add(r1)
        L2b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            return r4
    }

    private static boolean isAlreadyPatched(java.io.File r1) throws java.io.IOException {
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile
            r0.<init>(r1)
            java.lang.String r1 = "META-INF/javalauncher/vulkanmod_lwjgl_override"
            java.util.zip.ZipEntry r1 = r0.getEntry(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 != 0) goto L18
            java.lang.String r1 = "META-INF/zalith/vulkanmod_lwjgl_override"
            java.util.zip.ZipEntry r1 = r0.getEntry(r1)     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L16
            goto L18
        L16:
            r1 = 0
            goto L19
        L18:
            r1 = 1
        L19:
            r0.close()
            return r1
        L1d:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L22
            goto L26
        L22:
            r0 = move-exception
            r1.addSuppressed(r0)
        L26:
            throw r1
    }

    static /* synthetic */ boolean lambda$prepare$0(java.io.File r1) {
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

    private static void patchVulkanModJar(java.io.File r13) throws java.io.IOException {
            java.io.File r0 = r13.getParentFile()
            if (r0 == 0) goto L236
            java.io.File r1 = new java.io.File
            java.lang.String r2 = ".javalauncher_patch"
            r1.<init>(r0, r2)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L33
            boolean r0 = r1.mkdirs()
            if (r0 == 0) goto L1a
            goto L33
        L1a:
            java.io.IOException r13 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not create mitigation work directory: "
            r0.<init>(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r13.<init>(r0)
            throw r13
        L33:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r13.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ".backup"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = r13.getName()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ".tmp"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r1, r3)
            deleteIfExists(r0)
            deleteIfExists(r2)
            copyFile(r13, r0)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "VulkanMod mitigation: created backup beside mod jar "
            r3.<init>(r4)
            java.lang.String r4 = r0.getAbsolutePath()
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            appendLog(r3)
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile
            r3.<init>(r13)
            java.util.zip.ZipOutputStream r4 = new java.util.zip.ZipOutputStream     // Catch: java.lang.Throwable -> L22c
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L22c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L22c
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L22c
            java.util.Enumeration r5 = r3.entries()     // Catch: java.lang.Throwable -> L222
            r6 = 8192(0x2000, float:1.148E-41)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L222
            r7 = 0
            r8 = r7
        La3:
            boolean r9 = r5.hasMoreElements()     // Catch: java.lang.Throwable -> L222
            r10 = 1
            if (r9 == 0) goto L147
            java.lang.Object r9 = r5.nextElement()     // Catch: java.lang.Throwable -> L222
            java.util.zip.ZipEntry r9 = (java.util.zip.ZipEntry) r9     // Catch: java.lang.Throwable -> L222
            java.lang.String r11 = r9.getName()     // Catch: java.lang.Throwable -> L222
            boolean r12 = shouldStripBundledLwjglVulkan(r11)     // Catch: java.lang.Throwable -> L222
            if (r12 == 0) goto Lea
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L222
            r8.<init>()     // Catch: java.lang.Throwable -> L222
            java.lang.String r9 = "VulkanMod mitigation: stripping nested entry "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L222
            java.lang.StringBuilder r8 = r8.append(r11)     // Catch: java.lang.Throwable -> L222
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L222
            appendLog(r8)     // Catch: java.lang.Throwable -> L222
            java.lang.String r8 = "VulkanModLwjglMitigation"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L222
            r9.<init>()     // Catch: java.lang.Throwable -> L222
            java.lang.String r12 = "Stripping nested Vulkan LWJGL jar entry: "
            java.lang.StringBuilder r9 = r9.append(r12)     // Catch: java.lang.Throwable -> L222
            java.lang.StringBuilder r9 = r9.append(r11)     // Catch: java.lang.Throwable -> L222
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L222
            android.util.Log.i(r8, r9)     // Catch: java.lang.Throwable -> L222
            r8 = r10
            goto La3
        Lea:
            java.util.zip.ZipEntry r10 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L222
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L222
            int r11 = r9.getMethod()     // Catch: java.lang.Throwable -> L222
            r10.setMethod(r11)     // Catch: java.lang.Throwable -> L222
            int r11 = r9.getMethod()     // Catch: java.lang.Throwable -> L222
            if (r11 != 0) goto L111
            long r11 = r9.getSize()     // Catch: java.lang.Throwable -> L222
            r10.setSize(r11)     // Catch: java.lang.Throwable -> L222
            long r11 = r9.getCompressedSize()     // Catch: java.lang.Throwable -> L222
            r10.setCompressedSize(r11)     // Catch: java.lang.Throwable -> L222
            long r11 = r9.getCrc()     // Catch: java.lang.Throwable -> L222
            r10.setCrc(r11)     // Catch: java.lang.Throwable -> L222
        L111:
            long r11 = r9.getTime()     // Catch: java.lang.Throwable -> L222
            r10.setTime(r11)     // Catch: java.lang.Throwable -> L222
            r4.putNextEntry(r10)     // Catch: java.lang.Throwable -> L222
            boolean r10 = r9.isDirectory()     // Catch: java.lang.Throwable -> L222
            if (r10 != 0) goto L142
            java.io.InputStream r9 = r3.getInputStream(r9)     // Catch: java.lang.Throwable -> L222
        L125:
            int r10 = r9.read(r6)     // Catch: java.lang.Throwable -> L136
            r11 = -1
            if (r10 == r11) goto L130
            r4.write(r6, r7, r10)     // Catch: java.lang.Throwable -> L136
            goto L125
        L130:
            if (r9 == 0) goto L142
            r9.close()     // Catch: java.lang.Throwable -> L222
            goto L142
        L136:
            r13 = move-exception
            if (r9 == 0) goto L141
            r9.close()     // Catch: java.lang.Throwable -> L13d
            goto L141
        L13d:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.lang.Throwable -> L222
        L141:
            throw r13     // Catch: java.lang.Throwable -> L222
        L142:
            r4.closeEntry()     // Catch: java.lang.Throwable -> L222
            goto La3
        L147:
            if (r8 == 0) goto L161
            java.util.zip.ZipEntry r5 = new java.util.zip.ZipEntry     // Catch: java.lang.Throwable -> L222
            java.lang.String r6 = "META-INF/javalauncher/vulkanmod_lwjgl_override"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L222
            r4.putNextEntry(r5)     // Catch: java.lang.Throwable -> L222
            java.lang.String r5 = "patched"
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8     // Catch: java.lang.Throwable -> L222
            byte[] r5 = r5.getBytes(r6)     // Catch: java.lang.Throwable -> L222
            r4.write(r5)     // Catch: java.lang.Throwable -> L222
            r4.closeEntry()     // Catch: java.lang.Throwable -> L222
        L161:
            r4.close()     // Catch: java.lang.Throwable -> L22c
            r3.close()
            if (r8 != 0) goto L175
            deleteIfExists(r2)
            deleteIfExists(r0)
            java.lang.String r13 = "VulkanMod mitigation: nothing stripped, leaving original jar untouched"
            appendLog(r13)
            return
        L175:
            java.io.File r3 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r13.getName()
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r5 = ".original"
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r1, r4)
            deleteIfExists(r3)
            boolean r1 = r13.exists()
            if (r1 == 0) goto L1c9
            boolean r1 = r13.renameTo(r3)
            if (r1 != 0) goto L1c9
            copyFile(r13, r3)
            boolean r1 = r13.delete()
            if (r1 == 0) goto L1aa
            goto L1c9
        L1aa:
            deleteIfExists(r2)
            restoreOriginalJar(r0, r13)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not move original VulkanMod jar aside: "
            r1.<init>(r2)
            java.lang.String r13 = r13.getAbsolutePath()
            java.lang.StringBuilder r13 = r1.append(r13)
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L1c9:
            boolean r1 = r2.renameTo(r13)
            if (r1 != 0) goto L1e4
            copyFile(r2, r13)
            boolean r1 = r13.exists()
            if (r1 == 0) goto L1e3
            long r4 = r13.length()
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 <= 0) goto L1e3
            r7 = r10
        L1e3:
            r1 = r7
        L1e4:
            if (r1 == 0) goto L206
            deleteIfExists(r3)
            deleteIfExists(r0)
            deleteIfExists(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VulkanMod mitigation: cleaned temporary files for "
            r0.<init>(r1)
            java.lang.String r13 = r13.getName()
            java.lang.StringBuilder r13 = r0.append(r13)
            java.lang.String r13 = r13.toString()
            appendLog(r13)
            return
        L206:
            restoreOriginalJar(r0, r13)
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not replace VulkanMod jar with patched copy: "
            r1.<init>(r2)
            java.lang.String r13 = r13.getAbsolutePath()
            java.lang.StringBuilder r13 = r1.append(r13)
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
        L222:
            r13 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L227
            goto L22b
        L227:
            r0 = move-exception
            r13.addSuppressed(r0)     // Catch: java.lang.Throwable -> L22c
        L22b:
            throw r13     // Catch: java.lang.Throwable -> L22c
        L22c:
            r13 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L231
            goto L235
        L231:
            r0 = move-exception
            r13.addSuppressed(r0)
        L235:
            throw r13
        L236:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Could not resolve VulkanMod jar parent directory: "
            r1.<init>(r2)
            java.lang.String r13 = r13.getAbsolutePath()
            java.lang.StringBuilder r13 = r1.append(r13)
            java.lang.String r13 = r13.toString()
            r0.<init>(r13)
            throw r0
    }

    public static void prepare(java.io.File r10) {
            java.lang.String r0 = "VulkanMod mitigation: finished"
            java.lang.String r1 = "VulkanModLwjglMitigation"
            if (r10 != 0) goto L7
            return
        L7:
            appendBlankLogLine()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "VulkanMod mitigation: about to run on "
            r2.<init>(r3)
            java.lang.String r3 = r10.getAbsolutePath()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            appendLog(r2)
            java.util.List r10 = getCandidateModsDirs(r10)     // Catch: java.lang.Throwable -> L1a2
            java.util.Iterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> L1a2
            r2 = 0
            r3 = r2
        L2a:
            boolean r4 = r10.hasNext()     // Catch: java.lang.Throwable -> L1a2
            if (r4 == 0) goto L194
            java.lang.Object r4 = r10.next()     // Catch: java.lang.Throwable -> L1a2
            java.io.File r4 = (java.io.File) r4     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a2
            r5.<init>()     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r6 = "VulkanMod mitigation: scanning "
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r6 = r4.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r6 = " exists="
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L1a2
            boolean r6 = r4.exists()     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L1a2
            appendLog(r5)     // Catch: java.lang.Throwable -> L1a2
            ca.dnamobile.javalauncher.modcompat.VulkanModLwjglMitigation$$ExternalSyntheticLambda0 r5 = new ca.dnamobile.javalauncher.modcompat.VulkanModLwjglMitigation$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L1a2
            r5.<init>()     // Catch: java.lang.Throwable -> L1a2
            java.io.File[] r4 = r4.listFiles(r5)     // Catch: java.lang.Throwable -> L1a2
            if (r4 == 0) goto L2a
            int r5 = r4.length     // Catch: java.lang.Throwable -> L1a2
            if (r5 != 0) goto L6d
            goto L2a
        L6d:
            int r5 = r4.length     // Catch: java.lang.Throwable -> L1a2
            r6 = r2
        L6f:
            if (r6 >= r5) goto L2a
            r7 = r4[r6]     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L1a2
            java.util.Locale r9 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r8 = r8.toLowerCase(r9)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r9 = "vulkanmod"
            boolean r8 = r8.contains(r9)     // Catch: java.lang.Throwable -> L1a2
            if (r8 != 0) goto L87
            goto L190
        L87:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a2
            r3.<init>()     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r8 = "VulkanMod mitigation: found mod jar "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r8 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1a2
            appendLog(r3)     // Catch: java.lang.Throwable -> L1a2
            boolean r3 = containsBundledLwjglVulkan(r7)     // Catch: java.lang.Throwable -> L150
            if (r3 != 0) goto Ldd
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L150
            r3.<init>()     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = "VulkanMod mitigation: no bundled lwjgl-vulkan nested jar in "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L150
            appendLog(r3)     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L150
            r3.<init>()     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = "VulkanMod found but no bundled lwjgl-vulkan nested jar was detected: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L150
            android.util.Log.i(r1, r3)     // Catch: java.lang.Throwable -> L150
            goto L18f
        Ldd:
            boolean r3 = isAlreadyPatched(r7)     // Catch: java.lang.Throwable -> L150
            if (r3 == 0) goto L118
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L150
            r3.<init>()     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = "VulkanMod mitigation: already patched "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L150
            appendLog(r3)     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L150
            r3.<init>()     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = "VulkanMod already patched: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = r7.getName()     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L150
            android.util.Log.i(r1, r3)     // Catch: java.lang.Throwable -> L150
            goto L18f
        L118:
            patchVulkanModJar(r7)     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L150
            r3.<init>()     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = "VulkanMod mitigation: patched successfully "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L150
            appendLog(r3)     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L150
            r3.<init>()     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = "Patched VulkanMod to strip bundled lwjgl-vulkan: "
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r8 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L150
            java.lang.StringBuilder r3 = r3.append(r8)     // Catch: java.lang.Throwable -> L150
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L150
            android.util.Log.i(r1, r3)     // Catch: java.lang.Throwable -> L150
            goto L18f
        L150:
            r3 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a2
            r8.<init>()     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r9 = "VulkanMod mitigation: failed for "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r9 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r9 = ": "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r8 = r8.append(r3)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L1a2
            appendLog(r8)     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a2
            r8.<init>()     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r9 = "Failed to patch VulkanMod jar: "
            java.lang.StringBuilder r8 = r8.append(r9)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L1a2
            java.lang.StringBuilder r7 = r8.append(r7)     // Catch: java.lang.Throwable -> L1a2
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L1a2
            android.util.Log.e(r1, r7, r3)     // Catch: java.lang.Throwable -> L1a2
        L18f:
            r3 = 1
        L190:
            int r6 = r6 + 1
            goto L6f
        L194:
            if (r3 != 0) goto L19b
            java.lang.String r10 = "VulkanMod mitigation: no VulkanMod jar found in candidate mod directories"
            appendLog(r10)     // Catch: java.lang.Throwable -> L1a2
        L19b:
            appendLog(r0)
            appendBlankLogLine()
            return
        L1a2:
            r10 = move-exception
            appendLog(r0)
            appendBlankLogLine()
            throw r10
    }

    private static void restoreOriginalJar(java.io.File r2, java.io.File r3) throws java.io.IOException {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L26
            boolean r0 = r3.delete()
            if (r0 == 0) goto Ld
            goto L26
        Ld:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Could not delete failed patched jar: "
            r0.<init>(r1)
            java.lang.String r3 = r3.getAbsolutePath()
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L26:
            copyFile(r2, r3)
            return
    }

    private static boolean shouldStripBundledLwjglVulkan(java.lang.String r2) {
            r0 = 92
            r1 = 47
            java.lang.String r2 = r2.replace(r0, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            int r0 = r2.lastIndexOf(r1)
            r1 = 1
            if (r0 < 0) goto L1a
            int r0 = r0 + r1
            java.lang.String r2 = r2.substring(r0)
        L1a:
            java.lang.String r0 = ".jar"
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L33
            java.lang.String r0 = "lwjgl"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L33
            java.lang.String r0 = "vulkan"
            boolean r2 = r2.contains(r0)
            if (r2 == 0) goto L33
            goto L34
        L33:
            r1 = 0
        L34:
            return r1
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
}
